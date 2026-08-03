package io.appmetrica.analytics.impl;

/* loaded from: classes.dex */
public final class Tl {

    /* renamed from: a, reason: collision with root package name */
    public final io.appmetrica.analytics.impl.Vl f5036a = new io.appmetrica.analytics.impl.Vl();

    public final io.appmetrica.analytics.StartupParamsItem a(io.appmetrica.analytics.internal.IdentifiersResult identifiersResult) {
        java.lang.String str = identifiersResult.id;
        io.appmetrica.analytics.impl.Vl vl = this.f5036a;
        io.appmetrica.analytics.coreapi.internal.identifiers.IdentifierStatus identifierStatus = identifiersResult.status;
        vl.getClass();
        int i2 = io.appmetrica.analytics.impl.Ul.f5093a[identifierStatus.ordinal()];
        return new io.appmetrica.analytics.StartupParamsItem(str, i2 != 1 ? i2 != 2 ? i2 != 3 ? i2 != 4 ? i2 != 5 ? io.appmetrica.analytics.StartupParamsItemStatus.UNKNOWN_ERROR : io.appmetrica.analytics.StartupParamsItemStatus.FORBIDDEN_BY_CLIENT_CONFIG : io.appmetrica.analytics.StartupParamsItemStatus.FEATURE_DISABLED : io.appmetrica.analytics.StartupParamsItemStatus.INVALID_VALUE_FROM_PROVIDER : io.appmetrica.analytics.StartupParamsItemStatus.PROVIDER_UNAVAILABLE : io.appmetrica.analytics.StartupParamsItemStatus.OK, identifiersResult.errorExplanation);
    }
}
