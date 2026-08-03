package com.google.firebase.crashlytics.internal.persistence;

/* loaded from: classes3.dex */
public class FileStore {
    private static final java.lang.String CRASHLYTICS_PATH_V1 = ".com.google.firebase.crashlytics.files.v1";
    private static final java.lang.String CRASHLYTICS_PATH_V2 = ".com.google.firebase.crashlytics.files.v2";
    private static final java.lang.String CRASHLYTICS_PATH_V3 = ".crashlytics.v3";
    private static final java.lang.String NATIVE_REPORTS_PATH = "native-reports";
    private static final java.lang.String NATIVE_SESSION_SUBDIR = "native";
    private static final java.lang.String PRIORITY_REPORTS_PATH = "priority-reports";
    private static final java.lang.String REPORTS_PATH = "reports";
    private static final java.lang.String SESSIONS_PATH = "open-sessions";
    private final java.io.File crashlyticsDir;
    private final java.io.File filesDir;
    private final java.io.File nativeReportsDir;
    private final java.io.File priorityReportsDir;
    final java.lang.String processName;
    private final java.io.File reportsDir;
    private final java.io.File sessionsDir;

    public FileStore(android.content.Context context) {
        java.lang.String str;
        java.lang.String processName = com.google.firebase.crashlytics.internal.ProcessDetailsProvider.INSTANCE.getCurrentProcessDetails(context).getProcessName();
        this.processName = processName;
        java.io.File filesDir = context.getFilesDir();
        this.filesDir = filesDir;
        if (useV3FileSystem()) {
            str = CRASHLYTICS_PATH_V3 + java.io.File.separator + sanitizeName(processName);
        } else {
            str = CRASHLYTICS_PATH_V1;
        }
        java.io.File prepareBaseDir = prepareBaseDir(new java.io.File(filesDir, str));
        this.crashlyticsDir = prepareBaseDir;
        this.sessionsDir = prepareBaseDir(new java.io.File(prepareBaseDir, SESSIONS_PATH));
        this.reportsDir = prepareBaseDir(new java.io.File(prepareBaseDir, REPORTS_PATH));
        this.priorityReportsDir = prepareBaseDir(new java.io.File(prepareBaseDir, PRIORITY_REPORTS_PATH));
        this.nativeReportsDir = prepareBaseDir(new java.io.File(prepareBaseDir, NATIVE_REPORTS_PATH));
    }

    public void deleteAllCrashlyticsFiles() {
        recursiveDelete(this.crashlyticsDir);
    }

    public void cleanupPreviousFileSystems() {
        cleanupFileSystemDir(".com.google.firebase.crashlytics");
        cleanupFileSystemDir(".com.google.firebase.crashlytics-ndk");
        if (useV3FileSystem()) {
            cleanupFileSystemDir(CRASHLYTICS_PATH_V1);
            cleanupFileSystemDirs(CRASHLYTICS_PATH_V2 + java.io.File.pathSeparator);
        }
    }

    private void cleanupFileSystemDir(java.lang.String str) {
        java.io.File file = new java.io.File(this.filesDir, str);
        if (file.exists() && recursiveDelete(file)) {
            com.google.firebase.crashlytics.internal.Logger.getLogger().d("Deleted previous Crashlytics file system: " + file.getPath());
        }
    }

    private void cleanupFileSystemDirs(final java.lang.String str) {
        java.lang.String[] list;
        if (!this.filesDir.exists() || (list = this.filesDir.list(new java.io.FilenameFilter() { // from class: com.google.firebase.crashlytics.internal.persistence.FileStore$$ExternalSyntheticLambda0
            @Override // java.io.FilenameFilter
            public final boolean accept(java.io.File file, java.lang.String str2) {
                boolean startsWith;
                startsWith = str2.startsWith(str);
                return startsWith;
            }
        })) == null) {
            return;
        }
        for (java.lang.String str2 : list) {
            cleanupFileSystemDir(str2);
        }
    }

    static boolean recursiveDelete(java.io.File file) {
        java.io.File[] listFiles = file.listFiles();
        if (listFiles != null) {
            for (java.io.File file2 : listFiles) {
                recursiveDelete(file2);
            }
        }
        return file.delete();
    }

    public java.io.File getCommonFile(java.lang.String str) {
        return new java.io.File(this.crashlyticsDir, str);
    }

    public java.util.List<java.io.File> getCommonFiles(java.io.FilenameFilter filenameFilter) {
        return safeArrayToList(this.crashlyticsDir.listFiles(filenameFilter));
    }

    private java.io.File getSessionDir(java.lang.String str) {
        return prepareDir(new java.io.File(this.sessionsDir, str));
    }

    public java.io.File getSessionFile(java.lang.String str, java.lang.String str2) {
        return new java.io.File(getSessionDir(str), str2);
    }

    public java.util.List<java.io.File> getSessionFiles(java.lang.String str, java.io.FilenameFilter filenameFilter) {
        return safeArrayToList(getSessionDir(str).listFiles(filenameFilter));
    }

    public java.io.File getNativeSessionDir(java.lang.String str) {
        return prepareDir(new java.io.File(getSessionDir(str), "native"));
    }

    public boolean deleteSessionFiles(java.lang.String str) {
        return recursiveDelete(new java.io.File(this.sessionsDir, str));
    }

    public java.util.List<java.lang.String> getAllOpenSessionIds() {
        return safeArrayToList(this.sessionsDir.list());
    }

    public java.io.File getReport(java.lang.String str) {
        return new java.io.File(this.reportsDir, str);
    }

    public java.util.List<java.io.File> getReports() {
        return safeArrayToList(this.reportsDir.listFiles());
    }

    public java.io.File getPriorityReport(java.lang.String str) {
        return new java.io.File(this.priorityReportsDir, str);
    }

    public java.util.List<java.io.File> getPriorityReports() {
        return safeArrayToList(this.priorityReportsDir.listFiles());
    }

    public java.io.File getNativeReport(java.lang.String str) {
        return new java.io.File(this.nativeReportsDir, str);
    }

    public java.util.List<java.io.File> getNativeReports() {
        return safeArrayToList(this.nativeReportsDir.listFiles());
    }

    private static java.io.File prepareDir(java.io.File file) {
        file.mkdirs();
        return file;
    }

    private static synchronized java.io.File prepareBaseDir(java.io.File file) {
        synchronized (com.google.firebase.crashlytics.internal.persistence.FileStore.class) {
            if (file.exists()) {
                if (file.isDirectory()) {
                    return file;
                }
                com.google.firebase.crashlytics.internal.Logger.getLogger().d("Unexpected non-directory file: " + file + "; deleting file and creating new directory.");
                file.delete();
            }
            if (!file.mkdirs()) {
                com.google.firebase.crashlytics.internal.Logger.getLogger().e("Could not create Crashlytics-specific directory: " + file);
            }
            return file;
        }
    }

    private static <T> java.util.List<T> safeArrayToList(T[] tArr) {
        return tArr == null ? java.util.Collections.emptyList() : java.util.Arrays.asList(tArr);
    }

    private boolean useV3FileSystem() {
        return !this.processName.isEmpty();
    }

    static java.lang.String sanitizeName(java.lang.String str) {
        if (str.length() > 40) {
            return com.google.firebase.crashlytics.internal.common.CommonUtils.sha1(str);
        }
        return str.replaceAll("[^a-zA-Z0-9.]", "_");
    }
}
