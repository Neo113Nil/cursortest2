package androidx.camera.camera2.pipe.framegraph;

@kotlin.Metadata(d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010!\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0015\u0010\b\u001a\u00020\u00072\u0006\u0010\u0006\u001a\u00020\u0001¢\u0006\u0004\b\b\u0010\tJ\u0012\u0010\u000b\u001a\u0004\u0018\u00010\nH\u0096@¢\u0006\u0004\b\u000b\u0010\fJ\u0011\u0010\r\u001a\u0004\u0018\u00010\nH\u0016¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u0011\u001a\u00020\u00072\u0006\u0010\u0010\u001a\u00020\u000fH\u0016¢\u0006\u0004\b\u0011\u0010\u0012J\u000f\u0010\u0013\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\u0013\u0010\u0014J\r\u0010\u0015\u001a\u00020\u0007¢\u0006\u0004\b\u0015\u0010\u0014J\u0017\u0010\u0018\u001a\u00020\u00072\u0006\u0010\u0017\u001a\u00020\u0016H\u0002¢\u0006\u0004\b\u0018\u0010\u0019R\u001a\u0010\u0003\u001a\u00020\u00028\u0017X\u0097\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u001a\u001a\u0004\b\u001b\u0010\u001cR\u0014\u0010 \u001a\u00020\u001d8\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\u001e\u0010\u001fR\u001c\u0010\u001e\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00010!8\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\"R\u0016\u0010%\u001a\u00020\u00168\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b#\u0010$R\u0016\u0010#\u001a\u00020\u00168\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b%\u0010$R\u001e\u0010\u0018\u001a\n\u0012\u0004\u0012\u00020\u000f\u0018\u00010&8\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b \u0010'R\u0014\u0010+\u001a\u00020(8WX\u0096\u0004¢\u0006\u0006\u001a\u0004\b)\u0010*"}, d2 = {"Landroidx/camera/camera2/pipe/framegraph/PendingFrameCapture;", "Landroidx/camera/camera2/pipe/FrameCapture;", "Landroidx/camera/camera2/pipe/Request;", "request", "<init>", "(Landroidx/camera/camera2/pipe/Request;)V", "frameCapture", "", "setFrameCapture", "(Landroidx/camera/camera2/pipe/FrameCapture;)V", "Landroidx/camera/camera2/pipe/Frame;", "awaitFrame", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getFrame", "()Landroidx/camera/camera2/pipe/Frame;", "Landroidx/camera/camera2/pipe/Frame$Listener;", com.google.android.gms.common.internal.ServiceSpecificExtraArgs.CastExtraArgs.LISTENER, "addListener", "(Landroidx/camera/camera2/pipe/Frame$Listener;)V", "close", "()V", "abort", "", "p0", "getHighSpeedVideoFpsRanges", "(Z)V", "Landroidx/camera/camera2/pipe/Request;", "getRequest", "()Landroidx/camera/camera2/pipe/Request;", "", "getHighResolutionOutputSizeshNQ4ISI", "Ljava/lang/Object;", "getHighSpeedVideoSizes", "Lkotlinx/coroutines/CompletableDeferred;", "Lkotlinx/coroutines/CompletableDeferred;", "Camera2StreamConfigurationMap", "Z", "getHighSpeedVideoFpsRangesFor", "", "Ljava/util/List;", "Landroidx/camera/camera2/pipe/OutputStatus;", "getStatus-U7r42EA", "()I", "status"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class PendingFrameCapture implements androidx.camera.camera2.pipe.FrameCapture {

    /* renamed from: Camera2StreamConfigurationMap, reason: from kotlin metadata */
    private boolean getHighSpeedVideoFpsRangesFor;

    /* renamed from: getHighResolutionOutputSizeshNQ4ISI, reason: from kotlin metadata */
    private final java.lang.Object getHighSpeedVideoSizes;

    /* renamed from: getHighSpeedVideoFpsRanges, reason: from kotlin metadata */
    private final kotlinx.coroutines.CompletableDeferred<androidx.camera.camera2.pipe.FrameCapture> getHighResolutionOutputSizeshNQ4ISI;

    /* renamed from: getHighSpeedVideoFpsRangesFor, reason: from kotlin metadata */
    private boolean Camera2StreamConfigurationMap;

    /* renamed from: getHighSpeedVideoSizes, reason: from kotlin metadata */
    private java.util.List<androidx.camera.camera2.pipe.Frame.Listener> getHighSpeedVideoFpsRanges;
    private final androidx.camera.camera2.pipe.Request request;

    public PendingFrameCapture(androidx.camera.camera2.pipe.Request request) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(request, "");
        this.request = request;
        this.getHighSpeedVideoSizes = new java.lang.Object();
        this.getHighResolutionOutputSizeshNQ4ISI = kotlinx.coroutines.CompletableDeferredKt.CompletableDeferred$default(null, 1, null);
        this.getHighSpeedVideoFpsRanges = new java.util.ArrayList();
    }

    @Override // androidx.camera.camera2.pipe.FrameCapture
    public final androidx.camera.camera2.pipe.Request getRequest() {
        return this.request;
    }

    public final void setFrameCapture(androidx.camera.camera2.pipe.FrameCapture frameCapture) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(frameCapture, "");
        synchronized (this.getHighSpeedVideoSizes) {
            if (!this.getHighSpeedVideoFpsRangesFor && !this.Camera2StreamConfigurationMap) {
                if (!this.getHighResolutionOutputSizeshNQ4ISI.complete(frameCapture)) {
                    frameCapture.close();
                    return;
                }
                java.util.List<androidx.camera.camera2.pipe.Frame.Listener> list = this.getHighSpeedVideoFpsRanges;
                this.getHighSpeedVideoFpsRanges = null;
                kotlin.Unit unit = kotlin.Unit.INSTANCE;
                if (list != null) {
                    java.util.Iterator<androidx.camera.camera2.pipe.Frame.Listener> it = list.iterator();
                    while (it.hasNext()) {
                        frameCapture.addListener(it.next());
                    }
                    return;
                }
                return;
            }
            frameCapture.close();
        }
    }

    @Override // androidx.camera.camera2.pipe.FrameCapture
    /* renamed from: getStatus-U7r42EA */
    public final int mo484getStatusU7r42EA() {
        int m556getUNAVAILABLEU7r42EA;
        androidx.camera.camera2.pipe.FrameCapture completed;
        synchronized (this.getHighSpeedVideoSizes) {
            if (this.getHighResolutionOutputSizeshNQ4ISI.isCompleted() && (completed = this.getHighResolutionOutputSizeshNQ4ISI.getCompleted()) != null) {
                return completed.mo484getStatusU7r42EA();
            }
            if (this.Camera2StreamConfigurationMap) {
                m556getUNAVAILABLEU7r42EA = androidx.camera.camera2.pipe.OutputStatus.INSTANCE.m551getERROR_OUTPUT_ABORTEDU7r42EA();
            } else {
                m556getUNAVAILABLEU7r42EA = this.getHighSpeedVideoFpsRangesFor ? androidx.camera.camera2.pipe.OutputStatus.INSTANCE.m556getUNAVAILABLEU7r42EA() : androidx.camera.camera2.pipe.OutputStatus.INSTANCE.m555getPENDINGU7r42EA();
            }
            return m556getUNAVAILABLEU7r42EA;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:24:0x0044, code lost:
    
        if (r6 != r1) goto L19;
     */
    /* JADX WARN: Removed duplicated region for block: B:18:0x004a  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0054 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0039  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0025  */
    @Override // androidx.camera.camera2.pipe.FrameCapture
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object awaitFrame(kotlin.coroutines.Continuation<? super androidx.camera.camera2.pipe.Frame> continuation) {
        androidx.camera.camera2.pipe.framegraph.PendingFrameCapture$awaitFrame$1 pendingFrameCapture$awaitFrame$1;
        int i;
        androidx.camera.camera2.pipe.FrameCapture frameCapture;
        if (continuation instanceof androidx.camera.camera2.pipe.framegraph.PendingFrameCapture$awaitFrame$1) {
            pendingFrameCapture$awaitFrame$1 = (androidx.camera.camera2.pipe.framegraph.PendingFrameCapture$awaitFrame$1) continuation;
            if ((pendingFrameCapture$awaitFrame$1.getHighSpeedVideoFpsRangesFor & Integer.MIN_VALUE) != 0) {
                pendingFrameCapture$awaitFrame$1.getHighSpeedVideoFpsRangesFor -= 2147483648;
                java.lang.Object obj = pendingFrameCapture$awaitFrame$1.Camera2StreamConfigurationMap;
                java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = pendingFrameCapture$awaitFrame$1.getHighSpeedVideoFpsRangesFor;
                if (i != 0) {
                    kotlin.ResultKt.throwOnFailure(obj);
                    kotlinx.coroutines.CompletableDeferred<androidx.camera.camera2.pipe.FrameCapture> completableDeferred = this.getHighResolutionOutputSizeshNQ4ISI;
                    pendingFrameCapture$awaitFrame$1.getHighSpeedVideoFpsRangesFor = 1;
                    obj = completableDeferred.await(pendingFrameCapture$awaitFrame$1);
                } else {
                    if (i != 1) {
                        if (i != 2) {
                            throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        kotlin.ResultKt.throwOnFailure(obj);
                        return obj;
                    }
                    kotlin.ResultKt.throwOnFailure(obj);
                }
                frameCapture = (androidx.camera.camera2.pipe.FrameCapture) obj;
                if (frameCapture != null) {
                    return null;
                }
                pendingFrameCapture$awaitFrame$1.getHighSpeedVideoFpsRangesFor = 2;
                java.lang.Object awaitFrame = frameCapture.awaitFrame(pendingFrameCapture$awaitFrame$1);
                return awaitFrame == coroutine_suspended ? coroutine_suspended : awaitFrame;
            }
        }
        pendingFrameCapture$awaitFrame$1 = new androidx.camera.camera2.pipe.framegraph.PendingFrameCapture$awaitFrame$1(this, continuation);
        java.lang.Object obj2 = pendingFrameCapture$awaitFrame$1.Camera2StreamConfigurationMap;
        java.lang.Object coroutine_suspended2 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = pendingFrameCapture$awaitFrame$1.getHighSpeedVideoFpsRangesFor;
        if (i != 0) {
        }
        frameCapture = (androidx.camera.camera2.pipe.FrameCapture) obj2;
        if (frameCapture != null) {
        }
    }

    @Override // androidx.camera.camera2.pipe.FrameCapture
    public final androidx.camera.camera2.pipe.Frame getFrame() {
        androidx.camera.camera2.pipe.FrameCapture completed;
        if (!this.getHighResolutionOutputSizeshNQ4ISI.isCompleted() || (completed = this.getHighResolutionOutputSizeshNQ4ISI.getCompleted()) == null) {
            return null;
        }
        return completed.getFrame();
    }

    @Override // androidx.camera.camera2.pipe.FrameCapture
    public final void addListener(androidx.camera.camera2.pipe.Frame.Listener listener) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(listener, "");
        synchronized (this.getHighSpeedVideoSizes) {
            if (!this.getHighSpeedVideoFpsRangesFor && !this.Camera2StreamConfigurationMap) {
                if (!this.getHighResolutionOutputSizeshNQ4ISI.isCompleted()) {
                    java.util.List<androidx.camera.camera2.pipe.Frame.Listener> list = this.getHighSpeedVideoFpsRanges;
                    if (list != null) {
                        list.add(listener);
                    }
                    return;
                } else {
                    androidx.camera.camera2.pipe.FrameCapture completed = this.getHighResolutionOutputSizeshNQ4ISI.getCompleted();
                    kotlin.Unit unit = kotlin.Unit.INSTANCE;
                    androidx.camera.camera2.pipe.FrameCapture frameCapture = completed;
                    if (frameCapture != null) {
                        frameCapture.addListener(listener);
                        return;
                    }
                    return;
                }
            }
            listener.onFrameComplete();
        }
    }

    @Override // java.lang.AutoCloseable
    public final void close() {
        getHighSpeedVideoFpsRanges(true);
    }

    public final void abort() {
        getHighSpeedVideoFpsRanges(false);
    }

    /* JADX WARN: Type inference failed for: r4v3, types: [T, java.util.List<androidx.camera.camera2.pipe.Frame$Listener>] */
    private final void getHighSpeedVideoFpsRanges(boolean p0) {
        kotlin.jvm.internal.Ref.ObjectRef objectRef = new kotlin.jvm.internal.Ref.ObjectRef();
        synchronized (this.getHighSpeedVideoSizes) {
            if (!this.getHighSpeedVideoFpsRangesFor && !this.Camera2StreamConfigurationMap) {
                if (p0) {
                    this.getHighSpeedVideoFpsRangesFor = true;
                } else {
                    this.Camera2StreamConfigurationMap = true;
                }
                this.getHighResolutionOutputSizeshNQ4ISI.complete(null);
                ?? r4 = this.getHighSpeedVideoFpsRanges;
                this.getHighSpeedVideoFpsRanges = null;
                objectRef.element = r4;
                androidx.camera.camera2.pipe.FrameCapture completed = this.getHighResolutionOutputSizeshNQ4ISI.getCompleted();
                kotlin.Unit unit = kotlin.Unit.INSTANCE;
                if (objectRef.element != 0) {
                    java.util.Iterator it = ((java.util.List) objectRef.element).iterator();
                    while (it.hasNext()) {
                        ((androidx.camera.camera2.pipe.Frame.Listener) it.next()).onFrameComplete();
                    }
                }
                androidx.camera.camera2.pipe.FrameCapture frameCapture = completed;
                if (frameCapture != null) {
                    frameCapture.close();
                }
            }
        }
    }
}
