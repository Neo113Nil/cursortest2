package com.nimbusds.jose.shaded.gson;

/* loaded from: classes10.dex */
public final class JsonStreamParser implements java.util.Iterator<com.nimbusds.jose.shaded.gson.JsonElement> {
    private final java.lang.Object lock;
    private final com.nimbusds.jose.shaded.gson.stream.JsonReader parser;

    public JsonStreamParser(java.lang.String str) {
        this(new java.io.StringReader(str));
    }

    public JsonStreamParser(java.io.Reader reader) {
        com.nimbusds.jose.shaded.gson.stream.JsonReader jsonReader = new com.nimbusds.jose.shaded.gson.stream.JsonReader(reader);
        this.parser = jsonReader;
        jsonReader.setLenient(true);
        this.lock = new java.lang.Object();
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // java.util.Iterator
    public final com.nimbusds.jose.shaded.gson.JsonElement next() throws com.nimbusds.jose.shaded.gson.JsonParseException {
        if (!hasNext()) {
            throw new java.util.NoSuchElementException();
        }
        try {
            return com.nimbusds.jose.shaded.gson.internal.Streams.parse(this.parser);
        } catch (java.lang.OutOfMemoryError e) {
            throw new com.nimbusds.jose.shaded.gson.JsonParseException("Failed parsing JSON source to Json", e);
        } catch (java.lang.StackOverflowError e2) {
            throw new com.nimbusds.jose.shaded.gson.JsonParseException("Failed parsing JSON source to Json", e2);
        }
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        boolean z;
        synchronized (this.lock) {
            try {
                try {
                    z = this.parser.peek() != com.nimbusds.jose.shaded.gson.stream.JsonToken.END_DOCUMENT;
                } catch (java.io.IOException e) {
                    throw new com.nimbusds.jose.shaded.gson.JsonIOException(e);
                }
            } catch (com.nimbusds.jose.shaded.gson.stream.MalformedJsonException e2) {
                throw new com.nimbusds.jose.shaded.gson.JsonSyntaxException(e2);
            }
        }
        return z;
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new java.lang.UnsupportedOperationException();
    }
}
