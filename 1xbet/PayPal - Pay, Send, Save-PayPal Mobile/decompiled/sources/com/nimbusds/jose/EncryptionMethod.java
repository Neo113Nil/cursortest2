package com.nimbusds.jose;

@net.jcip.annotations.Immutable
/* loaded from: classes10.dex */
public final class EncryptionMethod extends com.nimbusds.jose.Algorithm {
    private static final long serialVersionUID = 1;
    private final int cekBitLength;
    public static final com.nimbusds.jose.EncryptionMethod A128CBC_HS256 = new com.nimbusds.jose.EncryptionMethod(org.jose4j.jwe.ContentEncryptionAlgorithmIdentifiers.AES_128_CBC_HMAC_SHA_256, com.nimbusds.jose.Requirement.REQUIRED, 256);
    public static final com.nimbusds.jose.EncryptionMethod A192CBC_HS384 = new com.nimbusds.jose.EncryptionMethod(org.jose4j.jwe.ContentEncryptionAlgorithmIdentifiers.AES_192_CBC_HMAC_SHA_384, com.nimbusds.jose.Requirement.OPTIONAL, 384);
    public static final com.nimbusds.jose.EncryptionMethod A256CBC_HS512 = new com.nimbusds.jose.EncryptionMethod(org.jose4j.jwe.ContentEncryptionAlgorithmIdentifiers.AES_256_CBC_HMAC_SHA_512, com.nimbusds.jose.Requirement.REQUIRED, 512);
    public static final com.nimbusds.jose.EncryptionMethod A128CBC_HS256_DEPRECATED = new com.nimbusds.jose.EncryptionMethod("A128CBC+HS256", com.nimbusds.jose.Requirement.OPTIONAL, 256);
    public static final com.nimbusds.jose.EncryptionMethod A256CBC_HS512_DEPRECATED = new com.nimbusds.jose.EncryptionMethod("A256CBC+HS512", com.nimbusds.jose.Requirement.OPTIONAL, 512);
    public static final com.nimbusds.jose.EncryptionMethod A128GCM = new com.nimbusds.jose.EncryptionMethod(org.jose4j.jwe.ContentEncryptionAlgorithmIdentifiers.AES_128_GCM, com.nimbusds.jose.Requirement.RECOMMENDED, 128);
    public static final com.nimbusds.jose.EncryptionMethod A192GCM = new com.nimbusds.jose.EncryptionMethod(org.jose4j.jwe.ContentEncryptionAlgorithmIdentifiers.AES_192_GCM, com.nimbusds.jose.Requirement.OPTIONAL, 192);
    public static final com.nimbusds.jose.EncryptionMethod A256GCM = new com.nimbusds.jose.EncryptionMethod(org.jose4j.jwe.ContentEncryptionAlgorithmIdentifiers.AES_256_GCM, com.nimbusds.jose.Requirement.RECOMMENDED, 256);
    public static final com.nimbusds.jose.EncryptionMethod XC20P = new com.nimbusds.jose.EncryptionMethod("XC20P", com.nimbusds.jose.Requirement.OPTIONAL, 256);

    public static final class Family extends com.nimbusds.jose.AlgorithmFamily<com.nimbusds.jose.EncryptionMethod> {
        public static final com.nimbusds.jose.EncryptionMethod.Family AES_CBC_HMAC_SHA = new com.nimbusds.jose.EncryptionMethod.Family(com.nimbusds.jose.EncryptionMethod.A128CBC_HS256, com.nimbusds.jose.EncryptionMethod.A192CBC_HS384, com.nimbusds.jose.EncryptionMethod.A256CBC_HS512);
        public static final com.nimbusds.jose.EncryptionMethod.Family AES_GCM = new com.nimbusds.jose.EncryptionMethod.Family(com.nimbusds.jose.EncryptionMethod.A128GCM, com.nimbusds.jose.EncryptionMethod.A192GCM, com.nimbusds.jose.EncryptionMethod.A256GCM);
        private static final long serialVersionUID = 1;

        @Override // com.nimbusds.jose.AlgorithmFamily
        public final /* bridge */ /* synthetic */ boolean add(com.nimbusds.jose.EncryptionMethod encryptionMethod) {
            return super.add((com.nimbusds.jose.EncryptionMethod.Family) encryptionMethod);
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

        public Family(com.nimbusds.jose.EncryptionMethod... encryptionMethodArr) {
            super(encryptionMethodArr);
        }
    }

    public EncryptionMethod(java.lang.String str, com.nimbusds.jose.Requirement requirement, int i) {
        super(str, requirement);
        this.cekBitLength = i;
    }

    public EncryptionMethod(java.lang.String str, com.nimbusds.jose.Requirement requirement) {
        this(str, requirement, 0);
    }

    public EncryptionMethod(java.lang.String str) {
        this(str, null, 0);
    }

    public final int cekBitLength() {
        return this.cekBitLength;
    }

    public static com.nimbusds.jose.EncryptionMethod parse(java.lang.String str) {
        com.nimbusds.jose.EncryptionMethod encryptionMethod = A128CBC_HS256;
        if (str.equals(encryptionMethod.getName())) {
            return encryptionMethod;
        }
        com.nimbusds.jose.EncryptionMethod encryptionMethod2 = A192CBC_HS384;
        if (str.equals(encryptionMethod2.getName())) {
            return encryptionMethod2;
        }
        com.nimbusds.jose.EncryptionMethod encryptionMethod3 = A256CBC_HS512;
        if (str.equals(encryptionMethod3.getName())) {
            return encryptionMethod3;
        }
        com.nimbusds.jose.EncryptionMethod encryptionMethod4 = A128GCM;
        if (str.equals(encryptionMethod4.getName())) {
            return encryptionMethod4;
        }
        com.nimbusds.jose.EncryptionMethod encryptionMethod5 = A192GCM;
        if (str.equals(encryptionMethod5.getName())) {
            return encryptionMethod5;
        }
        com.nimbusds.jose.EncryptionMethod encryptionMethod6 = A256GCM;
        if (str.equals(encryptionMethod6.getName())) {
            return encryptionMethod6;
        }
        com.nimbusds.jose.EncryptionMethod encryptionMethod7 = A128CBC_HS256_DEPRECATED;
        if (str.equals(encryptionMethod7.getName())) {
            return encryptionMethod7;
        }
        com.nimbusds.jose.EncryptionMethod encryptionMethod8 = A256CBC_HS512_DEPRECATED;
        if (str.equals(encryptionMethod8.getName())) {
            return encryptionMethod8;
        }
        com.nimbusds.jose.EncryptionMethod encryptionMethod9 = XC20P;
        return str.equals(encryptionMethod9.getName()) ? encryptionMethod9 : new com.nimbusds.jose.EncryptionMethod(str);
    }
}
