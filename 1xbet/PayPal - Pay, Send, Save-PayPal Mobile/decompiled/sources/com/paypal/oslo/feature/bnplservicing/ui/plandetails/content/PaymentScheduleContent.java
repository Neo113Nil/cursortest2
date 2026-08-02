package com.paypal.oslo.feature.bnplservicing.ui.plandetails.content;

@kotlin.Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\n\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u001d\u0010\b\u001a\u00020\u00072\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u0004¢\u0006\u0004\b\b\u0010\tJ\u0015\u0010\n\u001a\u00020\u00072\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\n\u0010\u000bJ\u0015\u0010\f\u001a\u00020\u00072\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\f\u0010\u000bJ\u001d\u0010\r\u001a\u00020\u00072\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u0004¢\u0006\u0004\b\r\u0010\tR\u0017\u0010\u000e\u001a\u00020\u00078\u0007¢\u0006\f\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011"}, d2 = {"Lcom/paypal/oslo/feature/bnplservicing/ui/plandetails/content/PaymentScheduleContent;", "", "<init>", "()V", "", "amount", "date", "Lcom/paypal/oslo/core/commonui/utils/RefText;", "paymentScheduledText", "(Ljava/lang/String;Ljava/lang/String;)Lcom/paypal/oslo/core/commonui/utils/RefText;", "paymentDueNowText", "(Ljava/lang/String;)Lcom/paypal/oslo/core/commonui/utils/RefText;", "paymentDueTodayText", "paymentOnDateText", "title", "Lcom/paypal/oslo/core/commonui/utils/RefText;", "getTitle", "()Lcom/paypal/oslo/core/commonui/utils/RefText;"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class PaymentScheduleContent {
    public static final int $stable = com.paypal.oslo.core.commonui.utils.RefText.$stable;
    private final com.paypal.oslo.core.commonui.utils.RefText title = com.paypal.oslo.core.commonui.utils.RefTextKt.stringResourceRef(com.paypal.oslo.feature.bnplservicing.R.string.feature_bnpl_servicing_payment_schedule_title, new java.lang.Object[0]);

    public final com.paypal.oslo.core.commonui.utils.RefText getTitle() {
        return this.title;
    }

    public final com.paypal.oslo.core.commonui.utils.RefText paymentScheduledText(java.lang.String amount, java.lang.String date) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(amount, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(date, "");
        return com.paypal.oslo.core.commonui.utils.RefTextKt.stringResourceRef(com.paypal.oslo.feature.bnplservicing.R.string.feature_bnpl_servicing_payment_schedule_payment_scheduled, amount, date);
    }

    public final com.paypal.oslo.core.commonui.utils.RefText paymentDueNowText(java.lang.String amount) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(amount, "");
        return com.paypal.oslo.core.commonui.utils.RefTextKt.stringResourceRef(com.paypal.oslo.feature.bnplservicing.R.string.feature_bnpl_servicing_payment_schedule_payment_due_now, amount);
    }

    public final com.paypal.oslo.core.commonui.utils.RefText paymentDueTodayText(java.lang.String amount) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(amount, "");
        return com.paypal.oslo.core.commonui.utils.RefTextKt.stringResourceRef(com.paypal.oslo.feature.bnplservicing.R.string.feature_bnpl_servicing_payment_due_today, amount);
    }

    public final com.paypal.oslo.core.commonui.utils.RefText paymentOnDateText(java.lang.String amount, java.lang.String date) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(amount, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(date, "");
        return com.paypal.oslo.core.commonui.utils.RefTextKt.stringResourceRef(com.paypal.oslo.feature.bnplservicing.R.string.feature_bnpl_servicing_payment_schedule_payment_date, amount, date);
    }
}
