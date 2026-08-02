package org.bouncycastle.pqc.crypto.mceliece;

/* loaded from: classes17.dex */
public class McElieceKeyGenerationParameters extends org.bouncycastle.crypto.KeyGenerationParameters {
    private org.bouncycastle.pqc.crypto.mceliece.McElieceParameters getHighSpeedVideoFpsRangesFor;

    public org.bouncycastle.pqc.crypto.mceliece.McElieceParameters getParameters() {
        return this.getHighSpeedVideoFpsRangesFor;
    }

    public McElieceKeyGenerationParameters(java.security.SecureRandom secureRandom, org.bouncycastle.pqc.crypto.mceliece.McElieceParameters mcElieceParameters) {
        super(secureRandom, 256);
        this.getHighSpeedVideoFpsRangesFor = mcElieceParameters;
    }
}
