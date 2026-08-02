package com.google.gson.stream;

/* loaded from: classes4.dex */
public class JsonReader implements java.io.Closeable {
    static final int BUFFER_SIZE = 1024;
    static final int DEFAULT_NESTING_LIMIT = 255;
    private static final long MIN_INCOMPLETE_INTEGER = -922337203685477580L;
    private static final int NUMBER_CHAR_DECIMAL = 3;
    private static final int NUMBER_CHAR_DIGIT = 2;
    private static final int NUMBER_CHAR_EXP_DIGIT = 7;
    private static final int NUMBER_CHAR_EXP_E = 5;
    private static final int NUMBER_CHAR_EXP_SIGN = 6;
    private static final int NUMBER_CHAR_FRACTION_DIGIT = 4;
    private static final int NUMBER_CHAR_NONE = 0;
    private static final int NUMBER_CHAR_SIGN = 1;
    private static final int PEEKED_BEGIN_ARRAY = 3;
    private static final int PEEKED_BEGIN_OBJECT = 1;
    private static final int PEEKED_BUFFERED = 11;
    private static final int PEEKED_DOUBLE_QUOTED = 9;
    private static final int PEEKED_DOUBLE_QUOTED_NAME = 13;
    private static final int PEEKED_END_ARRAY = 4;
    private static final int PEEKED_END_OBJECT = 2;
    private static final int PEEKED_EOF = 17;
    private static final int PEEKED_FALSE = 6;
    private static final int PEEKED_LONG = 15;
    private static final int PEEKED_NONE = 0;
    private static final int PEEKED_NULL = 7;
    private static final int PEEKED_NUMBER = 16;
    private static final int PEEKED_SINGLE_QUOTED = 8;
    private static final int PEEKED_SINGLE_QUOTED_NAME = 12;
    private static final int PEEKED_TRUE = 5;
    private static final int PEEKED_UNQUOTED = 10;
    private static final int PEEKED_UNQUOTED_NAME = 14;
    private final java.io.Reader in;
    private int[] pathIndices;
    private java.lang.String[] pathNames;
    private long peekedLong;
    private int peekedNumberLength;
    private java.lang.String peekedString;
    private int[] stack;
    private com.google.gson.Strictness strictness = com.google.gson.Strictness.LEGACY_STRICT;
    private int nestingLimit = 255;
    private final char[] buffer = new char[1024];
    private int pos = 0;
    private int limit = 0;
    private int lineNumber = 0;
    private int lineStart = 0;
    int peeked = 0;
    private int stackSize = 1;

    public JsonReader(java.io.Reader reader) {
        int[] iArr = new int[32];
        this.stack = iArr;
        iArr[0] = 6;
        this.pathNames = new java.lang.String[32];
        this.pathIndices = new int[32];
        this.in = (java.io.Reader) java.util.Objects.requireNonNull(reader, "in == null");
    }

    @java.lang.Deprecated
    public final void setLenient(boolean z) {
        setStrictness(z ? com.google.gson.Strictness.LENIENT : com.google.gson.Strictness.LEGACY_STRICT);
    }

    public final boolean isLenient() {
        return this.strictness == com.google.gson.Strictness.LENIENT;
    }

    public final void setStrictness(com.google.gson.Strictness strictness) {
        java.util.Objects.requireNonNull(strictness);
        this.strictness = strictness;
    }

    public final com.google.gson.Strictness getStrictness() {
        return this.strictness;
    }

    public final void setNestingLimit(int i) {
        if (i < 0) {
            throw new java.lang.IllegalArgumentException("Invalid nesting limit: ".concat(java.lang.String.valueOf(i)));
        }
        this.nestingLimit = i;
    }

    public final int getNestingLimit() {
        return this.nestingLimit;
    }

    public void beginArray() throws java.io.IOException {
        int i = this.peeked;
        if (i == 0) {
            i = doPeek();
        }
        if (i == 3) {
            push(1);
            this.pathIndices[this.stackSize - 1] = 0;
            this.peeked = 0;
            return;
        }
        throw unexpectedTokenError("BEGIN_ARRAY");
    }

    public void endArray() throws java.io.IOException {
        int i = this.peeked;
        if (i == 0) {
            i = doPeek();
        }
        if (i == 4) {
            int i2 = this.stackSize;
            this.stackSize = i2 - 1;
            int[] iArr = this.pathIndices;
            int i3 = i2 - 2;
            iArr[i3] = iArr[i3] + 1;
            this.peeked = 0;
            return;
        }
        throw unexpectedTokenError("END_ARRAY");
    }

    public void beginObject() throws java.io.IOException {
        int i = this.peeked;
        if (i == 0) {
            i = doPeek();
        }
        if (i == 1) {
            push(3);
            this.peeked = 0;
            return;
        }
        throw unexpectedTokenError("BEGIN_OBJECT");
    }

    public void endObject() throws java.io.IOException {
        int i = this.peeked;
        if (i == 0) {
            i = doPeek();
        }
        if (i == 2) {
            int i2 = this.stackSize;
            int i3 = i2 - 1;
            this.stackSize = i3;
            this.pathNames[i3] = null;
            int[] iArr = this.pathIndices;
            int i4 = i2 - 2;
            iArr[i4] = iArr[i4] + 1;
            this.peeked = 0;
            return;
        }
        throw unexpectedTokenError("END_OBJECT");
    }

