package org.bouncycastle.pqc.crypto.xmss;

/* loaded from: classes17.dex */
class XMSSNodeUtil {
    static org.bouncycastle.pqc.crypto.xmss.XMSSNode getHighSpeedVideoSizes(org.bouncycastle.pqc.crypto.xmss.WOTSPlus wOTSPlus, org.bouncycastle.pqc.crypto.xmss.WOTSPlusPublicKeyParameters wOTSPlusPublicKeyParameters, org.bouncycastle.pqc.crypto.xmss.LTreeAddress lTreeAddress) {
        double d;
        if (wOTSPlusPublicKeyParameters == null) {
            throw new java.lang.NullPointerException("publicKey == null");
        }
        if (lTreeAddress == null) {
            throw new java.lang.NullPointerException("address == null");
        }
        int i = wOTSPlus.getHighSpeedVideoFpsRanges.getHighSpeedVideoFpsRangesFor;
        byte[][] cloneArray = org.bouncycastle.pqc.crypto.xmss.XMSSUtil.cloneArray(wOTSPlusPublicKeyParameters.Camera2StreamConfigurationMap);
        org.bouncycastle.pqc.crypto.xmss.XMSSNode[] xMSSNodeArr = new org.bouncycastle.pqc.crypto.xmss.XMSSNode[cloneArray.length];
        for (int i2 = 0; i2 < cloneArray.length; i2++) {
            xMSSNodeArr[i2] = new org.bouncycastle.pqc.crypto.xmss.XMSSNode(0, cloneArray[i2]);
        }
        org.bouncycastle.pqc.crypto.xmss.LTreeAddress.Builder withKeyAndMask = new org.bouncycastle.pqc.crypto.xmss.LTreeAddress.Builder().withLayerAddress(lTreeAddress.getLayerAddress()).withTreeAddress(lTreeAddress.getTreeAddress()).withLTreeAddress(lTreeAddress.Camera2StreamConfigurationMap).withTreeHeight(0).withTreeIndex(lTreeAddress.getHighSpeedVideoSizes).withKeyAndMask(lTreeAddress.getKeyAndMask());
        while (true) {
            org.bouncycastle.pqc.crypto.xmss.LTreeAddress lTreeAddress2 = (org.bouncycastle.pqc.crypto.xmss.LTreeAddress) withKeyAndMask.build();
            if (i <= 1) {
                return xMSSNodeArr[0];
            }
            int i3 = 0;
            while (true) {
                d = i / 2;
                if (i3 >= ((int) java.lang.Math.floor(d))) {
                    break;
                }
                lTreeAddress2 = (org.bouncycastle.pqc.crypto.xmss.LTreeAddress) new org.bouncycastle.pqc.crypto.xmss.LTreeAddress.Builder().withLayerAddress(lTreeAddress2.getLayerAddress()).withTreeAddress(lTreeAddress2.getTreeAddress()).withLTreeAddress(lTreeAddress2.Camera2StreamConfigurationMap).withTreeHeight(lTreeAddress2.getHighResolutionOutputSizeshNQ4ISI).withTreeIndex(i3).withKeyAndMask(lTreeAddress2.getKeyAndMask()).build();
                int i4 = i3 * 2;
                xMSSNodeArr[i3] = getHighSpeedVideoSizes(wOTSPlus, xMSSNodeArr[i4], xMSSNodeArr[i4 + 1], lTreeAddress2);
                i3++;
            }
            if (i % 2 == 1) {
                xMSSNodeArr[(int) java.lang.Math.floor(d)] = xMSSNodeArr[i - 1];
            }
            i = (int) java.lang.Math.ceil(i / 2.0d);
            withKeyAndMask = new org.bouncycastle.pqc.crypto.xmss.LTreeAddress.Builder().withLayerAddress(lTreeAddress2.getLayerAddress()).withTreeAddress(lTreeAddress2.getTreeAddress()).withLTreeAddress(lTreeAddress2.Camera2StreamConfigurationMap).withTreeHeight(lTreeAddress2.getHighResolutionOutputSizeshNQ4ISI + 1).withTreeIndex(lTreeAddress2.getHighSpeedVideoSizes).withKeyAndMask(lTreeAddress2.getKeyAndMask());
        }
    }

