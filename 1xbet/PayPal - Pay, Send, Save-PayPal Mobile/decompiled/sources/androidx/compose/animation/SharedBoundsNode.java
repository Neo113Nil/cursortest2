package androidx.compose.animation;

@kotlin.Metadata(d1 = {"\u0000\u008c\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u00032\u00020\u00042\u00020\u00052\u00020\u0006B\u000f\u0012\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nJ\u0019\u0010\r\u001a\u0004\u0018\u00010\u000b2\u0006\u0010\f\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\r\u0010\u000eJ\u000f\u0010\u0010\u001a\u00020\u000fH\u0002¢\u0006\u0004\b\u0010\u0010\u0011J\u000f\u0010\u0012\u001a\u00020\u000fH\u0016¢\u0006\u0004\b\u0012\u0010\u0011J\u000f\u0010\u0013\u001a\u00020\u000fH\u0016¢\u0006\u0004\b\u0013\u0010\u0011J\u000f\u0010\u0014\u001a\u00020\u000fH\u0016¢\u0006\u0004\b\u0014\u0010\u0011J#\u0010\u001d\u001a\u00020\u001a*\u00020\u00152\u0006\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0019\u001a\u00020\u0018H\u0016¢\u0006\u0004\b\u001b\u0010\u001cJ+\u0010$\u001a\u00020\u000f*\u00020\u001e2\u0006\u0010 \u001a\u00020\u001f2\u0006\u0010\"\u001a\u00020!2\u0006\u0010#\u001a\u00020\u000bH\u0000¢\u0006\u0004\b$\u0010%J\u0017\u0010+\u001a\u00020(2\u0006\u0010'\u001a\u00020&H\u0016¢\u0006\u0004\b)\u0010*J#\u0010/\u001a\u00020\u001a*\u00020,2\u0006\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0019\u001a\u00020\u0018H\u0016¢\u0006\u0004\b-\u0010.J\u0013\u00101\u001a\u00020\u000f*\u000200H\u0016¢\u0006\u0004\b1\u00102J\u000f\u00103\u001a\u00020\u000fH\u0016¢\u0006\u0004\b3\u0010\u0011R\u0018\u00106\u001a\u0004\u0018\u00010\u000b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b4\u00105R\u0016\u00109\u001a\u0004\u0018\u00010\u000b8WX\u0096\u0004¢\u0006\u0006\u001a\u0004\b7\u00108R\u0016\u0010\u0010\u001a\u00020(8\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b6\u0010:R*\u0010<\u001a\u00020\u00072\u0006\u0010;\u001a\u00020\u00078\u0007@AX\u0087\u000e¢\u0006\u0012\n\u0004\b<\u0010=\u001a\u0004\b>\u0010?\"\u0004\b@\u0010\nR(\u00104\u001a\u0004\u0018\u00010A2\b\u0010B\u001a\u0004\u0018\u00010A8\u0002@CX\u0083\u000e¢\u0006\f\n\u0004\b\u0010\u0010C\"\u0004\bD\u0010ER\u001a\u0010G\u001a\u00020F8\u0017X\u0097\u0004¢\u0006\f\n\u0004\bG\u0010H\u001a\u0004\bI\u0010J"}, d2 = {"Landroidx/compose/animation/SharedBoundsNode;", "Landroidx/compose/ui/layout/ApproachLayoutModifierNode;", "Landroidx/compose/ui/Modifier$Node;", "Landroidx/compose/ui/node/DrawModifierNode;", "Landroidx/compose/ui/modifier/ModifierLocalModifierNode;", "Landroidx/compose/ui/node/ObserverModifierNode;", "Landroidx/compose/animation/BoundsProvider;", "Landroidx/compose/animation/SharedElementEntry;", "state", "<init>", "(Landroidx/compose/animation/SharedElementEntry;)V", "Landroidx/compose/ui/geometry/Rect;", "targetBoundsBeforeDisposed", "calculateAlternativeTargetBounds", "(Landroidx/compose/ui/geometry/Rect;)Landroidx/compose/ui/geometry/Rect;", "", "getHighSpeedVideoFpsRangesFor", "()V", "onAttach", "onDetach", "onReset", "Landroidx/compose/ui/layout/MeasureScope;", "Landroidx/compose/ui/layout/Measurable;", "measurable", "Landroidx/compose/ui/unit/Constraints;", "constraints", "Landroidx/compose/ui/layout/MeasureResult;", "measure-3p2s80s", "(Landroidx/compose/ui/layout/MeasureScope;Landroidx/compose/ui/layout/Measurable;J)Landroidx/compose/ui/layout/MeasureResult;", "measure", "Landroidx/compose/ui/layout/Placeable$PlacementScope;", "Landroidx/compose/ui/layout/Placeable;", "placeable", "Landroidx/compose/animation/TargetData;", "targetData", "currentBounds", "approachPlaceMatchInTransition$animation", "(Landroidx/compose/ui/layout/Placeable$PlacementScope;Landroidx/compose/ui/layout/Placeable;Landroidx/compose/animation/TargetData;Landroidx/compose/ui/geometry/Rect;)V", "Landroidx/compose/ui/unit/IntSize;", "lookaheadSize", "", "isMeasurementApproachInProgress-ozmzZPI", "(J)Z", "isMeasurementApproachInProgress", "Landroidx/compose/ui/layout/ApproachMeasureScope;", "approachMeasure-3p2s80s", "(Landroidx/compose/ui/layout/ApproachMeasureScope;Landroidx/compose/ui/layout/Measurable;J)Landroidx/compose/ui/layout/MeasureResult;", "approachMeasure", "Landroidx/compose/ui/graphics/drawscope/ContentDrawScope;", "draw", "(Landroidx/compose/ui/graphics/drawscope/ContentDrawScope;)V", "onObservedReadsChanged", "getHighSpeedVideoFpsRanges", "Landroidx/compose/ui/geometry/Rect;", "getHighSpeedVideoSizes", "getLastBoundsInSharedTransitionScope", "()Landroidx/compose/ui/geometry/Rect;", "lastBoundsInSharedTransitionScope", "Z", com.datadog.android.rum.internal.metric.ViewEndedMetricDispatcher.KEY_VALUE, "sharedElementEntry", "Landroidx/compose/animation/SharedElementEntry;", "getSharedElementEntry", "()Landroidx/compose/animation/SharedElementEntry;", "setSharedElementEntry$animation", "Landroidx/compose/ui/graphics/layer/GraphicsLayer;", "p0", "Landroidx/compose/ui/graphics/layer/GraphicsLayer;", "Camera2StreamConfigurationMap", "(Landroidx/compose/ui/graphics/layer/GraphicsLayer;)V", "Landroidx/compose/ui/modifier/ModifierLocalMap;", "providedValues", "Landroidx/compose/ui/modifier/ModifierLocalMap;", "getProvidedValues", "()Landroidx/compose/ui/modifier/ModifierLocalMap;"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class SharedBoundsNode extends androidx.compose.ui.Modifier.Node implements androidx.compose.ui.layout.ApproachLayoutModifierNode, androidx.compose.ui.node.DrawModifierNode, androidx.compose.ui.modifier.ModifierLocalModifierNode, androidx.compose.ui.node.ObserverModifierNode, androidx.compose.animation.BoundsProvider {
    public static final int $stable = 8;

    /* renamed from: getHighSpeedVideoFpsRanges, reason: from kotlin metadata */
    private androidx.compose.ui.geometry.Rect getHighSpeedVideoSizes;

    /* renamed from: getHighSpeedVideoFpsRangesFor, reason: from kotlin metadata */
    private androidx.compose.ui.graphics.layer.GraphicsLayer getHighSpeedVideoFpsRanges;

    /* renamed from: getHighSpeedVideoSizes, reason: from kotlin metadata */
    private boolean getHighSpeedVideoFpsRangesFor;
    private final androidx.compose.ui.modifier.ModifierLocalMap providedValues;
    private androidx.compose.animation.SharedElementEntry sharedElementEntry;

    public SharedBoundsNode(androidx.compose.animation.SharedElementEntry sharedElementEntry) {
        this.sharedElementEntry = sharedElementEntry;
        this.getHighSpeedVideoFpsRanges = sharedElementEntry.getLayer();
        this.providedValues = androidx.compose.ui.modifier.ModifierLocalModifierNodeKt.modifierLocalMapOf(kotlin.TuplesKt.to(androidx.compose.animation.SharedContentNodeKt.getModifierLocalSharedElementInternalState(), sharedElementEntry));
    }

    @Override // androidx.compose.animation.BoundsProvider
    public final androidx.compose.ui.geometry.Rect getLastBoundsInSharedTransitionScope() {
        if (!getIsAttached()) {
            return null;
        }
        if (!this.getHighSpeedVideoFpsRangesFor) {
            return this.getHighSpeedVideoSizes;
        }
        androidx.compose.animation.SharedBoundsNode sharedBoundsNode = this;
        return androidx.compose.ui.geometry.RectKt.m5792Recttz77jQw(androidx.compose.ui.layout.LayoutCoordinates.m7360localPositionOfS_NoaFU$default(this.sharedElementEntry.getSharedElement().getScope().getRoot$animation(), androidx.compose.ui.node.DelegatableNodeKt.requireLayoutCoordinates(sharedBoundsNode), 0L, false, 6, null), androidx.compose.ui.unit.IntSizeKt.m8784toSizeozmzZPI(androidx.compose.ui.node.DelegatableNodeKt.requireLayoutCoordinates(sharedBoundsNode).mo7361getSizeYbymL2g()));
    }

    @Override // androidx.compose.animation.BoundsProvider
    public final androidx.compose.ui.geometry.Rect calculateAlternativeTargetBounds(androidx.compose.ui.geometry.Rect targetBoundsBeforeDisposed) {
        return this.sharedElementEntry.calculateTargetBounds(targetBoundsBeforeDisposed);
    }

    public final androidx.compose.animation.SharedElementEntry getSharedElementEntry() {
        return this.sharedElementEntry;
    }

    public final void setSharedElementEntry$animation(androidx.compose.animation.SharedElementEntry sharedElementEntry) {
        if (kotlin.jvm.internal.Intrinsics.areEqual(sharedElementEntry, this.sharedElementEntry)) {
            return;
        }
        this.sharedElementEntry.setAttached(false);
        this.sharedElementEntry = sharedElementEntry;
        sharedElementEntry.setAttached(getIsAttached());
        if (getIsAttached()) {
            getHighSpeedVideoFpsRangesFor();
        }
    }

    private final void Camera2StreamConfigurationMap(androidx.compose.ui.graphics.layer.GraphicsLayer graphicsLayer) {
        if (graphicsLayer == null) {
            androidx.compose.ui.graphics.layer.GraphicsLayer graphicsLayer2 = this.getHighSpeedVideoFpsRanges;
            if (graphicsLayer2 != null) {
                androidx.compose.ui.node.DelegatableNodeKt.requireGraphicsContext(this).releaseGraphicsLayer(graphicsLayer2);
            }
        } else {
            this.sharedElementEntry.setLayer(graphicsLayer);
        }
        this.getHighSpeedVideoFpsRanges = graphicsLayer;
    }

    @Override // androidx.compose.ui.modifier.ModifierLocalModifierNode
    public final androidx.compose.ui.modifier.ModifierLocalMap getProvidedValues() {
        return this.providedValues;
    }

    private final void getHighSpeedVideoFpsRangesFor() {
        provide(androidx.compose.animation.SharedContentNodeKt.getModifierLocalSharedElementInternalState(), this.sharedElementEntry);
        this.sharedElementEntry.setParentState((androidx.compose.animation.SharedElementEntry) getCurrent(androidx.compose.animation.SharedContentNodeKt.getModifierLocalSharedElementInternalState()));
        Camera2StreamConfigurationMap(androidx.compose.ui.node.DelegatableNodeKt.requireGraphicsContext(this).createGraphicsLayer());
        this.getHighSpeedVideoFpsRangesFor = false;
        this.sharedElementEntry.setBoundsProvider(this);
    }

    @Override // androidx.compose.ui.Modifier.Node
    public final void onAttach() {
        super.onAttach();
        androidx.compose.ui.node.ObserverModifierNodeKt.observeReads(this, this.sharedElementEntry.getSharedElement().getObservingVisibilityChange$animation());
        getHighSpeedVideoFpsRangesFor();
        this.sharedElementEntry.setAttached(true);
    }

    @Override // androidx.compose.ui.Modifier.Node
    public final void onDetach() {
        androidx.compose.ui.geometry.Rect rect;
        super.onDetach();
        androidx.compose.ui.layout.LayoutCoordinates nullableRoot = this.sharedElementEntry.getSharedElement().getScope().getNullableRoot();
        if (nullableRoot != null) {
            if (nullableRoot.isAttached() && this.getHighSpeedVideoFpsRangesFor) {
                androidx.compose.animation.SharedBoundsNode sharedBoundsNode = this;
                rect = androidx.compose.ui.geometry.RectKt.m5792Recttz77jQw(androidx.compose.ui.geometry.Offset.m5756minusMKHz9U(androidx.compose.ui.layout.LayoutCoordinatesKt.positionInRoot(androidx.compose.ui.node.DelegatableNodeKt.requireLayoutCoordinates(sharedBoundsNode)), androidx.compose.ui.layout.LayoutCoordinatesKt.positionInRoot(nullableRoot)), androidx.compose.ui.unit.IntSizeKt.m8784toSizeozmzZPI(androidx.compose.ui.node.DelegatableNodeKt.requireLayoutCoordinates(sharedBoundsNode).mo7361getSizeYbymL2g()));
            } else {
                rect = null;
            }
            this.getHighSpeedVideoSizes = rect;
        }
        Camera2StreamConfigurationMap(null);
        this.sharedElementEntry.setParentState(null);
        this.sharedElementEntry.setBoundsProvider(null);
        this.sharedElementEntry.setAttached(false);
        this.getHighSpeedVideoFpsRangesFor = false;
    }

    @Override // androidx.compose.ui.Modifier.Node
    public final void onReset() {
        super.onReset();
        this.getHighSpeedVideoSizes = null;
        androidx.compose.ui.graphics.layer.GraphicsLayer graphicsLayer = this.getHighSpeedVideoFpsRanges;
        if (graphicsLayer != null) {
            androidx.compose.ui.node.DelegatableNodeKt.requireGraphicsContext(this).releaseGraphicsLayer(graphicsLayer);
        }
        Camera2StreamConfigurationMap(androidx.compose.ui.node.DelegatableNodeKt.requireGraphicsContext(this).createGraphicsLayer());
    }

    @Override // androidx.compose.ui.layout.ApproachLayoutModifierNode, androidx.compose.ui.node.LayoutModifierNode
    /* renamed from: measure-3p2s80s */
    public final androidx.compose.ui.layout.MeasureResult mo1117measure3p2s80s(androidx.compose.ui.layout.MeasureScope measureScope, androidx.compose.ui.layout.Measurable measurable, long j) {
        final androidx.compose.ui.layout.Placeable mo7353measureBRTryo0 = measurable.mo7353measureBRTryo0(j);
        return androidx.compose.ui.layout.MeasureScope.layout$default(measureScope, mo7353measureBRTryo0.getWidth(), mo7353measureBRTryo0.getHeight(), null, new kotlin.jvm.functions.Function1<androidx.compose.ui.layout.Placeable.PlacementScope, kotlin.Unit>() { // from class: androidx.compose.animation.SharedBoundsNode$measure$1
            @Override // kotlin.jvm.functions.Function1
            public final /* synthetic */ kotlin.Unit invoke(androidx.compose.ui.layout.Placeable.PlacementScope placementScope) {
                getHighSpeedVideoFpsRanges(placementScope);
                return kotlin.Unit.INSTANCE;
            }

            public final void getHighSpeedVideoFpsRanges(androidx.compose.ui.layout.Placeable.PlacementScope placementScope) {
                androidx.compose.animation.SharedElement sharedElement;
                androidx.compose.ui.layout.Placeable.PlacementScope.place$default(placementScope, androidx.compose.ui.layout.Placeable.this, 0, 0, 0.0f, 4, null);
                sharedElement = this.sharedElementEntry.getSharedElement();
                sharedElement.onLookaheadPlaced(placementScope, this.getSharedElementEntry());
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }
        }, 4, null);
    }

    public final void approachPlaceMatchInTransition$animation(androidx.compose.ui.layout.Placeable.PlacementScope placementScope, androidx.compose.ui.layout.Placeable placeable, androidx.compose.animation.TargetData targetData, androidx.compose.ui.geometry.Rect rect) {
        androidx.compose.ui.geometry.Rect m5792Recttz77jQw;
        long j;
        androidx.compose.ui.layout.LayoutCoordinates coordinates = placementScope.getCoordinates();
        if (coordinates == null) {
            androidx.compose.ui.layout.Placeable.PlacementScope.place$default(placementScope, placeable, 0, 0, 0.0f, 4, null);
            return;
        }
        boolean activeMatchFound = this.sharedElementEntry.getSharedElement().getState$animation().getActiveMatchFound();
        long mo7362localPositionOfR5De75A = this.sharedElementEntry.getSharedElement().getScope().getRoot$animation().mo7362localPositionOfR5De75A(coordinates, androidx.compose.ui.geometry.Offset.INSTANCE.m5768getZeroF1C5BW0());
        if (!activeMatchFound) {
            this.sharedElementEntry.getBoundsAnimation().animate(rect, androidx.compose.animation.SharedTransitionStateMachineKt.getTargetBounds(targetData), new androidx.compose.animation.BoundsTransform() { // from class: androidx.compose.animation.SharedBoundsNode$$ExternalSyntheticLambda0
                @Override // androidx.compose.animation.BoundsTransform
                public final androidx.compose.animation.core.FiniteAnimationSpec createAnimationSpec(androidx.compose.ui.geometry.Rect rect2, androidx.compose.ui.geometry.Rect rect3) {
                    androidx.compose.animation.core.FiniteAnimationSpec spring$default;
                    spring$default = androidx.compose.animation.core.AnimationSpecKt.spring$default(0.0f, 0.0f, androidx.compose.animation.core.VisibilityThresholdsKt.getVisibilityThreshold(androidx.compose.ui.geometry.Rect.INSTANCE), 3, null);
                    return spring$default;
                }
            });
        } else {
            androidx.compose.animation.BoundsAnimation.animate$default(this.sharedElementEntry.getBoundsAnimation(), rect, androidx.compose.animation.SharedTransitionStateMachineKt.getTargetBounds(targetData), null, 4, null);
        }
        androidx.compose.ui.geometry.Rect value = this.sharedElementEntry.getBoundsAnimation().getValue();
        androidx.compose.ui.geometry.Offset m5741boximpl = value != null ? androidx.compose.ui.geometry.Offset.m5741boximpl(androidx.compose.animation.SharedTransitionStateMachineKt.calculateOffsetFromDirectManipulation(targetData, value)) : null;
        if (this.sharedElementEntry.getBoundsAnimation().getTarget() || !activeMatchFound) {
            long m5762unboximpl = m5741boximpl != null ? m5741boximpl.m5762unboximpl() : mo7362localPositionOfR5De75A;
            if (m5741boximpl == null) {
                m5792Recttz77jQw = androidx.compose.ui.geometry.RectKt.m5792Recttz77jQw(mo7362localPositionOfR5De75A, androidx.compose.ui.unit.IntSizeKt.m8784toSizeozmzZPI(coordinates.mo7361getSizeYbymL2g()));
            } else {
                m5792Recttz77jQw = androidx.compose.ui.geometry.RectKt.m5792Recttz77jQw(m5741boximpl.m5762unboximpl(), value.m5785getSizeNHjbRc());
            }
            this.sharedElementEntry.getSharedElement().getState$animation().updateBounds(m5792Recttz77jQw);
            j = m5762unboximpl;
        } else {
            j = m5741boximpl != null ? m5741boximpl.m5762unboximpl() : rect.m5787getTopLeftF1C5BW0();
        }
        long m5756minusMKHz9U = androidx.compose.ui.geometry.Offset.m5756minusMKHz9U(j, mo7362localPositionOfR5De75A);
        androidx.compose.ui.layout.Placeable.PlacementScope.place$default(placementScope, placeable, java.lang.Math.round(java.lang.Float.intBitsToFloat((int) (m5756minusMKHz9U >> 32))), java.lang.Math.round(java.lang.Float.intBitsToFloat((int) (m5756minusMKHz9U & 4294967295L))), 0.0f, 4, null);
    }

    @Override // androidx.compose.ui.layout.ApproachLayoutModifierNode
    /* renamed from: isMeasurementApproachInProgress-ozmzZPI */
    public final boolean mo1120isMeasurementApproachInProgressozmzZPI(long lookaheadSize) {
        return this.sharedElementEntry.isEnabled() && this.sharedElementEntry.getSharedElement().getFoundMatch() && this.sharedElementEntry.getSharedElement().getScope().isTransitionActive();
    }

    public static final /* synthetic */ void access$approachPlaceMatchBeyondTransition(androidx.compose.animation.SharedBoundsNode sharedBoundsNode, androidx.compose.ui.layout.Placeable.PlacementScope placementScope, androidx.compose.ui.layout.Placeable placeable, androidx.compose.ui.geometry.Rect rect) {
        long m8740getZeronOccac;
        if (!sharedBoundsNode.sharedElementEntry.getBoundsAnimation().getTarget()) {
            androidx.compose.ui.layout.LayoutCoordinates coordinates = placementScope.getCoordinates();
            if (coordinates != null) {
                m8740getZeronOccac = androidx.compose.ui.unit.IntOffsetKt.m8746roundk4lQ0M(androidx.compose.ui.geometry.Offset.m5756minusMKHz9U(rect.m5787getTopLeftF1C5BW0(), sharedBoundsNode.sharedElementEntry.getSharedElement().getScope().getRoot$animation().mo7362localPositionOfR5De75A(coordinates, androidx.compose.ui.geometry.Offset.INSTANCE.m5768getZeroF1C5BW0())));
            } else {
                m8740getZeronOccac = androidx.compose.ui.unit.IntOffset.INSTANCE.m8740getZeronOccac();
            }
            androidx.compose.ui.layout.Placeable.PlacementScope.place$default(placementScope, placeable, androidx.compose.ui.unit.IntOffset.m8729getXimpl(m8740getZeronOccac), androidx.compose.ui.unit.IntOffset.m8730getYimpl(m8740getZeronOccac), 0.0f, 4, null);
            return;
        }
        androidx.compose.ui.layout.Placeable.PlacementScope.place$default(placementScope, placeable, 0, 0, 0.0f, 4, null);
    }

    @Override // androidx.compose.ui.layout.ApproachLayoutModifierNode
    /* renamed from: approachMeasure-3p2s80s */
    public final androidx.compose.ui.layout.MeasureResult mo1119approachMeasure3p2s80s(androidx.compose.ui.layout.ApproachMeasureScope approachMeasureScope, androidx.compose.ui.layout.Measurable measurable, long j) {
        long m8767constructorimpl;
        androidx.compose.ui.geometry.Rect value = this.sharedElementEntry.getBoundsAnimation().getValue();
        if (value == null) {
            value = this.sharedElementEntry.getSharedElement().tryInitializingCurrentBounds();
        }
        if (value != null) {
            long m8780roundToIntSizeuvyYCjk = androidx.compose.ui.unit.IntSizeKt.m8780roundToIntSizeuvyYCjk(value.m5785getSizeNHjbRc());
            int i = (int) (m8780roundToIntSizeuvyYCjk >> 32);
            int i2 = (int) (m8780roundToIntSizeuvyYCjk & 4294967295L);
            if (i == Integer.MAX_VALUE || i2 == Integer.MAX_VALUE) {
                java.lang.StringBuilder sb = new java.lang.StringBuilder("Error: Infinite width/height is invalid. animated bounds: ");
                sb.append(this.sharedElementEntry.getBoundsAnimation().getValue());
                sb.append(", current bounds: ");
                sb.append(this.sharedElementEntry.getSharedElement().getState$animation().getCurrentBounds());
                throw new java.lang.IllegalArgumentException(sb.toString().toString());
            }
            j = androidx.compose.ui.unit.Constraints.INSTANCE.m8564fixedJhjzzOo(kotlin.ranges.RangesKt.coerceAtLeast(i, 0), kotlin.ranges.RangesKt.coerceAtLeast(i2, 0));
        }
        final androidx.compose.ui.layout.Placeable mo7353measureBRTryo0 = measurable.mo7353measureBRTryo0(j);
        androidx.compose.ui.layout.ApproachMeasureScope approachMeasureScope2 = approachMeasureScope;
        if (this.sharedElementEntry.getSharedElement().getState$animation().getMatchIsOrHasBeenConfigured()) {
            m8767constructorimpl = this.sharedElementEntry.getPlaceholderSize().mo1142calculateSizeJyjRU_E(this.sharedElementEntry.getSharedElement().getScope().toLookaheadCoordinates(androidx.compose.ui.node.DelegatableNodeKt.requireLayoutCoordinates(this)).mo7361getSizeYbymL2g(), androidx.compose.ui.unit.IntSize.m8767constructorimpl((mo7353measureBRTryo0.getWidth() << 32) | (mo7353measureBRTryo0.getHeight() & 4294967295L)));
        } else {
            m8767constructorimpl = androidx.compose.ui.unit.IntSize.m8767constructorimpl((mo7353measureBRTryo0.getHeight() & 4294967295L) | (mo7353measureBRTryo0.getWidth() << 32));
        }
        return androidx.compose.ui.layout.MeasureScope.layout$default(approachMeasureScope2, (int) (m8767constructorimpl >> 32), (int) (m8767constructorimpl & 4294967295L), null, new kotlin.jvm.functions.Function1<androidx.compose.ui.layout.Placeable.PlacementScope, kotlin.Unit>() { // from class: androidx.compose.animation.SharedBoundsNode$approachPlace$1
            @Override // kotlin.jvm.functions.Function1
            public final /* synthetic */ kotlin.Unit invoke(androidx.compose.ui.layout.Placeable.PlacementScope placementScope) {
                getHighSpeedVideoFpsRangesFor(placementScope);
                return kotlin.Unit.INSTANCE;
            }

            public final void getHighSpeedVideoFpsRangesFor(androidx.compose.ui.layout.Placeable.PlacementScope placementScope) {
                androidx.compose.animation.SharedElement sharedElement;
                androidx.compose.animation.SharedElement sharedElement2;
                androidx.compose.animation.SharedBoundsNode.this.getHighSpeedVideoFpsRangesFor = true;
                androidx.compose.animation.SharedBoundsNode.this.getHighSpeedVideoSizes = null;
                sharedElement = androidx.compose.animation.SharedBoundsNode.this.sharedElementEntry.getSharedElement();
                androidx.compose.animation.SharedTransitionStateMachine.State state$animation = sharedElement.getState$animation();
                if (!androidx.compose.animation.SharedBoundsNode.this.getSharedElementEntry().isEnabled()) {
                    androidx.compose.ui.layout.Placeable.PlacementScope.place$default(placementScope, mo7353measureBRTryo0, 0, 0, 0.0f, 4, null);
                    return;
                }
                if (state$animation.getMatchIsOrHasBeenConfigured()) {
                    androidx.compose.animation.TargetData targetData = state$animation.getTargetData();
                    if (targetData == null) {
                        throw new java.lang.IllegalArgumentException("Match State is configured, but target data is null. State = ".concat(java.lang.String.valueOf(state$animation)).toString());
                    }
                    androidx.compose.ui.geometry.Rect currentBounds = state$animation.getCurrentBounds();
                    if (currentBounds == null) {
                        throw new java.lang.IllegalArgumentException("Match State is configured, but current bounds is null. State = ".concat(java.lang.String.valueOf(state$animation)).toString());
                    }
                    sharedElement2 = androidx.compose.animation.SharedBoundsNode.this.sharedElementEntry.getSharedElement();
                    if (sharedElement2.getScope().isTransitionActive()) {
                        androidx.compose.animation.SharedBoundsNode.this.approachPlaceMatchInTransition$animation(placementScope, mo7353measureBRTryo0, targetData, currentBounds);
                        return;
                    } else {
                        androidx.compose.animation.SharedBoundsNode.access$approachPlaceMatchBeyondTransition(androidx.compose.animation.SharedBoundsNode.this, placementScope, mo7353measureBRTryo0, currentBounds);
                        return;
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

    @Override // androidx.compose.ui.node.DrawModifierNode
    public final void draw(final androidx.compose.ui.graphics.drawscope.ContentDrawScope contentDrawScope) {
        final androidx.compose.ui.geometry.Rect currentBounds = this.sharedElementEntry.getSharedElement().getState$animation().getCurrentBounds();
        androidx.compose.animation.SharedElementEntry sharedElementEntry = this.sharedElementEntry;
        sharedElementEntry.setClipPathInOverlay$animation((!sharedElementEntry.getShouldRenderInOverlay$animation() || currentBounds == null) ? null : this.sharedElementEntry.getOverlayClip().getClipPath(this.sharedElementEntry.getUserState(), currentBounds, contentDrawScope.getLayoutDirection(), androidx.compose.ui.node.DelegatableNodeKt.requireDensity(this)));
        androidx.compose.ui.graphics.layer.GraphicsLayer layer = this.sharedElementEntry.getLayer();
        if (layer != null) {
            androidx.compose.ui.graphics.drawscope.ContentDrawScope contentDrawScope2 = contentDrawScope;
            androidx.compose.ui.graphics.drawscope.DrawScope.m6529recordJVtK1S4$default(contentDrawScope2, layer, 0L, new kotlin.jvm.functions.Function1<androidx.compose.ui.graphics.drawscope.DrawScope, kotlin.Unit>() { // from class: androidx.compose.animation.SharedBoundsNode$draw$1
                @Override // kotlin.jvm.functions.Function1
                public final /* synthetic */ kotlin.Unit invoke(androidx.compose.ui.graphics.drawscope.DrawScope drawScope) {
                    getHighResolutionOutputSizeshNQ4ISI(drawScope);
                    return kotlin.Unit.INSTANCE;
                }

                public final void getHighResolutionOutputSizeshNQ4ISI(androidx.compose.ui.graphics.drawscope.DrawScope drawScope) {
                    contentDrawScope.drawContent();
                }

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(1);
                }
            }, 1, null);
            if (this.sharedElementEntry.getShouldRenderInPlace()) {
                androidx.compose.ui.graphics.layer.GraphicsLayerKt.drawLayer(contentDrawScope2, layer);
                return;
            }
            return;
        }
        java.lang.StringBuilder sb = new java.lang.StringBuilder("Error: Layer is null when accessed for shared bounds/element : ");
        sb.append(this.sharedElementEntry.getSharedElement().getKey());
        sb.append(",target: ");
        sb.append(this.sharedElementEntry.getBoundsAnimation().getTarget());
        sb.append(", is attached: ");
        sb.append(getIsAttached());
        throw new java.lang.IllegalArgumentException(sb.toString().toString());
    }

    @Override // androidx.compose.ui.node.ObserverModifierNode
    public final void onObservedReadsChanged() {
        this.sharedElementEntry.getSharedElement().updateMatch$animation();
        androidx.compose.ui.node.ObserverModifierNodeKt.observeReads(this, this.sharedElementEntry.getSharedElement().getObservingVisibilityChange$animation());
    }
}
