package com.google.android.gms.internal.games_v2;

/* compiled from: com.google.android.gms:play-services-games-v2@@20.0.0 */
/* loaded from: classes4.dex */
public final class zzby {
    private static final java.util.concurrent.atomic.AtomicReference zza = new java.util.concurrent.atomic.AtomicReference();
    private static boolean zzb = false;
    private final android.app.Application zzc;
    private final com.google.android.gms.internal.games_v2.zzbb zzd;
    private final com.google.android.gms.games.internal.zzg zze;
    private final com.google.android.gms.games.internal.v2.appshortcuts.zzg zzf;

    private zzby(android.app.Application application, com.google.android.gms.internal.games_v2.zzbb zzbbVar, com.google.android.gms.games.internal.zzg zzgVar, com.google.android.gms.games.internal.v2.appshortcuts.zzg zzgVar2) {
        this.zzc = application;
        this.zzd = zzbbVar;
        this.zze = zzgVar;
        this.zzf = zzgVar2;
    }

    public static android.app.Application zza() {
        zzb();
        return ((com.google.android.gms.internal.games_v2.zzby) zza.get()).zzc;
    }

    public static void zzb() {
        com.google.android.gms.common.internal.Preconditions.checkState(zzb, "PlayGamesSdk has not been initialized. Ensure that PlayGamesSdk.initialize() has been called.");
    }

    public static void zzc(android.content.Context context) {
        com.google.android.gms.common.internal.Preconditions.checkArgument(context != null);
        java.util.concurrent.atomic.AtomicReference atomicReference = zza;
        if (atomicReference.get() == null) {
            synchronized (atomicReference) {
                if (atomicReference.get() == null) {
                    android.content.Context applicationContext = context.getApplicationContext();
                    android.app.Application application = applicationContext != null ? (android.app.Application) applicationContext : (android.app.Application) context;
                    com.google.android.gms.internal.games_v2.zzby zzbyVar = new com.google.android.gms.internal.games_v2.zzby(application, com.google.android.gms.internal.games_v2.zzbb.zza(application), com.google.android.gms.games.internal.zzg.zzb(application), com.google.android.gms.games.internal.v2.appshortcuts.zzg.zzd(context));
                    atomicReference.set(zzbyVar);
                    zzbyVar.zzf.zzc();
                    zzbyVar.zzd.zzc();
                    zzbyVar.zze.zzg();
                }
            }
        }
        zzb = true;
    }
}
