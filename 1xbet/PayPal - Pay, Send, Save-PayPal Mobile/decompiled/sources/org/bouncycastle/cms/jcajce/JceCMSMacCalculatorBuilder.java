package org.bouncycastle.cms.jcajce;

import org.bouncycastle.cms.jcajce.EnvelopedDataHelper.AnonymousClass2;

/* loaded from: classes17.dex */
public class JceCMSMacCalculatorBuilder {
    private org.bouncycastle.cms.jcajce.EnvelopedDataHelper Camera2StreamConfigurationMap;
    private java.security.AlgorithmParameters getHighResolutionOutputSizeshNQ4ISI;
    private final int getHighSpeedVideoFpsRanges;
    private final org.bouncycastle.asn1.ASN1ObjectIdentifier getHighSpeedVideoFpsRangesFor;
    private java.security.SecureRandom getHighSpeedVideoSizes;

    class CMSMacCalculator implements org.bouncycastle.operator.MacCalculator {
        private javax.crypto.SecretKey getHighResolutionOutputSizeshNQ4ISI;
        private javax.crypto.Mac getHighSpeedVideoFpsRanges;
        private org.bouncycastle.asn1.x509.AlgorithmIdentifier getHighSpeedVideoSizes;

        CMSMacCalculator(org.bouncycastle.asn1.ASN1ObjectIdentifier aSN1ObjectIdentifier, int i, java.security.AlgorithmParameters algorithmParameters, java.security.SecureRandom secureRandom) throws org.bouncycastle.cms.CMSException {
            javax.crypto.KeyGenerator createKeyGenerator = org.bouncycastle.cms.jcajce.JceCMSMacCalculatorBuilder.this.Camera2StreamConfigurationMap.createKeyGenerator(aSN1ObjectIdentifier);
            secureRandom = secureRandom == null ? new java.security.SecureRandom() : secureRandom;
            if (i < 0) {
                createKeyGenerator.init(secureRandom);
            } else {
                createKeyGenerator.init(i, secureRandom);
            }
            this.getHighResolutionOutputSizeshNQ4ISI = createKeyGenerator.generateKey();
            algorithmParameters = algorithmParameters == null ? org.bouncycastle.cms.jcajce.JceCMSMacCalculatorBuilder.this.Camera2StreamConfigurationMap.getHighSpeedVideoFpsRanges(aSN1ObjectIdentifier, this.getHighResolutionOutputSizeshNQ4ISI, secureRandom) : algorithmParameters;
            org.bouncycastle.cms.jcajce.EnvelopedDataHelper unused = org.bouncycastle.cms.jcajce.JceCMSMacCalculatorBuilder.this.Camera2StreamConfigurationMap;
            this.getHighSpeedVideoSizes = org.bouncycastle.cms.jcajce.EnvelopedDataHelper.getHighResolutionOutputSizeshNQ4ISI(aSN1ObjectIdentifier, algorithmParameters);
            this.getHighSpeedVideoFpsRanges = (javax.crypto.Mac) org.bouncycastle.cms.jcajce.EnvelopedDataHelper.Camera2StreamConfigurationMap(org.bouncycastle.cms.jcajce.JceCMSMacCalculatorBuilder.this.Camera2StreamConfigurationMap.new AnonymousClass2(this.getHighSpeedVideoSizes, this.getHighResolutionOutputSizeshNQ4ISI));
        }

        @Override // org.bouncycastle.operator.MacCalculator
        public java.io.OutputStream getOutputStream() {
            return new org.bouncycastle.jcajce.io.MacOutputStream(this.getHighSpeedVideoFpsRanges);
        }

        @Override // org.bouncycastle.operator.MacCalculator
        public byte[] getMac() {
            return this.getHighSpeedVideoFpsRanges.doFinal();
        }

        @Override // org.bouncycastle.operator.MacCalculator
        public org.bouncycastle.operator.GenericKey getKey() {
            return new org.bouncycastle.operator.jcajce.JceGenericKey(this.getHighSpeedVideoSizes, this.getHighResolutionOutputSizeshNQ4ISI);
        }

        @Override // org.bouncycastle.operator.MacCalculator
        public org.bouncycastle.asn1.x509.AlgorithmIdentifier getAlgorithmIdentifier() {
            return this.getHighSpeedVideoSizes;
        }
    }

    public org.bouncycastle.cms.jcajce.JceCMSMacCalculatorBuilder setSecureRandom(java.security.SecureRandom secureRandom) {
        this.getHighSpeedVideoSizes = secureRandom;
        return this;
    }

    public org.bouncycastle.cms.jcajce.JceCMSMacCalculatorBuilder setProvider(java.security.Provider provider) {
        this.Camera2StreamConfigurationMap = new org.bouncycastle.cms.jcajce.EnvelopedDataHelper(new org.bouncycastle.cms.jcajce.ProviderJcaJceExtHelper(provider));
        return this;
    }

    public org.bouncycastle.cms.jcajce.JceCMSMacCalculatorBuilder setProvider(java.lang.String str) {
        this.Camera2StreamConfigurationMap = new org.bouncycastle.cms.jcajce.EnvelopedDataHelper(new org.bouncycastle.cms.jcajce.NamedJcaJceExtHelper(str));
        return this;
    }

    public org.bouncycastle.cms.jcajce.JceCMSMacCalculatorBuilder setAlgorithmParameters(java.security.AlgorithmParameters algorithmParameters) {
        this.getHighResolutionOutputSizeshNQ4ISI = algorithmParameters;
        return this;
    }

    public org.bouncycastle.operator.MacCalculator build() throws org.bouncycastle.cms.CMSException {
        return new org.bouncycastle.cms.jcajce.JceCMSMacCalculatorBuilder.CMSMacCalculator(this.getHighSpeedVideoFpsRangesFor, this.getHighSpeedVideoFpsRanges, this.getHighResolutionOutputSizeshNQ4ISI, this.getHighSpeedVideoSizes);
    }

    public JceCMSMacCalculatorBuilder(org.bouncycastle.asn1.ASN1ObjectIdentifier aSN1ObjectIdentifier, int i) {
        this.Camera2StreamConfigurationMap = new org.bouncycastle.cms.jcajce.EnvelopedDataHelper(new org.bouncycastle.cms.jcajce.DefaultJcaJceExtHelper());
        this.getHighSpeedVideoFpsRangesFor = aSN1ObjectIdentifier;
        this.getHighSpeedVideoFpsRanges = i;
    }

    public JceCMSMacCalculatorBuilder(org.bouncycastle.asn1.ASN1ObjectIdentifier aSN1ObjectIdentifier) {
        this(aSN1ObjectIdentifier, -1);
    }
}
