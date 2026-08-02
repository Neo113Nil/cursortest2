package com.google.android.libraries.places.api.model;

/* loaded from: classes8.dex */
final class zzfp implements android.os.Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ java.lang.Object createFromParcel(android.os.Parcel parcel) {
        return new com.google.android.libraries.places.api.model.zzfq((com.google.android.libraries.places.api.model.LocalDate) parcel.readParcelable(com.google.android.libraries.places.api.model.TimeOfWeek.class.getClassLoader()), (com.google.android.libraries.places.api.model.DayOfWeek) parcel.readParcelable(com.google.android.libraries.places.api.model.TimeOfWeek.class.getClassLoader()), (com.google.android.libraries.places.api.model.LocalTime) parcel.readParcelable(com.google.android.libraries.places.api.model.TimeOfWeek.class.getClassLoader()), parcel.readInt() == 1);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ java.lang.Object[] newArray(int i) {
        return new com.google.android.libraries.places.api.model.zzfq[i];
    }

    zzfp() {
    }
}
