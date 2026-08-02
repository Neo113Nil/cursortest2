package org.bouncycastle.asn1.tsp;

/* loaded from: classes17.dex */
public class TimeStampReq extends org.bouncycastle.asn1.ASN1Object {
    org.bouncycastle.asn1.ASN1ObjectIdentifier Camera2StreamConfigurationMap;
    org.bouncycastle.asn1.x509.Extensions getHighResolutionOutputSizeshNQ4ISI;
    org.bouncycastle.asn1.tsp.MessageImprint getHighSpeedVideoFpsRanges;
    org.bouncycastle.asn1.ASN1Integer getHighSpeedVideoFpsRangesFor;
    org.bouncycastle.asn1.ASN1Boolean getHighSpeedVideoSizes;
    org.bouncycastle.asn1.ASN1Integer getHighSpeedVideoSizesFor;

    private TimeStampReq(org.bouncycastle.asn1.ASN1Sequence aSN1Sequence) {
        int size = aSN1Sequence.size();
        this.getHighSpeedVideoSizesFor = org.bouncycastle.asn1.ASN1Integer.getInstance(aSN1Sequence.getObjectAt(0));
        this.getHighSpeedVideoFpsRanges = org.bouncycastle.asn1.tsp.MessageImprint.getInstance(aSN1Sequence.getObjectAt(1));
        for (int i = 2; i < size; i++) {
            if (aSN1Sequence.getObjectAt(i) instanceof org.bouncycastle.asn1.ASN1ObjectIdentifier) {
                if (this.Camera2StreamConfigurationMap != null || i > 2) {
                    throw new java.lang.IllegalArgumentException("badly placed optional in sequence");
                }
                this.Camera2StreamConfigurationMap = org.bouncycastle.asn1.ASN1ObjectIdentifier.getInstance(aSN1Sequence.getObjectAt(i));
            } else if (aSN1Sequence.getObjectAt(i) instanceof org.bouncycastle.asn1.ASN1Integer) {
                if (this.getHighSpeedVideoFpsRangesFor != null || i > 3) {
                    throw new java.lang.IllegalArgumentException("badly placed optional in sequence");
                }
                this.getHighSpeedVideoFpsRangesFor = org.bouncycastle.asn1.ASN1Integer.getInstance(aSN1Sequence.getObjectAt(i));
            } else if (aSN1Sequence.getObjectAt(i) instanceof org.bouncycastle.asn1.ASN1Boolean) {
                if (this.getHighSpeedVideoSizes != null || i > 4) {
                    throw new java.lang.IllegalArgumentException("badly placed optional in sequence");
                }
                this.getHighSpeedVideoSizes = org.bouncycastle.asn1.ASN1Boolean.getInstance(aSN1Sequence.getObjectAt(i));
            } else {
                if (!(aSN1Sequence.getObjectAt(i) instanceof org.bouncycastle.asn1.ASN1TaggedObject)) {
                    throw new java.lang.IllegalArgumentException("unidentified structure in sequence");
                }
                if (this.getHighResolutionOutputSizeshNQ4ISI != null || i > 5) {
                    throw new java.lang.IllegalArgumentException("badly placed optional in sequence");
                }
                org.bouncycastle.asn1.ASN1TaggedObject aSN1TaggedObject = (org.bouncycastle.asn1.ASN1TaggedObject) aSN1Sequence.getObjectAt(i);
                if (aSN1TaggedObject.getTagNo() == 0) {
                    this.getHighResolutionOutputSizeshNQ4ISI = org.bouncycastle.asn1.x509.Extensions.getInstance(aSN1TaggedObject, false);
                }
            }
        }
    }

