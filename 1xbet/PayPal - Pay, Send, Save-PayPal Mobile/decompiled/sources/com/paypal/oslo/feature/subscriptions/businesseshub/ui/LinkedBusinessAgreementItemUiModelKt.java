package com.paypal.oslo.feature.subscriptions.businesseshub.ui;

@kotlin.Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\u001c\u0010\u0004\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\u0080@¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lcom/paypal/oslo/feature/subscriptions/businesseshub/domain/LinkedBusinessAgreementItem;", "Lcom/paypal/oslo/feature/subscriptions/shared/domain/FormatHelper;", "formatHelper", "Lcom/paypal/oslo/feature/subscriptions/businesseshub/ui/LinkedBusinessAgreementItemUiModel;", "toUiModel", "(Lcom/paypal/oslo/feature/subscriptions/businesseshub/domain/LinkedBusinessAgreementItem;Lcom/paypal/oslo/feature/subscriptions/shared/domain/FormatHelper;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;"}, k = 2, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class LinkedBusinessAgreementItemUiModelKt {
    /* JADX WARN: Removed duplicated region for block: B:21:0x00ad  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x00db  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x006e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0026  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final java.lang.Object toUiModel(com.paypal.oslo.feature.subscriptions.businesseshub.domain.LinkedBusinessAgreementItem linkedBusinessAgreementItem, com.paypal.oslo.feature.subscriptions.shared.domain.FormatHelper formatHelper, kotlin.coroutines.Continuation<? super com.paypal.oslo.feature.subscriptions.businesseshub.ui.LinkedBusinessAgreementItemUiModel> continuation) {
        com.paypal.oslo.feature.subscriptions.businesseshub.ui.LinkedBusinessAgreementItemUiModelKt$toUiModel$1 linkedBusinessAgreementItemUiModelKt$toUiModel$1;
        int i;
        java.lang.String merchantId;
        java.lang.String agreementName;
        java.lang.String str;
        java.lang.String str2;
        com.paypal.oslo.feature.subscriptions.shared.ui.model.FundingInstrumentUiModel fundingInstrumentUiModel;
        com.paypal.oslo.feature.subscriptions.shared.domain.FormatHelper formatHelper2;
        java.lang.String str3;
        com.paypal.oslo.feature.subscriptions.shared.domain.model.FundingInstrument balanceFundingInstrument;
        com.paypal.oslo.feature.subscriptions.shared.ui.model.FundingInstrumentUiModel fundingInstrumentUiModel2;
        java.lang.String str4;
        java.lang.String str5;
        com.paypal.oslo.feature.subscriptions.shared.ui.model.FundingInstrumentUiModel fundingInstrumentUiModel3;
        com.paypal.oslo.feature.subscriptions.shared.domain.BalancePreference balancePreference;
        java.lang.String str6;
        com.paypal.oslo.feature.subscriptions.businesseshub.domain.LinkedBusinessAgreementItem linkedBusinessAgreementItem2;
        java.lang.String str7;
        java.lang.String str8;
        com.paypal.oslo.feature.subscriptions.shared.domain.BalancePreference balancePreference2;
        com.paypal.oslo.feature.subscriptions.shared.ui.model.FundingInstrumentUiModel fundingInstrumentUiModel4;
        if (continuation instanceof com.paypal.oslo.feature.subscriptions.businesseshub.ui.LinkedBusinessAgreementItemUiModelKt$toUiModel$1) {
            linkedBusinessAgreementItemUiModelKt$toUiModel$1 = (com.paypal.oslo.feature.subscriptions.businesseshub.ui.LinkedBusinessAgreementItemUiModelKt$toUiModel$1) continuation;
            if ((linkedBusinessAgreementItemUiModelKt$toUiModel$1.getHighSpeedVideoSizesFor & Integer.MIN_VALUE) != 0) {
                linkedBusinessAgreementItemUiModelKt$toUiModel$1.getHighSpeedVideoSizesFor -= 2147483648;
                java.lang.Object obj = linkedBusinessAgreementItemUiModelKt$toUiModel$1.getInputFormats;
                java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = linkedBusinessAgreementItemUiModelKt$toUiModel$1.getHighSpeedVideoSizesFor;
                if (i != 0) {
                    kotlin.ResultKt.throwOnFailure(obj);
                    merchantId = linkedBusinessAgreementItem.getMerchantId();
                    java.lang.String agreementId = linkedBusinessAgreementItem.getAgreementId();
                    agreementName = linkedBusinessAgreementItem.getAgreementName();
                    com.paypal.oslo.feature.subscriptions.shared.domain.model.FundingInstrument preferredFundingInstrument = linkedBusinessAgreementItem.getPreferredFundingInstrument();
                    if (preferredFundingInstrument != null) {
                        linkedBusinessAgreementItemUiModelKt$toUiModel$1.Camera2StreamConfigurationMap = linkedBusinessAgreementItem;
                        linkedBusinessAgreementItemUiModelKt$toUiModel$1.getHighSpeedVideoSizes = formatHelper;
                        linkedBusinessAgreementItemUiModelKt$toUiModel$1.getHighSpeedVideoFpsRangesFor = merchantId;
                        linkedBusinessAgreementItemUiModelKt$toUiModel$1.getHighSpeedVideoFpsRanges = agreementId;
                        linkedBusinessAgreementItemUiModelKt$toUiModel$1.getHighResolutionOutputSizeshNQ4ISI = agreementName;
                        linkedBusinessAgreementItemUiModelKt$toUiModel$1.getHighSpeedVideoSizesFor = 1;
                        java.lang.Object uiModel = com.paypal.oslo.feature.subscriptions.shared.ui.model.FundingInstrumentMapperKt.toUiModel(preferredFundingInstrument, formatHelper, linkedBusinessAgreementItemUiModelKt$toUiModel$1);
                        if (uiModel != coroutine_suspended) {
                            formatHelper2 = formatHelper;
                            str3 = agreementId;
                            obj = uiModel;
                        }
                        return coroutine_suspended;
                    }
                    str = merchantId;
                    str2 = agreementId;
                    fundingInstrumentUiModel = null;
                    com.paypal.oslo.feature.subscriptions.shared.domain.BalancePreference balancePreference3 = linkedBusinessAgreementItem.getBalancePreference();
                    balanceFundingInstrument = linkedBusinessAgreementItem.getBalanceFundingInstrument();
                    if (balanceFundingInstrument == null) {
                        fundingInstrumentUiModel2 = fundingInstrumentUiModel;
                        str4 = str2;
                        str5 = agreementName;
                        java.lang.String str9 = str;
                        fundingInstrumentUiModel3 = null;
                        balancePreference = balancePreference3;
                        str6 = str9;
                        return new com.paypal.oslo.feature.subscriptions.businesseshub.ui.LinkedBusinessAgreementItemUiModel(str4, str5, fundingInstrumentUiModel2, balancePreference, fundingInstrumentUiModel3, linkedBusinessAgreementItem.getAgreementImageUrl(), str6);
                    }
                    linkedBusinessAgreementItemUiModelKt$toUiModel$1.Camera2StreamConfigurationMap = linkedBusinessAgreementItem;
                    linkedBusinessAgreementItemUiModelKt$toUiModel$1.getHighSpeedVideoSizes = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(formatHelper);
                    linkedBusinessAgreementItemUiModelKt$toUiModel$1.getHighSpeedVideoFpsRangesFor = str;
                    linkedBusinessAgreementItemUiModelKt$toUiModel$1.getHighSpeedVideoFpsRanges = str2;
                    linkedBusinessAgreementItemUiModelKt$toUiModel$1.getHighResolutionOutputSizeshNQ4ISI = agreementName;
                    linkedBusinessAgreementItemUiModelKt$toUiModel$1.getInputSizeshNQ4ISI = fundingInstrumentUiModel;
                    linkedBusinessAgreementItemUiModelKt$toUiModel$1.getOutputMinFrameDuration = balancePreference3;
                    linkedBusinessAgreementItemUiModelKt$toUiModel$1.getHighSpeedVideoSizesFor = 2;
                    java.lang.Object uiModel2 = com.paypal.oslo.feature.subscriptions.shared.ui.model.FundingInstrumentMapperKt.toUiModel(balanceFundingInstrument, formatHelper, linkedBusinessAgreementItemUiModelKt$toUiModel$1);
                    if (uiModel2 != coroutine_suspended) {
                        linkedBusinessAgreementItem2 = linkedBusinessAgreementItem;
                        str7 = str;
                        str8 = agreementName;
                        balancePreference2 = balancePreference3;
                        com.paypal.oslo.feature.subscriptions.shared.ui.model.FundingInstrumentUiModel fundingInstrumentUiModel5 = fundingInstrumentUiModel;
                        obj = uiModel2;
                        fundingInstrumentUiModel4 = fundingInstrumentUiModel5;
                        str6 = str7;
                        fundingInstrumentUiModel3 = (com.paypal.oslo.feature.subscriptions.shared.ui.model.FundingInstrumentUiModel) obj;
                        balancePreference = balancePreference2;
                        fundingInstrumentUiModel2 = fundingInstrumentUiModel4;
                        linkedBusinessAgreementItem = linkedBusinessAgreementItem2;
                        java.lang.String str10 = str2;
                        str5 = str8;
                        str4 = str10;
                        return new com.paypal.oslo.feature.subscriptions.businesseshub.ui.LinkedBusinessAgreementItemUiModel(str4, str5, fundingInstrumentUiModel2, balancePreference, fundingInstrumentUiModel3, linkedBusinessAgreementItem.getAgreementImageUrl(), str6);
                    }
                    return coroutine_suspended;
                }
                if (i != 1) {
                    if (i != 2) {
                        throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    balancePreference2 = (com.paypal.oslo.feature.subscriptions.shared.domain.BalancePreference) linkedBusinessAgreementItemUiModelKt$toUiModel$1.getOutputMinFrameDuration;
                    fundingInstrumentUiModel4 = (com.paypal.oslo.feature.subscriptions.shared.ui.model.FundingInstrumentUiModel) linkedBusinessAgreementItemUiModelKt$toUiModel$1.getInputSizeshNQ4ISI;
                    str8 = (java.lang.String) linkedBusinessAgreementItemUiModelKt$toUiModel$1.getHighResolutionOutputSizeshNQ4ISI;
                    str2 = (java.lang.String) linkedBusinessAgreementItemUiModelKt$toUiModel$1.getHighSpeedVideoFpsRanges;
                    str7 = (java.lang.String) linkedBusinessAgreementItemUiModelKt$toUiModel$1.getHighSpeedVideoFpsRangesFor;
                    linkedBusinessAgreementItem2 = (com.paypal.oslo.feature.subscriptions.businesseshub.domain.LinkedBusinessAgreementItem) linkedBusinessAgreementItemUiModelKt$toUiModel$1.Camera2StreamConfigurationMap;
                    kotlin.ResultKt.throwOnFailure(obj);
                    str6 = str7;
                    fundingInstrumentUiModel3 = (com.paypal.oslo.feature.subscriptions.shared.ui.model.FundingInstrumentUiModel) obj;
                    balancePreference = balancePreference2;
                    fundingInstrumentUiModel2 = fundingInstrumentUiModel4;
                    linkedBusinessAgreementItem = linkedBusinessAgreementItem2;
                    java.lang.String str102 = str2;
                    str5 = str8;
                    str4 = str102;
                    return new com.paypal.oslo.feature.subscriptions.businesseshub.ui.LinkedBusinessAgreementItemUiModel(str4, str5, fundingInstrumentUiModel2, balancePreference, fundingInstrumentUiModel3, linkedBusinessAgreementItem.getAgreementImageUrl(), str6);
                }
                java.lang.String str11 = (java.lang.String) linkedBusinessAgreementItemUiModelKt$toUiModel$1.getHighResolutionOutputSizeshNQ4ISI;
                str3 = (java.lang.String) linkedBusinessAgreementItemUiModelKt$toUiModel$1.getHighSpeedVideoFpsRanges;
                merchantId = (java.lang.String) linkedBusinessAgreementItemUiModelKt$toUiModel$1.getHighSpeedVideoFpsRangesFor;
                formatHelper2 = (com.paypal.oslo.feature.subscriptions.shared.domain.FormatHelper) linkedBusinessAgreementItemUiModelKt$toUiModel$1.getHighSpeedVideoSizes;
                com.paypal.oslo.feature.subscriptions.businesseshub.domain.LinkedBusinessAgreementItem linkedBusinessAgreementItem3 = (com.paypal.oslo.feature.subscriptions.businesseshub.domain.LinkedBusinessAgreementItem) linkedBusinessAgreementItemUiModelKt$toUiModel$1.Camera2StreamConfigurationMap;
                kotlin.ResultKt.throwOnFailure(obj);
                agreementName = str11;
                linkedBusinessAgreementItem = linkedBusinessAgreementItem3;
                fundingInstrumentUiModel = (com.paypal.oslo.feature.subscriptions.shared.ui.model.FundingInstrumentUiModel) obj;
                java.lang.String str12 = merchantId;
                str2 = str3;
                formatHelper = formatHelper2;
                str = str12;
                com.paypal.oslo.feature.subscriptions.shared.domain.BalancePreference balancePreference32 = linkedBusinessAgreementItem.getBalancePreference();
                balanceFundingInstrument = linkedBusinessAgreementItem.getBalanceFundingInstrument();
                if (balanceFundingInstrument == null) {
                }
            }
        }
        linkedBusinessAgreementItemUiModelKt$toUiModel$1 = new com.paypal.oslo.feature.subscriptions.businesseshub.ui.LinkedBusinessAgreementItemUiModelKt$toUiModel$1(continuation);
        java.lang.Object obj2 = linkedBusinessAgreementItemUiModelKt$toUiModel$1.getInputFormats;
        java.lang.Object coroutine_suspended2 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = linkedBusinessAgreementItemUiModelKt$toUiModel$1.getHighSpeedVideoSizesFor;
        if (i != 0) {
        }
        fundingInstrumentUiModel = (com.paypal.oslo.feature.subscriptions.shared.ui.model.FundingInstrumentUiModel) obj2;
        java.lang.String str122 = merchantId;
        str2 = str3;
        formatHelper = formatHelper2;
        str = str122;
        com.paypal.oslo.feature.subscriptions.shared.domain.BalancePreference balancePreference322 = linkedBusinessAgreementItem.getBalancePreference();
        balanceFundingInstrument = linkedBusinessAgreementItem.getBalanceFundingInstrument();
        if (balanceFundingInstrument == null) {
        }
    }
}
