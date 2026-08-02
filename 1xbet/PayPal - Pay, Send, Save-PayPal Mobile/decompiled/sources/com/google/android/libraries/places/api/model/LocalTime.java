package com.google.android.libraries.places.api.model;

/* loaded from: classes8.dex */
public abstract class LocalTime implements android.os.Parcelable, java.lang.Comparable<com.google.android.libraries.places.api.model.LocalTime> {
    public static com.google.android.libraries.places.api.model.LocalTime newInstance(int i, int i2) {
        try {
            com.google.android.libraries.places.api.model.zzao zzaoVar = new com.google.android.libraries.places.api.model.zzao();
            zzaoVar.zza(i);
            zzaoVar.zzb(i2);
            com.google.android.libraries.places.api.model.LocalTime zzc = zzaoVar.zzc();
            int hours = zzc.getHours();
            com.google.common.base.Preconditions.checkState(com.google.common.collect.Range.closed(0, 23).contains(java.lang.Integer.valueOf(hours)), "Hours must not be out-of-range: 0 to 23, but was: %s.", hours);
            int minutes = zzc.getMinutes();
            com.google.common.base.Preconditions.checkState(com.google.common.collect.Range.closed(0, 59).contains(java.lang.Integer.valueOf(minutes)), "Minutes must not be out-of-range: 0 to 59, but was: %s.", minutes);
            return zzc;
        } catch (java.lang.IllegalStateException e) {
            throw new java.lang.IllegalArgumentException(e);
        }
    }

    @Override // java.lang.Comparable
    public int compareTo(com.google.android.libraries.places.api.model.LocalTime localTime) {
        int hours;
        int hours2;
        com.google.common.base.Preconditions.checkNotNull(localTime, "compare must not be null.");
        if (this == localTime) {
            return 0;
        }
        if (getHours() == localTime.getHours()) {
            hours = getMinutes();
            hours2 = localTime.getMinutes();
        } else {
            hours = getHours();
            hours2 = localTime.getHours();
        }
        return hours - hours2;
    }

    public abstract int getHours();

    public abstract int getMinutes();
}
