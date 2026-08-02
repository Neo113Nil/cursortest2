package org.bouncycastle.asn1.x509;

/* loaded from: classes17.dex */
public class NoticeReference extends org.bouncycastle.asn1.ASN1Object {
    private org.bouncycastle.asn1.x509.DisplayText getHighResolutionOutputSizeshNQ4ISI;
    private org.bouncycastle.asn1.ASN1Sequence getHighSpeedVideoFpsRangesFor;

    @Override // org.bouncycastle.asn1.ASN1Object, org.bouncycastle.asn1.ASN1Encodable
    public org.bouncycastle.asn1.ASN1Primitive toASN1Primitive() {
        org.bouncycastle.asn1.ASN1EncodableVector aSN1EncodableVector = new org.bouncycastle.asn1.ASN1EncodableVector(2);
        aSN1EncodableVector.add(this.getHighResolutionOutputSizeshNQ4ISI);
        aSN1EncodableVector.add(this.getHighSpeedVideoFpsRangesFor);
        return new org.bouncycastle.asn1.DERSequence(aSN1EncodableVector);
    }

    public org.bouncycastle.asn1.x509.DisplayText getOrganization() {
        return this.getHighResolutionOutputSizeshNQ4ISI;
    }

    public org.bouncycastle.asn1.ASN1Integer[] getNoticeNumbers() {
        org.bouncycastle.asn1.ASN1Integer[] aSN1IntegerArr = new org.bouncycastle.asn1.ASN1Integer[this.getHighSpeedVideoFpsRangesFor.size()];
        for (int i = 0; i != this.getHighSpeedVideoFpsRangesFor.size(); i++) {
            aSN1IntegerArr[i] = org.bouncycastle.asn1.ASN1Integer.getInstance(this.getHighSpeedVideoFpsRangesFor.getObjectAt(i));
        }
        return aSN1IntegerArr;
    }

    public static org.bouncycastle.asn1.x509.NoticeReference getInstance(java.lang.Object obj) {
        if (obj instanceof org.bouncycastle.asn1.x509.NoticeReference) {
            return (org.bouncycastle.asn1.x509.NoticeReference) obj;
        }
        if (obj != null) {
            return new org.bouncycastle.asn1.x509.NoticeReference(org.bouncycastle.asn1.ASN1Sequence.getInstance(obj));
        }
        return null;
    }

    private static org.bouncycastle.asn1.ASN1EncodableVector getHighSpeedVideoSizes(java.util.Vector vector) {
        org.bouncycastle.asn1.ASN1Integer aSN1Integer;
        org.bouncycastle.asn1.ASN1EncodableVector aSN1EncodableVector = new org.bouncycastle.asn1.ASN1EncodableVector(vector.size());
        java.util.Enumeration elements = vector.elements();
        while (elements.hasMoreElements()) {
            java.lang.Object nextElement = elements.nextElement();
            if (nextElement instanceof java.math.BigInteger) {
                aSN1Integer = new org.bouncycastle.asn1.ASN1Integer((java.math.BigInteger) nextElement);
            } else {
                if (!(nextElement instanceof java.lang.Integer)) {
                    throw new java.lang.IllegalArgumentException();
                }
                aSN1Integer = new org.bouncycastle.asn1.ASN1Integer(((java.lang.Integer) nextElement).intValue());
            }
            aSN1EncodableVector.add(aSN1Integer);
        }
        return aSN1EncodableVector;
    }

    public NoticeReference(org.bouncycastle.asn1.x509.DisplayText displayText, org.bouncycastle.asn1.ASN1EncodableVector aSN1EncodableVector) {
        this.getHighResolutionOutputSizeshNQ4ISI = displayText;
        this.getHighSpeedVideoFpsRangesFor = new org.bouncycastle.asn1.DERSequence(aSN1EncodableVector);
    }

    private NoticeReference(org.bouncycastle.asn1.ASN1Sequence aSN1Sequence) {
        if (aSN1Sequence.size() == 2) {
            this.getHighResolutionOutputSizeshNQ4ISI = org.bouncycastle.asn1.x509.DisplayText.getInstance(aSN1Sequence.getObjectAt(0));
            this.getHighSpeedVideoFpsRangesFor = org.bouncycastle.asn1.ASN1Sequence.getInstance(aSN1Sequence.getObjectAt(1));
        } else {
            java.lang.StringBuilder sb = new java.lang.StringBuilder("Bad sequence size: ");
            sb.append(aSN1Sequence.size());
            throw new java.lang.IllegalArgumentException(sb.toString());
        }
    }

    public NoticeReference(java.lang.String str, org.bouncycastle.asn1.ASN1EncodableVector aSN1EncodableVector) {
        this(new org.bouncycastle.asn1.x509.DisplayText(str), aSN1EncodableVector);
    }

    public NoticeReference(java.lang.String str, java.util.Vector vector) {
        this(str, getHighSpeedVideoSizes(vector));
    }
}
