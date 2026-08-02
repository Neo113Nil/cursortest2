package com.google.mlkit.common.sdkinternal.model;

/* loaded from: classes9.dex */
public class RemoteModelLoader {
    private static final com.google.android.gms.common.internal.GmsLogger zza = new com.google.android.gms.common.internal.GmsLogger("RemoteModelLoader", "");
    private static final java.util.Map zzb = new java.util.HashMap();
    private final com.google.mlkit.common.sdkinternal.MlKitContext zzc;
    private final com.google.mlkit.common.model.RemoteModel zzd;
    private final com.google.mlkit.common.sdkinternal.model.RemoteModelDownloadManager zze;
    private final com.google.mlkit.common.sdkinternal.model.RemoteModelFileManager zzf;
    private final com.google.mlkit.common.sdkinternal.model.RemoteModelLoaderHelper zzg;
    private final com.google.android.gms.internal.mlkit_common.zzsh zzh;
    private boolean zzi;

    private RemoteModelLoader(com.google.mlkit.common.sdkinternal.MlKitContext mlKitContext, com.google.mlkit.common.model.RemoteModel remoteModel, com.google.mlkit.common.sdkinternal.model.ModelValidator modelValidator, com.google.mlkit.common.sdkinternal.model.RemoteModelLoaderHelper remoteModelLoaderHelper, com.google.mlkit.common.sdkinternal.model.RemoteModelFileMover remoteModelFileMover) {
        com.google.mlkit.common.sdkinternal.model.RemoteModelFileManager remoteModelFileManager = new com.google.mlkit.common.sdkinternal.model.RemoteModelFileManager(mlKitContext, remoteModel, modelValidator, new com.google.mlkit.common.sdkinternal.model.ModelFileHelper(mlKitContext), remoteModelFileMover);
        this.zzf = remoteModelFileManager;
        this.zzi = true;
        this.zze = com.google.mlkit.common.sdkinternal.model.RemoteModelDownloadManager.getInstance(mlKitContext, remoteModel, new com.google.mlkit.common.sdkinternal.model.ModelFileHelper(mlKitContext), remoteModelFileManager, (com.google.mlkit.common.sdkinternal.model.ModelInfoRetrieverInterop) mlKitContext.get(com.google.mlkit.common.sdkinternal.model.ModelInfoRetrieverInterop.class));
        this.zzg = remoteModelLoaderHelper;
        this.zzc = mlKitContext;
        this.zzd = remoteModel;
        this.zzh = com.google.android.gms.internal.mlkit_common.zzss.zzb("common");
    }

    public static com.google.mlkit.common.sdkinternal.model.RemoteModelLoader getInstance(com.google.mlkit.common.sdkinternal.MlKitContext mlKitContext, com.google.mlkit.common.model.RemoteModel remoteModel, com.google.mlkit.common.sdkinternal.model.ModelValidator modelValidator, com.google.mlkit.common.sdkinternal.model.RemoteModelLoaderHelper remoteModelLoaderHelper, com.google.mlkit.common.sdkinternal.model.RemoteModelFileMover remoteModelFileMover) {
        com.google.mlkit.common.sdkinternal.model.RemoteModelLoader remoteModelLoader;
        synchronized (com.google.mlkit.common.sdkinternal.model.RemoteModelLoader.class) {
            java.lang.String uniqueModelNameForPersist = remoteModel.getUniqueModelNameForPersist();
            java.util.Map map = zzb;
            if (!map.containsKey(uniqueModelNameForPersist)) {
                map.put(uniqueModelNameForPersist, new com.google.mlkit.common.sdkinternal.model.RemoteModelLoader(mlKitContext, remoteModel, modelValidator, remoteModelLoaderHelper, remoteModelFileMover));
            }
            remoteModelLoader = (com.google.mlkit.common.sdkinternal.model.RemoteModelLoader) map.get(uniqueModelNameForPersist);
        }
        return remoteModelLoader;
    }

    private final java.nio.MappedByteBuffer zza(java.lang.String str) throws com.google.mlkit.common.MlKitException {
        return this.zzg.loadModelAtPath(str);
    }

