package org.bouncycastle.asn1.pkcs;

/* loaded from: classes17.dex */
public class PrivateKeyInfo extends org.bouncycastle.asn1.ASN1Object {
    private org.bouncycastle.asn1.ASN1OctetString Camera2StreamConfigurationMap;
    private org.bouncycastle.asn1.ASN1Set getHighResolutionOutputSizeshNQ4ISI;
    private org.bouncycastle.asn1.x509.AlgorithmIdentifier getHighSpeedVideoFpsRanges;
    private org.bouncycastle.asn1.ASN1Integer getHighSpeedVideoFpsRangesFor;
    private org.bouncycastle.asn1.ASN1BitString getHighSpeedVideoSizes;

    private PrivateKeyInfo(org.bouncycastle.asn1.ASN1Sequence aSN1Sequence) {
        java.util.Enumeration objects = aSN1Sequence.getObjects();
        org.bouncycastle.asn1.ASN1Integer aSN1Integer = org.bouncycastle.asn1.ASN1Integer.getInstance(objects.nextElement());
        this.getHighSpeedVideoFpsRangesFor = aSN1Integer;
        int intValueExact = aSN1Integer.intValueExact();
        if (intValueExact < 0 || intValueExact > 1) {
            throw new java.lang.IllegalArgumentException("invalid version for private key info");
        }
        this.getHighSpeedVideoFpsRanges = org.bouncycastle.asn1.x509.AlgorithmIdentifier.getInstance(objects.nextElement());
        this.Camera2StreamConfigurationMap = org.bouncycastle.asn1.ASN1OctetString.getInstance(objects.nextElement());
        int i = -1;
        while (objects.hasMoreElements()) {
            org.bouncycastle.asn1.ASN1TaggedObject aSN1TaggedObject = (org.bouncycastle.asn1.ASN1TaggedObject) objects.nextElement();
            int tagNo = aSN1TaggedObject.getTagNo();
            if (tagNo <= i) {
                throw new java.lang.IllegalArgumentException("invalid optional field in private key info");
            }
            if (tagNo == 0) {
                this.getHighResolutionOutputSizeshNQ4ISI = org.bouncycastle.asn1.ASN1Set.getInstance(aSN1TaggedObject, false);
            } else {
                if (tagNo != 1) {
                    throw new java.lang.IllegalArgumentException("unknown optional field in private key info");
                }
                if (intValueExact <= 0) {
                    throw new java.lang.IllegalArgumentException("'publicKey' requires version v2(1) or later");
                }
                this.getHighSpeedVideoSizes = org.bouncycastle.asn1.DERBitString.getInstance(aSN1TaggedObject, false);
            }
            i = tagNo;
        }
    }

    @Override // org.bouncycastle.asn1.ASN1Object, org.bouncycastle.asn1.ASN1Encodable
    public org.bouncycastle.asn1.ASN1Primitive toASN1Primitive() {
        org.bouncycastle.asn1.ASN1EncodableVector aSN1EncodableVector = new org.bouncycastle.asn1.ASN1EncodableVector(5);
        aSN1EncodableVector.add(this.getHighSpeedVideoFpsRangesFor);
        aSN1EncodableVector.add(this.getHighSpeedVideoFpsRanges);
        aSN1EncodableVector.add(this.Camera2StreamConfigurationMap);
        org.bouncycastle.asn1.ASN1Set aSN1Set = this.getHighResolutionOutputSizeshNQ4ISI;
        if (aSN1Set != null) {
            aSN1EncodableVector.add(new org.bouncycastle.asn1.DERTaggedObject(false, 0, (org.bouncycastle.asn1.ASN1Encodable) aSN1Set));
        }
        org.bouncycastle.asn1.ASN1BitString aSN1BitString = this.getHighSpeedVideoSizes;
        if (aSN1BitString != null) {
            aSN1EncodableVector.add(new org.bouncycastle.asn1.DERTaggedObject(false, 1, (org.bouncycastle.asn1.ASN1Encodable) aSN1BitString));
        }
        return new org.bouncycastle.asn1.DERSequence(aSN1EncodableVector);
    }

