package androidx.camera.camera2.pipe.config;

@kotlin.Metadata(d1 = {"\u0000p\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b!\u0018\u0000 )2\u00020\u0001:\u0001)B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H'¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\f\u001a\u00020\u000b2\u0006\u0010\n\u001a\u00020\tH'¢\u0006\u0004\b\f\u0010\rJ\u0017\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\n\u001a\u00020\tH'¢\u0006\u0004\b\u000f\u0010\u0010J\u0019\u0010\u0013\u001a\u00020\u00112\b\b\u0001\u0010\u0012\u001a\u00020\u0011H'¢\u0006\u0004\b\u0013\u0010\u0014J\u0017\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u0016\u001a\u00020\u0015H'¢\u0006\u0004\b\u0018\u0010\u0019J\u0017\u0010\u001d\u001a\u00020\u001c2\u0006\u0010\u001b\u001a\u00020\u001aH'¢\u0006\u0004\b\u001d\u0010\u001eJ\u0017\u0010\"\u001a\u00020!2\u0006\u0010 \u001a\u00020\u001fH'¢\u0006\u0004\b\"\u0010#J\u0017\u0010'\u001a\u00020&2\u0006\u0010%\u001a\u00020$H'¢\u0006\u0004\b'\u0010("}, d2 = {"Landroidx/camera/camera2/pipe/config/SharedCameraGraphModules;", "", "<init>", "()V", "Landroidx/camera/camera2/pipe/graph/CameraGraphImpl;", "cameraGraph", "Landroidx/camera/camera2/pipe/CameraGraph;", "bindCameraGraph", "(Landroidx/camera/camera2/pipe/graph/CameraGraphImpl;)Landroidx/camera/camera2/pipe/CameraGraph;", "Landroidx/camera/camera2/pipe/graph/GraphProcessorImpl;", "graphProcessor", "Landroidx/camera/camera2/pipe/graph/GraphProcessor;", "bindGraphProcessor", "(Landroidx/camera/camera2/pipe/graph/GraphProcessorImpl;)Landroidx/camera/camera2/pipe/graph/GraphProcessor;", "Landroidx/camera/camera2/pipe/graph/GraphListener;", "bindGraphListener", "(Landroidx/camera/camera2/pipe/graph/GraphProcessorImpl;)Landroidx/camera/camera2/pipe/graph/GraphListener;", "Landroid/content/Context;", "cameraPipeContext", "bindCameraGraphContext", "(Landroid/content/Context;)Landroid/content/Context;", "Landroidx/camera/camera2/pipe/graph/StreamGraphImpl;", "streamGraph", "Landroidx/camera/camera2/pipe/StreamGraph;", "bindStreamGraph", "(Landroidx/camera/camera2/pipe/graph/StreamGraphImpl;)Landroidx/camera/camera2/pipe/StreamGraph;", "Landroidx/camera/camera2/pipe/graph/SurfaceGraph;", "surfaceGraph", "Landroidx/camera/camera2/pipe/SurfaceTracker;", "bindSurfaceTracker", "(Landroidx/camera/camera2/pipe/graph/SurfaceGraph;)Landroidx/camera/camera2/pipe/SurfaceTracker;", "Landroidx/camera/camera2/pipe/internal/CameraGraphParametersImpl;", "parameters", "Landroidx/camera/camera2/pipe/Parameters;", "bindCameraGraphParameters", "(Landroidx/camera/camera2/pipe/internal/CameraGraphParametersImpl;)Landroidx/camera/camera2/pipe/Parameters;", "Landroidx/camera/camera2/pipe/internal/CameraGraphRequestListenersImpl;", "listeners", "Landroidx/camera/camera2/pipe/RequestListeners;", "bindCameraGraphListeners", "(Landroidx/camera/camera2/pipe/internal/CameraGraphRequestListenersImpl;)Landroidx/camera/camera2/pipe/RequestListeners;", "Companion"}, k = 1, mv = {2, 1, 0}, xi = 48)
@dagger.Module
/* loaded from: classes6.dex */
public abstract class SharedCameraGraphModules {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final androidx.camera.camera2.pipe.config.SharedCameraGraphModules.Companion INSTANCE = new androidx.camera.camera2.pipe.config.SharedCameraGraphModules.Companion(null);

    @dagger.Binds
    public abstract androidx.camera.camera2.pipe.CameraGraph bindCameraGraph(androidx.camera.camera2.pipe.graph.CameraGraphImpl cameraGraph);

    @androidx.camera.camera2.pipe.config.CameraGraphContext
    @dagger.Binds
    public abstract android.content.Context bindCameraGraphContext(@androidx.camera.camera2.pipe.config.CameraPipeContext android.content.Context cameraPipeContext);

