package org.bouncycastle.asn1;

/* loaded from: classes17.dex */
class DLTaggedObjectParser extends org.bouncycastle.asn1.BERTaggedObjectParser {
    private final boolean getHighResolutionOutputSizeshNQ4ISI;

    @Override // org.bouncycastle.asn1.BERTaggedObjectParser, org.bouncycastle.asn1.InMemoryRepresentable
    public org.bouncycastle.asn1.ASN1Primitive getLoadedObject() throws java.io.IOException {
        org.bouncycastle.asn1.ASN1StreamParser aSN1StreamParser = this.getHighSpeedVideoFpsRangesFor;
        int i = this.Camera2StreamConfigurationMap;
        int i2 = this.getHighSpeedVideoFpsRanges;
        return !this.getHighResolutionOutputSizeshNQ4ISI ? org.bouncycastle.asn1.ASN1TaggedObject.getHighResolutionOutputSizeshNQ4ISI(i, i2, ((org.bouncycastle.asn1.DefiniteLengthInputStream) aSN1StreamParser.getHighSpeedVideoFpsRanges).getHighSpeedVideoFpsRanges()) : org.bouncycastle.asn1.ASN1TaggedObject.Camera2StreamConfigurationMap(i, i2, aSN1StreamParser.getHighResolutionOutputSizeshNQ4ISI());
    }

    @Override // org.bouncycastle.asn1.BERTaggedObjectParser, org.bouncycastle.asn1.ASN1TaggedObjectParser
    public org.bouncycastle.asn1.ASN1Encodable parseBaseUniversal(boolean z, int i) throws java.io.IOException {
        if (z) {
            if (this.getHighResolutionOutputSizeshNQ4ISI) {
                return this.getHighSpeedVideoFpsRangesFor.getHighResolutionOutputSizeshNQ4ISI(i);
            }
            throw new java.io.IOException("Explicit tags must be constructed (see X.690 8.14.2)");
        }
        if (this.getHighResolutionOutputSizeshNQ4ISI) {
            return this.getHighSpeedVideoFpsRangesFor.getHighSpeedVideoFpsRangesFor(i);
        }
        org.bouncycastle.asn1.ASN1StreamParser aSN1StreamParser = this.getHighSpeedVideoFpsRangesFor;
        return aSN1StreamParser.getHighSpeedVideoFpsRangesFor(i, (org.bouncycastle.asn1.DefiniteLengthInputStream) aSN1StreamParser.getHighSpeedVideoFpsRanges);
    }

    @Override // org.bouncycastle.asn1.BERTaggedObjectParser, org.bouncycastle.asn1.ASN1TaggedObjectParser
    public org.bouncycastle.asn1.ASN1TaggedObjectParser parseImplicitBaseTagged(int i, int i2) throws java.io.IOException {
        if (64 != i) {
            return new org.bouncycastle.asn1.DLTaggedObjectParser(i, i2, this.getHighResolutionOutputSizeshNQ4ISI, this.getHighSpeedVideoFpsRangesFor);
        }
        org.bouncycastle.asn1.ASN1StreamParser aSN1StreamParser = this.getHighSpeedVideoFpsRangesFor;
        return (org.bouncycastle.asn1.DLApplicationSpecific) (!this.getHighResolutionOutputSizeshNQ4ISI ? org.bouncycastle.asn1.ASN1TaggedObject.getHighResolutionOutputSizeshNQ4ISI(i, i2, ((org.bouncycastle.asn1.DefiniteLengthInputStream) aSN1StreamParser.getHighSpeedVideoFpsRanges).getHighSpeedVideoFpsRanges()) : org.bouncycastle.asn1.ASN1TaggedObject.Camera2StreamConfigurationMap(i, i2, aSN1StreamParser.getHighResolutionOutputSizeshNQ4ISI()));
    }

    @Override // org.bouncycastle.asn1.BERTaggedObjectParser, org.bouncycastle.asn1.ASN1TaggedObjectParser
    public org.bouncycastle.asn1.ASN1TaggedObjectParser parseExplicitBaseTagged() throws java.io.IOException {
        if (this.getHighResolutionOutputSizeshNQ4ISI) {
            return this.getHighSpeedVideoFpsRangesFor.getHighSpeedVideoFpsRangesFor();
        }
        throw new java.io.IOException("Explicit tags must be constructed (see X.690 8.14.2)");
    }

    @Override // org.bouncycastle.asn1.BERTaggedObjectParser, org.bouncycastle.asn1.ASN1TaggedObjectParser
    public org.bouncycastle.asn1.ASN1Encodable parseExplicitBaseObject() throws java.io.IOException {
        if (this.getHighResolutionOutputSizeshNQ4ISI) {
            return this.getHighSpeedVideoFpsRangesFor.readObject();
        }
        throw new java.io.IOException("Explicit tags must be constructed (see X.690 8.14.2)");
    }

    @Override // org.bouncycastle.asn1.BERTaggedObjectParser
    public boolean isConstructed() {
        return this.getHighResolutionOutputSizeshNQ4ISI;
    }

    DLTaggedObjectParser(int i, int i2, boolean z, org.bouncycastle.asn1.ASN1StreamParser aSN1StreamParser) {
        super(i, i2, aSN1StreamParser);
        this.getHighResolutionOutputSizeshNQ4ISI = z;
    }
}
