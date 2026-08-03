package io.appmetrica.analytics.identifiers.impl;

/* loaded from: classes.dex */
public final class h implements io.appmetrica.analytics.identifiers.impl.b {
    @Override // io.appmetrica.analytics.identifiers.impl.b
    public final io.appmetrica.analytics.identifiers.impl.c a(android.content.Context context) {
        try {
            com.google.android.gms.ads.identifier.AdvertisingIdClient.Info advertisingIdInfo = com.google.android.gms.ads.identifier.AdvertisingIdClient.getAdvertisingIdInfo(context);
            return new io.appmetrica.analytics.identifiers.impl.c(io.appmetrica.analytics.coreapi.internal.identifiers.IdentifierStatus.OK, new io.appmetrica.analytics.identifiers.impl.a("google", advertisingIdInfo.getId(), java.lang.Boolean.valueOf(advertisingIdInfo.isLimitAdTrackingEnabled())), null, 4);
        } catch (m0.h unused) {
            return new io.appmetrica.analytics.identifiers.impl.c(io.appmetrica.analytics.coreapi.internal.identifiers.IdentifierStatus.IDENTIFIER_PROVIDER_UNAVAILABLE, null, "could not resolve google services", 2);
        } catch (java.lang.Throwable th) {
            return new io.appmetrica.analytics.identifiers.impl.c(io.appmetrica.analytics.coreapi.internal.identifiers.IdentifierStatus.UNKNOWN, null, "exception while fetching google adv_id: " + th.getMessage(), 2);
        }
    }
}
