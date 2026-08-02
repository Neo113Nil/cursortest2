package org.bouncycastle.asn1;

/* loaded from: classes17.dex */
public interface ASN1TaggedObjectParser extends org.bouncycastle.asn1.ASN1Encodable, org.bouncycastle.asn1.InMemoryRepresentable {
    org.bouncycastle.asn1.ASN1Encodable getObjectParser(int i, boolean z) throws java.io.IOException;

    int getTagClass();

    int getTagNo();

    boolean hasContextTag(int i);

    boolean hasTag(int i, int i2);

    org.bouncycastle.asn1.ASN1Encodable parseBaseUniversal(boolean z, int i) throws java.io.IOException;

    org.bouncycastle.asn1.ASN1Encodable parseExplicitBaseObject() throws java.io.IOException;

    org.bouncycastle.asn1.ASN1TaggedObjectParser parseExplicitBaseTagged() throws java.io.IOException;

    org.bouncycastle.asn1.ASN1TaggedObjectParser parseImplicitBaseTagged(int i, int i2) throws java.io.IOException;
}
