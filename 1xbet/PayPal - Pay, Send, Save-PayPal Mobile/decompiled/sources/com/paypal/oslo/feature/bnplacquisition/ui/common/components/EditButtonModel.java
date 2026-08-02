package com.paypal.oslo.feature.bnplacquisition.ui.common.components;

@kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0007\b\u0086\b\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\t\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\t\u0010\nJ\u0016\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0003¢\u0006\u0004\b\u000b\u0010\fJ*\u0010\r\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u001a\u0010\u0011\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0014\u001a\u00020\u0013HÖ\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0016\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0016\u0010\nR\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0017\u001a\u0004\b\u0018\u0010\nR \u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u0019\u001a\u0004\b\u001a\u0010\f"}, d2 = {"Lcom/paypal/oslo/feature/bnplacquisition/ui/common/components/EditButtonModel;", "", "", "label", "Lkotlin/Function0;", "", "onClick", "<init>", "(Ljava/lang/String;Lkotlin/jvm/functions/Function0;)V", "component1", "()Ljava/lang/String;", "component2", "()Lkotlin/jvm/functions/Function0;", "copy", "(Ljava/lang/String;Lkotlin/jvm/functions/Function0;)Lcom/paypal/oslo/feature/bnplacquisition/ui/common/components/EditButtonModel;", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Ljava/lang/String;", "getLabel", "Lkotlin/jvm/functions/Function0;", "getOnClick"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes11.dex */
public final /* data */ class EditButtonModel {
    public static final int $stable = 0;
    private final java.lang.String label;
    private final kotlin.jvm.functions.Function0<kotlin.Unit> onClick;

    public EditButtonModel(java.lang.String str, kotlin.jvm.functions.Function0<kotlin.Unit> function0) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(function0, "");
        this.label = str;
        this.onClick = function0;
    }

    public final java.lang.String getLabel() {
        return this.label;
    }

    public final kotlin.jvm.functions.Function0<kotlin.Unit> getOnClick() {
        return this.onClick;
    }

    public final java.lang.String toString() {
        java.lang.String str = this.label;
        kotlin.jvm.functions.Function0<kotlin.Unit> function0 = this.onClick;
        java.lang.StringBuilder sb = new java.lang.StringBuilder("EditButtonModel(label=");
        sb.append(str);
        sb.append(", onClick=");
        sb.append(function0);
        sb.append(")");
        return sb.toString();
    }

    public final int hashCode() {
        return (this.label.hashCode() * 31) + this.onClick.hashCode();
    }

    public final boolean equals(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof com.paypal.oslo.feature.bnplacquisition.ui.common.components.EditButtonModel)) {
            return false;
        }
        com.paypal.oslo.feature.bnplacquisition.ui.common.components.EditButtonModel editButtonModel = (com.paypal.oslo.feature.bnplacquisition.ui.common.components.EditButtonModel) other;
        return kotlin.jvm.internal.Intrinsics.areEqual(this.label, editButtonModel.label) && kotlin.jvm.internal.Intrinsics.areEqual(this.onClick, editButtonModel.onClick);
    }

    public final com.paypal.oslo.feature.bnplacquisition.ui.common.components.EditButtonModel copy(java.lang.String label, kotlin.jvm.functions.Function0<kotlin.Unit> onClick) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(label, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(onClick, "");
        return new com.paypal.oslo.feature.bnplacquisition.ui.common.components.EditButtonModel(label, onClick);
    }

    public final kotlin.jvm.functions.Function0<kotlin.Unit> component2() {
        return this.onClick;
    }

    /* renamed from: component1, reason: from getter */
    public final java.lang.String getLabel() {
        return this.label;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ com.paypal.oslo.feature.bnplacquisition.ui.common.components.EditButtonModel copy$default(com.paypal.oslo.feature.bnplacquisition.ui.common.components.EditButtonModel editButtonModel, java.lang.String str, kotlin.jvm.functions.Function0 function0, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            str = editButtonModel.label;
        }
        if ((i & 2) != 0) {
            function0 = editButtonModel.onClick;
        }
        return editButtonModel.copy(str, function0);
    }
}
