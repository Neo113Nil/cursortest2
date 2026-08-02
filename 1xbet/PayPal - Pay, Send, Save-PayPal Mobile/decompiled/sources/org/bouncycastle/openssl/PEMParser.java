package org.bouncycastle.openssl;

/* loaded from: classes17.dex */
public class PEMParser extends org.bouncycastle.util.io.pem.PemReader {
    public static final java.lang.String TYPE_ATTRIBUTE_CERTIFICATE = "ATTRIBUTE CERTIFICATE";
    public static final java.lang.String TYPE_CERTIFICATE = "CERTIFICATE";
    public static final java.lang.String TYPE_CERTIFICATE_REQUEST = "CERTIFICATE REQUEST";
    public static final java.lang.String TYPE_CMS = "CMS";
    public static final java.lang.String TYPE_DSA_PRIVATE_KEY = "DSA PRIVATE KEY";
    public static final java.lang.String TYPE_EC_PARAMETERS = "EC PARAMETERS";
    public static final java.lang.String TYPE_EC_PRIVATE_KEY = "EC PRIVATE KEY";
    public static final java.lang.String TYPE_ENCRYPTED_PRIVATE_KEY = "ENCRYPTED PRIVATE KEY";
    public static final java.lang.String TYPE_NEW_CERTIFICATE_REQUEST = "NEW CERTIFICATE REQUEST";
    public static final java.lang.String TYPE_PKCS7 = "PKCS7";
    public static final java.lang.String TYPE_PRIVATE_KEY = "PRIVATE KEY";
    public static final java.lang.String TYPE_PUBLIC_KEY = "PUBLIC KEY";
    public static final java.lang.String TYPE_RSA_PRIVATE_KEY = "RSA PRIVATE KEY";
    public static final java.lang.String TYPE_RSA_PUBLIC_KEY = "RSA PUBLIC KEY";
    public static final java.lang.String TYPE_TRUSTED_CERTIFICATE = "TRUSTED CERTIFICATE";
    public static final java.lang.String TYPE_X509_CERTIFICATE = "X509 CERTIFICATE";
    public static final java.lang.String TYPE_X509_CRL = "X509 CRL";
    protected final java.util.Map parsers;

    class DSAKeyPairParser implements org.bouncycastle.openssl.PEMKeyPairParser {
        @Override // org.bouncycastle.openssl.PEMKeyPairParser
        public final org.bouncycastle.openssl.PEMKeyPair getHighSpeedVideoFpsRangesFor(byte[] bArr) throws java.io.IOException {
            try {
                org.bouncycastle.asn1.ASN1Sequence aSN1Sequence = org.bouncycastle.asn1.ASN1Sequence.getInstance(bArr);
                if (aSN1Sequence.size() != 6) {
                    throw new org.bouncycastle.openssl.PEMException("malformed sequence in DSA private key");
                }
                org.bouncycastle.asn1.ASN1Integer aSN1Integer = org.bouncycastle.asn1.ASN1Integer.getInstance(aSN1Sequence.getObjectAt(1));
                org.bouncycastle.asn1.ASN1Integer aSN1Integer2 = org.bouncycastle.asn1.ASN1Integer.getInstance(aSN1Sequence.getObjectAt(2));
                org.bouncycastle.asn1.ASN1Integer aSN1Integer3 = org.bouncycastle.asn1.ASN1Integer.getInstance(aSN1Sequence.getObjectAt(3));
                return new org.bouncycastle.openssl.PEMKeyPair(new org.bouncycastle.asn1.x509.SubjectPublicKeyInfo(new org.bouncycastle.asn1.x509.AlgorithmIdentifier(org.bouncycastle.asn1.x9.X9ObjectIdentifiers.id_dsa, new org.bouncycastle.asn1.x509.DSAParameter(aSN1Integer.getValue(), aSN1Integer2.getValue(), aSN1Integer3.getValue())), org.bouncycastle.asn1.ASN1Integer.getInstance(aSN1Sequence.getObjectAt(4))), new org.bouncycastle.asn1.pkcs.PrivateKeyInfo(new org.bouncycastle.asn1.x509.AlgorithmIdentifier(org.bouncycastle.asn1.x9.X9ObjectIdentifiers.id_dsa, new org.bouncycastle.asn1.x509.DSAParameter(aSN1Integer.getValue(), aSN1Integer2.getValue(), aSN1Integer3.getValue())), org.bouncycastle.asn1.ASN1Integer.getInstance(aSN1Sequence.getObjectAt(5))));
            } catch (java.io.IOException e) {
                throw e;
            } catch (java.lang.Exception e2) {
                java.lang.StringBuilder sb = new java.lang.StringBuilder("problem creating DSA private key: ");
                sb.append(e2.toString());
                throw new org.bouncycastle.openssl.PEMException(sb.toString(), e2);
            }
        }

