package com.chartboost.sdk.impl;

import com.chartboost.sdk.privacy.model.CCPA;
import com.chartboost.sdk.privacy.model.COPPA;
import com.chartboost.sdk.privacy.model.Custom;
import com.chartboost.sdk.privacy.model.DataUseConsent;
import com.chartboost.sdk.privacy.model.GDPR;
import com.chartboost.sdk.privacy.model.LGPD;
import com.chartboost.sdk.tracking.TrackAd;
import com.chartboost.sdk.tracking.g;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class gf implements ff, i7 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ i7 f4780a;
    public final af b;

    public gf(af repository, i7 eventTracker) {
        Intrinsics.checkNotNullParameter(repository, "repository");
        Intrinsics.checkNotNullParameter(eventTracker, "eventTracker");
        this.f4780a = eventTracker;
        this.b = repository;
    }

    @Override // com.chartboost.sdk.impl.ff
    public void a(DataUseConsent dataUseConsent) {
        String privacyStandardName;
        if (dataUseConsent == null || (privacyStandardName = dataUseConsent.getPrivacyStandardName()) == null || privacyStandardName.length() == 0) {
            try {
                track((com.chartboost.sdk.tracking.f) new com.chartboost.sdk.tracking.a(g.d.g, "", "", "", null, null, 48, null));
            } catch (Exception unused) {
            }
            mb.b("addDataUseConsent failed", (Throwable) null, 2, (Object) null);
            return;
        }
        if ((dataUseConsent instanceof GDPR) || (dataUseConsent instanceof CCPA) || (dataUseConsent instanceof COPPA) || (dataUseConsent instanceof LGPD) || (dataUseConsent instanceof Custom)) {
            this.b.b(dataUseConsent);
            return;
        }
        try {
            g.d dVar = g.d.c;
            String name = dataUseConsent.getClass().getName();
            Intrinsics.checkNotNullExpressionValue(name, "getName(...)");
            track((com.chartboost.sdk.tracking.f) new com.chartboost.sdk.tracking.b(dVar, name, "", "", null, 16, null));
        } catch (Exception unused2) {
        }
        mb.e("Attempt to addDataUseConsent. Context and DataUseConsent cannot be null.", null, 2, null);
    }

    @Override // com.chartboost.sdk.impl.h7
    public void clear(String type, String location) {
        Intrinsics.checkNotNullParameter(type, "type");
        Intrinsics.checkNotNullParameter(location, "location");
        this.f4780a.clear(type, location);
    }

    @Override // com.chartboost.sdk.impl.i7
    public com.chartboost.sdk.tracking.f clearFromStorage(com.chartboost.sdk.tracking.f fVar) {
        Intrinsics.checkNotNullParameter(fVar, "<this>");
        return this.f4780a.clearFromStorage(fVar);
    }

    @Override // com.chartboost.sdk.impl.i7
    public com.chartboost.sdk.tracking.f persist(com.chartboost.sdk.tracking.f fVar) {
        Intrinsics.checkNotNullParameter(fVar, "<this>");
        return this.f4780a.persist(fVar);
    }

    @Override // com.chartboost.sdk.impl.i7
    public fi refresh(fi fiVar) {
        Intrinsics.checkNotNullParameter(fiVar, "<this>");
        return this.f4780a.refresh(fiVar);
    }

    @Override // com.chartboost.sdk.impl.i7
    public TrackAd store(TrackAd trackAd) {
        Intrinsics.checkNotNullParameter(trackAd, "<this>");
        return this.f4780a.store(trackAd);
    }

    @Override // com.chartboost.sdk.impl.i7
    public com.chartboost.sdk.tracking.f track(com.chartboost.sdk.tracking.f fVar) {
        Intrinsics.checkNotNullParameter(fVar, "<this>");
        return this.f4780a.track(fVar);
    }

    @Override // com.chartboost.sdk.impl.h7
    /* renamed from: clearFromStorage */
    public void mo4755clearFromStorage(com.chartboost.sdk.tracking.f event) {
        Intrinsics.checkNotNullParameter(event, "event");
        this.f4780a.mo4755clearFromStorage(event);
    }

    @Override // com.chartboost.sdk.impl.h7
    /* renamed from: persist */
    public void mo4756persist(com.chartboost.sdk.tracking.f event) {
        Intrinsics.checkNotNullParameter(event, "event");
        this.f4780a.mo4756persist(event);
    }

    @Override // com.chartboost.sdk.impl.h7
    /* renamed from: refresh */
    public void mo4757refresh(fi config) {
        Intrinsics.checkNotNullParameter(config, "config");
        this.f4780a.mo4757refresh(config);
    }

    @Override // com.chartboost.sdk.impl.h7
    /* renamed from: store */
    public void mo4758store(TrackAd ad) {
        Intrinsics.checkNotNullParameter(ad, "ad");
        this.f4780a.mo4758store(ad);
    }

    @Override // com.chartboost.sdk.impl.h7
    /* renamed from: track */
    public void mo4759track(com.chartboost.sdk.tracking.f event) {
        Intrinsics.checkNotNullParameter(event, "event");
        this.f4780a.mo4759track(event);
    }
}
