package androidx.compose.ui.layout;

@kotlin.Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0002\b\u0005\b\u0002\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u0011\u0010\u0006\u001a\u00020\u00028\u0006¢\u0006\u0006\n\u0004\b\u0006\u0010\u0007R\u0014\u0010\u000b\u001a\u00020\b8UX\u0094\u0004¢\u0006\u0006\u001a\u0004\b\t\u0010\nR\u0014\u0010\u000f\u001a\u00020\f8UX\u0094\u0004¢\u0006\u0006\u001a\u0004\b\r\u0010\u000eR\u0014\u0010\u0013\u001a\u00020\u00108WX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0011\u0010\u0012R\u0014\u0010\u0017\u001a\u00020\u00148WX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0015\u0010\u0016R\u0014\u0010\u0019\u001a\u00020\u00148WX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0018\u0010\u0016"}, d2 = {"Landroidx/compose/ui/layout/OuterPlacementScope;", "Landroidx/compose/ui/layout/Placeable$PlacementScope;", "Landroidx/compose/ui/node/Owner;", "p0", "<init>", "(Landroidx/compose/ui/node/Owner;)V", "Camera2StreamConfigurationMap", "Landroidx/compose/ui/node/Owner;", "", "getParentWidth", "()I", "getHighResolutionOutputSizeshNQ4ISI", "Landroidx/compose/ui/unit/LayoutDirection;", "getParentLayoutDirection", "()Landroidx/compose/ui/unit/LayoutDirection;", "getHighSpeedVideoFpsRanges", "Landroidx/compose/ui/layout/LayoutCoordinates;", "getCoordinates", "()Landroidx/compose/ui/layout/LayoutCoordinates;", "getHighSpeedVideoSizes", "", "getDensity", "()F", "getHighSpeedVideoFpsRangesFor", "getFontScale", "getInputFormats"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
final class OuterPlacementScope extends androidx.compose.ui.layout.Placeable.PlacementScope {
    private final androidx.compose.ui.node.Owner Camera2StreamConfigurationMap;

    public OuterPlacementScope(androidx.compose.ui.node.Owner owner) {
        this.Camera2StreamConfigurationMap = owner;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // androidx.compose.ui.layout.Placeable.PlacementScope
    /* renamed from: getParentWidth */
    public final int getGetHighSpeedVideoFpsRanges() {
        return this.Camera2StreamConfigurationMap.getRoot().getWidth();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // androidx.compose.ui.layout.Placeable.PlacementScope
    /* renamed from: getParentLayoutDirection */
    public final androidx.compose.ui.unit.LayoutDirection getCamera2StreamConfigurationMap() {
        return this.Camera2StreamConfigurationMap.getLayoutDirection();
    }

    @Override // androidx.compose.ui.layout.Placeable.PlacementScope
    public final androidx.compose.ui.layout.LayoutCoordinates getCoordinates() {
        return this.Camera2StreamConfigurationMap.getRoot().getOuterCoordinator$ui();
    }

    @Override // androidx.compose.ui.layout.Placeable.PlacementScope, androidx.compose.ui.unit.Density
    public final float getDensity() {
        return this.Camera2StreamConfigurationMap.getDensity().getDensity();
    }

    @Override // androidx.compose.ui.layout.Placeable.PlacementScope, androidx.compose.ui.unit.FontScaling
    public final float getFontScale() {
        return this.Camera2StreamConfigurationMap.getDensity().getFontScale();
    }
}
