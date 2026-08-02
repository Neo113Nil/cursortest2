package org.bouncycastle.asn1.ocsp;

/* loaded from: classes17.dex */
public class CertStatus extends org.bouncycastle.asn1.ASN1Object implements org.bouncycastle.asn1.ASN1Choice {
    private org.bouncycastle.asn1.ASN1Encodable getHighResolutionOutputSizeshNQ4ISI;
    private int getHighSpeedVideoFpsRanges;

    @Override // org.bouncycastle.asn1.ASN1Object, org.bouncycastle.asn1.ASN1Encodable
    public org.bouncycastle.asn1.ASN1Primitive toASN1Primitive() {
        return new org.bouncycastle.asn1.DERTaggedObject(false, this.getHighSpeedVideoFpsRanges, this.getHighResolutionOutputSizeshNQ4ISI);
    }

    public int getTagNo() {
        return this.getHighSpeedVideoFpsRanges;
    }

    public org.bouncycastle.asn1.ASN1Encodable getStatus() {
        return this.getHighResolutionOutputSizeshNQ4ISI;
    }

    public static org.bouncycastle.asn1.ocsp.CertStatus getInstance(org.bouncycastle.asn1.ASN1TaggedObject aSN1TaggedObject, boolean z) {
        return getInstance(aSN1TaggedObject.getObject());
    }

    public static org.bouncycastle.asn1.ocsp.CertStatus getInstance(java.lang.Object obj) {
        if (obj == null || (obj instanceof org.bouncycastle.asn1.ocsp.CertStatus)) {
            return (org.bouncycastle.asn1.ocsp.CertStatus) obj;
        }
        if (obj instanceof org.bouncycastle.asn1.ASN1TaggedObject) {
            return new org.bouncycastle.asn1.ocsp.CertStatus((org.bouncycastle.asn1.ASN1TaggedObject) obj);
        }
        java.lang.StringBuilder sb = new java.lang.StringBuilder("unknown object in factory: ");
        sb.append(obj.getClass().getName());
        throw new java.lang.IllegalArgumentException(sb.toString());
    }

    public CertStatus(org.bouncycastle.asn1.ocsp.RevokedInfo revokedInfo) {
        this.getHighSpeedVideoFpsRanges = 1;
        this.getHighResolutionOutputSizeshNQ4ISI = revokedInfo;
    }

    private CertStatus(org.bouncycastle.asn1.ASN1TaggedObject aSN1TaggedObject) {
        org.bouncycastle.asn1.ASN1Encodable aSN1Null;
        int tagNo = aSN1TaggedObject.getTagNo();
        if (tagNo != 0) {
            if (tagNo == 1) {
                aSN1Null = org.bouncycastle.asn1.ocsp.RevokedInfo.getInstance(aSN1TaggedObject, false);
                this.getHighResolutionOutputSizeshNQ4ISI = aSN1Null;
                this.getHighSpeedVideoFpsRanges = tagNo;
            } else if (tagNo != 2) {
                java.lang.StringBuilder sb = new java.lang.StringBuilder("Unknown tag encountered: ");
                sb.append(org.bouncycastle.asn1.ASN1Util.getTagText(aSN1TaggedObject));
                throw new java.lang.IllegalArgumentException(sb.toString());
            }
        }
        aSN1Null = org.bouncycastle.asn1.ASN1Null.getInstance(aSN1TaggedObject, false);
        this.getHighResolutionOutputSizeshNQ4ISI = aSN1Null;
        this.getHighSpeedVideoFpsRanges = tagNo;
    }

    public CertStatus(int i, org.bouncycastle.asn1.ASN1Encodable aSN1Encodable) {
        this.getHighSpeedVideoFpsRanges = i;
        this.getHighResolutionOutputSizeshNQ4ISI = aSN1Encodable;
    }

    public CertStatus() {
        this.getHighSpeedVideoFpsRanges = 0;
        this.getHighResolutionOutputSizeshNQ4ISI = org.bouncycastle.asn1.DERNull.INSTANCE;
    }
}
