package androidx.compose.foundation.gestures;

@kotlin.Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0001H\n"}, d2 = {"<anonymous>", "Landroidx/compose/ui/unit/Velocity;", "velocity"}, k = 3, mv = {2, 0, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "androidx.compose.foundation.gestures.ScrollingLogic$onScrollStopped$performFling$1", f = "Scrollable.kt", i = {0, 1, 1, 2, 2}, l = {833, 836, 839}, m = "invokeSuspend", n = {"velocity", "velocity", com.paypal.oslo.core.telemetry.compose.OsloAnalyticsProvider.AVAILABLE_CONDITION_KEY, "velocity", "velocityLeft"}, s = {"J$0", "J$0", "J$1", "J$0", "J$1"}, v = 1)
/* loaded from: classes6.dex */
final class ScrollingLogic$onScrollStopped$performFling$1 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<androidx.compose.ui.unit.Velocity, kotlin.coroutines.Continuation<? super androidx.compose.ui.unit.Velocity>, java.lang.Object> {
    int Camera2StreamConfigurationMap;
    long getHighResolutionOutputSizeshNQ4ISI;
    /* synthetic */ long getHighSpeedVideoFpsRanges;
    final /* synthetic */ androidx.compose.foundation.gestures.ScrollingLogic getHighSpeedVideoFpsRangesFor;

    /* JADX WARN: Removed duplicated region for block: B:15:? A[RETURN, SYNTHETIC] */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        androidx.compose.ui.input.nestedscroll.NestedScrollDispatcher nestedScrollDispatcher;
        java.lang.Object m7109dispatchPreFlingQWom1Mo;
        long j;
        long m8842minusAH228Gc;
        java.lang.Object mo1521doFlingAnimationQWom1Mo;
        androidx.compose.ui.input.nestedscroll.NestedScrollDispatcher nestedScrollDispatcher2;
        long j2;
        java.lang.Object m7107dispatchPostFlingRZ2iAVY;
        java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.Camera2StreamConfigurationMap;
        if (i == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            long j3 = this.getHighSpeedVideoFpsRanges;
            nestedScrollDispatcher = this.getHighSpeedVideoFpsRangesFor.Camera2StreamConfigurationMap;
            this.getHighSpeedVideoFpsRanges = j3;
            this.Camera2StreamConfigurationMap = 1;
            m7109dispatchPreFlingQWom1Mo = nestedScrollDispatcher.m7109dispatchPreFlingQWom1Mo(j3, this);
            if (m7109dispatchPreFlingQWom1Mo == coroutine_suspended) {
                return coroutine_suspended;
            }
            j = j3;
        } else {
            if (i != 1) {
                if (i != 2) {
                    if (i != 3) {
                        throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    long j4 = this.getHighResolutionOutputSizeshNQ4ISI;
                    long j5 = this.getHighSpeedVideoFpsRanges;
                    kotlin.ResultKt.throwOnFailure(obj);
                    j = j5;
                    j2 = j4;
                    m7107dispatchPostFlingRZ2iAVY = obj;
                    return androidx.compose.ui.unit.Velocity.m8830boximpl(androidx.compose.ui.unit.Velocity.m8842minusAH228Gc(j, androidx.compose.ui.unit.Velocity.m8842minusAH228Gc(j2, ((androidx.compose.ui.unit.Velocity) m7107dispatchPostFlingRZ2iAVY).getGetHighSpeedVideoSizes())));
                }
                long j6 = this.getHighResolutionOutputSizeshNQ4ISI;
                long j7 = this.getHighSpeedVideoFpsRanges;
                kotlin.ResultKt.throwOnFailure(obj);
                mo1521doFlingAnimationQWom1Mo = obj;
                j = j7;
                m8842minusAH228Gc = j6;
                long getHighSpeedVideoSizes = ((androidx.compose.ui.unit.Velocity) mo1521doFlingAnimationQWom1Mo).getGetHighSpeedVideoSizes();
                nestedScrollDispatcher2 = this.getHighSpeedVideoFpsRangesFor.Camera2StreamConfigurationMap;
                this.getHighSpeedVideoFpsRanges = j;
                this.getHighResolutionOutputSizeshNQ4ISI = getHighSpeedVideoSizes;
                this.Camera2StreamConfigurationMap = 3;
                j2 = getHighSpeedVideoSizes;
                m7107dispatchPostFlingRZ2iAVY = nestedScrollDispatcher2.m7107dispatchPostFlingRZ2iAVY(androidx.compose.ui.unit.Velocity.m8842minusAH228Gc(m8842minusAH228Gc, getHighSpeedVideoSizes), getHighSpeedVideoSizes, this);
                if (m7107dispatchPostFlingRZ2iAVY == coroutine_suspended) {
                    return coroutine_suspended;
                }
                return androidx.compose.ui.unit.Velocity.m8830boximpl(androidx.compose.ui.unit.Velocity.m8842minusAH228Gc(j, androidx.compose.ui.unit.Velocity.m8842minusAH228Gc(j2, ((androidx.compose.ui.unit.Velocity) m7107dispatchPostFlingRZ2iAVY).getGetHighSpeedVideoSizes())));
            }
            j = this.getHighSpeedVideoFpsRanges;
            kotlin.ResultKt.throwOnFailure(obj);
            m7109dispatchPreFlingQWom1Mo = obj;
        }
        m8842minusAH228Gc = androidx.compose.ui.unit.Velocity.m8842minusAH228Gc(j, ((androidx.compose.ui.unit.Velocity) m7109dispatchPreFlingQWom1Mo).getGetHighSpeedVideoSizes());
        this.getHighSpeedVideoFpsRanges = j;
        this.getHighResolutionOutputSizeshNQ4ISI = m8842minusAH228Gc;
        this.Camera2StreamConfigurationMap = 2;
        mo1521doFlingAnimationQWom1Mo = this.getHighSpeedVideoFpsRangesFor.mo1521doFlingAnimationQWom1Mo(m8842minusAH228Gc, this);
        if (mo1521doFlingAnimationQWom1Mo == coroutine_suspended) {
            return coroutine_suspended;
        }
        long getHighSpeedVideoSizes2 = ((androidx.compose.ui.unit.Velocity) mo1521doFlingAnimationQWom1Mo).getGetHighSpeedVideoSizes();
        nestedScrollDispatcher2 = this.getHighSpeedVideoFpsRangesFor.Camera2StreamConfigurationMap;
        this.getHighSpeedVideoFpsRanges = j;
        this.getHighResolutionOutputSizeshNQ4ISI = getHighSpeedVideoSizes2;
        this.Camera2StreamConfigurationMap = 3;
        j2 = getHighSpeedVideoSizes2;
        m7107dispatchPostFlingRZ2iAVY = nestedScrollDispatcher2.m7107dispatchPostFlingRZ2iAVY(androidx.compose.ui.unit.Velocity.m8842minusAH228Gc(m8842minusAH228Gc, getHighSpeedVideoSizes2), getHighSpeedVideoSizes2, this);
        if (m7107dispatchPostFlingRZ2iAVY == coroutine_suspended) {
        }
        return androidx.compose.ui.unit.Velocity.m8830boximpl(androidx.compose.ui.unit.Velocity.m8842minusAH228Gc(j, androidx.compose.ui.unit.Velocity.m8842minusAH228Gc(j2, ((androidx.compose.ui.unit.Velocity) m7107dispatchPostFlingRZ2iAVY).getGetHighSpeedVideoSizes())));
    }

