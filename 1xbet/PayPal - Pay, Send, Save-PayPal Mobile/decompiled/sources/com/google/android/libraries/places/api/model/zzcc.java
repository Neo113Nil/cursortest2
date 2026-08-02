package com.google.android.libraries.places.api.model;

/* loaded from: classes8.dex */
final class zzcc extends com.google.android.libraries.places.api.model.TimeOfWeek.Builder {
    private com.google.android.libraries.places.api.model.LocalDate zza;
    private com.google.android.libraries.places.api.model.DayOfWeek zzb;
    private com.google.android.libraries.places.api.model.LocalTime zzc;
    private boolean zzd;
    private byte zze;

    @Override // com.google.android.libraries.places.api.model.TimeOfWeek.Builder
    public final com.google.android.libraries.places.api.model.TimeOfWeek build() {
        com.google.android.libraries.places.api.model.DayOfWeek dayOfWeek;
        com.google.android.libraries.places.api.model.LocalTime localTime;
        if (this.zze == 1 && (dayOfWeek = this.zzb) != null && (localTime = this.zzc) != null) {
            return new com.google.android.libraries.places.api.model.zzfq(this.zza, dayOfWeek, localTime, this.zzd);
        }
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        if (this.zzb == null) {
            sb.append(" day");
        }
        if (this.zzc == null) {
            sb.append(" time");
        }
        if (this.zze == 0) {
            sb.append(" truncated");
        }
        throw new java.lang.IllegalStateException("Missing required properties:".concat(sb.toString()));
    }

    @Override // com.google.android.libraries.places.api.model.TimeOfWeek.Builder
    public final com.google.android.libraries.places.api.model.DayOfWeek getDay() {
        com.google.android.libraries.places.api.model.DayOfWeek dayOfWeek = this.zzb;
        if (dayOfWeek != null) {
            return dayOfWeek;
        }
        throw new java.lang.IllegalStateException("Property \"day\" has not been set");
    }

    @Override // com.google.android.libraries.places.api.model.TimeOfWeek.Builder
    public final com.google.android.libraries.places.api.model.LocalTime getTime() {
        com.google.android.libraries.places.api.model.LocalTime localTime = this.zzc;
        if (localTime != null) {
            return localTime;
        }
        throw new java.lang.IllegalStateException("Property \"time\" has not been set");
    }

    @Override // com.google.android.libraries.places.api.model.TimeOfWeek.Builder
    public final boolean isTruncated() {
        if (this.zze != 0) {
            return this.zzd;
        }
        throw new java.lang.IllegalStateException("Property \"truncated\" has not been set");
    }

    @Override // com.google.android.libraries.places.api.model.TimeOfWeek.Builder
    public final com.google.android.libraries.places.api.model.TimeOfWeek.Builder setDay(com.google.android.libraries.places.api.model.DayOfWeek dayOfWeek) {
        if (dayOfWeek == null) {
            throw new java.lang.NullPointerException("Null day");
        }
        this.zzb = dayOfWeek;
        return this;
    }

    @Override // com.google.android.libraries.places.api.model.TimeOfWeek.Builder
    public final com.google.android.libraries.places.api.model.TimeOfWeek.Builder setTime(com.google.android.libraries.places.api.model.LocalTime localTime) {
        if (localTime == null) {
            throw new java.lang.NullPointerException("Null time");
        }
        this.zzc = localTime;
        return this;
    }

    @Override // com.google.android.libraries.places.api.model.TimeOfWeek.Builder
    public final com.google.android.libraries.places.api.model.TimeOfWeek.Builder setTruncated(boolean z) {
        this.zzd = z;
        this.zze = (byte) 1;
        return this;
    }

    @Override // com.google.android.libraries.places.api.model.TimeOfWeek.Builder
    public final com.google.android.libraries.places.api.model.TimeOfWeek.Builder setDate(com.google.android.libraries.places.api.model.LocalDate localDate) {
        this.zza = localDate;
        return this;
    }

    @Override // com.google.android.libraries.places.api.model.TimeOfWeek.Builder
    public final com.google.android.libraries.places.api.model.LocalDate getDate() {
        return this.zza;
    }

    zzcc() {
    }
}
