package com.google.gson.stream;

/* loaded from: classes4.dex */
public class JsonWriter implements java.io.Closeable, java.io.Flushable {
    private static final java.lang.String[] HTML_SAFE_REPLACEMENT_CHARS;
    private java.lang.String deferredName;
    private java.lang.String formattedColon;
    private java.lang.String formattedComma;
    private com.google.gson.FormattingStyle formattingStyle;
    private boolean htmlSafe;
    private final java.io.Writer out;
    private boolean serializeNulls;
    private int[] stack = new int[32];
    private int stackSize = 0;
    private com.google.gson.Strictness strictness;
    private boolean usesEmptyNewlineAndIndent;
    private static final java.util.regex.Pattern VALID_JSON_NUMBER_PATTERN = java.util.regex.Pattern.compile("-?(?:0|[1-9][0-9]*)(?:\\.[0-9]+)?(?:[eE][-+]?[0-9]+)?");
    private static final java.lang.String[] REPLACEMENT_CHARS = new java.lang.String[128];

    static {
        for (int i = 0; i <= 31; i++) {
            REPLACEMENT_CHARS[i] = java.lang.String.format("\\u%04x", java.lang.Integer.valueOf(i));
        }
        java.lang.String[] strArr = REPLACEMENT_CHARS;
        strArr[34] = "\\\"";
        strArr[92] = "\\\\";
        strArr[9] = "\\t";
        strArr[8] = "\\b";
        strArr[10] = "\\n";
        strArr[13] = "\\r";
        strArr[12] = "\\f";
        java.lang.String[] strArr2 = (java.lang.String[]) strArr.clone();
        HTML_SAFE_REPLACEMENT_CHARS = strArr2;
        strArr2[60] = "\\u003c";
        strArr2[62] = "\\u003e";
        strArr2[38] = "\\u0026";
        strArr2[61] = "\\u003d";
        strArr2[39] = "\\u0027";
    }

    public JsonWriter(java.io.Writer writer) {
        push(6);
        this.strictness = com.google.gson.Strictness.LEGACY_STRICT;
        this.serializeNulls = true;
        this.out = (java.io.Writer) java.util.Objects.requireNonNull(writer, "out == null");
        setFormattingStyle(com.google.gson.FormattingStyle.COMPACT);
    }

    public final void setIndent(java.lang.String str) {
        if (str.isEmpty()) {
            setFormattingStyle(com.google.gson.FormattingStyle.COMPACT);
        } else {
            setFormattingStyle(com.google.gson.FormattingStyle.PRETTY.withIndent(str));
        }
    }

    public final void setFormattingStyle(com.google.gson.FormattingStyle formattingStyle) {
        com.google.gson.FormattingStyle formattingStyle2 = (com.google.gson.FormattingStyle) java.util.Objects.requireNonNull(formattingStyle);
        this.formattingStyle = formattingStyle2;
        this.formattedComma = ",";
        if (formattingStyle2.usesSpaceAfterSeparators()) {
            this.formattedColon = ": ";
            if (this.formattingStyle.getNewline().isEmpty()) {
                this.formattedComma = ", ";
            }
        } else {
            this.formattedColon = io.ktor.sse.ServerSentEventKt.COLON;
        }
        this.usesEmptyNewlineAndIndent = this.formattingStyle.getNewline().isEmpty() && this.formattingStyle.getIndent().isEmpty();
    }

    public final com.google.gson.FormattingStyle getFormattingStyle() {
        return this.formattingStyle;
    }

    @java.lang.Deprecated
    public final void setLenient(boolean z) {
        setStrictness(z ? com.google.gson.Strictness.LENIENT : com.google.gson.Strictness.LEGACY_STRICT);
    }

    public boolean isLenient() {
        return this.strictness == com.google.gson.Strictness.LENIENT;
    }

    public final void setStrictness(com.google.gson.Strictness strictness) {
        this.strictness = (com.google.gson.Strictness) java.util.Objects.requireNonNull(strictness);
    }

    public final com.google.gson.Strictness getStrictness() {
        return this.strictness;
    }

    public final void setHtmlSafe(boolean z) {
        this.htmlSafe = z;
    }

    public final boolean isHtmlSafe() {
        return this.htmlSafe;
    }

    public final void setSerializeNulls(boolean z) {
        this.serializeNulls = z;
    }

    public final boolean getSerializeNulls() {
        return this.serializeNulls;
    }

    public com.google.gson.stream.JsonWriter beginArray() throws java.io.IOException {
        writeDeferredName();
        return openScope(1, kotlinx.serialization.json.internal.AbstractJsonLexerKt.BEGIN_LIST);
    }

    public com.google.gson.stream.JsonWriter endArray() throws java.io.IOException {
        return closeScope(1, 2, kotlinx.serialization.json.internal.AbstractJsonLexerKt.END_LIST);
    }

