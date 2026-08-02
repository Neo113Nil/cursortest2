package com.nimbusds.jose.shaded.gson.internal.bind;

/* loaded from: classes4.dex */
public final class JsonTreeReader extends com.nimbusds.jose.shaded.gson.stream.JsonReader {
    private int[] pathIndices;
    private java.lang.String[] pathNames;
    private java.lang.Object[] stack;
    private int stackSize;
    private static final java.io.Reader UNREADABLE_READER = new java.io.Reader() { // from class: com.nimbusds.jose.shaded.gson.internal.bind.JsonTreeReader.1
        @Override // java.io.Reader
        public int read(char[] cArr, int i, int i2) {
            throw new java.lang.AssertionError();
        }

        @Override // java.io.Reader, java.io.Closeable, java.lang.AutoCloseable
        public void close() {
            throw new java.lang.AssertionError();
        }
    };
    private static final java.lang.Object SENTINEL_CLOSED = new java.lang.Object();

    public JsonTreeReader(com.nimbusds.jose.shaded.gson.JsonElement jsonElement) {
        super(UNREADABLE_READER);
        this.stack = new java.lang.Object[32];
        this.stackSize = 0;
        this.pathNames = new java.lang.String[32];
        this.pathIndices = new int[32];
        push(jsonElement);
    }

    @Override // com.nimbusds.jose.shaded.gson.stream.JsonReader
    public final void beginArray() throws java.io.IOException {
        expect(com.nimbusds.jose.shaded.gson.stream.JsonToken.BEGIN_ARRAY);
        push(((com.nimbusds.jose.shaded.gson.JsonArray) peekStack()).iterator());
        this.pathIndices[this.stackSize - 1] = 0;
    }

    @Override // com.nimbusds.jose.shaded.gson.stream.JsonReader
    public final void endArray() throws java.io.IOException {
        expect(com.nimbusds.jose.shaded.gson.stream.JsonToken.END_ARRAY);
        popStack();
        popStack();
        int i = this.stackSize;
        if (i > 0) {
            int[] iArr = this.pathIndices;
            int i2 = i - 1;
            iArr[i2] = iArr[i2] + 1;
        }
    }

    @Override // com.nimbusds.jose.shaded.gson.stream.JsonReader
    public final void beginObject() throws java.io.IOException {
        expect(com.nimbusds.jose.shaded.gson.stream.JsonToken.BEGIN_OBJECT);
        push(((com.nimbusds.jose.shaded.gson.JsonObject) peekStack()).entrySet().iterator());
    }

    @Override // com.nimbusds.jose.shaded.gson.stream.JsonReader
    public final void endObject() throws java.io.IOException {
        expect(com.nimbusds.jose.shaded.gson.stream.JsonToken.END_OBJECT);
        this.pathNames[this.stackSize - 1] = null;
        popStack();
        popStack();
        int i = this.stackSize;
        if (i > 0) {
            int[] iArr = this.pathIndices;
            int i2 = i - 1;
            iArr[i2] = iArr[i2] + 1;
        }
    }

    @Override // com.nimbusds.jose.shaded.gson.stream.JsonReader
    public final boolean hasNext() throws java.io.IOException {
        com.nimbusds.jose.shaded.gson.stream.JsonToken peek = peek();
        return (peek == com.nimbusds.jose.shaded.gson.stream.JsonToken.END_OBJECT || peek == com.nimbusds.jose.shaded.gson.stream.JsonToken.END_ARRAY || peek == com.nimbusds.jose.shaded.gson.stream.JsonToken.END_DOCUMENT) ? false : true;
    }

