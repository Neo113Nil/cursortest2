package com.google.android.gms.internal.games_v2;

/* compiled from: com.google.android.gms:play-services-games-v2@@20.0.0 */
/* loaded from: classes4.dex */
final class zzv extends com.google.android.gms.internal.games_v2.zzm {
    final /* synthetic */ com.google.android.gms.tasks.TaskCompletionSource zza;

    zzv(com.google.android.gms.internal.games_v2.zzw zzwVar, com.google.android.gms.tasks.TaskCompletionSource taskCompletionSource) {
        this.zza = taskCompletionSource;
    }

    @Override // com.google.android.gms.internal.games_v2.zzm, com.google.android.gms.internal.games_v2.zzad
    public final void zzb(com.google.android.gms.common.api.Status status, com.google.android.gms.internal.games_v2.zzaa zzaaVar) {
        if (zzaaVar == null) {
            this.zza.setException(new com.google.android.gms.common.api.ApiException(status));
        } else {
            this.zza.setResult(zzaaVar);
        }
    }
}
