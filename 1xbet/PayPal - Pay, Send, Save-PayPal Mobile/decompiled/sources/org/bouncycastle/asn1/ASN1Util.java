package org.bouncycastle.asn1;

/* loaded from: classes17.dex */
public abstract class ASN1Util {
    public static org.bouncycastle.asn1.ASN1TaggedObjectParser tryParseImplicitContextBaseTagged(org.bouncycastle.asn1.ASN1TaggedObjectParser aSN1TaggedObjectParser, int i, int i2, int i3) throws java.io.IOException {
        return tryParseImplicitBaseTagged(aSN1TaggedObjectParser, 128, i, i2, i3);
    }

    public static org.bouncycastle.asn1.ASN1TaggedObjectParser tryParseImplicitBaseTagged(org.bouncycastle.asn1.ASN1TaggedObjectParser aSN1TaggedObjectParser, int i, int i2, int i3, int i4) throws java.io.IOException {
        if (aSN1TaggedObjectParser.hasTag(i, i2)) {
            return aSN1TaggedObjectParser.parseImplicitBaseTagged(i3, i4);
        }
        return null;
    }

    public static org.bouncycastle.asn1.ASN1TaggedObjectParser tryParseExplicitContextBaseTagged(org.bouncycastle.asn1.ASN1TaggedObjectParser aSN1TaggedObjectParser, int i) throws java.io.IOException {
        return tryParseExplicitBaseTagged(aSN1TaggedObjectParser, 128, i);
    }

    public static org.bouncycastle.asn1.ASN1Encodable tryParseExplicitContextBaseObject(org.bouncycastle.asn1.ASN1TaggedObjectParser aSN1TaggedObjectParser, int i) throws java.io.IOException {
        return tryParseExplicitBaseObject(aSN1TaggedObjectParser, 128, i);
    }

    public static org.bouncycastle.asn1.ASN1TaggedObjectParser tryParseExplicitBaseTagged(org.bouncycastle.asn1.ASN1TaggedObjectParser aSN1TaggedObjectParser, int i, int i2) throws java.io.IOException {
        if (aSN1TaggedObjectParser.hasTag(i, i2)) {
            return aSN1TaggedObjectParser.parseExplicitBaseTagged();
        }
        return null;
    }

    public static org.bouncycastle.asn1.ASN1Encodable tryParseExplicitBaseObject(org.bouncycastle.asn1.ASN1TaggedObjectParser aSN1TaggedObjectParser, int i, int i2) throws java.io.IOException {
        if (aSN1TaggedObjectParser.hasTag(i, i2)) {
            return aSN1TaggedObjectParser.parseExplicitBaseObject();
        }
        return null;
    }

    public static org.bouncycastle.asn1.ASN1Encodable tryParseContextBaseUniversal(org.bouncycastle.asn1.ASN1TaggedObjectParser aSN1TaggedObjectParser, int i, boolean z, int i2) throws java.io.IOException {
        return tryParseBaseUniversal(aSN1TaggedObjectParser, 128, i, z, i2);
    }

    public static org.bouncycastle.asn1.ASN1Encodable tryParseBaseUniversal(org.bouncycastle.asn1.ASN1TaggedObjectParser aSN1TaggedObjectParser, int i, int i2, boolean z, int i3) throws java.io.IOException {
        if (aSN1TaggedObjectParser.hasTag(i, i2)) {
            return aSN1TaggedObjectParser.parseBaseUniversal(z, i3);
        }
        return null;
    }

    public static org.bouncycastle.asn1.ASN1TaggedObject tryGetImplicitContextBaseTagged(org.bouncycastle.asn1.ASN1TaggedObject aSN1TaggedObject, int i, int i2, int i3) {
        return tryGetImplicitBaseTagged(aSN1TaggedObject, 128, i, i2, i3);
    }

    public static org.bouncycastle.asn1.ASN1TaggedObject tryGetImplicitBaseTagged(org.bouncycastle.asn1.ASN1TaggedObject aSN1TaggedObject, int i, int i2, int i3, int i4) {
        if (aSN1TaggedObject.hasTag(i, i2)) {
            return aSN1TaggedObject.getImplicitBaseTagged(i3, i4);
        }
        return null;
    }

    public static org.bouncycastle.asn1.ASN1TaggedObject tryGetExplicitContextBaseTagged(org.bouncycastle.asn1.ASN1TaggedObject aSN1TaggedObject, int i) {
        return tryGetExplicitBaseTagged(aSN1TaggedObject, 128, i);
    }

    public static org.bouncycastle.asn1.ASN1Object tryGetExplicitContextBaseObject(org.bouncycastle.asn1.ASN1TaggedObject aSN1TaggedObject, int i) {
        return tryGetExplicitBaseObject(aSN1TaggedObject, 128, i);
    }

