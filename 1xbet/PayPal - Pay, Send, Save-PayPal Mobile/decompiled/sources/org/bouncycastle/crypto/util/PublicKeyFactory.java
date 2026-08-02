package org.bouncycastle.crypto.util;

/* loaded from: classes17.dex */
public class PublicKeyFactory {
    private static java.util.Map getHighResolutionOutputSizeshNQ4ISI;

    static /* synthetic */ byte[] getHighSpeedVideoSizes(org.bouncycastle.asn1.x509.SubjectPublicKeyInfo subjectPublicKeyInfo) {
        return subjectPublicKeyInfo.getPublicKeyData().getOctets();
    }

    public static org.bouncycastle.crypto.params.AsymmetricKeyParameter createKey(byte[] bArr) throws java.io.IOException {
        return createKey(org.bouncycastle.asn1.x509.SubjectPublicKeyInfo.getInstance(org.bouncycastle.asn1.ASN1Primitive.fromByteArray(bArr)));
    }

    static class DSTUConverter extends org.bouncycastle.crypto.util.PublicKeyFactory.SubjectPublicKeyInfoConverter {
        @Override // org.bouncycastle.crypto.util.PublicKeyFactory.SubjectPublicKeyInfoConverter
        final org.bouncycastle.crypto.params.AsymmetricKeyParameter Camera2StreamConfigurationMap(org.bouncycastle.asn1.x509.SubjectPublicKeyInfo subjectPublicKeyInfo, java.lang.Object obj) throws java.io.IOException {
            org.bouncycastle.crypto.params.ECDomainParameters eCDomainParameters;
            org.bouncycastle.asn1.x509.AlgorithmIdentifier algorithm = subjectPublicKeyInfo.getAlgorithm();
            org.bouncycastle.asn1.ASN1ObjectIdentifier algorithm2 = algorithm.getAlgorithm();
            org.bouncycastle.asn1.ua.DSTU4145Params dSTU4145Params = org.bouncycastle.asn1.ua.DSTU4145Params.getInstance(algorithm.getParameters());
            try {
                byte[] clone = org.bouncycastle.util.Arrays.clone(((org.bouncycastle.asn1.ASN1OctetString) subjectPublicKeyInfo.parsePublicKey()).getOctets());
                if (algorithm2.equals((org.bouncycastle.asn1.ASN1Primitive) org.bouncycastle.asn1.ua.UAObjectIdentifiers.dstu4145le)) {
                    getHighSpeedVideoFpsRanges(clone);
                }
                if (dSTU4145Params.isNamedCurve()) {
                    eCDomainParameters = org.bouncycastle.asn1.ua.DSTU4145NamedCurves.getByOID(dSTU4145Params.getNamedCurve());
                } else {
                    org.bouncycastle.asn1.ua.DSTU4145ECBinary eCBinary = dSTU4145Params.getECBinary();
                    byte[] b = eCBinary.getB();
                    if (algorithm2.equals((org.bouncycastle.asn1.ASN1Primitive) org.bouncycastle.asn1.ua.UAObjectIdentifiers.dstu4145le)) {
                        getHighSpeedVideoFpsRanges(b);
                    }
                    java.math.BigInteger bigInteger = new java.math.BigInteger(1, b);
                    org.bouncycastle.asn1.ua.DSTU4145BinaryField field = eCBinary.getField();
                    org.bouncycastle.math.ec.ECCurve.F2m f2m = new org.bouncycastle.math.ec.ECCurve.F2m(field.getM(), field.getK1(), field.getK2(), field.getK3(), eCBinary.getA(), bigInteger);
                    byte[] g = eCBinary.getG();
                    if (algorithm2.equals((org.bouncycastle.asn1.ASN1Primitive) org.bouncycastle.asn1.ua.UAObjectIdentifiers.dstu4145le)) {
                        getHighSpeedVideoFpsRanges(g);
                    }
                    eCDomainParameters = new org.bouncycastle.crypto.params.ECDomainParameters(f2m, org.bouncycastle.asn1.ua.DSTU4145PointEncoder.decodePoint(f2m, g), eCBinary.getN());
                }
                return new org.bouncycastle.crypto.params.ECPublicKeyParameters(org.bouncycastle.asn1.ua.DSTU4145PointEncoder.decodePoint(eCDomainParameters.getCurve(), clone), eCDomainParameters);
            } catch (java.io.IOException unused) {
                throw new java.lang.IllegalArgumentException("error recovering DSTU public key");
            }
        }

