package org.bouncycastle.asn1.esf;

/* loaded from: classes17.dex */
public class CompleteRevocationRefs extends org.bouncycastle.asn1.ASN1Object {
    private org.bouncycastle.asn1.ASN1Sequence getHighSpeedVideoSizes;

    @Override // org.bouncycastle.asn1.ASN1Object, org.bouncycastle.asn1.ASN1Encodable
    public org.bouncycastle.asn1.ASN1Primitive toASN1Primitive() {
        return this.getHighSpeedVideoSizes;
    }

    public org.bouncycastle.asn1.esf.CrlOcspRef[] getCrlOcspRefs() {
        int size = this.getHighSpeedVideoSizes.size();
        org.bouncycastle.asn1.esf.CrlOcspRef[] crlOcspRefArr = new org.bouncycastle.asn1.esf.CrlOcspRef[size];
        for (int i = 0; i < size; i++) {
            crlOcspRefArr[i] = org.bouncycastle.asn1.esf.CrlOcspRef.getInstance(this.getHighSpeedVideoSizes.getObjectAt(i));
        }
        return crlOcspRefArr;
    }

    public static org.bouncycastle.asn1.esf.CompleteRevocationRefs getInstance(java.lang.Object obj) {
        if (obj instanceof org.bouncycastle.asn1.esf.CompleteRevocationRefs) {
            return (org.bouncycastle.asn1.esf.CompleteRevocationRefs) obj;
        }
        if (obj != null) {
            return new org.bouncycastle.asn1.esf.CompleteRevocationRefs(org.bouncycastle.asn1.ASN1Sequence.getInstance(obj));
        }
        return null;
    }

    public CompleteRevocationRefs(org.bouncycastle.asn1.esf.CrlOcspRef[] crlOcspRefArr) {
        this.getHighSpeedVideoSizes = new org.bouncycastle.asn1.DERSequence(crlOcspRefArr);
    }

    private CompleteRevocationRefs(org.bouncycastle.asn1.ASN1Sequence aSN1Sequence) {
        java.util.Enumeration objects = aSN1Sequence.getObjects();
        while (objects.hasMoreElements()) {
            org.bouncycastle.asn1.esf.CrlOcspRef.getInstance(objects.nextElement());
        }
        this.getHighSpeedVideoSizes = aSN1Sequence;
    }
}
