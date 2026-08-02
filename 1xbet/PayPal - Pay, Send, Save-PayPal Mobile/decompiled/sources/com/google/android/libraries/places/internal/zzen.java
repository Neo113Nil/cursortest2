package com.google.android.libraries.places.internal;

/* loaded from: classes8.dex */
public final class zzen {
    public static com.google.android.gms.tasks.Task zza(com.google.common.util.concurrent.ListenableFuture listenableFuture) {
        com.google.android.gms.tasks.CancellationTokenSource cancellationTokenSource = new com.google.android.gms.tasks.CancellationTokenSource();
        com.google.android.gms.tasks.TaskCompletionSource taskCompletionSource = new com.google.android.gms.tasks.TaskCompletionSource(cancellationTokenSource.getToken());
        com.google.common.util.concurrent.Futures.addCallback(listenableFuture, new com.google.android.libraries.places.internal.zzem(taskCompletionSource, listenableFuture, cancellationTokenSource), com.google.common.util.concurrent.MoreExecutors.directExecutor());
        return taskCompletionSource.getTask();
    }
}
