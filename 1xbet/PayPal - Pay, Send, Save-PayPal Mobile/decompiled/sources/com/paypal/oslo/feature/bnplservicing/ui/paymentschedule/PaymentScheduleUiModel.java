package com.paypal.oslo.feature.bnplservicing.ui.paymentschedule;

@kotlin.Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0086\b\u0018\u00002\u00020\u0001B!\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\t\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\t\u0010\nJ\u0016\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0003¢\u0006\u0004\b\u000b\u0010\fJ*\u0010\r\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u001a\u0010\u0011\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0014\u001a\u00020\u0013HÖ\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0017\u001a\u00020\u0016HÖ\u0001¢\u0006\u0004\b\u0017\u0010\u0018R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0019\u001a\u0004\b\u001a\u0010\nR \u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u001b\u001a\u0004\b\u001c\u0010\f"}, d2 = {"Lcom/paypal/oslo/feature/bnplservicing/ui/paymentschedule/PaymentScheduleUiModel;", "", "Lcom/paypal/oslo/core/commonui/utils/RefText;", "title", "", "Lcom/paypal/oslo/feature/bnplservicing/ui/paymentschedule/ScheduleItemUiModel;", "scheduleItems", "<init>", "(Lcom/paypal/oslo/core/commonui/utils/RefText;Ljava/util/List;)V", "component1", "()Lcom/paypal/oslo/core/commonui/utils/RefText;", "component2", "()Ljava/util/List;", "copy", "(Lcom/paypal/oslo/core/commonui/utils/RefText;Ljava/util/List;)Lcom/paypal/oslo/feature/bnplservicing/ui/paymentschedule/PaymentScheduleUiModel;", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "Lcom/paypal/oslo/core/commonui/utils/RefText;", "getTitle", "Ljava/util/List;", "getScheduleItems"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes11.dex */
public final /* data */ class PaymentScheduleUiModel {
    public static final int $stable = 8;
    private final java.util.List<com.paypal.oslo.feature.bnplservicing.ui.paymentschedule.ScheduleItemUiModel> scheduleItems;
    private final com.paypal.oslo.core.commonui.utils.RefText title;

    public PaymentScheduleUiModel(com.paypal.oslo.core.commonui.utils.RefText refText, java.util.List<com.paypal.oslo.feature.bnplservicing.ui.paymentschedule.ScheduleItemUiModel> list) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(refText, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(list, "");
        this.title = refText;
        this.scheduleItems = list;
    }

    public /* synthetic */ PaymentScheduleUiModel(com.paypal.oslo.core.commonui.utils.RefText refText, java.util.List list, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? com.paypal.oslo.core.commonui.utils.RefTextKt.stringResourceRef(com.paypal.oslo.feature.bnplservicing.R.string.feature_bnpl_servicing_payment_schedule_title, new java.lang.Object[0]) : refText, (i & 2) != 0 ? kotlin.collections.CollectionsKt.emptyList() : list);
    }

    public final com.paypal.oslo.core.commonui.utils.RefText getTitle() {
        return this.title;
    }

    public final java.util.List<com.paypal.oslo.feature.bnplservicing.ui.paymentschedule.ScheduleItemUiModel> getScheduleItems() {
        return this.scheduleItems;
    }

    public final java.lang.String toString() {
        com.paypal.oslo.core.commonui.utils.RefText refText = this.title;
        java.util.List<com.paypal.oslo.feature.bnplservicing.ui.paymentschedule.ScheduleItemUiModel> list = this.scheduleItems;
        java.lang.StringBuilder sb = new java.lang.StringBuilder("PaymentScheduleUiModel(title=");
        sb.append(refText);
        sb.append(", scheduleItems=");
        sb.append(list);
        sb.append(")");
        return sb.toString();
    }

    public final int hashCode() {
        return (this.title.hashCode() * 31) + this.scheduleItems.hashCode();
    }

    public final boolean equals(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof com.paypal.oslo.feature.bnplservicing.ui.paymentschedule.PaymentScheduleUiModel)) {
            return false;
        }
        com.paypal.oslo.feature.bnplservicing.ui.paymentschedule.PaymentScheduleUiModel paymentScheduleUiModel = (com.paypal.oslo.feature.bnplservicing.ui.paymentschedule.PaymentScheduleUiModel) other;
        return kotlin.jvm.internal.Intrinsics.areEqual(this.title, paymentScheduleUiModel.title) && kotlin.jvm.internal.Intrinsics.areEqual(this.scheduleItems, paymentScheduleUiModel.scheduleItems);
    }

    public final com.paypal.oslo.feature.bnplservicing.ui.paymentschedule.PaymentScheduleUiModel copy(com.paypal.oslo.core.commonui.utils.RefText title, java.util.List<com.paypal.oslo.feature.bnplservicing.ui.paymentschedule.ScheduleItemUiModel> scheduleItems) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(title, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(scheduleItems, "");
        return new com.paypal.oslo.feature.bnplservicing.ui.paymentschedule.PaymentScheduleUiModel(title, scheduleItems);
    }

    public final java.util.List<com.paypal.oslo.feature.bnplservicing.ui.paymentschedule.ScheduleItemUiModel> component2() {
        return this.scheduleItems;
    }

    /* renamed from: component1, reason: from getter */
    public final com.paypal.oslo.core.commonui.utils.RefText getTitle() {
        return this.title;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ com.paypal.oslo.feature.bnplservicing.ui.paymentschedule.PaymentScheduleUiModel copy$default(com.paypal.oslo.feature.bnplservicing.ui.paymentschedule.PaymentScheduleUiModel paymentScheduleUiModel, com.paypal.oslo.core.commonui.utils.RefText refText, java.util.List list, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            refText = paymentScheduleUiModel.title;
        }
        if ((i & 2) != 0) {
            list = paymentScheduleUiModel.scheduleItems;
        }
        return paymentScheduleUiModel.copy(refText, list);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public PaymentScheduleUiModel() {
        this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
    }
}
