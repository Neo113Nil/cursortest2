package com.microblink.blinkid.hardware.camera;

/* loaded from: classes.dex */
public enum CameraType implements android.os.Parcelable {
    CAMERA_DEFAULT,
    CAMERA_BACKFACE,
    CAMERA_FRONTFACE;

    public static final android.os.Parcelable.Creator<com.microblink.blinkid.hardware.camera.CameraType> CREATOR = new android.os.Parcelable.Creator() { // from class: com.microblink.blinkid.secured.IIIIIlIIII
        @Override // android.os.Parcelable.Creator
        public final java.lang.Object createFromParcel(android.os.Parcel parcel) {
            return com.microblink.blinkid.hardware.camera.CameraType.values()[parcel.readInt()];
        }

        @Override // android.os.Parcelable.Creator
        public final java.lang.Object[] newArray(int i) {
            return new com.microblink.blinkid.hardware.camera.CameraType[i];
        }
    };

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(android.os.Parcel parcel, int i) {
        parcel.writeInt(ordinal());
    }
}
