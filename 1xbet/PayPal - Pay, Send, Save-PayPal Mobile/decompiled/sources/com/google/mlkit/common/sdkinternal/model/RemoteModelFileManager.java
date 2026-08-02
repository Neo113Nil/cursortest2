package com.google.mlkit.common.sdkinternal.model;

/* loaded from: classes9.dex */
public class RemoteModelFileManager {
    private static final com.google.android.gms.common.internal.GmsLogger zza = new com.google.android.gms.common.internal.GmsLogger("RemoteModelFileManager", "");
    private final com.google.mlkit.common.sdkinternal.MlKitContext zzb;
    private final java.lang.String zzc;
    private final com.google.mlkit.common.sdkinternal.ModelType zzd;
    private final com.google.mlkit.common.sdkinternal.model.ModelValidator zze;
    private final com.google.mlkit.common.sdkinternal.model.RemoteModelFileMover zzf;
    private final com.google.mlkit.common.sdkinternal.SharedPrefManager zzg;
    private final com.google.mlkit.common.sdkinternal.model.ModelFileHelper zzh;

    public RemoteModelFileManager(com.google.mlkit.common.sdkinternal.MlKitContext mlKitContext, com.google.mlkit.common.model.RemoteModel remoteModel, com.google.mlkit.common.sdkinternal.model.ModelValidator modelValidator, com.google.mlkit.common.sdkinternal.model.ModelFileHelper modelFileHelper, com.google.mlkit.common.sdkinternal.model.RemoteModelFileMover remoteModelFileMover) {
        this.zzb = mlKitContext;
        com.google.mlkit.common.sdkinternal.ModelType modelType = remoteModel.getModelType();
        this.zzd = modelType;
        this.zzc = modelType == com.google.mlkit.common.sdkinternal.ModelType.TRANSLATE ? remoteModel.getModelNameForBackend() : remoteModel.getUniqueModelNameForPersist();
        this.zze = modelValidator;
        this.zzg = com.google.mlkit.common.sdkinternal.SharedPrefManager.getInstance(mlKitContext);
        this.zzh = modelFileHelper;
        this.zzf = remoteModelFileMover;
    }

    public java.io.File getModelDirUnsafe(boolean z) {
        return this.zzh.getModelDirUnsafe(this.zzc, this.zzd, z);
    }

