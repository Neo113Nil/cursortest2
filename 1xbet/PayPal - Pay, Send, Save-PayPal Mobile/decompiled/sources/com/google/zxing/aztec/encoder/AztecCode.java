package com.google.zxing.aztec.encoder;

/* loaded from: classes9.dex */
public final class AztecCode {
    private int codeWords;
    private boolean compact;
    private int layers;
    private com.google.zxing.common.BitMatrix matrix;
    private int size;

    public final boolean isCompact() {
        return this.compact;
    }

    public final void setCompact(boolean z) {
        this.compact = z;
    }

    public final int getSize() {
        return this.size;
    }

    public final void setSize(int i) {
        this.size = i;
    }

    public final int getLayers() {
        return this.layers;
    }

    public final void setLayers(int i) {
        this.layers = i;
    }

    public final int getCodeWords() {
        return this.codeWords;
    }

    public final void setCodeWords(int i) {
        this.codeWords = i;
    }

    public final com.google.zxing.common.BitMatrix getMatrix() {
        return this.matrix;
    }

    public final void setMatrix(com.google.zxing.common.BitMatrix bitMatrix) {
        this.matrix = bitMatrix;
    }
}
