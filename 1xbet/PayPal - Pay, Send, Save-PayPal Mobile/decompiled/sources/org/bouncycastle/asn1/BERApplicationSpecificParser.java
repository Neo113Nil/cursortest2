package org.bouncycastle.asn1;

/* loaded from: classes17.dex */
public class BERApplicationSpecificParser extends org.bouncycastle.asn1.BERTaggedObjectParser implements org.bouncycastle.asn1.ASN1ApplicationSpecificParser {
    @Override // org.bouncycastle.asn1.ASN1ApplicationSpecificParser
    public org.bouncycastle.asn1.ASN1Encodable readObject() throws java.io.IOException {
        return parseExplicitBaseObject();
    }

    BERApplicationSpecificParser(int i, org.bouncycastle.asn1.ASN1StreamParser aSN1StreamParser) {
        super(64, i, aSN1StreamParser);
    }
}
