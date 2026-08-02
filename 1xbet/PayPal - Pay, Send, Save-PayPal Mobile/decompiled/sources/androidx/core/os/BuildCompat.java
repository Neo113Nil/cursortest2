package androidx.core.os;

@kotlin.Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0011\n\u0002\u0010\b\n\u0002\b\u0007\bÆ\u0002\u0018\u00002\u00020\u0001:\u0002\u001f B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001f\u0010\b\u001a\u00020\u00072\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\b\u0010\tJ\u000f\u0010\n\u001a\u00020\u0007H\u0007¢\u0006\u0004\b\n\u0010\u000bJ\u000f\u0010\f\u001a\u00020\u0007H\u0007¢\u0006\u0004\b\f\u0010\u000bJ\u000f\u0010\r\u001a\u00020\u0007H\u0007¢\u0006\u0004\b\r\u0010\u000bJ\u000f\u0010\u000e\u001a\u00020\u0007H\u0007¢\u0006\u0004\b\u000e\u0010\u000bJ\u000f\u0010\u000f\u001a\u00020\u0007H\u0007¢\u0006\u0004\b\u000f\u0010\u000bJ\u000f\u0010\u0010\u001a\u00020\u0007H\u0007¢\u0006\u0004\b\u0010\u0010\u000bJ\u000f\u0010\u0011\u001a\u00020\u0007H\u0007¢\u0006\u0004\b\u0011\u0010\u000bJ\u000f\u0010\u0012\u001a\u00020\u0007H\u0007¢\u0006\u0004\b\u0012\u0010\u000bJ\u000f\u0010\u0013\u001a\u00020\u0007H\u0007¢\u0006\u0004\b\u0013\u0010\u000bJ\u000f\u0010\u0014\u001a\u00020\u0007H\u0007¢\u0006\u0004\b\u0014\u0010\u000bJ\u000f\u0010\u0015\u001a\u00020\u0007H\u0007¢\u0006\u0004\b\u0015\u0010\u000bJ\u000f\u0010\u0016\u001a\u00020\u0007H\u0007¢\u0006\u0004\b\u0016\u0010\u000bJ\u000f\u0010\u0017\u001a\u00020\u0007H\u0007¢\u0006\u0004\b\u0017\u0010\u000bJ\u000f\u0010\u0018\u001a\u00020\u0007H\u0007¢\u0006\u0004\b\u0018\u0010\u000bR\u0011\u0010\u001a\u001a\u00020\u00198\u0006¢\u0006\u0006\n\u0004\b\u001a\u0010\u001bR\u0011\u0010\u001c\u001a\u00020\u00198\u0006¢\u0006\u0006\n\u0004\b\u001c\u0010\u001bR\u0011\u0010\u001d\u001a\u00020\u00198\u0006¢\u0006\u0006\n\u0004\b\u001d\u0010\u001bR\u0011\u0010\u001e\u001a\u00020\u00198\u0006¢\u0006\u0006\n\u0004\b\u001e\u0010\u001b"}, d2 = {"Landroidx/core/os/BuildCompat;", "", "<init>", "()V", "", "codename", "buildCodename", "", "isAtLeastPreReleaseCodename", "(Ljava/lang/String;Ljava/lang/String;)Z", "isAtLeastN", "()Z", "isAtLeastNMR1", "isAtLeastO", "isAtLeastOMR1", "isAtLeastP", "isAtLeastQ", "isAtLeastR", "isAtLeastS", "isAtLeastSv2", "isAtLeastT", "isAtLeastU", "isAtLeastV", "isAtLeastB", "isAtLeastB_1", "", "R_EXTENSION_INT", com.visa.cbp.getEncExpo.warmup, "S_EXTENSION_INT", "T_EXTENSION_INT", "AD_SERVICES_EXTENSION_INT", "PrereleaseSdkCheck", "Api30Impl"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes.dex */
public final class BuildCompat {
    public static final int AD_SERVICES_EXTENSION_INT;
    public static final androidx.core.os.BuildCompat INSTANCE = new androidx.core.os.BuildCompat();
    public static final int R_EXTENSION_INT;
    public static final int S_EXTENSION_INT;
    public static final int T_EXTENSION_INT;

