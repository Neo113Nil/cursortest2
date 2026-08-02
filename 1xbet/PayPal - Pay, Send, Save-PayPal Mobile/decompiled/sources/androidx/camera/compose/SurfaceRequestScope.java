package androidx.camera.compose;

@kotlin.Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0002\u0018\u0000 \u00142\u00020\u0001:\u0001\u0014B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u001c\u0010\t\u001a\u00020\b*\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u0007H\u0086@¢\u0006\u0004\b\t\u0010\nR\u0017\u0010\u000e\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\t\u0010\u000b\u001a\u0004\b\f\u0010\rR \u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00060\u000f8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013"}, d2 = {"Landroidx/camera/compose/SurfaceRequestScope;", "", "Landroidx/camera/viewfinder/core/ViewfinderSurfaceRequest;", "p0", "<init>", "(Landroidx/camera/viewfinder/core/ViewfinderSurfaceRequest;)V", "Landroidx/camera/core/SurfaceRequest;", "Landroid/view/Surface;", "Landroidx/camera/core/SurfaceRequest$Result;", "getHighResolutionOutputSizeshNQ4ISI", "(Landroidx/camera/core/SurfaceRequest;Landroid/view/Surface;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Landroidx/camera/viewfinder/core/ViewfinderSurfaceRequest;", "getHighSpeedVideoFpsRangesFor", "()Landroidx/camera/viewfinder/core/ViewfinderSurfaceRequest;", "Camera2StreamConfigurationMap", "Lkotlinx/coroutines/channels/Channel;", "getHighSpeedVideoFpsRanges", "Lkotlinx/coroutines/channels/Channel;", "getHighSpeedVideoSizes", "()Lkotlinx/coroutines/channels/Channel;", "Companion"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes6.dex */
final class SurfaceRequestScope {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final androidx.camera.compose.SurfaceRequestScope.Companion INSTANCE = new androidx.camera.compose.SurfaceRequestScope.Companion(null);

    /* renamed from: getHighResolutionOutputSizeshNQ4ISI, reason: from kotlin metadata */
    final androidx.camera.viewfinder.core.ViewfinderSurfaceRequest Camera2StreamConfigurationMap;

    /* renamed from: getHighSpeedVideoFpsRanges, reason: from kotlin metadata */
    final kotlinx.coroutines.channels.Channel<androidx.camera.core.SurfaceRequest> getHighSpeedVideoFpsRangesFor = kotlinx.coroutines.channels.ChannelKt.Channel$default(0, null, new kotlin.jvm.functions.Function1() { // from class: androidx.camera.compose.SurfaceRequestScope$$ExternalSyntheticLambda0
        @Override // kotlin.jvm.functions.Function1
        public final java.lang.Object invoke(java.lang.Object obj) {
            return androidx.camera.compose.SurfaceRequestScope.Camera2StreamConfigurationMap((androidx.camera.core.SurfaceRequest) obj);
        }
    }, 2, null);

    public SurfaceRequestScope(androidx.camera.viewfinder.core.ViewfinderSurfaceRequest viewfinderSurfaceRequest) {
        this.Camera2StreamConfigurationMap = viewfinderSurfaceRequest;
    }

    /* renamed from: getHighSpeedVideoFpsRangesFor, reason: from getter */
    public final androidx.camera.viewfinder.core.ViewfinderSurfaceRequest getCamera2StreamConfigurationMap() {
        return this.Camera2StreamConfigurationMap;
    }

    public final kotlinx.coroutines.channels.Channel<androidx.camera.core.SurfaceRequest> getHighSpeedVideoSizes() {
        return this.getHighSpeedVideoFpsRangesFor;
    }

    @kotlin.Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001d\u0010\t\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\t\u0010\n"}, d2 = {"Landroidx/camera/compose/SurfaceRequestScope$Companion;", "", "<init>", "()V", "Landroidx/camera/core/SurfaceRequest;", "surfaceRequest", "Landroidx/camera/viewfinder/core/ImplementationMode;", "implementationMode", "Landroidx/camera/compose/SurfaceRequestScope;", "createFrom", "(Landroidx/camera/core/SurfaceRequest;Landroidx/camera/viewfinder/core/ImplementationMode;)Landroidx/camera/compose/SurfaceRequestScope;"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        public final androidx.camera.compose.SurfaceRequestScope createFrom(androidx.camera.core.SurfaceRequest surfaceRequest, androidx.camera.viewfinder.core.ImplementationMode implementationMode) {
            int width = surfaceRequest.getResolution().getWidth();
            int height = surfaceRequest.getResolution().getHeight();
            java.lang.StringBuilder sb = new java.lang.StringBuilder("CXSurfaceRequest-");
            java.lang.String format = java.lang.String.format("%x", java.util.Arrays.copyOf(new java.lang.Object[]{java.lang.Integer.valueOf(surfaceRequest.hashCode())}, 1));
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(format, "");
            sb.append(format);
            return new androidx.camera.compose.SurfaceRequestScope(new androidx.camera.viewfinder.core.ViewfinderSurfaceRequest(width, height, implementationMode, sb.toString()));
        }

        public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public static java.lang.Object getHighResolutionOutputSizeshNQ4ISI(androidx.camera.core.SurfaceRequest surfaceRequest, android.view.Surface surface, kotlin.coroutines.Continuation<? super androidx.camera.core.SurfaceRequest.Result> continuation) {
        kotlinx.coroutines.CancellableContinuationImpl cancellableContinuationImpl = new kotlinx.coroutines.CancellableContinuationImpl(kotlin.coroutines.intrinsics.IntrinsicsKt.intercepted(continuation), 1);
        cancellableContinuationImpl.initCancellability();
        final kotlinx.coroutines.CancellableContinuationImpl cancellableContinuationImpl2 = cancellableContinuationImpl;
        surfaceRequest.provideSurface(surface, new androidx.camera.compose.CameraXViewfinderKt$CameraXViewfinder$viewfinderArgs$2$1$$ExternalSyntheticLambda0(), new androidx.core.util.Consumer() { // from class: androidx.camera.compose.SurfaceRequestScope$provideSurfaceAndWaitForCompletion$2$2
            @Override // androidx.core.util.Consumer
            public final /* synthetic */ void accept(java.lang.Object obj) {
                kotlinx.coroutines.CancellableContinuation<androidx.camera.core.SurfaceRequest.Result> cancellableContinuation = cancellableContinuationImpl2;
                kotlin.Result.Companion companion = kotlin.Result.INSTANCE;
                cancellableContinuation.resumeWith(kotlin.Result.m23436constructorimpl((androidx.camera.core.SurfaceRequest.Result) obj));
            }
        });
        cancellableContinuationImpl2.invokeOnCancellation(new kotlin.jvm.functions.Function1<java.lang.Throwable, kotlin.Unit>() { // from class: androidx.camera.compose.SurfaceRequestScope$provideSurfaceAndWaitForCompletion$2$3
            @Override // kotlin.jvm.functions.Function1
            public final /* bridge */ /* synthetic */ kotlin.Unit invoke(java.lang.Throwable th) {
                return kotlin.Unit.INSTANCE;
            }
        });
        java.lang.Object result = cancellableContinuationImpl.getResult();
        if (result == kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
            kotlin.coroutines.jvm.internal.DebugProbesKt.probeCoroutineSuspended(continuation);
        }
        return result;
    }

    public static /* synthetic */ kotlin.Unit Camera2StreamConfigurationMap(androidx.camera.core.SurfaceRequest surfaceRequest) {
        surfaceRequest.willNotProvideSurface();
        return kotlin.Unit.INSTANCE;
    }
}
