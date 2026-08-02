package com.iovation.mobile.android.a;

/* loaded from: classes9.dex */
public final class s implements com.iovation.mobile.android.a.h {

    /* renamed from: a, reason: collision with root package name */
    public java.lang.String f3925a = a();

    @Override // com.iovation.mobile.android.a.i
    public final java.util.Map a(android.content.Context context) {
        java.lang.String str;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "");
        java.util.LinkedHashMap linkedHashMap = new java.util.LinkedHashMap();
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        try {
            java.io.BufferedReader bufferedReader = new java.io.BufferedReader(new java.io.InputStreamReader(context.openFileInput("ioadft"), "UTF-8"));
            while (true) {
                java.lang.String readLine = bufferedReader.readLine();
                if (readLine == null) {
                    break;
                }
                sb.append(readLine);
            }
            str = sb.toString();
        } catch (java.io.IOException | java.lang.Exception unused) {
            str = "";
        }
        java.lang.String string = context.getSharedPreferences("IOSPT", 0).getString("IOSPT", "");
        kotlin.jvm.internal.Intrinsics.checkNotNull(string);
        if (kotlin.text.StringsKt.isBlank(str) && !kotlin.text.StringsKt.isBlank(string)) {
            this.f3925a = string;
            str = d(context);
        } else if (!kotlin.text.StringsKt.isBlank(str) && kotlin.text.StringsKt.isBlank(string)) {
            this.f3925a = str;
            android.content.SharedPreferences.Editor edit = context.getSharedPreferences("IOSPT", 0).edit();
            edit.putString("IOSPT", this.f3925a);
            edit.commit();
            string = this.f3925a;
        } else if (kotlin.text.StringsKt.isBlank(str) && kotlin.text.StringsKt.isBlank(string)) {
            this.f3925a = a();
            str = d(context);
            android.content.SharedPreferences.Editor edit2 = context.getSharedPreferences("IOSPT", 0).edit();
            edit2.putString("IOSPT", this.f3925a);
            edit2.commit();
            string = this.f3925a;
        }
        linkedHashMap.put("ADFTOKEN", str);
        linkedHashMap.put("SPATOKEN", string);
        return linkedHashMap;
    }

    public final java.lang.String d(android.content.Context context) {
        try {
            java.io.FileOutputStream openFileOutput = context.openFileOutput("ioadft", 0);
            byte[] bytes = this.f3925a.getBytes(kotlin.text.Charsets.UTF_8);
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(bytes, "");
            openFileOutput.write(bytes);
            openFileOutput.close();
            return this.f3925a;
        } catch (java.lang.Exception unused) {
            return "";
        }
    }

    @Override // com.iovation.mobile.android.a.i
    public final java.lang.String getName() {
        return "ab0ccb";
    }

    public static java.lang.String a() {
        try {
            java.lang.String obj = java.util.UUID.randomUUID().toString();
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(obj, "");
            java.lang.String replace$default = kotlin.text.StringsKt.replace$default(obj, "-", "", false, 4, (java.lang.Object) null);
            java.util.Locale locale = java.util.Locale.getDefault();
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(locale, "");
            java.lang.String upperCase = replace$default.toUpperCase(locale);
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(upperCase, "");
            byte[] bytes = upperCase.getBytes(kotlin.text.Charsets.UTF_8);
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(bytes, "");
            return com.iovation.mobile.android.d.c.b(bytes);
        } catch (java.lang.Exception unused) {
            return "";
        }
    }
}
