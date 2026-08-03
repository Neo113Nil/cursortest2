package kotlinx.coroutines.flow;

/* compiled from: Share.kt */
@kotlin.Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 1, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "kotlinx.coroutines.flow.FlowKt__ShareKt$launchSharingDeferred$1", f = "Share.kt", i = {0}, l = {337}, m = "invokeSuspend", n = {"state"}, s = {"L$0"})
/* loaded from: classes6.dex */
final class FlowKt__ShareKt$launchSharingDeferred$1 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<kotlinx.coroutines.CoroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {
    final /* synthetic */ kotlinx.coroutines.CompletableDeferred<kotlin.Result<kotlinx.coroutines.flow.StateFlow<T>>> $result;
    final /* synthetic */ kotlinx.coroutines.flow.Flow<T> $upstream;
    private /* synthetic */ java.lang.Object L$0;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    FlowKt__ShareKt$launchSharingDeferred$1(kotlinx.coroutines.flow.Flow<? extends T> flow, kotlinx.coroutines.CompletableDeferred<kotlin.Result<kotlinx.coroutines.flow.StateFlow<T>>> completableDeferred, kotlin.coroutines.Continuation<? super kotlinx.coroutines.flow.FlowKt__ShareKt$launchSharingDeferred$1> continuation) {
        super(2, continuation);
        this.$upstream = flow;
        this.$result = completableDeferred;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
        kotlinx.coroutines.flow.FlowKt__ShareKt$launchSharingDeferred$1 flowKt__ShareKt$launchSharingDeferred$1 = new kotlinx.coroutines.flow.FlowKt__ShareKt$launchSharingDeferred$1(this.$upstream, this.$result, continuation);
        flowKt__ShareKt$launchSharingDeferred$1.L$0 = obj;
        return flowKt__ShareKt$launchSharingDeferred$1;
    }

    @Override // kotlin.jvm.functions.Function2
    public final java.lang.Object invoke(kotlinx.coroutines.CoroutineScope coroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        return ((kotlinx.coroutines.flow.FlowKt__ShareKt$launchSharingDeferred$1) create(coroutineScope, continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        kotlin.jvm.internal.Ref.ObjectRef objectRef;
        java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.label;
        try {
            if (i == 0) {
                kotlin.ResultKt.throwOnFailure(obj);
                final kotlinx.coroutines.CoroutineScope coroutineScope = (kotlinx.coroutines.CoroutineScope) this.L$0;
                final kotlin.jvm.internal.Ref.ObjectRef objectRef2 = new kotlin.jvm.internal.Ref.ObjectRef();
                kotlinx.coroutines.flow.Flow<T> flow = this.$upstream;
                final kotlinx.coroutines.CompletableDeferred<kotlin.Result<kotlinx.coroutines.flow.StateFlow<T>>> completableDeferred = this.$result;
                this.L$0 = objectRef2;
                this.label = 1;
                if (flow.collect(new kotlinx.coroutines.flow.FlowCollector() { // from class: kotlinx.coroutines.flow.FlowKt__ShareKt$launchSharingDeferred$1.1
                    @Override // kotlinx.coroutines.flow.FlowCollector
                    public final java.lang.Object emit(T t, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
                        kotlinx.coroutines.flow.MutableStateFlow<T> mutableStateFlow = objectRef2.element;
                        if (mutableStateFlow != null) {
                            mutableStateFlow.setValue(t);
                        } else {
                            kotlinx.coroutines.CoroutineScope coroutineScope2 = coroutineScope;
                            kotlin.jvm.internal.Ref.ObjectRef<kotlinx.coroutines.flow.MutableStateFlow<T>> objectRef3 = objectRef2;
                            kotlinx.coroutines.CompletableDeferred<kotlin.Result<kotlinx.coroutines.flow.StateFlow<T>>> completableDeferred2 = completableDeferred;
                            T t2 = (T) kotlinx.coroutines.flow.StateFlowKt.MutableStateFlow(t);
                            kotlin.Result.Companion companion = kotlin.Result.INSTANCE;
                            completableDeferred2.complete(kotlin.Result.m10797boximpl(kotlin.Result.m10798constructorimpl(new kotlinx.coroutines.flow.ReadonlyStateFlow((kotlinx.coroutines.flow.StateFlow) t2, kotlinx.coroutines.JobKt.getJob(coroutineScope2.getCoroutineContext())))));
                            objectRef3.element = t2;
                        }
                        return kotlin.Unit.INSTANCE;
                    }
                }, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
                objectRef = objectRef2;
            } else {
                if (i != 1) {
                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                objectRef = (kotlin.jvm.internal.Ref.ObjectRef) this.L$0;
                kotlin.ResultKt.throwOnFailure(obj);
            }
            if (objectRef.element == 0) {
                kotlinx.coroutines.CompletableDeferred<kotlin.Result<kotlinx.coroutines.flow.StateFlow<T>>> completableDeferred2 = this.$result;
                kotlin.Result.Companion companion = kotlin.Result.INSTANCE;
                completableDeferred2.complete(kotlin.Result.m10797boximpl(kotlin.Result.m10798constructorimpl(kotlin.ResultKt.createFailure(new java.util.NoSuchElementException("Flow is empty")))));
            }
            return kotlin.Unit.INSTANCE;
        } catch (java.lang.Throwable th) {
            this.$result.completeExceptionally(th);
            throw th;
        }
    }
}
