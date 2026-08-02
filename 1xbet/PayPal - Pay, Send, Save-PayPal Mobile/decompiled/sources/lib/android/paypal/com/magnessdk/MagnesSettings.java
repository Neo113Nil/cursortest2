package lib.android.paypal.com.magnessdk;

/* loaded from: classes5.dex */
public class MagnesSettings {
    private android.content.Context Camera2StreamConfigurationMap;
    private boolean getHighResolutionOutputSizeshNQ4ISI;
    private java.lang.String getHighSpeedVideoFpsRanges;
    private boolean getHighSpeedVideoFpsRangesFor;
    private boolean getHighSpeedVideoSizes;
    private lib.android.paypal.com.magnessdk.Environment getHighSpeedVideoSizesFor;
    private int getInputFormats;
    private boolean getInputSizeshNQ4ISI;
    private lib.android.paypal.com.magnessdk.network.base.MagnesNetworkingFactoryImpl getOutputFormats;
    private java.lang.String getOutputMinFrameDuration;

    public static class Builder {
        private android.content.Context getHighResolutionOutputSizeshNQ4ISI;
        private java.lang.String getHighSpeedVideoFpsRanges;
        private boolean getHighSpeedVideoFpsRangesFor;
        private lib.android.paypal.com.magnessdk.network.base.MagnesNetworkingFactoryImpl getInputFormats;
        private java.lang.String getOutputMinFrameDuration;
        private int getOutputFormats = lib.android.paypal.com.magnessdk.MagnesSource.getHighSpeedVideoFpsRanges();
        private boolean Camera2StreamConfigurationMap = false;
        private boolean getHighSpeedVideoSizes = false;
        private lib.android.paypal.com.magnessdk.Environment getInputSizeshNQ4ISI = lib.android.paypal.com.magnessdk.Environment.LIVE;
        private boolean getHighSpeedVideoSizesFor = true;

        public lib.android.paypal.com.magnessdk.MagnesSettings.Builder setNotificationToken(java.lang.String str) {
            this.getOutputMinFrameDuration = str;
            return this;
        }

        public lib.android.paypal.com.magnessdk.MagnesSettings.Builder setMagnesSource(lib.android.paypal.com.magnessdk.MagnesSource magnesSource) {
            this.getOutputFormats = magnesSource.getVersion();
            return this;
        }

        @java.lang.Deprecated
        public lib.android.paypal.com.magnessdk.MagnesSettings.Builder setMagnesNetworkingFactory(lib.android.paypal.com.magnessdk.network.base.MagnesNetworkingFactoryImpl magnesNetworkingFactoryImpl) {
            this.getInputFormats = magnesNetworkingFactoryImpl;
            return this;
        }

        public lib.android.paypal.com.magnessdk.MagnesSettings.Builder setMagnesEnvironment(lib.android.paypal.com.magnessdk.Environment environment) {
            this.getInputSizeshNQ4ISI = environment;
            return this;
        }

        public lib.android.paypal.com.magnessdk.MagnesSettings.Builder setHasUserLocationConsent(boolean z) {
            this.getHighSpeedVideoSizesFor = z;
            return this;
        }

        public lib.android.paypal.com.magnessdk.MagnesSettings.Builder setAppGuid(java.lang.String str) throws lib.android.paypal.com.magnessdk.InvalidInputException {
            if (!lib.android.paypal.com.magnessdk.f.Camera2StreamConfigurationMap(str)) {
                throw new lib.android.paypal.com.magnessdk.InvalidInputException(lib.android.paypal.com.magnessdk.c.b.f.APPGUID_EXCEPTION_MESSAGE.toString());
            }
            this.getHighSpeedVideoFpsRanges = str;
            return this;
        }

        public lib.android.paypal.com.magnessdk.MagnesSettings.Builder enableNetworkOnCallerThread(boolean z) {
            this.getHighSpeedVideoFpsRangesFor = z;
            return this;
        }

        public lib.android.paypal.com.magnessdk.MagnesSettings.Builder disableRemoteConfig(boolean z) {
            this.Camera2StreamConfigurationMap = z;
            return this;
        }

        public lib.android.paypal.com.magnessdk.MagnesSettings.Builder disableBeacon(boolean z) {
            this.getHighSpeedVideoSizes = z;
            return this;
        }

        public lib.android.paypal.com.magnessdk.MagnesSettings build() {
            return new lib.android.paypal.com.magnessdk.MagnesSettings(this, (byte) 0);
        }

        public Builder(android.content.Context context) {
            this.getHighResolutionOutputSizeshNQ4ISI = context;
        }
    }

    public boolean isEnableNetworkOnCallerThread() {
        return this.getHighSpeedVideoSizes;
    }

    public boolean isDisableRemoteConfig() {
        return this.getHighResolutionOutputSizeshNQ4ISI;
    }

    public boolean isDisableBeacon() {
        return this.getHighSpeedVideoFpsRangesFor;
    }

    public boolean hasUserLocationConsent() {
        return this.getInputSizeshNQ4ISI;
    }

    public java.lang.String getNotificationToken() {
        return this.getOutputMinFrameDuration;
    }

    public int getMagnesSource() {
        return this.getInputFormats;
    }

    public lib.android.paypal.com.magnessdk.network.base.MagnesNetworkingFactoryImpl getMagnesNetworkingFactoryImpl() {
        return this.getOutputFormats;
    }

    public lib.android.paypal.com.magnessdk.Environment getEnvironment() {
        return this.getHighSpeedVideoSizesFor;
    }

    public android.content.Context getContext() {
        return this.Camera2StreamConfigurationMap;
    }

    public java.lang.String getAppGuid() {
        return this.getHighSpeedVideoFpsRanges;
    }

    /* synthetic */ MagnesSettings(lib.android.paypal.com.magnessdk.MagnesSettings.Builder builder, byte b) {
        this(builder);
    }

    private MagnesSettings(lib.android.paypal.com.magnessdk.MagnesSettings.Builder builder) {
        this.getHighResolutionOutputSizeshNQ4ISI = false;
        this.getHighSpeedVideoFpsRangesFor = false;
        this.getInputSizeshNQ4ISI = true;
        this.getInputFormats = builder.getOutputFormats;
        this.getHighSpeedVideoFpsRanges = builder.getHighSpeedVideoFpsRanges;
        this.getOutputMinFrameDuration = builder.getOutputMinFrameDuration;
        this.getHighResolutionOutputSizeshNQ4ISI = builder.Camera2StreamConfigurationMap;
        this.getHighSpeedVideoFpsRangesFor = builder.getHighSpeedVideoSizes;
        this.Camera2StreamConfigurationMap = builder.getHighResolutionOutputSizeshNQ4ISI;
        this.getOutputFormats = builder.getInputFormats;
        this.getHighSpeedVideoSizes = builder.getHighSpeedVideoFpsRangesFor;
        this.getHighSpeedVideoSizesFor = builder.getInputSizeshNQ4ISI;
        this.getInputSizeshNQ4ISI = builder.getHighSpeedVideoSizesFor;
    }
}
