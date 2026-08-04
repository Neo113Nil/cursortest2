package Z4;

import java.io.Closeable;
import java.io.EOFException;
import java.io.IOException;
import java.io.StringReader;
import java.util.Arrays;
import p136t.e;

/* JADX INFO: loaded from: classes2.dex */
public final class a implements Closeable {

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    public String f7853A;

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    public int[] f7854B;

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    public String[] f7856D;

    /* JADX INFO: renamed from: E, reason: collision with root package name */
    public int[] f7857E;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final StringReader f7858a;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public long f7865y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public int f7866z;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final char[] f7859b = new char[1024];

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f7860c = 0;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f7861d = 0;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f7862e = 0;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f7863f = 0;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public int f7864x = 0;

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    public int f7855C = 1;

    public a(StringReader stringReader) {
        int[] iArr = new int[32];
        this.f7854B = iArr;
        iArr[0] = 6;
        this.f7856D = new String[32];
        this.f7857E = new int[32];
        this.f7858a = stringReader;
    }

    public final void a() throws b {
        n("Use JsonReader.setLenient(true) to accept malformed JSON");
        throw null;
    }

    /* JADX WARN: Code duplicated, block: B:101:0x0138  */
    /* JADX WARN: Code duplicated, block: B:102:0x013c A[PHI: r1 r4
      0x013c: PHI (r1v46 int) = (r1v45 int), (r1v62 int) binds: [B:94:0x0126, B:101:0x0138] A[DONT_GENERATE, DONT_INLINE]
      0x013c: PHI (r4v7 int) = (r4v6 int), (r4v18 int) binds: [B:94:0x0126, B:101:0x0138] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:104:0x0144  */
    /* JADX WARN: Code duplicated, block: B:106:0x0148  */
    /* JADX WARN: Code duplicated, block: B:148:0x01b2 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:159:0x01d2 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:160:0x01d4  */
    /* JADX WARN: Code duplicated, block: B:174:0x01f8  */
    /* JADX WARN: Code duplicated, block: B:176:0x01ff  */
    /* JADX WARN: Code duplicated, block: B:179:0x0204  */
    /* JADX WARN: Code duplicated, block: B:181:0x020a  */
    /* JADX WARN: Code duplicated, block: B:184:0x0215 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:185:0x0216  */
    /* JADX WARN: Code duplicated, block: B:187:0x0220  */
    /* JADX WARN: Code duplicated, block: B:189:0x0227  */
    /* JADX WARN: Code duplicated, block: B:245:0x012b A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:246:0x012b A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:247:0x01b0 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:91:0x0117 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:92:0x0118  */
    /* JADX WARN: Code duplicated, block: B:95:0x0128  */
    /* JADX WARN: Code duplicated, block: B:98:0x012e  */
    public final int b() throws IOException {
        int iG;
        int i7;
        String str;
        String str2;
        int i8;
        char c3;
        int i9;
        int i10;
        int i11;
        char c4;
        char c7;
        int i12;
        int i13;
        int[] iArr = this.f7854B;
        boolean z4 = true;
        int i14 = this.f7855C - 1;
        int i15 = iArr[i14];
        if (i15 == 1) {
            iArr[i14] = 2;
        } else if (i15 == 2) {
            int iG2 = g(true);
            if (iG2 != 44) {
                if (iG2 == 59) {
                    a();
                    throw null;
                }
                if (iG2 == 93) {
                    this.f7864x = 4;
                    return 4;
                }
                n("Unterminated array");
                throw null;
            }
        } else {
            if (i15 == 3 || i15 == 5) {
                iArr[i14] = 4;
                if (i15 == 5 && (iG = g(true)) != 44) {
                    if (iG == 59) {
                        a();
                        throw null;
                    }
                    if (iG == 125) {
                        this.f7864x = 2;
                        return 2;
                    }
                    n("Unterminated object");
                    throw null;
                }
                int iG3 = g(true);
                if (iG3 == 34) {
                    this.f7864x = 13;
                    return 13;
                }
                if (iG3 == 39) {
                    a();
                    throw null;
                }
                if (iG3 != 125) {
                    a();
                    throw null;
                }
                if (i15 != 5) {
                    this.f7864x = 2;
                    return 2;
                }
                n("Expected name");
                throw null;
            }
            if (i15 == 4) {
                iArr[i14] = 5;
                int iG4 = g(true);
                if (iG4 != 58) {
                    if (iG4 != 61) {
                        n("Expected ':'");
                        throw null;
                    }
                    a();
                    throw null;
                }
            } else if (i15 == 6) {
                iArr[i14] = 7;
            } else {
                if (i15 == 7) {
                    if (g(false) == -1) {
                        this.f7864x = 17;
                        return 17;
                    }
                    a();
                    throw null;
                }
                if (i15 == 8) {
                    throw new IllegalStateException("JsonReader is closed");
                }
            }
        }
        int iG5 = g(true);
        if (iG5 == 34) {
            this.f7864x = 9;
            return 9;
        }
        if (iG5 == 39) {
            a();
            throw null;
        }
        if (iG5 == 44 || iG5 == 59) {
            i7 = 1;
        } else {
            if (iG5 == 91) {
                this.f7864x = 3;
                return 3;
            }
            if (iG5 != 93) {
                if (iG5 == 123) {
                    this.f7864x = 1;
                    return 1;
                }
                int i16 = this.f7860c - 1;
                this.f7860c = i16;
                char[] cArr = this.f7859b;
                char c8 = cArr[i16];
                if (c8 == 't' || c8 == 'T') {
                    str = "true";
                    str2 = "TRUE";
                    i8 = 5;
                } else {
                    if (c8 != 'f' && c8 != 'F') {
                        if (c8 == 'n' || c8 == 'N') {
                            str = "null";
                            str2 = "NULL";
                            i8 = 7;
                        } else {
                            i8 = 0;
                        }
                        if (i8 != 0) {
                            return i8;
                        }
                        i9 = this.f7860c;
                        i10 = this.f7861d;
                        boolean z7 = true;
                        long j = 0;
                        i11 = 0;
                        c4 = 0;
                        boolean z8 = false;
                        while (true) {
                            if (i9 + i11 != i10) {
                                c7 = cArr[i9 + i11];
                                if (c7 != '+') {
                                    i12 = i10;
                                    if (c4 == 5) {
                                        c4 = 6;
                                        i11++;
                                        i10 = i12;
                                        z4 = true;
                                    }
                                } else if (c7 != 'E' || c7 == 'e') {
                                    i12 = i10;
                                    if (c4 != 2 || c4 == 4) {
                                        c4 = 5;
                                        i11++;
                                        i10 = i12;
                                        z4 = true;
                                    }
                                } else if (c7 == '-') {
                                    i12 = i10;
                                    if (c4 == 0) {
                                        c4 = 1;
                                        z8 = true;
                                    } else if (c4 == 5) {
                                        c4 = 6;
                                    }
                                    i11++;
                                    i10 = i12;
                                    z4 = true;
                                } else if (c7 == '.') {
                                    i12 = i10;
                                    if (c4 == 2) {
                                        c4 = 3;
                                        i11++;
                                        i10 = i12;
                                        z4 = true;
                                    }
                                } else if (c7 >= '0' && c7 <= '9') {
                                    if (c4 == z4 || c4 == 0) {
                                        i12 = i10;
                                        j = -(c7 - '0');
                                        c4 = 2;
                                    } else if (c4 != 2) {
                                        i12 = i10;
                                        if (c4 == 3) {
                                            c4 = 4;
                                        } else if (c4 == 5 || c4 == 6) {
                                            c4 = 7;
                                        }
                                        i11++;
                                        i10 = i12;
                                        z4 = true;
                                    } else if (j != 0) {
                                        i12 = i10;
                                        long j3 = (10 * j) - ((long) (c7 - '0'));
                                        z7 &= j > -922337203685477580L || (j == -922337203685477580L && j3 < j);
                                        j = j3;
                                    }
                                    i11++;
                                    i10 = i12;
                                    z4 = true;
                                } else if (!e(c7)) {
                                    if (c4 != 2 && z7 && ((j != Long.MIN_VALUE || z8) && (j != 0 || !z8))) {
                                        if (!z8) {
                                            j = -j;
                                        }
                                        this.f7865y = j;
                                        this.f7860c += i11;
                                        i13 = 15;
                                        this.f7864x = 15;
                                    } else if (c4 != 2 || c4 == 4 || c4 == 7) {
                                        this.f7866z = i11;
                                        i13 = 16;
                                        this.f7864x = 16;
                                    }
                                }
                                if (i13 != 0) {
                                    return i13;
                                }
                                if (e(cArr[this.f7860c])) {
                                    a();
                                    throw null;
                                }
                                n("Expected value");
                                throw null;
                            }
                            if (i11 != cArr.length) {
                                if (!c(i11 + 1)) {
                                    i9 = this.f7860c;
                                    i10 = this.f7861d;
                                    c7 = cArr[i9 + i11];
                                    if (c7 != '+') {
                                        i12 = i10;
                                        if (c4 == 5) {
                                            c4 = 6;
                                            i11++;
                                            i10 = i12;
                                            z4 = true;
                                        }
                                    } else if (c7 != 'E') {
                                        i12 = i10;
                                        if (c4 != 2) {
                                        }
                                        c4 = 5;
                                        i11++;
                                        i10 = i12;
                                        z4 = true;
                                    } else {
                                        i12 = i10;
                                        if (c4 != 2) {
                                        }
                                        c4 = 5;
                                        i11++;
                                        i10 = i12;
                                        z4 = true;
                                    }
                                    if (i13 != 0) {
                                        return i13;
                                    }
                                    if (e(cArr[this.f7860c])) {
                                        n("Expected value");
                                        throw null;
                                    }
                                    a();
                                    throw null;
                                }
                                if (c4 != 2) {
                                    if (c4 != 2) {
                                    }
                                    this.f7866z = i11;
                                    i13 = 16;
                                    this.f7864x = 16;
                                } else {
                                    if (c4 != 2) {
                                    }
                                    this.f7866z = i11;
                                    i13 = 16;
                                    this.f7864x = 16;
                                }
                                if (i13 != 0) {
                                    return i13;
                                }
                                if (e(cArr[this.f7860c])) {
                                    n("Expected value");
                                    throw null;
                                }
                                a();
                                throw null;
                            }
                            i13 = 0;
                            if (i13 != 0) {
                                return i13;
                            }
                            if (e(cArr[this.f7860c])) {
                                n("Expected value");
                                throw null;
                            }
                            a();
                            throw null;
                        }
                    }
                    str = "false";
                    str2 = "FALSE";
                    i8 = 6;
                }
                int length = str.length();
                int i17 = 1;
                while (true) {
                    if (i17 >= length) {
                        if ((this.f7860c + length >= this.f7861d && !c(length + 1)) || !e(cArr[this.f7860c + length])) {
                            this.f7860c += length;
                            this.f7864x = i8;
                            break;
                        }
                        break;
                    }
                    if ((this.f7860c + i17 < this.f7861d || c(i17 + 1)) && ((c3 = cArr[this.f7860c + i17]) == str.charAt(i17) || c3 == str2.charAt(i17))) {
                        i17++;
                    }
                    i8 = 0;
                    break;
                }
                if (i8 != 0) {
                    return i8;
                }
                i9 = this.f7860c;
                i10 = this.f7861d;
                boolean z9 = true;
                long j7 = 0;
                i11 = 0;
                c4 = 0;
                boolean z10 = false;
                while (true) {
                    if (i9 + i11 != i10) {
                        c7 = cArr[i9 + i11];
                        if (c7 != '+') {
                            i12 = i10;
                            if (c4 == 5) {
                                c4 = 6;
                                i11++;
                                i10 = i12;
                                z4 = true;
                            }
                        } else if (c7 != 'E') {
                            i12 = i10;
                            if (c4 != 2) {
                            }
                            c4 = 5;
                            i11++;
                            i10 = i12;
                            z4 = true;
                        } else {
                            i12 = i10;
                            if (c4 != 2) {
                            }
                            c4 = 5;
                            i11++;
                            i10 = i12;
                            z4 = true;
                        }
                        if (i13 != 0) {
                            return i13;
                        }
                        if (e(cArr[this.f7860c])) {
                            n("Expected value");
                            throw null;
                        }
                        a();
                        throw null;
                    }
                    if (i11 != cArr.length) {
                        if (!c(i11 + 1)) {
                            i9 = this.f7860c;
                            i10 = this.f7861d;
                            c7 = cArr[i9 + i11];
                            if (c7 != '+') {
                                i12 = i10;
                                if (c4 == 5) {
                                    c4 = 6;
                                    i11++;
                                    i10 = i12;
                                    z4 = true;
                                }
                            } else if (c7 != 'E') {
                                i12 = i10;
                                if (c4 != 2) {
                                }
                                c4 = 5;
                                i11++;
                                i10 = i12;
                                z4 = true;
                            } else {
                                i12 = i10;
                                if (c4 != 2) {
                                }
                                c4 = 5;
                                i11++;
                                i10 = i12;
                                z4 = true;
                            }
                            if (i13 != 0) {
                                return i13;
                            }
                            if (e(cArr[this.f7860c])) {
                                n("Expected value");
                                throw null;
                            }
                            a();
                            throw null;
                        }
                        if (c4 != 2) {
                            if (c4 != 2) {
                            }
                            this.f7866z = i11;
                            i13 = 16;
                            this.f7864x = 16;
                        } else {
                            if (c4 != 2) {
                            }
                            this.f7866z = i11;
                            i13 = 16;
                            this.f7864x = 16;
                        }
                        if (i13 != 0) {
                            return i13;
                        }
                        if (e(cArr[this.f7860c])) {
                            n("Expected value");
                            throw null;
                        }
                        a();
                        throw null;
                    }
                    i13 = 0;
                    if (i13 != 0) {
                        return i13;
                    }
                    if (e(cArr[this.f7860c])) {
                        n("Expected value");
                        throw null;
                    }
                    a();
                    throw null;
                }
            }
            i7 = 1;
            if (i15 == 1) {
                this.f7864x = 4;
                return 4;
            }
        }
        if (i15 == i7 || i15 == 2) {
            a();
            throw null;
        }
        n("Unexpected value");
        throw null;
    }

