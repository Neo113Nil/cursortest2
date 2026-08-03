package com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast;

/* loaded from: classes5.dex */
public final class n {

    /* renamed from: a, reason: collision with root package name */
    public static final kotlin.Lazy f7793a = kotlin.LazyKt.lazy(new kotlin.jvm.functions.Function0() { // from class: com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.n$$ExternalSyntheticLambda0
        @Override // kotlin.jvm.functions.Function0
        public final java.lang.Object invoke() {
            return com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.n.a();
        }
    });
    public static final kotlin.text.Regex b = new kotlin.text.Regex("\\[ERRORCODE]");
    public static final kotlin.text.Regex c = new kotlin.text.Regex("\\[CONTENTPLAYHEAD]");
    public static final kotlin.text.Regex d = new kotlin.text.Regex("\\[CACHEBUSTING]");
    public static final kotlin.text.Regex e = new kotlin.text.Regex("\\[ASSETURI]");
    public static final kotlin.text.Regex f = new kotlin.text.Regex("\\[[^]]*]");
    public static final kotlin.text.Regex g = new kotlin.text.Regex("\\[MEDIAPLAYHEAD]");
    public static final kotlin.text.Regex h = new kotlin.text.Regex("\\[ADPLAYHEAD]");

    public static final com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.l b() {
        return e();
    }

    public static final java.lang.String d() {
        kotlin.jvm.internal.StringCompanionObject stringCompanionObject = kotlin.jvm.internal.StringCompanionObject.INSTANCE;
        java.lang.String format = java.lang.String.format("%08d", java.util.Arrays.copyOf(new java.lang.Object[]{java.lang.Integer.valueOf(kotlin.random.Random.INSTANCE.nextInt(1, 99999999))}, 1));
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(format, "format(...)");
        return format;
    }

    public static final com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.m e() {
        return (com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.m) f7793a.getValue();
    }

    public static final com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.m a() {
        return new com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.m(com.moloco.sdk.service_locator.a.i.f7350a.c());
    }

    public static final java.lang.String b(java.lang.String str, java.lang.Integer num, java.lang.Integer num2, java.lang.String str2, java.lang.String str3) {
        if (num != null) {
            str = b.replace(str, num.toString());
        }
        if (num2 != null) {
            str = g.replace(h.replace(c.replace(str, b(num2.intValue())), a(num2.intValue())), c(num2.intValue()));
        }
        if (str2 != null) {
            str = e.replace(str, a(str2));
        }
        if (str3 != null) {
            str = d.replace(str, str3);
        }
        return f.replace(str, "");
    }

    public static final java.lang.String c(int i) {
        return com.ironsource.C2945a2.f;
    }

    public static final java.lang.String a(int i) {
        return b(i);
    }

    public static final java.lang.String a(java.lang.String str) {
        try {
            return java.net.URLEncoder.encode(str, "UTF-8");
        } catch (java.lang.Exception unused) {
            return "";
        }
    }

    public static final java.lang.String b(int i) {
        long j = i;
        kotlin.jvm.internal.StringCompanionObject stringCompanionObject = kotlin.jvm.internal.StringCompanionObject.INSTANCE;
        java.util.concurrent.TimeUnit timeUnit = java.util.concurrent.TimeUnit.MILLISECONDS;
        java.lang.String format = java.lang.String.format("%02d:%02d:%02d.%03d", java.util.Arrays.copyOf(new java.lang.Object[]{java.lang.Long.valueOf(timeUnit.toHours(j)), java.lang.Long.valueOf(timeUnit.toMinutes(j) % java.util.concurrent.TimeUnit.HOURS.toMinutes(1L)), java.lang.Long.valueOf(timeUnit.toSeconds(j) % java.util.concurrent.TimeUnit.MINUTES.toSeconds(1L)), java.lang.Long.valueOf(j % 1000)}, 4));
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(format, "format(...)");
        return format;
    }
}
