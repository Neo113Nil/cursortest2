package com.google.mlkit.common.sdkinternal.model;

/* loaded from: classes9.dex */
public class CustomModelLoader {
    private static final com.google.android.gms.common.internal.GmsLogger zza = new com.google.android.gms.common.internal.GmsLogger("CustomModelLoader", "");
    private static final java.util.Map zzb = new java.util.HashMap();
    private final com.google.mlkit.common.sdkinternal.MlKitContext zzc;
    private final com.google.mlkit.common.model.LocalModel zzd;
    private final com.google.mlkit.common.model.CustomRemoteModel zze;
    private final com.google.mlkit.common.sdkinternal.model.RemoteModelDownloadManager zzf;
    private final com.google.mlkit.common.sdkinternal.model.RemoteModelFileManager zzg;
    private final com.google.android.gms.internal.mlkit_common.zzsh zzh;
    private boolean zzi;

    public interface CustomModelLoaderHelper {
        void logLoad() throws com.google.mlkit.common.MlKitException;

        boolean tryLoad(com.google.mlkit.common.model.LocalModel localModel) throws com.google.mlkit.common.MlKitException;
    }

    private CustomModelLoader(com.google.mlkit.common.sdkinternal.MlKitContext mlKitContext, com.google.mlkit.common.model.LocalModel localModel, com.google.mlkit.common.model.CustomRemoteModel customRemoteModel) {
        if (customRemoteModel != null) {
            com.google.mlkit.common.sdkinternal.model.RemoteModelFileManager remoteModelFileManager = new com.google.mlkit.common.sdkinternal.model.RemoteModelFileManager(mlKitContext, customRemoteModel, null, new com.google.mlkit.common.sdkinternal.model.ModelFileHelper(mlKitContext), new com.google.mlkit.common.internal.model.zza(mlKitContext, customRemoteModel.getUniqueModelNameForPersist()));
            this.zzg = remoteModelFileManager;
            this.zzf = com.google.mlkit.common.sdkinternal.model.RemoteModelDownloadManager.getInstance(mlKitContext, customRemoteModel, new com.google.mlkit.common.sdkinternal.model.ModelFileHelper(mlKitContext), remoteModelFileManager, (com.google.mlkit.common.sdkinternal.model.ModelInfoRetrieverInterop) mlKitContext.get(com.google.mlkit.common.sdkinternal.model.ModelInfoRetrieverInterop.class));
            this.zzi = true;
        } else {
            this.zzg = null;
            this.zzf = null;
        }
        this.zzc = mlKitContext;
        this.zzd = localModel;
        this.zze = customRemoteModel;
        this.zzh = com.google.android.gms.internal.mlkit_common.zzss.zzb("common");
    }

    public static com.google.mlkit.common.sdkinternal.model.CustomModelLoader getInstance(com.google.mlkit.common.sdkinternal.MlKitContext mlKitContext, com.google.mlkit.common.model.LocalModel localModel, com.google.mlkit.common.model.CustomRemoteModel customRemoteModel) {
        com.google.mlkit.common.sdkinternal.model.CustomModelLoader customModelLoader;
        synchronized (com.google.mlkit.common.sdkinternal.model.CustomModelLoader.class) {
            java.lang.String obj = customRemoteModel == null ? ((com.google.mlkit.common.model.LocalModel) com.google.android.gms.common.internal.Preconditions.checkNotNull(localModel)).toString() : customRemoteModel.getUniqueModelNameForPersist();
            java.util.Map map = zzb;
            if (!map.containsKey(obj)) {
                map.put(obj, new com.google.mlkit.common.sdkinternal.model.CustomModelLoader(mlKitContext, localModel, customRemoteModel));
            }
            customModelLoader = (com.google.mlkit.common.sdkinternal.model.CustomModelLoader) map.get(obj);
        }
        return customModelLoader;
    }

    private final java.io.File zza() throws com.google.mlkit.common.MlKitException {
        java.lang.String zzb2 = ((com.google.mlkit.common.sdkinternal.model.RemoteModelFileManager) com.google.android.gms.common.internal.Preconditions.checkNotNull(this.zzg)).zzb();
        if (zzb2 == null) {
            zza.d("CustomModelLoader", "No existing model file");
            return null;
        }
        java.io.File file = new java.io.File(zzb2);
        java.io.File[] listFiles = file.listFiles();
        return ((java.io.File[]) com.google.android.gms.common.internal.Preconditions.checkNotNull(listFiles)).length == 1 ? listFiles[0] : file;
    }

    private final void zzb() throws com.google.mlkit.common.MlKitException {
        ((com.google.mlkit.common.sdkinternal.model.RemoteModelDownloadManager) com.google.android.gms.common.internal.Preconditions.checkNotNull(this.zzf)).removeOrCancelDownload();
    }

    private static final com.google.mlkit.common.model.LocalModel zzc(java.io.File file) {
        if (file.isDirectory()) {
            com.google.mlkit.common.model.LocalModel.Builder builder = new com.google.mlkit.common.model.LocalModel.Builder();
            builder.setAbsoluteManifestFilePath(new java.io.File(file.getAbsolutePath(), com.google.mlkit.common.sdkinternal.Constants.AUTOML_IMAGE_LABELING_MANIFEST_JSON_FILE_NAME).toString());
            return builder.build();
        }
        com.google.mlkit.common.model.LocalModel.Builder builder2 = new com.google.mlkit.common.model.LocalModel.Builder();
        builder2.setAbsoluteFilePath(file.getAbsolutePath());
        return builder2.build();
    }

