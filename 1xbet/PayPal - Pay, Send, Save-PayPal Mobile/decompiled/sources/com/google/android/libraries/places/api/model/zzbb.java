package com.google.android.libraries.places.api.model;

/* loaded from: classes8.dex */
abstract class zzbb extends com.google.android.libraries.places.api.model.Period {
    private final com.google.android.libraries.places.api.model.TimeOfWeek zza;
    private final com.google.android.libraries.places.api.model.TimeOfWeek zzb;

    public final boolean equals(java.lang.Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof com.google.android.libraries.places.api.model.Period)) {
            return false;
        }
        com.google.android.libraries.places.api.model.Period period = (com.google.android.libraries.places.api.model.Period) obj;
        com.google.android.libraries.places.api.model.TimeOfWeek timeOfWeek = this.zza;
        if (timeOfWeek == null) {
            if (period.getOpen() != null) {
                return false;
            }
        } else if (!timeOfWeek.equals(period.getOpen())) {
            return false;
        }
        com.google.android.libraries.places.api.model.TimeOfWeek timeOfWeek2 = this.zzb;
        if (timeOfWeek2 == null) {
            if (period.getClose() != null) {
                return false;
            }
        } else if (!timeOfWeek2.equals(period.getClose())) {
            return false;
        }
        return true;
    }

    public final java.lang.String toString() {
        com.google.android.libraries.places.api.model.TimeOfWeek timeOfWeek = this.zzb;
        java.lang.String valueOf = java.lang.String.valueOf(this.zza);
        java.lang.String valueOf2 = java.lang.String.valueOf(timeOfWeek);
        java.lang.StringBuilder sb = new java.lang.StringBuilder(java.lang.String.valueOf(valueOf).length() + 20 + java.lang.String.valueOf(valueOf2).length() + 1);
        sb.append("Period{open=");
        sb.append(valueOf);
        sb.append(", close=");
        sb.append(valueOf2);
        sb.append("}");
        return sb.toString();
    }

    public final int hashCode() {
        com.google.android.libraries.places.api.model.TimeOfWeek timeOfWeek = this.zza;
        int hashCode = timeOfWeek == null ? 0 : timeOfWeek.hashCode();
        com.google.android.libraries.places.api.model.TimeOfWeek timeOfWeek2 = this.zzb;
        return ((hashCode ^ 1000003) * 1000003) ^ (timeOfWeek2 != null ? timeOfWeek2.hashCode() : 0);
    }

    @Override // com.google.android.libraries.places.api.model.Period
    public final com.google.android.libraries.places.api.model.TimeOfWeek getOpen() {
        return this.zza;
    }

    @Override // com.google.android.libraries.places.api.model.Period
    public final com.google.android.libraries.places.api.model.TimeOfWeek getClose() {
        return this.zzb;
    }

    zzbb(com.google.android.libraries.places.api.model.TimeOfWeek timeOfWeek, com.google.android.libraries.places.api.model.TimeOfWeek timeOfWeek2) {
        this.zza = timeOfWeek;
        this.zzb = timeOfWeek2;
    }
}
