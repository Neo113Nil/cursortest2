package androidx.compose.foundation.lazy;

@kotlin.Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\f\b\u0002\u0018\u00002\u00020\u00012\u00020\u0002B3\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0010\b\u0002\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005\u0012\u0010\b\u0002\u0010\b\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005¢\u0006\u0004\b\t\u0010\nJ#\u0010\u0011\u001a\u00020\u000e*\u00020\u000b2\u0006\u0010\u0004\u001a\u00020\f2\u0006\u0010\u0007\u001a\u00020\rH\u0016¢\u0006\u0004\b\u000f\u0010\u0010R\u001c\u0010\u0016\u001a\u00020\u00038\u0006@\u0007X\u0086\u000e¢\u0006\f\n\u0004\b\u0012\u0010\u0013\"\u0004\b\u0014\u0010\u0015R$\u0010\u0012\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u00058\u0006@\u0007X\u0087\u000e¢\u0006\f\n\u0004\b\u0017\u0010\u0018\"\u0004\b\u0016\u0010\u0019R$\u0010\u0014\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u00058\u0006@\u0007X\u0087\u000e¢\u0006\f\n\u0004\b\u001a\u0010\u0018\"\u0004\b\u0017\u0010\u0019"}, d2 = {"Landroidx/compose/foundation/lazy/ParentSizeNode;", "Landroidx/compose/ui/node/LayoutModifierNode;", "Landroidx/compose/ui/Modifier$Node;", "", "p0", "Landroidx/compose/runtime/State;", "", "p1", "p2", "<init>", "(FLandroidx/compose/runtime/State;Landroidx/compose/runtime/State;)V", "Landroidx/compose/ui/layout/MeasureScope;", "Landroidx/compose/ui/layout/Measurable;", "Landroidx/compose/ui/unit/Constraints;", "Landroidx/compose/ui/layout/MeasureResult;", "measure-3p2s80s", "(Landroidx/compose/ui/layout/MeasureScope;Landroidx/compose/ui/layout/Measurable;J)Landroidx/compose/ui/layout/MeasureResult;", "measure", "getHighSpeedVideoFpsRanges", com.adobe.marketing.mobile.internal.CoreConstants.Wrapper.Type.FLUTTER, "getHighSpeedVideoSizes", "(F)V", "getHighResolutionOutputSizeshNQ4ISI", "getHighSpeedVideoFpsRangesFor", "Landroidx/compose/runtime/State;", "(Landroidx/compose/runtime/State;)V", "Camera2StreamConfigurationMap"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
final class ParentSizeNode extends androidx.compose.ui.Modifier.Node implements androidx.compose.ui.node.LayoutModifierNode {

    /* renamed from: Camera2StreamConfigurationMap, reason: from kotlin metadata */
    private androidx.compose.runtime.State<java.lang.Integer> getHighSpeedVideoSizes;

    /* renamed from: getHighSpeedVideoFpsRanges, reason: from kotlin metadata */
    private float getHighResolutionOutputSizeshNQ4ISI;

    /* renamed from: getHighSpeedVideoFpsRangesFor, reason: from kotlin metadata */
    private androidx.compose.runtime.State<java.lang.Integer> getHighSpeedVideoFpsRanges;

    public ParentSizeNode(float f, androidx.compose.runtime.State<java.lang.Integer> state, androidx.compose.runtime.State<java.lang.Integer> state2) {
        this.getHighResolutionOutputSizeshNQ4ISI = f;
        this.getHighSpeedVideoFpsRanges = state;
        this.getHighSpeedVideoSizes = state2;
    }

    public final void getHighSpeedVideoSizes(float f) {
        this.getHighResolutionOutputSizeshNQ4ISI = f;
    }

    public final void getHighResolutionOutputSizeshNQ4ISI(androidx.compose.runtime.State<java.lang.Integer> state) {
        this.getHighSpeedVideoFpsRanges = state;
    }

    public final void getHighSpeedVideoFpsRangesFor(androidx.compose.runtime.State<java.lang.Integer> state) {
        this.getHighSpeedVideoSizes = state;
    }

    @Override // androidx.compose.ui.node.LayoutModifierNode
    /* renamed from: measure-3p2s80s */
    public final androidx.compose.ui.layout.MeasureResult mo1117measure3p2s80s(androidx.compose.ui.layout.MeasureScope measureScope, androidx.compose.ui.layout.Measurable measurable, long j) {
        androidx.compose.runtime.State<java.lang.Integer> state = this.getHighSpeedVideoFpsRanges;
        int round = (state == null || state.getValue().intValue() == Integer.MAX_VALUE) ? Integer.MAX_VALUE : java.lang.Math.round(state.getValue().floatValue() * this.getHighResolutionOutputSizeshNQ4ISI);
        androidx.compose.runtime.State<java.lang.Integer> state2 = this.getHighSpeedVideoSizes;
        int round2 = (state2 == null || state2.getValue().intValue() == Integer.MAX_VALUE) ? Integer.MAX_VALUE : java.lang.Math.round(state2.getValue().floatValue() * this.getHighResolutionOutputSizeshNQ4ISI);
        int m8556getMinWidthimpl = round != Integer.MAX_VALUE ? round : androidx.compose.ui.unit.Constraints.m8556getMinWidthimpl(j);
        int m8555getMinHeightimpl = round2 != Integer.MAX_VALUE ? round2 : androidx.compose.ui.unit.Constraints.m8555getMinHeightimpl(j);
        if (round == Integer.MAX_VALUE) {
            round = androidx.compose.ui.unit.Constraints.m8554getMaxWidthimpl(j);
        }
        if (round2 == Integer.MAX_VALUE) {
            round2 = androidx.compose.ui.unit.Constraints.m8553getMaxHeightimpl(j);
        }
        final androidx.compose.ui.layout.Placeable mo7353measureBRTryo0 = measurable.mo7353measureBRTryo0(androidx.compose.ui.unit.ConstraintsKt.Constraints(m8556getMinWidthimpl, round, m8555getMinHeightimpl, round2));
        return androidx.compose.ui.layout.MeasureScope.layout$default(measureScope, mo7353measureBRTryo0.getWidth(), mo7353measureBRTryo0.getHeight(), null, new kotlin.jvm.functions.Function1() { // from class: androidx.compose.foundation.lazy.ParentSizeNode$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                kotlin.Unit highResolutionOutputSizeshNQ4ISI;
                highResolutionOutputSizeshNQ4ISI = androidx.compose.foundation.lazy.ParentSizeNode.getHighResolutionOutputSizeshNQ4ISI(androidx.compose.ui.layout.Placeable.this, (androidx.compose.ui.layout.Placeable.PlacementScope) obj);
                return highResolutionOutputSizeshNQ4ISI;
            }
        }, 4, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final kotlin.Unit getHighResolutionOutputSizeshNQ4ISI(androidx.compose.ui.layout.Placeable placeable, androidx.compose.ui.layout.Placeable.PlacementScope placementScope) {
        androidx.compose.ui.layout.Placeable.PlacementScope.place$default(placementScope, placeable, 0, 0, 0.0f, 4, null);
        return kotlin.Unit.INSTANCE;
    }
}
