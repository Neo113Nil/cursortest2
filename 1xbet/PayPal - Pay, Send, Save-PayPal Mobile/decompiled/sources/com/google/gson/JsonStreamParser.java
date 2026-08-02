package com.google.gson;

/* loaded from: classes9.dex */
public final class JsonStreamParser implements java.util.Iterator<com.google.gson.JsonElement> {
    private final java.lang.Object lock;
    private final com.google.gson.stream.JsonReader parser;

    public JsonStreamParser(java.lang.String str) {
        this(new java.io.StringReader(str));
    }

    public JsonStreamParser(java.io.Reader reader) {
        com.google.gson.stream.JsonReader jsonReader = new com.google.gson.stream.JsonReader(reader);
        this.parser = jsonReader;
        jsonReader.setStrictness(com.google.gson.Strictness.LENIENT);
        this.lock = new java.lang.Object();
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // java.util.Iterator
    public final com.google.gson.JsonElement next() throws com.google.gson.JsonParseException {
        if (!hasNext()) {
            throw new java.util.NoSuchElementException();
        }
        try {
            return com.google.gson.internal.Streams.parse(this.parser);
        } catch (java.lang.OutOfMemoryError | java.lang.StackOverflowError e) {
            throw new com.google.gson.JsonParseException("Failed parsing JSON source to Json", e);
        }
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        boolean z;
        synchronized (this.lock) {
            try {
                try {
                    z = this.parser.peek() != com.google.gson.stream.JsonToken.END_DOCUMENT;
                } catch (java.io.IOException e) {
                    throw new com.google.gson.JsonIOException(e);
                }
            } catch (com.google.gson.stream.MalformedJsonException e2) {
                throw new com.google.gson.JsonSyntaxException(e2);
            }
        }
        return z;
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new java.lang.UnsupportedOperationException();
    }
}
