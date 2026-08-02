package org.bouncycastle.pqc.crypto.xmss;

/* loaded from: classes17.dex */
class XMSSVerifierUtil {
    static org.bouncycastle.pqc.crypto.xmss.XMSSNode getHighSpeedVideoSizes(org.bouncycastle.pqc.crypto.xmss.WOTSPlus wOTSPlus, int i, byte[] bArr, org.bouncycastle.pqc.crypto.xmss.XMSSReducedSignature xMSSReducedSignature, org.bouncycastle.pqc.crypto.xmss.OTSHashAddress oTSHashAddress, int i2) {
        if (bArr.length != wOTSPlus.getHighSpeedVideoFpsRanges.getHighSpeedVideoSizes) {
            throw new java.lang.IllegalArgumentException("size of messageDigest needs to be equal to size of digest");
        }
        if (xMSSReducedSignature == null) {
            throw new java.lang.NullPointerException("signature == null");
        }
        if (oTSHashAddress == null) {
            throw new java.lang.NullPointerException("otsHashAddress == null");
        }
        org.bouncycastle.pqc.crypto.xmss.LTreeAddress lTreeAddress = (org.bouncycastle.pqc.crypto.xmss.LTreeAddress) new org.bouncycastle.pqc.crypto.xmss.LTreeAddress.Builder().withLayerAddress(oTSHashAddress.getLayerAddress()).withTreeAddress(oTSHashAddress.getTreeAddress()).withLTreeAddress(oTSHashAddress.getHighSpeedVideoFpsRanges).build();
        org.bouncycastle.pqc.crypto.xmss.HashTreeAddress hashTreeAddress = (org.bouncycastle.pqc.crypto.xmss.HashTreeAddress) new org.bouncycastle.pqc.crypto.xmss.HashTreeAddress.Builder().withLayerAddress(oTSHashAddress.getLayerAddress()).withTreeAddress(oTSHashAddress.getTreeAddress()).withTreeIndex(oTSHashAddress.getHighSpeedVideoFpsRanges).build();
        org.bouncycastle.pqc.crypto.xmss.XMSSNode[] xMSSNodeArr = new org.bouncycastle.pqc.crypto.xmss.XMSSNode[2];
        xMSSNodeArr[0] = org.bouncycastle.pqc.crypto.xmss.XMSSNodeUtil.getHighSpeedVideoSizes(wOTSPlus, wOTSPlus.Camera2StreamConfigurationMap(bArr, xMSSReducedSignature.getWOTSPlusSignature(), oTSHashAddress), lTreeAddress);
        for (int i3 = 0; i3 < i; i3++) {
            org.bouncycastle.pqc.crypto.xmss.HashTreeAddress hashTreeAddress2 = (org.bouncycastle.pqc.crypto.xmss.HashTreeAddress) new org.bouncycastle.pqc.crypto.xmss.HashTreeAddress.Builder().withLayerAddress(hashTreeAddress.getLayerAddress()).withTreeAddress(hashTreeAddress.getTreeAddress()).withTreeHeight(i3).withTreeIndex(hashTreeAddress.getHighSpeedVideoSizes).withKeyAndMask(hashTreeAddress.getKeyAndMask()).build();
            if (java.lang.Math.floor(i2 / (1 << i3)) % 2.0d == 0.0d) {
                hashTreeAddress = (org.bouncycastle.pqc.crypto.xmss.HashTreeAddress) new org.bouncycastle.pqc.crypto.xmss.HashTreeAddress.Builder().withLayerAddress(hashTreeAddress2.getLayerAddress()).withTreeAddress(hashTreeAddress2.getTreeAddress()).withTreeHeight(hashTreeAddress2.getHighSpeedVideoFpsRangesFor).withTreeIndex(hashTreeAddress2.getHighSpeedVideoSizes / 2).withKeyAndMask(hashTreeAddress2.getKeyAndMask()).build();
                org.bouncycastle.pqc.crypto.xmss.XMSSNode highSpeedVideoSizes = org.bouncycastle.pqc.crypto.xmss.XMSSNodeUtil.getHighSpeedVideoSizes(wOTSPlus, xMSSNodeArr[0], xMSSReducedSignature.getAuthPath().get(i3), hashTreeAddress);
                xMSSNodeArr[1] = highSpeedVideoSizes;
                xMSSNodeArr[1] = new org.bouncycastle.pqc.crypto.xmss.XMSSNode(highSpeedVideoSizes.getHeight() + 1, xMSSNodeArr[1].getValue());
            } else {
                hashTreeAddress = (org.bouncycastle.pqc.crypto.xmss.HashTreeAddress) new org.bouncycastle.pqc.crypto.xmss.HashTreeAddress.Builder().withLayerAddress(hashTreeAddress2.getLayerAddress()).withTreeAddress(hashTreeAddress2.getTreeAddress()).withTreeHeight(hashTreeAddress2.getHighSpeedVideoFpsRangesFor).withTreeIndex((hashTreeAddress2.getHighSpeedVideoSizes - 1) / 2).withKeyAndMask(hashTreeAddress2.getKeyAndMask()).build();
                org.bouncycastle.pqc.crypto.xmss.XMSSNode highSpeedVideoSizes2 = org.bouncycastle.pqc.crypto.xmss.XMSSNodeUtil.getHighSpeedVideoSizes(wOTSPlus, xMSSReducedSignature.getAuthPath().get(i3), xMSSNodeArr[0], hashTreeAddress);
                xMSSNodeArr[1] = highSpeedVideoSizes2;
                xMSSNodeArr[1] = new org.bouncycastle.pqc.crypto.xmss.XMSSNode(highSpeedVideoSizes2.getHeight() + 1, xMSSNodeArr[1].getValue());
            }
            xMSSNodeArr[0] = xMSSNodeArr[1];
        }
        return xMSSNodeArr[0];
    }

    XMSSVerifierUtil() {
    }
}
