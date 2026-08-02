package org.bouncycastle.asn1.cmp;

/* loaded from: classes17.dex */
public class PKIConfirmContent extends org.bouncycastle.asn1.ASN1Object {
    private org.bouncycastle.asn1.ASN1Null getHighSpeedVideoFpsRangesFor;

    @Override // org.bouncycastle.asn1.ASN1Object, org.bouncycastle.asn1.ASN1Encodable
    public org.bouncycastle.asn1.ASN1Primitive toASN1Primitive() {
        return this.getHighSpeedVideoFpsRangesFor;
    }

    public static org.bouncycastle.asn1.cmp.PKIConfirmContent getInstance(java.lang.Object obj) {
        if (obj == null || (obj instanceof org.bouncycastle.asn1.cmp.PKIConfirmContent)) {
            return (org.bouncycastle.asn1.cmp.PKIConfirmContent) obj;
        }
        if (obj instanceof org.bouncycastle.asn1.ASN1Null) {
            return new org.bouncycastle.asn1.cmp.PKIConfirmContent((org.bouncycastle.asn1.ASN1Null) obj);
        }
        java.lang.StringBuilder sb = new java.lang.StringBuilder("Invalid object: ");
        sb.append(obj.getClass().getName());
        throw new java.lang.IllegalArgumentException(sb.toString());
    }

    private PKIConfirmContent(org.bouncycastle.asn1.ASN1Null aSN1Null) {
        this.getHighSpeedVideoFpsRangesFor = aSN1Null;
    }

    public PKIConfirmContent() {
        this.getHighSpeedVideoFpsRangesFor = org.bouncycastle.asn1.DERNull.INSTANCE;
    }
}
