package org.bouncycastle.asn1.tsp;

/* loaded from: classes17.dex */
public class TSTInfo extends org.bouncycastle.asn1.ASN1Object {
    private org.bouncycastle.asn1.x509.Extensions Camera2StreamConfigurationMap;
    private org.bouncycastle.asn1.tsp.Accuracy getHighResolutionOutputSizeshNQ4ISI;
    private org.bouncycastle.asn1.ASN1Integer getHighSpeedVideoFpsRanges;
    private org.bouncycastle.asn1.ASN1GeneralizedTime getHighSpeedVideoFpsRangesFor;
    private org.bouncycastle.asn1.tsp.MessageImprint getHighSpeedVideoSizes;
    private org.bouncycastle.asn1.ASN1Integer getHighSpeedVideoSizesFor;
    private org.bouncycastle.asn1.ASN1Integer getInputFormats;
    private org.bouncycastle.asn1.x509.GeneralName getInputSizeshNQ4ISI;
    private org.bouncycastle.asn1.ASN1ObjectIdentifier getOutputFormats;
    private org.bouncycastle.asn1.ASN1Boolean getOutputMinFrameDuration;

    @Override // org.bouncycastle.asn1.ASN1Object, org.bouncycastle.asn1.ASN1Encodable
    public org.bouncycastle.asn1.ASN1Primitive toASN1Primitive() {
        org.bouncycastle.asn1.ASN1EncodableVector aSN1EncodableVector = new org.bouncycastle.asn1.ASN1EncodableVector(10);
        aSN1EncodableVector.add(this.getHighSpeedVideoSizesFor);
        aSN1EncodableVector.add(this.getOutputFormats);
        aSN1EncodableVector.add(this.getHighSpeedVideoSizes);
        aSN1EncodableVector.add(this.getInputFormats);
        aSN1EncodableVector.add(this.getHighSpeedVideoFpsRangesFor);
        org.bouncycastle.asn1.tsp.Accuracy accuracy = this.getHighResolutionOutputSizeshNQ4ISI;
        if (accuracy != null) {
            aSN1EncodableVector.add(accuracy);
        }
        org.bouncycastle.asn1.ASN1Boolean aSN1Boolean = this.getOutputMinFrameDuration;
        if (aSN1Boolean != null && aSN1Boolean.isTrue()) {
            aSN1EncodableVector.add(this.getOutputMinFrameDuration);
        }
        org.bouncycastle.asn1.ASN1Integer aSN1Integer = this.getHighSpeedVideoFpsRanges;
        if (aSN1Integer != null) {
            aSN1EncodableVector.add(aSN1Integer);
        }
        org.bouncycastle.asn1.x509.GeneralName generalName = this.getInputSizeshNQ4ISI;
        if (generalName != null) {
            aSN1EncodableVector.add(new org.bouncycastle.asn1.DERTaggedObject(true, 0, (org.bouncycastle.asn1.ASN1Encodable) generalName));
        }
        org.bouncycastle.asn1.x509.Extensions extensions = this.Camera2StreamConfigurationMap;
        if (extensions != null) {
            aSN1EncodableVector.add(new org.bouncycastle.asn1.DERTaggedObject(false, 1, (org.bouncycastle.asn1.ASN1Encodable) extensions));
        }
        return new org.bouncycastle.asn1.DERSequence(aSN1EncodableVector);
    }

    public org.bouncycastle.asn1.ASN1Integer getVersion() {
        return this.getHighSpeedVideoSizesFor;
    }

    public org.bouncycastle.asn1.x509.GeneralName getTsa() {
        return this.getInputSizeshNQ4ISI;
    }

    public org.bouncycastle.asn1.ASN1Integer getSerialNumber() {
        return this.getInputFormats;
    }

    public org.bouncycastle.asn1.ASN1ObjectIdentifier getPolicy() {
        return this.getOutputFormats;
    }

    public org.bouncycastle.asn1.ASN1Boolean getOrdering() {
        return this.getOutputMinFrameDuration;
    }

    public org.bouncycastle.asn1.ASN1Integer getNonce() {
        return this.getHighSpeedVideoFpsRanges;
    }

    public org.bouncycastle.asn1.tsp.MessageImprint getMessageImprint() {
        return this.getHighSpeedVideoSizes;
    }

    public org.bouncycastle.asn1.ASN1GeneralizedTime getGenTime() {
        return this.getHighSpeedVideoFpsRangesFor;
    }

    public org.bouncycastle.asn1.x509.Extensions getExtensions() {
        return this.Camera2StreamConfigurationMap;
    }

    public org.bouncycastle.asn1.tsp.Accuracy getAccuracy() {
        return this.getHighResolutionOutputSizeshNQ4ISI;
    }

