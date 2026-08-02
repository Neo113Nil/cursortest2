package androidx.camera.camera2.config;

@kotlin.Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b'\u0018\u0000 \u00162\u00020\u0001:\u0001\u0016B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H'¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\f\u001a\u00020\u000b2\u0006\u0010\n\u001a\u00020\tH'¢\u0006\u0004\b\f\u0010\rJ\u0017\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\n\u001a\u00020\u000eH'¢\u0006\u0004\b\u0010\u0010\u0011J\u0017\u0010\u0014\u001a\u00020\u00132\u0006\u0010\n\u001a\u00020\u0012H'¢\u0006\u0004\b\u0014\u0010\u0015"}, d2 = {"Landroidx/camera/camera2/config/CameraModule;", "", "<init>", "()V", "Landroidx/camera/camera2/impl/CameraPipeCameraProperties;", "impl", "Landroidx/camera/camera2/impl/CameraProperties;", "bindCameraProperties", "(Landroidx/camera/camera2/impl/CameraPipeCameraProperties;)Landroidx/camera/camera2/impl/CameraProperties;", "Landroidx/camera/camera2/adapter/CameraInternalAdapter;", "adapter", "Landroidx/camera/core/impl/CameraInternal;", "bindCameraInternal", "(Landroidx/camera/camera2/adapter/CameraInternalAdapter;)Landroidx/camera/core/impl/CameraInternal;", "Landroidx/camera/camera2/adapter/CameraInfoAdapter;", "Landroidx/camera/core/impl/CameraInfoInternal;", "bindCameraInfoInternal", "(Landroidx/camera/camera2/adapter/CameraInfoAdapter;)Landroidx/camera/core/impl/CameraInfoInternal;", "Landroidx/camera/camera2/adapter/CameraControlAdapter;", "Landroidx/camera/core/impl/CameraControlInternal;", "bindCameraControlInternal", "(Landroidx/camera/camera2/adapter/CameraControlAdapter;)Landroidx/camera/core/impl/CameraControlInternal;", "Companion"}, k = 1, mv = {2, 1, 0}, xi = 48)
@dagger.Module(includes = {androidx.camera.camera2.compat.Camera2CameraControlCompat.Bindings.class, androidx.camera.camera2.compat.EvCompCompat.Bindings.class, androidx.camera.camera2.impl.EvCompControl.Bindings.class, androidx.camera.camera2.impl.FlashControl.Bindings.class, androidx.camera.camera2.impl.FocusMeteringControl.Bindings.class, androidx.camera.camera2.internal.IntrinsicZoomCalculator.Bindings.class, androidx.camera.camera2.impl.State3AControl.Bindings.class, androidx.camera.camera2.impl.StillCaptureRequestControl.Bindings.class, androidx.camera.camera2.impl.TorchControl.Bindings.class, androidx.camera.camera2.impl.LowLightBoostControl.Bindings.class, androidx.camera.camera2.impl.VideoUsageControl.Bindings.class, androidx.camera.camera2.compat.ZoomCompat.Bindings.class, androidx.camera.camera2.impl.ZoomControl.Bindings.class}, subcomponents = {androidx.camera.camera2.config.UseCaseCameraComponent.class})
/* loaded from: classes6.dex */
public abstract class CameraModule {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final androidx.camera.camera2.config.CameraModule.Companion INSTANCE = new androidx.camera.camera2.config.CameraModule.Companion(null);

    @dagger.Binds
    public abstract androidx.camera.core.impl.CameraControlInternal bindCameraControlInternal(androidx.camera.camera2.adapter.CameraControlAdapter adapter);

    @dagger.Binds
    public abstract androidx.camera.core.impl.CameraInfoInternal bindCameraInfoInternal(androidx.camera.camera2.adapter.CameraInfoAdapter adapter);

    @dagger.Binds
    public abstract androidx.camera.core.impl.CameraInternal bindCameraInternal(androidx.camera.camera2.adapter.CameraInternalAdapter adapter);

    @dagger.Binds
    public abstract androidx.camera.camera2.impl.CameraProperties bindCameraProperties(androidx.camera.camera2.impl.CameraPipeCameraProperties impl);