    public org.bouncycastle.asn1.ASN1Encodable parsePublicKey() throws java.io.IOException {
        org.bouncycastle.asn1.ASN1BitString aSN1BitString = this.getHighSpeedVideoSizes;
        if (aSN1BitString == null) {
            return null;
        }
        return org.bouncycastle.asn1.ASN1Primitive.fromByteArray(aSN1BitString.getOctets());
    }

    public org.bouncycastle.asn1.ASN1Encodable parsePrivateKey() throws java.io.IOException {
        return org.bouncycastle.asn1.ASN1Primitive.fromByteArray(this.Camera2StreamConfigurationMap.getOctets());
    }

    public boolean hasPublicKey() {
        return this.getHighSpeedVideoSizes != null;
    }

    public org.bouncycastle.asn1.ASN1Integer getVersion() {
        return this.getHighSpeedVideoFpsRangesFor;
    }

    public org.bouncycastle.asn1.ASN1BitString getPublicKeyData() {
        return this.getHighSpeedVideoSizes;
    }

    public org.bouncycastle.asn1.x509.AlgorithmIdentifier getPrivateKeyAlgorithm() {
        return this.getHighSpeedVideoFpsRanges;
    }

    public org.bouncycastle.asn1.ASN1OctetString getPrivateKey() {
        return new org.bouncycastle.asn1.DEROctetString(this.Camera2StreamConfigurationMap.getOctets());
    }

    public org.bouncycastle.asn1.ASN1Set getAttributes() {
        return this.getHighResolutionOutputSizeshNQ4ISI;
    }

    public static org.bouncycastle.asn1.pkcs.PrivateKeyInfo getInstance(org.bouncycastle.asn1.ASN1TaggedObject aSN1TaggedObject, boolean z) {
        return getInstance(org.bouncycastle.asn1.ASN1Sequence.getInstance(aSN1TaggedObject, z));
    }

    public static org.bouncycastle.asn1.pkcs.PrivateKeyInfo getInstance(java.lang.Object obj) {
        if (obj instanceof org.bouncycastle.asn1.pkcs.PrivateKeyInfo) {
            return (org.bouncycastle.asn1.pkcs.PrivateKeyInfo) obj;
        }
        if (obj != null) {
            return new org.bouncycastle.asn1.pkcs.PrivateKeyInfo(org.bouncycastle.asn1.ASN1Sequence.getInstance(obj));
        }
        return null;
    }

    public PrivateKeyInfo(org.bouncycastle.asn1.x509.AlgorithmIdentifier algorithmIdentifier, org.bouncycastle.asn1.ASN1Encodable aSN1Encodable, org.bouncycastle.asn1.ASN1Set aSN1Set, byte[] bArr) throws java.io.IOException {
        this.getHighSpeedVideoFpsRangesFor = new org.bouncycastle.asn1.ASN1Integer(bArr != null ? org.bouncycastle.util.BigIntegers.ONE : org.bouncycastle.util.BigIntegers.ZERO);
        this.getHighSpeedVideoFpsRanges = algorithmIdentifier;
        this.Camera2StreamConfigurationMap = new org.bouncycastle.asn1.DEROctetString(aSN1Encodable);
        this.getHighResolutionOutputSizeshNQ4ISI = aSN1Set;
        this.getHighSpeedVideoSizes = bArr == null ? null : new org.bouncycastle.asn1.DERBitString(bArr);
    }

    public PrivateKeyInfo(org.bouncycastle.asn1.x509.AlgorithmIdentifier algorithmIdentifier, org.bouncycastle.asn1.ASN1Encodable aSN1Encodable, org.bouncycastle.asn1.ASN1Set aSN1Set) throws java.io.IOException {
        this(algorithmIdentifier, aSN1Encodable, aSN1Set, null);
    }

    public PrivateKeyInfo(org.bouncycastle.asn1.x509.AlgorithmIdentifier algorithmIdentifier, org.bouncycastle.asn1.ASN1Encodable aSN1Encodable) throws java.io.IOException {
        this(algorithmIdentifier, aSN1Encodable, null, null);
    }
}
