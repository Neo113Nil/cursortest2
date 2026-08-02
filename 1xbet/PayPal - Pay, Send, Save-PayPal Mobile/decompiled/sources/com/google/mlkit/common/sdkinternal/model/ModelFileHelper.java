package com.google.mlkit.common.sdkinternal.model;

/* loaded from: classes9.dex */
public class ModelFileHelper {
    public static final int INVALID_INDEX = -1;
    private final com.google.mlkit.common.sdkinternal.MlKitContext zze;
    private static final com.google.android.gms.common.internal.GmsLogger zzd = new com.google.android.gms.common.internal.GmsLogger("ModelFileHelper", "");
    public static final java.lang.String zza = java.lang.String.format("com.google.mlkit.%s.models", "translate");
    public static final java.lang.String zzb = java.lang.String.format("com.google.mlkit.%s.models", io.reactivex.annotations.SchedulerSupport.CUSTOM);
    static final java.lang.String zzc = java.lang.String.format("com.google.mlkit.%s.models", "base");

    private final java.io.File zzc(java.lang.String str, com.google.mlkit.common.sdkinternal.ModelType modelType, boolean z) throws com.google.mlkit.common.MlKitException {
        java.io.File modelDirUnsafe = getModelDirUnsafe(str, modelType, z);
        if (!modelDirUnsafe.exists()) {
            zzd.d("ModelFileHelper", "model folder does not exist, creating one: ".concat(java.lang.String.valueOf(modelDirUnsafe.getAbsolutePath())));
            if (!modelDirUnsafe.mkdirs()) {
                throw new com.google.mlkit.common.MlKitException("Failed to create model folder: ".concat(java.lang.String.valueOf(java.lang.String.valueOf(modelDirUnsafe))), 13);
            }
        } else if (!modelDirUnsafe.isDirectory()) {
            throw new com.google.mlkit.common.MlKitException("Can not create model folder, since an existing file has the same name: ".concat(java.lang.String.valueOf(java.lang.String.valueOf(modelDirUnsafe))), 6);
        }
        return modelDirUnsafe;
    }

