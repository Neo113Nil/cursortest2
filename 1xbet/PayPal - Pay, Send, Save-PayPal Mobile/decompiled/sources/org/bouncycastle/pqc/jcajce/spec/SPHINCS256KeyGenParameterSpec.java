package org.bouncycastle.pqc.jcajce.spec;

/* loaded from: classes17.dex */
public class SPHINCS256KeyGenParameterSpec implements java.security.spec.AlgorithmParameterSpec {
    public static final java.lang.String SHA3_256 = "SHA3-256";
    public static final java.lang.String SHA512_256 = "SHA512-256";
    private final java.lang.String getHighSpeedVideoSizes;

    public java.lang.String getTreeDigest() {
        return this.getHighSpeedVideoSizes;
    }

    public SPHINCS256KeyGenParameterSpec(java.lang.String str) {
        this.getHighSpeedVideoSizes = str;
    }

    public SPHINCS256KeyGenParameterSpec() {
        this(SHA512_256);
    }
}
