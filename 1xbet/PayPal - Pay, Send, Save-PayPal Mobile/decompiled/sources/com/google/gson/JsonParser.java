package com.google.gson;

/* loaded from: classes4.dex */
public final class JsonParser {
    @java.lang.Deprecated
    public JsonParser() {
    }

    public static com.google.gson.JsonElement parseString(java.lang.String str) throws com.google.gson.JsonSyntaxException {
        return parseReader(new java.io.StringReader(str));
    }

    public static com.google.gson.JsonElement parseReader(java.io.Reader reader) throws com.google.gson.JsonIOException, com.google.gson.JsonSyntaxException {
        try {
            com.google.gson.stream.JsonReader jsonReader = new com.google.gson.stream.JsonReader(reader);
            com.google.gson.JsonElement parseReader = parseReader(jsonReader);
            if (!parseReader.isJsonNull() && jsonReader.peek() != com.google.gson.stream.JsonToken.END_DOCUMENT) {
                throw new com.google.gson.JsonSyntaxException("Did not consume the entire document.");
            }
            return parseReader;
        } catch (com.google.gson.stream.MalformedJsonException e) {
            e = e;
            throw new com.google.gson.JsonSyntaxException(e);
        } catch (java.io.IOException e2) {
            throw new com.google.gson.JsonIOException(e2);
        } catch (java.lang.NumberFormatException e3) {
            e = e3;
            throw new com.google.gson.JsonSyntaxException(e);
        }
    }

    public static com.google.gson.JsonElement parseReader(com.google.gson.stream.JsonReader jsonReader) throws com.google.gson.JsonIOException, com.google.gson.JsonSyntaxException {
        com.google.gson.Strictness strictness = jsonReader.getStrictness();
        if (strictness == com.google.gson.Strictness.LEGACY_STRICT) {
            jsonReader.setStrictness(com.google.gson.Strictness.LENIENT);
        }
        try {
            try {
                return com.google.gson.internal.Streams.parse(jsonReader);
            } finally {
                jsonReader.setStrictness(strictness);
            }
        } catch (java.lang.OutOfMemoryError | java.lang.StackOverflowError e) {
            java.lang.StringBuilder sb = new java.lang.StringBuilder("Failed parsing JSON source: ");
            sb.append(jsonReader);
            sb.append(" to Json");
            throw new com.google.gson.JsonParseException(sb.toString(), e);
        }
    }

    @java.lang.Deprecated
    public final com.google.gson.JsonElement parse(java.lang.String str) throws com.google.gson.JsonSyntaxException {
        return parseString(str);
    }

    @java.lang.Deprecated
    public final com.google.gson.JsonElement parse(java.io.Reader reader) throws com.google.gson.JsonIOException, com.google.gson.JsonSyntaxException {
        return parseReader(reader);
    }

    @java.lang.Deprecated
    public final com.google.gson.JsonElement parse(com.google.gson.stream.JsonReader jsonReader) throws com.google.gson.JsonIOException, com.google.gson.JsonSyntaxException {
        return parseReader(jsonReader);
    }
}