    public void deleteAllModels(com.google.mlkit.common.sdkinternal.ModelType modelType, java.lang.String str) {
        synchronized (this) {
            deleteRecursively(getModelDirUnsafe(str, modelType, false));
            deleteRecursively(getModelDirUnsafe(str, modelType, true));
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x002a, code lost:
    
        if (r5 != false) goto L17;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public boolean deleteRecursively(java.io.File file) {
        if (file == null) {
            return false;
        }
        if (file.isDirectory()) {
            boolean z = true;
            for (java.io.File file2 : (java.io.File[]) com.google.android.gms.common.internal.Preconditions.checkNotNull(file.listFiles())) {
                z = z && deleteRecursively(file2);
            }
        }
        return file.delete();
    }

    public void deleteTempFilesInPrivateFolder(java.lang.String str, com.google.mlkit.common.sdkinternal.ModelType modelType) throws com.google.mlkit.common.MlKitException {
        java.io.File zzc2 = zzc(str, modelType, true);
        if (deleteRecursively(zzc2)) {
            return;
        }
        zzd.e("ModelFileHelper", "Failed to delete the temp labels file directory: ".concat(java.lang.String.valueOf(zzc2 != null ? zzc2.getAbsolutePath() : null)));
    }

    public int getLatestCachedModelVersion(java.io.File file) {
        java.io.File[] listFiles = file.listFiles();
        int i = -1;
        if (listFiles != null && (listFiles.length) != 0) {
            for (java.io.File file2 : listFiles) {
                try {
                    i = java.lang.Math.max(i, java.lang.Integer.parseInt(file2.getName()));
                } catch (java.lang.NumberFormatException unused) {
                    zzd.d("ModelFileHelper", "Contains non-integer file name ".concat(java.lang.String.valueOf(file2.getName())));
                }
            }
        }
        return i;
    }

    public java.io.File getModelDir(java.lang.String str, com.google.mlkit.common.sdkinternal.ModelType modelType) throws com.google.mlkit.common.MlKitException {
        return zzc(str, modelType, false);
    }

    public java.io.File getModelDirUnsafe(java.lang.String str, com.google.mlkit.common.sdkinternal.ModelType modelType, boolean z) {
        java.lang.String str2;
        com.google.mlkit.common.sdkinternal.ModelType modelType2 = com.google.mlkit.common.sdkinternal.ModelType.UNKNOWN;
        int ordinal = modelType.ordinal();
        if (ordinal == 1) {
            str2 = zzc;
        } else if (ordinal == 2) {
            str2 = zza;
        } else {
            if (ordinal != 4) {
                java.lang.String name2 = modelType.name();
                java.lang.StringBuilder sb = new java.lang.StringBuilder("Unknown model type ");
                sb.append(name2);
                sb.append(". Cannot find a dir to store the downloaded model.");
                throw new java.lang.IllegalArgumentException(sb.toString());
            }
            str2 = zzb;
        }
        java.io.File file = new java.io.File(this.zze.getApplicationContext().getNoBackupFilesDir(), str2);
        if (z) {
            file = new java.io.File(file, "temp");
        }
        return new java.io.File(file, str);
    }

    public java.io.File getModelTempDir(java.lang.String str, com.google.mlkit.common.sdkinternal.ModelType modelType) throws com.google.mlkit.common.MlKitException {
        return zzc(str, modelType, true);
    }

    public java.io.File getTempFileInPrivateFolder(java.lang.String str, com.google.mlkit.common.sdkinternal.ModelType modelType, java.lang.String str2) throws com.google.mlkit.common.MlKitException {
        java.io.File zzc2 = zzc(str, modelType, true);
        if (zzc2.exists() && zzc2.isFile() && !zzc2.delete()) {
            throw new com.google.mlkit.common.MlKitException("Failed to delete the temp labels file: ".concat(java.lang.String.valueOf(zzc2.getAbsolutePath())), 13);
        }
        if (!zzc2.exists()) {
            zzd.d("ModelFileHelper", "Temp labels folder does not exist, creating one: ".concat(java.lang.String.valueOf(zzc2.getAbsolutePath())));
            if (!zzc2.mkdirs()) {
                throw new com.google.mlkit.common.MlKitException("Failed to create a directory to hold the AutoML model's labels file.", 13);
            }
        }
        return new java.io.File(zzc2, str2);
    }

    public boolean modelExistsLocally(java.lang.String str, com.google.mlkit.common.sdkinternal.ModelType modelType) throws com.google.mlkit.common.MlKitException {
        java.lang.String zzb2;
        if (modelType == com.google.mlkit.common.sdkinternal.ModelType.UNKNOWN || (zzb2 = zzb(str, modelType)) == null) {
            return false;
        }
        java.io.File file = new java.io.File(zzb2);
        if (!file.exists()) {
            return false;
        }
        java.io.File file2 = new java.io.File(file, com.google.mlkit.common.sdkinternal.Constants.MODEL_FILE_NAME);
        zzd.i("ModelFileHelper", "Model file path: ".concat(java.lang.String.valueOf(file2.getAbsolutePath())));
        return file2.exists();
    }

    public final java.io.File zza(java.lang.String str, com.google.mlkit.common.sdkinternal.ModelType modelType) throws com.google.mlkit.common.MlKitException {
        return zzc(str, modelType, true);
    }

    public final java.lang.String zzb(java.lang.String str, com.google.mlkit.common.sdkinternal.ModelType modelType) throws com.google.mlkit.common.MlKitException {
        java.io.File modelDir = getModelDir(str, modelType);
        int latestCachedModelVersion = getLatestCachedModelVersion(modelDir);
        if (latestCachedModelVersion == -1) {
            return null;
        }
        java.lang.String absolutePath = modelDir.getAbsolutePath();
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append(absolutePath);
        sb.append(androidx.view.exceptions.publickeycredential.DomExceptionUtils.SEPARATOR);
        sb.append(latestCachedModelVersion);
        return sb.toString();
    }

    public ModelFileHelper(com.google.mlkit.common.sdkinternal.MlKitContext mlKitContext) {
        this.zze = mlKitContext;
    }
}