    public final boolean c(int i7) throws IOException {
        int i8;
        int i9;
        int i10 = this.f7863f;
        int i11 = this.f7860c;
        this.f7863f = i10 - i11;
        int i12 = this.f7861d;
        char[] cArr = this.f7859b;
        if (i12 != i11) {
            int i13 = i12 - i11;
            this.f7861d = i13;
            System.arraycopy(cArr, i11, cArr, 0, i13);
        } else {
            this.f7861d = 0;
        }
        this.f7860c = 0;
        do {
            int i14 = this.f7861d;
            int i15 = this.f7858a.read(cArr, i14, cArr.length - i14);
            if (i15 == -1) {
                return false;
            }
            i8 = this.f7861d + i15;
            this.f7861d = i8;
            if (this.f7862e == 0 && (i9 = this.f7863f) == 0 && i8 > 0 && cArr[0] == 65279) {
                this.f7860c++;
                this.f7863f = i9 + 1;
                i7++;
            }
        } while (i8 < i7);
        return true;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        this.f7864x = 0;
        this.f7854B[0] = 8;
        this.f7855C = 1;
        this.f7858a.close();
    }

    public final String d() {
        StringBuilder sb = new StringBuilder("$");
        for (int i7 = 0; i7 < this.f7855C; i7++) {
            int i8 = this.f7854B[i7];
            if (i8 == 1 || i8 == 2) {
                int i9 = this.f7857E[i7];
                sb.append('[');
                sb.append(i9);
                sb.append(']');
            } else if (i8 == 3 || i8 == 4 || i8 == 5) {
                sb.append('.');
                String str = this.f7856D[i7];
                if (str != null) {
                    sb.append(str);
                }
            }
        }
        return sb.toString();
    }