    public static org.bouncycastle.asn1.ASN1TaggedObject tryGetExplicitBaseTagged(org.bouncycastle.asn1.ASN1TaggedObject aSN1TaggedObject, int i, int i2) {
        if (aSN1TaggedObject.hasTag(i, i2)) {
            return aSN1TaggedObject.getExplicitBaseTagged();
        }
        return null;
    }

    public static org.bouncycastle.asn1.ASN1Object tryGetExplicitBaseObject(org.bouncycastle.asn1.ASN1TaggedObject aSN1TaggedObject, int i, int i2) {
        if (aSN1TaggedObject.hasTag(i, i2)) {
            return aSN1TaggedObject.getExplicitBaseObject();
        }
        return null;
    }

    public static org.bouncycastle.asn1.ASN1Primitive tryGetContextBaseUniversal(org.bouncycastle.asn1.ASN1TaggedObject aSN1TaggedObject, int i, boolean z, int i2) {
        return tryGetBaseUniversal(aSN1TaggedObject, 128, i, z, i2);
    }

    public static org.bouncycastle.asn1.ASN1Primitive tryGetBaseUniversal(org.bouncycastle.asn1.ASN1TaggedObject aSN1TaggedObject, int i, int i2, boolean z, int i3) {
        if (aSN1TaggedObject.hasTag(i, i2)) {
            return aSN1TaggedObject.getBaseUniversal(z, i3);
        }
        return null;
    }

    public static org.bouncycastle.asn1.ASN1TaggedObjectParser parseImplicitContextBaseTagged(org.bouncycastle.asn1.ASN1TaggedObjectParser aSN1TaggedObjectParser, int i, int i2, int i3) throws java.io.IOException {
        return parseImplicitBaseTagged(aSN1TaggedObjectParser, 128, i, i2, i3);
    }

    public static org.bouncycastle.asn1.ASN1TaggedObjectParser parseImplicitBaseTagged(org.bouncycastle.asn1.ASN1TaggedObjectParser aSN1TaggedObjectParser, int i, int i2, int i3, int i4) throws java.io.IOException {
        return getHighSpeedVideoFpsRanges(aSN1TaggedObjectParser, i, i2).parseImplicitBaseTagged(i3, i4);
    }

    public static org.bouncycastle.asn1.ASN1TaggedObjectParser parseExplicitContextBaseTagged(org.bouncycastle.asn1.ASN1TaggedObjectParser aSN1TaggedObjectParser, int i) throws java.io.IOException {
        return parseExplicitBaseTagged(aSN1TaggedObjectParser, 128, i);
    }

    public static org.bouncycastle.asn1.ASN1Encodable parseExplicitContextBaseObject(org.bouncycastle.asn1.ASN1TaggedObjectParser aSN1TaggedObjectParser, int i) throws java.io.IOException {
        return parseExplicitBaseObject(aSN1TaggedObjectParser, 128, i);
    }

    public static org.bouncycastle.asn1.ASN1TaggedObjectParser parseExplicitBaseTagged(org.bouncycastle.asn1.ASN1TaggedObjectParser aSN1TaggedObjectParser, int i, int i2) throws java.io.IOException {
        return getHighSpeedVideoFpsRanges(aSN1TaggedObjectParser, i, i2).parseExplicitBaseTagged();
    }

    public static org.bouncycastle.asn1.ASN1Encodable parseExplicitBaseObject(org.bouncycastle.asn1.ASN1TaggedObjectParser aSN1TaggedObjectParser, int i, int i2) throws java.io.IOException {
        return getHighSpeedVideoFpsRanges(aSN1TaggedObjectParser, i, i2).parseExplicitBaseObject();
    }

    public static org.bouncycastle.asn1.ASN1Encodable parseContextBaseUniversal(org.bouncycastle.asn1.ASN1TaggedObjectParser aSN1TaggedObjectParser, int i, boolean z, int i2) throws java.io.IOException {
        return parseBaseUniversal(aSN1TaggedObjectParser, 128, i, z, i2);
    }

    public static org.bouncycastle.asn1.ASN1Encodable parseBaseUniversal(org.bouncycastle.asn1.ASN1TaggedObjectParser aSN1TaggedObjectParser, int i, int i2, boolean z, int i3) throws java.io.IOException {
        return getHighSpeedVideoFpsRanges(aSN1TaggedObjectParser, i, i2).parseBaseUniversal(z, i3);
    }

    public static java.lang.String getTagText(org.bouncycastle.asn1.ASN1TaggedObjectParser aSN1TaggedObjectParser) {
        return getTagText(aSN1TaggedObjectParser.getTagClass(), aSN1TaggedObjectParser.getTagNo());
    }

