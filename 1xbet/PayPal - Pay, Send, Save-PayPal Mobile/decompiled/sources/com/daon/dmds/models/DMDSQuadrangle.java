package com.daon.dmds.models;

/* loaded from: classes7.dex */
public class DMDSQuadrangle implements android.os.Parcelable {
    public static final android.os.Parcelable.Creator<com.daon.dmds.models.DMDSQuadrangle> CREATOR = new android.os.Parcelable.Creator<com.daon.dmds.models.DMDSQuadrangle>() { // from class: com.daon.dmds.models.DMDSQuadrangle.1
        @Override // android.os.Parcelable.Creator
        public /* synthetic */ com.daon.dmds.models.DMDSQuadrangle createFromParcel(android.os.Parcel parcel) {
            return new com.daon.dmds.models.DMDSQuadrangle(parcel);
        }

        @Override // android.os.Parcelable.Creator
        public /* bridge */ /* synthetic */ com.daon.dmds.models.DMDSQuadrangle[] newArray(int i) {
            return new com.daon.dmds.models.DMDSQuadrangle[i];
        }
    };
    private com.daon.dmds.models.DMDSPoint Camera2StreamConfigurationMap;
    private com.daon.dmds.models.DMDSPoint getHighResolutionOutputSizeshNQ4ISI;
    private android.graphics.Point getHighSpeedVideoFpsRanges;
    private android.graphics.Point getHighSpeedVideoFpsRangesFor;
    private com.daon.dmds.models.DMDSPoint getHighSpeedVideoSizes;
    private android.graphics.Point getHighSpeedVideoSizesFor;
    private android.graphics.Point getInputSizeshNQ4ISI;
    private com.daon.dmds.models.DMDSPoint getOutputMinFrameDuration;

    public DMDSQuadrangle(android.os.Parcel parcel) {
        this.getInputSizeshNQ4ISI = (android.graphics.Point) parcel.readParcelable(android.graphics.Point.class.getClassLoader());
        this.getHighSpeedVideoSizesFor = (android.graphics.Point) parcel.readParcelable(android.graphics.Point.class.getClassLoader());
        this.getHighSpeedVideoFpsRangesFor = (android.graphics.Point) parcel.readParcelable(android.graphics.Point.class.getClassLoader());
        this.getHighSpeedVideoFpsRanges = (android.graphics.Point) parcel.readParcelable(android.graphics.Point.class.getClassLoader());
        this.Camera2StreamConfigurationMap = (com.daon.dmds.models.DMDSPoint) parcel.readParcelable(com.daon.dmds.models.DMDSPoint.class.getClassLoader());
        this.getHighSpeedVideoSizes = (com.daon.dmds.models.DMDSPoint) parcel.readParcelable(com.daon.dmds.models.DMDSPoint.class.getClassLoader());
        this.getHighResolutionOutputSizeshNQ4ISI = (com.daon.dmds.models.DMDSPoint) parcel.readParcelable(com.daon.dmds.models.DMDSPoint.class.getClassLoader());
        this.getOutputMinFrameDuration = (com.daon.dmds.models.DMDSPoint) parcel.readParcelable(com.daon.dmds.models.DMDSPoint.class.getClassLoader());
    }

    public int calculateArea() {
        android.graphics.Point point = this.getInputSizeshNQ4ISI;
        int i = point.x;
        android.graphics.Point point2 = this.getHighSpeedVideoFpsRanges;
        int i2 = point2.x;
        int i3 = point.y;
        int i4 = point2.y;
        int i5 = this.getHighSpeedVideoSizesFor.x;
        android.graphics.Point point3 = this.getHighSpeedVideoFpsRangesFor;
        return (int) ((((i - i2) * (r4.y - point3.y)) - ((i3 - i4) * (i5 - point3.x))) * 0.5d);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        com.daon.dmds.models.DMDSQuadrangle dMDSQuadrangle = (com.daon.dmds.models.DMDSQuadrangle) obj;
        return (java.util.Objects.equals(this.getHighResolutionOutputSizeshNQ4ISI, dMDSQuadrangle.getHighResolutionOutputSizeshNQ4ISI) && java.util.Objects.equals(this.getOutputMinFrameDuration, dMDSQuadrangle.getOutputMinFrameDuration) && java.util.Objects.equals(this.Camera2StreamConfigurationMap, dMDSQuadrangle.Camera2StreamConfigurationMap) && java.util.Objects.equals(this.getHighSpeedVideoSizes, dMDSQuadrangle.getHighSpeedVideoSizes)) || (java.util.Objects.equals(this.getInputSizeshNQ4ISI, dMDSQuadrangle.getInputSizeshNQ4ISI) && java.util.Objects.equals(this.getHighSpeedVideoSizesFor, dMDSQuadrangle.getHighSpeedVideoSizesFor) && java.util.Objects.equals(this.getHighSpeedVideoFpsRangesFor, dMDSQuadrangle.getHighSpeedVideoFpsRangesFor) && java.util.Objects.equals(this.getHighSpeedVideoFpsRanges, dMDSQuadrangle.getHighSpeedVideoFpsRanges));
    }

