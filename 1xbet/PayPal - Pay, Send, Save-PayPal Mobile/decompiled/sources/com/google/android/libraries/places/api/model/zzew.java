package com.google.android.libraries.places.api.model;

/* loaded from: classes8.dex */
final class zzew extends com.google.android.libraries.places.api.model.zzbk {
    public static final android.os.Parcelable.Creator<com.google.android.libraries.places.api.model.zzew> CREATOR = new com.google.android.libraries.places.api.model.zzev();

    zzew(com.google.android.libraries.places.api.model.Money money, com.google.android.libraries.places.api.model.Money money2) {
        super(money, money2);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(android.os.Parcel parcel, int i) {
        parcel.writeParcelable(zza(), i);
        parcel.writeParcelable(zzb(), i);
    }
}
