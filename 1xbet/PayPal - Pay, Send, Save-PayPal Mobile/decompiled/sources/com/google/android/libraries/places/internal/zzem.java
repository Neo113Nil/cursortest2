package com.google.android.libraries.places.internal;

/* loaded from: classes8.dex */
final class zzem implements com.google.common.util.concurrent.FutureCallback {
    final /* synthetic */ com.google.android.gms.tasks.TaskCompletionSource zza;
    final /* synthetic */ com.google.common.util.concurrent.ListenableFuture zzb;
    final /* synthetic */ com.google.android.gms.tasks.CancellationTokenSource zzc;

    @Override // com.google.common.util.concurrent.FutureCallback
    public final void onFailure(java.lang.Throwable th) {
        if (this.zzb.isCancelled()) {
            this.zzc.cancel();
        } else if (th instanceof java.lang.Exception) {
            this.zza.setException((java.lang.Exception) th);
        } else {
            this.zza.setException(new java.util.concurrent.ExecutionException(th));
        }
    }

    @Override // com.google.common.util.concurrent.FutureCallback
    public final void onSuccess(java.lang.Object obj) {
        this.zza.setResult(obj);
    }

    zzem(com.google.android.gms.tasks.TaskCompletionSource taskCompletionSource, com.google.common.util.concurrent.ListenableFuture listenableFuture, com.google.android.gms.tasks.CancellationTokenSource cancellationTokenSource) {
        this.zza = taskCompletionSource;
        this.zzb = listenableFuture;
        this.zzc = cancellationTokenSource;
    }
}
