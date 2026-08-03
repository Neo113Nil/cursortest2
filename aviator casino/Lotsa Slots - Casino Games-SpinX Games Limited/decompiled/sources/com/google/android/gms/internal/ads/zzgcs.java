package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@25.2.0 */
/* loaded from: classes4.dex */
public final class zzgcs {
    public static com.google.common.util.concurrent.ListenableFuture zza(com.google.android.gms.tasks.Task task, com.google.android.gms.tasks.CancellationTokenSource cancellationTokenSource) {
        final com.google.android.gms.internal.ads.zzgcq zzgcqVar = new com.google.android.gms.internal.ads.zzgcq(task, null);
        task.addOnCompleteListener(com.google.android.gms.internal.ads.zzhcn.zza(), new com.google.android.gms.tasks.OnCompleteListener() { // from class: com.google.android.gms.internal.ads.zzgcr
            @Override // com.google.android.gms.tasks.OnCompleteListener
            public final /* synthetic */ void onComplete(com.google.android.gms.tasks.Task task2) {
                com.google.android.gms.internal.ads.zzgcq zzgcqVar2 = com.google.android.gms.internal.ads.zzgcq.this;
                if (task2.isCanceled()) {
                    zzgcqVar2.cancel(false);
                    return;
                }
                if (task2.isSuccessful()) {
                    zzgcqVar2.zza(task2.getResult());
                    return;
                }
                java.lang.Exception exception = task2.getException();
                if (exception == null) {
                    throw new java.lang.IllegalStateException();
                }
                zzgcqVar2.zzb(exception);
            }
        });
        return zzgcqVar;
    }
}
