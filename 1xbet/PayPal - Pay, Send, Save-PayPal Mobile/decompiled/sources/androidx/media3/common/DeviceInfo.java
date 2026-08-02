package androidx.media3.common;

/* loaded from: classes7.dex */
public final class DeviceInfo {
    public static final int PLAYBACK_TYPE_LOCAL = 0;
    public static final int PLAYBACK_TYPE_REMOTE = 1;
    public final int maxVolume;
    public final int minVolume;
    public final int playbackType;
    public final java.lang.String routingControllerId;
    public static final androidx.media3.common.DeviceInfo UNKNOWN = new androidx.media3.common.DeviceInfo.Builder(0).build();
    private static final java.lang.String Camera2StreamConfigurationMap = androidx.media3.common.util.Util.intToStringMaxRadix(0);
    private static final java.lang.String getHighResolutionOutputSizeshNQ4ISI = androidx.media3.common.util.Util.intToStringMaxRadix(1);
    private static final java.lang.String getHighSpeedVideoSizes = androidx.media3.common.util.Util.intToStringMaxRadix(2);
    private static final java.lang.String getHighSpeedVideoFpsRangesFor = androidx.media3.common.util.Util.intToStringMaxRadix(3);

    @java.lang.annotation.Target({java.lang.annotation.ElementType.TYPE_USE})
    @java.lang.annotation.Documented
    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    /* loaded from: classes3.dex */
    public @interface PlaybackType {
    }

    /* synthetic */ DeviceInfo(androidx.media3.common.DeviceInfo.Builder builder, byte b) {
        this(builder);
    }

    public static final class Builder {
        private java.lang.String Camera2StreamConfigurationMap;
        private final int getHighResolutionOutputSizeshNQ4ISI;
        private int getHighSpeedVideoFpsRangesFor;
        private int getHighSpeedVideoSizes;

        public Builder(int i) {
            this.getHighResolutionOutputSizeshNQ4ISI = i;
        }

        public final androidx.media3.common.DeviceInfo.Builder setMinVolume(int i) {
            this.getHighSpeedVideoSizes = i;
            return this;
        }

        public final androidx.media3.common.DeviceInfo.Builder setMaxVolume(int i) {
            this.getHighSpeedVideoFpsRangesFor = i;
            return this;
        }

        public final androidx.media3.common.DeviceInfo.Builder setRoutingControllerId(java.lang.String str) {
            com.google.common.base.Preconditions.checkArgument(this.getHighResolutionOutputSizeshNQ4ISI != 0 || str == null);
            this.Camera2StreamConfigurationMap = str;
            return this;
        }

        public final androidx.media3.common.DeviceInfo build() {
            byte b = 0;
            com.google.common.base.Preconditions.checkArgument(this.getHighSpeedVideoSizes <= this.getHighSpeedVideoFpsRangesFor);
            return new androidx.media3.common.DeviceInfo(this, b);
        }
    }

    @java.lang.Deprecated
    public DeviceInfo(int i, int i2, int i3) {
        this(new androidx.media3.common.DeviceInfo.Builder(i).setMinVolume(i2).setMaxVolume(i3));
    }

    private DeviceInfo(androidx.media3.common.DeviceInfo.Builder builder) {
        this.playbackType = builder.getHighResolutionOutputSizeshNQ4ISI;
        this.minVolume = builder.getHighSpeedVideoSizes;
        this.maxVolume = builder.getHighSpeedVideoFpsRangesFor;
        this.routingControllerId = builder.Camera2StreamConfigurationMap;
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof androidx.media3.common.DeviceInfo)) {
            return false;
        }
        androidx.media3.common.DeviceInfo deviceInfo = (androidx.media3.common.DeviceInfo) obj;
        return this.playbackType == deviceInfo.playbackType && this.minVolume == deviceInfo.minVolume && this.maxVolume == deviceInfo.maxVolume && java.util.Objects.equals(this.routingControllerId, deviceInfo.routingControllerId);
    }

    public final int hashCode() {
        int i = this.playbackType;
        int i2 = this.minVolume;
        int i3 = this.maxVolume;
        java.lang.String str = this.routingControllerId;
        return ((((((i + 527) * 31) + i2) * 31) + i3) * 31) + (str == null ? 0 : str.hashCode());
    }

    public final android.os.Bundle toBundle() {
        android.os.Bundle bundle = new android.os.Bundle();
        int i = this.playbackType;
        if (i != 0) {
            bundle.putInt(Camera2StreamConfigurationMap, i);
        }
        int i2 = this.minVolume;
        if (i2 != 0) {
            bundle.putInt(getHighResolutionOutputSizeshNQ4ISI, i2);
        }
        int i3 = this.maxVolume;
        if (i3 != 0) {
            bundle.putInt(getHighSpeedVideoSizes, i3);
        }
        java.lang.String str = this.routingControllerId;
        if (str != null) {
            bundle.putString(getHighSpeedVideoFpsRangesFor, str);
        }
        return bundle;
    }

    public static androidx.media3.common.DeviceInfo fromBundle(android.os.Bundle bundle) {
        int i = bundle.getInt(Camera2StreamConfigurationMap, 0);
        int i2 = bundle.getInt(getHighResolutionOutputSizeshNQ4ISI, 0);
        int i3 = bundle.getInt(getHighSpeedVideoSizes, 0);
        return new androidx.media3.common.DeviceInfo.Builder(i).setMinVolume(i2).setMaxVolume(i3).setRoutingControllerId(bundle.getString(getHighSpeedVideoFpsRangesFor)).build();
    }
}
