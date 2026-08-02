package org.bouncycastle.asn1.cmc;

/* loaded from: classes17.dex */
public class OtherStatusInfo extends org.bouncycastle.asn1.ASN1Object implements org.bouncycastle.asn1.ASN1Choice {
    private final org.bouncycastle.asn1.cmc.ExtendedFailInfo getHighResolutionOutputSizeshNQ4ISI;
    private final org.bouncycastle.asn1.cmc.CMCFailInfo getHighSpeedVideoFpsRanges;
    private final org.bouncycastle.asn1.cmc.PendInfo getHighSpeedVideoSizes;

    @Override // org.bouncycastle.asn1.ASN1Object, org.bouncycastle.asn1.ASN1Encodable
    public org.bouncycastle.asn1.ASN1Primitive toASN1Primitive() {
        org.bouncycastle.asn1.cmc.PendInfo pendInfo = this.getHighSpeedVideoSizes;
        if (pendInfo != null) {
            return pendInfo.toASN1Primitive();
        }
        org.bouncycastle.asn1.cmc.CMCFailInfo cMCFailInfo = this.getHighSpeedVideoFpsRanges;
        return cMCFailInfo != null ? cMCFailInfo.toASN1Primitive() : this.getHighResolutionOutputSizeshNQ4ISI.toASN1Primitive();
    }

    public boolean isPendingInfo() {
        return this.getHighSpeedVideoSizes != null;
    }

    public boolean isFailInfo() {
        return this.getHighSpeedVideoFpsRanges != null;
    }

    public boolean isExtendedFailInfo() {
        return this.getHighResolutionOutputSizeshNQ4ISI != null;
    }

    public static org.bouncycastle.asn1.cmc.OtherStatusInfo getInstance(java.lang.Object obj) {
        if (obj instanceof org.bouncycastle.asn1.cmc.OtherStatusInfo) {
            return (org.bouncycastle.asn1.cmc.OtherStatusInfo) obj;
        }
        if (obj instanceof org.bouncycastle.asn1.ASN1Encodable) {
            org.bouncycastle.asn1.ASN1Primitive aSN1Primitive = ((org.bouncycastle.asn1.ASN1Encodable) obj).toASN1Primitive();
            if (aSN1Primitive instanceof org.bouncycastle.asn1.ASN1Integer) {
                return new org.bouncycastle.asn1.cmc.OtherStatusInfo(org.bouncycastle.asn1.cmc.CMCFailInfo.getInstance(aSN1Primitive));
            }
            if (aSN1Primitive instanceof org.bouncycastle.asn1.ASN1Sequence) {
                return ((org.bouncycastle.asn1.ASN1Sequence) aSN1Primitive).getObjectAt(0) instanceof org.bouncycastle.asn1.ASN1ObjectIdentifier ? new org.bouncycastle.asn1.cmc.OtherStatusInfo(org.bouncycastle.asn1.cmc.ExtendedFailInfo.getInstance(aSN1Primitive)) : new org.bouncycastle.asn1.cmc.OtherStatusInfo(org.bouncycastle.asn1.cmc.PendInfo.getInstance(aSN1Primitive));
            }
        } else if (obj instanceof byte[]) {
            try {
                return getInstance(org.bouncycastle.asn1.ASN1Primitive.fromByteArray((byte[]) obj));
            } catch (java.io.IOException e) {
                java.lang.StringBuilder sb = new java.lang.StringBuilder("parsing error: ");
                sb.append(e.getMessage());
                throw new java.lang.IllegalArgumentException(sb.toString());
            }
        }
        java.lang.StringBuilder sb2 = new java.lang.StringBuilder("unknown object in getInstance(): ");
        sb2.append(obj.getClass().getName());
        throw new java.lang.IllegalArgumentException(sb2.toString());
    }

    OtherStatusInfo(org.bouncycastle.asn1.cmc.PendInfo pendInfo) {
        this(null, pendInfo, null);
    }

    OtherStatusInfo(org.bouncycastle.asn1.cmc.ExtendedFailInfo extendedFailInfo) {
        this(null, null, extendedFailInfo);
    }

    private OtherStatusInfo(org.bouncycastle.asn1.cmc.CMCFailInfo cMCFailInfo, org.bouncycastle.asn1.cmc.PendInfo pendInfo, org.bouncycastle.asn1.cmc.ExtendedFailInfo extendedFailInfo) {
        this.getHighSpeedVideoFpsRanges = cMCFailInfo;
        this.getHighSpeedVideoSizes = pendInfo;
        this.getHighResolutionOutputSizeshNQ4ISI = extendedFailInfo;
    }

    OtherStatusInfo(org.bouncycastle.asn1.cmc.CMCFailInfo cMCFailInfo) {
        this(cMCFailInfo, null, null);
    }
}
