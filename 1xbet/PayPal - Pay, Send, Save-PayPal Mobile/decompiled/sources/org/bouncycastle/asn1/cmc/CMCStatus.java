package org.bouncycastle.asn1.cmc;

/* loaded from: classes17.dex */
public class CMCStatus extends org.bouncycastle.asn1.ASN1Object {
    public static final org.bouncycastle.asn1.cmc.CMCStatus confirmRequired;
    public static final org.bouncycastle.asn1.cmc.CMCStatus failed;
    private static java.util.Map getHighSpeedVideoFpsRangesFor;
    public static final org.bouncycastle.asn1.cmc.CMCStatus noSupport;
    public static final org.bouncycastle.asn1.cmc.CMCStatus partial;
    public static final org.bouncycastle.asn1.cmc.CMCStatus pending;
    public static final org.bouncycastle.asn1.cmc.CMCStatus popRequired;
    public static final org.bouncycastle.asn1.cmc.CMCStatus success;
    private final org.bouncycastle.asn1.ASN1Integer getHighSpeedVideoSizes;

    @Override // org.bouncycastle.asn1.ASN1Object, org.bouncycastle.asn1.ASN1Encodable
    public org.bouncycastle.asn1.ASN1Primitive toASN1Primitive() {
        return this.getHighSpeedVideoSizes;
    }

    public static org.bouncycastle.asn1.cmc.CMCStatus getInstance(java.lang.Object obj) {
        if (obj instanceof org.bouncycastle.asn1.cmc.CMCStatus) {
            return (org.bouncycastle.asn1.cmc.CMCStatus) obj;
        }
        if (obj == null) {
            return null;
        }
        org.bouncycastle.asn1.cmc.CMCStatus cMCStatus = (org.bouncycastle.asn1.cmc.CMCStatus) getHighSpeedVideoFpsRangesFor.get(org.bouncycastle.asn1.ASN1Integer.getInstance(obj));
        if (cMCStatus != null) {
            return cMCStatus;
        }
        java.lang.StringBuilder sb = new java.lang.StringBuilder("unknown object in getInstance(): ");
        sb.append(obj.getClass().getName());
        throw new java.lang.IllegalArgumentException(sb.toString());
    }

    private CMCStatus(org.bouncycastle.asn1.ASN1Integer aSN1Integer) {
        this.getHighSpeedVideoSizes = aSN1Integer;
    }

    static {
        org.bouncycastle.asn1.cmc.CMCStatus cMCStatus = new org.bouncycastle.asn1.cmc.CMCStatus(new org.bouncycastle.asn1.ASN1Integer(0L));
        success = cMCStatus;
        org.bouncycastle.asn1.cmc.CMCStatus cMCStatus2 = new org.bouncycastle.asn1.cmc.CMCStatus(new org.bouncycastle.asn1.ASN1Integer(2L));
        failed = cMCStatus2;
        org.bouncycastle.asn1.cmc.CMCStatus cMCStatus3 = new org.bouncycastle.asn1.cmc.CMCStatus(new org.bouncycastle.asn1.ASN1Integer(3L));
        pending = cMCStatus3;
        org.bouncycastle.asn1.cmc.CMCStatus cMCStatus4 = new org.bouncycastle.asn1.cmc.CMCStatus(new org.bouncycastle.asn1.ASN1Integer(4L));
        noSupport = cMCStatus4;
        org.bouncycastle.asn1.cmc.CMCStatus cMCStatus5 = new org.bouncycastle.asn1.cmc.CMCStatus(new org.bouncycastle.asn1.ASN1Integer(5L));
        confirmRequired = cMCStatus5;
        org.bouncycastle.asn1.cmc.CMCStatus cMCStatus6 = new org.bouncycastle.asn1.cmc.CMCStatus(new org.bouncycastle.asn1.ASN1Integer(6L));
        popRequired = cMCStatus6;
        org.bouncycastle.asn1.cmc.CMCStatus cMCStatus7 = new org.bouncycastle.asn1.cmc.CMCStatus(new org.bouncycastle.asn1.ASN1Integer(7L));
        partial = cMCStatus7;
        java.util.HashMap hashMap = new java.util.HashMap();
        getHighSpeedVideoFpsRangesFor = hashMap;
        hashMap.put(cMCStatus.getHighSpeedVideoSizes, cMCStatus);
        getHighSpeedVideoFpsRangesFor.put(cMCStatus2.getHighSpeedVideoSizes, cMCStatus2);
        getHighSpeedVideoFpsRangesFor.put(cMCStatus3.getHighSpeedVideoSizes, cMCStatus3);
        getHighSpeedVideoFpsRangesFor.put(cMCStatus4.getHighSpeedVideoSizes, cMCStatus4);
        getHighSpeedVideoFpsRangesFor.put(cMCStatus5.getHighSpeedVideoSizes, cMCStatus5);
        getHighSpeedVideoFpsRangesFor.put(cMCStatus6.getHighSpeedVideoSizes, cMCStatus6);
        getHighSpeedVideoFpsRangesFor.put(cMCStatus7.getHighSpeedVideoSizes, cMCStatus7);
    }
}
