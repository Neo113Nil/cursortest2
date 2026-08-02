package com.google.android.libraries.places.api.model;

/* loaded from: classes8.dex */
final class zzeg extends com.google.android.libraries.places.api.model.zzav {
    public static final android.os.Parcelable.Creator<com.google.android.libraries.places.api.model.zzeg> CREATOR = new com.google.android.libraries.places.api.model.zzef();

    zzeg(com.google.android.libraries.places.api.model.OpeningHours.HoursType hoursType, java.util.List list, java.util.List list2, java.util.List list3, java.lang.Boolean bool, java.time.Instant instant, java.time.Instant instant2) {
        super(hoursType, list, list2, list3, bool, instant, instant2);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(android.os.Parcel parcel, int i) {
        parcel.writeParcelable(getHoursType(), i);
        parcel.writeList(getPeriods());
        parcel.writeList(getSpecialDays());
        parcel.writeList(getWeekdayText());
        if (zza() == null) {
            parcel.writeInt(1);
        } else {
            parcel.writeInt(0);
            parcel.writeInt(zza().booleanValue() ? 1 : 0);
        }
        if (zzb() == null) {
            parcel.writeInt(1);
        } else {
            parcel.writeInt(0);
            parcel.writeSerializable(zzb());
        }
        if (zzc() == null) {
            parcel.writeInt(1);
        } else {
            parcel.writeInt(0);
            parcel.writeSerializable(zzc());
        }
    }
}
