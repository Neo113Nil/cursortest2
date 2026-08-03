package io.appmetrica.analytics.coreutils.internal.system;

/* loaded from: classes.dex */
public final class RootChecker {

    /* renamed from: a, reason: collision with root package name */
    private static final java.lang.String[] f3793a = {"/sbin/", "/system/bin/", "/system/xbin/", "/data/local/xbin/", "/data/local/bin/", "/system/sd/xbin/", "/system/bin/failsafe/", "/data/local/"};

    public static final class RootStatus {
        public static final int NOT_ROOT = 0;
        public static final int ROOT = 1;
    }

    public static int isRootedPhone() {
        return (isSuperuserApkExists() || isSuperuserNativeLibExists()) ? 1 : 0;
    }

    public static boolean isSuperuserApkExists() {
        try {
            return new java.io.File("/system/app/Superuser/Superuser.apk").exists();
        } catch (java.lang.Throwable unused) {
            return false;
        }
    }

    public static boolean isSuperuserNativeLibExists() {
        java.lang.String[] strArr = f3793a;
        for (int i2 = 0; i2 < 8; i2++) {
            java.lang.String str = strArr[i2];
            try {
                if (io.appmetrica.analytics.coreutils.internal.AndroidUtils.isApiAchieved(31)) {
                    continue;
                } else {
                    if (new java.io.File(str + "su").exists()) {
                        return true;
                    }
                }
            } catch (java.lang.Throwable unused) {
            }
        }
        return false;
    }
}
