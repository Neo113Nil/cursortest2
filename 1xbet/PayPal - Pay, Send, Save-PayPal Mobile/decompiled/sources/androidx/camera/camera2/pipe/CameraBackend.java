package androidx.camera.camera2.pipe;

@kotlin.Metadata(d1 = {"\u0000|\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\"\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J\u0018\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0002H\u0096@¢\u0006\u0004\b\u0004\u0010\u0005J\u0017\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0002H&¢\u0006\u0004\b\u0006\u0010\u0007J\u001e\u0010\t\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\b\u0018\u00010\bH\u0096@¢\u0006\u0004\b\t\u0010\u0005J\u001d\u0010\n\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\b\u0018\u00010\bH&¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u0010\u001a\u0004\u0018\u00010\r2\u0006\u0010\f\u001a\u00020\u0003H\u0096@¢\u0006\u0004\b\u000e\u0010\u000fJ\u0019\u0010\u0013\u001a\u0004\u0018\u00010\r2\u0006\u0010\f\u001a\u00020\u0003H&¢\u0006\u0004\b\u0011\u0010\u0012J\u0015\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00150\u0014H&¢\u0006\u0004\b\u0016\u0010\u0017J\u0015\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00150\u0014H&¢\u0006\u0004\b\u0018\u0010\u0017J?\u0010&\u001a\u00020%2\u0006\u0010\u001a\u001a\u00020\u00192\u0006\u0010\u001c\u001a\u00020\u001b2\u0006\u0010\u001e\u001a\u00020\u001d2\u0006\u0010 \u001a\u00020\u001f2\u0006\u0010\"\u001a\u00020!2\u0006\u0010$\u001a\u00020#H&¢\u0006\u0004\b&\u0010'J\u0017\u0010*\u001a\u00020\u00152\u0006\u0010\f\u001a\u00020\u0003H&¢\u0006\u0004\b(\u0010)J\u0017\u0010,\u001a\u00020\u00152\u0006\u0010\f\u001a\u00020\u0003H&¢\u0006\u0004\b+\u0010)J\u001d\u0010/\u001a\b\u0012\u0004\u0012\u00020\u00150\u00142\u0006\u0010\f\u001a\u00020\u0003H&¢\u0006\u0004\b-\u0010.J\u000f\u00100\u001a\u00020\u0015H&¢\u0006\u0004\b0\u00101J\u0017\u00103\u001a\u00020\u00152\u0006\u0010\f\u001a\u00020\u0003H\u0016¢\u0006\u0004\b2\u0010)J\u001a\u00106\u001a\u0004\u0018\u0001042\u0006\u0010\f\u001a\u00020\u0003H\u0097@¢\u0006\u0004\b5\u0010\u000fJ\u0018\u0010:\u001a\u0002072\u0006\u0010\u001e\u001a\u00020\u001dH\u0096@¢\u0006\u0004\b8\u00109R\u0014\u0010>\u001a\u00020;8'X¦\u0004¢\u0006\u0006\u001a\u0004\b<\u0010=R \u0010A\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u00020?8WX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0004\u0010@ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001À\u0006\u0003"}, d2 = {"Landroidx/camera/camera2/pipe/CameraBackend;", "", "", "Landroidx/camera/camera2/pipe/CameraId;", "getCameraIds", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "awaitCameraIds", "()Ljava/util/List;", "", "getConcurrentCameraIds", "awaitConcurrentCameraIds", "()Ljava/util/Set;", "cameraId", "Landroidx/camera/camera2/pipe/CameraMetadata;", "getCameraMetadata-0r8Bogc", "(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getCameraMetadata", "awaitCameraMetadata-EfqyGwQ", "(Ljava/lang/String;)Landroidx/camera/camera2/pipe/CameraMetadata;", "awaitCameraMetadata", "Lkotlinx/coroutines/Deferred;", "", "disconnectAllAsync", "()Lkotlinx/coroutines/Deferred;", "shutdownAsync", "Landroidx/camera/camera2/pipe/CameraContext;", "cameraContext", "Landroidx/camera/camera2/pipe/CameraGraphId;", "graphId", "Landroidx/camera/camera2/pipe/CameraGraph$Config;", "graphConfig", "Landroidx/camera/camera2/pipe/graph/GraphListener;", "graphListener", "Landroidx/camera/camera2/pipe/StreamGraph;", "streamGraph", "Landroidx/camera/camera2/pipe/SurfaceTracker;", "surfaceTracker", "Landroidx/camera/camera2/pipe/CameraController;", "createCameraController", "(Landroidx/camera/camera2/pipe/CameraContext;Landroidx/camera/camera2/pipe/CameraGraphId;Landroidx/camera/camera2/pipe/CameraGraph$Config;Landroidx/camera/camera2/pipe/graph/GraphListener;Landroidx/camera/camera2/pipe/StreamGraph;Landroidx/camera/camera2/pipe/SurfaceTracker;)Landroidx/camera/camera2/pipe/CameraController;", "prewarm-EfqyGwQ", "(Ljava/lang/String;)V", "prewarm", "disconnect-EfqyGwQ", "disconnect", "disconnectAsync-EfqyGwQ", "(Ljava/lang/String;)Lkotlinx/coroutines/Deferred;", "disconnectAsync", "disconnectAll", "()V", "prewarmIsConfigSupported-EfqyGwQ", "prewarmIsConfigSupported", "Landroidx/camera/featurecombinationquery/CameraDeviceSetupCompat;", "prewarmGraphConfigQuery-0r8Bogc", "prewarmGraphConfigQuery", "Landroidx/camera/camera2/pipe/ConfigQueryResult;", "isConfigSupported-NpXggIU", "(Landroidx/camera/camera2/pipe/CameraGraph$Config;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "isConfigSupported", "Landroidx/camera/camera2/pipe/CameraBackendId;", "getId-QwmhuAM", "()Ljava/lang/String;", "id", "Lkotlinx/coroutines/flow/Flow;", "()Lkotlinx/coroutines/flow/Flow;", "cameraIds"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes.dex */
public interface CameraBackend {
    @kotlin.Deprecated(message = "Use prewarmIsConfigSupported instead")
    /* renamed from: prewarmGraphConfigQuery-0r8Bogc$suspendImpl, reason: not valid java name */
    static /* synthetic */ java.lang.Object m218prewarmGraphConfigQuery0r8Bogc$suspendImpl(androidx.camera.camera2.pipe.CameraBackend cameraBackend, java.lang.String str, kotlin.coroutines.Continuation<? super androidx.camera.featurecombinationquery.CameraDeviceSetupCompat> continuation) {
        return null;
    }

    java.util.List<androidx.camera.camera2.pipe.CameraId> awaitCameraIds();

    /* renamed from: awaitCameraMetadata-EfqyGwQ, reason: not valid java name */
    androidx.camera.camera2.pipe.CameraMetadata mo219awaitCameraMetadataEfqyGwQ(java.lang.String cameraId);

    java.util.Set<java.util.Set<androidx.camera.camera2.pipe.CameraId>> awaitConcurrentCameraIds();

    androidx.camera.camera2.pipe.CameraController createCameraController(androidx.camera.camera2.pipe.CameraContext cameraContext, androidx.camera.camera2.pipe.CameraGraphId graphId, androidx.camera.camera2.pipe.CameraGraph.Config graphConfig, androidx.camera.camera2.pipe.graph.GraphListener graphListener, androidx.camera.camera2.pipe.StreamGraph streamGraph, androidx.camera.camera2.pipe.SurfaceTracker surfaceTracker);

    /* renamed from: disconnect-EfqyGwQ, reason: not valid java name */
    void mo220disconnectEfqyGwQ(java.lang.String cameraId);

    void disconnectAll();

    kotlinx.coroutines.Deferred<kotlin.Unit> disconnectAllAsync();

    /* renamed from: disconnectAsync-EfqyGwQ, reason: not valid java name */
    kotlinx.coroutines.Deferred<kotlin.Unit> mo221disconnectAsyncEfqyGwQ(java.lang.String cameraId);

    /* renamed from: getId-QwmhuAM, reason: not valid java name */
    java.lang.String mo223getIdQwmhuAM();

    /* renamed from: prewarm-EfqyGwQ, reason: not valid java name */
    void mo225prewarmEfqyGwQ(java.lang.String cameraId);

    kotlinx.coroutines.Deferred<kotlin.Unit> shutdownAsync();

    @kotlin.Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public static final class DefaultImpls {
        @java.lang.Deprecated
        public static kotlinx.coroutines.flow.Flow<java.util.List<androidx.camera.camera2.pipe.CameraId>> getCameraIds(androidx.camera.camera2.pipe.CameraBackend cameraBackend) {
            return androidx.camera.camera2.pipe.CameraBackend.super.getCameraIds();
        }

        @java.lang.Deprecated
        public static java.lang.Object getCameraIds(androidx.camera.camera2.pipe.CameraBackend cameraBackend, kotlin.coroutines.Continuation<? super java.util.List<androidx.camera.camera2.pipe.CameraId>> continuation) {
            return androidx.camera.camera2.pipe.CameraBackend.super.getCameraIds(continuation);
        }

        @java.lang.Deprecated
        public static java.lang.Object getConcurrentCameraIds(androidx.camera.camera2.pipe.CameraBackend cameraBackend, kotlin.coroutines.Continuation<? super java.util.Set<? extends java.util.Set<androidx.camera.camera2.pipe.CameraId>>> continuation) {
            return androidx.camera.camera2.pipe.CameraBackend.super.getConcurrentCameraIds(continuation);
        }

        @java.lang.Deprecated
        /* renamed from: getCameraMetadata-0r8Bogc, reason: not valid java name */
        public static java.lang.Object m228getCameraMetadata0r8Bogc(androidx.camera.camera2.pipe.CameraBackend cameraBackend, java.lang.String str, kotlin.coroutines.Continuation<? super androidx.camera.camera2.pipe.CameraMetadata> continuation) {
            return androidx.camera.camera2.pipe.CameraBackend.super.mo222getCameraMetadata0r8Bogc(str, continuation);
        }

        @java.lang.Deprecated
        /* renamed from: prewarmIsConfigSupported-EfqyGwQ, reason: not valid java name */
        public static void m231prewarmIsConfigSupportedEfqyGwQ(androidx.camera.camera2.pipe.CameraBackend cameraBackend, java.lang.String str) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
            androidx.camera.camera2.pipe.CameraBackend.super.mo227prewarmIsConfigSupportedEfqyGwQ(str);
        }

        @kotlin.Deprecated(message = "Use prewarmIsConfigSupported instead")
        @java.lang.Deprecated
        /* renamed from: prewarmGraphConfigQuery-0r8Bogc, reason: not valid java name */
        public static java.lang.Object m230prewarmGraphConfigQuery0r8Bogc(androidx.camera.camera2.pipe.CameraBackend cameraBackend, java.lang.String str, kotlin.coroutines.Continuation<? super androidx.camera.featurecombinationquery.CameraDeviceSetupCompat> continuation) {
            return androidx.camera.camera2.pipe.CameraBackend.super.m226prewarmGraphConfigQuery0r8Bogc(str, continuation);
        }

        @java.lang.Deprecated
        /* renamed from: isConfigSupported-NpXggIU, reason: not valid java name */
        public static java.lang.Object m229isConfigSupportedNpXggIU(androidx.camera.camera2.pipe.CameraBackend cameraBackend, androidx.camera.camera2.pipe.CameraGraph.Config config, kotlin.coroutines.Continuation<? super androidx.camera.camera2.pipe.ConfigQueryResult> continuation) {
            return androidx.camera.camera2.pipe.CameraBackend.super.mo224isConfigSupportedNpXggIU(config, continuation);
        }
    }

    default kotlinx.coroutines.flow.Flow<java.util.List<androidx.camera.camera2.pipe.CameraId>> getCameraIds() {
        java.util.List<androidx.camera.camera2.pipe.CameraId> awaitCameraIds = awaitCameraIds();
        if (awaitCameraIds == null) {
            awaitCameraIds = kotlin.collections.CollectionsKt.emptyList();
        }
        return kotlinx.coroutines.flow.FlowKt.flowOf(awaitCameraIds);
    }

    static /* synthetic */ java.lang.Object getCameraIds$suspendImpl(androidx.camera.camera2.pipe.CameraBackend cameraBackend, kotlin.coroutines.Continuation<? super java.util.List<androidx.camera.camera2.pipe.CameraId>> continuation) {
        return cameraBackend.awaitCameraIds();
    }

    static /* synthetic */ java.lang.Object getConcurrentCameraIds$suspendImpl(androidx.camera.camera2.pipe.CameraBackend cameraBackend, kotlin.coroutines.Continuation<? super java.util.Set<? extends java.util.Set<androidx.camera.camera2.pipe.CameraId>>> continuation) {
        return cameraBackend.awaitConcurrentCameraIds();
    }

    /* renamed from: getCameraMetadata-0r8Bogc$suspendImpl, reason: not valid java name */
    static /* synthetic */ java.lang.Object m216getCameraMetadata0r8Bogc$suspendImpl(androidx.camera.camera2.pipe.CameraBackend cameraBackend, java.lang.String str, kotlin.coroutines.Continuation<? super androidx.camera.camera2.pipe.CameraMetadata> continuation) {
        return cameraBackend.mo219awaitCameraMetadataEfqyGwQ(str);
    }

    /* renamed from: isConfigSupported-NpXggIU$suspendImpl, reason: not valid java name */
    static /* synthetic */ java.lang.Object m217isConfigSupportedNpXggIU$suspendImpl(androidx.camera.camera2.pipe.CameraBackend cameraBackend, androidx.camera.camera2.pipe.CameraGraph.Config config, kotlin.coroutines.Continuation<? super androidx.camera.camera2.pipe.ConfigQueryResult> continuation) {
        return androidx.camera.camera2.pipe.ConfigQueryResult.m435boximpl(androidx.camera.camera2.pipe.ConfigQueryResult.INSTANCE.m443getUNKNOWNXp6DSB4());
    }

    /* renamed from: prewarmIsConfigSupported-EfqyGwQ, reason: not valid java name */
    default void mo227prewarmIsConfigSupportedEfqyGwQ(java.lang.String cameraId) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(cameraId, "");
    }

    @kotlin.Deprecated(message = "Use prewarmIsConfigSupported instead")
    /* renamed from: prewarmGraphConfigQuery-0r8Bogc, reason: not valid java name */
    default java.lang.Object m226prewarmGraphConfigQuery0r8Bogc(java.lang.String str, kotlin.coroutines.Continuation<? super androidx.camera.featurecombinationquery.CameraDeviceSetupCompat> continuation) {
        return m218prewarmGraphConfigQuery0r8Bogc$suspendImpl(this, str, continuation);
    }

    /* renamed from: isConfigSupported-NpXggIU, reason: not valid java name */
    default java.lang.Object mo224isConfigSupportedNpXggIU(androidx.camera.camera2.pipe.CameraGraph.Config config, kotlin.coroutines.Continuation<? super androidx.camera.camera2.pipe.ConfigQueryResult> continuation) {
        return m217isConfigSupportedNpXggIU$suspendImpl(this, config, continuation);
    }

    default java.lang.Object getConcurrentCameraIds(kotlin.coroutines.Continuation<? super java.util.Set<? extends java.util.Set<androidx.camera.camera2.pipe.CameraId>>> continuation) {
        return getConcurrentCameraIds$suspendImpl(this, continuation);
    }

    /* renamed from: getCameraMetadata-0r8Bogc, reason: not valid java name */
    default java.lang.Object mo222getCameraMetadata0r8Bogc(java.lang.String str, kotlin.coroutines.Continuation<? super androidx.camera.camera2.pipe.CameraMetadata> continuation) {
        return m216getCameraMetadata0r8Bogc$suspendImpl(this, str, continuation);
    }

    default java.lang.Object getCameraIds(kotlin.coroutines.Continuation<? super java.util.List<androidx.camera.camera2.pipe.CameraId>> continuation) {
        return getCameraIds$suspendImpl(this, continuation);
    }
}