    @dagger.Binds
    public abstract androidx.camera.camera2.pipe.RequestListeners bindCameraGraphListeners(androidx.camera.camera2.pipe.internal.CameraGraphRequestListenersImpl listeners);

    @dagger.Binds
    public abstract androidx.camera.camera2.pipe.Parameters bindCameraGraphParameters(androidx.camera.camera2.pipe.internal.CameraGraphParametersImpl parameters);

    @dagger.Binds
    public abstract androidx.camera.camera2.pipe.graph.GraphListener bindGraphListener(androidx.camera.camera2.pipe.graph.GraphProcessorImpl graphProcessor);

    @dagger.Binds
    public abstract androidx.camera.camera2.pipe.graph.GraphProcessor bindGraphProcessor(androidx.camera.camera2.pipe.graph.GraphProcessorImpl graphProcessor);

    @dagger.Binds
    public abstract androidx.camera.camera2.pipe.StreamGraph bindStreamGraph(androidx.camera.camera2.pipe.graph.StreamGraphImpl streamGraph);

    @androidx.camera.camera2.pipe.config.CameraGraphScope
    @dagger.Binds
    public abstract androidx.camera.camera2.pipe.SurfaceTracker bindSurfaceTracker(androidx.camera.camera2.pipe.graph.SurfaceGraph surfaceGraph);

