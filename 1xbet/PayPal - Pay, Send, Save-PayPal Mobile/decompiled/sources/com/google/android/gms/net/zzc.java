package com.google.android.gms.net;

/* loaded from: classes4.dex */
final class zzc {
    private static volatile com.google.android.gms.net.zzc zzb;
    private static final java.lang.Object zzd = new java.lang.Object();
    final java.util.concurrent.atomic.AtomicLong zza = new java.util.concurrent.atomic.AtomicLong(-1);
    private final com.google.android.gms.common.internal.TelemetryLoggingClient zzc;

    private zzc(android.content.Context context) {
        this.zzc = (com.google.android.gms.common.internal.TelemetryLoggingClient) java.util.Objects.requireNonNull(com.google.android.gms.common.internal.TelemetryLogging.getClient(context, com.google.android.gms.common.internal.TelemetryLoggingOptions.builder().setApi("module:cronet_dynamite").build()));
    }

    public static com.google.android.gms.net.zzc zza(android.content.Context context) {
        if (zzb == null) {
            synchronized (zzd) {
                if (zzb == null) {
                    zzb = new com.google.android.gms.net.zzc(context);
                }
            }
        }
        return zzb;
    }

    final void zzb(int i, int i2, long j, long j2, int i3) {
        synchronized (this) {
            java.util.concurrent.atomic.AtomicLong atomicLong = this.zza;
            if (atomicLong.get() != -1 && android.os.SystemClock.uptimeMillis() - atomicLong.get() <= 1800000) {
                return;
            }
            this.zzc.log(new com.google.android.gms.common.internal.TelemetryData(0, java.util.Arrays.asList(new com.google.android.gms.common.internal.MethodInvocation(i, i2, -1, j, j2, null, null, 368, i3)))).addOnFailureListener(new com.google.android.gms.tasks.OnFailureListener() { // from class: com.google.android.gms.net.zzb
                @Override // com.google.android.gms.tasks.OnFailureListener
                public final /* synthetic */ void onFailure(java.lang.Exception exc) {
                    com.google.android.gms.common.ConnectionResult connectionResult;
                    if ((exc instanceof com.google.android.gms.common.api.ApiException) && (connectionResult = ((com.google.android.gms.common.api.ApiException) exc).getStatus().getConnectionResult()) != null && connectionResult.getErrorCode() == 24) {
                        com.google.android.gms.net.zzc.this.zza.set(android.os.SystemClock.elapsedRealtime());
                    }
                }
            });
        }
    }
}
