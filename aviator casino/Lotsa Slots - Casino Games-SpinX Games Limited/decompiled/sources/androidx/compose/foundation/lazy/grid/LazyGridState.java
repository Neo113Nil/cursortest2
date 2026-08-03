package androidx.compose.foundation.lazy.grid;

/* compiled from: LazyGridState.kt */
@kotlin.Metadata(d1 = {"\u0000ô\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\b\f\n\u0002\u0010\u0002\n\u0002\b\u0011\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u0000 ¢\u00012\u00020\u0001:\u0002¢\u0001B\u0019\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003¢\u0006\u0002\u0010\u0005J&\u0010\u007f\u001a\u00030\u0080\u00012\t\b\u0001\u0010\u0081\u0001\u001a\u00020\u00032\t\b\u0002\u0010\u0082\u0001\u001a\u00020\u0003H\u0086@¢\u0006\u0003\u0010\u0083\u0001J$\u0010\u0084\u0001\u001a\u00030\u0080\u00012\u0007\u0010\u0085\u0001\u001a\u00020;2\t\b\u0002\u0010\u0086\u0001\u001a\u00020\u0011H\u0000¢\u0006\u0003\b\u0087\u0001J\u0013\u0010\u0088\u0001\u001a\u00030\u0080\u00012\u0007\u0010\u0089\u0001\u001a\u000206H\u0002J\u0012\u0010\u008a\u0001\u001a\u00020s2\u0007\u0010\u008b\u0001\u001a\u00020sH\u0016J\u001d\u0010\u008c\u0001\u001a\u00030\u0080\u00012\u0007\u0010\u008b\u0001\u001a\u00020s2\b\b\u0002\u00105\u001a\u000206H\u0002J\u0018\u0010\u008d\u0001\u001a\u00020s2\u0007\u0010\u008e\u0001\u001a\u00020sH\u0000¢\u0006\u0003\b\u008f\u0001JK\u0010\u0090\u0001\u001a\u00030\u0080\u00012\b\u0010\u0091\u0001\u001a\u00030\u0092\u00012.\u0010\u0093\u0001\u001a)\b\u0001\u0012\u0005\u0012\u00030\u0095\u0001\u0012\f\u0012\n\u0012\u0005\u0012\u00030\u0080\u00010\u0096\u0001\u0012\u0007\u0012\u0005\u0018\u00010\u0097\u00010\u0094\u0001¢\u0006\u0003\b\u0098\u0001H\u0096@¢\u0006\u0003\u0010\u0099\u0001J'\u0010\u009a\u0001\u001a\u00030\u0080\u00012\t\b\u0001\u0010\u0081\u0001\u001a\u00020\u00032\t\b\u0002\u0010\u0082\u0001\u001a\u00020\u0003H\u0086@¢\u0006\u0003\u0010\u0083\u0001J\"\u0010\u009b\u0001\u001a\u00030\u0080\u00012\u0007\u0010\u0081\u0001\u001a\u00020\u00032\u0007\u0010\u0082\u0001\u001a\u00020\u0003H\u0000¢\u0006\u0003\b\u009c\u0001J\"\u0010\u009d\u0001\u001a\u00020\u00032\b\u0010\u009e\u0001\u001a\u00030\u009f\u00012\u0007\u0010 \u0001\u001a\u00020\u0003H\u0000¢\u0006\u0003\b¡\u0001R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\b\u001a\u00020\tX\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0014\u0010\f\u001a\u00020\rX\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR+\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0010\u001a\u00020\u00118V@RX\u0096\u008e\u0002¢\u0006\u0012\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0013\u0010\u0014\"\u0004\b\u0015\u0010\u0016R+\u0010\u0019\u001a\u00020\u00112\u0006\u0010\u0010\u001a\u00020\u00118V@RX\u0096\u008e\u0002¢\u0006\u0012\n\u0004\b\u001c\u0010\u0018\u001a\u0004\b\u001a\u0010\u0014\"\u0004\b\u001b\u0010\u0016R\u0014\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u001f0\u001eX\u0082\u0004¢\u0006\u0002\n\u0000R\u001a\u0010 \u001a\u00020!X\u0080\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\"\u0010#\"\u0004\b$\u0010%R\u0011\u0010\u0002\u001a\u00020\u00038F¢\u0006\u0006\u001a\u0004\b&\u0010'R\u0011\u0010\u0004\u001a\u00020\u00038F¢\u0006\u0006\u001a\u0004\b(\u0010'R\u0011\u0010)\u001a\u00020*8F¢\u0006\u0006\u001a\u0004\b+\u0010,R\u0014\u0010-\u001a\u00020.X\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b/\u00100R\u0014\u00101\u001a\u00020\u00118VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b1\u0010\u0014R\u001a\u00102\u001a\u00020\u0011X\u0080\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b3\u0010\u0014\"\u0004\b4\u0010\u0016R\u0011\u00105\u001a\u0002068F¢\u0006\u0006\u001a\u0004\b7\u00108R\u0014\u00109\u001a\b\u0012\u0004\u0012\u00020;0:X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010<\u001a\u00020\u0003X\u0082\u000e¢\u0006\u0002\n\u0000R\u001b\u0010=\u001a\u00020>8@X\u0080\u0084\u0002¢\u0006\f\u001a\u0004\bA\u0010B*\u0004\b?\u0010@R\u001e\u0010C\u001a\u00020\u00032\u0006\u0010\u0010\u001a\u00020\u0003@BX\u0080\u000e¢\u0006\b\n\u0000\u001a\u0004\bD\u0010'R\u0014\u0010E\u001a\u00020\u00038BX\u0082\u0004¢\u0006\u0006\u001a\u0004\bF\u0010'R\u0014\u0010G\u001a\u00020HX\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\bI\u0010JR\u0014\u0010K\u001a\u00020LX\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\bM\u0010NR\u001c\u0010O\u001a\u00020PX\u0080\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\n\n\u0002\u0010\u0018\u001a\u0004\bQ\u0010RR\u0085\u0001\u0010Z\u001a/\u0012\u0013\u0012\u00110\u0003¢\u0006\f\bT\u0012\b\bU\u0012\u0004\b\b(V\u0012\u0016\u0012\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020Y0X0W0S23\u0010\u0010\u001a/\u0012\u0013\u0012\u00110\u0003¢\u0006\f\bT\u0012\b\bU\u0012\u0004\b\b(V\u0012\u0016\u0012\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020Y0X0W0S8@@@X\u0080\u008e\u0002¢\u0006\u0012\n\u0004\b_\u0010\u0018\u001a\u0004\b[\u0010\\\"\u0004\b]\u0010^R\u0014\u0010`\u001a\u00020aX\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\bb\u0010cR\u001a\u0010d\u001a\u00020\u0011X\u0080\u000e¢\u0006\u000e\n\u0000\u001a\u0004\be\u0010\u0014\"\u0004\bf\u0010\u0016R\u001c\u0010g\u001a\u0004\u0018\u00010hX\u0080\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bi\u0010j\"\u0004\bk\u0010lR\u0014\u0010m\u001a\u00020nX\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\bo\u0010pR\u000e\u0010q\u001a\u00020rX\u0082\u0004¢\u0006\u0002\n\u0000R\u001e\u0010t\u001a\u00020s2\u0006\u0010\u0010\u001a\u00020s@BX\u0080\u000e¢\u0006\b\n\u0000\u001a\u0004\bu\u0010vR\u000e\u0010w\u001a\u00020\u0001X\u0082\u0004¢\u0006\u0002\n\u0000R+\u0010x\u001a\u00020\u00032\u0006\u0010\u0010\u001a\u00020\u00038@@@X\u0080\u008e\u0002¢\u0006\u0012\n\u0004\b|\u0010}\u001a\u0004\by\u0010'\"\u0004\bz\u0010{R\u000e\u0010~\u001a\u00020\u0011X\u0082\u000e¢\u0006\u0002\n\u0000\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006£\u0001"}, d2 = {"Landroidx/compose/foundation/lazy/grid/LazyGridState;", "Landroidx/compose/foundation/gestures/ScrollableState;", "firstVisibleItemIndex", "", "firstVisibleItemScrollOffset", "(II)V", "animateScrollScope", "Landroidx/compose/foundation/lazy/grid/LazyGridAnimateScrollScope;", "awaitLayoutModifier", "Landroidx/compose/foundation/lazy/layout/AwaitFirstLayoutModifier;", "getAwaitLayoutModifier$foundation_release", "()Landroidx/compose/foundation/lazy/layout/AwaitFirstLayoutModifier;", "beyondBoundsInfo", "Landroidx/compose/foundation/lazy/layout/LazyLayoutBeyondBoundsInfo;", "getBeyondBoundsInfo$foundation_release", "()Landroidx/compose/foundation/lazy/layout/LazyLayoutBeyondBoundsInfo;", "<set-?>", "", "canScrollBackward", "getCanScrollBackward", "()Z", "setCanScrollBackward", "(Z)V", "canScrollBackward$delegate", "Landroidx/compose/runtime/MutableState;", "canScrollForward", "getCanScrollForward", "setCanScrollForward", "canScrollForward$delegate", "currentLinePrefetchHandles", "Landroidx/compose/runtime/collection/MutableVector;", "Landroidx/compose/foundation/lazy/layout/LazyLayoutPrefetchState$PrefetchHandle;", "density", "Landroidx/compose/ui/unit/Density;", "getDensity$foundation_release", "()Landroidx/compose/ui/unit/Density;", "setDensity$foundation_release", "(Landroidx/compose/ui/unit/Density;)V", "getFirstVisibleItemIndex", "()I", "getFirstVisibleItemScrollOffset", "interactionSource", "Landroidx/compose/foundation/interaction/InteractionSource;", "getInteractionSource", "()Landroidx/compose/foundation/interaction/InteractionSource;", "internalInteractionSource", "Landroidx/compose/foundation/interaction/MutableInteractionSource;", "getInternalInteractionSource$foundation_release", "()Landroidx/compose/foundation/interaction/MutableInteractionSource;", "isScrollInProgress", "isVertical", "isVertical$foundation_release", "setVertical$foundation_release", "layoutInfo", "Landroidx/compose/foundation/lazy/grid/LazyGridLayoutInfo;", "getLayoutInfo", "()Landroidx/compose/foundation/lazy/grid/LazyGridLayoutInfo;", "layoutInfoState", "Landroidx/compose/runtime/MutableState;", "Landroidx/compose/foundation/lazy/grid/LazyGridMeasureResult;", "lineToPrefetch", "nearestRange", "Lkotlin/ranges/IntRange;", "getNearestRange$foundation_release$delegate", "(Landroidx/compose/foundation/lazy/grid/LazyGridState;)Ljava/lang/Object;", "getNearestRange$foundation_release", "()Lkotlin/ranges/IntRange;", "numMeasurePasses", "getNumMeasurePasses$foundation_release", "numOfItemsToTeleport", "getNumOfItemsToTeleport", "pinnedItems", "Landroidx/compose/foundation/lazy/layout/LazyLayoutPinnedItemList;", "getPinnedItems$foundation_release", "()Landroidx/compose/foundation/lazy/layout/LazyLayoutPinnedItemList;", "placementAnimator", "Landroidx/compose/foundation/lazy/grid/LazyGridItemPlacementAnimator;", "getPlacementAnimator$foundation_release", "()Landroidx/compose/foundation/lazy/grid/LazyGridItemPlacementAnimator;", "placementScopeInvalidator", "Landroidx/compose/foundation/lazy/layout/ObservableScopeInvalidator;", "getPlacementScopeInvalidator-zYiylxw$foundation_release", "()Landroidx/compose/runtime/MutableState;", "Lkotlin/Function1;", "Lkotlin/ParameterName;", "name", "line", "", "Lkotlin/Pair;", "Landroidx/compose/ui/unit/Constraints;", "prefetchInfoRetriever", "getPrefetchInfoRetriever$foundation_release", "()Lkotlin/jvm/functions/Function1;", "setPrefetchInfoRetriever$foundation_release", "(Lkotlin/jvm/functions/Function1;)V", "prefetchInfoRetriever$delegate", "prefetchState", "Landroidx/compose/foundation/lazy/layout/LazyLayoutPrefetchState;", "getPrefetchState$foundation_release", "()Landroidx/compose/foundation/lazy/layout/LazyLayoutPrefetchState;", "prefetchingEnabled", "getPrefetchingEnabled$foundation_release", "setPrefetchingEnabled$foundation_release", "remeasurement", "Landroidx/compose/ui/layout/Remeasurement;", "getRemeasurement$foundation_release", "()Landroidx/compose/ui/layout/Remeasurement;", "setRemeasurement$foundation_release", "(Landroidx/compose/ui/layout/Remeasurement;)V", "remeasurementModifier", "Landroidx/compose/ui/layout/RemeasurementModifier;", "getRemeasurementModifier$foundation_release", "()Landroidx/compose/ui/layout/RemeasurementModifier;", "scrollPosition", "Landroidx/compose/foundation/lazy/grid/LazyGridScrollPosition;", "", "scrollToBeConsumed", "getScrollToBeConsumed$foundation_release", "()F", "scrollableState", "slotsPerLine", "getSlotsPerLine$foundation_release", "setSlotsPerLine$foundation_release", "(I)V", "slotsPerLine$delegate", "Landroidx/compose/runtime/MutableIntState;", "wasScrollingForward", "animateScrollToItem", "", com.google.firebase.analytics.FirebaseAnalytics.Param.INDEX, "scrollOffset", "(IILkotlin/coroutines/Continuation;)Ljava/lang/Object;", "applyMeasureResult", "result", "visibleItemsStayedTheSame", "applyMeasureResult$foundation_release", "cancelPrefetchIfVisibleItemsChanged", "info", "dispatchRawDelta", "delta", "notifyPrefetch", "onScroll", "distance", "onScroll$foundation_release", com.helpshift.proactive.InAppViewConstants.SCROLL, "scrollPriority", "Landroidx/compose/foundation/MutatePriority;", "block", "Lkotlin/Function2;", "Landroidx/compose/foundation/gestures/ScrollScope;", "Lkotlin/coroutines/Continuation;", "", "Lkotlin/ExtensionFunctionType;", "(Landroidx/compose/foundation/MutatePriority;Lkotlin/jvm/functions/Function2;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "scrollToItem", "snapToItemIndexInternal", "snapToItemIndexInternal$foundation_release", "updateScrollPositionIfTheFirstItemWasMoved", "itemProvider", "Landroidx/compose/foundation/lazy/grid/LazyGridItemProvider;", "firstItemIndex", "updateScrollPositionIfTheFirstItemWasMoved$foundation_release", com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.k.M, "foundation_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class LazyGridState implements androidx.compose.foundation.gestures.ScrollableState {
    public static final int $stable = 0;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final androidx.compose.foundation.lazy.grid.LazyGridState.Companion INSTANCE = new androidx.compose.foundation.lazy.grid.LazyGridState.Companion(null);
    private static final androidx.compose.runtime.saveable.Saver<androidx.compose.foundation.lazy.grid.LazyGridState, ?> Saver = androidx.compose.runtime.saveable.ListSaverKt.listSaver(new kotlin.jvm.functions.Function2<androidx.compose.runtime.saveable.SaverScope, androidx.compose.foundation.lazy.grid.LazyGridState, java.util.List<? extends java.lang.Integer>>() { // from class: androidx.compose.foundation.lazy.grid.LazyGridState$Companion$Saver$1
        @Override // kotlin.jvm.functions.Function2
        public final java.util.List<java.lang.Integer> invoke(androidx.compose.runtime.saveable.SaverScope saverScope, androidx.compose.foundation.lazy.grid.LazyGridState lazyGridState) {
            return kotlin.collections.CollectionsKt.listOf((java.lang.Object[]) new java.lang.Integer[]{java.lang.Integer.valueOf(lazyGridState.getFirstVisibleItemIndex()), java.lang.Integer.valueOf(lazyGridState.getFirstVisibleItemScrollOffset())});
        }
    }, new kotlin.jvm.functions.Function1<java.util.List<? extends java.lang.Integer>, androidx.compose.foundation.lazy.grid.LazyGridState>() { // from class: androidx.compose.foundation.lazy.grid.LazyGridState$Companion$Saver$2
        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ androidx.compose.foundation.lazy.grid.LazyGridState invoke(java.util.List<? extends java.lang.Integer> list) {
            return invoke2((java.util.List<java.lang.Integer>) list);
        }

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final androidx.compose.foundation.lazy.grid.LazyGridState invoke2(java.util.List<java.lang.Integer> list) {
            return new androidx.compose.foundation.lazy.grid.LazyGridState(list.get(0).intValue(), list.get(1).intValue());
        }
    });
    private final androidx.compose.foundation.lazy.grid.LazyGridAnimateScrollScope animateScrollScope;
    private final androidx.compose.foundation.lazy.layout.AwaitFirstLayoutModifier awaitLayoutModifier;
    private final androidx.compose.foundation.lazy.layout.LazyLayoutBeyondBoundsInfo beyondBoundsInfo;

    /* renamed from: canScrollBackward$delegate, reason: from kotlin metadata */
    private final androidx.compose.runtime.MutableState canScrollBackward;

    /* renamed from: canScrollForward$delegate, reason: from kotlin metadata */
    private final androidx.compose.runtime.MutableState canScrollForward;
    private final androidx.compose.runtime.collection.MutableVector<androidx.compose.foundation.lazy.layout.LazyLayoutPrefetchState.PrefetchHandle> currentLinePrefetchHandles;
    private androidx.compose.ui.unit.Density density;
    private final androidx.compose.foundation.interaction.MutableInteractionSource internalInteractionSource;
    private boolean isVertical;
    private final androidx.compose.runtime.MutableState<androidx.compose.foundation.lazy.grid.LazyGridMeasureResult> layoutInfoState;
    private int lineToPrefetch;
    private int numMeasurePasses;
    private final androidx.compose.foundation.lazy.layout.LazyLayoutPinnedItemList pinnedItems;
    private final androidx.compose.foundation.lazy.grid.LazyGridItemPlacementAnimator placementAnimator;
    private final androidx.compose.runtime.MutableState<kotlin.Unit> placementScopeInvalidator;

    /* renamed from: prefetchInfoRetriever$delegate, reason: from kotlin metadata */
    private final androidx.compose.runtime.MutableState prefetchInfoRetriever;
    private final androidx.compose.foundation.lazy.layout.LazyLayoutPrefetchState prefetchState;
    private boolean prefetchingEnabled;
    private androidx.compose.ui.layout.Remeasurement remeasurement;
    private final androidx.compose.ui.layout.RemeasurementModifier remeasurementModifier;
    private final androidx.compose.foundation.lazy.grid.LazyGridScrollPosition scrollPosition;
    private float scrollToBeConsumed;
    private final androidx.compose.foundation.gestures.ScrollableState scrollableState;

    /* renamed from: slotsPerLine$delegate, reason: from kotlin metadata */
    private final androidx.compose.runtime.MutableIntState slotsPerLine;
    private boolean wasScrollingForward;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public LazyGridState() {
        this(r2, r2, 3, null);
        int i = 0;
    }

    public LazyGridState(int i, int i2) {
        androidx.compose.foundation.lazy.grid.LazyGridMeasureResult lazyGridMeasureResult;
        androidx.compose.foundation.lazy.grid.LazyGridScrollPosition lazyGridScrollPosition = new androidx.compose.foundation.lazy.grid.LazyGridScrollPosition(i, i2);
        this.scrollPosition = lazyGridScrollPosition;
        lazyGridMeasureResult = androidx.compose.foundation.lazy.grid.LazyGridStateKt.EmptyLazyGridLayoutInfo;
        this.layoutInfoState = androidx.compose.runtime.SnapshotStateKt.mutableStateOf(lazyGridMeasureResult, androidx.compose.runtime.SnapshotStateKt.neverEqualPolicy());
        this.internalInteractionSource = androidx.compose.foundation.interaction.InteractionSourceKt.MutableInteractionSource();
        this.slotsPerLine = androidx.compose.runtime.SnapshotIntStateKt.mutableIntStateOf(0);
        this.density = androidx.compose.ui.unit.DensityKt.Density(1.0f, 1.0f);
        this.isVertical = true;
        this.scrollableState = androidx.compose.foundation.gestures.ScrollableStateKt.ScrollableState(new kotlin.jvm.functions.Function1<java.lang.Float, java.lang.Float>() { // from class: androidx.compose.foundation.lazy.grid.LazyGridState$scrollableState$1
            {
                super(1);
            }

            public final java.lang.Float invoke(float f) {
                return java.lang.Float.valueOf(-androidx.compose.foundation.lazy.grid.LazyGridState.this.onScroll$foundation_release(-f));
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ java.lang.Float invoke(java.lang.Float f) {
                return invoke(f.floatValue());
            }
        });
        this.prefetchingEnabled = true;
        this.lineToPrefetch = -1;
        this.currentLinePrefetchHandles = new androidx.compose.runtime.collection.MutableVector<>(new androidx.compose.foundation.lazy.layout.LazyLayoutPrefetchState.PrefetchHandle[16], 0);
        this.remeasurementModifier = new androidx.compose.ui.layout.RemeasurementModifier() { // from class: androidx.compose.foundation.lazy.grid.LazyGridState$remeasurementModifier$1
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
                androidx.compose.foundation.lazy.grid.LazyGridState.this.setRemeasurement$foundation_release(remeasurement);
            }
        };
        this.awaitLayoutModifier = new androidx.compose.foundation.lazy.layout.AwaitFirstLayoutModifier();
        this.prefetchInfoRetriever = androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(new kotlin.jvm.functions.Function1<java.lang.Integer, java.util.List<? extends kotlin.Pair<? extends java.lang.Integer, ? extends androidx.compose.ui.unit.Constraints>>>() { // from class: androidx.compose.foundation.lazy.grid.LazyGridState$prefetchInfoRetriever$2
            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ java.util.List<? extends kotlin.Pair<? extends java.lang.Integer, ? extends androidx.compose.ui.unit.Constraints>> invoke(java.lang.Integer num) {
                return invoke(num.intValue());
            }

            public final java.util.List<kotlin.Pair<java.lang.Integer, androidx.compose.ui.unit.Constraints>> invoke(int i3) {
                return kotlin.collections.CollectionsKt.emptyList();
            }
        }, null, 2, null);
        this.placementAnimator = new androidx.compose.foundation.lazy.grid.LazyGridItemPlacementAnimator();
        this.beyondBoundsInfo = new androidx.compose.foundation.lazy.layout.LazyLayoutBeyondBoundsInfo();
        this.animateScrollScope = new androidx.compose.foundation.lazy.grid.LazyGridAnimateScrollScope(this);
        this.pinnedItems = new androidx.compose.foundation.lazy.layout.LazyLayoutPinnedItemList();
        lazyGridScrollPosition.getNearestRangeState();
        this.placementScopeInvalidator = androidx.compose.foundation.lazy.layout.ObservableScopeInvalidator.m747constructorimpl$default(null, 1, null);
        this.canScrollForward = androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(false, null, 2, null);
        this.canScrollBackward = androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(false, null, 2, null);
        this.prefetchState = new androidx.compose.foundation.lazy.layout.LazyLayoutPrefetchState();
    }

    public /* synthetic */ LazyGridState(int i, int i2, int i3, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this((i3 & 1) != 0 ? 0 : i, (i3 & 2) != 0 ? 0 : i2);
    }

    public final int getFirstVisibleItemIndex() {
        return this.scrollPosition.getIndex();
    }

    public final int getFirstVisibleItemScrollOffset() {
        return this.scrollPosition.getScrollOffset();
    }

    public final androidx.compose.foundation.lazy.grid.LazyGridLayoutInfo getLayoutInfo() {
        return this.layoutInfoState.getValue();
    }

    public final androidx.compose.foundation.interaction.InteractionSource getInteractionSource() {
        return this.internalInteractionSource;
    }

    /* renamed from: getInternalInteractionSource$foundation_release, reason: from getter */
    public final androidx.compose.foundation.interaction.MutableInteractionSource getInternalInteractionSource() {
        return this.internalInteractionSource;
    }

    /* renamed from: getScrollToBeConsumed$foundation_release, reason: from getter */
    public final float getScrollToBeConsumed() {
        return this.scrollToBeConsumed;
    }

    public final int getSlotsPerLine$foundation_release() {
        return this.slotsPerLine.getIntValue();
    }

    public final void setSlotsPerLine$foundation_release(int i) {
        this.slotsPerLine.setIntValue(i);
    }

    /* renamed from: getDensity$foundation_release, reason: from getter */
    public final androidx.compose.ui.unit.Density getDensity() {
        return this.density;
    }

    public final void setDensity$foundation_release(androidx.compose.ui.unit.Density density) {
        this.density = density;
    }

    /* renamed from: isVertical$foundation_release, reason: from getter */
    public final boolean getIsVertical() {
        return this.isVertical;
    }

    public final void setVertical$foundation_release(boolean z) {
        this.isVertical = z;
    }

    /* renamed from: getNumMeasurePasses$foundation_release, reason: from getter */
    public final int getNumMeasurePasses() {
        return this.numMeasurePasses;
    }

    /* renamed from: getPrefetchingEnabled$foundation_release, reason: from getter */
    public final boolean getPrefetchingEnabled() {
        return this.prefetchingEnabled;
    }

    public final void setPrefetchingEnabled$foundation_release(boolean z) {
        this.prefetchingEnabled = z;
    }

    /* renamed from: getRemeasurement$foundation_release, reason: from getter */
    public final androidx.compose.ui.layout.Remeasurement getRemeasurement() {
        return this.remeasurement;
    }

    public final void setRemeasurement$foundation_release(androidx.compose.ui.layout.Remeasurement remeasurement) {
        this.remeasurement = remeasurement;
    }

    /* renamed from: getRemeasurementModifier$foundation_release, reason: from getter */
    public final androidx.compose.ui.layout.RemeasurementModifier getRemeasurementModifier() {
        return this.remeasurementModifier;
    }

    /* renamed from: getAwaitLayoutModifier$foundation_release, reason: from getter */
    public final androidx.compose.foundation.lazy.layout.AwaitFirstLayoutModifier getAwaitLayoutModifier() {
        return this.awaitLayoutModifier;
    }

    public final kotlin.jvm.functions.Function1<java.lang.Integer, java.util.List<kotlin.Pair<java.lang.Integer, androidx.compose.ui.unit.Constraints>>> getPrefetchInfoRetriever$foundation_release() {
        return (kotlin.jvm.functions.Function1) this.prefetchInfoRetriever.getValue();
    }

    public final void setPrefetchInfoRetriever$foundation_release(kotlin.jvm.functions.Function1<? super java.lang.Integer, ? extends java.util.List<kotlin.Pair<java.lang.Integer, androidx.compose.ui.unit.Constraints>>> function1) {
        this.prefetchInfoRetriever.setValue(function1);
    }

    /* renamed from: getPlacementAnimator$foundation_release, reason: from getter */
    public final androidx.compose.foundation.lazy.grid.LazyGridItemPlacementAnimator getPlacementAnimator() {
        return this.placementAnimator;
    }

    /* renamed from: getBeyondBoundsInfo$foundation_release, reason: from getter */
    public final androidx.compose.foundation.lazy.layout.LazyLayoutBeyondBoundsInfo getBeyondBoundsInfo() {
        return this.beyondBoundsInfo;
    }

    /* renamed from: getPinnedItems$foundation_release, reason: from getter */
    public final androidx.compose.foundation.lazy.layout.LazyLayoutPinnedItemList getPinnedItems() {
        return this.pinnedItems;
    }

    public final kotlin.ranges.IntRange getNearestRange$foundation_release() {
        return this.scrollPosition.getNearestRangeState().getValue();
    }

    /* renamed from: getPlacementScopeInvalidator-zYiylxw$foundation_release, reason: not valid java name */
    public final androidx.compose.runtime.MutableState<kotlin.Unit> m713getPlacementScopeInvalidatorzYiylxw$foundation_release() {
        return this.placementScopeInvalidator;
    }

    public static /* synthetic */ java.lang.Object scrollToItem$default(androidx.compose.foundation.lazy.grid.LazyGridState lazyGridState, int i, int i2, kotlin.coroutines.Continuation continuation, int i3, java.lang.Object obj) {
        if ((i3 & 2) != 0) {
            i2 = 0;
        }
        return lazyGridState.scrollToItem(i, i2, continuation);
    }

    public final java.lang.Object scrollToItem(int i, int i2, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        java.lang.Object scroll$default = androidx.compose.foundation.gestures.ScrollableState.CC.scroll$default(this, null, new androidx.compose.foundation.lazy.grid.LazyGridState$scrollToItem$2(this, i, i2, null), continuation, 1, null);
        return scroll$default == kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED() ? scroll$default : kotlin.Unit.INSTANCE;
    }

    public final void snapToItemIndexInternal$foundation_release(int index, int scrollOffset) {
        this.scrollPosition.requestPosition(index, scrollOffset);
        this.placementAnimator.reset();
        androidx.compose.ui.layout.Remeasurement remeasurement = this.remeasurement;
        if (remeasurement != null) {
            remeasurement.forceRemeasure();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x006c A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0046  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0025  */
    @Override // androidx.compose.foundation.gestures.ScrollableState
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public java.lang.Object scroll(androidx.compose.foundation.MutatePriority mutatePriority, kotlin.jvm.functions.Function2<? super androidx.compose.foundation.gestures.ScrollScope, ? super kotlin.coroutines.Continuation<? super kotlin.Unit>, ? extends java.lang.Object> function2, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        androidx.compose.foundation.lazy.grid.LazyGridState$scroll$1 lazyGridState$scroll$1;
        java.lang.Object coroutine_suspended;
        int i;
        androidx.compose.foundation.lazy.grid.LazyGridState lazyGridState;
        androidx.compose.foundation.gestures.ScrollableState scrollableState;
        if (continuation instanceof androidx.compose.foundation.lazy.grid.LazyGridState$scroll$1) {
            lazyGridState$scroll$1 = (androidx.compose.foundation.lazy.grid.LazyGridState$scroll$1) continuation;
            if ((lazyGridState$scroll$1.label & Integer.MIN_VALUE) != 0) {
                lazyGridState$scroll$1.label -= Integer.MIN_VALUE;
                java.lang.Object obj = lazyGridState$scroll$1.result;
                coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = lazyGridState$scroll$1.label;
                if (i != 0) {
                    kotlin.ResultKt.throwOnFailure(obj);
                    androidx.compose.foundation.lazy.layout.AwaitFirstLayoutModifier awaitFirstLayoutModifier = this.awaitLayoutModifier;
                    lazyGridState$scroll$1.L$0 = this;
                    lazyGridState$scroll$1.L$1 = mutatePriority;
                    lazyGridState$scroll$1.L$2 = function2;
                    lazyGridState$scroll$1.label = 1;
                    if (awaitFirstLayoutModifier.waitForFirstLayout(lazyGridState$scroll$1) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    lazyGridState = this;
                } else {
                    if (i != 1) {
                        if (i != 2) {
                            throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        kotlin.ResultKt.throwOnFailure(obj);
                        return kotlin.Unit.INSTANCE;
                    }
                    function2 = (kotlin.jvm.functions.Function2) lazyGridState$scroll$1.L$2;
                    mutatePriority = (androidx.compose.foundation.MutatePriority) lazyGridState$scroll$1.L$1;
                    lazyGridState = (androidx.compose.foundation.lazy.grid.LazyGridState) lazyGridState$scroll$1.L$0;
                    kotlin.ResultKt.throwOnFailure(obj);
                }
                scrollableState = lazyGridState.scrollableState;
                lazyGridState$scroll$1.L$0 = null;
                lazyGridState$scroll$1.L$1 = null;
                lazyGridState$scroll$1.L$2 = null;
                lazyGridState$scroll$1.label = 2;
                if (scrollableState.scroll(mutatePriority, function2, lazyGridState$scroll$1) == coroutine_suspended) {
                    return coroutine_suspended;
                }
                return kotlin.Unit.INSTANCE;
            }
        }
        lazyGridState$scroll$1 = new androidx.compose.foundation.lazy.grid.LazyGridState$scroll$1(this, continuation);
        java.lang.Object obj2 = lazyGridState$scroll$1.result;
        coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = lazyGridState$scroll$1.label;
        if (i != 0) {
        }
        scrollableState = lazyGridState.scrollableState;
        lazyGridState$scroll$1.L$0 = null;
        lazyGridState$scroll$1.L$1 = null;
        lazyGridState$scroll$1.L$2 = null;
        lazyGridState$scroll$1.label = 2;
        if (scrollableState.scroll(mutatePriority, function2, lazyGridState$scroll$1) == coroutine_suspended) {
        }
        return kotlin.Unit.INSTANCE;
    }

    @Override // androidx.compose.foundation.gestures.ScrollableState
    public float dispatchRawDelta(float delta) {
        return this.scrollableState.dispatchRawDelta(delta);
    }

    @Override // androidx.compose.foundation.gestures.ScrollableState
    public boolean isScrollInProgress() {
        return this.scrollableState.isScrollInProgress();
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

    public final float onScroll$foundation_release(float distance) {
        if ((distance < 0.0f && !getCanScrollForward()) || (distance > 0.0f && !getCanScrollBackward())) {
            return 0.0f;
        }
        if (java.lang.Math.abs(this.scrollToBeConsumed) > 0.5f) {
            throw new java.lang.IllegalStateException(("entered drag with non-zero pending scroll: " + this.scrollToBeConsumed).toString());
        }
        float f = this.scrollToBeConsumed + distance;
        this.scrollToBeConsumed = f;
        if (java.lang.Math.abs(f) > 0.5f) {
            androidx.compose.foundation.lazy.grid.LazyGridMeasureResult value = this.layoutInfoState.getValue();
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

    static /* synthetic */ void notifyPrefetch$default(androidx.compose.foundation.lazy.grid.LazyGridState lazyGridState, float f, androidx.compose.foundation.lazy.grid.LazyGridLayoutInfo lazyGridLayoutInfo, int i, java.lang.Object obj) {
        if ((i & 2) != 0) {
            lazyGridLayoutInfo = lazyGridState.layoutInfoState.getValue();
        }
        lazyGridState.notifyPrefetch(f, lazyGridLayoutInfo);
    }

    private final void notifyPrefetch(float delta, androidx.compose.foundation.lazy.grid.LazyGridLayoutInfo layoutInfo) {
        int row;
        int index;
        androidx.compose.runtime.collection.MutableVector<androidx.compose.foundation.lazy.layout.LazyLayoutPrefetchState.PrefetchHandle> mutableVector;
        int size;
        androidx.compose.foundation.lazy.layout.LazyLayoutPrefetchState lazyLayoutPrefetchState = this.prefetchState;
        if (this.prefetchingEnabled && (!layoutInfo.getVisibleItemsInfo().isEmpty())) {
            boolean z = delta < 0.0f;
            if (z) {
                androidx.compose.foundation.lazy.grid.LazyGridItemInfo lazyGridItemInfo = (androidx.compose.foundation.lazy.grid.LazyGridItemInfo) kotlin.collections.CollectionsKt.last((java.util.List) layoutInfo.getVisibleItemsInfo());
                row = (this.isVertical ? lazyGridItemInfo.getRow() : lazyGridItemInfo.getColumn()) + 1;
                index = ((androidx.compose.foundation.lazy.grid.LazyGridItemInfo) kotlin.collections.CollectionsKt.last((java.util.List) layoutInfo.getVisibleItemsInfo())).getIndex() + 1;
            } else {
                androidx.compose.foundation.lazy.grid.LazyGridItemInfo lazyGridItemInfo2 = (androidx.compose.foundation.lazy.grid.LazyGridItemInfo) kotlin.collections.CollectionsKt.first((java.util.List) layoutInfo.getVisibleItemsInfo());
                row = (this.isVertical ? lazyGridItemInfo2.getRow() : lazyGridItemInfo2.getColumn()) - 1;
                index = ((androidx.compose.foundation.lazy.grid.LazyGridItemInfo) kotlin.collections.CollectionsKt.first((java.util.List) layoutInfo.getVisibleItemsInfo())).getIndex() - 1;
            }
            if (row == this.lineToPrefetch || index < 0 || index >= layoutInfo.getTotalItemsCount()) {
                return;
            }
            if (this.wasScrollingForward != z && (size = (mutableVector = this.currentLinePrefetchHandles).getSize()) > 0) {
                androidx.compose.foundation.lazy.layout.LazyLayoutPrefetchState.PrefetchHandle[] content = mutableVector.getContent();
                int i = 0;
                do {
                    content[i].cancel();
                    i++;
                } while (i < size);
            }
            this.wasScrollingForward = z;
            this.lineToPrefetch = row;
            this.currentLinePrefetchHandles.clear();
            java.util.List<kotlin.Pair<java.lang.Integer, androidx.compose.ui.unit.Constraints>> invoke = getPrefetchInfoRetriever$foundation_release().invoke(java.lang.Integer.valueOf(row));
            int size2 = invoke.size();
            for (int i2 = 0; i2 < size2; i2++) {
                kotlin.Pair<java.lang.Integer, androidx.compose.ui.unit.Constraints> pair = invoke.get(i2);
                this.currentLinePrefetchHandles.add(lazyLayoutPrefetchState.m741schedulePrefetch0kLqBqw(pair.getFirst().intValue(), pair.getSecond().getValue()));
            }
        }
    }

    private final void cancelPrefetchIfVisibleItemsChanged(androidx.compose.foundation.lazy.grid.LazyGridLayoutInfo info) {
        int row;
        if (this.lineToPrefetch == -1 || !(!info.getVisibleItemsInfo().isEmpty())) {
            return;
        }
        if (this.wasScrollingForward) {
            androidx.compose.foundation.lazy.grid.LazyGridItemInfo lazyGridItemInfo = (androidx.compose.foundation.lazy.grid.LazyGridItemInfo) kotlin.collections.CollectionsKt.last((java.util.List) info.getVisibleItemsInfo());
            row = (this.isVertical ? lazyGridItemInfo.getRow() : lazyGridItemInfo.getColumn()) + 1;
        } else {
            androidx.compose.foundation.lazy.grid.LazyGridItemInfo lazyGridItemInfo2 = (androidx.compose.foundation.lazy.grid.LazyGridItemInfo) kotlin.collections.CollectionsKt.first((java.util.List) info.getVisibleItemsInfo());
            row = (this.isVertical ? lazyGridItemInfo2.getRow() : lazyGridItemInfo2.getColumn()) - 1;
        }
        if (this.lineToPrefetch != row) {
            this.lineToPrefetch = -1;
            androidx.compose.runtime.collection.MutableVector<androidx.compose.foundation.lazy.layout.LazyLayoutPrefetchState.PrefetchHandle> mutableVector = this.currentLinePrefetchHandles;
            int size = mutableVector.getSize();
            if (size > 0) {
                androidx.compose.foundation.lazy.layout.LazyLayoutPrefetchState.PrefetchHandle[] content = mutableVector.getContent();
                int i = 0;
                do {
                    content[i].cancel();
                    i++;
                } while (i < size);
            }
            this.currentLinePrefetchHandles.clear();
        }
    }

    /* renamed from: getPrefetchState$foundation_release, reason: from getter */
    public final androidx.compose.foundation.lazy.layout.LazyLayoutPrefetchState getPrefetchState() {
        return this.prefetchState;
    }

    private final int getNumOfItemsToTeleport() {
        return getSlotsPerLine$foundation_release() * 100;
    }

    public static /* synthetic */ java.lang.Object animateScrollToItem$default(androidx.compose.foundation.lazy.grid.LazyGridState lazyGridState, int i, int i2, kotlin.coroutines.Continuation continuation, int i3, java.lang.Object obj) {
        if ((i3 & 2) != 0) {
            i2 = 0;
        }
        return lazyGridState.animateScrollToItem(i, i2, continuation);
    }

    public final java.lang.Object animateScrollToItem(int i, int i2, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        java.lang.Object animateScrollToItem = androidx.compose.foundation.lazy.layout.LazyAnimateScrollKt.animateScrollToItem(this.animateScrollScope, i, i2, getNumOfItemsToTeleport(), this.density, continuation);
        return animateScrollToItem == kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED() ? animateScrollToItem : kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ void applyMeasureResult$foundation_release$default(androidx.compose.foundation.lazy.grid.LazyGridState lazyGridState, androidx.compose.foundation.lazy.grid.LazyGridMeasureResult lazyGridMeasureResult, boolean z, int i, java.lang.Object obj) {
        if ((i & 2) != 0) {
            z = false;
        }
        lazyGridState.applyMeasureResult$foundation_release(lazyGridMeasureResult, z);
    }

    public final void applyMeasureResult$foundation_release(androidx.compose.foundation.lazy.grid.LazyGridMeasureResult result, boolean visibleItemsStayedTheSame) {
        this.scrollToBeConsumed -= result.getConsumedScroll();
        this.layoutInfoState.setValue(result);
        if (visibleItemsStayedTheSame) {
            this.scrollPosition.updateScrollOffset(result.getFirstVisibleLineScrollOffset());
        } else {
            this.scrollPosition.updateFromMeasureResult(result);
            cancelPrefetchIfVisibleItemsChanged(result);
        }
        setCanScrollBackward(result.getCanScrollBackward());
        setCanScrollForward(result.getCanScrollForward());
        this.numMeasurePasses++;
    }

    public final int updateScrollPositionIfTheFirstItemWasMoved$foundation_release(androidx.compose.foundation.lazy.grid.LazyGridItemProvider itemProvider, int firstItemIndex) {
        return this.scrollPosition.updateScrollPositionIfTheFirstItemWasMoved(itemProvider, firstItemIndex);
    }

    /* compiled from: LazyGridState.kt */
    @kotlin.Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u001b\u0010\u0003\u001a\f\u0012\u0004\u0012\u00020\u0005\u0012\u0002\b\u00030\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Landroidx/compose/foundation/lazy/grid/LazyGridState$Companion;", "", "()V", "Saver", "Landroidx/compose/runtime/saveable/Saver;", "Landroidx/compose/foundation/lazy/grid/LazyGridState;", "getSaver", "()Landroidx/compose/runtime/saveable/Saver;", "foundation_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final androidx.compose.runtime.saveable.Saver<androidx.compose.foundation.lazy.grid.LazyGridState, ?> getSaver() {
            return androidx.compose.foundation.lazy.grid.LazyGridState.Saver;
        }
    }
}
