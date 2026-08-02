package androidx.compose.animation;

@kotlin.Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u000b\b\u0002\u0018\u00002\u00020\u00012\u00020\u0002BC\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\u001c\u0010\t\u001a\u0018\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b0\u0006R\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\r\u001a\u00020\f¢\u0006\u0004\b\u000e\u0010\u000fJ\u0013\u0010\u0012\u001a\u00020\u0011*\u00020\u0010H\u0016¢\u0006\u0004\b\u0012\u0010\u0013R\u001c\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00040\u00038\u0006@\u0007X\u0086\f¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015R,\u0010\u0017\u001a\u0018\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b0\u0006R\b\u0012\u0004\u0012\u00020\u00040\u00038\u0006@\u0007X\u0086\f¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018R\u0016\u0010\u0019\u001a\u00020\n8\u0007@\u0007X\u0086\f¢\u0006\u0006\n\u0004\b\u0019\u0010\u001aR\u0016\u0010\u001c\u001a\u00020\f8\u0007@\u0007X\u0086\f¢\u0006\u0006\n\u0004\b\u0016\u0010\u001b"}, d2 = {"Landroidx/compose/animation/VeilModifierNode;", "Landroidx/compose/ui/Modifier$Node;", "Landroidx/compose/ui/node/DrawModifierNode;", "Landroidx/compose/animation/core/Transition;", "Landroidx/compose/animation/EnterExitState;", "p0", "Landroidx/compose/animation/core/Transition$DeferredAnimation;", "Landroidx/compose/ui/graphics/Color;", "Landroidx/compose/animation/core/AnimationVector4D;", "p1", "Landroidx/compose/animation/EnterTransition;", "p2", "Landroidx/compose/animation/ExitTransition;", "p3", "<init>", "(Landroidx/compose/animation/core/Transition;Landroidx/compose/animation/core/Transition$DeferredAnimation;Landroidx/compose/animation/EnterTransition;Landroidx/compose/animation/ExitTransition;)V", "Landroidx/compose/ui/graphics/drawscope/ContentDrawScope;", "", "draw", "(Landroidx/compose/ui/graphics/drawscope/ContentDrawScope;)V", "getHighSpeedVideoFpsRangesFor", "Landroidx/compose/animation/core/Transition;", "Camera2StreamConfigurationMap", "getHighSpeedVideoSizes", "Landroidx/compose/animation/core/Transition$DeferredAnimation;", "getHighResolutionOutputSizeshNQ4ISI", "Landroidx/compose/animation/EnterTransition;", "Landroidx/compose/animation/ExitTransition;", "getHighSpeedVideoFpsRanges"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
final class VeilModifierNode extends androidx.compose.ui.Modifier.Node implements androidx.compose.ui.node.DrawModifierNode {

    /* renamed from: Camera2StreamConfigurationMap, reason: from kotlin metadata */
    androidx.compose.animation.ExitTransition getHighSpeedVideoFpsRanges;
    androidx.compose.animation.EnterTransition getHighResolutionOutputSizeshNQ4ISI;

    /* renamed from: getHighSpeedVideoFpsRangesFor, reason: from kotlin metadata */
    androidx.compose.animation.core.Transition<androidx.compose.animation.EnterExitState> Camera2StreamConfigurationMap;
    androidx.compose.animation.core.Transition<androidx.compose.animation.EnterExitState>.DeferredAnimation<androidx.compose.ui.graphics.Color, androidx.compose.animation.core.AnimationVector4D> getHighSpeedVideoSizes;

    public VeilModifierNode(androidx.compose.animation.core.Transition<androidx.compose.animation.EnterExitState> transition, androidx.compose.animation.core.Transition<androidx.compose.animation.EnterExitState>.DeferredAnimation<androidx.compose.ui.graphics.Color, androidx.compose.animation.core.AnimationVector4D> deferredAnimation, androidx.compose.animation.EnterTransition enterTransition, androidx.compose.animation.ExitTransition exitTransition) {
        this.Camera2StreamConfigurationMap = transition;
        this.getHighSpeedVideoSizes = deferredAnimation;
        this.getHighResolutionOutputSizeshNQ4ISI = enterTransition;
        this.getHighSpeedVideoFpsRanges = exitTransition;
    }