        /* synthetic */ DSAKeyPairParser(org.bouncycastle.openssl.PEMParser pEMParser, byte b) {
            this();
        }

        private DSAKeyPairParser() {
        }
    }

    class ECCurveParamsParser implements org.bouncycastle.util.io.pem.PemObjectParser {
        @Override // org.bouncycastle.util.io.pem.PemObjectParser
        public java.lang.Object parseObject(org.bouncycastle.util.io.pem.PemObject pemObject) throws java.io.IOException {
            try {
                org.bouncycastle.asn1.ASN1Primitive fromByteArray = org.bouncycastle.asn1.ASN1Primitive.fromByteArray(pemObject.getContent());
                if (fromByteArray instanceof org.bouncycastle.asn1.ASN1ObjectIdentifier) {
                    return org.bouncycastle.asn1.ASN1Primitive.fromByteArray(pemObject.getContent());
                }
                if (fromByteArray instanceof org.bouncycastle.asn1.ASN1Sequence) {
                    return org.bouncycastle.asn1.x9.X9ECParameters.getInstance(fromByteArray);
                }
                return null;
            } catch (java.io.IOException e) {
                throw e;
            } catch (java.lang.Exception e2) {
                java.lang.StringBuilder sb = new java.lang.StringBuilder("exception extracting EC named curve: ");
                sb.append(e2.toString());
                throw new org.bouncycastle.openssl.PEMException(sb.toString());
            }
        }

        /* synthetic */ ECCurveParamsParser(org.bouncycastle.openssl.PEMParser pEMParser, byte b) {
            this();
        }

        private ECCurveParamsParser() {
        }
    }

    class ECDSAKeyPairParser implements org.bouncycastle.openssl.PEMKeyPairParser {
        @Override // org.bouncycastle.openssl.PEMKeyPairParser
        public final org.bouncycastle.openssl.PEMKeyPair getHighSpeedVideoFpsRangesFor(byte[] bArr) throws java.io.IOException {
            try {
                org.bouncycastle.asn1.sec.ECPrivateKey eCPrivateKey = org.bouncycastle.asn1.sec.ECPrivateKey.getInstance(org.bouncycastle.asn1.ASN1Sequence.getInstance(bArr));
                org.bouncycastle.asn1.x509.AlgorithmIdentifier algorithmIdentifier = new org.bouncycastle.asn1.x509.AlgorithmIdentifier(org.bouncycastle.asn1.x9.X9ObjectIdentifiers.id_ecPublicKey, eCPrivateKey.getParametersObject());
                org.bouncycastle.asn1.pkcs.PrivateKeyInfo privateKeyInfo = new org.bouncycastle.asn1.pkcs.PrivateKeyInfo(algorithmIdentifier, eCPrivateKey);
                return eCPrivateKey.getPublicKey() != null ? new org.bouncycastle.openssl.PEMKeyPair(new org.bouncycastle.asn1.x509.SubjectPublicKeyInfo(algorithmIdentifier, eCPrivateKey.getPublicKey().getBytes()), privateKeyInfo) : new org.bouncycastle.openssl.PEMKeyPair(null, privateKeyInfo);
            } catch (java.io.IOException e) {
                throw e;
            } catch (java.lang.Exception e2) {
                java.lang.StringBuilder sb = new java.lang.StringBuilder("problem creating EC private key: ");
                sb.append(e2.toString());
                throw new org.bouncycastle.openssl.PEMException(sb.toString(), e2);
            }
        }

