package androidx.camera.camera2.pipe.internal;

@kotlin.Metadata(d1 = {"\u0000\u008a\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0000\u0018\u00002\u00020\u0001B!\b\u0000\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0007\u0010\bJ!\u0010\n\u001a\u0004\u0018\u00010\u00002\u000e\u0010\t\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0004H\u0016¢\u0006\u0004\b\n\u0010\u000bJ\u000f\u0010\r\u001a\u00020\fH\u0016¢\u0006\u0004\b\r\u0010\u000eJ\u000f\u0010\u0010\u001a\u00020\u000fH\u0002¢\u0006\u0004\b\u0010\u0010\u0011J\u000f\u0010\u0012\u001a\u00020\fH\u0004¢\u0006\u0004\b\u0012\u0010\u000eJ\u0012\u0010\u0014\u001a\u0004\u0018\u00010\u0013H\u0096@¢\u0006\u0004\b\u0014\u0010\u0015J\u0011\u0010\u0016\u001a\u0004\u0018\u00010\u0013H\u0016¢\u0006\u0004\b\u0016\u0010\u0017J\u001a\u0010\u001c\u001a\u0004\u0018\u00010\u00192\u0006\u0010\u0018\u001a\u00020\u0005H\u0096@¢\u0006\u0004\b\u001a\u0010\u001bJ\u0019\u0010\u001f\u001a\u0004\u0018\u00010\u00192\u0006\u0010\u0018\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\u001d\u0010\u001eJ\u001a\u0010\u001c\u001a\u0004\u0018\u00010\u00192\u0006\u0010!\u001a\u00020 H\u0096@¢\u0006\u0004\b\"\u0010\u001bJ\u0019\u0010\u001f\u001a\u0004\u0018\u00010\u00192\u0006\u0010!\u001a\u00020 H\u0016¢\u0006\u0004\b#\u0010\u001eJ\u001e\u0010&\u001a\b\u0012\u0004\u0012\u00020\u00190$2\u0006\u0010\u0018\u001a\u00020\u0005H\u0096@¢\u0006\u0004\b%\u0010\u001bJ\u001d\u0010)\u001a\b\u0012\u0004\u0012\u00020\u00190$2\u0006\u0010\u0018\u001a\u00020\u0005H\u0016¢\u0006\u0004\b'\u0010(J\u0017\u0010-\u001a\u00020*2\u0006\u0010\u0018\u001a\u00020\u0005H\u0016¢\u0006\u0004\b+\u0010,J\u0017\u0010-\u001a\u00020*2\u0006\u0010!\u001a\u00020 H\u0016¢\u0006\u0004\b.\u0010,J\u0017\u00101\u001a\u00020\f2\u0006\u00100\u001a\u00020/H\u0016¢\u0006\u0004\b1\u00102J\u000f\u00104\u001a\u000203H\u0016¢\u0006\u0004\b4\u00105R\u0014\u0010\u0010\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b6\u00107R \u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0017X\u0096\u0004¢\u0006\f\n\u0004\b\u0006\u00108\u001a\u0004\b9\u0010:R\u001a\u0010<\u001a\b\u0012\u0004\u0012\u00020 0\u00048\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b;\u00108R\u0014\u0010>\u001a\u00020=8\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b>\u0010?R\u0014\u0010C\u001a\u00020@8WX\u0096\u0004¢\u0006\u0006\u001a\u0004\bA\u0010BR\u0014\u0010G\u001a\u00020D8WX\u0096\u0004¢\u0006\u0006\u001a\u0004\bE\u0010FR\u0014\u0010J\u001a\u00020H8WX\u0096\u0004¢\u0006\u0006\u001a\u0004\bI\u0010FR\u0014\u0010M\u001a\u00020K8WX\u0096\u0004¢\u0006\u0006\u001a\u0004\bL\u0010FR\u0014\u0010P\u001a\u00020*8WX\u0096\u0004¢\u0006\u0006\u001a\u0004\bN\u0010O"}, d2 = {"Landroidx/camera/camera2/pipe/internal/FrameImpl;", "Landroidx/camera/camera2/pipe/Frame;", "Landroidx/camera/camera2/pipe/internal/FrameState;", "frameState", "", "Landroidx/camera/camera2/pipe/StreamId;", "imageStreams", "<init>", "(Landroidx/camera/camera2/pipe/internal/FrameState;Ljava/util/Set;)V", "streamFilter", "tryAcquire", "(Ljava/util/Set;)Landroidx/camera/camera2/pipe/internal/FrameImpl;", "", "close", "()V", "", "getHighSpeedVideoSizes", "()Z", "finalize", "Landroidx/camera/camera2/pipe/FrameInfo;", "awaitFrameInfo", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getFrameInfo", "()Landroidx/camera/camera2/pipe/FrameInfo;", "streamId", "Landroidx/camera/camera2/pipe/media/OutputImage;", "awaitImage-NYG5g8E", "(ILkotlin/coroutines/Continuation;)Ljava/lang/Object;", "awaitImage", "getImage-aKI5c8E", "(I)Landroidx/camera/camera2/pipe/media/OutputImage;", "getImage", "Landroidx/camera/camera2/pipe/OutputId;", "outputId", "awaitImage-A9nWXxg", "getImage-iYJqvbA", "", "awaitImages-NYG5g8E", "awaitImages", "getImages-aKI5c8E", "(I)Ljava/util/List;", "getImages", "Landroidx/camera/camera2/pipe/OutputStatus;", "imageStatus-Oo2lJfM", "(I)I", "imageStatus", "imageStatus-BWjvHWQ", "Landroidx/camera/camera2/pipe/Frame$Listener;", com.google.android.gms.common.internal.ServiceSpecificExtraArgs.CastExtraArgs.LISTENER, "addListener", "(Landroidx/camera/camera2/pipe/Frame$Listener;)V", "", "toString", "()Ljava/lang/String;", "getHighSpeedVideoFpsRangesFor", "Landroidx/camera/camera2/pipe/internal/FrameState;", "Ljava/util/Set;", "getImageStreams", "()Ljava/util/Set;", "Camera2StreamConfigurationMap", "getHighResolutionOutputSizeshNQ4ISI", "Lkotlinx/atomicfu/AtomicBoolean;", "getHighSpeedVideoFpsRanges", "Lkotlinx/atomicfu/AtomicBoolean;", "Landroidx/camera/camera2/pipe/RequestMetadata;", "getRequestMetadata", "()Landroidx/camera/camera2/pipe/RequestMetadata;", "requestMetadata", "Landroidx/camera/camera2/pipe/FrameId;", "getFrameId-OMxQvVY", "()J", "frameId", "Landroidx/camera/camera2/pipe/FrameNumber;", "getFrameNumber-Ugla2oM", "frameNumber", "Landroidx/camera/camera2/pipe/CameraTimestamp;", "getFrameTimestamp-LS1Wq50", "frameTimestamp", "getFrameInfoStatus-U7r42EA", "()I", "frameInfoStatus"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class FrameImpl implements androidx.camera.camera2.pipe.Frame {

    /* renamed from: Camera2StreamConfigurationMap, reason: from kotlin metadata */
    private final java.util.Set<androidx.camera.camera2.pipe.OutputId> getHighResolutionOutputSizeshNQ4ISI;
    private final kotlinx.atomicfu.AtomicBoolean getHighSpeedVideoFpsRanges;

    /* renamed from: getHighSpeedVideoFpsRangesFor, reason: from kotlin metadata */
    private final androidx.camera.camera2.pipe.internal.FrameState getHighSpeedVideoSizes;
    private final java.util.Set<androidx.camera.camera2.pipe.StreamId> imageStreams;

    public FrameImpl(androidx.camera.camera2.pipe.internal.FrameState frameState, java.util.Set<androidx.camera.camera2.pipe.StreamId> set) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(frameState, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(set, "");
        this.getHighSpeedVideoSizes = frameState;
        this.imageStreams = set;
        java.util.List<androidx.camera.camera2.pipe.internal.FrameState.ImageOutput> imageOutputs = frameState.getImageOutputs();
        java.util.ArrayList arrayList = new java.util.ArrayList(kotlin.collections.CollectionsKt.collectionSizeOrDefault(imageOutputs, 10));
        java.util.Iterator<T> it = imageOutputs.iterator();
        while (it.hasNext()) {
            arrayList.add(androidx.camera.camera2.pipe.OutputId.m536boximpl(((androidx.camera.camera2.pipe.internal.FrameState.ImageOutput) it.next()).getOutputId()));
        }
        this.getHighResolutionOutputSizeshNQ4ISI = kotlin.collections.CollectionsKt.toSet(arrayList);
        this.getHighSpeedVideoFpsRanges = kotlinx.atomicfu.AtomicFU.atomic(false);
    }

    @Override // androidx.camera.camera2.pipe.FrameReference
    public final /* bridge */ /* synthetic */ androidx.camera.camera2.pipe.Frame tryAcquire(java.util.Set set) {
        return tryAcquire((java.util.Set<androidx.camera.camera2.pipe.StreamId>) set);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public /* synthetic */ FrameImpl(androidx.camera.camera2.pipe.internal.FrameState frameState, java.util.Set set, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this(frameState, set);
        if ((i & 2) != 0) {
            java.util.List<androidx.camera.camera2.pipe.internal.FrameState.ImageOutput> imageOutputs = frameState.getImageOutputs();
            java.util.ArrayList arrayList = new java.util.ArrayList(kotlin.collections.CollectionsKt.collectionSizeOrDefault(imageOutputs, 10));
            java.util.Iterator<T> it = imageOutputs.iterator();
            while (it.hasNext()) {
                arrayList.add(androidx.camera.camera2.pipe.StreamId.m755boximpl(((androidx.camera.camera2.pipe.internal.FrameState.ImageOutput) it.next()).getStreamId()));
            }
            set = kotlin.collections.CollectionsKt.toSet(arrayList);
        }
    }

    @Override // androidx.camera.camera2.pipe.FrameReference
    public final java.util.Set<androidx.camera.camera2.pipe.StreamId> getImageStreams() {
        return this.imageStreams;
    }

    @Override // androidx.camera.camera2.pipe.FrameReference
    public final androidx.camera.camera2.pipe.internal.FrameImpl tryAcquire(java.util.Set<androidx.camera.camera2.pipe.StreamId> streamFilter) {
        boolean z;
        if (this.getHighSpeedVideoFpsRanges.getValue() || !this.getHighSpeedVideoSizes.getFrameInfoOutput().increment()) {
            return null;
        }
        java.util.Set createSetBuilder = kotlin.collections.SetsKt.createSetBuilder();
        java.util.Iterator<androidx.camera.camera2.pipe.internal.FrameState.ImageOutput> it = this.getHighSpeedVideoSizes.getImageOutputs().iterator();
        while (true) {
            if (!it.hasNext()) {
                z = true;
                break;
            }
            androidx.camera.camera2.pipe.internal.FrameState.ImageOutput next = it.next();
            int streamId = next.getStreamId();
            if (getImageStreams().contains(androidx.camera.camera2.pipe.StreamId.m755boximpl(streamId)) && (streamFilter == null || streamFilter.contains(androidx.camera.camera2.pipe.StreamId.m755boximpl(streamId)))) {
                if (!next.increment()) {
                    z = false;
                    break;
                }
                createSetBuilder.add(androidx.camera.camera2.pipe.StreamId.m755boximpl(streamId));
            }
        }
        java.util.Set build = kotlin.collections.SetsKt.build(createSetBuilder);
        if (!z) {
            this.getHighSpeedVideoSizes.getFrameInfoOutput().decrement();
            for (androidx.camera.camera2.pipe.internal.FrameState.ImageOutput imageOutput : this.getHighSpeedVideoSizes.getImageOutputs()) {
                if (build.contains(androidx.camera.camera2.pipe.StreamId.m755boximpl(imageOutput.getStreamId()))) {
                    imageOutput.decrement();
                }
            }
            return null;
        }
        return new androidx.camera.camera2.pipe.internal.FrameImpl(this.getHighSpeedVideoSizes, build);
    }

    @Override // java.lang.AutoCloseable
    public final void close() {
        getHighSpeedVideoSizes();
    }

    private final boolean getHighSpeedVideoSizes() {
        if (!this.getHighSpeedVideoFpsRanges.compareAndSet(false, true)) {
            return false;
        }
        this.getHighSpeedVideoSizes.getFrameInfoOutput().decrement();
        int size = this.getHighSpeedVideoSizes.getImageOutputs().size();
        for (int i = 0; i < size; i++) {
            androidx.camera.camera2.pipe.internal.FrameState.ImageOutput imageOutput = this.getHighSpeedVideoSizes.getImageOutputs().get(i);
            if (getImageStreams().contains(androidx.camera.camera2.pipe.StreamId.m755boximpl(imageOutput.getStreamId()))) {
                imageOutput.decrement();
            }
        }
        return true;
    }

    @Override // androidx.camera.camera2.pipe.FrameReference
    public final androidx.camera.camera2.pipe.RequestMetadata getRequestMetadata() {
        return this.getHighSpeedVideoSizes.getRequestMetadata();
    }

    @Override // androidx.camera.camera2.pipe.FrameReference
    /* renamed from: getFrameId-OMxQvVY */
    public final long mo505getFrameIdOMxQvVY() {
        return this.getHighSpeedVideoSizes.getFrameId();
    }

    @Override // androidx.camera.camera2.pipe.FrameReference
    /* renamed from: getFrameNumber-Ugla2oM */
    public final long mo507getFrameNumberUgla2oM() {
        return this.getHighSpeedVideoSizes.getFrameNumber();
    }

    @Override // androidx.camera.camera2.pipe.FrameReference
    /* renamed from: getFrameTimestamp-LS1Wq50 */
    public final long mo508getFrameTimestampLS1Wq50() {
        return this.getHighSpeedVideoSizes.getFrameTimestamp();
    }

    @Override // androidx.camera.camera2.pipe.FrameReference
    /* renamed from: getFrameInfoStatus-U7r42EA */
    public final int mo506getFrameInfoStatusU7r42EA() {
        return this.getHighSpeedVideoFpsRanges.getValue() ? androidx.camera.camera2.pipe.OutputStatus.INSTANCE.m556getUNAVAILABLEU7r42EA() : this.getHighSpeedVideoSizes.getFrameInfoOutput().m967getStatusU7r42EA();
    }

    protected final void finalize() {
        if (getHighSpeedVideoSizes()) {
            androidx.camera.camera2.pipe.core.Log.INSTANCE.getERROR_LOGGABLE();
        }
    }

    @Override // androidx.camera.camera2.pipe.Frame
    public final java.lang.Object awaitFrameInfo(kotlin.coroutines.Continuation<? super androidx.camera.camera2.pipe.FrameInfo> continuation) {
        if (this.getHighSpeedVideoFpsRanges.getValue()) {
            return null;
        }
        return this.getHighSpeedVideoSizes.getFrameInfoOutput().await(continuation);
    }

    @Override // androidx.camera.camera2.pipe.Frame
    public final androidx.camera.camera2.pipe.FrameInfo getFrameInfo() {
        if (this.getHighSpeedVideoFpsRanges.getValue()) {
            return null;
        }
        return this.getHighSpeedVideoSizes.getFrameInfoOutput().outputOrNull();
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x008c  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x00a2 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:19:0x00a1 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0037  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0025  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:15:0x009a -> B:10:0x009d). Please report as a decompilation issue!!! */
    @Override // androidx.camera.camera2.pipe.Frame
    /* renamed from: awaitImage-NYG5g8E */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object mo468awaitImageNYG5g8E(int i, kotlin.coroutines.Continuation<? super androidx.camera.camera2.pipe.media.OutputImage> continuation) {
        androidx.camera.camera2.pipe.internal.FrameImpl$awaitImage$1 frameImpl$awaitImage$1;
        int i2;
        java.util.Iterator it;
        if (continuation instanceof androidx.camera.camera2.pipe.internal.FrameImpl$awaitImage$1) {
            frameImpl$awaitImage$1 = (androidx.camera.camera2.pipe.internal.FrameImpl$awaitImage$1) continuation;
            if ((frameImpl$awaitImage$1.Camera2StreamConfigurationMap & Integer.MIN_VALUE) != 0) {
                frameImpl$awaitImage$1.Camera2StreamConfigurationMap -= 2147483648;
                java.lang.Object obj = frameImpl$awaitImage$1.getHighResolutionOutputSizeshNQ4ISI;
                java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i2 = frameImpl$awaitImage$1.Camera2StreamConfigurationMap;
                if (i2 != 0) {
                    kotlin.ResultKt.throwOnFailure(obj);
                    if (this.getHighSpeedVideoFpsRanges.getValue() || !getImageStreams().contains(androidx.camera.camera2.pipe.StreamId.m755boximpl(i))) {
                        return null;
                    }
                    java.util.List<androidx.camera.camera2.pipe.internal.FrameState.ImageOutput> imageOutputs = this.getHighSpeedVideoSizes.getImageOutputs();
                    java.util.ArrayList arrayList = new java.util.ArrayList();
                    for (java.lang.Object obj2 : imageOutputs) {
                        if (androidx.camera.camera2.pipe.StreamId.m758equalsimpl0(((androidx.camera.camera2.pipe.internal.FrameState.ImageOutput) obj2).getStreamId(), i)) {
                            arrayList.add(obj2);
                        }
                    }
                    it = arrayList.iterator();
                    if (it.hasNext()) {
                    }
                } else {
                    if (i2 != 1) {
                        throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    it = (java.util.Iterator) frameImpl$awaitImage$1.getHighSpeedVideoFpsRangesFor;
                    kotlin.ResultKt.throwOnFailure(obj);
                    androidx.camera.camera2.pipe.media.SharedOutputImage sharedOutputImage = (androidx.camera.camera2.pipe.media.SharedOutputImage) obj;
                    if (sharedOutputImage != null) {
                        return sharedOutputImage;
                    }
                    if (it.hasNext()) {
                        androidx.camera.camera2.pipe.internal.FrameState.ImageOutput imageOutput = (androidx.camera.camera2.pipe.internal.FrameState.ImageOutput) it.next();
                        frameImpl$awaitImage$1.getHighSpeedVideoFpsRangesFor = it;
                        frameImpl$awaitImage$1.Camera2StreamConfigurationMap = 1;
                        obj = imageOutput.await(frameImpl$awaitImage$1);
                        if (obj == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                        androidx.camera.camera2.pipe.media.SharedOutputImage sharedOutputImage2 = (androidx.camera.camera2.pipe.media.SharedOutputImage) obj;
                        if (sharedOutputImage2 != null) {
                        }
                        if (it.hasNext()) {
                            return null;
                        }
                    }
                }
            }
        }
        frameImpl$awaitImage$1 = new androidx.camera.camera2.pipe.internal.FrameImpl$awaitImage$1(this, continuation);
        java.lang.Object obj3 = frameImpl$awaitImage$1.getHighResolutionOutputSizeshNQ4ISI;
        java.lang.Object coroutine_suspended2 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i2 = frameImpl$awaitImage$1.Camera2StreamConfigurationMap;
        if (i2 != 0) {
        }
    }

    @Override // androidx.camera.camera2.pipe.Frame
    /* renamed from: getImage-aKI5c8E */
    public final androidx.camera.camera2.pipe.media.OutputImage mo470getImageaKI5c8E(int streamId) {
        if (this.getHighSpeedVideoFpsRanges.getValue() || !getImageStreams().contains(androidx.camera.camera2.pipe.StreamId.m755boximpl(streamId))) {
            return null;
        }
        java.util.List<androidx.camera.camera2.pipe.internal.FrameState.ImageOutput> imageOutputs = this.getHighSpeedVideoSizes.getImageOutputs();
        java.util.ArrayList arrayList = new java.util.ArrayList();
        for (java.lang.Object obj : imageOutputs) {
            if (androidx.camera.camera2.pipe.StreamId.m758equalsimpl0(((androidx.camera.camera2.pipe.internal.FrameState.ImageOutput) obj).getStreamId(), streamId)) {
                arrayList.add(obj);
            }
        }
        java.util.Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            androidx.camera.camera2.pipe.media.SharedOutputImage outputOrNull = ((androidx.camera.camera2.pipe.internal.FrameState.ImageOutput) it.next()).outputOrNull();
            if (outputOrNull != null) {
                return outputOrNull;
            }
        }
        return null;
    }

    @Override // androidx.camera.camera2.pipe.Frame
    /* renamed from: awaitImage-A9nWXxg */
    public final java.lang.Object mo467awaitImageA9nWXxg(int i, kotlin.coroutines.Continuation<? super androidx.camera.camera2.pipe.media.OutputImage> continuation) {
        java.lang.Object obj;
        if (this.getHighSpeedVideoFpsRanges.getValue() || !this.getHighResolutionOutputSizeshNQ4ISI.contains(androidx.camera.camera2.pipe.OutputId.m536boximpl(i))) {
            return null;
        }
        java.util.Iterator<T> it = this.getHighSpeedVideoSizes.getImageOutputs().iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            }
            obj = it.next();
            if (androidx.camera.camera2.pipe.OutputId.m539equalsimpl0(((androidx.camera.camera2.pipe.internal.FrameState.ImageOutput) obj).getOutputId(), i)) {
                break;
            }
        }
        androidx.camera.camera2.pipe.internal.FrameState.ImageOutput imageOutput = (androidx.camera.camera2.pipe.internal.FrameState.ImageOutput) obj;
        if (imageOutput == null) {
            return null;
        }
        java.lang.Object await = imageOutput.await(continuation);
        return await == kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED() ? await : (androidx.camera.camera2.pipe.media.SharedOutputImage) await;
    }

    @Override // androidx.camera.camera2.pipe.Frame
    /* renamed from: getImage-iYJqvbA */
    public final androidx.camera.camera2.pipe.media.OutputImage mo471getImageiYJqvbA(int outputId) {
        java.lang.Object obj;
        if (this.getHighSpeedVideoFpsRanges.getValue() || !this.getHighResolutionOutputSizeshNQ4ISI.contains(androidx.camera.camera2.pipe.OutputId.m536boximpl(outputId))) {
            return null;
        }
        java.util.Iterator<T> it = this.getHighSpeedVideoSizes.getImageOutputs().iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            }
            obj = it.next();
            if (androidx.camera.camera2.pipe.OutputId.m539equalsimpl0(((androidx.camera.camera2.pipe.internal.FrameState.ImageOutput) obj).getOutputId(), outputId)) {
                break;
            }
        }
        androidx.camera.camera2.pipe.internal.FrameState.ImageOutput imageOutput = (androidx.camera.camera2.pipe.internal.FrameState.ImageOutput) obj;
        return imageOutput != null ? imageOutput.outputOrNull() : null;
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x00a3  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x00be  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x00ba  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x003b  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:15:0x00b3 -> B:10:0x00b6). Please report as a decompilation issue!!! */
    @Override // androidx.camera.camera2.pipe.Frame
    /* renamed from: awaitImages-NYG5g8E */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object mo469awaitImagesNYG5g8E(int i, kotlin.coroutines.Continuation<? super java.util.List<? extends androidx.camera.camera2.pipe.media.OutputImage>> continuation) {
        androidx.camera.camera2.pipe.internal.FrameImpl$awaitImages$1 frameImpl$awaitImages$1;
        int i2;
        java.util.Collection collection;
        java.util.Iterator it;
        if (continuation instanceof androidx.camera.camera2.pipe.internal.FrameImpl$awaitImages$1) {
            frameImpl$awaitImages$1 = (androidx.camera.camera2.pipe.internal.FrameImpl$awaitImages$1) continuation;
            if ((frameImpl$awaitImages$1.getHighSpeedVideoFpsRangesFor & Integer.MIN_VALUE) != 0) {
                frameImpl$awaitImages$1.getHighSpeedVideoFpsRangesFor -= 2147483648;
                java.lang.Object obj = frameImpl$awaitImages$1.Camera2StreamConfigurationMap;
                java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i2 = frameImpl$awaitImages$1.getHighSpeedVideoFpsRangesFor;
                if (i2 != 0) {
                    kotlin.ResultKt.throwOnFailure(obj);
                    if (!this.getHighSpeedVideoFpsRanges.getValue() && getImageStreams().contains(androidx.camera.camera2.pipe.StreamId.m755boximpl(i))) {
                        java.util.List<androidx.camera.camera2.pipe.internal.FrameState.ImageOutput> imageOutputs = this.getHighSpeedVideoSizes.getImageOutputs();
                        java.util.ArrayList arrayList = new java.util.ArrayList();
                        for (java.lang.Object obj2 : imageOutputs) {
                            if (androidx.camera.camera2.pipe.StreamId.m758equalsimpl0(((androidx.camera.camera2.pipe.internal.FrameState.ImageOutput) obj2).getStreamId(), i)) {
                                arrayList.add(obj2);
                            }
                        }
                        java.util.ArrayList arrayList2 = new java.util.ArrayList();
                        java.util.Iterator it2 = arrayList.iterator();
                        collection = arrayList2;
                        it = it2;
                        if (it.hasNext()) {
                        }
                    }
                    return kotlin.collections.CollectionsKt.emptyList();
                }
                if (i2 != 1) {
                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                it = (java.util.Iterator) frameImpl$awaitImages$1.getHighSpeedVideoSizes;
                collection = (java.util.Collection) frameImpl$awaitImages$1.getHighResolutionOutputSizeshNQ4ISI;
                kotlin.ResultKt.throwOnFailure(obj);
                androidx.camera.camera2.pipe.media.SharedOutputImage sharedOutputImage = (androidx.camera.camera2.pipe.media.SharedOutputImage) obj;
                if (sharedOutputImage != null) {
                    collection.add(sharedOutputImage);
                }
                if (it.hasNext()) {
                    androidx.camera.camera2.pipe.internal.FrameState.ImageOutput imageOutput = (androidx.camera.camera2.pipe.internal.FrameState.ImageOutput) it.next();
                    frameImpl$awaitImages$1.getHighResolutionOutputSizeshNQ4ISI = collection;
                    frameImpl$awaitImages$1.getHighSpeedVideoSizes = it;
                    frameImpl$awaitImages$1.getHighSpeedVideoFpsRangesFor = 1;
                    obj = imageOutput.await(frameImpl$awaitImages$1);
                    if (obj == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    androidx.camera.camera2.pipe.media.SharedOutputImage sharedOutputImage2 = (androidx.camera.camera2.pipe.media.SharedOutputImage) obj;
                    if (sharedOutputImage2 != null) {
                    }
                    if (it.hasNext()) {
                        return (java.util.List) collection;
                    }
                }
            }
        }
        frameImpl$awaitImages$1 = new androidx.camera.camera2.pipe.internal.FrameImpl$awaitImages$1(this, continuation);
        java.lang.Object obj3 = frameImpl$awaitImages$1.Camera2StreamConfigurationMap;
        java.lang.Object coroutine_suspended2 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i2 = frameImpl$awaitImages$1.getHighSpeedVideoFpsRangesFor;
        if (i2 != 0) {
        }
    }

    @Override // androidx.camera.camera2.pipe.Frame
    /* renamed from: getImages-aKI5c8E */
    public final java.util.List<androidx.camera.camera2.pipe.media.OutputImage> mo472getImagesaKI5c8E(int streamId) {
        if (!this.getHighSpeedVideoFpsRanges.getValue() && getImageStreams().contains(androidx.camera.camera2.pipe.StreamId.m755boximpl(streamId))) {
            java.util.List<androidx.camera.camera2.pipe.internal.FrameState.ImageOutput> imageOutputs = this.getHighSpeedVideoSizes.getImageOutputs();
            java.util.ArrayList arrayList = new java.util.ArrayList();
            for (java.lang.Object obj : imageOutputs) {
                if (androidx.camera.camera2.pipe.StreamId.m758equalsimpl0(((androidx.camera.camera2.pipe.internal.FrameState.ImageOutput) obj).getStreamId(), streamId)) {
                    arrayList.add(obj);
                }
            }
            java.util.ArrayList arrayList2 = new java.util.ArrayList();
            java.util.Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                androidx.camera.camera2.pipe.media.SharedOutputImage outputOrNull = ((androidx.camera.camera2.pipe.internal.FrameState.ImageOutput) it.next()).outputOrNull();
                if (outputOrNull != null) {
                    arrayList2.add(outputOrNull);
                }
            }
            return arrayList2;
        }
        return kotlin.collections.CollectionsKt.emptyList();
    }

    @Override // androidx.camera.camera2.pipe.FrameReference
    /* renamed from: imageStatus-Oo2lJfM */
    public final int mo510imageStatusOo2lJfM(int streamId) {
        if (this.getHighSpeedVideoFpsRanges.getValue() || !getImageStreams().contains(androidx.camera.camera2.pipe.StreamId.m755boximpl(streamId))) {
            return androidx.camera.camera2.pipe.OutputStatus.INSTANCE.m556getUNAVAILABLEU7r42EA();
        }
        java.util.List<androidx.camera.camera2.pipe.internal.FrameState.ImageOutput> imageOutputs = this.getHighSpeedVideoSizes.getImageOutputs();
        java.util.ArrayList arrayList = new java.util.ArrayList();
        for (java.lang.Object obj : imageOutputs) {
            if (androidx.camera.camera2.pipe.StreamId.m758equalsimpl0(((androidx.camera.camera2.pipe.internal.FrameState.ImageOutput) obj).getStreamId(), streamId)) {
                arrayList.add(obj);
            }
        }
        java.util.ArrayList arrayList2 = arrayList;
        java.util.ArrayList arrayList3 = new java.util.ArrayList(kotlin.collections.CollectionsKt.collectionSizeOrDefault(arrayList2, 10));
        java.util.Iterator it = arrayList2.iterator();
        while (it.hasNext()) {
            arrayList3.add(androidx.camera.camera2.pipe.OutputStatus.m543boximpl(((androidx.camera.camera2.pipe.internal.FrameState.ImageOutput) it.next()).m967getStatusU7r42EA()));
        }
        java.util.ArrayList arrayList4 = arrayList3;
        if (arrayList4.isEmpty()) {
            java.lang.StringBuilder sb = new java.lang.StringBuilder("No matching outputs found with ");
            sb.append((java.lang.Object) androidx.camera.camera2.pipe.StreamId.m760toStringimpl(streamId));
            sb.append(". This is unexpected.");
            throw new java.lang.IllegalStateException(sb.toString().toString());
        }
        if (arrayList4.size() == 1) {
            return ((androidx.camera.camera2.pipe.OutputStatus) arrayList4.get(0)).m549unboximpl();
        }
        java.util.ArrayList arrayList5 = arrayList4;
        java.util.ArrayList arrayList6 = arrayList5;
        if (!arrayList6.isEmpty()) {
            java.util.Iterator it2 = arrayList5.iterator();
            while (it2.hasNext()) {
                if (androidx.camera.camera2.pipe.OutputStatus.m546equalsimpl0(((androidx.camera.camera2.pipe.OutputStatus) it2.next()).m549unboximpl(), androidx.camera.camera2.pipe.OutputStatus.INSTANCE.m555getPENDINGU7r42EA())) {
                    return androidx.camera.camera2.pipe.OutputStatus.INSTANCE.m555getPENDINGU7r42EA();
                }
            }
        }
        if (!arrayList6.isEmpty()) {
            java.util.Iterator it3 = arrayList5.iterator();
            while (it3.hasNext()) {
                if (androidx.camera.camera2.pipe.OutputStatus.m546equalsimpl0(((androidx.camera.camera2.pipe.OutputStatus) it3.next()).m549unboximpl(), androidx.camera.camera2.pipe.OutputStatus.INSTANCE.m550getAVAILABLEU7r42EA())) {
                    return androidx.camera.camera2.pipe.OutputStatus.INSTANCE.m550getAVAILABLEU7r42EA();
                }
            }
        }
        if (!arrayList6.isEmpty()) {
            java.util.Iterator it4 = arrayList5.iterator();
            while (it4.hasNext()) {
                if (!androidx.camera.camera2.pipe.OutputStatus.m546equalsimpl0(((androidx.camera.camera2.pipe.OutputStatus) it4.next()).m549unboximpl(), ((androidx.camera.camera2.pipe.OutputStatus) kotlin.collections.CollectionsKt.first((java.util.List) arrayList4)).m549unboximpl())) {
                    return androidx.camera.camera2.pipe.OutputStatus.INSTANCE.m556getUNAVAILABLEU7r42EA();
                }
            }
        }
        return ((androidx.camera.camera2.pipe.OutputStatus) kotlin.collections.CollectionsKt.first((java.util.List) arrayList4)).m549unboximpl();
    }

    @Override // androidx.camera.camera2.pipe.FrameReference
    /* renamed from: imageStatus-BWjvHWQ */
    public final int mo509imageStatusBWjvHWQ(int outputId) {
        java.lang.Object obj;
        if (this.getHighSpeedVideoFpsRanges.getValue() || !this.getHighResolutionOutputSizeshNQ4ISI.contains(androidx.camera.camera2.pipe.OutputId.m536boximpl(outputId))) {
            return androidx.camera.camera2.pipe.OutputStatus.INSTANCE.m556getUNAVAILABLEU7r42EA();
        }
        java.util.Iterator<T> it = this.getHighSpeedVideoSizes.getImageOutputs().iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            }
            obj = it.next();
            if (androidx.camera.camera2.pipe.OutputId.m539equalsimpl0(((androidx.camera.camera2.pipe.internal.FrameState.ImageOutput) obj).getOutputId(), outputId)) {
                break;
            }
        }
        androidx.camera.camera2.pipe.internal.FrameState.ImageOutput imageOutput = (androidx.camera.camera2.pipe.internal.FrameState.ImageOutput) obj;
        return imageOutput != null ? imageOutput.m967getStatusU7r42EA() : androidx.camera.camera2.pipe.OutputStatus.INSTANCE.m556getUNAVAILABLEU7r42EA();
    }

    @Override // androidx.camera.camera2.pipe.Frame
    public final void addListener(androidx.camera.camera2.pipe.Frame.Listener listener) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(listener, "");
        if (this.getHighSpeedVideoFpsRanges.getValue()) {
            java.lang.StringBuilder sb = new java.lang.StringBuilder("Cannot add Frame.Listener, ");
            sb.append(this);
            sb.append(" is closed!");
            throw new java.lang.IllegalStateException(sb.toString().toString());
        }
        this.getHighSpeedVideoSizes.addListener(listener);
    }

    public final java.lang.String toString() {
        return this.getHighSpeedVideoSizes.toString();
    }
}
