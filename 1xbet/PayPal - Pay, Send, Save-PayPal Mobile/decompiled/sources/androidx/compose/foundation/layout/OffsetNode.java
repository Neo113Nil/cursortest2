package androidx.compose.foundation.layout;

@kotlin.Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\b\u0002\u0018\u00002\u00020\u00012\u00020\u0002B\u001f\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ%\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u00032\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\u000b\u0010\fJ#\u0010\u0013\u001a\u00020\u0010*\u00020\r2\u0006\u0010\u0004\u001a\u00020\u000e2\u0006\u0010\u0005\u001a\u00020\u000fH\u0016¢\u0006\u0004\b\u0011\u0010\u0012R\u0016\u0010\u0015\u001a\u00020\u00038\u0006@\u0006X\u0086\f¢\u0006\u0006\n\u0004\b\u000b\u0010\u0014R\u0016\u0010\u0017\u001a\u00020\u00038\u0006@\u0006X\u0086\f¢\u0006\u0006\n\u0004\b\u0016\u0010\u0014R\u0016\u0010\u000b\u001a\u00020\u00068\u0006@\u0006X\u0086\f¢\u0006\u0006\n\u0004\b\u0015\u0010\u0018R\u001a\u0010\u0019\u001a\u00020\u00068\u0017X\u0096D¢\u0006\f\n\u0004\b\u0019\u0010\u0018\u001a\u0004\b\u001a\u0010\u001b"}, d2 = {"Landroidx/compose/foundation/layout/OffsetNode;", "Landroidx/compose/ui/node/LayoutModifierNode;", "Landroidx/compose/ui/Modifier$Node;", "Landroidx/compose/ui/unit/Dp;", "p0", "p1", "", "p2", "<init>", "(FFZLkotlin/jvm/internal/DefaultConstructorMarker;)V", "", "getHighSpeedVideoFpsRanges", "(FFZ)V", "Landroidx/compose/ui/layout/MeasureScope;", "Landroidx/compose/ui/layout/Measurable;", "Landroidx/compose/ui/unit/Constraints;", "Landroidx/compose/ui/layout/MeasureResult;", "measure-3p2s80s", "(Landroidx/compose/ui/layout/MeasureScope;Landroidx/compose/ui/layout/Measurable;J)Landroidx/compose/ui/layout/MeasureResult;", "measure", com.adobe.marketing.mobile.internal.CoreConstants.Wrapper.Type.FLUTTER, "getHighResolutionOutputSizeshNQ4ISI", "getHighSpeedVideoSizes", "getHighSpeedVideoFpsRangesFor", "Z", "Camera2StreamConfigurationMap", "getShouldAutoInvalidate", "()Z"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
final class OffsetNode extends androidx.compose.ui.Modifier.Node implements androidx.compose.ui.node.LayoutModifierNode {
    private final boolean Camera2StreamConfigurationMap;

    /* renamed from: getHighResolutionOutputSizeshNQ4ISI, reason: from kotlin metadata */
    public boolean getHighSpeedVideoFpsRanges;

    /* renamed from: getHighSpeedVideoFpsRanges, reason: from kotlin metadata */
    public float getHighResolutionOutputSizeshNQ4ISI;

    /* renamed from: getHighSpeedVideoSizes, reason: from kotlin metadata */
    public float getHighSpeedVideoFpsRangesFor;

    private OffsetNode(float f, float f2, boolean z) {
        this.getHighResolutionOutputSizeshNQ4ISI = f;
        this.getHighSpeedVideoFpsRangesFor = f2;
        this.getHighSpeedVideoFpsRanges = z;
    }

    @Override // androidx.compose.ui.Modifier.Node
    public final boolean getShouldAutoInvalidate() {
        return this.Camera2StreamConfigurationMap;
    }

    public final void getHighSpeedVideoFpsRanges(float p0, float p1, boolean p2) {
        if (!androidx.compose.ui.unit.Dp.m8606equalsimpl0(this.getHighResolutionOutputSizeshNQ4ISI, p0) || !androidx.compose.ui.unit.Dp.m8606equalsimpl0(this.getHighSpeedVideoFpsRangesFor, p1) || this.getHighSpeedVideoFpsRanges != p2) {
            androidx.compose.ui.node.LayoutModifierNodeKt.invalidatePlacement(this);
        }
        this.getHighResolutionOutputSizeshNQ4ISI = p0;
        this.getHighSpeedVideoFpsRangesFor = p1;
        this.getHighSpeedVideoFpsRanges = p2;
    }

    @Override // androidx.compose.ui.node.LayoutModifierNode
    /* renamed from: measure-3p2s80s */
    public final androidx.compose.ui.layout.MeasureResult mo1117measure3p2s80s(androidx.compose.ui.layout.MeasureScope measureScope, androidx.compose.ui.layout.Measurable measurable, long j) {
        final androidx.compose.ui.layout.Placeable mo7353measureBRTryo0 = measurable.mo7353measureBRTryo0(j);
        return androidx.compose.ui.layout.MeasureScope.layout$default(measureScope, mo7353measureBRTryo0.getWidth(), mo7353measureBRTryo0.getHeight(), null, new kotlin.jvm.functions.Function1() { // from class: androidx.compose.foundation.layout.OffsetNode$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                kotlin.Unit highSpeedVideoFpsRangesFor;
                highSpeedVideoFpsRangesFor = androidx.compose.foundation.layout.OffsetNode.getHighSpeedVideoFpsRangesFor(androidx.compose.foundation.layout.OffsetNode.this, mo7353measureBRTryo0, (androidx.compose.ui.layout.Placeable.PlacementScope) obj);
                return highSpeedVideoFpsRangesFor;
            }
        }, 4, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final kotlin.Unit getHighSpeedVideoFpsRangesFor(androidx.compose.foundation.layout.OffsetNode offsetNode, androidx.compose.ui.layout.Placeable placeable, androidx.compose.ui.layout.Placeable.PlacementScope placementScope) {
        if (offsetNode.getHighSpeedVideoFpsRanges) {
            androidx.compose.ui.layout.Placeable.PlacementScope.placeRelative$default(placementScope, placeable, placementScope.mo1412roundToPx0680j_4(offsetNode.getHighResolutionOutputSizeshNQ4ISI), placementScope.mo1412roundToPx0680j_4(offsetNode.getHighSpeedVideoFpsRangesFor), 0.0f, 4, null);
        } else {
            androidx.compose.ui.layout.Placeable.PlacementScope.place$default(placementScope, placeable, placementScope.mo1412roundToPx0680j_4(offsetNode.getHighResolutionOutputSizeshNQ4ISI), placementScope.mo1412roundToPx0680j_4(offsetNode.getHighSpeedVideoFpsRangesFor), 0.0f, 4, null);
        }
        return kotlin.Unit.INSTANCE;
    }

    public /* synthetic */ OffsetNode(float f, float f2, boolean z, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this(f, f2, z);
    }
}