    public boolean hasNext() throws java.io.IOException {
        int i = this.peeked;
        if (i == 0) {
            i = doPeek();
        }
        return (i == 2 || i == 4 || i == 17) ? false : true;
    }

    public com.google.gson.stream.JsonToken peek() throws java.io.IOException {
        int i = this.peeked;
        if (i == 0) {
            i = doPeek();
        }
        switch (i) {
            case 1:
                return com.google.gson.stream.JsonToken.BEGIN_OBJECT;
            case 2:
                return com.google.gson.stream.JsonToken.END_OBJECT;
            case 3:
                return com.google.gson.stream.JsonToken.BEGIN_ARRAY;
            case 4:
                return com.google.gson.stream.JsonToken.END_ARRAY;
            case 5:
            case 6:
                return com.google.gson.stream.JsonToken.BOOLEAN;
            case 7:
                return com.google.gson.stream.JsonToken.NULL;
            case 8:
            case 9:
            case 10:
            case 11:
                return com.google.gson.stream.JsonToken.STRING;
            case 12:
            case 13:
            case 14:
                return com.google.gson.stream.JsonToken.NAME;
            case 15:
            case 16:
                return com.google.gson.stream.JsonToken.NUMBER;
            case 17:
                return com.google.gson.stream.JsonToken.END_DOCUMENT;
            default:
                throw new java.lang.AssertionError();
        }
    }

    int doPeek() throws java.io.IOException {
        int nextNonWhitespace;
        int[] iArr = this.stack;
        int i = this.stackSize - 1;
        int i2 = iArr[i];
        if (i2 == 1) {
            iArr[i] = 2;
        } else if (i2 == 2) {
            int nextNonWhitespace2 = nextNonWhitespace(true);
            if (nextNonWhitespace2 != 44) {
                if (nextNonWhitespace2 != 59) {
                    if (nextNonWhitespace2 == 93) {
                        this.peeked = 4;
                        return 4;
                    }
                    throw syntaxError("Unterminated array");
                }
                checkLenient();
            }
        } else {
            if (i2 == 3 || i2 == 5) {
                iArr[i] = 4;
                if (i2 == 5 && (nextNonWhitespace = nextNonWhitespace(true)) != 44) {
                    if (nextNonWhitespace != 59) {
                        if (nextNonWhitespace == 125) {
                            this.peeked = 2;
                            return 2;
                        }
                        throw syntaxError("Unterminated object");
                    }
                    checkLenient();
                }
                int nextNonWhitespace3 = nextNonWhitespace(true);
                if (nextNonWhitespace3 == 34) {
                    this.peeked = 13;
                    return 13;
                }
                if (nextNonWhitespace3 == 39) {
                    checkLenient();
                    this.peeked = 12;
                    return 12;
                }
                if (nextNonWhitespace3 == 125) {
                    if (i2 != 5) {
                        this.peeked = 2;
                        return 2;
                    }
                    throw syntaxError("Expected name");
                }
                checkLenient();
                this.pos--;
                if (isLiteral((char) nextNonWhitespace3)) {
                    this.peeked = 14;
                    return 14;
                }
                throw syntaxError("Expected name");
            }
            if (i2 == 4) {
                iArr[i] = 5;
                int nextNonWhitespace4 = nextNonWhitespace(true);
                if (nextNonWhitespace4 != 58) {
                    if (nextNonWhitespace4 == 61) {
                        checkLenient();
                        if (this.pos < this.limit || fillBuffer(1)) {
                            char[] cArr = this.buffer;
                            int i3 = this.pos;
                            if (cArr[i3] == '>') {
                                this.pos = i3 + 1;
                            }
                        }
                    } else {
                        throw syntaxError("Expected ':'");
                    }
                }
            } else if (i2 == 6) {
                if (this.strictness == com.google.gson.Strictness.LENIENT) {
                    consumeNonExecutePrefix();
                }
                this.stack[this.stackSize - 1] = 7;
            } else if (i2 == 7) {
                if (nextNonWhitespace(false) == -1) {
                    this.peeked = 17;
                    return 17;
                }
                checkLenient();
                this.pos--;
            } else if (i2 == 8) {
                throw new java.lang.IllegalStateException("JsonReader is closed");
            }
        }
        int nextNonWhitespace5 = nextNonWhitespace(true);
        if (nextNonWhitespace5 == 34) {
            this.peeked = 9;
            return 9;
        }
        if (nextNonWhitespace5 == 39) {
            checkLenient();
            this.peeked = 8;
            return 8;
        }
        if (nextNonWhitespace5 != 44 && nextNonWhitespace5 != 59) {
            if (nextNonWhitespace5 == 91) {
                this.peeked = 3;
                return 3;
            }
            if (nextNonWhitespace5 != 93) {
                if (nextNonWhitespace5 == 123) {
                    this.peeked = 1;
                    return 1;
                }
                this.pos--;
                int peekKeyword = peekKeyword();
                if (peekKeyword != 0) {
                    return peekKeyword;
                }
                int peekNumber = peekNumber();
                if (peekNumber != 0) {
                    return peekNumber;
                }
                if (!isLiteral(this.buffer[this.pos])) {
                    throw syntaxError("Expected value");
                }
                checkLenient();
                this.peeked = 10;
                return 10;
            }
            if (i2 == 1) {
                this.peeked = 4;
                return 4;
            }
        }
        if (i2 == 1 || i2 == 2) {
            checkLenient();
            this.pos--;
            this.peeked = 7;
            return 7;
        }
        throw syntaxError("Unexpected value");
    }

