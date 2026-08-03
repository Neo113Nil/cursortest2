package com.moloco.sdk.internal.services;

/* renamed from: com.moloco.sdk.internal.services.i, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C3438i implements com.moloco.sdk.internal.services.y {
    public static final int c = 8;

    /* renamed from: a, reason: collision with root package name */
    public final android.content.Context f7279a;
    public final kotlin.Lazy b;

    public C3438i(android.content.Context context) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "context");
        this.f7279a = context;
        this.b = kotlin.LazyKt.lazy(new kotlin.jvm.functions.Function0() { // from class: com.moloco.sdk.internal.services.i$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return java.lang.Boolean.valueOf(com.moloco.sdk.internal.services.C3438i.a(com.moloco.sdk.internal.services.C3438i.this));
            }
        });
    }

    public static final boolean a(com.moloco.sdk.internal.services.C3438i c3438i) {
        return c3438i.f7279a.getResources().getConfiguration().smallestScreenWidthDp >= 600;
    }

    @Override // com.moloco.sdk.internal.services.y
    public com.moloco.sdk.internal.services.x b() {
        java.lang.String str;
        java.lang.String str2 = android.os.Build.MANUFACTURER;
        java.lang.String str3 = str2 == null ? "" : str2;
        java.lang.String str4 = android.os.Build.MODEL;
        java.lang.String str5 = str4 == null ? "" : str4;
        java.lang.String str6 = android.os.Build.HARDWARE;
        java.lang.String str7 = str6 == null ? "" : str6;
        boolean e = e();
        java.lang.String RELEASE = android.os.Build.VERSION.RELEASE;
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(RELEASE, "RELEASE");
        int i = android.os.Build.VERSION.SDK_INT;
        java.lang.String language = java.util.Locale.getDefault().getLanguage();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(language, "getLanguage(...)");
        android.telephony.TelephonyManager telephonyManager = (android.telephony.TelephonyManager) androidx.core.content.ContextCompat.getSystemService(this.f7279a, android.telephony.TelephonyManager.class);
        if (telephonyManager == null || (str = telephonyManager.getNetworkOperatorName()) == null) {
            str = "";
        }
        float f = android.content.res.Resources.getSystem().getDisplayMetrics().density;
        long currentTimeMillis = java.lang.System.currentTimeMillis() - android.os.SystemClock.elapsedRealtime();
        java.lang.String str8 = str6 == null ? "" : str6;
        java.lang.String str9 = android.os.Build.BRAND;
        return new com.moloco.sdk.internal.services.x(str3, str5, str7, e, "android", RELEASE, i, language, str, f, currentTimeMillis, str8, str9 == null ? "" : str9);
    }

    @Override // com.moloco.sdk.internal.services.y
    public java.lang.String c() {
        java.lang.String language = java.util.Locale.getDefault().getLanguage();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(language, "getLanguage(...)");
        return language;
    }

    @Override // com.moloco.sdk.internal.services.y
    public java.lang.String d() {
        java.lang.Object systemService = this.f7279a.getSystemService("input_method");
        kotlin.jvm.internal.Intrinsics.checkNotNull(systemService, "null cannot be cast to non-null type android.view.inputmethod.InputMethodManager");
        android.view.inputmethod.InputMethodSubtype currentInputMethodSubtype = ((android.view.inputmethod.InputMethodManager) systemService).getCurrentInputMethodSubtype();
        if (currentInputMethodSubtype != null) {
            return currentInputMethodSubtype.getLocale();
        }
        return null;
    }

    public final boolean e() {
        return ((java.lang.Boolean) this.b.getValue()).booleanValue();
    }

    @Override // com.moloco.sdk.internal.services.y
    @kotlin.Deprecated(message = "Use invoke() instead", replaceWith = @kotlin.ReplaceWith(expression = "deviceInfo", imports = {}))
    public com.moloco.sdk.internal.services.x invoke() {
        return b();
    }

    @Override // com.moloco.sdk.internal.services.y
    public java.lang.Boolean a() {
        try {
            java.lang.Object systemService = this.f7279a.getSystemService("sensor");
            kotlin.jvm.internal.Intrinsics.checkNotNull(systemService, "null cannot be cast to non-null type android.hardware.SensorManager");
            return java.lang.Boolean.valueOf(((android.hardware.SensorManager) systemService).getDefaultSensor(4) != null);
        } catch (java.lang.Exception unused) {
            return null;
        }
    }
}