    public android.graphics.Point getLowerLeft() {
        return this.getHighSpeedVideoFpsRangesFor;
    }

    public android.graphics.Point getLowerRight() {
        return this.getHighSpeedVideoFpsRanges;
    }

    public com.daon.dmds.models.DMDSPoint getTransLowerLeft() {
        return this.Camera2StreamConfigurationMap;
    }

    public com.daon.dmds.models.DMDSPoint getTransLowerRight() {
        return this.getHighSpeedVideoSizes;
    }

    public com.daon.dmds.models.DMDSPoint getTransUpperLeft() {
        return this.getHighResolutionOutputSizeshNQ4ISI;
    }

    public com.daon.dmds.models.DMDSPoint getTransUpperRight() {
        return this.getOutputMinFrameDuration;
    }

    public android.graphics.Point getUpperLeft() {
        return this.getInputSizeshNQ4ISI;
    }

    public android.graphics.Point getUpperRight() {
        return this.getHighSpeedVideoSizesFor;
    }

    public int hashCode() {
        return java.util.Objects.hash(this.getHighResolutionOutputSizeshNQ4ISI, this.getOutputMinFrameDuration, this.Camera2StreamConfigurationMap, this.getHighSpeedVideoSizes, this.getInputSizeshNQ4ISI, this.getHighSpeedVideoSizesFor, this.getHighSpeedVideoFpsRangesFor, this.getHighSpeedVideoFpsRanges);
    }

    public com.daon.dmds.models.DMDSQuadrangle inset(com.daon.dmds.models.DMDSImageExtensionFactors dMDSImageExtensionFactors, int i, int i2) {
        com.daon.dmds.models.DMDSQuadrangle dMDSQuadrangle = new com.daon.dmds.models.DMDSQuadrangle(this);
        float top = dMDSImageExtensionFactors.getTop();
        float bottom = dMDSImageExtensionFactors.getBottom();
        float left = dMDSImageExtensionFactors.getLeft();
        float right = dMDSImageExtensionFactors.getRight();
        android.graphics.Point upperLeft = dMDSQuadrangle.getUpperLeft();
        android.graphics.Point upperRight = dMDSQuadrangle.getUpperRight();
        android.graphics.Point lowerLeft = dMDSQuadrangle.getLowerLeft();
        android.graphics.Point lowerRight = dMDSQuadrangle.getLowerRight();
        if (top > 0.0f) {
            int i3 = upperLeft.y - ((int) ((lowerLeft.y - r9) * top));
            upperLeft.y = i3;
            if (i3 < 0) {
                upperLeft.y = 0;
            }
            int i4 = upperRight.y - ((int) ((lowerRight.y - r9) * top));
            upperRight.y = i4;
            if (i4 < 0) {
                upperRight.y = 0;
            }
        }
        if (left > 0.0f) {
            int i5 = upperLeft.x - ((int) ((upperRight.x - r1) * left));
            upperLeft.x = i5;
            if (i5 < 0) {
                upperLeft.x = 0;
            }
            int i6 = lowerLeft.x - ((int) ((lowerRight.x - r1) * left));
            lowerLeft.x = i6;
            if (i6 < 0) {
                lowerLeft.x = 0;
            }
        }
        if (right > 0.0f) {
            int i7 = upperRight.x + ((int) ((r1 - upperLeft.x) * right));
            upperRight.x = i7;
            if (i7 > i) {
                upperRight.x = i;
            }
            int i8 = lowerRight.x + ((int) ((r1 - lowerLeft.x) * right));
            lowerRight.x = i8;
            if (i8 > i) {
                lowerRight.x = i;
            }
        }
        if (bottom > 0.0f) {
            int i9 = lowerRight.y + ((int) ((r13 - upperRight.y) * bottom));
            lowerRight.y = i9;
            if (i9 > i2) {
                lowerRight.y = i2;
            }
            int i10 = lowerLeft.y + ((int) ((r13 - upperLeft.y) * bottom));
            lowerLeft.y = i10;
            if (i10 > i2) {
                lowerLeft.y = i2;
            }
        }
        dMDSQuadrangle.setUpperLeft(upperLeft);
        dMDSQuadrangle.setUpperRight(upperRight);
        dMDSQuadrangle.setLowerLeft(lowerLeft);
        dMDSQuadrangle.setLowerRight(lowerRight);
        return dMDSQuadrangle;
    }

