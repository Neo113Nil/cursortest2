package androidx.compose.foundation.gestures;

/* compiled from: Scrollable.kt */
@kotlin.Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0002\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J#\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0010\u001a\u00020\u000eH\u0096@ø\u0001\u0000¢\u0006\u0004\b\u0011\u0010\u0012J*\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u000f\u001a\u00020\u00142\u0006\u0010\u0010\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u0016H\u0016ø\u0001\u0000¢\u0006\u0004\b\u0017\u0010\u0018J\"\u0010\u0019\u001a\u00020\u00142\u0006\u0010\u0010\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u0016H\u0016ø\u0001\u0000¢\u0006\u0004\b\u001a\u0010\u001bR\u001a\u0010\u0004\u001a\u00020\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\nR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\f\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006\u001c"}, d2 = {"Landroidx/compose/foundation/gestures/ScrollableNestedScrollConnection;", "Landroidx/compose/ui/input/nestedscroll/NestedScrollConnection;", "scrollingLogic", "Landroidx/compose/foundation/gestures/ScrollingLogic;", "enabled", "", "(Landroidx/compose/foundation/gestures/ScrollingLogic;Z)V", "getEnabled", "()Z", "setEnabled", "(Z)V", "getScrollingLogic", "()Landroidx/compose/foundation/gestures/ScrollingLogic;", "onPostFling", "Landroidx/compose/ui/unit/Velocity;", "consumed", "available", "onPostFling-RZ2iAVY", "(JJLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "onPostScroll", "Landroidx/compose/ui/geometry/Offset;", "source", "Landroidx/compose/ui/input/nestedscroll/NestedScrollSource;", "onPostScroll-DzOQY0M", "(JJI)J", "onPreScroll", "onPreScroll-OzD1aCk", "(JI)J", "foundation_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
final class ScrollableNestedScrollConnection implements androidx.compose.ui.input.nestedscroll.NestedScrollConnection {
    private boolean enabled;
    private final androidx.compose.foundation.gestures.ScrollingLogic scrollingLogic;

    @Override // androidx.compose.ui.input.nestedscroll.NestedScrollConnection
    /* renamed from: onPreFling-QWom1Mo, reason: not valid java name */
    public /* synthetic */ java.lang.Object mo403onPreFlingQWom1Mo(long j, kotlin.coroutines.Continuation continuation) {
        return androidx.compose.ui.input.nestedscroll.NestedScrollConnection.CC.m3151onPreFlingQWom1Mo$suspendImpl(this, j, continuation);
    }

    public ScrollableNestedScrollConnection(androidx.compose.foundation.gestures.ScrollingLogic scrollingLogic, boolean z) {
        this.scrollingLogic = scrollingLogic;
        this.enabled = z;
    }

    public final androidx.compose.foundation.gestures.ScrollingLogic getScrollingLogic() {
        return this.scrollingLogic;
    }

    public final boolean getEnabled() {
        return this.enabled;
    }

    public final void setEnabled(boolean z) {
        this.enabled = z;
    }

    @Override // androidx.compose.ui.input.nestedscroll.NestedScrollConnection
    /* renamed from: onPreScroll-OzD1aCk, reason: not valid java name */
    public long mo404onPreScrollOzD1aCk(long available, int source) {
        if (androidx.compose.ui.input.nestedscroll.NestedScrollSource.m3163equalsimpl0(source, androidx.compose.ui.input.nestedscroll.NestedScrollSource.INSTANCE.m3169getFlingWNlRxjI())) {
            this.scrollingLogic.registerNestedFling(true);
        }
        return androidx.compose.ui.geometry.Offset.INSTANCE.m1887getZeroF1C5BW0();
    }

