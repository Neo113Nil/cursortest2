package com.paypal.oslo.feature.subscriptions.hub.ui.models;

@kotlin.Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\u001c\u0010\u0004\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\u0080@¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lcom/paypal/oslo/feature/subscriptions/hub/domain/SubscriptionItem;", "Lcom/paypal/oslo/feature/subscriptions/shared/domain/FormatHelper;", "formatHelper", "Lcom/paypal/oslo/feature/subscriptions/hub/ui/models/SubscriptionItemUiModel;", "toUiModel", "(Lcom/paypal/oslo/feature/subscriptions/hub/domain/SubscriptionItem;Lcom/paypal/oslo/feature/subscriptions/shared/domain/FormatHelper;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;"}, k = 2, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class SubscriptionItemUiModelKt {
    /* JADX WARN: Removed duplicated region for block: B:22:0x010f  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0142  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x00db  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0102  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0098  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x002b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final java.lang.Object toUiModel(com.paypal.oslo.feature.subscriptions.hub.domain.SubscriptionItem subscriptionItem, com.paypal.oslo.feature.subscriptions.shared.domain.FormatHelper formatHelper, kotlin.coroutines.Continuation<? super com.paypal.oslo.feature.subscriptions.hub.ui.models.SubscriptionItemUiModel> continuation) {
        com.paypal.oslo.feature.subscriptions.hub.ui.models.SubscriptionItemUiModelKt$toUiModel$1 subscriptionItemUiModelKt$toUiModel$1;
        int i;
        com.paypal.oslo.feature.subscriptions.api.domain.AgreementType type;
        com.paypal.oslo.feature.subscriptions.shared.domain.BalancePreference balancePreference;
        com.paypal.oslo.feature.subscriptions.api.domain.AgreementType agreementType;
        com.paypal.oslo.feature.subscriptions.shared.domain.BalancePreference balancePreference2;
        com.paypal.oslo.feature.subscriptions.hub.domain.SubscriptionItem subscriptionItem2;
        java.lang.String str;
        com.paypal.oslo.feature.subscriptions.shared.ui.model.FundingInstrumentUiModel fundingInstrumentUiModel;
        java.lang.String str2;
        com.paypal.oslo.feature.subscriptions.shared.domain.model.FundingInstrument balanceFundingInstrument;
        com.paypal.oslo.feature.subscriptions.shared.domain.BalancePreference balancePreference3;
        com.paypal.oslo.feature.subscriptions.shared.ui.model.FundingInstrumentUiModel fundingInstrumentUiModel2;
        com.paypal.oslo.feature.subscriptions.shared.ui.model.FundingInstrumentUiModel fundingInstrumentUiModel3;
        com.paypal.oslo.feature.subscriptions.shared.domain.FormatHelper formatHelper2;
        com.paypal.oslo.feature.subscriptions.shared.ui.model.FundingInstrumentUiModel fundingInstrumentUiModel4;
        com.paypal.oslo.feature.subscriptions.api.domain.AgreementType agreementType2;
        java.lang.String str3;
        com.paypal.oslo.feature.subscriptions.hub.domain.LastPaymentInformation lastPaymentInformation;
        com.paypal.oslo.feature.subscriptions.shared.ui.model.FundingInstrumentUiModel fundingInstrumentUiModel5;
        com.paypal.oslo.feature.subscriptions.shared.ui.model.FundingInstrumentUiModel fundingInstrumentUiModel6;
        com.paypal.oslo.feature.subscriptions.shared.domain.BalancePreference balancePreference4;
        com.paypal.oslo.feature.subscriptions.hub.ui.models.LastPaymentInformationUiModel lastPaymentInformationUiModel;
        java.lang.String str4;
        com.paypal.oslo.feature.subscriptions.hub.domain.Merchant merchant;
        com.paypal.oslo.feature.subscriptions.api.domain.AgreementType agreementType3;
        com.paypal.oslo.feature.subscriptions.shared.ui.model.FundingInstrumentUiModel fundingInstrumentUiModel7;
        com.paypal.oslo.feature.subscriptions.shared.domain.BalancePreference balancePreference5;
        com.paypal.oslo.feature.subscriptions.api.domain.AgreementType agreementType4;
        java.lang.String str5;
        com.paypal.oslo.feature.subscriptions.hub.domain.Merchant merchant2;
        com.paypal.oslo.feature.subscriptions.shared.domain.FormatHelper formatHelper3 = formatHelper;
        if (continuation instanceof com.paypal.oslo.feature.subscriptions.hub.ui.models.SubscriptionItemUiModelKt$toUiModel$1) {
            subscriptionItemUiModelKt$toUiModel$1 = (com.paypal.oslo.feature.subscriptions.hub.ui.models.SubscriptionItemUiModelKt$toUiModel$1) continuation;
            if ((subscriptionItemUiModelKt$toUiModel$1.getOutputFormats & Integer.MIN_VALUE) != 0) {
                subscriptionItemUiModelKt$toUiModel$1.getOutputFormats -= 2147483648;
                java.lang.Object obj = subscriptionItemUiModelKt$toUiModel$1.getOutputMinFrameDuration;
                java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = subscriptionItemUiModelKt$toUiModel$1.getOutputFormats;
                if (i != 0) {
                    kotlin.ResultKt.throwOnFailure(obj);
                    java.lang.String id = subscriptionItem.getId();
                    type = subscriptionItem.getType();
                    balancePreference = subscriptionItem.getBalancePreference();
                    com.paypal.oslo.feature.subscriptions.shared.domain.model.FundingInstrument preferredFundingInstrument = subscriptionItem.getPreferredFundingInstrument();
                    if (preferredFundingInstrument != null) {
                        subscriptionItemUiModelKt$toUiModel$1.getHighSpeedVideoFpsRanges = subscriptionItem;
                        subscriptionItemUiModelKt$toUiModel$1.getHighSpeedVideoSizes = formatHelper3;
                        subscriptionItemUiModelKt$toUiModel$1.Camera2StreamConfigurationMap = id;
                        subscriptionItemUiModelKt$toUiModel$1.getHighSpeedVideoFpsRangesFor = type;
                        subscriptionItemUiModelKt$toUiModel$1.getHighResolutionOutputSizeshNQ4ISI = balancePreference;
                        subscriptionItemUiModelKt$toUiModel$1.getOutputFormats = 1;
                        java.lang.Object uiModel = com.paypal.oslo.feature.subscriptions.shared.ui.model.FundingInstrumentMapperKt.toUiModel(preferredFundingInstrument, formatHelper3, subscriptionItemUiModelKt$toUiModel$1);
                        if (uiModel != coroutine_suspended) {
                            subscriptionItem2 = subscriptionItem;
                            str2 = id;
                            obj = uiModel;
                        }
                        return coroutine_suspended;
                    }
                    agreementType = type;
                    balancePreference2 = balancePreference;
                    subscriptionItem2 = subscriptionItem;
                    str = id;
                    fundingInstrumentUiModel = null;
                    balanceFundingInstrument = subscriptionItem2.getBalanceFundingInstrument();
                    if (balanceFundingInstrument != null) {
                        subscriptionItemUiModelKt$toUiModel$1.getHighSpeedVideoFpsRanges = subscriptionItem2;
                        subscriptionItemUiModelKt$toUiModel$1.getHighSpeedVideoSizes = formatHelper3;
                        subscriptionItemUiModelKt$toUiModel$1.Camera2StreamConfigurationMap = str;
                        subscriptionItemUiModelKt$toUiModel$1.getHighSpeedVideoFpsRangesFor = agreementType;
                        subscriptionItemUiModelKt$toUiModel$1.getHighResolutionOutputSizeshNQ4ISI = balancePreference2;
                        subscriptionItemUiModelKt$toUiModel$1.getInputFormats = fundingInstrumentUiModel;
                        subscriptionItemUiModelKt$toUiModel$1.getOutputFormats = 2;
                        java.lang.Object uiModel2 = com.paypal.oslo.feature.subscriptions.shared.ui.model.FundingInstrumentMapperKt.toUiModel(balanceFundingInstrument, formatHelper3, subscriptionItemUiModelKt$toUiModel$1);
                        if (uiModel2 != coroutine_suspended) {
                            java.lang.String str6 = str;
                            formatHelper2 = formatHelper3;
                            fundingInstrumentUiModel4 = fundingInstrumentUiModel;
                            obj = uiModel2;
                            agreementType2 = agreementType;
                            str3 = str6;
                            fundingInstrumentUiModel3 = (com.paypal.oslo.feature.subscriptions.shared.ui.model.FundingInstrumentUiModel) obj;
                            com.paypal.oslo.feature.subscriptions.shared.domain.BalancePreference balancePreference6 = balancePreference2;
                            fundingInstrumentUiModel2 = fundingInstrumentUiModel4;
                            formatHelper3 = formatHelper2;
                            str = str3;
                            agreementType = agreementType2;
                            balancePreference3 = balancePreference6;
                            com.paypal.oslo.feature.subscriptions.hub.domain.Merchant merchant3 = subscriptionItem2.getMerchant();
                            lastPaymentInformation = subscriptionItem2.getLastPaymentInformation();
                            if (lastPaymentInformation == null) {
                            }
                        }
                        return coroutine_suspended;
                    }
                    balancePreference3 = balancePreference2;
                    fundingInstrumentUiModel2 = fundingInstrumentUiModel;
                    fundingInstrumentUiModel3 = null;
                    com.paypal.oslo.feature.subscriptions.hub.domain.Merchant merchant32 = subscriptionItem2.getMerchant();
                    lastPaymentInformation = subscriptionItem2.getLastPaymentInformation();
                    if (lastPaymentInformation == null) {
                    }
                } else {
                    if (i != 1) {
                        if (i != 2) {
                            if (i != 3) {
                                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                            merchant2 = (com.paypal.oslo.feature.subscriptions.hub.domain.Merchant) subscriptionItemUiModelKt$toUiModel$1.getHighSpeedVideoSizesFor;
                            fundingInstrumentUiModel7 = (com.paypal.oslo.feature.subscriptions.shared.ui.model.FundingInstrumentUiModel) subscriptionItemUiModelKt$toUiModel$1.getInputSizeshNQ4ISI;
                            fundingInstrumentUiModel2 = (com.paypal.oslo.feature.subscriptions.shared.ui.model.FundingInstrumentUiModel) subscriptionItemUiModelKt$toUiModel$1.getInputFormats;
                            balancePreference5 = (com.paypal.oslo.feature.subscriptions.shared.domain.BalancePreference) subscriptionItemUiModelKt$toUiModel$1.getHighResolutionOutputSizeshNQ4ISI;
                            agreementType4 = (com.paypal.oslo.feature.subscriptions.api.domain.AgreementType) subscriptionItemUiModelKt$toUiModel$1.getHighSpeedVideoFpsRangesFor;
                            str5 = (java.lang.String) subscriptionItemUiModelKt$toUiModel$1.Camera2StreamConfigurationMap;
                            kotlin.ResultKt.throwOnFailure(obj);
                            merchant = merchant2;
                            fundingInstrumentUiModel5 = fundingInstrumentUiModel7;
                            fundingInstrumentUiModel6 = fundingInstrumentUiModel2;
                            balancePreference4 = balancePreference5;
                            agreementType3 = agreementType4;
                            str4 = str5;
                            lastPaymentInformationUiModel = (com.paypal.oslo.feature.subscriptions.hub.ui.models.LastPaymentInformationUiModel) obj;
                            return new com.paypal.oslo.feature.subscriptions.hub.ui.models.SubscriptionItemUiModel(str4, agreementType3, balancePreference4, fundingInstrumentUiModel6, fundingInstrumentUiModel5, merchant, lastPaymentInformationUiModel);
                        }
                        fundingInstrumentUiModel4 = (com.paypal.oslo.feature.subscriptions.shared.ui.model.FundingInstrumentUiModel) subscriptionItemUiModelKt$toUiModel$1.getInputFormats;
                        balancePreference2 = (com.paypal.oslo.feature.subscriptions.shared.domain.BalancePreference) subscriptionItemUiModelKt$toUiModel$1.getHighResolutionOutputSizeshNQ4ISI;
                        agreementType2 = (com.paypal.oslo.feature.subscriptions.api.domain.AgreementType) subscriptionItemUiModelKt$toUiModel$1.getHighSpeedVideoFpsRangesFor;
                        str3 = (java.lang.String) subscriptionItemUiModelKt$toUiModel$1.Camera2StreamConfigurationMap;
                        formatHelper2 = (com.paypal.oslo.feature.subscriptions.shared.domain.FormatHelper) subscriptionItemUiModelKt$toUiModel$1.getHighSpeedVideoSizes;
                        subscriptionItem2 = (com.paypal.oslo.feature.subscriptions.hub.domain.SubscriptionItem) subscriptionItemUiModelKt$toUiModel$1.getHighSpeedVideoFpsRanges;
                        kotlin.ResultKt.throwOnFailure(obj);
                        fundingInstrumentUiModel3 = (com.paypal.oslo.feature.subscriptions.shared.ui.model.FundingInstrumentUiModel) obj;
                        com.paypal.oslo.feature.subscriptions.shared.domain.BalancePreference balancePreference62 = balancePreference2;
                        fundingInstrumentUiModel2 = fundingInstrumentUiModel4;
                        formatHelper3 = formatHelper2;
                        str = str3;
                        agreementType = agreementType2;
                        balancePreference3 = balancePreference62;
                        com.paypal.oslo.feature.subscriptions.hub.domain.Merchant merchant322 = subscriptionItem2.getMerchant();
                        lastPaymentInformation = subscriptionItem2.getLastPaymentInformation();
                        if (lastPaymentInformation == null) {
                            fundingInstrumentUiModel5 = fundingInstrumentUiModel3;
                            fundingInstrumentUiModel6 = fundingInstrumentUiModel2;
                            balancePreference4 = balancePreference3;
                            lastPaymentInformationUiModel = null;
                            str4 = str;
                            merchant = merchant322;
                            agreementType3 = agreementType;
                            return new com.paypal.oslo.feature.subscriptions.hub.ui.models.SubscriptionItemUiModel(str4, agreementType3, balancePreference4, fundingInstrumentUiModel6, fundingInstrumentUiModel5, merchant, lastPaymentInformationUiModel);
                        }
                        subscriptionItemUiModelKt$toUiModel$1.getHighSpeedVideoFpsRanges = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(subscriptionItem2);
                        subscriptionItemUiModelKt$toUiModel$1.getHighSpeedVideoSizes = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(formatHelper3);
                        subscriptionItemUiModelKt$toUiModel$1.Camera2StreamConfigurationMap = str;
                        subscriptionItemUiModelKt$toUiModel$1.getHighSpeedVideoFpsRangesFor = agreementType;
                        subscriptionItemUiModelKt$toUiModel$1.getHighResolutionOutputSizeshNQ4ISI = balancePreference3;
                        subscriptionItemUiModelKt$toUiModel$1.getInputFormats = fundingInstrumentUiModel2;
                        subscriptionItemUiModelKt$toUiModel$1.getInputSizeshNQ4ISI = fundingInstrumentUiModel3;
                        subscriptionItemUiModelKt$toUiModel$1.getHighSpeedVideoSizesFor = merchant322;
                        subscriptionItemUiModelKt$toUiModel$1.getOutputFormats = 3;
                        java.lang.Object uiModel3 = com.paypal.oslo.feature.subscriptions.hub.ui.models.LastPaymentInformationUiModelKt.toUiModel(lastPaymentInformation, formatHelper3, subscriptionItemUiModelKt$toUiModel$1);
                        if (uiModel3 != coroutine_suspended) {
                            fundingInstrumentUiModel7 = fundingInstrumentUiModel3;
                            balancePreference5 = balancePreference3;
                            agreementType4 = agreementType;
                            str5 = str;
                            obj = uiModel3;
                            merchant2 = merchant322;
                            merchant = merchant2;
                            fundingInstrumentUiModel5 = fundingInstrumentUiModel7;
                            fundingInstrumentUiModel6 = fundingInstrumentUiModel2;
                            balancePreference4 = balancePreference5;
                            agreementType3 = agreementType4;
                            str4 = str5;
                            lastPaymentInformationUiModel = (com.paypal.oslo.feature.subscriptions.hub.ui.models.LastPaymentInformationUiModel) obj;
                            return new com.paypal.oslo.feature.subscriptions.hub.ui.models.SubscriptionItemUiModel(str4, agreementType3, balancePreference4, fundingInstrumentUiModel6, fundingInstrumentUiModel5, merchant, lastPaymentInformationUiModel);
                        }
                        return coroutine_suspended;
                    }
                    com.paypal.oslo.feature.subscriptions.shared.domain.BalancePreference balancePreference7 = (com.paypal.oslo.feature.subscriptions.shared.domain.BalancePreference) subscriptionItemUiModelKt$toUiModel$1.getHighResolutionOutputSizeshNQ4ISI;
                    type = (com.paypal.oslo.feature.subscriptions.api.domain.AgreementType) subscriptionItemUiModelKt$toUiModel$1.getHighSpeedVideoFpsRangesFor;
                    str2 = (java.lang.String) subscriptionItemUiModelKt$toUiModel$1.Camera2StreamConfigurationMap;
                    com.paypal.oslo.feature.subscriptions.shared.domain.FormatHelper formatHelper4 = (com.paypal.oslo.feature.subscriptions.shared.domain.FormatHelper) subscriptionItemUiModelKt$toUiModel$1.getHighSpeedVideoSizes;
                    subscriptionItem2 = (com.paypal.oslo.feature.subscriptions.hub.domain.SubscriptionItem) subscriptionItemUiModelKt$toUiModel$1.getHighSpeedVideoFpsRanges;
                    kotlin.ResultKt.throwOnFailure(obj);
                    balancePreference = balancePreference7;
                    formatHelper3 = formatHelper4;
                }
                fundingInstrumentUiModel = (com.paypal.oslo.feature.subscriptions.shared.ui.model.FundingInstrumentUiModel) obj;
                java.lang.String str7 = str2;
                agreementType = type;
                balancePreference2 = balancePreference;
                str = str7;
                balanceFundingInstrument = subscriptionItem2.getBalanceFundingInstrument();
                if (balanceFundingInstrument != null) {
                }
            }
        }
        subscriptionItemUiModelKt$toUiModel$1 = new com.paypal.oslo.feature.subscriptions.hub.ui.models.SubscriptionItemUiModelKt$toUiModel$1(continuation);
        java.lang.Object obj2 = subscriptionItemUiModelKt$toUiModel$1.getOutputMinFrameDuration;
        java.lang.Object coroutine_suspended2 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = subscriptionItemUiModelKt$toUiModel$1.getOutputFormats;
        if (i != 0) {
        }
        fundingInstrumentUiModel = (com.paypal.oslo.feature.subscriptions.shared.ui.model.FundingInstrumentUiModel) obj2;
        java.lang.String str72 = str2;
        agreementType = type;
        balancePreference2 = balancePreference;
        str = str72;
        balanceFundingInstrument = subscriptionItem2.getBalanceFundingInstrument();
        if (balanceFundingInstrument != null) {
        }
    }
}
