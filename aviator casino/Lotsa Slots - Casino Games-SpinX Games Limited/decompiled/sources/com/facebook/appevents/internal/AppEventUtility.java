package com.facebook.appevents.internal;

/* compiled from: AppEventUtility.kt */
@kotlin.Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u0012\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0006\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\b\u0010\b\u001a\u00020\tH\u0007J\b\u0010\n\u001a\u00020\tH\u0007J\u0010\u0010\u000b\u001a\u00020\u00042\u0006\u0010\f\u001a\u00020\rH\u0007J\b\u0010\u000e\u001a\u00020\u0004H\u0007J\u0014\u0010\u000f\u001a\u0004\u0018\u00010\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0012H\u0007J\b\u0010\u0013\u001a\u00020\u0006H\u0007J\u0012\u0010\u0014\u001a\u00020\u00152\b\u0010\u0016\u001a\u0004\u0018\u00010\u0004H\u0007R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u0014\u0010\u0005\u001a\u00020\u00068CX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u0005\u0010\u0007¨\u0006\u0017"}, d2 = {"Lcom/facebook/appevents/internal/AppEventUtility;", "", "()V", "PRICE_REGEX", "", "isMainThread", "", "()Z", "assertIsMainThread", "", "assertIsNotMainThread", "bytesToHex", "bytes", "", "getAppVersion", "getRootView", "Landroid/view/View;", "activity", "Landroid/app/Activity;", "isEmulator", "normalizePrice", "", "value", "facebook-core_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
/* loaded from: classes2.dex */
public final class AppEventUtility {
    public static final com.facebook.appevents.internal.AppEventUtility INSTANCE = new com.facebook.appevents.internal.AppEventUtility();
    private static final java.lang.String PRICE_REGEX = "[-+]*\\d+([.,]\\d+)*([.,]\\d+)?";

    @kotlin.jvm.JvmStatic
    public static final void assertIsMainThread() {
    }

    @kotlin.jvm.JvmStatic
    public static final void assertIsNotMainThread() {
    }

    private AppEventUtility() {
    }

    @kotlin.jvm.JvmStatic
    public static final double normalizePrice(java.lang.String value) {
        try {
            java.util.regex.Matcher matcher = java.util.regex.Pattern.compile(PRICE_REGEX, 8).matcher(value);
            if (!matcher.find()) {
                return 0.0d;
            }
            java.lang.String group = matcher.group(0);
            com.facebook.internal.Utility utility = com.facebook.internal.Utility.INSTANCE;
            return java.text.NumberFormat.getNumberInstance(com.facebook.internal.Utility.getCurrentLocale()).parse(group).doubleValue();
        } catch (java.text.ParseException unused) {
            return 0.0d;
        }
    }

