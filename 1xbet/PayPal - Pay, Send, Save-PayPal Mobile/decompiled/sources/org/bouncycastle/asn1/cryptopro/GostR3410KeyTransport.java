package org.bouncycastle.asn1.cryptopro;

/* loaded from: classes17.dex */
public class GostR3410KeyTransport extends org.bouncycastle.asn1.ASN1Object {
    private final org.bouncycastle.asn1.cryptopro.GostR3410TransportParameters getHighSpeedVideoFpsRangesFor;
    private final org.bouncycastle.asn1.cryptopro.Gost2814789EncryptedKey getHighSpeedVideoSizes;

    @Override // org.bouncycastle.asn1.ASN1Object, org.bouncycastle.asn1.ASN1Encodable
    public org.bouncycastle.asn1.ASN1Primitive toASN1Primitive() {
        org.bouncycastle.asn1.ASN1EncodableVector aSN1EncodableVector = new org.bouncycastle.asn1.ASN1EncodableVector(2);
        aSN1EncodableVector.add(this.getHighSpeedVideoSizes);
        org.bouncycastle.asn1.cryptopro.GostR3410TransportParameters gostR3410TransportParameters = this.getHighSpeedVideoFpsRangesFor;
        if (gostR3410TransportParameters != null) {
            aSN1EncodableVector.add(new org.bouncycastle.asn1.DERTaggedObject(false, 0, (org.bouncycastle.asn1.ASN1Encodable) gostR3410TransportParameters));
        }
        return new org.bouncycastle.asn1.DERSequence(aSN1EncodableVector);
    }

    public org.bouncycastle.asn1.cryptopro.GostR3410TransportParameters getTransportParameters() {
        return this.getHighSpeedVideoFpsRangesFor;
    }

    public org.bouncycastle.asn1.cryptopro.Gost2814789EncryptedKey getSessionEncryptedKey() {
        return this.getHighSpeedVideoSizes;
    }

    public static org.bouncycastle.asn1.cryptopro.GostR3410KeyTransport getInstance(java.lang.Object obj) {
        if (obj instanceof org.bouncycastle.asn1.cryptopro.GostR3410KeyTransport) {
            return (org.bouncycastle.asn1.cryptopro.GostR3410KeyTransport) obj;
        }
        if (obj != null) {
            return new org.bouncycastle.asn1.cryptopro.GostR3410KeyTransport(org.bouncycastle.asn1.ASN1Sequence.getInstance(obj));
        }
        return null;
    }

    public GostR3410KeyTransport(org.bouncycastle.asn1.cryptopro.Gost2814789EncryptedKey gost2814789EncryptedKey, org.bouncycastle.asn1.cryptopro.GostR3410TransportParameters gostR3410TransportParameters) {
        this.getHighSpeedVideoSizes = gost2814789EncryptedKey;
        this.getHighSpeedVideoFpsRangesFor = gostR3410TransportParameters;
    }

    private GostR3410KeyTransport(org.bouncycastle.asn1.ASN1Sequence aSN1Sequence) {
        this.getHighSpeedVideoSizes = org.bouncycastle.asn1.cryptopro.Gost2814789EncryptedKey.getInstance(aSN1Sequence.getObjectAt(0));
        this.getHighSpeedVideoFpsRangesFor = org.bouncycastle.asn1.cryptopro.GostR3410TransportParameters.getInstance(org.bouncycastle.asn1.ASN1TaggedObject.getInstance(aSN1Sequence.getObjectAt(1)), false);
    }
}
