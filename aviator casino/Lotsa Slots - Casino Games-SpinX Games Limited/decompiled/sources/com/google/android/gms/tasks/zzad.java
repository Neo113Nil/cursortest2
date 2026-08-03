package com.google.android.gms.tasks;

/* compiled from: com.google.android.gms:play-services-tasks@@18.1.0 */
/* loaded from: classes4.dex */
final class zzad<T> implements com.google.android.gms.tasks.zzae<T> {
    private final java.util.concurrent.CountDownLatch zza = new java.util.concurrent.CountDownLatch(1);

    private zzad() {
    }

    @Override // com.google.android.gms.tasks.OnCanceledListener
    public final void onCanceled() {
        this.zza.countDown();
    }

    @Override // com.google.android.gms.tasks.OnFailureListener
    public final void onFailure(java.lang.Exception exc) {
        this.zza.countDown();
    }

    @Override // com.google.android.gms.tasks.OnSuccessListener
    public final void onSuccess(T t) {
        this.zza.countDown();
    }

    public final void zza() throws java.lang.InterruptedException {
        this.zza.await();
    }

    public final boolean zzb(long j, java.util.concurrent.TimeUnit timeUnit) throws java.lang.InterruptedException {
        return this.zza.await(j, timeUnit);
    }

    /* synthetic */ zzad(com.google.android.gms.tasks.zzac zzacVar) {
    }
}