    public com.google.mlkit.common.model.LocalModel createLocalModelByLatestExistingModel() throws com.google.mlkit.common.MlKitException {
        synchronized (this) {
            zza.d("CustomModelLoader", "Try to get the latest existing model file.");
            java.io.File zza2 = zza();
            if (zza2 == null) {
                return null;
            }
            return zzc(zza2);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0096 A[DONT_GENERATE] */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0098 A[Catch: all -> 0x009e, TRY_ENTER, TRY_LEAVE, TryCatch #0 {, blocks: (B:3:0x0001, B:6:0x0021, B:8:0x0029, B:14:0x0098, B:18:0x002d, B:20:0x0044, B:22:0x004c, B:23:0x0065, B:25:0x006d, B:26:0x0089), top: B:2:0x0001 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public com.google.mlkit.common.model.LocalModel createLocalModelByNewlyDownloadedModel() throws com.google.mlkit.common.MlKitException {
        java.io.File file;
        synchronized (this) {
            com.google.android.gms.common.internal.GmsLogger gmsLogger = zza;
            gmsLogger.d("CustomModelLoader", "Try to get newly downloaded model file.");
            java.lang.Long downloadingId = ((com.google.mlkit.common.sdkinternal.model.RemoteModelDownloadManager) com.google.android.gms.common.internal.Preconditions.checkNotNull(this.zzf)).getDownloadingId();
            java.lang.String downloadingModelHash = this.zzf.getDownloadingModelHash();
            if (downloadingId == null || downloadingModelHash == null) {
                gmsLogger.d("CustomModelLoader", "No new model is downloading.");
                zzb();
            } else {
                java.lang.Integer downloadingModelStatusCode = this.zzf.getDownloadingModelStatusCode();
                if (downloadingModelStatusCode == null) {
                    zzb();
                } else {
                    gmsLogger.d("CustomModelLoader", "Download Status code: ".concat(downloadingModelStatusCode.toString()));
                    if (downloadingModelStatusCode.intValue() == 8) {
                        file = this.zzf.zzi(downloadingModelHash);
                        if (file != null) {
                            gmsLogger.d("CustomModelLoader", "Moved the downloaded model to private folder successfully: ".concat(java.lang.String.valueOf(file.getParent())));
                            this.zzf.updateLatestModelHashAndType(downloadingModelHash);
                            if (file != null) {
                                return null;
                            }
                            return zzc(file);
                        }
                    } else if (downloadingModelStatusCode.intValue() == 16) {
                        this.zzh.zze(com.google.android.gms.internal.mlkit_common.zzsk.zzg(), (com.google.mlkit.common.model.RemoteModel) com.google.android.gms.common.internal.Preconditions.checkNotNull(this.zze), false, this.zzf.getFailureReason(downloadingId));
                        zzb();
                    }
                }
            }
            file = null;
            if (file != null) {
            }
        }
    }

    public void deleteLatestExistingModel() throws com.google.mlkit.common.MlKitException {
        java.io.File zza2 = zza();
        if (zza2 != null) {
            ((com.google.mlkit.common.sdkinternal.model.RemoteModelFileManager) com.google.android.gms.common.internal.Preconditions.checkNotNull(this.zzg)).zzc(zza2);
            com.google.mlkit.common.sdkinternal.SharedPrefManager.getInstance(this.zzc).clearLatestModelHash((com.google.mlkit.common.model.RemoteModel) com.google.android.gms.common.internal.Preconditions.checkNotNull(this.zze));
        }
    }

    public void deleteOldModels(com.google.mlkit.common.model.LocalModel localModel) throws com.google.mlkit.common.MlKitException {
        java.io.File parentFile = new java.io.File((java.lang.String) com.google.android.gms.common.internal.Preconditions.checkNotNull(localModel.getAbsoluteFilePath())).getParentFile();
        if (!((com.google.mlkit.common.sdkinternal.model.RemoteModelFileManager) com.google.android.gms.common.internal.Preconditions.checkNotNull(this.zzg)).zzd((java.io.File) com.google.android.gms.common.internal.Preconditions.checkNotNull(parentFile))) {
            zza.e("CustomModelLoader", "Failed to delete old models");
        } else {
            zza.d("CustomModelLoader", "All old models are deleted.");
            this.zzg.zza(parentFile);
        }
    }

    public void load(com.google.mlkit.common.sdkinternal.model.CustomModelLoader.CustomModelLoaderHelper customModelLoaderHelper) throws com.google.mlkit.common.MlKitException {
        synchronized (this) {
            com.google.mlkit.common.model.LocalModel localModel = this.zzd;
            if (localModel == null) {
                localModel = createLocalModelByNewlyDownloadedModel();
            }
            if (localModel == null) {
                localModel = createLocalModelByLatestExistingModel();
            }
            if (localModel == null) {
                throw new com.google.mlkit.common.MlKitException("Model is not available.", 14);
            }
            while (!customModelLoaderHelper.tryLoad(localModel)) {
                if (this.zze != null) {
                    deleteLatestExistingModel();
                    localModel = createLocalModelByLatestExistingModel();
                } else {
                    localModel = null;
                }
                if (localModel == null) {
                    customModelLoaderHelper.logLoad();
                    return;
                }
            }
            if (this.zze != null && this.zzi) {
                deleteOldModels((com.google.mlkit.common.model.LocalModel) com.google.android.gms.common.internal.Preconditions.checkNotNull(localModel));
                this.zzi = false;
            }
            customModelLoaderHelper.logLoad();
        }
    }
}
