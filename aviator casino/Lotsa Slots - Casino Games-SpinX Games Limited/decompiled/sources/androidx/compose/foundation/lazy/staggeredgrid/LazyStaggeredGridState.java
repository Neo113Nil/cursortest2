package androidx.compose.foundation.lazy.staggeredgrid;

/* compiled from: LazyStaggeredGridState.kt */
@kotlin.Metadata(d1 = {"\u0000\u0084\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u0015\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\f\n\u0002\u0010%\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u000b\n\u0002\u0010\"\n\u0002\b\t\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u0000 ¬\u00012\u00020\u0001:\u0002¬\u0001B\u001b\b\u0016\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003¢\u0006\u0002\u0010\u0005B\u0017\b\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0002\u0010\tJ%\u0010\u0085\u0001\u001a\u00030\u0086\u00012\u0007\u0010\u0087\u0001\u001a\u00020\u00032\t\b\u0002\u0010\u0088\u0001\u001a\u00020\u0003H\u0086@¢\u0006\u0003\u0010\u0089\u0001J$\u0010\u008a\u0001\u001a\u00030\u0086\u00012\u0007\u0010\u008b\u0001\u001a\u00020C2\t\b\u0002\u0010\u008c\u0001\u001a\u00020\u0015H\u0000¢\u0006\u0003\b\u008d\u0001J\u0013\u0010\u008e\u0001\u001a\u00030\u0086\u00012\u0007\u0010\u008f\u0001\u001a\u00020>H\u0002J\u001a\u0010\u0090\u0001\u001a\u00030\u0086\u00012\u000e\u0010\u0091\u0001\u001a\t\u0012\u0004\u0012\u00020\u00030\u0092\u0001H\u0002J\u0012\u0010\u0093\u0001\u001a\u00020t2\u0007\u0010\u0094\u0001\u001a\u00020tH\u0016J\u001a\u0010\u0095\u0001\u001a\u00020\u00072\u0007\u0010\u0096\u0001\u001a\u00020\u00032\u0006\u00107\u001a\u00020\u0003H\u0002J\u001e\u0010\u0097\u0001\u001a\u00030\u0086\u00012\u0007\u0010\u0094\u0001\u001a\u00020t2\t\b\u0002\u0010\u008f\u0001\u001a\u00020>H\u0002J\u0012\u0010\u0098\u0001\u001a\u00020t2\u0007\u0010\u0099\u0001\u001a\u00020tH\u0002JK\u0010\u009a\u0001\u001a\u00030\u0086\u00012\b\u0010\u009b\u0001\u001a\u00030\u009c\u00012.\u0010\u009d\u0001\u001a)\b\u0001\u0012\u0005\u0012\u00030\u009f\u0001\u0012\f\u0012\n\u0012\u0005\u0012\u00030\u0086\u00010 \u0001\u0012\u0007\u0012\u0005\u0018\u00010¡\u00010\u009e\u0001¢\u0006\u0003\b¢\u0001H\u0096@¢\u0006\u0003\u0010£\u0001J%\u0010¤\u0001\u001a\u00030\u0086\u00012\u0007\u0010\u0087\u0001\u001a\u00020\u00032\t\b\u0002\u0010\u0088\u0001\u001a\u00020\u0003H\u0086@¢\u0006\u0003\u0010\u0089\u0001J\"\u0010¥\u0001\u001a\u00020\u00072\b\u0010¦\u0001\u001a\u00030§\u00012\u0007\u0010¨\u0001\u001a\u00020\u0007H\u0000¢\u0006\u0003\b©\u0001J'\u0010ª\u0001\u001a\u00030\u0086\u0001*\u00030\u009f\u00012\u0007\u0010\u0087\u0001\u001a\u00020\u00032\u0007\u0010\u0088\u0001\u001a\u00020\u0003H\u0000¢\u0006\u0003\b«\u0001R\u000e\u0010\n\u001a\u00020\u000bX\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\f\u001a\u00020\rX\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0014\u0010\u0010\u001a\u00020\u0011X\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R+\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0014\u001a\u00020\u00158V@RX\u0096\u008e\u0002¢\u0006\u0012\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u0017\u0010\u0018\"\u0004\b\u0019\u0010\u001aR+\u0010\u001d\u001a\u00020\u00152\u0006\u0010\u0014\u001a\u00020\u00158V@RX\u0096\u008e\u0002¢\u0006\u0012\n\u0004\b \u0010\u001c\u001a\u0004\b\u001e\u0010\u0018\"\u0004\b\u001f\u0010\u001aR\u001a\u0010!\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020#0\"X\u0082\u0004¢\u0006\u0002\n\u0000R\u001a\u0010$\u001a\u00020%X\u0080\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b&\u0010'\"\u0004\b(\u0010)R\u0011\u0010*\u001a\u00020\u00038F¢\u0006\u0006\u001a\u0004\b+\u0010,R\u0011\u0010-\u001a\u00020\u00038F¢\u0006\u0006\u001a\u0004\b.\u0010,R\u0011\u0010/\u001a\u0002008F¢\u0006\u0006\u001a\u0004\b1\u00102R\u0014\u00103\u001a\u00020\u00158VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b3\u0010\u0018R\u001a\u00104\u001a\u00020\u0015X\u0080\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b5\u0010\u0018\"\u0004\b6\u0010\u001aR\u0014\u00107\u001a\u00020\u00038@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b8\u0010,R\u0014\u00109\u001a\u00020:X\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b;\u0010<R\u0011\u0010=\u001a\u00020>8F¢\u0006\u0006\u001a\u0004\b?\u0010@R\u0014\u0010A\u001a\b\u0012\u0004\u0012\u00020C0BX\u0082\u0004¢\u0006\u0002\n\u0000R\u001a\u0010D\u001a\u00020\u0003X\u0080\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bE\u0010,\"\u0004\bF\u0010GR\u0014\u0010H\u001a\u00020IX\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\bJ\u0010KR\u001b\u0010L\u001a\u00020M8@X\u0080\u0084\u0002¢\u0006\f\u001a\u0004\bP\u0010Q*\u0004\bN\u0010OR\u0014\u0010R\u001a\u00020\u00038BX\u0082\u0004¢\u0006\u0006\u001a\u0004\bS\u0010,R\u0014\u0010T\u001a\u00020UX\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\bV\u0010WR\u0014\u0010X\u001a\u00020YX\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\bZ\u0010[R\u001c\u0010\\\u001a\u00020]X\u0080\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\n\n\u0002\u0010\u001c\u001a\u0004\b^\u0010_R\u000e\u0010`\u001a\u00020\u0003X\u0082\u000e¢\u0006\u0002\n\u0000R\u0014\u0010a\u001a\u00020bX\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\bc\u0010dR\u001a\u0010e\u001a\u00020\u0015X\u0080\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bf\u0010\u0018\"\u0004\bg\u0010\u001aR\"\u0010i\u001a\u0004\u0018\u00010h2\b\u0010\u0014\u001a\u0004\u0018\u00010h@BX\u0080\u000e¢\u0006\b\n\u0000\u001a\u0004\bj\u0010kR\u0014\u0010l\u001a\u00020mX\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\bn\u0010oR\u0014\u0010p\u001a\u00020qX\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\br\u0010sR\u001e\u0010u\u001a\u00020t2\u0006\u0010\u0014\u001a\u00020t@BX\u0080\u000e¢\u0006\b\n\u0000\u001a\u0004\bv\u0010wR\u000e\u0010x\u001a\u00020\u0001X\u0082\u0004¢\u0006\u0002\n\u0000R\u001c\u0010y\u001a\u0004\u0018\u00010zX\u0080\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b{\u0010|\"\u0004\b}\u0010~R!\u0010\u007f\u001a\u0005\u0018\u00010\u0080\u0001X\u0080\u000e¢\u0006\u0012\n\u0000\u001a\u0006\b\u0081\u0001\u0010\u0082\u0001\"\u0006\b\u0083\u0001\u0010\u0084\u0001\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006\u00ad\u0001"}, d2 = {"Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridState;", "Landroidx/compose/foundation/gestures/ScrollableState;", "initialFirstVisibleItemIndex", "", "initialFirstVisibleItemOffset", "(II)V", "initialFirstVisibleItems", "", "initialFirstVisibleOffsets", "([I[I)V", "animateScrollScope", "Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridAnimateScrollScope;", "awaitLayoutModifier", "Landroidx/compose/foundation/lazy/layout/AwaitFirstLayoutModifier;", "getAwaitLayoutModifier$foundation_release", "()Landroidx/compose/foundation/lazy/layout/AwaitFirstLayoutModifier;", "beyondBoundsInfo", "Landroidx/compose/foundation/lazy/layout/LazyLayoutBeyondBoundsInfo;", "getBeyondBoundsInfo$foundation_release", "()Landroidx/compose/foundation/lazy/layout/LazyLayoutBeyondBoundsInfo;", "<set-?>", "", "canScrollBackward", "getCanScrollBackward", "()Z", "setCanScrollBackward", "(Z)V", "canScrollBackward$delegate", "Landroidx/compose/runtime/MutableState;", "canScrollForward", "getCanScrollForward", "setCanScrollForward", "canScrollForward$delegate", "currentItemPrefetchHandles", "", "Landroidx/compose/foundation/lazy/layout/LazyLayoutPrefetchState$PrefetchHandle;", "density", "Landroidx/compose/ui/unit/Density;", "getDensity$foundation_release", "()Landroidx/compose/ui/unit/Density;", "setDensity$foundation_release", "(Landroidx/compose/ui/unit/Density;)V", "firstVisibleItemIndex", "getFirstVisibleItemIndex", "()I", "firstVisibleItemScrollOffset", "getFirstVisibleItemScrollOffset", "interactionSource", "Landroidx/compose/foundation/interaction/InteractionSource;", "getInteractionSource", "()Landroidx/compose/foundation/interaction/InteractionSource;", "isScrollInProgress", "isVertical", "isVertical$foundation_release", "setVertical$foundation_release", "laneCount", "getLaneCount$foundation_release", "laneInfo", "Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridLaneInfo;", "getLaneInfo$foundation_release", "()Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridLaneInfo;", "layoutInfo", "Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridLayoutInfo;", "getLayoutInfo", "()Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridLayoutInfo;", "layoutInfoState", "Landroidx/compose/runtime/MutableState;", "Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridMeasureResult;", "measurePassCount", "getMeasurePassCount$foundation_release", "setMeasurePassCount$foundation_release", "(I)V", "mutableInteractionSource", "Landroidx/compose/foundation/interaction/MutableInteractionSource;", "getMutableInteractionSource$foundation_release", "()Landroidx/compose/foundation/interaction/MutableInteractionSource;", "nearestRange", "Lkotlin/ranges/IntRange;", "getNearestRange$foundation_release$delegate", "(Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridState;)Ljava/lang/Object;", "getNearestRange$foundation_release", "()Lkotlin/ranges/IntRange;", "numOfItemsToTeleport", "getNumOfItemsToTeleport", "pinnedItems", "Landroidx/compose/foundation/lazy/layout/LazyLayoutPinnedItemList;", "getPinnedItems$foundation_release", "()Landroidx/compose/foundation/lazy/layout/LazyLayoutPinnedItemList;", "placementAnimator", "Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridItemPlacementAnimator;", "getPlacementAnimator$foundation_release", "()Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridItemPlacementAnimator;", "placementScopeInvalidator", "Landroidx/compose/foundation/lazy/layout/ObservableScopeInvalidator;", "getPlacementScopeInvalidator-zYiylxw$foundation_release", "()Landroidx/compose/runtime/MutableState;", "prefetchBaseIndex", "prefetchState", "Landroidx/compose/foundation/lazy/layout/LazyLayoutPrefetchState;", "getPrefetchState$foundation_release", "()Landroidx/compose/foundation/lazy/layout/LazyLayoutPrefetchState;", "prefetchingEnabled", "getPrefetchingEnabled$foundation_release", "setPrefetchingEnabled$foundation_release", "Landroidx/compose/ui/layout/Remeasurement;", "remeasurement", "getRemeasurement$foundation_release", "()Landroidx/compose/ui/layout/Remeasurement;", "remeasurementModifier", "Landroidx/compose/ui/layout/RemeasurementModifier;", "getRemeasurementModifier$foundation_release", "()Landroidx/compose/ui/layout/RemeasurementModifier;", "scrollPosition", "Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridScrollPosition;", "getScrollPosition$foundation_release", "()Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridScrollPosition;", "", "scrollToBeConsumed", "getScrollToBeConsumed$foundation_release", "()F", "scrollableState", "slots", "Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridSlots;", "getSlots$foundation_release", "()Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridSlots;", "setSlots$foundation_release", "(Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridSlots;)V", "spanProvider", "Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridSpanProvider;", "getSpanProvider$foundation_release", "()Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridSpanProvider;", "setSpanProvider$foundation_release", "(Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridSpanProvider;)V", "animateScrollToItem", "", com.google.firebase.analytics.FirebaseAnalytics.Param.INDEX, "scrollOffset", "(IILkotlin/coroutines/Continuation;)Ljava/lang/Object;", "applyMeasureResult", "result", "visibleItemsStayedTheSame", "applyMeasureResult$foundation_release", "cancelPrefetchIfVisibleItemsChanged", "info", "clearLeftoverPrefetchHandles", "prefetchHandlesUsed", "", "dispatchRawDelta", "delta", "fillNearestIndices", "itemIndex", "notifyPrefetch", "onScroll", "distance", com.helpshift.proactive.InAppViewConstants.SCROLL, "scrollPriority", "Landroidx/compose/foundation/MutatePriority;", "block", "Lkotlin/Function2;", "Landroidx/compose/foundation/gestures/ScrollScope;", "Lkotlin/coroutines/Continuation;", "", "Lkotlin/ExtensionFunctionType;", "(Landroidx/compose/foundation/MutatePriority;Lkotlin/jvm/functions/Function2;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "scrollToItem", "updateScrollPositionIfTheFirstItemWasMoved", "itemProvider", "Landroidx/compose/foundation/lazy/layout/LazyLayoutItemProvider;", "firstItemIndex", "updateScrollPositionIfTheFirstItemWasMoved$foundation_release", "snapToItemInternal", "snapToItemInternal$foundation_release", com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.k.M, "foundation_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class LazyStaggeredGridState implements androidx.compose.foundation.gestures.ScrollableState {
    private final androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridAnimateScrollScope animateScrollScope;
    private final androidx.compose.foundation.lazy.layout.AwaitFirstLayoutModifier awaitLayoutModifier;
    private final androidx.compose.foundation.lazy.layout.LazyLayoutBeyondBoundsInfo beyondBoundsInfo;

    /* renamed from: canScrollBackward$delegate, reason: from kotlin metadata */
    private final androidx.compose.runtime.MutableState canScrollBackward;

    /* renamed from: canScrollForward$delegate, reason: from kotlin metadata */
    private final androidx.compose.runtime.MutableState canScrollForward;
    private final java.util.Map<java.lang.Integer, androidx.compose.foundation.lazy.layout.LazyLayoutPrefetchState.PrefetchHandle> currentItemPrefetchHandles;
    private androidx.compose.ui.unit.Density density;
    private boolean isVertical;
    private final androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridLaneInfo laneInfo;
    private final androidx.compose.runtime.MutableState<androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridMeasureResult> layoutInfoState;
    private int measurePassCount;
    private final androidx.compose.foundation.interaction.MutableInteractionSource mutableInteractionSource;
    private final androidx.compose.foundation.lazy.layout.LazyLayoutPinnedItemList pinnedItems;
    private final androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridItemPlacementAnimator placementAnimator;
    private final androidx.compose.runtime.MutableState<kotlin.Unit> placementScopeInvalidator;
    private int prefetchBaseIndex;
    private final androidx.compose.foundation.lazy.layout.LazyLayoutPrefetchState prefetchState;
    private boolean prefetchingEnabled;
    private androidx.compose.ui.layout.Remeasurement remeasurement;
    private final androidx.compose.ui.layout.RemeasurementModifier remeasurementModifier;
    private final androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridScrollPosition scrollPosition;
    private float scrollToBeConsumed;
    private final androidx.compose.foundation.gestures.ScrollableState scrollableState;
    private androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridSlots slots;
    private androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridSpanProvider spanProvider;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridState.Companion INSTANCE = new androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridState.Companion(null);
    public static final int $stable = 8;
    private static final androidx.compose.runtime.saveable.Saver<androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridState, java.lang.Object> Saver = androidx.compose.runtime.saveable.ListSaverKt.listSaver(new kotlin.jvm.functions.Function2<androidx.compose.runtime.saveable.SaverScope, androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridState, java.util.List<? extends int[]>>() { // from class: androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridState$Companion$Saver$1
        @Override // kotlin.jvm.functions.Function2
        public final java.util.List<int[]> invoke(androidx.compose.runtime.saveable.SaverScope saverScope, androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridState lazyStaggeredGridState) {
            return kotlin.collections.CollectionsKt.listOf((java.lang.Object[]) new int[][]{lazyStaggeredGridState.getScrollPosition().getIndices(), lazyStaggeredGridState.getScrollPosition().getScrollOffsets()});
        }
    }, new kotlin.jvm.functions.Function1<java.util.List<? extends int[]>, androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridState>() { // from class: androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridState$Companion$Saver$2
        /* JADX WARN: Multi-variable type inference failed */
        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridState invoke(java.util.List<? extends int[]> list) {
            return invoke2((java.util.List<int[]>) list);
        }

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridState invoke2(java.util.List<int[]> list) {
            return new androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridState(list.get(0), list.get(1), null);
        }
    });

    public /* synthetic */ LazyStaggeredGridState(int[] iArr, int[] iArr2, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this(iArr, iArr2);
    }

    private LazyStaggeredGridState(int[] iArr, int[] iArr2) {
        androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridScrollPosition lazyStaggeredGridScrollPosition = new androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridScrollPosition(iArr, iArr2, new androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridState$scrollPosition$1(this));
        this.scrollPosition = lazyStaggeredGridScrollPosition;
        this.layoutInfoState = androidx.compose.runtime.SnapshotStateKt.mutableStateOf(androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridMeasureResultKt.getEmptyLazyStaggeredGridLayoutInfo(), androidx.compose.runtime.SnapshotStateKt.neverEqualPolicy());
        this.laneInfo = new androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridLaneInfo();
        this.canScrollForward = androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(false, null, 2, null);
        this.canScrollBackward = androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(false, null, 2, null);
        this.animateScrollScope = new androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridAnimateScrollScope(this);
        this.remeasurementModifier = new androidx.compose.ui.layout.RemeasurementModifier() { // from class: androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridState$remeasurementModifier$1
            @Override // androidx.compose.ui.Modifier.Element, androidx.compose.ui.Modifier
            public /* synthetic */ boolean all(kotlin.jvm.functions.Function1 function1) {
                return androidx.compose.ui.Modifier.Element.CC.$default$all(this, function1);
            }

            @Override // androidx.compose.ui.Modifier.Element, androidx.compose.ui.Modifier
            public /* synthetic */ boolean any(kotlin.jvm.functions.Function1 function1) {
                return androidx.compose.ui.Modifier.Element.CC.$default$any(this, function1);
            }

            @Override // androidx.compose.ui.Modifier.Element, androidx.compose.ui.Modifier
            public /* synthetic */ java.lang.Object foldIn(java.lang.Object obj, kotlin.jvm.functions.Function2 function2) {
                return androidx.compose.ui.Modifier.Element.CC.$default$foldIn(this, obj, function2);
            }

            @Override // androidx.compose.ui.Modifier.Element, androidx.compose.ui.Modifier
            public /* synthetic */ java.lang.Object foldOut(java.lang.Object obj, kotlin.jvm.functions.Function2 function2) {
                return androidx.compose.ui.Modifier.Element.CC.$default$foldOut(this, obj, function2);
            }

            @Override // androidx.compose.ui.Modifier
            public /* synthetic */ androidx.compose.ui.Modifier then(androidx.compose.ui.Modifier modifier) {
                return androidx.compose.ui.Modifier.CC.$default$then(this, modifier);
            }

            @Override // androidx.compose.ui.layout.RemeasurementModifier
            public void onRemeasurementAvailable(androidx.compose.ui.layout.Remeasurement remeasurement) {
                androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridState.this.remeasurement = remeasurement;
            }
        };
        this.awaitLayoutModifier = new androidx.compose.foundation.lazy.layout.AwaitFirstLayoutModifier();
        this.beyondBoundsInfo = new androidx.compose.foundation.lazy.layout.LazyLayoutBeyondBoundsInfo();
        this.prefetchingEnabled = true;
        this.prefetchState = new androidx.compose.foundation.lazy.layout.LazyLayoutPrefetchState();
        this.scrollableState = androidx.compose.foundation.gestures.ScrollableStateKt.ScrollableState(new kotlin.jvm.functions.Function1<java.lang.Float, java.lang.Float>() { // from class: androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridState$scrollableState$1
            {
                super(1);
            }

            public final java.lang.Float invoke(float f) {
                float onScroll;
                onScroll = androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridState.this.onScroll(-f);
                return java.lang.Float.valueOf(-onScroll);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ java.lang.Float invoke(java.lang.Float f) {
                return invoke(f.floatValue());
            }
        });
        this.prefetchBaseIndex = -1;
        this.currentItemPrefetchHandles = new java.util.LinkedHashMap();
        this.density = androidx.compose.ui.unit.DensityKt.Density(1.0f, 1.0f);
        this.mutableInteractionSource = androidx.compose.foundation.interaction.InteractionSourceKt.MutableInteractionSource();
        this.pinnedItems = new androidx.compose.foundation.lazy.layout.LazyLayoutPinnedItemList();
        this.placementAnimator = new androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridItemPlacementAnimator();
        lazyStaggeredGridScrollPosition.getNearestRangeState();
        this.placementScopeInvalidator = androidx.compose.foundation.lazy.layout.ObservableScopeInvalidator.m747constructorimpl$default(null, 1, null);
    }

    public /* synthetic */ LazyStaggeredGridState(int i, int i2, int i3, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this((i3 & 1) != 0 ? 0 : i, (i3 & 2) != 0 ? 0 : i2);
    }

    public LazyStaggeredGridState(int i, int i2) {
        this(new int[]{i}, new int[]{i2});
    }

    public final int getFirstVisibleItemIndex() {
        return this.scrollPosition.getIndex();
    }

    public final int getFirstVisibleItemScrollOffset() {
        return this.scrollPosition.getScrollOffset();
    }

    /* renamed from: getScrollPosition$foundation_release, reason: from getter */
    public final androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridScrollPosition getScrollPosition() {
        return this.scrollPosition;
    }

    public final androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridLayoutInfo getLayoutInfo() {
        return this.layoutInfoState.getValue();
    }

    /* renamed from: getLaneInfo$foundation_release, reason: from getter */
    public final androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridLaneInfo getLaneInfo() {
        return this.laneInfo;
    }

    private void setCanScrollForward(boolean z) {
        this.canScrollForward.setValue(java.lang.Boolean.valueOf(z));
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // androidx.compose.foundation.gestures.ScrollableState
    public boolean getCanScrollForward() {
        return ((java.lang.Boolean) this.canScrollForward.getValue()).booleanValue();
    }

    private void setCanScrollBackward(boolean z) {
        this.canScrollBackward.setValue(java.lang.Boolean.valueOf(z));
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // androidx.compose.foundation.gestures.ScrollableState
    public boolean getCanScrollBackward() {
        return ((java.lang.Boolean) this.canScrollBackward.getValue()).booleanValue();
    }

    /* renamed from: getRemeasurement$foundation_release, reason: from getter */
    public final androidx.compose.ui.layout.Remeasurement getRemeasurement() {
        return this.remeasurement;
    }

    /* renamed from: getRemeasurementModifier$foundation_release, reason: from getter */
    public final androidx.compose.ui.layout.RemeasurementModifier getRemeasurementModifier() {
        return this.remeasurementModifier;
    }

    /* renamed from: getAwaitLayoutModifier$foundation_release, reason: from getter */
    public final androidx.compose.foundation.lazy.layout.AwaitFirstLayoutModifier getAwaitLayoutModifier() {
        return this.awaitLayoutModifier;
    }

    /* renamed from: getBeyondBoundsInfo$foundation_release, reason: from getter */
    public final androidx.compose.foundation.lazy.layout.LazyLayoutBeyondBoundsInfo getBeyondBoundsInfo() {
        return this.beyondBoundsInfo;
    }

    /* renamed from: getPrefetchingEnabled$foundation_release, reason: from getter */
    public final boolean getPrefetchingEnabled() {
        return this.prefetchingEnabled;
    }

    public final void setPrefetchingEnabled$foundation_release(boolean z) {
        this.prefetchingEnabled = z;
    }

    /* renamed from: getPrefetchState$foundation_release, reason: from getter */
    public final androidx.compose.foundation.lazy.layout.LazyLayoutPrefetchState getPrefetchState() {
        return this.prefetchState;
    }

    /* renamed from: getScrollToBeConsumed$foundation_release, reason: from getter */
    public final float getScrollToBeConsumed() {
        return this.scrollToBeConsumed;
    }

    /* renamed from: getMeasurePassCount$foundation_release, reason: from getter */
    public final int getMeasurePassCount() {
        return this.measurePassCount;
    }

    public final void setMeasurePassCount$foundation_release(int i) {
        this.measurePassCount = i;
    }

    /* renamed from: isVertical$foundation_release, reason: from getter */
    public final boolean getIsVertical() {
        return this.isVertical;
    }

    public final void setVertical$foundation_release(boolean z) {
        this.isVertical = z;
    }

    /* renamed from: getSlots$foundation_release, reason: from getter */
    public final androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridSlots getSlots() {
        return this.slots;
    }

    public final void setSlots$foundation_release(androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridSlots lazyStaggeredGridSlots) {
        this.slots = lazyStaggeredGridSlots;
    }

    /* renamed from: getSpanProvider$foundation_release, reason: from getter */
    public final androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridSpanProvider getSpanProvider() {
        return this.spanProvider;
    }

    public final void setSpanProvider$foundation_release(androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridSpanProvider lazyStaggeredGridSpanProvider) {
        this.spanProvider = lazyStaggeredGridSpanProvider;
    }

    /* renamed from: getDensity$foundation_release, reason: from getter */
    public final androidx.compose.ui.unit.Density getDensity() {
        return this.density;
    }

    public final void setDensity$foundation_release(androidx.compose.ui.unit.Density density) {
        this.density = density;
    }

    public final int getLaneCount$foundation_release() {
        int[] sizes;
        androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridSlots lazyStaggeredGridSlots = this.slots;
        if (lazyStaggeredGridSlots == null || (sizes = lazyStaggeredGridSlots.getSizes()) == null) {
            return 0;
        }
        return sizes.length;
    }

    public final androidx.compose.foundation.interaction.InteractionSource getInteractionSource() {
        return this.mutableInteractionSource;
    }

    /* renamed from: getMutableInteractionSource$foundation_release, reason: from getter */
    public final androidx.compose.foundation.interaction.MutableInteractionSource getMutableInteractionSource() {
        return this.mutableInteractionSource;
    }

    /* renamed from: getPinnedItems$foundation_release, reason: from getter */
    public final androidx.compose.foundation.lazy.layout.LazyLayoutPinnedItemList getPinnedItems() {
        return this.pinnedItems;
    }

    /* renamed from: getPlacementAnimator$foundation_release, reason: from getter */
    public final androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridItemPlacementAnimator getPlacementAnimator() {
        return this.placementAnimator;
    }

    public final kotlin.ranges.IntRange getNearestRange$foundation_release() {
        return this.scrollPosition.getNearestRangeState().getValue();
    }

    /* renamed from: getPlacementScopeInvalidator-zYiylxw$foundation_release, reason: not valid java name */
    public final androidx.compose.runtime.MutableState<kotlin.Unit> m784getPlacementScopeInvalidatorzYiylxw$foundation_release() {
        return this.placementScopeInvalidator;
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x006c A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0046  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0025  */
    @Override // androidx.compose.foundation.gestures.ScrollableState
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public java.lang.Object scroll(androidx.compose.foundation.MutatePriority mutatePriority, kotlin.jvm.functions.Function2<? super androidx.compose.foundation.gestures.ScrollScope, ? super kotlin.coroutines.Continuation<? super kotlin.Unit>, ? extends java.lang.Object> function2, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridState$scroll$1 lazyStaggeredGridState$scroll$1;
        java.lang.Object coroutine_suspended;
        int i;
        androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridState lazyStaggeredGridState;
        androidx.compose.foundation.gestures.ScrollableState scrollableState;
        if (continuation instanceof androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridState$scroll$1) {
            lazyStaggeredGridState$scroll$1 = (androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridState$scroll$1) continuation;
            if ((lazyStaggeredGridState$scroll$1.label & Integer.MIN_VALUE) != 0) {
                lazyStaggeredGridState$scroll$1.label -= Integer.MIN_VALUE;
                java.lang.Object obj = lazyStaggeredGridState$scroll$1.result;
                coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = lazyStaggeredGridState$scroll$1.label;
                if (i != 0) {
                    kotlin.ResultKt.throwOnFailure(obj);
                    androidx.compose.foundation.lazy.layout.AwaitFirstLayoutModifier awaitFirstLayoutModifier = this.awaitLayoutModifier;
                    lazyStaggeredGridState$scroll$1.L$0 = this;
                    lazyStaggeredGridState$scroll$1.L$1 = mutatePriority;
                    lazyStaggeredGridState$scroll$1.L$2 = function2;
                    lazyStaggeredGridState$scroll$1.label = 1;
                    if (awaitFirstLayoutModifier.waitForFirstLayout(lazyStaggeredGridState$scroll$1) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    lazyStaggeredGridState = this;
                } else {
                    if (i != 1) {
                        if (i != 2) {
                            throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        kotlin.ResultKt.throwOnFailure(obj);
                        return kotlin.Unit.INSTANCE;
                    }
                    function2 = (kotlin.jvm.functions.Function2) lazyStaggeredGridState$scroll$1.L$2;
                    mutatePriority = (androidx.compose.foundation.MutatePriority) lazyStaggeredGridState$scroll$1.L$1;
                    lazyStaggeredGridState = (androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridState) lazyStaggeredGridState$scroll$1.L$0;
                    kotlin.ResultKt.throwOnFailure(obj);
                }
                scrollableState = lazyStaggeredGridState.scrollableState;
                lazyStaggeredGridState$scroll$1.L$0 = null;
                lazyStaggeredGridState$scroll$1.L$1 = null;
                lazyStaggeredGridState$scroll$1.L$2 = null;
                lazyStaggeredGridState$scroll$1.label = 2;
                if (scrollableState.scroll(mutatePriority, function2, lazyStaggeredGridState$scroll$1) == coroutine_suspended) {
                    return coroutine_suspended;
                }
                return kotlin.Unit.INSTANCE;
            }
        }
        lazyStaggeredGridState$scroll$1 = new androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridState$scroll$1(this, continuation);
        java.lang.Object obj2 = lazyStaggeredGridState$scroll$1.result;
        coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = lazyStaggeredGridState$scroll$1.label;
        if (i != 0) {
        }
        scrollableState = lazyStaggeredGridState.scrollableState;
        lazyStaggeredGridState$scroll$1.L$0 = null;
        lazyStaggeredGridState$scroll$1.L$1 = null;
        lazyStaggeredGridState$scroll$1.L$2 = null;
        lazyStaggeredGridState$scroll$1.label = 2;
        if (scrollableState.scroll(mutatePriority, function2, lazyStaggeredGridState$scroll$1) == coroutine_suspended) {
        }
        return kotlin.Unit.INSTANCE;
    }

    @Override // androidx.compose.foundation.gestures.ScrollableState
    public boolean isScrollInProgress() {
        return this.scrollableState.isScrollInProgress();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final float onScroll(float distance) {
        if ((distance < 0.0f && !getCanScrollForward()) || (distance > 0.0f && !getCanScrollBackward())) {
            return 0.0f;
        }
        if (java.lang.Math.abs(this.scrollToBeConsumed) > 0.5f) {
            throw new java.lang.IllegalStateException(("entered drag with non-zero pending scroll: " + this.scrollToBeConsumed).toString());
        }
        float f = this.scrollToBeConsumed + distance;
        this.scrollToBeConsumed = f;
        if (java.lang.Math.abs(f) > 0.5f) {
            androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridMeasureResult value = this.layoutInfoState.getValue();
            float f2 = this.scrollToBeConsumed;
            if (value.tryToApplyScrollWithoutRemeasure(kotlin.math.MathKt.roundToInt(f2))) {
                applyMeasureResult$foundation_release(value, true);
                androidx.compose.foundation.lazy.layout.ObservableScopeInvalidator.m751invalidateScopeimpl(this.placementScopeInvalidator);
                notifyPrefetch(f2 - this.scrollToBeConsumed, value);
            } else {
                androidx.compose.ui.layout.Remeasurement remeasurement = this.remeasurement;
                if (remeasurement != null) {
                    remeasurement.forceRemeasure();
                }
                notifyPrefetch$default(this, f2 - this.scrollToBeConsumed, null, 2, null);
            }
        }
        if (java.lang.Math.abs(this.scrollToBeConsumed) <= 0.5f) {
            return distance;
        }
        float f3 = distance - this.scrollToBeConsumed;
        this.scrollToBeConsumed = 0.0f;
        return f3;
    }

    public static /* synthetic */ java.lang.Object scrollToItem$default(androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridState lazyStaggeredGridState, int i, int i2, kotlin.coroutines.Continuation continuation, int i3, java.lang.Object obj) {
        if ((i3 & 2) != 0) {
            i2 = 0;
        }
        return lazyStaggeredGridState.scrollToItem(i, i2, continuation);
    }

    public final java.lang.Object scrollToItem(int i, int i2, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        java.lang.Object scroll$default = androidx.compose.foundation.gestures.ScrollableState.CC.scroll$default(this, null, new androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridState$scrollToItem$2(this, i, i2, null), continuation, 1, null);
        return scroll$default == kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED() ? scroll$default : kotlin.Unit.INSTANCE;
    }

    private final int getNumOfItemsToTeleport() {
        return getLaneCount$foundation_release() * 100;
    }

    public static /* synthetic */ java.lang.Object animateScrollToItem$default(androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridState lazyStaggeredGridState, int i, int i2, kotlin.coroutines.Continuation continuation, int i3, java.lang.Object obj) {
        if ((i3 & 2) != 0) {
            i2 = 0;
        }
        return lazyStaggeredGridState.animateScrollToItem(i, i2, continuation);
    }

    public final java.lang.Object animateScrollToItem(int i, int i2, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        java.lang.Object animateScrollToItem = androidx.compose.foundation.lazy.layout.LazyAnimateScrollKt.animateScrollToItem(this.animateScrollScope, i, i2, getNumOfItemsToTeleport(), this.density, continuation);
        return animateScrollToItem == kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED() ? animateScrollToItem : kotlin.Unit.INSTANCE;
    }

    public final void snapToItemInternal$foundation_release(androidx.compose.foundation.gestures.ScrollScope scrollScope, int i, int i2) {
        androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridItemInfo findVisibleItem = androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridMeasureResultKt.findVisibleItem(getLayoutInfo(), i);
        if (findVisibleItem != null) {
            boolean z = this.isVertical;
            long offset = findVisibleItem.getOffset();
            scrollScope.scrollBy((z ? androidx.compose.ui.unit.IntOffset.m4611getYimpl(offset) : androidx.compose.ui.unit.IntOffset.m4610getXimpl(offset)) + i2);
        } else {
            this.scrollPosition.requestPosition(i, i2);
            androidx.compose.ui.layout.Remeasurement remeasurement = this.remeasurement;
            if (remeasurement != null) {
                remeasurement.forceRemeasure();
            }
        }
    }

    public final int[] updateScrollPositionIfTheFirstItemWasMoved$foundation_release(androidx.compose.foundation.lazy.layout.LazyLayoutItemProvider itemProvider, int[] firstItemIndex) {
        return this.scrollPosition.updateScrollPositionIfTheFirstItemWasMoved(itemProvider, firstItemIndex);
    }

    @Override // androidx.compose.foundation.gestures.ScrollableState
    public float dispatchRawDelta(float delta) {
        return this.scrollableState.dispatchRawDelta(delta);
    }

    static /* synthetic */ void notifyPrefetch$default(androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridState lazyStaggeredGridState, float f, androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridLayoutInfo lazyStaggeredGridLayoutInfo, int i, java.lang.Object obj) {
        if ((i & 2) != 0) {
            lazyStaggeredGridLayoutInfo = lazyStaggeredGridState.layoutInfoState.getValue();
        }
        lazyStaggeredGridState.notifyPrefetch(f, lazyStaggeredGridLayoutInfo);
    }

    private final void notifyPrefetch(float delta, androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridLayoutInfo info) {
        int index;
        int i;
        long m4433fixedHeightOenEA2s;
        if (this.prefetchingEnabled && (!info.getVisibleItemsInfo().isEmpty())) {
            boolean z = delta < 0.0f;
            if (z) {
                index = ((androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridItemInfo) kotlin.collections.CollectionsKt.last((java.util.List) info.getVisibleItemsInfo())).getIndex();
            } else {
                index = ((androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridItemInfo) kotlin.collections.CollectionsKt.first((java.util.List) info.getVisibleItemsInfo())).getIndex();
            }
            if (index == this.prefetchBaseIndex) {
                return;
            }
            this.prefetchBaseIndex = index;
            java.util.LinkedHashSet linkedHashSet = new java.util.LinkedHashSet();
            int laneCount$foundation_release = getLaneCount$foundation_release();
            for (int i2 = 0; i2 < laneCount$foundation_release; i2++) {
                if (z) {
                    index = this.laneInfo.findNextItemIndex(index, i2);
                } else {
                    index = this.laneInfo.findPreviousItemIndex(index, i2);
                }
                if (index < 0 || index >= info.getTotalItemsCount() || linkedHashSet.contains(java.lang.Integer.valueOf(index))) {
                    break;
                }
                linkedHashSet.add(java.lang.Integer.valueOf(index));
                if (!this.currentItemPrefetchHandles.containsKey(java.lang.Integer.valueOf(index))) {
                    androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridSpanProvider lazyStaggeredGridSpanProvider = this.spanProvider;
                    boolean z2 = lazyStaggeredGridSpanProvider != null && lazyStaggeredGridSpanProvider.isFullSpan(index);
                    int i3 = z2 ? 0 : i2;
                    int laneCount$foundation_release2 = z2 ? getLaneCount$foundation_release() : 1;
                    androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridSlots lazyStaggeredGridSlots = this.slots;
                    if (lazyStaggeredGridSlots == null) {
                        i = 0;
                    } else if (laneCount$foundation_release2 == 1) {
                        i = lazyStaggeredGridSlots.getSizes()[i3];
                    } else {
                        int i4 = lazyStaggeredGridSlots.getPositions()[i3];
                        int i5 = (i3 + laneCount$foundation_release2) - 1;
                        i = (lazyStaggeredGridSlots.getPositions()[i5] + lazyStaggeredGridSlots.getSizes()[i5]) - i4;
                    }
                    if (this.isVertical) {
                        m4433fixedHeightOenEA2s = androidx.compose.ui.unit.Constraints.INSTANCE.m4434fixedWidthOenEA2s(i);
                    } else {
                        m4433fixedHeightOenEA2s = androidx.compose.ui.unit.Constraints.INSTANCE.m4433fixedHeightOenEA2s(i);
                    }
                    this.currentItemPrefetchHandles.put(java.lang.Integer.valueOf(index), this.prefetchState.m741schedulePrefetch0kLqBqw(index, m4433fixedHeightOenEA2s));
                }
            }
            clearLeftoverPrefetchHandles(linkedHashSet);
        }
    }

    private final void clearLeftoverPrefetchHandles(java.util.Set<java.lang.Integer> prefetchHandlesUsed) {
        java.util.Iterator<java.util.Map.Entry<java.lang.Integer, androidx.compose.foundation.lazy.layout.LazyLayoutPrefetchState.PrefetchHandle>> it = this.currentItemPrefetchHandles.entrySet().iterator();
        while (it.hasNext()) {
            java.util.Map.Entry<java.lang.Integer, androidx.compose.foundation.lazy.layout.LazyLayoutPrefetchState.PrefetchHandle> next = it.next();
            if (!prefetchHandlesUsed.contains(next.getKey())) {
                next.getValue().cancel();
                it.remove();
            }
        }
    }

    private final void cancelPrefetchIfVisibleItemsChanged(androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridLayoutInfo info) {
        java.util.List<androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridItemInfo> visibleItemsInfo = info.getVisibleItemsInfo();
        if (this.prefetchBaseIndex == -1 || !(!visibleItemsInfo.isEmpty())) {
            return;
        }
        int index = ((androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridItemInfo) kotlin.collections.CollectionsKt.first((java.util.List) visibleItemsInfo)).getIndex();
        int index2 = ((androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridItemInfo) kotlin.collections.CollectionsKt.last((java.util.List) visibleItemsInfo)).getIndex();
        int i = this.prefetchBaseIndex;
        if (index > i || i > index2) {
            this.prefetchBaseIndex = -1;
            java.util.Iterator<T> it = this.currentItemPrefetchHandles.values().iterator();
            while (it.hasNext()) {
                ((androidx.compose.foundation.lazy.layout.LazyLayoutPrefetchState.PrefetchHandle) it.next()).cancel();
            }
            this.currentItemPrefetchHandles.clear();
        }
    }

    public static /* synthetic */ void applyMeasureResult$foundation_release$default(androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridState lazyStaggeredGridState, androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridMeasureResult lazyStaggeredGridMeasureResult, boolean z, int i, java.lang.Object obj) {
        if ((i & 2) != 0) {
            z = false;
        }
        lazyStaggeredGridState.applyMeasureResult$foundation_release(lazyStaggeredGridMeasureResult, z);
    }

    public final void applyMeasureResult$foundation_release(androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridMeasureResult result, boolean visibleItemsStayedTheSame) {
        this.scrollToBeConsumed -= result.getConsumedScroll();
        this.layoutInfoState.setValue(result);
        if (visibleItemsStayedTheSame) {
            this.scrollPosition.updateScrollOffset(result.getFirstVisibleItemScrollOffsets());
        } else {
            this.scrollPosition.updateFromMeasureResult(result);
            cancelPrefetchIfVisibleItemsChanged(result);
        }
        setCanScrollBackward(result.getCanScrollBackward());
        setCanScrollForward(result.getCanScrollForward());
        this.measurePassCount++;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final int[] fillNearestIndices(int itemIndex, int laneCount) {
        int i;
        int[] iArr = new int[laneCount];
        androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridSpanProvider lazyStaggeredGridSpanProvider = this.spanProvider;
        if (lazyStaggeredGridSpanProvider != null && lazyStaggeredGridSpanProvider.isFullSpan(itemIndex)) {
            kotlin.collections.ArraysKt.fill$default(iArr, itemIndex, 0, 0, 6, (java.lang.Object) null);
            return iArr;
        }
        this.laneInfo.ensureValidIndex(itemIndex + laneCount);
        int lane = this.laneInfo.getLane(itemIndex);
        if (lane == -2 || lane == -1) {
            i = 0;
        } else {
            if (lane < 0) {
                throw new java.lang.IllegalArgumentException(("Expected positive lane number, got " + lane + " instead.").toString());
            }
            i = java.lang.Math.min(lane, laneCount);
        }
        int i2 = i - 1;
        int i3 = itemIndex;
        while (true) {
            if (-1 >= i2) {
                break;
            }
            i3 = this.laneInfo.findPreviousItemIndex(i3, i2);
            iArr[i2] = i3;
            if (i3 == -1) {
                kotlin.collections.ArraysKt.fill$default(iArr, -1, 0, i2, 2, (java.lang.Object) null);
                break;
            }
            i2--;
        }
        iArr[i] = itemIndex;
        for (int i4 = i + 1; i4 < laneCount; i4++) {
            itemIndex = this.laneInfo.findNextItemIndex(itemIndex, i4);
            iArr[i4] = itemIndex;
        }
        return iArr;
    }

    /* compiled from: LazyStaggeredGridState.kt */
    @kotlin.Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u001d\u0010\u0003\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00010\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridState$Companion;", "", "()V", "Saver", "Landroidx/compose/runtime/saveable/Saver;", "Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridState;", "getSaver", "()Landroidx/compose/runtime/saveable/Saver;", "foundation_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final androidx.compose.runtime.saveable.Saver<androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridState, java.lang.Object> getSaver() {
            return androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridState.Saver;
        }
    }
}
