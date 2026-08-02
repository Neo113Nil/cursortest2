package com.microblink.blinkid.geometry;

/* loaded from: classes.dex */
public class Rectangle implements android.os.Parcelable {
    public static final android.os.Parcelable.Creator<com.microblink.blinkid.geometry.Rectangle> CREATOR = new com.microblink.blinkid.geometry.llIIIlllll();
    private float Camera2StreamConfigurationMap;
    private float getHighSpeedVideoFpsRanges;
    private float getHighSpeedVideoFpsRangesFor;
    private float getHighSpeedVideoSizes;

    public Rectangle(float f, float f2, float f3, float f4) {
        this.getHighSpeedVideoFpsRanges = f;
        this.getHighSpeedVideoFpsRangesFor = f2;
        this.Camera2StreamConfigurationMap = f3;
        this.getHighSpeedVideoSizes = f4;
    }

    public static com.microblink.blinkid.geometry.Rectangle fromRectF(android.graphics.RectF rectF) {
        return new com.microblink.blinkid.geometry.Rectangle(rectF.left, rectF.top, rectF.width(), rectF.height());
    }

    public static com.microblink.blinkid.geometry.Rectangle getDefaultROI() {
        return new com.microblink.blinkid.geometry.Rectangle(0.0f, 0.0f, 1.0f, 1.0f);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof com.microblink.blinkid.geometry.Rectangle)) {
            return false;
        }
        com.microblink.blinkid.geometry.Rectangle rectangle = (com.microblink.blinkid.geometry.Rectangle) obj;
        return java.lang.Float.compare(rectangle.getHighSpeedVideoFpsRanges, this.getHighSpeedVideoFpsRanges) == 0 && java.lang.Float.compare(rectangle.getHighSpeedVideoFpsRangesFor, this.getHighSpeedVideoFpsRangesFor) == 0 && java.lang.Float.compare(rectangle.Camera2StreamConfigurationMap, this.Camera2StreamConfigurationMap) == 0 && java.lang.Float.compare(rectangle.getHighSpeedVideoSizes, this.getHighSpeedVideoSizes) == 0;
    }

    public float getHeight() {
        return this.getHighSpeedVideoSizes;
    }

    public float getWidth() {
        return this.Camera2StreamConfigurationMap;
    }

    public float getX() {
        return this.getHighSpeedVideoFpsRanges;
    }

    public float getY() {
        return this.getHighSpeedVideoFpsRangesFor;
    }

    public int hashCode() {
        float f = this.getHighSpeedVideoFpsRanges;
        int floatToIntBits = f != 0.0f ? java.lang.Float.floatToIntBits(f) : 0;
        float f2 = this.getHighSpeedVideoFpsRangesFor;
        int floatToIntBits2 = f2 != 0.0f ? java.lang.Float.floatToIntBits(f2) : 0;
        float f3 = this.Camera2StreamConfigurationMap;
        int floatToIntBits3 = f3 != 0.0f ? java.lang.Float.floatToIntBits(f3) : 0;
        float f4 = this.getHighSpeedVideoSizes;
        return (((((floatToIntBits * 31) + floatToIntBits2) * 31) + floatToIntBits3) * 31) + (f4 != 0.0f ? java.lang.Float.floatToIntBits(f4) : 0);
    }

    public boolean isRelative() {
        float f = this.getHighSpeedVideoFpsRanges;
        if (f < 0.0f || f > 1.0f) {
            return false;
        }
        float f2 = this.getHighSpeedVideoFpsRangesFor;
        if (f2 < 0.0f || f2 > 1.0f) {
            return false;
        }
        float f3 = this.Camera2StreamConfigurationMap;
        if (f3 < 0.0f || f3 > 1.0f) {
            return false;
        }
        float f4 = this.getHighSpeedVideoSizes;
        return f4 >= 0.0f && f4 <= 1.0f && f + f3 <= 1.0f && f2 + f4 <= 1.0f;
    }

    public void log() {
        com.microblink.blinkid.util.Log.d(this, "Rectangle[{}, {}, {}, {}]", java.lang.Float.valueOf(this.getHighSpeedVideoFpsRanges), java.lang.Float.valueOf(this.getHighSpeedVideoFpsRangesFor), java.lang.Float.valueOf(this.Camera2StreamConfigurationMap), java.lang.Float.valueOf(this.getHighSpeedVideoSizes));
    }

    public void normalizeToUnitRectangle() {
        if (this.getHighSpeedVideoFpsRanges < 0.0f) {
            this.getHighSpeedVideoFpsRanges = 0.0f;
        }
        if (this.getHighSpeedVideoFpsRangesFor < 0.0f) {
            this.getHighSpeedVideoFpsRangesFor = 0.0f;
        }
        if (this.Camera2StreamConfigurationMap > 1.0f) {
            this.Camera2StreamConfigurationMap = 1.0f;
        }
        if (this.getHighSpeedVideoSizes > 1.0f) {
            this.getHighSpeedVideoSizes = 1.0f;
        }
    }

    public android.graphics.RectF toRectF() {
        float f = this.getHighSpeedVideoFpsRanges;
        float f2 = this.getHighSpeedVideoFpsRangesFor;
        return new android.graphics.RectF(f, f2, this.Camera2StreamConfigurationMap + f, this.getHighSpeedVideoSizes + f2);
    }

    public java.lang.String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder("Rectangle[");
        sb.append(this.getHighSpeedVideoFpsRanges);
        sb.append(", ");
        sb.append(this.getHighSpeedVideoFpsRangesFor);
        sb.append(", ");
        sb.append(this.Camera2StreamConfigurationMap);
        sb.append(", ");
        sb.append(this.getHighSpeedVideoSizes);
        sb.append("]");
        return sb.toString();
    }

    @Override // android.os.Parcelable
    public void writeToParcel(android.os.Parcel parcel, int i) {
        parcel.writeFloat(this.getHighSpeedVideoFpsRanges);
        parcel.writeFloat(this.getHighSpeedVideoFpsRangesFor);
        parcel.writeFloat(this.Camera2StreamConfigurationMap);
        parcel.writeFloat(this.getHighSpeedVideoSizes);
    }

    Rectangle(android.os.Parcel parcel) {
        this.getHighSpeedVideoFpsRanges = parcel.readFloat();
        this.getHighSpeedVideoFpsRangesFor = parcel.readFloat();
        this.Camera2StreamConfigurationMap = parcel.readFloat();
        this.getHighSpeedVideoSizes = parcel.readFloat();
    }
}
