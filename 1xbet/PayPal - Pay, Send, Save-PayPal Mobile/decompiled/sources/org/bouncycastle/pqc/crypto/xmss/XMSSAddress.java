package org.bouncycastle.pqc.crypto.xmss;

/* loaded from: classes17.dex */
public abstract class XMSSAddress {
    private final int getHighResolutionOutputSizeshNQ4ISI;
    private final int getHighSpeedVideoFpsRanges;
    private final int getHighSpeedVideoFpsRangesFor;
    private final long getHighSpeedVideoSizes;

    protected static abstract class Builder<T extends org.bouncycastle.pqc.crypto.xmss.XMSSAddress.Builder> {
        private final int getHighSpeedVideoFpsRanges;
        private int getHighSpeedVideoSizes = 0;
        private long getHighSpeedVideoFpsRangesFor = 0;
        private int Camera2StreamConfigurationMap = 0;

        protected abstract org.bouncycastle.pqc.crypto.xmss.XMSSAddress build();

        protected abstract T getThis();

        protected T withTreeAddress(long j) {
            this.getHighSpeedVideoFpsRangesFor = j;
            return getThis();
        }

        protected T withLayerAddress(int i) {
            this.getHighSpeedVideoSizes = i;
            return getThis();
        }

        protected T withKeyAndMask(int i) {
            this.Camera2StreamConfigurationMap = i;
            return getThis();
        }

        protected Builder(int i) {
            this.getHighSpeedVideoFpsRanges = i;
        }
    }

    protected byte[] toByteArray() {
        byte[] bArr = new byte[32];
        org.bouncycastle.util.Pack.intToBigEndian(this.getHighSpeedVideoFpsRanges, bArr, 0);
        org.bouncycastle.util.Pack.longToBigEndian(this.getHighSpeedVideoSizes, bArr, 4);
        org.bouncycastle.util.Pack.intToBigEndian(this.getHighResolutionOutputSizeshNQ4ISI, bArr, 12);
        org.bouncycastle.util.Pack.intToBigEndian(this.getHighSpeedVideoFpsRangesFor, bArr, 28);
        return bArr;
    }

    public final int getType() {
        return this.getHighResolutionOutputSizeshNQ4ISI;
    }

    protected final long getTreeAddress() {
        return this.getHighSpeedVideoSizes;
    }

    protected final int getLayerAddress() {
        return this.getHighSpeedVideoFpsRanges;
    }

    public final int getKeyAndMask() {
        return this.getHighSpeedVideoFpsRangesFor;
    }

    protected XMSSAddress(org.bouncycastle.pqc.crypto.xmss.XMSSAddress.Builder builder) {
        this.getHighSpeedVideoFpsRanges = builder.getHighSpeedVideoSizes;
        this.getHighSpeedVideoSizes = builder.getHighSpeedVideoFpsRangesFor;
        this.getHighResolutionOutputSizeshNQ4ISI = builder.getHighSpeedVideoFpsRanges;
        this.getHighSpeedVideoFpsRangesFor = builder.Camera2StreamConfigurationMap;
    }
}