        private static void getHighSpeedVideoFpsRanges(byte[] bArr) {
            for (int i = 0; i < bArr.length / 2; i++) {
                byte b = bArr[i];
                bArr[i] = bArr[(bArr.length - 1) - i];
                bArr[(bArr.length - 1) - i] = b;
            }
        }

        /* synthetic */ DSTUConverter(byte b) {
            this();
        }

        private DSTUConverter() {
            super((byte) 0);
        }
    }

    public static org.bouncycastle.crypto.params.AsymmetricKeyParameter createKey(org.bouncycastle.asn1.x509.SubjectPublicKeyInfo subjectPublicKeyInfo, java.lang.Object obj) throws java.io.IOException {
        org.bouncycastle.asn1.x509.AlgorithmIdentifier algorithm = subjectPublicKeyInfo.getAlgorithm();
        org.bouncycastle.crypto.util.PublicKeyFactory.SubjectPublicKeyInfoConverter subjectPublicKeyInfoConverter = (org.bouncycastle.crypto.util.PublicKeyFactory.SubjectPublicKeyInfoConverter) getHighResolutionOutputSizeshNQ4ISI.get(algorithm.getAlgorithm());
        if (subjectPublicKeyInfoConverter != null) {
            return subjectPublicKeyInfoConverter.Camera2StreamConfigurationMap(subjectPublicKeyInfo, obj);
        }
        java.lang.StringBuilder sb = new java.lang.StringBuilder("algorithm identifier in public key not recognised: ");
        sb.append(algorithm.getAlgorithm());
        throw new java.io.IOException(sb.toString());
    }

    static class DHAgreementConverter extends org.bouncycastle.crypto.util.PublicKeyFactory.SubjectPublicKeyInfoConverter {
        @Override // org.bouncycastle.crypto.util.PublicKeyFactory.SubjectPublicKeyInfoConverter
        final org.bouncycastle.crypto.params.AsymmetricKeyParameter Camera2StreamConfigurationMap(org.bouncycastle.asn1.x509.SubjectPublicKeyInfo subjectPublicKeyInfo, java.lang.Object obj) throws java.io.IOException {
            org.bouncycastle.asn1.pkcs.DHParameter dHParameter = org.bouncycastle.asn1.pkcs.DHParameter.getInstance(subjectPublicKeyInfo.getAlgorithm().getParameters());
            org.bouncycastle.asn1.ASN1Integer aSN1Integer = (org.bouncycastle.asn1.ASN1Integer) subjectPublicKeyInfo.parsePublicKey();
            java.math.BigInteger l = dHParameter.getL();
            return new org.bouncycastle.crypto.params.DHPublicKeyParameters(aSN1Integer.getValue(), new org.bouncycastle.crypto.params.DHParameters(dHParameter.getP(), dHParameter.getG(), null, l == null ? 0 : l.intValue()));
        }

        /* synthetic */ DHAgreementConverter(byte b) {
            this();
        }

        private DHAgreementConverter() {
            super((byte) 0);
        }
    }

