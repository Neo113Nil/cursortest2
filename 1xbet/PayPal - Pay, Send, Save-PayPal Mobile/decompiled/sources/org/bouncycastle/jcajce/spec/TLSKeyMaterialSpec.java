package org.bouncycastle.jcajce.spec;

/* loaded from: classes17.dex */
public class TLSKeyMaterialSpec implements java.security.spec.KeySpec {
    public static final java.lang.String KEY_EXPANSION = "key expansion";
    public static final java.lang.String MASTER_SECRET = "master secret";
    private final byte[] Camera2StreamConfigurationMap;
    private final byte[] getHighSpeedVideoFpsRanges;
    private final java.lang.String getHighSpeedVideoFpsRangesFor;
    private final int getHighSpeedVideoSizes;

    public byte[] getSeed() {
        return org.bouncycastle.util.Arrays.clone(this.Camera2StreamConfigurationMap);
    }

    public byte[] getSecret() {
        return org.bouncycastle.util.Arrays.clone(this.getHighSpeedVideoFpsRanges);
    }

    public int getLength() {
        return this.getHighSpeedVideoSizes;
    }

    public java.lang.String getLabel() {
        return this.getHighSpeedVideoFpsRangesFor;
    }

    public TLSKeyMaterialSpec(byte[] bArr, java.lang.String str, int i, byte[]... bArr2) {
        this.getHighSpeedVideoFpsRanges = org.bouncycastle.util.Arrays.clone(bArr);
        this.getHighSpeedVideoFpsRangesFor = str;
        this.getHighSpeedVideoSizes = i;
        this.Camera2StreamConfigurationMap = org.bouncycastle.util.Arrays.concatenate(bArr2);
    }
}
