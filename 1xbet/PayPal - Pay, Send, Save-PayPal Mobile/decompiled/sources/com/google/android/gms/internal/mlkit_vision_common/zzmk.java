package com.google.android.gms.internal.mlkit_vision_common;

/* loaded from: classes8.dex */
public final class zzmk implements com.google.android.gms.internal.mlkit_vision_common.zzmb {
    private final com.google.android.gms.internal.mlkit_vision_common.zziw zza;
    private com.google.android.gms.internal.mlkit_vision_common.zzky zzb = new com.google.android.gms.internal.mlkit_vision_common.zzky();

    private zzmk(com.google.android.gms.internal.mlkit_vision_common.zziw zziwVar, int i) {
        this.zza = zziwVar;
        com.google.android.gms.internal.mlkit_vision_common.zzmw.zza();
    }

    public static com.google.android.gms.internal.mlkit_vision_common.zzmb zze(com.google.android.gms.internal.mlkit_vision_common.zziw zziwVar) {
        return new com.google.android.gms.internal.mlkit_vision_common.zzmk(zziwVar, 0);
    }

    @Override // com.google.android.gms.internal.mlkit_vision_common.zzmb
    public final com.google.android.gms.internal.mlkit_vision_common.zzmb zza(com.google.android.gms.internal.mlkit_vision_common.zziv zzivVar) {
        this.zza.zzc(zzivVar);
        return this;
    }

    @Override // com.google.android.gms.internal.mlkit_vision_common.zzmb
    public final java.lang.String zzc() {
        com.google.android.gms.internal.mlkit_vision_common.zzla zzc = this.zza.zzf().zzc();
        return (zzc == null || com.google.android.gms.internal.mlkit_vision_common.zzg.zzb(zzc.zzk())) ? "NA" : (java.lang.String) com.google.android.gms.common.internal.Preconditions.checkNotNull(zzc.zzk());
    }

    @Override // com.google.android.gms.internal.mlkit_vision_common.zzmb
    public final byte[] zzd(int i, boolean z) {
        this.zzb.zzf(java.lang.Boolean.valueOf(1 == (i ^ 1)));
        this.zzb.zze(false);
        this.zza.zze(this.zzb.zzm());
        try {
            com.google.android.gms.internal.mlkit_vision_common.zzmw.zza();
            if (i == 0) {
                return new com.google.firebase.encoders.json.JsonDataEncoderBuilder().configureWith(com.google.android.gms.internal.mlkit_vision_common.zzhe.zza).ignoreNullValues(true).build().encode(this.zza.zzf()).getBytes("utf-8");
            }
            com.google.android.gms.internal.mlkit_vision_common.zziy zzf = this.zza.zzf();
            com.google.android.gms.internal.mlkit_vision_common.zzam zzamVar = new com.google.android.gms.internal.mlkit_vision_common.zzam();
            com.google.android.gms.internal.mlkit_vision_common.zzhe.zza.configure(zzamVar);
            return zzamVar.zza().zza(zzf);
        } catch (java.io.UnsupportedEncodingException e) {
            throw new java.lang.UnsupportedOperationException("Failed to covert logging to UTF-8 byte array", e);
        }
    }

    @Override // com.google.android.gms.internal.mlkit_vision_common.zzmb
    public final com.google.android.gms.internal.mlkit_vision_common.zzmb zzb(com.google.android.gms.internal.mlkit_vision_common.zzky zzkyVar) {
        this.zzb = zzkyVar;
        return this;
    }
}
