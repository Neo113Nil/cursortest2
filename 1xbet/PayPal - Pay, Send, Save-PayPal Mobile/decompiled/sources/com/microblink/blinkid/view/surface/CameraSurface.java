package com.microblink.blinkid.view.surface;

/* loaded from: classes10.dex */
public enum CameraSurface implements android.os.Parcelable {
    SURFACE_DEFAULT,
    SURFACE_TEXTURE_VIEW,
    SURFACE_SURFACE_VIEW;

    public static final android.os.Parcelable.Creator<com.microblink.blinkid.view.surface.CameraSurface> CREATOR = new android.os.Parcelable.Creator() { // from class: com.microblink.blinkid.secured.llIllllIIl
        @Override // android.os.Parcelable.Creator
        public final java.lang.Object createFromParcel(android.os.Parcel parcel) {
            return com.microblink.blinkid.view.surface.CameraSurface.values()[parcel.readInt()];
        }

        @Override // android.os.Parcelable.Creator
        public final java.lang.Object[] newArray(int i) {
            return new com.microblink.blinkid.view.surface.CameraSurface[i];
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