    static class DHPublicNumberConverter extends org.bouncycastle.crypto.util.PublicKeyFactory.SubjectPublicKeyInfoConverter {
        @Override // org.bouncycastle.crypto.util.PublicKeyFactory.SubjectPublicKeyInfoConverter
        final org.bouncycastle.crypto.params.AsymmetricKeyParameter Camera2StreamConfigurationMap(org.bouncycastle.asn1.x509.SubjectPublicKeyInfo subjectPublicKeyInfo, java.lang.Object obj) throws java.io.IOException {
            java.math.BigInteger y = org.bouncycastle.asn1.x9.DHPublicKey.getInstance(subjectPublicKeyInfo.parsePublicKey()).getY();
            org.bouncycastle.asn1.x9.DomainParameters domainParameters = org.bouncycastle.asn1.x9.DomainParameters.getInstance(subjectPublicKeyInfo.getAlgorithm().getParameters());
            java.math.BigInteger p = domainParameters.getP();
            java.math.BigInteger g = domainParameters.getG();
            java.math.BigInteger q = domainParameters.getQ();
            java.math.BigInteger j = domainParameters.getJ() != null ? domainParameters.getJ() : null;
            org.bouncycastle.asn1.x9.ValidationParams validationParams = domainParameters.getValidationParams();
            return new org.bouncycastle.crypto.params.DHPublicKeyParameters(y, new org.bouncycastle.crypto.params.DHParameters(p, g, q, j, validationParams != null ? new org.bouncycastle.crypto.params.DHValidationParameters(validationParams.getSeed(), validationParams.getPgenCounter().intValue()) : null));
        }

        /* synthetic */ DHPublicNumberConverter(byte b) {
            this();
        }

        private DHPublicNumberConverter() {
            super((byte) 0);
        }
    }

    static class DSAConverter extends org.bouncycastle.crypto.util.PublicKeyFactory.SubjectPublicKeyInfoConverter {
        @Override // org.bouncycastle.crypto.util.PublicKeyFactory.SubjectPublicKeyInfoConverter
        final org.bouncycastle.crypto.params.AsymmetricKeyParameter Camera2StreamConfigurationMap(org.bouncycastle.asn1.x509.SubjectPublicKeyInfo subjectPublicKeyInfo, java.lang.Object obj) throws java.io.IOException {
            org.bouncycastle.crypto.params.DSAParameters dSAParameters;
            org.bouncycastle.asn1.ASN1Integer aSN1Integer = (org.bouncycastle.asn1.ASN1Integer) subjectPublicKeyInfo.parsePublicKey();
            org.bouncycastle.asn1.ASN1Encodable parameters = subjectPublicKeyInfo.getAlgorithm().getParameters();
            if (parameters != null) {
                org.bouncycastle.asn1.x509.DSAParameter dSAParameter = org.bouncycastle.asn1.x509.DSAParameter.getInstance(parameters.toASN1Primitive());
                dSAParameters = new org.bouncycastle.crypto.params.DSAParameters(dSAParameter.getP(), dSAParameter.getQ(), dSAParameter.getG());
            } else {
                dSAParameters = null;
            }
            return new org.bouncycastle.crypto.params.DSAPublicKeyParameters(aSN1Integer.getValue(), dSAParameters);
        }

        /* synthetic */ DSAConverter(byte b) {
            this();
        }

        private DSAConverter() {
            super((byte) 0);
        }
    }

