package androidx.compose.material;

@kotlin.Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\r\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\u0007\u0010\bR\u0014\u0010\t\u001a\u00020\u00028\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\t\u0010\n"}, d2 = {"Landroidx/compose/material/WindowBoundsCalculator;", "", "Landroid/view/View;", "view", "<init>", "(Landroid/view/View;)V", "Landroidx/compose/ui/unit/IntRect;", "getVisibleWindowBounds", "()Landroidx/compose/ui/unit/IntRect;", "getHighResolutionOutputSizeshNQ4ISI", "Landroid/view/View;"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class WindowBoundsCalculator {
    public static final int $stable = 8;
    private final android.view.View getHighResolutionOutputSizeshNQ4ISI;

    public WindowBoundsCalculator(android.view.View view) {
        this.getHighResolutionOutputSizeshNQ4ISI = view;
    }

    public final androidx.compose.ui.unit.IntRect getVisibleWindowBounds() {
        return androidx.compose.material.ExposedDropdownMenu_android.access$getWindowBounds(this.getHighResolutionOutputSizeshNQ4ISI);
    }
}
