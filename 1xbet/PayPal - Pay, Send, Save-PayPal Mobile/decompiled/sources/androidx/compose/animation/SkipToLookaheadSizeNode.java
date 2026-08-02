package androidx.compose.animation;

@kotlin.Metadata(d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0014\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u00020\u00012\u00020\u0002B\u001f\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\u0004\b\b\u0010\tJ#\u0010\u0012\u001a\u00020\u000f*\u00020\n2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\u000e\u001a\u00020\rH\u0016¢\u0006\u0004\b\u0010\u0010\u0011J#\u0010\u0017\u001a\u00020\u0015*\u00020\u00132\u0006\u0010\f\u001a\u00020\u00142\u0006\u0010\u0016\u001a\u00020\u0015H\u0016¢\u0006\u0004\b\u0017\u0010\u0018J#\u0010\u0019\u001a\u00020\u0015*\u00020\u00132\u0006\u0010\f\u001a\u00020\u00142\u0006\u0010\u0016\u001a\u00020\u0015H\u0016¢\u0006\u0004\b\u0019\u0010\u0018J#\u0010\u001b\u001a\u00020\u0015*\u00020\u00132\u0006\u0010\f\u001a\u00020\u00142\u0006\u0010\u001a\u001a\u00020\u0015H\u0016¢\u0006\u0004\b\u001b\u0010\u0018J#\u0010\u001c\u001a\u00020\u0015*\u00020\u00132\u0006\u0010\f\u001a\u00020\u00142\u0006\u0010\u001a\u001a\u00020\u0015H\u0016¢\u0006\u0004\b\u001c\u0010\u0018R/\u0010\u0004\u001a\u0004\u0018\u00010\u00032\b\u0010\u001d\u001a\u0004\u0018\u00010\u00038G@GX\u0086\u008e\u0002¢\u0006\u0012\n\u0004\b\u001e\u0010\u001f\u001a\u0004\b \u0010!\"\u0004\b\"\u0010#R7\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\f\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u00060\u00058G@GX\u0087\u008e\u0002¢\u0006\u0012\n\u0004\b$\u0010\u001f\u001a\u0004\b\u0007\u0010%\"\u0004\b&\u0010'R\u0018\u0010(\u001a\u0004\u0018\u00010\r8\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b(\u0010)R\u0016\u0010-\u001a\u00020*8\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b+\u0010,"}, d2 = {"Landroidx/compose/animation/SkipToLookaheadSizeNode;", "Landroidx/compose/ui/node/LayoutModifierNode;", "Landroidx/compose/ui/Modifier$Node;", "Landroidx/compose/animation/ScaleToBoundsImpl;", "scaleToBounds", "Lkotlin/Function0;", "", "isEnabled", "<init>", "(Landroidx/compose/animation/ScaleToBoundsImpl;Lkotlin/jvm/functions/Function0;)V", "Landroidx/compose/ui/layout/MeasureScope;", "Landroidx/compose/ui/layout/Measurable;", "measurable", "Landroidx/compose/ui/unit/Constraints;", "constraints", "Landroidx/compose/ui/layout/MeasureResult;", "measure-3p2s80s", "(Landroidx/compose/ui/layout/MeasureScope;Landroidx/compose/ui/layout/Measurable;J)Landroidx/compose/ui/layout/MeasureResult;", "measure", "Landroidx/compose/ui/layout/IntrinsicMeasureScope;", "Landroidx/compose/ui/layout/IntrinsicMeasurable;", "", "height", "maxIntrinsicWidth", "(Landroidx/compose/ui/layout/IntrinsicMeasureScope;Landroidx/compose/ui/layout/IntrinsicMeasurable;I)I", "minIntrinsicWidth", "width", "maxIntrinsicHeight", "minIntrinsicHeight", "<set-?>", "scaleToBounds$delegate", "Landroidx/compose/runtime/MutableState;", "getScaleToBounds", "()Landroidx/compose/animation/ScaleToBoundsImpl;", "setScaleToBounds", "(Landroidx/compose/animation/ScaleToBoundsImpl;)V", "isEnabled$delegate", "()Lkotlin/jvm/functions/Function0;", "setEnabled", "(Lkotlin/jvm/functions/Function0;)V", "getHighSpeedVideoFpsRanges", "Landroidx/compose/ui/unit/Constraints;", "Landroidx/compose/ui/unit/IntSize;", "getHighResolutionOutputSizeshNQ4ISI", "J", "getHighSpeedVideoFpsRangesFor"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class SkipToLookaheadSizeNode extends androidx.compose.ui.Modifier.Node implements androidx.compose.ui.node.LayoutModifierNode {
    public static final int $stable = 8;

    /* renamed from: getHighResolutionOutputSizeshNQ4ISI, reason: from kotlin metadata */
    private long getHighSpeedVideoFpsRangesFor = androidx.compose.animation.AnimationModifierKt.getInvalidSize();
    private androidx.compose.ui.unit.Constraints getHighSpeedVideoFpsRanges;

    /* renamed from: isEnabled$delegate, reason: from kotlin metadata */
    private final androidx.compose.runtime.MutableState isEnabled;

    /* renamed from: scaleToBounds$delegate, reason: from kotlin metadata */
    private final androidx.compose.runtime.MutableState scaleToBounds;

    public SkipToLookaheadSizeNode(androidx.compose.animation.ScaleToBoundsImpl scaleToBoundsImpl, kotlin.jvm.functions.Function0<java.lang.Boolean> function0) {
        this.scaleToBounds = androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(scaleToBoundsImpl, null, 2, null);
        this.isEnabled = androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(function0, null, 2, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final androidx.compose.animation.ScaleToBoundsImpl getScaleToBounds() {
        return (androidx.compose.animation.ScaleToBoundsImpl) this.scaleToBounds.getValue();
    }

    public final void setScaleToBounds(androidx.compose.animation.ScaleToBoundsImpl scaleToBoundsImpl) {
        this.scaleToBounds.setValue(scaleToBoundsImpl);
    }

    public final kotlin.jvm.functions.Function0<java.lang.Boolean> isEnabled() {
        return (kotlin.jvm.functions.Function0) this.isEnabled.getValue();
    }

    public final void setEnabled(kotlin.jvm.functions.Function0<java.lang.Boolean> function0) {
        this.isEnabled.setValue(function0);
    }

    @Override // androidx.compose.ui.node.LayoutModifierNode
    /* renamed from: measure-3p2s80s */
    public final androidx.compose.ui.layout.MeasureResult mo1117measure3p2s80s(final androidx.compose.ui.layout.MeasureScope measureScope, androidx.compose.ui.layout.Measurable measurable, long j) {
        androidx.compose.ui.layout.Placeable mo7353measureBRTryo0;
        if (measureScope.isLookingAhead()) {
            this.getHighSpeedVideoFpsRanges = androidx.compose.ui.unit.Constraints.m8542boximpl(j);
        }
        if (!isEnabled().invoke().booleanValue()) {
            final androidx.compose.ui.layout.Placeable mo7353measureBRTryo02 = measurable.mo7353measureBRTryo0(j);
            return androidx.compose.ui.layout.MeasureScope.layout$default(measureScope, mo7353measureBRTryo02.getWidth(), mo7353measureBRTryo02.getHeight(), null, new kotlin.jvm.functions.Function1<androidx.compose.ui.layout.Placeable.PlacementScope, kotlin.Unit>() { // from class: androidx.compose.animation.SkipToLookaheadSizeNode$measure$1$1
                public final void Camera2StreamConfigurationMap(androidx.compose.ui.layout.Placeable.PlacementScope placementScope) {
                    androidx.compose.ui.layout.Placeable.PlacementScope.place$default(placementScope, androidx.compose.ui.layout.Placeable.this, 0, 0, 0.0f, 4, null);
                }

                @Override // kotlin.jvm.functions.Function1
                public final /* synthetic */ kotlin.Unit invoke(androidx.compose.ui.layout.Placeable.PlacementScope placementScope) {
                    Camera2StreamConfigurationMap(placementScope);
                    return kotlin.Unit.INSTANCE;
                }

                {
                    super(1);
                }
            }, 4, null);
        }
        if (measureScope.isLookingAhead()) {
            mo7353measureBRTryo0 = measurable.mo7353measureBRTryo0(j);
            this.getHighSpeedVideoFpsRangesFor = androidx.compose.ui.unit.IntSize.m8767constructorimpl((mo7353measureBRTryo0.getHeight() & 4294967295L) | (mo7353measureBRTryo0.getWidth() << 32));
        } else {
            androidx.compose.ui.unit.Constraints constraints = this.getHighSpeedVideoFpsRanges;
            kotlin.jvm.internal.Intrinsics.checkNotNull(constraints);
            mo7353measureBRTryo0 = measurable.mo7353measureBRTryo0(constraints.getGetHighSpeedVideoFpsRangesFor());
        }
        final androidx.compose.ui.layout.Placeable placeable = mo7353measureBRTryo0;
        final long m8568constrain4WqzIAM = androidx.compose.ui.unit.ConstraintsKt.m8568constrain4WqzIAM(j, this.getHighSpeedVideoFpsRangesFor);
        return androidx.compose.ui.layout.MeasureScope.layout$default(measureScope, (int) (m8568constrain4WqzIAM >> 32), (int) (m8568constrain4WqzIAM & 4294967295L), null, new kotlin.jvm.functions.Function1<androidx.compose.ui.layout.Placeable.PlacementScope, kotlin.Unit>() { // from class: androidx.compose.animation.SkipToLookaheadSizeNode$measure$2
            @Override // kotlin.jvm.functions.Function1
            public final /* synthetic */ kotlin.Unit invoke(androidx.compose.ui.layout.Placeable.PlacementScope placementScope) {
                getHighSpeedVideoFpsRanges(placementScope);
                return kotlin.Unit.INSTANCE;
            }

            public final void getHighSpeedVideoFpsRanges(androidx.compose.ui.layout.Placeable.PlacementScope placementScope) {
                long j2;
                final long m7452constructorimpl;
                long j3;
                long j4;
                long j5;
                long j6;
                androidx.compose.animation.ScaleToBoundsImpl scaleToBounds = androidx.compose.animation.SkipToLookaheadSizeNode.this.getScaleToBounds();
                if (scaleToBounds == null) {
                    androidx.compose.ui.layout.Placeable.PlacementScope.place$default(placementScope, placeable, 0, 0, 0.0f, 4, null);
                    return;
                }
                androidx.compose.ui.layout.ContentScale contentScale = scaleToBounds.getContentScale();
                j2 = androidx.compose.animation.SkipToLookaheadSizeNode.this.getHighSpeedVideoFpsRangesFor;
                if (((int) (j2 >> 32)) != 0) {
                    j5 = androidx.compose.animation.SkipToLookaheadSizeNode.this.getHighSpeedVideoFpsRangesFor;
                    if (((int) (j5 & 4294967295L)) != 0) {
                        j6 = androidx.compose.animation.SkipToLookaheadSizeNode.this.getHighSpeedVideoFpsRangesFor;
                        m7452constructorimpl = contentScale.mo7350computeScaleFactorH7hwNQA(androidx.compose.ui.unit.IntSizeKt.m8784toSizeozmzZPI(j6), androidx.compose.ui.unit.IntSizeKt.m8784toSizeozmzZPI(m8568constrain4WqzIAM));
                        androidx.compose.ui.Alignment alignment = scaleToBounds.getAlignment();
                        j3 = androidx.compose.animation.SkipToLookaheadSizeNode.this.getHighSpeedVideoFpsRangesFor;
                        int roundToInt = kotlin.math.MathKt.roundToInt(((int) (j3 >> 32)) * java.lang.Float.intBitsToFloat((int) (m7452constructorimpl >> 32)));
                        j4 = androidx.compose.animation.SkipToLookaheadSizeNode.this.getHighSpeedVideoFpsRangesFor;
                        long mo5504alignKFBX0sM = alignment.mo5504alignKFBX0sM(androidx.compose.ui.unit.IntSize.m8767constructorimpl((roundToInt << 32) | (4294967295L & kotlin.math.MathKt.roundToInt(((int) (j4 & 4294967295L)) * java.lang.Float.intBitsToFloat((int) (m7452constructorimpl & 4294967295L))))), m8568constrain4WqzIAM, measureScope.getLayoutDirection());
                        androidx.compose.ui.layout.Placeable.PlacementScope.placeWithLayer$default(placementScope, placeable, androidx.compose.ui.unit.IntOffset.m8729getXimpl(mo5504alignKFBX0sM), androidx.compose.ui.unit.IntOffset.m8730getYimpl(mo5504alignKFBX0sM), 0.0f, new kotlin.jvm.functions.Function1<androidx.compose.ui.graphics.GraphicsLayerScope, kotlin.Unit>() { // from class: androidx.compose.animation.SkipToLookaheadSizeNode$measure$2.1
                            @Override // kotlin.jvm.functions.Function1
                            public final /* synthetic */ kotlin.Unit invoke(androidx.compose.ui.graphics.GraphicsLayerScope graphicsLayerScope) {
                                getHighSpeedVideoSizes(graphicsLayerScope);
                                return kotlin.Unit.INSTANCE;
                            }

                            public final void getHighSpeedVideoSizes(androidx.compose.ui.graphics.GraphicsLayerScope graphicsLayerScope) {
                                graphicsLayerScope.setScaleX(java.lang.Float.intBitsToFloat((int) (m7452constructorimpl >> 32)));
                                graphicsLayerScope.setScaleY(java.lang.Float.intBitsToFloat((int) (m7452constructorimpl & 4294967295L)));
                                graphicsLayerScope.mo6180setTransformOrigin__ExYCQ(androidx.compose.ui.graphics.TransformOriginKt.TransformOrigin(0.0f, 0.0f));
                            }

                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            {
                                super(1);
                            }
                        }, 4, (java.lang.Object) null);
                    }
                }
                m7452constructorimpl = androidx.compose.ui.layout.ScaleFactor.m7452constructorimpl((java.lang.Float.floatToRawIntBits(1.0f) << 32) | (java.lang.Float.floatToRawIntBits(1.0f) & 4294967295L));
                androidx.compose.ui.Alignment alignment2 = scaleToBounds.getAlignment();
                j3 = androidx.compose.animation.SkipToLookaheadSizeNode.this.getHighSpeedVideoFpsRangesFor;
                int roundToInt2 = kotlin.math.MathKt.roundToInt(((int) (j3 >> 32)) * java.lang.Float.intBitsToFloat((int) (m7452constructorimpl >> 32)));
                j4 = androidx.compose.animation.SkipToLookaheadSizeNode.this.getHighSpeedVideoFpsRangesFor;
                long mo5504alignKFBX0sM2 = alignment2.mo5504alignKFBX0sM(androidx.compose.ui.unit.IntSize.m8767constructorimpl((roundToInt2 << 32) | (4294967295L & kotlin.math.MathKt.roundToInt(((int) (j4 & 4294967295L)) * java.lang.Float.intBitsToFloat((int) (m7452constructorimpl & 4294967295L))))), m8568constrain4WqzIAM, measureScope.getLayoutDirection());
                androidx.compose.ui.layout.Placeable.PlacementScope.placeWithLayer$default(placementScope, placeable, androidx.compose.ui.unit.IntOffset.m8729getXimpl(mo5504alignKFBX0sM2), androidx.compose.ui.unit.IntOffset.m8730getYimpl(mo5504alignKFBX0sM2), 0.0f, new kotlin.jvm.functions.Function1<androidx.compose.ui.graphics.GraphicsLayerScope, kotlin.Unit>() { // from class: androidx.compose.animation.SkipToLookaheadSizeNode$measure$2.1
                    @Override // kotlin.jvm.functions.Function1
                    public final /* synthetic */ kotlin.Unit invoke(androidx.compose.ui.graphics.GraphicsLayerScope graphicsLayerScope) {
                        getHighSpeedVideoSizes(graphicsLayerScope);
                        return kotlin.Unit.INSTANCE;
                    }

                    public final void getHighSpeedVideoSizes(androidx.compose.ui.graphics.GraphicsLayerScope graphicsLayerScope) {
                        graphicsLayerScope.setScaleX(java.lang.Float.intBitsToFloat((int) (m7452constructorimpl >> 32)));
                        graphicsLayerScope.setScaleY(java.lang.Float.intBitsToFloat((int) (m7452constructorimpl & 4294967295L)));
                        graphicsLayerScope.mo6180setTransformOrigin__ExYCQ(androidx.compose.ui.graphics.TransformOriginKt.TransformOrigin(0.0f, 0.0f));
                    }

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(1);
                    }
                }, 4, (java.lang.Object) null);
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }
        }, 4, null);
    }

    @Override // androidx.compose.ui.node.LayoutModifierNode
    public final int maxIntrinsicWidth(androidx.compose.ui.layout.IntrinsicMeasureScope intrinsicMeasureScope, androidx.compose.ui.layout.IntrinsicMeasurable intrinsicMeasurable, int i) {
        if (!intrinsicMeasureScope.isLookingAhead() && androidx.compose.animation.AnimationModifierKt.m1118isValidozmzZPI(this.getHighSpeedVideoFpsRangesFor)) {
            return (int) (this.getHighSpeedVideoFpsRangesFor >> 32);
        }
        return intrinsicMeasurable.maxIntrinsicWidth(i);
    }

    @Override // androidx.compose.ui.node.LayoutModifierNode
    public final int minIntrinsicWidth(androidx.compose.ui.layout.IntrinsicMeasureScope intrinsicMeasureScope, androidx.compose.ui.layout.IntrinsicMeasurable intrinsicMeasurable, int i) {
        if (!intrinsicMeasureScope.isLookingAhead() && androidx.compose.animation.AnimationModifierKt.m1118isValidozmzZPI(this.getHighSpeedVideoFpsRangesFor)) {
            return (int) (this.getHighSpeedVideoFpsRangesFor >> 32);
        }
        return intrinsicMeasurable.minIntrinsicWidth(i);
    }

    @Override // androidx.compose.ui.node.LayoutModifierNode
    public final int maxIntrinsicHeight(androidx.compose.ui.layout.IntrinsicMeasureScope intrinsicMeasureScope, androidx.compose.ui.layout.IntrinsicMeasurable intrinsicMeasurable, int i) {
        if (!intrinsicMeasureScope.isLookingAhead() && androidx.compose.animation.AnimationModifierKt.m1118isValidozmzZPI(this.getHighSpeedVideoFpsRangesFor)) {
            return (int) (this.getHighSpeedVideoFpsRangesFor & 4294967295L);
        }
        return intrinsicMeasurable.maxIntrinsicHeight(i);
    }

    @Override // androidx.compose.ui.node.LayoutModifierNode
    public final int minIntrinsicHeight(androidx.compose.ui.layout.IntrinsicMeasureScope intrinsicMeasureScope, androidx.compose.ui.layout.IntrinsicMeasurable intrinsicMeasurable, int i) {
        if (!intrinsicMeasureScope.isLookingAhead() && androidx.compose.animation.AnimationModifierKt.m1118isValidozmzZPI(this.getHighSpeedVideoFpsRangesFor)) {
            return (int) (this.getHighSpeedVideoFpsRangesFor & 4294967295L);
        }
        return intrinsicMeasurable.minIntrinsicHeight(i);
    }
}
