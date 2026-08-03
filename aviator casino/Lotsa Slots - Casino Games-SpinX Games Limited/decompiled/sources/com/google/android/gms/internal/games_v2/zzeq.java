package com.google.android.gms.internal.games_v2;

/* compiled from: com.google.android.gms:play-services-games-v2@@20.0.0 */
/* loaded from: classes4.dex */
final class zzeq extends com.google.android.gms.internal.games_v2.zzfl {
    final /* synthetic */ com.google.android.gms.tasks.TaskCompletionSource zza;

    zzeq(com.google.android.gms.internal.games_v2.zzer zzerVar, com.google.android.gms.tasks.TaskCompletionSource taskCompletionSource) {
        this.zza = taskCompletionSource;
    }

    @Override // com.google.android.gms.internal.games_v2.zzfl, com.google.android.gms.internal.games_v2.zzaq
    public final void zzb(com.google.android.gms.common.api.Status status) {
        this.zza.setException(new com.google.android.gms.common.api.ApiException(status));
    }

    @Override // com.google.android.gms.internal.games_v2.zzfl, com.google.android.gms.internal.games_v2.zzaq
    public final void zzc(com.google.android.gms.internal.games_v2.zzau zzauVar) {
        this.zza.setResult(com.google.android.gms.games.RecallAccess.zza(zzauVar));
    }
}
