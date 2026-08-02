package org.bouncycastle.asn1.esf;

/* loaded from: classes17.dex */
public class CrlListID extends org.bouncycastle.asn1.ASN1Object {
    private org.bouncycastle.asn1.ASN1Sequence getHighSpeedVideoFpsRanges;

    @Override // org.bouncycastle.asn1.ASN1Object, org.bouncycastle.asn1.ASN1Encodable
    public org.bouncycastle.asn1.ASN1Primitive toASN1Primitive() {
        return new org.bouncycastle.asn1.DERSequence(this.getHighSpeedVideoFpsRanges);
    }

    public org.bouncycastle.asn1.esf.CrlValidatedID[] getCrls() {
        int size = this.getHighSpeedVideoFpsRanges.size();
        org.bouncycastle.asn1.esf.CrlValidatedID[] crlValidatedIDArr = new org.bouncycastle.asn1.esf.CrlValidatedID[size];
        for (int i = 0; i < size; i++) {
            crlValidatedIDArr[i] = org.bouncycastle.asn1.esf.CrlValidatedID.getInstance(this.getHighSpeedVideoFpsRanges.getObjectAt(i));
        }
        return crlValidatedIDArr;
    }

    public static org.bouncycastle.asn1.esf.CrlListID getInstance(java.lang.Object obj) {
        if (obj instanceof org.bouncycastle.asn1.esf.CrlListID) {
            return (org.bouncycastle.asn1.esf.CrlListID) obj;
        }
        if (obj != null) {
            return new org.bouncycastle.asn1.esf.CrlListID(org.bouncycastle.asn1.ASN1Sequence.getInstance(obj));
        }
        return null;
    }

    public CrlListID(org.bouncycastle.asn1.esf.CrlValidatedID[] crlValidatedIDArr) {
        this.getHighSpeedVideoFpsRanges = new org.bouncycastle.asn1.DERSequence(crlValidatedIDArr);
    }

    private CrlListID(org.bouncycastle.asn1.ASN1Sequence aSN1Sequence) {
        org.bouncycastle.asn1.ASN1Sequence aSN1Sequence2 = (org.bouncycastle.asn1.ASN1Sequence) aSN1Sequence.getObjectAt(0);
        this.getHighSpeedVideoFpsRanges = aSN1Sequence2;
        java.util.Enumeration objects = aSN1Sequence2.getObjects();
        while (objects.hasMoreElements()) {
            org.bouncycastle.asn1.esf.CrlValidatedID.getInstance(objects.nextElement());
        }
    }
}
