package com.google.mlkit.common.internal.model;

/* loaded from: classes9.dex */
public final class zza implements com.google.mlkit.common.sdkinternal.model.RemoteModelFileMover {
    private static final com.google.android.gms.common.internal.GmsLogger zza = new com.google.android.gms.common.internal.GmsLogger("CustomModelFileMover", "");
    private final java.lang.String zzb;
    private final com.google.mlkit.common.sdkinternal.model.ModelFileHelper zzc;

    public zza(com.google.mlkit.common.sdkinternal.MlKitContext mlKitContext, java.lang.String str) {
        this.zzb = str;
        this.zzc = new com.google.mlkit.common.sdkinternal.model.ModelFileHelper(mlKitContext);
    }

    private static boolean zza(java.io.File file, java.io.File file2) {
        java.lang.String absolutePath = file.getAbsolutePath();
        java.lang.String absolutePath2 = file2.getAbsolutePath();
        if (file.renameTo(file2)) {
            zza.d("CustomModelFileMover", java.lang.String.format("Moved file from %s to %s successfully", absolutePath, absolutePath2));
            file2.setExecutable(false);
            file2.setWritable(false);
            return true;
        }
        com.google.android.gms.common.internal.GmsLogger gmsLogger = zza;
        gmsLogger.d("CustomModelFileMover", java.lang.String.format("Move file to %s failed, remove the temp file %s.", absolutePath2, absolutePath));
        if (!file.delete()) {
            gmsLogger.d("CustomModelFileMover", "Failed to delete the temp file: ".concat(java.lang.String.valueOf(absolutePath)));
        }
        return false;
    }

    @Override // com.google.mlkit.common.sdkinternal.model.RemoteModelFileMover
    public final java.io.File getModelFileDestination() throws com.google.mlkit.common.MlKitException {
        java.io.File modelDir = this.zzc.getModelDir(this.zzb, com.google.mlkit.common.sdkinternal.ModelType.CUSTOM);
        return new java.io.File(new java.io.File(modelDir, java.lang.String.valueOf(this.zzc.getLatestCachedModelVersion(modelDir) + 1)), com.google.mlkit.common.sdkinternal.Constants.MODEL_FILE_NAME);
    }

    @Override // com.google.mlkit.common.sdkinternal.model.RemoteModelFileMover
    public final java.io.File moveAllFilesFromPrivateTempToPrivateDestination(java.io.File file) throws com.google.mlkit.common.MlKitException {
        java.io.File file2;
        java.io.File modelDir = this.zzc.getModelDir(this.zzb, com.google.mlkit.common.sdkinternal.ModelType.CUSTOM);
        java.io.File file3 = new java.io.File(new java.io.File(modelDir, java.lang.String.valueOf(this.zzc.getLatestCachedModelVersion(modelDir) + 1)), com.google.mlkit.common.sdkinternal.Constants.MODEL_FILE_NAME);
        java.io.File parentFile = file3.getParentFile();
        if (parentFile != null && !parentFile.exists()) {
            ((java.io.File) com.google.android.gms.common.internal.Preconditions.checkNotNull(parentFile)).mkdirs();
        }
        java.io.File file4 = null;
        if (!zza(file, file3)) {
            return null;
        }
        java.io.File tempFileInPrivateFolder = this.zzc.getTempFileInPrivateFolder(this.zzb, com.google.mlkit.common.sdkinternal.ModelType.CUSTOM, com.google.mlkit.common.sdkinternal.Constants.AUTOML_IMAGE_LABELING_LABELS_FILE_NAME);
        if (tempFileInPrivateFolder.exists()) {
            file2 = new java.io.File(parentFile, com.google.mlkit.common.sdkinternal.Constants.AUTOML_IMAGE_LABELING_LABELS_FILE_NAME);
            if (!zza(tempFileInPrivateFolder, file2)) {
                return null;
            }
        } else {
            file2 = null;
        }
        java.io.File tempFileInPrivateFolder2 = this.zzc.getTempFileInPrivateFolder(this.zzb, com.google.mlkit.common.sdkinternal.ModelType.CUSTOM, com.google.mlkit.common.sdkinternal.Constants.AUTOML_IMAGE_LABELING_MANIFEST_JSON_FILE_NAME);
        if (tempFileInPrivateFolder2.exists()) {
            java.io.File file5 = new java.io.File(parentFile, com.google.mlkit.common.sdkinternal.Constants.AUTOML_IMAGE_LABELING_MANIFEST_JSON_FILE_NAME);
            if (!zza(tempFileInPrivateFolder2, file5)) {
                return null;
            }
            file4 = file5;
        }
        return (file2 == null && file4 == null) ? file3 : parentFile;
    }
}
