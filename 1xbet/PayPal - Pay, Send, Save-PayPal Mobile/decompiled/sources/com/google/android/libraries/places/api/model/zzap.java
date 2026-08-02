package com.google.android.libraries.places.api.model;

/* loaded from: classes8.dex */
abstract class zzap extends com.google.android.libraries.places.api.model.LocalTime {
    private final int zza;
    private final int zzb;

    public final boolean equals(java.lang.Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof com.google.android.libraries.places.api.model.LocalTime)) {
            return false;
        }
        com.google.android.libraries.places.api.model.LocalTime localTime = (com.google.android.libraries.places.api.model.LocalTime) obj;
        return this.zza == localTime.getHours() && this.zzb == localTime.getMinutes();
    }

    public final java.lang.String toString() {
        int i = this.zza;
        int length = java.lang.String.valueOf(i).length();
        int i2 = this.zzb;
        java.lang.StringBuilder sb = new java.lang.StringBuilder(length + 26 + java.lang.String.valueOf(i2).length() + 1);
        sb.append("LocalTime{hours=");
        sb.append(i);
        sb.append(", minutes=");
        sb.append(i2);
        sb.append("}");
        return sb.toString();
    }

    public final int hashCode() {
        return ((this.zza ^ 1000003) * 1000003) ^ this.zzb;
    }

    @Override // com.google.android.libraries.places.api.model.LocalTime
    public final int getMinutes() {
        return this.zzb;
    }

    @Override // com.google.android.libraries.places.api.model.LocalTime
    public final int getHours() {
        return this.zza;
    }

    zzap(int i, int i2) {
        this.zza = i;
        this.zzb = i2;
    }
}
