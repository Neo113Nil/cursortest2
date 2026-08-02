package org.bouncycastle.asn1.cmp;

/* loaded from: classes17.dex */
public class ErrorMsgContent extends org.bouncycastle.asn1.ASN1Object {
    private org.bouncycastle.asn1.cmp.PKIStatusInfo Camera2StreamConfigurationMap;
    private org.bouncycastle.asn1.ASN1Integer getHighResolutionOutputSizeshNQ4ISI;
    private org.bouncycastle.asn1.cmp.PKIFreeText getHighSpeedVideoFpsRanges;

    @Override // org.bouncycastle.asn1.ASN1Object, org.bouncycastle.asn1.ASN1Encodable
    public org.bouncycastle.asn1.ASN1Primitive toASN1Primitive() {
        org.bouncycastle.asn1.ASN1EncodableVector aSN1EncodableVector = new org.bouncycastle.asn1.ASN1EncodableVector(3);
        aSN1EncodableVector.add(this.Camera2StreamConfigurationMap);
        org.bouncycastle.asn1.ASN1Integer aSN1Integer = this.getHighResolutionOutputSizeshNQ4ISI;
        if (aSN1Integer != null) {
            aSN1EncodableVector.add(aSN1Integer);
        }
        org.bouncycastle.asn1.cmp.PKIFreeText pKIFreeText = this.getHighSpeedVideoFpsRanges;
        if (pKIFreeText != null) {
            aSN1EncodableVector.add(pKIFreeText);
        }
        return new org.bouncycastle.asn1.DERSequence(aSN1EncodableVector);
    }

    public org.bouncycastle.asn1.cmp.PKIStatusInfo getPKIStatusInfo() {
        return this.Camera2StreamConfigurationMap;
    }

    public org.bouncycastle.asn1.cmp.PKIFreeText getErrorDetails() {
        return this.getHighSpeedVideoFpsRanges;
    }

    public org.bouncycastle.asn1.ASN1Integer getErrorCode() {
        return this.getHighResolutionOutputSizeshNQ4ISI;
    }

    public static org.bouncycastle.asn1.cmp.ErrorMsgContent getInstance(java.lang.Object obj) {
        if (obj instanceof org.bouncycastle.asn1.cmp.ErrorMsgContent) {
            return (org.bouncycastle.asn1.cmp.ErrorMsgContent) obj;
        }
        if (obj != null) {
            return new org.bouncycastle.asn1.cmp.ErrorMsgContent(org.bouncycastle.asn1.ASN1Sequence.getInstance(obj));
        }
        return null;
    }

    public ErrorMsgContent(org.bouncycastle.asn1.cmp.PKIStatusInfo pKIStatusInfo, org.bouncycastle.asn1.ASN1Integer aSN1Integer, org.bouncycastle.asn1.cmp.PKIFreeText pKIFreeText) {
        if (pKIStatusInfo == null) {
            throw new java.lang.IllegalArgumentException("'pkiStatusInfo' cannot be null");
        }
        this.Camera2StreamConfigurationMap = pKIStatusInfo;
        this.getHighResolutionOutputSizeshNQ4ISI = aSN1Integer;
        this.getHighSpeedVideoFpsRanges = pKIFreeText;
    }

    public ErrorMsgContent(org.bouncycastle.asn1.cmp.PKIStatusInfo pKIStatusInfo) {
        this(pKIStatusInfo, null, null);
    }

    private ErrorMsgContent(org.bouncycastle.asn1.ASN1Sequence aSN1Sequence) {
        java.util.Enumeration objects = aSN1Sequence.getObjects();
        this.Camera2StreamConfigurationMap = org.bouncycastle.asn1.cmp.PKIStatusInfo.getInstance(objects.nextElement());
        while (objects.hasMoreElements()) {
            java.lang.Object nextElement = objects.nextElement();
            if (nextElement instanceof org.bouncycastle.asn1.ASN1Integer) {
                this.getHighResolutionOutputSizeshNQ4ISI = org.bouncycastle.asn1.ASN1Integer.getInstance(nextElement);
            } else {
                this.getHighSpeedVideoFpsRanges = org.bouncycastle.asn1.cmp.PKIFreeText.getInstance(nextElement);
            }
        }
    }
}
