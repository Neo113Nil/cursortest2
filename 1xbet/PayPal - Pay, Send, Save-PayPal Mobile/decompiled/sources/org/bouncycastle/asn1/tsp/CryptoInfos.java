package org.bouncycastle.asn1.tsp;

/* loaded from: classes17.dex */
public class CryptoInfos extends org.bouncycastle.asn1.ASN1Object {
    private org.bouncycastle.asn1.ASN1Sequence getHighResolutionOutputSizeshNQ4ISI;

    @Override // org.bouncycastle.asn1.ASN1Object, org.bouncycastle.asn1.ASN1Encodable
    public org.bouncycastle.asn1.ASN1Primitive toASN1Primitive() {
        return this.getHighResolutionOutputSizeshNQ4ISI;
    }

    public org.bouncycastle.asn1.cms.Attribute[] getAttributes() {
        int size = this.getHighResolutionOutputSizeshNQ4ISI.size();
        org.bouncycastle.asn1.cms.Attribute[] attributeArr = new org.bouncycastle.asn1.cms.Attribute[size];
        for (int i = 0; i != size; i++) {
            attributeArr[i] = org.bouncycastle.asn1.cms.Attribute.getInstance(this.getHighResolutionOutputSizeshNQ4ISI.getObjectAt(i));
        }
        return attributeArr;
    }

    public static org.bouncycastle.asn1.tsp.CryptoInfos getInstance(org.bouncycastle.asn1.ASN1TaggedObject aSN1TaggedObject, boolean z) {
        return getInstance(org.bouncycastle.asn1.ASN1Sequence.getInstance(aSN1TaggedObject, z));
    }

    public static org.bouncycastle.asn1.tsp.CryptoInfos getInstance(java.lang.Object obj) {
        if (obj instanceof org.bouncycastle.asn1.tsp.CryptoInfos) {
            return (org.bouncycastle.asn1.tsp.CryptoInfos) obj;
        }
        if (obj != null) {
            return new org.bouncycastle.asn1.tsp.CryptoInfos(org.bouncycastle.asn1.ASN1Sequence.getInstance(obj));
        }
        return null;
    }

    public CryptoInfos(org.bouncycastle.asn1.cms.Attribute[] attributeArr) {
        this.getHighResolutionOutputSizeshNQ4ISI = new org.bouncycastle.asn1.DERSequence(attributeArr);
    }

    private CryptoInfos(org.bouncycastle.asn1.ASN1Sequence aSN1Sequence) {
        this.getHighResolutionOutputSizeshNQ4ISI = aSN1Sequence;
    }
}
