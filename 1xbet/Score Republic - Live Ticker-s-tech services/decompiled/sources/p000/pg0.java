package p000;

import java.io.Closeable;
import java.io.EOFException;
import java.io.IOException;
import java.io.StringReader;
import java.util.Arrays;

/* JADX INFO: compiled from: r8-map-id-738170b7fb69b873ed7524d5270c8e05c6f5fb40ea1ade7a72c8ed7a70699269 */
/* JADX INFO: loaded from: classes.dex */
public final class pg0 implements Closeable {

    /* JADX INFO: renamed from: j */
    public final StringReader f6134j;

    /* JADX INFO: renamed from: q */
    public long f6141q;

    /* JADX INFO: renamed from: r */
    public int f6142r;

    /* JADX INFO: renamed from: s */
    public String f6143s;

    /* JADX INFO: renamed from: t */
    public int[] f6144t;

    /* JADX INFO: renamed from: v */
    public String[] f6146v;

    /* JADX INFO: renamed from: w */
    public int[] f6147w;

    /* JADX INFO: renamed from: k */
    public final char[] f6135k = new char[1024];

    /* JADX INFO: renamed from: l */
    public int f6136l = 0;

    /* JADX INFO: renamed from: m */
    public int f6137m = 0;

    /* JADX INFO: renamed from: n */
    public int f6138n = 0;

    /* JADX INFO: renamed from: o */
    public int f6139o = 0;

    /* JADX INFO: renamed from: p */
    public int f6140p = 0;

    /* JADX INFO: renamed from: u */
    public int f6145u = 1;

    public pg0(StringReader stringReader) {
        int[] iArr = new int[32];
        this.f6144t = iArr;
        iArr[0] = 6;
        this.f6146v = new String[32];
        this.f6147w = new int[32];
        this.f6134j = stringReader;
    }

