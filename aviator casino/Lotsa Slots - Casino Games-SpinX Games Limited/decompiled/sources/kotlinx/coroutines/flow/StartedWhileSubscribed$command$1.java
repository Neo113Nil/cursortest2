package kotlinx.coroutines.flow;

/* compiled from: SharingStarted.kt */
@kotlin.Metadata(d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\u0010\u0000\u001a\u00020\u0001*\b\u0012\u0004\u0012\u00020\u00030\u00022\u0006\u0010\u0004\u001a\u00020\u0005H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/flow/FlowCollector;", "Lkotlinx/coroutines/flow/SharingCommand;", com.helpshift.HelpshiftEvent.DATA_MESSAGE_COUNT, ""}, k = 3, mv = {2, 1, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "kotlinx.coroutines.flow.StartedWhileSubscribed$command$1", f = "SharingStarted.kt", i = {1, 2, 3}, l = {174, 176, 178, 179, 181}, m = "invokeSuspend", n = {"$this$transformLatest", "$this$transformLatest", "$this$transformLatest"}, s = {"L$0", "L$0", "L$0"})
/* loaded from: classes6.dex */
final class StartedWhileSubscribed$command$1 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function3<kotlinx.coroutines.flow.FlowCollector<? super kotlinx.coroutines.flow.SharingCommand>, java.lang.Integer, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {
    /* synthetic */ int I$0;
    private /* synthetic */ java.lang.Object L$0;
    int label;
    final /* synthetic */ kotlinx.coroutines.flow.StartedWhileSubscribed this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    StartedWhileSubscribed$command$1(kotlinx.coroutines.flow.StartedWhileSubscribed startedWhileSubscribed, kotlin.coroutines.Continuation<? super kotlinx.coroutines.flow.StartedWhileSubscribed$command$1> continuation) {
        super(3, continuation);
        this.this$0 = startedWhileSubscribed;
    }

    @Override // kotlin.jvm.functions.Function3
    public /* bridge */ /* synthetic */ java.lang.Object invoke(kotlinx.coroutines.flow.FlowCollector<? super kotlinx.coroutines.flow.SharingCommand> flowCollector, java.lang.Integer num, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        return invoke(flowCollector, num.intValue(), continuation);
    }

    public final java.lang.Object invoke(kotlinx.coroutines.flow.FlowCollector<? super kotlinx.coroutines.flow.SharingCommand> flowCollector, int i, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        kotlinx.coroutines.flow.StartedWhileSubscribed$command$1 startedWhileSubscribed$command$1 = new kotlinx.coroutines.flow.StartedWhileSubscribed$command$1(this.this$0, continuation);
        startedWhileSubscribed$command$1.L$0 = flowCollector;
        startedWhileSubscribed$command$1.I$0 = i;
        return startedWhileSubscribed$command$1.invokeSuspend(kotlin.Unit.INSTANCE);
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x00ab A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:20:0x009a A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0077  */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        kotlinx.coroutines.flow.FlowCollector flowCollector;
        long j;
        long j2;
        long j3;
        java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.label;
        if (i == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            flowCollector = (kotlinx.coroutines.flow.FlowCollector) this.L$0;
            if (this.I$0 <= 0) {
                j = this.this$0.stopTimeout;
                this.L$0 = flowCollector;
                this.label = 2;
                if (kotlinx.coroutines.DelayKt.delay(j, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
                j2 = this.this$0.replayExpiration;
                if (j2 > 0) {
                }
                this.L$0 = null;
                this.label = 5;
                if (flowCollector.emit(kotlinx.coroutines.flow.SharingCommand.STOP_AND_RESET_REPLAY_CACHE, this) == coroutine_suspended) {
                }
                return kotlin.Unit.INSTANCE;
            }
            this.label = 1;
            if (flowCollector.emit(kotlinx.coroutines.flow.SharingCommand.START, this) == coroutine_suspended) {
                return coroutine_suspended;
            }
            return kotlin.Unit.INSTANCE;
        }
        if (i != 1) {
            if (i == 2) {
                flowCollector = (kotlinx.coroutines.flow.FlowCollector) this.L$0;
                kotlin.ResultKt.throwOnFailure(obj);
                j2 = this.this$0.replayExpiration;
                if (j2 > 0) {
                    this.L$0 = flowCollector;
                    this.label = 3;
                    if (flowCollector.emit(kotlinx.coroutines.flow.SharingCommand.STOP, this) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    j3 = this.this$0.replayExpiration;
                    this.L$0 = flowCollector;
                    this.label = 4;
                    if (kotlinx.coroutines.DelayKt.delay(j3, this) == coroutine_suspended) {
                    }
                }
                this.L$0 = null;
                this.label = 5;
                if (flowCollector.emit(kotlinx.coroutines.flow.SharingCommand.STOP_AND_RESET_REPLAY_CACHE, this) == coroutine_suspended) {
                }
                return kotlin.Unit.INSTANCE;
            }
            if (i == 3) {
                flowCollector = (kotlinx.coroutines.flow.FlowCollector) this.L$0;
                kotlin.ResultKt.throwOnFailure(obj);
                j3 = this.this$0.replayExpiration;
                this.L$0 = flowCollector;
                this.label = 4;
                if (kotlinx.coroutines.DelayKt.delay(j3, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
                this.L$0 = null;
                this.label = 5;
                if (flowCollector.emit(kotlinx.coroutines.flow.SharingCommand.STOP_AND_RESET_REPLAY_CACHE, this) == coroutine_suspended) {
                }
                return kotlin.Unit.INSTANCE;
            }
            if (i == 4) {
                flowCollector = (kotlinx.coroutines.flow.FlowCollector) this.L$0;
                kotlin.ResultKt.throwOnFailure(obj);
                this.L$0 = null;
                this.label = 5;
                if (flowCollector.emit(kotlinx.coroutines.flow.SharingCommand.STOP_AND_RESET_REPLAY_CACHE, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
                return kotlin.Unit.INSTANCE;
            }
            if (i != 5) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        }
        kotlin.ResultKt.throwOnFailure(obj);
        return kotlin.Unit.INSTANCE;
    }
}
