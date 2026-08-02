package com.google.android.libraries.places.api.model;

/* loaded from: classes8.dex */
public abstract class TimeOfWeek implements android.os.Parcelable {

    public static abstract class Builder {
        public abstract com.google.android.libraries.places.api.model.TimeOfWeek build();

        public abstract com.google.android.libraries.places.api.model.LocalDate getDate();

        public abstract com.google.android.libraries.places.api.model.DayOfWeek getDay();

        public abstract com.google.android.libraries.places.api.model.LocalTime getTime();

        public abstract boolean isTruncated();

        public abstract com.google.android.libraries.places.api.model.TimeOfWeek.Builder setDate(com.google.android.libraries.places.api.model.LocalDate localDate);

        public abstract com.google.android.libraries.places.api.model.TimeOfWeek.Builder setDay(com.google.android.libraries.places.api.model.DayOfWeek dayOfWeek);

        public abstract com.google.android.libraries.places.api.model.TimeOfWeek.Builder setTime(com.google.android.libraries.places.api.model.LocalTime localTime);

        public abstract com.google.android.libraries.places.api.model.TimeOfWeek.Builder setTruncated(boolean z);
    }

    public static com.google.android.libraries.places.api.model.TimeOfWeek.Builder builder(com.google.android.libraries.places.api.model.DayOfWeek dayOfWeek, com.google.android.libraries.places.api.model.LocalTime localTime) {
        com.google.android.libraries.places.api.model.zzcc zzccVar = new com.google.android.libraries.places.api.model.zzcc();
        zzccVar.setDay(dayOfWeek);
        zzccVar.setTime(localTime);
        zzccVar.setTruncated(false);
        return zzccVar;
    }

    public static com.google.android.libraries.places.api.model.TimeOfWeek newInstance(com.google.android.libraries.places.api.model.DayOfWeek dayOfWeek, com.google.android.libraries.places.api.model.LocalTime localTime) {
        return builder(dayOfWeek, localTime).build();
    }

    public abstract com.google.android.libraries.places.api.model.LocalDate getDate();

    public abstract com.google.android.libraries.places.api.model.DayOfWeek getDay();

    public abstract com.google.android.libraries.places.api.model.LocalTime getTime();

    public abstract boolean isTruncated();
}
