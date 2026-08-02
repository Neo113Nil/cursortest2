package org.bouncycastle.pqc.jcajce.spec;

/* loaded from: classes17.dex */
public class XMSSParameterSpec implements java.security.spec.AlgorithmParameterSpec {
    public static final java.lang.String SHA256 = "SHA256";
    public static final java.lang.String SHA512 = "SHA512";
    public static final java.lang.String SHAKE128 = "SHAKE128";
    public static final java.lang.String SHAKE256 = "SHAKE256";
    private final int getHighSpeedVideoFpsRanges;
    private final java.lang.String getHighSpeedVideoSizes;
    public static final org.bouncycastle.pqc.jcajce.spec.XMSSParameterSpec SHA2_10_256 = new org.bouncycastle.pqc.jcajce.spec.XMSSParameterSpec(10, "SHA256");
    public static final org.bouncycastle.pqc.jcajce.spec.XMSSParameterSpec SHA2_16_256 = new org.bouncycastle.pqc.jcajce.spec.XMSSParameterSpec(16, "SHA256");
    public static final org.bouncycastle.pqc.jcajce.spec.XMSSParameterSpec SHA2_20_256 = new org.bouncycastle.pqc.jcajce.spec.XMSSParameterSpec(20, "SHA256");
    public static final org.bouncycastle.pqc.jcajce.spec.XMSSParameterSpec SHAKE_10_256 = new org.bouncycastle.pqc.jcajce.spec.XMSSParameterSpec(10, "SHAKE128");
    public static final org.bouncycastle.pqc.jcajce.spec.XMSSParameterSpec SHAKE_16_256 = new org.bouncycastle.pqc.jcajce.spec.XMSSParameterSpec(16, "SHAKE128");
    public static final org.bouncycastle.pqc.jcajce.spec.XMSSParameterSpec SHAKE_20_256 = new org.bouncycastle.pqc.jcajce.spec.XMSSParameterSpec(20, "SHAKE128");
    public static final org.bouncycastle.pqc.jcajce.spec.XMSSParameterSpec SHA2_10_512 = new org.bouncycastle.pqc.jcajce.spec.XMSSParameterSpec(10, "SHA512");
    public static final org.bouncycastle.pqc.jcajce.spec.XMSSParameterSpec SHA2_16_512 = new org.bouncycastle.pqc.jcajce.spec.XMSSParameterSpec(16, "SHA512");
    public static final org.bouncycastle.pqc.jcajce.spec.XMSSParameterSpec SHA2_20_512 = new org.bouncycastle.pqc.jcajce.spec.XMSSParameterSpec(20, "SHA512");
    public static final org.bouncycastle.pqc.jcajce.spec.XMSSParameterSpec SHAKE_10_512 = new org.bouncycastle.pqc.jcajce.spec.XMSSParameterSpec(10, "SHAKE256");
    public static final org.bouncycastle.pqc.jcajce.spec.XMSSParameterSpec SHAKE_16_512 = new org.bouncycastle.pqc.jcajce.spec.XMSSParameterSpec(16, "SHAKE256");
    public static final org.bouncycastle.pqc.jcajce.spec.XMSSParameterSpec SHAKE_20_512 = new org.bouncycastle.pqc.jcajce.spec.XMSSParameterSpec(20, "SHAKE256");

    public java.lang.String getTreeDigest() {
        return this.getHighSpeedVideoSizes;
    }

    public int getHeight() {
        return this.getHighSpeedVideoFpsRanges;
    }

    public XMSSParameterSpec(int i, java.lang.String str) {
        this.getHighSpeedVideoFpsRanges = i;
        this.getHighSpeedVideoSizes = str;
    }
}