    /* JADX WARN: Code restructure failed: missing block: B:36:0x0098, code lost:
    
        com.google.mlkit.common.sdkinternal.model.RemoteModelFileManager.zza.d("RemoteModelFileManager", "Hash does not match with expected: ".concat(java.lang.String.valueOf(r11)));
        com.google.android.gms.internal.mlkit_common.zzss.zzb("common").zzf(com.google.android.gms.internal.mlkit_common.zzsk.zzg(), r12, com.google.android.gms.internal.mlkit_common.zzmu.MODEL_HASH_MISMATCH, true, r9.zzd, com.google.android.gms.internal.mlkit_common.zzna.SUCCEEDED);
        r10 = new com.google.mlkit.common.MlKitException("Hash does not match with expected", 102);
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public java.io.File moveModelToPrivateFolder(android.os.ParcelFileDescriptor parcelFileDescriptor, java.lang.String str, com.google.mlkit.common.model.RemoteModel remoteModel) throws com.google.mlkit.common.MlKitException {
        java.io.File moveAllFilesFromPrivateTempToPrivateDestination;
        com.google.mlkit.common.sdkinternal.model.ModelValidator modelValidator;
        synchronized (this) {
            java.io.File file = new java.io.File(this.zzh.zza(this.zzc, this.zzd), "to_be_validated_model.tmp");
            com.google.mlkit.common.sdkinternal.model.ModelValidator.ValidationResult validationResult = null;
            try {
                android.os.ParcelFileDescriptor.AutoCloseInputStream autoCloseInputStream = new android.os.ParcelFileDescriptor.AutoCloseInputStream(parcelFileDescriptor);
                try {
                    java.io.FileOutputStream fileOutputStream = new java.io.FileOutputStream(file);
                    try {
                        byte[] bArr = new byte[4096];
                        while (true) {
                            int read = autoCloseInputStream.read(bArr);
                            if (read == -1) {
                                break;
                            }
                            fileOutputStream.write(bArr, 0, read);
                        }
                        fileOutputStream.getFD().sync();
                        fileOutputStream.close();
                        autoCloseInputStream.close();
                        boolean zza2 = com.google.mlkit.common.internal.model.ModelUtils.zza(file, str);
                        if (zza2 && (modelValidator = this.zze) != null) {
                            validationResult = modelValidator.validateModel(file, remoteModel);
                            if (validationResult.getErrorCode().equals(com.google.mlkit.common.sdkinternal.model.ModelValidator.ValidationResult.ErrorCode.TFLITE_VERSION_INCOMPATIBLE)) {
                                java.lang.String appVersion = com.google.mlkit.common.sdkinternal.CommonUtils.getAppVersion(this.zzb.getApplicationContext());
                                this.zzg.setIncompatibleModelInfo(remoteModel, str, appVersion);
                                java.lang.String valueOf = java.lang.String.valueOf(str);
                                com.google.android.gms.common.internal.GmsLogger gmsLogger = zza;
                                gmsLogger.d("RemoteModelFileManager", "Model is not compatible. Model hash: ".concat(valueOf));
                                gmsLogger.d("RemoteModelFileManager", "The current app version is: ".concat(java.lang.String.valueOf(appVersion)));
                            }
                        }
                        if (zza2 && (validationResult == null || validationResult.isValid())) {
                            moveAllFilesFromPrivateTempToPrivateDestination = this.zzf.moveAllFilesFromPrivateTempToPrivateDestination(file);
                        }
                        com.google.mlkit.common.MlKitException mlKitException = new com.google.mlkit.common.MlKitException("Model is not compatible with TFLite run time", 100);
                        if (file.delete()) {
                            throw mlKitException;
                        }
                        zza.d("RemoteModelFileManager", "Failed to delete the temp file: ".concat(java.lang.String.valueOf(file.getAbsolutePath())));
                        throw mlKitException;
                    } finally {
                    }
                } catch (java.lang.Throwable th) {
                    try {
                        autoCloseInputStream.close();
                    } catch (java.lang.Throwable th2) {
                        th.addSuppressed(th2);
                    }
                    throw th;
                }
            } catch (java.io.IOException e) {
                zza.e("RemoteModelFileManager", "Failed to copy downloaded model file to private folder: ".concat(e.toString()));
                return null;
            }
        }
        return moveAllFilesFromPrivateTempToPrivateDestination;
    }

    public final java.io.File zza(java.io.File file) throws com.google.mlkit.common.MlKitException {
        synchronized (this) {
            java.io.File file2 = new java.io.File(java.lang.String.valueOf(this.zzh.getModelDir(this.zzc, this.zzd).getAbsolutePath()).concat("/0"));
            if (file2.exists()) {
                return file;
            }
            return file.renameTo(file2) ? file2 : file;
        }
    }

    public final java.lang.String zzb() throws com.google.mlkit.common.MlKitException {
        java.lang.String zzb;
        synchronized (this) {
            zzb = this.zzh.zzb(this.zzc, this.zzd);
        }
        return zzb;
    }

    public final void zzc(java.io.File file) {
        java.io.File[] listFiles;
        synchronized (this) {
            java.io.File modelDirUnsafe = getModelDirUnsafe(false);
            if (modelDirUnsafe.exists() && (listFiles = modelDirUnsafe.listFiles()) != null) {
                for (java.io.File file2 : listFiles) {
                    if (file2.equals(file)) {
                        this.zzh.deleteRecursively(file);
                        return;
                    }
                }
            }
        }
    }

    public final boolean zzd(java.io.File file) throws com.google.mlkit.common.MlKitException {
        synchronized (this) {
            java.io.File modelDir = this.zzh.getModelDir(this.zzc, this.zzd);
            if (!modelDir.exists()) {
                return false;
            }
            java.io.File[] listFiles = modelDir.listFiles();
            boolean z = true;
            if (listFiles == null) {
                return true;
            }
            for (java.io.File file2 : listFiles) {
                if (!file2.equals(file) && !this.zzh.deleteRecursively(file2)) {
                    z = false;
                }
            }
            return z;
        }
    }
}
