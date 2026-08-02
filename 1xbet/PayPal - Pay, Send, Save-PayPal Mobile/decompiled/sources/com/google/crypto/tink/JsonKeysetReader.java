package com.google.crypto.tink;

/* loaded from: classes9.dex */
public final class JsonKeysetReader implements com.google.crypto.tink.KeysetReader {
    private static final long MAX_KEY_ID = 4294967295L;
    private static final long MIN_KEY_ID = -2147483648L;
    private static final java.nio.charset.Charset UTF_8 = java.nio.charset.Charset.forName("UTF-8");
    private final java.io.InputStream inputStream;
    private boolean urlSafeBase64 = false;

    private JsonKeysetReader(java.io.InputStream inputStream) {
        this.inputStream = inputStream;
    }

    public static com.google.crypto.tink.JsonKeysetReader withInputStream(java.io.InputStream inputStream) throws java.io.IOException {
        return new com.google.crypto.tink.JsonKeysetReader(inputStream);
    }

    @java.lang.Deprecated
    public static com.google.crypto.tink.JsonKeysetReader withJsonObject(java.lang.Object obj) {
        return withString(obj.toString());
    }

    public static com.google.crypto.tink.JsonKeysetReader withString(java.lang.String str) {
        return new com.google.crypto.tink.JsonKeysetReader(new java.io.ByteArrayInputStream(str.getBytes(UTF_8)));
    }

    @java.lang.Deprecated
    public static com.google.crypto.tink.JsonKeysetReader withBytes(byte[] bArr) {
        return new com.google.crypto.tink.JsonKeysetReader(new java.io.ByteArrayInputStream(bArr));
    }

    @java.lang.Deprecated
    public static com.google.crypto.tink.JsonKeysetReader withFile(java.io.File file) throws java.io.IOException {
        return withInputStream(new java.io.FileInputStream(file));
    }

    @java.lang.Deprecated
    public static com.google.crypto.tink.JsonKeysetReader withPath(java.lang.String str) throws java.io.IOException {
        return withInputStream(new java.io.FileInputStream(new java.io.File(str)));
    }

    @java.lang.Deprecated
    public static com.google.crypto.tink.JsonKeysetReader withPath(java.nio.file.Path path) throws java.io.IOException {
        return withInputStream(new java.io.FileInputStream(path.toFile()));
    }

    public final com.google.crypto.tink.JsonKeysetReader withUrlSafeBase64() {
        this.urlSafeBase64 = true;
        return this;
    }

    @Override // com.google.crypto.tink.KeysetReader
    public final com.google.crypto.tink.proto.Keyset read() throws java.io.IOException {
        try {
            try {
                return keysetFromJson(com.google.crypto.tink.internal.JsonParser.parse(new java.lang.String(com.google.crypto.tink.Util.readAll(this.inputStream), UTF_8)).getAsJsonObject());
            } finally {
                java.io.InputStream inputStream = this.inputStream;
                if (inputStream != null) {
                    inputStream.close();
                }
            }
        } catch (com.google.gson.JsonParseException | java.lang.IllegalStateException e) {
            throw new java.io.IOException(e);
        }
    }

    @Override // com.google.crypto.tink.KeysetReader
    public final com.google.crypto.tink.proto.EncryptedKeyset readEncrypted() throws java.io.IOException {
        try {
            try {
                return encryptedKeysetFromJson(com.google.crypto.tink.internal.JsonParser.parse(new java.lang.String(com.google.crypto.tink.Util.readAll(this.inputStream), UTF_8)).getAsJsonObject());
            } finally {
                java.io.InputStream inputStream = this.inputStream;
                if (inputStream != null) {
                    inputStream.close();
                }
            }
        } catch (com.google.gson.JsonParseException | java.lang.IllegalStateException e) {
            throw new java.io.IOException(e);
        }
    }

    private static int getKeyId(com.google.gson.JsonElement jsonElement) throws java.io.IOException {
        if (!jsonElement.isJsonPrimitive()) {
            throw new java.io.IOException("invalid key id: not a JSON primitive");
        }
        if (!jsonElement.getAsJsonPrimitive().isNumber()) {
            throw new java.io.IOException("invalid key id: not a JSON number");
        }
        try {
            long parsedNumberAsLongOrThrow = com.google.crypto.tink.internal.JsonParser.getParsedNumberAsLongOrThrow(jsonElement.getAsJsonPrimitive().getAsNumber());
            if (parsedNumberAsLongOrThrow > 4294967295L || parsedNumberAsLongOrThrow < -2147483648L) {
                throw new java.io.IOException("invalid key id");
            }
            return (int) parsedNumberAsLongOrThrow;
        } catch (java.lang.NumberFormatException e) {
            throw new java.io.IOException(e);
        }
    }

