package org.bouncycastle.pqc.crypto.xmss;

/* loaded from: classes17.dex */
final class HashTreeAddress extends org.bouncycastle.pqc.crypto.xmss.XMSSAddress {
    private final int getHighResolutionOutputSizeshNQ4ISI;
    final int getHighSpeedVideoFpsRangesFor;
    final int getHighSpeedVideoSizes;

    protected static class Builder extends org.bouncycastle.pqc.crypto.xmss.XMSSAddress.Builder<org.bouncycastle.pqc.crypto.xmss.HashTreeAddress.Builder> {
        private int Camera2StreamConfigurationMap;
        private int getHighSpeedVideoFpsRanges;

        /* JADX INFO: Access modifiers changed from: protected */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // org.bouncycastle.pqc.crypto.xmss.XMSSAddress.Builder
        public org.bouncycastle.pqc.crypto.xmss.HashTreeAddress.Builder getThis() {
            return this;
        }

        protected org.bouncycastle.pqc.crypto.xmss.HashTreeAddress.Builder withTreeIndex(int i) {
            this.Camera2StreamConfigurationMap = i;
            return this;
        }

        protected org.bouncycastle.pqc.crypto.xmss.HashTreeAddress.Builder withTreeHeight(int i) {
            this.getHighSpeedVideoFpsRanges = i;
            return this;
        }

        @Override // org.bouncycastle.pqc.crypto.xmss.XMSSAddress.Builder
        protected org.bouncycastle.pqc.crypto.xmss.XMSSAddress build() {
            return new org.bouncycastle.pqc.crypto.xmss.HashTreeAddress(this, (byte) 0);
        }

        protected Builder() {
            super(2);
            this.getHighSpeedVideoFpsRanges = 0;
            this.Camera2StreamConfigurationMap = 0;
        }
    }

    @Override // org.bouncycastle.pqc.crypto.xmss.XMSSAddress
    protected final byte[] toByteArray() {
        byte[] byteArray = super.toByteArray();
        org.bouncycastle.util.Pack.intToBigEndian(this.getHighResolutionOutputSizeshNQ4ISI, byteArray, 16);
        org.bouncycastle.util.Pack.intToBigEndian(this.getHighSpeedVideoFpsRangesFor, byteArray, 20);
        org.bouncycastle.util.Pack.intToBigEndian(this.getHighSpeedVideoSizes, byteArray, 24);
        return byteArray;
    }

    /* synthetic */ HashTreeAddress(org.bouncycastle.pqc.crypto.xmss.HashTreeAddress.Builder builder, byte b) {
        this(builder);
    }

    private HashTreeAddress(org.bouncycastle.pqc.crypto.xmss.HashTreeAddress.Builder builder) {
        super(builder);
        this.getHighResolutionOutputSizeshNQ4ISI = 0;
        this.getHighSpeedVideoFpsRangesFor = builder.getHighSpeedVideoFpsRanges;
        this.getHighSpeedVideoSizes = builder.Camera2StreamConfigurationMap;
    }
}