    static class ECConverter extends org.bouncycastle.crypto.util.PublicKeyFactory.SubjectPublicKeyInfoConverter {
        @Override // org.bouncycastle.crypto.util.PublicKeyFactory.SubjectPublicKeyInfoConverter
        final org.bouncycastle.crypto.params.AsymmetricKeyParameter Camera2StreamConfigurationMap(org.bouncycastle.asn1.x509.SubjectPublicKeyInfo subjectPublicKeyInfo, java.lang.Object obj) {
            org.bouncycastle.crypto.params.ECDomainParameters eCDomainParameters;
            byte b;
            org.bouncycastle.asn1.x9.X962Parameters x962Parameters = org.bouncycastle.asn1.x9.X962Parameters.getInstance(subjectPublicKeyInfo.getAlgorithm().getParameters());
            if (x962Parameters.isNamedCurve()) {
                org.bouncycastle.asn1.ASN1ObjectIdentifier aSN1ObjectIdentifier = (org.bouncycastle.asn1.ASN1ObjectIdentifier) x962Parameters.getParameters();
                org.bouncycastle.asn1.x9.X9ECParameters byOID = org.bouncycastle.crypto.ec.CustomNamedCurves.getByOID(aSN1ObjectIdentifier);
                if (byOID == null) {
                    byOID = org.bouncycastle.asn1.x9.ECNamedCurveTable.getByOID(aSN1ObjectIdentifier);
                }
                eCDomainParameters = new org.bouncycastle.crypto.params.ECNamedDomainParameters(aSN1ObjectIdentifier, byOID);
            } else {
                eCDomainParameters = x962Parameters.isImplicitlyCA() ? (org.bouncycastle.crypto.params.ECDomainParameters) obj : new org.bouncycastle.crypto.params.ECDomainParameters(org.bouncycastle.asn1.x9.X9ECParameters.getInstance(x962Parameters.getParameters()));
            }
            byte[] bytes = subjectPublicKeyInfo.getPublicKeyData().getBytes();
            org.bouncycastle.asn1.ASN1OctetString dEROctetString = new org.bouncycastle.asn1.DEROctetString(bytes);
            if (bytes[0] == 4 && bytes[1] == bytes.length - 2 && (((b = bytes[2]) == 2 || b == 3) && new org.bouncycastle.asn1.x9.X9IntegerConverter().getByteLength(eCDomainParameters.getCurve()) >= bytes.length - 3)) {
                try {
                    dEROctetString = (org.bouncycastle.asn1.ASN1OctetString) org.bouncycastle.asn1.ASN1Primitive.fromByteArray(bytes);
                } catch (java.io.IOException unused) {
                    throw new java.lang.IllegalArgumentException("error recovering public key");
                }
            }
            return new org.bouncycastle.crypto.params.ECPublicKeyParameters(new org.bouncycastle.asn1.x9.X9ECPoint(eCDomainParameters.getCurve(), dEROctetString).getPoint(), eCDomainParameters);
        }

        /* synthetic */ ECConverter(byte b) {
            this();
        }

        private ECConverter() {
            super((byte) 0);
        }
    }

    static class Ed25519Converter extends org.bouncycastle.crypto.util.PublicKeyFactory.SubjectPublicKeyInfoConverter {
        @Override // org.bouncycastle.crypto.util.PublicKeyFactory.SubjectPublicKeyInfoConverter
        final org.bouncycastle.crypto.params.AsymmetricKeyParameter Camera2StreamConfigurationMap(org.bouncycastle.asn1.x509.SubjectPublicKeyInfo subjectPublicKeyInfo, java.lang.Object obj) {
            return new org.bouncycastle.crypto.params.Ed25519PublicKeyParameters(org.bouncycastle.crypto.util.PublicKeyFactory.getHighSpeedVideoSizes(subjectPublicKeyInfo));
        }

        /* synthetic */ Ed25519Converter(byte b) {
            this();
        }

        private Ed25519Converter() {
            super((byte) 0);
        }
    }

    static class Ed448Converter extends org.bouncycastle.crypto.util.PublicKeyFactory.SubjectPublicKeyInfoConverter {
        @Override // org.bouncycastle.crypto.util.PublicKeyFactory.SubjectPublicKeyInfoConverter
        final org.bouncycastle.crypto.params.AsymmetricKeyParameter Camera2StreamConfigurationMap(org.bouncycastle.asn1.x509.SubjectPublicKeyInfo subjectPublicKeyInfo, java.lang.Object obj) {
            return new org.bouncycastle.crypto.params.Ed448PublicKeyParameters(org.bouncycastle.crypto.util.PublicKeyFactory.getHighSpeedVideoSizes(subjectPublicKeyInfo));
        }

        /* synthetic */ Ed448Converter(byte b) {
            this();
        }

