package org.bouncycastle.asn1.pkcs;

/* loaded from: classes17.dex */
public class RC2CBCParameter extends org.bouncycastle.asn1.ASN1Object {
    org.bouncycastle.asn1.ASN1Integer getHighResolutionOutputSizeshNQ4ISI;
    org.bouncycastle.asn1.ASN1OctetString getHighSpeedVideoFpsRangesFor;

    @Override // org.bouncycastle.asn1.ASN1Object, org.bouncycastle.asn1.ASN1Encodable
    public org.bouncycastle.asn1.ASN1Primitive toASN1Primitive() {
        org.bouncycastle.asn1.ASN1EncodableVector aSN1EncodableVector = new org.bouncycastle.asn1.ASN1EncodableVector(2);
        org.bouncycastle.asn1.ASN1Integer aSN1Integer = this.getHighResolutionOutputSizeshNQ4ISI;
        if (aSN1Integer != null) {
            aSN1EncodableVector.add(aSN1Integer);
        }
        aSN1EncodableVector.add(this.getHighSpeedVideoFpsRangesFor);
        return new org.bouncycastle.asn1.DERSequence(aSN1EncodableVector);
    }

    public java.math.BigInteger getRC2ParameterVersion() {
        org.bouncycastle.asn1.ASN1Integer aSN1Integer = this.getHighResolutionOutputSizeshNQ4ISI;
        if (aSN1Integer == null) {
            return null;
        }
        return aSN1Integer.getValue();
    }

    public byte[] getIV() {
        return this.getHighSpeedVideoFpsRangesFor.getOctets();
    }

    public static org.bouncycastle.asn1.pkcs.RC2CBCParameter getInstance(java.lang.Object obj) {
        if (obj instanceof org.bouncycastle.asn1.pkcs.RC2CBCParameter) {
            return (org.bouncycastle.asn1.pkcs.RC2CBCParameter) obj;
        }
        if (obj != null) {
            return new org.bouncycastle.asn1.pkcs.RC2CBCParameter(org.bouncycastle.asn1.ASN1Sequence.getInstance(obj));
        }
        return null;
    }

    public RC2CBCParameter(byte[] bArr) {
        this.getHighResolutionOutputSizeshNQ4ISI = null;
        this.getHighSpeedVideoFpsRangesFor = new org.bouncycastle.asn1.DEROctetString(bArr);
    }

    private RC2CBCParameter(org.bouncycastle.asn1.ASN1Sequence aSN1Sequence) {
        org.bouncycastle.asn1.ASN1Encodable objectAt;
        if (aSN1Sequence.size() == 1) {
            this.getHighResolutionOutputSizeshNQ4ISI = null;
            objectAt = aSN1Sequence.getObjectAt(0);
        } else {
            this.getHighResolutionOutputSizeshNQ4ISI = (org.bouncycastle.asn1.ASN1Integer) aSN1Sequence.getObjectAt(0);
            objectAt = aSN1Sequence.getObjectAt(1);
        }
        this.getHighSpeedVideoFpsRangesFor = (org.bouncycastle.asn1.ASN1OctetString) objectAt;
    }

    public RC2CBCParameter(int i, byte[] bArr) {
        this.getHighResolutionOutputSizeshNQ4ISI = new org.bouncycastle.asn1.ASN1Integer(i);
        this.getHighSpeedVideoFpsRangesFor = new org.bouncycastle.asn1.DEROctetString(bArr);
    }
}
