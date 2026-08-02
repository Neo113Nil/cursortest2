package org.bouncycastle.asn1.pkcs;

/* loaded from: classes17.dex */
public class PBKDF2Params extends org.bouncycastle.asn1.ASN1Object {
    private static final org.bouncycastle.asn1.x509.AlgorithmIdentifier getHighSpeedVideoFpsRanges = new org.bouncycastle.asn1.x509.AlgorithmIdentifier(org.bouncycastle.asn1.pkcs.PKCSObjectIdentifiers.id_hmacWithSHA1, org.bouncycastle.asn1.DERNull.INSTANCE);
    private final org.bouncycastle.asn1.ASN1OctetString Camera2StreamConfigurationMap;
    private final org.bouncycastle.asn1.ASN1Integer getHighResolutionOutputSizeshNQ4ISI;
    private final org.bouncycastle.asn1.x509.AlgorithmIdentifier getHighSpeedVideoFpsRangesFor;
    private final org.bouncycastle.asn1.ASN1Integer getHighSpeedVideoSizes;

    @Override // org.bouncycastle.asn1.ASN1Object, org.bouncycastle.asn1.ASN1Encodable
    public org.bouncycastle.asn1.ASN1Primitive toASN1Primitive() {
        org.bouncycastle.asn1.ASN1EncodableVector aSN1EncodableVector = new org.bouncycastle.asn1.ASN1EncodableVector(4);
        aSN1EncodableVector.add(this.Camera2StreamConfigurationMap);
        aSN1EncodableVector.add(this.getHighResolutionOutputSizeshNQ4ISI);
        org.bouncycastle.asn1.ASN1Integer aSN1Integer = this.getHighSpeedVideoSizes;
        if (aSN1Integer != null) {
            aSN1EncodableVector.add(aSN1Integer);
        }
        org.bouncycastle.asn1.x509.AlgorithmIdentifier algorithmIdentifier = this.getHighSpeedVideoFpsRangesFor;
        if (algorithmIdentifier != null && !algorithmIdentifier.equals(getHighSpeedVideoFpsRanges)) {
            aSN1EncodableVector.add(this.getHighSpeedVideoFpsRangesFor);
        }
        return new org.bouncycastle.asn1.DERSequence(aSN1EncodableVector);
    }

    public boolean isDefaultPrf() {
        org.bouncycastle.asn1.x509.AlgorithmIdentifier algorithmIdentifier = this.getHighSpeedVideoFpsRangesFor;
        return algorithmIdentifier == null || algorithmIdentifier.equals(getHighSpeedVideoFpsRanges);
    }

    public byte[] getSalt() {
        return this.Camera2StreamConfigurationMap.getOctets();
    }

    public org.bouncycastle.asn1.x509.AlgorithmIdentifier getPrf() {
        org.bouncycastle.asn1.x509.AlgorithmIdentifier algorithmIdentifier = this.getHighSpeedVideoFpsRangesFor;
        return algorithmIdentifier != null ? algorithmIdentifier : getHighSpeedVideoFpsRanges;
    }

    public java.math.BigInteger getKeyLength() {
        org.bouncycastle.asn1.ASN1Integer aSN1Integer = this.getHighSpeedVideoSizes;
        if (aSN1Integer != null) {
            return aSN1Integer.getValue();
        }
        return null;
    }

    public java.math.BigInteger getIterationCount() {
        return this.getHighResolutionOutputSizeshNQ4ISI.getValue();
    }

    public static org.bouncycastle.asn1.pkcs.PBKDF2Params getInstance(java.lang.Object obj) {
        if (obj instanceof org.bouncycastle.asn1.pkcs.PBKDF2Params) {
            return (org.bouncycastle.asn1.pkcs.PBKDF2Params) obj;
        }
        if (obj != null) {
            return new org.bouncycastle.asn1.pkcs.PBKDF2Params(org.bouncycastle.asn1.ASN1Sequence.getInstance(obj));
        }
        return null;
    }

    public PBKDF2Params(byte[] bArr, int i, org.bouncycastle.asn1.x509.AlgorithmIdentifier algorithmIdentifier) {
        this(bArr, i, 0, algorithmIdentifier);
    }

    public PBKDF2Params(byte[] bArr, int i, int i2, org.bouncycastle.asn1.x509.AlgorithmIdentifier algorithmIdentifier) {
        this.Camera2StreamConfigurationMap = new org.bouncycastle.asn1.DEROctetString(org.bouncycastle.util.Arrays.clone(bArr));
        this.getHighResolutionOutputSizeshNQ4ISI = new org.bouncycastle.asn1.ASN1Integer(i);
        this.getHighSpeedVideoSizes = i2 > 0 ? new org.bouncycastle.asn1.ASN1Integer(i2) : null;
        this.getHighSpeedVideoFpsRangesFor = algorithmIdentifier;
    }

    public PBKDF2Params(byte[] bArr, int i, int i2) {
        this(bArr, i, i2, null);
    }

    public PBKDF2Params(byte[] bArr, int i) {
        this(bArr, i, 0);
    }

    private PBKDF2Params(org.bouncycastle.asn1.ASN1Sequence aSN1Sequence) {
        java.util.Enumeration objects = aSN1Sequence.getObjects();
        this.Camera2StreamConfigurationMap = (org.bouncycastle.asn1.ASN1OctetString) objects.nextElement();
        this.getHighResolutionOutputSizeshNQ4ISI = (org.bouncycastle.asn1.ASN1Integer) objects.nextElement();
        if (!objects.hasMoreElements()) {
            this.getHighSpeedVideoSizes = null;
            this.getHighSpeedVideoFpsRangesFor = null;
            return;
        }
        java.lang.Object nextElement = objects.nextElement();
        if (nextElement instanceof org.bouncycastle.asn1.ASN1Integer) {
            this.getHighSpeedVideoSizes = org.bouncycastle.asn1.ASN1Integer.getInstance(nextElement);
            nextElement = objects.hasMoreElements() ? objects.nextElement() : null;
        } else {
            this.getHighSpeedVideoSizes = null;
        }
        if (nextElement != null) {
            this.getHighSpeedVideoFpsRangesFor = org.bouncycastle.asn1.x509.AlgorithmIdentifier.getInstance(nextElement);
        } else {
            this.getHighSpeedVideoFpsRangesFor = null;
        }
    }
}
