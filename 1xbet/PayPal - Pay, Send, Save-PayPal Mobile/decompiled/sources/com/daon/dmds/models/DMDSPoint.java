package com.daon.dmds.models;

/* loaded from: classes7.dex */
public class DMDSPoint implements android.os.Parcelable {
    public static final android.os.Parcelable.Creator<com.daon.dmds.models.DMDSPoint> CREATOR = new android.os.Parcelable.Creator<com.daon.dmds.models.DMDSPoint>() { // from class: com.daon.dmds.models.DMDSPoint.1
        @Override // android.os.Parcelable.Creator
        public /* synthetic */ com.daon.dmds.models.DMDSPoint createFromParcel(android.os.Parcel parcel) {
            return new com.daon.dmds.models.DMDSPoint(parcel);
        }

        @Override // android.os.Parcelable.Creator
        public /* bridge */ /* synthetic */ com.daon.dmds.models.DMDSPoint[] newArray(int i) {
            return new com.daon.dmds.models.DMDSPoint[i];
        }
    };
    private float Camera2StreamConfigurationMap;
    private float getHighSpeedVideoSizes;

    public DMDSPoint(android.os.Parcel parcel) {
        this.getHighSpeedVideoSizes = parcel.readFloat();
        this.Camera2StreamConfigurationMap = parcel.readFloat();
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public float getX() {
        return this.getHighSpeedVideoSizes;
    }

    public float getY() {
        return this.Camera2StreamConfigurationMap;
    }

    public void setX(float f) {
        this.getHighSpeedVideoSizes = f;
    }

    public void setY(float f) {
        this.Camera2StreamConfigurationMap = f;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(android.os.Parcel parcel, int i) {
        parcel.writeFloat(this.getHighSpeedVideoSizes);
        parcel.writeFloat(this.Camera2StreamConfigurationMap);
    }

    public DMDSPoint(float f, float f2) {
        this.getHighSpeedVideoSizes = f;
        this.Camera2StreamConfigurationMap = f2;
    }
}
