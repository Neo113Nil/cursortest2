package org.bouncycastle.jce.provider;

/* loaded from: classes17.dex */
class CrlCache {
    private static java.util.Map<java.net.URI, java.lang.ref.WeakReference<org.bouncycastle.jcajce.PKIXCRLStore>> getHighSpeedVideoFpsRanges = java.util.Collections.synchronizedMap(new java.util.WeakHashMap());

    static org.bouncycastle.jcajce.PKIXCRLStore getHighSpeedVideoFpsRanges(java.security.cert.CertificateFactory certificateFactory, java.util.Date date, java.net.URI uri) throws java.io.IOException, java.security.cert.CRLException {
        java.util.Collection<? extends java.security.cert.CRL> generateCRLs;
        synchronized (org.bouncycastle.jce.provider.CrlCache.class) {
            java.lang.ref.WeakReference<org.bouncycastle.jcajce.PKIXCRLStore> weakReference = getHighSpeedVideoFpsRanges.get(uri);
            org.bouncycastle.jcajce.PKIXCRLStore pKIXCRLStore = weakReference != null ? weakReference.get() : null;
            if (pKIXCRLStore != null) {
                java.util.Iterator it = pKIXCRLStore.getMatches(null).iterator();
                while (it.hasNext()) {
                    java.util.Date nextUpdate = ((java.security.cert.X509CRL) it.next()).getNextUpdate();
                    if (nextUpdate == null || !nextUpdate.before(date)) {
                    }
                }
                return pKIXCRLStore;
            }
            if (uri.getScheme().equals("ldap")) {
                generateCRLs = getHighSpeedVideoFpsRangesFor(certificateFactory, uri);
            } else {
                java.net.HttpURLConnection httpURLConnection = (java.net.HttpURLConnection) uri.toURL().openConnection();
                httpURLConnection.setConnectTimeout(15000);
                httpURLConnection.setReadTimeout(15000);
                java.io.InputStream inputStream = httpURLConnection.getInputStream();
                generateCRLs = certificateFactory.generateCRLs(inputStream);
                inputStream.close();
            }
            org.bouncycastle.jce.provider.CrlCache.LocalCRLStore localCRLStore = new org.bouncycastle.jce.provider.CrlCache.LocalCRLStore(new org.bouncycastle.util.CollectionStore(generateCRLs));
            getHighSpeedVideoFpsRanges.put(uri, new java.lang.ref.WeakReference<>(localCRLStore));
            return localCRLStore;
        }
    }

    static class LocalCRLStore<T extends java.security.cert.CRL> implements org.bouncycastle.jcajce.PKIXCRLStore, org.bouncycastle.util.Iterable<java.security.cert.CRL> {
        private java.util.Collection<java.security.cert.CRL> getHighSpeedVideoFpsRangesFor;

        @Override // org.bouncycastle.util.Iterable, java.lang.Iterable
        public java.util.Iterator<java.security.cert.CRL> iterator() {
            return getMatches(null).iterator();
        }

        @Override // org.bouncycastle.jcajce.PKIXCRLStore, org.bouncycastle.util.Store
        public java.util.Collection getMatches(org.bouncycastle.util.Selector selector) {
            if (selector == null) {
                return new java.util.ArrayList(this.getHighSpeedVideoFpsRangesFor);
            }
            java.util.ArrayList arrayList = new java.util.ArrayList();
            for (java.security.cert.CRL crl : this.getHighSpeedVideoFpsRangesFor) {
                if (selector.match(crl)) {
                    arrayList.add(crl);
                }
            }
            return arrayList;
        }

        public LocalCRLStore(org.bouncycastle.util.Store<java.security.cert.CRL> store) {
            this.getHighSpeedVideoFpsRangesFor = new java.util.ArrayList(store.getMatches(null));
        }
    }

    private static java.util.Collection getHighSpeedVideoFpsRangesFor(java.security.cert.CertificateFactory certificateFactory, java.net.URI uri) throws java.io.IOException, java.security.cert.CRLException {
        java.util.Hashtable hashtable = new java.util.Hashtable();
        hashtable.put("java.naming.factory.initial", "com.sun.jndi.ldap.LdapCtxFactory");
        hashtable.put("java.naming.provider.url", uri.toString());
        try {
            java.util.Hashtable hashtable2 = hashtable;
            byte[] bArr = (byte[]) new javax.naming.directory.InitialDirContext(hashtable).getAttributes("").get("certificateRevocationList;binary").get();
            if (bArr == null || bArr.length == 0) {
                throw new java.security.cert.CRLException("no CRL returned from: ".concat(java.lang.String.valueOf(uri)));
            }
            return certificateFactory.generateCRLs(new java.io.ByteArrayInputStream(bArr));
        } catch (javax.naming.NamingException e) {
            java.lang.StringBuilder sb = new java.lang.StringBuilder("issue connecting to: ");
            sb.append(uri.toString());
            throw new java.security.cert.CRLException(sb.toString(), e);
        }
    }

    CrlCache() {
    }
}
