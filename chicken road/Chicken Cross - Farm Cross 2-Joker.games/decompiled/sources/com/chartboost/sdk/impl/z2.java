package com.chartboost.sdk.impl;

import android.content.Context;
import com.chartboost.sdk.Mediation;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;

/* loaded from: classes4.dex */
public final class z2 extends m3 {
    public final String O;
    public final da P;
    public final id Q;
    public final i7 R;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public z2(Context context, String location, bc mtype, String adUnitParameters, k8 fileCache, e3 e3Var, oi uiPoster, j3 j3Var, Mediation mediation, String str, zd openMeasurementImpressionCallback, r0 adUnitRendererCallback, da impressionInterface, ml webViewTimeoutInterface, id nativeBridgeCommand, i7 eventTracker) {
        super(context, location, mtype, adUnitParameters, uiPoster, fileCache, e3Var, j3Var, mediation, str, openMeasurementImpressionCallback, adUnitRendererCallback, webViewTimeoutInterface, eventTracker, null, 16384, null);
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(location, "location");
        Intrinsics.checkNotNullParameter(mtype, "mtype");
        Intrinsics.checkNotNullParameter(adUnitParameters, "adUnitParameters");
        Intrinsics.checkNotNullParameter(fileCache, "fileCache");
        Intrinsics.checkNotNullParameter(uiPoster, "uiPoster");
        Intrinsics.checkNotNullParameter(openMeasurementImpressionCallback, "openMeasurementImpressionCallback");
        Intrinsics.checkNotNullParameter(adUnitRendererCallback, "adUnitRendererCallback");
        Intrinsics.checkNotNullParameter(impressionInterface, "impressionInterface");
        Intrinsics.checkNotNullParameter(webViewTimeoutInterface, "webViewTimeoutInterface");
        Intrinsics.checkNotNullParameter(nativeBridgeCommand, "nativeBridgeCommand");
        Intrinsics.checkNotNullParameter(eventTracker, "eventTracker");
        this.O = str;
        this.P = impressionInterface;
        this.Q = nativeBridgeCommand;
        this.R = eventTracker;
    }

    @Override // com.chartboost.sdk.impl.m3
    public qk b(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        this.Q.a(this.P);
        String str = this.O;
        if (str == null || StringsKt.isBlank(str)) {
            mb.b("templateHtml must not be null or blank", (Throwable) null, 2, (Object) null);
            return null;
        }
        try {
            return new ed(context, this.O, j(), this.P, h(), this.Q, this.R, null, 128, null);
        } catch (Exception e) {
            c("Can't instantiate MraidWebViewBase: " + e);
            return null;
        }
    }

    @Override // com.chartboost.sdk.impl.m3, com.chartboost.sdk.impl.h7
    /* renamed from: track */
    public void mo4759track(com.chartboost.sdk.tracking.f event) {
        Intrinsics.checkNotNullParameter(event, "event");
        super.mo4759track(event);
    }

    @Override // com.chartboost.sdk.impl.m3
    public void w() {
    }
}
