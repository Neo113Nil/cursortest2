package com.nimbusds.jose.shaded.gson;

/* loaded from: classes4.dex */
public final class JsonNull extends com.nimbusds.jose.shaded.gson.JsonElement {
    public static final com.nimbusds.jose.shaded.gson.JsonNull INSTANCE = new com.nimbusds.jose.shaded.gson.JsonNull();

    @java.lang.Deprecated
    public JsonNull() {
    }

    @Override // com.nimbusds.jose.shaded.gson.JsonElement
    public final com.nimbusds.jose.shaded.gson.JsonNull deepCopy() {
        return INSTANCE;
    }

    public final int hashCode() {
        return com.nimbusds.jose.shaded.gson.JsonNull.class.hashCode();
    }

    public final boolean equals(java.lang.Object obj) {
        return obj instanceof com.nimbusds.jose.shaded.gson.JsonNull;
    }
}
