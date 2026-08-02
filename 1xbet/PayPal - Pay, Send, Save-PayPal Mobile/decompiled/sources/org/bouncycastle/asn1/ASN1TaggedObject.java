package org.bouncycastle.asn1;

/* loaded from: classes17.dex */
public abstract class ASN1TaggedObject extends org.bouncycastle.asn1.ASN1Primitive implements org.bouncycastle.asn1.ASN1TaggedObjectParser {
    final int Camera2StreamConfigurationMap;
    final org.bouncycastle.asn1.ASN1Encodable getHighResolutionOutputSizeshNQ4ISI;
    final int getHighSpeedVideoFpsRanges;
    final int getHighSpeedVideoFpsRangesFor;

    abstract java.lang.String getHighSpeedVideoFpsRanges();

    abstract org.bouncycastle.asn1.ASN1Sequence getHighSpeedVideoSizes(org.bouncycastle.asn1.ASN1Primitive aSN1Primitive);

    abstract org.bouncycastle.asn1.ASN1TaggedObject getHighSpeedVideoSizes(int i, int i2);

    @Override // org.bouncycastle.asn1.InMemoryRepresentable
    public final org.bouncycastle.asn1.ASN1Primitive getLoadedObject() {
        return this;
    }

    public java.lang.String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append(org.bouncycastle.asn1.ASN1Util.getTagText(this.getHighSpeedVideoFpsRangesFor, this.Camera2StreamConfigurationMap));
        sb.append(this.getHighResolutionOutputSizeshNQ4ISI);
        return sb.toString();
    }

    @Override // org.bouncycastle.asn1.ASN1Primitive
    org.bouncycastle.asn1.ASN1Primitive Camera2StreamConfigurationMap() {
        return new org.bouncycastle.asn1.DLTaggedObject(this.getHighSpeedVideoFpsRanges, this.getHighSpeedVideoFpsRangesFor, this.Camera2StreamConfigurationMap, this.getHighResolutionOutputSizeshNQ4ISI);
    }

    @Override // org.bouncycastle.asn1.ASN1Primitive
    org.bouncycastle.asn1.ASN1Primitive getHighSpeedVideoFpsRangesFor() {
        return new org.bouncycastle.asn1.DERTaggedObject(this.getHighSpeedVideoFpsRanges, this.getHighSpeedVideoFpsRangesFor, this.Camera2StreamConfigurationMap, this.getHighResolutionOutputSizeshNQ4ISI);
    }

    @Override // org.bouncycastle.asn1.ASN1TaggedObjectParser
    public org.bouncycastle.asn1.ASN1TaggedObjectParser parseImplicitBaseTagged(int i, int i2) throws java.io.IOException {
        return getImplicitBaseTagged(i, i2);
    }

    @Override // org.bouncycastle.asn1.ASN1TaggedObjectParser
    public org.bouncycastle.asn1.ASN1TaggedObjectParser parseExplicitBaseTagged() throws java.io.IOException {
        return getExplicitBaseTagged();
    }

    @Override // org.bouncycastle.asn1.ASN1TaggedObjectParser
    public org.bouncycastle.asn1.ASN1Encodable parseExplicitBaseObject() throws java.io.IOException {
        return getExplicitBaseObject();
    }

    @Override // org.bouncycastle.asn1.ASN1TaggedObjectParser
    public org.bouncycastle.asn1.ASN1Encodable parseBaseUniversal(boolean z, int i) throws java.io.IOException {
        org.bouncycastle.asn1.ASN1Primitive baseUniversal = getBaseUniversal(z, i);
        return i != 3 ? i != 4 ? i != 16 ? i != 17 ? baseUniversal : ((org.bouncycastle.asn1.ASN1Set) baseUniversal).parser() : ((org.bouncycastle.asn1.ASN1Sequence) baseUniversal).parser() : ((org.bouncycastle.asn1.ASN1OctetString) baseUniversal).parser() : ((org.bouncycastle.asn1.ASN1BitString) baseUniversal).parser();
    }

    public boolean isExplicit() {
        int i = this.getHighSpeedVideoFpsRanges;
        return i == 1 || i == 3;
    }

    @Override // org.bouncycastle.asn1.ASN1Primitive, org.bouncycastle.asn1.ASN1Object
    public int hashCode() {
        int i = this.getHighSpeedVideoFpsRangesFor;
        return (((i * 7919) ^ this.Camera2StreamConfigurationMap) ^ (isExplicit() ? 15 : com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_PLAID_LOGO_CIRCLE_VALUE)) ^ this.getHighResolutionOutputSizeshNQ4ISI.toASN1Primitive().hashCode();
    }

    @Override // org.bouncycastle.asn1.ASN1TaggedObjectParser
    public boolean hasTag(int i, int i2) {
        return this.getHighSpeedVideoFpsRangesFor == i && this.Camera2StreamConfigurationMap == i2;
    }

    @Override // org.bouncycastle.asn1.ASN1TaggedObjectParser
    public boolean hasContextTag(int i) {
        return this.getHighSpeedVideoFpsRangesFor == 128 && this.Camera2StreamConfigurationMap == i;
    }

    @Override // org.bouncycastle.asn1.ASN1TaggedObjectParser
    public int getTagNo() {
        return this.Camera2StreamConfigurationMap;
    }

    @Override // org.bouncycastle.asn1.ASN1TaggedObjectParser
    public int getTagClass() {
        return this.getHighSpeedVideoFpsRangesFor;
    }

    @Override // org.bouncycastle.asn1.ASN1TaggedObjectParser
    public org.bouncycastle.asn1.ASN1Encodable getObjectParser(int i, boolean z) throws java.io.IOException {
        if (128 == getTagClass()) {
            return parseBaseUniversal(z, i);
        }
        throw new org.bouncycastle.asn1.ASN1Exception("this method only valid for CONTEXT_SPECIFIC tags");
    }

    public org.bouncycastle.asn1.ASN1Primitive getObject() {
        if (128 == getTagClass()) {
            return this.getHighResolutionOutputSizeshNQ4ISI.toASN1Primitive();
        }
        throw new java.lang.IllegalStateException("this method only valid for CONTEXT_SPECIFIC tags");
    }

    public org.bouncycastle.asn1.ASN1TaggedObject getImplicitBaseTagged(int i, int i2) {
        if (i == 0 || (i & 192) != i) {
            throw new java.lang.IllegalArgumentException("invalid base tag class: ".concat(java.lang.String.valueOf(i)));
        }
        int i3 = this.getHighSpeedVideoFpsRanges;
        if (i3 != 1) {
            return i3 != 2 ? getHighSpeedVideoSizes(i, i2) : org.bouncycastle.asn1.ASN1Util.getHighSpeedVideoSizes(getHighSpeedVideoFpsRangesFor(this.getHighResolutionOutputSizeshNQ4ISI.toASN1Primitive()), i, i2);
        }
        throw new java.lang.IllegalStateException("object explicit - implicit expected.");
    }

    public org.bouncycastle.asn1.ASN1TaggedObject getExplicitBaseTagged() {
        if (isExplicit()) {
            return getHighSpeedVideoFpsRangesFor(this.getHighResolutionOutputSizeshNQ4ISI.toASN1Primitive());
        }
        throw new java.lang.IllegalStateException("object implicit - explicit expected.");
    }

    public org.bouncycastle.asn1.ASN1Object getExplicitBaseObject() {
        if (!isExplicit()) {
            throw new java.lang.IllegalStateException("object implicit - explicit expected.");
        }
        org.bouncycastle.asn1.ASN1Encodable aSN1Encodable = this.getHighResolutionOutputSizeshNQ4ISI;
        return aSN1Encodable instanceof org.bouncycastle.asn1.ASN1Object ? (org.bouncycastle.asn1.ASN1Object) aSN1Encodable : aSN1Encodable.toASN1Primitive();
    }

    final byte[] getHighSpeedVideoSizes() {
        try {
            byte[] encoded = this.getHighResolutionOutputSizeshNQ4ISI.toASN1Primitive().getEncoded(getHighSpeedVideoFpsRanges());
            if (isExplicit()) {
                return encoded;
            }
            java.io.ByteArrayInputStream byteArrayInputStream = new java.io.ByteArrayInputStream(encoded);
            org.bouncycastle.asn1.ASN1InputStream.getHighResolutionOutputSizeshNQ4ISI(byteArrayInputStream, byteArrayInputStream.read());
            int highResolutionOutputSizeshNQ4ISI = org.bouncycastle.asn1.ASN1InputStream.getHighResolutionOutputSizeshNQ4ISI(byteArrayInputStream, byteArrayInputStream.available(), false);
            int available = byteArrayInputStream.available();
            int i = highResolutionOutputSizeshNQ4ISI < 0 ? available - 2 : available;
            if (i < 0) {
                throw new org.bouncycastle.asn1.ASN1ParsingException("failed to get contents");
            }
            byte[] bArr = new byte[i];
            java.lang.System.arraycopy(encoded, encoded.length - available, bArr, 0, i);
            return bArr;
        } catch (java.io.IOException e) {
            throw new org.bouncycastle.asn1.ASN1ParsingException("failed to get contents", e);
        }
    }

    final org.bouncycastle.asn1.ASN1Primitive getHighSpeedVideoFpsRangesFor(boolean z, org.bouncycastle.asn1.ASN1UniversalType aSN1UniversalType) {
        if (z) {
            if (isExplicit()) {
                return aSN1UniversalType.Camera2StreamConfigurationMap(this.getHighResolutionOutputSizeshNQ4ISI.toASN1Primitive());
            }
            throw new java.lang.IllegalStateException("object explicit - implicit expected.");
        }
        if (1 == this.getHighSpeedVideoFpsRanges) {
            throw new java.lang.IllegalStateException("object explicit - implicit expected.");
        }
        org.bouncycastle.asn1.ASN1Primitive aSN1Primitive = this.getHighResolutionOutputSizeshNQ4ISI.toASN1Primitive();
        int i = this.getHighSpeedVideoFpsRanges;
        return i != 3 ? i != 4 ? aSN1UniversalType.Camera2StreamConfigurationMap(aSN1Primitive) : aSN1Primitive instanceof org.bouncycastle.asn1.ASN1Sequence ? aSN1UniversalType.getHighResolutionOutputSizeshNQ4ISI((org.bouncycastle.asn1.ASN1Sequence) aSN1Primitive) : aSN1UniversalType.getHighResolutionOutputSizeshNQ4ISI((org.bouncycastle.asn1.DEROctetString) aSN1Primitive) : aSN1UniversalType.getHighResolutionOutputSizeshNQ4ISI(getHighSpeedVideoSizes(aSN1Primitive));
    }

    public org.bouncycastle.asn1.ASN1Primitive getBaseUniversal(boolean z, int i) {
        org.bouncycastle.asn1.ASN1UniversalType highSpeedVideoFpsRangesFor = org.bouncycastle.asn1.ASN1UniversalTypes.getHighSpeedVideoFpsRangesFor(i);
        if (highSpeedVideoFpsRangesFor != null) {
            return getHighSpeedVideoFpsRangesFor(z, highSpeedVideoFpsRangesFor);
        }
        throw new java.lang.IllegalArgumentException("unsupported UNIVERSAL tag number: ".concat(java.lang.String.valueOf(i)));
    }

    public org.bouncycastle.asn1.ASN1Object getBaseObject() {
        org.bouncycastle.asn1.ASN1Encodable aSN1Encodable = this.getHighResolutionOutputSizeshNQ4ISI;
        return aSN1Encodable instanceof org.bouncycastle.asn1.ASN1Object ? (org.bouncycastle.asn1.ASN1Object) aSN1Encodable : aSN1Encodable.toASN1Primitive();
    }

    @Override // org.bouncycastle.asn1.ASN1Primitive
    final boolean Camera2StreamConfigurationMap(org.bouncycastle.asn1.ASN1Primitive aSN1Primitive) {
        if (aSN1Primitive instanceof org.bouncycastle.asn1.ASN1ApplicationSpecific) {
            return aSN1Primitive.equals((org.bouncycastle.asn1.ASN1Primitive) this);
        }
        if (!(aSN1Primitive instanceof org.bouncycastle.asn1.ASN1TaggedObject)) {
            return false;
        }
        org.bouncycastle.asn1.ASN1TaggedObject aSN1TaggedObject = (org.bouncycastle.asn1.ASN1TaggedObject) aSN1Primitive;
        if (this.Camera2StreamConfigurationMap != aSN1TaggedObject.Camera2StreamConfigurationMap || this.getHighSpeedVideoFpsRangesFor != aSN1TaggedObject.getHighSpeedVideoFpsRangesFor) {
            return false;
        }
        if (this.getHighSpeedVideoFpsRanges != aSN1TaggedObject.getHighSpeedVideoFpsRanges && isExplicit() != aSN1TaggedObject.isExplicit()) {
            return false;
        }
        org.bouncycastle.asn1.ASN1Primitive aSN1Primitive2 = this.getHighResolutionOutputSizeshNQ4ISI.toASN1Primitive();
        org.bouncycastle.asn1.ASN1Primitive aSN1Primitive3 = aSN1TaggedObject.getHighResolutionOutputSizeshNQ4ISI.toASN1Primitive();
        if (aSN1Primitive2 == aSN1Primitive3) {
            return true;
        }
        if (isExplicit()) {
            return aSN1Primitive2.Camera2StreamConfigurationMap(aSN1Primitive3);
        }
        try {
            return org.bouncycastle.util.Arrays.areEqual(getEncoded(), aSN1TaggedObject.getEncoded());
        } catch (java.io.IOException unused) {
            return false;
        }
    }

    public static org.bouncycastle.asn1.ASN1TaggedObject getInstance(org.bouncycastle.asn1.ASN1TaggedObject aSN1TaggedObject, boolean z) {
        if (128 != aSN1TaggedObject.getTagClass()) {
            throw new java.lang.IllegalStateException("this method only valid for CONTEXT_SPECIFIC tags");
        }
        if (z) {
            return aSN1TaggedObject.getExplicitBaseTagged();
        }
        throw new java.lang.IllegalArgumentException("this method not valid for implicitly tagged tagged objects");
    }

    public static org.bouncycastle.asn1.ASN1TaggedObject getInstance(java.lang.Object obj) {
        if (obj == null || (obj instanceof org.bouncycastle.asn1.ASN1TaggedObject)) {
            return (org.bouncycastle.asn1.ASN1TaggedObject) obj;
        }
        if (obj instanceof org.bouncycastle.asn1.ASN1Encodable) {
            org.bouncycastle.asn1.ASN1Primitive aSN1Primitive = ((org.bouncycastle.asn1.ASN1Encodable) obj).toASN1Primitive();
            if (aSN1Primitive instanceof org.bouncycastle.asn1.ASN1TaggedObject) {
                return (org.bouncycastle.asn1.ASN1TaggedObject) aSN1Primitive;
            }
        } else if (obj instanceof byte[]) {
            try {
                return getHighSpeedVideoFpsRangesFor(fromByteArray((byte[]) obj));
            } catch (java.io.IOException e) {
                java.lang.StringBuilder sb = new java.lang.StringBuilder("failed to construct tagged object from byte[]: ");
                sb.append(e.getMessage());
                throw new java.lang.IllegalArgumentException(sb.toString());
            }
        }
        java.lang.StringBuilder sb2 = new java.lang.StringBuilder("unknown object in getInstance: ");
        sb2.append(obj.getClass().getName());
        throw new java.lang.IllegalArgumentException(sb2.toString());
    }

    static org.bouncycastle.asn1.ASN1Primitive getHighResolutionOutputSizeshNQ4ISI(int i, int i2, byte[] bArr) {
        org.bouncycastle.asn1.DLTaggedObject dLTaggedObject = new org.bouncycastle.asn1.DLTaggedObject(4, i, i2, new org.bouncycastle.asn1.DEROctetString(bArr));
        return i != 64 ? dLTaggedObject : new org.bouncycastle.asn1.DLApplicationSpecific(dLTaggedObject);
    }

    static org.bouncycastle.asn1.ASN1Primitive getHighSpeedVideoFpsRangesFor(int i, int i2, org.bouncycastle.asn1.ASN1EncodableVector aSN1EncodableVector) {
        org.bouncycastle.asn1.BERTaggedObject bERTaggedObject = aSN1EncodableVector.size() == 1 ? new org.bouncycastle.asn1.BERTaggedObject(3, i, i2, aSN1EncodableVector.get(0)) : new org.bouncycastle.asn1.BERTaggedObject(4, i, i2, org.bouncycastle.asn1.BERFactory.getHighResolutionOutputSizeshNQ4ISI(aSN1EncodableVector));
        return i != 64 ? bERTaggedObject : new org.bouncycastle.asn1.BERApplicationSpecific(bERTaggedObject);
    }

    static org.bouncycastle.asn1.ASN1Primitive Camera2StreamConfigurationMap(int i, int i2, org.bouncycastle.asn1.ASN1EncodableVector aSN1EncodableVector) {
        org.bouncycastle.asn1.DLTaggedObject dLTaggedObject = aSN1EncodableVector.size() == 1 ? new org.bouncycastle.asn1.DLTaggedObject(3, i, i2, aSN1EncodableVector.get(0)) : new org.bouncycastle.asn1.DLTaggedObject(4, i, i2, org.bouncycastle.asn1.DLFactory.getHighResolutionOutputSizeshNQ4ISI(aSN1EncodableVector));
        return i != 64 ? dLTaggedObject : new org.bouncycastle.asn1.DLApplicationSpecific(dLTaggedObject);
    }

    private static org.bouncycastle.asn1.ASN1TaggedObject getHighSpeedVideoFpsRangesFor(org.bouncycastle.asn1.ASN1Primitive aSN1Primitive) {
        if (aSN1Primitive instanceof org.bouncycastle.asn1.ASN1TaggedObject) {
            return (org.bouncycastle.asn1.ASN1TaggedObject) aSN1Primitive;
        }
        java.lang.StringBuilder sb = new java.lang.StringBuilder("unexpected object: ");
        sb.append(aSN1Primitive.getClass().getName());
        throw new java.lang.IllegalStateException(sb.toString());
    }

    protected ASN1TaggedObject(boolean z, int i, org.bouncycastle.asn1.ASN1Encodable aSN1Encodable) {
        this(z, 128, i, aSN1Encodable);
    }

    protected ASN1TaggedObject(boolean z, int i, int i2, org.bouncycastle.asn1.ASN1Encodable aSN1Encodable) {
        this(z ? 1 : 2, i, i2, aSN1Encodable);
    }

    ASN1TaggedObject(int i, int i2, int i3, org.bouncycastle.asn1.ASN1Encodable aSN1Encodable) {
        if (aSN1Encodable == null) {
            throw new java.lang.NullPointerException("'obj' cannot be null");
        }
        if (i2 == 0 || (i2 & 192) != i2) {
            throw new java.lang.IllegalArgumentException("invalid tag class: ".concat(java.lang.String.valueOf(i2)));
        }
        this.getHighSpeedVideoFpsRanges = aSN1Encodable instanceof org.bouncycastle.asn1.ASN1Choice ? 1 : i;
        this.getHighSpeedVideoFpsRangesFor = i2;
        this.Camera2StreamConfigurationMap = i3;
        this.getHighResolutionOutputSizeshNQ4ISI = aSN1Encodable;
    }
}
