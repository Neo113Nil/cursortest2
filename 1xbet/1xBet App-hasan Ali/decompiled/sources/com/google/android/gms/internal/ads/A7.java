package com.google.android.gms.internal.ads;

import android.content.SharedPreferences;
import java.util.ArrayList;
import org.json.JSONObject;

/* loaded from: classes.dex */
public final class A7 {

    /* renamed from: a, reason: collision with root package name */
    public final int f7534a;

    /* renamed from: b, reason: collision with root package name */
    public final String f7535b;

    /* renamed from: c, reason: collision with root package name */
    public final Object f7536c;

    /* renamed from: d, reason: collision with root package name */
    public final Object f7537d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f7538e;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ A7(int i, String str, Object obj, Object obj2, int i5) {
        this(i, obj, obj2, str);
        this.f7538e = i5;
    }

    public static A7 c(int i, int i5, String str) {
        return new A7(1, str, Integer.valueOf(i), Integer.valueOf(i5), 1);
    }

    public static A7 d(long j5, long j6, String str) {
        return new A7(1, str, Long.valueOf(j5), Long.valueOf(j6), 2);
    }

    public static void e() {
        Object obj = null;
        ((ArrayList) Q2.r.f5053d.f5054a.f13187m).add(new A7(1, "gads:sdk_core_constants:experiment_id", obj, obj, 4));
    }

    public final Object a(JSONObject jSONObject) {
        switch (this.f7538e) {
            case 0:
                return Boolean.valueOf(jSONObject.optBoolean(this.f7535b, ((Boolean) f()).booleanValue()));
            case 1:
                return Integer.valueOf(jSONObject.optInt(this.f7535b, ((Integer) f()).intValue()));
            case 2:
                return Long.valueOf(jSONObject.optLong(this.f7535b, ((Long) f()).longValue()));
            case 3:
                return Float.valueOf((float) jSONObject.optDouble(this.f7535b, ((Float) f()).floatValue()));
            default:
                return jSONObject.optString(this.f7535b, (String) f());
        }
    }

    public final Object b(SharedPreferences sharedPreferences) {
        switch (this.f7538e) {
            case 0:
                return Boolean.valueOf(sharedPreferences.getBoolean(this.f7535b, ((Boolean) f()).booleanValue()));
            case 1:
                return Integer.valueOf(sharedPreferences.getInt(this.f7535b, ((Integer) f()).intValue()));
            case 2:
                return Long.valueOf(sharedPreferences.getLong(this.f7535b, ((Long) f()).longValue()));
            case 3:
                return Float.valueOf(sharedPreferences.getFloat(this.f7535b, ((Float) f()).floatValue()));
            default:
                return sharedPreferences.getString(this.f7535b, (String) f());
        }
    }

    public final Object f() {
        return Q2.r.f5053d.f5056c.i ? this.f7537d : this.f7536c;
    }

    public A7(int i, Object obj, Object obj2, String str) {
        this.f7534a = i;
        this.f7535b = str;
        this.f7536c = obj;
        this.f7537d = obj2;
        ((ArrayList) Q2.r.f5053d.f5054a.f13186l).add(this);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public A7(String str, String str2, String str3) {
        this(1, str2, str3, str);
        this.f7538e = 4;
    }
}
