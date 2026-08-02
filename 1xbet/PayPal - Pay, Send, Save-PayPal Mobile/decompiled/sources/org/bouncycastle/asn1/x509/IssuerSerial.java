package org.bouncycastle.asn1.x509;

/* loaded from: classes17.dex */
public class IssuerSerial extends org.bouncycastle.asn1.ASN1Object {
    org.bouncycastle.asn1.x509.GeneralNames getHighSpeedVideoFpsRanges;
    org.bouncycastle.asn1.ASN1BitString getHighSpeedVideoFpsRangesFor;
    org.bouncycastle.asn1.ASN1Integer getHighSpeedVideoSizes;

    @Override // org.bouncycastle.asn1.ASN1Object, org.bouncycastle.asn1.ASN1Encodable
    public org.bouncycastle.asn1.ASN1Primitive toASN1Primitive() {
        org.bouncycastle.asn1.ASN1EncodableVector aSN1EncodableVector = new org.bouncycastle.asn1.ASN1EncodableVector(3);
        aSN1EncodableVector.add(this.getHighSpeedVideoFpsRanges);
        aSN1EncodableVector.add(this.getHighSpeedVideoSizes);
        org.bouncycastle.asn1.ASN1BitString aSN1BitString = this.getHighSpeedVideoFpsRangesFor;
        if (aSN1BitString != null) {
            aSN1EncodableVector.add(aSN1BitString);
        }
        return new org.bouncycastle.asn1.DERSequence(aSN1EncodableVector);
    }

    public org.bouncycastle.asn1.ASN1Integer getSerial() {
        return this.getHighSpeedVideoSizes;
    }

    public org.bouncycastle.asn1.ASN1BitString getIssuerUID() {
        return this.getHighSpeedVideoFpsRangesFor;
    }

    public org.bouncycastle.asn1.x509.GeneralNames getIssuer() {
        return this.getHighSpeedVideoFpsRanges;
    }

    public static org.bouncycastle.asn1.x509.IssuerSerial getInstance(org.bouncycastle.asn1.ASN1TaggedObject aSN1TaggedObject, boolean z) {
        return getInstance(org.bouncycastle.asn1.ASN1Sequence.getInstance(aSN1TaggedObject, z));
    }

    public static org.bouncycastle.asn1.x509.IssuerSerial getInstance(java.lang.Object obj) {
        if (obj instanceof org.bouncycastle.asn1.x509.IssuerSerial) {
            return (org.bouncycastle.asn1.x509.IssuerSerial) obj;
        }
        if (obj != null) {
            return new org.bouncycastle.asn1.x509.IssuerSerial(org.bouncycastle.asn1.ASN1Sequence.getInstance(obj));
        }
        return null;
    }

    public IssuerSerial(org.bouncycastle.asn1.x509.GeneralNames generalNames, org.bouncycastle.asn1.ASN1Integer aSN1Integer) {
        this.getHighSpeedVideoFpsRanges = generalNames;
        this.getHighSpeedVideoSizes = aSN1Integer;
    }

    public IssuerSerial(org.bouncycastle.asn1.x509.GeneralNames generalNames, java.math.BigInteger bigInteger) {
        this(generalNames, new org.bouncycastle.asn1.ASN1Integer(bigInteger));
    }

    public IssuerSerial(org.bouncycastle.asn1.x500.X500Name x500Name, java.math.BigInteger bigInteger) {
        this(new org.bouncycastle.asn1.x509.GeneralNames(new org.bouncycastle.asn1.x509.GeneralName(x500Name)), new org.bouncycastle.asn1.ASN1Integer(bigInteger));
    }

    private IssuerSerial(org.bouncycastle.asn1.ASN1Sequence aSN1Sequence) {
        if (aSN1Sequence.size() != 2 && aSN1Sequence.size() != 3) {
            java.lang.StringBuilder sb = new java.lang.StringBuilder("Bad sequence size: ");
            sb.append(aSN1Sequence.size());
            throw new java.lang.IllegalArgumentException(sb.toString());
        }
        this.getHighSpeedVideoFpsRanges = org.bouncycastle.asn1.x509.GeneralNames.getInstance(aSN1Sequence.getObjectAt(0));
        this.getHighSpeedVideoSizes = org.bouncycastle.asn1.ASN1Integer.getInstance(aSN1Sequence.getObjectAt(1));
        if (aSN1Sequence.size() == 3) {
            this.getHighSpeedVideoFpsRangesFor = org.bouncycastle.asn1.DERBitString.getInstance((java.lang.Object) aSN1Sequence.getObjectAt(2));
        }
    }
}
