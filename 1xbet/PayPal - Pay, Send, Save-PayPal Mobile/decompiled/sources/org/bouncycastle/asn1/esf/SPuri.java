package org.bouncycastle.asn1.esf;

/* loaded from: classes17.dex */
public class SPuri {
    private org.bouncycastle.asn1.ASN1IA5String getHighSpeedVideoFpsRanges;

    public org.bouncycastle.asn1.ASN1Primitive toASN1Primitive() {
        return this.getHighSpeedVideoFpsRanges.toASN1Primitive();
    }

    public org.bouncycastle.asn1.ASN1IA5String getUriIA5() {
        return this.getHighSpeedVideoFpsRanges;
    }

    public org.bouncycastle.asn1.DERIA5String getUri() {
        org.bouncycastle.asn1.ASN1IA5String aSN1IA5String = this.getHighSpeedVideoFpsRanges;
        return (aSN1IA5String == null || (aSN1IA5String instanceof org.bouncycastle.asn1.DERIA5String)) ? (org.bouncycastle.asn1.DERIA5String) aSN1IA5String : new org.bouncycastle.asn1.DERIA5String(this.getHighSpeedVideoFpsRanges.getString(), false);
    }

    public static org.bouncycastle.asn1.esf.SPuri getInstance(java.lang.Object obj) {
        if (obj instanceof org.bouncycastle.asn1.esf.SPuri) {
            return (org.bouncycastle.asn1.esf.SPuri) obj;
        }
        if (obj instanceof org.bouncycastle.asn1.ASN1IA5String) {
            return new org.bouncycastle.asn1.esf.SPuri(org.bouncycastle.asn1.ASN1IA5String.getInstance(obj));
        }
        return null;
    }

    public SPuri(org.bouncycastle.asn1.ASN1IA5String aSN1IA5String) {
        this.getHighSpeedVideoFpsRanges = aSN1IA5String;
    }
}
