package org.bouncycastle.mime.smime;

/* loaded from: classes17.dex */
class SMimeUtils {
    private static final java.util.Map Camera2StreamConfigurationMap;
    private static final java.util.Map getHighResolutionOutputSizeshNQ4ISI;
    private static final java.util.Map getHighSpeedVideoFpsRanges;
    private static final java.util.Map getHighSpeedVideoFpsRangesFor;
    private static final byte[] getHighSpeedVideoSizes = {13, 10};

    static java.lang.String getHighResolutionOutputSizeshNQ4ISI(java.lang.String str) {
        return (str == null || str.length() <= 1 || str.charAt(0) != '\"' || str.charAt(str.length() - 1) != '\"') ? str : str.substring(1, str.length() - 1);
    }

    static org.bouncycastle.asn1.ASN1ObjectIdentifier getHighSpeedVideoFpsRanges(java.lang.String str) {
        org.bouncycastle.asn1.ASN1ObjectIdentifier aSN1ObjectIdentifier = (org.bouncycastle.asn1.ASN1ObjectIdentifier) Camera2StreamConfigurationMap.get(org.bouncycastle.util.Strings.toLowerCase(str));
        if (aSN1ObjectIdentifier != null) {
            return aSN1ObjectIdentifier;
        }
        throw new java.lang.IllegalArgumentException("unknown micalg passed: ".concat(java.lang.String.valueOf(str)));
    }

    static java.io.OutputStream getHighSpeedVideoFpsRanges(java.io.OutputStream outputStream) {
        return new java.io.FilterOutputStream(outputStream) { // from class: org.bouncycastle.mime.smime.SMimeUtils.1
            @Override // java.io.FilterOutputStream, java.io.OutputStream, java.io.Closeable, java.lang.AutoCloseable
            public final void close() throws java.io.IOException {
            }

            @Override // java.io.FilterOutputStream, java.io.OutputStream
            public final void write(byte[] bArr, int i, int i2) throws java.io.IOException {
                int i3 = i2 + i;
                if (((bArr.length - i3) | i | i2 | i3) < 0) {
                    throw new java.lang.IndexOutOfBoundsException();
                }
                this.out.write(bArr, i, i2);
            }
        };
    }

    static java.io.OutputStream getHighResolutionOutputSizeshNQ4ISI(java.io.OutputStream outputStream) {
        return outputStream instanceof java.io.FileOutputStream ? new java.io.BufferedOutputStream(outputStream) : outputStream;
    }

    static java.io.InputStream getHighResolutionOutputSizeshNQ4ISI(java.io.InputStream inputStream) {
        return inputStream instanceof java.io.FileInputStream ? new java.io.BufferedInputStream(inputStream) : inputStream;
    }

    SMimeUtils() {
    }

    static {
        java.util.HashMap hashMap = new java.util.HashMap();
        hashMap.put(org.bouncycastle.cms.CMSAlgorithm.MD5, "md5");
        hashMap.put(org.bouncycastle.cms.CMSAlgorithm.SHA1, "sha-1");
        hashMap.put(org.bouncycastle.cms.CMSAlgorithm.SHA224, "sha-224");
        hashMap.put(org.bouncycastle.cms.CMSAlgorithm.SHA256, "sha-256");
        hashMap.put(org.bouncycastle.cms.CMSAlgorithm.SHA384, "sha-384");
        hashMap.put(org.bouncycastle.cms.CMSAlgorithm.SHA512, "sha-512");
        hashMap.put(org.bouncycastle.cms.CMSAlgorithm.GOST3411, "gostr3411-94");
        hashMap.put(org.bouncycastle.cms.CMSAlgorithm.GOST3411_2012_256, "gostr3411-2012-256");
        hashMap.put(org.bouncycastle.cms.CMSAlgorithm.GOST3411_2012_512, "gostr3411-2012-512");
        java.util.Map unmodifiableMap = java.util.Collections.unmodifiableMap(hashMap);
        getHighResolutionOutputSizeshNQ4ISI = unmodifiableMap;
        java.util.HashMap hashMap2 = new java.util.HashMap();
        hashMap2.put(org.bouncycastle.cms.CMSAlgorithm.MD5, "md5");
        hashMap2.put(org.bouncycastle.cms.CMSAlgorithm.SHA1, "sha1");
        hashMap2.put(org.bouncycastle.cms.CMSAlgorithm.SHA224, "sha224");
        hashMap2.put(org.bouncycastle.cms.CMSAlgorithm.SHA256, "sha256");
        hashMap2.put(org.bouncycastle.cms.CMSAlgorithm.SHA384, "sha384");
        hashMap2.put(org.bouncycastle.cms.CMSAlgorithm.SHA512, "sha512");
        hashMap2.put(org.bouncycastle.cms.CMSAlgorithm.GOST3411, "gostr3411-94");
        hashMap2.put(org.bouncycastle.cms.CMSAlgorithm.GOST3411_2012_256, "gostr3411-2012-256");
        hashMap2.put(org.bouncycastle.cms.CMSAlgorithm.GOST3411_2012_512, "gostr3411-2012-512");
        getHighSpeedVideoFpsRangesFor = java.util.Collections.unmodifiableMap(hashMap2);
        getHighSpeedVideoFpsRanges = unmodifiableMap;
        java.util.TreeMap treeMap = new java.util.TreeMap(java.lang.String.CASE_INSENSITIVE_ORDER);
        for (java.lang.Object obj : unmodifiableMap.keySet()) {
            treeMap.put(getHighSpeedVideoFpsRanges.get(obj).toString(), (org.bouncycastle.asn1.ASN1ObjectIdentifier) obj);
        }
        for (java.lang.Object obj2 : getHighSpeedVideoFpsRangesFor.keySet()) {
            treeMap.put(getHighSpeedVideoFpsRangesFor.get(obj2).toString(), (org.bouncycastle.asn1.ASN1ObjectIdentifier) obj2);
        }
        Camera2StreamConfigurationMap = java.util.Collections.unmodifiableMap(treeMap);
    }
}
