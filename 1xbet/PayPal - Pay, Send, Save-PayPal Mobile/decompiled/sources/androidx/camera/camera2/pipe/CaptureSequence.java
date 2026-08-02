package androidx.camera.camera2.pipe;

@kotlin.Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0006\bf\u0018\u0000*\u0006\b\u0000\u0010\u0001 \u00012\u00020\u0002:\u0001\u001fR\u0014\u0010\u0006\u001a\u00020\u00038'X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005R\u0014\u0010\n\u001a\u00020\u00078'X¦\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\tR\u001a\u0010\u000e\u001a\b\u0012\u0004\u0012\u00028\u00000\u000b8'X¦\u0004¢\u0006\u0006\u001a\u0004\b\f\u0010\rR\u001a\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000b8'X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0010\u0010\rR\u001a\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00120\u000b8'X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0013\u0010\rR\u0014\u0010\u0018\u001a\u00020\u00158'X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0016\u0010\u0017R\u001c\u0010\u001e\u001a\u00020\u00198'@'X¦\u000e¢\u0006\f\u001a\u0004\b\u001a\u0010\u001b\"\u0004\b\u001c\u0010\u001dø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001À\u0006\u0001"}, d2 = {"Landroidx/camera/camera2/pipe/CaptureSequence;", "TCaptureRequest", "", "Landroidx/camera/camera2/pipe/CameraId;", "getCameraId-Dz_R5H8", "()Ljava/lang/String;", "cameraId", "", "getRepeating", "()Z", "repeating", "", "getCaptureRequestList", "()Ljava/util/List;", "captureRequestList", "Landroidx/camera/camera2/pipe/RequestMetadata;", "getCaptureMetadataList", "captureMetadataList", "Landroidx/camera/camera2/pipe/Request$Listener;", "getListeners", "listeners", "Landroidx/camera/camera2/pipe/CaptureSequence$CaptureSequenceListener;", "getSequenceListener", "()Landroidx/camera/camera2/pipe/CaptureSequence$CaptureSequenceListener;", "sequenceListener", "", "getSequenceNumber", "()I", "setSequenceNumber", "(I)V", "sequenceNumber", "CaptureSequenceListener"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes6.dex */
public interface CaptureSequence<TCaptureRequest> {

    @kotlin.Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J\u001b\u0010\u0005\u001a\u00020\u00042\n\u0010\u0003\u001a\u0006\u0012\u0002\b\u00030\u0002H&¢\u0006\u0004\b\u0005\u0010\u0006ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001À\u0006\u0001"}, d2 = {"Landroidx/camera/camera2/pipe/CaptureSequence$CaptureSequenceListener;", "", "Landroidx/camera/camera2/pipe/CaptureSequence;", "captureSequence", "", "onCaptureSequenceComplete", "(Landroidx/camera/camera2/pipe/CaptureSequence;)V"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public interface CaptureSequenceListener {
        void onCaptureSequenceComplete(androidx.camera.camera2.pipe.CaptureSequence<?> captureSequence);
    }

    /* renamed from: getCameraId-Dz_R5H8, reason: not valid java name */
    java.lang.String mo434getCameraIdDz_R5H8();

    java.util.List<androidx.camera.camera2.pipe.RequestMetadata> getCaptureMetadataList();

    java.util.List<TCaptureRequest> getCaptureRequestList();

    java.util.List<androidx.camera.camera2.pipe.Request.Listener> getListeners();

    boolean getRepeating();

    androidx.camera.camera2.pipe.CaptureSequence.CaptureSequenceListener getSequenceListener();

    int getSequenceNumber();

    void setSequenceNumber(int i);
}