    /* JADX INFO: renamed from: a */
    public final void m3905a() throws C0287hi {
        m3917u("Use JsonReader.setLenient(true) to accept malformed JSON");
        throw null;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws IOException {
        this.f6140p = 0;
        this.f6144t[0] = 8;
        this.f6145u = 1;
        this.f6134j.close();
    }

    /* JADX WARN: Code duplicated, block: B:102:0x013e  */
    /* JADX WARN: Code duplicated, block: B:103:0x0142 A[PHI: r1 r4
      0x0142: PHI (r1v30 int) = (r1v29 int), (r1v44 int) binds: [B:95:0x012b, B:102:0x013e] A[DONT_GENERATE, DONT_INLINE]
      0x0142: PHI (r4v6 int) = (r4v5 int), (r4v7 int) binds: [B:95:0x012b, B:102:0x013e] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:105:0x014a  */
    /* JADX WARN: Code duplicated, block: B:107:0x014e  */
    /* JADX WARN: Code duplicated, block: B:144:0x01aa A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:155:0x01ca A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:156:0x01cc  */
    /* JADX WARN: Code duplicated, block: B:169:0x01e9  */
    /* JADX WARN: Code duplicated, block: B:171:0x01ec  */
    /* JADX WARN: Code duplicated, block: B:174:0x01f1  */
    /* JADX WARN: Code duplicated, block: B:179:0x01fc A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:180:0x01fd  */
    /* JADX WARN: Code duplicated, block: B:182:0x0207  */
    /* JADX WARN: Code duplicated, block: B:184:0x020d  */
    /* JADX WARN: Code duplicated, block: B:237:0x0130 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:238:0x0130 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:239:0x01a8 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:92:0x011a A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:93:0x011b  */
    /* JADX WARN: Code duplicated, block: B:96:0x012d  */
    /* JADX WARN: Code duplicated, block: B:99:0x0134  */
    /* JADX INFO: renamed from: e */
    public final int m3906e() throws IOException {
        int iM3912p;
        String str;
        String str2;
        int i;
        int i2;
        char c;
        int i3;
        int i4;
        int i5;
        int i6;
        char c2;
        int i7;
        int[] iArr = this.f6144t;
        int i8 = this.f6145u - 1;
        int i9 = iArr[i8];
        int i10 = 0;
        if (i9 == 1) {
            iArr[i8] = 2;
        } else if (i9 == 2) {
            int iM3912p2 = m3912p(true);
            if (iM3912p2 != 44) {
                if (iM3912p2 == 59) {
                    m3905a();
                    throw null;
                }
                if (iM3912p2 == 93) {
                    this.f6140p = 4;
                    return 4;
                }
                m3917u("Unterminated array");
                throw null;
            }
        } else {
            if (i9 == 3 || i9 == 5) {
                iArr[i8] = 4;
                if (i9 == 5 && (iM3912p = m3912p(true)) != 44) {
                    if (iM3912p == 59) {
                        m3905a();
                        throw null;
                    }
                    if (iM3912p == 125) {
                        this.f6140p = 2;
                        return 2;
                    }
                    m3917u("Unterminated object");
                    throw null;
                }
                int iM3912p3 = m3912p(true);
                if (iM3912p3 == 34) {
                    this.f6140p = 13;
                    return 13;
                }
                if (iM3912p3 == 39) {
                    m3905a();
                    throw null;
                }
                if (iM3912p3 != 125) {
                    m3905a();
                    throw null;
                }
                if (i9 != 5) {
                    this.f6140p = 2;
                    return 2;
                }
                m3917u("Expected name");
                throw null;
            }
            if (i9 == 4) {
                iArr[i8] = 5;
                int iM3912p4 = m3912p(true);
                if (iM3912p4 != 58) {
                    if (iM3912p4 != 61) {
                        m3917u("Expected ':'");
                        throw null;
                    }
                    m3905a();
                    throw null;
                }
            } else if (i9 == 6) {
                iArr[i8] = 7;
            } else {
                if (i9 == 7) {
                    if (m3912p(false) == -1) {
                        this.f6140p = 17;
                        return 17;
                    }
                    m3905a();
                    throw null;
                }
                if (i9 == 8) {
                    C0270h1.m2191g("JsonReader is closed");
                    return 0;
                }
            }
        }
        int iM3912p5 = m3912p(true);
        if (iM3912p5 == 34) {
            this.f6140p = 9;
            return 9;
        }
        if (iM3912p5 == 39) {
            m3905a();
            throw null;
        }
        if (iM3912p5 != 44 && iM3912p5 != 59) {
            if (iM3912p5 == 91) {
                this.f6140p = 3;
                return 3;
            }
            if (iM3912p5 != 93) {
                if (iM3912p5 == 123) {
                    this.f6140p = 1;
                    return 1;
                }
                int i11 = this.f6136l - 1;
                this.f6136l = i11;
                char[] cArr = this.f6135k;
                char c3 = cArr[i11];
                if (c3 == 't' || c3 == 'T') {
                    str = "true";
                    str2 = "TRUE";
                    i = 5;
                } else {
                    if (c3 != 'f' && c3 != 'F') {
                        if (c3 == 'n' || c3 == 'N') {
                            str = "null";
                            str2 = "NULL";
                            i = 7;
                        } else {
                            i = 0;
                            i2 = 0;
                        }
                        if (i != 0) {
                            return i;
                        }
                        i3 = this.f6136l;
                        i4 = this.f6137m;
                        int i12 = 1;
                        i5 = i2;
                        i6 = i5;
                        int i13 = i6;
                        long j = 0;
                        while (true) {
                            if (i3 + i5 != i4) {
                                c2 = cArr[i3 + i5];
                                if (c2 != '+') {
                                    if (c2 != 'E' || c2 == 'e') {
                                        if (i6 != 2 || i6 == 4) {
                                            i6 = 5;
                                            i5++;
                                        }
                                    } else if (c2 == '-') {
                                        if (i6 == 0) {
                                            i6 = 1;
                                            i13 = 1;
                                        } else {
                                            if (i6 != 5) {
                                            }
                                            i6 = 6;
                                        }
                                        i5++;
                                    } else if (c2 != '.') {
                                        if (c2 >= '0' && c2 <= '9') {
                                            if (i6 == 1 || i6 == 0) {
                                                j = -(c2 - '0');
                                                i6 = 2;
                                            } else if (i6 == 2) {
                                                if (j != 0) {
                                                    long j2 = (10 * j) - ((long) (c2 - '0'));
                                                    i12 &= (j > -922337203685477580L || (j == -922337203685477580L && j2 < j)) ? 1 : i2;
                                                    j = j2;
                                                }
                                            } else if (i6 == 3) {
                                                i6 = 4;
                                            } else if (i6 == 5 || i6 == 6) {
                                                i6 = 7;
                                            }
                                            i5++;
                                        } else if (!m3910m(c2)) {
                                            if (i6 != 2 && i12 != 0 && ((j != Long.MIN_VALUE || i13 != 0) && (j != 0 || i13 == 0))) {
                                                if (i13 == 0) {
                                                    j = -j;
                                                }
                                                this.f6141q = j;
                                                this.f6136l += i5;
                                                i7 = 15;
                                                this.f6140p = 15;
                                            } else if (i6 != 2 || i6 == 4 || i6 == 7) {
                                                this.f6142r = i5;
                                                i7 = 16;
                                                this.f6140p = 16;
                                            }
                                        }
                                    } else if (i6 == 2) {
                                        i6 = 3;
                                        i5++;
                                    }
                                    if (i7 != 0) {
                                        return i7;
                                    }
                                    if (m3910m(cArr[this.f6136l])) {
                                        m3905a();
                                        throw null;
                                    }
                                    m3917u("Expected value");
                                    throw null;
                                }
                                if (i6 != 5) {
                                }
                                i6 = 6;
                                i5++;
                            } else if (i5 != cArr.length) {
                                if (!m3907i(i5 + 1)) {
                                    i3 = this.f6136l;
                                    i4 = this.f6137m;
                                    c2 = cArr[i3 + i5];
                                    if (c2 != '+') {
                                        if (c2 != 'E') {
                                            if (i6 != 2) {
                                            }
                                            i6 = 5;
                                            i5++;
                                        } else {
                                            if (i6 != 2) {
                                            }
                                            i6 = 5;
                                            i5++;
                                        }
                                        if (i7 != 0) {
                                            return i7;
                                        }
                                        if (m3910m(cArr[this.f6136l])) {
                                            m3917u("Expected value");
                                            throw null;
                                        }
                                        m3905a();
                                        throw null;
                                    }
                                    if (i6 != 5) {
                                    }
                                    i6 = 6;
                                    i5++;
                                }
                                if (i6 != 2) {
                                    if (i6 != 2) {
                                    }
                                    this.f6142r = i5;
                                    i7 = 16;
                                    this.f6140p = 16;
                                } else {
                                    if (i6 != 2) {
                                    }
                                    this.f6142r = i5;
                                    i7 = 16;
                                    this.f6140p = 16;
                                }
                                if (i7 != 0) {
                                    return i7;
                                }
                                if (m3910m(cArr[this.f6136l])) {
                                    m3917u("Expected value");
                                    throw null;
                                }
                                m3905a();
                                throw null;
                            }
                            i7 = i2;
                            if (i7 != 0) {
                                return i7;
                            }
                            if (m3910m(cArr[this.f6136l])) {
                                m3917u("Expected value");
                                throw null;
                            }
                            m3905a();
                            throw null;
                        }
                    }
                    str = "false";
                    str2 = "FALSE";
                    i = 6;
                }
                int length = str.length();
                int i14 = 1;
                while (true) {
                    int i15 = this.f6136l;
                    i2 = i10;
                    int i16 = this.f6137m;
                    if (i14 >= length) {
                        if ((i15 + length >= i16 && !m3907i(length + 1)) || !m3910m(cArr[this.f6136l + length])) {
                            this.f6136l += length;
                            this.f6140p = i;
                            break;
                        }
                        break;
                    }
                    if ((i15 + i14 < i16 || m3907i(i14 + 1)) && ((c = cArr[this.f6136l + i14]) == str.charAt(i14) || c == str2.charAt(i14))) {
                        i14++;
                        i10 = i2;
                    }
                    i = i2;
                    break;
                }
                if (i != 0) {
                    return i;
                }
                i3 = this.f6136l;
                i4 = this.f6137m;
                int i17 = 1;
                i5 = i2;
                i6 = i5;
                int i18 = i6;
                long j3 = 0;
                while (true) {
                    if (i3 + i5 != i4) {
                        c2 = cArr[i3 + i5];
                        if (c2 != '+') {
                            if (c2 != 'E') {
                                if (i6 != 2) {
                                }
                                i6 = 5;
                                i5++;
                            } else {
                                if (i6 != 2) {
                                }
                                i6 = 5;
                                i5++;
                            }
                            if (i7 != 0) {
                                return i7;
                            }
                            if (m3910m(cArr[this.f6136l])) {
                                m3917u("Expected value");
                                throw null;
                            }
                            m3905a();
                            throw null;
                        }
                        if (i6 != 5) {
                        }
                        i6 = 6;
                        i5++;
                    } else if (i5 != cArr.length) {
                        if (!m3907i(i5 + 1)) {
                            i3 = this.f6136l;
                            i4 = this.f6137m;
                            c2 = cArr[i3 + i5];
                            if (c2 != '+') {
                                if (c2 != 'E') {
                                    if (i6 != 2) {
                                    }
                                    i6 = 5;
                                    i5++;
                                } else {
                                    if (i6 != 2) {
                                    }
                                    i6 = 5;
                                    i5++;
                                }
                                if (i7 != 0) {
                                    return i7;
                                }
                                if (m3910m(cArr[this.f6136l])) {
                                    m3917u("Expected value");
                                    throw null;
                                }
                                m3905a();
                                throw null;
                            }
                            if (i6 != 5) {
                            }
                            i6 = 6;
                            i5++;
                        }
                        if (i6 != 2) {
                            if (i6 != 2) {
                            }
                            this.f6142r = i5;
                            i7 = 16;
                            this.f6140p = 16;
                        } else {
                            if (i6 != 2) {
                            }
                            this.f6142r = i5;
                            i7 = 16;
                            this.f6140p = 16;
                        }
                        if (i7 != 0) {
                            return i7;
                        }
                        if (m3910m(cArr[this.f6136l])) {
                            m3917u("Expected value");
                            throw null;
                        }
                        m3905a();
                        throw null;
                    }
                    i7 = i2;
                    if (i7 != 0) {
                        return i7;
                    }
                    if (m3910m(cArr[this.f6136l])) {
                        m3917u("Expected value");
                        throw null;
                    }
                    m3905a();
                    throw null;
                }
            }
            if (i9 == 1) {
                this.f6140p = 4;
                return 4;
            }
        }
        if (i9 == 1 || i9 == 2) {
            m3905a();
            throw null;
        }
        m3917u("Unexpected value");
        throw null;
    }

    /* JADX INFO: renamed from: i */
    public final boolean m3907i(int i) throws IOException {
        int i2;
        int i3;
        int i4 = this.f6139o;
        int i5 = this.f6136l;
        this.f6139o = i4 - i5;
        int i6 = this.f6137m;
        char[] cArr = this.f6135k;
        if (i6 != i5) {
            int i7 = i6 - i5;
            this.f6137m = i7;
            System.arraycopy(cArr, i5, cArr, 0, i7);
        } else {
            this.f6137m = 0;
        }
        this.f6136l = 0;
        do {
            int i8 = this.f6137m;
            int i9 = this.f6134j.read(cArr, i8, cArr.length - i8);
            if (i9 == -1) {
                return false;
            }
            i2 = this.f6137m + i9;
            this.f6137m = i2;
            if (this.f6138n == 0 && (i3 = this.f6139o) == 0 && i2 > 0 && cArr[0] == 65279) {
                this.f6136l++;
                this.f6139o = i3 + 1;
                i++;
            }
        } while (i2 < i);
        return true;
    }

    /* JADX INFO: renamed from: j */
    public final String m3908j() {
        StringBuilder sb = new StringBuilder("$");
        for (int i = 0; i < this.f6145u; i++) {
            int i2 = this.f6144t[i];
            if (i2 == 1 || i2 == 2) {
                int i3 = this.f6147w[i];
                sb.append('[');
                sb.append(i3);
                sb.append(']');
            } else if (i2 == 3 || i2 == 4 || i2 == 5) {
                sb.append('.');
                String str = this.f6146v[i];
                if (str != null) {
                    sb.append(str);
                }
            }
        }
        return sb.toString();
    }

    /* JADX INFO: renamed from: l */
    public final boolean m3909l() throws IOException {
        int iM3906e = this.f6140p;
        if (iM3906e == 0) {
            iM3906e = m3906e();
        }
        return (iM3906e == 2 || iM3906e == 4 || iM3906e == 17) ? false : true;
    }

    /* JADX INFO: renamed from: m */
    public final boolean m3910m(char c) throws C0287hi {
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
        m3905a();
        throw null;
    }

    /* JADX INFO: renamed from: o */
    public final String m3911o() {
        return " at line " + (this.f6138n + 1) + " column " + ((this.f6136l - this.f6139o) + 1) + " path " + m3908j();
    }

    /* JADX INFO: renamed from: p */
    public final int m3912p(boolean z) throws IOException {
        int i = this.f6136l;
        int i2 = this.f6137m;
        while (true) {
            if (i == i2) {
                this.f6136l = i;
                if (!m3907i(1)) {
                    if (z) {
                        throw new EOFException("End of input".concat(m3911o()));
                    }
                    return -1;
                }
                i = this.f6136l;
                i2 = this.f6137m;
            }
            int i3 = i + 1;
            char c = this.f6135k[i];
            if (c == '\n') {
                this.f6138n++;
                this.f6139o = i3;
            } else if (c != ' ' && c != '\r' && c != '\t') {
                if (c != '/') {
                    if (c != '#') {
                        this.f6136l = i3;
                        return c;
                    }
                    this.f6136l = i3;
                    m3905a();
                    throw null;
                }
                this.f6136l = i3;
                if (i3 == i2) {
                    this.f6136l = i;
                    boolean zM3907i = m3907i(2);
                    this.f6136l++;
                    if (!zM3907i) {
                        return c;
                    }
                }
                m3905a();
                throw null;
            }
            i = i3;
        }
    }

    /* JADX INFO: renamed from: q */
    public final String m3913q(char c) throws C0287hi {
        int i;
        char[] cArr;
        int i2;
        StringBuilder sb = null;
        do {
            int i3 = this.f6136l;
            int i4 = this.f6137m;
            while (true) {
                int i5 = i4;
                i = i3;
                while (true) {
                    cArr = this.f6135k;
                    if (i3 < i5) {
                        int i6 = i3 + 1;
                        char c2 = cArr[i3];
                        if (c2 == c) {
                            this.f6136l = i6;
                            int i7 = (i6 - i) - 1;
                            if (sb == null) {
                                return new String(cArr, i, i7);
                            }
                            sb.append(cArr, i, i7);
                            return sb.toString();
                        }
                        char c3 = '\n';
                        if (c2 == '\\') {
                            this.f6136l = i6;
                            int i8 = i6 - i;
                            int i9 = i8 - 1;
                            if (sb == null) {
                                sb = new StringBuilder(Math.max(i8 * 2, 16));
                            }
                            sb.append(cArr, i, i9);
                            if (this.f6136l == this.f6137m && !m3907i(1)) {
                                m3917u("Unterminated escape sequence");
                                throw null;
                            }
                            int i10 = this.f6136l;
                            int i11 = i10 + 1;
                            this.f6136l = i11;
                            char c4 = cArr[i10];
                            if (c4 != '\n') {
                                if (c4 != '\"' && c4 != '\'' && c4 != '/' && c4 != '\\') {
                                    if (c4 == 'b') {
                                        c3 = '\b';
                                    } else if (c4 == 'f') {
                                        c3 = '\f';
                                    } else if (c4 == 'n') {
                                        continue;
                                    } else if (c4 == 'r') {
                                        c3 = '\r';
                                    } else if (c4 == 't') {
                                        c3 = '\t';
                                    } else {
                                        if (c4 != 'u') {
                                            m3917u("Invalid escape sequence");
                                            throw null;
                                        }
                                        if (i10 + 5 > this.f6137m && !m3907i(4)) {
                                            m3917u("Unterminated escape sequence");
                                            throw null;
                                        }
                                        int i12 = this.f6136l;
                                        int i13 = i12 + 4;
                                        c3 = 0;
                                        while (i12 < i13) {
                                            char c5 = cArr[i12];
                                            char c6 = (char) (c3 << 4);
                                            if (c5 >= '0' && c5 <= '9') {
                                                i2 = c5 - '0';
                                            } else if (c5 >= 'a' && c5 <= 'f') {
                                                i2 = c5 - 'W';
                                            } else {
                                                if (c5 < 'A' || c5 > 'F') {
                                                    throw new NumberFormatException("\\u".concat(new String(cArr, this.f6136l, 4)));
                                                }
                                                i2 = c5 - '7';
                                            }
                                            c3 = (char) (i2 + c6);
                                            i12++;
                                        }
                                        this.f6136l += 4;
                                    }
                                }
                                sb.append(c3);
                                i3 = this.f6136l;
                                i4 = this.f6137m;
                            } else {
                                this.f6138n++;
                                this.f6139o = i11;
                            }
                            c3 = c4;
                            sb.append(c3);
                            i3 = this.f6136l;
                            i4 = this.f6137m;
                        } else {
                            if (c2 == '\n') {
                                this.f6138n++;
                                this.f6139o = i6;
                            }
                            i3 = i6;
                        }
                    }
                }
            }
            if (sb == null) {
                sb = new StringBuilder(Math.max((i3 - i) * 2, 16));
            }
            sb.append(cArr, i, i3 - i);
            this.f6136l = i3;
        } while (m3907i(1));
        m3917u("Unterminated string");
        throw null;
    }

    /* JADX WARN: Code duplicated, block: B:48:0x007d  */
    /* JADX WARN: Code duplicated, block: B:49:0x0083  */
    /* JADX INFO: renamed from: r */
    public final String m3914r() throws C0287hi {
        char[] cArr;
        int i;
        String string;
        int i2 = 0;
        StringBuilder sb = null;
        do {
            int i3 = 0;
            while (true) {
                int i4 = this.f6136l + i3;
                int i5 = this.f6137m;
                cArr = this.f6135k;
                if (i4 < i5) {
                    char c = cArr[i4];
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
                                                    i3++;
                                                    break;
                                            }
                                        }
                                    }
                                }
                            }
                        }
                        m3905a();
                        throw null;
                    }
                    i2 = i3;
                } else if (i3 >= cArr.length) {
                    if (sb == null) {
                        sb = new StringBuilder(Math.max(i3, 16));
                    }
                    sb.append(cArr, this.f6136l, i3);
                    this.f6136l += i3;
                } else if (!m3907i(i3 + 1)) {
                    i2 = i3;
                }
                i = this.f6136l;
                if (sb == null) {
                    string = new String(cArr, i, i2);
                } else {
                    sb.append(cArr, i, i2);
                    string = sb.toString();
                }
                this.f6136l += i2;
                return string;
            }
        } while (m3907i(1));
        i = this.f6136l;
        if (sb == null) {
            string = new String(cArr, i, i2);
        } else {
            sb.append(cArr, i, i2);
            string = sb.toString();
        }
        this.f6136l += i2;
        return string;
    }

    /* JADX INFO: renamed from: s */
    public final int m3915s() throws IOException {
        int iM3906e = this.f6140p;
        if (iM3906e == 0) {
            iM3906e = m3906e();
        }
        switch (iM3906e) {
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
            case C0561oy.TTL_EXPIRY_EVENT_TO_LOG_FIELD_NUMBER /* 11 */:
                return 6;
            case C0561oy.OVERFLOW_POLICY_FIELD_NUMBER /* 12 */:
            case C0561oy.ONGOING_EXPERIMENTS_FIELD_NUMBER /* 13 */:
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

    /* JADX INFO: renamed from: t */
    public final void m3916t(int i) {
        int i2 = this.f6145u;
        int[] iArr = this.f6144t;
        if (i2 == iArr.length) {
            int i3 = i2 * 2;
            this.f6144t = Arrays.copyOf(iArr, i3);
            this.f6147w = Arrays.copyOf(this.f6147w, i3);
            this.f6146v = (String[]) Arrays.copyOf(this.f6146v, i3);
        }
        int[] iArr2 = this.f6144t;
        int i4 = this.f6145u;
        this.f6145u = i4 + 1;
        iArr2[i4] = i;
    }

    public final String toString() {
        return pg0.class.getSimpleName().concat(m3911o());
    }

    /* JADX INFO: renamed from: u */
    public final void m3917u(String str) throws C0287hi {
        throw new C0287hi(str.concat(m3911o()));
    }
}