        /* synthetic */ ECDSAKeyPairParser(org.bouncycastle.openssl.PEMParser pEMParser, byte b) {
            this();
        }

        private ECDSAKeyPairParser() {
        }
    }

    class PKCS10CertificationRequestParser implements org.bouncycastle.util.io.pem.PemObjectParser {
        @Override // org.bouncycastle.util.io.pem.PemObjectParser
        public java.lang.Object parseObject(org.bouncycastle.util.io.pem.PemObject pemObject) throws java.io.IOException {
            try {
                return new org.bouncycastle.pkcs.PKCS10CertificationRequest(pemObject.getContent());
            } catch (java.lang.Exception e) {
                java.lang.StringBuilder sb = new java.lang.StringBuilder("problem parsing certrequest: ");
                sb.append(e.toString());
                throw new org.bouncycastle.openssl.PEMException(sb.toString(), e);
            }
        }

        /* synthetic */ PKCS10CertificationRequestParser(org.bouncycastle.openssl.PEMParser pEMParser, byte b) {
            this();
        }

        private PKCS10CertificationRequestParser() {
        }
    }

    class PKCS7Parser implements org.bouncycastle.util.io.pem.PemObjectParser {
        @Override // org.bouncycastle.util.io.pem.PemObjectParser
        public java.lang.Object parseObject(org.bouncycastle.util.io.pem.PemObject pemObject) throws java.io.IOException {
            try {
                return org.bouncycastle.asn1.cms.ContentInfo.getInstance(new org.bouncycastle.asn1.ASN1InputStream(pemObject.getContent()).readObject());
            } catch (java.lang.Exception e) {
                java.lang.StringBuilder sb = new java.lang.StringBuilder("problem parsing PKCS7 object: ");
                sb.append(e.toString());
                throw new org.bouncycastle.openssl.PEMException(sb.toString(), e);
            }
        }

        /* synthetic */ PKCS7Parser(org.bouncycastle.openssl.PEMParser pEMParser, byte b) {
            this();
        }

        private PKCS7Parser() {
        }
    }

    class RSAKeyPairParser implements org.bouncycastle.openssl.PEMKeyPairParser {
        @Override // org.bouncycastle.openssl.PEMKeyPairParser
        public final org.bouncycastle.openssl.PEMKeyPair getHighSpeedVideoFpsRangesFor(byte[] bArr) throws java.io.IOException {
            try {
                org.bouncycastle.asn1.ASN1Sequence aSN1Sequence = org.bouncycastle.asn1.ASN1Sequence.getInstance(bArr);
                if (aSN1Sequence.size() != 9) {
                    throw new org.bouncycastle.openssl.PEMException("malformed sequence in RSA private key");
                }
                org.bouncycastle.asn1.pkcs.RSAPrivateKey rSAPrivateKey = org.bouncycastle.asn1.pkcs.RSAPrivateKey.getInstance(aSN1Sequence);
                org.bouncycastle.asn1.pkcs.RSAPublicKey rSAPublicKey = new org.bouncycastle.asn1.pkcs.RSAPublicKey(rSAPrivateKey.getModulus(), rSAPrivateKey.getPublicExponent());
                org.bouncycastle.asn1.x509.AlgorithmIdentifier algorithmIdentifier = new org.bouncycastle.asn1.x509.AlgorithmIdentifier(org.bouncycastle.asn1.pkcs.PKCSObjectIdentifiers.rsaEncryption, org.bouncycastle.asn1.DERNull.INSTANCE);
                return new org.bouncycastle.openssl.PEMKeyPair(new org.bouncycastle.asn1.x509.SubjectPublicKeyInfo(algorithmIdentifier, rSAPublicKey), new org.bouncycastle.asn1.pkcs.PrivateKeyInfo(algorithmIdentifier, rSAPrivateKey));
            } catch (java.io.IOException e) {
                throw e;
            } catch (java.lang.Exception e2) {
                java.lang.StringBuilder sb = new java.lang.StringBuilder("problem creating RSA private key: ");
                sb.append(e2.toString());
                throw new org.bouncycastle.openssl.PEMException(sb.toString(), e2);
            }
        }

