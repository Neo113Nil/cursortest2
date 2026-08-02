package com.google.android.gms.internal.mlkit_vision_barcode;

/* loaded from: classes8.dex */
final class zzew extends com.google.android.gms.internal.mlkit_vision_barcode.zzef implements java.util.concurrent.RunnableFuture {

    @javax.annotation.CheckForNull
    private volatile com.google.android.gms.internal.mlkit_vision_barcode.zzer zzc;

    zzew(com.google.android.gms.internal.mlkit_vision_barcode.zzxh zzxhVar) {
        this.zzc = new com.google.android.gms.internal.mlkit_vision_barcode.zzev(this, zzxhVar);
    }

    @Override // java.util.concurrent.RunnableFuture, java.lang.Runnable
    public final void run() {
        com.google.android.gms.internal.mlkit_vision_barcode.zzer zzerVar = this.zzc;
        if (zzerVar != null) {
            zzerVar.run();
        }
        this.zzc = null;
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode.zzdz
    @javax.annotation.CheckForNull
    protected final java.lang.String zzf() {
        com.google.android.gms.internal.mlkit_vision_barcode.zzer zzerVar = this.zzc;
        if (zzerVar == null) {
            return super.zzf();
        }
        return "task=[" + zzerVar.toString() + "]";
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode.zzdz
    protected final void zzm() {
        com.google.android.gms.internal.mlkit_vision_barcode.zzer zzerVar;
        if (zzp() && (zzerVar = this.zzc) != null) {
            zzerVar.zze();
        }
        this.zzc = null;
    }
}
