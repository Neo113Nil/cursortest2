package org.bouncycastle.tsp.ers;

/* loaded from: classes17.dex */
public class ERSInputStreamData extends org.bouncycastle.tsp.ers.ERSCachingData {
    private final java.io.InputStream getHighSpeedVideoSizes;

    @Override // org.bouncycastle.tsp.ers.ERSCachingData
    protected byte[] calculateHash(org.bouncycastle.operator.DigestCalculator digestCalculator) {
        return org.bouncycastle.tsp.ers.ERSUtil.getHighSpeedVideoFpsRangesFor(digestCalculator, this.getHighSpeedVideoSizes);
    }

    public ERSInputStreamData(java.io.InputStream inputStream) {
        this.getHighSpeedVideoSizes = inputStream;
    }

    public ERSInputStreamData(java.io.File file) throws java.io.FileNotFoundException {
        if (file.isDirectory()) {
            throw new java.lang.IllegalArgumentException("directory not allowed");
        }
        this.getHighSpeedVideoSizes = new java.io.FileInputStream(file);
    }
}
