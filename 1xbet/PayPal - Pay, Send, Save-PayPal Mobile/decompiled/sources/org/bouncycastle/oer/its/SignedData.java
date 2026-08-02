package org.bouncycastle.oer.its;

/* loaded from: classes17.dex */
public class SignedData extends org.bouncycastle.asn1.ASN1Object {
    private final org.bouncycastle.oer.its.Signature Camera2StreamConfigurationMap;
    private final org.bouncycastle.oer.its.HashAlgorithm getHighResolutionOutputSizeshNQ4ISI;
    private final org.bouncycastle.oer.its.SignerIdentifier getHighSpeedVideoFpsRangesFor;
    private final org.bouncycastle.oer.its.ToBeSignedData getHighSpeedVideoSizes;

    @Override // org.bouncycastle.asn1.ASN1Object, org.bouncycastle.asn1.ASN1Encodable
    public org.bouncycastle.asn1.ASN1Primitive toASN1Primitive() {
        return org.bouncycastle.oer.its.Utils.getHighSpeedVideoSizes(this.getHighResolutionOutputSizeshNQ4ISI, this.getHighSpeedVideoSizes, this.getHighSpeedVideoFpsRangesFor, this.Camera2StreamConfigurationMap);
    }

    public class Builder {
        private org.bouncycastle.oer.its.HashAlgorithm Camera2StreamConfigurationMap;
        private org.bouncycastle.oer.its.SignerIdentifier getHighResolutionOutputSizeshNQ4ISI;
        private org.bouncycastle.oer.its.ToBeSignedData getHighSpeedVideoFpsRanges;
        private org.bouncycastle.oer.its.Signature getHighSpeedVideoSizes;

        public org.bouncycastle.oer.its.SignedData.Builder setTbsData(org.bouncycastle.oer.its.ToBeSignedData toBeSignedData) {
            this.getHighSpeedVideoFpsRanges = toBeSignedData;
            return this;
        }

        public org.bouncycastle.oer.its.SignedData.Builder setSigner(org.bouncycastle.oer.its.SignerIdentifier signerIdentifier) {
            this.getHighResolutionOutputSizeshNQ4ISI = signerIdentifier;
            return this;
        }

        public org.bouncycastle.oer.its.SignedData.Builder setSignature(org.bouncycastle.oer.its.Signature signature) {
            this.getHighSpeedVideoSizes = signature;
            return this;
        }

        public org.bouncycastle.oer.its.SignedData.Builder setHashId(org.bouncycastle.oer.its.HashAlgorithm hashAlgorithm) {
            this.Camera2StreamConfigurationMap = hashAlgorithm;
            return this;
        }

        public org.bouncycastle.oer.its.SignedData build() {
            return new org.bouncycastle.oer.its.SignedData(this.Camera2StreamConfigurationMap, this.getHighSpeedVideoFpsRanges, this.getHighResolutionOutputSizeshNQ4ISI, this.getHighSpeedVideoSizes);
        }

        public Builder() {
        }
    }

    public org.bouncycastle.oer.its.ToBeSignedData getTbsData() {
        return this.getHighSpeedVideoSizes;
    }

    public org.bouncycastle.oer.its.SignerIdentifier getSigner() {
        return this.getHighSpeedVideoFpsRangesFor;
    }

    public org.bouncycastle.oer.its.Signature getSignature() {
        return this.Camera2StreamConfigurationMap;
    }

    public org.bouncycastle.oer.its.HashAlgorithm getHashId() {
        return this.getHighResolutionOutputSizeshNQ4ISI;
    }

    public org.bouncycastle.oer.its.SignedData.Builder builder() {
        return new org.bouncycastle.oer.its.SignedData.Builder();
    }

    public static org.bouncycastle.oer.its.SignedData getInstance(java.lang.Object obj) {
        if (obj instanceof org.bouncycastle.oer.its.SignedData) {
            return (org.bouncycastle.oer.its.SignedData) obj;
        }
        java.util.Iterator<org.bouncycastle.asn1.ASN1Encodable> it = org.bouncycastle.asn1.ASN1Sequence.getInstance(obj).iterator();
        return new org.bouncycastle.oer.its.SignedData(org.bouncycastle.oer.its.HashAlgorithm.getInstance(it.next()), org.bouncycastle.oer.its.ToBeSignedData.getInstance(it.next()), org.bouncycastle.oer.its.SignerIdentifier.getInstance(it.next()), org.bouncycastle.oer.its.Signature.getInstance(it.next()));
    }

    public SignedData(org.bouncycastle.oer.its.HashAlgorithm hashAlgorithm, org.bouncycastle.oer.its.ToBeSignedData toBeSignedData, org.bouncycastle.oer.its.SignerIdentifier signerIdentifier, org.bouncycastle.oer.its.Signature signature) {
        this.getHighResolutionOutputSizeshNQ4ISI = hashAlgorithm;
        this.getHighSpeedVideoSizes = toBeSignedData;
        this.getHighSpeedVideoFpsRangesFor = signerIdentifier;
        this.Camera2StreamConfigurationMap = signature;
    }
}
