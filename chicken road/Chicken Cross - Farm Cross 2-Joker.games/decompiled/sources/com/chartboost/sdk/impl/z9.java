package com.chartboost.sdk.impl;

import com.chartboost.sdk.tracking.TrackAd;
import com.chartboost.sdk.tracking.g;
import com.iab.omid.library.chartboost.adsession.media.PlayerState;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class z9 implements aa, i7 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ i7 f5099a;
    public final d0 b;
    public final String c;
    public final c0 d;
    public final r0 e;
    public final ea f;
    public final p1 g;
    public final v6 h;
    public final zd i;
    public boolean j;

    public /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f5100a;

        static {
            int[] iArr = new int[ga.values().length];
            try {
                iArr[ga.e.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[ga.d.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            f5100a = iArr;
        }
    }

    public z9(d0 adUnit, String location, c0 adType, r0 adUnitRendererImpressionCallback, ea impressionIntermediateCallback, p1 appRequest, v6 downloader, zd openMeasurementImpressionCallback, i7 eventTracker) {
        Intrinsics.checkNotNullParameter(adUnit, "adUnit");
        Intrinsics.checkNotNullParameter(location, "location");
        Intrinsics.checkNotNullParameter(adType, "adType");
        Intrinsics.checkNotNullParameter(adUnitRendererImpressionCallback, "adUnitRendererImpressionCallback");
        Intrinsics.checkNotNullParameter(impressionIntermediateCallback, "impressionIntermediateCallback");
        Intrinsics.checkNotNullParameter(appRequest, "appRequest");
        Intrinsics.checkNotNullParameter(downloader, "downloader");
        Intrinsics.checkNotNullParameter(openMeasurementImpressionCallback, "openMeasurementImpressionCallback");
        Intrinsics.checkNotNullParameter(eventTracker, "eventTracker");
        this.f5099a = eventTracker;
        this.b = adUnit;
        this.c = location;
        this.d = adType;
        this.e = adUnitRendererImpressionCallback;
        this.f = impressionIntermediateCallback;
        this.g = appRequest;
        this.h = downloader;
        this.i = openMeasurementImpressionCallback;
        this.j = true;
    }

    @Override // com.chartboost.sdk.impl.aa
    public void a(ga state) {
        Intrinsics.checkNotNullParameter(state, "state");
        this.j = true;
        this.i.a(PlayerState.NORMAL);
        int i = a.f5100a[state.ordinal()];
        if (i == 1) {
            a();
        } else if (i == 2) {
            c();
            track((com.chartboost.sdk.tracking.f) new com.chartboost.sdk.tracking.a(g.i.n, "onClose with state Loaded", this.d.b(), this.c, null, null, 48, null));
        }
        this.e.a(this.g);
    }

    @Override // com.chartboost.sdk.impl.aa
    public void b() {
        this.e.a(this.b.m());
    }

    public final void c() {
        mb.b("Removing impression", (Throwable) null, 2, (Object) null);
        this.f.a(ga.h);
        this.f.w();
        this.h.c();
    }

    @Override // com.chartboost.sdk.impl.h7
    public void clear(String type, String location) {
        Intrinsics.checkNotNullParameter(type, "type");
        Intrinsics.checkNotNullParameter(location, "location");
        this.f5099a.clear(type, location);
    }

    @Override // com.chartboost.sdk.impl.i7
    public com.chartboost.sdk.tracking.f clearFromStorage(com.chartboost.sdk.tracking.f fVar) {
        Intrinsics.checkNotNullParameter(fVar, "<this>");
        return this.f5099a.clearFromStorage(fVar);
    }

    @Override // com.chartboost.sdk.impl.aa
    public void d(boolean z) {
        this.j = z;
    }

    @Override // com.chartboost.sdk.impl.i7
    public com.chartboost.sdk.tracking.f persist(com.chartboost.sdk.tracking.f fVar) {
        Intrinsics.checkNotNullParameter(fVar, "<this>");
        return this.f5099a.persist(fVar);
    }

    @Override // com.chartboost.sdk.impl.i7
    public fi refresh(fi fiVar) {
        Intrinsics.checkNotNullParameter(fiVar, "<this>");
        return this.f5099a.refresh(fiVar);
    }

    @Override // com.chartboost.sdk.impl.i7
    public TrackAd store(TrackAd trackAd) {
        Intrinsics.checkNotNullParameter(trackAd, "<this>");
        return this.f5099a.store(trackAd);
    }

    @Override // com.chartboost.sdk.impl.i7
    public com.chartboost.sdk.tracking.f track(com.chartboost.sdk.tracking.f fVar) {
        Intrinsics.checkNotNullParameter(fVar, "<this>");
        return this.f5099a.track(fVar);
    }

    @Override // com.chartboost.sdk.impl.h7
    /* renamed from: clearFromStorage */
    public void mo4755clearFromStorage(com.chartboost.sdk.tracking.f event) {
        Intrinsics.checkNotNullParameter(event, "event");
        this.f5099a.mo4755clearFromStorage(event);
    }

    @Override // com.chartboost.sdk.impl.h7
    /* renamed from: persist */
    public void mo4756persist(com.chartboost.sdk.tracking.f event) {
        Intrinsics.checkNotNullParameter(event, "event");
        this.f5099a.mo4756persist(event);
    }

    @Override // com.chartboost.sdk.impl.h7
    /* renamed from: refresh */
    public void mo4757refresh(fi config) {
        Intrinsics.checkNotNullParameter(config, "config");
        this.f5099a.mo4757refresh(config);
    }

    @Override // com.chartboost.sdk.impl.h7
    /* renamed from: store */
    public void mo4758store(TrackAd ad) {
        Intrinsics.checkNotNullParameter(ad, "ad");
        this.f5099a.mo4758store(ad);
    }

    @Override // com.chartboost.sdk.impl.h7
    /* renamed from: track */
    public void mo4759track(com.chartboost.sdk.tracking.f event) {
        Intrinsics.checkNotNullParameter(event, "event");
        this.f5099a.mo4759track(event);
    }

    public final void a() {
        mb.b("Dismissing impression", (Throwable) null, 2, (Object) null);
        this.f.a(ga.g);
        c();
    }
}
