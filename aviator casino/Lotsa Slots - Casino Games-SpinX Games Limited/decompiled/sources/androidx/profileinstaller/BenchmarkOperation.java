package androidx.profileinstaller;

/* loaded from: classes2.dex */
class BenchmarkOperation {
    private BenchmarkOperation() {
    }

    static void dropShaderCache(android.content.Context context, androidx.profileinstaller.ProfileInstallReceiver.ResultDiagnostics resultDiagnostics) {
        java.io.File cacheDir;
        if (android.os.Build.VERSION.SDK_INT >= 24) {
            cacheDir = androidx.profileinstaller.BenchmarkOperation.Api24ContextHelper.getDeviceProtectedCodeCacheDir(context);
        } else if (android.os.Build.VERSION.SDK_INT >= 23) {
            cacheDir = androidx.profileinstaller.BenchmarkOperation.Api21ContextHelper.getCodeCacheDir(context);
        } else {
            cacheDir = context.getCacheDir();
        }
        if (deleteFilesRecursively(cacheDir)) {
            resultDiagnostics.onResultReceived(14, null);
        } else {
            resultDiagnostics.onResultReceived(15, null);
        }
    }

    static boolean deleteFilesRecursively(java.io.File file) {
        if (file.isDirectory()) {
            java.io.File[] listFiles = file.listFiles();
            if (listFiles == null) {
                return false;
            }
            boolean z = true;
            for (java.io.File file2 : listFiles) {
                z = deleteFilesRecursively(file2) && z;
            }
            return z;
        }
        file.delete();
        return true;
    }

    private static class Api21ContextHelper {
        private Api21ContextHelper() {
        }

        static java.io.File getCodeCacheDir(android.content.Context context) {
            return context.getCodeCacheDir();
        }
    }

    private static class Api24ContextHelper {
        private Api24ContextHelper() {
        }

        static java.io.File getDeviceProtectedCodeCacheDir(android.content.Context context) {
            return context.createDeviceProtectedStorageContext().getCodeCacheDir();
        }
    }
}
