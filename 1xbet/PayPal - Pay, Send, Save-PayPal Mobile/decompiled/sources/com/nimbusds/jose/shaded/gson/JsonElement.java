package com.nimbusds.jose.shaded.gson;

/* loaded from: classes4.dex */
public abstract class JsonElement {
    public abstract com.nimbusds.jose.shaded.gson.JsonElement deepCopy();

    @java.lang.Deprecated
    public JsonElement() {
    }

    public boolean isJsonArray() {
        return this instanceof com.nimbusds.jose.shaded.gson.JsonArray;
    }

    public boolean isJsonObject() {
        return this instanceof com.nimbusds.jose.shaded.gson.JsonObject;
    }

    public boolean isJsonPrimitive() {
        return this instanceof com.nimbusds.jose.shaded.gson.JsonPrimitive;
    }

    public boolean isJsonNull() {
        return this instanceof com.nimbusds.jose.shaded.gson.JsonNull;
    }

    public com.nimbusds.jose.shaded.gson.JsonObject getAsJsonObject() {
        if (isJsonObject()) {
            return (com.nimbusds.jose.shaded.gson.JsonObject) this;
        }
        throw new java.lang.IllegalStateException("Not a JSON Object: ".concat(java.lang.String.valueOf(this)));
    }

    public com.nimbusds.jose.shaded.gson.JsonArray getAsJsonArray() {
        if (isJsonArray()) {
            return (com.nimbusds.jose.shaded.gson.JsonArray) this;
        }
        throw new java.lang.IllegalStateException("Not a JSON Array: ".concat(java.lang.String.valueOf(this)));
    }

    public com.nimbusds.jose.shaded.gson.JsonPrimitive getAsJsonPrimitive() {
        if (isJsonPrimitive()) {
            return (com.nimbusds.jose.shaded.gson.JsonPrimitive) this;
        }
        throw new java.lang.IllegalStateException("Not a JSON Primitive: ".concat(java.lang.String.valueOf(this)));
    }

    public com.nimbusds.jose.shaded.gson.JsonNull getAsJsonNull() {
        if (isJsonNull()) {
            return (com.nimbusds.jose.shaded.gson.JsonNull) this;
        }
        throw new java.lang.IllegalStateException("Not a JSON Null: ".concat(java.lang.String.valueOf(this)));
    }

    public boolean getAsBoolean() {
        throw new java.lang.UnsupportedOperationException(getClass().getSimpleName());
    }

    public java.lang.Number getAsNumber() {
        throw new java.lang.UnsupportedOperationException(getClass().getSimpleName());
    }

    public java.lang.String getAsString() {
        throw new java.lang.UnsupportedOperationException(getClass().getSimpleName());
    }

    public double getAsDouble() {
        throw new java.lang.UnsupportedOperationException(getClass().getSimpleName());
    }

    public float getAsFloat() {
        throw new java.lang.UnsupportedOperationException(getClass().getSimpleName());
    }

    public long getAsLong() {
        throw new java.lang.UnsupportedOperationException(getClass().getSimpleName());
    }

    public int getAsInt() {
        throw new java.lang.UnsupportedOperationException(getClass().getSimpleName());
    }

    public byte getAsByte() {
        throw new java.lang.UnsupportedOperationException(getClass().getSimpleName());
    }

    @java.lang.Deprecated
    public char getAsCharacter() {
        throw new java.lang.UnsupportedOperationException(getClass().getSimpleName());
    }

    public java.math.BigDecimal getAsBigDecimal() {
        throw new java.lang.UnsupportedOperationException(getClass().getSimpleName());
    }

    public java.math.BigInteger getAsBigInteger() {
        throw new java.lang.UnsupportedOperationException(getClass().getSimpleName());
    }

    public short getAsShort() {
        throw new java.lang.UnsupportedOperationException(getClass().getSimpleName());
    }

    public java.lang.String toString() {
        try {
            java.io.StringWriter stringWriter = new java.io.StringWriter();
            com.nimbusds.jose.shaded.gson.stream.JsonWriter jsonWriter = new com.nimbusds.jose.shaded.gson.stream.JsonWriter(stringWriter);
            jsonWriter.setLenient(true);
            com.nimbusds.jose.shaded.gson.internal.Streams.write(this, jsonWriter);
            return stringWriter.toString();
        } catch (java.io.IOException e) {
            throw new java.lang.AssertionError(e);
        }
    }
}
