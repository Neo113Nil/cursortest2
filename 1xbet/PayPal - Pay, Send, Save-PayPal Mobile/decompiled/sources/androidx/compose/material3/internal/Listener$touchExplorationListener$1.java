package androidx.compose.material3.internal;

@kotlin.Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\b\b\n\u0018\u00002\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0005\u0010\u0006R+\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u00028G@GX\u0086\u008e\u0002¢\u0006\u0012\n\u0004\b\b\u0010\t\u001a\u0004\b\n\u0010\u000b\"\u0004\b\f\u0010\u0006"}, d2 = {"Landroidx/compose/material3/internal/Listener$touchExplorationListener$1;", "Landroid/view/accessibility/AccessibilityManager$TouchExplorationStateChangeListener;", "", "enabled", "", "onTouchExplorationStateChanged", "(Z)V", "<set-?>", "enabled$delegate", "Landroidx/compose/runtime/MutableState;", "getEnabled", "()Z", "setEnabled"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class Listener$touchExplorationListener$1 implements android.view.accessibility.AccessibilityManager.TouchExplorationStateChangeListener {

    /* renamed from: enabled$delegate, reason: from kotlin metadata */
    private final androidx.compose.runtime.MutableState enabled = androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(java.lang.Boolean.FALSE, null, 2, null);

    Listener$touchExplorationListener$1() {
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final boolean getEnabled() {
        return ((java.lang.Boolean) this.enabled.getValue()).booleanValue();
    }

    public final void setEnabled(boolean z) {
        this.enabled.setValue(java.lang.Boolean.valueOf(z));
    }

    @Override // android.view.accessibility.AccessibilityManager.TouchExplorationStateChangeListener
    public final void onTouchExplorationStateChanged(boolean enabled) {
        setEnabled(enabled);
    }
}
