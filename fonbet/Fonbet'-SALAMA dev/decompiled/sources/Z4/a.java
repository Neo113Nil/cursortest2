package Z4;

import java.io.Closeable;
import java.io.EOFException;
import java.io.StringReader;
import java.util.Arrays;
import t.e;
import v0.AbstractC1663a;

/* loaded from: classes2.dex */
public final class a implements Closeable {

    /* renamed from: A, reason: collision with root package name */
    public String f7853A;

    /* renamed from: B, reason: collision with root package name */
    public int[] f7854B;

    /* renamed from: D, reason: collision with root package name */
    public String[] f7856D;

    /* renamed from: E, reason: collision with root package name */
    public int[] f7857E;

    /* renamed from: a, reason: collision with root package name */
    public final StringReader f7858a;

    /* renamed from: y, reason: collision with root package name */
    public long f7865y;

    /* renamed from: z, reason: collision with root package name */
    public int f7866z;

    /* renamed from: b, reason: collision with root package name */
    public final char[] f7859b = new char[1024];

    /* renamed from: c, reason: collision with root package name */
    public int f7860c = 0;

    /* renamed from: d, reason: collision with root package name */
    public int f7861d = 0;

    /* renamed from: e, reason: collision with root package name */
    public int f7862e = 0;

    /* renamed from: f, reason: collision with root package name */
    public int f7863f = 0;

    /* renamed from: x, reason: collision with root package name */
    public int f7864x = 0;

    /* renamed from: C, reason: collision with root package name */
    public int f7855C = 1;

    public a(StringReader stringReader) {
        int[] iArr = new int[32];
        this.f7854B = iArr;
        iArr[0] = 6;
        this.f7856D = new String[32];
        this.f7857E = new int[32];
        this.f7858a = stringReader;
    }

