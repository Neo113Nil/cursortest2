package com.paypal.oslo.feature.revolvingcreditservicing.ui.paymentsummary.mapper;

@kotlin.Metadata(d1 = {"\u0000^\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u00020\u0001B\u0019\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J \u0010\r\u001a\u00020\f2\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\nH\u0086@¢\u0006\u0004\b\r\u0010\u000eJ(\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u000f\u001a\u00020\b2\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0012\u001a\u00020\nH\u0082@¢\u0006\u0004\b\u0014\u0010\u0015J\u0019\u0010\u0018\u001a\u00020\u00172\b\u0010\u000f\u001a\u0004\u0018\u00010\u0016H\u0002¢\u0006\u0004\b\u0018\u0010\u0019J4\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u001c0\u001a2\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u001b0\u001a2\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0012\u001a\u00020\nH\u0082@¢\u0006\u0004\b\u001d\u0010\u001eJ4\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u001f0\u001a2\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u001b0\u001a2\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0012\u001a\u00020\nH\u0082@¢\u0006\u0004\b\u0018\u0010\u001eR\u0014\u0010\u0014\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b \u0010!R\u0014\u0010 \u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001d\u0010\""}, d2 = {"Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/paymentsummary/mapper/PaymentSummaryUiModelMapper;", "", "Lcom/paypal/oslo/feature/revolvingcreditservicing/domain/formatter/currency/CurrencyFormatterFacade;", "currencyFormatterFacade", "Lcom/paypal/oslo/feature/revolvingcreditservicing/domain/formatter/date/DateFormatterFacade;", "dateFormatterFacade", "<init>", "(Lcom/paypal/oslo/feature/revolvingcreditservicing/domain/formatter/currency/CurrencyFormatterFacade;Lcom/paypal/oslo/feature/revolvingcreditservicing/domain/formatter/date/DateFormatterFacade;)V", "Lcom/paypal/oslo/feature/revolvingcreditservicing/domain/model/paymentsummary/PaymentSummaryOverview;", "paymentSummaryOverview", "Lcom/paypal/oslo/feature/revolvingcreditservicing/api/model/CreditProductIdentifier;", "creditProductIdentifier", "Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/paymentsummary/uimodel/PaymentSummaryScreenUiModel;", "toUiModel", "(Lcom/paypal/oslo/feature/revolvingcreditservicing/domain/model/paymentsummary/PaymentSummaryOverview;Lcom/paypal/oslo/feature/revolvingcreditservicing/api/model/CreditProductIdentifier;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "p0", "Ljava/util/Locale;", "p1", "p2", "Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/common/components/autopayModule/AutopayModuleUiModel;", "getHighSpeedVideoFpsRangesFor", "(Lcom/paypal/oslo/feature/revolvingcreditservicing/domain/model/paymentsummary/PaymentSummaryOverview;Ljava/util/Locale;Lcom/paypal/oslo/feature/revolvingcreditservicing/api/model/CreditProductIdentifier;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lcom/paypal/oslo/feature/revolvingcreditservicing/domain/model/autopay/PaymentOption;", "Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/common/components/autopayModule/AutopayMethod;", "getHighResolutionOutputSizeshNQ4ISI", "(Lcom/paypal/oslo/feature/revolvingcreditservicing/domain/model/autopay/PaymentOption;)Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/common/components/autopayModule/AutopayMethod;", "", "Lcom/paypal/oslo/feature/revolvingcreditservicing/domain/model/repayment/RepaymentActivity;", "Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/paymentsummary/uimodel/PaymentSectionUiModel;", "getHighSpeedVideoSizes", "(Ljava/util/List;Ljava/util/Locale;Lcom/paypal/oslo/feature/revolvingcreditservicing/api/model/CreditProductIdentifier;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/paymentsummary/uimodel/RepaymentActivityUiModel;", "getHighSpeedVideoFpsRanges", "Lcom/paypal/oslo/feature/revolvingcreditservicing/domain/formatter/currency/CurrencyFormatterFacade;", "Lcom/paypal/oslo/feature/revolvingcreditservicing/domain/formatter/date/DateFormatterFacade;"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class PaymentSummaryUiModelMapper {
    public static final int $stable = 0;

    /* renamed from: getHighSpeedVideoFpsRanges, reason: from kotlin metadata */
    private final com.paypal.oslo.feature.revolvingcreditservicing.domain.formatter.currency.CurrencyFormatterFacade getHighSpeedVideoFpsRangesFor;

    /* renamed from: getHighSpeedVideoSizes, reason: from kotlin metadata */
    private final com.paypal.oslo.feature.revolvingcreditservicing.domain.formatter.date.DateFormatterFacade getHighSpeedVideoFpsRanges;

    @javax.inject.Inject
    public PaymentSummaryUiModelMapper(com.paypal.oslo.feature.revolvingcreditservicing.domain.formatter.currency.CurrencyFormatterFacade currencyFormatterFacade, com.paypal.oslo.feature.revolvingcreditservicing.domain.formatter.date.DateFormatterFacade dateFormatterFacade) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(currencyFormatterFacade, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(dateFormatterFacade, "");
        this.getHighSpeedVideoFpsRangesFor = currencyFormatterFacade;
        this.getHighSpeedVideoFpsRanges = dateFormatterFacade;
    }

    /* JADX WARN: Code restructure failed: missing block: B:38:0x0095, code lost:
    
        if (r15 != r8) goto L26;
     */
    /* JADX WARN: Removed duplicated region for block: B:20:0x00bf  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x00de  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x009b  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x00b1  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x006e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0026  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object toUiModel(com.paypal.oslo.feature.revolvingcreditservicing.domain.model.paymentsummary.PaymentSummaryOverview paymentSummaryOverview, com.paypal.oslo.feature.revolvingcreditservicing.api.model.CreditProductIdentifier creditProductIdentifier, kotlin.coroutines.Continuation<? super com.paypal.oslo.feature.revolvingcreditservicing.ui.paymentsummary.uimodel.PaymentSummaryScreenUiModel> continuation) {
        com.paypal.oslo.feature.revolvingcreditservicing.ui.paymentsummary.mapper.PaymentSummaryUiModelMapper$toUiModel$1 paymentSummaryUiModelMapper$toUiModel$1;
        java.lang.Object coroutine_suspended;
        int i;
        com.paypal.oslo.feature.revolvingcreditservicing.domain.model.accountsummary.Billing billing;
        java.lang.String str;
        java.lang.Object highSpeedVideoFpsRangesFor;
        com.paypal.oslo.feature.revolvingcreditservicing.domain.model.paymentsummary.PaymentSummaryOverview paymentSummaryOverview2;
        java.util.Locale locale;
        com.paypal.oslo.feature.revolvingcreditservicing.api.model.CreditProductIdentifier creditProductIdentifier2;
        java.lang.String str2;
        java.util.List<com.paypal.oslo.feature.revolvingcreditservicing.domain.model.repayment.RepaymentActivity> repayments;
        java.lang.Object highSpeedVideoSizes;
        com.paypal.oslo.feature.revolvingcreditservicing.domain.model.paymentsummary.PaymentSummaryOverview paymentSummaryOverview3;
        com.paypal.oslo.feature.revolvingcreditservicing.ui.common.components.autopayModule.AutopayModuleUiModel autopayModuleUiModel;
        if (continuation instanceof com.paypal.oslo.feature.revolvingcreditservicing.ui.paymentsummary.mapper.PaymentSummaryUiModelMapper$toUiModel$1) {
            paymentSummaryUiModelMapper$toUiModel$1 = (com.paypal.oslo.feature.revolvingcreditservicing.ui.paymentsummary.mapper.PaymentSummaryUiModelMapper$toUiModel$1) continuation;
            if ((paymentSummaryUiModelMapper$toUiModel$1.getOutputFormats & Integer.MIN_VALUE) != 0) {
                paymentSummaryUiModelMapper$toUiModel$1.getOutputFormats -= 2147483648;
                java.lang.Object obj = paymentSummaryUiModelMapper$toUiModel$1.getInputFormats;
                coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = paymentSummaryUiModelMapper$toUiModel$1.getOutputFormats;
                if (i != 0) {
                    kotlin.ResultKt.throwOnFailure(obj);
                    com.paypal.oslo.feature.revolvingcreditservicing.domain.formatter.currency.CurrencyFormatterFacade currencyFormatterFacade = this.getHighSpeedVideoFpsRangesFor;
                    com.paypal.oslo.feature.revolvingcreditservicing.domain.model.accountsummary.AccountOverview accountOverview = paymentSummaryOverview.getAccountOverview();
                    com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.core.CurrencyAmount currentBalance = (accountOverview == null || (billing = accountOverview.getBilling()) == null) ? null : billing.getCurrentBalance();
                    paymentSummaryUiModelMapper$toUiModel$1.getHighResolutionOutputSizeshNQ4ISI = paymentSummaryOverview;
                    paymentSummaryUiModelMapper$toUiModel$1.getHighSpeedVideoFpsRanges = creditProductIdentifier;
                    paymentSummaryUiModelMapper$toUiModel$1.getOutputFormats = 1;
                    obj = com.paypal.oslo.feature.revolvingcreditservicing.domain.formatter.currency.CurrencyFormatterFacade.format$default(currencyFormatterFacade, currentBalance, null, 0, paymentSummaryUiModelMapper$toUiModel$1, 6, null);
                } else {
                    if (i != 1) {
                        if (i != 2) {
                            if (i != 3) {
                                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                            autopayModuleUiModel = (com.paypal.oslo.feature.revolvingcreditservicing.ui.common.components.autopayModule.AutopayModuleUiModel) paymentSummaryUiModelMapper$toUiModel$1.getHighSpeedVideoSizes;
                            str2 = (java.lang.String) paymentSummaryUiModelMapper$toUiModel$1.Camera2StreamConfigurationMap;
                            paymentSummaryOverview3 = (com.paypal.oslo.feature.revolvingcreditservicing.domain.model.paymentsummary.PaymentSummaryOverview) paymentSummaryUiModelMapper$toUiModel$1.getHighResolutionOutputSizeshNQ4ISI;
                            kotlin.ResultKt.throwOnFailure(obj);
                            return new com.paypal.oslo.feature.revolvingcreditservicing.ui.paymentsummary.uimodel.PaymentSummaryScreenUiModel(autopayModuleUiModel, (java.util.List) obj, str2, paymentSummaryOverview3.getCreditAccountId());
                        }
                        locale = (java.util.Locale) paymentSummaryUiModelMapper$toUiModel$1.getHighSpeedVideoFpsRangesFor;
                        str2 = (java.lang.String) paymentSummaryUiModelMapper$toUiModel$1.Camera2StreamConfigurationMap;
                        creditProductIdentifier2 = (com.paypal.oslo.feature.revolvingcreditservicing.api.model.CreditProductIdentifier) paymentSummaryUiModelMapper$toUiModel$1.getHighSpeedVideoFpsRanges;
                        paymentSummaryOverview2 = (com.paypal.oslo.feature.revolvingcreditservicing.domain.model.paymentsummary.PaymentSummaryOverview) paymentSummaryUiModelMapper$toUiModel$1.getHighResolutionOutputSizeshNQ4ISI;
                        kotlin.ResultKt.throwOnFailure(obj);
                        com.paypal.oslo.feature.revolvingcreditservicing.ui.common.components.autopayModule.AutopayModuleUiModel autopayModuleUiModel2 = (com.paypal.oslo.feature.revolvingcreditservicing.ui.common.components.autopayModule.AutopayModuleUiModel) obj;
                        repayments = paymentSummaryOverview2.getRepayments();
                        if (repayments == null) {
                            repayments = kotlin.collections.CollectionsKt.emptyList();
                        }
                        paymentSummaryUiModelMapper$toUiModel$1.getHighResolutionOutputSizeshNQ4ISI = paymentSummaryOverview2;
                        paymentSummaryUiModelMapper$toUiModel$1.getHighSpeedVideoFpsRanges = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(creditProductIdentifier2);
                        paymentSummaryUiModelMapper$toUiModel$1.Camera2StreamConfigurationMap = str2;
                        paymentSummaryUiModelMapper$toUiModel$1.getHighSpeedVideoFpsRangesFor = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(locale);
                        paymentSummaryUiModelMapper$toUiModel$1.getHighSpeedVideoSizes = autopayModuleUiModel2;
                        paymentSummaryUiModelMapper$toUiModel$1.getOutputFormats = 3;
                        highSpeedVideoSizes = getHighSpeedVideoSizes(repayments, locale, creditProductIdentifier2, paymentSummaryUiModelMapper$toUiModel$1);
                        if (highSpeedVideoSizes != coroutine_suspended) {
                            paymentSummaryOverview3 = paymentSummaryOverview2;
                            obj = highSpeedVideoSizes;
                            autopayModuleUiModel = autopayModuleUiModel2;
                            return new com.paypal.oslo.feature.revolvingcreditservicing.ui.paymentsummary.uimodel.PaymentSummaryScreenUiModel(autopayModuleUiModel, (java.util.List) obj, str2, paymentSummaryOverview3.getCreditAccountId());
                        }
                        return coroutine_suspended;
                    }
                    creditProductIdentifier = (com.paypal.oslo.feature.revolvingcreditservicing.api.model.CreditProductIdentifier) paymentSummaryUiModelMapper$toUiModel$1.getHighSpeedVideoFpsRanges;
                    paymentSummaryOverview = (com.paypal.oslo.feature.revolvingcreditservicing.domain.model.paymentsummary.PaymentSummaryOverview) paymentSummaryUiModelMapper$toUiModel$1.getHighResolutionOutputSizeshNQ4ISI;
                    kotlin.ResultKt.throwOnFailure(obj);
                }
                str = (java.lang.String) obj;
                if (str == null) {
                    str = "";
                }
                java.util.Locale locale2 = com.paypal.oslo.feature.revolvingcreditservicing.utils.LocaleMapperKt.toLocale(creditProductIdentifier);
                paymentSummaryUiModelMapper$toUiModel$1.getHighResolutionOutputSizeshNQ4ISI = paymentSummaryOverview;
                paymentSummaryUiModelMapper$toUiModel$1.getHighSpeedVideoFpsRanges = creditProductIdentifier;
                paymentSummaryUiModelMapper$toUiModel$1.Camera2StreamConfigurationMap = str;
                paymentSummaryUiModelMapper$toUiModel$1.getHighSpeedVideoFpsRangesFor = locale2;
                paymentSummaryUiModelMapper$toUiModel$1.getOutputFormats = 2;
                highSpeedVideoFpsRangesFor = getHighSpeedVideoFpsRangesFor(paymentSummaryOverview, locale2, creditProductIdentifier, paymentSummaryUiModelMapper$toUiModel$1);
                if (highSpeedVideoFpsRangesFor != coroutine_suspended) {
                    paymentSummaryOverview2 = paymentSummaryOverview;
                    locale = locale2;
                    creditProductIdentifier2 = creditProductIdentifier;
                    str2 = str;
                    obj = highSpeedVideoFpsRangesFor;
                    com.paypal.oslo.feature.revolvingcreditservicing.ui.common.components.autopayModule.AutopayModuleUiModel autopayModuleUiModel22 = (com.paypal.oslo.feature.revolvingcreditservicing.ui.common.components.autopayModule.AutopayModuleUiModel) obj;
                    repayments = paymentSummaryOverview2.getRepayments();
                    if (repayments == null) {
                    }
                    paymentSummaryUiModelMapper$toUiModel$1.getHighResolutionOutputSizeshNQ4ISI = paymentSummaryOverview2;
                    paymentSummaryUiModelMapper$toUiModel$1.getHighSpeedVideoFpsRanges = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(creditProductIdentifier2);
                    paymentSummaryUiModelMapper$toUiModel$1.Camera2StreamConfigurationMap = str2;
                    paymentSummaryUiModelMapper$toUiModel$1.getHighSpeedVideoFpsRangesFor = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(locale);
                    paymentSummaryUiModelMapper$toUiModel$1.getHighSpeedVideoSizes = autopayModuleUiModel22;
                    paymentSummaryUiModelMapper$toUiModel$1.getOutputFormats = 3;
                    highSpeedVideoSizes = getHighSpeedVideoSizes(repayments, locale, creditProductIdentifier2, paymentSummaryUiModelMapper$toUiModel$1);
                    if (highSpeedVideoSizes != coroutine_suspended) {
                    }
                }
                return coroutine_suspended;
            }
        }
        paymentSummaryUiModelMapper$toUiModel$1 = new com.paypal.oslo.feature.revolvingcreditservicing.ui.paymentsummary.mapper.PaymentSummaryUiModelMapper$toUiModel$1(this, continuation);
        java.lang.Object obj2 = paymentSummaryUiModelMapper$toUiModel$1.getInputFormats;
        coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = paymentSummaryUiModelMapper$toUiModel$1.getOutputFormats;
        if (i != 0) {
        }
        str = (java.lang.String) obj2;
        if (str == null) {
        }
        java.util.Locale locale22 = com.paypal.oslo.feature.revolvingcreditservicing.utils.LocaleMapperKt.toLocale(creditProductIdentifier);
        paymentSummaryUiModelMapper$toUiModel$1.getHighResolutionOutputSizeshNQ4ISI = paymentSummaryOverview;
        paymentSummaryUiModelMapper$toUiModel$1.getHighSpeedVideoFpsRanges = creditProductIdentifier;
        paymentSummaryUiModelMapper$toUiModel$1.Camera2StreamConfigurationMap = str;
        paymentSummaryUiModelMapper$toUiModel$1.getHighSpeedVideoFpsRangesFor = locale22;
        paymentSummaryUiModelMapper$toUiModel$1.getOutputFormats = 2;
        highSpeedVideoFpsRangesFor = getHighSpeedVideoFpsRangesFor(paymentSummaryOverview, locale22, creditProductIdentifier, paymentSummaryUiModelMapper$toUiModel$1);
        if (highSpeedVideoFpsRangesFor != coroutine_suspended) {
        }
        return coroutine_suspended;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:12:0x00d3  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x00d5  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0058  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x002b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object getHighSpeedVideoFpsRangesFor(com.paypal.oslo.feature.revolvingcreditservicing.domain.model.paymentsummary.PaymentSummaryOverview paymentSummaryOverview, java.util.Locale locale, com.paypal.oslo.feature.revolvingcreditservicing.api.model.CreditProductIdentifier creditProductIdentifier, kotlin.coroutines.Continuation<? super com.paypal.oslo.feature.revolvingcreditservicing.ui.common.components.autopayModule.AutopayModuleUiModel> continuation) {
        com.paypal.oslo.feature.revolvingcreditservicing.ui.paymentsummary.mapper.PaymentSummaryUiModelMapper$mapAutopayOverviewToUiModel$1 paymentSummaryUiModelMapper$mapAutopayOverviewToUiModel$1;
        int i;
        com.paypal.oslo.feature.revolvingcreditservicing.domain.model.paymentsummary.PaymentSummaryOverview paymentSummaryOverview2;
        boolean z;
        com.paypal.oslo.feature.revolvingcreditservicing.ui.common.components.autopayModule.AutopayMethod autopayMethod;
        java.lang.String str;
        com.paypal.oslo.feature.revolvingcreditservicing.api.model.CreditProductIdentifier creditProductIdentifier2;
        com.paypal.oslo.feature.revolvingcreditservicing.domain.model.accountsummary.Billing billing;
        if (continuation instanceof com.paypal.oslo.feature.revolvingcreditservicing.ui.paymentsummary.mapper.PaymentSummaryUiModelMapper$mapAutopayOverviewToUiModel$1) {
            paymentSummaryUiModelMapper$mapAutopayOverviewToUiModel$1 = (com.paypal.oslo.feature.revolvingcreditservicing.ui.paymentsummary.mapper.PaymentSummaryUiModelMapper$mapAutopayOverviewToUiModel$1) continuation;
            if ((paymentSummaryUiModelMapper$mapAutopayOverviewToUiModel$1.getOutputFormats & Integer.MIN_VALUE) != 0) {
                paymentSummaryUiModelMapper$mapAutopayOverviewToUiModel$1.getOutputFormats -= 2147483648;
                com.paypal.oslo.feature.revolvingcreditservicing.ui.paymentsummary.mapper.PaymentSummaryUiModelMapper$mapAutopayOverviewToUiModel$1 paymentSummaryUiModelMapper$mapAutopayOverviewToUiModel$12 = paymentSummaryUiModelMapper$mapAutopayOverviewToUiModel$1;
                java.lang.Object obj = paymentSummaryUiModelMapper$mapAutopayOverviewToUiModel$12.getHighSpeedVideoSizesFor;
                java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = paymentSummaryUiModelMapper$mapAutopayOverviewToUiModel$12.getOutputFormats;
                if (i != 0) {
                    kotlin.ResultKt.throwOnFailure(obj);
                    com.paypal.oslo.feature.revolvingcreditservicing.domain.model.autopay.AutopayOverview autopayOverview = paymentSummaryOverview.getAutopayOverview();
                    boolean isAutopayEnrolled = paymentSummaryOverview.isAutopayEnrolled();
                    com.paypal.oslo.feature.revolvingcreditservicing.ui.common.components.autopayModule.AutopayMethod highResolutionOutputSizeshNQ4ISI = getHighResolutionOutputSizeshNQ4ISI(autopayOverview != null ? autopayOverview.getRepaymentOption() : null);
                    com.paypal.oslo.feature.revolvingcreditservicing.domain.formatter.date.DateFormatterFacade dateFormatterFacade = this.getHighSpeedVideoFpsRanges;
                    com.paypal.oslo.feature.revolvingcreditservicing.domain.model.accountsummary.AccountOverview accountOverview = paymentSummaryOverview.getAccountOverview();
                    java.lang.String format = dateFormatterFacade.format((accountOverview == null || (billing = accountOverview.getBilling()) == null) ? null : billing.getNextPaymentDueTime(), com.paypal.oslo.feature.revolvingcreditservicing.domain.formatter.date.DateFormat.DateMonthDayShort.INSTANCE, locale);
                    java.lang.String str2 = format == null ? "" : format;
                    com.paypal.oslo.feature.revolvingcreditservicing.domain.formatter.currency.CurrencyFormatterFacade currencyFormatterFacade = this.getHighSpeedVideoFpsRangesFor;
                    com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.core.CurrencyAmount customAmount = autopayOverview != null ? autopayOverview.getCustomAmount() : null;
                    paymentSummaryOverview2 = paymentSummaryOverview;
                    paymentSummaryUiModelMapper$mapAutopayOverviewToUiModel$12.getHighSpeedVideoFpsRanges = paymentSummaryOverview2;
                    paymentSummaryUiModelMapper$mapAutopayOverviewToUiModel$12.Camera2StreamConfigurationMap = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(locale);
                    paymentSummaryUiModelMapper$mapAutopayOverviewToUiModel$12.getHighResolutionOutputSizeshNQ4ISI = creditProductIdentifier;
                    paymentSummaryUiModelMapper$mapAutopayOverviewToUiModel$12.getHighSpeedVideoFpsRangesFor = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(autopayOverview);
                    paymentSummaryUiModelMapper$mapAutopayOverviewToUiModel$12.getHighSpeedVideoSizes = highResolutionOutputSizeshNQ4ISI;
                    paymentSummaryUiModelMapper$mapAutopayOverviewToUiModel$12.getInputFormats = str2;
                    paymentSummaryUiModelMapper$mapAutopayOverviewToUiModel$12.getOutputMinFrameDuration = isAutopayEnrolled;
                    paymentSummaryUiModelMapper$mapAutopayOverviewToUiModel$12.getOutputFormats = 1;
                    obj = com.paypal.oslo.feature.revolvingcreditservicing.domain.formatter.currency.CurrencyFormatterFacade.format$default(currencyFormatterFacade, customAmount, null, 0, paymentSummaryUiModelMapper$mapAutopayOverviewToUiModel$12, 6, null);
                    if (obj == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    z = isAutopayEnrolled;
                    autopayMethod = highResolutionOutputSizeshNQ4ISI;
                    str = str2;
                    creditProductIdentifier2 = creditProductIdentifier;
                } else {
                    if (i != 1) {
                        throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    z = paymentSummaryUiModelMapper$mapAutopayOverviewToUiModel$12.getOutputMinFrameDuration;
                    java.lang.String str3 = (java.lang.String) paymentSummaryUiModelMapper$mapAutopayOverviewToUiModel$12.getInputFormats;
                    com.paypal.oslo.feature.revolvingcreditservicing.ui.common.components.autopayModule.AutopayMethod autopayMethod2 = (com.paypal.oslo.feature.revolvingcreditservicing.ui.common.components.autopayModule.AutopayMethod) paymentSummaryUiModelMapper$mapAutopayOverviewToUiModel$12.getHighSpeedVideoSizes;
                    com.paypal.oslo.feature.revolvingcreditservicing.api.model.CreditProductIdentifier creditProductIdentifier3 = (com.paypal.oslo.feature.revolvingcreditservicing.api.model.CreditProductIdentifier) paymentSummaryUiModelMapper$mapAutopayOverviewToUiModel$12.getHighResolutionOutputSizeshNQ4ISI;
                    com.paypal.oslo.feature.revolvingcreditservicing.domain.model.paymentsummary.PaymentSummaryOverview paymentSummaryOverview3 = (com.paypal.oslo.feature.revolvingcreditservicing.domain.model.paymentsummary.PaymentSummaryOverview) paymentSummaryUiModelMapper$mapAutopayOverviewToUiModel$12.getHighSpeedVideoFpsRanges;
                    kotlin.ResultKt.throwOnFailure(obj);
                    creditProductIdentifier2 = creditProductIdentifier3;
                    paymentSummaryOverview2 = paymentSummaryOverview3;
                    str = str3;
                    autopayMethod = autopayMethod2;
                }
                java.lang.String str4 = (java.lang.String) obj;
                return new com.paypal.oslo.feature.revolvingcreditservicing.ui.common.components.autopayModule.AutopayModuleUiModel(z, paymentSummaryOverview2.isPaymentDue(), paymentSummaryOverview2.isPaymentPastDue(), str, autopayMethod, str4 != null ? "" : str4, paymentSummaryOverview2.getHasFetchAutopayNetworkIssue(), creditProductIdentifier2);
            }
        }
        paymentSummaryUiModelMapper$mapAutopayOverviewToUiModel$1 = new com.paypal.oslo.feature.revolvingcreditservicing.ui.paymentsummary.mapper.PaymentSummaryUiModelMapper$mapAutopayOverviewToUiModel$1(this, continuation);
        com.paypal.oslo.feature.revolvingcreditservicing.ui.paymentsummary.mapper.PaymentSummaryUiModelMapper$mapAutopayOverviewToUiModel$1 paymentSummaryUiModelMapper$mapAutopayOverviewToUiModel$122 = paymentSummaryUiModelMapper$mapAutopayOverviewToUiModel$1;
        java.lang.Object obj2 = paymentSummaryUiModelMapper$mapAutopayOverviewToUiModel$122.getHighSpeedVideoSizesFor;
        java.lang.Object coroutine_suspended2 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = paymentSummaryUiModelMapper$mapAutopayOverviewToUiModel$122.getOutputFormats;
        if (i != 0) {
        }
        java.lang.String str42 = (java.lang.String) obj2;
        return new com.paypal.oslo.feature.revolvingcreditservicing.ui.common.components.autopayModule.AutopayModuleUiModel(z, paymentSummaryOverview2.isPaymentDue(), paymentSummaryOverview2.isPaymentPastDue(), str, autopayMethod, str42 != null ? "" : str42, paymentSummaryOverview2.getHasFetchAutopayNetworkIssue(), creditProductIdentifier2);
    }

    private static com.paypal.oslo.feature.revolvingcreditservicing.ui.common.components.autopayModule.AutopayMethod getHighResolutionOutputSizeshNQ4ISI(com.paypal.oslo.feature.revolvingcreditservicing.domain.model.autopay.PaymentOption p0) {
        int i = p0 == null ? -1 : com.paypal.oslo.feature.revolvingcreditservicing.ui.paymentsummary.mapper.PaymentSummaryUiModelMapper.WhenMappings.$EnumSwitchMapping$0[p0.ordinal()];
        if (i == 1) {
            return com.paypal.oslo.feature.revolvingcreditservicing.ui.common.components.autopayModule.AutopayMethod.Minimum;
        }
        if (i == 2) {
            return com.paypal.oslo.feature.revolvingcreditservicing.ui.common.components.autopayModule.AutopayMethod.Statement;
        }
        if (i == 3) {
            return com.paypal.oslo.feature.revolvingcreditservicing.ui.common.components.autopayModule.AutopayMethod.Statement;
        }
        if (i == 4) {
            return com.paypal.oslo.feature.revolvingcreditservicing.ui.common.components.autopayModule.AutopayMethod.CustomAmount;
        }
        return com.paypal.oslo.feature.revolvingcreditservicing.ui.common.components.autopayModule.AutopayMethod.Minimum;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0196  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x01d6  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0152  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0186  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00be  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x002f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object getHighSpeedVideoSizes(java.util.List<com.paypal.oslo.feature.revolvingcreditservicing.domain.model.repayment.RepaymentActivity> list, java.util.Locale locale, com.paypal.oslo.feature.revolvingcreditservicing.api.model.CreditProductIdentifier creditProductIdentifier, kotlin.coroutines.Continuation<? super java.util.List<com.paypal.oslo.feature.revolvingcreditservicing.ui.paymentsummary.uimodel.PaymentSectionUiModel>> continuation) {
        com.paypal.oslo.feature.revolvingcreditservicing.ui.paymentsummary.mapper.PaymentSummaryUiModelMapper$groupRepaymentsIntoSections$1 paymentSummaryUiModelMapper$groupRepaymentsIntoSections$1;
        int i;
        java.util.LinkedHashMap linkedHashMap;
        com.paypal.oslo.feature.revolvingcreditservicing.ui.paymentsummary.uimodel.PaymentSectionUiModel[] paymentSectionUiModelArr;
        java.util.List<com.paypal.oslo.feature.revolvingcreditservicing.domain.model.repayment.RepaymentActivity> list2;
        java.util.Locale locale2;
        com.paypal.oslo.feature.revolvingcreditservicing.api.model.CreditProductIdentifier creditProductIdentifier2;
        com.paypal.oslo.feature.revolvingcreditservicing.ui.paymentsummary.uimodel.PaymentSectionUiModel[] paymentSectionUiModelArr2;
        int i2;
        java.util.Map map;
        com.paypal.oslo.feature.revolvingcreditservicing.ui.paymentsummary.uimodel.PaymentSectionUiModel paymentSectionUiModel;
        com.paypal.oslo.feature.revolvingcreditservicing.ui.paymentsummary.uimodel.PaymentSectionUiModel[] paymentSectionUiModelArr3;
        com.paypal.oslo.feature.revolvingcreditservicing.ui.paymentsummary.uimodel.PaymentSectionUiModel[] paymentSectionUiModelArr4;
        com.paypal.oslo.feature.revolvingcreditservicing.ui.paymentsummary.uimodel.SectionType sectionType;
        java.util.List<com.paypal.oslo.feature.revolvingcreditservicing.domain.model.repayment.RepaymentActivity> list3;
        com.paypal.oslo.feature.revolvingcreditservicing.ui.paymentsummary.uimodel.PaymentSectionUiModel[] paymentSectionUiModelArr5;
        java.util.Locale locale3;
        java.util.List<com.paypal.oslo.feature.revolvingcreditservicing.domain.model.repayment.RepaymentActivity> list4;
        com.paypal.oslo.feature.revolvingcreditservicing.ui.paymentsummary.uimodel.PaymentSectionUiModel paymentSectionUiModel2;
        com.paypal.oslo.feature.revolvingcreditservicing.ui.paymentsummary.uimodel.SectionType sectionType2;
        com.paypal.oslo.feature.revolvingcreditservicing.api.model.CreditProductIdentifier creditProductIdentifier3;
        java.util.Locale locale4;
        java.util.List<com.paypal.oslo.feature.revolvingcreditservicing.domain.model.repayment.RepaymentActivity> list5;
        com.paypal.oslo.feature.revolvingcreditservicing.ui.paymentsummary.uimodel.PaymentSectionUiModel[] paymentSectionUiModelArr6;
        com.paypal.oslo.feature.revolvingcreditservicing.ui.paymentsummary.uimodel.PaymentSectionUiModel paymentSectionUiModel3;
        com.paypal.oslo.feature.revolvingcreditservicing.ui.paymentsummary.uimodel.PaymentSectionUiModel[] paymentSectionUiModelArr7;
        com.paypal.oslo.feature.revolvingcreditservicing.ui.paymentsummary.uimodel.SectionType sectionType3;
        if (continuation instanceof com.paypal.oslo.feature.revolvingcreditservicing.ui.paymentsummary.mapper.PaymentSummaryUiModelMapper$groupRepaymentsIntoSections$1) {
            paymentSummaryUiModelMapper$groupRepaymentsIntoSections$1 = (com.paypal.oslo.feature.revolvingcreditservicing.ui.paymentsummary.mapper.PaymentSummaryUiModelMapper$groupRepaymentsIntoSections$1) continuation;
            if ((paymentSummaryUiModelMapper$groupRepaymentsIntoSections$1.getOutputStallDuration & Integer.MIN_VALUE) != 0) {
                paymentSummaryUiModelMapper$groupRepaymentsIntoSections$1.getOutputStallDuration -= 2147483648;
                java.lang.Object obj = paymentSummaryUiModelMapper$groupRepaymentsIntoSections$1.getOutputMinFrameDurationlomOqCM;
                java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = paymentSummaryUiModelMapper$groupRepaymentsIntoSections$1.getOutputStallDuration;
                int i3 = 2;
                int i4 = 1;
                if (i != 0) {
                    kotlin.ResultKt.throwOnFailure(obj);
                    linkedHashMap = new java.util.LinkedHashMap();
                    for (java.lang.Object obj2 : list) {
                        com.paypal.oslo.feature.revolvingcreditservicing.domain.model.repayment.RepaymentStatus status = ((com.paypal.oslo.feature.revolvingcreditservicing.domain.model.repayment.RepaymentActivity) obj2).getStatus();
                        java.lang.Object obj3 = linkedHashMap.get(status);
                        if (obj3 == null) {
                            obj3 = (java.util.List) new java.util.ArrayList();
                            linkedHashMap.put(status, obj3);
                        }
                        ((java.util.List) obj3).add(obj2);
                    }
                    paymentSectionUiModelArr = new com.paypal.oslo.feature.revolvingcreditservicing.ui.paymentsummary.uimodel.PaymentSectionUiModel[3];
                    java.util.List<com.paypal.oslo.feature.revolvingcreditservicing.domain.model.repayment.RepaymentActivity> list6 = (java.util.List) linkedHashMap.get(com.paypal.oslo.feature.revolvingcreditservicing.domain.model.repayment.RepaymentStatus.UPCOMING);
                    if (list6 != null) {
                        com.paypal.oslo.feature.revolvingcreditservicing.ui.paymentsummary.uimodel.SectionType sectionType4 = com.paypal.oslo.feature.revolvingcreditservicing.ui.paymentsummary.uimodel.SectionType.Upcoming;
                        paymentSummaryUiModelMapper$groupRepaymentsIntoSections$1.getHighSpeedVideoFpsRanges = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(list);
                        paymentSummaryUiModelMapper$groupRepaymentsIntoSections$1.getHighSpeedVideoSizes = locale;
                        paymentSummaryUiModelMapper$groupRepaymentsIntoSections$1.Camera2StreamConfigurationMap = creditProductIdentifier;
                        paymentSummaryUiModelMapper$groupRepaymentsIntoSections$1.getOutputFormats = linkedHashMap;
                        paymentSummaryUiModelMapper$groupRepaymentsIntoSections$1.getOutputMinFrameDuration = paymentSectionUiModelArr;
                        paymentSummaryUiModelMapper$groupRepaymentsIntoSections$1.getInputFormats = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(list6);
                        paymentSummaryUiModelMapper$groupRepaymentsIntoSections$1.getInputSizeshNQ4ISI = sectionType4;
                        paymentSummaryUiModelMapper$groupRepaymentsIntoSections$1.getHighSpeedVideoSizesFor = paymentSectionUiModelArr;
                        paymentSummaryUiModelMapper$groupRepaymentsIntoSections$1.getHighSpeedVideoFpsRangesFor = 0;
                        paymentSummaryUiModelMapper$groupRepaymentsIntoSections$1.getHighResolutionOutputSizeshNQ4ISI = 0;
                        paymentSummaryUiModelMapper$groupRepaymentsIntoSections$1.getOutputStallDuration = 1;
                        java.lang.Object highResolutionOutputSizeshNQ4ISI = getHighResolutionOutputSizeshNQ4ISI(list6, locale, creditProductIdentifier, paymentSummaryUiModelMapper$groupRepaymentsIntoSections$1);
                        if (highResolutionOutputSizeshNQ4ISI != coroutine_suspended) {
                            locale2 = locale;
                            creditProductIdentifier2 = creditProductIdentifier;
                            paymentSectionUiModelArr3 = paymentSectionUiModelArr;
                            paymentSectionUiModelArr4 = paymentSectionUiModelArr3;
                            obj = highResolutionOutputSizeshNQ4ISI;
                            sectionType = sectionType4;
                            i2 = 0;
                            list2 = list;
                        }
                        return coroutine_suspended;
                    }
                    list2 = list;
                    locale2 = locale;
                    creditProductIdentifier2 = creditProductIdentifier;
                    paymentSectionUiModelArr2 = paymentSectionUiModelArr;
                    i2 = 0;
                    map = linkedHashMap;
                    paymentSectionUiModel = null;
                    paymentSectionUiModelArr[i2] = paymentSectionUiModel;
                    list3 = (java.util.List) map.get(com.paypal.oslo.feature.revolvingcreditservicing.domain.model.repayment.RepaymentStatus.PENDING);
                    if (list3 != null) {
                        sectionType2 = com.paypal.oslo.feature.revolvingcreditservicing.ui.paymentsummary.uimodel.SectionType.Pending;
                        paymentSummaryUiModelMapper$groupRepaymentsIntoSections$1.getHighSpeedVideoFpsRanges = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(list2);
                        paymentSummaryUiModelMapper$groupRepaymentsIntoSections$1.getHighSpeedVideoSizes = locale2;
                        paymentSummaryUiModelMapper$groupRepaymentsIntoSections$1.Camera2StreamConfigurationMap = creditProductIdentifier2;
                        paymentSummaryUiModelMapper$groupRepaymentsIntoSections$1.getOutputFormats = map;
                        paymentSummaryUiModelMapper$groupRepaymentsIntoSections$1.getOutputMinFrameDuration = paymentSectionUiModelArr2;
                        paymentSummaryUiModelMapper$groupRepaymentsIntoSections$1.getInputFormats = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(list3);
                        paymentSummaryUiModelMapper$groupRepaymentsIntoSections$1.getInputSizeshNQ4ISI = sectionType2;
                        paymentSummaryUiModelMapper$groupRepaymentsIntoSections$1.getHighSpeedVideoSizesFor = paymentSectionUiModelArr2;
                        paymentSummaryUiModelMapper$groupRepaymentsIntoSections$1.getHighSpeedVideoFpsRangesFor = 0;
                        paymentSummaryUiModelMapper$groupRepaymentsIntoSections$1.getHighResolutionOutputSizeshNQ4ISI = 1;
                        paymentSummaryUiModelMapper$groupRepaymentsIntoSections$1.getOutputStallDuration = 2;
                        obj = getHighResolutionOutputSizeshNQ4ISI(list3, locale2, creditProductIdentifier2, paymentSummaryUiModelMapper$groupRepaymentsIntoSections$1);
                        if (obj != coroutine_suspended) {
                            paymentSectionUiModelArr5 = paymentSectionUiModelArr2;
                            creditProductIdentifier3 = creditProductIdentifier2;
                            locale4 = locale2;
                            list4 = list2;
                            paymentSectionUiModel2 = new com.paypal.oslo.feature.revolvingcreditservicing.ui.paymentsummary.uimodel.PaymentSectionUiModel(sectionType2, (java.util.List) obj);
                            locale3 = locale4;
                            creditProductIdentifier2 = creditProductIdentifier3;
                            paymentSectionUiModelArr2[i4] = paymentSectionUiModel2;
                            list5 = (java.util.List) map.get(com.paypal.oslo.feature.revolvingcreditservicing.domain.model.repayment.RepaymentStatus.COMPLETED);
                            if (list5 == null) {
                            }
                        }
                        return coroutine_suspended;
                    }
                    paymentSectionUiModelArr5 = paymentSectionUiModelArr2;
                    locale3 = locale2;
                    list4 = list2;
                    paymentSectionUiModel2 = null;
                    paymentSectionUiModelArr2[i4] = paymentSectionUiModel2;
                    list5 = (java.util.List) map.get(com.paypal.oslo.feature.revolvingcreditservicing.domain.model.repayment.RepaymentStatus.COMPLETED);
                    if (list5 == null) {
                    }
                } else {
                    if (i != 1) {
                        if (i != 2) {
                            if (i != 3) {
                                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                            int i5 = paymentSummaryUiModelMapper$groupRepaymentsIntoSections$1.getHighResolutionOutputSizeshNQ4ISI;
                            int i6 = paymentSummaryUiModelMapper$groupRepaymentsIntoSections$1.getHighSpeedVideoFpsRangesFor;
                            paymentSectionUiModelArr7 = (com.paypal.oslo.feature.revolvingcreditservicing.ui.paymentsummary.uimodel.PaymentSectionUiModel[]) paymentSummaryUiModelMapper$groupRepaymentsIntoSections$1.getHighSpeedVideoSizesFor;
                            sectionType3 = (com.paypal.oslo.feature.revolvingcreditservicing.ui.paymentsummary.uimodel.SectionType) paymentSummaryUiModelMapper$groupRepaymentsIntoSections$1.getInputSizeshNQ4ISI;
                            paymentSectionUiModelArr6 = (com.paypal.oslo.feature.revolvingcreditservicing.ui.paymentsummary.uimodel.PaymentSectionUiModel[]) paymentSummaryUiModelMapper$groupRepaymentsIntoSections$1.getOutputMinFrameDuration;
                            kotlin.ResultKt.throwOnFailure(obj);
                            i3 = i5;
                            paymentSectionUiModel3 = new com.paypal.oslo.feature.revolvingcreditservicing.ui.paymentsummary.uimodel.PaymentSectionUiModel(sectionType3, (java.util.List) obj);
                            paymentSectionUiModelArr5 = paymentSectionUiModelArr7;
                            paymentSectionUiModelArr5[i3] = paymentSectionUiModel3;
                            return kotlin.collections.CollectionsKt.listOfNotNull((java.lang.Object[]) paymentSectionUiModelArr6);
                        }
                        int i7 = paymentSummaryUiModelMapper$groupRepaymentsIntoSections$1.getHighResolutionOutputSizeshNQ4ISI;
                        int i8 = paymentSummaryUiModelMapper$groupRepaymentsIntoSections$1.getHighSpeedVideoFpsRangesFor;
                        paymentSectionUiModelArr2 = (com.paypal.oslo.feature.revolvingcreditservicing.ui.paymentsummary.uimodel.PaymentSectionUiModel[]) paymentSummaryUiModelMapper$groupRepaymentsIntoSections$1.getHighSpeedVideoSizesFor;
                        sectionType2 = (com.paypal.oslo.feature.revolvingcreditservicing.ui.paymentsummary.uimodel.SectionType) paymentSummaryUiModelMapper$groupRepaymentsIntoSections$1.getInputSizeshNQ4ISI;
                        com.paypal.oslo.feature.revolvingcreditservicing.ui.paymentsummary.uimodel.PaymentSectionUiModel[] paymentSectionUiModelArr8 = (com.paypal.oslo.feature.revolvingcreditservicing.ui.paymentsummary.uimodel.PaymentSectionUiModel[]) paymentSummaryUiModelMapper$groupRepaymentsIntoSections$1.getOutputMinFrameDuration;
                        map = (java.util.Map) paymentSummaryUiModelMapper$groupRepaymentsIntoSections$1.getOutputFormats;
                        creditProductIdentifier3 = (com.paypal.oslo.feature.revolvingcreditservicing.api.model.CreditProductIdentifier) paymentSummaryUiModelMapper$groupRepaymentsIntoSections$1.Camera2StreamConfigurationMap;
                        locale4 = (java.util.Locale) paymentSummaryUiModelMapper$groupRepaymentsIntoSections$1.getHighSpeedVideoSizes;
                        list4 = (java.util.List) paymentSummaryUiModelMapper$groupRepaymentsIntoSections$1.getHighSpeedVideoFpsRanges;
                        kotlin.ResultKt.throwOnFailure(obj);
                        i4 = i7;
                        paymentSectionUiModelArr5 = paymentSectionUiModelArr8;
                        paymentSectionUiModel2 = new com.paypal.oslo.feature.revolvingcreditservicing.ui.paymentsummary.uimodel.PaymentSectionUiModel(sectionType2, (java.util.List) obj);
                        locale3 = locale4;
                        creditProductIdentifier2 = creditProductIdentifier3;
                        paymentSectionUiModelArr2[i4] = paymentSectionUiModel2;
                        list5 = (java.util.List) map.get(com.paypal.oslo.feature.revolvingcreditservicing.domain.model.repayment.RepaymentStatus.COMPLETED);
                        if (list5 == null) {
                            paymentSectionUiModelArr6 = paymentSectionUiModelArr5;
                            paymentSectionUiModel3 = null;
                            paymentSectionUiModelArr5[i3] = paymentSectionUiModel3;
                            return kotlin.collections.CollectionsKt.listOfNotNull((java.lang.Object[]) paymentSectionUiModelArr6);
                        }
                        com.paypal.oslo.feature.revolvingcreditservicing.ui.paymentsummary.uimodel.SectionType sectionType5 = com.paypal.oslo.feature.revolvingcreditservicing.ui.paymentsummary.uimodel.SectionType.Completed;
                        paymentSummaryUiModelMapper$groupRepaymentsIntoSections$1.getHighSpeedVideoFpsRanges = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(list4);
                        paymentSummaryUiModelMapper$groupRepaymentsIntoSections$1.getHighSpeedVideoSizes = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(locale3);
                        paymentSummaryUiModelMapper$groupRepaymentsIntoSections$1.Camera2StreamConfigurationMap = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(creditProductIdentifier2);
                        paymentSummaryUiModelMapper$groupRepaymentsIntoSections$1.getOutputFormats = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(map);
                        paymentSummaryUiModelMapper$groupRepaymentsIntoSections$1.getOutputMinFrameDuration = paymentSectionUiModelArr5;
                        paymentSummaryUiModelMapper$groupRepaymentsIntoSections$1.getInputFormats = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(list5);
                        paymentSummaryUiModelMapper$groupRepaymentsIntoSections$1.getInputSizeshNQ4ISI = sectionType5;
                        paymentSummaryUiModelMapper$groupRepaymentsIntoSections$1.getHighSpeedVideoSizesFor = paymentSectionUiModelArr5;
                        paymentSummaryUiModelMapper$groupRepaymentsIntoSections$1.getHighSpeedVideoFpsRangesFor = 0;
                        paymentSummaryUiModelMapper$groupRepaymentsIntoSections$1.getHighResolutionOutputSizeshNQ4ISI = 2;
                        paymentSummaryUiModelMapper$groupRepaymentsIntoSections$1.getOutputStallDuration = 3;
                        obj = getHighResolutionOutputSizeshNQ4ISI(list5, locale3, creditProductIdentifier2, paymentSummaryUiModelMapper$groupRepaymentsIntoSections$1);
                        if (obj != coroutine_suspended) {
                            paymentSectionUiModelArr7 = paymentSectionUiModelArr5;
                            sectionType3 = sectionType5;
                            paymentSectionUiModelArr6 = paymentSectionUiModelArr7;
                            paymentSectionUiModel3 = new com.paypal.oslo.feature.revolvingcreditservicing.ui.paymentsummary.uimodel.PaymentSectionUiModel(sectionType3, (java.util.List) obj);
                            paymentSectionUiModelArr5 = paymentSectionUiModelArr7;
                            paymentSectionUiModelArr5[i3] = paymentSectionUiModel3;
                            return kotlin.collections.CollectionsKt.listOfNotNull((java.lang.Object[]) paymentSectionUiModelArr6);
                        }
                        return coroutine_suspended;
                    }
                    i2 = paymentSummaryUiModelMapper$groupRepaymentsIntoSections$1.getHighResolutionOutputSizeshNQ4ISI;
                    int i9 = paymentSummaryUiModelMapper$groupRepaymentsIntoSections$1.getHighSpeedVideoFpsRangesFor;
                    paymentSectionUiModelArr3 = (com.paypal.oslo.feature.revolvingcreditservicing.ui.paymentsummary.uimodel.PaymentSectionUiModel[]) paymentSummaryUiModelMapper$groupRepaymentsIntoSections$1.getHighSpeedVideoSizesFor;
                    sectionType = (com.paypal.oslo.feature.revolvingcreditservicing.ui.paymentsummary.uimodel.SectionType) paymentSummaryUiModelMapper$groupRepaymentsIntoSections$1.getInputSizeshNQ4ISI;
                    paymentSectionUiModelArr4 = (com.paypal.oslo.feature.revolvingcreditservicing.ui.paymentsummary.uimodel.PaymentSectionUiModel[]) paymentSummaryUiModelMapper$groupRepaymentsIntoSections$1.getOutputMinFrameDuration;
                    linkedHashMap = (java.util.Map) paymentSummaryUiModelMapper$groupRepaymentsIntoSections$1.getOutputFormats;
                    creditProductIdentifier2 = (com.paypal.oslo.feature.revolvingcreditservicing.api.model.CreditProductIdentifier) paymentSummaryUiModelMapper$groupRepaymentsIntoSections$1.Camera2StreamConfigurationMap;
                    locale2 = (java.util.Locale) paymentSummaryUiModelMapper$groupRepaymentsIntoSections$1.getHighSpeedVideoSizes;
                    list2 = (java.util.List) paymentSummaryUiModelMapper$groupRepaymentsIntoSections$1.getHighSpeedVideoFpsRanges;
                    kotlin.ResultKt.throwOnFailure(obj);
                }
                paymentSectionUiModel = new com.paypal.oslo.feature.revolvingcreditservicing.ui.paymentsummary.uimodel.PaymentSectionUiModel(sectionType, (java.util.List) obj);
                paymentSectionUiModelArr = paymentSectionUiModelArr3;
                paymentSectionUiModelArr2 = paymentSectionUiModelArr4;
                map = linkedHashMap;
                paymentSectionUiModelArr[i2] = paymentSectionUiModel;
                list3 = (java.util.List) map.get(com.paypal.oslo.feature.revolvingcreditservicing.domain.model.repayment.RepaymentStatus.PENDING);
                if (list3 != null) {
                }
            }
        }
        paymentSummaryUiModelMapper$groupRepaymentsIntoSections$1 = new com.paypal.oslo.feature.revolvingcreditservicing.ui.paymentsummary.mapper.PaymentSummaryUiModelMapper$groupRepaymentsIntoSections$1(this, continuation);
        java.lang.Object obj4 = paymentSummaryUiModelMapper$groupRepaymentsIntoSections$1.getOutputMinFrameDurationlomOqCM;
        java.lang.Object coroutine_suspended2 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = paymentSummaryUiModelMapper$groupRepaymentsIntoSections$1.getOutputStallDuration;
        int i32 = 2;
        int i42 = 1;
        if (i != 0) {
        }
        paymentSectionUiModel = new com.paypal.oslo.feature.revolvingcreditservicing.ui.paymentsummary.uimodel.PaymentSectionUiModel(sectionType, (java.util.List) obj4);
        paymentSectionUiModelArr = paymentSectionUiModelArr3;
        paymentSectionUiModelArr2 = paymentSectionUiModelArr4;
        map = linkedHashMap;
        paymentSectionUiModelArr[i2] = paymentSectionUiModel;
        list3 = (java.util.List) map.get(com.paypal.oslo.feature.revolvingcreditservicing.domain.model.repayment.RepaymentStatus.PENDING);
        if (list3 != null) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:13:0x00a6  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0134  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0079  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0028  */
    /* JADX WARN: Type inference failed for: r12v4, types: [java.util.Collection] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:17:0x0111 -> B:10:0x011a). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object getHighResolutionOutputSizeshNQ4ISI(java.util.List<com.paypal.oslo.feature.revolvingcreditservicing.domain.model.repayment.RepaymentActivity> list, java.util.Locale locale, com.paypal.oslo.feature.revolvingcreditservicing.api.model.CreditProductIdentifier creditProductIdentifier, kotlin.coroutines.Continuation<? super java.util.List<com.paypal.oslo.feature.revolvingcreditservicing.ui.paymentsummary.uimodel.RepaymentActivityUiModel>> continuation) {
        com.paypal.oslo.feature.revolvingcreditservicing.ui.paymentsummary.mapper.PaymentSummaryUiModelMapper$mapRepaymentActivitiesToUiModel$1 paymentSummaryUiModelMapper$mapRepaymentActivitiesToUiModel$1;
        int i;
        java.lang.Object obj;
        java.lang.Object obj2;
        com.paypal.oslo.feature.revolvingcreditservicing.ui.paymentsummary.mapper.PaymentSummaryUiModelMapper$mapRepaymentActivitiesToUiModel$1 paymentSummaryUiModelMapper$mapRepaymentActivitiesToUiModel$12;
        java.util.ArrayList arrayList;
        java.util.Iterator it;
        int i2;
        int i3;
        java.util.List<com.paypal.oslo.feature.revolvingcreditservicing.domain.model.repayment.RepaymentActivity> list2;
        java.util.Locale locale2;
        com.paypal.oslo.feature.revolvingcreditservicing.api.model.CreditProductIdentifier creditProductIdentifier2;
        if (continuation instanceof com.paypal.oslo.feature.revolvingcreditservicing.ui.paymentsummary.mapper.PaymentSummaryUiModelMapper$mapRepaymentActivitiesToUiModel$1) {
            paymentSummaryUiModelMapper$mapRepaymentActivitiesToUiModel$1 = (com.paypal.oslo.feature.revolvingcreditservicing.ui.paymentsummary.mapper.PaymentSummaryUiModelMapper$mapRepaymentActivitiesToUiModel$1) continuation;
            if ((paymentSummaryUiModelMapper$mapRepaymentActivitiesToUiModel$1.unwrapAs & Integer.MIN_VALUE) != 0) {
                paymentSummaryUiModelMapper$mapRepaymentActivitiesToUiModel$1.unwrapAs -= 2147483648;
                java.lang.Object obj3 = paymentSummaryUiModelMapper$mapRepaymentActivitiesToUiModel$1.isOutputSupportedForhNQ4ISI;
                java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = paymentSummaryUiModelMapper$mapRepaymentActivitiesToUiModel$1.unwrapAs;
                if (i != 0) {
                    kotlin.ResultKt.throwOnFailure(obj3);
                    java.util.List<com.paypal.oslo.feature.revolvingcreditservicing.domain.model.repayment.RepaymentActivity> list3 = list;
                    obj = list3;
                    obj2 = obj;
                    paymentSummaryUiModelMapper$mapRepaymentActivitiesToUiModel$12 = paymentSummaryUiModelMapper$mapRepaymentActivitiesToUiModel$1;
                    arrayList = new java.util.ArrayList(kotlin.collections.CollectionsKt.collectionSizeOrDefault(list3, 10));
                    it = list3.iterator();
                    i2 = 0;
                    i3 = 0;
                    list2 = list;
                    locale2 = locale;
                    creditProductIdentifier2 = creditProductIdentifier;
                    if (it.hasNext()) {
                    }
                } else {
                    if (i != 1) {
                        throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    int i4 = paymentSummaryUiModelMapper$mapRepaymentActivitiesToUiModel$1.getHighResolutionOutputSizeshNQ4ISI;
                    int i5 = paymentSummaryUiModelMapper$mapRepaymentActivitiesToUiModel$1.Camera2StreamConfigurationMap;
                    int i6 = paymentSummaryUiModelMapper$mapRepaymentActivitiesToUiModel$1.getHighSpeedVideoFpsRanges;
                    java.util.Collection collection = (java.util.Collection) paymentSummaryUiModelMapper$mapRepaymentActivitiesToUiModel$1.getHighSpeedVideoSizesFor;
                    com.paypal.oslo.feature.revolvingcreditservicing.domain.model.repayment.RepaymentActivity repaymentActivity = (com.paypal.oslo.feature.revolvingcreditservicing.domain.model.repayment.RepaymentActivity) paymentSummaryUiModelMapper$mapRepaymentActivitiesToUiModel$1.getInputSizeshNQ4ISI;
                    com.paypal.oslo.feature.revolvingcreditservicing.domain.model.repayment.RepaymentActivity repaymentActivity2 = (com.paypal.oslo.feature.revolvingcreditservicing.domain.model.repayment.RepaymentActivity) paymentSummaryUiModelMapper$mapRepaymentActivitiesToUiModel$1.getOutputSizeshNQ4ISI;
                    java.lang.Object obj4 = paymentSummaryUiModelMapper$mapRepaymentActivitiesToUiModel$1.getOutputStallDuration;
                    it = (java.util.Iterator) paymentSummaryUiModelMapper$mapRepaymentActivitiesToUiModel$1.getOutputSizes;
                    ?? r12 = (java.util.Collection) paymentSummaryUiModelMapper$mapRepaymentActivitiesToUiModel$1.getOutputStallDurationlomOqCM;
                    java.lang.Object obj5 = (java.lang.Iterable) paymentSummaryUiModelMapper$mapRepaymentActivitiesToUiModel$1.getOutputMinFrameDuration;
                    java.lang.Object obj6 = (java.lang.Iterable) paymentSummaryUiModelMapper$mapRepaymentActivitiesToUiModel$1.getInputFormats;
                    com.paypal.oslo.feature.revolvingcreditservicing.api.model.CreditProductIdentifier creditProductIdentifier3 = (com.paypal.oslo.feature.revolvingcreditservicing.api.model.CreditProductIdentifier) paymentSummaryUiModelMapper$mapRepaymentActivitiesToUiModel$1.getOutputFormats;
                    java.util.Locale locale3 = (java.util.Locale) paymentSummaryUiModelMapper$mapRepaymentActivitiesToUiModel$1.getHighSpeedVideoFpsRangesFor;
                    java.util.List<com.paypal.oslo.feature.revolvingcreditservicing.domain.model.repayment.RepaymentActivity> list4 = (java.util.List) paymentSummaryUiModelMapper$mapRepaymentActivitiesToUiModel$1.getHighSpeedVideoSizes;
                    kotlin.ResultKt.throwOnFailure(obj3);
                    obj = obj5;
                    obj2 = obj6;
                    i2 = i5;
                    i3 = i6;
                    creditProductIdentifier2 = creditProductIdentifier3;
                    arrayList = r12;
                    paymentSummaryUiModelMapper$mapRepaymentActivitiesToUiModel$12 = paymentSummaryUiModelMapper$mapRepaymentActivitiesToUiModel$1;
                    locale2 = locale3;
                    collection.add(com.paypal.oslo.feature.revolvingcreditservicing.ui.paymentsummary.mapper.RepaymentActivityUiModelMapperKt.toUiModel(repaymentActivity, (java.lang.String) obj3, this.getHighSpeedVideoFpsRanges.format(repaymentActivity2.getPaymentTime(), com.paypal.oslo.feature.revolvingcreditservicing.domain.formatter.date.DateFormat.DateMonthDayShort.INSTANCE, locale2), creditProductIdentifier2));
                    list2 = list4;
                    if (it.hasNext()) {
                        java.lang.Object next = it.next();
                        com.paypal.oslo.feature.revolvingcreditservicing.domain.model.repayment.RepaymentActivity repaymentActivity3 = (com.paypal.oslo.feature.revolvingcreditservicing.domain.model.repayment.RepaymentActivity) next;
                        com.paypal.oslo.feature.revolvingcreditservicing.domain.model.repayment.RepaymentActivity ensureNegativeAmount = com.paypal.oslo.feature.revolvingcreditservicing.domain.model.repayment.RepaymentActivityKt.ensureNegativeAmount(repaymentActivity3);
                        com.paypal.oslo.feature.revolvingcreditservicing.domain.formatter.currency.CurrencyFormatterFacade currencyFormatterFacade = this.getHighSpeedVideoFpsRangesFor;
                        com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.core.CurrencyAmount camera2StreamConfigurationMap = ensureNegativeAmount.getCamera2StreamConfigurationMap();
                        paymentSummaryUiModelMapper$mapRepaymentActivitiesToUiModel$12.getHighSpeedVideoSizes = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(list2);
                        paymentSummaryUiModelMapper$mapRepaymentActivitiesToUiModel$12.getHighSpeedVideoFpsRangesFor = locale2;
                        paymentSummaryUiModelMapper$mapRepaymentActivitiesToUiModel$12.getOutputFormats = creditProductIdentifier2;
                        paymentSummaryUiModelMapper$mapRepaymentActivitiesToUiModel$12.getInputFormats = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(obj2);
                        paymentSummaryUiModelMapper$mapRepaymentActivitiesToUiModel$12.getOutputMinFrameDuration = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(obj);
                        paymentSummaryUiModelMapper$mapRepaymentActivitiesToUiModel$12.getOutputStallDurationlomOqCM = arrayList;
                        paymentSummaryUiModelMapper$mapRepaymentActivitiesToUiModel$12.getOutputSizes = it;
                        paymentSummaryUiModelMapper$mapRepaymentActivitiesToUiModel$12.getOutputStallDuration = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(next);
                        paymentSummaryUiModelMapper$mapRepaymentActivitiesToUiModel$12.getOutputSizeshNQ4ISI = repaymentActivity3;
                        paymentSummaryUiModelMapper$mapRepaymentActivitiesToUiModel$12.getOutputMinFrameDurationlomOqCM = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(ensureNegativeAmount);
                        paymentSummaryUiModelMapper$mapRepaymentActivitiesToUiModel$12.getInputSizeshNQ4ISI = ensureNegativeAmount;
                        paymentSummaryUiModelMapper$mapRepaymentActivitiesToUiModel$12.getHighSpeedVideoSizesFor = arrayList;
                        paymentSummaryUiModelMapper$mapRepaymentActivitiesToUiModel$12.getHighSpeedVideoFpsRanges = i3;
                        paymentSummaryUiModelMapper$mapRepaymentActivitiesToUiModel$12.Camera2StreamConfigurationMap = i2;
                        paymentSummaryUiModelMapper$mapRepaymentActivitiesToUiModel$12.getHighResolutionOutputSizeshNQ4ISI = 0;
                        paymentSummaryUiModelMapper$mapRepaymentActivitiesToUiModel$12.unwrapAs = 1;
                        java.util.Iterator it2 = it;
                        java.lang.Object format$default = com.paypal.oslo.feature.revolvingcreditservicing.domain.formatter.currency.CurrencyFormatterFacade.format$default(currencyFormatterFacade, camera2StreamConfigurationMap, null, 0, paymentSummaryUiModelMapper$mapRepaymentActivitiesToUiModel$12, 6, null);
                        if (format$default == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                        list4 = list2;
                        obj3 = format$default;
                        collection = arrayList;
                        repaymentActivity = ensureNegativeAmount;
                        it = it2;
                        repaymentActivity2 = repaymentActivity3;
                        collection.add(com.paypal.oslo.feature.revolvingcreditservicing.ui.paymentsummary.mapper.RepaymentActivityUiModelMapperKt.toUiModel(repaymentActivity, (java.lang.String) obj3, this.getHighSpeedVideoFpsRanges.format(repaymentActivity2.getPaymentTime(), com.paypal.oslo.feature.revolvingcreditservicing.domain.formatter.date.DateFormat.DateMonthDayShort.INSTANCE, locale2), creditProductIdentifier2));
                        list2 = list4;
                        if (it.hasNext()) {
                            return arrayList;
                        }
                    }
                }
            }
        }
        paymentSummaryUiModelMapper$mapRepaymentActivitiesToUiModel$1 = new com.paypal.oslo.feature.revolvingcreditservicing.ui.paymentsummary.mapper.PaymentSummaryUiModelMapper$mapRepaymentActivitiesToUiModel$1(this, continuation);
        java.lang.Object obj32 = paymentSummaryUiModelMapper$mapRepaymentActivitiesToUiModel$1.isOutputSupportedForhNQ4ISI;
        java.lang.Object coroutine_suspended2 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = paymentSummaryUiModelMapper$mapRepaymentActivitiesToUiModel$1.unwrapAs;
        if (i != 0) {
        }
    }

    @kotlin.Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[com.paypal.oslo.feature.revolvingcreditservicing.domain.model.autopay.PaymentOption.values().length];
            try {
                iArr[com.paypal.oslo.feature.revolvingcreditservicing.domain.model.autopay.PaymentOption.MINIMUM_PAYMENT_DUE.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused) {
            }
            try {
                iArr[com.paypal.oslo.feature.revolvingcreditservicing.domain.model.autopay.PaymentOption.STATEMENT_BALANCE.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused2) {
            }
            try {
                iArr[com.paypal.oslo.feature.revolvingcreditservicing.domain.model.autopay.PaymentOption.CURRENT_BALANCE.ordinal()] = 3;
            } catch (java.lang.NoSuchFieldError unused3) {
            }
            try {
                iArr[com.paypal.oslo.feature.revolvingcreditservicing.domain.model.autopay.PaymentOption.CUSTOM_AMOUNT.ordinal()] = 4;
            } catch (java.lang.NoSuchFieldError unused4) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }
}
