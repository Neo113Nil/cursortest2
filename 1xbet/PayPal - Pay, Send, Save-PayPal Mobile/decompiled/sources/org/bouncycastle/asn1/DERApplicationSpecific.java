package org.bouncycastle.asn1;

/* loaded from: classes17.dex */
public class DERApplicationSpecific extends org.bouncycastle.asn1.ASN1ApplicationSpecific {
    @Override // org.bouncycastle.asn1.ASN1ApplicationSpecific, org.bouncycastle.asn1.ASN1Primitive
    final org.bouncycastle.asn1.ASN1Primitive Camera2StreamConfigurationMap() {
        return this;
    }

    @Override // org.bouncycastle.asn1.ASN1ApplicationSpecific, org.bouncycastle.asn1.ASN1Primitive
    final org.bouncycastle.asn1.ASN1Primitive getHighSpeedVideoFpsRangesFor() {
        return this;
    }

    public DERApplicationSpecific(boolean z, int i, org.bouncycastle.asn1.ASN1Encodable aSN1Encodable) throws java.io.IOException {
        super(new org.bouncycastle.asn1.DERTaggedObject(z, 64, i, aSN1Encodable));
    }

    DERApplicationSpecific(org.bouncycastle.asn1.ASN1TaggedObject aSN1TaggedObject) {
        super(aSN1TaggedObject);
    }

    public DERApplicationSpecific(int i, byte[] bArr) {
        super(new org.bouncycastle.asn1.DERTaggedObject(false, 64, i, (org.bouncycastle.asn1.ASN1Encodable) new org.bouncycastle.asn1.DEROctetString(bArr)));
    }

    public DERApplicationSpecific(int i, org.bouncycastle.asn1.ASN1EncodableVector aSN1EncodableVector) {
        super(new org.bouncycastle.asn1.DERTaggedObject(false, 64, i, (org.bouncycastle.asn1.ASN1Encodable) org.bouncycastle.asn1.DERFactory.getHighSpeedVideoFpsRanges(aSN1EncodableVector)));
    }

    public DERApplicationSpecific(int i, org.bouncycastle.asn1.ASN1Encodable aSN1Encodable) throws java.io.IOException {
        this(true, i, aSN1Encodable);
    }
}
