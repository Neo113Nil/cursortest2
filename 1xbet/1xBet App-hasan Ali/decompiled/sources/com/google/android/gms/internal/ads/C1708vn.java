package com.google.android.gms.internal.ads;

import android.content.Context;
import java.util.concurrent.Executor;

/* renamed from: com.google.android.gms.internal.ads.vn, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1708vn implements DD {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f16040a;

    /* renamed from: b, reason: collision with root package name */
    public final CD f16041b;

    /* renamed from: c, reason: collision with root package name */
    public final C1745wf f16042c;

    /* renamed from: d, reason: collision with root package name */
    public final Hh f16043d;

    /* renamed from: e, reason: collision with root package name */
    public final CD f16044e;
    public final ED f;

    /* renamed from: g, reason: collision with root package name */
    public final CD f16045g;

    /* renamed from: h, reason: collision with root package name */
    public final CD f16046h;
    public final CD i;

    /* renamed from: j, reason: collision with root package name */
    public final CD f16047j;

    public /* synthetic */ C1708vn(CD cd, C1745wf c1745wf, Hh hh, CD cd2, ED ed, CD cd3, CD cd4, CD cd5, CD cd6, int i) {
        this.f16040a = i;
        this.f16041b = cd;
        this.f16042c = c1745wf;
        this.f16043d = hh;
        this.f16044e = cd2;
        this.f = ed;
        this.f16045g = cd3;
        this.f16046h = cd4;
        this.i = cd5;
        this.f16047j = cd6;
    }

    @Override // com.google.android.gms.internal.ads.ID
    public final Object d() {
        switch (this.f16040a) {
            case 0:
                return new C1663un((C0578Df) this.f.f8474a, (Context) this.f16041b.d(), (Executor) this.f16044e.d(), (Wk) this.f16045g.d(), this.f16043d.a(), this.f16042c.a(), new A9(), (BinderC0857cn) this.f16046h.d(), (C1392ol) this.i.d(), (C1482ql) this.f16047j.d());
            case 1:
                return new Jn((Context) this.f16041b.d(), this.f16042c.a(), this.f16043d.a(), (Executor) this.f16044e.d(), (C0622Jf) this.f.f8474a, (Wk) this.f16045g.d(), new A9(), (BinderC0857cn) this.f16046h.d(), (C1392ol) this.i.d(), (C1482ql) this.f16047j.d());
            default:
                return new Jn((Context) this.f16041b.d(), this.f16042c.a(), this.f16043d.a(), (Executor) this.f16044e.d(), (C0636Lf) this.f.f8474a, (Wk) this.f16045g.d(), new A9(), (BinderC0857cn) this.f16046h.d(), (C1392ol) this.i.d(), (C1482ql) this.f16047j.d());
        }
    }

    public C1708vn(ED ed, CD cd, CD cd2, CD cd3, Hh hh, C1745wf c1745wf, CD cd4, CD cd5, CD cd6) {
        this.f16040a = 0;
        this.f = ed;
        this.f16041b = cd;
        this.f16044e = cd2;
        this.f16045g = cd3;
        this.f16043d = hh;
        this.f16042c = c1745wf;
        this.f16046h = cd4;
        this.i = cd5;
        this.f16047j = cd6;
    }
}
