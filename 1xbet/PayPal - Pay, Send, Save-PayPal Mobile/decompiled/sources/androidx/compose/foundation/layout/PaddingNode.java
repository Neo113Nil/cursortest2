package androidx.compose.foundation.layout;

@kotlin.Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\f\b\u0002\u0018\u00002\u00020\u00012\u00020\u0002B7\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0003\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJ#\u0010\u0012\u001a\u00020\u000f*\u00020\f2\u0006\u0010\u0004\u001a\u00020\r2\u0006\u0010\u0005\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\u0010\u0010\u0011R\u001c\u0010\u0016\u001a\u00020\u00038\u0006@\u0007X\u0086\u000e¢\u0006\f\n\u0004\b\u0013\u0010\u0014\"\u0004\b\u0013\u0010\u0015R\u001c\u0010\u0018\u001a\u00020\u00038\u0006@\u0007X\u0087\u000e¢\u0006\f\n\u0004\b\u0017\u0010\u0014\"\u0004\b\u0016\u0010\u0015R\u001c\u0010\u0019\u001a\u00020\u00038\u0006@\u0007X\u0087\u000e¢\u0006\f\n\u0004\b\u0016\u0010\u0014\"\u0004\b\u0019\u0010\u0015R\u001c\u0010\u0013\u001a\u00020\u00038\u0006@\u0007X\u0087\u000e¢\u0006\f\n\u0004\b\u0019\u0010\u0014\"\u0004\b\u0018\u0010\u0015R\u001c\u0010\u0017\u001a\u00020\b8\u0006@\u0007X\u0087\u000e¢\u0006\f\n\u0004\b\u0018\u0010\u001a\"\u0004\b\u0013\u0010\u001b"}, d2 = {"Landroidx/compose/foundation/layout/PaddingNode;", "Landroidx/compose/ui/node/LayoutModifierNode;", "Landroidx/compose/ui/Modifier$Node;", "Landroidx/compose/ui/unit/Dp;", "p0", "p1", "p2", "p3", "", "p4", "<init>", "(FFFFZLkotlin/jvm/internal/DefaultConstructorMarker;)V", "Landroidx/compose/ui/layout/MeasureScope;", "Landroidx/compose/ui/layout/Measurable;", "Landroidx/compose/ui/unit/Constraints;", "Landroidx/compose/ui/layout/MeasureResult;", "measure-3p2s80s", "(Landroidx/compose/ui/layout/MeasureScope;Landroidx/compose/ui/layout/Measurable;J)Landroidx/compose/ui/layout/MeasureResult;", "measure", "getHighResolutionOutputSizeshNQ4ISI", com.adobe.marketing.mobile.internal.CoreConstants.Wrapper.Type.FLUTTER, "(F)V", "getHighSpeedVideoFpsRanges", "getHighSpeedVideoSizes", "getHighSpeedVideoFpsRangesFor", "Camera2StreamConfigurationMap", "Z", "(Z)V"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
final class PaddingNode extends androidx.compose.ui.Modifier.Node implements androidx.compose.ui.node.LayoutModifierNode {

    /* renamed from: Camera2StreamConfigurationMap, reason: from kotlin metadata */
    private float getHighResolutionOutputSizeshNQ4ISI;

    /* renamed from: getHighResolutionOutputSizeshNQ4ISI, reason: from kotlin metadata */
    private float getHighSpeedVideoFpsRanges;

    /* renamed from: getHighSpeedVideoFpsRanges, reason: from kotlin metadata */
    private float Camera2StreamConfigurationMap;

    /* renamed from: getHighSpeedVideoFpsRangesFor, reason: from kotlin metadata */
    private boolean getHighSpeedVideoSizes;

    /* renamed from: getHighSpeedVideoSizes, reason: from kotlin metadata */
    private float getHighSpeedVideoFpsRangesFor;

    private PaddingNode(float f, float f2, float f3, float f4, boolean z) {
        this.getHighSpeedVideoFpsRanges = f;
        this.getHighSpeedVideoFpsRangesFor = f2;
        this.Camera2StreamConfigurationMap = f3;
        this.getHighResolutionOutputSizeshNQ4ISI = f4;
        this.getHighSpeedVideoSizes = z;
    }

