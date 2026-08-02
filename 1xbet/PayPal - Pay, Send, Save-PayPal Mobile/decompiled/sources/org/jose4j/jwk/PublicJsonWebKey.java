package org.jose4j.jwk;

/* loaded from: classes18.dex */
public abstract class PublicJsonWebKey extends org.jose4j.jwk.JsonWebKey {
    public static final java.lang.String X509_CERTIFICATE_CHAIN_PARAMETER = "x5c";
    public static final java.lang.String X509_SHA256_THUMBPRINT_PARAMETER = "x5t#S256";
    public static final java.lang.String X509_THUMBPRINT_PARAMETER = "x5t";
    public static final java.lang.String X509_URL_PARAMETER = "x5u";
    private java.lang.String Camera2StreamConfigurationMap;
    private java.lang.String getHighSpeedVideoFpsRanges;
    private java.lang.String getHighSpeedVideoFpsRangesFor;
    private java.util.List<java.security.cert.X509Certificate> getHighSpeedVideoSizes;
    protected java.lang.String jcaProvider;
    protected java.security.PrivateKey privateKey;
    protected boolean writeOutPrivateKeyToJson;

    protected abstract void fillPrivateTypeSpecificParams(java.util.Map<java.lang.String, java.lang.Object> map);

    protected abstract void fillPublicTypeSpecificParams(java.util.Map<java.lang.String, java.lang.Object> map);

    protected PublicJsonWebKey(java.security.PublicKey publicKey) {
        super(publicKey);
    }

    protected PublicJsonWebKey(java.util.Map<java.lang.String, java.lang.Object> map) throws org.jose4j.lang.JoseException {
        this(map, null);
    }

    protected PublicJsonWebKey(java.util.Map<java.lang.String, java.lang.Object> map, java.lang.String str) throws org.jose4j.lang.JoseException {
        super(map);
        this.jcaProvider = str;
        if (map.containsKey("x5c")) {
            java.util.List<java.lang.String> stringArray = org.jose4j.lang.JsonHelp.getStringArray(map, "x5c");
            this.getHighSpeedVideoSizes = new java.util.ArrayList(stringArray.size());
            org.jose4j.keys.X509Util x509Util = org.jose4j.keys.X509Util.getX509Util(str);
            java.util.Iterator<java.lang.String> it = stringArray.iterator();
            while (it.hasNext()) {
                this.getHighSpeedVideoSizes.add(x509Util.fromBase64Der(it.next()));
            }
        }
        this.getHighSpeedVideoFpsRangesFor = getString(map, "x5t");
        this.getHighSpeedVideoFpsRanges = getString(map, "x5t#S256");
        this.Camera2StreamConfigurationMap = getString(map, "x5u");
        removeFromOtherParams("x5c", "x5t#S256", "x5t", "x5u");
    }

    @Override // org.jose4j.jwk.JsonWebKey
    protected void fillTypeSpecificParams(java.util.Map<java.lang.String, java.lang.Object> map, org.jose4j.jwk.JsonWebKey.OutputControlLevel outputControlLevel) {
        fillPublicTypeSpecificParams(map);
        if (this.getHighSpeedVideoSizes != null) {
            org.jose4j.keys.X509Util x509Util = new org.jose4j.keys.X509Util();
            java.util.ArrayList arrayList = new java.util.ArrayList(this.getHighSpeedVideoSizes.size());
            java.util.Iterator<java.security.cert.X509Certificate> it = this.getHighSpeedVideoSizes.iterator();
            while (it.hasNext()) {
                arrayList.add(x509Util.toBase64(it.next()));
            }
            map.put("x5c", arrayList);
        }
        putIfNotNull("x5t", this.getHighSpeedVideoFpsRangesFor, map);
        putIfNotNull("x5t#S256", this.getHighSpeedVideoFpsRanges, map);
        putIfNotNull("x5u", this.Camera2StreamConfigurationMap, map);
        if (this.writeOutPrivateKeyToJson || outputControlLevel == org.jose4j.jwk.JsonWebKey.OutputControlLevel.INCLUDE_PRIVATE) {
            fillPrivateTypeSpecificParams(map);
        }
    }

    @Override // org.jose4j.jwk.JsonWebKey
    public java.security.PublicKey getPublicKey() {
        return (java.security.PublicKey) this.key;
    }

    public void setWriteOutPrivateKeyToJson(boolean z) {
        this.writeOutPrivateKeyToJson = z;
    }

    public java.security.PrivateKey getPrivateKey() {
        return this.privateKey;
    }

    public void setPrivateKey(java.security.PrivateKey privateKey) {
        this.privateKey = privateKey;
    }

    public java.util.List<java.security.cert.X509Certificate> getCertificateChain() {
        return this.getHighSpeedVideoSizes;
    }

    public java.security.cert.X509Certificate getLeafCertificate() {
        java.util.List<java.security.cert.X509Certificate> list = this.getHighSpeedVideoSizes;
        if (list == null || list.isEmpty()) {
            return null;
        }
        return this.getHighSpeedVideoSizes.get(0);
    }

    public java.lang.String getX509CertificateSha1Thumbprint() {
        return getX509CertificateSha1Thumbprint(false);
    }

