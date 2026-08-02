package androidx.profileinstaller;

/* loaded from: classes7.dex */
class BenchmarkOperation {
    private BenchmarkOperation() {
    }

    static void getHighResolutionOutputSizeshNQ4ISI(android.content.Context context, androidx.profileinstaller.ProfileInstallReceiver.ResultDiagnostics resultDiagnostics) {
        java.io.File highSpeedVideoFpsRangesFor;
        if (android.os.Build.VERSION.SDK_INT >= 34) {
            highSpeedVideoFpsRangesFor = androidx.profileinstaller.BenchmarkOperation.Api24ContextHelper.Camera2StreamConfigurationMap(context).getCacheDir();
        } else {
            highSpeedVideoFpsRangesFor = androidx.profileinstaller.BenchmarkOperation.Api21ContextHelper.getHighSpeedVideoFpsRangesFor(androidx.profileinstaller.BenchmarkOperation.Api24ContextHelper.Camera2StreamConfigurationMap(context));
        }
        if (getHighResolutionOutputSizeshNQ4ISI(highSpeedVideoFpsRangesFor)) {
            resultDiagnostics.onResultReceived(14, null);
        } else {
            resultDiagnostics.onResultReceived(15, null);
        }
    }

    private static boolean getHighResolutionOutputSizeshNQ4ISI(java.io.File file) {
        if (file.isDirectory()) {
            java.io.File[] listFiles = file.listFiles();
            if (listFiles == null) {
                return false;
            }
            boolean z = true;
            for (java.io.File file2 : listFiles) {
                z = getHighResolutionOutputSizeshNQ4ISI(file2) && z;
            }
            return z;
        }
        file.delete();
        return true;
    }

    static class Api21ContextHelper {
        private Api21ContextHelper() {
        }

        static java.io.File getHighSpeedVideoFpsRangesFor(android.content.Context context) {
            return context.getCodeCacheDir();
        }
    }

    static class Api24ContextHelper {
        private Api24ContextHelper() {
        }

        static android.content.Context Camera2StreamConfigurationMap(android.content.Context context) {
            return context.createDeviceProtectedStorageContext();
        }
    }
}
