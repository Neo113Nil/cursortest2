package androidx.camera.camera2.pipe.graph;

@kotlin.Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\b`\u0018\u00002\u00020\u0001J\u0017\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H&¢\u0006\u0004\b\u0005\u0010\u0006J\u001f\u0010\r\u001a\u00020\n2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\t\u001a\u00020\bH&¢\u0006\u0004\b\u000b\u0010\fø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001À\u0006\u0001"}, d2 = {"Landroidx/camera/camera2/pipe/graph/Result3AStateListener;", "Landroidx/camera/camera2/pipe/graph/GraphLoop$Listener;", "Landroidx/camera/camera2/pipe/RequestNumber;", "requestNumber", "", "onRequestSequenceCreated-DThHKJ0", "(J)V", "onRequestSequenceCreated", "Landroidx/camera/camera2/pipe/FrameMetadata;", "frameMetadata", "", "update-voP-kFw", "(JLandroidx/camera/camera2/pipe/FrameMetadata;)Z", "update"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes6.dex */
public interface Result3AStateListener extends androidx.camera.camera2.pipe.graph.GraphLoop.Listener {
    /* renamed from: onRequestSequenceCreated-DThHKJ0, reason: not valid java name */
    void mo927onRequestSequenceCreatedDThHKJ0(long requestNumber);

    /* renamed from: update-voP-kFw, reason: not valid java name */
    boolean mo928updatevoPkFw(long requestNumber, androidx.camera.camera2.pipe.FrameMetadata frameMetadata);
}
