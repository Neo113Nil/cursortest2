package org.bouncycastle.asn1.ess;

/* loaded from: classes17.dex */
public class ESSCertIDv2 extends org.bouncycastle.asn1.ASN1Object {
    private static final org.bouncycastle.asn1.x509.AlgorithmIdentifier getHighSpeedVideoSizes = new org.bouncycastle.asn1.x509.AlgorithmIdentifier(org.bouncycastle.asn1.nist.NISTObjectIdentifiers.id_sha256);
    private org.bouncycastle.asn1.x509.AlgorithmIdentifier Camera2StreamConfigurationMap;
    private byte[] getHighSpeedVideoFpsRanges;
    private org.bouncycastle.asn1.x509.IssuerSerial getHighSpeedVideoFpsRangesFor;

    @Override // org.bouncycastle.asn1.ASN1Object, org.bouncycastle.asn1.ASN1Encodable
    public org.bouncycastle.asn1.ASN1Primitive toASN1Primitive() {
        org.bouncycastle.asn1.ASN1EncodableVector aSN1EncodableVector = new org.bouncycastle.asn1.ASN1EncodableVector(3);
        if (!this.Camera2StreamConfigurationMap.equals(getHighSpeedVideoSizes)) {
            aSN1EncodableVector.add(this.Camera2StreamConfigurationMap);
        }
        aSN1EncodableVector.add(new org.bouncycastle.asn1.DEROctetString(this.getHighSpeedVideoFpsRanges).toASN1Primitive());
        org.bouncycastle.asn1.x509.IssuerSerial issuerSerial = this.getHighSpeedVideoFpsRangesFor;
        if (issuerSerial != null) {
            aSN1EncodableVector.add(issuerSerial);
        }
        return new org.bouncycastle.asn1.DERSequence(aSN1EncodableVector);
    }

    public org.bouncycastle.asn1.x509.IssuerSerial getIssuerSerial() {
        return this.getHighSpeedVideoFpsRangesFor;
    }

    public org.bouncycastle.asn1.x509.AlgorithmIdentifier getHashAlgorithm() {
        return this.Camera2StreamConfigurationMap;
    }

    public byte[] getCertHash() {
        return org.bouncycastle.util.Arrays.clone(this.getHighSpeedVideoFpsRanges);
    }

    public static org.bouncycastle.asn1.ess.ESSCertIDv2 getInstance(java.lang.Object obj) {
        if (obj instanceof org.bouncycastle.asn1.ess.ESSCertIDv2) {
            return (org.bouncycastle.asn1.ess.ESSCertIDv2) obj;
        }
        if (obj != null) {
            return new org.bouncycastle.asn1.ess.ESSCertIDv2(org.bouncycastle.asn1.ASN1Sequence.getInstance(obj));
        }
        return null;
    }

    public ESSCertIDv2(byte[] bArr, org.bouncycastle.asn1.x509.IssuerSerial issuerSerial) {
        this(null, bArr, issuerSerial);
    }

    public ESSCertIDv2(byte[] bArr) {
        this(null, bArr, null);
    }

    public ESSCertIDv2(org.bouncycastle.asn1.x509.AlgorithmIdentifier algorithmIdentifier, byte[] bArr, org.bouncycastle.asn1.x509.IssuerSerial issuerSerial) {
        this.Camera2StreamConfigurationMap = algorithmIdentifier == null ? getHighSpeedVideoSizes : algorithmIdentifier;
        this.getHighSpeedVideoFpsRanges = org.bouncycastle.util.Arrays.clone(bArr);
        this.getHighSpeedVideoFpsRangesFor = issuerSerial;
    }

    public ESSCertIDv2(org.bouncycastle.asn1.x509.AlgorithmIdentifier algorithmIdentifier, byte[] bArr) {
        this(algorithmIdentifier, bArr, null);
    }

    private ESSCertIDv2(org.bouncycastle.asn1.ASN1Sequence aSN1Sequence) {
        if (aSN1Sequence.size() > 3) {
            java.lang.StringBuilder sb = new java.lang.StringBuilder("Bad sequence size: ");
            sb.append(aSN1Sequence.size());
            throw new java.lang.IllegalArgumentException(sb.toString());
        }
        int i = 0;
        if (aSN1Sequence.getObjectAt(0) instanceof org.bouncycastle.asn1.ASN1OctetString) {
            this.Camera2StreamConfigurationMap = getHighSpeedVideoSizes;
        } else {
            this.Camera2StreamConfigurationMap = org.bouncycastle.asn1.x509.AlgorithmIdentifier.getInstance(aSN1Sequence.getObjectAt(0).toASN1Primitive());
            i = 1;
        }
        int i2 = i + 1;
        this.getHighSpeedVideoFpsRanges = org.bouncycastle.asn1.ASN1OctetString.getInstance(aSN1Sequence.getObjectAt(i).toASN1Primitive()).getOctets();
        if (aSN1Sequence.size() > i2) {
            this.getHighSpeedVideoFpsRangesFor = org.bouncycastle.asn1.x509.IssuerSerial.getInstance(aSN1Sequence.getObjectAt(i2));
        }
    }
}
