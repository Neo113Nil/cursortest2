package com.nimbusds.jose;

@net.jcip.annotations.Immutable
/* loaded from: classes4.dex */
public final class JWSAlgorithm extends com.nimbusds.jose.Algorithm {
    private static final long serialVersionUID = 1;
    public static final com.nimbusds.jose.JWSAlgorithm HS256 = new com.nimbusds.jose.JWSAlgorithm(org.jose4j.jws.AlgorithmIdentifiers.HMAC_SHA256, com.nimbusds.jose.Requirement.REQUIRED);
    public static final com.nimbusds.jose.JWSAlgorithm HS384 = new com.nimbusds.jose.JWSAlgorithm(org.jose4j.jws.AlgorithmIdentifiers.HMAC_SHA384, com.nimbusds.jose.Requirement.OPTIONAL);
    public static final com.nimbusds.jose.JWSAlgorithm HS512 = new com.nimbusds.jose.JWSAlgorithm(org.jose4j.jws.AlgorithmIdentifiers.HMAC_SHA512, com.nimbusds.jose.Requirement.OPTIONAL);
    public static final com.nimbusds.jose.JWSAlgorithm RS256 = new com.nimbusds.jose.JWSAlgorithm(org.jose4j.jws.AlgorithmIdentifiers.RSA_USING_SHA256, com.nimbusds.jose.Requirement.RECOMMENDED);
    public static final com.nimbusds.jose.JWSAlgorithm RS384 = new com.nimbusds.jose.JWSAlgorithm(org.jose4j.jws.AlgorithmIdentifiers.RSA_USING_SHA384, com.nimbusds.jose.Requirement.OPTIONAL);
    public static final com.nimbusds.jose.JWSAlgorithm RS512 = new com.nimbusds.jose.JWSAlgorithm(org.jose4j.jws.AlgorithmIdentifiers.RSA_USING_SHA512, com.nimbusds.jose.Requirement.OPTIONAL);
    public static final com.nimbusds.jose.JWSAlgorithm ES256 = new com.nimbusds.jose.JWSAlgorithm(org.jose4j.jws.AlgorithmIdentifiers.ECDSA_USING_P256_CURVE_AND_SHA256, com.nimbusds.jose.Requirement.RECOMMENDED);
    public static final com.nimbusds.jose.JWSAlgorithm ES256K = new com.nimbusds.jose.JWSAlgorithm(org.jose4j.jws.AlgorithmIdentifiers.ECDSA_USING_SECP256K1_CURVE_AND_SHA256, com.nimbusds.jose.Requirement.OPTIONAL);
    public static final com.nimbusds.jose.JWSAlgorithm ES384 = new com.nimbusds.jose.JWSAlgorithm(org.jose4j.jws.AlgorithmIdentifiers.ECDSA_USING_P384_CURVE_AND_SHA384, com.nimbusds.jose.Requirement.OPTIONAL);
    public static final com.nimbusds.jose.JWSAlgorithm ES512 = new com.nimbusds.jose.JWSAlgorithm(org.jose4j.jws.AlgorithmIdentifiers.ECDSA_USING_P521_CURVE_AND_SHA512, com.nimbusds.jose.Requirement.OPTIONAL);
    public static final com.nimbusds.jose.JWSAlgorithm PS256 = new com.nimbusds.jose.JWSAlgorithm(org.jose4j.jws.AlgorithmIdentifiers.RSA_PSS_USING_SHA256, com.nimbusds.jose.Requirement.OPTIONAL);
    public static final com.nimbusds.jose.JWSAlgorithm PS384 = new com.nimbusds.jose.JWSAlgorithm(org.jose4j.jws.AlgorithmIdentifiers.RSA_PSS_USING_SHA384, com.nimbusds.jose.Requirement.OPTIONAL);
    public static final com.nimbusds.jose.JWSAlgorithm PS512 = new com.nimbusds.jose.JWSAlgorithm(org.jose4j.jws.AlgorithmIdentifiers.RSA_PSS_USING_SHA512, com.nimbusds.jose.Requirement.OPTIONAL);
    public static final com.nimbusds.jose.JWSAlgorithm EdDSA = new com.nimbusds.jose.JWSAlgorithm(org.jose4j.jws.AlgorithmIdentifiers.EDDSA, com.nimbusds.jose.Requirement.OPTIONAL);

