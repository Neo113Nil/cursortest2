package com.ironsource;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import com.chartboost.sdk.privacy.model.COPPA;
import com.ironsource.mediationsdk.testSuite.TestSuiteActivity;
import java.util.Collection;
import java.util.List;
import java.util.Map;
import kotlin.TuplesKt;
import kotlin.collections.MapsKt;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONArray;
import org.json.JSONObject;

/* loaded from: classes6.dex */
public final class Mf {
    public final void a(Context context, String appKey, JSONObject initResponse, String sdkVersion, String testSuiteControllerUrl, Boolean bool, Boolean bool2, boolean z) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(appKey, "appKey");
        Intrinsics.checkNotNullParameter(initResponse, "initResponse");
        Intrinsics.checkNotNullParameter(sdkVersion, "sdkVersion");
        Intrinsics.checkNotNullParameter(testSuiteControllerUrl, "testSuiteControllerUrl");
        Uf uf = Uf.f7953a;
        a(context, a(appKey, sdkVersion, uf.c(context), uf.a(context), uf.b(context), bool, bool2, initResponse, z, uf.b(), uf.c(), a()));
        Intent intent = new Intent(context, (Class<?>) TestSuiteActivity.class);
        intent.setFlags(com.google.android.exoplayer2.C.ENCODING_PCM_32BIT);
        intent.putExtra("controllerUrl", testSuiteControllerUrl);
        context.startActivity(intent);
    }

    public final String b(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        return a(context).getString("dataString", "");
    }

    private final JSONObject a() {
        JSONObject jSONObject = new JSONObject();
        for (Map.Entry<String, List<String>> entry : Uf.f7953a.d().entrySet()) {
            jSONObject.putOpt(entry.getKey(), new JSONArray((Collection) entry.getValue()));
        }
        return jSONObject;
    }

    private final String a(String str, String str2, String str3, String str4, String str5, Boolean bool, Boolean bool2, JSONObject jSONObject, boolean z, JSONObject jSONObject2, JSONObject jSONObject3, JSONObject jSONObject4) {
        String jSONObject5 = new JSONObject(MapsKt.mapOf(TuplesKt.to(Ta.o, U3.d), TuplesKt.to("appKey", str), TuplesKt.to("sdkVersion", str2), TuplesKt.to("bundleId", str3), TuplesKt.to("appName", str4), TuplesKt.to("appVersion", str5), TuplesKt.to("initResponse", jSONObject), TuplesKt.to("isRvManual", Boolean.valueOf(z)), TuplesKt.to("generalProperties", jSONObject2), TuplesKt.to("adaptersVersion", jSONObject3), TuplesKt.to("metaData", jSONObject4), TuplesKt.to("gdprConsent", bool), TuplesKt.to(COPPA.COPPA_STANDARD, bool2))).toString();
        Intrinsics.checkNotNullExpressionValue(jSONObject5, "JSONObject(\n            …ppa))\n        .toString()");
        return jSONObject5;
    }

    private final SharedPreferences a(Context context) {
        SharedPreferences sharedPreferences = context.getSharedPreferences("com.unity3d.ad-mediation.testSuite", 0);
        Intrinsics.checkNotNullExpressionValue(sharedPreferences, "context.getSharedPrefere…EY, Context.MODE_PRIVATE)");
        return sharedPreferences;
    }

    private final void a(Context context, String str) {
        SharedPreferences.Editor edit = a(context).edit();
        Intrinsics.checkNotNullExpressionValue(edit, "getTestSuitePrefs(context).edit()");
        edit.putString("dataString", str);
        edit.apply();
    }
}
