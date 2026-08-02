package com.miteksystems.misnap.camera.util;

@kotlin.Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\bÆ\u0002\u0018\u00002\u00020\u0001:\u0001\u0019B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J@\u0010\u000f\u001a\u00020\r2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\b2\u0017\u0010\u000e\u001a\u0013\u0012\t\u0012\u00070\u000b¢\u0006\u0002\b\f\u0012\u0004\u0012\u00020\r0\nH\u0007¢\u0006\u0004\b\u000f\u0010\u0010J@\u0010\u0015\u001a\u00020\r2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0014\u001a\u00020\u00132\u0017\u0010\u000e\u001a\u0013\u0012\t\u0012\u00070\u000b¢\u0006\u0002\b\f\u0012\u0004\u0012\u00020\r0\nH\u0000¢\u0006\u0004\b\u0015\u0010\u0016J\u0017\u0010\u0017\u001a\u00020\u00132\u0006\u0010\t\u001a\u00020\bH\u0000¢\u0006\u0004\b\u0017\u0010\u0018"}, d2 = {"Lcom/miteksystems/misnap/camera/util/CameraUtil;", "", "<init>", "()V", "Landroid/content/Context;", "context", "Landroidx/lifecycle/LifecycleOwner;", "lifecycleOwner", "Lcom/miteksystems/misnap/core/MiSnapSettings$Camera;", "cameraSettings", "Lkotlin/Function1;", "Lcom/miteksystems/misnap/camera/util/CameraUtil$CameraSupportResult;", "Lkotlin/ParameterName;", "", "cameraSupportResultListener", "findSupportedCamera", "(Landroid/content/Context;Landroidx/lifecycle/LifecycleOwner;Lcom/miteksystems/misnap/core/MiSnapSettings$Camera;Lkotlin/jvm/functions/Function1;)V", "Lcom/miteksystems/misnap/camera/frameproducers/FrameProducer;", "frameProducer", "Lcom/miteksystems/misnap/camera/requirements/CameraSelectorFilter;", "cameraSelectorFilter", "requestOpenCameraInstance$camera_release", "(Landroidx/lifecycle/LifecycleOwner;Lcom/miteksystems/misnap/camera/frameproducers/FrameProducer;Lcom/miteksystems/misnap/camera/requirements/CameraSelectorFilter;Lkotlin/jvm/functions/Function1;)V", "getCameraSelectorFilter$camera_release", "(Lcom/miteksystems/misnap/core/MiSnapSettings$Camera;)Lcom/miteksystems/misnap/camera/requirements/CameraSelectorFilter;", "CameraSupportResult"}, k = 1, mv = {1, 8, 0})
/* loaded from: classes10.dex */
public final class CameraUtil {
    public static final com.miteksystems.misnap.camera.util.CameraUtil INSTANCE = new com.miteksystems.misnap.camera.util.CameraUtil();

    public static /* synthetic */ void $r8$lambda$YEIy8svh6C7Kq2yB0DjHdRopYR0(kotlin.jvm.functions.Function1 function1, com.miteksystems.misnap.camera.frameproducers.FrameProducer frameProducer, com.miteksystems.misnap.camera.frameproducers.FrameProducer.Event event) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(function1, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(frameProducer, "");
        if (event instanceof com.miteksystems.misnap.camera.frameproducers.FrameProducer.Event.CameraInitialized) {
            function1.invoke(new com.miteksystems.misnap.camera.util.CameraUtil.CameraSupportResult.Success(((com.miteksystems.misnap.camera.frameproducers.FrameProducer.Event.CameraInitialized) event).getCameraInfo()));
        } else {
            function1.invoke(event instanceof com.miteksystems.misnap.camera.frameproducers.FrameProducer.Event.InitializationError.InsufficientCamera ? com.miteksystems.misnap.camera.util.CameraUtil.CameraSupportResult.Error.CameraNotFound.INSTANCE : event instanceof com.miteksystems.misnap.camera.frameproducers.FrameProducer.Event.InitializationError.CameraNotAvailable ? com.miteksystems.misnap.camera.util.CameraUtil.CameraSupportResult.Error.CameraNotAvailable.INSTANCE : com.miteksystems.misnap.camera.util.CameraUtil.CameraSupportResult.Error.Execution.INSTANCE);
        }
        frameProducer.release();
    }

