package com.google.gson;

/* loaded from: classes4.dex */
public abstract class JsonElement {
    public abstract com.google.gson.JsonElement deepCopy();

    @java.lang.Deprecated
    public JsonElement() {
    }

    public boolean isJsonArray() {
        return this instanceof com.google.gson.JsonArray;
    }

    public boolean isJsonObject() {
        return this instanceof com.google.gson.JsonObject;
    }

    public boolean isJsonPrimitive() {
        return this instanceof com.google.gson.JsonPrimitive;
    }

    public boolean isJsonNull() {
        return this instanceof com.google.gson.JsonNull;
    }

    public com.google.gson.JsonObject getAsJsonObject() {
        if (isJsonObject()) {
            return (com.google.gson.JsonObject) this;
        }
        throw new java.lang.IllegalStateException("Not a JSON Object: ".concat(java.lang.String.valueOf(this)));
    }

    public com.google.gson.JsonArray getAsJsonArray() {
        if (isJsonArray()) {
            return (com.google.gson.JsonArray) this;
        }
        throw new java.lang.IllegalStateException("Not a JSON Array: ".concat(java.lang.String.valueOf(this)));
    }

    public com.google.gson.JsonPrimitive getAsJsonPrimitive() {
        if (isJsonPrimitive()) {
            return (com.google.gson.JsonPrimitive) this;
        }
        throw new java.lang.IllegalStateException("Not a JSON Primitive: ".concat(java.lang.String.valueOf(this)));
    }

    public com.google.gson.JsonNull getAsJsonNull() {
        if (isJsonNull()) {
            return (com.google.gson.JsonNull) this;
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
            java.lang.StringBuilder sb = new java.lang.StringBuilder();
            com.google.gson.stream.JsonWriter jsonWriter = new com.google.gson.stream.JsonWriter(com.google.gson.internal.Streams.writerForAppendable(sb));
            jsonWriter.setStrictness(com.google.gson.Strictness.LENIENT);
            com.google.gson.internal.Streams.write(this, jsonWriter);
            return sb.toString();
        } catch (java.io.IOException e) {
            throw new java.lang.AssertionError(e);
        }
    }
}
