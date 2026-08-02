package org.bouncycastle.asn1.cmc;

/* loaded from: classes17.dex */
public class CMCFailInfo extends org.bouncycastle.asn1.ASN1Object {
    private static java.util.Map Camera2StreamConfigurationMap;
    public static final org.bouncycastle.asn1.cmc.CMCFailInfo authDataFail;
    public static final org.bouncycastle.asn1.cmc.CMCFailInfo badAlg;
    public static final org.bouncycastle.asn1.cmc.CMCFailInfo badCertId;
    public static final org.bouncycastle.asn1.cmc.CMCFailInfo badIdentity;
    public static final org.bouncycastle.asn1.cmc.CMCFailInfo badMessageCheck;
    public static final org.bouncycastle.asn1.cmc.CMCFailInfo badRequest;
    public static final org.bouncycastle.asn1.cmc.CMCFailInfo badTime;
    public static final org.bouncycastle.asn1.cmc.CMCFailInfo internalCAError;
    public static final org.bouncycastle.asn1.cmc.CMCFailInfo mustArchiveKeys;
    public static final org.bouncycastle.asn1.cmc.CMCFailInfo noKeyReuse;
    public static final org.bouncycastle.asn1.cmc.CMCFailInfo popFailed;
    public static final org.bouncycastle.asn1.cmc.CMCFailInfo popRequired;
    public static final org.bouncycastle.asn1.cmc.CMCFailInfo tryLater;
    public static final org.bouncycastle.asn1.cmc.CMCFailInfo unsupportedExt;
    private final org.bouncycastle.asn1.ASN1Integer getHighSpeedVideoFpsRanges;

    @Override // org.bouncycastle.asn1.ASN1Object, org.bouncycastle.asn1.ASN1Encodable
    public org.bouncycastle.asn1.ASN1Primitive toASN1Primitive() {
        return this.getHighSpeedVideoFpsRanges;
    }

    public static org.bouncycastle.asn1.cmc.CMCFailInfo getInstance(java.lang.Object obj) {
        if (obj instanceof org.bouncycastle.asn1.cmc.CMCFailInfo) {
            return (org.bouncycastle.asn1.cmc.CMCFailInfo) obj;
        }
        if (obj == null) {
            return null;
        }
        org.bouncycastle.asn1.cmc.CMCFailInfo cMCFailInfo = (org.bouncycastle.asn1.cmc.CMCFailInfo) Camera2StreamConfigurationMap.get(org.bouncycastle.asn1.ASN1Integer.getInstance(obj));
        if (cMCFailInfo != null) {
            return cMCFailInfo;
        }
        java.lang.StringBuilder sb = new java.lang.StringBuilder("unknown object in getInstance(): ");
        sb.append(obj.getClass().getName());
        throw new java.lang.IllegalArgumentException(sb.toString());
    }

    private CMCFailInfo(org.bouncycastle.asn1.ASN1Integer aSN1Integer) {
        this.getHighSpeedVideoFpsRanges = aSN1Integer;
    }

