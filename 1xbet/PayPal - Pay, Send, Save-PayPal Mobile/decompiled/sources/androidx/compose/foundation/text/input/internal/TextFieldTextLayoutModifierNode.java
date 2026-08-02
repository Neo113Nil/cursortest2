package androidx.compose.foundation.text.input.internal;

@kotlin.Metadata(d1 = {"\u0000\u0086\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010%\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\b\u0000\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u00032\u00020\u0004B]\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u0006\u0010\f\u001a\u00020\u000b\u0012,\u0010\u0014\u001a(\u0012\u0004\u0012\u00020\u000e\u0012\u0011\u0012\u000f\u0012\u0006\u0012\u0004\u0018\u00010\u00100\u000f¢\u0006\u0002\b\u0011\u0012\u0004\u0012\u00020\u0012\u0018\u00010\r¢\u0006\u0002\b\u0013\u0012\u0006\u0010\u0016\u001a\u00020\u0015¢\u0006\u0004\b\u0017\u0010\u0018Jc\u0010\u0019\u001a\u00020\u00122\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\u000b2,\u0010\u0014\u001a(\u0012\u0004\u0012\u00020\u000e\u0012\u0011\u0012\u000f\u0012\u0006\u0012\u0004\u0018\u00010\u00100\u000f¢\u0006\u0002\b\u0011\u0012\u0004\u0012\u00020\u0012\u0018\u00010\r¢\u0006\u0002\b\u00132\u0006\u0010\u0016\u001a\u00020\u0015¢\u0006\u0004\b\u0019\u0010\u0018J\u0017\u0010\u001c\u001a\u00020\u00122\u0006\u0010\u001b\u001a\u00020\u001aH\u0016¢\u0006\u0004\b\u001c\u0010\u001dJ#\u0010&\u001a\u00020#*\u00020\u001e2\u0006\u0010 \u001a\u00020\u001f2\u0006\u0010\"\u001a\u00020!H\u0016¢\u0006\u0004\b$\u0010%R\u0016\u0010)\u001a\u00020\u00058\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b'\u0010(R\u0016\u0010,\u001a\u00020\u000b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b*\u0010+R\u0014\u0010'\u001a\u00020-8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b,\u0010.R$\u0010*\u001a\u0010\u0012\u0004\u0012\u000200\u0012\u0004\u0012\u000201\u0018\u00010/8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b)\u00102"}, d2 = {"Landroidx/compose/foundation/text/input/internal/TextFieldTextLayoutModifierNode;", "Landroidx/compose/ui/node/DelegatingNode;", "Landroidx/compose/ui/node/LayoutModifierNode;", "Landroidx/compose/ui/node/GlobalPositionAwareModifierNode;", "Landroidx/compose/ui/node/CompositionLocalConsumerModifierNode;", "Landroidx/compose/foundation/text/input/internal/TextLayoutState;", "textLayoutState", "Landroidx/compose/foundation/text/input/internal/TransformedTextFieldState;", "textFieldState", "Landroidx/compose/ui/text/TextStyle;", "textStyle", "", "singleLine", "Lkotlin/Function2;", "Landroidx/compose/ui/unit/Density;", "Lkotlin/Function0;", "Landroidx/compose/ui/text/TextLayoutResult;", "Lkotlin/ParameterName;", "", "Lkotlin/ExtensionFunctionType;", "onTextLayout", "Landroidx/compose/foundation/text/KeyboardOptions;", "keyboardOptions", "<init>", "(Landroidx/compose/foundation/text/input/internal/TextLayoutState;Landroidx/compose/foundation/text/input/internal/TransformedTextFieldState;Landroidx/compose/ui/text/TextStyle;ZLkotlin/jvm/functions/Function2;Landroidx/compose/foundation/text/KeyboardOptions;)V", "updateNode", "Landroidx/compose/ui/layout/LayoutCoordinates;", "coordinates", "onGloballyPositioned", "(Landroidx/compose/ui/layout/LayoutCoordinates;)V", "Landroidx/compose/ui/layout/MeasureScope;", "Landroidx/compose/ui/layout/Measurable;", "measurable", "Landroidx/compose/ui/unit/Constraints;", "constraints", "Landroidx/compose/ui/layout/MeasureResult;", "measure-3p2s80s", "(Landroidx/compose/ui/layout/MeasureScope;Landroidx/compose/ui/layout/Measurable;J)Landroidx/compose/ui/layout/MeasureResult;", "measure", "getHighSpeedVideoFpsRangesFor", "Landroidx/compose/foundation/text/input/internal/TextLayoutState;", "getHighSpeedVideoSizes", "Camera2StreamConfigurationMap", "Z", "getHighSpeedVideoFpsRanges", "Landroidx/compose/foundation/relocation/BringIntoViewRequesterNode;", "Landroidx/compose/foundation/relocation/BringIntoViewRequesterNode;", "", "Landroidx/compose/ui/layout/AlignmentLine;", "", "Ljava/util/Map;"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class TextFieldTextLayoutModifierNode extends androidx.compose.ui.node.DelegatingNode implements androidx.compose.ui.node.LayoutModifierNode, androidx.compose.ui.node.GlobalPositionAwareModifierNode, androidx.compose.ui.node.CompositionLocalConsumerModifierNode {
    public static final int $stable = 8;

    /* renamed from: Camera2StreamConfigurationMap, reason: from kotlin metadata */
    private boolean getHighSpeedVideoFpsRanges;

    /* renamed from: getHighSpeedVideoFpsRanges, reason: from kotlin metadata */
    private final androidx.compose.foundation.relocation.BringIntoViewRequesterNode getHighSpeedVideoFpsRangesFor;

    /* renamed from: getHighSpeedVideoFpsRangesFor, reason: from kotlin metadata */
    private androidx.compose.foundation.text.input.internal.TextLayoutState getHighSpeedVideoSizes;

    /* renamed from: getHighSpeedVideoSizes, reason: from kotlin metadata */
    private java.util.Map<androidx.compose.ui.layout.AlignmentLine, java.lang.Integer> Camera2StreamConfigurationMap;

    public TextFieldTextLayoutModifierNode(androidx.compose.foundation.text.input.internal.TextLayoutState textLayoutState, androidx.compose.foundation.text.input.internal.TransformedTextFieldState transformedTextFieldState, androidx.compose.ui.text.TextStyle textStyle, boolean z, kotlin.jvm.functions.Function2<? super androidx.compose.ui.unit.Density, ? super kotlin.jvm.functions.Function0<androidx.compose.ui.text.TextLayoutResult>, kotlin.Unit> function2, androidx.compose.foundation.text.KeyboardOptions keyboardOptions) {
        this.getHighSpeedVideoSizes = textLayoutState;
        this.getHighSpeedVideoFpsRanges = z;
        this.getHighSpeedVideoFpsRangesFor = (androidx.compose.foundation.relocation.BringIntoViewRequesterNode) delegate(new androidx.compose.foundation.relocation.BringIntoViewRequesterNode(this.getHighSpeedVideoSizes.getBringIntoViewRequester()));
        this.getHighSpeedVideoSizes.setOnTextLayout(function2);
        androidx.compose.foundation.text.input.internal.TextLayoutState textLayoutState2 = this.getHighSpeedVideoSizes;
        boolean z2 = this.getHighSpeedVideoFpsRanges;
        textLayoutState2.updateNonMeasureInputs(transformedTextFieldState, textStyle, z2, !z2, keyboardOptions);
    }

    public final void updateNode(androidx.compose.foundation.text.input.internal.TextLayoutState textLayoutState, androidx.compose.foundation.text.input.internal.TransformedTextFieldState textFieldState, androidx.compose.ui.text.TextStyle textStyle, boolean singleLine, kotlin.jvm.functions.Function2<? super androidx.compose.ui.unit.Density, ? super kotlin.jvm.functions.Function0<androidx.compose.ui.text.TextLayoutResult>, kotlin.Unit> onTextLayout, androidx.compose.foundation.text.KeyboardOptions keyboardOptions) {
        androidx.compose.foundation.text.input.internal.TextLayoutState textLayoutState2 = this.getHighSpeedVideoSizes;
        this.getHighSpeedVideoSizes = textLayoutState;
        textLayoutState.setOnTextLayout(onTextLayout);
        this.getHighSpeedVideoFpsRanges = singleLine;
        this.getHighSpeedVideoSizes.updateNonMeasureInputs(textFieldState, textStyle, singleLine, !singleLine, keyboardOptions);
        if (kotlin.jvm.internal.Intrinsics.areEqual(textLayoutState2, textLayoutState)) {
            return;
        }
        this.getHighSpeedVideoFpsRangesFor.updateRequester(textLayoutState.getBringIntoViewRequester());
    }

    @Override // androidx.compose.ui.node.GlobalPositionAwareModifierNode
    public final void onGloballyPositioned(androidx.compose.ui.layout.LayoutCoordinates coordinates) {
        this.getHighSpeedVideoSizes.setTextLayoutNodeCoordinates(coordinates);
    }

    @Override // androidx.compose.ui.node.LayoutModifierNode
    /* renamed from: measure-3p2s80s */
    public final androidx.compose.ui.layout.MeasureResult mo1117measure3p2s80s(androidx.compose.ui.layout.MeasureScope measureScope, androidx.compose.ui.layout.Measurable measurable, long j) {
        float m8601constructorimpl;
        androidx.compose.ui.text.TextLayoutResult m2261layoutWithNewMeasureInputshBUhpc = this.getHighSpeedVideoSizes.m2261layoutWithNewMeasureInputshBUhpc(measureScope, measureScope.getLayoutDirection(), (androidx.compose.ui.text.font.FontFamily.Resolver) androidx.compose.ui.node.CompositionLocalConsumerModifierNodeKt.currentValueOf(this, androidx.compose.ui.platform.CompositionLocalsKt.getLocalFontFamilyResolver()), j);
        final androidx.compose.ui.layout.Placeable mo7353measureBRTryo0 = measurable.mo7353measureBRTryo0(androidx.compose.ui.unit.Constraints.INSTANCE.m8563fitPrioritizingWidthZbe2FdA((int) (m2261layoutWithNewMeasureInputshBUhpc.getSize() >> 32), (int) (m2261layoutWithNewMeasureInputshBUhpc.getSize() >> 32), (int) (m2261layoutWithNewMeasureInputshBUhpc.getSize() & 4294967295L), (int) (m2261layoutWithNewMeasureInputshBUhpc.getSize() & 4294967295L)));
        androidx.compose.foundation.text.input.internal.TextLayoutState textLayoutState = this.getHighSpeedVideoSizes;
        if (this.getHighSpeedVideoFpsRanges) {
            m8601constructorimpl = measureScope.mo1415toDpu2uoSUM(androidx.compose.foundation.text.TextDelegateKt.ceilToIntPx(m2261layoutWithNewMeasureInputshBUhpc.getLineBottom(0)));
        } else {
            m8601constructorimpl = androidx.compose.ui.unit.Dp.m8601constructorimpl(0.0f);
        }
        textLayoutState.m2262setMinHeightForSingleLineField0680j_4(m8601constructorimpl);
        java.util.LinkedHashMap linkedHashMap = this.Camera2StreamConfigurationMap;
        if (linkedHashMap == null) {
            linkedHashMap = new java.util.LinkedHashMap(2);
        }
        linkedHashMap.put(androidx.compose.ui.layout.AlignmentLineKt.getFirstBaseline(), java.lang.Integer.valueOf(java.lang.Math.round(m2261layoutWithNewMeasureInputshBUhpc.getFirstBaseline())));
        linkedHashMap.put(androidx.compose.ui.layout.AlignmentLineKt.getLastBaseline(), java.lang.Integer.valueOf(java.lang.Math.round(m2261layoutWithNewMeasureInputshBUhpc.getLastBaseline())));
        this.Camera2StreamConfigurationMap = linkedHashMap;
        int size = (int) (m2261layoutWithNewMeasureInputshBUhpc.getSize() >> 32);
        int size2 = (int) (m2261layoutWithNewMeasureInputshBUhpc.getSize() & 4294967295L);
        java.util.Map<androidx.compose.ui.layout.AlignmentLine, java.lang.Integer> map = this.Camera2StreamConfigurationMap;
        kotlin.jvm.internal.Intrinsics.checkNotNull(map);
        return measureScope.layout(size, size2, map, new kotlin.jvm.functions.Function1() { // from class: androidx.compose.foundation.text.input.internal.TextFieldTextLayoutModifierNode$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return androidx.compose.foundation.text.input.internal.TextFieldTextLayoutModifierNode.m2255$r8$lambda$hHzmgYt1YzDNxVvYW0xAJ6um_Y(androidx.compose.ui.layout.Placeable.this, (androidx.compose.ui.layout.Placeable.PlacementScope) obj);
            }
        });
    }

    /* renamed from: $r8$lambda$hHzmgYt1YzDNxVvYW0xA-J6um_Y, reason: not valid java name */
    public static /* synthetic */ kotlin.Unit m2255$r8$lambda$hHzmgYt1YzDNxVvYW0xAJ6um_Y(androidx.compose.ui.layout.Placeable placeable, androidx.compose.ui.layout.Placeable.PlacementScope placementScope) {
        androidx.compose.ui.layout.Placeable.PlacementScope.place$default(placementScope, placeable, 0, 0, 0.0f, 4, null);
        return kotlin.Unit.INSTANCE;
    }
}
