package org.bouncycastle.jce.provider;

/* loaded from: classes17.dex */
public class X509LDAPCertStoreSpi extends java.security.cert.CertStoreSpi {
    private static java.lang.String getHighSpeedVideoFpsRangesFor = "com.sun.jndi.ldap.LdapCtxFactory";
    private static java.lang.String getHighSpeedVideoSizes = "ignore";
    private org.bouncycastle.jce.X509LDAPCertStoreParameters getHighSpeedVideoFpsRanges;

    private java.util.Set getHighSpeedVideoSizes(java.lang.String str, java.lang.String str2, java.lang.String[] strArr) throws java.security.cert.CertStoreException {
        javax.naming.directory.DirContext initialDirContext;
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append(str);
        sb.append("=");
        sb.append(str2);
        java.lang.String obj = sb.toString();
        javax.naming.directory.DirContext dirContext = null;
        if (str == null) {
            obj = null;
        }
        java.util.HashSet hashSet = new java.util.HashSet();
        try {
            try {
                java.util.Properties properties = new java.util.Properties();
                properties.setProperty("java.naming.factory.initial", getHighSpeedVideoFpsRangesFor);
                properties.setProperty("java.naming.batchsize", "0");
                properties.setProperty("java.naming.provider.url", this.getHighSpeedVideoFpsRanges.getLdapURL());
                properties.setProperty("java.naming.factory.url.pkgs", "com.sun.jndi.url");
                properties.setProperty("java.naming.referral", getHighSpeedVideoSizes);
                properties.setProperty("java.naming.security.authentication", "none");
                initialDirContext = new javax.naming.directory.InitialDirContext(properties);
            } catch (java.lang.Exception e) {
                e = e;
            }
        } catch (java.lang.Throwable th) {
            th = th;
        }
        try {
            javax.naming.directory.SearchControls searchControls = new javax.naming.directory.SearchControls();
            searchControls.setSearchScope(2);
            searchControls.setCountLimit(0L);
            for (java.lang.String str3 : strArr) {
                java.lang.String[] strArr2 = {str3};
                searchControls.setReturningAttributes(strArr2);
                java.lang.StringBuilder sb2 = new java.lang.StringBuilder();
                sb2.append("(&(");
                sb2.append(obj);
                sb2.append(")(");
                sb2.append(strArr2[0]);
                sb2.append("=*))");
                java.lang.String obj2 = sb2.toString();
                if (obj == null) {
                    java.lang.StringBuilder sb3 = new java.lang.StringBuilder();
                    sb3.append("(");
                    sb3.append(strArr2[0]);
                    sb3.append("=*)");
                    obj2 = sb3.toString();
                }
                javax.naming.NamingEnumeration search = initialDirContext.search(this.getHighSpeedVideoFpsRanges.getBaseDN(), obj2, searchControls);
                while (search.hasMoreElements()) {
                    javax.naming.NamingEnumeration all = ((javax.naming.directory.Attribute) ((javax.naming.directory.SearchResult) search.next()).getAttributes().getAll().next()).getAll();
                    while (all.hasMore()) {
                        hashSet.add(all.next());
                    }
                }
            }
            try {
                initialDirContext.close();
            } catch (java.lang.Exception unused) {
            }
            return hashSet;
        } catch (java.lang.Exception e2) {
            e = e2;
            dirContext = initialDirContext;
            java.lang.StringBuilder sb4 = new java.lang.StringBuilder();
            sb4.append("Error getting results from LDAP directory ");
            sb4.append(e);
            throw new java.security.cert.CertStoreException(sb4.toString());
        } catch (java.lang.Throwable th2) {
            th = th2;
            dirContext = initialDirContext;
            if (dirContext != null) {
                try {
                    dirContext.close();
                } catch (java.lang.Exception unused2) {
                }
            }
            throw th;
        }
    }

