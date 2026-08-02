package com.nimbusds.jose.jwk;

/* loaded from: classes4.dex */
class KeyUseAndOpsConsistency {
    static final java.util.Map<com.nimbusds.jose.jwk.KeyUse, java.util.Set<com.nimbusds.jose.jwk.KeyOperation>> MAP;

    KeyUseAndOpsConsistency() {
    }

    static {
        java.util.HashMap hashMap = new java.util.HashMap();
        hashMap.put(com.nimbusds.jose.jwk.KeyUse.SIGNATURE, new java.util.HashSet(java.util.Arrays.asList(com.nimbusds.jose.jwk.KeyOperation.SIGN, com.nimbusds.jose.jwk.KeyOperation.VERIFY)));
        hashMap.put(com.nimbusds.jose.jwk.KeyUse.ENCRYPTION, new java.util.HashSet(java.util.Arrays.asList(com.nimbusds.jose.jwk.KeyOperation.ENCRYPT, com.nimbusds.jose.jwk.KeyOperation.DECRYPT, com.nimbusds.jose.jwk.KeyOperation.WRAP_KEY, com.nimbusds.jose.jwk.KeyOperation.UNWRAP_KEY)));
        MAP = java.util.Collections.unmodifiableMap(hashMap);
    }

    static boolean areConsistent(com.nimbusds.jose.jwk.KeyUse keyUse, java.util.Set<com.nimbusds.jose.jwk.KeyOperation> set) {
        if (keyUse == null || set == null) {
            return true;
        }
        java.util.Map<com.nimbusds.jose.jwk.KeyUse, java.util.Set<com.nimbusds.jose.jwk.KeyOperation>> map = MAP;
        return !map.containsKey(keyUse) || map.get(keyUse).containsAll(set);
    }
}
