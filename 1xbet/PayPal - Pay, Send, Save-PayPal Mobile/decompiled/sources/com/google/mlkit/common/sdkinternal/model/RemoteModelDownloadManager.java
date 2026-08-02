package com.google.mlkit.common.sdkinternal.model;

/* loaded from: classes9.dex */
public class RemoteModelDownloadManager {
    private static final com.google.android.gms.common.internal.GmsLogger zza = new com.google.android.gms.common.internal.GmsLogger("ModelDownloadManager", "");
    private static final java.util.Map zzb = new java.util.HashMap();
    private final android.util.LongSparseArray zzc = new android.util.LongSparseArray();
    private final android.util.LongSparseArray zzd = new android.util.LongSparseArray();
    private final com.google.mlkit.common.sdkinternal.MlKitContext zze;
    private final android.app.DownloadManager zzf;
    private final com.google.mlkit.common.model.RemoteModel zzg;
    private final com.google.mlkit.common.sdkinternal.ModelType zzh;
    private final com.google.android.gms.internal.mlkit_common.zzsh zzi;
    private final com.google.mlkit.common.sdkinternal.SharedPrefManager zzj;
    private final com.google.mlkit.common.sdkinternal.model.ModelFileHelper zzk;
    private final com.google.mlkit.common.sdkinternal.model.ModelInfoRetrieverInterop zzl;
    private final com.google.mlkit.common.sdkinternal.model.RemoteModelFileManager zzm;
    private com.google.mlkit.common.model.DownloadConditions zzn;

    RemoteModelDownloadManager(com.google.mlkit.common.sdkinternal.MlKitContext mlKitContext, com.google.mlkit.common.model.RemoteModel remoteModel, com.google.mlkit.common.sdkinternal.model.ModelFileHelper modelFileHelper, com.google.mlkit.common.sdkinternal.model.RemoteModelFileManager remoteModelFileManager, com.google.mlkit.common.sdkinternal.model.ModelInfoRetrieverInterop modelInfoRetrieverInterop, com.google.android.gms.internal.mlkit_common.zzsh zzshVar) {
        this.zze = mlKitContext;
        this.zzh = remoteModel.getModelType();
        this.zzg = remoteModel;
        android.app.DownloadManager downloadManager = (android.app.DownloadManager) mlKitContext.getApplicationContext().getSystemService("download");
        this.zzf = downloadManager;
        this.zzi = zzshVar;
        if (downloadManager == null) {
            zza.d("ModelDownloadManager", "Download manager service is not available in the service.");
        }
        this.zzk = modelFileHelper;
        this.zzj = com.google.mlkit.common.sdkinternal.SharedPrefManager.getInstance(mlKitContext);
        this.zzl = modelInfoRetrieverInterop;
        this.zzm = remoteModelFileManager;
    }

    public static com.google.mlkit.common.sdkinternal.model.RemoteModelDownloadManager getInstance(com.google.mlkit.common.sdkinternal.MlKitContext mlKitContext, com.google.mlkit.common.model.RemoteModel remoteModel, com.google.mlkit.common.sdkinternal.model.ModelFileHelper modelFileHelper, com.google.mlkit.common.sdkinternal.model.RemoteModelFileManager remoteModelFileManager, com.google.mlkit.common.sdkinternal.model.ModelInfoRetrieverInterop modelInfoRetrieverInterop) {
        com.google.mlkit.common.sdkinternal.model.RemoteModelDownloadManager remoteModelDownloadManager;
        synchronized (com.google.mlkit.common.sdkinternal.model.RemoteModelDownloadManager.class) {
            java.util.Map map = zzb;
            if (!map.containsKey(remoteModel)) {
                map.put(remoteModel, new com.google.mlkit.common.sdkinternal.model.RemoteModelDownloadManager(mlKitContext, remoteModel, modelFileHelper, remoteModelFileManager, modelInfoRetrieverInterop, com.google.android.gms.internal.mlkit_common.zzss.zzb("common")));
            }
            remoteModelDownloadManager = (com.google.mlkit.common.sdkinternal.model.RemoteModelDownloadManager) map.get(remoteModel);
        }
        return remoteModelDownloadManager;
    }

