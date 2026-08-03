package io.appmetrica.analytics.coreapi.internal.identifiers;

/* loaded from: classes.dex */
public class AdvertisingIdsHolder {

    /* renamed from: a, reason: collision with root package name */
    private final io.appmetrica.analytics.coreapi.internal.identifiers.AdTrackingInfoResult f3656a;

    /* renamed from: b, reason: collision with root package name */
    private final io.appmetrica.analytics.coreapi.internal.identifiers.AdTrackingInfoResult f3657b;

    /* renamed from: c, reason: collision with root package name */
    private final io.appmetrica.analytics.coreapi.internal.identifiers.AdTrackingInfoResult f3658c;

    public AdvertisingIdsHolder() {
        this(new io.appmetrica.analytics.coreapi.internal.identifiers.AdTrackingInfoResult(), new io.appmetrica.analytics.coreapi.internal.identifiers.AdTrackingInfoResult(), new io.appmetrica.analytics.coreapi.internal.identifiers.AdTrackingInfoResult());
    }

    public io.appmetrica.analytics.coreapi.internal.identifiers.AdTrackingInfoResult getGoogle() {
        return this.f3656a;
    }

    public io.appmetrica.analytics.coreapi.internal.identifiers.AdTrackingInfoResult getHuawei() {
        return this.f3657b;
    }

    public io.appmetrica.analytics.coreapi.internal.identifiers.AdTrackingInfoResult getYandex() {
        return this.f3658c;
    }

    public java.lang.String toString() {
        return "AdvertisingIdsHolder{mGoogle=" + this.f3656a + ", mHuawei=" + this.f3657b + ", yandex=" + this.f3658c + '}';
    }

    public AdvertisingIdsHolder(io.appmetrica.analytics.coreapi.internal.identifiers.AdTrackingInfoResult adTrackingInfoResult, io.appmetrica.analytics.coreapi.internal.identifiers.AdTrackingInfoResult adTrackingInfoResult2, io.appmetrica.analytics.coreapi.internal.identifiers.AdTrackingInfoResult adTrackingInfoResult3) {
        this.f3656a = adTrackingInfoResult;
        this.f3657b = adTrackingInfoResult2;
        this.f3658c = adTrackingInfoResult3;
    }
}
