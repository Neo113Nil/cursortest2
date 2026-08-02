package androidx.camera.camera2.pipe.compat;

@kotlin.Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\n\bf\u0018\u00002\u00020\u0001:\u0001\u0016J\u001f\u0010\t\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H&¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\n\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u0002H&¢\u0006\u0004\b\n\u0010\u000bJ\u0017\u0010\u000e\u001a\u00020\u00062\u0006\u0010\r\u001a\u00020\fH&¢\u0006\u0004\b\u000e\u0010\u000fJ\u0017\u0010\u0010\u001a\u00020\u00062\u0006\u0010\r\u001a\u00020\fH&¢\u0006\u0004\b\u0010\u0010\u000fR\u001e\u0010\u0015\u001a\u0004\u0018\u00010\u00048'@'X¦\u000e¢\u0006\f\u001a\u0004\b\u0011\u0010\u0012\"\u0004\b\u0013\u0010\u0014ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001À\u0006\u0001"}, d2 = {"Landroidx/camera/camera2/pipe/compat/AudioRestrictionController;", "", "Landroidx/camera/camera2/pipe/CameraGraph;", "cameraGraph", "Landroidx/camera/camera2/pipe/AudioRestrictionMode;", "mode", "", "updateCameraGraphAudioRestrictionMode-TyYSX5E", "(Landroidx/camera/camera2/pipe/CameraGraph;I)V", "updateCameraGraphAudioRestrictionMode", "removeCameraGraph", "(Landroidx/camera/camera2/pipe/CameraGraph;)V", "Landroidx/camera/camera2/pipe/compat/AudioRestrictionController$Listener;", com.google.android.gms.common.internal.ServiceSpecificExtraArgs.CastExtraArgs.LISTENER, "addListener", "(Landroidx/camera/camera2/pipe/compat/AudioRestrictionController$Listener;)V", "removeListener", "getGlobalAudioRestrictionMode-4o0Og1A", "()Landroidx/camera/camera2/pipe/AudioRestrictionMode;", "setGlobalAudioRestrictionMode-3NUV5dA", "(Landroidx/camera/camera2/pipe/AudioRestrictionMode;)V", "globalAudioRestrictionMode", "Listener"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes.dex */
public interface AudioRestrictionController {

    @kotlin.Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J\u0017\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H&¢\u0006\u0004\b\u0005\u0010\u0006ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001À\u0006\u0001"}, d2 = {"Landroidx/camera/camera2/pipe/compat/AudioRestrictionController$Listener;", "", "Landroidx/camera/camera2/pipe/AudioRestrictionMode;", "mode", "", "onCameraAudioRestrictionUpdated-LwUUkyU", "(I)V", "onCameraAudioRestrictionUpdated"}, k = 1, mv = {2, 1, 0}, xi = 48)
    /* loaded from: classes6.dex */
    public interface Listener {
        /* renamed from: onCameraAudioRestrictionUpdated-LwUUkyU */
        void mo768onCameraAudioRestrictionUpdatedLwUUkyU(int mode);
    }

    void addListener(androidx.camera.camera2.pipe.compat.AudioRestrictionController.Listener listener);

    /* renamed from: getGlobalAudioRestrictionMode-4o0Og1A, reason: not valid java name */
    androidx.camera.camera2.pipe.AudioRestrictionMode mo773getGlobalAudioRestrictionMode4o0Og1A();

    void removeCameraGraph(androidx.camera.camera2.pipe.CameraGraph cameraGraph);

    void removeListener(androidx.camera.camera2.pipe.compat.AudioRestrictionController.Listener listener);

    /* renamed from: setGlobalAudioRestrictionMode-3NUV5dA, reason: not valid java name */
    void mo774setGlobalAudioRestrictionMode3NUV5dA(androidx.camera.camera2.pipe.AudioRestrictionMode audioRestrictionMode);

    /* renamed from: updateCameraGraphAudioRestrictionMode-TyYSX5E, reason: not valid java name */
    void mo775updateCameraGraphAudioRestrictionModeTyYSX5E(androidx.camera.camera2.pipe.CameraGraph cameraGraph, int mode);
}