        /* synthetic */ RSAKeyPairParser(org.bouncycastle.openssl.PEMParser pEMParser, byte b) {
            this();
        }

        private RSAKeyPairParser() {
        }
    }

    class X509AttributeCertificateParser implements org.bouncycastle.util.io.pem.PemObjectParser {
        @Override // org.bouncycastle.util.io.pem.PemObjectParser
        public java.lang.Object parseObject(org.bouncycastle.util.io.pem.PemObject pemObject) throws java.io.IOException {
            return new org.bouncycastle.cert.X509AttributeCertificateHolder(pemObject.getContent());
        }

        /* synthetic */ X509AttributeCertificateParser(org.bouncycastle.openssl.PEMParser pEMParser, byte b) {
            this();
        }

        private X509AttributeCertificateParser() {
        }
    }

    class X509CRLParser implements org.bouncycastle.util.io.pem.PemObjectParser {
        @Override // org.bouncycastle.util.io.pem.PemObjectParser
        public java.lang.Object parseObject(org.bouncycastle.util.io.pem.PemObject pemObject) throws java.io.IOException {
            try {
                return new org.bouncycastle.cert.X509CRLHolder(pemObject.getContent());
            } catch (java.lang.Exception e) {
                java.lang.StringBuilder sb = new java.lang.StringBuilder("problem parsing cert: ");
                sb.append(e.toString());
                throw new org.bouncycastle.openssl.PEMException(sb.toString(), e);
            }
        }

        /* synthetic */ X509CRLParser(org.bouncycastle.openssl.PEMParser pEMParser, byte b) {
            this();
        }

        private X509CRLParser() {
        }
    }

    class X509CertificateParser implements org.bouncycastle.util.io.pem.PemObjectParser {
        @Override // org.bouncycastle.util.io.pem.PemObjectParser
        public java.lang.Object parseObject(org.bouncycastle.util.io.pem.PemObject pemObject) throws java.io.IOException {
            try {
                return new org.bouncycastle.cert.X509CertificateHolder(pemObject.getContent());
            } catch (java.lang.Exception e) {
                java.lang.StringBuilder sb = new java.lang.StringBuilder("problem parsing cert: ");
                sb.append(e.toString());
                throw new org.bouncycastle.openssl.PEMException(sb.toString(), e);
            }
        }

        /* synthetic */ X509CertificateParser(org.bouncycastle.openssl.PEMParser pEMParser, byte b) {
            this();
        }

        private X509CertificateParser() {
        }
    }

    class X509TrustedCertificateParser implements org.bouncycastle.util.io.pem.PemObjectParser {
        @Override // org.bouncycastle.util.io.pem.PemObjectParser
        public java.lang.Object parseObject(org.bouncycastle.util.io.pem.PemObject pemObject) throws java.io.IOException {
            try {
                return new org.bouncycastle.openssl.X509TrustedCertificateBlock(pemObject.getContent());
            } catch (java.lang.Exception e) {
                java.lang.StringBuilder sb = new java.lang.StringBuilder("problem parsing cert: ");
                sb.append(e.toString());
                throw new org.bouncycastle.openssl.PEMException(sb.toString(), e);
            }
        }

        /* synthetic */ X509TrustedCertificateParser(org.bouncycastle.openssl.PEMParser pEMParser, byte b) {
            this();
        }

        private X509TrustedCertificateParser() {
        }
    }

    class EncryptedPrivateKeyParser implements org.bouncycastle.util.io.pem.PemObjectParser {
        @Override // org.bouncycastle.util.io.pem.PemObjectParser
        public java.lang.Object parseObject(org.bouncycastle.util.io.pem.PemObject pemObject) throws java.io.IOException {
            try {
                return new org.bouncycastle.pkcs.PKCS8EncryptedPrivateKeyInfo(org.bouncycastle.asn1.pkcs.EncryptedPrivateKeyInfo.getInstance(pemObject.getContent()));
            } catch (java.lang.Exception e) {
                java.lang.StringBuilder sb = new java.lang.StringBuilder("problem parsing ENCRYPTED PRIVATE KEY: ");
                sb.append(e.toString());
                throw new org.bouncycastle.openssl.PEMException(sb.toString(), e);
            }
        }

