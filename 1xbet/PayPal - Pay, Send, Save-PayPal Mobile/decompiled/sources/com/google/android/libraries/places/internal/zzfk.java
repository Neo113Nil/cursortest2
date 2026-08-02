package com.google.android.libraries.places.internal;

/* loaded from: classes8.dex */
final class zzfk implements com.google.android.gms.tasks.Continuation {
    zzfk(com.google.android.libraries.places.internal.zzfl zzflVar) {
        java.util.Objects.requireNonNull(zzflVar);
    }

    @Override // com.google.android.gms.tasks.Continuation
    public final /* synthetic */ java.lang.Object then(com.google.android.gms.tasks.Task task) throws java.lang.Exception {
        com.google.android.gms.tasks.TaskCompletionSource taskCompletionSource = new com.google.android.gms.tasks.TaskCompletionSource();
        if (task.isCanceled()) {
            taskCompletionSource.trySetException(new com.google.android.gms.common.api.ApiException(new com.google.android.gms.common.api.Status(16, "Location request was cancelled. Please try again.")));
        } else if (task.getException() == null && task.getResult() == null) {
            taskCompletionSource.trySetException(new com.google.android.gms.common.api.ApiException(new com.google.android.gms.common.api.Status(8, "Location unavailable.")));
        }
        return taskCompletionSource.getTask().getException() != null ? taskCompletionSource.getTask() : task;
    }
}
