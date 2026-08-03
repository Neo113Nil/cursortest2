package com.google.android.gms.ads.internal.offline.buffering;

/* compiled from: com.google.android.gms:play-services-ads-api@@25.2.0 */
/* loaded from: classes3.dex */
public class OfflinePingSender extends androidx.work.Worker {
    private final com.google.android.gms.internal.ads.zzbyu zza;

    public OfflinePingSender(android.content.Context context, androidx.work.WorkerParameters workerParameters) {
        super(context, workerParameters);
        this.zza = com.google.android.gms.ads.internal.client.zzay.zzb().zzj(context, new com.google.android.gms.internal.ads.zzbuy());
    }

    @Override // androidx.work.Worker
    public final androidx.work.ListenableWorker.Result doWork() {
        try {
            this.zza.zzg();
            return androidx.work.ListenableWorker.Result.success();
        } catch (android.os.RemoteException unused) {
            return androidx.work.ListenableWorker.Result.failure();
        }
    }
}
