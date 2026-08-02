package org.jose4j.jwk;

/* loaded from: classes18.dex */
public class OctetKeyPairJsonWebKey extends org.jose4j.jwk.PublicJsonWebKey {
    static final java.util.Set<java.lang.String> Camera2StreamConfigurationMap = new java.util.HashSet(java.util.Arrays.asList("Ed448", "Ed25519", org.jose4j.jws.AlgorithmIdentifiers.EDDSA, "X25519", "X448", "XDH"));
    public static final java.lang.String KEY_TYPE = "OKP";
    public static final java.lang.String PRIVATE_KEY_MEMBER_NAME = "d";
    public static final java.lang.String PUBLIC_KEY_MEMBER_NAME = "x";
    public static final java.lang.String SUBTYPE_ED25519 = "Ed25519";
    public static final java.lang.String SUBTYPE_ED448 = "Ed448";
    public static final java.lang.String SUBTYPE_MEMBER_NAME = "crv";
    public static final java.lang.String SUBTYPE_X25519 = "X25519";
    public static final java.lang.String SUBTYPE_X448 = "X448";
    private final java.lang.String getHighResolutionOutputSizeshNQ4ISI;

    public OctetKeyPairJsonWebKey(java.security.PublicKey publicKey) {
        super(publicKey);
        if (org.jose4j.keys.XDHKeyUtil.isXECPublicKey(publicKey)) {
            this.getHighResolutionOutputSizeshNQ4ISI = ((java.security.spec.NamedParameterSpec) ((java.security.interfaces.XECKey) publicKey).getParams()).getName();
        } else {
            if (org.jose4j.keys.EdDsaKeyUtil.isEdECPublicKey(publicKey)) {
                this.getHighResolutionOutputSizeshNQ4ISI = ((java.security.interfaces.EdECKey) publicKey).getParams().getName();
                return;
            }
            throw new org.jose4j.lang.UncheckedJoseException("Unable to determine OKP subtype from ".concat(java.lang.String.valueOf(publicKey)));
        }
    }

    public OctetKeyPairJsonWebKey(java.util.Map<java.lang.String, java.lang.Object> map) throws org.jose4j.lang.JoseException {
        this(map, null);
    }

    public OctetKeyPairJsonWebKey(java.util.Map<java.lang.String, java.lang.Object> map, java.lang.String str) throws org.jose4j.lang.JoseException {
        super(map, str);
        java.lang.String string = getString(map, "crv", true);
        this.getHighResolutionOutputSizeshNQ4ISI = string;
        try {
            org.jose4j.keys.OctetKeyPairUtil octetKeyPairUtil = org.jose4j.keys.OctetKeyPairUtil.getOctetKeyPairUtil(string, this.jcaProvider, null);
            if (octetKeyPairUtil == null) {
                java.lang.StringBuilder sb = new java.lang.StringBuilder("\"");
                sb.append(string);
                sb.append("\" is an unknown or unsupported subtype value for the \"crv\" parameter.");
                throw new org.jose4j.lang.InvalidKeyException(sb.toString());
            }
            this.key = octetKeyPairUtil.publicKey(org.jose4j.base64url.Base64Url.decode(getString(map, "x", true)), string);
            Camera2StreamConfigurationMap();
            if (map.containsKey("d")) {
                this.privateKey = octetKeyPairUtil.privateKey(org.jose4j.base64url.Base64Url.decode(getString(map, "d", false)), string);
            }
            removeFromOtherParams("crv", "x", "d");
        } catch (java.lang.NoClassDefFoundError e) {
            java.lang.StringBuilder sb2 = new java.lang.StringBuilder("Unable to instantiate key for OKP JWK with ");
            sb2.append(this.getHighResolutionOutputSizeshNQ4ISI);
            sb2.append(". ");
            sb2.append(org.jose4j.lang.ExceptionHelp.toStringWithCauses(e));
            throw new org.jose4j.lang.JoseException(sb2.toString());
        }
    }

    static boolean getHighSpeedVideoSizes(java.security.Key key) {
        return Camera2StreamConfigurationMap.contains(key.getAlgorithm());
    }

    @Override // org.jose4j.jwk.JsonWebKey
    public java.lang.String getKeyType() {
        return KEY_TYPE;
    }

    public java.lang.String getSubtype() {
        return this.getHighResolutionOutputSizeshNQ4ISI;
    }

    @Override // org.jose4j.jwk.JsonWebKey
    protected java.lang.String produceThumbprintHashInput() {
        java.util.HashMap hashMap = new java.util.HashMap();
        fillPublicTypeSpecificParams(hashMap);
        return java.lang.String.format("{\"crv\":\"%s\",\"kty\":\"OKP\",\"x\":\"%s\"}", hashMap.get("crv"), hashMap.get("x"));
    }

    @Override // org.jose4j.jwk.PublicJsonWebKey
    protected void fillPrivateTypeSpecificParams(java.util.Map<java.lang.String, java.lang.Object> map) {
        if (this.privateKey != null) {
            map.put("d", org.jose4j.base64url.Base64Url.encode(org.jose4j.keys.OctetKeyPairUtil.getOctetKeyPairUtil(this.getHighResolutionOutputSizeshNQ4ISI, this.jcaProvider, null).rawPrivateKey(this.privateKey)));
        }
    }

    @Override // org.jose4j.jwk.PublicJsonWebKey
    protected void fillPublicTypeSpecificParams(java.util.Map<java.lang.String, java.lang.Object> map) {
        byte[] rawPublicKey = org.jose4j.keys.OctetKeyPairUtil.getOctetKeyPairUtil(this.getHighResolutionOutputSizeshNQ4ISI, this.jcaProvider, null).rawPublicKey(this.key);
        map.put("crv", this.getHighResolutionOutputSizeshNQ4ISI);
        map.put("x", org.jose4j.base64url.Base64Url.encode(rawPublicKey));
    }
}
