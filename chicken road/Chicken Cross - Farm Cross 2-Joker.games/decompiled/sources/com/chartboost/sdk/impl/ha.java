package com.chartboost.sdk.impl;

import com.chartboost.sdk.impl.a3;
import com.chartboost.sdk.internal.Model.CBError;
import com.chartboost.sdk.tracking.TrackAd;
import com.chartboost.sdk.tracking.g;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class ha extends a3 implements i7 {
    public final /* synthetic */ i7 k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ha(String url, i7 eventTracker) {
        super(a3.c.b, url, ue.e, null);
        Intrinsics.checkNotNullParameter(url, "url");
        Intrinsics.checkNotNullParameter(eventTracker, "eventTracker");
        this.k = eventTracker;
    }

    @Override // com.chartboost.sdk.impl.a3
    public void a(CBError cBError, d3 d3Var) {
        String a2;
        mb.b("Impression tracking request failed", cBError != null ? cBError : new Exception("Null CBError"));
        if (d3Var == null || (a2 = b(d3Var)) == null) {
            a2 = cBError != null ? a(cBError) : "";
        }
        track((com.chartboost.sdk.tracking.f) new com.chartboost.sdk.tracking.b(g.e.c, a2, null, null, null, 28, null));
    }

    public final String b(d3 d3Var) {
        if (d3Var.c()) {
            return null;
        }
        return "Server error " + d3Var.b() + " for URL " + e();
    }

    @Override // com.chartboost.sdk.impl.h7
    public void clear(String type, String location) {
        Intrinsics.checkNotNullParameter(type, "type");
        Intrinsics.checkNotNullParameter(location, "location");
        this.k.clear(type, location);
    }

    @Override // com.chartboost.sdk.impl.i7
    public com.chartboost.sdk.tracking.f clearFromStorage(com.chartboost.sdk.tracking.f fVar) {
        Intrinsics.checkNotNullParameter(fVar, "<this>");
        return this.k.clearFromStorage(fVar);
    }

    @Override // com.chartboost.sdk.impl.i7
    public com.chartboost.sdk.tracking.f persist(com.chartboost.sdk.tracking.f fVar) {
        Intrinsics.checkNotNullParameter(fVar, "<this>");
        return this.k.persist(fVar);
    }

    @Override // com.chartboost.sdk.impl.i7
    public fi refresh(fi fiVar) {
        Intrinsics.checkNotNullParameter(fiVar, "<this>");
        return this.k.refresh(fiVar);
    }

    @Override // com.chartboost.sdk.impl.i7
    public TrackAd store(TrackAd trackAd) {
        Intrinsics.checkNotNullParameter(trackAd, "<this>");
        return this.k.store(trackAd);
    }

    @Override // com.chartboost.sdk.impl.i7
    public com.chartboost.sdk.tracking.f track(com.chartboost.sdk.tracking.f fVar) {
        Intrinsics.checkNotNullParameter(fVar, "<this>");
        return this.k.track(fVar);
    }

    @Override // com.chartboost.sdk.impl.h7
    /* renamed from: clearFromStorage */
    public void mo4755clearFromStorage(com.chartboost.sdk.tracking.f event) {
        Intrinsics.checkNotNullParameter(event, "event");
        this.k.mo4755clearFromStorage(event);
    }

    @Override // com.chartboost.sdk.impl.h7
    /* renamed from: persist */
    public void mo4756persist(com.chartboost.sdk.tracking.f event) {
        Intrinsics.checkNotNullParameter(event, "event");
        this.k.mo4756persist(event);
    }

    @Override // com.chartboost.sdk.impl.h7
    /* renamed from: refresh */
    public void mo4757refresh(fi config) {
        Intrinsics.checkNotNullParameter(config, "config");
        this.k.mo4757refresh(config);
    }

    @Override // com.chartboost.sdk.impl.h7
    /* renamed from: store */
    public void mo4758store(TrackAd ad) {
        Intrinsics.checkNotNullParameter(ad, "ad");
        this.k.mo4758store(ad);
    }

    @Override // com.chartboost.sdk.impl.h7
    /* renamed from: track */
    public void mo4759track(com.chartboost.sdk.tracking.f event) {
        Intrinsics.checkNotNullParameter(event, "event");
        this.k.mo4759track(event);
    }

    public final String a(CBError cBError) {
        return "Error " + cBError.getType() + ": " + cBError.getMessage() + " for URL " + e();
    }
}
