package com.google.android.libraries.places.api.model;

/* loaded from: classes8.dex */
final class zzde extends com.google.android.libraries.places.api.model.zzv {
    public static final android.os.Parcelable.Creator<com.google.android.libraries.places.api.model.zzde> CREATOR = new com.google.android.libraries.places.api.model.zzdd();

    zzde(java.lang.String str, java.lang.String str2, java.util.List list, java.util.List list2) {
        super(str, str2, list, list2);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(android.os.Parcel parcel, int i) {
        if (getContent() == null) {
            parcel.writeInt(1);
        } else {
            parcel.writeInt(0);
            parcel.writeString(getContent());
        }
        if (getContentLanguageCode() == null) {
            parcel.writeInt(1);
        } else {
            parcel.writeInt(0);
            parcel.writeString(getContentLanguageCode());
        }
        parcel.writeList(getReferencedPlaceResourceNames());
        parcel.writeList(getReferencedPlaceIds());
    }
}
