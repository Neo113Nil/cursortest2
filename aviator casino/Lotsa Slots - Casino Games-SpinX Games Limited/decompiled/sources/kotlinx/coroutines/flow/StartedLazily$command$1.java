package kotlinx.coroutines.flow;

/* compiled from: SharingStarted.kt */
@kotlin.Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\b\u0012\u0004\u0012\u00020\u00030\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/flow/FlowCollector;", "Lkotlinx/coroutines/flow/SharingCommand;"}, k = 3, mv = {2, 1, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "kotlinx.coroutines.flow.StartedLazily$command$1", f = "SharingStarted.kt", i = {}, l = {151}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes6.dex */
final class StartedLazily$command$1 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<kotlinx.coroutines.flow.FlowCollector<? super kotlinx.coroutines.flow.SharingCommand>, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {
    final /* synthetic */ kotlinx.coroutines.flow.StateFlow<java.lang.Integer> $subscriptionCount;
    private /* synthetic */ java.lang.Object L$0;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    StartedLazily$command$1(kotlinx.coroutines.flow.StateFlow<java.lang.Integer> stateFlow, kotlin.coroutines.Continuation<? super kotlinx.coroutines.flow.StartedLazily$command$1> continuation) {
        super(2, continuation);
        this.$subscriptionCount = stateFlow;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
        kotlinx.coroutines.flow.StartedLazily$command$1 startedLazily$command$1 = new kotlinx.coroutines.flow.StartedLazily$command$1(this.$subscriptionCount, continuation);
        startedLazily$command$1.L$0 = obj;
        return startedLazily$command$1;
    }

    @Override // kotlin.jvm.functions.Function2
    public final java.lang.Object invoke(kotlinx.coroutines.flow.FlowCollector<? super kotlinx.coroutines.flow.SharingCommand> flowCollector, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        return ((kotlinx.coroutines.flow.StartedLazily$command$1) create(flowCollector, continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.label;
        if (i == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            kotlinx.coroutines.flow.FlowCollector flowCollector = (kotlinx.coroutines.flow.FlowCollector) this.L$0;
            kotlin.jvm.internal.Ref.BooleanRef booleanRef = new kotlin.jvm.internal.Ref.BooleanRef();
            this.label = 1;
            if (this.$subscriptionCount.collect(new kotlinx.coroutines.flow.StartedLazily$command$1.AnonymousClass1(booleanRef, flowCollector), this) == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.ResultKt.throwOnFailure(obj);
        }
        throw new kotlin.KotlinNothingValueException();
    }

    /* compiled from: SharingStarted.kt */
    @kotlin.Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    /* renamed from: kotlinx.coroutines.flow.StartedLazily$command$1$1, reason: invalid class name */
    static final class AnonymousClass1<T> implements kotlinx.coroutines.flow.FlowCollector {
        final /* synthetic */ kotlinx.coroutines.flow.FlowCollector<kotlinx.coroutines.flow.SharingCommand> $$this$flow;
        final /* synthetic */ kotlin.jvm.internal.Ref.BooleanRef $started;

        /* JADX WARN: Multi-variable type inference failed */
        AnonymousClass1(kotlin.jvm.internal.Ref.BooleanRef booleanRef, kotlinx.coroutines.flow.FlowCollector<? super kotlinx.coroutines.flow.SharingCommand> flowCollector) {
            this.$started = booleanRef;
            this.$$this$flow = flowCollector;
        }

        /* JADX WARN: Removed duplicated region for block: B:15:0x0032  */
        /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final java.lang.Object emit(int i, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
            kotlinx.coroutines.flow.StartedLazily$command$1$1$emit$1 startedLazily$command$1$1$emit$1;
            int i2;
            if (continuation instanceof kotlinx.coroutines.flow.StartedLazily$command$1$1$emit$1) {
                startedLazily$command$1$1$emit$1 = (kotlinx.coroutines.flow.StartedLazily$command$1$1$emit$1) continuation;
                if ((startedLazily$command$1$1$emit$1.label & Integer.MIN_VALUE) != 0) {
                    startedLazily$command$1$1$emit$1.label -= Integer.MIN_VALUE;
                    java.lang.Object obj = startedLazily$command$1$1$emit$1.result;
                    java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    i2 = startedLazily$command$1$1$emit$1.label;
                    if (i2 != 0) {
                        kotlin.ResultKt.throwOnFailure(obj);
                        if (i <= 0 || this.$started.element) {
                            return kotlin.Unit.INSTANCE;
                        }
                        this.$started.element = true;
                        kotlinx.coroutines.flow.FlowCollector<kotlinx.coroutines.flow.SharingCommand> flowCollector = this.$$this$flow;
                        kotlinx.coroutines.flow.SharingCommand sharingCommand = kotlinx.coroutines.flow.SharingCommand.START;
                        startedLazily$command$1$1$emit$1.label = 1;
                        if (flowCollector.emit(sharingCommand, startedLazily$command$1$1$emit$1) == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                    } else {
                        if (i2 != 1) {
                            throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        kotlin.ResultKt.throwOnFailure(obj);
                    }
                    return kotlin.Unit.INSTANCE;
                }
            }
            startedLazily$command$1$1$emit$1 = new kotlinx.coroutines.flow.StartedLazily$command$1$1$emit$1(this, continuation);
            java.lang.Object obj2 = startedLazily$command$1$1$emit$1.result;
            java.lang.Object coroutine_suspended2 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
            i2 = startedLazily$command$1$1$emit$1.label;
            if (i2 != 0) {
            }
            return kotlin.Unit.INSTANCE;
        }

        @Override // kotlinx.coroutines.flow.FlowCollector
        public /* bridge */ /* synthetic */ java.lang.Object emit(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
            return emit(((java.lang.Number) obj).intValue(), (kotlin.coroutines.Continuation<? super kotlin.Unit>) continuation);
        }
    }
}
