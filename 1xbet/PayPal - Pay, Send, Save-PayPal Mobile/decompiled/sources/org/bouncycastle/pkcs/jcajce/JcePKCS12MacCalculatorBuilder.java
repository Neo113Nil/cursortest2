package org.bouncycastle.pkcs.jcajce;

/* loaded from: classes17.dex */
public class JcePKCS12MacCalculatorBuilder implements org.bouncycastle.pkcs.PKCS12MacCalculatorBuilder {
    private org.bouncycastle.asn1.ASN1ObjectIdentifier Camera2StreamConfigurationMap;
    private java.security.SecureRandom getHighResolutionOutputSizeshNQ4ISI;
    private int getHighSpeedVideoFpsRanges;
    private org.bouncycastle.jcajce.util.JcaJceHelper getHighSpeedVideoFpsRangesFor;
    private int getHighSpeedVideoSizes;

    public org.bouncycastle.pkcs.jcajce.JcePKCS12MacCalculatorBuilder setProvider(java.security.Provider provider) {
        this.getHighSpeedVideoFpsRangesFor = new org.bouncycastle.jcajce.util.ProviderJcaJceHelper(provider);
        return this;
    }

    public org.bouncycastle.pkcs.jcajce.JcePKCS12MacCalculatorBuilder setProvider(java.lang.String str) {
        this.getHighSpeedVideoFpsRangesFor = new org.bouncycastle.jcajce.util.NamedJcaJceHelper(str);
        return this;
    }

    public org.bouncycastle.pkcs.jcajce.JcePKCS12MacCalculatorBuilder setIterationCount(int i) {
        this.getHighSpeedVideoFpsRanges = i;
        return this;
    }

    @Override // org.bouncycastle.pkcs.PKCS12MacCalculatorBuilder
    public org.bouncycastle.asn1.x509.AlgorithmIdentifier getDigestAlgorithmIdentifier() {
        return new org.bouncycastle.asn1.x509.AlgorithmIdentifier(this.Camera2StreamConfigurationMap, org.bouncycastle.asn1.DERNull.INSTANCE);
    }

    @Override // org.bouncycastle.pkcs.PKCS12MacCalculatorBuilder
    public org.bouncycastle.operator.MacCalculator build(char[] cArr) throws org.bouncycastle.operator.OperatorCreationException {
        if (this.getHighResolutionOutputSizeshNQ4ISI == null) {
            this.getHighResolutionOutputSizeshNQ4ISI = new java.security.SecureRandom();
        }
        try {
            final javax.crypto.Mac createMac = this.getHighSpeedVideoFpsRangesFor.createMac(this.Camera2StreamConfigurationMap.getId());
            int macLength = createMac.getMacLength();
            this.getHighSpeedVideoSizes = macLength;
            final byte[] bArr = new byte[macLength];
            this.getHighResolutionOutputSizeshNQ4ISI.nextBytes(bArr);
            javax.crypto.spec.PBEParameterSpec pBEParameterSpec = new javax.crypto.spec.PBEParameterSpec(bArr, this.getHighSpeedVideoFpsRanges);
            final org.bouncycastle.jcajce.PKCS12Key pKCS12Key = new org.bouncycastle.jcajce.PKCS12Key(cArr);
            createMac.init(pKCS12Key, pBEParameterSpec);
            return new org.bouncycastle.operator.MacCalculator() { // from class: org.bouncycastle.pkcs.jcajce.JcePKCS12MacCalculatorBuilder.1
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
                    return new org.bouncycastle.asn1.x509.AlgorithmIdentifier(org.bouncycastle.pkcs.jcajce.JcePKCS12MacCalculatorBuilder.this.Camera2StreamConfigurationMap, new org.bouncycastle.asn1.pkcs.PKCS12PBEParams(bArr, org.bouncycastle.pkcs.jcajce.JcePKCS12MacCalculatorBuilder.this.getHighSpeedVideoFpsRanges));
                }
            };
        } catch (java.lang.Exception e) {
            java.lang.StringBuilder sb = new java.lang.StringBuilder("unable to create MAC calculator: ");
            sb.append(e.getMessage());
            throw new org.bouncycastle.operator.OperatorCreationException(sb.toString(), e);
        }
    }

    public JcePKCS12MacCalculatorBuilder(org.bouncycastle.asn1.ASN1ObjectIdentifier aSN1ObjectIdentifier) {
        this.getHighSpeedVideoFpsRangesFor = new org.bouncycastle.jcajce.util.DefaultJcaJceHelper();
        this.getHighSpeedVideoFpsRanges = 1024;
        this.Camera2StreamConfigurationMap = aSN1ObjectIdentifier;
    }

    public JcePKCS12MacCalculatorBuilder() {
        this(org.bouncycastle.asn1.oiw.OIWObjectIdentifiers.idSHA1);
    }
}