    /* loaded from: classes10.dex */
    public static final class Family extends com.nimbusds.jose.AlgorithmFamily<com.nimbusds.jose.JWSAlgorithm> {
        public static final com.nimbusds.jose.JWSAlgorithm.Family EC;
        public static final com.nimbusds.jose.JWSAlgorithm.Family ED;
        public static final com.nimbusds.jose.JWSAlgorithm.Family HMAC_SHA = new com.nimbusds.jose.JWSAlgorithm.Family(com.nimbusds.jose.JWSAlgorithm.HS256, com.nimbusds.jose.JWSAlgorithm.HS384, com.nimbusds.jose.JWSAlgorithm.HS512);
        public static final com.nimbusds.jose.JWSAlgorithm.Family RSA;
        public static final com.nimbusds.jose.JWSAlgorithm.Family SIGNATURE;
        private static final long serialVersionUID = 1;

        @Override // com.nimbusds.jose.AlgorithmFamily
        public final /* bridge */ /* synthetic */ boolean add(com.nimbusds.jose.JWSAlgorithm jWSAlgorithm) {
            return super.add((com.nimbusds.jose.JWSAlgorithm.Family) jWSAlgorithm);
        }

        @Override // com.nimbusds.jose.AlgorithmFamily, java.util.AbstractCollection, java.util.Collection, java.util.Set
        public final /* bridge */ /* synthetic */ boolean addAll(java.util.Collection collection) {
            return super.addAll(collection);
        }

        @Override // com.nimbusds.jose.AlgorithmFamily, java.util.HashSet, java.util.AbstractCollection, java.util.Collection, java.util.Set
        public final /* bridge */ /* synthetic */ boolean remove(java.lang.Object obj) {
            return super.remove(obj);
        }

        @Override // com.nimbusds.jose.AlgorithmFamily, java.util.AbstractSet, java.util.AbstractCollection, java.util.Collection, java.util.Set
        public final /* bridge */ /* synthetic */ boolean removeAll(java.util.Collection collection) {
            return super.removeAll(collection);
        }

        @Override // com.nimbusds.jose.AlgorithmFamily, java.util.AbstractCollection, java.util.Collection, java.util.Set
        public final /* bridge */ /* synthetic */ boolean retainAll(java.util.Collection collection) {
            return super.retainAll(collection);
        }

        static {
            com.nimbusds.jose.JWSAlgorithm.Family family = new com.nimbusds.jose.JWSAlgorithm.Family(com.nimbusds.jose.JWSAlgorithm.RS256, com.nimbusds.jose.JWSAlgorithm.RS384, com.nimbusds.jose.JWSAlgorithm.RS512, com.nimbusds.jose.JWSAlgorithm.PS256, com.nimbusds.jose.JWSAlgorithm.PS384, com.nimbusds.jose.JWSAlgorithm.PS512);
            RSA = family;
            com.nimbusds.jose.JWSAlgorithm.Family family2 = new com.nimbusds.jose.JWSAlgorithm.Family(com.nimbusds.jose.JWSAlgorithm.ES256, com.nimbusds.jose.JWSAlgorithm.ES256K, com.nimbusds.jose.JWSAlgorithm.ES384, com.nimbusds.jose.JWSAlgorithm.ES512);
            EC = family2;
            com.nimbusds.jose.JWSAlgorithm.Family family3 = new com.nimbusds.jose.JWSAlgorithm.Family(com.nimbusds.jose.JWSAlgorithm.EdDSA);
            ED = family3;
            SIGNATURE = new com.nimbusds.jose.JWSAlgorithm.Family((com.nimbusds.jose.JWSAlgorithm[]) com.nimbusds.jose.util.ArrayUtils.concat(family.toArray(new com.nimbusds.jose.JWSAlgorithm[0]), (com.nimbusds.jose.JWSAlgorithm[]) family2.toArray(new com.nimbusds.jose.JWSAlgorithm[0]), (com.nimbusds.jose.JWSAlgorithm[]) family3.toArray(new com.nimbusds.jose.JWSAlgorithm[0])));
        }