        private Ed448Converter() {
            super((byte) 0);
        }
    }

    static class ElGamalConverter extends org.bouncycastle.crypto.util.PublicKeyFactory.SubjectPublicKeyInfoConverter {
        @Override // org.bouncycastle.crypto.util.PublicKeyFactory.SubjectPublicKeyInfoConverter
        final org.bouncycastle.crypto.params.AsymmetricKeyParameter Camera2StreamConfigurationMap(org.bouncycastle.asn1.x509.SubjectPublicKeyInfo subjectPublicKeyInfo, java.lang.Object obj) throws java.io.IOException {
            org.bouncycastle.asn1.oiw.ElGamalParameter elGamalParameter = org.bouncycastle.asn1.oiw.ElGamalParameter.getInstance(subjectPublicKeyInfo.getAlgorithm().getParameters());
            return new org.bouncycastle.crypto.params.ElGamalPublicKeyParameters(((org.bouncycastle.asn1.ASN1Integer) subjectPublicKeyInfo.parsePublicKey()).getValue(), new org.bouncycastle.crypto.params.ElGamalParameters(elGamalParameter.getP(), elGamalParameter.getG()));
        }

        /* synthetic */ ElGamalConverter(byte b) {
            this();
        }

        private ElGamalConverter() {
            super((byte) 0);
        }
    }

    static class GOST3410_2001Converter extends org.bouncycastle.crypto.util.PublicKeyFactory.SubjectPublicKeyInfoConverter {
        @Override // org.bouncycastle.crypto.util.PublicKeyFactory.SubjectPublicKeyInfoConverter
        final org.bouncycastle.crypto.params.AsymmetricKeyParameter Camera2StreamConfigurationMap(org.bouncycastle.asn1.x509.SubjectPublicKeyInfo subjectPublicKeyInfo, java.lang.Object obj) {
            org.bouncycastle.asn1.cryptopro.GOST3410PublicKeyAlgParameters gOST3410PublicKeyAlgParameters = org.bouncycastle.asn1.cryptopro.GOST3410PublicKeyAlgParameters.getInstance(subjectPublicKeyInfo.getAlgorithm().getParameters());
            org.bouncycastle.asn1.ASN1ObjectIdentifier publicKeyParamSet = gOST3410PublicKeyAlgParameters.getPublicKeyParamSet();
            org.bouncycastle.crypto.params.ECGOST3410Parameters eCGOST3410Parameters = new org.bouncycastle.crypto.params.ECGOST3410Parameters(new org.bouncycastle.crypto.params.ECNamedDomainParameters(publicKeyParamSet, org.bouncycastle.asn1.cryptopro.ECGOST3410NamedCurves.getByOIDX9(publicKeyParamSet)), publicKeyParamSet, gOST3410PublicKeyAlgParameters.getDigestParamSet(), gOST3410PublicKeyAlgParameters.getEncryptionParamSet());
            try {
                byte[] octets = ((org.bouncycastle.asn1.ASN1OctetString) subjectPublicKeyInfo.parsePublicKey()).getOctets();
                if (octets.length != 64) {
                    throw new java.lang.IllegalArgumentException("invalid length for GOST3410_2001 public key");
                }
                byte[] bArr = new byte[65];
                bArr[0] = 4;
                for (int i = 1; i <= 32; i++) {
                    bArr[i] = octets[32 - i];
                    bArr[i + 32] = octets[64 - i];
                }
                return new org.bouncycastle.crypto.params.ECPublicKeyParameters(eCGOST3410Parameters.getCurve().decodePoint(bArr), eCGOST3410Parameters);
            } catch (java.io.IOException unused) {
                throw new java.lang.IllegalArgumentException("error recovering GOST3410_2001 public key");
            }
        }

        /* synthetic */ GOST3410_2001Converter(byte b) {
            this();
        }

        private GOST3410_2001Converter() {
            super((byte) 0);
        }
    }

