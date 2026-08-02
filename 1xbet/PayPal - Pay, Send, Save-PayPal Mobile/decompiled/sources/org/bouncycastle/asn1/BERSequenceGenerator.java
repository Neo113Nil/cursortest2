package org.bouncycastle.asn1;

/* loaded from: classes17.dex */
public class BERSequenceGenerator extends org.bouncycastle.asn1.BERGenerator {
    public void close() throws java.io.IOException {
        writeBEREnd();
    }

    public void addObject(org.bouncycastle.asn1.ASN1Primitive aSN1Primitive) throws java.io.IOException {
        aSN1Primitive.encodeTo(this._out);
    }

    public void addObject(org.bouncycastle.asn1.ASN1Encodable aSN1Encodable) throws java.io.IOException {
        aSN1Encodable.toASN1Primitive().encodeTo(this._out);
    }

    public BERSequenceGenerator(java.io.OutputStream outputStream, int i, boolean z) throws java.io.IOException {
        super(outputStream, i, z);
        writeBERHeader(48);
    }

    public BERSequenceGenerator(java.io.OutputStream outputStream) throws java.io.IOException {
        super(outputStream);
        writeBERHeader(48);
    }
}
