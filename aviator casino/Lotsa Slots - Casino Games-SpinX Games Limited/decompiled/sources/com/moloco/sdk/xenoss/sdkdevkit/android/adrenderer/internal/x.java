package com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal;

/* loaded from: classes5.dex */
public final class x {

    /* renamed from: a, reason: collision with root package name */
    public static final java.lang.String f7971a = "START_MUTED";
    public static final java.lang.String b = "CLOSE_DELAY_SECONDS";
    public static final java.lang.String c = "DEC_DELAY_SECONDS";
    public static final java.lang.String d = "SKIP_DELAY_SECONDS";
    public static final java.lang.String e = "SKIP_ENABLED";
    public static final java.lang.String f = "AUTO_STORE_ON_SKIP";
    public static final java.lang.String g = "AUTO_STORE_ON_COMPLETE";
    public static final java.lang.String h = "ANDROID_INLINE_ENABLED";
    public static final java.lang.String i = "ANDROID_INLINE_URL";
    public static final java.lang.String j = "BUNDLE_ID";
    public static final java.lang.String k = "ANDROID_AUTOINLINE_ENABLED";
    public static final java.lang.String l = "ANDROID_AUTOINLINE_EVENTLINK";
    public static final java.lang.String m = "ANDROID_AUTOINLINE_SKIP";
    public static final java.lang.String n = "ANDROID_AUTOINLINE_CLICKTHROUGH";
    public static final java.lang.String o = "ANDROID_AUTOINLINE_FORCE_FULLSCREEN";

    public static final void a(android.content.Intent intent, int i2) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(intent, "<this>");
        intent.putExtra(b, i2);
    }

    public static final void b(android.content.Intent intent, int i2) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(intent, "<this>");
        intent.putExtra(c, i2);
    }

    public static final void c(android.content.Intent intent, int i2) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(intent, "<this>");
        intent.putExtra(d, i2);
    }

    public static final void d(android.content.Intent intent, boolean z) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(intent, "<this>");
        intent.putExtra(h, z);
    }

    public static final void e(android.content.Intent intent, boolean z) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(intent, "<this>");
        intent.putExtra(g, z);
    }

    public static final void f(android.content.Intent intent, boolean z) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(intent, "<this>");
        intent.putExtra(f, z);
    }

    public static final void g(android.content.Intent intent, boolean z) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(intent, "<this>");
        intent.putExtra(f7971a, z);
    }

    public static final boolean h(android.content.Intent intent) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(intent, "<this>");
        return intent.getBooleanExtra(g, false);
    }

    public static final boolean i(android.content.Intent intent) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(intent, "<this>");
        return intent.getBooleanExtra(f, false);
    }

    public static final java.lang.String j(android.content.Intent intent) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(intent, "<this>");
        return intent.getStringExtra(j);
    }

    public static final int k(android.content.Intent intent) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(intent, "<this>");
        return intent.getIntExtra(b, 0);
    }

    public static final int l(android.content.Intent intent) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(intent, "<this>");
        return intent.getIntExtra(c, 0);
    }

    public static final java.lang.Boolean m(android.content.Intent intent) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(intent, "<this>");
        if (intent.hasExtra(e)) {
            return java.lang.Boolean.valueOf(intent.getBooleanExtra(e, false));
        }
        return null;
    }

    public static final int n(android.content.Intent intent) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(intent, "<this>");
        return intent.getIntExtra(d, 0);
    }

    public static final boolean o(android.content.Intent intent) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(intent, "<this>");
        return intent.getBooleanExtra(f7971a, true);
    }

    public static final void a(android.content.Intent intent, java.lang.Boolean bool) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(intent, "<this>");
        if (bool != null) {
            intent.putExtra(e, bool.booleanValue());
        }
    }

    public static final boolean b(android.content.Intent intent) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(intent, "<this>");
        return intent.getBooleanExtra(k, false);
    }

    public static final void c(android.content.Intent intent, java.lang.String value) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(intent, "<this>");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(value, "value");
        intent.putExtra(i, value);
    }

    public static final void d(android.content.Intent intent, java.lang.String value) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(intent, "<this>");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(value, "value");
        intent.putExtra(j, value);
    }

    public static final boolean e(android.content.Intent intent) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(intent, "<this>");
        return intent.getBooleanExtra(m, false);
    }

    public static final boolean f(android.content.Intent intent) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(intent, "<this>");
        return intent.getBooleanExtra(h, false);
    }

    public static final java.lang.String g(android.content.Intent intent) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(intent, "<this>");
        return intent.getStringExtra(i);
    }

    public static final void a(android.content.Intent intent, boolean z) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(intent, "<this>");
        intent.putExtra(k, z);
    }

    public static final void b(android.content.Intent intent, java.lang.String value) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(intent, "<this>");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(value, "value");
        intent.putExtra(l, value);
    }

    public static final java.lang.String c(android.content.Intent intent) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(intent, "<this>");
        return intent.getStringExtra(l);
    }

    public static final boolean d(android.content.Intent intent) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(intent, "<this>");
        return intent.getBooleanExtra(o, false);
    }

    public static final java.lang.String a(android.content.Intent intent) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(intent, "<this>");
        return intent.getStringExtra(n);
    }

    public static final void b(android.content.Intent intent, boolean z) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(intent, "<this>");
        intent.putExtra(o, z);
    }

    public static final void c(android.content.Intent intent, boolean z) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(intent, "<this>");
        intent.putExtra(m, z);
    }

    public static final void a(android.content.Intent intent, java.lang.String value) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(intent, "<this>");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(value, "value");
        intent.putExtra(n, value);
    }
}
