package androidx.compose.foundation.layout;

@kotlin.Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\b\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0007\b\u0002\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0001\u0012\u0006\u0010\u0003\u001a\u00020\u0001¢\u0006\u0004\b\u0004\u0010\u0005J\u001f\u0010\t\u001a\u00020\b2\u0006\u0010\u0002\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\t\u0010\nJ\u0017\u0010\u000b\u001a\u00020\b2\u0006\u0010\u0002\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u000b\u0010\fJ\u001f\u0010\r\u001a\u00020\b2\u0006\u0010\u0002\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\r\u0010\nJ\u0017\u0010\u000e\u001a\u00020\b2\u0006\u0010\u0002\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u000e\u0010\fJ\u000f\u0010\u000f\u001a\u00020\bH\u0016¢\u0006\u0004\b\u000f\u0010\u0010J\u001a\u0010\u0013\u001a\u00020\u00122\b\u0010\u0002\u001a\u0004\u0018\u00010\u0011H\u0096\u0002¢\u0006\u0004\b\u0013\u0010\u0014J\u000f\u0010\u0016\u001a\u00020\u0015H\u0016¢\u0006\u0004\b\u0016\u0010\u0017R\u0014\u0010\u001a\u001a\u00020\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019R\u0014\u0010\u001c\u001a\u00020\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010\u0019"}, d2 = {"Landroidx/compose/foundation/layout/UnionInsets;", "Landroidx/compose/foundation/layout/WindowInsets;", "p0", "p1", "<init>", "(Landroidx/compose/foundation/layout/WindowInsets;Landroidx/compose/foundation/layout/WindowInsets;)V", "Landroidx/compose/ui/unit/Density;", "Landroidx/compose/ui/unit/LayoutDirection;", "", "getLeft", "(Landroidx/compose/ui/unit/Density;Landroidx/compose/ui/unit/LayoutDirection;)I", "getTop", "(Landroidx/compose/ui/unit/Density;)I", "getRight", "getBottom", "hashCode", "()I", "", "", "equals", "(Ljava/lang/Object;)Z", "", "toString", "()Ljava/lang/String;", "getHighResolutionOutputSizeshNQ4ISI", "Landroidx/compose/foundation/layout/WindowInsets;", "getHighSpeedVideoFpsRangesFor", "getHighSpeedVideoSizes", "Camera2StreamConfigurationMap"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
final class UnionInsets implements androidx.compose.foundation.layout.WindowInsets {

    /* renamed from: getHighResolutionOutputSizeshNQ4ISI, reason: from kotlin metadata */
    private final androidx.compose.foundation.layout.WindowInsets getHighSpeedVideoFpsRangesFor;

    /* renamed from: getHighSpeedVideoSizes, reason: from kotlin metadata */
    private final androidx.compose.foundation.layout.WindowInsets Camera2StreamConfigurationMap;

    public UnionInsets(androidx.compose.foundation.layout.WindowInsets windowInsets, androidx.compose.foundation.layout.WindowInsets windowInsets2) {
        this.getHighSpeedVideoFpsRangesFor = windowInsets;
        this.Camera2StreamConfigurationMap = windowInsets2;
    }

    @Override // androidx.compose.foundation.layout.WindowInsets
    public final int getLeft(androidx.compose.ui.unit.Density p0, androidx.compose.ui.unit.LayoutDirection p1) {
        return java.lang.Math.max(this.getHighSpeedVideoFpsRangesFor.getLeft(p0, p1), this.Camera2StreamConfigurationMap.getLeft(p0, p1));
    }

    @Override // androidx.compose.foundation.layout.WindowInsets
    public final int getTop(androidx.compose.ui.unit.Density p0) {
        return java.lang.Math.max(this.getHighSpeedVideoFpsRangesFor.getTop(p0), this.Camera2StreamConfigurationMap.getTop(p0));
    }

    @Override // androidx.compose.foundation.layout.WindowInsets
    public final int getRight(androidx.compose.ui.unit.Density p0, androidx.compose.ui.unit.LayoutDirection p1) {
        return java.lang.Math.max(this.getHighSpeedVideoFpsRangesFor.getRight(p0, p1), this.Camera2StreamConfigurationMap.getRight(p0, p1));
    }

    @Override // androidx.compose.foundation.layout.WindowInsets
    public final int getBottom(androidx.compose.ui.unit.Density p0) {
        return java.lang.Math.max(this.getHighSpeedVideoFpsRangesFor.getBottom(p0), this.Camera2StreamConfigurationMap.getBottom(p0));
    }

    public final int hashCode() {
        return this.getHighSpeedVideoFpsRangesFor.hashCode() + (this.Camera2StreamConfigurationMap.hashCode() * 31);
    }

    public final boolean equals(java.lang.Object p0) {
        if (this == p0) {
            return true;
        }
        if (!(p0 instanceof androidx.compose.foundation.layout.UnionInsets)) {
            return false;
        }
        androidx.compose.foundation.layout.UnionInsets unionInsets = (androidx.compose.foundation.layout.UnionInsets) p0;
        return kotlin.jvm.internal.Intrinsics.areEqual(unionInsets.getHighSpeedVideoFpsRangesFor, this.getHighSpeedVideoFpsRangesFor) && kotlin.jvm.internal.Intrinsics.areEqual(unionInsets.Camera2StreamConfigurationMap, this.Camera2StreamConfigurationMap);
    }

    public final java.lang.String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder("(");
        sb.append(this.getHighSpeedVideoFpsRangesFor);
        sb.append(" ∪ ");
        sb.append(this.Camera2StreamConfigurationMap);
        sb.append(')');
        return sb.toString();
    }
}
