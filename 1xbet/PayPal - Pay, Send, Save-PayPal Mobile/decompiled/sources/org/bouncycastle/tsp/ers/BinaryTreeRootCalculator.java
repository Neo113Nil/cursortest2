package org.bouncycastle.tsp.ers;

/* loaded from: classes17.dex */
public class BinaryTreeRootCalculator implements org.bouncycastle.tsp.ers.ERSRootNodeCalculator {
    @Override // org.bouncycastle.tsp.ers.ERSRootNodeCalculator
    public byte[] computeRootHash(org.bouncycastle.operator.DigestCalculator digestCalculator, org.bouncycastle.asn1.tsp.PartialHashtree[] partialHashtreeArr) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        for (int i = 0; i <= partialHashtreeArr.length - 2; i += 2) {
            arrayList.add(org.bouncycastle.tsp.ers.ERSUtil.getHighSpeedVideoSizes(digestCalculator, org.bouncycastle.tsp.ers.ERSUtil.getHighSpeedVideoSizes(digestCalculator, partialHashtreeArr[i]), org.bouncycastle.tsp.ers.ERSUtil.getHighSpeedVideoSizes(digestCalculator, partialHashtreeArr[i + 1])));
        }
        if (partialHashtreeArr.length % 2 == 1) {
            arrayList.add(org.bouncycastle.tsp.ers.ERSUtil.getHighSpeedVideoSizes(digestCalculator, partialHashtreeArr[partialHashtreeArr.length - 1]));
        }
        while (true) {
            java.util.ArrayList arrayList2 = new java.util.ArrayList((arrayList.size() + 1) / 2);
            for (int i2 = 0; i2 <= arrayList.size() - 2; i2 += 2) {
                arrayList2.add(org.bouncycastle.tsp.ers.ERSUtil.getHighSpeedVideoSizes(digestCalculator, (byte[]) arrayList.get(i2), (byte[]) arrayList.get(i2 + 1)));
            }
            if (arrayList.size() % 2 == 1) {
                arrayList2.add(arrayList.get(arrayList.size() - 1));
            }
            if (arrayList2.size() <= 1) {
                return (byte[]) arrayList2.get(0);
            }
            arrayList = arrayList2;
        }
    }
}
