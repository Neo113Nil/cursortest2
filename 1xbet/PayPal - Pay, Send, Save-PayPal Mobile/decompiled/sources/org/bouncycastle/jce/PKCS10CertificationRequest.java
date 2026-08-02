package org.bouncycastle.jce;

/* loaded from: classes17.dex */
public class PKCS10CertificationRequest extends org.bouncycastle.asn1.pkcs.CertificationRequest {
    private static java.util.Hashtable getHighSpeedVideoFpsRangesFor = new java.util.Hashtable();
    private static java.util.Hashtable getHighSpeedVideoSizes = new java.util.Hashtable();
    private static java.util.Hashtable getHighSpeedVideoFpsRanges = new java.util.Hashtable();
    private static java.util.Hashtable Camera2StreamConfigurationMap = new java.util.Hashtable();
    private static java.util.Set getHighResolutionOutputSizeshNQ4ISI = new java.util.HashSet();

    private static java.lang.String Camera2StreamConfigurationMap(org.bouncycastle.asn1.x509.AlgorithmIdentifier algorithmIdentifier) {
        org.bouncycastle.asn1.ASN1Encodable parameters = algorithmIdentifier.getParameters();
        if (parameters == null || org.bouncycastle.asn1.DERNull.INSTANCE.equals(parameters) || !algorithmIdentifier.getAlgorithm().equals((org.bouncycastle.asn1.ASN1Primitive) org.bouncycastle.asn1.pkcs.PKCSObjectIdentifiers.id_RSASSA_PSS)) {
            return algorithmIdentifier.getAlgorithm().getId();
        }
        org.bouncycastle.asn1.pkcs.RSASSAPSSparams rSASSAPSSparams = org.bouncycastle.asn1.pkcs.RSASSAPSSparams.getInstance(parameters);
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        org.bouncycastle.asn1.ASN1ObjectIdentifier algorithm = rSASSAPSSparams.getHashAlgorithm().getAlgorithm();
        sb.append(org.bouncycastle.asn1.pkcs.PKCSObjectIdentifiers.md5.equals((org.bouncycastle.asn1.ASN1Primitive) algorithm) ? "MD5" : org.bouncycastle.asn1.oiw.OIWObjectIdentifiers.idSHA1.equals((org.bouncycastle.asn1.ASN1Primitive) algorithm) ? "SHA1" : org.bouncycastle.asn1.nist.NISTObjectIdentifiers.id_sha224.equals((org.bouncycastle.asn1.ASN1Primitive) algorithm) ? "SHA224" : org.bouncycastle.asn1.nist.NISTObjectIdentifiers.id_sha256.equals((org.bouncycastle.asn1.ASN1Primitive) algorithm) ? "SHA256" : org.bouncycastle.asn1.nist.NISTObjectIdentifiers.id_sha384.equals((org.bouncycastle.asn1.ASN1Primitive) algorithm) ? "SHA384" : org.bouncycastle.asn1.nist.NISTObjectIdentifiers.id_sha512.equals((org.bouncycastle.asn1.ASN1Primitive) algorithm) ? "SHA512" : org.bouncycastle.asn1.teletrust.TeleTrusTObjectIdentifiers.ripemd128.equals((org.bouncycastle.asn1.ASN1Primitive) algorithm) ? "RIPEMD128" : org.bouncycastle.asn1.teletrust.TeleTrusTObjectIdentifiers.ripemd160.equals((org.bouncycastle.asn1.ASN1Primitive) algorithm) ? "RIPEMD160" : org.bouncycastle.asn1.teletrust.TeleTrusTObjectIdentifiers.ripemd256.equals((org.bouncycastle.asn1.ASN1Primitive) algorithm) ? "RIPEMD256" : org.bouncycastle.asn1.cryptopro.CryptoProObjectIdentifiers.gostR3411.equals((org.bouncycastle.asn1.ASN1Primitive) algorithm) ? "GOST3411" : algorithm.getId());
        sb.append("withRSAandMGF1");
        return sb.toString();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r6v0, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r6v1, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r6v11 */
    /* JADX WARN: Type inference failed for: r6v12 */
    /* JADX WARN: Type inference failed for: r6v2, types: [java.security.Signature] */
    /* JADX WARN: Type inference failed for: r6v3, types: [java.security.Signature] */
    /* JADX WARN: Type inference failed for: r6v4, types: [java.security.Signature] */
    /* JADX WARN: Type inference failed for: r6v9 */
    public boolean verify(java.security.PublicKey publicKey, java.lang.String str) throws java.security.NoSuchAlgorithmException, java.security.NoSuchProviderException, java.security.InvalidKeyException, java.security.SignatureException {
        try {
            str = str == 0 ? java.security.Signature.getInstance(Camera2StreamConfigurationMap(this.sigAlgId)) : java.security.Signature.getInstance(Camera2StreamConfigurationMap(this.sigAlgId), (java.lang.String) str);
        } catch (java.security.NoSuchAlgorithmException e) {
            if (Camera2StreamConfigurationMap.get(this.sigAlgId.getAlgorithm()) == null) {
                throw e;
            }
            java.lang.String str2 = (java.lang.String) Camera2StreamConfigurationMap.get(this.sigAlgId.getAlgorithm());
            str = str == 0 ? java.security.Signature.getInstance(str2) : java.security.Signature.getInstance(str2, (java.lang.String) str);
        }
        org.bouncycastle.asn1.ASN1Encodable parameters = this.sigAlgId.getParameters();
        if (parameters != null && !org.bouncycastle.asn1.DERNull.INSTANCE.equals(parameters)) {
            java.security.AlgorithmParameters algorithmParameters = java.security.AlgorithmParameters.getInstance(str.getAlgorithm(), str.getProvider());
            try {
                algorithmParameters.init(parameters.toASN1Primitive().getEncoded(org.bouncycastle.asn1.ASN1Encoding.DER));
                if (str.getAlgorithm().endsWith("MGF1")) {
                    try {
                        str.setParameter(algorithmParameters.getParameterSpec(java.security.spec.PSSParameterSpec.class));
                    } catch (java.security.GeneralSecurityException e2) {
                        java.lang.StringBuilder sb = new java.lang.StringBuilder("Exception extracting parameters: ");
                        sb.append(e2.getMessage());
                        throw new java.security.SignatureException(sb.toString());
                    }
                }
            } catch (java.io.IOException e3) {
                java.lang.StringBuilder sb2 = new java.lang.StringBuilder("IOException decoding parameters: ");
                sb2.append(e3.getMessage());
                throw new java.security.SignatureException(sb2.toString());
            }
        }
        str.initVerify(publicKey);
        try {
            str.update(this.reqInfo.getEncoded(org.bouncycastle.asn1.ASN1Encoding.DER));
            return str.verify(this.sigBits.getOctets());
        } catch (java.lang.Exception e4) {
            throw new java.security.SignatureException("exception encoding TBS cert request - ".concat(java.lang.String.valueOf(e4)));
        }
    }

    public boolean verify(java.lang.String str) throws java.security.NoSuchAlgorithmException, java.security.NoSuchProviderException, java.security.InvalidKeyException, java.security.SignatureException {
        return verify(getPublicKey(str), str);
    }

    public boolean verify() throws java.security.NoSuchAlgorithmException, java.security.NoSuchProviderException, java.security.InvalidKeyException, java.security.SignatureException {
        return verify(org.bouncycastle.jce.provider.BouncyCastleProvider.PROVIDER_NAME);
    }

    public java.security.PublicKey getPublicKey(java.lang.String str) throws java.security.NoSuchAlgorithmException, java.security.NoSuchProviderException, java.security.InvalidKeyException {
        org.bouncycastle.asn1.x509.SubjectPublicKeyInfo subjectPublicKeyInfo = this.reqInfo.getSubjectPublicKeyInfo();
        try {
            java.security.spec.X509EncodedKeySpec x509EncodedKeySpec = new java.security.spec.X509EncodedKeySpec(new org.bouncycastle.asn1.DERBitString(subjectPublicKeyInfo).getOctets());
            org.bouncycastle.asn1.x509.AlgorithmIdentifier algorithm = subjectPublicKeyInfo.getAlgorithm();
            try {
                return (str == null ? java.security.KeyFactory.getInstance(algorithm.getAlgorithm().getId()) : java.security.KeyFactory.getInstance(algorithm.getAlgorithm().getId(), str)).generatePublic(x509EncodedKeySpec);
            } catch (java.security.NoSuchAlgorithmException e) {
                if (getHighSpeedVideoFpsRanges.get(algorithm.getAlgorithm()) == null) {
                    throw e;
                }
                java.lang.String str2 = (java.lang.String) getHighSpeedVideoFpsRanges.get(algorithm.getAlgorithm());
                return str == null ? java.security.KeyFactory.getInstance(str2).generatePublic(x509EncodedKeySpec) : java.security.KeyFactory.getInstance(str2, str).generatePublic(x509EncodedKeySpec);
            }
        } catch (java.io.IOException unused) {
            throw new java.security.InvalidKeyException("error decoding public key");
        } catch (java.security.spec.InvalidKeySpecException unused2) {
            throw new java.security.InvalidKeyException("error decoding public key");
        }
    }

    public java.security.PublicKey getPublicKey() throws java.security.NoSuchAlgorithmException, java.security.NoSuchProviderException, java.security.InvalidKeyException {
        return getPublicKey(org.bouncycastle.jce.provider.BouncyCastleProvider.PROVIDER_NAME);
    }

    @Override // org.bouncycastle.asn1.ASN1Object, org.bouncycastle.util.Encodable
    public byte[] getEncoded() {
        try {
            return getEncoded(org.bouncycastle.asn1.ASN1Encoding.DER);
        } catch (java.io.IOException e) {
            throw new java.lang.RuntimeException(e.toString());
        }
    }

    private static org.bouncycastle.asn1.ASN1Sequence getHighSpeedVideoFpsRangesFor(byte[] bArr) {
        try {
            return (org.bouncycastle.asn1.ASN1Sequence) new org.bouncycastle.asn1.ASN1InputStream(bArr).readObject();
        } catch (java.lang.Exception unused) {
            throw new java.lang.IllegalArgumentException("badly encoded request");
        }
    }

    private static org.bouncycastle.asn1.pkcs.RSASSAPSSparams getHighResolutionOutputSizeshNQ4ISI(org.bouncycastle.asn1.x509.AlgorithmIdentifier algorithmIdentifier, int i) {
        return new org.bouncycastle.asn1.pkcs.RSASSAPSSparams(algorithmIdentifier, new org.bouncycastle.asn1.x509.AlgorithmIdentifier(org.bouncycastle.asn1.pkcs.PKCSObjectIdentifiers.id_mgf1, algorithmIdentifier), new org.bouncycastle.asn1.ASN1Integer(i), new org.bouncycastle.asn1.ASN1Integer(1L));
    }

    private static org.bouncycastle.asn1.x509.X509Name Camera2StreamConfigurationMap(javax.security.auth.x500.X500Principal x500Principal) {
        try {
            return new org.bouncycastle.jce.X509Principal(x500Principal.getEncoded());
        } catch (java.io.IOException unused) {
            throw new java.lang.IllegalArgumentException("can't convert name");
        }
    }

    public PKCS10CertificationRequest(byte[] bArr) {
        super(getHighSpeedVideoFpsRangesFor(bArr));
    }

    public PKCS10CertificationRequest(org.bouncycastle.asn1.ASN1Sequence aSN1Sequence) {
        super(aSN1Sequence);
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0069  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x006e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public PKCS10CertificationRequest(java.lang.String str, org.bouncycastle.asn1.x509.X509Name x509Name, java.security.PublicKey publicKey, org.bouncycastle.asn1.ASN1Set aSN1Set, java.security.PrivateKey privateKey, java.lang.String str2) throws java.security.NoSuchAlgorithmException, java.security.NoSuchProviderException, java.security.InvalidKeyException, java.security.SignatureException {
        org.bouncycastle.asn1.x509.AlgorithmIdentifier algorithmIdentifier;
        java.lang.String upperCase = org.bouncycastle.util.Strings.toUpperCase(str);
        org.bouncycastle.asn1.ASN1ObjectIdentifier aSN1ObjectIdentifier = (org.bouncycastle.asn1.ASN1ObjectIdentifier) getHighSpeedVideoFpsRangesFor.get(upperCase);
        if (aSN1ObjectIdentifier == null) {
            try {
                aSN1ObjectIdentifier = new org.bouncycastle.asn1.ASN1ObjectIdentifier(upperCase);
            } catch (java.lang.Exception unused) {
                throw new java.lang.IllegalArgumentException("Unknown signature type requested");
            }
        }
        if (x509Name == null) {
            throw new java.lang.IllegalArgumentException("subject must not be null");
        }
        if (publicKey == null) {
            throw new java.lang.IllegalArgumentException("public key must not be null");
        }
        try {
            try {
                if (getHighResolutionOutputSizeshNQ4ISI.contains(aSN1ObjectIdentifier)) {
                    algorithmIdentifier = new org.bouncycastle.asn1.x509.AlgorithmIdentifier(aSN1ObjectIdentifier);
                } else {
                    if (getHighSpeedVideoSizes.containsKey(upperCase)) {
                        this.sigAlgId = new org.bouncycastle.asn1.x509.AlgorithmIdentifier(aSN1ObjectIdentifier, (org.bouncycastle.asn1.ASN1Encodable) getHighSpeedVideoSizes.get(upperCase));
                        this.reqInfo = new org.bouncycastle.asn1.pkcs.CertificationRequestInfo(x509Name, org.bouncycastle.asn1.x509.SubjectPublicKeyInfo.getInstance((org.bouncycastle.asn1.ASN1Sequence) org.bouncycastle.asn1.ASN1Primitive.fromByteArray(publicKey.getEncoded())), aSN1Set);
                        java.security.Signature signature = str2 != null ? java.security.Signature.getInstance(str) : java.security.Signature.getInstance(str, str2);
                        signature.initSign(privateKey);
                        signature.update(this.reqInfo.getEncoded(org.bouncycastle.asn1.ASN1Encoding.DER));
                        this.sigBits = new org.bouncycastle.asn1.DERBitString(signature.sign());
                        return;
                    }
                    algorithmIdentifier = new org.bouncycastle.asn1.x509.AlgorithmIdentifier(aSN1ObjectIdentifier, org.bouncycastle.asn1.DERNull.INSTANCE);
                }
                signature.update(this.reqInfo.getEncoded(org.bouncycastle.asn1.ASN1Encoding.DER));
                this.sigBits = new org.bouncycastle.asn1.DERBitString(signature.sign());
                return;
            } catch (java.lang.Exception e) {
                throw new java.lang.IllegalArgumentException("exception encoding TBS cert request - ".concat(java.lang.String.valueOf(e)));
            }
            this.reqInfo = new org.bouncycastle.asn1.pkcs.CertificationRequestInfo(x509Name, org.bouncycastle.asn1.x509.SubjectPublicKeyInfo.getInstance((org.bouncycastle.asn1.ASN1Sequence) org.bouncycastle.asn1.ASN1Primitive.fromByteArray(publicKey.getEncoded())), aSN1Set);
            if (str2 != null) {
            }
            signature.initSign(privateKey);
        } catch (java.io.IOException unused2) {
            throw new java.lang.IllegalArgumentException("can't encode public key");
        }
        this.sigAlgId = algorithmIdentifier;
    }

    public PKCS10CertificationRequest(java.lang.String str, org.bouncycastle.asn1.x509.X509Name x509Name, java.security.PublicKey publicKey, org.bouncycastle.asn1.ASN1Set aSN1Set, java.security.PrivateKey privateKey) throws java.security.NoSuchAlgorithmException, java.security.NoSuchProviderException, java.security.InvalidKeyException, java.security.SignatureException {
        this(str, x509Name, publicKey, aSN1Set, privateKey, org.bouncycastle.jce.provider.BouncyCastleProvider.PROVIDER_NAME);
    }

    public PKCS10CertificationRequest(java.lang.String str, javax.security.auth.x500.X500Principal x500Principal, java.security.PublicKey publicKey, org.bouncycastle.asn1.ASN1Set aSN1Set, java.security.PrivateKey privateKey, java.lang.String str2) throws java.security.NoSuchAlgorithmException, java.security.NoSuchProviderException, java.security.InvalidKeyException, java.security.SignatureException {
        this(str, Camera2StreamConfigurationMap(x500Principal), publicKey, aSN1Set, privateKey, str2);
    }

    public PKCS10CertificationRequest(java.lang.String str, javax.security.auth.x500.X500Principal x500Principal, java.security.PublicKey publicKey, org.bouncycastle.asn1.ASN1Set aSN1Set, java.security.PrivateKey privateKey) throws java.security.NoSuchAlgorithmException, java.security.NoSuchProviderException, java.security.InvalidKeyException, java.security.SignatureException {
        this(str, Camera2StreamConfigurationMap(x500Principal), publicKey, aSN1Set, privateKey, org.bouncycastle.jce.provider.BouncyCastleProvider.PROVIDER_NAME);
    }

    static {
        getHighSpeedVideoFpsRangesFor.put("MD2WITHRSAENCRYPTION", new org.bouncycastle.asn1.ASN1ObjectIdentifier("1.2.840.113549.1.1.2"));
        getHighSpeedVideoFpsRangesFor.put("MD2WITHRSA", new org.bouncycastle.asn1.ASN1ObjectIdentifier("1.2.840.113549.1.1.2"));
        getHighSpeedVideoFpsRangesFor.put("MD5WITHRSAENCRYPTION", new org.bouncycastle.asn1.ASN1ObjectIdentifier("1.2.840.113549.1.1.4"));
        getHighSpeedVideoFpsRangesFor.put("MD5WITHRSA", new org.bouncycastle.asn1.ASN1ObjectIdentifier("1.2.840.113549.1.1.4"));
        getHighSpeedVideoFpsRangesFor.put("RSAWITHMD5", new org.bouncycastle.asn1.ASN1ObjectIdentifier("1.2.840.113549.1.1.4"));
        getHighSpeedVideoFpsRangesFor.put("SHA1WITHRSAENCRYPTION", new org.bouncycastle.asn1.ASN1ObjectIdentifier("1.2.840.113549.1.1.5"));
        getHighSpeedVideoFpsRangesFor.put("SHA1WITHRSA", new org.bouncycastle.asn1.ASN1ObjectIdentifier("1.2.840.113549.1.1.5"));
        getHighSpeedVideoFpsRangesFor.put("SHA224WITHRSAENCRYPTION", org.bouncycastle.asn1.pkcs.PKCSObjectIdentifiers.sha224WithRSAEncryption);
        getHighSpeedVideoFpsRangesFor.put("SHA224WITHRSA", org.bouncycastle.asn1.pkcs.PKCSObjectIdentifiers.sha224WithRSAEncryption);
        getHighSpeedVideoFpsRangesFor.put("SHA256WITHRSAENCRYPTION", org.bouncycastle.asn1.pkcs.PKCSObjectIdentifiers.sha256WithRSAEncryption);
        getHighSpeedVideoFpsRangesFor.put("SHA256WITHRSA", org.bouncycastle.asn1.pkcs.PKCSObjectIdentifiers.sha256WithRSAEncryption);
        getHighSpeedVideoFpsRangesFor.put("SHA384WITHRSAENCRYPTION", org.bouncycastle.asn1.pkcs.PKCSObjectIdentifiers.sha384WithRSAEncryption);
        getHighSpeedVideoFpsRangesFor.put("SHA384WITHRSA", org.bouncycastle.asn1.pkcs.PKCSObjectIdentifiers.sha384WithRSAEncryption);
        getHighSpeedVideoFpsRangesFor.put("SHA512WITHRSAENCRYPTION", org.bouncycastle.asn1.pkcs.PKCSObjectIdentifiers.sha512WithRSAEncryption);
        getHighSpeedVideoFpsRangesFor.put("SHA512WITHRSA", org.bouncycastle.asn1.pkcs.PKCSObjectIdentifiers.sha512WithRSAEncryption);
        getHighSpeedVideoFpsRangesFor.put("SHA1WITHRSAANDMGF1", org.bouncycastle.asn1.pkcs.PKCSObjectIdentifiers.id_RSASSA_PSS);
        getHighSpeedVideoFpsRangesFor.put("SHA224WITHRSAANDMGF1", org.bouncycastle.asn1.pkcs.PKCSObjectIdentifiers.id_RSASSA_PSS);
        getHighSpeedVideoFpsRangesFor.put("SHA256WITHRSAANDMGF1", org.bouncycastle.asn1.pkcs.PKCSObjectIdentifiers.id_RSASSA_PSS);
        getHighSpeedVideoFpsRangesFor.put("SHA384WITHRSAANDMGF1", org.bouncycastle.asn1.pkcs.PKCSObjectIdentifiers.id_RSASSA_PSS);
        getHighSpeedVideoFpsRangesFor.put("SHA512WITHRSAANDMGF1", org.bouncycastle.asn1.pkcs.PKCSObjectIdentifiers.id_RSASSA_PSS);
        getHighSpeedVideoFpsRangesFor.put("RSAWITHSHA1", new org.bouncycastle.asn1.ASN1ObjectIdentifier("1.2.840.113549.1.1.5"));
        getHighSpeedVideoFpsRangesFor.put("RIPEMD128WITHRSAENCRYPTION", org.bouncycastle.asn1.teletrust.TeleTrusTObjectIdentifiers.rsaSignatureWithripemd128);
        getHighSpeedVideoFpsRangesFor.put("RIPEMD128WITHRSA", org.bouncycastle.asn1.teletrust.TeleTrusTObjectIdentifiers.rsaSignatureWithripemd128);
        getHighSpeedVideoFpsRangesFor.put("RIPEMD160WITHRSAENCRYPTION", org.bouncycastle.asn1.teletrust.TeleTrusTObjectIdentifiers.rsaSignatureWithripemd160);
        getHighSpeedVideoFpsRangesFor.put("RIPEMD160WITHRSA", org.bouncycastle.asn1.teletrust.TeleTrusTObjectIdentifiers.rsaSignatureWithripemd160);
        getHighSpeedVideoFpsRangesFor.put("RIPEMD256WITHRSAENCRYPTION", org.bouncycastle.asn1.teletrust.TeleTrusTObjectIdentifiers.rsaSignatureWithripemd256);
        getHighSpeedVideoFpsRangesFor.put("RIPEMD256WITHRSA", org.bouncycastle.asn1.teletrust.TeleTrusTObjectIdentifiers.rsaSignatureWithripemd256);
        getHighSpeedVideoFpsRangesFor.put("SHA1WITHDSA", new org.bouncycastle.asn1.ASN1ObjectIdentifier("1.2.840.10040.4.3"));
        getHighSpeedVideoFpsRangesFor.put("DSAWITHSHA1", new org.bouncycastle.asn1.ASN1ObjectIdentifier("1.2.840.10040.4.3"));
        getHighSpeedVideoFpsRangesFor.put("SHA224WITHDSA", org.bouncycastle.asn1.nist.NISTObjectIdentifiers.dsa_with_sha224);
        getHighSpeedVideoFpsRangesFor.put("SHA256WITHDSA", org.bouncycastle.asn1.nist.NISTObjectIdentifiers.dsa_with_sha256);
        getHighSpeedVideoFpsRangesFor.put("SHA384WITHDSA", org.bouncycastle.asn1.nist.NISTObjectIdentifiers.dsa_with_sha384);
        getHighSpeedVideoFpsRangesFor.put("SHA512WITHDSA", org.bouncycastle.asn1.nist.NISTObjectIdentifiers.dsa_with_sha512);
        getHighSpeedVideoFpsRangesFor.put("SHA1WITHECDSA", org.bouncycastle.asn1.x9.X9ObjectIdentifiers.ecdsa_with_SHA1);
        getHighSpeedVideoFpsRangesFor.put("SHA224WITHECDSA", org.bouncycastle.asn1.x9.X9ObjectIdentifiers.ecdsa_with_SHA224);
        getHighSpeedVideoFpsRangesFor.put("SHA256WITHECDSA", org.bouncycastle.asn1.x9.X9ObjectIdentifiers.ecdsa_with_SHA256);
        getHighSpeedVideoFpsRangesFor.put("SHA384WITHECDSA", org.bouncycastle.asn1.x9.X9ObjectIdentifiers.ecdsa_with_SHA384);
        getHighSpeedVideoFpsRangesFor.put("SHA512WITHECDSA", org.bouncycastle.asn1.x9.X9ObjectIdentifiers.ecdsa_with_SHA512);
        getHighSpeedVideoFpsRangesFor.put("ECDSAWITHSHA1", org.bouncycastle.asn1.x9.X9ObjectIdentifiers.ecdsa_with_SHA1);
        getHighSpeedVideoFpsRangesFor.put("GOST3411WITHGOST3410", org.bouncycastle.asn1.cryptopro.CryptoProObjectIdentifiers.gostR3411_94_with_gostR3410_94);
        getHighSpeedVideoFpsRangesFor.put("GOST3410WITHGOST3411", org.bouncycastle.asn1.cryptopro.CryptoProObjectIdentifiers.gostR3411_94_with_gostR3410_94);
        getHighSpeedVideoFpsRangesFor.put("GOST3411WITHECGOST3410", org.bouncycastle.asn1.cryptopro.CryptoProObjectIdentifiers.gostR3411_94_with_gostR3410_2001);
        getHighSpeedVideoFpsRangesFor.put("GOST3411WITHECGOST3410-2001", org.bouncycastle.asn1.cryptopro.CryptoProObjectIdentifiers.gostR3411_94_with_gostR3410_2001);
        getHighSpeedVideoFpsRangesFor.put("GOST3411WITHGOST3410-2001", org.bouncycastle.asn1.cryptopro.CryptoProObjectIdentifiers.gostR3411_94_with_gostR3410_2001);
        Camera2StreamConfigurationMap.put(new org.bouncycastle.asn1.ASN1ObjectIdentifier("1.2.840.113549.1.1.5"), "SHA1WITHRSA");
        Camera2StreamConfigurationMap.put(org.bouncycastle.asn1.pkcs.PKCSObjectIdentifiers.sha224WithRSAEncryption, "SHA224WITHRSA");
        Camera2StreamConfigurationMap.put(org.bouncycastle.asn1.pkcs.PKCSObjectIdentifiers.sha256WithRSAEncryption, "SHA256WITHRSA");
        Camera2StreamConfigurationMap.put(org.bouncycastle.asn1.pkcs.PKCSObjectIdentifiers.sha384WithRSAEncryption, "SHA384WITHRSA");
        Camera2StreamConfigurationMap.put(org.bouncycastle.asn1.pkcs.PKCSObjectIdentifiers.sha512WithRSAEncryption, "SHA512WITHRSA");
        Camera2StreamConfigurationMap.put(org.bouncycastle.asn1.cryptopro.CryptoProObjectIdentifiers.gostR3411_94_with_gostR3410_94, "GOST3411WITHGOST3410");
        Camera2StreamConfigurationMap.put(org.bouncycastle.asn1.cryptopro.CryptoProObjectIdentifiers.gostR3411_94_with_gostR3410_2001, "GOST3411WITHECGOST3410");
        Camera2StreamConfigurationMap.put(new org.bouncycastle.asn1.ASN1ObjectIdentifier("1.2.840.113549.1.1.4"), "MD5WITHRSA");
        Camera2StreamConfigurationMap.put(new org.bouncycastle.asn1.ASN1ObjectIdentifier("1.2.840.113549.1.1.2"), "MD2WITHRSA");
        Camera2StreamConfigurationMap.put(new org.bouncycastle.asn1.ASN1ObjectIdentifier("1.2.840.10040.4.3"), "SHA1WITHDSA");
        Camera2StreamConfigurationMap.put(org.bouncycastle.asn1.x9.X9ObjectIdentifiers.ecdsa_with_SHA1, "SHA1WITHECDSA");
        Camera2StreamConfigurationMap.put(org.bouncycastle.asn1.x9.X9ObjectIdentifiers.ecdsa_with_SHA224, "SHA224WITHECDSA");
        Camera2StreamConfigurationMap.put(org.bouncycastle.asn1.x9.X9ObjectIdentifiers.ecdsa_with_SHA256, "SHA256WITHECDSA");
        Camera2StreamConfigurationMap.put(org.bouncycastle.asn1.x9.X9ObjectIdentifiers.ecdsa_with_SHA384, "SHA384WITHECDSA");
        Camera2StreamConfigurationMap.put(org.bouncycastle.asn1.x9.X9ObjectIdentifiers.ecdsa_with_SHA512, "SHA512WITHECDSA");
        Camera2StreamConfigurationMap.put(org.bouncycastle.asn1.oiw.OIWObjectIdentifiers.sha1WithRSA, "SHA1WITHRSA");
        Camera2StreamConfigurationMap.put(org.bouncycastle.asn1.oiw.OIWObjectIdentifiers.dsaWithSHA1, "SHA1WITHDSA");
        Camera2StreamConfigurationMap.put(org.bouncycastle.asn1.nist.NISTObjectIdentifiers.dsa_with_sha224, "SHA224WITHDSA");
        Camera2StreamConfigurationMap.put(org.bouncycastle.asn1.nist.NISTObjectIdentifiers.dsa_with_sha256, "SHA256WITHDSA");
        getHighSpeedVideoFpsRanges.put(org.bouncycastle.asn1.pkcs.PKCSObjectIdentifiers.rsaEncryption, "RSA");
        getHighSpeedVideoFpsRanges.put(org.bouncycastle.asn1.x9.X9ObjectIdentifiers.id_dsa, "DSA");
        getHighResolutionOutputSizeshNQ4ISI.add(org.bouncycastle.asn1.x9.X9ObjectIdentifiers.ecdsa_with_SHA1);
        getHighResolutionOutputSizeshNQ4ISI.add(org.bouncycastle.asn1.x9.X9ObjectIdentifiers.ecdsa_with_SHA224);
        getHighResolutionOutputSizeshNQ4ISI.add(org.bouncycastle.asn1.x9.X9ObjectIdentifiers.ecdsa_with_SHA256);
        getHighResolutionOutputSizeshNQ4ISI.add(org.bouncycastle.asn1.x9.X9ObjectIdentifiers.ecdsa_with_SHA384);
        getHighResolutionOutputSizeshNQ4ISI.add(org.bouncycastle.asn1.x9.X9ObjectIdentifiers.ecdsa_with_SHA512);
        getHighResolutionOutputSizeshNQ4ISI.add(org.bouncycastle.asn1.x9.X9ObjectIdentifiers.id_dsa_with_sha1);
        getHighResolutionOutputSizeshNQ4ISI.add(org.bouncycastle.asn1.oiw.OIWObjectIdentifiers.dsaWithSHA1);
        getHighResolutionOutputSizeshNQ4ISI.add(org.bouncycastle.asn1.nist.NISTObjectIdentifiers.dsa_with_sha224);
        getHighResolutionOutputSizeshNQ4ISI.add(org.bouncycastle.asn1.nist.NISTObjectIdentifiers.dsa_with_sha256);
        getHighResolutionOutputSizeshNQ4ISI.add(org.bouncycastle.asn1.cryptopro.CryptoProObjectIdentifiers.gostR3411_94_with_gostR3410_94);
        getHighResolutionOutputSizeshNQ4ISI.add(org.bouncycastle.asn1.cryptopro.CryptoProObjectIdentifiers.gostR3411_94_with_gostR3410_2001);
        getHighSpeedVideoSizes.put("SHA1WITHRSAANDMGF1", getHighResolutionOutputSizeshNQ4ISI(new org.bouncycastle.asn1.x509.AlgorithmIdentifier(org.bouncycastle.asn1.oiw.OIWObjectIdentifiers.idSHA1, org.bouncycastle.asn1.DERNull.INSTANCE), 20));
        getHighSpeedVideoSizes.put("SHA224WITHRSAANDMGF1", getHighResolutionOutputSizeshNQ4ISI(new org.bouncycastle.asn1.x509.AlgorithmIdentifier(org.bouncycastle.asn1.nist.NISTObjectIdentifiers.id_sha224, org.bouncycastle.asn1.DERNull.INSTANCE), 28));
        getHighSpeedVideoSizes.put("SHA256WITHRSAANDMGF1", getHighResolutionOutputSizeshNQ4ISI(new org.bouncycastle.asn1.x509.AlgorithmIdentifier(org.bouncycastle.asn1.nist.NISTObjectIdentifiers.id_sha256, org.bouncycastle.asn1.DERNull.INSTANCE), 32));
        getHighSpeedVideoSizes.put("SHA384WITHRSAANDMGF1", getHighResolutionOutputSizeshNQ4ISI(new org.bouncycastle.asn1.x509.AlgorithmIdentifier(org.bouncycastle.asn1.nist.NISTObjectIdentifiers.id_sha384, org.bouncycastle.asn1.DERNull.INSTANCE), 48));
        getHighSpeedVideoSizes.put("SHA512WITHRSAANDMGF1", getHighResolutionOutputSizeshNQ4ISI(new org.bouncycastle.asn1.x509.AlgorithmIdentifier(org.bouncycastle.asn1.nist.NISTObjectIdentifiers.id_sha512, org.bouncycastle.asn1.DERNull.INSTANCE), 64));
    }
}
