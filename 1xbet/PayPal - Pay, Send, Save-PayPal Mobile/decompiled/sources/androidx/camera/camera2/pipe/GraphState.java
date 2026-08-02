package androidx.camera.camera2.pipe;

@kotlin.Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\r\b&\u0018\u00002\u00020\u0001:\u0005\u000b\f\r\u000e\u000fB\u0011\b\u0000\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\u0006\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0006\u0010\u0007R\u0014\u0010\n\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\t"}, d2 = {"Landroidx/camera/camera2/pipe/GraphState;", "", "", "name", "<init>", "(Ljava/lang/String;)V", "toString", "()Ljava/lang/String;", "getHighSpeedVideoFpsRanges", "Ljava/lang/String;", "Camera2StreamConfigurationMap", "GraphStateStarting", "GraphStateStarted", "GraphStateStopping", "GraphStateStopped", "GraphStateError"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes6.dex */
public abstract class GraphState {

    /* renamed from: getHighSpeedVideoFpsRanges, reason: from kotlin metadata */
    private final java.lang.String Camera2StreamConfigurationMap;

    public GraphState(java.lang.String str) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        this.Camera2StreamConfigurationMap = str;
    }

    @kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Landroidx/camera/camera2/pipe/GraphState$GraphStateStarting;", "Landroidx/camera/camera2/pipe/GraphState;", "<init>", "()V"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class GraphStateStarting extends androidx.camera.camera2.pipe.GraphState {
        public static final androidx.camera.camera2.pipe.GraphState.GraphStateStarting INSTANCE = new androidx.camera.camera2.pipe.GraphState.GraphStateStarting();

        private GraphStateStarting() {
            super("GRAPH_STARTING");
        }
    }

    @kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Landroidx/camera/camera2/pipe/GraphState$GraphStateStarted;", "Landroidx/camera/camera2/pipe/GraphState;", "<init>", "()V"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class GraphStateStarted extends androidx.camera.camera2.pipe.GraphState {
        public static final androidx.camera.camera2.pipe.GraphState.GraphStateStarted INSTANCE = new androidx.camera.camera2.pipe.GraphState.GraphStateStarted();

        private GraphStateStarted() {
            super("GRAPH_STARTED");
        }
    }

    @kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Landroidx/camera/camera2/pipe/GraphState$GraphStateStopping;", "Landroidx/camera/camera2/pipe/GraphState;", "<init>", "()V"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class GraphStateStopping extends androidx.camera.camera2.pipe.GraphState {
        public static final androidx.camera.camera2.pipe.GraphState.GraphStateStopping INSTANCE = new androidx.camera.camera2.pipe.GraphState.GraphStateStopping();

        private GraphStateStopping() {
            super("GRAPH_STOPPING");
        }
    }

    @kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Landroidx/camera/camera2/pipe/GraphState$GraphStateStopped;", "Landroidx/camera/camera2/pipe/GraphState;", "<init>", "()V"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class GraphStateStopped extends androidx.camera.camera2.pipe.GraphState {
        public static final androidx.camera.camera2.pipe.GraphState.GraphStateStopped INSTANCE = new androidx.camera.camera2.pipe.GraphState.GraphStateStopped();

        private GraphStateStopped() {
            super("GRAPH_STOPPED");
        }
    }

    @kotlin.Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u000f\u0010\t\u001a\u00020\bH\u0016¢\u0006\u0004\b\t\u0010\nR\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u000b\u001a\u0004\b\f\u0010\rR\u001a\u0010\u0005\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010"}, d2 = {"Landroidx/camera/camera2/pipe/GraphState$GraphStateError;", "Landroidx/camera/camera2/pipe/GraphState;", "Landroidx/camera/camera2/pipe/CameraError;", "cameraError", "", "willAttemptRetry", "<init>", "(IZLkotlin/jvm/internal/DefaultConstructorMarker;)V", "", "toString", "()Ljava/lang/String;", com.visa.cbp.getEncExpo.warmup, "getCameraError-v7Vf74A", "()I", "Z", "getWillAttemptRetry", "()Z"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class GraphStateError extends androidx.camera.camera2.pipe.GraphState {
        private final int cameraError;
        private final boolean willAttemptRetry;

        private GraphStateError(int i, boolean z) {
            super("GRAPH_ERROR");
            this.cameraError = i;
            this.willAttemptRetry = z;
        }

        /* renamed from: getCameraError-v7Vf74A, reason: not valid java name and from getter */
        public final int getCameraError() {
            return this.cameraError;
        }

        public final boolean getWillAttemptRetry() {
            return this.willAttemptRetry;
        }

        @Override // androidx.camera.camera2.pipe.GraphState
        /* renamed from: toString */
        public final java.lang.String getCamera2StreamConfigurationMap() {
            java.lang.StringBuilder sb = new java.lang.StringBuilder();
            sb.append(super.getCamera2StreamConfigurationMap());
            sb.append("(cameraError=");
            sb.append((java.lang.Object) androidx.camera.camera2.pipe.CameraError.m325toStringimpl(this.cameraError));
            sb.append(", willAttemptRetry=");
            sb.append(this.willAttemptRetry);
            sb.append(')');
            return sb.toString();
        }

        public /* synthetic */ GraphStateError(int i, boolean z, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this(i, z);
        }
    }

    /* renamed from: toString, reason: from getter */
    public java.lang.String getCamera2StreamConfigurationMap() {
        return this.Camera2StreamConfigurationMap;
    }
}
