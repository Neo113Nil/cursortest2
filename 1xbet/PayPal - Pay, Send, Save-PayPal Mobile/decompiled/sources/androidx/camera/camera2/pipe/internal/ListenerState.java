package androidx.camera.camera2.pipe.internal;

@kotlin.Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0000\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u001d\u0010\r\u001a\u00020\n2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\u000b\u0010\fJ\u001d\u0010\u000f\u001a\u00020\n2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\u000e\u0010\fJ\u001d\u0010\u0011\u001a\u00020\n2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\u0010\u0010\fJ\u001d\u0010\u0013\u001a\u00020\n2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\u0012\u0010\fJ\u0015\u0010\u0018\u001a\u00020\n2\u0006\u0010\u0015\u001a\u00020\u0014¢\u0006\u0004\b\u0016\u0010\u0017R\u001a\u0010\u0003\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0019\u001a\u0004\b\u001a\u0010\u001bR\u0014\u0010\u001f\u001a\u00020\u001c8\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\u001d\u0010\u001eR\u0014\u0010!\u001a\u00020\u001c8\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b \u0010\u001eR\u0014\u0010 \u001a\u00020\u001c8\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\u001f\u0010\u001eR\u0014\u0010\u001d\u001a\u00020\u001c8\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\"\u0010\u001e"}, d2 = {"Landroidx/camera/camera2/pipe/internal/ListenerState;", "", "Landroidx/camera/camera2/pipe/Frame$Listener;", com.google.android.gms.common.internal.ServiceSpecificExtraArgs.CastExtraArgs.LISTENER, "<init>", "(Landroidx/camera/camera2/pipe/Frame$Listener;)V", "Landroidx/camera/camera2/pipe/FrameNumber;", "frameNumber", "Landroidx/camera/camera2/pipe/CameraTimestamp;", "frameTimestamp", "", "invokeOnStarted-cfZT-5Y", "(JJ)V", "invokeOnStarted", "invokeOnImagesAvailable-cfZT-5Y", "invokeOnImagesAvailable", "invokeOnFrameInfoAvailable-cfZT-5Y", "invokeOnFrameInfoAvailable", "invokeOnFrameComplete-cfZT-5Y", "invokeOnFrameComplete", "Landroidx/camera/camera2/pipe/StreamId;", "streamId", "invokeOnImageAvailable-aKI5c8E", "(I)V", "invokeOnImageAvailable", "Landroidx/camera/camera2/pipe/Frame$Listener;", "getListener", "()Landroidx/camera/camera2/pipe/Frame$Listener;", "Lkotlinx/atomicfu/AtomicBoolean;", "Camera2StreamConfigurationMap", "Lkotlinx/atomicfu/AtomicBoolean;", "getHighSpeedVideoFpsRanges", "getHighSpeedVideoFpsRangesFor", "getHighResolutionOutputSizeshNQ4ISI", "getHighSpeedVideoSizes"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class ListenerState {

    /* renamed from: Camera2StreamConfigurationMap, reason: from kotlin metadata */
    private final kotlinx.atomicfu.AtomicBoolean getHighSpeedVideoFpsRanges;

    /* renamed from: getHighSpeedVideoFpsRanges, reason: from kotlin metadata */
    private final kotlinx.atomicfu.AtomicBoolean getHighSpeedVideoFpsRangesFor;

    /* renamed from: getHighSpeedVideoFpsRangesFor, reason: from kotlin metadata */
    private final kotlinx.atomicfu.AtomicBoolean getHighResolutionOutputSizeshNQ4ISI;

    /* renamed from: getHighSpeedVideoSizes, reason: from kotlin metadata */
    private final kotlinx.atomicfu.AtomicBoolean Camera2StreamConfigurationMap;
    private final androidx.camera.camera2.pipe.Frame.Listener listener;

    public ListenerState(androidx.camera.camera2.pipe.Frame.Listener listener) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(listener, "");
        this.listener = listener;
        this.getHighSpeedVideoFpsRanges = kotlinx.atomicfu.AtomicFU.atomic(false);
        this.getHighResolutionOutputSizeshNQ4ISI = kotlinx.atomicfu.AtomicFU.atomic(false);
        this.getHighSpeedVideoFpsRangesFor = kotlinx.atomicfu.AtomicFU.atomic(false);
        this.Camera2StreamConfigurationMap = kotlinx.atomicfu.AtomicFU.atomic(false);
    }

    public final androidx.camera.camera2.pipe.Frame.Listener getListener() {
        return this.listener;
    }

    /* renamed from: invokeOnStarted-cfZT-5Y, reason: not valid java name */
    public final void m975invokeOnStartedcfZT5Y(long frameNumber, long frameTimestamp) {
        if (this.getHighSpeedVideoFpsRanges.compareAndSet(false, true)) {
            this.listener.m482onFrameStartedcfZT5Y(frameNumber, frameTimestamp);
        }
    }

    /* renamed from: invokeOnImagesAvailable-cfZT-5Y, reason: not valid java name */
    public final void m974invokeOnImagesAvailablecfZT5Y(long frameNumber, long frameTimestamp) {
        m975invokeOnStartedcfZT5Y(frameNumber, frameTimestamp);
        if (this.getHighResolutionOutputSizeshNQ4ISI.compareAndSet(false, true)) {
            this.listener.onImagesAvailable();
        }
    }

    /* renamed from: invokeOnFrameInfoAvailable-cfZT-5Y, reason: not valid java name */
    public final void m972invokeOnFrameInfoAvailablecfZT5Y(long frameNumber, long frameTimestamp) {
        m975invokeOnStartedcfZT5Y(frameNumber, frameTimestamp);
        if (this.getHighSpeedVideoFpsRangesFor.compareAndSet(false, true)) {
            this.listener.onFrameInfoAvailable();
        }
    }

    /* renamed from: invokeOnFrameComplete-cfZT-5Y, reason: not valid java name */
    public final void m971invokeOnFrameCompletecfZT5Y(long frameNumber, long frameTimestamp) {
        m974invokeOnImagesAvailablecfZT5Y(frameNumber, frameTimestamp);
        m972invokeOnFrameInfoAvailablecfZT5Y(frameNumber, frameTimestamp);
        if (this.Camera2StreamConfigurationMap.compareAndSet(false, true)) {
            this.listener.onFrameComplete();
        }
    }

    /* renamed from: invokeOnImageAvailable-aKI5c8E, reason: not valid java name */
    public final void m973invokeOnImageAvailableaKI5c8E(int streamId) {
        this.listener.m483onImageAvailableaKI5c8E(streamId);
    }
}
