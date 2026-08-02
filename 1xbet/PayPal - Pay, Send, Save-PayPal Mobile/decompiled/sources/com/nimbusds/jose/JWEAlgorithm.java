package com.nimbusds.jose;

@net.jcip.annotations.Immutable
/* loaded from: classes4.dex */
public final class JWEAlgorithm extends com.nimbusds.jose.Algorithm {
    private static final long serialVersionUID = 1;

    @java.lang.Deprecated
    public static final com.nimbusds.jose.JWEAlgorithm RSA1_5 = new com.nimbusds.jose.JWEAlgorithm(org.jose4j.jwe.KeyManagementAlgorithmIdentifiers.RSA1_5, com.nimbusds.jose.Requirement.REQUIRED);

    @java.lang.Deprecated
    public static final com.nimbusds.jose.JWEAlgorithm RSA_OAEP = new com.nimbusds.jose.JWEAlgorithm(org.jose4j.jwe.KeyManagementAlgorithmIdentifiers.RSA_OAEP, com.nimbusds.jose.Requirement.OPTIONAL);
    public static final com.nimbusds.jose.JWEAlgorithm RSA_OAEP_256 = new com.nimbusds.jose.JWEAlgorithm(org.jose4j.jwe.KeyManagementAlgorithmIdentifiers.RSA_OAEP_256, com.nimbusds.jose.Requirement.OPTIONAL);
    public static final com.nimbusds.jose.JWEAlgorithm RSA_OAEP_384 = new com.nimbusds.jose.JWEAlgorithm("RSA-OAEP-384", com.nimbusds.jose.Requirement.OPTIONAL);
    public static final com.nimbusds.jose.JWEAlgorithm RSA_OAEP_512 = new com.nimbusds.jose.JWEAlgorithm("RSA-OAEP-512", com.nimbusds.jose.Requirement.OPTIONAL);
    public static final com.nimbusds.jose.JWEAlgorithm A128KW = new com.nimbusds.jose.JWEAlgorithm(org.jose4j.jwe.KeyManagementAlgorithmIdentifiers.A128KW, com.nimbusds.jose.Requirement.RECOMMENDED);
    public static final com.nimbusds.jose.JWEAlgorithm A192KW = new com.nimbusds.jose.JWEAlgorithm(org.jose4j.jwe.KeyManagementAlgorithmIdentifiers.A192KW, com.nimbusds.jose.Requirement.OPTIONAL);
    public static final com.nimbusds.jose.JWEAlgorithm A256KW = new com.nimbusds.jose.JWEAlgorithm(org.jose4j.jwe.KeyManagementAlgorithmIdentifiers.A256KW, com.nimbusds.jose.Requirement.RECOMMENDED);
    public static final com.nimbusds.jose.JWEAlgorithm DIR = new com.nimbusds.jose.JWEAlgorithm(org.jose4j.jwe.KeyManagementAlgorithmIdentifiers.DIRECT, com.nimbusds.jose.Requirement.RECOMMENDED);
    public static final com.nimbusds.jose.JWEAlgorithm ECDH_ES = new com.nimbusds.jose.JWEAlgorithm(org.jose4j.jwe.KeyManagementAlgorithmIdentifiers.ECDH_ES, com.nimbusds.jose.Requirement.RECOMMENDED);
    public static final com.nimbusds.jose.JWEAlgorithm ECDH_ES_A128KW = new com.nimbusds.jose.JWEAlgorithm(org.jose4j.jwe.KeyManagementAlgorithmIdentifiers.ECDH_ES_A128KW, com.nimbusds.jose.Requirement.RECOMMENDED);
    public static final com.nimbusds.jose.JWEAlgorithm ECDH_ES_A192KW = new com.nimbusds.jose.JWEAlgorithm(org.jose4j.jwe.KeyManagementAlgorithmIdentifiers.ECDH_ES_A192KW, com.nimbusds.jose.Requirement.OPTIONAL);
    public static final com.nimbusds.jose.JWEAlgorithm ECDH_ES_A256KW = new com.nimbusds.jose.JWEAlgorithm(org.jose4j.jwe.KeyManagementAlgorithmIdentifiers.ECDH_ES_A256KW, com.nimbusds.jose.Requirement.RECOMMENDED);
    public static final com.nimbusds.jose.JWEAlgorithm ECDH_1PU = new com.nimbusds.jose.JWEAlgorithm("ECDH-1PU", com.nimbusds.jose.Requirement.OPTIONAL);
    public static final com.nimbusds.jose.JWEAlgorithm ECDH_1PU_A128KW = new com.nimbusds.jose.JWEAlgorithm("ECDH-1PU+A128KW", com.nimbusds.jose.Requirement.OPTIONAL);
    public static final com.nimbusds.jose.JWEAlgorithm ECDH_1PU_A192KW = new com.nimbusds.jose.JWEAlgorithm("ECDH-1PU+A192KW", com.nimbusds.jose.Requirement.OPTIONAL);
    public static final com.nimbusds.jose.JWEAlgorithm ECDH_1PU_A256KW = new com.nimbusds.jose.JWEAlgorithm("ECDH-1PU+A256KW", com.nimbusds.jose.Requirement.OPTIONAL);
    public static final com.nimbusds.jose.JWEAlgorithm A128GCMKW = new com.nimbusds.jose.JWEAlgorithm(org.jose4j.jwe.KeyManagementAlgorithmIdentifiers.A128GCMKW, com.nimbusds.jose.Requirement.OPTIONAL);
    public static final com.nimbusds.jose.JWEAlgorithm A192GCMKW = new com.nimbusds.jose.JWEAlgorithm(org.jose4j.jwe.KeyManagementAlgorithmIdentifiers.A192GCMKW, com.nimbusds.jose.Requirement.OPTIONAL);
    public static final com.nimbusds.jose.JWEAlgorithm A256GCMKW = new com.nimbusds.jose.JWEAlgorithm(org.jose4j.jwe.KeyManagementAlgorithmIdentifiers.A256GCMKW, com.nimbusds.jose.Requirement.OPTIONAL);
    public static final com.nimbusds.jose.JWEAlgorithm PBES2_HS256_A128KW = new com.nimbusds.jose.JWEAlgorithm(org.jose4j.jwe.KeyManagementAlgorithmIdentifiers.PBES2_HS256_A128KW, com.nimbusds.jose.Requirement.OPTIONAL);
    public static final com.nimbusds.jose.JWEAlgorithm PBES2_HS384_A192KW = new com.nimbusds.jose.JWEAlgorithm(org.jose4j.jwe.KeyManagementAlgorithmIdentifiers.PBES2_HS384_A192KW, com.nimbusds.jose.Requirement.OPTIONAL);
    public static final com.nimbusds.jose.JWEAlgorithm PBES2_HS512_A256KW = new com.nimbusds.jose.JWEAlgorithm(org.jose4j.jwe.KeyManagementAlgorithmIdentifiers.PBES2_HS512_A256KW, com.nimbusds.jose.Requirement.OPTIONAL);