    @Override // com.nimbusds.jose.shaded.gson.stream.JsonReader
    public final com.nimbusds.jose.shaded.gson.stream.JsonToken peek() throws java.io.IOException {
        while (this.stackSize != 0) {
            java.lang.Object peekStack = peekStack();
            if (peekStack instanceof java.util.Iterator) {
                boolean z = this.stack[this.stackSize - 2] instanceof com.nimbusds.jose.shaded.gson.JsonObject;
                java.util.Iterator it = (java.util.Iterator) peekStack;
                if (!it.hasNext()) {
                    return z ? com.nimbusds.jose.shaded.gson.stream.JsonToken.END_OBJECT : com.nimbusds.jose.shaded.gson.stream.JsonToken.END_ARRAY;
                }
                if (z) {
                    return com.nimbusds.jose.shaded.gson.stream.JsonToken.NAME;
                }
                push(it.next());
            } else {
                if (peekStack instanceof com.nimbusds.jose.shaded.gson.JsonObject) {
                    return com.nimbusds.jose.shaded.gson.stream.JsonToken.BEGIN_OBJECT;
                }
                if (peekStack instanceof com.nimbusds.jose.shaded.gson.JsonArray) {
                    return com.nimbusds.jose.shaded.gson.stream.JsonToken.BEGIN_ARRAY;
                }
                if (peekStack instanceof com.nimbusds.jose.shaded.gson.JsonPrimitive) {
                    com.nimbusds.jose.shaded.gson.JsonPrimitive jsonPrimitive = (com.nimbusds.jose.shaded.gson.JsonPrimitive) peekStack;
                    if (jsonPrimitive.isString()) {
                        return com.nimbusds.jose.shaded.gson.stream.JsonToken.STRING;
                    }
                    if (jsonPrimitive.isBoolean()) {
                        return com.nimbusds.jose.shaded.gson.stream.JsonToken.BOOLEAN;
                    }
                    if (jsonPrimitive.isNumber()) {
                        return com.nimbusds.jose.shaded.gson.stream.JsonToken.NUMBER;
                    }
                    throw new java.lang.AssertionError();
                }
                if (peekStack instanceof com.nimbusds.jose.shaded.gson.JsonNull) {
                    return com.nimbusds.jose.shaded.gson.stream.JsonToken.NULL;
                }
                if (peekStack == SENTINEL_CLOSED) {
                    throw new java.lang.IllegalStateException("JsonReader is closed");
                }
                java.lang.StringBuilder sb = new java.lang.StringBuilder("Custom JsonElement subclass ");
                sb.append(peekStack.getClass().getName());
                sb.append(" is not supported");
                throw new com.nimbusds.jose.shaded.gson.stream.MalformedJsonException(sb.toString());
            }
        }
        return com.nimbusds.jose.shaded.gson.stream.JsonToken.END_DOCUMENT;
    }

    private java.lang.Object peekStack() {
        return this.stack[this.stackSize - 1];
    }

    private java.lang.Object popStack() {
        java.lang.Object[] objArr = this.stack;
        int i = this.stackSize - 1;
        this.stackSize = i;
        java.lang.Object obj = objArr[i];
        objArr[i] = null;
        return obj;
    }

    private void expect(com.nimbusds.jose.shaded.gson.stream.JsonToken jsonToken) throws java.io.IOException {
        if (peek() == jsonToken) {
            return;
        }
        java.lang.StringBuilder sb = new java.lang.StringBuilder("Expected ");
        sb.append(jsonToken);
        sb.append(" but was ");
        sb.append(peek());
        sb.append(locationString());
        throw new java.lang.IllegalStateException(sb.toString());
    }

    private java.lang.String nextName(boolean z) throws java.io.IOException {
        expect(com.nimbusds.jose.shaded.gson.stream.JsonToken.NAME);
        java.util.Map.Entry entry = (java.util.Map.Entry) ((java.util.Iterator) peekStack()).next();
        java.lang.String str = (java.lang.String) entry.getKey();
        this.pathNames[this.stackSize - 1] = z ? "<skipped>" : str;
        push(entry.getValue());
        return str;
    }

    @Override // com.nimbusds.jose.shaded.gson.stream.JsonReader
    public final java.lang.String nextName() throws java.io.IOException {
        return nextName(false);
    }

