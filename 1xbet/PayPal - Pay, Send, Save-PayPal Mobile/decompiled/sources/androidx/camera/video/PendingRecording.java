package androidx.camera.video;

@kotlin.Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0013\u0018\u00002\u00020\u0001B!\b\u0000\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u000f\u0010\n\u001a\u00020\u0002H\u0000¢\u0006\u0004\b\n\u0010\u000bJ\u000f\u0010\f\u001a\u00020\u0004H\u0000¢\u0006\u0004\b\f\u0010\rJ\u000f\u0010\u000e\u001a\u00020\u0006H\u0000¢\u0006\u0004\b\u000e\u0010\u000fJ\u0011\u0010\u0011\u001a\u0004\u0018\u00010\u0010H\u0000¢\u0006\u0004\b\u0011\u0010\u0012J\u0017\u0010\u0015\u001a\n\u0012\u0004\u0012\u00020\u0014\u0018\u00010\u0013H\u0000¢\u0006\u0004\b\u0015\u0010\u0016J\u000f\u0010\u0018\u001a\u00020\u0017H\u0000¢\u0006\u0004\b\u0018\u0010\u0019J\u000f\u0010\u001a\u001a\u00020\u0017H\u0000¢\u0006\u0004\b\u001a\u0010\u0019J\u000f\u0010\u001b\u001a\u00020\u0017H\u0000¢\u0006\u0004\b\u001b\u0010\u0019J\u0017\u0010\u001d\u001a\u00020\u00002\b\b\u0002\u0010\u001c\u001a\u00020\u0017¢\u0006\u0004\b\u001d\u0010\u001eJ\r\u0010\u001f\u001a\u00020\u0000¢\u0006\u0004\b\u001f\u0010 J#\u0010$\u001a\u00020#2\u0006\u0010!\u001a\u00020\u00102\f\u0010\"\u001a\b\u0012\u0004\u0012\u00020\u00140\u0013¢\u0006\u0004\b$\u0010%J\u001e\u0010$\u001a\u00020#2\f\u0010\"\u001a\b\u0012\u0004\u0012\u00020\u00140\u0013H\u0086@¢\u0006\u0004\b$\u0010&R\u0014\u0010)\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b'\u0010(R\u0014\u0010,\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b*\u0010+R\u0014\u0010-\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b-\u0010.R\u001e\u0010/\u001a\n\u0012\u0004\u0012\u00020\u0014\u0018\u00010\u00138\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b/\u00100R\u0018\u00103\u001a\u0004\u0018\u00010\u00108\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b1\u00102R\u0016\u0010'\u001a\u00020\u00178\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b3\u00104R\u0016\u00105\u001a\u00020\u00178\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b)\u00104R\u0016\u00106\u001a\u00020\u00178\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b,\u00104"}, d2 = {"Landroidx/camera/video/PendingRecording;", "", "Landroid/content/Context;", "context", "Landroidx/camera/video/Recorder;", "recorder", "Landroidx/camera/video/OutputOptions;", "outputOptions", "<init>", "(Landroid/content/Context;Landroidx/camera/video/Recorder;Landroidx/camera/video/OutputOptions;)V", "getApplicationContext", "()Landroid/content/Context;", "getRecorder", "()Landroidx/camera/video/Recorder;", "getOutputOptions", "()Landroidx/camera/video/OutputOptions;", "Ljava/util/concurrent/Executor;", "getListenerExecutor", "()Ljava/util/concurrent/Executor;", "Landroidx/core/util/Consumer;", "Landroidx/camera/video/VideoRecordEvent;", "getEventListener", "()Landroidx/core/util/Consumer;", "", "isAudioEnabled", "()Z", "isAudioInitialMuted", "isPersistent", "initialMuted", "withAudioEnabled", "(Z)Landroidx/camera/video/PendingRecording;", "asPersistentRecording", "()Landroidx/camera/video/PendingRecording;", "listenerExecutor", com.google.android.gms.common.internal.ServiceSpecificExtraArgs.CastExtraArgs.LISTENER, "Landroidx/camera/video/Recording;", com.adobe.marketing.mobile.internal.CoreConstants.EventDataKeys.Lifecycle.LIFECYCLE_START, "(Ljava/util/concurrent/Executor;Landroidx/core/util/Consumer;)Landroidx/camera/video/Recording;", "(Landroidx/core/util/Consumer;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getOutputFormats", "Landroidx/camera/video/Recorder;", "getHighSpeedVideoFpsRanges", "getHighSpeedVideoSizesFor", "Landroidx/camera/video/OutputOptions;", "getHighSpeedVideoSizes", "Camera2StreamConfigurationMap", "Landroid/content/Context;", "getHighSpeedVideoFpsRangesFor", "Landroidx/core/util/Consumer;", "getInputSizeshNQ4ISI", "Ljava/util/concurrent/Executor;", "getHighResolutionOutputSizeshNQ4ISI", "Z", "getOutputMinFrameDuration", "getInputFormats"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes.dex */
public final class PendingRecording {
    private final android.content.Context Camera2StreamConfigurationMap;

    /* renamed from: getHighResolutionOutputSizeshNQ4ISI, reason: from kotlin metadata */
    private boolean getOutputFormats;

    /* renamed from: getHighSpeedVideoFpsRanges, reason: from kotlin metadata */
    private boolean getOutputMinFrameDuration;
    private androidx.core.util.Consumer<androidx.camera.video.VideoRecordEvent> getHighSpeedVideoFpsRangesFor;

    /* renamed from: getHighSpeedVideoSizes, reason: from kotlin metadata */
    private boolean getInputFormats;

    /* renamed from: getHighSpeedVideoSizesFor, reason: from kotlin metadata */
    private final androidx.camera.video.OutputOptions getHighSpeedVideoSizes;

