package androidx.compose.foundation.layout;

@kotlin.Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\n\b\u0002\u0018\u00002\u00020\u00012\u00020\u0002B(\u0012\u0017\u0010\u0007\u001a\u0013\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0003¢\u0006\u0002\b\u0006\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJ.\u0010\r\u001a\u00020\f2\u0017\u0010\u0007\u001a\u0013\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0003¢\u0006\u0002\b\u00062\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\r\u0010\u000bJ#\u0010\u0014\u001a\u00020\u0011*\u00020\u000e2\u0006\u0010\u0007\u001a\u00020\u000f2\u0006\u0010\t\u001a\u00020\u0010H\u0016¢\u0006\u0004\b\u0012\u0010\u0013R'\u0010\u0015\u001a\u0013\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0003¢\u0006\u0002\b\u00068\u0006@\u0006X\u0086\f¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R\u0016\u0010\r\u001a\u00020\b8\u0006@\u0006X\u0086\f¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018R\u001a\u0010\u001b\u001a\u00020\b8\u0017X\u0096D¢\u0006\f\n\u0004\b\r\u0010\u0018\u001a\u0004\b\u0019\u0010\u001a"}, d2 = {"Landroidx/compose/foundation/layout/OffsetPxNode;", "Landroidx/compose/ui/node/LayoutModifierNode;", "Landroidx/compose/ui/Modifier$Node;", "Lkotlin/Function1;", "Landroidx/compose/ui/unit/Density;", "Landroidx/compose/ui/unit/IntOffset;", "Lkotlin/ExtensionFunctionType;", "p0", "", "p1", "<init>", "(Lkotlin/jvm/functions/Function1;Z)V", "", "getHighResolutionOutputSizeshNQ4ISI", "Landroidx/compose/ui/layout/MeasureScope;", "Landroidx/compose/ui/layout/Measurable;", "Landroidx/compose/ui/unit/Constraints;", "Landroidx/compose/ui/layout/MeasureResult;", "measure-3p2s80s", "(Landroidx/compose/ui/layout/MeasureScope;Landroidx/compose/ui/layout/Measurable;J)Landroidx/compose/ui/layout/MeasureResult;", "measure", "getHighSpeedVideoFpsRanges", "Lkotlin/jvm/functions/Function1;", "getHighSpeedVideoFpsRangesFor", "Z", "getShouldAutoInvalidate", "()Z", "Camera2StreamConfigurationMap"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
final class OffsetPxNode extends androidx.compose.ui.Modifier.Node implements androidx.compose.ui.node.LayoutModifierNode {

    /* renamed from: getHighResolutionOutputSizeshNQ4ISI, reason: from kotlin metadata */
    private final boolean Camera2StreamConfigurationMap;
    public kotlin.jvm.functions.Function1<? super androidx.compose.ui.unit.Density, androidx.compose.ui.unit.IntOffset> getHighSpeedVideoFpsRanges;

    /* renamed from: getHighSpeedVideoFpsRangesFor, reason: from kotlin metadata */
    public boolean getHighResolutionOutputSizeshNQ4ISI;

    public OffsetPxNode(kotlin.jvm.functions.Function1<? super androidx.compose.ui.unit.Density, androidx.compose.ui.unit.IntOffset> function1, boolean z) {
        this.getHighSpeedVideoFpsRanges = function1;
        this.getHighResolutionOutputSizeshNQ4ISI = z;
    }

    @Override // androidx.compose.ui.Modifier.Node
    public final boolean getShouldAutoInvalidate() {
        return this.Camera2StreamConfigurationMap;
    }

    public final void getHighResolutionOutputSizeshNQ4ISI(kotlin.jvm.functions.Function1<? super androidx.compose.ui.unit.Density, androidx.compose.ui.unit.IntOffset> p0, boolean p1) {
        if (this.getHighSpeedVideoFpsRanges != p0 || this.getHighResolutionOutputSizeshNQ4ISI != p1) {
            androidx.compose.ui.node.LayoutModifierNodeKt.invalidatePlacement(this);
        }
        this.getHighSpeedVideoFpsRanges = p0;
        this.getHighResolutionOutputSizeshNQ4ISI = p1;
    }

    @Override // androidx.compose.ui.node.LayoutModifierNode
    /* renamed from: measure-3p2s80s */
    public final androidx.compose.ui.layout.MeasureResult mo1117measure3p2s80s(androidx.compose.ui.layout.MeasureScope measureScope, androidx.compose.ui.layout.Measurable measurable, long j) {
        final androidx.compose.ui.layout.Placeable mo7353measureBRTryo0 = measurable.mo7353measureBRTryo0(j);
        return androidx.compose.ui.layout.MeasureScope.layout$default(measureScope, mo7353measureBRTryo0.getWidth(), mo7353measureBRTryo0.getHeight(), null, new kotlin.jvm.functions.Function1() { // from class: androidx.compose.foundation.layout.OffsetPxNode$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                kotlin.Unit Camera2StreamConfigurationMap;
                Camera2StreamConfigurationMap = androidx.compose.foundation.layout.OffsetPxNode.Camera2StreamConfigurationMap(androidx.compose.foundation.layout.OffsetPxNode.this, mo7353measureBRTryo0, (androidx.compose.ui.layout.Placeable.PlacementScope) obj);
                return Camera2StreamConfigurationMap;
            }
        }, 4, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final kotlin.Unit Camera2StreamConfigurationMap(androidx.compose.foundation.layout.OffsetPxNode offsetPxNode, androidx.compose.ui.layout.Placeable placeable, androidx.compose.ui.layout.Placeable.PlacementScope placementScope) {
        long m8738unboximpl = offsetPxNode.getHighSpeedVideoFpsRanges.invoke(placementScope).m8738unboximpl();
        if (offsetPxNode.getHighResolutionOutputSizeshNQ4ISI) {
            androidx.compose.ui.layout.Placeable.PlacementScope.placeRelativeWithLayer$default(placementScope, placeable, androidx.compose.ui.unit.IntOffset.m8729getXimpl(m8738unboximpl), androidx.compose.ui.unit.IntOffset.m8730getYimpl(m8738unboximpl), 0.0f, (kotlin.jvm.functions.Function1) null, 12, (java.lang.Object) null);
        } else {
            androidx.compose.ui.layout.Placeable.PlacementScope.placeWithLayer$default(placementScope, placeable, androidx.compose.ui.unit.IntOffset.m8729getXimpl(m8738unboximpl), androidx.compose.ui.unit.IntOffset.m8730getYimpl(m8738unboximpl), 0.0f, (kotlin.jvm.functions.Function1) null, 12, (java.lang.Object) null);
        }
        return kotlin.Unit.INSTANCE;
    }
}
