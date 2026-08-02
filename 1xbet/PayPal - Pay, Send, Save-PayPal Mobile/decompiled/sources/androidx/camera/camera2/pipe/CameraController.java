package androidx.camera.camera2.pipe;

@kotlin.Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\bf\u0018\u00002\u00020\u0001:\u0001!J\u000f\u0010\u0003\u001a\u00020\u0002H&¢\u0006\u0004\b\u0003\u0010\u0004J\u000f\u0010\u0005\u001a\u00020\u0002H&¢\u0006\u0004\b\u0005\u0010\u0004J\u000f\u0010\u0006\u001a\u00020\u0002H&¢\u0006\u0004\b\u0006\u0010\u0004J\u0010\u0010\b\u001a\u00020\u0007H¦@¢\u0006\u0004\b\b\u0010\tJ#\u0010\u000e\u001a\u00020\u00022\u0012\u0010\r\u001a\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\f0\nH&¢\u0006\u0004\b\u000e\u0010\u000fJ\u001b\u0010\u0014\u001a\u0004\u0018\u00010\u00112\b\u0010\u0010\u001a\u0004\u0018\u00010\u000bH&¢\u0006\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0018\u001a\u00020\u00158'X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0016\u0010\u0017R\u0014\u0010\u001c\u001a\u00020\u00198'X¦\u0004¢\u0006\u0006\u001a\u0004\b\u001a\u0010\u001bR\u001c\u0010\u001d\u001a\u00020\u00078'@'X¦\u000e¢\u0006\f\u001a\u0004\b\u001d\u0010\u001e\"\u0004\b\u001f\u0010 ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001À\u0006\u0001"}, d2 = {"Landroidx/camera/camera2/pipe/CameraController;", "", "", com.adobe.marketing.mobile.internal.CoreConstants.EventDataKeys.Lifecycle.LIFECYCLE_START, "()V", "stop", "close", "", "awaitClosed", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "", "Landroidx/camera/camera2/pipe/StreamId;", "Landroid/view/Surface;", "surfaceMap", "updateSurfaceMap", "(Ljava/util/Map;)V", "streamId", "Landroidx/camera/camera2/pipe/StreamGraph$OutputLatency;", "getOutputLatency-n5Pu2dI", "(Landroidx/camera/camera2/pipe/StreamId;)Landroidx/camera/camera2/pipe/StreamGraph$OutputLatency;", "getOutputLatency", "Landroidx/camera/camera2/pipe/CameraId;", "getCameraId-Dz_R5H8", "()Ljava/lang/String;", "cameraId", "Landroidx/camera/camera2/pipe/CameraGraphId;", "getCameraGraphId", "()Landroidx/camera/camera2/pipe/CameraGraphId;", "cameraGraphId", "isForeground", "()Z", "setForeground", "(Z)V", "ControllerState"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes.dex */
public interface CameraController {
    void close();

    androidx.camera.camera2.pipe.CameraGraphId getCameraGraphId();

    /* renamed from: getCameraId-Dz_R5H8, reason: not valid java name */
    java.lang.String mo272getCameraIdDz_R5H8();

    /* renamed from: getOutputLatency-n5Pu2dI, reason: not valid java name */
    androidx.camera.camera2.pipe.StreamGraph.OutputLatency mo273getOutputLatencyn5Pu2dI(androidx.camera.camera2.pipe.StreamId streamId);

    boolean isForeground();

    void setForeground(boolean z);

    void start();

    void stop();

    void updateSurfaceMap(java.util.Map<androidx.camera.camera2.pipe.StreamId, ? extends android.view.Surface> surfaceMap);

    static /* synthetic */ java.lang.Object awaitClosed$suspendImpl(androidx.camera.camera2.pipe.CameraController cameraController, kotlin.coroutines.Continuation<? super java.lang.Boolean> continuation) {
        return kotlin.coroutines.jvm.internal.Boxing.boxBoolean(true);
    }

