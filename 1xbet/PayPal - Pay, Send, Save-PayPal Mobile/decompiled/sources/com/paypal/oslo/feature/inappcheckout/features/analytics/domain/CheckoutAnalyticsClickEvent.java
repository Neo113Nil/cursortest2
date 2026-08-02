package com.paypal.oslo.feature.inappcheckout.features.analytics.domain;

@kotlin.Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0000\u0018\u0000 \u00062\u00020\u0001:\u0001\u0006B\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lcom/paypal/oslo/feature/inappcheckout/features/analytics/domain/CheckoutAnalyticsClickEvent;", "Lcom/paypal/oslo/feature/inappcheckout/features/analytics/domain/CheckoutAnalyticsEvent;", "", "p0", "<init>", "(Ljava/lang/String;)V", "Companion"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class CheckoutAnalyticsClickEvent extends com.paypal.oslo.feature.inappcheckout.features.analytics.domain.CheckoutAnalyticsEvent {
    public static final int $stable = 0;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final com.paypal.oslo.feature.inappcheckout.features.analytics.domain.CheckoutAnalyticsClickEvent.Companion INSTANCE = new com.paypal.oslo.feature.inappcheckout.features.analytics.domain.CheckoutAnalyticsClickEvent.Companion(null);
    private static final com.paypal.oslo.feature.inappcheckout.features.analytics.domain.CheckoutAnalyticsClickEvent ERROR_GET_TOKEN_FAILED_TRY_AGAIN_CLICKED = new com.paypal.oslo.feature.inappcheckout.features.analytics.domain.CheckoutAnalyticsClickEvent("get_token_failed_try_again_clicked");
    private static final com.paypal.oslo.feature.inappcheckout.features.analytics.domain.CheckoutAnalyticsClickEvent ERROR_GET_TOKEN_FAILED_CANCEL_CLICKED = new com.paypal.oslo.feature.inappcheckout.features.analytics.domain.CheckoutAnalyticsClickEvent("get_token_failed_cancel_clicked");

    private CheckoutAnalyticsClickEvent(java.lang.String str) {
        super(str, com.paypal.oslo.feature.inappcheckout.features.analytics.domain.AnalyticsEventType.INSTANCE.getClick());
    }

    @kotlin.Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0017\u0010\u0005\u001a\u00020\u00048\u0007¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\bR\u001a\u0010\t\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010\u0006\u001a\u0004\b\n\u0010\b"}, d2 = {"Lcom/paypal/oslo/feature/inappcheckout/features/analytics/domain/CheckoutAnalyticsClickEvent$Companion;", "", "<init>", "()V", "Lcom/paypal/oslo/feature/inappcheckout/features/analytics/domain/CheckoutAnalyticsClickEvent;", "ERROR_GET_TOKEN_FAILED_TRY_AGAIN_CLICKED", "Lcom/paypal/oslo/feature/inappcheckout/features/analytics/domain/CheckoutAnalyticsClickEvent;", "getERROR_GET_TOKEN_FAILED_TRY_AGAIN_CLICKED", "()Lcom/paypal/oslo/feature/inappcheckout/features/analytics/domain/CheckoutAnalyticsClickEvent;", "ERROR_GET_TOKEN_FAILED_CANCEL_CLICKED", "getERROR_GET_TOKEN_FAILED_CANCEL_CLICKED"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        public final com.paypal.oslo.feature.inappcheckout.features.analytics.domain.CheckoutAnalyticsClickEvent getERROR_GET_TOKEN_FAILED_TRY_AGAIN_CLICKED() {
            return com.paypal.oslo.feature.inappcheckout.features.analytics.domain.CheckoutAnalyticsClickEvent.ERROR_GET_TOKEN_FAILED_TRY_AGAIN_CLICKED;
        }

        public final com.paypal.oslo.feature.inappcheckout.features.analytics.domain.CheckoutAnalyticsClickEvent getERROR_GET_TOKEN_FAILED_CANCEL_CLICKED() {
            return com.paypal.oslo.feature.inappcheckout.features.analytics.domain.CheckoutAnalyticsClickEvent.ERROR_GET_TOKEN_FAILED_CANCEL_CLICKED;
        }

        public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }
}
