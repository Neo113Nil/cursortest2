package androidx.camera.camera2.compat;

@androidx.camera.camera2.config.CameraScope
@kotlin.Metadata(d1 = {"\u0000b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\t\b\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\t\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\u000b\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u000b\u0010\u0003J\u000f\u0010\f\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\f\u0010\u0003J)\u0010\u0013\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00120\u00112\b\u0010\u000e\u001a\u0004\u0018\u00010\r2\u0006\u0010\u0010\u001a\u00020\u000fH\u0016¢\u0006\u0004\b\u0013\u0010\u0014J-\u0010\u0018\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00120\u0015*\n\u0012\u0006\u0012\u0004\u0018\u00010\u00120\u00152\b\b\u0002\u0010\u0017\u001a\u00020\u0016H\u0002¢\u0006\u0004\b\u0018\u0010\u0019J'\u0010\"\u001a\u00020\u00062\u0006\u0010\u001b\u001a\u00020\u001a2\u0006\u0010\u001d\u001a\u00020\u001c2\u0006\u0010\u001f\u001a\u00020\u001eH\u0016¢\u0006\u0004\b \u0010!R\u0014\u0010&\u001a\u00020#8\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b$\u0010%R\u0014\u0010'\u001a\u00020#8\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b'\u0010%R\u0016\u0010*\u001a\u00020(8\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b\u0018\u0010)R \u0010$\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0012\u0018\u00010\u00158\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b&\u0010+R \u0010\u0018\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0012\u0018\u00010\u00158\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b*\u0010+"}, d2 = {"Landroidx/camera/camera2/compat/Camera2CameraControlCompatImpl;", "Landroidx/camera/camera2/compat/Camera2CameraControlCompat;", "<init>", "()V", "Landroidx/camera/camera2/interop/CaptureRequestOptions;", "bundle", "", "addRequestOption", "(Landroidx/camera/camera2/interop/CaptureRequestOptions;)V", "getRequestOption", "()Landroidx/camera/camera2/interop/CaptureRequestOptions;", "clearRequestOption", "cancelCurrentTask", "Landroidx/camera/camera2/impl/UseCaseCameraRequestControl;", "requestControl", "", "cancelPreviousTask", "Lkotlinx/coroutines/Deferred;", "Ljava/lang/Void;", "applyAsync", "(Landroidx/camera/camera2/impl/UseCaseCameraRequestControl;Z)Lkotlinx/coroutines/Deferred;", "Lkotlinx/coroutines/CompletableDeferred;", "", "p0", "getHighSpeedVideoFpsRangesFor", "(Lkotlinx/coroutines/CompletableDeferred;Ljava/lang/String;)Lkotlinx/coroutines/CompletableDeferred;", "Landroidx/camera/camera2/pipe/RequestMetadata;", "requestMetadata", "Landroidx/camera/camera2/pipe/FrameNumber;", "frameNumber", "Landroidx/camera/camera2/pipe/FrameInfo;", "result", "onComplete-CcXjc1I", "(Landroidx/camera/camera2/pipe/RequestMetadata;JLandroidx/camera/camera2/pipe/FrameInfo;)V", "onComplete", "", "getHighSpeedVideoSizes", "Ljava/lang/Object;", "getHighResolutionOutputSizeshNQ4ISI", "Camera2StreamConfigurationMap", "Landroidx/camera/camera2/impl/Camera2ImplConfig$Builder;", "Landroidx/camera/camera2/impl/Camera2ImplConfig$Builder;", "getHighSpeedVideoFpsRanges", "Lkotlinx/coroutines/CompletableDeferred;"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class Camera2CameraControlCompatImpl implements androidx.camera.camera2.compat.Camera2CameraControlCompat {

    /* renamed from: getHighResolutionOutputSizeshNQ4ISI, reason: from kotlin metadata */
    private kotlinx.coroutines.CompletableDeferred<java.lang.Void> getHighSpeedVideoSizes;

    /* renamed from: getHighSpeedVideoFpsRanges, reason: from kotlin metadata */
    private kotlinx.coroutines.CompletableDeferred<java.lang.Void> getHighSpeedVideoFpsRangesFor;

    /* renamed from: getHighSpeedVideoSizes, reason: from kotlin metadata */
    private final java.lang.Object getHighResolutionOutputSizeshNQ4ISI = new java.lang.Object();
    private final java.lang.Object Camera2StreamConfigurationMap = new java.lang.Object();

    /* renamed from: getHighSpeedVideoFpsRangesFor, reason: from kotlin metadata */
    private androidx.camera.camera2.impl.Camera2ImplConfig.Builder getHighSpeedVideoFpsRanges = new androidx.camera.camera2.impl.Camera2ImplConfig.Builder();

    @javax.inject.Inject
    public Camera2CameraControlCompatImpl() {
    }

    @Override // androidx.camera.camera2.compat.Camera2CameraControlCompat
    public final void addRequestOption(androidx.camera.camera2.interop.CaptureRequestOptions bundle) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(bundle, "");
        synchronized (this.getHighResolutionOutputSizeshNQ4ISI) {
            for (androidx.camera.core.impl.Config.Option<?> option : bundle.listOptions()) {
                kotlin.jvm.internal.Intrinsics.checkNotNull(option, "");
                this.getHighSpeedVideoFpsRanges.getMutableConfig().insertOption(option, androidx.camera.core.impl.Config.OptionPriority.ALWAYS_OVERRIDE, bundle.retrieveOption(option));
            }
            kotlin.Unit unit = kotlin.Unit.INSTANCE;
        }
    }

    @Override // androidx.camera.camera2.compat.Camera2CameraControlCompat
    public final androidx.camera.camera2.interop.CaptureRequestOptions getRequestOption() {
        androidx.camera.camera2.interop.CaptureRequestOptions build;
        synchronized (this.getHighResolutionOutputSizeshNQ4ISI) {
            build = androidx.camera.camera2.interop.CaptureRequestOptions.Builder.INSTANCE.from(this.getHighSpeedVideoFpsRanges.build()).build();
        }
        return build;
    }

    @Override // androidx.camera.camera2.compat.Camera2CameraControlCompat
    public final void clearRequestOption() {
        synchronized (this.getHighResolutionOutputSizeshNQ4ISI) {
            this.getHighSpeedVideoFpsRanges = new androidx.camera.camera2.impl.Camera2ImplConfig.Builder();
            kotlin.Unit unit = kotlin.Unit.INSTANCE;
        }
    }

    @Override // androidx.camera.camera2.compat.Camera2CameraControlCompat
    public final void cancelCurrentTask() {
        synchronized (this.Camera2StreamConfigurationMap) {
            kotlinx.coroutines.CompletableDeferred<java.lang.Void> completableDeferred = this.getHighSpeedVideoSizes;
            if (completableDeferred != null) {
                this.getHighSpeedVideoSizes = null;
                getHighSpeedVideoFpsRangesFor(completableDeferred, "The camera control has became inactive.");
            }
            kotlinx.coroutines.CompletableDeferred<java.lang.Void> completableDeferred2 = this.getHighSpeedVideoFpsRangesFor;
            if (completableDeferred2 != null) {
                this.getHighSpeedVideoFpsRangesFor = null;
                getHighSpeedVideoFpsRangesFor(completableDeferred2, "The camera control has became inactive.");
            }
            kotlin.Unit unit = kotlin.Unit.INSTANCE;
        }
    }

    @Override // androidx.camera.camera2.compat.Camera2CameraControlCompat
    public final kotlinx.coroutines.Deferred<java.lang.Void> applyAsync(androidx.camera.camera2.impl.UseCaseCameraRequestControl requestControl, boolean cancelPreviousTask) {
        androidx.camera.camera2.impl.Camera2ImplConfig build;
        kotlinx.coroutines.CompletableDeferred<java.lang.Void> CompletableDeferred$default = kotlinx.coroutines.CompletableDeferredKt.CompletableDeferred$default(null, 1, null);
        synchronized (this.getHighResolutionOutputSizeshNQ4ISI) {
            build = this.getHighSpeedVideoFpsRanges.build();
        }
        synchronized (this.Camera2StreamConfigurationMap) {
            if (requestControl != null) {
                if (cancelPreviousTask) {
                    kotlinx.coroutines.CompletableDeferred<java.lang.Void> completableDeferred = this.getHighSpeedVideoSizes;
                    if (completableDeferred != null) {
                        getHighSpeedVideoFpsRangesFor$default(this, completableDeferred, null, 1, null);
                    }
                } else {
                    kotlinx.coroutines.CompletableDeferred<java.lang.Void> completableDeferred2 = this.getHighSpeedVideoSizes;
                    if (completableDeferred2 != null) {
                        androidx.camera.camera2.adapter.CoroutineAdaptersKt.propagateTo(CompletableDeferred$default, completableDeferred2);
                    }
                }
                this.getHighSpeedVideoSizes = CompletableDeferred$default;
                requestControl.updateCamera2ConfigAsync(build, kotlin.collections.MapsKt.mapOf(kotlin.TuplesKt.to("Camera2CameraControl.tag", java.lang.Integer.valueOf(CompletableDeferred$default.hashCode()))));
            } else {
                kotlinx.coroutines.CompletableDeferred<java.lang.Void> completableDeferred3 = this.getHighSpeedVideoFpsRangesFor;
                if (completableDeferred3 != null) {
                    getHighSpeedVideoFpsRangesFor$default(this, completableDeferred3, null, 1, null);
                }
                this.getHighSpeedVideoFpsRangesFor = CompletableDeferred$default;
                kotlin.Unit unit = kotlin.Unit.INSTANCE;
            }
        }
        return CompletableDeferred$default;
    }

    static /* synthetic */ kotlinx.coroutines.CompletableDeferred getHighSpeedVideoFpsRangesFor$default(androidx.camera.camera2.compat.Camera2CameraControlCompatImpl camera2CameraControlCompatImpl, kotlinx.coroutines.CompletableDeferred completableDeferred, java.lang.String str, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            str = "Camera2CameraControl was updated with new options.";
        }
        return camera2CameraControlCompatImpl.getHighSpeedVideoFpsRangesFor(completableDeferred, str);
    }

    private final kotlinx.coroutines.CompletableDeferred<java.lang.Void> getHighSpeedVideoFpsRangesFor(kotlinx.coroutines.CompletableDeferred<java.lang.Void> completableDeferred, java.lang.String str) {
        completableDeferred.completeExceptionally(new androidx.camera.core.CameraControl.OperationCanceledException(str));
        return completableDeferred;
    }

    @Override // androidx.camera.camera2.pipe.Request.Listener
    /* renamed from: onComplete-CcXjc1I */
    public final void mo36onCompleteCcXjc1I(androidx.camera.camera2.pipe.RequestMetadata requestMetadata, long frameNumber, androidx.camera.camera2.pipe.FrameInfo result) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(requestMetadata, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(result, "");
        synchronized (this.Camera2StreamConfigurationMap) {
            kotlinx.coroutines.CompletableDeferred<java.lang.Void> completableDeferred = this.getHighSpeedVideoSizes;
            if (completableDeferred != null && androidx.camera.camera2.impl.ComboRequestListenerKt.containsTag(requestMetadata, "Camera2CameraControl.tag", java.lang.Integer.valueOf(completableDeferred.hashCode()))) {
                completableDeferred.complete(null);
                this.getHighSpeedVideoSizes = null;
                kotlinx.coroutines.CompletableDeferred<java.lang.Void> completableDeferred2 = this.getHighSpeedVideoFpsRangesFor;
                if (completableDeferred2 != null) {
                    completableDeferred2.complete(null);
                    this.getHighSpeedVideoFpsRangesFor = null;
                }
            }
            kotlin.Unit unit = kotlin.Unit.INSTANCE;
        }
    }
}