    public com.google.gson.stream.JsonWriter beginObject() throws java.io.IOException {
        writeDeferredName();
        return openScope(3, kotlinx.serialization.json.internal.AbstractJsonLexerKt.BEGIN_OBJ);
    }

    public com.google.gson.stream.JsonWriter endObject() throws java.io.IOException {
        return closeScope(3, 5, kotlinx.serialization.json.internal.AbstractJsonLexerKt.END_OBJ);
    }

    private com.google.gson.stream.JsonWriter openScope(int i, char c) throws java.io.IOException {
        beforeValue();
        push(i);
        this.out.write(c);
        return this;
    }

    private com.google.gson.stream.JsonWriter closeScope(int i, int i2, char c) throws java.io.IOException {
        int peek = peek();
        if (peek != i2 && peek != i) {
            throw new java.lang.IllegalStateException("Nesting problem.");
        }
        if (this.deferredName != null) {
            java.lang.StringBuilder sb = new java.lang.StringBuilder("Dangling name: ");
            sb.append(this.deferredName);
            throw new java.lang.IllegalStateException(sb.toString());
        }
        this.stackSize--;
        if (peek == i2) {
            newline();
        }
        this.out.write(c);
        return this;
    }

    private void push(int i) {
        int i2 = this.stackSize;
        int[] iArr = this.stack;
        if (i2 == iArr.length) {
            this.stack = java.util.Arrays.copyOf(iArr, i2 * 2);
        }
        int[] iArr2 = this.stack;
        int i3 = this.stackSize;
        this.stackSize = i3 + 1;
        iArr2[i3] = i;
    }

    private int peek() {
        int i = this.stackSize;
        if (i == 0) {
            throw new java.lang.IllegalStateException("JsonWriter is closed.");
        }
        return this.stack[i - 1];
    }

    private void replaceTop(int i) {
        this.stack[this.stackSize - 1] = i;
    }

    public com.google.gson.stream.JsonWriter name(java.lang.String str) throws java.io.IOException {
        java.util.Objects.requireNonNull(str, "name == null");
        if (this.deferredName != null) {
            throw new java.lang.IllegalStateException("Already wrote a name, expecting a value.");
        }
        int peek = peek();
        if (peek != 3 && peek != 5) {
            throw new java.lang.IllegalStateException("Please begin an object before writing a name.");
        }
        this.deferredName = str;
        return this;
    }

    private void writeDeferredName() throws java.io.IOException {
        if (this.deferredName != null) {
            beforeName();
            string(this.deferredName);
            this.deferredName = null;
        }
    }

    public com.google.gson.stream.JsonWriter value(java.lang.String str) throws java.io.IOException {
        if (str == null) {
            return nullValue();
        }
        writeDeferredName();
        beforeValue();
        string(str);
        return this;
    }

    public com.google.gson.stream.JsonWriter value(boolean z) throws java.io.IOException {
        writeDeferredName();
        beforeValue();
        this.out.write(z ? "true" : "false");
        return this;
    }

    public com.google.gson.stream.JsonWriter value(java.lang.Boolean bool) throws java.io.IOException {
        if (bool == null) {
            return nullValue();
        }
        writeDeferredName();
        beforeValue();
        this.out.write(bool.booleanValue() ? "true" : "false");
        return this;
    }

    public com.google.gson.stream.JsonWriter value(float f) throws java.io.IOException {
        writeDeferredName();
        if (this.strictness != com.google.gson.Strictness.LENIENT && (java.lang.Float.isNaN(f) || java.lang.Float.isInfinite(f))) {
            throw new java.lang.IllegalArgumentException("Numeric values must be finite, but was ".concat(java.lang.String.valueOf(f)));
        }
        beforeValue();
        this.out.append((java.lang.CharSequence) java.lang.Float.toString(f));
        return this;
    }

    public com.google.gson.stream.JsonWriter value(double d) throws java.io.IOException {
        writeDeferredName();
        if (this.strictness != com.google.gson.Strictness.LENIENT && (java.lang.Double.isNaN(d) || java.lang.Double.isInfinite(d))) {
            throw new java.lang.IllegalArgumentException("Numeric values must be finite, but was ".concat(java.lang.String.valueOf(d)));
        }
        beforeValue();
        this.out.append((java.lang.CharSequence) java.lang.Double.toString(d));
        return this;
    }

    public com.google.gson.stream.JsonWriter value(long j) throws java.io.IOException {
        writeDeferredName();
        beforeValue();
        this.out.write(java.lang.Long.toString(j));
        return this;
    }

