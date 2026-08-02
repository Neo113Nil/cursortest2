package org.bouncycastle.est.jcajce;

/* loaded from: classes17.dex */
public class JcaHttpAuthBuilder {
    private java.security.SecureRandom Camera2StreamConfigurationMap;
    private final java.lang.String getHighResolutionOutputSizeshNQ4ISI;
    private org.bouncycastle.operator.jcajce.JcaDigestCalculatorProviderBuilder getHighSpeedVideoFpsRanges;
    private final java.lang.String getHighSpeedVideoFpsRangesFor;
    private final char[] getHighSpeedVideoSizes;

    public org.bouncycastle.est.jcajce.JcaHttpAuthBuilder setProvider(java.security.Provider provider) {
        this.getHighSpeedVideoFpsRanges.setProvider(provider);
        return this;
    }

    public org.bouncycastle.est.jcajce.JcaHttpAuthBuilder setProvider(java.lang.String str) {
        this.getHighSpeedVideoFpsRanges.setProvider(str);
        return this;
    }

    public org.bouncycastle.est.jcajce.JcaHttpAuthBuilder setNonceGenerator(java.security.SecureRandom secureRandom) {
        this.Camera2StreamConfigurationMap = secureRandom;
        return this;
    }

    public org.bouncycastle.est.HttpAuth build() throws org.bouncycastle.operator.OperatorCreationException {
        return new org.bouncycastle.est.HttpAuth(this.getHighSpeedVideoFpsRangesFor, this.getHighResolutionOutputSizeshNQ4ISI, this.getHighSpeedVideoSizes, this.Camera2StreamConfigurationMap, this.getHighSpeedVideoFpsRanges.build());
    }

    public JcaHttpAuthBuilder(java.lang.String str, char[] cArr) {
        this(null, str, cArr);
    }

    public JcaHttpAuthBuilder(java.lang.String str, java.lang.String str2, char[] cArr) {
        this.getHighSpeedVideoFpsRanges = new org.bouncycastle.operator.jcajce.JcaDigestCalculatorProviderBuilder();
        this.Camera2StreamConfigurationMap = new java.security.SecureRandom();
        this.getHighSpeedVideoFpsRangesFor = str;
        this.getHighResolutionOutputSizeshNQ4ISI = str2;
        this.getHighSpeedVideoSizes = cArr;
    }
}
