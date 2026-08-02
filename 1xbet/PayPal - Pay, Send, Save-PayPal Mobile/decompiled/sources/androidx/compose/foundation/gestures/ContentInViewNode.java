package androidx.compose.foundation.gestures;

@kotlin.Metadata(d1 = {"\u0000\u0080\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0001\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u00032\u00020\u0004:\u0001MB9\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\u0006\u0010\t\u001a\u00020\n\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\f\u0012\u000e\u0010\r\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u000f0\u000e¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\"\u001a\u00020\u000f2\u0006\u0010#\u001a\u00020\u000fH\u0016J\b\u0010$\u001a\u00020\fH\u0002J\u001e\u0010%\u001a\u00020&2\u000e\u0010#\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u000f0\u000eH\u0096@¢\u0006\u0002\u0010'J\u0010\u0010(\u001a\u00020&2\b\u0010)\u001a\u0004\u0018\u00010\u0018J\u0017\u0010*\u001a\u00020&2\u0006\u0010+\u001a\u00020\u001cH\u0016¢\u0006\u0004\b,\u0010-J\u0017\u0010.\u001a\u00020&2\u0006\u0010+\u001a\u00020\u001cH\u0002¢\u0006\u0004\b/\u0010-J\n\u00100\u001a\u0004\u0018\u00010\u000fH\u0002J\u0019\u00101\u001a\u00020&2\b\b\u0002\u00102\u001a\u000203H\u0002¢\u0006\u0004\b4\u0010-J\u001f\u00105\u001a\u0002062\u0006\u0010\u000b\u001a\u00020\f2\u0006\u00102\u001a\u000203H\u0002¢\u0006\u0004\b7\u00108J\n\u00109\u001a\u0004\u0018\u00010\u000fH\u0002J\u0010\u0010:\u001a\u00020\u000f2\u0006\u0010;\u001a\u00020\u000fH\u0002J'\u0010<\u001a\u00020\n*\u00020\u000f2\b\b\u0002\u0010+\u001a\u00020\u001c2\b\b\u0002\u0010=\u001a\u000203H\u0002¢\u0006\u0004\b>\u0010?J'\u0010@\u001a\u00020A2\u0006\u0010;\u001a\u00020\u000f2\u0006\u0010B\u001a\u00020\u001c2\u0006\u0010=\u001a\u000203H\u0002¢\u0006\u0004\bC\u0010DJ\u001c\u0010E\u001a\u00020F*\u00020\u001c2\u0006\u0010G\u001a\u00020\u001cH\u0082\u0002¢\u0006\u0004\bH\u0010IJ\u001c\u0010E\u001a\u00020F*\u00020J2\u0006\u0010G\u001a\u00020JH\u0082\u0002¢\u0006\u0004\bK\u0010IJ \u0010L\u001a\u00020&2\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\fR\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\nX\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u000b\u001a\u0004\u0018\u00010\fX\u0082\u000e¢\u0006\u0002\n\u0000R\u0016\u0010\r\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u000f0\u000eX\u0082\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\u0012\u001a\u00020\nX\u0096D¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u000e\u0010\u0015\u001a\u00020\u0016X\u0082\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u0017\u001a\u0004\u0018\u00010\u0018X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0019\u001a\u00020\nX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u001a\u001a\u00020\nX\u0082\u000e¢\u0006\u0002\n\u0000R \u0010\u001d\u001a\u00020\u001c2\u0006\u0010\u001b\u001a\u00020\u001c@BX\u0080\u000e¢\u0006\n\n\u0002\u0010 \u001a\u0004\b\u001e\u0010\u001fR\u000e\u0010!\u001a\u00020\nX\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006N"}, d2 = {"Landroidx/compose/foundation/gestures/ContentInViewNode;", "Landroidx/compose/ui/Modifier$Node;", "Landroidx/compose/foundation/relocation/BringIntoViewResponder;", "Landroidx/compose/ui/node/CompositionLocalConsumerModifierNode;", "Landroidx/compose/ui/node/LayoutAwareModifierNode;", "orientation", "Landroidx/compose/foundation/gestures/Orientation;", "scrollingLogic", "Landroidx/compose/foundation/gestures/ScrollingLogic;", "reverseDirection", "", "bringIntoViewSpec", "Landroidx/compose/foundation/gestures/BringIntoViewSpec;", "getFocusedRect", "Lkotlin/Function0;", "Landroidx/compose/ui/geometry/Rect;", "<init>", "(Landroidx/compose/foundation/gestures/Orientation;Landroidx/compose/foundation/gestures/ScrollingLogic;ZLandroidx/compose/foundation/gestures/BringIntoViewSpec;Lkotlin/jvm/functions/Function0;)V", "shouldAutoInvalidate", "getShouldAutoInvalidate", "()Z", "bringIntoViewRequests", "Landroidx/compose/foundation/gestures/BringIntoViewRequestPriorityQueue;", "focusedChild", "Landroidx/compose/ui/layout/LayoutCoordinates;", "trackingFocusedChild", "childWasMaxVisibleBeforeViewportShrunk", com.datadog.android.rum.internal.metric.ViewEndedMetricDispatcher.KEY_VALUE, "Landroidx/compose/ui/unit/IntSize;", "viewportSize", "getViewportSize-YbymL2g$foundation", "()J", "J", "isAnimationRunning", "calculateRectForParent", "localRect", "requireBringIntoViewSpec", "bringChildIntoView", "", "(Lkotlin/jvm/functions/Function0;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "onFocusBoundsChanged", "newBounds", "onRemeasured", io.ktor.http.ContentDisposition.Parameters.Size, "onRemeasured-ozmzZPI", "(J)V", "onRemeasuredLegacy", "onRemeasuredLegacy-ozmzZPI", "getFocusedChildBounds", "launchAnimation", "viewportAdjustmentForReverseScroll", "Landroidx/compose/ui/unit/IntOffset;", "launchAnimation--gyyYBs", "calculateScrollDelta", "", "calculateScrollDelta-I_oMVgE", "(Landroidx/compose/foundation/gestures/BringIntoViewSpec;J)F", "findBringIntoViewRequest", "computeDestination", "childBounds", "isMaxVisible", "containerOffset", "isMaxVisible--EQwtKw", "(Landroidx/compose/ui/geometry/Rect;JJ)Z", "relocationOffset", "Landroidx/compose/ui/geometry/Offset;", "containerSize", "relocationOffset-fbGrOKE", "(Landroidx/compose/ui/geometry/Rect;JJ)J", "compareTo", "", "other", "compareTo-TemP2vQ", "(JJ)I", "Landroidx/compose/ui/geometry/Size;", "compareTo-iLBOSCw", "update", "Request", "foundation"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class ContentInViewNode extends androidx.compose.ui.Modifier.Node implements androidx.compose.foundation.relocation.BringIntoViewResponder, androidx.compose.ui.node.CompositionLocalConsumerModifierNode, androidx.compose.ui.node.LayoutAwareModifierNode {
    public static final int $stable = 8;
    private androidx.compose.foundation.gestures.BringIntoViewSpec Camera2StreamConfigurationMap;
    private boolean getHighSpeedVideoFpsRanges;
    private androidx.compose.ui.layout.LayoutCoordinates getHighSpeedVideoFpsRangesFor;
    private kotlin.jvm.functions.Function0<androidx.compose.ui.geometry.Rect> getHighSpeedVideoSizes;
    private boolean getHighSpeedVideoSizesFor;
    private boolean getInputFormats;
    private final androidx.compose.foundation.gestures.ScrollingLogic getInputSizeshNQ4ISI;
    private androidx.compose.foundation.gestures.Orientation getOutputFormats;
    private boolean getOutputMinFrameDuration;
    private final boolean shouldAutoInvalidate;
    private final androidx.compose.foundation.gestures.BringIntoViewRequestPriorityQueue getHighResolutionOutputSizeshNQ4ISI = new androidx.compose.foundation.gestures.BringIntoViewRequestPriorityQueue();
    private long viewportSize = androidx.compose.ui.unit.IntSize.INSTANCE.m8777getZeroYbymL2g();

    public ContentInViewNode(androidx.compose.foundation.gestures.Orientation orientation, androidx.compose.foundation.gestures.ScrollingLogic scrollingLogic, boolean z, androidx.compose.foundation.gestures.BringIntoViewSpec bringIntoViewSpec, kotlin.jvm.functions.Function0<androidx.compose.ui.geometry.Rect> function0) {
        this.getOutputFormats = orientation;
        this.getInputSizeshNQ4ISI = scrollingLogic;
        this.getHighSpeedVideoSizesFor = z;
        this.Camera2StreamConfigurationMap = bringIntoViewSpec;
        this.getHighSpeedVideoSizes = function0;
    }

    @Override // androidx.compose.ui.Modifier.Node
    public final boolean getShouldAutoInvalidate() {
        return this.shouldAutoInvalidate;
    }

    /* renamed from: getViewportSize-YbymL2g$foundation, reason: not valid java name and from getter */
    public final long getViewportSize() {
        return this.viewportSize;
    }

    @Override // androidx.compose.foundation.relocation.BringIntoViewResponder
    public final androidx.compose.ui.geometry.Rect calculateRectForParent(androidx.compose.ui.geometry.Rect localRect) {
        if (androidx.compose.ui.unit.IntSize.m8770equalsimpl0(this.viewportSize, androidx.compose.ui.unit.IntSize.INSTANCE.m8777getZeroYbymL2g())) {
            androidx.compose.foundation.internal.InlineClassHelperKt.throwIllegalStateException("Expected BringIntoViewRequester to not be used before parents are placed.");
        }
        return getHighSpeedVideoFpsRanges(localRect);
    }

    private final androidx.compose.foundation.gestures.BringIntoViewSpec getHighResolutionOutputSizeshNQ4ISI() {
        androidx.compose.foundation.gestures.BringIntoViewSpec bringIntoViewSpec = this.Camera2StreamConfigurationMap;
        return bringIntoViewSpec == null ? (androidx.compose.foundation.gestures.BringIntoViewSpec) androidx.compose.ui.node.CompositionLocalConsumerModifierNodeKt.currentValueOf(this, androidx.compose.foundation.gestures.BringIntoViewSpec_androidKt.getLocalBringIntoViewSpec()) : bringIntoViewSpec;
    }

    @Override // androidx.compose.foundation.relocation.BringIntoViewResponder
    public final java.lang.Object bringChildIntoView(kotlin.jvm.functions.Function0<androidx.compose.ui.geometry.Rect> function0, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        androidx.compose.ui.geometry.Rect invoke = function0.invoke();
        if (invoke == null || getHighSpeedVideoFpsRanges(this, invoke, 0L, 0L, 3)) {
            return kotlin.Unit.INSTANCE;
        }
        kotlinx.coroutines.CancellableContinuationImpl cancellableContinuationImpl = new kotlinx.coroutines.CancellableContinuationImpl(kotlin.coroutines.intrinsics.IntrinsicsKt.intercepted(continuation), 1);
        cancellableContinuationImpl.initCancellability();
        if (this.getHighResolutionOutputSizeshNQ4ISI.enqueue(new androidx.compose.foundation.gestures.ContentInViewNode.Request(function0, cancellableContinuationImpl)) && !this.getOutputMinFrameDuration) {
            getHighSpeedVideoFpsRangesFor(this);
        }
        java.lang.Object result = cancellableContinuationImpl.getResult();
        if (result == kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
            kotlin.coroutines.jvm.internal.DebugProbesKt.probeCoroutineSuspended(continuation);
        }
        return result == kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED() ? result : kotlin.Unit.INSTANCE;
    }

    public final void onFocusBoundsChanged(androidx.compose.ui.layout.LayoutCoordinates newBounds) {
        androidx.compose.ui.geometry.Rect highSpeedVideoSizes;
        this.getHighSpeedVideoFpsRangesFor = newBounds;
        if (this.getHighSpeedVideoFpsRanges && (highSpeedVideoSizes = getHighSpeedVideoSizes()) != null && !getHighSpeedVideoFpsRanges(this, highSpeedVideoSizes, this.viewportSize, 0L, 2)) {
            this.getInputFormats = true;
            getHighSpeedVideoFpsRangesFor(this);
        }
        this.getHighSpeedVideoFpsRanges = false;
    }

    @Override // androidx.compose.ui.node.LayoutAwareModifierNode
    /* renamed from: onRemeasured-ozmzZPI */
    public final void mo1407onRemeasuredozmzZPI(long size) {
        long m8740getZeronOccac;
        if (!androidx.compose.foundation.ComposeFoundationFlags.isKeepInViewFocusObservationChangeEnabled) {
            getHighSpeedVideoFpsRanges(size);
            return;
        }
        long j = this.viewportSize;
        this.viewportSize = size;
        if (getHighResolutionOutputSizeshNQ4ISI(size, j) >= 0) {
            return;
        }
        if (!this.getHighSpeedVideoSizesFor) {
            if (this.getOutputFormats == androidx.compose.foundation.gestures.Orientation.Vertical) {
                m8740getZeronOccac = androidx.compose.ui.unit.IntOffset.m8723constructorimpl((((int) (j & 4294967295L)) - ((int) (size & 4294967295L))) & 4294967295L);
            } else {
                m8740getZeronOccac = androidx.compose.ui.unit.IntOffset.m8723constructorimpl((((int) (j >> 32)) - ((int) (size >> 32))) << 32);
            }
        } else {
            m8740getZeronOccac = androidx.compose.ui.unit.IntOffset.INSTANCE.m8740getZeronOccac();
        }
        androidx.compose.ui.geometry.Rect invoke = this.getHighSpeedVideoSizes.invoke();
        if (invoke == null || this.getOutputMinFrameDuration || this.getInputFormats || !getHighSpeedVideoFpsRanges(this, invoke, j, 0L, 2) || getHighSpeedVideoFpsRanges(this, invoke, 0L, m8740getZeronOccac, 1)) {
            return;
        }
        this.getInputFormats = true;
        Camera2StreamConfigurationMap(m8740getZeronOccac);
    }

    private final void getHighSpeedVideoFpsRanges(long j) {
        androidx.compose.ui.geometry.Rect highSpeedVideoSizes;
        long j2 = this.viewportSize;
        this.viewportSize = j;
        if (getHighResolutionOutputSizeshNQ4ISI(j, j2) >= 0 || this.getOutputMinFrameDuration || this.getInputFormats || (highSpeedVideoSizes = getHighSpeedVideoSizes()) == null || !getHighSpeedVideoFpsRanges(this, highSpeedVideoSizes, j2, 0L, 2)) {
            return;
        }
        this.getHighSpeedVideoFpsRanges = true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final androidx.compose.ui.geometry.Rect getHighSpeedVideoSizes() {
        if (androidx.compose.foundation.ComposeFoundationFlags.isKeepInViewFocusObservationChangeEnabled) {
            return this.getHighSpeedVideoSizes.invoke();
        }
        if (!getIsAttached()) {
            return null;
        }
        androidx.compose.ui.layout.LayoutCoordinates requireLayoutCoordinates = androidx.compose.ui.node.DelegatableNodeKt.requireLayoutCoordinates(this);
        androidx.compose.ui.layout.LayoutCoordinates layoutCoordinates = this.getHighSpeedVideoFpsRangesFor;
        if (layoutCoordinates != null) {
            if (!layoutCoordinates.isAttached()) {
                layoutCoordinates = null;
            }
            if (layoutCoordinates != null) {
                return requireLayoutCoordinates.localBoundingBoxOf(layoutCoordinates, false);
            }
        }
        return null;
    }

    private static /* synthetic */ void getHighSpeedVideoFpsRangesFor(androidx.compose.foundation.gestures.ContentInViewNode contentInViewNode) {
        contentInViewNode.Camera2StreamConfigurationMap(androidx.compose.ui.unit.IntOffset.INSTANCE.m8740getZeronOccac());
    }

    private final void Camera2StreamConfigurationMap(long j) {
        androidx.compose.foundation.gestures.BringIntoViewSpec highResolutionOutputSizeshNQ4ISI = getHighResolutionOutputSizeshNQ4ISI();
        if (this.getOutputMinFrameDuration) {
            androidx.compose.foundation.internal.InlineClassHelperKt.throwIllegalStateException("launchAnimation called when previous animation was running");
        }
        kotlinx.coroutines.BuildersKt__Builders_commonKt.launch$default(getCoroutineScope(), null, kotlinx.coroutines.CoroutineStart.UNDISPATCHED, new androidx.compose.foundation.gestures.ContentInViewNode$launchAnimation$2(this, new androidx.compose.foundation.gestures.UpdatableAnimationState(getHighResolutionOutputSizeshNQ4ISI().getScrollAnimationSpec()), highResolutionOutputSizeshNQ4ISI, j, null), 1, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final float getHighSpeedVideoFpsRangesFor(androidx.compose.foundation.gestures.BringIntoViewSpec bringIntoViewSpec, long j) {
        if (androidx.compose.ui.unit.IntSize.m8770equalsimpl0(this.viewportSize, androidx.compose.ui.unit.IntSize.INSTANCE.m8777getZeroYbymL2g())) {
            return 0.0f;
        }
        androidx.compose.ui.geometry.Rect Camera2StreamConfigurationMap = Camera2StreamConfigurationMap();
        if (Camera2StreamConfigurationMap == null) {
            Camera2StreamConfigurationMap = this.getInputFormats ? getHighSpeedVideoSizes() : null;
            if (Camera2StreamConfigurationMap == null) {
                return 0.0f;
            }
        }
        long m8784toSizeozmzZPI = androidx.compose.ui.unit.IntSizeKt.m8784toSizeozmzZPI(this.viewportSize);
        int i = androidx.compose.foundation.gestures.ContentInViewNode.WhenMappings.$EnumSwitchMapping$0[this.getOutputFormats.ordinal()];
        if (i == 1) {
            return bringIntoViewSpec.calculateScrollDistance(Camera2StreamConfigurationMap.getTop() - androidx.compose.ui.unit.IntOffset.m8730getYimpl(j), Camera2StreamConfigurationMap.getBottom() - Camera2StreamConfigurationMap.getTop(), java.lang.Float.intBitsToFloat((int) (m8784toSizeozmzZPI & 4294967295L)));
        }
        if (i != 2) {
            throw new kotlin.NoWhenBranchMatchedException();
        }
        return bringIntoViewSpec.calculateScrollDistance(Camera2StreamConfigurationMap.getLeft() - androidx.compose.ui.unit.IntOffset.m8729getXimpl(j), Camera2StreamConfigurationMap.getRight() - Camera2StreamConfigurationMap.getLeft(), java.lang.Float.intBitsToFloat((int) (m8784toSizeozmzZPI >> 32)));
    }

    private final androidx.compose.ui.geometry.Rect Camera2StreamConfigurationMap() {
        androidx.compose.runtime.collection.MutableVector mutableVector = this.getHighResolutionOutputSizeshNQ4ISI.getHighResolutionOutputSizeshNQ4ISI;
        int size = mutableVector.getSize() - 1;
        java.lang.Object[] objArr = mutableVector.content;
        androidx.compose.ui.geometry.Rect rect = null;
        if (size < objArr.length) {
            while (true) {
                if (size < 0) {
                    break;
                }
                androidx.compose.ui.geometry.Rect invoke = ((androidx.compose.foundation.gestures.ContentInViewNode.Request) objArr[size]).getCurrentBounds().invoke();
                if (invoke != null) {
                    if (getHighSpeedVideoSizes(invoke.m5785getSizeNHjbRc(), androidx.compose.ui.unit.IntSizeKt.m8784toSizeozmzZPI(this.viewportSize)) <= 0) {
                        rect = invoke;
                    } else if (rect == null) {
                        return invoke;
                    }
                }
                size--;
            }
        }
        return rect;
    }

    private final androidx.compose.ui.geometry.Rect getHighSpeedVideoFpsRanges(androidx.compose.ui.geometry.Rect rect) {
        return rect.m5789translatek4lQ0M(androidx.compose.ui.geometry.Offset.m5744constructorimpl(getHighSpeedVideoSizes(rect, this.viewportSize, androidx.compose.ui.unit.IntOffset.INSTANCE.m8740getZeronOccac()) ^ (-9223372034707292160L)));
    }

    static /* synthetic */ boolean getHighSpeedVideoFpsRanges(androidx.compose.foundation.gestures.ContentInViewNode contentInViewNode, androidx.compose.ui.geometry.Rect rect, long j, long j2, int i) {
        if ((i & 1) != 0) {
            j = contentInViewNode.viewportSize;
        }
        long j3 = j;
        if ((i & 2) != 0) {
            j2 = androidx.compose.ui.unit.IntOffset.INSTANCE.m8740getZeronOccac();
        }
        return contentInViewNode.getHighResolutionOutputSizeshNQ4ISI(rect, j3, j2);
    }

    private final boolean getHighResolutionOutputSizeshNQ4ISI(androidx.compose.ui.geometry.Rect rect, long j, long j2) {
        long highSpeedVideoSizes = getHighSpeedVideoSizes(rect, j, j2);
        return java.lang.Math.abs(java.lang.Float.intBitsToFloat((int) (highSpeedVideoSizes >> 32))) <= 0.5f && java.lang.Math.abs(java.lang.Float.intBitsToFloat((int) (highSpeedVideoSizes & 4294967295L))) <= 0.5f;
    }

    private final long getHighSpeedVideoSizes(androidx.compose.ui.geometry.Rect rect, long j, long j2) {
        long m8784toSizeozmzZPI = androidx.compose.ui.unit.IntSizeKt.m8784toSizeozmzZPI(j);
        int i = androidx.compose.foundation.gestures.ContentInViewNode.WhenMappings.$EnumSwitchMapping$0[this.getOutputFormats.ordinal()];
        if (i != 1) {
            if (i != 2) {
                throw new kotlin.NoWhenBranchMatchedException();
            }
            androidx.compose.foundation.gestures.BringIntoViewSpec highResolutionOutputSizeshNQ4ISI = getHighResolutionOutputSizeshNQ4ISI();
            float left = rect.getLeft();
            float m8729getXimpl = androidx.compose.ui.unit.IntOffset.m8729getXimpl(j2);
            return androidx.compose.ui.geometry.Offset.m5744constructorimpl((java.lang.Float.floatToRawIntBits(highResolutionOutputSizeshNQ4ISI.calculateScrollDistance(left - m8729getXimpl, rect.getRight() - rect.getLeft(), java.lang.Float.intBitsToFloat((int) (m8784toSizeozmzZPI >> 32)))) << 32) | (java.lang.Float.floatToRawIntBits(0.0f) & 4294967295L));
        }
        float calculateScrollDistance = getHighResolutionOutputSizeshNQ4ISI().calculateScrollDistance(rect.getTop() - androidx.compose.ui.unit.IntOffset.m8730getYimpl(j2), rect.getBottom() - rect.getTop(), java.lang.Float.intBitsToFloat((int) (m8784toSizeozmzZPI & 4294967295L)));
        return androidx.compose.ui.geometry.Offset.m5744constructorimpl((java.lang.Float.floatToRawIntBits(0.0f) << 32) | (java.lang.Float.floatToRawIntBits(calculateScrollDistance) & 4294967295L));
    }

    private final int getHighResolutionOutputSizeshNQ4ISI(long j, long j2) {
        int i = androidx.compose.foundation.gestures.ContentInViewNode.WhenMappings.$EnumSwitchMapping$0[this.getOutputFormats.ordinal()];
        if (i == 1) {
            return kotlin.jvm.internal.Intrinsics.compare((int) (j & 4294967295L), (int) (j2 & 4294967295L));
        }
        if (i != 2) {
            throw new kotlin.NoWhenBranchMatchedException();
        }
        return kotlin.jvm.internal.Intrinsics.compare((int) (j >> 32), (int) (j2 >> 32));
    }

    private final int getHighSpeedVideoSizes(long j, long j2) {
        int i = androidx.compose.foundation.gestures.ContentInViewNode.WhenMappings.$EnumSwitchMapping$0[this.getOutputFormats.ordinal()];
        if (i == 1) {
            return java.lang.Float.compare(java.lang.Float.intBitsToFloat((int) (j & 4294967295L)), java.lang.Float.intBitsToFloat((int) (j2 & 4294967295L)));
        }
        if (i != 2) {
            throw new kotlin.NoWhenBranchMatchedException();
        }
        return java.lang.Float.compare(java.lang.Float.intBitsToFloat((int) (j >> 32)), java.lang.Float.intBitsToFloat((int) (j2 >> 32)));
    }

    public final void update(androidx.compose.foundation.gestures.Orientation orientation, boolean reverseDirection, androidx.compose.foundation.gestures.BringIntoViewSpec bringIntoViewSpec) {
        this.getOutputFormats = orientation;
        this.getHighSpeedVideoSizesFor = reverseDirection;
        this.Camera2StreamConfigurationMap = bringIntoViewSpec;
    }

    @kotlin.Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\b\b\u0000\u0018\u00002\u00020\u0001B%\u0012\u000e\u0010\u0004\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u0002\u0012\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\u0004\b\b\u0010\tJ\u000f\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\u000b\u0010\fR\u001f\u0010\u0004\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u00028\u0007¢\u0006\f\n\u0004\b\u0004\u0010\r\u001a\u0004\b\u000e\u0010\u000fR \u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00058\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012"}, d2 = {"Landroidx/compose/foundation/gestures/ContentInViewNode$Request;", "", "Lkotlin/Function0;", "Landroidx/compose/ui/geometry/Rect;", "currentBounds", "Lkotlinx/coroutines/CancellableContinuation;", "", "continuation", "<init>", "(Lkotlin/jvm/functions/Function0;Lkotlinx/coroutines/CancellableContinuation;)V", "", "toString", "()Ljava/lang/String;", "Lkotlin/jvm/functions/Function0;", "getCurrentBounds", "()Lkotlin/jvm/functions/Function0;", "Lkotlinx/coroutines/CancellableContinuation;", "getContinuation", "()Lkotlinx/coroutines/CancellableContinuation;"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Request {
        public static final int $stable = 8;
        private final kotlinx.coroutines.CancellableContinuation<kotlin.Unit> continuation;
        private final kotlin.jvm.functions.Function0<androidx.compose.ui.geometry.Rect> currentBounds;

        /* JADX WARN: Multi-variable type inference failed */
        public Request(kotlin.jvm.functions.Function0<androidx.compose.ui.geometry.Rect> function0, kotlinx.coroutines.CancellableContinuation<? super kotlin.Unit> cancellableContinuation) {
            this.currentBounds = function0;
            this.continuation = cancellableContinuation;
        }

        public final kotlin.jvm.functions.Function0<androidx.compose.ui.geometry.Rect> getCurrentBounds() {
            return this.currentBounds;
        }

        public final kotlinx.coroutines.CancellableContinuation<kotlin.Unit> getContinuation() {
            return this.continuation;
        }

        /* JADX WARN: Code restructure failed: missing block: B:7:0x004a, code lost:
        
            if (r0 == null) goto L10;
         */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final java.lang.String toString() {
            java.lang.String str;
            kotlinx.coroutines.CoroutineName coroutineName = (kotlinx.coroutines.CoroutineName) this.continuation.getGetHighSpeedVideoSizes().get(kotlinx.coroutines.CoroutineName.INSTANCE);
            java.lang.String name2 = coroutineName != null ? coroutineName.getName() : null;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("Request@");
            java.lang.String num = java.lang.Integer.toString(hashCode(), kotlin.text.CharsKt.checkRadix(16));
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(num, "");
            sb.append(num);
            if (name2 != null) {
                java.lang.StringBuilder sb2 = new java.lang.StringBuilder("[");
                sb2.append(name2);
                sb2.append("](");
                str = sb2.toString();
            }
            str = "(";
            sb.append(str);
            sb.append("currentBounds()=");
            sb.append(this.currentBounds.invoke());
            sb.append(", continuation=");
            sb.append(this.continuation);
            sb.append(')');
            return sb.toString();
        }
    }

    @kotlin.Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public static final /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[androidx.compose.foundation.gestures.Orientation.values().length];
            try {
                iArr[androidx.compose.foundation.gestures.Orientation.Vertical.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused) {
            }
            try {
                iArr[androidx.compose.foundation.gestures.Orientation.Horizontal.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }
}
