package com.google.android.gms.internal.ads;

import a3.C0469m;
import java.util.Map;

/* renamed from: com.google.android.gms.internal.ads.mh, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1298mh implements DD {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f14509a = 1;

    /* renamed from: b, reason: collision with root package name */
    public final CD f14510b;

    /* renamed from: c, reason: collision with root package name */
    public final CD f14511c;

    /* renamed from: d, reason: collision with root package name */
    public final CD f14512d;

    /* renamed from: e, reason: collision with root package name */
    public final ID f14513e;
    public final ID f;

    /* renamed from: g, reason: collision with root package name */
    public final ID f14514g;

    /* renamed from: h, reason: collision with root package name */
    public final ID f14515h;
    public final Object i;

    /* renamed from: j, reason: collision with root package name */
    public final ID f14516j;

    /* renamed from: k, reason: collision with root package name */
    public final ID f14517k;

    /* renamed from: l, reason: collision with root package name */
    public final ID f14518l;

    public C1298mh(Qj qj, Hh hh, CD cd, C0847cd c0847cd, C0469m c0469m, CD cd2, ED ed, C0847cd c0847cd2, C0469m c0469m2, C0847cd c0847cd3, CD cd3) {
        this.f14513e = qj;
        this.f = hh;
        this.f14510b = cd;
        this.f14514g = c0847cd;
        this.f14515h = c0469m;
        this.f14511c = cd2;
        this.i = ed;
        this.f14516j = c0847cd2;
        this.f14517k = c0469m2;
        this.f14518l = c0847cd3;
        this.f14512d = cd3;
    }

    @Override // com.google.android.gms.internal.ads.ID
    public final Object d() {
        switch (this.f14509a) {
            case 0:
                C1258lm b3 = ((Qj) this.f14513e).b();
                Wq a5 = ((Hh) this.f).a();
                Gr gr = (Gr) this.f14510b.d();
                C0847cd c0847cd = (C0847cd) this.f14514g;
                C0709Wb c0709Wb = new C0709Wb(13, ((FD) c0847cd.f13003b).d(), ((FD) c0847cd.f13004c).d());
                C0947eo b5 = ((C0469m) this.f14515h).b();
                Ai ai = (Ai) this.f14511c.d();
                Sq sq = (Sq) ((ED) this.i).f8474a;
                C0847cd c0847cd2 = (C0847cd) this.f14516j;
                c0847cd2.getClass();
                C0606Hd c0606Hd = AbstractC0613Id.f9539a;
                AbstractC1400ot.D(c0606Hd);
                C0905dr c0905dr = new C0905dr(c0606Hd, ((C1520rf) c0847cd2.f13003b).a(), CD.a(new JD((a3.y) c0847cd2.f13004c)), 17, false);
                C0580Dh a6 = ((C0469m) this.f14517k).a();
                AbstractC1400ot.D(c0606Hd);
                C0847cd c0847cd3 = (C0847cd) this.f14518l;
                Map map = ((GD) c0847cd3.f13003b).f7795a;
                AbstractC1400ot.D(c0606Hd);
                return new C1253lh(b3, a5, gr, c0709Wb, b5, ai, sq, c0905dr, a6, c0606Hd, new C1707vm(map, c0606Hd, new C1389oi(((Lh) c0847cd3.f13004c).f10455b.d())), (C1528rn) this.f14512d.d());
            default:
                return new BinderC1082ho((Kh) this.f14510b.d(), (Ui) this.f14511c.d(), (Uh) this.f14512d.d(), (Yh) ((CD) this.f14513e).d(), (C0763ai) ((CD) this.f).d(), (Sh) ((CD) this.f14514g).d(), (C1793xi) ((CD) this.f14515h).d(), (C0853cj) ((CD) this.i).d(), (C1076hi) ((CD) this.f14516j).d(), (Zi) ((CD) this.f14517k).d(), (C1658ui) ((CD) this.f14518l).d());
        }
    }

    public C1298mh(CD cd, CD cd2, CD cd3, CD cd4, CD cd5, CD cd6, CD cd7, CD cd8, CD cd9, CD cd10, CD cd11) {
        this.f14510b = cd;
        this.f14511c = cd2;
        this.f14512d = cd3;
        this.f14513e = cd4;
        this.f = cd5;
        this.f14514g = cd6;
        this.f14515h = cd7;
        this.i = cd8;
        this.f14516j = cd9;
        this.f14517k = cd10;
        this.f14518l = cd11;
    }
}
