package com.chartboost.sdk.tracking;

import com.chartboost.sdk.impl.ag;
import com.chartboost.sdk.impl.c7;
import com.chartboost.sdk.impl.cg;
import com.chartboost.sdk.impl.d7;
import com.chartboost.sdk.impl.fi;
import com.chartboost.sdk.impl.h7;
import com.chartboost.sdk.impl.i7;
import com.chartboost.sdk.impl.ji;
import com.chartboost.sdk.impl.li;
import com.chartboost.sdk.impl.mb;
import com.chartboost.sdk.impl.ve;
import com.chartboost.sdk.tracking.f;
import com.chartboost.sdk.tracking.g;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class d implements i7, h7 {

    /* renamed from: a, reason: collision with root package name */
    public Lazy f5136a;
    public Lazy b;
    public Lazy c;
    public Lazy d;
    public Lazy e;
    public Lazy f;
    public final Map g;
    public final Map h;
    public final List i;

    public d(Lazy config, Lazy throttler, Lazy requestBodyBuilder, Lazy privacyApi, Lazy trackingRequest, Lazy trackingEventCache) {
        Intrinsics.checkNotNullParameter(config, "config");
        Intrinsics.checkNotNullParameter(throttler, "throttler");
        Intrinsics.checkNotNullParameter(requestBodyBuilder, "requestBodyBuilder");
        Intrinsics.checkNotNullParameter(privacyApi, "privacyApi");
        Intrinsics.checkNotNullParameter(trackingRequest, "trackingRequest");
        Intrinsics.checkNotNullParameter(trackingEventCache, "trackingEventCache");
        this.f5136a = config;
        this.b = throttler;
        this.c = requestBodyBuilder;
        this.d = privacyApi;
        this.e = trackingRequest;
        this.f = trackingEventCache;
        this.g = new LinkedHashMap();
        this.h = new LinkedHashMap();
        this.i = new ArrayList();
    }

    public final String a(TrackAd trackAd) {
        return trackAd.e() + trackAd.d();
    }

    public final void b(f fVar) {
        try {
            if (fVar == null) {
                mb.a("Cannot save empty event", (Throwable) null, 2, (Object) null);
            } else if (((fi) this.f5136a.getValue()).e()) {
                c(fVar);
            } else {
                d(fVar);
            }
        } catch (Exception e) {
            mb.a("Cannot send tracking event", e);
        }
    }

    public final void c(f fVar) {
        ((ji) this.f.getValue()).a(fVar, a(), ((fi) this.f5136a.getValue()).f());
        if (fVar.g() == f.a.c) {
            a(((ji) this.f.getValue()).a());
        }
    }

    @Override // com.chartboost.sdk.impl.h7
    public void clear(String type, String location) {
        Intrinsics.checkNotNullParameter(type, "type");
        Intrinsics.checkNotNullParameter(location, "location");
        this.h.remove(a(location, type));
    }

    @Override // com.chartboost.sdk.impl.h7
    /* renamed from: clearFromStorage */
    public void mo4755clearFromStorage(f event) {
        Intrinsics.checkNotNullParameter(event, "event");
        ((ji) this.f.getValue()).a(event);
    }

    public final void d(f fVar) {
        this.i.add(fVar);
        if (fVar.g() == f.a.c) {
            a(((ji) this.f.getValue()).a(this.i, a()));
        }
    }

    public final String e(f fVar) {
        return a(fVar.c(), fVar.a());
    }

    public final boolean f(f fVar) {
        g f = fVar.f();
        return f == g.a.d || f == g.i.c;
    }

    public final void g(f fVar) {
        fVar.a((TrackAd) this.g.get(e(fVar)));
        fVar.a(a(fVar));
        b(fVar);
        mb.a("Event: " + fVar, (Throwable) null, 2, (Object) null);
        h(fVar);
    }

    public final void h(f fVar) {
        if (f(fVar)) {
            this.h.put(e(fVar), fVar);
        }
    }

    @Override // com.chartboost.sdk.impl.h7
    /* renamed from: persist */
    public void mo4756persist(f event) {
        Intrinsics.checkNotNullParameter(event, "event");
        event.a((TrackAd) this.g.get(e(event)));
        event.a(a(event));
        mb.a("Persist event: " + event, (Throwable) null, 2, (Object) null);
        ((ji) this.f.getValue()).a(event, a());
    }

    @Override // com.chartboost.sdk.impl.h7
    /* renamed from: refresh */
    public void mo4757refresh(fi config) {
        Intrinsics.checkNotNullParameter(config, "config");
        this.f5136a = LazyKt.lazyOf(config);
    }

    @Override // com.chartboost.sdk.impl.h7
    /* renamed from: store */
    public void mo4758store(TrackAd ad) {
        Intrinsics.checkNotNullParameter(ad, "ad");
        this.g.put(a(ad), ad);
    }

    @Override // com.chartboost.sdk.impl.h7
    /* renamed from: track */
    public void mo4759track(f event) {
        Intrinsics.checkNotNullParameter(event, "event");
        fi fiVar = (fi) this.f5136a.getValue();
        if (!fiVar.h()) {
            mb.a("Tracking is disabled", (Throwable) null, 2, (Object) null);
            return;
        }
        if (fiVar.a().contains(event.f())) {
            mb.a("Event name " + event.f() + " is black-listed", (Throwable) null, 2, (Object) null);
            return;
        }
        f e = ((c) this.b.getValue()).e(event);
        if (e != null) {
            g(e);
        } else {
            mb.a("Event is throttled " + event, (Throwable) null, 2, (Object) null);
        }
    }

    public final d7 a() {
        try {
            cg build = ((ag) this.c.getValue()).build();
            return c7.f4705a.a(build.c(), build.h(), build.g().c(), (ve) this.d.getValue(), build.h);
        } catch (Exception e) {
            mb.a("Cannot create environment data for tracking", e);
            return new d7(null, 0, null, null, null, false, null, null, null, null, null, null, null, null, null, null, null, null, null, null, 0, false, 0, false, 0, 0L, 0L, 0, 0, 0, 0L, 0L, -1, null);
        }
    }

    @Override // com.chartboost.sdk.impl.i7
    public f clearFromStorage(f fVar) {
        Intrinsics.checkNotNullParameter(fVar, "<this>");
        mo4755clearFromStorage(fVar);
        return fVar;
    }

    @Override // com.chartboost.sdk.impl.i7
    public fi refresh(fi fiVar) {
        Intrinsics.checkNotNullParameter(fiVar, "<this>");
        mo4757refresh(fiVar);
        return fiVar;
    }

    @Override // com.chartboost.sdk.impl.i7
    public TrackAd store(TrackAd trackAd) {
        Intrinsics.checkNotNullParameter(trackAd, "<this>");
        mo4758store(trackAd);
        return trackAd;
    }

    @Override // com.chartboost.sdk.impl.i7
    public f persist(f fVar) {
        Intrinsics.checkNotNullParameter(fVar, "<this>");
        mo4756persist(fVar);
        return fVar;
    }

    @Override // com.chartboost.sdk.impl.i7
    public f track(f fVar) {
        Intrinsics.checkNotNullParameter(fVar, "<this>");
        mo4759track(fVar);
        return fVar;
    }

    public final String a(String str, String str2) {
        return str + str2;
    }

    public final float a(f fVar) {
        if (!fVar.h()) {
            return fVar.b();
        }
        if (!fVar.m()) {
            return 0.0f;
        }
        try {
            if (((f) this.h.remove(e(fVar))) != null) {
                return (fVar.i() - r1.i()) / 1000.0f;
            }
            return -1.0f;
        } catch (Exception e) {
            mb.a("Cannot calculate latency", e);
            return -1.0f;
        }
    }

    public final void a(List list) {
        ((li) this.e.getValue()).a(((fi) this.f5136a.getValue()).b(), list);
    }
}
