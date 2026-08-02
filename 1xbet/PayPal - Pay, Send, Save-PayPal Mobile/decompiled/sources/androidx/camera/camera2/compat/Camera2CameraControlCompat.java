package androidx.camera.camera2.compat;

@kotlin.Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001:\u0001\u0014J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H&¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\u0007\u001a\u00020\u0002H&¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\t\u001a\u00020\u0004H&¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\u000b\u001a\u00020\u0004H&¢\u0006\u0004\b\u000b\u0010\nJ+\u0010\u0012\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00110\u00102\b\u0010\r\u001a\u0004\u0018\u00010\f2\b\b\u0002\u0010\u000f\u001a\u00020\u000eH&¢\u0006\u0004\b\u0012\u0010\u0013ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001À\u0006\u0003"}, d2 = {"Landroidx/camera/camera2/compat/Camera2CameraControlCompat;", "Landroidx/camera/camera2/pipe/Request$Listener;", "Landroidx/camera/camera2/interop/CaptureRequestOptions;", "bundle", "", "addRequestOption", "(Landroidx/camera/camera2/interop/CaptureRequestOptions;)V", "getRequestOption", "()Landroidx/camera/camera2/interop/CaptureRequestOptions;", "clearRequestOption", "()V", "cancelCurrentTask", "Landroidx/camera/camera2/impl/UseCaseCameraRequestControl;", "requestControl", "", "cancelPreviousTask", "Lkotlinx/coroutines/Deferred;", "Ljava/lang/Void;", "applyAsync", "(Landroidx/camera/camera2/impl/UseCaseCameraRequestControl;Z)Lkotlinx/coroutines/Deferred;", "Bindings"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes.dex */
public interface Camera2CameraControlCompat extends androidx.camera.camera2.pipe.Request.Listener {

    @kotlin.Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b'\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H'¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Landroidx/camera/camera2/compat/Camera2CameraControlCompat$Bindings;", "", "<init>", "()V", "Landroidx/camera/camera2/compat/Camera2CameraControlCompatImpl;", "impl", "Landroidx/camera/camera2/compat/Camera2CameraControlCompat;", "bindCamera2CameraControlCompImpl", "(Landroidx/camera/camera2/compat/Camera2CameraControlCompatImpl;)Landroidx/camera/camera2/compat/Camera2CameraControlCompat;"}, k = 1, mv = {2, 1, 0}, xi = 48)
    @dagger.Module
    /* loaded from: classes6.dex */
    public static abstract class Bindings {
        @dagger.Binds
        public abstract androidx.camera.camera2.compat.Camera2CameraControlCompat bindCamera2CameraControlCompImpl(androidx.camera.camera2.compat.Camera2CameraControlCompatImpl impl);
    }

    void addRequestOption(androidx.camera.camera2.interop.CaptureRequestOptions bundle);

    kotlinx.coroutines.Deferred<java.lang.Void> applyAsync(androidx.camera.camera2.impl.UseCaseCameraRequestControl requestControl, boolean cancelPreviousTask);

    void cancelCurrentTask();

    void clearRequestOption();

    androidx.camera.camera2.interop.CaptureRequestOptions getRequestOption();

    @kotlin.Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public static final class DefaultImpls {
        @java.lang.Deprecated
        public static void onAborted(androidx.camera.camera2.compat.Camera2CameraControlCompat camera2CameraControlCompat, androidx.camera.camera2.pipe.Request request) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(request, "");
            androidx.camera.camera2.compat.Camera2CameraControlCompat.super.onAborted(request);
        }

