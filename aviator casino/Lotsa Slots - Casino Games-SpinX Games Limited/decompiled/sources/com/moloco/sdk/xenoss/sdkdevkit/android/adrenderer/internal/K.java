package com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal;

/* loaded from: classes5.dex */
public final class K {
    public static final long a() {
        return java.lang.System.currentTimeMillis();
    }

    public static final java.text.SimpleDateFormat a(java.lang.String pattern) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(pattern, "pattern");
        java.text.SimpleDateFormat simpleDateFormat = new java.text.SimpleDateFormat(pattern, java.util.Locale.ROOT);
        simpleDateFormat.setTimeZone(java.util.TimeZone.getTimeZone("UTC"));
        return simpleDateFormat;
    }
}
