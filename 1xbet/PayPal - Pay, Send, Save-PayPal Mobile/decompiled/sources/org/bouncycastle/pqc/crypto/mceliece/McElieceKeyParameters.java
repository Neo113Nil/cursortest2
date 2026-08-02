package org.bouncycastle.pqc.crypto.mceliece;

/* loaded from: classes17.dex */
public class McElieceKeyParameters extends org.bouncycastle.crypto.params.AsymmetricKeyParameter {
    private org.bouncycastle.pqc.crypto.mceliece.McElieceParameters getHighSpeedVideoFpsRanges;

    public org.bouncycastle.pqc.crypto.mceliece.McElieceParameters getParameters() {
        return this.getHighSpeedVideoFpsRanges;
    }

    public McElieceKeyParameters(boolean z, org.bouncycastle.pqc.crypto.mceliece.McElieceParameters mcElieceParameters) {
        super(z);
        this.getHighSpeedVideoFpsRanges = mcElieceParameters;
    }
}
