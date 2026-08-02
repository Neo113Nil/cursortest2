package com.paypal.oslo.feature.businesspayandgetpaid.payandgetpaid.ui.invoice;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@kotlin.Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\b\n\u0002\b\t\b\u0080\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u0017\u0010\u0006\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\tj\u0002\b\nj\u0002\b\u000b"}, d2 = {"Lcom/paypal/oslo/feature/businesspayandgetpaid/payandgetpaid/ui/invoice/AccordionItem;", "", "", "p0", "<init>", "(Ljava/lang/String;II)V", "title", com.visa.cbp.getEncExpo.warmup, "getTitle", "()I", "NOTE", "OPTIONS"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class AccordionItem {
    public static final com.paypal.oslo.feature.businesspayandgetpaid.payandgetpaid.ui.invoice.AccordionItem NOTE;
    public static final com.paypal.oslo.feature.businesspayandgetpaid.payandgetpaid.ui.invoice.AccordionItem OPTIONS;
    private static final /* synthetic */ com.paypal.oslo.feature.businesspayandgetpaid.payandgetpaid.ui.invoice.AccordionItem[] getHighResolutionOutputSizeshNQ4ISI;
    private static final /* synthetic */ kotlin.enums.EnumEntries getHighSpeedVideoFpsRangesFor;
    private final int title;

    private AccordionItem(java.lang.String str, int i, int i2) {
        this.title = i2;
    }

    public final int getTitle() {
        return this.title;
    }

    static {
        com.paypal.oslo.feature.businesspayandgetpaid.payandgetpaid.ui.invoice.AccordionItem accordionItem = new com.paypal.oslo.feature.businesspayandgetpaid.payandgetpaid.ui.invoice.AccordionItem("NOTE", 0, com.paypal.oslo.feature.businesspayandgetpaid.R.string.feature_business_pay_and_get_paid_note_title);
        NOTE = accordionItem;
        com.paypal.oslo.feature.businesspayandgetpaid.payandgetpaid.ui.invoice.AccordionItem accordionItem2 = new com.paypal.oslo.feature.businesspayandgetpaid.payandgetpaid.ui.invoice.AccordionItem("OPTIONS", 1, com.paypal.oslo.feature.businesspayandgetpaid.R.string.feature_business_pay_and_get_paid_invoice_options);
        OPTIONS = accordionItem2;
        com.paypal.oslo.feature.businesspayandgetpaid.payandgetpaid.ui.invoice.AccordionItem[] accordionItemArr = {accordionItem, accordionItem2};
        getHighResolutionOutputSizeshNQ4ISI = accordionItemArr;
        getHighSpeedVideoFpsRangesFor = kotlin.enums.EnumEntriesKt.enumEntries(accordionItemArr);
    }

    public static com.paypal.oslo.feature.businesspayandgetpaid.payandgetpaid.ui.invoice.AccordionItem[] values() {
        return (com.paypal.oslo.feature.businesspayandgetpaid.payandgetpaid.ui.invoice.AccordionItem[]) getHighResolutionOutputSizeshNQ4ISI.clone();
    }

    public static com.paypal.oslo.feature.businesspayandgetpaid.payandgetpaid.ui.invoice.AccordionItem valueOf(java.lang.String str) {
        return (com.paypal.oslo.feature.businesspayandgetpaid.payandgetpaid.ui.invoice.AccordionItem) java.lang.Enum.valueOf(com.paypal.oslo.feature.businesspayandgetpaid.payandgetpaid.ui.invoice.AccordionItem.class, str);
    }

    public static kotlin.enums.EnumEntries<com.paypal.oslo.feature.businesspayandgetpaid.payandgetpaid.ui.invoice.AccordionItem> getEntries() {
        return getHighSpeedVideoFpsRangesFor;
    }
}
