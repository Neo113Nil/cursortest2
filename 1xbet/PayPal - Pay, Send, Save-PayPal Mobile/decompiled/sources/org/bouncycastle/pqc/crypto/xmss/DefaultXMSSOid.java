package org.bouncycastle.pqc.crypto.xmss;

/* loaded from: classes17.dex */
public final class DefaultXMSSOid implements org.bouncycastle.pqc.crypto.xmss.XMSSOid {
    private static final java.util.Map<java.lang.String, org.bouncycastle.pqc.crypto.xmss.DefaultXMSSOid> getHighSpeedVideoSizes;
    private final int getHighResolutionOutputSizeshNQ4ISI;
    private final java.lang.String getHighSpeedVideoFpsRangesFor;

    @Override // org.bouncycastle.pqc.crypto.xmss.XMSSOid
    public final java.lang.String toString() {
        return this.getHighSpeedVideoFpsRangesFor;
    }

    @Override // org.bouncycastle.pqc.crypto.xmss.XMSSOid
    public final int getOid() {
        return this.getHighResolutionOutputSizeshNQ4ISI;
    }

    public static org.bouncycastle.pqc.crypto.xmss.DefaultXMSSOid lookup(java.lang.String str, int i, int i2, int i3, int i4) {
        if (str != null) {
            return getHighSpeedVideoSizes.get(getHighResolutionOutputSizeshNQ4ISI(str, i, i2, i3, i4));
        }
        throw new java.lang.NullPointerException("algorithmName == null");
    }

    private static java.lang.String getHighResolutionOutputSizeshNQ4ISI(java.lang.String str, int i, int i2, int i3, int i4) {
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
        return sb.toString();
    }

    private DefaultXMSSOid(int i, java.lang.String str) {
        this.getHighResolutionOutputSizeshNQ4ISI = i;
        this.getHighSpeedVideoFpsRangesFor = str;
    }

    static {
        java.util.HashMap hashMap = new java.util.HashMap();
        hashMap.put(getHighResolutionOutputSizeshNQ4ISI("SHA-256", 32, 16, 67, 10), new org.bouncycastle.pqc.crypto.xmss.DefaultXMSSOid(1, "XMSS_SHA2_10_256"));
        hashMap.put(getHighResolutionOutputSizeshNQ4ISI("SHA-256", 32, 16, 67, 16), new org.bouncycastle.pqc.crypto.xmss.DefaultXMSSOid(2, "XMSS_SHA2_16_256"));
        hashMap.put(getHighResolutionOutputSizeshNQ4ISI("SHA-256", 32, 16, 67, 20), new org.bouncycastle.pqc.crypto.xmss.DefaultXMSSOid(3, "XMSS_SHA2_20_256"));
        hashMap.put(getHighResolutionOutputSizeshNQ4ISI("SHA-512", 64, 16, 131, 10), new org.bouncycastle.pqc.crypto.xmss.DefaultXMSSOid(4, "XMSS_SHA2_10_512"));
        hashMap.put(getHighResolutionOutputSizeshNQ4ISI("SHA-512", 64, 16, 131, 16), new org.bouncycastle.pqc.crypto.xmss.DefaultXMSSOid(5, "XMSS_SHA2_16_512"));
        hashMap.put(getHighResolutionOutputSizeshNQ4ISI("SHA-512", 64, 16, 131, 20), new org.bouncycastle.pqc.crypto.xmss.DefaultXMSSOid(6, "XMSS_SHA2_20_512"));
        hashMap.put(getHighResolutionOutputSizeshNQ4ISI("SHAKE128", 32, 16, 67, 10), new org.bouncycastle.pqc.crypto.xmss.DefaultXMSSOid(7, "XMSS_SHAKE_10_256"));
        hashMap.put(getHighResolutionOutputSizeshNQ4ISI("SHAKE128", 32, 16, 67, 16), new org.bouncycastle.pqc.crypto.xmss.DefaultXMSSOid(8, "XMSS_SHAKE_16_256"));
        hashMap.put(getHighResolutionOutputSizeshNQ4ISI("SHAKE128", 32, 16, 67, 20), new org.bouncycastle.pqc.crypto.xmss.DefaultXMSSOid(9, "XMSS_SHAKE_20_256"));
        hashMap.put(getHighResolutionOutputSizeshNQ4ISI("SHAKE256", 64, 16, 131, 10), new org.bouncycastle.pqc.crypto.xmss.DefaultXMSSOid(10, "XMSS_SHAKE_10_512"));
        hashMap.put(getHighResolutionOutputSizeshNQ4ISI("SHAKE256", 64, 16, 131, 16), new org.bouncycastle.pqc.crypto.xmss.DefaultXMSSOid(11, "XMSS_SHAKE_16_512"));
        hashMap.put(getHighResolutionOutputSizeshNQ4ISI("SHAKE256", 64, 16, 131, 20), new org.bouncycastle.pqc.crypto.xmss.DefaultXMSSOid(12, "XMSS_SHAKE_20_512"));
        getHighSpeedVideoSizes = java.util.Collections.unmodifiableMap(hashMap);
    }
}
