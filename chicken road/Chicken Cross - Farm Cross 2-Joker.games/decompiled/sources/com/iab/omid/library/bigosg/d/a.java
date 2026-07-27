package com.iab.omid.library.bigosg.d;

import android.os.Build;
import com.ironsource.L6;
import com.ironsource.U3;
import org.json.JSONObject;

/* loaded from: classes4.dex */
public final class a {
    public static String a() {
        return Build.MANUFACTURER + "; " + Build.MODEL;
    }

    public static String b() {
        return Integer.toString(Build.VERSION.SDK_INT);
    }

    public static String c() {
        return U3.d;
    }

    public static JSONObject d() {
        JSONObject jSONObject = new JSONObject();
        b.a(jSONObject, "deviceType", a());
        b.a(jSONObject, "osVersion", b());
        b.a(jSONObject, L6.F, c());
        return jSONObject;
    }
}
