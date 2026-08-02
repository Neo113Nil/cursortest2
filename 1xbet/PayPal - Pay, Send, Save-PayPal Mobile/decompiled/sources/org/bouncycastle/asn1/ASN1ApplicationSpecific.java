package org.bouncycastle.asn1;

/* loaded from: classes17.dex */
public abstract class ASN1ApplicationSpecific extends org.bouncycastle.asn1.ASN1Primitive implements org.bouncycastle.asn1.ASN1ApplicationSpecificParser {
    final org.bouncycastle.asn1.ASN1TaggedObject getHighSpeedVideoFpsRanges;

    @Override // org.bouncycastle.asn1.InMemoryRepresentable
    public final org.bouncycastle.asn1.ASN1Primitive getLoadedObject() {
        return this;
    }

    @Override // org.bouncycastle.asn1.ASN1TaggedObjectParser
    public int getTagClass() {
        return 64;
    }

    @Override // org.bouncycastle.asn1.ASN1TaggedObjectParser
    public boolean hasContextTag(int i) {
        return false;
    }

    ASN1ApplicationSpecific(org.bouncycastle.asn1.ASN1TaggedObject aSN1TaggedObject) {
        if (64 != aSN1TaggedObject.getTagClass()) {
            throw new java.lang.IllegalArgumentException();
        }
        this.getHighSpeedVideoFpsRanges = aSN1TaggedObject;
    }

    public boolean isConstructed() {
        return this.getHighSpeedVideoFpsRanges.getHighResolutionOutputSizeshNQ4ISI();
    }

    @Override // org.bouncycastle.asn1.ASN1Primitive
    org.bouncycastle.asn1.ASN1Primitive Camera2StreamConfigurationMap() {
        return new org.bouncycastle.asn1.DLApplicationSpecific((org.bouncycastle.asn1.ASN1TaggedObject) this.getHighSpeedVideoFpsRanges.Camera2StreamConfigurationMap());
    }

    @Override // org.bouncycastle.asn1.ASN1Primitive
    org.bouncycastle.asn1.ASN1Primitive getHighSpeedVideoFpsRangesFor() {
        return new org.bouncycastle.asn1.DERApplicationSpecific((org.bouncycastle.asn1.ASN1TaggedObject) this.getHighSpeedVideoFpsRanges.getHighSpeedVideoFpsRangesFor());
    }

    @Override // org.bouncycastle.asn1.ASN1ApplicationSpecificParser
    public org.bouncycastle.asn1.ASN1Encodable readObject() throws java.io.IOException {
        return parseExplicitBaseObject();
    }

    @Override // org.bouncycastle.asn1.ASN1TaggedObjectParser
    public org.bouncycastle.asn1.ASN1TaggedObjectParser parseImplicitBaseTagged(int i, int i2) throws java.io.IOException {
        return this.getHighSpeedVideoFpsRanges.parseImplicitBaseTagged(i, i2);
    }

    @Override // org.bouncycastle.asn1.ASN1TaggedObjectParser
    public org.bouncycastle.asn1.ASN1TaggedObjectParser parseExplicitBaseTagged() throws java.io.IOException {
        return this.getHighSpeedVideoFpsRanges.parseExplicitBaseTagged();
    }

    @Override // org.bouncycastle.asn1.ASN1TaggedObjectParser
    public org.bouncycastle.asn1.ASN1Encodable parseExplicitBaseObject() throws java.io.IOException {
        return this.getHighSpeedVideoFpsRanges.parseExplicitBaseObject();
    }

    @Override // org.bouncycastle.asn1.ASN1TaggedObjectParser
    public org.bouncycastle.asn1.ASN1Encodable parseBaseUniversal(boolean z, int i) throws java.io.IOException {
        return this.getHighSpeedVideoFpsRanges.parseBaseUniversal(z, i);
    }

    @Override // org.bouncycastle.asn1.ASN1Primitive, org.bouncycastle.asn1.ASN1Object
    public int hashCode() {
        return this.getHighSpeedVideoFpsRanges.hashCode();
    }

    @Override // org.bouncycastle.asn1.ASN1TaggedObjectParser
    public boolean hasTag(int i, int i2) {
        return this.getHighSpeedVideoFpsRanges.hasTag(i, i2);
    }

    public boolean hasApplicationTag(int i) {
        return this.getHighSpeedVideoFpsRanges.hasTag(64, i);
    }

