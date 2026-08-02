package org.bouncycastle.jcajce.provider.asymmetric.edec;

/* loaded from: classes17.dex */
public class KeyFactorySpi extends org.bouncycastle.jcajce.provider.asymmetric.util.BaseKeyFactorySpi implements org.bouncycastle.jcajce.provider.util.AsymmetricKeyInfoConverter {
    java.lang.String Camera2StreamConfigurationMap;
    private final int getInputFormats;
    private final boolean getInputSizeshNQ4ISI;
    static final byte[] getHighSpeedVideoFpsRanges = org.bouncycastle.util.encoders.Hex.decode("3042300506032b656f033900");
    static final byte[] getHighSpeedVideoSizes = org.bouncycastle.util.encoders.Hex.decode("302a300506032b656e032100");
    static final byte[] getHighSpeedVideoFpsRangesFor = org.bouncycastle.util.encoders.Hex.decode("3043300506032b6571033a00");
    static final byte[] getHighResolutionOutputSizeshNQ4ISI = org.bouncycastle.util.encoders.Hex.decode("302a300506032b6570032100");

    @Override // org.bouncycastle.jcajce.provider.util.AsymmetricKeyInfoConverter
    public java.security.PublicKey generatePublic(org.bouncycastle.asn1.x509.SubjectPublicKeyInfo subjectPublicKeyInfo) throws java.io.IOException {
        org.bouncycastle.asn1.ASN1ObjectIdentifier algorithm = subjectPublicKeyInfo.getAlgorithm().getAlgorithm();
        if (this.getInputSizeshNQ4ISI) {
            int i = this.getInputFormats;
            if ((i == 0 || i == 111) && algorithm.equals((org.bouncycastle.asn1.ASN1Primitive) org.bouncycastle.asn1.edec.EdECObjectIdentifiers.id_X448)) {
                return new org.bouncycastle.jcajce.provider.asymmetric.edec.BCXDHPublicKey(subjectPublicKeyInfo);
            }
            int i2 = this.getInputFormats;
            if ((i2 == 0 || i2 == 110) && algorithm.equals((org.bouncycastle.asn1.ASN1Primitive) org.bouncycastle.asn1.edec.EdECObjectIdentifiers.id_X25519)) {
                return new org.bouncycastle.jcajce.provider.asymmetric.edec.BCXDHPublicKey(subjectPublicKeyInfo);
            }
        } else if (algorithm.equals((org.bouncycastle.asn1.ASN1Primitive) org.bouncycastle.asn1.edec.EdECObjectIdentifiers.id_Ed448) || algorithm.equals((org.bouncycastle.asn1.ASN1Primitive) org.bouncycastle.asn1.edec.EdECObjectIdentifiers.id_Ed25519)) {
            int i3 = this.getInputFormats;
            if ((i3 == 0 || i3 == 113) && algorithm.equals((org.bouncycastle.asn1.ASN1Primitive) org.bouncycastle.asn1.edec.EdECObjectIdentifiers.id_Ed448)) {
                return new org.bouncycastle.jcajce.provider.asymmetric.edec.BCEdDSAPublicKey(subjectPublicKeyInfo);
            }
            int i4 = this.getInputFormats;
            if ((i4 == 0 || i4 == 112) && algorithm.equals((org.bouncycastle.asn1.ASN1Primitive) org.bouncycastle.asn1.edec.EdECObjectIdentifiers.id_Ed25519)) {
                return new org.bouncycastle.jcajce.provider.asymmetric.edec.BCEdDSAPublicKey(subjectPublicKeyInfo);
            }
        }
        java.lang.StringBuilder sb = new java.lang.StringBuilder("algorithm identifier ");
        sb.append(algorithm);
        sb.append(" in key not recognized");
        throw new java.io.IOException(sb.toString());
    }