    public static java.lang.String getTagText(org.bouncycastle.asn1.ASN1TaggedObject aSN1TaggedObject) {
        return getTagText(aSN1TaggedObject.getTagClass(), aSN1TaggedObject.getTagNo());
    }

    public static java.lang.String getTagText(int i, int i2) {
        java.lang.StringBuilder sb;
        if (i == 64) {
            sb = new java.lang.StringBuilder("[APPLICATION ");
        } else if (i != 128) {
            sb = i != 192 ? new java.lang.StringBuilder("[UNIVERSAL ") : new java.lang.StringBuilder("[PRIVATE ");
        } else {
            sb = new java.lang.StringBuilder("[CONTEXT ");
        }
        sb.append(i2);
        sb.append("]");
        return sb.toString();
    }

    public static org.bouncycastle.asn1.ASN1TaggedObject getImplicitContextBaseTagged(org.bouncycastle.asn1.ASN1TaggedObject aSN1TaggedObject, int i, int i2, int i3) {
        return getImplicitBaseTagged(aSN1TaggedObject, 128, i, i2, i3);
    }

    public static org.bouncycastle.asn1.ASN1TaggedObject getImplicitBaseTagged(org.bouncycastle.asn1.ASN1TaggedObject aSN1TaggedObject, int i, int i2, int i3, int i4) {
        return getHighSpeedVideoSizes(aSN1TaggedObject, i, i2).getImplicitBaseTagged(i3, i4);
    }

    public static org.bouncycastle.asn1.ASN1TaggedObject getExplicitContextBaseTagged(org.bouncycastle.asn1.ASN1TaggedObject aSN1TaggedObject, int i) {
        return getExplicitBaseTagged(aSN1TaggedObject, 128, i);
    }

    public static org.bouncycastle.asn1.ASN1Object getExplicitContextBaseObject(org.bouncycastle.asn1.ASN1TaggedObject aSN1TaggedObject, int i) {
        return getExplicitBaseObject(aSN1TaggedObject, 128, i);
    }

    public static org.bouncycastle.asn1.ASN1TaggedObject getExplicitBaseTagged(org.bouncycastle.asn1.ASN1TaggedObject aSN1TaggedObject, int i, int i2) {
        return getHighSpeedVideoSizes(aSN1TaggedObject, i, i2).getExplicitBaseTagged();
    }

    public static org.bouncycastle.asn1.ASN1Object getExplicitBaseObject(org.bouncycastle.asn1.ASN1TaggedObject aSN1TaggedObject, int i, int i2) {
        return getHighSpeedVideoSizes(aSN1TaggedObject, i, i2).getExplicitBaseObject();
    }

    public static org.bouncycastle.asn1.ASN1Primitive getContextBaseUniversal(org.bouncycastle.asn1.ASN1TaggedObject aSN1TaggedObject, int i, boolean z, int i2) {
        return getBaseUniversal(aSN1TaggedObject, 128, i, z, i2);
    }

    public static org.bouncycastle.asn1.ASN1Primitive getBaseUniversal(org.bouncycastle.asn1.ASN1TaggedObject aSN1TaggedObject, int i, int i2, boolean z, int i3) {
        return getHighSpeedVideoSizes(aSN1TaggedObject, i, i2).getBaseUniversal(z, i3);
    }

    private static org.bouncycastle.asn1.ASN1TaggedObjectParser getHighSpeedVideoFpsRanges(org.bouncycastle.asn1.ASN1TaggedObjectParser aSN1TaggedObjectParser, int i, int i2) {
        if (aSN1TaggedObjectParser.hasTag(i, i2)) {
            return aSN1TaggedObjectParser;
        }
        java.lang.String tagText = getTagText(i, i2);
        java.lang.String tagText2 = getTagText(aSN1TaggedObjectParser);
        java.lang.StringBuilder sb = new java.lang.StringBuilder("Expected ");
        sb.append(tagText);
        sb.append(" tag but found ");
        sb.append(tagText2);
        throw new java.lang.IllegalStateException(sb.toString());
    }

    static org.bouncycastle.asn1.ASN1TaggedObject getHighSpeedVideoSizes(org.bouncycastle.asn1.ASN1TaggedObject aSN1TaggedObject, int i, int i2) {
        if (aSN1TaggedObject.hasTag(i, i2)) {
            return aSN1TaggedObject;
        }
        java.lang.String tagText = getTagText(i, i2);
        java.lang.String tagText2 = getTagText(aSN1TaggedObject);
        java.lang.StringBuilder sb = new java.lang.StringBuilder("Expected ");
        sb.append(tagText);
        sb.append(" tag but found ");
        sb.append(tagText2);
        throw new java.lang.IllegalStateException(sb.toString());
    }
}
