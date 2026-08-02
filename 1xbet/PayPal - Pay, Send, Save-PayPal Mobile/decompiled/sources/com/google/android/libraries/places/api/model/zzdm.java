package com.google.android.libraries.places.api.model;

/* loaded from: classes8.dex */
final class zzdm extends com.google.android.libraries.places.api.model.zzac {
    public static final android.os.Parcelable.Creator<com.google.android.libraries.places.api.model.zzdm> CREATOR = new com.google.android.libraries.places.api.model.zzdl();

    zzdm(com.google.android.libraries.places.api.model.ContentBlock contentBlock, com.google.android.libraries.places.api.model.ContentBlock contentBlock2, com.google.android.libraries.places.api.model.ContentBlock contentBlock3, com.google.android.libraries.places.api.model.ContentBlock contentBlock4, android.net.Uri uri, java.lang.String str, java.lang.String str2) {
        super(contentBlock, contentBlock2, contentBlock3, contentBlock4, uri, str, str2);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(android.os.Parcel parcel, int i) {
        parcel.writeParcelable(getOverview(), i);
        parcel.writeParcelable(getCoffee(), i);
        parcel.writeParcelable(getRestaurant(), i);
        parcel.writeParcelable(getStore(), i);
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
