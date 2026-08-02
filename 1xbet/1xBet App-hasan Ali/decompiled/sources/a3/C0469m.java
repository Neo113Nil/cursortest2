package a3;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import com.google.android.gms.internal.ads.A7;
import com.google.android.gms.internal.ads.AbstractC0613Id;
import com.google.android.gms.internal.ads.AbstractC1400ot;
import com.google.android.gms.internal.ads.C0554Af;
import com.google.android.gms.internal.ads.C0555Ag;
import com.google.android.gms.internal.ads.C0580Dh;
import com.google.android.gms.internal.ads.C0606Hd;
import com.google.android.gms.internal.ads.C0769ao;
import com.google.android.gms.internal.ads.C0947eo;
import com.google.android.gms.internal.ads.C0951es;
import com.google.android.gms.internal.ads.C0995fr;
import com.google.android.gms.internal.ads.C1041gs;
import com.google.android.gms.internal.ads.C1168jm;
import com.google.android.gms.internal.ads.C1392ol;
import com.google.android.gms.internal.ads.C1476qf;
import com.google.android.gms.internal.ads.C1528rn;
import com.google.android.gms.internal.ads.C1565sf;
import com.google.android.gms.internal.ads.C1616tl;
import com.google.android.gms.internal.ads.C1745wf;
import com.google.android.gms.internal.ads.CD;
import com.google.android.gms.internal.ads.Ci;
import com.google.android.gms.internal.ads.DD;
import com.google.android.gms.internal.ads.ED;
import com.google.android.gms.internal.ads.F7;
import com.google.android.gms.internal.ads.Gr;
import com.google.android.gms.internal.ads.Hh;
import com.google.android.gms.internal.ads.ID;
import com.google.android.gms.internal.ads.InterfaceC0896dh;
import com.google.android.gms.internal.ads.JD;
import com.google.android.gms.internal.ads.Mr;
import com.google.android.gms.internal.ads.Oh;
import com.google.android.gms.internal.ads.Q4;
import com.google.android.gms.internal.ads.Xq;
import java.util.concurrent.ScheduledExecutorService;

