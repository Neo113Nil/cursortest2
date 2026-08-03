package com.google.android.gms.internal.games_v2;

/* compiled from: com.google.android.gms:play-services-games-v2@@20.0.0 */
/* loaded from: classes4.dex */
final class zzbw implements com.google.android.gms.internal.games_v2.zzbt {
    private final android.app.Application zza;
    private final com.google.android.gms.games.internal.zzg zzb;
    private final com.google.android.gms.internal.games_v2.zzbd zzc;

    zzbw(android.app.Application application, com.google.android.gms.games.internal.zzg zzgVar, com.google.android.gms.internal.games_v2.zzbd zzbdVar) {
        this.zza = application;
        this.zzb = zzgVar;
        this.zzc = zzbdVar;
    }

    private final com.google.android.gms.internal.games_v2.zzs zzc() {
        android.app.Activity zza = this.zzb.zza();
        if (zza != null) {
            return com.google.android.gms.internal.games_v2.zzr.zza(zza, this.zzc.zzb);
        }
        com.google.android.gms.internal.games_v2.zzbd zzbdVar = this.zzc;
        return com.google.android.gms.internal.games_v2.zzr.zza(zzbdVar.zza, zzbdVar.zzb);
    }

    @Override // com.google.android.gms.internal.games_v2.zzbt
    public final com.google.android.gms.tasks.Task zza(final com.google.android.gms.internal.games_v2.zzy zzyVar) {
        final boolean z = false;
        if (zzyVar.zza() == 0 && !com.google.android.gms.common.wrappers.InstantApps.isInstantApp(this.zza)) {
            z = true;
        }
        com.google.android.gms.tasks.Task zza = zzc().zza(zzyVar, z);
        final com.google.android.gms.tasks.TaskCompletionSource taskCompletionSource = new com.google.android.gms.tasks.TaskCompletionSource();
        zza.continueWithTask(com.google.android.gms.internal.games_v2.zzgl.zza(), new com.google.android.gms.tasks.Continuation() { // from class: com.google.android.gms.internal.games_v2.zzbu
            @Override // com.google.android.gms.tasks.Continuation
            public final java.lang.Object then(com.google.android.gms.tasks.Task task) {
                return com.google.android.gms.internal.games_v2.zzbw.this.zzb(zzyVar, z, task);
            }
        }).addOnCompleteListener(com.google.android.gms.internal.games_v2.zzgl.zza(), new com.google.android.gms.tasks.OnCompleteListener() { // from class: com.google.android.gms.internal.games_v2.zzbv
            @Override // com.google.android.gms.tasks.OnCompleteListener
            public final void onComplete(com.google.android.gms.tasks.Task task) {
                com.google.android.gms.tasks.TaskCompletionSource taskCompletionSource2 = com.google.android.gms.tasks.TaskCompletionSource.this;
                if (task.isSuccessful()) {
                    taskCompletionSource2.trySetResult(com.google.android.gms.internal.games_v2.zzbx.zzc(((com.google.android.gms.internal.games_v2.zzaa) task.getResult()).zza()));
                    return;
                }
                java.lang.Exception exception = task.getException();
                if (exception instanceof com.google.android.gms.common.api.ApiException) {
                    taskCompletionSource2.trySetResult(com.google.android.gms.internal.games_v2.zzbx.zzb(((com.google.android.gms.common.api.ApiException) exception).getStatus()));
                } else {
                    com.google.android.gms.internal.games_v2.zzfx.zza(exception);
                    taskCompletionSource2.trySetException(exception);
                }
            }
        });
        return taskCompletionSource.getTask();
    }

    final /* synthetic */ com.google.android.gms.tasks.Task zzb(com.google.android.gms.internal.games_v2.zzy zzyVar, boolean z, com.google.android.gms.tasks.Task task) throws java.lang.Exception {
        if (!task.isSuccessful()) {
            java.lang.Exception exception = task.getException();
            if ((exception instanceof com.google.android.gms.common.api.ApiException) && ((com.google.android.gms.common.api.ApiException) exception).getStatusCode() == 20) {
                com.google.android.gms.internal.games_v2.zzfn.zza("GamesAuthenticator", "Service connection suspended during the first sign-in attempt. Trying again.");
                return zzc().zza(zzyVar, z);
            }
        }
        return task;
    }
}
