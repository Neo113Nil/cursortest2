package com.google.android.gms.games.internal;

/* compiled from: com.google.android.gms:play-services-games-v2@@20.0.0 */
/* loaded from: classes3.dex */
final class zzx extends com.google.android.gms.games.internal.zza {
    private final com.google.android.gms.tasks.TaskCompletionSource zza;

    zzx(com.google.android.gms.tasks.TaskCompletionSource taskCompletionSource) {
        this.zza = taskCompletionSource;
    }

    @Override // com.google.android.gms.games.internal.zza, com.google.android.gms.games.internal.zzal
    public final void zzl(com.google.android.gms.common.api.Status status, java.lang.String str) {
        if (status.isSuccess()) {
            this.zza.setResult(str);
            return;
        }
        com.google.android.gms.tasks.TaskCompletionSource taskCompletionSource = this.zza;
        int i = com.google.android.gms.games.internal.zzaj.zze;
        taskCompletionSource.setException(com.google.android.gms.common.internal.ApiExceptionUtil.fromStatus(status));
    }
}