    public static org.bouncycastle.asn1.tsp.TSTInfo getInstance(java.lang.Object obj) {
        if (obj instanceof org.bouncycastle.asn1.tsp.TSTInfo) {
            return (org.bouncycastle.asn1.tsp.TSTInfo) obj;
        }
        if (obj != null) {
            return new org.bouncycastle.asn1.tsp.TSTInfo(org.bouncycastle.asn1.ASN1Sequence.getInstance(obj));
        }
        return null;
    }

    private TSTInfo(org.bouncycastle.asn1.ASN1Sequence aSN1Sequence) {
        org.bouncycastle.asn1.ASN1Object aSN1Object;
        java.util.Enumeration objects = aSN1Sequence.getObjects();
        this.getHighSpeedVideoSizesFor = org.bouncycastle.asn1.ASN1Integer.getInstance(objects.nextElement());
        this.getOutputFormats = org.bouncycastle.asn1.ASN1ObjectIdentifier.getInstance(objects.nextElement());
        this.getHighSpeedVideoSizes = org.bouncycastle.asn1.tsp.MessageImprint.getInstance(objects.nextElement());
        this.getInputFormats = org.bouncycastle.asn1.ASN1Integer.getInstance(objects.nextElement());
        this.getHighSpeedVideoFpsRangesFor = org.bouncycastle.asn1.ASN1GeneralizedTime.getInstance(objects.nextElement());
        org.bouncycastle.asn1.ASN1Boolean aSN1Boolean = org.bouncycastle.asn1.ASN1Boolean.getInstance(false);
        while (true) {
            this.getOutputMinFrameDuration = aSN1Boolean;
            while (objects.hasMoreElements()) {
                aSN1Object = (org.bouncycastle.asn1.ASN1Object) objects.nextElement();
                if (aSN1Object instanceof org.bouncycastle.asn1.ASN1TaggedObject) {
                    org.bouncycastle.asn1.ASN1TaggedObject aSN1TaggedObject = (org.bouncycastle.asn1.ASN1TaggedObject) aSN1Object;
                    int tagNo = aSN1TaggedObject.getTagNo();
                    if (tagNo == 0) {
                        this.getInputSizeshNQ4ISI = org.bouncycastle.asn1.x509.GeneralName.getInstance(aSN1TaggedObject, true);
                    } else {
                        if (tagNo != 1) {
                            java.lang.StringBuilder sb = new java.lang.StringBuilder("Unknown tag value ");
                            sb.append(aSN1TaggedObject.getTagNo());
                            throw new java.lang.IllegalArgumentException(sb.toString());
                        }
                        this.Camera2StreamConfigurationMap = org.bouncycastle.asn1.x509.Extensions.getInstance(aSN1TaggedObject, false);
                    }
                } else if ((aSN1Object instanceof org.bouncycastle.asn1.ASN1Sequence) || (aSN1Object instanceof org.bouncycastle.asn1.tsp.Accuracy)) {
                    this.getHighResolutionOutputSizeshNQ4ISI = org.bouncycastle.asn1.tsp.Accuracy.getInstance(aSN1Object);
                } else if (aSN1Object instanceof org.bouncycastle.asn1.ASN1Boolean) {
                    break;
                } else if (aSN1Object instanceof org.bouncycastle.asn1.ASN1Integer) {
                    this.getHighSpeedVideoFpsRanges = org.bouncycastle.asn1.ASN1Integer.getInstance(aSN1Object);
                }
            }
            return;
            aSN1Boolean = org.bouncycastle.asn1.ASN1Boolean.getInstance(aSN1Object);
        }
    }

    public TSTInfo(org.bouncycastle.asn1.ASN1ObjectIdentifier aSN1ObjectIdentifier, org.bouncycastle.asn1.tsp.MessageImprint messageImprint, org.bouncycastle.asn1.ASN1Integer aSN1Integer, org.bouncycastle.asn1.ASN1GeneralizedTime aSN1GeneralizedTime, org.bouncycastle.asn1.tsp.Accuracy accuracy, org.bouncycastle.asn1.ASN1Boolean aSN1Boolean, org.bouncycastle.asn1.ASN1Integer aSN1Integer2, org.bouncycastle.asn1.x509.GeneralName generalName, org.bouncycastle.asn1.x509.Extensions extensions) {
        this.getHighSpeedVideoSizesFor = new org.bouncycastle.asn1.ASN1Integer(1L);
        this.getOutputFormats = aSN1ObjectIdentifier;
        this.getHighSpeedVideoSizes = messageImprint;
        this.getInputFormats = aSN1Integer;
        this.getHighSpeedVideoFpsRangesFor = aSN1GeneralizedTime;
        this.getHighResolutionOutputSizeshNQ4ISI = accuracy;
        this.getOutputMinFrameDuration = aSN1Boolean;
        this.getHighSpeedVideoFpsRanges = aSN1Integer2;
        this.getInputSizeshNQ4ISI = generalName;
        this.Camera2StreamConfigurationMap = extensions;
    }
}
