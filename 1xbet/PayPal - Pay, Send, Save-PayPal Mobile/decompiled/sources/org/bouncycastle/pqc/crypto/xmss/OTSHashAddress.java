package org.bouncycastle.pqc.crypto.xmss;

/* loaded from: classes17.dex */
final class OTSHashAddress extends org.bouncycastle.pqc.crypto.xmss.XMSSAddress {
    final int Camera2StreamConfigurationMap;
    final int getHighResolutionOutputSizeshNQ4ISI;
    final int getHighSpeedVideoFpsRanges;

    protected static class Builder extends org.bouncycastle.pqc.crypto.xmss.XMSSAddress.Builder<org.bouncycastle.pqc.crypto.xmss.OTSHashAddress.Builder> {
        private int getHighSpeedVideoFpsRanges;
        private int getHighSpeedVideoFpsRangesFor;
        private int getHighSpeedVideoSizes;

        /* JADX INFO: Access modifiers changed from: protected */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // org.bouncycastle.pqc.crypto.xmss.XMSSAddress.Builder
        public org.bouncycastle.pqc.crypto.xmss.OTSHashAddress.Builder getThis() {
            return this;
        }

        protected org.bouncycastle.pqc.crypto.xmss.OTSHashAddress.Builder withOTSAddress(int i) {
            this.getHighSpeedVideoFpsRanges = i;
            return this;
        }

        protected org.bouncycastle.pqc.crypto.xmss.OTSHashAddress.Builder withHashAddress(int i) {
            this.getHighSpeedVideoFpsRangesFor = i;
            return this;
        }

        protected org.bouncycastle.pqc.crypto.xmss.OTSHashAddress.Builder withChainAddress(int i) {
            this.getHighSpeedVideoSizes = i;
            return this;
        }

        @Override // org.bouncycastle.pqc.crypto.xmss.XMSSAddress.Builder
        protected org.bouncycastle.pqc.crypto.xmss.XMSSAddress build() {
            return new org.bouncycastle.pqc.crypto.xmss.OTSHashAddress(this, (byte) 0);
        }

        protected Builder() {
            super(0);
            this.getHighSpeedVideoFpsRanges = 0;
            this.getHighSpeedVideoSizes = 0;
            this.getHighSpeedVideoFpsRangesFor = 0;
        }
    }

    @Override // org.bouncycastle.pqc.crypto.xmss.XMSSAddress
    protected final byte[] toByteArray() {
        byte[] byteArray = super.toByteArray();
        org.bouncycastle.util.Pack.intToBigEndian(this.getHighSpeedVideoFpsRanges, byteArray, 16);
        org.bouncycastle.util.Pack.intToBigEndian(this.Camera2StreamConfigurationMap, byteArray, 20);
        org.bouncycastle.util.Pack.intToBigEndian(this.getHighResolutionOutputSizeshNQ4ISI, byteArray, 24);
        return byteArray;
    }

    /* synthetic */ OTSHashAddress(org.bouncycastle.pqc.crypto.xmss.OTSHashAddress.Builder builder, byte b) {
        this(builder);
    }

    private OTSHashAddress(org.bouncycastle.pqc.crypto.xmss.OTSHashAddress.Builder builder) {
        super(builder);
        this.getHighSpeedVideoFpsRanges = builder.getHighSpeedVideoFpsRanges;
        this.Camera2StreamConfigurationMap = builder.getHighSpeedVideoSizes;
        this.getHighResolutionOutputSizeshNQ4ISI = builder.getHighSpeedVideoFpsRangesFor;
    }
}