    @kotlin.Metadata(d1 = {"\u0000t\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J!\u0010\t\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\b\b\u0001\u0010\u0007\u001a\u00020\u0006H\u0007¢\u0006\u0004\b\t\u0010\nJ2\u0010\u0014\u001a\r\u0012\t\u0012\u00070\u0012¢\u0006\u0002\b\u00130\u00112\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\u000fH\u0007¢\u0006\u0004\b\u0014\u0010\u0015J-\u0010\u001e\u001a\u00020\u001d2\u0006\u0010\u0017\u001a\u00020\u00162\f\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u00190\u00182\u0006\u0010\u001c\u001a\u00020\u001bH\u0007¢\u0006\u0004\b\u001e\u0010\u001fJ/\u0010&\u001a\u00020\u000f2\u0006\u0010\u0017\u001a\u00020\u00162\u0006\u0010!\u001a\u00020 2\u0006\u0010#\u001a\u00020\"2\u0006\u0010%\u001a\u00020$H\u0007¢\u0006\u0004\b&\u0010'J\u000f\u0010(\u001a\u00020$H\u0007¢\u0006\u0004\b(\u0010)"}, d2 = {"Landroidx/camera/camera2/pipe/config/SharedCameraGraphModules$Companion;", "", "<init>", "()V", "Landroidx/camera/camera2/pipe/core/Threads;", "threads", "Lkotlinx/coroutines/Job;", "cameraPipeJob", "Lkotlinx/coroutines/CoroutineScope;", "provideCameraGraphCoroutineScope", "(Landroidx/camera/camera2/pipe/core/Threads;Lkotlinx/coroutines/Job;)Lkotlinx/coroutines/CoroutineScope;", "Landroidx/camera/camera2/pipe/CameraGraph$Config;", "graphConfig", "Landroidx/camera/camera2/pipe/graph/Listener3A;", "listener3A", "Landroidx/camera/camera2/pipe/internal/FrameDistributor;", "frameDistributor", "", "Landroidx/camera/camera2/pipe/Request$Listener;", "Lkotlin/jvm/JvmSuppressWildcards;", "provideRequestListeners", "(Landroidx/camera/camera2/pipe/CameraGraph$Config;Landroidx/camera/camera2/pipe/graph/Listener3A;Landroidx/camera/camera2/pipe/internal/FrameDistributor;)Ljava/util/List;", "Landroidx/camera/camera2/pipe/graph/StreamGraphImpl;", "streamGraphImpl", "Ljavax/inject/Provider;", "Landroidx/camera/camera2/pipe/CameraController;", "cameraController", "Landroidx/camera/camera2/pipe/CameraSurfaceManager;", "cameraSurfaceManager", "Landroidx/camera/camera2/pipe/graph/SurfaceGraph;", "provideSurfaceGraph", "(Landroidx/camera/camera2/pipe/graph/StreamGraphImpl;Ljavax/inject/Provider;Landroidx/camera/camera2/pipe/CameraSurfaceManager;)Landroidx/camera/camera2/pipe/graph/SurfaceGraph;", "Landroidx/camera/camera2/pipe/internal/FrameCaptureQueue;", "frameCaptureQueue", "Landroidx/camera/camera2/pipe/CameraMetadata;", "cameraMetadata", "Landroidx/camera/camera2/pipe/core/SystemClockOffsets;", "systemClockOffsets", "provideFrameDistributor", "(Landroidx/camera/camera2/pipe/graph/StreamGraphImpl;Landroidx/camera/camera2/pipe/internal/FrameCaptureQueue;Landroidx/camera/camera2/pipe/CameraMetadata;Landroidx/camera/camera2/pipe/core/SystemClockOffsets;)Landroidx/camera/camera2/pipe/internal/FrameDistributor;", "provideSystemClockOffsets", "()Landroidx/camera/camera2/pipe/core/SystemClockOffsets;"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        @androidx.camera.camera2.pipe.config.CameraGraphScope
        @androidx.camera.camera2.pipe.config.ForCameraGraph
        @dagger.Provides
        public final kotlinx.coroutines.CoroutineScope provideCameraGraphCoroutineScope(androidx.camera.camera2.pipe.core.Threads threads, @androidx.camera.camera2.pipe.config.CameraPipeJob kotlinx.coroutines.Job cameraPipeJob) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(threads, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(cameraPipeJob, "");
            return kotlinx.coroutines.CoroutineScopeKt.CoroutineScope(kotlinx.coroutines.SupervisorKt.SupervisorJob(cameraPipeJob).plus(threads.getLightweightDispatcher().plus(new kotlinx.coroutines.CoroutineName("CXCP-Graph"))));
        }

        @androidx.camera.camera2.pipe.config.CameraGraphScope
        @androidx.camera.camera2.pipe.config.ForCameraGraph
        @dagger.Provides
        public final java.util.List<androidx.camera.camera2.pipe.Request.Listener> provideRequestListeners(androidx.camera.camera2.pipe.CameraGraph.Config graphConfig, androidx.camera.camera2.pipe.graph.Listener3A listener3A, androidx.camera.camera2.pipe.internal.FrameDistributor frameDistributor) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(graphConfig, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(listener3A, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(frameDistributor, "");
            java.util.List<androidx.camera.camera2.pipe.Request.Listener> mutableListOf = kotlin.collections.CollectionsKt.mutableListOf(listener3A);
            mutableListOf.add(listener3A);
            mutableListOf.add(frameDistributor);
            mutableListOf.addAll(graphConfig.getDefaultListeners());
            return mutableListOf;
        }

        @androidx.camera.camera2.pipe.config.CameraGraphScope
        @dagger.Provides
        public final androidx.camera.camera2.pipe.graph.SurfaceGraph provideSurfaceGraph(androidx.camera.camera2.pipe.graph.StreamGraphImpl streamGraphImpl, javax.inject.Provider<androidx.camera.camera2.pipe.CameraController> cameraController, androidx.camera.camera2.pipe.CameraSurfaceManager cameraSurfaceManager) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(streamGraphImpl, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(cameraController, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(cameraSurfaceManager, "");
            return new androidx.camera.camera2.pipe.graph.SurfaceGraph(streamGraphImpl, cameraController, cameraSurfaceManager, streamGraphImpl.getImageSourceMap$camera_camera2_pipe());
        }

        /* JADX WARN: Code restructure failed: missing block: B:4:0x0020, code lost:
        
            if (r10.intValue() != 1) goto L6;
         */
        @androidx.camera.camera2.pipe.config.CameraGraphScope
        @dagger.Provides
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final androidx.camera.camera2.pipe.internal.FrameDistributor provideFrameDistributor(androidx.camera.camera2.pipe.graph.StreamGraphImpl streamGraphImpl, androidx.camera.camera2.pipe.internal.FrameCaptureQueue frameCaptureQueue, androidx.camera.camera2.pipe.CameraMetadata cameraMetadata, androidx.camera.camera2.pipe.core.SystemClockOffsets systemClockOffsets) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(streamGraphImpl, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(frameCaptureQueue, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(cameraMetadata, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(systemClockOffsets, "");
            android.hardware.camera2.CameraCharacteristics.Key key = android.hardware.camera2.CameraCharacteristics.SENSOR_INFO_TIMESTAMP_SOURCE;
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(key, "");
            java.lang.Integer num = (java.lang.Integer) cameraMetadata.get(key);
            boolean z = num != null;
            return new androidx.camera.camera2.pipe.internal.FrameDistributor(streamGraphImpl, frameCaptureQueue, z, systemClockOffsets.getRealtimeNsToMonotonicNs());
        }

        @androidx.camera.camera2.pipe.config.CameraGraphScope
        @dagger.Provides
        public final androidx.camera.camera2.pipe.core.SystemClockOffsets provideSystemClockOffsets() {
            return androidx.camera.camera2.pipe.core.SystemClockOffsets.INSTANCE.estimate();
        }

        public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }
}
