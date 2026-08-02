package com.google.android.libraries.places.api.model;

/* loaded from: classes8.dex */
final class zzcq extends com.google.android.libraries.places.api.model.zzj {
    public static final android.os.Parcelable.Creator<com.google.android.libraries.places.api.model.zzcq> CREATOR = new com.google.android.libraries.places.api.model.zzcp();

    zzcq(java.lang.String str, java.lang.Integer num, java.util.List list, java.lang.String str2, java.lang.String str3, java.lang.String str4, java.util.List list2, java.util.List list3, java.util.List list4) {
        super(str, num, list, str2, str3, str4, list2, list3, list4);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(android.os.Parcel parcel, int i) {
        parcel.writeString(getPlaceId());
        if (getDistanceMeters() == null) {
            parcel.writeInt(1);
        } else {
            parcel.writeInt(0);
            parcel.writeInt(getDistanceMeters().intValue());
        }
        parcel.writeList(getTypes());
        parcel.writeString(zza());
        parcel.writeString(zzb());
        parcel.writeString(zzc());
        parcel.writeList(zzd());
        parcel.writeList(zze());
        parcel.writeList(zzf());
    }
}
