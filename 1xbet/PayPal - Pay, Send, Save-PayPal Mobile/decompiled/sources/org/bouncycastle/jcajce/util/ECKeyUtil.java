package org.bouncycastle.jcajce.util;

/* loaded from: classes17.dex */
public class ECKeyUtil {

    static class ECPublicKeyWithCompression implements java.security.interfaces.ECPublicKey {
        private final java.security.interfaces.ECPublicKey getHighSpeedVideoSizes;

        @Override // java.security.interfaces.ECPublicKey
        public java.security.spec.ECPoint getW() {
            return this.getHighSpeedVideoSizes.getW();
        }

        @Override // java.security.interfaces.ECKey
        public java.security.spec.ECParameterSpec getParams() {
            return this.getHighSpeedVideoSizes.getParams();
        }

        @Override // java.security.Key
        public java.lang.String getFormat() {
            return this.getHighSpeedVideoSizes.getFormat();
        }

        @Override // java.security.Key
        public byte[] getEncoded() {
            org.bouncycastle.math.ec.ECCurve curve;
            org.bouncycastle.asn1.x509.SubjectPublicKeyInfo subjectPublicKeyInfo = org.bouncycastle.asn1.x509.SubjectPublicKeyInfo.getInstance(this.getHighSpeedVideoSizes.getEncoded());
            org.bouncycastle.asn1.x9.X962Parameters x962Parameters = org.bouncycastle.asn1.x9.X962Parameters.getInstance(subjectPublicKeyInfo.getAlgorithm().getParameters());
            if (x962Parameters.isNamedCurve()) {
                org.bouncycastle.asn1.ASN1ObjectIdentifier aSN1ObjectIdentifier = (org.bouncycastle.asn1.ASN1ObjectIdentifier) x962Parameters.getParameters();
                org.bouncycastle.asn1.x9.X9ECParameters byOID = org.bouncycastle.crypto.ec.CustomNamedCurves.getByOID(aSN1ObjectIdentifier);
                if (byOID == null) {
                    byOID = org.bouncycastle.asn1.x9.ECNamedCurveTable.getByOID(aSN1ObjectIdentifier);
                }
                curve = byOID.getCurve();
            } else {
                if (x962Parameters.isImplicitlyCA()) {
                    throw new java.lang.IllegalStateException("unable to identify implictlyCA");
                }
                curve = org.bouncycastle.asn1.x9.X9ECParameters.getInstance(x962Parameters.getParameters()).getCurve();
            }
            try {
                return new org.bouncycastle.asn1.x509.SubjectPublicKeyInfo(subjectPublicKeyInfo.getAlgorithm(), org.bouncycastle.asn1.ASN1OctetString.getInstance(new org.bouncycastle.asn1.x9.X9ECPoint(curve.decodePoint(subjectPublicKeyInfo.getPublicKeyData().getOctets()), true).toASN1Primitive()).getOctets()).getEncoded();
            } catch (java.io.IOException e) {
                java.lang.StringBuilder sb = new java.lang.StringBuilder("unable to encode EC public key: ");
                sb.append(e.getMessage());
                throw new java.lang.IllegalStateException(sb.toString());
            }
        }

        @Override // java.security.Key
        public java.lang.String getAlgorithm() {
            return this.getHighSpeedVideoSizes.getAlgorithm();
        }

        public ECPublicKeyWithCompression(java.security.interfaces.ECPublicKey eCPublicKey) {
            this.getHighSpeedVideoSizes = eCPublicKey;
        }
    }

    public static java.security.interfaces.ECPublicKey createKeyWithCompression(java.security.interfaces.ECPublicKey eCPublicKey) {
        return new org.bouncycastle.jcajce.util.ECKeyUtil.ECPublicKeyWithCompression(eCPublicKey);
    }
}
