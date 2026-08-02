package org.bouncycastle.asn1.esf;

/* loaded from: classes17.dex */
public class OtherHash extends org.bouncycastle.asn1.ASN1Object implements org.bouncycastle.asn1.ASN1Choice {
    private org.bouncycastle.asn1.esf.OtherHashAlgAndValue Camera2StreamConfigurationMap;
    private org.bouncycastle.asn1.ASN1OctetString getHighResolutionOutputSizeshNQ4ISI;

    @Override // org.bouncycastle.asn1.ASN1Object, org.bouncycastle.asn1.ASN1Encodable
    public org.bouncycastle.asn1.ASN1Primitive toASN1Primitive() {
        org.bouncycastle.asn1.esf.OtherHashAlgAndValue otherHashAlgAndValue = this.Camera2StreamConfigurationMap;
        return otherHashAlgAndValue == null ? this.getHighResolutionOutputSizeshNQ4ISI : otherHashAlgAndValue.toASN1Primitive();
    }

    public byte[] getHashValue() {
        org.bouncycastle.asn1.esf.OtherHashAlgAndValue otherHashAlgAndValue = this.Camera2StreamConfigurationMap;
        return (otherHashAlgAndValue == null ? this.getHighResolutionOutputSizeshNQ4ISI : otherHashAlgAndValue.getHashValue()).getOctets();
    }

    public org.bouncycastle.asn1.x509.AlgorithmIdentifier getHashAlgorithm() {
        org.bouncycastle.asn1.esf.OtherHashAlgAndValue otherHashAlgAndValue = this.Camera2StreamConfigurationMap;
        return otherHashAlgAndValue == null ? new org.bouncycastle.asn1.x509.AlgorithmIdentifier(org.bouncycastle.asn1.oiw.OIWObjectIdentifiers.idSHA1) : otherHashAlgAndValue.getHashAlgorithm();
    }

    public static org.bouncycastle.asn1.esf.OtherHash getInstance(java.lang.Object obj) {
        return obj instanceof org.bouncycastle.asn1.esf.OtherHash ? (org.bouncycastle.asn1.esf.OtherHash) obj : obj instanceof org.bouncycastle.asn1.ASN1OctetString ? new org.bouncycastle.asn1.esf.OtherHash((org.bouncycastle.asn1.ASN1OctetString) obj) : new org.bouncycastle.asn1.esf.OtherHash(org.bouncycastle.asn1.esf.OtherHashAlgAndValue.getInstance(obj));
    }

    public OtherHash(byte[] bArr) {
        this.getHighResolutionOutputSizeshNQ4ISI = new org.bouncycastle.asn1.DEROctetString(bArr);
    }

    public OtherHash(org.bouncycastle.asn1.esf.OtherHashAlgAndValue otherHashAlgAndValue) {
        this.Camera2StreamConfigurationMap = otherHashAlgAndValue;
    }

    private OtherHash(org.bouncycastle.asn1.ASN1OctetString aSN1OctetString) {
        this.getHighResolutionOutputSizeshNQ4ISI = aSN1OctetString;
    }
}
