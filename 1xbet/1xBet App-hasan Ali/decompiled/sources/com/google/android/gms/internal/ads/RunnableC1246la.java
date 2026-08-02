package com.google.android.gms.internal.ads;

import java.util.ArrayList;
import java.util.concurrent.TimeoutException;
import java.util.concurrent.atomic.AtomicInteger;

/* renamed from: com.google.android.gms.internal.ads.la, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final /* synthetic */ class RunnableC1246la implements Runnable {

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ int f14381k;

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ C1515ra f14382l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ C1068ha f14383m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ ArrayList f14384n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ long f14385o;

    /* renamed from: p, reason: collision with root package name */
    public final /* synthetic */ C4.m f14386p;

    public /* synthetic */ RunnableC1246la(C4.m mVar, C1515ra c1515ra, C1068ha c1068ha, ArrayList arrayList, long j5, int i) {
        this.f14381k = i;
        this.f14386p = mVar;
        this.f14382l = c1515ra;
        this.f14383m = c1068ha;
        this.f14384n = arrayList;
        this.f14385o = j5;
    }

    private final void a() {
        C4.m mVar = this.f14386p;
        C1515ra c1515ra = this.f14382l;
        C1068ha c1068ha = this.f14383m;
        ArrayList arrayList = this.f14384n;
        long j5 = this.f14385o;
        mVar.getClass();
        T2.G.m("loadJavascriptEngine > newEngine.setLoadedListener(postDelayed): Trying to acquire lock");
        synchronized (mVar.f) {
            try {
                T2.G.m("loadJavascriptEngine > newEngine.setLoadedListener(postDelayed): Lock acquired");
                if (((AtomicInteger) c1515ra.f475b).get() != -1 && ((AtomicInteger) c1515ra.f475b).get() != 1) {
                    A7 a7 = F7.p7;
                    Q2.r rVar = Q2.r.f5053d;
                    if (((Boolean) rVar.f5056c.a(a7)).booleanValue()) {
                        c1515ra.o("SdkJavascriptFactory.loadJavascriptEngine.setLoadedListener", new TimeoutException("Unable to receive /jsLoaded GMSG."));
                    } else {
                        c1515ra.n();
                    }
                    AbstractC0613Id.f.execute(new RunnableC1156ja(c1068ha, 0));
                    String valueOf = String.valueOf(rVar.f5056c.a(F7.f8802b));
                    int i = ((AtomicInteger) c1515ra.f475b).get();
                    int i5 = mVar.f908a;
                    String valueOf2 = String.valueOf(arrayList.get(0));
                    P2.o.f4767B.f4776j.getClass();
                    T2.G.m("Could not receive /jsLoaded in " + valueOf + " ms. JS engine session reference status(onEngLoadedTimeout) is " + i + ". Update status(onEngLoadedTimeout) is " + i5 + ". LoadNewJavascriptEngine(onEngLoadedTimeout) latency is " + valueOf2 + " ms. Total latency(onEngLoadedTimeout) is " + (System.currentTimeMillis() - j5) + " ms. Rejecting.");
                    T2.G.m("loadJavascriptEngine > newEngine.setLoadedListener(postDelayed): Lock released");
                    return;
                }
                T2.G.m("loadJavascriptEngine > newEngine.setLoadedListener(postDelayed): Lock released, the promise is already settled");
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f14381k) {
            case 0:
                a();
                return;
            default:
                T2.G.m("loadJavascriptEngine > ADMOB_UI_HANDLER.postDelayed: Trying to acquire lock");
                synchronized (this.f14386p.f) {
                    try {
                        T2.G.m("loadJavascriptEngine > ADMOB_UI_HANDLER.postDelayed: Lock acquired");
                        if (((AtomicInteger) this.f14382l.f475b).get() != -1 && ((AtomicInteger) this.f14382l.f475b).get() != 1) {
                            A7 a7 = F7.p7;
                            Q2.r rVar = Q2.r.f5053d;
                            if (((Boolean) rVar.f5056c.a(a7)).booleanValue()) {
                                this.f14382l.o("SdkJavascriptFactory.loadJavascriptEngine.Runnable", new TimeoutException("Unable to fully load JS engine."));
                            } else {
                                this.f14382l.n();
                            }
                            AbstractC0613Id.f.execute(new RunnableC1156ja(this.f14383m, 1));
                            String valueOf = String.valueOf(rVar.f5056c.a(F7.f8807c));
                            int i = ((AtomicInteger) this.f14382l.f475b).get();
                            int i5 = this.f14386p.f908a;
                            String concat = this.f14384n.isEmpty() ? ". Still waiting for the engine to be loaded" : ". While waiting for the /jsLoaded gmsg, observed the loadNewJavascriptEngine latency is ".concat(String.valueOf(this.f14384n.get(0)));
                            P2.o.f4767B.f4776j.getClass();
                            T2.G.m("Could not finish the full JS engine loading in " + valueOf + " ms. JS engine session reference status(fullLoadTimeout) is " + i + ". Update status(fullLoadTimeout) is " + i5 + concat + " ms. Total latency(fullLoadTimeout) is " + (System.currentTimeMillis() - this.f14385o) + " ms at timeout. Rejecting.");
                            T2.G.m("loadJavascriptEngine > ADMOB_UI_HANDLER.postDelayed: Lock released");
                            return;
                        }
                        T2.G.m("loadJavascriptEngine > ADMOB_UI_HANDLER.postDelayed: Lock released, the promise is already settled");
                        return;
                    } catch (Throwable th) {
                        throw th;
                    }
                }
        }
    }
}
