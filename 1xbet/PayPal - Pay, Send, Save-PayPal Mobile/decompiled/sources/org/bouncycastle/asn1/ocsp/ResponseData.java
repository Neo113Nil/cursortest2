package org.bouncycastle.asn1.ocsp;

/* loaded from: classes17.dex */
public class ResponseData extends org.bouncycastle.asn1.ASN1Object {
    private static final org.bouncycastle.asn1.ASN1Integer getHighSpeedVideoSizes = new org.bouncycastle.asn1.ASN1Integer(0);
    private org.bouncycastle.asn1.ocsp.ResponderID Camera2StreamConfigurationMap;
    private org.bouncycastle.asn1.ASN1GeneralizedTime getHighResolutionOutputSizeshNQ4ISI;
    private org.bouncycastle.asn1.x509.Extensions getHighSpeedVideoFpsRanges;
    private org.bouncycastle.asn1.ASN1Sequence getHighSpeedVideoFpsRangesFor;
    private org.bouncycastle.asn1.ASN1Integer getOutputFormats;
    private boolean getOutputMinFrameDuration;

    @Override // org.bouncycastle.asn1.ASN1Object, org.bouncycastle.asn1.ASN1Encodable
    public org.bouncycastle.asn1.ASN1Primitive toASN1Primitive() {
        org.bouncycastle.asn1.ASN1EncodableVector aSN1EncodableVector = new org.bouncycastle.asn1.ASN1EncodableVector(5);
        if (this.getOutputMinFrameDuration || !this.getOutputFormats.equals((org.bouncycastle.asn1.ASN1Primitive) getHighSpeedVideoSizes)) {
            aSN1EncodableVector.add(new org.bouncycastle.asn1.DERTaggedObject(true, 0, (org.bouncycastle.asn1.ASN1Encodable) this.getOutputFormats));
        }
        aSN1EncodableVector.add(this.Camera2StreamConfigurationMap);
        aSN1EncodableVector.add(this.getHighResolutionOutputSizeshNQ4ISI);
        aSN1EncodableVector.add(this.getHighSpeedVideoFpsRangesFor);
        org.bouncycastle.asn1.x509.Extensions extensions = this.getHighSpeedVideoFpsRanges;
        if (extensions != null) {
            aSN1EncodableVector.add(new org.bouncycastle.asn1.DERTaggedObject(true, 1, (org.bouncycastle.asn1.ASN1Encodable) extensions));
        }
        return new org.bouncycastle.asn1.DERSequence(aSN1EncodableVector);
    }

    public org.bouncycastle.asn1.ASN1Integer getVersion() {
        return this.getOutputFormats;
    }

    public org.bouncycastle.asn1.ASN1Sequence getResponses() {
        return this.getHighSpeedVideoFpsRangesFor;
    }

    public org.bouncycastle.asn1.x509.Extensions getResponseExtensions() {
        return this.getHighSpeedVideoFpsRanges;
    }

    public org.bouncycastle.asn1.ocsp.ResponderID getResponderID() {
        return this.Camera2StreamConfigurationMap;
    }

    public org.bouncycastle.asn1.ASN1GeneralizedTime getProducedAt() {
        return this.getHighResolutionOutputSizeshNQ4ISI;
    }

    public static org.bouncycastle.asn1.ocsp.ResponseData getInstance(org.bouncycastle.asn1.ASN1TaggedObject aSN1TaggedObject, boolean z) {
        return getInstance(org.bouncycastle.asn1.ASN1Sequence.getInstance(aSN1TaggedObject, z));
    }

    public static org.bouncycastle.asn1.ocsp.ResponseData getInstance(java.lang.Object obj) {
        if (obj instanceof org.bouncycastle.asn1.ocsp.ResponseData) {
            return (org.bouncycastle.asn1.ocsp.ResponseData) obj;
        }
        if (obj != null) {
            return new org.bouncycastle.asn1.ocsp.ResponseData(org.bouncycastle.asn1.ASN1Sequence.getInstance(obj));
        }
        return null;
    }

    public ResponseData(org.bouncycastle.asn1.ocsp.ResponderID responderID, org.bouncycastle.asn1.ASN1GeneralizedTime aSN1GeneralizedTime, org.bouncycastle.asn1.ASN1Sequence aSN1Sequence, org.bouncycastle.asn1.x509.X509Extensions x509Extensions) {
        this(getHighSpeedVideoSizes, responderID, org.bouncycastle.asn1.ASN1GeneralizedTime.getInstance(aSN1GeneralizedTime), aSN1Sequence, org.bouncycastle.asn1.x509.Extensions.getInstance(x509Extensions));
    }

    public ResponseData(org.bouncycastle.asn1.ocsp.ResponderID responderID, org.bouncycastle.asn1.ASN1GeneralizedTime aSN1GeneralizedTime, org.bouncycastle.asn1.ASN1Sequence aSN1Sequence, org.bouncycastle.asn1.x509.Extensions extensions) {
        this(getHighSpeedVideoSizes, responderID, aSN1GeneralizedTime, aSN1Sequence, extensions);
    }

    private ResponseData(org.bouncycastle.asn1.ASN1Sequence aSN1Sequence) {
        int i = 0;
        if ((aSN1Sequence.getObjectAt(0) instanceof org.bouncycastle.asn1.ASN1TaggedObject) && ((org.bouncycastle.asn1.ASN1TaggedObject) aSN1Sequence.getObjectAt(0)).getTagNo() == 0) {
            this.getOutputMinFrameDuration = true;
            this.getOutputFormats = org.bouncycastle.asn1.ASN1Integer.getInstance((org.bouncycastle.asn1.ASN1TaggedObject) aSN1Sequence.getObjectAt(0), true);
            i = 1;
        } else {
            this.getOutputFormats = getHighSpeedVideoSizes;
        }
        this.Camera2StreamConfigurationMap = org.bouncycastle.asn1.ocsp.ResponderID.getInstance(aSN1Sequence.getObjectAt(i));
        this.getHighResolutionOutputSizeshNQ4ISI = org.bouncycastle.asn1.ASN1GeneralizedTime.getInstance(aSN1Sequence.getObjectAt(i + 1));
        int i2 = i + 3;
        this.getHighSpeedVideoFpsRangesFor = (org.bouncycastle.asn1.ASN1Sequence) aSN1Sequence.getObjectAt(i + 2);
        if (aSN1Sequence.size() > i2) {
            this.getHighSpeedVideoFpsRanges = org.bouncycastle.asn1.x509.Extensions.getInstance((org.bouncycastle.asn1.ASN1TaggedObject) aSN1Sequence.getObjectAt(i2), true);
        }
    }

    public ResponseData(org.bouncycastle.asn1.ASN1Integer aSN1Integer, org.bouncycastle.asn1.ocsp.ResponderID responderID, org.bouncycastle.asn1.ASN1GeneralizedTime aSN1GeneralizedTime, org.bouncycastle.asn1.ASN1Sequence aSN1Sequence, org.bouncycastle.asn1.x509.Extensions extensions) {
        this.getOutputFormats = aSN1Integer;
        this.Camera2StreamConfigurationMap = responderID;
        this.getHighResolutionOutputSizeshNQ4ISI = aSN1GeneralizedTime;
        this.getHighSpeedVideoFpsRangesFor = aSN1Sequence;
        this.getHighSpeedVideoFpsRanges = extensions;
    }
}
