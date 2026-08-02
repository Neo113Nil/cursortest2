package com.microblink.blinkid.geometry;

/* loaded from: classes10.dex */
public class Quadrilateral implements android.os.Parcelable {
    public static final android.os.Parcelable.Creator<com.microblink.blinkid.geometry.Quadrilateral> CREATOR = new com.microblink.blinkid.geometry.IllIIIllII();
    private com.microblink.blinkid.geometry.Point Camera2StreamConfigurationMap;
    private com.microblink.blinkid.geometry.Point getHighResolutionOutputSizeshNQ4ISI;
    private int getHighSpeedVideoFpsRanges;
    private boolean getHighSpeedVideoFpsRangesFor;
    private com.microblink.blinkid.geometry.Point getHighSpeedVideoSizes;
    private com.microblink.blinkid.geometry.Point getInputSizeshNQ4ISI;

    public Quadrilateral(int i, int i2, int i3, int i4, int i5) {
        this.getHighSpeedVideoFpsRanges = -1;
        this.getHighSpeedVideoFpsRangesFor = false;
        setMargins(i, i2, i3, i4, i5);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public int getColor() {
        return this.getHighSpeedVideoFpsRanges;
    }

    public com.microblink.blinkid.geometry.Point getLowerLeft() {
        return this.getHighSpeedVideoSizes;
    }

    public com.microblink.blinkid.geometry.Point getLowerRight() {
        return this.Camera2StreamConfigurationMap;
    }

    public com.microblink.blinkid.geometry.Quadrilateral getSortedQuad() {
        com.microblink.blinkid.geometry.Point point = this.getInputSizeshNQ4ISI;
        com.microblink.blinkid.geometry.Point[] pointArr = {point, this.getHighResolutionOutputSizeshNQ4ISI, this.getHighSpeedVideoSizes, this.Camera2StreamConfigurationMap};
        float x = point.getX();
        float x2 = (this.Camera2StreamConfigurationMap.getX() + (this.getHighSpeedVideoSizes.getX() + (this.getHighResolutionOutputSizeshNQ4ISI.getX() + x))) / 4.0f;
        float y = this.getInputSizeshNQ4ISI.getY();
        com.microblink.blinkid.geometry.Point point2 = new com.microblink.blinkid.geometry.Point(x2, (this.Camera2StreamConfigurationMap.getY() + (this.getHighSpeedVideoSizes.getY() + (this.getHighResolutionOutputSizeshNQ4ISI.getY() + y))) / 4.0f);
        double[] dArr = new double[4];
        int[] iArr = new int[4];
        for (int i = 0; i < 4; i++) {
            com.microblink.blinkid.geometry.Point point3 = pointArr[i];
            dArr[i] = java.lang.Math.atan2(point3.getY() - point2.getY(), point3.getX() - point2.getX());
            iArr[i] = i;
        }
        int i2 = 0;
        while (i2 < 4) {
            int i3 = i2 + 1;
            for (int i4 = i3; i4 < 4; i4++) {
                double d = dArr[i2];
                double d2 = dArr[i4];
                if (d > d2) {
                    dArr[i2] = d2;
                    dArr[i4] = d;
                    int i5 = iArr[i2];
                    iArr[i2] = iArr[i4];
                    iArr[i4] = i5;
                }
            }
            i2 = i3;
        }
        float f = Float.MAX_VALUE;
        int i6 = 0;
        for (int i7 = 0; i7 < 4; i7++) {
            float norm = pointArr[iArr[i7]].norm();
            if (norm < f) {
                i6 = i7;
                f = norm;
            }
        }
        return new com.microblink.blinkid.geometry.Quadrilateral(pointArr[iArr[i6 % 4]], pointArr[iArr[(i6 + 3) % 4]], pointArr[iArr[(i6 + 1) % 4]], pointArr[iArr[(i6 + 2) % 4]]);
    }

    public com.microblink.blinkid.geometry.Point getUpperLeft() {
        return this.getInputSizeshNQ4ISI;
    }

    public com.microblink.blinkid.geometry.Point getUpperRight() {
        return this.getHighResolutionOutputSizeshNQ4ISI;
    }

    public boolean isDefaultQuad() {
        return this.getHighSpeedVideoFpsRangesFor;
    }

    public boolean isEmpty() {
        return this.getInputSizeshNQ4ISI.isZero() && this.getHighResolutionOutputSizeshNQ4ISI.isZero() && this.getHighSpeedVideoSizes.isZero() && this.Camera2StreamConfigurationMap.isZero();
    }

    public boolean matchesMargins(int i, int i2, int i3, int i4, int i5) {
        if (i5 == 1 || i5 == 9) {
            float f = i4;
            if (this.getInputSizeshNQ4ISI.getX() == f) {
                float f2 = i;
                if (this.getInputSizeshNQ4ISI.getY() == f2) {
                    float f3 = i3;
                    if (this.getHighResolutionOutputSizeshNQ4ISI.getX() == f3 && this.getHighResolutionOutputSizeshNQ4ISI.getY() == f2 && this.getHighSpeedVideoSizes.getX() == f) {
                        float f4 = i2;
                        if (this.getHighSpeedVideoSizes.getY() == f4 && this.Camera2StreamConfigurationMap.getX() == f3 && this.Camera2StreamConfigurationMap.getY() == f4) {
                            return true;
                        }
                    }
                }
            }
            return false;
        }
        float f5 = i3;
        if (this.getInputSizeshNQ4ISI.getX() == f5) {
            float f6 = i;
            if (this.getInputSizeshNQ4ISI.getY() == f6 && this.getHighResolutionOutputSizeshNQ4ISI.getX() == f5) {
                float f7 = i2;
                if (this.getHighResolutionOutputSizeshNQ4ISI.getY() == f7) {
                    float f8 = i4;
                    if (this.getHighSpeedVideoSizes.getX() == f8 && this.getHighSpeedVideoSizes.getY() == f6 && this.Camera2StreamConfigurationMap.getX() == f8 && this.Camera2StreamConfigurationMap.getY() == f7) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    public void mirror(int i, int i2, int i3) {
        com.microblink.blinkid.geometry.Point mirrorY;
        com.microblink.blinkid.geometry.Point mirrorY2;
        com.microblink.blinkid.geometry.Point mirrorY3;
        com.microblink.blinkid.geometry.Point point;
        if (i3 == 1 || i3 == 9) {
            float f = i2;
            mirrorY = this.getInputSizeshNQ4ISI.mirrorY(f);
            mirrorY2 = this.getHighResolutionOutputSizeshNQ4ISI.mirrorY(f);
            com.microblink.blinkid.geometry.Point mirrorY4 = this.getHighSpeedVideoSizes.mirrorY(f);
            mirrorY3 = this.Camera2StreamConfigurationMap.mirrorY(f);
            point = mirrorY4;
        } else {
            float f2 = i;
            point = this.getHighResolutionOutputSizeshNQ4ISI.mirrorX(f2);
            mirrorY = this.Camera2StreamConfigurationMap.mirrorX(f2);
            mirrorY3 = this.getInputSizeshNQ4ISI.mirrorX(f2);
            mirrorY2 = this.getHighSpeedVideoSizes.mirrorX(f2);
        }
        this.getInputSizeshNQ4ISI = point;
        this.getHighResolutionOutputSizeshNQ4ISI = mirrorY3;
        this.getHighSpeedVideoSizes = mirrorY;
        this.Camera2StreamConfigurationMap = mirrorY2;
    }

    public void setColor(int i) {
        this.getHighSpeedVideoFpsRanges = i;
    }

    public void setIsDefaultQuad(boolean z) {
        this.getHighSpeedVideoFpsRangesFor = z;
    }

    public void setMargins(int i, int i2, int i3, int i4, int i5) {
        com.microblink.blinkid.util.Log.v(this, "Setting margins: top={}, bottom={}, left={}, right={}", java.lang.Integer.valueOf(i), java.lang.Integer.valueOf(i2), java.lang.Integer.valueOf(i3), java.lang.Integer.valueOf(i4));
        if (i5 == 1 || i5 == 9) {
            float f = i4;
            float f2 = i;
            this.getInputSizeshNQ4ISI = new com.microblink.blinkid.geometry.Point(f, f2);
            float f3 = i3;
            this.getHighResolutionOutputSizeshNQ4ISI = new com.microblink.blinkid.geometry.Point(f3, f2);
            float f4 = i2;
            this.getHighSpeedVideoSizes = new com.microblink.blinkid.geometry.Point(f, f4);
            this.Camera2StreamConfigurationMap = new com.microblink.blinkid.geometry.Point(f3, f4);
            return;
        }
        float f5 = i3;
        float f6 = i;
        this.getInputSizeshNQ4ISI = new com.microblink.blinkid.geometry.Point(f5, f6);
        float f7 = i2;
        this.getHighResolutionOutputSizeshNQ4ISI = new com.microblink.blinkid.geometry.Point(f5, f7);
        float f8 = i4;
        this.getHighSpeedVideoSizes = new com.microblink.blinkid.geometry.Point(f8, f6);
        this.Camera2StreamConfigurationMap = new com.microblink.blinkid.geometry.Point(f8, f7);
    }

    public void setPoints(com.microblink.blinkid.geometry.Point point, com.microblink.blinkid.geometry.Point point2, com.microblink.blinkid.geometry.Point point3, com.microblink.blinkid.geometry.Point point4) {
        this.getInputSizeshNQ4ISI = point;
        this.getHighResolutionOutputSizeshNQ4ISI = point2;
        this.getHighSpeedVideoSizes = point3;
        this.Camera2StreamConfigurationMap = point4;
    }

    public void toFloatArray(float[] fArr) {
        fArr[0] = this.getInputSizeshNQ4ISI.getX();
        fArr[1] = this.getInputSizeshNQ4ISI.getY();
        fArr[2] = this.getHighResolutionOutputSizeshNQ4ISI.getX();
        fArr[3] = this.getHighResolutionOutputSizeshNQ4ISI.getY();
        fArr[4] = this.Camera2StreamConfigurationMap.getX();
        fArr[5] = this.Camera2StreamConfigurationMap.getY();
        fArr[6] = this.getHighSpeedVideoSizes.getX();
        fArr[7] = this.getHighSpeedVideoSizes.getY();
    }

    public java.lang.String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder("Quadrilateral{mUpperLeft=");
        sb.append(this.getInputSizeshNQ4ISI);
        sb.append(", mUpperRight=");
        sb.append(this.getHighResolutionOutputSizeshNQ4ISI);
        sb.append(", mLowerLeft=");
        sb.append(this.getHighSpeedVideoSizes);
        sb.append(", mLowerRight=");
        sb.append(this.Camera2StreamConfigurationMap);
        sb.append(kotlinx.serialization.json.internal.AbstractJsonLexerKt.END_OBJ);
        return sb.toString();
    }

    @Override // android.os.Parcelable
    public void writeToParcel(android.os.Parcel parcel, int i) {
        parcel.writeParcelable(this.getInputSizeshNQ4ISI, 0);
        parcel.writeParcelable(this.getHighResolutionOutputSizeshNQ4ISI, 0);
        parcel.writeParcelable(this.getHighSpeedVideoSizes, 0);
        parcel.writeParcelable(this.Camera2StreamConfigurationMap, 0);
        parcel.writeInt(this.getHighSpeedVideoFpsRanges);
        parcel.writeByte(this.getHighSpeedVideoFpsRangesFor ? (byte) 1 : (byte) 0);
    }

    /* renamed from: clone, reason: merged with bridge method [inline-methods] */
    public com.microblink.blinkid.geometry.Quadrilateral m10896clone() {
        com.microblink.blinkid.geometry.Quadrilateral quadrilateral = new com.microblink.blinkid.geometry.Quadrilateral(this.getInputSizeshNQ4ISI, this.getHighResolutionOutputSizeshNQ4ISI, this.getHighSpeedVideoSizes, this.Camera2StreamConfigurationMap);
        quadrilateral.setIsDefaultQuad(this.getHighSpeedVideoFpsRangesFor);
        quadrilateral.setColor(this.getHighSpeedVideoFpsRanges);
        return quadrilateral;
    }

    public Quadrilateral() {
        this.getHighSpeedVideoFpsRanges = -1;
        this.getHighSpeedVideoFpsRangesFor = false;
        setMargins(100, 100, 200, 200, 1);
    }

    public Quadrilateral(com.microblink.blinkid.geometry.Point point, com.microblink.blinkid.geometry.Point point2, com.microblink.blinkid.geometry.Point point3, com.microblink.blinkid.geometry.Point point4) {
        this.getHighSpeedVideoFpsRanges = -1;
        this.getHighSpeedVideoFpsRangesFor = false;
        setPoints(point, point2, point3, point4);
    }

    public Quadrilateral(float[] fArr) {
        this.getHighSpeedVideoFpsRanges = -1;
        this.getHighSpeedVideoFpsRangesFor = false;
        setPoints(new com.microblink.blinkid.geometry.Point(fArr[0], fArr[1]), new com.microblink.blinkid.geometry.Point(fArr[2], fArr[3]), new com.microblink.blinkid.geometry.Point(fArr[6], fArr[7]), new com.microblink.blinkid.geometry.Point(fArr[4], fArr[5]));
    }

    protected Quadrilateral(android.os.Parcel parcel) {
        this.getHighSpeedVideoFpsRanges = -1;
        this.getHighSpeedVideoFpsRangesFor = false;
        this.getInputSizeshNQ4ISI = (com.microblink.blinkid.geometry.Point) parcel.readParcelable(com.microblink.blinkid.geometry.Point.class.getClassLoader());
        this.getHighResolutionOutputSizeshNQ4ISI = (com.microblink.blinkid.geometry.Point) parcel.readParcelable(com.microblink.blinkid.geometry.Point.class.getClassLoader());
        this.getHighSpeedVideoSizes = (com.microblink.blinkid.geometry.Point) parcel.readParcelable(com.microblink.blinkid.geometry.Point.class.getClassLoader());
        this.Camera2StreamConfigurationMap = (com.microblink.blinkid.geometry.Point) parcel.readParcelable(com.microblink.blinkid.geometry.Point.class.getClassLoader());
        this.getHighSpeedVideoFpsRanges = parcel.readInt();
        this.getHighSpeedVideoFpsRangesFor = parcel.readByte() != 0;
    }
}
