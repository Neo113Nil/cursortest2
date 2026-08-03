package io.appmetrica.analytics.coreutils.internal.io;

/* loaded from: classes.dex */
public final class FileUtils {
    public static final io.appmetrica.analytics.coreutils.internal.io.FileUtils INSTANCE = new io.appmetrica.analytics.coreutils.internal.io.FileUtils();
    public static final java.lang.String SDK_FILES_PREFIX = "appmetrica_analytics";
    public static final java.lang.String SDK_STORAGE_RELATIVE_PATH = "/appmetrica/analytics";

    /* renamed from: a, reason: collision with root package name */
    private static volatile java.io.File f3750a;

    private FileUtils() {
    }

    public static final boolean copyToNullable(java.io.File file, java.io.File file2) {
        if (file != null && file2 != null && file.exists()) {
            try {
                q1.AbstractC0982b.F(file, file2);
                return true;
            } catch (java.lang.Throwable unused) {
            }
        }
        return false;
    }

    @android.annotation.SuppressLint({"NewApi"})
    public static final java.io.File getAppDataDir(android.content.Context context) {
        if (io.appmetrica.analytics.coreutils.internal.AndroidUtils.isApiAchieved(24)) {
            return io.appmetrica.analytics.coreutils.internal.io.AppDataDirProviderForN.INSTANCE.dataDir(context);
        }
        java.io.File filesDir = context.getFilesDir();
        if (filesDir != null) {
            return filesDir.getParentFile();
        }
        return null;
    }

    public static final java.io.File getAppStorageDirectory(android.content.Context context) {
        return context.getNoBackupFilesDir();
    }

    public static final java.io.File getCrashesDirectory(android.content.Context context) {
        return getFileFromSdkStorage(context, "crashes");
    }

    public static final java.io.File getFileFromAppStorage(android.content.Context context, java.lang.String str) {
        java.io.File appStorageDirectory = getAppStorageDirectory(context);
        if (appStorageDirectory != null) {
            return new java.io.File(appStorageDirectory, str);
        }
        return null;
    }

    public static final java.io.File getFileFromPath(java.lang.String str) {
        return new java.io.File(str);
    }

    public static final java.io.File getFileFromSdkStorage(android.content.Context context, java.lang.String str) {
        java.io.File sdkStorage = sdkStorage(context);
        if (sdkStorage != null) {
            return new java.io.File(sdkStorage, str);
        }
        return null;
    }

    public static final java.io.File getNativeCrashDirectory(android.content.Context context) {
        return getFileFromSdkStorage(context, "native_crashes");
    }

    public static final boolean move(java.io.File file, java.io.File file2) {
        io.appmetrica.analytics.coreutils.internal.io.FileUtils fileUtils = INSTANCE;
        return fileUtils.moveByRename(file, file2) || fileUtils.moveByCopy(file, file2);
    }

    public static final void resetSdkStorage() {
        synchronized (INSTANCE) {
            f3750a = null;
        }
    }

    public static final java.io.File sdkStorage(android.content.Context context) {
        java.io.File file;
        if (f3750a == null) {
            synchronized (INSTANCE) {
                try {
                    java.io.File appStorageDirectory = getAppStorageDirectory(context);
                    if (appStorageDirectory == null) {
                        file = null;
                    } else {
                        java.io.File file2 = new java.io.File(appStorageDirectory, SDK_STORAGE_RELATIVE_PATH);
                        if (!file2.exists()) {
                            file2.mkdirs();
                        }
                        file = file2;
                    }
                    f3750a = file;
                } catch (java.lang.Throwable th) {
                    throw th;
                }
            }
        }
        return f3750a;
    }

    public final boolean moveByCopy(java.io.File file, java.io.File file2) {
        if (file != null && file2 != null && file.exists()) {
            try {
                q1.AbstractC0982b.F(file, file2);
                file.delete();
                return true;
            } catch (java.lang.Throwable unused) {
            }
        }
        return false;
    }

    public final boolean moveByRename(java.io.File file, java.io.File file2) {
        if (file2 != null) {
            java.lang.Boolean valueOf = file != null ? java.lang.Boolean.valueOf(file.renameTo(file2)) : null;
            if (valueOf != null) {
                return valueOf.booleanValue();
            }
        }
        return false;
    }
}
