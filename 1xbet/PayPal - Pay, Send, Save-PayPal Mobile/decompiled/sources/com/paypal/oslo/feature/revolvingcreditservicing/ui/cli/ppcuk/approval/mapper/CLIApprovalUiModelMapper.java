package com.paypal.oslo.feature.revolvingcreditservicing.ui.cli.ppcuk.approval.mapper;

@kotlin.Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0000\u0018\u00002\u00020\u0001B\u0019\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J0\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\f\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\nH\u0086@¢\u0006\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0013\u001a\u00020\u00028\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012R\u0014\u0010\u0015\u001a\u00020\u00048\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014"}, d2 = {"Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/cli/ppcuk/approval/mapper/CLIApprovalUiModelMapper;", "", "Lcom/paypal/oslo/feature/revolvingcreditservicing/domain/formatter/currency/CurrencyFormatterFacade;", "currencyFormatterFacade", "Lcom/paypal/oslo/feature/revolvingcreditservicing/domain/formatter/date/DateFormatterFacade;", "dateFormatterFacade", "<init>", "(Lcom/paypal/oslo/feature/revolvingcreditservicing/domain/formatter/currency/CurrencyFormatterFacade;Lcom/paypal/oslo/feature/revolvingcreditservicing/domain/formatter/date/DateFormatterFacade;)V", "", "expirationDate", "Lcom/paypal/oslo/feature/revolvingcreditservicing/domain/model/common/core/CurrencyAmount;", "newCreditLimit", "monthlyPaymentAmount", "currentCreditLimit", "Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/cli/ppcuk/approval/uimodel/CLIApprovalUiModel;", "mapToUiModel", "(Ljava/lang/String;Lcom/paypal/oslo/feature/revolvingcreditservicing/domain/model/common/core/CurrencyAmount;Lcom/paypal/oslo/feature/revolvingcreditservicing/domain/model/common/core/CurrencyAmount;Lcom/paypal/oslo/feature/revolvingcreditservicing/domain/model/common/core/CurrencyAmount;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getHighResolutionOutputSizeshNQ4ISI", "Lcom/paypal/oslo/feature/revolvingcreditservicing/domain/formatter/currency/CurrencyFormatterFacade;", "getHighSpeedVideoFpsRanges", "Lcom/paypal/oslo/feature/revolvingcreditservicing/domain/formatter/date/DateFormatterFacade;", "getHighSpeedVideoFpsRangesFor"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class CLIApprovalUiModelMapper {
    public static final int $stable = 0;

    /* renamed from: getHighResolutionOutputSizeshNQ4ISI, reason: from kotlin metadata */
    private final com.paypal.oslo.feature.revolvingcreditservicing.domain.formatter.currency.CurrencyFormatterFacade getHighSpeedVideoFpsRanges;

    /* renamed from: getHighSpeedVideoFpsRanges, reason: from kotlin metadata */
    private final com.paypal.oslo.feature.revolvingcreditservicing.domain.formatter.date.DateFormatterFacade getHighSpeedVideoFpsRangesFor;

    @javax.inject.Inject
    public CLIApprovalUiModelMapper(com.paypal.oslo.feature.revolvingcreditservicing.domain.formatter.currency.CurrencyFormatterFacade currencyFormatterFacade, com.paypal.oslo.feature.revolvingcreditservicing.domain.formatter.date.DateFormatterFacade dateFormatterFacade) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(currencyFormatterFacade, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(dateFormatterFacade, "");
        this.getHighSpeedVideoFpsRanges = currencyFormatterFacade;
        this.getHighSpeedVideoFpsRangesFor = dateFormatterFacade;
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x0192  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0152  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x00a6  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x002a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object mapToUiModel(java.lang.String str, com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.core.CurrencyAmount currencyAmount, com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.core.CurrencyAmount currencyAmount2, com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.core.CurrencyAmount currencyAmount3, kotlin.coroutines.Continuation<? super com.paypal.oslo.feature.revolvingcreditservicing.ui.cli.ppcuk.approval.uimodel.CLIApprovalUiModel> continuation) {
        com.paypal.oslo.feature.revolvingcreditservicing.ui.cli.ppcuk.approval.mapper.CLIApprovalUiModelMapper$mapToUiModel$1 cLIApprovalUiModelMapper$mapToUiModel$1;
        java.lang.Object coroutine_suspended;
        int i;
        java.lang.Object m23436constructorimpl;
        com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.core.CurrencyAmount currencyAmount4;
        com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.core.CurrencyAmount currencyAmount5;
        java.lang.Object requireFormat$default;
        java.time.LocalDate localDate;
        java.lang.String str2;
        java.lang.String str3;
        com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.core.CurrencyAmount currencyAmount6;
        java.lang.Object requireFormat$default2;
        java.lang.String str4;
        com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.core.CurrencyAmount currencyAmount7;
        com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.core.CurrencyAmount currencyAmount8;
        com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.core.CurrencyAmount currencyAmount9;
        java.time.LocalDate localDate2;
        java.lang.String str5;
        java.lang.String str6;
        java.lang.Object requireFormat$default3;
        java.lang.String str7;
        java.lang.String str8;
        java.lang.String str9;
        if (continuation instanceof com.paypal.oslo.feature.revolvingcreditservicing.ui.cli.ppcuk.approval.mapper.CLIApprovalUiModelMapper$mapToUiModel$1) {
            cLIApprovalUiModelMapper$mapToUiModel$1 = (com.paypal.oslo.feature.revolvingcreditservicing.ui.cli.ppcuk.approval.mapper.CLIApprovalUiModelMapper$mapToUiModel$1) continuation;
            if ((cLIApprovalUiModelMapper$mapToUiModel$1.getOutputMinFrameDuration & Integer.MIN_VALUE) != 0) {
                cLIApprovalUiModelMapper$mapToUiModel$1.getOutputMinFrameDuration -= 2147483648;
                java.lang.Object obj = cLIApprovalUiModelMapper$mapToUiModel$1.getOutputFormats;
                coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = cLIApprovalUiModelMapper$mapToUiModel$1.getOutputMinFrameDuration;
                if (i != 0) {
                    kotlin.ResultKt.throwOnFailure(obj);
                    try {
                        kotlin.Result.Companion companion = kotlin.Result.INSTANCE;
                        com.paypal.oslo.feature.revolvingcreditservicing.ui.cli.ppcuk.approval.mapper.CLIApprovalUiModelMapper cLIApprovalUiModelMapper = this;
                        m23436constructorimpl = kotlin.Result.m23436constructorimpl(java.time.LocalDate.parse(str));
                    } catch (java.lang.Throwable th) {
                        kotlin.Result.Companion companion2 = kotlin.Result.INSTANCE;
                        m23436constructorimpl = kotlin.Result.m23436constructorimpl(kotlin.ResultKt.createFailure(th));
                    }
                    if (kotlin.Result.m23439exceptionOrNullimpl(m23436constructorimpl) != null) {
                        m23436constructorimpl = java.time.LocalDate.now();
                    }
                    java.time.LocalDate localDate3 = (java.time.LocalDate) m23436constructorimpl;
                    com.paypal.oslo.feature.revolvingcreditservicing.domain.formatter.date.DateFormatterFacade dateFormatterFacade = this.getHighSpeedVideoFpsRangesFor;
                    kotlin.jvm.internal.Intrinsics.checkNotNull(localDate3);
                    com.paypal.oslo.feature.revolvingcreditservicing.domain.formatter.date.DateFormat.DateLong dateLong = com.paypal.oslo.feature.revolvingcreditservicing.domain.formatter.date.DateFormat.DateLong.INSTANCE;
                    java.util.Locale locale = java.util.Locale.UK;
                    kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(locale, "");
                    java.lang.String requireFormat = dateFormatterFacade.requireFormat(localDate3, dateLong, locale);
                    com.paypal.oslo.feature.revolvingcreditservicing.domain.formatter.currency.CurrencyFormatterFacade currencyFormatterFacade = this.getHighSpeedVideoFpsRanges;
                    cLIApprovalUiModelMapper$mapToUiModel$1.getHighSpeedVideoSizes = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(str);
                    cLIApprovalUiModelMapper$mapToUiModel$1.Camera2StreamConfigurationMap = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(currencyAmount);
                    currencyAmount4 = currencyAmount2;
                    cLIApprovalUiModelMapper$mapToUiModel$1.getHighResolutionOutputSizeshNQ4ISI = currencyAmount4;
                    currencyAmount5 = currencyAmount3;
                    cLIApprovalUiModelMapper$mapToUiModel$1.getHighSpeedVideoFpsRangesFor = currencyAmount5;
                    cLIApprovalUiModelMapper$mapToUiModel$1.getHighSpeedVideoFpsRanges = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(localDate3);
                    cLIApprovalUiModelMapper$mapToUiModel$1.getInputFormats = requireFormat;
                    cLIApprovalUiModelMapper$mapToUiModel$1.getOutputMinFrameDuration = 1;
                    requireFormat$default = com.paypal.oslo.feature.revolvingcreditservicing.domain.formatter.currency.CurrencyFormatterFacade.requireFormat$default(currencyFormatterFacade, currencyAmount, null, 0, cLIApprovalUiModelMapper$mapToUiModel$1, 6, null);
                    if (requireFormat$default != coroutine_suspended) {
                        localDate = localDate3;
                        str2 = requireFormat;
                        str3 = str;
                        currencyAmount6 = currencyAmount;
                    }
                    return coroutine_suspended;
                }
                if (i != 1) {
                    if (i != 2) {
                        if (i != 3) {
                            throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        str7 = (java.lang.String) cLIApprovalUiModelMapper$mapToUiModel$1.getHighSpeedVideoSizesFor;
                        str8 = (java.lang.String) cLIApprovalUiModelMapper$mapToUiModel$1.getInputSizeshNQ4ISI;
                        str9 = (java.lang.String) cLIApprovalUiModelMapper$mapToUiModel$1.getInputFormats;
                        kotlin.ResultKt.throwOnFailure(obj);
                        com.paypal.oslo.feature.revolvingcreditservicing.api.model.CreditProductIdentifier creditProductIdentifier = null;
                        boolean z = false;
                        int i2 = 12;
                        kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker = null;
                        return new com.paypal.oslo.feature.revolvingcreditservicing.ui.cli.ppcuk.approval.uimodel.CLIApprovalUiModel(new com.paypal.oslo.feature.revolvingcreditservicing.ui.common.components.UiString.StringResWithParameter(com.paypal.oslo.feature.revolvingcreditservicing.R.string.feature_revolvingcredit_servicing_manage_cli_offer_approval_new_limit_format, new java.lang.Object[]{str8, str7}, creditProductIdentifier, z, i2, defaultConstructorMarker), new com.paypal.oslo.feature.revolvingcreditservicing.ui.common.components.UiString.StringResWithParameter(com.paypal.oslo.feature.revolvingcreditservicing.R.string.feature_revolvingcredit_servicing_manage_cli_offer_approval_description, new java.lang.Object[]{str9}, creditProductIdentifier, z, i2, defaultConstructorMarker), com.paypal.oslo.feature.revolvingcreditservicing.ui.common.components.UiStringKt.toUiString((java.lang.String) obj), com.paypal.oslo.feature.revolvingcreditservicing.ui.common.components.UiStringKt.toUiString(str7));
                    }
                    java.lang.String str10 = (java.lang.String) cLIApprovalUiModelMapper$mapToUiModel$1.getInputSizeshNQ4ISI;
                    java.lang.String str11 = (java.lang.String) cLIApprovalUiModelMapper$mapToUiModel$1.getInputFormats;
                    localDate2 = (java.time.LocalDate) cLIApprovalUiModelMapper$mapToUiModel$1.getHighSpeedVideoFpsRanges;
                    com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.core.CurrencyAmount currencyAmount10 = (com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.core.CurrencyAmount) cLIApprovalUiModelMapper$mapToUiModel$1.getHighSpeedVideoFpsRangesFor;
                    currencyAmount8 = (com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.core.CurrencyAmount) cLIApprovalUiModelMapper$mapToUiModel$1.getHighResolutionOutputSizeshNQ4ISI;
                    currencyAmount7 = (com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.core.CurrencyAmount) cLIApprovalUiModelMapper$mapToUiModel$1.Camera2StreamConfigurationMap;
                    str4 = (java.lang.String) cLIApprovalUiModelMapper$mapToUiModel$1.getHighSpeedVideoSizes;
                    kotlin.ResultKt.throwOnFailure(obj);
                    str6 = str10;
                    str5 = str11;
                    currencyAmount9 = currencyAmount10;
                    java.lang.String str12 = (java.lang.String) obj;
                    com.paypal.oslo.feature.revolvingcreditservicing.domain.formatter.currency.CurrencyFormatterFacade currencyFormatterFacade2 = this.getHighSpeedVideoFpsRanges;
                    cLIApprovalUiModelMapper$mapToUiModel$1.getHighSpeedVideoSizes = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(str4);
                    cLIApprovalUiModelMapper$mapToUiModel$1.Camera2StreamConfigurationMap = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(currencyAmount7);
                    cLIApprovalUiModelMapper$mapToUiModel$1.getHighResolutionOutputSizeshNQ4ISI = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(currencyAmount8);
                    cLIApprovalUiModelMapper$mapToUiModel$1.getHighSpeedVideoFpsRangesFor = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(currencyAmount9);
                    cLIApprovalUiModelMapper$mapToUiModel$1.getHighSpeedVideoFpsRanges = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(localDate2);
                    cLIApprovalUiModelMapper$mapToUiModel$1.getInputFormats = str5;
                    cLIApprovalUiModelMapper$mapToUiModel$1.getInputSizeshNQ4ISI = str6;
                    cLIApprovalUiModelMapper$mapToUiModel$1.getHighSpeedVideoSizesFor = str12;
                    cLIApprovalUiModelMapper$mapToUiModel$1.getOutputMinFrameDuration = 3;
                    requireFormat$default3 = com.paypal.oslo.feature.revolvingcreditservicing.domain.formatter.currency.CurrencyFormatterFacade.requireFormat$default(currencyFormatterFacade2, currencyAmount9, null, 0, cLIApprovalUiModelMapper$mapToUiModel$1, 6, null);
                    if (requireFormat$default3 != coroutine_suspended) {
                        str7 = str12;
                        obj = requireFormat$default3;
                        str8 = str6;
                        str9 = str5;
                        com.paypal.oslo.feature.revolvingcreditservicing.api.model.CreditProductIdentifier creditProductIdentifier2 = null;
                        boolean z2 = false;
                        int i22 = 12;
                        kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker2 = null;
                        return new com.paypal.oslo.feature.revolvingcreditservicing.ui.cli.ppcuk.approval.uimodel.CLIApprovalUiModel(new com.paypal.oslo.feature.revolvingcreditservicing.ui.common.components.UiString.StringResWithParameter(com.paypal.oslo.feature.revolvingcreditservicing.R.string.feature_revolvingcredit_servicing_manage_cli_offer_approval_new_limit_format, new java.lang.Object[]{str8, str7}, creditProductIdentifier2, z2, i22, defaultConstructorMarker2), new com.paypal.oslo.feature.revolvingcreditservicing.ui.common.components.UiString.StringResWithParameter(com.paypal.oslo.feature.revolvingcreditservicing.R.string.feature_revolvingcredit_servicing_manage_cli_offer_approval_description, new java.lang.Object[]{str9}, creditProductIdentifier2, z2, i22, defaultConstructorMarker2), com.paypal.oslo.feature.revolvingcreditservicing.ui.common.components.UiStringKt.toUiString((java.lang.String) obj), com.paypal.oslo.feature.revolvingcreditservicing.ui.common.components.UiStringKt.toUiString(str7));
                    }
                    return coroutine_suspended;
                }
                java.lang.String str13 = (java.lang.String) cLIApprovalUiModelMapper$mapToUiModel$1.getInputFormats;
                java.time.LocalDate localDate4 = (java.time.LocalDate) cLIApprovalUiModelMapper$mapToUiModel$1.getHighSpeedVideoFpsRanges;
                com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.core.CurrencyAmount currencyAmount11 = (com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.core.CurrencyAmount) cLIApprovalUiModelMapper$mapToUiModel$1.getHighSpeedVideoFpsRangesFor;
                com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.core.CurrencyAmount currencyAmount12 = (com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.core.CurrencyAmount) cLIApprovalUiModelMapper$mapToUiModel$1.getHighResolutionOutputSizeshNQ4ISI;
                com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.core.CurrencyAmount currencyAmount13 = (com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.core.CurrencyAmount) cLIApprovalUiModelMapper$mapToUiModel$1.Camera2StreamConfigurationMap;
                java.lang.String str14 = (java.lang.String) cLIApprovalUiModelMapper$mapToUiModel$1.getHighSpeedVideoSizes;
                kotlin.ResultKt.throwOnFailure(obj);
                str2 = str13;
                localDate = localDate4;
                currencyAmount5 = currencyAmount11;
                currencyAmount4 = currencyAmount12;
                currencyAmount6 = currencyAmount13;
                requireFormat$default = obj;
                str3 = str14;
                java.lang.String str15 = (java.lang.String) requireFormat$default;
                com.paypal.oslo.feature.revolvingcreditservicing.domain.formatter.currency.CurrencyFormatterFacade currencyFormatterFacade3 = this.getHighSpeedVideoFpsRanges;
                cLIApprovalUiModelMapper$mapToUiModel$1.getHighSpeedVideoSizes = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(str3);
                cLIApprovalUiModelMapper$mapToUiModel$1.Camera2StreamConfigurationMap = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(currencyAmount6);
                cLIApprovalUiModelMapper$mapToUiModel$1.getHighResolutionOutputSizeshNQ4ISI = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(currencyAmount4);
                cLIApprovalUiModelMapper$mapToUiModel$1.getHighSpeedVideoFpsRangesFor = currencyAmount5;
                cLIApprovalUiModelMapper$mapToUiModel$1.getHighSpeedVideoFpsRanges = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(localDate);
                cLIApprovalUiModelMapper$mapToUiModel$1.getInputFormats = str2;
                cLIApprovalUiModelMapper$mapToUiModel$1.getInputSizeshNQ4ISI = str15;
                cLIApprovalUiModelMapper$mapToUiModel$1.getOutputMinFrameDuration = 2;
                java.lang.String str16 = str2;
                requireFormat$default2 = com.paypal.oslo.feature.revolvingcreditservicing.domain.formatter.currency.CurrencyFormatterFacade.requireFormat$default(currencyFormatterFacade3, currencyAmount4, null, 0, cLIApprovalUiModelMapper$mapToUiModel$1, 6, null);
                if (requireFormat$default2 != coroutine_suspended) {
                    str4 = str3;
                    obj = requireFormat$default2;
                    currencyAmount7 = currencyAmount6;
                    currencyAmount8 = currencyAmount4;
                    currencyAmount9 = currencyAmount5;
                    localDate2 = localDate;
                    str5 = str16;
                    str6 = str15;
                    java.lang.String str122 = (java.lang.String) obj;
                    com.paypal.oslo.feature.revolvingcreditservicing.domain.formatter.currency.CurrencyFormatterFacade currencyFormatterFacade22 = this.getHighSpeedVideoFpsRanges;
                    cLIApprovalUiModelMapper$mapToUiModel$1.getHighSpeedVideoSizes = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(str4);
                    cLIApprovalUiModelMapper$mapToUiModel$1.Camera2StreamConfigurationMap = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(currencyAmount7);
                    cLIApprovalUiModelMapper$mapToUiModel$1.getHighResolutionOutputSizeshNQ4ISI = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(currencyAmount8);
                    cLIApprovalUiModelMapper$mapToUiModel$1.getHighSpeedVideoFpsRangesFor = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(currencyAmount9);
                    cLIApprovalUiModelMapper$mapToUiModel$1.getHighSpeedVideoFpsRanges = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(localDate2);
                    cLIApprovalUiModelMapper$mapToUiModel$1.getInputFormats = str5;
                    cLIApprovalUiModelMapper$mapToUiModel$1.getInputSizeshNQ4ISI = str6;
                    cLIApprovalUiModelMapper$mapToUiModel$1.getHighSpeedVideoSizesFor = str122;
                    cLIApprovalUiModelMapper$mapToUiModel$1.getOutputMinFrameDuration = 3;
                    requireFormat$default3 = com.paypal.oslo.feature.revolvingcreditservicing.domain.formatter.currency.CurrencyFormatterFacade.requireFormat$default(currencyFormatterFacade22, currencyAmount9, null, 0, cLIApprovalUiModelMapper$mapToUiModel$1, 6, null);
                    if (requireFormat$default3 != coroutine_suspended) {
                    }
                }
                return coroutine_suspended;
            }
        }
        cLIApprovalUiModelMapper$mapToUiModel$1 = new com.paypal.oslo.feature.revolvingcreditservicing.ui.cli.ppcuk.approval.mapper.CLIApprovalUiModelMapper$mapToUiModel$1(this, continuation);
        java.lang.Object obj2 = cLIApprovalUiModelMapper$mapToUiModel$1.getOutputFormats;
        coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = cLIApprovalUiModelMapper$mapToUiModel$1.getOutputMinFrameDuration;
        if (i != 0) {
        }
        java.lang.String str152 = (java.lang.String) requireFormat$default;
        com.paypal.oslo.feature.revolvingcreditservicing.domain.formatter.currency.CurrencyFormatterFacade currencyFormatterFacade32 = this.getHighSpeedVideoFpsRanges;
        cLIApprovalUiModelMapper$mapToUiModel$1.getHighSpeedVideoSizes = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(str3);
        cLIApprovalUiModelMapper$mapToUiModel$1.Camera2StreamConfigurationMap = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(currencyAmount6);
        cLIApprovalUiModelMapper$mapToUiModel$1.getHighResolutionOutputSizeshNQ4ISI = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(currencyAmount4);
        cLIApprovalUiModelMapper$mapToUiModel$1.getHighSpeedVideoFpsRangesFor = currencyAmount5;
        cLIApprovalUiModelMapper$mapToUiModel$1.getHighSpeedVideoFpsRanges = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(localDate);
        cLIApprovalUiModelMapper$mapToUiModel$1.getInputFormats = str2;
        cLIApprovalUiModelMapper$mapToUiModel$1.getInputSizeshNQ4ISI = str152;
        cLIApprovalUiModelMapper$mapToUiModel$1.getOutputMinFrameDuration = 2;
        java.lang.String str162 = str2;
        requireFormat$default2 = com.paypal.oslo.feature.revolvingcreditservicing.domain.formatter.currency.CurrencyFormatterFacade.requireFormat$default(currencyFormatterFacade32, currencyAmount4, null, 0, cLIApprovalUiModelMapper$mapToUiModel$1, 6, null);
        if (requireFormat$default2 != coroutine_suspended) {
        }
        return coroutine_suspended;
    }
}