    @Override // androidx.compose.ui.input.nestedscroll.NestedScrollConnection
    /* renamed from: onPostScroll-DzOQY0M, reason: not valid java name */
    public long mo402onPostScrollDzOQY0M(long consumed, long available, int source) {
        if (this.enabled) {
            return this.scrollingLogic.m408performRawScrollMKHz9U(available);
        }
        return androidx.compose.ui.geometry.Offset.INSTANCE.m1887getZeroF1C5BW0();
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0038  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    @Override // androidx.compose.ui.input.nestedscroll.NestedScrollConnection
    /* renamed from: onPostFling-RZ2iAVY, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public java.lang.Object mo401onPostFlingRZ2iAVY(long j, long j2, kotlin.coroutines.Continuation<? super androidx.compose.ui.unit.Velocity> continuation) {
        androidx.compose.foundation.gestures.ScrollableNestedScrollConnection$onPostFling$1 scrollableNestedScrollConnection$onPostFling$1;
        int i;
        long m4728getZero9UxMQ8M;
        androidx.compose.foundation.gestures.ScrollableNestedScrollConnection scrollableNestedScrollConnection;
        if (continuation instanceof androidx.compose.foundation.gestures.ScrollableNestedScrollConnection$onPostFling$1) {
            scrollableNestedScrollConnection$onPostFling$1 = (androidx.compose.foundation.gestures.ScrollableNestedScrollConnection$onPostFling$1) continuation;
            if ((scrollableNestedScrollConnection$onPostFling$1.label & Integer.MIN_VALUE) != 0) {
                scrollableNestedScrollConnection$onPostFling$1.label -= Integer.MIN_VALUE;
                java.lang.Object obj = scrollableNestedScrollConnection$onPostFling$1.result;
                java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = scrollableNestedScrollConnection$onPostFling$1.label;
                if (i != 0) {
                    kotlin.ResultKt.throwOnFailure(obj);
                    if (this.enabled) {
                        androidx.compose.foundation.gestures.ScrollingLogic scrollingLogic = this.scrollingLogic;
                        scrollableNestedScrollConnection$onPostFling$1.L$0 = this;
                        scrollableNestedScrollConnection$onPostFling$1.J$0 = j2;
                        scrollableNestedScrollConnection$onPostFling$1.label = 1;
                        obj = scrollingLogic.m406doFlingAnimationQWom1Mo(j2, scrollableNestedScrollConnection$onPostFling$1);
                        if (obj == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                        scrollableNestedScrollConnection = this;
                    } else {
                        m4728getZero9UxMQ8M = androidx.compose.ui.unit.Velocity.INSTANCE.m4728getZero9UxMQ8M();
                        scrollableNestedScrollConnection = this;
                        androidx.compose.ui.unit.Velocity m4708boximpl = androidx.compose.ui.unit.Velocity.m4708boximpl(m4728getZero9UxMQ8M);
                        m4708boximpl.getPackedValue();
                        scrollableNestedScrollConnection.scrollingLogic.registerNestedFling(false);
                        return m4708boximpl;
                    }
                } else {
                    if (i != 1) {
                        throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    j2 = scrollableNestedScrollConnection$onPostFling$1.J$0;
                    scrollableNestedScrollConnection = (androidx.compose.foundation.gestures.ScrollableNestedScrollConnection) scrollableNestedScrollConnection$onPostFling$1.L$0;
                    kotlin.ResultKt.throwOnFailure(obj);
                }
                m4728getZero9UxMQ8M = androidx.compose.ui.unit.Velocity.m4720minusAH228Gc(j2, ((androidx.compose.ui.unit.Velocity) obj).getPackedValue());
                androidx.compose.ui.unit.Velocity m4708boximpl2 = androidx.compose.ui.unit.Velocity.m4708boximpl(m4728getZero9UxMQ8M);
                m4708boximpl2.getPackedValue();
                scrollableNestedScrollConnection.scrollingLogic.registerNestedFling(false);
                return m4708boximpl2;
            }
        }
        scrollableNestedScrollConnection$onPostFling$1 = new androidx.compose.foundation.gestures.ScrollableNestedScrollConnection$onPostFling$1(this, continuation);
        java.lang.Object obj2 = scrollableNestedScrollConnection$onPostFling$1.result;
        java.lang.Object coroutine_suspended2 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = scrollableNestedScrollConnection$onPostFling$1.label;
        if (i != 0) {
        }
        m4728getZero9UxMQ8M = androidx.compose.ui.unit.Velocity.m4720minusAH228Gc(j2, ((androidx.compose.ui.unit.Velocity) obj2).getPackedValue());
        androidx.compose.ui.unit.Velocity m4708boximpl22 = androidx.compose.ui.unit.Velocity.m4708boximpl(m4728getZero9UxMQ8M);
        m4708boximpl22.getPackedValue();
        scrollableNestedScrollConnection.scrollingLogic.registerNestedFling(false);
        return m4708boximpl22;
    }
}