    private final com.google.android.gms.tasks.Task zzj(long j) {
        com.google.mlkit.common.sdkinternal.MlKitContext mlKitContext = this.zze;
        androidx.core.content.ContextCompat.registerReceiver(mlKitContext.getApplicationContext(), zzm(j), new android.content.IntentFilter("android.intent.action.DOWNLOAD_COMPLETE"), null, com.google.mlkit.common.sdkinternal.MLTaskExecutor.getInstance().getHandler(), 2);
        return zzk(j).getTask();
    }

    private final com.google.android.gms.tasks.TaskCompletionSource zzk(long j) {
        synchronized (this) {
            com.google.android.gms.tasks.TaskCompletionSource taskCompletionSource = (com.google.android.gms.tasks.TaskCompletionSource) this.zzd.get(j);
            if (taskCompletionSource != null) {
                return taskCompletionSource;
            }
            com.google.android.gms.tasks.TaskCompletionSource taskCompletionSource2 = new com.google.android.gms.tasks.TaskCompletionSource();
            this.zzd.put(j, taskCompletionSource2);
            return taskCompletionSource2;
        }
    }

    private final com.google.mlkit.common.sdkinternal.model.zzc zzm(long j) {
        synchronized (this) {
            com.google.mlkit.common.sdkinternal.model.zzc zzcVar = (com.google.mlkit.common.sdkinternal.model.zzc) this.zzc.get(j);
            if (zzcVar != null) {
                return zzcVar;
            }
            com.google.mlkit.common.sdkinternal.model.zzc zzcVar2 = new com.google.mlkit.common.sdkinternal.model.zzc(this, j, zzk(j), null);
            this.zzc.put(j, zzcVar2);
            return zzcVar2;
        }
    }

    private final java.lang.Long zzn(android.app.DownloadManager.Request request, com.google.mlkit.common.sdkinternal.ModelInfo modelInfo) {
        synchronized (this) {
            android.app.DownloadManager downloadManager = this.zzf;
            if (downloadManager == null) {
                return null;
            }
            long enqueue = downloadManager.enqueue(request);
            com.google.android.gms.common.internal.GmsLogger gmsLogger = zza;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("Schedule a new downloading task: ");
            sb.append(enqueue);
            gmsLogger.d("ModelDownloadManager", sb.toString());
            this.zzj.setDownloadingModelInfo(enqueue, modelInfo);
            this.zzi.zzf(com.google.android.gms.internal.mlkit_common.zzsk.zzg(), this.zzg, com.google.android.gms.internal.mlkit_common.zzmu.NO_ERROR, false, modelInfo.getModelType(), com.google.android.gms.internal.mlkit_common.zzna.SCHEDULED);
            return java.lang.Long.valueOf(enqueue);
        }
    }

