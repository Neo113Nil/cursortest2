package androidx.camera.camera2.pipe.config;

@kotlin.Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b!\u0018\u0000 \u000e2\u00020\u0001:\u0001\u000eB\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H'¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\f\u001a\u00020\u000b2\u0006\u0010\n\u001a\u00020\tH'¢\u0006\u0004\b\f\u0010\r"}, d2 = {"Landroidx/camera/camera2/pipe/config/CameraPipeModule;", "", "<init>", "()V", "Landroidx/camera/camera2/pipe/internal/CameraDevicesImpl;", "impl", "Landroidx/camera/camera2/pipe/CameraDevices;", "bindCameras", "(Landroidx/camera/camera2/pipe/internal/CameraDevicesImpl;)Landroidx/camera/camera2/pipe/CameraDevices;", "Landroidx/camera/camera2/pipe/core/SystemTimeSource;", "timeSource", "Landroidx/camera/camera2/pipe/core/TimeSource;", "bindTimeSource", "(Landroidx/camera/camera2/pipe/core/SystemTimeSource;)Landroidx/camera/camera2/pipe/core/TimeSource;", "Companion"}, k = 1, mv = {2, 1, 0}, xi = 48)
@dagger.Module
/* loaded from: classes6.dex */
public abstract class CameraPipeModule {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final androidx.camera.camera2.pipe.config.CameraPipeModule.Companion INSTANCE = new androidx.camera.camera2.pipe.config.CameraPipeModule.Companion(null);

    @dagger.Binds
    public abstract androidx.camera.camera2.pipe.CameraDevices bindCameras(androidx.camera.camera2.pipe.internal.CameraDevicesImpl impl);

    @dagger.Binds
    public abstract androidx.camera.camera2.pipe.core.TimeSource bindTimeSource(androidx.camera.camera2.pipe.core.SystemTimeSource timeSource);