    /* loaded from: classes10.dex */
    public static final class Family extends com.nimbusds.jose.AlgorithmFamily<com.nimbusds.jose.JWEAlgorithm> {
        public static final com.nimbusds.jose.JWEAlgorithm.Family AES_GCM_KW;
        public static final com.nimbusds.jose.JWEAlgorithm.Family AES_KW;
        public static final com.nimbusds.jose.JWEAlgorithm.Family ASYMMETRIC;
        public static final com.nimbusds.jose.JWEAlgorithm.Family ECDH_1PU;
        public static final com.nimbusds.jose.JWEAlgorithm.Family ECDH_ES;
        public static final com.nimbusds.jose.JWEAlgorithm.Family PBES2;
        public static final com.nimbusds.jose.JWEAlgorithm.Family RSA;
        public static final com.nimbusds.jose.JWEAlgorithm.Family SYMMETRIC;
        private static final long serialVersionUID = 1;

        @Override // com.nimbusds.jose.AlgorithmFamily
        public final /* bridge */ /* synthetic */ boolean add(com.nimbusds.jose.JWEAlgorithm jWEAlgorithm) {
            return super.add((com.nimbusds.jose.JWEAlgorithm.Family) jWEAlgorithm);
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
            com.nimbusds.jose.JWEAlgorithm.Family family = new com.nimbusds.jose.JWEAlgorithm.Family(com.nimbusds.jose.JWEAlgorithm.RSA1_5, com.nimbusds.jose.JWEAlgorithm.RSA_OAEP, com.nimbusds.jose.JWEAlgorithm.RSA_OAEP_256, com.nimbusds.jose.JWEAlgorithm.RSA_OAEP_384, com.nimbusds.jose.JWEAlgorithm.RSA_OAEP_512);
            RSA = family;
            com.nimbusds.jose.JWEAlgorithm.Family family2 = new com.nimbusds.jose.JWEAlgorithm.Family(com.nimbusds.jose.JWEAlgorithm.A128KW, com.nimbusds.jose.JWEAlgorithm.A192KW, com.nimbusds.jose.JWEAlgorithm.A256KW);
            AES_KW = family2;
            com.nimbusds.jose.JWEAlgorithm.Family family3 = new com.nimbusds.jose.JWEAlgorithm.Family(com.nimbusds.jose.JWEAlgorithm.ECDH_ES, com.nimbusds.jose.JWEAlgorithm.ECDH_ES_A128KW, com.nimbusds.jose.JWEAlgorithm.ECDH_ES_A192KW, com.nimbusds.jose.JWEAlgorithm.ECDH_ES_A256KW);
            ECDH_ES = family3;
            ECDH_1PU = new com.nimbusds.jose.JWEAlgorithm.Family(com.nimbusds.jose.JWEAlgorithm.ECDH_1PU, com.nimbusds.jose.JWEAlgorithm.ECDH_1PU_A128KW, com.nimbusds.jose.JWEAlgorithm.ECDH_1PU_A192KW, com.nimbusds.jose.JWEAlgorithm.ECDH_1PU_A256KW);
            com.nimbusds.jose.JWEAlgorithm.Family family4 = new com.nimbusds.jose.JWEAlgorithm.Family(com.nimbusds.jose.JWEAlgorithm.A128GCMKW, com.nimbusds.jose.JWEAlgorithm.A192GCMKW, com.nimbusds.jose.JWEAlgorithm.A256GCMKW);
            AES_GCM_KW = family4;
            PBES2 = new com.nimbusds.jose.JWEAlgorithm.Family(com.nimbusds.jose.JWEAlgorithm.PBES2_HS256_A128KW, com.nimbusds.jose.JWEAlgorithm.PBES2_HS384_A192KW, com.nimbusds.jose.JWEAlgorithm.PBES2_HS512_A256KW);
            ASYMMETRIC = new com.nimbusds.jose.JWEAlgorithm.Family((com.nimbusds.jose.JWEAlgorithm[]) com.nimbusds.jose.util.ArrayUtils.concat(family.toArray(new com.nimbusds.jose.JWEAlgorithm[0]), (com.nimbusds.jose.JWEAlgorithm[]) family3.toArray(new com.nimbusds.jose.JWEAlgorithm[0])));
            SYMMETRIC = new com.nimbusds.jose.JWEAlgorithm.Family((com.nimbusds.jose.JWEAlgorithm[]) com.nimbusds.jose.util.ArrayUtils.concat(family2.toArray(new com.nimbusds.jose.JWEAlgorithm[0]), (com.nimbusds.jose.JWEAlgorithm[]) family4.toArray(new com.nimbusds.jose.JWEAlgorithm[0]), new com.nimbusds.jose.JWEAlgorithm[]{com.nimbusds.jose.JWEAlgorithm.DIR}));
        }

