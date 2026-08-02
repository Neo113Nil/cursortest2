package com.google.gson;

/* loaded from: classes4.dex */
public final class JsonNull extends com.google.gson.JsonElement {
    public static final com.google.gson.JsonNull INSTANCE = new com.google.gson.JsonNull();

    @java.lang.Deprecated
    public JsonNull() {
    }

    @Override // com.google.gson.JsonElement
    public final com.google.gson.JsonNull deepCopy() {
        return INSTANCE;
    }

    public final int hashCode() {
        return com.google.gson.JsonNull.class.hashCode();
    }

    public final boolean equals(java.lang.Object obj) {
        return obj instanceof com.google.gson.JsonNull;
    }
}
