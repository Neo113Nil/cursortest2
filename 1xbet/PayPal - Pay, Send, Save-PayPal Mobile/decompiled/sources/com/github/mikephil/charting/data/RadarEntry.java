package com.github.mikephil.charting.data;

/* loaded from: classes8.dex */
public class RadarEntry extends com.github.mikephil.charting.data.Entry {
    public RadarEntry(float f) {
        super(0.0f, f);
    }

    public RadarEntry(float f, java.lang.Object obj) {
        super(0.0f, f, obj);
    }

    public float getValue() {
        return getY();
    }

    @Override // com.github.mikephil.charting.data.Entry
    public com.github.mikephil.charting.data.RadarEntry copy() {
        return new com.github.mikephil.charting.data.RadarEntry(getY(), getData());
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
}
