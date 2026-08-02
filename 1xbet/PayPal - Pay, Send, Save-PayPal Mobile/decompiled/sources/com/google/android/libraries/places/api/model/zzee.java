package com.google.android.libraries.places.api.model;

/* loaded from: classes8.dex */
final class zzee extends com.google.android.libraries.places.api.model.zzat {
    public static final android.os.Parcelable.Creator<com.google.android.libraries.places.api.model.zzee> CREATOR = new com.google.android.libraries.places.api.model.zzed();

    zzee(com.google.android.libraries.places.api.model.ContentBlock contentBlock, com.google.android.libraries.places.api.model.ContentBlock contentBlock2, android.net.Uri uri, java.lang.String str, java.lang.String str2) {
        super(contentBlock, contentBlock2, uri, str, str2);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(android.os.Parcel parcel, int i) {
        parcel.writeParcelable(getOverview(), i);
        parcel.writeParcelable(getDescription(), i);
        parcel.writeParcelable(getFlagContentUri(), i);
        if (getDisclosureText() == null) {
            parcel.writeInt(1);
        } else {
            parcel.writeInt(0);
            parcel.writeString(getDisclosureText());
        }
        if (getDisclosureTextLanguageCode() == null) {
            parcel.writeInt(1);
        } else {
            parcel.writeInt(0);
            parcel.writeString(getDisclosureTextLanguageCode());
        }
    }
}
