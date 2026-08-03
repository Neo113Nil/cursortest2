package com.google.android.gms.internal.play_games_inputmapping;

/* compiled from: com.google.android.libraries.play.games:inputmapping@@1.0.0-beta */
/* loaded from: classes4.dex */
final class zzco extends com.google.android.gms.internal.play_games_inputmapping.zzcs {
    private static final com.google.android.gms.internal.play_games_inputmapping.zzco zza = new com.google.android.gms.internal.play_games_inputmapping.zzco(com.google.android.gms.internal.play_games_inputmapping.zzcs.zze());
    private final java.util.concurrent.atomic.AtomicReference zzb;

    zzco(com.google.android.gms.internal.play_games_inputmapping.zzcs zzcsVar) {
        this.zzb = new java.util.concurrent.atomic.AtomicReference(zzcsVar);
    }

    public static final com.google.android.gms.internal.play_games_inputmapping.zzco zza() {
        return zza;
    }

    @Override // com.google.android.gms.internal.play_games_inputmapping.zzcs
    public final boolean zzb(java.lang.String str, java.util.logging.Level level, boolean z) {
        ((com.google.android.gms.internal.play_games_inputmapping.zzcs) this.zzb.get()).zzb(str, level, z);
        return false;
    }

    @Override // com.google.android.gms.internal.play_games_inputmapping.zzcs
    public final com.google.android.gms.internal.play_games_inputmapping.zzdf zzc() {
        return ((com.google.android.gms.internal.play_games_inputmapping.zzcs) this.zzb.get()).zzc();
    }

    @Override // com.google.android.gms.internal.play_games_inputmapping.zzcs
    public final com.google.android.gms.internal.play_games_inputmapping.zzbg zzd() {
        return ((com.google.android.gms.internal.play_games_inputmapping.zzcs) this.zzb.get()).zzd();
    }
}
