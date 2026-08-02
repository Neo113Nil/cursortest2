package com.google.android.libraries.places.api.model;

/* loaded from: classes8.dex */
final class zzds extends com.google.android.libraries.places.api.model.zzai {
    public static final android.os.Parcelable.Creator<com.google.android.libraries.places.api.model.zzds> CREATOR = new com.google.android.libraries.places.api.model.zzdr();

    zzds(java.lang.String str, java.lang.String str2, android.net.Uri uri, java.lang.String str3, java.lang.String str4) {
        super(str, str2, uri, str3, str4);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(android.os.Parcel parcel, int i) {
        if (getOverview() == null) {
            parcel.writeInt(1);
        } else {
            parcel.writeInt(0);
            parcel.writeString(getOverview());
        }
        if (getOverviewLanguageCode() == null) {
            parcel.writeInt(1);
        } else {
            parcel.writeInt(0);
            parcel.writeString(getOverviewLanguageCode());
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
    }
}
