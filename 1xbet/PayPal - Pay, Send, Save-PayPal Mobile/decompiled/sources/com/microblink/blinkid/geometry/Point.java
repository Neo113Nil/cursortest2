package com.microblink.blinkid.geometry;

/* loaded from: classes10.dex */
public class Point implements android.os.Parcelable {
    public static final android.os.Parcelable.Creator<com.microblink.blinkid.geometry.Point> CREATOR = new com.microblink.blinkid.geometry.llIIlIlIIl();
    private float getHighSpeedVideoFpsRanges;
    private float getHighSpeedVideoFpsRangesFor;
    private float getHighSpeedVideoSizes;

    public Point() {
        this.getHighSpeedVideoFpsRanges = -1.0f;
        this.getHighSpeedVideoSizes = 0.0f;
        this.getHighSpeedVideoFpsRangesFor = 0.0f;
    }

    public com.microblink.blinkid.geometry.Point clamp(float f) {
        return norm() > f ? normalize(f) : new com.microblink.blinkid.geometry.Point(this.getHighSpeedVideoSizes, this.getHighSpeedVideoFpsRangesFor);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public float distance(com.microblink.blinkid.geometry.Point point) {
        float f = this.getHighSpeedVideoSizes - point.getHighSpeedVideoSizes;
        float f2 = this.getHighSpeedVideoFpsRangesFor - point.getHighSpeedVideoFpsRangesFor;
        return (float) java.lang.Math.sqrt((f2 * f2) + (f * f));
    }

    public void draw(android.graphics.Canvas canvas, android.graphics.Paint paint, int i) {
        canvas.drawCircle(this.getHighSpeedVideoSizes, this.getHighSpeedVideoFpsRangesFor, i, paint);
    }

    public boolean equals(java.lang.Object obj) {
        if (obj != null && (obj instanceof com.microblink.blinkid.geometry.Point)) {
            com.microblink.blinkid.geometry.Point point = (com.microblink.blinkid.geometry.Point) obj;
            if (this.getHighSpeedVideoSizes == point.getHighSpeedVideoSizes && this.getHighSpeedVideoFpsRangesFor == point.getHighSpeedVideoFpsRangesFor) {
                return true;
            }
        }
        return false;
    }

    public float getX() {
        return this.getHighSpeedVideoSizes;
    }

    public float getY() {
        return this.getHighSpeedVideoFpsRangesFor;
    }

    public boolean isZero() {
        return this.getHighSpeedVideoSizes == 0.0f && this.getHighSpeedVideoFpsRangesFor == 0.0f;
    }

    public void log() {
        com.microblink.blinkid.util.Log.d(this, java.lang.String.format("(%f,%f)", java.lang.Float.valueOf(this.getHighSpeedVideoSizes), java.lang.Float.valueOf(this.getHighSpeedVideoFpsRangesFor)), new java.lang.Object[0]);
    }

    public com.microblink.blinkid.geometry.Point makeCopy() {
        return new com.microblink.blinkid.geometry.Point(this.getHighSpeedVideoSizes, this.getHighSpeedVideoFpsRangesFor);
    }

    public com.microblink.blinkid.geometry.Point mirrorX(float f) {
        com.microblink.blinkid.geometry.Point makeCopy = makeCopy();
        makeCopy.mirrorXInPlace(f);
        return makeCopy;
    }

    public void mirrorXInPlace(float f) {
        this.getHighSpeedVideoSizes = f - this.getHighSpeedVideoSizes;
    }

    public com.microblink.blinkid.geometry.Point mirrorXY(float f, float f2) {
        com.microblink.blinkid.geometry.Point makeCopy = makeCopy();
        makeCopy.mirrorXYInPlace(f, f2);
        return makeCopy;
    }

    public void mirrorXYInPlace(float f, float f2) {
        this.getHighSpeedVideoSizes = f - this.getHighSpeedVideoSizes;
        this.getHighSpeedVideoFpsRangesFor = f2 - this.getHighSpeedVideoFpsRangesFor;
    }

    public com.microblink.blinkid.geometry.Point mirrorY(float f) {
        com.microblink.blinkid.geometry.Point makeCopy = makeCopy();
        makeCopy.mirrorYInPlace(f);
        return makeCopy;
    }

    public void mirrorYInPlace(float f) {
        this.getHighSpeedVideoFpsRangesFor = f - this.getHighSpeedVideoFpsRangesFor;
    }

    public com.microblink.blinkid.geometry.Point negative() {
        this.getHighSpeedVideoSizes = -this.getHighSpeedVideoSizes;
        this.getHighSpeedVideoFpsRangesFor = -this.getHighSpeedVideoFpsRangesFor;
        return this;
    }

    public com.microblink.blinkid.geometry.Point negativeClone() {
        return new com.microblink.blinkid.geometry.Point(-this.getHighSpeedVideoSizes, -this.getHighSpeedVideoFpsRangesFor);
    }

    public float norm() {
        if (this.getHighSpeedVideoFpsRanges < 0.0f) {
            float f = this.getHighSpeedVideoSizes;
            float f2 = this.getHighSpeedVideoFpsRangesFor;
            this.getHighSpeedVideoFpsRanges = (float) java.lang.Math.sqrt((f2 * f2) + (f * f));
        }
        return this.getHighSpeedVideoFpsRanges;
    }

    public com.microblink.blinkid.geometry.Point normalize() {
        float norm = norm();
        return new com.microblink.blinkid.geometry.Point(this.getHighSpeedVideoSizes / norm, this.getHighSpeedVideoFpsRangesFor / norm);
    }

    public com.microblink.blinkid.geometry.Point operatorMinus(com.microblink.blinkid.geometry.Point point) {
        return new com.microblink.blinkid.geometry.Point(this.getHighSpeedVideoSizes - point.getHighSpeedVideoSizes, this.getHighSpeedVideoFpsRangesFor - point.getHighSpeedVideoFpsRangesFor);
    }

    public com.microblink.blinkid.geometry.Point operatorMinusEquals(com.microblink.blinkid.geometry.Point point) {
        this.getHighSpeedVideoSizes -= point.getHighSpeedVideoSizes;
        this.getHighSpeedVideoFpsRangesFor -= point.getHighSpeedVideoFpsRangesFor;
        return this;
    }

    public com.microblink.blinkid.geometry.Point operatorMultiply(float f) {
        return new com.microblink.blinkid.geometry.Point(this.getHighSpeedVideoSizes * f, this.getHighSpeedVideoFpsRangesFor * f);
    }

    public com.microblink.blinkid.geometry.Point operatorMultiplyEquals(float f) {
        this.getHighSpeedVideoSizes *= f;
        this.getHighSpeedVideoFpsRangesFor *= f;
        return this;
    }

    public com.microblink.blinkid.geometry.Point operatorPlus(com.microblink.blinkid.geometry.Point point) {
        return new com.microblink.blinkid.geometry.Point(this.getHighSpeedVideoSizes + point.getHighSpeedVideoSizes, this.getHighSpeedVideoFpsRangesFor + point.getHighSpeedVideoFpsRangesFor);
    }

    public void operatorPlusEquals(com.microblink.blinkid.geometry.Point point) {
        this.getHighSpeedVideoSizes += point.getHighSpeedVideoSizes;
        this.getHighSpeedVideoFpsRangesFor += point.getHighSpeedVideoFpsRangesFor;
    }

    public void setX(float f) {
        this.getHighSpeedVideoSizes = f;
    }

    public void setY(float f) {
        this.getHighSpeedVideoFpsRangesFor = f;
    }

    public java.lang.String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder("Point{mX=");
        sb.append(this.getHighSpeedVideoSizes);
        sb.append(", mY=");
        sb.append(this.getHighSpeedVideoFpsRangesFor);
        sb.append(kotlinx.serialization.json.internal.AbstractJsonLexerKt.END_OBJ);
        return sb.toString();
    }

