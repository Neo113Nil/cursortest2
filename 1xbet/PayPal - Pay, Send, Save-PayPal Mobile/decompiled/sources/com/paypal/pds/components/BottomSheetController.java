package com.paypal.pds.components;

@kotlin.Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\b\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\r\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0003J\r\u0010\u0006\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0003R+\u0010\u000f\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\u00078G@AX\u0086\u008e\u0002¢\u0006\u0012\n\u0004\b\t\u0010\n\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000e"}, d2 = {"Lcom/paypal/pds/components/BottomSheetController;", "", "<init>", "()V", "", "showSheet", "hideSheet", "", "<set-?>", "visible$delegate", "Landroidx/compose/runtime/MutableState;", "getVisible", "()Z", "setVisible$pds_release", "(Z)V", "visible"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class BottomSheetController {
    public static final int $stable = 0;

    /* renamed from: visible$delegate, reason: from kotlin metadata */
    private final androidx.compose.runtime.MutableState visible = androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(java.lang.Boolean.FALSE, null, 2, null);

    /* JADX WARN: Multi-variable type inference failed */
    public final boolean getVisible() {
        return ((java.lang.Boolean) this.visible.getValue()).booleanValue();
    }

    public final void setVisible$pds_release(boolean z) {
        this.visible.setValue(java.lang.Boolean.valueOf(z));
    }

    public final void showSheet() {
        setVisible$pds_release(true);
    }

    public final void hideSheet() {
        setVisible$pds_release(false);
    }
}
