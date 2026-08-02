package org.bouncycastle.pqc.crypto.xmss;

/* loaded from: classes17.dex */
class BDSTreeHash implements java.io.Serializable, java.lang.Cloneable {
    private static final long serialVersionUID = 1;
    final int getHighSpeedVideoFpsRanges;
    int getHighSpeedVideoFpsRangesFor;
    int getHighSpeedVideoSizes;
    org.bouncycastle.pqc.crypto.xmss.XMSSNode getHighSpeedVideoSizesFor;
    boolean getHighResolutionOutputSizeshNQ4ISI = false;
    boolean Camera2StreamConfigurationMap = false;

    final void getHighSpeedVideoFpsRanges(java.util.Stack<org.bouncycastle.pqc.crypto.xmss.XMSSNode> stack, org.bouncycastle.pqc.crypto.xmss.WOTSPlus wOTSPlus, byte[] bArr, byte[] bArr2, org.bouncycastle.pqc.crypto.xmss.OTSHashAddress oTSHashAddress) {
        if (oTSHashAddress == null) {
            throw new java.lang.NullPointerException("otsHashAddress == null");
        }
        if (this.Camera2StreamConfigurationMap || !this.getHighResolutionOutputSizeshNQ4ISI) {
            throw new java.lang.IllegalStateException("finished or not initialized");
        }
        org.bouncycastle.pqc.crypto.xmss.OTSHashAddress oTSHashAddress2 = (org.bouncycastle.pqc.crypto.xmss.OTSHashAddress) new org.bouncycastle.pqc.crypto.xmss.OTSHashAddress.Builder().withLayerAddress(oTSHashAddress.getLayerAddress()).withTreeAddress(oTSHashAddress.getTreeAddress()).withOTSAddress(this.getHighSpeedVideoFpsRangesFor).withChainAddress(oTSHashAddress.Camera2StreamConfigurationMap).withHashAddress(oTSHashAddress.getHighResolutionOutputSizeshNQ4ISI).withKeyAndMask(oTSHashAddress.getKeyAndMask()).build();
        org.bouncycastle.pqc.crypto.xmss.LTreeAddress lTreeAddress = (org.bouncycastle.pqc.crypto.xmss.LTreeAddress) new org.bouncycastle.pqc.crypto.xmss.LTreeAddress.Builder().withLayerAddress(oTSHashAddress2.getLayerAddress()).withTreeAddress(oTSHashAddress2.getTreeAddress()).withLTreeAddress(this.getHighSpeedVideoFpsRangesFor).build();
        org.bouncycastle.pqc.crypto.xmss.HashTreeAddress hashTreeAddress = (org.bouncycastle.pqc.crypto.xmss.HashTreeAddress) new org.bouncycastle.pqc.crypto.xmss.HashTreeAddress.Builder().withLayerAddress(oTSHashAddress2.getLayerAddress()).withTreeAddress(oTSHashAddress2.getTreeAddress()).withTreeIndex(this.getHighSpeedVideoFpsRangesFor).build();
        wOTSPlus.getHighSpeedVideoFpsRanges(wOTSPlus.Camera2StreamConfigurationMap(bArr2, oTSHashAddress2), bArr);
        org.bouncycastle.pqc.crypto.xmss.XMSSNode highSpeedVideoSizes = org.bouncycastle.pqc.crypto.xmss.XMSSNodeUtil.getHighSpeedVideoSizes(wOTSPlus, wOTSPlus.getHighSpeedVideoSizes(oTSHashAddress2), lTreeAddress);
        while (!stack.isEmpty() && stack.peek().getHeight() == highSpeedVideoSizes.getHeight() && stack.peek().getHeight() != this.getHighSpeedVideoFpsRanges) {
            org.bouncycastle.pqc.crypto.xmss.HashTreeAddress hashTreeAddress2 = (org.bouncycastle.pqc.crypto.xmss.HashTreeAddress) new org.bouncycastle.pqc.crypto.xmss.HashTreeAddress.Builder().withLayerAddress(hashTreeAddress.getLayerAddress()).withTreeAddress(hashTreeAddress.getTreeAddress()).withTreeHeight(hashTreeAddress.getHighSpeedVideoFpsRangesFor).withTreeIndex((hashTreeAddress.getHighSpeedVideoSizes - 1) / 2).withKeyAndMask(hashTreeAddress.getKeyAndMask()).build();
            org.bouncycastle.pqc.crypto.xmss.XMSSNode highSpeedVideoSizes2 = org.bouncycastle.pqc.crypto.xmss.XMSSNodeUtil.getHighSpeedVideoSizes(wOTSPlus, stack.pop(), highSpeedVideoSizes, hashTreeAddress2);
            org.bouncycastle.pqc.crypto.xmss.XMSSNode xMSSNode = new org.bouncycastle.pqc.crypto.xmss.XMSSNode(highSpeedVideoSizes2.getHeight() + 1, highSpeedVideoSizes2.getValue());
            hashTreeAddress = (org.bouncycastle.pqc.crypto.xmss.HashTreeAddress) new org.bouncycastle.pqc.crypto.xmss.HashTreeAddress.Builder().withLayerAddress(hashTreeAddress2.getLayerAddress()).withTreeAddress(hashTreeAddress2.getTreeAddress()).withTreeHeight(hashTreeAddress2.getHighSpeedVideoFpsRangesFor + 1).withTreeIndex(hashTreeAddress2.getHighSpeedVideoSizes).withKeyAndMask(hashTreeAddress2.getKeyAndMask()).build();
            highSpeedVideoSizes = xMSSNode;
        }
        org.bouncycastle.pqc.crypto.xmss.XMSSNode xMSSNode2 = this.getHighSpeedVideoSizesFor;
        if (xMSSNode2 == null) {
            this.getHighSpeedVideoSizesFor = highSpeedVideoSizes;
        } else if (xMSSNode2.getHeight() == highSpeedVideoSizes.getHeight()) {
            org.bouncycastle.pqc.crypto.xmss.HashTreeAddress hashTreeAddress3 = (org.bouncycastle.pqc.crypto.xmss.HashTreeAddress) new org.bouncycastle.pqc.crypto.xmss.HashTreeAddress.Builder().withLayerAddress(hashTreeAddress.getLayerAddress()).withTreeAddress(hashTreeAddress.getTreeAddress()).withTreeHeight(hashTreeAddress.getHighSpeedVideoFpsRangesFor).withTreeIndex((hashTreeAddress.getHighSpeedVideoSizes - 1) / 2).withKeyAndMask(hashTreeAddress.getKeyAndMask()).build();
            highSpeedVideoSizes = new org.bouncycastle.pqc.crypto.xmss.XMSSNode(this.getHighSpeedVideoSizesFor.getHeight() + 1, org.bouncycastle.pqc.crypto.xmss.XMSSNodeUtil.getHighSpeedVideoSizes(wOTSPlus, this.getHighSpeedVideoSizesFor, highSpeedVideoSizes, hashTreeAddress3).getValue());
            this.getHighSpeedVideoSizesFor = highSpeedVideoSizes;
        } else {
            stack.push(highSpeedVideoSizes);
        }
        if (this.getHighSpeedVideoSizesFor.getHeight() == this.getHighSpeedVideoFpsRanges) {
            this.Camera2StreamConfigurationMap = true;
        } else {
            this.getHighSpeedVideoSizes = highSpeedVideoSizes.getHeight();
            this.getHighSpeedVideoFpsRangesFor++;
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: Camera2StreamConfigurationMap, reason: merged with bridge method [inline-methods] */
    public final org.bouncycastle.pqc.crypto.xmss.BDSTreeHash clone() {
        org.bouncycastle.pqc.crypto.xmss.BDSTreeHash bDSTreeHash = new org.bouncycastle.pqc.crypto.xmss.BDSTreeHash(this.getHighSpeedVideoFpsRanges);
        bDSTreeHash.getHighSpeedVideoSizesFor = this.getHighSpeedVideoSizesFor;
        bDSTreeHash.getHighSpeedVideoSizes = this.getHighSpeedVideoSizes;
        bDSTreeHash.getHighSpeedVideoFpsRangesFor = this.getHighSpeedVideoFpsRangesFor;
        bDSTreeHash.getHighResolutionOutputSizeshNQ4ISI = this.getHighResolutionOutputSizeshNQ4ISI;
        bDSTreeHash.Camera2StreamConfigurationMap = this.Camera2StreamConfigurationMap;
        return bDSTreeHash;
    }

    BDSTreeHash(int i) {
        this.getHighSpeedVideoFpsRanges = i;
    }
}
