package org.bouncycastle.asn1;

/* loaded from: classes17.dex */
public class BERApplicationSpecific extends org.bouncycastle.asn1.ASN1ApplicationSpecific {
    public BERApplicationSpecific(boolean z, int i, org.bouncycastle.asn1.ASN1Encodable aSN1Encodable) throws java.io.IOException {
        super(new org.bouncycastle.asn1.BERTaggedObject(z, 64, i, aSN1Encodable));
    }

    BERApplicationSpecific(org.bouncycastle.asn1.ASN1TaggedObject aSN1TaggedObject) {
        super(aSN1TaggedObject);
    }

    public BERApplicationSpecific(int i, org.bouncycastle.asn1.ASN1EncodableVector aSN1EncodableVector) {
        super(new org.bouncycastle.asn1.BERTaggedObject(false, 64, i, (org.bouncycastle.asn1.ASN1Encodable) org.bouncycastle.asn1.BERFactory.getHighResolutionOutputSizeshNQ4ISI(aSN1EncodableVector)));
    }

    public BERApplicationSpecific(int i, org.bouncycastle.asn1.ASN1Encodable aSN1Encodable) throws java.io.IOException {
        this(true, i, aSN1Encodable);
    }
}
