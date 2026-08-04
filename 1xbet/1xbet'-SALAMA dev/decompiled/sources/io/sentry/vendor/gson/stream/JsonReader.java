package io.sentry.vendor.gson.stream;

import java.io.Closeable;
import java.io.EOFException;
import java.io.IOException;
import java.io.Reader;
import java.util.Arrays;
import p136t.e;
import p150v0.a;

/* JADX INFO: loaded from: classes2.dex */
public class JsonReader implements Closeable {
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
    private final Reader in;
    private int[] pathIndices;
    private String[] pathNames;
    private long peekedLong;
    private int peekedNumberLength;
    private String peekedString;
    private int[] stack;
    private boolean lenient = false;
    private final char[] buffer = new char[1024];
    private int pos = 0;
    private int limit = 0;
    private int lineNumber = 0;
    private int lineStart = 0;
    int peeked = 0;
    private int stackSize = 1;

    public JsonReader(Reader reader) {
        int[] iArr = new int[32];
        this.stack = iArr;
        iArr[0] = 6;
        this.pathNames = new String[32];
        this.pathIndices = new int[32];
        if (reader == null) {
            throw new NullPointerException("in == null");
        }
        this.in = reader;
    }

    private void checkLenient() throws IOException {
        if (!this.lenient) {
            throw syntaxError("Use JsonReader.setLenient(true) to accept malformed JSON");
        }
    }

    private void consumeNonExecutePrefix() throws IOException {
        nextNonWhitespace(true);
        int i7 = this.pos;
        int i8 = i7 - 1;
        this.pos = i8;
        if (i7 + 4 <= this.limit || fillBuffer(5)) {
            char[] cArr = this.buffer;
            if (cArr[i8] == ')' && cArr[i7] == ']' && cArr[i7 + 1] == '}' && cArr[i7 + 2] == '\'' && cArr[i7 + 3] == '\n') {
                this.pos += 5;
            }
        }
    }

    private boolean fillBuffer(int i7) throws IOException {
        int i8;
        int i9;
        char[] cArr = this.buffer;
        int i10 = this.lineStart;
        int i11 = this.pos;
        this.lineStart = i10 - i11;
        int i12 = this.limit;
        if (i12 != i11) {
            int i13 = i12 - i11;
            this.limit = i13;
            System.arraycopy(cArr, i11, cArr, 0, i13);
        } else {
            this.limit = 0;
        }
        this.pos = 0;
        do {
            Reader reader = this.in;
            int i14 = this.limit;
            int i15 = reader.read(cArr, i14, cArr.length - i14);
            if (i15 == -1) {
                return false;
            }
            i8 = this.limit + i15;
            this.limit = i8;
            if (this.lineNumber == 0 && (i9 = this.lineStart) == 0 && i8 > 0 && cArr[0] == 65279) {
                this.pos++;
                this.lineStart = i9 + 1;
                i7++;
            }
        } while (i8 < i7);
        return true;
    }

