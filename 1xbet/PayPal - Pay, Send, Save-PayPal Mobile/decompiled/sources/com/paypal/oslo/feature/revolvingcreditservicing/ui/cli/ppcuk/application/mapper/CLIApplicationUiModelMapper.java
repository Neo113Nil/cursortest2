package com.paypal.oslo.feature.revolvingcreditservicing.ui.cli.ppcuk.application.mapper;

@kotlin.Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0000\u0018\u00002\u00020\u0001B\u0011\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J*\u0010\f\u001a\u00020\u000b2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u00062\b\u0010\n\u001a\u0004\u0018\u00010\tH\u0086@¢\u0006\u0004\b\f\u0010\rR\u0014\u0010\u0010\u001a\u00020\u00028\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u000f"}, d2 = {"Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/cli/ppcuk/application/mapper/CLIApplicationUiModelMapper;", "", "Lcom/paypal/oslo/feature/revolvingcreditservicing/domain/formatter/currency/CurrencyFormatterFacade;", "currencyFormatterFacade", "<init>", "(Lcom/paypal/oslo/feature/revolvingcreditservicing/domain/formatter/currency/CurrencyFormatterFacade;)V", "Lcom/paypal/oslo/feature/revolvingcreditservicing/domain/model/common/core/CurrencyAmount;", "currentCreditLimit", "offeredCreditLimit", "", "privacyStatementUrl", "Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/cli/ppcuk/application/uimodel/CLIApplicationUiModel;", "mapToUiModel", "(Lcom/paypal/oslo/feature/revolvingcreditservicing/domain/model/common/core/CurrencyAmount;Lcom/paypal/oslo/feature/revolvingcreditservicing/domain/model/common/core/CurrencyAmount;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getHighSpeedVideoSizes", "Lcom/paypal/oslo/feature/revolvingcreditservicing/domain/formatter/currency/CurrencyFormatterFacade;", "getHighSpeedVideoFpsRanges"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class CLIApplicationUiModelMapper {
    public static final int $stable = 8;

    /* renamed from: getHighSpeedVideoSizes, reason: from kotlin metadata */
    private final com.paypal.oslo.feature.revolvingcreditservicing.domain.formatter.currency.CurrencyFormatterFacade getHighSpeedVideoFpsRanges;

    @javax.inject.Inject
    public CLIApplicationUiModelMapper(com.paypal.oslo.feature.revolvingcreditservicing.domain.formatter.currency.CurrencyFormatterFacade currencyFormatterFacade) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(currencyFormatterFacade, "");
        this.getHighSpeedVideoFpsRanges = currencyFormatterFacade;
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x00a4  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x005c  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0029  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object mapToUiModel(com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.core.CurrencyAmount currencyAmount, com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.core.CurrencyAmount currencyAmount2, java.lang.String str, kotlin.coroutines.Continuation<? super com.paypal.oslo.feature.revolvingcreditservicing.ui.cli.ppcuk.application.uimodel.CLIApplicationUiModel> continuation) {
        com.paypal.oslo.feature.revolvingcreditservicing.ui.cli.ppcuk.application.mapper.CLIApplicationUiModelMapper$mapToUiModel$1 cLIApplicationUiModelMapper$mapToUiModel$1;
        java.lang.Object coroutine_suspended;
        int i;
        java.lang.String str2;
        com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.core.CurrencyAmount currencyAmount3;
        com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.core.CurrencyAmount currencyAmount4;
        java.lang.Object requireFormat$default;
        java.lang.String str3;
        java.lang.String str4;
        if (continuation instanceof com.paypal.oslo.feature.revolvingcreditservicing.ui.cli.ppcuk.application.mapper.CLIApplicationUiModelMapper$mapToUiModel$1) {
            cLIApplicationUiModelMapper$mapToUiModel$1 = (com.paypal.oslo.feature.revolvingcreditservicing.ui.cli.ppcuk.application.mapper.CLIApplicationUiModelMapper$mapToUiModel$1) continuation;
            if ((cLIApplicationUiModelMapper$mapToUiModel$1.getHighSpeedVideoSizes & Integer.MIN_VALUE) != 0) {
                cLIApplicationUiModelMapper$mapToUiModel$1.getHighSpeedVideoSizes -= 2147483648;
                java.lang.Object obj = cLIApplicationUiModelMapper$mapToUiModel$1.getOutputFormats;
                coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = cLIApplicationUiModelMapper$mapToUiModel$1.getHighSpeedVideoSizes;
                if (i != 0) {
                    kotlin.ResultKt.throwOnFailure(obj);
                    com.paypal.oslo.feature.revolvingcreditservicing.domain.formatter.currency.CurrencyFormatterFacade currencyFormatterFacade = this.getHighSpeedVideoFpsRanges;
                    cLIApplicationUiModelMapper$mapToUiModel$1.Camera2StreamConfigurationMap = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(currencyAmount);
                    cLIApplicationUiModelMapper$mapToUiModel$1.getHighSpeedVideoFpsRangesFor = currencyAmount2;
                    str2 = str;
                    cLIApplicationUiModelMapper$mapToUiModel$1.getHighResolutionOutputSizeshNQ4ISI = str2;
                    cLIApplicationUiModelMapper$mapToUiModel$1.getHighSpeedVideoSizes = 1;
                    java.lang.Object requireFormat$default2 = com.paypal.oslo.feature.revolvingcreditservicing.domain.formatter.currency.CurrencyFormatterFacade.requireFormat$default(currencyFormatterFacade, currencyAmount, null, 0, cLIApplicationUiModelMapper$mapToUiModel$1, 6, null);
                    if (requireFormat$default2 != coroutine_suspended) {
                        currencyAmount3 = currencyAmount;
                        currencyAmount4 = currencyAmount2;
                        obj = requireFormat$default2;
                    }
                    return coroutine_suspended;
                }
                if (i != 1) {
                    if (i != 2) {
                        throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    str3 = (java.lang.String) cLIApplicationUiModelMapper$mapToUiModel$1.getHighSpeedVideoFpsRanges;
                    java.lang.String str5 = (java.lang.String) cLIApplicationUiModelMapper$mapToUiModel$1.getHighResolutionOutputSizeshNQ4ISI;
                    kotlin.ResultKt.throwOnFailure(obj);
                    str4 = str5;
                    boolean z = false;
                    return new com.paypal.oslo.feature.revolvingcreditservicing.ui.cli.ppcuk.application.uimodel.CLIApplicationUiModel(new com.paypal.oslo.feature.revolvingcreditservicing.ui.common.components.UiString.StringResWithParameter(com.paypal.oslo.feature.revolvingcreditservicing.R.string.feature_revolvingcredit_servicing_manage_cli_offer_application_title, new java.lang.Object[]{str3, (java.lang.String) obj}, null, z, 12, null), str4, null, null, null, false, z, false, false, false, null, null, 4092, null);
                }
                java.lang.String str6 = (java.lang.String) cLIApplicationUiModelMapper$mapToUiModel$1.getHighResolutionOutputSizeshNQ4ISI;
                currencyAmount4 = (com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.core.CurrencyAmount) cLIApplicationUiModelMapper$mapToUiModel$1.getHighSpeedVideoFpsRangesFor;
                currencyAmount3 = (com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.core.CurrencyAmount) cLIApplicationUiModelMapper$mapToUiModel$1.Camera2StreamConfigurationMap;
                kotlin.ResultKt.throwOnFailure(obj);
                str2 = str6;
                java.lang.String str7 = (java.lang.String) obj;
                com.paypal.oslo.feature.revolvingcreditservicing.domain.formatter.currency.CurrencyFormatterFacade currencyFormatterFacade2 = this.getHighSpeedVideoFpsRanges;
                cLIApplicationUiModelMapper$mapToUiModel$1.Camera2StreamConfigurationMap = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(currencyAmount3);
                cLIApplicationUiModelMapper$mapToUiModel$1.getHighSpeedVideoFpsRangesFor = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(currencyAmount4);
                cLIApplicationUiModelMapper$mapToUiModel$1.getHighResolutionOutputSizeshNQ4ISI = str2;
                cLIApplicationUiModelMapper$mapToUiModel$1.getHighSpeedVideoFpsRanges = str7;
                cLIApplicationUiModelMapper$mapToUiModel$1.getHighSpeedVideoSizes = 2;
                requireFormat$default = com.paypal.oslo.feature.revolvingcreditservicing.domain.formatter.currency.CurrencyFormatterFacade.requireFormat$default(currencyFormatterFacade2, currencyAmount4, null, 0, cLIApplicationUiModelMapper$mapToUiModel$1, 6, null);
                if (requireFormat$default != coroutine_suspended) {
                    str3 = str7;
                    obj = requireFormat$default;
                    str4 = str2;
                    boolean z2 = false;
                    return new com.paypal.oslo.feature.revolvingcreditservicing.ui.cli.ppcuk.application.uimodel.CLIApplicationUiModel(new com.paypal.oslo.feature.revolvingcreditservicing.ui.common.components.UiString.StringResWithParameter(com.paypal.oslo.feature.revolvingcreditservicing.R.string.feature_revolvingcredit_servicing_manage_cli_offer_application_title, new java.lang.Object[]{str3, (java.lang.String) obj}, null, z2, 12, null), str4, null, null, null, false, z2, false, false, false, null, null, 4092, null);
                }
                return coroutine_suspended;
            }
        }
        cLIApplicationUiModelMapper$mapToUiModel$1 = new com.paypal.oslo.feature.revolvingcreditservicing.ui.cli.ppcuk.application.mapper.CLIApplicationUiModelMapper$mapToUiModel$1(this, continuation);
        java.lang.Object obj2 = cLIApplicationUiModelMapper$mapToUiModel$1.getOutputFormats;
        coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = cLIApplicationUiModelMapper$mapToUiModel$1.getHighSpeedVideoSizes;
        if (i != 0) {
        }
        java.lang.String str72 = (java.lang.String) obj2;
        com.paypal.oslo.feature.revolvingcreditservicing.domain.formatter.currency.CurrencyFormatterFacade currencyFormatterFacade22 = this.getHighSpeedVideoFpsRanges;
        cLIApplicationUiModelMapper$mapToUiModel$1.Camera2StreamConfigurationMap = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(currencyAmount3);
        cLIApplicationUiModelMapper$mapToUiModel$1.getHighSpeedVideoFpsRangesFor = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(currencyAmount4);
        cLIApplicationUiModelMapper$mapToUiModel$1.getHighResolutionOutputSizeshNQ4ISI = str2;
        cLIApplicationUiModelMapper$mapToUiModel$1.getHighSpeedVideoFpsRanges = str72;
        cLIApplicationUiModelMapper$mapToUiModel$1.getHighSpeedVideoSizes = 2;
        requireFormat$default = com.paypal.oslo.feature.revolvingcreditservicing.domain.formatter.currency.CurrencyFormatterFacade.requireFormat$default(currencyFormatterFacade22, currencyAmount4, null, 0, cLIApplicationUiModelMapper$mapToUiModel$1, 6, null);
        if (requireFormat$default != coroutine_suspended) {
        }
        return coroutine_suspended;
    }
}