    public com.google.gson.stream.JsonWriter value(java.lang.Number number) throws java.io.IOException {
        if (number == null) {
            return nullValue();
        }
        writeDeferredName();
        java.lang.String obj = number.toString();
        java.lang.Class<?> cls = number.getClass();
        if (!alwaysCreatesValidJsonNumber(cls)) {
            if (obj.equals("-Infinity") || obj.equals("Infinity") || obj.equals("NaN")) {
                if (this.strictness != com.google.gson.Strictness.LENIENT) {
                    throw new java.lang.IllegalArgumentException("Numeric values must be finite, but was ".concat(java.lang.String.valueOf(obj)));
                }
            } else if (cls != java.lang.Float.class && cls != java.lang.Double.class && !VALID_JSON_NUMBER_PATTERN.matcher(obj).matches()) {
                java.lang.StringBuilder sb = new java.lang.StringBuilder("String created by ");
                sb.append(cls);
                sb.append(" is not a valid JSON number: ");
                sb.append(obj);
                throw new java.lang.IllegalArgumentException(sb.toString());
            }
        }
        beforeValue();
        this.out.append((java.lang.CharSequence) obj);
        return this;
    }

    public com.google.gson.stream.JsonWriter nullValue() throws java.io.IOException {
        if (this.deferredName != null) {
            if (this.serializeNulls) {
                writeDeferredName();
            } else {
                this.deferredName = null;
                return this;
            }
        }
        beforeValue();
        this.out.write("null");
        return this;
    }

    public com.google.gson.stream.JsonWriter jsonValue(java.lang.String str) throws java.io.IOException {
        if (str == null) {
            return nullValue();
        }
        writeDeferredName();
        beforeValue();
        this.out.append((java.lang.CharSequence) str);
        return this;
    }

    public void flush() throws java.io.IOException {
        if (this.stackSize == 0) {
            throw new java.lang.IllegalStateException("JsonWriter is closed.");
        }
        this.out.flush();
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() throws java.io.IOException {
        this.out.close();
        int i = this.stackSize;
        if (i > 1 || (i == 1 && this.stack[i - 1] != 7)) {
            throw new java.io.IOException("Incomplete document");
        }
        this.stackSize = 0;
    }

    private static boolean alwaysCreatesValidJsonNumber(java.lang.Class<? extends java.lang.Number> cls) {
        return cls == java.lang.Integer.class || cls == java.lang.Long.class || cls == java.lang.Byte.class || cls == java.lang.Short.class || cls == java.math.BigDecimal.class || cls == java.math.BigInteger.class || cls == java.util.concurrent.atomic.AtomicInteger.class || cls == java.util.concurrent.atomic.AtomicLong.class;
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0034  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private void string(java.lang.String str) throws java.io.IOException {
        int i;
        java.lang.String str2;
        java.lang.String[] strArr = this.htmlSafe ? HTML_SAFE_REPLACEMENT_CHARS : REPLACEMENT_CHARS;
        this.out.write(34);
        int length = str.length();
        int i2 = 0;
        while (i < length) {
            char charAt = str.charAt(i);
            if (charAt < 128) {
                str2 = strArr[charAt];
                i = str2 == null ? i + 1 : 0;
                if (i2 < i) {
                    this.out.write(str, i2, i - i2);
                }
                this.out.write(str2);
                i2 = i + 1;
            } else {
                if (charAt == 8232) {
                    str2 = "\\u2028";
                } else if (charAt == 8233) {
                    str2 = "\\u2029";
                }
                if (i2 < i) {
                }
                this.out.write(str2);
                i2 = i + 1;
            }
        }
        if (i2 < length) {
            this.out.write(str, i2, length - i2);
        }
        this.out.write(34);
    }

    private void newline() throws java.io.IOException {
        if (this.usesEmptyNewlineAndIndent) {
            return;
        }
        this.out.write(this.formattingStyle.getNewline());
        int i = this.stackSize;
        for (int i2 = 1; i2 < i; i2++) {
            this.out.write(this.formattingStyle.getIndent());
        }
    }

    private void beforeName() throws java.io.IOException {
        int peek = peek();
        if (peek == 5) {
            this.out.write(this.formattedComma);
        } else if (peek != 3) {
            throw new java.lang.IllegalStateException("Nesting problem.");
        }
        newline();
        replaceTop(4);
    }

    private void beforeValue() throws java.io.IOException {
        int peek = peek();
        if (peek == 1) {
            replaceTop(2);
            newline();
            return;
        }
        if (peek == 2) {
            this.out.append((java.lang.CharSequence) this.formattedComma);
            newline();
        } else {
            if (peek != 4) {
                if (peek != 6) {
                    if (peek == 7) {
                        if (this.strictness != com.google.gson.Strictness.LENIENT) {
                            throw new java.lang.IllegalStateException("JSON must have only one top-level value.");
                        }
                    } else {
                        throw new java.lang.IllegalStateException("Nesting problem.");
                    }
                }
                replaceTop(7);
                return;
            }
            this.out.append((java.lang.CharSequence) this.formattedColon);
            replaceTop(5);
        }
    }
}
