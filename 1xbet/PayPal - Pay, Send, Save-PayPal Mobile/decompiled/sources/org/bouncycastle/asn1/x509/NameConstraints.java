package org.bouncycastle.asn1.x509;

/* loaded from: classes17.dex */
public class NameConstraints extends org.bouncycastle.asn1.ASN1Object {
    private org.bouncycastle.asn1.x509.GeneralSubtree[] getHighResolutionOutputSizeshNQ4ISI;
    private org.bouncycastle.asn1.x509.GeneralSubtree[] getHighSpeedVideoFpsRangesFor;

    public NameConstraints(org.bouncycastle.asn1.x509.GeneralSubtree[] generalSubtreeArr, org.bouncycastle.asn1.x509.GeneralSubtree[] generalSubtreeArr2) {
        org.bouncycastle.asn1.x509.GeneralSubtree[] generalSubtreeArr3;
        org.bouncycastle.asn1.x509.GeneralSubtree[] generalSubtreeArr4 = null;
        if (generalSubtreeArr != null) {
            int length = generalSubtreeArr.length;
            generalSubtreeArr3 = new org.bouncycastle.asn1.x509.GeneralSubtree[length];
            java.lang.System.arraycopy(generalSubtreeArr, 0, generalSubtreeArr3, 0, length);
        } else {
            generalSubtreeArr3 = null;
        }
        this.getHighSpeedVideoFpsRangesFor = generalSubtreeArr3;
        if (generalSubtreeArr2 != null) {
            int length2 = generalSubtreeArr2.length;
            generalSubtreeArr4 = new org.bouncycastle.asn1.x509.GeneralSubtree[length2];
            java.lang.System.arraycopy(generalSubtreeArr2, 0, generalSubtreeArr4, 0, length2);
        }
        this.getHighResolutionOutputSizeshNQ4ISI = generalSubtreeArr4;
    }

    public org.bouncycastle.asn1.x509.GeneralSubtree[] getExcludedSubtrees() {
        org.bouncycastle.asn1.x509.GeneralSubtree[] generalSubtreeArr = this.getHighResolutionOutputSizeshNQ4ISI;
        if (generalSubtreeArr == null) {
            return null;
        }
        int length = generalSubtreeArr.length;
        org.bouncycastle.asn1.x509.GeneralSubtree[] generalSubtreeArr2 = new org.bouncycastle.asn1.x509.GeneralSubtree[length];
        java.lang.System.arraycopy(generalSubtreeArr, 0, generalSubtreeArr2, 0, length);
        return generalSubtreeArr2;
    }

    public org.bouncycastle.asn1.x509.GeneralSubtree[] getPermittedSubtrees() {
        org.bouncycastle.asn1.x509.GeneralSubtree[] generalSubtreeArr = this.getHighSpeedVideoFpsRangesFor;
        if (generalSubtreeArr == null) {
            return null;
        }
        int length = generalSubtreeArr.length;
        org.bouncycastle.asn1.x509.GeneralSubtree[] generalSubtreeArr2 = new org.bouncycastle.asn1.x509.GeneralSubtree[length];
        java.lang.System.arraycopy(generalSubtreeArr, 0, generalSubtreeArr2, 0, length);
        return generalSubtreeArr2;
    }

    @Override // org.bouncycastle.asn1.ASN1Object, org.bouncycastle.asn1.ASN1Encodable
    public org.bouncycastle.asn1.ASN1Primitive toASN1Primitive() {
        org.bouncycastle.asn1.ASN1EncodableVector aSN1EncodableVector = new org.bouncycastle.asn1.ASN1EncodableVector(2);
        if (this.getHighSpeedVideoFpsRangesFor != null) {
            aSN1EncodableVector.add(new org.bouncycastle.asn1.DERTaggedObject(false, 0, (org.bouncycastle.asn1.ASN1Encodable) new org.bouncycastle.asn1.DERSequence(this.getHighSpeedVideoFpsRangesFor)));
        }
        if (this.getHighResolutionOutputSizeshNQ4ISI != null) {
            aSN1EncodableVector.add(new org.bouncycastle.asn1.DERTaggedObject(false, 1, (org.bouncycastle.asn1.ASN1Encodable) new org.bouncycastle.asn1.DERSequence(this.getHighResolutionOutputSizeshNQ4ISI)));
        }
        return new org.bouncycastle.asn1.DERSequence(aSN1EncodableVector);
    }

    public static org.bouncycastle.asn1.x509.NameConstraints getInstance(java.lang.Object obj) {
        if (obj instanceof org.bouncycastle.asn1.x509.NameConstraints) {
            return (org.bouncycastle.asn1.x509.NameConstraints) obj;
        }
        if (obj != null) {
            return new org.bouncycastle.asn1.x509.NameConstraints(org.bouncycastle.asn1.ASN1Sequence.getInstance(obj));
        }
        return null;
    }

    private static org.bouncycastle.asn1.x509.GeneralSubtree[] getHighSpeedVideoFpsRanges(org.bouncycastle.asn1.ASN1Sequence aSN1Sequence) {
        int size = aSN1Sequence.size();
        org.bouncycastle.asn1.x509.GeneralSubtree[] generalSubtreeArr = new org.bouncycastle.asn1.x509.GeneralSubtree[size];
        for (int i = 0; i != size; i++) {
            generalSubtreeArr[i] = org.bouncycastle.asn1.x509.GeneralSubtree.getInstance(aSN1Sequence.getObjectAt(i));
        }
        return generalSubtreeArr;
    }

    private NameConstraints(org.bouncycastle.asn1.ASN1Sequence aSN1Sequence) {
        java.util.Enumeration objects = aSN1Sequence.getObjects();
        while (objects.hasMoreElements()) {
            org.bouncycastle.asn1.ASN1TaggedObject aSN1TaggedObject = org.bouncycastle.asn1.ASN1TaggedObject.getInstance(objects.nextElement());
            int tagNo = aSN1TaggedObject.getTagNo();
            if (tagNo == 0) {
                this.getHighSpeedVideoFpsRangesFor = getHighSpeedVideoFpsRanges(org.bouncycastle.asn1.ASN1Sequence.getInstance(aSN1TaggedObject, false));
            } else {
                if (tagNo != 1) {
                    java.lang.StringBuilder sb = new java.lang.StringBuilder("Unknown tag encountered: ");
                    sb.append(aSN1TaggedObject.getTagNo());
                    throw new java.lang.IllegalArgumentException(sb.toString());
                }
                this.getHighResolutionOutputSizeshNQ4ISI = getHighSpeedVideoFpsRanges(org.bouncycastle.asn1.ASN1Sequence.getInstance(aSN1TaggedObject, false));
            }
        }
    }
}
