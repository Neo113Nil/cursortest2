package androidx.media3.common;

/* loaded from: classes7.dex */
public final class AudioAttributes {
    public final int allowedCapturePolicy;
    public final int contentType;
    public final int flags;
    private android.media.AudioAttributes getInputFormats;
    public final boolean hapticChannelsMuted;
    public final boolean isContentSpatialized;
    public final int spatializationBehavior;
    public final int usage;
    public static final androidx.media3.common.AudioAttributes DEFAULT = new androidx.media3.common.AudioAttributes.Builder().build();
    private static final java.lang.String Camera2StreamConfigurationMap = androidx.media3.common.util.Util.intToStringMaxRadix(0);
    private static final java.lang.String getHighSpeedVideoFpsRanges = androidx.media3.common.util.Util.intToStringMaxRadix(1);
    private static final java.lang.String getHighSpeedVideoSizesFor = androidx.media3.common.util.Util.intToStringMaxRadix(2);
    private static final java.lang.String getHighResolutionOutputSizeshNQ4ISI = androidx.media3.common.util.Util.intToStringMaxRadix(3);
    private static final java.lang.String getOutputFormats = androidx.media3.common.util.Util.intToStringMaxRadix(4);
    private static final java.lang.String getHighSpeedVideoFpsRangesFor = androidx.media3.common.util.Util.intToStringMaxRadix(5);
    private static final java.lang.String getHighSpeedVideoSizes = androidx.media3.common.util.Util.intToStringMaxRadix(6);

    /* synthetic */ AudioAttributes(int i, int i2, int i3, int i4, int i5, boolean z, boolean z2, byte b) {
        this(i, i2, i3, i4, i5, z, z2);
    }

    @java.lang.Deprecated
    public static final class AudioAttributesV21 {
        public final android.media.AudioAttributes audioAttributes;

        private AudioAttributesV21(android.media.AudioAttributes audioAttributes) {
            this.audioAttributes = audioAttributes;
        }
    }

    public static final class Builder {
        private int getHighResolutionOutputSizeshNQ4ISI = 0;
        private int getHighSpeedVideoFpsRangesFor = 0;
        private int getOutputMinFrameDuration = 1;
        private int Camera2StreamConfigurationMap = 1;
        private int getInputSizeshNQ4ISI = 0;
        private boolean getHighSpeedVideoFpsRanges = false;
        private boolean getHighSpeedVideoSizes = true;

        public final androidx.media3.common.AudioAttributes.Builder setContentType(int i) {
            this.getHighResolutionOutputSizeshNQ4ISI = i;
            return this;
        }

        public final androidx.media3.common.AudioAttributes.Builder setFlags(int i) {
            this.getHighSpeedVideoFpsRangesFor = i;
            return this;
        }

        public final androidx.media3.common.AudioAttributes.Builder setUsage(int i) {
            this.getOutputMinFrameDuration = i;
            return this;
        }

        public final androidx.media3.common.AudioAttributes.Builder setAllowedCapturePolicy(int i) {
            this.Camera2StreamConfigurationMap = i;
            return this;
        }

        public final androidx.media3.common.AudioAttributes.Builder setSpatializationBehavior(int i) {
            this.getInputSizeshNQ4ISI = i;
            return this;
        }

        public final androidx.media3.common.AudioAttributes.Builder setIsContentSpatialized(boolean z) {
            this.getHighSpeedVideoFpsRanges = z;
            return this;
        }

        public final androidx.media3.common.AudioAttributes.Builder setHapticChannelsMuted(boolean z) {
            this.getHighSpeedVideoSizes = z;
            return this;
        }

        public final androidx.media3.common.AudioAttributes build() {
            return new androidx.media3.common.AudioAttributes(this.getHighResolutionOutputSizeshNQ4ISI, this.getHighSpeedVideoFpsRangesFor, this.getOutputMinFrameDuration, this.Camera2StreamConfigurationMap, this.getInputSizeshNQ4ISI, this.getHighSpeedVideoFpsRanges, this.getHighSpeedVideoSizes, (byte) 0);
        }
    }

    public static androidx.media3.common.AudioAttributes fromPlatformAudioAttributes(android.media.AudioAttributes audioAttributes) {
        androidx.media3.common.AudioAttributes.Builder usage = new androidx.media3.common.AudioAttributes.Builder().setContentType(audioAttributes.getContentType()).setFlags(audioAttributes.getFlags()).setUsage(audioAttributes.getUsage());
        if (android.os.Build.VERSION.SDK_INT >= 29) {
            usage.setAllowedCapturePolicy(audioAttributes.getAllowedCapturePolicy());
            usage.setHapticChannelsMuted(audioAttributes.areHapticChannelsMuted());
        }
        if (android.os.Build.VERSION.SDK_INT >= 32) {
            usage.setSpatializationBehavior(audioAttributes.getSpatializationBehavior());
            usage.setIsContentSpatialized(audioAttributes.isContentSpatialized());
        }
        return usage.build();
    }

    private AudioAttributes(int i, int i2, int i3, int i4, int i5, boolean z, boolean z2) {
        this.contentType = i;
        this.flags = i2;
        this.usage = i3;
        this.allowedCapturePolicy = i4;
        this.spatializationBehavior = i5;
        this.isContentSpatialized = z;
        this.hapticChannelsMuted = z2;
    }

    @java.lang.Deprecated
    public final androidx.media3.common.AudioAttributes.AudioAttributesV21 getAudioAttributesV21() {
        return new androidx.media3.common.AudioAttributes.AudioAttributesV21(getPlatformAudioAttributes());
    }

