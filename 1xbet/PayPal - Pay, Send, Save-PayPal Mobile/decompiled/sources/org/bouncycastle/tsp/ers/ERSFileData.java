package org.bouncycastle.tsp.ers;

/* loaded from: classes17.dex */
public class ERSFileData extends org.bouncycastle.tsp.ers.ERSCachingData {
    private final java.io.File Camera2StreamConfigurationMap;

    @Override // org.bouncycastle.tsp.ers.ERSCachingData
    protected byte[] calculateHash(org.bouncycastle.operator.DigestCalculator digestCalculator) {
        try {
            java.io.FileInputStream fileInputStream = new java.io.FileInputStream(this.Camera2StreamConfigurationMap);
            byte[] highSpeedVideoFpsRangesFor = org.bouncycastle.tsp.ers.ERSUtil.getHighSpeedVideoFpsRangesFor(digestCalculator, fileInputStream);
            fileInputStream.close();
            return highSpeedVideoFpsRangesFor;
        } catch (java.io.IOException unused) {
            java.lang.StringBuilder sb = new java.lang.StringBuilder("unable to process ");
            sb.append(this.Camera2StreamConfigurationMap.getAbsolutePath());
            throw new java.lang.IllegalStateException(sb.toString());
        }
    }

    public ERSFileData(java.io.File file) throws java.io.FileNotFoundException {
        if (file.isDirectory()) {
            throw new java.lang.IllegalArgumentException("directory not allowed as ERSFileData");
        }
        if (!file.exists()) {
            java.lang.StringBuilder sb = new java.lang.StringBuilder();
            sb.append(file.getAbsolutePath());
            sb.append(" does not exist");
            throw new java.io.FileNotFoundException(sb.toString());
        }
        if (file.canRead()) {
            this.Camera2StreamConfigurationMap = file;
            return;
        }
        java.lang.StringBuilder sb2 = new java.lang.StringBuilder();
        sb2.append(file.getAbsolutePath());
        sb2.append(" is not readable");
        throw new java.io.FileNotFoundException(sb2.toString());
    }
}
