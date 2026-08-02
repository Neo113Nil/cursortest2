package org.bouncycastle.pqc.crypto.xmss;

/* loaded from: classes17.dex */
public class XMSSReducedSignature implements org.bouncycastle.pqc.crypto.xmss.XMSSStoreableObjectInterface {
    private final org.bouncycastle.pqc.crypto.xmss.XMSSParameters getHighResolutionOutputSizeshNQ4ISI;
    private final java.util.List<org.bouncycastle.pqc.crypto.xmss.XMSSNode> getHighSpeedVideoFpsRanges;
    private final org.bouncycastle.pqc.crypto.xmss.WOTSPlusSignature getHighSpeedVideoSizes;

    protected XMSSReducedSignature(org.bouncycastle.pqc.crypto.xmss.XMSSReducedSignature.Builder builder) {
        org.bouncycastle.pqc.crypto.xmss.XMSSParameters xMSSParameters = builder.getHighSpeedVideoFpsRangesFor;
        this.getHighResolutionOutputSizeshNQ4ISI = xMSSParameters;
        if (xMSSParameters == null) {
            throw new java.lang.NullPointerException("params == null");
        }
        int treeDigestSize = xMSSParameters.getTreeDigestSize();
        int i = new org.bouncycastle.pqc.crypto.xmss.WOTSPlus(xMSSParameters.Camera2StreamConfigurationMap).getHighSpeedVideoFpsRanges.getHighSpeedVideoFpsRangesFor;
        int height = xMSSParameters.getHeight();
        byte[] bArr = builder.getHighResolutionOutputSizeshNQ4ISI;
        if (bArr == null) {
            org.bouncycastle.pqc.crypto.xmss.WOTSPlusSignature wOTSPlusSignature = builder.getHighSpeedVideoFpsRanges;
            this.getHighSpeedVideoSizes = wOTSPlusSignature == null ? new org.bouncycastle.pqc.crypto.xmss.WOTSPlusSignature(new org.bouncycastle.pqc.crypto.xmss.WOTSPlus(xMSSParameters.Camera2StreamConfigurationMap).getHighSpeedVideoFpsRanges, (byte[][]) java.lang.reflect.Array.newInstance((java.lang.Class<?>) java.lang.Byte.TYPE, i, treeDigestSize)) : wOTSPlusSignature;
            java.util.List<org.bouncycastle.pqc.crypto.xmss.XMSSNode> list = builder.Camera2StreamConfigurationMap;
            if (list == null) {
                this.getHighSpeedVideoFpsRanges = new java.util.ArrayList();
                return;
            } else {
                if (list.size() != height) {
                    throw new java.lang.IllegalArgumentException("size of authPath needs to be equal to height of tree");
                }
                this.getHighSpeedVideoFpsRanges = list;
                return;
            }
        }
        if (bArr.length != (i * treeDigestSize) + (height * treeDigestSize)) {
            throw new java.lang.IllegalArgumentException("signature has wrong size");
        }
        byte[][] bArr2 = new byte[i][];
        int i2 = 0;
        for (int i3 = 0; i3 < i; i3++) {
            bArr2[i3] = org.bouncycastle.pqc.crypto.xmss.XMSSUtil.extractBytesAtOffset(bArr, i2, treeDigestSize);
            i2 += treeDigestSize;
        }
        this.getHighSpeedVideoSizes = new org.bouncycastle.pqc.crypto.xmss.WOTSPlusSignature(new org.bouncycastle.pqc.crypto.xmss.WOTSPlus(this.getHighResolutionOutputSizeshNQ4ISI.Camera2StreamConfigurationMap).getHighSpeedVideoFpsRanges, bArr2);
        java.util.ArrayList arrayList = new java.util.ArrayList();
        for (int i4 = 0; i4 < height; i4++) {
            arrayList.add(new org.bouncycastle.pqc.crypto.xmss.XMSSNode(i4, org.bouncycastle.pqc.crypto.xmss.XMSSUtil.extractBytesAtOffset(bArr, i2, treeDigestSize)));
            i2 += treeDigestSize;
        }
        this.getHighSpeedVideoFpsRanges = arrayList;
    }