    public void setLowerLeft(android.graphics.Point point) {
        this.getHighSpeedVideoFpsRangesFor = point;
    }

    public void setLowerRight(android.graphics.Point point) {
        this.getHighSpeedVideoFpsRanges = point;
    }

    public void setTransLowerLeft(com.daon.dmds.models.DMDSPoint dMDSPoint) {
        this.Camera2StreamConfigurationMap = dMDSPoint;
    }

    public void setTransLowerRight(com.daon.dmds.models.DMDSPoint dMDSPoint) {
        this.getHighSpeedVideoSizes = dMDSPoint;
    }

    public void setTransUpperLeft(com.daon.dmds.models.DMDSPoint dMDSPoint) {
        this.getHighResolutionOutputSizeshNQ4ISI = dMDSPoint;
    }

    public void setTransUpperRight(com.daon.dmds.models.DMDSPoint dMDSPoint) {
        this.getOutputMinFrameDuration = dMDSPoint;
    }

    public void setUpperLeft(android.graphics.Point point) {
        this.getInputSizeshNQ4ISI = point;
    }

    public void setUpperRight(android.graphics.Point point) {
        this.getHighSpeedVideoSizesFor = point;
    }

    public java.lang.String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder("DMDSQuadrangle{ upperLeft='");
        sb.append(this.getInputSizeshNQ4ISI);
        sb.append("', upperRight='");
        sb.append(this.getHighSpeedVideoSizesFor);
        sb.append("', lowerLeft='");
        sb.append(this.getHighSpeedVideoFpsRangesFor);
        sb.append("', lowerRight='");
        sb.append(this.getHighSpeedVideoFpsRanges);
        sb.append("'}");
        return sb.toString();
    }

    @Override // android.os.Parcelable
    public void writeToParcel(android.os.Parcel parcel, int i) {
        parcel.writeParcelable(getUpperLeft(), i);
        parcel.writeParcelable(getUpperRight(), i);
        parcel.writeParcelable(getLowerLeft(), i);
        parcel.writeParcelable(getLowerRight(), i);
        parcel.writeParcelable(getTransLowerLeft(), i);
        parcel.writeParcelable(getTransLowerRight(), i);
        parcel.writeParcelable(getTransUpperLeft(), i);
        parcel.writeParcelable(getTransUpperRight(), i);
    }

    public DMDSQuadrangle(com.daon.dmds.models.DMDSQuadrangle dMDSQuadrangle) {
        this.getInputSizeshNQ4ISI = dMDSQuadrangle.getUpperLeft();
        this.getHighSpeedVideoSizesFor = dMDSQuadrangle.getUpperRight();
        this.getHighSpeedVideoFpsRangesFor = dMDSQuadrangle.getLowerLeft();
        this.getHighSpeedVideoFpsRanges = dMDSQuadrangle.getLowerRight();
        this.Camera2StreamConfigurationMap = dMDSQuadrangle.getTransLowerLeft();
        this.getHighSpeedVideoSizes = dMDSQuadrangle.getTransLowerRight();
        this.getHighResolutionOutputSizeshNQ4ISI = dMDSQuadrangle.getTransUpperLeft();
        this.getOutputMinFrameDuration = dMDSQuadrangle.getTransUpperRight();
    }

    public DMDSQuadrangle(android.graphics.Point point, android.graphics.Point point2, android.graphics.Point point3, android.graphics.Point point4) {
        setUpperRight(point2);
        setUpperLeft(point);
        setLowerLeft(point3);
        setLowerRight(point4);
    }

    public DMDSQuadrangle(com.daon.dmds.models.DMDSPoint dMDSPoint, com.daon.dmds.models.DMDSPoint dMDSPoint2, com.daon.dmds.models.DMDSPoint dMDSPoint3, com.daon.dmds.models.DMDSPoint dMDSPoint4) {
        setTransUpperRight(dMDSPoint2);
        setTransUpperLeft(dMDSPoint);
        setTransLowerLeft(dMDSPoint3);
        setTransLowerRight(dMDSPoint4);
    }
}