    @Override // org.bouncycastle.asn1.ASN1Object, org.bouncycastle.asn1.ASN1Encodable
    public org.bouncycastle.asn1.ASN1Primitive toASN1Primitive() {
        org.bouncycastle.asn1.ASN1EncodableVector aSN1EncodableVector = new org.bouncycastle.asn1.ASN1EncodableVector(6);
        aSN1EncodableVector.add(this.getHighSpeedVideoSizesFor);
        aSN1EncodableVector.add(this.getHighSpeedVideoFpsRanges);
        org.bouncycastle.asn1.ASN1ObjectIdentifier aSN1ObjectIdentifier = this.Camera2StreamConfigurationMap;
        if (aSN1ObjectIdentifier != null) {
            aSN1EncodableVector.add(aSN1ObjectIdentifier);
        }
        org.bouncycastle.asn1.ASN1Integer aSN1Integer = this.getHighSpeedVideoFpsRangesFor;
        if (aSN1Integer != null) {
            aSN1EncodableVector.add(aSN1Integer);
        }
        org.bouncycastle.asn1.ASN1Boolean aSN1Boolean = this.getHighSpeedVideoSizes;
        if (aSN1Boolean != null && aSN1Boolean.isTrue()) {
            aSN1EncodableVector.add(this.getHighSpeedVideoSizes);
        }
        org.bouncycastle.asn1.x509.Extensions extensions = this.getHighResolutionOutputSizeshNQ4ISI;
        if (extensions != null) {
            aSN1EncodableVector.add(new org.bouncycastle.asn1.DERTaggedObject(false, 0, (org.bouncycastle.asn1.ASN1Encodable) extensions));
        }
        return new org.bouncycastle.asn1.DERSequence(aSN1EncodableVector);
    }

    public org.bouncycastle.asn1.ASN1Integer getVersion() {
        return this.getHighSpeedVideoSizesFor;
    }

    public org.bouncycastle.asn1.ASN1ObjectIdentifier getReqPolicy() {
        return this.Camera2StreamConfigurationMap;
    }

    public org.bouncycastle.asn1.ASN1Integer getNonce() {
        return this.getHighSpeedVideoFpsRangesFor;
    }

    public org.bouncycastle.asn1.tsp.MessageImprint getMessageImprint() {
        return this.getHighSpeedVideoFpsRanges;
    }

    public org.bouncycastle.asn1.x509.Extensions getExtensions() {
        return this.getHighResolutionOutputSizeshNQ4ISI;
    }

    public org.bouncycastle.asn1.ASN1Boolean getCertReq() {
        org.bouncycastle.asn1.ASN1Boolean aSN1Boolean = this.getHighSpeedVideoSizes;
        return aSN1Boolean == null ? org.bouncycastle.asn1.ASN1Boolean.FALSE : aSN1Boolean;
    }

    public static org.bouncycastle.asn1.tsp.TimeStampReq getInstance(java.lang.Object obj) {
        if (obj instanceof org.bouncycastle.asn1.tsp.TimeStampReq) {
            return (org.bouncycastle.asn1.tsp.TimeStampReq) obj;
        }
        if (obj != null) {
            return new org.bouncycastle.asn1.tsp.TimeStampReq(org.bouncycastle.asn1.ASN1Sequence.getInstance(obj));
        }
        return null;
    }

    public TimeStampReq(org.bouncycastle.asn1.tsp.MessageImprint messageImprint, org.bouncycastle.asn1.ASN1ObjectIdentifier aSN1ObjectIdentifier, org.bouncycastle.asn1.ASN1Integer aSN1Integer, org.bouncycastle.asn1.ASN1Boolean aSN1Boolean, org.bouncycastle.asn1.x509.Extensions extensions) {
        this.getHighSpeedVideoSizesFor = new org.bouncycastle.asn1.ASN1Integer(1L);
        this.getHighSpeedVideoFpsRanges = messageImprint;
        this.Camera2StreamConfigurationMap = aSN1ObjectIdentifier;
        this.getHighSpeedVideoFpsRangesFor = aSN1Integer;
        this.getHighSpeedVideoSizes = aSN1Boolean;
        this.getHighResolutionOutputSizeshNQ4ISI = extensions;
    }
}
