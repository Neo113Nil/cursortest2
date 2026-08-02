package com.google.android.gms.internal.mlkit_vision_barcode;

/* loaded from: classes8.dex */
final class zzxj implements com.google.android.gms.internal.mlkit_vision_barcode.zzeh {
    final /* synthetic */ com.google.android.gms.internal.mlkit_vision_barcode.zzrc zza;
    final /* synthetic */ float zzb;
    final /* synthetic */ com.google.android.gms.internal.mlkit_vision_barcode.zzxn zzc;
    final /* synthetic */ float zzd;
    final /* synthetic */ com.google.android.gms.internal.mlkit_vision_barcode.zzxk zze;

    @Override // com.google.android.gms.internal.mlkit_vision_barcode.zzeh
    public final void zza(java.lang.Throwable th) {
        com.google.android.gms.common.internal.GmsLogger gmsLogger;
        java.util.concurrent.atomic.AtomicBoolean atomicBoolean;
        gmsLogger = com.google.android.gms.internal.mlkit_vision_barcode.zzxk.zzf;
        gmsLogger.w("AutoZoom", "Unable to set zoom to " + this.zzd, th);
        atomicBoolean = this.zze.zzg;
        atomicBoolean.set(false);
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode.zzeh
    public final /* synthetic */ void zzb(java.lang.Object obj) {
        java.util.concurrent.atomic.AtomicBoolean atomicBoolean;
        java.lang.Float f = (java.lang.Float) obj;
        if (f.floatValue() >= 1.0f) {
            com.google.android.gms.internal.mlkit_vision_barcode.zzxk.zzg(this.zze, f.floatValue());
            this.zze.zzq(this.zza, this.zzb, f.floatValue(), this.zzc);
        }
        atomicBoolean = this.zze.zzg;
        atomicBoolean.set(false);
    }

    zzxj(com.google.android.gms.internal.mlkit_vision_barcode.zzxk zzxkVar, com.google.android.gms.internal.mlkit_vision_barcode.zzrc zzrcVar, float f, com.google.android.gms.internal.mlkit_vision_barcode.zzxn zzxnVar, float f2) {
        this.zza = zzrcVar;
        this.zzb = f;
        this.zzc = zzxnVar;
        this.zzd = f2;
        this.zze = zzxkVar;
    }
}
