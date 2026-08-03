package io.appmetrica.analytics.impl;

/* loaded from: classes.dex */
public final class N implements io.appmetrica.analytics.impl.K {

    /* renamed from: a, reason: collision with root package name */
    public final io.appmetrica.analytics.impl.K f4698a;

    public N(io.appmetrica.analytics.impl.K k2) {
        this.f4698a = k2;
    }

    @Override // io.appmetrica.analytics.impl.K
    public final io.appmetrica.analytics.coreapi.internal.identifiers.AdTrackingInfoResult a(android.content.Context context) {
        return a(new io.appmetrica.analytics.impl.L(this, context));
    }

    @Override // io.appmetrica.analytics.impl.K
    public final io.appmetrica.analytics.coreapi.internal.identifiers.AdTrackingInfoResult a(android.content.Context context, io.appmetrica.analytics.impl.Gi gi) {
        return a(new io.appmetrica.analytics.impl.M(this, context, gi));
    }

    public static io.appmetrica.analytics.coreapi.internal.identifiers.AdTrackingInfoResult a(io.appmetrica.analytics.coreapi.internal.backport.Provider provider) {
        io.appmetrica.analytics.coreapi.internal.identifiers.AdTrackingInfoResult adTrackingInfoResult = (io.appmetrica.analytics.coreapi.internal.identifiers.AdTrackingInfoResult) provider.get();
        io.appmetrica.analytics.coreapi.internal.identifiers.AdTrackingInfo adTrackingInfo = adTrackingInfoResult.mAdTrackingInfo;
        return (adTrackingInfo == null || !"00000000-0000-0000-0000-000000000000".equals(adTrackingInfo.advId)) ? adTrackingInfoResult : new io.appmetrica.analytics.coreapi.internal.identifiers.AdTrackingInfoResult(null, io.appmetrica.analytics.coreapi.internal.identifiers.IdentifierStatus.INVALID_ADV_ID, "AdvId is invalid: 00000000-0000-0000-0000-000000000000");
    }
}
