package com.google.android.gms.internal.ads;

import Q2.C0375o;
import android.content.Context;
import android.os.IInterface;
import android.os.SystemClock;
import android.util.Log;
import android.webkit.WebView;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* renamed from: com.google.android.gms.internal.ads.mm, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final /* synthetic */ class RunnableC1303mm implements Runnable {

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ int f14533k;

    /* renamed from: l, reason: collision with root package name */
    public Object f14534l;

    public /* synthetic */ RunnableC1303mm() {
        this.f14533k = 17;
    }

    private final void a() {
        BinderC1844yo binderC1844yo = (BinderC1844yo) this.f14534l;
        synchronized (binderC1844yo) {
            binderC1844yo.w3("Signal collection timeout.", 3);
        }
    }

    private final void b() {
        C0802bc c0802bc = (C0802bc) this.f14534l;
        if (((Vt) c0802bc.f12830t) != null) {
            ((C1091hx) c0802bc.f12825o).c("Unbind from service.", new Object[0]);
            Context context = (Context) c0802bc.f12821k;
            ServiceConnectionC1088hu serviceConnectionC1088hu = (ServiceConnectionC1088hu) c0802bc.f12829s;
            serviceConnectionC1088hu.getClass();
            context.unbindService(serviceConnectionC1088hu);
            c0802bc.f12823m = false;
            c0802bc.f12830t = null;
            c0802bc.f12829s = null;
            synchronized (((ArrayList) c0802bc.f12826p)) {
                ((ArrayList) c0802bc.f12826p).clear();
            }
        }
    }

    private final void c() {
        HF hf = (HF) this.f14534l;
        synchronized (hf.f9343a) {
            try {
                if (hf.f9353m) {
                    return;
                }
                long j5 = hf.f9352l - 1;
                hf.f9352l = j5;
                if (j5 > 0) {
                    return;
                }
                if (j5 >= 0) {
                    hf.a();
                    return;
                }
                IllegalStateException illegalStateException = new IllegalStateException();
                synchronized (hf.f9343a) {
                    hf.f9354n = illegalStateException;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // java.lang.Runnable
    public final void run() {
        E3.a aVar;
        switch (this.f14533k) {
            case 0:
                ((C1348nm) this.f14534l).a();
                return;
            case 1:
                ((C1348nm) this.f14534l).a();
                return;
            case 2:
                E3.a E5 = ((C0375o) ((Mt) this.f14534l).f10741l).E();
                if (!((Boolean) Q2.r.f5053d.f5056c.a(F7.q7)).booleanValue()) {
                    AbstractC1803xs.k(E5, "persistFlags");
                    return;
                } else {
                    E5.a(new Kw(0, E5, new C1091hx("persistFlags", 4)), AbstractC0613Id.f9544g);
                    return;
                }
            case 3:
                C0769ao c0769ao = (C0769ao) this.f14534l;
                synchronized (c0769ao) {
                    c0769ao.f12712a.getClass();
                    c0769ao.f12718h = SystemClock.elapsedRealtime() - c0769ao.i;
                }
                return;
            case 4:
                a();
                return;
            case 5:
                boolean booleanValue = ((Boolean) Q2.r.f5053d.f5056c.a(F7.Y9)).booleanValue();
                Throwable th = (Throwable) this.f14534l;
                if (booleanValue) {
                    P2.o.f4767B.f4774g.j("TopicsSignalUnsampled.fetchTopicsSignal", th);
                    return;
                } else {
                    P2.o.f4767B.f4774g.h("TopicsSignal.fetchTopicsSignal", th);
                    return;
                }
            case 6:
                C0949eq c0949eq = (C0949eq) this.f14534l;
                c0949eq.getClass();
                c0949eq.f13358d.l0(AbstractC1803xs.I(6, null, null));
                return;
            case 7:
                ((Eo) this.f14534l).j0();
                return;
            case 8:
                C1128iq c1128iq = (C1128iq) this.f14534l;
                c1128iq.getClass();
                c1128iq.f13999d.l0(AbstractC1803xs.I(6, null, null));
                return;
            case 9:
                C1846yq c1846yq = (C1846yq) this.f14534l;
                c1846yq.getClass();
                c1846yq.f16486d.l0(AbstractC1803xs.I(6, null, null));
                return;
            case 10:
                Fq fq = (Fq) this.f14534l;
                fq.getClass();
                fq.f9130d.l0(AbstractC1803xs.I(6, null, null));
                return;
            case 11:
                ((Bq) this.f14534l).j0();
                return;
            case 12:
                ((WebView) this.f14534l).destroy();
                return;
            case 13:
                Er er = ((Ws) this.f14534l).f12121e;
                er.getClass();
                Ys ys = new Ys(er);
                C0905dr c0905dr = (C0905dr) er.f8618m;
                ys.f12250a = c0905dr;
                ArrayDeque arrayDeque = (ArrayDeque) c0905dr.f13187m;
                arrayDeque.add(ys);
                if (((Xs) c0905dr.f13188n) == null) {
                    Xs xs = (Xs) arrayDeque.poll();
                    c0905dr.f13188n = xs;
                    if (xs != null) {
                        xs.executeOnExecutor((ThreadPoolExecutor) c0905dr.f13186l, new Object[0]);
                        return;
                    }
                    return;
                }
                return;
            case 14:
                Ft ft = new Ft();
                Log.d("GASS", "Clearcut logging disabled");
                ((D3.f) this.f14534l).f946a.f(new Ct(ft));
                return;
            case 15:
                b();
                return;
            case 16:
                C0802bc c0802bc = ((ServiceConnectionC1088hu) this.f14534l).f13813a;
                ((C1091hx) c0802bc.f12825o).c("unlinkToDeath", new Object[0]);
                IInterface iInterface = (Vt) c0802bc.f12830t;
                iInterface.getClass();
                ((D5) iInterface).f8165l.unlinkToDeath((C0998fu) c0802bc.f12827q, 0);
                c0802bc.f12830t = null;
                c0802bc.f12823m = false;
                return;
            case 17:
                Zw zw = (Zw) this.f14534l;
                if (zw == null || (aVar = zw.f12543r) == null) {
                    return;
                }
                this.f14534l = null;
                if (aVar.isDone()) {
                    zw.l(aVar);
                    return;
                }
                try {
                    ScheduledFuture scheduledFuture = zw.f12544s;
                    zw.f12544s = null;
                    String str = "Timed out";
                    if (scheduledFuture != null) {
                        try {
                            long abs = Math.abs(scheduledFuture.getDelay(TimeUnit.MILLISECONDS));
                            if (abs > 10) {
                                str = "Timed out (timeout delayed by " + abs + " ms after scheduled time)";
                            }
                        } catch (Throwable th2) {
                            zw.g(new Yw(str));
                            throw th2;
                        }
                    }
                    zw.g(new Yw(str + ": " + aVar.toString()));
                    return;
                } finally {
                    aVar.cancel(true);
                }
            case 18:
                try {
                    C1332nE.J((HE) this.f14534l);
                    return;
                } catch (XD e3) {
                    JB.g("ExoPlayerImplInternal", "Unexpected error delivering message on external thread.", e3);
                    throw new RuntimeException(e3);
                }
            case 19:
                SE se = (SE) this.f14534l;
                se.i(se.g(), 1028, new QE(1));
                se.f.d();
                return;
            case 20:
                C1557sF c1557sF = (C1557sF) this.f14534l;
                if (c1557sF.f15451V >= 300000) {
                    ((C1602tF) c1557sF.f15464l.f9491l).f15677U0 = true;
                    c1557sF.f15451V = 0L;
                    return;
                }
                return;
            case C1639u7.zzm /* 21 */:
                c();
                return;
            default:
                C0959f c0959f = (C0959f) this.f14534l;
                c0959f.f13402l--;
                return;
        }
    }

    public /* synthetic */ RunnableC1303mm(int i, Object obj) {
        this.f14533k = i;
        this.f14534l = obj;
    }

    public RunnableC1303mm(Ts ts) {
        this.f14533k = 12;
        this.f14534l = ts.f11695e;
    }
}
