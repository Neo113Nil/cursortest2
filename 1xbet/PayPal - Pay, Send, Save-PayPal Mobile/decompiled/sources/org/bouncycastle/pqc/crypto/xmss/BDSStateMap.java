package org.bouncycastle.pqc.crypto.xmss;

/* loaded from: classes17.dex */
public class BDSStateMap implements java.io.Serializable {
    private static final long serialVersionUID = -3464451825208522308L;
    private transient long Camera2StreamConfigurationMap;
    final java.util.Map<java.lang.Integer, org.bouncycastle.pqc.crypto.xmss.BDS> getHighSpeedVideoFpsRangesFor = new java.util.TreeMap();

    final void getHighSpeedVideoFpsRangesFor(org.bouncycastle.pqc.crypto.xmss.XMSSMTParameters xMSSMTParameters, long j, byte[] bArr, byte[] bArr2) {
        org.bouncycastle.pqc.crypto.xmss.XMSSParameters xMSSParameters = xMSSMTParameters.getXMSSParameters();
        int height = xMSSParameters.getHeight();
        long treeIndex = org.bouncycastle.pqc.crypto.xmss.XMSSUtil.getTreeIndex(j, height);
        int leafIndex = org.bouncycastle.pqc.crypto.xmss.XMSSUtil.getLeafIndex(j, height);
        org.bouncycastle.pqc.crypto.xmss.OTSHashAddress oTSHashAddress = (org.bouncycastle.pqc.crypto.xmss.OTSHashAddress) new org.bouncycastle.pqc.crypto.xmss.OTSHashAddress.Builder().withTreeAddress(treeIndex).withOTSAddress(leafIndex).build();
        int i = (1 << height) - 1;
        if (leafIndex < i) {
            if (this.getHighSpeedVideoFpsRangesFor.get(org.bouncycastle.util.Integers.valueOf(0)) == null || leafIndex == 0) {
                this.getHighSpeedVideoFpsRangesFor.put(org.bouncycastle.util.Integers.valueOf(0), new org.bouncycastle.pqc.crypto.xmss.BDS(xMSSParameters, bArr, bArr2, oTSHashAddress));
            }
            getHighSpeedVideoFpsRanges(0, bArr, bArr2, oTSHashAddress);
        }
        for (int i2 = 1; i2 < xMSSMTParameters.getLayers(); i2++) {
            int leafIndex2 = org.bouncycastle.pqc.crypto.xmss.XMSSUtil.getLeafIndex(treeIndex, height);
            treeIndex = org.bouncycastle.pqc.crypto.xmss.XMSSUtil.getTreeIndex(treeIndex, height);
            org.bouncycastle.pqc.crypto.xmss.OTSHashAddress oTSHashAddress2 = (org.bouncycastle.pqc.crypto.xmss.OTSHashAddress) new org.bouncycastle.pqc.crypto.xmss.OTSHashAddress.Builder().withLayerAddress(i2).withTreeAddress(treeIndex).withOTSAddress(leafIndex2).build();
            if (this.getHighSpeedVideoFpsRangesFor.get(java.lang.Integer.valueOf(i2)) == null || org.bouncycastle.pqc.crypto.xmss.XMSSUtil.isNewBDSInitNeeded(j, height, i2)) {
                this.getHighSpeedVideoFpsRangesFor.put(java.lang.Integer.valueOf(i2), new org.bouncycastle.pqc.crypto.xmss.BDS(xMSSParameters, bArr, bArr2, oTSHashAddress2));
            }
            if (leafIndex2 < i && org.bouncycastle.pqc.crypto.xmss.XMSSUtil.isNewAuthenticationPathNeeded(j, height, i2)) {
                getHighSpeedVideoFpsRanges(i2, bArr, bArr2, oTSHashAddress2);
            }
        }
    }

    public org.bouncycastle.pqc.crypto.xmss.BDSStateMap withWOTSDigest(org.bouncycastle.asn1.ASN1ObjectIdentifier aSN1ObjectIdentifier) {
        org.bouncycastle.pqc.crypto.xmss.BDSStateMap bDSStateMap = new org.bouncycastle.pqc.crypto.xmss.BDSStateMap(this.Camera2StreamConfigurationMap);
        for (java.lang.Integer num : this.getHighSpeedVideoFpsRangesFor.keySet()) {
            bDSStateMap.getHighSpeedVideoFpsRangesFor.put(num, this.getHighSpeedVideoFpsRangesFor.get(num).withWOTSDigest(aSN1ObjectIdentifier));
        }
        return bDSStateMap;
    }

    private org.bouncycastle.pqc.crypto.xmss.BDS getHighSpeedVideoFpsRanges(int i, byte[] bArr, byte[] bArr2, org.bouncycastle.pqc.crypto.xmss.OTSHashAddress oTSHashAddress) {
        return this.getHighSpeedVideoFpsRangesFor.put(org.bouncycastle.util.Integers.valueOf(i), this.getHighSpeedVideoFpsRangesFor.get(org.bouncycastle.util.Integers.valueOf(i)).getNextState(bArr, bArr2, oTSHashAddress));
    }

    public boolean isEmpty() {
        return this.getHighSpeedVideoFpsRangesFor.isEmpty();
    }

    public long getMaxIndex() {
        return this.Camera2StreamConfigurationMap;
    }

    private void writeObject(java.io.ObjectOutputStream objectOutputStream) throws java.io.IOException {
        objectOutputStream.defaultWriteObject();
        objectOutputStream.writeLong(this.Camera2StreamConfigurationMap);
    }

    private void readObject(java.io.ObjectInputStream objectInputStream) throws java.io.IOException, java.lang.ClassNotFoundException {
        objectInputStream.defaultReadObject();
        this.Camera2StreamConfigurationMap = objectInputStream.available() != 0 ? objectInputStream.readLong() : 0L;
    }

    BDSStateMap(org.bouncycastle.pqc.crypto.xmss.XMSSMTParameters xMSSMTParameters, long j, byte[] bArr, byte[] bArr2) {
        this.Camera2StreamConfigurationMap = (1 << xMSSMTParameters.getHeight()) - 1;
        for (long j2 = 0; j2 < j; j2++) {
            getHighSpeedVideoFpsRangesFor(xMSSMTParameters, j2, bArr, bArr2);
        }
    }

    BDSStateMap(org.bouncycastle.pqc.crypto.xmss.BDSStateMap bDSStateMap, long j) {
        for (java.lang.Integer num : bDSStateMap.getHighSpeedVideoFpsRangesFor.keySet()) {
            this.getHighSpeedVideoFpsRangesFor.put(num, new org.bouncycastle.pqc.crypto.xmss.BDS(bDSStateMap.getHighSpeedVideoFpsRangesFor.get(num)));
        }
        this.Camera2StreamConfigurationMap = j;
    }

    BDSStateMap(long j) {
        this.Camera2StreamConfigurationMap = j;
    }
}
