package com.chartboost.sdk.impl;

import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import java.util.List;
import org.json.JSONArray;

/* loaded from: classes4.dex */
public abstract class g8 {
    public static final <T> List<T> asList(JSONArray jSONArray) {
        return h8.a(jSONArray);
    }

    public static final <T> List<T> asListSkipNull(JSONArray jSONArray) {
        return h8.b(jSONArray);
    }

    public static final PackageInfo getPackageInfoCompat(PackageManager packageManager, String str, int i) {
        return h8.a(packageManager, str, i);
    }

    public static final String getPackageVersionName(PackageManager packageManager, String str) {
        return h8.a(packageManager, str);
    }

    public static final qh toBodyFields(ph phVar) {
        return h8.a(phVar);
    }

    public static final kf toReachabilityBodyFields(f3 f3Var) {
        return h8.a(f3Var);
    }
}
