package androidx.camera.featurecombinationquery;

/* loaded from: classes6.dex */
public class SessionConfigurationLegacy {
    private final java.util.List<android.hardware.camera2.params.OutputConfiguration> Camera2StreamConfigurationMap;
    private final androidx.camera.featurecombinationquery.SessionParametersLegacy getHighResolutionOutputSizeshNQ4ISI;

    /* synthetic */ SessionConfigurationLegacy(java.util.List list, androidx.camera.featurecombinationquery.SessionParametersLegacy sessionParametersLegacy, byte b) {
        this(list, sessionParametersLegacy);
    }

    private SessionConfigurationLegacy(java.util.List<android.hardware.camera2.params.OutputConfiguration> list, androidx.camera.featurecombinationquery.SessionParametersLegacy sessionParametersLegacy) {
        this.Camera2StreamConfigurationMap = list;
        this.getHighResolutionOutputSizeshNQ4ISI = sessionParametersLegacy;
    }

    public java.util.List<android.hardware.camera2.params.OutputConfiguration> getOutputConfigurations() {
        return this.Camera2StreamConfigurationMap;
    }

    public androidx.camera.featurecombinationquery.SessionParametersLegacy getSessionParameters() {
        return this.getHighResolutionOutputSizeshNQ4ISI;
    }

    public static final class Builder {
        private final java.util.ArrayList<android.hardware.camera2.params.OutputConfiguration> Camera2StreamConfigurationMap = new java.util.ArrayList<>();
        private androidx.camera.featurecombinationquery.SessionParametersLegacy getHighSpeedVideoSizes = new androidx.camera.featurecombinationquery.SessionParametersLegacy.Builder().build();

        public final androidx.camera.featurecombinationquery.SessionConfigurationLegacy.Builder addOutputConfiguration(android.hardware.camera2.params.OutputConfiguration outputConfiguration) {
            this.Camera2StreamConfigurationMap.add(outputConfiguration);
            return this;
        }

        public final androidx.camera.featurecombinationquery.SessionConfigurationLegacy.Builder addOutputConfigurations(java.util.Collection<android.hardware.camera2.params.OutputConfiguration> collection) {
            this.Camera2StreamConfigurationMap.addAll(collection);
            return this;
        }

        public final androidx.camera.featurecombinationquery.SessionConfigurationLegacy.Builder setSessionParameters(androidx.camera.featurecombinationquery.SessionParametersLegacy sessionParametersLegacy) {
            this.getHighSpeedVideoSizes = sessionParametersLegacy;
            return this;
        }

        public final androidx.camera.featurecombinationquery.SessionConfigurationLegacy build() {
            return new androidx.camera.featurecombinationquery.SessionConfigurationLegacy(androidx.media3.muxer.AacWriter$$ExternalSyntheticBackport0.m((java.util.Collection) this.Camera2StreamConfigurationMap), this.getHighSpeedVideoSizes, (byte) 0);
        }
    }
}
