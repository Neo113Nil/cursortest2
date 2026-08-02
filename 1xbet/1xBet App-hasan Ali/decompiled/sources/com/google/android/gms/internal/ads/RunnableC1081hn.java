package com.google.android.gms.internal.ads;

import Q2.C0375o;
import Q2.C0387u0;
import android.content.Context;
import android.os.Build;
import android.os.Handler;
import android.os.IBinder;
import android.os.IInterface;
import android.os.ParcelFileDescriptor;
import android.os.RemoteException;
import android.view.View;
import android.webkit.WebView;
import java.io.IOException;
import java.io.InputStream;
import java.util.AbstractCollection;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Timer;
import java.util.concurrent.TimeUnit;
import q3.AbstractC2309b;

/* renamed from: com.google.android.gms.internal.ads.hn, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final /* synthetic */ class RunnableC1081hn implements Runnable {

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ int f13789k;

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ Object f13790l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ Object f13791m;

    public /* synthetic */ RunnableC1081hn(int i, Object obj, Object obj2) {
        this.f13789k = i;
        this.f13790l = obj;
        this.f13791m = obj2;
    }

    private final void a() {
        Object tt;
        C0802bc c0802bc;
        IInterface iInterface;
        int i = 0;
        IBinder iBinder = (IBinder) this.f13791m;
        int i5 = Ut.f11831k;
        if (iBinder == null) {
            tt = null;
        } else {
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.play.core.lmd.protocol.ILmdOverlayService");
            tt = queryLocalInterface instanceof Vt ? (Vt) queryLocalInterface : new Tt(iBinder, "com.google.android.play.core.lmd.protocol.ILmdOverlayService", 0);
        }
        ServiceConnectionC1088hu serviceConnectionC1088hu = (ServiceConnectionC1088hu) this.f13790l;
        C0802bc c0802bc2 = serviceConnectionC1088hu.f13813a;
        c0802bc2.f12830t = tt;
        ((C1091hx) c0802bc2.f12825o).c("linkToDeath", new Object[0]);
        try {
            c0802bc = serviceConnectionC1088hu.f13813a;
            iInterface = (Vt) c0802bc.f12830t;
        } catch (RemoteException e3) {
            ((C1091hx) serviceConnectionC1088hu.f13813a.f12825o).b(e3, "linkToDeath failed", new Object[0]);
        }
        if (iInterface == null) {
            throw null;
        }
        ((D5) iInterface).f8165l.linkToDeath((C0998fu) c0802bc.f12827q, 0);
        C0802bc c0802bc3 = serviceConnectionC1088hu.f13813a;
        c0802bc3.f12823m = false;
        synchronized (((ArrayList) c0802bc3.f12826p)) {
            try {
                ArrayList arrayList = (ArrayList) serviceConnectionC1088hu.f13813a.f12826p;
                int size = arrayList.size();
                while (i < size) {
                    Object obj = arrayList.get(i);
                    i++;
                    ((Runnable) obj).run();
                }
                ((ArrayList) serviceConnectionC1088hu.f13813a.f12826p).clear();
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    private final void b() {
        Er er = (Er) this.f13790l;
        SD sd = (SD) this.f13791m;
        er.getClass();
        synchronized (sd) {
        }
        int i = AbstractC1260lo.f14419a;
        SE se = ((SurfaceHolderCallbackC0974fE) er.f8618m).f13463k.f13883A;
        se.i(se.j((C1603tG) se.f11524d.f14582o), 1013, new QE(26));
    }

    /* JADX WARN: Removed duplicated region for block: B:103:0x036b A[Catch: all -> 0x0237, TryCatch #3 {all -> 0x0237, blocks: (B:90:0x0218, B:92:0x0234, B:95:0x023a, B:97:0x02fd, B:100:0x0302, B:101:0x0309, B:103:0x036b, B:104:0x0377, B:105:0x039d), top: B:89:0x0218 }] */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void run() {
        String str;
        C1651ub c1651ub;
        switch (this.f13789k) {
            case 0:
                Bs bs = Bs.f7902k;
                C0375o c0375o = (C0375o) this.f13790l;
                Iterator it = ((HashMap) c0375o.f5045o).values().iterator();
                while (true) {
                    boolean hasNext = it.hasNext();
                    View view = (View) this.f13791m;
                    if (!hasNext) {
                        ((Ls) c0375o.f5046p).a(view, bs);
                        return;
                    } else {
                        C1893zs c1893zs = (C1893zs) it.next();
                        if (!c1893zs.f) {
                            c1893zs.f16776b.a(view, bs);
                        }
                    }
                }
            case 1:
                C0375o c0375o2 = (C0375o) this.f13790l;
                Iterator it2 = ((HashMap) c0375o2.f5045o).values().iterator();
                while (it2.hasNext()) {
                    ((C1893zs) it2.next()).a();
                }
                Timer timer = new Timer();
                timer.schedule(new C0813bn(c0375o2, (Mt) this.f13791m, timer), 1000L);
                return;
            case 2:
                An an = (An) this.f13790l;
                an.getClass();
                InterfaceC0677Re interfaceC0677Re = (InterfaceC0677Re) this.f13791m;
                interfaceC0677Re.N0();
                BinderC0894df s2 = interfaceC0677Re.s();
                Q2.V0 v02 = an.f7716d.f12095a;
                if (v02 != null && s2 != null) {
                    s2.w3(v02);
                }
                if (!((Boolean) Q2.r.f5053d.f5056c.a(F7.i1)).booleanValue() || interfaceC0677Re.isAttachedToWindow()) {
                    return;
                }
                interfaceC0677Re.onPause();
                interfaceC0677Re.C0();
                return;
            case 3:
                ((Io) ((C0905dr) ((C1324n6) ((C0375o) this.f13790l).f5046p).f14580m).f13188n).l0((C0387u0) this.f13791m);
                return;
            case 4:
                ((C0949eq) ((C0375o) this.f13790l).f5046p).f13358d.l0((C0387u0) this.f13791m);
                return;
            case 5:
                ((C1128iq) this.f13790l).f13999d.l0((C0387u0) this.f13791m);
                return;
            case 6:
                ((Fq) ((C0375o) this.f13790l).f5046p).f9130d.l0((C0387u0) this.f13791m);
                return;
            case 7:
                InputStream inputStream = (InputStream) this.f13790l;
                try {
                    try {
                        ParcelFileDescriptor.AutoCloseOutputStream autoCloseOutputStream = new ParcelFileDescriptor.AutoCloseOutputStream((ParcelFileDescriptor) this.f13791m);
                        try {
                            AbstractC2309b.d(inputStream, autoCloseOutputStream, false);
                            autoCloseOutputStream.close();
                            inputStream.close();
                            return;
                        } finally {
                        }
                    } finally {
                    }
                } catch (IOException unused) {
                    return;
                }
            case 8:
                ((Gr) ((C1324n6) this.f13790l).f14583p).f9281c.n1(new Hq(2, (Cr) this.f13791m));
                return;
            case 9:
                Nr nr = (Nr) this.f13790l;
                Lr lr = (Lr) this.f13791m;
                nr.getClass();
                synchronized (Nr.f10842u) {
                    try {
                        if (!nr.f10851r) {
                            nr.f10851r = true;
                            if (Nr.a()) {
                                try {
                                    T2.L l5 = P2.o.f4767B.f4771c;
                                    nr.f10847n = T2.L.F(nr.f10844k);
                                } catch (RemoteException | RuntimeException e3) {
                                    P2.o.f4767B.f4774g.i("CuiMonitor.gettingAppIdFromManifest", e3);
                                }
                                j3.f fVar = j3.f.f17514b;
                                Context context = nr.f10844k;
                                fVar.getClass();
                                nr.f10848o = j3.f.a(context);
                                A7 a7 = F7.q8;
                                Q2.r rVar = Q2.r.f5053d;
                                int intValue = ((Integer) rVar.f5056c.a(a7)).intValue();
                                if (((Boolean) rVar.f5056c.a(F7.vb)).booleanValue()) {
                                    long j5 = intValue;
                                    AbstractC0613Id.f9542d.scheduleWithFixedDelay(nr, j5, j5, TimeUnit.MILLISECONDS);
                                } else {
                                    long j6 = intValue;
                                    AbstractC0613Id.f9542d.scheduleAtFixedRate(nr, j6, j6, TimeUnit.MILLISECONDS);
                                }
                            }
                        }
                    } finally {
                    }
                }
                if (Nr.a() && lr != null) {
                    synchronized (Nr.f10841t) {
                        try {
                            int w5 = ((Tr) nr.f10846m.f10141l).w();
                            A7 a72 = F7.r8;
                            Q2.r rVar2 = Q2.r.f5053d;
                            if (w5 >= ((Integer) rVar2.f5056c.a(a72)).intValue()) {
                                return;
                            }
                            Or w6 = Pr.w();
                            int i = lr.f10548m;
                            w6.e();
                            ((Pr) w6.f10141l).zzd = i - 2;
                            boolean z3 = lr.f10539b;
                            w6.e();
                            ((Pr) w6.f10141l).zzk = z3;
                            long j7 = lr.f10538a;
                            w6.e();
                            ((Pr) w6.f10141l).zzl = j7;
                            w6.e();
                            ((Pr) w6.f10141l).zzp = 1;
                            String str2 = nr.f10845l.f5852k;
                            w6.e();
                            Pr.K((Pr) w6.f10141l, str2);
                            String str3 = nr.f10847n;
                            w6.e();
                            Pr.y((Pr) w6.f10141l, str3);
                            String str4 = Build.VERSION.RELEASE;
                            w6.e();
                            Pr.H((Pr) w6.f10141l);
                            int i5 = Build.VERSION.SDK_INT;
                            w6.e();
                            ((Pr) w6.f10141l).zzA = i5;
                            int i6 = lr.f10550o;
                            w6.e();
                            Pr.S((Pr) w6.f10141l, i6);
                            int i7 = lr.f10540c;
                            w6.e();
                            ((Pr) w6.f10141l).zzG = i7;
                            long j8 = nr.f10848o;
                            w6.e();
                            ((Pr) w6.f10141l).zzH = j8;
                            int i8 = lr.f10549n;
                            w6.e();
                            Pr.Q((Pr) w6.f10141l, i8);
                            String str5 = lr.f10541d;
                            w6.e();
                            Pr.z((Pr) w6.f10141l, str5);
                            String str6 = lr.f10542e;
                            w6.e();
                            Pr.C((Pr) w6.f10141l, str6);
                            String str7 = lr.f;
                            w6.e();
                            Pr.E((Pr) w6.f10141l, str7);
                            C0811bl a5 = nr.f10849p.a(lr.f);
                            if (a5 != null && (c1651ub = a5.f12898b) != null) {
                                str = c1651ub.toString();
                                w6.e();
                                ((Pr) w6.f10141l).zzW = str;
                                String str8 = lr.f10543g;
                                w6.e();
                                Pr.I((Pr) w6.f10141l, str8);
                                int i9 = lr.f10544h;
                                w6.e();
                                Pr.J((Pr) w6.f10141l, i9);
                                String str9 = lr.f10546k;
                                w6.e();
                                Pr.A((Pr) w6.f10141l, str9);
                                String str10 = lr.i;
                                w6.e();
                                Pr.P((Pr) w6.f10141l, str10);
                                String str11 = lr.f10545j;
                                w6.e();
                                ((Pr) w6.f10141l).zzZ = str11;
                                long j9 = lr.f10547l;
                                w6.e();
                                ((Pr) w6.f10141l).zzm = j9;
                                if (((Boolean) rVar2.f5056c.a(F7.v8)).booleanValue()) {
                                    AbstractCollection abstractCollection = nr.f10850q;
                                    w6.e();
                                    Pr.x((Pr) w6.f10141l, abstractCollection);
                                }
                                Qr qr = nr.f10846m;
                                Rr w7 = Sr.w();
                                w7.e();
                                Sr.x((Sr) w7.f10141l, (Pr) w6.b());
                                qr.e();
                                Tr.y((Tr) qr.f10141l, (Sr) w7.b());
                                return;
                            }
                            str = "";
                            w6.e();
                            ((Pr) w6.f10141l).zzW = str;
                            String str82 = lr.f10543g;
                            w6.e();
                            Pr.I((Pr) w6.f10141l, str82);
                            int i92 = lr.f10544h;
                            w6.e();
                            Pr.J((Pr) w6.f10141l, i92);
                            String str92 = lr.f10546k;
                            w6.e();
                            Pr.A((Pr) w6.f10141l, str92);
                            String str102 = lr.i;
                            w6.e();
                            Pr.P((Pr) w6.f10141l, str102);
                            String str112 = lr.f10545j;
                            w6.e();
                            ((Pr) w6.f10141l).zzZ = str112;
                            long j92 = lr.f10547l;
                            w6.e();
                            ((Pr) w6.f10141l).zzm = j92;
                            if (((Boolean) rVar2.f5056c.a(F7.v8)).booleanValue()) {
                            }
                            Qr qr2 = nr.f10846m;
                            Rr w72 = Sr.w();
                            w72.e();
                            Sr.x((Sr) w72.f10141l, (Pr) w6.b());
                            qr2.e();
                            Tr.y((Tr) qr2.f10141l, (Sr) w72.b());
                            return;
                        } finally {
                        }
                    }
                }
                return;
            case 10:
                AbstractC1668us.k0((WebView) this.f13790l, (String) this.f13791m);
                return;
            case 11:
                ((D3.f) this.f13791m).f946a.f(Ct.a((Context) this.f13790l, "GLAS"));
                return;
            case 12:
                a();
                return;
            case 13:
                ((AbstractC1672uw) this.f13790l).r((AbstractC0821bv) this.f13791m);
                return;
            case 14:
                C1109iE c1109iE = (C1109iE) this.f13790l;
                T2 t22 = (T2) this.f13791m;
                int i10 = c1109iE.f13891I - t22.f11616b;
                c1109iE.f13891I = i10;
                boolean z5 = true;
                if (t22.f11617c) {
                    c1109iE.J = t22.f11618d;
                    c1109iE.K = true;
                }
                if (i10 == 0) {
                    AbstractC0715Xa abstractC0715Xa = ((EE) t22.f11619e).f8476a;
                    if (!c1109iE.f13907a0.f8476a.o() && abstractC0715Xa.o()) {
                        c1109iE.f13908b0 = -1;
                        c1109iE.f13909c0 = 0L;
                    }
                    if (!abstractC0715Xa.o()) {
                        List asList = Arrays.asList(((JE) abstractC0715Xa).f9921h);
                        AbstractC1668us.a0(asList.size() == c1109iE.f13924y.size());
                        for (int i11 = 0; i11 < asList.size(); i11++) {
                            ((C1064hE) c1109iE.f13924y.get(i11)).f13737b = (AbstractC0715Xa) asList.get(i11);
                        }
                    }
                    long j10 = -9223372036854775807L;
                    if (c1109iE.K) {
                        if (((EE) t22.f11619e).f8477b.equals(c1109iE.f13907a0.f8477b) && ((EE) t22.f11619e).f8479d == c1109iE.f13907a0.f8491r) {
                            z5 = false;
                        }
                        if (z5) {
                            if (abstractC0715Xa.o() || ((EE) t22.f11619e).f8477b.b()) {
                                j10 = ((EE) t22.f11619e).f8479d;
                            } else {
                                EE ee = (EE) t22.f11619e;
                                C1603tG c1603tG = ee.f8477b;
                                long j11 = ee.f8479d;
                                abstractC0715Xa.n(c1603tG.f15679a, c1109iE.f13923x);
                                j10 = j11;
                            }
                        }
                    } else {
                        z5 = false;
                    }
                    c1109iE.K = false;
                    c1109iE.C1((EE) t22.f11619e, 1, z5, c1109iE.J, j10, -1);
                    return;
                }
                return;
            case 15:
                b();
                return;
            case 16:
                Er er = ((C1602tF) ((Hq) this.f13790l).f9491l).f15666J0;
                Handler handler = (Handler) er.f8617l;
                if (handler != null) {
                    handler.post(new RunnableC0975fF(er, (C1020gF) this.f13791m, 4));
                    return;
                }
                return;
            case 17:
                ((InterfaceC1883zi) this.f13790l).mo11k(this.f13791m);
                return;
            default:
                HG hg = (HG) this.f13790l;
                C0 c02 = hg.f9394z;
                U u5 = (U) this.f13791m;
                hg.f9365H = c02 == null ? u5 : new J(-9223372036854775807L, 0L);
                hg.f9366I = u5.a();
                boolean z6 = false;
                if (!hg.f9371P && u5.a() == -9223372036854775807L) {
                    z6 = true;
                }
                hg.J = z6;
                hg.K = true == z6 ? 7 : 1;
                if (hg.f9361D) {
                    hg.f9384p.s(hg.f9366I, u5.g(), hg.J);
                    return;
                } else {
                    hg.t();
                    return;
                }
        }
    }
}
