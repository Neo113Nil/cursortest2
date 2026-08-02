package com.paypal.oslo.feature.subscriptions.shared.domain;

@kotlin.Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u0017\u0010\u0003\u001a\u00020\u0002*\u00060\u0000j\u0002`\u0001H\u0000¢\u0006\u0004\b\u0003\u0010\u0004\u001a\u0017\u0010\u0007\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0005H\u0000¢\u0006\u0004\b\u0007\u0010\b\u001a\u0013\u0010\t\u001a\u00020\u0005*\u00020\u0002H\u0000¢\u0006\u0004\b\t\u0010\n\u001a\u0017\u0010\f\u001a\u00020\u000b2\u0006\u0010\u0006\u001a\u00020\u0005H\u0000¢\u0006\u0004\b\f\u0010\r\u001a\u0013\u0010\t\u001a\u00020\u0005*\u00020\u000bH\u0000¢\u0006\u0004\b\t\u0010\u000e"}, d2 = {"Lcom/paypal/oslo/api/graphql/schema/type/ConsumerAgreementType;", "Lcom/paypal/oslo/feature/subscriptions/graphql/type/ConsumerAgreementType;", "Lcom/paypal/oslo/feature/subscriptions/api/domain/AgreementType;", "toAgreementType", "(Lcom/paypal/oslo/api/graphql/schema/type/ConsumerAgreementType;)Lcom/paypal/oslo/feature/subscriptions/api/domain/AgreementType;", "", com.datadog.android.rum.internal.metric.ViewEndedMetricDispatcher.KEY_VALUE, "agreementTypeFromString", "(Ljava/lang/String;)Lcom/paypal/oslo/feature/subscriptions/api/domain/AgreementType;", "toRawValue", "(Lcom/paypal/oslo/feature/subscriptions/api/domain/AgreementType;)Ljava/lang/String;", "Lcom/paypal/oslo/feature/subscriptions/shared/domain/MerchantManagementType;", "merchantManagementTypeFromString", "(Ljava/lang/String;)Lcom/paypal/oslo/feature/subscriptions/shared/domain/MerchantManagementType;", "(Lcom/paypal/oslo/feature/subscriptions/shared/domain/MerchantManagementType;)Ljava/lang/String;"}, k = 2, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class AgreementTypeMapperKt {
    public static final com.paypal.oslo.feature.subscriptions.api.domain.AgreementType toAgreementType(com.paypal.oslo.api.graphql.schema.type.ConsumerAgreementType consumerAgreementType) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(consumerAgreementType, "");
        return com.paypal.oslo.feature.subscriptions.api.domain.AgreementTypeMapperKt.apiAgreementTypeFromString(consumerAgreementType.getRawValue());
    }

    public static final com.paypal.oslo.feature.subscriptions.api.domain.AgreementType agreementTypeFromString(java.lang.String str) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        return com.paypal.oslo.feature.subscriptions.api.domain.AgreementTypeMapperKt.apiAgreementTypeFromString(str);
    }

    public static final java.lang.String toRawValue(com.paypal.oslo.feature.subscriptions.api.domain.AgreementType agreementType) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(agreementType, "");
        return com.paypal.oslo.feature.subscriptions.api.domain.AgreementTypeMapperKt.toApiRawValue(agreementType);
    }

    public static final com.paypal.oslo.feature.subscriptions.shared.domain.MerchantManagementType merchantManagementTypeFromString(java.lang.String str) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        int i = com.paypal.oslo.feature.subscriptions.shared.domain.AgreementTypeMapperKt.WhenMappings.$EnumSwitchMapping$0[com.paypal.oslo.api.graphql.schema.type.ConsumerAgreementManagementType.INSTANCE.safeValueOf(str).ordinal()];
        if (i == 1) {
            return com.paypal.oslo.feature.subscriptions.shared.domain.MerchantManagementType.MERCHANT_MANAGED;
        }
        if (i == 2) {
            return com.paypal.oslo.feature.subscriptions.shared.domain.MerchantManagementType.PAYPAL_MANAGED;
        }
        return com.paypal.oslo.feature.subscriptions.shared.domain.MerchantManagementType.PAYPAL_MANAGED;
    }

    public static final java.lang.String toRawValue(com.paypal.oslo.feature.subscriptions.shared.domain.MerchantManagementType merchantManagementType) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(merchantManagementType, "");
        int i = com.paypal.oslo.feature.subscriptions.shared.domain.AgreementTypeMapperKt.WhenMappings.$EnumSwitchMapping$1[merchantManagementType.ordinal()];
        if (i == 1) {
            return com.paypal.oslo.api.graphql.schema.type.ConsumerAgreementManagementType.MERCHANT_MANAGED.getRawValue();
        }
        if (i != 2) {
            throw new kotlin.NoWhenBranchMatchedException();
        }
        return com.paypal.oslo.api.graphql.schema.type.ConsumerAgreementManagementType.PAYPAL_MANAGED.getRawValue();
    }

    @kotlin.Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;
        public static final /* synthetic */ int[] $EnumSwitchMapping$1;

        static {
            int[] iArr = new int[com.paypal.oslo.api.graphql.schema.type.ConsumerAgreementManagementType.values().length];
            try {
                iArr[com.paypal.oslo.api.graphql.schema.type.ConsumerAgreementManagementType.MERCHANT_MANAGED.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused) {
            }
            try {
                iArr[com.paypal.oslo.api.graphql.schema.type.ConsumerAgreementManagementType.PAYPAL_MANAGED.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
            int[] iArr2 = new int[com.paypal.oslo.feature.subscriptions.shared.domain.MerchantManagementType.values().length];
            try {
                iArr2[com.paypal.oslo.feature.subscriptions.shared.domain.MerchantManagementType.MERCHANT_MANAGED.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused3) {
            }
            try {
                iArr2[com.paypal.oslo.feature.subscriptions.shared.domain.MerchantManagementType.PAYPAL_MANAGED.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused4) {
            }
            $EnumSwitchMapping$1 = iArr2;
        }
    }
}
