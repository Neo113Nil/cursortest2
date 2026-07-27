package com.startapp.sdk.internal;

import com.startapp.sdk.adsbase.remoteconfig.AdCallbacksConfig;
import com.startapp.sdk.adsbase.remoteconfig.AnalyticsConfig;
import com.startapp.sdk.adsbase.remoteconfig.MetaData;

/* loaded from: classes.dex */
public abstract class v6 {
    public static void a(String str, boolean z3, String str2, String str3) {
        AdCallbacksConfig a3;
        try {
            AnalyticsConfig h3 = MetaData.E().h();
            if (h3 != null && (a3 = h3.a()) != null) {
                if ((a3.a() || z3) && a3.a(str)) {
                    d9 d9Var = new d9(e9.f3617d);
                    d9Var.f3574d = "adCallback";
                    d9Var.f3578i = str;
                    d9Var.f3576g = str2;
                    d9Var.f3575e = str3;
                    d9Var.a();
                }
            }
        } catch (Throwable unused) {
        }
    }
}