    public final boolean e(char c3) throws b {
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
        a();
        throw null;
    }

    public final String f() {
        StringBuilder sbG = p150v0.a.g(" at line ", this.f7862e + 1, " column ", (this.f7860c - this.f7863f) + 1, " path ");
        sbG.append(d());
        return sbG.toString();
    }

    public final int g(boolean z4) throws IOException {
        int i7 = this.f7860c;
        int i8 = this.f7861d;
        while (true) {
            if (i7 == i8) {
                this.f7860c = i7;
                if (!c(1)) {
                    if (!z4) {
                        return -1;
                    }
                    throw new EOFException("End of input" + f());
                }
                i7 = this.f7860c;
                i8 = this.f7861d;
            }
            int i9 = i7 + 1;
            char c3 = this.f7859b[i7];
            if (c3 == '\n') {
                this.f7862e++;
                this.f7863f = i9;
            } else if (c3 != ' ' && c3 != '\r' && c3 != '\t') {
                if (c3 != '/') {
                    if (c3 != '#') {
                        this.f7860c = i9;
                        return c3;
                    }
                    this.f7860c = i9;
                    a();
                    throw null;
                }
                this.f7860c = i9;
                if (i9 == i8) {
                    this.f7860c = i7;
                    boolean zC = c(2);
                    this.f7860c++;
                    if (!zC) {
                        return c3;
                    }
                }
                a();
                throw null;
            }
            i7 = i9;
        }
    }

