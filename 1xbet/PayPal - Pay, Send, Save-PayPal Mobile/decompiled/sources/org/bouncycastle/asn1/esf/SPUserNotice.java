package org.bouncycastle.asn1.esf;

/* loaded from: classes17.dex */
public class SPUserNotice extends org.bouncycastle.asn1.ASN1Object {
    private org.bouncycastle.asn1.x509.NoticeReference Camera2StreamConfigurationMap;
    private org.bouncycastle.asn1.x509.DisplayText getHighSpeedVideoSizes;

    @Override // org.bouncycastle.asn1.ASN1Object, org.bouncycastle.asn1.ASN1Encodable
    public org.bouncycastle.asn1.ASN1Primitive toASN1Primitive() {
        org.bouncycastle.asn1.ASN1EncodableVector aSN1EncodableVector = new org.bouncycastle.asn1.ASN1EncodableVector(2);
        org.bouncycastle.asn1.x509.NoticeReference noticeReference = this.Camera2StreamConfigurationMap;
        if (noticeReference != null) {
            aSN1EncodableVector.add(noticeReference);
        }
        org.bouncycastle.asn1.x509.DisplayText displayText = this.getHighSpeedVideoSizes;
        if (displayText != null) {
            aSN1EncodableVector.add(displayText);
        }
        return new org.bouncycastle.asn1.DERSequence(aSN1EncodableVector);
    }

    public org.bouncycastle.asn1.x509.NoticeReference getNoticeRef() {
        return this.Camera2StreamConfigurationMap;
    }

    public org.bouncycastle.asn1.x509.DisplayText getExplicitText() {
        return this.getHighSpeedVideoSizes;
    }

    public static org.bouncycastle.asn1.esf.SPUserNotice getInstance(java.lang.Object obj) {
        if (obj instanceof org.bouncycastle.asn1.esf.SPUserNotice) {
            return (org.bouncycastle.asn1.esf.SPUserNotice) obj;
        }
        if (obj != null) {
            return new org.bouncycastle.asn1.esf.SPUserNotice(org.bouncycastle.asn1.ASN1Sequence.getInstance(obj));
        }
        return null;
    }

    public SPUserNotice(org.bouncycastle.asn1.x509.NoticeReference noticeReference, org.bouncycastle.asn1.x509.DisplayText displayText) {
        this.Camera2StreamConfigurationMap = noticeReference;
        this.getHighSpeedVideoSizes = displayText;
    }

    private SPUserNotice(org.bouncycastle.asn1.ASN1Sequence aSN1Sequence) {
        java.util.Enumeration objects = aSN1Sequence.getObjects();
        while (objects.hasMoreElements()) {
            org.bouncycastle.asn1.ASN1Encodable aSN1Encodable = (org.bouncycastle.asn1.ASN1Encodable) objects.nextElement();
            if ((aSN1Encodable instanceof org.bouncycastle.asn1.x509.DisplayText) || (aSN1Encodable instanceof org.bouncycastle.asn1.ASN1String)) {
                this.getHighSpeedVideoSizes = org.bouncycastle.asn1.x509.DisplayText.getInstance(aSN1Encodable);
            } else {
                if (!(aSN1Encodable instanceof org.bouncycastle.asn1.x509.NoticeReference) && !(aSN1Encodable instanceof org.bouncycastle.asn1.ASN1Sequence)) {
                    java.lang.StringBuilder sb = new java.lang.StringBuilder("Invalid element in 'SPUserNotice': ");
                    sb.append(aSN1Encodable.getClass().getName());
                    throw new java.lang.IllegalArgumentException(sb.toString());
                }
                this.Camera2StreamConfigurationMap = org.bouncycastle.asn1.x509.NoticeReference.getInstance(aSN1Encodable);
            }
        }
    }
}
