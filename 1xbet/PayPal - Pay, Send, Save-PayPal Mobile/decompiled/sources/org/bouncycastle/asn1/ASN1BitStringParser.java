package org.bouncycastle.asn1;

/* loaded from: classes17.dex */
public interface ASN1BitStringParser extends org.bouncycastle.asn1.ASN1Encodable, org.bouncycastle.asn1.InMemoryRepresentable {
    java.io.InputStream getBitStream() throws java.io.IOException;

    java.io.InputStream getOctetStream() throws java.io.IOException;

    int getPadBits();
}
