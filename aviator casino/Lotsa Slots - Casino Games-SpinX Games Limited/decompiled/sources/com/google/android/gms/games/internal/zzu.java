package com.google.android.gms.games.internal;

/* compiled from: com.google.android.gms:play-services-games-v2@@20.0.0 */
/* loaded from: classes3.dex */
final class zzu extends com.google.android.gms.games.internal.zza {
    private final com.google.android.gms.tasks.TaskCompletionSource zza;

    zzu(com.google.android.gms.tasks.TaskCompletionSource taskCompletionSource) {
        this.zza = taskCompletionSource;
    }

    @Override // com.google.android.gms.games.internal.zza, com.google.android.gms.games.internal.zzal
    public final void zzp(int i, java.lang.String str) {
        if (i == 0) {
            this.zza.setResult(str);
        } else {
            com.google.android.gms.games.GamesStatusUtils.zza(this.zza, i);
        }
    }
}