/* renamed from: a3.m, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0469m implements DD {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f6583a = 1;

    /* renamed from: b, reason: collision with root package name */
    public final CD f6584b;

    /* renamed from: c, reason: collision with root package name */
    public final DD f6585c;

    /* renamed from: d, reason: collision with root package name */
    public final CD f6586d;

    /* renamed from: e, reason: collision with root package name */
    public final CD f6587e;
    public final CD f;

    /* renamed from: g, reason: collision with root package name */
    public final CD f6588g;

    /* renamed from: h, reason: collision with root package name */
    public final CD f6589h;
    public final CD i;

    /* renamed from: j, reason: collision with root package name */
    public final ID f6590j;

    /* renamed from: k, reason: collision with root package name */
    public final DD f6591k;

    /* renamed from: l, reason: collision with root package name */
    public final ID f6592l;

    /* renamed from: m, reason: collision with root package name */
    public final ID f6593m;

    public C0469m(C1565sf c1565sf, CD cd, CD cd2, CD cd3, CD cd4, CD cd5, CD cd6, CD cd7, CD cd8, CD cd9, M m5, CD cd10) {
        this.f6591k = c1565sf;
        this.f6584b = cd;
        this.f6586d = cd2;
        this.f6587e = cd3;
        this.f = cd4;
        this.f6588g = cd5;
        this.f6589h = cd6;
        this.i = cd7;
        this.f6592l = cd8;
        this.f6590j = cd9;
        this.f6585c = m5;
        this.f6593m = cd10;
    }

    public C0580Dh a() {
        Gr gr = (Gr) this.f6584b.d();
        U2.a a5 = ((C1745wf) this.f6585c).a();
        ApplicationInfo applicationInfo = (ApplicationInfo) this.f6586d.d();
        String packageName = ((C1565sf) ((C1168jm) this.f6590j).f14141b).a().getPackageName();
        AbstractC1400ot.D(packageName);
        A7 a7 = F7.f8796a;
        return new C0580Dh(gr, a5, applicationInfo, packageName, Q2.r.f5053d.f5054a.n(), (PackageInfo) this.f6587e.d(), CD.a(new JD(this.f)), ((C1476qf) this.f6591k).a(), (String) this.f6588g.d(), ((C0555Ag) this.f6592l).b(), ((Hh) this.f6593m).a(), (Ci) this.f6589h.d(), ((Integer) this.i.d()).intValue());
    }

    public C0947eo b() {
        Context a5 = ((C1565sf) this.f6591k).a();
        Gr gr = (Gr) this.f6584b.d();
        C0769ao c0769ao = (C0769ao) this.f6586d.d();
        Oh oh = (Oh) this.f6587e.d();
        C0951es c0951es = (C0951es) this.f.d();
        C1041gs c1041gs = (C1041gs) this.f6588g.d();
        InterfaceC0896dh interfaceC0896dh = (InterfaceC0896dh) this.f6589h.d();
        C0606Hd c0606Hd = AbstractC0613Id.f9539a;
        AbstractC1400ot.D(c0606Hd);
        return new C0947eo(a5, gr, c0769ao, oh, c0951es, c1041gs, interfaceC0896dh, c0606Hd, (ScheduledExecutorService) this.i.d(), (C1528rn) ((CD) this.f6592l).d(), (Mr) ((CD) this.f6590j).d(), ((M) this.f6585c).a(), (C1392ol) ((CD) this.f6593m).d());
    }

    @Override // com.google.android.gms.internal.ads.ID
    public final Object d() {
        switch (this.f6583a) {
            case 0:
                C0554Af c0554Af = (C0554Af) ((ED) this.f6590j).f8474a;
                Context a5 = ((C1565sf) this.f6591k).a();
                Q4 q42 = (Q4) this.f6584b.d();
                C0995fr c0995fr = (C0995fr) this.f6586d.d();
                C0606Hd c0606Hd = AbstractC0613Id.f9539a;
                AbstractC1400ot.D(c0606Hd);
                return new BinderC0468l(c0554Af, a5, q42, c0995fr, c0606Hd, (ScheduledExecutorService) this.f6587e.d(), (C1616tl) this.f.d(), (C1041gs) this.f6588g.d(), ((C1745wf) this.f6585c).a(), ((M) this.f6593m).b(), (Xq) this.f6589h.d(), (F) this.i.d(), (A) ((CD) this.f6592l).d());
            case 1:
                return a();
            default:
                return b();
        }
    }

    public C0469m(CD cd, C1745wf c1745wf, CD cd2, C1168jm c1168jm, CD cd3, CD cd4, C1476qf c1476qf, CD cd5, C0555Ag c0555Ag, Hh hh, CD cd6, CD cd7) {
        this.f6584b = cd;
        this.f6585c = c1745wf;
        this.f6586d = cd2;
        this.f6590j = c1168jm;
        this.f6587e = cd3;
        this.f = cd4;
        this.f6591k = c1476qf;
        this.f6588g = cd5;
        this.f6592l = c0555Ag;
        this.f6593m = hh;
        this.f6589h = cd6;
        this.i = cd7;
    }

    public C0469m(ED ed, C1565sf c1565sf, CD cd, CD cd2, CD cd3, CD cd4, CD cd5, C1745wf c1745wf, M m5, CD cd6, CD cd7, CD cd8) {
        this.f6590j = ed;
        this.f6591k = c1565sf;
        this.f6584b = cd;
        this.f6586d = cd2;
        this.f6587e = cd3;
        this.f = cd4;
        this.f6588g = cd5;
        this.f6585c = c1745wf;
        this.f6593m = m5;
        this.f6589h = cd6;
        this.i = cd7;
        this.f6592l = cd8;
    }
}