    private final java.lang.Long zzo(com.google.mlkit.common.sdkinternal.ModelInfo modelInfo, com.google.mlkit.common.model.DownloadConditions downloadConditions) throws com.google.mlkit.common.MlKitException {
        synchronized (this) {
            com.google.android.gms.common.internal.Preconditions.checkNotNull(downloadConditions, "DownloadConditions can not be null");
            java.lang.String downloadingModelHash = this.zzj.getDownloadingModelHash(this.zzg);
            java.lang.Integer downloadingModelStatusCode = getDownloadingModelStatusCode();
            if (downloadingModelHash != null && downloadingModelHash.equals(modelInfo.getModelHash()) && downloadingModelStatusCode != null) {
                java.lang.Integer downloadingModelStatusCode2 = getDownloadingModelStatusCode();
                if (downloadingModelStatusCode2 == null || (downloadingModelStatusCode2.intValue() != 8 && downloadingModelStatusCode2.intValue() != 16)) {
                    com.google.android.gms.internal.mlkit_common.zzsh zzshVar = this.zzi;
                    com.google.mlkit.common.model.RemoteModel remoteModel = this.zzg;
                    zzshVar.zzf(com.google.android.gms.internal.mlkit_common.zzsk.zzg(), remoteModel, com.google.android.gms.internal.mlkit_common.zzmu.NO_ERROR, false, remoteModel.getModelType(), com.google.android.gms.internal.mlkit_common.zzna.DOWNLOADING);
                }
                zza.d("ModelDownloadManager", "New model is already in downloading, do nothing.");
                return null;
            }
            com.google.android.gms.common.internal.GmsLogger gmsLogger = zza;
            gmsLogger.d("ModelDownloadManager", "Need to download a new model.");
            removeOrCancelDownload();
            android.app.DownloadManager.Request request = new android.app.DownloadManager.Request(modelInfo.getModelUri());
            if (this.zzk.modelExistsLocally(modelInfo.getModelNameForPersist(), modelInfo.getModelType())) {
                gmsLogger.d("ModelDownloadManager", "Model update is enabled and have a previous downloaded model, use download condition");
                this.zzi.zzf(com.google.android.gms.internal.mlkit_common.zzsk.zzg(), this.zzg, com.google.android.gms.internal.mlkit_common.zzmu.NO_ERROR, false, modelInfo.getModelType(), com.google.android.gms.internal.mlkit_common.zzna.UPDATE_AVAILABLE);
            }
            request.setRequiresCharging(downloadConditions.isChargingRequired());
            if (downloadConditions.isWifiRequired()) {
                request.setAllowedNetworkTypes(2);
            }
            return zzn(request, modelInfo);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:40:0x00ac, code lost:
    
        r1 = zzo(r1, r13.zzn);
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x00b2, code lost:
    
        if (r1 == null) goto L44;
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x00bc, code lost:
    
        return zzj(r1.longValue());
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x00bd, code lost:
    
        com.google.mlkit.common.sdkinternal.model.RemoteModelDownloadManager.zza.i("ModelDownloadManager", "Didn't schedule download for the updated model");
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public com.google.android.gms.tasks.Task<java.lang.Void> ensureModelDownloaded() {
        com.google.mlkit.common.MlKitException mlKitException;
        com.google.mlkit.common.sdkinternal.ModelInfo modelInfo;
        this.zzi.zzf(com.google.android.gms.internal.mlkit_common.zzsk.zzg(), this.zzg, com.google.android.gms.internal.mlkit_common.zzmu.NO_ERROR, false, com.google.mlkit.common.sdkinternal.ModelType.UNKNOWN, com.google.android.gms.internal.mlkit_common.zzna.EXPLICITLY_REQUESTED);
        java.lang.Long l = null;
        try {
            modelInfo = zzg();
            mlKitException = null;
        } catch (com.google.mlkit.common.MlKitException e) {
            mlKitException = e;
            modelInfo = null;
        }
        try {
            java.lang.Integer downloadingModelStatusCode = getDownloadingModelStatusCode();
            java.lang.Long downloadingId = getDownloadingId();
            if (!modelExistsLocally() && (downloadingModelStatusCode == null || downloadingModelStatusCode.intValue() != 8)) {
                if (downloadingModelStatusCode != null && downloadingModelStatusCode.intValue() == 16) {
                    com.google.mlkit.common.MlKitException zzl = zzl(downloadingId);
                    removeOrCancelDownload();
                    return com.google.android.gms.tasks.Tasks.forException(zzl);
                }
                if (downloadingModelStatusCode == null || (!(downloadingModelStatusCode.intValue() == 4 || downloadingModelStatusCode.intValue() == 2 || downloadingModelStatusCode.intValue() == 1) || downloadingId == null || getDownloadingModelHash() == null)) {
                    if (modelInfo != null) {
                        l = zzo(modelInfo, this.zzn);
                    }
                    return l == null ? com.google.android.gms.tasks.Tasks.forException(new com.google.mlkit.common.MlKitException("Failed to schedule the download task", 13, mlKitException)) : zzj(l.longValue());
                }
                com.google.android.gms.internal.mlkit_common.zzsh zzshVar = this.zzi;
                com.google.android.gms.internal.mlkit_common.zzry zzg = com.google.android.gms.internal.mlkit_common.zzsk.zzg();
                com.google.mlkit.common.model.RemoteModel remoteModel = this.zzg;
                zzshVar.zzf(zzg, remoteModel, com.google.android.gms.internal.mlkit_common.zzmu.NO_ERROR, false, remoteModel.getModelType(), com.google.android.gms.internal.mlkit_common.zzna.DOWNLOADING);
                return zzj(downloadingId.longValue());
            }
            return com.google.android.gms.tasks.Tasks.forResult(null);
        } catch (com.google.mlkit.common.MlKitException e2) {
            return com.google.android.gms.tasks.Tasks.forException(new com.google.mlkit.common.MlKitException("Failed to ensure the model is downloaded.", 13, e2));
        }
    }

    public android.os.ParcelFileDescriptor getDownloadedFile() {
        synchronized (this) {
            android.app.DownloadManager downloadManager = this.zzf;
            java.lang.Long downloadingId = getDownloadingId();
            android.os.ParcelFileDescriptor parcelFileDescriptor = null;
            if (downloadManager == null || downloadingId == null) {
                return null;
            }
            try {
                parcelFileDescriptor = downloadManager.openDownloadedFile(downloadingId.longValue());
            } catch (java.io.FileNotFoundException unused) {
                zza.e("ModelDownloadManager", "Downloaded file is not found");
            }
            return parcelFileDescriptor;
        }
    }

    public java.lang.Long getDownloadingId() {
        java.lang.Long downloadingModelId;
        synchronized (this) {
            downloadingModelId = this.zzj.getDownloadingModelId(this.zzg);
        }
        return downloadingModelId;
    }

    public java.lang.String getDownloadingModelHash() {
        java.lang.String downloadingModelHash;
        synchronized (this) {
            downloadingModelHash = this.zzj.getDownloadingModelHash(this.zzg);
        }
        return downloadingModelHash;
    }

    /* JADX WARN: Code restructure failed: missing block: B:22:0x0067, code lost:
    
        if (r3.intValue() != 16) goto L32;
     */
    /* JADX WARN: Removed duplicated region for block: B:10:0x003f  */
    /* JADX WARN: Removed duplicated region for block: B:12:0x0045 A[Catch: all -> 0x003a, TRY_ENTER, TryCatch #1 {all -> 0x003a, blocks: (B:37:0x0025, B:39:0x002b, B:12:0x0045, B:14:0x004c, B:16:0x0053, B:18:0x0059, B:20:0x0061), top: B:36:0x0025, outer: #2 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public java.lang.Integer getDownloadingModelStatusCode() {
        java.lang.Integer valueOf;
        synchronized (this) {
            android.app.DownloadManager downloadManager = this.zzf;
            java.lang.Long downloadingId = getDownloadingId();
            java.lang.Integer num = null;
            if (downloadManager != null && downloadingId != null) {
                android.database.Cursor query = downloadManager.query(new android.app.DownloadManager.Query().setFilterById(downloadingId.longValue()));
                if (query != null) {
                    try {
                        if (query.moveToFirst()) {
                            valueOf = java.lang.Integer.valueOf(query.getInt(query.getColumnIndex("status")));
                            if (valueOf == null) {
                                if (valueOf.intValue() != 2 && valueOf.intValue() != 4 && valueOf.intValue() != 1 && valueOf.intValue() != 8) {
                                }
                                num = valueOf;
                                query.close();
                                return num;
                            }
                            if (query != null) {
                                query.close();
                            }
                        }
                    } finally {
                    }
                }
                valueOf = null;
                if (valueOf == null) {
                }
            }
            return null;
        }
    }

    public boolean isModelDownloadedAndValid() throws com.google.mlkit.common.MlKitException {
        try {
            if (modelExistsLocally()) {
                return true;
            }
        } catch (com.google.mlkit.common.MlKitException unused) {
            zza.d("ModelDownloadManager", "Failed to check if the model exist locally.");
        }
        java.lang.Long downloadingId = getDownloadingId();
        java.lang.String downloadingModelHash = getDownloadingModelHash();
        if (downloadingId == null || downloadingModelHash == null) {
            zza.d("ModelDownloadManager", "No new model is downloading.");
            removeOrCancelDownload();
            return false;
        }
        java.lang.Integer downloadingModelStatusCode = getDownloadingModelStatusCode();
        zza.d("ModelDownloadManager", "Download Status code: ".concat(java.lang.String.valueOf(downloadingModelStatusCode)));
        if (downloadingModelStatusCode != null) {
            return com.google.android.gms.common.internal.Objects.equal(downloadingModelStatusCode, 8) && zzi(downloadingModelHash) != null;
        }
        removeOrCancelDownload();
        return false;
    }

    public boolean modelExistsLocally() throws com.google.mlkit.common.MlKitException {
        return this.zzk.modelExistsLocally(this.zzg.getUniqueModelNameForPersist(), this.zzh);
    }

    public void removeOrCancelDownload() throws com.google.mlkit.common.MlKitException {
        synchronized (this) {
            android.app.DownloadManager downloadManager = this.zzf;
            java.lang.Long downloadingId = getDownloadingId();
            if (downloadManager != null && downloadingId != null) {
                zza.d("ModelDownloadManager", "Cancel or remove existing downloading task: ".concat(downloadingId.toString()));
                if (this.zzf.remove(downloadingId.longValue()) > 0 || getDownloadingModelStatusCode() == null) {
                    com.google.mlkit.common.sdkinternal.model.ModelFileHelper modelFileHelper = this.zzk;
                    com.google.mlkit.common.model.RemoteModel remoteModel = this.zzg;
                    modelFileHelper.deleteTempFilesInPrivateFolder(remoteModel.getUniqueModelNameForPersist(), remoteModel.getModelType());
                    this.zzj.clearDownloadingModelInfo(this.zzg);
                }
            }
        }
    }

    public void setDownloadConditions(com.google.mlkit.common.model.DownloadConditions downloadConditions) {
        com.google.android.gms.common.internal.Preconditions.checkNotNull(downloadConditions, "DownloadConditions can not be null");
        this.zzn = downloadConditions;
    }

    public void updateLatestModelHashAndType(java.lang.String str) throws com.google.mlkit.common.MlKitException {
        synchronized (this) {
            this.zzj.setLatestModelHash(this.zzg, str);
            removeOrCancelDownload();
        }
    }

    final com.google.mlkit.common.sdkinternal.ModelInfo zzg() throws com.google.mlkit.common.MlKitException {
        boolean z;
        synchronized (this) {
            boolean modelExistsLocally = modelExistsLocally();
            if (modelExistsLocally) {
                com.google.android.gms.internal.mlkit_common.zzsh zzshVar = this.zzi;
                com.google.mlkit.common.model.RemoteModel remoteModel = this.zzg;
                zzshVar.zzf(com.google.android.gms.internal.mlkit_common.zzsk.zzg(), remoteModel, com.google.android.gms.internal.mlkit_common.zzmu.NO_ERROR, false, remoteModel.getModelType(), com.google.android.gms.internal.mlkit_common.zzna.LIVE);
            }
            com.google.mlkit.common.sdkinternal.model.ModelInfoRetrieverInterop modelInfoRetrieverInterop = this.zzl;
            if (modelInfoRetrieverInterop == null) {
                throw new com.google.mlkit.common.MlKitException("Please include com.google.mlkit:linkfirebase sdk as your dependency when you try to download from Firebase.", 14);
            }
            com.google.mlkit.common.sdkinternal.ModelInfo retrieveRemoteModelInfo = modelInfoRetrieverInterop.retrieveRemoteModelInfo(this.zzg);
            if (retrieveRemoteModelInfo == null) {
                return null;
            }
            com.google.mlkit.common.sdkinternal.MlKitContext mlKitContext = this.zze;
            com.google.mlkit.common.model.RemoteModel remoteModel2 = this.zzg;
            java.lang.String modelHash = retrieveRemoteModelInfo.getModelHash();
            com.google.mlkit.common.sdkinternal.SharedPrefManager sharedPrefManager = com.google.mlkit.common.sdkinternal.SharedPrefManager.getInstance(mlKitContext);
            boolean equals = modelHash.equals(sharedPrefManager.getIncompatibleModelHash(remoteModel2));
            boolean z2 = false;
            if (equals && com.google.mlkit.common.sdkinternal.CommonUtils.getAppVersion(mlKitContext.getApplicationContext()).equals(sharedPrefManager.getPreviousAppVersion())) {
                zza.e("ModelDownloadManager", "The model is incompatible with TFLite and the app is not upgraded, do not download");
                z = false;
            } else {
                z = true;
            }
            if (!modelExistsLocally) {
                this.zzj.clearLatestModelHash(this.zzg);
            }
            boolean equals2 = retrieveRemoteModelInfo.getModelHash().equals(com.google.mlkit.common.sdkinternal.SharedPrefManager.getInstance(this.zze).getLatestModelHash(this.zzg));
            if (!z) {
                z2 = !equals2;
            } else if (!modelExistsLocally || !equals2) {
                return retrieveRemoteModelInfo;
            }
            if (modelExistsLocally && (z2 ^ z)) {
                return null;
            }
            java.lang.String modelName = this.zzg.getModelName();
            java.lang.StringBuilder sb = new java.lang.StringBuilder("The model ");
            sb.append(modelName);
            sb.append(" is incompatible with TFLite runtime");
            throw new com.google.mlkit.common.MlKitException(sb.toString(), 100);
        }
    }

    public final java.io.File zzi(java.lang.String str) throws com.google.mlkit.common.MlKitException {
        com.google.android.gms.common.internal.GmsLogger gmsLogger = zza;
        gmsLogger.d("ModelDownloadManager", "Model downloaded successfully");
        this.zzi.zzf(com.google.android.gms.internal.mlkit_common.zzsk.zzg(), this.zzg, com.google.android.gms.internal.mlkit_common.zzmu.NO_ERROR, true, this.zzh, com.google.android.gms.internal.mlkit_common.zzna.SUCCEEDED);
        android.os.ParcelFileDescriptor downloadedFile = getDownloadedFile();
        if (downloadedFile == null) {
            removeOrCancelDownload();
            return null;
        }
        gmsLogger.d("ModelDownloadManager", "moving downloaded model from external storage to private folder.");
        try {
            return this.zzm.moveModelToPrivateFolder(downloadedFile, str, this.zzg);
        } finally {
            removeOrCancelDownload();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final com.google.mlkit.common.MlKitException zzl(java.lang.Long l) {
        android.app.DownloadManager downloadManager = this.zzf;
        android.database.Cursor cursor = null;
        if (downloadManager != null && l != null) {
            cursor = downloadManager.query(new android.app.DownloadManager.Query().setFilterById(l.longValue()));
        }
        int i = 13;
        java.lang.String str = "Model downloading failed";
        if (cursor != null && cursor.moveToFirst()) {
            int i2 = cursor.getInt(cursor.getColumnIndex("reason"));
            if (i2 == 1006) {
                str = "Model downloading failed due to insufficient space on the device.";
                i = 101;
            } else {
                java.lang.StringBuilder sb = new java.lang.StringBuilder("Model downloading failed due to error code: ");
                sb.append(i2);
                sb.append(" from Android DownloadManager");
                str = sb.toString();
            }
        }
        return new com.google.mlkit.common.MlKitException(str, i);
    }

    public int getFailureReason(java.lang.Long l) {
        int columnIndex;
        android.app.DownloadManager downloadManager = this.zzf;
        android.database.Cursor cursor = null;
        if (downloadManager != null && l != null) {
            cursor = downloadManager.query(new android.app.DownloadManager.Query().setFilterById(l.longValue()));
        }
        if (cursor == null || !cursor.moveToFirst() || (columnIndex = cursor.getColumnIndex("reason")) == -1) {
            return 0;
        }
        return cursor.getInt(columnIndex);
    }
}
