package org.bouncycastle.pqc.crypto.xmss;

/* loaded from: classes17.dex */
public final class XMSSSignature extends org.bouncycastle.pqc.crypto.xmss.XMSSReducedSignature implements org.bouncycastle.pqc.crypto.xmss.XMSSStoreableObjectInterface, org.bouncycastle.util.Encodable {
    private final int getHighSpeedVideoFpsRanges;
    private final byte[] getHighSpeedVideoSizes;

    public static class Builder extends org.bouncycastle.pqc.crypto.xmss.XMSSReducedSignature.Builder {
        private byte[] getHighSpeedVideoFpsRanges;
        private int getHighSpeedVideoFpsRangesFor;
        private final org.bouncycastle.pqc.crypto.xmss.XMSSParameters getHighSpeedVideoSizes;

        public org.bouncycastle.pqc.crypto.xmss.XMSSSignature.Builder withSignature(byte[] bArr) {
            if (bArr == null) {
                throw new java.lang.NullPointerException("signature == null");
            }
            int treeDigestSize = this.getHighSpeedVideoSizes.getTreeDigestSize();
            int i = new org.bouncycastle.pqc.crypto.xmss.WOTSPlus(this.getHighSpeedVideoSizes.Camera2StreamConfigurationMap).getHighSpeedVideoFpsRanges.getHighSpeedVideoFpsRangesFor;
            int height = this.getHighSpeedVideoSizes.getHeight();
            this.getHighSpeedVideoFpsRangesFor = org.bouncycastle.util.Pack.bigEndianToInt(bArr, 0);
            this.getHighSpeedVideoFpsRanges = org.bouncycastle.pqc.crypto.xmss.XMSSUtil.extractBytesAtOffset(bArr, 4, treeDigestSize);
            withReducedSignature(org.bouncycastle.pqc.crypto.xmss.XMSSUtil.extractBytesAtOffset(bArr, treeDigestSize + 4, (i * treeDigestSize) + (height * treeDigestSize)));
            return this;
        }

        public org.bouncycastle.pqc.crypto.xmss.XMSSSignature.Builder withRandom(byte[] bArr) {
            this.getHighSpeedVideoFpsRanges = org.bouncycastle.pqc.crypto.xmss.XMSSUtil.cloneArray(bArr);
            return this;
        }

        public org.bouncycastle.pqc.crypto.xmss.XMSSSignature.Builder withIndex(int i) {
            this.getHighSpeedVideoFpsRangesFor = i;
            return this;
        }

        @Override // org.bouncycastle.pqc.crypto.xmss.XMSSReducedSignature.Builder
        public org.bouncycastle.pqc.crypto.xmss.XMSSSignature build() {
            return new org.bouncycastle.pqc.crypto.xmss.XMSSSignature(this, (byte) 0);
        }

        public Builder(org.bouncycastle.pqc.crypto.xmss.XMSSParameters xMSSParameters) {
            super(xMSSParameters);
            this.getHighSpeedVideoFpsRangesFor = 0;
            this.getHighSpeedVideoFpsRanges = null;
            this.getHighSpeedVideoSizes = xMSSParameters;
        }
    }

    @Override // org.bouncycastle.pqc.crypto.xmss.XMSSReducedSignature, org.bouncycastle.pqc.crypto.xmss.XMSSStoreableObjectInterface
    public final byte[] toByteArray() {
        int treeDigestSize = getParams().getTreeDigestSize();
        int i = treeDigestSize + 4;
        byte[] bArr = new byte[(new org.bouncycastle.pqc.crypto.xmss.WOTSPlus(getParams().Camera2StreamConfigurationMap).getHighSpeedVideoFpsRanges.getHighSpeedVideoFpsRangesFor * treeDigestSize) + i + (getParams().getHeight() * treeDigestSize)];
        org.bouncycastle.util.Pack.intToBigEndian(this.getHighSpeedVideoFpsRanges, bArr, 0);
        org.bouncycastle.pqc.crypto.xmss.XMSSUtil.copyBytesAtOffset(bArr, this.getHighSpeedVideoSizes, 4);
        for (byte[] bArr2 : org.bouncycastle.pqc.crypto.xmss.XMSSUtil.cloneArray(getWOTSPlusSignature().getHighSpeedVideoFpsRanges)) {
            org.bouncycastle.pqc.crypto.xmss.XMSSUtil.copyBytesAtOffset(bArr, bArr2, i);
            i += treeDigestSize;
        }
        for (int i2 = 0; i2 < getAuthPath().size(); i2++) {
            org.bouncycastle.pqc.crypto.xmss.XMSSUtil.copyBytesAtOffset(bArr, getAuthPath().get(i2).getValue(), i);
            i += treeDigestSize;
        }
        return bArr;
    }

    public final byte[] getRandom() {
        return org.bouncycastle.pqc.crypto.xmss.XMSSUtil.cloneArray(this.getHighSpeedVideoSizes);
    }

    public final int getIndex() {
        return this.getHighSpeedVideoFpsRanges;
    }

    @Override // org.bouncycastle.util.Encodable
    public final byte[] getEncoded() throws java.io.IOException {
        return toByteArray();
    }

    /* synthetic */ XMSSSignature(org.bouncycastle.pqc.crypto.xmss.XMSSSignature.Builder builder, byte b) {
        this(builder);
    }

    private XMSSSignature(org.bouncycastle.pqc.crypto.xmss.XMSSSignature.Builder builder) {
        super(builder);
        this.getHighSpeedVideoFpsRanges = builder.getHighSpeedVideoFpsRangesFor;
        int treeDigestSize = getParams().getTreeDigestSize();
        byte[] bArr = builder.getHighSpeedVideoFpsRanges;
        if (bArr == null) {
            this.getHighSpeedVideoSizes = new byte[treeDigestSize];
        } else {
            if (bArr.length != treeDigestSize) {
                throw new java.lang.IllegalArgumentException("size of random needs to be equal to size of digest");
            }
            this.getHighSpeedVideoSizes = bArr;
        }
    }
}
