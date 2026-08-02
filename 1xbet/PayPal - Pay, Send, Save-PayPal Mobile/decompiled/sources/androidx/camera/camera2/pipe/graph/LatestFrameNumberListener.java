package androidx.camera.camera2.pipe.graph;

@kotlin.Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\t\n\u0002\b\u0003\b\u0000\u0018\u00002\u00020\u0001B\u001b\u0012\u0012\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0002¢\u0006\u0004\b\u0006\u0010\u0007J'\u0010\u000f\u001a\u00020\u00042\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\n\u001a\u00020\u00032\u0006\u0010\f\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\r\u0010\u000eR \u0010\u0012\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011R\u0016\u0010\u0016\u001a\u00020\u00138\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015"}, d2 = {"Landroidx/camera/camera2/pipe/graph/LatestFrameNumberListener;", "Landroidx/camera/camera2/pipe/Request$Listener;", "Lkotlin/Function1;", "Landroidx/camera/camera2/pipe/FrameNumber;", "", "onNextFrameNumber", "<init>", "(Lkotlin/jvm/functions/Function1;)V", "Landroidx/camera/camera2/pipe/RequestMetadata;", "requestMetadata", "frameNumber", "Landroidx/camera/camera2/pipe/CameraTimestamp;", "timestamp", "onStarted-uGKBvU4", "(Landroidx/camera/camera2/pipe/RequestMetadata;JJ)V", "onStarted", "getHighSpeedVideoSizes", "Lkotlin/jvm/functions/Function1;", "getHighResolutionOutputSizeshNQ4ISI", "", "getHighSpeedVideoFpsRangesFor", "J", "Camera2StreamConfigurationMap"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class LatestFrameNumberListener implements androidx.camera.camera2.pipe.Request.Listener {

    /* renamed from: getHighSpeedVideoFpsRangesFor, reason: from kotlin metadata */
    private long Camera2StreamConfigurationMap;

    /* renamed from: getHighSpeedVideoSizes, reason: from kotlin metadata */
    private final kotlin.jvm.functions.Function1<androidx.camera.camera2.pipe.FrameNumber, kotlin.Unit> getHighResolutionOutputSizeshNQ4ISI;

    /* JADX WARN: Multi-variable type inference failed */
    public LatestFrameNumberListener(kotlin.jvm.functions.Function1<? super androidx.camera.camera2.pipe.FrameNumber, kotlin.Unit> function1) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(function1, "");
        this.getHighResolutionOutputSizeshNQ4ISI = function1;
        this.Camera2StreamConfigurationMap = Long.MIN_VALUE;
    }

    @Override // androidx.camera.camera2.pipe.Request.Listener
    /* renamed from: onStarted-uGKBvU4 */
    public final void mo96onStarteduGKBvU4(androidx.camera.camera2.pipe.RequestMetadata requestMetadata, long frameNumber, long timestamp) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(requestMetadata, "");
        if (requestMetadata.getRequest().getInputRequest() != null) {
            return;
        }
        synchronized (this) {
            if (frameNumber > this.Camera2StreamConfigurationMap) {
                this.Camera2StreamConfigurationMap = frameNumber;
                this.getHighResolutionOutputSizeshNQ4ISI.invoke(androidx.camera.camera2.pipe.FrameNumber.m497boximpl(frameNumber));
            }
            kotlin.Unit unit = kotlin.Unit.INSTANCE;
        }
    }
}
