package com.github.mikephil.charting.data;

/* loaded from: classes8.dex */
public class BubbleEntry extends com.github.mikephil.charting.data.Entry {
    private float getHighResolutionOutputSizeshNQ4ISI;

    public BubbleEntry(float f, float f2, float f3) {
        super(f, f2);
        this.getHighResolutionOutputSizeshNQ4ISI = f3;
    }

    public BubbleEntry(float f, float f2, float f3, java.lang.Object obj) {
        super(f, f2, obj);
        this.getHighResolutionOutputSizeshNQ4ISI = f3;
    }

    public BubbleEntry(float f, float f2, float f3, android.graphics.drawable.Drawable drawable) {
        super(f, f2, drawable);
        this.getHighResolutionOutputSizeshNQ4ISI = f3;
    }

    public BubbleEntry(float f, float f2, float f3, android.graphics.drawable.Drawable drawable, java.lang.Object obj) {
        super(f, f2, drawable, obj);
        this.getHighResolutionOutputSizeshNQ4ISI = f3;
    }

    @Override // com.github.mikephil.charting.data.Entry
    public com.github.mikephil.charting.data.BubbleEntry copy() {
        return new com.github.mikephil.charting.data.BubbleEntry(getX(), getY(), this.getHighResolutionOutputSizeshNQ4ISI, getData());
    }

    public float getSize() {
        return this.getHighResolutionOutputSizeshNQ4ISI;
    }

    public void setSize(float f) {
        this.getHighResolutionOutputSizeshNQ4ISI = f;
    }
}