    static class GOST3410_2012Converter extends org.bouncycastle.crypto.util.PublicKeyFactory.SubjectPublicKeyInfoConverter {
        @Override // org.bouncycastle.crypto.util.PublicKeyFactory.SubjectPublicKeyInfoConverter
        final org.bouncycastle.crypto.params.AsymmetricKeyParameter Camera2StreamConfigurationMap(org.bouncycastle.asn1.x509.SubjectPublicKeyInfo subjectPublicKeyInfo, java.lang.Object obj) {
            org.bouncycastle.asn1.x509.AlgorithmIdentifier algorithm = subjectPublicKeyInfo.getAlgorithm();
            org.bouncycastle.asn1.ASN1ObjectIdentifier algorithm2 = algorithm.getAlgorithm();
            org.bouncycastle.asn1.cryptopro.GOST3410PublicKeyAlgParameters gOST3410PublicKeyAlgParameters = org.bouncycastle.asn1.cryptopro.GOST3410PublicKeyAlgParameters.getInstance(algorithm.getParameters());
            org.bouncycastle.asn1.ASN1ObjectIdentifier publicKeyParamSet = gOST3410PublicKeyAlgParameters.getPublicKeyParamSet();
            org.bouncycastle.crypto.params.ECGOST3410Parameters eCGOST3410Parameters = new org.bouncycastle.crypto.params.ECGOST3410Parameters(new org.bouncycastle.crypto.params.ECNamedDomainParameters(publicKeyParamSet, org.bouncycastle.asn1.cryptopro.ECGOST3410NamedCurves.getByOIDX9(publicKeyParamSet)), publicKeyParamSet, gOST3410PublicKeyAlgParameters.getDigestParamSet(), gOST3410PublicKeyAlgParameters.getEncryptionParamSet());
            try {
                org.bouncycastle.asn1.ASN1OctetString aSN1OctetString = (org.bouncycastle.asn1.ASN1OctetString) subjectPublicKeyInfo.parsePublicKey();
                int i = algorithm2.equals((org.bouncycastle.asn1.ASN1Primitive) org.bouncycastle.asn1.rosstandart.RosstandartObjectIdentifiers.id_tc26_gost_3410_12_512) ? 64 : 32;
                int i2 = i * 2;
                byte[] octets = aSN1OctetString.getOctets();
                if (octets.length != i2) {
                    throw new java.lang.IllegalArgumentException("invalid length for GOST3410_2012 public key");
                }
                byte[] bArr = new byte[i2 + 1];
                bArr[0] = 4;
                for (int i3 = 1; i3 <= i; i3++) {
                    bArr[i3] = octets[i - i3];
                    bArr[i3 + i] = octets[i2 - i3];
                }
                return new org.bouncycastle.crypto.params.ECPublicKeyParameters(eCGOST3410Parameters.getCurve().decodePoint(bArr), eCGOST3410Parameters);
            } catch (java.io.IOException unused) {
                throw new java.lang.IllegalArgumentException("error recovering GOST3410_2012 public key");
            }
        }

        /* synthetic */ GOST3410_2012Converter(byte b) {
            this();
        }

        private GOST3410_2012Converter() {
            super((byte) 0);
        }
    }

    static class RSAConverter extends org.bouncycastle.crypto.util.PublicKeyFactory.SubjectPublicKeyInfoConverter {
        @Override // org.bouncycastle.crypto.util.PublicKeyFactory.SubjectPublicKeyInfoConverter
        final org.bouncycastle.crypto.params.AsymmetricKeyParameter Camera2StreamConfigurationMap(org.bouncycastle.asn1.x509.SubjectPublicKeyInfo subjectPublicKeyInfo, java.lang.Object obj) throws java.io.IOException {
            org.bouncycastle.asn1.pkcs.RSAPublicKey rSAPublicKey = org.bouncycastle.asn1.pkcs.RSAPublicKey.getInstance(subjectPublicKeyInfo.parsePublicKey());
            return new org.bouncycastle.crypto.params.RSAKeyParameters(false, rSAPublicKey.getModulus(), rSAPublicKey.getPublicExponent());
        }