    private com.google.crypto.tink.proto.Keyset keysetFromJson(com.google.gson.JsonObject jsonObject) throws java.io.IOException {
        if (!jsonObject.has("key")) {
            throw new com.google.gson.JsonParseException("invalid keyset: no key");
        }
        com.google.gson.JsonElement jsonElement = jsonObject.get("key");
        if (!jsonElement.isJsonArray()) {
            throw new com.google.gson.JsonParseException("invalid keyset: key must be an array");
        }
        com.google.gson.JsonArray asJsonArray = jsonElement.getAsJsonArray();
        if (asJsonArray.size() == 0) {
            throw new com.google.gson.JsonParseException("invalid keyset: key is empty");
        }
        com.google.crypto.tink.proto.Keyset.Builder newBuilder = com.google.crypto.tink.proto.Keyset.newBuilder();
        if (jsonObject.has("primaryKeyId")) {
            newBuilder.setPrimaryKeyId(getKeyId(jsonObject.get("primaryKeyId")));
        }
        for (int i = 0; i < asJsonArray.size(); i++) {
            newBuilder.addKey(keyFromJson(asJsonArray.get(i).getAsJsonObject()));
        }
        return newBuilder.build();
    }

    private com.google.crypto.tink.proto.EncryptedKeyset encryptedKeysetFromJson(com.google.gson.JsonObject jsonObject) throws java.io.IOException {
        byte[] decode;
        validateEncryptedKeyset(jsonObject);
        if (this.urlSafeBase64) {
            decode = com.google.crypto.tink.subtle.Base64.urlSafeDecode(jsonObject.get("encryptedKeyset").getAsString());
        } else {
            decode = com.google.crypto.tink.subtle.Base64.decode(jsonObject.get("encryptedKeyset").getAsString());
        }
        if (jsonObject.has("keysetInfo")) {
            return com.google.crypto.tink.proto.EncryptedKeyset.newBuilder().setEncryptedKeyset(com.google.crypto.tink.shaded.protobuf.ByteString.copyFrom(decode)).setKeysetInfo(keysetInfoFromJson(jsonObject.getAsJsonObject("keysetInfo"))).build();
        }
        return com.google.crypto.tink.proto.EncryptedKeyset.newBuilder().setEncryptedKeyset(com.google.crypto.tink.shaded.protobuf.ByteString.copyFrom(decode)).build();
    }

    private com.google.crypto.tink.proto.Keyset.Key keyFromJson(com.google.gson.JsonObject jsonObject) throws java.io.IOException {
        if (!jsonObject.has("keyData") || !jsonObject.has("status") || !jsonObject.has("keyId") || !jsonObject.has("outputPrefixType")) {
            throw new com.google.gson.JsonParseException("invalid key");
        }
        com.google.gson.JsonElement jsonElement = jsonObject.get("keyData");
        if (!jsonElement.isJsonObject()) {
            throw new com.google.gson.JsonParseException("invalid key: keyData must be an object");
        }
        return com.google.crypto.tink.proto.Keyset.Key.newBuilder().setStatus(getStatus(jsonObject.get("status").getAsString())).setKeyId(getKeyId(jsonObject.get("keyId"))).setOutputPrefixType(getOutputPrefixType(jsonObject.get("outputPrefixType").getAsString())).setKeyData(keyDataFromJson(jsonElement.getAsJsonObject())).build();
    }

    private static com.google.crypto.tink.proto.KeysetInfo keysetInfoFromJson(com.google.gson.JsonObject jsonObject) throws java.io.IOException {
        com.google.crypto.tink.proto.KeysetInfo.Builder newBuilder = com.google.crypto.tink.proto.KeysetInfo.newBuilder();
        if (jsonObject.has("primaryKeyId")) {
            newBuilder.setPrimaryKeyId(getKeyId(jsonObject.get("primaryKeyId")));
        }
        if (jsonObject.has("keyInfo")) {
            com.google.gson.JsonArray asJsonArray = jsonObject.getAsJsonArray("keyInfo");
            for (int i = 0; i < asJsonArray.size(); i++) {
                newBuilder.addKeyInfo(keyInfoFromJson(asJsonArray.get(i).getAsJsonObject()));
            }
        }
        return newBuilder.build();
    }

    private static com.google.crypto.tink.proto.KeysetInfo.KeyInfo keyInfoFromJson(com.google.gson.JsonObject jsonObject) throws java.io.IOException {
        return com.google.crypto.tink.proto.KeysetInfo.KeyInfo.newBuilder().setStatus(getStatus(jsonObject.get("status").getAsString())).setKeyId(getKeyId(jsonObject.get("keyId"))).setOutputPrefixType(getOutputPrefixType(jsonObject.get("outputPrefixType").getAsString())).setTypeUrl(jsonObject.get("typeUrl").getAsString()).build();
    }

