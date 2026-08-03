package com.facebook.ads.redexgen.core;

/* renamed from: com.facebook.ads.redexgen.X.gC, reason: case insensitive filesystem */
/* loaded from: assets/audience_network/classes2.dex */
public abstract class AbstractC1604gC {
    public static byte[] A00;

    static {
        A02();
    }

    public static java.lang.String A00(int i, int i2, int i3) {
        byte[] copyOfRange = java.util.Arrays.copyOfRange(A00, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            copyOfRange[i4] = (byte) ((copyOfRange[i4] ^ i3) ^ 106);
        }
        return new java.lang.String(copyOfRange);
    }

    public static void A02() {
        A00 = new byte[]{42, 49, 56, 84, 72, 47, com.google.common.base.Ascii.DC4, com.google.common.base.Ascii.ESC, com.google.common.base.Ascii.CAN, com.google.common.base.Ascii.SYN, com.google.common.base.Ascii.US, 90, com.google.common.base.Ascii.SO, com.google.common.base.Ascii.NAK, 90, com.google.common.base.Ascii.FS, 19, com.google.common.base.Ascii.DC4, com.google.common.base.Ascii.RS, 90, com.google.common.base.Ascii.FF, com.google.common.base.Ascii.ESC, com.google.common.base.Ascii.SYN, 19, com.google.common.base.Ascii.RS, 90, com.google.common.base.Ascii.EM, com.google.common.base.Ascii.US, 8, com.google.common.base.Ascii.SO, 19, com.google.common.base.Ascii.FS, 19, com.google.common.base.Ascii.EM, com.google.common.base.Ascii.ESC, com.google.common.base.Ascii.SO, com.google.common.base.Ascii.US, 90, com.google.common.base.Ascii.NAK, 8, 90, 10, com.google.common.base.Ascii.SI, com.google.common.base.Ascii.CAN, com.google.common.base.Ascii.SYN, 19, com.google.common.base.Ascii.EM, 90, 17, com.google.common.base.Ascii.US, 3, 84};
    }

    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException: Index 10 out of bounds for length 9
    	at jadx.plugins.input.dex.sections.debuginfo.DebugInfoParser.startVar(DebugInfoParser.java:203)
    	at jadx.plugins.input.dex.sections.debuginfo.DebugInfoParser.process(DebugInfoParser.java:135)
    	at jadx.plugins.input.dex.sections.DexCodeReader.getDebugInfo(DexCodeReader.java:122)
    	at jadx.core.dex.nodes.MethodNode.getDebugInfo(MethodNode.java:636)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.visit(DebugInfoAttachVisitor.java:38)
     */
    public static void A03(@javax.annotation.Nullable javax.net.ssl.HttpsURLConnection httpsURLConnection, @javax.annotation.Nullable java.util.Set<java.lang.String> set, java.util.Set<java.lang.String> set2) throws java.lang.Exception {
        java.lang.String A002 = A00(0, 5, 19);
        try {
            for (java.security.cert.Certificate certificate : httpsURLConnection.getServerCertificates()) {
                java.security.cert.X509Certificate x509Certificate = (java.security.cert.X509Certificate) certificate;
                java.lang.String A01 = A01(x509Certificate.getEncoded(), A002);
                if (set != null && set.contains(A01)) {
                    return;
                }
                java.lang.String A012 = A01(x509Certificate.getPublicKey().getEncoded(), A002);
                if (set2 != null && set2.contains(A012)) {
                    return;
                }
            }
            throw new java.security.cert.CertificateException(A00(5, 47, 16));
        } catch (java.lang.Exception e) {
            throw e;
        }
    }

    public static java.lang.String A01(byte[] bArr, java.lang.String str) throws java.security.NoSuchAlgorithmException {
        java.security.MessageDigest digest = java.security.MessageDigest.getInstance(str);
        digest.reset();
        return android.util.Base64.encodeToString(digest.digest(bArr), 0);
    }
}
