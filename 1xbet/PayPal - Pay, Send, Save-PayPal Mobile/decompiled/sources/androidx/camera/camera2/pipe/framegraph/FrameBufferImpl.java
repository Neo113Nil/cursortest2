package androidx.camera.camera2.pipe.framegraph;

@kotlin.Metadata(d1 = {"\u0000\u0088\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010)\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\f\b\u0000\u0018\u0000 R2\u00020\u00012\u00020\u0002:\u0002SRB;\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005\u0012\u0014\u0010\n\u001a\u0010\u0012\u0004\u0012\u00020\t\u0012\u0006\u0012\u0004\u0018\u00010\t0\b\u0012\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0010\u001a\u00020\u000fH\u0016¢\u0006\u0004\b\u0012\u0010\u0013J\u0011\u0010\u0014\u001a\u0004\u0018\u00010\u000fH\u0016¢\u0006\u0004\b\u0014\u0010\u0015J\u0011\u0010\u0016\u001a\u0004\u0018\u00010\u000fH\u0016¢\u0006\u0004\b\u0016\u0010\u0015J\u0015\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u000f0\u0017H\u0016¢\u0006\u0004\b\u0018\u0010\u0019J%\u0010\u001e\u001a\u0004\u0018\u00010\u001d2\u0012\u0010\u001c\u001a\u000e\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\u001b0\u001aH\u0016¢\u0006\u0004\b\u001e\u0010\u001fJ%\u0010 \u001a\u0004\u0018\u00010\u001d2\u0012\u0010\u001c\u001a\u000e\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\u001b0\u001aH\u0016¢\u0006\u0004\b \u0010\u001fJ)\u0010!\u001a\b\u0012\u0004\u0012\u00020\u001d0\u00172\u0012\u0010\u001c\u001a\u000e\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\u001b0\u001aH\u0016¢\u0006\u0004\b!\u0010\"J\u0011\u0010#\u001a\u0004\u0018\u00010\u000fH\u0016¢\u0006\u0004\b#\u0010\u0015J\u0011\u0010$\u001a\u0004\u0018\u00010\u000fH\u0016¢\u0006\u0004\b$\u0010\u0015J\u0015\u0010%\u001a\b\u0012\u0004\u0012\u00020\u000f0\u0017H\u0016¢\u0006\u0004\b%\u0010\u0019J\u000f\u0010&\u001a\u00020\u0011H\u0016¢\u0006\u0004\b&\u0010'J3\u0010,\u001a\u0004\u0018\u00010\u001d2\f\u0010*\u001a\b\u0012\u0004\u0012\u00020)0(2\u0012\u0010+\u001a\u000e\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\u001b0\u001aH\u0002¢\u0006\u0004\b,\u0010-R\u0014\u0010.\u001a\u00020\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b.\u0010/R \u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00058\u0017X\u0096\u0004¢\u0006\f\n\u0004\b\u0007\u00100\u001a\u0004\b1\u00102R(\u0010\n\u001a\u0010\u0012\u0004\u0012\u00020\t\u0012\u0006\u0012\u0004\u0018\u00010\t0\b8\u0017X\u0097\u0004¢\u0006\f\n\u0004\b\n\u00103\u001a\u0004\b4\u00105R\u0014\u00108\u001a\u00020\t8\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b6\u00107R\u001c\u0010,\u001a\b\u0012\u0004\u0012\u00020)098\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b:\u0010;R\u0016\u0010:\u001a\u00020\u001b8\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b,\u0010<R\u001a\u0010?\u001a\b\u0012\u0004\u0012\u00020\u000f0=8\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b8\u0010>R \u0010A\u001a\b\u0012\u0004\u0012\u00020\u000f0@8\u0017X\u0097\u0004¢\u0006\f\n\u0004\bA\u0010B\u001a\u0004\bC\u0010DR\u001a\u00106\u001a\b\u0012\u0004\u0012\u00020\u000b0E8\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b?\u0010FR \u0010H\u001a\b\u0012\u0004\u0012\u00020\u000b0G8\u0017X\u0097\u0004¢\u0006\f\n\u0004\bH\u0010I\u001a\u0004\bJ\u0010KR*\u0010\f\u001a\u00020\u000b2\u0006\u0010L\u001a\u00020\u000b8\u0017@WX\u0097\u000e¢\u0006\u0012\n\u0004\b\f\u0010M\u001a\u0004\bN\u0010O\"\u0004\bP\u0010Q"}, d2 = {"Landroidx/camera/camera2/pipe/framegraph/FrameBufferImpl;", "Landroidx/camera/camera2/pipe/FrameBuffer;", "Landroidx/camera/camera2/pipe/internal/FrameDistributor$FrameStartedListener;", "Landroidx/camera/camera2/pipe/framegraph/FrameGraphBuffers;", "frameGraphBuffers", "", "Landroidx/camera/camera2/pipe/StreamId;", "streams", "", "", "parameters", "", "capacity", "<init>", "(Landroidx/camera/camera2/pipe/framegraph/FrameGraphBuffers;Ljava/util/Set;Ljava/util/Map;I)V", "Landroidx/camera/camera2/pipe/FrameReference;", "frameReference", "", "onFrameStarted", "(Landroidx/camera/camera2/pipe/FrameReference;)V", "removeFirstReference", "()Landroidx/camera/camera2/pipe/FrameReference;", "removeLastReference", "", "removeAllReferences", "()Ljava/util/List;", "Lkotlin/Function1;", "", "predicate", "Landroidx/camera/camera2/pipe/Frame;", "removeFirstFrameReferenceAndAcquire", "(Lkotlin/jvm/functions/Function1;)Landroidx/camera/camera2/pipe/Frame;", "removeLastFrameReferenceAndAcquire", "removeAllFrameReferencesAndAcquire", "(Lkotlin/jvm/functions/Function1;)Ljava/util/List;", "peekFirstReference", "peekLastReference", "peekAllReferences", "close", "()V", "", "Landroidx/camera/camera2/pipe/framegraph/FrameBufferImpl$BufferEntry;", "p0", "p1", "getHighSpeedVideoFpsRanges", "(Ljava/util/Iterator;Lkotlin/jvm/functions/Function1;)Landroidx/camera/camera2/pipe/Frame;", "getHighResolutionOutputSizeshNQ4ISI", "Landroidx/camera/camera2/pipe/framegraph/FrameGraphBuffers;", "Ljava/util/Set;", "getStreams", "()Ljava/util/Set;", "Ljava/util/Map;", "getParameters", "()Ljava/util/Map;", "getOutputMinFrameDuration", "Ljava/lang/Object;", "Camera2StreamConfigurationMap", "Lkotlin/collections/ArrayDeque;", "getHighSpeedVideoSizes", "Lkotlin/collections/ArrayDeque;", "Z", "Lkotlinx/coroutines/flow/MutableSharedFlow;", "Lkotlinx/coroutines/flow/MutableSharedFlow;", "getHighSpeedVideoFpsRangesFor", "Lkotlinx/coroutines/flow/SharedFlow;", "frameFlow", "Lkotlinx/coroutines/flow/SharedFlow;", "getFrameFlow", "()Lkotlinx/coroutines/flow/SharedFlow;", "Lkotlinx/coroutines/flow/MutableStateFlow;", "Lkotlinx/coroutines/flow/MutableStateFlow;", "Lkotlinx/coroutines/flow/StateFlow;", io.ktor.http.ContentDisposition.Parameters.Size, "Lkotlinx/coroutines/flow/StateFlow;", "getSize", "()Lkotlinx/coroutines/flow/StateFlow;", "newCapacity", com.visa.cbp.getEncExpo.warmup, "getCapacity", "()I", "setCapacity", "(I)V", "Companion", "BufferEntry"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class FrameBufferImpl implements androidx.camera.camera2.pipe.FrameBuffer, androidx.camera.camera2.pipe.internal.FrameDistributor.FrameStartedListener {
    private static final androidx.camera.camera2.pipe.framegraph.FrameBufferImpl.Companion Companion = new androidx.camera.camera2.pipe.framegraph.FrameBufferImpl.Companion(null);

    @java.lang.Deprecated
    public static final int FRAME_FLOW_EXTRA_BUFFER_CAPACITY = 4;

    /* renamed from: Camera2StreamConfigurationMap, reason: from kotlin metadata */
    private final kotlinx.coroutines.flow.MutableSharedFlow<androidx.camera.camera2.pipe.FrameReference> getHighSpeedVideoFpsRangesFor;
    private int capacity;
    private final kotlinx.coroutines.flow.SharedFlow<androidx.camera.camera2.pipe.FrameReference> frameFlow;
    private final androidx.camera.camera2.pipe.framegraph.FrameGraphBuffers getHighResolutionOutputSizeshNQ4ISI;

    /* renamed from: getHighSpeedVideoFpsRanges, reason: from kotlin metadata */
    private boolean getHighSpeedVideoSizes;

    /* renamed from: getHighSpeedVideoFpsRangesFor, reason: from kotlin metadata */
    private final kotlinx.coroutines.flow.MutableStateFlow<java.lang.Integer> getOutputMinFrameDuration;

    /* renamed from: getHighSpeedVideoSizes, reason: from kotlin metadata */
    private kotlin.collections.ArrayDeque<androidx.camera.camera2.pipe.framegraph.FrameBufferImpl.BufferEntry> getHighSpeedVideoFpsRanges;

    /* renamed from: getOutputMinFrameDuration, reason: from kotlin metadata */
    private final java.lang.Object Camera2StreamConfigurationMap;
    private final java.util.Map<java.lang.Object, java.lang.Object> parameters;
    private final kotlinx.coroutines.flow.StateFlow<java.lang.Integer> size;
    private final java.util.Set<androidx.camera.camera2.pipe.StreamId> streams;

    public FrameBufferImpl(androidx.camera.camera2.pipe.framegraph.FrameGraphBuffers frameGraphBuffers, java.util.Set<androidx.camera.camera2.pipe.StreamId> set, java.util.Map<java.lang.Object, ? extends java.lang.Object> map, int i) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(frameGraphBuffers, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(set, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(map, "");
        this.getHighResolutionOutputSizeshNQ4ISI = frameGraphBuffers;
        this.streams = set;
        this.parameters = map;
        this.Camera2StreamConfigurationMap = new java.lang.Object();
        this.getHighSpeedVideoFpsRanges = new kotlin.collections.ArrayDeque<>(i);
        kotlinx.coroutines.flow.MutableSharedFlow<androidx.camera.camera2.pipe.FrameReference> MutableSharedFlow = kotlinx.coroutines.flow.SharedFlowKt.MutableSharedFlow(0, 4, kotlinx.coroutines.channels.BufferOverflow.DROP_OLDEST);
        this.getHighSpeedVideoFpsRangesFor = MutableSharedFlow;
        this.frameFlow = kotlinx.coroutines.flow.FlowKt.asSharedFlow(MutableSharedFlow);
        if (i < 0) {
            throw new java.lang.IllegalArgumentException("FrameBuffer capacity must be greater than or equal to 0".toString());
        }
        kotlinx.coroutines.flow.MutableStateFlow<java.lang.Integer> MutableStateFlow = kotlinx.coroutines.flow.StateFlowKt.MutableStateFlow(0);
        this.getOutputMinFrameDuration = MutableStateFlow;
        this.size = kotlinx.coroutines.flow.FlowKt.asStateFlow(MutableStateFlow);
        this.capacity = i;
    }

    @Override // androidx.camera.camera2.pipe.FrameBuffer
    public final java.util.Set<androidx.camera.camera2.pipe.StreamId> getStreams() {
        return this.streams;
    }

    @Override // androidx.camera.camera2.pipe.FrameBuffer
    public final java.util.Map<java.lang.Object, java.lang.Object> getParameters() {
        return this.parameters;
    }

    @kotlin.Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\u0018\u0002\b2\u0018\u00002\u00020\u0001:\u0002\n\u000bB\u0011\b\u0004\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u0017\u0010\u0006\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\t\u0082\u0001\u0002\f\r"}, d2 = {"Landroidx/camera/camera2/pipe/framegraph/FrameBufferImpl$BufferEntry;", "", "Landroidx/camera/camera2/pipe/FrameReference;", "p0", "<init>", "(Landroidx/camera/camera2/pipe/FrameReference;)V", "frameReference", "Landroidx/camera/camera2/pipe/FrameReference;", "getFrameReference", "()Landroidx/camera/camera2/pipe/FrameReference;", "WithFrame", "WithoutFrame", "Landroidx/camera/camera2/pipe/framegraph/FrameBufferImpl$BufferEntry$WithFrame;", "Landroidx/camera/camera2/pipe/framegraph/FrameBufferImpl$BufferEntry$WithoutFrame;"}, k = 1, mv = {2, 1, 0}, xi = 48)
    static abstract class BufferEntry {
        private final androidx.camera.camera2.pipe.FrameReference frameReference;

        private BufferEntry(androidx.camera.camera2.pipe.FrameReference frameReference) {
            this.frameReference = frameReference;
        }

        public final androidx.camera.camera2.pipe.FrameReference getFrameReference() {
            return this.frameReference;
        }

        @kotlin.Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0006\u001a\u0004\b\u0007\u0010\b"}, d2 = {"Landroidx/camera/camera2/pipe/framegraph/FrameBufferImpl$BufferEntry$WithFrame;", "Landroidx/camera/camera2/pipe/framegraph/FrameBufferImpl$BufferEntry;", "Landroidx/camera/camera2/pipe/Frame;", androidx.constraintlayout.core.motion.utils.TypedValues.AttributesType.S_FRAME, "<init>", "(Landroidx/camera/camera2/pipe/Frame;)V", "Landroidx/camera/camera2/pipe/Frame;", "getFrame", "()Landroidx/camera/camera2/pipe/Frame;"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final class WithFrame extends androidx.camera.camera2.pipe.framegraph.FrameBufferImpl.BufferEntry {
            private final androidx.camera.camera2.pipe.Frame frame;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public WithFrame(androidx.camera.camera2.pipe.Frame frame) {
                super(frame, null);
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(frame, "");
                this.frame = frame;
            }

            public final androidx.camera.camera2.pipe.Frame getFrame() {
                return this.frame;
            }
        }

        @kotlin.Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Landroidx/camera/camera2/pipe/framegraph/FrameBufferImpl$BufferEntry$WithoutFrame;", "Landroidx/camera/camera2/pipe/framegraph/FrameBufferImpl$BufferEntry;", "Landroidx/camera/camera2/pipe/FrameReference;", androidx.constraintlayout.core.motion.utils.TypedValues.Custom.S_REFERENCE, "<init>", "(Landroidx/camera/camera2/pipe/FrameReference;)V"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final class WithoutFrame extends androidx.camera.camera2.pipe.framegraph.FrameBufferImpl.BufferEntry {
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public WithoutFrame(androidx.camera.camera2.pipe.FrameReference frameReference) {
                super(frameReference, null);
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(frameReference, "");
            }
        }

        public /* synthetic */ BufferEntry(androidx.camera.camera2.pipe.FrameReference frameReference, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this(frameReference);
        }
    }

    @Override // androidx.camera.camera2.pipe.FrameBuffer
    public final kotlinx.coroutines.flow.SharedFlow<androidx.camera.camera2.pipe.FrameReference> getFrameFlow() {
        return this.frameFlow;
    }

    @Override // androidx.camera.camera2.pipe.FrameBuffer
    public final kotlinx.coroutines.flow.StateFlow<java.lang.Integer> getSize() {
        return this.size;
    }

    @Override // androidx.camera.camera2.pipe.FrameBuffer
    public final int getCapacity() {
        return this.capacity;
    }

    @Override // androidx.camera.camera2.pipe.FrameBuffer
    public final void setCapacity(int i) {
        if (i < 0) {
            throw new java.lang.IllegalArgumentException("Capacity cannot be negative".toString());
        }
        java.util.ArrayList arrayList = new java.util.ArrayList();
        synchronized (this.Camera2StreamConfigurationMap) {
            if (this.getHighSpeedVideoSizes) {
                return;
            }
            if (i == this.capacity) {
                return;
            }
            this.capacity = i;
            int size = this.getHighSpeedVideoFpsRanges.size();
            if (i < size) {
                for (int i2 = 0; i2 < size - i; i2++) {
                    androidx.camera.camera2.pipe.framegraph.FrameBufferImpl.BufferEntry removeFirst = this.getHighSpeedVideoFpsRanges.removeFirst();
                    androidx.camera.camera2.pipe.framegraph.FrameBufferImpl.BufferEntry.WithFrame withFrame = removeFirst instanceof androidx.camera.camera2.pipe.framegraph.FrameBufferImpl.BufferEntry.WithFrame ? (androidx.camera.camera2.pipe.framegraph.FrameBufferImpl.BufferEntry.WithFrame) removeFirst : null;
                    if (withFrame != null) {
                        arrayList.add(withFrame.getFrame());
                    }
                }
                this.getHighSpeedVideoFpsRanges = new kotlin.collections.ArrayDeque<>(this.getHighSpeedVideoFpsRanges);
            }
            this.getOutputMinFrameDuration.setValue(java.lang.Integer.valueOf(this.getHighSpeedVideoFpsRanges.size()));
            kotlin.Unit unit = kotlin.Unit.INSTANCE;
            java.util.Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                ((androidx.camera.camera2.pipe.Frame) it.next()).close();
            }
        }
    }

    @Override // androidx.camera.camera2.pipe.internal.FrameDistributor.FrameStartedListener
    public final void onFrameStarted(androidx.camera.camera2.pipe.FrameReference frameReference) {
        androidx.camera.camera2.pipe.framegraph.FrameBufferImpl.BufferEntry.WithoutFrame withoutFrame;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(frameReference, "");
        if (getCapacity() == 0) {
            synchronized (this.Camera2StreamConfigurationMap) {
                if (!this.getHighSpeedVideoSizes) {
                    this.getHighSpeedVideoFpsRangesFor.tryEmit(frameReference);
                }
                kotlin.Unit unit = kotlin.Unit.INSTANCE;
            }
            return;
        }
        androidx.camera.camera2.pipe.Frame tryAcquire$default = androidx.camera.camera2.pipe.FrameReference.tryAcquire$default(frameReference, null, 1, null);
        if (tryAcquire$default != null) {
            withoutFrame = new androidx.camera.camera2.pipe.framegraph.FrameBufferImpl.BufferEntry.WithFrame(tryAcquire$default);
        } else {
            withoutFrame = new androidx.camera.camera2.pipe.framegraph.FrameBufferImpl.BufferEntry.WithoutFrame(frameReference);
        }
        synchronized (this.Camera2StreamConfigurationMap) {
            if (this.getHighSpeedVideoSizes) {
                r1 = withoutFrame instanceof androidx.camera.camera2.pipe.framegraph.FrameBufferImpl.BufferEntry.WithFrame ? ((androidx.camera.camera2.pipe.framegraph.FrameBufferImpl.BufferEntry.WithFrame) withoutFrame).getFrame() : null;
                kotlin.Unit unit2 = kotlin.Unit.INSTANCE;
            } else {
                if (this.getHighSpeedVideoFpsRanges.size() == getCapacity()) {
                    androidx.camera.camera2.pipe.framegraph.FrameBufferImpl.BufferEntry removeFirst = this.getHighSpeedVideoFpsRanges.removeFirst();
                    if (removeFirst instanceof androidx.camera.camera2.pipe.framegraph.FrameBufferImpl.BufferEntry.WithFrame) {
                        r1 = ((androidx.camera.camera2.pipe.framegraph.FrameBufferImpl.BufferEntry.WithFrame) removeFirst).getFrame();
                    }
                }
                this.getHighSpeedVideoFpsRanges.add(withoutFrame);
                this.getOutputMinFrameDuration.setValue(java.lang.Integer.valueOf(this.getHighSpeedVideoFpsRanges.size()));
                this.getHighSpeedVideoFpsRangesFor.tryEmit(withoutFrame.getFrameReference());
            }
        }
        if (r1 != null) {
            r1.close();
        }
    }

    @Override // androidx.camera.camera2.pipe.FrameBuffer
    public final androidx.camera.camera2.pipe.FrameReference removeFirstReference() {
        synchronized (this.Camera2StreamConfigurationMap) {
            androidx.camera.camera2.pipe.FrameReference frameReference = null;
            if (this.getHighSpeedVideoSizes) {
                return null;
            }
            androidx.camera.camera2.pipe.framegraph.FrameBufferImpl.BufferEntry removeFirstOrNull = this.getHighSpeedVideoFpsRanges.removeFirstOrNull();
            if (removeFirstOrNull != null) {
                this.getOutputMinFrameDuration.setValue(java.lang.Integer.valueOf(this.getHighSpeedVideoFpsRanges.size()));
                frameReference = removeFirstOrNull.getFrameReference();
            }
            return frameReference;
        }
    }

    @Override // androidx.camera.camera2.pipe.FrameBuffer
    public final androidx.camera.camera2.pipe.FrameReference removeLastReference() {
        synchronized (this.Camera2StreamConfigurationMap) {
            androidx.camera.camera2.pipe.FrameReference frameReference = null;
            if (this.getHighSpeedVideoSizes) {
                return null;
            }
            androidx.camera.camera2.pipe.framegraph.FrameBufferImpl.BufferEntry removeLastOrNull = this.getHighSpeedVideoFpsRanges.removeLastOrNull();
            if (removeLastOrNull != null) {
                this.getOutputMinFrameDuration.setValue(java.lang.Integer.valueOf(this.getHighSpeedVideoFpsRanges.size()));
                frameReference = removeLastOrNull.getFrameReference();
            }
            return frameReference;
        }
    }

    @Override // androidx.camera.camera2.pipe.FrameBuffer
    public final java.util.List<androidx.camera.camera2.pipe.FrameReference> removeAllReferences() {
        synchronized (this.Camera2StreamConfigurationMap) {
            if (this.getHighSpeedVideoSizes) {
                return kotlin.collections.CollectionsKt.emptyList();
            }
            kotlin.collections.ArrayDeque<androidx.camera.camera2.pipe.framegraph.FrameBufferImpl.BufferEntry> arrayDeque = this.getHighSpeedVideoFpsRanges;
            java.util.ArrayList arrayList = new java.util.ArrayList(kotlin.collections.CollectionsKt.collectionSizeOrDefault(arrayDeque, 10));
            java.util.Iterator<androidx.camera.camera2.pipe.framegraph.FrameBufferImpl.BufferEntry> it = arrayDeque.iterator();
            while (it.hasNext()) {
                arrayList.add(it.next().getFrameReference());
            }
            java.util.ArrayList arrayList2 = arrayList;
            this.getHighSpeedVideoFpsRanges.clear();
            this.getOutputMinFrameDuration.setValue(0);
            return arrayList2;
        }
    }

    @Override // androidx.camera.camera2.pipe.FrameBuffer
    public final androidx.camera.camera2.pipe.Frame removeFirstFrameReferenceAndAcquire(kotlin.jvm.functions.Function1<? super androidx.camera.camera2.pipe.FrameReference, java.lang.Boolean> predicate) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(predicate, "");
        return getHighSpeedVideoFpsRanges(this.getHighSpeedVideoFpsRanges.iterator(), predicate);
    }

    @Override // androidx.camera.camera2.pipe.FrameBuffer
    public final androidx.camera.camera2.pipe.Frame removeLastFrameReferenceAndAcquire(kotlin.jvm.functions.Function1<? super androidx.camera.camera2.pipe.FrameReference, java.lang.Boolean> predicate) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(predicate, "");
        return getHighSpeedVideoFpsRanges(kotlin.collections.CollectionsKt.asReversedMutable(this.getHighSpeedVideoFpsRanges).iterator(), predicate);
    }

    @Override // androidx.camera.camera2.pipe.FrameBuffer
    public final java.util.List<androidx.camera.camera2.pipe.Frame> removeAllFrameReferencesAndAcquire(kotlin.jvm.functions.Function1<? super androidx.camera.camera2.pipe.FrameReference, java.lang.Boolean> predicate) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(predicate, "");
        synchronized (this.Camera2StreamConfigurationMap) {
            if (this.getHighSpeedVideoSizes) {
                return kotlin.collections.CollectionsKt.emptyList();
            }
            java.util.Iterator<androidx.camera.camera2.pipe.framegraph.FrameBufferImpl.BufferEntry> it = this.getHighSpeedVideoFpsRanges.iterator();
            java.util.ArrayList arrayList = new java.util.ArrayList();
            while (it.hasNext()) {
                androidx.camera.camera2.pipe.framegraph.FrameBufferImpl.BufferEntry next = it.next();
                if (predicate.invoke(next.getFrameReference()).booleanValue()) {
                    it.remove();
                    androidx.camera.camera2.pipe.framegraph.FrameBufferImpl.BufferEntry.WithFrame withFrame = next instanceof androidx.camera.camera2.pipe.framegraph.FrameBufferImpl.BufferEntry.WithFrame ? (androidx.camera.camera2.pipe.framegraph.FrameBufferImpl.BufferEntry.WithFrame) next : null;
                    if (withFrame != null) {
                        arrayList.add(withFrame.getFrame());
                    }
                }
            }
            this.getOutputMinFrameDuration.setValue(java.lang.Integer.valueOf(this.getHighSpeedVideoFpsRanges.size()));
            return arrayList;
        }
    }

    @Override // androidx.camera.camera2.pipe.FrameBuffer
    public final androidx.camera.camera2.pipe.FrameReference peekFirstReference() {
        synchronized (this.Camera2StreamConfigurationMap) {
            if (this.getHighSpeedVideoSizes) {
                return null;
            }
            androidx.camera.camera2.pipe.framegraph.FrameBufferImpl.BufferEntry firstOrNull = this.getHighSpeedVideoFpsRanges.firstOrNull();
            return firstOrNull != null ? firstOrNull.getFrameReference() : null;
        }
    }

    @Override // androidx.camera.camera2.pipe.FrameBuffer
    public final androidx.camera.camera2.pipe.FrameReference peekLastReference() {
        synchronized (this.Camera2StreamConfigurationMap) {
            if (this.getHighSpeedVideoSizes) {
                return null;
            }
            androidx.camera.camera2.pipe.framegraph.FrameBufferImpl.BufferEntry lastOrNull = this.getHighSpeedVideoFpsRanges.lastOrNull();
            return lastOrNull != null ? lastOrNull.getFrameReference() : null;
        }
    }

    @Override // androidx.camera.camera2.pipe.FrameBuffer
    public final java.util.List<androidx.camera.camera2.pipe.FrameReference> peekAllReferences() {
        synchronized (this.Camera2StreamConfigurationMap) {
            if (this.getHighSpeedVideoSizes) {
                return kotlin.collections.CollectionsKt.emptyList();
            }
            kotlin.collections.ArrayDeque<androidx.camera.camera2.pipe.framegraph.FrameBufferImpl.BufferEntry> arrayDeque = this.getHighSpeedVideoFpsRanges;
            java.util.ArrayList arrayList = new java.util.ArrayList(kotlin.collections.CollectionsKt.collectionSizeOrDefault(arrayDeque, 10));
            java.util.Iterator<androidx.camera.camera2.pipe.framegraph.FrameBufferImpl.BufferEntry> it = arrayDeque.iterator();
            while (it.hasNext()) {
                arrayList.add(it.next().getFrameReference());
            }
            return arrayList;
        }
    }

    /* JADX WARN: Type inference failed for: r3v2, types: [T, java.util.List] */
    @Override // androidx.camera.camera2.pipe.FrameBuffer, java.lang.AutoCloseable
    public final void close() {
        kotlin.jvm.internal.Ref.ObjectRef objectRef = new kotlin.jvm.internal.Ref.ObjectRef();
        synchronized (this.Camera2StreamConfigurationMap) {
            if (this.getHighSpeedVideoSizes) {
                return;
            }
            this.getHighSpeedVideoSizes = true;
            kotlin.collections.ArrayDeque<androidx.camera.camera2.pipe.framegraph.FrameBufferImpl.BufferEntry> arrayDeque = this.getHighSpeedVideoFpsRanges;
            java.util.ArrayList arrayList = new java.util.ArrayList();
            for (androidx.camera.camera2.pipe.framegraph.FrameBufferImpl.BufferEntry bufferEntry : arrayDeque) {
                androidx.camera.camera2.pipe.framegraph.FrameBufferImpl.BufferEntry.WithFrame withFrame = bufferEntry instanceof androidx.camera.camera2.pipe.framegraph.FrameBufferImpl.BufferEntry.WithFrame ? (androidx.camera.camera2.pipe.framegraph.FrameBufferImpl.BufferEntry.WithFrame) bufferEntry : null;
                androidx.camera.camera2.pipe.Frame frame = withFrame != null ? withFrame.getFrame() : null;
                if (frame != null) {
                    arrayList.add(frame);
                }
            }
            objectRef.element = arrayList;
            this.getHighSpeedVideoFpsRanges.clear();
            this.getOutputMinFrameDuration.setValue(0);
            kotlin.Unit unit = kotlin.Unit.INSTANCE;
            java.util.Iterator it = ((java.util.List) objectRef.element).iterator();
            while (it.hasNext()) {
                ((androidx.camera.camera2.pipe.Frame) it.next()).close();
            }
            this.getHighResolutionOutputSizeshNQ4ISI.detach$camera_camera2_pipe(this);
        }
    }

    private final androidx.camera.camera2.pipe.Frame getHighSpeedVideoFpsRanges(java.util.Iterator<? extends androidx.camera.camera2.pipe.framegraph.FrameBufferImpl.BufferEntry> p0, kotlin.jvm.functions.Function1<? super androidx.camera.camera2.pipe.FrameReference, java.lang.Boolean> p1) {
        while (true) {
            if (!p0.hasNext()) {
                break;
            }
            androidx.camera.camera2.pipe.framegraph.FrameBufferImpl.BufferEntry next = p0.next();
            if (p1.invoke(next.getFrameReference()).booleanValue()) {
                p0.remove();
                this.getOutputMinFrameDuration.setValue(java.lang.Integer.valueOf(this.getHighSpeedVideoFpsRanges.size()));
                androidx.camera.camera2.pipe.framegraph.FrameBufferImpl.BufferEntry.WithFrame withFrame = next instanceof androidx.camera.camera2.pipe.framegraph.FrameBufferImpl.BufferEntry.WithFrame ? (androidx.camera.camera2.pipe.framegraph.FrameBufferImpl.BufferEntry.WithFrame) next : null;
                if (withFrame != null) {
                    return withFrame.getFrame();
                }
            }
        }
        return null;
    }

    @kotlin.Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0006X\u0087T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006"}, d2 = {"Landroidx/camera/camera2/pipe/framegraph/FrameBufferImpl$Companion;", "", "<init>", "()V", "", "FRAME_FLOW_EXTRA_BUFFER_CAPACITY", com.visa.cbp.getEncExpo.warmup}, k = 1, mv = {2, 1, 0}, xi = 48)
    static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }
}
