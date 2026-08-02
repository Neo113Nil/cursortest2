package com.paypal.oslo.feature.subscriptions.api.analytics;

@kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\b6\u0018\u00002\u00020\u0001:\u0003\u0017\u0018\u0019B!\b\u0004\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u0015\u0010\u000b\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\u0002¢\u0006\u0004\b\u000b\u0010\fR\u0017\u0010\r\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\r\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010R\u001a\u0010\u0011\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014R\u0014\u0010\u0016\u001a\u00020\u00028\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u000e\u0082\u0001\u0003\u001a\u001b\u001c"}, d2 = {"Lcom/paypal/oslo/feature/subscriptions/api/analytics/SubscriptionsUserIntentContext;", "", "", "p0", "Lcom/paypal/oslo/feature/subscriptions/api/domain/AgreementType;", "p1", "p2", "<init>", "(Ljava/lang/String;Lcom/paypal/oslo/feature/subscriptions/api/domain/AgreementType;Ljava/lang/String;)V", "action", "Lcom/paypal/oslo/core/telemetry/analytics/schema/context/UserIntentContext;", "withAction", "(Ljava/lang/String;)Lcom/paypal/oslo/core/telemetry/analytics/schema/context/UserIntentContext;", "screenName", "Ljava/lang/String;", "getScreenName", "()Ljava/lang/String;", "agreementType", "Lcom/paypal/oslo/feature/subscriptions/api/domain/AgreementType;", "getAgreementType", "()Lcom/paypal/oslo/feature/subscriptions/api/domain/AgreementType;", "getHighSpeedVideoFpsRangesFor", "Camera2StreamConfigurationMap", "Hub", "Detail", "BulkFi", "Lcom/paypal/oslo/feature/subscriptions/api/analytics/SubscriptionsUserIntentContext$BulkFi;", "Lcom/paypal/oslo/feature/subscriptions/api/analytics/SubscriptionsUserIntentContext$Detail;", "Lcom/paypal/oslo/feature/subscriptions/api/analytics/SubscriptionsUserIntentContext$Hub;"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes15.dex */
public abstract class SubscriptionsUserIntentContext {
    private final com.paypal.oslo.feature.subscriptions.api.domain.AgreementType agreementType;

    /* renamed from: getHighSpeedVideoFpsRangesFor, reason: from kotlin metadata */
    private final java.lang.String Camera2StreamConfigurationMap;
    private final java.lang.String screenName;

    private SubscriptionsUserIntentContext(java.lang.String str, com.paypal.oslo.feature.subscriptions.api.domain.AgreementType agreementType, java.lang.String str2) {
        this.screenName = str;
        this.agreementType = agreementType;
        this.Camera2StreamConfigurationMap = str2;
    }

    public final java.lang.String getScreenName() {
        return this.screenName;
    }

    public final com.paypal.oslo.feature.subscriptions.api.domain.AgreementType getAgreementType() {
        return this.agreementType;
    }

