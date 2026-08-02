package com.paypal.oslo.feature.businesspayandgetpaid.payandgetpaid.ui.invoice;

@kotlin.Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\"\u0015\u0010\u0004\u001a\u00020\u0001*\u00020\u00008G¢\u0006\u0006\u001a\u0004\b\u0002\u0010\u0003\"\u0015\u0010\b\u001a\u00020\u0005*\u00020\u00008G¢\u0006\u0006\u001a\u0004\b\u0006\u0010\u0007"}, d2 = {"Lcom/paypal/oslo/feature/businesspayandgetpaid/shared/domain/model/InvoiceStatus;", "", "getDisplayNameResId", "(Lcom/paypal/oslo/feature/businesspayandgetpaid/shared/domain/model/InvoiceStatus;)I", "displayNameResId", "Lcom/paypal/pds/components/BadgeStyle;", "getBadgeStyle", "(Lcom/paypal/oslo/feature/businesspayandgetpaid/shared/domain/model/InvoiceStatus;)Lcom/paypal/pds/components/BadgeStyle;", "badgeStyle"}, k = 2, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class InvoiceStatusUiKt {
    public static final int getDisplayNameResId(com.paypal.oslo.feature.businesspayandgetpaid.shared.domain.model.InvoiceStatus invoiceStatus) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(invoiceStatus, "");
        if (kotlin.jvm.internal.Intrinsics.areEqual(invoiceStatus, com.paypal.oslo.feature.businesspayandgetpaid.shared.domain.model.InvoiceStatus.Sent.INSTANCE)) {
            return com.paypal.oslo.feature.businesspayandgetpaid.R.string.feature_business_pay_and_get_paid_status_sent;
        }
        if (kotlin.jvm.internal.Intrinsics.areEqual(invoiceStatus, com.paypal.oslo.feature.businesspayandgetpaid.shared.domain.model.InvoiceStatus.Paid.INSTANCE)) {
            return com.paypal.oslo.feature.businesspayandgetpaid.R.string.feature_business_pay_and_get_paid_status_paid;
        }
        if (kotlin.jvm.internal.Intrinsics.areEqual(invoiceStatus, com.paypal.oslo.feature.businesspayandgetpaid.shared.domain.model.InvoiceStatus.Overdue.INSTANCE)) {
            return com.paypal.oslo.feature.businesspayandgetpaid.R.string.feature_business_pay_and_get_paid_status_overdue;
        }
        if (kotlin.jvm.internal.Intrinsics.areEqual(invoiceStatus, com.paypal.oslo.feature.businesspayandgetpaid.shared.domain.model.InvoiceStatus.Cancelled.INSTANCE)) {
            return com.paypal.oslo.feature.businesspayandgetpaid.R.string.feature_business_pay_and_get_paid_status_cancelled;
        }
        if (kotlin.jvm.internal.Intrinsics.areEqual(invoiceStatus, com.paypal.oslo.feature.businesspayandgetpaid.shared.domain.model.InvoiceStatus.Draft.INSTANCE)) {
            return com.paypal.oslo.feature.businesspayandgetpaid.R.string.feature_business_pay_and_get_paid_status_draft;
        }
        throw new kotlin.NoWhenBranchMatchedException();
    }

    public static final com.paypal.pds.components.BadgeStyle getBadgeStyle(com.paypal.oslo.feature.businesspayandgetpaid.shared.domain.model.InvoiceStatus invoiceStatus) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(invoiceStatus, "");
        if (kotlin.jvm.internal.Intrinsics.areEqual(invoiceStatus, com.paypal.oslo.feature.businesspayandgetpaid.shared.domain.model.InvoiceStatus.Sent.INSTANCE)) {
            return com.paypal.pds.components.BadgeStyle.Info.INSTANCE;
        }
        if (kotlin.jvm.internal.Intrinsics.areEqual(invoiceStatus, com.paypal.oslo.feature.businesspayandgetpaid.shared.domain.model.InvoiceStatus.Paid.INSTANCE)) {
            return com.paypal.pds.components.BadgeStyle.Positive.INSTANCE;
        }
        if (kotlin.jvm.internal.Intrinsics.areEqual(invoiceStatus, com.paypal.oslo.feature.businesspayandgetpaid.shared.domain.model.InvoiceStatus.Overdue.INSTANCE)) {
            return com.paypal.pds.components.BadgeStyle.Warning.INSTANCE;
        }
        if (!kotlin.jvm.internal.Intrinsics.areEqual(invoiceStatus, com.paypal.oslo.feature.businesspayandgetpaid.shared.domain.model.InvoiceStatus.Cancelled.INSTANCE) && !kotlin.jvm.internal.Intrinsics.areEqual(invoiceStatus, com.paypal.oslo.feature.businesspayandgetpaid.shared.domain.model.InvoiceStatus.Draft.INSTANCE)) {
            throw new kotlin.NoWhenBranchMatchedException();
        }
        return com.paypal.pds.components.BadgeStyle.Neutral.INSTANCE;
    }
}
