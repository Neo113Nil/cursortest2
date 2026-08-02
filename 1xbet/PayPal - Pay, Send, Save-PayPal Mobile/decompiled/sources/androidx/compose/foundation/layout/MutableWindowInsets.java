package androidx.compose.foundation.layout;

@kotlin.Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\r\u0018\u00002\u00020\u0001B\u0011\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0001¢\u0006\u0004\b\u0003\u0010\u0004J\u001f\u0010\n\u001a\u00020\t2\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\n\u0010\u000bJ\u0017\u0010\f\u001a\u00020\t2\u0006\u0010\u0006\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\f\u0010\rJ\u001f\u0010\u000e\u001a\u00020\t2\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\u000e\u0010\u000bJ\u0017\u0010\u000f\u001a\u00020\t2\u0006\u0010\u0006\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\u000f\u0010\rR+\u0010\u0016\u001a\u00020\u00012\u0006\u0010\u0010\u001a\u00020\u00018G@GX\u0086\u008e\u0002¢\u0006\u0012\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014\"\u0004\b\u0015\u0010\u0004"}, d2 = {"Landroidx/compose/foundation/layout/MutableWindowInsets;", "Landroidx/compose/foundation/layout/WindowInsets;", "initialInsets", "<init>", "(Landroidx/compose/foundation/layout/WindowInsets;)V", "Landroidx/compose/ui/unit/Density;", "density", "Landroidx/compose/ui/unit/LayoutDirection;", "layoutDirection", "", "getLeft", "(Landroidx/compose/ui/unit/Density;Landroidx/compose/ui/unit/LayoutDirection;)I", "getTop", "(Landroidx/compose/ui/unit/Density;)I", "getRight", "getBottom", "<set-?>", "insets$delegate", "Landroidx/compose/runtime/MutableState;", "getInsets", "()Landroidx/compose/foundation/layout/WindowInsets;", "setInsets", "insets"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class MutableWindowInsets implements androidx.compose.foundation.layout.WindowInsets {
    public static final int $stable = 0;

    /* renamed from: insets$delegate, reason: from kotlin metadata */
    private final androidx.compose.runtime.MutableState insets;

    public MutableWindowInsets(androidx.compose.foundation.layout.WindowInsets windowInsets) {
        this.insets = androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(windowInsets, null, 2, null);
    }

    public /* synthetic */ MutableWindowInsets(androidx.compose.foundation.layout.WindowInsets windowInsets, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? androidx.compose.foundation.layout.WindowInsetsKt.WindowInsets(0, 0, 0, 0) : windowInsets);
    }

    public final androidx.compose.foundation.layout.WindowInsets getInsets() {
        return (androidx.compose.foundation.layout.WindowInsets) this.insets.getValue();
    }

    public final void setInsets(androidx.compose.foundation.layout.WindowInsets windowInsets) {
        this.insets.setValue(windowInsets);
    }

    @Override // androidx.compose.foundation.layout.WindowInsets
    public final int getLeft(androidx.compose.ui.unit.Density density, androidx.compose.ui.unit.LayoutDirection layoutDirection) {
        return getInsets().getLeft(density, layoutDirection);
    }

    @Override // androidx.compose.foundation.layout.WindowInsets
    public final int getTop(androidx.compose.ui.unit.Density density) {
        return getInsets().getTop(density);
    }

    @Override // androidx.compose.foundation.layout.WindowInsets
    public final int getRight(androidx.compose.ui.unit.Density density, androidx.compose.ui.unit.LayoutDirection layoutDirection) {
        return getInsets().getRight(density, layoutDirection);
    }

    @Override // androidx.compose.foundation.layout.WindowInsets
    public final int getBottom(androidx.compose.ui.unit.Density density) {
        return getInsets().getBottom(density);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public MutableWindowInsets() {
        this(null, 1, 0 == true ? 1 : 0);
    }
}
