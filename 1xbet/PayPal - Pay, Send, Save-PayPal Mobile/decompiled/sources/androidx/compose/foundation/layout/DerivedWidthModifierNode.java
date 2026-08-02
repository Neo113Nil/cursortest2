package androidx.compose.foundation.layout;

@kotlin.Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\b\u0002\u0018\u00002\u00020\u00012\u00020\u0002B4\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012#\u0010\n\u001a\u001f\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b0\u0005¢\u0006\u0002\b\t¢\u0006\u0004\b\u000b\u0010\fJ\u0017\u0010\r\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0003H\u0016¢\u0006\u0004\b\r\u0010\u000eJ\u000f\u0010\u0010\u001a\u00020\u000fH\u0016¢\u0006\u0004\b\u0010\u0010\u0011J:\u0010\u0012\u001a\u00020\u000f2\u0006\u0010\u0004\u001a\u00020\u00032#\u0010\n\u001a\u001f\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b0\u0005¢\u0006\u0002\b\t¢\u0006\u0004\b\u0012\u0010\fJ#\u0010\u0019\u001a\u00020\u0016*\u00020\u00132\u0006\u0010\u0004\u001a\u00020\u00142\u0006\u0010\n\u001a\u00020\u0015H\u0016¢\u0006\u0004\b\u0017\u0010\u0018R\u0016\u0010\u001c\u001a\u00020\u00038\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001a\u0010\u001bR3\u0010\u001d\u001a\u001f\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b0\u0005¢\u0006\u0002\b\t8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001d\u0010\u001eR\u0016\u0010\u0012\u001a\u00020\u00038\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0012\u0010\u001b"}, d2 = {"Landroidx/compose/foundation/layout/DerivedWidthModifierNode;", "Landroidx/compose/foundation/layout/InsetsConsumingModifierNode;", "Landroidx/compose/ui/node/LayoutModifierNode;", "Landroidx/compose/foundation/layout/WindowInsets;", "p0", "Lkotlin/Function3;", "Landroidx/compose/ui/unit/LayoutDirection;", "Landroidx/compose/ui/unit/Density;", "", "Lkotlin/ExtensionFunctionType;", "p1", "<init>", "(Landroidx/compose/foundation/layout/WindowInsets;Lkotlin/jvm/functions/Function3;)V", "calculateInsets", "(Landroidx/compose/foundation/layout/WindowInsets;)Landroidx/compose/foundation/layout/WindowInsets;", "", "insetsInvalidated", "()V", "getHighSpeedVideoFpsRangesFor", "Landroidx/compose/ui/layout/MeasureScope;", "Landroidx/compose/ui/layout/Measurable;", "Landroidx/compose/ui/unit/Constraints;", "Landroidx/compose/ui/layout/MeasureResult;", "measure-3p2s80s", "(Landroidx/compose/ui/layout/MeasureScope;Landroidx/compose/ui/layout/Measurable;J)Landroidx/compose/ui/layout/MeasureResult;", "measure", "Camera2StreamConfigurationMap", "Landroidx/compose/foundation/layout/WindowInsets;", "getHighResolutionOutputSizeshNQ4ISI", "getHighSpeedVideoFpsRanges", "Lkotlin/jvm/functions/Function3;"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
final class DerivedWidthModifierNode extends androidx.compose.foundation.layout.InsetsConsumingModifierNode implements androidx.compose.ui.node.LayoutModifierNode {

    /* renamed from: Camera2StreamConfigurationMap, reason: from kotlin metadata */
    private androidx.compose.foundation.layout.WindowInsets getHighResolutionOutputSizeshNQ4ISI;
    private kotlin.jvm.functions.Function3<? super androidx.compose.foundation.layout.WindowInsets, ? super androidx.compose.ui.unit.LayoutDirection, ? super androidx.compose.ui.unit.Density, java.lang.Integer> getHighSpeedVideoFpsRanges;
    private androidx.compose.foundation.layout.WindowInsets getHighSpeedVideoFpsRangesFor = androidx.compose.foundation.layout.WindowInsetsKt.WindowInsets();

    @Override // androidx.compose.foundation.layout.InsetsConsumingModifierNode
    public final androidx.compose.foundation.layout.WindowInsets calculateInsets(androidx.compose.foundation.layout.WindowInsets p0) {
        return p0;
    }

