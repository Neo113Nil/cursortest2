package org.bouncycastle.cert.dane.fetcher;

/* loaded from: classes17.dex */
public class JndiDANEFetcherFactory implements org.bouncycastle.cert.dane.DANEEntryFetcherFactory {
    private java.util.List Camera2StreamConfigurationMap = new java.util.ArrayList();
    private boolean getHighResolutionOutputSizeshNQ4ISI;

    static /* synthetic */ void getHighSpeedVideoSizes(java.util.List list, java.lang.String str, javax.naming.directory.Attribute attribute) throws javax.naming.NamingException, org.bouncycastle.cert.dane.DANEException {
        for (int i = 0; i != attribute.size(); i++) {
            byte[] bArr = (byte[]) attribute.get(i);
            if (org.bouncycastle.cert.dane.DANEEntry.isValidCertificate(bArr)) {
                try {
                    list.add(new org.bouncycastle.cert.dane.DANEEntry(str, bArr));
                } catch (java.io.IOException e) {
                    java.lang.StringBuilder sb = new java.lang.StringBuilder("Exception parsing entry: ");
                    sb.append(e.getMessage());
                    throw new org.bouncycastle.cert.dane.DANEException(sb.toString(), e);
                }
            }
        }
    }

    public org.bouncycastle.cert.dane.fetcher.JndiDANEFetcherFactory usingDNSServer(java.lang.String str) {
        this.Camera2StreamConfigurationMap.add(str);
        return this;
    }

    public org.bouncycastle.cert.dane.fetcher.JndiDANEFetcherFactory setAuthoritative(boolean z) {
        this.getHighResolutionOutputSizeshNQ4ISI = z;
        return this;
    }

    @Override // org.bouncycastle.cert.dane.DANEEntryFetcherFactory
    public org.bouncycastle.cert.dane.DANEEntryFetcher build(final java.lang.String str) {
        final java.util.Hashtable hashtable = new java.util.Hashtable();
        hashtable.put("java.naming.factory.initial", "com.sun.jndi.dns.DnsContextFactory");
        hashtable.put("java.naming.authoritative", this.getHighResolutionOutputSizeshNQ4ISI ? "true" : "false");
        if (this.Camera2StreamConfigurationMap.size() > 0) {
            java.lang.StringBuffer stringBuffer = new java.lang.StringBuffer();
            java.util.Iterator it = this.Camera2StreamConfigurationMap.iterator();
            while (it.hasNext()) {
                if (stringBuffer.length() > 0) {
                    stringBuffer.append(" ");
                }
                java.lang.StringBuilder sb = new java.lang.StringBuilder("dns://");
                sb.append(it.next());
                stringBuffer.append(sb.toString());
            }
            hashtable.put("java.naming.provider.url", stringBuffer.toString());
        }
        return new org.bouncycastle.cert.dane.DANEEntryFetcher() { // from class: org.bouncycastle.cert.dane.fetcher.JndiDANEFetcherFactory.1
            @Override // org.bouncycastle.cert.dane.DANEEntryFetcher
            public java.util.List getEntries() throws org.bouncycastle.cert.dane.DANEException {
                java.util.ArrayList arrayList = new java.util.ArrayList();
                try {
                    javax.naming.directory.InitialDirContext initialDirContext = new javax.naming.directory.InitialDirContext(hashtable);
                    if (str.indexOf("_smimecert.") > 0) {
                        javax.naming.directory.Attribute attribute = initialDirContext.getAttributes(str, new java.lang.String[]{"53"}).get("53");
                        if (attribute != null) {
                            org.bouncycastle.cert.dane.fetcher.JndiDANEFetcherFactory.getHighSpeedVideoSizes(arrayList, str, attribute);
                            return arrayList;
                        }
                    } else {
                        java.lang.StringBuilder sb2 = new java.lang.StringBuilder("_smimecert.");
                        sb2.append(str);
                        javax.naming.NamingEnumeration listBindings = initialDirContext.listBindings(sb2.toString());
                        while (listBindings.hasMore()) {
                            javax.naming.directory.DirContext dirContext = (javax.naming.directory.DirContext) ((javax.naming.Binding) listBindings.next()).getObject();
                            javax.naming.directory.Attribute attribute2 = initialDirContext.getAttributes(dirContext.getNameInNamespace().substring(1, dirContext.getNameInNamespace().length() - 1), new java.lang.String[]{"53"}).get("53");
                            if (attribute2 != null) {
                                java.lang.String nameInNamespace = dirContext.getNameInNamespace();
                                org.bouncycastle.cert.dane.fetcher.JndiDANEFetcherFactory.getHighSpeedVideoSizes(arrayList, nameInNamespace.substring(1, nameInNamespace.length() - 1), attribute2);
                            }
                        }
                    }
                    return arrayList;
                } catch (javax.naming.NamingException e) {
                    java.lang.StringBuilder sb3 = new java.lang.StringBuilder("Exception dealing with DNS: ");
                    sb3.append(e.getMessage());
                    throw new org.bouncycastle.cert.dane.DANEException(sb3.toString(), e);
                }
            }
        };
    }
}
