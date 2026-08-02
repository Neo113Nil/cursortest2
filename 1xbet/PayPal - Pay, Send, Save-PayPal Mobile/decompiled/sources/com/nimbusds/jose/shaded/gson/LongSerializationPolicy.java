package com.nimbusds.jose.shaded.gson;

/* loaded from: classes4.dex */
public enum LongSerializationPolicy {
    DEFAULT { // from class: com.nimbusds.jose.shaded.gson.LongSerializationPolicy.1
        @Override // com.nimbusds.jose.shaded.gson.LongSerializationPolicy
        public final com.nimbusds.jose.shaded.gson.JsonElement serialize(java.lang.Long l) {
            if (l == null) {
                return com.nimbusds.jose.shaded.gson.JsonNull.INSTANCE;
            }
            return new com.nimbusds.jose.shaded.gson.JsonPrimitive(l);
        }
    },
    STRING { // from class: com.nimbusds.jose.shaded.gson.LongSerializationPolicy.2
        @Override // com.nimbusds.jose.shaded.gson.LongSerializationPolicy
        public final com.nimbusds.jose.shaded.gson.JsonElement serialize(java.lang.Long l) {
            if (l == null) {
                return com.nimbusds.jose.shaded.gson.JsonNull.INSTANCE;
            }
            return new com.nimbusds.jose.shaded.gson.JsonPrimitive(l.toString());
        }
    };

    public abstract com.nimbusds.jose.shaded.gson.JsonElement serialize(java.lang.Long l);
}