    private java.lang.Object getHighSpeedVideoFpsRanges(long j, kotlin.coroutines.Continuation<? super androidx.compose.ui.unit.Velocity> continuation) {
        return ((androidx.compose.foundation.gestures.ScrollingLogic$onScrollStopped$performFling$1) create(androidx.compose.ui.unit.Velocity.m8830boximpl(j), continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
    }

    @Override // kotlin.jvm.functions.Function2
    public final /* synthetic */ java.lang.Object invoke(androidx.compose.ui.unit.Velocity velocity, kotlin.coroutines.Continuation<? super androidx.compose.ui.unit.Velocity> continuation) {
        return getHighSpeedVideoFpsRanges(velocity.getGetHighSpeedVideoSizes(), continuation);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
        androidx.compose.foundation.gestures.ScrollingLogic$onScrollStopped$performFling$1 scrollingLogic$onScrollStopped$performFling$1 = new androidx.compose.foundation.gestures.ScrollingLogic$onScrollStopped$performFling$1(this.getHighSpeedVideoFpsRangesFor, continuation);
        scrollingLogic$onScrollStopped$performFling$1.getHighSpeedVideoFpsRanges = ((androidx.compose.ui.unit.Velocity) obj).getGetHighSpeedVideoSizes();
        return scrollingLogic$onScrollStopped$performFling$1;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    ScrollingLogic$onScrollStopped$performFling$1(androidx.compose.foundation.gestures.ScrollingLogic scrollingLogic, kotlin.coroutines.Continuation<? super androidx.compose.foundation.gestures.ScrollingLogic$onScrollStopped$performFling$1> continuation) {
        super(2, continuation);
        this.getHighSpeedVideoFpsRangesFor = scrollingLogic;
    }
}
