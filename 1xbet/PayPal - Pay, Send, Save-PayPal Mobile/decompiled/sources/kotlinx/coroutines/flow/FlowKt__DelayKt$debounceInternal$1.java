package kotlinx.coroutines.flow;

/* JADX INFO: Add missing generic type declarations: [T] */
@kotlin.Metadata(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u0002*\u00020\u00032\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u0002H\u00020\u0005H\n"}, d2 = {"<anonymous>", "", "T", "Lkotlinx/coroutines/CoroutineScope;", "downstream", "Lkotlinx/coroutines/flow/FlowCollector;"}, k = 3, mv = {2, 1, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "kotlinx.coroutines.flow.FlowKt__DelayKt$debounceInternal$1", f = "Delay.kt", i = {0, 0, 0, 0, 1, 1, 1}, l = {215, 415}, m = "invokeSuspend", n = {"downstream", "values", "lastValue", "timeoutMillis", "downstream", "values", "lastValue"}, s = {"L$0", "L$1", "L$2", "L$3", "L$0", "L$1", "L$2"})
/* loaded from: classes17.dex */
final class FlowKt__DelayKt$debounceInternal$1<T> extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function3<kotlinx.coroutines.CoroutineScope, kotlinx.coroutines.flow.FlowCollector<? super T>, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {
    java.lang.Object Camera2StreamConfigurationMap;
    java.lang.Object getHighResolutionOutputSizeshNQ4ISI;
    /* synthetic */ java.lang.Object getHighSpeedVideoFpsRanges;
    final /* synthetic */ kotlinx.coroutines.flow.Flow<T> getHighSpeedVideoFpsRangesFor;
    final /* synthetic */ kotlin.jvm.functions.Function1<T, java.lang.Long> getHighSpeedVideoSizes;
    int getInputSizeshNQ4ISI;
    private /* synthetic */ java.lang.Object getOutputFormats;

    /* JADX WARN: Code restructure failed: missing block: B:22:0x00ae, code lost:
    
        if (r9.emit(r10, r13) != r0) goto L28;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0114, code lost:
    
        return r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x0112, code lost:
    
        if (r9.doSelect(r13) != r0) goto L7;
     */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00ea  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0115  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x006c  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:40:0x0112 -> B:6:0x0020). Please report as a decompilation issue!!! */
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
        java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.getInputSizeshNQ4ISI;
        if (i == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            kotlinx.coroutines.CoroutineScope coroutineScope = (kotlinx.coroutines.CoroutineScope) this.getOutputFormats;
            kotlinx.coroutines.flow.FlowCollector flowCollector3 = (kotlinx.coroutines.flow.FlowCollector) this.getHighSpeedVideoFpsRanges;
            kotlinx.coroutines.channels.ReceiveChannel produce$default = kotlinx.coroutines.channels.ProduceKt.produce$default(coroutineScope, null, 0, new kotlinx.coroutines.flow.FlowKt__DelayKt$debounceInternal$1$values$1(this.getHighSpeedVideoFpsRangesFor, null), 3, null);
            objectRef = new kotlin.jvm.internal.Ref.ObjectRef();
            flowCollector = flowCollector3;
            receiveChannel = produce$default;
            if (objectRef.element == kotlinx.coroutines.flow.internal.NullSurrogateKt.DONE) {
            }
        } else if (i == 1) {
            longRef = (kotlin.jvm.internal.Ref.LongRef) this.getHighResolutionOutputSizeshNQ4ISI;
            objectRef = (kotlin.jvm.internal.Ref.ObjectRef) this.Camera2StreamConfigurationMap;
            receiveChannel = (kotlinx.coroutines.channels.ReceiveChannel) this.getHighSpeedVideoFpsRanges;
            flowCollector = (kotlinx.coroutines.flow.FlowCollector) this.getOutputFormats;
            kotlin.ResultKt.throwOnFailure(obj);
            objectRef.element = null;
            kotlin.jvm.internal.Ref.LongRef longRef2 = longRef;
            objectRef2 = objectRef;
            receiveChannel2 = receiveChannel;
            flowCollector2 = flowCollector;
            if (!kotlinx.coroutines.DebugKt.getASSERTIONS_ENABLED()) {
            }
            kotlinx.coroutines.selects.SelectImplementation selectImplementation = new kotlinx.coroutines.selects.SelectImplementation(getGetHighSpeedVideoSizes());
            kotlinx.coroutines.selects.SelectImplementation selectImplementation2 = selectImplementation;
            if (objectRef2.element != null) {
            }
            selectImplementation2.invoke(receiveChannel2.getOnReceiveCatching(), new kotlinx.coroutines.flow.FlowKt__DelayKt$debounceInternal$1$3$2(objectRef2, flowCollector2, null));
            this.getOutputFormats = flowCollector2;
            this.getHighSpeedVideoFpsRanges = receiveChannel2;
            this.Camera2StreamConfigurationMap = objectRef2;
            this.getHighResolutionOutputSizeshNQ4ISI = null;
            this.getInputSizeshNQ4ISI = 2;
        } else {
            if (i != 2) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            objectRef2 = (kotlin.jvm.internal.Ref.ObjectRef) this.Camera2StreamConfigurationMap;
            receiveChannel2 = (kotlinx.coroutines.channels.ReceiveChannel) this.getHighSpeedVideoFpsRanges;
            flowCollector2 = (kotlinx.coroutines.flow.FlowCollector) this.getOutputFormats;
            kotlin.ResultKt.throwOnFailure(obj);
            flowCollector = flowCollector2;
            receiveChannel = receiveChannel2;
            objectRef = objectRef2;
            if (objectRef.element == kotlinx.coroutines.flow.internal.NullSurrogateKt.DONE) {
                longRef = new kotlin.jvm.internal.Ref.LongRef();
                if (objectRef.element != null) {
                    kotlin.jvm.functions.Function1<T, java.lang.Long> function1 = this.getHighSpeedVideoSizes;
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
                        this.getOutputFormats = flowCollector;
                        this.getHighSpeedVideoFpsRanges = receiveChannel;
                        this.Camera2StreamConfigurationMap = objectRef;
                        this.getHighResolutionOutputSizeshNQ4ISI = longRef;
                        this.getInputSizeshNQ4ISI = 1;
                    }
                }
                kotlin.jvm.internal.Ref.LongRef longRef22 = longRef;
                objectRef2 = objectRef;
                receiveChannel2 = receiveChannel;
                flowCollector2 = flowCollector;
                if (!kotlinx.coroutines.DebugKt.getASSERTIONS_ENABLED() && objectRef2.element != null && longRef22.element <= 0) {
                    throw new java.lang.AssertionError();
                }
                kotlinx.coroutines.selects.SelectImplementation selectImplementation3 = new kotlinx.coroutines.selects.SelectImplementation(getGetHighSpeedVideoSizes());
                kotlinx.coroutines.selects.SelectImplementation selectImplementation22 = selectImplementation3;
                if (objectRef2.element != null) {
                    kotlinx.coroutines.selects.OnTimeoutKt.onTimeout(selectImplementation22, longRef22.element, new kotlinx.coroutines.flow.FlowKt__DelayKt$debounceInternal$1$3$1(flowCollector2, objectRef2, null));
                }
                selectImplementation22.invoke(receiveChannel2.getOnReceiveCatching(), new kotlinx.coroutines.flow.FlowKt__DelayKt$debounceInternal$1$3$2(objectRef2, flowCollector2, null));
                this.getOutputFormats = flowCollector2;
                this.getHighSpeedVideoFpsRanges = receiveChannel2;
                this.Camera2StreamConfigurationMap = objectRef2;
                this.getHighResolutionOutputSizeshNQ4ISI = null;
                this.getInputSizeshNQ4ISI = 2;
            } else {
                return kotlin.Unit.INSTANCE;
            }
        }
    }

    @Override // kotlin.jvm.functions.Function3
    public final /* synthetic */ java.lang.Object invoke(kotlinx.coroutines.CoroutineScope coroutineScope, java.lang.Object obj, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        kotlinx.coroutines.flow.FlowKt__DelayKt$debounceInternal$1 flowKt__DelayKt$debounceInternal$1 = new kotlinx.coroutines.flow.FlowKt__DelayKt$debounceInternal$1(this.getHighSpeedVideoSizes, this.getHighSpeedVideoFpsRangesFor, continuation);
        flowKt__DelayKt$debounceInternal$1.getOutputFormats = coroutineScope;
        flowKt__DelayKt$debounceInternal$1.getHighSpeedVideoFpsRanges = (kotlinx.coroutines.flow.FlowCollector) obj;
        return flowKt__DelayKt$debounceInternal$1.invokeSuspend(kotlin.Unit.INSTANCE);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    FlowKt__DelayKt$debounceInternal$1(kotlin.jvm.functions.Function1<? super T, java.lang.Long> function1, kotlinx.coroutines.flow.Flow<? extends T> flow, kotlin.coroutines.Continuation<? super kotlinx.coroutines.flow.FlowKt__DelayKt$debounceInternal$1> continuation) {
        super(3, continuation);
        this.getHighSpeedVideoSizes = function1;
        this.getHighSpeedVideoFpsRangesFor = flow;
    }
}
