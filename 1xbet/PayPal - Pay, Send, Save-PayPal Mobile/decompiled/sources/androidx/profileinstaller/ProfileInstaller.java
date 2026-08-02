package androidx.profileinstaller;

/* loaded from: classes7.dex */
public class ProfileInstaller {
    public static final int DIAGNOSTIC_CURRENT_PROFILE_DOES_NOT_EXIST = 2;
    public static final int DIAGNOSTIC_CURRENT_PROFILE_EXISTS = 1;
    public static final int DIAGNOSTIC_PROFILE_IS_COMPRESSED = 5;
    public static final int DIAGNOSTIC_REF_PROFILE_DOES_NOT_EXIST = 4;
    public static final int DIAGNOSTIC_REF_PROFILE_EXISTS = 3;
    public static final int RESULT_ALREADY_INSTALLED = 2;
    public static final int RESULT_BASELINE_PROFILE_NOT_FOUND = 6;
    public static final int RESULT_BENCHMARK_OPERATION_FAILURE = 15;
    public static final int RESULT_BENCHMARK_OPERATION_SUCCESS = 14;
    public static final int RESULT_BENCHMARK_OPERATION_UNKNOWN = 16;
    public static final int RESULT_DELETE_SKIP_FILE_SUCCESS = 11;
    public static final int RESULT_DESIRED_FORMAT_UNSUPPORTED = 5;
    public static final int RESULT_INSTALL_SKIP_FILE_SUCCESS = 10;
    public static final int RESULT_INSTALL_SUCCESS = 1;
    public static final int RESULT_IO_EXCEPTION = 7;
    public static final int RESULT_META_FILE_REQUIRED_BUT_NOT_FOUND = 9;
    public static final int RESULT_NOT_WRITABLE = 4;
    public static final int RESULT_PARSE_EXCEPTION = 8;
    public static final int RESULT_SAVE_PROFILE_SIGNALLED = 12;
    public static final int RESULT_SAVE_PROFILE_SKIPPED = 13;
    public static final int RESULT_UNSUPPORTED_ART_VERSION = 3;
    private static final androidx.profileinstaller.ProfileInstaller.DiagnosticsCallback getHighSpeedVideoFpsRangesFor = new androidx.profileinstaller.ProfileInstaller.DiagnosticsCallback() { // from class: androidx.profileinstaller.ProfileInstaller.1
        @Override // androidx.profileinstaller.ProfileInstaller.DiagnosticsCallback
        public void onDiagnosticReceived(int i, java.lang.Object obj) {
        }

        @Override // androidx.profileinstaller.ProfileInstaller.DiagnosticsCallback
        public void onResultReceived(int i, java.lang.Object obj) {
        }
    };
    static final androidx.profileinstaller.ProfileInstaller.DiagnosticsCallback Camera2StreamConfigurationMap = new androidx.profileinstaller.ProfileInstaller.DiagnosticsCallback() { // from class: androidx.profileinstaller.ProfileInstaller.2
        @Override // androidx.profileinstaller.ProfileInstaller.DiagnosticsCallback
        public void onDiagnosticReceived(int i, java.lang.Object obj) {
        }

        @Override // androidx.profileinstaller.ProfileInstaller.DiagnosticsCallback
        public void onResultReceived(int i, java.lang.Object obj) {
            if (i == 6 || i == 7 || i == 8) {
            }
        }
    };

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    /* loaded from: classes3.dex */
    public @interface DiagnosticCode {
    }

    public interface DiagnosticsCallback {
        void onDiagnosticReceived(int i, java.lang.Object obj);

        void onResultReceived(int i, java.lang.Object obj);
    }

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    /* loaded from: classes3.dex */
    public @interface ResultCode {
    }

    private ProfileInstaller() {
    }

    private static boolean getHighSpeedVideoFpsRanges(android.content.pm.PackageInfo packageInfo, java.io.File file, androidx.profileinstaller.ProfileInstaller.DiagnosticsCallback diagnosticsCallback) {
        java.io.File file2 = new java.io.File(file, "profileinstaller_profileWrittenFor_lastUpdateTime.dat");
        if (!file2.exists()) {
            return false;
        }
        try {
            java.io.DataInputStream dataInputStream = new java.io.DataInputStream(new java.io.FileInputStream(file2));
            try {
                long readLong = dataInputStream.readLong();
                dataInputStream.close();
                boolean z = readLong == packageInfo.lastUpdateTime;
                if (z) {
                    diagnosticsCallback.onResultReceived(2, null);
                }
                return z;
            } finally {
            }
        } catch (java.io.IOException unused) {
            return false;
        }
    }

