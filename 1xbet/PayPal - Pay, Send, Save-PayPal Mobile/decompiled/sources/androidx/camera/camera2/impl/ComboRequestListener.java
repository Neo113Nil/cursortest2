package androidx.camera.camera2.impl;

@androidx.camera.camera2.config.CameraScope
@kotlin.Metadata(d1 = {"\u0000l\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010%\n\u0002\b\u0003\n\u0002\u0010$\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B\t\b\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u001d\u0010\b\u001a\u00020\u00072\u0006\u0010\u0004\u001a\u00020\u00012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\b\u0010\tJ\u0015\u0010\n\u001a\u00020\u00072\u0006\u0010\u0004\u001a\u00020\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0017\u0010\u000e\u001a\u00020\u00072\u0006\u0010\r\u001a\u00020\fH\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ/\u0010\u001a\u001a\u00020\u00072\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0017\u001a\u00020\u0016H\u0016¢\u0006\u0004\b\u0018\u0010\u0019J'\u0010\u001f\u001a\u00020\u00072\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u001c\u001a\u00020\u001bH\u0016¢\u0006\u0004\b\u001d\u0010\u001eJ'\u0010$\u001a\u00020\u00072\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010!\u001a\u00020 H\u0016¢\u0006\u0004\b\"\u0010#J'\u0010)\u001a\u00020\u00072\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010&\u001a\u00020%H\u0016¢\u0006\u0004\b'\u0010(J\u0017\u0010*\u001a\u00020\u00072\u0006\u0010\u0011\u001a\u00020\u0010H\u0016¢\u0006\u0004\b*\u0010+J\u001f\u0010.\u001a\u00020\u00072\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0013\u001a\u00020\u0012H\u0016¢\u0006\u0004\b,\u0010-J\u0017\u0010/\u001a\u00020\u00072\u0006\u0010\u0011\u001a\u00020\u0010H\u0016¢\u0006\u0004\b/\u0010+J\u0017\u00100\u001a\u00020\u00072\u0006\u0010\u0011\u001a\u00020\u0010H\u0016¢\u0006\u0004\b0\u0010+J'\u00105\u001a\u00020\u00072\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u00102\u001a\u000201H\u0016¢\u0006\u0004\b3\u00104J'\u00108\u001a\u00020\u00072\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u00106\u001a\u00020\u001bH\u0016¢\u0006\u0004\b7\u0010\u001eR \u0010<\u001a\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u0005098\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b:\u0010;R<\u0010?\u001a\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00050=2\u0012\u0010>\u001a\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00050=8\u0007@BX\u0086\u000e¢\u0006\f\n\u0004\b?\u0010;\u001a\u0004\b@\u0010A"}, d2 = {"Landroidx/camera/camera2/impl/ComboRequestListener;", "Landroidx/camera/camera2/pipe/Request$Listener;", "<init>", "()V", com.google.android.gms.common.internal.ServiceSpecificExtraArgs.CastExtraArgs.LISTENER, "Ljava/util/concurrent/Executor;", "executor", "", "addListener", "(Landroidx/camera/camera2/pipe/Request$Listener;Ljava/util/concurrent/Executor;)V", "removeListener", "(Landroidx/camera/camera2/pipe/Request$Listener;)V", "Landroidx/camera/camera2/pipe/Request;", "request", "onAborted", "(Landroidx/camera/camera2/pipe/Request;)V", "Landroidx/camera/camera2/pipe/RequestMetadata;", "requestMetadata", "Landroidx/camera/camera2/pipe/FrameNumber;", "frameNumber", "Landroidx/camera/camera2/pipe/StreamId;", "streamId", "Landroidx/camera/camera2/pipe/OutputId;", "outputId", "onBufferLost-iiEMlm4", "(Landroidx/camera/camera2/pipe/RequestMetadata;JII)V", "onBufferLost", "Landroidx/camera/camera2/pipe/FrameInfo;", "result", "onComplete-CcXjc1I", "(Landroidx/camera/camera2/pipe/RequestMetadata;JLandroidx/camera/camera2/pipe/FrameInfo;)V", "onComplete", "Landroidx/camera/camera2/pipe/RequestFailure;", "requestFailure", "onFailed-CcXjc1I", "(Landroidx/camera/camera2/pipe/RequestMetadata;JLandroidx/camera/camera2/pipe/RequestFailure;)V", "onFailed", "Landroidx/camera/camera2/pipe/FrameMetadata;", "captureResult", "onPartialCaptureResult-CcXjc1I", "(Landroidx/camera/camera2/pipe/RequestMetadata;JLandroidx/camera/camera2/pipe/FrameMetadata;)V", "onPartialCaptureResult", "onRequestSequenceAborted", "(Landroidx/camera/camera2/pipe/RequestMetadata;)V", "onRequestSequenceCompleted-RuT0dZU", "(Landroidx/camera/camera2/pipe/RequestMetadata;J)V", "onRequestSequenceCompleted", "onRequestSequenceCreated", "onRequestSequenceSubmitted", "Landroidx/camera/camera2/pipe/CameraTimestamp;", "timestamp", "onStarted-uGKBvU4", "(Landroidx/camera/camera2/pipe/RequestMetadata;JJ)V", "onStarted", "totalCaptureResult", "onTotalCaptureResult-CcXjc1I", "onTotalCaptureResult", "", "Camera2StreamConfigurationMap", "Ljava/util/Map;", "getHighSpeedVideoFpsRanges", "", "p0", "listeners", "getListeners", "()Ljava/util/Map;"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class ComboRequestListener implements androidx.camera.camera2.pipe.Request.Listener {

    /* renamed from: Camera2StreamConfigurationMap, reason: from kotlin metadata */
    private final java.util.Map<androidx.camera.camera2.pipe.Request.Listener, java.util.concurrent.Executor> getHighSpeedVideoFpsRanges = new java.util.LinkedHashMap();
    private volatile java.util.Map<androidx.camera.camera2.pipe.Request.Listener, ? extends java.util.concurrent.Executor> listeners = kotlin.collections.MapsKt.emptyMap();

    @javax.inject.Inject
    public ComboRequestListener() {
    }

    public final java.util.Map<androidx.camera.camera2.pipe.Request.Listener, java.util.concurrent.Executor> getListeners() {
        return this.listeners;
    }

    public final void addListener(androidx.camera.camera2.pipe.Request.Listener listener, java.util.concurrent.Executor executor) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(listener, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(executor, "");
        if (this.listeners.containsKey(listener)) {
            java.lang.StringBuilder sb = new java.lang.StringBuilder();
            sb.append(listener);
            sb.append(" was already registered!");
            throw new java.lang.IllegalStateException(sb.toString().toString());
        }
        synchronized (this.getHighSpeedVideoFpsRanges) {
            this.getHighSpeedVideoFpsRanges.put(listener, executor);
            this.listeners = kotlin.collections.MapsKt.toMap(this.getHighSpeedVideoFpsRanges);
            kotlin.Unit unit = kotlin.Unit.INSTANCE;
        }
    }

    public final void removeListener(androidx.camera.camera2.pipe.Request.Listener listener) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(listener, "");
        synchronized (this.getHighSpeedVideoFpsRanges) {
            this.getHighSpeedVideoFpsRanges.remove(listener);
            this.listeners = kotlin.collections.MapsKt.toMap(this.getHighSpeedVideoFpsRanges);
            kotlin.Unit unit = kotlin.Unit.INSTANCE;
        }
    }

    @Override // androidx.camera.camera2.pipe.Request.Listener
    public final void onAborted(final androidx.camera.camera2.pipe.Request request) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(request, "");
        for (java.util.Map.Entry<androidx.camera.camera2.pipe.Request.Listener, ? extends java.util.concurrent.Executor> entry : this.listeners.entrySet()) {
            final androidx.camera.camera2.pipe.Request.Listener key = entry.getKey();
            entry.getValue().execute(new java.lang.Runnable() { // from class: androidx.camera.camera2.impl.ComboRequestListener$$ExternalSyntheticLambda3
                @Override // java.lang.Runnable
                public final void run() {
                    androidx.camera.camera2.pipe.Request.Listener.this.onAborted(request);
                }
            });
        }
    }

    @Override // androidx.camera.camera2.pipe.Request.Listener
    /* renamed from: onBufferLost-iiEMlm4 */
    public final void mo92onBufferLostiiEMlm4(final androidx.camera.camera2.pipe.RequestMetadata requestMetadata, final long frameNumber, final int streamId, final int outputId) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(requestMetadata, "");
        for (java.util.Map.Entry<androidx.camera.camera2.pipe.Request.Listener, ? extends java.util.concurrent.Executor> entry : this.listeners.entrySet()) {
            final androidx.camera.camera2.pipe.Request.Listener key = entry.getKey();
            entry.getValue().execute(new java.lang.Runnable() { // from class: androidx.camera.camera2.impl.ComboRequestListener$$ExternalSyntheticLambda6
                @Override // java.lang.Runnable
                public final void run() {
                    androidx.camera.camera2.pipe.Request.Listener.this.mo92onBufferLostiiEMlm4(requestMetadata, frameNumber, streamId, outputId);
                }
            });
        }
    }

    @Override // androidx.camera.camera2.pipe.Request.Listener
    /* renamed from: onComplete-CcXjc1I */
    public final void mo36onCompleteCcXjc1I(final androidx.camera.camera2.pipe.RequestMetadata requestMetadata, final long frameNumber, final androidx.camera.camera2.pipe.FrameInfo result) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(requestMetadata, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(result, "");
        for (java.util.Map.Entry<androidx.camera.camera2.pipe.Request.Listener, ? extends java.util.concurrent.Executor> entry : this.listeners.entrySet()) {
            final androidx.camera.camera2.pipe.Request.Listener key = entry.getKey();
            entry.getValue().execute(new java.lang.Runnable() { // from class: androidx.camera.camera2.impl.ComboRequestListener$$ExternalSyntheticLambda1
                @Override // java.lang.Runnable
                public final void run() {
                    androidx.camera.camera2.pipe.Request.Listener.this.mo36onCompleteCcXjc1I(requestMetadata, frameNumber, result);
                }
            });
        }
    }

    @Override // androidx.camera.camera2.pipe.Request.Listener
    /* renamed from: onFailed-CcXjc1I */
    public final void mo37onFailedCcXjc1I(final androidx.camera.camera2.pipe.RequestMetadata requestMetadata, final long frameNumber, final androidx.camera.camera2.pipe.RequestFailure requestFailure) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(requestMetadata, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(requestFailure, "");
        for (java.util.Map.Entry<androidx.camera.camera2.pipe.Request.Listener, ? extends java.util.concurrent.Executor> entry : this.listeners.entrySet()) {
            final androidx.camera.camera2.pipe.Request.Listener key = entry.getKey();
            entry.getValue().execute(new java.lang.Runnable() { // from class: androidx.camera.camera2.impl.ComboRequestListener$$ExternalSyntheticLambda5
                @Override // java.lang.Runnable
                public final void run() {
                    androidx.camera.camera2.pipe.Request.Listener.this.mo37onFailedCcXjc1I(requestMetadata, frameNumber, requestFailure);
                }
            });
        }
    }

    @Override // androidx.camera.camera2.pipe.Request.Listener
    /* renamed from: onPartialCaptureResult-CcXjc1I */
    public final void mo93onPartialCaptureResultCcXjc1I(final androidx.camera.camera2.pipe.RequestMetadata requestMetadata, final long frameNumber, final androidx.camera.camera2.pipe.FrameMetadata captureResult) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(requestMetadata, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(captureResult, "");
        for (java.util.Map.Entry<androidx.camera.camera2.pipe.Request.Listener, ? extends java.util.concurrent.Executor> entry : this.listeners.entrySet()) {
            final androidx.camera.camera2.pipe.Request.Listener key = entry.getKey();
            entry.getValue().execute(new java.lang.Runnable() { // from class: androidx.camera.camera2.impl.ComboRequestListener$$ExternalSyntheticLambda7
                @Override // java.lang.Runnable
                public final void run() {
                    androidx.camera.camera2.pipe.Request.Listener.this.mo93onPartialCaptureResultCcXjc1I(requestMetadata, frameNumber, captureResult);
                }
            });
        }
    }

    @Override // androidx.camera.camera2.pipe.Request.Listener
    public final void onRequestSequenceAborted(final androidx.camera.camera2.pipe.RequestMetadata requestMetadata) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(requestMetadata, "");
        for (java.util.Map.Entry<androidx.camera.camera2.pipe.Request.Listener, ? extends java.util.concurrent.Executor> entry : this.listeners.entrySet()) {
            final androidx.camera.camera2.pipe.Request.Listener key = entry.getKey();
            entry.getValue().execute(new java.lang.Runnable() { // from class: androidx.camera.camera2.impl.ComboRequestListener$$ExternalSyntheticLambda0
                @Override // java.lang.Runnable
                public final void run() {
                    androidx.camera.camera2.pipe.Request.Listener.this.onRequestSequenceAborted(requestMetadata);
                }
            });
        }
    }

    @Override // androidx.camera.camera2.pipe.Request.Listener
    /* renamed from: onRequestSequenceCompleted-RuT0dZU */
    public final void mo95onRequestSequenceCompletedRuT0dZU(final androidx.camera.camera2.pipe.RequestMetadata requestMetadata, final long frameNumber) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(requestMetadata, "");
        for (java.util.Map.Entry<androidx.camera.camera2.pipe.Request.Listener, ? extends java.util.concurrent.Executor> entry : this.listeners.entrySet()) {
            final androidx.camera.camera2.pipe.Request.Listener key = entry.getKey();
            entry.getValue().execute(new java.lang.Runnable() { // from class: androidx.camera.camera2.impl.ComboRequestListener$$ExternalSyntheticLambda8
                @Override // java.lang.Runnable
                public final void run() {
                    androidx.camera.camera2.pipe.Request.Listener.this.mo95onRequestSequenceCompletedRuT0dZU(requestMetadata, frameNumber);
                }
            });
        }
    }

    @Override // androidx.camera.camera2.pipe.Request.Listener
    public final void onRequestSequenceCreated(final androidx.camera.camera2.pipe.RequestMetadata requestMetadata) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(requestMetadata, "");
        for (java.util.Map.Entry<androidx.camera.camera2.pipe.Request.Listener, ? extends java.util.concurrent.Executor> entry : this.listeners.entrySet()) {
            final androidx.camera.camera2.pipe.Request.Listener key = entry.getKey();
            entry.getValue().execute(new java.lang.Runnable() { // from class: androidx.camera.camera2.impl.ComboRequestListener$$ExternalSyntheticLambda2
                @Override // java.lang.Runnable
                public final void run() {
                    androidx.camera.camera2.pipe.Request.Listener.this.onRequestSequenceCreated(requestMetadata);
                }
            });
        }
    }

    @Override // androidx.camera.camera2.pipe.Request.Listener
    public final void onRequestSequenceSubmitted(final androidx.camera.camera2.pipe.RequestMetadata requestMetadata) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(requestMetadata, "");
        for (java.util.Map.Entry<androidx.camera.camera2.pipe.Request.Listener, ? extends java.util.concurrent.Executor> entry : this.listeners.entrySet()) {
            final androidx.camera.camera2.pipe.Request.Listener key = entry.getKey();
            entry.getValue().execute(new java.lang.Runnable() { // from class: androidx.camera.camera2.impl.ComboRequestListener$$ExternalSyntheticLambda10
                @Override // java.lang.Runnable
                public final void run() {
                    androidx.camera.camera2.pipe.Request.Listener.this.onRequestSequenceSubmitted(requestMetadata);
                }
            });
        }
    }

    @Override // androidx.camera.camera2.pipe.Request.Listener
    /* renamed from: onStarted-uGKBvU4 */
    public final void mo96onStarteduGKBvU4(final androidx.camera.camera2.pipe.RequestMetadata requestMetadata, final long frameNumber, final long timestamp) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(requestMetadata, "");
        for (java.util.Map.Entry<androidx.camera.camera2.pipe.Request.Listener, ? extends java.util.concurrent.Executor> entry : this.listeners.entrySet()) {
            final androidx.camera.camera2.pipe.Request.Listener key = entry.getKey();
            entry.getValue().execute(new java.lang.Runnable() { // from class: androidx.camera.camera2.impl.ComboRequestListener$$ExternalSyntheticLambda9
                @Override // java.lang.Runnable
                public final void run() {
                    androidx.camera.camera2.pipe.Request.Listener.this.mo96onStarteduGKBvU4(requestMetadata, frameNumber, timestamp);
                }
            });
        }
    }

    @Override // androidx.camera.camera2.pipe.Request.Listener
    /* renamed from: onTotalCaptureResult-CcXjc1I */
    public final void mo38onTotalCaptureResultCcXjc1I(final androidx.camera.camera2.pipe.RequestMetadata requestMetadata, final long frameNumber, final androidx.camera.camera2.pipe.FrameInfo totalCaptureResult) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(requestMetadata, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(totalCaptureResult, "");
        for (java.util.Map.Entry<androidx.camera.camera2.pipe.Request.Listener, ? extends java.util.concurrent.Executor> entry : this.listeners.entrySet()) {
            final androidx.camera.camera2.pipe.Request.Listener key = entry.getKey();
            entry.getValue().execute(new java.lang.Runnable() { // from class: androidx.camera.camera2.impl.ComboRequestListener$$ExternalSyntheticLambda4
                @Override // java.lang.Runnable
                public final void run() {
                    androidx.camera.camera2.pipe.Request.Listener.this.mo38onTotalCaptureResultCcXjc1I(requestMetadata, frameNumber, totalCaptureResult);
                }
            });
        }
    }
}