    @Override // java.security.cert.CertStoreSpi
    public java.util.Collection engineGetCertificates(java.security.cert.CertSelector certSelector) throws java.security.cert.CertStoreException {
        if (!(certSelector instanceof java.security.cert.X509CertSelector)) {
            throw new java.security.cert.CertStoreException("selector is not a X509CertSelector");
        }
        java.security.cert.X509CertSelector x509CertSelector = (java.security.cert.X509CertSelector) certSelector;
        java.util.HashSet hashSet = new java.util.HashSet();
        java.util.Set<byte[]> highSpeedVideoFpsRanges = getHighSpeedVideoFpsRanges(x509CertSelector, new java.lang.String[]{this.getHighSpeedVideoFpsRanges.getUserCertificateAttribute()}, this.getHighSpeedVideoFpsRanges.getLdapUserCertificateAttributeName(), this.getHighSpeedVideoFpsRanges.getUserCertificateSubjectAttributeName());
        java.lang.String[] strArr = {this.getHighSpeedVideoFpsRanges.getCACertificateAttribute()};
        java.util.Set highSpeedVideoFpsRanges2 = getHighSpeedVideoFpsRanges(x509CertSelector, strArr, this.getHighSpeedVideoFpsRanges.getLdapCACertificateAttributeName(), this.getHighSpeedVideoFpsRanges.getCACertificateSubjectAttributeName());
        if (highSpeedVideoFpsRanges2.isEmpty()) {
            highSpeedVideoFpsRanges2.addAll(getHighSpeedVideoSizes(null, "*", strArr));
        }
        highSpeedVideoFpsRanges.addAll(highSpeedVideoFpsRanges2);
        java.lang.String[] strArr2 = {this.getHighSpeedVideoFpsRanges.getCrossCertificateAttribute()};
        java.util.Set highSpeedVideoFpsRanges3 = getHighSpeedVideoFpsRanges(x509CertSelector, strArr2, this.getHighSpeedVideoFpsRanges.getLdapCrossCertificateAttributeName(), this.getHighSpeedVideoFpsRanges.getCrossCertificateSubjectAttributeName());
        if (highSpeedVideoFpsRanges3.isEmpty()) {
            highSpeedVideoFpsRanges3.addAll(getHighSpeedVideoSizes(null, "*", strArr2));
        }
        highSpeedVideoFpsRanges.addAll(highSpeedVideoFpsRanges3);
        try {
            java.security.cert.CertificateFactory certificateFactory = java.security.cert.CertificateFactory.getInstance("X.509", org.bouncycastle.jce.provider.BouncyCastleProvider.PROVIDER_NAME);
            for (byte[] bArr : highSpeedVideoFpsRanges) {
                if (bArr != null && bArr.length != 0) {
                    java.util.ArrayList arrayList = new java.util.ArrayList();
                    arrayList.add(bArr);
                    try {
                        org.bouncycastle.asn1.x509.CertificatePair certificatePair = org.bouncycastle.asn1.x509.CertificatePair.getInstance(new org.bouncycastle.asn1.ASN1InputStream(bArr).readObject());
                        arrayList.clear();
                        if (certificatePair.getForward() != null) {
                            arrayList.add(certificatePair.getForward().getEncoded());
                        }
                        if (certificatePair.getReverse() != null) {
                            arrayList.add(certificatePair.getReverse().getEncoded());
                        }
                    } catch (java.io.IOException | java.lang.IllegalArgumentException unused) {
                    }
                    java.util.Iterator it = arrayList.iterator();
                    while (it.hasNext()) {
                        try {
                            java.security.cert.Certificate generateCertificate = certificateFactory.generateCertificate(new java.io.ByteArrayInputStream((byte[]) it.next()));
                            if (x509CertSelector.match(generateCertificate)) {
                                hashSet.add(generateCertificate);
                            }
                        } catch (java.lang.Exception unused2) {
                        }
                    }
                }
            }
            return hashSet;
        } catch (java.lang.Exception e) {
            throw new java.security.cert.CertStoreException("certificate cannot be constructed from LDAP result: ".concat(java.lang.String.valueOf(e)));
        }
    }

    @Override // java.security.cert.CertStoreSpi
    public java.util.Collection engineGetCRLs(java.security.cert.CRLSelector cRLSelector) throws java.security.cert.CertStoreException {
        java.lang.String certificateRevocationListIssuerAttributeName;
        java.lang.String name2;
        java.lang.String[] strArr = {this.getHighSpeedVideoFpsRanges.getCertificateRevocationListAttribute()};
        if (!(cRLSelector instanceof java.security.cert.X509CRLSelector)) {
            throw new java.security.cert.CertStoreException("selector is not a X509CRLSelector");
        }
        java.security.cert.X509CRLSelector x509CRLSelector = (java.security.cert.X509CRLSelector) cRLSelector;
        java.util.HashSet hashSet = new java.util.HashSet();
        java.lang.String ldapCertificateRevocationListAttributeName = this.getHighSpeedVideoFpsRanges.getLdapCertificateRevocationListAttributeName();
        java.util.HashSet hashSet2 = new java.util.HashSet();
        if (x509CRLSelector.getIssuerNames() != null) {
            for (java.lang.Object obj : x509CRLSelector.getIssuerNames()) {
                if (obj instanceof java.lang.String) {
                    certificateRevocationListIssuerAttributeName = this.getHighSpeedVideoFpsRanges.getCertificateRevocationListIssuerAttributeName();
                    name2 = (java.lang.String) obj;
                } else {
                    certificateRevocationListIssuerAttributeName = this.getHighSpeedVideoFpsRanges.getCertificateRevocationListIssuerAttributeName();
                    name2 = new javax.security.auth.x500.X500Principal((byte[]) obj).getName("RFC1779");
                }
                java.lang.String highSpeedVideoFpsRangesFor = getHighSpeedVideoFpsRangesFor(name2, certificateRevocationListIssuerAttributeName);
                java.lang.StringBuilder sb = new java.lang.StringBuilder("*");
                sb.append(highSpeedVideoFpsRangesFor);
                sb.append("*");
                hashSet2.addAll(getHighSpeedVideoSizes(ldapCertificateRevocationListAttributeName, sb.toString(), strArr));
            }
        } else {
            hashSet2.addAll(getHighSpeedVideoSizes(ldapCertificateRevocationListAttributeName, "*", strArr));
        }
        hashSet2.addAll(getHighSpeedVideoSizes(null, "*", strArr));
        java.util.Iterator it = hashSet2.iterator();
        try {
            java.security.cert.CertificateFactory certificateFactory = java.security.cert.CertificateFactory.getInstance("X.509", org.bouncycastle.jce.provider.BouncyCastleProvider.PROVIDER_NAME);
            while (it.hasNext()) {
                java.security.cert.CRL generateCRL = certificateFactory.generateCRL(new java.io.ByteArrayInputStream((byte[]) it.next()));
                if (x509CRLSelector.match(generateCRL)) {
                    hashSet.add(generateCRL);
                }
            }
            return hashSet;
        } catch (java.lang.Exception e) {
            throw new java.security.cert.CertStoreException("CRL cannot be constructed from LDAP result ".concat(java.lang.String.valueOf(e)));
        }
    }

