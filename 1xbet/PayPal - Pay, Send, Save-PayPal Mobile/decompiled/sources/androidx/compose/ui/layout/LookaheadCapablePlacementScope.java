package androidx.compose.ui.layout;

@kotlin.Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0002\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u001b\u0010\b\u001a\u00020\u0007*\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\b\u0010\tR\u0014\u0010\f\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010\u000bR\u0014\u0010\u0010\u001a\u00020\r8UX\u0094\u0004¢\u0006\u0006\u001a\u0004\b\u000e\u0010\u000fR\u0014\u0010\u0014\u001a\u00020\u00118UX\u0094\u0004¢\u0006\u0006\u001a\u0004\b\u0012\u0010\u0013R\u0016\u0010\u0018\u001a\u0004\u0018\u00010\u00158WX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0016\u0010\u0017R\u0014\u0010\n\u001a\u00020\u00078WX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0019\u0010\u001aR\u0014\u0010\u001c\u001a\u00020\u00078WX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u001b\u0010\u001a"}, d2 = {"Landroidx/compose/ui/layout/LookaheadCapablePlacementScope;", "Landroidx/compose/ui/layout/Placeable$PlacementScope;", "Landroidx/compose/ui/node/LookaheadCapablePlaceable;", "p0", "<init>", "(Landroidx/compose/ui/node/LookaheadCapablePlaceable;)V", "Landroidx/compose/ui/layout/Ruler;", "", "current", "(Landroidx/compose/ui/layout/Ruler;F)F", "getHighSpeedVideoSizes", "Landroidx/compose/ui/node/LookaheadCapablePlaceable;", "getHighSpeedVideoFpsRangesFor", "", "getParentWidth", "()I", "getHighSpeedVideoFpsRanges", "Landroidx/compose/ui/unit/LayoutDirection;", "getParentLayoutDirection", "()Landroidx/compose/ui/unit/LayoutDirection;", "Camera2StreamConfigurationMap", "Landroidx/compose/ui/layout/LayoutCoordinates;", "getCoordinates", "()Landroidx/compose/ui/layout/LayoutCoordinates;", "getHighResolutionOutputSizeshNQ4ISI", "getDensity", "()F", "getFontScale", "getOutputFormats"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
final class LookaheadCapablePlacementScope extends androidx.compose.ui.layout.Placeable.PlacementScope {

    /* renamed from: getHighSpeedVideoSizes, reason: from kotlin metadata */
    private final androidx.compose.ui.node.LookaheadCapablePlaceable getHighSpeedVideoFpsRangesFor;

    public LookaheadCapablePlacementScope(androidx.compose.ui.node.LookaheadCapablePlaceable lookaheadCapablePlaceable) {
        this.getHighSpeedVideoFpsRangesFor = lookaheadCapablePlaceable;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // androidx.compose.ui.layout.Placeable.PlacementScope
    /* renamed from: getParentWidth */
    public final int getGetHighSpeedVideoFpsRanges() {
        return this.getHighSpeedVideoFpsRangesFor.getMeasuredWidth();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // androidx.compose.ui.layout.Placeable.PlacementScope
    /* renamed from: getParentLayoutDirection */
    public final androidx.compose.ui.unit.LayoutDirection getCamera2StreamConfigurationMap() {
        return this.getHighSpeedVideoFpsRangesFor.getLayoutDirection();
    }

    @Override // androidx.compose.ui.layout.Placeable.PlacementScope
    public final androidx.compose.ui.layout.LayoutCoordinates getCoordinates() {
        androidx.compose.ui.layout.LayoutCoordinates coordinates = this.getHighSpeedVideoFpsRangesFor.getIsPlacingForAlignment() ? null : this.getHighSpeedVideoFpsRangesFor.getCoordinates();
        if (coordinates == null) {
            this.getHighSpeedVideoFpsRangesFor.getLayoutNode().getLayoutDelegate().onCoordinatesUsed();
        }
        return coordinates;
    }

    @Override // androidx.compose.ui.layout.Placeable.PlacementScope
    public final float current(androidx.compose.ui.layout.Ruler ruler, float f) {
        if (ruler.getCalculate$ui() != null) {
            return ruler.getCalculate$ui().invoke(this, java.lang.Float.valueOf(f)).floatValue();
        }
        return this.getHighSpeedVideoFpsRangesFor.findRulerValue(ruler, f);
    }

    @Override // androidx.compose.ui.layout.Placeable.PlacementScope, androidx.compose.ui.unit.Density
    public final float getDensity() {
        return this.getHighSpeedVideoFpsRangesFor.getDensity();
    }

    @Override // androidx.compose.ui.layout.Placeable.PlacementScope, androidx.compose.ui.unit.FontScaling
    public final float getFontScale() {
        return this.getHighSpeedVideoFpsRangesFor.getFontScale();
    }
}
