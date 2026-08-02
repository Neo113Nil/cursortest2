package com.google.android.libraries.places.api.model;

/* loaded from: classes8.dex */
final class zzeo extends com.google.android.libraries.places.api.model.zzbd {
    public static final android.os.Parcelable.Creator<com.google.android.libraries.places.api.model.zzeo> CREATOR = new com.google.android.libraries.places.api.model.zzen();

    zzeo(java.lang.String str, int i, int i2, java.lang.String str2, java.lang.String str3, com.google.android.libraries.places.api.model.AuthorAttributions authorAttributions, android.net.Uri uri) {
        super(str, i, i2, str2, str3, authorAttributions, uri);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(android.os.Parcel parcel, int i) {
        parcel.writeString(getAttributions());
        parcel.writeInt(getHeight());
        parcel.writeInt(getWidth());
        parcel.writeString(zza());
        if (zzb() == null) {
            parcel.writeInt(1);
        } else {
            parcel.writeInt(0);
            parcel.writeString(zzb());
        }
        parcel.writeParcelable(getAuthorAttributions(), i);
        parcel.writeParcelable(zzc(), i);
    }
}
