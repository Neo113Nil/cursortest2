package com.google.android.libraries.places.api.model;

/* loaded from: classes8.dex */
final class zzfq extends com.google.android.libraries.places.api.model.zzcd {
    public static final android.os.Parcelable.Creator<com.google.android.libraries.places.api.model.zzfq> CREATOR = new com.google.android.libraries.places.api.model.zzfp();

    zzfq(com.google.android.libraries.places.api.model.LocalDate localDate, com.google.android.libraries.places.api.model.DayOfWeek dayOfWeek, com.google.android.libraries.places.api.model.LocalTime localTime, boolean z) {
        super(localDate, dayOfWeek, localTime, z);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(android.os.Parcel parcel, int i) {
        parcel.writeParcelable(getDate(), i);
        parcel.writeParcelable(getDay(), i);
        parcel.writeParcelable(getTime(), i);
        parcel.writeInt(isTruncated() ? 1 : 0);
    }
}
