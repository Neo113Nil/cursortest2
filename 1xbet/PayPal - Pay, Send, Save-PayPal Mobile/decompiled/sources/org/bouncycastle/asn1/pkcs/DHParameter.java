package org.bouncycastle.asn1.pkcs;

/* loaded from: classes17.dex */
public class DHParameter extends org.bouncycastle.asn1.ASN1Object {
    org.bouncycastle.asn1.ASN1Integer Camera2StreamConfigurationMap;
    org.bouncycastle.asn1.ASN1Integer getHighResolutionOutputSizeshNQ4ISI;
    org.bouncycastle.asn1.ASN1Integer getHighSpeedVideoSizes;

    @Override // org.bouncycastle.asn1.ASN1Object, org.bouncycastle.asn1.ASN1Encodable
    public org.bouncycastle.asn1.ASN1Primitive toASN1Primitive() {
        org.bouncycastle.asn1.ASN1EncodableVector aSN1EncodableVector = new org.bouncycastle.asn1.ASN1EncodableVector(3);
        aSN1EncodableVector.add(this.getHighSpeedVideoSizes);
        aSN1EncodableVector.add(this.Camera2StreamConfigurationMap);
        if (getL() != null) {
            aSN1EncodableVector.add(this.getHighResolutionOutputSizeshNQ4ISI);
        }
        return new org.bouncycastle.asn1.DERSequence(aSN1EncodableVector);
    }

    public java.math.BigInteger getP() {
        return this.getHighSpeedVideoSizes.getPositiveValue();
    }

    public java.math.BigInteger getL() {
        org.bouncycastle.asn1.ASN1Integer aSN1Integer = this.getHighResolutionOutputSizeshNQ4ISI;
        if (aSN1Integer == null) {
            return null;
        }
        return aSN1Integer.getPositiveValue();
    }

    public java.math.BigInteger getG() {
        return this.Camera2StreamConfigurationMap.getPositiveValue();
    }

    public static org.bouncycastle.asn1.pkcs.DHParameter getInstance(java.lang.Object obj) {
        if (obj instanceof org.bouncycastle.asn1.pkcs.DHParameter) {
            return (org.bouncycastle.asn1.pkcs.DHParameter) obj;
        }
        if (obj != null) {
            return new org.bouncycastle.asn1.pkcs.DHParameter(org.bouncycastle.asn1.ASN1Sequence.getInstance(obj));
        }
        return null;
    }

    private DHParameter(org.bouncycastle.asn1.ASN1Sequence aSN1Sequence) {
        java.util.Enumeration objects = aSN1Sequence.getObjects();
        this.getHighSpeedVideoSizes = org.bouncycastle.asn1.ASN1Integer.getInstance(objects.nextElement());
        this.Camera2StreamConfigurationMap = org.bouncycastle.asn1.ASN1Integer.getInstance(objects.nextElement());
        this.getHighResolutionOutputSizeshNQ4ISI = objects.hasMoreElements() ? (org.bouncycastle.asn1.ASN1Integer) objects.nextElement() : null;
    }

    public DHParameter(java.math.BigInteger bigInteger, java.math.BigInteger bigInteger2, int i) {
        this.getHighSpeedVideoSizes = new org.bouncycastle.asn1.ASN1Integer(bigInteger);
        this.Camera2StreamConfigurationMap = new org.bouncycastle.asn1.ASN1Integer(bigInteger2);
        this.getHighResolutionOutputSizeshNQ4ISI = i != 0 ? new org.bouncycastle.asn1.ASN1Integer(i) : null;
    }
}
