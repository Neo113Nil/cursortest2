package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.IInterface;
import java.util.concurrent.Executor;
import org.json.JSONObject;
import s3.BinderC2361b;

/* renamed from: com.google.android.gms.internal.ads.fo, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0992fo implements InterfaceC1573sn {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f13499a;

    /* renamed from: b, reason: collision with root package name */
    public final Context f13500b;

    /* renamed from: c, reason: collision with root package name */
    public final Executor f13501c;

    /* renamed from: d, reason: collision with root package name */
    public final C0636Lf f13502d;

    public /* synthetic */ C0992fo(Context context, Executor executor, C0636Lf c0636Lf, int i) {
        this.f13499a = i;
        this.f13500b = context;
        this.f13501c = executor;
        this.f13502d = c0636Lf;
    }

    public static final void c(Sq sq, Lq lq, C1394on c1394on) {
        try {
            C0950er c0950er = (C0950er) c1394on.f14849b;
            try {
                c0950er.f13363a.o0(((Wq) sq.f11595a.f11722l).f12098d, lq.f10529v.toString());
            } catch (Throwable th) {
                throw new Yq(th);
            }
        } catch (Exception e3) {
            U2.j.j("Fail to load ad from adapter ".concat(String.valueOf(c1394on.f14848a)), e3);
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1573sn
    public final Object a(Sq sq, Lq lq, C1394on c1394on) {
        switch (this.f13499a) {
            case 0:
                C0905dr c0905dr = new C0905dr(sq, lq, c1394on.f14848a);
                Rk rk = new Rk(new U4(23, c1394on), null, 0);
                C0636Lf c0636Lf = this.f13502d;
                C0629Kf c0629Kf = new C0629Kf(c0636Lf.f10391c, c0636Lf.f10394d, c0905dr, rk);
                ((Xh) c0629Kf.f10194p.d()).m1(new C0939eg(0, (C0950er) c1394on.f14849b), this.f13501c);
                ((Hn) c1394on.f14850c).v3((BinderC1082ho) c0629Kf.f10185R.d());
                return c0629Kf.q0();
            default:
                C0905dr c0905dr2 = new C0905dr(sq, lq, c1394on.f14848a);
                Rk rk2 = new Rk(new Qt(24, c1394on), null, 0);
                C0636Lf c0636Lf2 = this.f13502d;
                C0629Kf c0629Kf2 = new C0629Kf(c0636Lf2.f10391c, c0636Lf2.f10394d, c0905dr2, rk2);
                ((Xh) c0629Kf2.f10194p.d()).m1(new C0939eg(0, (C0950er) c1394on.f14849b), this.f13501c);
                Yh yh = (Yh) c0629Kf2.f10173D.d();
                Kh kh = (Kh) c0629Kf2.f10174E.d();
                C1076hi c1076hi = (C1076hi) c0629Kf2.J.d();
                Zi zi = (Zi) c0629Kf2.f10183P.d();
                In in = (In) c1394on.f14850c;
                BinderC1215ko binderC1215ko = new BinderC1215ko(c1076hi, kh, yh, zi);
                synchronized (in) {
                    in.f9618k = binderC1215ko;
                }
                return c0629Kf2.q0();
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1573sn
    public final void b(Sq sq, Lq lq, C1394on c1394on) {
        Yq yq;
        switch (this.f13499a) {
            case 0:
                try {
                    Wq wq = (Wq) sq.f11595a.f11722l;
                    int i = wq.f12107o.f17003l;
                    JSONObject jSONObject = lq.f10529v;
                    IInterface iInterface = c1394on.f14850c;
                    Object obj = c1394on.f14849b;
                    Context context = this.f13500b;
                    Q2.X0 x02 = wq.f12098d;
                    if (i == 3) {
                        C0950er c0950er = (C0950er) obj;
                        try {
                            c0950er.f13363a.R2(new BinderC2361b(context), x02, jSONObject.toString(), (InterfaceC0659Pa) iInterface);
                            return;
                        } finally {
                        }
                    }
                    C0950er c0950er2 = (C0950er) obj;
                    try {
                        c0950er2.f13363a.l1(new BinderC2361b(context), x02, jSONObject.toString(), (InterfaceC0659Pa) iInterface);
                        return;
                    } finally {
                    }
                } catch (Exception e3) {
                    U2.j.j("Fail to load ad from adapter ".concat(String.valueOf(c1394on.f14848a)), e3);
                    return;
                }
                U2.j.j("Fail to load ad from adapter ".concat(String.valueOf(c1394on.f14848a)), e3);
                return;
            default:
                if (((C0950er) c1394on.f14849b).a()) {
                    c(sq, lq, c1394on);
                    return;
                }
                C1071hd c1071hd = new C1071hd(this, sq, lq, c1394on, 11, false);
                In in = (In) c1394on.f14850c;
                synchronized (in) {
                    in.f9620m = c1071hd;
                }
                Object obj2 = c1394on.f14849b;
                Context context2 = this.f13500b;
                C0950er c0950er3 = (C0950er) obj2;
                Wq wq2 = (Wq) sq.f11595a.f11722l;
                InterfaceC0567Cc interfaceC0567Cc = (InterfaceC0567Cc) c1394on.f14850c;
                String jSONObject2 = lq.f10529v.toString();
                try {
                    c0950er3.f13363a.c2(new BinderC2361b(context2), wq2.f12098d, interfaceC0567Cc, jSONObject2);
                    return;
                } finally {
                }
        }
    }
}