    public final android.media.AudioAttributes getPlatformAudioAttributes() {
        if (this.getInputFormats == null) {
            android.media.AudioAttributes.Builder usage = new android.media.AudioAttributes.Builder().setContentType(this.contentType).setFlags(this.flags).setUsage(this.usage);
            if (android.os.Build.VERSION.SDK_INT >= 29) {
                androidx.media3.common.AudioAttributes.Api29.getHighSpeedVideoFpsRangesFor(usage, this.allowedCapturePolicy);
                androidx.media3.common.AudioAttributes.Api29.getHighSpeedVideoFpsRangesFor(usage, this.hapticChannelsMuted);
            }
            if (android.os.Build.VERSION.SDK_INT >= 32) {
                androidx.media3.common.AudioAttributes.Api32.getHighSpeedVideoFpsRanges(usage, this.spatializationBehavior);
                androidx.media3.common.AudioAttributes.Api32.getHighSpeedVideoFpsRangesFor(usage, this.isContentSpatialized);
            }
            this.getInputFormats = usage.build();
        }
        return this.getInputFormats;
    }

    public final int getStreamType() {
        if ((this.flags & 1) == 1) {
            return 1;
        }
        switch (this.usage) {
        }
        return 1;
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        androidx.media3.common.AudioAttributes audioAttributes = (androidx.media3.common.AudioAttributes) obj;
        return this.contentType == audioAttributes.contentType && this.flags == audioAttributes.flags && this.usage == audioAttributes.usage && this.allowedCapturePolicy == audioAttributes.allowedCapturePolicy && this.spatializationBehavior == audioAttributes.spatializationBehavior && this.isContentSpatialized == audioAttributes.isContentSpatialized && this.hapticChannelsMuted == audioAttributes.hapticChannelsMuted;
    }

    public final int hashCode() {
        int i = this.contentType;
        int i2 = this.flags;
        int i3 = this.usage;
        int i4 = this.allowedCapturePolicy;
        return ((((((((((((i + 527) * 31) + i2) * 31) + i3) * 31) + i4) * 31) + this.spatializationBehavior) * 31) + (this.isContentSpatialized ? 1 : 0)) * 31) + (this.hapticChannelsMuted ? 1 : 0);
    }

    public final android.os.Bundle toBundle() {
        android.os.Bundle bundle = new android.os.Bundle();
        int i = this.contentType;
        if (i != 0) {
            bundle.putInt(Camera2StreamConfigurationMap, i);
        }
        int i2 = this.flags;
        if (i2 != 0) {
            bundle.putInt(getHighSpeedVideoFpsRanges, i2);
        }
        int i3 = this.usage;
        if (i3 != 1) {
            bundle.putInt(getHighSpeedVideoSizesFor, i3);
        }
        int i4 = this.allowedCapturePolicy;
        if (i4 != 1) {
            bundle.putInt(getHighResolutionOutputSizeshNQ4ISI, i4);
        }
        int i5 = this.spatializationBehavior;
        if (i5 != 0) {
            bundle.putInt(getOutputFormats, i5);
        }
        boolean z = this.isContentSpatialized;
        if (z) {
            bundle.putBoolean(getHighSpeedVideoFpsRangesFor, z);
        }
        boolean z2 = this.hapticChannelsMuted;
        if (!z2) {
            bundle.putBoolean(getHighSpeedVideoSizes, z2);
        }
        return bundle;
    }

    public static androidx.media3.common.AudioAttributes fromBundle(android.os.Bundle bundle) {
        androidx.media3.common.AudioAttributes.Builder builder = new androidx.media3.common.AudioAttributes.Builder();
        java.lang.String str = Camera2StreamConfigurationMap;
        if (bundle.containsKey(str)) {
            builder.setContentType(bundle.getInt(str));
        }
        java.lang.String str2 = getHighSpeedVideoFpsRanges;
        if (bundle.containsKey(str2)) {
            builder.setFlags(bundle.getInt(str2));
        }
        java.lang.String str3 = getHighSpeedVideoSizesFor;
        if (bundle.containsKey(str3)) {
            builder.setUsage(bundle.getInt(str3));
        }
        java.lang.String str4 = getHighResolutionOutputSizeshNQ4ISI;
        if (bundle.containsKey(str4)) {
            builder.setAllowedCapturePolicy(bundle.getInt(str4));
        }
        java.lang.String str5 = getOutputFormats;
        if (bundle.containsKey(str5)) {
            builder.setSpatializationBehavior(bundle.getInt(str5));
        }
        java.lang.String str6 = getHighSpeedVideoFpsRangesFor;
        if (bundle.containsKey(str6)) {
            builder.setIsContentSpatialized(bundle.getBoolean(str6));
        }
        java.lang.String str7 = getHighSpeedVideoSizes;
        if (bundle.containsKey(str7)) {
            builder.setHapticChannelsMuted(bundle.getBoolean(str7));
        }
        return builder.build();
    }

    static final class Api29 {
        private Api29() {
        }

        public static void getHighSpeedVideoFpsRangesFor(android.media.AudioAttributes.Builder builder, int i) {
            builder.setAllowedCapturePolicy(i);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static void getHighSpeedVideoFpsRangesFor(android.media.AudioAttributes.Builder builder, boolean z) {
            builder.setHapticChannelsMuted(z);
        }
    }

    static final class Api32 {
        private Api32() {
        }

        public static void getHighSpeedVideoFpsRanges(android.media.AudioAttributes.Builder builder, int i) {
            builder.setSpatializationBehavior(i);
        }

        public static void getHighSpeedVideoFpsRangesFor(android.media.AudioAttributes.Builder builder, boolean z) {
            builder.setIsContentSpatialized(z);
        }
    }
}
