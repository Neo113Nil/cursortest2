package org.bouncycastle.asn1;

/* loaded from: classes17.dex */
public class DLApplicationSpecific extends org.bouncycastle.asn1.ASN1ApplicationSpecific {
    @Override // org.bouncycastle.asn1.ASN1ApplicationSpecific, org.bouncycastle.asn1.ASN1Primitive
    final org.bouncycastle.asn1.ASN1Primitive Camera2StreamConfigurationMap() {
        return this;
    }

    public DLApplicationSpecific(boolean z, int i, org.bouncycastle.asn1.ASN1Encodable aSN1Encodable) throws java.io.IOException {
        super(new org.bouncycastle.asn1.DLTaggedObject(z, 64, i, aSN1Encodable));
    }

    DLApplicationSpecific(org.bouncycastle.asn1.ASN1TaggedObject aSN1TaggedObject) {
        super(aSN1TaggedObject);
    }

    public DLApplicationSpecific(int i, byte[] bArr) {
        super(new org.bouncycastle.asn1.DLTaggedObject(false, 64, i, (org.bouncycastle.asn1.ASN1Encodable) new org.bouncycastle.asn1.DEROctetString(bArr)));
    }

    public DLApplicationSpecific(int i, org.bouncycastle.asn1.ASN1EncodableVector aSN1EncodableVector) {
        super(new org.bouncycastle.asn1.DLTaggedObject(false, 64, i, (org.bouncycastle.asn1.ASN1Encodable) org.bouncycastle.asn1.DLFactory.getHighResolutionOutputSizeshNQ4ISI(aSN1EncodableVector)));
    }

    public DLApplicationSpecific(int i, org.bouncycastle.asn1.ASN1Encodable aSN1Encodable) throws java.io.IOException {
        this(true, i, aSN1Encodable);
    }
}
