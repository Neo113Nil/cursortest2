package com.chartboost.sdk.impl;

import android.content.Context;
import com.chartboost.sdk.Mediation;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class ja {

    /* renamed from: a, reason: collision with root package name */
    public final Context f4824a;
    public final oi b;
    public final k8 c;
    public final j3 d;
    public final lk e;
    public final Mediation f;
    public final e3 g;
    public final zd h;
    public final i7 i;

    public ja(Context context, oi uiPoster, k8 fileCache, j3 templateProxy, lk videoRepository, Mediation mediation, e3 networkService, zd openMeasurementImpressionCallback, i7 eventTracker) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(uiPoster, "uiPoster");
        Intrinsics.checkNotNullParameter(fileCache, "fileCache");
        Intrinsics.checkNotNullParameter(templateProxy, "templateProxy");
        Intrinsics.checkNotNullParameter(videoRepository, "videoRepository");
        Intrinsics.checkNotNullParameter(networkService, "networkService");
        Intrinsics.checkNotNullParameter(openMeasurementImpressionCallback, "openMeasurementImpressionCallback");
        Intrinsics.checkNotNullParameter(eventTracker, "eventTracker");
        this.f4824a = context;
        this.b = uiPoster;
        this.c = fileCache;
        this.d = templateProxy;
        this.e = videoRepository;
        this.f = mediation;
        this.g = networkService;
        this.h = openMeasurementImpressionCallback;
        this.i = eventTracker;
    }

    public final m3 a(String location, d0 adUnit, String adTypeTraitsName, String html, r0 adUnitRendererImpressionCallback, da impressionInterface, ml webViewTimeoutInterface, id nativeBridgeCommand) {
        Intrinsics.checkNotNullParameter(location, "location");
        Intrinsics.checkNotNullParameter(adUnit, "adUnit");
        Intrinsics.checkNotNullParameter(adTypeTraitsName, "adTypeTraitsName");
        Intrinsics.checkNotNullParameter(html, "html");
        Intrinsics.checkNotNullParameter(adUnitRendererImpressionCallback, "adUnitRendererImpressionCallback");
        Intrinsics.checkNotNullParameter(impressionInterface, "impressionInterface");
        Intrinsics.checkNotNullParameter(webViewTimeoutInterface, "webViewTimeoutInterface");
        Intrinsics.checkNotNullParameter(nativeBridgeCommand, "nativeBridgeCommand");
        return adUnit.C().length() > 0 ? new jk(this.f4824a, location, adUnit.q(), adTypeTraitsName, this.b, this.c, this.d, this.e, adUnit.B(), this.f, b4.b.b().i(), this.g, html, this.h, adUnitRendererImpressionCallback, impressionInterface, webViewTimeoutInterface, nativeBridgeCommand, this.i, null, 524288, null) : adUnit.u() == yf.e ? new t2(this.f4824a, location, adUnit.q(), adTypeTraitsName, this.c, this.g, this.b, this.d, this.f, adUnit.e(), adUnit.j(), adUnit.n(), this.h, adUnitRendererImpressionCallback, impressionInterface, webViewTimeoutInterface, adUnit.x(), this.i, null, null, 786432, null) : new z2(this.f4824a, location, adUnit.q(), adTypeTraitsName, this.c, this.g, this.b, this.d, this.f, html, this.h, adUnitRendererImpressionCallback, impressionInterface, webViewTimeoutInterface, nativeBridgeCommand, this.i);
    }
}