    @Override // com.nimbusds.jose.shaded.gson.stream.JsonReader
    public final java.lang.String nextString() throws java.io.IOException {
        com.nimbusds.jose.shaded.gson.stream.JsonToken peek = peek();
        if (peek != com.nimbusds.jose.shaded.gson.stream.JsonToken.STRING && peek != com.nimbusds.jose.shaded.gson.stream.JsonToken.NUMBER) {
            java.lang.StringBuilder sb = new java.lang.StringBuilder("Expected ");
            sb.append(com.nimbusds.jose.shaded.gson.stream.JsonToken.STRING);
            sb.append(" but was ");
            sb.append(peek);
            sb.append(locationString());
            throw new java.lang.IllegalStateException(sb.toString());
        }
        java.lang.String asString = ((com.nimbusds.jose.shaded.gson.JsonPrimitive) popStack()).getAsString();
        int i = this.stackSize;
        if (i > 0) {
            int[] iArr = this.pathIndices;
            int i2 = i - 1;
            iArr[i2] = iArr[i2] + 1;
        }
        return asString;
    }

    @Override // com.nimbusds.jose.shaded.gson.stream.JsonReader
    public final boolean nextBoolean() throws java.io.IOException {
        expect(com.nimbusds.jose.shaded.gson.stream.JsonToken.BOOLEAN);
        boolean asBoolean = ((com.nimbusds.jose.shaded.gson.JsonPrimitive) popStack()).getAsBoolean();
        int i = this.stackSize;
        if (i > 0) {
            int[] iArr = this.pathIndices;
            int i2 = i - 1;
            iArr[i2] = iArr[i2] + 1;
        }
        return asBoolean;
    }

    @Override // com.nimbusds.jose.shaded.gson.stream.JsonReader
    public final void nextNull() throws java.io.IOException {
        expect(com.nimbusds.jose.shaded.gson.stream.JsonToken.NULL);
        popStack();
        int i = this.stackSize;
        if (i > 0) {
            int[] iArr = this.pathIndices;
            int i2 = i - 1;
            iArr[i2] = iArr[i2] + 1;
        }
    }

    @Override // com.nimbusds.jose.shaded.gson.stream.JsonReader
    public final double nextDouble() throws java.io.IOException {
        com.nimbusds.jose.shaded.gson.stream.JsonToken peek = peek();
        if (peek != com.nimbusds.jose.shaded.gson.stream.JsonToken.NUMBER && peek != com.nimbusds.jose.shaded.gson.stream.JsonToken.STRING) {
            java.lang.StringBuilder sb = new java.lang.StringBuilder("Expected ");
            sb.append(com.nimbusds.jose.shaded.gson.stream.JsonToken.NUMBER);
            sb.append(" but was ");
            sb.append(peek);
            sb.append(locationString());
            throw new java.lang.IllegalStateException(sb.toString());
        }
        double asDouble = ((com.nimbusds.jose.shaded.gson.JsonPrimitive) peekStack()).getAsDouble();
        if (!isLenient() && (java.lang.Double.isNaN(asDouble) || java.lang.Double.isInfinite(asDouble))) {
            throw new com.nimbusds.jose.shaded.gson.stream.MalformedJsonException("JSON forbids NaN and infinities: ".concat(java.lang.String.valueOf(asDouble)));
        }
        popStack();
        int i = this.stackSize;
        if (i > 0) {
            int[] iArr = this.pathIndices;
            int i2 = i - 1;
            iArr[i2] = iArr[i2] + 1;
        }
        return asDouble;
    }

    @Override // com.nimbusds.jose.shaded.gson.stream.JsonReader
    public final long nextLong() throws java.io.IOException {
        com.nimbusds.jose.shaded.gson.stream.JsonToken peek = peek();
        if (peek != com.nimbusds.jose.shaded.gson.stream.JsonToken.NUMBER && peek != com.nimbusds.jose.shaded.gson.stream.JsonToken.STRING) {
            java.lang.StringBuilder sb = new java.lang.StringBuilder("Expected ");
            sb.append(com.nimbusds.jose.shaded.gson.stream.JsonToken.NUMBER);
            sb.append(" but was ");
            sb.append(peek);
            sb.append(locationString());
            throw new java.lang.IllegalStateException(sb.toString());
        }
        long asLong = ((com.nimbusds.jose.shaded.gson.JsonPrimitive) peekStack()).getAsLong();
        popStack();
        int i = this.stackSize;
        if (i > 0) {
            int[] iArr = this.pathIndices;
            int i2 = i - 1;
            iArr[i2] = iArr[i2] + 1;
        }
        return asLong;
    }