    static {
        org.bouncycastle.asn1.cmc.CMCFailInfo cMCFailInfo = new org.bouncycastle.asn1.cmc.CMCFailInfo(new org.bouncycastle.asn1.ASN1Integer(0L));
        badAlg = cMCFailInfo;
        org.bouncycastle.asn1.cmc.CMCFailInfo cMCFailInfo2 = new org.bouncycastle.asn1.cmc.CMCFailInfo(new org.bouncycastle.asn1.ASN1Integer(1L));
        badMessageCheck = cMCFailInfo2;
        org.bouncycastle.asn1.cmc.CMCFailInfo cMCFailInfo3 = new org.bouncycastle.asn1.cmc.CMCFailInfo(new org.bouncycastle.asn1.ASN1Integer(2L));
        badRequest = cMCFailInfo3;
        org.bouncycastle.asn1.cmc.CMCFailInfo cMCFailInfo4 = new org.bouncycastle.asn1.cmc.CMCFailInfo(new org.bouncycastle.asn1.ASN1Integer(3L));
        badTime = cMCFailInfo4;
        org.bouncycastle.asn1.cmc.CMCFailInfo cMCFailInfo5 = new org.bouncycastle.asn1.cmc.CMCFailInfo(new org.bouncycastle.asn1.ASN1Integer(4L));
        badCertId = cMCFailInfo5;
        org.bouncycastle.asn1.cmc.CMCFailInfo cMCFailInfo6 = new org.bouncycastle.asn1.cmc.CMCFailInfo(new org.bouncycastle.asn1.ASN1Integer(5L));
        unsupportedExt = cMCFailInfo6;
        org.bouncycastle.asn1.cmc.CMCFailInfo cMCFailInfo7 = new org.bouncycastle.asn1.cmc.CMCFailInfo(new org.bouncycastle.asn1.ASN1Integer(6L));
        mustArchiveKeys = cMCFailInfo7;
        org.bouncycastle.asn1.cmc.CMCFailInfo cMCFailInfo8 = new org.bouncycastle.asn1.cmc.CMCFailInfo(new org.bouncycastle.asn1.ASN1Integer(7L));
        badIdentity = cMCFailInfo8;
        org.bouncycastle.asn1.cmc.CMCFailInfo cMCFailInfo9 = new org.bouncycastle.asn1.cmc.CMCFailInfo(new org.bouncycastle.asn1.ASN1Integer(8L));
        popRequired = cMCFailInfo9;
        org.bouncycastle.asn1.cmc.CMCFailInfo cMCFailInfo10 = new org.bouncycastle.asn1.cmc.CMCFailInfo(new org.bouncycastle.asn1.ASN1Integer(9L));
        popFailed = cMCFailInfo10;
        org.bouncycastle.asn1.cmc.CMCFailInfo cMCFailInfo11 = new org.bouncycastle.asn1.cmc.CMCFailInfo(new org.bouncycastle.asn1.ASN1Integer(10L));
        noKeyReuse = cMCFailInfo11;
        org.bouncycastle.asn1.cmc.CMCFailInfo cMCFailInfo12 = new org.bouncycastle.asn1.cmc.CMCFailInfo(new org.bouncycastle.asn1.ASN1Integer(11L));
        internalCAError = cMCFailInfo12;
        org.bouncycastle.asn1.cmc.CMCFailInfo cMCFailInfo13 = new org.bouncycastle.asn1.cmc.CMCFailInfo(new org.bouncycastle.asn1.ASN1Integer(12L));
        tryLater = cMCFailInfo13;
        org.bouncycastle.asn1.cmc.CMCFailInfo cMCFailInfo14 = new org.bouncycastle.asn1.cmc.CMCFailInfo(new org.bouncycastle.asn1.ASN1Integer(13L));
        authDataFail = cMCFailInfo14;
        java.util.HashMap hashMap = new java.util.HashMap();
        Camera2StreamConfigurationMap = hashMap;
        hashMap.put(cMCFailInfo.getHighSpeedVideoFpsRanges, cMCFailInfo);
        Camera2StreamConfigurationMap.put(cMCFailInfo2.getHighSpeedVideoFpsRanges, cMCFailInfo2);
        Camera2StreamConfigurationMap.put(cMCFailInfo3.getHighSpeedVideoFpsRanges, cMCFailInfo3);
        Camera2StreamConfigurationMap.put(cMCFailInfo4.getHighSpeedVideoFpsRanges, cMCFailInfo4);
        Camera2StreamConfigurationMap.put(cMCFailInfo5.getHighSpeedVideoFpsRanges, cMCFailInfo5);
        Camera2StreamConfigurationMap.put(cMCFailInfo9.getHighSpeedVideoFpsRanges, cMCFailInfo9);
        Camera2StreamConfigurationMap.put(cMCFailInfo6.getHighSpeedVideoFpsRanges, cMCFailInfo6);
        Camera2StreamConfigurationMap.put(cMCFailInfo7.getHighSpeedVideoFpsRanges, cMCFailInfo7);
        Camera2StreamConfigurationMap.put(cMCFailInfo8.getHighSpeedVideoFpsRanges, cMCFailInfo8);
        Camera2StreamConfigurationMap.put(cMCFailInfo9.getHighSpeedVideoFpsRanges, cMCFailInfo9);
        Camera2StreamConfigurationMap.put(cMCFailInfo10.getHighSpeedVideoFpsRanges, cMCFailInfo10);
        Camera2StreamConfigurationMap.put(cMCFailInfo5.getHighSpeedVideoFpsRanges, cMCFailInfo5);
        Camera2StreamConfigurationMap.put(cMCFailInfo9.getHighSpeedVideoFpsRanges, cMCFailInfo9);
        Camera2StreamConfigurationMap.put(cMCFailInfo11.getHighSpeedVideoFpsRanges, cMCFailInfo11);
        Camera2StreamConfigurationMap.put(cMCFailInfo12.getHighSpeedVideoFpsRanges, cMCFailInfo12);
        Camera2StreamConfigurationMap.put(cMCFailInfo13.getHighSpeedVideoFpsRanges, cMCFailInfo13);
        Camera2StreamConfigurationMap.put(cMCFailInfo14.getHighSpeedVideoFpsRanges, cMCFailInfo14);
    }
}
