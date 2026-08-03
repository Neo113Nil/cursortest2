package androidx.media3.exoplayer.audio;

/* loaded from: classes2.dex */
public class DefaultAudioTrackBufferSizeProvider implements androidx.media3.exoplayer.audio.DefaultAudioSink.AudioTrackBufferSizeProvider {
    private static final int AC3_BUFFER_MULTIPLICATION_FACTOR = 2;
    private static final int DTSHD_BUFFER_MULTIPLICATION_FACTOR = 4;
    private static final int MAX_PCM_BUFFER_DURATION_US = 750000;
    private static final int MIN_PCM_BUFFER_DURATION_US = 250000;
    private static final int OFFLOAD_BUFFER_DURATION_US = 50000000;
    private static final int PASSTHROUGH_BUFFER_DURATION_US = 250000;
    private static final int PCM_BUFFER_MULTIPLICATION_FACTOR = 4;
    public final int ac3BufferMultiplicationFactor;
    public final int dtshdBufferMultiplicationFactor;
    protected final int maxPcmBufferDurationUs;
    protected final int minPcmBufferDurationUs;
    protected final int offloadBufferDurationUs;
    protected final int passthroughBufferDurationUs;
    protected final int pcmBufferMultiplicationFactor;

    public static class Builder {
        private int minPcmBufferDurationUs = 250000;
        private int maxPcmBufferDurationUs = androidx.media3.exoplayer.audio.DefaultAudioTrackBufferSizeProvider.MAX_PCM_BUFFER_DURATION_US;
        private int pcmBufferMultiplicationFactor = 4;
        private int passthroughBufferDurationUs = 250000;
        private int offloadBufferDurationUs = androidx.media3.exoplayer.audio.DefaultAudioTrackBufferSizeProvider.OFFLOAD_BUFFER_DURATION_US;
        private int ac3BufferMultiplicationFactor = 2;
        private int dtshdBufferMultiplicationFactor = 4;

        public androidx.media3.exoplayer.audio.DefaultAudioTrackBufferSizeProvider.Builder setMinPcmBufferDurationUs(int i) {
            this.minPcmBufferDurationUs = i;
            return this;
        }

        public androidx.media3.exoplayer.audio.DefaultAudioTrackBufferSizeProvider.Builder setMaxPcmBufferDurationUs(int i) {
            this.maxPcmBufferDurationUs = i;
            return this;
        }

        public androidx.media3.exoplayer.audio.DefaultAudioTrackBufferSizeProvider.Builder setPcmBufferMultiplicationFactor(int i) {
            this.pcmBufferMultiplicationFactor = i;
            return this;
        }

        public androidx.media3.exoplayer.audio.DefaultAudioTrackBufferSizeProvider.Builder setPassthroughBufferDurationUs(int i) {
            this.passthroughBufferDurationUs = i;
            return this;
        }

        public androidx.media3.exoplayer.audio.DefaultAudioTrackBufferSizeProvider.Builder setOffloadBufferDurationUs(int i) {
            this.offloadBufferDurationUs = i;
            return this;
        }

        public androidx.media3.exoplayer.audio.DefaultAudioTrackBufferSizeProvider.Builder setAc3BufferMultiplicationFactor(int i) {
            this.ac3BufferMultiplicationFactor = i;
            return this;
        }

        public androidx.media3.exoplayer.audio.DefaultAudioTrackBufferSizeProvider.Builder setDtshdBufferMultiplicationFactor(int i) {
            this.dtshdBufferMultiplicationFactor = i;
            return this;
        }

        public androidx.media3.exoplayer.audio.DefaultAudioTrackBufferSizeProvider build() {
            return new androidx.media3.exoplayer.audio.DefaultAudioTrackBufferSizeProvider(this);
        }
    }