    public org.bouncycastle.asn1.ASN1TaggedObject getTaggedObject() {
        return this.getHighSpeedVideoFpsRanges;
    }

    @Override // org.bouncycastle.asn1.ASN1TaggedObjectParser
    public int getTagNo() {
        return this.getHighSpeedVideoFpsRanges.getTagNo();
    }

    @Override // org.bouncycastle.asn1.ASN1TaggedObjectParser
    public org.bouncycastle.asn1.ASN1Encodable getObjectParser(int i, boolean z) throws java.io.IOException {
        throw new org.bouncycastle.asn1.ASN1Exception("this method only valid for CONTEXT_SPECIFIC tags");
    }

    public org.bouncycastle.asn1.ASN1Primitive getObject(int i) throws java.io.IOException {
        return this.getHighSpeedVideoFpsRanges.getBaseUniversal(false, i);
    }

    public org.bouncycastle.asn1.ASN1Primitive getObject() throws java.io.IOException {
        return getEnclosedObject();
    }

    public org.bouncycastle.asn1.ASN1Primitive getEnclosedObject() throws java.io.IOException {
        return this.getHighSpeedVideoFpsRanges.getBaseObject().toASN1Primitive();
    }

    public byte[] getContents() {
        return this.getHighSpeedVideoFpsRanges.getHighSpeedVideoSizes();
    }

    public int getApplicationTag() {
        return this.getHighSpeedVideoFpsRanges.getTagNo();
    }

    @Override // org.bouncycastle.asn1.ASN1Primitive
    final int getHighSpeedVideoSizes(boolean z) throws java.io.IOException {
        return this.getHighSpeedVideoFpsRanges.getHighSpeedVideoSizes(z);
    }

    @Override // org.bouncycastle.asn1.ASN1Primitive
    final boolean getHighResolutionOutputSizeshNQ4ISI() {
        return this.getHighSpeedVideoFpsRanges.getHighResolutionOutputSizeshNQ4ISI();
    }

    @Override // org.bouncycastle.asn1.ASN1Primitive
    final void getHighSpeedVideoSizes(org.bouncycastle.asn1.ASN1OutputStream aSN1OutputStream, boolean z) throws java.io.IOException {
        this.getHighSpeedVideoFpsRanges.getHighSpeedVideoSizes(aSN1OutputStream, z);
    }

    @Override // org.bouncycastle.asn1.ASN1Primitive
    final boolean Camera2StreamConfigurationMap(org.bouncycastle.asn1.ASN1Primitive aSN1Primitive) {
        org.bouncycastle.asn1.ASN1TaggedObject aSN1TaggedObject;
        if (aSN1Primitive instanceof org.bouncycastle.asn1.ASN1ApplicationSpecific) {
            aSN1TaggedObject = ((org.bouncycastle.asn1.ASN1ApplicationSpecific) aSN1Primitive).getHighSpeedVideoFpsRanges;
        } else {
            if (!(aSN1Primitive instanceof org.bouncycastle.asn1.ASN1TaggedObject)) {
                return false;
            }
            aSN1TaggedObject = (org.bouncycastle.asn1.ASN1TaggedObject) aSN1Primitive;
        }
        return this.getHighSpeedVideoFpsRanges.equals((org.bouncycastle.asn1.ASN1Primitive) aSN1TaggedObject);
    }

    public static org.bouncycastle.asn1.ASN1ApplicationSpecific getInstance(java.lang.Object obj) {
        if (obj == null || (obj instanceof org.bouncycastle.asn1.ASN1ApplicationSpecific)) {
            return (org.bouncycastle.asn1.ASN1ApplicationSpecific) obj;
        }
        if (!(obj instanceof byte[])) {
            java.lang.StringBuilder sb = new java.lang.StringBuilder("unknown object in getInstance: ");
            sb.append(obj.getClass().getName());
            throw new java.lang.IllegalArgumentException(sb.toString());
        }
        try {
            return getInstance(org.bouncycastle.asn1.ASN1Primitive.fromByteArray((byte[]) obj));
        } catch (java.io.IOException e) {
            java.lang.StringBuilder sb2 = new java.lang.StringBuilder("Failed to construct object from byte[]: ");
            sb2.append(e.getMessage());
            throw new java.lang.IllegalArgumentException(sb2.toString());
        }
    }
}
