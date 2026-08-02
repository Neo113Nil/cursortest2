package androidx.compose.foundation.gestures;

@kotlin.Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u000b\b\u0000\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J'\u0010\u000f\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\n\u001a\u00020\b2\u0006\u0010\f\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\r\u0010\u000eJ \u0010\u0013\u001a\u00020\u00102\u0006\u0010\t\u001a\u00020\u00102\u0006\u0010\n\u001a\u00020\u0010H\u0096@¢\u0006\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016R\"\u0010\u0005\u001a\u00020\u00048\u0007@\u0007X\u0087\u000e¢\u0006\u0012\n\u0004\b\u0005\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019\"\u0004\b\u001a\u0010\u001b"}, d2 = {"Landroidx/compose/foundation/gestures/ScrollableNestedScrollConnection;", "Landroidx/compose/ui/input/nestedscroll/NestedScrollConnection;", "Landroidx/compose/foundation/gestures/ScrollLogic;", "scrollingLogic", "", "enabled", "<init>", "(Landroidx/compose/foundation/gestures/ScrollLogic;Z)V", "Landroidx/compose/ui/geometry/Offset;", "consumed", com.paypal.oslo.core.telemetry.compose.OsloAnalyticsProvider.AVAILABLE_CONDITION_KEY, "Landroidx/compose/ui/input/nestedscroll/NestedScrollSource;", "source", "onPostScroll-DzOQY0M", "(JJI)J", "onPostScroll", "Landroidx/compose/ui/unit/Velocity;", "onPostFling-RZ2iAVY", "(JJLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "onPostFling", "Landroidx/compose/foundation/gestures/ScrollLogic;", "getScrollingLogic", "()Landroidx/compose/foundation/gestures/ScrollLogic;", "Z", "getEnabled", "()Z", "setEnabled", "(Z)V"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class ScrollableNestedScrollConnection implements androidx.compose.ui.input.nestedscroll.NestedScrollConnection {
    public static final int $stable = 8;
    private boolean enabled;
    private final androidx.compose.foundation.gestures.ScrollLogic scrollingLogic;

    public ScrollableNestedScrollConnection(androidx.compose.foundation.gestures.ScrollLogic scrollLogic, boolean z) {
        this.scrollingLogic = scrollLogic;
        this.enabled = z;
    }

    public final androidx.compose.foundation.gestures.ScrollLogic getScrollingLogic() {
        return this.scrollingLogic;
    }

    public final boolean getEnabled() {
        return this.enabled;
    }

    public final void setEnabled(boolean z) {
        this.enabled = z;
    }

    @Override // androidx.compose.ui.input.nestedscroll.NestedScrollConnection
    /* renamed from: onPostScroll-DzOQY0M, reason: not valid java name */
    public final long mo1529onPostScrollDzOQY0M(long consumed, long available, int source) {
        if (this.enabled) {
            return this.scrollingLogic.mo1522performRawScrollMKHz9U(available);
        }
        return androidx.compose.ui.geometry.Offset.INSTANCE.m5768getZeroF1C5BW0();
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0034  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    @Override // androidx.compose.ui.input.nestedscroll.NestedScrollConnection
    /* renamed from: onPostFling-RZ2iAVY, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object mo1528onPostFlingRZ2iAVY(long j, long j2, kotlin.coroutines.Continuation<? super androidx.compose.ui.unit.Velocity> continuation) {
        androidx.compose.foundation.gestures.ScrollableNestedScrollConnection$onPostFling$1 scrollableNestedScrollConnection$onPostFling$1;
        int i;
        long m8850getZero9UxMQ8M;
        long m8850getZero9UxMQ8M2;
        if (continuation instanceof androidx.compose.foundation.gestures.ScrollableNestedScrollConnection$onPostFling$1) {
            scrollableNestedScrollConnection$onPostFling$1 = (androidx.compose.foundation.gestures.ScrollableNestedScrollConnection$onPostFling$1) continuation;
            if ((scrollableNestedScrollConnection$onPostFling$1.Camera2StreamConfigurationMap & Integer.MIN_VALUE) != 0) {
                scrollableNestedScrollConnection$onPostFling$1.Camera2StreamConfigurationMap -= 2147483648;
                java.lang.Object obj = scrollableNestedScrollConnection$onPostFling$1.getHighResolutionOutputSizeshNQ4ISI;
                java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = scrollableNestedScrollConnection$onPostFling$1.Camera2StreamConfigurationMap;
                if (i != 0) {
                    kotlin.ResultKt.throwOnFailure(obj);
                    if (this.enabled) {
                        if (this.scrollingLogic.isFlinging()) {
                            m8850getZero9UxMQ8M2 = androidx.compose.ui.unit.Velocity.INSTANCE.m8850getZero9UxMQ8M();
                            m8850getZero9UxMQ8M = androidx.compose.ui.unit.Velocity.m8842minusAH228Gc(j2, m8850getZero9UxMQ8M2);
                            return androidx.compose.ui.unit.Velocity.m8830boximpl(m8850getZero9UxMQ8M);
                        }
                        androidx.compose.foundation.gestures.ScrollLogic scrollLogic = this.scrollingLogic;
                        scrollableNestedScrollConnection$onPostFling$1.getHighSpeedVideoSizes = j2;
                        scrollableNestedScrollConnection$onPostFling$1.Camera2StreamConfigurationMap = 1;
                        obj = scrollLogic.mo1521doFlingAnimationQWom1Mo(j2, scrollableNestedScrollConnection$onPostFling$1);
                        if (obj == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                    } else {
                        m8850getZero9UxMQ8M = androidx.compose.ui.unit.Velocity.INSTANCE.m8850getZero9UxMQ8M();
                        return androidx.compose.ui.unit.Velocity.m8830boximpl(m8850getZero9UxMQ8M);
                    }
                } else {
                    if (i != 1) {
                        throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    j2 = scrollableNestedScrollConnection$onPostFling$1.getHighSpeedVideoSizes;
                    kotlin.ResultKt.throwOnFailure(obj);
                }
                m8850getZero9UxMQ8M2 = ((androidx.compose.ui.unit.Velocity) obj).getGetHighSpeedVideoSizes();
                m8850getZero9UxMQ8M = androidx.compose.ui.unit.Velocity.m8842minusAH228Gc(j2, m8850getZero9UxMQ8M2);
                return androidx.compose.ui.unit.Velocity.m8830boximpl(m8850getZero9UxMQ8M);
            }
        }
        scrollableNestedScrollConnection$onPostFling$1 = new androidx.compose.foundation.gestures.ScrollableNestedScrollConnection$onPostFling$1(this, continuation);
        java.lang.Object obj2 = scrollableNestedScrollConnection$onPostFling$1.getHighResolutionOutputSizeshNQ4ISI;
        java.lang.Object coroutine_suspended2 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = scrollableNestedScrollConnection$onPostFling$1.Camera2StreamConfigurationMap;
        if (i != 0) {
        }
        m8850getZero9UxMQ8M2 = ((androidx.compose.ui.unit.Velocity) obj2).getGetHighSpeedVideoSizes();
        m8850getZero9UxMQ8M = androidx.compose.ui.unit.Velocity.m8842minusAH228Gc(j2, m8850getZero9UxMQ8M2);
        return androidx.compose.ui.unit.Velocity.m8830boximpl(m8850getZero9UxMQ8M);
    }
}
