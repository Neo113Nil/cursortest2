package org.bouncycastle.operator.jcajce;

/* loaded from: classes17.dex */
public class JceInputDecryptorProviderBuilder {
    private org.bouncycastle.jcajce.util.JcaJceHelper getHighResolutionOutputSizeshNQ4ISI = new org.bouncycastle.jcajce.util.DefaultJcaJceHelper();

    public org.bouncycastle.operator.jcajce.JceInputDecryptorProviderBuilder setProvider(java.security.Provider provider) {
        this.getHighResolutionOutputSizeshNQ4ISI = new org.bouncycastle.jcajce.util.ProviderJcaJceHelper(provider);
        return this;
    }

    public org.bouncycastle.operator.jcajce.JceInputDecryptorProviderBuilder setProvider(java.lang.String str) {
        this.getHighResolutionOutputSizeshNQ4ISI = new org.bouncycastle.jcajce.util.NamedJcaJceHelper(str);
        return this;
    }

    public org.bouncycastle.operator.InputDecryptorProvider build(byte[] bArr) {
        final byte[] clone = org.bouncycastle.util.Arrays.clone(bArr);
        return new org.bouncycastle.operator.InputDecryptorProvider() { // from class: org.bouncycastle.operator.jcajce.JceInputDecryptorProviderBuilder.1
            private org.bouncycastle.asn1.x509.AlgorithmIdentifier getHighSpeedVideoFpsRanges;
            private javax.crypto.Cipher getHighSpeedVideoFpsRangesFor;

            @Override // org.bouncycastle.operator.InputDecryptorProvider
            public org.bouncycastle.operator.InputDecryptor get(org.bouncycastle.asn1.x509.AlgorithmIdentifier algorithmIdentifier) throws org.bouncycastle.operator.OperatorCreationException {
                javax.crypto.Cipher cipher;
                java.security.spec.AlgorithmParameterSpec gOST28147ParameterSpec;
                this.getHighSpeedVideoFpsRanges = algorithmIdentifier;
                org.bouncycastle.asn1.ASN1ObjectIdentifier algorithm = algorithmIdentifier.getAlgorithm();
                try {
                    this.getHighSpeedVideoFpsRangesFor = org.bouncycastle.operator.jcajce.JceInputDecryptorProviderBuilder.this.getHighResolutionOutputSizeshNQ4ISI.createCipher(algorithm.getId());
                    javax.crypto.spec.SecretKeySpec secretKeySpec = new javax.crypto.spec.SecretKeySpec(clone, algorithm.getId());
                    org.bouncycastle.asn1.ASN1Encodable parameters = algorithmIdentifier.getParameters();
                    if (parameters instanceof org.bouncycastle.asn1.ASN1OctetString) {
                        cipher = this.getHighSpeedVideoFpsRangesFor;
                        gOST28147ParameterSpec = new javax.crypto.spec.IvParameterSpec(org.bouncycastle.asn1.ASN1OctetString.getInstance(parameters).getOctets());
                    } else {
                        org.bouncycastle.asn1.cryptopro.GOST28147Parameters gOST28147Parameters = org.bouncycastle.asn1.cryptopro.GOST28147Parameters.getInstance(parameters);
                        cipher = this.getHighSpeedVideoFpsRangesFor;
                        gOST28147ParameterSpec = new org.bouncycastle.jcajce.spec.GOST28147ParameterSpec(gOST28147Parameters.getEncryptionParamSet(), gOST28147Parameters.getIV());
                    }
                    cipher.init(2, secretKeySpec, gOST28147ParameterSpec);
                    return new org.bouncycastle.operator.InputDecryptor() { // from class: org.bouncycastle.operator.jcajce.JceInputDecryptorProviderBuilder.1.1
                        @Override // org.bouncycastle.operator.InputDecryptor
                        public java.io.InputStream getInputStream(java.io.InputStream inputStream) {
                            return new org.bouncycastle.jcajce.io.CipherInputStream(inputStream, org.bouncycastle.operator.jcajce.JceInputDecryptorProviderBuilder.AnonymousClass1.this.getHighSpeedVideoFpsRangesFor);
                        }

                        @Override // org.bouncycastle.operator.InputDecryptor
                        public org.bouncycastle.asn1.x509.AlgorithmIdentifier getAlgorithmIdentifier() {
                            return org.bouncycastle.operator.jcajce.JceInputDecryptorProviderBuilder.AnonymousClass1.this.getHighSpeedVideoFpsRanges;
                        }
                    };
                } catch (java.lang.Exception e) {
                    java.lang.StringBuilder sb = new java.lang.StringBuilder("unable to create InputDecryptor: ");
                    sb.append(e.getMessage());
                    throw new org.bouncycastle.operator.OperatorCreationException(sb.toString(), e);
                }
            }
        };
    }
}
