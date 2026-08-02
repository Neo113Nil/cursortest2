package androidx.compose.material3;

@kotlin.Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\r\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0003J\r\u0010\u0006\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0003R+\u0010\u000b\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\u00078G@CX\u0086\u008e\u0002¢\u0006\u0012\n\u0004\b\t\u0010\n\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000e"}, d2 = {"Landroidx/compose/material3/AppBarMenuState;", "", "<init>", "()V", "", "dismiss", "show", "", "<set-?>", "isExpanded$delegate", "Landroidx/compose/runtime/MutableState;", com.paypal.oslo.feature.p2p.domain.constants.P2pConstants.Log.Attributes.IS_EXPANDED, "()Z", "setExpanded", "(Z)V"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class AppBarMenuState {
    public static final int $stable = 0;

    /* renamed from: isExpanded$delegate, reason: from kotlin metadata */
    private final androidx.compose.runtime.MutableState isExpanded = androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(java.lang.Boolean.FALSE, null, 2, null);

    private final void setExpanded(boolean z) {
        this.isExpanded.setValue(java.lang.Boolean.valueOf(z));
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final boolean isExpanded() {
        return ((java.lang.Boolean) this.isExpanded.getValue()).booleanValue();
    }

    public final void dismiss() {
        setExpanded(false);
    }

    public final void show() {
        setExpanded(true);
    }
}
