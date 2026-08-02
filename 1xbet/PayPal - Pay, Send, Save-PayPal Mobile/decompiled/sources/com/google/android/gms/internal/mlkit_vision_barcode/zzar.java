package com.google.android.gms.internal.mlkit_vision_barcode;

/* loaded from: classes8.dex */
public final class zzar {
    private static final com.google.android.gms.internal.mlkit_vision_barcode.zzbb zza;

    static {
        com.google.android.gms.internal.mlkit_vision_barcode.zzbb zzaqVar;
        try {
            android.os.SystemClock.elapsedRealtimeNanos();
            zzaqVar = new com.google.android.gms.internal.mlkit_vision_barcode.zzap();
        } catch (java.lang.Throwable unused) {
            android.os.SystemClock.elapsedRealtime();
            zzaqVar = new com.google.android.gms.internal.mlkit_vision_barcode.zzaq();
        }
        zza = zzaqVar;
    }

    public static com.google.android.gms.internal.mlkit_vision_barcode.zzbb zza() {
        return zza;
    }
}
