package com.paypal.oslo.feature.verificationcapture.util;

@kotlin.Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0015\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\n\u001a\u00020\tH\u0002¢\u0006\u0004\b\n\u0010\u000b"}, d2 = {"Lcom/paypal/oslo/feature/verificationcapture/util/DeviceFingerprintUtil;", "", "<init>", "()V", "Landroid/content/Context;", "context", "Lcom/paypal/oslo/feature/verificationcapture/domain/model/DeviceInfo;", "collectDeviceInfo", "(Landroid/content/Context;)Lcom/paypal/oslo/feature/verificationcapture/domain/model/DeviceInfo;", "", "getHighSpeedVideoSizes", "()Z"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class DeviceFingerprintUtil {
    public static final int $stable = 0;
    public static final com.paypal.oslo.feature.verificationcapture.util.DeviceFingerprintUtil INSTANCE = new com.paypal.oslo.feature.verificationcapture.util.DeviceFingerprintUtil();

    private DeviceFingerprintUtil() {
    }

    /* JADX WARN: Code restructure failed: missing block: B:24:0x00de, code lost:
    
        if (kotlin.text.StringsKt.startsWith$default(r3, "generic", false, 2, (java.lang.Object) null) == false) goto L34;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x0069, code lost:
    
        r0 = true;
     */
    /* JADX WARN: Removed duplicated region for block: B:30:0x00ff  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x010a  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x010c  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0101  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final com.paypal.oslo.feature.verificationcapture.domain.model.DeviceInfo collectDeviceInfo(android.content.Context context) {
        boolean z;
        boolean z2;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "");
        android.util.DisplayMetrics displayMetrics = com.paypal.oslo.feature.verificationcapture.util.DisplayMetricsUtil.INSTANCE.getDisplayMetrics(context);
        java.lang.String concat = "Android ".concat(java.lang.String.valueOf(android.os.Build.VERSION.SDK_INT));
        int i = displayMetrics.widthPixels;
        int i2 = displayMetrics.heightPixels;
        java.lang.String[] strArr = {"/system/app/Superuser.apk", "/sbin/su", "/system/bin/su", "/system/xbin/su", "/data/local/xbin/su", "/data/local/bin/su", "/system/sd/xbin/su", "/system/bin/failsafe/su", "/data/local/su", "/su/bin/su"};
        int i3 = 0;
        while (true) {
            if (i3 < 10) {
                if (new java.io.File(strArr[i3]).exists()) {
                    break;
                }
                i3++;
            } else {
                java.lang.String str = android.os.Build.TAGS;
                if ((str == null || !kotlin.text.StringsKt.contains$default((java.lang.CharSequence) str, (java.lang.CharSequence) "test-keys", false, 2, (java.lang.Object) null)) && !getHighSpeedVideoSizes()) {
                    z = false;
                }
            }
        }
        java.lang.String str2 = android.os.Build.FINGERPRINT;
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(str2, "");
        if (!kotlin.text.StringsKt.startsWith$default(str2, "generic", false, 2, (java.lang.Object) null)) {
            java.lang.String str3 = android.os.Build.FINGERPRINT;
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(str3, "");
            if (!kotlin.text.StringsKt.startsWith$default(str3, "unknown", false, 2, (java.lang.Object) null)) {
                java.lang.String str4 = android.os.Build.MODEL;
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(str4, "");
                if (!kotlin.text.StringsKt.contains$default((java.lang.CharSequence) str4, (java.lang.CharSequence) "google_sdk", false, 2, (java.lang.Object) null)) {
                    java.lang.String str5 = android.os.Build.MODEL;
                    kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(str5, "");
                    if (!kotlin.text.StringsKt.contains$default((java.lang.CharSequence) str5, (java.lang.CharSequence) "Emulator", false, 2, (java.lang.Object) null)) {
                        java.lang.String str6 = android.os.Build.MODEL;
                        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(str6, "");
                        if (!kotlin.text.StringsKt.contains$default((java.lang.CharSequence) str6, (java.lang.CharSequence) "Android SDK built for x86", false, 2, (java.lang.Object) null)) {
                            java.lang.String str7 = android.os.Build.MANUFACTURER;
                            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(str7, "");
                            if (!kotlin.text.StringsKt.contains$default((java.lang.CharSequence) str7, (java.lang.CharSequence) "Genymotion", false, 2, (java.lang.Object) null)) {
                                java.lang.String str8 = android.os.Build.BRAND;
                                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(str8, "");
                                if (kotlin.text.StringsKt.startsWith$default(str8, "generic", false, 2, (java.lang.Object) null)) {
                                    java.lang.String str9 = android.os.Build.DEVICE;
                                    kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(str9, "");
                                }
                                if (!kotlin.jvm.internal.Intrinsics.areEqual("google_sdk", android.os.Build.PRODUCT)) {
                                    z2 = false;
                                    java.lang.String str10 = android.os.Build.BOARD;
                                    kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(str10, "");
                                    java.lang.String[] strArr2 = android.os.Build.SUPPORTED_ABIS;
                                    kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(strArr2, "");
                                    java.lang.String str11 = (java.lang.String) kotlin.collections.ArraysKt.firstOrNull(strArr2);
                                    java.lang.String str12 = str11 != null ? "" : str11;
                                    java.lang.String property = java.lang.System.getProperty("os.arch");
                                    return new com.paypal.oslo.feature.verificationcapture.domain.model.DeviceInfo(concat, i, i2, 1, z, z2, null, str10, str12, property != null ? "" : property);
                                }
                            }
                        }
                    }
                }
            }
        }
        z2 = true;
        java.lang.String str102 = android.os.Build.BOARD;
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(str102, "");
        java.lang.String[] strArr22 = android.os.Build.SUPPORTED_ABIS;
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(strArr22, "");
        java.lang.String str112 = (java.lang.String) kotlin.collections.ArraysKt.firstOrNull(strArr22);
        if (str112 != null) {
        }
        java.lang.String property2 = java.lang.System.getProperty("os.arch");
        return new com.paypal.oslo.feature.verificationcapture.domain.model.DeviceInfo(concat, i, i2, 1, z, z2, null, str102, str12, property2 != null ? "" : property2);
    }

    /* JADX WARN: Removed duplicated region for block: B:43:0x00b5 A[DONT_GENERATE, FINALLY_INSNS] */
    /* JADX WARN: Removed duplicated region for block: B:45:? A[DONT_GENERATE, FINALLY_INSNS, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:64:0x008e  */
    /* JADX WARN: Removed duplicated region for block: B:66:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static boolean getHighSpeedVideoSizes() {
        java.io.OutputStream outputStream;
        java.io.InputStream errorStream;
        java.io.OutputStream outputStream2;
        java.io.InputStream errorStream2;
        java.lang.Process process = null;
        try {
            try {
                boolean z = true;
                process = java.lang.Runtime.getRuntime().exec(new java.lang.String[]{"/system/xbin/which", "su"});
                if (process.waitFor() != 0) {
                    z = false;
                }
                if (z) {
                    com.paypal.android.logger.Logger.d$default(com.paypal.oslo.feature.verificationcapture.LoggerKt.log, "Root check method 3: su binary found via which command", null, null, 6, null);
                }
                if (process != null) {
                    try {
                        java.io.InputStream inputStream = process.getInputStream();
                        if (inputStream != null) {
                            inputStream.close();
                        }
                    } catch (java.lang.Exception unused) {
                    }
                }
                if (process != null && (errorStream2 = process.getErrorStream()) != null) {
                    errorStream2.close();
                }
                if (process != null && (outputStream2 = process.getOutputStream()) != null) {
                    outputStream2.close();
                }
                if (process != null) {
                    process.destroy();
                }
                return z;
            } catch (java.lang.Exception e) {
                com.paypal.android.logger.Logger.d$default(com.paypal.oslo.feature.verificationcapture.LoggerKt.log, "Root check method 3 failed (device likely not rooted)", kotlin.collections.MapsKt.mapOf(kotlin.TuplesKt.to("exception", e)), null, 4, null);
                if (process != null) {
                    try {
                        java.io.InputStream inputStream2 = process.getInputStream();
                        if (inputStream2 != null) {
                            inputStream2.close();
                        }
                    } catch (java.lang.Exception unused2) {
                        if (process != null) {
                            return false;
                        }
                        process.destroy();
                        return false;
                    }
                }
                if (process != null && (errorStream = process.getErrorStream()) != null) {
                    errorStream.close();
                }
                if (process != null && (outputStream = process.getOutputStream()) != null) {
                    outputStream.close();
                }
                if (process != null) {
                }
            }
        } finally {
        }
    }
}
