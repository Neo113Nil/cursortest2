package io.appmetrica.analytics.coreutils.internal;

/* loaded from: classes.dex */
public final class AndroidUtils {
    public static final io.appmetrica.analytics.coreutils.internal.AndroidUtils INSTANCE = new io.appmetrica.analytics.coreutils.internal.AndroidUtils();

    private AndroidUtils() {
    }

    @android.annotation.SuppressLint({"AnnotateVersionCheck"})
    public static final boolean isApiAchieved(int i2) {
        return android.os.Build.VERSION.SDK_INT >= i2;
    }
}
