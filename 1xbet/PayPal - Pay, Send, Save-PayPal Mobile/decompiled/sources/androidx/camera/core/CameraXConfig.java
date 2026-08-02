package androidx.camera.core;

/* loaded from: classes6.dex */
public final class CameraXConfig implements androidx.camera.core.internal.TargetConfig<androidx.camera.core.CameraX> {
    private final androidx.camera.core.impl.OptionsBundle getOutputSizeshNQ4ISI;
    static final androidx.camera.core.impl.Config.Option<androidx.camera.core.impl.CameraFactory.Provider> Camera2StreamConfigurationMap = androidx.camera.core.impl.Config.Option.create("camerax.core.appConfig.cameraFactoryProvider", androidx.camera.core.impl.CameraFactory.Provider.class);
    static final androidx.camera.core.impl.Config.Option<androidx.camera.core.impl.CameraDeviceSurfaceManager.Provider> getInputSizeshNQ4ISI = androidx.camera.core.impl.Config.Option.create("camerax.core.appConfig.deviceSurfaceManagerProvider", androidx.camera.core.impl.CameraDeviceSurfaceManager.Provider.class);
    static final androidx.camera.core.impl.Config.Option<androidx.camera.core.impl.UseCaseConfigFactory.Provider> getOutputStallDuration = androidx.camera.core.impl.Config.Option.create("camerax.core.appConfig.useCaseConfigFactoryProvider", androidx.camera.core.impl.UseCaseConfigFactory.Provider.class);
    static final androidx.camera.core.impl.Config.Option<java.util.concurrent.Executor> getHighResolutionOutputSizeshNQ4ISI = androidx.camera.core.impl.Config.Option.create("camerax.core.appConfig.cameraExecutor", java.util.concurrent.Executor.class);
    static final androidx.camera.core.impl.Config.Option<android.os.Handler> getInputFormats = androidx.camera.core.impl.Config.Option.create("camerax.core.appConfig.schedulerHandler", android.os.Handler.class);
    static final androidx.camera.core.impl.Config.Option<java.lang.Integer> getOutputFormats = androidx.camera.core.impl.Config.Option.create("camerax.core.appConfig.minimumLoggingLevel", java.lang.Integer.TYPE);
    static final androidx.camera.core.impl.Config.Option<androidx.camera.core.CameraSelector> getHighSpeedVideoFpsRanges = androidx.camera.core.impl.Config.Option.create("camerax.core.appConfig.availableCamerasLimiter", androidx.camera.core.CameraSelector.class);
    static final androidx.camera.core.impl.Config.Option<java.lang.Long> getHighSpeedVideoFpsRangesFor = androidx.camera.core.impl.Config.Option.create("camerax.core.appConfig.cameraOpenRetryMaxTimeoutInMillisWhileResuming", java.lang.Long.TYPE);
    static final androidx.camera.core.impl.Config.Option<androidx.camera.core.RetryPolicy> getHighSpeedVideoSizes = androidx.camera.core.impl.Config.Option.create("camerax.core.appConfig.cameraProviderInitRetryPolicy", androidx.camera.core.RetryPolicy.class);
    static final androidx.camera.core.impl.Config.Option<androidx.camera.core.impl.QuirkSettings> getOutputMinFrameDuration = androidx.camera.core.impl.Config.Option.create("camerax.core.appConfig.quirksSettings", androidx.camera.core.impl.QuirkSettings.class);
    static final androidx.camera.core.impl.Config.Option<java.lang.Boolean> getHighSpeedVideoSizesFor = androidx.camera.core.impl.Config.Option.create("camerax.core.appConfig.repeatingStreamForced", java.lang.Boolean.TYPE);

    public interface Provider {
        androidx.camera.core.CameraXConfig getCameraXConfig();
    }

    CameraXConfig(androidx.camera.core.impl.OptionsBundle optionsBundle) {
        this.getOutputSizeshNQ4ISI = optionsBundle;
    }

    public final androidx.camera.core.impl.CameraFactory.Provider getCameraFactoryProvider(androidx.camera.core.impl.CameraFactory.Provider provider) {
        return (androidx.camera.core.impl.CameraFactory.Provider) this.getOutputSizeshNQ4ISI.retrieveOption(Camera2StreamConfigurationMap, provider);
    }

    public final androidx.camera.core.impl.CameraDeviceSurfaceManager.Provider getDeviceSurfaceManagerProvider(androidx.camera.core.impl.CameraDeviceSurfaceManager.Provider provider) {
        return (androidx.camera.core.impl.CameraDeviceSurfaceManager.Provider) this.getOutputSizeshNQ4ISI.retrieveOption(getInputSizeshNQ4ISI, provider);
    }

