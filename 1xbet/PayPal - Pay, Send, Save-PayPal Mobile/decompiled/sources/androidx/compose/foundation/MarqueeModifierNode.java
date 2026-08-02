package androidx.compose.foundation;

@kotlin.Metadata(d1 = {"\u0000\u008e\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0002\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u00032\u00020\u0004B7\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\t\u001a\u00020\u0005\u0012\u0006\u0010\n\u001a\u00020\u0005\u0012\u0006\u0010\f\u001a\u00020\u000b\u0012\u0006\u0010\u000e\u001a\u00020\r¢\u0006\u0004\b\u000f\u0010\u0010J\u000f\u0010\u0012\u001a\u00020\u0011H\u0016¢\u0006\u0004\b\u0012\u0010\u0013J\u000f\u0010\u0014\u001a\u00020\u0011H\u0016¢\u0006\u0004\b\u0014\u0010\u0013J\u0017\u0010\u0016\u001a\u00020\u00112\u0006\u0010\u0006\u001a\u00020\u0015H\u0016¢\u0006\u0004\b\u0016\u0010\u0017J#\u0010\u001e\u001a\u00020\u001b*\u00020\u00182\u0006\u0010\u0006\u001a\u00020\u00192\u0006\u0010\b\u001a\u00020\u001aH\u0016¢\u0006\u0004\b\u001c\u0010\u001dJ#\u0010!\u001a\u00020\u0005*\u00020\u001f2\u0006\u0010\u0006\u001a\u00020 2\u0006\u0010\b\u001a\u00020\u0005H\u0016¢\u0006\u0004\b!\u0010\"J#\u0010#\u001a\u00020\u0005*\u00020\u001f2\u0006\u0010\u0006\u001a\u00020 2\u0006\u0010\b\u001a\u00020\u0005H\u0016¢\u0006\u0004\b#\u0010\"J#\u0010$\u001a\u00020\u0005*\u00020\u001f2\u0006\u0010\u0006\u001a\u00020 2\u0006\u0010\b\u001a\u00020\u0005H\u0016¢\u0006\u0004\b$\u0010\"J#\u0010%\u001a\u00020\u0005*\u00020\u001f2\u0006\u0010\u0006\u001a\u00020 2\u0006\u0010\b\u001a\u00020\u0005H\u0016¢\u0006\u0004\b%\u0010\"J\u0013\u0010'\u001a\u00020\u0011*\u00020&H\u0016¢\u0006\u0004\b'\u0010(J\u000f\u0010)\u001a\u00020\u0011H\u0002¢\u0006\u0004\b)\u0010\u0013R\u0016\u0010+\u001a\u00020\u00058\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b)\u0010*R\u0016\u0010,\u001a\u00020\u00058\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b+\u0010*R\u0016\u0010)\u001a\u00020\u00058\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b-\u0010*R\u0016\u0010.\u001a\u00020\r8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b.\u0010/R+\u0010-\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00058C@CX\u0082\u008e\u0002¢\u0006\u0012\n\u0004\b0\u00101\u001a\u0004\b,\u00102\"\u0004\b+\u00103R+\u00105\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00058C@CX\u0083\u008e\u0002¢\u0006\u0012\n\u0004\b4\u00101\u001a\u0004\b.\u00102\"\u0004\b)\u00103R+\u00100\u001a\u0002062\u0006\u0010\u0006\u001a\u0002068C@CX\u0083\u008e\u0002¢\u0006\u0012\n\u0004\b7\u00108\u001a\u0004\b-\u00109\"\u0004\b,\u0010:R\u0018\u00107\u001a\u0004\u0018\u00010;8\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b,\u0010<R\u0018\u00104\u001a\u0004\u0018\u00010=8\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b>\u0010?R%\u0010>\u001a\u00020\u000b2\u0006\u0010\u0006\u001a\u00020\u000b8F@GX\u0087\u008e\u0002¢\u0006\f\n\u0004\b@\u00108\"\u0004\b+\u0010AR+\u0010B\u001a\u00020\u00072\u0006\u0010\u0006\u001a\u00020\u00078G@GX\u0087\u008e\u0002¢\u0006\u0012\n\u0004\b5\u00108\u001a\u0004\b+\u00102\"\u0004\b,\u00103R \u0010@\u001a\u000e\u0012\u0004\u0012\u00020D\u0012\u0004\u0012\u00020E0C8\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\bF\u0010GR\u001b\u0010F\u001a\u00020\u00058CX\u0083\u0084\u0002¢\u0006\f\n\u0004\bH\u0010I\u001a\u0004\b5\u00102"}, d2 = {"Landroidx/compose/foundation/MarqueeModifierNode;", "Landroidx/compose/ui/Modifier$Node;", "Landroidx/compose/ui/node/LayoutModifierNode;", "Landroidx/compose/ui/node/DrawModifierNode;", "Landroidx/compose/ui/focus/FocusEventModifierNode;", "", "p0", "Landroidx/compose/foundation/MarqueeAnimationMode;", "p1", "p2", "p3", "Landroidx/compose/foundation/MarqueeSpacing;", "p4", "Landroidx/compose/ui/unit/Dp;", "p5", "<init>", "(IIIILandroidx/compose/foundation/MarqueeSpacing;FLkotlin/jvm/internal/DefaultConstructorMarker;)V", "", "onAttach", "()V", "onDetach", "Landroidx/compose/ui/focus/FocusState;", "onFocusEvent", "(Landroidx/compose/ui/focus/FocusState;)V", "Landroidx/compose/ui/layout/MeasureScope;", "Landroidx/compose/ui/layout/Measurable;", "Landroidx/compose/ui/unit/Constraints;", "Landroidx/compose/ui/layout/MeasureResult;", "measure-3p2s80s", "(Landroidx/compose/ui/layout/MeasureScope;Landroidx/compose/ui/layout/Measurable;J)Landroidx/compose/ui/layout/MeasureResult;", "measure", "Landroidx/compose/ui/layout/IntrinsicMeasureScope;", "Landroidx/compose/ui/layout/IntrinsicMeasurable;", "minIntrinsicWidth", "(Landroidx/compose/ui/layout/IntrinsicMeasureScope;Landroidx/compose/ui/layout/IntrinsicMeasurable;I)I", "maxIntrinsicWidth", "minIntrinsicHeight", "maxIntrinsicHeight", "Landroidx/compose/ui/graphics/drawscope/ContentDrawScope;", "draw", "(Landroidx/compose/ui/graphics/drawscope/ContentDrawScope;)V", "getHighResolutionOutputSizeshNQ4ISI", com.visa.cbp.getEncExpo.warmup, "getHighSpeedVideoFpsRanges", "getHighSpeedVideoFpsRangesFor", "Camera2StreamConfigurationMap", "getHighSpeedVideoSizes", com.adobe.marketing.mobile.internal.CoreConstants.Wrapper.Type.FLUTTER, "getHighSpeedVideoSizesFor", "Landroidx/compose/runtime/MutableIntState;", "()I", "(I)V", "getInputSizeshNQ4ISI", "getOutputMinFrameDuration", "", "getInputFormats", "Landroidx/compose/runtime/MutableState;", "()Z", "(Z)V", "Lkotlinx/coroutines/Job;", "Lkotlinx/coroutines/Job;", "Landroidx/compose/ui/graphics/layer/GraphicsLayer;", "getOutputFormats", "Landroidx/compose/ui/graphics/layer/GraphicsLayer;", "getOutputSizes", "(Landroidx/compose/foundation/MarqueeSpacing;)V", "getOutputSizeshNQ4ISI", "Landroidx/compose/animation/core/Animatable;", "", "Landroidx/compose/animation/core/AnimationVector1D;", "getOutputStallDuration", "Landroidx/compose/animation/core/Animatable;", "getOutputMinFrameDurationlomOqCM", "Landroidx/compose/runtime/State;"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
final class MarqueeModifierNode extends androidx.compose.ui.Modifier.Node implements androidx.compose.ui.node.LayoutModifierNode, androidx.compose.ui.node.DrawModifierNode, androidx.compose.ui.focus.FocusEventModifierNode {

    /* renamed from: Camera2StreamConfigurationMap, reason: from kotlin metadata */
    int getHighResolutionOutputSizeshNQ4ISI;

    /* renamed from: getHighResolutionOutputSizeshNQ4ISI, reason: from kotlin metadata */
    int getHighSpeedVideoFpsRanges;

    /* renamed from: getHighSpeedVideoFpsRanges, reason: from kotlin metadata */
    int getHighSpeedVideoFpsRangesFor;

    /* renamed from: getHighSpeedVideoFpsRangesFor, reason: from kotlin metadata */
    private kotlinx.coroutines.Job getInputFormats;
    float getHighSpeedVideoSizes;

    /* renamed from: getHighSpeedVideoSizesFor, reason: from kotlin metadata */
    private final androidx.compose.runtime.MutableIntState Camera2StreamConfigurationMap;

    /* renamed from: getInputFormats, reason: from kotlin metadata */
    private final androidx.compose.runtime.MutableState getHighSpeedVideoSizesFor;

    /* renamed from: getInputSizeshNQ4ISI, reason: from kotlin metadata */
    private final androidx.compose.runtime.MutableIntState getOutputMinFrameDuration;

    /* renamed from: getOutputFormats, reason: from kotlin metadata */
    private androidx.compose.ui.graphics.layer.GraphicsLayer getInputSizeshNQ4ISI;

    /* renamed from: getOutputMinFrameDuration, reason: from kotlin metadata */
    private final androidx.compose.runtime.MutableState getOutputSizeshNQ4ISI;

    /* renamed from: getOutputMinFrameDurationlomOqCM, reason: from kotlin metadata */
    private final androidx.compose.runtime.State getOutputStallDuration;

    /* renamed from: getOutputSizes, reason: from kotlin metadata */
    private final androidx.compose.runtime.MutableState getOutputFormats;

    /* renamed from: getOutputStallDuration, reason: from kotlin metadata */
    private final androidx.compose.animation.core.Animatable<java.lang.Float, androidx.compose.animation.core.AnimationVector1D> getOutputSizes;

    @Override // androidx.compose.ui.node.LayoutModifierNode
    public final int minIntrinsicWidth(androidx.compose.ui.layout.IntrinsicMeasureScope intrinsicMeasureScope, androidx.compose.ui.layout.IntrinsicMeasurable intrinsicMeasurable, int i) {
        return 0;
    }

    private MarqueeModifierNode(int i, int i2, int i3, int i4, final androidx.compose.foundation.MarqueeSpacing marqueeSpacing, float f) {
        this.getHighSpeedVideoFpsRanges = i;
        this.getHighSpeedVideoFpsRangesFor = i3;
        this.getHighResolutionOutputSizeshNQ4ISI = i4;
        this.getHighSpeedVideoSizes = f;
        this.Camera2StreamConfigurationMap = androidx.compose.runtime.SnapshotIntStateKt.mutableIntStateOf(0);
        this.getOutputMinFrameDuration = androidx.compose.runtime.SnapshotIntStateKt.mutableIntStateOf(0);
        this.getHighSpeedVideoSizesFor = androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(java.lang.Boolean.FALSE, null, 2, null);
        this.getOutputFormats = androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(marqueeSpacing, null, 2, null);
        this.getOutputSizeshNQ4ISI = androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(androidx.compose.foundation.MarqueeAnimationMode.m1350boximpl(i2), null, 2, null);
        this.getOutputSizes = androidx.compose.animation.core.AnimatableKt.Animatable$default(0.0f, 0.0f, 2, null);
        this.getOutputStallDuration = androidx.compose.runtime.SnapshotStateKt.derivedStateOf(new kotlin.jvm.functions.Function0() { // from class: androidx.compose.foundation.MarqueeModifierNode$$ExternalSyntheticLambda2
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                int calculateSpacing;
                calculateSpacing = androidx.compose.foundation.MarqueeSpacing.this.calculateSpacing(androidx.compose.ui.node.DelegatableNodeKt.requireDensity(r1), r1.getHighSpeedVideoFpsRangesFor(), this.getHighSpeedVideoSizes());
                return java.lang.Integer.valueOf(calculateSpacing);
            }
        });
    }

    private final void getHighSpeedVideoFpsRanges(int i) {
        this.Camera2StreamConfigurationMap.setIntValue(i);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final int getHighSpeedVideoFpsRangesFor() {
        return this.Camera2StreamConfigurationMap.getIntValue();
    }

    private final void getHighResolutionOutputSizeshNQ4ISI(int i) {
        this.getOutputMinFrameDuration.setIntValue(i);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final int getHighSpeedVideoSizes() {
        return this.getOutputMinFrameDuration.getIntValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public final boolean Camera2StreamConfigurationMap() {
        return ((java.lang.Boolean) this.getHighSpeedVideoSizesFor.getValue()).booleanValue();
    }

    private final void getHighSpeedVideoFpsRangesFor(boolean z) {
        this.getHighSpeedVideoSizesFor.setValue(java.lang.Boolean.valueOf(z));
    }

    public final void getHighSpeedVideoFpsRanges(androidx.compose.foundation.MarqueeSpacing marqueeSpacing) {
        this.getOutputFormats.setValue(marqueeSpacing);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final int getHighSpeedVideoFpsRanges() {
        return ((androidx.compose.foundation.MarqueeAnimationMode) this.getOutputSizeshNQ4ISI.getValue()).getGetHighResolutionOutputSizeshNQ4ISI();
    }

    public final void getHighSpeedVideoFpsRangesFor(int i) {
        this.getOutputSizeshNQ4ISI.setValue(androidx.compose.foundation.MarqueeAnimationMode.m1350boximpl(i));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final int getOutputMinFrameDuration() {
        return ((java.lang.Number) this.getOutputStallDuration.getValue()).intValue();
    }

    @Override // androidx.compose.ui.Modifier.Node
    public final void onAttach() {
        androidx.compose.ui.graphics.layer.GraphicsLayer graphicsLayer = this.getInputSizeshNQ4ISI;
        androidx.compose.ui.graphics.GraphicsContext requireGraphicsContext = androidx.compose.ui.node.DelegatableNodeKt.requireGraphicsContext(this);
        if (graphicsLayer != null) {
            requireGraphicsContext.releaseGraphicsLayer(graphicsLayer);
        }
        this.getInputSizeshNQ4ISI = requireGraphicsContext.createGraphicsLayer();
        getHighResolutionOutputSizeshNQ4ISI();
    }

    @Override // androidx.compose.ui.Modifier.Node
    public final void onDetach() {
        kotlinx.coroutines.Job job = this.getInputFormats;
        if (job != null) {
            kotlinx.coroutines.Job.DefaultImpls.cancel$default(job, (java.util.concurrent.CancellationException) null, 1, (java.lang.Object) null);
        }
        this.getInputFormats = null;
        androidx.compose.ui.graphics.layer.GraphicsLayer graphicsLayer = this.getInputSizeshNQ4ISI;
        if (graphicsLayer != null) {
            androidx.compose.ui.node.DelegatableNodeKt.requireGraphicsContext(this).releaseGraphicsLayer(graphicsLayer);
            this.getInputSizeshNQ4ISI = null;
        }
    }

    @Override // androidx.compose.ui.focus.FocusEventModifierNode
    public final void onFocusEvent(androidx.compose.ui.focus.FocusState p0) {
        getHighSpeedVideoFpsRangesFor(p0.getHasFocus());
    }

    @Override // androidx.compose.ui.node.LayoutModifierNode
    /* renamed from: measure-3p2s80s */
    public final androidx.compose.ui.layout.MeasureResult mo1117measure3p2s80s(androidx.compose.ui.layout.MeasureScope measureScope, androidx.compose.ui.layout.Measurable measurable, long j) {
        final androidx.compose.ui.layout.Placeable mo7353measureBRTryo0 = measurable.mo7353measureBRTryo0(androidx.compose.ui.unit.Constraints.m8545copyZbe2FdA$default(j, 0, Integer.MAX_VALUE, 0, 0, 13, null));
        getHighResolutionOutputSizeshNQ4ISI(androidx.compose.ui.unit.ConstraintsKt.m8571constrainWidthK40F9xA(j, mo7353measureBRTryo0.getWidth()));
        getHighSpeedVideoFpsRanges(mo7353measureBRTryo0.getWidth());
        return androidx.compose.ui.layout.MeasureScope.layout$default(measureScope, getHighSpeedVideoSizes(), mo7353measureBRTryo0.getHeight(), null, new kotlin.jvm.functions.Function1() { // from class: androidx.compose.foundation.MarqueeModifierNode$$ExternalSyntheticLambda1
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return androidx.compose.foundation.MarqueeModifierNode.getHighSpeedVideoFpsRangesFor(androidx.compose.ui.layout.Placeable.this, (androidx.compose.ui.layout.Placeable.PlacementScope) obj);
            }
        }, 4, null);
    }

    @Override // androidx.compose.ui.node.LayoutModifierNode
    public final int maxIntrinsicWidth(androidx.compose.ui.layout.IntrinsicMeasureScope intrinsicMeasureScope, androidx.compose.ui.layout.IntrinsicMeasurable intrinsicMeasurable, int i) {
        return intrinsicMeasurable.maxIntrinsicWidth(i);
    }

    @Override // androidx.compose.ui.node.LayoutModifierNode
    public final int minIntrinsicHeight(androidx.compose.ui.layout.IntrinsicMeasureScope intrinsicMeasureScope, androidx.compose.ui.layout.IntrinsicMeasurable intrinsicMeasurable, int i) {
        return intrinsicMeasurable.minIntrinsicHeight(Integer.MAX_VALUE);
    }

    @Override // androidx.compose.ui.node.LayoutModifierNode
    public final int maxIntrinsicHeight(androidx.compose.ui.layout.IntrinsicMeasureScope intrinsicMeasureScope, androidx.compose.ui.layout.IntrinsicMeasurable intrinsicMeasurable, int i) {
        return intrinsicMeasurable.maxIntrinsicHeight(Integer.MAX_VALUE);
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x00a7  */
    /* JADX WARN: Removed duplicated region for block: B:13:0x00bf  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x00dd  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0139  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x016a  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x00a9  */
    @Override // androidx.compose.ui.node.DrawModifierNode
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void draw(final androidx.compose.ui.graphics.drawscope.ContentDrawScope contentDrawScope) {
        float highSpeedVideoFpsRangesFor;
        float floatValue;
        int highSpeedVideoSizes;
        androidx.compose.ui.graphics.layer.GraphicsLayer graphicsLayer;
        androidx.compose.ui.graphics.drawscope.ContentDrawScope contentDrawScope2;
        androidx.compose.ui.graphics.drawscope.DrawContext drawContext;
        androidx.compose.ui.graphics.layer.GraphicsLayer graphicsLayer2;
        if (androidx.compose.ui.unit.Dp.m8600compareTo0680j_4(this.getHighSpeedVideoSizes, androidx.compose.ui.unit.Dp.m8601constructorimpl(0.0f)) > 0) {
            int i = androidx.compose.foundation.MarqueeModifierNode.WhenMappings.$EnumSwitchMapping$0[contentDrawScope.getLayoutDirection().ordinal()];
            if (i != 1) {
                if (i != 2) {
                    throw new kotlin.NoWhenBranchMatchedException();
                }
                floatValue = (-this.getOutputSizes.getValue().floatValue()) + (getHighSpeedVideoFpsRangesFor() * 2) + getOutputMinFrameDuration();
                highSpeedVideoSizes = getHighSpeedVideoSizes();
                highSpeedVideoFpsRangesFor = floatValue - highSpeedVideoSizes;
                boolean z = highSpeedVideoFpsRangesFor >= ((float) getHighSpeedVideoFpsRangesFor());
                boolean z2 = ((float) getHighSpeedVideoSizes()) + highSpeedVideoFpsRangesFor > ((float) (getHighSpeedVideoFpsRangesFor() + getOutputMinFrameDuration()));
                float highSpeedVideoFpsRangesFor2 = getHighSpeedVideoFpsRangesFor() + getOutputMinFrameDuration();
                float intBitsToFloat = java.lang.Float.intBitsToFloat((int) (contentDrawScope.mo6531getSizeNHjbRc() & 4294967295L));
                graphicsLayer = this.getInputSizeshNQ4ISI;
                if (graphicsLayer != null) {
                    contentDrawScope.mo6532recordJVtK1S4(graphicsLayer, androidx.compose.ui.unit.IntSize.m8767constructorimpl((getHighSpeedVideoFpsRangesFor() << 32) | (kotlin.math.MathKt.roundToInt(intBitsToFloat) & 4294967295L)), new kotlin.jvm.functions.Function1() { // from class: androidx.compose.foundation.MarqueeModifierNode$$ExternalSyntheticLambda0
                        @Override // kotlin.jvm.functions.Function1
                        public final java.lang.Object invoke(java.lang.Object obj) {
                            return androidx.compose.foundation.MarqueeModifierNode.getHighSpeedVideoFpsRanges(androidx.compose.ui.graphics.drawscope.ContentDrawScope.this);
                        }
                    });
                }
                contentDrawScope2 = contentDrawScope;
                float highSpeedVideoSizes2 = getHighSpeedVideoSizes();
                float intBitsToFloat2 = java.lang.Float.intBitsToFloat((int) (contentDrawScope2.mo6531getSizeNHjbRc() & 4294967295L));
                int m5985getIntersectrtfAjoo = androidx.compose.ui.graphics.ClipOp.INSTANCE.m5985getIntersectrtfAjoo();
                drawContext = contentDrawScope2.getDrawContext();
                long mo6453getSizeNHjbRc = drawContext.mo6453getSizeNHjbRc();
                drawContext.getCanvas().save();
                try {
                    drawContext.getTransform().mo6456clipRectN_I0leg(0.0f, 0.0f, highSpeedVideoSizes2, intBitsToFloat2, m5985getIntersectrtfAjoo);
                    float f = -highSpeedVideoFpsRangesFor;
                    contentDrawScope2.getDrawContext().getTransform().translate(f, 0.0f);
                    try {
                        graphicsLayer2 = this.getInputSizeshNQ4ISI;
                        if (graphicsLayer2 == null) {
                            if (z) {
                                androidx.compose.ui.graphics.layer.GraphicsLayerKt.drawLayer(contentDrawScope2, graphicsLayer2);
                            }
                            if (z2) {
                                contentDrawScope2.getDrawContext().getTransform().translate(highSpeedVideoFpsRangesFor2, 0.0f);
                                try {
                                    androidx.compose.ui.graphics.layer.GraphicsLayerKt.drawLayer(contentDrawScope2, graphicsLayer2);
                                    contentDrawScope2.getDrawContext().getTransform().translate(-highSpeedVideoFpsRangesFor2, 0.0f);
                                } finally {
                                }
                            }
                            return;
                        }
                        if (z) {
                            contentDrawScope.drawContent();
                        }
                        if (z2) {
                            contentDrawScope2.getDrawContext().getTransform().translate(highSpeedVideoFpsRangesFor2, 0.0f);
                            try {
                                contentDrawScope.drawContent();
                                contentDrawScope2.getDrawContext().getTransform().translate(-highSpeedVideoFpsRangesFor2, 0.0f);
                            } finally {
                            }
                        }
                        return;
                    } finally {
                        contentDrawScope2.getDrawContext().getTransform().translate(-f, 0.0f);
                    }
                } finally {
                    drawContext.getCanvas().restore();
                    drawContext.mo6454setSizeuvyYCjk(mo6453getSizeNHjbRc);
                }
            }
            highSpeedVideoFpsRangesFor = this.getOutputSizes.getValue().floatValue();
            if (highSpeedVideoFpsRangesFor >= ((float) getHighSpeedVideoFpsRangesFor())) {
            }
            if (((float) getHighSpeedVideoSizes()) + highSpeedVideoFpsRangesFor > ((float) (getHighSpeedVideoFpsRangesFor() + getOutputMinFrameDuration()))) {
            }
            float highSpeedVideoFpsRangesFor22 = getHighSpeedVideoFpsRangesFor() + getOutputMinFrameDuration();
            float intBitsToFloat3 = java.lang.Float.intBitsToFloat((int) (contentDrawScope.mo6531getSizeNHjbRc() & 4294967295L));
            graphicsLayer = this.getInputSizeshNQ4ISI;
            if (graphicsLayer != null) {
            }
            contentDrawScope2 = contentDrawScope;
            float highSpeedVideoSizes22 = getHighSpeedVideoSizes();
            float intBitsToFloat22 = java.lang.Float.intBitsToFloat((int) (contentDrawScope2.mo6531getSizeNHjbRc() & 4294967295L));
            int m5985getIntersectrtfAjoo2 = androidx.compose.ui.graphics.ClipOp.INSTANCE.m5985getIntersectrtfAjoo();
            drawContext = contentDrawScope2.getDrawContext();
            long mo6453getSizeNHjbRc2 = drawContext.mo6453getSizeNHjbRc();
            drawContext.getCanvas().save();
            drawContext.getTransform().mo6456clipRectN_I0leg(0.0f, 0.0f, highSpeedVideoSizes22, intBitsToFloat22, m5985getIntersectrtfAjoo2);
            float f2 = -highSpeedVideoFpsRangesFor;
            contentDrawScope2.getDrawContext().getTransform().translate(f2, 0.0f);
            graphicsLayer2 = this.getInputSizeshNQ4ISI;
            if (graphicsLayer2 == null) {
            }
        } else {
            int i2 = androidx.compose.foundation.MarqueeModifierNode.WhenMappings.$EnumSwitchMapping$0[contentDrawScope.getLayoutDirection().ordinal()];
            if (i2 == 1) {
                highSpeedVideoFpsRangesFor = (-this.getOutputSizes.getValue().floatValue()) + getHighSpeedVideoFpsRangesFor() + getOutputMinFrameDuration();
                if (highSpeedVideoFpsRangesFor >= ((float) getHighSpeedVideoFpsRangesFor())) {
                }
                if (((float) getHighSpeedVideoSizes()) + highSpeedVideoFpsRangesFor > ((float) (getHighSpeedVideoFpsRangesFor() + getOutputMinFrameDuration()))) {
                }
                float highSpeedVideoFpsRangesFor222 = getHighSpeedVideoFpsRangesFor() + getOutputMinFrameDuration();
                float intBitsToFloat32 = java.lang.Float.intBitsToFloat((int) (contentDrawScope.mo6531getSizeNHjbRc() & 4294967295L));
                graphicsLayer = this.getInputSizeshNQ4ISI;
                if (graphicsLayer != null) {
                }
                contentDrawScope2 = contentDrawScope;
                float highSpeedVideoSizes222 = getHighSpeedVideoSizes();
                float intBitsToFloat222 = java.lang.Float.intBitsToFloat((int) (contentDrawScope2.mo6531getSizeNHjbRc() & 4294967295L));
                int m5985getIntersectrtfAjoo22 = androidx.compose.ui.graphics.ClipOp.INSTANCE.m5985getIntersectrtfAjoo();
                drawContext = contentDrawScope2.getDrawContext();
                long mo6453getSizeNHjbRc22 = drawContext.mo6453getSizeNHjbRc();
                drawContext.getCanvas().save();
                drawContext.getTransform().mo6456clipRectN_I0leg(0.0f, 0.0f, highSpeedVideoSizes222, intBitsToFloat222, m5985getIntersectrtfAjoo22);
                float f22 = -highSpeedVideoFpsRangesFor;
                contentDrawScope2.getDrawContext().getTransform().translate(f22, 0.0f);
                graphicsLayer2 = this.getInputSizeshNQ4ISI;
                if (graphicsLayer2 == null) {
                }
            } else {
                if (i2 != 2) {
                    throw new kotlin.NoWhenBranchMatchedException();
                }
                floatValue = this.getOutputSizes.getValue().floatValue() + getHighSpeedVideoFpsRangesFor();
                highSpeedVideoSizes = getHighSpeedVideoSizes();
                highSpeedVideoFpsRangesFor = floatValue - highSpeedVideoSizes;
                if (highSpeedVideoFpsRangesFor >= ((float) getHighSpeedVideoFpsRangesFor())) {
                }
                if (((float) getHighSpeedVideoSizes()) + highSpeedVideoFpsRangesFor > ((float) (getHighSpeedVideoFpsRangesFor() + getOutputMinFrameDuration()))) {
                }
                float highSpeedVideoFpsRangesFor2222 = getHighSpeedVideoFpsRangesFor() + getOutputMinFrameDuration();
                float intBitsToFloat322 = java.lang.Float.intBitsToFloat((int) (contentDrawScope.mo6531getSizeNHjbRc() & 4294967295L));
                graphicsLayer = this.getInputSizeshNQ4ISI;
                if (graphicsLayer != null) {
                }
                contentDrawScope2 = contentDrawScope;
                float highSpeedVideoSizes2222 = getHighSpeedVideoSizes();
                float intBitsToFloat2222 = java.lang.Float.intBitsToFloat((int) (contentDrawScope2.mo6531getSizeNHjbRc() & 4294967295L));
                int m5985getIntersectrtfAjoo222 = androidx.compose.ui.graphics.ClipOp.INSTANCE.m5985getIntersectrtfAjoo();
                drawContext = contentDrawScope2.getDrawContext();
                long mo6453getSizeNHjbRc222 = drawContext.mo6453getSizeNHjbRc();
                drawContext.getCanvas().save();
                drawContext.getTransform().mo6456clipRectN_I0leg(0.0f, 0.0f, highSpeedVideoSizes2222, intBitsToFloat2222, m5985getIntersectrtfAjoo222);
                float f222 = -highSpeedVideoFpsRangesFor;
                contentDrawScope2.getDrawContext().getTransform().translate(f222, 0.0f);
                graphicsLayer2 = this.getInputSizeshNQ4ISI;
                if (graphicsLayer2 == null) {
                }
            }
        }
    }

    final void getHighResolutionOutputSizeshNQ4ISI() {
        kotlinx.coroutines.Job launch$default;
        kotlinx.coroutines.Job job = this.getInputFormats;
        if (job != null) {
            kotlinx.coroutines.Job.DefaultImpls.cancel$default(job, (java.util.concurrent.CancellationException) null, 1, (java.lang.Object) null);
        }
        if (getIsAttached()) {
            launch$default = kotlinx.coroutines.BuildersKt__Builders_commonKt.launch$default(getCoroutineScope(), null, null, new androidx.compose.foundation.MarqueeModifierNode$restartAnimation$1(job, this, null), 3, null);
            this.getInputFormats = launch$default;
        }
    }

    public static /* synthetic */ kotlin.Unit getHighSpeedVideoFpsRangesFor(androidx.compose.ui.layout.Placeable placeable, androidx.compose.ui.layout.Placeable.PlacementScope placementScope) {
        androidx.compose.ui.layout.Placeable.PlacementScope.placeWithLayer$default(placementScope, placeable, 0, 0, 0.0f, (kotlin.jvm.functions.Function1) null, 12, (java.lang.Object) null);
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit getHighSpeedVideoFpsRanges(androidx.compose.ui.graphics.drawscope.ContentDrawScope contentDrawScope) {
        contentDrawScope.drawContent();
        return kotlin.Unit.INSTANCE;
    }

    public static final /* synthetic */ java.lang.Object getHighResolutionOutputSizeshNQ4ISI(androidx.compose.foundation.MarqueeModifierNode marqueeModifierNode, kotlin.coroutines.Continuation continuation) {
        java.lang.Object withContext;
        return (marqueeModifierNode.getHighSpeedVideoFpsRanges <= 0 || (withContext = kotlinx.coroutines.BuildersKt.withContext(androidx.compose.foundation.FixedMotionDurationScale.INSTANCE, new androidx.compose.foundation.MarqueeModifierNode$runAnimation$2(marqueeModifierNode, null), continuation)) != kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()) ? kotlin.Unit.INSTANCE : withContext;
    }

    @kotlin.Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public static final /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[androidx.compose.ui.unit.LayoutDirection.values().length];
            try {
                iArr[androidx.compose.ui.unit.LayoutDirection.Ltr.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused) {
            }
            try {
                iArr[androidx.compose.ui.unit.LayoutDirection.Rtl.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public /* synthetic */ MarqueeModifierNode(int i, int i2, int i3, int i4, androidx.compose.foundation.MarqueeSpacing marqueeSpacing, float f, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this(i, i2, i3, i4, marqueeSpacing, f);
    }
}