        public EncryptedPrivateKeyParser() {
        }
    }

    class KeyPairParser implements org.bouncycastle.util.io.pem.PemObjectParser {
        private final org.bouncycastle.openssl.PEMKeyPairParser Camera2StreamConfigurationMap;

        @Override // org.bouncycastle.util.io.pem.PemObjectParser
        public java.lang.Object parseObject(org.bouncycastle.util.io.pem.PemObject pemObject) throws java.io.IOException {
            boolean z = false;
            java.lang.String str = null;
            for (org.bouncycastle.util.io.pem.PemHeader pemHeader : pemObject.getHeaders()) {
                if (pemHeader.getName().equals("Proc-Type") && pemHeader.getValue().equals("4,ENCRYPTED")) {
                    z = true;
                } else if (pemHeader.getName().equals("DEK-Info")) {
                    str = pemHeader.getValue();
                }
            }
            byte[] content = pemObject.getContent();
            try {
                if (!z) {
                    return this.Camera2StreamConfigurationMap.getHighSpeedVideoFpsRangesFor(content);
                }
                java.util.StringTokenizer stringTokenizer = new java.util.StringTokenizer(str, ",");
                return new org.bouncycastle.openssl.PEMEncryptedKeyPair(stringTokenizer.nextToken(), org.bouncycastle.util.encoders.Hex.decode(stringTokenizer.nextToken()), content, this.Camera2StreamConfigurationMap);
            } catch (java.io.IOException e) {
                if (z) {
                    throw new org.bouncycastle.openssl.PEMException("exception decoding - please check password and data.", e);
                }
                throw new org.bouncycastle.openssl.PEMException(e.getMessage(), e);
            } catch (java.lang.IllegalArgumentException e2) {
                if (z) {
                    throw new org.bouncycastle.openssl.PEMException("exception decoding - please check password and data.", e2);
                }
                throw new org.bouncycastle.openssl.PEMException(e2.getMessage(), e2);
            }
        }

        public KeyPairParser(org.bouncycastle.openssl.PEMKeyPairParser pEMKeyPairParser) {
            this.Camera2StreamConfigurationMap = pEMKeyPairParser;
        }
    }

    class PrivateKeyParser implements org.bouncycastle.util.io.pem.PemObjectParser {
        @Override // org.bouncycastle.util.io.pem.PemObjectParser
        public java.lang.Object parseObject(org.bouncycastle.util.io.pem.PemObject pemObject) throws java.io.IOException {
            try {
                return org.bouncycastle.asn1.pkcs.PrivateKeyInfo.getInstance(pemObject.getContent());
            } catch (java.lang.Exception e) {
                java.lang.StringBuilder sb = new java.lang.StringBuilder("problem parsing PRIVATE KEY: ");
                sb.append(e.toString());
                throw new org.bouncycastle.openssl.PEMException(sb.toString(), e);
            }
        }

        public PrivateKeyParser() {
        }
    }

    class PublicKeyParser implements org.bouncycastle.util.io.pem.PemObjectParser {
        @Override // org.bouncycastle.util.io.pem.PemObjectParser
        public java.lang.Object parseObject(org.bouncycastle.util.io.pem.PemObject pemObject) throws java.io.IOException {
            return org.bouncycastle.asn1.x509.SubjectPublicKeyInfo.getInstance(pemObject.getContent());
        }

        public PublicKeyParser() {
        }
    }

    class RSAPublicKeyParser implements org.bouncycastle.util.io.pem.PemObjectParser {
        @Override // org.bouncycastle.util.io.pem.PemObjectParser
        public java.lang.Object parseObject(org.bouncycastle.util.io.pem.PemObject pemObject) throws java.io.IOException {
            try {
                return new org.bouncycastle.asn1.x509.SubjectPublicKeyInfo(new org.bouncycastle.asn1.x509.AlgorithmIdentifier(org.bouncycastle.asn1.pkcs.PKCSObjectIdentifiers.rsaEncryption, org.bouncycastle.asn1.DERNull.INSTANCE), org.bouncycastle.asn1.pkcs.RSAPublicKey.getInstance(pemObject.getContent()));
            } catch (java.io.IOException e) {
                throw e;
            } catch (java.lang.Exception e2) {
                java.lang.StringBuilder sb = new java.lang.StringBuilder("problem extracting key: ");
                sb.append(e2.toString());
                throw new org.bouncycastle.openssl.PEMException(sb.toString(), e2);
            }
        }

