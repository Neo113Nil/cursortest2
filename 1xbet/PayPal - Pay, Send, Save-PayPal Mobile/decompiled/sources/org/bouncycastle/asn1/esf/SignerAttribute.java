package org.bouncycastle.asn1.esf;

/* loaded from: classes17.dex */
public class SignerAttribute extends org.bouncycastle.asn1.ASN1Object {
    private java.lang.Object[] getHighResolutionOutputSizeshNQ4ISI;

    @Override // org.bouncycastle.asn1.ASN1Object, org.bouncycastle.asn1.ASN1Encodable
    public org.bouncycastle.asn1.ASN1Primitive toASN1Primitive() {
        org.bouncycastle.asn1.ASN1EncodableVector aSN1EncodableVector = new org.bouncycastle.asn1.ASN1EncodableVector(this.getHighResolutionOutputSizeshNQ4ISI.length);
        int i = 0;
        while (true) {
            java.lang.Object[] objArr = this.getHighResolutionOutputSizeshNQ4ISI;
            if (i == objArr.length) {
                return new org.bouncycastle.asn1.DERSequence(aSN1EncodableVector);
            }
            java.lang.Object obj = objArr[i];
            aSN1EncodableVector.add(obj instanceof org.bouncycastle.asn1.x509.Attribute[] ? new org.bouncycastle.asn1.DERTaggedObject(0, new org.bouncycastle.asn1.DERSequence((org.bouncycastle.asn1.x509.Attribute[]) this.getHighResolutionOutputSizeshNQ4ISI[i])) : new org.bouncycastle.asn1.DERTaggedObject(1, (org.bouncycastle.asn1.x509.AttributeCertificate) obj));
            i++;
        }
    }

    public java.lang.Object[] getValues() {
        java.lang.Object[] objArr = this.getHighResolutionOutputSizeshNQ4ISI;
        int length = objArr.length;
        java.lang.Object[] objArr2 = new java.lang.Object[length];
        java.lang.System.arraycopy(objArr, 0, objArr2, 0, length);
        return objArr2;
    }

    public static org.bouncycastle.asn1.esf.SignerAttribute getInstance(java.lang.Object obj) {
        if (obj instanceof org.bouncycastle.asn1.esf.SignerAttribute) {
            return (org.bouncycastle.asn1.esf.SignerAttribute) obj;
        }
        if (obj != null) {
            return new org.bouncycastle.asn1.esf.SignerAttribute(org.bouncycastle.asn1.ASN1Sequence.getInstance(obj));
        }
        return null;
    }

    public SignerAttribute(org.bouncycastle.asn1.x509.Attribute[] attributeArr) {
        this.getHighResolutionOutputSizeshNQ4ISI = new java.lang.Object[]{attributeArr};
    }

    public SignerAttribute(org.bouncycastle.asn1.x509.AttributeCertificate attributeCertificate) {
        this.getHighResolutionOutputSizeshNQ4ISI = new java.lang.Object[]{attributeCertificate};
    }

    private SignerAttribute(org.bouncycastle.asn1.ASN1Sequence aSN1Sequence) {
        this.getHighResolutionOutputSizeshNQ4ISI = new java.lang.Object[aSN1Sequence.size()];
        java.util.Enumeration objects = aSN1Sequence.getObjects();
        int i = 0;
        while (objects.hasMoreElements()) {
            org.bouncycastle.asn1.ASN1TaggedObject aSN1TaggedObject = org.bouncycastle.asn1.ASN1TaggedObject.getInstance(objects.nextElement());
            if (aSN1TaggedObject.getTagNo() == 0) {
                org.bouncycastle.asn1.ASN1Sequence aSN1Sequence2 = org.bouncycastle.asn1.ASN1Sequence.getInstance(aSN1TaggedObject, true);
                int size = aSN1Sequence2.size();
                org.bouncycastle.asn1.x509.Attribute[] attributeArr = new org.bouncycastle.asn1.x509.Attribute[size];
                for (int i2 = 0; i2 != size; i2++) {
                    attributeArr[i2] = org.bouncycastle.asn1.x509.Attribute.getInstance(aSN1Sequence2.getObjectAt(i2));
                }
                this.getHighResolutionOutputSizeshNQ4ISI[i] = attributeArr;
            } else {
                if (aSN1TaggedObject.getTagNo() != 1) {
                    java.lang.StringBuilder sb = new java.lang.StringBuilder("illegal tag: ");
                    sb.append(aSN1TaggedObject.getTagNo());
                    throw new java.lang.IllegalArgumentException(sb.toString());
                }
                this.getHighResolutionOutputSizeshNQ4ISI[i] = org.bouncycastle.asn1.x509.AttributeCertificate.getInstance(org.bouncycastle.asn1.ASN1Sequence.getInstance(aSN1TaggedObject, true));
            }
            i++;
        }
    }
}