        /* synthetic */ RSAConverter(byte b) {
            this();
        }

        private RSAConverter() {
            super((byte) 0);
        }
    }

    static class X25519Converter extends org.bouncycastle.crypto.util.PublicKeyFactory.SubjectPublicKeyInfoConverter {
        @Override // org.bouncycastle.crypto.util.PublicKeyFactory.SubjectPublicKeyInfoConverter
        final org.bouncycastle.crypto.params.AsymmetricKeyParameter Camera2StreamConfigurationMap(org.bouncycastle.asn1.x509.SubjectPublicKeyInfo subjectPublicKeyInfo, java.lang.Object obj) {
            return new org.bouncycastle.crypto.params.X25519PublicKeyParameters(org.bouncycastle.crypto.util.PublicKeyFactory.getHighSpeedVideoSizes(subjectPublicKeyInfo));
        }

        /* synthetic */ X25519Converter(byte b) {
            this();
        }

        private X25519Converter() {
            super((byte) 0);
        }
    }

    static class X448Converter extends org.bouncycastle.crypto.util.PublicKeyFactory.SubjectPublicKeyInfoConverter {
        @Override // org.bouncycastle.crypto.util.PublicKeyFactory.SubjectPublicKeyInfoConverter
        final org.bouncycastle.crypto.params.AsymmetricKeyParameter Camera2StreamConfigurationMap(org.bouncycastle.asn1.x509.SubjectPublicKeyInfo subjectPublicKeyInfo, java.lang.Object obj) {
            return new org.bouncycastle.crypto.params.X448PublicKeyParameters(org.bouncycastle.crypto.util.PublicKeyFactory.getHighSpeedVideoSizes(subjectPublicKeyInfo));
        }

        /* synthetic */ X448Converter(byte b) {
            this();
        }

        private X448Converter() {
            super((byte) 0);
        }
    }

    public static org.bouncycastle.crypto.params.AsymmetricKeyParameter createKey(org.bouncycastle.asn1.x509.SubjectPublicKeyInfo subjectPublicKeyInfo) throws java.io.IOException {
        return createKey(subjectPublicKeyInfo, null);
    }

    static abstract class SubjectPublicKeyInfoConverter {
        abstract org.bouncycastle.crypto.params.AsymmetricKeyParameter Camera2StreamConfigurationMap(org.bouncycastle.asn1.x509.SubjectPublicKeyInfo subjectPublicKeyInfo, java.lang.Object obj) throws java.io.IOException;

        /* synthetic */ SubjectPublicKeyInfoConverter(byte b) {
            this();
        }

        private SubjectPublicKeyInfoConverter() {
        }
    }

    public static org.bouncycastle.crypto.params.AsymmetricKeyParameter createKey(java.io.InputStream inputStream) throws java.io.IOException {
        return createKey(org.bouncycastle.asn1.x509.SubjectPublicKeyInfo.getInstance(new org.bouncycastle.asn1.ASN1InputStream(inputStream).readObject()));
    }