    protected DefaultAudioTrackBufferSizeProvider(androidx.media3.exoplayer.audio.DefaultAudioTrackBufferSizeProvider.Builder builder) {
        this.minPcmBufferDurationUs = builder.minPcmBufferDurationUs;
        this.maxPcmBufferDurationUs = builder.maxPcmBufferDurationUs;
        this.pcmBufferMultiplicationFactor = builder.pcmBufferMultiplicationFactor;
        this.passthroughBufferDurationUs = builder.passthroughBufferDurationUs;
        this.offloadBufferDurationUs = builder.offloadBufferDurationUs;
        this.ac3BufferMultiplicationFactor = builder.ac3BufferMultiplicationFactor;
        this.dtshdBufferMultiplicationFactor = builder.dtshdBufferMultiplicationFactor;
    }

    @Override // androidx.media3.exoplayer.audio.DefaultAudioSink.AudioTrackBufferSizeProvider
    public int getBufferSizeInBytes(int i, int i2, int i3, int i4, int i5, int i6, double d) {
        return (((java.lang.Math.max(i, (int) (get1xBufferSizeInBytes(i, i2, i3, i4, i5, i6) * d)) + i4) - 1) / i4) * i4;
    }

    protected int get1xBufferSizeInBytes(int i, int i2, int i3, int i4, int i5, int i6) {
        if (i3 == 0) {
            return getPcmBufferSizeInBytes(i, i5, i4);
        }
        if (i3 == 1) {
            return getOffloadBufferSizeInBytes(i2);
        }
        if (i3 == 2) {
            return getPassthroughBufferSizeInBytes(i2, i6);
        }
        throw new java.lang.IllegalArgumentException();
    }

    protected int getPcmBufferSizeInBytes(int i, int i2, int i3) {
        return androidx.media3.common.util.Util.constrainValue(i * this.pcmBufferMultiplicationFactor, durationUsToBytes(this.minPcmBufferDurationUs, i2, i3), durationUsToBytes(this.maxPcmBufferDurationUs, i2, i3));
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x001b  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0014  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    protected int getPassthroughBufferSizeInBytes(int i, int i2) {
        int i3;
        int maximumEncodedRateBytesPerSecond;
        int i4 = this.passthroughBufferDurationUs;
        if (i == 5) {
            i3 = this.ac3BufferMultiplicationFactor;
        } else {
            if (i == 8) {
                i3 = this.dtshdBufferMultiplicationFactor;
            }
            if (i2 == -1) {
                maximumEncodedRateBytesPerSecond = com.google.common.math.IntMath.divide(i2, 8, java.math.RoundingMode.CEILING);
            } else {
                maximumEncodedRateBytesPerSecond = getMaximumEncodedRateBytesPerSecond(i);
            }
            return com.google.common.primitives.Ints.checkedCast((i4 * maximumEncodedRateBytesPerSecond) / 1000000);
        }
        i4 *= i3;
        if (i2 == -1) {
        }
        return com.google.common.primitives.Ints.checkedCast((i4 * maximumEncodedRateBytesPerSecond) / 1000000);
    }

    protected int getOffloadBufferSizeInBytes(int i) {
        return com.google.common.primitives.Ints.checkedCast((this.offloadBufferDurationUs * getMaximumEncodedRateBytesPerSecond(i)) / 1000000);
    }

    protected static int durationUsToBytes(int i, int i2, int i3) {
        return com.google.common.primitives.Ints.checkedCast(((i * i2) * i3) / 1000000);
    }

    protected static int getMaximumEncodedRateBytesPerSecond(int i) {
        if (i == 20) {
            return androidx.media3.extractor.OpusUtil.MAX_BYTES_PER_SECOND;
        }
        if (i == 30) {
            return 2250000;
        }
        switch (i) {
            case 5:
                return 80000;
            case 6:
                return 768000;
            case 7:
                return 192000;
            case 8:
                return 2250000;
            case 9:
                return 40000;
            case 10:
                return 100000;
            case 11:
                return 16000;
            case 12:
                return 7000;
            default:
                switch (i) {
                    case 14:
                        return 3062500;
                    case 15:
                        return 8000;
                    case 16:
                        return 256000;
                    case 17:
                        return 336000;
                    case 18:
                        return 768000;
                    default:
                        throw new java.lang.IllegalArgumentException();
                }
        }
    }
}
