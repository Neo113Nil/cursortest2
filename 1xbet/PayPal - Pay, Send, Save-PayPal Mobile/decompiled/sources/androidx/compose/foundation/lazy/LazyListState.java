package androidx.compose.foundation.lazy;

@kotlin.Metadata(d1 = {"\u0000\u0082\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0011\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u0000 ¸\u00012\u00020\u0001:\u0002¸\u0001B%\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bB%\b\u0016\u0012\u0006\u0010\n\u001a\u00020\t\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0002¢\u0006\u0004\b\u0007\u0010\u000bB\u001d\b\u0016\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0002¢\u0006\u0004\b\u0007\u0010\fJ\u000f\u0010\r\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\r\u0010\u000eJ\"\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u000f\u001a\u00020\u00022\b\b\u0002\u0010\u0010\u001a\u00020\u0002H\u0086@¢\u0006\u0004\b\u0012\u0010\u0013J\u001f\u0010\u0014\u001a\u00020\u00112\u0006\u0010\u000f\u001a\u00020\u00022\b\b\u0002\u0010\u0010\u001a\u00020\u0002¢\u0006\u0004\b\u0014\u0010\fJ'\u0010\u0017\u001a\u00020\u00112\u0006\u0010\u000f\u001a\u00020\u00022\u0006\u0010\u0010\u001a\u00020\u00022\u0006\u0010\u0016\u001a\u00020\u0015H\u0000¢\u0006\u0004\b\u0017\u0010\u0018JA\u0010!\u001a\u00020\u00112\u0006\u0010\u001a\u001a\u00020\u00192'\u0010 \u001a#\b\u0001\u0012\u0004\u0012\u00020\u001c\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00110\u001d\u0012\u0006\u0012\u0004\u0018\u00010\u001e0\u001b¢\u0006\u0002\b\u001fH\u0096@¢\u0006\u0004\b!\u0010\"J\u0017\u0010%\u001a\u00020#2\u0006\u0010$\u001a\u00020#H\u0016¢\u0006\u0004\b%\u0010&J\u0017\u0010(\u001a\u00020#2\u0006\u0010'\u001a\u00020#H\u0000¢\u0006\u0004\b(\u0010&J\u001f\u0010\r\u001a\u00020\u00112\u0006\u0010)\u001a\u00020#2\u0006\u0010+\u001a\u00020*H\u0002¢\u0006\u0004\b\r\u0010,J\"\u0010-\u001a\u00020\u00112\u0006\u0010\u000f\u001a\u00020\u00022\b\b\u0002\u0010\u0010\u001a\u00020\u0002H\u0086@¢\u0006\u0004\b-\u0010\u0013J)\u00102\u001a\u00020\u00112\u0006\u0010/\u001a\u00020.2\u0006\u00100\u001a\u00020\u00152\b\b\u0002\u00101\u001a\u00020\u0015H\u0000¢\u0006\u0004\b2\u00103J\u0017\u00104\u001a\u00020\u00112\u0006\u0010)\u001a\u00020.H\u0002¢\u0006\u0004\b4\u00105J\u001f\u00109\u001a\u00020\u00022\u0006\u00107\u001a\u0002062\u0006\u00108\u001a\u00020\u0002H\u0000¢\u0006\u0004\b9\u0010:R\u001a\u0010\u0006\u001a\u00020\u00058\u0001X\u0080\u0004¢\u0006\f\n\u0004\b\u0006\u0010;\u001a\u0004\b<\u0010=R$\u0010>\u001a\u00020\u00152\u0006\u0010)\u001a\u00020\u00158\u0001@BX\u0081\u000e¢\u0006\f\n\u0004\b>\u0010?\u001a\u0004\b@\u0010AR(\u0010B\u001a\u0004\u0018\u00010.2\b\u0010)\u001a\u0004\u0018\u00010.8\u0001@BX\u0081\u000e¢\u0006\f\n\u0004\bB\u0010C\u001a\u0004\bD\u0010ER\u0016\u0010\r\u001a\u00020\u00158\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b4\u0010?R\u0014\u0010I\u001a\u00020F8\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\bG\u0010HR\u0011\u0010\u0003\u001a\u00020\u00028G¢\u0006\u0006\u001a\u0004\bJ\u0010\u000eR\u0011\u0010\u0004\u001a\u00020\u00028G¢\u0006\u0006\u001a\u0004\bK\u0010\u000eR\u001a\u00104\u001a\b\u0012\u0004\u0012\u00020.0L8\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\bM\u0010NR\u0011\u0010Q\u001a\u00020*8G¢\u0006\u0006\u001a\u0004\bO\u0010PR\u0011\u0010U\u001a\u00020R8G¢\u0006\u0006\u001a\u0004\bS\u0010TR\u001a\u0010W\u001a\u00020V8\u0001X\u0081\u0004¢\u0006\f\n\u0004\bW\u0010X\u001a\u0004\bY\u0010ZR$\u0010[\u001a\u00020#2\u0006\u0010)\u001a\u00020#8\u0001@BX\u0081\u000e¢\u0006\f\n\u0004\b[\u0010\\\u001a\u0004\b]\u0010^R\u0014\u0010b\u001a\u00020_8AX\u0080\u0004¢\u0006\u0006\u001a\u0004\b`\u0010aR\u0014\u0010M\u001a\u00020\u00018\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\bc\u0010dR$\u0010e\u001a\u00020\u00022\u0006\u0010)\u001a\u00020\u00028\u0001@BX\u0081\u000e¢\u0006\f\n\u0004\be\u0010f\u001a\u0004\bg\u0010\u000eR\"\u0010h\u001a\u00020\u00158\u0001@\u0001X\u0081\u000e¢\u0006\u0012\n\u0004\bh\u0010?\u001a\u0004\bi\u0010A\"\u0004\bj\u0010kR(\u0010m\u001a\u0004\u0018\u00010l2\b\u0010)\u001a\u0004\u0018\u00010l8\u0001@BX\u0081\u000e¢\u0006\f\n\u0004\bm\u0010n\u001a\u0004\bo\u0010pR\u001a\u0010r\u001a\u00020q8\u0001X\u0081\u0004¢\u0006\f\n\u0004\br\u0010s\u001a\u0004\bt\u0010uR\u001a\u0010w\u001a\u00020v8\u0001X\u0081\u0004¢\u0006\f\n\u0004\bw\u0010x\u001a\u0004\by\u0010zR!\u0010}\u001a\b\u0012\u0004\u0012\u00020|0{8\u0001X\u0081\u0004¢\u0006\r\n\u0004\b}\u0010~\u001a\u0005\b\u007f\u0010\u0080\u0001R \u0010\u0082\u0001\u001a\u00030\u0081\u00018\u0001X\u0081\u0004¢\u0006\u0010\n\u0006\b\u0082\u0001\u0010\u0083\u0001\u001a\u0006\b\u0084\u0001\u0010\u0085\u0001R(\u0010\u0087\u0001\u001a\u00030\u0086\u00018\u0001X\u0080\u0004¢\u0006\u0018\n\u0006\b\u0087\u0001\u0010\u0088\u0001\u0012\u0006\b\u008b\u0001\u0010\u008c\u0001\u001a\u0006\b\u0089\u0001\u0010\u008a\u0001R\u0017\u0010\u008f\u0001\u001a\u00030\u008d\u00018\u0002X\u0083\u0004¢\u0006\u0007\n\u0005\b\r\u0010\u008e\u0001R\u0018\u0010\u0092\u0001\u001a\u00030\u0090\u00018\u0002X\u0083\u0004¢\u0006\b\n\u0006\b\u008f\u0001\u0010\u0091\u0001R \u0010\u0094\u0001\u001a\u00030\u0093\u00018\u0001X\u0081\u0004¢\u0006\u0010\n\u0006\b\u0094\u0001\u0010\u0095\u0001\u001a\u0006\b\u0096\u0001\u0010\u0097\u0001R\u0019\u0010\u009b\u0001\u001a\u00030\u0098\u00018AX\u0080\u0084\u0002¢\u0006\b\u001a\u0006\b\u0099\u0001\u0010\u009a\u0001R\u001f\u0010\u009d\u0001\u001a\u00030\u009c\u00018\u0001X\u0081\u0004¢\u0006\u000f\n\u0005\b\u009d\u0001\u0010N\u001a\u0006\b\u009e\u0001\u0010\u009f\u0001R\u0016\u0010 \u0001\u001a\u00020\u00158WX\u0096\u0004¢\u0006\u0007\u001a\u0005\b \u0001\u0010AR0\u0010¥\u0001\u001a\u00020\u00152\u0007\u0010¡\u0001\u001a\u00020\u00158W@SX\u0097\u008e\u0002¢\u0006\u0015\n\u0005\b¢\u0001\u0010N\u001a\u0005\b£\u0001\u0010A\"\u0005\b¤\u0001\u0010kR0\u0010©\u0001\u001a\u00020\u00152\u0007\u0010¡\u0001\u001a\u00020\u00158W@SX\u0097\u008e\u0002¢\u0006\u0015\n\u0005\b¦\u0001\u0010N\u001a\u0005\b§\u0001\u0010A\"\u0005\b¨\u0001\u0010kR\u0016\u0010«\u0001\u001a\u00020\u00158WX\u0096\u0004¢\u0006\u0007\u001a\u0005\bª\u0001\u0010AR\u0016\u0010\u00ad\u0001\u001a\u00020\u00158WX\u0096\u0004¢\u0006\u0007\u001a\u0005\b¬\u0001\u0010AR\u001a\u0010±\u0001\u001a\u0005\u0018\u00010®\u00018WX\u0096\u0004¢\u0006\b\u001a\u0006\b¯\u0001\u0010°\u0001R\u001f\u0010²\u0001\u001a\u00030\u009c\u00018\u0001X\u0081\u0004¢\u0006\u000f\n\u0005\b²\u0001\u0010N\u001a\u0006\b³\u0001\u0010\u009f\u0001R\u0016\u0010µ\u0001\u001a\u00020#8AX\u0080\u0004¢\u0006\u0007\u001a\u0005\b´\u0001\u0010^R\u0016\u0010c\u001a\u00030¶\u00018\u0002X\u0083\u0004¢\u0006\u0007\n\u0005\bI\u0010·\u0001"}, d2 = {"Landroidx/compose/foundation/lazy/LazyListState;", "Landroidx/compose/foundation/gestures/ScrollableState;", "", "firstVisibleItemIndex", "firstVisibleItemScrollOffset", "Landroidx/compose/foundation/lazy/LazyListPrefetchStrategy;", "prefetchStrategy", "<init>", "(IILandroidx/compose/foundation/lazy/LazyListPrefetchStrategy;)V", "Landroidx/compose/foundation/lazy/layout/LazyLayoutCacheWindow;", "cacheWindow", "(Landroidx/compose/foundation/lazy/layout/LazyLayoutCacheWindow;II)V", "(II)V", "Camera2StreamConfigurationMap", "()I", "index", "scrollOffset", "", "scrollToItem", "(IILkotlin/coroutines/Continuation;)Ljava/lang/Object;", "requestScrollToItem", "", "forceRemeasure", "snapToItemIndexInternal$foundation", "(IIZ)V", "Landroidx/compose/foundation/MutatePriority;", "scrollPriority", "Lkotlin/Function2;", "Landroidx/compose/foundation/gestures/ScrollScope;", "Lkotlin/coroutines/Continuation;", "", "Lkotlin/ExtensionFunctionType;", "block", "scroll", "(Landroidx/compose/foundation/MutatePriority;Lkotlin/jvm/functions/Function2;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "", "delta", "dispatchRawDelta", "(F)F", "distance", "onScroll$foundation", "p0", "Landroidx/compose/foundation/lazy/LazyListLayoutInfo;", "p1", "(FLandroidx/compose/foundation/lazy/LazyListLayoutInfo;)V", "animateScrollToItem", "Landroidx/compose/foundation/lazy/LazyListMeasureResult;", "result", "isLookingAhead", "visibleItemsStayedTheSame", "applyMeasureResult$foundation", "(Landroidx/compose/foundation/lazy/LazyListMeasureResult;ZZ)V", "getHighSpeedVideoFpsRanges", "(Landroidx/compose/foundation/lazy/LazyListMeasureResult;)V", "Landroidx/compose/foundation/lazy/LazyListItemProvider;", "itemProvider", "firstItemIndex", "updateScrollPositionIfTheFirstItemWasMoved$foundation", "(Landroidx/compose/foundation/lazy/LazyListItemProvider;I)I", "Landroidx/compose/foundation/lazy/LazyListPrefetchStrategy;", "getPrefetchStrategy$foundation", "()Landroidx/compose/foundation/lazy/LazyListPrefetchStrategy;", "hasLookaheadOccurred", "Z", "getHasLookaheadOccurred$foundation", "()Z", "approachLayoutInfo", "Landroidx/compose/foundation/lazy/LazyListMeasureResult;", "getApproachLayoutInfo$foundation", "()Landroidx/compose/foundation/lazy/LazyListMeasureResult;", "Landroidx/compose/foundation/lazy/LazyListScrollPosition;", "getHighSpeedVideoSizesFor", "Landroidx/compose/foundation/lazy/LazyListScrollPosition;", "getHighSpeedVideoFpsRangesFor", "getFirstVisibleItemIndex", "getFirstVisibleItemScrollOffset", "Landroidx/compose/runtime/MutableState;", "getHighSpeedVideoSizes", "Landroidx/compose/runtime/MutableState;", "getLayoutInfo", "()Landroidx/compose/foundation/lazy/LazyListLayoutInfo;", "layoutInfo", "Landroidx/compose/foundation/interaction/InteractionSource;", "getInteractionSource", "()Landroidx/compose/foundation/interaction/InteractionSource;", "interactionSource", "Landroidx/compose/foundation/interaction/MutableInteractionSource;", "internalInteractionSource", "Landroidx/compose/foundation/interaction/MutableInteractionSource;", "getInternalInteractionSource$foundation", "()Landroidx/compose/foundation/interaction/MutableInteractionSource;", "scrollToBeConsumed", com.adobe.marketing.mobile.internal.CoreConstants.Wrapper.Type.FLUTTER, "getScrollToBeConsumed$foundation", "()F", "Landroidx/compose/ui/unit/Density;", "getDensity$foundation", "()Landroidx/compose/ui/unit/Density;", "density", "getOutputMinFrameDuration", "Landroidx/compose/foundation/gestures/ScrollableState;", "numMeasurePasses", com.visa.cbp.getEncExpo.warmup, "getNumMeasurePasses$foundation", "prefetchingEnabled", "getPrefetchingEnabled$foundation", "setPrefetchingEnabled$foundation", "(Z)V", "Landroidx/compose/ui/layout/Remeasurement;", "remeasurement", "Landroidx/compose/ui/layout/Remeasurement;", "getRemeasurement$foundation", "()Landroidx/compose/ui/layout/Remeasurement;", "Landroidx/compose/ui/layout/RemeasurementModifier;", "remeasurementModifier", "Landroidx/compose/ui/layout/RemeasurementModifier;", "getRemeasurementModifier$foundation", "()Landroidx/compose/ui/layout/RemeasurementModifier;", "Landroidx/compose/foundation/lazy/layout/AwaitFirstLayoutModifier;", "awaitLayoutModifier", "Landroidx/compose/foundation/lazy/layout/AwaitFirstLayoutModifier;", "getAwaitLayoutModifier$foundation", "()Landroidx/compose/foundation/lazy/layout/AwaitFirstLayoutModifier;", "Landroidx/compose/foundation/lazy/layout/LazyLayoutItemAnimator;", "Landroidx/compose/foundation/lazy/LazyListMeasuredItem;", "itemAnimator", "Landroidx/compose/foundation/lazy/layout/LazyLayoutItemAnimator;", "getItemAnimator$foundation", "()Landroidx/compose/foundation/lazy/layout/LazyLayoutItemAnimator;", "Landroidx/compose/foundation/lazy/layout/LazyLayoutBeyondBoundsInfo;", "beyondBoundsInfo", "Landroidx/compose/foundation/lazy/layout/LazyLayoutBeyondBoundsInfo;", "getBeyondBoundsInfo$foundation", "()Landroidx/compose/foundation/lazy/layout/LazyLayoutBeyondBoundsInfo;", "Landroidx/compose/foundation/lazy/layout/LazyLayoutPrefetchState;", "prefetchState", "Landroidx/compose/foundation/lazy/layout/LazyLayoutPrefetchState;", "getPrefetchState$foundation", "()Landroidx/compose/foundation/lazy/layout/LazyLayoutPrefetchState;", "getPrefetchState$foundation$annotations", "()V", "Landroidx/compose/foundation/lazy/LazyListPrefetchScope;", "Landroidx/compose/foundation/lazy/LazyListPrefetchScope;", "getHighResolutionOutputSizeshNQ4ISI", "Landroidx/compose/foundation/lazy/LazyListState$_scrollIndicatorState$1;", "Landroidx/compose/foundation/lazy/LazyListState$_scrollIndicatorState$1;", "getOutputFormats", "Landroidx/compose/foundation/lazy/layout/LazyLayoutPinnedItemList;", "pinnedItems", "Landroidx/compose/foundation/lazy/layout/LazyLayoutPinnedItemList;", "getPinnedItems$foundation", "()Landroidx/compose/foundation/lazy/layout/LazyLayoutPinnedItemList;", "Lkotlin/ranges/IntRange;", "getNearestRange$foundation", "()Lkotlin/ranges/IntRange;", "nearestRange", "Landroidx/compose/foundation/lazy/layout/ObservableScopeInvalidator;", "measurementScopeInvalidator", "getMeasurementScopeInvalidator-zYiylxw$foundation", "()Landroidx/compose/runtime/MutableState;", "isScrollInProgress", "<set-?>", "canScrollForward$delegate", "getCanScrollForward", "setCanScrollForward", "canScrollForward", "canScrollBackward$delegate", "getCanScrollBackward", "setCanScrollBackward", "canScrollBackward", "getLastScrolledForward", "lastScrolledForward", "getLastScrolledBackward", "lastScrolledBackward", "Landroidx/compose/foundation/ScrollIndicatorState;", "getScrollIndicatorState", "()Landroidx/compose/foundation/ScrollIndicatorState;", "scrollIndicatorState", "placementScopeInvalidator", "getPlacementScopeInvalidator-zYiylxw$foundation", "getScrollDeltaBetweenPasses$foundation", "scrollDeltaBetweenPasses", "Landroidx/compose/foundation/lazy/layout/LazyLayoutScrollDeltaBetweenPasses;", "Landroidx/compose/foundation/lazy/layout/LazyLayoutScrollDeltaBetweenPasses;", "Companion"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes.dex */
public final class LazyListState implements androidx.compose.foundation.gestures.ScrollableState {
    public static final int $stable = 0;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final androidx.compose.foundation.lazy.LazyListState.Companion INSTANCE = new androidx.compose.foundation.lazy.LazyListState.Companion(null);
    private static final androidx.compose.runtime.saveable.Saver<androidx.compose.foundation.lazy.LazyListState, ?> Saver = androidx.compose.runtime.saveable.ListSaverKt.listSaver(new kotlin.jvm.functions.Function2() { // from class: androidx.compose.foundation.lazy.LazyListState$$ExternalSyntheticLambda0
        @Override // kotlin.jvm.functions.Function2
        public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
            java.util.List highResolutionOutputSizeshNQ4ISI;
            highResolutionOutputSizeshNQ4ISI = androidx.compose.foundation.lazy.LazyListState.getHighResolutionOutputSizeshNQ4ISI((androidx.compose.foundation.lazy.LazyListState) obj2);
            return highResolutionOutputSizeshNQ4ISI;
        }
    }, new kotlin.jvm.functions.Function1() { // from class: androidx.compose.foundation.lazy.LazyListState$$ExternalSyntheticLambda1
        @Override // kotlin.jvm.functions.Function1
        public final java.lang.Object invoke(java.lang.Object obj) {
            androidx.compose.foundation.lazy.LazyListState highSpeedVideoFpsRanges;
            highSpeedVideoFpsRanges = androidx.compose.foundation.lazy.LazyListState.getHighSpeedVideoFpsRanges((java.util.List) obj);
            return highSpeedVideoFpsRanges;
        }
    });

    /* renamed from: Camera2StreamConfigurationMap, reason: from kotlin metadata */
    private final androidx.compose.foundation.lazy.LazyListPrefetchScope getHighResolutionOutputSizeshNQ4ISI;
    private androidx.compose.foundation.lazy.LazyListMeasureResult approachLayoutInfo;
    private final androidx.compose.foundation.lazy.layout.AwaitFirstLayoutModifier awaitLayoutModifier;
    private final androidx.compose.foundation.lazy.layout.LazyLayoutBeyondBoundsInfo beyondBoundsInfo;

    /* renamed from: canScrollBackward$delegate, reason: from kotlin metadata */
    private final androidx.compose.runtime.MutableState canScrollBackward;

    /* renamed from: canScrollForward$delegate, reason: from kotlin metadata */
    private final androidx.compose.runtime.MutableState canScrollForward;

    /* renamed from: getHighResolutionOutputSizeshNQ4ISI, reason: from kotlin metadata */
    private final androidx.compose.foundation.lazy.LazyListState$_scrollIndicatorState$1 getOutputFormats;

    /* renamed from: getHighSpeedVideoFpsRanges, reason: from kotlin metadata */
    private boolean Camera2StreamConfigurationMap;

    /* renamed from: getHighSpeedVideoFpsRangesFor, reason: from kotlin metadata */
    private final androidx.compose.foundation.lazy.layout.LazyLayoutScrollDeltaBetweenPasses getOutputMinFrameDuration;

    /* renamed from: getHighSpeedVideoSizes, reason: from kotlin metadata */
    private final androidx.compose.runtime.MutableState<androidx.compose.foundation.lazy.LazyListMeasureResult> getHighSpeedVideoFpsRanges;

    /* renamed from: getHighSpeedVideoSizesFor, reason: from kotlin metadata */
    private final androidx.compose.foundation.lazy.LazyListScrollPosition getHighSpeedVideoFpsRangesFor;

    /* renamed from: getOutputMinFrameDuration, reason: from kotlin metadata */
    private final androidx.compose.foundation.gestures.ScrollableState getHighSpeedVideoSizes;
    private boolean hasLookaheadOccurred;
    private final androidx.compose.foundation.interaction.MutableInteractionSource internalInteractionSource;
    private final androidx.compose.foundation.lazy.layout.LazyLayoutItemAnimator<androidx.compose.foundation.lazy.LazyListMeasuredItem> itemAnimator;
    private final androidx.compose.runtime.MutableState<kotlin.Unit> measurementScopeInvalidator;
    private int numMeasurePasses;
    private final androidx.compose.foundation.lazy.layout.LazyLayoutPinnedItemList pinnedItems;
    private final androidx.compose.runtime.MutableState<kotlin.Unit> placementScopeInvalidator;
    private final androidx.compose.foundation.lazy.layout.LazyLayoutPrefetchState prefetchState;
    private final androidx.compose.foundation.lazy.LazyListPrefetchStrategy prefetchStrategy;
    private boolean prefetchingEnabled;
    private androidx.compose.ui.layout.Remeasurement remeasurement;
    private final androidx.compose.ui.layout.RemeasurementModifier remeasurementModifier;
    private float scrollToBeConsumed;

    public static /* synthetic */ void getPrefetchState$foundation$annotations() {
    }

    /* JADX WARN: Type inference failed for: r4v3, types: [androidx.compose.foundation.lazy.LazyListState$_scrollIndicatorState$1] */
    public LazyListState(final int i, int i2, androidx.compose.foundation.lazy.LazyListPrefetchStrategy lazyListPrefetchStrategy) {
        androidx.compose.foundation.lazy.LazyListMeasureResult lazyListMeasureResult;
        this.prefetchStrategy = lazyListPrefetchStrategy;
        androidx.compose.foundation.lazy.LazyListScrollPosition lazyListScrollPosition = new androidx.compose.foundation.lazy.LazyListScrollPosition(i, i2);
        this.getHighSpeedVideoFpsRangesFor = lazyListScrollPosition;
        lazyListMeasureResult = androidx.compose.foundation.lazy.LazyListStateKt.getHighResolutionOutputSizeshNQ4ISI;
        this.getHighSpeedVideoFpsRanges = androidx.compose.runtime.SnapshotStateKt.mutableStateOf(lazyListMeasureResult, androidx.compose.runtime.SnapshotStateKt.neverEqualPolicy());
        this.internalInteractionSource = androidx.compose.foundation.interaction.InteractionSourceKt.MutableInteractionSource();
        this.getHighSpeedVideoSizes = androidx.compose.foundation.gestures.ScrollableStateKt.ScrollableState(new kotlin.jvm.functions.Function1() { // from class: androidx.compose.foundation.lazy.LazyListState$$ExternalSyntheticLambda2
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                float Camera2StreamConfigurationMap;
                Camera2StreamConfigurationMap = androidx.compose.foundation.lazy.LazyListState.Camera2StreamConfigurationMap(androidx.compose.foundation.lazy.LazyListState.this, ((java.lang.Float) obj).floatValue());
                return java.lang.Float.valueOf(Camera2StreamConfigurationMap);
            }
        });
        this.prefetchingEnabled = true;
        this.remeasurementModifier = new androidx.compose.ui.layout.RemeasurementModifier() { // from class: androidx.compose.foundation.lazy.LazyListState$remeasurementModifier$1
            @Override // androidx.compose.ui.layout.RemeasurementModifier
            public final void onRemeasurementAvailable(androidx.compose.ui.layout.Remeasurement remeasurement) {
                androidx.compose.foundation.lazy.LazyListState.this.remeasurement = remeasurement;
            }
        };
        this.awaitLayoutModifier = new androidx.compose.foundation.lazy.layout.AwaitFirstLayoutModifier();
        this.itemAnimator = new androidx.compose.foundation.lazy.layout.LazyLayoutItemAnimator<>();
        this.beyondBoundsInfo = new androidx.compose.foundation.lazy.layout.LazyLayoutBeyondBoundsInfo();
        this.prefetchState = new androidx.compose.foundation.lazy.layout.LazyLayoutPrefetchState(lazyListPrefetchStrategy.getPrefetchScheduler(), new kotlin.jvm.functions.Function1() { // from class: androidx.compose.foundation.lazy.LazyListState$$ExternalSyntheticLambda3
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                kotlin.Unit highSpeedVideoSizes;
                highSpeedVideoSizes = androidx.compose.foundation.lazy.LazyListState.getHighSpeedVideoSizes(androidx.compose.foundation.lazy.LazyListState.this, i, (androidx.compose.foundation.lazy.layout.NestedPrefetchScope) obj);
                return highSpeedVideoSizes;
            }
        });
        this.getHighResolutionOutputSizeshNQ4ISI = new androidx.compose.foundation.lazy.LazyListState$prefetchScope$1(this);
        this.getOutputFormats = new androidx.compose.foundation.ScrollIndicatorState() { // from class: androidx.compose.foundation.lazy.LazyListState$_scrollIndicatorState$1
            @Override // androidx.compose.foundation.ScrollIndicatorState
            public final int getScrollOffset() {
                int Camera2StreamConfigurationMap;
                Camera2StreamConfigurationMap = androidx.compose.foundation.lazy.LazyListState.this.Camera2StreamConfigurationMap();
                return Camera2StreamConfigurationMap;
            }

            @Override // androidx.compose.foundation.ScrollIndicatorState
            public final int getContentSize() {
                return androidx.compose.foundation.lazy.LazyListLayoutInfoKt.calculateContentSize(androidx.compose.foundation.lazy.LazyListState.this.getLayoutInfo());
            }

            @Override // androidx.compose.foundation.ScrollIndicatorState
            public final int getViewportSize() {
                return androidx.compose.foundation.lazy.LazyListLayoutInfoKt.getSingleAxisViewportSize(androidx.compose.foundation.lazy.LazyListState.this.getLayoutInfo());
            }
        };
        this.pinnedItems = new androidx.compose.foundation.lazy.layout.LazyLayoutPinnedItemList();
        lazyListScrollPosition.getNearestRangeState();
        this.measurementScopeInvalidator = androidx.compose.foundation.lazy.layout.ObservableScopeInvalidator.m1872constructorimpl$default(null, 1, null);
        java.lang.Boolean bool = java.lang.Boolean.FALSE;
        this.canScrollForward = androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(bool, null, 2, null);
        this.canScrollBackward = androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(bool, null, 2, null);
        this.placementScopeInvalidator = androidx.compose.foundation.lazy.layout.ObservableScopeInvalidator.m1872constructorimpl$default(null, 1, null);
        this.getOutputMinFrameDuration = new androidx.compose.foundation.lazy.layout.LazyLayoutScrollDeltaBetweenPasses();
    }

    public /* synthetic */ LazyListState(int i, int i2, androidx.compose.foundation.lazy.LazyListPrefetchStrategy lazyListPrefetchStrategy, int i3, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this((i3 & 1) != 0 ? 0 : i, (i3 & 2) != 0 ? 0 : i2, (i3 & 4) != 0 ? androidx.compose.foundation.lazy.LazyListPrefetchStrategyKt.LazyListPrefetchStrategy$default(0, 1, null) : lazyListPrefetchStrategy);
    }

    /* renamed from: getPrefetchStrategy$foundation, reason: from getter */
    public final androidx.compose.foundation.lazy.LazyListPrefetchStrategy getPrefetchStrategy() {
        return this.prefetchStrategy;
    }

    public /* synthetic */ LazyListState(androidx.compose.foundation.lazy.layout.LazyLayoutCacheWindow lazyLayoutCacheWindow, int i, int i2, int i3, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this(lazyLayoutCacheWindow, (i3 & 2) != 0 ? 0 : i, (i3 & 4) != 0 ? 0 : i2);
    }

    public LazyListState(androidx.compose.foundation.lazy.layout.LazyLayoutCacheWindow lazyLayoutCacheWindow, int i, int i2) {
        this(i, i2, new androidx.compose.foundation.lazy.LazyListCacheWindowStrategy(lazyLayoutCacheWindow));
    }

    public /* synthetic */ LazyListState(int i, int i2, int i3, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this((i3 & 1) != 0 ? 0 : i, (i3 & 2) != 0 ? 0 : i2);
    }

    public LazyListState(int i, int i2) {
        this(i, i2, androidx.compose.foundation.lazy.LazyListPrefetchStrategyKt.LazyListPrefetchStrategy$default(0, 1, null));
    }

    /* renamed from: getHasLookaheadOccurred$foundation, reason: from getter */
    public final boolean getHasLookaheadOccurred() {
        return this.hasLookaheadOccurred;
    }

    /* renamed from: getApproachLayoutInfo$foundation, reason: from getter */
    public final androidx.compose.foundation.lazy.LazyListMeasureResult getApproachLayoutInfo() {
        return this.approachLayoutInfo;
    }

    public final int getFirstVisibleItemIndex() {
        return this.getHighSpeedVideoFpsRangesFor.getIndex();
    }

    public final int getFirstVisibleItemScrollOffset() {
        return this.getHighSpeedVideoFpsRangesFor.getScrollOffset();
    }

    public final androidx.compose.foundation.lazy.LazyListLayoutInfo getLayoutInfo() {
        return this.getHighSpeedVideoFpsRanges.getValue();
    }

    public final androidx.compose.foundation.interaction.InteractionSource getInteractionSource() {
        return this.internalInteractionSource;
    }

    /* renamed from: getInternalInteractionSource$foundation, reason: from getter */
    public final androidx.compose.foundation.interaction.MutableInteractionSource getInternalInteractionSource() {
        return this.internalInteractionSource;
    }

    /* renamed from: getScrollToBeConsumed$foundation, reason: from getter */
    public final float getScrollToBeConsumed() {
        return this.scrollToBeConsumed;
    }

    public final androidx.compose.ui.unit.Density getDensity$foundation() {
        return this.getHighSpeedVideoFpsRanges.getValue().getDensity();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final float Camera2StreamConfigurationMap(androidx.compose.foundation.lazy.LazyListState lazyListState, float f) {
        return -lazyListState.onScroll$foundation(-f);
    }

    /* renamed from: getNumMeasurePasses$foundation, reason: from getter */
    public final int getNumMeasurePasses() {
        return this.numMeasurePasses;
    }

    /* renamed from: getPrefetchingEnabled$foundation, reason: from getter */
    public final boolean getPrefetchingEnabled() {
        return this.prefetchingEnabled;
    }

    public final void setPrefetchingEnabled$foundation(boolean z) {
        this.prefetchingEnabled = z;
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

    public final androidx.compose.foundation.lazy.layout.LazyLayoutItemAnimator<androidx.compose.foundation.lazy.LazyListMeasuredItem> getItemAnimator$foundation() {
        return this.itemAnimator;
    }

    /* renamed from: getBeyondBoundsInfo$foundation, reason: from getter */
    public final androidx.compose.foundation.lazy.layout.LazyLayoutBeyondBoundsInfo getBeyondBoundsInfo() {
        return this.beyondBoundsInfo;
    }

    /* renamed from: getPrefetchState$foundation, reason: from getter */
    public final androidx.compose.foundation.lazy.layout.LazyLayoutPrefetchState getPrefetchState() {
        return this.prefetchState;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final kotlin.Unit getHighSpeedVideoSizes(androidx.compose.foundation.lazy.LazyListState lazyListState, int i, androidx.compose.foundation.lazy.layout.NestedPrefetchScope nestedPrefetchScope) {
        androidx.compose.foundation.lazy.LazyListPrefetchStrategy lazyListPrefetchStrategy = lazyListState.prefetchStrategy;
        androidx.compose.runtime.snapshots.Snapshot.Companion companion = androidx.compose.runtime.snapshots.Snapshot.INSTANCE;
        androidx.compose.runtime.snapshots.Snapshot currentThreadSnapshot = companion.getCurrentThreadSnapshot();
        companion.restoreNonObservable(currentThreadSnapshot, companion.makeCurrentNonObservable(currentThreadSnapshot), currentThreadSnapshot != null ? currentThreadSnapshot.getReadObserver() : null);
        lazyListPrefetchStrategy.onNestedPrefetch(nestedPrefetchScope, i);
        return kotlin.Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final int Camera2StreamConfigurationMap() {
        return (androidx.compose.foundation.lazy.LazyListLayoutInfoKt.visibleItemsAverageSize(getLayoutInfo()) * getFirstVisibleItemIndex()) + getFirstVisibleItemScrollOffset();
    }

    /* renamed from: getPinnedItems$foundation, reason: from getter */
    public final androidx.compose.foundation.lazy.layout.LazyLayoutPinnedItemList getPinnedItems() {
        return this.pinnedItems;
    }

    public final kotlin.ranges.IntRange getNearestRange$foundation() {
        return this.getHighSpeedVideoFpsRangesFor.getNearestRangeState().getValue();
    }

    public static /* synthetic */ java.lang.Object scrollToItem$default(androidx.compose.foundation.lazy.LazyListState lazyListState, int i, int i2, kotlin.coroutines.Continuation continuation, int i3, java.lang.Object obj) {
        if ((i3 & 2) != 0) {
            i2 = 0;
        }
        return lazyListState.scrollToItem(i, i2, continuation);
    }

    public final java.lang.Object scrollToItem(int i, int i2, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        java.lang.Object scroll$default = androidx.compose.foundation.gestures.ScrollableState.scroll$default(this, null, new androidx.compose.foundation.lazy.LazyListState$scrollToItem$2(this, i, i2, null), continuation, 1, null);
        return scroll$default == kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED() ? scroll$default : kotlin.Unit.INSTANCE;
    }

    /* renamed from: getMeasurementScopeInvalidator-zYiylxw$foundation, reason: not valid java name */
    public final androidx.compose.runtime.MutableState<kotlin.Unit> m1801getMeasurementScopeInvalidatorzYiylxw$foundation() {
        return this.measurementScopeInvalidator;
    }

    public static /* synthetic */ void requestScrollToItem$default(androidx.compose.foundation.lazy.LazyListState lazyListState, int i, int i2, int i3, java.lang.Object obj) {
        if ((i3 & 2) != 0) {
            i2 = 0;
        }
        lazyListState.requestScrollToItem(i, i2);
    }

    public final void requestScrollToItem(int index, int scrollOffset) {
        if (isScrollInProgress()) {
            kotlinx.coroutines.BuildersKt__Builders_commonKt.launch$default(this.getHighSpeedVideoFpsRanges.getValue().getCoroutineScope(), null, null, new androidx.compose.foundation.lazy.LazyListState$requestScrollToItem$1(this, null), 3, null);
        }
        snapToItemIndexInternal$foundation(index, scrollOffset, false);
    }

    public final void snapToItemIndexInternal$foundation(int index, int scrollOffset, boolean forceRemeasure) {
        if (this.getHighSpeedVideoFpsRangesFor.getIndex() != index || this.getHighSpeedVideoFpsRangesFor.getScrollOffset() != scrollOffset) {
            this.itemAnimator.reset();
            java.lang.Object obj = this.prefetchStrategy;
            androidx.compose.foundation.lazy.layout.CacheWindowLogic cacheWindowLogic = obj instanceof androidx.compose.foundation.lazy.layout.CacheWindowLogic ? (androidx.compose.foundation.lazy.layout.CacheWindowLogic) obj : null;
            if (cacheWindowLogic != null) {
                cacheWindowLogic.resetStrategy();
            }
        }
        this.getHighSpeedVideoFpsRangesFor.requestPositionAndForgetLastKnownKey(index, scrollOffset);
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
        androidx.compose.foundation.lazy.LazyListState$scroll$1 lazyListState$scroll$1;
        int i;
        androidx.compose.foundation.lazy.LazyListMeasureResult lazyListMeasureResult;
        if (continuation instanceof androidx.compose.foundation.lazy.LazyListState$scroll$1) {
            lazyListState$scroll$1 = (androidx.compose.foundation.lazy.LazyListState$scroll$1) continuation;
            if ((lazyListState$scroll$1.getHighSpeedVideoFpsRangesFor & Integer.MIN_VALUE) != 0) {
                lazyListState$scroll$1.getHighSpeedVideoFpsRangesFor -= 2147483648;
                java.lang.Object obj = lazyListState$scroll$1.getHighSpeedVideoFpsRanges;
                java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = lazyListState$scroll$1.getHighSpeedVideoFpsRangesFor;
                if (i != 0) {
                    kotlin.ResultKt.throwOnFailure(obj);
                    androidx.compose.foundation.lazy.LazyListMeasureResult value = this.getHighSpeedVideoFpsRanges.getValue();
                    lazyListMeasureResult = androidx.compose.foundation.lazy.LazyListStateKt.getHighResolutionOutputSizeshNQ4ISI;
                    if (value == lazyListMeasureResult) {
                        androidx.compose.foundation.lazy.layout.AwaitFirstLayoutModifier awaitFirstLayoutModifier = this.awaitLayoutModifier;
                        lazyListState$scroll$1.getHighResolutionOutputSizeshNQ4ISI = mutatePriority;
                        lazyListState$scroll$1.Camera2StreamConfigurationMap = function2;
                        lazyListState$scroll$1.getHighSpeedVideoFpsRangesFor = 1;
                    }
                } else {
                    if (i != 1) {
                        if (i != 2) {
                            throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        kotlin.ResultKt.throwOnFailure(obj);
                        return kotlin.Unit.INSTANCE;
                    }
                    function2 = (kotlin.jvm.functions.Function2) lazyListState$scroll$1.Camera2StreamConfigurationMap;
                    mutatePriority = (androidx.compose.foundation.MutatePriority) lazyListState$scroll$1.getHighResolutionOutputSizeshNQ4ISI;
                    kotlin.ResultKt.throwOnFailure(obj);
                }
                androidx.compose.foundation.gestures.ScrollableState scrollableState = this.getHighSpeedVideoSizes;
                lazyListState$scroll$1.getHighResolutionOutputSizeshNQ4ISI = null;
                lazyListState$scroll$1.Camera2StreamConfigurationMap = null;
                lazyListState$scroll$1.getHighSpeedVideoFpsRangesFor = 2;
            }
        }
        lazyListState$scroll$1 = new androidx.compose.foundation.lazy.LazyListState$scroll$1(this, continuation);
        java.lang.Object obj2 = lazyListState$scroll$1.getHighSpeedVideoFpsRanges;
        java.lang.Object coroutine_suspended2 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = lazyListState$scroll$1.getHighSpeedVideoFpsRangesFor;
        if (i != 0) {
        }
        androidx.compose.foundation.gestures.ScrollableState scrollableState2 = this.getHighSpeedVideoSizes;
        lazyListState$scroll$1.getHighResolutionOutputSizeshNQ4ISI = null;
        lazyListState$scroll$1.Camera2StreamConfigurationMap = null;
        lazyListState$scroll$1.getHighSpeedVideoFpsRangesFor = 2;
    }

    @Override // androidx.compose.foundation.gestures.ScrollableState
    public final float dispatchRawDelta(float delta) {
        return this.getHighSpeedVideoSizes.dispatchRawDelta(delta);
    }

    @Override // androidx.compose.foundation.gestures.ScrollableState
    public final boolean isScrollInProgress() {
        return this.getHighSpeedVideoSizes.isScrollInProgress();
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
        return this.getHighSpeedVideoSizes.getLastScrolledForward();
    }

    @Override // androidx.compose.foundation.gestures.ScrollableState
    public final boolean getLastScrolledBackward() {
        return this.getHighSpeedVideoSizes.getLastScrolledBackward();
    }

    @Override // androidx.compose.foundation.gestures.ScrollableState
    public final androidx.compose.foundation.ScrollIndicatorState getScrollIndicatorState() {
        return this.getOutputFormats;
    }

    /* renamed from: getPlacementScopeInvalidator-zYiylxw$foundation, reason: not valid java name */
    public final androidx.compose.runtime.MutableState<kotlin.Unit> m1802getPlacementScopeInvalidatorzYiylxw$foundation() {
        return this.placementScopeInvalidator;
    }

    public final float onScroll$foundation(float distance) {
        androidx.compose.foundation.lazy.LazyListMeasureResult lazyListMeasureResult;
        if ((distance < 0.0f && !getCanScrollForward()) || (distance > 0.0f && !getCanScrollBackward())) {
            return 0.0f;
        }
        if (java.lang.Math.abs(this.scrollToBeConsumed) > 0.5f) {
            androidx.compose.foundation.internal.InlineClassHelperKt.throwIllegalStateException("entered drag with non-zero pending scroll");
        }
        this.Camera2StreamConfigurationMap = true;
        float f = this.scrollToBeConsumed + distance;
        this.scrollToBeConsumed = f;
        if (java.lang.Math.abs(f) > 0.5f) {
            float f2 = this.scrollToBeConsumed;
            int round = java.lang.Math.round(f2);
            androidx.compose.foundation.lazy.LazyListMeasureResult copyWithScrollDeltaWithoutRemeasure = this.getHighSpeedVideoFpsRanges.getValue().copyWithScrollDeltaWithoutRemeasure(round, !this.hasLookaheadOccurred);
            if (copyWithScrollDeltaWithoutRemeasure != null && (lazyListMeasureResult = this.approachLayoutInfo) != null) {
                androidx.compose.foundation.lazy.LazyListMeasureResult copyWithScrollDeltaWithoutRemeasure2 = lazyListMeasureResult != null ? lazyListMeasureResult.copyWithScrollDeltaWithoutRemeasure(round, true) : null;
                if (copyWithScrollDeltaWithoutRemeasure2 != null) {
                    this.approachLayoutInfo = copyWithScrollDeltaWithoutRemeasure2;
                } else {
                    copyWithScrollDeltaWithoutRemeasure = null;
                }
            }
            if (copyWithScrollDeltaWithoutRemeasure != null) {
                applyMeasureResult$foundation(copyWithScrollDeltaWithoutRemeasure, this.hasLookaheadOccurred, true);
                androidx.compose.foundation.lazy.layout.ObservableScopeInvalidator.m1876invalidateScopeimpl(this.placementScopeInvalidator);
                Camera2StreamConfigurationMap(f2 - this.scrollToBeConsumed, copyWithScrollDeltaWithoutRemeasure);
            } else {
                androidx.compose.ui.layout.Remeasurement remeasurement = this.remeasurement;
                if (remeasurement != null) {
                    remeasurement.forceRemeasure();
                }
                Camera2StreamConfigurationMap(f2 - this.scrollToBeConsumed, getLayoutInfo());
            }
        }
        if (java.lang.Math.abs(this.scrollToBeConsumed) <= 0.5f) {
            return distance;
        }
        float f3 = this.scrollToBeConsumed;
        this.scrollToBeConsumed = 0.0f;
        return distance - f3;
    }

    private final void Camera2StreamConfigurationMap(float p0, androidx.compose.foundation.lazy.LazyListLayoutInfo p1) {
        if (this.prefetchingEnabled) {
            this.prefetchStrategy.onScroll(this.getHighResolutionOutputSizeshNQ4ISI, p0, p1);
        }
    }

    public static /* synthetic */ java.lang.Object animateScrollToItem$default(androidx.compose.foundation.lazy.LazyListState lazyListState, int i, int i2, kotlin.coroutines.Continuation continuation, int i3, java.lang.Object obj) {
        if ((i3 & 2) != 0) {
            i2 = 0;
        }
        return lazyListState.animateScrollToItem(i, i2, continuation);
    }

    public final java.lang.Object animateScrollToItem(int i, int i2, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        java.lang.Object scroll$default = androidx.compose.foundation.gestures.ScrollableState.scroll$default(this, null, new androidx.compose.foundation.lazy.LazyListState$animateScrollToItem$2(this, i, i2, null), continuation, 1, null);
        return scroll$default == kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED() ? scroll$default : kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ void applyMeasureResult$foundation$default(androidx.compose.foundation.lazy.LazyListState lazyListState, androidx.compose.foundation.lazy.LazyListMeasureResult lazyListMeasureResult, boolean z, boolean z2, int i, java.lang.Object obj) {
        if ((i & 4) != 0) {
            z2 = false;
        }
        lazyListState.applyMeasureResult$foundation(lazyListMeasureResult, z, z2);
    }

    public final void applyMeasureResult$foundation(androidx.compose.foundation.lazy.LazyListMeasureResult result, boolean isLookingAhead, boolean visibleItemsStayedTheSame) {
        androidx.compose.foundation.lazy.LazyListMeasuredItem firstVisibleItem;
        this.prefetchState.setIdealNestedPrefetchCount$foundation(result.getVisibleItemsInfo().size());
        if (!isLookingAhead && this.hasLookaheadOccurred) {
            this.approachLayoutInfo = result;
            androidx.compose.runtime.snapshots.Snapshot.Companion companion = androidx.compose.runtime.snapshots.Snapshot.INSTANCE;
            androidx.compose.runtime.snapshots.Snapshot currentThreadSnapshot = companion.getCurrentThreadSnapshot();
            kotlin.jvm.functions.Function1<java.lang.Object, kotlin.Unit> readObserver = currentThreadSnapshot != null ? currentThreadSnapshot.getReadObserver() : null;
            androidx.compose.runtime.snapshots.Snapshot makeCurrentNonObservable = companion.makeCurrentNonObservable(currentThreadSnapshot);
            try {
                if (this.getOutputMinFrameDuration.isActive$foundation() && (firstVisibleItem = result.getFirstVisibleItem()) != null && firstVisibleItem.getIndex() == this.getHighSpeedVideoFpsRangesFor.getIndex() && result.getFirstVisibleItemScrollOffset() == this.getHighSpeedVideoFpsRangesFor.getScrollOffset()) {
                    this.getOutputMinFrameDuration.stop$foundation();
                }
                kotlin.Unit unit = kotlin.Unit.INSTANCE;
                return;
            } finally {
                companion.restoreNonObservable(currentThreadSnapshot, makeCurrentNonObservable, readObserver);
            }
        }
        if (isLookingAhead) {
            this.hasLookaheadOccurred = true;
        }
        setCanScrollBackward(result.getCanScrollBackward());
        setCanScrollForward(result.getCanScrollForward());
        this.scrollToBeConsumed -= result.getConsumedScroll();
        this.getHighSpeedVideoFpsRanges.setValue(result);
        if (visibleItemsStayedTheSame) {
            this.getHighSpeedVideoFpsRangesFor.updateScrollOffset(result.getFirstVisibleItemScrollOffset());
        } else {
            getHighSpeedVideoFpsRanges(result);
            this.getHighSpeedVideoFpsRangesFor.updateFromMeasureResult(result);
            if (this.prefetchingEnabled) {
                this.prefetchStrategy.onVisibleItemsUpdated(this.getHighResolutionOutputSizeshNQ4ISI, result);
            }
        }
        if (isLookingAhead) {
            this.getOutputMinFrameDuration.updateScrollDeltaForApproach$foundation(result.getScrollBackAmount(), result.getDensity(), result.getCoroutineScope());
        }
        this.numMeasurePasses++;
    }

    private static void getHighSpeedVideoFpsRanges(androidx.compose.foundation.lazy.LazyListMeasureResult p0) {
        androidx.compose.foundation.lazy.LazyListMeasuredItem lazyListMeasuredItem = (androidx.compose.foundation.lazy.LazyListMeasuredItem) kotlin.collections.CollectionsKt.firstOrNull((java.util.List) p0.getVisibleItemsInfo());
        androidx.compose.foundation.lazy.LazyListMeasuredItem lazyListMeasuredItem2 = (androidx.compose.foundation.lazy.LazyListMeasuredItem) kotlin.collections.CollectionsKt.lastOrNull((java.util.List) p0.getVisibleItemsInfo());
        androidx.compose.ui.util.AndroidTrace_androidKt.traceValue("firstVisibleItem:index", lazyListMeasuredItem != null ? lazyListMeasuredItem.getIndex() : -1L);
        androidx.compose.ui.util.AndroidTrace_androidKt.traceValue("lastVisibleItem:index", lazyListMeasuredItem2 != null ? lazyListMeasuredItem2.getIndex() : -1L);
    }

    public final float getScrollDeltaBetweenPasses$foundation() {
        return this.getOutputMinFrameDuration.getScrollDeltaBetweenPasses$foundation();
    }

    public final int updateScrollPositionIfTheFirstItemWasMoved$foundation(androidx.compose.foundation.lazy.LazyListItemProvider itemProvider, int firstItemIndex) {
        return this.getHighSpeedVideoFpsRangesFor.updateScrollPositionIfTheFirstItemWasMoved(itemProvider, firstItemIndex);
    }

    @kotlin.Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J!\u0010\b\u001a\f\u0012\u0004\u0012\u00020\u0007\u0012\u0002\b\u00030\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0000¢\u0006\u0004\b\b\u0010\tJ!\u0010\b\u001a\f\u0012\u0004\u0012\u00020\u0007\u0012\u0002\b\u00030\u00062\u0006\u0010\u000b\u001a\u00020\nH\u0000¢\u0006\u0004\b\b\u0010\fR!\u0010\r\u001a\f\u0012\u0004\u0012\u00020\u0007\u0012\u0002\b\u00030\u00068\u0007¢\u0006\f\n\u0004\b\r\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010"}, d2 = {"Landroidx/compose/foundation/lazy/LazyListState$Companion;", "", "<init>", "()V", "Landroidx/compose/foundation/lazy/LazyListPrefetchStrategy;", "prefetchStrategy", "Landroidx/compose/runtime/saveable/Saver;", "Landroidx/compose/foundation/lazy/LazyListState;", "saver$foundation", "(Landroidx/compose/foundation/lazy/LazyListPrefetchStrategy;)Landroidx/compose/runtime/saveable/Saver;", "Landroidx/compose/foundation/lazy/layout/LazyLayoutCacheWindow;", "cacheWindow", "(Landroidx/compose/foundation/lazy/layout/LazyLayoutCacheWindow;)Landroidx/compose/runtime/saveable/Saver;", "Saver", "Landroidx/compose/runtime/saveable/Saver;", "getSaver", "()Landroidx/compose/runtime/saveable/Saver;"}, k = 1, mv = {2, 0, 0}, xi = 48)
    /* loaded from: classes6.dex */
    public static final class Companion {
        private Companion() {
        }

        public final androidx.compose.runtime.saveable.Saver<androidx.compose.foundation.lazy.LazyListState, ?> getSaver() {
            return androidx.compose.foundation.lazy.LazyListState.Saver;
        }

        public final androidx.compose.runtime.saveable.Saver<androidx.compose.foundation.lazy.LazyListState, ?> saver$foundation(final androidx.compose.foundation.lazy.LazyListPrefetchStrategy prefetchStrategy) {
            return androidx.compose.runtime.saveable.ListSaverKt.listSaver(new kotlin.jvm.functions.Function2() { // from class: androidx.compose.foundation.lazy.LazyListState$Companion$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function2
                public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                    java.util.List highSpeedVideoFpsRangesFor;
                    highSpeedVideoFpsRangesFor = androidx.compose.foundation.lazy.LazyListState.Companion.getHighSpeedVideoFpsRangesFor((androidx.compose.foundation.lazy.LazyListState) obj2);
                    return highSpeedVideoFpsRangesFor;
                }
            }, new kotlin.jvm.functions.Function1() { // from class: androidx.compose.foundation.lazy.LazyListState$Companion$$ExternalSyntheticLambda1
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    androidx.compose.foundation.lazy.LazyListState highSpeedVideoFpsRanges;
                    highSpeedVideoFpsRanges = androidx.compose.foundation.lazy.LazyListState.Companion.getHighSpeedVideoFpsRanges(androidx.compose.foundation.lazy.LazyListPrefetchStrategy.this, (java.util.List) obj);
                    return highSpeedVideoFpsRanges;
                }
            });
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final java.util.List getHighSpeedVideoFpsRangesFor(androidx.compose.foundation.lazy.LazyListState lazyListState) {
            return kotlin.collections.CollectionsKt.listOf((java.lang.Object[]) new java.lang.Integer[]{java.lang.Integer.valueOf(lazyListState.getFirstVisibleItemIndex()), java.lang.Integer.valueOf(lazyListState.getFirstVisibleItemScrollOffset())});
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final androidx.compose.foundation.lazy.LazyListState getHighSpeedVideoFpsRanges(androidx.compose.foundation.lazy.LazyListPrefetchStrategy lazyListPrefetchStrategy, java.util.List list) {
            return new androidx.compose.foundation.lazy.LazyListState(((java.lang.Number) list.get(0)).intValue(), ((java.lang.Number) list.get(1)).intValue(), lazyListPrefetchStrategy);
        }

        public final androidx.compose.runtime.saveable.Saver<androidx.compose.foundation.lazy.LazyListState, ?> saver$foundation(final androidx.compose.foundation.lazy.layout.LazyLayoutCacheWindow cacheWindow) {
            return androidx.compose.runtime.saveable.ListSaverKt.listSaver(new kotlin.jvm.functions.Function2() { // from class: androidx.compose.foundation.lazy.LazyListState$Companion$$ExternalSyntheticLambda2
                @Override // kotlin.jvm.functions.Function2
                public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                    java.util.List highResolutionOutputSizeshNQ4ISI;
                    highResolutionOutputSizeshNQ4ISI = androidx.compose.foundation.lazy.LazyListState.Companion.getHighResolutionOutputSizeshNQ4ISI((androidx.compose.foundation.lazy.LazyListState) obj2);
                    return highResolutionOutputSizeshNQ4ISI;
                }
            }, new kotlin.jvm.functions.Function1() { // from class: androidx.compose.foundation.lazy.LazyListState$Companion$$ExternalSyntheticLambda3
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    androidx.compose.foundation.lazy.LazyListState Camera2StreamConfigurationMap;
                    Camera2StreamConfigurationMap = androidx.compose.foundation.lazy.LazyListState.Companion.Camera2StreamConfigurationMap(androidx.compose.foundation.lazy.layout.LazyLayoutCacheWindow.this, (java.util.List) obj);
                    return Camera2StreamConfigurationMap;
                }
            });
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final java.util.List getHighResolutionOutputSizeshNQ4ISI(androidx.compose.foundation.lazy.LazyListState lazyListState) {
            return kotlin.collections.CollectionsKt.listOf((java.lang.Object[]) new java.lang.Integer[]{java.lang.Integer.valueOf(lazyListState.getFirstVisibleItemIndex()), java.lang.Integer.valueOf(lazyListState.getFirstVisibleItemScrollOffset())});
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final androidx.compose.foundation.lazy.LazyListState Camera2StreamConfigurationMap(androidx.compose.foundation.lazy.layout.LazyLayoutCacheWindow lazyLayoutCacheWindow, java.util.List list) {
            return new androidx.compose.foundation.lazy.LazyListState(lazyLayoutCacheWindow, ((java.lang.Number) list.get(0)).intValue(), ((java.lang.Number) list.get(1)).intValue());
        }

        public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final java.util.List getHighResolutionOutputSizeshNQ4ISI(androidx.compose.foundation.lazy.LazyListState lazyListState) {
        return kotlin.collections.CollectionsKt.listOf((java.lang.Object[]) new java.lang.Integer[]{java.lang.Integer.valueOf(lazyListState.getFirstVisibleItemIndex()), java.lang.Integer.valueOf(lazyListState.getFirstVisibleItemScrollOffset())});
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final androidx.compose.foundation.lazy.LazyListState getHighSpeedVideoFpsRanges(java.util.List list) {
        return new androidx.compose.foundation.lazy.LazyListState(((java.lang.Number) list.get(0)).intValue(), ((java.lang.Number) list.get(1)).intValue());
    }

    public LazyListState() {
        this(0, 0, (androidx.compose.foundation.lazy.LazyListPrefetchStrategy) null, 7, (kotlin.jvm.internal.DefaultConstructorMarker) null);
    }
}
