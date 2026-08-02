package org.bouncycastle.asn1.x509.qualified;

/* loaded from: classes17.dex */
public class TypeOfBiometricData extends org.bouncycastle.asn1.ASN1Object implements org.bouncycastle.asn1.ASN1Choice {
    public static final int HANDWRITTEN_SIGNATURE = 1;
    public static final int PICTURE = 0;
    org.bouncycastle.asn1.ASN1Encodable Camera2StreamConfigurationMap;

    @Override // org.bouncycastle.asn1.ASN1Object, org.bouncycastle.asn1.ASN1Encodable
    public org.bouncycastle.asn1.ASN1Primitive toASN1Primitive() {
        return this.Camera2StreamConfigurationMap.toASN1Primitive();
    }

    public boolean isPredefined() {
        return this.Camera2StreamConfigurationMap instanceof org.bouncycastle.asn1.ASN1Integer;
    }

    public int getPredefinedBiometricType() {
        return ((org.bouncycastle.asn1.ASN1Integer) this.Camera2StreamConfigurationMap).intValueExact();
    }

    public org.bouncycastle.asn1.ASN1ObjectIdentifier getBiometricDataOid() {
        return (org.bouncycastle.asn1.ASN1ObjectIdentifier) this.Camera2StreamConfigurationMap;
    }

    public static org.bouncycastle.asn1.x509.qualified.TypeOfBiometricData getInstance(java.lang.Object obj) {
        if (obj == null || (obj instanceof org.bouncycastle.asn1.x509.qualified.TypeOfBiometricData)) {
            return (org.bouncycastle.asn1.x509.qualified.TypeOfBiometricData) obj;
        }
        if (obj instanceof org.bouncycastle.asn1.ASN1Integer) {
            return new org.bouncycastle.asn1.x509.qualified.TypeOfBiometricData(org.bouncycastle.asn1.ASN1Integer.getInstance(obj).intValueExact());
        }
        if (obj instanceof org.bouncycastle.asn1.ASN1ObjectIdentifier) {
            return new org.bouncycastle.asn1.x509.qualified.TypeOfBiometricData(org.bouncycastle.asn1.ASN1ObjectIdentifier.getInstance(obj));
        }
        throw new java.lang.IllegalArgumentException("unknown object in getInstance");
    }

    public TypeOfBiometricData(org.bouncycastle.asn1.ASN1ObjectIdentifier aSN1ObjectIdentifier) {
        this.Camera2StreamConfigurationMap = aSN1ObjectIdentifier;
    }

    public TypeOfBiometricData(int i) {
        if (i != 0 && i != 1) {
            throw new java.lang.IllegalArgumentException("unknow PredefinedBiometricType : ".concat(java.lang.String.valueOf(i)));
        }
        this.Camera2StreamConfigurationMap = new org.bouncycastle.asn1.ASN1Integer(i);
    }
}