    @Override // org.bouncycastle.pqc.crypto.xmss.XMSSStoreableObjectInterface
    public byte[] toByteArray() {
        int treeDigestSize = this.getHighResolutionOutputSizeshNQ4ISI.getTreeDigestSize();
        byte[] bArr = new byte[(new org.bouncycastle.pqc.crypto.xmss.WOTSPlus(this.getHighResolutionOutputSizeshNQ4ISI.Camera2StreamConfigurationMap).getHighSpeedVideoFpsRanges.getHighSpeedVideoFpsRangesFor * treeDigestSize) + (this.getHighResolutionOutputSizeshNQ4ISI.getHeight() * treeDigestSize)];
        int i = 0;
        for (byte[] bArr2 : org.bouncycastle.pqc.crypto.xmss.XMSSUtil.cloneArray(this.getHighSpeedVideoSizes.getHighSpeedVideoFpsRanges)) {
            org.bouncycastle.pqc.crypto.xmss.XMSSUtil.copyBytesAtOffset(bArr, bArr2, i);
            i += treeDigestSize;
        }
        for (int i2 = 0; i2 < this.getHighSpeedVideoFpsRanges.size(); i2++) {
            org.bouncycastle.pqc.crypto.xmss.XMSSUtil.copyBytesAtOffset(bArr, this.getHighSpeedVideoFpsRanges.get(i2).getValue(), i);
            i += treeDigestSize;
        }
        return bArr;
    }

    public static class Builder {
        private final org.bouncycastle.pqc.crypto.xmss.XMSSParameters getHighSpeedVideoFpsRangesFor;
        private org.bouncycastle.pqc.crypto.xmss.WOTSPlusSignature getHighSpeedVideoFpsRanges = null;
        private java.util.List<org.bouncycastle.pqc.crypto.xmss.XMSSNode> Camera2StreamConfigurationMap = null;
        private byte[] getHighResolutionOutputSizeshNQ4ISI = null;

        public org.bouncycastle.pqc.crypto.xmss.XMSSReducedSignature.Builder withWOTSPlusSignature(org.bouncycastle.pqc.crypto.xmss.WOTSPlusSignature wOTSPlusSignature) {
            this.getHighSpeedVideoFpsRanges = wOTSPlusSignature;
            return this;
        }

        public org.bouncycastle.pqc.crypto.xmss.XMSSReducedSignature.Builder withReducedSignature(byte[] bArr) {
            this.getHighResolutionOutputSizeshNQ4ISI = org.bouncycastle.pqc.crypto.xmss.XMSSUtil.cloneArray(bArr);
            return this;
        }

        public org.bouncycastle.pqc.crypto.xmss.XMSSReducedSignature.Builder withAuthPath(java.util.List<org.bouncycastle.pqc.crypto.xmss.XMSSNode> list) {
            this.Camera2StreamConfigurationMap = list;
            return this;
        }

        public org.bouncycastle.pqc.crypto.xmss.XMSSReducedSignature build() {
            return new org.bouncycastle.pqc.crypto.xmss.XMSSReducedSignature(this);
        }

        public Builder(org.bouncycastle.pqc.crypto.xmss.XMSSParameters xMSSParameters) {
            this.getHighSpeedVideoFpsRangesFor = xMSSParameters;
        }
    }

    public org.bouncycastle.pqc.crypto.xmss.WOTSPlusSignature getWOTSPlusSignature() {
        return this.getHighSpeedVideoSizes;
    }

    public org.bouncycastle.pqc.crypto.xmss.XMSSParameters getParams() {
        return this.getHighResolutionOutputSizeshNQ4ISI;
    }

    public java.util.List<org.bouncycastle.pqc.crypto.xmss.XMSSNode> getAuthPath() {
        return this.getHighSpeedVideoFpsRanges;
    }
}
