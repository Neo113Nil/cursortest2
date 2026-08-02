package com.google.android.libraries.places.api.model;

/* loaded from: classes8.dex */
final class zzam extends com.google.android.libraries.places.api.model.zzfw {
    private int zza;
    private int zzb;
    private int zzc;
    private byte zzd;

    @Override // com.google.android.libraries.places.api.model.zzfw
    final com.google.android.libraries.places.api.model.LocalDate zzd() {
        if (this.zzd == 7) {
            return new com.google.android.libraries.places.api.model.zzdy(this.zza, this.zzb, this.zzc);
        }
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        if ((this.zzd & 1) == 0) {
            sb.append(" year");
        }
        if ((this.zzd & 2) == 0) {
            sb.append(" month");
        }
        if ((this.zzd & 4) == 0) {
            sb.append(" day");
        }
        throw new java.lang.IllegalStateException("Missing required properties:".concat(sb.toString()));
    }

    @Override // com.google.android.libraries.places.api.model.zzfw
    final com.google.android.libraries.places.api.model.zzfw zzc(int i) {
        this.zzc = i;
        this.zzd = (byte) (this.zzd | 4);
        return this;
    }

    @Override // com.google.android.libraries.places.api.model.zzfw
    final com.google.android.libraries.places.api.model.zzfw zzb(int i) {
        this.zzb = i;
        this.zzd = (byte) (this.zzd | 2);
        return this;
    }

    final com.google.android.libraries.places.api.model.zzfw zza(int i) {
        this.zza = i;
        this.zzd = (byte) (this.zzd | 1);
        return this;
    }

    zzam() {
    }
}
