package androidx.compose.foundation.layout;

@kotlin.Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0082\b\u0018\u00002\u00020\u00012\u00020\u0002B\u0017\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u001c\u0010\u000b\u001a\u00020\t*\u00020\t2\u0006\u0010\u0004\u001a\u00020\nH\u0096\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\u0004\u001a\u0004\u0018\u00010\rHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0012\u001a\u00020\u0011HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u0014\u0010\u0014\u001a\u00020\t*\u00020\tH\u0096\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0017\u001a\u00020\u0016HÖ\u0001¢\u0006\u0004\b\u0017\u0010\u0018R\u0014\u0010\u001b\u001a\u00020\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010\u001aR\u001a\u0010 \u001a\u00020\u00058\u0017X\u0096\u0004¢\u0006\f\n\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u001e\u0010\u001fR\u0014\u0010$\u001a\u00020!8WX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\"\u0010#R\u0014\u0010\u001c\u001a\u00020!8WX\u0096\u0004¢\u0006\u0006\u001a\u0004\b%\u0010#R\u0014\u0010\u0019\u001a\u00020!8WX\u0096\u0004¢\u0006\u0006\u001a\u0004\b&\u0010#R\u0014\u0010(\u001a\u00020!8WX\u0096\u0004¢\u0006\u0006\u001a\u0004\b'\u0010#"}, d2 = {"Landroidx/compose/foundation/layout/BoxWithConstraintsScopeImpl;", "Landroidx/compose/foundation/layout/BoxWithConstraintsScope;", "Landroidx/compose/foundation/layout/BoxScope;", "Landroidx/compose/ui/unit/Density;", "p0", "Landroidx/compose/ui/unit/Constraints;", "p1", "<init>", "(Landroidx/compose/ui/unit/Density;JLkotlin/jvm/internal/DefaultConstructorMarker;)V", "Landroidx/compose/ui/Modifier;", "Landroidx/compose/ui/Alignment;", "align", "(Landroidx/compose/ui/Modifier;Landroidx/compose/ui/Alignment;)Landroidx/compose/ui/Modifier;", "", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "matchParentSize", "(Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;", "", "toString", "()Ljava/lang/String;", "getHighResolutionOutputSizeshNQ4ISI", "Landroidx/compose/ui/unit/Density;", "getHighSpeedVideoFpsRanges", "getHighSpeedVideoSizes", "J", "getConstraints-msEJaDk", "()J", "Camera2StreamConfigurationMap", "Landroidx/compose/ui/unit/Dp;", "getMinWidth-D9Ej5fM", "()F", "getHighSpeedVideoFpsRangesFor", "getMaxWidth-D9Ej5fM", "getMinHeight-D9Ej5fM", "getMaxHeight-D9Ej5fM", "getHighSpeedVideoSizesFor"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
final /* data */ class BoxWithConstraintsScopeImpl implements androidx.compose.foundation.layout.BoxWithConstraintsScope, androidx.compose.foundation.layout.BoxScope {
    private final /* synthetic */ androidx.compose.foundation.layout.BoxScopeInstance Camera2StreamConfigurationMap;

    /* renamed from: getHighResolutionOutputSizeshNQ4ISI, reason: from kotlin metadata */
    private final androidx.compose.ui.unit.Density getHighSpeedVideoFpsRanges;

    /* renamed from: getHighSpeedVideoSizes, reason: from kotlin metadata */
    private final long Camera2StreamConfigurationMap;

    private BoxWithConstraintsScopeImpl(androidx.compose.ui.unit.Density density, long j) {
        this.Camera2StreamConfigurationMap = androidx.compose.foundation.layout.BoxScopeInstance.INSTANCE;
        this.getHighSpeedVideoFpsRanges = density;
        this.Camera2StreamConfigurationMap = j;
    }

    @Override // androidx.compose.foundation.layout.BoxWithConstraintsScope
    /* renamed from: getConstraints-msEJaDk, reason: from getter */
    public final long getCamera2StreamConfigurationMap() {
        return this.Camera2StreamConfigurationMap;
    }

    @Override // androidx.compose.foundation.layout.BoxWithConstraintsScope
    /* renamed from: getMinWidth-D9Ej5fM */
    public final float mo1626getMinWidthD9Ej5fM() {
        return this.getHighSpeedVideoFpsRanges.mo1415toDpu2uoSUM(androidx.compose.ui.unit.Constraints.m8556getMinWidthimpl(getCamera2StreamConfigurationMap()));
    }

    @Override // androidx.compose.foundation.layout.BoxWithConstraintsScope
    /* renamed from: getMaxWidth-D9Ej5fM */
    public final float mo1624getMaxWidthD9Ej5fM() {
        return androidx.compose.ui.unit.Constraints.m8550getHasBoundedWidthimpl(getCamera2StreamConfigurationMap()) ? this.getHighSpeedVideoFpsRanges.mo1415toDpu2uoSUM(androidx.compose.ui.unit.Constraints.m8554getMaxWidthimpl(getCamera2StreamConfigurationMap())) : androidx.compose.ui.unit.Dp.INSTANCE.m8620getInfinityD9Ej5fM();
    }

    @Override // androidx.compose.foundation.layout.BoxWithConstraintsScope
    /* renamed from: getMinHeight-D9Ej5fM */
    public final float mo1625getMinHeightD9Ej5fM() {
        return this.getHighSpeedVideoFpsRanges.mo1415toDpu2uoSUM(androidx.compose.ui.unit.Constraints.m8555getMinHeightimpl(getCamera2StreamConfigurationMap()));
    }

    @Override // androidx.compose.foundation.layout.BoxWithConstraintsScope
    /* renamed from: getMaxHeight-D9Ej5fM */
    public final float mo1623getMaxHeightD9Ej5fM() {
        return androidx.compose.ui.unit.Constraints.m8549getHasBoundedHeightimpl(getCamera2StreamConfigurationMap()) ? this.getHighSpeedVideoFpsRanges.mo1415toDpu2uoSUM(androidx.compose.ui.unit.Constraints.m8553getMaxHeightimpl(getCamera2StreamConfigurationMap())) : androidx.compose.ui.unit.Dp.INSTANCE.m8620getInfinityD9Ej5fM();
    }

    public final java.lang.String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder("BoxWithConstraintsScopeImpl(getHighSpeedVideoFpsRanges=");
        sb.append(this.getHighSpeedVideoFpsRanges);
        sb.append(", Camera2StreamConfigurationMap=");
        sb.append((java.lang.Object) androidx.compose.ui.unit.Constraints.m8559toStringimpl(this.Camera2StreamConfigurationMap));
        sb.append(')');
        return sb.toString();
    }

    @Override // androidx.compose.foundation.layout.BoxScope
    public final androidx.compose.ui.Modifier matchParentSize(androidx.compose.ui.Modifier modifier) {
        return this.Camera2StreamConfigurationMap.matchParentSize(modifier);
    }

    public final int hashCode() {
        return (this.getHighSpeedVideoFpsRanges.hashCode() * 31) + androidx.compose.ui.unit.Constraints.m8557hashCodeimpl(this.Camera2StreamConfigurationMap);
    }

    public final boolean equals(java.lang.Object p0) {
        if (this == p0) {
            return true;
        }
        if (!(p0 instanceof androidx.compose.foundation.layout.BoxWithConstraintsScopeImpl)) {
            return false;
        }
        androidx.compose.foundation.layout.BoxWithConstraintsScopeImpl boxWithConstraintsScopeImpl = (androidx.compose.foundation.layout.BoxWithConstraintsScopeImpl) p0;
        return kotlin.jvm.internal.Intrinsics.areEqual(this.getHighSpeedVideoFpsRanges, boxWithConstraintsScopeImpl.getHighSpeedVideoFpsRanges) && androidx.compose.ui.unit.Constraints.m8548equalsimpl0(this.Camera2StreamConfigurationMap, boxWithConstraintsScopeImpl.Camera2StreamConfigurationMap);
    }

    @Override // androidx.compose.foundation.layout.BoxScope
    public final androidx.compose.ui.Modifier align(androidx.compose.ui.Modifier modifier, androidx.compose.ui.Alignment alignment) {
        return this.Camera2StreamConfigurationMap.align(modifier, alignment);
    }

    public /* synthetic */ BoxWithConstraintsScopeImpl(androidx.compose.ui.unit.Density density, long j, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this(density, j);
    }
}
