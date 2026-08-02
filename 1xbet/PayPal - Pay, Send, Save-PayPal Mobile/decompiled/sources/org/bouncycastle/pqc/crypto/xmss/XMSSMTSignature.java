package org.bouncycastle.pqc.crypto.xmss;

/* loaded from: classes17.dex */
public final class XMSSMTSignature implements org.bouncycastle.pqc.crypto.xmss.XMSSStoreableObjectInterface, org.bouncycastle.util.Encodable {
    private final java.util.List<org.bouncycastle.pqc.crypto.xmss.XMSSReducedSignature> getHighResolutionOutputSizeshNQ4ISI;
    private final long getHighSpeedVideoFpsRanges;
    private final org.bouncycastle.pqc.crypto.xmss.XMSSMTParameters getHighSpeedVideoFpsRangesFor;
    private final byte[] getHighSpeedVideoSizes;

    private XMSSMTSignature(org.bouncycastle.pqc.crypto.xmss.XMSSMTSignature.Builder builder) {
        org.bouncycastle.pqc.crypto.xmss.XMSSMTParameters xMSSMTParameters = builder.getHighSpeedVideoFpsRangesFor;
        this.getHighSpeedVideoFpsRangesFor = xMSSMTParameters;
        if (xMSSMTParameters == null) {
            throw new java.lang.NullPointerException("params == null");
        }
        int treeDigestSize = xMSSMTParameters.getTreeDigestSize();
        byte[] bArr = builder.getHighResolutionOutputSizeshNQ4ISI;
        if (bArr == null) {
            this.getHighSpeedVideoFpsRanges = builder.getHighSpeedVideoFpsRanges;
            byte[] bArr2 = builder.Camera2StreamConfigurationMap;
            if (bArr2 == null) {
                this.getHighSpeedVideoSizes = new byte[treeDigestSize];
            } else {
                if (bArr2.length != treeDigestSize) {
                    throw new java.lang.IllegalArgumentException("size of random needs to be equal to size of digest");
                }
                this.getHighSpeedVideoSizes = bArr2;
            }
            java.util.List<org.bouncycastle.pqc.crypto.xmss.XMSSReducedSignature> list = builder.getHighSpeedVideoSizes;
            if (list != null) {
                this.getHighResolutionOutputSizeshNQ4ISI = list;
                return;
            } else {
                this.getHighResolutionOutputSizeshNQ4ISI = new java.util.ArrayList();
                return;
            }
        }
        int i = xMSSMTParameters.getWOTSPlus().getHighSpeedVideoFpsRanges.getHighSpeedVideoFpsRangesFor;
        int ceil = (int) java.lang.Math.ceil(xMSSMTParameters.getHeight() / 8.0d);
        int height = ((xMSSMTParameters.getHeight() / xMSSMTParameters.getLayers()) + i) * treeDigestSize;
        int i2 = ceil + treeDigestSize;
        if (bArr.length != (xMSSMTParameters.getLayers() * height) + i2) {
            throw new java.lang.IllegalArgumentException("signature has wrong size");
        }
        long bytesToXBigEndian = org.bouncycastle.pqc.crypto.xmss.XMSSUtil.bytesToXBigEndian(bArr, 0, ceil);
        this.getHighSpeedVideoFpsRanges = bytesToXBigEndian;
        if (!org.bouncycastle.pqc.crypto.xmss.XMSSUtil.isIndexValid(xMSSMTParameters.getHeight(), bytesToXBigEndian)) {
            throw new java.lang.IllegalArgumentException("index out of bounds");
        }
        this.getHighSpeedVideoSizes = org.bouncycastle.pqc.crypto.xmss.XMSSUtil.extractBytesAtOffset(bArr, ceil, treeDigestSize);
        this.getHighResolutionOutputSizeshNQ4ISI = new java.util.ArrayList();
        while (i2 < bArr.length) {
            this.getHighResolutionOutputSizeshNQ4ISI.add(new org.bouncycastle.pqc.crypto.xmss.XMSSReducedSignature.Builder(this.getHighSpeedVideoFpsRangesFor.getXMSSParameters()).withReducedSignature(org.bouncycastle.pqc.crypto.xmss.XMSSUtil.extractBytesAtOffset(bArr, i2, height)).build());
            i2 += height;
        }
    }

