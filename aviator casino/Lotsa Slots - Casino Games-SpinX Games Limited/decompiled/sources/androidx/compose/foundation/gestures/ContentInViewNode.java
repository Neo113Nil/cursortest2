package androidx.compose.foundation.gestures;

/* compiled from: ContentInViewNode.kt */
@kotlin.Metadata(d1 = {"\u0000z\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0002\b\u0010\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0002\b\t\b\u0000\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003:\u0001EB%\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\u000b¢\u0006\u0002\u0010\fJ\u001e\u0010\u001e\u001a\u00020\u001f2\u000e\u0010 \u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00150!H\u0096@¢\u0006\u0002\u0010\"J\u0010\u0010#\u001a\u00020\u00152\u0006\u0010 \u001a\u00020\u0015H\u0016J\b\u0010$\u001a\u00020%H\u0002J\"\u0010&\u001a\u00020\u00152\u0006\u0010'\u001a\u00020\u00152\u0006\u0010(\u001a\u00020\u0019H\u0002ø\u0001\u0000¢\u0006\u0004\b)\u0010*J\n\u0010+\u001a\u0004\u0018\u00010\u0015H\u0002J\n\u0010,\u001a\u0004\u0018\u00010\u0015H\u0002J\b\u0010-\u001a\u00020\u001fH\u0002J\u0010\u0010.\u001a\u00020\u001f2\b\u0010/\u001a\u0004\u0018\u00010\u0012J\u0010\u00100\u001a\u00020\u001f2\u0006\u0010\u0011\u001a\u00020\u0012H\u0016J\u001a\u00101\u001a\u00020\u001f2\u0006\u00102\u001a\u00020\u0019H\u0016ø\u0001\u0000¢\u0006\u0004\b3\u00104J\"\u00105\u001a\u0002062\u0006\u0010'\u001a\u00020\u00152\u0006\u0010(\u001a\u00020\u0019H\u0002ø\u0001\u0000¢\u0006\u0004\b7\u00108J&\u00109\u001a\u00020\u001f2\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010:\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000bJ\u001f\u0010;\u001a\u00020<*\u00020=2\u0006\u0010>\u001a\u00020=H\u0082\u0002ø\u0001\u0000¢\u0006\u0004\b?\u0010@J\u001f\u0010;\u001a\u00020<*\u00020\u00192\u0006\u0010>\u001a\u00020\u0019H\u0082\u0002ø\u0001\u0000¢\u0006\u0004\bA\u0010@J \u0010B\u001a\u00020\t*\u00020\u00152\b\b\u0002\u00102\u001a\u00020\u0019H\u0002ø\u0001\u0000¢\u0006\u0004\bC\u0010DR\u000e\u0010\r\u001a\u00020\u000eX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\u0010X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u000bX\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0011\u001a\u0004\u0018\u00010\u0012X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0013\u001a\u0004\u0018\u00010\u0012X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0014\u001a\u0004\u0018\u00010\u0015X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0016\u001a\u00020\tX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0017\u001a\u00020\tX\u0082\u000e¢\u0006\u0002\n\u0000R&\u0010\u001a\u001a\u00020\u00192\u0006\u0010\u0018\u001a\u00020\u0019@BX\u0080\u000eø\u0001\u0000ø\u0001\u0001¢\u0006\n\n\u0002\u0010\u001d\u001a\u0004\b\u001b\u0010\u001c\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006F"}, d2 = {"Landroidx/compose/foundation/gestures/ContentInViewNode;", "Landroidx/compose/ui/Modifier$Node;", "Landroidx/compose/foundation/relocation/BringIntoViewResponder;", "Landroidx/compose/ui/node/LayoutAwareModifierNode;", "orientation", "Landroidx/compose/foundation/gestures/Orientation;", "scrollState", "Landroidx/compose/foundation/gestures/ScrollableState;", "reverseDirection", "", "bringIntoViewSpec", "Landroidx/compose/foundation/gestures/BringIntoViewSpec;", "(Landroidx/compose/foundation/gestures/Orientation;Landroidx/compose/foundation/gestures/ScrollableState;ZLandroidx/compose/foundation/gestures/BringIntoViewSpec;)V", "animationState", "Landroidx/compose/foundation/gestures/UpdatableAnimationState;", "bringIntoViewRequests", "Landroidx/compose/foundation/gestures/BringIntoViewRequestPriorityQueue;", com.ironsource.Y3.f, "Landroidx/compose/ui/layout/LayoutCoordinates;", "focusedChild", "focusedChildBoundsFromPreviousRemeasure", "Landroidx/compose/ui/geometry/Rect;", "isAnimationRunning", "trackingFocusedChild", "<set-?>", "Landroidx/compose/ui/unit/IntSize;", "viewportSize", "getViewportSize-YbymL2g$foundation_release", "()J", "J", "bringChildIntoView", "", "localRect", "Lkotlin/Function0;", "(Lkotlin/jvm/functions/Function0;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "calculateRectForParent", "calculateScrollDelta", "", "computeDestination", "childBounds", "containerSize", "computeDestination-O0kMr_c", "(Landroidx/compose/ui/geometry/Rect;J)Landroidx/compose/ui/geometry/Rect;", "findBringIntoViewRequest", "getFocusedChildBounds", "launchAnimation", "onFocusBoundsChanged", "newBounds", "onPlaced", "onRemeasured", "size", "onRemeasured-ozmzZPI", "(J)V", "relocationOffset", "Landroidx/compose/ui/geometry/Offset;", "relocationOffset-BMxPBkI", "(Landroidx/compose/ui/geometry/Rect;J)J", "update", "state", "compareTo", "", "Landroidx/compose/ui/geometry/Size;", "other", "compareTo-iLBOSCw", "(JJ)I", "compareTo-TemP2vQ", "isMaxVisible", "isMaxVisible-O0kMr_c", "(Landroidx/compose/ui/geometry/Rect;J)Z", "Request", "foundation_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class ContentInViewNode extends androidx.compose.ui.Modifier.Node implements androidx.compose.foundation.relocation.BringIntoViewResponder, androidx.compose.ui.node.LayoutAwareModifierNode {
    public static final int $stable = 8;
    private final androidx.compose.foundation.gestures.UpdatableAnimationState animationState;
    private androidx.compose.foundation.gestures.BringIntoViewSpec bringIntoViewSpec;
    private androidx.compose.ui.layout.LayoutCoordinates coordinates;
    private androidx.compose.ui.layout.LayoutCoordinates focusedChild;
    private androidx.compose.ui.geometry.Rect focusedChildBoundsFromPreviousRemeasure;
    private boolean isAnimationRunning;
    private androidx.compose.foundation.gestures.Orientation orientation;
    private boolean reverseDirection;
    private androidx.compose.foundation.gestures.ScrollableState scrollState;
    private boolean trackingFocusedChild;
    private final androidx.compose.foundation.gestures.BringIntoViewRequestPriorityQueue bringIntoViewRequests = new androidx.compose.foundation.gestures.BringIntoViewRequestPriorityQueue();
    private long viewportSize = androidx.compose.ui.unit.IntSize.INSTANCE.m4657getZeroYbymL2g();

    /* compiled from: ContentInViewNode.kt */
    @kotlin.Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    public /* synthetic */ class WhenMappings {
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

    public ContentInViewNode(androidx.compose.foundation.gestures.Orientation orientation, androidx.compose.foundation.gestures.ScrollableState scrollableState, boolean z, androidx.compose.foundation.gestures.BringIntoViewSpec bringIntoViewSpec) {
        this.orientation = orientation;
        this.scrollState = scrollableState;
        this.reverseDirection = z;
        this.bringIntoViewSpec = bringIntoViewSpec;
        this.animationState = new androidx.compose.foundation.gestures.UpdatableAnimationState(this.bringIntoViewSpec.getScrollAnimationSpec());
    }

    /* renamed from: getViewportSize-YbymL2g$foundation_release, reason: not valid java name and from getter */
    public final long getViewportSize() {
        return this.viewportSize;
    }

    @Override // androidx.compose.foundation.relocation.BringIntoViewResponder
    public androidx.compose.ui.geometry.Rect calculateRectForParent(androidx.compose.ui.geometry.Rect localRect) {
        if (!(!androidx.compose.ui.unit.IntSize.m4650equalsimpl0(this.viewportSize, androidx.compose.ui.unit.IntSize.INSTANCE.m4657getZeroYbymL2g()))) {
            throw new java.lang.IllegalStateException("Expected BringIntoViewRequester to not be used before parents are placed.".toString());
        }
        return m324computeDestinationO0kMr_c(localRect, this.viewportSize);
    }

    @Override // androidx.compose.foundation.relocation.BringIntoViewResponder
    public java.lang.Object bringChildIntoView(kotlin.jvm.functions.Function0<androidx.compose.ui.geometry.Rect> function0, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        androidx.compose.ui.geometry.Rect invoke = function0.invoke();
        if (invoke == null || m326isMaxVisibleO0kMr_c$default(this, invoke, 0L, 1, null)) {
            return kotlin.Unit.INSTANCE;
        }
        kotlinx.coroutines.CancellableContinuationImpl cancellableContinuationImpl = new kotlinx.coroutines.CancellableContinuationImpl(kotlin.coroutines.intrinsics.IntrinsicsKt.intercepted(continuation), 1);
        cancellableContinuationImpl.initCancellability();
        if (this.bringIntoViewRequests.enqueue(new androidx.compose.foundation.gestures.ContentInViewNode.Request(function0, cancellableContinuationImpl)) && !this.isAnimationRunning) {
            launchAnimation();
        }
        java.lang.Object result = cancellableContinuationImpl.getResult();
        if (result == kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
            kotlin.coroutines.jvm.internal.DebugProbesKt.probeCoroutineSuspended(continuation);
        }
        return result == kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED() ? result : kotlin.Unit.INSTANCE;
    }

    public final void onFocusBoundsChanged(androidx.compose.ui.layout.LayoutCoordinates newBounds) {
        this.focusedChild = newBounds;
    }

    @Override // androidx.compose.ui.node.LayoutAwareModifierNode
    public void onPlaced(androidx.compose.ui.layout.LayoutCoordinates coordinates) {
        this.coordinates = coordinates;
    }

    @Override // androidx.compose.ui.node.LayoutAwareModifierNode
    /* renamed from: onRemeasured-ozmzZPI */
    public void mo268onRemeasuredozmzZPI(long size) {
        androidx.compose.ui.geometry.Rect focusedChildBounds;
        long j = this.viewportSize;
        this.viewportSize = size;
        if (m322compareToTemP2vQ(size, j) < 0 && (focusedChildBounds = getFocusedChildBounds()) != null) {
            androidx.compose.ui.geometry.Rect rect = this.focusedChildBoundsFromPreviousRemeasure;
            if (rect == null) {
                rect = focusedChildBounds;
            }
            if (!this.isAnimationRunning && !this.trackingFocusedChild && m325isMaxVisibleO0kMr_c(rect, j) && !m325isMaxVisibleO0kMr_c(focusedChildBounds, size)) {
                this.trackingFocusedChild = true;
                launchAnimation();
            }
            this.focusedChildBoundsFromPreviousRemeasure = focusedChildBounds;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final androidx.compose.ui.geometry.Rect getFocusedChildBounds() {
        androidx.compose.ui.layout.LayoutCoordinates layoutCoordinates;
        androidx.compose.ui.layout.LayoutCoordinates layoutCoordinates2 = this.coordinates;
        if (layoutCoordinates2 != null) {
            if (!layoutCoordinates2.isAttached()) {
                layoutCoordinates2 = null;
            }
            if (layoutCoordinates2 != null && (layoutCoordinates = this.focusedChild) != null) {
                if (!layoutCoordinates.isAttached()) {
                    layoutCoordinates = null;
                }
                if (layoutCoordinates != null) {
                    return layoutCoordinates2.localBoundingBoxOf(layoutCoordinates, false);
                }
            }
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void launchAnimation() {
        if (!this.isAnimationRunning) {
            kotlinx.coroutines.BuildersKt__Builders_commonKt.launch$default(getCoroutineScope(), null, kotlinx.coroutines.CoroutineStart.UNDISPATCHED, new androidx.compose.foundation.gestures.ContentInViewNode$launchAnimation$2(this, null), 1, null);
            return;
        }
        throw new java.lang.IllegalStateException("launchAnimation called when previous animation was running".toString());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final float calculateScrollDelta() {
        if (androidx.compose.ui.unit.IntSize.m4650equalsimpl0(this.viewportSize, androidx.compose.ui.unit.IntSize.INSTANCE.m4657getZeroYbymL2g())) {
            return 0.0f;
        }
        androidx.compose.ui.geometry.Rect findBringIntoViewRequest = findBringIntoViewRequest();
        if (findBringIntoViewRequest == null) {
            findBringIntoViewRequest = this.trackingFocusedChild ? getFocusedChildBounds() : null;
            if (findBringIntoViewRequest == null) {
                return 0.0f;
            }
        }
        long m4662toSizeozmzZPI = androidx.compose.ui.unit.IntSizeKt.m4662toSizeozmzZPI(this.viewportSize);
        int i = androidx.compose.foundation.gestures.ContentInViewNode.WhenMappings.$EnumSwitchMapping$0[this.orientation.ordinal()];
        if (i == 1) {
            return this.bringIntoViewSpec.calculateScrollDistance(findBringIntoViewRequest.getTop(), findBringIntoViewRequest.getBottom() - findBringIntoViewRequest.getTop(), androidx.compose.ui.geometry.Size.m1937getHeightimpl(m4662toSizeozmzZPI));
        }
        if (i == 2) {
            return this.bringIntoViewSpec.calculateScrollDistance(findBringIntoViewRequest.getLeft(), findBringIntoViewRequest.getRight() - findBringIntoViewRequest.getLeft(), androidx.compose.ui.geometry.Size.m1940getWidthimpl(m4662toSizeozmzZPI));
        }
        throw new kotlin.NoWhenBranchMatchedException();
    }

    private final androidx.compose.ui.geometry.Rect findBringIntoViewRequest() {
        androidx.compose.runtime.collection.MutableVector mutableVector = this.bringIntoViewRequests.requests;
        int size = mutableVector.getSize();
        androidx.compose.ui.geometry.Rect rect = null;
        if (size > 0) {
            int i = size - 1;
            java.lang.Object[] content = mutableVector.getContent();
            do {
                androidx.compose.ui.geometry.Rect invoke = ((androidx.compose.foundation.gestures.ContentInViewNode.Request) content[i]).getCurrentBounds().invoke();
                if (invoke != null) {
                    if (m323compareToiLBOSCw(invoke.m1904getSizeNHjbRc(), androidx.compose.ui.unit.IntSizeKt.m4662toSizeozmzZPI(this.viewportSize)) > 0) {
                        return rect == null ? invoke : rect;
                    }
                    rect = invoke;
                }
                i--;
            } while (i >= 0);
        }
        return rect;
    }

    /* renamed from: computeDestination-O0kMr_c, reason: not valid java name */
    private final androidx.compose.ui.geometry.Rect m324computeDestinationO0kMr_c(androidx.compose.ui.geometry.Rect childBounds, long containerSize) {
        return childBounds.m1908translatek4lQ0M(androidx.compose.ui.geometry.Offset.m1880unaryMinusF1C5BW0(m327relocationOffsetBMxPBkI(childBounds, containerSize)));
    }

    /* renamed from: isMaxVisible-O0kMr_c$default, reason: not valid java name */
    static /* synthetic */ boolean m326isMaxVisibleO0kMr_c$default(androidx.compose.foundation.gestures.ContentInViewNode contentInViewNode, androidx.compose.ui.geometry.Rect rect, long j, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            j = contentInViewNode.viewportSize;
        }
        return contentInViewNode.m325isMaxVisibleO0kMr_c(rect, j);
    }

    /* renamed from: isMaxVisible-O0kMr_c, reason: not valid java name */
    private final boolean m325isMaxVisibleO0kMr_c(androidx.compose.ui.geometry.Rect rect, long j) {
        long m327relocationOffsetBMxPBkI = m327relocationOffsetBMxPBkI(rect, j);
        return java.lang.Math.abs(androidx.compose.ui.geometry.Offset.m1871getXimpl(m327relocationOffsetBMxPBkI)) <= 0.5f && java.lang.Math.abs(androidx.compose.ui.geometry.Offset.m1872getYimpl(m327relocationOffsetBMxPBkI)) <= 0.5f;
    }

    /* renamed from: relocationOffset-BMxPBkI, reason: not valid java name */
    private final long m327relocationOffsetBMxPBkI(androidx.compose.ui.geometry.Rect childBounds, long containerSize) {
        long m4662toSizeozmzZPI = androidx.compose.ui.unit.IntSizeKt.m4662toSizeozmzZPI(containerSize);
        int i = androidx.compose.foundation.gestures.ContentInViewNode.WhenMappings.$EnumSwitchMapping$0[this.orientation.ordinal()];
        if (i == 1) {
            return androidx.compose.ui.geometry.OffsetKt.Offset(0.0f, this.bringIntoViewSpec.calculateScrollDistance(childBounds.getTop(), childBounds.getBottom() - childBounds.getTop(), androidx.compose.ui.geometry.Size.m1937getHeightimpl(m4662toSizeozmzZPI)));
        }
        if (i == 2) {
            return androidx.compose.ui.geometry.OffsetKt.Offset(this.bringIntoViewSpec.calculateScrollDistance(childBounds.getLeft(), childBounds.getRight() - childBounds.getLeft(), androidx.compose.ui.geometry.Size.m1940getWidthimpl(m4662toSizeozmzZPI)), 0.0f);
        }
        throw new kotlin.NoWhenBranchMatchedException();
    }

    /* renamed from: compareTo-TemP2vQ, reason: not valid java name */
    private final int m322compareToTemP2vQ(long j, long j2) {
        int i = androidx.compose.foundation.gestures.ContentInViewNode.WhenMappings.$EnumSwitchMapping$0[this.orientation.ordinal()];
        if (i == 1) {
            return kotlin.jvm.internal.Intrinsics.compare(androidx.compose.ui.unit.IntSize.m4651getHeightimpl(j), androidx.compose.ui.unit.IntSize.m4651getHeightimpl(j2));
        }
        if (i == 2) {
            return kotlin.jvm.internal.Intrinsics.compare(androidx.compose.ui.unit.IntSize.m4652getWidthimpl(j), androidx.compose.ui.unit.IntSize.m4652getWidthimpl(j2));
        }
        throw new kotlin.NoWhenBranchMatchedException();
    }

    /* renamed from: compareTo-iLBOSCw, reason: not valid java name */
    private final int m323compareToiLBOSCw(long j, long j2) {
        int i = androidx.compose.foundation.gestures.ContentInViewNode.WhenMappings.$EnumSwitchMapping$0[this.orientation.ordinal()];
        if (i == 1) {
            return java.lang.Float.compare(androidx.compose.ui.geometry.Size.m1937getHeightimpl(j), androidx.compose.ui.geometry.Size.m1937getHeightimpl(j2));
        }
        if (i == 2) {
            return java.lang.Float.compare(androidx.compose.ui.geometry.Size.m1940getWidthimpl(j), androidx.compose.ui.geometry.Size.m1940getWidthimpl(j2));
        }
        throw new kotlin.NoWhenBranchMatchedException();
    }

    public final void update(androidx.compose.foundation.gestures.Orientation orientation, androidx.compose.foundation.gestures.ScrollableState state, boolean reverseDirection, androidx.compose.foundation.gestures.BringIntoViewSpec bringIntoViewSpec) {
        this.orientation = orientation;
        this.scrollState = state;
        this.reverseDirection = reverseDirection;
        this.bringIntoViewSpec = bringIntoViewSpec;
    }

    /* compiled from: ContentInViewNode.kt */
    @kotlin.Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0000\b\u0000\u0018\u00002\u00020\u0001B#\u0012\u000e\u0010\u0002\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00040\u0003\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006¢\u0006\u0002\u0010\bJ\b\u0010\r\u001a\u00020\u000eH\u0016R\u0017\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0019\u0010\u0002\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00040\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\f¨\u0006\u000f"}, d2 = {"Landroidx/compose/foundation/gestures/ContentInViewNode$Request;", "", "currentBounds", "Lkotlin/Function0;", "Landroidx/compose/ui/geometry/Rect;", "continuation", "Lkotlinx/coroutines/CancellableContinuation;", "", "(Lkotlin/jvm/functions/Function0;Lkotlinx/coroutines/CancellableContinuation;)V", "getContinuation", "()Lkotlinx/coroutines/CancellableContinuation;", "getCurrentBounds", "()Lkotlin/jvm/functions/Function0;", "toString", "", "foundation_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
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
        public java.lang.String toString() {
            java.lang.String str;
            kotlinx.coroutines.CoroutineName coroutineName = (kotlinx.coroutines.CoroutineName) this.continuation.get$context().get(kotlinx.coroutines.CoroutineName.INSTANCE);
            java.lang.String name = coroutineName != null ? coroutineName.getName() : null;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("Request@");
            java.lang.String num = java.lang.Integer.toString(hashCode(), kotlin.text.CharsKt.checkRadix(16));
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(num, "toString(this, checkRadix(radix))");
            sb.append(num);
            if (name != null) {
                str = com.ironsource.X3.j.d + name + "](";
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
}