    @Override // android.os.Parcelable
    public void writeToParcel(android.os.Parcel parcel, int i) {
        parcel.writeFloat(this.getHighSpeedVideoSizes);
        parcel.writeFloat(this.getHighSpeedVideoFpsRangesFor);
        parcel.writeFloat(this.getHighSpeedVideoFpsRanges);
    }

    public com.microblink.blinkid.geometry.Point normalize(float f) {
        float norm = norm();
        return new com.microblink.blinkid.geometry.Point((this.getHighSpeedVideoSizes * f) / norm, (this.getHighSpeedVideoFpsRangesFor * f) / norm);
    }

    public com.microblink.blinkid.geometry.Point clamp(float f, float f2) {
        float norm = norm();
        if (norm > f2) {
            return normalize(f2);
        }
        if (norm < f) {
            return normalize(f);
        }
        return new com.microblink.blinkid.geometry.Point(this.getHighSpeedVideoSizes, this.getHighSpeedVideoFpsRangesFor);
    }

    public Point(float f, float f2) {
        this.getHighSpeedVideoFpsRanges = -1.0f;
        this.getHighSpeedVideoSizes = f;
        this.getHighSpeedVideoFpsRangesFor = f2;
    }

    protected Point(android.os.Parcel parcel) {
        this.getHighSpeedVideoFpsRanges = -1.0f;
        this.getHighSpeedVideoSizes = parcel.readFloat();
        this.getHighSpeedVideoFpsRangesFor = parcel.readFloat();
        this.getHighSpeedVideoFpsRanges = parcel.readFloat();
    }
}
