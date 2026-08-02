package com.google.android.libraries.places.api.model;

/* loaded from: classes8.dex */
final class zzcz implements android.os.Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ java.lang.Object createFromParcel(android.os.Parcel parcel) {
        return new com.google.android.libraries.places.api.model.zzda(parcel.readInt() == 0 ? parcel.readString() : null, (com.google.android.libraries.places.api.model.ConsumerAlertDetails) parcel.readParcelable(com.google.android.libraries.places.api.model.ConsumerAlert.class.getClassLoader()), parcel.readInt() == 0 ? parcel.readString() : null);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ java.lang.Object[] newArray(int i) {
        return new com.google.android.libraries.places.api.model.zzda[i];
    }

    zzcz() {
    }
}
