package com.paypal.oslo.feature.balance.analytics;

@kotlin.Metadata(d1 = {"\u0000\u0010\n\u0002\u0010\u000e\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u0019\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001*\u00020\u0000H\u0000¢\u0006\u0004\b\u0003\u0010\u0004\u001a\u0019\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001*\u00020\u0000H\u0000¢\u0006\u0004\b\u0005\u0010\u0004"}, d2 = {"", "", "Lcom/paypal/oslo/core/telemetry/analytics/context/AnalyticsContext;", "toUserIntent", "(Ljava/lang/String;)Ljava/util/List;", "toAutoReloadUserIntent"}, k = 2, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class BalanceAnalyticsConstantsKt {
    public static final java.util.List<com.paypal.oslo.core.telemetry.analytics.context.AnalyticsContext> toUserIntent(java.lang.String str) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        return kotlin.collections.CollectionsKt.listOf(new com.paypal.oslo.core.telemetry.analytics.schema.context.UserIntentContext("balance", "balance_hub", str));
    }

    public static final java.util.List<com.paypal.oslo.core.telemetry.analytics.context.AnalyticsContext> toAutoReloadUserIntent(java.lang.String str) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        return kotlin.collections.CollectionsKt.listOf(new com.paypal.oslo.core.telemetry.analytics.schema.context.UserIntentContext("balance", com.paypal.oslo.feature.balance.analytics.BalanceAnalyticsConstants.AutoReload.FEATURE, str));
    }
}