    @Override // org.bouncycastle.jcajce.provider.util.AsymmetricKeyInfoConverter
    public java.security.PrivateKey generatePrivate(org.bouncycastle.asn1.pkcs.PrivateKeyInfo privateKeyInfo) throws java.io.IOException {
        org.bouncycastle.asn1.ASN1ObjectIdentifier algorithm = privateKeyInfo.getPrivateKeyAlgorithm().getAlgorithm();
        if (this.getInputSizeshNQ4ISI) {
            int i = this.getInputFormats;
            if ((i == 0 || i == 111) && algorithm.equals((org.bouncycastle.asn1.ASN1Primitive) org.bouncycastle.asn1.edec.EdECObjectIdentifiers.id_X448)) {
                return new org.bouncycastle.jcajce.provider.asymmetric.edec.BCXDHPrivateKey(privateKeyInfo);
            }
            int i2 = this.getInputFormats;
            if ((i2 == 0 || i2 == 110) && algorithm.equals((org.bouncycastle.asn1.ASN1Primitive) org.bouncycastle.asn1.edec.EdECObjectIdentifiers.id_X25519)) {
                return new org.bouncycastle.jcajce.provider.asymmetric.edec.BCXDHPrivateKey(privateKeyInfo);
            }
        } else if (algorithm.equals((org.bouncycastle.asn1.ASN1Primitive) org.bouncycastle.asn1.edec.EdECObjectIdentifiers.id_Ed448) || algorithm.equals((org.bouncycastle.asn1.ASN1Primitive) org.bouncycastle.asn1.edec.EdECObjectIdentifiers.id_Ed25519)) {
            int i3 = this.getInputFormats;
            if ((i3 == 0 || i3 == 113) && algorithm.equals((org.bouncycastle.asn1.ASN1Primitive) org.bouncycastle.asn1.edec.EdECObjectIdentifiers.id_Ed448)) {
                return new org.bouncycastle.jcajce.provider.asymmetric.edec.BCEdDSAPrivateKey(privateKeyInfo);
            }
            int i4 = this.getInputFormats;
            if ((i4 == 0 || i4 == 112) && algorithm.equals((org.bouncycastle.asn1.ASN1Primitive) org.bouncycastle.asn1.edec.EdECObjectIdentifiers.id_Ed25519)) {
                return new org.bouncycastle.jcajce.provider.asymmetric.edec.BCEdDSAPrivateKey(privateKeyInfo);
            }
        }
        java.lang.StringBuilder sb = new java.lang.StringBuilder("algorithm identifier ");
        sb.append(algorithm);
        sb.append(" in key not recognized");
        throw new java.io.IOException(sb.toString());
    }

    @Override // java.security.KeyFactorySpi
    protected java.security.Key engineTranslateKey(java.security.Key key) throws java.security.InvalidKeyException {
        throw new java.security.InvalidKeyException("key type unknown");
    }

    @Override // org.bouncycastle.jcajce.provider.asymmetric.util.BaseKeyFactorySpi, java.security.KeyFactorySpi
    public java.security.spec.KeySpec engineGetKeySpec(java.security.Key key, java.lang.Class cls) throws java.security.spec.InvalidKeySpecException {
        if (cls.isAssignableFrom(org.bouncycastle.jcajce.spec.OpenSSHPrivateKeySpec.class) && (key instanceof org.bouncycastle.jcajce.provider.asymmetric.edec.BCEdDSAPrivateKey)) {
            try {
                return new org.bouncycastle.jcajce.spec.OpenSSHPrivateKeySpec(org.bouncycastle.crypto.util.OpenSSHPrivateKeyUtil.encodePrivateKey(new org.bouncycastle.crypto.params.Ed25519PrivateKeyParameters(org.bouncycastle.asn1.ASN1OctetString.getInstance(org.bouncycastle.asn1.ASN1Primitive.fromByteArray(org.bouncycastle.asn1.ASN1OctetString.getInstance(org.bouncycastle.asn1.ASN1Sequence.getInstance(key.getEncoded()).getObjectAt(2)).getOctets())).getOctets())));
            } catch (java.io.IOException e) {
                throw new java.security.spec.InvalidKeySpecException(e.getMessage(), e.getCause());
            }
        }
        if (!cls.isAssignableFrom(org.bouncycastle.jcajce.spec.OpenSSHPublicKeySpec.class) || !(key instanceof org.bouncycastle.jcajce.provider.asymmetric.edec.BCEdDSAPublicKey)) {
            if (cls.isAssignableFrom(org.bouncycastle.jcajce.spec.RawEncodedKeySpec.class)) {
                if (key instanceof org.bouncycastle.jcajce.interfaces.XDHPublicKey) {
                    return new org.bouncycastle.jcajce.spec.RawEncodedKeySpec(((org.bouncycastle.jcajce.interfaces.XDHPublicKey) key).getUEncoding());
                }
                if (key instanceof org.bouncycastle.jcajce.interfaces.EdDSAPublicKey) {
                    return new org.bouncycastle.jcajce.spec.RawEncodedKeySpec(((org.bouncycastle.jcajce.interfaces.EdDSAPublicKey) key).getPointEncoding());
                }
            }
            return super.engineGetKeySpec(key, cls);
        }
        try {
            byte[] encoded = key.getEncoded();
            byte[] bArr = getHighResolutionOutputSizeshNQ4ISI;
            if (org.bouncycastle.util.Arrays.areEqual(bArr, 0, bArr.length, encoded, 0, encoded.length - 32)) {
                return new org.bouncycastle.jcajce.spec.OpenSSHPublicKeySpec(org.bouncycastle.crypto.util.OpenSSHPublicKeyUtil.encodePublicKey(new org.bouncycastle.crypto.params.Ed25519PublicKeyParameters(encoded, bArr.length)));
            }
            throw new java.security.spec.InvalidKeySpecException("Invalid Ed25519 public key encoding");
        } catch (java.io.IOException e2) {
            throw new java.security.spec.InvalidKeySpecException(e2.getMessage(), e2.getCause());
        }
    }

