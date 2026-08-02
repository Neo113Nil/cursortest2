package org.bouncycastle.asn1.ocsp;

/* loaded from: classes17.dex */
public class TBSRequest extends org.bouncycastle.asn1.ASN1Object {
    private static final org.bouncycastle.asn1.ASN1Integer getInputSizeshNQ4ISI = new org.bouncycastle.asn1.ASN1Integer(0);
    org.bouncycastle.asn1.ASN1Sequence Camera2StreamConfigurationMap;
    org.bouncycastle.asn1.x509.Extensions getHighResolutionOutputSizeshNQ4ISI;
    org.bouncycastle.asn1.ASN1Integer getHighSpeedVideoFpsRanges;
    boolean getHighSpeedVideoFpsRangesFor;
    org.bouncycastle.asn1.x509.GeneralName getHighSpeedVideoSizes;

    @Override // org.bouncycastle.asn1.ASN1Object, org.bouncycastle.asn1.ASN1Encodable
    public org.bouncycastle.asn1.ASN1Primitive toASN1Primitive() {
        org.bouncycastle.asn1.ASN1EncodableVector aSN1EncodableVector = new org.bouncycastle.asn1.ASN1EncodableVector(4);
        if (!this.getHighSpeedVideoFpsRanges.equals((org.bouncycastle.asn1.ASN1Primitive) getInputSizeshNQ4ISI) || this.getHighSpeedVideoFpsRangesFor) {
            aSN1EncodableVector.add(new org.bouncycastle.asn1.DERTaggedObject(true, 0, (org.bouncycastle.asn1.ASN1Encodable) this.getHighSpeedVideoFpsRanges));
        }
        org.bouncycastle.asn1.x509.GeneralName generalName = this.getHighSpeedVideoSizes;
        if (generalName != null) {
            aSN1EncodableVector.add(new org.bouncycastle.asn1.DERTaggedObject(true, 1, (org.bouncycastle.asn1.ASN1Encodable) generalName));
        }
        aSN1EncodableVector.add(this.Camera2StreamConfigurationMap);
        org.bouncycastle.asn1.x509.Extensions extensions = this.getHighResolutionOutputSizeshNQ4ISI;
        if (extensions != null) {
            aSN1EncodableVector.add(new org.bouncycastle.asn1.DERTaggedObject(true, 2, (org.bouncycastle.asn1.ASN1Encodable) extensions));
        }
        return new org.bouncycastle.asn1.DERSequence(aSN1EncodableVector);
    }

    public org.bouncycastle.asn1.ASN1Integer getVersion() {
        return this.getHighSpeedVideoFpsRanges;
    }

    public org.bouncycastle.asn1.x509.GeneralName getRequestorName() {
        return this.getHighSpeedVideoSizes;
    }

    public org.bouncycastle.asn1.ASN1Sequence getRequestList() {
        return this.Camera2StreamConfigurationMap;
    }

    public org.bouncycastle.asn1.x509.Extensions getRequestExtensions() {
        return this.getHighResolutionOutputSizeshNQ4ISI;
    }

    public static org.bouncycastle.asn1.ocsp.TBSRequest getInstance(org.bouncycastle.asn1.ASN1TaggedObject aSN1TaggedObject, boolean z) {
        return getInstance(org.bouncycastle.asn1.ASN1Sequence.getInstance(aSN1TaggedObject, z));
    }

    public static org.bouncycastle.asn1.ocsp.TBSRequest getInstance(java.lang.Object obj) {
        if (obj instanceof org.bouncycastle.asn1.ocsp.TBSRequest) {
            return (org.bouncycastle.asn1.ocsp.TBSRequest) obj;
        }
        if (obj != null) {
            return new org.bouncycastle.asn1.ocsp.TBSRequest(org.bouncycastle.asn1.ASN1Sequence.getInstance(obj));
        }
        return null;
    }

    public TBSRequest(org.bouncycastle.asn1.x509.GeneralName generalName, org.bouncycastle.asn1.ASN1Sequence aSN1Sequence, org.bouncycastle.asn1.x509.X509Extensions x509Extensions) {
        this.getHighSpeedVideoFpsRanges = getInputSizeshNQ4ISI;
        this.getHighSpeedVideoSizes = generalName;
        this.Camera2StreamConfigurationMap = aSN1Sequence;
        this.getHighResolutionOutputSizeshNQ4ISI = org.bouncycastle.asn1.x509.Extensions.getInstance(x509Extensions);
    }

    public TBSRequest(org.bouncycastle.asn1.x509.GeneralName generalName, org.bouncycastle.asn1.ASN1Sequence aSN1Sequence, org.bouncycastle.asn1.x509.Extensions extensions) {
        this.getHighSpeedVideoFpsRanges = getInputSizeshNQ4ISI;
        this.getHighSpeedVideoSizes = generalName;
        this.Camera2StreamConfigurationMap = aSN1Sequence;
        this.getHighResolutionOutputSizeshNQ4ISI = extensions;
    }

    private TBSRequest(org.bouncycastle.asn1.ASN1Sequence aSN1Sequence) {
        int i = 0;
        if ((aSN1Sequence.getObjectAt(0) instanceof org.bouncycastle.asn1.ASN1TaggedObject) && ((org.bouncycastle.asn1.ASN1TaggedObject) aSN1Sequence.getObjectAt(0)).getTagNo() == 0) {
            this.getHighSpeedVideoFpsRangesFor = true;
            this.getHighSpeedVideoFpsRanges = org.bouncycastle.asn1.ASN1Integer.getInstance((org.bouncycastle.asn1.ASN1TaggedObject) aSN1Sequence.getObjectAt(0), true);
            i = 1;
        } else {
            this.getHighSpeedVideoFpsRanges = getInputSizeshNQ4ISI;
        }
        if (aSN1Sequence.getObjectAt(i) instanceof org.bouncycastle.asn1.ASN1TaggedObject) {
            this.getHighSpeedVideoSizes = org.bouncycastle.asn1.x509.GeneralName.getInstance((org.bouncycastle.asn1.ASN1TaggedObject) aSN1Sequence.getObjectAt(i), true);
            i++;
        }
        this.Camera2StreamConfigurationMap = (org.bouncycastle.asn1.ASN1Sequence) aSN1Sequence.getObjectAt(i);
        if (aSN1Sequence.size() == i + 2) {
            this.getHighResolutionOutputSizeshNQ4ISI = org.bouncycastle.asn1.x509.Extensions.getInstance((org.bouncycastle.asn1.ASN1TaggedObject) aSN1Sequence.getObjectAt(i + 1), true);
        }
    }
}