    private static java.lang.String getHighSpeedVideoFpsRangesFor(java.lang.String str, java.lang.String str2) {
        int length;
        java.lang.String substring = str.substring(str.toLowerCase().indexOf(str2.toLowerCase()) + str2.length());
        if (substring.indexOf(44) != -1) {
            length = substring.length();
            while (substring.charAt(length - 1) == '\\') {
                length = substring.indexOf(44, length + 1);
                if (length == -1) {
                }
            }
            java.lang.String substring2 = substring.substring(0, length);
            java.lang.String substring3 = substring2.substring(substring2.indexOf(61) + 1);
            if (substring3.charAt(0) == ' ') {
                substring3 = substring3.substring(1);
            }
            if (substring3.startsWith("\"")) {
                substring3 = substring3.substring(1);
            }
            return substring3.endsWith("\"") ? substring3.substring(0, substring3.length() - 1) : substring3;
        }
        length = substring.length();
    }

    private java.util.Set getHighSpeedVideoFpsRanges(java.security.cert.X509CertSelector x509CertSelector, java.lang.String[] strArr, java.lang.String str, java.lang.String str2) throws java.security.cert.CertStoreException {
        java.lang.String name2;
        java.lang.String str3;
        java.util.Set highSpeedVideoSizes;
        java.util.HashSet hashSet = new java.util.HashSet();
        try {
            if (x509CertSelector.getSubjectAsBytes() == null && x509CertSelector.getSubjectAsString() == null && x509CertSelector.getCertificate() == null) {
                highSpeedVideoSizes = getHighSpeedVideoSizes(str, "*", strArr);
                hashSet.addAll(highSpeedVideoSizes);
                return hashSet;
            }
            if (x509CertSelector.getCertificate() != null) {
                name2 = x509CertSelector.getCertificate().getSubjectX500Principal().getName("RFC1779");
                str3 = x509CertSelector.getCertificate().getSerialNumber().toString();
            } else {
                name2 = x509CertSelector.getSubjectAsBytes() != null ? new javax.security.auth.x500.X500Principal(x509CertSelector.getSubjectAsBytes()).getName("RFC1779") : x509CertSelector.getSubjectAsString();
                str3 = null;
            }
            java.lang.String highSpeedVideoFpsRangesFor = getHighSpeedVideoFpsRangesFor(name2, str2);
            java.lang.StringBuilder sb = new java.lang.StringBuilder("*");
            sb.append(highSpeedVideoFpsRangesFor);
            sb.append("*");
            hashSet.addAll(getHighSpeedVideoSizes(str, sb.toString(), strArr));
            if (str3 != null && this.getHighSpeedVideoFpsRanges.getSearchForSerialNumberIn() != null) {
                java.lang.String searchForSerialNumberIn = this.getHighSpeedVideoFpsRanges.getSearchForSerialNumberIn();
                java.lang.StringBuilder sb2 = new java.lang.StringBuilder("*");
                sb2.append(str3);
                sb2.append("*");
                highSpeedVideoSizes = getHighSpeedVideoSizes(searchForSerialNumberIn, sb2.toString(), strArr);
                hashSet.addAll(highSpeedVideoSizes);
            }
            return hashSet;
        } catch (java.io.IOException e) {
            throw new java.security.cert.CertStoreException("exception processing selector: ".concat(java.lang.String.valueOf(e)));
        }
    }

    public X509LDAPCertStoreSpi(java.security.cert.CertStoreParameters certStoreParameters) throws java.security.InvalidAlgorithmParameterException {
        super(certStoreParameters);
        if (certStoreParameters instanceof org.bouncycastle.jce.X509LDAPCertStoreParameters) {
            this.getHighSpeedVideoFpsRanges = (org.bouncycastle.jce.X509LDAPCertStoreParameters) certStoreParameters;
            return;
        }
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append(org.bouncycastle.jce.provider.X509LDAPCertStoreSpi.class.getName());
        sb.append(": parameter must be a ");
        sb.append(org.bouncycastle.jce.X509LDAPCertStoreParameters.class.getName());
        sb.append(" object\n");
        sb.append(certStoreParameters.toString());
        throw new java.security.InvalidAlgorithmParameterException(sb.toString());
    }
}
