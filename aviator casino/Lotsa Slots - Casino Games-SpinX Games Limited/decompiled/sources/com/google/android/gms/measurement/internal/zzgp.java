package com.google.android.gms.measurement.internal;

/* compiled from: com.google.android.gms:play-services-measurement-impl@@22.5.0 */
/* loaded from: classes4.dex */
public final class zzgp {
    private static com.google.android.gms.measurement.internal.zzgp zza;
    private final com.google.android.gms.measurement.internal.zzib zzb;
    private final com.google.android.gms.common.internal.TelemetryLoggingClient zzc;
    private final java.util.concurrent.atomic.AtomicLong zzd = new java.util.concurrent.atomic.AtomicLong(-1);

    private zzgp(android.content.Context context, com.google.android.gms.measurement.internal.zzib zzibVar) {
        this.zzc = com.google.android.gms.common.internal.TelemetryLogging.getClient(context, com.google.android.gms.common.internal.TelemetryLoggingOptions.builder().setApi("measurement:api").build());
        this.zzb = zzibVar;
    }

    static com.google.android.gms.measurement.internal.zzgp zza(com.google.android.gms.measurement.internal.zzib zzibVar) {
        if (zza == null) {
            zza = new com.google.android.gms.measurement.internal.zzgp(zzibVar.zzaY(), zzibVar);
        }
        return zza;
    }

    public final synchronized void zzb(int i, int i2, long j, long j2, int i3) {
        final long elapsedRealtime = this.zzb.zzaZ().elapsedRealtime();
        java.util.concurrent.atomic.AtomicLong atomicLong = this.zzd;
        if (atomicLong.get() != -1 && elapsedRealtime - atomicLong.get() <= 1800000) {
            return;
        }
        this.zzc.log(new com.google.android.gms.common.internal.TelemetryData(0, java.util.Arrays.asList(new com.google.android.gms.common.internal.MethodInvocation(36301, i2, 0, j, j2, null, null, 0, i3)))).addOnFailureListener(new com.google.android.gms.tasks.OnFailureListener() { // from class: com.google.android.gms.measurement.internal.zzgo
            @Override // com.google.android.gms.tasks.OnFailureListener
            public final /* synthetic */ void onFailure(java.lang.Exception exc) {
                com.google.android.gms.measurement.internal.zzgp.this.zzc(elapsedRealtime, exc);
            }
        });
    }

    final /* synthetic */ void zzc(long j, java.lang.Exception exc) {
        this.zzd.set(j);
    }
}
