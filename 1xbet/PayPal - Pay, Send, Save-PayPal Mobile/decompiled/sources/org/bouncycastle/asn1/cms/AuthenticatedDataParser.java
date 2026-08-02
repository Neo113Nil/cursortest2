package org.bouncycastle.asn1.cms;

/* loaded from: classes17.dex */
public class AuthenticatedDataParser {
    private org.bouncycastle.asn1.ASN1Integer Camera2StreamConfigurationMap;
    private boolean getHighResolutionOutputSizeshNQ4ISI;
    private org.bouncycastle.asn1.ASN1SequenceParser getHighSpeedVideoFpsRanges;
    private org.bouncycastle.asn1.ASN1Encodable getHighSpeedVideoFpsRangesFor;

    public org.bouncycastle.asn1.ASN1Integer getVersion() {
        return this.Camera2StreamConfigurationMap;
    }

    public org.bouncycastle.asn1.ASN1SetParser getUnauthAttrs() throws java.io.IOException {
        if (this.getHighSpeedVideoFpsRangesFor == null) {
            this.getHighSpeedVideoFpsRangesFor = this.getHighSpeedVideoFpsRanges.readObject();
        }
        org.bouncycastle.asn1.ASN1Encodable aSN1Encodable = this.getHighSpeedVideoFpsRangesFor;
        if (aSN1Encodable == null) {
            return null;
        }
        this.getHighSpeedVideoFpsRangesFor = null;
        return (org.bouncycastle.asn1.ASN1SetParser) org.bouncycastle.asn1.ASN1Util.parseContextBaseUniversal((org.bouncycastle.asn1.ASN1TaggedObject) aSN1Encodable, 3, false, 17);
    }

    public org.bouncycastle.asn1.ASN1SetParser getRecipientInfos() throws java.io.IOException {
        if (!this.getHighResolutionOutputSizeshNQ4ISI) {
            getOriginatorInfo();
        }
        if (this.getHighSpeedVideoFpsRangesFor == null) {
            this.getHighSpeedVideoFpsRangesFor = this.getHighSpeedVideoFpsRanges.readObject();
        }
        org.bouncycastle.asn1.ASN1SetParser aSN1SetParser = (org.bouncycastle.asn1.ASN1SetParser) this.getHighSpeedVideoFpsRangesFor;
        this.getHighSpeedVideoFpsRangesFor = null;
        return aSN1SetParser;
    }

    public org.bouncycastle.asn1.cms.OriginatorInfo getOriginatorInfo() throws java.io.IOException {
        this.getHighResolutionOutputSizeshNQ4ISI = true;
        if (this.getHighSpeedVideoFpsRangesFor == null) {
            this.getHighSpeedVideoFpsRangesFor = this.getHighSpeedVideoFpsRanges.readObject();
        }
        org.bouncycastle.asn1.ASN1Encodable aSN1Encodable = this.getHighSpeedVideoFpsRangesFor;
        if (aSN1Encodable instanceof org.bouncycastle.asn1.ASN1TaggedObjectParser) {
            org.bouncycastle.asn1.ASN1TaggedObjectParser aSN1TaggedObjectParser = (org.bouncycastle.asn1.ASN1TaggedObjectParser) aSN1Encodable;
            if (aSN1TaggedObjectParser.hasContextTag(0)) {
                org.bouncycastle.asn1.ASN1SequenceParser aSN1SequenceParser = (org.bouncycastle.asn1.ASN1SequenceParser) aSN1TaggedObjectParser.parseBaseUniversal(false, 16);
                this.getHighSpeedVideoFpsRangesFor = null;
                return org.bouncycastle.asn1.cms.OriginatorInfo.getInstance(aSN1SequenceParser.getLoadedObject());
            }
        }
        return null;
    }

