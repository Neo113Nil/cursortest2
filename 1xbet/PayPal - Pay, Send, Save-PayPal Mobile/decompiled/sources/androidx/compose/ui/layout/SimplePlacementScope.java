package androidx.compose.ui.layout;

@kotlin.Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0013\b\u0002\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\b\u001a\u00020\u0006¢\u0006\u0004\b\t\u0010\nR\u001a\u0010\u000b\u001a\u00020\u00028\u0015X\u0094\u0004¢\u0006\f\n\u0004\b\u000b\u0010\f\u001a\u0004\b\r\u0010\u000eR\u001a\u0010\u0013\u001a\u00020\u00048\u0015X\u0095\u0004¢\u0006\f\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012R\u001a\u0010\u0014\u001a\u00020\u00068\u0017X\u0097\u0004¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017R\u001a\u0010\u0019\u001a\u00020\u00068\u0017X\u0097\u0004¢\u0006\f\n\u0004\b\u0013\u0010\u0015\u001a\u0004\b\u0018\u0010\u0017"}, d2 = {"Landroidx/compose/ui/layout/SimplePlacementScope;", "Landroidx/compose/ui/layout/Placeable$PlacementScope;", "", "p0", "Landroidx/compose/ui/unit/LayoutDirection;", "p1", "", "p2", "p3", "<init>", "(ILandroidx/compose/ui/unit/LayoutDirection;FF)V", "getHighSpeedVideoFpsRanges", com.visa.cbp.getEncExpo.warmup, "getParentWidth", "()I", "getHighResolutionOutputSizeshNQ4ISI", "Landroidx/compose/ui/unit/LayoutDirection;", "getParentLayoutDirection", "()Landroidx/compose/ui/unit/LayoutDirection;", "Camera2StreamConfigurationMap", "getHighSpeedVideoSizes", com.adobe.marketing.mobile.internal.CoreConstants.Wrapper.Type.FLUTTER, "getDensity", "()F", "getFontScale", "getHighSpeedVideoFpsRangesFor"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
final class SimplePlacementScope extends androidx.compose.ui.layout.Placeable.PlacementScope {

    /* renamed from: Camera2StreamConfigurationMap, reason: from kotlin metadata */
    private final float getHighSpeedVideoFpsRangesFor;

    /* renamed from: getHighResolutionOutputSizeshNQ4ISI, reason: from kotlin metadata */
    private final androidx.compose.ui.unit.LayoutDirection Camera2StreamConfigurationMap;
    private final int getHighSpeedVideoFpsRanges;
    private final float getHighSpeedVideoSizes;

    public SimplePlacementScope(int i, androidx.compose.ui.unit.LayoutDirection layoutDirection, float f, float f2) {
        this.getHighSpeedVideoFpsRanges = i;
        this.Camera2StreamConfigurationMap = layoutDirection;
        this.getHighSpeedVideoSizes = f;
        this.getHighSpeedVideoFpsRangesFor = f2;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // androidx.compose.ui.layout.Placeable.PlacementScope
    /* renamed from: getParentWidth, reason: from getter */
    public final int getGetHighSpeedVideoFpsRanges() {
        return this.getHighSpeedVideoFpsRanges;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // androidx.compose.ui.layout.Placeable.PlacementScope
    /* renamed from: getParentLayoutDirection, reason: from getter */
    public final androidx.compose.ui.unit.LayoutDirection getCamera2StreamConfigurationMap() {
        return this.Camera2StreamConfigurationMap;
    }

    @Override // androidx.compose.ui.layout.Placeable.PlacementScope, androidx.compose.ui.unit.Density
    /* renamed from: getDensity, reason: from getter */
    public final float getGetHighSpeedVideoSizes() {
        return this.getHighSpeedVideoSizes;
    }

    @Override // androidx.compose.ui.layout.Placeable.PlacementScope, androidx.compose.ui.unit.FontScaling
    /* renamed from: getFontScale, reason: from getter */
    public final float getGetHighSpeedVideoFpsRangesFor() {
        return this.getHighSpeedVideoFpsRangesFor;
    }
}
