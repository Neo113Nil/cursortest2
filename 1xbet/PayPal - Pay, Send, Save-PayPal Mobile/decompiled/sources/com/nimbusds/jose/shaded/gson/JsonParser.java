package com.nimbusds.jose.shaded.gson;

/* loaded from: classes10.dex */
public final class JsonParser {
    @java.lang.Deprecated
    public JsonParser() {
    }

    public static com.nimbusds.jose.shaded.gson.JsonElement parseString(java.lang.String str) throws com.nimbusds.jose.shaded.gson.JsonSyntaxException {
        return parseReader(new java.io.StringReader(str));
    }

    public static com.nimbusds.jose.shaded.gson.JsonElement parseReader(java.io.Reader reader) throws com.nimbusds.jose.shaded.gson.JsonIOException, com.nimbusds.jose.shaded.gson.JsonSyntaxException {
        try {
            com.nimbusds.jose.shaded.gson.stream.JsonReader jsonReader = new com.nimbusds.jose.shaded.gson.stream.JsonReader(reader);
            com.nimbusds.jose.shaded.gson.JsonElement parseReader = parseReader(jsonReader);
            if (!parseReader.isJsonNull() && jsonReader.peek() != com.nimbusds.jose.shaded.gson.stream.JsonToken.END_DOCUMENT) {
                throw new com.nimbusds.jose.shaded.gson.JsonSyntaxException("Did not consume the entire document.");
            }
            return parseReader;
        } catch (com.nimbusds.jose.shaded.gson.stream.MalformedJsonException e) {
            throw new com.nimbusds.jose.shaded.gson.JsonSyntaxException(e);
        } catch (java.io.IOException e2) {
            throw new com.nimbusds.jose.shaded.gson.JsonIOException(e2);
        } catch (java.lang.NumberFormatException e3) {
            throw new com.nimbusds.jose.shaded.gson.JsonSyntaxException(e3);
        }
    }

    public static com.nimbusds.jose.shaded.gson.JsonElement parseReader(com.nimbusds.jose.shaded.gson.stream.JsonReader jsonReader) throws com.nimbusds.jose.shaded.gson.JsonIOException, com.nimbusds.jose.shaded.gson.JsonSyntaxException {
        boolean isLenient = jsonReader.isLenient();
        jsonReader.setLenient(true);
        try {
            try {
                return com.nimbusds.jose.shaded.gson.internal.Streams.parse(jsonReader);
            } catch (java.lang.OutOfMemoryError e) {
                java.lang.StringBuilder sb = new java.lang.StringBuilder("Failed parsing JSON source: ");
                sb.append(jsonReader);
                sb.append(" to Json");
                throw new com.nimbusds.jose.shaded.gson.JsonParseException(sb.toString(), e);
            } catch (java.lang.StackOverflowError e2) {
                java.lang.StringBuilder sb2 = new java.lang.StringBuilder("Failed parsing JSON source: ");
                sb2.append(jsonReader);
                sb2.append(" to Json");
                throw new com.nimbusds.jose.shaded.gson.JsonParseException(sb2.toString(), e2);
            }
        } finally {
            jsonReader.setLenient(isLenient);
        }
    }

    @java.lang.Deprecated
    public final com.nimbusds.jose.shaded.gson.JsonElement parse(java.lang.String str) throws com.nimbusds.jose.shaded.gson.JsonSyntaxException {
        return parseString(str);
    }

    @java.lang.Deprecated
    public final com.nimbusds.jose.shaded.gson.JsonElement parse(java.io.Reader reader) throws com.nimbusds.jose.shaded.gson.JsonIOException, com.nimbusds.jose.shaded.gson.JsonSyntaxException {
        return parseReader(reader);
    }

    @java.lang.Deprecated
    public final com.nimbusds.jose.shaded.gson.JsonElement parse(com.nimbusds.jose.shaded.gson.stream.JsonReader jsonReader) throws com.nimbusds.jose.shaded.gson.JsonIOException, com.nimbusds.jose.shaded.gson.JsonSyntaxException {
        return parseReader(jsonReader);
    }
}