    static {
        java.util.HashMap hashMap = new java.util.HashMap();
        getHighResolutionOutputSizeshNQ4ISI = hashMap;
        byte b = 0;
        hashMap.put(org.bouncycastle.asn1.pkcs.PKCSObjectIdentifiers.rsaEncryption, new org.bouncycastle.crypto.util.PublicKeyFactory.RSAConverter(b));
        getHighResolutionOutputSizeshNQ4ISI.put(org.bouncycastle.asn1.pkcs.PKCSObjectIdentifiers.id_RSASSA_PSS, new org.bouncycastle.crypto.util.PublicKeyFactory.RSAConverter(b));
        getHighResolutionOutputSizeshNQ4ISI.put(org.bouncycastle.asn1.x509.X509ObjectIdentifiers.id_ea_rsa, new org.bouncycastle.crypto.util.PublicKeyFactory.RSAConverter(b));
        getHighResolutionOutputSizeshNQ4ISI.put(org.bouncycastle.asn1.x9.X9ObjectIdentifiers.dhpublicnumber, new org.bouncycastle.crypto.util.PublicKeyFactory.DHPublicNumberConverter(b));
        getHighResolutionOutputSizeshNQ4ISI.put(org.bouncycastle.asn1.pkcs.PKCSObjectIdentifiers.dhKeyAgreement, new org.bouncycastle.crypto.util.PublicKeyFactory.DHAgreementConverter(b));
        getHighResolutionOutputSizeshNQ4ISI.put(org.bouncycastle.asn1.x9.X9ObjectIdentifiers.id_dsa, new org.bouncycastle.crypto.util.PublicKeyFactory.DSAConverter(b));
        getHighResolutionOutputSizeshNQ4ISI.put(org.bouncycastle.asn1.oiw.OIWObjectIdentifiers.dsaWithSHA1, new org.bouncycastle.crypto.util.PublicKeyFactory.DSAConverter(b));
        getHighResolutionOutputSizeshNQ4ISI.put(org.bouncycastle.asn1.oiw.OIWObjectIdentifiers.elGamalAlgorithm, new org.bouncycastle.crypto.util.PublicKeyFactory.ElGamalConverter(b));
        getHighResolutionOutputSizeshNQ4ISI.put(org.bouncycastle.asn1.x9.X9ObjectIdentifiers.id_ecPublicKey, new org.bouncycastle.crypto.util.PublicKeyFactory.ECConverter(b));
        getHighResolutionOutputSizeshNQ4ISI.put(org.bouncycastle.asn1.cryptopro.CryptoProObjectIdentifiers.gostR3410_2001, new org.bouncycastle.crypto.util.PublicKeyFactory.GOST3410_2001Converter(b));
        getHighResolutionOutputSizeshNQ4ISI.put(org.bouncycastle.asn1.rosstandart.RosstandartObjectIdentifiers.id_tc26_gost_3410_12_256, new org.bouncycastle.crypto.util.PublicKeyFactory.GOST3410_2012Converter(b));
        getHighResolutionOutputSizeshNQ4ISI.put(org.bouncycastle.asn1.rosstandart.RosstandartObjectIdentifiers.id_tc26_gost_3410_12_512, new org.bouncycastle.crypto.util.PublicKeyFactory.GOST3410_2012Converter(b));
        getHighResolutionOutputSizeshNQ4ISI.put(org.bouncycastle.asn1.ua.UAObjectIdentifiers.dstu4145be, new org.bouncycastle.crypto.util.PublicKeyFactory.DSTUConverter(b));
        getHighResolutionOutputSizeshNQ4ISI.put(org.bouncycastle.asn1.ua.UAObjectIdentifiers.dstu4145le, new org.bouncycastle.crypto.util.PublicKeyFactory.DSTUConverter(b));
        getHighResolutionOutputSizeshNQ4ISI.put(org.bouncycastle.asn1.edec.EdECObjectIdentifiers.id_X25519, new org.bouncycastle.crypto.util.PublicKeyFactory.X25519Converter(b));
        getHighResolutionOutputSizeshNQ4ISI.put(org.bouncycastle.asn1.edec.EdECObjectIdentifiers.id_X448, new org.bouncycastle.crypto.util.PublicKeyFactory.X448Converter(b));
        getHighResolutionOutputSizeshNQ4ISI.put(org.bouncycastle.asn1.edec.EdECObjectIdentifiers.id_Ed25519, new org.bouncycastle.crypto.util.PublicKeyFactory.Ed25519Converter(b));
        getHighResolutionOutputSizeshNQ4ISI.put(org.bouncycastle.asn1.edec.EdECObjectIdentifiers.id_Ed448, new org.bouncycastle.crypto.util.PublicKeyFactory.Ed448Converter(b));
    }
}
