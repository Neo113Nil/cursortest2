package org.bouncycastle.tsp.ers;

/* loaded from: classes17.dex */
public class ERSByteData extends org.bouncycastle.tsp.ers.ERSCachingData {
    private final byte[] Camera2StreamConfigurationMap;

    @Override // org.bouncycastle.tsp.ers.ERSCachingData
    protected byte[] calculateHash(org.bouncycastle.operator.DigestCalculator digestCalculator) {
        return org.bouncycastle.tsp.ers.ERSUtil.getHighSpeedVideoFpsRanges(digestCalculator, this.Camera2StreamConfigurationMap);
    }

    public ERSByteData(byte[] bArr) {
        this.Camera2StreamConfigurationMap = bArr;
    }
}
