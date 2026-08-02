package kotlinx.coroutines.flow;

@kotlin.Metadata(d1 = {"\u0000\u0080\u0001\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0001\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0010 \n\u0002\b\b\b\u0010\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00020\u00030\u00022\b\u0012\u0004\u0012\u00028\u00000\u00042\b\u0012\u0004\u0012\u00028\u00000\u00052\b\u0012\u0004\u0012\u00028\u00000\u0006:\u0001VB\u001f\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\t\u001a\u00020\u0007\u0012\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\f\u0010\rJ\u001e\u0010\u0011\u001a\u00020\u00102\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00028\u00000\u000eH\u0096@¢\u0006\u0004\b\u0011\u0010\u0012J\u0017\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0013\u001a\u00028\u0000H\u0016¢\u0006\u0004\b\u0015\u0010\u0016J\u0018\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u0013\u001a\u00028\u0000H\u0096@¢\u0006\u0004\b\u0018\u0010\u0019J\u0017\u0010\u001b\u001a\u00020\u00142\u0006\u0010\u001a\u001a\u00028\u0000H\u0002¢\u0006\u0004\b\u001b\u0010\u0016J\u0017\u0010\u001c\u001a\u00020\u00142\u0006\u0010\u001a\u001a\u00028\u0000H\u0002¢\u0006\u0004\b\u001c\u0010\u0016J\u000f\u0010\u001d\u001a\u00020\u0017H\u0002¢\u0006\u0004\b\u001d\u0010\u001eJ\u0019\u0010 \u001a\u00020\u00172\b\u0010\u001a\u001a\u0004\u0018\u00010\u001fH\u0002¢\u0006\u0004\b \u0010!J9\u0010 \u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u001f0\"2\u0010\u0010\u001a\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u001f\u0018\u00010\"2\u0006\u0010#\u001a\u00020\u00072\u0006\u0010$\u001a\u00020\u0007H\u0002¢\u0006\u0004\b \u0010%J\u0018\u0010\u001c\u001a\u00020\u00172\u0006\u0010\u001a\u001a\u00028\u0000H\u0082@¢\u0006\u0004\b\u001c\u0010\u0019J\u000f\u0010'\u001a\u00020&H\u0000¢\u0006\u0004\b'\u0010(J%\u0010+\u001a\u0010\u0012\f\u0012\n\u0012\u0004\u0012\u00020\u0017\u0018\u00010*0\"2\u0006\u0010)\u001a\u00020&H\u0000¢\u0006\u0004\b+\u0010,J/\u0010\u001d\u001a\u00020\u00172\u0006\u0010\u001a\u001a\u00020&2\u0006\u0010#\u001a\u00020&2\u0006\u0010$\u001a\u00020&2\u0006\u0010-\u001a\u00020&H\u0002¢\u0006\u0004\b\u001d\u0010.J\u000f\u0010 \u001a\u00020\u0017H\u0002¢\u0006\u0004\b \u0010\u001eJ\u0019\u0010\u001d\u001a\u0004\u0018\u00010\u001f2\u0006\u0010\u001a\u001a\u00020\u0003H\u0002¢\u0006\u0004\b\u001d\u0010/J\u0017\u0010 \u001a\u00020&2\u0006\u0010\u001a\u001a\u00020\u0003H\u0002¢\u0006\u0004\b \u00100J\u0019\u0010\u001d\u001a\u0004\u0018\u00010\u001f2\u0006\u0010\u001a\u001a\u00020&H\u0002¢\u0006\u0004\b\u001d\u00101J\u0018\u00102\u001a\u00020\u00172\u0006\u0010\u001a\u001a\u00020\u0003H\u0082@¢\u0006\u0004\b2\u00103J3\u0010\u001d\u001a\u0010\u0012\f\u0012\n\u0012\u0004\u0012\u00020\u0017\u0018\u00010*0\"2\u0014\u0010\u001a\u001a\u0010\u0012\f\u0012\n\u0012\u0004\u0012\u00020\u0017\u0018\u00010*0\"H\u0002¢\u0006\u0004\b\u001d\u00104J\u000f\u00105\u001a\u00020\u0003H\u0014¢\u0006\u0004\b5\u00106J\u001f\u00108\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00030\"2\u0006\u00107\u001a\u00020\u0007H\u0014¢\u0006\u0004\b8\u00109J\u000f\u0010:\u001a\u00020\u0017H\u0016¢\u0006\u0004\b:\u0010\u001eJ-\u0010?\u001a\b\u0012\u0004\u0012\u00028\u00000>2\u0006\u0010<\u001a\u00020;2\u0006\u0010=\u001a\u00020\u00072\u0006\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b?\u0010@R\u0014\u0010\u001d\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bA\u0010BR\u0014\u00102\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b2\u0010BR\u0014\u0010\u001b\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010CR \u0010\u001c\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u001f\u0018\u00010\"8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b \u0010DR\u0016\u0010 \u001a\u00020&8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bE\u0010FR\u0016\u0010G\u001a\u00020&8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001d\u0010FR\u0016\u0010H\u001a\u00020\u00078\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001c\u0010BR\u0016\u0010E\u001a\u00020\u00078\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bG\u0010BR\u0014\u0010I\u001a\u00020&8CX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u001b\u0010(R\u0014\u0010A\u001a\u00020\u00078CX\u0082\u0004¢\u0006\u0006\u001a\u0004\bI\u0010JR\u0014\u0010K\u001a\u00020\u00078CX\u0082\u0004¢\u0006\u0006\u001a\u0004\bG\u0010JR\u0014\u0010L\u001a\u00020&8CX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u001c\u0010(R\u0014\u0010M\u001a\u00020&8CX\u0082\u0004¢\u0006\u0006\u001a\u0004\b2\u0010(R\u001a\u0010Q\u001a\b\u0012\u0004\u0012\u00028\u00000N8WX\u0096\u0004¢\u0006\u0006\u001a\u0004\bO\u0010PR\u001a\u0010U\u001a\u00028\u00008EX\u0084\u0004¢\u0006\f\u0012\u0004\bT\u0010\u001e\u001a\u0004\bR\u0010S"}, d2 = {"Lkotlinx/coroutines/flow/SharedFlowImpl;", "T", "Lkotlinx/coroutines/flow/internal/AbstractSharedFlow;", "Lkotlinx/coroutines/flow/SharedFlowSlot;", "Lkotlinx/coroutines/flow/MutableSharedFlow;", "Lkotlinx/coroutines/flow/CancellableFlow;", "Lkotlinx/coroutines/flow/internal/FusibleFlow;", "", "replay", "bufferCapacity", "Lkotlinx/coroutines/channels/BufferOverflow;", "onBufferOverflow", "<init>", "(IILkotlinx/coroutines/channels/BufferOverflow;)V", "Lkotlinx/coroutines/flow/FlowCollector;", "collector", "", "collect", "(Lkotlinx/coroutines/flow/FlowCollector;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", com.datadog.android.rum.internal.metric.ViewEndedMetricDispatcher.KEY_VALUE, "", "tryEmit", "(Ljava/lang/Object;)Z", "", "emit", "(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "p0", "getHighSpeedVideoFpsRangesFor", "Camera2StreamConfigurationMap", "getHighSpeedVideoSizes", "()V", "", "getHighSpeedVideoFpsRanges", "(Ljava/lang/Object;)V", "", "p1", "p2", "([Ljava/lang/Object;II)[Ljava/lang/Object;", "", "updateNewCollectorIndexLocked$kotlinx_coroutines_core", "()J", "oldIndex", "Lkotlin/coroutines/Continuation;", "updateCollectorIndexLocked$kotlinx_coroutines_core", "(J)[Lkotlin/coroutines/Continuation;", "p3", "(JJJJ)V", "(Lkotlinx/coroutines/flow/SharedFlowSlot;)Ljava/lang/Object;", "(Lkotlinx/coroutines/flow/SharedFlowSlot;)J", "(J)Ljava/lang/Object;", "getHighResolutionOutputSizeshNQ4ISI", "(Lkotlinx/coroutines/flow/SharedFlowSlot;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "([Lkotlin/coroutines/Continuation;)[Lkotlin/coroutines/Continuation;", "createSlot", "()Lkotlinx/coroutines/flow/SharedFlowSlot;", io.ktor.http.ContentDisposition.Parameters.Size, "createSlotArray", "(I)[Lkotlinx/coroutines/flow/SharedFlowSlot;", "resetReplayCache", "Lkotlin/coroutines/CoroutineContext;", "context", "capacity", "Lkotlinx/coroutines/flow/Flow;", "fuse", "(Lkotlin/coroutines/CoroutineContext;ILkotlinx/coroutines/channels/BufferOverflow;)Lkotlinx/coroutines/flow/Flow;", "getInputSizeshNQ4ISI", com.visa.cbp.getEncExpo.warmup, "Lkotlinx/coroutines/channels/BufferOverflow;", "[Ljava/lang/Object;", "getHighSpeedVideoSizesFor", "J", "getOutputMinFrameDuration", "getOutputFormats", "getInputFormats", "()I", "getOutputMinFrameDurationlomOqCM", "getOutputSizes", "getOutputSizeshNQ4ISI", "", "getReplayCache", "()Ljava/util/List;", "replayCache", "getLastReplayedLocked", "()Ljava/lang/Object;", "getLastReplayedLocked$annotations", "lastReplayedLocked", "Emitter"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes5.dex */
public class SharedFlowImpl<T> extends kotlinx.coroutines.flow.internal.AbstractSharedFlow<kotlinx.coroutines.flow.SharedFlowSlot> implements kotlinx.coroutines.flow.MutableSharedFlow<T>, kotlinx.coroutines.flow.CancellableFlow<T>, kotlinx.coroutines.flow.internal.FusibleFlow<T> {

    /* renamed from: Camera2StreamConfigurationMap, reason: from kotlin metadata */
    private int getOutputFormats;
    private final int getHighResolutionOutputSizeshNQ4ISI;

    /* renamed from: getHighSpeedVideoFpsRanges, reason: from kotlin metadata */
    private java.lang.Object[] Camera2StreamConfigurationMap;
    private final kotlinx.coroutines.channels.BufferOverflow getHighSpeedVideoFpsRangesFor;

    /* renamed from: getHighSpeedVideoSizes, reason: from kotlin metadata */
    private long getOutputMinFrameDuration;

    /* renamed from: getHighSpeedVideoSizesFor, reason: from kotlin metadata */
    private long getHighSpeedVideoFpsRanges;

    /* renamed from: getInputSizeshNQ4ISI, reason: from kotlin metadata */
    private final int getHighSpeedVideoSizes;

    /* renamed from: getOutputMinFrameDuration, reason: from kotlin metadata */
    private int getHighSpeedVideoSizesFor;

    protected static /* synthetic */ void getLastReplayedLocked$annotations() {
    }

    public SharedFlowImpl(int i, int i2, kotlinx.coroutines.channels.BufferOverflow bufferOverflow) {
        this.getHighSpeedVideoSizes = i;
        this.getHighResolutionOutputSizeshNQ4ISI = i2;
        this.getHighSpeedVideoFpsRangesFor = bufferOverflow;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final long getHighSpeedVideoFpsRangesFor() {
        return java.lang.Math.min(this.getOutputMinFrameDuration, this.getHighSpeedVideoFpsRanges);
    }

    private final int getInputFormats() {
        return (int) ((getHighSpeedVideoFpsRangesFor() + this.getOutputFormats) - this.getHighSpeedVideoFpsRanges);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final int getOutputMinFrameDuration() {
        return this.getOutputFormats + this.getHighSpeedVideoSizesFor;
    }

    private final long Camera2StreamConfigurationMap() {
        return getHighSpeedVideoFpsRangesFor() + this.getOutputFormats;
    }

    private final long getHighResolutionOutputSizeshNQ4ISI() {
        return getHighSpeedVideoFpsRangesFor() + this.getOutputFormats + this.getHighSpeedVideoSizesFor;
    }

    protected final T getLastReplayedLocked() {
        java.lang.Object highSpeedVideoSizes;
        java.lang.Object[] objArr = this.Camera2StreamConfigurationMap;
        kotlin.jvm.internal.Intrinsics.checkNotNull(objArr);
        highSpeedVideoSizes = kotlinx.coroutines.flow.SharedFlowKt.getHighSpeedVideoSizes(objArr, (this.getHighSpeedVideoFpsRanges + getInputFormats()) - 1);
        return (T) highSpeedVideoSizes;
    }

    /* JADX WARN: Code restructure failed: missing block: B:58:0x0084, code lost:
    
        if (((kotlinx.coroutines.flow.SubscribedFlowCollector) r9).onSubscription(r0) != r1) goto L31;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:20:0x00b3 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:29:0x00a2 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:53:0x0068  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0026  */
    /* JADX WARN: Type inference failed for: r2v14 */
    /* JADX WARN: Type inference failed for: r2v8 */
    /* JADX WARN: Type inference failed for: r2v9, types: [java.lang.Object, kotlinx.coroutines.flow.FlowCollector] */
    /* JADX WARN: Type inference failed for: r5v1 */
    /* JADX WARN: Type inference failed for: r5v10 */
    /* JADX WARN: Type inference failed for: r5v4 */
    /* JADX WARN: Type inference failed for: r5v5 */
    /* JADX WARN: Type inference failed for: r5v6 */
    /* JADX WARN: Type inference failed for: r5v7, types: [java.lang.Object, kotlinx.coroutines.flow.SharedFlowImpl] */
    /* JADX WARN: Type inference failed for: r5v9, types: [kotlinx.coroutines.flow.SharedFlowImpl] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    static /* synthetic */ <T> java.lang.Object getHighSpeedVideoSizes(kotlinx.coroutines.flow.SharedFlowImpl<T> sharedFlowImpl, kotlinx.coroutines.flow.FlowCollector<? super T> flowCollector, kotlin.coroutines.Continuation<?> continuation) {
        kotlinx.coroutines.flow.SharedFlowImpl$collect$1 sharedFlowImpl$collect$1;
        int i;
        kotlinx.coroutines.flow.SharedFlowSlot allocateSlot;
        kotlinx.coroutines.flow.FlowCollector<? super T> flowCollector2;
        kotlinx.coroutines.flow.SharedFlowSlot sharedFlowSlot;
        ?? r5;
        java.lang.Throwable th;
        kotlinx.coroutines.Job job;
        ?? r2;
        java.lang.Object highSpeedVideoSizes;
        try {
            if (continuation instanceof kotlinx.coroutines.flow.SharedFlowImpl$collect$1) {
                sharedFlowImpl$collect$1 = (kotlinx.coroutines.flow.SharedFlowImpl$collect$1) continuation;
                if ((sharedFlowImpl$collect$1.getHighSpeedVideoFpsRanges & Integer.MIN_VALUE) != 0) {
                    sharedFlowImpl$collect$1.getHighSpeedVideoFpsRanges -= 2147483648;
                    java.lang.Object obj = sharedFlowImpl$collect$1.getOutputFormats;
                    java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    i = sharedFlowImpl$collect$1.getHighSpeedVideoFpsRanges;
                    if (i != 0) {
                        kotlin.ResultKt.throwOnFailure(obj);
                        allocateSlot = sharedFlowImpl.allocateSlot();
                        try {
                            if (flowCollector instanceof kotlinx.coroutines.flow.SubscribedFlowCollector) {
                                sharedFlowImpl$collect$1.getHighResolutionOutputSizeshNQ4ISI = sharedFlowImpl;
                                sharedFlowImpl$collect$1.getHighSpeedVideoFpsRangesFor = flowCollector;
                                sharedFlowImpl$collect$1.getHighSpeedVideoSizes = allocateSlot;
                                sharedFlowImpl$collect$1.getHighSpeedVideoFpsRanges = 1;
                            }
                            flowCollector2 = flowCollector;
                            sharedFlowSlot = allocateSlot;
                        } catch (java.lang.Throwable th2) {
                            th = th2;
                            sharedFlowImpl.freeSlot(allocateSlot);
                            throw th;
                        }
                    } else {
                        if (i != 1) {
                            if (i != 2 && i != 3) {
                                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                            job = (kotlinx.coroutines.Job) sharedFlowImpl$collect$1.Camera2StreamConfigurationMap;
                            sharedFlowSlot = (kotlinx.coroutines.flow.SharedFlowSlot) sharedFlowImpl$collect$1.getHighSpeedVideoSizes;
                            kotlinx.coroutines.flow.FlowCollector flowCollector3 = (kotlinx.coroutines.flow.FlowCollector) sharedFlowImpl$collect$1.getHighSpeedVideoFpsRangesFor;
                            r5 = (kotlinx.coroutines.flow.SharedFlowImpl) sharedFlowImpl$collect$1.getHighResolutionOutputSizeshNQ4ISI;
                            try {
                                kotlin.ResultKt.throwOnFailure(obj);
                                r2 = flowCollector3;
                                r5 = r5;
                                while (true) {
                                    highSpeedVideoSizes = r5.getHighSpeedVideoSizes(sharedFlowSlot);
                                    if (highSpeedVideoSizes == kotlinx.coroutines.flow.SharedFlowKt.NO_VALUE) {
                                        sharedFlowImpl$collect$1.getHighResolutionOutputSizeshNQ4ISI = r5;
                                        sharedFlowImpl$collect$1.getHighSpeedVideoFpsRangesFor = r2;
                                        sharedFlowImpl$collect$1.getHighSpeedVideoSizes = sharedFlowSlot;
                                        sharedFlowImpl$collect$1.Camera2StreamConfigurationMap = job;
                                        sharedFlowImpl$collect$1.getHighSpeedVideoFpsRanges = 2;
                                        if (r5.getHighResolutionOutputSizeshNQ4ISI(sharedFlowSlot, sharedFlowImpl$collect$1) == coroutine_suspended) {
                                            break;
                                        }
                                    } else {
                                        if (job != null) {
                                            kotlinx.coroutines.JobKt.ensureActive(job);
                                        }
                                        sharedFlowImpl$collect$1.getHighResolutionOutputSizeshNQ4ISI = r5;
                                        sharedFlowImpl$collect$1.getHighSpeedVideoFpsRangesFor = r2;
                                        sharedFlowImpl$collect$1.getHighSpeedVideoSizes = sharedFlowSlot;
                                        sharedFlowImpl$collect$1.Camera2StreamConfigurationMap = job;
                                        sharedFlowImpl$collect$1.getHighSpeedVideoFpsRanges = 3;
                                        if (r2.emit(highSpeedVideoSizes, sharedFlowImpl$collect$1) == coroutine_suspended) {
                                            break;
                                        }
                                    }
                                }
                                return coroutine_suspended;
                            } catch (java.lang.Throwable th3) {
                                th = th3;
                                allocateSlot = sharedFlowSlot;
                                th = th;
                                sharedFlowImpl = r5;
                                sharedFlowImpl.freeSlot(allocateSlot);
                                throw th;
                            }
                        }
                        sharedFlowSlot = (kotlinx.coroutines.flow.SharedFlowSlot) sharedFlowImpl$collect$1.getHighSpeedVideoSizes;
                        kotlinx.coroutines.flow.FlowCollector<? super T> flowCollector4 = (kotlinx.coroutines.flow.FlowCollector) sharedFlowImpl$collect$1.getHighSpeedVideoFpsRangesFor;
                        kotlinx.coroutines.flow.SharedFlowImpl<T> sharedFlowImpl2 = (kotlinx.coroutines.flow.SharedFlowImpl) sharedFlowImpl$collect$1.getHighResolutionOutputSizeshNQ4ISI;
                        try {
                            kotlin.ResultKt.throwOnFailure(obj);
                            flowCollector2 = flowCollector4;
                            sharedFlowImpl = sharedFlowImpl2;
                        } catch (java.lang.Throwable th4) {
                            allocateSlot = sharedFlowSlot;
                            th = th4;
                            sharedFlowImpl = sharedFlowImpl2;
                            sharedFlowImpl.freeSlot(allocateSlot);
                            throw th;
                        }
                    }
                    r5 = sharedFlowImpl;
                    job = (kotlinx.coroutines.Job) sharedFlowImpl$collect$1.getContext().get(kotlinx.coroutines.Job.INSTANCE);
                    r2 = flowCollector2;
                    while (true) {
                        highSpeedVideoSizes = r5.getHighSpeedVideoSizes(sharedFlowSlot);
                        if (highSpeedVideoSizes == kotlinx.coroutines.flow.SharedFlowKt.NO_VALUE) {
                        }
                    }
                    return coroutine_suspended;
                }
            }
            r5 = sharedFlowImpl;
            job = (kotlinx.coroutines.Job) sharedFlowImpl$collect$1.getContext().get(kotlinx.coroutines.Job.INSTANCE);
            r2 = flowCollector2;
            while (true) {
                highSpeedVideoSizes = r5.getHighSpeedVideoSizes(sharedFlowSlot);
                if (highSpeedVideoSizes == kotlinx.coroutines.flow.SharedFlowKt.NO_VALUE) {
                }
            }
            return coroutine_suspended;
        } catch (java.lang.Throwable th5) {
            r5 = sharedFlowImpl;
            th = th5;
            allocateSlot = sharedFlowSlot;
            th = th;
            sharedFlowImpl = r5;
            sharedFlowImpl.freeSlot(allocateSlot);
            throw th;
        }
        sharedFlowImpl$collect$1 = new kotlinx.coroutines.flow.SharedFlowImpl$collect$1(sharedFlowImpl, continuation);
        java.lang.Object obj2 = sharedFlowImpl$collect$1.getOutputFormats;
        java.lang.Object coroutine_suspended2 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = sharedFlowImpl$collect$1.getHighSpeedVideoFpsRanges;
        if (i != 0) {
        }
    }

    @Override // kotlinx.coroutines.flow.MutableSharedFlow
    public boolean tryEmit(T value) {
        int i;
        boolean z;
        kotlin.coroutines.Continuation<kotlin.Unit>[] continuationArr = kotlinx.coroutines.flow.internal.AbstractSharedFlowKt.EMPTY_RESUMES;
        synchronized (this) {
            if (getHighSpeedVideoFpsRangesFor(value)) {
                continuationArr = getHighSpeedVideoSizes(continuationArr);
                z = true;
            } else {
                z = false;
            }
        }
        for (kotlin.coroutines.Continuation<kotlin.Unit> continuation : continuationArr) {
            if (continuation != null) {
                kotlin.Result.Companion companion = kotlin.Result.INSTANCE;
                continuation.resumeWith(kotlin.Result.m23436constructorimpl(kotlin.Unit.INSTANCE));
            }
        }
        return z;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean getHighSpeedVideoFpsRangesFor(T p0) {
        if (getNCollectors() == 0) {
            return Camera2StreamConfigurationMap(p0);
        }
        if (this.getOutputFormats >= this.getHighResolutionOutputSizeshNQ4ISI && this.getOutputMinFrameDuration <= this.getHighSpeedVideoFpsRanges) {
            int i = kotlinx.coroutines.flow.SharedFlowImpl.WhenMappings.$EnumSwitchMapping$0[this.getHighSpeedVideoFpsRangesFor.ordinal()];
            if (i == 1) {
                return false;
            }
            if (i == 2) {
                return true;
            }
            if (i != 3) {
                throw new kotlin.NoWhenBranchMatchedException();
            }
        }
        getHighSpeedVideoFpsRanges(p0);
        int i2 = this.getOutputFormats + 1;
        this.getOutputFormats = i2;
        if (i2 > this.getHighResolutionOutputSizeshNQ4ISI) {
            getHighSpeedVideoSizes();
        }
        if (getInputFormats() > this.getHighSpeedVideoSizes) {
            getHighSpeedVideoSizes(this.getHighSpeedVideoFpsRanges + 1, this.getOutputMinFrameDuration, Camera2StreamConfigurationMap(), getHighResolutionOutputSizeshNQ4ISI());
        }
        return true;
    }

    private final boolean Camera2StreamConfigurationMap(T p0) {
        if (kotlinx.coroutines.DebugKt.getASSERTIONS_ENABLED() && getNCollectors() != 0) {
            throw new java.lang.AssertionError();
        }
        if (this.getHighSpeedVideoSizes == 0) {
            return true;
        }
        getHighSpeedVideoFpsRanges(p0);
        int i = this.getOutputFormats + 1;
        this.getOutputFormats = i;
        if (i > this.getHighSpeedVideoSizes) {
            getHighSpeedVideoSizes();
        }
        this.getOutputMinFrameDuration = getHighSpeedVideoFpsRangesFor() + this.getOutputFormats;
        return true;
    }

    private final void getHighSpeedVideoSizes() {
        kotlinx.coroutines.flow.internal.AbstractSharedFlowSlot[] abstractSharedFlowSlotArr;
        java.lang.Object[] objArr = this.Camera2StreamConfigurationMap;
        kotlin.jvm.internal.Intrinsics.checkNotNull(objArr);
        kotlinx.coroutines.flow.SharedFlowKt.getHighResolutionOutputSizeshNQ4ISI(objArr, getHighSpeedVideoFpsRangesFor(), null);
        this.getOutputFormats--;
        long highSpeedVideoFpsRangesFor = getHighSpeedVideoFpsRangesFor() + 1;
        if (this.getHighSpeedVideoFpsRanges < highSpeedVideoFpsRangesFor) {
            this.getHighSpeedVideoFpsRanges = highSpeedVideoFpsRangesFor;
        }
        if (this.getOutputMinFrameDuration < highSpeedVideoFpsRangesFor) {
            kotlinx.coroutines.flow.SharedFlowImpl<T> sharedFlowImpl = this;
            if (((kotlinx.coroutines.flow.internal.AbstractSharedFlow) sharedFlowImpl).nCollectors != 0 && (abstractSharedFlowSlotArr = ((kotlinx.coroutines.flow.internal.AbstractSharedFlow) sharedFlowImpl).slots) != null) {
                for (kotlinx.coroutines.flow.internal.AbstractSharedFlowSlot abstractSharedFlowSlot : abstractSharedFlowSlotArr) {
                    if (abstractSharedFlowSlot != null) {
                        kotlinx.coroutines.flow.SharedFlowSlot sharedFlowSlot = (kotlinx.coroutines.flow.SharedFlowSlot) abstractSharedFlowSlot;
                        if (sharedFlowSlot.index >= 0 && sharedFlowSlot.index < highSpeedVideoFpsRangesFor) {
                            sharedFlowSlot.index = highSpeedVideoFpsRangesFor;
                        }
                    }
                }
            }
            this.getOutputMinFrameDuration = highSpeedVideoFpsRangesFor;
        }
        if (kotlinx.coroutines.DebugKt.getASSERTIONS_ENABLED() && getHighSpeedVideoFpsRangesFor() != highSpeedVideoFpsRangesFor) {
            throw new java.lang.AssertionError();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void getHighSpeedVideoFpsRanges(java.lang.Object p0) {
        int outputMinFrameDuration = getOutputMinFrameDuration();
        java.lang.Object[] objArr = this.Camera2StreamConfigurationMap;
        if (objArr == null) {
            objArr = getHighSpeedVideoFpsRanges(null, 0, 2);
        } else if (outputMinFrameDuration >= objArr.length) {
            objArr = getHighSpeedVideoFpsRanges(objArr, outputMinFrameDuration, objArr.length * 2);
        }
        kotlinx.coroutines.flow.SharedFlowKt.getHighResolutionOutputSizeshNQ4ISI(objArr, getHighSpeedVideoFpsRangesFor() + outputMinFrameDuration, p0);
    }

    private final java.lang.Object[] getHighSpeedVideoFpsRanges(java.lang.Object[] p0, int p1, int p2) {
        java.lang.Object highSpeedVideoSizes;
        if (p2 <= 0) {
            throw new java.lang.IllegalStateException("Buffer size overflow".toString());
        }
        java.lang.Object[] objArr = new java.lang.Object[p2];
        this.Camera2StreamConfigurationMap = objArr;
        if (p0 != null) {
            long highSpeedVideoFpsRangesFor = getHighSpeedVideoFpsRangesFor();
            for (int i = 0; i < p1; i++) {
                long j = i + highSpeedVideoFpsRangesFor;
                highSpeedVideoSizes = kotlinx.coroutines.flow.SharedFlowKt.getHighSpeedVideoSizes(p0, j);
                kotlinx.coroutines.flow.SharedFlowKt.getHighResolutionOutputSizeshNQ4ISI(objArr, j, highSpeedVideoSizes);
            }
        }
        return objArr;
    }

    public final long updateNewCollectorIndexLocked$kotlinx_coroutines_core() {
        long j = this.getHighSpeedVideoFpsRanges;
        if (j < this.getOutputMinFrameDuration) {
            this.getOutputMinFrameDuration = j;
        }
        return j;
    }

    public final kotlin.coroutines.Continuation<kotlin.Unit>[] updateCollectorIndexLocked$kotlinx_coroutines_core(long oldIndex) {
        int i;
        long j;
        java.lang.Object highSpeedVideoSizes;
        java.lang.Object highSpeedVideoSizes2;
        long j2;
        kotlinx.coroutines.flow.internal.AbstractSharedFlowSlot[] abstractSharedFlowSlotArr;
        if (kotlinx.coroutines.DebugKt.getASSERTIONS_ENABLED() && oldIndex < this.getOutputMinFrameDuration) {
            throw new java.lang.AssertionError();
        }
        if (oldIndex > this.getOutputMinFrameDuration) {
            return kotlinx.coroutines.flow.internal.AbstractSharedFlowKt.EMPTY_RESUMES;
        }
        long highSpeedVideoFpsRangesFor = getHighSpeedVideoFpsRangesFor();
        long j3 = this.getOutputFormats + highSpeedVideoFpsRangesFor;
        if (this.getHighResolutionOutputSizeshNQ4ISI == 0 && this.getHighSpeedVideoSizesFor > 0) {
            j3++;
        }
        kotlinx.coroutines.flow.SharedFlowImpl<T> sharedFlowImpl = this;
        int i2 = 0;
        if (((kotlinx.coroutines.flow.internal.AbstractSharedFlow) sharedFlowImpl).nCollectors != 0 && (abstractSharedFlowSlotArr = ((kotlinx.coroutines.flow.internal.AbstractSharedFlow) sharedFlowImpl).slots) != null) {
            for (kotlinx.coroutines.flow.internal.AbstractSharedFlowSlot abstractSharedFlowSlot : abstractSharedFlowSlotArr) {
                if (abstractSharedFlowSlot != null) {
                    kotlinx.coroutines.flow.SharedFlowSlot sharedFlowSlot = (kotlinx.coroutines.flow.SharedFlowSlot) abstractSharedFlowSlot;
                    if (sharedFlowSlot.index >= 0 && sharedFlowSlot.index < j3) {
                        j3 = sharedFlowSlot.index;
                    }
                }
            }
        }
        if (kotlinx.coroutines.DebugKt.getASSERTIONS_ENABLED() && j3 < this.getOutputMinFrameDuration) {
            throw new java.lang.AssertionError();
        }
        if (j3 <= this.getOutputMinFrameDuration) {
            return kotlinx.coroutines.flow.internal.AbstractSharedFlowKt.EMPTY_RESUMES;
        }
        long Camera2StreamConfigurationMap = Camera2StreamConfigurationMap();
        if (getNCollectors() > 0) {
            i = java.lang.Math.min(this.getHighSpeedVideoSizesFor, this.getHighResolutionOutputSizeshNQ4ISI - ((int) (Camera2StreamConfigurationMap - j3)));
        } else {
            i = this.getHighSpeedVideoSizesFor;
        }
        kotlin.coroutines.Continuation<kotlin.Unit>[] continuationArr = kotlinx.coroutines.flow.internal.AbstractSharedFlowKt.EMPTY_RESUMES;
        long j4 = this.getHighSpeedVideoSizesFor + Camera2StreamConfigurationMap;
        if (i > 0) {
            continuationArr = new kotlin.coroutines.Continuation[i];
            java.lang.Object[] objArr = this.Camera2StreamConfigurationMap;
            kotlin.jvm.internal.Intrinsics.checkNotNull(objArr);
            long j5 = Camera2StreamConfigurationMap;
            while (true) {
                if (Camera2StreamConfigurationMap >= j4) {
                    j = j3;
                    break;
                }
                highSpeedVideoSizes2 = kotlinx.coroutines.flow.SharedFlowKt.getHighSpeedVideoSizes(objArr, Camera2StreamConfigurationMap);
                j = j3;
                if (highSpeedVideoSizes2 != kotlinx.coroutines.flow.SharedFlowKt.NO_VALUE) {
                    kotlin.jvm.internal.Intrinsics.checkNotNull(highSpeedVideoSizes2, "");
                    kotlinx.coroutines.flow.SharedFlowImpl.Emitter emitter = (kotlinx.coroutines.flow.SharedFlowImpl.Emitter) highSpeedVideoSizes2;
                    int i3 = i2 + 1;
                    continuationArr[i2] = emitter.getHighSpeedVideoFpsRangesFor;
                    kotlinx.coroutines.flow.SharedFlowKt.getHighResolutionOutputSizeshNQ4ISI(objArr, Camera2StreamConfigurationMap, kotlinx.coroutines.flow.SharedFlowKt.NO_VALUE);
                    kotlinx.coroutines.flow.SharedFlowKt.getHighResolutionOutputSizeshNQ4ISI(objArr, j5, emitter.getHighResolutionOutputSizeshNQ4ISI);
                    j2 = 1;
                    j5++;
                    if (i3 >= i) {
                        break;
                    }
                    i2 = i3;
                } else {
                    j2 = 1;
                }
                Camera2StreamConfigurationMap += j2;
                j3 = j;
            }
            Camera2StreamConfigurationMap = j5;
        } else {
            j = j3;
        }
        long j6 = Camera2StreamConfigurationMap;
        kotlin.coroutines.Continuation<kotlin.Unit>[] continuationArr2 = continuationArr;
        int i4 = (int) (j6 - highSpeedVideoFpsRangesFor);
        if (getNCollectors() == 0) {
            j = j6;
        }
        long max = java.lang.Math.max(this.getHighSpeedVideoFpsRanges, j6 - java.lang.Math.min(this.getHighSpeedVideoSizes, i4));
        if (this.getHighResolutionOutputSizeshNQ4ISI == 0 && max < j4) {
            java.lang.Object[] objArr2 = this.Camera2StreamConfigurationMap;
            kotlin.jvm.internal.Intrinsics.checkNotNull(objArr2);
            highSpeedVideoSizes = kotlinx.coroutines.flow.SharedFlowKt.getHighSpeedVideoSizes(objArr2, max);
            if (kotlin.jvm.internal.Intrinsics.areEqual(highSpeedVideoSizes, kotlinx.coroutines.flow.SharedFlowKt.NO_VALUE)) {
                j6++;
                max++;
            }
        }
        getHighSpeedVideoSizes(max, j, j6, j4);
        getHighSpeedVideoFpsRanges();
        return continuationArr2.length == 0 ? continuationArr2 : getHighSpeedVideoSizes(continuationArr2);
    }

    private final void getHighSpeedVideoSizes(long p0, long p1, long p2, long p3) {
        long min = java.lang.Math.min(p1, p0);
        if (kotlinx.coroutines.DebugKt.getASSERTIONS_ENABLED() && min < getHighSpeedVideoFpsRangesFor()) {
            throw new java.lang.AssertionError();
        }
        for (long highSpeedVideoFpsRangesFor = getHighSpeedVideoFpsRangesFor(); highSpeedVideoFpsRangesFor < min; highSpeedVideoFpsRangesFor++) {
            java.lang.Object[] objArr = this.Camera2StreamConfigurationMap;
            kotlin.jvm.internal.Intrinsics.checkNotNull(objArr);
            kotlinx.coroutines.flow.SharedFlowKt.getHighResolutionOutputSizeshNQ4ISI(objArr, highSpeedVideoFpsRangesFor, null);
        }
        this.getHighSpeedVideoFpsRanges = p0;
        this.getOutputMinFrameDuration = p1;
        this.getOutputFormats = (int) (p2 - min);
        this.getHighSpeedVideoSizesFor = (int) (p3 - p2);
        if (kotlinx.coroutines.DebugKt.getASSERTIONS_ENABLED() && this.getOutputFormats < 0) {
            throw new java.lang.AssertionError();
        }
        if (kotlinx.coroutines.DebugKt.getASSERTIONS_ENABLED() && this.getHighSpeedVideoSizesFor < 0) {
            throw new java.lang.AssertionError();
        }
        if (kotlinx.coroutines.DebugKt.getASSERTIONS_ENABLED() && this.getHighSpeedVideoFpsRanges > getHighSpeedVideoFpsRangesFor() + this.getOutputFormats) {
            throw new java.lang.AssertionError();
        }
    }

    private final void getHighSpeedVideoFpsRanges() {
        java.lang.Object highSpeedVideoSizes;
        if (this.getHighResolutionOutputSizeshNQ4ISI != 0 || this.getHighSpeedVideoSizesFor > 1) {
            java.lang.Object[] objArr = this.Camera2StreamConfigurationMap;
            kotlin.jvm.internal.Intrinsics.checkNotNull(objArr);
            while (this.getHighSpeedVideoSizesFor > 0) {
                highSpeedVideoSizes = kotlinx.coroutines.flow.SharedFlowKt.getHighSpeedVideoSizes(objArr, (getHighSpeedVideoFpsRangesFor() + getOutputMinFrameDuration()) - 1);
                if (highSpeedVideoSizes != kotlinx.coroutines.flow.SharedFlowKt.NO_VALUE) {
                    return;
                }
                this.getHighSpeedVideoSizesFor--;
                kotlinx.coroutines.flow.SharedFlowKt.getHighResolutionOutputSizeshNQ4ISI(objArr, getHighSpeedVideoFpsRangesFor() + getOutputMinFrameDuration(), null);
            }
        }
    }

    private final java.lang.Object getHighSpeedVideoSizes(kotlinx.coroutines.flow.SharedFlowSlot p0) {
        java.lang.Object obj;
        kotlin.coroutines.Continuation<kotlin.Unit>[] continuationArr = kotlinx.coroutines.flow.internal.AbstractSharedFlowKt.EMPTY_RESUMES;
        synchronized (this) {
            long highSpeedVideoFpsRanges = getHighSpeedVideoFpsRanges(p0);
            if (highSpeedVideoFpsRanges < 0) {
                obj = kotlinx.coroutines.flow.SharedFlowKt.NO_VALUE;
            } else {
                long j = p0.index;
                java.lang.Object highSpeedVideoSizes = getHighSpeedVideoSizes(highSpeedVideoFpsRanges);
                p0.index = highSpeedVideoFpsRanges + 1;
                continuationArr = updateCollectorIndexLocked$kotlinx_coroutines_core(j);
                obj = highSpeedVideoSizes;
            }
        }
        for (kotlin.coroutines.Continuation<kotlin.Unit> continuation : continuationArr) {
            if (continuation != null) {
                kotlin.Result.Companion companion = kotlin.Result.INSTANCE;
                continuation.resumeWith(kotlin.Result.m23436constructorimpl(kotlin.Unit.INSTANCE));
            }
        }
        return obj;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final long getHighSpeedVideoFpsRanges(kotlinx.coroutines.flow.SharedFlowSlot p0) {
        long j = p0.index;
        if (j < Camera2StreamConfigurationMap() || (this.getHighResolutionOutputSizeshNQ4ISI <= 0 && j <= getHighSpeedVideoFpsRangesFor() && this.getHighSpeedVideoSizesFor != 0)) {
            return j;
        }
        return -1L;
    }

    private final java.lang.Object getHighSpeedVideoSizes(long p0) {
        java.lang.Object highSpeedVideoSizes;
        java.lang.Object[] objArr = this.Camera2StreamConfigurationMap;
        kotlin.jvm.internal.Intrinsics.checkNotNull(objArr);
        highSpeedVideoSizes = kotlinx.coroutines.flow.SharedFlowKt.getHighSpeedVideoSizes(objArr, p0);
        return highSpeedVideoSizes instanceof kotlinx.coroutines.flow.SharedFlowImpl.Emitter ? ((kotlinx.coroutines.flow.SharedFlowImpl.Emitter) highSpeedVideoSizes).getHighResolutionOutputSizeshNQ4ISI : highSpeedVideoSizes;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r11v6, types: [java.lang.Object, java.lang.Object[]] */
    public final kotlin.coroutines.Continuation<kotlin.Unit>[] getHighSpeedVideoSizes(kotlin.coroutines.Continuation<kotlin.Unit>[] p0) {
        kotlinx.coroutines.flow.internal.AbstractSharedFlowSlot[] abstractSharedFlowSlotArr;
        kotlinx.coroutines.flow.SharedFlowSlot sharedFlowSlot;
        kotlin.coroutines.Continuation<? super kotlin.Unit> continuation;
        int length = p0.length;
        kotlinx.coroutines.flow.SharedFlowImpl<T> sharedFlowImpl = this;
        if (((kotlinx.coroutines.flow.internal.AbstractSharedFlow) sharedFlowImpl).nCollectors != 0 && (abstractSharedFlowSlotArr = ((kotlinx.coroutines.flow.internal.AbstractSharedFlow) sharedFlowImpl).slots) != null) {
            int length2 = abstractSharedFlowSlotArr.length;
            int i = 0;
            p0 = p0;
            while (i < length2) {
                kotlinx.coroutines.flow.internal.AbstractSharedFlowSlot abstractSharedFlowSlot = abstractSharedFlowSlotArr[i];
                if (abstractSharedFlowSlot != null && (continuation = (sharedFlowSlot = (kotlinx.coroutines.flow.SharedFlowSlot) abstractSharedFlowSlot).cont) != null && getHighSpeedVideoFpsRanges(sharedFlowSlot) >= 0) {
                    int length3 = p0.length;
                    p0 = p0;
                    if (length >= length3) {
                        ?? copyOf = java.util.Arrays.copyOf(p0, java.lang.Math.max(2, p0.length * 2));
                        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(copyOf, "");
                        p0 = copyOf;
                    }
                    p0[length] = continuation;
                    sharedFlowSlot.cont = null;
                    length++;
                }
                i++;
                p0 = p0;
            }
        }
        return p0;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* JADX WARN: Can't rename method to resolve collision */
    @Override // kotlinx.coroutines.flow.internal.AbstractSharedFlow
    public kotlinx.coroutines.flow.SharedFlowSlot createSlot() {
        return new kotlinx.coroutines.flow.SharedFlowSlot();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* JADX WARN: Can't rename method to resolve collision */
    @Override // kotlinx.coroutines.flow.internal.AbstractSharedFlow
    public kotlinx.coroutines.flow.SharedFlowSlot[] createSlotArray(int size) {
        return new kotlinx.coroutines.flow.SharedFlowSlot[size];
    }

    @Override // kotlinx.coroutines.flow.internal.FusibleFlow
    public kotlinx.coroutines.flow.Flow<T> fuse(kotlin.coroutines.CoroutineContext context, int capacity, kotlinx.coroutines.channels.BufferOverflow onBufferOverflow) {
        return kotlinx.coroutines.flow.SharedFlowKt.fuseSharedFlow(this, context, capacity, onBufferOverflow);
    }

    @kotlin.Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u000e\b\u0002\u0018\u00002\u00020\u0001B3\u0012\n\u0010\u0003\u001a\u0006\u0012\u0002\b\u00030\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\b¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\r\u001a\u00020\tH\u0016¢\u0006\u0004\b\r\u0010\u000eR\u0015\u0010\u0011\u001a\u0006\u0012\u0002\b\u00030\u00028\u0006¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010R\u0016\u0010\u0014\u001a\u00020\u00048\u0006@\u0006X\u0086\u000e¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013R\u0013\u0010\u0012\u001a\u0004\u0018\u00010\u00068\u0006¢\u0006\u0006\n\u0004\b\u0011\u0010\u0015R\u0017\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\t0\b8\u0006¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017"}, d2 = {"Lkotlinx/coroutines/flow/SharedFlowImpl$Emitter;", "Lkotlinx/coroutines/DisposableHandle;", "Lkotlinx/coroutines/flow/SharedFlowImpl;", "p0", "", "p1", "", "p2", "Lkotlin/coroutines/Continuation;", "", "p3", "<init>", "(Lkotlinx/coroutines/flow/SharedFlowImpl;JLjava/lang/Object;Lkotlin/coroutines/Continuation;)V", "dispose", "()V", "getHighSpeedVideoFpsRangesFor", "Lkotlinx/coroutines/flow/SharedFlowImpl;", "Camera2StreamConfigurationMap", "getHighResolutionOutputSizeshNQ4ISI", "J", "getHighSpeedVideoFpsRanges", "Ljava/lang/Object;", "getHighSpeedVideoSizes", "Lkotlin/coroutines/Continuation;"}, k = 1, mv = {2, 1, 0}, xi = 48)
    static final class Emitter implements kotlinx.coroutines.DisposableHandle {

        /* renamed from: Camera2StreamConfigurationMap, reason: from kotlin metadata */
        public final java.lang.Object getHighResolutionOutputSizeshNQ4ISI;

        /* renamed from: getHighResolutionOutputSizeshNQ4ISI, reason: from kotlin metadata */
        public long getHighSpeedVideoFpsRanges;

        /* renamed from: getHighSpeedVideoFpsRangesFor, reason: from kotlin metadata */
        public final kotlinx.coroutines.flow.SharedFlowImpl<?> Camera2StreamConfigurationMap;

        /* renamed from: getHighSpeedVideoSizes, reason: from kotlin metadata */
        public final kotlin.coroutines.Continuation<kotlin.Unit> getHighSpeedVideoFpsRangesFor;

        /* JADX WARN: Multi-variable type inference failed */
        public Emitter(kotlinx.coroutines.flow.SharedFlowImpl<?> sharedFlowImpl, long j, java.lang.Object obj, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
            this.Camera2StreamConfigurationMap = sharedFlowImpl;
            this.getHighSpeedVideoFpsRanges = j;
            this.getHighResolutionOutputSizeshNQ4ISI = obj;
            this.getHighSpeedVideoFpsRangesFor = continuation;
        }

        @Override // kotlinx.coroutines.DisposableHandle
        public final void dispose() {
            kotlinx.coroutines.flow.SharedFlowImpl.access$cancelEmitter(this.Camera2StreamConfigurationMap, this);
        }
    }

    @Override // kotlinx.coroutines.flow.SharedFlow
    public java.util.List<T> getReplayCache() {
        java.lang.Object highSpeedVideoSizes;
        synchronized (this) {
            int inputFormats = getInputFormats();
            if (inputFormats == 0) {
                return kotlin.collections.CollectionsKt.emptyList();
            }
            java.util.ArrayList arrayList = new java.util.ArrayList(inputFormats);
            java.lang.Object[] objArr = this.Camera2StreamConfigurationMap;
            kotlin.jvm.internal.Intrinsics.checkNotNull(objArr);
            for (int i = 0; i < inputFormats; i++) {
                highSpeedVideoSizes = kotlinx.coroutines.flow.SharedFlowKt.getHighSpeedVideoSizes(objArr, this.getHighSpeedVideoFpsRanges + i);
                arrayList.add(highSpeedVideoSizes);
            }
            return arrayList;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final java.lang.Object Camera2StreamConfigurationMap(T t, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        kotlin.coroutines.Continuation<kotlin.Unit>[] continuationArr;
        kotlinx.coroutines.flow.SharedFlowImpl.Emitter emitter;
        kotlinx.coroutines.CancellableContinuationImpl cancellableContinuationImpl = new kotlinx.coroutines.CancellableContinuationImpl(kotlin.coroutines.intrinsics.IntrinsicsKt.intercepted(continuation), 1);
        cancellableContinuationImpl.initCancellability();
        kotlinx.coroutines.CancellableContinuationImpl cancellableContinuationImpl2 = cancellableContinuationImpl;
        kotlin.coroutines.Continuation<kotlin.Unit>[] continuationArr2 = kotlinx.coroutines.flow.internal.AbstractSharedFlowKt.EMPTY_RESUMES;
        synchronized (this) {
            try {
                if (getHighSpeedVideoFpsRangesFor(t)) {
                    kotlin.Result.Companion companion = kotlin.Result.INSTANCE;
                    cancellableContinuationImpl2.resumeWith(kotlin.Result.m23436constructorimpl(kotlin.Unit.INSTANCE));
                    continuationArr = getHighSpeedVideoSizes(continuationArr2);
                    emitter = null;
                } else {
                    kotlinx.coroutines.flow.SharedFlowImpl.Emitter emitter2 = new kotlinx.coroutines.flow.SharedFlowImpl.Emitter(this, getOutputMinFrameDuration() + getHighSpeedVideoFpsRangesFor(), t, cancellableContinuationImpl2);
                    getHighSpeedVideoFpsRanges(emitter2);
                    this.getHighSpeedVideoSizesFor++;
                    if (this.getHighResolutionOutputSizeshNQ4ISI == 0) {
                        continuationArr2 = getHighSpeedVideoSizes(continuationArr2);
                    }
                    continuationArr = continuationArr2;
                    emitter = emitter2;
                }
            } catch (java.lang.Throwable th) {
                throw th;
            }
        }
        if (emitter != null) {
            kotlinx.coroutines.CancellableContinuationKt.disposeOnCancellation(cancellableContinuationImpl2, emitter);
        }
        for (kotlin.coroutines.Continuation<kotlin.Unit> continuation2 : continuationArr) {
            if (continuation2 != null) {
                kotlin.Result.Companion companion2 = kotlin.Result.INSTANCE;
                continuation2.resumeWith(kotlin.Result.m23436constructorimpl(kotlin.Unit.INSTANCE));
            }
        }
        java.lang.Object result = cancellableContinuationImpl.getResult();
        if (result == kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
            kotlin.coroutines.jvm.internal.DebugProbesKt.probeCoroutineSuspended(continuation);
        }
        return result == kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED() ? result : kotlin.Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final java.lang.Object getHighResolutionOutputSizeshNQ4ISI(kotlinx.coroutines.flow.SharedFlowSlot sharedFlowSlot, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        kotlinx.coroutines.CancellableContinuationImpl cancellableContinuationImpl = new kotlinx.coroutines.CancellableContinuationImpl(kotlin.coroutines.intrinsics.IntrinsicsKt.intercepted(continuation), 1);
        cancellableContinuationImpl.initCancellability();
        kotlinx.coroutines.CancellableContinuationImpl cancellableContinuationImpl2 = cancellableContinuationImpl;
        synchronized (this) {
            if (getHighSpeedVideoFpsRanges(sharedFlowSlot) < 0) {
                sharedFlowSlot.cont = cancellableContinuationImpl2;
                sharedFlowSlot.cont = cancellableContinuationImpl2;
            } else {
                kotlin.Result.Companion companion = kotlin.Result.INSTANCE;
                cancellableContinuationImpl2.resumeWith(kotlin.Result.m23436constructorimpl(kotlin.Unit.INSTANCE));
            }
            kotlin.Unit unit = kotlin.Unit.INSTANCE;
        }
        java.lang.Object result = cancellableContinuationImpl.getResult();
        if (result == kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
            kotlin.coroutines.jvm.internal.DebugProbesKt.probeCoroutineSuspended(continuation);
        }
        return result == kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED() ? result : kotlin.Unit.INSTANCE;
    }

    @Override // kotlinx.coroutines.flow.MutableSharedFlow
    public void resetReplayCache() {
        synchronized (this) {
            getHighSpeedVideoSizes(Camera2StreamConfigurationMap(), this.getOutputMinFrameDuration, Camera2StreamConfigurationMap(), getHighResolutionOutputSizeshNQ4ISI());
            kotlin.Unit unit = kotlin.Unit.INSTANCE;
        }
    }

    public static final /* synthetic */ void access$cancelEmitter(kotlinx.coroutines.flow.SharedFlowImpl sharedFlowImpl, kotlinx.coroutines.flow.SharedFlowImpl.Emitter emitter) {
        java.lang.Object highSpeedVideoSizes;
        synchronized (sharedFlowImpl) {
            if (emitter.getHighSpeedVideoFpsRanges < sharedFlowImpl.getHighSpeedVideoFpsRangesFor()) {
                return;
            }
            java.lang.Object[] objArr = sharedFlowImpl.Camera2StreamConfigurationMap;
            kotlin.jvm.internal.Intrinsics.checkNotNull(objArr);
            highSpeedVideoSizes = kotlinx.coroutines.flow.SharedFlowKt.getHighSpeedVideoSizes(objArr, emitter.getHighSpeedVideoFpsRanges);
            if (highSpeedVideoSizes != emitter) {
                return;
            }
            kotlinx.coroutines.flow.SharedFlowKt.getHighResolutionOutputSizeshNQ4ISI(objArr, emitter.getHighSpeedVideoFpsRanges, kotlinx.coroutines.flow.SharedFlowKt.NO_VALUE);
            sharedFlowImpl.getHighSpeedVideoFpsRanges();
            kotlin.Unit unit = kotlin.Unit.INSTANCE;
        }
    }

    @Override // kotlinx.coroutines.flow.MutableSharedFlow, kotlinx.coroutines.flow.FlowCollector
    public java.lang.Object emit(T t, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        java.lang.Object Camera2StreamConfigurationMap;
        return (tryEmit(t) || (Camera2StreamConfigurationMap = Camera2StreamConfigurationMap(t, continuation)) != kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()) ? kotlin.Unit.INSTANCE : Camera2StreamConfigurationMap;
    }

    @kotlin.Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public final /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[kotlinx.coroutines.channels.BufferOverflow.values().length];
            try {
                iArr[kotlinx.coroutines.channels.BufferOverflow.SUSPEND.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused) {
            }
            try {
                iArr[kotlinx.coroutines.channels.BufferOverflow.DROP_LATEST.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused2) {
            }
            try {
                iArr[kotlinx.coroutines.channels.BufferOverflow.DROP_OLDEST.ordinal()] = 3;
            } catch (java.lang.NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    @Override // kotlinx.coroutines.flow.SharedFlow, kotlinx.coroutines.flow.Flow
    public java.lang.Object collect(kotlinx.coroutines.flow.FlowCollector<? super T> flowCollector, kotlin.coroutines.Continuation<?> continuation) {
        return getHighSpeedVideoSizes(this, flowCollector, continuation);
    }
}
