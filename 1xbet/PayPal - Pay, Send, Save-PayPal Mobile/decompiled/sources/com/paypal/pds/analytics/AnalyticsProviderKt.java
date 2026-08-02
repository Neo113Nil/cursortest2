package com.paypal.pds.analytics;

@kotlin.Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a\u0013\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u0000¢\u0006\u0004\b\u0002\u0010\u0003\"\u001d\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00000\u00048\u0007¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\b"}, d2 = {"Lcom/paypal/pds/analytics/AnalyticsProvider;", "", "isStub", "(Lcom/paypal/pds/analytics/AnalyticsProvider;)Z", "Landroidx/compose/runtime/ProvidableCompositionLocal;", "LocalAnalyticsProvider", "Landroidx/compose/runtime/ProvidableCompositionLocal;", "getLocalAnalyticsProvider", "()Landroidx/compose/runtime/ProvidableCompositionLocal;"}, k = 2, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class AnalyticsProviderKt {
    private static final androidx.compose.runtime.ProvidableCompositionLocal<com.paypal.pds.analytics.AnalyticsProvider> LocalAnalyticsProvider = androidx.compose.runtime.CompositionLocalKt.staticCompositionLocalOf(new kotlin.jvm.functions.Function0() { // from class: com.paypal.pds.analytics.AnalyticsProviderKt$$ExternalSyntheticLambda0
        @Override // kotlin.jvm.functions.Function0
        public final java.lang.Object invoke() {
            com.paypal.pds.analytics.AnalyticsProvider analyticsProvider;
            analyticsProvider = com.paypal.pds.analytics.AnalyticsProviderStub.INSTANCE;
            return analyticsProvider;
        }
    });

    public static final androidx.compose.runtime.ProvidableCompositionLocal<com.paypal.pds.analytics.AnalyticsProvider> getLocalAnalyticsProvider() {
        return LocalAnalyticsProvider;
    }

    public static final boolean isStub(com.paypal.pds.analytics.AnalyticsProvider analyticsProvider) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(analyticsProvider, "");
        return kotlin.jvm.internal.Intrinsics.areEqual(analyticsProvider, com.paypal.pds.analytics.AnalyticsProviderStub.INSTANCE);
    }
}
