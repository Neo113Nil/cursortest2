package com.paypal.oslo.feature.subscriptions.api.domain;

@kotlin.Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a\u0015\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000¢\u0006\u0004\b\u0003\u0010\u0004\u001a\u0011\u0010\u0005\u001a\u00020\u0000*\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"", com.datadog.android.rum.internal.metric.ViewEndedMetricDispatcher.KEY_VALUE, "Lcom/paypal/oslo/feature/subscriptions/api/domain/AgreementType;", "apiAgreementTypeFromString", "(Ljava/lang/String;)Lcom/paypal/oslo/feature/subscriptions/api/domain/AgreementType;", "toApiRawValue", "(Lcom/paypal/oslo/feature/subscriptions/api/domain/AgreementType;)Ljava/lang/String;"}, k = 2, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class AgreementTypeMapperKt {
    public static final com.paypal.oslo.feature.subscriptions.api.domain.AgreementType apiAgreementTypeFromString(java.lang.String str) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        return kotlin.jvm.internal.Intrinsics.areEqual(str, "SUBSCRIPTION") ? com.paypal.oslo.feature.subscriptions.api.domain.AgreementType.Subscription.INSTANCE : kotlin.jvm.internal.Intrinsics.areEqual(str, "VAULTED") ? com.paypal.oslo.feature.subscriptions.api.domain.AgreementType.Business.INSTANCE : com.paypal.oslo.feature.subscriptions.api.domain.AgreementType.Subscription.INSTANCE;
    }

    public static final java.lang.String toApiRawValue(com.paypal.oslo.feature.subscriptions.api.domain.AgreementType agreementType) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(agreementType, "");
        if (kotlin.jvm.internal.Intrinsics.areEqual(agreementType, com.paypal.oslo.feature.subscriptions.api.domain.AgreementType.Subscription.INSTANCE)) {
            return "SUBSCRIPTION";
        }
        if (kotlin.jvm.internal.Intrinsics.areEqual(agreementType, com.paypal.oslo.feature.subscriptions.api.domain.AgreementType.Business.INSTANCE)) {
            return "VAULTED";
        }
        throw new kotlin.NoWhenBranchMatchedException();
    }
}
