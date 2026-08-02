package org.bouncycastle.pqc.crypto.xmss;

/* loaded from: classes17.dex */
final class LTreeAddress extends org.bouncycastle.pqc.crypto.xmss.XMSSAddress {
    final int Camera2StreamConfigurationMap;
    final int getHighResolutionOutputSizeshNQ4ISI;
    final int getHighSpeedVideoSizes;

    protected static class Builder extends org.bouncycastle.pqc.crypto.xmss.XMSSAddress.Builder<org.bouncycastle.pqc.crypto.xmss.LTreeAddress.Builder> {
        private int Camera2StreamConfigurationMap;
        private int getHighResolutionOutputSizeshNQ4ISI;
        private int getHighSpeedVideoSizes;

        /* JADX INFO: Access modifiers changed from: protected */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // org.bouncycastle.pqc.crypto.xmss.XMSSAddress.Builder
        public org.bouncycastle.pqc.crypto.xmss.LTreeAddress.Builder getThis() {
            return this;
        }

        protected org.bouncycastle.pqc.crypto.xmss.LTreeAddress.Builder withTreeIndex(int i) {
            this.getHighResolutionOutputSizeshNQ4ISI = i;
            return this;
        }

        protected org.bouncycastle.pqc.crypto.xmss.LTreeAddress.Builder withTreeHeight(int i) {
            this.Camera2StreamConfigurationMap = i;
            return this;
        }

        protected org.bouncycastle.pqc.crypto.xmss.LTreeAddress.Builder withLTreeAddress(int i) {
            this.getHighSpeedVideoSizes = i;
            return this;
        }

        @Override // org.bouncycastle.pqc.crypto.xmss.XMSSAddress.Builder
        protected org.bouncycastle.pqc.crypto.xmss.XMSSAddress build() {
            return new org.bouncycastle.pqc.crypto.xmss.LTreeAddress(this, (byte) 0);
        }

        protected Builder() {
            super(1);
            this.getHighSpeedVideoSizes = 0;
            this.Camera2StreamConfigurationMap = 0;
            this.getHighResolutionOutputSizeshNQ4ISI = 0;
        }
    }

    @Override // org.bouncycastle.pqc.crypto.xmss.XMSSAddress
    protected final byte[] toByteArray() {
        byte[] byteArray = super.toByteArray();
        org.bouncycastle.util.Pack.intToBigEndian(this.Camera2StreamConfigurationMap, byteArray, 16);
        org.bouncycastle.util.Pack.intToBigEndian(this.getHighResolutionOutputSizeshNQ4ISI, byteArray, 20);
        org.bouncycastle.util.Pack.intToBigEndian(this.getHighSpeedVideoSizes, byteArray, 24);
        return byteArray;
    }

    /* synthetic */ LTreeAddress(org.bouncycastle.pqc.crypto.xmss.LTreeAddress.Builder builder, byte b) {
        this(builder);
    }

    private LTreeAddress(org.bouncycastle.pqc.crypto.xmss.LTreeAddress.Builder builder) {
        super(builder);
        this.Camera2StreamConfigurationMap = builder.getHighSpeedVideoSizes;
        this.getHighResolutionOutputSizeshNQ4ISI = builder.Camera2StreamConfigurationMap;
        this.getHighSpeedVideoSizes = builder.getHighResolutionOutputSizeshNQ4ISI;
    }
}