    public java.lang.String getX509CertificateSha1Thumbprint(boolean z) {
        java.security.cert.X509Certificate leafCertificate;
        java.lang.String str = this.getHighSpeedVideoFpsRangesFor;
        return (str == null && z && (leafCertificate = getLeafCertificate()) != null) ? org.jose4j.keys.X509Util.x5t(leafCertificate) : str;
    }

    public java.lang.String getX509CertificateSha256Thumbprint() {
        return getX509CertificateSha256Thumbprint(false);
    }

    public java.lang.String getX509CertificateSha256Thumbprint(boolean z) {
        java.security.cert.X509Certificate leafCertificate;
        java.lang.String str = this.getHighSpeedVideoFpsRanges;
        return (str == null && z && (leafCertificate = getLeafCertificate()) != null) ? org.jose4j.keys.X509Util.x5tS256(leafCertificate) : str;
    }

    public java.lang.String getX509Url() {
        return this.Camera2StreamConfigurationMap;
    }

    public void setCertificateChain(java.util.List<java.security.cert.X509Certificate> list) {
        Camera2StreamConfigurationMap();
        this.getHighSpeedVideoSizes = list;
    }

    public void setX509CertificateSha1Thumbprint(java.lang.String str) {
        this.getHighSpeedVideoFpsRangesFor = str;
    }

    public void setX509CertificateSha256Thumbprint(java.lang.String str) {
        this.getHighSpeedVideoFpsRanges = str;
    }

    public void setX509Url(java.lang.String str) {
        this.Camera2StreamConfigurationMap = str;
    }

    final void Camera2StreamConfigurationMap() {
        java.security.cert.X509Certificate leafCertificate = getLeafCertificate();
        if (leafCertificate == null || leafCertificate.getPublicKey().equals(getPublicKey())) {
            return;
        }
        java.lang.StringBuilder sb = new java.lang.StringBuilder("The key in the first certificate MUST match the bare public key represented by other members of the JWK. Public key = ");
        sb.append(getPublicKey());
        sb.append(" cert = ");
        sb.append(leafCertificate);
        throw new java.lang.IllegalArgumentException(sb.toString());
    }

    public void setCertificateChain(java.security.cert.X509Certificate... x509CertificateArr) {
        setCertificateChain(java.util.Arrays.asList(x509CertificateArr));
    }

    static java.math.BigInteger getHighSpeedVideoFpsRanges(java.util.Map<java.lang.String, java.lang.Object> map, java.lang.String str, boolean z) throws org.jose4j.lang.JoseException {
        return org.jose4j.keys.BigEndianBigInteger.fromBase64Url(getString(map, str, z));
    }

    public static class Factory {
        public static org.jose4j.jwk.PublicJsonWebKey newPublicJwk(java.util.Map<java.lang.String, java.lang.Object> map, java.lang.String str) throws org.jose4j.lang.JoseException {
            char c;
            java.lang.String stringRequired = org.jose4j.jwk.JsonWebKey.getStringRequired(map, "kty");
            stringRequired.hashCode();
            int hashCode = stringRequired.hashCode();
            if (hashCode == 2206) {
                if (stringRequired.equals("EC")) {
                    c = 0;
                }
                c = 65535;
            } else if (hashCode != 78324) {
                if (hashCode == 81440 && stringRequired.equals("RSA")) {
                    c = 2;
                }
                c = 65535;
            } else {
                if (stringRequired.equals(org.jose4j.jwk.OctetKeyPairJsonWebKey.KEY_TYPE)) {
                    c = 1;
                }
                c = 65535;
            }
            if (c == 0) {
                return new org.jose4j.jwk.EllipticCurveJsonWebKey(map, str);
            }
            if (c == 1) {
                return new org.jose4j.jwk.OctetKeyPairJsonWebKey(map, str);
            }
            if (c == 2) {
                return new org.jose4j.jwk.RsaJsonWebKey(map, str);
            }
            java.lang.StringBuilder sb = new java.lang.StringBuilder("Unknown key type (for public keys): '");
            sb.append(stringRequired);
            sb.append("'");
            throw new org.jose4j.lang.JoseException(sb.toString());
        }

        public static org.jose4j.jwk.PublicJsonWebKey newPublicJwk(java.util.Map<java.lang.String, java.lang.Object> map) throws org.jose4j.lang.JoseException {
            return newPublicJwk(map, (java.lang.String) null);
        }

        public static org.jose4j.jwk.PublicJsonWebKey newPublicJwk(java.security.Key key) throws org.jose4j.lang.JoseException {
            return (org.jose4j.jwk.PublicJsonWebKey) org.jose4j.jwk.JsonWebKey.Factory.newJwk(key);
        }

        public static org.jose4j.jwk.PublicJsonWebKey newPublicJwk(java.lang.String str) throws org.jose4j.lang.JoseException {
            return newPublicJwk(str, (java.lang.String) null);
        }

        public static org.jose4j.jwk.PublicJsonWebKey newPublicJwk(java.lang.String str, java.lang.String str2) throws org.jose4j.lang.JoseException {
            return newPublicJwk(org.jose4j.json.JsonUtil.parseJson(str), str2);
        }
    }
}