    private int peekKeyword() throws java.io.IOException {
        java.lang.String str;
        java.lang.String str2;
        int i;
        char c = this.buffer[this.pos];
        if (c == 't' || c == 'T') {
            str = "true";
            str2 = "TRUE";
            i = 5;
        } else if (c == 'f' || c == 'F') {
            str = "false";
            str2 = "FALSE";
            i = 6;
        } else {
            if (c != 'n' && c != 'N') {
                return 0;
            }
            str = "null";
            str2 = "NULL";
            i = 7;
        }
        boolean z = this.strictness != com.google.gson.Strictness.STRICT;
        int length = str.length();
        for (int i2 = 0; i2 < length; i2++) {
            if (this.pos + i2 >= this.limit && !fillBuffer(i2 + 1)) {
                return 0;
            }
            char c2 = this.buffer[this.pos + i2];
            if (c2 != str.charAt(i2) && (!z || c2 != str2.charAt(i2))) {
                return 0;
            }
        }
        if ((this.pos + length < this.limit || fillBuffer(length + 1)) && isLiteral(this.buffer[this.pos + length])) {
            return 0;
        }
        this.pos += length;
        this.peeked = i;
        return i;
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x008c, code lost:
    
        if (r9 != 2) goto L62;
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x008e, code lost:
    
        if (r10 == false) goto L62;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x0094, code lost:
    
        if (r12 != Long.MIN_VALUE) goto L55;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x0096, code lost:
    
        if (r11 == false) goto L62;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x009c, code lost:
    
        if (r12 != 0) goto L58;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x009e, code lost:
    
        if (r11 != false) goto L62;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x00a0, code lost:
    
        if (r11 != false) goto L60;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x00a2, code lost:
    
        r12 = -r12;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x00a3, code lost:
    
        r18.peekedLong = r12;
        r18.pos += r8;
        r18.peeked = 15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x00ae, code lost:
    
        return 15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x00af, code lost:
    
        if (r9 == 2) goto L69;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x00b2, code lost:
    
        if (r9 == 4) goto L69;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x00b5, code lost:
    
        if (r9 == 7) goto L69;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x00b7, code lost:
    
        return 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x00b9, code lost:
    
        r18.peekedNumberLength = r8;
        r18.peeked = 16;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x00bf, code lost:
    
        return 16;
     */
    /* JADX WARN: Code restructure failed: missing block: B:74:0x008a, code lost:
    
        if (isLiteral(r14) != false) goto L71;
     */
    /* JADX WARN: Code restructure failed: missing block: B:75:0x00c0, code lost:
    
        return 0;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private int peekNumber() throws java.io.IOException {
        char c;
        int i;
        char[] cArr = this.buffer;
        int i2 = this.pos;
        int i3 = this.limit;
        int i4 = 0;
        int i5 = 0;
        char c2 = 0;
        boolean z = false;
        boolean z2 = true;
        long j = 0;
        while (true) {
            if (i2 + i5 == i3) {
                if (i5 != cArr.length) {
                    if (!fillBuffer(i5 + 1)) {
                        break;
                    }
                    i2 = this.pos;
                    i3 = this.limit;
                } else {
                    return i4;
                }
            }
            char c3 = cArr[i2 + i5];
            if (c3 != '+') {
                if (c3 == 'E' || c3 == 'e') {
                    i = 0;
                    if (c2 != 2 && c2 != 4) {
                        return 0;
                    }
                    c2 = 5;
                } else if (c3 == '-') {
                    c = 6;
                    i = 0;
                    if (c2 == 0) {
                        c2 = 1;
                        z = true;
                    } else if (c2 != 5) {
                        return 0;
                    }
                } else if (c3 == '.') {
                    i = 0;
                    if (c2 != 2) {
                        return 0;
                    }
                    c2 = 3;
                } else {
                    if (c3 < '0' || c3 > '9') {
                        break;
                    }
                    if (c2 == 1 || c2 == 0) {
                        j = -(c3 - '0');
                        c2 = 2;
                    } else if (c2 == 2) {
                        if (j == 0) {
                            return 0;
                        }
                        long j2 = (10 * j) - (c3 - '0');
                        z2 &= j > -922337203685477580L || (j == -922337203685477580L && j2 < j);
                        j = j2;
                    } else if (c2 == 3) {
                        c2 = 4;
                    } else if (c2 == 5 || c2 == 6) {
                        c2 = 7;
                    }
                    i = 0;
                }
                i5++;
                i4 = i;
            } else {
                c = 6;
                i = 0;
                if (c2 != 5) {
                    return 0;
                }
            }
            c2 = c;
            i5++;
            i4 = i;
        }
    }

    private boolean isLiteral(char c) throws java.io.IOException {
        if (c == '\t' || c == '\n' || c == '\f' || c == '\r' || c == ' ') {
            return false;
        }
        if (c != '#') {
            if (c == ',') {
                return false;
            }
            if (c != '/' && c != '=') {
                if (c == '{' || c == '}' || c == ':') {
                    return false;
                }
                if (c != ';') {
                    switch (c) {
                        case '[':
                        case ']':
                            return false;
                        case '\\':
                            break;
                        default:
                            return true;
                    }
                }
            }
        }
        checkLenient();
        return false;
    }

    public java.lang.String nextName() throws java.io.IOException {
        java.lang.String nextQuotedValue;
        int i = this.peeked;
        if (i == 0) {
            i = doPeek();
        }
        if (i == 14) {
            nextQuotedValue = nextUnquotedValue();
        } else if (i == 12) {
            nextQuotedValue = nextQuotedValue('\'');
        } else if (i == 13) {
            nextQuotedValue = nextQuotedValue('\"');
        } else {
            throw unexpectedTokenError("a name");
        }
        this.peeked = 0;
        this.pathNames[this.stackSize - 1] = nextQuotedValue;
        return nextQuotedValue;
    }

    public java.lang.String nextString() throws java.io.IOException {
        java.lang.String str;
        int i = this.peeked;
        if (i == 0) {
            i = doPeek();
        }
        if (i == 10) {
            str = nextUnquotedValue();
        } else if (i == 8) {
            str = nextQuotedValue('\'');
        } else if (i == 9) {
            str = nextQuotedValue('\"');
        } else if (i == 11) {
            str = this.peekedString;
            this.peekedString = null;
        } else if (i == 15) {
            str = java.lang.Long.toString(this.peekedLong);
        } else if (i == 16) {
            str = new java.lang.String(this.buffer, this.pos, this.peekedNumberLength);
            this.pos += this.peekedNumberLength;
        } else {
            throw unexpectedTokenError("a string");
        }
        this.peeked = 0;
        int[] iArr = this.pathIndices;
        int i2 = this.stackSize - 1;
        iArr[i2] = iArr[i2] + 1;
        return str;
    }

    public boolean nextBoolean() throws java.io.IOException {
        int i = this.peeked;
        if (i == 0) {
            i = doPeek();
        }
        if (i == 5) {
            this.peeked = 0;
            int[] iArr = this.pathIndices;
            int i2 = this.stackSize - 1;
            iArr[i2] = iArr[i2] + 1;
            return true;
        }
        if (i == 6) {
            this.peeked = 0;
            int[] iArr2 = this.pathIndices;
            int i3 = this.stackSize - 1;
            iArr2[i3] = iArr2[i3] + 1;
            return false;
        }
        throw unexpectedTokenError("a boolean");
    }

    public void nextNull() throws java.io.IOException {
        int i = this.peeked;
        if (i == 0) {
            i = doPeek();
        }
        if (i == 7) {
            this.peeked = 0;
            int[] iArr = this.pathIndices;
            int i2 = this.stackSize - 1;
            iArr[i2] = iArr[i2] + 1;
            return;
        }
        throw unexpectedTokenError("null");
    }

    public double nextDouble() throws java.io.IOException {
        int i = this.peeked;
        if (i == 0) {
            i = doPeek();
        }
        if (i == 15) {
            this.peeked = 0;
            int[] iArr = this.pathIndices;
            int i2 = this.stackSize - 1;
            iArr[i2] = iArr[i2] + 1;
            return this.peekedLong;
        }
        if (i == 16) {
            this.peekedString = new java.lang.String(this.buffer, this.pos, this.peekedNumberLength);
            this.pos += this.peekedNumberLength;
        } else if (i == 8 || i == 9) {
            this.peekedString = nextQuotedValue(i == 8 ? '\'' : '\"');
        } else if (i == 10) {
            this.peekedString = nextUnquotedValue();
        } else if (i != 11) {
            throw unexpectedTokenError("a double");
        }
        this.peeked = 11;
        double parseDouble = java.lang.Double.parseDouble(this.peekedString);
        if (this.strictness != com.google.gson.Strictness.LENIENT && (java.lang.Double.isNaN(parseDouble) || java.lang.Double.isInfinite(parseDouble))) {
            throw syntaxError("JSON forbids NaN and infinities: ".concat(java.lang.String.valueOf(parseDouble)));
        }
        this.peekedString = null;
        this.peeked = 0;
        int[] iArr2 = this.pathIndices;
        int i3 = this.stackSize - 1;
        iArr2[i3] = iArr2[i3] + 1;
        return parseDouble;
    }

    public long nextLong() throws java.io.IOException {
        int i = this.peeked;
        if (i == 0) {
            i = doPeek();
        }
        if (i == 15) {
            this.peeked = 0;
            int[] iArr = this.pathIndices;
            int i2 = this.stackSize - 1;
            iArr[i2] = iArr[i2] + 1;
            return this.peekedLong;
        }
        if (i == 16) {
            this.peekedString = new java.lang.String(this.buffer, this.pos, this.peekedNumberLength);
            this.pos += this.peekedNumberLength;
        } else if (i == 8 || i == 9 || i == 10) {
            if (i == 10) {
                this.peekedString = nextUnquotedValue();
            } else {
                this.peekedString = nextQuotedValue(i == 8 ? '\'' : '\"');
            }
            try {
                long parseLong = java.lang.Long.parseLong(this.peekedString);
                this.peeked = 0;
                int[] iArr2 = this.pathIndices;
                int i3 = this.stackSize - 1;
                iArr2[i3] = iArr2[i3] + 1;
                return parseLong;
            } catch (java.lang.NumberFormatException unused) {
            }
        } else {
            throw unexpectedTokenError("a long");
        }
        this.peeked = 11;
        double parseDouble = java.lang.Double.parseDouble(this.peekedString);
        long j = (long) parseDouble;
        if (j != parseDouble) {
            java.lang.StringBuilder sb = new java.lang.StringBuilder("Expected a long but was ");
            sb.append(this.peekedString);
            sb.append(locationString());
            throw new java.lang.NumberFormatException(sb.toString());
        }
        this.peekedString = null;
        this.peeked = 0;
        int[] iArr3 = this.pathIndices;
        int i4 = this.stackSize - 1;
        iArr3[i4] = iArr3[i4] + 1;
        return j;
    }

    /* JADX WARN: Code restructure failed: missing block: B:38:0x006b, code lost:
    
        if (r1 != null) goto L33;
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x006d, code lost:
    
        r1 = new java.lang.StringBuilder(java.lang.Math.max((r4 - r2) * 2, 16));
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x007a, code lost:
    
        r1.append(r0, r2, r4 - r2);
        r10.pos = r4;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private java.lang.String nextQuotedValue(char c) throws java.io.IOException {
        char[] cArr = this.buffer;
        java.lang.StringBuilder sb = null;
        do {
            int i = this.pos;
            int i2 = this.limit;
            while (true) {
                int i3 = i;
                while (i3 < i2) {
                    int i4 = i3 + 1;
                    char c2 = cArr[i3];
                    if (this.strictness == com.google.gson.Strictness.STRICT && c2 < ' ') {
                        throw syntaxError("Unescaped control characters (\\u0000-\\u001F) are not allowed in strict mode");
                    }
                    if (c2 == c) {
                        this.pos = i4;
                        int i5 = (i4 - i) - 1;
                        if (sb == null) {
                            return new java.lang.String(cArr, i, i5);
                        }
                        sb.append(cArr, i, i5);
                        return sb.toString();
                    }
                    if (c2 == '\\') {
                        this.pos = i4;
                        int i6 = i4 - i;
                        if (sb == null) {
                            sb = new java.lang.StringBuilder(java.lang.Math.max(i6 * 2, 16));
                        }
                        sb.append(cArr, i, i6 - 1);
                        sb.append(readEscapeCharacter());
                        i = this.pos;
                        i2 = this.limit;
                    } else {
                        if (c2 == '\n') {
                            this.lineNumber++;
                            this.lineStart = i4;
                        }
                        i3 = i4;
                    }
                }
                break;
            }
        } while (fillBuffer(1));
        throw syntaxError("Unterminated string");
    }

    /* JADX WARN: Code restructure failed: missing block: B:58:0x0048, code lost:
    
        checkLenient();
     */
    /* JADX WARN: Failed to find 'out' block for switch in B:54:0x0042. Please report as an issue. */
    /* JADX WARN: Removed duplicated region for block: B:13:0x007d  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0087  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private java.lang.String nextUnquotedValue() throws java.io.IOException {
        java.lang.String obj;
        java.lang.StringBuilder sb = null;
        do {
            int i = 0;
            int i2 = 0;
            while (true) {
                int i3 = this.pos + i2;
                if (i3 < this.limit) {
                    char c = this.buffer[i3];
                    if (c != '\t' && c != '\n' && c != '\f' && c != '\r' && c != ' ') {
                        if (c != '#') {
                            if (c != ',') {
                                if (c != '/' && c != '=') {
                                    if (c != '{' && c != '}' && c != ':') {
                                        if (c != ';') {
                                            switch (c) {
                                                case '[':
                                                case ']':
                                                    break;
                                                case '\\':
                                                    break;
                                                default:
                                                    i2++;
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                } else if (i2 < this.buffer.length) {
                    if (!fillBuffer(i2 + 1)) {
                    }
                } else {
                    if (sb == null) {
                        sb = new java.lang.StringBuilder(java.lang.Math.max(i2, 16));
                    }
                    sb.append(this.buffer, this.pos, i2);
                    this.pos += i2;
                }
            }
            i = i2;
            if (sb != null) {
                obj = new java.lang.String(this.buffer, this.pos, i);
            } else {
                sb.append(this.buffer, this.pos, i);
                obj = sb.toString();
            }
            this.pos += i;
            return obj;
        } while (fillBuffer(1));
        if (sb != null) {
        }
        this.pos += i;
        return obj;
    }

    private void skipQuotedValue(char c) throws java.io.IOException {
        char[] cArr = this.buffer;
        while (true) {
            int i = this.pos;
            int i2 = this.limit;
            while (true) {
                if (i < i2) {
                    int i3 = i + 1;
                    char c2 = cArr[i];
                    if (c2 == c) {
                        this.pos = i3;
                        return;
                    }
                    if (c2 == '\\') {
                        this.pos = i3;
                        readEscapeCharacter();
                        break;
                    } else {
                        if (c2 == '\n') {
                            this.lineNumber++;
                            this.lineStart = i3;
                        }
                        i = i3;
                    }
                } else {
                    this.pos = i;
                    if (!fillBuffer(1)) {
                        throw syntaxError("Unterminated string");
                    }
                }
            }
        }
    }

    private void skipUnquotedValue() throws java.io.IOException {
        do {
            int i = 0;
            while (true) {
                int i2 = this.pos + i;
                if (i2 < this.limit) {
                    char c = this.buffer[i2];
                    if (c != '\t' && c != '\n' && c != '\f' && c != '\r' && c != ' ') {
                        if (c != '#') {
                            if (c != ',') {
                                if (c != '/' && c != '=') {
                                    if (c != '{' && c != '}' && c != ':') {
                                        if (c != ';') {
                                            switch (c) {
                                                case '[':
                                                case ']':
                                                    break;
                                                case '\\':
                                                    break;
                                                default:
                                                    i++;
                                            }
                                            return;
                                        }
                                    }
                                }
                            }
                        }
                    }
                } else {
                    this.pos = i2;
                }
            }
            checkLenient();
            this.pos += i;
            return;
        } while (fillBuffer(1));
    }

    public int nextInt() throws java.io.IOException {
        int i = this.peeked;
        if (i == 0) {
            i = doPeek();
        }
        if (i == 15) {
            long j = this.peekedLong;
            int i2 = (int) j;
            if (j != i2) {
                java.lang.StringBuilder sb = new java.lang.StringBuilder("Expected an int but was ");
                sb.append(this.peekedLong);
                sb.append(locationString());
                throw new java.lang.NumberFormatException(sb.toString());
            }
            this.peeked = 0;
            int[] iArr = this.pathIndices;
            int i3 = this.stackSize - 1;
            iArr[i3] = iArr[i3] + 1;
            return i2;
        }
        if (i == 16) {
            this.peekedString = new java.lang.String(this.buffer, this.pos, this.peekedNumberLength);
            this.pos += this.peekedNumberLength;
        } else if (i == 8 || i == 9 || i == 10) {
            if (i == 10) {
                this.peekedString = nextUnquotedValue();
            } else {
                this.peekedString = nextQuotedValue(i == 8 ? '\'' : '\"');
            }
            try {
                int parseInt = java.lang.Integer.parseInt(this.peekedString);
                this.peeked = 0;
                int[] iArr2 = this.pathIndices;
                int i4 = this.stackSize - 1;
                iArr2[i4] = iArr2[i4] + 1;
                return parseInt;
            } catch (java.lang.NumberFormatException unused) {
            }
        } else {
            throw unexpectedTokenError("an int");
        }
        this.peeked = 11;
        double parseDouble = java.lang.Double.parseDouble(this.peekedString);
        int i5 = (int) parseDouble;
        if (i5 != parseDouble) {
            java.lang.StringBuilder sb2 = new java.lang.StringBuilder("Expected an int but was ");
            sb2.append(this.peekedString);
            sb2.append(locationString());
            throw new java.lang.NumberFormatException(sb2.toString());
        }
        this.peekedString = null;
        this.peeked = 0;
        int[] iArr3 = this.pathIndices;
        int i6 = this.stackSize - 1;
        iArr3[i6] = iArr3[i6] + 1;
        return i5;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() throws java.io.IOException {
        this.peeked = 0;
        this.stack[0] = 8;
        this.stackSize = 1;
        this.in.close();
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    public void skipValue() throws java.io.IOException {
        int i = 0;
        do {
            int i2 = this.peeked;
            if (i2 == 0) {
                i2 = doPeek();
            }
            switch (i2) {
                case 1:
                    push(3);
                    i++;
                    this.peeked = 0;
                    break;
                case 2:
                    if (i == 0) {
                        this.pathNames[this.stackSize - 1] = null;
                    }
                    this.stackSize--;
                    i--;
                    this.peeked = 0;
                    break;
                case 3:
                    push(1);
                    i++;
                    this.peeked = 0;
                    break;
                case 4:
                    this.stackSize--;
                    i--;
                    this.peeked = 0;
                    break;
                case 5:
                case 6:
                case 7:
                case 11:
                case 15:
                default:
                    this.peeked = 0;
                    break;
                case 8:
                    skipQuotedValue('\'');
                    this.peeked = 0;
                    break;
                case 9:
                    skipQuotedValue('\"');
                    this.peeked = 0;
                    break;
                case 10:
                    skipUnquotedValue();
                    this.peeked = 0;
                    break;
                case 12:
                    skipQuotedValue('\'');
                    if (i == 0) {
                        this.pathNames[this.stackSize - 1] = "<skipped>";
                    }
                    this.peeked = 0;
                    break;
                case 13:
                    skipQuotedValue('\"');
                    if (i == 0) {
                        this.pathNames[this.stackSize - 1] = "<skipped>";
                    }
                    this.peeked = 0;
                    break;
                case 14:
                    skipUnquotedValue();
                    if (i == 0) {
                        this.pathNames[this.stackSize - 1] = "<skipped>";
                    }
                    this.peeked = 0;
                    break;
                case 16:
                    this.pos += this.peekedNumberLength;
                    this.peeked = 0;
                    break;
                case 17:
                    break;
            }
            return;
        } while (i > 0);
        int[] iArr = this.pathIndices;
        int i3 = this.stackSize - 1;
        iArr[i3] = iArr[i3] + 1;
    }

    private void push(int i) throws com.google.gson.stream.MalformedJsonException {
        int i2 = this.stackSize;
        if (i2 - 1 >= this.nestingLimit) {
            java.lang.StringBuilder sb = new java.lang.StringBuilder("Nesting limit ");
            sb.append(this.nestingLimit);
            sb.append(" reached");
            sb.append(locationString());
            throw new com.google.gson.stream.MalformedJsonException(sb.toString());
        }
        int[] iArr = this.stack;
        if (i2 == iArr.length) {
            int i3 = i2 * 2;
            this.stack = java.util.Arrays.copyOf(iArr, i3);
            this.pathIndices = java.util.Arrays.copyOf(this.pathIndices, i3);
            this.pathNames = (java.lang.String[]) java.util.Arrays.copyOf(this.pathNames, i3);
        }
        int[] iArr2 = this.stack;
        int i4 = this.stackSize;
        this.stackSize = i4 + 1;
        iArr2[i4] = i;
    }

    private boolean fillBuffer(int i) throws java.io.IOException {
        int i2;
        int i3;
        char[] cArr = this.buffer;
        int i4 = this.lineStart;
        int i5 = this.pos;
        this.lineStart = i4 - i5;
        int i6 = this.limit;
        if (i6 != i5) {
            int i7 = i6 - i5;
            this.limit = i7;
            java.lang.System.arraycopy(cArr, i5, cArr, 0, i7);
        } else {
            this.limit = 0;
        }
        this.pos = 0;
        do {
            java.io.Reader reader = this.in;
            int i8 = this.limit;
            int read = reader.read(cArr, i8, cArr.length - i8);
            if (read == -1) {
                return false;
            }
            i2 = this.limit + read;
            this.limit = i2;
            if (this.lineNumber == 0 && (i3 = this.lineStart) == 0 && i2 > 0 && cArr[0] == 65279) {
                this.pos++;
                this.lineStart = i3 + 1;
                i++;
            }
        } while (i2 < i);
        return true;
    }

    private int nextNonWhitespace(boolean z) throws java.io.IOException {
        char c;
        char[] cArr = this.buffer;
        int i = this.pos;
        int i2 = this.limit;
        while (true) {
            if (i == i2) {
                this.pos = i;
                if (!fillBuffer(1)) {
                    if (!z) {
                        return -1;
                    }
                    java.lang.StringBuilder sb = new java.lang.StringBuilder("End of input");
                    sb.append(locationString());
                    throw new java.io.EOFException(sb.toString());
                }
                i = this.pos;
                i2 = this.limit;
            }
            int i3 = i + 1;
            c = cArr[i];
            if (c == '\n') {
                this.lineNumber++;
                this.lineStart = i3;
            } else if (c != ' ' && c != '\r' && c != '\t') {
                if (c == '/') {
                    this.pos = i3;
                    if (i3 == i2) {
                        this.pos = i;
                        boolean fillBuffer = fillBuffer(2);
                        this.pos++;
                        if (!fillBuffer) {
                            break;
                        }
                    }
                    checkLenient();
                    int i4 = this.pos;
                    char c2 = cArr[i4];
                    if (c2 == '*') {
                        this.pos = i4 + 1;
                        if (!skipTo("*/")) {
                            throw syntaxError("Unterminated comment");
                        }
                        i = this.pos + 2;
                        i2 = this.limit;
                    } else {
                        if (c2 != '/') {
                            break;
                        }
                        this.pos = i4 + 1;
                        skipToEndOfLine();
                        i = this.pos;
                        i2 = this.limit;
                    }
                } else if (c == '#') {
                    this.pos = i3;
                    checkLenient();
                    skipToEndOfLine();
                    i = this.pos;
                    i2 = this.limit;
                } else {
                    this.pos = i3;
                    return c;
                }
            }
            i = i3;
        }
        return c;
    }

    private void checkLenient() throws com.google.gson.stream.MalformedJsonException {
        if (this.strictness != com.google.gson.Strictness.LENIENT) {
            throw syntaxError("Use JsonReader.setStrictness(Strictness.LENIENT) to accept malformed JSON");
        }
    }

    private void skipToEndOfLine() throws java.io.IOException {
        char c;
        do {
            if (this.pos >= this.limit && !fillBuffer(1)) {
                return;
            }
            char[] cArr = this.buffer;
            int i = this.pos;
            int i2 = i + 1;
            this.pos = i2;
            c = cArr[i];
            if (c == '\n') {
                this.lineNumber++;
                this.lineStart = i2;
                return;
            }
        } while (c != '\r');
    }

    private boolean skipTo(java.lang.String str) throws java.io.IOException {
        int length = str.length();
        while (true) {
            if (this.pos + length > this.limit && !fillBuffer(length)) {
                return false;
            }
            char[] cArr = this.buffer;
            int i = this.pos;
            if (cArr[i] != '\n') {
                for (int i2 = 0; i2 < length; i2++) {
                    if (this.buffer[this.pos + i2] != str.charAt(i2)) {
                        break;
                    }
                }
                return true;
            }
            this.lineNumber++;
            this.lineStart = i + 1;
            this.pos++;
        }
    }

    public java.lang.String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(locationString());
        return sb.toString();
    }

    java.lang.String locationString() {
        int i = this.lineNumber;
        int i2 = this.pos;
        int i3 = this.lineStart;
        java.lang.StringBuilder sb = new java.lang.StringBuilder(" at line ");
        sb.append(i + 1);
        sb.append(" column ");
        sb.append((i2 - i3) + 1);
        sb.append(" path ");
        sb.append(getPath());
        return sb.toString();
    }

    private java.lang.String getPath(boolean z) {
        java.lang.StringBuilder sb = new java.lang.StringBuilder(com.paypal.oslo.feature.savings.constants.SavingsConstants.Currency.SYMBOL_USD);
        int i = 0;
        while (true) {
            int i2 = this.stackSize;
            if (i < i2) {
                int i3 = this.stack[i];
                switch (i3) {
                    case 1:
                    case 2:
                        int i4 = this.pathIndices[i];
                        if (z && i4 > 0 && i == i2 - 1) {
                            i4--;
                        }
                        sb.append(kotlinx.serialization.json.internal.AbstractJsonLexerKt.BEGIN_LIST);
                        sb.append(i4);
                        sb.append(kotlinx.serialization.json.internal.AbstractJsonLexerKt.END_LIST);
                        break;
                    case 3:
                    case 4:
                    case 5:
                        sb.append(com.paypal.oslo.core.money.MoneyKt.DECIMALSEPARATOR);
                        java.lang.String str = this.pathNames[i];
                        if (str == null) {
                            break;
                        } else {
                            sb.append(str);
                            break;
                        }
                    case 6:
                    case 7:
                    case 8:
                        break;
                    default:
                        throw new java.lang.AssertionError("Unknown scope value: ".concat(java.lang.String.valueOf(i3)));
                }
                i++;
            } else {
                return sb.toString();
            }
        }
    }

    public java.lang.String getPath() {
        return getPath(false);
    }

    public java.lang.String getPreviousPath() {
        return getPath(true);
    }

    private char readEscapeCharacter() throws java.io.IOException {
        int i;
        if (this.pos == this.limit && !fillBuffer(1)) {
            throw syntaxError("Unterminated escape sequence");
        }
        char[] cArr = this.buffer;
        int i2 = this.pos;
        this.pos = i2 + 1;
        char c = cArr[i2];
        if (c != '\n') {
            if (c != '\"') {
                if (c != '\'') {
                    if (c != '/' && c != '\\') {
                        if (c == 'b') {
                            return '\b';
                        }
                        if (c == 'f') {
                            return '\f';
                        }
                        if (c == 'n') {
                            return '\n';
                        }
                        if (c == 'r') {
                            return '\r';
                        }
                        if (c == 't') {
                            return '\t';
                        }
                        if (c == 'u') {
                            if (i2 + 5 > this.limit && !fillBuffer(4)) {
                                throw syntaxError("Unterminated escape sequence");
                            }
                            int i3 = this.pos;
                            int i4 = 0;
                            for (int i5 = i3; i5 < i3 + 4; i5++) {
                                char[] cArr2 = this.buffer;
                                char c2 = cArr2[i5];
                                if (c2 >= '0' && c2 <= '9') {
                                    i = c2 - '0';
                                } else if (c2 >= 'a' && c2 <= 'f') {
                                    i = c2 - 'W';
                                } else {
                                    if (c2 < 'A' || c2 > 'F') {
                                        throw syntaxError("Malformed Unicode escape \\u".concat(new java.lang.String(cArr2, this.pos, 4)));
                                    }
                                    i = c2 - '7';
                                }
                                i4 = (i4 << 4) + i;
                            }
                            this.pos += 4;
                            return (char) i4;
                        }
                        throw syntaxError("Invalid escape sequence");
                    }
                }
            }
            return c;
        }
        if (this.strictness == com.google.gson.Strictness.STRICT) {
            throw syntaxError("Cannot escape a newline character in strict mode");
        }
        this.lineNumber++;
        this.lineStart = this.pos;
        if (this.strictness == com.google.gson.Strictness.STRICT) {
            throw syntaxError("Invalid escaped character \"'\" in strict mode");
        }
        return c;
    }

    private com.google.gson.stream.MalformedJsonException syntaxError(java.lang.String str) throws com.google.gson.stream.MalformedJsonException {
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append(str);
        sb.append(locationString());
        sb.append("\nSee ");
        sb.append(com.google.gson.internal.TroubleshootingGuide.createUrl("malformed-json"));
        throw new com.google.gson.stream.MalformedJsonException(sb.toString());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public java.lang.IllegalStateException unexpectedTokenError(java.lang.String str) throws java.io.IOException {
        java.lang.String str2 = peek() == com.google.gson.stream.JsonToken.NULL ? "adapter-not-null-safe" : "unexpected-json-structure";
        java.lang.StringBuilder sb = new java.lang.StringBuilder("Expected ");
        sb.append(str);
        sb.append(" but was ");
        sb.append(peek());
        sb.append(locationString());
        sb.append("\nSee ");
        sb.append(com.google.gson.internal.TroubleshootingGuide.createUrl(str2));
        return new java.lang.IllegalStateException(sb.toString());
    }

    private void consumeNonExecutePrefix() throws java.io.IOException {
        nextNonWhitespace(true);
        int i = this.pos;
        this.pos = i - 1;
        if (i + 4 <= this.limit || fillBuffer(5)) {
            int i2 = this.pos;
            char[] cArr = this.buffer;
            if (cArr[i2] == ')' && cArr[i2 + 1] == ']' && cArr[i2 + 2] == '}' && cArr[i2 + 3] == '\'' && cArr[i2 + 4] == '\n') {
                this.pos = i2 + 5;
            }
        }
    }

    static {
        com.google.gson.internal.JsonReaderInternalAccess.INSTANCE = new com.google.gson.internal.JsonReaderInternalAccess() { // from class: com.google.gson.stream.JsonReader.1
            @Override // com.google.gson.internal.JsonReaderInternalAccess
            public void promoteNameToValue(com.google.gson.stream.JsonReader jsonReader) throws java.io.IOException {
                if (jsonReader instanceof com.google.gson.internal.bind.JsonTreeReader) {
                    ((com.google.gson.internal.bind.JsonTreeReader) jsonReader).promoteNameToValue();
                    return;
                }
                int i = jsonReader.peeked;
                if (i == 0) {
                    i = jsonReader.doPeek();
                }
                if (i == 13) {
                    jsonReader.peeked = 9;
                } else if (i == 12) {
                    jsonReader.peeked = 8;
                } else {
                    if (i != 14) {
                        throw jsonReader.unexpectedTokenError("a name");
                    }
                    jsonReader.peeked = 10;
                }
            }
        };
    }
}