    public final androidx.camera.core.impl.UseCaseConfigFactory.Provider getUseCaseConfigFactoryProvider(androidx.camera.core.impl.UseCaseConfigFactory.Provider provider) {
        return (androidx.camera.core.impl.UseCaseConfigFactory.Provider) this.getOutputSizeshNQ4ISI.retrieveOption(getOutputStallDuration, provider);
    }

    public final java.util.concurrent.Executor getCameraExecutor(java.util.concurrent.Executor executor) {
        return (java.util.concurrent.Executor) this.getOutputSizeshNQ4ISI.retrieveOption(getHighResolutionOutputSizeshNQ4ISI, executor);
    }

    public final android.os.Handler getSchedulerHandler(android.os.Handler handler) {
        return (android.os.Handler) this.getOutputSizeshNQ4ISI.retrieveOption(getInputFormats, handler);
    }

    public final int getMinimumLoggingLevel() {
        return ((java.lang.Integer) this.getOutputSizeshNQ4ISI.retrieveOption(getOutputFormats, 3)).intValue();
    }

    public final androidx.camera.core.CameraSelector getAvailableCamerasLimiter(androidx.camera.core.CameraSelector cameraSelector) {
        return (androidx.camera.core.CameraSelector) this.getOutputSizeshNQ4ISI.retrieveOption(getHighSpeedVideoFpsRanges, cameraSelector);
    }

    public final long getCameraOpenRetryMaxTimeoutInMillisWhileResuming() {
        return ((java.lang.Long) this.getOutputSizeshNQ4ISI.retrieveOption(getHighSpeedVideoFpsRangesFor, -1L)).longValue();
    }

    public final androidx.camera.core.RetryPolicy getCameraProviderInitRetryPolicy() {
        return (androidx.camera.core.RetryPolicy) java.util.Objects.requireNonNull((androidx.camera.core.RetryPolicy) this.getOutputSizeshNQ4ISI.retrieveOption(getHighSpeedVideoSizes, androidx.camera.core.RetryPolicy.DEFAULT));
    }

    public final boolean isRepeatingStreamForced() {
        return ((java.lang.Boolean) this.getOutputSizeshNQ4ISI.retrieveOption(getHighSpeedVideoSizesFor, java.lang.Boolean.TRUE)).booleanValue();
    }

    public final androidx.camera.core.impl.QuirkSettings getQuirkSettings() {
        return (androidx.camera.core.impl.QuirkSettings) this.getOutputSizeshNQ4ISI.retrieveOption(getOutputMinFrameDuration, null);
    }

    @Override // androidx.camera.core.impl.ReadableConfig
    public final androidx.camera.core.impl.Config getConfig() {
        return this.getOutputSizeshNQ4ISI;
    }

    public static final class Builder implements androidx.camera.core.internal.TargetConfig.Builder<androidx.camera.core.CameraX, androidx.camera.core.CameraXConfig.Builder> {
        private final androidx.camera.core.impl.MutableOptionsBundle Camera2StreamConfigurationMap;

        public Builder() {
            this(androidx.camera.core.impl.MutableOptionsBundle.create());
        }

        private Builder(androidx.camera.core.impl.MutableOptionsBundle mutableOptionsBundle) {
            this.Camera2StreamConfigurationMap = mutableOptionsBundle;
            java.lang.Class cls = (java.lang.Class) mutableOptionsBundle.retrieveOption(androidx.camera.core.internal.TargetConfig.OPTION_TARGET_CLASS, null);
            if (cls != null && !cls.equals(androidx.camera.core.CameraX.class)) {
                java.lang.StringBuilder sb = new java.lang.StringBuilder("Invalid target class configuration for ");
                sb.append(this);
                sb.append(": ");
                sb.append(cls);
                throw new java.lang.IllegalArgumentException(sb.toString());
            }
            setTargetClass(androidx.camera.core.CameraX.class);
        }

        public static androidx.camera.core.CameraXConfig.Builder fromConfig(androidx.camera.core.CameraXConfig cameraXConfig) {
            return new androidx.camera.core.CameraXConfig.Builder(androidx.camera.core.impl.MutableOptionsBundle.from((androidx.camera.core.impl.Config) cameraXConfig));
        }

        public final androidx.camera.core.CameraXConfig.Builder setCameraFactoryProvider(androidx.camera.core.impl.CameraFactory.Provider provider) {
            getMutableConfig().insertOption(androidx.camera.core.CameraXConfig.Camera2StreamConfigurationMap, provider);
            return this;
        }

