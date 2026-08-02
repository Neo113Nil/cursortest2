package com.paypal.oslo.feature.businesshome.data.mapper;

@kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\u0013\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u0000¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lcom/paypal/oslo/feature/businesshome/graphql/GetMerchantEligibilityQuery$MerchantEligibility;", "Lcom/paypal/oslo/feature/businesshome/api/domain/model/AccountSetupStatus;", "toDomain", "(Lcom/paypal/oslo/feature/businesshome/graphql/GetMerchantEligibilityQuery$MerchantEligibility;)Lcom/paypal/oslo/feature/businesshome/api/domain/model/AccountSetupStatus;"}, k = 2, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class AccountSetupMapperKt {
    public static final com.paypal.oslo.feature.businesshome.api.domain.model.AccountSetupStatus toDomain(com.paypal.oslo.feature.businesshome.graphql.GetMerchantEligibilityQuery.MerchantEligibility merchantEligibility) {
        java.util.ArrayList emptyList;
        java.util.ArrayList emptyList2;
        com.paypal.oslo.feature.businesshome.api.domain.model.AccountSetupStepType accountSetupStepType;
        com.paypal.oslo.feature.businesshome.api.domain.model.AccountSetupStepType accountSetupStepType2;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(merchantEligibility, "");
        java.util.List<com.paypal.oslo.feature.businesshome.graphql.GetMerchantEligibilityQuery.Setup> setup = merchantEligibility.getSetup();
        if (setup == null) {
            emptyList = kotlin.collections.CollectionsKt.emptyList();
        } else {
            java.util.List<com.paypal.oslo.feature.businesshome.graphql.GetMerchantEligibilityQuery.Setup> list = setup;
            java.util.ArrayList arrayList = new java.util.ArrayList(kotlin.collections.CollectionsKt.collectionSizeOrDefault(list, 10));
            for (com.paypal.oslo.feature.businesshome.graphql.GetMerchantEligibilityQuery.Setup setup2 : list) {
                int i = com.paypal.oslo.feature.businesshome.data.mapper.AccountSetupMapperKt.WhenMappings.$EnumSwitchMapping$0[setup2.getVerificationStep().ordinal()];
                if (i == 1) {
                    accountSetupStepType2 = com.paypal.oslo.feature.businesshome.api.domain.model.AccountSetupStepType.CONFIRM_EMAIL;
                } else if (i == 2) {
                    accountSetupStepType2 = com.paypal.oslo.feature.businesshome.api.domain.model.AccountSetupStepType.VERIFY_ACCOUNT;
                } else if (i == 3) {
                    accountSetupStepType2 = com.paypal.oslo.feature.businesshome.api.domain.model.AccountSetupStepType.ADD_BANK_ACCOUNT;
                } else {
                    accountSetupStepType2 = com.paypal.oslo.feature.businesshome.api.domain.model.AccountSetupStepType.UNKNOWN;
                }
                arrayList.add(new com.paypal.oslo.feature.businesshome.api.domain.model.AccountSetupStep(accountSetupStepType2, setup2.getCompleted()));
            }
            emptyList = arrayList;
        }
        java.util.List<com.paypal.oslo.feature.businesshome.graphql.GetMerchantEligibilityQuery.Recommendation> recommendations = merchantEligibility.getRecommendations();
        if (recommendations == null) {
            emptyList2 = kotlin.collections.CollectionsKt.emptyList();
        } else {
            java.util.List<com.paypal.oslo.feature.businesshome.graphql.GetMerchantEligibilityQuery.Recommendation> list2 = recommendations;
            java.util.ArrayList arrayList2 = new java.util.ArrayList(kotlin.collections.CollectionsKt.collectionSizeOrDefault(list2, 10));
            for (com.paypal.oslo.feature.businesshome.graphql.GetMerchantEligibilityQuery.Recommendation recommendation : list2) {
                if (com.paypal.oslo.feature.businesshome.data.mapper.AccountSetupMapperKt.WhenMappings.$EnumSwitchMapping$1[recommendation.getStep().ordinal()] == 1) {
                    accountSetupStepType = com.paypal.oslo.feature.businesshome.api.domain.model.AccountSetupStepType.REQUEST_DEBIT_CARD;
                } else {
                    accountSetupStepType = com.paypal.oslo.feature.businesshome.api.domain.model.AccountSetupStepType.UNKNOWN;
                }
                arrayList2.add(new com.paypal.oslo.feature.businesshome.api.domain.model.AccountSetupStep(accountSetupStepType, recommendation.getCompleted()));
            }
            emptyList2 = arrayList2;
        }
        return new com.paypal.oslo.feature.businesshome.api.domain.model.AccountSetupStatus(emptyList, emptyList2);
    }

    @kotlin.Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;
        public static final /* synthetic */ int[] $EnumSwitchMapping$1;

        static {
            int[] iArr = new int[com.paypal.oslo.api.graphql.schema.type.MerchantVerificationStep.values().length];
            try {
                iArr[com.paypal.oslo.api.graphql.schema.type.MerchantVerificationStep.EMAIL_VERIFIED.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused) {
            }
            try {
                iArr[com.paypal.oslo.api.graphql.schema.type.MerchantVerificationStep.ACCOUNT_VERIFIED.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused2) {
            }
            try {
                iArr[com.paypal.oslo.api.graphql.schema.type.MerchantVerificationStep.BANK_ACCOUNT_ADDED.ordinal()] = 3;
            } catch (java.lang.NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
            int[] iArr2 = new int[com.paypal.oslo.api.graphql.schema.type.MerchantRecommendedStep.values().length];
            try {
                iArr2[com.paypal.oslo.api.graphql.schema.type.MerchantRecommendedStep.BDMC_APPLY.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused4) {
            }
            $EnumSwitchMapping$1 = iArr2;
        }
    }
}
