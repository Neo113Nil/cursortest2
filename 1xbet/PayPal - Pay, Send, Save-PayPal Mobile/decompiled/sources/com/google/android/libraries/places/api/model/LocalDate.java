package com.google.android.libraries.places.api.model;

/* loaded from: classes8.dex */
public abstract class LocalDate implements android.os.Parcelable, java.lang.Comparable<com.google.android.libraries.places.api.model.LocalDate> {
    public static com.google.android.libraries.places.api.model.LocalDate newInstance(int i, int i2, int i3) {
        com.google.android.libraries.places.api.model.zzam zzamVar = new com.google.android.libraries.places.api.model.zzam();
        zzamVar.zza(i);
        zzamVar.zzb(i2);
        zzamVar.zzc(i3);
        com.google.android.libraries.places.api.model.LocalDate zzd = zzamVar.zzd();
        int month = zzd.getMonth();
        com.google.common.collect.Range closed = com.google.common.collect.Range.closed(1, 12);
        java.lang.Integer valueOf = java.lang.Integer.valueOf(month);
        com.google.common.base.Preconditions.checkArgument(closed.contains(valueOf), "Month must not be out of range of 1 to 12, but was: %s.", month);
        int day = zzd.getDay();
        com.google.common.collect.Range closed2 = com.google.common.collect.Range.closed(1, 31);
        java.lang.Integer valueOf2 = java.lang.Integer.valueOf(day);
        com.google.common.base.Preconditions.checkArgument(closed2.contains(valueOf2), "Day must not be out of range of 1 to 31, but was: %s.", day);
        if (java.util.Arrays.asList(4, 6, 9, 11).contains(valueOf)) {
            com.google.common.base.Preconditions.checkArgument(com.google.common.collect.Range.closed(1, 30).contains(valueOf2), "%s is not a valid day for month %s.", day, month);
        }
        if (month == 2) {
            int year = zzd.getYear();
            com.google.common.base.Preconditions.checkArgument(com.google.common.collect.Range.closed(1, java.lang.Integer.valueOf(year % 4 == 0 ? 29 : 28)).contains(valueOf2), "%s is not a valid day for month %s in year %s.", valueOf2, 2, java.lang.Integer.valueOf(year));
        }
        return zzd;
    }

    @Override // java.lang.Comparable
    public int compareTo(com.google.android.libraries.places.api.model.LocalDate localDate) {
        int day;
        int day2;
        com.google.common.base.Preconditions.checkNotNull(localDate, "dateToCompare must not be null.");
        if (this == localDate) {
            return 0;
        }
        if (getYear() != localDate.getYear()) {
            day = getYear();
            day2 = localDate.getYear();
        } else if (getMonth() != localDate.getMonth()) {
            day = getMonth();
            day2 = localDate.getMonth();
        } else {
            day = getDay();
            day2 = localDate.getDay();
        }
        return day - day2;
    }

    public abstract int getDay();

    public abstract int getMonth();

    public abstract int getYear();

    public final java.lang.String toString() {
        return java.lang.String.format(java.util.Locale.getDefault(), "%s-%s-%s", java.lang.Integer.valueOf(getYear()), java.lang.String.format(java.util.Locale.getDefault(), com.google.android.material.timepicker.TimeModel.ZERO_LEADING_NUMBER_FORMAT, java.lang.Integer.valueOf(getMonth())), java.lang.String.format(java.util.Locale.getDefault(), com.google.android.material.timepicker.TimeModel.ZERO_LEADING_NUMBER_FORMAT, java.lang.Integer.valueOf(getDay())));
    }
}
