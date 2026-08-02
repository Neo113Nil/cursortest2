package com.google.android.libraries.places.api.model;

/* loaded from: classes8.dex */
final class zzdc extends com.google.android.libraries.places.api.model.zzt {
    public static final android.os.Parcelable.Creator<com.google.android.libraries.places.api.model.zzdc> CREATOR = new com.google.android.libraries.places.api.model.zzdb();

    zzdc(java.lang.String str, java.lang.String str2, java.lang.String str3, android.net.Uri uri) {
        super(str, str2, str3, uri);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(android.os.Parcel parcel, int i) {
        if (getTitle() == null) {
            parcel.writeInt(1);
        } else {
            parcel.writeInt(0);
            parcel.writeString(getTitle());
        }
        if (getDescription() == null) {
            parcel.writeInt(1);
        } else {
            parcel.writeInt(0);
            parcel.writeString(getDescription());
        }
        if (getAboutLinkTitle() == null) {
            parcel.writeInt(1);
        } else {
            parcel.writeInt(0);
            parcel.writeString(getAboutLinkTitle());
        }
        parcel.writeParcelable(getAboutLinkUri(), i);
    }
}
