package com.google.android.libraries.places.internal;

/* loaded from: classes4.dex */
public final class zzfl {
    private static final long zza = java.util.concurrent.TimeUnit.SECONDS.toMillis(30);
    private final com.google.android.gms.location.FusedLocationProviderClient zzb;
    private final com.google.android.libraries.places.internal.zzmb zzc;
    private final android.content.Context zzd;

    public final com.google.android.gms.tasks.Task zza(com.google.android.gms.tasks.CancellationToken cancellationToken) {
        com.google.android.gms.location.CurrentLocationRequest.Builder builder = new com.google.android.gms.location.CurrentLocationRequest.Builder();
        long j = zza;
        com.google.android.gms.location.CurrentLocationRequest.Builder durationMillis = builder.setDurationMillis(j);
        if (androidx.core.content.ContextCompat.checkSelfPermission(this.zzd, "android.permission.ACCESS_FINE_LOCATION") == 0) {
            durationMillis.setPriority(100);
        } else {
            durationMillis.setPriority(102);
        }
        return this.zzc.zza(this.zzb.getCurrentLocation(durationMillis.build(), cancellationToken), cancellationToken, j, "Location timeout.").continueWithTask(new com.google.android.libraries.places.internal.zzfk(this));
    }

    zzfl(android.content.Context context, com.google.android.gms.location.FusedLocationProviderClient fusedLocationProviderClient, com.google.android.libraries.places.internal.zzmb zzmbVar) {
        this.zzd = context;
        this.zzb = fusedLocationProviderClient;
        this.zzc = zzmbVar;
    }
}
