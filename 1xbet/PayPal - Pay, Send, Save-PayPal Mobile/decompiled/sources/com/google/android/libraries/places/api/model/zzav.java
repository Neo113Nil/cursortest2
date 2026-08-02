package com.google.android.libraries.places.api.model;

/* loaded from: classes8.dex */
abstract class zzav extends com.google.android.libraries.places.api.model.OpeningHours {
    private final com.google.android.libraries.places.api.model.OpeningHours.HoursType zza;
    private final java.util.List zzb;
    private final java.util.List zzc;
    private final java.util.List zzd;
    private final java.lang.Boolean zze;
    private final java.time.Instant zzf;
    private final java.time.Instant zzg;

    zzav(com.google.android.libraries.places.api.model.OpeningHours.HoursType hoursType, java.util.List list, java.util.List list2, java.util.List list3, java.lang.Boolean bool, java.time.Instant instant, java.time.Instant instant2) {
        this.zza = hoursType;
        if (list == null) {
            throw new java.lang.NullPointerException("Null periods");
        }
        this.zzb = list;
        if (list2 == null) {
            throw new java.lang.NullPointerException("Null specialDays");
        }
        this.zzc = list2;
        if (list3 == null) {
            throw new java.lang.NullPointerException("Null weekdayText");
        }
        this.zzd = list3;
        this.zze = bool;
        this.zzf = instant;
        this.zzg = instant2;
    }

    public final boolean equals(java.lang.Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof com.google.android.libraries.places.api.model.OpeningHours)) {
            return false;
        }
        com.google.android.libraries.places.api.model.OpeningHours openingHours = (com.google.android.libraries.places.api.model.OpeningHours) obj;
        com.google.android.libraries.places.api.model.OpeningHours.HoursType hoursType = this.zza;
        if (hoursType == null) {
            if (openingHours.getHoursType() != null) {
                return false;
            }
        } else if (!hoursType.equals(openingHours.getHoursType())) {
            return false;
        }
        if (!this.zzb.equals(openingHours.getPeriods()) || !this.zzc.equals(openingHours.getSpecialDays()) || !this.zzd.equals(openingHours.getWeekdayText())) {
            return false;
        }
        java.lang.Boolean bool = this.zze;
        if (bool == null) {
            if (openingHours.zza() != null) {
                return false;
            }
        } else if (!bool.equals(openingHours.zza())) {
            return false;
        }
        java.time.Instant instant = this.zzf;
        if (instant == null) {
            if (openingHours.zzb() != null) {
                return false;
            }
        } else if (!instant.equals(openingHours.zzb())) {
            return false;
        }
        java.time.Instant instant2 = this.zzg;
        if (instant2 == null) {
            if (openingHours.zzc() != null) {
                return false;
            }
        } else if (!instant2.equals(openingHours.zzc())) {
            return false;
        }
        return true;
    }

    public final java.lang.String toString() {
        java.time.Instant instant = this.zzg;
        java.time.Instant instant2 = this.zzf;
        java.util.List list = this.zzd;
        java.util.List list2 = this.zzc;
        java.util.List list3 = this.zzb;
        java.lang.String valueOf = java.lang.String.valueOf(this.zza);
        java.lang.String obj = list3.toString();
        java.lang.String obj2 = list2.toString();
        java.lang.String obj3 = list.toString();
        java.lang.String valueOf2 = java.lang.String.valueOf(instant2);
        java.lang.String valueOf3 = java.lang.String.valueOf(instant);
        int length = java.lang.String.valueOf(valueOf).length();
        int length2 = obj.length();
        int length3 = obj2.length();
        int length4 = obj3.length();
        java.lang.Boolean bool = this.zze;
        java.lang.StringBuilder sb = new java.lang.StringBuilder(length + 33 + length2 + 14 + length3 + 14 + length4 + 10 + java.lang.String.valueOf(bool).length() + 11 + java.lang.String.valueOf(valueOf2).length() + 12 + java.lang.String.valueOf(valueOf3).length() + 1);
        sb.append("OpeningHours{hoursType=");
        sb.append(valueOf);
        sb.append(", periods=");
        sb.append(obj);
        sb.append(", specialDays=");
        sb.append(obj2);
        sb.append(", weekdayText=");
        sb.append(obj3);
        sb.append(", openNow=");
        sb.append(bool);
        sb.append(", nextOpen=");
        sb.append(valueOf2);
        sb.append(", nextClose=");
        sb.append(valueOf3);
        sb.append("}");
        return sb.toString();
    }

    public final int hashCode() {
        com.google.android.libraries.places.api.model.OpeningHours.HoursType hoursType = this.zza;
        int hashCode = hoursType == null ? 0 : hoursType.hashCode();
        int hashCode2 = this.zzb.hashCode();
        int hashCode3 = this.zzc.hashCode();
        int hashCode4 = this.zzd.hashCode();
        java.lang.Boolean bool = this.zze;
        int hashCode5 = bool == null ? 0 : bool.hashCode();
        java.time.Instant instant = this.zzf;
        int hashCode6 = instant == null ? 0 : instant.hashCode();
        java.time.Instant instant2 = this.zzg;
        return ((((((((((((hashCode ^ 1000003) * 1000003) ^ hashCode2) * 1000003) ^ hashCode3) * 1000003) ^ hashCode4) * 1000003) ^ hashCode5) * 1000003) ^ hashCode6) * 1000003) ^ (instant2 != null ? instant2.hashCode() : 0);
    }

    @Override // com.google.android.libraries.places.api.model.OpeningHours
    public final java.time.Instant zzc() {
        return this.zzg;
    }

    @Override // com.google.android.libraries.places.api.model.OpeningHours
    public final java.time.Instant zzb() {
        return this.zzf;
    }

    @Override // com.google.android.libraries.places.api.model.OpeningHours
    public final java.lang.Boolean zza() {
        return this.zze;
    }

    @Override // com.google.android.libraries.places.api.model.OpeningHours
    public java.util.List<java.lang.String> getWeekdayText() {
        return this.zzd;
    }

    @Override // com.google.android.libraries.places.api.model.OpeningHours
    public java.util.List<com.google.android.libraries.places.api.model.SpecialDay> getSpecialDays() {
        return this.zzc;
    }

    @Override // com.google.android.libraries.places.api.model.OpeningHours
    public java.util.List<com.google.android.libraries.places.api.model.Period> getPeriods() {
        return this.zzb;
    }

    @Override // com.google.android.libraries.places.api.model.OpeningHours
    public com.google.android.libraries.places.api.model.OpeningHours.HoursType getHoursType() {
        return this.zza;
    }
}
