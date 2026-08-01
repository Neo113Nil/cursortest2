package com.chartboost.sdk.impl;

import com.chartboost.sdk.Mediation;
import com.chartboost.sdk.tracking.TrackAd;
import com.chartboost.sdk.tracking.g;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class p4 implements o4, i7 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ i7 f4953a;
    public final String b;
    public final String c;
    public final Mediation d;

    public p4(String adType, String location, Mediation mediation, i7 eventTracker) {
        Intrinsics.checkNotNullParameter(adType, "adType");
        Intrinsics.checkNotNullParameter(location, "location");
        Intrinsics.checkNotNullParameter(eventTracker, "eventTracker");
        this.f4953a = eventTracker;
        this.b = adType;
        this.c = location;
        this.d = mediation;
    }

    @Override // com.chartboost.sdk.impl.o4
    public void a(String message) {
        Intrinsics.checkNotNullParameter(message, "message");
        track((com.chartboost.sdk.tracking.f) new com.chartboost.sdk.tracking.e(g.EnumC0233g.c, message, this.b, this.c, this.d, null, 32, null));
    }

    @Override // com.chartboost.sdk.impl.o4
    public void b(String message) {
        Intrinsics.checkNotNullParameter(message, "message");
        track((com.chartboost.sdk.tracking.f) new com.chartboost.sdk.tracking.b(g.EnumC0233g.d, message, this.b, this.c, this.d));
    }

    @Override // com.chartboost.sdk.impl.h7
    public void clear(String type, String location) {
        Intrinsics.checkNotNullParameter(type, "type");
        Intrinsics.checkNotNullParameter(location, "location");
        this.f4953a.clear(type, location);
    }

    @Override // com.chartboost.sdk.impl.i7
    public com.chartboost.sdk.tracking.f clearFromStorage(com.chartboost.sdk.tracking.f fVar) {
        Intrinsics.checkNotNullParameter(fVar, "<this>");
        return this.f4953a.clearFromStorage(fVar);
    }

    @Override // com.chartboost.sdk.impl.i7
    public com.chartboost.sdk.tracking.f persist(com.chartboost.sdk.tracking.f fVar) {
        Intrinsics.checkNotNullParameter(fVar, "<this>");
        return this.f4953a.persist(fVar);
    }

    @Override // com.chartboost.sdk.impl.i7
    public fi refresh(fi fiVar) {
        Intrinsics.checkNotNullParameter(fiVar, "<this>");
        return this.f4953a.refresh(fiVar);
    }

    @Override // com.chartboost.sdk.impl.i7
    public TrackAd store(TrackAd trackAd) {
        Intrinsics.checkNotNullParameter(trackAd, "<this>");
        return this.f4953a.store(trackAd);
    }

    @Override // com.chartboost.sdk.impl.i7
    public com.chartboost.sdk.tracking.f track(com.chartboost.sdk.tracking.f fVar) {
        Intrinsics.checkNotNullParameter(fVar, "<this>");
        return this.f4953a.track(fVar);
    }

    @Override // com.chartboost.sdk.impl.h7
    /* renamed from: clearFromStorage */
    public void mo4755clearFromStorage(com.chartboost.sdk.tracking.f event) {
        Intrinsics.checkNotNullParameter(event, "event");
        this.f4953a.mo4755clearFromStorage(event);
    }

    @Override // com.chartboost.sdk.impl.h7
    /* renamed from: persist */
    public void mo4756persist(com.chartboost.sdk.tracking.f event) {
        Intrinsics.checkNotNullParameter(event, "event");
        this.f4953a.mo4756persist(event);
    }

    @Override // com.chartboost.sdk.impl.h7
    /* renamed from: refresh */
    public void mo4757refresh(fi config) {
        Intrinsics.checkNotNullParameter(config, "config");
        this.f4953a.mo4757refresh(config);
    }

    @Override // com.chartboost.sdk.impl.h7
    /* renamed from: store */
    public void mo4758store(TrackAd ad) {
        Intrinsics.checkNotNullParameter(ad, "ad");
        this.f4953a.mo4758store(ad);
    }

    @Override // com.chartboost.sdk.impl.h7
    /* renamed from: track */
    public void mo4759track(com.chartboost.sdk.tracking.f event) {
        Intrinsics.checkNotNullParameter(event, "event");
        this.f4953a.mo4759track(event);
    }
}
