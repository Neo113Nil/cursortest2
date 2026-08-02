package androidx.compose.animation;

@kotlin.Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0002\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u00032\u00020\u0004B\u000f\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\n\u001a\u00020\tH\u0016¢\u0006\u0004\b\n\u0010\u000bJ\u000f\u0010\f\u001a\u00020\tH\u0016¢\u0006\u0004\b\f\u0010\u000bJ#\u0010\u0014\u001a\u00020\u0011*\u00020\r2\u0006\u0010\u0006\u001a\u00020\u000e2\u0006\u0010\u0010\u001a\u00020\u000fH\u0016¢\u0006\u0004\b\u0012\u0010\u0013J\u000f\u0010\u0015\u001a\u00020\tH\u0016¢\u0006\u0004\b\u0015\u0010\u000bJ\u0013\u0010\u0017\u001a\u00020\t*\u00020\u0016H\u0016¢\u0006\u0004\b\u0017\u0010\u0018R\u0016\u0010\u0019\u001a\u00020\u00058\u0007@GX\u0086\f¢\u0006\u0006\n\u0004\b\u0019\u0010\u001a"}, d2 = {"Landroidx/compose/animation/SharedTransitionScopeRootModifierNode;", "Landroidx/compose/ui/Modifier$Node;", "Landroidx/compose/ui/node/LayoutModifierNode;", "Landroidx/compose/ui/node/ObserverModifierNode;", "Landroidx/compose/ui/node/DrawModifierNode;", "Landroidx/compose/animation/SharedTransitionScopeImpl;", "p0", "<init>", "(Landroidx/compose/animation/SharedTransitionScopeImpl;)V", "", "onAttach", "()V", "onDetach", "Landroidx/compose/ui/layout/MeasureScope;", "Landroidx/compose/ui/layout/Measurable;", "Landroidx/compose/ui/unit/Constraints;", "p1", "Landroidx/compose/ui/layout/MeasureResult;", "measure-3p2s80s", "(Landroidx/compose/ui/layout/MeasureScope;Landroidx/compose/ui/layout/Measurable;J)Landroidx/compose/ui/layout/MeasureResult;", "measure", "onObservedReadsChanged", "Landroidx/compose/ui/graphics/drawscope/ContentDrawScope;", "draw", "(Landroidx/compose/ui/graphics/drawscope/ContentDrawScope;)V", "getHighSpeedVideoSizes", "Landroidx/compose/animation/SharedTransitionScopeImpl;"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
final class SharedTransitionScopeRootModifierNode extends androidx.compose.ui.Modifier.Node implements androidx.compose.ui.node.LayoutModifierNode, androidx.compose.ui.node.ObserverModifierNode, androidx.compose.ui.node.DrawModifierNode {
    androidx.compose.animation.SharedTransitionScopeImpl getHighSpeedVideoSizes;

    public SharedTransitionScopeRootModifierNode(androidx.compose.animation.SharedTransitionScopeImpl sharedTransitionScopeImpl) {
        this.getHighSpeedVideoSizes = sharedTransitionScopeImpl;
    }

    @Override // androidx.compose.ui.Modifier.Node
    public final void onAttach() {
        super.onAttach();
        androidx.compose.ui.node.ObserverModifierNodeKt.observeReads(this, this.getHighSpeedVideoSizes.getObserveAnimatingBlock$animation());
        this.getHighSpeedVideoSizes.setInvalidateOverlay(new kotlin.jvm.functions.Function0<kotlin.Unit>() { // from class: androidx.compose.animation.SharedTransitionScopeRootModifierNode$onAttach$1
            public final void getHighSpeedVideoFpsRanges() {
                androidx.compose.ui.node.DrawModifierNodeKt.invalidateDraw(androidx.compose.animation.SharedTransitionScopeRootModifierNode.this);
            }

            @Override // kotlin.jvm.functions.Function0
            public final /* synthetic */ kotlin.Unit invoke() {
                getHighSpeedVideoFpsRanges();
                return kotlin.Unit.INSTANCE;
            }

            {
                super(0);
            }
        });
    }

    @Override // androidx.compose.ui.Modifier.Node
    public final void onDetach() {
        this.getHighSpeedVideoSizes.setInvalidateOverlay(null);
    }

    @Override // androidx.compose.ui.node.LayoutModifierNode
    /* renamed from: measure-3p2s80s */
    public final androidx.compose.ui.layout.MeasureResult mo1117measure3p2s80s(final androidx.compose.ui.layout.MeasureScope measureScope, androidx.compose.ui.layout.Measurable measurable, long j) {
        final androidx.compose.ui.layout.Placeable mo7353measureBRTryo0 = measurable.mo7353measureBRTryo0(j);
        return androidx.compose.ui.layout.MeasureScope.layout$default(measureScope, mo7353measureBRTryo0.getWidth(), mo7353measureBRTryo0.getHeight(), null, new kotlin.jvm.functions.Function1<androidx.compose.ui.layout.Placeable.PlacementScope, kotlin.Unit>() { // from class: androidx.compose.animation.SharedTransitionScopeRootModifierNode$measure$1
            @Override // kotlin.jvm.functions.Function1
            public final /* synthetic */ kotlin.Unit invoke(androidx.compose.ui.layout.Placeable.PlacementScope placementScope) {
                getHighResolutionOutputSizeshNQ4ISI(placementScope);
                return kotlin.Unit.INSTANCE;
            }

            public final void getHighResolutionOutputSizeshNQ4ISI(androidx.compose.ui.layout.Placeable.PlacementScope placementScope) {
                androidx.compose.ui.layout.LayoutCoordinates coordinates = placementScope.getCoordinates();
                if (coordinates != null) {
                    if (!androidx.compose.ui.layout.MeasureScope.this.isLookingAhead()) {
                        this.getHighSpeedVideoSizes.setRoot$animation(coordinates);
                    } else {
                        this.getHighSpeedVideoSizes.setLookaheadRoot$animation(coordinates);
                    }
                }
                androidx.compose.ui.layout.Placeable.PlacementScope.place$default(placementScope, mo7353measureBRTryo0, 0, 0, 0.0f, 4, null);
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }
        }, 4, null);
    }

    @Override // androidx.compose.ui.node.ObserverModifierNode
    public final void onObservedReadsChanged() {
        this.getHighSpeedVideoSizes.updateTransitionActiveness$animation();
        androidx.compose.ui.node.ObserverModifierNodeKt.observeReads(this, this.getHighSpeedVideoSizes.getObserveAnimatingBlock$animation());
    }

    @Override // androidx.compose.ui.node.DrawModifierNode
    public final void draw(androidx.compose.ui.graphics.drawscope.ContentDrawScope contentDrawScope) {
        contentDrawScope.drawContent();
        this.getHighSpeedVideoSizes.drawInOverlay$animation(contentDrawScope);
    }
}
