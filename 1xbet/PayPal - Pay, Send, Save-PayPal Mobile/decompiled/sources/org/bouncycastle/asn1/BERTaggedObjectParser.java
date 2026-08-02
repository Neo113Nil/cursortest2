package org.bouncycastle.asn1;

/* loaded from: classes17.dex */
public class BERTaggedObjectParser implements org.bouncycastle.asn1.ASN1TaggedObjectParser {
    final int Camera2StreamConfigurationMap;
    final int getHighSpeedVideoFpsRanges;
    final org.bouncycastle.asn1.ASN1StreamParser getHighSpeedVideoFpsRangesFor;

    public boolean isConstructed() {
        return true;
    }

    @Override // org.bouncycastle.asn1.InMemoryRepresentable
    public org.bouncycastle.asn1.ASN1Primitive getLoadedObject() throws java.io.IOException {
        return org.bouncycastle.asn1.ASN1TaggedObject.getHighSpeedVideoFpsRangesFor(this.Camera2StreamConfigurationMap, this.getHighSpeedVideoFpsRanges, this.getHighSpeedVideoFpsRangesFor.getHighResolutionOutputSizeshNQ4ISI());
    }

    @Override // org.bouncycastle.asn1.ASN1Encodable
    public org.bouncycastle.asn1.ASN1Primitive toASN1Primitive() {
        try {
            return getLoadedObject();
        } catch (java.io.IOException e) {
            throw new org.bouncycastle.asn1.ASN1ParsingException(e.getMessage());
        }
    }

    @Override // org.bouncycastle.asn1.ASN1TaggedObjectParser
    public org.bouncycastle.asn1.ASN1TaggedObjectParser parseImplicitBaseTagged(int i, int i2) throws java.io.IOException {
        return 64 == i ? new org.bouncycastle.asn1.BERApplicationSpecificParser(i2, this.getHighSpeedVideoFpsRangesFor) : new org.bouncycastle.asn1.BERTaggedObjectParser(i, i2, this.getHighSpeedVideoFpsRangesFor);
    }

    @Override // org.bouncycastle.asn1.ASN1TaggedObjectParser
    public org.bouncycastle.asn1.ASN1TaggedObjectParser parseExplicitBaseTagged() throws java.io.IOException {
        return this.getHighSpeedVideoFpsRangesFor.getHighSpeedVideoFpsRangesFor();
    }

    @Override // org.bouncycastle.asn1.ASN1TaggedObjectParser
    public org.bouncycastle.asn1.ASN1Encodable parseExplicitBaseObject() throws java.io.IOException {
        return this.getHighSpeedVideoFpsRangesFor.readObject();
    }

    @Override // org.bouncycastle.asn1.ASN1TaggedObjectParser
    public org.bouncycastle.asn1.ASN1Encodable parseBaseUniversal(boolean z, int i) throws java.io.IOException {
        return z ? this.getHighSpeedVideoFpsRangesFor.getHighResolutionOutputSizeshNQ4ISI(i) : this.getHighSpeedVideoFpsRangesFor.Camera2StreamConfigurationMap(i);
    }

    @Override // org.bouncycastle.asn1.ASN1TaggedObjectParser
    public boolean hasTag(int i, int i2) {
        return this.Camera2StreamConfigurationMap == i && this.getHighSpeedVideoFpsRanges == i2;
    }

    @Override // org.bouncycastle.asn1.ASN1TaggedObjectParser
    public boolean hasContextTag(int i) {
        return this.Camera2StreamConfigurationMap == 128 && this.getHighSpeedVideoFpsRanges == i;
    }

    @Override // org.bouncycastle.asn1.ASN1TaggedObjectParser
    public int getTagNo() {
        return this.getHighSpeedVideoFpsRanges;
    }

    @Override // org.bouncycastle.asn1.ASN1TaggedObjectParser
    public int getTagClass() {
        return this.Camera2StreamConfigurationMap;
    }

    @Override // org.bouncycastle.asn1.ASN1TaggedObjectParser
    public org.bouncycastle.asn1.ASN1Encodable getObjectParser(int i, boolean z) throws java.io.IOException {
        if (128 == getTagClass()) {
            return parseBaseUniversal(z, i);
        }
        throw new org.bouncycastle.asn1.ASN1Exception("this method only valid for CONTEXT_SPECIFIC tags");
    }

    BERTaggedObjectParser(int i, int i2, org.bouncycastle.asn1.ASN1StreamParser aSN1StreamParser) {
        this.Camera2StreamConfigurationMap = i;
        this.getHighSpeedVideoFpsRanges = i2;
        this.getHighSpeedVideoFpsRangesFor = aSN1StreamParser;
    }
}
