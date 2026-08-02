package com.visa.cbp.sdk.facade.util;

/* loaded from: classes16.dex */
public class GsonHelper {
    public static final com.google.gson.Gson customGson = new com.google.gson.GsonBuilder().registerTypeHierarchyAdapter(byte[].class, new com.visa.cbp.sdk.facade.util.GsonHelper.ByteArrayToBase64TypeAdapter()).create();

    static class ByteArrayToBase64TypeAdapter implements com.google.gson.JsonDeserializer<byte[]>, com.google.gson.JsonSerializer<byte[]> {
        private ByteArrayToBase64TypeAdapter() {
        }

        @Override // com.google.gson.JsonDeserializer
        public byte[] deserialize(com.google.gson.JsonElement jsonElement, java.lang.reflect.Type type, com.google.gson.JsonDeserializationContext jsonDeserializationContext) throws com.google.gson.JsonParseException {
            return android.util.Base64.decode(jsonElement.getAsString(), 2);
        }

        @Override // com.google.gson.JsonSerializer
        public com.google.gson.JsonElement serialize(byte[] bArr, java.lang.reflect.Type type, com.google.gson.JsonSerializationContext jsonSerializationContext) {
            return new com.google.gson.JsonPrimitive(android.util.Base64.encodeToString(bArr, 2));
        }
    }
}
