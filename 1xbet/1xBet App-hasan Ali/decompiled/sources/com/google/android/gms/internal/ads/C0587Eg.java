package com.google.android.gms.internal.ads;

import Q2.InterfaceC0391w0;
import android.content.Context;
import android.view.View;
import android.widget.FrameLayout;
import java.util.concurrent.Executor;

/* renamed from: com.google.android.gms.internal.ads.Eg, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0587Eg extends AbstractC0579Dg {

    /* renamed from: j, reason: collision with root package name */
    public final Context f8569j;

    /* renamed from: k, reason: collision with root package name */
    public final View f8570k;

    /* renamed from: l, reason: collision with root package name */
    public final InterfaceC0677Re f8571l;

    /* renamed from: m, reason: collision with root package name */
    public final Mq f8572m;

    /* renamed from: n, reason: collision with root package name */
    public final InterfaceC0735Zg f8573n;

    /* renamed from: o, reason: collision with root package name */
    public final Kj f8574o;

    /* renamed from: p, reason: collision with root package name */
    public final Wi f8575p;

    /* renamed from: q, reason: collision with root package name */
    public final AD f8576q;

    /* renamed from: r, reason: collision with root package name */
    public final Executor f8577r;

    /* renamed from: s, reason: collision with root package name */
    public Q2.a1 f8578s;

    public C0587Eg(G7 g7, Context context, Mq mq, View view, InterfaceC0677Re interfaceC0677Re, InterfaceC0735Zg interfaceC0735Zg, Kj kj, Wi wi, AD ad, Executor executor) {
        super(g7);
        this.f8569j = context;
        this.f8570k = view;
        this.f8571l = interfaceC0677Re;
        this.f8572m = mq;
        this.f8573n = interfaceC0735Zg;
        this.f8574o = kj;
        this.f8575p = wi;
        this.f8576q = ad;
        this.f8577r = executor;
    }

    @Override // com.google.android.gms.internal.ads.AbstractC0762ah
    public final void a() {
        this.f8577r.execute(new K4(20, this));
        super.a();
    }

    @Override // com.google.android.gms.internal.ads.AbstractC0579Dg
    public final int b() {
        return ((Nq) this.f12692a.f11596b.f13762m).f10825d;
    }

    @Override // com.google.android.gms.internal.ads.AbstractC0579Dg
    public final int c() {
        A7 a7 = F7.x7;
        Q2.r rVar = Q2.r.f5053d;
        if (((Boolean) rVar.f5056c.a(a7)).booleanValue() && this.f12693b.f10501g0) {
            if (!((Boolean) rVar.f5056c.a(F7.y7)).booleanValue()) {
                return 0;
            }
        }
        return ((Nq) this.f12692a.f11596b.f13762m).f10824c;
    }

    @Override // com.google.android.gms.internal.ads.AbstractC0579Dg
    public final View d() {
        return this.f8570k;
    }

    @Override // com.google.android.gms.internal.ads.AbstractC0579Dg
    public final InterfaceC0391w0 e() {
        try {
            return this.f8573n.mo15a();
        } catch (Yq unused) {
            return null;
        }
    }

    @Override // com.google.android.gms.internal.ads.AbstractC0579Dg
    public final Mq f() {
        Q2.a1 a1Var = this.f8578s;
        if (a1Var != null) {
            return a1Var.f4982s ? new Mq(-3, 0, true) : new Mq(a1Var.f4978o, a1Var.f4975l, false);
        }
        Lq lq = this.f12693b;
        if (lq.f10494c0) {
            for (String str : lq.f10489a) {
                if (str == null || !str.contains("FirstParty")) {
                }
            }
            View view = this.f8570k;
            return new Mq(view.getWidth(), view.getHeight(), false);
        }
        return (Mq) lq.f10521r.get(0);
    }

    @Override // com.google.android.gms.internal.ads.AbstractC0579Dg
    public final Mq g() {
        return this.f8572m;
    }

    @Override // com.google.android.gms.internal.ads.AbstractC0579Dg
    public final void h() {
        this.f8575p.i();
    }

    @Override // com.google.android.gms.internal.ads.AbstractC0579Dg
    public final void i(FrameLayout frameLayout, Q2.a1 a1Var) {
        InterfaceC0677Re interfaceC0677Re;
        if (frameLayout == null || (interfaceC0677Re = this.f8571l) == null) {
            return;
        }
        interfaceC0677Re.K0(C1586t.a(a1Var));
        frameLayout.setMinimumHeight(a1Var.f4976m);
        frameLayout.setMinimumWidth(a1Var.f4979p);
        this.f8578s = a1Var;
    }
}
