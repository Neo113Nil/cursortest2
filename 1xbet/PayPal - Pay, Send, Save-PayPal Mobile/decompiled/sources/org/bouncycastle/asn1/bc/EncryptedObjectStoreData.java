package org.bouncycastle.asn1.bc;

/* loaded from: classes17.dex */
public class EncryptedObjectStoreData extends org.bouncycastle.asn1.ASN1Object {
    private final org.bouncycastle.asn1.ASN1OctetString getHighResolutionOutputSizeshNQ4ISI;
    private final org.bouncycastle.asn1.x509.AlgorithmIdentifier getHighSpeedVideoFpsRangesFor;

    @Override // org.bouncycastle.asn1.ASN1Object, org.bouncycastle.asn1.ASN1Encodable
    public org.bouncycastle.asn1.ASN1Primitive toASN1Primitive() {
        org.bouncycastle.asn1.ASN1EncodableVector aSN1EncodableVector = new org.bouncycastle.asn1.ASN1EncodableVector(2);
        aSN1EncodableVector.add(this.getHighSpeedVideoFpsRangesFor);
        aSN1EncodableVector.add(this.getHighResolutionOutputSizeshNQ4ISI);
        return new org.bouncycastle.asn1.DERSequence(aSN1EncodableVector);
    }

    public org.bouncycastle.asn1.x509.AlgorithmIdentifier getEncryptionAlgorithm() {
        return this.getHighSpeedVideoFpsRangesFor;
    }

    public org.bouncycastle.asn1.ASN1OctetString getEncryptedContent() {
        return this.getHighResolutionOutputSizeshNQ4ISI;
    }

    public static org.bouncycastle.asn1.bc.EncryptedObjectStoreData getInstance(java.lang.Object obj) {
        if (obj instanceof org.bouncycastle.asn1.bc.EncryptedObjectStoreData) {
            return (org.bouncycastle.asn1.bc.EncryptedObjectStoreData) obj;
        }
        if (obj != null) {
            return new org.bouncycastle.asn1.bc.EncryptedObjectStoreData(org.bouncycastle.asn1.ASN1Sequence.getInstance(obj));
        }
        return null;
    }

    public EncryptedObjectStoreData(org.bouncycastle.asn1.x509.AlgorithmIdentifier algorithmIdentifier, byte[] bArr) {
        this.getHighSpeedVideoFpsRangesFor = algorithmIdentifier;
        this.getHighResolutionOutputSizeshNQ4ISI = new org.bouncycastle.asn1.DEROctetString(bArr);
    }

    private EncryptedObjectStoreData(org.bouncycastle.asn1.ASN1Sequence aSN1Sequence) {
        this.getHighSpeedVideoFpsRangesFor = org.bouncycastle.asn1.x509.AlgorithmIdentifier.getInstance(aSN1Sequence.getObjectAt(0));
        this.getHighResolutionOutputSizeshNQ4ISI = org.bouncycastle.asn1.ASN1OctetString.getInstance(aSN1Sequence.getObjectAt(1));
    }
}
