package io.appmetrica.analytics.coreutils.internal.system;

/* loaded from: classes.dex */
public final class ConstantDeviceInfo {
    public static final java.lang.String APP_PLATFORM = "android";
    public static final io.appmetrica.analytics.coreutils.internal.system.ConstantDeviceInfo INSTANCE = new io.appmetrica.analytics.coreutils.internal.system.ConstantDeviceInfo();
    public static final java.lang.String MANUFACTURER = android.os.Build.MANUFACTURER;
    public static final java.lang.String MODEL = android.os.Build.MODEL;
    public static final java.lang.String OS_VERSION = android.os.Build.VERSION.RELEASE;

    @android.annotation.SuppressLint({"AnnotateVersionCheck"})
    public static final int OS_API_LEVEL = android.os.Build.VERSION.SDK_INT;
    public static final java.lang.String DEVICE_ROOT_STATUS = java.lang.String.valueOf(io.appmetrica.analytics.coreutils.internal.system.RootChecker.isRootedPhone());

    private ConstantDeviceInfo() {
    }
}