    @kotlin.Metadata(d1 = {"\u0000\u0096\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\n\u001a\u00020\tH\u0007¢\u0006\u0004\b\n\u0010\u000bJ\u0017\u0010\r\u001a\u00020\f2\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\r\u0010\u000eJ\u0019\u0010\u0011\u001a\u00020\u00102\b\b\u0001\u0010\u000f\u001a\u00020\u0006H\u0007¢\u0006\u0004\b\u0011\u0010\u0012J\u0019\u0010\u0014\u001a\u00020\u00132\b\b\u0001\u0010\u000f\u001a\u00020\u0006H\u0007¢\u0006\u0004\b\u0014\u0010\u0015J)\u0010\u001b\u001a\u00020\u001a2\b\b\u0001\u0010\u000f\u001a\u00020\u00062\u0006\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0019\u001a\u00020\u0018H\u0007¢\u0006\u0004\b\u001b\u0010\u001cJ\u0019\u0010\u001e\u001a\u00020\u001d2\b\b\u0001\u0010\u000f\u001a\u00020\u0006H\u0007¢\u0006\u0004\b\u001e\u0010\u001fJA\u0010%\u001a\u00020\u00182\u0006\u0010\u0005\u001a\u00020\u00042\u000e\b\u0001\u0010\"\u001a\b\u0012\u0004\u0012\u00020!0 2\b\b\u0001\u0010\u000f\u001a\u00020\u00062\u0006\u0010\u0017\u001a\u00020\u00162\u0006\u0010$\u001a\u00020#H\u0007¢\u0006\u0004\b%\u0010&J\u001f\u0010+\u001a\u00020*2\u0006\u0010(\u001a\u00020'2\u0006\u0010)\u001a\u00020\u0004H\u0007¢\u0006\u0004\b+\u0010,J\u000f\u0010.\u001a\u00020-H\u0007¢\u0006\u0004\b.\u0010/J\u0017\u00103\u001a\u0002022\u0006\u00101\u001a\u000200H\u0007¢\u0006\u0004\b3\u00104J\u0019\u00106\u001a\u0002052\b\b\u0001\u0010\u000f\u001a\u00020\u0006H\u0007¢\u0006\u0004\b6\u00107"}, d2 = {"Landroidx/camera/camera2/pipe/config/CameraPipeModule$Companion;", "", "<init>", "()V", "Landroidx/camera/camera2/pipe/CameraPipe$Config;", "config", "Landroid/content/Context;", "provideContext", "(Landroidx/camera/camera2/pipe/CameraPipe$Config;)Landroid/content/Context;", "Lkotlinx/coroutines/Job;", "provideCameraPipeJob", "()Lkotlinx/coroutines/Job;", "Landroidx/camera/camera2/pipe/CameraPipe$CameraMetadataConfig;", "provideCameraMetadataConfig", "(Landroidx/camera/camera2/pipe/CameraPipe$Config;)Landroidx/camera/camera2/pipe/CameraPipe$CameraMetadataConfig;", "cameraPipeContext", "Landroid/hardware/camera2/CameraManager;", "provideCameraManager", "(Landroid/content/Context;)Landroid/hardware/camera2/CameraManager;", "Landroidx/camera/camera2/pipe/compat/DevicePolicyManagerWrapper;", "provideDevicePolicyManagerWrapper", "(Landroid/content/Context;)Landroidx/camera/camera2/pipe/compat/DevicePolicyManagerWrapper;", "Landroidx/camera/camera2/pipe/core/Threads;", "threads", "Landroidx/camera/camera2/pipe/CameraBackends;", "cameraBackends", "Landroidx/camera/camera2/pipe/CameraContext;", "provideCameraContext", "(Landroid/content/Context;Landroidx/camera/camera2/pipe/core/Threads;Landroidx/camera/camera2/pipe/CameraBackends;)Landroidx/camera/camera2/pipe/CameraContext;", "Landroid/content/pm/PackageManager;", "providePackageManager", "(Landroid/content/Context;)Landroid/content/pm/PackageManager;", "Ljavax/inject/Provider;", "Landroidx/camera/camera2/pipe/CameraBackend;", "defaultCameraBackend", "Landroidx/camera/camera2/pipe/internal/CameraPipeLifetime;", "cameraPipeLifetime", "provideCameraBackends", "(Landroidx/camera/camera2/pipe/CameraPipe$Config;Ljavax/inject/Provider;Landroid/content/Context;Landroidx/camera/camera2/pipe/core/Threads;Landroidx/camera/camera2/pipe/internal/CameraPipeLifetime;)Landroidx/camera/camera2/pipe/CameraBackends;", "Landroidx/camera/camera2/pipe/media/ImageReaderImageSources;", "imageReaderImageSources", "cameraPipeConfig", "Landroidx/camera/camera2/pipe/media/ImageSources;", "configureImageSources", "(Landroidx/camera/camera2/pipe/media/ImageReaderImageSources;Landroidx/camera/camera2/pipe/CameraPipe$Config;)Landroidx/camera/camera2/pipe/media/ImageSources;", "Landroidx/camera/camera2/pipe/CameraSurfaceManager;", "provideCameraSurfaceManager", "()Landroidx/camera/camera2/pipe/CameraSurfaceManager;", "Landroidx/camera/camera2/pipe/CameraPipe$Flags;", "flags", "Landroidx/camera/camera2/pipe/StrictMode;", "provideStrictMode", "(Landroidx/camera/camera2/pipe/CameraPipe$Flags;)Landroidx/camera/camera2/pipe/StrictMode;", "Landroidx/camera/featurecombinationquery/CameraDeviceSetupCompatFactory;", "provideCameraDeviceSetupCompatFactory", "(Landroid/content/Context;)Landroidx/camera/featurecombinationquery/CameraDeviceSetupCompatFactory;"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        @androidx.camera.camera2.pipe.config.CameraPipeContext
        @dagger.Provides
        public final android.content.Context provideContext(androidx.camera.camera2.pipe.CameraPipe.Config config) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(config, "");
            return config.getAppContext();
        }

        @dagger.Provides
        @javax.inject.Singleton
        @androidx.camera.camera2.pipe.config.CameraPipeJob
        public final kotlinx.coroutines.Job provideCameraPipeJob() {
            kotlinx.coroutines.CompletableJob Job$default;
            Job$default = kotlinx.coroutines.JobKt__JobKt.Job$default((kotlinx.coroutines.Job) null, 1, (java.lang.Object) null);
            return Job$default;
        }

        @dagger.Provides
        public final androidx.camera.camera2.pipe.CameraPipe.CameraMetadataConfig provideCameraMetadataConfig(androidx.camera.camera2.pipe.CameraPipe.Config config) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(config, "");
            return config.getCameraMetadataConfig();
        }