    public final String h(char c3) throws b {
        int i7;
        char[] cArr;
        int i8;
        StringBuilder sb = null;
        do {
            int i9 = this.f7860c;
            int i10 = this.f7861d;
            while (true) {
                int i11 = i10;
                i7 = i9;
                while (true) {
                    cArr = this.f7859b;
                    if (i9 < i11) {
                        int i12 = i9 + 1;
                        char c4 = cArr[i9];
                        if (c4 == c3) {
                            this.f7860c = i12;
                            int i13 = (i12 - i7) - 1;
                            if (sb == null) {
                                return new String(cArr, i7, i13);
                            }
                            sb.append(cArr, i7, i13);
                            return sb.toString();
                        }
                        char c7 = '\n';
                        if (c4 == '\\') {
                            this.f7860c = i12;
                            int i14 = i12 - i7;
                            int i15 = i14 - 1;
                            if (sb == null) {
                                sb = new StringBuilder(Math.max(i14 * 2, 16));
                            }
                            sb.append(cArr, i7, i15);
                            if (this.f7860c == this.f7861d && !c(1)) {
                                n("Unterminated escape sequence");
                                throw null;
                            }
                            int i16 = this.f7860c;
                            int i17 = i16 + 1;
                            this.f7860c = i17;
                            char c8 = cArr[i16];
                            if (c8 != '\n') {
                                if (c8 != '\"' && c8 != '\'' && c8 != '/' && c8 != '\\') {
                                    if (c8 == 'b') {
                                        c7 = '\b';
                                    } else if (c8 == 'f') {
                                        c7 = '\f';
                                    } else if (c8 == 'n') {
                                        continue;
                                    } else if (c8 == 'r') {
                                        c7 = '\r';
                                    } else if (c8 == 't') {
                                        c7 = '\t';
                                    } else {
                                        if (c8 != 'u') {
                                            n("Invalid escape sequence");
                                            throw null;
                                        }
                                        if (i16 + 5 > this.f7861d && !c(4)) {
                                            n("Unterminated escape sequence");
                                            throw null;
                                        }
                                        int i18 = this.f7860c;
                                        int i19 = i18 + 4;
                                        c7 = 0;
                                        while (i18 < i19) {
                                            char c9 = cArr[i18];
                                            char c10 = (char) (c7 << 4);
                                            if (c9 >= '0' && c9 <= '9') {
                                                i8 = c9 - '0';
                                            } else if (c9 >= 'a' && c9 <= 'f') {
                                                i8 = c9 - 'W';
                                            } else {
                                                if (c9 < 'A' || c9 > 'F') {
                                                    throw new NumberFormatException("\\u".concat(new String(cArr, this.f7860c, 4)));
                                                }
                                                i8 = c9 - '7';
                                            }
                                            c7 = (char) (i8 + c10);
                                            i18++;
                                        }
                                        this.f7860c += 4;
                                    }
                                }
                                sb.append(c7);
                                i9 = this.f7860c;
                                i10 = this.f7861d;
                            } else {
                                this.f7862e++;
                                this.f7863f = i17;
                            }
                            c7 = c8;
                            sb.append(c7);
                            i9 = this.f7860c;
                            i10 = this.f7861d;
                        } else {
                            if (c4 == '\n') {
                                this.f7862e++;
                                this.f7863f = i12;
                            }
                            i9 = i12;
                        }
                    }
                }
            }
            if (sb == null) {
                sb = new StringBuilder(Math.max((i9 - i7) * 2, 16));
            }
            sb.append(cArr, i7, i9 - i7);
            this.f7860c = i9;
        } while (c(1));
        n("Unterminated string");
        throw null;
    }

