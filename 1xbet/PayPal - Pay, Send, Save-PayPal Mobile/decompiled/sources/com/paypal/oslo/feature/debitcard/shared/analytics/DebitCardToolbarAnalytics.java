package com.paypal.oslo.feature.debitcard.shared.analytics;

@kotlin.Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\bÀ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u001b\u0010\t\u001a\u00020\u00048GX\u0086\u0084\u0002¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\bR\u001b\u0010\f\u001a\u00020\u00048GX\u0087\u0084\u0002¢\u0006\f\n\u0004\b\n\u0010\u0006\u001a\u0004\b\u000b\u0010\bR\u001b\u0010\u000f\u001a\u00020\u00048GX\u0087\u0084\u0002¢\u0006\f\n\u0004\b\r\u0010\u0006\u001a\u0004\b\u000e\u0010\b"}, d2 = {"Lcom/paypal/oslo/feature/debitcard/shared/analytics/DebitCardToolbarAnalytics;", "", "<init>", "()V", "Lcom/paypal/oslo/core/telemetry/analytics/schema/context/UIContext$Item;", "BACK_BUTTON$delegate", "Lkotlin/Lazy;", "getBACK_BUTTON", "()Lcom/paypal/oslo/core/telemetry/analytics/schema/context/UIContext$Item;", "BACK_BUTTON", "CLOSE_BUTTON$delegate", "getCLOSE_BUTTON", "CLOSE_BUTTON", "SKIP_BUTTON$delegate", "getSKIP_BUTTON", "SKIP_BUTTON"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class DebitCardToolbarAnalytics {
    public static final com.paypal.oslo.feature.debitcard.shared.analytics.DebitCardToolbarAnalytics INSTANCE = new com.paypal.oslo.feature.debitcard.shared.analytics.DebitCardToolbarAnalytics();

    /* renamed from: BACK_BUTTON$delegate, reason: from kotlin metadata */
    private static final kotlin.Lazy BACK_BUTTON = kotlin.LazyKt.lazy(new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.debitcard.shared.analytics.DebitCardToolbarAnalytics$$ExternalSyntheticLambda0
        @Override // kotlin.jvm.functions.Function0
        public final java.lang.Object invoke() {
            return com.paypal.oslo.feature.debitcard.shared.analytics.DebitCardToolbarAnalytics.$r8$lambda$mgRVWwBo8lUdd9xpyn99x_WtQeM();
        }
    });

    /* renamed from: CLOSE_BUTTON$delegate, reason: from kotlin metadata */
    private static final kotlin.Lazy CLOSE_BUTTON = kotlin.LazyKt.lazy(new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.debitcard.shared.analytics.DebitCardToolbarAnalytics$$ExternalSyntheticLambda1
        @Override // kotlin.jvm.functions.Function0
        public final java.lang.Object invoke() {
            return com.paypal.oslo.feature.debitcard.shared.analytics.DebitCardToolbarAnalytics.m14556$r8$lambda$ip_xeNKBDt9mIqsAY0rxy4hi8U();
        }
    });

    /* renamed from: SKIP_BUTTON$delegate, reason: from kotlin metadata */
    private static final kotlin.Lazy SKIP_BUTTON = kotlin.LazyKt.lazy(new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.debitcard.shared.analytics.DebitCardToolbarAnalytics$$ExternalSyntheticLambda2
        @Override // kotlin.jvm.functions.Function0
        public final java.lang.Object invoke() {
            return com.paypal.oslo.feature.debitcard.shared.analytics.DebitCardToolbarAnalytics.$r8$lambda$R3JuQk_5DFRb_fZC1DyrS0c38zw();
        }
    });
    public static final int $stable = 8;

    private DebitCardToolbarAnalytics() {
    }

    public final com.paypal.oslo.core.telemetry.analytics.schema.context.UIContext.Item getBACK_BUTTON() {
        return (com.paypal.oslo.core.telemetry.analytics.schema.context.UIContext.Item) BACK_BUTTON.getValue();
    }

    public final com.paypal.oslo.core.telemetry.analytics.schema.context.UIContext.Item getCLOSE_BUTTON() {
        return (com.paypal.oslo.core.telemetry.analytics.schema.context.UIContext.Item) CLOSE_BUTTON.getValue();
    }

    public final com.paypal.oslo.core.telemetry.analytics.schema.context.UIContext.Item getSKIP_BUTTON() {
        return (com.paypal.oslo.core.telemetry.analytics.schema.context.UIContext.Item) SKIP_BUTTON.getValue();
    }

    public static /* synthetic */ com.paypal.oslo.core.telemetry.analytics.schema.context.UIContext.Item $r8$lambda$R3JuQk_5DFRb_fZC1DyrS0c38zw() {
        return new com.paypal.oslo.core.telemetry.analytics.schema.context.UIContext.Item("skip_button", 0, 2, null);
    }

    /* renamed from: $r8$lambda$ip_xeNKBDt9mIqsAY0rxy4hi-8U, reason: not valid java name */
    public static /* synthetic */ com.paypal.oslo.core.telemetry.analytics.schema.context.UIContext.Item m14556$r8$lambda$ip_xeNKBDt9mIqsAY0rxy4hi8U() {
        return new com.paypal.oslo.core.telemetry.analytics.schema.context.UIContext.Item("close_button", 0, 2, null);
    }

    public static /* synthetic */ com.paypal.oslo.core.telemetry.analytics.schema.context.UIContext.Item $r8$lambda$mgRVWwBo8lUdd9xpyn99x_WtQeM() {
        return new com.paypal.oslo.core.telemetry.analytics.schema.context.UIContext.Item("back_button", 0, 2, null);
    }
}
