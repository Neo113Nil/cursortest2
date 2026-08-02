package com.google.android.libraries.places.api.model;

/* loaded from: classes8.dex */
final class zzau extends com.google.android.libraries.places.api.model.OpeningHours.Builder {
    private com.google.android.libraries.places.api.model.OpeningHours.HoursType zza;
    private java.util.List zzb;
    private java.util.List zzc;
    private java.util.List zzd;
    private java.lang.Boolean zze;
    private java.time.Instant zzf;
    private java.time.Instant zzg;

    @Override // com.google.android.libraries.places.api.model.OpeningHours.Builder
    public final java.util.List<com.google.android.libraries.places.api.model.Period> getPeriods() {
        java.util.List<com.google.android.libraries.places.api.model.Period> list = this.zzb;
        if (list != null) {
            return list;
        }
        throw new java.lang.IllegalStateException("Property \"periods\" has not been set");
    }

    @Override // com.google.android.libraries.places.api.model.OpeningHours.Builder
    public final java.util.List<com.google.android.libraries.places.api.model.SpecialDay> getSpecialDays() {
        java.util.List<com.google.android.libraries.places.api.model.SpecialDay> list = this.zzc;
        if (list != null) {
            return list;
        }
        throw new java.lang.IllegalStateException("Property \"specialDays\" has not been set");
    }

    @Override // com.google.android.libraries.places.api.model.OpeningHours.Builder
    public final java.util.List<java.lang.String> getWeekdayText() {
        java.util.List<java.lang.String> list = this.zzd;
        if (list != null) {
            return list;
        }
        throw new java.lang.IllegalStateException("Property \"weekdayText\" has not been set");
    }

    @Override // com.google.android.libraries.places.api.model.OpeningHours.Builder
    public final com.google.android.libraries.places.api.model.OpeningHours.Builder setPeriods(java.util.List<com.google.android.libraries.places.api.model.Period> list) {
        if (list == null) {
            throw new java.lang.NullPointerException("Null periods");
        }
        this.zzb = list;
        return this;
    }

    @Override // com.google.android.libraries.places.api.model.OpeningHours.Builder
    public final com.google.android.libraries.places.api.model.OpeningHours.Builder setSpecialDays(java.util.List<com.google.android.libraries.places.api.model.SpecialDay> list) {
        if (list == null) {
            throw new java.lang.NullPointerException("Null specialDays");
        }
        this.zzc = list;
        return this;
    }

    @Override // com.google.android.libraries.places.api.model.OpeningHours.Builder
    public final com.google.android.libraries.places.api.model.OpeningHours.Builder setWeekdayText(java.util.List<java.lang.String> list) {
        if (list == null) {
            throw new java.lang.NullPointerException("Null weekdayText");
        }
        this.zzd = list;
        return this;
    }

    @Override // com.google.android.libraries.places.api.model.OpeningHours.Builder
    final com.google.android.libraries.places.api.model.OpeningHours zzd() {
        java.util.List list;
        java.util.List list2;
        java.util.List list3 = this.zzb;
        if (list3 != null && (list = this.zzc) != null && (list2 = this.zzd) != null) {
            return new com.google.android.libraries.places.api.model.zzeg(this.zza, list3, list, list2, this.zze, this.zzf, this.zzg);
        }
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        if (this.zzb == null) {
            sb.append(" periods");
        }
        if (this.zzc == null) {
            sb.append(" specialDays");
        }
        if (this.zzd == null) {
            sb.append(" weekdayText");
        }
        throw new java.lang.IllegalStateException("Missing required properties:".concat(sb.toString()));
    }

    @Override // com.google.android.libraries.places.api.model.OpeningHours.Builder
    public final com.google.android.libraries.places.api.model.OpeningHours.Builder zzc(java.time.Instant instant) {
        this.zzg = instant;
        return this;
    }

    @Override // com.google.android.libraries.places.api.model.OpeningHours.Builder
    public final com.google.android.libraries.places.api.model.OpeningHours.Builder zzb(java.time.Instant instant) {
        this.zzf = instant;
        return this;
    }

    @Override // com.google.android.libraries.places.api.model.OpeningHours.Builder
    public final com.google.android.libraries.places.api.model.OpeningHours.Builder zza(java.lang.Boolean bool) {
        this.zze = bool;
        return this;
    }

    @Override // com.google.android.libraries.places.api.model.OpeningHours.Builder
    public final com.google.android.libraries.places.api.model.OpeningHours.Builder setHoursType(com.google.android.libraries.places.api.model.OpeningHours.HoursType hoursType) {
        this.zza = hoursType;
        return this;
    }

    @Override // com.google.android.libraries.places.api.model.OpeningHours.Builder
    public final com.google.android.libraries.places.api.model.OpeningHours.HoursType getHoursType() {
        return this.zza;
    }

    zzau() {
    }
}
