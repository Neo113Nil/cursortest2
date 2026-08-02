package org.bouncycastle.jcajce.spec;

/* loaded from: classes17.dex */
public class AEADParameterSpec extends javax.crypto.spec.IvParameterSpec {
    private final byte[] Camera2StreamConfigurationMap;
    private final int getHighSpeedVideoFpsRangesFor;

    public byte[] getNonce() {
        return getIV();
    }

    public int getMacSizeInBits() {
        return this.getHighSpeedVideoFpsRangesFor;
    }

    public byte[] getAssociatedData() {
        return org.bouncycastle.util.Arrays.clone(this.Camera2StreamConfigurationMap);
    }

    public AEADParameterSpec(byte[] bArr, int i, byte[] bArr2) {
        super(bArr);
        this.getHighSpeedVideoFpsRangesFor = i;
        this.Camera2StreamConfigurationMap = org.bouncycastle.util.Arrays.clone(bArr2);
    }

    public AEADParameterSpec(byte[] bArr, int i) {
        this(bArr, i, null);
    }
}
