package com.izettle.android.serialization;

@kotlin.Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b&\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\r\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0006J\r\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\b\u0010\tJ\r\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\u000b\u0010\fJ\r\u0010\u000e\u001a\u00020\r¢\u0006\u0004\b\u000e\u0010\u000f"}, d2 = {"Lcom/izettle/android/serialization/JsonElement;", "", "<init>", "()V", "Lcom/izettle/android/serialization/JsonArray;", "asJsonArray", "()Lcom/izettle/android/serialization/JsonArray;", "Lcom/izettle/android/serialization/JsonNull;", "asJsonNull", "()Lcom/izettle/android/serialization/JsonNull;", "Lcom/izettle/android/serialization/JsonObject;", "asJsonObject", "()Lcom/izettle/android/serialization/JsonObject;", "Lcom/izettle/android/serialization/JsonPrimitive;", "asJsonPrimitive", "()Lcom/izettle/android/serialization/JsonPrimitive;"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes9.dex */
public abstract class JsonElement {
    public final com.izettle.android.serialization.JsonObject asJsonObject() {
        com.izettle.android.serialization.JsonObject jsonObject = this instanceof com.izettle.android.serialization.JsonObject ? (com.izettle.android.serialization.JsonObject) this : null;
        if (jsonObject != null) {
            return jsonObject;
        }
        throw new java.lang.IllegalStateException("Element is not of type JsonObject");
    }

    public final com.izettle.android.serialization.JsonArray asJsonArray() {
        com.izettle.android.serialization.JsonArray jsonArray = this instanceof com.izettle.android.serialization.JsonArray ? (com.izettle.android.serialization.JsonArray) this : null;
        if (jsonArray != null) {
            return jsonArray;
        }
        throw new java.lang.IllegalStateException("Element is not of type JsonObject");
    }

    public final com.izettle.android.serialization.JsonPrimitive asJsonPrimitive() {
        com.izettle.android.serialization.JsonPrimitive jsonPrimitive = this instanceof com.izettle.android.serialization.JsonPrimitive ? (com.izettle.android.serialization.JsonPrimitive) this : null;
        if (jsonPrimitive != null) {
            return jsonPrimitive;
        }
        throw new java.lang.IllegalStateException("Element is not of type JsonPrimitive");
    }

    public final com.izettle.android.serialization.JsonNull asJsonNull() {
        com.izettle.android.serialization.JsonNull jsonNull = this instanceof com.izettle.android.serialization.JsonNull ? (com.izettle.android.serialization.JsonNull) this : null;
        if (jsonNull != null) {
            return jsonNull;
        }
        throw new java.lang.IllegalStateException("Element is not of type JsonNull");
    }
}
