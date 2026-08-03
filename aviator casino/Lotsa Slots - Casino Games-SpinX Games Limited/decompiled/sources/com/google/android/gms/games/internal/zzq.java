package com.google.android.gms.games.internal;

/* compiled from: com.google.android.gms:play-services-games-v2@@20.0.0 */
/* loaded from: classes3.dex */
final class zzq extends com.google.android.gms.games.internal.zza {
    private final com.google.android.gms.tasks.TaskCompletionSource zza;

    zzq(com.google.android.gms.tasks.TaskCompletionSource taskCompletionSource) {
        this.zza = taskCompletionSource;
    }

    @Override // com.google.android.gms.games.internal.zza, com.google.android.gms.games.internal.zzal
    public final void zzb(int i, java.lang.String str) {
        if (i == 0 || i == 3003) {
            this.zza.setResult(java.lang.Boolean.valueOf(i == 3003));
        } else {
            com.google.android.gms.games.GamesStatusUtils.zza(this.zza, i);
        }
    }
}
