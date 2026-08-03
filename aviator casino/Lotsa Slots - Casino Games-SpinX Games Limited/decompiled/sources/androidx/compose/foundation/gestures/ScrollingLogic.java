package androidx.compose.foundation.gestures;

/* compiled from: Scrollable.kt */
@kotlin.Metadata(d1 = {"\u0000h\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0007\n\u0002\b\u000f\b\u0002\u0018\u00002\u00020\u0001B7\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\u000b\u0012\u0006\u0010\f\u001a\u00020\r¢\u0006\u0002\u0010\u000eJ\u001b\u0010\u0018\u001a\u00020\u00192\u0006\u0010\u001a\u001a\u00020\u0019H\u0086@ø\u0001\u0000¢\u0006\u0004\b\u001b\u0010\u001cJ\u001b\u0010\u001d\u001a\u00020\u001e2\u0006\u0010\u001f\u001a\u00020\u0019H\u0086@ø\u0001\u0000¢\u0006\u0004\b \u0010\u001cJ\u0018\u0010!\u001a\u00020\"2\u0006\u0010#\u001a\u00020\"ø\u0001\u0000¢\u0006\u0004\b$\u0010%J\u000e\u0010&\u001a\u00020\u001e2\u0006\u0010'\u001a\u00020\tJ\u0006\u0010(\u001a\u00020\tJ8\u0010)\u001a\u00020\u001e2\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u00072\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\rJ$\u0010*\u001a\u00020\"*\u00020+2\u0006\u0010,\u001a\u00020\"2\u0006\u0010-\u001a\u00020.ø\u0001\u0000¢\u0006\u0004\b/\u00100J\u0014\u00101\u001a\u00020\"*\u00020\"ø\u0001\u0000¢\u0006\u0004\b2\u0010%J\n\u00101\u001a\u000203*\u000203J\u0014\u00104\u001a\u00020\"*\u00020\"ø\u0001\u0000¢\u0006\u0004\b5\u0010%J\u0014\u00106\u001a\u00020\u0019*\u00020\u0019ø\u0001\u0000¢\u0006\u0004\b7\u0010%J\u0014\u00108\u001a\u000203*\u00020\"ø\u0001\u0000¢\u0006\u0004\b9\u0010:J\u0014\u00108\u001a\u000203*\u00020\u0019ø\u0001\u0000¢\u0006\u0004\b;\u0010:J\u0017\u0010<\u001a\u00020\"*\u000203ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\b=\u0010>J\u001c\u0010)\u001a\u00020\u0019*\u00020\u00192\u0006\u0010?\u001a\u000203ø\u0001\u0000¢\u0006\u0004\b@\u0010AR\u000e\u0010\n\u001a\u00020\u000bX\u0082\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\t0\u0010X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\rX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0006\u001a\u0004\u0018\u00010\u0007X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0082\u000e¢\u0006\u0002\n\u0000R\u001a\u0010\u0002\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0011\u0010\u0012\"\u0004\b\u0013\u0010\u0014R\u0014\u0010\u0015\u001a\u00020\t8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u0016\u0010\u0017\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006B"}, d2 = {"Landroidx/compose/foundation/gestures/ScrollingLogic;", "", "scrollableState", "Landroidx/compose/foundation/gestures/ScrollableState;", "orientation", "Landroidx/compose/foundation/gestures/Orientation;", "overscrollEffect", "Landroidx/compose/foundation/OverscrollEffect;", "reverseDirection", "", "flingBehavior", "Landroidx/compose/foundation/gestures/FlingBehavior;", "nestedScrollDispatcher", "Landroidx/compose/ui/input/nestedscroll/NestedScrollDispatcher;", "(Landroidx/compose/foundation/gestures/ScrollableState;Landroidx/compose/foundation/gestures/Orientation;Landroidx/compose/foundation/OverscrollEffect;ZLandroidx/compose/foundation/gestures/FlingBehavior;Landroidx/compose/ui/input/nestedscroll/NestedScrollDispatcher;)V", "isNestedFlinging", "Landroidx/compose/runtime/MutableState;", "getScrollableState", "()Landroidx/compose/foundation/gestures/ScrollableState;", "setScrollableState", "(Landroidx/compose/foundation/gestures/ScrollableState;)V", "shouldDispatchOverscroll", "getShouldDispatchOverscroll", "()Z", "doFlingAnimation", "Landroidx/compose/ui/unit/Velocity;", "available", "doFlingAnimation-QWom1Mo", "(JLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "onDragStopped", "", "initialVelocity", "onDragStopped-sF-c-tU", "performRawScroll", "Landroidx/compose/ui/geometry/Offset;", com.helpshift.proactive.InAppViewConstants.SCROLL, "performRawScroll-MK-Hz9U", "(J)J", "registerNestedFling", "isFlinging", "shouldScrollImmediately", "update", "dispatchScroll", "Landroidx/compose/foundation/gestures/ScrollScope;", "initialAvailableDelta", "source", "Landroidx/compose/ui/input/nestedscroll/NestedScrollSource;", "dispatchScroll-3eAAhYA", "(Landroidx/compose/foundation/gestures/ScrollScope;JI)J", "reverseIfNeeded", "reverseIfNeeded-MK-Hz9U", "", "singleAxisOffset", "singleAxisOffset-MK-Hz9U", "singleAxisVelocity", "singleAxisVelocity-AH228Gc", "toFloat", "toFloat-k-4lQ0M", "(J)F", "toFloat-TH1AsA0", "toOffset", "toOffset-tuRUvjQ", "(F)J", "newValue", "update-QWom1Mo", "(JF)J", "foundation_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
final class ScrollingLogic {
    private androidx.compose.foundation.gestures.FlingBehavior flingBehavior;
    private final androidx.compose.runtime.MutableState<java.lang.Boolean> isNestedFlinging = androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(false, null, 2, null);
    private androidx.compose.ui.input.nestedscroll.NestedScrollDispatcher nestedScrollDispatcher;
    private androidx.compose.foundation.gestures.Orientation orientation;
    private androidx.compose.foundation.OverscrollEffect overscrollEffect;
    private boolean reverseDirection;
    private androidx.compose.foundation.gestures.ScrollableState scrollableState;

    public ScrollingLogic(androidx.compose.foundation.gestures.ScrollableState scrollableState, androidx.compose.foundation.gestures.Orientation orientation, androidx.compose.foundation.OverscrollEffect overscrollEffect, boolean z, androidx.compose.foundation.gestures.FlingBehavior flingBehavior, androidx.compose.ui.input.nestedscroll.NestedScrollDispatcher nestedScrollDispatcher) {
        this.scrollableState = scrollableState;
        this.orientation = orientation;
        this.overscrollEffect = overscrollEffect;
        this.reverseDirection = z;
        this.flingBehavior = flingBehavior;
        this.nestedScrollDispatcher = nestedScrollDispatcher;
    }

    public final androidx.compose.foundation.gestures.ScrollableState getScrollableState() {
        return this.scrollableState;
    }

    public final void setScrollableState(androidx.compose.foundation.gestures.ScrollableState scrollableState) {
        this.scrollableState = scrollableState;
    }

    /* renamed from: toOffset-tuRUvjQ, reason: not valid java name */
    public final long m414toOffsettuRUvjQ(float f) {
        if (f == 0.0f) {
            return androidx.compose.ui.geometry.Offset.INSTANCE.m1887getZeroF1C5BW0();
        }
        return this.orientation == androidx.compose.foundation.gestures.Orientation.Horizontal ? androidx.compose.ui.geometry.OffsetKt.Offset(f, 0.0f) : androidx.compose.ui.geometry.OffsetKt.Offset(0.0f, f);
    }

    /* renamed from: singleAxisOffset-MK-Hz9U, reason: not valid java name */
    public final long m410singleAxisOffsetMKHz9U(long j) {
        return this.orientation == androidx.compose.foundation.gestures.Orientation.Horizontal ? androidx.compose.ui.geometry.Offset.m1865copydBAh8RU$default(j, 0.0f, 0.0f, 1, null) : androidx.compose.ui.geometry.Offset.m1865copydBAh8RU$default(j, 0.0f, 0.0f, 2, null);
    }

    /* renamed from: toFloat-k-4lQ0M, reason: not valid java name */
    public final float m413toFloatk4lQ0M(long j) {
        return this.orientation == androidx.compose.foundation.gestures.Orientation.Horizontal ? androidx.compose.ui.geometry.Offset.m1871getXimpl(j) : androidx.compose.ui.geometry.Offset.m1872getYimpl(j);
    }

    /* renamed from: toFloat-TH1AsA0, reason: not valid java name */
    public final float m412toFloatTH1AsA0(long j) {
        return this.orientation == androidx.compose.foundation.gestures.Orientation.Horizontal ? androidx.compose.ui.unit.Velocity.m4717getXimpl(j) : androidx.compose.ui.unit.Velocity.m4718getYimpl(j);
    }

    /* renamed from: singleAxisVelocity-AH228Gc, reason: not valid java name */
    public final long m411singleAxisVelocityAH228Gc(long j) {
        return this.orientation == androidx.compose.foundation.gestures.Orientation.Horizontal ? androidx.compose.ui.unit.Velocity.m4713copyOhffZ5M$default(j, 0.0f, 0.0f, 1, null) : androidx.compose.ui.unit.Velocity.m4713copyOhffZ5M$default(j, 0.0f, 0.0f, 2, null);
    }

    /* renamed from: update-QWom1Mo, reason: not valid java name */
    public final long m415updateQWom1Mo(long j, float f) {
        return this.orientation == androidx.compose.foundation.gestures.Orientation.Horizontal ? androidx.compose.ui.unit.Velocity.m4713copyOhffZ5M$default(j, f, 0.0f, 2, null) : androidx.compose.ui.unit.Velocity.m4713copyOhffZ5M$default(j, 0.0f, f, 1, null);
    }

    public final float reverseIfNeeded(float f) {
        return this.reverseDirection ? f * (-1) : f;
    }

    /* renamed from: reverseIfNeeded-MK-Hz9U, reason: not valid java name */
    public final long m409reverseIfNeededMKHz9U(long j) {
        return this.reverseDirection ? androidx.compose.ui.geometry.Offset.m1878timestuRUvjQ(j, -1.0f) : j;
    }

    /* renamed from: dispatchScroll-3eAAhYA, reason: not valid java name */
    public final long m405dispatchScroll3eAAhYA(final androidx.compose.foundation.gestures.ScrollScope scrollScope, long j, final int i) {
        kotlin.jvm.functions.Function1<androidx.compose.ui.geometry.Offset, androidx.compose.ui.geometry.Offset> function1 = new kotlin.jvm.functions.Function1<androidx.compose.ui.geometry.Offset, androidx.compose.ui.geometry.Offset>() { // from class: androidx.compose.foundation.gestures.ScrollingLogic$dispatchScroll$performScroll$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ androidx.compose.ui.geometry.Offset invoke(androidx.compose.ui.geometry.Offset offset) {
                return androidx.compose.ui.geometry.Offset.m1860boximpl(m416invokeMKHz9U(offset.getPackedValue()));
            }

            /* renamed from: invoke-MK-Hz9U, reason: not valid java name */
            public final long m416invokeMKHz9U(long j2) {
                androidx.compose.ui.input.nestedscroll.NestedScrollDispatcher nestedScrollDispatcher;
                androidx.compose.ui.input.nestedscroll.NestedScrollDispatcher nestedScrollDispatcher2;
                nestedScrollDispatcher = androidx.compose.foundation.gestures.ScrollingLogic.this.nestedScrollDispatcher;
                long m3159dispatchPreScrollOzD1aCk = nestedScrollDispatcher.m3159dispatchPreScrollOzD1aCk(j2, i);
                long m1875minusMKHz9U = androidx.compose.ui.geometry.Offset.m1875minusMKHz9U(j2, m3159dispatchPreScrollOzD1aCk);
                androidx.compose.foundation.gestures.ScrollingLogic scrollingLogic = androidx.compose.foundation.gestures.ScrollingLogic.this;
                float m413toFloatk4lQ0M = scrollingLogic.m413toFloatk4lQ0M(scrollingLogic.m409reverseIfNeededMKHz9U(scrollingLogic.m410singleAxisOffsetMKHz9U(m1875minusMKHz9U)));
                androidx.compose.foundation.gestures.ScrollingLogic scrollingLogic2 = androidx.compose.foundation.gestures.ScrollingLogic.this;
                long m409reverseIfNeededMKHz9U = scrollingLogic2.m409reverseIfNeededMKHz9U(scrollingLogic2.m414toOffsettuRUvjQ(scrollScope.scrollBy(m413toFloatk4lQ0M)));
                long m1875minusMKHz9U2 = androidx.compose.ui.geometry.Offset.m1875minusMKHz9U(m1875minusMKHz9U, m409reverseIfNeededMKHz9U);
                nestedScrollDispatcher2 = androidx.compose.foundation.gestures.ScrollingLogic.this.nestedScrollDispatcher;
                return androidx.compose.ui.geometry.Offset.m1876plusMKHz9U(androidx.compose.ui.geometry.Offset.m1876plusMKHz9U(m3159dispatchPreScrollOzD1aCk, m409reverseIfNeededMKHz9U), nestedScrollDispatcher2.m3157dispatchPostScrollDzOQY0M(m409reverseIfNeededMKHz9U, m1875minusMKHz9U2, i));
            }
        };
        androidx.compose.foundation.OverscrollEffect overscrollEffect = this.overscrollEffect;
        if (androidx.compose.ui.input.nestedscroll.NestedScrollSource.m3163equalsimpl0(i, androidx.compose.ui.input.nestedscroll.NestedScrollSource.INSTANCE.m3171getWheelWNlRxjI())) {
            return function1.invoke(androidx.compose.ui.geometry.Offset.m1860boximpl(j)).getPackedValue();
        }
        if (overscrollEffect != null && getShouldDispatchOverscroll()) {
            return overscrollEffect.mo193applyToScrollRhakbz0(j, i, function1);
        }
        return function1.invoke(androidx.compose.ui.geometry.Offset.m1860boximpl(j)).getPackedValue();
    }

    private final boolean getShouldDispatchOverscroll() {
        return this.scrollableState.getCanScrollForward() || this.scrollableState.getCanScrollBackward();
    }

    /* renamed from: performRawScroll-MK-Hz9U, reason: not valid java name */
    public final long m408performRawScrollMKHz9U(long scroll) {
        if (this.scrollableState.isScrollInProgress()) {
            return androidx.compose.ui.geometry.Offset.INSTANCE.m1887getZeroF1C5BW0();
        }
        return m414toOffsettuRUvjQ(reverseIfNeeded(this.scrollableState.dispatchRawDelta(reverseIfNeeded(m413toFloatk4lQ0M(scroll)))));
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x003a  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0025  */
    /* renamed from: onDragStopped-sF-c-tU, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object m407onDragStoppedsFctU(long j, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        androidx.compose.foundation.gestures.ScrollingLogic$onDragStopped$1 scrollingLogic$onDragStopped$1;
        int i;
        androidx.compose.foundation.gestures.ScrollingLogic scrollingLogic;
        if (continuation instanceof androidx.compose.foundation.gestures.ScrollingLogic$onDragStopped$1) {
            scrollingLogic$onDragStopped$1 = (androidx.compose.foundation.gestures.ScrollingLogic$onDragStopped$1) continuation;
            if ((scrollingLogic$onDragStopped$1.label & Integer.MIN_VALUE) != 0) {
                scrollingLogic$onDragStopped$1.label -= Integer.MIN_VALUE;
                java.lang.Object obj = scrollingLogic$onDragStopped$1.result;
                java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = scrollingLogic$onDragStopped$1.label;
                if (i != 0) {
                    kotlin.ResultKt.throwOnFailure(obj);
                    registerNestedFling(true);
                    long m411singleAxisVelocityAH228Gc = m411singleAxisVelocityAH228Gc(j);
                    androidx.compose.foundation.gestures.ScrollingLogic$onDragStopped$performFling$1 scrollingLogic$onDragStopped$performFling$1 = new androidx.compose.foundation.gestures.ScrollingLogic$onDragStopped$performFling$1(this, null);
                    androidx.compose.foundation.OverscrollEffect overscrollEffect = this.overscrollEffect;
                    if (overscrollEffect != null && getShouldDispatchOverscroll()) {
                        scrollingLogic$onDragStopped$1.L$0 = this;
                        scrollingLogic$onDragStopped$1.label = 1;
                        if (overscrollEffect.mo192applyToFlingBMRW4eQ(m411singleAxisVelocityAH228Gc, scrollingLogic$onDragStopped$performFling$1, scrollingLogic$onDragStopped$1) == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                    } else {
                        androidx.compose.ui.unit.Velocity m4708boximpl = androidx.compose.ui.unit.Velocity.m4708boximpl(m411singleAxisVelocityAH228Gc);
                        scrollingLogic$onDragStopped$1.L$0 = this;
                        scrollingLogic$onDragStopped$1.label = 2;
                        if (scrollingLogic$onDragStopped$performFling$1.invoke(m4708boximpl, scrollingLogic$onDragStopped$1) == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                    }
                    scrollingLogic = this;
                } else {
                    if (i != 1 && i != 2) {
                        throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    scrollingLogic = (androidx.compose.foundation.gestures.ScrollingLogic) scrollingLogic$onDragStopped$1.L$0;
                    kotlin.ResultKt.throwOnFailure(obj);
                }
                scrollingLogic.registerNestedFling(false);
                return kotlin.Unit.INSTANCE;
            }
        }
        scrollingLogic$onDragStopped$1 = new androidx.compose.foundation.gestures.ScrollingLogic$onDragStopped$1(this, continuation);
        java.lang.Object obj2 = scrollingLogic$onDragStopped$1.result;
        java.lang.Object coroutine_suspended2 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = scrollingLogic$onDragStopped$1.label;
        if (i != 0) {
        }
        scrollingLogic.registerNestedFling(false);
        return kotlin.Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0037  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0025  */
    /* renamed from: doFlingAnimation-QWom1Mo, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object m406doFlingAnimationQWom1Mo(long j, kotlin.coroutines.Continuation<? super androidx.compose.ui.unit.Velocity> continuation) {
        androidx.compose.foundation.gestures.ScrollingLogic$doFlingAnimation$1 scrollingLogic$doFlingAnimation$1;
        int i;
        kotlin.jvm.internal.Ref.LongRef longRef;
        if (continuation instanceof androidx.compose.foundation.gestures.ScrollingLogic$doFlingAnimation$1) {
            scrollingLogic$doFlingAnimation$1 = (androidx.compose.foundation.gestures.ScrollingLogic$doFlingAnimation$1) continuation;
            if ((scrollingLogic$doFlingAnimation$1.label & Integer.MIN_VALUE) != 0) {
                scrollingLogic$doFlingAnimation$1.label -= Integer.MIN_VALUE;
                androidx.compose.foundation.gestures.ScrollingLogic$doFlingAnimation$1 scrollingLogic$doFlingAnimation$12 = scrollingLogic$doFlingAnimation$1;
                java.lang.Object obj = scrollingLogic$doFlingAnimation$12.result;
                java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = scrollingLogic$doFlingAnimation$12.label;
                if (i != 0) {
                    kotlin.ResultKt.throwOnFailure(obj);
                    kotlin.jvm.internal.Ref.LongRef longRef2 = new kotlin.jvm.internal.Ref.LongRef();
                    longRef2.element = j;
                    androidx.compose.foundation.gestures.ScrollableState scrollableState = this.scrollableState;
                    androidx.compose.foundation.gestures.ScrollingLogic$doFlingAnimation$2 scrollingLogic$doFlingAnimation$2 = new androidx.compose.foundation.gestures.ScrollingLogic$doFlingAnimation$2(this, longRef2, j, null);
                    scrollingLogic$doFlingAnimation$12.L$0 = longRef2;
                    scrollingLogic$doFlingAnimation$12.label = 1;
                    if (androidx.compose.foundation.gestures.ScrollableState.CC.scroll$default(scrollableState, null, scrollingLogic$doFlingAnimation$2, scrollingLogic$doFlingAnimation$12, 1, null) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    longRef = longRef2;
                } else {
                    if (i != 1) {
                        throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    longRef = (kotlin.jvm.internal.Ref.LongRef) scrollingLogic$doFlingAnimation$12.L$0;
                    kotlin.ResultKt.throwOnFailure(obj);
                }
                return androidx.compose.ui.unit.Velocity.m4708boximpl(longRef.element);
            }
        }
        scrollingLogic$doFlingAnimation$1 = new androidx.compose.foundation.gestures.ScrollingLogic$doFlingAnimation$1(this, continuation);
        androidx.compose.foundation.gestures.ScrollingLogic$doFlingAnimation$1 scrollingLogic$doFlingAnimation$122 = scrollingLogic$doFlingAnimation$1;
        java.lang.Object obj2 = scrollingLogic$doFlingAnimation$122.result;
        java.lang.Object coroutine_suspended2 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = scrollingLogic$doFlingAnimation$122.label;
        if (i != 0) {
        }
        return androidx.compose.ui.unit.Velocity.m4708boximpl(longRef.element);
    }

    public final boolean shouldScrollImmediately() {
        androidx.compose.foundation.OverscrollEffect overscrollEffect;
        return this.scrollableState.isScrollInProgress() || this.isNestedFlinging.getValue().booleanValue() || ((overscrollEffect = this.overscrollEffect) != null && overscrollEffect.isInProgress());
    }

    public final void registerNestedFling(boolean isFlinging) {
        this.isNestedFlinging.setValue(java.lang.Boolean.valueOf(isFlinging));
    }

    public final void update(androidx.compose.foundation.gestures.ScrollableState scrollableState, androidx.compose.foundation.gestures.Orientation orientation, androidx.compose.foundation.OverscrollEffect overscrollEffect, boolean reverseDirection, androidx.compose.foundation.gestures.FlingBehavior flingBehavior, androidx.compose.ui.input.nestedscroll.NestedScrollDispatcher nestedScrollDispatcher) {
        this.scrollableState = scrollableState;
        this.orientation = orientation;
        this.overscrollEffect = overscrollEffect;
        this.reverseDirection = reverseDirection;
        this.flingBehavior = flingBehavior;
        this.nestedScrollDispatcher = nestedScrollDispatcher;
    }
}
