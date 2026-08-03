package com.google.android.gms.internal.play_games_inputmapping;

/* compiled from: com.google.android.libraries.play.games:inputmapping@@1.0.0-beta */
/* loaded from: classes4.dex */
final class zzah implements java.lang.Runnable {
    final /* synthetic */ com.google.android.gms.internal.play_games_inputmapping.zzag zza;
    final /* synthetic */ com.google.android.gms.internal.play_games_inputmapping.zzai zzb;

    zzah(com.google.android.gms.internal.play_games_inputmapping.zzai zzaiVar, com.google.android.gms.internal.play_games_inputmapping.zzag zzagVar) {
        this.zzb = zzaiVar;
        this.zza = zzagVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        java.util.concurrent.ConcurrentHashMap concurrentHashMap;
        concurrentHashMap = this.zzb.zza;
        concurrentHashMap.remove(this.zza);
    }
}
