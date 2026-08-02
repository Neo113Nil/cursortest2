package androidx.core.app;

/* loaded from: classes3.dex */
public final class AppOpsManagerCompat {
    public static final int MODE_ALLOWED = 0;
    public static final int MODE_DEFAULT = 3;
    public static final int MODE_ERRORED = 2;
    public static final int MODE_IGNORED = 1;

    private AppOpsManagerCompat() {
    }

    public static java.lang.String permissionToOp(java.lang.String str) {
        return android.app.AppOpsManager.permissionToOp(str);
    }

    public static int noteOp(android.content.Context context, java.lang.String str, int i, java.lang.String str2) {
        return ((android.app.AppOpsManager) context.getSystemService("appops")).noteOp(str, i, str2);
    }

    public static int noteOpNoThrow(android.content.Context context, java.lang.String str, int i, java.lang.String str2) {
        return ((android.app.AppOpsManager) context.getSystemService("appops")).noteOpNoThrow(str, i, str2);
    }

    public static int noteProxyOp(android.content.Context context, java.lang.String str, java.lang.String str2) {
        return ((android.app.AppOpsManager) context.getSystemService(android.app.AppOpsManager.class)).noteProxyOp(str, str2);
    }

    public static int noteProxyOpNoThrow(android.content.Context context, java.lang.String str, java.lang.String str2) {
        return ((android.app.AppOpsManager) context.getSystemService(android.app.AppOpsManager.class)).noteProxyOpNoThrow(str, str2);
    }

    public static int checkOrNoteProxyOp(android.content.Context context, int i, java.lang.String str, java.lang.String str2) {
        if (android.os.Build.VERSION.SDK_INT >= 29) {
            android.app.AppOpsManager Camera2StreamConfigurationMap = androidx.core.app.AppOpsManagerCompat.Api29Impl.Camera2StreamConfigurationMap(context);
            int Camera2StreamConfigurationMap2 = androidx.core.app.AppOpsManagerCompat.Api29Impl.Camera2StreamConfigurationMap(Camera2StreamConfigurationMap, str, android.os.Binder.getCallingUid(), str2);
            return Camera2StreamConfigurationMap2 != 0 ? Camera2StreamConfigurationMap2 : androidx.core.app.AppOpsManagerCompat.Api29Impl.Camera2StreamConfigurationMap(Camera2StreamConfigurationMap, str, i, androidx.core.app.AppOpsManagerCompat.Api29Impl.getHighSpeedVideoFpsRangesFor(context));
        }
        return noteProxyOpNoThrow(context, str, str2);
    }

    static class Api29Impl {
        private Api29Impl() {
        }

        static android.app.AppOpsManager Camera2StreamConfigurationMap(android.content.Context context) {
            return (android.app.AppOpsManager) context.getSystemService(android.app.AppOpsManager.class);
        }

        static int Camera2StreamConfigurationMap(android.app.AppOpsManager appOpsManager, java.lang.String str, int i, java.lang.String str2) {
            if (appOpsManager == null) {
                return 1;
            }
            return appOpsManager.checkOpNoThrow(str, i, str2);
        }

        static java.lang.String getHighSpeedVideoFpsRangesFor(android.content.Context context) {
            return context.getOpPackageName();
        }
    }
}
