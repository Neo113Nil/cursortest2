package com.paypal.oslo.feature.revolvingcreditservicing.ui.autopay.viewmodel;

@kotlin.Metadata(d1 = {"\u0000\\\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0000\u0018\u00002\u00020\u0001B\u0019\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\"\u0010\r\u001a\u0004\u0018\u00010\f2\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\nH\u0086@¢\u0006\u0004\b\r\u0010\u000eJ\u001a\u0010\u0012\u001a\u00020\u00112\b\u0010\u0010\u001a\u0004\u0018\u00010\u000fH\u0082@¢\u0006\u0004\b\u0012\u0010\u0013J.\u0010\u0012\u001a\u0004\u0018\u00010\u00172\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00150\u00142\f\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00150\u0014H\u0082@¢\u0006\u0004\b\u0012\u0010\u0018J.\u0010\u001c\u001a\u00020\u00172\u0006\u0010\u0010\u001a\u00020\u00192\u0006\u0010\u0016\u001a\u00020\u001a2\f\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u00150\u0014H\u0082@¢\u0006\u0004\b\u001c\u0010\u001dJ&\u0010\u0012\u001a\u00020\u00172\u0006\u0010\u0010\u001a\u00020\u00192\f\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00150\u0014H\u0082@¢\u0006\u0004\b\u0012\u0010\u001eJ\u0017\u0010\u0012\u001a\u00020\u00172\u0006\u0010\u0010\u001a\u00020\u001aH\u0002¢\u0006\u0004\b\u0012\u0010\u001fJ\u0017\u0010\u0012\u001a\u00020\u00172\u0006\u0010\u0010\u001a\u00020 H\u0002¢\u0006\u0004\b\u0012\u0010!J&\u0010\"\u001a\u00020\u00112\u0006\u0010\u0010\u001a\u00020\u00192\f\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00150\u0014H\u0082@¢\u0006\u0004\b\"\u0010\u001eR\u0014\u0010\"\u001a\u00020\u00028\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b#\u0010$R\u0014\u0010&\u001a\u00020\u00048\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\"\u0010%"}, d2 = {"Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/autopay/viewmodel/AutopayOverviewToAutopayMapper;", "", "Lcom/paypal/oslo/feature/revolvingcreditservicing/domain/formatter/currency/CurrencyFormatterFacade;", "currencyFormatter", "Lcom/paypal/oslo/feature/revolvingcreditservicing/domain/formatter/date/DateFormatterFacade;", "dateFormatterFacade", "<init>", "(Lcom/paypal/oslo/feature/revolvingcreditservicing/domain/formatter/currency/CurrencyFormatterFacade;Lcom/paypal/oslo/feature/revolvingcreditservicing/domain/formatter/date/DateFormatterFacade;)V", "Lcom/paypal/oslo/feature/revolvingcreditservicing/domain/model/autopay/AutopayOverview;", com.google.firebase.messaging.Constants.ScionAnalytics.MessageType.DATA_MESSAGE, "Lcom/paypal/oslo/feature/revolvingcreditservicing/api/model/CreditProductIdentifier;", com.paypal.oslo.feature.revolvingcreditservicing.ui.common.base.ObservabilityMiddleware.KEY_CPI, "Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/autopay/uimodel/AutopayScreenUiModel;", "toUi", "(Lcom/paypal/oslo/feature/revolvingcreditservicing/domain/model/autopay/AutopayOverview;Lcom/paypal/oslo/feature/revolvingcreditservicing/api/model/CreditProductIdentifier;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lcom/paypal/oslo/feature/revolvingcreditservicing/domain/model/common/core/CurrencyAmount;", "p0", "", "getHighSpeedVideoFpsRangesFor", "(Lcom/paypal/oslo/feature/revolvingcreditservicing/domain/model/common/core/CurrencyAmount;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "", "Lcom/paypal/oslo/feature/revolvingcreditservicing/domain/model/autopay/EligiblePaymentInstrument;", "p1", "Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/autopay/uimodel/SelectedPaymentMethodUiModel;", "(Ljava/util/List;Ljava/util/List;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lcom/paypal/oslo/feature/revolvingcreditservicing/domain/model/autopay/EligiblePaymentInstrument$Balance;", "Lcom/paypal/oslo/feature/revolvingcreditservicing/domain/model/autopay/EligiblePaymentInstrument$Bank;", "p2", "getHighSpeedVideoFpsRanges", "(Lcom/paypal/oslo/feature/revolvingcreditservicing/domain/model/autopay/EligiblePaymentInstrument$Balance;Lcom/paypal/oslo/feature/revolvingcreditservicing/domain/model/autopay/EligiblePaymentInstrument$Bank;Ljava/util/List;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "(Lcom/paypal/oslo/feature/revolvingcreditservicing/domain/model/autopay/EligiblePaymentInstrument$Balance;Ljava/util/List;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "(Lcom/paypal/oslo/feature/revolvingcreditservicing/domain/model/autopay/EligiblePaymentInstrument$Bank;)Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/autopay/uimodel/SelectedPaymentMethodUiModel;", "Lcom/paypal/oslo/feature/revolvingcreditservicing/domain/model/autopay/EligiblePaymentInstrument$Card;", "(Lcom/paypal/oslo/feature/revolvingcreditservicing/domain/model/autopay/EligiblePaymentInstrument$Card;)Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/autopay/uimodel/SelectedPaymentMethodUiModel;", "Camera2StreamConfigurationMap", "getHighSpeedVideoSizes", "Lcom/paypal/oslo/feature/revolvingcreditservicing/domain/formatter/currency/CurrencyFormatterFacade;", "Lcom/paypal/oslo/feature/revolvingcreditservicing/domain/formatter/date/DateFormatterFacade;", "getHighResolutionOutputSizeshNQ4ISI"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class AutopayOverviewToAutopayMapper {
    public static final int $stable = 0;

    /* renamed from: Camera2StreamConfigurationMap, reason: from kotlin metadata */
    private final com.paypal.oslo.feature.revolvingcreditservicing.domain.formatter.date.DateFormatterFacade getHighResolutionOutputSizeshNQ4ISI;

    /* renamed from: getHighSpeedVideoSizes, reason: from kotlin metadata */
    private final com.paypal.oslo.feature.revolvingcreditservicing.domain.formatter.currency.CurrencyFormatterFacade Camera2StreamConfigurationMap;

    @javax.inject.Inject
    public AutopayOverviewToAutopayMapper(com.paypal.oslo.feature.revolvingcreditservicing.domain.formatter.currency.CurrencyFormatterFacade currencyFormatterFacade, com.paypal.oslo.feature.revolvingcreditservicing.domain.formatter.date.DateFormatterFacade dateFormatterFacade) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(currencyFormatterFacade, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(dateFormatterFacade, "");
        this.Camera2StreamConfigurationMap = currencyFormatterFacade;
        this.getHighResolutionOutputSizeshNQ4ISI = dateFormatterFacade;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:15:0x051d  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x055a  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0598  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x05a4  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x05b5  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0588  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0549  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x04b6  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x04c0  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x050a  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x044b  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x0132  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x002c  */
    /* JADX WARN: Type inference failed for: r13v14, types: [java.util.Map] */
    /* JADX WARN: Type inference failed for: r3v26, types: [com.paypal.oslo.feature.revolvingcreditservicing.ui.common.components.UiString] */
    /* JADX WARN: Type inference failed for: r8v15, types: [java.util.Map] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object toUi(com.paypal.oslo.feature.revolvingcreditservicing.domain.model.autopay.AutopayOverview autopayOverview, com.paypal.oslo.feature.revolvingcreditservicing.api.model.CreditProductIdentifier creditProductIdentifier, kotlin.coroutines.Continuation<? super com.paypal.oslo.feature.revolvingcreditservicing.ui.autopay.uimodel.AutopayScreenUiModel> continuation) {
        com.paypal.oslo.feature.revolvingcreditservicing.ui.autopay.viewmodel.AutopayOverviewToAutopayMapper$toUi$1 autopayOverviewToAutopayMapper$toUi$1;
        java.lang.Object obj;
        java.lang.Object coroutine_suspended;
        int i;
        com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.core.CurrencyAmount maxAllowableRepaymentAmount;
        java.math.BigDecimal bigDecimal;
        java.lang.String str;
        java.lang.String str2;
        com.paypal.oslo.feature.revolvingcreditservicing.domain.model.autopay.AutopayOverview autopayOverview2;
        java.lang.String str3;
        java.lang.Object highSpeedVideoFpsRangesFor;
        java.lang.Object obj2;
        java.util.LinkedHashMap linkedHashMap;
        java.util.LinkedHashMap linkedHashMap2;
        java.util.List<com.paypal.oslo.feature.revolvingcreditservicing.domain.model.autopay.PaymentAmountOption> list;
        java.util.Map map;
        com.paypal.oslo.feature.revolvingcreditservicing.ui.common.components.UiString uiString;
        com.paypal.oslo.feature.revolvingcreditservicing.domain.model.autopay.AutopayOverview autopayOverview3;
        java.math.BigDecimal bigDecimal2;
        java.lang.String str4;
        com.paypal.oslo.feature.revolvingcreditservicing.domain.model.autopay.PaymentOption paymentOption;
        java.math.BigDecimal bigDecimal3;
        com.paypal.oslo.feature.revolvingcreditservicing.domain.model.autopay.PaymentConstraints paymentConstraints;
        com.paypal.oslo.feature.revolvingcreditservicing.api.model.CreditProductIdentifier creditProductIdentifier2;
        java.math.BigDecimal bigDecimal4;
        kotlin.Pair pair;
        java.lang.String value;
        java.math.BigDecimal bigDecimal5;
        java.lang.String value2;
        com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.core.CurrencyAmount minimumCustomAmount;
        java.lang.String value3;
        com.paypal.oslo.feature.revolvingcreditservicing.domain.model.autopay.PaymentConstraints paymentConstraints2;
        java.lang.String str5;
        java.math.BigDecimal bigDecimal6;
        java.lang.String str6;
        java.lang.String str7;
        com.paypal.oslo.feature.revolvingcreditservicing.api.model.CreditProductIdentifier creditProductIdentifier3;
        java.util.LinkedHashMap linkedHashMap3;
        java.math.BigDecimal bigDecimal7;
        java.util.LinkedHashMap linkedHashMap4;
        java.util.List<com.paypal.oslo.feature.revolvingcreditservicing.domain.model.autopay.PaymentAmountOption> list2;
        com.paypal.oslo.feature.revolvingcreditservicing.domain.model.autopay.PaymentOption paymentOption2;
        com.paypal.oslo.feature.revolvingcreditservicing.ui.common.components.UiString uiString2;
        java.util.Map map2;
        com.paypal.oslo.feature.revolvingcreditservicing.ui.common.components.selectamount.uimodel.SelectAmountUiModel selectAmountUiModel;
        java.util.List<com.paypal.oslo.feature.revolvingcreditservicing.domain.model.autopay.EligiblePaymentInstrument> fundingInstruments;
        java.util.List<com.paypal.oslo.feature.revolvingcreditservicing.domain.model.autopay.EligiblePaymentInstrument> eligibleFundingInstruments;
        java.lang.Object highSpeedVideoFpsRangesFor2;
        com.paypal.oslo.feature.revolvingcreditservicing.ui.common.components.UiString uiString3;
        com.paypal.oslo.feature.revolvingcreditservicing.ui.common.components.UiString uiString4;
        java.lang.String str8;
        com.paypal.oslo.feature.revolvingcreditservicing.ui.common.components.UiString.StringResOnly stringResOnly;
        com.paypal.oslo.feature.revolvingcreditservicing.api.model.CreditProductIdentifier creditProductIdentifier4;
        com.paypal.oslo.feature.revolvingcreditservicing.domain.model.autopay.AutopayOverview autopayOverview4;
        java.util.List<com.paypal.oslo.feature.revolvingcreditservicing.domain.model.autopay.EligiblePaymentInstrument> fundingInstruments2;
        java.util.ArrayList arrayList;
        com.paypal.oslo.feature.revolvingcreditservicing.ui.common.components.UiString.PlainString plainString;
        java.lang.String autopayTermsUrl;
        com.paypal.oslo.feature.revolvingcreditservicing.ui.autopay.viewmodel.AutopayOverviewToAutopayMapper autopayOverviewToAutopayMapper = this;
        if (continuation instanceof com.paypal.oslo.feature.revolvingcreditservicing.ui.autopay.viewmodel.AutopayOverviewToAutopayMapper$toUi$1) {
            autopayOverviewToAutopayMapper$toUi$1 = (com.paypal.oslo.feature.revolvingcreditservicing.ui.autopay.viewmodel.AutopayOverviewToAutopayMapper$toUi$1) continuation;
            if ((autopayOverviewToAutopayMapper$toUi$1.toString & Integer.MIN_VALUE) != 0) {
                autopayOverviewToAutopayMapper$toUi$1.toString -= 2147483648;
                obj = autopayOverviewToAutopayMapper$toUi$1.isOutputSupportedFor;
                coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = autopayOverviewToAutopayMapper$toUi$1.toString;
                if (i != 0) {
                    kotlin.ResultKt.throwOnFailure(obj);
                    if (autopayOverview.getPaymentConstraints() == null || autopayOverview.getPaymentConstraints().getPaymentAmountOptions().isEmpty() || autopayOverview.getPaymentConstraints().getMinimumCustomAmount() == null || autopayOverview.getAutopayTermsUrl() == null) {
                        return null;
                    }
                    com.paypal.oslo.feature.revolvingcreditservicing.domain.model.autopay.PaymentConstraints paymentConstraints3 = autopayOverview.getPaymentConstraints();
                    java.util.List<com.paypal.oslo.feature.revolvingcreditservicing.domain.model.autopay.PaymentAmountOption> paymentAmountOptions = paymentConstraints3 != null ? paymentConstraints3.getPaymentAmountOptions() : null;
                    if (paymentAmountOptions == null) {
                        paymentAmountOptions = kotlin.collections.CollectionsKt.emptyList();
                    }
                    maxAllowableRepaymentAmount = autopayOverview.getMaxAllowableRepaymentAmount();
                    com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.core.CurrencyAmount customAmount = autopayOverview.getCustomAmount();
                    if (customAmount == null || (value3 = customAmount.getValue()) == null || (bigDecimal = kotlin.text.StringsKt.toBigDecimalOrNull(value3)) == null) {
                        bigDecimal = java.math.BigDecimal.ZERO;
                    }
                    java.lang.String currencyCode = (paymentConstraints3 == null || (minimumCustomAmount = paymentConstraints3.getMinimumCustomAmount()) == null) ? null : minimumCustomAmount.getCurrencyCode();
                    str = currencyCode == null ? "" : currencyCode;
                    java.util.List<com.paypal.oslo.feature.revolvingcreditservicing.domain.model.autopay.PaymentAmountOption> list3 = paymentAmountOptions;
                    java.util.LinkedHashMap linkedHashMap5 = new java.util.LinkedHashMap(kotlin.ranges.RangesKt.coerceAtLeast(kotlin.collections.MapsKt.mapCapacity(kotlin.collections.CollectionsKt.collectionSizeOrDefault(list3, 10)), 16));
                    for (com.paypal.oslo.feature.revolvingcreditservicing.domain.model.autopay.PaymentAmountOption paymentAmountOption : list3) {
                        int i2 = com.paypal.oslo.feature.revolvingcreditservicing.ui.autopay.viewmodel.AutopayOverviewToAutopayMapper.WhenMappings.$EnumSwitchMapping$0[paymentAmountOption.getType().ordinal()];
                        if (i2 == 1) {
                            com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.core.CurrencyAmount amount = paymentAmountOption.getAmount();
                            if (amount == null || (value = amount.getValue()) == null || (bigDecimal4 = kotlin.text.StringsKt.toBigDecimalOrNull(value)) == null) {
                                bigDecimal4 = java.math.BigDecimal.ZERO;
                            }
                            java.math.BigDecimal bigDecimal8 = bigDecimal4;
                            com.paypal.oslo.feature.revolvingcreditservicing.domain.model.autopay.PaymentOption paymentOption3 = com.paypal.oslo.feature.revolvingcreditservicing.domain.model.autopay.PaymentOption.MINIMUM_PAYMENT_DUE;
                            com.paypal.oslo.feature.revolvingcreditservicing.ui.common.components.UiString.StringResOnly stringResOnly2 = new com.paypal.oslo.feature.revolvingcreditservicing.ui.common.components.UiString.StringResOnly(com.paypal.oslo.feature.revolvingcreditservicing.R.string.feature_revolvingcredit_servicing_common_minimum_payment_due, (com.paypal.oslo.feature.revolvingcreditservicing.api.model.CreditProductIdentifier) null, false, 6, (kotlin.jvm.internal.DefaultConstructorMarker) null);
                            kotlin.jvm.internal.Intrinsics.checkNotNull(bigDecimal8);
                            pair = kotlin.TuplesKt.to(paymentOption3, new com.paypal.oslo.feature.revolvingcreditservicing.ui.common.components.selectamount.uimodel.SelectAmountOptionUiModel(stringResOnly2, null, null, null, bigDecimal8, false, 46, null));
                        } else if (i2 != 2) {
                            pair = i2 != 3 ? kotlin.TuplesKt.to(paymentAmountOption.getType(), null) : kotlin.TuplesKt.to(com.paypal.oslo.feature.revolvingcreditservicing.domain.model.autopay.PaymentOption.CUSTOM_AMOUNT, new com.paypal.oslo.feature.revolvingcreditservicing.ui.common.components.selectamount.uimodel.SelectAmountOptionUiModel(new com.paypal.oslo.feature.revolvingcreditservicing.ui.common.components.UiString.StringResOnly(com.paypal.oslo.feature.revolvingcreditservicing.R.string.feature_revolvingcredit_servicing_autopay_status_description_custom_amount, (com.paypal.oslo.feature.revolvingcreditservicing.api.model.CreditProductIdentifier) null, false, 6, (kotlin.jvm.internal.DefaultConstructorMarker) null), null, null, null, null, false, 62, null));
                        } else {
                            com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.core.CurrencyAmount amount2 = paymentAmountOption.getAmount();
                            if (amount2 == null || (value2 = amount2.getValue()) == null || (bigDecimal5 = kotlin.text.StringsKt.toBigDecimalOrNull(value2)) == null) {
                                bigDecimal5 = java.math.BigDecimal.ZERO;
                            }
                            java.math.BigDecimal bigDecimal9 = bigDecimal5;
                            com.paypal.oslo.feature.revolvingcreditservicing.domain.model.autopay.PaymentOption paymentOption4 = com.paypal.oslo.feature.revolvingcreditservicing.domain.model.autopay.PaymentOption.STATEMENT_BALANCE;
                            com.paypal.oslo.feature.revolvingcreditservicing.ui.common.components.UiString.StringResOnly stringResOnly3 = new com.paypal.oslo.feature.revolvingcreditservicing.ui.common.components.UiString.StringResOnly(com.paypal.oslo.feature.revolvingcreditservicing.R.string.feature_revolvingcredit_servicing_autopay_status_description_statement_balance, (com.paypal.oslo.feature.revolvingcreditservicing.api.model.CreditProductIdentifier) null, false, 6, (kotlin.jvm.internal.DefaultConstructorMarker) null);
                            kotlin.jvm.internal.Intrinsics.checkNotNull(bigDecimal9);
                            pair = kotlin.TuplesKt.to(paymentOption4, new com.paypal.oslo.feature.revolvingcreditservicing.ui.common.components.selectamount.uimodel.SelectAmountOptionUiModel(stringResOnly3, null, null, null, bigDecimal9, false, 46, null));
                        }
                        linkedHashMap5.put(pair.getFirst(), pair.getSecond());
                    }
                    java.util.LinkedHashMap linkedHashMap6 = new java.util.LinkedHashMap();
                    for (java.util.Map.Entry entry : linkedHashMap5.entrySet()) {
                        if (((com.paypal.oslo.feature.revolvingcreditservicing.ui.common.components.selectamount.uimodel.SelectAmountOptionUiModel) entry.getValue()) != null) {
                            linkedHashMap6.put(entry.getKey(), entry.getValue());
                        }
                    }
                    java.util.LinkedHashMap linkedHashMap7 = linkedHashMap6;
                    java.util.LinkedHashMap linkedHashMap8 = new java.util.LinkedHashMap(kotlin.collections.MapsKt.mapCapacity(linkedHashMap7.size()));
                    for (java.util.Map.Entry entry2 : linkedHashMap7.entrySet()) {
                        java.lang.Object key = entry2.getKey();
                        java.lang.Object value4 = entry2.getValue();
                        kotlin.jvm.internal.Intrinsics.checkNotNull(value4);
                        linkedHashMap8.put(key, (com.paypal.oslo.feature.revolvingcreditservicing.ui.common.components.selectamount.uimodel.SelectAmountOptionUiModel) value4);
                    }
                    java.util.LinkedHashMap linkedHashMap9 = new java.util.LinkedHashMap();
                    com.paypal.oslo.feature.revolvingcreditservicing.ui.common.components.selectamount.uimodel.SelectAmountOptionUiModel selectAmountOptionUiModel = (com.paypal.oslo.feature.revolvingcreditservicing.ui.common.components.selectamount.uimodel.SelectAmountOptionUiModel) linkedHashMap8.get(com.paypal.oslo.feature.revolvingcreditservicing.domain.model.autopay.PaymentOption.MINIMUM_PAYMENT_DUE);
                    if (selectAmountOptionUiModel != null) {
                        linkedHashMap9.put(com.paypal.oslo.feature.revolvingcreditservicing.domain.model.autopay.PaymentOption.MINIMUM_PAYMENT_DUE, selectAmountOptionUiModel);
                        kotlin.Unit unit = kotlin.Unit.INSTANCE;
                    }
                    com.paypal.oslo.feature.revolvingcreditservicing.ui.common.components.selectamount.uimodel.SelectAmountOptionUiModel selectAmountOptionUiModel2 = (com.paypal.oslo.feature.revolvingcreditservicing.ui.common.components.selectamount.uimodel.SelectAmountOptionUiModel) linkedHashMap8.get(com.paypal.oslo.feature.revolvingcreditservicing.domain.model.autopay.PaymentOption.STATEMENT_BALANCE);
                    if (selectAmountOptionUiModel2 != null) {
                        linkedHashMap9.put(com.paypal.oslo.feature.revolvingcreditservicing.domain.model.autopay.PaymentOption.STATEMENT_BALANCE, selectAmountOptionUiModel2);
                        kotlin.Unit unit2 = kotlin.Unit.INSTANCE;
                    }
                    com.paypal.oslo.feature.revolvingcreditservicing.ui.common.components.selectamount.uimodel.SelectAmountOptionUiModel selectAmountOptionUiModel3 = (com.paypal.oslo.feature.revolvingcreditservicing.ui.common.components.selectamount.uimodel.SelectAmountOptionUiModel) linkedHashMap8.get(com.paypal.oslo.feature.revolvingcreditservicing.domain.model.autopay.PaymentOption.CUSTOM_AMOUNT);
                    if (selectAmountOptionUiModel3 != null) {
                        linkedHashMap9.put(com.paypal.oslo.feature.revolvingcreditservicing.domain.model.autopay.PaymentOption.CUSTOM_AMOUNT, selectAmountOptionUiModel3);
                        kotlin.Unit unit3 = kotlin.Unit.INSTANCE;
                    }
                    com.paypal.oslo.feature.revolvingcreditservicing.ui.common.components.UiString.StringResOnly stringResOnly4 = new com.paypal.oslo.feature.revolvingcreditservicing.ui.common.components.UiString.StringResOnly(com.paypal.oslo.feature.revolvingcreditservicing.R.string.feature_revolvingcredit_servicing_autopay_title, (com.paypal.oslo.feature.revolvingcreditservicing.api.model.CreditProductIdentifier) null, false, 6, (kotlin.jvm.internal.DefaultConstructorMarker) null);
                    java.util.LinkedHashMap linkedHashMap10 = linkedHashMap9;
                    com.paypal.oslo.feature.revolvingcreditservicing.domain.model.autopay.PaymentOption repaymentOption = autopayOverview.getRepaymentOption();
                    java.math.BigDecimal bigDecimal10 = autopayOverview.getRepaymentOption() == com.paypal.oslo.feature.revolvingcreditservicing.domain.model.autopay.PaymentOption.CUSTOM_AMOUNT ? bigDecimal : java.math.BigDecimal.ZERO;
                    kotlin.jvm.internal.Intrinsics.checkNotNull(bigDecimal10);
                    str2 = "";
                    if (autopayOverview.getRepaymentOption() == com.paypal.oslo.feature.revolvingcreditservicing.domain.model.autopay.PaymentOption.CUSTOM_AMOUNT) {
                        kotlin.jvm.internal.Intrinsics.checkNotNull(bigDecimal);
                        str3 = com.paypal.oslo.feature.revolvingcreditservicing.utils.BigDecimalExtensionsKt.toCentsString(bigDecimal);
                        autopayOverview2 = autopayOverview;
                    } else {
                        autopayOverview2 = autopayOverview;
                        str3 = str2;
                    }
                    autopayOverviewToAutopayMapper$toUi$1.getHighSpeedVideoFpsRangesFor = autopayOverview2;
                    autopayOverviewToAutopayMapper$toUi$1.getHighResolutionOutputSizeshNQ4ISI = creditProductIdentifier;
                    autopayOverviewToAutopayMapper$toUi$1.getOutputFormats = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(paymentConstraints3);
                    autopayOverviewToAutopayMapper$toUi$1.getOutputMinFrameDuration = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(paymentAmountOptions);
                    autopayOverviewToAutopayMapper$toUi$1.getOutputStallDuration = maxAllowableRepaymentAmount;
                    autopayOverviewToAutopayMapper$toUi$1.getOutputSizeshNQ4ISI = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(bigDecimal);
                    autopayOverviewToAutopayMapper$toUi$1.getOutputStallDurationlomOqCM = str;
                    autopayOverviewToAutopayMapper$toUi$1.getOutputSizes = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(linkedHashMap8);
                    autopayOverviewToAutopayMapper$toUi$1.getOutputMinFrameDurationlomOqCM = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(linkedHashMap9);
                    autopayOverviewToAutopayMapper$toUi$1.getValidOutputFormatsForInputhNQ4ISI = stringResOnly4;
                    autopayOverviewToAutopayMapper$toUi$1.getHighSpeedVideoSizes = linkedHashMap10;
                    autopayOverviewToAutopayMapper$toUi$1.getHighSpeedVideoFpsRanges = repaymentOption;
                    autopayOverviewToAutopayMapper$toUi$1.Camera2StreamConfigurationMap = bigDecimal10;
                    autopayOverviewToAutopayMapper$toUi$1.getInputFormats = str3;
                    autopayOverviewToAutopayMapper$toUi$1.toString = 1;
                    highSpeedVideoFpsRangesFor = autopayOverviewToAutopayMapper.getHighSpeedVideoFpsRangesFor(maxAllowableRepaymentAmount, autopayOverviewToAutopayMapper$toUi$1);
                    if (highSpeedVideoFpsRangesFor != coroutine_suspended) {
                        obj2 = coroutine_suspended;
                        linkedHashMap = linkedHashMap9;
                        linkedHashMap2 = linkedHashMap10;
                        list = paymentAmountOptions;
                        map = linkedHashMap8;
                        uiString = stringResOnly4;
                        autopayOverview3 = autopayOverview;
                        bigDecimal2 = bigDecimal10;
                        str4 = str3;
                        paymentOption = repaymentOption;
                        bigDecimal3 = bigDecimal;
                        paymentConstraints = paymentConstraints3;
                        creditProductIdentifier2 = creditProductIdentifier;
                    }
                    return coroutine_suspended;
                }
                if (i != 1) {
                    if (i != 2) {
                        if (i != 3) {
                            throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        ?? r3 = (com.paypal.oslo.feature.revolvingcreditservicing.ui.common.components.UiString) autopayOverviewToAutopayMapper$toUi$1.Camera2StreamConfigurationMap;
                        uiString3 = (com.paypal.oslo.feature.revolvingcreditservicing.ui.common.components.UiString) autopayOverviewToAutopayMapper$toUi$1.getHighSpeedVideoFpsRanges;
                        selectAmountUiModel = (com.paypal.oslo.feature.revolvingcreditservicing.ui.common.components.selectamount.uimodel.SelectAmountUiModel) autopayOverviewToAutopayMapper$toUi$1.getHighSpeedVideoSizes;
                        com.paypal.oslo.feature.revolvingcreditservicing.ui.common.components.UiString uiString5 = (com.paypal.oslo.feature.revolvingcreditservicing.ui.common.components.UiString) autopayOverviewToAutopayMapper$toUi$1.getValidOutputFormatsForInputhNQ4ISI;
                        java.lang.String str9 = (java.lang.String) autopayOverviewToAutopayMapper$toUi$1.getOutputStallDurationlomOqCM;
                        com.paypal.oslo.feature.revolvingcreditservicing.api.model.CreditProductIdentifier creditProductIdentifier5 = (com.paypal.oslo.feature.revolvingcreditservicing.api.model.CreditProductIdentifier) autopayOverviewToAutopayMapper$toUi$1.getHighResolutionOutputSizeshNQ4ISI;
                        autopayOverview4 = (com.paypal.oslo.feature.revolvingcreditservicing.domain.model.autopay.AutopayOverview) autopayOverviewToAutopayMapper$toUi$1.getHighSpeedVideoFpsRangesFor;
                        kotlin.ResultKt.throwOnFailure(obj);
                        stringResOnly = r3;
                        uiString4 = uiString5;
                        str8 = str9;
                        str2 = "";
                        creditProductIdentifier4 = creditProductIdentifier5;
                        com.paypal.oslo.feature.revolvingcreditservicing.ui.common.components.selectamount.uimodel.SelectAmountUiModel selectAmountUiModel2 = selectAmountUiModel;
                        com.paypal.oslo.feature.revolvingcreditservicing.ui.autopay.uimodel.SelectedPaymentMethodUiModel selectedPaymentMethodUiModel = (com.paypal.oslo.feature.revolvingcreditservicing.ui.autopay.uimodel.SelectedPaymentMethodUiModel) obj;
                        fundingInstruments2 = autopayOverview4.getFundingInstruments();
                        if (fundingInstruments2 == null) {
                            java.util.List<com.paypal.oslo.feature.revolvingcreditservicing.domain.model.autopay.EligiblePaymentInstrument> list4 = fundingInstruments2;
                            java.util.ArrayList arrayList2 = new java.util.ArrayList(kotlin.collections.CollectionsKt.collectionSizeOrDefault(list4, 10));
                            java.util.Iterator it = list4.iterator();
                            while (it.hasNext()) {
                                arrayList2.add(com.paypal.oslo.feature.revolvingcreditservicing.domain.model.autopay.EligiblePaymentInstrumentMapperKt.toFundingInstrument((com.paypal.oslo.feature.revolvingcreditservicing.domain.model.autopay.EligiblePaymentInstrument) it.next()));
                            }
                            arrayList = arrayList2;
                        } else {
                            arrayList = null;
                        }
                        com.paypal.oslo.feature.revolvingcreditservicing.ui.autopay.uimodel.PaymentMethodUiModel paymentMethodUiModel = new com.paypal.oslo.feature.revolvingcreditservicing.ui.autopay.uimodel.PaymentMethodUiModel(uiString3, stringResOnly, selectedPaymentMethodUiModel, null, arrayList, 8, null);
                        if (autopayOverview4.getEffectiveDueTime() == null) {
                            int i3 = com.paypal.oslo.feature.revolvingcreditservicing.R.string.feature_revolvingcredit_servicing_autopay_schedule_info;
                            java.time.Instant effectiveDueTime = autopayOverview4.getEffectiveDueTime();
                            java.lang.String format = effectiveDueTime != null ? autopayOverviewToAutopayMapper.getHighResolutionOutputSizeshNQ4ISI.format(effectiveDueTime, com.paypal.oslo.feature.revolvingcreditservicing.domain.formatter.date.DateFormat.DayWithOrdinal.INSTANCE, com.paypal.oslo.feature.revolvingcreditservicing.utils.LocaleMapperKt.toLocale(creditProductIdentifier4)) : null;
                            if (format == null) {
                                format = str2;
                            }
                            plainString = new com.paypal.oslo.feature.revolvingcreditservicing.ui.common.components.UiString.StringResWithParameter(i3, new java.lang.Object[]{format}, null, false, 12, null);
                        } else {
                            plainString = new com.paypal.oslo.feature.revolvingcreditservicing.ui.common.components.UiString.PlainString("Payments due and processed on the next due date");
                        }
                        com.paypal.oslo.feature.revolvingcreditservicing.ui.common.components.UiString uiString6 = plainString;
                        autopayTermsUrl = autopayOverview4.getAutopayTermsUrl();
                        if (autopayTermsUrl == null) {
                            autopayTermsUrl = str2;
                        }
                        return new com.paypal.oslo.feature.revolvingcreditservicing.ui.autopay.uimodel.AutopayScreenUiModel(uiString4, selectAmountUiModel2, paymentMethodUiModel, uiString6, autopayTermsUrl, autopayOverview4.getEnrolled(), !autopayOverview4.getEnrolled() ? new com.paypal.oslo.feature.revolvingcreditservicing.ui.common.components.UiString.StringResOnly(com.paypal.oslo.feature.revolvingcreditservicing.R.string.feature_revolvingcredit_servicing_common_cancel_autopay, (com.paypal.oslo.feature.revolvingcreditservicing.api.model.CreditProductIdentifier) null, false, 6, (kotlin.jvm.internal.DefaultConstructorMarker) null) : null, str8);
                    }
                    java.math.BigDecimal bigDecimal11 = (java.math.BigDecimal) autopayOverviewToAutopayMapper$toUi$1.getInputSizeshNQ4ISI;
                    java.lang.String str10 = (java.lang.String) autopayOverviewToAutopayMapper$toUi$1.getHighSpeedVideoSizesFor;
                    java.lang.String str11 = (java.lang.String) autopayOverviewToAutopayMapper$toUi$1.getInputFormats;
                    java.math.BigDecimal bigDecimal12 = (java.math.BigDecimal) autopayOverviewToAutopayMapper$toUi$1.Camera2StreamConfigurationMap;
                    com.paypal.oslo.feature.revolvingcreditservicing.domain.model.autopay.PaymentOption paymentOption5 = (com.paypal.oslo.feature.revolvingcreditservicing.domain.model.autopay.PaymentOption) autopayOverviewToAutopayMapper$toUi$1.getHighSpeedVideoFpsRanges;
                    ?? r13 = (java.util.Map) autopayOverviewToAutopayMapper$toUi$1.getHighSpeedVideoSizes;
                    com.paypal.oslo.feature.revolvingcreditservicing.ui.common.components.UiString uiString7 = (com.paypal.oslo.feature.revolvingcreditservicing.ui.common.components.UiString) autopayOverviewToAutopayMapper$toUi$1.getValidOutputFormatsForInputhNQ4ISI;
                    linkedHashMap3 = (java.util.LinkedHashMap) autopayOverviewToAutopayMapper$toUi$1.getOutputMinFrameDurationlomOqCM;
                    map2 = (java.util.Map) autopayOverviewToAutopayMapper$toUi$1.getOutputSizes;
                    java.lang.String str12 = (java.lang.String) autopayOverviewToAutopayMapper$toUi$1.getOutputStallDurationlomOqCM;
                    java.math.BigDecimal bigDecimal13 = (java.math.BigDecimal) autopayOverviewToAutopayMapper$toUi$1.getOutputSizeshNQ4ISI;
                    com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.core.CurrencyAmount currencyAmount = (com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.core.CurrencyAmount) autopayOverviewToAutopayMapper$toUi$1.getOutputStallDuration;
                    list2 = (java.util.List) autopayOverviewToAutopayMapper$toUi$1.getOutputMinFrameDuration;
                    paymentConstraints2 = (com.paypal.oslo.feature.revolvingcreditservicing.domain.model.autopay.PaymentConstraints) autopayOverviewToAutopayMapper$toUi$1.getOutputFormats;
                    com.paypal.oslo.feature.revolvingcreditservicing.api.model.CreditProductIdentifier creditProductIdentifier6 = (com.paypal.oslo.feature.revolvingcreditservicing.api.model.CreditProductIdentifier) autopayOverviewToAutopayMapper$toUi$1.getHighResolutionOutputSizeshNQ4ISI;
                    autopayOverview3 = (com.paypal.oslo.feature.revolvingcreditservicing.domain.model.autopay.AutopayOverview) autopayOverviewToAutopayMapper$toUi$1.getHighSpeedVideoFpsRangesFor;
                    kotlin.ResultKt.throwOnFailure(obj);
                    bigDecimal7 = bigDecimal11;
                    str7 = str10;
                    str5 = str11;
                    bigDecimal6 = bigDecimal12;
                    paymentOption2 = paymentOption5;
                    linkedHashMap4 = r13;
                    uiString2 = uiString7;
                    creditProductIdentifier3 = creditProductIdentifier6;
                    bigDecimal3 = bigDecimal13;
                    str6 = str12;
                    str2 = "";
                    maxAllowableRepaymentAmount = currencyAmount;
                    selectAmountUiModel = new com.paypal.oslo.feature.revolvingcreditservicing.ui.common.components.selectamount.uimodel.SelectAmountUiModel(linkedHashMap4, paymentOption2, bigDecimal6, str5, null, null, str7, bigDecimal7, (java.lang.String) obj, null, new com.paypal.oslo.feature.revolvingcreditservicing.ui.common.components.UiString.StringResOnly(com.paypal.oslo.feature.revolvingcreditservicing.R.string.feature_revolvingcredit_servicing_custom_amount_hint, (com.paypal.oslo.feature.revolvingcreditservicing.api.model.CreditProductIdentifier) null, false, 6, (kotlin.jvm.internal.DefaultConstructorMarker) null), null, 2608, null);
                    com.paypal.oslo.feature.revolvingcreditservicing.ui.common.components.UiString.StringResOnly stringResOnly5 = new com.paypal.oslo.feature.revolvingcreditservicing.ui.common.components.UiString.StringResOnly(com.paypal.oslo.feature.revolvingcreditservicing.R.string.feature_revolvingcredit_servicing_autopay_payment_method_label, (com.paypal.oslo.feature.revolvingcreditservicing.api.model.CreditProductIdentifier) null, false, 6, (kotlin.jvm.internal.DefaultConstructorMarker) null);
                    com.paypal.oslo.feature.revolvingcreditservicing.ui.common.components.UiString.StringResOnly stringResOnly6 = new com.paypal.oslo.feature.revolvingcreditservicing.ui.common.components.UiString.StringResOnly(com.paypal.oslo.feature.revolvingcreditservicing.R.string.feature_revolvingcredit_servicing_autopay_payment_method_add, (com.paypal.oslo.feature.revolvingcreditservicing.api.model.CreditProductIdentifier) null, false, 6, (kotlin.jvm.internal.DefaultConstructorMarker) null);
                    fundingInstruments = autopayOverview3.getFundingInstruments();
                    if (fundingInstruments == null) {
                        fundingInstruments = kotlin.collections.CollectionsKt.emptyList();
                    }
                    eligibleFundingInstruments = autopayOverview3.getEligibleFundingInstruments();
                    if (eligibleFundingInstruments == null) {
                        eligibleFundingInstruments = kotlin.collections.CollectionsKt.emptyList();
                    }
                    autopayOverviewToAutopayMapper$toUi$1.getHighSpeedVideoFpsRangesFor = autopayOverview3;
                    autopayOverviewToAutopayMapper$toUi$1.getHighResolutionOutputSizeshNQ4ISI = creditProductIdentifier3;
                    com.paypal.oslo.feature.revolvingcreditservicing.domain.model.autopay.AutopayOverview autopayOverview5 = autopayOverview3;
                    autopayOverviewToAutopayMapper$toUi$1.getOutputFormats = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(paymentConstraints2);
                    autopayOverviewToAutopayMapper$toUi$1.getOutputMinFrameDuration = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(list2);
                    autopayOverviewToAutopayMapper$toUi$1.getOutputStallDuration = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(maxAllowableRepaymentAmount);
                    autopayOverviewToAutopayMapper$toUi$1.getOutputSizeshNQ4ISI = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(bigDecimal3);
                    autopayOverviewToAutopayMapper$toUi$1.getOutputStallDurationlomOqCM = str6;
                    autopayOverviewToAutopayMapper$toUi$1.getOutputSizes = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(map2);
                    autopayOverviewToAutopayMapper$toUi$1.getOutputMinFrameDurationlomOqCM = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(linkedHashMap3);
                    autopayOverviewToAutopayMapper$toUi$1.getValidOutputFormatsForInputhNQ4ISI = uiString2;
                    autopayOverviewToAutopayMapper$toUi$1.getHighSpeedVideoSizes = selectAmountUiModel;
                    autopayOverviewToAutopayMapper$toUi$1.getHighSpeedVideoFpsRanges = stringResOnly5;
                    autopayOverviewToAutopayMapper$toUi$1.Camera2StreamConfigurationMap = stringResOnly6;
                    autopayOverviewToAutopayMapper$toUi$1.getInputFormats = null;
                    autopayOverviewToAutopayMapper$toUi$1.getHighSpeedVideoSizesFor = null;
                    autopayOverviewToAutopayMapper$toUi$1.getInputSizeshNQ4ISI = null;
                    autopayOverviewToAutopayMapper$toUi$1.toString = 3;
                    highSpeedVideoFpsRangesFor2 = autopayOverviewToAutopayMapper.getHighSpeedVideoFpsRangesFor(fundingInstruments, eligibleFundingInstruments, autopayOverviewToAutopayMapper$toUi$1);
                    if (highSpeedVideoFpsRangesFor2 != coroutine_suspended) {
                        uiString3 = stringResOnly5;
                        obj = highSpeedVideoFpsRangesFor2;
                        uiString4 = uiString2;
                        str8 = str6;
                        stringResOnly = stringResOnly6;
                        creditProductIdentifier4 = creditProductIdentifier3;
                        autopayOverview4 = autopayOverview5;
                        com.paypal.oslo.feature.revolvingcreditservicing.ui.common.components.selectamount.uimodel.SelectAmountUiModel selectAmountUiModel22 = selectAmountUiModel;
                        com.paypal.oslo.feature.revolvingcreditservicing.ui.autopay.uimodel.SelectedPaymentMethodUiModel selectedPaymentMethodUiModel2 = (com.paypal.oslo.feature.revolvingcreditservicing.ui.autopay.uimodel.SelectedPaymentMethodUiModel) obj;
                        fundingInstruments2 = autopayOverview4.getFundingInstruments();
                        if (fundingInstruments2 == null) {
                        }
                        com.paypal.oslo.feature.revolvingcreditservicing.ui.autopay.uimodel.PaymentMethodUiModel paymentMethodUiModel2 = new com.paypal.oslo.feature.revolvingcreditservicing.ui.autopay.uimodel.PaymentMethodUiModel(uiString3, stringResOnly, selectedPaymentMethodUiModel2, null, arrayList, 8, null);
                        if (autopayOverview4.getEffectiveDueTime() == null) {
                        }
                        com.paypal.oslo.feature.revolvingcreditservicing.ui.common.components.UiString uiString62 = plainString;
                        autopayTermsUrl = autopayOverview4.getAutopayTermsUrl();
                        if (autopayTermsUrl == null) {
                        }
                        return new com.paypal.oslo.feature.revolvingcreditservicing.ui.autopay.uimodel.AutopayScreenUiModel(uiString4, selectAmountUiModel22, paymentMethodUiModel2, uiString62, autopayTermsUrl, autopayOverview4.getEnrolled(), !autopayOverview4.getEnrolled() ? new com.paypal.oslo.feature.revolvingcreditservicing.ui.common.components.UiString.StringResOnly(com.paypal.oslo.feature.revolvingcreditservicing.R.string.feature_revolvingcredit_servicing_common_cancel_autopay, (com.paypal.oslo.feature.revolvingcreditservicing.api.model.CreditProductIdentifier) null, false, 6, (kotlin.jvm.internal.DefaultConstructorMarker) null) : null, str8);
                    }
                    return coroutine_suspended;
                }
                java.lang.String str13 = (java.lang.String) autopayOverviewToAutopayMapper$toUi$1.getInputFormats;
                java.math.BigDecimal bigDecimal14 = (java.math.BigDecimal) autopayOverviewToAutopayMapper$toUi$1.Camera2StreamConfigurationMap;
                com.paypal.oslo.feature.revolvingcreditservicing.domain.model.autopay.PaymentOption paymentOption6 = (com.paypal.oslo.feature.revolvingcreditservicing.domain.model.autopay.PaymentOption) autopayOverviewToAutopayMapper$toUi$1.getHighSpeedVideoFpsRanges;
                ?? r8 = (java.util.Map) autopayOverviewToAutopayMapper$toUi$1.getHighSpeedVideoSizes;
                uiString = (com.paypal.oslo.feature.revolvingcreditservicing.ui.common.components.UiString) autopayOverviewToAutopayMapper$toUi$1.getValidOutputFormatsForInputhNQ4ISI;
                java.util.LinkedHashMap linkedHashMap11 = (java.util.LinkedHashMap) autopayOverviewToAutopayMapper$toUi$1.getOutputMinFrameDurationlomOqCM;
                map = (java.util.Map) autopayOverviewToAutopayMapper$toUi$1.getOutputSizes;
                str = (java.lang.String) autopayOverviewToAutopayMapper$toUi$1.getOutputStallDurationlomOqCM;
                bigDecimal3 = (java.math.BigDecimal) autopayOverviewToAutopayMapper$toUi$1.getOutputSizeshNQ4ISI;
                com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.core.CurrencyAmount currencyAmount2 = (com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.core.CurrencyAmount) autopayOverviewToAutopayMapper$toUi$1.getOutputStallDuration;
                list = (java.util.List) autopayOverviewToAutopayMapper$toUi$1.getOutputMinFrameDuration;
                com.paypal.oslo.feature.revolvingcreditservicing.domain.model.autopay.PaymentConstraints paymentConstraints4 = (com.paypal.oslo.feature.revolvingcreditservicing.domain.model.autopay.PaymentConstraints) autopayOverviewToAutopayMapper$toUi$1.getOutputFormats;
                com.paypal.oslo.feature.revolvingcreditservicing.api.model.CreditProductIdentifier creditProductIdentifier7 = (com.paypal.oslo.feature.revolvingcreditservicing.api.model.CreditProductIdentifier) autopayOverviewToAutopayMapper$toUi$1.getHighResolutionOutputSizeshNQ4ISI;
                autopayOverview3 = (com.paypal.oslo.feature.revolvingcreditservicing.domain.model.autopay.AutopayOverview) autopayOverviewToAutopayMapper$toUi$1.getHighSpeedVideoFpsRangesFor;
                kotlin.ResultKt.throwOnFailure(obj);
                str2 = "";
                linkedHashMap = linkedHashMap11;
                bigDecimal2 = bigDecimal14;
                paymentOption = paymentOption6;
                maxAllowableRepaymentAmount = currencyAmount2;
                paymentConstraints = paymentConstraints4;
                highSpeedVideoFpsRangesFor = obj;
                creditProductIdentifier2 = creditProductIdentifier7;
                obj2 = coroutine_suspended;
                linkedHashMap2 = r8;
                str4 = str13;
                java.lang.String str14 = (java.lang.String) highSpeedVideoFpsRangesFor;
                if (maxAllowableRepaymentAmount != null || (r22 = maxAllowableRepaymentAmount.toBigDecimal()) == null) {
                    java.math.BigDecimal bigDecimal15 = java.math.BigDecimal.ZERO;
                }
                java.math.BigDecimal bigDecimal16 = bigDecimal15;
                kotlin.jvm.internal.Intrinsics.checkNotNull(bigDecimal16);
                com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.core.CurrencyAmount currencyAmount3 = new com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.core.CurrencyAmount(str, "0");
                autopayOverviewToAutopayMapper$toUi$1.getHighSpeedVideoFpsRangesFor = autopayOverview3;
                autopayOverviewToAutopayMapper$toUi$1.getHighResolutionOutputSizeshNQ4ISI = creditProductIdentifier2;
                autopayOverviewToAutopayMapper$toUi$1.getOutputFormats = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(paymentConstraints);
                autopayOverviewToAutopayMapper$toUi$1.getOutputMinFrameDuration = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(list);
                autopayOverviewToAutopayMapper$toUi$1.getOutputStallDuration = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(maxAllowableRepaymentAmount);
                autopayOverviewToAutopayMapper$toUi$1.getOutputSizeshNQ4ISI = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(bigDecimal3);
                autopayOverviewToAutopayMapper$toUi$1.getOutputStallDurationlomOqCM = str;
                autopayOverviewToAutopayMapper$toUi$1.getOutputSizes = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(map);
                autopayOverviewToAutopayMapper$toUi$1.getOutputMinFrameDurationlomOqCM = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(linkedHashMap);
                autopayOverviewToAutopayMapper$toUi$1.getValidOutputFormatsForInputhNQ4ISI = uiString;
                autopayOverviewToAutopayMapper$toUi$1.getHighSpeedVideoSizes = linkedHashMap2;
                autopayOverviewToAutopayMapper$toUi$1.getHighSpeedVideoFpsRanges = paymentOption;
                autopayOverviewToAutopayMapper$toUi$1.Camera2StreamConfigurationMap = bigDecimal2;
                autopayOverviewToAutopayMapper$toUi$1.getInputFormats = str4;
                autopayOverviewToAutopayMapper$toUi$1.getHighSpeedVideoSizesFor = str14;
                autopayOverviewToAutopayMapper$toUi$1.getInputSizeshNQ4ISI = bigDecimal16;
                autopayOverviewToAutopayMapper$toUi$1.toString = 2;
                autopayOverviewToAutopayMapper = this;
                com.paypal.oslo.feature.revolvingcreditservicing.api.model.CreditProductIdentifier creditProductIdentifier8 = creditProductIdentifier2;
                obj = autopayOverviewToAutopayMapper.getHighSpeedVideoFpsRangesFor(currencyAmount3, autopayOverviewToAutopayMapper$toUi$1);
                java.util.LinkedHashMap linkedHashMap12 = linkedHashMap2;
                coroutine_suspended = obj2;
                if (obj != coroutine_suspended) {
                    paymentConstraints2 = paymentConstraints;
                    str5 = str4;
                    bigDecimal6 = bigDecimal2;
                    str6 = str;
                    str7 = str14;
                    creditProductIdentifier3 = creditProductIdentifier8;
                    linkedHashMap3 = linkedHashMap;
                    bigDecimal7 = bigDecimal16;
                    linkedHashMap4 = linkedHashMap12;
                    list2 = list;
                    paymentOption2 = paymentOption;
                    uiString2 = uiString;
                    map2 = map;
                    selectAmountUiModel = new com.paypal.oslo.feature.revolvingcreditservicing.ui.common.components.selectamount.uimodel.SelectAmountUiModel(linkedHashMap4, paymentOption2, bigDecimal6, str5, null, null, str7, bigDecimal7, (java.lang.String) obj, null, new com.paypal.oslo.feature.revolvingcreditservicing.ui.common.components.UiString.StringResOnly(com.paypal.oslo.feature.revolvingcreditservicing.R.string.feature_revolvingcredit_servicing_custom_amount_hint, (com.paypal.oslo.feature.revolvingcreditservicing.api.model.CreditProductIdentifier) null, false, 6, (kotlin.jvm.internal.DefaultConstructorMarker) null), null, 2608, null);
                    com.paypal.oslo.feature.revolvingcreditservicing.ui.common.components.UiString.StringResOnly stringResOnly52 = new com.paypal.oslo.feature.revolvingcreditservicing.ui.common.components.UiString.StringResOnly(com.paypal.oslo.feature.revolvingcreditservicing.R.string.feature_revolvingcredit_servicing_autopay_payment_method_label, (com.paypal.oslo.feature.revolvingcreditservicing.api.model.CreditProductIdentifier) null, false, 6, (kotlin.jvm.internal.DefaultConstructorMarker) null);
                    com.paypal.oslo.feature.revolvingcreditservicing.ui.common.components.UiString.StringResOnly stringResOnly62 = new com.paypal.oslo.feature.revolvingcreditservicing.ui.common.components.UiString.StringResOnly(com.paypal.oslo.feature.revolvingcreditservicing.R.string.feature_revolvingcredit_servicing_autopay_payment_method_add, (com.paypal.oslo.feature.revolvingcreditservicing.api.model.CreditProductIdentifier) null, false, 6, (kotlin.jvm.internal.DefaultConstructorMarker) null);
                    fundingInstruments = autopayOverview3.getFundingInstruments();
                    if (fundingInstruments == null) {
                    }
                    eligibleFundingInstruments = autopayOverview3.getEligibleFundingInstruments();
                    if (eligibleFundingInstruments == null) {
                    }
                    autopayOverviewToAutopayMapper$toUi$1.getHighSpeedVideoFpsRangesFor = autopayOverview3;
                    autopayOverviewToAutopayMapper$toUi$1.getHighResolutionOutputSizeshNQ4ISI = creditProductIdentifier3;
                    com.paypal.oslo.feature.revolvingcreditservicing.domain.model.autopay.AutopayOverview autopayOverview52 = autopayOverview3;
                    autopayOverviewToAutopayMapper$toUi$1.getOutputFormats = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(paymentConstraints2);
                    autopayOverviewToAutopayMapper$toUi$1.getOutputMinFrameDuration = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(list2);
                    autopayOverviewToAutopayMapper$toUi$1.getOutputStallDuration = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(maxAllowableRepaymentAmount);
                    autopayOverviewToAutopayMapper$toUi$1.getOutputSizeshNQ4ISI = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(bigDecimal3);
                    autopayOverviewToAutopayMapper$toUi$1.getOutputStallDurationlomOqCM = str6;
                    autopayOverviewToAutopayMapper$toUi$1.getOutputSizes = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(map2);
                    autopayOverviewToAutopayMapper$toUi$1.getOutputMinFrameDurationlomOqCM = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(linkedHashMap3);
                    autopayOverviewToAutopayMapper$toUi$1.getValidOutputFormatsForInputhNQ4ISI = uiString2;
                    autopayOverviewToAutopayMapper$toUi$1.getHighSpeedVideoSizes = selectAmountUiModel;
                    autopayOverviewToAutopayMapper$toUi$1.getHighSpeedVideoFpsRanges = stringResOnly52;
                    autopayOverviewToAutopayMapper$toUi$1.Camera2StreamConfigurationMap = stringResOnly62;
                    autopayOverviewToAutopayMapper$toUi$1.getInputFormats = null;
                    autopayOverviewToAutopayMapper$toUi$1.getHighSpeedVideoSizesFor = null;
                    autopayOverviewToAutopayMapper$toUi$1.getInputSizeshNQ4ISI = null;
                    autopayOverviewToAutopayMapper$toUi$1.toString = 3;
                    highSpeedVideoFpsRangesFor2 = autopayOverviewToAutopayMapper.getHighSpeedVideoFpsRangesFor(fundingInstruments, eligibleFundingInstruments, autopayOverviewToAutopayMapper$toUi$1);
                    if (highSpeedVideoFpsRangesFor2 != coroutine_suspended) {
                    }
                }
                return coroutine_suspended;
            }
        }
        autopayOverviewToAutopayMapper$toUi$1 = new com.paypal.oslo.feature.revolvingcreditservicing.ui.autopay.viewmodel.AutopayOverviewToAutopayMapper$toUi$1(autopayOverviewToAutopayMapper, continuation);
        obj = autopayOverviewToAutopayMapper$toUi$1.isOutputSupportedFor;
        coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = autopayOverviewToAutopayMapper$toUi$1.toString;
        if (i != 0) {
        }
        java.lang.String str142 = (java.lang.String) highSpeedVideoFpsRangesFor;
        if (maxAllowableRepaymentAmount != null) {
        }
        java.math.BigDecimal bigDecimal152 = java.math.BigDecimal.ZERO;
        java.math.BigDecimal bigDecimal162 = bigDecimal152;
        kotlin.jvm.internal.Intrinsics.checkNotNull(bigDecimal162);
        com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.core.CurrencyAmount currencyAmount32 = new com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.core.CurrencyAmount(str, "0");
        autopayOverviewToAutopayMapper$toUi$1.getHighSpeedVideoFpsRangesFor = autopayOverview3;
        autopayOverviewToAutopayMapper$toUi$1.getHighResolutionOutputSizeshNQ4ISI = creditProductIdentifier2;
        autopayOverviewToAutopayMapper$toUi$1.getOutputFormats = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(paymentConstraints);
        autopayOverviewToAutopayMapper$toUi$1.getOutputMinFrameDuration = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(list);
        autopayOverviewToAutopayMapper$toUi$1.getOutputStallDuration = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(maxAllowableRepaymentAmount);
        autopayOverviewToAutopayMapper$toUi$1.getOutputSizeshNQ4ISI = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(bigDecimal3);
        autopayOverviewToAutopayMapper$toUi$1.getOutputStallDurationlomOqCM = str;
        autopayOverviewToAutopayMapper$toUi$1.getOutputSizes = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(map);
        autopayOverviewToAutopayMapper$toUi$1.getOutputMinFrameDurationlomOqCM = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(linkedHashMap);
        autopayOverviewToAutopayMapper$toUi$1.getValidOutputFormatsForInputhNQ4ISI = uiString;
        autopayOverviewToAutopayMapper$toUi$1.getHighSpeedVideoSizes = linkedHashMap2;
        autopayOverviewToAutopayMapper$toUi$1.getHighSpeedVideoFpsRanges = paymentOption;
        autopayOverviewToAutopayMapper$toUi$1.Camera2StreamConfigurationMap = bigDecimal2;
        autopayOverviewToAutopayMapper$toUi$1.getInputFormats = str4;
        autopayOverviewToAutopayMapper$toUi$1.getHighSpeedVideoSizesFor = str142;
        autopayOverviewToAutopayMapper$toUi$1.getInputSizeshNQ4ISI = bigDecimal162;
        autopayOverviewToAutopayMapper$toUi$1.toString = 2;
        autopayOverviewToAutopayMapper = this;
        com.paypal.oslo.feature.revolvingcreditservicing.api.model.CreditProductIdentifier creditProductIdentifier82 = creditProductIdentifier2;
        obj = autopayOverviewToAutopayMapper.getHighSpeedVideoFpsRangesFor(currencyAmount32, autopayOverviewToAutopayMapper$toUi$1);
        java.util.LinkedHashMap linkedHashMap122 = linkedHashMap2;
        coroutine_suspended = obj2;
        if (obj != coroutine_suspended) {
        }
        return coroutine_suspended;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:12:0x0058 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:14:0x005b A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0037  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0025  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object getHighSpeedVideoFpsRangesFor(com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.core.CurrencyAmount currencyAmount, kotlin.coroutines.Continuation<? super java.lang.String> continuation) {
        com.paypal.oslo.feature.revolvingcreditservicing.ui.autopay.viewmodel.AutopayOverviewToAutopayMapper$formatCurrency$1 autopayOverviewToAutopayMapper$formatCurrency$1;
        int i;
        if (continuation instanceof com.paypal.oslo.feature.revolvingcreditservicing.ui.autopay.viewmodel.AutopayOverviewToAutopayMapper$formatCurrency$1) {
            autopayOverviewToAutopayMapper$formatCurrency$1 = (com.paypal.oslo.feature.revolvingcreditservicing.ui.autopay.viewmodel.AutopayOverviewToAutopayMapper$formatCurrency$1) continuation;
            if ((autopayOverviewToAutopayMapper$formatCurrency$1.getHighSpeedVideoSizes & Integer.MIN_VALUE) != 0) {
                autopayOverviewToAutopayMapper$formatCurrency$1.getHighSpeedVideoSizes -= 2147483648;
                com.paypal.oslo.feature.revolvingcreditservicing.ui.autopay.viewmodel.AutopayOverviewToAutopayMapper$formatCurrency$1 autopayOverviewToAutopayMapper$formatCurrency$12 = autopayOverviewToAutopayMapper$formatCurrency$1;
                java.lang.Object obj = autopayOverviewToAutopayMapper$formatCurrency$12.getHighSpeedVideoFpsRangesFor;
                java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = autopayOverviewToAutopayMapper$formatCurrency$12.getHighSpeedVideoSizes;
                if (i != 0) {
                    kotlin.ResultKt.throwOnFailure(obj);
                    com.paypal.oslo.feature.revolvingcreditservicing.domain.formatter.currency.CurrencyFormatterFacade currencyFormatterFacade = this.Camera2StreamConfigurationMap;
                    com.paypal.oslo.feature.revolvingcreditservicing.domain.formatter.currency.CurrencyFormat.Symbol symbol = com.paypal.oslo.feature.revolvingcreditservicing.domain.formatter.currency.CurrencyFormat.Symbol.INSTANCE;
                    autopayOverviewToAutopayMapper$formatCurrency$12.Camera2StreamConfigurationMap = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(currencyAmount);
                    autopayOverviewToAutopayMapper$formatCurrency$12.getHighSpeedVideoSizes = 1;
                    obj = com.paypal.oslo.feature.revolvingcreditservicing.domain.formatter.currency.CurrencyFormatterFacade.format$default(currencyFormatterFacade, currencyAmount, symbol, 0, autopayOverviewToAutopayMapper$formatCurrency$12, 4, null);
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
        autopayOverviewToAutopayMapper$formatCurrency$1 = new com.paypal.oslo.feature.revolvingcreditservicing.ui.autopay.viewmodel.AutopayOverviewToAutopayMapper$formatCurrency$1(this, continuation);
        com.paypal.oslo.feature.revolvingcreditservicing.ui.autopay.viewmodel.AutopayOverviewToAutopayMapper$formatCurrency$1 autopayOverviewToAutopayMapper$formatCurrency$122 = autopayOverviewToAutopayMapper$formatCurrency$1;
        java.lang.Object obj2 = autopayOverviewToAutopayMapper$formatCurrency$122.getHighSpeedVideoFpsRangesFor;
        java.lang.Object coroutine_suspended2 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = autopayOverviewToAutopayMapper$formatCurrency$122.getHighSpeedVideoSizes;
        if (i != 0) {
        }
        java.lang.String str2 = (java.lang.String) obj2;
        if (str2 != null) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final java.lang.Object getHighSpeedVideoFpsRangesFor(java.util.List<? extends com.paypal.oslo.feature.revolvingcreditservicing.domain.model.autopay.EligiblePaymentInstrument> list, java.util.List<? extends com.paypal.oslo.feature.revolvingcreditservicing.domain.model.autopay.EligiblePaymentInstrument> list2, kotlin.coroutines.Continuation<? super com.paypal.oslo.feature.revolvingcreditservicing.ui.autopay.uimodel.SelectedPaymentMethodUiModel> continuation) {
        java.util.List<? extends com.paypal.oslo.feature.revolvingcreditservicing.domain.model.autopay.EligiblePaymentInstrument> list3 = list;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        for (java.lang.Object obj : list3) {
            if (obj instanceof com.paypal.oslo.feature.revolvingcreditservicing.domain.model.autopay.EligiblePaymentInstrument.Balance) {
                arrayList.add(obj);
            }
        }
        com.paypal.oslo.feature.revolvingcreditservicing.domain.model.autopay.EligiblePaymentInstrument.Balance balance = (com.paypal.oslo.feature.revolvingcreditservicing.domain.model.autopay.EligiblePaymentInstrument.Balance) kotlin.collections.CollectionsKt.firstOrNull((java.util.List) arrayList);
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        for (java.lang.Object obj2 : list3) {
            if (obj2 instanceof com.paypal.oslo.feature.revolvingcreditservicing.domain.model.autopay.EligiblePaymentInstrument.Bank) {
                arrayList2.add(obj2);
            }
        }
        com.paypal.oslo.feature.revolvingcreditservicing.domain.model.autopay.EligiblePaymentInstrument.Bank bank = (com.paypal.oslo.feature.revolvingcreditservicing.domain.model.autopay.EligiblePaymentInstrument.Bank) kotlin.collections.CollectionsKt.firstOrNull((java.util.List) arrayList2);
        java.util.ArrayList arrayList3 = new java.util.ArrayList();
        for (java.lang.Object obj3 : list3) {
            if (obj3 instanceof com.paypal.oslo.feature.revolvingcreditservicing.domain.model.autopay.EligiblePaymentInstrument.Card) {
                arrayList3.add(obj3);
            }
        }
        com.paypal.oslo.feature.revolvingcreditservicing.domain.model.autopay.EligiblePaymentInstrument.Card card = (com.paypal.oslo.feature.revolvingcreditservicing.domain.model.autopay.EligiblePaymentInstrument.Card) kotlin.collections.CollectionsKt.firstOrNull((java.util.List) arrayList3);
        if (balance != null && bank != null) {
            return getHighSpeedVideoFpsRanges(balance, bank, list2, continuation);
        }
        if (bank != null) {
            return getHighSpeedVideoFpsRangesFor(bank);
        }
        if (card != null) {
            return getHighSpeedVideoFpsRangesFor(card);
        }
        if (balance == null) {
            return null;
        }
        java.lang.Object highSpeedVideoFpsRangesFor = getHighSpeedVideoFpsRangesFor(balance, list2, continuation);
        return highSpeedVideoFpsRangesFor == kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED() ? highSpeedVideoFpsRangesFor : (com.paypal.oslo.feature.revolvingcreditservicing.ui.autopay.uimodel.SelectedPaymentMethodUiModel) highSpeedVideoFpsRangesFor;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:17:0x008b  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x00c2  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x00c4  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x004a  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x002a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object getHighSpeedVideoFpsRanges(com.paypal.oslo.feature.revolvingcreditservicing.domain.model.autopay.EligiblePaymentInstrument.Balance balance, com.paypal.oslo.feature.revolvingcreditservicing.domain.model.autopay.EligiblePaymentInstrument.Bank bank, java.util.List<? extends com.paypal.oslo.feature.revolvingcreditservicing.domain.model.autopay.EligiblePaymentInstrument> list, kotlin.coroutines.Continuation<? super com.paypal.oslo.feature.revolvingcreditservicing.ui.autopay.uimodel.SelectedPaymentMethodUiModel> continuation) {
        com.paypal.oslo.feature.revolvingcreditservicing.ui.autopay.viewmodel.AutopayOverviewToAutopayMapper$createBalanceWithBackupUiModel$1 autopayOverviewToAutopayMapper$createBalanceWithBackupUiModel$1;
        int i;
        com.paypal.oslo.feature.revolvingcreditservicing.domain.model.autopay.EligiblePaymentInstrument.Bank bank2;
        java.lang.Object Camera2StreamConfigurationMap;
        java.lang.String bankName;
        java.lang.String str;
        java.lang.String lastDigits;
        com.paypal.oslo.feature.revolvingcreditservicing.domain.model.autopay.EligiblePaymentInstrument.Balance balance2 = balance;
        if (continuation instanceof com.paypal.oslo.feature.revolvingcreditservicing.ui.autopay.viewmodel.AutopayOverviewToAutopayMapper$createBalanceWithBackupUiModel$1) {
            autopayOverviewToAutopayMapper$createBalanceWithBackupUiModel$1 = (com.paypal.oslo.feature.revolvingcreditservicing.ui.autopay.viewmodel.AutopayOverviewToAutopayMapper$createBalanceWithBackupUiModel$1) continuation;
            if ((autopayOverviewToAutopayMapper$createBalanceWithBackupUiModel$1.getHighResolutionOutputSizeshNQ4ISI & Integer.MIN_VALUE) != 0) {
                autopayOverviewToAutopayMapper$createBalanceWithBackupUiModel$1.getHighResolutionOutputSizeshNQ4ISI -= 2147483648;
                java.lang.Object obj = autopayOverviewToAutopayMapper$createBalanceWithBackupUiModel$1.getHighSpeedVideoFpsRangesFor;
                java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = autopayOverviewToAutopayMapper$createBalanceWithBackupUiModel$1.getHighResolutionOutputSizeshNQ4ISI;
                if (i != 0) {
                    kotlin.ResultKt.throwOnFailure(obj);
                    autopayOverviewToAutopayMapper$createBalanceWithBackupUiModel$1.getHighSpeedVideoSizes = balance2;
                    bank2 = bank;
                    autopayOverviewToAutopayMapper$createBalanceWithBackupUiModel$1.Camera2StreamConfigurationMap = bank2;
                    autopayOverviewToAutopayMapper$createBalanceWithBackupUiModel$1.getHighSpeedVideoFpsRanges = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(list);
                    autopayOverviewToAutopayMapper$createBalanceWithBackupUiModel$1.getHighResolutionOutputSizeshNQ4ISI = 1;
                    Camera2StreamConfigurationMap = Camera2StreamConfigurationMap(balance2, list, autopayOverviewToAutopayMapper$createBalanceWithBackupUiModel$1);
                    if (Camera2StreamConfigurationMap == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else {
                    if (i != 1) {
                        throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    com.paypal.oslo.feature.revolvingcreditservicing.domain.model.autopay.EligiblePaymentInstrument.Bank bank3 = (com.paypal.oslo.feature.revolvingcreditservicing.domain.model.autopay.EligiblePaymentInstrument.Bank) autopayOverviewToAutopayMapper$createBalanceWithBackupUiModel$1.Camera2StreamConfigurationMap;
                    com.paypal.oslo.feature.revolvingcreditservicing.domain.model.autopay.EligiblePaymentInstrument.Balance balance3 = (com.paypal.oslo.feature.revolvingcreditservicing.domain.model.autopay.EligiblePaymentInstrument.Balance) autopayOverviewToAutopayMapper$createBalanceWithBackupUiModel$1.getHighSpeedVideoSizes;
                    kotlin.ResultKt.throwOnFailure(obj);
                    bank2 = bank3;
                    balance2 = balance3;
                    Camera2StreamConfigurationMap = obj;
                }
                java.lang.String str2 = (java.lang.String) Camera2StreamConfigurationMap;
                bankName = bank2.getBankName();
                str = null;
                if (bankName != null && (lastDigits = bank2.getLastDigits()) != null) {
                    java.lang.StringBuilder sb = new java.lang.StringBuilder();
                    sb.append(bankName);
                    sb.append(" ••");
                    sb.append(lastDigits);
                    str = sb.toString();
                }
                if (str == null) {
                    str = "";
                }
                com.paypal.oslo.feature.revolvingcreditservicing.ui.common.components.UiString.StringResOnly stringResOnly = new com.paypal.oslo.feature.revolvingcreditservicing.ui.common.components.UiString.StringResOnly(com.paypal.oslo.feature.revolvingcreditservicing.R.string.feature_revolvingcredit_servicing_paypal_balance, (com.paypal.oslo.feature.revolvingcreditservicing.api.model.CreditProductIdentifier) null, false, 6, (kotlin.jvm.internal.DefaultConstructorMarker) null);
                com.paypal.oslo.feature.revolvingcreditservicing.ui.common.components.UiString.StringResWithParameter stringResWithParameter = new com.paypal.oslo.feature.revolvingcreditservicing.ui.common.components.UiString.StringResWithParameter(com.paypal.oslo.feature.revolvingcreditservicing.R.string.feature_revolvingcredit_servicing_balance_available, new java.lang.Object[]{str2}, null, false, 12, null);
                com.paypal.oslo.feature.revolvingcreditservicing.ui.common.components.UiString.StringResWithParameter stringResWithParameter2 = new com.paypal.oslo.feature.revolvingcreditservicing.ui.common.components.UiString.StringResWithParameter(com.paypal.oslo.feature.revolvingcreditservicing.R.string.feature_revolvingcredit_servicing_autopay_backup_payment_method, new java.lang.Object[]{str}, null, false, 12, null);
                java.lang.String artUrl = balance2.getArtUrl();
                return new com.paypal.oslo.feature.revolvingcreditservicing.ui.autopay.uimodel.SelectedPaymentMethodUiModel(stringResOnly, stringResWithParameter, artUrl != null ? "" : artUrl, new com.paypal.oslo.feature.revolvingcreditservicing.ui.common.components.UiString.StringResOnly(com.paypal.oslo.feature.revolvingcreditservicing.R.string.feature_revolvingcredit_servicing_common_change, (com.paypal.oslo.feature.revolvingcreditservicing.api.model.CreditProductIdentifier) null, false, 6, (kotlin.jvm.internal.DefaultConstructorMarker) null), stringResWithParameter2);
            }
        }
        autopayOverviewToAutopayMapper$createBalanceWithBackupUiModel$1 = new com.paypal.oslo.feature.revolvingcreditservicing.ui.autopay.viewmodel.AutopayOverviewToAutopayMapper$createBalanceWithBackupUiModel$1(this, continuation);
        java.lang.Object obj2 = autopayOverviewToAutopayMapper$createBalanceWithBackupUiModel$1.getHighSpeedVideoFpsRangesFor;
        java.lang.Object coroutine_suspended2 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = autopayOverviewToAutopayMapper$createBalanceWithBackupUiModel$1.getHighResolutionOutputSizeshNQ4ISI;
        if (i != 0) {
        }
        java.lang.String str22 = (java.lang.String) Camera2StreamConfigurationMap;
        bankName = bank2.getBankName();
        str = null;
        if (bankName != null) {
            java.lang.StringBuilder sb2 = new java.lang.StringBuilder();
            sb2.append(bankName);
            sb2.append(" ••");
            sb2.append(lastDigits);
            str = sb2.toString();
        }
        if (str == null) {
        }
        com.paypal.oslo.feature.revolvingcreditservicing.ui.common.components.UiString.StringResOnly stringResOnly2 = new com.paypal.oslo.feature.revolvingcreditservicing.ui.common.components.UiString.StringResOnly(com.paypal.oslo.feature.revolvingcreditservicing.R.string.feature_revolvingcredit_servicing_paypal_balance, (com.paypal.oslo.feature.revolvingcreditservicing.api.model.CreditProductIdentifier) null, false, 6, (kotlin.jvm.internal.DefaultConstructorMarker) null);
        com.paypal.oslo.feature.revolvingcreditservicing.ui.common.components.UiString.StringResWithParameter stringResWithParameter3 = new com.paypal.oslo.feature.revolvingcreditservicing.ui.common.components.UiString.StringResWithParameter(com.paypal.oslo.feature.revolvingcreditservicing.R.string.feature_revolvingcredit_servicing_balance_available, new java.lang.Object[]{str22}, null, false, 12, null);
        com.paypal.oslo.feature.revolvingcreditservicing.ui.common.components.UiString.StringResWithParameter stringResWithParameter22 = new com.paypal.oslo.feature.revolvingcreditservicing.ui.common.components.UiString.StringResWithParameter(com.paypal.oslo.feature.revolvingcreditservicing.R.string.feature_revolvingcredit_servicing_autopay_backup_payment_method, new java.lang.Object[]{str}, null, false, 12, null);
        java.lang.String artUrl2 = balance2.getArtUrl();
        return new com.paypal.oslo.feature.revolvingcreditservicing.ui.autopay.uimodel.SelectedPaymentMethodUiModel(stringResOnly2, stringResWithParameter3, artUrl2 != null ? "" : artUrl2, new com.paypal.oslo.feature.revolvingcreditservicing.ui.common.components.UiString.StringResOnly(com.paypal.oslo.feature.revolvingcreditservicing.R.string.feature_revolvingcredit_servicing_common_change, (com.paypal.oslo.feature.revolvingcreditservicing.api.model.CreditProductIdentifier) null, false, 6, (kotlin.jvm.internal.DefaultConstructorMarker) null), stringResWithParameter22);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:12:0x0081  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0040  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x002a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object getHighSpeedVideoFpsRangesFor(com.paypal.oslo.feature.revolvingcreditservicing.domain.model.autopay.EligiblePaymentInstrument.Balance balance, java.util.List<? extends com.paypal.oslo.feature.revolvingcreditservicing.domain.model.autopay.EligiblePaymentInstrument> list, kotlin.coroutines.Continuation<? super com.paypal.oslo.feature.revolvingcreditservicing.ui.autopay.uimodel.SelectedPaymentMethodUiModel> continuation) {
        com.paypal.oslo.feature.revolvingcreditservicing.ui.autopay.viewmodel.AutopayOverviewToAutopayMapper$createBalanceOnlyUiModel$1 autopayOverviewToAutopayMapper$createBalanceOnlyUiModel$1;
        int i;
        java.lang.String artUrl;
        com.paypal.oslo.feature.revolvingcreditservicing.domain.model.autopay.EligiblePaymentInstrument.Balance balance2 = balance;
        if (continuation instanceof com.paypal.oslo.feature.revolvingcreditservicing.ui.autopay.viewmodel.AutopayOverviewToAutopayMapper$createBalanceOnlyUiModel$1) {
            autopayOverviewToAutopayMapper$createBalanceOnlyUiModel$1 = (com.paypal.oslo.feature.revolvingcreditservicing.ui.autopay.viewmodel.AutopayOverviewToAutopayMapper$createBalanceOnlyUiModel$1) continuation;
            if ((autopayOverviewToAutopayMapper$createBalanceOnlyUiModel$1.getHighSpeedVideoFpsRanges & Integer.MIN_VALUE) != 0) {
                autopayOverviewToAutopayMapper$createBalanceOnlyUiModel$1.getHighSpeedVideoFpsRanges -= 2147483648;
                java.lang.Object obj = autopayOverviewToAutopayMapper$createBalanceOnlyUiModel$1.getHighSpeedVideoSizes;
                java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = autopayOverviewToAutopayMapper$createBalanceOnlyUiModel$1.getHighSpeedVideoFpsRanges;
                if (i != 0) {
                    kotlin.ResultKt.throwOnFailure(obj);
                    autopayOverviewToAutopayMapper$createBalanceOnlyUiModel$1.Camera2StreamConfigurationMap = balance2;
                    autopayOverviewToAutopayMapper$createBalanceOnlyUiModel$1.getHighResolutionOutputSizeshNQ4ISI = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(list);
                    autopayOverviewToAutopayMapper$createBalanceOnlyUiModel$1.getHighSpeedVideoFpsRanges = 1;
                    obj = Camera2StreamConfigurationMap(balance2, list, autopayOverviewToAutopayMapper$createBalanceOnlyUiModel$1);
                    if (obj == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else {
                    if (i != 1) {
                        throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    balance2 = (com.paypal.oslo.feature.revolvingcreditservicing.domain.model.autopay.EligiblePaymentInstrument.Balance) autopayOverviewToAutopayMapper$createBalanceOnlyUiModel$1.Camera2StreamConfigurationMap;
                    kotlin.ResultKt.throwOnFailure(obj);
                }
                com.paypal.oslo.feature.revolvingcreditservicing.ui.common.components.UiString.StringResOnly stringResOnly = new com.paypal.oslo.feature.revolvingcreditservicing.ui.common.components.UiString.StringResOnly(com.paypal.oslo.feature.revolvingcreditservicing.R.string.feature_revolvingcredit_servicing_paypal_balance, (com.paypal.oslo.feature.revolvingcreditservicing.api.model.CreditProductIdentifier) null, false, 6, (kotlin.jvm.internal.DefaultConstructorMarker) null);
                com.paypal.oslo.feature.revolvingcreditservicing.ui.common.components.UiString.StringResWithParameter stringResWithParameter = new com.paypal.oslo.feature.revolvingcreditservicing.ui.common.components.UiString.StringResWithParameter(com.paypal.oslo.feature.revolvingcreditservicing.R.string.feature_revolvingcredit_servicing_balance_available, new java.lang.Object[]{(java.lang.String) obj}, null, false, 12, null);
                artUrl = balance2.getArtUrl();
                if (artUrl == null) {
                    artUrl = "";
                }
                return new com.paypal.oslo.feature.revolvingcreditservicing.ui.autopay.uimodel.SelectedPaymentMethodUiModel(stringResOnly, stringResWithParameter, artUrl, new com.paypal.oslo.feature.revolvingcreditservicing.ui.common.components.UiString.StringResOnly(com.paypal.oslo.feature.revolvingcreditservicing.R.string.feature_revolvingcredit_servicing_common_change, (com.paypal.oslo.feature.revolvingcreditservicing.api.model.CreditProductIdentifier) null, false, 6, (kotlin.jvm.internal.DefaultConstructorMarker) null), null, 16, null);
            }
        }
        autopayOverviewToAutopayMapper$createBalanceOnlyUiModel$1 = new com.paypal.oslo.feature.revolvingcreditservicing.ui.autopay.viewmodel.AutopayOverviewToAutopayMapper$createBalanceOnlyUiModel$1(this, continuation);
        java.lang.Object obj2 = autopayOverviewToAutopayMapper$createBalanceOnlyUiModel$1.getHighSpeedVideoSizes;
        java.lang.Object coroutine_suspended2 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = autopayOverviewToAutopayMapper$createBalanceOnlyUiModel$1.getHighSpeedVideoFpsRanges;
        if (i != 0) {
        }
        com.paypal.oslo.feature.revolvingcreditservicing.ui.common.components.UiString.StringResOnly stringResOnly2 = new com.paypal.oslo.feature.revolvingcreditservicing.ui.common.components.UiString.StringResOnly(com.paypal.oslo.feature.revolvingcreditservicing.R.string.feature_revolvingcredit_servicing_paypal_balance, (com.paypal.oslo.feature.revolvingcreditservicing.api.model.CreditProductIdentifier) null, false, 6, (kotlin.jvm.internal.DefaultConstructorMarker) null);
        com.paypal.oslo.feature.revolvingcreditservicing.ui.common.components.UiString.StringResWithParameter stringResWithParameter2 = new com.paypal.oslo.feature.revolvingcreditservicing.ui.common.components.UiString.StringResWithParameter(com.paypal.oslo.feature.revolvingcreditservicing.R.string.feature_revolvingcredit_servicing_balance_available, new java.lang.Object[]{(java.lang.String) obj2}, null, false, 12, null);
        artUrl = balance2.getArtUrl();
        if (artUrl == null) {
        }
        return new com.paypal.oslo.feature.revolvingcreditservicing.ui.autopay.uimodel.SelectedPaymentMethodUiModel(stringResOnly2, stringResWithParameter2, artUrl, new com.paypal.oslo.feature.revolvingcreditservicing.ui.common.components.UiString.StringResOnly(com.paypal.oslo.feature.revolvingcreditservicing.R.string.feature_revolvingcredit_servicing_common_change, (com.paypal.oslo.feature.revolvingcreditservicing.api.model.CreditProductIdentifier) null, false, 6, (kotlin.jvm.internal.DefaultConstructorMarker) null), null, 16, null);
    }

    private static com.paypal.oslo.feature.revolvingcreditservicing.ui.autopay.uimodel.SelectedPaymentMethodUiModel getHighSpeedVideoFpsRangesFor(com.paypal.oslo.feature.revolvingcreditservicing.domain.model.autopay.EligiblePaymentInstrument.Bank p0) {
        java.lang.String bankName = p0.getBankName();
        if (bankName == null) {
            bankName = "";
        }
        com.paypal.oslo.feature.revolvingcreditservicing.ui.common.components.UiString.PlainString plainString = new com.paypal.oslo.feature.revolvingcreditservicing.ui.common.components.UiString.PlainString(bankName);
        int i = com.paypal.oslo.feature.revolvingcreditservicing.R.string.feature_revolvingcredit_servicing_bank_account_format;
        java.lang.String lastDigits = p0.getLastDigits();
        if (lastDigits == null) {
            lastDigits = "";
        }
        com.paypal.oslo.feature.revolvingcreditservicing.ui.common.components.UiString.StringResWithParameter stringResWithParameter = new com.paypal.oslo.feature.revolvingcreditservicing.ui.common.components.UiString.StringResWithParameter(i, new java.lang.Object[]{lastDigits}, null, false, 12, null);
        java.lang.String artUrl = p0.getArtUrl();
        return new com.paypal.oslo.feature.revolvingcreditservicing.ui.autopay.uimodel.SelectedPaymentMethodUiModel(plainString, stringResWithParameter, artUrl == null ? "" : artUrl, new com.paypal.oslo.feature.revolvingcreditservicing.ui.common.components.UiString.StringResOnly(com.paypal.oslo.feature.revolvingcreditservicing.R.string.feature_revolvingcredit_servicing_common_change, (com.paypal.oslo.feature.revolvingcreditservicing.api.model.CreditProductIdentifier) null, false, 6, (kotlin.jvm.internal.DefaultConstructorMarker) null), null, 16, null);
    }

    private static com.paypal.oslo.feature.revolvingcreditservicing.ui.autopay.uimodel.SelectedPaymentMethodUiModel getHighSpeedVideoFpsRangesFor(com.paypal.oslo.feature.revolvingcreditservicing.domain.model.autopay.EligiblePaymentInstrument.Card p0) {
        java.lang.String cardType = p0.getCardType();
        if (cardType == null) {
            cardType = "";
        }
        com.paypal.oslo.feature.revolvingcreditservicing.ui.common.components.UiString.PlainString plainString = new com.paypal.oslo.feature.revolvingcreditservicing.ui.common.components.UiString.PlainString(cardType);
        java.lang.String lastDigits = p0.getLastDigits();
        java.lang.String concat = lastDigits != null ? com.paypal.oslo.feature.bnplacquisition.ui.personalinfo.PersonalInfoConstants.SSN_MASK_CHAR.concat(java.lang.String.valueOf(lastDigits)) : null;
        if (concat == null) {
            concat = "";
        }
        com.paypal.oslo.feature.revolvingcreditservicing.ui.common.components.UiString.PlainString plainString2 = new com.paypal.oslo.feature.revolvingcreditservicing.ui.common.components.UiString.PlainString(concat);
        java.lang.String artUrl = p0.getArtUrl();
        return new com.paypal.oslo.feature.revolvingcreditservicing.ui.autopay.uimodel.SelectedPaymentMethodUiModel(plainString, plainString2, artUrl == null ? "" : artUrl, new com.paypal.oslo.feature.revolvingcreditservicing.ui.common.components.UiString.StringResOnly(com.paypal.oslo.feature.revolvingcreditservicing.R.string.feature_revolvingcredit_servicing_common_change, (com.paypal.oslo.feature.revolvingcreditservicing.api.model.CreditProductIdentifier) null, false, 6, (kotlin.jvm.internal.DefaultConstructorMarker) null), null, 16, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x0097, code lost:
    
        if (r3 == null) goto L31;
     */
    /* JADX WARN: Removed duplicated region for block: B:12:0x00d4 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:14:0x00d7 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0046  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0025  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object Camera2StreamConfigurationMap(com.paypal.oslo.feature.revolvingcreditservicing.domain.model.autopay.EligiblePaymentInstrument.Balance balance, java.util.List<? extends com.paypal.oslo.feature.revolvingcreditservicing.domain.model.autopay.EligiblePaymentInstrument> list, kotlin.coroutines.Continuation<? super java.lang.String> continuation) {
        com.paypal.oslo.feature.revolvingcreditservicing.ui.autopay.viewmodel.AutopayOverviewToAutopayMapper$getFormattedBalanceAmount$1 autopayOverviewToAutopayMapper$getFormattedBalanceAmount$1;
        int i;
        java.lang.String str;
        com.paypal.oslo.feature.revolvingcreditservicing.domain.model.autopay.EligiblePaymentInstrument.Balance balance2;
        java.lang.Object obj;
        if (continuation instanceof com.paypal.oslo.feature.revolvingcreditservicing.ui.autopay.viewmodel.AutopayOverviewToAutopayMapper$getFormattedBalanceAmount$1) {
            autopayOverviewToAutopayMapper$getFormattedBalanceAmount$1 = (com.paypal.oslo.feature.revolvingcreditservicing.ui.autopay.viewmodel.AutopayOverviewToAutopayMapper$getFormattedBalanceAmount$1) continuation;
            if ((autopayOverviewToAutopayMapper$getFormattedBalanceAmount$1.getOutputFormats & Integer.MIN_VALUE) != 0) {
                autopayOverviewToAutopayMapper$getFormattedBalanceAmount$1.getOutputFormats -= 2147483648;
                com.paypal.oslo.feature.revolvingcreditservicing.ui.autopay.viewmodel.AutopayOverviewToAutopayMapper$getFormattedBalanceAmount$1 autopayOverviewToAutopayMapper$getFormattedBalanceAmount$12 = autopayOverviewToAutopayMapper$getFormattedBalanceAmount$1;
                java.lang.Object obj2 = autopayOverviewToAutopayMapper$getFormattedBalanceAmount$12.getOutputMinFrameDuration;
                java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = autopayOverviewToAutopayMapper$getFormattedBalanceAmount$12.getOutputFormats;
                if (i != 0) {
                    kotlin.ResultKt.throwOnFailure(obj2);
                    str = null;
                    if (balance.getAmount() == null) {
                        java.util.ArrayList arrayList = new java.util.ArrayList();
                        for (java.lang.Object obj3 : list) {
                            if (obj3 instanceof com.paypal.oslo.feature.revolvingcreditservicing.domain.model.autopay.EligiblePaymentInstrument.Balance) {
                                arrayList.add(obj3);
                            }
                        }
                        java.util.Iterator it = arrayList.iterator();
                        while (true) {
                            if (!it.hasNext()) {
                                obj = null;
                                break;
                            }
                            obj = it.next();
                            if (kotlin.jvm.internal.Intrinsics.areEqual(((com.paypal.oslo.feature.revolvingcreditservicing.domain.model.autopay.EligiblePaymentInstrument.Balance) obj).getId(), balance.getId())) {
                                break;
                            }
                        }
                        balance2 = (com.paypal.oslo.feature.revolvingcreditservicing.domain.model.autopay.EligiblePaymentInstrument.Balance) obj;
                    }
                    balance2 = balance;
                    com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.core.CurrencyAmount amount = balance2.getAmount();
                    if (amount != null) {
                        com.paypal.oslo.feature.revolvingcreditservicing.domain.formatter.currency.CurrencyFormatterFacade currencyFormatterFacade = this.Camera2StreamConfigurationMap;
                        com.paypal.oslo.feature.revolvingcreditservicing.domain.formatter.currency.CurrencyFormat.Symbol symbol = com.paypal.oslo.feature.revolvingcreditservicing.domain.formatter.currency.CurrencyFormat.Symbol.INSTANCE;
                        autopayOverviewToAutopayMapper$getFormattedBalanceAmount$12.getHighSpeedVideoFpsRanges = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(balance);
                        autopayOverviewToAutopayMapper$getFormattedBalanceAmount$12.Camera2StreamConfigurationMap = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(list);
                        autopayOverviewToAutopayMapper$getFormattedBalanceAmount$12.getHighSpeedVideoFpsRangesFor = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(balance2);
                        autopayOverviewToAutopayMapper$getFormattedBalanceAmount$12.getHighSpeedVideoSizes = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(amount);
                        autopayOverviewToAutopayMapper$getFormattedBalanceAmount$12.getHighResolutionOutputSizeshNQ4ISI = 0;
                        autopayOverviewToAutopayMapper$getFormattedBalanceAmount$12.getOutputFormats = 1;
                        obj2 = com.paypal.oslo.feature.revolvingcreditservicing.domain.formatter.currency.CurrencyFormatterFacade.format$default(currencyFormatterFacade, amount, symbol, 0, autopayOverviewToAutopayMapper$getFormattedBalanceAmount$12, 4, null);
                        if (obj2 == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                    }
                    return str == null ? "" : str;
                }
                if (i != 1) {
                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                int i2 = autopayOverviewToAutopayMapper$getFormattedBalanceAmount$12.getHighResolutionOutputSizeshNQ4ISI;
                kotlin.ResultKt.throwOnFailure(obj2);
                str = (java.lang.String) obj2;
                if (str == null) {
                }
            }
        }
        autopayOverviewToAutopayMapper$getFormattedBalanceAmount$1 = new com.paypal.oslo.feature.revolvingcreditservicing.ui.autopay.viewmodel.AutopayOverviewToAutopayMapper$getFormattedBalanceAmount$1(this, continuation);
        com.paypal.oslo.feature.revolvingcreditservicing.ui.autopay.viewmodel.AutopayOverviewToAutopayMapper$getFormattedBalanceAmount$1 autopayOverviewToAutopayMapper$getFormattedBalanceAmount$122 = autopayOverviewToAutopayMapper$getFormattedBalanceAmount$1;
        java.lang.Object obj22 = autopayOverviewToAutopayMapper$getFormattedBalanceAmount$122.getOutputMinFrameDuration;
        java.lang.Object coroutine_suspended2 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = autopayOverviewToAutopayMapper$getFormattedBalanceAmount$122.getOutputFormats;
        if (i != 0) {
        }
        str = (java.lang.String) obj22;
        if (str == null) {
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
                iArr[com.paypal.oslo.feature.revolvingcreditservicing.domain.model.autopay.PaymentOption.CUSTOM_AMOUNT.ordinal()] = 3;
            } catch (java.lang.NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }
}
