package com.google.android.gms.internal.ads;

import java.util.Map;
import java.util.concurrent.atomic.AtomicInteger;

/* renamed from: com.google.android.gms.internal.ads.na, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1336na implements InterfaceC1821y9 {

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ long f14653k;

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ C1515ra f14654l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ C1068ha f14655m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ C4.m f14656n;

    public C1336na(C4.m mVar, long j5, C1515ra c1515ra, C1068ha c1068ha) {
        this.f14653k = j5;
        this.f14654l = c1515ra;
        this.f14655m = c1068ha;
        this.f14656n = mVar;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1821y9
    public final void b(Object obj, Map map) {
        P2.o.f4767B.f4776j.getClass();
        T2.G.m("onGmsg /jsLoaded. JsLoaded latency is " + (System.currentTimeMillis() - this.f14653k) + " ms.");
        T2.G.m("loadJavascriptEngine > /jsLoaded handler: Trying to acquire lock");
        synchronized (this.f14656n.f) {
            T2.G.m("loadJavascriptEngine > /jsLoaded handler: Lock acquired");
            if (((AtomicInteger) this.f14654l.f475b).get() != -1 && ((AtomicInteger) this.f14654l.f475b).get() != 1) {
                this.f14656n.f908a = 0;
                C1068ha c1068ha = this.f14655m;
                c1068ha.b("/log", AbstractC1776x9.f16247g);
                c1068ha.b("/result", AbstractC1776x9.f16254o);
                ((C0634Ld) this.f14654l.f474a).b(this.f14655m);
                this.f14656n.f913g = this.f14654l;
                T2.G.m("Successfully loaded JS Engine.");
                T2.G.m("loadJavascriptEngine > /jsLoaded handler: Lock released");
                return;
            }
            T2.G.m("loadJavascriptEngine > /jsLoaded handler: Lock released, the promise is already settled");
        }
    }
}
