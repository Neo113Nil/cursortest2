package com.google.android.libraries.places.api.model;

/* loaded from: classes8.dex */
final class zzfc extends com.google.android.libraries.places.api.model.zzbq {
    public static final android.os.Parcelable.Creator<com.google.android.libraries.places.api.model.zzfc> CREATOR = new com.google.android.libraries.places.api.model.zzfb();

    zzfc(java.lang.String str, java.lang.String str2, android.net.Uri uri, java.lang.String str3, java.lang.String str4, android.net.Uri uri2) {
        super(str, str2, uri, str3, str4, uri2);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(android.os.Parcel parcel, int i) {
        if (getText() == null) {
            parcel.writeInt(1);
        } else {
            parcel.writeInt(0);
            parcel.writeString(getText());
        }
        if (getTextLanguageCode() == null) {
            parcel.writeInt(1);
        } else {
            parcel.writeInt(0);
            parcel.writeString(getTextLanguageCode());
        }
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
        parcel.writeParcelable(getReviewsUri(), i);
    }
}
