package org.bouncycastle.tsp.ers;

/* loaded from: classes17.dex */
public interface ERSRootNodeCalculator {
    byte[] computeRootHash(org.bouncycastle.operator.DigestCalculator digestCalculator, org.bouncycastle.asn1.tsp.PartialHashtree[] partialHashtreeArr);
}
