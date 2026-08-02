package com.paypal.oslo.feature.subscriptions.details.ui.model;

@kotlin.Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\u001c\u0010\u0004\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\u0080@¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lcom/paypal/oslo/feature/subscriptions/details/domain/model/SubscriptionDetails;", "Lcom/paypal/oslo/feature/subscriptions/shared/domain/FormatHelper;", "formatHelper", "Lcom/paypal/oslo/feature/subscriptions/details/ui/model/SubscriptionDetailsUiModel;", "toUiModel", "(Lcom/paypal/oslo/feature/subscriptions/details/domain/model/SubscriptionDetails;Lcom/paypal/oslo/feature/subscriptions/shared/domain/FormatHelper;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;"}, k = 2, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class SubscriptionDetailsUiModelKt {
    /* JADX WARN: Removed duplicated region for block: B:15:0x003a  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final java.lang.Object toUiModel(com.paypal.oslo.feature.subscriptions.details.domain.model.SubscriptionDetails subscriptionDetails, com.paypal.oslo.feature.subscriptions.shared.domain.FormatHelper formatHelper, kotlin.coroutines.Continuation<? super com.paypal.oslo.feature.subscriptions.details.ui.model.SubscriptionDetailsUiModel> continuation) {
        com.paypal.oslo.feature.subscriptions.details.ui.model.SubscriptionDetailsUiModelKt$toUiModel$1 subscriptionDetailsUiModelKt$toUiModel$1;
        int i;
        if (continuation instanceof com.paypal.oslo.feature.subscriptions.details.ui.model.SubscriptionDetailsUiModelKt$toUiModel$1) {
            subscriptionDetailsUiModelKt$toUiModel$1 = (com.paypal.oslo.feature.subscriptions.details.ui.model.SubscriptionDetailsUiModelKt$toUiModel$1) continuation;
            if ((subscriptionDetailsUiModelKt$toUiModel$1.Camera2StreamConfigurationMap & Integer.MIN_VALUE) != 0) {
                subscriptionDetailsUiModelKt$toUiModel$1.Camera2StreamConfigurationMap -= 2147483648;
                java.lang.Object obj = subscriptionDetailsUiModelKt$toUiModel$1.getHighSpeedVideoSizes;
                java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = subscriptionDetailsUiModelKt$toUiModel$1.Camera2StreamConfigurationMap;
                if (i != 0) {
                    kotlin.ResultKt.throwOnFailure(obj);
                    com.paypal.oslo.feature.subscriptions.shared.domain.BalancePreference balancePreference = subscriptionDetails.getBalancePreference();
                    com.paypal.oslo.feature.subscriptions.shared.domain.model.FundingInstrument balanceFundingInstrument = subscriptionDetails.getBalanceFundingInstrument();
                    com.paypal.oslo.feature.subscriptions.shared.domain.model.FundingInstrument preferredFundingInstrument = subscriptionDetails.getPreferredFundingInstrument();
                    subscriptionDetailsUiModelKt$toUiModel$1.getHighResolutionOutputSizeshNQ4ISI = subscriptionDetails;
                    subscriptionDetailsUiModelKt$toUiModel$1.getHighSpeedVideoFpsRangesFor = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(formatHelper);
                    subscriptionDetailsUiModelKt$toUiModel$1.Camera2StreamConfigurationMap = 1;
                    obj = com.paypal.oslo.feature.subscriptions.shared.ui.model.FundingInstrumentMapperKt.buildFundingInstrumentUiModels(balancePreference, balanceFundingInstrument, preferredFundingInstrument, formatHelper, subscriptionDetailsUiModelKt$toUiModel$1);
                    if (obj == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else {
                    if (i != 1) {
                        throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    subscriptionDetails = (com.paypal.oslo.feature.subscriptions.details.domain.model.SubscriptionDetails) subscriptionDetailsUiModelKt$toUiModel$1.getHighResolutionOutputSizeshNQ4ISI;
                    kotlin.ResultKt.throwOnFailure(obj);
                }
                com.paypal.oslo.feature.subscriptions.shared.ui.model.FundingInstrumentMappingResult fundingInstrumentMappingResult = (com.paypal.oslo.feature.subscriptions.shared.ui.model.FundingInstrumentMappingResult) obj;
                return new com.paypal.oslo.feature.subscriptions.details.ui.model.SubscriptionDetailsUiModel(subscriptionDetails.getAgreementId(), subscriptionDetails.getMerchantName(), subscriptionDetails.getType(), subscriptionDetails.getMerchantImageUrl(), fundingInstrumentMappingResult.getInstruments(), subscriptionDetails.getMerchantContact(), subscriptionDetails.getManagementType(), subscriptionDetails.getMerchantId(), subscriptionDetails.getBalancePreference(), subscriptionDetails.getMerchantWebsiteUrl(), fundingInstrumentMappingResult.getAbsence());
            }
        }
        subscriptionDetailsUiModelKt$toUiModel$1 = new com.paypal.oslo.feature.subscriptions.details.ui.model.SubscriptionDetailsUiModelKt$toUiModel$1(continuation);
        java.lang.Object obj2 = subscriptionDetailsUiModelKt$toUiModel$1.getHighSpeedVideoSizes;
        java.lang.Object coroutine_suspended2 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = subscriptionDetailsUiModelKt$toUiModel$1.Camera2StreamConfigurationMap;
        if (i != 0) {
        }
        com.paypal.oslo.feature.subscriptions.shared.ui.model.FundingInstrumentMappingResult fundingInstrumentMappingResult2 = (com.paypal.oslo.feature.subscriptions.shared.ui.model.FundingInstrumentMappingResult) obj2;
        return new com.paypal.oslo.feature.subscriptions.details.ui.model.SubscriptionDetailsUiModel(subscriptionDetails.getAgreementId(), subscriptionDetails.getMerchantName(), subscriptionDetails.getType(), subscriptionDetails.getMerchantImageUrl(), fundingInstrumentMappingResult2.getInstruments(), subscriptionDetails.getMerchantContact(), subscriptionDetails.getManagementType(), subscriptionDetails.getMerchantId(), subscriptionDetails.getBalancePreference(), subscriptionDetails.getMerchantWebsiteUrl(), fundingInstrumentMappingResult2.getAbsence());
    }
}
