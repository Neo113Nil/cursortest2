package com.moloco.sdk.internal.utils;

/* loaded from: classes5.dex */
public final class f {

    /* renamed from: a, reason: collision with root package name */
    public static final com.moloco.sdk.internal.utils.f f7337a = new com.moloco.sdk.internal.utils.f();
    public static final int b = 50;
    public static final int c = 75;
    public static final int d = 33;
    public static final int e = 66;
    public static final int f = 0;

    public final com.moloco.sdk.internal.utils.e a(java.io.File file) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(file, "file");
        try {
            java.lang.String parent = file.getParent();
            if (parent == null) {
                parent = file.getAbsolutePath();
            }
            android.os.StatFs statFs = new android.os.StatFs(parent);
            return new com.moloco.sdk.internal.utils.e(statFs.getAvailableBytes(), statFs.getTotalBytes());
        } catch (java.lang.Exception unused) {
            return null;
        }
    }

    public final java.lang.String b(int i) {
        return i < 50 ? com.adjust.sdk.Constants.LOW : i < 75 ? "medium" : com.adjust.sdk.Constants.HIGH;
    }

    public final java.lang.String a(java.io.File file, android.content.Context context) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(file, "file");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "context");
        java.io.File externalCacheDir = context.getExternalCacheDir();
        java.lang.String absolutePath = file.getAbsolutePath();
        if (externalCacheDir != null) {
            kotlin.jvm.internal.Intrinsics.checkNotNull(absolutePath);
            java.lang.String absolutePath2 = externalCacheDir.getAbsolutePath();
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(absolutePath2, "getAbsolutePath(...)");
            if (kotlin.text.StringsKt.startsWith$default(absolutePath, absolutePath2, false, 2, (java.lang.Object) null)) {
                return com.ironsource.D1.e;
            }
        }
        kotlin.jvm.internal.Intrinsics.checkNotNull(absolutePath);
        java.lang.String absolutePath3 = context.getCacheDir().getAbsolutePath();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(absolutePath3, "getAbsolutePath(...)");
        if (kotlin.text.StringsKt.startsWith$default(absolutePath, absolutePath3, false, 2, (java.lang.Object) null)) {
            return "internal";
        }
        return null;
    }

    public final java.lang.String a(int i) {
        if (i <= 33) {
            return "0-33";
        }
        if (i <= 66) {
            return "34-66";
        }
        if (i < 100) {
            return "67-99";
        }
        return "100";
    }
}
