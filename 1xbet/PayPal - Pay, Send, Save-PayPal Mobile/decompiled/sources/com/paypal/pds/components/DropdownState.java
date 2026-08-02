package com.paypal.pds.components;

@kotlin.Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0086\b\u0018\u00002\u00020\u0001B\u0011\b\u0000\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÀ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\f\u001a\u00020\u000b2\b\u0010\n\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000f\u001a\u00020\u000eHÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0012\u001a\u00020\u0011HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0013R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0014\u001a\u0004\b\u0015\u0010\u0007R<\u0010 \u001a\r\u0012\u0004\u0012\u00020\u00170\u0016¢\u0006\u0002\b\u00192\f\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00170\u00168A@AX\u0081\u008e\u0002¢\u0006\u0012\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u001c\u0010\u001d\"\u0004\b\u001e\u0010\u001f"}, d2 = {"Lcom/paypal/pds/components/DropdownState;", "", "Lcom/paypal/pds/components/BottomSheetController;", "bottomSheetController", "<init>", "(Lcom/paypal/pds/components/BottomSheetController;)V", "component1", "()Lcom/paypal/pds/components/BottomSheetController;", "copy$pds_release", "(Lcom/paypal/pds/components/BottomSheetController;)Lcom/paypal/pds/components/DropdownState;", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "Lcom/paypal/pds/components/BottomSheetController;", "getBottomSheetController", "Lkotlin/Function0;", "", "<set-?>", "Landroidx/compose/runtime/Composable;", "menu$delegate", "Landroidx/compose/runtime/MutableState;", "getMenu$pds_release", "()Lkotlin/jvm/functions/Function2;", "setMenu$pds_release", "(Lkotlin/jvm/functions/Function2;)V", "menu"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class DropdownState {
    public static final int $stable = 0;
    private final com.paypal.pds.components.BottomSheetController bottomSheetController;

    /* renamed from: menu$delegate, reason: from kotlin metadata */
    private final androidx.compose.runtime.MutableState menu;

    public DropdownState(com.paypal.pds.components.BottomSheetController bottomSheetController) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(bottomSheetController, "");
        this.bottomSheetController = bottomSheetController;
        this.menu = androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(com.paypal.pds.components.ComposableSingletons$DropdownKt.INSTANCE.m21799getLambda$364317943$pds_release(), null, 2, null);
    }

    public final com.paypal.pds.components.BottomSheetController getBottomSheetController() {
        return this.bottomSheetController;
    }

    public final kotlin.jvm.functions.Function2<androidx.compose.runtime.Composer, java.lang.Integer, kotlin.Unit> getMenu$pds_release() {
        return (kotlin.jvm.functions.Function2) this.menu.getValue();
    }

    public final void setMenu$pds_release(kotlin.jvm.functions.Function2<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit> function2) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(function2, "");
        this.menu.setValue(function2);
    }

    public final java.lang.String toString() {
        com.paypal.pds.components.BottomSheetController bottomSheetController = this.bottomSheetController;
        java.lang.StringBuilder sb = new java.lang.StringBuilder("DropdownState(bottomSheetController=");
        sb.append(bottomSheetController);
        sb.append(")");
        return sb.toString();
    }

    public final int hashCode() {
        return this.bottomSheetController.hashCode();
    }

    public final boolean equals(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof com.paypal.pds.components.DropdownState) && kotlin.jvm.internal.Intrinsics.areEqual(this.bottomSheetController, ((com.paypal.pds.components.DropdownState) other).bottomSheetController);
    }

    public final com.paypal.pds.components.DropdownState copy$pds_release(com.paypal.pds.components.BottomSheetController bottomSheetController) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(bottomSheetController, "");
        return new com.paypal.pds.components.DropdownState(bottomSheetController);
    }

    /* renamed from: component1, reason: from getter */
    public final com.paypal.pds.components.BottomSheetController getBottomSheetController() {
        return this.bottomSheetController;
    }

    public static /* synthetic */ com.paypal.pds.components.DropdownState copy$pds_release$default(com.paypal.pds.components.DropdownState dropdownState, com.paypal.pds.components.BottomSheetController bottomSheetController, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            bottomSheetController = dropdownState.bottomSheetController;
        }
        return dropdownState.copy$pds_release(bottomSheetController);
    }
}
