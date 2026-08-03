package com.google.android.gms.internal.play_games_inputmapping;

/* compiled from: com.google.android.libraries.play.games:inputmapping@@1.0.0-beta */
/* loaded from: classes4.dex */
final class zzam {
    private static final com.google.android.gms.internal.play_games_inputmapping.zzai zza = new com.google.android.gms.internal.play_games_inputmapping.zzak();
    private final java.util.concurrent.atomic.AtomicLong zzb = new java.util.concurrent.atomic.AtomicLong();
    private final java.util.concurrent.atomic.AtomicLong zzc = new java.util.concurrent.atomic.AtomicLong();
    private final java.util.concurrent.atomic.AtomicInteger zzd = new java.util.concurrent.atomic.AtomicInteger();

    zzam() {
    }

    static com.google.android.gms.internal.play_games_inputmapping.zzam zza(com.google.android.gms.internal.play_games_inputmapping.zzag zzagVar, com.google.android.gms.internal.play_games_inputmapping.zzbg zzbgVar) {
        return (com.google.android.gms.internal.play_games_inputmapping.zzam) zza.zzb(zzagVar, zzbgVar);
    }

    final boolean zzb(int i) {
        return this.zzb.getAndIncrement() % ((long) i) == 0;
    }

    final boolean zzc(long j, com.google.android.gms.internal.play_games_inputmapping.zzal zzalVar) {
        this.zzc.get();
        throw null;
    }
}
