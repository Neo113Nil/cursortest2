package com.paypal.oslo.feature.revolvingcreditservicing.ui.makeapayment.selectamount.mapper;

@kotlin.Metadata(d1 = {"\u0000t\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\n\b\u0000\u0018\u00002\u00020\u0001B)\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJB\u0010\u0017\u001a\u00020\u00162\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u000e2\b\b\u0002\u0010\u0011\u001a\u00020\u00102\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u00122\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u0014H\u0086@¢\u0006\u0004\b\u0017\u0010\u0018J,\u0010\u001d\u001a\u000e\u0012\u0004\u0012\u00020\u0012\u0012\u0004\u0012\u00020\u001c0\u001b2\u0006\u0010\u0019\u001a\u00020\f2\u0006\u0010\u001a\u001a\u00020\u000eH\u0082@¢\u0006\u0004\b\u001d\u0010\u001eJ \u0010 \u001a\u00020\u001f2\u0006\u0010\u0019\u001a\u00020\f2\u0006\u0010\u001a\u001a\u00020\u000eH\u0082@¢\u0006\u0004\b \u0010\u001eJ\u001a\u0010\u001d\u001a\u00020\"2\b\u0010\u0019\u001a\u0004\u0018\u00010!H\u0082@¢\u0006\u0004\b\u001d\u0010#J\u0017\u0010%\u001a\u0004\u0018\u00010$2\u0006\u0010\r\u001a\u00020\f¢\u0006\u0004\b%\u0010&J\r\u0010(\u001a\u00020'¢\u0006\u0004\b(\u0010)J\r\u0010*\u001a\u00020'¢\u0006\u0004\b*\u0010)R\u0014\u0010-\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b+\u0010,R\u0014\u0010\u001d\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001d\u0010.R\u0014\u00100\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b \u0010/R\u0014\u0010+\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b-\u00101"}, d2 = {"Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/makeapayment/selectamount/mapper/SelectAmountMapper;", "", "Lcom/paypal/oslo/feature/revolvingcreditservicing/domain/formatter/currency/CurrencyFormatterFacade;", "currencyFormatterFacade", "Lcom/paypal/oslo/feature/revolvingcreditservicing/domain/formatter/date/DateFormatterFacade;", "dateFormatterFacade", "Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/accountsummary/mapper/BalanceModuleUiMapper;", "balanceModuleUiMapper", "Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/common/components/mapper/ScheduledPaymentInfoMapper;", "scheduledPaymentInfoMapper", "<init>", "(Lcom/paypal/oslo/feature/revolvingcreditservicing/domain/formatter/currency/CurrencyFormatterFacade;Lcom/paypal/oslo/feature/revolvingcreditservicing/domain/formatter/date/DateFormatterFacade;Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/accountsummary/mapper/BalanceModuleUiMapper;Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/common/components/mapper/ScheduledPaymentInfoMapper;)V", "Lcom/paypal/oslo/feature/revolvingcreditservicing/domain/model/accountsummary/PaymentOptions;", "paymentOptions", "Lcom/paypal/oslo/feature/revolvingcreditservicing/api/model/CreditProductIdentifier;", "creditProductIdentifier", "Ljava/math/BigDecimal;", "selectedAmount", "Lcom/paypal/oslo/feature/revolvingcreditservicing/domain/model/autopay/PaymentOption;", com.paypal.oslo.feature.p2p.domain.constants.P2pConstants.Log.Attributes.SELECTED_OPTION, "Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/common/components/UiString;", "generalErrorMessage", "Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/makeapayment/selectamount/uimodel/SelectAmountScreenUiModel;", "getSelectAmountScreenUiModel", "(Lcom/paypal/oslo/feature/revolvingcreditservicing/domain/model/accountsummary/PaymentOptions;Lcom/paypal/oslo/feature/revolvingcreditservicing/api/model/CreditProductIdentifier;Ljava/math/BigDecimal;Lcom/paypal/oslo/feature/revolvingcreditservicing/domain/model/autopay/PaymentOption;Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/common/components/UiString;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "p0", "p1", "", "Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/common/components/selectamount/uimodel/SelectAmountOptionUiModel;", "Camera2StreamConfigurationMap", "(Lcom/paypal/oslo/feature/revolvingcreditservicing/domain/model/accountsummary/PaymentOptions;Lcom/paypal/oslo/feature/revolvingcreditservicing/api/model/CreditProductIdentifier;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/makeapayment/selectamount/uimodel/AutopayCardUiModel;", "getHighSpeedVideoSizes", "Lcom/paypal/oslo/feature/revolvingcreditservicing/domain/model/common/core/CurrencyAmount;", "", "(Lcom/paypal/oslo/feature/revolvingcreditservicing/domain/model/common/core/CurrencyAmount;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Ljava/time/LocalDate;", "getDueDate", "(Lcom/paypal/oslo/feature/revolvingcreditservicing/domain/model/accountsummary/PaymentOptions;)Ljava/time/LocalDate;", "Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/common/components/error/ErrorUiModel;", "getMaxAllowableErrorUiModel", "()Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/common/components/error/ErrorUiModel;", "getGenericErrorUiModel", "getHighResolutionOutputSizeshNQ4ISI", "Lcom/paypal/oslo/feature/revolvingcreditservicing/domain/formatter/currency/CurrencyFormatterFacade;", "getHighSpeedVideoFpsRangesFor", "Lcom/paypal/oslo/feature/revolvingcreditservicing/domain/formatter/date/DateFormatterFacade;", "Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/accountsummary/mapper/BalanceModuleUiMapper;", "getHighSpeedVideoFpsRanges", "Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/common/components/mapper/ScheduledPaymentInfoMapper;"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class SelectAmountMapper {
    public static final int $stable = 0;
    private final com.paypal.oslo.feature.revolvingcreditservicing.domain.formatter.date.DateFormatterFacade Camera2StreamConfigurationMap;

    /* renamed from: getHighResolutionOutputSizeshNQ4ISI, reason: from kotlin metadata */
    private final com.paypal.oslo.feature.revolvingcreditservicing.domain.formatter.currency.CurrencyFormatterFacade getHighSpeedVideoFpsRangesFor;

    /* renamed from: getHighSpeedVideoFpsRangesFor, reason: from kotlin metadata */
    private final com.paypal.oslo.feature.revolvingcreditservicing.ui.common.components.mapper.ScheduledPaymentInfoMapper getHighResolutionOutputSizeshNQ4ISI;

    /* renamed from: getHighSpeedVideoSizes, reason: from kotlin metadata */
    private final com.paypal.oslo.feature.revolvingcreditservicing.ui.accountsummary.mapper.BalanceModuleUiMapper getHighSpeedVideoFpsRanges;

    @javax.inject.Inject
    public SelectAmountMapper(com.paypal.oslo.feature.revolvingcreditservicing.domain.formatter.currency.CurrencyFormatterFacade currencyFormatterFacade, com.paypal.oslo.feature.revolvingcreditservicing.domain.formatter.date.DateFormatterFacade dateFormatterFacade, com.paypal.oslo.feature.revolvingcreditservicing.ui.accountsummary.mapper.BalanceModuleUiMapper balanceModuleUiMapper, com.paypal.oslo.feature.revolvingcreditservicing.ui.common.components.mapper.ScheduledPaymentInfoMapper scheduledPaymentInfoMapper) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(currencyFormatterFacade, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(dateFormatterFacade, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(balanceModuleUiMapper, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(scheduledPaymentInfoMapper, "");
        this.getHighSpeedVideoFpsRangesFor = currencyFormatterFacade;
        this.Camera2StreamConfigurationMap = dateFormatterFacade;
        this.getHighSpeedVideoFpsRanges = balanceModuleUiMapper;
        this.getHighResolutionOutputSizeshNQ4ISI = scheduledPaymentInfoMapper;
    }

    /* JADX WARN: Code restructure failed: missing block: B:43:0x01c1, code lost:
    
        if (r3 != r5) goto L39;
     */
    /* JADX WARN: Removed duplicated region for block: B:48:0x016a  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x0134  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x00d7  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x002f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object getSelectAmountScreenUiModel(com.paypal.oslo.feature.revolvingcreditservicing.domain.model.accountsummary.PaymentOptions paymentOptions, com.paypal.oslo.feature.revolvingcreditservicing.api.model.CreditProductIdentifier creditProductIdentifier, java.math.BigDecimal bigDecimal, com.paypal.oslo.feature.revolvingcreditservicing.domain.model.autopay.PaymentOption paymentOption, com.paypal.oslo.feature.revolvingcreditservicing.ui.common.components.UiString uiString, kotlin.coroutines.Continuation<? super com.paypal.oslo.feature.revolvingcreditservicing.ui.makeapayment.selectamount.uimodel.SelectAmountScreenUiModel> continuation) {
        com.paypal.oslo.feature.revolvingcreditservicing.ui.makeapayment.selectamount.mapper.SelectAmountMapper$getSelectAmountScreenUiModel$1 selectAmountMapper$getSelectAmountScreenUiModel$1;
        java.lang.Object coroutine_suspended;
        int i;
        com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.core.CurrencyAmount currentBalance;
        com.paypal.oslo.feature.revolvingcreditservicing.domain.model.accountsummary.PaymentOptions paymentOptions2;
        com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.core.CurrencyAmount currencyAmount;
        com.paypal.oslo.feature.revolvingcreditservicing.api.model.CreditProductIdentifier creditProductIdentifier2;
        com.paypal.oslo.feature.revolvingcreditservicing.ui.common.components.UiString uiString2;
        java.math.BigDecimal bigDecimal2;
        com.paypal.oslo.feature.revolvingcreditservicing.domain.model.autopay.PaymentOption paymentOption2;
        java.lang.Object Camera2StreamConfigurationMap;
        com.paypal.oslo.feature.revolvingcreditservicing.ui.common.components.UiString uiString3;
        java.math.BigDecimal bigDecimal3;
        com.paypal.oslo.feature.revolvingcreditservicing.domain.model.accountsummary.PaymentOptions paymentOptions3;
        com.paypal.oslo.feature.revolvingcreditservicing.api.model.CreditProductIdentifier creditProductIdentifier3;
        java.math.BigDecimal bigDecimal4;
        com.paypal.oslo.feature.revolvingcreditservicing.domain.model.autopay.PaymentOption paymentOption3;
        java.util.Map map;
        java.lang.Object Camera2StreamConfigurationMap2;
        com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.core.CurrencyAmount currencyAmount2;
        java.math.BigDecimal bigDecimal5;
        java.lang.String str;
        java.util.Map map2;
        com.paypal.oslo.feature.revolvingcreditservicing.domain.model.accountsummary.PaymentOptions paymentOptions4;
        com.paypal.oslo.feature.revolvingcreditservicing.ui.common.components.selectamount.uimodel.SelectAmountUiModel selectAmountUiModel;
        boolean z;
        if (continuation instanceof com.paypal.oslo.feature.revolvingcreditservicing.ui.makeapayment.selectamount.mapper.SelectAmountMapper$getSelectAmountScreenUiModel$1) {
            selectAmountMapper$getSelectAmountScreenUiModel$1 = (com.paypal.oslo.feature.revolvingcreditservicing.ui.makeapayment.selectamount.mapper.SelectAmountMapper$getSelectAmountScreenUiModel$1) continuation;
            if ((selectAmountMapper$getSelectAmountScreenUiModel$1.getInputFormats & Integer.MIN_VALUE) != 0) {
                selectAmountMapper$getSelectAmountScreenUiModel$1.getInputFormats -= 2147483648;
                java.lang.Object obj = selectAmountMapper$getSelectAmountScreenUiModel$1.getOutputStallDurationlomOqCM;
                coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = selectAmountMapper$getSelectAmountScreenUiModel$1.getInputFormats;
                if (i != 0) {
                    kotlin.ResultKt.throwOnFailure(obj);
                    com.paypal.oslo.feature.revolvingcreditservicing.domain.model.accountsummary.Billing billing = paymentOptions.getBilling();
                    if ((billing == null || (currentBalance = billing.getMaxRepayableAmount()) == null) && (currentBalance = paymentOptions.getCurrentBalance()) == null) {
                        throw new java.lang.IllegalArgumentException("maxAmount cannot be null - either billing.maxRepayableAmount or currentBalance must be present".toString());
                    }
                    selectAmountMapper$getSelectAmountScreenUiModel$1.getHighResolutionOutputSizeshNQ4ISI = paymentOptions;
                    selectAmountMapper$getSelectAmountScreenUiModel$1.getHighSpeedVideoFpsRanges = creditProductIdentifier;
                    selectAmountMapper$getSelectAmountScreenUiModel$1.getHighSpeedVideoSizes = bigDecimal;
                    selectAmountMapper$getSelectAmountScreenUiModel$1.getHighSpeedVideoFpsRangesFor = paymentOption;
                    selectAmountMapper$getSelectAmountScreenUiModel$1.Camera2StreamConfigurationMap = uiString;
                    selectAmountMapper$getSelectAmountScreenUiModel$1.getOutputFormats = currentBalance;
                    selectAmountMapper$getSelectAmountScreenUiModel$1.getInputFormats = 1;
                    java.lang.Object Camera2StreamConfigurationMap3 = Camera2StreamConfigurationMap(paymentOptions, creditProductIdentifier, selectAmountMapper$getSelectAmountScreenUiModel$1);
                    if (Camera2StreamConfigurationMap3 != coroutine_suspended) {
                        paymentOptions2 = paymentOptions;
                        currencyAmount = currentBalance;
                        obj = Camera2StreamConfigurationMap3;
                        creditProductIdentifier2 = creditProductIdentifier;
                        uiString2 = uiString;
                        bigDecimal2 = bigDecimal;
                        paymentOption2 = paymentOption;
                    }
                    return coroutine_suspended;
                }
                if (i == 1) {
                    currencyAmount = (com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.core.CurrencyAmount) selectAmountMapper$getSelectAmountScreenUiModel$1.getOutputFormats;
                    uiString2 = (com.paypal.oslo.feature.revolvingcreditservicing.ui.common.components.UiString) selectAmountMapper$getSelectAmountScreenUiModel$1.Camera2StreamConfigurationMap;
                    paymentOption2 = (com.paypal.oslo.feature.revolvingcreditservicing.domain.model.autopay.PaymentOption) selectAmountMapper$getSelectAmountScreenUiModel$1.getHighSpeedVideoFpsRangesFor;
                    bigDecimal2 = (java.math.BigDecimal) selectAmountMapper$getSelectAmountScreenUiModel$1.getHighSpeedVideoSizes;
                    creditProductIdentifier2 = (com.paypal.oslo.feature.revolvingcreditservicing.api.model.CreditProductIdentifier) selectAmountMapper$getSelectAmountScreenUiModel$1.getHighSpeedVideoFpsRanges;
                    paymentOptions2 = (com.paypal.oslo.feature.revolvingcreditservicing.domain.model.accountsummary.PaymentOptions) selectAmountMapper$getSelectAmountScreenUiModel$1.getHighResolutionOutputSizeshNQ4ISI;
                    kotlin.ResultKt.throwOnFailure(obj);
                } else {
                    if (i == 2) {
                        java.math.BigDecimal bigDecimal6 = (java.math.BigDecimal) selectAmountMapper$getSelectAmountScreenUiModel$1.getHighSpeedVideoSizesFor;
                        java.util.Map map3 = (java.util.Map) selectAmountMapper$getSelectAmountScreenUiModel$1.getOutputMinFrameDuration;
                        com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.core.CurrencyAmount currencyAmount3 = (com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.core.CurrencyAmount) selectAmountMapper$getSelectAmountScreenUiModel$1.getOutputFormats;
                        uiString3 = (com.paypal.oslo.feature.revolvingcreditservicing.ui.common.components.UiString) selectAmountMapper$getSelectAmountScreenUiModel$1.Camera2StreamConfigurationMap;
                        paymentOption3 = (com.paypal.oslo.feature.revolvingcreditservicing.domain.model.autopay.PaymentOption) selectAmountMapper$getSelectAmountScreenUiModel$1.getHighSpeedVideoFpsRangesFor;
                        bigDecimal4 = (java.math.BigDecimal) selectAmountMapper$getSelectAmountScreenUiModel$1.getHighSpeedVideoSizes;
                        creditProductIdentifier3 = (com.paypal.oslo.feature.revolvingcreditservicing.api.model.CreditProductIdentifier) selectAmountMapper$getSelectAmountScreenUiModel$1.getHighSpeedVideoFpsRanges;
                        paymentOptions3 = (com.paypal.oslo.feature.revolvingcreditservicing.domain.model.accountsummary.PaymentOptions) selectAmountMapper$getSelectAmountScreenUiModel$1.getHighResolutionOutputSizeshNQ4ISI;
                        kotlin.ResultKt.throwOnFailure(obj);
                        bigDecimal3 = bigDecimal6;
                        currencyAmount = currencyAmount3;
                        map = map3;
                        java.lang.String str2 = (java.lang.String) obj;
                        com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.core.CurrencyAmount currencyAmount4 = new com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.core.CurrencyAmount(currencyAmount.getCurrencyCode(), "0");
                        selectAmountMapper$getSelectAmountScreenUiModel$1.getHighResolutionOutputSizeshNQ4ISI = paymentOptions3;
                        selectAmountMapper$getSelectAmountScreenUiModel$1.getHighSpeedVideoFpsRanges = creditProductIdentifier3;
                        selectAmountMapper$getSelectAmountScreenUiModel$1.getHighSpeedVideoSizes = bigDecimal4;
                        selectAmountMapper$getSelectAmountScreenUiModel$1.getHighSpeedVideoFpsRangesFor = paymentOption3;
                        selectAmountMapper$getSelectAmountScreenUiModel$1.Camera2StreamConfigurationMap = uiString3;
                        selectAmountMapper$getSelectAmountScreenUiModel$1.getOutputFormats = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(currencyAmount);
                        selectAmountMapper$getSelectAmountScreenUiModel$1.getOutputMinFrameDuration = map;
                        selectAmountMapper$getSelectAmountScreenUiModel$1.getHighSpeedVideoSizesFor = bigDecimal3;
                        selectAmountMapper$getSelectAmountScreenUiModel$1.getInputSizeshNQ4ISI = str2;
                        selectAmountMapper$getSelectAmountScreenUiModel$1.getInputFormats = 3;
                        Camera2StreamConfigurationMap2 = Camera2StreamConfigurationMap(currencyAmount4, selectAmountMapper$getSelectAmountScreenUiModel$1);
                        if (Camera2StreamConfigurationMap2 != coroutine_suspended) {
                            currencyAmount2 = currencyAmount;
                            bigDecimal5 = bigDecimal3;
                            str = str2;
                            map2 = map;
                            obj = Camera2StreamConfigurationMap2;
                            paymentOptions4 = paymentOptions3;
                            selectAmountUiModel = new com.paypal.oslo.feature.revolvingcreditservicing.ui.common.components.selectamount.uimodel.SelectAmountUiModel(map2, paymentOption3, bigDecimal4, null, null, uiString3, str, bigDecimal5, (java.lang.String) obj, null, null, null, 3608, null);
                            selectAmountMapper$getSelectAmountScreenUiModel$1.getHighResolutionOutputSizeshNQ4ISI = paymentOptions4;
                            selectAmountMapper$getSelectAmountScreenUiModel$1.getHighSpeedVideoFpsRanges = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(creditProductIdentifier3);
                            selectAmountMapper$getSelectAmountScreenUiModel$1.getHighSpeedVideoSizes = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(bigDecimal4);
                            selectAmountMapper$getSelectAmountScreenUiModel$1.getHighSpeedVideoFpsRangesFor = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(paymentOption3);
                            selectAmountMapper$getSelectAmountScreenUiModel$1.Camera2StreamConfigurationMap = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(uiString3);
                            selectAmountMapper$getSelectAmountScreenUiModel$1.getOutputFormats = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(currencyAmount2);
                            selectAmountMapper$getSelectAmountScreenUiModel$1.getOutputMinFrameDuration = selectAmountUiModel;
                            selectAmountMapper$getSelectAmountScreenUiModel$1.getHighSpeedVideoSizesFor = null;
                            selectAmountMapper$getSelectAmountScreenUiModel$1.getInputSizeshNQ4ISI = null;
                            selectAmountMapper$getSelectAmountScreenUiModel$1.getInputFormats = 4;
                            obj = getHighSpeedVideoSizes(paymentOptions4, creditProductIdentifier3, selectAmountMapper$getSelectAmountScreenUiModel$1);
                        }
                        return coroutine_suspended;
                    }
                    if (i != 3) {
                        if (i != 4) {
                            throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        selectAmountUiModel = (com.paypal.oslo.feature.revolvingcreditservicing.ui.common.components.selectamount.uimodel.SelectAmountUiModel) selectAmountMapper$getSelectAmountScreenUiModel$1.getOutputMinFrameDuration;
                        paymentOptions4 = (com.paypal.oslo.feature.revolvingcreditservicing.domain.model.accountsummary.PaymentOptions) selectAmountMapper$getSelectAmountScreenUiModel$1.getHighResolutionOutputSizeshNQ4ISI;
                        kotlin.ResultKt.throwOnFailure(obj);
                        com.paypal.oslo.feature.revolvingcreditservicing.ui.makeapayment.selectamount.uimodel.AutopayCardUiModel autopayCardUiModel = (com.paypal.oslo.feature.revolvingcreditservicing.ui.makeapayment.selectamount.uimodel.AutopayCardUiModel) obj;
                        java.lang.String termsAndConditionUrl = paymentOptions4.getTermsAndConditionUrl();
                        java.util.List<com.paypal.oslo.feature.revolvingcreditservicing.domain.model.repayment.RepaymentActivity> repayments = paymentOptions4.getRepayments();
                        if (repayments == null) {
                            repayments = kotlin.collections.CollectionsKt.emptyList();
                        }
                        java.util.List<com.paypal.oslo.feature.revolvingcreditservicing.domain.model.repayment.RepaymentActivity> list = repayments;
                        if (!(list instanceof java.util.Collection) || !list.isEmpty()) {
                            for (com.paypal.oslo.feature.revolvingcreditservicing.domain.model.repayment.RepaymentActivity repaymentActivity : list) {
                                if (kotlin.jvm.internal.Intrinsics.areEqual(repaymentActivity.getCancelable(), kotlin.coroutines.jvm.internal.Boxing.boxBoolean(true)) && repaymentActivity.getStatus() == com.paypal.oslo.feature.revolvingcreditservicing.domain.model.repayment.RepaymentStatus.UPCOMING) {
                                    z = true;
                                    break;
                                }
                            }
                        }
                        z = false;
                        return new com.paypal.oslo.feature.revolvingcreditservicing.ui.makeapayment.selectamount.uimodel.SelectAmountScreenUiModel(selectAmountUiModel, autopayCardUiModel, termsAndConditionUrl, z);
                    }
                    java.lang.String str3 = (java.lang.String) selectAmountMapper$getSelectAmountScreenUiModel$1.getInputSizeshNQ4ISI;
                    java.math.BigDecimal bigDecimal7 = (java.math.BigDecimal) selectAmountMapper$getSelectAmountScreenUiModel$1.getHighSpeedVideoSizesFor;
                    java.util.Map map4 = (java.util.Map) selectAmountMapper$getSelectAmountScreenUiModel$1.getOutputMinFrameDuration;
                    currencyAmount2 = (com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.core.CurrencyAmount) selectAmountMapper$getSelectAmountScreenUiModel$1.getOutputFormats;
                    uiString3 = (com.paypal.oslo.feature.revolvingcreditservicing.ui.common.components.UiString) selectAmountMapper$getSelectAmountScreenUiModel$1.Camera2StreamConfigurationMap;
                    paymentOption3 = (com.paypal.oslo.feature.revolvingcreditservicing.domain.model.autopay.PaymentOption) selectAmountMapper$getSelectAmountScreenUiModel$1.getHighSpeedVideoFpsRangesFor;
                    bigDecimal4 = (java.math.BigDecimal) selectAmountMapper$getSelectAmountScreenUiModel$1.getHighSpeedVideoSizes;
                    creditProductIdentifier3 = (com.paypal.oslo.feature.revolvingcreditservicing.api.model.CreditProductIdentifier) selectAmountMapper$getSelectAmountScreenUiModel$1.getHighSpeedVideoFpsRanges;
                    paymentOptions3 = (com.paypal.oslo.feature.revolvingcreditservicing.domain.model.accountsummary.PaymentOptions) selectAmountMapper$getSelectAmountScreenUiModel$1.getHighResolutionOutputSizeshNQ4ISI;
                    kotlin.ResultKt.throwOnFailure(obj);
                    str = str3;
                    bigDecimal5 = bigDecimal7;
                    map2 = map4;
                    paymentOptions4 = paymentOptions3;
                    selectAmountUiModel = new com.paypal.oslo.feature.revolvingcreditservicing.ui.common.components.selectamount.uimodel.SelectAmountUiModel(map2, paymentOption3, bigDecimal4, null, null, uiString3, str, bigDecimal5, (java.lang.String) obj, null, null, null, 3608, null);
                    selectAmountMapper$getSelectAmountScreenUiModel$1.getHighResolutionOutputSizeshNQ4ISI = paymentOptions4;
                    selectAmountMapper$getSelectAmountScreenUiModel$1.getHighSpeedVideoFpsRanges = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(creditProductIdentifier3);
                    selectAmountMapper$getSelectAmountScreenUiModel$1.getHighSpeedVideoSizes = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(bigDecimal4);
                    selectAmountMapper$getSelectAmountScreenUiModel$1.getHighSpeedVideoFpsRangesFor = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(paymentOption3);
                    selectAmountMapper$getSelectAmountScreenUiModel$1.Camera2StreamConfigurationMap = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(uiString3);
                    selectAmountMapper$getSelectAmountScreenUiModel$1.getOutputFormats = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(currencyAmount2);
                    selectAmountMapper$getSelectAmountScreenUiModel$1.getOutputMinFrameDuration = selectAmountUiModel;
                    selectAmountMapper$getSelectAmountScreenUiModel$1.getHighSpeedVideoSizesFor = null;
                    selectAmountMapper$getSelectAmountScreenUiModel$1.getInputSizeshNQ4ISI = null;
                    selectAmountMapper$getSelectAmountScreenUiModel$1.getInputFormats = 4;
                    obj = getHighSpeedVideoSizes(paymentOptions4, creditProductIdentifier3, selectAmountMapper$getSelectAmountScreenUiModel$1);
                }
                java.util.Map map5 = (java.util.Map) obj;
                java.math.BigDecimal bigDecimal8 = currencyAmount.toBigDecimal();
                selectAmountMapper$getSelectAmountScreenUiModel$1.getHighResolutionOutputSizeshNQ4ISI = paymentOptions2;
                selectAmountMapper$getSelectAmountScreenUiModel$1.getHighSpeedVideoFpsRanges = creditProductIdentifier2;
                selectAmountMapper$getSelectAmountScreenUiModel$1.getHighSpeedVideoSizes = bigDecimal2;
                selectAmountMapper$getSelectAmountScreenUiModel$1.getHighSpeedVideoFpsRangesFor = paymentOption2;
                selectAmountMapper$getSelectAmountScreenUiModel$1.Camera2StreamConfigurationMap = uiString2;
                selectAmountMapper$getSelectAmountScreenUiModel$1.getOutputFormats = currencyAmount;
                selectAmountMapper$getSelectAmountScreenUiModel$1.getOutputMinFrameDuration = map5;
                selectAmountMapper$getSelectAmountScreenUiModel$1.getHighSpeedVideoSizesFor = bigDecimal8;
                selectAmountMapper$getSelectAmountScreenUiModel$1.getInputFormats = 2;
                Camera2StreamConfigurationMap = Camera2StreamConfigurationMap(currencyAmount, selectAmountMapper$getSelectAmountScreenUiModel$1);
                if (Camera2StreamConfigurationMap != coroutine_suspended) {
                    uiString3 = uiString2;
                    bigDecimal3 = bigDecimal8;
                    paymentOptions3 = paymentOptions2;
                    creditProductIdentifier3 = creditProductIdentifier2;
                    bigDecimal4 = bigDecimal2;
                    paymentOption3 = paymentOption2;
                    map = map5;
                    obj = Camera2StreamConfigurationMap;
                    java.lang.String str22 = (java.lang.String) obj;
                    com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.core.CurrencyAmount currencyAmount42 = new com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.core.CurrencyAmount(currencyAmount.getCurrencyCode(), "0");
                    selectAmountMapper$getSelectAmountScreenUiModel$1.getHighResolutionOutputSizeshNQ4ISI = paymentOptions3;
                    selectAmountMapper$getSelectAmountScreenUiModel$1.getHighSpeedVideoFpsRanges = creditProductIdentifier3;
                    selectAmountMapper$getSelectAmountScreenUiModel$1.getHighSpeedVideoSizes = bigDecimal4;
                    selectAmountMapper$getSelectAmountScreenUiModel$1.getHighSpeedVideoFpsRangesFor = paymentOption3;
                    selectAmountMapper$getSelectAmountScreenUiModel$1.Camera2StreamConfigurationMap = uiString3;
                    selectAmountMapper$getSelectAmountScreenUiModel$1.getOutputFormats = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(currencyAmount);
                    selectAmountMapper$getSelectAmountScreenUiModel$1.getOutputMinFrameDuration = map;
                    selectAmountMapper$getSelectAmountScreenUiModel$1.getHighSpeedVideoSizesFor = bigDecimal3;
                    selectAmountMapper$getSelectAmountScreenUiModel$1.getInputSizeshNQ4ISI = str22;
                    selectAmountMapper$getSelectAmountScreenUiModel$1.getInputFormats = 3;
                    Camera2StreamConfigurationMap2 = Camera2StreamConfigurationMap(currencyAmount42, selectAmountMapper$getSelectAmountScreenUiModel$1);
                    if (Camera2StreamConfigurationMap2 != coroutine_suspended) {
                    }
                }
                return coroutine_suspended;
            }
        }
        selectAmountMapper$getSelectAmountScreenUiModel$1 = new com.paypal.oslo.feature.revolvingcreditservicing.ui.makeapayment.selectamount.mapper.SelectAmountMapper$getSelectAmountScreenUiModel$1(this, continuation);
        java.lang.Object obj2 = selectAmountMapper$getSelectAmountScreenUiModel$1.getOutputStallDurationlomOqCM;
        coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = selectAmountMapper$getSelectAmountScreenUiModel$1.getInputFormats;
        if (i != 0) {
        }
        java.util.Map map52 = (java.util.Map) obj2;
        java.math.BigDecimal bigDecimal82 = currencyAmount.toBigDecimal();
        selectAmountMapper$getSelectAmountScreenUiModel$1.getHighResolutionOutputSizeshNQ4ISI = paymentOptions2;
        selectAmountMapper$getSelectAmountScreenUiModel$1.getHighSpeedVideoFpsRanges = creditProductIdentifier2;
        selectAmountMapper$getSelectAmountScreenUiModel$1.getHighSpeedVideoSizes = bigDecimal2;
        selectAmountMapper$getSelectAmountScreenUiModel$1.getHighSpeedVideoFpsRangesFor = paymentOption2;
        selectAmountMapper$getSelectAmountScreenUiModel$1.Camera2StreamConfigurationMap = uiString2;
        selectAmountMapper$getSelectAmountScreenUiModel$1.getOutputFormats = currencyAmount;
        selectAmountMapper$getSelectAmountScreenUiModel$1.getOutputMinFrameDuration = map52;
        selectAmountMapper$getSelectAmountScreenUiModel$1.getHighSpeedVideoSizesFor = bigDecimal82;
        selectAmountMapper$getSelectAmountScreenUiModel$1.getInputFormats = 2;
        Camera2StreamConfigurationMap = Camera2StreamConfigurationMap(currencyAmount, selectAmountMapper$getSelectAmountScreenUiModel$1);
        if (Camera2StreamConfigurationMap != coroutine_suspended) {
        }
        return coroutine_suspended;
    }

    public static /* synthetic */ java.lang.Object getSelectAmountScreenUiModel$default(com.paypal.oslo.feature.revolvingcreditservicing.ui.makeapayment.selectamount.mapper.SelectAmountMapper selectAmountMapper, com.paypal.oslo.feature.revolvingcreditservicing.domain.model.accountsummary.PaymentOptions paymentOptions, com.paypal.oslo.feature.revolvingcreditservicing.api.model.CreditProductIdentifier creditProductIdentifier, java.math.BigDecimal bigDecimal, com.paypal.oslo.feature.revolvingcreditservicing.domain.model.autopay.PaymentOption paymentOption, com.paypal.oslo.feature.revolvingcreditservicing.ui.common.components.UiString uiString, kotlin.coroutines.Continuation continuation, int i, java.lang.Object obj) {
        if ((i & 4) != 0) {
            bigDecimal = java.math.BigDecimal.ZERO;
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(bigDecimal, "");
        }
        return selectAmountMapper.getSelectAmountScreenUiModel(paymentOptions, creditProductIdentifier, bigDecimal, (i & 8) != 0 ? null : paymentOption, (i & 16) != 0 ? null : uiString, continuation);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0211  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0244  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x024c  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0249  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x019d  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x01f2  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x01a0  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x0126  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x015d  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x017a  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x00b4  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x002c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object Camera2StreamConfigurationMap(com.paypal.oslo.feature.revolvingcreditservicing.domain.model.accountsummary.PaymentOptions paymentOptions, com.paypal.oslo.feature.revolvingcreditservicing.api.model.CreditProductIdentifier creditProductIdentifier, kotlin.coroutines.Continuation<? super java.util.Map<com.paypal.oslo.feature.revolvingcreditservicing.domain.model.autopay.PaymentOption, com.paypal.oslo.feature.revolvingcreditservicing.ui.common.components.selectamount.uimodel.SelectAmountOptionUiModel>> continuation) {
        com.paypal.oslo.feature.revolvingcreditservicing.ui.makeapayment.selectamount.mapper.SelectAmountMapper$createPaymentOptions$1 selectAmountMapper$createPaymentOptions$1;
        java.lang.Object coroutine_suspended;
        int i;
        kotlin.Pair[] pairArr;
        com.paypal.oslo.feature.revolvingcreditservicing.domain.model.autopay.PaymentOption paymentOption;
        com.paypal.oslo.feature.revolvingcreditservicing.domain.model.accountsummary.PaymentOptions paymentOptions2;
        com.paypal.oslo.feature.revolvingcreditservicing.api.model.CreditProductIdentifier creditProductIdentifier2;
        com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.core.CurrencyAmount currencyAmount;
        int i2;
        com.paypal.oslo.feature.revolvingcreditservicing.ui.common.components.UiString.StringResOnly stringResOnly;
        kotlin.Pair[] pairArr2;
        com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.core.CurrencyAmount minimumPaymentDue;
        com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.core.CurrencyAmount minimumPaymentDue2;
        com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.core.CurrencyAmount remainingStatementBalance;
        java.lang.Object Camera2StreamConfigurationMap;
        com.paypal.oslo.feature.revolvingcreditservicing.ui.common.components.UiString.StringResOnly stringResOnly2;
        com.paypal.oslo.feature.revolvingcreditservicing.api.model.CreditProductIdentifier creditProductIdentifier3;
        int i3;
        com.paypal.oslo.feature.revolvingcreditservicing.domain.model.autopay.PaymentOption paymentOption2;
        kotlin.Pair[] pairArr3;
        com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.core.CurrencyAmount remainingStatementBalance2;
        com.paypal.oslo.feature.revolvingcreditservicing.ui.common.components.UiString.StringResOnly stringResOnly3;
        java.lang.Object Camera2StreamConfigurationMap2;
        com.paypal.oslo.feature.revolvingcreditservicing.domain.model.autopay.PaymentOption paymentOption3;
        kotlin.Pair[] pairArr4;
        com.paypal.oslo.feature.revolvingcreditservicing.domain.model.accountsummary.PaymentOptions paymentOptions3;
        com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.core.CurrencyAmount currentBalance;
        com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.core.CurrencyAmount currentBalance2;
        java.lang.String currencyCode;
        if (continuation instanceof com.paypal.oslo.feature.revolvingcreditservicing.ui.makeapayment.selectamount.mapper.SelectAmountMapper$createPaymentOptions$1) {
            selectAmountMapper$createPaymentOptions$1 = (com.paypal.oslo.feature.revolvingcreditservicing.ui.makeapayment.selectamount.mapper.SelectAmountMapper$createPaymentOptions$1) continuation;
            if ((selectAmountMapper$createPaymentOptions$1.getOutputFormats & Integer.MIN_VALUE) != 0) {
                selectAmountMapper$createPaymentOptions$1.getOutputFormats -= 2147483648;
                java.lang.Object obj = selectAmountMapper$createPaymentOptions$1.getHighSpeedVideoSizesFor;
                coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = selectAmountMapper$createPaymentOptions$1.getOutputFormats;
                int i4 = 2;
                if (i != 0) {
                    kotlin.ResultKt.throwOnFailure(obj);
                    java.lang.String currencyCode2 = java.util.Currency.getInstance(com.paypal.oslo.feature.revolvingcreditservicing.utils.LocaleMapperKt.toLocale(creditProductIdentifier)).getCurrencyCode();
                    kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(currencyCode2, "");
                    com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.core.CurrencyAmount currencyAmount2 = new com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.core.CurrencyAmount(currencyCode2, "0");
                    pairArr = new kotlin.Pair[4];
                    paymentOption = com.paypal.oslo.feature.revolvingcreditservicing.domain.model.autopay.PaymentOption.MINIMUM_PAYMENT_DUE;
                    com.paypal.oslo.feature.revolvingcreditservicing.ui.common.components.UiString.StringResOnly stringResOnly4 = new com.paypal.oslo.feature.revolvingcreditservicing.ui.common.components.UiString.StringResOnly(com.paypal.oslo.feature.revolvingcreditservicing.R.string.feature_revolvingcredit_servicing_common_minimum_payment_due, (com.paypal.oslo.feature.revolvingcreditservicing.api.model.CreditProductIdentifier) null, false, 6, (kotlin.jvm.internal.DefaultConstructorMarker) null);
                    com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.core.CurrencyAmount minimumPaymentDue3 = paymentOptions.getMinimumPaymentDue();
                    paymentOptions2 = paymentOptions;
                    selectAmountMapper$createPaymentOptions$1.getHighSpeedVideoFpsRanges = paymentOptions2;
                    selectAmountMapper$createPaymentOptions$1.getHighSpeedVideoSizes = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(creditProductIdentifier);
                    selectAmountMapper$createPaymentOptions$1.Camera2StreamConfigurationMap = currencyAmount2;
                    selectAmountMapper$createPaymentOptions$1.getHighSpeedVideoFpsRangesFor = pairArr;
                    selectAmountMapper$createPaymentOptions$1.getInputSizeshNQ4ISI = stringResOnly4;
                    selectAmountMapper$createPaymentOptions$1.getInputFormats = pairArr;
                    selectAmountMapper$createPaymentOptions$1.getOutputMinFrameDuration = paymentOption;
                    selectAmountMapper$createPaymentOptions$1.getHighResolutionOutputSizeshNQ4ISI = 0;
                    selectAmountMapper$createPaymentOptions$1.getOutputFormats = 1;
                    java.lang.Object Camera2StreamConfigurationMap3 = Camera2StreamConfigurationMap(minimumPaymentDue3, selectAmountMapper$createPaymentOptions$1);
                    if (Camera2StreamConfigurationMap3 != coroutine_suspended) {
                        creditProductIdentifier2 = creditProductIdentifier;
                        currencyAmount = currencyAmount2;
                        i2 = 0;
                        stringResOnly = stringResOnly4;
                        obj = Camera2StreamConfigurationMap3;
                        pairArr2 = pairArr;
                    }
                    return coroutine_suspended;
                }
                if (i != 1) {
                    if (i != 2) {
                        if (i != 3) {
                            throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        i4 = selectAmountMapper$createPaymentOptions$1.getHighResolutionOutputSizeshNQ4ISI;
                        paymentOption3 = (com.paypal.oslo.feature.revolvingcreditservicing.domain.model.autopay.PaymentOption) selectAmountMapper$createPaymentOptions$1.getOutputMinFrameDuration;
                        pairArr3 = (kotlin.Pair[]) selectAmountMapper$createPaymentOptions$1.getInputFormats;
                        stringResOnly3 = (com.paypal.oslo.feature.revolvingcreditservicing.ui.common.components.UiString.StringResOnly) selectAmountMapper$createPaymentOptions$1.getInputSizeshNQ4ISI;
                        pairArr4 = (kotlin.Pair[]) selectAmountMapper$createPaymentOptions$1.getHighSpeedVideoFpsRangesFor;
                        paymentOptions3 = (com.paypal.oslo.feature.revolvingcreditservicing.domain.model.accountsummary.PaymentOptions) selectAmountMapper$createPaymentOptions$1.getHighSpeedVideoFpsRanges;
                        kotlin.ResultKt.throwOnFailure(obj);
                        java.lang.String str = (java.lang.String) obj;
                        currentBalance = paymentOptions3.getCurrentBalance();
                        if (currentBalance != null || (r1 = currentBalance.toBigDecimal()) == null) {
                            java.math.BigDecimal bigDecimal = java.math.BigDecimal.ZERO;
                        }
                        java.math.BigDecimal bigDecimal2 = bigDecimal;
                        kotlin.jvm.internal.Intrinsics.checkNotNull(bigDecimal2);
                        currentBalance2 = paymentOptions3.getCurrentBalance();
                        if (currentBalance2 == null) {
                            currentBalance2 = new com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.core.CurrencyAmount("", "");
                        }
                        pairArr3[i4] = kotlin.TuplesKt.to(paymentOption3, new com.paypal.oslo.feature.revolvingcreditservicing.ui.common.components.selectamount.uimodel.SelectAmountOptionUiModel(stringResOnly3, null, str, currentBalance2, bigDecimal2, false, 34, null));
                        com.paypal.oslo.feature.revolvingcreditservicing.domain.model.autopay.PaymentOption paymentOption4 = com.paypal.oslo.feature.revolvingcreditservicing.domain.model.autopay.PaymentOption.CUSTOM_AMOUNT;
                        com.paypal.oslo.feature.revolvingcreditservicing.ui.common.components.UiString.StringResOnly stringResOnly5 = new com.paypal.oslo.feature.revolvingcreditservicing.ui.common.components.UiString.StringResOnly(com.paypal.oslo.feature.revolvingcreditservicing.R.string.feature_revolvingcredit_servicing_autopay_status_description_custom_amount, (com.paypal.oslo.feature.revolvingcreditservicing.api.model.CreditProductIdentifier) null, false, 6, (kotlin.jvm.internal.DefaultConstructorMarker) null);
                        com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.core.CurrencyAmount currentBalance3 = paymentOptions3.getCurrentBalance();
                        currencyCode = currentBalance3 == null ? currentBalance3.getCurrencyCode() : null;
                        if (currencyCode == null) {
                            currencyCode = "";
                        }
                        pairArr4[3] = kotlin.TuplesKt.to(paymentOption4, new com.paypal.oslo.feature.revolvingcreditservicing.ui.common.components.selectamount.uimodel.SelectAmountOptionUiModel(stringResOnly5, null, null, new com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.core.CurrencyAmount(currencyCode, ""), null, false, 54, null));
                        return kotlin.collections.MapsKt.mapOf(pairArr4);
                    }
                    int i5 = selectAmountMapper$createPaymentOptions$1.getHighResolutionOutputSizeshNQ4ISI;
                    com.paypal.oslo.feature.revolvingcreditservicing.domain.model.autopay.PaymentOption paymentOption5 = (com.paypal.oslo.feature.revolvingcreditservicing.domain.model.autopay.PaymentOption) selectAmountMapper$createPaymentOptions$1.getOutputMinFrameDuration;
                    kotlin.Pair[] pairArr5 = (kotlin.Pair[]) selectAmountMapper$createPaymentOptions$1.getInputFormats;
                    com.paypal.oslo.feature.revolvingcreditservicing.ui.common.components.UiString.StringResOnly stringResOnly6 = (com.paypal.oslo.feature.revolvingcreditservicing.ui.common.components.UiString.StringResOnly) selectAmountMapper$createPaymentOptions$1.getInputSizeshNQ4ISI;
                    kotlin.Pair[] pairArr6 = (kotlin.Pair[]) selectAmountMapper$createPaymentOptions$1.getHighSpeedVideoFpsRangesFor;
                    com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.core.CurrencyAmount currencyAmount3 = (com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.core.CurrencyAmount) selectAmountMapper$createPaymentOptions$1.Camera2StreamConfigurationMap;
                    creditProductIdentifier3 = (com.paypal.oslo.feature.revolvingcreditservicing.api.model.CreditProductIdentifier) selectAmountMapper$createPaymentOptions$1.getHighSpeedVideoSizes;
                    com.paypal.oslo.feature.revolvingcreditservicing.domain.model.accountsummary.PaymentOptions paymentOptions4 = (com.paypal.oslo.feature.revolvingcreditservicing.domain.model.accountsummary.PaymentOptions) selectAmountMapper$createPaymentOptions$1.getHighSpeedVideoFpsRanges;
                    kotlin.ResultKt.throwOnFailure(obj);
                    currencyAmount = currencyAmount3;
                    paymentOptions2 = paymentOptions4;
                    paymentOption2 = paymentOption5;
                    pairArr3 = pairArr6;
                    stringResOnly2 = stringResOnly6;
                    pairArr = pairArr5;
                    i3 = i5;
                    java.lang.String str2 = (java.lang.String) obj;
                    remainingStatementBalance2 = paymentOptions2.getRemainingStatementBalance();
                    if (remainingStatementBalance2 != null || (r1 = remainingStatementBalance2.toBigDecimal()) == null) {
                        java.math.BigDecimal bigDecimal3 = java.math.BigDecimal.ZERO;
                    }
                    java.math.BigDecimal bigDecimal4 = bigDecimal3;
                    kotlin.jvm.internal.Intrinsics.checkNotNull(bigDecimal4);
                    com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.core.CurrencyAmount remainingStatementBalance3 = paymentOptions2.getRemainingStatementBalance();
                    pairArr[i3] = kotlin.TuplesKt.to(paymentOption2, new com.paypal.oslo.feature.revolvingcreditservicing.ui.common.components.selectamount.uimodel.SelectAmountOptionUiModel(stringResOnly2, null, str2, remainingStatementBalance3 != null ? currencyAmount : remainingStatementBalance3, bigDecimal4, true, 2, null));
                    com.paypal.oslo.feature.revolvingcreditservicing.domain.model.autopay.PaymentOption paymentOption6 = com.paypal.oslo.feature.revolvingcreditservicing.domain.model.autopay.PaymentOption.CURRENT_BALANCE;
                    stringResOnly3 = new com.paypal.oslo.feature.revolvingcreditservicing.ui.common.components.UiString.StringResOnly(com.paypal.oslo.feature.revolvingcreditservicing.R.string.feature_revolvingcredit_servicing_account_summary_current_balance, (com.paypal.oslo.feature.revolvingcreditservicing.api.model.CreditProductIdentifier) null, false, 6, (kotlin.jvm.internal.DefaultConstructorMarker) null);
                    com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.core.CurrencyAmount currentBalance4 = paymentOptions2.getCurrentBalance();
                    selectAmountMapper$createPaymentOptions$1.getHighSpeedVideoFpsRanges = paymentOptions2;
                    selectAmountMapper$createPaymentOptions$1.getHighSpeedVideoSizes = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(creditProductIdentifier3);
                    selectAmountMapper$createPaymentOptions$1.Camera2StreamConfigurationMap = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(currencyAmount);
                    selectAmountMapper$createPaymentOptions$1.getHighSpeedVideoFpsRangesFor = pairArr3;
                    selectAmountMapper$createPaymentOptions$1.getInputSizeshNQ4ISI = stringResOnly3;
                    selectAmountMapper$createPaymentOptions$1.getInputFormats = pairArr3;
                    selectAmountMapper$createPaymentOptions$1.getOutputMinFrameDuration = paymentOption6;
                    selectAmountMapper$createPaymentOptions$1.getHighResolutionOutputSizeshNQ4ISI = 2;
                    selectAmountMapper$createPaymentOptions$1.getOutputFormats = 3;
                    Camera2StreamConfigurationMap2 = Camera2StreamConfigurationMap(currentBalance4, selectAmountMapper$createPaymentOptions$1);
                    if (Camera2StreamConfigurationMap2 != coroutine_suspended) {
                        paymentOption3 = paymentOption6;
                        obj = Camera2StreamConfigurationMap2;
                        pairArr4 = pairArr3;
                        paymentOptions3 = paymentOptions2;
                        java.lang.String str3 = (java.lang.String) obj;
                        currentBalance = paymentOptions3.getCurrentBalance();
                        if (currentBalance != null) {
                        }
                        java.math.BigDecimal bigDecimal5 = java.math.BigDecimal.ZERO;
                        java.math.BigDecimal bigDecimal22 = bigDecimal5;
                        kotlin.jvm.internal.Intrinsics.checkNotNull(bigDecimal22);
                        currentBalance2 = paymentOptions3.getCurrentBalance();
                        if (currentBalance2 == null) {
                        }
                        pairArr3[i4] = kotlin.TuplesKt.to(paymentOption3, new com.paypal.oslo.feature.revolvingcreditservicing.ui.common.components.selectamount.uimodel.SelectAmountOptionUiModel(stringResOnly3, null, str3, currentBalance2, bigDecimal22, false, 34, null));
                        com.paypal.oslo.feature.revolvingcreditservicing.domain.model.autopay.PaymentOption paymentOption42 = com.paypal.oslo.feature.revolvingcreditservicing.domain.model.autopay.PaymentOption.CUSTOM_AMOUNT;
                        com.paypal.oslo.feature.revolvingcreditservicing.ui.common.components.UiString.StringResOnly stringResOnly52 = new com.paypal.oslo.feature.revolvingcreditservicing.ui.common.components.UiString.StringResOnly(com.paypal.oslo.feature.revolvingcreditservicing.R.string.feature_revolvingcredit_servicing_autopay_status_description_custom_amount, (com.paypal.oslo.feature.revolvingcreditservicing.api.model.CreditProductIdentifier) null, false, 6, (kotlin.jvm.internal.DefaultConstructorMarker) null);
                        com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.core.CurrencyAmount currentBalance32 = paymentOptions3.getCurrentBalance();
                        if (currentBalance32 == null) {
                        }
                        if (currencyCode == null) {
                        }
                        pairArr4[3] = kotlin.TuplesKt.to(paymentOption42, new com.paypal.oslo.feature.revolvingcreditservicing.ui.common.components.selectamount.uimodel.SelectAmountOptionUiModel(stringResOnly52, null, null, new com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.core.CurrencyAmount(currencyCode, ""), null, false, 54, null));
                        return kotlin.collections.MapsKt.mapOf(pairArr4);
                    }
                    return coroutine_suspended;
                }
                i2 = selectAmountMapper$createPaymentOptions$1.getHighResolutionOutputSizeshNQ4ISI;
                paymentOption = (com.paypal.oslo.feature.revolvingcreditservicing.domain.model.autopay.PaymentOption) selectAmountMapper$createPaymentOptions$1.getOutputMinFrameDuration;
                kotlin.Pair[] pairArr7 = (kotlin.Pair[]) selectAmountMapper$createPaymentOptions$1.getInputFormats;
                com.paypal.oslo.feature.revolvingcreditservicing.ui.common.components.UiString.StringResOnly stringResOnly7 = (com.paypal.oslo.feature.revolvingcreditservicing.ui.common.components.UiString.StringResOnly) selectAmountMapper$createPaymentOptions$1.getInputSizeshNQ4ISI;
                kotlin.Pair[] pairArr8 = (kotlin.Pair[]) selectAmountMapper$createPaymentOptions$1.getHighSpeedVideoFpsRangesFor;
                com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.core.CurrencyAmount currencyAmount4 = (com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.core.CurrencyAmount) selectAmountMapper$createPaymentOptions$1.Camera2StreamConfigurationMap;
                creditProductIdentifier2 = (com.paypal.oslo.feature.revolvingcreditservicing.api.model.CreditProductIdentifier) selectAmountMapper$createPaymentOptions$1.getHighSpeedVideoSizes;
                com.paypal.oslo.feature.revolvingcreditservicing.domain.model.accountsummary.PaymentOptions paymentOptions5 = (com.paypal.oslo.feature.revolvingcreditservicing.domain.model.accountsummary.PaymentOptions) selectAmountMapper$createPaymentOptions$1.getHighSpeedVideoFpsRanges;
                kotlin.ResultKt.throwOnFailure(obj);
                pairArr2 = pairArr7;
                pairArr = pairArr8;
                paymentOptions2 = paymentOptions5;
                currencyAmount = currencyAmount4;
                stringResOnly = stringResOnly7;
                java.lang.String str4 = (java.lang.String) obj;
                minimumPaymentDue = paymentOptions2.getMinimumPaymentDue();
                if (minimumPaymentDue != null || (r1 = minimumPaymentDue.toBigDecimal()) == null) {
                    java.math.BigDecimal bigDecimal6 = java.math.BigDecimal.ZERO;
                }
                java.math.BigDecimal bigDecimal7 = bigDecimal6;
                kotlin.jvm.internal.Intrinsics.checkNotNull(bigDecimal7);
                minimumPaymentDue2 = paymentOptions2.getMinimumPaymentDue();
                if (minimumPaymentDue2 == null) {
                    minimumPaymentDue2 = new com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.core.CurrencyAmount("", "");
                }
                pairArr2[i2] = kotlin.TuplesKt.to(paymentOption, new com.paypal.oslo.feature.revolvingcreditservicing.ui.common.components.selectamount.uimodel.SelectAmountOptionUiModel(stringResOnly, null, str4, minimumPaymentDue2, bigDecimal7, false, 34, null));
                com.paypal.oslo.feature.revolvingcreditservicing.domain.model.autopay.PaymentOption paymentOption7 = com.paypal.oslo.feature.revolvingcreditservicing.domain.model.autopay.PaymentOption.STATEMENT_BALANCE;
                com.paypal.oslo.feature.revolvingcreditservicing.ui.common.components.UiString.StringResOnly stringResOnly8 = new com.paypal.oslo.feature.revolvingcreditservicing.ui.common.components.UiString.StringResOnly(com.paypal.oslo.feature.revolvingcreditservicing.R.string.feature_revolvingcredit_servicing_sheet_remaining_statement_balance_title, (com.paypal.oslo.feature.revolvingcreditservicing.api.model.CreditProductIdentifier) null, false, 6, (kotlin.jvm.internal.DefaultConstructorMarker) null);
                remainingStatementBalance = paymentOptions2.getRemainingStatementBalance();
                if (remainingStatementBalance == null) {
                    remainingStatementBalance = currencyAmount;
                }
                selectAmountMapper$createPaymentOptions$1.getHighSpeedVideoFpsRanges = paymentOptions2;
                selectAmountMapper$createPaymentOptions$1.getHighSpeedVideoSizes = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(creditProductIdentifier2);
                selectAmountMapper$createPaymentOptions$1.Camera2StreamConfigurationMap = currencyAmount;
                selectAmountMapper$createPaymentOptions$1.getHighSpeedVideoFpsRangesFor = pairArr;
                selectAmountMapper$createPaymentOptions$1.getInputSizeshNQ4ISI = stringResOnly8;
                selectAmountMapper$createPaymentOptions$1.getInputFormats = pairArr;
                selectAmountMapper$createPaymentOptions$1.getOutputMinFrameDuration = paymentOption7;
                selectAmountMapper$createPaymentOptions$1.getHighResolutionOutputSizeshNQ4ISI = 1;
                selectAmountMapper$createPaymentOptions$1.getOutputFormats = 2;
                Camera2StreamConfigurationMap = Camera2StreamConfigurationMap(remainingStatementBalance, selectAmountMapper$createPaymentOptions$1);
                if (Camera2StreamConfigurationMap != coroutine_suspended) {
                    stringResOnly2 = stringResOnly8;
                    obj = Camera2StreamConfigurationMap;
                    creditProductIdentifier3 = creditProductIdentifier2;
                    i3 = 1;
                    paymentOption2 = paymentOption7;
                    pairArr3 = pairArr;
                    java.lang.String str22 = (java.lang.String) obj;
                    remainingStatementBalance2 = paymentOptions2.getRemainingStatementBalance();
                    if (remainingStatementBalance2 != null) {
                    }
                    java.math.BigDecimal bigDecimal32 = java.math.BigDecimal.ZERO;
                    java.math.BigDecimal bigDecimal42 = bigDecimal32;
                    kotlin.jvm.internal.Intrinsics.checkNotNull(bigDecimal42);
                    com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.core.CurrencyAmount remainingStatementBalance32 = paymentOptions2.getRemainingStatementBalance();
                    pairArr[i3] = kotlin.TuplesKt.to(paymentOption2, new com.paypal.oslo.feature.revolvingcreditservicing.ui.common.components.selectamount.uimodel.SelectAmountOptionUiModel(stringResOnly2, null, str22, remainingStatementBalance32 != null ? currencyAmount : remainingStatementBalance32, bigDecimal42, true, 2, null));
                    com.paypal.oslo.feature.revolvingcreditservicing.domain.model.autopay.PaymentOption paymentOption62 = com.paypal.oslo.feature.revolvingcreditservicing.domain.model.autopay.PaymentOption.CURRENT_BALANCE;
                    stringResOnly3 = new com.paypal.oslo.feature.revolvingcreditservicing.ui.common.components.UiString.StringResOnly(com.paypal.oslo.feature.revolvingcreditservicing.R.string.feature_revolvingcredit_servicing_account_summary_current_balance, (com.paypal.oslo.feature.revolvingcreditservicing.api.model.CreditProductIdentifier) null, false, 6, (kotlin.jvm.internal.DefaultConstructorMarker) null);
                    com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.core.CurrencyAmount currentBalance42 = paymentOptions2.getCurrentBalance();
                    selectAmountMapper$createPaymentOptions$1.getHighSpeedVideoFpsRanges = paymentOptions2;
                    selectAmountMapper$createPaymentOptions$1.getHighSpeedVideoSizes = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(creditProductIdentifier3);
                    selectAmountMapper$createPaymentOptions$1.Camera2StreamConfigurationMap = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(currencyAmount);
                    selectAmountMapper$createPaymentOptions$1.getHighSpeedVideoFpsRangesFor = pairArr3;
                    selectAmountMapper$createPaymentOptions$1.getInputSizeshNQ4ISI = stringResOnly3;
                    selectAmountMapper$createPaymentOptions$1.getInputFormats = pairArr3;
                    selectAmountMapper$createPaymentOptions$1.getOutputMinFrameDuration = paymentOption62;
                    selectAmountMapper$createPaymentOptions$1.getHighResolutionOutputSizeshNQ4ISI = 2;
                    selectAmountMapper$createPaymentOptions$1.getOutputFormats = 3;
                    Camera2StreamConfigurationMap2 = Camera2StreamConfigurationMap(currentBalance42, selectAmountMapper$createPaymentOptions$1);
                    if (Camera2StreamConfigurationMap2 != coroutine_suspended) {
                    }
                }
                return coroutine_suspended;
            }
        }
        selectAmountMapper$createPaymentOptions$1 = new com.paypal.oslo.feature.revolvingcreditservicing.ui.makeapayment.selectamount.mapper.SelectAmountMapper$createPaymentOptions$1(this, continuation);
        java.lang.Object obj2 = selectAmountMapper$createPaymentOptions$1.getHighSpeedVideoSizesFor;
        coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = selectAmountMapper$createPaymentOptions$1.getOutputFormats;
        int i42 = 2;
        if (i != 0) {
        }
        java.lang.String str42 = (java.lang.String) obj2;
        minimumPaymentDue = paymentOptions2.getMinimumPaymentDue();
        if (minimumPaymentDue != null) {
        }
        java.math.BigDecimal bigDecimal62 = java.math.BigDecimal.ZERO;
        java.math.BigDecimal bigDecimal72 = bigDecimal62;
        kotlin.jvm.internal.Intrinsics.checkNotNull(bigDecimal72);
        minimumPaymentDue2 = paymentOptions2.getMinimumPaymentDue();
        if (minimumPaymentDue2 == null) {
        }
        pairArr2[i2] = kotlin.TuplesKt.to(paymentOption, new com.paypal.oslo.feature.revolvingcreditservicing.ui.common.components.selectamount.uimodel.SelectAmountOptionUiModel(stringResOnly, null, str42, minimumPaymentDue2, bigDecimal72, false, 34, null));
        com.paypal.oslo.feature.revolvingcreditservicing.domain.model.autopay.PaymentOption paymentOption72 = com.paypal.oslo.feature.revolvingcreditservicing.domain.model.autopay.PaymentOption.STATEMENT_BALANCE;
        com.paypal.oslo.feature.revolvingcreditservicing.ui.common.components.UiString.StringResOnly stringResOnly82 = new com.paypal.oslo.feature.revolvingcreditservicing.ui.common.components.UiString.StringResOnly(com.paypal.oslo.feature.revolvingcreditservicing.R.string.feature_revolvingcredit_servicing_sheet_remaining_statement_balance_title, (com.paypal.oslo.feature.revolvingcreditservicing.api.model.CreditProductIdentifier) null, false, 6, (kotlin.jvm.internal.DefaultConstructorMarker) null);
        remainingStatementBalance = paymentOptions2.getRemainingStatementBalance();
        if (remainingStatementBalance == null) {
        }
        selectAmountMapper$createPaymentOptions$1.getHighSpeedVideoFpsRanges = paymentOptions2;
        selectAmountMapper$createPaymentOptions$1.getHighSpeedVideoSizes = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(creditProductIdentifier2);
        selectAmountMapper$createPaymentOptions$1.Camera2StreamConfigurationMap = currencyAmount;
        selectAmountMapper$createPaymentOptions$1.getHighSpeedVideoFpsRangesFor = pairArr;
        selectAmountMapper$createPaymentOptions$1.getInputSizeshNQ4ISI = stringResOnly82;
        selectAmountMapper$createPaymentOptions$1.getInputFormats = pairArr;
        selectAmountMapper$createPaymentOptions$1.getOutputMinFrameDuration = paymentOption72;
        selectAmountMapper$createPaymentOptions$1.getHighResolutionOutputSizeshNQ4ISI = 1;
        selectAmountMapper$createPaymentOptions$1.getOutputFormats = 2;
        Camera2StreamConfigurationMap = Camera2StreamConfigurationMap(remainingStatementBalance, selectAmountMapper$createPaymentOptions$1);
        if (Camera2StreamConfigurationMap != coroutine_suspended) {
        }
        return coroutine_suspended;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x0083, code lost:
    
        if (r1 != r3) goto L22;
     */
    /* JADX WARN: Removed duplicated region for block: B:19:0x009f  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x00a7  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x00b3  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x012d  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00f3  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00a9  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00a4  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0064  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x002a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object getHighSpeedVideoSizes(com.paypal.oslo.feature.revolvingcreditservicing.domain.model.accountsummary.PaymentOptions paymentOptions, com.paypal.oslo.feature.revolvingcreditservicing.api.model.CreditProductIdentifier creditProductIdentifier, kotlin.coroutines.Continuation<? super com.paypal.oslo.feature.revolvingcreditservicing.ui.makeapayment.selectamount.uimodel.AutopayCardUiModel> continuation) {
        com.paypal.oslo.feature.revolvingcreditservicing.ui.makeapayment.selectamount.mapper.SelectAmountMapper$autopayCardData$1 selectAmountMapper$autopayCardData$1;
        java.lang.Object obj;
        java.lang.Object coroutine_suspended;
        int i;
        com.paypal.oslo.feature.revolvingcreditservicing.domain.model.accountsummary.PaymentOptions paymentOptions2;
        com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.core.CurrencyAmount currencyAmount;
        com.paypal.oslo.feature.revolvingcreditservicing.api.model.CreditProductIdentifier creditProductIdentifier2;
        int i2;
        com.paypal.oslo.feature.revolvingcreditservicing.ui.common.components.UiString.StringResOnly stringResOnly;
        com.paypal.oslo.feature.revolvingcreditservicing.ui.common.components.UiString uiString;
        com.paypal.oslo.feature.revolvingcreditservicing.ui.common.components.autopaystatus.autopayRow.AutopayRowUiModel autopayRowUiModel;
        java.time.Instant nextPaymentDueTime;
        java.lang.String format;
        if (continuation instanceof com.paypal.oslo.feature.revolvingcreditservicing.ui.makeapayment.selectamount.mapper.SelectAmountMapper$autopayCardData$1) {
            selectAmountMapper$autopayCardData$1 = (com.paypal.oslo.feature.revolvingcreditservicing.ui.makeapayment.selectamount.mapper.SelectAmountMapper$autopayCardData$1) continuation;
            if ((selectAmountMapper$autopayCardData$1.getOutputFormats & Integer.MIN_VALUE) != 0) {
                selectAmountMapper$autopayCardData$1.getOutputFormats -= 2147483648;
                obj = selectAmountMapper$autopayCardData$1.getInputSizeshNQ4ISI;
                coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = selectAmountMapper$autopayCardData$1.getOutputFormats;
                com.paypal.oslo.feature.revolvingcreditservicing.ui.common.components.UiString.StringResWithParameter stringResWithParameter = null;
                if (i != 0) {
                    kotlin.ResultKt.throwOnFailure(obj);
                    com.paypal.oslo.feature.revolvingcreditservicing.domain.model.autopay.AutopayOverview autopayOverview = paymentOptions.getAutopayOverview();
                    if (autopayOverview != null) {
                        currencyAmount = autopayOverview.getCustomAmount();
                        paymentOptions2 = paymentOptions;
                    } else {
                        paymentOptions2 = paymentOptions;
                        currencyAmount = null;
                    }
                    selectAmountMapper$autopayCardData$1.getHighSpeedVideoSizes = paymentOptions2;
                    creditProductIdentifier2 = creditProductIdentifier;
                    selectAmountMapper$autopayCardData$1.Camera2StreamConfigurationMap = creditProductIdentifier2;
                    selectAmountMapper$autopayCardData$1.getOutputFormats = 1;
                    obj = Camera2StreamConfigurationMap(currencyAmount, selectAmountMapper$autopayCardData$1);
                } else {
                    if (i != 1) {
                        if (i != 2) {
                            throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        uiString = (com.paypal.oslo.feature.revolvingcreditservicing.ui.common.components.UiString) selectAmountMapper$autopayCardData$1.getInputFormats;
                        autopayRowUiModel = (com.paypal.oslo.feature.revolvingcreditservicing.ui.common.components.autopaystatus.autopayRow.AutopayRowUiModel) selectAmountMapper$autopayCardData$1.getHighSpeedVideoFpsRangesFor;
                        kotlin.ResultKt.throwOnFailure(obj);
                        return new com.paypal.oslo.feature.revolvingcreditservicing.ui.makeapayment.selectamount.uimodel.AutopayCardUiModel(uiString, autopayRowUiModel, (com.paypal.oslo.feature.revolvingcreditservicing.ui.common.components.UiString) obj);
                    }
                    com.paypal.oslo.feature.revolvingcreditservicing.api.model.CreditProductIdentifier creditProductIdentifier3 = (com.paypal.oslo.feature.revolvingcreditservicing.api.model.CreditProductIdentifier) selectAmountMapper$autopayCardData$1.Camera2StreamConfigurationMap;
                    com.paypal.oslo.feature.revolvingcreditservicing.domain.model.accountsummary.PaymentOptions paymentOptions3 = (com.paypal.oslo.feature.revolvingcreditservicing.domain.model.accountsummary.PaymentOptions) selectAmountMapper$autopayCardData$1.getHighSpeedVideoSizes;
                    kotlin.ResultKt.throwOnFailure(obj);
                    creditProductIdentifier2 = creditProductIdentifier3;
                    paymentOptions2 = paymentOptions3;
                }
                java.lang.String str = (java.lang.String) obj;
                java.util.Locale locale = com.paypal.oslo.feature.revolvingcreditservicing.utils.LocaleMapperKt.toLocale(creditProductIdentifier2);
                com.paypal.oslo.feature.revolvingcreditservicing.ui.common.components.autopaystatus.autopayRow.AutopayRowUiModel mapAutopayStatus = this.getHighSpeedVideoFpsRanges.mapAutopayStatus(paymentOptions2.getAutopayOverview(), paymentOptions2.getBilling(), str, creditProductIdentifier2);
                com.paypal.oslo.feature.revolvingcreditservicing.domain.model.accountsummary.Billing billing = paymentOptions2.getBilling();
                com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.PaymentStatus paymentStatus = billing == null ? billing.getPaymentStatus() : null;
                i2 = paymentStatus != null ? -1 : com.paypal.oslo.feature.revolvingcreditservicing.ui.makeapayment.selectamount.mapper.SelectAmountMapper.WhenMappings.$EnumSwitchMapping$0[paymentStatus.ordinal()];
                if (i2 != 1) {
                    stringResOnly = new com.paypal.oslo.feature.revolvingcreditservicing.ui.common.components.UiString.StringResOnly(com.paypal.oslo.feature.revolvingcreditservicing.R.string.feature_revolvingcredit_servicing_payments_summary_payment_past_due, (com.paypal.oslo.feature.revolvingcreditservicing.api.model.CreditProductIdentifier) null, false, 6, (kotlin.jvm.internal.DefaultConstructorMarker) null);
                } else if (i2 == 2) {
                    stringResOnly = new com.paypal.oslo.feature.revolvingcreditservicing.ui.common.components.UiString.StringResOnly(com.paypal.oslo.feature.revolvingcreditservicing.R.string.feature_revolvingcredit_servicing_payments_summary_no_payment_due, (com.paypal.oslo.feature.revolvingcreditservicing.api.model.CreditProductIdentifier) null, false, 6, (kotlin.jvm.internal.DefaultConstructorMarker) null);
                } else {
                    com.paypal.oslo.feature.revolvingcreditservicing.domain.model.accountsummary.Billing billing2 = paymentOptions2.getBilling();
                    if (billing2 != null && (nextPaymentDueTime = billing2.getNextPaymentDueTime()) != null && (format = this.Camera2StreamConfigurationMap.format(nextPaymentDueTime, com.paypal.oslo.feature.revolvingcreditservicing.domain.formatter.date.DateFormat.DateMonthDayShort.INSTANCE, locale)) != null) {
                        stringResWithParameter = new com.paypal.oslo.feature.revolvingcreditservicing.ui.common.components.UiString.StringResWithParameter(com.paypal.oslo.feature.revolvingcreditservicing.R.string.feature_revolvingcredit_servicing_payments_summary_payment_due, new java.lang.Object[]{format}, null, false, 12, null);
                    }
                    stringResOnly = stringResWithParameter;
                }
                java.util.List<com.paypal.oslo.feature.revolvingcreditservicing.domain.model.repayment.RepaymentActivity> repayments = paymentOptions2.getRepayments();
                selectAmountMapper$autopayCardData$1.getHighSpeedVideoSizes = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(paymentOptions2);
                selectAmountMapper$autopayCardData$1.Camera2StreamConfigurationMap = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(creditProductIdentifier2);
                selectAmountMapper$autopayCardData$1.getHighResolutionOutputSizeshNQ4ISI = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(str);
                selectAmountMapper$autopayCardData$1.getHighSpeedVideoFpsRanges = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(locale);
                selectAmountMapper$autopayCardData$1.getHighSpeedVideoFpsRangesFor = mapAutopayStatus;
                selectAmountMapper$autopayCardData$1.getInputFormats = stringResOnly;
                selectAmountMapper$autopayCardData$1.getOutputFormats = 2;
                obj = this.getHighResolutionOutputSizeshNQ4ISI.map(repayments, creditProductIdentifier2, selectAmountMapper$autopayCardData$1);
                if (obj != coroutine_suspended) {
                    uiString = stringResOnly;
                    autopayRowUiModel = mapAutopayStatus;
                    return new com.paypal.oslo.feature.revolvingcreditservicing.ui.makeapayment.selectamount.uimodel.AutopayCardUiModel(uiString, autopayRowUiModel, (com.paypal.oslo.feature.revolvingcreditservicing.ui.common.components.UiString) obj);
                }
                return coroutine_suspended;
            }
        }
        selectAmountMapper$autopayCardData$1 = new com.paypal.oslo.feature.revolvingcreditservicing.ui.makeapayment.selectamount.mapper.SelectAmountMapper$autopayCardData$1(this, continuation);
        obj = selectAmountMapper$autopayCardData$1.getInputSizeshNQ4ISI;
        coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = selectAmountMapper$autopayCardData$1.getOutputFormats;
        com.paypal.oslo.feature.revolvingcreditservicing.ui.common.components.UiString.StringResWithParameter stringResWithParameter2 = null;
        if (i != 0) {
        }
        java.lang.String str2 = (java.lang.String) obj;
        java.util.Locale locale2 = com.paypal.oslo.feature.revolvingcreditservicing.utils.LocaleMapperKt.toLocale(creditProductIdentifier2);
        com.paypal.oslo.feature.revolvingcreditservicing.ui.common.components.autopaystatus.autopayRow.AutopayRowUiModel mapAutopayStatus2 = this.getHighSpeedVideoFpsRanges.mapAutopayStatus(paymentOptions2.getAutopayOverview(), paymentOptions2.getBilling(), str2, creditProductIdentifier2);
        com.paypal.oslo.feature.revolvingcreditservicing.domain.model.accountsummary.Billing billing3 = paymentOptions2.getBilling();
        if (billing3 == null) {
        }
        if (paymentStatus != null) {
        }
        if (i2 != 1) {
        }
        java.util.List<com.paypal.oslo.feature.revolvingcreditservicing.domain.model.repayment.RepaymentActivity> repayments2 = paymentOptions2.getRepayments();
        selectAmountMapper$autopayCardData$1.getHighSpeedVideoSizes = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(paymentOptions2);
        selectAmountMapper$autopayCardData$1.Camera2StreamConfigurationMap = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(creditProductIdentifier2);
        selectAmountMapper$autopayCardData$1.getHighResolutionOutputSizeshNQ4ISI = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(str2);
        selectAmountMapper$autopayCardData$1.getHighSpeedVideoFpsRanges = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(locale2);
        selectAmountMapper$autopayCardData$1.getHighSpeedVideoFpsRangesFor = mapAutopayStatus2;
        selectAmountMapper$autopayCardData$1.getInputFormats = stringResOnly;
        selectAmountMapper$autopayCardData$1.getOutputFormats = 2;
        obj = this.getHighResolutionOutputSizeshNQ4ISI.map(repayments2, creditProductIdentifier2, selectAmountMapper$autopayCardData$1);
        if (obj != coroutine_suspended) {
        }
        return coroutine_suspended;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:12:0x0054 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0057 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0037  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0025  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object Camera2StreamConfigurationMap(com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.core.CurrencyAmount currencyAmount, kotlin.coroutines.Continuation<? super java.lang.String> continuation) {
        com.paypal.oslo.feature.revolvingcreditservicing.ui.makeapayment.selectamount.mapper.SelectAmountMapper$formatCurrency$1 selectAmountMapper$formatCurrency$1;
        int i;
        if (continuation instanceof com.paypal.oslo.feature.revolvingcreditservicing.ui.makeapayment.selectamount.mapper.SelectAmountMapper$formatCurrency$1) {
            selectAmountMapper$formatCurrency$1 = (com.paypal.oslo.feature.revolvingcreditservicing.ui.makeapayment.selectamount.mapper.SelectAmountMapper$formatCurrency$1) continuation;
            if ((selectAmountMapper$formatCurrency$1.getHighSpeedVideoFpsRanges & Integer.MIN_VALUE) != 0) {
                selectAmountMapper$formatCurrency$1.getHighSpeedVideoFpsRanges -= 2147483648;
                com.paypal.oslo.feature.revolvingcreditservicing.ui.makeapayment.selectamount.mapper.SelectAmountMapper$formatCurrency$1 selectAmountMapper$formatCurrency$12 = selectAmountMapper$formatCurrency$1;
                java.lang.Object obj = selectAmountMapper$formatCurrency$12.Camera2StreamConfigurationMap;
                java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = selectAmountMapper$formatCurrency$12.getHighSpeedVideoFpsRanges;
                if (i != 0) {
                    kotlin.ResultKt.throwOnFailure(obj);
                    com.paypal.oslo.feature.revolvingcreditservicing.domain.formatter.currency.CurrencyFormatterFacade currencyFormatterFacade = this.getHighSpeedVideoFpsRangesFor;
                    selectAmountMapper$formatCurrency$12.getHighResolutionOutputSizeshNQ4ISI = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(currencyAmount);
                    selectAmountMapper$formatCurrency$12.getHighSpeedVideoFpsRanges = 1;
                    obj = com.paypal.oslo.feature.revolvingcreditservicing.domain.formatter.currency.CurrencyFormatterFacade.format$default(currencyFormatterFacade, currencyAmount, null, 0, selectAmountMapper$formatCurrency$12, 6, null);
                    if (obj == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else {
                    if (i != 1) {
                        throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    kotlin.ResultKt.throwOnFailure(obj);
                }
                java.lang.String str = (java.lang.String) obj;
                return str != null ? "" : str;
            }
        }
        selectAmountMapper$formatCurrency$1 = new com.paypal.oslo.feature.revolvingcreditservicing.ui.makeapayment.selectamount.mapper.SelectAmountMapper$formatCurrency$1(this, continuation);
        com.paypal.oslo.feature.revolvingcreditservicing.ui.makeapayment.selectamount.mapper.SelectAmountMapper$formatCurrency$1 selectAmountMapper$formatCurrency$122 = selectAmountMapper$formatCurrency$1;
        java.lang.Object obj2 = selectAmountMapper$formatCurrency$122.Camera2StreamConfigurationMap;
        java.lang.Object coroutine_suspended2 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = selectAmountMapper$formatCurrency$122.getHighSpeedVideoFpsRanges;
        if (i != 0) {
        }
        java.lang.String str2 = (java.lang.String) obj2;
        if (str2 != null) {
        }
    }

    public final java.time.LocalDate getDueDate(com.paypal.oslo.feature.revolvingcreditservicing.domain.model.accountsummary.PaymentOptions paymentOptions) {
        java.time.Instant nextPaymentDueTime;
        java.time.ZonedDateTime atZone;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(paymentOptions, "");
        com.paypal.oslo.feature.revolvingcreditservicing.domain.model.accountsummary.Billing billing = paymentOptions.getBilling();
        if (billing == null || (nextPaymentDueTime = billing.getNextPaymentDueTime()) == null || (atZone = nextPaymentDueTime.atZone(java.time.ZoneId.systemDefault())) == null) {
            return null;
        }
        return atZone.toLocalDate();
    }

    public final com.paypal.oslo.feature.revolvingcreditservicing.ui.common.components.error.ErrorUiModel getMaxAllowableErrorUiModel() {
        com.paypal.oslo.feature.revolvingcreditservicing.ui.common.components.UiString.StringResOnly uiString = com.paypal.oslo.feature.revolvingcreditservicing.ui.common.components.UiStringKt.toUiString(com.paypal.oslo.feature.revolvingcreditservicing.R.string.feature_revolvingcredit_servicing_make_a_payment_max_allowable_error_title);
        com.paypal.oslo.feature.revolvingcreditservicing.ui.common.components.UiString.StringResOnly uiString2 = com.paypal.oslo.feature.revolvingcreditservicing.ui.common.components.UiStringKt.toUiString(com.paypal.oslo.feature.revolvingcreditservicing.R.string.feature_revolvingcredit_servicing_make_a_payment_max_allowable_description);
        com.paypal.oslo.feature.revolvingcreditservicing.ui.common.components.UiString.StringResOnly uiString3 = com.paypal.oslo.feature.revolvingcreditservicing.ui.common.components.UiStringKt.toUiString(com.paypal.oslo.feature.revolvingcreditservicing.R.string.feature_revolvingcredit_servicing_make_a_payment_max_allowable_cta_title);
        return new com.paypal.oslo.feature.revolvingcreditservicing.ui.common.components.error.ErrorUiModel(uiString2, uiString, uiString3, com.paypal.pds.components.ButtonStyle.Secondary.INSTANCE, com.paypal.oslo.feature.revolvingcreditservicing.ui.common.components.error.ContentAlignment.CENTER, null, null, false, 224, null);
    }

    public final com.paypal.oslo.feature.revolvingcreditservicing.ui.common.components.error.ErrorUiModel getGenericErrorUiModel() {
        com.paypal.oslo.feature.revolvingcreditservicing.ui.common.components.UiString.StringResOnly uiString = com.paypal.oslo.feature.revolvingcreditservicing.ui.common.components.UiStringKt.toUiString(com.paypal.oslo.feature.revolvingcreditservicing.R.string.feature_revolvingcredit_servicing_common_something_went_wrong_error_title);
        com.paypal.oslo.feature.revolvingcreditservicing.ui.common.components.UiString.StringResOnly uiString2 = com.paypal.oslo.feature.revolvingcreditservicing.ui.common.components.UiStringKt.toUiString(com.paypal.oslo.feature.revolvingcreditservicing.R.string.feature_revolvingcredit_servicing_payments_load_error_description);
        com.paypal.oslo.feature.revolvingcreditservicing.ui.common.components.UiString.StringResOnly uiString3 = com.paypal.oslo.feature.revolvingcreditservicing.ui.common.components.UiStringKt.toUiString(com.paypal.oslo.feature.revolvingcreditservicing.R.string.feature_revolvingcredit_servicing_common_try_again);
        return new com.paypal.oslo.feature.revolvingcreditservicing.ui.common.components.error.ErrorUiModel(uiString2, uiString, uiString3, com.paypal.pds.components.ButtonStyle.Secondary.INSTANCE, com.paypal.oslo.feature.revolvingcreditservicing.ui.common.components.error.ContentAlignment.CENTER, null, null, false, 224, null);
    }

    @kotlin.Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.PaymentStatus.values().length];
            try {
                iArr[com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.PaymentStatus.PAST_DUE.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused) {
            }
            try {
                iArr[com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.PaymentStatus.NO_PAYMENT_DUE.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }
}
