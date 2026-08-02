package org.bouncycastle.pqc.crypto.newhope;

/* loaded from: classes17.dex */
public class NHPrivateKeyParameters extends org.bouncycastle.crypto.params.AsymmetricKeyParameter {
    final short[] getHighSpeedVideoFpsRangesFor;

    public short[] getSecData() {
        return org.bouncycastle.util.Arrays.clone(this.getHighSpeedVideoFpsRangesFor);
    }

    public NHPrivateKeyParameters(short[] sArr) {
        super(true);
        this.getHighSpeedVideoFpsRangesFor = org.bouncycastle.util.Arrays.clone(sArr);
    }
}
