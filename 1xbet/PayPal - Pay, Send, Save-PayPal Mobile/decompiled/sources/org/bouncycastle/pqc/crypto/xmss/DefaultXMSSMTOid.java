package org.bouncycastle.pqc.crypto.xmss;

/* loaded from: classes17.dex */
public final class DefaultXMSSMTOid implements org.bouncycastle.pqc.crypto.xmss.XMSSOid {
    private static final java.util.Map<java.lang.String, org.bouncycastle.pqc.crypto.xmss.DefaultXMSSMTOid> getHighSpeedVideoFpsRangesFor;
    private final java.lang.String Camera2StreamConfigurationMap;
    private final int getHighResolutionOutputSizeshNQ4ISI;

    @Override // org.bouncycastle.pqc.crypto.xmss.XMSSOid
    public final java.lang.String toString() {
        return this.Camera2StreamConfigurationMap;
    }

    @Override // org.bouncycastle.pqc.crypto.xmss.XMSSOid
    public final int getOid() {
        return this.getHighResolutionOutputSizeshNQ4ISI;
    }

    public static org.bouncycastle.pqc.crypto.xmss.DefaultXMSSMTOid lookup(java.lang.String str, int i, int i2, int i3, int i4, int i5) {
        if (str != null) {
            return getHighSpeedVideoFpsRangesFor.get(getHighSpeedVideoFpsRanges(str, i, i2, i3, i4, i5));
        }
        throw new java.lang.NullPointerException("algorithmName == null");
    }

    private static java.lang.String getHighSpeedVideoFpsRanges(java.lang.String str, int i, int i2, int i3, int i4, int i5) {
        if (str == null) {
            throw new java.lang.NullPointerException("algorithmName == null");
        }
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append(str);
        sb.append("-");
        sb.append(i);
        sb.append("-");
        sb.append(i2);
        sb.append("-");
        sb.append(i3);
        sb.append("-");
        sb.append(i4);
        sb.append("-");
        sb.append(i5);
        return sb.toString();
    }

    private DefaultXMSSMTOid(int i, java.lang.String str) {
        this.getHighResolutionOutputSizeshNQ4ISI = i;
        this.Camera2StreamConfigurationMap = str;
    }