        @kotlin.Deprecated(message = "Use the onBufferLost with OutputId.")
        @java.lang.Deprecated
        /* renamed from: onBufferLost-DlC0U5Y, reason: not valid java name */
        public static void m59onBufferLostDlC0U5Y(androidx.camera.camera2.compat.Camera2CameraControlCompat camera2CameraControlCompat, androidx.camera.camera2.pipe.RequestMetadata requestMetadata, long j, int i) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(requestMetadata, "");
            androidx.camera.camera2.compat.Camera2CameraControlCompat.super.m661onBufferLostDlC0U5Y(requestMetadata, j, i);
        }

        @java.lang.Deprecated
        /* renamed from: onBufferLost-iiEMlm4, reason: not valid java name */
        public static void m60onBufferLostiiEMlm4(androidx.camera.camera2.compat.Camera2CameraControlCompat camera2CameraControlCompat, androidx.camera.camera2.pipe.RequestMetadata requestMetadata, long j, int i, int i2) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(requestMetadata, "");
            androidx.camera.camera2.compat.Camera2CameraControlCompat.super.mo92onBufferLostiiEMlm4(requestMetadata, j, i, i2);
        }

        @java.lang.Deprecated
        public static void onCaptureProgress(androidx.camera.camera2.compat.Camera2CameraControlCompat camera2CameraControlCompat, androidx.camera.camera2.pipe.RequestMetadata requestMetadata, int i) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(requestMetadata, "");
            androidx.camera.camera2.compat.Camera2CameraControlCompat.super.onCaptureProgress(requestMetadata, i);
        }

        @java.lang.Deprecated
        /* renamed from: onComplete-CcXjc1I, reason: not valid java name */
        public static void m61onCompleteCcXjc1I(androidx.camera.camera2.compat.Camera2CameraControlCompat camera2CameraControlCompat, androidx.camera.camera2.pipe.RequestMetadata requestMetadata, long j, androidx.camera.camera2.pipe.FrameInfo frameInfo) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(requestMetadata, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(frameInfo, "");
            androidx.camera.camera2.compat.Camera2CameraControlCompat.super.mo36onCompleteCcXjc1I(requestMetadata, j, frameInfo);
        }

        @java.lang.Deprecated
        /* renamed from: onFailed-CcXjc1I, reason: not valid java name */
        public static void m62onFailedCcXjc1I(androidx.camera.camera2.compat.Camera2CameraControlCompat camera2CameraControlCompat, androidx.camera.camera2.pipe.RequestMetadata requestMetadata, long j, androidx.camera.camera2.pipe.RequestFailure requestFailure) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(requestMetadata, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(requestFailure, "");
            androidx.camera.camera2.compat.Camera2CameraControlCompat.super.mo37onFailedCcXjc1I(requestMetadata, j, requestFailure);
        }

        @java.lang.Deprecated
        /* renamed from: onPartialCaptureResult-CcXjc1I, reason: not valid java name */
        public static void m63onPartialCaptureResultCcXjc1I(androidx.camera.camera2.compat.Camera2CameraControlCompat camera2CameraControlCompat, androidx.camera.camera2.pipe.RequestMetadata requestMetadata, long j, androidx.camera.camera2.pipe.FrameMetadata frameMetadata) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(requestMetadata, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(frameMetadata, "");
            androidx.camera.camera2.compat.Camera2CameraControlCompat.super.mo93onPartialCaptureResultCcXjc1I(requestMetadata, j, frameMetadata);
        }

        @java.lang.Deprecated
        /* renamed from: onReadoutStarted-mP9r-9w, reason: not valid java name */
        public static void m64onReadoutStartedmP9r9w(androidx.camera.camera2.compat.Camera2CameraControlCompat camera2CameraControlCompat, androidx.camera.camera2.pipe.RequestMetadata requestMetadata, long j, long j2) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(requestMetadata, "");
            androidx.camera.camera2.compat.Camera2CameraControlCompat.super.mo94onReadoutStartedmP9r9w(requestMetadata, j, j2);
        }

        @java.lang.Deprecated
        public static void onRequestSequenceAborted(androidx.camera.camera2.compat.Camera2CameraControlCompat camera2CameraControlCompat, androidx.camera.camera2.pipe.RequestMetadata requestMetadata) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(requestMetadata, "");
            androidx.camera.camera2.compat.Camera2CameraControlCompat.super.onRequestSequenceAborted(requestMetadata);
        }

        @java.lang.Deprecated
        /* renamed from: onRequestSequenceCompleted-RuT0dZU, reason: not valid java name */
        public static void m65onRequestSequenceCompletedRuT0dZU(androidx.camera.camera2.compat.Camera2CameraControlCompat camera2CameraControlCompat, androidx.camera.camera2.pipe.RequestMetadata requestMetadata, long j) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(requestMetadata, "");
            androidx.camera.camera2.compat.Camera2CameraControlCompat.super.mo95onRequestSequenceCompletedRuT0dZU(requestMetadata, j);
        }

        @java.lang.Deprecated
        public static void onRequestSequenceCreated(androidx.camera.camera2.compat.Camera2CameraControlCompat camera2CameraControlCompat, androidx.camera.camera2.pipe.RequestMetadata requestMetadata) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(requestMetadata, "");
            androidx.camera.camera2.compat.Camera2CameraControlCompat.super.onRequestSequenceCreated(requestMetadata);
        }

        @java.lang.Deprecated
        public static void onRequestSequenceSubmitted(androidx.camera.camera2.compat.Camera2CameraControlCompat camera2CameraControlCompat, androidx.camera.camera2.pipe.RequestMetadata requestMetadata) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(requestMetadata, "");
            androidx.camera.camera2.compat.Camera2CameraControlCompat.super.onRequestSequenceSubmitted(requestMetadata);
        }

        @java.lang.Deprecated
        /* renamed from: onStarted-uGKBvU4, reason: not valid java name */
        public static void m66onStarteduGKBvU4(androidx.camera.camera2.compat.Camera2CameraControlCompat camera2CameraControlCompat, androidx.camera.camera2.pipe.RequestMetadata requestMetadata, long j, long j2) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(requestMetadata, "");
            androidx.camera.camera2.compat.Camera2CameraControlCompat.super.mo96onStarteduGKBvU4(requestMetadata, j, j2);
        }

        @java.lang.Deprecated
        /* renamed from: onTotalCaptureResult-CcXjc1I, reason: not valid java name */
        public static void m67onTotalCaptureResultCcXjc1I(androidx.camera.camera2.compat.Camera2CameraControlCompat camera2CameraControlCompat, androidx.camera.camera2.pipe.RequestMetadata requestMetadata, long j, androidx.camera.camera2.pipe.FrameInfo frameInfo) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(requestMetadata, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(frameInfo, "");
            androidx.camera.camera2.compat.Camera2CameraControlCompat.super.mo38onTotalCaptureResultCcXjc1I(requestMetadata, j, frameInfo);
        }
    }

    static /* synthetic */ kotlinx.coroutines.Deferred applyAsync$default(androidx.camera.camera2.compat.Camera2CameraControlCompat camera2CameraControlCompat, androidx.camera.camera2.impl.UseCaseCameraRequestControl useCaseCameraRequestControl, boolean z, int i, java.lang.Object obj) {
        if (obj != null) {
            throw new java.lang.UnsupportedOperationException("Super calls with default arguments not supported in this target, function: applyAsync");
        }
        if ((i & 2) != 0) {
            z = true;
        }
        return camera2CameraControlCompat.applyAsync(useCaseCameraRequestControl, z);
    }
}
