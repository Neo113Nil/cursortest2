package com.google.android.gms.internal.ads;

import android.content.Context;
import android.view.View;
import android.widget.FrameLayout;
import java.util.concurrent.Executor;

/* renamed from: com.google.android.gms.internal.ads.Fg, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0595Fg implements DD {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f9076a = 0;

    /* renamed from: b, reason: collision with root package name */
    public final CD f9077b;

    /* renamed from: c, reason: collision with root package name */
    public final CD f9078c;

    /* renamed from: d, reason: collision with root package name */
    public final CD f9079d;

    /* renamed from: e, reason: collision with root package name */
    public final ID f9080e;
    public final ID f;

    /* renamed from: g, reason: collision with root package name */
    public final ID f9081g;

    /* renamed from: h, reason: collision with root package name */
    public final ID f9082h;
    public final ID i;

    /* renamed from: j, reason: collision with root package name */
    public final ID f9083j;

    /* renamed from: k, reason: collision with root package name */
    public final ID f9084k;

    public C0595Fg(a3.r rVar, CD cd, C0616Ig c0616Ig, C0616Ig c0616Ig2, C0616Ig c0616Ig3, C0616Ig c0616Ig4, C1435pj c1435pj, CD cd2, C1168jm c1168jm, CD cd3) {
        this.f9080e = rVar;
        this.f9077b = cd;
        this.f = c0616Ig;
        this.f9081g = c0616Ig2;
        this.f9082h = c0616Ig3;
        this.i = c0616Ig4;
        this.f9083j = c1435pj;
        this.f9078c = cd2;
        this.f9084k = c1168jm;
        this.f9079d = cd3;
    }

    public C0587Eg a() {
        G7 a5 = ((a3.r) this.f9080e).a();
        Context context = (Context) this.f9077b.d();
        Mq mq = (Mq) ((C0616Ig) this.f).f9589b.f17996n;
        AbstractC1400ot.D(mq);
        View view = (View) ((C0616Ig) this.f9081g).f9589b.f17995m;
        AbstractC1400ot.D(view);
        m2.g gVar = ((C0616Ig) this.f9082h).f9589b;
        InterfaceC0735Zg interfaceC0735Zg = (InterfaceC0735Zg) ((C0616Ig) this.i).f9589b.f17994l;
        Kj kj = (Kj) ((C1435pj) this.f9083j).f15020b.f14827l;
        AbstractC1400ot.D(kj);
        return new C0587Eg(a5, context, mq, view, (InterfaceC0677Re) gVar.f17997o, interfaceC0735Zg, kj, (Wi) this.f9078c.d(), CD.a(new JD((C1168jm) this.f9084k)), (Executor) this.f9079d.d());
    }

    public Xn b() {
        C0554Af c0554Af = (C0554Af) ((ED) this.f9080e).f8474a;
        Gh a5 = ((Hh) this.f).f9452b.a();
        C1574so c1574so = (C1574so) this.f9081g;
        Hi hi = (Hi) this.f9082h;
        C1435pj c1435pj = (C1435pj) this.i;
        return new Xn(c0554Af, a5, c1574so.f15601b, hi.f9454b, c1435pj.f15020b, (C1344ni) ((C0721Xg) this.f9083j).f12206b.f12040l, (FrameLayout) ((Mt) ((C0650Nf) this.f9084k).f10799b).f10741l, (C1838yi) this.f9077b.d(), (C0769ao) this.f9078c.d(), (C1528rn) this.f9079d.d());
    }

    @Override // com.google.android.gms.internal.ads.ID
    public final Object d() {
        switch (this.f9076a) {
            case 0:
                return a();
            case 1:
                C0905dr c0905dr = ((C0943ek) this.f9080e).f13329b;
                C0905dr c0905dr2 = ((C0943ek) this.f).f13329b;
                C0905dr c0905dr3 = ((C0943ek) this.f9081g).f13329b;
                return new C0899dk((C0673Ra) c0905dr.f13188n, (C0680Sa) c0905dr2.f13187m, (InterfaceC0694Ua) c0905dr3.f13186l, (Uh) this.f9077b.d(), (Kh) this.f9078c.d(), (Ui) this.f9079d.d(), (Context) ((CD) this.f9082h).d(), ((C1119ih) this.i).a(), ((C1745wf) this.f9083j).a(), ((Hh) this.f9084k).a());
            case 2:
                return new Mk((Kh) this.f9077b.d(), (Yh) this.f9078c.d(), (C0941ei) this.f9079d.d(), (C1076hi) ((CD) this.f9080e).d(), (C1793xi) ((CD) this.f).d(), (Ui) ((CD) this.f9081g).d(), (C1482ql) ((CD) this.f9082h).d(), (C1041gs) ((CD) this.i).d(), (Xm) ((CD) this.f9083j).d(), (C1074hg) ((CD) this.f9084k).d());
            default:
                return b();
        }
    }

    public C0595Fg(C0943ek c0943ek, C0943ek c0943ek2, C0943ek c0943ek3, CD cd, CD cd2, CD cd3, CD cd4, C1119ih c1119ih, C1745wf c1745wf, Hh hh) {
        this.f9080e = c0943ek;
        this.f = c0943ek2;
        this.f9081g = c0943ek3;
        this.f9077b = cd;
        this.f9078c = cd2;
        this.f9079d = cd3;
        this.f9082h = cd4;
        this.i = c1119ih;
        this.f9083j = c1745wf;
        this.f9084k = hh;
    }

    public C0595Fg(CD cd, CD cd2, CD cd3, CD cd4, CD cd5, CD cd6, CD cd7, CD cd8, CD cd9, CD cd10) {
        this.f9077b = cd;
        this.f9078c = cd2;
        this.f9079d = cd3;
        this.f9080e = cd4;
        this.f = cd5;
        this.f9081g = cd6;
        this.f9082h = cd7;
        this.i = cd8;
        this.f9083j = cd9;
        this.f9084k = cd10;
    }

    public C0595Fg(ED ed, Hh hh, C1574so c1574so, Hi hi, C1435pj c1435pj, C0721Xg c0721Xg, C0650Nf c0650Nf, CD cd, CD cd2, CD cd3) {
        this.f9080e = ed;
        this.f = hh;
        this.f9081g = c1574so;
        this.f9082h = hi;
        this.i = c1435pj;
        this.f9083j = c0721Xg;
        this.f9084k = c0650Nf;
        this.f9077b = cd;
        this.f9078c = cd2;
        this.f9079d = cd3;
    }
}