    private boolean isLiteral(char c3) throws IOException {
        if (c3 == '\t' || c3 == '\n' || c3 == '\f' || c3 == '\r' || c3 == ' ') {
            return false;
        }
        if (c3 != '#') {
            if (c3 == ',') {
                return false;
            }
            if (c3 != '/' && c3 != '=') {
                if (c3 == '{' || c3 == '}' || c3 == ':') {
                    return false;
                }
                if (c3 != ';') {
                    switch (c3) {
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

    private int nextNonWhitespace(boolean z4) throws IOException {
        char[] cArr = this.buffer;
        int i7 = this.pos;
        int i8 = this.limit;
        while (true) {
            if (i7 == i8) {
                this.pos = i7;
                if (!fillBuffer(1)) {
                    if (!z4) {
                        return -1;
                    }
                    throw new EOFException("End of input" + locationString());
                }
                i7 = this.pos;
                i8 = this.limit;
            }
            int i9 = i7 + 1;
            char c3 = cArr[i7];
            if (c3 == '\n') {
                this.lineNumber++;
                this.lineStart = i9;
            } else if (c3 != ' ' && c3 != '\r' && c3 != '\t') {
                if (c3 == '/') {
                    this.pos = i9;
                    if (i9 == i8) {
                        this.pos = i7;
                        boolean zFillBuffer = fillBuffer(2);
                        this.pos++;
                        if (!zFillBuffer) {
                            return c3;
                        }
                    }
                    checkLenient();
                    int i10 = this.pos;
                    char c4 = cArr[i10];
                    if (c4 == '*') {
                        this.pos = i10 + 1;
                        if (!skipTo("*/")) {
                            throw syntaxError("Unterminated comment");
                        }
                        i7 = this.pos + 2;
                        i8 = this.limit;
                    } else {
                        if (c4 != '/') {
                            return c3;
                        }
                        this.pos = i10 + 1;
                        skipToEndOfLine();
                        i7 = this.pos;
                        i8 = this.limit;
                    }
                } else {
                    if (c3 != '#') {
                        this.pos = i9;
                        return c3;
                    }
                    this.pos = i9;
                    checkLenient();
                    skipToEndOfLine();
                    i7 = this.pos;
                    i8 = this.limit;
                }
            }
            i7 = i9;
        }
    }

    private String nextQuotedValue(char c3) throws IOException {
        int i7;
        char[] cArr = this.buffer;
        StringBuilder sb = null;
        do {
            int i8 = this.pos;
            int i9 = this.limit;
            while (true) {
                int i10 = i9;
                i7 = i8;
                while (true) {
                    if (i8 < i10) {
                        int i11 = i8 + 1;
                        char c4 = cArr[i8];
                        if (c4 == c3) {
                            this.pos = i11;
                            int i12 = (i11 - i7) - 1;
                            if (sb == null) {
                                return new String(cArr, i7, i12);
                            }
                            sb.append(cArr, i7, i12);
                            return sb.toString();
                        }
                        if (c4 == '\\') {
                            this.pos = i11;
                            int i13 = i11 - i7;
                            int i14 = i13 - 1;
                            if (sb == null) {
                                sb = new StringBuilder(Math.max(i13 * 2, 16));
                            }
                            sb.append(cArr, i7, i14);
                            sb.append(readEscapeCharacter());
                            i8 = this.pos;
                            i9 = this.limit;
                        } else {
                            if (c4 == '\n') {
                                this.lineNumber++;
                                this.lineStart = i11;
                            }
                            i8 = i11;
                        }
                    }
                }
            }
            if (sb == null) {
                sb = new StringBuilder(Math.max((i8 - i7) * 2, 16));
            }
            sb.append(cArr, i7, i8 - i7);
            this.pos = i8;
        } while (fillBuffer(1));
        throw syntaxError("Unterminated string");
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:32:0x0044. Please report as an issue. */
    private String nextUnquotedValue() throws IOException {
        String string;
        StringBuilder sb = null;
        int i7 = 0;
        while (true) {
            int i8 = 0;
            while (true) {
                int i9 = this.pos;
                if (i9 + i8 < this.limit) {
                    char c3 = this.buffer[i9 + i8];
                    if (c3 != '\t' && c3 != '\n' && c3 != '\f' && c3 != '\r' && c3 != ' ') {
                        if (c3 != '#') {
                            if (c3 != ',') {
                                if (c3 != '/' && c3 != '=') {
                                    if (c3 != '{' && c3 != '}' && c3 != ':') {
                                        if (c3 != ';') {
                                            switch (c3) {
                                                case '[':
                                                case ']':
                                                    break;
                                                case '\\':
                                                    break;
                                                default:
                                                    i8++;
                                                    break;
                                            }
                                        }
                                    }
                                }
                            }
                        }
                        checkLenient();
                    }
                    i7 = i8;
                } else if (i8 >= this.buffer.length) {
                    if (sb == null) {
                        sb = new StringBuilder(Math.max(i8, 16));
                    }
                    sb.append(this.buffer, this.pos, i8);
                    this.pos += i8;
                    if (!fillBuffer(1)) {
                    }
                } else if (!fillBuffer(i8 + 1)) {
                    i7 = i8;
                }
                if (sb == null) {
                    string = new String(this.buffer, this.pos, i7);
                } else {
                    sb.append(this.buffer, this.pos, i7);
                    string = sb.toString();
                }
                this.pos += i7;
                return string;
            }
        }
    }

    private int peekKeyword() {
        String str;
        String str2;
        int i7;
        char c3 = this.buffer[this.pos];
        if (c3 == 't' || c3 == 'T') {
            str = "true";
            str2 = "TRUE";
            i7 = 5;
        } else if (c3 == 'f' || c3 == 'F') {
            str = "false";
            str2 = "FALSE";
            i7 = 6;
        } else {
            if (c3 != 'n' && c3 != 'N') {
                return 0;
            }
            str = "null";
            str2 = "NULL";
            i7 = 7;
        }
        int length = str.length();
        for (int i8 = 1; i8 < length; i8++) {
            if (this.pos + i8 >= this.limit && !fillBuffer(i8 + 1)) {
                return 0;
            }
            char c4 = this.buffer[this.pos + i8];
            if (c4 != str.charAt(i8) && c4 != str2.charAt(i8)) {
                return 0;
            }
        }
        if ((this.pos + length < this.limit || fillBuffer(length + 1)) && isLiteral(this.buffer[this.pos + length])) {
            return 0;
        }
        this.pos += length;
        this.peeked = i7;
        return i7;
    }

    /* JADX WARN: Code duplicated, block: B:110:0x00f7 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:14:0x0030  */
    /* JADX WARN: Code duplicated, block: B:90:0x00e0  */
    /* JADX WARN: Code duplicated, block: B:92:0x00e5  */
    /* JADX WARN: Code duplicated, block: B:97:0x00ec  */
    private int peekNumber() {
        char c3;
        char c4;
        char[] cArr = this.buffer;
        int i7 = this.pos;
        int i8 = this.limit;
        int i9 = 0;
        int i10 = 0;
        char c7 = 0;
        boolean z4 = false;
        boolean z7 = true;
        long j = 0;
        while (true) {
            if (i7 + i10 != i8) {
                c3 = cArr[i7 + i10];
                if (c3 != '+') {
                    if (c3 != 'E' || c3 == 'e') {
                        i9 = 0;
                        if (c7 == 2 && c7 != 4) {
                            return 0;
                        }
                        c7 = 5;
                    } else if (c3 != '-') {
                        c4 = 3;
                        if (c3 == '.') {
                            i9 = 0;
                            if (c7 != 2) {
                                return 0;
                            }
                        } else {
                            if (c3 < '0' || c3 > '9') {
                                if (!isLiteral(c3)) {
                                    break;
                                }
                                return 0;
                            }
                            if (c7 == 1 || c7 == 0) {
                                j = -(c3 - '0');
                                c7 = 2;
                            } else if (c7 == 2) {
                                if (j == 0) {
                                    return 0;
                                }
                                long j3 = (10 * j) - ((long) (c3 - '0'));
                                z7 &= j > MIN_INCOMPLETE_INTEGER || (j == MIN_INCOMPLETE_INTEGER && j3 < j);
                                j = j3;
                            } else if (c7 == 3) {
                                i9 = 0;
                                c7 = 4;
                            } else if (c7 == 5 || c7 == 6) {
                                i9 = 0;
                                c7 = 7;
                            }
                            i9 = 0;
                        }
                    } else {
                        c4 = 6;
                        i9 = 0;
                        if (c7 == 0) {
                            c7 = 1;
                            z4 = true;
                        } else if (c7 != 5) {
                            return 0;
                        }
                    }
                    i10++;
                } else {
                    c4 = 6;
                    i9 = 0;
                    if (c7 != 5) {
                        return 0;
                    }
                }
                c7 = c4;
                i10++;
            } else {
                if (i10 == cArr.length) {
                    return i9;
                }
                if (!fillBuffer(i10 + 1)) {
                    break;
                }
                i7 = this.pos;
                i8 = this.limit;
                c3 = cArr[i7 + i10];
                if (c3 != '+') {
                    if (c3 != 'E') {
                        i9 = 0;
                        if (c7 == 2) {
                        }
                        c7 = 5;
                    } else {
                        i9 = 0;
                        if (c7 == 2) {
                        }
                        c7 = 5;
                    }
                    i10++;
                } else {
                    c4 = 6;
                    i9 = 0;
                    if (c7 != 5) {
                        return 0;
                    }
                }
                c7 = c4;
                i10++;
            }
        }
        if (c7 == 2 && z7 && ((j != Long.MIN_VALUE || z4) && (j != 0 || !z4))) {
            if (!z4) {
                j = -j;
            }
            this.peekedLong = j;
            this.pos += i10;
            this.peeked = 15;
            return 15;
        }
        if (c7 != 2 && c7 != 4 && c7 != 7) {
            return 0;
        }
        this.peekedNumberLength = i10;
        this.peeked = 16;
        return 16;
    }

    private void push(int i7) {
        int i8 = this.stackSize;
        int[] iArr = this.stack;
        if (i8 == iArr.length) {
            int i9 = i8 * 2;
            this.stack = Arrays.copyOf(iArr, i9);
            this.pathIndices = Arrays.copyOf(this.pathIndices, i9);
            this.pathNames = (String[]) Arrays.copyOf(this.pathNames, i9);
        }
        int[] iArr2 = this.stack;
        int i10 = this.stackSize;
        this.stackSize = i10 + 1;
        iArr2[i10] = i7;
    }

    private char readEscapeCharacter() throws IOException {
        int i7;
        if (this.pos == this.limit && !fillBuffer(1)) {
            throw syntaxError("Unterminated escape sequence");
        }
        char[] cArr = this.buffer;
        int i8 = this.pos;
        int i9 = i8 + 1;
        this.pos = i9;
        char c3 = cArr[i8];
        if (c3 == '\n') {
            this.lineNumber++;
            this.lineStart = i9;
        } else if (c3 != '\"' && c3 != '\'' && c3 != '/' && c3 != '\\') {
            if (c3 == 'b') {
                return '\b';
            }
            if (c3 == 'f') {
                return '\f';
            }
            if (c3 == 'n') {
                return '\n';
            }
            if (c3 == 'r') {
                return '\r';
            }
            if (c3 == 't') {
                return '\t';
            }
            if (c3 != 'u') {
                throw syntaxError("Invalid escape sequence");
            }
            if (i8 + 5 > this.limit && !fillBuffer(4)) {
                throw syntaxError("Unterminated escape sequence");
            }
            int i10 = this.pos;
            int i11 = i10 + 4;
            char c4 = 0;
            while (i10 < i11) {
                char c7 = this.buffer[i10];
                char c8 = (char) (c4 << 4);
                if (c7 >= '0' && c7 <= '9') {
                    i7 = c7 - '0';
                } else if (c7 >= 'a' && c7 <= 'f') {
                    i7 = c7 - 'W';
                } else {
                    if (c7 < 'A' || c7 > 'F') {
                        throw new NumberFormatException("\\u".concat(new String(this.buffer, this.pos, 4)));
                    }
                    i7 = c7 - '7';
                }
                c4 = (char) (i7 + c8);
                i10++;
            }
            this.pos += 4;
            return c4;
        }
        return c3;
    }

    private void skipQuotedValue(char c3) throws IOException {
        char[] cArr = this.buffer;
        do {
            int i7 = this.pos;
            int i8 = this.limit;
            while (i7 < i8) {
                int i9 = i7 + 1;
                char c4 = cArr[i7];
                if (c4 == c3) {
                    this.pos = i9;
                    return;
                }
                if (c4 == '\\') {
                    this.pos = i9;
                    readEscapeCharacter();
                    i7 = this.pos;
                    i8 = this.limit;
                } else {
                    if (c4 == '\n') {
                        this.lineNumber++;
                        this.lineStart = i9;
                    }
                    i7 = i9;
                }
            }
            this.pos = i7;
        } while (fillBuffer(1));
        throw syntaxError("Unterminated string");
    }

    private boolean skipTo(String str) {
        int length = str.length();
        while (true) {
            if (this.pos + length > this.limit && !fillBuffer(length)) {
                return false;
            }
            char[] cArr = this.buffer;
            int i7 = this.pos;
            if (cArr[i7] != '\n') {
                for (int i8 = 0; i8 < length; i8++) {
                    if (this.buffer[this.pos + i8] == str.charAt(i8)) {
                    }
                }
                return true;
            }
            this.lineNumber++;
            this.lineStart = i7 + 1;
            this.pos++;
        }
    }

    private void skipToEndOfLine() {
        char c3;
        do {
            if (this.pos >= this.limit && !fillBuffer(1)) {
                return;
            }
            char[] cArr = this.buffer;
            int i7 = this.pos;
            int i8 = i7 + 1;
            this.pos = i8;
            c3 = cArr[i7];
            if (c3 == '\n') {
                this.lineNumber++;
                this.lineStart = i8;
                return;
            }
        } while (c3 != '\r');
    }

    private void skipUnquotedValue() throws IOException {
        do {
            int i7 = 0;
            while (true) {
                int i8 = this.pos;
                if (i8 + i7 < this.limit) {
                    char c3 = this.buffer[i8 + i7];
                    if (c3 != '\t' && c3 != '\n' && c3 != '\f' && c3 != '\r' && c3 != ' ') {
                        if (c3 != '#') {
                            if (c3 != ',') {
                                if (c3 != '/' && c3 != '=') {
                                    if (c3 != '{' && c3 != '}' && c3 != ':') {
                                        if (c3 != ';') {
                                            switch (c3) {
                                                case '[':
                                                case ']':
                                                    break;
                                                case '\\':
                                                    break;
                                                default:
                                                    i7++;
                                                    break;
                                            }
                                            return;
                                        }
                                    }
                                }
                            }
                        }
                        checkLenient();
                    }
                    this.pos += i7;
                    return;
                }
                this.pos = i8 + i7;
            }
        } while (fillBuffer(1));
    }

    private IOException syntaxError(String str) throws MalformedJsonException {
        StringBuilder sbC = e.c(str);
        sbC.append(locationString());
        throw new MalformedJsonException(sbC.toString());
    }

    public void beginArray() throws IOException {
        int iDoPeek = this.peeked;
        if (iDoPeek == 0) {
            iDoPeek = doPeek();
        }
        if (iDoPeek == 3) {
            push(1);
            this.pathIndices[this.stackSize - 1] = 0;
            this.peeked = 0;
        } else {
            throw new IllegalStateException("Expected BEGIN_ARRAY but was " + peek() + locationString());
        }
    }

    public void beginObject() throws IOException {
        int iDoPeek = this.peeked;
        if (iDoPeek == 0) {
            iDoPeek = doPeek();
        }
        if (iDoPeek == 1) {
            push(3);
            this.peeked = 0;
        } else {
            throw new IllegalStateException("Expected BEGIN_OBJECT but was " + peek() + locationString());
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        this.peeked = 0;
        this.stack[0] = 8;
        this.stackSize = 1;
        this.in.close();
    }

    public int doPeek() throws IOException {
        int iNextNonWhitespace;
        int[] iArr = this.stack;
        int i7 = this.stackSize;
        int i8 = iArr[i7 - 1];
        if (i8 == 1) {
            iArr[i7 - 1] = 2;
        } else if (i8 == 2) {
            int iNextNonWhitespace2 = nextNonWhitespace(true);
            if (iNextNonWhitespace2 != 44) {
                if (iNextNonWhitespace2 != 59) {
                    if (iNextNonWhitespace2 != 93) {
                        throw syntaxError("Unterminated array");
                    }
                    this.peeked = 4;
                    return 4;
                }
                checkLenient();
            }
        } else {
            if (i8 == 3 || i8 == 5) {
                iArr[i7 - 1] = 4;
                if (i8 == 5 && (iNextNonWhitespace = nextNonWhitespace(true)) != 44) {
                    if (iNextNonWhitespace != 59) {
                        if (iNextNonWhitespace != 125) {
                            throw syntaxError("Unterminated object");
                        }
                        this.peeked = 2;
                        return 2;
                    }
                    checkLenient();
                }
                int iNextNonWhitespace3 = nextNonWhitespace(true);
                if (iNextNonWhitespace3 == 34) {
                    this.peeked = 13;
                    return 13;
                }
                if (iNextNonWhitespace3 == 39) {
                    checkLenient();
                    this.peeked = 12;
                    return 12;
                }
                if (iNextNonWhitespace3 == 125) {
                    if (i8 == 5) {
                        throw syntaxError("Expected name");
                    }
                    this.peeked = 2;
                    return 2;
                }
                checkLenient();
                this.pos--;
                if (!isLiteral((char) iNextNonWhitespace3)) {
                    throw syntaxError("Expected name");
                }
                this.peeked = 14;
                return 14;
            }
            if (i8 == 4) {
                iArr[i7 - 1] = 5;
                int iNextNonWhitespace4 = nextNonWhitespace(true);
                if (iNextNonWhitespace4 != 58) {
                    if (iNextNonWhitespace4 != 61) {
                        throw syntaxError("Expected ':'");
                    }
                    checkLenient();
                    if (this.pos < this.limit || fillBuffer(1)) {
                        char[] cArr = this.buffer;
                        int i9 = this.pos;
                        if (cArr[i9] == '>') {
                            this.pos = i9 + 1;
                        }
                    }
                }
            } else if (i8 == 6) {
                if (this.lenient) {
                    consumeNonExecutePrefix();
                }
                this.stack[this.stackSize - 1] = 7;
            } else if (i8 == 7) {
                if (nextNonWhitespace(false) == -1) {
                    this.peeked = 17;
                    return 17;
                }
                checkLenient();
                this.pos--;
            } else if (i8 == 8) {
                throw new IllegalStateException("JsonReader is closed");
            }
        }
        int iNextNonWhitespace5 = nextNonWhitespace(true);
        if (iNextNonWhitespace5 == 34) {
            this.peeked = 9;
            return 9;
        }
        if (iNextNonWhitespace5 == 39) {
            checkLenient();
            this.peeked = 8;
            return 8;
        }
        if (iNextNonWhitespace5 != 44 && iNextNonWhitespace5 != 59) {
            if (iNextNonWhitespace5 == 91) {
                this.peeked = 3;
                return 3;
            }
            if (iNextNonWhitespace5 != 93) {
                if (iNextNonWhitespace5 == 123) {
                    this.peeked = 1;
                    return 1;
                }
                this.pos--;
                int iPeekKeyword = peekKeyword();
                if (iPeekKeyword != 0) {
                    return iPeekKeyword;
                }
                int iPeekNumber = peekNumber();
                if (iPeekNumber != 0) {
                    return iPeekNumber;
                }
                if (!isLiteral(this.buffer[this.pos])) {
                    throw syntaxError("Expected value");
                }
                checkLenient();
                this.peeked = 10;
                return 10;
            }
            if (i8 == 1) {
                this.peeked = 4;
                return 4;
            }
        }
        if (i8 != 1 && i8 != 2) {
            throw syntaxError("Unexpected value");
        }
        checkLenient();
        this.pos--;
        this.peeked = 7;
        return 7;
    }

    public void endArray() throws IOException {
        int iDoPeek = this.peeked;
        if (iDoPeek == 0) {
            iDoPeek = doPeek();
        }
        if (iDoPeek != 4) {
            throw new IllegalStateException("Expected END_ARRAY but was " + peek() + locationString());
        }
        int i7 = this.stackSize;
        this.stackSize = i7 - 1;
        int[] iArr = this.pathIndices;
        int i8 = i7 - 2;
        iArr[i8] = iArr[i8] + 1;
        this.peeked = 0;
    }

    public void endObject() throws IOException {
        int iDoPeek = this.peeked;
        if (iDoPeek == 0) {
            iDoPeek = doPeek();
        }
        if (iDoPeek != 2) {
            throw new IllegalStateException("Expected END_OBJECT but was " + peek() + locationString());
        }
        int i7 = this.stackSize;
        int i8 = i7 - 1;
        this.stackSize = i8;
        this.pathNames[i8] = null;
        int[] iArr = this.pathIndices;
        int i9 = i7 - 2;
        iArr[i9] = iArr[i9] + 1;
        this.peeked = 0;
    }

    public String getPath() {
        StringBuilder sb = new StringBuilder("$");
        int i7 = this.stackSize;
        for (int i8 = 0; i8 < i7; i8++) {
            int i9 = this.stack[i8];
            if (i9 == 1 || i9 == 2) {
                sb.append('[');
                sb.append(this.pathIndices[i8]);
                sb.append(']');
            } else if (i9 == 3 || i9 == 4 || i9 == 5) {
                sb.append('.');
                String str = this.pathNames[i8];
                if (str != null) {
                    sb.append(str);
                }
            }
        }
        return sb.toString();
    }

    public boolean hasNext() throws IOException {
        int iDoPeek = this.peeked;
        if (iDoPeek == 0) {
            iDoPeek = doPeek();
        }
        return (iDoPeek == 2 || iDoPeek == 4) ? false : true;
    }

    public final boolean isLenient() {
        return this.lenient;
    }

    public String locationString() {
        StringBuilder sbG = a.g(" at line ", this.lineNumber + 1, " column ", (this.pos - this.lineStart) + 1, " path ");
        sbG.append(getPath());
        return sbG.toString();
    }

    public boolean nextBoolean() throws IOException {
        int iDoPeek = this.peeked;
        if (iDoPeek == 0) {
            iDoPeek = doPeek();
        }
        if (iDoPeek == 5) {
            this.peeked = 0;
            int[] iArr = this.pathIndices;
            int i7 = this.stackSize - 1;
            iArr[i7] = iArr[i7] + 1;
            return true;
        }
        if (iDoPeek != 6) {
            throw new IllegalStateException("Expected a boolean but was " + peek() + locationString());
        }
        this.peeked = 0;
        int[] iArr2 = this.pathIndices;
        int i8 = this.stackSize - 1;
        iArr2[i8] = iArr2[i8] + 1;
        return false;
    }

    public double nextDouble() throws IOException {
        int iDoPeek = this.peeked;
        if (iDoPeek == 0) {
            iDoPeek = doPeek();
        }
        if (iDoPeek == 15) {
            this.peeked = 0;
            int[] iArr = this.pathIndices;
            int i7 = this.stackSize - 1;
            iArr[i7] = iArr[i7] + 1;
            return this.peekedLong;
        }
        if (iDoPeek == 16) {
            this.peekedString = new String(this.buffer, this.pos, this.peekedNumberLength);
            this.pos += this.peekedNumberLength;
        } else if (iDoPeek == 8 || iDoPeek == 9) {
            this.peekedString = nextQuotedValue(iDoPeek == 8 ? '\'' : '\"');
        } else if (iDoPeek == 10) {
            this.peekedString = nextUnquotedValue();
        } else if (iDoPeek != 11) {
            throw new IllegalStateException("Expected a double but was " + peek() + locationString());
        }
        this.peeked = 11;
        double d7 = Double.parseDouble(this.peekedString);
        if (!this.lenient && (Double.isNaN(d7) || Double.isInfinite(d7))) {
            throw new MalformedJsonException("JSON forbids NaN and infinities: " + d7 + locationString());
        }
        this.peekedString = null;
        this.peeked = 0;
        int[] iArr2 = this.pathIndices;
        int i8 = this.stackSize - 1;
        iArr2[i8] = iArr2[i8] + 1;
        return d7;
    }

    public int nextInt() throws IOException {
        int iDoPeek = this.peeked;
        if (iDoPeek == 0) {
            iDoPeek = doPeek();
        }
        if (iDoPeek == 15) {
            long j = this.peekedLong;
            int i7 = (int) j;
            if (j != i7) {
                throw new NumberFormatException("Expected an int but was " + this.peekedLong + locationString());
            }
            this.peeked = 0;
            int[] iArr = this.pathIndices;
            int i8 = this.stackSize - 1;
            iArr[i8] = iArr[i8] + 1;
            return i7;
        }
        if (iDoPeek == 16) {
            this.peekedString = new String(this.buffer, this.pos, this.peekedNumberLength);
            this.pos += this.peekedNumberLength;
        } else {
            if (iDoPeek != 8 && iDoPeek != 9 && iDoPeek != 10) {
                throw new IllegalStateException("Expected an int but was " + peek() + locationString());
            }
            if (iDoPeek == 10) {
                this.peekedString = nextUnquotedValue();
            } else {
                this.peekedString = nextQuotedValue(iDoPeek == 8 ? '\'' : '\"');
            }
            try {
                int i9 = Integer.parseInt(this.peekedString);
                this.peeked = 0;
                int[] iArr2 = this.pathIndices;
                int i10 = this.stackSize - 1;
                iArr2[i10] = iArr2[i10] + 1;
                return i9;
            } catch (NumberFormatException unused) {
            }
        }
        this.peeked = 11;
        double d7 = Double.parseDouble(this.peekedString);
        int i11 = (int) d7;
        if (i11 != d7) {
            throw new NumberFormatException("Expected an int but was " + this.peekedString + locationString());
        }
        this.peekedString = null;
        this.peeked = 0;
        int[] iArr3 = this.pathIndices;
        int i12 = this.stackSize - 1;
        iArr3[i12] = iArr3[i12] + 1;
        return i11;
    }

    public long nextLong() throws IOException {
        int iDoPeek = this.peeked;
        if (iDoPeek == 0) {
            iDoPeek = doPeek();
        }
        if (iDoPeek == 15) {
            this.peeked = 0;
            int[] iArr = this.pathIndices;
            int i7 = this.stackSize - 1;
            iArr[i7] = iArr[i7] + 1;
            return this.peekedLong;
        }
        if (iDoPeek == 16) {
            this.peekedString = new String(this.buffer, this.pos, this.peekedNumberLength);
            this.pos += this.peekedNumberLength;
        } else {
            if (iDoPeek != 8 && iDoPeek != 9 && iDoPeek != 10) {
                throw new IllegalStateException("Expected a long but was " + peek() + locationString());
            }
            if (iDoPeek == 10) {
                this.peekedString = nextUnquotedValue();
            } else {
                this.peekedString = nextQuotedValue(iDoPeek == 8 ? '\'' : '\"');
            }
            try {
                long j = Long.parseLong(this.peekedString);
                this.peeked = 0;
                int[] iArr2 = this.pathIndices;
                int i8 = this.stackSize - 1;
                iArr2[i8] = iArr2[i8] + 1;
                return j;
            } catch (NumberFormatException unused) {
            }
        }
        this.peeked = 11;
        double d7 = Double.parseDouble(this.peekedString);
        long j3 = (long) d7;
        if (j3 != d7) {
            throw new NumberFormatException("Expected a long but was " + this.peekedString + locationString());
        }
        this.peekedString = null;
        this.peeked = 0;
        int[] iArr3 = this.pathIndices;
        int i9 = this.stackSize - 1;
        iArr3[i9] = iArr3[i9] + 1;
        return j3;
    }

    public String nextName() throws IOException {
        String strNextQuotedValue;
        int iDoPeek = this.peeked;
        if (iDoPeek == 0) {
            iDoPeek = doPeek();
        }
        if (iDoPeek == 14) {
            strNextQuotedValue = nextUnquotedValue();
        } else if (iDoPeek == 12) {
            strNextQuotedValue = nextQuotedValue('\'');
        } else {
            if (iDoPeek != 13) {
                throw new IllegalStateException("Expected a name but was " + peek() + locationString());
            }
            strNextQuotedValue = nextQuotedValue('\"');
        }
        this.peeked = 0;
        this.pathNames[this.stackSize - 1] = strNextQuotedValue;
        return strNextQuotedValue;
    }

    public void nextNull() throws IOException {
        int iDoPeek = this.peeked;
        if (iDoPeek == 0) {
            iDoPeek = doPeek();
        }
        if (iDoPeek != 7) {
            throw new IllegalStateException("Expected null but was " + peek() + locationString());
        }
        this.peeked = 0;
        int[] iArr = this.pathIndices;
        int i7 = this.stackSize - 1;
        iArr[i7] = iArr[i7] + 1;
    }

    public String nextString() throws IOException {
        String str;
        int iDoPeek = this.peeked;
        if (iDoPeek == 0) {
            iDoPeek = doPeek();
        }
        if (iDoPeek == 10) {
            str = nextUnquotedValue();
        } else if (iDoPeek == 8) {
            str = nextQuotedValue('\'');
        } else if (iDoPeek == 9) {
            str = nextQuotedValue('\"');
        } else if (iDoPeek == 11) {
            str = this.peekedString;
            this.peekedString = null;
        } else if (iDoPeek == 15) {
            str = Long.toString(this.peekedLong);
        } else {
            if (iDoPeek != 16) {
                throw new IllegalStateException("Expected a string but was " + peek() + locationString());
            }
            str = new String(this.buffer, this.pos, this.peekedNumberLength);
            this.pos += this.peekedNumberLength;
        }
        this.peeked = 0;
        int[] iArr = this.pathIndices;
        int i7 = this.stackSize - 1;
        iArr[i7] = iArr[i7] + 1;
        return str;
    }

    public JsonToken peek() throws IOException {
        int iDoPeek = this.peeked;
        if (iDoPeek == 0) {
            iDoPeek = doPeek();
        }
        switch (iDoPeek) {
            case 1:
                return JsonToken.BEGIN_OBJECT;
            case 2:
                return JsonToken.END_OBJECT;
            case 3:
                return JsonToken.BEGIN_ARRAY;
            case 4:
                return JsonToken.END_ARRAY;
            case 5:
            case 6:
                return JsonToken.BOOLEAN;
            case 7:
                return JsonToken.NULL;
            case 8:
            case 9:
            case 10:
            case 11:
                return JsonToken.STRING;
            case 12:
            case 13:
            case 14:
                return JsonToken.NAME;
            case 15:
            case 16:
                return JsonToken.NUMBER;
            case 17:
                return JsonToken.END_DOCUMENT;
            default:
                throw new AssertionError();
        }
    }

    public final void setLenient(boolean z4) {
        this.lenient = z4;
    }

    public void skipValue() throws IOException {
        int i7 = 0;
        do {
            int iDoPeek = this.peeked;
            if (iDoPeek == 0) {
                iDoPeek = doPeek();
            }
            if (iDoPeek == 3) {
                push(1);
            } else {
                if (iDoPeek == 1) {
                    push(3);
                } else if (iDoPeek == 4 || iDoPeek == 2) {
                    this.stackSize--;
                    i7--;
                } else if (iDoPeek == 14 || iDoPeek == 10) {
                    skipUnquotedValue();
                } else if (iDoPeek == 8 || iDoPeek == 12) {
                    skipQuotedValue('\'');
                } else if (iDoPeek == 9 || iDoPeek == 13) {
                    skipQuotedValue('\"');
                } else if (iDoPeek == 16) {
                    this.pos += this.peekedNumberLength;
                }
                this.peeked = 0;
            }
            i7++;
            this.peeked = 0;
        } while (i7 != 0);
        int[] iArr = this.pathIndices;
        int i8 = this.stackSize;
        int i9 = i8 - 1;
        iArr[i9] = iArr[i9] + 1;
        this.pathNames[i8 - 1] = "null";
    }

    public String toString() {
        return getClass().getSimpleName() + locationString();
    }
}
