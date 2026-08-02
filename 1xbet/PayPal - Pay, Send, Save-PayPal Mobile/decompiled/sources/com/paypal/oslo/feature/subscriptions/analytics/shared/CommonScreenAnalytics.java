package com.paypal.oslo.feature.subscriptions.analytics.shared;

@kotlin.Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\b \u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u001a\u0010\u0003\u001a\u00020\u00028\u0005X\u0084\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0006\u001a\u0004\b\u0007\u0010\bR\u0014\u0010\f\u001a\u00020\t8'X¦\u0004¢\u0006\u0006\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\u0010\u001a\u00020\r8G¢\u0006\u0006\u001a\u0004\b\u000e\u0010\u000f"}, d2 = {"Lcom/paypal/oslo/feature/subscriptions/analytics/shared/CommonScreenAnalytics;", "", "Lcom/paypal/oslo/feature/subscriptions/api/domain/AgreementType;", "agreementType", "<init>", "(Lcom/paypal/oslo/feature/subscriptions/api/domain/AgreementType;)V", "Lcom/paypal/oslo/feature/subscriptions/api/domain/AgreementType;", "getAgreementType", "()Lcom/paypal/oslo/feature/subscriptions/api/domain/AgreementType;", "Lcom/paypal/oslo/feature/subscriptions/api/analytics/SubscriptionsUserIntentContext;", "getSubscriptionUserIntent", "()Lcom/paypal/oslo/feature/subscriptions/api/analytics/SubscriptionsUserIntentContext;", "subscriptionUserIntent", "", "getScreenName", "()Ljava/lang/String;", "screenName"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes15.dex */
public abstract class CommonScreenAnalytics {
    public static final int $stable = 8;
    private final com.paypal.oslo.feature.subscriptions.api.domain.AgreementType agreementType;

    public abstract com.paypal.oslo.feature.subscriptions.api.analytics.SubscriptionsUserIntentContext getSubscriptionUserIntent();

    public CommonScreenAnalytics(com.paypal.oslo.feature.subscriptions.api.domain.AgreementType agreementType) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(agreementType, "");
        this.agreementType = agreementType;
    }

    protected final com.paypal.oslo.feature.subscriptions.api.domain.AgreementType getAgreementType() {
        return this.agreementType;
    }

    public final java.lang.String getScreenName() {
        return getSubscriptionUserIntent().getScreenName();
    }
}
