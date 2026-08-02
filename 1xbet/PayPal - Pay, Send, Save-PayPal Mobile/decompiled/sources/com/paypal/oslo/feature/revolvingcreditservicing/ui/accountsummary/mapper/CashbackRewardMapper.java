package com.paypal.oslo.feature.revolvingcreditservicing.ui.accountsummary.mapper;

@kotlin.Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u0001B\u0011\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\"\u0010\u000b\u001a\u00020\n2\b\u0010\u0007\u001a\u0004\u0018\u00010\u00062\u0006\u0010\t\u001a\u00020\bH\u0086@¢\u0006\u0004\b\u000b\u0010\fR\u0014\u0010\r\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u000e"}, d2 = {"Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/accountsummary/mapper/CashbackRewardMapper;", "", "Lcom/paypal/oslo/feature/revolvingcreditservicing/domain/formatter/currency/CurrencyFormatterFacade;", "currencyFormatterFacade", "<init>", "(Lcom/paypal/oslo/feature/revolvingcreditservicing/domain/formatter/currency/CurrencyFormatterFacade;)V", "Lcom/paypal/oslo/feature/revolvingcreditservicing/domain/model/accountsummary/RewardsSummary;", "rewardsSummary", "Lcom/paypal/oslo/feature/revolvingcreditservicing/api/model/CreditProductIdentifier;", "creditProductIdentifier", "Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/accountsummary/uimodel/CashbackRewardUiModel;", "mapToCashbackRewardUiModel", "(Lcom/paypal/oslo/feature/revolvingcreditservicing/domain/model/accountsummary/RewardsSummary;Lcom/paypal/oslo/feature/revolvingcreditservicing/api/model/CreditProductIdentifier;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Camera2StreamConfigurationMap", "Lcom/paypal/oslo/feature/revolvingcreditservicing/domain/formatter/currency/CurrencyFormatterFacade;"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class CashbackRewardMapper {
    public static final int $stable = 8;
    private final com.paypal.oslo.feature.revolvingcreditservicing.domain.formatter.currency.CurrencyFormatterFacade Camera2StreamConfigurationMap;

    @javax.inject.Inject
    public CashbackRewardMapper(com.paypal.oslo.feature.revolvingcreditservicing.domain.formatter.currency.CurrencyFormatterFacade currencyFormatterFacade) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(currencyFormatterFacade, "");
        this.Camera2StreamConfigurationMap = currencyFormatterFacade;
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x012c  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x013a  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0140  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x013d  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0131  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x00f3  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0125  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00f8  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00bc  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00e7  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00c2  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0073  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x002d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object mapToCashbackRewardUiModel(com.paypal.oslo.feature.revolvingcreditservicing.domain.model.accountsummary.RewardsSummary rewardsSummary, com.paypal.oslo.feature.revolvingcreditservicing.api.model.CreditProductIdentifier creditProductIdentifier, kotlin.coroutines.Continuation<? super com.paypal.oslo.feature.revolvingcreditservicing.ui.accountsummary.uimodel.CashbackRewardUiModel> continuation) {
        com.paypal.oslo.feature.revolvingcreditservicing.ui.accountsummary.mapper.CashbackRewardMapper$mapToCashbackRewardUiModel$1 cashbackRewardMapper$mapToCashbackRewardUiModel$1;
        java.lang.Object coroutine_suspended;
        int i;
        java.lang.Object obj;
        com.paypal.oslo.feature.revolvingcreditservicing.api.model.CreditProductIdentifier creditProductIdentifier2;
        java.lang.Object format$default;
        com.paypal.oslo.feature.revolvingcreditservicing.domain.model.accountsummary.RewardsSummary rewardsSummary2;
        com.paypal.oslo.feature.revolvingcreditservicing.ui.common.components.UiString uiString;
        com.paypal.oslo.feature.revolvingcreditservicing.api.model.CreditProductIdentifier creditProductIdentifier3;
        java.lang.Object format$default2;
        com.paypal.oslo.feature.revolvingcreditservicing.ui.common.components.UiString uiString2;
        com.paypal.oslo.feature.revolvingcreditservicing.ui.common.components.UiString uiString3;
        com.paypal.oslo.feature.revolvingcreditservicing.domain.model.accountsummary.RewardsSummary rewardsSummary3 = rewardsSummary;
        if (continuation instanceof com.paypal.oslo.feature.revolvingcreditservicing.ui.accountsummary.mapper.CashbackRewardMapper$mapToCashbackRewardUiModel$1) {
            cashbackRewardMapper$mapToCashbackRewardUiModel$1 = (com.paypal.oslo.feature.revolvingcreditservicing.ui.accountsummary.mapper.CashbackRewardMapper$mapToCashbackRewardUiModel$1) continuation;
            if ((cashbackRewardMapper$mapToCashbackRewardUiModel$1.Camera2StreamConfigurationMap & Integer.MIN_VALUE) != 0) {
                cashbackRewardMapper$mapToCashbackRewardUiModel$1.Camera2StreamConfigurationMap -= 2147483648;
                java.lang.Object obj2 = cashbackRewardMapper$mapToCashbackRewardUiModel$1.getOutputFormats;
                coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = cashbackRewardMapper$mapToCashbackRewardUiModel$1.Camera2StreamConfigurationMap;
                if (i != 0) {
                    kotlin.ResultKt.throwOnFailure(obj2);
                    if (!com.paypal.oslo.feature.revolvingcreditservicing.api.model.CreditProductIdentifierExtensionsKt.isCBMC(creditProductIdentifier) || (rewardsSummary3 != null && !rewardsSummary.getShouldShowCashback())) {
                        return new com.paypal.oslo.feature.revolvingcreditservicing.ui.accountsummary.uimodel.CashbackRewardUiModel(null, null, null, false);
                    }
                    if (rewardsSummary3 == null) {
                        return new com.paypal.oslo.feature.revolvingcreditservicing.ui.accountsummary.uimodel.CashbackRewardUiModel(null, null, new com.paypal.oslo.feature.revolvingcreditservicing.ui.common.components.UiString.StringResOnly(com.paypal.oslo.feature.revolvingcreditservicing.R.string.feature_revolvingcredit_servicing_account_summary_rewards_error, (com.paypal.oslo.feature.revolvingcreditservicing.api.model.CreditProductIdentifier) null, false, 6, (kotlin.jvm.internal.DefaultConstructorMarker) null), true);
                    }
                    com.paypal.oslo.feature.revolvingcreditservicing.domain.formatter.currency.CurrencyFormatterFacade currencyFormatterFacade = this.Camera2StreamConfigurationMap;
                    com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.core.CurrencyAmount currentBalanceAmount = rewardsSummary.getCurrentBalanceAmount();
                    cashbackRewardMapper$mapToCashbackRewardUiModel$1.getHighSpeedVideoFpsRanges = rewardsSummary3;
                    cashbackRewardMapper$mapToCashbackRewardUiModel$1.getHighResolutionOutputSizeshNQ4ISI = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(creditProductIdentifier);
                    cashbackRewardMapper$mapToCashbackRewardUiModel$1.Camera2StreamConfigurationMap = 1;
                    java.lang.Object format$default3 = com.paypal.oslo.feature.revolvingcreditservicing.domain.formatter.currency.CurrencyFormatterFacade.format$default(currencyFormatterFacade, currentBalanceAmount, null, 0, cashbackRewardMapper$mapToCashbackRewardUiModel$1, 6, null);
                    if (format$default3 != coroutine_suspended) {
                        obj = format$default3;
                        creditProductIdentifier2 = creditProductIdentifier;
                    }
                    return coroutine_suspended;
                }
                if (i != 1) {
                    if (i != 2) {
                        if (i != 3) {
                            throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        uiString3 = (com.paypal.oslo.feature.revolvingcreditservicing.ui.common.components.UiString.PlainString) cashbackRewardMapper$mapToCashbackRewardUiModel$1.getHighSpeedVideoSizes;
                        uiString2 = (com.paypal.oslo.feature.revolvingcreditservicing.ui.common.components.UiString.PlainString) cashbackRewardMapper$mapToCashbackRewardUiModel$1.getHighSpeedVideoFpsRangesFor;
                        kotlin.ResultKt.throwOnFailure(obj2);
                        java.lang.String str = (java.lang.String) obj2;
                        com.paypal.oslo.feature.revolvingcreditservicing.ui.common.components.UiString orEmpty = com.paypal.oslo.feature.revolvingcreditservicing.ui.common.components.UiStringKt.orEmpty(str == null ? com.paypal.oslo.feature.revolvingcreditservicing.ui.common.components.UiStringKt.toUiString(str) : null);
                        com.paypal.oslo.feature.revolvingcreditservicing.ui.common.components.UiString uiString4 = uiString2 == null ? uiString2 : orEmpty;
                        if (uiString3 != null) {
                            orEmpty = uiString3;
                        }
                        return new com.paypal.oslo.feature.revolvingcreditservicing.ui.accountsummary.uimodel.CashbackRewardUiModel(uiString4, orEmpty, null, true);
                    }
                    uiString = (com.paypal.oslo.feature.revolvingcreditservicing.ui.common.components.UiString.PlainString) cashbackRewardMapper$mapToCashbackRewardUiModel$1.getHighSpeedVideoFpsRangesFor;
                    creditProductIdentifier3 = (com.paypal.oslo.feature.revolvingcreditservicing.api.model.CreditProductIdentifier) cashbackRewardMapper$mapToCashbackRewardUiModel$1.getHighResolutionOutputSizeshNQ4ISI;
                    rewardsSummary2 = (com.paypal.oslo.feature.revolvingcreditservicing.domain.model.accountsummary.RewardsSummary) cashbackRewardMapper$mapToCashbackRewardUiModel$1.getHighSpeedVideoFpsRanges;
                    kotlin.ResultKt.throwOnFailure(obj2);
                    java.lang.String str2 = (java.lang.String) obj2;
                    com.paypal.oslo.feature.revolvingcreditservicing.ui.common.components.UiString uiString5 = str2 == null ? com.paypal.oslo.feature.revolvingcreditservicing.ui.common.components.UiStringKt.toUiString(str2) : null;
                    com.paypal.oslo.feature.revolvingcreditservicing.domain.formatter.currency.CurrencyFormatterFacade currencyFormatterFacade2 = this.Camera2StreamConfigurationMap;
                    com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.core.CurrencyAmount zero_usd = com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.core.CurrencyAmount.INSTANCE.getZERO_USD();
                    cashbackRewardMapper$mapToCashbackRewardUiModel$1.getHighSpeedVideoFpsRanges = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(rewardsSummary2);
                    cashbackRewardMapper$mapToCashbackRewardUiModel$1.getHighResolutionOutputSizeshNQ4ISI = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(creditProductIdentifier3);
                    cashbackRewardMapper$mapToCashbackRewardUiModel$1.getHighSpeedVideoFpsRangesFor = uiString;
                    cashbackRewardMapper$mapToCashbackRewardUiModel$1.getHighSpeedVideoSizes = uiString5;
                    cashbackRewardMapper$mapToCashbackRewardUiModel$1.Camera2StreamConfigurationMap = 3;
                    format$default2 = com.paypal.oslo.feature.revolvingcreditservicing.domain.formatter.currency.CurrencyFormatterFacade.format$default(currencyFormatterFacade2, zero_usd, null, 0, cashbackRewardMapper$mapToCashbackRewardUiModel$1, 6, null);
                    if (format$default2 != coroutine_suspended) {
                        uiString2 = uiString;
                        uiString3 = uiString5;
                        obj2 = format$default2;
                        java.lang.String str3 = (java.lang.String) obj2;
                        com.paypal.oslo.feature.revolvingcreditservicing.ui.common.components.UiString orEmpty2 = com.paypal.oslo.feature.revolvingcreditservicing.ui.common.components.UiStringKt.orEmpty(str3 == null ? com.paypal.oslo.feature.revolvingcreditservicing.ui.common.components.UiStringKt.toUiString(str3) : null);
                        if (uiString2 == null) {
                        }
                        if (uiString3 != null) {
                        }
                        return new com.paypal.oslo.feature.revolvingcreditservicing.ui.accountsummary.uimodel.CashbackRewardUiModel(uiString4, orEmpty2, null, true);
                    }
                    return coroutine_suspended;
                }
                com.paypal.oslo.feature.revolvingcreditservicing.api.model.CreditProductIdentifier creditProductIdentifier4 = (com.paypal.oslo.feature.revolvingcreditservicing.api.model.CreditProductIdentifier) cashbackRewardMapper$mapToCashbackRewardUiModel$1.getHighResolutionOutputSizeshNQ4ISI;
                com.paypal.oslo.feature.revolvingcreditservicing.domain.model.accountsummary.RewardsSummary rewardsSummary4 = (com.paypal.oslo.feature.revolvingcreditservicing.domain.model.accountsummary.RewardsSummary) cashbackRewardMapper$mapToCashbackRewardUiModel$1.getHighSpeedVideoFpsRanges;
                kotlin.ResultKt.throwOnFailure(obj2);
                creditProductIdentifier2 = creditProductIdentifier4;
                rewardsSummary3 = rewardsSummary4;
                obj = obj2;
                java.lang.String str4 = (java.lang.String) obj;
                com.paypal.oslo.feature.revolvingcreditservicing.ui.common.components.UiString uiString6 = str4 == null ? com.paypal.oslo.feature.revolvingcreditservicing.ui.common.components.UiStringKt.toUiString(str4) : null;
                com.paypal.oslo.feature.revolvingcreditservicing.domain.formatter.currency.CurrencyFormatterFacade currencyFormatterFacade3 = this.Camera2StreamConfigurationMap;
                com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.core.CurrencyAmount yearToDateCashBack = rewardsSummary3.getYearToDateCashBack();
                cashbackRewardMapper$mapToCashbackRewardUiModel$1.getHighSpeedVideoFpsRanges = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(rewardsSummary3);
                cashbackRewardMapper$mapToCashbackRewardUiModel$1.getHighResolutionOutputSizeshNQ4ISI = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(creditProductIdentifier2);
                cashbackRewardMapper$mapToCashbackRewardUiModel$1.getHighSpeedVideoFpsRangesFor = uiString6;
                cashbackRewardMapper$mapToCashbackRewardUiModel$1.Camera2StreamConfigurationMap = 2;
                com.paypal.oslo.feature.revolvingcreditservicing.ui.common.components.UiString uiString7 = uiString6;
                format$default = com.paypal.oslo.feature.revolvingcreditservicing.domain.formatter.currency.CurrencyFormatterFacade.format$default(currencyFormatterFacade3, yearToDateCashBack, null, 0, cashbackRewardMapper$mapToCashbackRewardUiModel$1, 6, null);
                if (format$default != coroutine_suspended) {
                    rewardsSummary2 = rewardsSummary3;
                    uiString = uiString7;
                    creditProductIdentifier3 = creditProductIdentifier2;
                    obj2 = format$default;
                    java.lang.String str22 = (java.lang.String) obj2;
                    if (str22 == null) {
                    }
                    com.paypal.oslo.feature.revolvingcreditservicing.domain.formatter.currency.CurrencyFormatterFacade currencyFormatterFacade22 = this.Camera2StreamConfigurationMap;
                    com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.core.CurrencyAmount zero_usd2 = com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.core.CurrencyAmount.INSTANCE.getZERO_USD();
                    cashbackRewardMapper$mapToCashbackRewardUiModel$1.getHighSpeedVideoFpsRanges = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(rewardsSummary2);
                    cashbackRewardMapper$mapToCashbackRewardUiModel$1.getHighResolutionOutputSizeshNQ4ISI = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(creditProductIdentifier3);
                    cashbackRewardMapper$mapToCashbackRewardUiModel$1.getHighSpeedVideoFpsRangesFor = uiString;
                    cashbackRewardMapper$mapToCashbackRewardUiModel$1.getHighSpeedVideoSizes = uiString5;
                    cashbackRewardMapper$mapToCashbackRewardUiModel$1.Camera2StreamConfigurationMap = 3;
                    format$default2 = com.paypal.oslo.feature.revolvingcreditservicing.domain.formatter.currency.CurrencyFormatterFacade.format$default(currencyFormatterFacade22, zero_usd2, null, 0, cashbackRewardMapper$mapToCashbackRewardUiModel$1, 6, null);
                    if (format$default2 != coroutine_suspended) {
                    }
                }
                return coroutine_suspended;
            }
        }
        cashbackRewardMapper$mapToCashbackRewardUiModel$1 = new com.paypal.oslo.feature.revolvingcreditservicing.ui.accountsummary.mapper.CashbackRewardMapper$mapToCashbackRewardUiModel$1(this, continuation);
        java.lang.Object obj22 = cashbackRewardMapper$mapToCashbackRewardUiModel$1.getOutputFormats;
        coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = cashbackRewardMapper$mapToCashbackRewardUiModel$1.Camera2StreamConfigurationMap;
        if (i != 0) {
        }
        java.lang.String str42 = (java.lang.String) obj;
        if (str42 == null) {
        }
        com.paypal.oslo.feature.revolvingcreditservicing.domain.formatter.currency.CurrencyFormatterFacade currencyFormatterFacade32 = this.Camera2StreamConfigurationMap;
        com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.core.CurrencyAmount yearToDateCashBack2 = rewardsSummary3.getYearToDateCashBack();
        cashbackRewardMapper$mapToCashbackRewardUiModel$1.getHighSpeedVideoFpsRanges = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(rewardsSummary3);
        cashbackRewardMapper$mapToCashbackRewardUiModel$1.getHighResolutionOutputSizeshNQ4ISI = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(creditProductIdentifier2);
        cashbackRewardMapper$mapToCashbackRewardUiModel$1.getHighSpeedVideoFpsRangesFor = uiString6;
        cashbackRewardMapper$mapToCashbackRewardUiModel$1.Camera2StreamConfigurationMap = 2;
        com.paypal.oslo.feature.revolvingcreditservicing.ui.common.components.UiString uiString72 = uiString6;
        format$default = com.paypal.oslo.feature.revolvingcreditservicing.domain.formatter.currency.CurrencyFormatterFacade.format$default(currencyFormatterFacade32, yearToDateCashBack2, null, 0, cashbackRewardMapper$mapToCashbackRewardUiModel$1, 6, null);
        if (format$default != coroutine_suspended) {
        }
        return coroutine_suspended;
    }
}
