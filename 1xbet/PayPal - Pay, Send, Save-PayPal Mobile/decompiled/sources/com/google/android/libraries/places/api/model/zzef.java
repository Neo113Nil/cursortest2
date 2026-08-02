package com.google.android.libraries.places.api.model;

/* loaded from: classes8.dex */
final class zzef implements android.os.Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ java.lang.Object createFromParcel(android.os.Parcel parcel) {
        java.lang.Boolean bool;
        com.google.android.libraries.places.api.model.OpeningHours.HoursType hoursType = (com.google.android.libraries.places.api.model.OpeningHours.HoursType) parcel.readParcelable(com.google.android.libraries.places.api.model.OpeningHours.class.getClassLoader());
        java.util.ArrayList readArrayList = parcel.readArrayList(com.google.android.libraries.places.api.model.OpeningHours.class.getClassLoader());
        java.util.ArrayList readArrayList2 = parcel.readArrayList(com.google.android.libraries.places.api.model.OpeningHours.class.getClassLoader());
        java.util.ArrayList readArrayList3 = parcel.readArrayList(com.google.android.libraries.places.api.model.OpeningHours.class.getClassLoader());
        if (parcel.readInt() == 0) {
            bool = java.lang.Boolean.valueOf(parcel.readInt() == 1);
        } else {
            bool = null;
        }
        return new com.google.android.libraries.places.api.model.zzeg(hoursType, readArrayList, readArrayList2, readArrayList3, bool, parcel.readInt() == 0 ? (java.time.Instant) parcel.readSerializable() : null, parcel.readInt() == 0 ? (java.time.Instant) parcel.readSerializable() : null);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ java.lang.Object[] newArray(int i) {
        return new com.google.android.libraries.places.api.model.zzeg[i];
    }

    zzef() {
    }
}
