package org.bouncycastle.tsp.ers;

/* loaded from: classes17.dex */
public abstract class ERSCachingData implements org.bouncycastle.tsp.ers.ERSData {
    private java.util.Map<org.bouncycastle.asn1.x509.AlgorithmIdentifier, byte[]> Camera2StreamConfigurationMap = new java.util.HashMap();

    protected abstract byte[] calculateHash(org.bouncycastle.operator.DigestCalculator digestCalculator);

    @Override // org.bouncycastle.tsp.ers.ERSData
    public byte[] getHash(org.bouncycastle.operator.DigestCalculator digestCalculator) {
        org.bouncycastle.asn1.x509.AlgorithmIdentifier algorithmIdentifier = digestCalculator.getAlgorithmIdentifier();
        if (this.Camera2StreamConfigurationMap.containsKey(algorithmIdentifier)) {
            return this.Camera2StreamConfigurationMap.get(algorithmIdentifier);
        }
        byte[] calculateHash = calculateHash(digestCalculator);
        this.Camera2StreamConfigurationMap.put(algorithmIdentifier, calculateHash);
        return calculateHash;
    }
}
