package io.appmetrica.analytics.coreapi.internal.identifiers;

/* loaded from: classes.dex */
public class AdTrackingInfo {
    public final java.lang.String advId;
    public final java.lang.Boolean limitedAdTracking;
    public final io.appmetrica.analytics.coreapi.internal.identifiers.AdTrackingInfo.Provider provider;

    public enum Provider {
        GOOGLE,
        HMS,
        YANDEX
    }

    public AdTrackingInfo(io.appmetrica.analytics.coreapi.internal.identifiers.AdTrackingInfo.Provider provider, java.lang.String str, java.lang.Boolean bool) {
        this.provider = provider;
        this.advId = str;
        this.limitedAdTracking = bool;
    }

    public java.lang.String toString() {
        return "AdTrackingInfo{provider=" + this.provider + ", advId='" + this.advId + "', limitedAdTracking=" + this.limitedAdTracking + '}';
    }
}
