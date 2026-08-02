package org.bouncycastle.asn1;

/* loaded from: classes17.dex */
public class DERSequenceGenerator extends org.bouncycastle.asn1.DERGenerator {
    private final java.io.ByteArrayOutputStream getHighSpeedVideoFpsRangesFor;

    @Override // org.bouncycastle.asn1.ASN1Generator
    public java.io.OutputStream getRawOutputStream() {
        return this.getHighSpeedVideoFpsRangesFor;
    }

    public void close() throws java.io.IOException {
        getHighResolutionOutputSizeshNQ4ISI(this.getHighSpeedVideoFpsRangesFor.toByteArray());
    }

    public void addObject(org.bouncycastle.asn1.ASN1Primitive aSN1Primitive) throws java.io.IOException {
        aSN1Primitive.encodeTo(this.getHighSpeedVideoFpsRangesFor, org.bouncycastle.asn1.ASN1Encoding.DER);
    }

    public void addObject(org.bouncycastle.asn1.ASN1Encodable aSN1Encodable) throws java.io.IOException {
        aSN1Encodable.toASN1Primitive().encodeTo(this.getHighSpeedVideoFpsRangesFor, org.bouncycastle.asn1.ASN1Encoding.DER);
    }

    public DERSequenceGenerator(java.io.OutputStream outputStream, int i, boolean z) throws java.io.IOException {
        super(outputStream, i, z);
        this.getHighSpeedVideoFpsRangesFor = new java.io.ByteArrayOutputStream();
    }

    public DERSequenceGenerator(java.io.OutputStream outputStream) throws java.io.IOException {
        super(outputStream);
        this.getHighSpeedVideoFpsRangesFor = new java.io.ByteArrayOutputStream();
    }
}
