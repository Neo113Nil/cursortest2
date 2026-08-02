package com.google.android.gms.internal.mlkit_vision_barcode;

/* loaded from: classes8.dex */
final class zzes {
    private final com.google.android.gms.internal.mlkit_vision_barcode.zzbc zza = new com.google.android.gms.internal.mlkit_vision_barcode.zzbc();
    private final java.lang.String zzb;
    private volatile java.util.logging.Logger zzc;

    zzes(java.lang.Class cls) {
        this.zzb = cls.getName();
    }

    final java.util.logging.Logger zza() {
        java.util.logging.Logger logger = this.zzc;
        if (logger != null) {
            return logger;
        }
        synchronized (this.zza) {
            java.util.logging.Logger logger2 = this.zzc;
            if (logger2 != null) {
                return logger2;
            }
            java.util.logging.Logger logger3 = java.util.logging.Logger.getLogger(this.zzb);
            this.zzc = logger3;
            return logger3;
        }
    }
}
