package kotlinx.coroutines.flow;

@kotlin.Metadata(d1 = {"\u0000t\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0010 \n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u0001\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00020\u00030\u00022\b\u0012\u0004\u0012\u0002H\u00010\u00042\b\u0012\u0004\u0012\u0002H\u00010\u00052\b\u0012\u0004\u0012\u0002H\u00010\u0006B\u000f\u0012\u0006\u0010\u0007\u001a\u00020\b¢\u0006\u0004\b\t\u0010\nJ\u001d\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00028\u00002\u0006\u0010\u0016\u001a\u00028\u0000H\u0016¢\u0006\u0002\u0010\u0017J\u001a\u0010\u0018\u001a\u00020\u00142\b\u0010\u0019\u001a\u0004\u0018\u00010\b2\u0006\u0010\u001a\u001a\u00020\bH\u0002J\u0015\u0010\u001f\u001a\u00020\u00142\u0006\u0010\u000f\u001a\u00028\u0000H\u0016¢\u0006\u0002\u0010 J\u0016\u0010!\u001a\u00020\"2\u0006\u0010\u000f\u001a\u00028\u0000H\u0096@¢\u0006\u0002\u0010#J\b\u0010$\u001a\u00020\"H\u0016J\u001c\u0010%\u001a\u00020&2\f\u0010'\u001a\b\u0012\u0004\u0012\u00028\u00000(H\u0096@¢\u0006\u0002\u0010)J\b\u0010*\u001a\u00020\u0003H\u0014J\u001d\u0010+\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00030,2\u0006\u0010-\u001a\u00020\u000eH\u0014¢\u0006\u0002\u0010.J&\u0010/\u001a\b\u0012\u0004\u0012\u00028\u0000002\u0006\u00101\u001a\u0002022\u0006\u00103\u001a\u00020\u000e2\u0006\u00104\u001a\u000205H\u0016R\u000f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\b0\fX\u0082\u0004R\u000e\u0010\r\u001a\u00020\u000eX\u0082\u000e¢\u0006\u0002\n\u0000R$\u0010\u000f\u001a\u00028\u00002\u0006\u0010\u000f\u001a\u00028\u00008V@VX\u0096\u000e¢\u0006\f\u001a\u0004\b\u0010\u0010\u0011\"\u0004\b\u0012\u0010\nR\u001a\u0010\u001b\u001a\b\u0012\u0004\u0012\u00028\u00000\u001c8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u001d\u0010\u001e¨\u00066"}, d2 = {"Lkotlinx/coroutines/flow/StateFlowImpl;", "T", "Lkotlinx/coroutines/flow/internal/AbstractSharedFlow;", "Lkotlinx/coroutines/flow/StateFlowSlot;", "Lkotlinx/coroutines/flow/MutableStateFlow;", "Lkotlinx/coroutines/flow/CancellableFlow;", "Lkotlinx/coroutines/flow/internal/FusibleFlow;", "initialState", "", "<init>", "(Ljava/lang/Object;)V", "_state", "Lkotlinx/atomicfu/AtomicRef;", "sequence", "", com.datadog.android.rum.internal.metric.ViewEndedMetricDispatcher.KEY_VALUE, "getValue", "()Ljava/lang/Object;", "setValue", "compareAndSet", "", "expect", "update", "(Ljava/lang/Object;Ljava/lang/Object;)Z", "updateState", "expectedState", com.paypal.oslo.feature.inappcheckout.domain.util.LoggerParameterKeys.NEW_STATE_KEY, "replayCache", "", "getReplayCache", "()Ljava/util/List;", "tryEmit", "(Ljava/lang/Object;)Z", "emit", "", "(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "resetReplayCache", "collect", "", "collector", "Lkotlinx/coroutines/flow/FlowCollector;", "(Lkotlinx/coroutines/flow/FlowCollector;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "createSlot", "createSlotArray", "", io.ktor.http.ContentDisposition.Parameters.Size, "(I)[Lkotlinx/coroutines/flow/StateFlowSlot;", "fuse", "Lkotlinx/coroutines/flow/Flow;", "context", "Lkotlin/coroutines/CoroutineContext;", "capacity", "onBufferOverflow", "Lkotlinx/coroutines/channels/BufferOverflow;", "kotlinx-coroutines-core"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes5.dex */
final class StateFlowImpl<T> extends kotlinx.coroutines.flow.internal.AbstractSharedFlow<kotlinx.coroutines.flow.StateFlowSlot> implements kotlinx.coroutines.flow.MutableStateFlow<T>, kotlinx.coroutines.flow.CancellableFlow<T>, kotlinx.coroutines.flow.internal.FusibleFlow<T> {
    private static final /* synthetic */ java.util.concurrent.atomic.AtomicReferenceFieldUpdater getHighSpeedVideoFpsRanges = java.util.concurrent.atomic.AtomicReferenceFieldUpdater.newUpdater(kotlinx.coroutines.flow.StateFlowImpl.class, java.lang.Object.class, "_state$volatile");
    private volatile /* synthetic */ java.lang.Object _state$volatile;
    private int getHighSpeedVideoSizes;

    @Override // kotlinx.coroutines.flow.internal.AbstractSharedFlow
    public final /* synthetic */ kotlinx.coroutines.flow.StateFlowSlot createSlot() {
        return Camera2StreamConfigurationMap();
    }

    @Override // kotlinx.coroutines.flow.internal.AbstractSharedFlow
    public final /* synthetic */ kotlinx.coroutines.flow.StateFlowSlot[] createSlotArray(int i) {
        return getHighResolutionOutputSizeshNQ4ISI(i);
    }

    public StateFlowImpl(java.lang.Object obj) {
        this._state$volatile = obj;
    }

    @Override // kotlinx.coroutines.flow.MutableStateFlow, kotlinx.coroutines.flow.StateFlow
    public final T getValue() {
        kotlinx.coroutines.internal.Symbol symbol = kotlinx.coroutines.flow.internal.NullSurrogateKt.NULL;
        T t = (T) getHighSpeedVideoFpsRanges.get(this);
        if (t == symbol) {
            return null;
        }
        return t;
    }

    @Override // kotlinx.coroutines.flow.MutableStateFlow
    public final void setValue(T t) {
        if (t == null) {
            t = (T) kotlinx.coroutines.flow.internal.NullSurrogateKt.NULL;
        }
        getHighSpeedVideoFpsRangesFor(null, t);
    }

    @Override // kotlinx.coroutines.flow.MutableStateFlow
    public final boolean compareAndSet(T expect, T update) {
        if (expect == null) {
            expect = (T) kotlinx.coroutines.flow.internal.NullSurrogateKt.NULL;
        }
        if (update == null) {
            update = (T) kotlinx.coroutines.flow.internal.NullSurrogateKt.NULL;
        }
        return getHighSpeedVideoFpsRangesFor(expect, update);
    }

    @Override // kotlinx.coroutines.flow.SharedFlow
    public final java.util.List<T> getReplayCache() {
        return kotlin.collections.CollectionsKt.listOf(getValue());
    }

    @Override // kotlinx.coroutines.flow.MutableSharedFlow
    public final boolean tryEmit(T value) {
        setValue(value);
        return true;
    }

    @Override // kotlinx.coroutines.flow.MutableSharedFlow, kotlinx.coroutines.flow.FlowCollector
    public final java.lang.Object emit(T t, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        setValue(t);
        return kotlin.Unit.INSTANCE;
    }

    @Override // kotlinx.coroutines.flow.MutableSharedFlow
    public final void resetReplayCache() {
        throw new java.lang.UnsupportedOperationException("MutableStateFlow.resetReplayCache is not supported");
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x00b9, code lost:
    
        if (kotlin.jvm.internal.Intrinsics.areEqual(r11, (java.lang.Object) r12) == false) goto L39;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x00ec, code lost:
    
        if (r12 == r1) goto L51;
     */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x0093, code lost:
    
        if (((kotlinx.coroutines.flow.SubscribedFlowCollector) r11).onSubscription(r0) != r1) goto L31;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:16:0x00b0 A[Catch: all -> 0x0074, TryCatch #1 {all -> 0x0074, blocks: (B:13:0x003f, B:14:0x00a8, B:16:0x00b0, B:18:0x00b5, B:20:0x00d6, B:22:0x00dc, B:26:0x00bb, B:29:0x00c2, B:38:0x005d, B:40:0x0070, B:41:0x0097), top: B:7:0x0025 }] */
    /* JADX WARN: Removed duplicated region for block: B:18:0x00b5 A[Catch: all -> 0x0074, TryCatch #1 {all -> 0x0074, blocks: (B:13:0x003f, B:14:0x00a8, B:16:0x00b0, B:18:0x00b5, B:20:0x00d6, B:22:0x00dc, B:26:0x00bb, B:29:0x00c2, B:38:0x005d, B:40:0x0070, B:41:0x0097), top: B:7:0x0025 }] */
    /* JADX WARN: Removed duplicated region for block: B:22:0x00dc A[Catch: all -> 0x0074, TRY_LEAVE, TryCatch #1 {all -> 0x0074, blocks: (B:13:0x003f, B:14:0x00a8, B:16:0x00b0, B:18:0x00b5, B:20:0x00d6, B:22:0x00dc, B:26:0x00bb, B:29:0x00c2, B:38:0x005d, B:40:0x0070, B:41:0x0097), top: B:7:0x0025 }] */
    /* JADX WARN: Removed duplicated region for block: B:28:0x00bf  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x00d4  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00d5  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00c1  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0077  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0027  */
    /* JADX WARN: Type inference failed for: r12v12, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r6v0 */
    /* JADX WARN: Type inference failed for: r6v1 */
    /* JADX WARN: Type inference failed for: r6v12 */
    /* JADX WARN: Type inference failed for: r6v13 */
    /* JADX WARN: Type inference failed for: r6v14 */
    /* JADX WARN: Type inference failed for: r6v15 */
    /* JADX WARN: Type inference failed for: r6v5, types: [java.lang.Object] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:21:0x00da -> B:14:0x00a8). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:23:0x00ec -> B:14:0x00a8). Please report as a decompilation issue!!! */
    @Override // kotlinx.coroutines.flow.SharedFlow, kotlinx.coroutines.flow.Flow
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object collect(kotlinx.coroutines.flow.FlowCollector<? super T> flowCollector, kotlin.coroutines.Continuation<?> continuation) {
        kotlinx.coroutines.flow.StateFlowImpl$collect$1 stateFlowImpl$collect$1;
        java.lang.Object coroutine_suspended;
        int i;
        ?? r6;
        kotlinx.coroutines.flow.StateFlowSlot stateFlowSlot;
        kotlinx.coroutines.flow.StateFlowImpl<T> stateFlowImpl;
        kotlinx.coroutines.flow.StateFlowSlot stateFlowSlot2;
        kotlinx.coroutines.Job job;
        kotlinx.coroutines.flow.FlowCollector flowCollector2;
        java.lang.Object obj;
        kotlinx.coroutines.flow.StateFlowSlot stateFlowSlot3;
        boolean highResolutionOutputSizeshNQ4ISI;
        T t;
        try {
            if (continuation instanceof kotlinx.coroutines.flow.StateFlowImpl$collect$1) {
                stateFlowImpl$collect$1 = (kotlinx.coroutines.flow.StateFlowImpl$collect$1) continuation;
                if ((stateFlowImpl$collect$1.getInputFormats & Integer.MIN_VALUE) != 0) {
                    stateFlowImpl$collect$1.getInputFormats -= 2147483648;
                    java.lang.Object obj2 = stateFlowImpl$collect$1.getHighSpeedVideoSizesFor;
                    coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    i = stateFlowImpl$collect$1.getInputFormats;
                    r6 = 1;
                    if (i != 0) {
                        kotlin.ResultKt.throwOnFailure(obj2);
                        stateFlowSlot = allocateSlot();
                        try {
                            if (flowCollector instanceof kotlinx.coroutines.flow.SubscribedFlowCollector) {
                                stateFlowImpl$collect$1.Camera2StreamConfigurationMap = this;
                                stateFlowImpl$collect$1.getHighResolutionOutputSizeshNQ4ISI = flowCollector;
                                stateFlowImpl$collect$1.getHighSpeedVideoFpsRangesFor = stateFlowSlot;
                                stateFlowImpl$collect$1.getInputFormats = 1;
                            }
                            stateFlowImpl = this;
                            stateFlowSlot2 = stateFlowSlot;
                        } catch (java.lang.Throwable th) {
                            th = th;
                            stateFlowImpl = this;
                            stateFlowImpl.freeSlot(stateFlowSlot);
                            throw th;
                        }
                    } else if (i == 1) {
                        kotlinx.coroutines.flow.StateFlowSlot stateFlowSlot4 = (kotlinx.coroutines.flow.StateFlowSlot) stateFlowImpl$collect$1.getHighSpeedVideoFpsRangesFor;
                        flowCollector = (kotlinx.coroutines.flow.FlowCollector) stateFlowImpl$collect$1.getHighResolutionOutputSizeshNQ4ISI;
                        stateFlowImpl = (kotlinx.coroutines.flow.StateFlowImpl) stateFlowImpl$collect$1.Camera2StreamConfigurationMap;
                        kotlin.ResultKt.throwOnFailure(obj2);
                        stateFlowSlot2 = stateFlowSlot4;
                    } else if (i == 2) {
                        obj = stateFlowImpl$collect$1.getHighSpeedVideoFpsRanges;
                        job = (kotlinx.coroutines.Job) stateFlowImpl$collect$1.getHighSpeedVideoSizes;
                        kotlinx.coroutines.flow.StateFlowSlot stateFlowSlot5 = (kotlinx.coroutines.flow.StateFlowSlot) stateFlowImpl$collect$1.getHighSpeedVideoFpsRangesFor;
                        flowCollector2 = (kotlinx.coroutines.flow.FlowCollector) stateFlowImpl$collect$1.getHighResolutionOutputSizeshNQ4ISI;
                        stateFlowImpl = (kotlinx.coroutines.flow.StateFlowImpl) stateFlowImpl$collect$1.Camera2StreamConfigurationMap;
                        kotlin.ResultKt.throwOnFailure(obj2);
                        stateFlowSlot3 = stateFlowSlot5;
                        highResolutionOutputSizeshNQ4ISI = stateFlowSlot3.getHighResolutionOutputSizeshNQ4ISI();
                        r6 = stateFlowSlot3;
                        if (!highResolutionOutputSizeshNQ4ISI) {
                        }
                        ?? r12 = getHighSpeedVideoFpsRanges.get(stateFlowImpl);
                        if (job != null) {
                        }
                        if (obj != null) {
                        }
                        if (r12 == kotlinx.coroutines.flow.internal.NullSurrogateKt.NULL) {
                        }
                        stateFlowImpl$collect$1.Camera2StreamConfigurationMap = stateFlowImpl;
                        stateFlowImpl$collect$1.getHighResolutionOutputSizeshNQ4ISI = flowCollector2;
                        stateFlowImpl$collect$1.getHighSpeedVideoFpsRangesFor = r6;
                        stateFlowImpl$collect$1.getHighSpeedVideoSizes = job;
                        stateFlowImpl$collect$1.getHighSpeedVideoFpsRanges = r12;
                        stateFlowImpl$collect$1.getInputFormats = 2;
                        if (flowCollector2.emit(t, stateFlowImpl$collect$1) == coroutine_suspended) {
                        }
                    } else {
                        if (i != 3) {
                            throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        obj = stateFlowImpl$collect$1.getHighSpeedVideoFpsRanges;
                        job = (kotlinx.coroutines.Job) stateFlowImpl$collect$1.getHighSpeedVideoSizes;
                        kotlinx.coroutines.flow.StateFlowSlot stateFlowSlot6 = (kotlinx.coroutines.flow.StateFlowSlot) stateFlowImpl$collect$1.getHighSpeedVideoFpsRangesFor;
                        flowCollector2 = (kotlinx.coroutines.flow.FlowCollector) stateFlowImpl$collect$1.getHighResolutionOutputSizeshNQ4ISI;
                        stateFlowImpl = (kotlinx.coroutines.flow.StateFlowImpl) stateFlowImpl$collect$1.Camera2StreamConfigurationMap;
                        kotlin.ResultKt.throwOnFailure(obj2);
                        r6 = stateFlowSlot6;
                        ?? r122 = getHighSpeedVideoFpsRanges.get(stateFlowImpl);
                        if (job != null) {
                            kotlinx.coroutines.JobKt.ensureActive(job);
                        }
                        if (obj != null) {
                            stateFlowSlot3 = r6;
                        }
                        t = r122 == kotlinx.coroutines.flow.internal.NullSurrogateKt.NULL ? null : r122;
                        stateFlowImpl$collect$1.Camera2StreamConfigurationMap = stateFlowImpl;
                        stateFlowImpl$collect$1.getHighResolutionOutputSizeshNQ4ISI = flowCollector2;
                        stateFlowImpl$collect$1.getHighSpeedVideoFpsRangesFor = r6;
                        stateFlowImpl$collect$1.getHighSpeedVideoSizes = job;
                        stateFlowImpl$collect$1.getHighSpeedVideoFpsRanges = r122;
                        stateFlowImpl$collect$1.getInputFormats = 2;
                        if (flowCollector2.emit(t, stateFlowImpl$collect$1) == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                        obj = r122;
                        stateFlowSlot3 = r6;
                        highResolutionOutputSizeshNQ4ISI = stateFlowSlot3.getHighResolutionOutputSizeshNQ4ISI();
                        r6 = stateFlowSlot3;
                        if (!highResolutionOutputSizeshNQ4ISI) {
                            stateFlowImpl$collect$1.Camera2StreamConfigurationMap = stateFlowImpl;
                            stateFlowImpl$collect$1.getHighResolutionOutputSizeshNQ4ISI = flowCollector2;
                            stateFlowImpl$collect$1.getHighSpeedVideoFpsRangesFor = stateFlowSlot3;
                            stateFlowImpl$collect$1.getHighSpeedVideoSizes = job;
                            stateFlowImpl$collect$1.getHighSpeedVideoFpsRanges = obj;
                            stateFlowImpl$collect$1.getInputFormats = 3;
                            java.lang.Object highResolutionOutputSizeshNQ4ISI2 = stateFlowSlot3.getHighResolutionOutputSizeshNQ4ISI(stateFlowImpl$collect$1);
                            r6 = stateFlowSlot3;
                        }
                        ?? r1222 = getHighSpeedVideoFpsRanges.get(stateFlowImpl);
                        if (job != null) {
                        }
                        if (obj != null) {
                        }
                        if (r1222 == kotlinx.coroutines.flow.internal.NullSurrogateKt.NULL) {
                        }
                        stateFlowImpl$collect$1.Camera2StreamConfigurationMap = stateFlowImpl;
                        stateFlowImpl$collect$1.getHighResolutionOutputSizeshNQ4ISI = flowCollector2;
                        stateFlowImpl$collect$1.getHighSpeedVideoFpsRangesFor = r6;
                        stateFlowImpl$collect$1.getHighSpeedVideoSizes = job;
                        stateFlowImpl$collect$1.getHighSpeedVideoFpsRanges = r1222;
                        stateFlowImpl$collect$1.getInputFormats = 2;
                        if (flowCollector2.emit(t, stateFlowImpl$collect$1) == coroutine_suspended) {
                        }
                    }
                    job = (kotlinx.coroutines.Job) stateFlowImpl$collect$1.getContext().get(kotlinx.coroutines.Job.INSTANCE);
                    flowCollector2 = flowCollector;
                    obj = null;
                    r6 = stateFlowSlot2;
                    ?? r12222 = getHighSpeedVideoFpsRanges.get(stateFlowImpl);
                    if (job != null) {
                    }
                    if (obj != null) {
                    }
                    if (r12222 == kotlinx.coroutines.flow.internal.NullSurrogateKt.NULL) {
                    }
                    stateFlowImpl$collect$1.Camera2StreamConfigurationMap = stateFlowImpl;
                    stateFlowImpl$collect$1.getHighResolutionOutputSizeshNQ4ISI = flowCollector2;
                    stateFlowImpl$collect$1.getHighSpeedVideoFpsRangesFor = r6;
                    stateFlowImpl$collect$1.getHighSpeedVideoSizes = job;
                    stateFlowImpl$collect$1.getHighSpeedVideoFpsRanges = r12222;
                    stateFlowImpl$collect$1.getInputFormats = 2;
                    if (flowCollector2.emit(t, stateFlowImpl$collect$1) == coroutine_suspended) {
                    }
                }
            }
            if (i != 0) {
            }
            job = (kotlinx.coroutines.Job) stateFlowImpl$collect$1.getContext().get(kotlinx.coroutines.Job.INSTANCE);
            flowCollector2 = flowCollector;
            obj = null;
            r6 = stateFlowSlot2;
            ?? r122222 = getHighSpeedVideoFpsRanges.get(stateFlowImpl);
            if (job != null) {
            }
            if (obj != null) {
            }
            if (r122222 == kotlinx.coroutines.flow.internal.NullSurrogateKt.NULL) {
            }
            stateFlowImpl$collect$1.Camera2StreamConfigurationMap = stateFlowImpl;
            stateFlowImpl$collect$1.getHighResolutionOutputSizeshNQ4ISI = flowCollector2;
            stateFlowImpl$collect$1.getHighSpeedVideoFpsRangesFor = r6;
            stateFlowImpl$collect$1.getHighSpeedVideoSizes = job;
            stateFlowImpl$collect$1.getHighSpeedVideoFpsRanges = r122222;
            stateFlowImpl$collect$1.getInputFormats = 2;
            if (flowCollector2.emit(t, stateFlowImpl$collect$1) == coroutine_suspended) {
            }
        } catch (java.lang.Throwable th2) {
            th = th2;
            stateFlowSlot = r6;
        }
        stateFlowImpl$collect$1 = new kotlinx.coroutines.flow.StateFlowImpl$collect$1(this, continuation);
        java.lang.Object obj22 = stateFlowImpl$collect$1.getHighSpeedVideoSizesFor;
        coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = stateFlowImpl$collect$1.getInputFormats;
        r6 = 1;
    }

    private static kotlinx.coroutines.flow.StateFlowSlot Camera2StreamConfigurationMap() {
        return new kotlinx.coroutines.flow.StateFlowSlot();
    }

    private static kotlinx.coroutines.flow.StateFlowSlot[] getHighResolutionOutputSizeshNQ4ISI(int i) {
        return new kotlinx.coroutines.flow.StateFlowSlot[i];
    }

    @Override // kotlinx.coroutines.flow.internal.FusibleFlow
    public final kotlinx.coroutines.flow.Flow<T> fuse(kotlin.coroutines.CoroutineContext context, int capacity, kotlinx.coroutines.channels.BufferOverflow onBufferOverflow) {
        return kotlinx.coroutines.flow.StateFlowKt.fuseStateFlow(this, context, capacity, onBufferOverflow);
    }

    private final boolean getHighSpeedVideoFpsRangesFor(java.lang.Object obj, java.lang.Object obj2) {
        int i;
        kotlinx.coroutines.flow.StateFlowSlot[] slots;
        synchronized (this) {
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = getHighSpeedVideoFpsRanges;
            java.lang.Object obj3 = atomicReferenceFieldUpdater.get(this);
            if (obj != null && !kotlin.jvm.internal.Intrinsics.areEqual(obj3, obj)) {
                return false;
            }
            if (kotlin.jvm.internal.Intrinsics.areEqual(obj3, obj2)) {
                return true;
            }
            atomicReferenceFieldUpdater.set(this, obj2);
            int i2 = this.getHighSpeedVideoSizes;
            if ((i2 & 1) == 0) {
                int i3 = i2 + 1;
                this.getHighSpeedVideoSizes = i3;
                kotlinx.coroutines.flow.StateFlowSlot[] slots2 = getSlots();
                kotlin.Unit unit = kotlin.Unit.INSTANCE;
                while (true) {
                    kotlinx.coroutines.flow.StateFlowSlot[] stateFlowSlotArr = slots2;
                    if (stateFlowSlotArr != null) {
                        for (kotlinx.coroutines.flow.StateFlowSlot stateFlowSlot : stateFlowSlotArr) {
                            if (stateFlowSlot != null) {
                                stateFlowSlot.getHighSpeedVideoSizes();
                            }
                        }
                    }
                    synchronized (this) {
                        i = this.getHighSpeedVideoSizes;
                        if (i == i3) {
                            this.getHighSpeedVideoSizes = i3 + 1;
                            return true;
                        }
                        slots = getSlots();
                        kotlin.Unit unit2 = kotlin.Unit.INSTANCE;
                    }
                    slots2 = slots;
                    i3 = i;
                }
            } else {
                this.getHighSpeedVideoSizes = i2 + 2;
                return true;
            }
        }
    }
}
