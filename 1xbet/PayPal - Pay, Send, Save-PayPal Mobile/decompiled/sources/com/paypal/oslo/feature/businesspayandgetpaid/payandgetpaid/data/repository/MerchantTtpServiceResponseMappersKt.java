package com.paypal.oslo.feature.businesspayandgetpaid.payandgetpaid.data.repository;

@kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\u0013\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u0000¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lcom/paypal/oslo/api/graphql/schema/type/MerchantTapToPayOnboardingStatus;", "Lcom/paypal/oslo/feature/businesspayandgetpaid/payandgetpaid/domain/model/MerchantTapToPayOnboardingStatus;", "toTapToPayOnboardingStatus", "(Lcom/paypal/oslo/api/graphql/schema/type/MerchantTapToPayOnboardingStatus;)Lcom/paypal/oslo/feature/businesspayandgetpaid/payandgetpaid/domain/model/MerchantTapToPayOnboardingStatus;"}, k = 2, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class MerchantTtpServiceResponseMappersKt {
    public static final com.paypal.oslo.feature.businesspayandgetpaid.payandgetpaid.domain.model.MerchantTapToPayOnboardingStatus toTapToPayOnboardingStatus(com.paypal.oslo.api.graphql.schema.type.MerchantTapToPayOnboardingStatus merchantTapToPayOnboardingStatus) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(merchantTapToPayOnboardingStatus, "");
        switch (com.paypal.oslo.feature.businesspayandgetpaid.payandgetpaid.data.repository.MerchantTtpServiceResponseMappersKt.WhenMappings.$EnumSwitchMapping$0[merchantTapToPayOnboardingStatus.ordinal()]) {
            case 1:
                return com.paypal.oslo.feature.businesspayandgetpaid.payandgetpaid.domain.model.MerchantTapToPayOnboardingStatus.CREATED;
            case 2:
                return com.paypal.oslo.feature.businesspayandgetpaid.payandgetpaid.domain.model.MerchantTapToPayOnboardingStatus.SUBMITTED;
            case 3:
                return com.paypal.oslo.feature.businesspayandgetpaid.payandgetpaid.domain.model.MerchantTapToPayOnboardingStatus.IN_REVIEW;
            case 4:
                return com.paypal.oslo.feature.businesspayandgetpaid.payandgetpaid.domain.model.MerchantTapToPayOnboardingStatus.NEED_MORE_DATA;
            case 5:
                return com.paypal.oslo.feature.businesspayandgetpaid.payandgetpaid.domain.model.MerchantTapToPayOnboardingStatus.APPROVED;
            case 6:
                return com.paypal.oslo.feature.businesspayandgetpaid.payandgetpaid.domain.model.MerchantTapToPayOnboardingStatus.SUBSCRIBED;
            case 7:
                return com.paypal.oslo.feature.businesspayandgetpaid.payandgetpaid.domain.model.MerchantTapToPayOnboardingStatus.PAUSED;
            case 8:
                return com.paypal.oslo.feature.businesspayandgetpaid.payandgetpaid.domain.model.MerchantTapToPayOnboardingStatus.DENIED;
            case 9:
                return com.paypal.oslo.feature.businesspayandgetpaid.payandgetpaid.domain.model.MerchantTapToPayOnboardingStatus.CANCELLED;
            case 10:
                return com.paypal.oslo.feature.businesspayandgetpaid.payandgetpaid.domain.model.MerchantTapToPayOnboardingStatus.UNKNOWN;
            default:
                throw new kotlin.NoWhenBranchMatchedException();
        }
    }

    @kotlin.Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[com.paypal.oslo.api.graphql.schema.type.MerchantTapToPayOnboardingStatus.values().length];
            try {
                iArr[com.paypal.oslo.api.graphql.schema.type.MerchantTapToPayOnboardingStatus.CREATED.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused) {
            }
            try {
                iArr[com.paypal.oslo.api.graphql.schema.type.MerchantTapToPayOnboardingStatus.SUBMITTED.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused2) {
            }
            try {
                iArr[com.paypal.oslo.api.graphql.schema.type.MerchantTapToPayOnboardingStatus.IN_REVIEW.ordinal()] = 3;
            } catch (java.lang.NoSuchFieldError unused3) {
            }
            try {
                iArr[com.paypal.oslo.api.graphql.schema.type.MerchantTapToPayOnboardingStatus.NEED_MORE_DATA.ordinal()] = 4;
            } catch (java.lang.NoSuchFieldError unused4) {
            }
            try {
                iArr[com.paypal.oslo.api.graphql.schema.type.MerchantTapToPayOnboardingStatus.APPROVED.ordinal()] = 5;
            } catch (java.lang.NoSuchFieldError unused5) {
            }
            try {
                iArr[com.paypal.oslo.api.graphql.schema.type.MerchantTapToPayOnboardingStatus.SUBSCRIBED.ordinal()] = 6;
            } catch (java.lang.NoSuchFieldError unused6) {
            }
            try {
                iArr[com.paypal.oslo.api.graphql.schema.type.MerchantTapToPayOnboardingStatus.PAUSED.ordinal()] = 7;
            } catch (java.lang.NoSuchFieldError unused7) {
            }
            try {
                iArr[com.paypal.oslo.api.graphql.schema.type.MerchantTapToPayOnboardingStatus.DENIED.ordinal()] = 8;
            } catch (java.lang.NoSuchFieldError unused8) {
            }
            try {
                iArr[com.paypal.oslo.api.graphql.schema.type.MerchantTapToPayOnboardingStatus.CANCELLED.ordinal()] = 9;
            } catch (java.lang.NoSuchFieldError unused9) {
            }
            try {
                iArr[com.paypal.oslo.api.graphql.schema.type.MerchantTapToPayOnboardingStatus.UNKNOWN__.ordinal()] = 10;
            } catch (java.lang.NoSuchFieldError unused10) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }
}
