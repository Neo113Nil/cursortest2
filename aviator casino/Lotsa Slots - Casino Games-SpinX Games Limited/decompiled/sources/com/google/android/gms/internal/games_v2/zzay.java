package com.google.android.gms.internal.games_v2;

/* compiled from: com.google.android.gms:play-services-games-v2@@20.0.0 */
/* loaded from: classes4.dex */
public final class zzay {
    private final com.google.android.gms.internal.games_v2.zzbc zza;

    private zzay(com.google.android.gms.internal.games_v2.zzbc zzbcVar) {
        this.zza = zzbcVar;
    }

    public static com.google.android.gms.internal.games_v2.zzay zza(android.app.Application application) {
        return new com.google.android.gms.internal.games_v2.zzay(com.google.android.gms.internal.games_v2.zzbe.zza(application));
    }

    public final com.google.android.gms.tasks.Task zzb(com.google.android.gms.internal.games_v2.zzax zzaxVar) {
        java.util.Objects.requireNonNull(zzaxVar);
        return this.zza.zzd(new com.google.android.gms.internal.games_v2.zzaw(zzaxVar));
    }
}