    @Override // org.bouncycastle.jcajce.provider.asymmetric.util.BaseKeyFactorySpi, java.security.KeyFactorySpi
    public java.security.PublicKey engineGeneratePublic(java.security.spec.KeySpec keySpec) throws java.security.spec.InvalidKeySpecException {
        if (keySpec instanceof java.security.spec.X509EncodedKeySpec) {
            byte[] encoded = ((java.security.spec.X509EncodedKeySpec) keySpec).getEncoded();
            int i = this.getInputFormats;
            if (i == 0 || i == encoded[8]) {
                if (encoded[9] == 5 && encoded[10] == 0) {
                    org.bouncycastle.asn1.x509.SubjectPublicKeyInfo subjectPublicKeyInfo = org.bouncycastle.asn1.x509.SubjectPublicKeyInfo.getInstance(encoded);
                    try {
                        encoded = new org.bouncycastle.asn1.x509.SubjectPublicKeyInfo(new org.bouncycastle.asn1.x509.AlgorithmIdentifier(subjectPublicKeyInfo.getAlgorithm().getAlgorithm()), subjectPublicKeyInfo.getPublicKeyData().getBytes()).getEncoded(org.bouncycastle.asn1.ASN1Encoding.DER);
                    } catch (java.io.IOException e) {
                        java.lang.StringBuilder sb = new java.lang.StringBuilder("attempt to reconstruct key failed: ");
                        sb.append(e.getMessage());
                        throw new java.security.spec.InvalidKeySpecException(sb.toString());
                    }
                }
                switch (encoded[8]) {
                    case 110:
                        return new org.bouncycastle.jcajce.provider.asymmetric.edec.BCXDHPublicKey(getHighSpeedVideoSizes, encoded);
                    case 111:
                        return new org.bouncycastle.jcajce.provider.asymmetric.edec.BCXDHPublicKey(getHighSpeedVideoFpsRanges, encoded);
                    case 112:
                        return new org.bouncycastle.jcajce.provider.asymmetric.edec.BCEdDSAPublicKey(getHighResolutionOutputSizeshNQ4ISI, encoded);
                    case 113:
                        return new org.bouncycastle.jcajce.provider.asymmetric.edec.BCEdDSAPublicKey(getHighSpeedVideoFpsRangesFor, encoded);
                    default:
                        return super.engineGeneratePublic(keySpec);
                }
            }
        } else {
            if (keySpec instanceof org.bouncycastle.jcajce.spec.RawEncodedKeySpec) {
                byte[] encoded2 = ((org.bouncycastle.jcajce.spec.RawEncodedKeySpec) keySpec).getEncoded();
                switch (this.getInputFormats) {
                    case 110:
                        return new org.bouncycastle.jcajce.provider.asymmetric.edec.BCXDHPublicKey(new org.bouncycastle.crypto.params.X25519PublicKeyParameters(encoded2));
                    case 111:
                        return new org.bouncycastle.jcajce.provider.asymmetric.edec.BCXDHPublicKey(new org.bouncycastle.crypto.params.X448PublicKeyParameters(encoded2));
                    case 112:
                        return new org.bouncycastle.jcajce.provider.asymmetric.edec.BCEdDSAPublicKey(new org.bouncycastle.crypto.params.Ed25519PublicKeyParameters(encoded2));
                    case 113:
                        return new org.bouncycastle.jcajce.provider.asymmetric.edec.BCEdDSAPublicKey(new org.bouncycastle.crypto.params.Ed448PublicKeyParameters(encoded2));
                    default:
                        throw new java.security.spec.InvalidKeySpecException("factory not a specific type, cannot recognise raw encoding");
                }
            }
            if (keySpec instanceof org.bouncycastle.jcajce.spec.OpenSSHPublicKeySpec) {
                org.bouncycastle.crypto.params.AsymmetricKeyParameter parsePublicKey = org.bouncycastle.crypto.util.OpenSSHPublicKeyUtil.parsePublicKey(((org.bouncycastle.jcajce.spec.OpenSSHPublicKeySpec) keySpec).getEncoded());
                if (parsePublicKey instanceof org.bouncycastle.crypto.params.Ed25519PublicKeyParameters) {
                    return new org.bouncycastle.jcajce.provider.asymmetric.edec.BCEdDSAPublicKey(new byte[0], ((org.bouncycastle.crypto.params.Ed25519PublicKeyParameters) parsePublicKey).getEncoded());
                }
                throw new java.lang.IllegalStateException("openssh public key not Ed25519 public key");
            }
        }
        return super.engineGeneratePublic(keySpec);
    }

