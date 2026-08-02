package com.google.android.gms.internal.ads;

import Q2.C0375o;
import android.content.Context;
import android.os.Binder;
import android.os.Bundle;
import android.os.Parcel;
import android.os.RemoteException;
import android.util.Pair;
import android.view.View;
import java.security.GeneralSecurityException;
import java.security.InvalidAlgorithmParameterException;
import java.util.List;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.google.android.gms.internal.ads.n6, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1324n6 implements P2.d, InterfaceC1621tq {

    /* renamed from: k, reason: collision with root package name */
    public Object f14578k;

    /* renamed from: l, reason: collision with root package name */
    public Object f14579l;

    /* renamed from: m, reason: collision with root package name */
    public Object f14580m;

    /* renamed from: n, reason: collision with root package name */
    public Object f14581n;

    /* renamed from: o, reason: collision with root package name */
    public Object f14582o;

    /* renamed from: p, reason: collision with root package name */
    public Object f14583p;

    public C1324n6(int i) {
        switch (i) {
            case 6:
                this.f14578k = null;
                this.f14579l = null;
                this.f14580m = null;
                this.f14581n = null;
                this.f14582o = null;
                this.f14583p = Dx.f8423o;
                break;
            default:
                this.f14578k = null;
                this.f14579l = new K4(6, this);
                this.f14580m = new Object();
                break;
        }
    }

    public static String b(C1324n6 c1324n6) {
        String str = (String) Q2.r.f5053d.f5056c.a(F7.B9);
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.putOpt("objectId", (Long) c1324n6.f14578k);
            jSONObject.put("eventCategory", (String) c1324n6.f14579l);
            jSONObject.putOpt("event", (String) c1324n6.f14580m);
            jSONObject.putOpt("errorCode", (Integer) c1324n6.f14581n);
            jSONObject.putOpt("rewardType", (String) c1324n6.f14582o);
            jSONObject.putOpt("rewardAmount", (Integer) c1324n6.f14583p);
        } catch (JSONException unused) {
            U2.j.i("Could not convert parameters to JSON.");
        }
        return str + "(\"h5adsEvent\"," + jSONObject.toString() + ");";
    }

    public static /* bridge */ /* synthetic */ void s(C1324n6 c1324n6) {
        synchronized (c1324n6.f14580m) {
            try {
                C1414p6 c1414p6 = (C1414p6) c1324n6.f14581n;
                if (c1414p6 == null) {
                    return;
                }
                if (c1414p6.a() || ((C1414p6) c1324n6.f14581n).h()) {
                    ((C1414p6) c1324n6.f14581n).l();
                }
                c1324n6.f14581n = null;
                c1324n6.f14583p = null;
                Binder.flushPendingCommands();
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public static C1603tG v(ME me, AbstractC1044gv abstractC1044gv, C1603tG c1603tG, C1785xa c1785xa) {
        int a5;
        AbstractC0715Xa l12 = me.l1();
        me.f10609n.d();
        C1109iE c1109iE = me.f10608m;
        c1109iE.t0();
        if (c1109iE.f13907a0.f8476a.o()) {
            a5 = 0;
        } else {
            EE ee = c1109iE.f13907a0;
            a5 = ee.f8476a.a(ee.f8477b.f15679a);
        }
        Object f = l12.o() ? null : l12.f(a5);
        if (!me.x1() && !l12.o()) {
            C1785xa d5 = l12.d(a5, c1785xa, false);
            me.s1();
            int i = AbstractC1260lo.f14419a;
            d5.getClass();
        }
        for (int i5 = 0; i5 < abstractC1044gv.size(); i5++) {
            C1603tG c1603tG2 = (C1603tG) abstractC1044gv.get(i5);
            if (z(c1603tG2, f, me.x1(), me.p1(), me.q1())) {
                return c1603tG2;
            }
        }
        if (abstractC1044gv.isEmpty() && c1603tG != null && z(c1603tG, f, me.x1(), me.p1(), me.q1())) {
            return c1603tG;
        }
        return null;
    }

    public static boolean z(C1603tG c1603tG, Object obj, boolean z3, int i, int i5) {
        if (!c1603tG.f15679a.equals(obj)) {
            return false;
        }
        int i6 = c1603tG.f15680b;
        return z3 ? i6 == i && c1603tG.f15681c == i5 : i6 == -1 && c1603tG.f15683e == -1;
    }

    public Cr a() {
        Gr gr = (Gr) this.f14583p;
        Object obj = this.f14580m;
        String str = (String) this.f14578k;
        if (str == null) {
            gr.getClass();
            str = ((Dr) obj).f8403k;
        }
        Cr cr = new Cr(obj, str, (E3.a) this.f14582o);
        gr.f9281c.n1(new U4(28, cr));
        RunnableC1081hn runnableC1081hn = new RunnableC1081hn(8, this, cr);
        C0606Hd c0606Hd = AbstractC0613Id.f9544g;
        ((E3.a) this.f14579l).a(runnableC1081hn, c0606Hd);
        cr.a(new Kw(0, cr, new C1667ur(1, this, cr)), c0606Hd);
        return cr;
    }

    public void c(int i) {
        if (i != 16 && i != 24 && i != 32) {
            throw new InvalidAlgorithmParameterException(String.format("Invalid key size %d; only 16-byte, 24-byte and 32-byte AES keys are supported", Integer.valueOf(i)));
        }
        this.f14578k = Integer.valueOf(i);
    }

    @Override // P2.d
    public void d() {
        if (((AtomicBoolean) this.f14583p).get()) {
            ((Kh) this.f14578k).z();
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1621tq
    public E3.a e(C1390oj c1390oj, InterfaceC1576sq interfaceC1576sq) {
        synchronized (this) {
            C0570Cf g5 = interfaceC1576sq.g((InterfaceC1531rq) c1390oj.f14828m);
            C1217kq c1217kq = new C1217kq((String) this.f14581n);
            switch (g5.f8039a) {
                case 0:
                    g5.f8042d = c1217kq;
                    break;
                default:
                    g5.f8042d = c1217kq;
                    break;
            }
            InterfaceC0588Eh interfaceC0588Eh = (InterfaceC0588Eh) g5.c();
            interfaceC0588Eh.f();
            interfaceC0588Eh.f();
            Q2.X0 x02 = interfaceC0588Eh.f().f12098d;
            if (x02.f4950C != null || x02.f4955H != null) {
                this.f14582o = interfaceC0588Eh;
                return ((C0709Wb) this.f14578k).m(c1390oj, interfaceC1576sq, interfaceC0588Eh);
            }
            Wq f = interfaceC0588Eh.f();
            return AbstractC1400ot.j0(Hw.r(((C0905dr) this.f14579l).q(c1390oj, interfaceC1576sq, interfaceC0588Eh)), new En(this, c1390oj, new C1172jq(interfaceC1576sq, c1390oj, f.f12098d, f.f, (Qw) this.f14583p, f.f12102j, null), interfaceC1576sq, interfaceC0588Eh, 1), (Qw) this.f14583p);
        }
    }

    public C1369o6 f(C1459q6 c1459q6) {
        synchronized (this.f14580m) {
            if (((C1503r6) this.f14583p) == null) {
                return new C1369o6();
            }
            try {
                if (((C1414p6) this.f14581n).A()) {
                    C1503r6 c1503r6 = (C1503r6) this.f14583p;
                    Parcel N5 = c1503r6.N();
                    F5.c(N5, c1459q6);
                    Parcel Y4 = c1503r6.Y(N5, 2);
                    C1369o6 c1369o6 = (C1369o6) F5.a(Y4, C1369o6.CREATOR);
                    Y4.recycle();
                    return c1369o6;
                }
                C1503r6 c1503r62 = (C1503r6) this.f14583p;
                Parcel N6 = c1503r62.N();
                F5.c(N6, c1459q6);
                Parcel Y5 = c1503r62.Y(N6, 1);
                C1369o6 c1369o62 = (C1369o6) F5.a(Y5, C1369o6.CREATOR);
                Y5.recycle();
                return c1369o62;
            } catch (RemoteException e3) {
                U2.j.g("Unable to call into cache service.", e3);
                return new C1369o6();
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public boolean g(Q2.X0 x02, String str, AbstractC1668us abstractC1668us, Jo jo) {
        Mr mr;
        final int i = 1;
        final int i5 = 0;
        Object[] objArr = 0;
        Object[] objArr2 = 0;
        Object[] objArr3 = 0;
        P2.o oVar = P2.o.f4767B;
        T2.L l5 = oVar.f4771c;
        Context context = (Context) this.f14582o;
        boolean g5 = T2.L.g(context);
        C0554Af c0554Af = (C0554Af) this.f14579l;
        if (g5 && x02.f4950C == null) {
            U2.j.f("Failed to load the ad because app ID is missing.");
            c0554Af.a().execute(new Runnable(this) { // from class: com.google.android.gms.internal.ads.Lo

                /* renamed from: l, reason: collision with root package name */
                public final /* synthetic */ C1324n6 f10464l;

                {
                    this.f10464l = this;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    switch (i5) {
                        case 0:
                            C0905dr c0905dr = (C0905dr) this.f10464l.f14580m;
                            ((Io) c0905dr.f13188n).l0(AbstractC1803xs.I(4, null, null));
                            break;
                        default:
                            C0905dr c0905dr2 = (C0905dr) this.f10464l.f14580m;
                            ((Io) c0905dr2.f13188n).l0(AbstractC1803xs.I(6, null, null));
                            break;
                    }
                }
            });
            return false;
        }
        if (str == null) {
            U2.j.f("Ad unit ID should not be null for NativeAdLoader.");
            c0554Af.a().execute(new Runnable(this) { // from class: com.google.android.gms.internal.ads.Lo

                /* renamed from: l, reason: collision with root package name */
                public final /* synthetic */ C1324n6 f10464l;

                {
                    this.f10464l = this;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    switch (i) {
                        case 0:
                            C0905dr c0905dr = (C0905dr) this.f10464l.f14580m;
                            ((Io) c0905dr.f13188n).l0(AbstractC1803xs.I(4, null, null));
                            break;
                        default:
                            C0905dr c0905dr2 = (C0905dr) this.f10464l.f14580m;
                            ((Io) c0905dr2.f13188n).l0(AbstractC1803xs.I(6, null, null));
                            break;
                    }
                }
            });
            return false;
        }
        AbstractC1668us.o(context, x02.f4962p);
        if (((Boolean) Q2.r.f5053d.f5056c.a(F7.z8)).booleanValue() && x02.f4962p) {
            ((Ul) c0554Af.f7684v.d()).e(true);
        }
        oVar.f4776j.getClass();
        Long valueOf = Long.valueOf(System.currentTimeMillis());
        Bundle i6 = AbstractC1668us.i(new Pair("api-call", valueOf), new Pair("dynamite-enter", valueOf));
        Vq vq = (Vq) this.f14578k;
        vq.f11943a = x02;
        vq.f11960t = i6;
        vq.f11953m = ((Ko) abstractC1668us).f10251g;
        Wq a5 = vq.a();
        Jr C5 = AbstractC1668us.C(context, AbstractC1803xs.W(a5), 8, x02);
        Eo eo = (Eo) ((C0905dr) this.f14580m).f13187m;
        Q2.Q q5 = a5.f12106n;
        if (q5 != null) {
            eo.k(q5);
        }
        C0554Af c0554Af2 = c0554Af.f7646b;
        Gh gh = new Gh();
        gh.f9206a = context;
        gh.f9207b = a5;
        Gh gh2 = new Gh(gh);
        Fi fi = new Fi();
        fi.c(eo, c0554Af.a());
        C1880zf c1880zf = new C1880zf(c0554Af2, new Mt(15, null), new C1390oj((int) (objArr3 == true ? 1 : 0), r7.f13186l, (Object) eo.d()), new Oi(13), new Gi(fi), gh2, new Qt(23), null, null);
        if (((Boolean) AbstractC0834c8.f12977c.s()).booleanValue()) {
            mr = (Mr) c1880zf.f16683e.d();
            mr.i(8);
            mr.b(x02.f4972z);
            mr.f(x02.f4969w);
        } else {
            mr = null;
        }
        ((C0995fr) c0554Af.J.d()).b(1);
        C0606Hd c0606Hd = AbstractC0613Id.f9539a;
        AbstractC1400ot.D(c0606Hd);
        ScheduledExecutorService scheduledExecutorService = (ScheduledExecutorService) c0554Af.f7650d.d();
        C1253lh c1253lh = (C1253lh) c1880zf.f16698m0.d();
        Cr a6 = c1253lh.a(c1253lh.b());
        C1075hh c1075hh = new C1075hh(c0606Hd, scheduledExecutorService, a6);
        this.f14583p = c1075hh;
        a6.a(new Kw(objArr == true ? 1 : 0, a6, new C1390oj(16, c1075hh, new C0375o(this, (C1529ro) jo, mr, C5, c1880zf, 11, false), objArr2 == true ? 1 : 0)), c0606Hd);
        return true;
    }

    public void h(int i) {
        if (i < 16) {
            throw new InvalidAlgorithmParameterException(String.format("Invalid key size in bytes %d; HMAC key must be at least 16 bytes", Integer.valueOf(i)));
        }
        this.f14579l = Integer.valueOf(i);
    }

    @Override // P2.d
    public void i() {
        if (((AtomicBoolean) this.f14583p).get()) {
            ((Uh) this.f14579l).i();
            ((Wi) this.f14580m).i();
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1621tq
    public Object j() {
        InterfaceC0588Eh interfaceC0588Eh;
        synchronized (this) {
            interfaceC0588Eh = (InterfaceC0588Eh) this.f14582o;
        }
        return interfaceC0588Eh;
    }

    public synchronized C1414p6 k(Qt qt, U4 u42) {
        return new C1414p6((Context) this.f14582o, P2.o.f4767B.f4785s.n(), qt, u42);
    }

    @Override // P2.d
    public synchronized void l(View view) {
        if (((AtomicBoolean) this.f14583p).compareAndSet(false, true)) {
            ((C1656ug) this.f14582o).t();
            ((Ti) this.f14581n).p1(view);
        }
    }

    public void m(int i) {
        if (i < 12 || i > 16) {
            throw new GeneralSecurityException(String.format("Invalid IV size in bytes %d; IV size must be between 12 and 16 bytes", Integer.valueOf(i)));
        }
        this.f14580m = Integer.valueOf(i);
    }

    public C1324n6 n(Ar ar) {
        return p(new N9(16, ar));
    }

    public void o(int i) {
        if (i < 10) {
            throw new GeneralSecurityException(String.format("Invalid tag size in bytes %d; must be at least 10 bytes", Integer.valueOf(i)));
        }
        this.f14581n = Integer.valueOf(i);
    }

    public C1324n6 p(InterfaceC1897zw interfaceC1897zw) {
        C1537rw j02 = AbstractC1400ot.j0((E3.a) this.f14582o, interfaceC1897zw, ((Gr) this.f14583p).f9279a);
        return new C1324n6((Gr) this.f14583p, this.f14580m, (String) this.f14578k, (E3.a) this.f14579l, (List) this.f14581n, j02);
    }

    public E3.a q(C1398or c1398or, C1390oj c1390oj) {
        InterfaceC0588Eh interfaceC0588Eh = c1398or.f14864a;
        this.f14582o = interfaceC0588Eh;
        if (c1398or.f14866c == null) {
            interfaceC0588Eh.d().f14397g = c1398or.f14865b;
            return ((C0709Wb) this.f14578k).m(c1390oj, null, c1398or.f14864a);
        }
        if (interfaceC0588Eh.c() != null) {
            C0904dq c0904dq = c1398or.f14866c.f12696e;
            InterfaceC1487qq c5 = c1398or.f14864a.c();
            c0904dq.getClass();
            c0904dq.f13181r = (C0904dq) c5;
        }
        return AbstractC1400ot.c0(c1398or.f14866c);
    }

    public Ex r() {
        if (((Integer) this.f14578k) == null) {
            throw new GeneralSecurityException("AES key size is not set");
        }
        if (((Integer) this.f14579l) == null) {
            throw new GeneralSecurityException("HMAC key size is not set");
        }
        if (((Integer) this.f14580m) == null) {
            throw new GeneralSecurityException("iv size is not set");
        }
        Integer num = (Integer) this.f14581n;
        if (num == null) {
            throw new GeneralSecurityException("tag size is not set");
        }
        if (((Cx) this.f14582o) == null) {
            throw new GeneralSecurityException("hash type is not set");
        }
        int intValue = num.intValue();
        Cx cx = (Cx) this.f14582o;
        if (cx == Cx.f8114m) {
            if (intValue > 20) {
                throw new GeneralSecurityException(String.format("Invalid tag size in bytes %d; can be at most 20 bytes for SHA1", num));
            }
        } else if (cx == Cx.f8115n) {
            if (intValue > 28) {
                throw new GeneralSecurityException(String.format("Invalid tag size in bytes %d; can be at most 28 bytes for SHA224", num));
            }
        } else if (cx == Cx.f8116o) {
            if (intValue > 32) {
                throw new GeneralSecurityException(String.format("Invalid tag size in bytes %d; can be at most 32 bytes for SHA256", num));
            }
        } else if (cx == Cx.f8117p) {
            if (intValue > 48) {
                throw new GeneralSecurityException(String.format("Invalid tag size in bytes %d; can be at most 48 bytes for SHA384", num));
            }
        } else {
            if (cx != Cx.f8118q) {
                throw new GeneralSecurityException("unknown hash type; must be SHA1, SHA224, SHA256, SHA384 or SHA512");
            }
            if (intValue > 64) {
                throw new GeneralSecurityException(String.format("Invalid tag size in bytes %d; can be at most 64 bytes for SHA512", num));
            }
        }
        return new Ex(((Integer) this.f14578k).intValue(), ((Integer) this.f14579l).intValue(), ((Integer) this.f14580m).intValue(), ((Integer) this.f14581n).intValue(), (Dx) this.f14583p, (Cx) this.f14582o);
    }

    public C1324n6 t(long j5) {
        E3.a l02 = AbstractC1400ot.l0((E3.a) this.f14582o, j5, TimeUnit.SECONDS, ((Gr) this.f14583p).f9280b);
        return new C1324n6((Gr) this.f14583p, this.f14580m, (String) this.f14578k, (E3.a) this.f14579l, (List) this.f14581n, l02);
    }

    public void u(Context context) {
        if (context == null) {
            return;
        }
        synchronized (this.f14580m) {
            try {
                if (((Context) this.f14582o) != null) {
                    return;
                }
                this.f14582o = context.getApplicationContext();
                A7 a7 = F7.f8818d4;
                Q2.r rVar = Q2.r.f5053d;
                if (((Boolean) rVar.f5056c.a(a7)).booleanValue()) {
                    x();
                } else {
                    if (((Boolean) rVar.f5056c.a(F7.f8812c4)).booleanValue()) {
                        P2.o.f4767B.f.i(new C1279m6(0, this));
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public void w(G3 g32, C1603tG c1603tG, AbstractC0715Xa abstractC0715Xa) {
        if (c1603tG == null) {
            return;
        }
        if (abstractC0715Xa.a(c1603tG.f15679a) != -1) {
            g32.f(c1603tG, abstractC0715Xa);
            return;
        }
        AbstractC0715Xa abstractC0715Xa2 = (AbstractC0715Xa) ((Cv) this.f14580m).get(c1603tG);
        if (abstractC0715Xa2 != null) {
            g32.f(c1603tG, abstractC0715Xa2);
        }
    }

    public void x() {
        synchronized (this.f14580m) {
            try {
                if (((Context) this.f14582o) != null && ((C1414p6) this.f14581n) == null) {
                    C1414p6 k5 = k(new Qt(5, this), new U4(4, this));
                    this.f14581n = k5;
                    k5.n();
                }
            } finally {
            }
        }
    }

    public void y(AbstractC0715Xa abstractC0715Xa) {
        G3 g32 = new G3(4);
        if (((AbstractC1044gv) this.f14579l).isEmpty()) {
            w(g32, (C1603tG) this.f14582o, abstractC0715Xa);
            if (!AbstractC1400ot.q((C1603tG) this.f14583p, (C1603tG) this.f14582o)) {
                w(g32, (C1603tG) this.f14583p, abstractC0715Xa);
            }
            if (!AbstractC1400ot.q((C1603tG) this.f14581n, (C1603tG) this.f14582o) && !AbstractC1400ot.q((C1603tG) this.f14581n, (C1603tG) this.f14583p)) {
                w(g32, (C1603tG) this.f14581n, abstractC0715Xa);
            }
        } else {
            for (int i = 0; i < ((AbstractC1044gv) this.f14579l).size(); i++) {
                w(g32, (C1603tG) ((AbstractC1044gv) this.f14579l).get(i), abstractC0715Xa);
            }
            if (!((AbstractC1044gv) this.f14579l).contains((C1603tG) this.f14581n)) {
                w(g32, (C1603tG) this.f14581n, abstractC0715Xa);
            }
        }
        this.f14580m = g32.n();
    }

    public C1324n6(C0709Wb c0709Wb, C0905dr c0905dr, C1245lH c1245lH, String str, Qw qw) {
        this.f14578k = c0709Wb;
        this.f14579l = c0905dr;
        this.f14580m = c1245lH;
        this.f14581n = str;
        this.f14583p = qw;
    }

    public C1324n6(Gr gr, Object obj, String str, E3.a aVar, List list, E3.a aVar2) {
        this.f14583p = gr;
        this.f14580m = obj;
        this.f14578k = str;
        this.f14579l = aVar;
        this.f14581n = list;
        this.f14582o = aVar2;
    }

    public /* synthetic */ C1324n6(String str) {
        this.f14579l = str;
    }
}