    @kotlin.Metadata(d1 = {"\u0000z\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001f\u0010\t\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0007¢\u0006\u0004\b\t\u0010\nJ'\u0010\u0011\u001a\u00020\u00102\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\r\u001a\u00020\b2\u0006\u0010\u000f\u001a\u00020\u000eH\u0007¢\u0006\u0004\b\u0011\u0010\u0012J!\u0010\u0017\u001a\u0004\u0018\u00010\u00162\u0006\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0015\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0017\u0010\u0018J\u0017\u0010\u001a\u001a\u00020\u00192\u0006\u0010\u0015\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u001a\u0010\u001bJ\u001b\u0010\u001e\u001a\u0004\u0018\u00010\u001d2\b\u0010\u001c\u001a\u0004\u0018\u00010\u0016H\u0007¢\u0006\u0004\b\u001e\u0010\u001fJ\u0017\u0010#\u001a\u00020\"2\u0006\u0010!\u001a\u00020 H\u0007¢\u0006\u0004\b#\u0010$J\u0017\u0010(\u001a\u00020'2\u0006\u0010&\u001a\u00020%H\u0007¢\u0006\u0004\b(\u0010)J!\u0010,\u001a\u00020+2\b\b\u0001\u0010*\u001a\u00020\u00192\u0006\u0010!\u001a\u00020 H\u0007¢\u0006\u0004\b,\u0010-"}, d2 = {"Landroidx/camera/camera2/config/CameraModule$Companion;", "", "<init>", "()V", "Landroidx/camera/camera2/config/CameraConfig;", "cameraConfig", "Landroidx/camera/core/impl/CameraThreadConfig;", "cameraThreadConfig", "Landroidx/camera/camera2/impl/UseCaseThreads;", "provideUseCaseThreads", "(Landroidx/camera/camera2/config/CameraConfig;Landroidx/camera/core/impl/CameraThreadConfig;)Landroidx/camera/camera2/impl/UseCaseThreads;", "Landroidx/camera/camera2/compat/Camera2CameraControlCompat;", "compat", "threads", "Landroidx/camera/camera2/impl/ComboRequestListener;", "requestListener", "Landroidx/camera/camera2/interop/Camera2CameraControl;", "provideCamera2CameraControl", "(Landroidx/camera/camera2/compat/Camera2CameraControlCompat;Landroidx/camera/camera2/impl/UseCaseThreads;Landroidx/camera/camera2/impl/ComboRequestListener;)Landroidx/camera/camera2/interop/Camera2CameraControl;", "Landroidx/camera/camera2/pipe/CameraPipe;", "cameraPipe", "config", "Landroidx/camera/camera2/pipe/CameraMetadata;", "provideCameraMetadata", "(Landroidx/camera/camera2/pipe/CameraPipe;Landroidx/camera/camera2/config/CameraConfig;)Landroidx/camera/camera2/pipe/CameraMetadata;", "", "provideCameraIdString", "(Landroidx/camera/camera2/config/CameraConfig;)Ljava/lang/String;", "cameraMetadata", "Landroid/hardware/camera2/params/StreamConfigurationMap;", "provideStreamConfigurationMap", "(Landroidx/camera/camera2/pipe/CameraMetadata;)Landroid/hardware/camera2/params/StreamConfigurationMap;", "Landroidx/camera/camera2/compat/quirk/CameraQuirks;", "cameraQuirks", "Landroidx/camera/core/impl/Quirks;", "provideCameraQuirksValues", "(Landroidx/camera/camera2/compat/quirk/CameraQuirks;)Landroidx/camera/core/impl/Quirks;", "Landroidx/camera/camera2/impl/CameraProperties;", "cameraProperties", "Landroidx/camera/camera2/adapter/ZslControl;", "provideZslControl", "(Landroidx/camera/camera2/impl/CameraProperties;)Landroidx/camera/camera2/adapter/ZslControl;", "cameraIdString", "Landroidx/camera/core/impl/EncoderProfilesProvider;", "provideEncoderProfilesProvider", "(Ljava/lang/String;Landroidx/camera/camera2/compat/quirk/CameraQuirks;)Landroidx/camera/core/impl/EncoderProfilesProvider;"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        @androidx.camera.camera2.config.CameraScope
        @dagger.Provides
        public final androidx.camera.camera2.impl.UseCaseThreads provideUseCaseThreads(androidx.camera.camera2.config.CameraConfig cameraConfig, androidx.camera.core.impl.CameraThreadConfig cameraThreadConfig) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(cameraConfig, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(cameraThreadConfig, "");
            java.util.concurrent.Executor cameraExecutor = cameraThreadConfig.getCameraExecutor();
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(cameraExecutor, "");
            java.util.concurrent.Executor cameraExecutor2 = cameraThreadConfig.getCameraExecutor();
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(cameraExecutor2, "");
            kotlinx.coroutines.CoroutineDispatcher from = kotlinx.coroutines.ExecutorsKt.from(cameraExecutor2);
            kotlin.coroutines.CoroutineContext plus = kotlinx.coroutines.SupervisorKt.SupervisorJob$default((kotlinx.coroutines.Job) null, 1, (java.lang.Object) null).plus(from);
            java.lang.StringBuilder sb = new java.lang.StringBuilder("CXCP-UseCase-");
            sb.append(cameraConfig.getCameraId());
            return new androidx.camera.camera2.impl.UseCaseThreads(kotlinx.coroutines.CoroutineScopeKt.CoroutineScope(plus.plus(new kotlinx.coroutines.CoroutineName(sb.toString()))), cameraExecutor, from);
        }

        @androidx.camera.camera2.config.CameraScope
        @dagger.Provides
        public final androidx.camera.camera2.interop.Camera2CameraControl provideCamera2CameraControl(androidx.camera.camera2.compat.Camera2CameraControlCompat compat, androidx.camera.camera2.impl.UseCaseThreads threads, androidx.camera.camera2.impl.ComboRequestListener requestListener) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(compat, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(threads, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(requestListener, "");
            return androidx.camera.camera2.interop.Camera2CameraControl.INSTANCE.create(compat, threads, requestListener);
        }

        @androidx.camera.camera2.config.CameraScope
        @dagger.Provides
        public final androidx.camera.camera2.pipe.CameraMetadata provideCameraMetadata(androidx.camera.camera2.pipe.CameraPipe cameraPipe, androidx.camera.camera2.config.CameraConfig config) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(cameraPipe, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(config, "");
            try {
                return androidx.camera.camera2.pipe.CameraDevices.m281awaitCameraMetadataFpsL5FU$default(cameraPipe.cameras(), config.getCameraId(), null, 2, null);
            } catch (androidx.camera.camera2.pipe.DoNotDisturbException unused) {
                androidx.camera.camera2.impl.Camera2Logger camera2Logger = androidx.camera.camera2.impl.Camera2Logger.INSTANCE;
                if (androidx.camera.core.Logger.isErrorEnabled(androidx.camera.camera2.pipe.core.Log.TAG)) {
                    java.lang.String unused2 = androidx.camera.camera2.impl.Camera2Logger.getHighSpeedVideoFpsRanges;
                }
                return null;
            }
        }

        @androidx.camera.camera2.config.CameraScope
        @dagger.Provides
        @javax.inject.Named("CameraId")
        public final java.lang.String provideCameraIdString(androidx.camera.camera2.config.CameraConfig config) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(config, "");
            return config.getCameraId();
        }

        @androidx.camera.camera2.config.CameraScope
        @dagger.Provides
        public final android.hardware.camera2.params.StreamConfigurationMap provideStreamConfigurationMap(androidx.camera.camera2.pipe.CameraMetadata cameraMetadata) {
            if (cameraMetadata == null) {
                return null;
            }
            android.hardware.camera2.CameraCharacteristics.Key key = android.hardware.camera2.CameraCharacteristics.SCALER_STREAM_CONFIGURATION_MAP;
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(key, "");
            return (android.hardware.camera2.params.StreamConfigurationMap) cameraMetadata.get(key);
        }

        @androidx.camera.camera2.config.CameraScope
        @dagger.Provides
        @javax.inject.Named("cameraQuirksValues")
        public final androidx.camera.core.impl.Quirks provideCameraQuirksValues(androidx.camera.camera2.compat.quirk.CameraQuirks cameraQuirks) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(cameraQuirks, "");
            return cameraQuirks.getQuirks();
        }

        @androidx.camera.camera2.config.CameraScope
        @dagger.Provides
        public final androidx.camera.camera2.adapter.ZslControl provideZslControl(androidx.camera.camera2.impl.CameraProperties cameraProperties) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(cameraProperties, "");
            return new androidx.camera.camera2.adapter.ZslControlImpl(cameraProperties);
        }

        @androidx.camera.camera2.config.CameraScope
        @dagger.Provides
        public final androidx.camera.core.impl.EncoderProfilesProvider provideEncoderProfilesProvider(@javax.inject.Named("CameraId") java.lang.String cameraIdString, androidx.camera.camera2.compat.quirk.CameraQuirks cameraQuirks) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(cameraIdString, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(cameraQuirks, "");
            return new androidx.camera.camera2.adapter.EncoderProfilesProviderAdapter(cameraIdString, cameraQuirks.getQuirks());
        }

        public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }
}
