package com.paypal.oslo.core.navigation.scene;

@kotlin.Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u000f\n\u0002\u0010\u000b\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\t\b\u0000¢\u0006\u0004\b\u0002\u0010\u0003J!\u0010\t\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\t\u0010\nJ\r\u0010\u000b\u001a\u00020\b¢\u0006\u0004\b\u000b\u0010\u0003R+\u0010\u0005\u001a\u00020\u00042\u0006\u0010\f\u001a\u00020\u00048G@CX\u0086\u008e\u0002¢\u0006\u0012\n\u0004\b\r\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010\"\u0004\b\u0011\u0010\u0012R/\u0010\u0007\u001a\u0004\u0018\u00010\u00062\b\u0010\f\u001a\u0004\u0018\u00010\u00068G@CX\u0087\u008e\u0002¢\u0006\u0012\n\u0004\b\u0013\u0010\u000e\u001a\u0004\b\u0014\u0010\u0015\"\u0004\b\u0016\u0010\u0017R+\u0010\u001a\u001a\u00020\u00182\u0006\u0010\f\u001a\u00020\u00188G@CX\u0087\u008e\u0002¢\u0006\u0012\n\u0004\b\u0019\u0010\u000e\u001a\u0004\b\u001a\u0010\u001b\"\u0004\b\u001c\u0010\u001d"}, d2 = {"Lcom/paypal/oslo/core/navigation/scene/BottomSheetToastState;", "", "<init>", "()V", "", "message", "Lcom/paypal/pds/core/Icon;", "leadingIcon", "", "show", "(Ljava/lang/String;Lcom/paypal/pds/core/Icon;)V", "dismiss", "<set-?>", "message$delegate", "Landroidx/compose/runtime/MutableState;", "getMessage", "()Ljava/lang/String;", "setMessage", "(Ljava/lang/String;)V", "leadingIcon$delegate", "getLeadingIcon", "()Lcom/paypal/pds/core/Icon;", "setLeadingIcon", "(Lcom/paypal/pds/core/Icon;)V", "", "isVisible$delegate", "isVisible", "()Z", "setVisible", "(Z)V"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class BottomSheetToastState {
    public static final int $stable = 0;

    /* renamed from: message$delegate, reason: from kotlin metadata */
    private final androidx.compose.runtime.MutableState message = androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt.mutableStateOf$default("", null, 2, null);

    /* renamed from: leadingIcon$delegate, reason: from kotlin metadata */
    private final androidx.compose.runtime.MutableState leadingIcon = androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(null, null, 2, null);

    /* renamed from: isVisible$delegate, reason: from kotlin metadata */
    private final androidx.compose.runtime.MutableState isVisible = androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(java.lang.Boolean.FALSE, null, 2, null);

    private final void setMessage(java.lang.String str) {
        this.message.setValue(str);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final java.lang.String getMessage() {
        return (java.lang.String) this.message.getValue();
    }

    private final void setLeadingIcon(com.paypal.pds.core.Icon icon) {
        this.leadingIcon.setValue(icon);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final com.paypal.pds.core.Icon getLeadingIcon() {
        return (com.paypal.pds.core.Icon) this.leadingIcon.getValue();
    }

    private final void setVisible(boolean z) {
        this.isVisible.setValue(java.lang.Boolean.valueOf(z));
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final boolean isVisible() {
        return ((java.lang.Boolean) this.isVisible.getValue()).booleanValue();
    }

    public static /* synthetic */ void show$default(com.paypal.oslo.core.navigation.scene.BottomSheetToastState bottomSheetToastState, java.lang.String str, com.paypal.pds.core.Icon icon, int i, java.lang.Object obj) {
        if ((i & 2) != 0) {
            icon = null;
        }
        bottomSheetToastState.show(str, icon);
    }

    public final void show(java.lang.String message, com.paypal.pds.core.Icon leadingIcon) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(message, "");
        setMessage(message);
        setLeadingIcon(leadingIcon);
        setVisible(true);
    }

    public final void dismiss() {
        setVisible(false);
    }
}
