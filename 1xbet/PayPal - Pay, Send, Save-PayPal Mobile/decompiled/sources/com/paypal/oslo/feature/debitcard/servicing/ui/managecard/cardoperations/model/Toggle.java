package com.paypal.oslo.feature.debitcard.servicing.ui.managecard.cardoperations.model;

@kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\f\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0080\b\u0018\u00002\u00020\u0001B#\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0012\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\t\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\t\u0010\nJ\u001c\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0003¢\u0006\u0004\b\u000b\u0010\fJ0\u0010\r\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\u0014\b\u0002\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u001a\u0010\u0010\u001a\u00020\u00022\b\u0010\u000f\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0016\u001a\u00020\u0015HÖ\u0001¢\u0006\u0004\b\u0016\u0010\u0017R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0018\u001a\u0004\b\u0003\u0010\nR&\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00050\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u0019\u001a\u0004\b\u001a\u0010\f"}, d2 = {"Lcom/paypal/oslo/feature/debitcard/servicing/ui/managecard/cardoperations/model/Toggle;", "", "", "isChecked", "Lkotlin/Function1;", "", "onCheckedChange", "<init>", "(ZLkotlin/jvm/functions/Function1;)V", "component1", "()Z", "component2", "()Lkotlin/jvm/functions/Function1;", "copy", "(ZLkotlin/jvm/functions/Function1;)Lcom/paypal/oslo/feature/debitcard/servicing/ui/managecard/cardoperations/model/Toggle;", "other", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "Z", "Lkotlin/jvm/functions/Function1;", "getOnCheckedChange"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes12.dex */
public final /* data */ class Toggle {
    public static final int $stable = 0;
    private final boolean isChecked;
    private final kotlin.jvm.functions.Function1<java.lang.Boolean, kotlin.Unit> onCheckedChange;

    /* JADX WARN: Multi-variable type inference failed */
    public Toggle(boolean z, kotlin.jvm.functions.Function1<? super java.lang.Boolean, kotlin.Unit> function1) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(function1, "");
        this.isChecked = z;
        this.onCheckedChange = function1;
    }

    public final boolean isChecked() {
        return this.isChecked;
    }

    public final kotlin.jvm.functions.Function1<java.lang.Boolean, kotlin.Unit> getOnCheckedChange() {
        return this.onCheckedChange;
    }

    public final java.lang.String toString() {
        boolean z = this.isChecked;
        kotlin.jvm.functions.Function1<java.lang.Boolean, kotlin.Unit> function1 = this.onCheckedChange;
        java.lang.StringBuilder sb = new java.lang.StringBuilder("Toggle(isChecked=");
        sb.append(z);
        sb.append(", onCheckedChange=");
        sb.append(function1);
        sb.append(")");
        return sb.toString();
    }

    public final int hashCode() {
        return (java.lang.Boolean.hashCode(this.isChecked) * 31) + this.onCheckedChange.hashCode();
    }

    public final boolean equals(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof com.paypal.oslo.feature.debitcard.servicing.ui.managecard.cardoperations.model.Toggle)) {
            return false;
        }
        com.paypal.oslo.feature.debitcard.servicing.ui.managecard.cardoperations.model.Toggle toggle = (com.paypal.oslo.feature.debitcard.servicing.ui.managecard.cardoperations.model.Toggle) other;
        return this.isChecked == toggle.isChecked && kotlin.jvm.internal.Intrinsics.areEqual(this.onCheckedChange, toggle.onCheckedChange);
    }

    public final com.paypal.oslo.feature.debitcard.servicing.ui.managecard.cardoperations.model.Toggle copy(boolean isChecked, kotlin.jvm.functions.Function1<? super java.lang.Boolean, kotlin.Unit> onCheckedChange) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(onCheckedChange, "");
        return new com.paypal.oslo.feature.debitcard.servicing.ui.managecard.cardoperations.model.Toggle(isChecked, onCheckedChange);
    }

    public final kotlin.jvm.functions.Function1<java.lang.Boolean, kotlin.Unit> component2() {
        return this.onCheckedChange;
    }

    /* renamed from: component1, reason: from getter */
    public final boolean getIsChecked() {
        return this.isChecked;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ com.paypal.oslo.feature.debitcard.servicing.ui.managecard.cardoperations.model.Toggle copy$default(com.paypal.oslo.feature.debitcard.servicing.ui.managecard.cardoperations.model.Toggle toggle, boolean z, kotlin.jvm.functions.Function1 function1, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            z = toggle.isChecked;
        }
        if ((i & 2) != 0) {
            function1 = toggle.onCheckedChange;
        }
        return toggle.copy(z, function1);
    }
}
