package com.nimbusds.jose.shaded.gson.internal.bind;

/* loaded from: classes4.dex */
public final class JsonTreeWriter extends com.nimbusds.jose.shaded.gson.stream.JsonWriter {
    private java.lang.String pendingName;
    private com.nimbusds.jose.shaded.gson.JsonElement product;
    private final java.util.List<com.nimbusds.jose.shaded.gson.JsonElement> stack;
    private static final java.io.Writer UNWRITABLE_WRITER = new java.io.Writer() { // from class: com.nimbusds.jose.shaded.gson.internal.bind.JsonTreeWriter.1
        @Override // java.io.Writer
        public void write(char[] cArr, int i, int i2) {
            throw new java.lang.AssertionError();
        }

        @Override // java.io.Writer, java.io.Flushable
        public void flush() {
            throw new java.lang.AssertionError();
        }

        @Override // java.io.Writer, java.io.Closeable, java.lang.AutoCloseable
        public void close() {
            throw new java.lang.AssertionError();
        }
    };
    private static final com.nimbusds.jose.shaded.gson.JsonPrimitive SENTINEL_CLOSED = new com.nimbusds.jose.shaded.gson.JsonPrimitive(com.paypal.oslo.feature.notificationcenter.analytics.NotificationCenterAnalyticsConstants.Action.CLOSED);

    @Override // com.nimbusds.jose.shaded.gson.stream.JsonWriter, java.io.Flushable
    public final void flush() throws java.io.IOException {
    }

    public JsonTreeWriter() {
        super(UNWRITABLE_WRITER);
        this.stack = new java.util.ArrayList();
        this.product = com.nimbusds.jose.shaded.gson.JsonNull.INSTANCE;
    }

    public final com.nimbusds.jose.shaded.gson.JsonElement get() {
        if (!this.stack.isEmpty()) {
            java.lang.StringBuilder sb = new java.lang.StringBuilder("Expected one JSON element but was ");
            sb.append(this.stack);
            throw new java.lang.IllegalStateException(sb.toString());
        }
        return this.product;
    }

    private com.nimbusds.jose.shaded.gson.JsonElement peek() {
        return this.stack.get(r0.size() - 1);
    }

    private void put(com.nimbusds.jose.shaded.gson.JsonElement jsonElement) {
        if (this.pendingName != null) {
            if (!jsonElement.isJsonNull() || getSerializeNulls()) {
                ((com.nimbusds.jose.shaded.gson.JsonObject) peek()).add(this.pendingName, jsonElement);
            }
            this.pendingName = null;
            return;
        }
        if (this.stack.isEmpty()) {
            this.product = jsonElement;
            return;
        }
        com.nimbusds.jose.shaded.gson.JsonElement peek = peek();
        if (peek instanceof com.nimbusds.jose.shaded.gson.JsonArray) {
            ((com.nimbusds.jose.shaded.gson.JsonArray) peek).add(jsonElement);
            return;
        }
        throw new java.lang.IllegalStateException();
    }

    @Override // com.nimbusds.jose.shaded.gson.stream.JsonWriter
    public final com.nimbusds.jose.shaded.gson.stream.JsonWriter beginArray() throws java.io.IOException {
        com.nimbusds.jose.shaded.gson.JsonArray jsonArray = new com.nimbusds.jose.shaded.gson.JsonArray();
        put(jsonArray);
        this.stack.add(jsonArray);
        return this;
    }

    @Override // com.nimbusds.jose.shaded.gson.stream.JsonWriter
    public final com.nimbusds.jose.shaded.gson.stream.JsonWriter endArray() throws java.io.IOException {
        if (this.stack.isEmpty() || this.pendingName != null) {
            throw new java.lang.IllegalStateException();
        }
        if (peek() instanceof com.nimbusds.jose.shaded.gson.JsonArray) {
            this.stack.remove(r0.size() - 1);
            return this;
        }
        throw new java.lang.IllegalStateException();
    }

    @Override // com.nimbusds.jose.shaded.gson.stream.JsonWriter
    public final com.nimbusds.jose.shaded.gson.stream.JsonWriter beginObject() throws java.io.IOException {
        com.nimbusds.jose.shaded.gson.JsonObject jsonObject = new com.nimbusds.jose.shaded.gson.JsonObject();
        put(jsonObject);
        this.stack.add(jsonObject);
        return this;
    }

    @Override // com.nimbusds.jose.shaded.gson.stream.JsonWriter
    public final com.nimbusds.jose.shaded.gson.stream.JsonWriter endObject() throws java.io.IOException {
        if (this.stack.isEmpty() || this.pendingName != null) {
            throw new java.lang.IllegalStateException();
        }
        if (peek() instanceof com.nimbusds.jose.shaded.gson.JsonObject) {
            this.stack.remove(r0.size() - 1);
            return this;
        }
        throw new java.lang.IllegalStateException();
    }