    private final java.nio.MappedByteBuffer zzb(java.io.File file) throws com.google.mlkit.common.MlKitException {
        try {
            return zza(file.getAbsolutePath());
        } catch (java.lang.Exception e) {
            this.zzf.zzc(file);
            throw new com.google.mlkit.common.MlKitException("Failed to load newly downloaded model.", 14, e);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x00b0 A[Catch: all -> 0x00f1, TryCatch #0 {, blocks: (B:3:0x0001, B:6:0x001c, B:8:0x0024, B:11:0x00b0, B:13:0x00bf, B:18:0x00c7, B:21:0x00cd, B:22:0x00eb, B:23:0x00ec, B:25:0x002b, B:27:0x0042, B:29:0x004a, B:31:0x0068, B:33:0x0070, B:34:0x0082, B:36:0x008a, B:37:0x00a1), top: B:2:0x0001, inners: #1 }] */
    /* JADX WARN: Removed duplicated region for block: B:23:0x00ec A[Catch: all -> 0x00f1, TRY_LEAVE, TryCatch #0 {, blocks: (B:3:0x0001, B:6:0x001c, B:8:0x0024, B:11:0x00b0, B:13:0x00bf, B:18:0x00c7, B:21:0x00cd, B:22:0x00eb, B:23:0x00ec, B:25:0x002b, B:27:0x0042, B:29:0x004a, B:31:0x0068, B:33:0x0070, B:34:0x0082, B:36:0x008a, B:37:0x00a1), top: B:2:0x0001, inners: #1 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public java.nio.MappedByteBuffer load() throws com.google.mlkit.common.MlKitException {
        java.nio.MappedByteBuffer mappedByteBuffer;
        java.nio.MappedByteBuffer mappedByteBuffer2;
        synchronized (this) {
            com.google.android.gms.common.internal.GmsLogger gmsLogger = zza;
            gmsLogger.d("RemoteModelLoader", "Try to load newly downloaded model file.");
            com.google.mlkit.common.sdkinternal.model.RemoteModelDownloadManager remoteModelDownloadManager = this.zze;
            boolean z = this.zzi;
            java.lang.Long downloadingId = remoteModelDownloadManager.getDownloadingId();
            java.lang.String downloadingModelHash = remoteModelDownloadManager.getDownloadingModelHash();
            mappedByteBuffer = null;
            if (downloadingId == null || downloadingModelHash == null) {
                gmsLogger.d("RemoteModelLoader", "No new model is downloading.");
                this.zze.removeOrCancelDownload();
            } else {
                java.lang.Integer downloadingModelStatusCode = this.zze.getDownloadingModelStatusCode();
                if (downloadingModelStatusCode == null) {
                    this.zze.removeOrCancelDownload();
                } else {
                    gmsLogger.d("RemoteModelLoader", "Download Status code: ".concat(downloadingModelStatusCode.toString()));
                    if (downloadingModelStatusCode.intValue() == 8) {
                        java.io.File zzi = this.zze.zzi(downloadingModelHash);
                        if (zzi != null) {
                            mappedByteBuffer2 = zzb(zzi);
                            gmsLogger.d("RemoteModelLoader", "Moved the downloaded model to private folder successfully: ".concat(java.lang.String.valueOf(zzi.getParent())));
                            this.zze.updateLatestModelHashAndType(downloadingModelHash);
                            if (z && this.zzf.zzd(zzi)) {
                                gmsLogger.d("RemoteModelLoader", "All old models are deleted.");
                                mappedByteBuffer2 = zzb(this.zzf.zza(zzi));
                            }
                            if (mappedByteBuffer2 != null) {
                                gmsLogger.d("RemoteModelLoader", "Loading existing model file.");
                                java.lang.String zzb2 = this.zzf.zzb();
                                if (zzb2 == null) {
                                    gmsLogger.d("RemoteModelLoader", "No existing model file");
                                } else {
                                    try {
                                        mappedByteBuffer = zza(zzb2);
                                    } catch (java.lang.Exception e) {
                                        this.zzf.zzc(new java.io.File(zzb2));
                                        com.google.mlkit.common.sdkinternal.SharedPrefManager.getInstance(this.zzc).clearLatestModelHash(this.zzd);
                                        throw new com.google.mlkit.common.MlKitException("Failed to load an already downloaded model.", 14, e);
                                    }
                                }
                            } else {
                                this.zzi = false;
                                mappedByteBuffer = mappedByteBuffer2;
                            }
                        }
                    } else if (downloadingModelStatusCode.intValue() == 16) {
                        this.zzh.zze(com.google.android.gms.internal.mlkit_common.zzsk.zzg(), this.zzd, false, this.zze.getFailureReason(downloadingId));
                        this.zze.removeOrCancelDownload();
                    }
                }
            }
            mappedByteBuffer2 = null;
            if (mappedByteBuffer2 != null) {
            }
        }
        return mappedByteBuffer;
    }

    public com.google.mlkit.common.model.RemoteModel getRemoteModel() {
        return this.zzd;
    }
}
