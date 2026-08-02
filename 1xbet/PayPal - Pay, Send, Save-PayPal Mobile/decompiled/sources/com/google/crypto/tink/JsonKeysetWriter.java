package com.google.crypto.tink;

@java.lang.Deprecated
/* loaded from: classes9.dex */
public final class JsonKeysetWriter implements com.google.crypto.tink.KeysetWriter {
    private static final java.nio.charset.Charset UTF_8 = java.nio.charset.Charset.forName("UTF-8");
    private final java.io.OutputStream outputStream;

    private long toUnsignedLong(int i) {
        return i & 4294967295L;
    }

    private JsonKeysetWriter(java.io.OutputStream outputStream) {
        this.outputStream = outputStream;
    }

    public static com.google.crypto.tink.KeysetWriter withOutputStream(java.io.OutputStream outputStream) {
        return new com.google.crypto.tink.JsonKeysetWriter(outputStream);
    }

    @java.lang.Deprecated
    public static com.google.crypto.tink.KeysetWriter withFile(java.io.File file) throws java.io.IOException {
        return withOutputStream(new java.io.FileOutputStream(file));
    }

    @java.lang.Deprecated
    public static com.google.crypto.tink.KeysetWriter withPath(java.lang.String str) throws java.io.IOException {
        return withOutputStream(new java.io.FileOutputStream(new java.io.File(str)));
    }

    @java.lang.Deprecated
    public static com.google.crypto.tink.KeysetWriter withPath(java.nio.file.Path path) throws java.io.IOException {
        return withOutputStream(new java.io.FileOutputStream(path.toFile()));
    }

    @Override // com.google.crypto.tink.KeysetWriter
    public final void write(com.google.crypto.tink.proto.Keyset keyset) throws java.io.IOException {
        try {
            try {
                java.io.OutputStream outputStream = this.outputStream;
                java.lang.String obj = toJson(keyset).toString();
                java.nio.charset.Charset charset = UTF_8;
                outputStream.write(obj.getBytes(charset));
                this.outputStream.write(java.lang.System.lineSeparator().getBytes(charset));
            } catch (com.google.gson.JsonParseException e) {
                throw new java.io.IOException(e);
            }
        } finally {
            this.outputStream.close();
        }
    }

    @Override // com.google.crypto.tink.KeysetWriter
    public final void write(com.google.crypto.tink.proto.EncryptedKeyset encryptedKeyset) throws java.io.IOException {
        java.io.OutputStream outputStream = this.outputStream;
        java.lang.String obj = toJson(encryptedKeyset).toString();
        java.nio.charset.Charset charset = UTF_8;
        outputStream.write(obj.getBytes(charset));
        this.outputStream.write(java.lang.System.lineSeparator().getBytes(charset));
        this.outputStream.close();
    }

    private com.google.gson.JsonObject toJson(com.google.crypto.tink.proto.Keyset keyset) {
        com.google.gson.JsonObject jsonObject = new com.google.gson.JsonObject();
        jsonObject.addProperty("primaryKeyId", java.lang.Long.valueOf(toUnsignedLong(keyset.getPrimaryKeyId())));
        com.google.gson.JsonArray jsonArray = new com.google.gson.JsonArray();
        java.util.Iterator<com.google.crypto.tink.proto.Keyset.Key> it = keyset.getKeyList().iterator();
        while (it.hasNext()) {
            jsonArray.add(toJson(it.next()));
        }
        jsonObject.add("key", jsonArray);
        return jsonObject;
    }

    private com.google.gson.JsonObject toJson(com.google.crypto.tink.proto.Keyset.Key key) {
        com.google.gson.JsonObject jsonObject = new com.google.gson.JsonObject();
        jsonObject.add("keyData", toJson(key.getKeyData()));
        jsonObject.addProperty("status", key.getStatus().name());
        jsonObject.addProperty("keyId", java.lang.Long.valueOf(toUnsignedLong(key.getKeyId())));
        jsonObject.addProperty("outputPrefixType", key.getOutputPrefixType().name());
        return jsonObject;
    }

    private com.google.gson.JsonObject toJson(com.google.crypto.tink.proto.KeyData keyData) {
        com.google.gson.JsonObject jsonObject = new com.google.gson.JsonObject();
        jsonObject.addProperty("typeUrl", keyData.getTypeUrl());
        jsonObject.addProperty(com.datadog.android.rum.internal.metric.ViewEndedMetricDispatcher.KEY_VALUE, com.google.crypto.tink.subtle.Base64.encode(keyData.getValue().toByteArray()));
        jsonObject.addProperty("keyMaterialType", keyData.getKeyMaterialType().name());
        return jsonObject;
    }

    private com.google.gson.JsonObject toJson(com.google.crypto.tink.proto.EncryptedKeyset encryptedKeyset) {
        com.google.gson.JsonObject jsonObject = new com.google.gson.JsonObject();
        jsonObject.addProperty("encryptedKeyset", com.google.crypto.tink.subtle.Base64.encode(encryptedKeyset.getEncryptedKeyset().toByteArray()));
        jsonObject.add("keysetInfo", toJson(encryptedKeyset.getKeysetInfo()));
        return jsonObject;
    }

    private com.google.gson.JsonObject toJson(com.google.crypto.tink.proto.KeysetInfo keysetInfo) {
        com.google.gson.JsonObject jsonObject = new com.google.gson.JsonObject();
        jsonObject.addProperty("primaryKeyId", java.lang.Long.valueOf(toUnsignedLong(keysetInfo.getPrimaryKeyId())));
        com.google.gson.JsonArray jsonArray = new com.google.gson.JsonArray();
        java.util.Iterator<com.google.crypto.tink.proto.KeysetInfo.KeyInfo> it = keysetInfo.getKeyInfoList().iterator();
        while (it.hasNext()) {
            jsonArray.add(toJson(it.next()));
        }
        jsonObject.add("keyInfo", jsonArray);
        return jsonObject;
    }

    private com.google.gson.JsonObject toJson(com.google.crypto.tink.proto.KeysetInfo.KeyInfo keyInfo) {
        com.google.gson.JsonObject jsonObject = new com.google.gson.JsonObject();
        jsonObject.addProperty("typeUrl", keyInfo.getTypeUrl());
        jsonObject.addProperty("status", keyInfo.getStatus().name());
        jsonObject.addProperty("keyId", java.lang.Long.valueOf(toUnsignedLong(keyInfo.getKeyId())));
        jsonObject.addProperty("outputPrefixType", keyInfo.getOutputPrefixType().name());
        return jsonObject;
    }
}