    @Override // org.bouncycastle.jcajce.provider.asymmetric.util.BaseKeyFactorySpi, java.security.KeyFactorySpi
    public java.security.PrivateKey engineGeneratePrivate(java.security.spec.KeySpec keySpec) throws java.security.spec.InvalidKeySpecException {
        if (!(keySpec instanceof org.bouncycastle.jcajce.spec.OpenSSHPrivateKeySpec)) {
            return super.engineGeneratePrivate(keySpec);
        }
        org.bouncycastle.crypto.params.AsymmetricKeyParameter parsePrivateKeyBlob = org.bouncycastle.crypto.util.OpenSSHPrivateKeyUtil.parsePrivateKeyBlob(((org.bouncycastle.jcajce.spec.OpenSSHPrivateKeySpec) keySpec).getEncoded());
        if (parsePrivateKeyBlob instanceof org.bouncycastle.crypto.params.Ed25519PrivateKeyParameters) {
            return new org.bouncycastle.jcajce.provider.asymmetric.edec.BCEdDSAPrivateKey((org.bouncycastle.crypto.params.Ed25519PrivateKeyParameters) parsePrivateKeyBlob);
        }
        throw new java.lang.IllegalStateException("openssh private key not Ed25519 private key");
    }

    public static class Ed25519 extends org.bouncycastle.jcajce.provider.asymmetric.edec.KeyFactorySpi {
        public Ed25519() {
            super("Ed25519", false, 112);
        }
    }

    public static class Ed448 extends org.bouncycastle.jcajce.provider.asymmetric.edec.KeyFactorySpi {
        public Ed448() {
            super("Ed448", false, 113);
        }
    }

    public static class EdDSA extends org.bouncycastle.jcajce.provider.asymmetric.edec.KeyFactorySpi {
        public EdDSA() {
            super(org.jose4j.jws.AlgorithmIdentifiers.EDDSA, false, 0);
        }
    }

    public static class X25519 extends org.bouncycastle.jcajce.provider.asymmetric.edec.KeyFactorySpi {
        public X25519() {
            super("X25519", true, 110);
        }
    }

    public static class X448 extends org.bouncycastle.jcajce.provider.asymmetric.edec.KeyFactorySpi {
        public X448() {
            super("X448", true, 111);
        }
    }

    public static class XDH extends org.bouncycastle.jcajce.provider.asymmetric.edec.KeyFactorySpi {
        public XDH() {
            super("XDH", true, 0);
        }
    }

    public KeyFactorySpi(java.lang.String str, boolean z, int i) {
        this.Camera2StreamConfigurationMap = str;
        this.getInputSizeshNQ4ISI = z;
        this.getInputFormats = i;
    }
}
