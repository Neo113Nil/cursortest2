package com.microblink.blinkid.view;

/* loaded from: classes10.dex */
public enum CameraAspectMode implements android.os.Parcelable {
    ASPECT_FIT,
    ASPECT_FILL;

    public static final android.os.Parcelable.Creator<com.microblink.blinkid.view.CameraAspectMode> CREATOR = new android.os.Parcelable.Creator() { // from class: com.microblink.blinkid.secured.IIlIIlIllI
        @Override // android.os.Parcelable.Creator
        public final java.lang.Object createFromParcel(android.os.Parcel parcel) {
            return com.microblink.blinkid.view.CameraAspectMode.values()[parcel.readInt()];
        }

        @Override // android.os.Parcelable.Creator
        public final java.lang.Object[] newArray(int i) {
            return new com.microblink.blinkid.view.CameraAspectMode[i];
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
