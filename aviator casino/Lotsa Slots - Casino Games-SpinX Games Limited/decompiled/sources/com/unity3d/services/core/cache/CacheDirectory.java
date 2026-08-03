package com.unity3d.services.core.cache;

/* loaded from: classes6.dex */
public class CacheDirectory {
    private static final java.lang.String TEST_FILE_NAME = "UnityAdsTest.txt";
    private java.lang.String _cacheDirName;
    private java.io.File _cacheDirectory;
    private boolean _initialized;
    private final boolean _preferExternalStorage;
    private com.unity3d.services.core.cache.CacheDirectoryType _type;

    public CacheDirectory(java.lang.String str) {
        this._initialized = false;
        this._cacheDirectory = null;
        this._type = null;
        this._cacheDirName = str;
        this._preferExternalStorage = true;
    }

    public CacheDirectory(java.lang.String str, boolean z) {
        this._initialized = false;
        this._cacheDirectory = null;
        this._type = null;
        this._preferExternalStorage = z;
        this._cacheDirName = str;
    }

    public synchronized java.io.File getCacheDirectory(android.content.Context context) {
        if (context == null) {
            return null;
        }
        if (this._initialized) {
            return this._cacheDirectory;
        }
        this._initialized = true;
        if (this._preferExternalStorage) {
            if ("mounted".equals(android.os.Environment.getExternalStorageState())) {
                try {
                    java.io.File createCacheDirectory = createCacheDirectory(context.getExternalCacheDir(), this._cacheDirName);
                    if (testCacheDirectory(createCacheDirectory)) {
                        createNoMediaFile(createCacheDirectory);
                        this._cacheDirectory = createCacheDirectory;
                        this._type = com.unity3d.services.core.cache.CacheDirectoryType.EXTERNAL;
                        com.unity3d.services.core.log.DeviceLog.debug("Unity Ads is using external cache directory: " + createCacheDirectory.getAbsolutePath());
                        return this._cacheDirectory;
                    }
                } catch (java.lang.Exception e) {
                    com.unity3d.services.core.log.DeviceLog.exception("Creating external cache directory failed", e);
                    return null;
                }
            } else {
                com.unity3d.services.core.log.DeviceLog.debug("External media not mounted");
            }
        }
        java.io.File createCacheDirectory2 = createCacheDirectory(context.getNoBackupFilesDir(), this._cacheDirName);
        if (testCacheDirectory(createCacheDirectory2)) {
            this._cacheDirectory = createCacheDirectory2;
            this._type = com.unity3d.services.core.cache.CacheDirectoryType.INTERNAL;
            com.unity3d.services.core.log.DeviceLog.debug("Unity Ads is using internal cache directory: " + createCacheDirectory2.getAbsolutePath());
            return this._cacheDirectory;
        }
        com.unity3d.services.core.log.DeviceLog.error("Unity Ads failed to initialize cache directory");
        return null;
    }

    public com.unity3d.services.core.cache.CacheDirectoryType getType() {
        return this._type;
    }

    public java.io.File createCacheDirectory(java.io.File file, java.lang.String str) {
        if (file == null) {
            return null;
        }
        java.io.File file2 = new java.io.File(file, str);
        file2.mkdirs();
        if (file2.isDirectory()) {
            return file2;
        }
        return null;
    }

    public boolean testCacheDirectory(java.io.File file) {
        if (file != null && file.isDirectory()) {
            try {
                byte[] bytes = "test".getBytes("UTF-8");
                int length = bytes.length;
                byte[] bArr = new byte[length];
                java.io.File file2 = new java.io.File(file, TEST_FILE_NAME);
                java.io.FileOutputStream fileOutputStream = new java.io.FileOutputStream(file2);
                try {
                    fileOutputStream.write(bytes);
                    fileOutputStream.flush();
                    fileOutputStream.close();
                    java.io.FileInputStream fileInputStream = new java.io.FileInputStream(file2);
                    try {
                        int read = fileInputStream.read(bArr, 0, length);
                        fileInputStream.close();
                        if (!file2.delete()) {
                            com.unity3d.services.core.log.DeviceLog.debug("Failed to delete testfile " + file2.getAbsoluteFile());
                            return false;
                        }
                        if (read != length) {
                            com.unity3d.services.core.log.DeviceLog.debug("Read buffer size mismatch");
                            return false;
                        }
                        if (new java.lang.String(bArr, "UTF-8").equals("test")) {
                            return true;
                        }
                        com.unity3d.services.core.log.DeviceLog.debug("Read buffer content mismatch");
                        return false;
                    } finally {
                    }
                } finally {
                }
            } catch (java.lang.Exception e) {
                com.unity3d.services.core.log.DeviceLog.debug("Unity Ads exception while testing cache directory " + file.getAbsolutePath() + ": " + e.getMessage());
            }
        }
        return false;
    }

    private void createNoMediaFile(java.io.File file) {
        try {
            if (new java.io.File(file, ".nomedia").createNewFile()) {
                com.unity3d.services.core.log.DeviceLog.debug("Successfully created .nomedia file");
            } else {
                com.unity3d.services.core.log.DeviceLog.debug("Using existing .nomedia file");
            }
        } catch (java.lang.Exception e) {
            com.unity3d.services.core.log.DeviceLog.exception("Failed to create .nomedia file", e);
        }
    }
}
