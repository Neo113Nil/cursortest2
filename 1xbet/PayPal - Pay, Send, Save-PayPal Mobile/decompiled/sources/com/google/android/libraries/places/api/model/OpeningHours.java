package com.google.android.libraries.places.api.model;

/* loaded from: classes4.dex */
public abstract class OpeningHours implements android.os.Parcelable {

    /* loaded from: classes8.dex */
    public static abstract class Builder {
        public com.google.android.libraries.places.api.model.OpeningHours build() {
            com.google.android.libraries.places.api.model.OpeningHours zzd = zzd();
            java.util.Iterator<java.lang.String> it = zzd.getWeekdayText().iterator();
            while (it.hasNext()) {
                com.google.common.base.Preconditions.checkArgument(!android.text.TextUtils.isEmpty(it.next()), "WeekdayText must not contain null or empty values.");
            }
            setPeriods(com.google.common.collect.ImmutableList.copyOf((java.util.Collection) zzd.getPeriods()));
            setWeekdayText(com.google.common.collect.ImmutableList.copyOf((java.util.Collection) zzd.getWeekdayText()));
            setSpecialDays(com.google.common.collect.ImmutableList.copyOf((java.util.Collection) zzd.getSpecialDays()));
            return zzd();
        }

        public abstract com.google.android.libraries.places.api.model.OpeningHours.HoursType getHoursType();

        public abstract java.util.List<com.google.android.libraries.places.api.model.Period> getPeriods();

        public abstract java.util.List<com.google.android.libraries.places.api.model.SpecialDay> getSpecialDays();

        public abstract java.util.List<java.lang.String> getWeekdayText();

        public abstract com.google.android.libraries.places.api.model.OpeningHours.Builder setHoursType(com.google.android.libraries.places.api.model.OpeningHours.HoursType hoursType);

        public abstract com.google.android.libraries.places.api.model.OpeningHours.Builder setPeriods(java.util.List<com.google.android.libraries.places.api.model.Period> list);

        public abstract com.google.android.libraries.places.api.model.OpeningHours.Builder setSpecialDays(java.util.List<com.google.android.libraries.places.api.model.SpecialDay> list);

        public abstract com.google.android.libraries.places.api.model.OpeningHours.Builder setWeekdayText(java.util.List<java.lang.String> list);

        public abstract com.google.android.libraries.places.api.model.OpeningHours.Builder zza(java.lang.Boolean bool);

        public abstract com.google.android.libraries.places.api.model.OpeningHours.Builder zzb(java.time.Instant instant);

        public abstract com.google.android.libraries.places.api.model.OpeningHours.Builder zzc(java.time.Instant instant);

        abstract com.google.android.libraries.places.api.model.OpeningHours zzd();
    }

    public enum HoursType implements android.os.Parcelable {
        ACCESS,
        BREAKFAST,
        BRUNCH,
        DELIVERY,
        DINNER,
        DRIVE_THROUGH,
        HAPPY_HOUR,
        KITCHEN,
        LUNCH,
        ONLINE_SERVICE_HOURS,
        PICKUP,
        SENIOR_HOURS,
        TAKEOUT;

        public static final android.os.Parcelable.Creator<com.google.android.libraries.places.api.model.OpeningHours.HoursType> CREATOR = new com.google.android.libraries.places.api.model.zzfy();

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(android.os.Parcel parcel, int i) {
            parcel.writeString(name());
        }
    }

    public static com.google.android.libraries.places.api.model.OpeningHours.Builder builder() {
        com.google.android.libraries.places.api.model.zzau zzauVar = new com.google.android.libraries.places.api.model.zzau();
        zzauVar.setPeriods(new java.util.ArrayList());
        zzauVar.setSpecialDays(new java.util.ArrayList());
        zzauVar.setWeekdayText(new java.util.ArrayList());
        return zzauVar;
    }

    public abstract com.google.android.libraries.places.api.model.OpeningHours.HoursType getHoursType();

    public abstract java.util.List<com.google.android.libraries.places.api.model.Period> getPeriods();

    public abstract java.util.List<com.google.android.libraries.places.api.model.SpecialDay> getSpecialDays();

    public abstract java.util.List<java.lang.String> getWeekdayText();

    public abstract java.lang.Boolean zza();

    public abstract java.time.Instant zzb();

    public abstract java.time.Instant zzc();
}