        public Family(com.nimbusds.jose.JWSAlgorithm... jWSAlgorithmArr) {
            super(jWSAlgorithmArr);
        }
    }

    public JWSAlgorithm(java.lang.String str, com.nimbusds.jose.Requirement requirement) {
        super(str, requirement);
    }

    public JWSAlgorithm(java.lang.String str) {
        super(str, null);
    }

    public static com.nimbusds.jose.JWSAlgorithm parse(java.lang.String str) {
        com.nimbusds.jose.JWSAlgorithm jWSAlgorithm = HS256;
        if (str.equals(jWSAlgorithm.getName())) {
            return jWSAlgorithm;
        }
        com.nimbusds.jose.JWSAlgorithm jWSAlgorithm2 = HS384;
        if (str.equals(jWSAlgorithm2.getName())) {
            return jWSAlgorithm2;
        }
        com.nimbusds.jose.JWSAlgorithm jWSAlgorithm3 = HS512;
        if (str.equals(jWSAlgorithm3.getName())) {
            return jWSAlgorithm3;
        }
        com.nimbusds.jose.JWSAlgorithm jWSAlgorithm4 = RS256;
        if (str.equals(jWSAlgorithm4.getName())) {
            return jWSAlgorithm4;
        }
        com.nimbusds.jose.JWSAlgorithm jWSAlgorithm5 = RS384;
        if (str.equals(jWSAlgorithm5.getName())) {
            return jWSAlgorithm5;
        }
        com.nimbusds.jose.JWSAlgorithm jWSAlgorithm6 = RS512;
        if (str.equals(jWSAlgorithm6.getName())) {
            return jWSAlgorithm6;
        }
        com.nimbusds.jose.JWSAlgorithm jWSAlgorithm7 = ES256;
        if (str.equals(jWSAlgorithm7.getName())) {
            return jWSAlgorithm7;
        }
        com.nimbusds.jose.JWSAlgorithm jWSAlgorithm8 = ES256K;
        if (str.equals(jWSAlgorithm8.getName())) {
            return jWSAlgorithm8;
        }
        com.nimbusds.jose.JWSAlgorithm jWSAlgorithm9 = ES384;
        if (str.equals(jWSAlgorithm9.getName())) {
            return jWSAlgorithm9;
        }
        com.nimbusds.jose.JWSAlgorithm jWSAlgorithm10 = ES512;
        if (str.equals(jWSAlgorithm10.getName())) {
            return jWSAlgorithm10;
        }
        com.nimbusds.jose.JWSAlgorithm jWSAlgorithm11 = PS256;
        if (str.equals(jWSAlgorithm11.getName())) {
            return jWSAlgorithm11;
        }
        com.nimbusds.jose.JWSAlgorithm jWSAlgorithm12 = PS384;
        if (str.equals(jWSAlgorithm12.getName())) {
            return jWSAlgorithm12;
        }
        com.nimbusds.jose.JWSAlgorithm jWSAlgorithm13 = PS512;
        if (str.equals(jWSAlgorithm13.getName())) {
            return jWSAlgorithm13;
        }
        com.nimbusds.jose.JWSAlgorithm jWSAlgorithm14 = EdDSA;
        return str.equals(jWSAlgorithm14.getName()) ? jWSAlgorithm14 : new com.nimbusds.jose.JWSAlgorithm(str);
    }
}
