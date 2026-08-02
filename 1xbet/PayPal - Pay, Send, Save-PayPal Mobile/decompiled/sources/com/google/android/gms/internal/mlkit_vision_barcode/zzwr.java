package com.google.android.gms.internal.mlkit_vision_barcode;

/* loaded from: classes8.dex */
public final class zzwr {
    private final com.google.android.gms.common.internal.TelemetryLoggingClient zza;
    private final java.util.concurrent.atomic.AtomicLong zzb = new java.util.concurrent.atomic.AtomicLong(-1);

    zzwr(android.content.Context context, java.lang.String str) {
        this.zza = com.google.android.gms.common.internal.TelemetryLogging.getClient(context, com.google.android.gms.common.internal.TelemetryLoggingOptions.builder().setApi("mlkit:vision").build());
    }

    public static com.google.android.gms.internal.mlkit_vision_barcode.zzwr zza(android.content.Context context) {
        return new com.google.android.gms.internal.mlkit_vision_barcode.zzwr(context, "mlkit:vision");
    }

    final /* synthetic */ void zzb(long j, java.lang.Exception exc) {
        this.zzb.set(j);
    }

    public final void zzc(int i, int i2, long j, long j2) {
        synchronized (this) {
            java.util.concurrent.atomic.AtomicLong atomicLong = this.zzb;
            final long elapsedRealtime = android.os.SystemClock.elapsedRealtime();
            if (atomicLong.get() != -1 && elapsedRealtime - this.zzb.get() <= java.util.concurrent.TimeUnit.MINUTES.toMillis(30L)) {
                return;
            }
            this.zza.log(new com.google.android.gms.common.internal.TelemetryData(0, java.util.Arrays.asList(new com.google.android.gms.common.internal.MethodInvocation(i, i2, 0, j, j2, null, null, 0, -1)))).addOnFailureListener(new com.google.android.gms.tasks.OnFailureListener() { // from class: com.google.android.gms.internal.mlkit_vision_barcode.zzwq
                @Override // com.google.android.gms.tasks.OnFailureListener
                public final void onFailure(java.lang.Exception exc) {
                    com.google.android.gms.internal.mlkit_vision_barcode.zzwr.this.zzb(elapsedRealtime, exc);
                }
            });
        }
    }
}
