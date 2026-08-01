package com.ironsource;

import android.app.ActivityManager;
import android.content.Context;
import android.text.TextUtils;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONObject;

/* loaded from: classes6.dex */
public class T9 {

    /* renamed from: a, reason: collision with root package name */
    P6 f7912a = new P6();

    class a extends com.ironsource.environment.thread.a {
        final /* synthetic */ EnumC4644se b;

        a(EnumC4644se enumC4644se) {
            this.b = enumC4644se;
        }

        @Override // com.ironsource.environment.thread.a
        public void a() {
            T9.this.f7912a.a(L6.g0, new JSONArray().put(this.b.b()));
        }
    }

    public void a(JSONObject jSONObject) {
        this.f7912a.a(L6.u, (Object) jSONObject);
    }

    public void b() {
        this.f7912a.a(L6.T0);
    }

    public void c(String str) {
        this.f7912a.a(L6.L0, str);
    }

    public void d(String str) {
        this.f7912a.a(L6.N0, str);
    }

    public void e(String str) {
        this.f7912a.a(com.ironsource.mediationsdk.metadata.a.j, str);
    }

    public void f(String str) {
        this.f7912a.a(L6.b1, str);
    }

    public void g(String str) {
        this.f7912a.a(L6.A, str);
    }

    public void h(String str) {
        this.f7912a.a("sid", str);
    }

    public void i(String str) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        this.f7912a.a(L6.e0, str);
    }

    public void a(boolean z) {
        this.f7912a.a(L6.S0, Boolean.valueOf(z));
    }

    public void b(JSONObject jSONObject) {
        this.f7912a.a(L6.f1, (Object) jSONObject);
    }

    public void c(int i) {
        this.f7912a.a(L6.f0, Integer.valueOf(i));
    }

    public void a(List<String> list) {
        if (list != null) {
            this.f7912a.a(L6.T0, (Object) new JSONArray((Collection) list));
        }
    }

    public void b(int i) {
        if (i >= 0) {
            this.f7912a.a(L6.V0, Integer.valueOf(i));
        }
    }

    public void a() {
        this.f7912a.a(L6.S0);
    }

    public void b(String str) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        this.f7912a.a(L6.D1, str);
    }

    public void a(Context context) {
        this.f7912a.a(context);
    }

    public void a(Boolean bool) {
        this.f7912a.a(L6.W0, bool);
    }

    public void b(Context context) {
        InterfaceC4673u7 a2 = Ib.a0().a();
        ActivityManager.MemoryInfo o = a2.o(context);
        this.f7912a.a(L6.w, a2.c(o));
        this.f7912a.a(L6.x, a2.b(o));
    }

    public void a(EnumC4644se enumC4644se) {
        new Thread(new a(enumC4644se)).start();
    }

    public void a(N7 n7) {
        try {
            HashMap hashMap = new HashMap();
            hashMap.put(L6.E, n7.a());
            hashMap.put(L6.D, n7.b());
            hashMap.put(L6.V, n7.c());
            this.f7912a.a(hashMap);
        } catch (Exception e) {
            C4491k4.d().a(e);
        }
    }

    public void a(String str) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        this.f7912a.a("abt", str);
    }

    public void a(int i) {
        this.f7912a.a(L6.j0, Integer.valueOf(i));
    }
}
