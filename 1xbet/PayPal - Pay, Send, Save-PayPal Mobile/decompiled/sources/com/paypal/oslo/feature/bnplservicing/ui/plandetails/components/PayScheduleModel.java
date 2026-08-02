package com.paypal.oslo.feature.bnplservicing.ui.plandetails.components;

@kotlin.Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u000b\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0007\b\u0086\b\u0018\u00002\u00020\u0001B)\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\n\u0010\u000bJ\u0012\u0010\f\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\f\u0010\u000bJ\u0016\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005HÆ\u0003¢\u0006\u0004\b\r\u0010\u000eJ6\u0010\u000f\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00022\u000e\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005HÆ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u001a\u0010\u0013\u001a\u00020\u00122\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0016\u001a\u00020\u0015HÖ\u0001¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0019\u001a\u00020\u0018HÖ\u0001¢\u0006\u0004\b\u0019\u0010\u001aR\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u001b\u001a\u0004\b\u001c\u0010\u000bR\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u001b\u001a\u0004\b\u001d\u0010\u000bR \u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00058\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u001e\u001a\u0004\b\u001f\u0010\u000e"}, d2 = {"Lcom/paypal/oslo/feature/bnplservicing/ui/plandetails/components/PayScheduleModel;", "", "Lcom/paypal/oslo/core/commonui/utils/RefText;", "title", "subtitle", "Lkotlin/Function0;", "", "onPayScheduleClick", "<init>", "(Lcom/paypal/oslo/core/commonui/utils/RefText;Lcom/paypal/oslo/core/commonui/utils/RefText;Lkotlin/jvm/functions/Function0;)V", "component1", "()Lcom/paypal/oslo/core/commonui/utils/RefText;", "component2", "component3", "()Lkotlin/jvm/functions/Function0;", "copy", "(Lcom/paypal/oslo/core/commonui/utils/RefText;Lcom/paypal/oslo/core/commonui/utils/RefText;Lkotlin/jvm/functions/Function0;)Lcom/paypal/oslo/feature/bnplservicing/ui/plandetails/components/PayScheduleModel;", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "Lcom/paypal/oslo/core/commonui/utils/RefText;", "getTitle", "getSubtitle", "Lkotlin/jvm/functions/Function0;", "getOnPayScheduleClick"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes11.dex */
public final /* data */ class PayScheduleModel {
    public static final int $stable;
    private final kotlin.jvm.functions.Function0<kotlin.Unit> onPayScheduleClick;
    private final com.paypal.oslo.core.commonui.utils.RefText subtitle;
    private final com.paypal.oslo.core.commonui.utils.RefText title;

    public PayScheduleModel(com.paypal.oslo.core.commonui.utils.RefText refText, com.paypal.oslo.core.commonui.utils.RefText refText2, kotlin.jvm.functions.Function0<kotlin.Unit> function0) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(refText, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(function0, "");
        this.title = refText;
        this.subtitle = refText2;
        this.onPayScheduleClick = function0;
    }

    public /* synthetic */ PayScheduleModel(com.paypal.oslo.core.commonui.utils.RefText refText, com.paypal.oslo.core.commonui.utils.RefText refText2, kotlin.jvm.functions.Function0 function0, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this(refText, (i & 2) != 0 ? null : refText2, function0);
    }

    public final com.paypal.oslo.core.commonui.utils.RefText getTitle() {
        return this.title;
    }

    public final com.paypal.oslo.core.commonui.utils.RefText getSubtitle() {
        return this.subtitle;
    }

    public final kotlin.jvm.functions.Function0<kotlin.Unit> getOnPayScheduleClick() {
        return this.onPayScheduleClick;
    }

    public final java.lang.String toString() {
        com.paypal.oslo.core.commonui.utils.RefText refText = this.title;
        com.paypal.oslo.core.commonui.utils.RefText refText2 = this.subtitle;
        kotlin.jvm.functions.Function0<kotlin.Unit> function0 = this.onPayScheduleClick;
        java.lang.StringBuilder sb = new java.lang.StringBuilder("PayScheduleModel(title=");
        sb.append(refText);
        sb.append(", subtitle=");
        sb.append(refText2);
        sb.append(", onPayScheduleClick=");
        sb.append(function0);
        sb.append(")");
        return sb.toString();
    }

    public final int hashCode() {
        int hashCode = this.title.hashCode();
        com.paypal.oslo.core.commonui.utils.RefText refText = this.subtitle;
        return (((hashCode * 31) + (refText == null ? 0 : refText.hashCode())) * 31) + this.onPayScheduleClick.hashCode();
    }

    public final boolean equals(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof com.paypal.oslo.feature.bnplservicing.ui.plandetails.components.PayScheduleModel)) {
            return false;
        }
        com.paypal.oslo.feature.bnplservicing.ui.plandetails.components.PayScheduleModel payScheduleModel = (com.paypal.oslo.feature.bnplservicing.ui.plandetails.components.PayScheduleModel) other;
        return kotlin.jvm.internal.Intrinsics.areEqual(this.title, payScheduleModel.title) && kotlin.jvm.internal.Intrinsics.areEqual(this.subtitle, payScheduleModel.subtitle) && kotlin.jvm.internal.Intrinsics.areEqual(this.onPayScheduleClick, payScheduleModel.onPayScheduleClick);
    }

    public final com.paypal.oslo.feature.bnplservicing.ui.plandetails.components.PayScheduleModel copy(com.paypal.oslo.core.commonui.utils.RefText title, com.paypal.oslo.core.commonui.utils.RefText subtitle, kotlin.jvm.functions.Function0<kotlin.Unit> onPayScheduleClick) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(title, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(onPayScheduleClick, "");
        return new com.paypal.oslo.feature.bnplservicing.ui.plandetails.components.PayScheduleModel(title, subtitle, onPayScheduleClick);
    }

    public final kotlin.jvm.functions.Function0<kotlin.Unit> component3() {
        return this.onPayScheduleClick;
    }

    /* renamed from: component2, reason: from getter */
    public final com.paypal.oslo.core.commonui.utils.RefText getSubtitle() {
        return this.subtitle;
    }

    /* renamed from: component1, reason: from getter */
    public final com.paypal.oslo.core.commonui.utils.RefText getTitle() {
        return this.title;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ com.paypal.oslo.feature.bnplservicing.ui.plandetails.components.PayScheduleModel copy$default(com.paypal.oslo.feature.bnplservicing.ui.plandetails.components.PayScheduleModel payScheduleModel, com.paypal.oslo.core.commonui.utils.RefText refText, com.paypal.oslo.core.commonui.utils.RefText refText2, kotlin.jvm.functions.Function0 function0, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            refText = payScheduleModel.title;
        }
        if ((i & 2) != 0) {
            refText2 = payScheduleModel.subtitle;
        }
        if ((i & 4) != 0) {
            function0 = payScheduleModel.onPayScheduleClick;
        }
        return payScheduleModel.copy(refText, refText2, function0);
    }

    static {
        int i = com.paypal.oslo.core.commonui.utils.RefText.$stable;
        $stable = i | i;
    }
}
