package com.paypal.oslo.feature.revolvingcreditservicing.ui.cli.ppcuk.manage.mapper;

@kotlin.Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0000\u0018\u00002\u00020\u0001B\u0011\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u001a\u0010\t\u001a\u0004\u0018\u00010\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0086@¢\u0006\u0004\b\t\u0010\nR\u0014\u0010\r\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\f"}, d2 = {"Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/cli/ppcuk/manage/mapper/CLIManageUiModelMapper;", "", "Lcom/paypal/oslo/feature/revolvingcreditservicing/domain/formatter/currency/CurrencyFormatterFacade;", "currencyFormatterFacade", "<init>", "(Lcom/paypal/oslo/feature/revolvingcreditservicing/domain/formatter/currency/CurrencyFormatterFacade;)V", "Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/cli/ppcuk/manage/viewmodel/CLIManageState$ReadyInfo;", "readyInfo", "Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/cli/ppcuk/manage/uimodel/CLIManageUiModel;", "mapToCLIUIModel", "(Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/cli/ppcuk/manage/viewmodel/CLIManageState$ReadyInfo;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getHighSpeedVideoFpsRanges", "Lcom/paypal/oslo/feature/revolvingcreditservicing/domain/formatter/currency/CurrencyFormatterFacade;", "getHighSpeedVideoSizes"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class CLIManageUiModelMapper {
    public static final int $stable = 8;

    /* renamed from: getHighSpeedVideoFpsRanges, reason: from kotlin metadata */
    private final com.paypal.oslo.feature.revolvingcreditservicing.domain.formatter.currency.CurrencyFormatterFacade getHighSpeedVideoSizes;

    @javax.inject.Inject
    public CLIManageUiModelMapper(com.paypal.oslo.feature.revolvingcreditservicing.domain.formatter.currency.CurrencyFormatterFacade currencyFormatterFacade) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(currencyFormatterFacade, "");
        this.getHighSpeedVideoSizes = currencyFormatterFacade;
    }

    /* JADX WARN: Code restructure failed: missing block: B:29:0x0063, code lost:
    
        if (r1 != r10) goto L18;
     */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0088 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0089  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0080  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x004a  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0029  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object mapToCLIUIModel(com.paypal.oslo.feature.revolvingcreditservicing.ui.cli.ppcuk.manage.viewmodel.CLIManageState.ReadyInfo readyInfo, kotlin.coroutines.Continuation<? super com.paypal.oslo.feature.revolvingcreditservicing.ui.cli.ppcuk.manage.uimodel.CLIManageUiModel> continuation) {
        com.paypal.oslo.feature.revolvingcreditservicing.ui.cli.ppcuk.manage.mapper.CLIManageUiModelMapper$mapToCLIUIModel$1 cLIManageUiModelMapper$mapToCLIUIModel$1;
        java.lang.Object coroutine_suspended;
        int i;
        com.paypal.oslo.feature.revolvingcreditservicing.ui.cli.ppcuk.manage.viewmodel.CLIManageState.ReadyInfo readyInfo2;
        java.lang.Object format$default;
        java.lang.String str;
        com.paypal.oslo.feature.revolvingcreditservicing.ui.cli.ppcuk.manage.viewmodel.CLIManageState.ReadyInfo readyInfo3;
        if (continuation instanceof com.paypal.oslo.feature.revolvingcreditservicing.ui.cli.ppcuk.manage.mapper.CLIManageUiModelMapper$mapToCLIUIModel$1) {
            cLIManageUiModelMapper$mapToCLIUIModel$1 = (com.paypal.oslo.feature.revolvingcreditservicing.ui.cli.ppcuk.manage.mapper.CLIManageUiModelMapper$mapToCLIUIModel$1) continuation;
            if ((cLIManageUiModelMapper$mapToCLIUIModel$1.Camera2StreamConfigurationMap & Integer.MIN_VALUE) != 0) {
                cLIManageUiModelMapper$mapToCLIUIModel$1.Camera2StreamConfigurationMap -= 2147483648;
                java.lang.Object obj = cLIManageUiModelMapper$mapToCLIUIModel$1.getHighSpeedVideoSizes;
                coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = cLIManageUiModelMapper$mapToCLIUIModel$1.Camera2StreamConfigurationMap;
                if (i != 0) {
                    kotlin.ResultKt.throwOnFailure(obj);
                    com.paypal.oslo.feature.revolvingcreditservicing.domain.formatter.currency.CurrencyFormatterFacade currencyFormatterFacade = this.getHighSpeedVideoSizes;
                    com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.core.CurrencyAmount currentCreditLimit = readyInfo.getCurrentCreditLimit();
                    readyInfo2 = readyInfo;
                    cLIManageUiModelMapper$mapToCLIUIModel$1.getHighSpeedVideoFpsRangesFor = readyInfo2;
                    cLIManageUiModelMapper$mapToCLIUIModel$1.Camera2StreamConfigurationMap = 1;
                    obj = com.paypal.oslo.feature.revolvingcreditservicing.domain.formatter.currency.CurrencyFormatterFacade.format$default(currencyFormatterFacade, currentCreditLimit, null, 0, cLIManageUiModelMapper$mapToCLIUIModel$1, 6, null);
                } else {
                    if (i != 1) {
                        if (i != 2) {
                            throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        str = (java.lang.String) cLIManageUiModelMapper$mapToCLIUIModel$1.getHighResolutionOutputSizeshNQ4ISI;
                        readyInfo3 = (com.paypal.oslo.feature.revolvingcreditservicing.ui.cli.ppcuk.manage.viewmodel.CLIManageState.ReadyInfo) cLIManageUiModelMapper$mapToCLIUIModel$1.getHighSpeedVideoFpsRangesFor;
                        kotlin.ResultKt.throwOnFailure(obj);
                        java.lang.String str2 = (java.lang.String) obj;
                        com.paypal.oslo.feature.revolvingcreditservicing.ui.cli.ppcuk.manage.uimodel.CreditLimitIncreaseOfferUiModel creditLimitIncreaseOfferUiModel = null;
                        if (str != null) {
                            return null;
                        }
                        com.paypal.oslo.feature.revolvingcreditservicing.ui.cli.ppcuk.manage.uimodel.CreditLimitDetailsSectionUiModel creditLimitDetailsSectionUiModel = new com.paypal.oslo.feature.revolvingcreditservicing.ui.cli.ppcuk.manage.uimodel.CreditLimitDetailsSectionUiModel(new com.paypal.oslo.feature.revolvingcreditservicing.ui.common.components.UiString.StringResOnly(com.paypal.oslo.feature.revolvingcreditservicing.R.string.feature_revolvingcredit_servicing_manage_cli_credit_limit_title, (com.paypal.oslo.feature.revolvingcreditservicing.api.model.CreditProductIdentifier) null, false, 6, (kotlin.jvm.internal.DefaultConstructorMarker) null), new com.paypal.oslo.feature.revolvingcreditservicing.ui.common.components.UiString.PlainString(str), new com.paypal.oslo.feature.revolvingcreditservicing.ui.common.components.UiString.StringResOnly(com.paypal.oslo.feature.revolvingcreditservicing.R.string.feature_revolvingcredit_servicing_manage_cli_credit_limit_description, (com.paypal.oslo.feature.revolvingcreditservicing.api.model.CreditProductIdentifier) null, false, 6, (kotlin.jvm.internal.DefaultConstructorMarker) null));
                        com.paypal.oslo.feature.revolvingcreditservicing.api.model.CreditProductIdentifier creditProductIdentifier = null;
                        boolean z = false;
                        int i2 = 6;
                        kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker = null;
                        com.paypal.oslo.feature.revolvingcreditservicing.ui.cli.ppcuk.manage.uimodel.CreditLimitIncreaseToggleUiModel creditLimitIncreaseToggleUiModel = new com.paypal.oslo.feature.revolvingcreditservicing.ui.cli.ppcuk.manage.uimodel.CreditLimitIncreaseToggleUiModel(new com.paypal.oslo.feature.revolvingcreditservicing.ui.common.components.UiString.StringResOnly(com.paypal.oslo.feature.revolvingcreditservicing.R.string.feature_revolvingcredit_servicing_manage_cli_credit_limit_toggle_title, creditProductIdentifier, z, i2, defaultConstructorMarker), new com.paypal.oslo.feature.revolvingcreditservicing.ui.common.components.UiString.StringResOnly(com.paypal.oslo.feature.revolvingcreditservicing.R.string.feature_revolvingcredit_servicing_manage_cli_credit_limit_toggle_description, creditProductIdentifier, z, i2, defaultConstructorMarker), readyInfo3.isCreditLimitNotificationsEnabled());
                        if (readyInfo3.getStatus() == com.paypal.oslo.feature.revolvingcreditservicing.domain.model.cli.CLIOfferStatus.PENDING && str2 != null) {
                            creditLimitIncreaseOfferUiModel = new com.paypal.oslo.feature.revolvingcreditservicing.ui.cli.ppcuk.manage.uimodel.CreditLimitIncreaseOfferUiModel(new com.paypal.oslo.feature.revolvingcreditservicing.ui.common.components.UiString.StringResOnly(com.paypal.oslo.feature.revolvingcreditservicing.R.string.feature_revolvingcredit_servicing_manage_cli_offer_title, (com.paypal.oslo.feature.revolvingcreditservicing.api.model.CreditProductIdentifier) null, false, 6, (kotlin.jvm.internal.DefaultConstructorMarker) null), new com.paypal.oslo.feature.revolvingcreditservicing.ui.common.components.UiString.StringResWithParameter(com.paypal.oslo.feature.revolvingcreditservicing.R.string.feature_revolvingcredit_servicing_manage_cli_offer_description, new java.lang.Object[]{str, str2}, null, false, 12, null));
                        }
                        return new com.paypal.oslo.feature.revolvingcreditservicing.ui.cli.ppcuk.manage.uimodel.CLIManageUiModel(creditLimitDetailsSectionUiModel, creditLimitIncreaseToggleUiModel, creditLimitIncreaseOfferUiModel, null, 8, null);
                    }
                    com.paypal.oslo.feature.revolvingcreditservicing.ui.cli.ppcuk.manage.viewmodel.CLIManageState.ReadyInfo readyInfo4 = (com.paypal.oslo.feature.revolvingcreditservicing.ui.cli.ppcuk.manage.viewmodel.CLIManageState.ReadyInfo) cLIManageUiModelMapper$mapToCLIUIModel$1.getHighSpeedVideoFpsRangesFor;
                    kotlin.ResultKt.throwOnFailure(obj);
                    readyInfo2 = readyInfo4;
                }
                java.lang.String str3 = (java.lang.String) obj;
                com.paypal.oslo.feature.revolvingcreditservicing.domain.formatter.currency.CurrencyFormatterFacade currencyFormatterFacade2 = this.getHighSpeedVideoSizes;
                com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.core.CurrencyAmount newCreditLimit = readyInfo2.getNewCreditLimit();
                cLIManageUiModelMapper$mapToCLIUIModel$1.getHighSpeedVideoFpsRangesFor = readyInfo2;
                cLIManageUiModelMapper$mapToCLIUIModel$1.getHighResolutionOutputSizeshNQ4ISI = str3;
                cLIManageUiModelMapper$mapToCLIUIModel$1.Camera2StreamConfigurationMap = 2;
                format$default = com.paypal.oslo.feature.revolvingcreditservicing.domain.formatter.currency.CurrencyFormatterFacade.format$default(currencyFormatterFacade2, newCreditLimit, null, 0, cLIManageUiModelMapper$mapToCLIUIModel$1, 6, null);
                if (format$default != coroutine_suspended) {
                    str = str3;
                    obj = format$default;
                    readyInfo3 = readyInfo2;
                    java.lang.String str22 = (java.lang.String) obj;
                    com.paypal.oslo.feature.revolvingcreditservicing.ui.cli.ppcuk.manage.uimodel.CreditLimitIncreaseOfferUiModel creditLimitIncreaseOfferUiModel2 = null;
                    if (str != null) {
                    }
                }
                return coroutine_suspended;
            }
        }
        cLIManageUiModelMapper$mapToCLIUIModel$1 = new com.paypal.oslo.feature.revolvingcreditservicing.ui.cli.ppcuk.manage.mapper.CLIManageUiModelMapper$mapToCLIUIModel$1(this, continuation);
        java.lang.Object obj2 = cLIManageUiModelMapper$mapToCLIUIModel$1.getHighSpeedVideoSizes;
        coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = cLIManageUiModelMapper$mapToCLIUIModel$1.Camera2StreamConfigurationMap;
        if (i != 0) {
        }
        java.lang.String str32 = (java.lang.String) obj2;
        com.paypal.oslo.feature.revolvingcreditservicing.domain.formatter.currency.CurrencyFormatterFacade currencyFormatterFacade22 = this.getHighSpeedVideoSizes;
        com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.core.CurrencyAmount newCreditLimit2 = readyInfo2.getNewCreditLimit();
        cLIManageUiModelMapper$mapToCLIUIModel$1.getHighSpeedVideoFpsRangesFor = readyInfo2;
        cLIManageUiModelMapper$mapToCLIUIModel$1.getHighResolutionOutputSizeshNQ4ISI = str32;
        cLIManageUiModelMapper$mapToCLIUIModel$1.Camera2StreamConfigurationMap = 2;
        format$default = com.paypal.oslo.feature.revolvingcreditservicing.domain.formatter.currency.CurrencyFormatterFacade.format$default(currencyFormatterFacade22, newCreditLimit2, null, 0, cLIManageUiModelMapper$mapToCLIUIModel$1, 6, null);
        if (format$default != coroutine_suspended) {
        }
        return coroutine_suspended;
    }
}
