package com.paypal.oslo.feature.businesspayandgetpaid.requestmanagement.ui.state;

@kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\u0013\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u0000¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lcom/paypal/oslo/feature/businesspayandgetpaid/requestmanagement/domain/model/invoicemanagement/Invoice;", "Lcom/paypal/oslo/feature/businesspayandgetpaid/requestmanagement/ui/state/InvoiceStatusUiState;", "invoiceStatusUiState", "(Lcom/paypal/oslo/feature/businesspayandgetpaid/requestmanagement/domain/model/invoicemanagement/Invoice;)Lcom/paypal/oslo/feature/businesspayandgetpaid/requestmanagement/ui/state/InvoiceStatusUiState;"}, k = 2, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class InvoiceStatusUiStateKt {
    public static final com.paypal.oslo.feature.businesspayandgetpaid.requestmanagement.ui.state.InvoiceStatusUiState invoiceStatusUiState(com.paypal.oslo.feature.businesspayandgetpaid.requestmanagement.domain.model.invoicemanagement.Invoice invoice) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(invoice, "");
        switch (com.paypal.oslo.feature.businesspayandgetpaid.requestmanagement.ui.state.InvoiceStatusUiStateKt.WhenMappings.$EnumSwitchMapping$0[invoice.getStatus().ordinal()]) {
            case 1:
            case 2:
                return new com.paypal.oslo.feature.businesspayandgetpaid.requestmanagement.ui.state.InvoiceStatusUiState(invoice.getStatus(), com.paypal.oslo.feature.businesspayandgetpaid.R.string.feature_business_pay_and_get_paid_status_cancelled, com.paypal.pds.components.BadgeStyle.Negative.INSTANCE);
            case 3:
                return new com.paypal.oslo.feature.businesspayandgetpaid.requestmanagement.ui.state.InvoiceStatusUiState(invoice.getStatus(), com.paypal.oslo.feature.businesspayandgetpaid.R.string.feature_business_pay_and_get_paid_status_draft, com.paypal.pds.components.BadgeStyle.Neutral.INSTANCE);
            case 4:
            case 5:
                return new com.paypal.oslo.feature.businesspayandgetpaid.requestmanagement.ui.state.InvoiceStatusUiState(invoice.getStatus(), com.paypal.oslo.feature.businesspayandgetpaid.R.string.feature_business_pay_and_get_paid_status_paid, com.paypal.pds.components.BadgeStyle.Positive.INSTANCE);
            case 6:
            case 7:
                return new com.paypal.oslo.feature.businesspayandgetpaid.requestmanagement.ui.state.InvoiceStatusUiState(invoice.getStatus(), com.paypal.oslo.feature.businesspayandgetpaid.R.string.feature_business_pay_and_get_paid_status_refunded, com.paypal.pds.components.BadgeStyle.Positive.INSTANCE);
            case 8:
                return new com.paypal.oslo.feature.businesspayandgetpaid.requestmanagement.ui.state.InvoiceStatusUiState(invoice.getStatus(), com.paypal.oslo.feature.businesspayandgetpaid.R.string.feature_business_pay_and_get_paid_status_partially_paid, com.paypal.pds.components.BadgeStyle.Positive.INSTANCE);
            case 9:
                return new com.paypal.oslo.feature.businesspayandgetpaid.requestmanagement.ui.state.InvoiceStatusUiState(invoice.getStatus(), com.paypal.oslo.feature.businesspayandgetpaid.R.string.feature_business_pay_and_get_paid_status_partially_refunded, com.paypal.pds.components.BadgeStyle.Positive.INSTANCE);
            case 10:
                return new com.paypal.oslo.feature.businesspayandgetpaid.requestmanagement.ui.state.InvoiceStatusUiState(invoice.getStatus(), com.paypal.oslo.feature.businesspayandgetpaid.R.string.feature_business_pay_and_get_paid_status_payment_pending, com.paypal.pds.components.BadgeStyle.Neutral.INSTANCE);
            case 11:
                return new com.paypal.oslo.feature.businesspayandgetpaid.requestmanagement.ui.state.InvoiceStatusUiState(invoice.getStatus(), com.paypal.oslo.feature.businesspayandgetpaid.R.string.feature_business_pay_and_get_paid_status_scheduled, com.paypal.pds.components.BadgeStyle.Neutral.INSTANCE);
            case 12:
            case 13:
                com.paypal.oslo.feature.businesspayandgetpaid.requestmanagement.domain.model.invoicemanagement.PaymentTerm paymentTerm = invoice.getDetail().getPaymentTerm();
                if ((paymentTerm != null ? paymentTerm.getDueDate() : null) != null) {
                    java.util.Date dueDate = invoice.getDetail().getPaymentTerm().getDueDate();
                    java.util.Calendar calendar = java.util.Calendar.getInstance();
                    calendar.setTime(dueDate);
                    calendar.add(6, 1);
                    java.util.Date time = calendar.getTime();
                    kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(time, "");
                    if (time.before(new java.util.Date())) {
                        return new com.paypal.oslo.feature.businesspayandgetpaid.requestmanagement.ui.state.InvoiceStatusUiState(invoice.getStatus(), com.paypal.oslo.feature.businesspayandgetpaid.R.string.feature_business_pay_and_get_paid_status_overdue, com.paypal.pds.components.BadgeStyle.Warning.INSTANCE);
                    }
                    return new com.paypal.oslo.feature.businesspayandgetpaid.requestmanagement.ui.state.InvoiceStatusUiState(invoice.getStatus(), com.paypal.oslo.feature.businesspayandgetpaid.R.string.feature_business_pay_and_get_paid_status_due, com.paypal.pds.components.BadgeStyle.Info.INSTANCE);
                }
                return new com.paypal.oslo.feature.businesspayandgetpaid.requestmanagement.ui.state.InvoiceStatusUiState(invoice.getStatus(), com.paypal.oslo.feature.businesspayandgetpaid.R.string.feature_business_pay_and_get_paid_status_sent, com.paypal.pds.components.BadgeStyle.Neutral.INSTANCE);
            case 14:
            case 15:
            case 16:
                return new com.paypal.oslo.feature.businesspayandgetpaid.requestmanagement.ui.state.InvoiceStatusUiState(invoice.getStatus(), com.paypal.oslo.feature.businesspayandgetpaid.R.string.feature_business_pay_and_get_paid_status_draft, com.paypal.pds.components.BadgeStyle.Neutral.INSTANCE);
            default:
                throw new kotlin.NoWhenBranchMatchedException();
        }
    }

    @kotlin.Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[com.paypal.oslo.feature.businesspayandgetpaid.requestmanagement.domain.model.invoicemanagement.InvoiceStatus.values().length];
            try {
                iArr[com.paypal.oslo.feature.businesspayandgetpaid.requestmanagement.domain.model.invoicemanagement.InvoiceStatus.CANCELLED.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused) {
            }
            try {
                iArr[com.paypal.oslo.feature.businesspayandgetpaid.requestmanagement.domain.model.invoicemanagement.InvoiceStatus.AUTOCANCELLED.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused2) {
            }
            try {
                iArr[com.paypal.oslo.feature.businesspayandgetpaid.requestmanagement.domain.model.invoicemanagement.InvoiceStatus.DRAFT.ordinal()] = 3;
            } catch (java.lang.NoSuchFieldError unused3) {
            }
            try {
                iArr[com.paypal.oslo.feature.businesspayandgetpaid.requestmanagement.domain.model.invoicemanagement.InvoiceStatus.MARKED_AS_PAID.ordinal()] = 4;
            } catch (java.lang.NoSuchFieldError unused4) {
            }
            try {
                iArr[com.paypal.oslo.feature.businesspayandgetpaid.requestmanagement.domain.model.invoicemanagement.InvoiceStatus.PAID.ordinal()] = 5;
            } catch (java.lang.NoSuchFieldError unused5) {
            }
            try {
                iArr[com.paypal.oslo.feature.businesspayandgetpaid.requestmanagement.domain.model.invoicemanagement.InvoiceStatus.MARKED_AS_REFUNDED.ordinal()] = 6;
            } catch (java.lang.NoSuchFieldError unused6) {
            }
            try {
                iArr[com.paypal.oslo.feature.businesspayandgetpaid.requestmanagement.domain.model.invoicemanagement.InvoiceStatus.REFUNDED.ordinal()] = 7;
            } catch (java.lang.NoSuchFieldError unused7) {
            }
            try {
                iArr[com.paypal.oslo.feature.businesspayandgetpaid.requestmanagement.domain.model.invoicemanagement.InvoiceStatus.PARTIALLY_PAID.ordinal()] = 8;
            } catch (java.lang.NoSuchFieldError unused8) {
            }
            try {
                iArr[com.paypal.oslo.feature.businesspayandgetpaid.requestmanagement.domain.model.invoicemanagement.InvoiceStatus.PARTIALLY_REFUNDED.ordinal()] = 9;
            } catch (java.lang.NoSuchFieldError unused9) {
            }
            try {
                iArr[com.paypal.oslo.feature.businesspayandgetpaid.requestmanagement.domain.model.invoicemanagement.InvoiceStatus.PAYMENT_PENDING.ordinal()] = 10;
            } catch (java.lang.NoSuchFieldError unused10) {
            }
            try {
                iArr[com.paypal.oslo.feature.businesspayandgetpaid.requestmanagement.domain.model.invoicemanagement.InvoiceStatus.SCHEDULED.ordinal()] = 11;
            } catch (java.lang.NoSuchFieldError unused11) {
            }
            try {
                iArr[com.paypal.oslo.feature.businesspayandgetpaid.requestmanagement.domain.model.invoicemanagement.InvoiceStatus.SENT.ordinal()] = 12;
            } catch (java.lang.NoSuchFieldError unused12) {
            }
            try {
                iArr[com.paypal.oslo.feature.businesspayandgetpaid.requestmanagement.domain.model.invoicemanagement.InvoiceStatus.UNPAID.ordinal()] = 13;
            } catch (java.lang.NoSuchFieldError unused13) {
            }
            try {
                iArr[com.paypal.oslo.feature.businesspayandgetpaid.requestmanagement.domain.model.invoicemanagement.InvoiceStatus.UNKNOWN.ordinal()] = 14;
            } catch (java.lang.NoSuchFieldError unused14) {
            }
            try {
                iArr[com.paypal.oslo.feature.businesspayandgetpaid.requestmanagement.domain.model.invoicemanagement.InvoiceStatus.INITIAL.ordinal()] = 15;
            } catch (java.lang.NoSuchFieldError unused15) {
            }
            try {
                iArr[com.paypal.oslo.feature.businesspayandgetpaid.requestmanagement.domain.model.invoicemanagement.InvoiceStatus.REFUND.ordinal()] = 16;
            } catch (java.lang.NoSuchFieldError unused16) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }
}
