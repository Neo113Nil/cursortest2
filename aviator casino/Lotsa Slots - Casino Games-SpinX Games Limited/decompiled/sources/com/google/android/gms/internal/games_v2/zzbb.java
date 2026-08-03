package com.google.android.gms.internal.games_v2;

/* compiled from: com.google.android.gms:play-services-games-v2@@20.0.0 */
/* loaded from: classes4.dex */
public final class zzbb {
    private static final java.util.concurrent.atomic.AtomicReference zza = new java.util.concurrent.atomic.AtomicReference();
    private final com.google.android.gms.internal.games_v2.zzba zzb;
    private final com.google.android.gms.internal.games_v2.zzbc zzc;

    zzbb(android.app.Application application, com.google.android.gms.internal.games_v2.zzbc zzbcVar) {
        this.zzb = new com.google.android.gms.internal.games_v2.zzba(this, application, null);
        this.zzc = zzbcVar;
    }

    static com.google.android.gms.internal.games_v2.zzbb zza(android.app.Application application) {
        java.util.concurrent.atomic.AtomicReference atomicReference = zza;
        com.google.android.gms.internal.games_v2.zzbb zzbbVar = (com.google.android.gms.internal.games_v2.zzbb) atomicReference.get();
        if (zzbbVar != null) {
            return zzbbVar;
        }
        com.google.android.gms.internal.games_v2.zzbb zzbbVar2 = new com.google.android.gms.internal.games_v2.zzbb(application, com.google.android.gms.internal.games_v2.zzbe.zza(application));
        while (!androidx.compose.animation.core.ComplexDouble$$ExternalSyntheticBackport0.m(atomicReference, null, zzbbVar2) && atomicReference.get() == null) {
        }
        return (com.google.android.gms.internal.games_v2.zzbb) com.google.android.gms.common.internal.Preconditions.checkNotNull((com.google.android.gms.internal.games_v2.zzbb) zza.get());
    }

    public final void zzc() {
        com.google.android.gms.internal.games_v2.zzfn.zza("AutomaticGamesAuthenticator", "startWatching()");
        com.google.android.gms.internal.games_v2.zzba.zza(this.zzb);
    }
}
