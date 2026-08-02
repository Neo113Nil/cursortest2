package org.bouncycastle.x509.util;

/* loaded from: classes17.dex */
public class LDAPStoreHelper {
    private static long Camera2StreamConfigurationMap = 60000;
    private static int getHighResolutionOutputSizeshNQ4ISI = 32;
    private static java.lang.String getHighSpeedVideoFpsRanges = "ignore";
    private static java.lang.String getHighSpeedVideoSizes = "com.sun.jndi.ldap.LdapCtxFactory";
    private java.util.Map getHighSpeedVideoFpsRangesFor = new java.util.HashMap(getHighResolutionOutputSizeshNQ4ISI);
    private org.bouncycastle.jce.X509LDAPCertStoreParameters getOutputMinFrameDuration;

    /* JADX WARN: Removed duplicated region for block: B:11:0x0044  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0070  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0089  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0098 A[LOOP:0: B:26:0x0098->B:28:0x009b, LOOP_START, PHI: r4
      0x0098: PHI (r4v5 int) = (r4v1 int), (r4v6 int) binds: [B:25:0x0096, B:28:0x009b] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00d2 A[LOOP:1: B:35:0x00cc->B:37:0x00d2, LOOP_END] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private java.util.List getHighSpeedVideoFpsRangesFor(org.bouncycastle.x509.X509AttributeCertStoreSelector x509AttributeCertStoreSelector, java.lang.String[] strArr, java.lang.String[] strArr2, java.lang.String[] strArr3) throws org.bouncycastle.util.StoreException {
        java.security.Principal[] principalArr;
        java.util.Iterator it;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.util.HashSet hashSet = new java.util.HashSet();
        java.lang.String str = null;
        if (x509AttributeCertStoreSelector.getHolder() != null) {
            if (x509AttributeCertStoreSelector.getHolder().getSerialNumber() != null) {
                hashSet.add(x509AttributeCertStoreSelector.getHolder().getSerialNumber().toString());
            }
            if (x509AttributeCertStoreSelector.getHolder().getEntityNames() != null) {
                principalArr = x509AttributeCertStoreSelector.getHolder().getEntityNames();
                if (x509AttributeCertStoreSelector.getAttributeCert() != null) {
                    if (x509AttributeCertStoreSelector.getAttributeCert().getHolder().getEntityNames() != null) {
                        principalArr = x509AttributeCertStoreSelector.getAttributeCert().getHolder().getEntityNames();
                    }
                    hashSet.add(x509AttributeCertStoreSelector.getAttributeCert().getSerialNumber().toString());
                }
                if (principalArr != null) {
                    java.security.Principal principal = principalArr[0];
                    str = principal instanceof javax.security.auth.x500.X500Principal ? ((javax.security.auth.x500.X500Principal) principal).getName("RFC1779") : principal.getName();
                }
                if (x509AttributeCertStoreSelector.getSerialNumber() != null) {
                    hashSet.add(x509AttributeCertStoreSelector.getSerialNumber().toString());
                }
                if (str != null) {
                    for (java.lang.String str2 : strArr3) {
                        java.lang.String highResolutionOutputSizeshNQ4ISI = getHighResolutionOutputSizeshNQ4ISI(str, str2);
                        java.lang.StringBuilder sb = new java.lang.StringBuilder("*");
                        sb.append(highResolutionOutputSizeshNQ4ISI);
                        sb.append("*");
                        arrayList.addAll(getHighSpeedVideoFpsRanges(strArr2, sb.toString(), strArr));
                    }
                }
                if (hashSet.size() > 0 && this.getOutputMinFrameDuration.getSearchForSerialNumberIn() != null) {
                    it = hashSet.iterator();
                    while (it.hasNext()) {
                        arrayList.addAll(getHighSpeedVideoFpsRanges(this.getOutputMinFrameDuration.getSearchForSerialNumberIn().split("\\s+"), (java.lang.String) it.next(), strArr));
                    }
                }
                if (hashSet.size() == 0 && str == null) {
                    arrayList.addAll(getHighSpeedVideoFpsRanges(strArr2, "*", strArr));
                }
                return arrayList;
            }
        }
        principalArr = null;
        if (x509AttributeCertStoreSelector.getAttributeCert() != null) {
        }
        if (principalArr != null) {
        }
        if (x509AttributeCertStoreSelector.getSerialNumber() != null) {
        }
        if (str != null) {
        }
        if (hashSet.size() > 0) {
            it = hashSet.iterator();
            while (it.hasNext()) {
            }
        }
        if (hashSet.size() == 0) {
            arrayList.addAll(getHighSpeedVideoFpsRanges(strArr2, "*", strArr));
        }
        return arrayList;
    }

    private java.util.List getHighSpeedVideoFpsRangesFor(org.bouncycastle.x509.X509CRLStoreSelector x509CRLStoreSelector, java.lang.String[] strArr, java.lang.String[] strArr2, java.lang.String[] strArr3) throws org.bouncycastle.util.StoreException {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.util.HashSet hashSet = new java.util.HashSet();
        if (x509CRLStoreSelector.getIssuers() != null) {
            hashSet.addAll(x509CRLStoreSelector.getIssuers());
        }
        if (x509CRLStoreSelector.getCertificateChecking() != null) {
            hashSet.add(x509CRLStoreSelector.getCertificateChecking().getIssuerX500Principal());
        }
        if (x509CRLStoreSelector.getAttrCertificateChecking() != null) {
            for (java.security.Principal principal : x509CRLStoreSelector.getAttrCertificateChecking().getIssuer().getPrincipals()) {
                if (principal instanceof javax.security.auth.x500.X500Principal) {
                    hashSet.add(principal);
                }
            }
        }
        java.util.Iterator it = hashSet.iterator();
        java.lang.String str = null;
        while (it.hasNext()) {
            str = ((javax.security.auth.x500.X500Principal) it.next()).getName("RFC1779");
            for (java.lang.String str2 : strArr3) {
                java.lang.String highResolutionOutputSizeshNQ4ISI = getHighResolutionOutputSizeshNQ4ISI(str, str2);
                java.lang.StringBuilder sb = new java.lang.StringBuilder("*");
                sb.append(highResolutionOutputSizeshNQ4ISI);
                sb.append("*");
                arrayList.addAll(getHighSpeedVideoFpsRanges(strArr2, sb.toString(), strArr));
            }
        }
        if (str == null) {
            arrayList.addAll(getHighSpeedVideoFpsRanges(strArr2, "*", strArr));
        }
        return arrayList;
    }

    private java.util.List getHighSpeedVideoFpsRangesFor(org.bouncycastle.x509.X509CertStoreSelector x509CertStoreSelector, java.lang.String[] strArr, java.lang.String[] strArr2, java.lang.String[] strArr3) throws org.bouncycastle.util.StoreException {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.String highSpeedVideoFpsRanges = getHighSpeedVideoFpsRanges(x509CertStoreSelector);
        java.lang.String obj = x509CertStoreSelector.getSerialNumber() != null ? x509CertStoreSelector.getSerialNumber().toString() : null;
        if (x509CertStoreSelector.getCertificate() != null) {
            highSpeedVideoFpsRanges = x509CertStoreSelector.getCertificate().getSubjectX500Principal().getName("RFC1779");
            obj = x509CertStoreSelector.getCertificate().getSerialNumber().toString();
        }
        if (highSpeedVideoFpsRanges != null) {
            for (java.lang.String str : strArr3) {
                java.lang.String highResolutionOutputSizeshNQ4ISI = getHighResolutionOutputSizeshNQ4ISI(highSpeedVideoFpsRanges, str);
                java.lang.StringBuilder sb = new java.lang.StringBuilder("*");
                sb.append(highResolutionOutputSizeshNQ4ISI);
                sb.append("*");
                arrayList.addAll(getHighSpeedVideoFpsRanges(strArr2, sb.toString(), strArr));
            }
        }
        if (obj != null && this.getOutputMinFrameDuration.getSearchForSerialNumberIn() != null) {
            arrayList.addAll(getHighSpeedVideoFpsRanges(this.getOutputMinFrameDuration.getSearchForSerialNumberIn().split("\\s+"), obj, strArr));
        }
        if (obj == null && highSpeedVideoFpsRanges == null) {
            arrayList.addAll(getHighSpeedVideoFpsRanges(strArr2, "*", strArr));
        }
        return arrayList;
    }

    private java.util.List getHighSpeedVideoFpsRanges(java.lang.String[] strArr, java.lang.String str, java.lang.String[] strArr2) throws org.bouncycastle.util.StoreException {
        java.lang.String obj;
        javax.naming.directory.DirContext initialDirContext;
        java.lang.String str2 = "";
        javax.naming.directory.DirContext dirContext = null;
        if (strArr == null) {
            obj = null;
        } else {
            if (str.equals("**")) {
                str = "*";
            }
            java.lang.String str3 = "";
            for (java.lang.String str4 : strArr) {
                java.lang.StringBuilder sb = new java.lang.StringBuilder();
                sb.append(str3);
                sb.append("(");
                sb.append(str4);
                sb.append("=");
                sb.append(str);
                sb.append(")");
                str3 = sb.toString();
            }
            java.lang.StringBuilder sb2 = new java.lang.StringBuilder("(|");
            sb2.append(str3);
            sb2.append(")");
            obj = sb2.toString();
        }
        for (java.lang.String str5 : strArr2) {
            java.lang.StringBuilder sb3 = new java.lang.StringBuilder();
            sb3.append(str2);
            sb3.append("(");
            sb3.append(str5);
            sb3.append("=*)");
            str2 = sb3.toString();
        }
        java.lang.StringBuilder sb4 = new java.lang.StringBuilder("(|");
        sb4.append(str2);
        sb4.append(")");
        java.lang.String obj2 = sb4.toString();
        java.lang.StringBuilder sb5 = new java.lang.StringBuilder("(&");
        sb5.append(obj);
        sb5.append(obj2);
        sb5.append(")");
        java.lang.String obj3 = sb5.toString();
        if (obj != null) {
            obj2 = obj3;
        }
        java.util.List list = (java.util.List) this.getHighSpeedVideoFpsRangesFor.get(obj2);
        java.util.List list2 = (list == null || ((java.sql.Date) list.get(0)).getTime() < java.lang.System.currentTimeMillis() - Camera2StreamConfigurationMap) ? null : (java.util.List) list.get(1);
        if (list2 != null) {
            return list2;
        }
        java.util.ArrayList arrayList = new java.util.ArrayList();
        try {
            try {
                java.util.Properties properties = new java.util.Properties();
                properties.setProperty("java.naming.factory.initial", getHighSpeedVideoSizes);
                properties.setProperty("java.naming.batchsize", "0");
                properties.setProperty("java.naming.provider.url", this.getOutputMinFrameDuration.getLdapURL());
                properties.setProperty("java.naming.factory.url.pkgs", "com.sun.jndi.url");
                properties.setProperty("java.naming.referral", getHighSpeedVideoFpsRanges);
                properties.setProperty("java.naming.security.authentication", "none");
                initialDirContext = new javax.naming.directory.InitialDirContext(properties);
            } catch (java.lang.Exception unused) {
                return arrayList;
            }
        } catch (javax.naming.NamingException unused2) {
        } catch (java.lang.Throwable th) {
            th = th;
        }
        try {
            javax.naming.directory.SearchControls searchControls = new javax.naming.directory.SearchControls();
            searchControls.setSearchScope(2);
            searchControls.setCountLimit(0L);
            searchControls.setReturningAttributes(strArr2);
            javax.naming.NamingEnumeration search = initialDirContext.search(this.getOutputMinFrameDuration.getBaseDN(), obj2, searchControls);
            while (search.hasMoreElements()) {
                javax.naming.NamingEnumeration all = ((javax.naming.directory.Attribute) ((javax.naming.directory.SearchResult) search.next()).getAttributes().getAll().next()).getAll();
                while (all.hasMore()) {
                    arrayList.add(all.next());
                }
            }
            getHighSpeedVideoSizes(obj2, arrayList);
            initialDirContext.close();
            return arrayList;
        } catch (javax.naming.NamingException unused3) {
            dirContext = initialDirContext;
            if (dirContext != null) {
                dirContext.close();
            }
            return arrayList;
        } catch (java.lang.Throwable th2) {
            th = th2;
            dirContext = initialDirContext;
            if (dirContext != null) {
                try {
                    dirContext.close();
                } catch (java.lang.Exception unused4) {
                }
            }
            throw th;
        }
    }

    public java.util.Collection getAACertificates(org.bouncycastle.x509.X509AttributeCertStoreSelector x509AttributeCertStoreSelector) throws org.bouncycastle.util.StoreException {
        java.lang.String[] split = this.getOutputMinFrameDuration.getAACertificateAttribute().split("\\s+");
        java.lang.String[] split2 = this.getOutputMinFrameDuration.getLdapAACertificateAttributeName().split("\\s+");
        java.lang.String[] split3 = this.getOutputMinFrameDuration.getAACertificateSubjectAttributeName().split("\\s+");
        java.util.Set highSpeedVideoFpsRangesFor = getHighSpeedVideoFpsRangesFor(getHighSpeedVideoFpsRangesFor(x509AttributeCertStoreSelector, split, split2, split3), x509AttributeCertStoreSelector);
        if (highSpeedVideoFpsRangesFor.size() == 0) {
            highSpeedVideoFpsRangesFor.addAll(getHighSpeedVideoFpsRangesFor(getHighSpeedVideoFpsRangesFor(new org.bouncycastle.x509.X509AttributeCertStoreSelector(), split, split2, split3), x509AttributeCertStoreSelector));
        }
        return highSpeedVideoFpsRangesFor;
    }

    public java.util.Collection getAttributeAuthorityRevocationLists(org.bouncycastle.x509.X509CRLStoreSelector x509CRLStoreSelector) throws org.bouncycastle.util.StoreException {
        java.lang.String[] split = this.getOutputMinFrameDuration.getAttributeAuthorityRevocationListAttribute().split("\\s+");
        java.lang.String[] split2 = this.getOutputMinFrameDuration.getLdapAttributeAuthorityRevocationListAttributeName().split("\\s+");
        java.lang.String[] split3 = this.getOutputMinFrameDuration.getAttributeAuthorityRevocationListIssuerAttributeName().split("\\s+");
        java.util.Set highResolutionOutputSizeshNQ4ISI = getHighResolutionOutputSizeshNQ4ISI(getHighSpeedVideoFpsRangesFor(x509CRLStoreSelector, split, split2, split3), x509CRLStoreSelector);
        if (highResolutionOutputSizeshNQ4ISI.size() == 0) {
            highResolutionOutputSizeshNQ4ISI.addAll(getHighResolutionOutputSizeshNQ4ISI(getHighSpeedVideoFpsRangesFor(new org.bouncycastle.x509.X509CRLStoreSelector(), split, split2, split3), x509CRLStoreSelector));
        }
        return highResolutionOutputSizeshNQ4ISI;
    }

    public java.util.Collection getAttributeCertificateAttributes(org.bouncycastle.x509.X509AttributeCertStoreSelector x509AttributeCertStoreSelector) throws org.bouncycastle.util.StoreException {
        java.lang.String[] split = this.getOutputMinFrameDuration.getAttributeCertificateAttributeAttribute().split("\\s+");
        java.lang.String[] split2 = this.getOutputMinFrameDuration.getLdapAttributeCertificateAttributeAttributeName().split("\\s+");
        java.lang.String[] split3 = this.getOutputMinFrameDuration.getAttributeCertificateAttributeSubjectAttributeName().split("\\s+");
        java.util.Set highSpeedVideoFpsRangesFor = getHighSpeedVideoFpsRangesFor(getHighSpeedVideoFpsRangesFor(x509AttributeCertStoreSelector, split, split2, split3), x509AttributeCertStoreSelector);
        if (highSpeedVideoFpsRangesFor.size() == 0) {
            highSpeedVideoFpsRangesFor.addAll(getHighSpeedVideoFpsRangesFor(getHighSpeedVideoFpsRangesFor(new org.bouncycastle.x509.X509AttributeCertStoreSelector(), split, split2, split3), x509AttributeCertStoreSelector));
        }
        return highSpeedVideoFpsRangesFor;
    }

    public java.util.Collection getAttributeCertificateRevocationLists(org.bouncycastle.x509.X509CRLStoreSelector x509CRLStoreSelector) throws org.bouncycastle.util.StoreException {
        java.lang.String[] split = this.getOutputMinFrameDuration.getAttributeCertificateRevocationListAttribute().split("\\s+");
        java.lang.String[] split2 = this.getOutputMinFrameDuration.getLdapAttributeCertificateRevocationListAttributeName().split("\\s+");
        java.lang.String[] split3 = this.getOutputMinFrameDuration.getAttributeCertificateRevocationListIssuerAttributeName().split("\\s+");
        java.util.Set highResolutionOutputSizeshNQ4ISI = getHighResolutionOutputSizeshNQ4ISI(getHighSpeedVideoFpsRangesFor(x509CRLStoreSelector, split, split2, split3), x509CRLStoreSelector);
        if (highResolutionOutputSizeshNQ4ISI.size() == 0) {
            highResolutionOutputSizeshNQ4ISI.addAll(getHighResolutionOutputSizeshNQ4ISI(getHighSpeedVideoFpsRangesFor(new org.bouncycastle.x509.X509CRLStoreSelector(), split, split2, split3), x509CRLStoreSelector));
        }
        return highResolutionOutputSizeshNQ4ISI;
    }

    public java.util.Collection getAttributeDescriptorCertificates(org.bouncycastle.x509.X509AttributeCertStoreSelector x509AttributeCertStoreSelector) throws org.bouncycastle.util.StoreException {
        java.lang.String[] split = this.getOutputMinFrameDuration.getAttributeDescriptorCertificateAttribute().split("\\s+");
        java.lang.String[] split2 = this.getOutputMinFrameDuration.getLdapAttributeDescriptorCertificateAttributeName().split("\\s+");
        java.lang.String[] split3 = this.getOutputMinFrameDuration.getAttributeDescriptorCertificateSubjectAttributeName().split("\\s+");
        java.util.Set highSpeedVideoFpsRangesFor = getHighSpeedVideoFpsRangesFor(getHighSpeedVideoFpsRangesFor(x509AttributeCertStoreSelector, split, split2, split3), x509AttributeCertStoreSelector);
        if (highSpeedVideoFpsRangesFor.size() == 0) {
            highSpeedVideoFpsRangesFor.addAll(getHighSpeedVideoFpsRangesFor(getHighSpeedVideoFpsRangesFor(new org.bouncycastle.x509.X509AttributeCertStoreSelector(), split, split2, split3), x509AttributeCertStoreSelector));
        }
        return highSpeedVideoFpsRangesFor;
    }

    public java.util.Collection getAuthorityRevocationLists(org.bouncycastle.x509.X509CRLStoreSelector x509CRLStoreSelector) throws org.bouncycastle.util.StoreException {
        java.lang.String[] split = this.getOutputMinFrameDuration.getAuthorityRevocationListAttribute().split("\\s+");
        java.lang.String[] split2 = this.getOutputMinFrameDuration.getLdapAuthorityRevocationListAttributeName().split("\\s+");
        java.lang.String[] split3 = this.getOutputMinFrameDuration.getAuthorityRevocationListIssuerAttributeName().split("\\s+");
        java.util.Set highResolutionOutputSizeshNQ4ISI = getHighResolutionOutputSizeshNQ4ISI(getHighSpeedVideoFpsRangesFor(x509CRLStoreSelector, split, split2, split3), x509CRLStoreSelector);
        if (highResolutionOutputSizeshNQ4ISI.size() == 0) {
            highResolutionOutputSizeshNQ4ISI.addAll(getHighResolutionOutputSizeshNQ4ISI(getHighSpeedVideoFpsRangesFor(new org.bouncycastle.x509.X509CRLStoreSelector(), split, split2, split3), x509CRLStoreSelector));
        }
        return highResolutionOutputSizeshNQ4ISI;
    }

    public java.util.Collection getCACertificates(org.bouncycastle.x509.X509CertStoreSelector x509CertStoreSelector) throws org.bouncycastle.util.StoreException {
        java.lang.String[] split = this.getOutputMinFrameDuration.getCACertificateAttribute().split("\\s+");
        java.lang.String[] split2 = this.getOutputMinFrameDuration.getLdapCACertificateAttributeName().split("\\s+");
        java.lang.String[] split3 = this.getOutputMinFrameDuration.getCACertificateSubjectAttributeName().split("\\s+");
        java.util.Set highSpeedVideoFpsRanges = getHighSpeedVideoFpsRanges(getHighSpeedVideoFpsRangesFor(x509CertStoreSelector, split, split2, split3), x509CertStoreSelector);
        if (highSpeedVideoFpsRanges.size() == 0) {
            highSpeedVideoFpsRanges.addAll(getHighSpeedVideoFpsRanges(getHighSpeedVideoFpsRangesFor(new org.bouncycastle.x509.X509CertStoreSelector(), split, split2, split3), x509CertStoreSelector));
        }
        return highSpeedVideoFpsRanges;
    }

    public java.util.Collection getCertificateRevocationLists(org.bouncycastle.x509.X509CRLStoreSelector x509CRLStoreSelector) throws org.bouncycastle.util.StoreException {
        java.lang.String[] split = this.getOutputMinFrameDuration.getCertificateRevocationListAttribute().split("\\s+");
        java.lang.String[] split2 = this.getOutputMinFrameDuration.getLdapCertificateRevocationListAttributeName().split("\\s+");
        java.lang.String[] split3 = this.getOutputMinFrameDuration.getCertificateRevocationListIssuerAttributeName().split("\\s+");
        java.util.Set highResolutionOutputSizeshNQ4ISI = getHighResolutionOutputSizeshNQ4ISI(getHighSpeedVideoFpsRangesFor(x509CRLStoreSelector, split, split2, split3), x509CRLStoreSelector);
        if (highResolutionOutputSizeshNQ4ISI.size() == 0) {
            highResolutionOutputSizeshNQ4ISI.addAll(getHighResolutionOutputSizeshNQ4ISI(getHighSpeedVideoFpsRangesFor(new org.bouncycastle.x509.X509CRLStoreSelector(), split, split2, split3), x509CRLStoreSelector));
        }
        return highResolutionOutputSizeshNQ4ISI;
    }

    public java.util.Collection getCrossCertificatePairs(org.bouncycastle.x509.X509CertPairStoreSelector x509CertPairStoreSelector) throws org.bouncycastle.util.StoreException {
        java.lang.String[] split = this.getOutputMinFrameDuration.getCrossCertificateAttribute().split("\\s+");
        java.lang.String[] split2 = this.getOutputMinFrameDuration.getLdapCrossCertificateAttributeName().split("\\s+");
        java.lang.String[] split3 = this.getOutputMinFrameDuration.getCrossCertificateSubjectAttributeName().split("\\s+");
        java.util.Set highSpeedVideoSizes = getHighSpeedVideoSizes(getHighResolutionOutputSizeshNQ4ISI(x509CertPairStoreSelector, split, split2, split3), x509CertPairStoreSelector);
        if (highSpeedVideoSizes.size() == 0) {
            org.bouncycastle.x509.X509CertStoreSelector x509CertStoreSelector = new org.bouncycastle.x509.X509CertStoreSelector();
            org.bouncycastle.x509.X509CertPairStoreSelector x509CertPairStoreSelector2 = new org.bouncycastle.x509.X509CertPairStoreSelector();
            x509CertPairStoreSelector2.setForwardSelector(x509CertStoreSelector);
            x509CertPairStoreSelector2.setReverseSelector(x509CertStoreSelector);
            highSpeedVideoSizes.addAll(getHighSpeedVideoSizes(getHighResolutionOutputSizeshNQ4ISI(x509CertPairStoreSelector2, split, split2, split3), x509CertPairStoreSelector));
        }
        return highSpeedVideoSizes;
    }

    public java.util.Collection getDeltaCertificateRevocationLists(org.bouncycastle.x509.X509CRLStoreSelector x509CRLStoreSelector) throws org.bouncycastle.util.StoreException {
        java.lang.String[] split = this.getOutputMinFrameDuration.getDeltaRevocationListAttribute().split("\\s+");
        java.lang.String[] split2 = this.getOutputMinFrameDuration.getLdapDeltaRevocationListAttributeName().split("\\s+");
        java.lang.String[] split3 = this.getOutputMinFrameDuration.getDeltaRevocationListIssuerAttributeName().split("\\s+");
        java.util.Set highResolutionOutputSizeshNQ4ISI = getHighResolutionOutputSizeshNQ4ISI(getHighSpeedVideoFpsRangesFor(x509CRLStoreSelector, split, split2, split3), x509CRLStoreSelector);
        if (highResolutionOutputSizeshNQ4ISI.size() == 0) {
            highResolutionOutputSizeshNQ4ISI.addAll(getHighResolutionOutputSizeshNQ4ISI(getHighSpeedVideoFpsRangesFor(new org.bouncycastle.x509.X509CRLStoreSelector(), split, split2, split3), x509CRLStoreSelector));
        }
        return highResolutionOutputSizeshNQ4ISI;
    }

    public java.util.Collection getUserCertificates(org.bouncycastle.x509.X509CertStoreSelector x509CertStoreSelector) throws org.bouncycastle.util.StoreException {
        java.lang.String[] split = this.getOutputMinFrameDuration.getUserCertificateAttribute().split("\\s+");
        java.lang.String[] split2 = this.getOutputMinFrameDuration.getLdapUserCertificateAttributeName().split("\\s+");
        java.lang.String[] split3 = this.getOutputMinFrameDuration.getUserCertificateSubjectAttributeName().split("\\s+");
        java.util.Set highSpeedVideoFpsRanges = getHighSpeedVideoFpsRanges(getHighSpeedVideoFpsRangesFor(x509CertStoreSelector, split, split2, split3), x509CertStoreSelector);
        if (highSpeedVideoFpsRanges.size() == 0) {
            highSpeedVideoFpsRanges.addAll(getHighSpeedVideoFpsRanges(getHighSpeedVideoFpsRangesFor(new org.bouncycastle.x509.X509CertStoreSelector(), split, split2, split3), x509CertStoreSelector));
        }
        return highSpeedVideoFpsRanges;
    }

    private static java.lang.String getHighResolutionOutputSizeshNQ4ISI(java.lang.String str, java.lang.String str2) {
        int length;
        java.lang.String lowerCase = str.toLowerCase();
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append(str2.toLowerCase());
        sb.append("=");
        int indexOf = lowerCase.indexOf(sb.toString());
        if (indexOf == -1) {
            return "";
        }
        java.lang.String substring = str.substring(indexOf + str2.length());
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

    private static java.lang.String getHighSpeedVideoFpsRanges(org.bouncycastle.x509.X509CertStoreSelector x509CertStoreSelector) {
        try {
            byte[] subjectAsBytes = x509CertStoreSelector.getSubjectAsBytes();
            if (subjectAsBytes != null) {
                return new javax.security.auth.x500.X500Principal(subjectAsBytes).getName("RFC1779");
            }
            return null;
        } catch (java.io.IOException e) {
            java.lang.StringBuilder sb = new java.lang.StringBuilder("exception processing name: ");
            sb.append(e.getMessage());
            throw new org.bouncycastle.util.StoreException(sb.toString(), e);
        }
    }

    private java.util.List getHighResolutionOutputSizeshNQ4ISI(org.bouncycastle.x509.X509CertPairStoreSelector x509CertPairStoreSelector, java.lang.String[] strArr, java.lang.String[] strArr2, java.lang.String[] strArr3) throws org.bouncycastle.util.StoreException {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.String highSpeedVideoFpsRanges = x509CertPairStoreSelector.getForwardSelector() != null ? getHighSpeedVideoFpsRanges(x509CertPairStoreSelector.getForwardSelector()) : null;
        if (x509CertPairStoreSelector.getCertPair() != null && x509CertPairStoreSelector.getCertPair().getForward() != null) {
            highSpeedVideoFpsRanges = x509CertPairStoreSelector.getCertPair().getForward().getSubjectX500Principal().getName("RFC1779");
        }
        if (highSpeedVideoFpsRanges != null) {
            for (java.lang.String str : strArr3) {
                java.lang.String highResolutionOutputSizeshNQ4ISI = getHighResolutionOutputSizeshNQ4ISI(highSpeedVideoFpsRanges, str);
                java.lang.StringBuilder sb = new java.lang.StringBuilder("*");
                sb.append(highResolutionOutputSizeshNQ4ISI);
                sb.append("*");
                arrayList.addAll(getHighSpeedVideoFpsRanges(strArr2, sb.toString(), strArr));
            }
        }
        if (highSpeedVideoFpsRanges == null) {
            arrayList.addAll(getHighSpeedVideoFpsRanges(strArr2, "*", strArr));
        }
        return arrayList;
    }

    private static java.util.Set getHighSpeedVideoSizes(java.util.List list, org.bouncycastle.x509.X509CertPairStoreSelector x509CertPairStoreSelector) throws org.bouncycastle.util.StoreException {
        org.bouncycastle.x509.X509CertificatePair x509CertificatePair;
        java.util.HashSet hashSet = new java.util.HashSet();
        int i = 0;
        while (i < list.size()) {
            try {
                try {
                    org.bouncycastle.jce.provider.X509CertPairParser x509CertPairParser = new org.bouncycastle.jce.provider.X509CertPairParser();
                    x509CertPairParser.engineInit(new java.io.ByteArrayInputStream((byte[]) list.get(i)));
                    x509CertificatePair = (org.bouncycastle.x509.X509CertificatePair) x509CertPairParser.engineRead();
                } catch (java.io.IOException | java.security.cert.CertificateParsingException unused) {
                }
            } catch (org.bouncycastle.x509.util.StreamParsingException unused2) {
                int i2 = i + 1;
                x509CertificatePair = new org.bouncycastle.x509.X509CertificatePair(new org.bouncycastle.asn1.x509.CertificatePair(org.bouncycastle.asn1.x509.Certificate.getInstance(new org.bouncycastle.asn1.ASN1InputStream((byte[]) list.get(i)).readObject()), org.bouncycastle.asn1.x509.Certificate.getInstance(new org.bouncycastle.asn1.ASN1InputStream((byte[]) list.get(i2)).readObject())));
                i = i2;
            }
            if (x509CertPairStoreSelector.match(x509CertificatePair)) {
                hashSet.add(x509CertificatePair);
            }
            i++;
        }
        return hashSet;
    }

    private static java.util.Set getHighSpeedVideoFpsRanges(java.util.List list, org.bouncycastle.x509.X509CertStoreSelector x509CertStoreSelector) throws org.bouncycastle.util.StoreException {
        java.util.HashSet hashSet = new java.util.HashSet();
        java.util.Iterator it = list.iterator();
        org.bouncycastle.jce.provider.X509CertParser x509CertParser = new org.bouncycastle.jce.provider.X509CertParser();
        while (it.hasNext()) {
            try {
                x509CertParser.engineInit(new java.io.ByteArrayInputStream((byte[]) it.next()));
                java.security.cert.X509Certificate x509Certificate = (java.security.cert.X509Certificate) x509CertParser.engineRead();
                if (x509CertStoreSelector.match((java.lang.Object) x509Certificate)) {
                    hashSet.add(x509Certificate);
                }
            } catch (java.lang.Exception unused) {
            }
        }
        return hashSet;
    }

    private static java.util.Set getHighResolutionOutputSizeshNQ4ISI(java.util.List list, org.bouncycastle.x509.X509CRLStoreSelector x509CRLStoreSelector) throws org.bouncycastle.util.StoreException {
        java.util.HashSet hashSet = new java.util.HashSet();
        org.bouncycastle.jce.provider.X509CRLParser x509CRLParser = new org.bouncycastle.jce.provider.X509CRLParser();
        java.util.Iterator it = list.iterator();
        while (it.hasNext()) {
            try {
                x509CRLParser.engineInit(new java.io.ByteArrayInputStream((byte[]) it.next()));
                java.security.cert.X509CRL x509crl = (java.security.cert.X509CRL) x509CRLParser.engineRead();
                if (x509CRLStoreSelector.match((java.lang.Object) x509crl)) {
                    hashSet.add(x509crl);
                }
            } catch (org.bouncycastle.x509.util.StreamParsingException unused) {
            }
        }
        return hashSet;
    }

    private static java.util.Set getHighSpeedVideoFpsRangesFor(java.util.List list, org.bouncycastle.x509.X509AttributeCertStoreSelector x509AttributeCertStoreSelector) throws org.bouncycastle.util.StoreException {
        java.util.HashSet hashSet = new java.util.HashSet();
        java.util.Iterator it = list.iterator();
        org.bouncycastle.jce.provider.X509AttrCertParser x509AttrCertParser = new org.bouncycastle.jce.provider.X509AttrCertParser();
        while (it.hasNext()) {
            try {
                x509AttrCertParser.engineInit(new java.io.ByteArrayInputStream((byte[]) it.next()));
                org.bouncycastle.x509.X509AttributeCertificate x509AttributeCertificate = (org.bouncycastle.x509.X509AttributeCertificate) x509AttrCertParser.engineRead();
                if (x509AttributeCertStoreSelector.match(x509AttributeCertificate)) {
                    hashSet.add(x509AttributeCertificate);
                }
            } catch (org.bouncycastle.x509.util.StreamParsingException unused) {
            }
        }
        return hashSet;
    }

    private void getHighSpeedVideoSizes(java.lang.String str, java.util.List list) {
        synchronized (this) {
            java.sql.Date date = new java.sql.Date(java.lang.System.currentTimeMillis());
            java.util.ArrayList arrayList = new java.util.ArrayList();
            arrayList.add(date);
            arrayList.add(list);
            if (!this.getHighSpeedVideoFpsRangesFor.containsKey(str) && this.getHighSpeedVideoFpsRangesFor.size() >= getHighResolutionOutputSizeshNQ4ISI) {
                long time = date.getTime();
                java.lang.Object obj = null;
                for (java.util.Map.Entry entry : this.getHighSpeedVideoFpsRangesFor.entrySet()) {
                    long time2 = ((java.sql.Date) ((java.util.List) entry.getValue()).get(0)).getTime();
                    if (time2 < time) {
                        obj = entry.getKey();
                        time = time2;
                    }
                }
                this.getHighSpeedVideoFpsRangesFor.remove(obj);
            }
            this.getHighSpeedVideoFpsRangesFor.put(str, arrayList);
        }
    }

    public LDAPStoreHelper(org.bouncycastle.jce.X509LDAPCertStoreParameters x509LDAPCertStoreParameters) {
        this.getOutputMinFrameDuration = x509LDAPCertStoreParameters;
    }
}