    static {
        java.util.HashMap hashMap = new java.util.HashMap();
        hashMap.put(getHighSpeedVideoFpsRanges("SHA-256", 32, 16, 67, 20, 2), new org.bouncycastle.pqc.crypto.xmss.DefaultXMSSMTOid(1, "XMSSMT_SHA2_20/2_256"));
        hashMap.put(getHighSpeedVideoFpsRanges("SHA-256", 32, 16, 67, 20, 4), new org.bouncycastle.pqc.crypto.xmss.DefaultXMSSMTOid(2, "XMSSMT_SHA2_20/4_256"));
        hashMap.put(getHighSpeedVideoFpsRanges("SHA-256", 32, 16, 67, 40, 2), new org.bouncycastle.pqc.crypto.xmss.DefaultXMSSMTOid(3, "XMSSMT_SHA2_40/2_256"));
        hashMap.put(getHighSpeedVideoFpsRanges("SHA-256", 32, 16, 67, 40, 2), new org.bouncycastle.pqc.crypto.xmss.DefaultXMSSMTOid(4, "XMSSMT_SHA2_40/4_256"));
        hashMap.put(getHighSpeedVideoFpsRanges("SHA-256", 32, 16, 67, 40, 4), new org.bouncycastle.pqc.crypto.xmss.DefaultXMSSMTOid(5, "XMSSMT_SHA2_40/8_256"));
        hashMap.put(getHighSpeedVideoFpsRanges("SHA-256", 32, 16, 67, 60, 8), new org.bouncycastle.pqc.crypto.xmss.DefaultXMSSMTOid(6, "XMSSMT_SHA2_60/3_256"));
        hashMap.put(getHighSpeedVideoFpsRanges("SHA-256", 32, 16, 67, 60, 6), new org.bouncycastle.pqc.crypto.xmss.DefaultXMSSMTOid(7, "XMSSMT_SHA2_60/6_256"));
        hashMap.put(getHighSpeedVideoFpsRanges("SHA-256", 32, 16, 67, 60, 12), new org.bouncycastle.pqc.crypto.xmss.DefaultXMSSMTOid(8, "XMSSMT_SHA2_60/12_256"));
        hashMap.put(getHighSpeedVideoFpsRanges("SHA-512", 64, 16, 131, 20, 2), new org.bouncycastle.pqc.crypto.xmss.DefaultXMSSMTOid(9, "XMSSMT_SHA2_20/2_512"));
        hashMap.put(getHighSpeedVideoFpsRanges("SHA-512", 64, 16, 131, 20, 4), new org.bouncycastle.pqc.crypto.xmss.DefaultXMSSMTOid(10, "XMSSMT_SHA2_20/4_512"));
        hashMap.put(getHighSpeedVideoFpsRanges("SHA-512", 64, 16, 131, 40, 2), new org.bouncycastle.pqc.crypto.xmss.DefaultXMSSMTOid(11, "XMSSMT_SHA2_40/2_512"));
        hashMap.put(getHighSpeedVideoFpsRanges("SHA-512", 64, 16, 131, 40, 4), new org.bouncycastle.pqc.crypto.xmss.DefaultXMSSMTOid(12, "XMSSMT_SHA2_40/4_512"));
        hashMap.put(getHighSpeedVideoFpsRanges("SHA-512", 64, 16, 131, 40, 8), new org.bouncycastle.pqc.crypto.xmss.DefaultXMSSMTOid(13, "XMSSMT_SHA2_40/8_512"));
        hashMap.put(getHighSpeedVideoFpsRanges("SHA-512", 64, 16, 131, 60, 3), new org.bouncycastle.pqc.crypto.xmss.DefaultXMSSMTOid(14, "XMSSMT_SHA2_60/3_512"));
        hashMap.put(getHighSpeedVideoFpsRanges("SHA-512", 64, 16, 131, 60, 6), new org.bouncycastle.pqc.crypto.xmss.DefaultXMSSMTOid(15, "XMSSMT_SHA2_60/6_512"));
        hashMap.put(getHighSpeedVideoFpsRanges("SHA-512", 64, 16, 131, 60, 12), new org.bouncycastle.pqc.crypto.xmss.DefaultXMSSMTOid(16, "XMSSMT_SHA2_60/12_512"));
        hashMap.put(getHighSpeedVideoFpsRanges("SHAKE128", 32, 16, 67, 20, 2), new org.bouncycastle.pqc.crypto.xmss.DefaultXMSSMTOid(17, "XMSSMT_SHAKE_20/2_256"));
        hashMap.put(getHighSpeedVideoFpsRanges("SHAKE128", 32, 16, 67, 20, 4), new org.bouncycastle.pqc.crypto.xmss.DefaultXMSSMTOid(18, "XMSSMT_SHAKE_20/4_256"));
        hashMap.put(getHighSpeedVideoFpsRanges("SHAKE128", 32, 16, 67, 40, 2), new org.bouncycastle.pqc.crypto.xmss.DefaultXMSSMTOid(19, "XMSSMT_SHAKE_40/2_256"));
        hashMap.put(getHighSpeedVideoFpsRanges("SHAKE128", 32, 16, 67, 40, 4), new org.bouncycastle.pqc.crypto.xmss.DefaultXMSSMTOid(20, "XMSSMT_SHAKE_40/4_256"));
        hashMap.put(getHighSpeedVideoFpsRanges("SHAKE128", 32, 16, 67, 40, 8), new org.bouncycastle.pqc.crypto.xmss.DefaultXMSSMTOid(21, "XMSSMT_SHAKE_40/8_256"));
        hashMap.put(getHighSpeedVideoFpsRanges("SHAKE128", 32, 16, 67, 60, 3), new org.bouncycastle.pqc.crypto.xmss.DefaultXMSSMTOid(22, "XMSSMT_SHAKE_60/3_256"));
        hashMap.put(getHighSpeedVideoFpsRanges("SHAKE128", 32, 16, 67, 60, 6), new org.bouncycastle.pqc.crypto.xmss.DefaultXMSSMTOid(23, "XMSSMT_SHAKE_60/6_256"));
        hashMap.put(getHighSpeedVideoFpsRanges("SHAKE128", 32, 16, 67, 60, 12), new org.bouncycastle.pqc.crypto.xmss.DefaultXMSSMTOid(24, "XMSSMT_SHAKE_60/12_256"));
        hashMap.put(getHighSpeedVideoFpsRanges("SHAKE256", 64, 16, 131, 20, 2), new org.bouncycastle.pqc.crypto.xmss.DefaultXMSSMTOid(25, "XMSSMT_SHAKE_20/2_512"));
        hashMap.put(getHighSpeedVideoFpsRanges("SHAKE256", 64, 16, 131, 20, 4), new org.bouncycastle.pqc.crypto.xmss.DefaultXMSSMTOid(26, "XMSSMT_SHAKE_20/4_512"));
        hashMap.put(getHighSpeedVideoFpsRanges("SHAKE256", 64, 16, 131, 40, 2), new org.bouncycastle.pqc.crypto.xmss.DefaultXMSSMTOid(27, "XMSSMT_SHAKE_40/2_512"));
        hashMap.put(getHighSpeedVideoFpsRanges("SHAKE256", 64, 16, 131, 40, 4), new org.bouncycastle.pqc.crypto.xmss.DefaultXMSSMTOid(28, "XMSSMT_SHAKE_40/4_512"));
        hashMap.put(getHighSpeedVideoFpsRanges("SHAKE256", 64, 16, 131, 40, 8), new org.bouncycastle.pqc.crypto.xmss.DefaultXMSSMTOid(29, "XMSSMT_SHAKE_40/8_512"));
        hashMap.put(getHighSpeedVideoFpsRanges("SHAKE256", 64, 16, 131, 60, 3), new org.bouncycastle.pqc.crypto.xmss.DefaultXMSSMTOid(30, "XMSSMT_SHAKE_60/3_512"));
        hashMap.put(getHighSpeedVideoFpsRanges("SHAKE256", 64, 16, 131, 60, 6), new org.bouncycastle.pqc.crypto.xmss.DefaultXMSSMTOid(31, "XMSSMT_SHAKE_60/6_512"));
        hashMap.put(getHighSpeedVideoFpsRanges("SHAKE256", 64, 16, 131, 60, 12), new org.bouncycastle.pqc.crypto.xmss.DefaultXMSSMTOid(32, "XMSSMT_SHAKE_60/12_512"));
        getHighSpeedVideoFpsRangesFor = java.util.Collections.unmodifiableMap(hashMap);
    }
}