    public final com.paypal.oslo.core.telemetry.analytics.schema.context.UserIntentContext withAction(java.lang.String action) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(action, "");
        com.paypal.oslo.feature.subscriptions.api.domain.AgreementType agreementType = this.agreementType;
        if (kotlin.jvm.internal.Intrinsics.areEqual(agreementType, com.paypal.oslo.feature.subscriptions.api.domain.AgreementType.Subscription.INSTANCE)) {
            return new com.paypal.oslo.core.telemetry.analytics.schema.context.UserIntentContext("subscriptions", this.Camera2StreamConfigurationMap, action);
        }
        if (!kotlin.jvm.internal.Intrinsics.areEqual(agreementType, com.paypal.oslo.feature.subscriptions.api.domain.AgreementType.Business.INSTANCE)) {
            throw new kotlin.NoWhenBranchMatchedException();
        }
        return new com.paypal.oslo.core.telemetry.analytics.schema.context.UserIntentContext(com.paypal.oslo.feature.subscriptions.api.analytics.SubscriptionsAnalyticsConstants.PRODUCT_VAULTED_BUSINESSES, this.Camera2StreamConfigurationMap, action);
    }

    @kotlin.Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Lcom/paypal/oslo/feature/subscriptions/api/analytics/SubscriptionsUserIntentContext$Hub;", "Lcom/paypal/oslo/feature/subscriptions/api/analytics/SubscriptionsUserIntentContext;", "", "screenName", "Lcom/paypal/oslo/feature/subscriptions/api/domain/AgreementType;", "agreementType", "<init>", "(Ljava/lang/String;Lcom/paypal/oslo/feature/subscriptions/api/domain/AgreementType;)V"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class Hub extends com.paypal.oslo.feature.subscriptions.api.analytics.SubscriptionsUserIntentContext {
        /* JADX WARN: Illegal instructions before constructor call */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public Hub(java.lang.String str, com.paypal.oslo.feature.subscriptions.api.domain.AgreementType agreementType) {
            super(str, agreementType, r0, null);
            java.lang.String str2;
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(agreementType, "");
            if (kotlin.jvm.internal.Intrinsics.areEqual(agreementType, com.paypal.oslo.feature.subscriptions.api.domain.AgreementType.Subscription.INSTANCE)) {
                str2 = com.paypal.oslo.feature.subscriptions.api.analytics.SubscriptionsAnalyticsConstants.FEATURE_SUBSCRIPTIONS_HUB;
            } else {
                if (!kotlin.jvm.internal.Intrinsics.areEqual(agreementType, com.paypal.oslo.feature.subscriptions.api.domain.AgreementType.Business.INSTANCE)) {
                    throw new kotlin.NoWhenBranchMatchedException();
                }
                str2 = com.paypal.oslo.feature.subscriptions.api.analytics.SubscriptionsAnalyticsConstants.FEATURE_LINKED_BUSINESSES_HUB;
            }
        }
    }

    @kotlin.Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Lcom/paypal/oslo/feature/subscriptions/api/analytics/SubscriptionsUserIntentContext$Detail;", "Lcom/paypal/oslo/feature/subscriptions/api/analytics/SubscriptionsUserIntentContext;", "", "screenName", "Lcom/paypal/oslo/feature/subscriptions/api/domain/AgreementType;", "agreementType", "<init>", "(Ljava/lang/String;Lcom/paypal/oslo/feature/subscriptions/api/domain/AgreementType;)V"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class Detail extends com.paypal.oslo.feature.subscriptions.api.analytics.SubscriptionsUserIntentContext {
        /* JADX WARN: Illegal instructions before constructor call */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public Detail(java.lang.String str, com.paypal.oslo.feature.subscriptions.api.domain.AgreementType agreementType) {
            super(str, agreementType, r0, null);
            java.lang.String str2;
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(agreementType, "");
            if (kotlin.jvm.internal.Intrinsics.areEqual(agreementType, com.paypal.oslo.feature.subscriptions.api.domain.AgreementType.Subscription.INSTANCE)) {
                str2 = "subscription_detail";
            } else {
                if (!kotlin.jvm.internal.Intrinsics.areEqual(agreementType, com.paypal.oslo.feature.subscriptions.api.domain.AgreementType.Business.INSTANCE)) {
                    throw new kotlin.NoWhenBranchMatchedException();
                }
                str2 = "business_detail";
            }
        }
    }

    @kotlin.Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Lcom/paypal/oslo/feature/subscriptions/api/analytics/SubscriptionsUserIntentContext$BulkFi;", "Lcom/paypal/oslo/feature/subscriptions/api/analytics/SubscriptionsUserIntentContext;", "", "screenName", "Lcom/paypal/oslo/feature/subscriptions/api/domain/AgreementType;", "agreementType", "<init>", "(Ljava/lang/String;Lcom/paypal/oslo/feature/subscriptions/api/domain/AgreementType;)V"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class BulkFi extends com.paypal.oslo.feature.subscriptions.api.analytics.SubscriptionsUserIntentContext {
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public BulkFi(java.lang.String str, com.paypal.oslo.feature.subscriptions.api.domain.AgreementType agreementType) {
            super(str, agreementType, com.paypal.oslo.feature.subscriptions.api.analytics.SubscriptionsAnalyticsConstants.FEATURE_BULK_FI_UPDATE, null);
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(agreementType, "");
        }
    }

    public /* synthetic */ SubscriptionsUserIntentContext(java.lang.String str, com.paypal.oslo.feature.subscriptions.api.domain.AgreementType agreementType, java.lang.String str2, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this(str, agreementType, str2);
    }
}
