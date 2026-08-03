package com.helpshift.util;

/* loaded from: classes5.dex */
public class FileUtil {
    private static final java.lang.String TAG = "fileutil";

    private FileUtil() {
    }

    public static java.lang.String readFileToString(java.lang.String str) {
        java.io.File file = new java.io.File(str);
        try {
            java.io.FileInputStream fileInputStream = new java.io.FileInputStream(file);
            try {
                int length = (int) file.length();
                byte[] bArr = new byte[length];
                fileInputStream.read(bArr, 0, length);
                java.lang.String str2 = new java.lang.String(bArr);
                fileInputStream.close();
                return str2;
            } finally {
            }
        } catch (java.lang.Exception e) {
            com.helpshift.log.HSLogger.e(TAG, "Error reading file: " + str, e);
            return "";
        }
    }

    public static void deleteDir(java.lang.String str) {
        java.io.File file = new java.io.File(str);
        if (file.exists()) {
            java.io.File[] listFiles = file.listFiles();
            if (listFiles == null || listFiles.length == 0) {
                if (file.delete()) {
                    return;
                }
                com.helpshift.log.HSLogger.d(TAG, "Failed to delete directory : " + str);
                return;
            }
            for (java.io.File file2 : listFiles) {
                if (file2.isDirectory()) {
                    deleteDir(file2.getAbsolutePath());
                }
                if (!file2.delete()) {
                    com.helpshift.log.HSLogger.d(TAG, "Failed to delete file : " + file2.getPath());
                }
            }
            if (file.delete()) {
                return;
            }
            com.helpshift.log.HSLogger.d(TAG, "Failed to delete directory : " + str);
        }
    }

    public static void deleteOlderCachedFiles(java.lang.String str, java.lang.String str2, long j) {
        java.io.File file = new java.io.File(com.helpshift.util.Utils.getResourceCacheDirPath(str, str2));
        java.io.File[] listFiles = file.listFiles();
        if (!file.exists() || listFiles == null || listFiles.length == 0) {
            return;
        }
        long currentTimeMillis = java.lang.System.currentTimeMillis();
        for (java.io.File file2 : listFiles) {
            long lastModified = file2.lastModified();
            if (lastModified != 0 && currentTimeMillis - lastModified > j && !file2.delete()) {
                com.helpshift.log.HSLogger.d(TAG, "Failed to delete file : " + file2.getPath());
            }
        }
    }
}
