package com.paypal.oslo.feature.revolvingcreditservicing.ui.common.components.mapper;

@kotlin.Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0000\u0018\u00002\u00020\u0001B\u0019\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J*\u0010\u000e\u001a\u0004\u0018\u00010\r2\u000e\u0010\n\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\b2\u0006\u0010\f\u001a\u00020\u000bH\u0086@¢\u0006\u0004\b\u000e\u0010\u000fR\u0014\u0010\u0010\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0014\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013"}, d2 = {"Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/common/components/mapper/ScheduledPaymentInfoMapper;", "", "Lcom/paypal/oslo/feature/revolvingcreditservicing/domain/formatter/currency/CurrencyFormatterFacade;", "currencyFormatterFacade", "Lcom/paypal/oslo/feature/revolvingcreditservicing/domain/formatter/date/DateFormatterFacade;", "dateFormatterFacade", "<init>", "(Lcom/paypal/oslo/feature/revolvingcreditservicing/domain/formatter/currency/CurrencyFormatterFacade;Lcom/paypal/oslo/feature/revolvingcreditservicing/domain/formatter/date/DateFormatterFacade;)V", "", "Lcom/paypal/oslo/feature/revolvingcreditservicing/domain/model/repayment/RepaymentActivity;", "repayments", "Lcom/paypal/oslo/feature/revolvingcreditservicing/api/model/CreditProductIdentifier;", "creditProductIdentifier", "Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/common/components/UiString;", "map", "(Ljava/util/List;Lcom/paypal/oslo/feature/revolvingcreditservicing/api/model/CreditProductIdentifier;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getHighSpeedVideoFpsRanges", "Lcom/paypal/oslo/feature/revolvingcreditservicing/domain/formatter/currency/CurrencyFormatterFacade;", "getHighResolutionOutputSizeshNQ4ISI", "Lcom/paypal/oslo/feature/revolvingcreditservicing/domain/formatter/date/DateFormatterFacade;", "getHighSpeedVideoFpsRangesFor"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class ScheduledPaymentInfoMapper {
    public static final int $stable = 0;

    /* renamed from: getHighResolutionOutputSizeshNQ4ISI, reason: from kotlin metadata */
    private final com.paypal.oslo.feature.revolvingcreditservicing.domain.formatter.date.DateFormatterFacade getHighSpeedVideoFpsRangesFor;
    private final com.paypal.oslo.feature.revolvingcreditservicing.domain.formatter.currency.CurrencyFormatterFacade getHighSpeedVideoFpsRanges;

    @javax.inject.Inject
    public ScheduledPaymentInfoMapper(com.paypal.oslo.feature.revolvingcreditservicing.domain.formatter.currency.CurrencyFormatterFacade currencyFormatterFacade, com.paypal.oslo.feature.revolvingcreditservicing.domain.formatter.date.DateFormatterFacade dateFormatterFacade) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(currencyFormatterFacade, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(dateFormatterFacade, "");
        this.getHighSpeedVideoFpsRanges = currencyFormatterFacade;
        this.getHighSpeedVideoFpsRangesFor = dateFormatterFacade;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x00ea  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x00f5  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0107  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x004f  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0029  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object map(java.util.List<com.paypal.oslo.feature.revolvingcreditservicing.domain.model.repayment.RepaymentActivity> list, com.paypal.oslo.feature.revolvingcreditservicing.api.model.CreditProductIdentifier creditProductIdentifier, kotlin.coroutines.Continuation<? super com.paypal.oslo.feature.revolvingcreditservicing.ui.common.components.UiString> continuation) {
        com.paypal.oslo.feature.revolvingcreditservicing.ui.common.components.mapper.ScheduledPaymentInfoMapper$map$1 scheduledPaymentInfoMapper$map$1;
        int i;
        java.util.ArrayList arrayList;
        com.paypal.oslo.feature.revolvingcreditservicing.api.model.CreditProductIdentifier creditProductIdentifier2;
        java.lang.Boolean bool;
        com.paypal.oslo.feature.revolvingcreditservicing.domain.model.repayment.RepaymentActivity repaymentActivity;
        java.lang.String str;
        com.paypal.oslo.feature.revolvingcreditservicing.ui.common.components.UiString.StringResWithParameter stringResWithParameter;
        if (continuation instanceof com.paypal.oslo.feature.revolvingcreditservicing.ui.common.components.mapper.ScheduledPaymentInfoMapper$map$1) {
            scheduledPaymentInfoMapper$map$1 = (com.paypal.oslo.feature.revolvingcreditservicing.ui.common.components.mapper.ScheduledPaymentInfoMapper$map$1) continuation;
            if ((scheduledPaymentInfoMapper$map$1.getInputFormats & Integer.MIN_VALUE) != 0) {
                scheduledPaymentInfoMapper$map$1.getInputFormats -= 2147483648;
                com.paypal.oslo.feature.revolvingcreditservicing.ui.common.components.mapper.ScheduledPaymentInfoMapper$map$1 scheduledPaymentInfoMapper$map$12 = scheduledPaymentInfoMapper$map$1;
                java.lang.Object obj = scheduledPaymentInfoMapper$map$12.getOutputMinFrameDuration;
                java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = scheduledPaymentInfoMapper$map$12.getInputFormats;
                if (i != 0) {
                    kotlin.ResultKt.throwOnFailure(obj);
                    if (list != null) {
                        java.util.ArrayList arrayList2 = new java.util.ArrayList();
                        for (java.lang.Object obj2 : list) {
                            if (com.paypal.oslo.feature.revolvingcreditservicing.ui.common.components.mapper.ScheduledPaymentInfoMapperKt.access$isScheduled((com.paypal.oslo.feature.revolvingcreditservicing.domain.model.repayment.RepaymentActivity) obj2)) {
                                arrayList2.add(obj2);
                            }
                        }
                        arrayList = arrayList2;
                    } else {
                        arrayList = null;
                    }
                    if (arrayList == null) {
                        arrayList = kotlin.collections.CollectionsKt.emptyList();
                    }
                    int size = arrayList.size();
                    if (size == 0) {
                        return null;
                    }
                    if (size == 1) {
                        com.paypal.oslo.feature.revolvingcreditservicing.domain.model.repayment.RepaymentActivity repaymentActivity2 = (com.paypal.oslo.feature.revolvingcreditservicing.domain.model.repayment.RepaymentActivity) kotlin.collections.CollectionsKt.first(arrayList);
                        java.time.Instant paymentTime = repaymentActivity2.getPaymentTime();
                        java.lang.Boolean boxBoolean = paymentTime != null ? kotlin.coroutines.jvm.internal.Boxing.boxBoolean(com.paypal.oslo.feature.revolvingcreditservicing.utils.DateUtilKt.isToday$default(paymentTime, null, 1, null)) : null;
                        com.paypal.oslo.feature.revolvingcreditservicing.domain.formatter.currency.CurrencyFormatterFacade currencyFormatterFacade = this.getHighSpeedVideoFpsRanges;
                        com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.core.CurrencyAmount amount = repaymentActivity2.getAmount();
                        scheduledPaymentInfoMapper$map$12.Camera2StreamConfigurationMap = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(list);
                        creditProductIdentifier2 = creditProductIdentifier;
                        scheduledPaymentInfoMapper$map$12.getHighSpeedVideoSizes = creditProductIdentifier2;
                        scheduledPaymentInfoMapper$map$12.getHighSpeedVideoFpsRanges = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(arrayList);
                        scheduledPaymentInfoMapper$map$12.getHighResolutionOutputSizeshNQ4ISI = repaymentActivity2;
                        scheduledPaymentInfoMapper$map$12.getHighSpeedVideoSizesFor = boxBoolean;
                        scheduledPaymentInfoMapper$map$12.getHighSpeedVideoFpsRangesFor = 0;
                        scheduledPaymentInfoMapper$map$12.getInputFormats = 1;
                        java.lang.Object format$default = com.paypal.oslo.feature.revolvingcreditservicing.domain.formatter.currency.CurrencyFormatterFacade.format$default(currencyFormatterFacade, amount, null, 0, scheduledPaymentInfoMapper$map$12, 6, null);
                        if (format$default == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                        bool = boxBoolean;
                        obj = format$default;
                        repaymentActivity = repaymentActivity2;
                    } else {
                        return new com.paypal.oslo.feature.revolvingcreditservicing.ui.common.components.UiString.StringResOnly(com.paypal.oslo.feature.revolvingcreditservicing.R.string.feature_revolvingcredit_servicing_common_multiple_scheduled_payments, (com.paypal.oslo.feature.revolvingcreditservicing.api.model.CreditProductIdentifier) null, false, 6, (kotlin.jvm.internal.DefaultConstructorMarker) null);
                    }
                } else {
                    if (i != 1) {
                        throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    int i2 = scheduledPaymentInfoMapper$map$12.getHighSpeedVideoFpsRangesFor;
                    bool = (java.lang.Boolean) scheduledPaymentInfoMapper$map$12.getHighSpeedVideoSizesFor;
                    repaymentActivity = (com.paypal.oslo.feature.revolvingcreditservicing.domain.model.repayment.RepaymentActivity) scheduledPaymentInfoMapper$map$12.getHighResolutionOutputSizeshNQ4ISI;
                    com.paypal.oslo.feature.revolvingcreditservicing.api.model.CreditProductIdentifier creditProductIdentifier3 = (com.paypal.oslo.feature.revolvingcreditservicing.api.model.CreditProductIdentifier) scheduledPaymentInfoMapper$map$12.getHighSpeedVideoSizes;
                    kotlin.ResultKt.throwOnFailure(obj);
                    creditProductIdentifier2 = creditProductIdentifier3;
                }
                str = (java.lang.String) obj;
                if (str == null) {
                    str = "";
                }
                if (!kotlin.jvm.internal.Intrinsics.areEqual(bool, kotlin.coroutines.jvm.internal.Boxing.boxBoolean(true))) {
                    stringResWithParameter = new com.paypal.oslo.feature.revolvingcreditservicing.ui.common.components.UiString.StringResWithParameter(com.paypal.oslo.feature.revolvingcreditservicing.R.string.feature_revolvingcredit_servicing_payment_scheduled_today, new java.lang.Object[]{str}, null, false, 12, null);
                } else {
                    java.lang.String format = this.getHighSpeedVideoFpsRangesFor.format(repaymentActivity.getPaymentTime(), com.paypal.oslo.feature.revolvingcreditservicing.domain.formatter.date.DateFormat.DateMonthDayShort.INSTANCE, com.paypal.oslo.feature.revolvingcreditservicing.utils.LocaleMapperKt.toLocale(creditProductIdentifier2));
                    stringResWithParameter = new com.paypal.oslo.feature.revolvingcreditservicing.ui.common.components.UiString.StringResWithParameter(com.paypal.oslo.feature.revolvingcreditservicing.R.string.feature_revolvingcredit_servicing_common_single_scheduled_payment, new java.lang.Object[]{str, format != null ? format : ""}, null, false, 12, null);
                }
                return stringResWithParameter;
            }
        }
        scheduledPaymentInfoMapper$map$1 = new com.paypal.oslo.feature.revolvingcreditservicing.ui.common.components.mapper.ScheduledPaymentInfoMapper$map$1(this, continuation);
        com.paypal.oslo.feature.revolvingcreditservicing.ui.common.components.mapper.ScheduledPaymentInfoMapper$map$1 scheduledPaymentInfoMapper$map$122 = scheduledPaymentInfoMapper$map$1;
        java.lang.Object obj3 = scheduledPaymentInfoMapper$map$122.getOutputMinFrameDuration;
        java.lang.Object coroutine_suspended2 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = scheduledPaymentInfoMapper$map$122.getInputFormats;
        if (i != 0) {
        }
        str = (java.lang.String) obj3;
        if (str == null) {
        }
        if (!kotlin.jvm.internal.Intrinsics.areEqual(bool, kotlin.coroutines.jvm.internal.Boxing.boxBoolean(true))) {
        }
        return stringResWithParameter;
    }
}
