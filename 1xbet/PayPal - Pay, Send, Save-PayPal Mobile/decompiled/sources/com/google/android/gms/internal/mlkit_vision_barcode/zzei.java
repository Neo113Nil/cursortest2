package com.google.android.gms.internal.mlkit_vision_barcode;

/* loaded from: classes8.dex */
final class zzei implements java.lang.Runnable {
    final java.util.concurrent.Future zza;
    final com.google.android.gms.internal.mlkit_vision_barcode.zzeh zzb;

    @Override // java.lang.Runnable
    public final void run() {
        java.lang.Object obj;
        java.lang.Throwable zza = com.google.android.gms.internal.mlkit_vision_barcode.zzey.zza((com.google.android.gms.internal.mlkit_vision_barcode.zzex) this.zza);
        if (zza != null) {
            this.zzb.zza(zza);
            return;
        }
        try {
            java.util.concurrent.Future future = this.zza;
            if (!future.isDone()) {
                throw new java.lang.IllegalStateException(com.google.android.gms.internal.mlkit_vision_barcode.zzba.zzb("Future was expected to be done: %s", future));
            }
            boolean z = false;
            while (true) {
                try {
                    obj = future.get();
                    break;
                } catch (java.lang.InterruptedException unused) {
                    z = true;
                } catch (java.lang.Throwable th) {
                    if (z) {
                        java.lang.Thread.currentThread().interrupt();
                    }
                    throw th;
                }
            }
            if (z) {
                java.lang.Thread.currentThread().interrupt();
            }
            this.zzb.zzb(obj);
        } catch (java.util.concurrent.ExecutionException e) {
            this.zzb.zza(e.getCause());
        } catch (java.lang.Throwable th2) {
            this.zzb.zza(th2);
        }
    }

    public final java.lang.String toString() {
        com.google.android.gms.internal.mlkit_vision_barcode.zzav zza = com.google.android.gms.internal.mlkit_vision_barcode.zzaw.zza(this);
        zza.zza(this.zzb);
        return zza.toString();
    }

    zzei(java.util.concurrent.Future future, com.google.android.gms.internal.mlkit_vision_barcode.zzeh zzehVar) {
        this.zza = future;
        this.zzb = zzehVar;
    }
}
