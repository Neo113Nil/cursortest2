package io.appmetrica.analytics.impl;

/* loaded from: classes.dex */
public final class P {
    public static io.appmetrica.analytics.AdvIdentifiersResult.AdvId a(io.appmetrica.analytics.internal.IdentifiersResult identifiersResult) {
        io.appmetrica.analytics.AdvIdentifiersResult.Details details;
        java.lang.String str = identifiersResult == null ? null : identifiersResult.id;
        if (identifiersResult == null) {
            details = io.appmetrica.analytics.AdvIdentifiersResult.Details.INTERNAL_ERROR;
        } else {
            int i2 = io.appmetrica.analytics.impl.O.f4750a[identifiersResult.status.ordinal()];
            details = i2 != 1 ? i2 != 2 ? i2 != 3 ? i2 != 4 ? i2 != 5 ? io.appmetrica.analytics.AdvIdentifiersResult.Details.INTERNAL_ERROR : io.appmetrica.analytics.AdvIdentifiersResult.Details.FORBIDDEN_BY_CLIENT_CONFIG : io.appmetrica.analytics.AdvIdentifiersResult.Details.INVALID_ADV_ID : io.appmetrica.analytics.AdvIdentifiersResult.Details.IDENTIFIER_PROVIDER_UNAVAILABLE : io.appmetrica.analytics.AdvIdentifiersResult.Details.FEATURE_DISABLED : io.appmetrica.analytics.AdvIdentifiersResult.Details.OK;
        }
        return new io.appmetrica.analytics.AdvIdentifiersResult.AdvId(str, details, identifiersResult != null ? identifiersResult.errorExplanation : null);
    }
}
