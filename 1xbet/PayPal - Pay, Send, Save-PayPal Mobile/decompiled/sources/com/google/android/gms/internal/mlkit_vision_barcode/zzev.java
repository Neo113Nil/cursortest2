package com.google.android.gms.internal.mlkit_vision_barcode;

/* loaded from: classes8.dex */
final class zzev extends com.google.android.gms.internal.mlkit_vision_barcode.zzer {
    final /* synthetic */ com.google.android.gms.internal.mlkit_vision_barcode.zzew zza;
    private final com.google.android.gms.internal.mlkit_vision_barcode.zzxh zzb;

    zzev(com.google.android.gms.internal.mlkit_vision_barcode.zzew zzewVar, com.google.android.gms.internal.mlkit_vision_barcode.zzxh zzxhVar) {
        this.zza = zzewVar;
        this.zzb = zzxhVar;
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode.zzer
    final /* bridge */ /* synthetic */ java.lang.Object zza() throws java.lang.Exception {
        return this.zzb.zza();
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode.zzer
    final java.lang.String zzb() {
        return this.zzb.toString();
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode.zzer
    final void zzc(java.lang.Throwable th) {
        this.zza.zzn(th);
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode.zzer
    final /* synthetic */ void zzd(java.lang.Object obj) {
        this.zza.zzo((com.google.android.gms.internal.mlkit_vision_barcode.zzet) obj);
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode.zzer
    final boolean zzf() {
        return this.zza.isDone();
    }
}
