package com.paypal.oslo.feature.revolvingcreditservicing.ui.makeapayment.reviewpayment.viewmodel;

@kotlin.Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\b\u0000\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\u0011\b\u0007\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J#\u0010\u000b\u001a\u00020\n2\u0012\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\bH\u0016¢\u0006\u0004\b\u000b\u0010\fR\u0014\u0010\u000f\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u000e"}, d2 = {"Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/makeapayment/reviewpayment/viewmodel/ReviewPaymentFormatterMiddleware;", "Lcom/paypal/oslo/core/mvi/MviStateStore$Middleware;", "Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/makeapayment/reviewpayment/viewmodel/ReviewPaymentState;", "Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/makeapayment/reviewpayment/viewmodel/ReviewPaymentEvent;", "Lcom/paypal/oslo/feature/revolvingcreditservicing/domain/formatter/date/DateFormatterFacade;", "dateFormatterFacade", "<init>", "(Lcom/paypal/oslo/feature/revolvingcreditservicing/domain/formatter/date/DateFormatterFacade;)V", "Lcom/paypal/oslo/core/mvi/MviStateStore$Middleware$Input;", "input", "", "invoke", "(Lcom/paypal/oslo/core/mvi/MviStateStore$Middleware$Input;)V", "getHighSpeedVideoFpsRangesFor", "Lcom/paypal/oslo/feature/revolvingcreditservicing/domain/formatter/date/DateFormatterFacade;", "Camera2StreamConfigurationMap"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class ReviewPaymentFormatterMiddleware implements com.paypal.oslo.core.mvi.MviStateStore.Middleware<com.paypal.oslo.feature.revolvingcreditservicing.ui.makeapayment.reviewpayment.viewmodel.ReviewPaymentState, com.paypal.oslo.feature.revolvingcreditservicing.ui.makeapayment.reviewpayment.viewmodel.ReviewPaymentEvent> {
    public static final int $stable = 8;

    /* renamed from: getHighSpeedVideoFpsRangesFor, reason: from kotlin metadata */
    private final com.paypal.oslo.feature.revolvingcreditservicing.domain.formatter.date.DateFormatterFacade Camera2StreamConfigurationMap;

    @javax.inject.Inject
    public ReviewPaymentFormatterMiddleware(com.paypal.oslo.feature.revolvingcreditservicing.domain.formatter.date.DateFormatterFacade dateFormatterFacade) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(dateFormatterFacade, "");
        this.Camera2StreamConfigurationMap = dateFormatterFacade;
    }

    @Override // com.paypal.oslo.core.mvi.MviStateStore.Middleware
    public final void invoke(com.paypal.oslo.core.mvi.MviStateStore.Middleware.Input<com.paypal.oslo.feature.revolvingcreditservicing.ui.makeapayment.reviewpayment.viewmodel.ReviewPaymentState, com.paypal.oslo.feature.revolvingcreditservicing.ui.makeapayment.reviewpayment.viewmodel.ReviewPaymentEvent> input) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(input, "");
        kotlinx.coroutines.BuildersKt__Builders_commonKt.launch$default(input.getScope(), null, null, new com.paypal.oslo.feature.revolvingcreditservicing.ui.makeapayment.reviewpayment.viewmodel.ReviewPaymentFormatterMiddleware$invoke$1(input, this, null), 3, null);
    }

    public static final /* synthetic */ void access$format(com.paypal.oslo.feature.revolvingcreditservicing.ui.makeapayment.reviewpayment.viewmodel.ReviewPaymentFormatterMiddleware reviewPaymentFormatterMiddleware, com.paypal.oslo.feature.revolvingcreditservicing.ui.makeapayment.reviewpayment.viewmodel.ReviewPaymentState.Ready ready, com.paypal.oslo.feature.revolvingcreditservicing.ui.makeapayment.reviewpayment.viewmodel.ReviewPaymentEvent.OnDateSelected onDateSelected, kotlin.jvm.functions.Function1 function1) {
        com.paypal.oslo.feature.revolvingcreditservicing.ui.common.components.UiString.StringResWithParameter stringResWithParameter;
        com.paypal.oslo.feature.revolvingcreditservicing.domain.model.repayment.RevolvingCreditPaymentType revolvingCreditPaymentType;
        java.util.Locale locale = com.paypal.oslo.feature.revolvingcreditservicing.utils.LocaleMapperKt.toLocale(ready.getReadyInfo().getArgs().getCreditProductIdentifier());
        java.lang.String format = reviewPaymentFormatterMiddleware.Camera2StreamConfigurationMap.format(onDateSelected.getDate(), com.paypal.oslo.feature.revolvingcreditservicing.domain.formatter.date.DateFormat.DateLong.INSTANCE, locale);
        java.lang.String format2 = reviewPaymentFormatterMiddleware.Camera2StreamConfigurationMap.format(onDateSelected.getDate(), com.paypal.oslo.feature.revolvingcreditservicing.domain.formatter.date.DateFormat.DateMonthDayShort.INSTANCE, locale);
        java.time.LocalDate date = onDateSelected.getDate();
        if (format == null) {
            format = "";
        }
        com.paypal.oslo.feature.revolvingcreditservicing.ui.common.components.UiString.PlainString uiString = com.paypal.oslo.feature.revolvingcreditservicing.ui.common.components.UiStringKt.toUiString(format);
        com.paypal.oslo.feature.revolvingcreditservicing.ui.common.components.UiString.PlainString uiString2 = format2 != null ? com.paypal.oslo.feature.revolvingcreditservicing.ui.common.components.UiStringKt.toUiString(format2) : null;
        if (onDateSelected.getDate().isAfter(java.time.LocalDate.now())) {
            int i = com.paypal.oslo.feature.revolvingcreditservicing.R.string.feature_revolvingcredit_servicing_payment_review_button_scheduled;
            java.lang.String paymentAmount = ready.getReadyInfo().getUiModel().getPaymentAmount();
            java.lang.String format3 = reviewPaymentFormatterMiddleware.Camera2StreamConfigurationMap.format(onDateSelected.getDate(), com.paypal.oslo.feature.revolvingcreditservicing.domain.formatter.date.DateFormat.DateMonthDayShort.INSTANCE, locale);
            stringResWithParameter = new com.paypal.oslo.feature.revolvingcreditservicing.ui.common.components.UiString.StringResWithParameter(i, new java.lang.Object[]{paymentAmount, format3 != null ? format3 : ""}, null, false, 12, null);
        } else {
            stringResWithParameter = new com.paypal.oslo.feature.revolvingcreditservicing.ui.common.components.UiString.StringResWithParameter(com.paypal.oslo.feature.revolvingcreditservicing.R.string.feature_revolvingcredit_servicing_payment_review_button, new java.lang.Object[]{ready.getReadyInfo().getUiModel().getPaymentAmount()}, null, false, 12, null);
        }
        com.paypal.oslo.feature.revolvingcreditservicing.ui.common.components.UiString.StringResWithParameter stringResWithParameter2 = stringResWithParameter;
        if (onDateSelected.getDate().isAfter(java.time.LocalDate.now())) {
            revolvingCreditPaymentType = com.paypal.oslo.feature.revolvingcreditservicing.domain.model.repayment.RevolvingCreditPaymentType.SCHEDULED;
        } else {
            revolvingCreditPaymentType = com.paypal.oslo.feature.revolvingcreditservicing.domain.model.repayment.RevolvingCreditPaymentType.REAL_TIME;
        }
        function1.invoke(new com.paypal.oslo.feature.revolvingcreditservicing.ui.makeapayment.reviewpayment.viewmodel.ReviewPaymentEvent.OnCalendarDismissed(date, uiString, uiString2, stringResWithParameter2, revolvingCreditPaymentType));
    }
}