    static org.bouncycastle.pqc.crypto.xmss.XMSSNode getHighSpeedVideoSizes(org.bouncycastle.pqc.crypto.xmss.WOTSPlus wOTSPlus, org.bouncycastle.pqc.crypto.xmss.XMSSNode xMSSNode, org.bouncycastle.pqc.crypto.xmss.XMSSNode xMSSNode2, org.bouncycastle.pqc.crypto.xmss.XMSSAddress xMSSAddress) {
        if (xMSSNode == null) {
            throw new java.lang.NullPointerException("left == null");
        }
        if (xMSSNode2 == null) {
            throw new java.lang.NullPointerException("right == null");
        }
        if (xMSSNode.getHeight() != xMSSNode2.getHeight()) {
            throw new java.lang.IllegalStateException("height of both nodes must be equal");
        }
        if (xMSSAddress == null) {
            throw new java.lang.NullPointerException("address == null");
        }
        byte[] clone = org.bouncycastle.util.Arrays.clone(wOTSPlus.getHighSpeedVideoSizes);
        if (xMSSAddress instanceof org.bouncycastle.pqc.crypto.xmss.LTreeAddress) {
            org.bouncycastle.pqc.crypto.xmss.LTreeAddress lTreeAddress = (org.bouncycastle.pqc.crypto.xmss.LTreeAddress) xMSSAddress;
            xMSSAddress = (org.bouncycastle.pqc.crypto.xmss.LTreeAddress) new org.bouncycastle.pqc.crypto.xmss.LTreeAddress.Builder().withLayerAddress(lTreeAddress.getLayerAddress()).withTreeAddress(lTreeAddress.getTreeAddress()).withLTreeAddress(lTreeAddress.Camera2StreamConfigurationMap).withTreeHeight(lTreeAddress.getHighResolutionOutputSizeshNQ4ISI).withTreeIndex(lTreeAddress.getHighSpeedVideoSizes).withKeyAndMask(0).build();
        } else if (xMSSAddress instanceof org.bouncycastle.pqc.crypto.xmss.HashTreeAddress) {
            org.bouncycastle.pqc.crypto.xmss.HashTreeAddress hashTreeAddress = (org.bouncycastle.pqc.crypto.xmss.HashTreeAddress) xMSSAddress;
            xMSSAddress = (org.bouncycastle.pqc.crypto.xmss.HashTreeAddress) new org.bouncycastle.pqc.crypto.xmss.HashTreeAddress.Builder().withLayerAddress(hashTreeAddress.getLayerAddress()).withTreeAddress(hashTreeAddress.getTreeAddress()).withTreeHeight(hashTreeAddress.getHighSpeedVideoFpsRangesFor).withTreeIndex(hashTreeAddress.getHighSpeedVideoSizes).withKeyAndMask(0).build();
        }
        byte[] highSpeedVideoFpsRangesFor = wOTSPlus.getHighSpeedVideoFpsRangesFor.getHighSpeedVideoFpsRangesFor(clone, xMSSAddress.toByteArray());
        if (xMSSAddress instanceof org.bouncycastle.pqc.crypto.xmss.LTreeAddress) {
            org.bouncycastle.pqc.crypto.xmss.LTreeAddress lTreeAddress2 = (org.bouncycastle.pqc.crypto.xmss.LTreeAddress) xMSSAddress;
            xMSSAddress = (org.bouncycastle.pqc.crypto.xmss.LTreeAddress) new org.bouncycastle.pqc.crypto.xmss.LTreeAddress.Builder().withLayerAddress(lTreeAddress2.getLayerAddress()).withTreeAddress(lTreeAddress2.getTreeAddress()).withLTreeAddress(lTreeAddress2.Camera2StreamConfigurationMap).withTreeHeight(lTreeAddress2.getHighResolutionOutputSizeshNQ4ISI).withTreeIndex(lTreeAddress2.getHighSpeedVideoSizes).withKeyAndMask(1).build();
        } else if (xMSSAddress instanceof org.bouncycastle.pqc.crypto.xmss.HashTreeAddress) {
            org.bouncycastle.pqc.crypto.xmss.HashTreeAddress hashTreeAddress2 = (org.bouncycastle.pqc.crypto.xmss.HashTreeAddress) xMSSAddress;
            xMSSAddress = (org.bouncycastle.pqc.crypto.xmss.HashTreeAddress) new org.bouncycastle.pqc.crypto.xmss.HashTreeAddress.Builder().withLayerAddress(hashTreeAddress2.getLayerAddress()).withTreeAddress(hashTreeAddress2.getTreeAddress()).withTreeHeight(hashTreeAddress2.getHighSpeedVideoFpsRangesFor).withTreeIndex(hashTreeAddress2.getHighSpeedVideoSizes).withKeyAndMask(1).build();
        }
        byte[] highSpeedVideoFpsRangesFor2 = wOTSPlus.getHighSpeedVideoFpsRangesFor.getHighSpeedVideoFpsRangesFor(clone, xMSSAddress.toByteArray());
        if (xMSSAddress instanceof org.bouncycastle.pqc.crypto.xmss.LTreeAddress) {
            org.bouncycastle.pqc.crypto.xmss.LTreeAddress lTreeAddress3 = (org.bouncycastle.pqc.crypto.xmss.LTreeAddress) xMSSAddress;
            xMSSAddress = (org.bouncycastle.pqc.crypto.xmss.LTreeAddress) new org.bouncycastle.pqc.crypto.xmss.LTreeAddress.Builder().withLayerAddress(lTreeAddress3.getLayerAddress()).withTreeAddress(lTreeAddress3.getTreeAddress()).withLTreeAddress(lTreeAddress3.Camera2StreamConfigurationMap).withTreeHeight(lTreeAddress3.getHighResolutionOutputSizeshNQ4ISI).withTreeIndex(lTreeAddress3.getHighSpeedVideoSizes).withKeyAndMask(2).build();
        } else if (xMSSAddress instanceof org.bouncycastle.pqc.crypto.xmss.HashTreeAddress) {
            org.bouncycastle.pqc.crypto.xmss.HashTreeAddress hashTreeAddress3 = (org.bouncycastle.pqc.crypto.xmss.HashTreeAddress) xMSSAddress;
            xMSSAddress = (org.bouncycastle.pqc.crypto.xmss.HashTreeAddress) new org.bouncycastle.pqc.crypto.xmss.HashTreeAddress.Builder().withLayerAddress(hashTreeAddress3.getLayerAddress()).withTreeAddress(hashTreeAddress3.getTreeAddress()).withTreeHeight(hashTreeAddress3.getHighSpeedVideoFpsRangesFor).withTreeIndex(hashTreeAddress3.getHighSpeedVideoSizes).withKeyAndMask(2).build();
        }
        byte[] highSpeedVideoFpsRangesFor3 = wOTSPlus.getHighSpeedVideoFpsRangesFor.getHighSpeedVideoFpsRangesFor(clone, xMSSAddress.toByteArray());
        int i = wOTSPlus.getHighSpeedVideoFpsRanges.getHighSpeedVideoSizes;
        byte[] bArr = new byte[i * 2];
        for (int i2 = 0; i2 < i; i2++) {
            bArr[i2] = (byte) (xMSSNode.getValue()[i2] ^ highSpeedVideoFpsRangesFor2[i2]);
        }
        for (int i3 = 0; i3 < i; i3++) {
            bArr[i3 + i] = (byte) (xMSSNode2.getValue()[i3] ^ highSpeedVideoFpsRangesFor3[i3]);
        }
        return new org.bouncycastle.pqc.crypto.xmss.XMSSNode(xMSSNode.getHeight(), wOTSPlus.getHighSpeedVideoFpsRangesFor.getHighSpeedVideoFpsRanges(highSpeedVideoFpsRangesFor, bArr));
    }

    XMSSNodeUtil() {
    }
}