    @Override // com.nimbusds.jose.shaded.gson.stream.JsonWriter
    public final com.nimbusds.jose.shaded.gson.stream.JsonWriter name(java.lang.String str) throws java.io.IOException {
        java.util.Objects.requireNonNull(str, "name == null");
        if (this.stack.isEmpty() || this.pendingName != null) {
            throw new java.lang.IllegalStateException();
        }
        if (peek() instanceof com.nimbusds.jose.shaded.gson.JsonObject) {
            this.pendingName = str;
            return this;
        }
        throw new java.lang.IllegalStateException();
    }

    @Override // com.nimbusds.jose.shaded.gson.stream.JsonWriter
    public final com.nimbusds.jose.shaded.gson.stream.JsonWriter value(java.lang.String str) throws java.io.IOException {
        if (str == null) {
            return nullValue();
        }
        put(new com.nimbusds.jose.shaded.gson.JsonPrimitive(str));
        return this;
    }

    @Override // com.nimbusds.jose.shaded.gson.stream.JsonWriter
    public final com.nimbusds.jose.shaded.gson.stream.JsonWriter jsonValue(java.lang.String str) throws java.io.IOException {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override // com.nimbusds.jose.shaded.gson.stream.JsonWriter
    public final com.nimbusds.jose.shaded.gson.stream.JsonWriter nullValue() throws java.io.IOException {
        put(com.nimbusds.jose.shaded.gson.JsonNull.INSTANCE);
        return this;
    }

    @Override // com.nimbusds.jose.shaded.gson.stream.JsonWriter
    public final com.nimbusds.jose.shaded.gson.stream.JsonWriter value(boolean z) throws java.io.IOException {
        put(new com.nimbusds.jose.shaded.gson.JsonPrimitive(java.lang.Boolean.valueOf(z)));
        return this;
    }

    @Override // com.nimbusds.jose.shaded.gson.stream.JsonWriter
    public final com.nimbusds.jose.shaded.gson.stream.JsonWriter value(java.lang.Boolean bool) throws java.io.IOException {
        if (bool == null) {
            return nullValue();
        }
        put(new com.nimbusds.jose.shaded.gson.JsonPrimitive(bool));
        return this;
    }

    @Override // com.nimbusds.jose.shaded.gson.stream.JsonWriter
    public final com.nimbusds.jose.shaded.gson.stream.JsonWriter value(float f) throws java.io.IOException {
        if (!isLenient() && (java.lang.Float.isNaN(f) || java.lang.Float.isInfinite(f))) {
            throw new java.lang.IllegalArgumentException("JSON forbids NaN and infinities: ".concat(java.lang.String.valueOf(f)));
        }
        put(new com.nimbusds.jose.shaded.gson.JsonPrimitive(java.lang.Float.valueOf(f)));
        return this;
    }

    @Override // com.nimbusds.jose.shaded.gson.stream.JsonWriter
    public final com.nimbusds.jose.shaded.gson.stream.JsonWriter value(double d) throws java.io.IOException {
        if (!isLenient() && (java.lang.Double.isNaN(d) || java.lang.Double.isInfinite(d))) {
            throw new java.lang.IllegalArgumentException("JSON forbids NaN and infinities: ".concat(java.lang.String.valueOf(d)));
        }
        put(new com.nimbusds.jose.shaded.gson.JsonPrimitive(java.lang.Double.valueOf(d)));
        return this;
    }

    @Override // com.nimbusds.jose.shaded.gson.stream.JsonWriter
    public final com.nimbusds.jose.shaded.gson.stream.JsonWriter value(long j) throws java.io.IOException {
        put(new com.nimbusds.jose.shaded.gson.JsonPrimitive(java.lang.Long.valueOf(j)));
        return this;
    }

    @Override // com.nimbusds.jose.shaded.gson.stream.JsonWriter
    public final com.nimbusds.jose.shaded.gson.stream.JsonWriter value(java.lang.Number number) throws java.io.IOException {
        if (number == null) {
            return nullValue();
        }
        if (!isLenient()) {
            double doubleValue = number.doubleValue();
            if (java.lang.Double.isNaN(doubleValue) || java.lang.Double.isInfinite(doubleValue)) {
                throw new java.lang.IllegalArgumentException("JSON forbids NaN and infinities: ".concat(java.lang.String.valueOf(number)));
            }
        }
        put(new com.nimbusds.jose.shaded.gson.JsonPrimitive(number));
        return this;
    }

    @Override // com.nimbusds.jose.shaded.gson.stream.JsonWriter, java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws java.io.IOException {
        if (!this.stack.isEmpty()) {
            throw new java.io.IOException("Incomplete document");
        }
        this.stack.add(SENTINEL_CLOSED);
    }
}
