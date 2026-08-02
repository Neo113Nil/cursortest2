package com.paypal.oslo.feature.revolvingcreditservicing.ui.makeapayment.confirmation.mapper;

@kotlin.Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u0001B\u0011\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u001d\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\u000b\u0010\fR\u0014\u0010\r\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u000e"}, d2 = {"Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/makeapayment/confirmation/mapper/PaymentConfirmationMapper;", "", "Lcom/paypal/oslo/feature/revolvingcreditservicing/domain/formatter/date/DateFormatterFacade;", "dateFormatter", "<init>", "(Lcom/paypal/oslo/feature/revolvingcreditservicing/domain/formatter/date/DateFormatterFacade;)V", "Lcom/paypal/oslo/feature/revolvingcreditservicing/domain/model/repayment/MakePaymentResponse;", "response", "Lcom/paypal/oslo/feature/revolvingcreditservicing/api/model/CreditProductIdentifier;", "creditProductIdentifier", "Lcom/paypal/oslo/feature/revolvingcreditservicing/di/navigation/arguments/PaymentConfirmationArgs;", "toConfirmationArgs", "(Lcom/paypal/oslo/feature/revolvingcreditservicing/domain/model/repayment/MakePaymentResponse;Lcom/paypal/oslo/feature/revolvingcreditservicing/api/model/CreditProductIdentifier;)Lcom/paypal/oslo/feature/revolvingcreditservicing/di/navigation/arguments/PaymentConfirmationArgs;", "Camera2StreamConfigurationMap", "Lcom/paypal/oslo/feature/revolvingcreditservicing/domain/formatter/date/DateFormatterFacade;"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class PaymentConfirmationMapper {
    public static final int $stable = 8;
    private final com.paypal.oslo.feature.revolvingcreditservicing.domain.formatter.date.DateFormatterFacade Camera2StreamConfigurationMap;

    @javax.inject.Inject
    public PaymentConfirmationMapper(com.paypal.oslo.feature.revolvingcreditservicing.domain.formatter.date.DateFormatterFacade dateFormatterFacade) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(dateFormatterFacade, "");
        this.Camera2StreamConfigurationMap = dateFormatterFacade;
    }

    public final com.paypal.oslo.feature.revolvingcreditservicing.di.navigation.arguments.PaymentConfirmationArgs toConfirmationArgs(com.paypal.oslo.feature.revolvingcreditservicing.domain.model.repayment.MakePaymentResponse response, com.paypal.oslo.feature.revolvingcreditservicing.api.model.CreditProductIdentifier creditProductIdentifier) {
        com.paypal.oslo.feature.revolvingcreditservicing.ui.common.components.UiString plainString;
        com.paypal.oslo.feature.revolvingcreditservicing.ui.common.components.UiString stringResOnly;
        java.lang.String str = "";
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(response, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(creditProductIdentifier, "");
        com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.core.CurrencyAmount amount = response.getAmount();
        com.paypal.oslo.feature.revolvingcreditservicing.domain.model.fundinginstrument.FundingInstrument fundingInstrument = (com.paypal.oslo.feature.revolvingcreditservicing.domain.model.fundinginstrument.FundingInstrument) kotlin.collections.CollectionsKt.first((java.util.List) response.getFundingInstruments());
        java.lang.String paymentDate = response.getPaymentDate();
        java.util.Locale locale = com.paypal.oslo.feature.revolvingcreditservicing.utils.LocaleMapperKt.toLocale(creditProductIdentifier);
        java.time.Instant anyToInstantOrNull = com.paypal.oslo.feature.revolvingcreditservicing.utils.DateUtilKt.anyToInstantOrNull(paymentDate);
        if (anyToInstantOrNull == null) {
            stringResOnly = new com.paypal.oslo.feature.revolvingcreditservicing.ui.common.components.UiString.StringResOnly(com.paypal.oslo.feature.revolvingcreditservicing.R.string.feature_revolvingcredit_servicing_common_today, (com.paypal.oslo.feature.revolvingcreditservicing.api.model.CreditProductIdentifier) null, false, 6, (kotlin.jvm.internal.DefaultConstructorMarker) null);
        } else {
            java.time.LocalDate localDate = anyToInstantOrNull.atZone(java.time.ZoneId.systemDefault()).toLocalDate();
            java.time.LocalDate now = java.time.LocalDate.now();
            if (kotlin.jvm.internal.Intrinsics.areEqual(localDate, now)) {
                stringResOnly = new com.paypal.oslo.feature.revolvingcreditservicing.ui.common.components.UiString.StringResOnly(com.paypal.oslo.feature.revolvingcreditservicing.R.string.feature_revolvingcredit_servicing_common_today, (com.paypal.oslo.feature.revolvingcreditservicing.api.model.CreditProductIdentifier) null, false, 6, (kotlin.jvm.internal.DefaultConstructorMarker) null);
            } else if (kotlin.jvm.internal.Intrinsics.areEqual(localDate, now.plusDays(1L))) {
                stringResOnly = new com.paypal.oslo.feature.revolvingcreditservicing.ui.common.components.UiString.StringResOnly(com.paypal.oslo.feature.revolvingcreditservicing.R.string.feature_revolvingcredit_servicing_review_payment_tomorrow, (com.paypal.oslo.feature.revolvingcreditservicing.api.model.CreditProductIdentifier) null, false, 6, (kotlin.jvm.internal.DefaultConstructorMarker) null);
            } else {
                com.paypal.oslo.feature.revolvingcreditservicing.domain.formatter.date.DateFormatterFacade dateFormatterFacade = this.Camera2StreamConfigurationMap;
                kotlin.jvm.internal.Intrinsics.checkNotNull(localDate);
                java.lang.String format = dateFormatterFacade.format(localDate, com.paypal.oslo.feature.revolvingcreditservicing.domain.formatter.date.DateFormat.DateMonthDayShort.INSTANCE, locale);
                if (format != null) {
                    str = format;
                } else if (paymentDate != null) {
                    str = paymentDate;
                }
                plainString = new com.paypal.oslo.feature.revolvingcreditservicing.ui.common.components.UiString.PlainString(str);
                return new com.paypal.oslo.feature.revolvingcreditservicing.di.navigation.arguments.PaymentConfirmationArgs(fundingInstrument, (com.paypal.oslo.feature.revolvingcreditservicing.domain.model.fundinginstrument.FundingInstrument) kotlin.collections.CollectionsKt.getOrNull(response.getFundingInstruments(), 1), plainString, amount, response.getPaymentType(), creditProductIdentifier);
            }
        }
        plainString = stringResOnly;
        return new com.paypal.oslo.feature.revolvingcreditservicing.di.navigation.arguments.PaymentConfirmationArgs(fundingInstrument, (com.paypal.oslo.feature.revolvingcreditservicing.domain.model.fundinginstrument.FundingInstrument) kotlin.collections.CollectionsKt.getOrNull(response.getFundingInstruments(), 1), plainString, amount, response.getPaymentType(), creditProductIdentifier);
    }
}
