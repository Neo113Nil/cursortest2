package com.google.mlkit.common.internal.model;

/* loaded from: classes9.dex */
public final class zzg implements com.google.mlkit.common.sdkinternal.model.RemoteModelManagerInterface {
    private final com.google.mlkit.common.sdkinternal.MlKitContext zza;
    private final com.google.android.gms.internal.mlkit_common.zzsh zzb;

    public zzg(com.google.mlkit.common.sdkinternal.MlKitContext mlKitContext) {
        com.google.android.gms.internal.mlkit_common.zzsh zzb = com.google.android.gms.internal.mlkit_common.zzss.zzb("common");
        this.zza = mlKitContext;
        this.zzb = zzb;
    }

    private final com.google.mlkit.common.sdkinternal.model.RemoteModelDownloadManager zze(com.google.mlkit.common.model.CustomRemoteModel customRemoteModel) {
        com.google.mlkit.common.sdkinternal.model.RemoteModelFileManager remoteModelFileManager = new com.google.mlkit.common.sdkinternal.model.RemoteModelFileManager(this.zza, customRemoteModel, null, new com.google.mlkit.common.sdkinternal.model.ModelFileHelper(this.zza), new com.google.mlkit.common.internal.model.zza(this.zza, customRemoteModel.getUniqueModelNameForPersist()));
        com.google.mlkit.common.sdkinternal.MlKitContext mlKitContext = this.zza;
        return com.google.mlkit.common.sdkinternal.model.RemoteModelDownloadManager.getInstance(this.zza, customRemoteModel, new com.google.mlkit.common.sdkinternal.model.ModelFileHelper(mlKitContext), remoteModelFileManager, (com.google.mlkit.common.sdkinternal.model.ModelInfoRetrieverInterop) mlKitContext.get(com.google.mlkit.common.sdkinternal.model.ModelInfoRetrieverInterop.class));
    }

    @Override // com.google.mlkit.common.sdkinternal.model.RemoteModelManagerInterface
    public final /* synthetic */ com.google.android.gms.tasks.Task deleteDownloadedModel(com.google.mlkit.common.model.RemoteModel remoteModel) {
        final com.google.mlkit.common.model.CustomRemoteModel customRemoteModel = (com.google.mlkit.common.model.CustomRemoteModel) remoteModel;
        final com.google.android.gms.tasks.TaskCompletionSource taskCompletionSource = new com.google.android.gms.tasks.TaskCompletionSource();
        com.google.mlkit.common.sdkinternal.MLTaskExecutor.workerThreadExecutor().execute(new java.lang.Runnable() { // from class: com.google.mlkit.common.internal.model.zzb
            @Override // java.lang.Runnable
            public final void run() {
                com.google.mlkit.common.internal.model.zzg.this.zzb(customRemoteModel, taskCompletionSource);
            }
        });
        return taskCompletionSource.getTask().addOnCompleteListener(new com.google.android.gms.tasks.OnCompleteListener() { // from class: com.google.mlkit.common.internal.model.zzc
            @Override // com.google.android.gms.tasks.OnCompleteListener
            public final void onComplete(com.google.android.gms.tasks.Task task) {
                com.google.mlkit.common.internal.model.zzg.this.zzc(task);
            }
        });
    }

    @Override // com.google.mlkit.common.sdkinternal.model.RemoteModelManagerInterface
    public final /* synthetic */ com.google.android.gms.tasks.Task download(com.google.mlkit.common.model.RemoteModel remoteModel, com.google.mlkit.common.model.DownloadConditions downloadConditions) {
        final com.google.mlkit.common.sdkinternal.model.RemoteModelDownloadManager zze = zze((com.google.mlkit.common.model.CustomRemoteModel) remoteModel);
        zze.setDownloadConditions(downloadConditions);
        return com.google.android.gms.tasks.Tasks.forResult(null).onSuccessTask(com.google.mlkit.common.sdkinternal.MLTaskExecutor.workerThreadExecutor(), new com.google.android.gms.tasks.SuccessContinuation() { // from class: com.google.mlkit.common.internal.model.zzd
            @Override // com.google.android.gms.tasks.SuccessContinuation
            public final com.google.android.gms.tasks.Task then(java.lang.Object obj) {
                return com.google.mlkit.common.sdkinternal.model.RemoteModelDownloadManager.this.ensureModelDownloaded();
            }
        });
    }

