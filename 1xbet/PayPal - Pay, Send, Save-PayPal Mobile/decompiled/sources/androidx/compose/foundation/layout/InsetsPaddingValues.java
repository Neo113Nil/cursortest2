package androidx.compose.foundation.layout;

@kotlin.Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\b\b\u0002\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0017\u0010\f\u001a\u00020\t2\u0006\u0010\u0003\u001a\u00020\bH\u0016¢\u0006\u0004\b\n\u0010\u000bJ\u000f\u0010\u000f\u001a\u00020\tH\u0016¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u0011\u001a\u00020\t2\u0006\u0010\u0003\u001a\u00020\bH\u0016¢\u0006\u0004\b\u0010\u0010\u000bJ\u000f\u0010\u0013\u001a\u00020\tH\u0016¢\u0006\u0004\b\u0012\u0010\u000eJ\u000f\u0010\u0015\u001a\u00020\u0014H\u0016¢\u0006\u0004\b\u0015\u0010\u0016J\u001a\u0010\u0019\u001a\u00020\u00182\b\u0010\u0003\u001a\u0004\u0018\u00010\u0017H\u0096\u0002¢\u0006\u0004\b\u0019\u0010\u001aJ\u000f\u0010\u001c\u001a\u00020\u001bH\u0016¢\u0006\u0004\b\u001c\u0010\u001dR\u0011\u0010 \u001a\u00020\u00028\u0006¢\u0006\u0006\n\u0004\b\u001e\u0010\u001fR\u0014\u0010#\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b!\u0010\""}, d2 = {"Landroidx/compose/foundation/layout/InsetsPaddingValues;", "Landroidx/compose/foundation/layout/PaddingValues;", "Landroidx/compose/foundation/layout/WindowInsets;", "p0", "Landroidx/compose/ui/unit/Density;", "p1", "<init>", "(Landroidx/compose/foundation/layout/WindowInsets;Landroidx/compose/ui/unit/Density;)V", "Landroidx/compose/ui/unit/LayoutDirection;", "Landroidx/compose/ui/unit/Dp;", "calculateLeftPadding-u2uoSUM", "(Landroidx/compose/ui/unit/LayoutDirection;)F", "calculateLeftPadding", "calculateTopPadding-D9Ej5fM", "()F", "calculateTopPadding", "calculateRightPadding-u2uoSUM", "calculateRightPadding", "calculateBottomPadding-D9Ej5fM", "calculateBottomPadding", "", "toString", "()Ljava/lang/String;", "", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "getHighSpeedVideoFpsRangesFor", "Landroidx/compose/foundation/layout/WindowInsets;", "Camera2StreamConfigurationMap", "getHighSpeedVideoSizes", "Landroidx/compose/ui/unit/Density;", "getHighSpeedVideoFpsRanges"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
final class InsetsPaddingValues implements androidx.compose.foundation.layout.PaddingValues {

    /* renamed from: getHighSpeedVideoFpsRangesFor, reason: from kotlin metadata */
    private final androidx.compose.foundation.layout.WindowInsets Camera2StreamConfigurationMap;

    /* renamed from: getHighSpeedVideoSizes, reason: from kotlin metadata */
    private final androidx.compose.ui.unit.Density getHighSpeedVideoFpsRanges;

    public InsetsPaddingValues(androidx.compose.foundation.layout.WindowInsets windowInsets, androidx.compose.ui.unit.Density density) {
        this.Camera2StreamConfigurationMap = windowInsets;
        this.getHighSpeedVideoFpsRanges = density;
    }

    @Override // androidx.compose.foundation.layout.PaddingValues
    /* renamed from: calculateLeftPadding-u2uoSUM, reason: not valid java name */
    public final float mo1672calculateLeftPaddingu2uoSUM(androidx.compose.ui.unit.LayoutDirection p0) {
        androidx.compose.ui.unit.Density density = this.getHighSpeedVideoFpsRanges;
        return density.mo1415toDpu2uoSUM(this.Camera2StreamConfigurationMap.getLeft(density, p0));
    }

    @Override // androidx.compose.foundation.layout.PaddingValues
    /* renamed from: calculateTopPadding-D9Ej5fM, reason: not valid java name */
    public final float getTop() {
        androidx.compose.ui.unit.Density density = this.getHighSpeedVideoFpsRanges;
        return density.mo1415toDpu2uoSUM(this.Camera2StreamConfigurationMap.getTop(density));
    }

    @Override // androidx.compose.foundation.layout.PaddingValues
    /* renamed from: calculateRightPadding-u2uoSUM, reason: not valid java name */
    public final float mo1673calculateRightPaddingu2uoSUM(androidx.compose.ui.unit.LayoutDirection p0) {
        androidx.compose.ui.unit.Density density = this.getHighSpeedVideoFpsRanges;
        return density.mo1415toDpu2uoSUM(this.Camera2StreamConfigurationMap.getRight(density, p0));
    }

    @Override // androidx.compose.foundation.layout.PaddingValues
    /* renamed from: calculateBottomPadding-D9Ej5fM, reason: not valid java name */
    public final float getBottom() {
        androidx.compose.ui.unit.Density density = this.getHighSpeedVideoFpsRanges;
        return density.mo1415toDpu2uoSUM(this.Camera2StreamConfigurationMap.getBottom(density));
    }

    public final java.lang.String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder("InsetsPaddingValues(insets=");
        sb.append(this.Camera2StreamConfigurationMap);
        sb.append(", density=");
        sb.append(this.getHighSpeedVideoFpsRanges);
        sb.append(')');
        return sb.toString();
    }

    public final boolean equals(java.lang.Object p0) {
        if (this == p0) {
            return true;
        }
        if (!(p0 instanceof androidx.compose.foundation.layout.InsetsPaddingValues)) {
            return false;
        }
        androidx.compose.foundation.layout.InsetsPaddingValues insetsPaddingValues = (androidx.compose.foundation.layout.InsetsPaddingValues) p0;
        return kotlin.jvm.internal.Intrinsics.areEqual(this.Camera2StreamConfigurationMap, insetsPaddingValues.Camera2StreamConfigurationMap) && kotlin.jvm.internal.Intrinsics.areEqual(this.getHighSpeedVideoFpsRanges, insetsPaddingValues.getHighSpeedVideoFpsRanges);
    }

    public final int hashCode() {
        return (this.Camera2StreamConfigurationMap.hashCode() * 31) + this.getHighSpeedVideoFpsRanges.hashCode();
    }
}
