package com.google.zxing.aztec;

/* loaded from: classes9.dex */
public final class AztecDetectorResult extends com.google.zxing.common.DetectorResult {
    private final boolean compact;
    private final int errorsCorrected;
    private final int nbDatablocks;
    private final int nbLayers;

    public AztecDetectorResult(com.google.zxing.common.BitMatrix bitMatrix, com.google.zxing.ResultPoint[] resultPointArr, boolean z, int i, int i2) {
        this(bitMatrix, resultPointArr, z, i, i2, 0);
    }

    public AztecDetectorResult(com.google.zxing.common.BitMatrix bitMatrix, com.google.zxing.ResultPoint[] resultPointArr, boolean z, int i, int i2, int i3) {
        super(bitMatrix, resultPointArr);
        this.compact = z;
        this.nbDatablocks = i;
        this.nbLayers = i2;
        this.errorsCorrected = i3;
    }

    public final int getNbLayers() {
        return this.nbLayers;
    }

    public final int getNbDatablocks() {
        return this.nbDatablocks;
    }

    public final boolean isCompact() {
        return this.compact;
    }

    public final int getErrorsCorrected() {
        return this.errorsCorrected;
    }
}
