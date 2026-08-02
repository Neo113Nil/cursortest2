package com.google.android.libraries.places.internal;

/* loaded from: classes4.dex */
public final class zzmb {
    private final java.util.Map zza = new java.util.HashMap();

    public zzmb(com.google.android.libraries.places.internal.zzlx zzlxVar) {
    }

    public final com.google.android.gms.tasks.Task zza(com.google.android.gms.tasks.Task task, com.google.android.gms.tasks.CancellationToken cancellationToken, long j, java.lang.String str) {
        final com.google.android.gms.tasks.TaskCompletionSource taskCompletionSource = cancellationToken == null ? new com.google.android.gms.tasks.TaskCompletionSource() : new com.google.android.gms.tasks.TaskCompletionSource(cancellationToken);
        java.util.Map map = this.zza;
        if (!map.containsKey(taskCompletionSource)) {
            android.os.HandlerThread handlerThread = new android.os.HandlerThread("timeoutHandlerThread");
            handlerThread.start();
            map.put(taskCompletionSource, handlerThread);
            final java.lang.String str2 = "Location timeout.";
            new android.os.Handler(handlerThread.getLooper()).postDelayed(new java.lang.Runnable(str2) { // from class: com.google.android.libraries.places.internal.zzma
                @Override // java.lang.Runnable
                public final /* synthetic */ void run() {
                    com.google.android.gms.tasks.TaskCompletionSource.this.trySetException(new com.google.android.gms.common.api.ApiException(new com.google.android.gms.common.api.Status(15, "Location timeout.")));
                }
            }, j);
        }
        task.continueWithTask(new com.google.android.gms.tasks.Continuation(this) { // from class: com.google.android.libraries.places.internal.zzly
            @Override // com.google.android.gms.tasks.Continuation
            public final /* synthetic */ java.lang.Object then(com.google.android.gms.tasks.Task task2) {
                com.google.android.gms.tasks.TaskCompletionSource taskCompletionSource2 = taskCompletionSource;
                java.lang.Exception exception = task2.getException();
                if (task2.isSuccessful()) {
                    taskCompletionSource2.setResult(task2.getResult());
                } else if (!task2.isCanceled() && exception != null) {
                    taskCompletionSource2.setException(exception);
                }
                return taskCompletionSource2.getTask();
            }
        });
        taskCompletionSource.getTask().addOnCompleteListener(new com.google.android.gms.tasks.OnCompleteListener() { // from class: com.google.android.libraries.places.internal.zzlz
            @Override // com.google.android.gms.tasks.OnCompleteListener
            public final /* synthetic */ void onComplete(com.google.android.gms.tasks.Task task2) {
                com.google.android.libraries.places.internal.zzmb.this.zzb(taskCompletionSource, task2);
            }
        });
        return taskCompletionSource.getTask();
    }

    final /* synthetic */ void zzb(com.google.android.gms.tasks.TaskCompletionSource taskCompletionSource, com.google.android.gms.tasks.Task task) {
        android.os.HandlerThread handlerThread = (android.os.HandlerThread) this.zza.remove(taskCompletionSource);
        if (handlerThread == null) {
            return;
        }
        handlerThread.quit();
    }
}