    @Override // org.bouncycastle.pqc.crypto.xmss.XMSSStoreableObjectInterface
    public final byte[] toByteArray() {
        int treeDigestSize = this.getHighSpeedVideoFpsRangesFor.getTreeDigestSize();
        int i = this.getHighSpeedVideoFpsRangesFor.getWOTSPlus().getHighSpeedVideoFpsRanges.getHighSpeedVideoFpsRangesFor;
        int ceil = (int) java.lang.Math.ceil(this.getHighSpeedVideoFpsRangesFor.getHeight() / 8.0d);
        int height = ((this.getHighSpeedVideoFpsRangesFor.getHeight() / this.getHighSpeedVideoFpsRangesFor.getLayers()) + i) * treeDigestSize;
        int i2 = treeDigestSize + ceil;
        byte[] bArr = new byte[(this.getHighSpeedVideoFpsRangesFor.getLayers() * height) + i2];
        org.bouncycastle.pqc.crypto.xmss.XMSSUtil.copyBytesAtOffset(bArr, org.bouncycastle.pqc.crypto.xmss.XMSSUtil.toBytesBigEndian(this.getHighSpeedVideoFpsRanges, ceil), 0);
        org.bouncycastle.pqc.crypto.xmss.XMSSUtil.copyBytesAtOffset(bArr, this.getHighSpeedVideoSizes, ceil);
        java.util.Iterator<org.bouncycastle.pqc.crypto.xmss.XMSSReducedSignature> it = this.getHighResolutionOutputSizeshNQ4ISI.iterator();
        while (it.hasNext()) {
            org.bouncycastle.pqc.crypto.xmss.XMSSUtil.copyBytesAtOffset(bArr, it.next().toByteArray(), i2);
            i2 += height;
        }
        return bArr;
    }

    public static class Builder {
        private final org.bouncycastle.pqc.crypto.xmss.XMSSMTParameters getHighSpeedVideoFpsRangesFor;
        private long getHighSpeedVideoFpsRanges = 0;
        private byte[] Camera2StreamConfigurationMap = null;
        private java.util.List<org.bouncycastle.pqc.crypto.xmss.XMSSReducedSignature> getHighSpeedVideoSizes = null;
        private byte[] getHighResolutionOutputSizeshNQ4ISI = null;

        public org.bouncycastle.pqc.crypto.xmss.XMSSMTSignature.Builder withSignature(byte[] bArr) {
            this.getHighResolutionOutputSizeshNQ4ISI = org.bouncycastle.util.Arrays.clone(bArr);
            return this;
        }

        public org.bouncycastle.pqc.crypto.xmss.XMSSMTSignature.Builder withReducedSignatures(java.util.List<org.bouncycastle.pqc.crypto.xmss.XMSSReducedSignature> list) {
            this.getHighSpeedVideoSizes = list;
            return this;
        }

        public org.bouncycastle.pqc.crypto.xmss.XMSSMTSignature.Builder withRandom(byte[] bArr) {
            this.Camera2StreamConfigurationMap = org.bouncycastle.pqc.crypto.xmss.XMSSUtil.cloneArray(bArr);
            return this;
        }

        public org.bouncycastle.pqc.crypto.xmss.XMSSMTSignature.Builder withIndex(long j) {
            this.getHighSpeedVideoFpsRanges = j;
            return this;
        }

        public org.bouncycastle.pqc.crypto.xmss.XMSSMTSignature build() {
            return new org.bouncycastle.pqc.crypto.xmss.XMSSMTSignature(this, (byte) 0);
        }

        public Builder(org.bouncycastle.pqc.crypto.xmss.XMSSMTParameters xMSSMTParameters) {
            this.getHighSpeedVideoFpsRangesFor = xMSSMTParameters;
        }
    }

    public final java.util.List<org.bouncycastle.pqc.crypto.xmss.XMSSReducedSignature> getReducedSignatures() {
        return this.getHighResolutionOutputSizeshNQ4ISI;
    }

    public final byte[] getRandom() {
        return org.bouncycastle.pqc.crypto.xmss.XMSSUtil.cloneArray(this.getHighSpeedVideoSizes);
    }

    public final long getIndex() {
        return this.getHighSpeedVideoFpsRanges;
    }

    @Override // org.bouncycastle.util.Encodable
    public final byte[] getEncoded() throws java.io.IOException {
        return toByteArray();
    }

    /* synthetic */ XMSSMTSignature(org.bouncycastle.pqc.crypto.xmss.XMSSMTSignature.Builder builder, byte b) {
        this(builder);
    }
}