    @kotlin.Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\u0010\u001b\b\u0087\u0002\u0018\u00002\u00020\u0001B\u0000"}, d2 = {"Landroidx/core/os/BuildCompat$PrereleaseSdkCheck;", ""}, k = 1, mv = {2, 1, 0}, xi = 48)
    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.CLASS)
    @kotlin.annotation.Retention(kotlin.annotation.AnnotationRetention.BINARY)
    public @interface PrereleaseSdkCheck {
    }

    @kotlin.Deprecated(message = "Android N is a finalized release and this method is no longer necessary. It will be removed in a future release of this library. Instead, use `Build.VERSION.SDK_INT >= 24`.", replaceWith = @kotlin.ReplaceWith(expression = "android.os.Build.VERSION.SDK_INT >= 24", imports = {}))
    @kotlin.jvm.JvmStatic
    public static final boolean isAtLeastN() {
        return true;
    }

    @kotlin.Deprecated(message = "Android N MR1 is a finalized release and this method is no longer necessary. It will be removed in a future release of this library. Instead, use `Build.VERSION.SDK_INT >= 25`.", replaceWith = @kotlin.ReplaceWith(expression = "android.os.Build.VERSION.SDK_INT >= 25", imports = {}))
    @kotlin.jvm.JvmStatic
    public static final boolean isAtLeastNMR1() {
        return true;
    }

    @kotlin.Deprecated(message = "Android O is a finalized release and this method is no longer necessary. It will be removed in a future release of this library. Instead use `Build.VERSION.SDK_INT >= 26`.", replaceWith = @kotlin.ReplaceWith(expression = "android.os.Build.VERSION.SDK_INT >= 26", imports = {}))
    @kotlin.jvm.JvmStatic
    public static final boolean isAtLeastO() {
        return true;
    }

    private BuildCompat() {
    }

    private static final java.lang.Integer getHighResolutionOutputSizeshNQ4ISI(java.lang.String str) {
        java.lang.String upperCase = str.toUpperCase(java.util.Locale.ROOT);
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(upperCase, "");
        return kotlin.jvm.internal.Intrinsics.areEqual(upperCase, "BAKLAVA") ? 0 : null;
    }

    @kotlin.jvm.JvmStatic
    public static final boolean isAtLeastPreReleaseCodename(java.lang.String codename, java.lang.String buildCodename) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(codename, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(buildCodename, "");
        if (kotlin.jvm.internal.Intrinsics.areEqual("REL", buildCodename)) {
            return false;
        }
        java.lang.Integer highResolutionOutputSizeshNQ4ISI = getHighResolutionOutputSizeshNQ4ISI(buildCodename);
        java.lang.Integer highResolutionOutputSizeshNQ4ISI2 = getHighResolutionOutputSizeshNQ4ISI(codename);
        if (highResolutionOutputSizeshNQ4ISI != null && highResolutionOutputSizeshNQ4ISI2 != null) {
            return highResolutionOutputSizeshNQ4ISI.intValue() >= highResolutionOutputSizeshNQ4ISI2.intValue();
        }
        if (highResolutionOutputSizeshNQ4ISI != null || highResolutionOutputSizeshNQ4ISI2 != null) {
            return highResolutionOutputSizeshNQ4ISI != null;
        }
        java.lang.String upperCase = buildCodename.toUpperCase(java.util.Locale.ROOT);
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(upperCase, "");
        java.lang.String upperCase2 = codename.toUpperCase(java.util.Locale.ROOT);
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(upperCase2, "");
        return upperCase.compareTo(upperCase2) >= 0;
    }

    @kotlin.Deprecated(message = "Android O MR1 is a finalized release and this method is no longer necessary. It will be removed in a future release of this library. Instead, use `Build.VERSION.SDK_INT >= 27`.", replaceWith = @kotlin.ReplaceWith(expression = "android.os.Build.VERSION.SDK_INT >= 27", imports = {}))
    @kotlin.jvm.JvmStatic
    public static final boolean isAtLeastOMR1() {
        return android.os.Build.VERSION.SDK_INT >= 27;
    }

    @kotlin.Deprecated(message = "Android P is a finalized release and this method is no longer necessary. It will be removed in a future release of this library. Instead, use `Build.VERSION.SDK_INT >= 28`.", replaceWith = @kotlin.ReplaceWith(expression = "android.os.Build.VERSION.SDK_INT >= 28", imports = {}))
    @kotlin.jvm.JvmStatic
    public static final boolean isAtLeastP() {
        return android.os.Build.VERSION.SDK_INT >= 28;
    }

    @kotlin.Deprecated(message = "Android Q is a finalized release and this method is no longer necessary. It will be removed in a future release of this library. Instead, use `Build.VERSION.SDK_INT >= 29`.", replaceWith = @kotlin.ReplaceWith(expression = "android.os.Build.VERSION.SDK_INT >= 29", imports = {}))
    @kotlin.jvm.JvmStatic
    public static final boolean isAtLeastQ() {
        return android.os.Build.VERSION.SDK_INT >= 29;
    }

    @kotlin.Deprecated(message = "Android R is a finalized release and this method is no longer necessary. It will be removed in a future release of this library. Instead, use `Build.VERSION.SDK_INT >= 30`.", replaceWith = @kotlin.ReplaceWith(expression = "android.os.Build.VERSION.SDK_INT >= 30", imports = {}))
    @kotlin.jvm.JvmStatic
    public static final boolean isAtLeastR() {
        return android.os.Build.VERSION.SDK_INT >= 30;
    }

    @kotlin.Deprecated(message = "Android S is a finalized release and this method is no longer necessary. It will be removed in a future release of this library. Instead, use `Build.VERSION.SDK_INT >= 31`.", replaceWith = @kotlin.ReplaceWith(expression = "android.os.Build.VERSION.SDK_INT >= 31", imports = {}))
    @kotlin.jvm.JvmStatic
    public static final boolean isAtLeastS() {
        if (android.os.Build.VERSION.SDK_INT >= 31) {
            return true;
        }
        if (android.os.Build.VERSION.SDK_INT < 30) {
            return false;
        }
        java.lang.String str = android.os.Build.VERSION.CODENAME;
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(str, "");
        return isAtLeastPreReleaseCodename("S", str);
    }

    @kotlin.Deprecated(message = "Android Sv2 is a finalized release and this method is no longer necessary. It will be removed in a future release of this library. Instead, use `Build.VERSION.SDK_INT >= 32`.", replaceWith = @kotlin.ReplaceWith(expression = "android.os.Build.VERSION.SDK_INT >= 32", imports = {}))
    @kotlin.jvm.JvmStatic
    public static final boolean isAtLeastSv2() {
        if (android.os.Build.VERSION.SDK_INT >= 32) {
            return true;
        }
        if (android.os.Build.VERSION.SDK_INT < 31) {
            return false;
        }
        java.lang.String str = android.os.Build.VERSION.CODENAME;
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(str, "");
        return isAtLeastPreReleaseCodename("Sv2", str);
    }

    @kotlin.Deprecated(message = "Android Tiramisu is a finalized release and this method is no longer necessary. It will be removed in a future release of this library. Instead, use `Build.VERSION.SDK_INT >= 33`.", replaceWith = @kotlin.ReplaceWith(expression = "android.os.Build.VERSION.SDK_INT >= 33", imports = {}))
    @kotlin.jvm.JvmStatic
    public static final boolean isAtLeastT() {
        if (android.os.Build.VERSION.SDK_INT >= 33) {
            return true;
        }
        if (android.os.Build.VERSION.SDK_INT < 32) {
            return false;
        }
        java.lang.String str = android.os.Build.VERSION.CODENAME;
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(str, "");
        return isAtLeastPreReleaseCodename("Tiramisu", str);
    }

    @kotlin.Deprecated(message = "Android UpsideDownCase is a finalized release and this method is no longer necessary. It will be removed in a future release of this library. Instead, use `Build.VERSION.SDK_INT >= 34`.", replaceWith = @kotlin.ReplaceWith(expression = "android.os.Build.VERSION.SDK_INT >= 34", imports = {}))
    @kotlin.jvm.JvmStatic
    public static final boolean isAtLeastU() {
        if (android.os.Build.VERSION.SDK_INT >= 34) {
            return true;
        }
        if (android.os.Build.VERSION.SDK_INT < 33) {
            return false;
        }
        java.lang.String str = android.os.Build.VERSION.CODENAME;
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(str, "");
        return isAtLeastPreReleaseCodename("UpsideDownCake", str);
    }

    @kotlin.Deprecated(message = "Android VanillaIceCream is a finalized release and this method is no longer necessary. It will be removed in a future release of this library. Instead, use `Build.VERSION.SDK_INT >= 35`.", replaceWith = @kotlin.ReplaceWith(expression = "android.os.Build.VERSION.SDK_INT >= 35", imports = {}))
    @kotlin.jvm.JvmStatic
    public static final boolean isAtLeastV() {
        if (android.os.Build.VERSION.SDK_INT >= 35) {
            return true;
        }
        if (android.os.Build.VERSION.SDK_INT < 34) {
            return false;
        }
        java.lang.String str = android.os.Build.VERSION.CODENAME;
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(str, "");
        return isAtLeastPreReleaseCodename("VanillaIceCream", str);
    }

    @kotlin.jvm.JvmStatic
    public static final boolean isAtLeastB() {
        if (android.os.Build.VERSION.SDK_INT >= 36) {
            return true;
        }
        if (android.os.Build.VERSION.SDK_INT < 35) {
            return false;
        }
        java.lang.String str = android.os.Build.VERSION.CODENAME;
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(str, "");
        return isAtLeastPreReleaseCodename("Baklava", str);
    }

    @kotlin.jvm.JvmStatic
    public static final boolean isAtLeastB_1() {
        return android.os.Build.VERSION.SDK_INT >= 36 && androidx.core.os.BuildCompat$$ExternalSyntheticBackportWithForwarding0.m() >= 3600001;
    }

    static {
        R_EXTENSION_INT = android.os.Build.VERSION.SDK_INT >= 30 ? androidx.core.os.BuildCompat.Api30Impl.INSTANCE.getHighResolutionOutputSizeshNQ4ISI(30) : 0;
        S_EXTENSION_INT = android.os.Build.VERSION.SDK_INT >= 30 ? androidx.core.os.BuildCompat.Api30Impl.INSTANCE.getHighResolutionOutputSizeshNQ4ISI(31) : 0;
        T_EXTENSION_INT = android.os.Build.VERSION.SDK_INT >= 30 ? androidx.core.os.BuildCompat.Api30Impl.INSTANCE.getHighResolutionOutputSizeshNQ4ISI(33) : 0;
        AD_SERVICES_EXTENSION_INT = android.os.Build.VERSION.SDK_INT >= 30 ? androidx.core.os.BuildCompat.Api30Impl.INSTANCE.getHighResolutionOutputSizeshNQ4ISI(1000000) : 0;
    }

    @kotlin.Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\bÂ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0015\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Landroidx/core/os/BuildCompat$Api30Impl;", "", "<init>", "()V", "", "p0", "getHighResolutionOutputSizeshNQ4ISI", "(I)I"}, k = 1, mv = {2, 1, 0}, xi = 48)
    static final class Api30Impl {
        public static final androidx.core.os.BuildCompat.Api30Impl INSTANCE = new androidx.core.os.BuildCompat.Api30Impl();

        private Api30Impl() {
        }

        public final int getHighResolutionOutputSizeshNQ4ISI(int p0) {
            return android.os.ext.SdkExtensions.getExtensionVersion(p0);
        }
    }
}
