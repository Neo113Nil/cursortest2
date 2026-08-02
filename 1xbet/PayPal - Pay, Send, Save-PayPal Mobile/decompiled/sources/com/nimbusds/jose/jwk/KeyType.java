package com.nimbusds.jose.jwk;

@net.jcip.annotations.Immutable
/* loaded from: classes4.dex */
public final class KeyType implements java.io.Serializable {
    private static final long serialVersionUID = 1;
    private final com.nimbusds.jose.Requirement requirement;
    private final java.lang.String value;
    public static final com.nimbusds.jose.jwk.KeyType EC = new com.nimbusds.jose.jwk.KeyType("EC", com.nimbusds.jose.Requirement.RECOMMENDED);
    public static final com.nimbusds.jose.jwk.KeyType RSA = new com.nimbusds.jose.jwk.KeyType("RSA", com.nimbusds.jose.Requirement.REQUIRED);
    public static final com.nimbusds.jose.jwk.KeyType OCT = new com.nimbusds.jose.jwk.KeyType(org.jose4j.jwk.OctetSequenceJsonWebKey.KEY_TYPE, com.nimbusds.jose.Requirement.OPTIONAL);
    public static final com.nimbusds.jose.jwk.KeyType OKP = new com.nimbusds.jose.jwk.KeyType(org.jose4j.jwk.OctetKeyPairJsonWebKey.KEY_TYPE, com.nimbusds.jose.Requirement.OPTIONAL);

    public KeyType(java.lang.String str, com.nimbusds.jose.Requirement requirement) {
        if (str == null) {
            throw new java.lang.IllegalArgumentException("The key type value must not be null");
        }
        this.value = str;
        this.requirement = requirement;
    }

    public final java.lang.String getValue() {
        return this.value;
    }

    public final com.nimbusds.jose.Requirement getRequirement() {
        return this.requirement;
    }

    public final int hashCode() {
        return this.value.hashCode();
    }

    public final boolean equals(java.lang.Object obj) {
        return (obj instanceof com.nimbusds.jose.jwk.KeyType) && toString().equals(obj.toString());
    }

    public final java.lang.String toString() {
        return this.value;
    }

    public final java.lang.String toJSONString() {
        return com.nimbusds.jose.util.JSONStringUtils.toJSONString(this.value);
    }

    public static com.nimbusds.jose.jwk.KeyType parse(java.lang.String str) {
        if (str == null) {
            throw new java.lang.IllegalArgumentException("The key type to parse must not be null");
        }
        com.nimbusds.jose.jwk.KeyType keyType = EC;
        if (str.equals(keyType.getValue())) {
            return keyType;
        }
        com.nimbusds.jose.jwk.KeyType keyType2 = RSA;
        if (str.equals(keyType2.getValue())) {
            return keyType2;
        }
        com.nimbusds.jose.jwk.KeyType keyType3 = OCT;
        if (str.equals(keyType3.getValue())) {
            return keyType3;
        }
        com.nimbusds.jose.jwk.KeyType keyType4 = OKP;
        return str.equals(keyType4.getValue()) ? keyType4 : new com.nimbusds.jose.jwk.KeyType(str, null);
    }

    public static com.nimbusds.jose.jwk.KeyType forAlgorithm(com.nimbusds.jose.Algorithm algorithm) {
        if (algorithm == null) {
            return null;
        }
        if (com.nimbusds.jose.JWSAlgorithm.Family.RSA.contains(algorithm)) {
            return RSA;
        }
        if (com.nimbusds.jose.JWSAlgorithm.Family.EC.contains(algorithm)) {
            return EC;
        }
        if (com.nimbusds.jose.JWSAlgorithm.Family.HMAC_SHA.contains(algorithm)) {
            return OCT;
        }
        if (com.nimbusds.jose.JWEAlgorithm.Family.RSA.contains(algorithm)) {
            return RSA;
        }
        if (com.nimbusds.jose.JWEAlgorithm.Family.ECDH_ES.contains(algorithm)) {
            return EC;
        }
        if (com.nimbusds.jose.JWEAlgorithm.DIR.equals(algorithm)) {
            return OCT;
        }
        if (com.nimbusds.jose.JWEAlgorithm.Family.AES_GCM_KW.contains(algorithm)) {
            return OCT;
        }
        if (com.nimbusds.jose.JWEAlgorithm.Family.AES_KW.contains(algorithm)) {
            return OCT;
        }
        if (com.nimbusds.jose.JWEAlgorithm.Family.PBES2.contains(algorithm)) {
            return OCT;
        }
        if (com.nimbusds.jose.JWSAlgorithm.Family.ED.contains(algorithm)) {
            return OKP;
        }
        return null;
    }
}
