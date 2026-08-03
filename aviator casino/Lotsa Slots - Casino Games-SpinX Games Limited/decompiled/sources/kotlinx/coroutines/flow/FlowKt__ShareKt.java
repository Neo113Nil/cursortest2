package kotlinx.coroutines.flow;

/* compiled from: Share.kt */
@kotlin.Metadata(d1 = {"\u0000x\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a6\u0010\u0000\u001a\b\u0012\u0004\u0012\u0002H\u00020\u0001\"\u0004\b\u0000\u0010\u0002*\b\u0012\u0004\u0012\u0002H\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\t\u001a+\u0010\n\u001a\b\u0012\u0004\u0012\u0002H\u00020\u000b\"\u0004\b\u0000\u0010\u0002*\b\u0012\u0004\u0012\u0002H\u00020\u00032\u0006\u0010\b\u001a\u00020\tH\u0002¢\u0006\u0002\b\f\u001aM\u0010\r\u001a\u00020\u000e\"\u0004\b\u0000\u0010\u0002*\u00020\u00052\u0006\u0010\u000f\u001a\u00020\u00102\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u0002H\u00020\u00032\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u0002H\u00020\u00132\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\u0014\u001a\u0002H\u0002H\u0002¢\u0006\u0004\b\u0015\u0010\u0016\u001a9\u0010\u0017\u001a\b\u0012\u0004\u0012\u0002H\u00020\u0018\"\u0004\b\u0000\u0010\u0002*\b\u0012\u0004\u0012\u0002H\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\u0014\u001a\u0002H\u0002¢\u0006\u0002\u0010\u0019\u001a,\u0010\u0017\u001a\b\u0012\u0004\u0012\u0002H\u00020\u0018\"\u0004\b\u0000\u0010\u0002*\b\u0012\u0004\u0012\u0002H\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0086@¢\u0006\u0002\u0010\u001a\u001aG\u0010\u001b\u001a\u00020\u001c\"\u0004\b\u0000\u0010\u0002*\u00020\u00052\u0006\u0010\u000f\u001a\u00020\u00102\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u0002H\u00020\u00032\u0018\u0010\u001d\u001a\u0014\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\u00020\u00180\u001f0\u001eH\u0002¢\u0006\u0002\b \u001a\u001c\u0010!\u001a\b\u0012\u0004\u0012\u0002H\u00020\u0001\"\u0004\b\u0000\u0010\u0002*\b\u0012\u0004\u0012\u0002H\u00020\u0013\u001a\u001c\u0010\"\u001a\b\u0012\u0004\u0012\u0002H\u00020\u0018\"\u0004\b\u0000\u0010\u0002*\b\u0012\u0004\u0012\u0002H\u00020#\u001aP\u0010$\u001a\b\u0012\u0004\u0012\u0002H\u00020\u0001\"\u0004\b\u0000\u0010\u0002*\b\u0012\u0004\u0012\u0002H\u00020\u00012-\u0010%\u001a)\b\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\u00020'\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u001c0(\u0012\u0006\u0012\u0004\u0018\u00010)0&¢\u0006\u0002\b*¢\u0006\u0002\u0010+¨\u0006,"}, d2 = {"shareIn", "Lkotlinx/coroutines/flow/SharedFlow;", "T", "Lkotlinx/coroutines/flow/Flow;", "scope", "Lkotlinx/coroutines/CoroutineScope;", com.ironsource.X3.i.d0, "Lkotlinx/coroutines/flow/SharingStarted;", "replay", "", "configureSharing", "Lkotlinx/coroutines/flow/SharingConfig;", "configureSharing$FlowKt__ShareKt", "launchSharing", "Lkotlinx/coroutines/Job;", "context", "Lkotlin/coroutines/CoroutineContext;", "upstream", "shared", "Lkotlinx/coroutines/flow/MutableSharedFlow;", "initialValue", "launchSharing$FlowKt__ShareKt", "(Lkotlinx/coroutines/CoroutineScope;Lkotlin/coroutines/CoroutineContext;Lkotlinx/coroutines/flow/Flow;Lkotlinx/coroutines/flow/MutableSharedFlow;Lkotlinx/coroutines/flow/SharingStarted;Ljava/lang/Object;)Lkotlinx/coroutines/Job;", "stateIn", "Lkotlinx/coroutines/flow/StateFlow;", "(Lkotlinx/coroutines/flow/Flow;Lkotlinx/coroutines/CoroutineScope;Lkotlinx/coroutines/flow/SharingStarted;Ljava/lang/Object;)Lkotlinx/coroutines/flow/StateFlow;", "(Lkotlinx/coroutines/flow/Flow;Lkotlinx/coroutines/CoroutineScope;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "launchSharingDeferred", "", "result", "Lkotlinx/coroutines/CompletableDeferred;", "Lkotlin/Result;", "launchSharingDeferred$FlowKt__ShareKt", "asSharedFlow", "asStateFlow", "Lkotlinx/coroutines/flow/MutableStateFlow;", "onSubscription", "action", "Lkotlin/Function2;", "Lkotlinx/coroutines/flow/FlowCollector;", "Lkotlin/coroutines/Continuation;", "", "Lkotlin/ExtensionFunctionType;", "(Lkotlinx/coroutines/flow/SharedFlow;Lkotlin/jvm/functions/Function2;)Lkotlinx/coroutines/flow/SharedFlow;", "kotlinx-coroutines-core"}, k = 5, mv = {2, 1, 0}, xi = 48, xs = "kotlinx/coroutines/flow/FlowKt")
/* loaded from: classes6.dex */
final /* synthetic */ class FlowKt__ShareKt {
    public static /* synthetic */ kotlinx.coroutines.flow.SharedFlow shareIn$default(kotlinx.coroutines.flow.Flow flow, kotlinx.coroutines.CoroutineScope coroutineScope, kotlinx.coroutines.flow.SharingStarted sharingStarted, int i, int i2, java.lang.Object obj) {
        if ((i2 & 4) != 0) {
            i = 0;
        }
        return kotlinx.coroutines.flow.FlowKt.shareIn(flow, coroutineScope, sharingStarted, i);
    }

    public static final <T> kotlinx.coroutines.flow.SharedFlow<T> shareIn(kotlinx.coroutines.flow.Flow<? extends T> flow, kotlinx.coroutines.CoroutineScope coroutineScope, kotlinx.coroutines.flow.SharingStarted sharingStarted, int i) {
        kotlinx.coroutines.flow.SharingConfig configureSharing$FlowKt__ShareKt = configureSharing$FlowKt__ShareKt(flow, i);
        kotlinx.coroutines.flow.MutableSharedFlow MutableSharedFlow = kotlinx.coroutines.flow.SharedFlowKt.MutableSharedFlow(i, configureSharing$FlowKt__ShareKt.extraBufferCapacity, configureSharing$FlowKt__ShareKt.onBufferOverflow);
        return new kotlinx.coroutines.flow.ReadonlySharedFlow(MutableSharedFlow, launchSharing$FlowKt__ShareKt(coroutineScope, configureSharing$FlowKt__ShareKt.context, configureSharing$FlowKt__ShareKt.upstream, MutableSharedFlow, sharingStarted, kotlinx.coroutines.flow.SharedFlowKt.NO_VALUE));
    }

    /* JADX WARN: Code restructure failed: missing block: B:22:0x003f, code lost:
    
        if (r1.capacity == 0) goto L25;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static final <T> kotlinx.coroutines.flow.SharingConfig<T> configureSharing$FlowKt__ShareKt(kotlinx.coroutines.flow.Flow<? extends T> flow, int i) {
        kotlinx.coroutines.flow.internal.ChannelFlow channelFlow;
        kotlinx.coroutines.flow.Flow<T> dropChannelOperators;
        if (kotlinx.coroutines.DebugKt.getASSERTIONS_ENABLED() && i < 0) {
            throw new java.lang.AssertionError();
        }
        int coerceAtLeast = kotlin.ranges.RangesKt.coerceAtLeast(i, kotlinx.coroutines.channels.Channel.INSTANCE.getCHANNEL_DEFAULT_CAPACITY$kotlinx_coroutines_core()) - i;
        if ((flow instanceof kotlinx.coroutines.flow.internal.ChannelFlow) && (dropChannelOperators = (channelFlow = (kotlinx.coroutines.flow.internal.ChannelFlow) flow).dropChannelOperators()) != null) {
            int i2 = channelFlow.capacity;
            if (i2 != -3 && i2 != -2 && i2 != 0) {
                coerceAtLeast = channelFlow.capacity;
            } else if (channelFlow.onBufferOverflow != kotlinx.coroutines.channels.BufferOverflow.SUSPEND) {
                if (i == 0) {
                    coerceAtLeast = 1;
                }
                coerceAtLeast = 0;
            }
            return new kotlinx.coroutines.flow.SharingConfig<>(dropChannelOperators, coerceAtLeast, channelFlow.onBufferOverflow, channelFlow.context);
        }
        return new kotlinx.coroutines.flow.SharingConfig<>(flow, coerceAtLeast, kotlinx.coroutines.channels.BufferOverflow.SUSPEND, kotlin.coroutines.EmptyCoroutineContext.INSTANCE);
    }

    private static final <T> kotlinx.coroutines.Job launchSharing$FlowKt__ShareKt(kotlinx.coroutines.CoroutineScope coroutineScope, kotlin.coroutines.CoroutineContext coroutineContext, kotlinx.coroutines.flow.Flow<? extends T> flow, kotlinx.coroutines.flow.MutableSharedFlow<T> mutableSharedFlow, kotlinx.coroutines.flow.SharingStarted sharingStarted, T t) {
        return kotlinx.coroutines.BuildersKt.launch(coroutineScope, coroutineContext, kotlin.jvm.internal.Intrinsics.areEqual(sharingStarted, kotlinx.coroutines.flow.SharingStarted.INSTANCE.getEagerly()) ? kotlinx.coroutines.CoroutineStart.DEFAULT : kotlinx.coroutines.CoroutineStart.UNDISPATCHED, new kotlinx.coroutines.flow.FlowKt__ShareKt$launchSharing$1(sharingStarted, flow, mutableSharedFlow, t, null));
    }

    public static final <T> kotlinx.coroutines.flow.StateFlow<T> stateIn(kotlinx.coroutines.flow.Flow<? extends T> flow, kotlinx.coroutines.CoroutineScope coroutineScope, kotlinx.coroutines.flow.SharingStarted sharingStarted, T t) {
        kotlinx.coroutines.flow.SharingConfig configureSharing$FlowKt__ShareKt = configureSharing$FlowKt__ShareKt(flow, 1);
        kotlinx.coroutines.flow.MutableStateFlow MutableStateFlow = kotlinx.coroutines.flow.StateFlowKt.MutableStateFlow(t);
        return new kotlinx.coroutines.flow.ReadonlyStateFlow(MutableStateFlow, launchSharing$FlowKt__ShareKt(coroutineScope, configureSharing$FlowKt__ShareKt.context, configureSharing$FlowKt__ShareKt.upstream, MutableStateFlow, sharingStarted, t));
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0032  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final <T> java.lang.Object stateIn(kotlinx.coroutines.flow.Flow<? extends T> flow, kotlinx.coroutines.CoroutineScope coroutineScope, kotlin.coroutines.Continuation<? super kotlinx.coroutines.flow.StateFlow<? extends T>> continuation) {
        kotlinx.coroutines.flow.FlowKt__ShareKt$stateIn$1 flowKt__ShareKt$stateIn$1;
        int i;
        if (continuation instanceof kotlinx.coroutines.flow.FlowKt__ShareKt$stateIn$1) {
            flowKt__ShareKt$stateIn$1 = (kotlinx.coroutines.flow.FlowKt__ShareKt$stateIn$1) continuation;
            if ((flowKt__ShareKt$stateIn$1.label & Integer.MIN_VALUE) != 0) {
                flowKt__ShareKt$stateIn$1.label -= Integer.MIN_VALUE;
                java.lang.Object obj = flowKt__ShareKt$stateIn$1.result;
                java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = flowKt__ShareKt$stateIn$1.label;
                if (i != 0) {
                    kotlin.ResultKt.throwOnFailure(obj);
                    kotlinx.coroutines.flow.SharingConfig configureSharing$FlowKt__ShareKt = configureSharing$FlowKt__ShareKt(flow, 1);
                    kotlinx.coroutines.CompletableDeferred CompletableDeferred = kotlinx.coroutines.CompletableDeferredKt.CompletableDeferred((kotlinx.coroutines.Job) coroutineScope.getCoroutineContext().get(kotlinx.coroutines.Job.INSTANCE));
                    launchSharingDeferred$FlowKt__ShareKt(coroutineScope, configureSharing$FlowKt__ShareKt.context, configureSharing$FlowKt__ShareKt.upstream, CompletableDeferred);
                    flowKt__ShareKt$stateIn$1.label = 1;
                    obj = CompletableDeferred.await(flowKt__ShareKt$stateIn$1);
                    if (obj == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else {
                    if (i != 1) {
                        throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    kotlin.ResultKt.throwOnFailure(obj);
                }
                java.lang.Object value = ((kotlin.Result) obj).getValue();
                kotlin.ResultKt.throwOnFailure(value);
                return value;
            }
        }
        flowKt__ShareKt$stateIn$1 = new kotlinx.coroutines.flow.FlowKt__ShareKt$stateIn$1(continuation);
        java.lang.Object obj2 = flowKt__ShareKt$stateIn$1.result;
        java.lang.Object coroutine_suspended2 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = flowKt__ShareKt$stateIn$1.label;
        if (i != 0) {
        }
        java.lang.Object value2 = ((kotlin.Result) obj2).getValue();
        kotlin.ResultKt.throwOnFailure(value2);
        return value2;
    }

    private static final <T> void launchSharingDeferred$FlowKt__ShareKt(kotlinx.coroutines.CoroutineScope coroutineScope, kotlin.coroutines.CoroutineContext coroutineContext, kotlinx.coroutines.flow.Flow<? extends T> flow, kotlinx.coroutines.CompletableDeferred<kotlin.Result<kotlinx.coroutines.flow.StateFlow<T>>> completableDeferred) {
        kotlinx.coroutines.BuildersKt__Builders_commonKt.launch$default(coroutineScope, coroutineContext, null, new kotlinx.coroutines.flow.FlowKt__ShareKt$launchSharingDeferred$1(flow, completableDeferred, null), 2, null);
    }

    public static final <T> kotlinx.coroutines.flow.SharedFlow<T> asSharedFlow(kotlinx.coroutines.flow.MutableSharedFlow<T> mutableSharedFlow) {
        return new kotlinx.coroutines.flow.ReadonlySharedFlow(mutableSharedFlow, null);
    }

    public static final <T> kotlinx.coroutines.flow.StateFlow<T> asStateFlow(kotlinx.coroutines.flow.MutableStateFlow<T> mutableStateFlow) {
        return new kotlinx.coroutines.flow.ReadonlyStateFlow(mutableStateFlow, null);
    }

    public static final <T> kotlinx.coroutines.flow.SharedFlow<T> onSubscription(kotlinx.coroutines.flow.SharedFlow<? extends T> sharedFlow, kotlin.jvm.functions.Function2<? super kotlinx.coroutines.flow.FlowCollector<? super T>, ? super kotlin.coroutines.Continuation<? super kotlin.Unit>, ? extends java.lang.Object> function2) {
        return new kotlinx.coroutines.flow.SubscribedSharedFlow(sharedFlow, function2);
    }
}
