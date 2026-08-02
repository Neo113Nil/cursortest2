package org.bouncycastle.pqc.crypto.qtesla;

/* loaded from: classes17.dex */
public class QTESLAKeyGenerationParameters extends org.bouncycastle.crypto.KeyGenerationParameters {
    private final int getHighSpeedVideoFpsRanges;

    public int getSecurityCategory() {
        return this.getHighSpeedVideoFpsRanges;
    }

    public QTESLAKeyGenerationParameters(int i, java.security.SecureRandom secureRandom) {
        super(secureRandom, -1);
        org.bouncycastle.pqc.crypto.qtesla.QTESLASecurityCategory.getHighResolutionOutputSizeshNQ4ISI(i);
        this.getHighSpeedVideoFpsRanges = i;
    }
}
