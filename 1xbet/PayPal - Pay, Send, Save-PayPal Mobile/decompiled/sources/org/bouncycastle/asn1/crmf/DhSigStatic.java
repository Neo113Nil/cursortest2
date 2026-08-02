package org.bouncycastle.asn1.crmf;

/* loaded from: classes17.dex */
public class DhSigStatic extends org.bouncycastle.asn1.ASN1Object {
    private final org.bouncycastle.asn1.ASN1OctetString Camera2StreamConfigurationMap;
    private final org.bouncycastle.asn1.cms.IssuerAndSerialNumber getHighResolutionOutputSizeshNQ4ISI;

    @Override // org.bouncycastle.asn1.ASN1Object, org.bouncycastle.asn1.ASN1Encodable
    public org.bouncycastle.asn1.ASN1Primitive toASN1Primitive() {
        org.bouncycastle.asn1.ASN1EncodableVector aSN1EncodableVector = new org.bouncycastle.asn1.ASN1EncodableVector(2);
        org.bouncycastle.asn1.cms.IssuerAndSerialNumber issuerAndSerialNumber = this.getHighResolutionOutputSizeshNQ4ISI;
        if (issuerAndSerialNumber != null) {
            aSN1EncodableVector.add(issuerAndSerialNumber);
        }
        aSN1EncodableVector.add(this.Camera2StreamConfigurationMap);
        return new org.bouncycastle.asn1.DERSequence(aSN1EncodableVector);
    }

    public org.bouncycastle.asn1.cms.IssuerAndSerialNumber getIssuerAndSerial() {
        return this.getHighResolutionOutputSizeshNQ4ISI;
    }

    public byte[] getHashValue() {
        return org.bouncycastle.util.Arrays.clone(this.Camera2StreamConfigurationMap.getOctets());
    }

    public static org.bouncycastle.asn1.crmf.DhSigStatic getInstance(java.lang.Object obj) {
        if (obj instanceof org.bouncycastle.asn1.crmf.DhSigStatic) {
            return (org.bouncycastle.asn1.crmf.DhSigStatic) obj;
        }
        if (obj != null) {
            return new org.bouncycastle.asn1.crmf.DhSigStatic(org.bouncycastle.asn1.ASN1Sequence.getInstance(obj));
        }
        return null;
    }

    public DhSigStatic(byte[] bArr) {
        this(null, bArr);
    }

    public DhSigStatic(org.bouncycastle.asn1.cms.IssuerAndSerialNumber issuerAndSerialNumber, byte[] bArr) {
        this.getHighResolutionOutputSizeshNQ4ISI = issuerAndSerialNumber;
        this.Camera2StreamConfigurationMap = new org.bouncycastle.asn1.DEROctetString(org.bouncycastle.util.Arrays.clone(bArr));
    }

    private DhSigStatic(org.bouncycastle.asn1.ASN1Sequence aSN1Sequence) {
        org.bouncycastle.asn1.ASN1Encodable objectAt;
        if (aSN1Sequence.size() == 1) {
            this.getHighResolutionOutputSizeshNQ4ISI = null;
            objectAt = aSN1Sequence.getObjectAt(0);
        } else {
            if (aSN1Sequence.size() != 2) {
                throw new java.lang.IllegalArgumentException("sequence wrong length for DhSigStatic");
            }
            this.getHighResolutionOutputSizeshNQ4ISI = org.bouncycastle.asn1.cms.IssuerAndSerialNumber.getInstance(aSN1Sequence.getObjectAt(0));
            objectAt = aSN1Sequence.getObjectAt(1);
        }
        this.Camera2StreamConfigurationMap = org.bouncycastle.asn1.ASN1OctetString.getInstance(objectAt);
    }
}
