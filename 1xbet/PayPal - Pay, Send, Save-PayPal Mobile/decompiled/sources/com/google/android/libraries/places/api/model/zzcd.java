package com.google.android.libraries.places.api.model;

/* loaded from: classes8.dex */
abstract class zzcd extends com.google.android.libraries.places.api.model.TimeOfWeek {
    private final com.google.android.libraries.places.api.model.LocalDate zza;
    private final com.google.android.libraries.places.api.model.DayOfWeek zzb;
    private final com.google.android.libraries.places.api.model.LocalTime zzc;
    private final boolean zzd;

    zzcd(com.google.android.libraries.places.api.model.LocalDate localDate, com.google.android.libraries.places.api.model.DayOfWeek dayOfWeek, com.google.android.libraries.places.api.model.LocalTime localTime, boolean z) {
        this.zza = localDate;
        if (dayOfWeek == null) {
            throw new java.lang.NullPointerException("Null day");
        }
        this.zzb = dayOfWeek;
        if (localTime == null) {
            throw new java.lang.NullPointerException("Null time");
        }
        this.zzc = localTime;
        this.zzd = z;
    }

    public final boolean equals(java.lang.Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof com.google.android.libraries.places.api.model.TimeOfWeek)) {
            return false;
        }
        com.google.android.libraries.places.api.model.TimeOfWeek timeOfWeek = (com.google.android.libraries.places.api.model.TimeOfWeek) obj;
        com.google.android.libraries.places.api.model.LocalDate localDate = this.zza;
        if (localDate == null) {
            if (timeOfWeek.getDate() != null) {
                return false;
            }
        } else if (!localDate.equals(timeOfWeek.getDate())) {
            return false;
        }
        return this.zzb.equals(timeOfWeek.getDay()) && this.zzc.equals(timeOfWeek.getTime()) && this.zzd == timeOfWeek.isTruncated();
    }

    public final java.lang.String toString() {
        com.google.android.libraries.places.api.model.LocalTime localTime = this.zzc;
        com.google.android.libraries.places.api.model.DayOfWeek dayOfWeek = this.zzb;
        java.lang.String valueOf = java.lang.String.valueOf(this.zza);
        java.lang.String obj = dayOfWeek.toString();
        java.lang.String obj2 = localTime.toString();
        int length = java.lang.String.valueOf(valueOf).length();
        int length2 = obj.length();
        int length3 = obj2.length();
        boolean z = this.zzd;
        java.lang.StringBuilder sb = new java.lang.StringBuilder(length + 22 + length2 + 7 + length3 + 12 + java.lang.String.valueOf(z).length() + 1);
        sb.append("TimeOfWeek{date=");
        sb.append(valueOf);
        sb.append(", day=");
        sb.append(obj);
        sb.append(", time=");
        sb.append(obj2);
        sb.append(", truncated=");
        sb.append(z);
        sb.append("}");
        return sb.toString();
    }

    public final int hashCode() {
        com.google.android.libraries.places.api.model.LocalDate localDate = this.zza;
        int hashCode = localDate == null ? 0 : localDate.hashCode();
        int hashCode2 = this.zzb.hashCode();
        return ((((((hashCode ^ 1000003) * 1000003) ^ hashCode2) * 1000003) ^ this.zzc.hashCode()) * 1000003) ^ (true != this.zzd ? 1237 : 1231);
    }

    @Override // com.google.android.libraries.places.api.model.TimeOfWeek
    public final boolean isTruncated() {
        return this.zzd;
    }

    @Override // com.google.android.libraries.places.api.model.TimeOfWeek
    public final com.google.android.libraries.places.api.model.LocalTime getTime() {
        return this.zzc;
    }

    @Override // com.google.android.libraries.places.api.model.TimeOfWeek
    public final com.google.android.libraries.places.api.model.DayOfWeek getDay() {
        return this.zzb;
    }

    @Override // com.google.android.libraries.places.api.model.TimeOfWeek
    public final com.google.android.libraries.places.api.model.LocalDate getDate() {
        return this.zza;
    }
}
