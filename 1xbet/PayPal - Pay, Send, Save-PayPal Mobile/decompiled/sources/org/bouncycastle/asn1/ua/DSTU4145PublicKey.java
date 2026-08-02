package org.bouncycastle.asn1.ua;

/* loaded from: classes17.dex */
public class DSTU4145PublicKey extends org.bouncycastle.asn1.ASN1Object {
    private org.bouncycastle.asn1.ASN1OctetString getHighSpeedVideoFpsRanges;

    @Override // org.bouncycastle.asn1.ASN1Object, org.bouncycastle.asn1.ASN1Encodable
    public org.bouncycastle.asn1.ASN1Primitive toASN1Primitive() {
        return this.getHighSpeedVideoFpsRanges;
    }

    public static org.bouncycastle.asn1.ua.DSTU4145PublicKey getInstance(java.lang.Object obj) {
        if (obj instanceof org.bouncycastle.asn1.ua.DSTU4145PublicKey) {
            return (org.bouncycastle.asn1.ua.DSTU4145PublicKey) obj;
        }
        if (obj != null) {
            return new org.bouncycastle.asn1.ua.DSTU4145PublicKey(org.bouncycastle.asn1.ASN1OctetString.getInstance(obj));
        }
        return null;
    }

    public DSTU4145PublicKey(org.bouncycastle.math.ec.ECPoint eCPoint) {
        this.getHighSpeedVideoFpsRanges = new org.bouncycastle.asn1.DEROctetString(org.bouncycastle.asn1.ua.DSTU4145PointEncoder.encodePoint(eCPoint));
    }

    private DSTU4145PublicKey(org.bouncycastle.asn1.ASN1OctetString aSN1OctetString) {
        this.getHighSpeedVideoFpsRanges = aSN1OctetString;
    }
}
