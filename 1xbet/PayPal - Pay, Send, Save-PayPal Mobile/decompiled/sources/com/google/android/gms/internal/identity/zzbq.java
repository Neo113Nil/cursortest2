package com.google.android.gms.internal.identity;

/* loaded from: classes8.dex */
final /* synthetic */ class zzbq implements com.google.android.gms.tasks.Continuation {
    private final /* synthetic */ com.google.android.gms.tasks.TaskCompletionSource zza;

    @Override // com.google.android.gms.tasks.Continuation
    public final /* synthetic */ java.lang.Object then(com.google.android.gms.tasks.Task task) {
        com.google.android.gms.common.api.Api api = com.google.android.gms.internal.identity.zzbi.zzb;
        com.google.android.gms.tasks.TaskCompletionSource taskCompletionSource = this.zza;
        if (task.isSuccessful()) {
            taskCompletionSource.trySetResult((android.location.Location) task.getResult());
            return null;
        }
        taskCompletionSource.trySetException((java.lang.Exception) java.util.Objects.requireNonNull(task.getException()));
        return null;
    }

    /* synthetic */ zzbq(com.google.android.gms.tasks.TaskCompletionSource taskCompletionSource) {
        this.zza = taskCompletionSource;
    }
}