        public Family(com.nimbusds.jose.JWEAlgorithm... jWEAlgorithmArr) {
            super(jWEAlgorithmArr);
        }
    }

    public JWEAlgorithm(java.lang.String str, com.nimbusds.jose.Requirement requirement) {
        super(str, requirement);
    }

    public JWEAlgorithm(java.lang.String str) {
        super(str, null);
    }

    public static com.nimbusds.jose.JWEAlgorithm parse(java.lang.String str) {
        com.nimbusds.jose.JWEAlgorithm jWEAlgorithm = RSA1_5;
        if (str.equals(jWEAlgorithm.getName())) {
            return jWEAlgorithm;
        }
        com.nimbusds.jose.JWEAlgorithm jWEAlgorithm2 = RSA_OAEP;
        if (str.equals(jWEAlgorithm2.getName())) {
            return jWEAlgorithm2;
        }
        com.nimbusds.jose.JWEAlgorithm jWEAlgorithm3 = RSA_OAEP_256;
        if (str.equals(jWEAlgorithm3.getName())) {
            return jWEAlgorithm3;
        }
        com.nimbusds.jose.JWEAlgorithm jWEAlgorithm4 = RSA_OAEP_384;
        if (str.equals(jWEAlgorithm4.getName())) {
            return jWEAlgorithm4;
        }
        com.nimbusds.jose.JWEAlgorithm jWEAlgorithm5 = RSA_OAEP_512;
        if (str.equals(jWEAlgorithm5.getName())) {
            return jWEAlgorithm5;
        }
        com.nimbusds.jose.JWEAlgorithm jWEAlgorithm6 = A128KW;
        if (str.equals(jWEAlgorithm6.getName())) {
            return jWEAlgorithm6;
        }
        com.nimbusds.jose.JWEAlgorithm jWEAlgorithm7 = A192KW;
        if (str.equals(jWEAlgorithm7.getName())) {
            return jWEAlgorithm7;
        }
        com.nimbusds.jose.JWEAlgorithm jWEAlgorithm8 = A256KW;
        if (str.equals(jWEAlgorithm8.getName())) {
            return jWEAlgorithm8;
        }
        com.nimbusds.jose.JWEAlgorithm jWEAlgorithm9 = DIR;
        if (str.equals(jWEAlgorithm9.getName())) {
            return jWEAlgorithm9;
        }
        com.nimbusds.jose.JWEAlgorithm jWEAlgorithm10 = ECDH_ES;
        if (str.equals(jWEAlgorithm10.getName())) {
            return jWEAlgorithm10;
        }
        com.nimbusds.jose.JWEAlgorithm jWEAlgorithm11 = ECDH_ES_A128KW;
        if (str.equals(jWEAlgorithm11.getName())) {
            return jWEAlgorithm11;
        }
        com.nimbusds.jose.JWEAlgorithm jWEAlgorithm12 = ECDH_ES_A192KW;
        if (str.equals(jWEAlgorithm12.getName())) {
            return jWEAlgorithm12;
        }
        com.nimbusds.jose.JWEAlgorithm jWEAlgorithm13 = ECDH_ES_A256KW;
        if (str.equals(jWEAlgorithm13.getName())) {
            return jWEAlgorithm13;
        }
        com.nimbusds.jose.JWEAlgorithm jWEAlgorithm14 = ECDH_1PU;
        if (str.equals(jWEAlgorithm14.getName())) {
            return jWEAlgorithm14;
        }
        com.nimbusds.jose.JWEAlgorithm jWEAlgorithm15 = ECDH_1PU_A128KW;
        if (str.equals(jWEAlgorithm15.getName())) {
            return jWEAlgorithm15;
        }
        com.nimbusds.jose.JWEAlgorithm jWEAlgorithm16 = ECDH_1PU_A192KW;
        if (str.equals(jWEAlgorithm16.getName())) {
            return jWEAlgorithm16;
        }
        com.nimbusds.jose.JWEAlgorithm jWEAlgorithm17 = ECDH_1PU_A256KW;
        if (str.equals(jWEAlgorithm17.getName())) {
            return jWEAlgorithm17;
        }
        com.nimbusds.jose.JWEAlgorithm jWEAlgorithm18 = A128GCMKW;
        if (str.equals(jWEAlgorithm18.getName())) {
            return jWEAlgorithm18;
        }
        com.nimbusds.jose.JWEAlgorithm jWEAlgorithm19 = A192GCMKW;
        if (str.equals(jWEAlgorithm19.getName())) {
            return jWEAlgorithm19;
        }
        com.nimbusds.jose.JWEAlgorithm jWEAlgorithm20 = A256GCMKW;
        if (str.equals(jWEAlgorithm20.getName())) {
            return jWEAlgorithm20;
        }
        com.nimbusds.jose.JWEAlgorithm jWEAlgorithm21 = PBES2_HS256_A128KW;
        if (str.equals(jWEAlgorithm21.getName())) {
            return jWEAlgorithm21;
        }
        com.nimbusds.jose.JWEAlgorithm jWEAlgorithm22 = PBES2_HS384_A192KW;
        if (str.equals(jWEAlgorithm22.getName())) {
            return jWEAlgorithm22;
        }
        com.nimbusds.jose.JWEAlgorithm jWEAlgorithm23 = PBES2_HS512_A256KW;
        return str.equals(jWEAlgorithm23.getName()) ? jWEAlgorithm23 : new com.nimbusds.jose.JWEAlgorithm(str);
    }
}
