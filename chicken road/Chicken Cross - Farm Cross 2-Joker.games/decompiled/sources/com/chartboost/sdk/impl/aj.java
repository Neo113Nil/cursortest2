package com.chartboost.sdk.impl;

import android.content.Context;
import android.webkit.WebSettings;
import com.chartboost.sdk.tracking.TrackAd;
import com.chartboost.sdk.tracking.g;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class aj implements i7 {
    public static final aj b = new aj();
    public static String c = "Invalid user-agent value";

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ i7 f4681a = yh.a();

    public final String a() {
        return c;
    }

    @Override // com.chartboost.sdk.impl.h7
    public void clear(String type, String location) {
        Intrinsics.checkNotNullParameter(type, "type");
        Intrinsics.checkNotNullParameter(location, "location");
        this.f4681a.clear(type, location);
    }

    @Override // com.chartboost.sdk.impl.i7
    public com.chartboost.sdk.tracking.f clearFromStorage(com.chartboost.sdk.tracking.f fVar) {
        Intrinsics.checkNotNullParameter(fVar, "<this>");
        return this.f4681a.clearFromStorage(fVar);
    }

    @Override // com.chartboost.sdk.impl.i7
    public com.chartboost.sdk.tracking.f persist(com.chartboost.sdk.tracking.f fVar) {
        Intrinsics.checkNotNullParameter(fVar, "<this>");
        return this.f4681a.persist(fVar);
    }

    @Override // com.chartboost.sdk.impl.i7
    public fi refresh(fi fiVar) {
        Intrinsics.checkNotNullParameter(fiVar, "<this>");
        return this.f4681a.refresh(fiVar);
    }

    @Override // com.chartboost.sdk.impl.i7
    public TrackAd store(TrackAd trackAd) {
        Intrinsics.checkNotNullParameter(trackAd, "<this>");
        return this.f4681a.store(trackAd);
    }

    @Override // com.chartboost.sdk.impl.i7
    public com.chartboost.sdk.tracking.f track(com.chartboost.sdk.tracking.f fVar) {
        Intrinsics.checkNotNullParameter(fVar, "<this>");
        return this.f4681a.track(fVar);
    }

    @Override // com.chartboost.sdk.impl.h7
    /* renamed from: clearFromStorage, reason: collision with other method in class */
    public void mo4755clearFromStorage(com.chartboost.sdk.tracking.f event) {
        Intrinsics.checkNotNullParameter(event, "event");
        this.f4681a.mo4755clearFromStorage(event);
    }

    @Override // com.chartboost.sdk.impl.h7
    /* renamed from: persist, reason: collision with other method in class */
    public void mo4756persist(com.chartboost.sdk.tracking.f event) {
        Intrinsics.checkNotNullParameter(event, "event");
        this.f4681a.mo4756persist(event);
    }

    @Override // com.chartboost.sdk.impl.h7
    /* renamed from: refresh, reason: collision with other method in class */
    public void mo4757refresh(fi config) {
        Intrinsics.checkNotNullParameter(config, "config");
        this.f4681a.mo4757refresh(config);
    }

    @Override // com.chartboost.sdk.impl.h7
    /* renamed from: store, reason: collision with other method in class */
    public void mo4758store(TrackAd ad) {
        Intrinsics.checkNotNullParameter(ad, "ad");
        this.f4681a.mo4758store(ad);
    }

    @Override // com.chartboost.sdk.impl.h7
    /* renamed from: track, reason: collision with other method in class */
    public void mo4759track(com.chartboost.sdk.tracking.f event) {
        Intrinsics.checkNotNullParameter(event, "event");
        this.f4681a.mo4759track(event);
    }

    public final void a(Context context) {
        String str;
        Intrinsics.checkNotNullParameter(context, "context");
        try {
            str = System.getProperty("http.agent");
        } catch (Exception e) {
            a(e.toString());
            str = "";
        }
        try {
            str = WebSettings.getDefaultUserAgent(context);
        } catch (Exception e2) {
            a(e2.toString());
        }
        if (str != null) {
            c = str;
        }
    }

    public final void a(String str) {
        try {
            track((com.chartboost.sdk.tracking.f) new com.chartboost.sdk.tracking.b(g.f.c, str, null, null, null, 28, null));
        } catch (Exception e) {
            mb.b("sendUserAgentErrorTracking", e);
        }
    }
}
