package org.bouncycastle.est.jcajce;

/* loaded from: classes17.dex */
public class JcaJceUtils {
    public static void validateServerCertUsage(java.security.cert.X509Certificate x509Certificate) throws java.security.cert.CertificateException {
        try {
            org.bouncycastle.cert.X509CertificateHolder x509CertificateHolder = new org.bouncycastle.cert.X509CertificateHolder(x509Certificate.getEncoded());
            org.bouncycastle.asn1.x509.KeyUsage fromExtensions = org.bouncycastle.asn1.x509.KeyUsage.fromExtensions(x509CertificateHolder.getExtensions());
            if (fromExtensions != null) {
                if (fromExtensions.hasUsages(4)) {
                    throw new java.security.cert.CertificateException("Key usage must not contain keyCertSign");
                }
                if (!fromExtensions.hasUsages(128) && !fromExtensions.hasUsages(32)) {
                    throw new java.security.cert.CertificateException("Key usage must be none, digitalSignature or keyEncipherment");
                }
            }
            org.bouncycastle.asn1.x509.ExtendedKeyUsage fromExtensions2 = org.bouncycastle.asn1.x509.ExtendedKeyUsage.fromExtensions(x509CertificateHolder.getExtensions());
            if (fromExtensions2 != null && !fromExtensions2.hasKeyPurposeId(org.bouncycastle.asn1.x509.KeyPurposeId.id_kp_serverAuth) && !fromExtensions2.hasKeyPurposeId(org.bouncycastle.asn1.x509.KeyPurposeId.id_kp_msSGC) && !fromExtensions2.hasKeyPurposeId(org.bouncycastle.asn1.x509.KeyPurposeId.id_kp_nsSGC)) {
                throw new java.security.cert.CertificateException("Certificate extended key usage must include serverAuth, msSGC or nsSGC");
            }
        } catch (java.security.cert.CertificateException e) {
            throw e;
        } catch (java.lang.Exception e2) {
            throw new java.security.cert.CertificateException(e2.getMessage(), e2);
        }
    }

    public static javax.net.ssl.X509TrustManager getTrustAllTrustManager() {
        return new javax.net.ssl.X509TrustManager() { // from class: org.bouncycastle.est.jcajce.JcaJceUtils.1
            @Override // javax.net.ssl.X509TrustManager
            public final void checkClientTrusted(java.security.cert.X509Certificate[] x509CertificateArr, java.lang.String str) throws java.security.cert.CertificateException {
            }

            @Override // javax.net.ssl.X509TrustManager
            public final void checkServerTrusted(java.security.cert.X509Certificate[] x509CertificateArr, java.lang.String str) throws java.security.cert.CertificateException {
            }

            @Override // javax.net.ssl.X509TrustManager
            public final java.security.cert.X509Certificate[] getAcceptedIssuers() {
                return new java.security.cert.X509Certificate[0];
            }
        };
    }

    public static javax.net.ssl.X509TrustManager[] getCertPathTrustManager(final java.util.Set<java.security.cert.TrustAnchor> set, final java.security.cert.CRL[] crlArr) {
        final java.security.cert.X509Certificate[] x509CertificateArr = new java.security.cert.X509Certificate[set.size()];
        java.util.Iterator<java.security.cert.TrustAnchor> it = set.iterator();
        int i = 0;
        while (it.hasNext()) {
            x509CertificateArr[i] = it.next().getTrustedCert();
            i++;
        }
        return new javax.net.ssl.X509TrustManager[]{new javax.net.ssl.X509TrustManager() { // from class: org.bouncycastle.est.jcajce.JcaJceUtils.2
            @Override // javax.net.ssl.X509TrustManager
            public final void checkClientTrusted(java.security.cert.X509Certificate[] x509CertificateArr2, java.lang.String str) throws java.security.cert.CertificateException {
            }

            @Override // javax.net.ssl.X509TrustManager
            public final java.security.cert.X509Certificate[] getAcceptedIssuers() {
                java.security.cert.X509Certificate[] x509CertificateArr2 = x509CertificateArr;
                int length = x509CertificateArr2.length;
                java.security.cert.X509Certificate[] x509CertificateArr3 = new java.security.cert.X509Certificate[length];
                java.lang.System.arraycopy(x509CertificateArr2, 0, x509CertificateArr3, 0, length);
                return x509CertificateArr3;
            }

            @Override // javax.net.ssl.X509TrustManager
            public final void checkServerTrusted(java.security.cert.X509Certificate[] x509CertificateArr2, java.lang.String str) throws java.security.cert.CertificateException {
                try {
                    java.security.cert.CertStore certStore = java.security.cert.CertStore.getInstance("Collection", new java.security.cert.CollectionCertStoreParameters(java.util.Arrays.asList(x509CertificateArr2)), org.bouncycastle.jce.provider.BouncyCastleProvider.PROVIDER_NAME);
                    java.security.cert.CertPathBuilder certPathBuilder = java.security.cert.CertPathBuilder.getInstance("PKIX", org.bouncycastle.jce.provider.BouncyCastleProvider.PROVIDER_NAME);
                    java.security.cert.X509CertSelector x509CertSelector = new java.security.cert.X509CertSelector();
                    x509CertSelector.setCertificate(x509CertificateArr2[0]);
                    java.security.cert.PKIXBuilderParameters pKIXBuilderParameters = new java.security.cert.PKIXBuilderParameters((java.util.Set<java.security.cert.TrustAnchor>) set, x509CertSelector);
                    pKIXBuilderParameters.addCertStore(certStore);
                    if (crlArr != null) {
                        pKIXBuilderParameters.setRevocationEnabled(true);
                        pKIXBuilderParameters.addCertStore(java.security.cert.CertStore.getInstance("Collection", new java.security.cert.CollectionCertStoreParameters(java.util.Arrays.asList(crlArr))));
                    } else {
                        pKIXBuilderParameters.setRevocationEnabled(false);
                    }
                    org.bouncycastle.est.jcajce.JcaJceUtils.validateServerCertUsage(x509CertificateArr2[0]);
                } catch (java.security.cert.CertificateException e) {
                    throw e;
                } catch (java.security.GeneralSecurityException e2) {
                    java.lang.StringBuilder sb = new java.lang.StringBuilder("unable to process certificates: ");
                    sb.append(e2.getMessage());
                    throw new java.security.cert.CertificateException(sb.toString(), e2);
                }
            }
        }};
    }

    public static javax.net.ssl.KeyManagerFactory createKeyManagerFactory(java.lang.String str, java.lang.String str2, java.security.KeyStore keyStore, char[] cArr) throws java.security.UnrecoverableKeyException, java.security.NoSuchAlgorithmException, java.security.KeyStoreException, java.security.NoSuchProviderException {
        javax.net.ssl.KeyManagerFactory keyManagerFactory;
        if (str == null && str2 == null) {
            str = javax.net.ssl.KeyManagerFactory.getDefaultAlgorithm();
        } else if (str2 != null) {
            keyManagerFactory = javax.net.ssl.KeyManagerFactory.getInstance(str, str2);
            keyManagerFactory.init(keyStore, cArr);
            return keyManagerFactory;
        }
        keyManagerFactory = javax.net.ssl.KeyManagerFactory.getInstance(str);
        keyManagerFactory.init(keyStore, cArr);
        return keyManagerFactory;
    }
}
