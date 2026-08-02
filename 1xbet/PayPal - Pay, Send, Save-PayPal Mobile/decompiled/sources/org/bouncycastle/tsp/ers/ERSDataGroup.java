package org.bouncycastle.tsp.ers;

/* loaded from: classes17.dex */
public class ERSDataGroup extends org.bouncycastle.tsp.ers.ERSCachingData {
    protected java.util.List<org.bouncycastle.tsp.ers.ERSData> dataObjects;

    public int size() {
        return this.dataObjects.size();
    }

    public java.util.List<byte[]> getHashes(org.bouncycastle.operator.DigestCalculator digestCalculator) {
        return org.bouncycastle.tsp.ers.ERSUtil.getHighSpeedVideoSizes(digestCalculator, this.dataObjects);
    }

    @Override // org.bouncycastle.tsp.ers.ERSCachingData
    protected byte[] calculateHash(org.bouncycastle.operator.DigestCalculator digestCalculator) {
        java.util.List<byte[]> hashes = getHashes(digestCalculator);
        return hashes.size() > 1 ? org.bouncycastle.tsp.ers.ERSUtil.getHighResolutionOutputSizeshNQ4ISI(digestCalculator, hashes.iterator()) : hashes.get(0);
    }

    public ERSDataGroup(org.bouncycastle.tsp.ers.ERSData... eRSDataArr) {
        java.util.ArrayList arrayList = new java.util.ArrayList(eRSDataArr.length);
        this.dataObjects = arrayList;
        arrayList.addAll(java.util.Arrays.asList(eRSDataArr));
    }

    public ERSDataGroup(org.bouncycastle.tsp.ers.ERSData eRSData) {
        this.dataObjects = java.util.Collections.singletonList(eRSData);
    }

    public ERSDataGroup(java.util.List<org.bouncycastle.tsp.ers.ERSData> list) {
        java.util.ArrayList arrayList = new java.util.ArrayList(list.size());
        this.dataObjects = arrayList;
        arrayList.addAll(list);
    }
}
