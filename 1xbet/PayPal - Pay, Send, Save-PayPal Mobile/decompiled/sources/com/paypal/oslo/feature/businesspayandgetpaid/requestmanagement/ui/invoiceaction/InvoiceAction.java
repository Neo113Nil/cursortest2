package com.paypal.oslo.feature.businesspayandgetpaid.requestmanagement.ui.invoiceaction;

@kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\b0\u0018\u00002\u00020\u0001:\u0005\u0010\u0011\u0012\u0013\u0014B\u0019\b\u0004\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007R\u001a\u0010\b\u001a\u00020\u00028\u0017X\u0096\u0004¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\n\u0010\u000bR\u001a\u0010\f\u001a\u00020\u00048\u0017X\u0097\u0004¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000e\u0010\u000f\u0082\u0001\u0005\u0015\u0016\u0017\u0018\u0019"}, d2 = {"Lcom/paypal/oslo/feature/businesspayandgetpaid/requestmanagement/ui/invoiceaction/InvoiceAction;", "", "", "p0", "Lcom/paypal/pds/core/Icon;", "p1", "<init>", "(ILcom/paypal/pds/core/Icon;)V", "text", com.visa.cbp.getEncExpo.warmup, "getText", "()I", "icon", "Lcom/paypal/pds/core/Icon;", "getIcon", "()Lcom/paypal/pds/core/Icon;", "RecordPayment", "RecordRefund", "Refund", "Edit", "Duplicate", "Lcom/paypal/oslo/feature/businesspayandgetpaid/requestmanagement/ui/invoiceaction/InvoiceAction$Duplicate;", "Lcom/paypal/oslo/feature/businesspayandgetpaid/requestmanagement/ui/invoiceaction/InvoiceAction$Edit;", "Lcom/paypal/oslo/feature/businesspayandgetpaid/requestmanagement/ui/invoiceaction/InvoiceAction$RecordPayment;", "Lcom/paypal/oslo/feature/businesspayandgetpaid/requestmanagement/ui/invoiceaction/InvoiceAction$RecordRefund;", "Lcom/paypal/oslo/feature/businesspayandgetpaid/requestmanagement/ui/invoiceaction/InvoiceAction$Refund;"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes11.dex */
public abstract class InvoiceAction {
    public static final int $stable = 0;
    private final com.paypal.pds.core.Icon icon;
    private final int text;

    private InvoiceAction(int i, com.paypal.pds.core.Icon icon) {
        this.text = i;
        this.icon = icon;
    }

    public int getText() {
        return this.text;
    }

    public com.paypal.pds.core.Icon getIcon() {
        return this.icon;
    }

    @kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lcom/paypal/oslo/feature/businesspayandgetpaid/requestmanagement/ui/invoiceaction/InvoiceAction$RecordPayment;", "Lcom/paypal/oslo/feature/businesspayandgetpaid/requestmanagement/ui/invoiceaction/InvoiceAction;", "<init>", "()V"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class RecordPayment extends com.paypal.oslo.feature.businesspayandgetpaid.requestmanagement.ui.invoiceaction.InvoiceAction {
        public static final int $stable = 0;
        public static final com.paypal.oslo.feature.businesspayandgetpaid.requestmanagement.ui.invoiceaction.InvoiceAction.RecordPayment INSTANCE = new com.paypal.oslo.feature.businesspayandgetpaid.requestmanagement.ui.invoiceaction.InvoiceAction.RecordPayment();

