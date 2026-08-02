package com.google.android.gms.internal.mlkit_common;

/* loaded from: classes8.dex */
public final class zzsk implements com.google.android.gms.internal.mlkit_common.zzry {
    private final com.google.android.gms.internal.mlkit_common.zzmw zza;
    private com.google.android.gms.internal.mlkit_common.zzqt zzb = new com.google.android.gms.internal.mlkit_common.zzqt();

    private zzsk(com.google.android.gms.internal.mlkit_common.zzmw zzmwVar, int i) {
        this.zza = zzmwVar;
        com.google.android.gms.internal.mlkit_common.zzsv.zza();
    }

    public static com.google.android.gms.internal.mlkit_common.zzry zzf(com.google.android.gms.internal.mlkit_common.zzmw zzmwVar) {
        return new com.google.android.gms.internal.mlkit_common.zzsk(zzmwVar, 0);
    }

    public static com.google.android.gms.internal.mlkit_common.zzry zzg() {
        return new com.google.android.gms.internal.mlkit_common.zzsk(new com.google.android.gms.internal.mlkit_common.zzmw(), 0);
    }

    @Override // com.google.android.gms.internal.mlkit_common.zzry
    public final com.google.android.gms.internal.mlkit_common.zzry zza(com.google.android.gms.internal.mlkit_common.zzmv zzmvVar) {
        this.zza.zzf(zzmvVar);
        return this;
    }

    @Override // com.google.android.gms.internal.mlkit_common.zzry
    public final com.google.android.gms.internal.mlkit_common.zzry zzb(com.google.android.gms.internal.mlkit_common.zznc zzncVar) {
        this.zza.zzi(zzncVar);
        return this;
    }

    @Override // com.google.android.gms.internal.mlkit_common.zzry
    public final java.lang.String zzd() {
        java.lang.String zzk;
        com.google.android.gms.internal.mlkit_common.zzqv zzf = this.zza.zzk().zzf();
        return (zzf == null || (zzk = zzf.zzk()) == null || zzk.isEmpty()) ? "NA" : (java.lang.String) com.google.android.gms.common.internal.Preconditions.checkNotNull(zzf.zzk());
    }

    @Override // com.google.android.gms.internal.mlkit_common.zzry
    public final byte[] zze(int i, boolean z) {
        this.zzb.zzf(java.lang.Boolean.valueOf(1 == (i ^ 1)));
        this.zzb.zze(false);
        this.zza.zzj(this.zzb.zzm());
        try {
            com.google.android.gms.internal.mlkit_common.zzsv.zza();
            if (i == 0) {
                return new com.google.firebase.encoders.json.JsonDataEncoderBuilder().configureWith(com.google.android.gms.internal.mlkit_common.zzkr.zza).ignoreNullValues(true).build().encode(this.zza.zzk()).getBytes("utf-8");
            }
            com.google.android.gms.internal.mlkit_common.zzmy zzk = this.zza.zzk();
            com.google.android.gms.internal.mlkit_common.zzbg zzbgVar = new com.google.android.gms.internal.mlkit_common.zzbg();
            com.google.android.gms.internal.mlkit_common.zzkr.zza.configure(zzbgVar);
            return zzbgVar.zza().zza(zzk);
        } catch (java.io.UnsupportedEncodingException e) {
            throw new java.lang.UnsupportedOperationException("Failed to covert logging to UTF-8 byte array", e);
        }
    }

    @Override // com.google.android.gms.internal.mlkit_common.zzry
    public final com.google.android.gms.internal.mlkit_common.zzry zzc(com.google.android.gms.internal.mlkit_common.zzqt zzqtVar) {
        this.zzb = zzqtVar;
        return this;
    }
}
