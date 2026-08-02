package com.github.mikephil.charting.highlight;

/* loaded from: classes8.dex */
public final class Range {
    public float from;
    public float to;

    public Range(float f, float f2) {
        this.from = f;
        this.to = f2;
    }

    public final boolean contains(float f) {
        return f > this.from && f <= this.to;
    }

    public final boolean isLarger(float f) {
        return f > this.to;
    }

    public final boolean isSmaller(float f) {
        return f < this.from;
    }
}
