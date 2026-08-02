package androidx.profileinstaller;

/* loaded from: classes7.dex */
public class ProfileInstallReceiver extends android.content.BroadcastReceiver {
    public static final java.lang.String ACTION_BENCHMARK_OPERATION = "androidx.profileinstaller.action.BENCHMARK_OPERATION";
    public static final java.lang.String ACTION_INSTALL_PROFILE = "androidx.profileinstaller.action.INSTALL_PROFILE";
    public static final java.lang.String ACTION_SAVE_PROFILE = "androidx.profileinstaller.action.SAVE_PROFILE";
    public static final java.lang.String ACTION_SKIP_FILE = "androidx.profileinstaller.action.SKIP_FILE";

    @Override // android.content.BroadcastReceiver
    public void onReceive(android.content.Context context, android.content.Intent intent) {
        android.os.Bundle extras;
        if (intent != null) {
            java.lang.String action = intent.getAction();
            if (ACTION_INSTALL_PROFILE.equals(action)) {
                androidx.profileinstaller.ProfileInstaller.getHighSpeedVideoFpsRangesFor(context, new androidx.camera.compose.CameraXViewfinderKt$CameraXViewfinder$viewfinderArgs$2$1$$ExternalSyntheticLambda0(), new androidx.profileinstaller.ProfileInstallReceiver.ResultDiagnostics(), true);
                return;
            }
            if (ACTION_SKIP_FILE.equals(action)) {
                android.os.Bundle extras2 = intent.getExtras();
                if (extras2 != null) {
                    java.lang.String string = extras2.getString("EXTRA_SKIP_FILE_OPERATION");
                    if ("WRITE_SKIP_FILE".equals(string)) {
                        androidx.profileinstaller.ProfileInstaller.getHighSpeedVideoSizes(context, new androidx.camera.compose.CameraXViewfinderKt$CameraXViewfinder$viewfinderArgs$2$1$$ExternalSyntheticLambda0(), new androidx.profileinstaller.ProfileInstallReceiver.ResultDiagnostics());
                        return;
                    } else {
                        if ("DELETE_SKIP_FILE".equals(string)) {
                            androidx.profileinstaller.ProfileInstaller.getHighSpeedVideoFpsRanges(context, new androidx.camera.compose.CameraXViewfinderKt$CameraXViewfinder$viewfinderArgs$2$1$$ExternalSyntheticLambda0(), new androidx.profileinstaller.ProfileInstallReceiver.ResultDiagnostics());
                            return;
                        }
                        return;
                    }
                }
                return;
            }
            if (ACTION_SAVE_PROFILE.equals(action)) {
                androidx.profileinstaller.ProfileInstallReceiver.ResultDiagnostics resultDiagnostics = new androidx.profileinstaller.ProfileInstallReceiver.ResultDiagnostics();
                android.os.Process.sendSignal(android.os.Process.myPid(), 10);
                resultDiagnostics.onResultReceived(12, null);
            } else {
                if (!ACTION_BENCHMARK_OPERATION.equals(action) || (extras = intent.getExtras()) == null) {
                    return;
                }
                java.lang.String string2 = extras.getString("EXTRA_BENCHMARK_OPERATION");
                androidx.profileinstaller.ProfileInstallReceiver.ResultDiagnostics resultDiagnostics2 = new androidx.profileinstaller.ProfileInstallReceiver.ResultDiagnostics();
                if ("DROP_SHADER_CACHE".equals(string2)) {
                    androidx.profileinstaller.BenchmarkOperation.getHighResolutionOutputSizeshNQ4ISI(context, resultDiagnostics2);
                } else if (!"SAVE_PROFILE".equals(string2)) {
                    resultDiagnostics2.onResultReceived(16, null);
                } else {
                    android.os.Process.sendSignal(extras.getInt("EXTRA_PID", android.os.Process.myPid()), 10);
                    resultDiagnostics2.onResultReceived(12, null);
                }
            }
        }
    }

    class ResultDiagnostics implements androidx.profileinstaller.ProfileInstaller.DiagnosticsCallback {
        ResultDiagnostics() {
        }

        @Override // androidx.profileinstaller.ProfileInstaller.DiagnosticsCallback
        public void onDiagnosticReceived(int i, java.lang.Object obj) {
            androidx.profileinstaller.ProfileInstaller.Camera2StreamConfigurationMap.onDiagnosticReceived(i, obj);
        }

        @Override // androidx.profileinstaller.ProfileInstaller.DiagnosticsCallback
        public void onResultReceived(int i, java.lang.Object obj) {
            androidx.profileinstaller.ProfileInstaller.Camera2StreamConfigurationMap.onResultReceived(i, obj);
            androidx.profileinstaller.ProfileInstallReceiver.this.setResultCode(i);
        }
    }
}