    /* renamed from: getInputSizeshNQ4ISI, reason: from kotlin metadata */
    private java.util.concurrent.Executor getHighResolutionOutputSizeshNQ4ISI;

    /* renamed from: getOutputFormats, reason: from kotlin metadata */
    private final androidx.camera.video.Recorder getHighSpeedVideoFpsRanges;

    public PendingRecording(android.content.Context context, androidx.camera.video.Recorder recorder, androidx.camera.video.OutputOptions outputOptions) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(recorder, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(outputOptions, "");
        this.getHighSpeedVideoFpsRanges = recorder;
        this.getHighSpeedVideoSizes = outputOptions;
        android.content.Context persistentApplicationContext = androidx.camera.core.impl.utils.ContextUtil.getPersistentApplicationContext(context);
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(persistentApplicationContext, "");
        this.Camera2StreamConfigurationMap = persistentApplicationContext;
    }

    /* renamed from: getApplicationContext, reason: from getter */
    public final android.content.Context getCamera2StreamConfigurationMap() {
        return this.Camera2StreamConfigurationMap;
    }

    /* renamed from: getRecorder, reason: from getter */
    public final androidx.camera.video.Recorder getGetHighSpeedVideoFpsRanges() {
        return this.getHighSpeedVideoFpsRanges;
    }

    /* renamed from: getOutputOptions, reason: from getter */
    public final androidx.camera.video.OutputOptions getGetHighSpeedVideoSizes() {
        return this.getHighSpeedVideoSizes;
    }

    /* renamed from: getListenerExecutor, reason: from getter */
    public final java.util.concurrent.Executor getGetHighResolutionOutputSizeshNQ4ISI() {
        return this.getHighResolutionOutputSizeshNQ4ISI;
    }

    public final androidx.core.util.Consumer<androidx.camera.video.VideoRecordEvent> getEventListener() {
        return this.getHighSpeedVideoFpsRangesFor;
    }

    /* renamed from: isAudioEnabled, reason: from getter */
    public final boolean getGetOutputFormats() {
        return this.getOutputFormats;
    }

    /* renamed from: isAudioInitialMuted, reason: from getter */
    public final boolean getGetOutputMinFrameDuration() {
        return this.getOutputMinFrameDuration;
    }

    /* renamed from: isPersistent, reason: from getter */
    public final boolean getGetInputFormats() {
        return this.getInputFormats;
    }

    public static /* synthetic */ androidx.camera.video.PendingRecording withAudioEnabled$default(androidx.camera.video.PendingRecording pendingRecording, boolean z, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            z = false;
        }
        return pendingRecording.withAudioEnabled(z);
    }

    public final androidx.camera.video.PendingRecording withAudioEnabled(boolean initialMuted) {
        if (androidx.core.content.PermissionChecker.checkSelfPermission(this.Camera2StreamConfigurationMap, "android.permission.RECORD_AUDIO") == -1) {
            throw new java.lang.SecurityException("Attempted to enable audio for recording but application does not have RECORD_AUDIO permission granted.");
        }
        androidx.core.util.Preconditions.checkState(((androidx.camera.video.MediaSpec) androidx.camera.video.Recorder.Camera2StreamConfigurationMap(this.getHighSpeedVideoFpsRanges.f2676a)).getAudioSpec().getChannelCount() != 0, "The Recorder this recording is associated to doesn't support audio.");
        this.getOutputFormats = true;
        this.getOutputMinFrameDuration = initialMuted;
        return this;
    }

    public final androidx.camera.video.PendingRecording asPersistentRecording() {
        this.getInputFormats = true;
        return this;
    }

    public final androidx.camera.video.Recording start(java.util.concurrent.Executor listenerExecutor, androidx.core.util.Consumer<androidx.camera.video.VideoRecordEvent> listener) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(listenerExecutor, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(listener, "");
        androidx.core.util.Preconditions.checkNotNull(listenerExecutor, "Listener Executor can't be null.");
        androidx.core.util.Preconditions.checkNotNull(listener, "Event listener can't be null");
        this.getHighResolutionOutputSizeshNQ4ISI = listenerExecutor;
        this.getHighSpeedVideoFpsRangesFor = listener;
        androidx.camera.video.Recording highSpeedVideoFpsRangesFor = this.getHighSpeedVideoFpsRanges.getHighSpeedVideoFpsRangesFor(this);
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(highSpeedVideoFpsRangesFor, "");
        return highSpeedVideoFpsRangesFor;
    }

    public final java.lang.Object start(androidx.core.util.Consumer<androidx.camera.video.VideoRecordEvent> consumer, kotlin.coroutines.Continuation<? super androidx.camera.video.Recording> continuation) {
        java.util.concurrent.Executor directExecutor;
        kotlin.coroutines.CoroutineContext.Element element = continuation.getGetHighSpeedVideoSizes().get(kotlin.coroutines.ContinuationInterceptor.INSTANCE);
        kotlinx.coroutines.CoroutineDispatcher coroutineDispatcher = element instanceof kotlinx.coroutines.CoroutineDispatcher ? (kotlinx.coroutines.CoroutineDispatcher) element : null;
        if (coroutineDispatcher == null || (directExecutor = kotlinx.coroutines.ExecutorsKt.asExecutor(coroutineDispatcher)) == null) {
            directExecutor = androidx.camera.core.impl.utils.executor.CameraXExecutors.directExecutor();
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(directExecutor, "");
        }
        return start(directExecutor, consumer);
    }

    public final androidx.camera.video.PendingRecording withAudioEnabled() {
        return withAudioEnabled$default(this, false, 1, null);
    }
}
