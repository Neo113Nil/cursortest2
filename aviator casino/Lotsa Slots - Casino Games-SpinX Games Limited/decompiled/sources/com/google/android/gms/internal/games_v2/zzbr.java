package com.google.android.gms.internal.games_v2;

/* compiled from: com.google.android.gms:play-services-games-v2@@20.0.0 */
/* loaded from: classes4.dex */
final class zzbr {
    private final com.google.android.gms.tasks.TaskCompletionSource zza;
    private final com.google.android.gms.internal.games_v2.zzaw zzb;

    public zzbr(com.google.android.gms.internal.games_v2.zzaw zzawVar, com.google.android.gms.tasks.TaskCompletionSource taskCompletionSource) {
        this.zzb = zzawVar;
        this.zza = taskCompletionSource;
    }

    public final void zza(com.google.android.gms.common.api.GoogleApi googleApi) {
        this.zzb.zza(googleApi).addOnCompleteListener(com.google.android.gms.internal.games_v2.zzgl.zza(), new com.google.android.gms.tasks.OnCompleteListener() { // from class: com.google.android.gms.internal.games_v2.zzbq
            @Override // com.google.android.gms.tasks.OnCompleteListener
            public final void onComplete(com.google.android.gms.tasks.Task task) {
                com.google.android.gms.internal.games_v2.zzbr.this.zzb(task);
            }
        });
    }

    final /* synthetic */ void zzb(com.google.android.gms.tasks.Task task) {
        if (task.isSuccessful()) {
            this.zza.setResult(task.getResult());
            return;
        }
        com.google.android.gms.tasks.TaskCompletionSource taskCompletionSource = this.zza;
        java.lang.Exception exception = task.getException();
        com.google.android.gms.internal.games_v2.zzfx.zza(exception);
        taskCompletionSource.setException(exception);
    }

    public final void zzc(java.lang.Exception exc) {
        this.zza.setException(exc);
    }
}
