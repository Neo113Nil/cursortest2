package androidx.window.core;

@kotlin.Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\bÀ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0016\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0011\u0010\n\u001a\u00020\u00078G¢\u0006\u0006\u001a\u0004\b\b\u0010\t"}, d2 = {"Landroidx/window/core/ExtensionsUtil;", "", "<init>", "()V", "", "getHighSpeedVideoSizes", "Ljava/lang/String;", "", "getSafeVendorApiLevel", "()I", "safeVendorApiLevel"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class ExtensionsUtil {
    public static final androidx.window.core.ExtensionsUtil INSTANCE = new androidx.window.core.ExtensionsUtil();
    private static final java.lang.String getHighSpeedVideoSizes = kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(androidx.window.core.ExtensionsUtil.class).getSimpleName();

    private ExtensionsUtil() {
    }

    public final int getSafeVendorApiLevel() {
        try {
            return androidx.window.extensions.WindowExtensionsProvider.getWindowExtensions().getVendorApiLevel();
        } catch (java.lang.NoClassDefFoundError unused) {
            androidx.window.core.BuildConfig.INSTANCE.getVerificationMode();
            androidx.window.core.VerificationMode verificationMode = androidx.window.core.VerificationMode.LOG;
            return 0;
        } catch (java.lang.NullPointerException unused2) {
            androidx.window.core.BuildConfig.INSTANCE.getVerificationMode();
            androidx.window.core.VerificationMode verificationMode2 = androidx.window.core.VerificationMode.LOG;
            return 0;
        } catch (java.lang.UnsupportedOperationException unused3) {
            androidx.window.core.BuildConfig.INSTANCE.getVerificationMode();
            androidx.window.core.VerificationMode verificationMode3 = androidx.window.core.VerificationMode.LOG;
            return 0;
        }
    }
}