        private RecordPayment() {
            super(com.paypal.oslo.feature.businesspayandgetpaid.R.string.feature_business_pay_and_get_paid_record_payment, com.paypal.pds.core.Icon.MoneyBill.INSTANCE, null);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lcom/paypal/oslo/feature/businesspayandgetpaid/requestmanagement/ui/invoiceaction/InvoiceAction$RecordRefund;", "Lcom/paypal/oslo/feature/businesspayandgetpaid/requestmanagement/ui/invoiceaction/InvoiceAction;", "<init>", "()V"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class RecordRefund extends com.paypal.oslo.feature.businesspayandgetpaid.requestmanagement.ui.invoiceaction.InvoiceAction {
        public static final int $stable = 0;
        public static final com.paypal.oslo.feature.businesspayandgetpaid.requestmanagement.ui.invoiceaction.InvoiceAction.RecordRefund INSTANCE = new com.paypal.oslo.feature.businesspayandgetpaid.requestmanagement.ui.invoiceaction.InvoiceAction.RecordRefund();

        private RecordRefund() {
            super(com.paypal.oslo.feature.businesspayandgetpaid.R.string.feature_business_pay_and_get_paid_record_refund, com.paypal.pds.core.Icon.MoneyBill.INSTANCE, null);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lcom/paypal/oslo/feature/businesspayandgetpaid/requestmanagement/ui/invoiceaction/InvoiceAction$Refund;", "Lcom/paypal/oslo/feature/businesspayandgetpaid/requestmanagement/ui/invoiceaction/InvoiceAction;", "<init>", "()V"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class Refund extends com.paypal.oslo.feature.businesspayandgetpaid.requestmanagement.ui.invoiceaction.InvoiceAction {
        public static final int $stable = 0;
        public static final com.paypal.oslo.feature.businesspayandgetpaid.requestmanagement.ui.invoiceaction.InvoiceAction.Refund INSTANCE = new com.paypal.oslo.feature.businesspayandgetpaid.requestmanagement.ui.invoiceaction.InvoiceAction.Refund();

        private Refund() {
            super(com.paypal.oslo.feature.businesspayandgetpaid.R.string.feature_business_pay_and_get_paid_refund, com.paypal.pds.core.Icon.MoneyBill.INSTANCE, null);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lcom/paypal/oslo/feature/businesspayandgetpaid/requestmanagement/ui/invoiceaction/InvoiceAction$Edit;", "Lcom/paypal/oslo/feature/businesspayandgetpaid/requestmanagement/ui/invoiceaction/InvoiceAction;", "<init>", "()V"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class Edit extends com.paypal.oslo.feature.businesspayandgetpaid.requestmanagement.ui.invoiceaction.InvoiceAction {
        public static final int $stable = 0;
        public static final com.paypal.oslo.feature.businesspayandgetpaid.requestmanagement.ui.invoiceaction.InvoiceAction.Edit INSTANCE = new com.paypal.oslo.feature.businesspayandgetpaid.requestmanagement.ui.invoiceaction.InvoiceAction.Edit();

        private Edit() {
            super(com.paypal.oslo.feature.businesspayandgetpaid.R.string.feature_business_pay_and_get_paid_edit, com.paypal.pds.core.Icon.Pencil.INSTANCE, null);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lcom/paypal/oslo/feature/businesspayandgetpaid/requestmanagement/ui/invoiceaction/InvoiceAction$Duplicate;", "Lcom/paypal/oslo/feature/businesspayandgetpaid/requestmanagement/ui/invoiceaction/InvoiceAction;", "<init>", "()V"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class Duplicate extends com.paypal.oslo.feature.businesspayandgetpaid.requestmanagement.ui.invoiceaction.InvoiceAction {
        public static final int $stable = 0;
        public static final com.paypal.oslo.feature.businesspayandgetpaid.requestmanagement.ui.invoiceaction.InvoiceAction.Duplicate INSTANCE = new com.paypal.oslo.feature.businesspayandgetpaid.requestmanagement.ui.invoiceaction.InvoiceAction.Duplicate();

        private Duplicate() {
            super(com.paypal.oslo.feature.businesspayandgetpaid.R.string.feature_business_pay_and_get_paid_duplicate, com.paypal.pds.core.Icon.Rectangles.INSTANCE, null);
        }
    }

    public /* synthetic */ InvoiceAction(int i, com.paypal.pds.core.Icon icon, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this(i, icon);
    }
}
