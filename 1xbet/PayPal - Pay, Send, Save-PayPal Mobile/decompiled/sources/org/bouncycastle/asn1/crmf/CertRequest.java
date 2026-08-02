package org.bouncycastle.asn1.crmf;

/* loaded from: classes17.dex */
public class CertRequest extends org.bouncycastle.asn1.ASN1Object {
    private org.bouncycastle.asn1.crmf.Controls getHighResolutionOutputSizeshNQ4ISI;
    private org.bouncycastle.asn1.crmf.CertTemplate getHighSpeedVideoFpsRanges;
    private org.bouncycastle.asn1.ASN1Integer getHighSpeedVideoFpsRangesFor;

    @Override // org.bouncycastle.asn1.ASN1Object, org.bouncycastle.asn1.ASN1Encodable
    public org.bouncycastle.asn1.ASN1Primitive toASN1Primitive() {
        org.bouncycastle.asn1.ASN1EncodableVector aSN1EncodableVector = new org.bouncycastle.asn1.ASN1EncodableVector(3);
        aSN1EncodableVector.add(this.getHighSpeedVideoFpsRangesFor);
        aSN1EncodableVector.add(this.getHighSpeedVideoFpsRanges);
        org.bouncycastle.asn1.crmf.Controls controls = this.getHighResolutionOutputSizeshNQ4ISI;
        if (controls != null) {
            aSN1EncodableVector.add(controls);
        }
        return new org.bouncycastle.asn1.DERSequence(aSN1EncodableVector);
    }

    public org.bouncycastle.asn1.crmf.Controls getControls() {
        return this.getHighResolutionOutputSizeshNQ4ISI;
    }

    public org.bouncycastle.asn1.crmf.CertTemplate getCertTemplate() {
        return this.getHighSpeedVideoFpsRanges;
    }

    public org.bouncycastle.asn1.ASN1Integer getCertReqId() {
        return this.getHighSpeedVideoFpsRangesFor;
    }

    public static org.bouncycastle.asn1.crmf.CertRequest getInstance(java.lang.Object obj) {
        if (obj instanceof org.bouncycastle.asn1.crmf.CertRequest) {
            return (org.bouncycastle.asn1.crmf.CertRequest) obj;
        }
        if (obj != null) {
            return new org.bouncycastle.asn1.crmf.CertRequest(org.bouncycastle.asn1.ASN1Sequence.getInstance(obj));
        }
        return null;
    }

    private CertRequest(org.bouncycastle.asn1.ASN1Sequence aSN1Sequence) {
        this.getHighSpeedVideoFpsRangesFor = new org.bouncycastle.asn1.ASN1Integer(org.bouncycastle.asn1.ASN1Integer.getInstance(aSN1Sequence.getObjectAt(0)).getValue());
        this.getHighSpeedVideoFpsRanges = org.bouncycastle.asn1.crmf.CertTemplate.getInstance(aSN1Sequence.getObjectAt(1));
        if (aSN1Sequence.size() > 2) {
            this.getHighResolutionOutputSizeshNQ4ISI = org.bouncycastle.asn1.crmf.Controls.getInstance(aSN1Sequence.getObjectAt(2));
        }
    }

    public CertRequest(org.bouncycastle.asn1.ASN1Integer aSN1Integer, org.bouncycastle.asn1.crmf.CertTemplate certTemplate, org.bouncycastle.asn1.crmf.Controls controls) {
        this.getHighSpeedVideoFpsRangesFor = aSN1Integer;
        this.getHighSpeedVideoFpsRanges = certTemplate;
        this.getHighResolutionOutputSizeshNQ4ISI = controls;
    }

    public CertRequest(int i, org.bouncycastle.asn1.crmf.CertTemplate certTemplate, org.bouncycastle.asn1.crmf.Controls controls) {
        this(new org.bouncycastle.asn1.ASN1Integer(i), certTemplate, controls);
    }
}
