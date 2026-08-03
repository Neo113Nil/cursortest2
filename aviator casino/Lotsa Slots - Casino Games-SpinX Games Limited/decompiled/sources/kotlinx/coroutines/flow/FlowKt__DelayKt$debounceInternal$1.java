package kotlinx.coroutines.flow;

/* JADX INFO: Add missing generic type declarations: [T] */
/* compiled from: Delay.kt */
@kotlin.Metadata(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u0002*\u00020\u00032\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u0002H\u00020\u0005H\n"}, d2 = {"<anonymous>", "", "T", "Lkotlinx/coroutines/CoroutineScope;", "downstream", "Lkotlinx/coroutines/flow/FlowCollector;"}, k = 3, mv = {2, 1, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "kotlinx.coroutines.flow.FlowKt__DelayKt$debounceInternal$1", f = "Delay.kt", i = {0, 0, 0, 0, 1, 1, 1}, l = {com.vungle.ads.internal.protos.Sdk.SDKError.Reason.AD_RESPONSE_EMPTY_VALUE, 415}, m = "invokeSuspend", n = {"downstream", "values", "lastValue", "timeoutMillis", "downstream", "values", "lastValue"}, s = {"L$0", "L$1", "L$2", "L$3", "L$0", "L$1", "L$2"})
/* loaded from: classes6.dex */
final class FlowKt__DelayKt$debounceInternal$1<T> extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function3<kotlinx.coroutines.CoroutineScope, kotlinx.coroutines.flow.FlowCollector<? super T>, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {
    final /* synthetic */ kotlinx.coroutines.flow.Flow<T> $this_debounceInternal;
    final /* synthetic */ kotlin.jvm.functions.Function1<T, java.lang.Long> $timeoutMillisSelector;
    private /* synthetic */ java.lang.Object L$0;
    /* synthetic */ java.lang.Object L$1;
    java.lang.Object L$2;
    java.lang.Object L$3;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    FlowKt__DelayKt$debounceInternal$1(kotlin.jvm.functions.Function1<? super T, java.lang.Long> function1, kotlinx.coroutines.flow.Flow<? extends T> flow, kotlin.coroutines.Continuation<? super kotlinx.coroutines.flow.FlowKt__DelayKt$debounceInternal$1> continuation) {
        super(3, continuation);
        this.$timeoutMillisSelector = function1;
        this.$this_debounceInternal = flow;
    }

    @Override // kotlin.jvm.functions.Function3
    public final java.lang.Object invoke(kotlinx.coroutines.CoroutineScope coroutineScope, kotlinx.coroutines.flow.FlowCollector<? super T> flowCollector, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        kotlinx.coroutines.flow.FlowKt__DelayKt$debounceInternal$1 flowKt__DelayKt$debounceInternal$1 = new kotlinx.coroutines.flow.FlowKt__DelayKt$debounceInternal$1(this.$timeoutMillisSelector, this.$this_debounceInternal, continuation);
        flowKt__DelayKt$debounceInternal$1.L$0 = coroutineScope;
        flowKt__DelayKt$debounceInternal$1.L$1 = flowCollector;
        return flowKt__DelayKt$debounceInternal$1.invokeSuspend(kotlin.Unit.INSTANCE);
    }

    /* JADX WARN: Removed duplicated region for block: B:39:0x00eb  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0115 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0116  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x006c  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:41:0x0113 -> B:6:0x0020). Please report as a decompilation issue!!! */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        kotlin.jvm.internal.Ref.ObjectRef objectRef;
        kotlinx.coroutines.flow.FlowCollector flowCollector;
        kotlinx.coroutines.channels.ReceiveChannel receiveChannel;
        kotlin.jvm.internal.Ref.LongRef longRef;
        kotlin.jvm.internal.Ref.ObjectRef objectRef2;
        kotlinx.coroutines.channels.ReceiveChannel receiveChannel2;
        kotlinx.coroutines.flow.FlowCollector flowCollector2;
        kotlinx.coroutines.selects.SelectImplementation selectImplementation;
        java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.label;
        if (i == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            kotlinx.coroutines.CoroutineScope coroutineScope = (kotlinx.coroutines.CoroutineScope) this.L$0;
            kotlinx.coroutines.flow.FlowCollector flowCollector3 = (kotlinx.coroutines.flow.FlowCollector) this.L$1;
            kotlinx.coroutines.channels.ReceiveChannel produce$default = kotlinx.coroutines.channels.ProduceKt.produce$default(coroutineScope, null, 0, new kotlinx.coroutines.flow.FlowKt__DelayKt$debounceInternal$1$values$1(this.$this_debounceInternal, null), 3, null);
            objectRef = new kotlin.jvm.internal.Ref.ObjectRef();
            flowCollector = flowCollector3;
            receiveChannel = produce$default;
            if (objectRef.element == kotlinx.coroutines.flow.internal.NullSurrogateKt.DONE) {
            }
        } else if (i == 1) {
            longRef = (kotlin.jvm.internal.Ref.LongRef) this.L$3;
            objectRef = (kotlin.jvm.internal.Ref.ObjectRef) this.L$2;
            receiveChannel = (kotlinx.coroutines.channels.ReceiveChannel) this.L$1;
            flowCollector = (kotlinx.coroutines.flow.FlowCollector) this.L$0;
            kotlin.ResultKt.throwOnFailure(obj);
            objectRef.element = null;
            kotlin.jvm.internal.Ref.LongRef longRef2 = longRef;
            objectRef2 = objectRef;
            receiveChannel2 = receiveChannel;
            flowCollector2 = flowCollector;
            if (!kotlinx.coroutines.DebugKt.getASSERTIONS_ENABLED()) {
            }
            selectImplementation = new kotlinx.coroutines.selects.SelectImplementation(get$context());
            kotlinx.coroutines.selects.SelectImplementation selectImplementation2 = selectImplementation;
            if (objectRef2.element != null) {
            }
            selectImplementation2.invoke(receiveChannel2.getOnReceiveCatching(), new kotlinx.coroutines.flow.FlowKt__DelayKt$debounceInternal$1$3$2(objectRef2, flowCollector2, null));
            this.L$0 = flowCollector2;
            this.L$1 = receiveChannel2;
            this.L$2 = objectRef2;
            this.L$3 = null;
            this.label = 2;
            if (selectImplementation.doSelect(this) == coroutine_suspended) {
            }
            flowCollector = flowCollector2;
            receiveChannel = receiveChannel2;
            objectRef = objectRef2;
            if (objectRef.element == kotlinx.coroutines.flow.internal.NullSurrogateKt.DONE) {
            }
        } else {
            if (i != 2) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            objectRef2 = (kotlin.jvm.internal.Ref.ObjectRef) this.L$2;
            receiveChannel2 = (kotlinx.coroutines.channels.ReceiveChannel) this.L$1;
            flowCollector2 = (kotlinx.coroutines.flow.FlowCollector) this.L$0;
            kotlin.ResultKt.throwOnFailure(obj);
            flowCollector = flowCollector2;
            receiveChannel = receiveChannel2;
            objectRef = objectRef2;
            if (objectRef.element == kotlinx.coroutines.flow.internal.NullSurrogateKt.DONE) {
                longRef = new kotlin.jvm.internal.Ref.LongRef();
                if (objectRef.element != null) {
                    kotlin.jvm.functions.Function1<T, java.lang.Long> function1 = this.$timeoutMillisSelector;
                    kotlinx.coroutines.internal.Symbol symbol = kotlinx.coroutines.flow.internal.NullSurrogateKt.NULL;
                    T t = objectRef.element;
                    if (t == symbol) {
                        t = null;
                    }
                    longRef.element = function1.invoke(t).longValue();
                    if (longRef.element < 0) {
                        throw new java.lang.IllegalArgumentException("Debounce timeout should not be negative".toString());
                    }
                    if (longRef.element == 0) {
                        kotlinx.coroutines.internal.Symbol symbol2 = kotlinx.coroutines.flow.internal.NullSurrogateKt.NULL;
                        T t2 = objectRef.element;
                        if (t2 == symbol2) {
                            t2 = null;
                        }
                        this.L$0 = flowCollector;
                        this.L$1 = receiveChannel;
                        this.L$2 = objectRef;
                        this.L$3 = longRef;
                        this.label = 1;
                        if (flowCollector.emit(t2, this) == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                        objectRef.element = null;
                    }
                }
                kotlin.jvm.internal.Ref.LongRef longRef22 = longRef;
                objectRef2 = objectRef;
                receiveChannel2 = receiveChannel;
                flowCollector2 = flowCollector;
                if (!kotlinx.coroutines.DebugKt.getASSERTIONS_ENABLED() && objectRef2.element != null && longRef22.element <= 0) {
                    throw new java.lang.AssertionError();
                }
                selectImplementation = new kotlinx.coroutines.selects.SelectImplementation(get$context());
                kotlinx.coroutines.selects.SelectImplementation selectImplementation22 = selectImplementation;
                if (objectRef2.element != null) {
                    kotlinx.coroutines.selects.OnTimeoutKt.onTimeout(selectImplementation22, longRef22.element, new kotlinx.coroutines.flow.FlowKt__DelayKt$debounceInternal$1$3$1(flowCollector2, objectRef2, null));
                }
                selectImplementation22.invoke(receiveChannel2.getOnReceiveCatching(), new kotlinx.coroutines.flow.FlowKt__DelayKt$debounceInternal$1$3$2(objectRef2, flowCollector2, null));
                this.L$0 = flowCollector2;
                this.L$1 = receiveChannel2;
                this.L$2 = objectRef2;
                this.L$3 = null;
                this.label = 2;
                if (selectImplementation.doSelect(this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
                flowCollector = flowCollector2;
                receiveChannel = receiveChannel2;
                objectRef = objectRef2;
                if (objectRef.element == kotlinx.coroutines.flow.internal.NullSurrogateKt.DONE) {
                    return kotlin.Unit.INSTANCE;
                }
            }
        }
    }
}