    public DerivedWidthModifierNode(androidx.compose.foundation.layout.WindowInsets windowInsets, kotlin.jvm.functions.Function3<? super androidx.compose.foundation.layout.WindowInsets, ? super androidx.compose.ui.unit.LayoutDirection, ? super androidx.compose.ui.unit.Density, java.lang.Integer> function3) {
        this.getHighResolutionOutputSizeshNQ4ISI = windowInsets;
        this.getHighSpeedVideoFpsRanges = function3;
    }

    @Override // androidx.compose.foundation.layout.InsetsConsumingModifierNode
    public final void insetsInvalidated() {
        this.getHighSpeedVideoFpsRangesFor = androidx.compose.foundation.layout.WindowInsetsKt.exclude(this.getHighResolutionOutputSizeshNQ4ISI, getAncestorConsumedInsets());
        super.insetsInvalidated();
        androidx.compose.ui.node.LayoutModifierNodeKt.invalidateMeasurement(this);
    }

    public final void getHighSpeedVideoFpsRangesFor(androidx.compose.foundation.layout.WindowInsets p0, kotlin.jvm.functions.Function3<? super androidx.compose.foundation.layout.WindowInsets, ? super androidx.compose.ui.unit.LayoutDirection, ? super androidx.compose.ui.unit.Density, java.lang.Integer> p1) {
        if (kotlin.jvm.internal.Intrinsics.areEqual(this.getHighResolutionOutputSizeshNQ4ISI, p0) && p1 == this.getHighSpeedVideoFpsRanges) {
            return;
        }
        this.getHighResolutionOutputSizeshNQ4ISI = p0;
        this.getHighSpeedVideoFpsRanges = p1;
        this.getHighSpeedVideoFpsRangesFor = androidx.compose.foundation.layout.WindowInsetsKt.exclude(p0, getAncestorConsumedInsets());
        androidx.compose.ui.node.LayoutModifierNodeKt.invalidateMeasurement(this);
    }

    @Override // androidx.compose.ui.node.LayoutModifierNode
    /* renamed from: measure-3p2s80s */
    public final androidx.compose.ui.layout.MeasureResult mo1117measure3p2s80s(androidx.compose.ui.layout.MeasureScope measureScope, androidx.compose.ui.layout.Measurable measurable, long j) {
        int intValue = this.getHighSpeedVideoFpsRanges.invoke(this.getHighSpeedVideoFpsRangesFor, measureScope.getLayoutDirection(), measureScope).intValue();
        if (intValue == 0) {
            return androidx.compose.ui.layout.MeasureScope.layout$default(measureScope, 0, 0, null, new kotlin.jvm.functions.Function1() { // from class: androidx.compose.foundation.layout.DerivedWidthModifierNode$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    kotlin.Unit Camera2StreamConfigurationMap;
                    Camera2StreamConfigurationMap = androidx.compose.foundation.layout.DerivedWidthModifierNode.Camera2StreamConfigurationMap();
                    return Camera2StreamConfigurationMap;
                }
            }, 4, null);
        }
        final androidx.compose.ui.layout.Placeable mo7353measureBRTryo0 = measurable.mo7353measureBRTryo0(androidx.compose.ui.unit.Constraints.m8545copyZbe2FdA$default(j, intValue, intValue, 0, 0, 12, null));
        return androidx.compose.ui.layout.MeasureScope.layout$default(measureScope, intValue, mo7353measureBRTryo0.getHeight(), null, new kotlin.jvm.functions.Function1() { // from class: androidx.compose.foundation.layout.DerivedWidthModifierNode$$ExternalSyntheticLambda1
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                kotlin.Unit Camera2StreamConfigurationMap;
                Camera2StreamConfigurationMap = androidx.compose.foundation.layout.DerivedWidthModifierNode.Camera2StreamConfigurationMap(androidx.compose.ui.layout.Placeable.this, (androidx.compose.ui.layout.Placeable.PlacementScope) obj);
                return Camera2StreamConfigurationMap;
            }
        }, 4, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final kotlin.Unit Camera2StreamConfigurationMap() {
        return kotlin.Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final kotlin.Unit Camera2StreamConfigurationMap(androidx.compose.ui.layout.Placeable placeable, androidx.compose.ui.layout.Placeable.PlacementScope placementScope) {
        androidx.compose.ui.layout.Placeable.PlacementScope.placeRelative$default(placementScope, placeable, 0, 0, 0.0f, 4, null);
        return kotlin.Unit.INSTANCE;
    }
}