    @Override // com.google.mlkit.common.sdkinternal.model.RemoteModelManagerInterface
    public final com.google.android.gms.tasks.Task<java.util.Set<com.google.mlkit.common.model.CustomRemoteModel>> getDownloadedModels() {
        return com.google.android.gms.tasks.Tasks.forException(new com.google.mlkit.common.MlKitException("Custom Remote model does not support listing downloaded models", 12));
    }

    @Override // com.google.mlkit.common.sdkinternal.model.RemoteModelManagerInterface
    public final /* synthetic */ com.google.android.gms.tasks.Task isModelDownloaded(com.google.mlkit.common.model.RemoteModel remoteModel) {
        final com.google.mlkit.common.model.CustomRemoteModel customRemoteModel = (com.google.mlkit.common.model.CustomRemoteModel) remoteModel;
        return com.google.mlkit.common.sdkinternal.MLTaskExecutor.getInstance().scheduleCallable(new java.util.concurrent.Callable() { // from class: com.google.mlkit.common.internal.model.zze
            @Override // java.util.concurrent.Callable
            public final java.lang.Object call() {
                return com.google.mlkit.common.internal.model.zzg.this.zza(customRemoteModel);
            }
        }).addOnCompleteListener(new com.google.android.gms.tasks.OnCompleteListener() { // from class: com.google.mlkit.common.internal.model.zzf
            @Override // com.google.android.gms.tasks.OnCompleteListener
            public final void onComplete(com.google.android.gms.tasks.Task task) {
                com.google.mlkit.common.internal.model.zzg.this.zzd(task);
            }
        });
    }

    final /* synthetic */ java.lang.Boolean zza(com.google.mlkit.common.model.CustomRemoteModel customRemoteModel) throws java.lang.Exception {
        return java.lang.Boolean.valueOf(zze(customRemoteModel).isModelDownloadedAndValid());
    }

    final /* synthetic */ void zzb(com.google.mlkit.common.model.CustomRemoteModel customRemoteModel, com.google.android.gms.tasks.TaskCompletionSource taskCompletionSource) {
        try {
            new com.google.mlkit.common.sdkinternal.model.ModelFileHelper(this.zza).deleteAllModels(com.google.mlkit.common.sdkinternal.ModelType.CUSTOM, (java.lang.String) com.google.android.gms.common.internal.Preconditions.checkNotNull(customRemoteModel.getModelName()));
            taskCompletionSource.setResult(null);
        } catch (java.lang.RuntimeException e) {
            taskCompletionSource.setException(new com.google.mlkit.common.MlKitException("Internal error has occurred when executing ML Kit tasks", 13, e));
        }
    }

    final /* synthetic */ void zzc(com.google.android.gms.tasks.Task task) {
        boolean isSuccessful = task.isSuccessful();
        com.google.android.gms.internal.mlkit_common.zzmw zzmwVar = new com.google.android.gms.internal.mlkit_common.zzmw();
        com.google.android.gms.internal.mlkit_common.zzlm zzlmVar = new com.google.android.gms.internal.mlkit_common.zzlm();
        zzlmVar.zzb(com.google.android.gms.internal.mlkit_common.zzne.CUSTOM);
        zzlmVar.zza(java.lang.Boolean.valueOf(isSuccessful));
        zzmwVar.zze(zzlmVar.zzc());
        this.zzb.zzd(com.google.android.gms.internal.mlkit_common.zzsk.zzf(zzmwVar), com.google.android.gms.internal.mlkit_common.zzmv.REMOTE_MODEL_DELETE_ON_DEVICE);
    }

    final /* synthetic */ void zzd(com.google.android.gms.tasks.Task task) {
        boolean booleanValue = ((java.lang.Boolean) task.getResult()).booleanValue();
        com.google.android.gms.internal.mlkit_common.zzmw zzmwVar = new com.google.android.gms.internal.mlkit_common.zzmw();
        com.google.android.gms.internal.mlkit_common.zzmh zzmhVar = new com.google.android.gms.internal.mlkit_common.zzmh();
        zzmhVar.zzb(com.google.android.gms.internal.mlkit_common.zzne.CUSTOM);
        zzmhVar.zza(java.lang.Boolean.valueOf(booleanValue));
        zzmwVar.zzg(zzmhVar.zzc());
        this.zzb.zzd(com.google.android.gms.internal.mlkit_common.zzsk.zzf(zzmwVar), com.google.android.gms.internal.mlkit_common.zzmv.REMOTE_MODEL_IS_DOWNLOADED);
    }
}
