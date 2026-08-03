package com.google.android.gms.internal.games_v2;

/* compiled from: com.google.android.gms:play-services-games-v2@@20.0.0 */
/* loaded from: classes4.dex */
public final class zzbe {
    private static final java.util.concurrent.atomic.AtomicReference zza = new java.util.concurrent.atomic.AtomicReference();

    public static com.google.android.gms.internal.games_v2.zzbc zza(android.app.Application application) {
        java.util.concurrent.atomic.AtomicReference atomicReference = zza;
        com.google.android.gms.internal.games_v2.zzbc zzbcVar = (com.google.android.gms.internal.games_v2.zzbc) atomicReference.get();
        if (zzbcVar != null) {
            return zzbcVar;
        }
        com.google.android.gms.internal.games_v2.zzo zza2 = com.google.android.gms.internal.games_v2.zzq.zza();
        zza2.zza(9);
        zza2.zzb(application.getPackageName());
        com.google.android.gms.internal.games_v2.zzq zzc = zza2.zzc();
        com.google.android.gms.games.internal.zzg zzb = com.google.android.gms.games.internal.zzg.zzb(application);
        com.google.android.gms.internal.games_v2.zzbs zzbsVar = new com.google.android.gms.internal.games_v2.zzbs(application, zzb, com.google.android.gms.games.internal.v2.resolution.zzb.zza(), new com.google.android.gms.internal.games_v2.zzbw(application, zzb, new com.google.android.gms.internal.games_v2.zzbd(application, zzc)));
        while (!androidx.compose.animation.core.ComplexDouble$$ExternalSyntheticBackport0.m(atomicReference, null, zzbsVar) && atomicReference.get() == null) {
        }
        return (com.google.android.gms.internal.games_v2.zzbc) com.google.android.gms.common.internal.Preconditions.checkNotNull((com.google.android.gms.internal.games_v2.zzbc) zza.get());
    }
}