    private static void getHighResolutionOutputSizeshNQ4ISI(android.content.pm.PackageInfo packageInfo, java.io.File file) {
        try {
            java.io.DataOutputStream dataOutputStream = new java.io.DataOutputStream(new java.io.FileOutputStream(new java.io.File(file, "profileinstaller_profileWrittenFor_lastUpdateTime.dat")));
            try {
                dataOutputStream.writeLong(packageInfo.lastUpdateTime);
                dataOutputStream.close();
            } finally {
            }
        } catch (java.io.IOException unused) {
        }
    }

    private static boolean Camera2StreamConfigurationMap(android.content.res.AssetManager assetManager, java.lang.String str, android.content.pm.PackageInfo packageInfo, java.io.File file, java.lang.String str2, java.util.concurrent.Executor executor, androidx.profileinstaller.ProfileInstaller.DiagnosticsCallback diagnosticsCallback) {
        androidx.profileinstaller.DeviceProfileWriter deviceProfileWriter = new androidx.profileinstaller.DeviceProfileWriter(assetManager, executor, diagnosticsCallback, str2, "dexopt/baseline.prof", "dexopt/baseline.profm", new java.io.File(new java.io.File("/data/misc/profiles/cur/0", str), "primary.prof"));
        if (!deviceProfileWriter.deviceAllowsProfileInstallerAotWrites()) {
            return false;
        }
        boolean write = deviceProfileWriter.read().transcodeIfNeeded().write();
        if (write) {
            getHighResolutionOutputSizeshNQ4ISI(packageInfo, file);
        }
        return write;
    }

    public static void writeProfile(android.content.Context context) {
        writeProfile(context, new androidx.camera.compose.CameraXViewfinderKt$CameraXViewfinder$viewfinderArgs$2$1$$ExternalSyntheticLambda0(), getHighSpeedVideoFpsRangesFor);
    }

    public static void writeProfile(android.content.Context context, java.util.concurrent.Executor executor, androidx.profileinstaller.ProfileInstaller.DiagnosticsCallback diagnosticsCallback) {
        getHighSpeedVideoFpsRangesFor(context, executor, diagnosticsCallback, false);
    }

    static void getHighSpeedVideoFpsRangesFor(android.content.Context context, java.util.concurrent.Executor executor, androidx.profileinstaller.ProfileInstaller.DiagnosticsCallback diagnosticsCallback, boolean z) {
        android.content.Context applicationContext = context.getApplicationContext();
        java.lang.String packageName = applicationContext.getPackageName();
        android.content.pm.ApplicationInfo applicationInfo = applicationContext.getApplicationInfo();
        android.content.res.AssetManager assets = applicationContext.getAssets();
        java.lang.String name2 = new java.io.File(applicationInfo.sourceDir).getName();
        boolean z2 = false;
        try {
            android.content.pm.PackageInfo packageInfo = context.getPackageManager().getPackageInfo(packageName, 0);
            java.io.File filesDir = context.getFilesDir();
            if (z || !getHighSpeedVideoFpsRanges(packageInfo, filesDir, diagnosticsCallback)) {
                if (Camera2StreamConfigurationMap(assets, packageName, packageInfo, filesDir, name2, executor, diagnosticsCallback) && z) {
                    z2 = true;
                }
                androidx.profileinstaller.ProfileVerifier.Camera2StreamConfigurationMap(context, z2);
                return;
            }
            androidx.profileinstaller.ProfileVerifier.Camera2StreamConfigurationMap(context, false);
        } catch (android.content.pm.PackageManager.NameNotFoundException e) {
            diagnosticsCallback.onResultReceived(7, e);
            androidx.profileinstaller.ProfileVerifier.Camera2StreamConfigurationMap(context, false);
        }
    }

    static void getHighSpeedVideoSizes(android.content.Context context, java.util.concurrent.Executor executor, androidx.profileinstaller.ProfileInstaller.DiagnosticsCallback diagnosticsCallback) {
        try {
            getHighResolutionOutputSizeshNQ4ISI(context.getPackageManager().getPackageInfo(context.getApplicationContext().getPackageName(), 0), context.getFilesDir());
            executor.execute(new androidx.profileinstaller.ProfileInstaller$$ExternalSyntheticLambda0(diagnosticsCallback, 10, null));
        } catch (android.content.pm.PackageManager.NameNotFoundException e) {
            executor.execute(new androidx.profileinstaller.ProfileInstaller$$ExternalSyntheticLambda0(diagnosticsCallback, 7, e));
        }
    }

    static void getHighSpeedVideoFpsRanges(android.content.Context context, java.util.concurrent.Executor executor, androidx.profileinstaller.ProfileInstaller.DiagnosticsCallback diagnosticsCallback) {
        new java.io.File(context.getFilesDir(), "profileinstaller_profileWrittenFor_lastUpdateTime.dat").delete();
        executor.execute(new androidx.profileinstaller.ProfileInstaller$$ExternalSyntheticLambda0(diagnosticsCallback, 11, null));
    }
}