    @kotlin.jvm.JvmStatic
    public static final void findSupportedCamera(android.content.Context context, androidx.view.LifecycleOwner lifecycleOwner, com.miteksystems.misnap.core.MiSnapSettings.Camera cameraSettings, kotlin.jvm.functions.Function1<? super com.miteksystems.misnap.camera.util.CameraUtil.CameraSupportResult, kotlin.Unit> cameraSupportResultListener) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(lifecycleOwner, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(cameraSettings, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(cameraSupportResultListener, "");
        com.miteksystems.misnap.camera.util.CameraUtil cameraUtil = INSTANCE;
        com.miteksystems.misnap.core.MiSnapSettings.Camera.Advanced.FrameInjection frameInjection = cameraSettings.advanced.getFrameInjection();
        cameraUtil.requestOpenCameraInstance$camera_release(lifecycleOwner, frameInjection != null ? new com.miteksystems.misnap.camera.frameproducers.FrameLoader(context, frameInjection) : new com.miteksystems.misnap.camera.frameproducers.CameraWrapper(context, lifecycleOwner, cameraSettings), cameraUtil.getCameraSelectorFilter$camera_release(cameraSettings), cameraSupportResultListener);
    }

    @kotlin.Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\b6\u0018\u00002\u00020\u0001:\u0002\u0004\u0005B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0002\u0006\u0007"}, d2 = {"Lcom/miteksystems/misnap/camera/util/CameraUtil$CameraSupportResult;", "", "<init>", "()V", "Error", "Success", "Lcom/miteksystems/misnap/camera/util/CameraUtil$CameraSupportResult$Error;", "Lcom/miteksystems/misnap/camera/util/CameraUtil$CameraSupportResult$Success;"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static abstract class CameraSupportResult {

        @kotlin.Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\b6\u0018\u00002\u00020\u0001:\u0003\u0004\u0005\u0006B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0003\u0007\b\t"}, d2 = {"Lcom/miteksystems/misnap/camera/util/CameraUtil$CameraSupportResult$Error;", "Lcom/miteksystems/misnap/camera/util/CameraUtil$CameraSupportResult;", "<init>", "()V", "CameraNotAvailable", "CameraNotFound", "Execution", "Lcom/miteksystems/misnap/camera/util/CameraUtil$CameraSupportResult$Error$CameraNotAvailable;", "Lcom/miteksystems/misnap/camera/util/CameraUtil$CameraSupportResult$Error$CameraNotFound;", "Lcom/miteksystems/misnap/camera/util/CameraUtil$CameraSupportResult$Error$Execution;"}, k = 1, mv = {1, 8, 0}, xi = 48)
        public static abstract class Error extends com.miteksystems.misnap.camera.util.CameraUtil.CameraSupportResult {
            private Error() {
                super(null);
            }

            public /* synthetic */ Error(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            @kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lcom/miteksystems/misnap/camera/util/CameraUtil$CameraSupportResult$Error$CameraNotAvailable;", "Lcom/miteksystems/misnap/camera/util/CameraUtil$CameraSupportResult$Error;", "<init>", "()V"}, k = 1, mv = {1, 8, 0}, xi = 48)
            public static final class CameraNotAvailable extends com.miteksystems.misnap.camera.util.CameraUtil.CameraSupportResult.Error {
                public static final com.miteksystems.misnap.camera.util.CameraUtil.CameraSupportResult.Error.CameraNotAvailable INSTANCE = new com.miteksystems.misnap.camera.util.CameraUtil.CameraSupportResult.Error.CameraNotAvailable();

                private CameraNotAvailable() {
                    super(null);
                }
            }

            @kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lcom/miteksystems/misnap/camera/util/CameraUtil$CameraSupportResult$Error$CameraNotFound;", "Lcom/miteksystems/misnap/camera/util/CameraUtil$CameraSupportResult$Error;", "<init>", "()V"}, k = 1, mv = {1, 8, 0}, xi = 48)
            public static final class CameraNotFound extends com.miteksystems.misnap.camera.util.CameraUtil.CameraSupportResult.Error {
                public static final com.miteksystems.misnap.camera.util.CameraUtil.CameraSupportResult.Error.CameraNotFound INSTANCE = new com.miteksystems.misnap.camera.util.CameraUtil.CameraSupportResult.Error.CameraNotFound();

                private CameraNotFound() {
                    super(null);
                }
            }

            @kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lcom/miteksystems/misnap/camera/util/CameraUtil$CameraSupportResult$Error$Execution;", "Lcom/miteksystems/misnap/camera/util/CameraUtil$CameraSupportResult$Error;", "<init>", "()V"}, k = 1, mv = {1, 8, 0}, xi = 48)
            public static final class Execution extends com.miteksystems.misnap.camera.util.CameraUtil.CameraSupportResult.Error {
                public static final com.miteksystems.misnap.camera.util.CameraUtil.CameraSupportResult.Error.Execution INSTANCE = new com.miteksystems.misnap.camera.util.CameraUtil.CameraSupportResult.Error.Execution();

                private Execution() {
                    super(null);
                }
            }
        }

        public /* synthetic */ CameraSupportResult(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @kotlin.Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\t"}, d2 = {"Lcom/miteksystems/misnap/camera/util/CameraUtil$CameraSupportResult$Success;", "Lcom/miteksystems/misnap/camera/util/CameraUtil$CameraSupportResult;", "Lcom/miteksystems/misnap/core/MiSnapCameraInfo;", "cameraInfo", "<init>", "(Lcom/miteksystems/misnap/core/MiSnapCameraInfo;)V", "a", "Lcom/miteksystems/misnap/core/MiSnapCameraInfo;", "getCameraInfo", "()Lcom/miteksystems/misnap/core/MiSnapCameraInfo;"}, k = 1, mv = {1, 8, 0})
        public static final class Success extends com.miteksystems.misnap.camera.util.CameraUtil.CameraSupportResult {

            /* renamed from: a, reason: collision with root package name and from kotlin metadata */
            private final com.miteksystems.misnap.core.MiSnapCameraInfo cameraInfo;

            public final com.miteksystems.misnap.core.MiSnapCameraInfo getCameraInfo() {
                return this.cameraInfo;
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public Success(com.miteksystems.misnap.core.MiSnapCameraInfo miSnapCameraInfo) {
                super(null);
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(miSnapCameraInfo, "");
                this.cameraInfo = miSnapCameraInfo;
            }
        }

        private CameraSupportResult() {
        }
    }

    public final /* synthetic */ void requestOpenCameraInstance$camera_release(androidx.view.LifecycleOwner lifecycleOwner, final com.miteksystems.misnap.camera.frameproducers.FrameProducer frameProducer, com.miteksystems.misnap.camera.requirements.CameraSelectorFilter cameraSelectorFilter, final kotlin.jvm.functions.Function1 cameraSupportResultListener) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(lifecycleOwner, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(frameProducer, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(cameraSelectorFilter, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(cameraSupportResultListener, "");
        com.miteksystems.misnap.core.LiveDataUtil.INSTANCE.observeOnce(frameProducer.getFrameProducerEvents(), lifecycleOwner, new androidx.view.Observer() { // from class: com.miteksystems.misnap.camera.util.CameraUtil$$ExternalSyntheticLambda0
            @Override // androidx.view.Observer
            public final void onChanged(java.lang.Object obj) {
                com.miteksystems.misnap.camera.util.CameraUtil.$r8$lambda$YEIy8svh6C7Kq2yB0DjHdRopYR0(kotlin.jvm.functions.Function1.this, frameProducer, (com.miteksystems.misnap.camera.frameproducers.FrameProducer.Event) obj);
            }
        });
        frameProducer.openCameraInstance(cameraSelectorFilter);
    }

    public final /* synthetic */ com.miteksystems.misnap.camera.requirements.CameraSelectorFilter getCameraSelectorFilter$camera_release(com.miteksystems.misnap.core.MiSnapSettings.Camera cameraSettings) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(cameraSettings, "");
        int i = com.miteksystems.misnap.camera.util.CameraUtil.WhenMappings.$EnumSwitchMapping$0[com.miteksystems.misnap.camera.CameraSettings.requireProfile(cameraSettings).ordinal()];
        if (i == 1) {
            return new com.miteksystems.misnap.camera.requirements.BackCameraSelectorFilter(cameraSettings);
        }
        if (i == 2) {
            return new com.miteksystems.misnap.camera.requirements.FrontCameraSelectorFilter();
        }
        if (i == 3) {
            return new com.miteksystems.misnap.camera.requirements.BackCameraSelectorFilterLite();
        }
        throw new kotlin.NoWhenBranchMatchedException();
    }

    @kotlin.Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    public final /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[com.miteksystems.misnap.core.MiSnapSettings.Camera.Profile.values().length];
            try {
                iArr[com.miteksystems.misnap.core.MiSnapSettings.Camera.Profile.DOCUMENT_BACK_CAMERA.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused) {
            }
            try {
                iArr[com.miteksystems.misnap.core.MiSnapSettings.Camera.Profile.FACE_FRONT_CAMERA.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused2) {
            }
            try {
                iArr[com.miteksystems.misnap.core.MiSnapSettings.Camera.Profile.FACE_BACK_CAMERA.ordinal()] = 3;
            } catch (java.lang.NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    private CameraUtil() {
    }
}
