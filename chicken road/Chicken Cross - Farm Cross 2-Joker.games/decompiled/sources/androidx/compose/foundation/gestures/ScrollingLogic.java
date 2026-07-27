package androidx.compose.foundation.gestures;

import androidx.compose.foundation.OverscrollEffect;
import androidx.compose.runtime.State;
import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.geometry.OffsetKt;
import androidx.compose.ui.input.nestedscroll.NestedScrollDispatcher;
import androidx.compose.ui.unit.Velocity;
import androidx.compose.ui.unit.VelocityKt;
import com.ironsource.U3;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref;

/* compiled from: Scrollable.kt */
@Metadata(d1 = {"\u0000b\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0012\b\u0002\u0018\u00002\u00020\u0001B=\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007\u0012\u0006\u0010\t\u001a\u00020\n\u0012\u0006\u0010\u000b\u001a\u00020\f\u0012\b\u0010\r\u001a\u0004\u0018\u00010\u000e¢\u0006\u0002\u0010\u000fJ!\u0010\u001c\u001a\u00020\u001d2\u0006\u0010\u001e\u001a\u00020\u001dH\u0086@ø\u0001\u0000ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u001f\u0010 J\u0019\u0010!\u001a\u00020\"2\u0006\u0010#\u001a\u00020$H\u0086@ø\u0001\u0000¢\u0006\u0002\u0010%J\u001b\u0010&\u001a\u00020'2\u0006\u0010(\u001a\u00020'ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b)\u0010*J\u0006\u0010+\u001a\u00020\u0005J1\u0010,\u001a\u00020'*\u00020-2\u0006\u0010.\u001a\u00020'2\b\u0010/\u001a\u0004\u0018\u00010'2\u0006\u00100\u001a\u000201ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b2\u00103J\u0017\u00104\u001a\u00020'*\u00020'ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b5\u0010*J\n\u00104\u001a\u00020$*\u00020$J\u0017\u00106\u001a\u00020$*\u00020'ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b7\u00108J\u0017\u00106\u001a\u00020$*\u00020\u001dø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b9\u00108J\u001a\u0010:\u001a\u00020'*\u00020$ø\u0001\u0000ø\u0001\u0002ø\u0001\u0001¢\u0006\u0004\b;\u0010<J\u001a\u0010=\u001a\u00020\u001d*\u00020$ø\u0001\u0000ø\u0001\u0002ø\u0001\u0001¢\u0006\u0004\b>\u0010<J\u001f\u0010?\u001a\u00020\u001d*\u00020\u001d2\u0006\u0010@\u001a\u00020$ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\bA\u0010BR\u0011\u0010\u000b\u001a\u00020\f¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0017\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015R\u0013\u0010\r\u001a\u0004\u0018\u00010\u000e¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0017R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0019R\u0011\u0010\t\u001a\u00020\n¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u001b\u0082\u0002\u000f\n\u0002\b\u0019\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006C"}, d2 = {"Landroidx/compose/foundation/gestures/ScrollingLogic;", "", U3.i.n, "Landroidx/compose/foundation/gestures/Orientation;", "reverseDirection", "", "nestedScrollDispatcher", "Landroidx/compose/runtime/State;", "Landroidx/compose/ui/input/nestedscroll/NestedScrollDispatcher;", "scrollableState", "Landroidx/compose/foundation/gestures/ScrollableState;", "flingBehavior", "Landroidx/compose/foundation/gestures/FlingBehavior;", "overscrollEffect", "Landroidx/compose/foundation/OverscrollEffect;", "(Landroidx/compose/foundation/gestures/Orientation;ZLandroidx/compose/runtime/State;Landroidx/compose/foundation/gestures/ScrollableState;Landroidx/compose/foundation/gestures/FlingBehavior;Landroidx/compose/foundation/OverscrollEffect;)V", "getFlingBehavior", "()Landroidx/compose/foundation/gestures/FlingBehavior;", "getNestedScrollDispatcher", "()Landroidx/compose/runtime/State;", "getOrientation", "()Landroidx/compose/foundation/gestures/Orientation;", "getOverscrollEffect", "()Landroidx/compose/foundation/OverscrollEffect;", "getReverseDirection", "()Z", "getScrollableState", "()Landroidx/compose/foundation/gestures/ScrollableState;", "doFlingAnimation", "Landroidx/compose/ui/unit/Velocity;", "available", "doFlingAnimation-QWom1Mo", "(JLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "onDragStopped", "", "axisVelocity", "", "(FLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "performRawScroll", "Landroidx/compose/ui/geometry/Offset;", "scroll", "performRawScroll-MK-Hz9U", "(J)J", "shouldScrollImmediately", "dispatchScroll", "Landroidx/compose/foundation/gestures/ScrollScope;", "scrollDelta", "pointerPosition", "source", "Landroidx/compose/ui/input/nestedscroll/NestedScrollSource;", "dispatchScroll-f0eR0lY", "(Landroidx/compose/foundation/gestures/ScrollScope;JLandroidx/compose/ui/geometry/Offset;I)J", "reverseIfNeeded", "reverseIfNeeded-MK-Hz9U", "toFloat", "toFloat-k-4lQ0M", "(J)F", "toFloat-TH1AsA0", "toOffset", "toOffset-tuRUvjQ", "(F)J", "toVelocity", "toVelocity-adjELrA", "update", "newValue", "update-QWom1Mo", "(JF)J", "foundation_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
/* loaded from: classes.dex */
final class ScrollingLogic {
    private final FlingBehavior flingBehavior;
    private final State<NestedScrollDispatcher> nestedScrollDispatcher;
    private final Orientation orientation;
    private final OverscrollEffect overscrollEffect;
    private final boolean reverseDirection;
    private final ScrollableState scrollableState;

    public ScrollingLogic(Orientation orientation, boolean z, State<NestedScrollDispatcher> nestedScrollDispatcher, ScrollableState scrollableState, FlingBehavior flingBehavior, OverscrollEffect overscrollEffect) {
        Intrinsics.checkNotNullParameter(orientation, "orientation");
        Intrinsics.checkNotNullParameter(nestedScrollDispatcher, "nestedScrollDispatcher");
        Intrinsics.checkNotNullParameter(scrollableState, "scrollableState");
        Intrinsics.checkNotNullParameter(flingBehavior, "flingBehavior");
        this.orientation = orientation;
        this.reverseDirection = z;
        this.nestedScrollDispatcher = nestedScrollDispatcher;
        this.scrollableState = scrollableState;
        this.flingBehavior = flingBehavior;
        this.overscrollEffect = overscrollEffect;
    }

    public final Orientation getOrientation() {
        return this.orientation;
    }

    public final boolean getReverseDirection() {
        return this.reverseDirection;
    }

    public final State<NestedScrollDispatcher> getNestedScrollDispatcher() {
        return this.nestedScrollDispatcher;
    }

    public final ScrollableState getScrollableState() {
        return this.scrollableState;
    }

    public final FlingBehavior getFlingBehavior() {
        return this.flingBehavior;
    }

    public final OverscrollEffect getOverscrollEffect() {
        return this.overscrollEffect;
    }

    /* renamed from: toOffset-tuRUvjQ, reason: not valid java name */
    public final long m328toOffsettuRUvjQ(float f) {
        if (f == 0.0f) {
            return Offset.INSTANCE.m1408getZeroF1C5BW0();
        }
        return this.orientation == Orientation.Horizontal ? OffsetKt.Offset(f, 0.0f) : OffsetKt.Offset(0.0f, f);
    }

    /* renamed from: toVelocity-adjELrA, reason: not valid java name */
    public final long m329toVelocityadjELrA(float f) {
        return this.orientation == Orientation.Horizontal ? VelocityKt.Velocity(f, 0.0f) : VelocityKt.Velocity(0.0f, f);
    }

    /* renamed from: toFloat-k-4lQ0M, reason: not valid java name */
    public final float m327toFloatk4lQ0M(long j) {
        return this.orientation == Orientation.Horizontal ? Offset.m1392getXimpl(j) : Offset.m1393getYimpl(j);
    }

    /* renamed from: toFloat-TH1AsA0, reason: not valid java name */
    public final float m326toFloatTH1AsA0(long j) {
        return this.orientation == Orientation.Horizontal ? Velocity.m4065getXimpl(j) : Velocity.m4066getYimpl(j);
    }

    /* renamed from: update-QWom1Mo, reason: not valid java name */
    public final long m330updateQWom1Mo(long j, float f) {
        return this.orientation == Orientation.Horizontal ? Velocity.m4061copyOhffZ5M$default(j, f, 0.0f, 2, null) : Velocity.m4061copyOhffZ5M$default(j, 0.0f, f, 1, null);
    }

    public final float reverseIfNeeded(float f) {
        return this.reverseDirection ? f * (-1) : f;
    }

    /* renamed from: reverseIfNeeded-MK-Hz9U, reason: not valid java name */
    public final long m325reverseIfNeededMKHz9U(long j) {
        return this.reverseDirection ? Offset.m1399timestuRUvjQ(j, -1.0f) : j;
    }

    /* renamed from: dispatchScroll-f0eR0lY, reason: not valid java name */
    public final long m322dispatchScrollf0eR0lY(ScrollScope dispatchScroll, long j, Offset offset, int i) {
        long m1408getZeroF1C5BW0;
        Intrinsics.checkNotNullParameter(dispatchScroll, "$this$dispatchScroll");
        OverscrollEffect overscrollEffect = this.overscrollEffect;
        if (overscrollEffect != null && overscrollEffect.isEnabled()) {
            m1408getZeroF1C5BW0 = this.overscrollEffect.mo168consumePreScrollA0NYTsA(j, offset, i);
        } else {
            m1408getZeroF1C5BW0 = Offset.INSTANCE.m1408getZeroF1C5BW0();
        }
        long m1396minusMKHz9U = Offset.m1396minusMKHz9U(j, m1408getZeroF1C5BW0);
        NestedScrollDispatcher value = this.nestedScrollDispatcher.getValue();
        long m1396minusMKHz9U2 = Offset.m1396minusMKHz9U(m1396minusMKHz9U, value.m2886dispatchPreScrollOzD1aCk(m1396minusMKHz9U, i));
        long m325reverseIfNeededMKHz9U = m325reverseIfNeededMKHz9U(m328toOffsettuRUvjQ(dispatchScroll.scrollBy(m327toFloatk4lQ0M(m325reverseIfNeededMKHz9U(m1396minusMKHz9U2)))));
        long m1396minusMKHz9U3 = Offset.m1396minusMKHz9U(m1396minusMKHz9U2, m325reverseIfNeededMKHz9U);
        long m2884dispatchPostScrollDzOQY0M = value.m2884dispatchPostScrollDzOQY0M(m325reverseIfNeededMKHz9U, m1396minusMKHz9U3, i);
        OverscrollEffect overscrollEffect2 = this.overscrollEffect;
        if (overscrollEffect2 != null && overscrollEffect2.isEnabled()) {
            this.overscrollEffect.mo166consumePostScrolll7mfB5k(m1396minusMKHz9U2, Offset.m1396minusMKHz9U(m1396minusMKHz9U3, m2884dispatchPostScrollDzOQY0M), offset, i);
        }
        return m1396minusMKHz9U3;
    }

    /* renamed from: performRawScroll-MK-Hz9U, reason: not valid java name */
    public final long m324performRawScrollMKHz9U(long scroll) {
        if (this.scrollableState.isScrollInProgress()) {
            return Offset.INSTANCE.m1408getZeroF1C5BW0();
        }
        return m328toOffsettuRUvjQ(reverseIfNeeded(this.scrollableState.dispatchRawDelta(reverseIfNeeded(m327toFloatk4lQ0M(scroll)))));
    }

    /* JADX WARN: Removed duplicated region for block: B:32:0x00fb A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00fc  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00d7 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00d8  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00bf A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00c0  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x006e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0029  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object onDragStopped(float f, Continuation<? super Unit> continuation) {
        ScrollingLogic$onDragStopped$1 scrollingLogic$onDragStopped$1;
        Object obj;
        Object coroutine_suspended;
        int i;
        float f2;
        float f3;
        ScrollingLogic scrollingLogic;
        ScrollingLogic scrollingLogic2;
        ScrollingLogic scrollingLogic3;
        long j;
        long j2;
        long j3;
        OverscrollEffect overscrollEffect;
        if (continuation instanceof ScrollingLogic$onDragStopped$1) {
            scrollingLogic$onDragStopped$1 = (ScrollingLogic$onDragStopped$1) continuation;
            if ((scrollingLogic$onDragStopped$1.label & Integer.MIN_VALUE) != 0) {
                scrollingLogic$onDragStopped$1.label -= Integer.MIN_VALUE;
                obj = scrollingLogic$onDragStopped$1.result;
                coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = scrollingLogic$onDragStopped$1.label;
                if (i != 0) {
                    ResultKt.throwOnFailure(obj);
                    OverscrollEffect overscrollEffect2 = this.overscrollEffect;
                    if (overscrollEffect2 != null && overscrollEffect2.isEnabled()) {
                        OverscrollEffect overscrollEffect3 = this.overscrollEffect;
                        long m329toVelocityadjELrA = m329toVelocityadjELrA(f);
                        scrollingLogic$onDragStopped$1.L$0 = this;
                        scrollingLogic$onDragStopped$1.L$1 = this;
                        scrollingLogic$onDragStopped$1.F$0 = f;
                        scrollingLogic$onDragStopped$1.label = 1;
                        obj = overscrollEffect3.mo167consumePreFlingQWom1Mo(m329toVelocityadjELrA, scrollingLogic$onDragStopped$1);
                        if (obj == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                        scrollingLogic2 = this;
                        scrollingLogic3 = scrollingLogic2;
                    } else {
                        f2 = 0.0f;
                        f3 = f;
                        scrollingLogic = this;
                        long m329toVelocityadjELrA2 = scrollingLogic.m329toVelocityadjELrA(f3 - f2);
                        NestedScrollDispatcher value = scrollingLogic.nestedScrollDispatcher.getValue();
                        scrollingLogic$onDragStopped$1.L$0 = scrollingLogic;
                        scrollingLogic$onDragStopped$1.L$1 = null;
                        scrollingLogic$onDragStopped$1.J$0 = m329toVelocityadjELrA2;
                        scrollingLogic$onDragStopped$1.label = 2;
                        obj = value.m2885dispatchPreFlingQWom1Mo(m329toVelocityadjELrA2, scrollingLogic$onDragStopped$1);
                        if (obj == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                        j = m329toVelocityadjELrA2;
                        long m4068minusAH228Gc = Velocity.m4068minusAH228Gc(j, ((Velocity) obj).getPackedValue());
                        scrollingLogic$onDragStopped$1.L$0 = scrollingLogic;
                        scrollingLogic$onDragStopped$1.J$0 = m4068minusAH228Gc;
                        scrollingLogic$onDragStopped$1.label = 3;
                        obj = scrollingLogic.m323doFlingAnimationQWom1Mo(m4068minusAH228Gc, scrollingLogic$onDragStopped$1);
                        if (obj != coroutine_suspended) {
                        }
                    }
                } else if (i == 1) {
                    f = scrollingLogic$onDragStopped$1.F$0;
                    scrollingLogic2 = (ScrollingLogic) scrollingLogic$onDragStopped$1.L$1;
                    scrollingLogic3 = (ScrollingLogic) scrollingLogic$onDragStopped$1.L$0;
                    ResultKt.throwOnFailure(obj);
                } else {
                    if (i != 2) {
                        if (i == 3) {
                            j2 = scrollingLogic$onDragStopped$1.J$0;
                            scrollingLogic = (ScrollingLogic) scrollingLogic$onDragStopped$1.L$0;
                            ResultKt.throwOnFailure(obj);
                            long packedValue = ((Velocity) obj).getPackedValue();
                            NestedScrollDispatcher value2 = scrollingLogic.nestedScrollDispatcher.getValue();
                            long m4068minusAH228Gc2 = Velocity.m4068minusAH228Gc(j2, packedValue);
                            scrollingLogic$onDragStopped$1.L$0 = scrollingLogic;
                            scrollingLogic$onDragStopped$1.J$0 = packedValue;
                            scrollingLogic$onDragStopped$1.label = 4;
                            obj = value2.m2883dispatchPostFlingRZ2iAVY(m4068minusAH228Gc2, packedValue, scrollingLogic$onDragStopped$1);
                            if (obj != coroutine_suspended) {
                                return coroutine_suspended;
                            }
                            j3 = packedValue;
                            long m4068minusAH228Gc3 = Velocity.m4068minusAH228Gc(j3, ((Velocity) obj).getPackedValue());
                            overscrollEffect = scrollingLogic.overscrollEffect;
                            if (overscrollEffect != null) {
                            }
                            return Unit.INSTANCE;
                        }
                        if (i != 4) {
                            if (i == 5) {
                                ResultKt.throwOnFailure(obj);
                                return Unit.INSTANCE;
                            }
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        j3 = scrollingLogic$onDragStopped$1.J$0;
                        scrollingLogic = (ScrollingLogic) scrollingLogic$onDragStopped$1.L$0;
                        ResultKt.throwOnFailure(obj);
                        long m4068minusAH228Gc32 = Velocity.m4068minusAH228Gc(j3, ((Velocity) obj).getPackedValue());
                        overscrollEffect = scrollingLogic.overscrollEffect;
                        if (overscrollEffect != null || !overscrollEffect.isEnabled()) {
                            return Unit.INSTANCE;
                        }
                        OverscrollEffect overscrollEffect4 = scrollingLogic.overscrollEffect;
                        long m329toVelocityadjELrA3 = scrollingLogic.m329toVelocityadjELrA(scrollingLogic.m326toFloatTH1AsA0(m4068minusAH228Gc32));
                        scrollingLogic$onDragStopped$1.L$0 = null;
                        scrollingLogic$onDragStopped$1.label = 5;
                        if (overscrollEffect4.mo165consumePostFlingsFctU(m329toVelocityadjELrA3, scrollingLogic$onDragStopped$1) == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                        return Unit.INSTANCE;
                    }
                    j = scrollingLogic$onDragStopped$1.J$0;
                    scrollingLogic = (ScrollingLogic) scrollingLogic$onDragStopped$1.L$0;
                    ResultKt.throwOnFailure(obj);
                    long m4068minusAH228Gc4 = Velocity.m4068minusAH228Gc(j, ((Velocity) obj).getPackedValue());
                    scrollingLogic$onDragStopped$1.L$0 = scrollingLogic;
                    scrollingLogic$onDragStopped$1.J$0 = m4068minusAH228Gc4;
                    scrollingLogic$onDragStopped$1.label = 3;
                    obj = scrollingLogic.m323doFlingAnimationQWom1Mo(m4068minusAH228Gc4, scrollingLogic$onDragStopped$1);
                    if (obj != coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    j2 = m4068minusAH228Gc4;
                    long packedValue2 = ((Velocity) obj).getPackedValue();
                    NestedScrollDispatcher value22 = scrollingLogic.nestedScrollDispatcher.getValue();
                    long m4068minusAH228Gc22 = Velocity.m4068minusAH228Gc(j2, packedValue2);
                    scrollingLogic$onDragStopped$1.L$0 = scrollingLogic;
                    scrollingLogic$onDragStopped$1.J$0 = packedValue2;
                    scrollingLogic$onDragStopped$1.label = 4;
                    obj = value22.m2883dispatchPostFlingRZ2iAVY(m4068minusAH228Gc22, packedValue2, scrollingLogic$onDragStopped$1);
                    if (obj != coroutine_suspended) {
                    }
                }
                f2 = scrollingLogic2.m326toFloatTH1AsA0(((Velocity) obj).getPackedValue());
                f3 = f;
                scrollingLogic = scrollingLogic3;
                long m329toVelocityadjELrA22 = scrollingLogic.m329toVelocityadjELrA(f3 - f2);
                NestedScrollDispatcher value3 = scrollingLogic.nestedScrollDispatcher.getValue();
                scrollingLogic$onDragStopped$1.L$0 = scrollingLogic;
                scrollingLogic$onDragStopped$1.L$1 = null;
                scrollingLogic$onDragStopped$1.J$0 = m329toVelocityadjELrA22;
                scrollingLogic$onDragStopped$1.label = 2;
                obj = value3.m2885dispatchPreFlingQWom1Mo(m329toVelocityadjELrA22, scrollingLogic$onDragStopped$1);
                if (obj == coroutine_suspended) {
                }
            }
        }
        scrollingLogic$onDragStopped$1 = new ScrollingLogic$onDragStopped$1(this, continuation);
        obj = scrollingLogic$onDragStopped$1.result;
        coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = scrollingLogic$onDragStopped$1.label;
        if (i != 0) {
        }
        f2 = scrollingLogic2.m326toFloatTH1AsA0(((Velocity) obj).getPackedValue());
        f3 = f;
        scrollingLogic = scrollingLogic3;
        long m329toVelocityadjELrA222 = scrollingLogic.m329toVelocityadjELrA(f3 - f2);
        NestedScrollDispatcher value32 = scrollingLogic.nestedScrollDispatcher.getValue();
        scrollingLogic$onDragStopped$1.L$0 = scrollingLogic;
        scrollingLogic$onDragStopped$1.L$1 = null;
        scrollingLogic$onDragStopped$1.J$0 = m329toVelocityadjELrA222;
        scrollingLogic$onDragStopped$1.label = 2;
        obj = value32.m2885dispatchPreFlingQWom1Mo(m329toVelocityadjELrA222, scrollingLogic$onDragStopped$1);
        if (obj == coroutine_suspended) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0037  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0025  */
    /* renamed from: doFlingAnimation-QWom1Mo, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object m323doFlingAnimationQWom1Mo(long j, Continuation<? super Velocity> continuation) {
        ScrollingLogic$doFlingAnimation$1 scrollingLogic$doFlingAnimation$1;
        int i;
        Ref.LongRef longRef;
        if (continuation instanceof ScrollingLogic$doFlingAnimation$1) {
            scrollingLogic$doFlingAnimation$1 = (ScrollingLogic$doFlingAnimation$1) continuation;
            if ((scrollingLogic$doFlingAnimation$1.label & Integer.MIN_VALUE) != 0) {
                scrollingLogic$doFlingAnimation$1.label -= Integer.MIN_VALUE;
                ScrollingLogic$doFlingAnimation$1 scrollingLogic$doFlingAnimation$12 = scrollingLogic$doFlingAnimation$1;
                Object obj = scrollingLogic$doFlingAnimation$12.result;
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = scrollingLogic$doFlingAnimation$12.label;
                if (i != 0) {
                    ResultKt.throwOnFailure(obj);
                    Ref.LongRef longRef2 = new Ref.LongRef();
                    longRef2.element = j;
                    ScrollableState scrollableState = this.scrollableState;
                    ScrollingLogic$doFlingAnimation$2 scrollingLogic$doFlingAnimation$2 = new ScrollingLogic$doFlingAnimation$2(this, longRef2, j, null);
                    scrollingLogic$doFlingAnimation$12.L$0 = longRef2;
                    scrollingLogic$doFlingAnimation$12.label = 1;
                    if (ScrollableState.scroll$default(scrollableState, null, scrollingLogic$doFlingAnimation$2, scrollingLogic$doFlingAnimation$12, 1, null) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    longRef = longRef2;
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    longRef = (Ref.LongRef) scrollingLogic$doFlingAnimation$12.L$0;
                    ResultKt.throwOnFailure(obj);
                }
                return Velocity.m4056boximpl(longRef.element);
            }
        }
        scrollingLogic$doFlingAnimation$1 = new ScrollingLogic$doFlingAnimation$1(this, continuation);
        ScrollingLogic$doFlingAnimation$1 scrollingLogic$doFlingAnimation$122 = scrollingLogic$doFlingAnimation$1;
        Object obj2 = scrollingLogic$doFlingAnimation$122.result;
        Object coroutine_suspended2 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = scrollingLogic$doFlingAnimation$122.label;
        if (i != 0) {
        }
        return Velocity.m4056boximpl(longRef.element);
    }

    public final boolean shouldScrollImmediately() {
        if (!this.scrollableState.isScrollInProgress()) {
            OverscrollEffect overscrollEffect = this.overscrollEffect;
            if (!(overscrollEffect != null ? overscrollEffect.isInProgress() : false)) {
                return false;
            }
        }
        return true;
    }
}
