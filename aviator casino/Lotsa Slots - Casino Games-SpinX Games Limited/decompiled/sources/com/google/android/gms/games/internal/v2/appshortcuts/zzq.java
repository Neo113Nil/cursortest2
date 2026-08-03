package com.google.android.gms.games.internal.v2.appshortcuts;

/* compiled from: com.google.android.gms:play-services-games-v2@@20.0.0 */
/* loaded from: classes3.dex */
class zzq extends com.google.android.gms.games.internal.v2.appshortcuts.zzx {
    protected final com.google.android.gms.tasks.TaskCompletionSource zza;

    zzq(com.google.android.gms.tasks.TaskCompletionSource taskCompletionSource) {
        this.zza = taskCompletionSource;
    }

    public void zzb(com.google.android.gms.games.internal.v2.appshortcuts.zzh zzhVar) {
        zzd(new com.google.android.gms.common.api.Status(10));
    }

    public void zzc(android.content.Intent intent) {
        zzd(new com.google.android.gms.common.api.Status(10));
    }

    @Override // com.google.android.gms.games.internal.v2.appshortcuts.zzy
    public final void zzd(com.google.android.gms.common.api.Status status) {
        this.zza.trySetException(com.google.android.gms.common.internal.ApiExceptionUtil.fromStatus(status));
    }
}
