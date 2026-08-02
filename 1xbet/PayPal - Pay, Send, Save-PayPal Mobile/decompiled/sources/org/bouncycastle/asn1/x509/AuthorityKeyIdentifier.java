package org.bouncycastle.asn1.x509;

/* loaded from: classes17.dex */
public class AuthorityKeyIdentifier extends org.bouncycastle.asn1.ASN1Object {
    org.bouncycastle.asn1.x509.GeneralNames Camera2StreamConfigurationMap;
    org.bouncycastle.asn1.ASN1OctetString getHighSpeedVideoFpsRangesFor;
    org.bouncycastle.asn1.ASN1Integer getHighSpeedVideoSizes;

    public java.lang.String toString() {
        org.bouncycastle.asn1.ASN1OctetString aSN1OctetString = this.getHighSpeedVideoFpsRangesFor;
        java.lang.String hexString = aSN1OctetString != null ? org.bouncycastle.util.encoders.Hex.toHexString(aSN1OctetString.getOctets()) : "null";
        java.lang.StringBuilder sb = new java.lang.StringBuilder("AuthorityKeyIdentifier: KeyID(");
        sb.append(hexString);
        sb.append(")");
        return sb.toString();
    }

    @Override // org.bouncycastle.asn1.ASN1Object, org.bouncycastle.asn1.ASN1Encodable
    public org.bouncycastle.asn1.ASN1Primitive toASN1Primitive() {
        org.bouncycastle.asn1.ASN1EncodableVector aSN1EncodableVector = new org.bouncycastle.asn1.ASN1EncodableVector(3);
        org.bouncycastle.asn1.ASN1OctetString aSN1OctetString = this.getHighSpeedVideoFpsRangesFor;
        if (aSN1OctetString != null) {
            aSN1EncodableVector.add(new org.bouncycastle.asn1.DERTaggedObject(false, 0, (org.bouncycastle.asn1.ASN1Encodable) aSN1OctetString));
        }
        org.bouncycastle.asn1.x509.GeneralNames generalNames = this.Camera2StreamConfigurationMap;
        if (generalNames != null) {
            aSN1EncodableVector.add(new org.bouncycastle.asn1.DERTaggedObject(false, 1, (org.bouncycastle.asn1.ASN1Encodable) generalNames));
        }
        org.bouncycastle.asn1.ASN1Integer aSN1Integer = this.getHighSpeedVideoSizes;
        if (aSN1Integer != null) {
            aSN1EncodableVector.add(new org.bouncycastle.asn1.DERTaggedObject(false, 2, (org.bouncycastle.asn1.ASN1Encodable) aSN1Integer));
        }
        return new org.bouncycastle.asn1.DERSequence(aSN1EncodableVector);
    }

    public byte[] getKeyIdentifier() {
        org.bouncycastle.asn1.ASN1OctetString aSN1OctetString = this.getHighSpeedVideoFpsRangesFor;
        if (aSN1OctetString != null) {
            return aSN1OctetString.getOctets();
        }
        return null;
    }

    public java.math.BigInteger getAuthorityCertSerialNumber() {
        org.bouncycastle.asn1.ASN1Integer aSN1Integer = this.getHighSpeedVideoSizes;
        if (aSN1Integer != null) {
            return aSN1Integer.getValue();
        }
        return null;
    }

    public org.bouncycastle.asn1.x509.GeneralNames getAuthorityCertIssuer() {
        return this.Camera2StreamConfigurationMap;
    }

    public static org.bouncycastle.asn1.x509.AuthorityKeyIdentifier getInstance(org.bouncycastle.asn1.ASN1TaggedObject aSN1TaggedObject, boolean z) {
        return getInstance(org.bouncycastle.asn1.ASN1Sequence.getInstance(aSN1TaggedObject, z));
    }

    public static org.bouncycastle.asn1.x509.AuthorityKeyIdentifier getInstance(java.lang.Object obj) {
        if (obj instanceof org.bouncycastle.asn1.x509.AuthorityKeyIdentifier) {
            return (org.bouncycastle.asn1.x509.AuthorityKeyIdentifier) obj;
        }
        if (obj != null) {
            return new org.bouncycastle.asn1.x509.AuthorityKeyIdentifier(org.bouncycastle.asn1.ASN1Sequence.getInstance(obj));
        }
        return null;
    }

