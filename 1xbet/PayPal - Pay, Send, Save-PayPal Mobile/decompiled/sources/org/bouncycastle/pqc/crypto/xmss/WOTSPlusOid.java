package org.bouncycastle.pqc.crypto.xmss;

/* loaded from: classes17.dex */
final class WOTSPlusOid implements org.bouncycastle.pqc.crypto.xmss.XMSSOid {
    private static final java.util.Map<java.lang.String, org.bouncycastle.pqc.crypto.xmss.WOTSPlusOid> getHighSpeedVideoFpsRangesFor;
    private final int Camera2StreamConfigurationMap;
    private final java.lang.String getHighSpeedVideoSizes;

    @Override // org.bouncycastle.pqc.crypto.xmss.XMSSOid
    public final java.lang.String toString() {
        return this.getHighSpeedVideoSizes;
    }

    @Override // org.bouncycastle.pqc.crypto.xmss.XMSSOid
    public final int getOid() {
        return this.Camera2StreamConfigurationMap;
    }

    protected static org.bouncycastle.pqc.crypto.xmss.WOTSPlusOid getHighSpeedVideoFpsRangesFor(java.lang.String str, int i, int i2) {
        if (str != null) {
            return getHighSpeedVideoFpsRangesFor.get(getHighResolutionOutputSizeshNQ4ISI(str, i, 16, i2));
        }
        throw new java.lang.NullPointerException("algorithmName == null");
    }

    private static java.lang.String getHighResolutionOutputSizeshNQ4ISI(java.lang.String str, int i, int i2, int i3) {
        if (str == null) {
            throw new java.lang.NullPointerException("algorithmName == null");
        }
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append(str);
        sb.append("-");
        sb.append(i);
        sb.append("-16");
        sb.append("-");
        sb.append(i3);
        return sb.toString();
    }

    private WOTSPlusOid(int i, java.lang.String str) {
        this.Camera2StreamConfigurationMap = i;
        this.getHighSpeedVideoSizes = str;
    }

    static {
        java.util.HashMap hashMap = new java.util.HashMap();
        hashMap.put(getHighResolutionOutputSizeshNQ4ISI("SHA-256", 32, 16, 67), new org.bouncycastle.pqc.crypto.xmss.WOTSPlusOid(16777217, "WOTSP_SHA2-256_W16"));
        hashMap.put(getHighResolutionOutputSizeshNQ4ISI("SHA-512", 64, 16, 131), new org.bouncycastle.pqc.crypto.xmss.WOTSPlusOid(33554434, "WOTSP_SHA2-512_W16"));
        hashMap.put(getHighResolutionOutputSizeshNQ4ISI("SHAKE128", 32, 16, 67), new org.bouncycastle.pqc.crypto.xmss.WOTSPlusOid(50331651, "WOTSP_SHAKE128_W16"));
        hashMap.put(getHighResolutionOutputSizeshNQ4ISI("SHAKE256", 64, 16, 131), new org.bouncycastle.pqc.crypto.xmss.WOTSPlusOid(67108868, "WOTSP_SHAKE256_W16"));
        getHighSpeedVideoFpsRangesFor = java.util.Collections.unmodifiableMap(hashMap);
    }
}
