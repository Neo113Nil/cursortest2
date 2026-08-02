package org.bouncycastle.jcajce.provider.asymmetric;

/* loaded from: classes17.dex */
public class COMPOSITE {
    private static org.bouncycastle.jcajce.provider.util.AsymmetricKeyInfoConverter Camera2StreamConfigurationMap;
    private static final java.util.Map<java.lang.String, java.lang.String> getHighSpeedVideoFpsRangesFor;

    public static class KeyFactory extends org.bouncycastle.jcajce.provider.asymmetric.util.BaseKeyFactorySpi {
        @Override // org.bouncycastle.jcajce.provider.util.AsymmetricKeyInfoConverter
        public java.security.PublicKey generatePublic(org.bouncycastle.asn1.x509.SubjectPublicKeyInfo subjectPublicKeyInfo) throws java.io.IOException {
            return org.bouncycastle.jcajce.provider.asymmetric.COMPOSITE.Camera2StreamConfigurationMap.generatePublic(subjectPublicKeyInfo);
        }

        @Override // org.bouncycastle.jcajce.provider.util.AsymmetricKeyInfoConverter
        public java.security.PrivateKey generatePrivate(org.bouncycastle.asn1.pkcs.PrivateKeyInfo privateKeyInfo) throws java.io.IOException {
            return org.bouncycastle.jcajce.provider.asymmetric.COMPOSITE.Camera2StreamConfigurationMap.generatePrivate(privateKeyInfo);
        }

        @Override // java.security.KeyFactorySpi
        protected java.security.Key engineTranslateKey(java.security.Key key) throws java.security.InvalidKeyException {
            try {
                if (key instanceof java.security.PrivateKey) {
                    return generatePrivate(org.bouncycastle.asn1.pkcs.PrivateKeyInfo.getInstance(key.getEncoded()));
                }
                if (key instanceof java.security.PublicKey) {
                    return generatePublic(org.bouncycastle.asn1.x509.SubjectPublicKeyInfo.getInstance(key.getEncoded()));
                }
                throw new java.security.InvalidKeyException("key not recognized");
            } catch (java.io.IOException e) {
                java.lang.StringBuilder sb = new java.lang.StringBuilder("key could not be parsed: ");
                sb.append(e.getMessage());
                throw new java.security.InvalidKeyException(sb.toString());
            }
        }
    }

    static class CompositeKeyInfoConverter implements org.bouncycastle.jcajce.provider.util.AsymmetricKeyInfoConverter {
        private final org.bouncycastle.jcajce.provider.config.ConfigurableProvider getHighSpeedVideoFpsRangesFor;

        @Override // org.bouncycastle.jcajce.provider.util.AsymmetricKeyInfoConverter
        public java.security.PublicKey generatePublic(org.bouncycastle.asn1.x509.SubjectPublicKeyInfo subjectPublicKeyInfo) throws java.io.IOException {
            org.bouncycastle.asn1.ASN1Sequence aSN1Sequence = org.bouncycastle.asn1.ASN1Sequence.getInstance(subjectPublicKeyInfo.getPublicKeyData().getBytes());
            java.security.PublicKey[] publicKeyArr = new java.security.PublicKey[aSN1Sequence.size()];
            for (int i = 0; i != aSN1Sequence.size(); i++) {
                org.bouncycastle.asn1.x509.SubjectPublicKeyInfo subjectPublicKeyInfo2 = org.bouncycastle.asn1.x509.SubjectPublicKeyInfo.getInstance(aSN1Sequence.getObjectAt(i));
                publicKeyArr[i] = this.getHighSpeedVideoFpsRangesFor.getKeyInfoConverter(subjectPublicKeyInfo2.getAlgorithm().getAlgorithm()).generatePublic(subjectPublicKeyInfo2);
            }
            return new org.bouncycastle.jcajce.CompositePublicKey(publicKeyArr);
        }

        @Override // org.bouncycastle.jcajce.provider.util.AsymmetricKeyInfoConverter
        public java.security.PrivateKey generatePrivate(org.bouncycastle.asn1.pkcs.PrivateKeyInfo privateKeyInfo) throws java.io.IOException {
            org.bouncycastle.asn1.ASN1Sequence aSN1Sequence = org.bouncycastle.asn1.ASN1Sequence.getInstance(privateKeyInfo.getPrivateKey().getOctets());
            java.security.PrivateKey[] privateKeyArr = new java.security.PrivateKey[aSN1Sequence.size()];
            for (int i = 0; i != aSN1Sequence.size(); i++) {
                org.bouncycastle.asn1.pkcs.PrivateKeyInfo privateKeyInfo2 = org.bouncycastle.asn1.pkcs.PrivateKeyInfo.getInstance(aSN1Sequence.getObjectAt(i));
                privateKeyArr[i] = this.getHighSpeedVideoFpsRangesFor.getKeyInfoConverter(privateKeyInfo2.getPrivateKeyAlgorithm().getAlgorithm()).generatePrivate(privateKeyInfo2);
            }
            return new org.bouncycastle.jcajce.CompositePrivateKey(privateKeyArr);
        }

        public CompositeKeyInfoConverter(org.bouncycastle.jcajce.provider.config.ConfigurableProvider configurableProvider) {
            this.getHighSpeedVideoFpsRangesFor = configurableProvider;
        }
    }

    public static class Mappings extends org.bouncycastle.jcajce.provider.util.AsymmetricAlgorithmProvider {
        @Override // org.bouncycastle.jcajce.provider.util.AlgorithmProvider
        public void configure(org.bouncycastle.jcajce.provider.config.ConfigurableProvider configurableProvider) {
            configurableProvider.addAlgorithm("KeyFactory.COMPOSITE", "org.bouncycastle.jcajce.provider.asymmetric.COMPOSITE$KeyFactory");
            java.lang.StringBuilder sb = new java.lang.StringBuilder("KeyFactory.");
            sb.append(org.bouncycastle.asn1.misc.MiscObjectIdentifiers.id_alg_composite);
            configurableProvider.addAlgorithm(sb.toString(), "org.bouncycastle.jcajce.provider.asymmetric.COMPOSITE$KeyFactory");
            java.lang.StringBuilder sb2 = new java.lang.StringBuilder("KeyFactory.OID.");
            sb2.append(org.bouncycastle.asn1.misc.MiscObjectIdentifiers.id_alg_composite);
            configurableProvider.addAlgorithm(sb2.toString(), "org.bouncycastle.jcajce.provider.asymmetric.COMPOSITE$KeyFactory");
            org.bouncycastle.jcajce.provider.util.AsymmetricKeyInfoConverter unused = org.bouncycastle.jcajce.provider.asymmetric.COMPOSITE.Camera2StreamConfigurationMap = new org.bouncycastle.jcajce.provider.asymmetric.COMPOSITE.CompositeKeyInfoConverter(configurableProvider);
            configurableProvider.addKeyInfoConverter(org.bouncycastle.asn1.misc.MiscObjectIdentifiers.id_alg_composite, org.bouncycastle.jcajce.provider.asymmetric.COMPOSITE.Camera2StreamConfigurationMap);
        }
    }

    static {
        java.util.HashMap hashMap = new java.util.HashMap();
        getHighSpeedVideoFpsRangesFor = hashMap;
        hashMap.put("SupportedKeyClasses", "org.bouncycastle.jcajce.CompositePublicKey|org.bouncycastle.jcajce.CompositePrivateKey");
        hashMap.put("SupportedKeyFormats", "PKCS#8|X.509");
    }
}
