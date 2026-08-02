package com.paypal.oslo.feature.revolvingcreditservicing.ui.activity.mapper;

@kotlin.Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0000\u0018\u00002\u00020\u0001B\u0019\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J6\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u000f0\b2\u000e\u0010\n\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\b2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\u000e\u001a\u00020\rH\u0086@¢\u0006\u0004\b\u0010\u0010\u0011J(\u0010\u0013\u001a\u00020\u000f2\u0006\u0010\u0012\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\u000e\u001a\u00020\rH\u0086@¢\u0006\u0004\b\u0013\u0010\u0014J\u0018\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0015\u001a\u00020\tH\u0082@¢\u0006\u0004\b\u0017\u0010\u0018J!\u0010\u001c\u001a\u00020\u001b2\b\u0010\u0015\u001a\u0004\u0018\u00010\u00192\u0006\u0010\u001a\u001a\u00020\u000bH\u0002¢\u0006\u0004\b\u001c\u0010\u001dR\u0014\u0010\u001c\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001e\u0010\u001fR\u0014\u0010\u001e\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b \u0010!"}, d2 = {"Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/activity/mapper/ActivityHubTransactionItemUiModelMapper;", "", "Lcom/paypal/oslo/feature/revolvingcreditservicing/domain/formatter/currency/CurrencyFormatterFacade;", "currencyFormatter", "Lcom/paypal/oslo/feature/revolvingcreditservicing/domain/formatter/date/DateFormatterFacade;", "dateFormatter", "<init>", "(Lcom/paypal/oslo/feature/revolvingcreditservicing/domain/formatter/currency/CurrencyFormatterFacade;Lcom/paypal/oslo/feature/revolvingcreditservicing/domain/formatter/date/DateFormatterFacade;)V", "", "Lcom/paypal/oslo/feature/revolvingcreditservicing/domain/model/transaction/Transaction;", "transactions", "", "shouldHandleAmountColor", "Ljava/util/Locale;", "formattingLocale", "Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/activity/uimodel/ActivityUiModel$TransactionItemUiModel;", "mapList", "(Ljava/util/List;ZLjava/util/Locale;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "transaction", "map", "(Lcom/paypal/oslo/feature/revolvingcreditservicing/domain/model/transaction/Transaction;ZLjava/util/Locale;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "p0", "Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/common/components/UiString;", "getHighSpeedVideoFpsRangesFor", "(Lcom/paypal/oslo/feature/revolvingcreditservicing/domain/model/transaction/Transaction;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "", "p1", "Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/activity/components/ActivityTransactionAmountColor;", "getHighSpeedVideoFpsRanges", "(Ljava/lang/String;Z)Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/activity/components/ActivityTransactionAmountColor;", "getHighResolutionOutputSizeshNQ4ISI", "Lcom/paypal/oslo/feature/revolvingcreditservicing/domain/formatter/currency/CurrencyFormatterFacade;", "Camera2StreamConfigurationMap", "Lcom/paypal/oslo/feature/revolvingcreditservicing/domain/formatter/date/DateFormatterFacade;"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class ActivityHubTransactionItemUiModelMapper {
    public static final int $stable = 0;

    /* renamed from: Camera2StreamConfigurationMap, reason: from kotlin metadata */
    private final com.paypal.oslo.feature.revolvingcreditservicing.domain.formatter.date.DateFormatterFacade getHighResolutionOutputSizeshNQ4ISI;

    /* renamed from: getHighResolutionOutputSizeshNQ4ISI, reason: from kotlin metadata */
    private final com.paypal.oslo.feature.revolvingcreditservicing.domain.formatter.currency.CurrencyFormatterFacade getHighSpeedVideoFpsRanges;

    @javax.inject.Inject
    public ActivityHubTransactionItemUiModelMapper(com.paypal.oslo.feature.revolvingcreditservicing.domain.formatter.currency.CurrencyFormatterFacade currencyFormatterFacade, com.paypal.oslo.feature.revolvingcreditservicing.domain.formatter.date.DateFormatterFacade dateFormatterFacade) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(currencyFormatterFacade, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(dateFormatterFacade, "");
        this.getHighSpeedVideoFpsRanges = currencyFormatterFacade;
        this.getHighResolutionOutputSizeshNQ4ISI = dateFormatterFacade;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:13:0x009f  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x00f2  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x006d  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0029  */
    /* JADX WARN: Type inference failed for: r11v6, types: [java.util.Collection] */
    /* JADX WARN: Type inference failed for: r17v0, types: [com.paypal.oslo.feature.revolvingcreditservicing.ui.activity.mapper.ActivityHubTransactionItemUiModelMapper] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:17:0x00de -> B:10:0x00e6). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object mapList(java.util.List<? extends com.paypal.oslo.feature.revolvingcreditservicing.domain.model.transaction.Transaction> list, boolean z, java.util.Locale locale, kotlin.coroutines.Continuation<? super java.util.List<com.paypal.oslo.feature.revolvingcreditservicing.ui.activity.uimodel.ActivityUiModel.TransactionItemUiModel>> continuation) {
        com.paypal.oslo.feature.revolvingcreditservicing.ui.activity.mapper.ActivityHubTransactionItemUiModelMapper$mapList$1 activityHubTransactionItemUiModelMapper$mapList$1;
        int i;
        java.lang.Object obj;
        java.lang.Object obj2;
        java.util.ArrayList arrayList;
        int i2;
        int i3;
        java.util.Iterator it;
        java.util.List<? extends com.paypal.oslo.feature.revolvingcreditservicing.domain.model.transaction.Transaction> list2;
        java.util.Locale locale2;
        com.paypal.oslo.feature.revolvingcreditservicing.ui.activity.mapper.ActivityHubTransactionItemUiModelMapper$mapList$1 activityHubTransactionItemUiModelMapper$mapList$12;
        boolean z2;
        if (continuation instanceof com.paypal.oslo.feature.revolvingcreditservicing.ui.activity.mapper.ActivityHubTransactionItemUiModelMapper$mapList$1) {
            activityHubTransactionItemUiModelMapper$mapList$1 = (com.paypal.oslo.feature.revolvingcreditservicing.ui.activity.mapper.ActivityHubTransactionItemUiModelMapper$mapList$1) continuation;
            if ((activityHubTransactionItemUiModelMapper$mapList$1.getOutputSizeshNQ4ISI & Integer.MIN_VALUE) != 0) {
                activityHubTransactionItemUiModelMapper$mapList$1.getOutputSizeshNQ4ISI -= 2147483648;
                java.lang.Object obj3 = activityHubTransactionItemUiModelMapper$mapList$1.getOutputStallDuration;
                java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = activityHubTransactionItemUiModelMapper$mapList$1.getOutputSizeshNQ4ISI;
                if (i != 0) {
                    kotlin.ResultKt.throwOnFailure(obj3);
                    java.util.List<? extends com.paypal.oslo.feature.revolvingcreditservicing.domain.model.transaction.Transaction> emptyList = list == null ? kotlin.collections.CollectionsKt.emptyList() : list;
                    obj = emptyList;
                    obj2 = obj;
                    arrayList = new java.util.ArrayList(kotlin.collections.CollectionsKt.collectionSizeOrDefault(emptyList, 10));
                    i2 = 0;
                    i3 = 0;
                    it = emptyList.iterator();
                    list2 = list;
                    locale2 = locale;
                    activityHubTransactionItemUiModelMapper$mapList$12 = activityHubTransactionItemUiModelMapper$mapList$1;
                    z2 = z;
                    if (it.hasNext()) {
                    }
                } else {
                    if (i != 1) {
                        throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    int i4 = activityHubTransactionItemUiModelMapper$mapList$1.getHighSpeedVideoFpsRangesFor;
                    int i5 = activityHubTransactionItemUiModelMapper$mapList$1.Camera2StreamConfigurationMap;
                    int i6 = activityHubTransactionItemUiModelMapper$mapList$1.getHighSpeedVideoSizes;
                    boolean z3 = activityHubTransactionItemUiModelMapper$mapList$1.getOutputSizes;
                    java.util.Collection collection = (java.util.Collection) activityHubTransactionItemUiModelMapper$mapList$1.getOutputMinFrameDurationlomOqCM;
                    java.lang.Object obj4 = activityHubTransactionItemUiModelMapper$mapList$1.getOutputFormats;
                    java.util.Iterator it2 = (java.util.Iterator) activityHubTransactionItemUiModelMapper$mapList$1.getInputFormats;
                    ?? r11 = (java.util.Collection) activityHubTransactionItemUiModelMapper$mapList$1.getInputSizeshNQ4ISI;
                    java.lang.Object obj5 = (java.lang.Iterable) activityHubTransactionItemUiModelMapper$mapList$1.getHighSpeedVideoSizesFor;
                    java.lang.Object obj6 = (java.lang.Iterable) activityHubTransactionItemUiModelMapper$mapList$1.getOutputMinFrameDuration;
                    java.util.Locale locale3 = (java.util.Locale) activityHubTransactionItemUiModelMapper$mapList$1.getHighSpeedVideoFpsRanges;
                    java.util.List<? extends com.paypal.oslo.feature.revolvingcreditservicing.domain.model.transaction.Transaction> list3 = (java.util.List) activityHubTransactionItemUiModelMapper$mapList$1.getHighResolutionOutputSizeshNQ4ISI;
                    kotlin.ResultKt.throwOnFailure(obj3);
                    activityHubTransactionItemUiModelMapper$mapList$12 = activityHubTransactionItemUiModelMapper$mapList$1;
                    z2 = z3;
                    i2 = i5;
                    locale2 = locale3;
                    java.lang.Object obj7 = obj6;
                    java.lang.Object obj8 = obj5;
                    java.util.Iterator it3 = it2;
                    int i7 = i6;
                    java.util.ArrayList arrayList2 = r11;
                    collection.add((com.paypal.oslo.feature.revolvingcreditservicing.ui.activity.uimodel.ActivityUiModel.TransactionItemUiModel) obj3);
                    i3 = i7;
                    arrayList = arrayList2;
                    it = it3;
                    obj = obj8;
                    obj2 = obj7;
                    list2 = list3;
                    if (it.hasNext()) {
                        java.lang.Object next = it.next();
                        com.paypal.oslo.feature.revolvingcreditservicing.domain.model.transaction.Transaction transaction = (com.paypal.oslo.feature.revolvingcreditservicing.domain.model.transaction.Transaction) next;
                        activityHubTransactionItemUiModelMapper$mapList$12.getHighResolutionOutputSizeshNQ4ISI = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(list2);
                        activityHubTransactionItemUiModelMapper$mapList$12.getHighSpeedVideoFpsRanges = locale2;
                        activityHubTransactionItemUiModelMapper$mapList$12.getOutputMinFrameDuration = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(obj2);
                        activityHubTransactionItemUiModelMapper$mapList$12.getHighSpeedVideoSizesFor = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(obj);
                        activityHubTransactionItemUiModelMapper$mapList$12.getInputSizeshNQ4ISI = arrayList;
                        activityHubTransactionItemUiModelMapper$mapList$12.getInputFormats = it;
                        activityHubTransactionItemUiModelMapper$mapList$12.getOutputFormats = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(next);
                        activityHubTransactionItemUiModelMapper$mapList$12.getOutputStallDurationlomOqCM = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(transaction);
                        activityHubTransactionItemUiModelMapper$mapList$12.getOutputMinFrameDurationlomOqCM = arrayList;
                        activityHubTransactionItemUiModelMapper$mapList$12.getOutputSizes = z2;
                        activityHubTransactionItemUiModelMapper$mapList$12.getHighSpeedVideoSizes = i3;
                        activityHubTransactionItemUiModelMapper$mapList$12.Camera2StreamConfigurationMap = i2;
                        activityHubTransactionItemUiModelMapper$mapList$12.getHighSpeedVideoFpsRangesFor = 0;
                        activityHubTransactionItemUiModelMapper$mapList$12.getOutputSizeshNQ4ISI = 1;
                        java.lang.Object map = map(transaction, z2, locale2, activityHubTransactionItemUiModelMapper$mapList$12);
                        if (map == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                        list3 = list2;
                        obj3 = map;
                        obj7 = obj2;
                        obj8 = obj;
                        it3 = it;
                        java.util.ArrayList arrayList3 = arrayList;
                        i7 = i3;
                        collection = arrayList3;
                        arrayList2 = arrayList3;
                        collection.add((com.paypal.oslo.feature.revolvingcreditservicing.ui.activity.uimodel.ActivityUiModel.TransactionItemUiModel) obj3);
                        i3 = i7;
                        arrayList = arrayList2;
                        it = it3;
                        obj = obj8;
                        obj2 = obj7;
                        list2 = list3;
                        if (it.hasNext()) {
                            return arrayList;
                        }
                    }
                }
            }
        }
        activityHubTransactionItemUiModelMapper$mapList$1 = new com.paypal.oslo.feature.revolvingcreditservicing.ui.activity.mapper.ActivityHubTransactionItemUiModelMapper$mapList$1(this, continuation);
        java.lang.Object obj32 = activityHubTransactionItemUiModelMapper$mapList$1.getOutputStallDuration;
        java.lang.Object coroutine_suspended2 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = activityHubTransactionItemUiModelMapper$mapList$1.getOutputSizeshNQ4ISI;
        if (i != 0) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x011b  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0120  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x005a  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x002b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object map(com.paypal.oslo.feature.revolvingcreditservicing.domain.model.transaction.Transaction transaction, boolean z, java.util.Locale locale, kotlin.coroutines.Continuation<? super com.paypal.oslo.feature.revolvingcreditservicing.ui.activity.uimodel.ActivityUiModel.TransactionItemUiModel> continuation) {
        com.paypal.oslo.feature.revolvingcreditservicing.ui.activity.mapper.ActivityHubTransactionItemUiModelMapper$map$1 activityHubTransactionItemUiModelMapper$map$1;
        int i;
        com.paypal.oslo.feature.revolvingcreditservicing.ui.common.components.UiString.PlainString plainString;
        java.lang.Integer valueOf;
        com.paypal.oslo.feature.revolvingcreditservicing.ui.common.components.UiString.StringResWithParameter stringResWithParameter;
        com.paypal.oslo.feature.revolvingcreditservicing.domain.model.transaction.Transaction transaction2;
        com.paypal.oslo.feature.revolvingcreditservicing.ui.common.components.UiString uiString;
        com.paypal.oslo.feature.revolvingcreditservicing.ui.common.components.UiString uiString2;
        java.lang.String str;
        java.lang.String str2;
        boolean z2;
        java.lang.String transactionCashbackPercentage;
        java.lang.String percentage;
        if (continuation instanceof com.paypal.oslo.feature.revolvingcreditservicing.ui.activity.mapper.ActivityHubTransactionItemUiModelMapper$map$1) {
            activityHubTransactionItemUiModelMapper$map$1 = (com.paypal.oslo.feature.revolvingcreditservicing.ui.activity.mapper.ActivityHubTransactionItemUiModelMapper$map$1) continuation;
            if ((activityHubTransactionItemUiModelMapper$map$1.getOutputFormats & Integer.MIN_VALUE) != 0) {
                activityHubTransactionItemUiModelMapper$map$1.getOutputFormats -= 2147483648;
                java.lang.Object obj = activityHubTransactionItemUiModelMapper$map$1.getOutputMinFrameDuration;
                java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = activityHubTransactionItemUiModelMapper$map$1.getOutputFormats;
                plainString = null;
                if (i != 0) {
                    kotlin.ResultKt.throwOnFailure(obj);
                    java.lang.String id = transaction.getId();
                    com.paypal.oslo.feature.revolvingcreditservicing.ui.common.components.UiString resolveTitle = com.paypal.oslo.feature.revolvingcreditservicing.ui.activity.mapper.TransactionTypeToTitleUiStringKt.resolveTitle(transaction);
                    java.lang.String format = this.getHighResolutionOutputSizeshNQ4ISI.format(com.paypal.oslo.feature.revolvingcreditservicing.domain.model.transaction.TransactionKt.getDisplayTimestamp(transaction), com.paypal.oslo.feature.revolvingcreditservicing.domain.formatter.date.DateFormat.DateMonthDayShort.INSTANCE, locale);
                    if (format == null) {
                        format = "";
                    }
                    int i2 = com.paypal.oslo.feature.revolvingcreditservicing.ui.activity.mapper.ActivityHubTransactionItemUiModelMapper.WhenMappings.$EnumSwitchMapping$0[transaction.getTransactionType().ordinal()];
                    if (i2 == 1) {
                        valueOf = java.lang.Integer.valueOf(com.paypal.oslo.feature.revolvingcreditservicing.R.string.feature_revolvingcredit_servicing_common_purchase);
                    } else if (i2 == 2) {
                        valueOf = java.lang.Integer.valueOf(com.paypal.oslo.feature.revolvingcreditservicing.R.string.feature_revolvingcredit_servicing_common_refund);
                    } else if (i2 == 3) {
                        valueOf = java.lang.Integer.valueOf(com.paypal.oslo.feature.revolvingcreditservicing.R.string.feature_revolvingcredit_servicing_activity_type_scheduled);
                    } else if (i2 == 4) {
                        valueOf = java.lang.Integer.valueOf(com.paypal.oslo.feature.revolvingcreditservicing.R.string.feature_revolvingcredit_servicing_recent_activities_cash_advance);
                    } else {
                        valueOf = i2 != 5 ? null : java.lang.Integer.valueOf(com.paypal.oslo.feature.revolvingcreditservicing.R.string.feature_revolvingcredit_servicing_recent_activities_fee);
                    }
                    if (valueOf == null) {
                        stringResWithParameter = com.paypal.oslo.feature.revolvingcreditservicing.ui.common.components.UiStringKt.toUiString(format);
                    } else {
                        stringResWithParameter = new com.paypal.oslo.feature.revolvingcreditservicing.ui.common.components.UiString.StringResWithParameter(com.paypal.oslo.feature.revolvingcreditservicing.R.string.feature_revolvingcredit_servicing_activity_screen_transaction_description, new java.lang.Object[]{com.paypal.oslo.feature.revolvingcreditservicing.ui.common.components.UiStringKt.toUiString(format), com.paypal.oslo.feature.revolvingcreditservicing.ui.common.components.UiStringKt.toUiString(valueOf.intValue())}, null, false, 12, null);
                    }
                    com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.core.CreditImage transactionImage = transaction.getTransactionImage();
                    java.lang.String url = transactionImage != null ? transactionImage.getUrl() : null;
                    activityHubTransactionItemUiModelMapper$map$1.getHighResolutionOutputSizeshNQ4ISI = transaction;
                    activityHubTransactionItemUiModelMapper$map$1.getHighSpeedVideoFpsRanges = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(locale);
                    activityHubTransactionItemUiModelMapper$map$1.getHighSpeedVideoFpsRangesFor = id;
                    activityHubTransactionItemUiModelMapper$map$1.getHighSpeedVideoSizes = resolveTitle;
                    activityHubTransactionItemUiModelMapper$map$1.Camera2StreamConfigurationMap = stringResWithParameter;
                    activityHubTransactionItemUiModelMapper$map$1.getInputSizeshNQ4ISI = url;
                    activityHubTransactionItemUiModelMapper$map$1.getInputFormats = z;
                    activityHubTransactionItemUiModelMapper$map$1.getOutputFormats = 1;
                    java.lang.Object highSpeedVideoFpsRangesFor = getHighSpeedVideoFpsRangesFor(transaction, activityHubTransactionItemUiModelMapper$map$1);
                    if (highSpeedVideoFpsRangesFor == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    transaction2 = transaction;
                    uiString = resolveTitle;
                    obj = highSpeedVideoFpsRangesFor;
                    uiString2 = stringResWithParameter;
                    str = id;
                    str2 = url;
                    z2 = z;
                } else {
                    if (i != 1) {
                        throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    z2 = activityHubTransactionItemUiModelMapper$map$1.getInputFormats;
                    java.lang.String str3 = (java.lang.String) activityHubTransactionItemUiModelMapper$map$1.getInputSizeshNQ4ISI;
                    com.paypal.oslo.feature.revolvingcreditservicing.ui.common.components.UiString uiString3 = (com.paypal.oslo.feature.revolvingcreditservicing.ui.common.components.UiString) activityHubTransactionItemUiModelMapper$map$1.Camera2StreamConfigurationMap;
                    com.paypal.oslo.feature.revolvingcreditservicing.ui.common.components.UiString uiString4 = (com.paypal.oslo.feature.revolvingcreditservicing.ui.common.components.UiString) activityHubTransactionItemUiModelMapper$map$1.getHighSpeedVideoSizes;
                    java.lang.String str4 = (java.lang.String) activityHubTransactionItemUiModelMapper$map$1.getHighSpeedVideoFpsRangesFor;
                    com.paypal.oslo.feature.revolvingcreditservicing.domain.model.transaction.Transaction transaction3 = (com.paypal.oslo.feature.revolvingcreditservicing.domain.model.transaction.Transaction) activityHubTransactionItemUiModelMapper$map$1.getHighResolutionOutputSizeshNQ4ISI;
                    kotlin.ResultKt.throwOnFailure(obj);
                    transaction2 = transaction3;
                    str2 = str3;
                    uiString2 = uiString3;
                    uiString = uiString4;
                    str = str4;
                }
                com.paypal.oslo.feature.revolvingcreditservicing.ui.common.components.UiString uiString5 = (com.paypal.oslo.feature.revolvingcreditservicing.ui.common.components.UiString) obj;
                com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.core.CurrencyAmount amount = transaction2.getAmount();
                com.paypal.oslo.feature.revolvingcreditservicing.ui.activity.components.ActivityTransactionAmountColor highSpeedVideoFpsRanges = getHighSpeedVideoFpsRanges(amount == null ? amount.getValue() : null, z2);
                transactionCashbackPercentage = transaction2.getTransactionCashbackPercentage();
                if (transactionCashbackPercentage != null && (percentage = com.paypal.oslo.feature.revolvingcreditservicing.utils.NumberUtilsKt.toPercentage(transactionCashbackPercentage)) != null) {
                    plainString = com.paypal.oslo.feature.revolvingcreditservicing.ui.common.components.UiStringKt.toUiString(percentage);
                }
                return new com.paypal.oslo.feature.revolvingcreditservicing.ui.activity.uimodel.ActivityUiModel.TransactionItemUiModel(str, uiString, uiString2, str2, uiString5, highSpeedVideoFpsRanges, plainString, kotlin.coroutines.jvm.internal.Boxing.boxBoolean(transaction2.getIsCancellable()), transaction2);
            }
        }
        activityHubTransactionItemUiModelMapper$map$1 = new com.paypal.oslo.feature.revolvingcreditservicing.ui.activity.mapper.ActivityHubTransactionItemUiModelMapper$map$1(this, continuation);
        java.lang.Object obj2 = activityHubTransactionItemUiModelMapper$map$1.getOutputMinFrameDuration;
        java.lang.Object coroutine_suspended2 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = activityHubTransactionItemUiModelMapper$map$1.getOutputFormats;
        plainString = null;
        if (i != 0) {
        }
        com.paypal.oslo.feature.revolvingcreditservicing.ui.common.components.UiString uiString52 = (com.paypal.oslo.feature.revolvingcreditservicing.ui.common.components.UiString) obj2;
        com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.core.CurrencyAmount amount2 = transaction2.getAmount();
        com.paypal.oslo.feature.revolvingcreditservicing.ui.activity.components.ActivityTransactionAmountColor highSpeedVideoFpsRanges2 = getHighSpeedVideoFpsRanges(amount2 == null ? amount2.getValue() : null, z2);
        transactionCashbackPercentage = transaction2.getTransactionCashbackPercentage();
        if (transactionCashbackPercentage != null) {
            plainString = com.paypal.oslo.feature.revolvingcreditservicing.ui.common.components.UiStringKt.toUiString(percentage);
        }
        return new com.paypal.oslo.feature.revolvingcreditservicing.ui.activity.uimodel.ActivityUiModel.TransactionItemUiModel(str, uiString, uiString2, str2, uiString52, highSpeedVideoFpsRanges2, plainString, kotlin.coroutines.jvm.internal.Boxing.boxBoolean(transaction2.getIsCancellable()), transaction2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:12:0x005b  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0037  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0025  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object getHighSpeedVideoFpsRangesFor(com.paypal.oslo.feature.revolvingcreditservicing.domain.model.transaction.Transaction transaction, kotlin.coroutines.Continuation<? super com.paypal.oslo.feature.revolvingcreditservicing.ui.common.components.UiString> continuation) {
        com.paypal.oslo.feature.revolvingcreditservicing.ui.activity.mapper.ActivityHubTransactionItemUiModelMapper$getAmount$1 activityHubTransactionItemUiModelMapper$getAmount$1;
        int i;
        java.lang.String str;
        if (continuation instanceof com.paypal.oslo.feature.revolvingcreditservicing.ui.activity.mapper.ActivityHubTransactionItemUiModelMapper$getAmount$1) {
            activityHubTransactionItemUiModelMapper$getAmount$1 = (com.paypal.oslo.feature.revolvingcreditservicing.ui.activity.mapper.ActivityHubTransactionItemUiModelMapper$getAmount$1) continuation;
            if ((activityHubTransactionItemUiModelMapper$getAmount$1.Camera2StreamConfigurationMap & Integer.MIN_VALUE) != 0) {
                activityHubTransactionItemUiModelMapper$getAmount$1.Camera2StreamConfigurationMap -= 2147483648;
                com.paypal.oslo.feature.revolvingcreditservicing.ui.activity.mapper.ActivityHubTransactionItemUiModelMapper$getAmount$1 activityHubTransactionItemUiModelMapper$getAmount$12 = activityHubTransactionItemUiModelMapper$getAmount$1;
                java.lang.Object obj = activityHubTransactionItemUiModelMapper$getAmount$12.getHighSpeedVideoFpsRangesFor;
                java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = activityHubTransactionItemUiModelMapper$getAmount$12.Camera2StreamConfigurationMap;
                if (i != 0) {
                    kotlin.ResultKt.throwOnFailure(obj);
                    com.paypal.oslo.feature.revolvingcreditservicing.domain.formatter.currency.CurrencyFormatterFacade currencyFormatterFacade = this.getHighSpeedVideoFpsRanges;
                    com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.core.CurrencyAmount amount = transaction.getAmount();
                    com.paypal.oslo.feature.revolvingcreditservicing.domain.formatter.currency.CurrencyFormat.Symbol symbol = com.paypal.oslo.feature.revolvingcreditservicing.domain.formatter.currency.CurrencyFormat.Symbol.INSTANCE;
                    activityHubTransactionItemUiModelMapper$getAmount$12.getHighSpeedVideoSizes = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(transaction);
                    activityHubTransactionItemUiModelMapper$getAmount$12.Camera2StreamConfigurationMap = 1;
                    obj = com.paypal.oslo.feature.revolvingcreditservicing.domain.formatter.currency.CurrencyFormatterFacade.format$default(currencyFormatterFacade, amount, symbol, 0, activityHubTransactionItemUiModelMapper$getAmount$12, 4, null);
                    if (obj == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else {
                    if (i != 1) {
                        throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    kotlin.ResultKt.throwOnFailure(obj);
                }
                str = (java.lang.String) obj;
                if (str == null) {
                    str = "";
                }
                return com.paypal.oslo.feature.revolvingcreditservicing.ui.common.components.UiStringKt.toUiString(str);
            }
        }
        activityHubTransactionItemUiModelMapper$getAmount$1 = new com.paypal.oslo.feature.revolvingcreditservicing.ui.activity.mapper.ActivityHubTransactionItemUiModelMapper$getAmount$1(this, continuation);
        com.paypal.oslo.feature.revolvingcreditservicing.ui.activity.mapper.ActivityHubTransactionItemUiModelMapper$getAmount$1 activityHubTransactionItemUiModelMapper$getAmount$122 = activityHubTransactionItemUiModelMapper$getAmount$1;
        java.lang.Object obj2 = activityHubTransactionItemUiModelMapper$getAmount$122.getHighSpeedVideoFpsRangesFor;
        java.lang.Object coroutine_suspended2 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = activityHubTransactionItemUiModelMapper$getAmount$122.Camera2StreamConfigurationMap;
        if (i != 0) {
        }
        str = (java.lang.String) obj2;
        if (str == null) {
        }
        return com.paypal.oslo.feature.revolvingcreditservicing.ui.common.components.UiStringKt.toUiString(str);
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0045  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final com.paypal.oslo.feature.revolvingcreditservicing.ui.activity.components.ActivityTransactionAmountColor getHighSpeedVideoFpsRanges(java.lang.String p0, boolean p1) {
        java.lang.Object m23436constructorimpl;
        com.paypal.oslo.feature.revolvingcreditservicing.ui.activity.components.ActivityTransactionAmountColor.Default r2;
        java.lang.String str;
        try {
            kotlin.Result.Companion companion = kotlin.Result.INSTANCE;
            com.paypal.oslo.feature.revolvingcreditservicing.ui.activity.mapper.ActivityHubTransactionItemUiModelMapper activityHubTransactionItemUiModelMapper = this;
        } catch (java.lang.Throwable th) {
            kotlin.Result.Companion companion2 = kotlin.Result.INSTANCE;
            m23436constructorimpl = kotlin.Result.m23436constructorimpl(kotlin.ResultKt.createFailure(th));
        }
        if (p1 && (str = p0) != null && !kotlin.text.StringsKt.isBlank(str)) {
            if (com.paypal.oslo.feature.revolvingcreditservicing.utils.CurrencyUtilsKt.parseCurrencyString(p0).compareTo(java.math.BigDecimal.ZERO) >= 0) {
                r2 = com.paypal.oslo.feature.revolvingcreditservicing.ui.activity.components.ActivityTransactionAmountColor.Default.INSTANCE;
            } else {
                r2 = com.paypal.oslo.feature.revolvingcreditservicing.ui.activity.components.ActivityTransactionAmountColor.Green.INSTANCE;
            }
            m23436constructorimpl = kotlin.Result.m23436constructorimpl(r2);
            com.paypal.oslo.feature.revolvingcreditservicing.ui.activity.components.ActivityTransactionAmountColor.Default r3 = com.paypal.oslo.feature.revolvingcreditservicing.ui.activity.components.ActivityTransactionAmountColor.Default.INSTANCE;
            if (kotlin.Result.m23441isFailureimpl(m23436constructorimpl)) {
                m23436constructorimpl = r3;
            }
            return (com.paypal.oslo.feature.revolvingcreditservicing.ui.activity.components.ActivityTransactionAmountColor) m23436constructorimpl;
        }
        r2 = com.paypal.oslo.feature.revolvingcreditservicing.ui.activity.components.ActivityTransactionAmountColor.Default.INSTANCE;
        m23436constructorimpl = kotlin.Result.m23436constructorimpl(r2);
        com.paypal.oslo.feature.revolvingcreditservicing.ui.activity.components.ActivityTransactionAmountColor.Default r32 = com.paypal.oslo.feature.revolvingcreditservicing.ui.activity.components.ActivityTransactionAmountColor.Default.INSTANCE;
        if (kotlin.Result.m23441isFailureimpl(m23436constructorimpl)) {
        }
        return (com.paypal.oslo.feature.revolvingcreditservicing.ui.activity.components.ActivityTransactionAmountColor) m23436constructorimpl;
    }

    @kotlin.Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[com.paypal.oslo.feature.revolvingcreditservicing.domain.model.transaction.TransactionType.values().length];
            try {
                iArr[com.paypal.oslo.feature.revolvingcreditservicing.domain.model.transaction.TransactionType.PURCHASE.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused) {
            }
            try {
                iArr[com.paypal.oslo.feature.revolvingcreditservicing.domain.model.transaction.TransactionType.REFUND.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused2) {
            }
            try {
                iArr[com.paypal.oslo.feature.revolvingcreditservicing.domain.model.transaction.TransactionType.SCHEDULED_PAYMENT.ordinal()] = 3;
            } catch (java.lang.NoSuchFieldError unused3) {
            }
            try {
                iArr[com.paypal.oslo.feature.revolvingcreditservicing.domain.model.transaction.TransactionType.CASH_ADVANCE.ordinal()] = 4;
            } catch (java.lang.NoSuchFieldError unused4) {
            }
            try {
                iArr[com.paypal.oslo.feature.revolvingcreditservicing.domain.model.transaction.TransactionType.FEE.ordinal()] = 5;
            } catch (java.lang.NoSuchFieldError unused5) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }
}
