package com.chartboost.sdk.impl;

import android.content.Context;
import android.os.BatteryManager;
import android.os.Build;
import com.ironsource.L6;
import com.ironsource.U3;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONObject;

/* loaded from: classes4.dex */
public final class l6 implements vh {
    public static final a e = new a(null);

    /* renamed from: a, reason: collision with root package name */
    public final Context f4857a;
    public final u2 b;
    public final g6 c;
    public final String d;

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public a() {
        }
    }

    public l6(Context context, u2 identity, g6 g6Var) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(identity, "identity");
        this.f4857a = context;
        this.b = identity;
        this.c = g6Var;
        this.d = "device";
    }

    @Override // com.chartboost.sdk.impl.vh
    public JSONObject a() {
        i9 k = this.b.k();
        Double b = b();
        u3 a2 = new v3().a(this.f4857a);
        String b2 = h5.g(this.f4857a).b();
        g6 g6Var = this.c;
        Integer valueOf = g6Var != null ? Integer.valueOf(g6Var.f()) : null;
        g6 g6Var2 = this.c;
        Integer valueOf2 = g6Var2 != null ? Integer.valueOf(g6Var2.e()) : null;
        g6 g6Var3 = this.c;
        Integer valueOf3 = g6Var3 != null ? Integer.valueOf(g6Var3.j()) : null;
        String g = e7.f4748a.g();
        int i = k.f() == ni.e ? 1 : 0;
        String str = Build.MANUFACTURER;
        String str2 = Build.MODEL;
        String str3 = "Android " + Build.VERSION.RELEASE;
        g6 g6Var4 = this.c;
        Float valueOf4 = g6Var4 != null ? Float.valueOf(g6Var4.h()) : null;
        String a3 = aj.b.a();
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("battery_level", b);
        jSONObject.put(L6.R0, a2 != null ? a2.d() : null);
        jSONObject.put("connection_type", b2);
        jSONObject.put("device_type", valueOf);
        jSONObject.put("display_height", valueOf2);
        jSONObject.put("display_width", valueOf3);
        jSONObject.put("language", g);
        jSONObject.put("lmt", i);
        jSONObject.put(L6.t, str);
        jSONObject.put("model", str2);
        jSONObject.put(L6.F, U3.d);
        jSONObject.put("os_version", str3);
        jSONObject.put("pixel_ratio", valueOf4);
        jSONObject.put("user_agent", a3);
        return jSONObject;
    }

    public final Double b() {
        int intProperty;
        try {
            Object systemService = this.f4857a.getSystemService("batterymanager");
            BatteryManager batteryManager = systemService instanceof BatteryManager ? (BatteryManager) systemService : null;
            if (batteryManager == null || (intProperty = batteryManager.getIntProperty(4)) < 0 || intProperty >= 101) {
                return null;
            }
            return Double.valueOf(intProperty / 100.0d);
        } catch (Exception unused) {
            return null;
        }
    }
}
