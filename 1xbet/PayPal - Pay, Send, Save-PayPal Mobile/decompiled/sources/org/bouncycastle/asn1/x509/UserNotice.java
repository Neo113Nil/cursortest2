package org.bouncycastle.asn1.x509;

/* loaded from: classes17.dex */
public class UserNotice extends org.bouncycastle.asn1.ASN1Object {
    private final org.bouncycastle.asn1.x509.NoticeReference Camera2StreamConfigurationMap;
    private final org.bouncycastle.asn1.x509.DisplayText getHighSpeedVideoSizes;

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

    public static org.bouncycastle.asn1.x509.UserNotice getInstance(java.lang.Object obj) {
        if (obj instanceof org.bouncycastle.asn1.x509.UserNotice) {
            return (org.bouncycastle.asn1.x509.UserNotice) obj;
        }
        if (obj != null) {
            return new org.bouncycastle.asn1.x509.UserNotice(org.bouncycastle.asn1.ASN1Sequence.getInstance(obj));
        }
        return null;
    }

    public UserNotice(org.bouncycastle.asn1.x509.NoticeReference noticeReference, org.bouncycastle.asn1.x509.DisplayText displayText) {
        this.Camera2StreamConfigurationMap = noticeReference;
        this.getHighSpeedVideoSizes = displayText;
    }

    public UserNotice(org.bouncycastle.asn1.x509.NoticeReference noticeReference, java.lang.String str) {
        this(noticeReference, new org.bouncycastle.asn1.x509.DisplayText(str));
    }

    private UserNotice(org.bouncycastle.asn1.ASN1Sequence aSN1Sequence) {
        if (aSN1Sequence.size() == 2) {
            this.Camera2StreamConfigurationMap = org.bouncycastle.asn1.x509.NoticeReference.getInstance(aSN1Sequence.getObjectAt(0));
            this.getHighSpeedVideoSizes = org.bouncycastle.asn1.x509.DisplayText.getInstance(aSN1Sequence.getObjectAt(1));
            return;
        }
        if (aSN1Sequence.size() != 1) {
            if (aSN1Sequence.size() == 0) {
                this.Camera2StreamConfigurationMap = null;
                this.getHighSpeedVideoSizes = null;
                return;
            } else {
                java.lang.StringBuilder sb = new java.lang.StringBuilder("Bad sequence size: ");
                sb.append(aSN1Sequence.size());
                throw new java.lang.IllegalArgumentException(sb.toString());
            }
        }
        boolean z = aSN1Sequence.getObjectAt(0).toASN1Primitive() instanceof org.bouncycastle.asn1.ASN1Sequence;
        org.bouncycastle.asn1.ASN1Encodable objectAt = aSN1Sequence.getObjectAt(0);
        if (z) {
            this.Camera2StreamConfigurationMap = org.bouncycastle.asn1.x509.NoticeReference.getInstance(objectAt);
            this.getHighSpeedVideoSizes = null;
        } else {
            this.getHighSpeedVideoSizes = org.bouncycastle.asn1.x509.DisplayText.getInstance(objectAt);
            this.Camera2StreamConfigurationMap = null;
        }
    }
}
