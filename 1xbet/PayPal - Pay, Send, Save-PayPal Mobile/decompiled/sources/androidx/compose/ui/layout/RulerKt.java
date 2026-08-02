package androidx.compose.ui.layout;

@kotlin.Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0003\u001a3\u0010\b\u001a\u00020\u0006*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\u000e\u0010\u0005\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00040\u00032\u0006\u0010\u0007\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\b\u0010\t"}, d2 = {"Landroidx/compose/ui/layout/Placeable$PlacementScope;", "", "p0", "", "Landroidx/compose/ui/layout/Ruler;", "p1", "", "p2", "getHighSpeedVideoFpsRangesFor", "(Landroidx/compose/ui/layout/Placeable$PlacementScope;Z[Landroidx/compose/ui/layout/Ruler;F)F"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class RulerKt {
    /* JADX INFO: Access modifiers changed from: private */
    public static final float getHighSpeedVideoFpsRangesFor(androidx.compose.ui.layout.Placeable.PlacementScope placementScope, boolean z, androidx.compose.ui.layout.Ruler[] rulerArr, float f) {
        float f2 = Float.NaN;
        for (androidx.compose.ui.layout.Ruler ruler : rulerArr) {
            float current = placementScope.current(ruler, Float.NaN);
            if (!java.lang.Float.isNaN(f2)) {
                int i = z != (current > f2) ? i + 1 : 0;
            }
            f2 = current;
        }
        return java.lang.Float.isNaN(f2) ? f : f2;
    }
}
