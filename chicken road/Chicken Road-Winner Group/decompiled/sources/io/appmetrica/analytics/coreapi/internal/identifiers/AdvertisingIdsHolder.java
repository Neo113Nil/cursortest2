package io.appmetrica.analytics.coreapi.internal.identifiers;

/* loaded from: classes.dex */
public class AdvertisingIdsHolder {

    /* renamed from: a, reason: collision with root package name */
    private final AdTrackingInfoResult f5340a;

    /* renamed from: b, reason: collision with root package name */
    private final AdTrackingInfoResult f5341b;

    /* renamed from: c, reason: collision with root package name */
    private final AdTrackingInfoResult f5342c;

    public AdvertisingIdsHolder() {
        this(new AdTrackingInfoResult(), new AdTrackingInfoResult(), new AdTrackingInfoResult());
    }

    public AdTrackingInfoResult getGoogle() {
        return this.f5340a;
    }

    public AdTrackingInfoResult getHuawei() {
        return this.f5341b;
    }

    public AdTrackingInfoResult getYandex() {
        return this.f5342c;
    }

    public String toString() {
        return "AdvertisingIdsHolder{mGoogle=" + this.f5340a + ", mHuawei=" + this.f5341b + ", yandex=" + this.f5342c + '}';
    }

    public AdvertisingIdsHolder(AdTrackingInfoResult adTrackingInfoResult, AdTrackingInfoResult adTrackingInfoResult2, AdTrackingInfoResult adTrackingInfoResult3) {
        this.f5340a = adTrackingInfoResult;
        this.f5341b = adTrackingInfoResult2;
        this.f5342c = adTrackingInfoResult3;
    }
}