    public static org.bouncycastle.asn1.x509.AuthorityKeyIdentifier fromExtensions(org.bouncycastle.asn1.x509.Extensions extensions) {
        return getInstance(org.bouncycastle.asn1.x509.Extensions.getExtensionParsedValue(extensions, org.bouncycastle.asn1.x509.Extension.authorityKeyIdentifier));
    }

    public AuthorityKeyIdentifier(byte[] bArr, org.bouncycastle.asn1.x509.GeneralNames generalNames, java.math.BigInteger bigInteger) {
        this.getHighSpeedVideoFpsRangesFor = null;
        this.Camera2StreamConfigurationMap = null;
        this.getHighSpeedVideoSizes = null;
        this.getHighSpeedVideoFpsRangesFor = bArr != null ? new org.bouncycastle.asn1.DEROctetString(bArr) : null;
        this.Camera2StreamConfigurationMap = generalNames;
        this.getHighSpeedVideoSizes = bigInteger != null ? new org.bouncycastle.asn1.ASN1Integer(bigInteger) : null;
    }

    public AuthorityKeyIdentifier(byte[] bArr) {
        this(bArr, (org.bouncycastle.asn1.x509.GeneralNames) null, (java.math.BigInteger) null);
    }

    public AuthorityKeyIdentifier(org.bouncycastle.asn1.x509.SubjectPublicKeyInfo subjectPublicKeyInfo, org.bouncycastle.asn1.x509.GeneralNames generalNames, java.math.BigInteger bigInteger) {
        this.getHighSpeedVideoFpsRangesFor = null;
        this.Camera2StreamConfigurationMap = null;
        this.getHighSpeedVideoSizes = null;
        org.bouncycastle.crypto.digests.SHA1Digest sHA1Digest = new org.bouncycastle.crypto.digests.SHA1Digest();
        byte[] bArr = new byte[sHA1Digest.getDigestSize()];
        byte[] bytes = subjectPublicKeyInfo.getPublicKeyData().getBytes();
        sHA1Digest.update(bytes, 0, bytes.length);
        sHA1Digest.doFinal(bArr, 0);
        this.getHighSpeedVideoFpsRangesFor = new org.bouncycastle.asn1.DEROctetString(bArr);
        this.Camera2StreamConfigurationMap = generalNames;
        this.getHighSpeedVideoSizes = bigInteger != null ? new org.bouncycastle.asn1.ASN1Integer(bigInteger) : null;
    }

    public AuthorityKeyIdentifier(org.bouncycastle.asn1.x509.SubjectPublicKeyInfo subjectPublicKeyInfo) {
        this(subjectPublicKeyInfo, (org.bouncycastle.asn1.x509.GeneralNames) null, (java.math.BigInteger) null);
    }

    public AuthorityKeyIdentifier(org.bouncycastle.asn1.x509.GeneralNames generalNames, java.math.BigInteger bigInteger) {
        this((byte[]) null, generalNames, bigInteger);
    }

    public AuthorityKeyIdentifier(org.bouncycastle.asn1.ASN1Sequence aSN1Sequence) {
        this.getHighSpeedVideoFpsRangesFor = null;
        this.Camera2StreamConfigurationMap = null;
        this.getHighSpeedVideoSizes = null;
        java.util.Enumeration objects = aSN1Sequence.getObjects();
        while (objects.hasMoreElements()) {
            org.bouncycastle.asn1.ASN1TaggedObject aSN1TaggedObject = org.bouncycastle.asn1.ASN1TaggedObject.getInstance(objects.nextElement());
            int tagNo = aSN1TaggedObject.getTagNo();
            if (tagNo == 0) {
                this.getHighSpeedVideoFpsRangesFor = org.bouncycastle.asn1.ASN1OctetString.getInstance(aSN1TaggedObject, false);
            } else if (tagNo == 1) {
                this.Camera2StreamConfigurationMap = org.bouncycastle.asn1.x509.GeneralNames.getInstance(aSN1TaggedObject, false);
            } else {
                if (tagNo != 2) {
                    throw new java.lang.IllegalArgumentException("illegal tag");
                }
                this.getHighSpeedVideoSizes = org.bouncycastle.asn1.ASN1Integer.getInstance(aSN1TaggedObject, false);
            }
        }
    }
}
