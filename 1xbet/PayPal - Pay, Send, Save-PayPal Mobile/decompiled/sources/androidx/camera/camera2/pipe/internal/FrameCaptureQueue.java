package androidx.camera.camera2.pipe.internal;

@androidx.camera.camera2.pipe.config.CameraGraphScope
@kotlin.Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\b\u0001\u0018\u00002\u00060\u0001j\u0002`\u0002:\u0001\u0015B\t\b\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u0014\u0010\f\u001a\b\u0018\u00010\tR\u00020\u00002\u0006\u0010\r\u001a\u00020\u000eJ\u0012\u0010\u000f\u001a\u00060\tR\u00020\u00002\u0006\u0010\r\u001a\u00020\u000eJ\u001a\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00110\u00102\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u000e0\u0010J\b\u0010\u0013\u001a\u00020\u0014H\u0016R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u0004¢\u0006\u0002\n\u0000R\u001a\u0010\u0007\u001a\f\u0012\b\u0012\u00060\tR\u00020\u00000\b8\u0002X\u0083\u0004¢\u0006\u0002\n\u0000R\u0012\u0010\n\u001a\u00020\u000b8\u0002@\u0002X\u0083\u000e¢\u0006\u0002\n\u0000¨\u0006\u0016"}, d2 = {"Landroidx/camera/camera2/pipe/internal/FrameCaptureQueue;", "Ljava/lang/AutoCloseable;", "Lkotlin/AutoCloseable;", "<init>", "()V", "lock", "", "queue", "Lkotlin/collections/ArrayDeque;", "Landroidx/camera/camera2/pipe/internal/FrameCaptureQueue$FrameCaptureImpl;", com.paypal.oslo.feature.notificationcenter.analytics.NotificationCenterAnalyticsConstants.Action.CLOSED, "", "remove", "request", "Landroidx/camera/camera2/pipe/Request;", "enqueue", "", "Landroidx/camera/camera2/pipe/FrameCapture;", "requests", "close", "", "FrameCaptureImpl", "camera-camera2-pipe"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class FrameCaptureQueue implements java.lang.AutoCloseable {
    private boolean getHighResolutionOutputSizeshNQ4ISI;
    private final java.lang.Object getHighSpeedVideoFpsRangesFor = new java.lang.Object();
    private final kotlin.collections.ArrayDeque<androidx.camera.camera2.pipe.internal.FrameCaptureQueue.FrameCaptureImpl> Camera2StreamConfigurationMap = new kotlin.collections.ArrayDeque<>();

    @javax.inject.Inject
    public FrameCaptureQueue() {
    }

    public final androidx.camera.camera2.pipe.internal.FrameCaptureQueue.FrameCaptureImpl remove(androidx.camera.camera2.pipe.Request request) {
        androidx.camera.camera2.pipe.internal.FrameCaptureQueue.FrameCaptureImpl frameCaptureImpl;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(request, "");
        synchronized (this.getHighSpeedVideoFpsRangesFor) {
            androidx.camera.camera2.pipe.internal.FrameCaptureQueue.FrameCaptureImpl frameCaptureImpl2 = null;
            if (this.getHighResolutionOutputSizeshNQ4ISI) {
                return null;
            }
            java.util.Iterator<androidx.camera.camera2.pipe.internal.FrameCaptureQueue.FrameCaptureImpl> it = this.Camera2StreamConfigurationMap.iterator();
            while (true) {
                if (!it.hasNext()) {
                    frameCaptureImpl = null;
                    break;
                }
                frameCaptureImpl = it.next();
                if (kotlin.jvm.internal.Intrinsics.areEqual(frameCaptureImpl.getRequest(), request)) {
                    break;
                }
            }
            androidx.camera.camera2.pipe.internal.FrameCaptureQueue.FrameCaptureImpl frameCaptureImpl3 = frameCaptureImpl;
            if (frameCaptureImpl3 != null) {
                this.Camera2StreamConfigurationMap.remove(frameCaptureImpl3);
                frameCaptureImpl2 = frameCaptureImpl3;
            }
            return frameCaptureImpl2;
        }
    }

    public final androidx.camera.camera2.pipe.internal.FrameCaptureQueue.FrameCaptureImpl enqueue(androidx.camera.camera2.pipe.Request request) {
        androidx.camera.camera2.pipe.internal.FrameCaptureQueue.FrameCaptureImpl frameCaptureImpl;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(request, "");
        synchronized (this.getHighSpeedVideoFpsRangesFor) {
            frameCaptureImpl = new androidx.camera.camera2.pipe.internal.FrameCaptureQueue.FrameCaptureImpl(this, request);
            if (!this.getHighResolutionOutputSizeshNQ4ISI) {
                this.Camera2StreamConfigurationMap.add(frameCaptureImpl);
            } else {
                frameCaptureImpl.close();
            }
        }
        return frameCaptureImpl;
    }

    public final java.util.List<androidx.camera.camera2.pipe.FrameCapture> enqueue(java.util.List<androidx.camera.camera2.pipe.Request> requests) {
        java.util.ArrayList arrayList;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(requests, "");
        synchronized (this.getHighSpeedVideoFpsRangesFor) {
            java.util.List<androidx.camera.camera2.pipe.Request> list = requests;
            java.util.ArrayList arrayList2 = new java.util.ArrayList(kotlin.collections.CollectionsKt.collectionSizeOrDefault(list, 10));
            java.util.Iterator<T> it = list.iterator();
            while (it.hasNext()) {
                arrayList2.add(new androidx.camera.camera2.pipe.internal.FrameCaptureQueue.FrameCaptureImpl(this, (androidx.camera.camera2.pipe.Request) it.next()));
            }
            arrayList = arrayList2;
            if (!this.getHighResolutionOutputSizeshNQ4ISI) {
                this.Camera2StreamConfigurationMap.addAll(arrayList);
            } else {
                java.util.Iterator it2 = arrayList.iterator();
                while (it2.hasNext()) {
                    ((androidx.camera.camera2.pipe.internal.FrameCaptureQueue.FrameCaptureImpl) it2.next()).close();
                }
            }
        }
        return arrayList;
    }

    @Override // java.lang.AutoCloseable
    public final void close() {
        synchronized (this.getHighSpeedVideoFpsRangesFor) {
            if (this.getHighResolutionOutputSizeshNQ4ISI) {
                return;
            }
            this.getHighResolutionOutputSizeshNQ4ISI = true;
            kotlin.Unit unit = kotlin.Unit.INSTANCE;
            java.util.Iterator<androidx.camera.camera2.pipe.internal.FrameCaptureQueue.FrameCaptureImpl> it = this.Camera2StreamConfigurationMap.iterator();
            while (it.hasNext()) {
                it.next().m957completeWithFailuretXNfJfc(androidx.camera.camera2.pipe.OutputStatus.INSTANCE.m551getERROR_OUTPUT_ABORTEDU7r42EA());
            }
            this.Camera2StreamConfigurationMap.clear();
        }
    }

    @kotlin.Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010!\n\u0002\b\u0005\b\u0080\u0004\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0015\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\t\u0010\nJ\u0015\u0010\u000f\u001a\u00020\b2\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\r\u0010\u000eJ\u0011\u0010\u0010\u001a\u0004\u0018\u00010\u0006H\u0016¢\u0006\u0004\b\u0010\u0010\u0011J\u0012\u0010\u0012\u001a\u0004\u0018\u00010\u0006H\u0096@¢\u0006\u0004\b\u0012\u0010\u0013J\u0017\u0010\u0016\u001a\u00020\b2\u0006\u0010\u0015\u001a\u00020\u0014H\u0016¢\u0006\u0004\b\u0016\u0010\u0017J\u000f\u0010\u0018\u001a\u00020\bH\u0016¢\u0006\u0004\b\u0018\u0010\u0019R\u001a\u0010\u0003\u001a\u00020\u00028\u0017X\u0096\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u001a\u001a\u0004\b\u001b\u0010\u001cR\u0014\u0010 \u001a\u00020\u001d8\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\u001e\u0010\u001fR \u0010$\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060\"0!8\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b \u0010#R\u001e\u0010\u001e\u001a\n\u0012\u0004\u0012\u00020\u0014\u0018\u00010%8\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b&\u0010'R\u0014\u0010*\u001a\u00020\u000b8WX\u0096\u0004¢\u0006\u0006\u001a\u0004\b(\u0010)"}, d2 = {"Landroidx/camera/camera2/pipe/internal/FrameCaptureQueue$FrameCaptureImpl;", "Landroidx/camera/camera2/pipe/FrameCapture;", "Landroidx/camera/camera2/pipe/Request;", "request", "<init>", "(Landroidx/camera/camera2/pipe/internal/FrameCaptureQueue;Landroidx/camera/camera2/pipe/Request;)V", "Landroidx/camera/camera2/pipe/Frame;", androidx.constraintlayout.core.motion.utils.TypedValues.AttributesType.S_FRAME, "", "completeWith", "(Landroidx/camera/camera2/pipe/Frame;)V", "Landroidx/camera/camera2/pipe/OutputStatus;", "failureStatus", "completeWithFailure-tXNfJfc", "(I)V", "completeWithFailure", "getFrame", "()Landroidx/camera/camera2/pipe/Frame;", "awaitFrame", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Landroidx/camera/camera2/pipe/Frame$Listener;", com.google.android.gms.common.internal.ServiceSpecificExtraArgs.CastExtraArgs.LISTENER, "addListener", "(Landroidx/camera/camera2/pipe/Frame$Listener;)V", "close", "()V", "Landroidx/camera/camera2/pipe/Request;", "getRequest", "()Landroidx/camera/camera2/pipe/Request;", "Lkotlinx/atomicfu/AtomicBoolean;", "getHighResolutionOutputSizeshNQ4ISI", "Lkotlinx/atomicfu/AtomicBoolean;", "getHighSpeedVideoFpsRanges", "Lkotlinx/coroutines/CompletableDeferred;", "Landroidx/camera/camera2/pipe/internal/OutputResult;", "Lkotlinx/coroutines/CompletableDeferred;", "getHighSpeedVideoSizes", "", "getHighSpeedVideoFpsRangesFor", "Ljava/util/List;", "getStatus-U7r42EA", "()I", "status"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public final class FrameCaptureImpl implements androidx.camera.camera2.pipe.FrameCapture {
        final /* synthetic */ androidx.camera.camera2.pipe.internal.FrameCaptureQueue Camera2StreamConfigurationMap;

        /* renamed from: getHighResolutionOutputSizeshNQ4ISI, reason: from kotlin metadata */
        private final kotlinx.atomicfu.AtomicBoolean getHighSpeedVideoFpsRanges;

        /* renamed from: getHighSpeedVideoFpsRanges, reason: from kotlin metadata */
        private final kotlinx.coroutines.CompletableDeferred<androidx.camera.camera2.pipe.internal.OutputResult<androidx.camera.camera2.pipe.Frame>> getHighSpeedVideoSizes;

        /* renamed from: getHighSpeedVideoFpsRangesFor, reason: from kotlin metadata */
        private java.util.List<androidx.camera.camera2.pipe.Frame.Listener> getHighResolutionOutputSizeshNQ4ISI;
        private final androidx.camera.camera2.pipe.Request request;

        public FrameCaptureImpl(androidx.camera.camera2.pipe.internal.FrameCaptureQueue frameCaptureQueue, androidx.camera.camera2.pipe.Request request) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(request, "");
            this.Camera2StreamConfigurationMap = frameCaptureQueue;
            this.request = request;
            this.getHighSpeedVideoFpsRanges = kotlinx.atomicfu.AtomicFU.atomic(false);
            this.getHighSpeedVideoSizes = kotlinx.coroutines.CompletableDeferredKt.CompletableDeferred$default(null, 1, null);
            this.getHighResolutionOutputSizeshNQ4ISI = new java.util.ArrayList();
        }

        @Override // androidx.camera.camera2.pipe.FrameCapture
        public final androidx.camera.camera2.pipe.Request getRequest() {
            return this.request;
        }

        public final void completeWith(androidx.camera.camera2.pipe.Frame frame) {
            java.util.List<androidx.camera.camera2.pipe.Frame.Listener> list;
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(frame, "");
            androidx.camera.camera2.pipe.internal.OutputResult.Companion companion = androidx.camera.camera2.pipe.internal.OutputResult.INSTANCE;
            if (!this.getHighSpeedVideoSizes.complete(androidx.camera.camera2.pipe.internal.OutputResult.m980boximpl(androidx.camera.camera2.pipe.internal.OutputResult.m979access$constructorimpl(frame)))) {
                frame.close();
                return;
            }
            synchronized (this) {
                list = this.getHighResolutionOutputSizeshNQ4ISI;
                this.getHighResolutionOutputSizeshNQ4ISI = null;
                kotlin.Unit unit = kotlin.Unit.INSTANCE;
            }
            if (list != null) {
                int size = list.size();
                for (int i = 0; i < size; i++) {
                    frame.addListener(list.get(i));
                }
            }
        }

        /* renamed from: completeWithFailure-tXNfJfc, reason: not valid java name */
        public final void m957completeWithFailuretXNfJfc(int failureStatus) {
            java.util.List<androidx.camera.camera2.pipe.Frame.Listener> list;
            androidx.camera.camera2.pipe.internal.OutputResult.Companion companion = androidx.camera.camera2.pipe.internal.OutputResult.INSTANCE;
            if (this.getHighSpeedVideoSizes.complete(androidx.camera.camera2.pipe.internal.OutputResult.m980boximpl(androidx.camera.camera2.pipe.internal.OutputResult.m979access$constructorimpl(androidx.camera.camera2.pipe.OutputStatus.m543boximpl(failureStatus))))) {
                synchronized (this) {
                    list = this.getHighResolutionOutputSizeshNQ4ISI;
                    this.getHighResolutionOutputSizeshNQ4ISI = null;
                    kotlin.Unit unit = kotlin.Unit.INSTANCE;
                }
                if (list != null) {
                    int size = list.size();
                    for (int i = 0; i < size; i++) {
                        list.get(i).onFrameComplete();
                    }
                }
            }
        }

        /* JADX WARN: Code restructure failed: missing block: B:10:0x002a, code lost:
        
            if (androidx.camera.camera2.pipe.internal.OutputResult.m983getAvailableimpl(r0) == false) goto L11;
         */
        @Override // androidx.camera.camera2.pipe.FrameCapture
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final androidx.camera.camera2.pipe.Frame getFrame() {
            java.lang.Object obj;
            if (this.getHighSpeedVideoFpsRanges.getValue()) {
                return null;
            }
            androidx.camera.camera2.pipe.internal.OutputResult.Companion companion = androidx.camera.camera2.pipe.internal.OutputResult.INSTANCE;
            kotlinx.coroutines.CompletableDeferred<androidx.camera.camera2.pipe.internal.OutputResult<androidx.camera.camera2.pipe.Frame>> completableDeferred = this.getHighSpeedVideoSizes;
            if (completableDeferred.isCompleted() && !completableDeferred.isCancelled()) {
                obj = completableDeferred.getCompleted().getGetHighSpeedVideoSizes();
            }
            obj = null;
            androidx.camera.camera2.pipe.Frame frame = (androidx.camera.camera2.pipe.Frame) obj;
            if (frame != null) {
                return androidx.camera.camera2.pipe.FrameReference.tryAcquire$default(frame, null, 1, null);
            }
            return null;
        }

        @Override // androidx.camera.camera2.pipe.FrameCapture
        /* renamed from: getStatus-U7r42EA */
        public final int mo484getStatusU7r42EA() {
            if (this.getHighSpeedVideoFpsRanges.getValue()) {
                return androidx.camera.camera2.pipe.OutputStatus.INSTANCE.m556getUNAVAILABLEU7r42EA();
            }
            androidx.camera.camera2.pipe.internal.OutputResult.Companion companion = androidx.camera.camera2.pipe.internal.OutputResult.INSTANCE;
            kotlinx.coroutines.CompletableDeferred<androidx.camera.camera2.pipe.internal.OutputResult<androidx.camera.camera2.pipe.Frame>> completableDeferred = this.getHighSpeedVideoSizes;
            if (!completableDeferred.isCompleted()) {
                return androidx.camera.camera2.pipe.OutputStatus.INSTANCE.m555getPENDINGU7r42EA();
            }
            if (completableDeferred.isCancelled()) {
                return androidx.camera.camera2.pipe.OutputStatus.INSTANCE.m556getUNAVAILABLEU7r42EA();
            }
            java.lang.Object getHighSpeedVideoSizes = completableDeferred.getCompleted().getGetHighSpeedVideoSizes();
            if (androidx.camera.camera2.pipe.internal.OutputResult.m983getAvailableimpl(getHighSpeedVideoSizes)) {
                return androidx.camera.camera2.pipe.OutputStatus.INSTANCE.m550getAVAILABLEU7r42EA();
            }
            if (getHighSpeedVideoSizes == null) {
                return androidx.camera.camera2.pipe.OutputStatus.INSTANCE.m556getUNAVAILABLEU7r42EA();
            }
            return ((androidx.camera.camera2.pipe.OutputStatus) getHighSpeedVideoSizes).m549unboximpl();
        }

        /* JADX WARN: Removed duplicated region for block: B:12:0x0056  */
        /* JADX WARN: Removed duplicated region for block: B:15:0x005b  */
        /* JADX WARN: Removed duplicated region for block: B:18:0x0062 A[RETURN] */
        /* JADX WARN: Removed duplicated region for block: B:21:0x0033  */
        /* JADX WARN: Removed duplicated region for block: B:8:0x0025  */
        @Override // androidx.camera.camera2.pipe.FrameCapture
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final java.lang.Object awaitFrame(kotlin.coroutines.Continuation<? super androidx.camera.camera2.pipe.Frame> continuation) {
            androidx.camera.camera2.pipe.internal.FrameCaptureQueue$FrameCaptureImpl$awaitFrame$1 frameCaptureQueue$FrameCaptureImpl$awaitFrame$1;
            int i;
            java.lang.Object getHighSpeedVideoSizes;
            androidx.camera.camera2.pipe.Frame frame;
            if (continuation instanceof androidx.camera.camera2.pipe.internal.FrameCaptureQueue$FrameCaptureImpl$awaitFrame$1) {
                frameCaptureQueue$FrameCaptureImpl$awaitFrame$1 = (androidx.camera.camera2.pipe.internal.FrameCaptureQueue$FrameCaptureImpl$awaitFrame$1) continuation;
                if ((frameCaptureQueue$FrameCaptureImpl$awaitFrame$1.Camera2StreamConfigurationMap & Integer.MIN_VALUE) != 0) {
                    frameCaptureQueue$FrameCaptureImpl$awaitFrame$1.Camera2StreamConfigurationMap -= 2147483648;
                    java.lang.Object obj = frameCaptureQueue$FrameCaptureImpl$awaitFrame$1.getHighSpeedVideoFpsRangesFor;
                    java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    i = frameCaptureQueue$FrameCaptureImpl$awaitFrame$1.Camera2StreamConfigurationMap;
                    if (i != 0) {
                        kotlin.ResultKt.throwOnFailure(obj);
                        if (this.getHighSpeedVideoFpsRanges.getValue()) {
                            return null;
                        }
                        kotlinx.coroutines.CompletableDeferred<androidx.camera.camera2.pipe.internal.OutputResult<androidx.camera.camera2.pipe.Frame>> completableDeferred = this.getHighSpeedVideoSizes;
                        frameCaptureQueue$FrameCaptureImpl$awaitFrame$1.Camera2StreamConfigurationMap = 1;
                        obj = completableDeferred.await(frameCaptureQueue$FrameCaptureImpl$awaitFrame$1);
                        if (obj == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                    } else {
                        if (i != 1) {
                            throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        kotlin.ResultKt.throwOnFailure(obj);
                    }
                    getHighSpeedVideoSizes = ((androidx.camera.camera2.pipe.internal.OutputResult) obj).getGetHighSpeedVideoSizes();
                    if (!androidx.camera.camera2.pipe.internal.OutputResult.m983getAvailableimpl(getHighSpeedVideoSizes)) {
                        getHighSpeedVideoSizes = null;
                    }
                    frame = (androidx.camera.camera2.pipe.Frame) getHighSpeedVideoSizes;
                    if (frame == null) {
                        return androidx.camera.camera2.pipe.FrameReference.tryAcquire$default(frame, null, 1, null);
                    }
                    return null;
                }
            }
            frameCaptureQueue$FrameCaptureImpl$awaitFrame$1 = new androidx.camera.camera2.pipe.internal.FrameCaptureQueue$FrameCaptureImpl$awaitFrame$1(this, continuation);
            java.lang.Object obj2 = frameCaptureQueue$FrameCaptureImpl$awaitFrame$1.getHighSpeedVideoFpsRangesFor;
            java.lang.Object coroutine_suspended2 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
            i = frameCaptureQueue$FrameCaptureImpl$awaitFrame$1.Camera2StreamConfigurationMap;
            if (i != 0) {
            }
            getHighSpeedVideoSizes = ((androidx.camera.camera2.pipe.internal.OutputResult) obj2).getGetHighSpeedVideoSizes();
            if (!androidx.camera.camera2.pipe.internal.OutputResult.m983getAvailableimpl(getHighSpeedVideoSizes)) {
            }
            frame = (androidx.camera.camera2.pipe.Frame) getHighSpeedVideoSizes;
            if (frame == null) {
            }
        }

        @Override // androidx.camera.camera2.pipe.FrameCapture
        public final void addListener(androidx.camera.camera2.pipe.Frame.Listener listener) {
            boolean z;
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(listener, "");
            synchronized (this) {
                java.util.List<androidx.camera.camera2.pipe.Frame.Listener> list = this.getHighResolutionOutputSizeshNQ4ISI;
                z = false;
                if (list != null) {
                    if (list.add(listener)) {
                        z = true;
                    }
                }
            }
            if (z) {
                return;
            }
            androidx.camera.camera2.pipe.internal.OutputResult.Companion companion = androidx.camera.camera2.pipe.internal.OutputResult.INSTANCE;
            kotlinx.coroutines.CompletableDeferred<androidx.camera.camera2.pipe.internal.OutputResult<androidx.camera.camera2.pipe.Frame>> completableDeferred = this.getHighSpeedVideoSizes;
            java.lang.Object obj = null;
            if (completableDeferred.isCompleted() && !completableDeferred.isCancelled()) {
                java.lang.Object getHighSpeedVideoSizes = completableDeferred.getCompleted().getGetHighSpeedVideoSizes();
                if (androidx.camera.camera2.pipe.internal.OutputResult.m983getAvailableimpl(getHighSpeedVideoSizes)) {
                    obj = getHighSpeedVideoSizes;
                }
            }
            androidx.camera.camera2.pipe.Frame frame = (androidx.camera.camera2.pipe.Frame) obj;
            if (frame != null) {
                frame.addListener(listener);
            } else {
                listener.onFrameComplete();
            }
        }

        @Override // java.lang.AutoCloseable
        public final void close() {
            if (this.getHighSpeedVideoFpsRanges.compareAndSet(false, true)) {
                m957completeWithFailuretXNfJfc(androidx.camera.camera2.pipe.OutputStatus.INSTANCE.m556getUNAVAILABLEU7r42EA());
                androidx.camera.camera2.pipe.internal.OutputResult.Companion companion = androidx.camera.camera2.pipe.internal.OutputResult.INSTANCE;
                kotlinx.coroutines.CompletableDeferred<androidx.camera.camera2.pipe.internal.OutputResult<androidx.camera.camera2.pipe.Frame>> completableDeferred = this.getHighSpeedVideoSizes;
                java.lang.Object obj = null;
                if (completableDeferred.isCompleted() && !completableDeferred.isCancelled()) {
                    java.lang.Object getHighSpeedVideoSizes = completableDeferred.getCompleted().getGetHighSpeedVideoSizes();
                    if (androidx.camera.camera2.pipe.internal.OutputResult.m983getAvailableimpl(getHighSpeedVideoSizes)) {
                        obj = getHighSpeedVideoSizes;
                    }
                }
                androidx.camera.camera2.pipe.Frame frame = (androidx.camera.camera2.pipe.Frame) obj;
                if (frame != null) {
                    frame.close();
                }
                java.lang.Object obj2 = this.Camera2StreamConfigurationMap.getHighSpeedVideoFpsRangesFor;
                androidx.camera.camera2.pipe.internal.FrameCaptureQueue frameCaptureQueue = this.Camera2StreamConfigurationMap;
                synchronized (obj2) {
                    frameCaptureQueue.Camera2StreamConfigurationMap.remove(this);
                }
            }
        }
    }
}
