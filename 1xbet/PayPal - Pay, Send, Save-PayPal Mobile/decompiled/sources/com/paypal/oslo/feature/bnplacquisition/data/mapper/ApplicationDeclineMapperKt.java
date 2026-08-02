package com.paypal.oslo.feature.bnplacquisition.data.mapper;

@kotlin.Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u001a\u0017\u0010\u0003\u001a\u00020\u0002*\u00060\u0000j\u0002`\u0001H\u0000¢\u0006\u0004\b\u0003\u0010\u0004\u001a\u0017\u0010\u0003\u001a\u00020\u0002*\u00060\u0005j\u0002`\u0006H\u0000¢\u0006\u0004\b\u0003\u0010\u0007\u001a\u0013\u0010\u0003\u001a\u00020\u0002*\u00020\bH\u0000¢\u0006\u0004\b\u0003\u0010\t"}, d2 = {"Lcom/paypal/oslo/api/graphql/schema/type/BNPLAcquisitionApplicationDeclineReason;", "Lcom/paypal/oslo/feature/bnplacquisition/graphql/type/BNPLAcquisitionApplicationDeclineReason;", "Lcom/paypal/oslo/feature/bnplacquisition/domain/model/common/ApplicationDecline;", "toApplicationDecline", "(Lcom/paypal/oslo/api/graphql/schema/type/BNPLAcquisitionApplicationDeclineReason;)Lcom/paypal/oslo/feature/bnplacquisition/domain/model/common/ApplicationDecline;", "Lcom/paypal/oslo/api/graphql/schema/type/BNPLTokenProvisionEligibilityDeclineReason;", "Lcom/paypal/oslo/feature/bnplacquisition/graphql/type/BNPLTokenProvisionEligibilityDeclineReason;", "(Lcom/paypal/oslo/api/graphql/schema/type/BNPLTokenProvisionEligibilityDeclineReason;)Lcom/paypal/oslo/feature/bnplacquisition/domain/model/common/ApplicationDecline;", "Lcom/paypal/oslo/api/graphql/schema/type/BNPLAcquisitionProductOffersEligibilityDeclineReason;", "(Lcom/paypal/oslo/api/graphql/schema/type/BNPLAcquisitionProductOffersEligibilityDeclineReason;)Lcom/paypal/oslo/feature/bnplacquisition/domain/model/common/ApplicationDecline;"}, k = 2, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class ApplicationDeclineMapperKt {
    public static final com.paypal.oslo.feature.bnplacquisition.domain.model.common.ApplicationDecline toApplicationDecline(com.paypal.oslo.api.graphql.schema.type.BNPLAcquisitionApplicationDeclineReason bNPLAcquisitionApplicationDeclineReason) {
        com.paypal.oslo.feature.bnplacquisition.domain.model.common.DeclineReason declineReason;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(bNPLAcquisitionApplicationDeclineReason, "");
        switch (com.paypal.oslo.feature.bnplacquisition.data.mapper.ApplicationDeclineMapperKt.WhenMappings.$EnumSwitchMapping$0[bNPLAcquisitionApplicationDeclineReason.ordinal()]) {
            case 1:
                declineReason = com.paypal.oslo.feature.bnplacquisition.domain.model.common.DeclineReason.ADDRESS_NORMALIZATION_FAILURE;
                break;
            case 2:
                declineReason = com.paypal.oslo.feature.bnplacquisition.domain.model.common.DeclineReason.DOWN_PAYMENT_AUTHORIZATION_RETRIES_EXHAUSTED;
                break;
            case 3:
                declineReason = com.paypal.oslo.feature.bnplacquisition.domain.model.common.DeclineReason.FRAUD_DETECTION;
                break;
            case 4:
                declineReason = com.paypal.oslo.feature.bnplacquisition.domain.model.common.DeclineReason.INELIGIBLE_ADDRESS;
                break;
            case 5:
                declineReason = com.paypal.oslo.feature.bnplacquisition.domain.model.common.DeclineReason.KYC_THRESHOLD_REACHED;
                break;
            case 6:
                declineReason = com.paypal.oslo.feature.bnplacquisition.domain.model.common.DeclineReason.KYC_VERIFICATION_FAILURE;
                break;
            case 7:
                declineReason = com.paypal.oslo.feature.bnplacquisition.domain.model.common.DeclineReason.RISK_ASSESSMENT_FAILURE;
                break;
            case 8:
                declineReason = com.paypal.oslo.feature.bnplacquisition.domain.model.common.DeclineReason.STRONG_CUSTOMER_AUTHENTICATION_FAILURE;
                break;
            default:
                com.paypal.oslo.feature.bnplacquisition.domain.model.common.DeclineReason declineReason2 = com.paypal.oslo.feature.bnplacquisition.domain.model.common.DeclineReason.UNKNOWN;
                com.paypal.oslo.feature.bnplacquisition.logger.BnplAcqLoggerUtilsKt.logUnknownMapping(com.paypal.oslo.feature.bnplacquisition.LoggerKt.log, "BNPLAcquisitionApplicationDeclineReason: ".concat(java.lang.String.valueOf(bNPLAcquisitionApplicationDeclineReason.name())));
                declineReason = declineReason2;
                break;
        }
        return new com.paypal.oslo.feature.bnplacquisition.domain.model.common.ApplicationDecline(declineReason);
    }

    public static final com.paypal.oslo.feature.bnplacquisition.domain.model.common.ApplicationDecline toApplicationDecline(com.paypal.oslo.api.graphql.schema.type.BNPLTokenProvisionEligibilityDeclineReason bNPLTokenProvisionEligibilityDeclineReason) {
        com.paypal.oslo.feature.bnplacquisition.domain.model.common.DeclineReason declineReason;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(bNPLTokenProvisionEligibilityDeclineReason, "");
        if (com.paypal.oslo.feature.bnplacquisition.data.mapper.ApplicationDeclineMapperKt.WhenMappings.$EnumSwitchMapping$1[bNPLTokenProvisionEligibilityDeclineReason.ordinal()] == 1) {
            declineReason = com.paypal.oslo.feature.bnplacquisition.domain.model.common.DeclineReason.TOKENIZATION_DECLINE;
        } else {
            com.paypal.oslo.feature.bnplacquisition.domain.model.common.DeclineReason declineReason2 = com.paypal.oslo.feature.bnplacquisition.domain.model.common.DeclineReason.UNKNOWN;
            com.paypal.oslo.feature.bnplacquisition.logger.BnplAcqLoggerUtilsKt.logUnknownMapping(com.paypal.oslo.feature.bnplacquisition.LoggerKt.log, "BNPLTokenProvisionEligibilityDeclineReason: ".concat(java.lang.String.valueOf(bNPLTokenProvisionEligibilityDeclineReason.name())));
            declineReason = declineReason2;
        }
        return new com.paypal.oslo.feature.bnplacquisition.domain.model.common.ApplicationDecline(declineReason);
    }

    public static final com.paypal.oslo.feature.bnplacquisition.domain.model.common.ApplicationDecline toApplicationDecline(com.paypal.oslo.api.graphql.schema.type.BNPLAcquisitionProductOffersEligibilityDeclineReason bNPLAcquisitionProductOffersEligibilityDeclineReason) {
        com.paypal.oslo.feature.bnplacquisition.domain.model.common.DeclineReason declineReason;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(bNPLAcquisitionProductOffersEligibilityDeclineReason, "");
        if (com.paypal.oslo.feature.bnplacquisition.data.mapper.ApplicationDeclineMapperKt.WhenMappings.$EnumSwitchMapping$2[bNPLAcquisitionProductOffersEligibilityDeclineReason.ordinal()] == 1) {
            declineReason = com.paypal.oslo.feature.bnplacquisition.domain.model.common.DeclineReason.NO_ELIGIBLE_PRODUCT_OFFERS;
        } else {
            com.paypal.oslo.feature.bnplacquisition.domain.model.common.DeclineReason declineReason2 = com.paypal.oslo.feature.bnplacquisition.domain.model.common.DeclineReason.UNKNOWN;
            com.paypal.oslo.feature.bnplacquisition.logger.BnplAcqLoggerUtilsKt.logUnknownMapping(com.paypal.oslo.feature.bnplacquisition.LoggerKt.log, "BNPLAcquisitionProductOffersEligibilityDeclineReason: ".concat(java.lang.String.valueOf(bNPLAcquisitionProductOffersEligibilityDeclineReason.name())));
            declineReason = declineReason2;
        }
        return new com.paypal.oslo.feature.bnplacquisition.domain.model.common.ApplicationDecline(declineReason);
    }

    @kotlin.Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;
        public static final /* synthetic */ int[] $EnumSwitchMapping$1;
        public static final /* synthetic */ int[] $EnumSwitchMapping$2;

        static {
            int[] iArr = new int[com.paypal.oslo.api.graphql.schema.type.BNPLAcquisitionApplicationDeclineReason.values().length];
            try {
                iArr[com.paypal.oslo.api.graphql.schema.type.BNPLAcquisitionApplicationDeclineReason.ADDRESS_NORMALIZATION_FAILURE.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused) {
            }
            try {
                iArr[com.paypal.oslo.api.graphql.schema.type.BNPLAcquisitionApplicationDeclineReason.DOWN_PAYMENT_AUTHORIZATION_RETRIES_EXHAUSTED.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused2) {
            }
            try {
                iArr[com.paypal.oslo.api.graphql.schema.type.BNPLAcquisitionApplicationDeclineReason.FRAUD_DETECTION.ordinal()] = 3;
            } catch (java.lang.NoSuchFieldError unused3) {
            }
            try {
                iArr[com.paypal.oslo.api.graphql.schema.type.BNPLAcquisitionApplicationDeclineReason.INELIGIBLE_ADDRESS.ordinal()] = 4;
            } catch (java.lang.NoSuchFieldError unused4) {
            }
            try {
                iArr[com.paypal.oslo.api.graphql.schema.type.BNPLAcquisitionApplicationDeclineReason.KYC_THRESHOLD_REACHED.ordinal()] = 5;
            } catch (java.lang.NoSuchFieldError unused5) {
            }
            try {
                iArr[com.paypal.oslo.api.graphql.schema.type.BNPLAcquisitionApplicationDeclineReason.KYC_VERIFICATION_FAILURE.ordinal()] = 6;
            } catch (java.lang.NoSuchFieldError unused6) {
            }
            try {
                iArr[com.paypal.oslo.api.graphql.schema.type.BNPLAcquisitionApplicationDeclineReason.RISK_ASSESSMENT_FAILURE.ordinal()] = 7;
            } catch (java.lang.NoSuchFieldError unused7) {
            }
            try {
                iArr[com.paypal.oslo.api.graphql.schema.type.BNPLAcquisitionApplicationDeclineReason.STRONG_CUSTOMER_AUTHENTICATION_FAILURE.ordinal()] = 8;
            } catch (java.lang.NoSuchFieldError unused8) {
            }
            $EnumSwitchMapping$0 = iArr;
            int[] iArr2 = new int[com.paypal.oslo.api.graphql.schema.type.BNPLTokenProvisionEligibilityDeclineReason.values().length];
            try {
                iArr2[com.paypal.oslo.api.graphql.schema.type.BNPLTokenProvisionEligibilityDeclineReason.TOKENIZATION_DECLINE.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused9) {
            }
            $EnumSwitchMapping$1 = iArr2;
            int[] iArr3 = new int[com.paypal.oslo.api.graphql.schema.type.BNPLAcquisitionProductOffersEligibilityDeclineReason.values().length];
            try {
                iArr3[com.paypal.oslo.api.graphql.schema.type.BNPLAcquisitionProductOffersEligibilityDeclineReason.NO_ELIGIBLE_PRODUCT_OFFERS.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused10) {
            }
            $EnumSwitchMapping$2 = iArr3;
        }
    }
}