    @Override // com.nimbusds.jose.shaded.gson.stream.JsonReader
    public final int nextInt() throws java.io.IOException {
        com.nimbusds.jose.shaded.gson.stream.JsonToken peek = peek();
        if (peek != com.nimbusds.jose.shaded.gson.stream.JsonToken.NUMBER && peek != com.nimbusds.jose.shaded.gson.stream.JsonToken.STRING) {
            java.lang.StringBuilder sb = new java.lang.StringBuilder("Expected ");
            sb.append(com.nimbusds.jose.shaded.gson.stream.JsonToken.NUMBER);
            sb.append(" but was ");
            sb.append(peek);
            sb.append(locationString());
            throw new java.lang.IllegalStateException(sb.toString());
        }
        int asInt = ((com.nimbusds.jose.shaded.gson.JsonPrimitive) peekStack()).getAsInt();
        popStack();
        int i = this.stackSize;
        if (i > 0) {
            int[] iArr = this.pathIndices;
            int i2 = i - 1;
            iArr[i2] = iArr[i2] + 1;
        }
        return asInt;
    }

    final com.nimbusds.jose.shaded.gson.JsonElement nextJsonElement() throws java.io.IOException {
        com.nimbusds.jose.shaded.gson.stream.JsonToken peek = peek();
        if (peek == com.nimbusds.jose.shaded.gson.stream.JsonToken.NAME || peek == com.nimbusds.jose.shaded.gson.stream.JsonToken.END_ARRAY || peek == com.nimbusds.jose.shaded.gson.stream.JsonToken.END_OBJECT || peek == com.nimbusds.jose.shaded.gson.stream.JsonToken.END_DOCUMENT) {
            java.lang.StringBuilder sb = new java.lang.StringBuilder("Unexpected ");
            sb.append(peek);
            sb.append(" when reading a JsonElement.");
            throw new java.lang.IllegalStateException(sb.toString());
        }
        com.nimbusds.jose.shaded.gson.JsonElement jsonElement = (com.nimbusds.jose.shaded.gson.JsonElement) peekStack();
        skipValue();
        return jsonElement;
    }

