package com.google.android.libraries.places.api.model;

/* loaded from: classes8.dex */
abstract class zzan extends com.google.android.libraries.places.api.model.LocalDate {
    private final int zza;
    private final int zzb;
    private final int zzc;

    public final boolean equals(java.lang.Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof com.google.android.libraries.places.api.model.LocalDate)) {
            return false;
        }
        com.google.android.libraries.places.api.model.LocalDate localDate = (com.google.android.libraries.places.api.model.LocalDate) obj;
        return this.zza == localDate.getYear() && this.zzb == localDate.getMonth() && this.zzc == localDate.getDay();
    }

    public final int hashCode() {
        return ((((this.zza ^ 1000003) * 1000003) ^ this.zzb) * 1000003) ^ this.zzc;
    }

    @Override // com.google.android.libraries.places.api.model.LocalDate
    public final int getYear() {
        return this.zza;
    }

    @Override // com.google.android.libraries.places.api.model.LocalDate
    public final int getMonth() {
        return this.zzb;
    }

    @Override // com.google.android.libraries.places.api.model.LocalDate
    public final int getDay() {
        return this.zzc;
    }

    zzan(int i, int i2, int i3) {
        this.zza = i;
        this.zzb = i2;
        this.zzc = i3;
    }
}
