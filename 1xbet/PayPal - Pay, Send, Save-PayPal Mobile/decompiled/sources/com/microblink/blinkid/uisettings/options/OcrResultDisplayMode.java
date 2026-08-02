package com.microblink.blinkid.uisettings.options;

/* loaded from: classes10.dex */
public enum OcrResultDisplayMode implements android.os.Parcelable {
    NOTHING,
    ANIMATED_DOTS,
    STATIC_CHARS;

    public static final android.os.Parcelable.Creator<com.microblink.blinkid.uisettings.options.OcrResultDisplayMode> CREATOR = new android.os.Parcelable.Creator<com.microblink.blinkid.uisettings.options.OcrResultDisplayMode>() { // from class: com.microblink.blinkid.uisettings.options.OcrResultDisplayMode.1
        @Override // android.os.Parcelable.Creator
        public /* synthetic */ com.microblink.blinkid.uisettings.options.OcrResultDisplayMode createFromParcel(android.os.Parcel parcel) {
            return com.microblink.blinkid.uisettings.options.OcrResultDisplayMode.values()[parcel.readInt()];
        }

        @Override // android.os.Parcelable.Creator
        public /* bridge */ /* synthetic */ com.microblink.blinkid.uisettings.options.OcrResultDisplayMode[] newArray(int i) {
            return new com.microblink.blinkid.uisettings.options.OcrResultDisplayMode[i];
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
