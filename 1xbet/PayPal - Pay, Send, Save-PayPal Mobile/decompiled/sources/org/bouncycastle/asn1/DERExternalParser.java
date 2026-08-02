package org.bouncycastle.asn1;

/* loaded from: classes17.dex */
public class DERExternalParser implements org.bouncycastle.asn1.ASN1ExternalParser {
    private org.bouncycastle.asn1.ASN1StreamParser Camera2StreamConfigurationMap;

    @Override // org.bouncycastle.asn1.ASN1Encodable
    public org.bouncycastle.asn1.ASN1Primitive toASN1Primitive() {
        try {
            return getLoadedObject();
        } catch (java.io.IOException e) {
            throw new org.bouncycastle.asn1.ASN1ParsingException("unable to get DER object", e);
        } catch (java.lang.IllegalArgumentException e2) {
            throw new org.bouncycastle.asn1.ASN1ParsingException("unable to get DER object", e2);
        }
    }

    @Override // org.bouncycastle.asn1.ASN1ExternalParser
    public org.bouncycastle.asn1.ASN1Encodable readObject() throws java.io.IOException {
        return this.Camera2StreamConfigurationMap.readObject();
    }

    @Override // org.bouncycastle.asn1.InMemoryRepresentable
    public org.bouncycastle.asn1.ASN1Primitive getLoadedObject() throws java.io.IOException {
        return getHighResolutionOutputSizeshNQ4ISI(this.Camera2StreamConfigurationMap);
    }

    static org.bouncycastle.asn1.DLExternal getHighResolutionOutputSizeshNQ4ISI(org.bouncycastle.asn1.ASN1StreamParser aSN1StreamParser) throws java.io.IOException {
        try {
            return new org.bouncycastle.asn1.DLExternal(aSN1StreamParser.getHighResolutionOutputSizeshNQ4ISI());
        } catch (java.lang.IllegalArgumentException e) {
            throw new org.bouncycastle.asn1.ASN1Exception(e.getMessage(), e);
        }
    }

    public DERExternalParser(org.bouncycastle.asn1.ASN1StreamParser aSN1StreamParser) {
        this.Camera2StreamConfigurationMap = aSN1StreamParser;
    }
}