    private com.google.crypto.tink.proto.KeyData keyDataFromJson(com.google.gson.JsonObject jsonObject) {
        byte[] decode;
        if (!jsonObject.has("typeUrl") || !jsonObject.has(com.datadog.android.rum.internal.metric.ViewEndedMetricDispatcher.KEY_VALUE) || !jsonObject.has("keyMaterialType")) {
            throw new com.google.gson.JsonParseException("invalid keyData");
        }
        if (this.urlSafeBase64) {
            decode = com.google.crypto.tink.subtle.Base64.urlSafeDecode(jsonObject.get(com.datadog.android.rum.internal.metric.ViewEndedMetricDispatcher.KEY_VALUE).getAsString());
        } else {
            decode = com.google.crypto.tink.subtle.Base64.decode(jsonObject.get(com.datadog.android.rum.internal.metric.ViewEndedMetricDispatcher.KEY_VALUE).getAsString());
        }
        return com.google.crypto.tink.proto.KeyData.newBuilder().setTypeUrl(jsonObject.get("typeUrl").getAsString()).setValue(com.google.crypto.tink.shaded.protobuf.ByteString.copyFrom(decode)).setKeyMaterialType(getKeyMaterialType(jsonObject.get("keyMaterialType").getAsString())).build();
    }

    private static com.google.crypto.tink.proto.KeyStatusType getStatus(java.lang.String str) {
        char c;
        str.hashCode();
        int hashCode = str.hashCode();
        if (hashCode == -891611359) {
            if (str.equals("ENABLED")) {
                c = 0;
            }
            c = 65535;
        } else if (hashCode != 478389753) {
            if (hashCode == 1053567612 && str.equals("DISABLED")) {
                c = 2;
            }
            c = 65535;
        } else {
            if (str.equals("DESTROYED")) {
                c = 1;
            }
            c = 65535;
        }
        if (c == 0) {
            return com.google.crypto.tink.proto.KeyStatusType.ENABLED;
        }
        if (c == 1) {
            return com.google.crypto.tink.proto.KeyStatusType.DESTROYED;
        }
        if (c == 2) {
            return com.google.crypto.tink.proto.KeyStatusType.DISABLED;
        }
        throw new com.google.gson.JsonParseException("unknown status: ".concat(java.lang.String.valueOf(str)));
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    private static com.google.crypto.tink.proto.OutputPrefixType getOutputPrefixType(java.lang.String str) {
        char c;
        str.hashCode();
        switch (str.hashCode()) {
            case -2053249079:
                if (str.equals("LEGACY")) {
                    c = 0;
                    break;
                }
                c = 65535;
                break;
            case 80904:
                if (str.equals("RAW")) {
                    c = 1;
                    break;
                }
                c = 65535;
                break;
            case 2575090:
                if (str.equals("TINK")) {
                    c = 2;
                    break;
                }
                c = 65535;
                break;
            case 1761684556:
                if (str.equals("CRUNCHY")) {
                    c = 3;
                    break;
                }
                c = 65535;
                break;
            default:
                c = 65535;
                break;
        }
        if (c == 0) {
            return com.google.crypto.tink.proto.OutputPrefixType.LEGACY;
        }
        if (c == 1) {
            return com.google.crypto.tink.proto.OutputPrefixType.RAW;
        }
        if (c == 2) {
            return com.google.crypto.tink.proto.OutputPrefixType.TINK;
        }
        if (c == 3) {
            return com.google.crypto.tink.proto.OutputPrefixType.CRUNCHY;
        }
        throw new com.google.gson.JsonParseException("unknown output prefix type: ".concat(java.lang.String.valueOf(str)));
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    private static com.google.crypto.tink.proto.KeyData.KeyMaterialType getKeyMaterialType(java.lang.String str) {
        char c;
        str.hashCode();
        switch (str.hashCode()) {
            case -1881281466:
                if (str.equals("REMOTE")) {
                    c = 0;
                    break;
                }
                c = 65535;
                break;
            case -1609477353:
                if (str.equals("SYMMETRIC")) {
                    c = 1;
                    break;
                }
                c = 65535;
                break;
            case 249237018:
                if (str.equals("ASYMMETRIC_PRIVATE")) {
                    c = 2;
                    break;
                }
                c = 65535;
                break;
            case 1534613202:
                if (str.equals("ASYMMETRIC_PUBLIC")) {
                    c = 3;
                    break;
                }
                c = 65535;
                break;
            default:
                c = 65535;
                break;
        }
        if (c == 0) {
            return com.google.crypto.tink.proto.KeyData.KeyMaterialType.REMOTE;
        }
        if (c == 1) {
            return com.google.crypto.tink.proto.KeyData.KeyMaterialType.SYMMETRIC;
        }
        if (c == 2) {
            return com.google.crypto.tink.proto.KeyData.KeyMaterialType.ASYMMETRIC_PRIVATE;
        }
        if (c == 3) {
            return com.google.crypto.tink.proto.KeyData.KeyMaterialType.ASYMMETRIC_PUBLIC;
        }
        throw new com.google.gson.JsonParseException("unknown key material type: ".concat(java.lang.String.valueOf(str)));
    }

    private static void validateEncryptedKeyset(com.google.gson.JsonObject jsonObject) {
        if (!jsonObject.has("encryptedKeyset")) {
            throw new com.google.gson.JsonParseException("invalid encrypted keyset");
        }
    }
}