    @Override // androidx.compose.ui.node.DrawModifierNode
    public final void draw(androidx.compose.ui.graphics.drawscope.ContentDrawScope contentDrawScope) {
        long m5830getZeroNHjbRc;
        contentDrawScope.drawContent();
        androidx.compose.runtime.State<androidx.compose.ui.graphics.Color> animate = this.getHighSpeedVideoSizes.animate(new kotlin.jvm.functions.Function1<androidx.compose.animation.core.Transition.Segment<androidx.compose.animation.EnterExitState>, androidx.compose.animation.core.FiniteAnimationSpec<androidx.compose.ui.graphics.Color>>() { // from class: androidx.compose.animation.VeilModifierNode$draw$veilColor$1
            @Override // kotlin.jvm.functions.Function1
            /* renamed from: Camera2StreamConfigurationMap, reason: merged with bridge method [inline-methods] */
            public final androidx.compose.animation.core.FiniteAnimationSpec<androidx.compose.ui.graphics.Color> invoke(androidx.compose.animation.core.Transition.Segment<androidx.compose.animation.EnterExitState> segment) {
                androidx.compose.animation.core.SpringSpec springSpec;
                androidx.compose.animation.core.SpringSpec springSpec2;
                androidx.compose.animation.core.FiniteAnimationSpec<androidx.compose.ui.graphics.Color> animationSpec;
                androidx.compose.animation.core.SpringSpec springSpec3;
                androidx.compose.animation.core.FiniteAnimationSpec<androidx.compose.ui.graphics.Color> animationSpec2;
                if (segment.isTransitioningTo(androidx.compose.animation.EnterExitState.PreEnter, androidx.compose.animation.EnterExitState.Visible)) {
                    androidx.compose.animation.Veil veil = androidx.compose.animation.VeilModifierNode.this.getHighResolutionOutputSizeshNQ4ISI.getCamera2StreamConfigurationMap().getVeil();
                    if (veil != null && (animationSpec2 = veil.getAnimationSpec()) != null) {
                        return animationSpec2;
                    }
                    springSpec3 = androidx.compose.animation.EnterExitTransitionKt.getHighSpeedVideoFpsRangesFor;
                    return springSpec3;
                }
                if (!segment.isTransitioningTo(androidx.compose.animation.EnterExitState.Visible, androidx.compose.animation.EnterExitState.PostExit)) {
                    springSpec = androidx.compose.animation.EnterExitTransitionKt.getHighSpeedVideoFpsRangesFor;
                    return springSpec;
                }
                androidx.compose.animation.Veil veil2 = androidx.compose.animation.VeilModifierNode.this.getHighSpeedVideoFpsRanges.getGetHighResolutionOutputSizeshNQ4ISI().getVeil();
                if (veil2 != null && (animationSpec = veil2.getAnimationSpec()) != null) {
                    return animationSpec;
                }
                springSpec2 = androidx.compose.animation.EnterExitTransitionKt.getHighSpeedVideoFpsRangesFor;
                return springSpec2;
            }

            {
                super(1);
            }
        }, new kotlin.jvm.functions.Function1<androidx.compose.animation.EnterExitState, androidx.compose.ui.graphics.Color>() { // from class: androidx.compose.animation.VeilModifierNode$draw$veilColor$2
            @Override // kotlin.jvm.functions.Function1
            public final /* synthetic */ androidx.compose.ui.graphics.Color invoke(androidx.compose.animation.EnterExitState enterExitState) {
                return androidx.compose.ui.graphics.Color.m5986boximpl(getHighSpeedVideoFpsRanges(enterExitState));
            }

            public final long getHighSpeedVideoFpsRanges(androidx.compose.animation.EnterExitState enterExitState) {
                int i = androidx.compose.animation.VeilModifierNode$draw$veilColor$2.WhenMappings.$EnumSwitchMapping$0[enterExitState.ordinal()];
                if (i == 1) {
                    androidx.compose.animation.Veil veil = androidx.compose.animation.VeilModifierNode.this.getHighResolutionOutputSizeshNQ4ISI.getCamera2StreamConfigurationMap().getVeil();
                    if (veil != null) {
                        return veil.m1172getTargetColor0d7_KjU();
                    }
                    androidx.compose.animation.Veil veil2 = androidx.compose.animation.VeilModifierNode.this.getHighSpeedVideoFpsRanges.getGetHighResolutionOutputSizeshNQ4ISI().getVeil();
                    return veil2 != null ? veil2.m1171getInitialColor0d7_KjU() : androidx.compose.ui.graphics.Color.INSTANCE.m6031getTransparent0d7_KjU();
                }
                if (i == 2) {
                    androidx.compose.animation.Veil veil3 = androidx.compose.animation.VeilModifierNode.this.getHighResolutionOutputSizeshNQ4ISI.getCamera2StreamConfigurationMap().getVeil();
                    return veil3 != null ? veil3.m1171getInitialColor0d7_KjU() : androidx.compose.ui.graphics.Color.INSTANCE.m6031getTransparent0d7_KjU();
                }
                if (i != 3) {
                    throw new kotlin.NoWhenBranchMatchedException();
                }
                androidx.compose.animation.Veil veil4 = androidx.compose.animation.VeilModifierNode.this.getHighSpeedVideoFpsRanges.getGetHighResolutionOutputSizeshNQ4ISI().getVeil();
                return veil4 != null ? veil4.m1172getTargetColor0d7_KjU() : androidx.compose.ui.graphics.Color.INSTANCE.m6031getTransparent0d7_KjU();
            }

            @kotlin.Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
            public static final /* synthetic */ class WhenMappings {
                public static final /* synthetic */ int[] $EnumSwitchMapping$0;

                static {
                    int[] iArr = new int[androidx.compose.animation.EnterExitState.values().length];
                    try {
                        iArr[androidx.compose.animation.EnterExitState.Visible.ordinal()] = 1;
                    } catch (java.lang.NoSuchFieldError unused) {
                    }
                    try {
                        iArr[androidx.compose.animation.EnterExitState.PreEnter.ordinal()] = 2;
                    } catch (java.lang.NoSuchFieldError unused2) {
                    }
                    try {
                        iArr[androidx.compose.animation.EnterExitState.PostExit.ordinal()] = 3;
                    } catch (java.lang.NoSuchFieldError unused3) {
                    }
                    $EnumSwitchMapping$0 = iArr;
                }
            }

            {
                super(1);
            }
        });
        if (androidx.compose.ui.graphics.Color.m5998getAlphaimpl(animate.getValue().m6006unboximpl()) == 0.0f) {
            return;
        }
        androidx.compose.animation.Veil veil = this.getHighResolutionOutputSizeshNQ4ISI.getCamera2StreamConfigurationMap().getVeil();
        if (veil == null) {
            veil = this.getHighSpeedVideoFpsRanges.getGetHighResolutionOutputSizeshNQ4ISI().getVeil();
        }
        if (veil != null && veil.getMatchParentSize()) {
            androidx.compose.ui.layout.LayoutCoordinates requireLayoutCoordinates = androidx.compose.ui.node.DelegatableNodeKt.requireLayoutCoordinates(this);
            androidx.compose.ui.layout.LayoutCoordinates parentLayoutCoordinates = requireLayoutCoordinates.getParentLayoutCoordinates();
            if (parentLayoutCoordinates == null) {
                m5830getZeroNHjbRc = androidx.compose.ui.geometry.Size.INSTANCE.m5830getZeroNHjbRc();
            } else {
                long mo7361getSizeYbymL2g = parentLayoutCoordinates.mo7361getSizeYbymL2g();
                m5830getZeroNHjbRc = androidx.compose.ui.geometry.Size.m5812constructorimpl((java.lang.Float.floatToRawIntBits((int) (mo7361getSizeYbymL2g & 4294967295L)) & 4294967295L) | (java.lang.Float.floatToRawIntBits((int) (mo7361getSizeYbymL2g >> 32)) << 32));
            }
            androidx.compose.ui.graphics.drawscope.ContentDrawScope contentDrawScope2 = contentDrawScope;
            androidx.compose.ui.graphics.drawscope.DrawScope.m6526drawRectnJ9OG0$default(contentDrawScope2, animate.getValue().m6006unboximpl(), androidx.compose.ui.geometry.Offset.m5744constructorimpl(androidx.compose.ui.layout.LayoutCoordinatesKt.positionInParent(requireLayoutCoordinates) ^ (-9223372034707292160L)), m5830getZeroNHjbRc, 0.0f, null, null, 0, 120, null);
            return;
        }
        androidx.compose.ui.graphics.drawscope.DrawScope.m6526drawRectnJ9OG0$default(contentDrawScope, animate.getValue().m6006unboximpl(), 0L, 0L, 0.0f, null, null, 0, 126, null);
    }
}