    public final void getHighResolutionOutputSizeshNQ4ISI(float f) {
        this.getHighSpeedVideoFpsRanges = f;
    }

    public final void getHighSpeedVideoFpsRanges(float f) {
        this.getHighSpeedVideoFpsRangesFor = f;
    }

    public final void Camera2StreamConfigurationMap(float f) {
        this.Camera2StreamConfigurationMap = f;
    }

    public final void getHighSpeedVideoFpsRangesFor(float f) {
        this.getHighResolutionOutputSizeshNQ4ISI = f;
    }

    public final void getHighResolutionOutputSizeshNQ4ISI(boolean z) {
        this.getHighSpeedVideoSizes = z;
    }

    @Override // androidx.compose.ui.node.LayoutModifierNode
    /* renamed from: measure-3p2s80s */
    public final androidx.compose.ui.layout.MeasureResult mo1117measure3p2s80s(androidx.compose.ui.layout.MeasureScope measureScope, androidx.compose.ui.layout.Measurable measurable, long j) {
        int i = measureScope.mo1412roundToPx0680j_4(this.getHighSpeedVideoFpsRanges) + measureScope.mo1412roundToPx0680j_4(this.Camera2StreamConfigurationMap);
        int i2 = measureScope.mo1412roundToPx0680j_4(this.getHighSpeedVideoFpsRangesFor) + measureScope.mo1412roundToPx0680j_4(this.getHighResolutionOutputSizeshNQ4ISI);
        final androidx.compose.ui.layout.Placeable mo7353measureBRTryo0 = measurable.mo7353measureBRTryo0(androidx.compose.ui.unit.ConstraintsKt.m8573offsetNN6EwU(j, -i, -i2));
        return androidx.compose.ui.layout.MeasureScope.layout$default(measureScope, androidx.compose.ui.unit.ConstraintsKt.m8571constrainWidthK40F9xA(j, mo7353measureBRTryo0.getWidth() + i), androidx.compose.ui.unit.ConstraintsKt.m8570constrainHeightK40F9xA(j, mo7353measureBRTryo0.getHeight() + i2), null, new kotlin.jvm.functions.Function1() { // from class: androidx.compose.foundation.layout.PaddingNode$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                kotlin.Unit highSpeedVideoSizes;
                highSpeedVideoSizes = androidx.compose.foundation.layout.PaddingNode.getHighSpeedVideoSizes(androidx.compose.foundation.layout.PaddingNode.this, mo7353measureBRTryo0, (androidx.compose.ui.layout.Placeable.PlacementScope) obj);
                return highSpeedVideoSizes;
            }
        }, 4, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final kotlin.Unit getHighSpeedVideoSizes(androidx.compose.foundation.layout.PaddingNode paddingNode, androidx.compose.ui.layout.Placeable placeable, androidx.compose.ui.layout.Placeable.PlacementScope placementScope) {
        if (paddingNode.getHighSpeedVideoSizes) {
            androidx.compose.ui.layout.Placeable.PlacementScope.placeRelative$default(placementScope, placeable, placementScope.mo1412roundToPx0680j_4(paddingNode.getHighSpeedVideoFpsRanges), placementScope.mo1412roundToPx0680j_4(paddingNode.getHighSpeedVideoFpsRangesFor), 0.0f, 4, null);
        } else {
            androidx.compose.ui.layout.Placeable.PlacementScope.place$default(placementScope, placeable, placementScope.mo1412roundToPx0680j_4(paddingNode.getHighSpeedVideoFpsRanges), placementScope.mo1412roundToPx0680j_4(paddingNode.getHighSpeedVideoFpsRangesFor), 0.0f, 4, null);
        }
        return kotlin.Unit.INSTANCE;
    }

    public /* synthetic */ PaddingNode(float f, float f2, float f3, float f4, boolean z, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this(f, f2, f3, f4, z);
    }
}
