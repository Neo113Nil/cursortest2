package org.bouncycastle.asn1.x509;

/* loaded from: classes17.dex */
public class SubjectDirectoryAttributes extends org.bouncycastle.asn1.ASN1Object {
    private java.util.Vector getHighResolutionOutputSizeshNQ4ISI = new java.util.Vector();

    @Override // org.bouncycastle.asn1.ASN1Object, org.bouncycastle.asn1.ASN1Encodable
    public org.bouncycastle.asn1.ASN1Primitive toASN1Primitive() {
        org.bouncycastle.asn1.ASN1EncodableVector aSN1EncodableVector = new org.bouncycastle.asn1.ASN1EncodableVector(this.getHighResolutionOutputSizeshNQ4ISI.size());
        java.util.Enumeration elements = this.getHighResolutionOutputSizeshNQ4ISI.elements();
        while (elements.hasMoreElements()) {
            aSN1EncodableVector.add((org.bouncycastle.asn1.x509.Attribute) elements.nextElement());
        }
        return new org.bouncycastle.asn1.DERSequence(aSN1EncodableVector);
    }

    public java.util.Vector getAttributes() {
        return this.getHighResolutionOutputSizeshNQ4ISI;
    }

    public static org.bouncycastle.asn1.x509.SubjectDirectoryAttributes getInstance(java.lang.Object obj) {
        if (obj instanceof org.bouncycastle.asn1.x509.SubjectDirectoryAttributes) {
            return (org.bouncycastle.asn1.x509.SubjectDirectoryAttributes) obj;
        }
        if (obj != null) {
            return new org.bouncycastle.asn1.x509.SubjectDirectoryAttributes(org.bouncycastle.asn1.ASN1Sequence.getInstance(obj));
        }
        return null;
    }

    private SubjectDirectoryAttributes(org.bouncycastle.asn1.ASN1Sequence aSN1Sequence) {
        java.util.Enumeration objects = aSN1Sequence.getObjects();
        while (objects.hasMoreElements()) {
            this.getHighResolutionOutputSizeshNQ4ISI.addElement(org.bouncycastle.asn1.x509.Attribute.getInstance(org.bouncycastle.asn1.ASN1Sequence.getInstance(objects.nextElement())));
        }
    }

    public SubjectDirectoryAttributes(java.util.Vector vector) {
        java.util.Enumeration elements = vector.elements();
        while (elements.hasMoreElements()) {
            this.getHighResolutionOutputSizeshNQ4ISI.addElement(elements.nextElement());
        }
    }
}