    public final boolean hasNext() throws IOException {
        int iB = this.f7864x;
        if (iB == 0) {
            iB = b();
        }
        return (iB == 2 || iB == 4 || iB == 17) ? false : true;
    }

    /* JADX WARN: Code duplicated, block: B:47:0x007d  */
    /* JADX WARN: Code duplicated, block: B:48:0x0085  */
    public final String i() throws b {
        char[] cArr;
        String string;
        int i7 = 0;
        StringBuilder sb = null;
        do {
            int i8 = 0;
            while (true) {
                int i9 = this.f7860c;
                int i10 = i9 + i8;
                int i11 = this.f7861d;
                cArr = this.f7859b;
                if (i10 < i11) {
                    char c3 = cArr[i9 + i8];
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
                        a();
                        throw null;
                    }
                    i7 = i8;
                } else if (i8 >= cArr.length) {
                    if (sb == null) {
                        sb = new StringBuilder(Math.max(i8, 16));
                    }
                    sb.append(cArr, this.f7860c, i8);
                    this.f7860c += i8;
                } else if (!c(i8 + 1)) {
                    i7 = i8;
                }
                if (sb == null) {
                    string = new String(cArr, this.f7860c, i7);
                } else {
                    sb.append(cArr, this.f7860c, i7);
                    string = sb.toString();
                }
                this.f7860c += i7;
                return string;
            }
        } while (c(1));
        if (sb == null) {
            string = new String(cArr, this.f7860c, i7);
        } else {
            sb.append(cArr, this.f7860c, i7);
            string = sb.toString();
        }
        this.f7860c += i7;
        return string;
    }

    public final int j() throws IOException {
        int iB = this.f7864x;
        if (iB == 0) {
            iB = b();
        }
        switch (iB) {
            case 1:
                return 3;
            case 2:
                return 4;
            case 3:
                return 1;
            case 4:
                return 2;
            case 5:
            case 6:
                return 8;
            case 7:
                return 9;
            case 8:
            case 9:
            case 10:
            case 11:
                return 6;
            case 12:
            case 13:
            case 14:
                return 5;
            case 15:
            case 16:
                return 7;
            case 17:
                return 10;
            default:
                throw new AssertionError();
        }
    }

    public final void k(int i7) {
        int i8 = this.f7855C;
        int[] iArr = this.f7854B;
        if (i8 == iArr.length) {
            int i9 = i8 * 2;
            this.f7854B = Arrays.copyOf(iArr, i9);
            this.f7857E = Arrays.copyOf(this.f7857E, i9);
            this.f7856D = (String[]) Arrays.copyOf(this.f7856D, i9);
        }
        int[] iArr2 = this.f7854B;
        int i10 = this.f7855C;
        this.f7855C = i10 + 1;
        iArr2[i10] = i7;
    }

    public final void n(String str) throws b {
        StringBuilder sbC = e.c(str);
        sbC.append(f());
        throw new b(sbC.toString());
    }

    public final String toString() {
        return a.class.getSimpleName() + f();
    }
}
