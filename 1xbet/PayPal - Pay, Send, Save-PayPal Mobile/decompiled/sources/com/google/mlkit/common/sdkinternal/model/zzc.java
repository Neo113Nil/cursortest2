package com.google.mlkit.common.sdkinternal.model;

/* loaded from: classes9.dex */
final class zzc extends android.content.BroadcastReceiver {
    final /* synthetic */ com.google.mlkit.common.sdkinternal.model.RemoteModelDownloadManager zza;
    private final long zzb;
    private final com.google.android.gms.tasks.TaskCompletionSource zzc;

    /* synthetic */ zzc(com.google.mlkit.common.sdkinternal.model.RemoteModelDownloadManager remoteModelDownloadManager, long j, com.google.android.gms.tasks.TaskCompletionSource taskCompletionSource, com.google.mlkit.common.sdkinternal.model.zzb zzbVar) {
        this.zza = remoteModelDownloadManager;
        this.zzb = j;
        this.zzc = taskCompletionSource;
    }

    @Override // android.content.BroadcastReceiver
    public final void onReceive(android.content.Context context, android.content.Intent intent) {
        com.google.android.gms.common.internal.GmsLogger gmsLogger;
        android.util.LongSparseArray longSparseArray;
        android.util.LongSparseArray longSparseArray2;
        com.google.android.gms.internal.mlkit_common.zzsh zzshVar;
        com.google.mlkit.common.model.RemoteModel remoteModel;
        com.google.android.gms.internal.mlkit_common.zzsh zzshVar2;
        com.google.mlkit.common.model.RemoteModel remoteModel2;
        com.google.mlkit.common.model.RemoteModel remoteModel3;
        com.google.android.gms.internal.mlkit_common.zzsh zzshVar3;
        com.google.mlkit.common.model.RemoteModel remoteModel4;
        com.google.mlkit.common.MlKitException zzl;
        com.google.mlkit.common.sdkinternal.MlKitContext mlKitContext;
        long longExtra = intent.getLongExtra("extra_download_id", -1L);
        if (longExtra != this.zzb) {
            return;
        }
        com.google.mlkit.common.sdkinternal.model.RemoteModelDownloadManager remoteModelDownloadManager = this.zza;
        java.lang.Integer downloadingModelStatusCode = remoteModelDownloadManager.getDownloadingModelStatusCode();
        synchronized (remoteModelDownloadManager) {
            try {
                mlKitContext = this.zza.zze;
                mlKitContext.getApplicationContext().unregisterReceiver(this);
            } catch (java.lang.IllegalArgumentException e) {
                gmsLogger = com.google.mlkit.common.sdkinternal.model.RemoteModelDownloadManager.zza;
                gmsLogger.w("ModelDownloadManager", "Exception thrown while trying to unregister the broadcast receiver for the download", e);
            }
            longSparseArray = this.zza.zzc;
            longSparseArray.remove(this.zzb);
            longSparseArray2 = this.zza.zzd;
            longSparseArray2.remove(this.zzb);
        }
        if (downloadingModelStatusCode != null) {
            if (downloadingModelStatusCode.intValue() == 16) {
                com.google.mlkit.common.sdkinternal.model.RemoteModelDownloadManager remoteModelDownloadManager2 = this.zza;
                zzshVar3 = remoteModelDownloadManager2.zzi;
                com.google.android.gms.internal.mlkit_common.zzry zzg = com.google.android.gms.internal.mlkit_common.zzsk.zzg();
                remoteModel4 = remoteModelDownloadManager2.zzg;
                java.lang.Long valueOf = java.lang.Long.valueOf(longExtra);
                zzshVar3.zze(zzg, remoteModel4, false, remoteModelDownloadManager2.getFailureReason(valueOf));
                com.google.android.gms.tasks.TaskCompletionSource taskCompletionSource = this.zzc;
                zzl = this.zza.zzl(valueOf);
                taskCompletionSource.setException(zzl);
                return;
            }
            if (downloadingModelStatusCode.intValue() == 8) {
                com.google.mlkit.common.sdkinternal.model.RemoteModelDownloadManager remoteModelDownloadManager3 = this.zza;
                zzshVar2 = remoteModelDownloadManager3.zzi;
                com.google.android.gms.internal.mlkit_common.zzry zzg2 = com.google.android.gms.internal.mlkit_common.zzsk.zzg();
                remoteModel2 = remoteModelDownloadManager3.zzg;
                com.google.android.gms.internal.mlkit_common.zzsi zzh = com.google.android.gms.internal.mlkit_common.zzsj.zzh();
                zzh.zzb(com.google.android.gms.internal.mlkit_common.zzmu.NO_ERROR);
                zzh.zze(true);
                remoteModel3 = this.zza.zzg;
                zzh.zzd(remoteModel3.getModelType());
                zzh.zza(com.google.android.gms.internal.mlkit_common.zzna.SUCCEEDED);
                zzshVar2.zzg(zzg2, remoteModel2, zzh.zzh());
                this.zzc.setResult(null);
                return;
            }
        }
        com.google.mlkit.common.sdkinternal.model.RemoteModelDownloadManager remoteModelDownloadManager4 = this.zza;
        zzshVar = remoteModelDownloadManager4.zzi;
        com.google.android.gms.internal.mlkit_common.zzry zzg3 = com.google.android.gms.internal.mlkit_common.zzsk.zzg();
        remoteModel = remoteModelDownloadManager4.zzg;
        zzshVar.zze(zzg3, remoteModel, false, 0);
        this.zzc.setException(new com.google.mlkit.common.MlKitException("Model downloading failed", 13));
    }
}
