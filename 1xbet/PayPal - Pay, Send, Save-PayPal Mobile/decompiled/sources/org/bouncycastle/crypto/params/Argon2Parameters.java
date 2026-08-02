package org.bouncycastle.crypto.params;

/* loaded from: classes17.dex */
public class Argon2Parameters {
    public static final int ARGON2_VERSION_10 = 16;
    public static final int ARGON2_VERSION_13 = 19;
    public static final int ARGON2_d = 0;
    public static final int ARGON2_i = 1;
    public static final int ARGON2_id = 2;
    private final int Camera2StreamConfigurationMap;
    private final int getHighResolutionOutputSizeshNQ4ISI;
    private final int getHighSpeedVideoFpsRanges;
    private final byte[] getHighSpeedVideoFpsRangesFor;
    private final org.bouncycastle.crypto.CharToByteConverter getHighSpeedVideoSizes;
    private final byte[] getHighSpeedVideoSizesFor;
    private final int getInputSizeshNQ4ISI;
    private final byte[] getOutputFormats;
    private final int getOutputMinFrameDuration;

    public static class Builder {
        private int Camera2StreamConfigurationMap;
        private org.bouncycastle.crypto.CharToByteConverter getHighResolutionOutputSizeshNQ4ISI;
        private int getHighSpeedVideoFpsRanges;
        private byte[] getHighSpeedVideoFpsRangesFor;
        private int getHighSpeedVideoSizes;
        private byte[] getHighSpeedVideoSizesFor;
        private final int getInputSizeshNQ4ISI;
        private int getOutputFormats;
        private byte[] getOutputMinFrameDuration;

        public org.bouncycastle.crypto.params.Argon2Parameters.Builder withVersion(int i) {
            this.getOutputFormats = i;
            return this;
        }

        public org.bouncycastle.crypto.params.Argon2Parameters.Builder withSecret(byte[] bArr) {
            this.getHighSpeedVideoSizesFor = org.bouncycastle.util.Arrays.clone(bArr);
            return this;
        }

        public org.bouncycastle.crypto.params.Argon2Parameters.Builder withSalt(byte[] bArr) {
            this.getOutputMinFrameDuration = org.bouncycastle.util.Arrays.clone(bArr);
            return this;
        }

        public org.bouncycastle.crypto.params.Argon2Parameters.Builder withParallelism(int i) {
            this.Camera2StreamConfigurationMap = i;
            return this;
        }

        public org.bouncycastle.crypto.params.Argon2Parameters.Builder withMemoryPowOfTwo(int i) {
            this.getHighSpeedVideoFpsRanges = 1 << i;
            return this;
        }

        public org.bouncycastle.crypto.params.Argon2Parameters.Builder withMemoryAsKB(int i) {
            this.getHighSpeedVideoFpsRanges = i;
            return this;
        }

        public org.bouncycastle.crypto.params.Argon2Parameters.Builder withIterations(int i) {
            this.getHighSpeedVideoSizes = i;
            return this;
        }

        public org.bouncycastle.crypto.params.Argon2Parameters.Builder withCharToByteConverter(org.bouncycastle.crypto.CharToByteConverter charToByteConverter) {
            this.getHighResolutionOutputSizeshNQ4ISI = charToByteConverter;
            return this;
        }

        public org.bouncycastle.crypto.params.Argon2Parameters.Builder withAdditional(byte[] bArr) {
            this.getHighSpeedVideoFpsRangesFor = org.bouncycastle.util.Arrays.clone(bArr);
            return this;
        }

        public void clear() {
            org.bouncycastle.util.Arrays.clear(this.getOutputMinFrameDuration);
            org.bouncycastle.util.Arrays.clear(this.getHighSpeedVideoSizesFor);
            org.bouncycastle.util.Arrays.clear(this.getHighSpeedVideoFpsRangesFor);
        }

        public org.bouncycastle.crypto.params.Argon2Parameters build() {
            return new org.bouncycastle.crypto.params.Argon2Parameters(this.getInputSizeshNQ4ISI, this.getOutputMinFrameDuration, this.getHighSpeedVideoSizesFor, this.getHighSpeedVideoFpsRangesFor, this.getHighSpeedVideoSizes, this.getHighSpeedVideoFpsRanges, this.Camera2StreamConfigurationMap, this.getOutputFormats, this.getHighResolutionOutputSizeshNQ4ISI, (byte) 0);
        }

        public Builder(int i) {
            this.getHighResolutionOutputSizeshNQ4ISI = org.bouncycastle.crypto.PasswordConverter.UTF8;
            this.getInputSizeshNQ4ISI = i;
            this.Camera2StreamConfigurationMap = 1;
            this.getHighSpeedVideoFpsRanges = 4096;
            this.getHighSpeedVideoSizes = 3;
            this.getOutputFormats = 19;
        }

        public Builder() {
            this(1);
        }
    }

    public int getVersion() {
        return this.getInputSizeshNQ4ISI;
    }

    public int getType() {
        return this.getOutputMinFrameDuration;
    }

    public byte[] getSecret() {
        return org.bouncycastle.util.Arrays.clone(this.getOutputFormats);
    }

    public byte[] getSalt() {
        return org.bouncycastle.util.Arrays.clone(this.getHighSpeedVideoSizesFor);
    }

    public int getMemory() {
        return this.Camera2StreamConfigurationMap;
    }

    public int getLanes() {
        return this.getHighResolutionOutputSizeshNQ4ISI;
    }

    public int getIterations() {
        return this.getHighSpeedVideoFpsRanges;
    }

    public org.bouncycastle.crypto.CharToByteConverter getCharToByteConverter() {
        return this.getHighSpeedVideoSizes;
    }

    public byte[] getAdditional() {
        return org.bouncycastle.util.Arrays.clone(this.getHighSpeedVideoFpsRangesFor);
    }

    public void clear() {
        org.bouncycastle.util.Arrays.clear(this.getHighSpeedVideoSizesFor);
        org.bouncycastle.util.Arrays.clear(this.getOutputFormats);
        org.bouncycastle.util.Arrays.clear(this.getHighSpeedVideoFpsRangesFor);
    }

    /* synthetic */ Argon2Parameters(int i, byte[] bArr, byte[] bArr2, byte[] bArr3, int i2, int i3, int i4, int i5, org.bouncycastle.crypto.CharToByteConverter charToByteConverter, byte b) {
        this(i, bArr, bArr2, bArr3, i2, i3, i4, i5, charToByteConverter);
    }

    private Argon2Parameters(int i, byte[] bArr, byte[] bArr2, byte[] bArr3, int i2, int i3, int i4, int i5, org.bouncycastle.crypto.CharToByteConverter charToByteConverter) {
        this.getHighSpeedVideoSizesFor = org.bouncycastle.util.Arrays.clone(bArr);
        this.getOutputFormats = org.bouncycastle.util.Arrays.clone(bArr2);
        this.getHighSpeedVideoFpsRangesFor = org.bouncycastle.util.Arrays.clone(bArr3);
        this.getHighSpeedVideoFpsRanges = i2;
        this.Camera2StreamConfigurationMap = i3;
        this.getHighResolutionOutputSizeshNQ4ISI = i4;
        this.getInputSizeshNQ4ISI = i5;
        this.getOutputMinFrameDuration = i;
        this.getHighSpeedVideoSizes = charToByteConverter;
    }
}
