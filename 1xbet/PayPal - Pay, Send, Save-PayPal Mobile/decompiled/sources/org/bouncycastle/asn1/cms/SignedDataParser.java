package org.bouncycastle.asn1.cms;

/* loaded from: classes17.dex */
public class SignedDataParser {
    private boolean Camera2StreamConfigurationMap;
    private java.lang.Object getHighResolutionOutputSizeshNQ4ISI;
    private boolean getHighSpeedVideoFpsRanges;
    private org.bouncycastle.asn1.ASN1SequenceParser getHighSpeedVideoFpsRangesFor;
    private org.bouncycastle.asn1.ASN1Integer getHighSpeedVideoSizes;

    public org.bouncycastle.asn1.ASN1Integer getVersion() {
        return this.getHighSpeedVideoSizes;
    }

    public org.bouncycastle.asn1.ASN1SetParser getSignerInfos() throws java.io.IOException {
        if (!this.getHighSpeedVideoFpsRanges || !this.Camera2StreamConfigurationMap) {
            throw new java.io.IOException("getCerts() and/or getCrls() has not been called.");
        }
        if (this.getHighResolutionOutputSizeshNQ4ISI == null) {
            this.getHighResolutionOutputSizeshNQ4ISI = this.getHighSpeedVideoFpsRangesFor.readObject();
        }
        return (org.bouncycastle.asn1.ASN1SetParser) this.getHighResolutionOutputSizeshNQ4ISI;
    }

    public org.bouncycastle.asn1.cms.ContentInfoParser getEncapContentInfo() throws java.io.IOException {
        return new org.bouncycastle.asn1.cms.ContentInfoParser((org.bouncycastle.asn1.ASN1SequenceParser) this.getHighSpeedVideoFpsRangesFor.readObject());
    }

    public org.bouncycastle.asn1.ASN1SetParser getDigestAlgorithms() throws java.io.IOException {
        org.bouncycastle.asn1.ASN1Encodable readObject = this.getHighSpeedVideoFpsRangesFor.readObject();
        return readObject instanceof org.bouncycastle.asn1.ASN1Set ? ((org.bouncycastle.asn1.ASN1Set) readObject).parser() : (org.bouncycastle.asn1.ASN1SetParser) readObject;
    }

    public org.bouncycastle.asn1.ASN1SetParser getCrls() throws java.io.IOException {
        if (!this.getHighSpeedVideoFpsRanges) {
            throw new java.io.IOException("getCerts() has not been called.");
        }
        this.Camera2StreamConfigurationMap = true;
        if (this.getHighResolutionOutputSizeshNQ4ISI == null) {
            this.getHighResolutionOutputSizeshNQ4ISI = this.getHighSpeedVideoFpsRangesFor.readObject();
        }
        java.lang.Object obj = this.getHighResolutionOutputSizeshNQ4ISI;
        if (obj instanceof org.bouncycastle.asn1.ASN1TaggedObjectParser) {
            org.bouncycastle.asn1.ASN1TaggedObjectParser aSN1TaggedObjectParser = (org.bouncycastle.asn1.ASN1TaggedObjectParser) obj;
            if (aSN1TaggedObjectParser.hasContextTag(1)) {
                org.bouncycastle.asn1.ASN1SetParser aSN1SetParser = (org.bouncycastle.asn1.ASN1SetParser) aSN1TaggedObjectParser.parseBaseUniversal(false, 17);
                this.getHighResolutionOutputSizeshNQ4ISI = null;
                return aSN1SetParser;
            }
        }
        return null;
    }

    public org.bouncycastle.asn1.ASN1SetParser getCertificates() throws java.io.IOException {
        this.getHighSpeedVideoFpsRanges = true;
        org.bouncycastle.asn1.ASN1Encodable readObject = this.getHighSpeedVideoFpsRangesFor.readObject();
        this.getHighResolutionOutputSizeshNQ4ISI = readObject;
        if (readObject instanceof org.bouncycastle.asn1.ASN1TaggedObjectParser) {
            org.bouncycastle.asn1.ASN1TaggedObjectParser aSN1TaggedObjectParser = (org.bouncycastle.asn1.ASN1TaggedObjectParser) readObject;
            if (aSN1TaggedObjectParser.hasContextTag(0)) {
                org.bouncycastle.asn1.ASN1SetParser aSN1SetParser = (org.bouncycastle.asn1.ASN1SetParser) aSN1TaggedObjectParser.parseBaseUniversal(false, 17);
                this.getHighResolutionOutputSizeshNQ4ISI = null;
                return aSN1SetParser;
            }
        }
        return null;
    }

    public static org.bouncycastle.asn1.cms.SignedDataParser getInstance(java.lang.Object obj) throws java.io.IOException {
        if (obj instanceof org.bouncycastle.asn1.ASN1Sequence) {
            return new org.bouncycastle.asn1.cms.SignedDataParser(((org.bouncycastle.asn1.ASN1Sequence) obj).parser());
        }
        if (obj instanceof org.bouncycastle.asn1.ASN1SequenceParser) {
            return new org.bouncycastle.asn1.cms.SignedDataParser((org.bouncycastle.asn1.ASN1SequenceParser) obj);
        }
        java.lang.StringBuilder sb = new java.lang.StringBuilder("unknown object encountered: ");
        sb.append(obj.getClass().getName());
        throw new java.io.IOException(sb.toString());
    }

    private SignedDataParser(org.bouncycastle.asn1.ASN1SequenceParser aSN1SequenceParser) throws java.io.IOException {
        this.getHighSpeedVideoFpsRangesFor = aSN1SequenceParser;
        this.getHighSpeedVideoSizes = (org.bouncycastle.asn1.ASN1Integer) aSN1SequenceParser.readObject();
    }
}
