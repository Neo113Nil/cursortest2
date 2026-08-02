package com.github.mikephil.charting.data;

/* loaded from: classes8.dex */
public class PieEntry extends com.github.mikephil.charting.data.Entry {
    private java.lang.String Camera2StreamConfigurationMap;

    public PieEntry(float f) {
        super(0.0f, f);
    }

    public PieEntry(float f, java.lang.Object obj) {
        super(0.0f, f, obj);
    }

    public PieEntry(float f, android.graphics.drawable.Drawable drawable) {
        super(0.0f, f, drawable);
    }

    public PieEntry(float f, android.graphics.drawable.Drawable drawable, java.lang.Object obj) {
        super(0.0f, f, drawable, obj);
    }

    public PieEntry(float f, java.lang.String str) {
        super(0.0f, f);
        this.Camera2StreamConfigurationMap = str;
    }

    public PieEntry(float f, java.lang.String str, java.lang.Object obj) {
        super(0.0f, f, obj);
        this.Camera2StreamConfigurationMap = str;
    }

    public PieEntry(float f, java.lang.String str, android.graphics.drawable.Drawable drawable) {
        super(0.0f, f, drawable);
        this.Camera2StreamConfigurationMap = str;
    }

    public PieEntry(float f, java.lang.String str, android.graphics.drawable.Drawable drawable, java.lang.Object obj) {
        super(0.0f, f, drawable, obj);
        this.Camera2StreamConfigurationMap = str;
    }

    public float getValue() {
        return getY();
    }

    public java.lang.String getLabel() {
        return this.Camera2StreamConfigurationMap;
    }

    public void setLabel(java.lang.String str) {
        this.Camera2StreamConfigurationMap = str;
    }

    @Override // com.github.mikephil.charting.data.Entry
    @java.lang.Deprecated
    public void setX(float f) {
        super.setX(f);
    }

    @Override // com.github.mikephil.charting.data.Entry
    @java.lang.Deprecated
    public float getX() {
        return super.getX();
    }

    @Override // com.github.mikephil.charting.data.Entry
    public com.github.mikephil.charting.data.PieEntry copy() {
        return new com.github.mikephil.charting.data.PieEntry(getY(), this.Camera2StreamConfigurationMap, getData());
    }
}
