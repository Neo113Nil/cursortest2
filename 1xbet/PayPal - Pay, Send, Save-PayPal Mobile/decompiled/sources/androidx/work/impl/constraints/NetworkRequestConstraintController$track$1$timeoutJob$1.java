package androidx.work.impl.constraints;

@kotlin.Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 1, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "androidx.work.impl.constraints.NetworkRequestConstraintController$track$1$timeoutJob$1", f = "WorkConstraintsTracker.kt", i = {}, l = {com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_SUPPORT_VALUE}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes3.dex */
final class NetworkRequestConstraintController$track$1$timeoutJob$1 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<kotlinx.coroutines.CoroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {
    int Camera2StreamConfigurationMap;
    final /* synthetic */ androidx.work.impl.constraints.NetworkRequestConstraintController getHighResolutionOutputSizeshNQ4ISI;
    final /* synthetic */ kotlinx.coroutines.channels.ProducerScope<androidx.work.impl.constraints.ConstraintsState> getHighSpeedVideoFpsRangesFor;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        long j;
        java.lang.String str;
        long j2;
        java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.Camera2StreamConfigurationMap;
        if (i == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            j = this.getHighResolutionOutputSizeshNQ4ISI.getHighSpeedVideoFpsRangesFor;
            this.Camera2StreamConfigurationMap = 1;
            if (kotlinx.coroutines.DelayKt.delay(j, this) == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.ResultKt.throwOnFailure(obj);
        }
        androidx.work.Logger logger = androidx.work.Logger.get();
        str = androidx.work.impl.constraints.WorkConstraintsTrackerKt.getHighResolutionOutputSizeshNQ4ISI;
        java.lang.StringBuilder sb = new java.lang.StringBuilder("NetworkRequestConstraintController didn't receive neither onCapabilitiesChanged/onLost callback, sending `ConstraintsNotMet` after ");
        j2 = this.getHighResolutionOutputSizeshNQ4ISI.getHighSpeedVideoFpsRangesFor;
        sb.append(j2);
        sb.append(" ms");
        logger.debug(str, sb.toString());
        this.getHighSpeedVideoFpsRangesFor.mo9266trySendJP2dKIU(new androidx.work.impl.constraints.ConstraintsState.ConstraintsNotMet(7));
        return kotlin.Unit.INSTANCE;
    }

    @Override // kotlin.jvm.functions.Function2
    public final /* synthetic */ java.lang.Object invoke(kotlinx.coroutines.CoroutineScope coroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        return ((androidx.work.impl.constraints.NetworkRequestConstraintController$track$1$timeoutJob$1) create(coroutineScope, continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
        return new androidx.work.impl.constraints.NetworkRequestConstraintController$track$1$timeoutJob$1(this.getHighResolutionOutputSizeshNQ4ISI, this.getHighSpeedVideoFpsRangesFor, continuation);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    NetworkRequestConstraintController$track$1$timeoutJob$1(androidx.work.impl.constraints.NetworkRequestConstraintController networkRequestConstraintController, kotlinx.coroutines.channels.ProducerScope<? super androidx.work.impl.constraints.ConstraintsState> producerScope, kotlin.coroutines.Continuation<? super androidx.work.impl.constraints.NetworkRequestConstraintController$track$1$timeoutJob$1> continuation) {
        super(2, continuation);
        this.getHighResolutionOutputSizeshNQ4ISI = networkRequestConstraintController;
        this.getHighSpeedVideoFpsRangesFor = producerScope;
    }
}
