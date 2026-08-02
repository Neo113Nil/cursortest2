package com.google.android.gms.internal.ads;

import android.content.Context;
import java.util.Map;
import java.util.concurrent.Executor;
import org.json.JSONObject;

/* loaded from: classes.dex */
public final class Kk {

    /* renamed from: b, reason: collision with root package name */
    public final G.v f10218b;

    /* renamed from: c, reason: collision with root package name */
    public final Context f10219c;

    /* renamed from: d, reason: collision with root package name */
    public final C1482ql f10220d;

    /* renamed from: e, reason: collision with root package name */
    public final Executor f10221e;
    public final Q4 f;

    /* renamed from: g, reason: collision with root package name */
    public final U2.a f10222g;
    public final Xm i;

    /* renamed from: j, reason: collision with root package name */
    public final C1041gs f10224j;

    /* renamed from: k, reason: collision with root package name */
    public final BinderC0857cn f10225k;

    /* renamed from: l, reason: collision with root package name */
    public final Xq f10226l;

    /* renamed from: m, reason: collision with root package name */
    public C1582sw f10227m;

    /* renamed from: a, reason: collision with root package name */
    public final Ek f10217a = new Ek();

    /* renamed from: h, reason: collision with root package name */
    public final C1641u9 f10223h = new C1641u9();

    public Kk(Ik ik) {
        this.f10219c = ik.f9601b;
        this.f10221e = ik.f9604e;
        this.f = ik.f;
        this.f10222g = ik.f9605g;
        this.f10218b = ik.f9600a;
        this.i = ik.f9603d;
        this.f10224j = ik.f9606h;
        this.f10220d = ik.f9602c;
        this.f10225k = ik.i;
        this.f10226l = ik.f9607j;
    }

    public final synchronized E3.a a(String str, JSONObject jSONObject) {
        C1582sw c1582sw = this.f10227m;
        if (c1582sw == null) {
            return Mw.f10750l;
        }
        return AbstractC1400ot.j0(c1582sw, new C1030gh(this, str, jSONObject, 1), this.f10221e);
    }

    public final synchronized void b(Map map) {
        C1582sw c1582sw = this.f10227m;
        if (c1582sw == null) {
            return;
        }
        C1529ro c1529ro = new C1529ro(20, map);
        c1582sw.a(new Kw(0, c1582sw, c1529ro), this.f10221e);
    }

    public final synchronized void c(String str, InterfaceC1821y9 interfaceC1821y9) {
        C1582sw c1582sw = this.f10227m;
        if (c1582sw == null) {
            return;
        }
        C0709Wb c0709Wb = new C0709Wb(20, str, interfaceC1821y9);
        c1582sw.a(new Kw(0, c1582sw, c0709Wb), this.f10221e);
    }

    public final synchronized void d(String str, InterfaceC1821y9 interfaceC1821y9) {
        C1582sw c1582sw = this.f10227m;
        if (c1582sw == null) {
            return;
        }
        C1390oj c1390oj = new C1390oj(21, str, interfaceC1821y9);
        c1582sw.a(new Kw(0, c1582sw, c1390oj), this.f10221e);
    }
}
