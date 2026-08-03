package com.ironsource;

/* loaded from: classes5.dex */
public final class Lf {
    public final void a(android.content.Context context, java.lang.String appKey, org.json.JSONObject initResponse, java.lang.String sdkVersion, java.lang.String testSuiteControllerUrl, java.lang.Boolean bool, boolean z) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "context");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(appKey, "appKey");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(initResponse, "initResponse");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(sdkVersion, "sdkVersion");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(testSuiteControllerUrl, "testSuiteControllerUrl");
        com.ironsource.Tf tf = com.ironsource.Tf.f5986a;
        a(context, a(appKey, sdkVersion, tf.c(context), tf.a(context), tf.b(context), bool, initResponse, z, tf.b(), tf.c(), a()));
        android.content.Intent intent = new android.content.Intent(context, (java.lang.Class<?>) com.ironsource.mediationsdk.testSuite.TestSuiteActivity.class);
        intent.setFlags(805306368);
        intent.putExtra("controllerUrl", testSuiteControllerUrl);
        context.startActivity(intent);
    }

    public final java.lang.String b(android.content.Context context) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "context");
        return a(context).getString("dataString", "");
    }

    private final org.json.JSONObject a() {
        org.json.JSONObject jSONObject = new org.json.JSONObject();
        for (java.util.Map.Entry<java.lang.String, java.util.List<java.lang.String>> entry : com.ironsource.Tf.f5986a.d().entrySet()) {
            jSONObject.putOpt(entry.getKey(), new org.json.JSONArray((java.util.Collection) entry.getValue()));
        }
        return jSONObject;
    }

    private final java.lang.String a(java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4, java.lang.String str5, java.lang.Boolean bool, org.json.JSONObject jSONObject, boolean z, org.json.JSONObject jSONObject2, org.json.JSONObject jSONObject3, org.json.JSONObject jSONObject4) {
        java.lang.String jSONObject5 = new org.json.JSONObject(kotlin.collections.MapsKt.mapOf(kotlin.TuplesKt.to(com.ironsource.Va.o, com.ironsource.X3.d), kotlin.TuplesKt.to("appKey", str), kotlin.TuplesKt.to("sdkVersion", str2), kotlin.TuplesKt.to("bundleId", str3), kotlin.TuplesKt.to("appName", str4), kotlin.TuplesKt.to("appVersion", str5), kotlin.TuplesKt.to("initResponse", jSONObject), kotlin.TuplesKt.to("isRvManual", java.lang.Boolean.valueOf(z)), kotlin.TuplesKt.to("generalProperties", jSONObject2), kotlin.TuplesKt.to("adaptersVersion", jSONObject3), kotlin.TuplesKt.to("metaData", jSONObject4), kotlin.TuplesKt.to("gdprConsent", bool))).toString();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(jSONObject5, "JSONObject(\n            …ent))\n        .toString()");
        return jSONObject5;
    }

    private final android.content.SharedPreferences a(android.content.Context context) {
        android.content.SharedPreferences sharedPreferences = context.getSharedPreferences("com.unity3d.ad-mediation.testSuite", 0);
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(sharedPreferences, "context.getSharedPrefere…EY, Context.MODE_PRIVATE)");
        return sharedPreferences;
    }

    private final void a(android.content.Context context, java.lang.String str) {
        android.content.SharedPreferences.Editor edit = a(context).edit();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(edit, "getTestSuitePrefs(context).edit()");
        edit.putString("dataString", str);
        edit.apply();
    }
}
