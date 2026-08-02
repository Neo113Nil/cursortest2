package androidx.compose.ui.layout;

@kotlin.Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J\u0013\u0010\u0003\u001a\u00020\u0002*\u00020\u0002H&¢\u0006\u0004\b\u0003\u0010\u0004J/\u0010\f\u001a\u00020\u0006*\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00022\b\b\u0002\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\t\u001a\u00020\bH&¢\u0006\u0004\b\n\u0010\u000bR\u0018\u0010\u0010\u001a\u00020\u0002*\u00020\r8'X¦\u0004¢\u0006\u0006\u001a\u0004\b\u000e\u0010\u000fø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001À\u0006\u0001"}, d2 = {"Landroidx/compose/ui/layout/LookaheadScope;", "", "Landroidx/compose/ui/layout/LayoutCoordinates;", "toLookaheadCoordinates", "(Landroidx/compose/ui/layout/LayoutCoordinates;)Landroidx/compose/ui/layout/LayoutCoordinates;", "sourceCoordinates", "Landroidx/compose/ui/geometry/Offset;", "relativeToSource", "", "includeMotionFrameOfReference", "localLookaheadPositionOf-au-aQtc", "(Landroidx/compose/ui/layout/LayoutCoordinates;Landroidx/compose/ui/layout/LayoutCoordinates;JZ)J", "localLookaheadPositionOf", "Landroidx/compose/ui/layout/Placeable$PlacementScope;", "getLookaheadScopeCoordinates", "(Landroidx/compose/ui/layout/Placeable$PlacementScope;)Landroidx/compose/ui/layout/LayoutCoordinates;", "lookaheadScopeCoordinates"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public interface LookaheadScope {
    androidx.compose.ui.layout.LayoutCoordinates getLookaheadScopeCoordinates(androidx.compose.ui.layout.Placeable.PlacementScope placementScope);

    androidx.compose.ui.layout.LayoutCoordinates toLookaheadCoordinates(androidx.compose.ui.layout.LayoutCoordinates layoutCoordinates);

    /* renamed from: localLookaheadPositionOf-au-aQtc$default, reason: not valid java name */
    static /* synthetic */ long m7379localLookaheadPositionOfauaQtc$default(androidx.compose.ui.layout.LookaheadScope lookaheadScope, androidx.compose.ui.layout.LayoutCoordinates layoutCoordinates, androidx.compose.ui.layout.LayoutCoordinates layoutCoordinates2, long j, boolean z, int i, java.lang.Object obj) {
        if (obj != null) {
            throw new java.lang.UnsupportedOperationException("Super calls with default arguments not supported in this target, function: localLookaheadPositionOf-au-aQtc");
        }
        if ((i & 2) != 0) {
            j = androidx.compose.ui.geometry.Offset.INSTANCE.m5768getZeroF1C5BW0();
        }
        long j2 = j;
        if ((i & 4) != 0) {
            z = true;
        }
        return lookaheadScope.mo1145localLookaheadPositionOfauaQtc(layoutCoordinates, layoutCoordinates2, j2, z);
    }

    /* renamed from: localLookaheadPositionOf-au-aQtc */
    default long mo1145localLookaheadPositionOfauaQtc(androidx.compose.ui.layout.LayoutCoordinates layoutCoordinates, androidx.compose.ui.layout.LayoutCoordinates layoutCoordinates2, long j, boolean z) {
        return androidx.compose.ui.layout.LookaheadScopeKt.m7380localLookaheadPositionOfFgt4K4Q(this, layoutCoordinates, layoutCoordinates2, j, z);
    }
}
