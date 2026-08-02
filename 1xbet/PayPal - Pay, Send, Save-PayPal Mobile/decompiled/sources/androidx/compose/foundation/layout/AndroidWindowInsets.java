package androidx.compose.foundation.layout;

@kotlin.Metadata(d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0001\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\u0018\u0010\u001b\u001a\u00020\u00032\u0006\u0010\u001c\u001a\u00020\u001d2\u0006\u0010\u001e\u001a\u00020\u001fH\u0016J\u0010\u0010 \u001a\u00020\u00032\u0006\u0010\u001c\u001a\u00020\u001dH\u0016J\u0018\u0010!\u001a\u00020\u00032\u0006\u0010\u001c\u001a\u00020\u001d2\u0006\u0010\u001e\u001a\u00020\u001fH\u0016J\u0010\u0010\"\u001a\u00020\u00032\u0006\u0010\u001c\u001a\u00020\u001dH\u0016J\u001d\u0010#\u001a\u00020$2\u0006\u0010%\u001a\u00020&2\u0006\u0010'\u001a\u00020\u0003H\u0000¢\u0006\u0002\b(J\u0013\u0010)\u001a\u00020\u00152\b\u0010*\u001a\u0004\u0018\u00010+H\u0096\u0002J\b\u0010,\u001a\u00020\u0003H\u0016J\b\u0010-\u001a\u00020\u0005H\u0016R\u0014\u0010\u0002\u001a\u00020\u0003X\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R:\u0010\u000e\u001a\u00070\u000b¢\u0006\u0002\b\f2\u0010\u0010\n\u001a\f0\u000b¢\u0006\u0002\b\f¢\u0006\u0002\b\r8@@@X\u0080\u008e\u0002¢\u0006\u0012\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u000f\u0010\u0010\"\u0004\b\u0011\u0010\u0012R+\u0010\u0016\u001a\u00020\u00152\u0006\u0010\n\u001a\u00020\u00158F@FX\u0086\u008e\u0002¢\u0006\u0012\n\u0004\b\u001a\u0010\u0014\u001a\u0004\b\u0016\u0010\u0017\"\u0004\b\u0018\u0010\u0019¨\u0006."}, d2 = {"Landroidx/compose/foundation/layout/AndroidWindowInsets;", "Landroidx/compose/foundation/layout/WindowInsets;", "type", "", "name", "", "<init>", "(ILjava/lang/String;)V", "getType$foundation_layout", "()I", "<set-?>", "Landroidx/core/graphics/Insets;", "Lorg/jspecify/annotations/NonNull;", "Lkotlin/jvm/internal/EnhancedNullability;", "insets", "getInsets$foundation_layout", "()Landroidx/core/graphics/Insets;", "setInsets$foundation_layout", "(Landroidx/core/graphics/Insets;)V", "insets$delegate", "Landroidx/compose/runtime/MutableState;", "", "isVisible", "()Z", "setVisible", "(Z)V", "isVisible$delegate", "getLeft", "density", "Landroidx/compose/ui/unit/Density;", "layoutDirection", "Landroidx/compose/ui/unit/LayoutDirection;", "getTop", "getRight", "getBottom", "update", "", "windowInsetsCompat", "Landroidx/core/view/WindowInsetsCompat;", "typeMask", "update$foundation_layout", "equals", "other", "", "hashCode", "toString", "foundation-layout"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes.dex */
public final class AndroidWindowInsets implements androidx.compose.foundation.layout.WindowInsets {
    public static final int $stable = 0;
    private final java.lang.String getHighResolutionOutputSizeshNQ4ISI;
    private final int getHighSpeedVideoFpsRangesFor;
    private final androidx.compose.runtime.MutableState getHighSpeedVideoFpsRanges = androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(androidx.core.graphics.Insets.NONE, null, 2, null);
    private final androidx.compose.runtime.MutableState Camera2StreamConfigurationMap = androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(java.lang.Boolean.TRUE, null, 2, null);

    public AndroidWindowInsets(int i, java.lang.String str) {
        this.getHighSpeedVideoFpsRangesFor = i;
        this.getHighResolutionOutputSizeshNQ4ISI = str;
    }

    /* renamed from: getType$foundation_layout, reason: from getter */
    public final int getGetHighSpeedVideoFpsRangesFor() {
        return this.getHighSpeedVideoFpsRangesFor;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final androidx.core.graphics.Insets getInsets$foundation_layout() {
        return (androidx.core.graphics.Insets) this.getHighSpeedVideoFpsRanges.getValue();
    }

    public final void setInsets$foundation_layout(androidx.core.graphics.Insets insets) {
        this.getHighSpeedVideoFpsRanges.setValue(insets);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final boolean isVisible() {
        return ((java.lang.Boolean) this.Camera2StreamConfigurationMap.getValue()).booleanValue();
    }

    public final void setVisible(boolean z) {
        this.Camera2StreamConfigurationMap.setValue(java.lang.Boolean.valueOf(z));
    }

    @Override // androidx.compose.foundation.layout.WindowInsets
    public final int getLeft(androidx.compose.ui.unit.Density density, androidx.compose.ui.unit.LayoutDirection layoutDirection) {
        return getInsets$foundation_layout().left;
    }

    @Override // androidx.compose.foundation.layout.WindowInsets
    public final int getTop(androidx.compose.ui.unit.Density density) {
        return getInsets$foundation_layout().top;
    }

    @Override // androidx.compose.foundation.layout.WindowInsets
    public final int getRight(androidx.compose.ui.unit.Density density, androidx.compose.ui.unit.LayoutDirection layoutDirection) {
        return getInsets$foundation_layout().right;
    }

    @Override // androidx.compose.foundation.layout.WindowInsets
    public final int getBottom(androidx.compose.ui.unit.Density density) {
        return getInsets$foundation_layout().bottom;
    }

    public final void update$foundation_layout(androidx.core.view.WindowInsetsCompat windowInsetsCompat, int typeMask) {
        if (typeMask == 0 || (typeMask & this.getHighSpeedVideoFpsRangesFor) != 0) {
            setInsets$foundation_layout(windowInsetsCompat.getInsets(this.getHighSpeedVideoFpsRangesFor));
            setVisible(windowInsetsCompat.isVisible(this.getHighSpeedVideoFpsRangesFor));
        }
    }

    public final boolean equals(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof androidx.compose.foundation.layout.AndroidWindowInsets) && this.getHighSpeedVideoFpsRangesFor == ((androidx.compose.foundation.layout.AndroidWindowInsets) other).getHighSpeedVideoFpsRangesFor;
    }

    public final int hashCode() {
        return this.getHighSpeedVideoFpsRangesFor;
    }

    public final java.lang.String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append(this.getHighResolutionOutputSizeshNQ4ISI);
        sb.append('(');
        sb.append(getInsets$foundation_layout().left);
        sb.append(", ");
        sb.append(getInsets$foundation_layout().top);
        sb.append(", ");
        sb.append(getInsets$foundation_layout().right);
        sb.append(", ");
        sb.append(getInsets$foundation_layout().bottom);
        sb.append(')');
        return sb.toString();
    }
}
