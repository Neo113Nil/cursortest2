package com.airbnb.lottie.model;

/* loaded from: classes7.dex */
public class DocumentData {
    public float baselineShift;
    public android.graphics.PointF boxPosition;
    public android.graphics.PointF boxSize;
    public int color;
    public java.lang.String fontName;
    public com.airbnb.lottie.model.DocumentData.Justification justification;
    public float lineHeight;
    public float size;
    public int strokeColor;
    public boolean strokeOverFill;
    public float strokeWidth;
    public java.lang.String text;
    public int tracking;

    public enum Justification {
        LEFT_ALIGN,
        RIGHT_ALIGN,
        CENTER
    }

    public DocumentData(java.lang.String str, java.lang.String str2, float f, com.airbnb.lottie.model.DocumentData.Justification justification, int i, float f2, float f3, int i2, int i3, float f4, boolean z, android.graphics.PointF pointF, android.graphics.PointF pointF2) {
        set(str, str2, f, justification, i, f2, f3, i2, i3, f4, z, pointF, pointF2);
    }

    public DocumentData() {
    }

    public void set(java.lang.String str, java.lang.String str2, float f, com.airbnb.lottie.model.DocumentData.Justification justification, int i, float f2, float f3, int i2, int i3, float f4, boolean z, android.graphics.PointF pointF, android.graphics.PointF pointF2) {
        this.text = str;
        this.fontName = str2;
        this.size = f;
        this.justification = justification;
        this.tracking = i;
        this.lineHeight = f2;
        this.baselineShift = f3;
        this.color = i2;
        this.strokeColor = i3;
        this.strokeWidth = f4;
        this.strokeOverFill = z;
        this.boxPosition = pointF;
        this.boxSize = pointF2;
    }

    public int hashCode() {
        int hashCode = (int) ((((this.text.hashCode() * 31) + this.fontName.hashCode()) * 31) + this.size);
        int ordinal = this.justification.ordinal();
        int i = this.tracking;
        long floatToRawIntBits = java.lang.Float.floatToRawIntBits(this.lineHeight);
        return (((((((hashCode * 31) + ordinal) * 31) + i) * 31) + ((int) (floatToRawIntBits ^ (floatToRawIntBits >>> 32)))) * 31) + this.color;
    }
}
