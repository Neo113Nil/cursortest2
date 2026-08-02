package com.paypal.oslo.feature.p2p.analytics;

@kotlin.Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\bÀ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\bJ\u001d\u0010\u000b\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u000b\u0010\f"}, d2 = {"Lcom/paypal/oslo/feature/p2p/analytics/P2pTransferAnalytics;", "", "<init>", "()V", "", "action", "Lcom/paypal/oslo/core/telemetry/analytics/schema/context/UserIntentContext;", "getUserIntent", "(Ljava/lang/String;)Lcom/paypal/oslo/core/telemetry/analytics/schema/context/UserIntentContext;", "id", "Lcom/paypal/oslo/core/telemetry/compose/api/ScreenAnalyticsDescriptor;", "screenDescriptor", "(Ljava/lang/String;Ljava/lang/String;)Lcom/paypal/oslo/core/telemetry/compose/api/ScreenAnalyticsDescriptor;"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class P2pTransferAnalytics {
    public static final int $stable = 0;
    public static final com.paypal.oslo.feature.p2p.analytics.P2pTransferAnalytics INSTANCE = new com.paypal.oslo.feature.p2p.analytics.P2pTransferAnalytics();

    private P2pTransferAnalytics() {
    }

    public static /* synthetic */ com.paypal.oslo.core.telemetry.analytics.schema.context.UserIntentContext getUserIntent$default(com.paypal.oslo.feature.p2p.analytics.P2pTransferAnalytics p2pTransferAnalytics, java.lang.String str, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            str = "viewed";
        }
        return p2pTransferAnalytics.getUserIntent(str);
    }

    public final com.paypal.oslo.core.telemetry.analytics.schema.context.UserIntentContext getUserIntent(java.lang.String action) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(action, "");
        return new com.paypal.oslo.core.telemetry.analytics.schema.context.UserIntentContext(com.paypal.oslo.core.telemetry.analytics.schema.Product.PEER_TO_PEER, com.paypal.oslo.feature.onboarding.postonboarding.intent.domain.IntentFlowDataValues.P2P, action);
    }

    public final com.paypal.oslo.core.telemetry.compose.api.ScreenAnalyticsDescriptor screenDescriptor(java.lang.String id, java.lang.String action) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(id, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(action, "");
        return new com.paypal.oslo.core.telemetry.compose.api.ScreenAnalyticsDescriptor(id, new com.paypal.oslo.core.telemetry.analytics.schema.context.UserIntentContext(com.paypal.oslo.core.telemetry.analytics.schema.Product.PEER_TO_PEER, com.paypal.oslo.feature.onboarding.postonboarding.intent.domain.IntentFlowDataValues.P2P, action), null, 4, null);
    }
}
