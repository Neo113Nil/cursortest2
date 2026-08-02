package com.google.android.libraries.places.api.model;

/* loaded from: classes8.dex */
final class zzfm extends com.google.android.libraries.places.api.model.zzbz {
    public static final android.os.Parcelable.Creator<com.google.android.libraries.places.api.model.zzfm> CREATOR = new com.google.android.libraries.places.api.model.zzfl();

    zzfm(com.google.android.libraries.places.api.model.LocalDate localDate, boolean z) {
        super(localDate, z);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(android.os.Parcel parcel, int i) {
        parcel.writeParcelable(getDate(), i);
        parcel.writeInt(isExceptional() ? 1 : 0);
    }
}