        @dagger.Provides
        @dagger.Reusable
        public final android.hardware.camera2.CameraManager provideCameraManager(@androidx.camera.camera2.pipe.config.CameraPipeContext android.content.Context cameraPipeContext) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(cameraPipeContext, "");
            java.lang.Object systemService = cameraPipeContext.getSystemService(com.paypal.oslo.feature.qrc.domain.utils.Constants.SOURCE_CAMERA);
            kotlin.jvm.internal.Intrinsics.checkNotNull(systemService, "");
            return (android.hardware.camera2.CameraManager) systemService;
        }

        @dagger.Provides
        @dagger.Reusable
        public final androidx.camera.camera2.pipe.compat.DevicePolicyManagerWrapper provideDevicePolicyManagerWrapper(@androidx.camera.camera2.pipe.config.CameraPipeContext android.content.Context cameraPipeContext) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(cameraPipeContext, "");
            java.lang.Object systemService = cameraPipeContext.getSystemService("device_policy");
            kotlin.jvm.internal.Intrinsics.checkNotNull(systemService, "");
            return new androidx.camera.camera2.pipe.compat.AndroidDevicePolicyManagerWrapper((android.app.admin.DevicePolicyManager) systemService);
        }

        @dagger.Provides
        @javax.inject.Singleton
        public final androidx.camera.camera2.pipe.CameraContext provideCameraContext(@androidx.camera.camera2.pipe.config.CameraPipeContext final android.content.Context cameraPipeContext, final androidx.camera.camera2.pipe.core.Threads threads, final androidx.camera.camera2.pipe.CameraBackends cameraBackends) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(cameraPipeContext, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(threads, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(cameraBackends, "");
            return new androidx.camera.camera2.pipe.CameraContext(cameraPipeContext, threads, cameraBackends) { // from class: androidx.camera.camera2.pipe.config.CameraPipeModule$Companion$provideCameraContext$1
                private final android.content.Context appContext;
                private final androidx.camera.camera2.pipe.CameraBackends cameraBackends;
                private final androidx.camera.camera2.pipe.core.Threads threads;

                {
                    this.appContext = cameraPipeContext;
                    this.threads = threads;
                    this.cameraBackends = cameraBackends;
                }

                @Override // androidx.camera.camera2.pipe.CameraContext
                public final android.content.Context getAppContext() {
                    return this.appContext;
                }

                @Override // androidx.camera.camera2.pipe.CameraContext
                public final androidx.camera.camera2.pipe.core.Threads getThreads() {
                    return this.threads;
                }

                @Override // androidx.camera.camera2.pipe.CameraContext
                public final androidx.camera.camera2.pipe.CameraBackends getCameraBackends() {
                    return this.cameraBackends;
                }
            };
        }

        @dagger.Provides
        @javax.inject.Singleton
        public final android.content.pm.PackageManager providePackageManager(@androidx.camera.camera2.pipe.config.CameraPipeContext android.content.Context cameraPipeContext) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(cameraPipeContext, "");
            android.content.pm.PackageManager packageManager = cameraPipeContext.getPackageManager();
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(packageManager, "");
            return packageManager;
        }

        @dagger.Provides
        @javax.inject.Singleton
        public final androidx.camera.camera2.pipe.CameraBackends provideCameraBackends(androidx.camera.camera2.pipe.CameraPipe.Config config, @androidx.camera.camera2.pipe.config.DefaultCameraBackend javax.inject.Provider<androidx.camera.camera2.pipe.CameraBackend> defaultCameraBackend, @androidx.camera.camera2.pipe.config.CameraPipeContext android.content.Context cameraPipeContext, androidx.camera.camera2.pipe.core.Threads threads, androidx.camera.camera2.pipe.internal.CameraPipeLifetime cameraPipeLifetime) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(config, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(defaultCameraBackend, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(cameraPipeContext, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(threads, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(cameraPipeLifetime, "");
            final androidx.camera.camera2.pipe.CameraBackend internalBackend = config.getCameraBackendConfig().getInternalBackend();
            if (internalBackend == null) {
                androidx.camera.camera2.pipe.core.Debug debug = androidx.camera.camera2.pipe.core.Debug.INSTANCE;
                try {
                    android.os.Trace.beginSection("Initialize defaultCameraBackend");
                    internalBackend = defaultCameraBackend.get();
                } finally {
                    android.os.Trace.endSection();
                }
            }
            if (config.getCameraBackendConfig().getCameraBackends().containsKey(androidx.camera.camera2.pipe.CameraBackendId.m232boximpl(internalBackend.mo223getIdQwmhuAM()))) {
                java.lang.StringBuilder sb = new java.lang.StringBuilder("CameraBackendConfig#cameraBackends should not contain a backend with ");
                sb.append((java.lang.Object) androidx.camera.camera2.pipe.CameraBackendId.m237toStringimpl(internalBackend.mo223getIdQwmhuAM()));
                sb.append(". Use CameraBackendConfig#internalBackend field instead.");
                throw new java.lang.IllegalStateException(sb.toString().toString());
            }
            java.util.Map plus = kotlin.collections.MapsKt.plus(config.getCameraBackendConfig().getCameraBackends(), kotlin.TuplesKt.to(androidx.camera.camera2.pipe.CameraBackendId.m232boximpl(internalBackend.mo223getIdQwmhuAM()), new androidx.camera.camera2.pipe.CameraBackendFactory() { // from class: androidx.camera.camera2.pipe.config.CameraPipeModule$Companion$$ExternalSyntheticLambda0
                @Override // androidx.camera.camera2.pipe.CameraBackendFactory
                public final androidx.camera.camera2.pipe.CameraBackend create(androidx.camera.camera2.pipe.CameraContext cameraContext) {
                    return androidx.camera.camera2.pipe.config.CameraPipeModule.Companion.m861$r8$lambda$u5fcAhcmf6Jw690I5PCj5GlYg(androidx.camera.camera2.pipe.CameraBackend.this, cameraContext);
                }
            }));
            java.lang.String defaultBackend = config.getCameraBackendConfig().getDefaultBackend();
            if (defaultBackend == null) {
                defaultBackend = internalBackend.mo223getIdQwmhuAM();
            }
            java.lang.String str = defaultBackend;
            if (!plus.containsKey(androidx.camera.camera2.pipe.CameraBackendId.m232boximpl(str))) {
                java.lang.StringBuilder sb2 = new java.lang.StringBuilder("Failed to find ");
                sb2.append((java.lang.Object) androidx.camera.camera2.pipe.CameraBackendId.m237toStringimpl(str));
                sb2.append(" in the list of available CameraPipe backends! Available values are ");
                sb2.append(plus.keySet());
                throw new java.lang.IllegalStateException(sb2.toString().toString());
            }
            return new androidx.camera.camera2.pipe.internal.CameraBackendsImpl(str, plus, cameraPipeContext, threads, cameraPipeLifetime, null);
        }

        @dagger.Provides
        public final androidx.camera.camera2.pipe.media.ImageSources configureImageSources(androidx.camera.camera2.pipe.media.ImageReaderImageSources imageReaderImageSources, androidx.camera.camera2.pipe.CameraPipe.Config cameraPipeConfig) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(imageReaderImageSources, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(cameraPipeConfig, "");
            if (cameraPipeConfig.getImageSources() != null) {
                return cameraPipeConfig.getImageSources();
            }
            return imageReaderImageSources;
        }

        @dagger.Provides
        @javax.inject.Singleton
        public final androidx.camera.camera2.pipe.CameraSurfaceManager provideCameraSurfaceManager() {
            return new androidx.camera.camera2.pipe.CameraSurfaceManager();
        }

        @dagger.Provides
        @javax.inject.Singleton
        public final androidx.camera.camera2.pipe.StrictMode provideStrictMode(androidx.camera.camera2.pipe.CameraPipe.Flags flags) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(flags, "");
            return new androidx.camera.camera2.pipe.StrictMode(flags.getStrictModeEnabled());
        }

        @dagger.Provides
        @javax.inject.Singleton
        public final androidx.camera.featurecombinationquery.CameraDeviceSetupCompatFactory provideCameraDeviceSetupCompatFactory(@androidx.camera.camera2.pipe.config.CameraPipeContext android.content.Context cameraPipeContext) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(cameraPipeContext, "");
            return new androidx.camera.featurecombinationquery.CameraDeviceSetupCompatFactory(cameraPipeContext);
        }

        /* renamed from: $r8$lambda$u5fcAhcmf6Jw690I5-P-Cj5GlYg, reason: not valid java name */
        public static /* synthetic */ androidx.camera.camera2.pipe.CameraBackend m861$r8$lambda$u5fcAhcmf6Jw690I5PCj5GlYg(androidx.camera.camera2.pipe.CameraBackend cameraBackend, androidx.camera.camera2.pipe.CameraContext cameraContext) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(cameraContext, "");
            kotlin.jvm.internal.Intrinsics.checkNotNull(cameraBackend);
            return cameraBackend;
        }

        public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }
}
