package org.bouncycastle.pqc.jcajce.spec;

/* loaded from: classes17.dex */
public class XMSSMTParameterSpec implements java.security.spec.AlgorithmParameterSpec {
    public static final java.lang.String SHA256 = "SHA256";
    public static final java.lang.String SHA512 = "SHA512";
    public static final java.lang.String SHAKE128 = "SHAKE128";
    public static final java.lang.String SHAKE256 = "SHAKE256";
    private final int Camera2StreamConfigurationMap;
    private final java.lang.String getHighResolutionOutputSizeshNQ4ISI;
    private final int getHighSpeedVideoFpsRanges;
    public static final org.bouncycastle.pqc.jcajce.spec.XMSSMTParameterSpec XMSSMT_SHA2_20d2_256 = new org.bouncycastle.pqc.jcajce.spec.XMSSMTParameterSpec(20, 2, "SHA256");
    public static final org.bouncycastle.pqc.jcajce.spec.XMSSMTParameterSpec XMSSMT_SHA2_20d4_256 = new org.bouncycastle.pqc.jcajce.spec.XMSSMTParameterSpec(20, 4, "SHA256");
    public static final org.bouncycastle.pqc.jcajce.spec.XMSSMTParameterSpec XMSSMT_SHA2_40d2_256 = new org.bouncycastle.pqc.jcajce.spec.XMSSMTParameterSpec(40, 2, "SHA256");
    public static final org.bouncycastle.pqc.jcajce.spec.XMSSMTParameterSpec XMSSMT_SHA2_40d4_256 = new org.bouncycastle.pqc.jcajce.spec.XMSSMTParameterSpec(40, 4, "SHA256");
    public static final org.bouncycastle.pqc.jcajce.spec.XMSSMTParameterSpec XMSSMT_SHA2_40d8_256 = new org.bouncycastle.pqc.jcajce.spec.XMSSMTParameterSpec(40, 8, "SHA256");
    public static final org.bouncycastle.pqc.jcajce.spec.XMSSMTParameterSpec XMSSMT_SHA2_60d3_256 = new org.bouncycastle.pqc.jcajce.spec.XMSSMTParameterSpec(60, 3, "SHA256");
    public static final org.bouncycastle.pqc.jcajce.spec.XMSSMTParameterSpec XMSSMT_SHA2_60d6_256 = new org.bouncycastle.pqc.jcajce.spec.XMSSMTParameterSpec(60, 6, "SHA256");
    public static final org.bouncycastle.pqc.jcajce.spec.XMSSMTParameterSpec XMSSMT_SHA2_60d12_256 = new org.bouncycastle.pqc.jcajce.spec.XMSSMTParameterSpec(60, 12, "SHA256");
    public static final org.bouncycastle.pqc.jcajce.spec.XMSSMTParameterSpec XMSSMT_SHA2_20d2_512 = new org.bouncycastle.pqc.jcajce.spec.XMSSMTParameterSpec(20, 2, "SHA512");
    public static final org.bouncycastle.pqc.jcajce.spec.XMSSMTParameterSpec XMSSMT_SHA2_20d4_512 = new org.bouncycastle.pqc.jcajce.spec.XMSSMTParameterSpec(20, 4, "SHA512");
    public static final org.bouncycastle.pqc.jcajce.spec.XMSSMTParameterSpec XMSSMT_SHA2_40d2_512 = new org.bouncycastle.pqc.jcajce.spec.XMSSMTParameterSpec(40, 2, "SHA512");
    public static final org.bouncycastle.pqc.jcajce.spec.XMSSMTParameterSpec XMSSMT_SHA2_40d4_512 = new org.bouncycastle.pqc.jcajce.spec.XMSSMTParameterSpec(40, 4, "SHA512");
    public static final org.bouncycastle.pqc.jcajce.spec.XMSSMTParameterSpec XMSSMT_SHA2_40d8_512 = new org.bouncycastle.pqc.jcajce.spec.XMSSMTParameterSpec(40, 8, "SHA512");
    public static final org.bouncycastle.pqc.jcajce.spec.XMSSMTParameterSpec XMSSMT_SHA2_60d3_512 = new org.bouncycastle.pqc.jcajce.spec.XMSSMTParameterSpec(60, 3, "SHA512");
    public static final org.bouncycastle.pqc.jcajce.spec.XMSSMTParameterSpec XMSSMT_SHA2_60d6_512 = new org.bouncycastle.pqc.jcajce.spec.XMSSMTParameterSpec(60, 6, "SHA512");
    public static final org.bouncycastle.pqc.jcajce.spec.XMSSMTParameterSpec XMSSMT_SHA2_60d12_512 = new org.bouncycastle.pqc.jcajce.spec.XMSSMTParameterSpec(60, 12, "SHA512");
    public static final org.bouncycastle.pqc.jcajce.spec.XMSSMTParameterSpec XMSSMT_SHAKE_20d2_256 = new org.bouncycastle.pqc.jcajce.spec.XMSSMTParameterSpec(20, 2, "SHAKE128");
    public static final org.bouncycastle.pqc.jcajce.spec.XMSSMTParameterSpec XMSSMT_SHAKE_20d4_256 = new org.bouncycastle.pqc.jcajce.spec.XMSSMTParameterSpec(20, 4, "SHAKE128");
    public static final org.bouncycastle.pqc.jcajce.spec.XMSSMTParameterSpec XMSSMT_SHAKE_40d2_256 = new org.bouncycastle.pqc.jcajce.spec.XMSSMTParameterSpec(40, 2, "SHAKE128");
    public static final org.bouncycastle.pqc.jcajce.spec.XMSSMTParameterSpec XMSSMT_SHAKE_40d4_256 = new org.bouncycastle.pqc.jcajce.spec.XMSSMTParameterSpec(40, 4, "SHAKE128");
    public static final org.bouncycastle.pqc.jcajce.spec.XMSSMTParameterSpec XMSSMT_SHAKE_40d8_256 = new org.bouncycastle.pqc.jcajce.spec.XMSSMTParameterSpec(40, 8, "SHAKE128");
    public static final org.bouncycastle.pqc.jcajce.spec.XMSSMTParameterSpec XMSSMT_SHAKE_60d3_256 = new org.bouncycastle.pqc.jcajce.spec.XMSSMTParameterSpec(60, 3, "SHAKE128");
    public static final org.bouncycastle.pqc.jcajce.spec.XMSSMTParameterSpec XMSSMT_SHAKE_60d6_256 = new org.bouncycastle.pqc.jcajce.spec.XMSSMTParameterSpec(60, 6, "SHAKE128");
    public static final org.bouncycastle.pqc.jcajce.spec.XMSSMTParameterSpec XMSSMT_SHAKE_60d12_256 = new org.bouncycastle.pqc.jcajce.spec.XMSSMTParameterSpec(60, 12, "SHAKE128");
    public static final org.bouncycastle.pqc.jcajce.spec.XMSSMTParameterSpec XMSSMT_SHAKE_20d2_512 = new org.bouncycastle.pqc.jcajce.spec.XMSSMTParameterSpec(20, 2, "SHAKE256");
    public static final org.bouncycastle.pqc.jcajce.spec.XMSSMTParameterSpec XMSSMT_SHAKE_20d4_512 = new org.bouncycastle.pqc.jcajce.spec.XMSSMTParameterSpec(20, 4, "SHAKE256");
    public static final org.bouncycastle.pqc.jcajce.spec.XMSSMTParameterSpec XMSSMT_SHAKE_40d2_512 = new org.bouncycastle.pqc.jcajce.spec.XMSSMTParameterSpec(40, 2, "SHAKE256");
    public static final org.bouncycastle.pqc.jcajce.spec.XMSSMTParameterSpec XMSSMT_SHAKE_40d4_512 = new org.bouncycastle.pqc.jcajce.spec.XMSSMTParameterSpec(40, 4, "SHAKE256");
    public static final org.bouncycastle.pqc.jcajce.spec.XMSSMTParameterSpec XMSSMT_SHAKE_40d8_512 = new org.bouncycastle.pqc.jcajce.spec.XMSSMTParameterSpec(40, 8, "SHAKE256");
    public static final org.bouncycastle.pqc.jcajce.spec.XMSSMTParameterSpec XMSSMT_SHAKE_60d3_512 = new org.bouncycastle.pqc.jcajce.spec.XMSSMTParameterSpec(60, 3, "SHAKE256");
    public static final org.bouncycastle.pqc.jcajce.spec.XMSSMTParameterSpec XMSSMT_SHAKE_60d6_512 = new org.bouncycastle.pqc.jcajce.spec.XMSSMTParameterSpec(60, 6, "SHAKE256");
    public static final org.bouncycastle.pqc.jcajce.spec.XMSSMTParameterSpec XMSSMT_SHAKE_60d12_512 = new org.bouncycastle.pqc.jcajce.spec.XMSSMTParameterSpec(60, 12, "SHAKE256");

    public java.lang.String getTreeDigest() {
        return this.getHighResolutionOutputSizeshNQ4ISI;
    }

    public int getLayers() {
        return this.Camera2StreamConfigurationMap;
    }

    public int getHeight() {
        return this.getHighSpeedVideoFpsRanges;
    }

    public XMSSMTParameterSpec(int i, int i2, java.lang.String str) {
        this.getHighSpeedVideoFpsRanges = i;
        this.Camera2StreamConfigurationMap = i2;
        this.getHighResolutionOutputSizeshNQ4ISI = str;
    }
}
