package com.google.mlkit.common.sdkinternal.model;

/* loaded from: classes9.dex */
public abstract class LegacyModelMigrator {
    protected final com.google.mlkit.common.sdkinternal.model.ModelFileHelper modelFileHelper;
    private final android.content.Context zzb;
    private final com.google.android.gms.tasks.TaskCompletionSource zza = new com.google.android.gms.tasks.TaskCompletionSource();
    private final java.util.concurrent.Executor zzc = com.google.mlkit.common.sdkinternal.MLTaskExecutor.workerThreadExecutor();

    protected LegacyModelMigrator(android.content.Context context, com.google.mlkit.common.sdkinternal.model.ModelFileHelper modelFileHelper) {
        this.zzb = context;
        this.modelFileHelper = modelFileHelper;
    }

    protected static void deleteIfEmpty(java.io.File file) {
        java.io.File[] listFiles = file.listFiles();
        if (listFiles == null || listFiles.length == 0) {
            file.delete();
        }
    }

    protected static boolean isValidFirebasePersistenceKey(java.lang.String str) {
        java.lang.String[] split = str.split("\\+", -1);
        if (split.length != 2) {
            return false;
        }
        try {
            com.google.android.gms.common.util.Base64Utils.decodeUrlSafeNoPadding(split[0]);
            com.google.android.gms.common.util.Base64Utils.decodeUrlSafeNoPadding(split[1]);
            return true;
        } catch (java.lang.IllegalArgumentException unused) {
            return false;
        }
    }

    public static void migrateFile(java.io.File file, java.io.File file2) {
        if (file.exists()) {
            if (!file2.exists()) {
                file.renameTo(file2);
            }
            if (file.exists()) {
                file.delete();
            }
        }
    }

    protected abstract java.lang.String getLegacyModelDirName();

    public java.io.File getLegacyRootDir() {
        android.content.Context context = this.zzb;
        return new java.io.File(context.getNoBackupFilesDir(), getLegacyModelDirName());
    }

    public com.google.android.gms.tasks.Task<java.lang.Void> getMigrationTask() {
        return this.zza.getTask();
    }

    protected abstract void migrateAllModelDirs(java.io.File file);

    public void start() {
        this.zzc.execute(new java.lang.Runnable() { // from class: com.google.mlkit.common.sdkinternal.model.zza
            @Override // java.lang.Runnable
            public final void run() {
                com.google.mlkit.common.sdkinternal.model.LegacyModelMigrator.this.zza();
            }
        });
    }

    final /* synthetic */ void zza() {
        java.io.File legacyRootDir = getLegacyRootDir();
        java.io.File[] listFiles = legacyRootDir.listFiles();
        if (listFiles != null) {
            for (java.io.File file : listFiles) {
                migrateAllModelDirs(file);
            }
            deleteIfEmpty(legacyRootDir);
        }
        this.zza.setResult(null);
    }
}
