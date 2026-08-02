package androidx.compose.foundation.lazy.staggeredgrid;

@kotlin.Metadata(d1 = {"\u0000\u008b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0015\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0012\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0007\n\u0002\b\b\n\u0002\u0010%\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0011\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\"\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0004*\u0001&\b\u0007\u0018\u0000 ²\u00012\u00020\u0001:\u0002²\u0001B#\b\u0000\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\u0007\u0010\bB\u001d\b\u0016\u0012\b\b\u0002\u0010\t\u001a\u00020\n\u0012\b\b\u0002\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\u0007\u0010\fJ\b\u0010(\u001a\u00020\nH\u0002J\u0015\u0010X\u001a\u00020Y2\u0006\u0010Z\u001a\u00020\u000eH\u0000¢\u0006\u0002\b[JK\u0010\u0081\u0001\u001a\u00030\u0082\u00012\b\u0010\u0083\u0001\u001a\u00030\u0084\u00012.\u0010\u0085\u0001\u001a)\b\u0001\u0012\u0005\u0012\u00030\u0087\u0001\u0012\f\u0012\n\u0012\u0005\u0012\u00030\u0082\u00010\u0088\u0001\u0012\u0007\u0012\u0005\u0018\u00010\u0089\u00010\u0086\u0001¢\u0006\u0003\b\u008a\u0001H\u0096@¢\u0006\u0003\u0010\u008b\u0001J\u0012\u0010\u008d\u0001\u001a\u00020Y2\u0007\u0010\u008e\u0001\u001a\u00020YH\u0002J%\u0010\u008f\u0001\u001a\u00030\u0082\u00012\u0007\u0010\u0090\u0001\u001a\u00020\n2\t\b\u0002\u0010\u0091\u0001\u001a\u00020\nH\u0086@¢\u0006\u0003\u0010\u0092\u0001J%\u0010\u0093\u0001\u001a\u00030\u0082\u00012\u0007\u0010\u0090\u0001\u001a\u00020\n2\t\b\u0002\u0010\u0091\u0001\u001a\u00020\nH\u0086@¢\u0006\u0003\u0010\u0092\u0001J\u001e\u0010\u0096\u0001\u001a\u00030\u0082\u00012\t\b\u0001\u0010\u0090\u0001\u001a\u00020\n2\t\b\u0002\u0010\u0091\u0001\u001a\u00020\nJ+\u0010\u0097\u0001\u001a\u00030\u0082\u00012\u0007\u0010\u0090\u0001\u001a\u00020\n2\u0007\u0010\u0091\u0001\u001a\u00020\n2\u0007\u0010\u0098\u0001\u001a\u00020\u000eH\u0000¢\u0006\u0003\b\u0099\u0001J\"\u0010\u009a\u0001\u001a\u00020\u00032\b\u0010\u009b\u0001\u001a\u00030\u009c\u00012\u0007\u0010\u009d\u0001\u001a\u00020\u0003H\u0000¢\u0006\u0003\b\u009e\u0001J\u0012\u0010\u009f\u0001\u001a\u00020Y2\u0007\u0010 \u0001\u001a\u00020YH\u0016J\u001e\u0010¡\u0001\u001a\u00030\u0082\u00012\u0007\u0010 \u0001\u001a\u00020Y2\t\b\u0002\u0010¢\u0001\u001a\u00020\u0012H\u0002J\u001a\u0010£\u0001\u001a\u00030\u0082\u00012\u000e\u0010¤\u0001\u001a\t\u0012\u0004\u0012\u00020\n0¥\u0001H\u0002J\u0013\u0010¦\u0001\u001a\u00030\u0082\u00012\u0007\u0010¢\u0001\u001a\u00020 H\u0002J,\u0010§\u0001\u001a\u00030\u0082\u00012\u0007\u0010¨\u0001\u001a\u00020\u00122\u0006\u0010Z\u001a\u00020\u000e2\t\b\u0002\u0010©\u0001\u001a\u00020\u000eH\u0000¢\u0006\u0003\bª\u0001J\u001a\u0010°\u0001\u001a\u00020\u00032\u0007\u0010±\u0001\u001a\u00020\n2\u0006\u0010d\u001a\u00020\nH\u0002R\u001e\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\r\u001a\u00020\u000e@BX\u0080\u000e¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\"\u0010\u0013\u001a\u0004\u0018\u00010\u00122\b\u0010\r\u001a\u0004\u0018\u00010\u0012@BX\u0080\u000e¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015R\u0011\u0010\u0016\u001a\u00020\n8F¢\u0006\u0006\u001a\u0004\b\u0017\u0010\u0018R\u0011\u0010\u0019\u001a\u00020\n8F¢\u0006\u0006\u001a\u0004\b\u001a\u0010\u0018R\u0014\u0010\u001b\u001a\u00020\u001cX\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u001eR\u0011\u0010\u001f\u001a\u00020 8F¢\u0006\u0006\u001a\u0004\b!\u0010\"R\u0014\u0010#\u001a\b\u0012\u0004\u0012\u00020\u00120$X\u0082\u0004¢\u0006\u0002\n\u0000R\u0010\u0010%\u001a\u00020&X\u0082\u0004¢\u0006\u0004\n\u0002\u0010'R\u0014\u0010)\u001a\u00020*X\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b+\u0010,R+\u0010.\u001a\u00020\u000e2\u0006\u0010-\u001a\u00020\u000e8V@RX\u0096\u008e\u0002¢\u0006\u0012\n\u0004\b2\u00103\u001a\u0004\b/\u0010\u0011\"\u0004\b0\u00101R+\u00104\u001a\u00020\u000e2\u0006\u0010-\u001a\u00020\u000e8V@RX\u0096\u008e\u0002¢\u0006\u0012\n\u0004\b7\u00103\u001a\u0004\b5\u0010\u0011\"\u0004\b6\u00101R\u0014\u00108\u001a\u00020\u000e8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b9\u0010\u0011R\u0014\u0010:\u001a\u00020\u000e8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b;\u0010\u0011R\u0016\u0010<\u001a\u0004\u0018\u00010=8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b>\u0010?R\"\u0010A\u001a\u0004\u0018\u00010@2\b\u0010\r\u001a\u0004\u0018\u00010@@BX\u0080\u000e¢\u0006\b\n\u0000\u001a\u0004\bB\u0010CR\u0014\u0010D\u001a\u00020EX\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\bF\u0010GR\u0014\u0010H\u001a\u00020IX\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\bJ\u0010KR\u0014\u0010L\u001a\u00020MX\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\bN\u0010OR\u001a\u0010P\u001a\u00020\u000eX\u0080\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bQ\u0010\u0011\"\u0004\bR\u00101R\u0014\u0010S\u001a\u00020TX\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\bU\u0010VR\u000e\u0010W\u001a\u00020\u0001X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010X\u001a\u00020YX\u0082\u000e¢\u0006\u0002\n\u0000R\u001a\u0010\\\u001a\u00020\nX\u0080\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b]\u0010\u0018\"\u0004\b^\u0010_R\u000e\u0010`\u001a\u00020\nX\u0082\u000e¢\u0006\u0002\n\u0000R\u001a\u0010a\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020c0bX\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010d\u001a\u00020\n8@X\u0080\u0004¢\u0006\u0006\u001a\u0004\be\u0010\u0018R\u0011\u0010f\u001a\u00020g8F¢\u0006\u0006\u001a\u0004\bh\u0010iR\u0014\u0010j\u001a\u00020kX\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\bl\u0010mR\u0014\u0010n\u001a\u00020oX\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\bp\u0010qR\u001a\u0010r\u001a\b\u0012\u0004\u0012\u00020t0sX\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\bu\u0010vR\u001b\u0010w\u001a\u00020x8@X\u0080\u0084\u0002¢\u0006\f\u001a\u0004\b{\u0010|*\u0004\by\u0010zR\u0017\u0010}\u001a\u00020~X\u0080\u0004¢\u0006\u000b\n\u0002\u00103\u001a\u0005\b\u007f\u0010\u0080\u0001R\u0016\u0010\u008c\u0001\u001a\u00020\u000e8VX\u0096\u0004¢\u0006\u0007\u001a\u0005\b\u008c\u0001\u0010\u0011R\u0019\u0010\u0094\u0001\u001a\u00020~X\u0080\u0004¢\u0006\f\n\u0002\u00103\u001a\u0006\b\u0095\u0001\u0010\u0080\u0001R\u0017\u0010«\u0001\u001a\u00020Y8@X\u0080\u0004¢\u0006\b\u001a\u0006\b¬\u0001\u0010\u00ad\u0001R\u0010\u0010®\u0001\u001a\u00030¯\u0001X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006³\u0001"}, d2 = {"Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridState;", "Landroidx/compose/foundation/gestures/ScrollableState;", "initialFirstVisibleItems", "", "initialFirstVisibleOffsets", "prefetchScheduler", "Landroidx/compose/foundation/lazy/layout/PrefetchScheduler;", "<init>", "([I[ILandroidx/compose/foundation/lazy/layout/PrefetchScheduler;)V", "initialFirstVisibleItemIndex", "", "initialFirstVisibleItemOffset", "(II)V", com.datadog.android.rum.internal.metric.ViewEndedMetricDispatcher.KEY_VALUE, "", "hasLookaheadOccurred", "getHasLookaheadOccurred$foundation", "()Z", "Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridMeasureResult;", "approachLayoutInfo", "getApproachLayoutInfo$foundation", "()Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridMeasureResult;", "firstVisibleItemIndex", "getFirstVisibleItemIndex", "()I", "firstVisibleItemScrollOffset", "getFirstVisibleItemScrollOffset", "scrollPosition", "Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridScrollPosition;", "getScrollPosition$foundation", "()Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridScrollPosition;", "layoutInfo", "Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridLayoutInfo;", "getLayoutInfo", "()Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridLayoutInfo;", "layoutInfoState", "Landroidx/compose/runtime/MutableState;", "_scrollIndicatorState", "androidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridState$_scrollIndicatorState$1", "Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridState$_scrollIndicatorState$1;", "calculateScrollOffset", "laneInfo", "Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridLaneInfo;", "getLaneInfo$foundation", "()Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridLaneInfo;", "<set-?>", "canScrollForward", "getCanScrollForward", "setCanScrollForward", "(Z)V", "canScrollForward$delegate", "Landroidx/compose/runtime/MutableState;", "canScrollBackward", "getCanScrollBackward", "setCanScrollBackward", "canScrollBackward$delegate", "lastScrolledForward", "getLastScrolledForward", "lastScrolledBackward", "getLastScrolledBackward", "scrollIndicatorState", "Landroidx/compose/foundation/ScrollIndicatorState;", "getScrollIndicatorState", "()Landroidx/compose/foundation/ScrollIndicatorState;", "Landroidx/compose/ui/layout/Remeasurement;", "remeasurement", "getRemeasurement$foundation", "()Landroidx/compose/ui/layout/Remeasurement;", "remeasurementModifier", "Landroidx/compose/ui/layout/RemeasurementModifier;", "getRemeasurementModifier$foundation", "()Landroidx/compose/ui/layout/RemeasurementModifier;", "awaitLayoutModifier", "Landroidx/compose/foundation/lazy/layout/AwaitFirstLayoutModifier;", "getAwaitLayoutModifier$foundation", "()Landroidx/compose/foundation/lazy/layout/AwaitFirstLayoutModifier;", "beyondBoundsInfo", "Landroidx/compose/foundation/lazy/layout/LazyLayoutBeyondBoundsInfo;", "getBeyondBoundsInfo$foundation", "()Landroidx/compose/foundation/lazy/layout/LazyLayoutBeyondBoundsInfo;", "prefetchingEnabled", "getPrefetchingEnabled$foundation", "setPrefetchingEnabled$foundation", "prefetchState", "Landroidx/compose/foundation/lazy/layout/LazyLayoutPrefetchState;", "getPrefetchState$foundation", "()Landroidx/compose/foundation/lazy/layout/LazyLayoutPrefetchState;", "scrollableState", "scrollToBeConsumed", "", "isLookingAhead", "scrollToBeConsumed$foundation", "measurePassCount", "getMeasurePassCount$foundation", "setMeasurePassCount$foundation", "(I)V", "prefetchBaseIndex", "currentItemPrefetchHandles", "", "Landroidx/compose/foundation/lazy/layout/LazyLayoutPrefetchState$PrefetchHandle;", "laneCount", "getLaneCount$foundation", "interactionSource", "Landroidx/compose/foundation/interaction/InteractionSource;", "getInteractionSource", "()Landroidx/compose/foundation/interaction/InteractionSource;", "mutableInteractionSource", "Landroidx/compose/foundation/interaction/MutableInteractionSource;", "getMutableInteractionSource$foundation", "()Landroidx/compose/foundation/interaction/MutableInteractionSource;", "pinnedItems", "Landroidx/compose/foundation/lazy/layout/LazyLayoutPinnedItemList;", "getPinnedItems$foundation", "()Landroidx/compose/foundation/lazy/layout/LazyLayoutPinnedItemList;", "itemAnimator", "Landroidx/compose/foundation/lazy/layout/LazyLayoutItemAnimator;", "Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridMeasuredItem;", "getItemAnimator$foundation", "()Landroidx/compose/foundation/lazy/layout/LazyLayoutItemAnimator;", "nearestRange", "Lkotlin/ranges/IntRange;", "getNearestRange$foundation$delegate", "(Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridState;)Ljava/lang/Object;", "getNearestRange$foundation", "()Lkotlin/ranges/IntRange;", "placementScopeInvalidator", "Landroidx/compose/foundation/lazy/layout/ObservableScopeInvalidator;", "getPlacementScopeInvalidator-zYiylxw$foundation", "()Landroidx/compose/runtime/MutableState;", "scroll", "", "scrollPriority", "Landroidx/compose/foundation/MutatePriority;", "block", "Lkotlin/Function2;", "Landroidx/compose/foundation/gestures/ScrollScope;", "Lkotlin/coroutines/Continuation;", "", "Lkotlin/ExtensionFunctionType;", "(Landroidx/compose/foundation/MutatePriority;Lkotlin/jvm/functions/Function2;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "isScrollInProgress", "onScroll", "distance", "scrollToItem", "index", "scrollOffset", "(IILkotlin/coroutines/Continuation;)Ljava/lang/Object;", "animateScrollToItem", "measurementScopeInvalidator", "getMeasurementScopeInvalidator-zYiylxw$foundation", "requestScrollToItem", "snapToItemInternal", "forceRemeasure", "snapToItemInternal$foundation", "updateScrollPositionIfTheFirstItemWasMoved", "itemProvider", "Landroidx/compose/foundation/lazy/layout/LazyLayoutItemProvider;", "firstItemIndex", "updateScrollPositionIfTheFirstItemWasMoved$foundation", "dispatchRawDelta", "delta", "notifyPrefetch", "info", "clearLeftoverPrefetchHandles", "prefetchHandlesUsed", "", "cancelPrefetchIfVisibleItemsChanged", "applyMeasureResult", "result", "visibleItemsStayedTheSame", "applyMeasureResult$foundation", "scrollDeltaBetweenPasses", "getScrollDeltaBetweenPasses$foundation", "()F", "_lazyLayoutScrollDeltaBetweenPasses", "Landroidx/compose/foundation/lazy/layout/LazyLayoutScrollDeltaBetweenPasses;", "fillNearestIndices", "itemIndex", "Companion", "foundation"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes.dex */
public final class LazyStaggeredGridState implements androidx.compose.foundation.gestures.ScrollableState {
    public static final int $stable = 0;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridState.Companion INSTANCE = new androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridState.Companion(null);
    private static final androidx.compose.runtime.saveable.Saver<androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridState, java.lang.Object> Saver = androidx.compose.runtime.saveable.ListSaverKt.listSaver(new kotlin.jvm.functions.Function2() { // from class: androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridState$$ExternalSyntheticLambda0
        @Override // kotlin.jvm.functions.Function2
        public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
            java.util.List highSpeedVideoFpsRangesFor;
            highSpeedVideoFpsRangesFor = androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridState.getHighSpeedVideoFpsRangesFor((androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridState) obj2);
            return highSpeedVideoFpsRangesFor;
        }
    }, new kotlin.jvm.functions.Function1() { // from class: androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridState$$ExternalSyntheticLambda1
        @Override // kotlin.jvm.functions.Function1
        public final java.lang.Object invoke(java.lang.Object obj) {
            androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridState highSpeedVideoFpsRangesFor;
            highSpeedVideoFpsRangesFor = androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridState.getHighSpeedVideoFpsRangesFor((java.util.List) obj);
            return highSpeedVideoFpsRangesFor;
        }
    });
    private final androidx.compose.foundation.lazy.layout.LazyLayoutScrollDeltaBetweenPasses Camera2StreamConfigurationMap;
    private androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridMeasureResult approachLayoutInfo;
    private final androidx.compose.foundation.lazy.layout.AwaitFirstLayoutModifier awaitLayoutModifier;
    private final androidx.compose.foundation.lazy.layout.LazyLayoutBeyondBoundsInfo beyondBoundsInfo;

    /* renamed from: canScrollBackward$delegate, reason: from kotlin metadata */
    private final androidx.compose.runtime.MutableState canScrollBackward;

    /* renamed from: canScrollForward$delegate, reason: from kotlin metadata */
    private final androidx.compose.runtime.MutableState canScrollForward;
    private int getHighResolutionOutputSizeshNQ4ISI;
    private final androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridState$_scrollIndicatorState$1 getHighSpeedVideoFpsRanges;
    private final androidx.compose.runtime.MutableState<androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridMeasureResult> getHighSpeedVideoFpsRangesFor;
    private final java.util.Map<java.lang.Integer, androidx.compose.foundation.lazy.layout.LazyLayoutPrefetchState.PrefetchHandle> getHighSpeedVideoSizes;
    private float getInputSizeshNQ4ISI;
    private final androidx.compose.foundation.gestures.ScrollableState getOutputMinFrameDuration;
    private boolean hasLookaheadOccurred;
    private final androidx.compose.foundation.lazy.layout.LazyLayoutItemAnimator<androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridMeasuredItem> itemAnimator;
    private final androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridLaneInfo laneInfo;
    private int measurePassCount;
    private final androidx.compose.runtime.MutableState<kotlin.Unit> measurementScopeInvalidator;
    private final androidx.compose.foundation.interaction.MutableInteractionSource mutableInteractionSource;
    private final androidx.compose.foundation.lazy.layout.LazyLayoutPinnedItemList pinnedItems;
    private final androidx.compose.runtime.MutableState<kotlin.Unit> placementScopeInvalidator;
    private final androidx.compose.foundation.lazy.layout.LazyLayoutPrefetchState prefetchState;
    private boolean prefetchingEnabled;
    private androidx.compose.ui.layout.Remeasurement remeasurement;
    private final androidx.compose.ui.layout.RemeasurementModifier remeasurementModifier;
    private final androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridScrollPosition scrollPosition;

    /* JADX WARN: Type inference failed for: r4v3, types: [androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridState$_scrollIndicatorState$1] */
    public LazyStaggeredGridState(int[] iArr, int[] iArr2, androidx.compose.foundation.lazy.layout.PrefetchScheduler prefetchScheduler) {
        androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridScrollPosition lazyStaggeredGridScrollPosition = new androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridScrollPosition(iArr, iArr2, new androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridState$scrollPosition$1(this));
        this.scrollPosition = lazyStaggeredGridScrollPosition;
        this.getHighSpeedVideoFpsRangesFor = androidx.compose.runtime.SnapshotStateKt.mutableStateOf(androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridMeasureResultKt.getEmptyLazyStaggeredGridLayoutInfo(), androidx.compose.runtime.SnapshotStateKt.neverEqualPolicy());
        this.getHighSpeedVideoFpsRanges = new androidx.compose.foundation.ScrollIndicatorState() { // from class: androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridState$_scrollIndicatorState$1
            @Override // androidx.compose.foundation.ScrollIndicatorState
            public final int getScrollOffset() {
                int highSpeedVideoSizes;
                highSpeedVideoSizes = androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridState.this.getHighSpeedVideoSizes();
                return highSpeedVideoSizes;
            }

            @Override // androidx.compose.foundation.ScrollIndicatorState
            public final int getContentSize() {
                return androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridMeasureResultKt.calculateContentSize(androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridState.this.getLayoutInfo(), androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridState.this.getLaneCount$foundation());
            }

            @Override // androidx.compose.foundation.ScrollIndicatorState
            public final int getViewportSize() {
                return androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridMeasureResultKt.getSingleAxisViewportSize(androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridState.this.getLayoutInfo());
            }
        };
        this.laneInfo = new androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridLaneInfo();
        java.lang.Boolean bool = java.lang.Boolean.FALSE;
        this.canScrollForward = androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(bool, null, 2, null);
        this.canScrollBackward = androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(bool, null, 2, null);
        this.remeasurementModifier = new androidx.compose.ui.layout.RemeasurementModifier() { // from class: androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridState$remeasurementModifier$1
            @Override // androidx.compose.ui.layout.RemeasurementModifier
            public final void onRemeasurementAvailable(androidx.compose.ui.layout.Remeasurement remeasurement) {
                androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridState.this.remeasurement = remeasurement;
            }
        };
        this.awaitLayoutModifier = new androidx.compose.foundation.lazy.layout.AwaitFirstLayoutModifier();
        this.beyondBoundsInfo = new androidx.compose.foundation.lazy.layout.LazyLayoutBeyondBoundsInfo();
        this.prefetchingEnabled = true;
        this.prefetchState = new androidx.compose.foundation.lazy.layout.LazyLayoutPrefetchState(prefetchScheduler, null, 2, null);
        this.getOutputMinFrameDuration = androidx.compose.foundation.gestures.ScrollableStateKt.ScrollableState(new kotlin.jvm.functions.Function1() { // from class: androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridState$$ExternalSyntheticLambda2
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                float Camera2StreamConfigurationMap;
                Camera2StreamConfigurationMap = androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridState.Camera2StreamConfigurationMap(androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridState.this, ((java.lang.Float) obj).floatValue());
                return java.lang.Float.valueOf(Camera2StreamConfigurationMap);
            }
        });
        this.getHighResolutionOutputSizeshNQ4ISI = -1;
        this.getHighSpeedVideoSizes = new java.util.LinkedHashMap();
        this.mutableInteractionSource = androidx.compose.foundation.interaction.InteractionSourceKt.MutableInteractionSource();
        this.pinnedItems = new androidx.compose.foundation.lazy.layout.LazyLayoutPinnedItemList();
        this.itemAnimator = new androidx.compose.foundation.lazy.layout.LazyLayoutItemAnimator<>();
        lazyStaggeredGridScrollPosition.getNearestRangeState();
        this.placementScopeInvalidator = androidx.compose.foundation.lazy.layout.ObservableScopeInvalidator.m1872constructorimpl$default(null, 1, null);
        this.measurementScopeInvalidator = androidx.compose.foundation.lazy.layout.ObservableScopeInvalidator.m1872constructorimpl$default(null, 1, null);
        this.Camera2StreamConfigurationMap = new androidx.compose.foundation.lazy.layout.LazyLayoutScrollDeltaBetweenPasses();
    }

    public /* synthetic */ LazyStaggeredGridState(int i, int i2, int i3, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this((i3 & 1) != 0 ? 0 : i, (i3 & 2) != 0 ? 0 : i2);
    }

    public LazyStaggeredGridState(int i, int i2) {
        this(new int[]{i}, new int[]{i2}, null);
    }

    /* renamed from: getHasLookaheadOccurred$foundation, reason: from getter */
    public final boolean getHasLookaheadOccurred() {
        return this.hasLookaheadOccurred;
    }

    /* renamed from: getApproachLayoutInfo$foundation, reason: from getter */
    public final androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridMeasureResult getApproachLayoutInfo() {
        return this.approachLayoutInfo;
    }

    public final int getFirstVisibleItemIndex() {
        return this.scrollPosition.getIndex();
    }

    public final int getFirstVisibleItemScrollOffset() {
        return this.scrollPosition.getScrollOffset();
    }

    /* renamed from: getScrollPosition$foundation, reason: from getter */
    public final androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridScrollPosition getScrollPosition() {
        return this.scrollPosition;
    }

    public final androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridLayoutInfo getLayoutInfo() {
        return this.getHighSpeedVideoFpsRangesFor.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final int getHighSpeedVideoSizes() {
        androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridLayoutInfo layoutInfo = getLayoutInfo();
        if (layoutInfo.getTotalItemsCount() == 0) {
            return 0;
        }
        return ((androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridMeasureResultKt.visibleItemsAverageSize(layoutInfo) * getFirstVisibleItemIndex()) / getLaneCount$foundation()) + getFirstVisibleItemScrollOffset();
    }

    /* renamed from: getLaneInfo$foundation, reason: from getter */
    public final androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridLaneInfo getLaneInfo() {
        return this.laneInfo;
    }

    private void setCanScrollForward(boolean z) {
        this.canScrollForward.setValue(java.lang.Boolean.valueOf(z));
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // androidx.compose.foundation.gestures.ScrollableState
    public final boolean getCanScrollForward() {
        return ((java.lang.Boolean) this.canScrollForward.getValue()).booleanValue();
    }

    private void setCanScrollBackward(boolean z) {
        this.canScrollBackward.setValue(java.lang.Boolean.valueOf(z));
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // androidx.compose.foundation.gestures.ScrollableState
    public final boolean getCanScrollBackward() {
        return ((java.lang.Boolean) this.canScrollBackward.getValue()).booleanValue();
    }

    @Override // androidx.compose.foundation.gestures.ScrollableState
    public final boolean getLastScrolledForward() {
        return this.getOutputMinFrameDuration.getLastScrolledForward();
    }

    @Override // androidx.compose.foundation.gestures.ScrollableState
    public final boolean getLastScrolledBackward() {
        return this.getOutputMinFrameDuration.getLastScrolledBackward();
    }

    @Override // androidx.compose.foundation.gestures.ScrollableState
    public final androidx.compose.foundation.ScrollIndicatorState getScrollIndicatorState() {
        return this.getHighSpeedVideoFpsRanges;
    }

    /* renamed from: getRemeasurement$foundation, reason: from getter */
    public final androidx.compose.ui.layout.Remeasurement getRemeasurement() {
        return this.remeasurement;
    }

    /* renamed from: getRemeasurementModifier$foundation, reason: from getter */
    public final androidx.compose.ui.layout.RemeasurementModifier getRemeasurementModifier() {
        return this.remeasurementModifier;
    }

    /* renamed from: getAwaitLayoutModifier$foundation, reason: from getter */
    public final androidx.compose.foundation.lazy.layout.AwaitFirstLayoutModifier getAwaitLayoutModifier() {
        return this.awaitLayoutModifier;
    }

    /* renamed from: getBeyondBoundsInfo$foundation, reason: from getter */
    public final androidx.compose.foundation.lazy.layout.LazyLayoutBeyondBoundsInfo getBeyondBoundsInfo() {
        return this.beyondBoundsInfo;
    }

    /* renamed from: getPrefetchingEnabled$foundation, reason: from getter */
    public final boolean getPrefetchingEnabled() {
        return this.prefetchingEnabled;
    }

    public final void setPrefetchingEnabled$foundation(boolean z) {
        this.prefetchingEnabled = z;
    }

    /* renamed from: getPrefetchState$foundation, reason: from getter */
    public final androidx.compose.foundation.lazy.layout.LazyLayoutPrefetchState getPrefetchState() {
        return this.prefetchState;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final float Camera2StreamConfigurationMap(androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridState lazyStaggeredGridState, float f) {
        return -lazyStaggeredGridState.getHighSpeedVideoFpsRangesFor(-f);
    }

    public final float scrollToBeConsumed$foundation(boolean isLookingAhead) {
        if (isLookingAhead || !this.hasLookaheadOccurred) {
            return this.getInputSizeshNQ4ISI;
        }
        return getScrollDeltaBetweenPasses$foundation();
    }

    /* renamed from: getMeasurePassCount$foundation, reason: from getter */
    public final int getMeasurePassCount() {
        return this.measurePassCount;
    }

    public final void setMeasurePassCount$foundation(int i) {
        this.measurePassCount = i;
    }

    public final int getLaneCount$foundation() {
        return this.getHighSpeedVideoFpsRangesFor.getValue().getSlots().getSizes().length;
    }

    public final androidx.compose.foundation.interaction.InteractionSource getInteractionSource() {
        return this.mutableInteractionSource;
    }

    /* renamed from: getMutableInteractionSource$foundation, reason: from getter */
    public final androidx.compose.foundation.interaction.MutableInteractionSource getMutableInteractionSource() {
        return this.mutableInteractionSource;
    }

    /* renamed from: getPinnedItems$foundation, reason: from getter */
    public final androidx.compose.foundation.lazy.layout.LazyLayoutPinnedItemList getPinnedItems() {
        return this.pinnedItems;
    }

    public final androidx.compose.foundation.lazy.layout.LazyLayoutItemAnimator<androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridMeasuredItem> getItemAnimator$foundation() {
        return this.itemAnimator;
    }

    public final kotlin.ranges.IntRange getNearestRange$foundation() {
        return this.scrollPosition.getNearestRangeState().getValue();
    }

    /* renamed from: getPlacementScopeInvalidator-zYiylxw$foundation, reason: not valid java name */
    public final androidx.compose.runtime.MutableState<kotlin.Unit> m1905getPlacementScopeInvalidatorzYiylxw$foundation() {
        return this.placementScopeInvalidator;
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x006c, code lost:
    
        if (r8.scroll(r6, r7, r0) != r1) goto L23;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x006e, code lost:
    
        return r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x005d, code lost:
    
        if (r8.waitForFirstLayout(r0) != r1) goto L20;
     */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0042  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0025  */
    @Override // androidx.compose.foundation.gestures.ScrollableState
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object scroll(androidx.compose.foundation.MutatePriority mutatePriority, kotlin.jvm.functions.Function2<? super androidx.compose.foundation.gestures.ScrollScope, ? super kotlin.coroutines.Continuation<? super kotlin.Unit>, ? extends java.lang.Object> function2, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridState$scroll$1 lazyStaggeredGridState$scroll$1;
        int i;
        if (continuation instanceof androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridState$scroll$1) {
            lazyStaggeredGridState$scroll$1 = (androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridState$scroll$1) continuation;
            if ((lazyStaggeredGridState$scroll$1.getHighResolutionOutputSizeshNQ4ISI & Integer.MIN_VALUE) != 0) {
                lazyStaggeredGridState$scroll$1.getHighResolutionOutputSizeshNQ4ISI -= 2147483648;
                java.lang.Object obj = lazyStaggeredGridState$scroll$1.getHighSpeedVideoFpsRanges;
                java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = lazyStaggeredGridState$scroll$1.getHighResolutionOutputSizeshNQ4ISI;
                if (i != 0) {
                    kotlin.ResultKt.throwOnFailure(obj);
                    if (this.getHighSpeedVideoFpsRangesFor.getValue() == androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridMeasureResultKt.getEmptyLazyStaggeredGridLayoutInfo()) {
                        androidx.compose.foundation.lazy.layout.AwaitFirstLayoutModifier awaitFirstLayoutModifier = this.awaitLayoutModifier;
                        lazyStaggeredGridState$scroll$1.getHighSpeedVideoSizes = mutatePriority;
                        lazyStaggeredGridState$scroll$1.getHighSpeedVideoFpsRangesFor = function2;
                        lazyStaggeredGridState$scroll$1.getHighResolutionOutputSizeshNQ4ISI = 1;
                    }
                } else {
                    if (i != 1) {
                        if (i != 2) {
                            throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        kotlin.ResultKt.throwOnFailure(obj);
                        return kotlin.Unit.INSTANCE;
                    }
                    function2 = (kotlin.jvm.functions.Function2) lazyStaggeredGridState$scroll$1.getHighSpeedVideoFpsRangesFor;
                    mutatePriority = (androidx.compose.foundation.MutatePriority) lazyStaggeredGridState$scroll$1.getHighSpeedVideoSizes;
                    kotlin.ResultKt.throwOnFailure(obj);
                }
                androidx.compose.foundation.gestures.ScrollableState scrollableState = this.getOutputMinFrameDuration;
                lazyStaggeredGridState$scroll$1.getHighSpeedVideoSizes = null;
                lazyStaggeredGridState$scroll$1.getHighSpeedVideoFpsRangesFor = null;
                lazyStaggeredGridState$scroll$1.getHighResolutionOutputSizeshNQ4ISI = 2;
            }
        }
        lazyStaggeredGridState$scroll$1 = new androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridState$scroll$1(this, continuation);
        java.lang.Object obj2 = lazyStaggeredGridState$scroll$1.getHighSpeedVideoFpsRanges;
        java.lang.Object coroutine_suspended2 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = lazyStaggeredGridState$scroll$1.getHighResolutionOutputSizeshNQ4ISI;
        if (i != 0) {
        }
        androidx.compose.foundation.gestures.ScrollableState scrollableState2 = this.getOutputMinFrameDuration;
        lazyStaggeredGridState$scroll$1.getHighSpeedVideoSizes = null;
        lazyStaggeredGridState$scroll$1.getHighSpeedVideoFpsRangesFor = null;
        lazyStaggeredGridState$scroll$1.getHighResolutionOutputSizeshNQ4ISI = 2;
    }

    @Override // androidx.compose.foundation.gestures.ScrollableState
    public final boolean isScrollInProgress() {
        return this.getOutputMinFrameDuration.isScrollInProgress();
    }

    private final float getHighSpeedVideoFpsRangesFor(float f) {
        androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridMeasureResult lazyStaggeredGridMeasureResult;
        if ((f < 0.0f && !getCanScrollForward()) || (f > 0.0f && !getCanScrollBackward())) {
            return 0.0f;
        }
        if (java.lang.Math.abs(this.getInputSizeshNQ4ISI) > 0.5f) {
            androidx.compose.foundation.internal.InlineClassHelperKt.throwIllegalStateException("entered drag with non-zero pending scroll");
        }
        float f2 = this.getInputSizeshNQ4ISI + f;
        this.getInputSizeshNQ4ISI = f2;
        if (java.lang.Math.abs(f2) > 0.5f) {
            float f3 = this.getInputSizeshNQ4ISI;
            int roundToInt = kotlin.math.MathKt.roundToInt(f3);
            androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridMeasureResult copyWithScrollDeltaWithoutRemeasure = this.getHighSpeedVideoFpsRangesFor.getValue().copyWithScrollDeltaWithoutRemeasure(roundToInt, !this.hasLookaheadOccurred);
            if (copyWithScrollDeltaWithoutRemeasure != null && (lazyStaggeredGridMeasureResult = this.approachLayoutInfo) != null) {
                androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridMeasureResult copyWithScrollDeltaWithoutRemeasure2 = lazyStaggeredGridMeasureResult != null ? lazyStaggeredGridMeasureResult.copyWithScrollDeltaWithoutRemeasure(roundToInt, true) : null;
                if (copyWithScrollDeltaWithoutRemeasure2 != null) {
                    this.approachLayoutInfo = copyWithScrollDeltaWithoutRemeasure2;
                } else {
                    copyWithScrollDeltaWithoutRemeasure = null;
                }
            }
            if (copyWithScrollDeltaWithoutRemeasure != null) {
                applyMeasureResult$foundation(copyWithScrollDeltaWithoutRemeasure, this.hasLookaheadOccurred, true);
                androidx.compose.foundation.lazy.layout.ObservableScopeInvalidator.m1876invalidateScopeimpl(this.placementScopeInvalidator);
                getHighSpeedVideoFpsRanges(f3 - this.getInputSizeshNQ4ISI, copyWithScrollDeltaWithoutRemeasure);
            } else {
                androidx.compose.ui.layout.Remeasurement remeasurement = this.remeasurement;
                if (remeasurement != null) {
                    remeasurement.forceRemeasure();
                }
                getHighResolutionOutputSizeshNQ4ISI(this, f3 - this.getInputSizeshNQ4ISI);
            }
        }
        if (java.lang.Math.abs(this.getInputSizeshNQ4ISI) <= 0.5f) {
            return f;
        }
        float f4 = this.getInputSizeshNQ4ISI;
        this.getInputSizeshNQ4ISI = 0.0f;
        return f - f4;
    }

    public static /* synthetic */ java.lang.Object scrollToItem$default(androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridState lazyStaggeredGridState, int i, int i2, kotlin.coroutines.Continuation continuation, int i3, java.lang.Object obj) {
        if ((i3 & 2) != 0) {
            i2 = 0;
        }
        return lazyStaggeredGridState.scrollToItem(i, i2, continuation);
    }

    public final java.lang.Object scrollToItem(int i, int i2, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        java.lang.Object scroll$default = androidx.compose.foundation.gestures.ScrollableState.scroll$default(this, null, new androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridState$scrollToItem$2(this, i, i2, null), continuation, 1, null);
        return scroll$default == kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED() ? scroll$default : kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ java.lang.Object animateScrollToItem$default(androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridState lazyStaggeredGridState, int i, int i2, kotlin.coroutines.Continuation continuation, int i3, java.lang.Object obj) {
        if ((i3 & 2) != 0) {
            i2 = 0;
        }
        return lazyStaggeredGridState.animateScrollToItem(i, i2, continuation);
    }

    public final java.lang.Object animateScrollToItem(int i, int i2, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridMeasureResult value = this.getHighSpeedVideoFpsRangesFor.getValue();
        java.lang.Object scroll$default = androidx.compose.foundation.gestures.ScrollableState.scroll$default(this, null, new androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridState$animateScrollToItem$2(this, i, i2, value.getSlots().getSizes().length * 100, value, null), continuation, 1, null);
        return scroll$default == kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED() ? scroll$default : kotlin.Unit.INSTANCE;
    }

    /* renamed from: getMeasurementScopeInvalidator-zYiylxw$foundation, reason: not valid java name */
    public final androidx.compose.runtime.MutableState<kotlin.Unit> m1904getMeasurementScopeInvalidatorzYiylxw$foundation() {
        return this.measurementScopeInvalidator;
    }

    public static /* synthetic */ void requestScrollToItem$default(androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridState lazyStaggeredGridState, int i, int i2, int i3, java.lang.Object obj) {
        if ((i3 & 2) != 0) {
            i2 = 0;
        }
        lazyStaggeredGridState.requestScrollToItem(i, i2);
    }

    public final void requestScrollToItem(int index, int scrollOffset) {
        if (isScrollInProgress()) {
            kotlinx.coroutines.BuildersKt__Builders_commonKt.launch$default(this.getHighSpeedVideoFpsRangesFor.getValue().getCoroutineScope(), null, null, new androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridState$requestScrollToItem$1(this, null), 3, null);
        }
        snapToItemInternal$foundation(index, scrollOffset, false);
    }

    public final void snapToItemInternal$foundation(int index, int scrollOffset, boolean forceRemeasure) {
        int m8729getXimpl;
        boolean z = (this.scrollPosition.getIndex() == index && this.scrollPosition.getScrollOffset() == scrollOffset) ? false : true;
        if (z) {
            this.itemAnimator.reset();
        }
        androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridMeasureResult value = this.getHighSpeedVideoFpsRangesFor.getValue();
        androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridItemInfo findVisibleItem = androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridMeasureResultKt.findVisibleItem(value, index);
        if (findVisibleItem != null && z) {
            if (value.getOrientation() == androidx.compose.foundation.gestures.Orientation.Vertical) {
                m8729getXimpl = androidx.compose.ui.unit.IntOffset.m8730getYimpl(findVisibleItem.getOffset());
            } else {
                m8729getXimpl = androidx.compose.ui.unit.IntOffset.m8729getXimpl(findVisibleItem.getOffset());
            }
            int length = value.getFirstVisibleItemScrollOffsets().length;
            int[] iArr = new int[length];
            for (int i = 0; i < length; i++) {
                iArr[i] = value.getFirstVisibleItemScrollOffsets()[i] + m8729getXimpl + scrollOffset;
            }
            this.scrollPosition.updateScrollOffset(iArr);
        } else {
            this.scrollPosition.requestPositionAndForgetLastKnownKey(index, scrollOffset);
        }
        if (forceRemeasure) {
            androidx.compose.ui.layout.Remeasurement remeasurement = this.remeasurement;
            if (remeasurement != null) {
                remeasurement.forceRemeasure();
                return;
            }
            return;
        }
        androidx.compose.foundation.lazy.layout.ObservableScopeInvalidator.m1876invalidateScopeimpl(this.measurementScopeInvalidator);
    }

    public final int[] updateScrollPositionIfTheFirstItemWasMoved$foundation(androidx.compose.foundation.lazy.layout.LazyLayoutItemProvider itemProvider, int[] firstItemIndex) {
        return this.scrollPosition.updateScrollPositionIfTheFirstItemWasMoved(itemProvider, firstItemIndex);
    }

    @Override // androidx.compose.foundation.gestures.ScrollableState
    public final float dispatchRawDelta(float delta) {
        return this.getOutputMinFrameDuration.dispatchRawDelta(delta);
    }

    private static /* synthetic */ void getHighResolutionOutputSizeshNQ4ISI(androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridState lazyStaggeredGridState, float f) {
        lazyStaggeredGridState.getHighSpeedVideoFpsRanges(f, lazyStaggeredGridState.getHighSpeedVideoFpsRangesFor.getValue());
    }

    private final void getHighSpeedVideoFpsRanges(float f, androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridMeasureResult lazyStaggeredGridMeasureResult) {
        int index;
        int i;
        long m8565fixedHeightOenEA2s;
        if (!this.prefetchingEnabled || lazyStaggeredGridMeasureResult.getVisibleItemsInfo().isEmpty()) {
            return;
        }
        int i2 = 1;
        boolean z = f < 0.0f;
        if (z) {
            index = ((androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridMeasuredItem) kotlin.collections.CollectionsKt.last((java.util.List) lazyStaggeredGridMeasureResult.getVisibleItemsInfo())).getIndex();
        } else {
            index = ((androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridMeasuredItem) kotlin.collections.CollectionsKt.first((java.util.List) lazyStaggeredGridMeasureResult.getVisibleItemsInfo())).getIndex();
        }
        if (index != this.getHighResolutionOutputSizeshNQ4ISI) {
            this.getHighResolutionOutputSizeshNQ4ISI = index;
            java.util.LinkedHashSet linkedHashSet = new java.util.LinkedHashSet();
            androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridSlots slots = lazyStaggeredGridMeasureResult.getSlots();
            int length = slots.getSizes().length;
            int i3 = 0;
            while (i3 < length) {
                if (z) {
                    index = this.laneInfo.findNextItemIndex(index, i3);
                } else {
                    index = this.laneInfo.findPreviousItemIndex(index, i3);
                }
                if (index < 0 || index >= lazyStaggeredGridMeasureResult.getTotalItemsCount() || linkedHashSet.contains(java.lang.Integer.valueOf(index))) {
                    break;
                }
                linkedHashSet.add(java.lang.Integer.valueOf(index));
                if (!this.getHighSpeedVideoSizes.containsKey(java.lang.Integer.valueOf(index))) {
                    boolean isFullSpan = lazyStaggeredGridMeasureResult.getSpanProvider().isFullSpan(index);
                    int i4 = isFullSpan ? 0 : i3;
                    int i5 = isFullSpan ? length : i2;
                    if (i5 == i2) {
                        i = slots.getSizes()[i4];
                    } else {
                        int i6 = slots.getPositions()[i4];
                        int i7 = (i4 + i5) - i2;
                        i = (slots.getPositions()[i7] + slots.getSizes()[i7]) - i6;
                    }
                    if (lazyStaggeredGridMeasureResult.getOrientation() == androidx.compose.foundation.gestures.Orientation.Vertical) {
                        m8565fixedHeightOenEA2s = androidx.compose.ui.unit.Constraints.INSTANCE.m8566fixedWidthOenEA2s(i);
                    } else {
                        m8565fixedHeightOenEA2s = androidx.compose.ui.unit.Constraints.INSTANCE.m8565fixedHeightOenEA2s(i);
                    }
                    this.getHighSpeedVideoSizes.put(java.lang.Integer.valueOf(index), androidx.compose.foundation.lazy.layout.LazyLayoutPrefetchState.m1861schedulePrecompositionAndPremeasureVKLhPVY$default(this.prefetchState, index, m8565fixedHeightOenEA2s, null, 4, null));
                }
                i3++;
                i2 = 1;
            }
            getHighSpeedVideoSizes(linkedHashSet);
        }
    }

    private final void getHighSpeedVideoSizes(java.util.Set<java.lang.Integer> set) {
        java.util.Iterator<java.util.Map.Entry<java.lang.Integer, androidx.compose.foundation.lazy.layout.LazyLayoutPrefetchState.PrefetchHandle>> it = this.getHighSpeedVideoSizes.entrySet().iterator();
        while (it.hasNext()) {
            java.util.Map.Entry<java.lang.Integer, androidx.compose.foundation.lazy.layout.LazyLayoutPrefetchState.PrefetchHandle> next = it.next();
            if (!set.contains(next.getKey())) {
                next.getValue().cancel();
                it.remove();
            }
        }
    }

    private final void getHighResolutionOutputSizeshNQ4ISI(androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridLayoutInfo lazyStaggeredGridLayoutInfo) {
        java.util.List<androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridItemInfo> visibleItemsInfo = lazyStaggeredGridLayoutInfo.getVisibleItemsInfo();
        if (this.getHighResolutionOutputSizeshNQ4ISI == -1 || visibleItemsInfo.isEmpty()) {
            return;
        }
        int index = ((androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridItemInfo) kotlin.collections.CollectionsKt.first((java.util.List) visibleItemsInfo)).getIndex();
        int index2 = ((androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridItemInfo) kotlin.collections.CollectionsKt.last((java.util.List) visibleItemsInfo)).getIndex();
        int i = this.getHighResolutionOutputSizeshNQ4ISI;
        if (index > i || i > index2) {
            this.getHighResolutionOutputSizeshNQ4ISI = -1;
            java.util.Iterator<T> it = this.getHighSpeedVideoSizes.values().iterator();
            while (it.hasNext()) {
                ((androidx.compose.foundation.lazy.layout.LazyLayoutPrefetchState.PrefetchHandle) it.next()).cancel();
            }
            this.getHighSpeedVideoSizes.clear();
        }
    }

    public static /* synthetic */ void applyMeasureResult$foundation$default(androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridState lazyStaggeredGridState, androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridMeasureResult lazyStaggeredGridMeasureResult, boolean z, boolean z2, int i, java.lang.Object obj) {
        if ((i & 4) != 0) {
            z2 = false;
        }
        lazyStaggeredGridState.applyMeasureResult$foundation(lazyStaggeredGridMeasureResult, z, z2);
    }

    public final void applyMeasureResult$foundation(androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridMeasureResult result, boolean isLookingAhead, boolean visibleItemsStayedTheSame) {
        if (!isLookingAhead && this.hasLookaheadOccurred) {
            this.approachLayoutInfo = result;
            return;
        }
        if (isLookingAhead) {
            this.hasLookaheadOccurred = true;
        }
        this.getInputSizeshNQ4ISI -= result.getConsumedScroll();
        this.getHighSpeedVideoFpsRangesFor.setValue(result);
        if (visibleItemsStayedTheSame) {
            this.scrollPosition.updateScrollOffset(result.getFirstVisibleItemScrollOffsets());
        } else {
            this.scrollPosition.updateFromMeasureResult(result);
            getHighResolutionOutputSizeshNQ4ISI(result);
        }
        setCanScrollBackward(result.getCanScrollBackward());
        setCanScrollForward(result.getCanScrollForward());
        if (isLookingAhead) {
            this.Camera2StreamConfigurationMap.updateScrollDeltaForApproach$foundation(result.getScrollBackAmount(), result.getDensity(), result.getCoroutineScope());
        }
        this.measurePassCount++;
    }

    public final float getScrollDeltaBetweenPasses$foundation() {
        return this.Camera2StreamConfigurationMap.getScrollDeltaBetweenPasses$foundation();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final int[] getHighSpeedVideoSizes(int i, int i2) {
        int[] iArr = new int[i2];
        if (this.getHighSpeedVideoFpsRangesFor.getValue().getSpanProvider().isFullSpan(i)) {
            kotlin.collections.ArraysKt.fill$default(iArr, i, 0, 0, 6, (java.lang.Object) null);
            return iArr;
        }
        this.laneInfo.ensureValidIndex(i + i2);
        int lane = this.laneInfo.getLane(i);
        int i3 = 0;
        if (lane != -2 && lane != -1) {
            if (lane < 0) {
                java.lang.StringBuilder sb = new java.lang.StringBuilder("Expected positive lane number, got ");
                sb.append(lane);
                sb.append(" instead.");
                androidx.compose.foundation.internal.InlineClassHelperKt.throwIllegalArgumentException(sb.toString());
            }
            i3 = java.lang.Math.min(lane, i2);
        }
        int i4 = i3;
        int i5 = i4 - 1;
        int i6 = i;
        while (true) {
            if (i5 < 0) {
                break;
            }
            i6 = this.laneInfo.findPreviousItemIndex(i6, i5);
            iArr[i5] = i6;
            if (i6 == -1) {
                kotlin.collections.ArraysKt.fill$default(iArr, -1, 0, i5, 2, (java.lang.Object) null);
                break;
            }
            i5--;
        }
        iArr[i4] = i;
        while (true) {
            i4++;
            if (i4 >= i2) {
                return iArr;
            }
            i = this.laneInfo.findNextItemIndex(i, i4);
            iArr[i4] = i;
        }
    }

    @kotlin.Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R#\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00010\u00048\u0007¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\t"}, d2 = {"Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridState$Companion;", "", "<init>", "()V", "Landroidx/compose/runtime/saveable/Saver;", "Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridState;", "Saver", "Landroidx/compose/runtime/saveable/Saver;", "getSaver", "()Landroidx/compose/runtime/saveable/Saver;"}, k = 1, mv = {2, 0, 0}, xi = 48)
    /* loaded from: classes6.dex */
    public static final class Companion {
        private Companion() {
        }

        public final androidx.compose.runtime.saveable.Saver<androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridState, java.lang.Object> getSaver() {
            return androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridState.Saver;
        }

        public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final java.util.List getHighSpeedVideoFpsRangesFor(androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridState lazyStaggeredGridState) {
        return kotlin.collections.CollectionsKt.listOf((java.lang.Object[]) new int[][]{lazyStaggeredGridState.scrollPosition.getIndices(), lazyStaggeredGridState.scrollPosition.getScrollOffsets()});
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridState getHighSpeedVideoFpsRangesFor(java.util.List list) {
        return new androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridState((int[]) list.get(0), (int[]) list.get(1), null);
    }
}
