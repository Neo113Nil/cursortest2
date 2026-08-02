package com.iovation.mobile.android.a;

/* loaded from: classes9.dex */
public final class d implements com.iovation.mobile.android.a.h {
    @Override // com.iovation.mobile.android.a.i
    public final java.util.Map a(android.content.Context context) {
        java.lang.String str;
        java.lang.String str2 = "";
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "");
        java.util.LinkedHashMap linkedHashMap = new java.util.LinkedHashMap();
        linkedHashMap.put("ABN", android.os.Build.DISPLAY);
        linkedHashMap.put("ASL", java.lang.Integer.toString(android.os.Build.VERSION.SDK_INT));
        try {
            java.lang.String str3 = android.os.Build.FINGERPRINT;
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(str3, "");
            java.nio.charset.Charset charset = java.nio.charset.StandardCharsets.UTF_8;
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(charset, "");
            byte[] bytes = str3.getBytes(charset);
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(bytes, "");
            linkedHashMap.put("AFPID", com.iovation.mobile.android.d.a.a(bytes));
        } catch (java.io.UnsupportedEncodingException unused) {
        }
        linkedHashMap.put("MODEL", android.os.Build.MODEL);
        linkedHashMap.put("KERID", android.os.Build.ID);
        linkedHashMap.put("AFPCL", android.os.Build.FINGERPRINT);
        linkedHashMap.put("ANDD", android.os.Build.DEVICE);
        linkedHashMap.put("BHOST", android.os.Build.HOST);
        linkedHashMap.put("DMFG", android.os.Build.MANUFACTURER);
        linkedHashMap.put("APRD", android.os.Build.PRODUCT);
        linkedHashMap.put("KERD", java.lang.Long.toString(android.os.Build.TIME));
        linkedHashMap.put("OSVER", android.os.Build.VERSION.RELEASE);
        linkedHashMap.put("BRAND", android.os.Build.BRAND);
        double uptimeMillis = android.os.SystemClock.uptimeMillis() / 1000.0d;
        linkedHashMap.put("UPTIME", java.lang.Double.toString(uptimeMillis));
        linkedHashMap.put("SLEEPTIME", java.lang.Double.toString((android.os.SystemClock.elapsedRealtime() / 1000.0d) - uptimeMillis));
        java.lang.String a2 = com.iovation.mobile.android.d.a.a("grep Processor /proc/cpuinfo");
        java.lang.String str4 = null;
        if (a2 == null || kotlin.text.StringsKt.isBlank(a2)) {
            str = null;
        } else {
            str = a2.substring(12, a2.length() - 1);
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(str, "");
        }
        linkedHashMap.put("CPU", str);
        java.lang.String a3 = com.iovation.mobile.android.d.a.a("cat /proc/meminfo");
        java.util.List split$default = a3 != null ? kotlin.text.StringsKt.split$default((java.lang.CharSequence) a3, new java.lang.String[]{com.paypal.oslo.feature.activity.domain.base.constants.ActivityConstants.UIConstants.NEW_LINE}, false, 0, 6, (java.lang.Object) null) : null;
        java.lang.String str5 = split$default != null ? (java.lang.String) split$default.get(0) : null;
        if (str5 != null && kotlin.text.StringsKt.startsWith$default(str5, "MemTotal:        ", false, 2, (java.lang.Object) null) && kotlin.text.StringsKt.endsWith$default(str5, " kB", false, 2, (java.lang.Object) null)) {
            java.lang.String substring = str5.substring(17, str5.length() - 3);
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(substring, "");
            str4 = java.lang.String.valueOf(java.lang.Long.parseLong(kotlin.text.StringsKt.trim(substring).toString()) / okhttp3.internal.ws.RealWebSocket.DEFAULT_MINIMUM_DEFLATE_SIZE);
        }
        linkedHashMap.put("PHYMEM", str4);
        java.lang.String a4 = com.iovation.mobile.android.d.a.a("getprop net.hostname");
        if (a4 == null) {
            a4 = "";
        }
        linkedHashMap.put("HOST", kotlin.text.StringsKt.trim(a4).toString());
        if (android.os.Build.VERSION.SDK_INT <= 28 && com.iovation.mobile.android.d.a.a("android.permission.READ_PHONE_STATE", context)) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter("android.permission.READ_PHONE_STATE", "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "");
            if (context.checkPermission("android.permission.READ_PHONE_STATE", android.os.Process.myPid(), android.os.Process.myUid()) == 0) {
                java.lang.String serial = android.os.Build.getSerial();
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(serial, "");
                str2 = serial;
            }
            linkedHashMap.put("SERL", str2);
        }
        throw new java.lang.ArithmeticException();
    }

    @Override // com.iovation.mobile.android.a.i
    public final java.lang.String getName() {
        return "d6d9bc";
    }
}
