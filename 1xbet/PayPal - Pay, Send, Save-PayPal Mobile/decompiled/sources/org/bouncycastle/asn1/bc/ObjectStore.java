package org.bouncycastle.asn1.bc;

/* loaded from: classes17.dex */
public class ObjectStore extends org.bouncycastle.asn1.ASN1Object {
    private final org.bouncycastle.asn1.ASN1Encodable Camera2StreamConfigurationMap;
    private final org.bouncycastle.asn1.bc.ObjectStoreIntegrityCheck getHighResolutionOutputSizeshNQ4ISI;

    @Override // org.bouncycastle.asn1.ASN1Object, org.bouncycastle.asn1.ASN1Encodable
    public org.bouncycastle.asn1.ASN1Primitive toASN1Primitive() {
        org.bouncycastle.asn1.ASN1EncodableVector aSN1EncodableVector = new org.bouncycastle.asn1.ASN1EncodableVector(2);
        aSN1EncodableVector.add(this.Camera2StreamConfigurationMap);
        aSN1EncodableVector.add(this.getHighResolutionOutputSizeshNQ4ISI);
        return new org.bouncycastle.asn1.DERSequence(aSN1EncodableVector);
    }

    public org.bouncycastle.asn1.ASN1Encodable getStoreData() {
        return this.Camera2StreamConfigurationMap;
    }

    public org.bouncycastle.asn1.bc.ObjectStoreIntegrityCheck getIntegrityCheck() {
        return this.getHighResolutionOutputSizeshNQ4ISI;
    }

    public static org.bouncycastle.asn1.bc.ObjectStore getInstance(java.lang.Object obj) {
        if (obj instanceof org.bouncycastle.asn1.bc.ObjectStore) {
            return (org.bouncycastle.asn1.bc.ObjectStore) obj;
        }
        if (obj != null) {
            return new org.bouncycastle.asn1.bc.ObjectStore(org.bouncycastle.asn1.ASN1Sequence.getInstance(obj));
        }
        return null;
    }

    public ObjectStore(org.bouncycastle.asn1.bc.ObjectStoreData objectStoreData, org.bouncycastle.asn1.bc.ObjectStoreIntegrityCheck objectStoreIntegrityCheck) {
        this.Camera2StreamConfigurationMap = objectStoreData;
        this.getHighResolutionOutputSizeshNQ4ISI = objectStoreIntegrityCheck;
    }

    public ObjectStore(org.bouncycastle.asn1.bc.EncryptedObjectStoreData encryptedObjectStoreData, org.bouncycastle.asn1.bc.ObjectStoreIntegrityCheck objectStoreIntegrityCheck) {
        this.Camera2StreamConfigurationMap = encryptedObjectStoreData;
        this.getHighResolutionOutputSizeshNQ4ISI = objectStoreIntegrityCheck;
    }

    private ObjectStore(org.bouncycastle.asn1.ASN1Sequence aSN1Sequence) {
        if (aSN1Sequence.size() != 2) {
            throw new java.lang.IllegalArgumentException("malformed sequence");
        }
        org.bouncycastle.asn1.ASN1Encodable objectAt = aSN1Sequence.getObjectAt(0);
        if (!(objectAt instanceof org.bouncycastle.asn1.bc.EncryptedObjectStoreData) && !(objectAt instanceof org.bouncycastle.asn1.bc.ObjectStoreData)) {
            org.bouncycastle.asn1.ASN1Sequence aSN1Sequence2 = org.bouncycastle.asn1.ASN1Sequence.getInstance(objectAt);
            objectAt = aSN1Sequence2.size() == 2 ? org.bouncycastle.asn1.bc.EncryptedObjectStoreData.getInstance(aSN1Sequence2) : org.bouncycastle.asn1.bc.ObjectStoreData.getInstance(aSN1Sequence2);
        }
        this.Camera2StreamConfigurationMap = objectAt;
        this.getHighResolutionOutputSizeshNQ4ISI = org.bouncycastle.asn1.bc.ObjectStoreIntegrityCheck.getInstance(aSN1Sequence.getObjectAt(1));
    }
}
