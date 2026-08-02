package com.google.android.gms.internal.mlkit_vision_barcode;

/* loaded from: classes8.dex */
public final class zzws implements com.google.android.gms.internal.mlkit_vision_barcode.zzwe {
    private final com.google.android.gms.internal.mlkit_vision_barcode.zzrd zza;
    private com.google.android.gms.internal.mlkit_vision_barcode.zzvb zzb = new com.google.android.gms.internal.mlkit_vision_barcode.zzvb();
    private final int zzc;

    private zzws(com.google.android.gms.internal.mlkit_vision_barcode.zzrd zzrdVar, int i) {
        this.zza = zzrdVar;
        com.google.android.gms.internal.mlkit_vision_barcode.zzxb.zza();
        this.zzc = i;
    }

    public static com.google.android.gms.internal.mlkit_vision_barcode.zzwe zzf(com.google.android.gms.internal.mlkit_vision_barcode.zzrd zzrdVar) {
        return new com.google.android.gms.internal.mlkit_vision_barcode.zzws(zzrdVar, 0);
    }

    public static com.google.android.gms.internal.mlkit_vision_barcode.zzwe zzg(com.google.android.gms.internal.mlkit_vision_barcode.zzrd zzrdVar, int i) {
        return new com.google.android.gms.internal.mlkit_vision_barcode.zzws(zzrdVar, 1);
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode.zzwe
    public final com.google.android.gms.internal.mlkit_vision_barcode.zzwe zzb(com.google.android.gms.internal.mlkit_vision_barcode.zzrc zzrcVar) {
        this.zza.zzf(zzrcVar);
        return this;
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode.zzwe
    public final java.lang.String zzd() {
        com.google.android.gms.internal.mlkit_vision_barcode.zzvd zzg = this.zza.zzk().zzg();
        return (zzg == null || com.google.android.gms.internal.mlkit_vision_barcode.zzba.zzc(zzg.zzk())) ? "NA" : (java.lang.String) com.google.android.gms.common.internal.Preconditions.checkNotNull(zzg.zzk());
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode.zzwe
    public final byte[] zze(int i, boolean z) {
        this.zzb.zzf(java.lang.Boolean.valueOf(1 == (i ^ 1)));
        this.zzb.zze(false);
        this.zza.zzj(this.zzb.zzm());
        try {
            com.google.android.gms.internal.mlkit_vision_barcode.zzxb.zza();
            if (i == 0) {
                return new com.google.firebase.encoders.json.JsonDataEncoderBuilder().configureWith(com.google.android.gms.internal.mlkit_vision_barcode.zzox.zza).ignoreNullValues(true).build().encode(this.zza.zzk()).getBytes("utf-8");
            }
            com.google.android.gms.internal.mlkit_vision_barcode.zzrf zzk = this.zza.zzk();
            com.google.android.gms.internal.mlkit_vision_barcode.zzfi zzfiVar = new com.google.android.gms.internal.mlkit_vision_barcode.zzfi();
            com.google.android.gms.internal.mlkit_vision_barcode.zzox.zza.configure(zzfiVar);
            return zzfiVar.zza().zza(zzk);
        } catch (java.io.UnsupportedEncodingException e) {
            throw new java.lang.UnsupportedOperationException("Failed to covert logging to UTF-8 byte array", e);
        }
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode.zzwe
    public final com.google.android.gms.internal.mlkit_vision_barcode.zzwe zzc(com.google.android.gms.internal.mlkit_vision_barcode.zzvb zzvbVar) {
        this.zzb = zzvbVar;
        return this;
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode.zzwe
    public final int zza() {
        return this.zzc;
    }
}
