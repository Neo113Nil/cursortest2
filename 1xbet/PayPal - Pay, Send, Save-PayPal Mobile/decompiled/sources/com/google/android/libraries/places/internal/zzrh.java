package com.google.android.libraries.places.internal;

/* loaded from: classes4.dex */
public final class zzrh {
    static final com.google.android.libraries.places.internal.zzqs zza;
    public static final /* synthetic */ int zzb = 0;
    private static final java.util.concurrent.atomic.AtomicReference zzc;
    private static final java.util.WeakHashMap zzd;
    private static final com.google.android.libraries.places.internal.zzrg zze;

    static {
        com.google.common.collect.ImmutableSet.of("androidx.fragment.app.FragmentViewLifecycleOwner.handleLifecycleEvent", "com.google.android.libraries.logging.logger.transmitters.clearcut", "com.google.android.libraries.performance.primes.transmitter.clearcut", "com.google.android.libraries.performance.primes.metrics.crash.CrashMetricServiceImpl", "com.google.android.libraries.performance.primes.metrics.crash.applicationexit.ApplicationExitMetricServiceImpl");
        zzc = new java.util.concurrent.atomic.AtomicReference(com.google.common.collect.ImmutableSet.of());
        zza = new com.google.android.libraries.places.internal.zzqs("tiktok_systrace");
        zzd = new java.util.WeakHashMap();
        zze = new com.google.android.libraries.places.internal.zzrg();
        new java.util.ArrayDeque();
        new java.util.ArrayDeque();
    }

    static com.google.common.collect.ImmutableSet zza() {
        return (com.google.common.collect.ImmutableSet) zzc.get();
    }

    static com.google.android.libraries.places.internal.zzrv zzb(boolean z) {
        com.google.android.libraries.places.internal.zzrt zzd2 = zzd();
        com.google.android.libraries.places.internal.zzrv zzrvVar = zzd2.zzb;
        return (zzrvVar == null || zzrvVar == com.google.android.libraries.places.internal.zzrl.zza) ? com.google.android.libraries.places.internal.zzrk.zzh(zzd2) : zzrvVar;
    }

    public static com.google.android.libraries.places.internal.zzrv zzc(com.google.android.libraries.places.internal.zzrt zzrtVar, com.google.android.libraries.places.internal.zzrv zzrvVar) {
        com.google.android.libraries.places.internal.zzrv zzrvVar2;
        com.google.android.libraries.places.internal.zzse zzseVar = zzrtVar.zzc;
        com.google.android.libraries.places.internal.zzrv zzrvVar3 = zzrtVar.zzb;
        if (zzrvVar3 != zzrvVar) {
            if (zzrvVar3 == null) {
                zzrtVar.zza = android.os.Build.VERSION.SDK_INT >= 29 ? android.os.Trace.isEnabled() : com.google.android.libraries.places.internal.zzqu.zza(zza);
            }
            if (zzrtVar.zza) {
                if (zzrvVar3 != null) {
                    zzrvVar2 = zzrvVar != null ? zzrvVar : null;
                    com.google.android.libraries.places.internal.zzru.zzb(zzrvVar3);
                } else {
                    zzrvVar2 = zzrvVar;
                }
                if (zzrvVar2 != null) {
                    com.google.android.libraries.places.internal.zzru.zza(zzrvVar2);
                }
            }
            if (zzrvVar3 != zzrvVar) {
                if (zzrvVar == null) {
                    zzrvVar = null;
                }
                zzrtVar.zzb = zzrvVar;
                return zzrvVar3;
            }
        }
        return zzrvVar;
    }

    public static com.google.android.libraries.places.internal.zzrt zzd() {
        return (com.google.android.libraries.places.internal.zzrt) zze.get();
    }

    public static boolean zze() {
        com.google.android.libraries.places.internal.zzrv zzrvVar = zzd().zzb;
        return (zzrvVar == null || zzrvVar == com.google.android.libraries.places.internal.zzrl.zza) ? false : true;
    }
}
