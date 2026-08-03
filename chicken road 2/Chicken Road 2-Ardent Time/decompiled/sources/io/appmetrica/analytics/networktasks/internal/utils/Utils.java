package io.appmetrica.analytics.networktasks.internal.utils;

/* loaded from: classes.dex */
public final class Utils {
    public static final io.appmetrica.analytics.networktasks.internal.utils.Utils INSTANCE = new io.appmetrica.analytics.networktasks.internal.utils.Utils();

    private Utils() {
    }

    public static final boolean isBadRequest(int i2) {
        return i2 == 400;
    }
}