    @kotlin.jvm.JvmStatic
    public static final java.lang.String bytesToHex(byte[] bytes) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(bytes, "bytes");
        java.lang.StringBuffer stringBuffer = new java.lang.StringBuffer();
        int length = bytes.length;
        int i = 0;
        while (i < length) {
            byte b = bytes[i];
            i++;
            kotlin.jvm.internal.StringCompanionObject stringCompanionObject = kotlin.jvm.internal.StringCompanionObject.INSTANCE;
            java.lang.String format = java.lang.String.format("%02x", java.util.Arrays.copyOf(new java.lang.Object[]{java.lang.Byte.valueOf(b)}, 1));
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(format, "java.lang.String.format(format, *args)");
            stringBuffer.append(format);
        }
        java.lang.String stringBuffer2 = stringBuffer.toString();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(stringBuffer2, "sb.toString()");
        return stringBuffer2;
    }

    /* JADX WARN: Code restructure failed: missing block: B:16:0x0081, code lost:
    
        if (kotlin.text.StringsKt.startsWith$default(r0, "generic", false, 2, (java.lang.Object) null) == false) goto L18;
     */
    @kotlin.jvm.JvmStatic
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final boolean isEmulator() {
        java.lang.String FINGERPRINT = android.os.Build.FINGERPRINT;
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(FINGERPRINT, "FINGERPRINT");
        if (!kotlin.text.StringsKt.startsWith$default(FINGERPRINT, "generic", false, 2, (java.lang.Object) null)) {
            java.lang.String FINGERPRINT2 = android.os.Build.FINGERPRINT;
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(FINGERPRINT2, "FINGERPRINT");
            if (!kotlin.text.StringsKt.startsWith$default(FINGERPRINT2, "unknown", false, 2, (java.lang.Object) null)) {
                java.lang.String MODEL = android.os.Build.MODEL;
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(MODEL, "MODEL");
                if (!kotlin.text.StringsKt.contains$default((java.lang.CharSequence) MODEL, (java.lang.CharSequence) "google_sdk", false, 2, (java.lang.Object) null)) {
                    java.lang.String MODEL2 = android.os.Build.MODEL;
                    kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(MODEL2, "MODEL");
                    if (!kotlin.text.StringsKt.contains$default((java.lang.CharSequence) MODEL2, (java.lang.CharSequence) "Emulator", false, 2, (java.lang.Object) null)) {
                        java.lang.String MODEL3 = android.os.Build.MODEL;
                        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(MODEL3, "MODEL");
                        if (!kotlin.text.StringsKt.contains$default((java.lang.CharSequence) MODEL3, (java.lang.CharSequence) "Android SDK built for x86", false, 2, (java.lang.Object) null)) {
                            java.lang.String MANUFACTURER = android.os.Build.MANUFACTURER;
                            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(MANUFACTURER, "MANUFACTURER");
                            if (!kotlin.text.StringsKt.contains$default((java.lang.CharSequence) MANUFACTURER, (java.lang.CharSequence) "Genymotion", false, 2, (java.lang.Object) null)) {
                                java.lang.String BRAND = android.os.Build.BRAND;
                                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(BRAND, "BRAND");
                                if (kotlin.text.StringsKt.startsWith$default(BRAND, "generic", false, 2, (java.lang.Object) null)) {
                                    java.lang.String DEVICE = android.os.Build.DEVICE;
                                    kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(DEVICE, "DEVICE");
                                }
                                if (!kotlin.jvm.internal.Intrinsics.areEqual("google_sdk", android.os.Build.PRODUCT)) {
                                    return false;
                                }
                            }
                        }
                    }
                }
            }
        }
        return true;
    }

    @kotlin.jvm.JvmStatic
    private static final boolean isMainThread() {
        return kotlin.jvm.internal.Intrinsics.areEqual(android.os.Looper.myLooper(), android.os.Looper.getMainLooper());
    }

    @kotlin.jvm.JvmStatic
    public static final java.lang.String getAppVersion() {
        com.facebook.FacebookSdk facebookSdk = com.facebook.FacebookSdk.INSTANCE;
        android.content.Context applicationContext = com.facebook.FacebookSdk.getApplicationContext();
        try {
            java.lang.String str = applicationContext.getPackageManager().getPackageInfo(applicationContext.getPackageName(), 0).versionName;
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(str, "{\n      val packageInfo = context.packageManager.getPackageInfo(context.packageName, 0)\n      packageInfo.versionName\n    }");
            return str;
        } catch (android.content.pm.PackageManager.NameNotFoundException unused) {
            return "";
        }
    }

    @kotlin.jvm.JvmStatic
    public static final android.view.View getRootView(android.app.Activity activity) {
        if (com.facebook.internal.instrument.crashshield.CrashShieldHandler.isObjectCrashing(com.facebook.appevents.internal.AppEventUtility.class) || activity == null) {
            return null;
        }
        try {
            try {
                android.view.Window window = activity.getWindow();
                if (window == null) {
                    return null;
                }
                return window.getDecorView().getRootView();
            } catch (java.lang.Exception unused) {
                return null;
            }
        } catch (java.lang.Throwable th) {
            com.facebook.internal.instrument.crashshield.CrashShieldHandler.handleThrowable(th, com.facebook.appevents.internal.AppEventUtility.class);
            return null;
        }
    }
}
