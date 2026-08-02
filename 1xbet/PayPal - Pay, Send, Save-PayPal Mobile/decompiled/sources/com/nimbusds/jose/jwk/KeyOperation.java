package com.nimbusds.jose.jwk;

/* loaded from: classes4.dex */
public enum KeyOperation {
    SIGN("sign"),
    VERIFY("verify"),
    ENCRYPT("encrypt"),
    DECRYPT("decrypt"),
    WRAP_KEY("wrapKey"),
    UNWRAP_KEY("unwrapKey"),
    DERIVE_KEY("deriveKey"),
    DERIVE_BITS("deriveBits");

    private final java.lang.String identifier;

    KeyOperation(java.lang.String str) {
        if (str == null) {
            throw new java.lang.IllegalArgumentException("The key operation identifier must not be null");
        }
        this.identifier = str;
    }

    public final java.lang.String identifier() {
        return this.identifier;
    }

    @Override // java.lang.Enum
    public final java.lang.String toString() {
        return identifier();
    }

    public static java.util.Set<com.nimbusds.jose.jwk.KeyOperation> parse(java.util.List<java.lang.String> list) throws java.text.ParseException {
        com.nimbusds.jose.jwk.KeyOperation keyOperation;
        if (list == null) {
            return null;
        }
        java.util.LinkedHashSet linkedHashSet = new java.util.LinkedHashSet();
        for (java.lang.String str : list) {
            if (str != null) {
                com.nimbusds.jose.jwk.KeyOperation[] values = values();
                int length = values.length;
                int i = 0;
                while (true) {
                    if (i >= length) {
                        keyOperation = null;
                        break;
                    }
                    keyOperation = values[i];
                    if (str.equals(keyOperation.identifier())) {
                        break;
                    }
                    i++;
                }
                if (keyOperation != null) {
                    linkedHashSet.add(keyOperation);
                } else {
                    throw new java.text.ParseException("Invalid JWK operation: ".concat(java.lang.String.valueOf(str)), 0);
                }
            }
        }
        return linkedHashSet;
    }
}
