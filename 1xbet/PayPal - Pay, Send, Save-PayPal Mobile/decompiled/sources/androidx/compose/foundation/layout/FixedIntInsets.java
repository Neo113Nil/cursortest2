package androidx.compose.foundation.layout;

@kotlin.Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0002\b\n\b\u0002\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u001f\u0010\u000b\u001a\u00020\u00022\u0006\u0010\u0003\u001a\u00020\t2\u0006\u0010\u0004\u001a\u00020\nH\u0016¢\u0006\u0004\b\u000b\u0010\fJ\u0017\u0010\r\u001a\u00020\u00022\u0006\u0010\u0003\u001a\u00020\tH\u0016¢\u0006\u0004\b\r\u0010\u000eJ\u001f\u0010\u000f\u001a\u00020\u00022\u0006\u0010\u0003\u001a\u00020\t2\u0006\u0010\u0004\u001a\u00020\nH\u0016¢\u0006\u0004\b\u000f\u0010\fJ\u0017\u0010\u0010\u001a\u00020\u00022\u0006\u0010\u0003\u001a\u00020\tH\u0016¢\u0006\u0004\b\u0010\u0010\u000eJ\u000f\u0010\u0012\u001a\u00020\u0011H\u0016¢\u0006\u0004\b\u0012\u0010\u0013J\u001a\u0010\u0016\u001a\u00020\u00152\b\u0010\u0003\u001a\u0004\u0018\u00010\u0014H\u0096\u0002¢\u0006\u0004\b\u0016\u0010\u0017J\u000f\u0010\u0018\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0018\u0010\u0019R\u0014\u0010\u001c\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010\u001bR\u0014\u0010\u001d\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001d\u0010\u001bR\u0014\u0010\u001e\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001e\u0010\u001bR\u0014\u0010\u001f\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001f\u0010\u001b"}, d2 = {"Landroidx/compose/foundation/layout/FixedIntInsets;", "Landroidx/compose/foundation/layout/WindowInsets;", "", "p0", "p1", "p2", "p3", "<init>", "(IIII)V", "Landroidx/compose/ui/unit/Density;", "Landroidx/compose/ui/unit/LayoutDirection;", "getLeft", "(Landroidx/compose/ui/unit/Density;Landroidx/compose/ui/unit/LayoutDirection;)I", "getTop", "(Landroidx/compose/ui/unit/Density;)I", "getRight", "getBottom", "", "toString", "()Ljava/lang/String;", "", "", "equals", "(Ljava/lang/Object;)Z", "hashCode", "()I", "Camera2StreamConfigurationMap", com.visa.cbp.getEncExpo.warmup, "getHighSpeedVideoSizes", "getHighResolutionOutputSizeshNQ4ISI", "getHighSpeedVideoFpsRanges", "getHighSpeedVideoFpsRangesFor"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
final class FixedIntInsets implements androidx.compose.foundation.layout.WindowInsets {

    /* renamed from: Camera2StreamConfigurationMap, reason: from kotlin metadata */
    private final int getHighSpeedVideoSizes;
    private final int getHighResolutionOutputSizeshNQ4ISI;
    private final int getHighSpeedVideoFpsRanges;
    private final int getHighSpeedVideoFpsRangesFor;

    public FixedIntInsets(int i, int i2, int i3, int i4) {
        this.getHighSpeedVideoSizes = i;
        this.getHighResolutionOutputSizeshNQ4ISI = i2;
        this.getHighSpeedVideoFpsRanges = i3;
        this.getHighSpeedVideoFpsRangesFor = i4;
    }

    @Override // androidx.compose.foundation.layout.WindowInsets
    public final int getLeft(androidx.compose.ui.unit.Density p0, androidx.compose.ui.unit.LayoutDirection p1) {
        return this.getHighSpeedVideoSizes;
    }

    @Override // androidx.compose.foundation.layout.WindowInsets
    public final int getTop(androidx.compose.ui.unit.Density p0) {
        return this.getHighResolutionOutputSizeshNQ4ISI;
    }

    @Override // androidx.compose.foundation.layout.WindowInsets
    public final int getRight(androidx.compose.ui.unit.Density p0, androidx.compose.ui.unit.LayoutDirection p1) {
        return this.getHighSpeedVideoFpsRanges;
    }

    @Override // androidx.compose.foundation.layout.WindowInsets
    public final int getBottom(androidx.compose.ui.unit.Density p0) {
        return this.getHighSpeedVideoFpsRangesFor;
    }

    public final java.lang.String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder("Insets(left=");
        sb.append(this.getHighSpeedVideoSizes);
        sb.append(", top=");
        sb.append(this.getHighResolutionOutputSizeshNQ4ISI);
        sb.append(", right=");
        sb.append(this.getHighSpeedVideoFpsRanges);
        sb.append(", bottom=");
        sb.append(this.getHighSpeedVideoFpsRangesFor);
        sb.append(')');
        return sb.toString();
    }

    public final boolean equals(java.lang.Object p0) {
        if (this == p0) {
            return true;
        }
        if (!(p0 instanceof androidx.compose.foundation.layout.FixedIntInsets)) {
            return false;
        }
        androidx.compose.foundation.layout.FixedIntInsets fixedIntInsets = (androidx.compose.foundation.layout.FixedIntInsets) p0;
        return this.getHighSpeedVideoSizes == fixedIntInsets.getHighSpeedVideoSizes && this.getHighResolutionOutputSizeshNQ4ISI == fixedIntInsets.getHighResolutionOutputSizeshNQ4ISI && this.getHighSpeedVideoFpsRanges == fixedIntInsets.getHighSpeedVideoFpsRanges && this.getHighSpeedVideoFpsRangesFor == fixedIntInsets.getHighSpeedVideoFpsRangesFor;
    }

    public final int hashCode() {
        int i = this.getHighSpeedVideoSizes;
        return (((((i * 31) + this.getHighResolutionOutputSizeshNQ4ISI) * 31) + this.getHighSpeedVideoFpsRanges) * 31) + this.getHighSpeedVideoFpsRangesFor;
    }
}
