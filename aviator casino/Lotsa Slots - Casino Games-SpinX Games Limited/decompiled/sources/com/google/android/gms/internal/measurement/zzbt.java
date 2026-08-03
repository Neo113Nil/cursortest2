package com.google.android.gms.internal.measurement;

/* compiled from: com.google.android.gms:play-services-measurement-impl@@22.5.0 */
/* loaded from: classes4.dex */
final class zzbt extends com.google.android.gms.internal.measurement.zzbz {
    private java.lang.String zza;
    private byte zzb;
    private int zzc;
    private int zzd;

    zzbt() {
    }

    public final com.google.android.gms.internal.measurement.zzbz zza(java.lang.String str) {
        this.zza = "";
        return this;
    }

    @Override // com.google.android.gms.internal.measurement.zzbz
    public final com.google.android.gms.internal.measurement.zzbz zzb(boolean z) {
        this.zzb = (byte) 1;
        return this;
    }

    @Override // com.google.android.gms.internal.measurement.zzbz
    public final com.google.android.gms.internal.measurement.zzca zzc() {
        if (this.zzb == 1 && this.zza != null && this.zzc != 0 && this.zzd != 0) {
            return new com.google.android.gms.internal.measurement.zzbu(this.zza, false, this.zzc, null, null, this.zzd, null);
        }
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        if (this.zza == null) {
            sb.append(" fileOwner");
        }
        if (this.zzb == 0) {
            sb.append(" hasDifferentDmaOwner");
        }
        if (this.zzc == 0) {
            sb.append(" fileChecks");
        }
        if (this.zzd == 0) {
            sb.append(" filePurpose");
        }
        throw new java.lang.IllegalStateException("Missing required properties:".concat(sb.toString()));
    }

    @Override // com.google.android.gms.internal.measurement.zzbz
    final com.google.android.gms.internal.measurement.zzbz zzd(int i) {
        this.zzc = i;
        return this;
    }

    @Override // com.google.android.gms.internal.measurement.zzbz
    public final com.google.android.gms.internal.measurement.zzbz zze(int i) {
        this.zzd = 1;
        return this;
    }
}
