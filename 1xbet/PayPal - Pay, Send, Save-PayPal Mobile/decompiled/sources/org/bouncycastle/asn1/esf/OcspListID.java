package org.bouncycastle.asn1.esf;

/* loaded from: classes17.dex */
public class OcspListID extends org.bouncycastle.asn1.ASN1Object {
    private org.bouncycastle.asn1.ASN1Sequence getHighSpeedVideoFpsRangesFor;

    @Override // org.bouncycastle.asn1.ASN1Object, org.bouncycastle.asn1.ASN1Encodable
    public org.bouncycastle.asn1.ASN1Primitive toASN1Primitive() {
        return new org.bouncycastle.asn1.DERSequence(this.getHighSpeedVideoFpsRangesFor);
    }

    public org.bouncycastle.asn1.esf.OcspResponsesID[] getOcspResponses() {
        int size = this.getHighSpeedVideoFpsRangesFor.size();
        org.bouncycastle.asn1.esf.OcspResponsesID[] ocspResponsesIDArr = new org.bouncycastle.asn1.esf.OcspResponsesID[size];
        for (int i = 0; i < size; i++) {
            ocspResponsesIDArr[i] = org.bouncycastle.asn1.esf.OcspResponsesID.getInstance(this.getHighSpeedVideoFpsRangesFor.getObjectAt(i));
        }
        return ocspResponsesIDArr;
    }

    public static org.bouncycastle.asn1.esf.OcspListID getInstance(java.lang.Object obj) {
        if (obj instanceof org.bouncycastle.asn1.esf.OcspListID) {
            return (org.bouncycastle.asn1.esf.OcspListID) obj;
        }
        if (obj != null) {
            return new org.bouncycastle.asn1.esf.OcspListID(org.bouncycastle.asn1.ASN1Sequence.getInstance(obj));
        }
        return null;
    }

    public OcspListID(org.bouncycastle.asn1.esf.OcspResponsesID[] ocspResponsesIDArr) {
        this.getHighSpeedVideoFpsRangesFor = new org.bouncycastle.asn1.DERSequence(ocspResponsesIDArr);
    }

    private OcspListID(org.bouncycastle.asn1.ASN1Sequence aSN1Sequence) {
        if (aSN1Sequence.size() != 1) {
            java.lang.StringBuilder sb = new java.lang.StringBuilder("Bad sequence size: ");
            sb.append(aSN1Sequence.size());
            throw new java.lang.IllegalArgumentException(sb.toString());
        }
        org.bouncycastle.asn1.ASN1Sequence aSN1Sequence2 = (org.bouncycastle.asn1.ASN1Sequence) aSN1Sequence.getObjectAt(0);
        this.getHighSpeedVideoFpsRangesFor = aSN1Sequence2;
        java.util.Enumeration objects = aSN1Sequence2.getObjects();
        while (objects.hasMoreElements()) {
            org.bouncycastle.asn1.esf.OcspResponsesID.getInstance(objects.nextElement());
        }
    }
}