        public final androidx.camera.core.CameraXConfig.Builder setDeviceSurfaceManagerProvider(androidx.camera.core.impl.CameraDeviceSurfaceManager.Provider provider) {
            getMutableConfig().insertOption(androidx.camera.core.CameraXConfig.getInputSizeshNQ4ISI, provider);
            return this;
        }

        public final androidx.camera.core.CameraXConfig.Builder setUseCaseConfigFactoryProvider(androidx.camera.core.impl.UseCaseConfigFactory.Provider provider) {
            getMutableConfig().insertOption(androidx.camera.core.CameraXConfig.getOutputStallDuration, provider);
            return this;
        }

        public final androidx.camera.core.CameraXConfig.Builder setCameraExecutor(java.util.concurrent.Executor executor) {
            getMutableConfig().insertOption(androidx.camera.core.CameraXConfig.getHighResolutionOutputSizeshNQ4ISI, executor);
            return this;
        }

        public final androidx.camera.core.CameraXConfig.Builder setSchedulerHandler(android.os.Handler handler) {
            getMutableConfig().insertOption(androidx.camera.core.CameraXConfig.getInputFormats, handler);
            return this;
        }

        public final androidx.camera.core.CameraXConfig.Builder setMinimumLoggingLevel(int i) {
            getMutableConfig().insertOption(androidx.camera.core.CameraXConfig.getOutputFormats, java.lang.Integer.valueOf(i));
            return this;
        }

        public final androidx.camera.core.CameraXConfig.Builder setAvailableCamerasLimiter(androidx.camera.core.CameraSelector cameraSelector) {
            getMutableConfig().insertOption(androidx.camera.core.CameraXConfig.getHighSpeedVideoFpsRanges, cameraSelector);
            return this;
        }

        public final androidx.camera.core.CameraXConfig.Builder setCameraOpenRetryMaxTimeoutInMillisWhileResuming(long j) {
            getMutableConfig().insertOption(androidx.camera.core.CameraXConfig.getHighSpeedVideoFpsRangesFor, java.lang.Long.valueOf(j));
            return this;
        }

        public final androidx.camera.core.CameraXConfig.Builder setCameraProviderInitRetryPolicy(androidx.camera.core.RetryPolicy retryPolicy) {
            getMutableConfig().insertOption(androidx.camera.core.CameraXConfig.getHighSpeedVideoSizes, retryPolicy);
            return this;
        }

        public final androidx.camera.core.CameraXConfig.Builder setRepeatingStreamForced(boolean z) {
            getMutableConfig().insertOption(androidx.camera.core.CameraXConfig.getHighSpeedVideoSizesFor, java.lang.Boolean.valueOf(z));
            return this;
        }

        public final androidx.camera.core.CameraXConfig.Builder setQuirkSettings(androidx.camera.core.impl.QuirkSettings quirkSettings) {
            getMutableConfig().insertOption(androidx.camera.core.CameraXConfig.getOutputMinFrameDuration, quirkSettings);
            return this;
        }

        public final androidx.camera.core.impl.MutableConfig getMutableConfig() {
            return this.Camera2StreamConfigurationMap;
        }

        public final androidx.camera.core.CameraXConfig build() {
            return new androidx.camera.core.CameraXConfig(androidx.camera.core.impl.OptionsBundle.from(this.Camera2StreamConfigurationMap));
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // androidx.camera.core.internal.TargetConfig.Builder
        public final androidx.camera.core.CameraXConfig.Builder setTargetClass(java.lang.Class<androidx.camera.core.CameraX> cls) {
            getMutableConfig().insertOption(androidx.camera.core.internal.TargetConfig.OPTION_TARGET_CLASS, cls);
            if (getMutableConfig().retrieveOption(androidx.camera.core.internal.TargetConfig.OPTION_TARGET_NAME, null) == null) {
                java.lang.StringBuilder sb = new java.lang.StringBuilder();
                sb.append(cls.getCanonicalName());
                sb.append("-");
                sb.append(java.util.UUID.randomUUID());
                setTargetName(sb.toString());
            }
            return this;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // androidx.camera.core.internal.TargetConfig.Builder
        public final androidx.camera.core.CameraXConfig.Builder setTargetName(java.lang.String str) {
            getMutableConfig().insertOption(androidx.camera.core.internal.TargetConfig.OPTION_TARGET_NAME, str);
            return this;
        }
    }
}
