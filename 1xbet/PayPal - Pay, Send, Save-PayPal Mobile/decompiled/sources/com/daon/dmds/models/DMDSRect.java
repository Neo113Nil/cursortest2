package com.daon.dmds.models;

/* loaded from: classes7.dex */
public class DMDSRect implements android.os.Parcelable {
    public static final android.os.Parcelable.Creator<com.daon.dmds.models.DMDSRect> CREATOR = new android.os.Parcelable.Creator<com.daon.dmds.models.DMDSRect>() { // from class: com.daon.dmds.models.DMDSRect.1
        @Override // android.os.Parcelable.Creator
        public /* synthetic */ com.daon.dmds.models.DMDSRect createFromParcel(android.os.Parcel parcel) {
            return new com.daon.dmds.models.DMDSRect(parcel);
        }

        @Override // android.os.Parcelable.Creator
        public /* bridge */ /* synthetic */ com.daon.dmds.models.DMDSRect[] newArray(int i) {
            return new com.daon.dmds.models.DMDSRect[i];
        }
    };
    private float Camera2StreamConfigurationMap;
    private float getHighSpeedVideoFpsRanges;
    private float getHighSpeedVideoFpsRangesFor;
    private float getHighSpeedVideoSizes;

    public DMDSRect(float f, float f2, float f3, float f4) {
        this.getHighSpeedVideoFpsRanges = f;
        this.getHighSpeedVideoFpsRangesFor = f2;
        this.getHighSpeedVideoSizes = f3;
        this.Camera2StreamConfigurationMap = f4;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            com.daon.dmds.models.DMDSRect dMDSRect = (com.daon.dmds.models.DMDSRect) obj;
            if (java.lang.Float.compare(dMDSRect.getLeft(), getLeft()) == 0 && java.lang.Float.compare(dMDSRect.getTop(), getTop()) == 0 && java.lang.Float.compare(dMDSRect.getWidth(), getWidth()) == 0 && java.lang.Float.compare(dMDSRect.getHeight(), getHeight()) == 0) {
                return true;
            }
        }
        return false;
    }

    public float getHeight() {
        return this.Camera2StreamConfigurationMap;
    }

    public float getLeft() {
        return this.getHighSpeedVideoFpsRanges;
    }

    public float getTop() {
        return this.getHighSpeedVideoFpsRangesFor;
    }

    public float getWidth() {
        return this.getHighSpeedVideoSizes;
    }

    public void setHeight(float f) {
        this.Camera2StreamConfigurationMap = f;
    }

    public void setLeft(float f) {
        this.getHighSpeedVideoFpsRanges = f;
    }

    public void setTop(float f) {
        this.getHighSpeedVideoFpsRangesFor = f;
    }

    public void setWidth(float f) {
        this.getHighSpeedVideoSizes = f;
    }

    public java.lang.String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder("DMDSRect{left='");
        sb.append(getLeft());
        sb.append("', top='");
        sb.append(getTop());
        sb.append("', width='");
        sb.append(getWidth());
        sb.append("', height='");
        sb.append(getHeight());
        sb.append("'}");
        return sb.toString();
    }

    @Override // android.os.Parcelable
    public void writeToParcel(android.os.Parcel parcel, int i) {
        parcel.writeFloat(this.getHighSpeedVideoFpsRanges);
        parcel.writeFloat(this.getHighSpeedVideoFpsRangesFor);
        parcel.writeFloat(this.getHighSpeedVideoSizes);
        parcel.writeFloat(this.Camera2StreamConfigurationMap);
    }

    protected DMDSRect(android.os.Parcel parcel) {
        this.getHighSpeedVideoFpsRanges = 0.0f;
        this.getHighSpeedVideoFpsRangesFor = 0.0f;
        this.getHighSpeedVideoSizes = 0.0f;
        this.Camera2StreamConfigurationMap = 0.0f;
        this.getHighSpeedVideoFpsRanges = parcel.readFloat();
        this.getHighSpeedVideoFpsRangesFor = parcel.readFloat();
        this.getHighSpeedVideoSizes = parcel.readFloat();
        this.Camera2StreamConfigurationMap = parcel.readFloat();
    }
}
