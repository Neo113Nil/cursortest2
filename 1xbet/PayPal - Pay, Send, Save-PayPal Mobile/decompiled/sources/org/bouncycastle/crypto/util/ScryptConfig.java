package org.bouncycastle.crypto.util;

/* loaded from: classes17.dex */
public class ScryptConfig extends org.bouncycastle.crypto.util.PBKDFConfig {
    private final int Camera2StreamConfigurationMap;
    private final int getHighResolutionOutputSizeshNQ4ISI;
    private final int getHighSpeedVideoFpsRanges;
    private final int getHighSpeedVideoSizes;

    public static class Builder {
        private final int Camera2StreamConfigurationMap;
        private final int getHighResolutionOutputSizeshNQ4ISI;
        private int getHighSpeedVideoFpsRangesFor = 16;
        private final int getHighSpeedVideoSizes;

        public Builder(int i, int i2, int i3) {
            if (i <= 1 || ((i - 1) & i) != 0) {
                throw new java.lang.IllegalArgumentException("Cost parameter N must be > 1 and a power of 2");
            }
            this.Camera2StreamConfigurationMap = i;
            this.getHighSpeedVideoSizes = i2;
            this.getHighResolutionOutputSizeshNQ4ISI = i3;
        }

        public org.bouncycastle.crypto.util.ScryptConfig.Builder withSaltLength(int i) {
            this.getHighSpeedVideoFpsRangesFor = i;
            return this;
        }

        public org.bouncycastle.crypto.util.ScryptConfig build() {
            return new org.bouncycastle.crypto.util.ScryptConfig(this, (byte) 0);
        }
    }

    public int getSaltLength() {
        return this.getHighSpeedVideoSizes;
    }

    public int getParallelizationParameter() {
        return this.getHighResolutionOutputSizeshNQ4ISI;
    }

    public int getCostParameter() {
        return this.getHighSpeedVideoFpsRanges;
    }

    public int getBlockSize() {
        return this.Camera2StreamConfigurationMap;
    }

    /* synthetic */ ScryptConfig(org.bouncycastle.crypto.util.ScryptConfig.Builder builder, byte b) {
        this(builder);
    }

    private ScryptConfig(org.bouncycastle.crypto.util.ScryptConfig.Builder builder) {
        super(org.bouncycastle.asn1.misc.MiscObjectIdentifiers.id_scrypt);
        this.getHighSpeedVideoFpsRanges = builder.Camera2StreamConfigurationMap;
        this.Camera2StreamConfigurationMap = builder.getHighSpeedVideoSizes;
        this.getHighResolutionOutputSizeshNQ4ISI = builder.getHighResolutionOutputSizeshNQ4ISI;
        this.getHighSpeedVideoSizes = builder.getHighSpeedVideoFpsRangesFor;
    }
}