    public final void a() {
        n("Use JsonReader.setLenient(true) to accept malformed JSON");
        throw null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:105:0x019c, code lost:
    
        if (r12 != 6) goto L133;
     */
    /* JADX WARN: Code restructure failed: missing block: B:113:0x01ae, code lost:
    
        if (e(r10) != false) goto L97;
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x01b0, code lost:
    
        if (r12 != 2) goto L159;
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x01b2, code lost:
    
        if (r13 == false) goto L159;
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x01b8, code lost:
    
        if (r14 != Long.MIN_VALUE) goto L152;
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x01ba, code lost:
    
        if (r16 == false) goto L159;
     */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x01be, code lost:
    
        if (r14 != 0) goto L155;
     */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x01c0, code lost:
    
        if (r16 != false) goto L159;
     */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x01c2, code lost:
    
        if (r16 == false) goto L157;
     */
    /* JADX WARN: Code restructure failed: missing block: B:49:0x01c5, code lost:
    
        r14 = -r14;
     */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x01c6, code lost:
    
        r20.f7865y = r14;
        r20.f7860c += r5;
        r9 = 15;
        r20.f7864x = 15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:59:0x01d2, code lost:
    
        if (r12 == 2) goto L164;
     */
    /* JADX WARN: Code restructure failed: missing block: B:61:0x01d5, code lost:
    
        if (r12 == 4) goto L164;
     */
    /* JADX WARN: Code restructure failed: missing block: B:63:0x01d8, code lost:
    
        if (r12 != 7) goto L97;
     */
    /* JADX WARN: Code restructure failed: missing block: B:65:0x01da, code lost:
    
        r20.f7866z = r5;
        r9 = 16;
        r20.f7864x = 16;
     */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0117 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0118  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x0215 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:53:0x0216  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final int b() {
        int g3;
        int i7;
        String str;
        String str2;
        int i8;
        char c3;
        int i9;
        int i10;
        int[] iArr = this.f7854B;
        boolean z4 = true;
        int i11 = this.f7855C - 1;
        int i12 = iArr[i11];
        if (i12 == 1) {
            iArr[i11] = 2;
        } else if (i12 == 2) {
            int g7 = g(true);
            if (g7 != 44) {
                if (g7 == 59) {
                    a();
                    throw null;
                }
                if (g7 == 93) {
                    this.f7864x = 4;
                    return 4;
                }
                n("Unterminated array");
                throw null;
            }
        } else {
            if (i12 == 3 || i12 == 5) {
                iArr[i11] = 4;
                if (i12 == 5 && (g3 = g(true)) != 44) {
                    if (g3 == 59) {
                        a();
                        throw null;
                    }
                    if (g3 == 125) {
                        this.f7864x = 2;
                        return 2;
                    }
                    n("Unterminated object");
                    throw null;
                }
                int g8 = g(true);
                if (g8 == 34) {
                    this.f7864x = 13;
                    return 13;
                }
                if (g8 == 39) {
                    a();
                    throw null;
                }
                if (g8 != 125) {
                    a();
                    throw null;
                }
                if (i12 != 5) {
                    this.f7864x = 2;
                    return 2;
                }
                n("Expected name");
                throw null;
            }
            if (i12 == 4) {
                iArr[i11] = 5;
                int g9 = g(true);
                if (g9 != 58) {
                    if (g9 != 61) {
                        n("Expected ':'");
                        throw null;
                    }
                    a();
                    throw null;
                }
            } else if (i12 == 6) {
                iArr[i11] = 7;
            } else {
                if (i12 == 7) {
                    if (g(false) == -1) {
                        this.f7864x = 17;
                        return 17;
                    }
                    a();
                    throw null;
                }
                if (i12 == 8) {
                    throw new IllegalStateException("JsonReader is closed");
                }
            }
        }
        int g10 = g(true);
        if (g10 == 34) {
            this.f7864x = 9;
            return 9;
        }
        if (g10 == 39) {
            a();
            throw null;
        }
        if (g10 == 44 || g10 == 59) {
            i7 = 1;
        } else {
            if (g10 == 91) {
                this.f7864x = 3;
                return 3;
            }
            if (g10 == 93) {
                i7 = 1;
                if (i12 == 1) {
                    this.f7864x = 4;
                    return 4;
                }
            } else {
                if (g10 == 123) {
                    this.f7864x = 1;
                    return 1;
                }
                int i13 = this.f7860c - 1;
                this.f7860c = i13;
                char[] cArr = this.f7859b;
                char c4 = cArr[i13];
                if (c4 == 't' || c4 == 'T') {
                    str = "true";
                    str2 = "TRUE";
                    i8 = 5;
                } else if (c4 == 'f' || c4 == 'F') {
                    str = "false";
                    str2 = "FALSE";
                    i8 = 6;
                } else if (c4 == 'n' || c4 == 'N') {
                    str = "null";
                    str2 = "NULL";
                    i8 = 7;
                } else {
                    i8 = 0;
                    if (i8 == 0) {
                        return i8;
                    }
                    int i14 = this.f7860c;
                    int i15 = this.f7861d;
                    boolean z7 = true;
                    long j = 0;
                    int i16 = 0;
                    char c7 = 0;
                    boolean z8 = false;
                    while (true) {
                        if (i14 + i16 == i15) {
                            if (i16 == cArr.length) {
                                break;
                            }
                            if (!c(i16 + 1)) {
                                break;
                            }
                            i14 = this.f7860c;
                            i15 = this.f7861d;
                        }
                        char c8 = cArr[i14 + i16];
                        if (c8 == '+') {
                            i9 = i15;
                            if (c7 != 5) {
                                break;
                            }
                            c7 = 6;
                            i16++;
                            i15 = i9;
                            z4 = true;
                        } else if (c8 == 'E' || c8 == 'e') {
                            i9 = i15;
                            if (c7 != 2 && c7 != 4) {
                                break;
                            }
                            c7 = 5;
                            i16++;
                            i15 = i9;
                            z4 = true;
                        } else if (c8 == '-') {
                            i9 = i15;
                            if (c7 != 0) {
                                if (c7 != 5) {
                                    break;
                                }
                                c7 = 6;
                            } else {
                                c7 = 1;
                                z8 = true;
                            }
                            i16++;
                            i15 = i9;
                            z4 = true;
                        } else if (c8 == '.') {
                            i9 = i15;
                            if (c7 != 2) {
                                break;
                            }
                            c7 = 3;
                            i16++;
                            i15 = i9;
                            z4 = true;
                        } else {
                            if (c8 < '0' || c8 > '9') {
                                break;
                            }
                            if (c7 == z4 || c7 == 0) {
                                i9 = i15;
                                j = -(c8 - '0');
                                c7 = 2;
                            } else if (c7 != 2) {
                                i9 = i15;
                                if (c7 == 3) {
                                    c7 = 4;
                                } else {
                                    if (c7 == 5) {
                                    }
                                    c7 = 7;
                                }
                                i16++;
                                i15 = i9;
                                z4 = true;
                            } else {
                                if (j == 0) {
                                    break;
                                }
                                i9 = i15;
                                long j3 = (10 * j) - (c8 - '0');
                                z7 &= j > -922337203685477580L || (j == -922337203685477580L && j3 < j);
                                j = j3;
                            }
                            i16++;
                            i15 = i9;
                            z4 = true;
                        }
                        if (i10 == 0) {
                            return i10;
                        }
                        if (e(cArr[this.f7860c])) {
                            a();
                            throw null;
                        }
                        n("Expected value");
                        throw null;
                    }
                    i10 = 0;
                    if (i10 == 0) {
                    }
                }
                int length = str.length();
                int i17 = 1;
                while (true) {
                    if (i17 < length) {
                        if ((this.f7860c + i17 >= this.f7861d && !c(i17 + 1)) || ((c3 = cArr[this.f7860c + i17]) != str.charAt(i17) && c3 != str2.charAt(i17))) {
                            break;
                        }
                        i17++;
                    } else if ((this.f7860c + length >= this.f7861d && !c(length + 1)) || !e(cArr[this.f7860c + length])) {
                        this.f7860c += length;
                        this.f7864x = i8;
                    }
                }
                i8 = 0;
                if (i8 == 0) {
                }
            }
        }
        if (i12 == i7 || i12 == 2) {
            a();
            throw null;
        }
        n("Unexpected value");
        throw null;
    }

    public final boolean c(int i7) {
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
            int read = this.f7858a.read(cArr, i14, cArr.length - i14);
            if (read == -1) {
                return false;
            }
            i8 = this.f7861d + read;
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

    public final boolean e(char c3) {
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
        StringBuilder g3 = AbstractC1663a.g(" at line ", this.f7862e + 1, " column ", (this.f7860c - this.f7863f) + 1, " path ");
        g3.append(d());
        return g3.toString();
    }

    public final int g(boolean z4) {
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
                    boolean c4 = c(2);
                    this.f7860c++;
                    if (!c4) {
                        return c3;
                    }
                }
                a();
                throw null;
            }
            i7 = i9;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:104:0x0113, code lost:
    
        if (r1 != null) goto L90;
     */
    /* JADX WARN: Code restructure failed: missing block: B:105:0x0115, code lost:
    
        r1 = new java.lang.StringBuilder(java.lang.Math.max((r2 - r3) * 2, 16));
     */
    /* JADX WARN: Code restructure failed: missing block: B:106:0x0123, code lost:
    
        r1.append(r5, r3, r2 - r3);
        r11.f7860c = r2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x002f, code lost:
    
        r11.f7860c = r8;
        r8 = r8 - r3;
        r2 = r8 - 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x0034, code lost:
    
        if (r1 != null) goto L20;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x0036, code lost:
    
        r1 = new java.lang.StringBuilder(java.lang.Math.max(r8 * 2, 16));
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0041, code lost:
    
        r1.append(r5, r3, r2);
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x004a, code lost:
    
        if (r11.f7860c != r11.f7861d) goto L27;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0050, code lost:
    
        if (c(1) == false) goto L101;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0053, code lost:
    
        n("Unterminated escape sequence");
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x0056, code lost:
    
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x0057, code lost:
    
        r2 = r11.f7860c;
        r3 = r2 + 1;
        r11.f7860c = r3;
        r7 = r5[r2];
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x005f, code lost:
    
        if (r7 == '\n') goto L82;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x0063, code lost:
    
        if (r7 == '\"') goto L83;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x0067, code lost:
    
        if (r7 == '\'') goto L83;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x006b, code lost:
    
        if (r7 == '/') goto L83;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x006d, code lost:
    
        if (r7 == '\\') goto L83;
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x0071, code lost:
    
        if (r7 == 'b') goto L81;
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x0075, code lost:
    
        if (r7 == 'f') goto L80;
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x0079, code lost:
    
        if (r7 == 'n') goto L105;
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x007d, code lost:
    
        if (r7 == 'r') goto L79;
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x0081, code lost:
    
        if (r7 == 't') goto L78;
     */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x0085, code lost:
    
        if (r7 != 'u') goto L95;
     */
    /* JADX WARN: Code restructure failed: missing block: B:49:0x008c, code lost:
    
        if ((r2 + 5) <= r11.f7861d) goto L55;
     */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x0092, code lost:
    
        if (c(4) == false) goto L96;
     */
    /* JADX WARN: Code restructure failed: missing block: B:53:0x0095, code lost:
    
        n("Unterminated escape sequence");
     */
    /* JADX WARN: Code restructure failed: missing block: B:54:0x0098, code lost:
    
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:55:0x0099, code lost:
    
        r2 = r11.f7860c;
        r4 = r2 + 4;
        r9 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:56:0x009f, code lost:
    
        if (r2 >= r4) goto L114;
     */
    /* JADX WARN: Code restructure failed: missing block: B:57:0x00a1, code lost:
    
        r6 = r5[r2];
        r8 = (char) (r9 << 4);
     */
    /* JADX WARN: Code restructure failed: missing block: B:58:0x00a8, code lost:
    
        if (r6 < '0') goto L63;
     */
    /* JADX WARN: Code restructure failed: missing block: B:60:0x00ac, code lost:
    
        if (r6 > '9') goto L63;
     */
    /* JADX WARN: Code restructure failed: missing block: B:61:0x00ae, code lost:
    
        r6 = r6 - '0';
     */
    /* JADX WARN: Code restructure failed: missing block: B:62:0x00b0, code lost:
    
        r9 = (char) (r6 + r8);
     */
    /* JADX WARN: Code restructure failed: missing block: B:63:0x00c8, code lost:
    
        r2 = r2 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:65:0x00b6, code lost:
    
        if (r6 < 'a') goto L67;
     */
    /* JADX WARN: Code restructure failed: missing block: B:66:0x00b8, code lost:
    
        if (r6 > 'f') goto L67;
     */
    /* JADX WARN: Code restructure failed: missing block: B:67:0x00ba, code lost:
    
        r6 = r6 - 'W';
     */
    /* JADX WARN: Code restructure failed: missing block: B:69:0x00bf, code lost:
    
        if (r6 < 'A') goto L99;
     */
    /* JADX WARN: Code restructure failed: missing block: B:71:0x00c3, code lost:
    
        if (r6 > 'F') goto L100;
     */
    /* JADX WARN: Code restructure failed: missing block: B:72:0x00c5, code lost:
    
        r6 = r6 - '7';
     */
    /* JADX WARN: Code restructure failed: missing block: B:75:0x00dd, code lost:
    
        throw new java.lang.NumberFormatException("\\u".concat(new java.lang.String(r5, r11.f7860c, 4)));
     */
    /* JADX WARN: Code restructure failed: missing block: B:78:0x00de, code lost:
    
        r11.f7860c += 4;
     */
    /* JADX WARN: Code restructure failed: missing block: B:82:0x00e4, code lost:
    
        n("Invalid escape sequence");
     */
    /* JADX WARN: Code restructure failed: missing block: B:83:0x00e9, code lost:
    
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:84:0x00ea, code lost:
    
        r9 = '\t';
     */
    /* JADX WARN: Code restructure failed: missing block: B:86:0x00ed, code lost:
    
        r9 = '\r';
     */
    /* JADX WARN: Code restructure failed: missing block: B:88:0x00fe, code lost:
    
        continue;
     */
    /* JADX WARN: Code restructure failed: missing block: B:89:0x00f0, code lost:
    
        r9 = '\f';
     */
    /* JADX WARN: Code restructure failed: missing block: B:91:0x00f3, code lost:
    
        r9 = '\b';
     */
    /* JADX WARN: Code restructure failed: missing block: B:93:0x00fd, code lost:
    
        r9 = r7;
     */
    /* JADX WARN: Code restructure failed: missing block: B:95:0x00f6, code lost:
    
        r11.f7862e++;
        r11.f7863f = r3;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final String h(char c3) {
        char c4;
        StringBuilder sb = null;
        loop0: do {
            int i7 = this.f7860c;
            int i8 = this.f7861d;
            while (true) {
                int i9 = i8;
                int i10 = i7;
                while (true) {
                    char[] cArr = this.f7859b;
                    if (i7 >= i9) {
                        break;
                    }
                    int i11 = i7 + 1;
                    char c7 = cArr[i7];
                    if (c7 == c3) {
                        this.f7860c = i11;
                        int i12 = (i11 - i10) - 1;
                        if (sb == null) {
                            return new String(cArr, i10, i12);
                        }
                        sb.append(cArr, i10, i12);
                        return sb.toString();
                    }
                    c4 = '\n';
                    if (c7 == '\\') {
                        break;
                    }
                    if (c7 == '\n') {
                        this.f7862e++;
                        this.f7863f = i11;
                    }
                    i7 = i11;
                }
                sb.append(c4);
                i7 = this.f7860c;
                i8 = this.f7861d;
            }
        } while (c(1));
        n("Unterminated string");
        throw null;
    }

    public final boolean hasNext() {
        int i7 = this.f7864x;
        if (i7 == 0) {
            i7 = b();
        }
        return (i7 == 2 || i7 == 4 || i7 == 17) ? false : true;
    }

    /* JADX WARN: Code restructure failed: missing block: B:58:0x004b, code lost:
    
        a();
     */
    /* JADX WARN: Code restructure failed: missing block: B:59:0x004e, code lost:
    
        throw null;
     */
    /* JADX WARN: Removed duplicated region for block: B:13:0x007d  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0085  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final String i() {
        char[] cArr;
        String sb;
        int i7 = 0;
        StringBuilder sb2 = null;
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
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                } else if (i8 >= cArr.length) {
                    if (sb2 == null) {
                        sb2 = new StringBuilder(Math.max(i8, 16));
                    }
                    sb2.append(cArr, this.f7860c, i8);
                    this.f7860c += i8;
                } else if (c(i8 + 1)) {
                }
            }
            i7 = i8;
            if (sb2 != null) {
                sb = new String(cArr, this.f7860c, i7);
            } else {
                sb2.append(cArr, this.f7860c, i7);
                sb = sb2.toString();
            }
            this.f7860c += i7;
            return sb;
        } while (c(1));
        if (sb2 != null) {
        }
        this.f7860c += i7;
        return sb;
    }

    public final int j() {
        int i7 = this.f7864x;
        if (i7 == 0) {
            i7 = b();
        }
        switch (i7) {
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

    public final void n(String str) {
        StringBuilder c3 = e.c(str);
        c3.append(f());
        throw new b(c3.toString());
    }

    public final String toString() {
        return a.class.getSimpleName() + f();
    }
}
