package org.bouncycastle.asn1.x509;

/* loaded from: classes17.dex */
public class ExtendedKeyUsage extends org.bouncycastle.asn1.ASN1Object {
    java.util.Hashtable Camera2StreamConfigurationMap = new java.util.Hashtable();
    org.bouncycastle.asn1.ASN1Sequence getHighSpeedVideoSizes;

    @Override // org.bouncycastle.asn1.ASN1Object, org.bouncycastle.asn1.ASN1Encodable
    public org.bouncycastle.asn1.ASN1Primitive toASN1Primitive() {
        return this.getHighSpeedVideoSizes;
    }

    public int size() {
        return this.Camera2StreamConfigurationMap.size();
    }

    public boolean hasKeyPurposeId(org.bouncycastle.asn1.x509.KeyPurposeId keyPurposeId) {
        return this.Camera2StreamConfigurationMap.get(keyPurposeId) != null;
    }

    public org.bouncycastle.asn1.x509.KeyPurposeId[] getUsages() {
        org.bouncycastle.asn1.x509.KeyPurposeId[] keyPurposeIdArr = new org.bouncycastle.asn1.x509.KeyPurposeId[this.getHighSpeedVideoSizes.size()];
        java.util.Enumeration objects = this.getHighSpeedVideoSizes.getObjects();
        int i = 0;
        while (objects.hasMoreElements()) {
            keyPurposeIdArr[i] = org.bouncycastle.asn1.x509.KeyPurposeId.getInstance(objects.nextElement());
            i++;
        }
        return keyPurposeIdArr;
    }

    public static org.bouncycastle.asn1.x509.ExtendedKeyUsage getInstance(org.bouncycastle.asn1.ASN1TaggedObject aSN1TaggedObject, boolean z) {
        return getInstance(org.bouncycastle.asn1.ASN1Sequence.getInstance(aSN1TaggedObject, z));
    }

    public static org.bouncycastle.asn1.x509.ExtendedKeyUsage getInstance(java.lang.Object obj) {
        if (obj instanceof org.bouncycastle.asn1.x509.ExtendedKeyUsage) {
            return (org.bouncycastle.asn1.x509.ExtendedKeyUsage) obj;
        }
        if (obj != null) {
            return new org.bouncycastle.asn1.x509.ExtendedKeyUsage(org.bouncycastle.asn1.ASN1Sequence.getInstance(obj));
        }
        return null;
    }

    public static org.bouncycastle.asn1.x509.ExtendedKeyUsage fromExtensions(org.bouncycastle.asn1.x509.Extensions extensions) {
        return getInstance(org.bouncycastle.asn1.x509.Extensions.getExtensionParsedValue(extensions, org.bouncycastle.asn1.x509.Extension.extendedKeyUsage));
    }

    public ExtendedKeyUsage(org.bouncycastle.asn1.x509.KeyPurposeId[] keyPurposeIdArr) {
        org.bouncycastle.asn1.ASN1EncodableVector aSN1EncodableVector = new org.bouncycastle.asn1.ASN1EncodableVector(keyPurposeIdArr.length);
        for (int i = 0; i != keyPurposeIdArr.length; i++) {
            aSN1EncodableVector.add(keyPurposeIdArr[i]);
            java.util.Hashtable hashtable = this.Camera2StreamConfigurationMap;
            org.bouncycastle.asn1.x509.KeyPurposeId keyPurposeId = keyPurposeIdArr[i];
            hashtable.put(keyPurposeId, keyPurposeId);
        }
        this.getHighSpeedVideoSizes = new org.bouncycastle.asn1.DERSequence(aSN1EncodableVector);
    }

    public ExtendedKeyUsage(org.bouncycastle.asn1.x509.KeyPurposeId keyPurposeId) {
        this.getHighSpeedVideoSizes = new org.bouncycastle.asn1.DERSequence(keyPurposeId);
        this.Camera2StreamConfigurationMap.put(keyPurposeId, keyPurposeId);
    }

    private ExtendedKeyUsage(org.bouncycastle.asn1.ASN1Sequence aSN1Sequence) {
        this.getHighSpeedVideoSizes = aSN1Sequence;
        java.util.Enumeration objects = aSN1Sequence.getObjects();
        while (objects.hasMoreElements()) {
            org.bouncycastle.asn1.ASN1Encodable aSN1Encodable = (org.bouncycastle.asn1.ASN1Encodable) objects.nextElement();
            if (!(aSN1Encodable.toASN1Primitive() instanceof org.bouncycastle.asn1.ASN1ObjectIdentifier)) {
                throw new java.lang.IllegalArgumentException("Only ASN1ObjectIdentifiers allowed in ExtendedKeyUsage.");
            }
            this.Camera2StreamConfigurationMap.put(aSN1Encodable, aSN1Encodable);
        }
    }

    public ExtendedKeyUsage(java.util.Vector vector) {
        org.bouncycastle.asn1.ASN1EncodableVector aSN1EncodableVector = new org.bouncycastle.asn1.ASN1EncodableVector(vector.size());
        java.util.Enumeration elements = vector.elements();
        while (elements.hasMoreElements()) {
            org.bouncycastle.asn1.x509.KeyPurposeId keyPurposeId = org.bouncycastle.asn1.x509.KeyPurposeId.getInstance(elements.nextElement());
            aSN1EncodableVector.add(keyPurposeId);
            this.Camera2StreamConfigurationMap.put(keyPurposeId, keyPurposeId);
        }
        this.getHighSpeedVideoSizes = new org.bouncycastle.asn1.DERSequence(aSN1EncodableVector);
    }
}