    @Override // com.nimbusds.jose.shaded.gson.stream.JsonReader, java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws java.io.IOException {
        this.stack = new java.lang.Object[]{SENTINEL_CLOSED};
        this.stackSize = 1;
    }

    /* renamed from: com.nimbusds.jose.shaded.gson.internal.bind.JsonTreeReader$2, reason: invalid class name */
    static /* synthetic */ class AnonymousClass2 {
        static final /* synthetic */ int[] $SwitchMap$com$google$gson$stream$JsonToken;

        static {
            int[] iArr = new int[com.nimbusds.jose.shaded.gson.stream.JsonToken.values().length];
            $SwitchMap$com$google$gson$stream$JsonToken = iArr;
            try {
                iArr[com.nimbusds.jose.shaded.gson.stream.JsonToken.NAME.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$com$google$gson$stream$JsonToken[com.nimbusds.jose.shaded.gson.stream.JsonToken.END_ARRAY.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused2) {
            }
            try {
                $SwitchMap$com$google$gson$stream$JsonToken[com.nimbusds.jose.shaded.gson.stream.JsonToken.END_OBJECT.ordinal()] = 3;
            } catch (java.lang.NoSuchFieldError unused3) {
            }
            try {
                $SwitchMap$com$google$gson$stream$JsonToken[com.nimbusds.jose.shaded.gson.stream.JsonToken.END_DOCUMENT.ordinal()] = 4;
            } catch (java.lang.NoSuchFieldError unused4) {
            }
        }
    }

    @Override // com.nimbusds.jose.shaded.gson.stream.JsonReader
    public final void skipValue() throws java.io.IOException {
        int i = com.nimbusds.jose.shaded.gson.internal.bind.JsonTreeReader.AnonymousClass2.$SwitchMap$com$google$gson$stream$JsonToken[peek().ordinal()];
        if (i == 1) {
            nextName(true);
            return;
        }
        if (i == 2) {
            endArray();
            return;
        }
        if (i == 3) {
            endObject();
            return;
        }
        if (i != 4) {
            popStack();
            int i2 = this.stackSize;
            if (i2 > 0) {
                int[] iArr = this.pathIndices;
                int i3 = i2 - 1;
                iArr[i3] = iArr[i3] + 1;
            }
        }
    }

    @Override // com.nimbusds.jose.shaded.gson.stream.JsonReader
    public final java.lang.String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(locationString());
        return sb.toString();
    }

    public final void promoteNameToValue() throws java.io.IOException {
        expect(com.nimbusds.jose.shaded.gson.stream.JsonToken.NAME);
        java.util.Map.Entry entry = (java.util.Map.Entry) ((java.util.Iterator) peekStack()).next();
        push(entry.getValue());
        push(new com.nimbusds.jose.shaded.gson.JsonPrimitive((java.lang.String) entry.getKey()));
    }

    private void push(java.lang.Object obj) {
        int i = this.stackSize;
        java.lang.Object[] objArr = this.stack;
        if (i == objArr.length) {
            int i2 = i * 2;
            this.stack = java.util.Arrays.copyOf(objArr, i2);
            this.pathIndices = java.util.Arrays.copyOf(this.pathIndices, i2);
            this.pathNames = (java.lang.String[]) java.util.Arrays.copyOf(this.pathNames, i2);
        }
        java.lang.Object[] objArr2 = this.stack;
        int i3 = this.stackSize;
        this.stackSize = i3 + 1;
        objArr2[i3] = obj;
    }

    private java.lang.String getPath(boolean z) {
        java.lang.StringBuilder sb = new java.lang.StringBuilder(com.paypal.oslo.feature.savings.constants.SavingsConstants.Currency.SYMBOL_USD);
        int i = 0;
        while (true) {
            int i2 = this.stackSize;
            if (i < i2) {
                java.lang.Object[] objArr = this.stack;
                java.lang.Object obj = objArr[i];
                if (obj instanceof com.nimbusds.jose.shaded.gson.JsonArray) {
                    i++;
                    if (i < i2 && (objArr[i] instanceof java.util.Iterator)) {
                        int i3 = this.pathIndices[i];
                        if (z && i3 > 0 && (i == i2 - 1 || i == i2 - 2)) {
                            i3--;
                        }
                        sb.append(kotlinx.serialization.json.internal.AbstractJsonLexerKt.BEGIN_LIST);
                        sb.append(i3);
                        sb.append(kotlinx.serialization.json.internal.AbstractJsonLexerKt.END_LIST);
                    }
                } else if ((obj instanceof com.nimbusds.jose.shaded.gson.JsonObject) && (i = i + 1) < i2 && (objArr[i] instanceof java.util.Iterator)) {
                    sb.append(com.paypal.oslo.core.money.MoneyKt.DECIMALSEPARATOR);
                    java.lang.String str = this.pathNames[i];
                    if (str != null) {
                        sb.append(str);
                    }
                }
                i++;
            } else {
                return sb.toString();
            }
        }
    }

    @Override // com.nimbusds.jose.shaded.gson.stream.JsonReader
    public final java.lang.String getPreviousPath() {
        return getPath(true);
    }

    @Override // com.nimbusds.jose.shaded.gson.stream.JsonReader
    public final java.lang.String getPath() {
        return getPath(false);
    }

    private java.lang.String locationString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder(" at path ");
        sb.append(getPath());
        return sb.toString();
    }
}
