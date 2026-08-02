package org.bouncycastle.pkcs.jcajce;

/* loaded from: classes17.dex */
public class JcePKCS12MacCalculatorBuilderProvider implements org.bouncycastle.pkcs.PKCS12MacCalculatorBuilderProvider {
    private org.bouncycastle.jcajce.util.JcaJceHelper getHighSpeedVideoFpsRanges = new org.bouncycastle.jcajce.util.DefaultJcaJceHelper();

    public org.bouncycastle.pkcs.jcajce.JcePKCS12MacCalculatorBuilderProvider setProvider(java.security.Provider provider) {
        this.getHighSpeedVideoFpsRanges = new org.bouncycastle.jcajce.util.ProviderJcaJceHelper(provider);
        return this;
    }

    public org.bouncycastle.pkcs.jcajce.JcePKCS12MacCalculatorBuilderProvider setProvider(java.lang.String str) {
        this.getHighSpeedVideoFpsRanges = new org.bouncycastle.jcajce.util.NamedJcaJceHelper(str);
        return this;
    }

    @Override // org.bouncycastle.pkcs.PKCS12MacCalculatorBuilderProvider
    public org.bouncycastle.pkcs.PKCS12MacCalculatorBuilder get(final org.bouncycastle.asn1.x509.AlgorithmIdentifier algorithmIdentifier) {
        return new org.bouncycastle.pkcs.PKCS12MacCalculatorBuilder() { // from class: org.bouncycastle.pkcs.jcajce.JcePKCS12MacCalculatorBuilderProvider.1
            @Override // org.bouncycastle.pkcs.PKCS12MacCalculatorBuilder
            public org.bouncycastle.asn1.x509.AlgorithmIdentifier getDigestAlgorithmIdentifier() {
                return new org.bouncycastle.asn1.x509.AlgorithmIdentifier(algorithmIdentifier.getAlgorithm(), org.bouncycastle.asn1.DERNull.INSTANCE);
            }

            @Override // org.bouncycastle.pkcs.PKCS12MacCalculatorBuilder
            public org.bouncycastle.operator.MacCalculator build(char[] cArr) throws org.bouncycastle.operator.OperatorCreationException {
                final org.bouncycastle.asn1.pkcs.PKCS12PBEParams pKCS12PBEParams = org.bouncycastle.asn1.pkcs.PKCS12PBEParams.getInstance(algorithmIdentifier.getParameters());
                try {
                    final org.bouncycastle.asn1.ASN1ObjectIdentifier algorithm = algorithmIdentifier.getAlgorithm();
                    final javax.crypto.Mac createMac = org.bouncycastle.pkcs.jcajce.JcePKCS12MacCalculatorBuilderProvider.this.getHighSpeedVideoFpsRanges.createMac(algorithm.getId());
                    javax.crypto.spec.PBEParameterSpec pBEParameterSpec = new javax.crypto.spec.PBEParameterSpec(pKCS12PBEParams.getIV(), pKCS12PBEParams.getIterations().intValue());
                    final org.bouncycastle.jcajce.PKCS12Key pKCS12Key = new org.bouncycastle.jcajce.PKCS12Key(cArr);
                    createMac.init(pKCS12Key, pBEParameterSpec);
                    return new org.bouncycastle.operator.MacCalculator() { // from class: org.bouncycastle.pkcs.jcajce.JcePKCS12MacCalculatorBuilderProvider.1.1
                        @Override // org.bouncycastle.operator.MacCalculator
                        public java.io.OutputStream getOutputStream() {
                            return new org.bouncycastle.jcajce.io.MacOutputStream(createMac);
                        }

                        @Override // org.bouncycastle.operator.MacCalculator
                        public byte[] getMac() {
                            return createMac.doFinal();
                        }

                        @Override // org.bouncycastle.operator.MacCalculator
                        public org.bouncycastle.operator.GenericKey getKey() {
                            return new org.bouncycastle.operator.GenericKey(getAlgorithmIdentifier(), pKCS12Key.getEncoded());
                        }

                        @Override // org.bouncycastle.operator.MacCalculator
                        public org.bouncycastle.asn1.x509.AlgorithmIdentifier getAlgorithmIdentifier() {
                            return new org.bouncycastle.asn1.x509.AlgorithmIdentifier(algorithm, pKCS12PBEParams);
                        }
                    };
                } catch (java.lang.Exception e) {
                    java.lang.StringBuilder sb = new java.lang.StringBuilder("unable to create MAC calculator: ");
                    sb.append(e.getMessage());
                    throw new org.bouncycastle.operator.OperatorCreationException(sb.toString(), e);
                }
            }
        };
    }
}