    @kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\t\b&\u0018\u00002\u00020\u0001:\u0007\u0004\u0005\u0006\u0007\b\t\nB\t\b\u0000¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Landroidx/camera/camera2/pipe/CameraController$ControllerState;", "", "<init>", "()V", "STARTED", "STOPPING", "STOPPED", "DISCONNECTED", "ERROR", "CLOSING", "CLOSED"}, k = 1, mv = {2, 1, 0}, xi = 48)
    /* loaded from: classes6.dex */
    public static abstract class ControllerState {

        @kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Landroidx/camera/camera2/pipe/CameraController$ControllerState$STARTED;", "Landroidx/camera/camera2/pipe/CameraController$ControllerState;", "<init>", "()V"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final class STARTED extends androidx.camera.camera2.pipe.CameraController.ControllerState {
            public static final androidx.camera.camera2.pipe.CameraController.ControllerState.STARTED INSTANCE = new androidx.camera.camera2.pipe.CameraController.ControllerState.STARTED();

            private STARTED() {
            }
        }

        @kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Landroidx/camera/camera2/pipe/CameraController$ControllerState$STOPPING;", "Landroidx/camera/camera2/pipe/CameraController$ControllerState;", "<init>", "()V"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final class STOPPING extends androidx.camera.camera2.pipe.CameraController.ControllerState {
            public static final androidx.camera.camera2.pipe.CameraController.ControllerState.STOPPING INSTANCE = new androidx.camera.camera2.pipe.CameraController.ControllerState.STOPPING();

            private STOPPING() {
            }
        }

        @kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Landroidx/camera/camera2/pipe/CameraController$ControllerState$STOPPED;", "Landroidx/camera/camera2/pipe/CameraController$ControllerState;", "<init>", "()V"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final class STOPPED extends androidx.camera.camera2.pipe.CameraController.ControllerState {
            public static final androidx.camera.camera2.pipe.CameraController.ControllerState.STOPPED INSTANCE = new androidx.camera.camera2.pipe.CameraController.ControllerState.STOPPED();

            private STOPPED() {
            }
        }

        @kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Landroidx/camera/camera2/pipe/CameraController$ControllerState$DISCONNECTED;", "Landroidx/camera/camera2/pipe/CameraController$ControllerState;", "<init>", "()V"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final class DISCONNECTED extends androidx.camera.camera2.pipe.CameraController.ControllerState {
            public static final androidx.camera.camera2.pipe.CameraController.ControllerState.DISCONNECTED INSTANCE = new androidx.camera.camera2.pipe.CameraController.ControllerState.DISCONNECTED();

            private DISCONNECTED() {
            }
        }

        @kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Landroidx/camera/camera2/pipe/CameraController$ControllerState$ERROR;", "Landroidx/camera/camera2/pipe/CameraController$ControllerState;", "<init>", "()V"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final class ERROR extends androidx.camera.camera2.pipe.CameraController.ControllerState {
            public static final androidx.camera.camera2.pipe.CameraController.ControllerState.ERROR INSTANCE = new androidx.camera.camera2.pipe.CameraController.ControllerState.ERROR();

            private ERROR() {
            }
        }

        @kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Landroidx/camera/camera2/pipe/CameraController$ControllerState$CLOSING;", "Landroidx/camera/camera2/pipe/CameraController$ControllerState;", "<init>", "()V"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final class CLOSING extends androidx.camera.camera2.pipe.CameraController.ControllerState {
            public static final androidx.camera.camera2.pipe.CameraController.ControllerState.CLOSING INSTANCE = new androidx.camera.camera2.pipe.CameraController.ControllerState.CLOSING();

            private CLOSING() {
            }
        }

        @kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Landroidx/camera/camera2/pipe/CameraController$ControllerState$CLOSED;", "Landroidx/camera/camera2/pipe/CameraController$ControllerState;", "<init>", "()V"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final class CLOSED extends androidx.camera.camera2.pipe.CameraController.ControllerState {
            public static final androidx.camera.camera2.pipe.CameraController.ControllerState.CLOSED INSTANCE = new androidx.camera.camera2.pipe.CameraController.ControllerState.CLOSED();

            private CLOSED() {
            }
        }
    }

    default java.lang.Object awaitClosed(kotlin.coroutines.Continuation<? super java.lang.Boolean> continuation) {
        return awaitClosed$suspendImpl(this, continuation);
    }
}
