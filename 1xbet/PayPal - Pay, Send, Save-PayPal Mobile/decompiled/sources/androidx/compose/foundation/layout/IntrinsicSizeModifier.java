package androidx.compose.foundation.layout;

@kotlin.Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0002\b\"\u0018\u00002\u00020\u00012\u00020\u0002B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J#\u0010\n\u001a\u00020\b*\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\bH&¢\u0006\u0004\b\n\u0010\u000bJ!\u0010\u000f\u001a\u00020\f*\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\r\u0010\u000eJ#\u0010\u0013\u001a\u00020\u0012*\u00020\u00102\u0006\u0010\u0007\u001a\u00020\u00112\u0006\u0010\t\u001a\u00020\u0012H\u0016¢\u0006\u0004\b\u0013\u0010\u0014J#\u0010\u0015\u001a\u00020\u0012*\u00020\u00102\u0006\u0010\u0007\u001a\u00020\u00112\u0006\u0010\t\u001a\u00020\u0012H\u0016¢\u0006\u0004\b\u0015\u0010\u0014J#\u0010\u0016\u001a\u00020\u0012*\u00020\u00102\u0006\u0010\u0007\u001a\u00020\u00112\u0006\u0010\t\u001a\u00020\u0012H\u0016¢\u0006\u0004\b\u0016\u0010\u0014J#\u0010\u0017\u001a\u00020\u0012*\u00020\u00102\u0006\u0010\u0007\u001a\u00020\u00112\u0006\u0010\t\u001a\u00020\u0012H\u0016¢\u0006\u0004\b\u0017\u0010\u0014R\u0014\u0010\u0019\u001a\u00020\u00188'X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0019\u0010\u001a"}, d2 = {"Landroidx/compose/foundation/layout/IntrinsicSizeModifier;", "Landroidx/compose/ui/node/LayoutModifierNode;", "Landroidx/compose/ui/Modifier$Node;", "<init>", "()V", "Landroidx/compose/ui/layout/MeasureScope;", "Landroidx/compose/ui/layout/Measurable;", "p0", "Landroidx/compose/ui/unit/Constraints;", "p1", "Camera2StreamConfigurationMap", "(Landroidx/compose/ui/layout/Measurable;J)J", "Landroidx/compose/ui/layout/MeasureResult;", "measure-3p2s80s", "(Landroidx/compose/ui/layout/MeasureScope;Landroidx/compose/ui/layout/Measurable;J)Landroidx/compose/ui/layout/MeasureResult;", "measure", "Landroidx/compose/ui/layout/IntrinsicMeasureScope;", "Landroidx/compose/ui/layout/IntrinsicMeasurable;", "", "minIntrinsicWidth", "(Landroidx/compose/ui/layout/IntrinsicMeasureScope;Landroidx/compose/ui/layout/IntrinsicMeasurable;I)I", "minIntrinsicHeight", "maxIntrinsicWidth", "maxIntrinsicHeight", "", "getHighSpeedVideoSizes", "()Z"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
abstract class IntrinsicSizeModifier extends androidx.compose.ui.Modifier.Node implements androidx.compose.ui.node.LayoutModifierNode {
    public abstract long Camera2StreamConfigurationMap(androidx.compose.ui.layout.Measurable p0, long p1);

    public abstract boolean getHighSpeedVideoSizes();

    @Override // androidx.compose.ui.node.LayoutModifierNode
    /* renamed from: measure-3p2s80s */
    public final androidx.compose.ui.layout.MeasureResult mo1117measure3p2s80s(androidx.compose.ui.layout.MeasureScope measureScope, androidx.compose.ui.layout.Measurable measurable, long j) {
        long Camera2StreamConfigurationMap = Camera2StreamConfigurationMap(measurable, j);
        if (getHighSpeedVideoSizes()) {
            Camera2StreamConfigurationMap = androidx.compose.ui.unit.ConstraintsKt.m8569constrainN9IONVI(j, Camera2StreamConfigurationMap);
        }
        final androidx.compose.ui.layout.Placeable mo7353measureBRTryo0 = measurable.mo7353measureBRTryo0(Camera2StreamConfigurationMap);
        return androidx.compose.ui.layout.MeasureScope.layout$default(measureScope, mo7353measureBRTryo0.getWidth(), mo7353measureBRTryo0.getHeight(), null, new kotlin.jvm.functions.Function1() { // from class: androidx.compose.foundation.layout.IntrinsicSizeModifier$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                kotlin.Unit Camera2StreamConfigurationMap2;
                Camera2StreamConfigurationMap2 = androidx.compose.foundation.layout.IntrinsicSizeModifier.Camera2StreamConfigurationMap(androidx.compose.ui.layout.Placeable.this, (androidx.compose.ui.layout.Placeable.PlacementScope) obj);
                return Camera2StreamConfigurationMap2;
            }
        }, 4, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final kotlin.Unit Camera2StreamConfigurationMap(androidx.compose.ui.layout.Placeable placeable, androidx.compose.ui.layout.Placeable.PlacementScope placementScope) {
        androidx.compose.ui.layout.Placeable.PlacementScope.m7416placeRelative70tqf50$default(placementScope, placeable, androidx.compose.ui.unit.IntOffset.INSTANCE.m8740getZeronOccac(), 0.0f, 2, null);
        return kotlin.Unit.INSTANCE;
    }

    @Override // androidx.compose.ui.node.LayoutModifierNode
    public int minIntrinsicWidth(androidx.compose.ui.layout.IntrinsicMeasureScope intrinsicMeasureScope, androidx.compose.ui.layout.IntrinsicMeasurable intrinsicMeasurable, int i) {
        return intrinsicMeasurable.minIntrinsicWidth(i);
    }

    public int minIntrinsicHeight(androidx.compose.ui.layout.IntrinsicMeasureScope intrinsicMeasureScope, androidx.compose.ui.layout.IntrinsicMeasurable intrinsicMeasurable, int i) {
        return intrinsicMeasurable.minIntrinsicHeight(i);
    }

    @Override // androidx.compose.ui.node.LayoutModifierNode
    public int maxIntrinsicWidth(androidx.compose.ui.layout.IntrinsicMeasureScope intrinsicMeasureScope, androidx.compose.ui.layout.IntrinsicMeasurable intrinsicMeasurable, int i) {
        return intrinsicMeasurable.maxIntrinsicWidth(i);
    }

    public int maxIntrinsicHeight(androidx.compose.ui.layout.IntrinsicMeasureScope intrinsicMeasureScope, androidx.compose.ui.layout.IntrinsicMeasurable intrinsicMeasurable, int i) {
        return intrinsicMeasurable.maxIntrinsicHeight(i);
    }
}
