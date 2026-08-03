package androidx.compose.foundation.pager;

/* compiled from: PagerState.kt */
@kotlin.Metadata(d1 = {"\u0000ä\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0010\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0014\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0011\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\b'\u0018\u00002\u00020\u0001B\u0019\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J7\u0010\u009a\u0001\u001a\u00030\u009b\u00012\u0007\u0010\u009c\u0001\u001a\u00020\u00032\t\b\u0002\u0010\u009d\u0001\u001a\u00020\u00052\u0010\b\u0002\u0010\u009e\u0001\u001a\t\u0012\u0004\u0012\u00020\u00050\u009f\u0001H\u0086@¢\u0006\u0003\u0010 \u0001J$\u0010¡\u0001\u001a\u00030\u009b\u00012\u0007\u0010¢\u0001\u001a\u00020S2\t\b\u0002\u0010£\u0001\u001a\u00020\u0013H\u0000¢\u0006\u0003\b¤\u0001J\u0011\u0010¥\u0001\u001a\u00030\u009b\u0001H\u0082@¢\u0006\u0003\u0010¦\u0001J\u0013\u0010§\u0001\u001a\u00030\u009b\u00012\u0007\u0010¨\u0001\u001a\u00020=H\u0002J\u0012\u0010©\u0001\u001a\u00020\u00052\u0007\u0010ª\u0001\u001a\u00020\u0005H\u0016J\u0010\u0010«\u0001\u001a\u00020\u00052\u0007\u0010\u009c\u0001\u001a\u00020\u0003J\u0012\u0010¬\u0001\u001a\u00020\u00132\u0007\u0010\u00ad\u0001\u001a\u00020\u0005H\u0002J\t\u0010®\u0001\u001a\u00020\u0013H\u0002J#\u0010¯\u0001\u001a\u00020\u00032\b\u0010°\u0001\u001a\u00030±\u00012\b\b\u0002\u0010\u0002\u001a\u00020\u0003H\u0000¢\u0006\u0003\b²\u0001J\u001c\u0010³\u0001\u001a\u00030\u009b\u00012\u0007\u0010ª\u0001\u001a\u00020\u00052\u0007\u0010¨\u0001\u001a\u00020=H\u0002J\u0012\u0010´\u0001\u001a\u00020\u00052\u0007\u0010ª\u0001\u001a\u00020\u0005H\u0002JK\u0010µ\u0001\u001a\u00030\u009b\u00012\b\u0010¶\u0001\u001a\u00030·\u00012.\u0010¸\u0001\u001a)\b\u0001\u0012\u0005\u0012\u00030º\u0001\u0012\f\u0012\n\u0012\u0005\u0012\u00030\u009b\u00010»\u0001\u0012\u0007\u0012\u0005\u0018\u00010¼\u00010¹\u0001¢\u0006\u0003\b½\u0001H\u0096@¢\u0006\u0003\u0010¾\u0001J%\u0010¿\u0001\u001a\u00030\u009b\u00012\u0007\u0010\u009c\u0001\u001a\u00020\u00032\t\b\u0002\u0010\u009d\u0001\u001a\u00020\u0005H\u0086@¢\u0006\u0003\u0010À\u0001J\"\u0010Á\u0001\u001a\u00030\u009b\u00012\u0007\u0010\u009c\u0001\u001a\u00020\u00032\u0007\u0010Â\u0001\u001a\u00020\u0005H\u0000¢\u0006\u0003\bÃ\u0001J\u0013\u0010Ä\u0001\u001a\u00030\u009b\u00012\u0007\u0010¢\u0001\u001a\u00020SH\u0002J\r\u0010Å\u0001\u001a\u00020\u0003*\u00020\u0003H\u0002J!\u0010Æ\u0001\u001a\u00030\u009b\u0001*\u00030º\u00012\u0007\u0010\u009c\u0001\u001a\u00020\u00032\t\b\u0002\u0010\u009d\u0001\u001a\u00020\u0005J\u0016\u0010Ç\u0001\u001a\u00030\u009b\u0001*\u00030º\u00012\u0007\u0010\u0091\u0001\u001a\u00020\u0003R\u000e\u0010\u0007\u001a\u00020\u0005X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\n\u001a\u00020\u000bX\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0014\u0010\u000e\u001a\u00020\u000fX\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R+\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0012\u001a\u00020\u00138F@BX\u0086\u008e\u0002¢\u0006\u0012\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u0015\u0010\u0016\"\u0004\b\u0017\u0010\u0018R+\u0010\u001b\u001a\u00020\u00132\u0006\u0010\u0012\u001a\u00020\u00138F@BX\u0086\u008e\u0002¢\u0006\u0012\n\u0004\b\u001e\u0010\u001a\u001a\u0004\b\u001c\u0010\u0016\"\u0004\b\u001d\u0010\u0018R\u0011\u0010\u0002\u001a\u00020\u00038F¢\u0006\u0006\u001a\u0004\b\u001f\u0010 R\u0011\u0010\u0004\u001a\u00020\u00058F¢\u0006\u0006\u001a\u0004\b!\u0010\"R\u0010\u0010#\u001a\u0004\u0018\u00010$X\u0082\u000e¢\u0006\u0002\n\u0000R\u001a\u0010%\u001a\u00020&X\u0080\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b'\u0010(\"\u0004\b)\u0010*R\u001e\u0010+\u001a\u00020\u00032\u0006\u0010\u0012\u001a\u00020\u0003@BX\u0080\u000e¢\u0006\b\n\u0000\u001a\u0004\b,\u0010 R\u001e\u0010-\u001a\u00020\u00032\u0006\u0010\u0012\u001a\u00020\u0003@BX\u0080\u000e¢\u0006\b\n\u0000\u001a\u0004\b.\u0010 R\u000e\u0010/\u001a\u00020\u0003X\u0082\u000e¢\u0006\u0002\n\u0000R\u0011\u00100\u001a\u0002018F¢\u0006\u0006\u001a\u0004\b2\u00103R\u0014\u00104\u001a\u000205X\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b6\u00107R\u0014\u00108\u001a\u00020\u00138VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b8\u0010\u0016R+\u00109\u001a\u00020\u00132\u0006\u0010\u0012\u001a\u00020\u00138B@BX\u0082\u008e\u0002¢\u0006\u0012\n\u0004\b;\u0010\u001a\u001a\u0004\b9\u0010\u0016\"\u0004\b:\u0010\u0018R\u0011\u0010<\u001a\u00020=8F¢\u0006\u0006\u001a\u0004\b>\u0010?R\u0018\u0010@\u001a\u00020\u00032\u0006\u0010\u0012\u001a\u00020\u0003@BX\u0082\u000e¢\u0006\u0002\n\u0000R\u001b\u0010A\u001a\u00020B8@X\u0080\u0084\u0002¢\u0006\f\u001a\u0004\bE\u0010F*\u0004\bC\u0010DR\u001e\u0010G\u001a\u00020\u00032\u0006\u0010\u0012\u001a\u00020\u0003@BX\u0080\u000e¢\u0006\b\n\u0000\u001a\u0004\bH\u0010 R\u0012\u0010I\u001a\u00020\u0003X¦\u0004¢\u0006\u0006\u001a\u0004\bJ\u0010 R\u0014\u0010K\u001a\u00020\u00038@X\u0080\u0004¢\u0006\u0006\u001a\u0004\bL\u0010 R\u0014\u0010M\u001a\u00020\u00038@X\u0080\u0004¢\u0006\u0006\u001a\u0004\bN\u0010 R\u0014\u0010O\u001a\u00020\u00038@X\u0080\u0004¢\u0006\u0006\u001a\u0004\bP\u0010 R\u0014\u0010Q\u001a\b\u0012\u0004\u0012\u00020S0RX\u0082\u000e¢\u0006\u0002\n\u0000R\u0014\u0010T\u001a\u00020UX\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\bV\u0010WR\u001c\u0010X\u001a\u00020YX\u0080\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\n\n\u0002\u0010\u001a\u001a\u0004\bZ\u0010[R\u0014\u0010\\\u001a\u00020\u00058@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b]\u0010\"R\u0014\u0010^\u001a\u00020_X\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b`\u0010aR\u001a\u0010b\u001a\u00020\u0013X\u0080\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bc\u0010\u0016\"\u0004\bd\u0010\u0018R\"\u0010e\u001a\u00020fX\u0080\u000eø\u0001\u0000ø\u0001\u0001¢\u0006\u0010\n\u0002\u0010k\u001a\u0004\bg\u0010h\"\u0004\bi\u0010jR\u000e\u0010l\u001a\u00020\u0005X\u0082\u000e¢\u0006\u0002\n\u0000R+\u0010m\u001a\u00020\u00032\u0006\u0010\u0012\u001a\u00020\u00038B@BX\u0082\u008e\u0002¢\u0006\u0012\n\u0004\bq\u0010r\u001a\u0004\bn\u0010 \"\u0004\bo\u0010pR/\u0010t\u001a\u0004\u0018\u00010s2\b\u0010\u0012\u001a\u0004\u0018\u00010s8@@BX\u0080\u008e\u0002¢\u0006\u0012\n\u0004\by\u0010\u001a\u001a\u0004\bu\u0010v\"\u0004\bw\u0010xR\u0014\u0010z\u001a\u00020{X\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b|\u0010}R\u0016\u0010~\u001a\u00020\u007fX\u0080\u0004¢\u0006\n\n\u0000\u001a\u0006\b\u0080\u0001\u0010\u0081\u0001R\u000f\u0010\u0082\u0001\u001a\u00020\u0001X\u0082\u0004¢\u0006\u0002\n\u0000R\u001f\u0010\u0083\u0001\u001a\u00020\u00038FX\u0086\u0084\u0002¢\u0006\u000f\n\u0006\b\u0085\u0001\u0010\u0086\u0001\u001a\u0005\b\u0084\u0001\u0010 R/\u0010\u0087\u0001\u001a\u00020\u00032\u0006\u0010\u0012\u001a\u00020\u00038B@BX\u0082\u008e\u0002¢\u0006\u0015\n\u0005\b\u008a\u0001\u0010r\u001a\u0005\b\u0088\u0001\u0010 \"\u0005\b\u0089\u0001\u0010pR1\u0010\u008b\u0001\u001a\u00020\u00052\u0006\u0010\u0012\u001a\u00020\u00058@@@X\u0080\u008e\u0002¢\u0006\u0017\n\u0006\b\u008f\u0001\u0010\u0090\u0001\u001a\u0005\b\u008c\u0001\u0010\"\"\u0006\b\u008d\u0001\u0010\u008e\u0001R\u001f\u0010\u0091\u0001\u001a\u00020\u00038FX\u0086\u0084\u0002¢\u0006\u000f\n\u0006\b\u0093\u0001\u0010\u0086\u0001\u001a\u0005\b\u0092\u0001\u0010 R7\u0010\u0095\u0001\u001a\u00030\u0094\u00012\u0007\u0010\u0012\u001a\u00030\u0094\u00018@@@X\u0080\u008e\u0002ø\u0001\u0000ø\u0001\u0001¢\u0006\u0015\n\u0005\b\u0098\u0001\u0010\u001a\u001a\u0005\b\u0096\u0001\u0010h\"\u0005\b\u0097\u0001\u0010jR\u000f\u0010\u0099\u0001\u001a\u00020\u0013X\u0082\u000e¢\u0006\u0002\n\u0000\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006È\u0001"}, d2 = {"Landroidx/compose/foundation/pager/PagerState;", "Landroidx/compose/foundation/gestures/ScrollableState;", "currentPage", "", "currentPageOffsetFraction", "", "(IF)V", "accumulator", "animatedScrollScope", "Landroidx/compose/foundation/lazy/layout/LazyLayoutAnimateScrollScope;", "awaitLayoutModifier", "Landroidx/compose/foundation/lazy/layout/AwaitFirstLayoutModifier;", "getAwaitLayoutModifier$foundation_release", "()Landroidx/compose/foundation/lazy/layout/AwaitFirstLayoutModifier;", "beyondBoundsInfo", "Landroidx/compose/foundation/lazy/layout/LazyLayoutBeyondBoundsInfo;", "getBeyondBoundsInfo$foundation_release", "()Landroidx/compose/foundation/lazy/layout/LazyLayoutBeyondBoundsInfo;", "<set-?>", "", "canScrollBackward", "getCanScrollBackward", "()Z", "setCanScrollBackward", "(Z)V", "canScrollBackward$delegate", "Landroidx/compose/runtime/MutableState;", "canScrollForward", "getCanScrollForward", "setCanScrollForward", "canScrollForward$delegate", "getCurrentPage", "()I", "getCurrentPageOffsetFraction", "()F", "currentPrefetchHandle", "Landroidx/compose/foundation/lazy/layout/LazyLayoutPrefetchState$PrefetchHandle;", "density", "Landroidx/compose/ui/unit/Density;", "getDensity$foundation_release", "()Landroidx/compose/ui/unit/Density;", "setDensity$foundation_release", "(Landroidx/compose/ui/unit/Density;)V", "firstVisiblePage", "getFirstVisiblePage$foundation_release", "firstVisiblePageOffset", "getFirstVisiblePageOffset$foundation_release", "indexToPrefetch", "interactionSource", "Landroidx/compose/foundation/interaction/InteractionSource;", "getInteractionSource", "()Landroidx/compose/foundation/interaction/InteractionSource;", "internalInteractionSource", "Landroidx/compose/foundation/interaction/MutableInteractionSource;", "getInternalInteractionSource$foundation_release", "()Landroidx/compose/foundation/interaction/MutableInteractionSource;", "isScrollInProgress", "isScrollingForward", "setScrollingForward", "isScrollingForward$delegate", "layoutInfo", "Landroidx/compose/foundation/pager/PagerLayoutInfo;", "getLayoutInfo", "()Landroidx/compose/foundation/pager/PagerLayoutInfo;", "maxScrollOffset", "nearestRange", "Lkotlin/ranges/IntRange;", "getNearestRange$foundation_release$delegate", "(Landroidx/compose/foundation/pager/PagerState;)Ljava/lang/Object;", "getNearestRange$foundation_release", "()Lkotlin/ranges/IntRange;", "numMeasurePasses", "getNumMeasurePasses$foundation_release", "pageCount", "getPageCount", "pageSize", "getPageSize$foundation_release", "pageSizeWithSpacing", "getPageSizeWithSpacing$foundation_release", "pageSpacing", "getPageSpacing$foundation_release", "pagerLayoutInfoState", "Landroidx/compose/runtime/MutableState;", "Landroidx/compose/foundation/pager/PagerMeasureResult;", "pinnedPages", "Landroidx/compose/foundation/lazy/layout/LazyLayoutPinnedItemList;", "getPinnedPages$foundation_release", "()Landroidx/compose/foundation/lazy/layout/LazyLayoutPinnedItemList;", "placementScopeInvalidator", "Landroidx/compose/foundation/lazy/layout/ObservableScopeInvalidator;", "getPlacementScopeInvalidator-zYiylxw$foundation_release", "()Landroidx/compose/runtime/MutableState;", "positionThresholdFraction", "getPositionThresholdFraction$foundation_release", "prefetchState", "Landroidx/compose/foundation/lazy/layout/LazyLayoutPrefetchState;", "getPrefetchState$foundation_release", "()Landroidx/compose/foundation/lazy/layout/LazyLayoutPrefetchState;", "prefetchingEnabled", "getPrefetchingEnabled$foundation_release", "setPrefetchingEnabled$foundation_release", "premeasureConstraints", "Landroidx/compose/ui/unit/Constraints;", "getPremeasureConstraints-msEJaDk$foundation_release", "()J", "setPremeasureConstraints-BRTryo0$foundation_release", "(J)V", "J", "previousPassDelta", "programmaticScrollTargetPage", "getProgrammaticScrollTargetPage", "setProgrammaticScrollTargetPage", "(I)V", "programmaticScrollTargetPage$delegate", "Landroidx/compose/runtime/MutableIntState;", "Landroidx/compose/ui/layout/Remeasurement;", "remeasurement", "getRemeasurement$foundation_release", "()Landroidx/compose/ui/layout/Remeasurement;", "setRemeasurement", "(Landroidx/compose/ui/layout/Remeasurement;)V", "remeasurement$delegate", "remeasurementModifier", "Landroidx/compose/ui/layout/RemeasurementModifier;", "getRemeasurementModifier$foundation_release", "()Landroidx/compose/ui/layout/RemeasurementModifier;", "scrollPosition", "Landroidx/compose/foundation/pager/PagerScrollPosition;", "getScrollPosition$foundation_release", "()Landroidx/compose/foundation/pager/PagerScrollPosition;", "scrollableState", "settledPage", "getSettledPage", "settledPage$delegate", "Landroidx/compose/runtime/State;", "settledPageState", "getSettledPageState", "setSettledPageState", "settledPageState$delegate", "snapRemainingScrollOffset", "getSnapRemainingScrollOffset$foundation_release", "setSnapRemainingScrollOffset$foundation_release", "(F)V", "snapRemainingScrollOffset$delegate", "Landroidx/compose/runtime/MutableFloatState;", "targetPage", "getTargetPage", "targetPage$delegate", "Landroidx/compose/ui/geometry/Offset;", "upDownDifference", "getUpDownDifference-F1C5BW0$foundation_release", "setUpDownDifference-k-4lQ0M$foundation_release", "upDownDifference$delegate", "wasPrefetchingForward", "animateScrollToPage", "", "page", "pageOffsetFraction", "animationSpec", "Landroidx/compose/animation/core/AnimationSpec;", "(IFLandroidx/compose/animation/core/AnimationSpec;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "applyMeasureResult", "result", "visibleItemsStayedTheSame", "applyMeasureResult$foundation_release", "awaitScrollDependencies", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "cancelPrefetchIfVisibleItemsChanged", "info", "dispatchRawDelta", "delta", "getOffsetFractionForPage", "isGestureActionMatchesScroll", "scrollDelta", "isNotGestureAction", "matchScrollPositionWithKey", "itemProvider", "Landroidx/compose/foundation/pager/PagerLazyLayoutItemProvider;", "matchScrollPositionWithKey$foundation_release", "notifyPrefetch", "performScroll", com.helpshift.proactive.InAppViewConstants.SCROLL, "scrollPriority", "Landroidx/compose/foundation/MutatePriority;", "block", "Lkotlin/Function2;", "Landroidx/compose/foundation/gestures/ScrollScope;", "Lkotlin/coroutines/Continuation;", "", "Lkotlin/ExtensionFunctionType;", "(Landroidx/compose/foundation/MutatePriority;Lkotlin/jvm/functions/Function2;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "scrollToPage", "(IFLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "snapToItem", "offsetFraction", "snapToItem$foundation_release", "tryRunPrefetch", "coerceInPageRange", "updateCurrentPage", "updateTargetPage", "foundation_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public abstract class PagerState implements androidx.compose.foundation.gestures.ScrollableState {
    public static final int $stable = 0;
    private float accumulator;
    private final androidx.compose.foundation.lazy.layout.LazyLayoutAnimateScrollScope animatedScrollScope;
    private final androidx.compose.foundation.lazy.layout.AwaitFirstLayoutModifier awaitLayoutModifier;
    private final androidx.compose.foundation.lazy.layout.LazyLayoutBeyondBoundsInfo beyondBoundsInfo;

    /* renamed from: canScrollBackward$delegate, reason: from kotlin metadata */
    private final androidx.compose.runtime.MutableState canScrollBackward;

    /* renamed from: canScrollForward$delegate, reason: from kotlin metadata */
    private final androidx.compose.runtime.MutableState canScrollForward;
    private androidx.compose.foundation.lazy.layout.LazyLayoutPrefetchState.PrefetchHandle currentPrefetchHandle;
    private androidx.compose.ui.unit.Density density;
    private int firstVisiblePage;
    private int firstVisiblePageOffset;
    private int indexToPrefetch;
    private final androidx.compose.foundation.interaction.MutableInteractionSource internalInteractionSource;

    /* renamed from: isScrollingForward$delegate, reason: from kotlin metadata */
    private final androidx.compose.runtime.MutableState isScrollingForward;
    private int maxScrollOffset;
    private int numMeasurePasses;
    private androidx.compose.runtime.MutableState<androidx.compose.foundation.pager.PagerMeasureResult> pagerLayoutInfoState;
    private final androidx.compose.foundation.lazy.layout.LazyLayoutPinnedItemList pinnedPages;
    private final androidx.compose.runtime.MutableState<kotlin.Unit> placementScopeInvalidator;
    private final androidx.compose.foundation.lazy.layout.LazyLayoutPrefetchState prefetchState;
    private boolean prefetchingEnabled;
    private long premeasureConstraints;
    private float previousPassDelta;

    /* renamed from: programmaticScrollTargetPage$delegate, reason: from kotlin metadata */
    private final androidx.compose.runtime.MutableIntState programmaticScrollTargetPage;

    /* renamed from: remeasurement$delegate, reason: from kotlin metadata */
    private final androidx.compose.runtime.MutableState remeasurement;
    private final androidx.compose.ui.layout.RemeasurementModifier remeasurementModifier;
    private final androidx.compose.foundation.pager.PagerScrollPosition scrollPosition;
    private final androidx.compose.foundation.gestures.ScrollableState scrollableState;

    /* renamed from: settledPage$delegate, reason: from kotlin metadata */
    private final androidx.compose.runtime.State settledPage;

    /* renamed from: settledPageState$delegate, reason: from kotlin metadata */
    private final androidx.compose.runtime.MutableIntState settledPageState;

    /* renamed from: snapRemainingScrollOffset$delegate, reason: from kotlin metadata */
    private final androidx.compose.runtime.MutableFloatState snapRemainingScrollOffset;

    /* renamed from: targetPage$delegate, reason: from kotlin metadata */
    private final androidx.compose.runtime.State targetPage;

    /* renamed from: upDownDifference$delegate, reason: from kotlin metadata */
    private final androidx.compose.runtime.MutableState upDownDifference;
    private boolean wasPrefetchingForward;

    public PagerState() {
        this(0, 0.0f, 3, null);
    }

    public abstract int getPageCount();

    @Override // androidx.compose.foundation.gestures.ScrollableState
    public java.lang.Object scroll(androidx.compose.foundation.MutatePriority mutatePriority, kotlin.jvm.functions.Function2<? super androidx.compose.foundation.gestures.ScrollScope, ? super kotlin.coroutines.Continuation<? super kotlin.Unit>, ? extends java.lang.Object> function2, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        return scroll$suspendImpl(this, mutatePriority, function2, continuation);
    }

    public PagerState(int i, float f) {
        androidx.compose.foundation.pager.PagerStateKt$UnitDensity$1 pagerStateKt$UnitDensity$1;
        double d = f;
        if (-0.5d <= d && d <= 0.5d) {
            this.upDownDifference = androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(androidx.compose.ui.geometry.Offset.m1860boximpl(androidx.compose.ui.geometry.Offset.INSTANCE.m1887getZeroF1C5BW0()), null, 2, null);
            this.snapRemainingScrollOffset = androidx.compose.runtime.PrimitiveSnapshotStateKt.mutableFloatStateOf(0.0f);
            this.animatedScrollScope = androidx.compose.foundation.pager.PagerLazyAnimateScrollScopeKt.PagerLazyAnimateScrollScope(this);
            this.isScrollingForward = androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(false, null, 2, null);
            androidx.compose.foundation.pager.PagerScrollPosition pagerScrollPosition = new androidx.compose.foundation.pager.PagerScrollPosition(i, f, this);
            this.scrollPosition = pagerScrollPosition;
            this.firstVisiblePage = i;
            this.maxScrollOffset = Integer.MAX_VALUE;
            this.scrollableState = androidx.compose.foundation.gestures.ScrollableStateKt.ScrollableState(new kotlin.jvm.functions.Function1<java.lang.Float, java.lang.Float>() { // from class: androidx.compose.foundation.pager.PagerState$scrollableState$1
                {
                    super(1);
                }

                public final java.lang.Float invoke(float f2) {
                    float performScroll;
                    performScroll = androidx.compose.foundation.pager.PagerState.this.performScroll(f2);
                    return java.lang.Float.valueOf(performScroll);
                }

                @Override // kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ java.lang.Float invoke(java.lang.Float f2) {
                    return invoke(f2.floatValue());
                }
            });
            this.prefetchingEnabled = true;
            this.indexToPrefetch = -1;
            this.pagerLayoutInfoState = androidx.compose.runtime.SnapshotStateKt.mutableStateOf(androidx.compose.foundation.pager.PagerStateKt.getEmptyLayoutInfo(), androidx.compose.runtime.SnapshotStateKt.neverEqualPolicy());
            pagerStateKt$UnitDensity$1 = androidx.compose.foundation.pager.PagerStateKt.UnitDensity;
            this.density = pagerStateKt$UnitDensity$1;
            this.internalInteractionSource = androidx.compose.foundation.interaction.InteractionSourceKt.MutableInteractionSource();
            this.programmaticScrollTargetPage = androidx.compose.runtime.SnapshotIntStateKt.mutableIntStateOf(-1);
            this.settledPageState = androidx.compose.runtime.SnapshotIntStateKt.mutableIntStateOf(i);
            this.settledPage = androidx.compose.runtime.SnapshotStateKt.derivedStateOf(androidx.compose.runtime.SnapshotStateKt.structuralEqualityPolicy(), new kotlin.jvm.functions.Function0<java.lang.Integer>() { // from class: androidx.compose.foundation.pager.PagerState$settledPage$2
                {
                    super(0);
                }

                /* JADX WARN: Can't rename method to resolve collision */
                @Override // kotlin.jvm.functions.Function0
                public final java.lang.Integer invoke() {
                    int currentPage;
                    if (androidx.compose.foundation.pager.PagerState.this.isScrollInProgress()) {
                        currentPage = androidx.compose.foundation.pager.PagerState.this.getSettledPageState();
                    } else {
                        currentPage = androidx.compose.foundation.pager.PagerState.this.getCurrentPage();
                    }
                    return java.lang.Integer.valueOf(currentPage);
                }
            });
            this.targetPage = androidx.compose.runtime.SnapshotStateKt.derivedStateOf(androidx.compose.runtime.SnapshotStateKt.structuralEqualityPolicy(), new kotlin.jvm.functions.Function0<java.lang.Integer>() { // from class: androidx.compose.foundation.pager.PagerState$targetPage$2
                {
                    super(0);
                }

                /* JADX WARN: Can't rename method to resolve collision */
                @Override // kotlin.jvm.functions.Function0
                public final java.lang.Integer invoke() {
                    int programmaticScrollTargetPage;
                    int roundToInt;
                    boolean isScrollingForward;
                    int coerceInPageRange;
                    if (androidx.compose.foundation.pager.PagerState.this.isScrollInProgress()) {
                        programmaticScrollTargetPage = androidx.compose.foundation.pager.PagerState.this.getProgrammaticScrollTargetPage();
                        if (programmaticScrollTargetPage != -1) {
                            roundToInt = androidx.compose.foundation.pager.PagerState.this.getProgrammaticScrollTargetPage();
                        } else if (androidx.compose.foundation.pager.PagerState.this.getSnapRemainingScrollOffset$foundation_release() != 0.0f) {
                            roundToInt = kotlin.math.MathKt.roundToInt(androidx.compose.foundation.pager.PagerState.this.getSnapRemainingScrollOffset$foundation_release() / androidx.compose.foundation.pager.PagerState.this.getPageSizeWithSpacing$foundation_release()) + androidx.compose.foundation.pager.PagerState.this.getCurrentPage();
                        } else if (java.lang.Math.abs(androidx.compose.foundation.pager.PagerState.this.getCurrentPageOffsetFraction()) >= java.lang.Math.abs(androidx.compose.foundation.pager.PagerState.this.getPositionThresholdFraction$foundation_release())) {
                            isScrollingForward = androidx.compose.foundation.pager.PagerState.this.isScrollingForward();
                            if (isScrollingForward) {
                                roundToInt = androidx.compose.foundation.pager.PagerState.this.getFirstVisiblePage() + 1;
                            } else {
                                roundToInt = androidx.compose.foundation.pager.PagerState.this.getFirstVisiblePage();
                            }
                        } else {
                            roundToInt = androidx.compose.foundation.pager.PagerState.this.getCurrentPage();
                        }
                    } else {
                        roundToInt = androidx.compose.foundation.pager.PagerState.this.getCurrentPage();
                    }
                    coerceInPageRange = androidx.compose.foundation.pager.PagerState.this.coerceInPageRange(roundToInt);
                    return java.lang.Integer.valueOf(coerceInPageRange);
                }
            });
            this.prefetchState = new androidx.compose.foundation.lazy.layout.LazyLayoutPrefetchState();
            this.beyondBoundsInfo = new androidx.compose.foundation.lazy.layout.LazyLayoutBeyondBoundsInfo();
            this.awaitLayoutModifier = new androidx.compose.foundation.lazy.layout.AwaitFirstLayoutModifier();
            this.remeasurement = androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(null, null, 2, null);
            this.remeasurementModifier = new androidx.compose.ui.layout.RemeasurementModifier() { // from class: androidx.compose.foundation.pager.PagerState$remeasurementModifier$1
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
                    androidx.compose.foundation.pager.PagerState.this.setRemeasurement(remeasurement);
                }
            };
            this.premeasureConstraints = androidx.compose.ui.unit.ConstraintsKt.Constraints$default(0, 0, 0, 0, 15, null);
            this.pinnedPages = new androidx.compose.foundation.lazy.layout.LazyLayoutPinnedItemList();
            pagerScrollPosition.getNearestRangeState();
            this.placementScopeInvalidator = androidx.compose.foundation.lazy.layout.ObservableScopeInvalidator.m747constructorimpl$default(null, 1, null);
            this.canScrollForward = androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(false, null, 2, null);
            this.canScrollBackward = androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(false, null, 2, null);
            return;
        }
        throw new java.lang.IllegalArgumentException(("initialPageOffsetFraction " + f + " is not within the range -0.5 to 0.5").toString());
    }

    public /* synthetic */ PagerState(int i, float f, int i2, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 & 1) != 0 ? 0 : i, (i2 & 2) != 0 ? 0.0f : f);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: getUpDownDifference-F1C5BW0$foundation_release, reason: not valid java name */
    public final long m814getUpDownDifferenceF1C5BW0$foundation_release() {
        return ((androidx.compose.ui.geometry.Offset) this.upDownDifference.getValue()).getPackedValue();
    }

    /* renamed from: setUpDownDifference-k-4lQ0M$foundation_release, reason: not valid java name */
    public final void m816setUpDownDifferencek4lQ0M$foundation_release(long j) {
        this.upDownDifference.setValue(androidx.compose.ui.geometry.Offset.m1860boximpl(j));
    }

    public final float getSnapRemainingScrollOffset$foundation_release() {
        return this.snapRemainingScrollOffset.getFloatValue();
    }

    public final void setSnapRemainingScrollOffset$foundation_release(float f) {
        this.snapRemainingScrollOffset.setFloatValue(f);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public final boolean isScrollingForward() {
        return ((java.lang.Boolean) this.isScrollingForward.getValue()).booleanValue();
    }

    private final void setScrollingForward(boolean z) {
        this.isScrollingForward.setValue(java.lang.Boolean.valueOf(z));
    }

    /* renamed from: getScrollPosition$foundation_release, reason: from getter */
    public final androidx.compose.foundation.pager.PagerScrollPosition getScrollPosition() {
        return this.scrollPosition;
    }

    /* renamed from: getFirstVisiblePage$foundation_release, reason: from getter */
    public final int getFirstVisiblePage() {
        return this.firstVisiblePage;
    }

    /* renamed from: getFirstVisiblePageOffset$foundation_release, reason: from getter */
    public final int getFirstVisiblePageOffset() {
        return this.firstVisiblePageOffset;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final float performScroll(float delta) {
        float currentScrollOffset = this.scrollPosition.currentScrollOffset();
        float f = currentScrollOffset + delta + this.accumulator;
        float coerceIn = kotlin.ranges.RangesKt.coerceIn(f, 0.0f, this.maxScrollOffset);
        boolean z = !(f == coerceIn);
        float f2 = coerceIn - currentScrollOffset;
        this.previousPassDelta = f2;
        if (java.lang.Math.abs(f2) != 0.0f) {
            setScrollingForward(f2 > 0.0f);
        }
        int roundToInt = kotlin.math.MathKt.roundToInt(f2);
        androidx.compose.foundation.pager.PagerMeasureResult value = this.pagerLayoutInfoState.getValue();
        if (value.tryToApplyScrollWithoutRemeasure(-roundToInt)) {
            applyMeasureResult$foundation_release(value, true);
            androidx.compose.foundation.lazy.layout.ObservableScopeInvalidator.m751invalidateScopeimpl(this.placementScopeInvalidator);
        } else {
            this.scrollPosition.applyScrollDelta(roundToInt);
            androidx.compose.ui.layout.Remeasurement remeasurement$foundation_release = getRemeasurement$foundation_release();
            if (remeasurement$foundation_release != null) {
                remeasurement$foundation_release.forceRemeasure();
            }
        }
        this.accumulator = f2 - roundToInt;
        return z ? f2 : delta;
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

    public final androidx.compose.foundation.pager.PagerLayoutInfo getLayoutInfo() {
        return this.pagerLayoutInfoState.getValue();
    }

    public final int getPageSpacing$foundation_release() {
        return this.pagerLayoutInfoState.getValue().getPageSpacing();
    }

    public final int getPageSize$foundation_release() {
        return this.pagerLayoutInfoState.getValue().getPageSize();
    }

    /* renamed from: getDensity$foundation_release, reason: from getter */
    public final androidx.compose.ui.unit.Density getDensity() {
        return this.density;
    }

    public final void setDensity$foundation_release(androidx.compose.ui.unit.Density density) {
        this.density = density;
    }

    public final int getPageSizeWithSpacing$foundation_release() {
        return getPageSize$foundation_release() + getPageSpacing$foundation_release();
    }

    public final float getPositionThresholdFraction$foundation_release() {
        return java.lang.Math.min(this.density.mo315toPx0680j_4(androidx.compose.foundation.pager.PagerStateKt.getDefaultPositionThreshold()), getPageSize$foundation_release() / 2.0f) / getPageSize$foundation_release();
    }

    /* renamed from: getInternalInteractionSource$foundation_release, reason: from getter */
    public final androidx.compose.foundation.interaction.MutableInteractionSource getInternalInteractionSource() {
        return this.internalInteractionSource;
    }

    public final androidx.compose.foundation.interaction.InteractionSource getInteractionSource() {
        return this.internalInteractionSource;
    }

    public final int getCurrentPage() {
        return this.scrollPosition.getCurrentPage();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final int getProgrammaticScrollTargetPage() {
        return this.programmaticScrollTargetPage.getIntValue();
    }

    private final void setProgrammaticScrollTargetPage(int i) {
        this.programmaticScrollTargetPage.setIntValue(i);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final int getSettledPageState() {
        return this.settledPageState.getIntValue();
    }

    private final void setSettledPageState(int i) {
        this.settledPageState.setIntValue(i);
    }

    public final int getSettledPage() {
        return ((java.lang.Number) this.settledPage.getValue()).intValue();
    }

    public final int getTargetPage() {
        return ((java.lang.Number) this.targetPage.getValue()).intValue();
    }

    public final float getCurrentPageOffsetFraction() {
        return this.scrollPosition.getCurrentPageOffsetFraction();
    }

    /* renamed from: getPrefetchState$foundation_release, reason: from getter */
    public final androidx.compose.foundation.lazy.layout.LazyLayoutPrefetchState getPrefetchState() {
        return this.prefetchState;
    }

    /* renamed from: getBeyondBoundsInfo$foundation_release, reason: from getter */
    public final androidx.compose.foundation.lazy.layout.LazyLayoutBeyondBoundsInfo getBeyondBoundsInfo() {
        return this.beyondBoundsInfo;
    }

    /* renamed from: getAwaitLayoutModifier$foundation_release, reason: from getter */
    public final androidx.compose.foundation.lazy.layout.AwaitFirstLayoutModifier getAwaitLayoutModifier() {
        return this.awaitLayoutModifier;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void setRemeasurement(androidx.compose.ui.layout.Remeasurement remeasurement) {
        this.remeasurement.setValue(remeasurement);
    }

    public final androidx.compose.ui.layout.Remeasurement getRemeasurement$foundation_release() {
        return (androidx.compose.ui.layout.Remeasurement) this.remeasurement.getValue();
    }

    /* renamed from: getRemeasurementModifier$foundation_release, reason: from getter */
    public final androidx.compose.ui.layout.RemeasurementModifier getRemeasurementModifier() {
        return this.remeasurementModifier;
    }

    /* renamed from: getPremeasureConstraints-msEJaDk$foundation_release, reason: not valid java name and from getter */
    public final long getPremeasureConstraints() {
        return this.premeasureConstraints;
    }

    /* renamed from: setPremeasureConstraints-BRTryo0$foundation_release, reason: not valid java name */
    public final void m815setPremeasureConstraintsBRTryo0$foundation_release(long j) {
        this.premeasureConstraints = j;
    }

    /* renamed from: getPinnedPages$foundation_release, reason: from getter */
    public final androidx.compose.foundation.lazy.layout.LazyLayoutPinnedItemList getPinnedPages() {
        return this.pinnedPages;
    }

    public final kotlin.ranges.IntRange getNearestRange$foundation_release() {
        return this.scrollPosition.getNearestRangeState().getValue();
    }

    /* renamed from: getPlacementScopeInvalidator-zYiylxw$foundation_release, reason: not valid java name */
    public final androidx.compose.runtime.MutableState<kotlin.Unit> m812getPlacementScopeInvalidatorzYiylxw$foundation_release() {
        return this.placementScopeInvalidator;
    }

    public static /* synthetic */ java.lang.Object scrollToPage$default(androidx.compose.foundation.pager.PagerState pagerState, int i, float f, kotlin.coroutines.Continuation continuation, int i2, java.lang.Object obj) {
        if (obj != null) {
            throw new java.lang.UnsupportedOperationException("Super calls with default arguments not supported in this target, function: scrollToPage");
        }
        if ((i2 & 2) != 0) {
            f = 0.0f;
        }
        return pagerState.scrollToPage(i, f, continuation);
    }

    public final java.lang.Object scrollToPage(int i, float f, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        java.lang.Object scroll$default = androidx.compose.foundation.gestures.ScrollableState.CC.scroll$default(this, null, new androidx.compose.foundation.pager.PagerState$scrollToPage$2(this, f, i, null), continuation, 1, null);
        return scroll$default == kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED() ? scroll$default : kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ void updateCurrentPage$default(androidx.compose.foundation.pager.PagerState pagerState, androidx.compose.foundation.gestures.ScrollScope scrollScope, int i, float f, int i2, java.lang.Object obj) {
        if (obj != null) {
            throw new java.lang.UnsupportedOperationException("Super calls with default arguments not supported in this target, function: updateCurrentPage");
        }
        if ((i2 & 2) != 0) {
            f = 0.0f;
        }
        pagerState.updateCurrentPage(scrollScope, i, f);
    }

    public final void updateCurrentPage(androidx.compose.foundation.gestures.ScrollScope scrollScope, int i, float f) {
        this.animatedScrollScope.snapToItem(scrollScope, i, (int) (f * getPageSizeWithSpacing$foundation_release()));
    }

    public final void updateTargetPage(androidx.compose.foundation.gestures.ScrollScope scrollScope, int i) {
        setProgrammaticScrollTargetPage(coerceInPageRange(i));
    }

    public final void snapToItem$foundation_release(int page, float offsetFraction) {
        this.scrollPosition.requestPosition(page, offsetFraction);
        androidx.compose.ui.layout.Remeasurement remeasurement$foundation_release = getRemeasurement$foundation_release();
        if (remeasurement$foundation_release != null) {
            remeasurement$foundation_release.forceRemeasure();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x0048  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0025  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object animateScrollToPage(int i, float f, androidx.compose.animation.core.AnimationSpec<java.lang.Float> animationSpec, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        androidx.compose.foundation.pager.PagerState$animateScrollToPage$1 pagerState$animateScrollToPage$1;
        int i2;
        androidx.compose.foundation.pager.PagerState pagerState;
        androidx.compose.animation.core.AnimationSpec<java.lang.Float> animationSpec2;
        double d;
        if (continuation instanceof androidx.compose.foundation.pager.PagerState$animateScrollToPage$1) {
            pagerState$animateScrollToPage$1 = (androidx.compose.foundation.pager.PagerState$animateScrollToPage$1) continuation;
            if ((pagerState$animateScrollToPage$1.label & Integer.MIN_VALUE) != 0) {
                pagerState$animateScrollToPage$1.label -= Integer.MIN_VALUE;
                java.lang.Object obj = pagerState$animateScrollToPage$1.result;
                java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i2 = pagerState$animateScrollToPage$1.label;
                if (i2 != 0) {
                    kotlin.ResultKt.throwOnFailure(obj);
                    if ((i == getCurrentPage() && getCurrentPageOffsetFraction() == f) || getPageCount() == 0) {
                        return kotlin.Unit.INSTANCE;
                    }
                    pagerState$animateScrollToPage$1.L$0 = this;
                    pagerState$animateScrollToPage$1.L$1 = animationSpec;
                    pagerState$animateScrollToPage$1.I$0 = i;
                    pagerState$animateScrollToPage$1.F$0 = f;
                    pagerState$animateScrollToPage$1.label = 1;
                    if (awaitScrollDependencies(pagerState$animateScrollToPage$1) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    pagerState = this;
                    animationSpec2 = animationSpec;
                } else {
                    if (i2 != 1) {
                        if (i2 != 2) {
                            throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        kotlin.ResultKt.throwOnFailure(obj);
                        return kotlin.Unit.INSTANCE;
                    }
                    f = pagerState$animateScrollToPage$1.F$0;
                    i = pagerState$animateScrollToPage$1.I$0;
                    androidx.compose.animation.core.AnimationSpec<java.lang.Float> animationSpec3 = (androidx.compose.animation.core.AnimationSpec) pagerState$animateScrollToPage$1.L$1;
                    androidx.compose.foundation.pager.PagerState pagerState2 = (androidx.compose.foundation.pager.PagerState) pagerState$animateScrollToPage$1.L$0;
                    kotlin.ResultKt.throwOnFailure(obj);
                    animationSpec2 = animationSpec3;
                    pagerState = pagerState2;
                }
                d = f;
                if (-0.5d <= d || d > 0.5d) {
                    throw new java.lang.IllegalArgumentException(("pageOffsetFraction " + f + " is not within the range -0.5 to 0.5").toString());
                }
                int coerceInPageRange = pagerState.coerceInPageRange(i);
                int roundToInt = kotlin.math.MathKt.roundToInt(f * pagerState.getPageSizeWithSpacing$foundation_release());
                androidx.compose.foundation.lazy.layout.LazyLayoutAnimateScrollScope lazyLayoutAnimateScrollScope = pagerState.animatedScrollScope;
                androidx.compose.foundation.pager.PagerState$animateScrollToPage$3$1 pagerState$animateScrollToPage$3$1 = new androidx.compose.foundation.pager.PagerState$animateScrollToPage$3$1(pagerState, coerceInPageRange, lazyLayoutAnimateScrollScope, roundToInt, animationSpec2, null);
                pagerState$animateScrollToPage$1.L$0 = null;
                pagerState$animateScrollToPage$1.L$1 = null;
                pagerState$animateScrollToPage$1.label = 2;
                if (lazyLayoutAnimateScrollScope.scroll(pagerState$animateScrollToPage$3$1, pagerState$animateScrollToPage$1) == coroutine_suspended) {
                    return coroutine_suspended;
                }
                return kotlin.Unit.INSTANCE;
            }
        }
        pagerState$animateScrollToPage$1 = new androidx.compose.foundation.pager.PagerState$animateScrollToPage$1(this, continuation);
        java.lang.Object obj2 = pagerState$animateScrollToPage$1.result;
        java.lang.Object coroutine_suspended2 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i2 = pagerState$animateScrollToPage$1.label;
        if (i2 != 0) {
        }
        d = f;
        if (-0.5d <= d) {
        }
        throw new java.lang.IllegalArgumentException(("pageOffsetFraction " + f + " is not within the range -0.5 to 0.5").toString());
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ java.lang.Object animateScrollToPage$default(androidx.compose.foundation.pager.PagerState pagerState, int i, float f, androidx.compose.animation.core.AnimationSpec animationSpec, kotlin.coroutines.Continuation continuation, int i2, java.lang.Object obj) {
        if (obj != null) {
            throw new java.lang.UnsupportedOperationException("Super calls with default arguments not supported in this target, function: animateScrollToPage");
        }
        if ((i2 & 2) != 0) {
            f = 0.0f;
        }
        if ((i2 & 4) != 0) {
            animationSpec = androidx.compose.animation.core.AnimationSpecKt.spring$default(0.0f, 0.0f, null, 7, null);
        }
        return pagerState.animateScrollToPage(i, f, animationSpec, continuation);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final java.lang.Object awaitScrollDependencies(kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        java.lang.Object waitForFirstLayout = this.awaitLayoutModifier.waitForFirstLayout(continuation);
        return waitForFirstLayout == kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED() ? waitForFirstLayout : kotlin.Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x0063  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x007b A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:23:0x004b  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0025  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    static /* synthetic */ java.lang.Object scroll$suspendImpl(androidx.compose.foundation.pager.PagerState pagerState, androidx.compose.foundation.MutatePriority mutatePriority, kotlin.jvm.functions.Function2<? super androidx.compose.foundation.gestures.ScrollScope, ? super kotlin.coroutines.Continuation<? super kotlin.Unit>, ? extends java.lang.Object> function2, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        androidx.compose.foundation.pager.PagerState$scroll$1 pagerState$scroll$1;
        java.lang.Object coroutine_suspended;
        int i;
        androidx.compose.foundation.gestures.ScrollableState scrollableState;
        if (continuation instanceof androidx.compose.foundation.pager.PagerState$scroll$1) {
            pagerState$scroll$1 = (androidx.compose.foundation.pager.PagerState$scroll$1) continuation;
            if ((pagerState$scroll$1.label & Integer.MIN_VALUE) != 0) {
                pagerState$scroll$1.label -= Integer.MIN_VALUE;
                java.lang.Object obj = pagerState$scroll$1.result;
                coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = pagerState$scroll$1.label;
                if (i != 0) {
                    kotlin.ResultKt.throwOnFailure(obj);
                    pagerState$scroll$1.L$0 = pagerState;
                    pagerState$scroll$1.L$1 = mutatePriority;
                    pagerState$scroll$1.L$2 = function2;
                    pagerState$scroll$1.label = 1;
                    if (pagerState.awaitScrollDependencies(pagerState$scroll$1) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else {
                    if (i != 1) {
                        if (i != 2) {
                            throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        pagerState = (androidx.compose.foundation.pager.PagerState) pagerState$scroll$1.L$0;
                        kotlin.ResultKt.throwOnFailure(obj);
                        pagerState.setProgrammaticScrollTargetPage(-1);
                        return kotlin.Unit.INSTANCE;
                    }
                    function2 = (kotlin.jvm.functions.Function2) pagerState$scroll$1.L$2;
                    mutatePriority = (androidx.compose.foundation.MutatePriority) pagerState$scroll$1.L$1;
                    pagerState = (androidx.compose.foundation.pager.PagerState) pagerState$scroll$1.L$0;
                    kotlin.ResultKt.throwOnFailure(obj);
                }
                if (!pagerState.isScrollInProgress()) {
                    pagerState.setSettledPageState(pagerState.getCurrentPage());
                }
                scrollableState = pagerState.scrollableState;
                pagerState$scroll$1.L$0 = pagerState;
                pagerState$scroll$1.L$1 = null;
                pagerState$scroll$1.L$2 = null;
                pagerState$scroll$1.label = 2;
                if (scrollableState.scroll(mutatePriority, function2, pagerState$scroll$1) == coroutine_suspended) {
                    return coroutine_suspended;
                }
                pagerState.setProgrammaticScrollTargetPage(-1);
                return kotlin.Unit.INSTANCE;
            }
        }
        pagerState$scroll$1 = new androidx.compose.foundation.pager.PagerState$scroll$1(pagerState, continuation);
        java.lang.Object obj2 = pagerState$scroll$1.result;
        coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = pagerState$scroll$1.label;
        if (i != 0) {
        }
        if (!pagerState.isScrollInProgress()) {
        }
        scrollableState = pagerState.scrollableState;
        pagerState$scroll$1.L$0 = pagerState;
        pagerState$scroll$1.L$1 = null;
        pagerState$scroll$1.L$2 = null;
        pagerState$scroll$1.label = 2;
        if (scrollableState.scroll(mutatePriority, function2, pagerState$scroll$1) == coroutine_suspended) {
        }
        pagerState.setProgrammaticScrollTargetPage(-1);
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

    private final void setCanScrollForward(boolean z) {
        this.canScrollForward.setValue(java.lang.Boolean.valueOf(z));
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // androidx.compose.foundation.gestures.ScrollableState
    public final boolean getCanScrollForward() {
        return ((java.lang.Boolean) this.canScrollForward.getValue()).booleanValue();
    }

    private final void setCanScrollBackward(boolean z) {
        this.canScrollBackward.setValue(java.lang.Boolean.valueOf(z));
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // androidx.compose.foundation.gestures.ScrollableState
    public final boolean getCanScrollBackward() {
        return ((java.lang.Boolean) this.canScrollBackward.getValue()).booleanValue();
    }

    public static /* synthetic */ void applyMeasureResult$foundation_release$default(androidx.compose.foundation.pager.PagerState pagerState, androidx.compose.foundation.pager.PagerMeasureResult pagerMeasureResult, boolean z, int i, java.lang.Object obj) {
        if (obj != null) {
            throw new java.lang.UnsupportedOperationException("Super calls with default arguments not supported in this target, function: applyMeasureResult");
        }
        if ((i & 2) != 0) {
            z = false;
        }
        pagerState.applyMeasureResult$foundation_release(pagerMeasureResult, z);
    }

    public final void applyMeasureResult$foundation_release(androidx.compose.foundation.pager.PagerMeasureResult result, boolean visibleItemsStayedTheSame) {
        int calculateNewMaxScrollOffset;
        if (visibleItemsStayedTheSame) {
            this.scrollPosition.updateCurrentPageOffsetFraction(result.getCurrentPageOffsetFraction());
        } else {
            this.scrollPosition.updateFromMeasureResult(result);
            cancelPrefetchIfVisibleItemsChanged(result);
        }
        this.pagerLayoutInfoState.setValue(result);
        setCanScrollForward(result.getCanScrollForward());
        setCanScrollBackward(result.getCanScrollBackward());
        this.numMeasurePasses++;
        androidx.compose.foundation.pager.MeasuredPage firstVisiblePage = result.getFirstVisiblePage();
        if (firstVisiblePage != null) {
            this.firstVisiblePage = firstVisiblePage.getIndex();
        }
        this.firstVisiblePageOffset = result.getFirstVisiblePageScrollOffset();
        tryRunPrefetch(result);
        calculateNewMaxScrollOffset = androidx.compose.foundation.pager.PagerStateKt.calculateNewMaxScrollOffset(result, getPageCount());
        this.maxScrollOffset = calculateNewMaxScrollOffset;
    }

    private final void tryRunPrefetch(androidx.compose.foundation.pager.PagerMeasureResult result) {
        androidx.compose.runtime.snapshots.Snapshot createNonObservableSnapshot = androidx.compose.runtime.snapshots.Snapshot.INSTANCE.createNonObservableSnapshot();
        try {
            androidx.compose.runtime.snapshots.Snapshot makeCurrent = createNonObservableSnapshot.makeCurrent();
            try {
                if (java.lang.Math.abs(this.previousPassDelta) > 0.5f && this.prefetchingEnabled && isGestureActionMatchesScroll(this.previousPassDelta)) {
                    notifyPrefetch(this.previousPassDelta, result);
                }
                kotlin.Unit unit = kotlin.Unit.INSTANCE;
            } finally {
                createNonObservableSnapshot.restoreCurrent(makeCurrent);
            }
        } finally {
            createNonObservableSnapshot.dispose();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final int coerceInPageRange(int i) {
        if (getPageCount() > 0) {
            return kotlin.ranges.RangesKt.coerceIn(i, 0, getPageCount() - 1);
        }
        return 0;
    }

    private final boolean isGestureActionMatchesScroll(float scrollDelta) {
        if (getLayoutInfo().getOrientation() != androidx.compose.foundation.gestures.Orientation.Vertical ? java.lang.Math.signum(scrollDelta) != java.lang.Math.signum(-androidx.compose.ui.geometry.Offset.m1871getXimpl(m814getUpDownDifferenceF1C5BW0$foundation_release())) : java.lang.Math.signum(scrollDelta) != java.lang.Math.signum(-androidx.compose.ui.geometry.Offset.m1872getYimpl(m814getUpDownDifferenceF1C5BW0$foundation_release()))) {
            if (!isNotGestureAction()) {
                return false;
            }
        }
        return true;
    }

    private final boolean isNotGestureAction() {
        return ((int) androidx.compose.ui.geometry.Offset.m1871getXimpl(m814getUpDownDifferenceF1C5BW0$foundation_release())) == 0 && ((int) androidx.compose.ui.geometry.Offset.m1872getYimpl(m814getUpDownDifferenceF1C5BW0$foundation_release())) == 0;
    }

    private final void notifyPrefetch(float delta, androidx.compose.foundation.pager.PagerLayoutInfo info) {
        int index;
        androidx.compose.foundation.lazy.layout.LazyLayoutPrefetchState.PrefetchHandle prefetchHandle;
        if (this.prefetchingEnabled && (!info.getVisiblePagesInfo().isEmpty())) {
            boolean z = delta > 0.0f;
            if (z) {
                index = ((androidx.compose.foundation.pager.PageInfo) kotlin.collections.CollectionsKt.last((java.util.List) info.getVisiblePagesInfo())).getIndex() + info.getBeyondBoundsPageCount() + 1;
            } else {
                index = (((androidx.compose.foundation.pager.PageInfo) kotlin.collections.CollectionsKt.first((java.util.List) info.getVisiblePagesInfo())).getIndex() - info.getBeyondBoundsPageCount()) - 1;
            }
            if (index == this.indexToPrefetch || index < 0 || index >= getPageCount()) {
                return;
            }
            if (this.wasPrefetchingForward != z && (prefetchHandle = this.currentPrefetchHandle) != null) {
                prefetchHandle.cancel();
            }
            this.wasPrefetchingForward = z;
            this.indexToPrefetch = index;
            this.currentPrefetchHandle = this.prefetchState.m741schedulePrefetch0kLqBqw(index, this.premeasureConstraints);
        }
    }

    private final void cancelPrefetchIfVisibleItemsChanged(androidx.compose.foundation.pager.PagerLayoutInfo info) {
        int index;
        if (this.indexToPrefetch == -1 || !(!info.getVisiblePagesInfo().isEmpty())) {
            return;
        }
        if (this.wasPrefetchingForward) {
            index = ((androidx.compose.foundation.pager.PageInfo) kotlin.collections.CollectionsKt.last((java.util.List) info.getVisiblePagesInfo())).getIndex() + info.getBeyondBoundsPageCount() + 1;
        } else {
            index = (((androidx.compose.foundation.pager.PageInfo) kotlin.collections.CollectionsKt.first((java.util.List) info.getVisiblePagesInfo())).getIndex() - info.getBeyondBoundsPageCount()) - 1;
        }
        if (this.indexToPrefetch != index) {
            this.indexToPrefetch = -1;
            androidx.compose.foundation.lazy.layout.LazyLayoutPrefetchState.PrefetchHandle prefetchHandle = this.currentPrefetchHandle;
            if (prefetchHandle != null) {
                prefetchHandle.cancel();
            }
            this.currentPrefetchHandle = null;
        }
    }

    public final float getOffsetFractionForPage(int page) {
        if (page < 0 || page > getPageCount()) {
            throw new java.lang.IllegalArgumentException(("page " + page + " is not within the range 0 to " + getPageCount()).toString());
        }
        return (getCurrentPage() - page) + getCurrentPageOffsetFraction();
    }

    public static /* synthetic */ int matchScrollPositionWithKey$foundation_release$default(androidx.compose.foundation.pager.PagerState pagerState, androidx.compose.foundation.pager.PagerLazyLayoutItemProvider pagerLazyLayoutItemProvider, int i, int i2, java.lang.Object obj) {
        if (obj != null) {
            throw new java.lang.UnsupportedOperationException("Super calls with default arguments not supported in this target, function: matchScrollPositionWithKey");
        }
        if ((i2 & 2) != 0) {
            androidx.compose.runtime.snapshots.Snapshot createNonObservableSnapshot = androidx.compose.runtime.snapshots.Snapshot.INSTANCE.createNonObservableSnapshot();
            try {
                androidx.compose.runtime.snapshots.Snapshot makeCurrent = createNonObservableSnapshot.makeCurrent();
                try {
                    int currentPage = pagerState.scrollPosition.getCurrentPage();
                    createNonObservableSnapshot.dispose();
                    i = currentPage;
                } finally {
                    createNonObservableSnapshot.restoreCurrent(makeCurrent);
                }
            } catch (java.lang.Throwable th) {
                createNonObservableSnapshot.dispose();
                throw th;
            }
        }
        return pagerState.matchScrollPositionWithKey$foundation_release(pagerLazyLayoutItemProvider, i);
    }

    public final int matchScrollPositionWithKey$foundation_release(androidx.compose.foundation.pager.PagerLazyLayoutItemProvider itemProvider, int currentPage) {
        return this.scrollPosition.matchPageWithKey(itemProvider, currentPage);
    }
}