    public org.bouncycastle.asn1.x509.AlgorithmIdentifier getMacAlgorithm() throws java.io.IOException {
        if (this.getHighSpeedVideoFpsRangesFor == null) {
            this.getHighSpeedVideoFpsRangesFor = this.getHighSpeedVideoFpsRanges.readObject();
        }
        org.bouncycastle.asn1.ASN1Encodable aSN1Encodable = this.getHighSpeedVideoFpsRangesFor;
        if (aSN1Encodable == null) {
            return null;
        }
        this.getHighSpeedVideoFpsRangesFor = null;
        return org.bouncycastle.asn1.x509.AlgorithmIdentifier.getInstance(((org.bouncycastle.asn1.ASN1SequenceParser) aSN1Encodable).toASN1Primitive());
    }

    public org.bouncycastle.asn1.ASN1OctetString getMac() throws java.io.IOException {
        if (this.getHighSpeedVideoFpsRangesFor == null) {
            this.getHighSpeedVideoFpsRangesFor = this.getHighSpeedVideoFpsRanges.readObject();
        }
        org.bouncycastle.asn1.ASN1Encodable aSN1Encodable = this.getHighSpeedVideoFpsRangesFor;
        this.getHighSpeedVideoFpsRangesFor = null;
        return org.bouncycastle.asn1.ASN1OctetString.getInstance(aSN1Encodable.toASN1Primitive());
    }

    public org.bouncycastle.asn1.cms.ContentInfoParser getEncapsulatedContentInfo() throws java.io.IOException {
        if (this.getHighSpeedVideoFpsRangesFor == null) {
            this.getHighSpeedVideoFpsRangesFor = this.getHighSpeedVideoFpsRanges.readObject();
        }
        org.bouncycastle.asn1.ASN1Encodable aSN1Encodable = this.getHighSpeedVideoFpsRangesFor;
        if (aSN1Encodable == null) {
            return null;
        }
        this.getHighSpeedVideoFpsRangesFor = null;
        return new org.bouncycastle.asn1.cms.ContentInfoParser((org.bouncycastle.asn1.ASN1SequenceParser) aSN1Encodable);
    }

    public org.bouncycastle.asn1.x509.AlgorithmIdentifier getDigestAlgorithm() throws java.io.IOException {
        if (this.getHighSpeedVideoFpsRangesFor == null) {
            this.getHighSpeedVideoFpsRangesFor = this.getHighSpeedVideoFpsRanges.readObject();
        }
        org.bouncycastle.asn1.ASN1Encodable aSN1Encodable = this.getHighSpeedVideoFpsRangesFor;
        if (!(aSN1Encodable instanceof org.bouncycastle.asn1.ASN1TaggedObjectParser)) {
            return null;
        }
        org.bouncycastle.asn1.x509.AlgorithmIdentifier algorithmIdentifier = org.bouncycastle.asn1.x509.AlgorithmIdentifier.getInstance((org.bouncycastle.asn1.ASN1TaggedObject) aSN1Encodable.toASN1Primitive(), false);
        this.getHighSpeedVideoFpsRangesFor = null;
        return algorithmIdentifier;
    }

    public org.bouncycastle.asn1.ASN1SetParser getAuthAttrs() throws java.io.IOException {
        if (this.getHighSpeedVideoFpsRangesFor == null) {
            this.getHighSpeedVideoFpsRangesFor = this.getHighSpeedVideoFpsRanges.readObject();
        }
        org.bouncycastle.asn1.ASN1Encodable aSN1Encodable = this.getHighSpeedVideoFpsRangesFor;
        if (!(aSN1Encodable instanceof org.bouncycastle.asn1.ASN1TaggedObjectParser)) {
            return null;
        }
        this.getHighSpeedVideoFpsRangesFor = null;
        return (org.bouncycastle.asn1.ASN1SetParser) org.bouncycastle.asn1.ASN1Util.parseContextBaseUniversal((org.bouncycastle.asn1.ASN1TaggedObjectParser) aSN1Encodable, 2, false, 17);
    }

    public AuthenticatedDataParser(org.bouncycastle.asn1.ASN1SequenceParser aSN1SequenceParser) throws java.io.IOException {
        this.getHighSpeedVideoFpsRanges = aSN1SequenceParser;
        this.Camera2StreamConfigurationMap = org.bouncycastle.asn1.ASN1Integer.getInstance(aSN1SequenceParser.readObject());
    }
}