        public RSAPublicKeyParser() {
        }
    }

    public java.lang.Object readObject() throws java.io.IOException {
        org.bouncycastle.util.io.pem.PemObject readPemObject = readPemObject();
        if (readPemObject == null) {
            return null;
        }
        java.lang.String type = readPemObject.getType();
        java.lang.Object obj = this.parsers.get(type);
        if (obj != null) {
            return ((org.bouncycastle.util.io.pem.PemObjectParser) obj).parseObject(readPemObject);
        }
        throw new java.io.IOException("unrecognised object: ".concat(java.lang.String.valueOf(type)));
    }

    public java.util.Set<java.lang.String> getSupportedTypes() {
        return java.util.Collections.unmodifiableSet(this.parsers.keySet());
    }

    public PEMParser(java.io.Reader reader) {
        super(reader);
        java.util.HashMap hashMap = new java.util.HashMap();
        this.parsers = hashMap;
        byte b = 0;
        hashMap.put(TYPE_CERTIFICATE_REQUEST, new org.bouncycastle.openssl.PEMParser.PKCS10CertificationRequestParser(this, b));
        hashMap.put(TYPE_NEW_CERTIFICATE_REQUEST, new org.bouncycastle.openssl.PEMParser.PKCS10CertificationRequestParser(this, b));
        hashMap.put(TYPE_CERTIFICATE, new org.bouncycastle.openssl.PEMParser.X509CertificateParser(this, b));
        hashMap.put(TYPE_TRUSTED_CERTIFICATE, new org.bouncycastle.openssl.PEMParser.X509TrustedCertificateParser(this, b));
        hashMap.put(TYPE_X509_CERTIFICATE, new org.bouncycastle.openssl.PEMParser.X509CertificateParser(this, b));
        hashMap.put(TYPE_X509_CRL, new org.bouncycastle.openssl.PEMParser.X509CRLParser(this, b));
        hashMap.put(TYPE_PKCS7, new org.bouncycastle.openssl.PEMParser.PKCS7Parser(this, b));
        hashMap.put(TYPE_CMS, new org.bouncycastle.openssl.PEMParser.PKCS7Parser(this, b));
        hashMap.put(TYPE_ATTRIBUTE_CERTIFICATE, new org.bouncycastle.openssl.PEMParser.X509AttributeCertificateParser(this, b));
        hashMap.put(TYPE_EC_PARAMETERS, new org.bouncycastle.openssl.PEMParser.ECCurveParamsParser(this, b));
        hashMap.put(TYPE_PUBLIC_KEY, new org.bouncycastle.openssl.PEMParser.PublicKeyParser());
        hashMap.put(TYPE_RSA_PUBLIC_KEY, new org.bouncycastle.openssl.PEMParser.RSAPublicKeyParser());
        hashMap.put(TYPE_RSA_PRIVATE_KEY, new org.bouncycastle.openssl.PEMParser.KeyPairParser(new org.bouncycastle.openssl.PEMParser.RSAKeyPairParser(this, b)));
        hashMap.put(TYPE_DSA_PRIVATE_KEY, new org.bouncycastle.openssl.PEMParser.KeyPairParser(new org.bouncycastle.openssl.PEMParser.DSAKeyPairParser(this, b)));
        hashMap.put(TYPE_EC_PRIVATE_KEY, new org.bouncycastle.openssl.PEMParser.KeyPairParser(new org.bouncycastle.openssl.PEMParser.ECDSAKeyPairParser(this, b)));
        hashMap.put(TYPE_ENCRYPTED_PRIVATE_KEY, new org.bouncycastle.openssl.PEMParser.EncryptedPrivateKeyParser());
        hashMap.put(TYPE_PRIVATE_KEY, new org.bouncycastle.openssl.PEMParser.PrivateKeyParser());
    }
}
