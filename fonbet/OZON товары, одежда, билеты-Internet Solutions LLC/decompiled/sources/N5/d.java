package N5;

import Cm.e;
import N5.c;
import java.io.EOFException;
import java.io.IOException;
import kotlin.text.Charsets;
import sf.C9681g;
import sf.C9684j;
import sf.G;

/* loaded from: classes.dex */
final class d extends c {

    /* renamed from: l, reason: collision with root package name */
    private static final C9684j f18695l;

    /* renamed from: m, reason: collision with root package name */
    private static final C9684j f18696m;

    /* renamed from: n, reason: collision with root package name */
    private static final C9684j f18697n;

    /* renamed from: f, reason: collision with root package name */
    private final G f18698f;

    /* renamed from: g, reason: collision with root package name */
    private final C9681g f18699g;

    /* renamed from: h, reason: collision with root package name */
    private int f18700h;

    /* renamed from: i, reason: collision with root package name */
    private long f18701i;

    /* renamed from: j, reason: collision with root package name */
    private int f18702j;

    /* renamed from: k, reason: collision with root package name */
    private String f18703k;

    static {
        C9684j c9684j = C9684j.f98719d;
        f18695l = C9684j.a.c("'\\");
        f18696m = C9684j.a.c("\"\\");
        f18697n = C9684j.a.c("{}[]:, \n\t\r\f/\\;#=");
        C9684j.a.c("\n\r");
        C9684j.a.c("*/");
    }

    d(G g10) {
        this.f18690b = new int[32];
        this.f18691c = new String[32];
        this.f18692d = new int[32];
        this.f18700h = 0;
        this.f18698f = g10;
        this.f18699g = g10.f98667b;
        o(6);
    }

    private char B() throws IOException {
        int i11;
        G g10 = this.f18698f;
        if (!g10.n(1L)) {
            r("Unterminated escape sequence");
            throw null;
        }
        C9681g c9681g = this.f18699g;
        byte readByte = c9681g.readByte();
        if (readByte == 10 || readByte == 34 || readByte == 39 || readByte == 47 || readByte == 92) {
            return (char) readByte;
        }
        if (readByte == 98) {
            return '\b';
        }
        if (readByte == 102) {
            return '\f';
        }
        if (readByte == 110) {
            return '\n';
        }
        if (readByte == 114) {
            return '\r';
        }
        if (readByte == 116) {
            return '\t';
        }
        if (readByte != 117) {
            r("Invalid escape sequence: \\" + ((char) readByte));
            throw null;
        }
        if (!g10.n(4L)) {
            throw new EOFException("Unterminated escape sequence at path " + d());
        }
        char c11 = 0;
        for (int i12 = 0; i12 < 4; i12++) {
            byte o11 = c9681g.o(i12);
            char c12 = (char) (c11 << 4);
            if (o11 >= 48 && o11 <= 57) {
                i11 = o11 - 48;
            } else if (o11 >= 97 && o11 <= 102) {
                i11 = o11 - 87;
            } else {
                if (o11 < 65 || o11 > 70) {
                    r("\\u".concat(c9681g.I(4L, Charsets.UTF_8)));
                    throw null;
                }
                i11 = o11 - 55;
            }
            c11 = (char) (i11 + c12);
        }
        c9681g.skip(4L);
        return c11;
    }

    private void I(C9684j c9684j) throws IOException {
        while (true) {
            long F02 = this.f18698f.F0(c9684j);
            if (F02 == -1) {
                r("Unterminated string");
                throw null;
            }
            C9681g c9681g = this.f18699g;
            if (c9681g.o(F02) != 92) {
                c9681g.skip(F02 + 1);
                return;
            } else {
                c9681g.skip(F02 + 1);
                B();
            }
        }
    }

    private void s() throws IOException {
        r("Use JsonReader.setLenient(true) to accept malformed JSON");
        throw null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:101:0x01bb, code lost:
    
        if (r1 == 4) goto L153;
     */
    /* JADX WARN: Code restructure failed: missing block: B:103:0x01be, code lost:
    
        if (r1 != 7) goto L113;
     */
    /* JADX WARN: Code restructure failed: missing block: B:104:0x01c0, code lost:
    
        r22.f18702j = r2;
        r9 = 17;
        r22.f18700h = 17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:87:0x0195, code lost:
    
        if (w(r10) != false) goto L113;
     */
    /* JADX WARN: Code restructure failed: missing block: B:88:0x0197, code lost:
    
        if (r1 != 2) goto L148;
     */
    /* JADX WARN: Code restructure failed: missing block: B:89:0x0199, code lost:
    
        if (r4 == false) goto L148;
     */
    /* JADX WARN: Code restructure failed: missing block: B:91:0x019f, code lost:
    
        if (r12 != Long.MIN_VALUE) goto L141;
     */
    /* JADX WARN: Code restructure failed: missing block: B:92:0x01a1, code lost:
    
        if (r9 == false) goto L148;
     */
    /* JADX WARN: Code restructure failed: missing block: B:94:0x01a5, code lost:
    
        if (r12 != r17) goto L144;
     */
    /* JADX WARN: Code restructure failed: missing block: B:95:0x01a7, code lost:
    
        if (r9 != false) goto L148;
     */
    /* JADX WARN: Code restructure failed: missing block: B:96:0x01a9, code lost:
    
        if (r9 == false) goto L146;
     */
    /* JADX WARN: Code restructure failed: missing block: B:97:0x01ac, code lost:
    
        r12 = -r12;
     */
    /* JADX WARN: Code restructure failed: missing block: B:98:0x01ad, code lost:
    
        r22.f18701i = r12;
        r7.skip(r2);
        r9 = 16;
        r22.f18700h = 16;
     */
    /* JADX WARN: Code restructure failed: missing block: B:99:0x01b8, code lost:
    
        if (r1 == 2) goto L153;
     */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0115 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0116  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x01ed A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:68:0x01ee  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private int t() throws IOException {
        int i11;
        String str;
        String str2;
        long j11;
        char o11;
        int i12;
        char c11;
        int[] iArr = this.f18690b;
        int i13 = this.f18689a - 1;
        int i14 = iArr[i13];
        C9681g c9681g = this.f18699g;
        if (i14 == 1) {
            iArr[i13] = 2;
        } else if (i14 == 2) {
            int x11 = x(true);
            c9681g.readByte();
            if (x11 != 44) {
                if (x11 == 59) {
                    s();
                    throw null;
                }
                if (x11 == 93) {
                    this.f18700h = 4;
                    return 4;
                }
                r("Unterminated array");
                throw null;
            }
        } else {
            if (i14 == 3 || i14 == 5) {
                iArr[i13] = 4;
                if (i14 == 5) {
                    int x12 = x(true);
                    c9681g.readByte();
                    if (x12 != 44) {
                        if (x12 == 59) {
                            s();
                            throw null;
                        }
                        if (x12 == 125) {
                            this.f18700h = 2;
                            return 2;
                        }
                        r("Unterminated object");
                        throw null;
                    }
                }
                int x13 = x(true);
                if (x13 == 34) {
                    c9681g.readByte();
                    this.f18700h = 13;
                    return 13;
                }
                if (x13 == 39) {
                    c9681g.readByte();
                    s();
                    throw null;
                }
                if (x13 != 125) {
                    s();
                    throw null;
                }
                if (i14 == 5) {
                    r("Expected name");
                    throw null;
                }
                c9681g.readByte();
                this.f18700h = 2;
                return 2;
            }
            if (i14 == 4) {
                iArr[i13] = 5;
                int x14 = x(true);
                c9681g.readByte();
                if (x14 != 58) {
                    if (x14 != 61) {
                        r("Expected ':'");
                        throw null;
                    }
                    s();
                    throw null;
                }
            } else if (i14 == 6) {
                iArr[i13] = 7;
            } else {
                if (i14 == 7) {
                    if (x(false) == -1) {
                        this.f18700h = 18;
                        return 18;
                    }
                    s();
                    throw null;
                }
                if (i14 == 8) {
                    throw new IllegalStateException("JsonReader is closed");
                }
            }
        }
        int x15 = x(true);
        if (x15 == 34) {
            c9681g.readByte();
            this.f18700h = 9;
            return 9;
        }
        if (x15 == 39) {
            s();
            throw null;
        }
        if (x15 != 44 && x15 != 59) {
            if (x15 == 91) {
                c9681g.readByte();
                this.f18700h = 3;
                return 3;
            }
            if (x15 != 93) {
                if (x15 == 123) {
                    c9681g.readByte();
                    this.f18700h = 1;
                    return 1;
                }
                byte o12 = c9681g.o(0L);
                G g10 = this.f18698f;
                if (o12 == 116 || o12 == 84) {
                    i11 = 5;
                    str2 = "true";
                    str = "TRUE";
                } else if (o12 == 102 || o12 == 70) {
                    i11 = 6;
                    str2 = "false";
                    str = "FALSE";
                } else if (o12 == 110 || o12 == 78) {
                    i11 = 7;
                    str2 = "null";
                    str = "NULL";
                } else {
                    j11 = 0;
                    i11 = 0;
                    if (i11 == 0) {
                        return i11;
                    }
                    boolean z11 = true;
                    long j12 = j11;
                    char c12 = 0;
                    int i15 = 0;
                    boolean z12 = false;
                    while (true) {
                        int i16 = i15 + 1;
                        if (!g10.n(i16)) {
                            break;
                        }
                        byte o13 = c9681g.o(i15);
                        if (o13 != 43) {
                            if (o13 == 69 || o13 == 101) {
                                c11 = 6;
                                if (c12 != 2 && c12 != 4) {
                                    break;
                                }
                                c12 = 5;
                                i15 = i16;
                            } else if (o13 == 45) {
                                c11 = 6;
                                if (c12 == 0) {
                                    c12 = 1;
                                    z12 = true;
                                    i15 = i16;
                                } else {
                                    if (c12 != 5) {
                                        break;
                                    }
                                    c12 = c11;
                                    i15 = i16;
                                }
                            } else if (o13 == 46) {
                                c11 = 6;
                                if (c12 != 2) {
                                    break;
                                }
                                c12 = 3;
                                i15 = i16;
                            } else {
                                if (o13 < 48 || o13 > 57) {
                                    break;
                                }
                                if (c12 == 1 || c12 == 0) {
                                    c11 = 6;
                                    j12 = -(o13 - 48);
                                    c12 = 2;
                                } else {
                                    if (c12 == 2) {
                                        if (j12 == j11) {
                                            break;
                                        }
                                        long j13 = (10 * j12) - (o13 - 48);
                                        z11 &= j12 > -922337203685477580L || (j12 == -922337203685477580L && j13 < j12);
                                        j12 = j13;
                                    } else if (c12 == 3) {
                                        c12 = 4;
                                    } else {
                                        c11 = 6;
                                        if (c12 == 5 || c12 == 6) {
                                            c12 = 7;
                                        }
                                    }
                                    c11 = 6;
                                    i15 = i16;
                                }
                                i15 = i16;
                            }
                            if (i12 == 0) {
                                return i12;
                            }
                            if (w(c9681g.o(j11))) {
                                s();
                                throw null;
                            }
                            r("Expected value");
                            throw null;
                        }
                        c11 = 6;
                        if (c12 != 5) {
                            break;
                        }
                        c12 = c11;
                        i15 = i16;
                    }
                    i12 = 0;
                    if (i12 == 0) {
                    }
                }
                int length = str2.length();
                j11 = 0;
                int i17 = 1;
                while (true) {
                    if (i17 < length) {
                        int i18 = i17 + 1;
                        if (!g10.n(i18) || ((o11 = c9681g.o(i17)) != str2.charAt(i17) && o11 != str.charAt(i17))) {
                            break;
                        }
                        i17 = i18;
                    } else if (!g10.n(length + 1) || !w(c9681g.o(length))) {
                        c9681g.skip(length);
                        this.f18700h = i11;
                    }
                }
                i11 = 0;
                if (i11 == 0) {
                }
            } else if (i14 == 1) {
                c9681g.readByte();
                this.f18700h = 4;
                return 4;
            }
        }
        if (i14 == 1 || i14 == 2) {
            s();
            throw null;
        }
        r("Unexpected value");
        throw null;
    }

    private int v(String str, c.a aVar) {
        int length = aVar.f18693a.length;
        for (int i11 = 0; i11 < length; i11++) {
            if (str.equals(aVar.f18693a[i11])) {
                this.f18700h = 0;
                this.f18691c[this.f18689a - 1] = str;
                return i11;
            }
        }
        return -1;
    }

    private boolean w(int i11) throws IOException {
        if (i11 == 9 || i11 == 10 || i11 == 12 || i11 == 13 || i11 == 32) {
            return false;
        }
        if (i11 != 35) {
            if (i11 == 44) {
                return false;
            }
            if (i11 != 47 && i11 != 61) {
                if (i11 == 123 || i11 == 125 || i11 == 58) {
                    return false;
                }
                if (i11 != 59) {
                    switch (i11) {
                        case 91:
                        case 93:
                            return false;
                        case 92:
                            break;
                        default:
                            return true;
                    }
                }
            }
        }
        s();
        throw null;
    }

    private int x(boolean z11) throws IOException {
        int i11 = 0;
        while (true) {
            int i12 = i11 + 1;
            G g10 = this.f18698f;
            if (!g10.n(i12)) {
                if (z11) {
                    throw new EOFException("End of input");
                }
                return -1;
            }
            long j11 = i11;
            C9681g c9681g = this.f18699g;
            byte o11 = c9681g.o(j11);
            if (o11 != 10 && o11 != 32 && o11 != 13 && o11 != 9) {
                c9681g.skip(j11);
                if (o11 == 47) {
                    if (g10.n(2L)) {
                        s();
                        throw null;
                    }
                } else if (o11 == 35) {
                    s();
                    throw null;
                }
                return o11;
            }
            i11 = i12;
        }
    }

    private String y(C9684j c9684j) throws IOException {
        StringBuilder sb2 = null;
        while (true) {
            long F02 = this.f18698f.F0(c9684j);
            if (F02 == -1) {
                r("Unterminated string");
                throw null;
            }
            C9681g c9681g = this.f18699g;
            if (c9681g.o(F02) != 92) {
                if (sb2 == null) {
                    String I11 = c9681g.I(F02, Charsets.UTF_8);
                    c9681g.readByte();
                    return I11;
                }
                sb2.append(c9681g.I(F02, Charsets.UTF_8));
                c9681g.readByte();
                return sb2.toString();
            }
            if (sb2 == null) {
                sb2 = new StringBuilder();
            }
            sb2.append(c9681g.I(F02, Charsets.UTF_8));
            c9681g.readByte();
            sb2.append(B());
        }
    }

    private String z() throws IOException {
        long F02 = this.f18698f.F0(f18697n);
        C9681g c9681g = this.f18699g;
        if (F02 == -1) {
            return c9681g.G0();
        }
        c9681g.getClass();
        return c9681g.I(F02, Charsets.UTF_8);
    }

    @Override // N5.c
    public final void beginArray() throws IOException {
        int i11 = this.f18700h;
        if (i11 == 0) {
            i11 = t();
        }
        if (i11 == 3) {
            o(1);
            this.f18692d[this.f18689a - 1] = 0;
            this.f18700h = 0;
        } else {
            throw new a("Expected BEGIN_ARRAY but was " + m() + " at path " + d());
        }
    }

    @Override // N5.c
    public final void beginObject() throws IOException {
        int i11 = this.f18700h;
        if (i11 == 0) {
            i11 = t();
        }
        if (i11 == 1) {
            o(3);
            this.f18700h = 0;
        } else {
            throw new a("Expected BEGIN_OBJECT but was " + m() + " at path " + d());
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws IOException {
        this.f18700h = 0;
        this.f18690b[0] = 8;
        this.f18689a = 1;
        this.f18699g.c();
        this.f18698f.close();
    }

    @Override // N5.c
    public final void endArray() throws IOException {
        int i11 = this.f18700h;
        if (i11 == 0) {
            i11 = t();
        }
        if (i11 != 4) {
            throw new a("Expected END_ARRAY but was " + m() + " at path " + d());
        }
        int i12 = this.f18689a;
        this.f18689a = i12 - 1;
        int[] iArr = this.f18692d;
        int i13 = i12 - 2;
        iArr[i13] = iArr[i13] + 1;
        this.f18700h = 0;
    }

    @Override // N5.c
    public final void endObject() throws IOException {
        int i11 = this.f18700h;
        if (i11 == 0) {
            i11 = t();
        }
        if (i11 != 2) {
            throw new a("Expected END_OBJECT but was " + m() + " at path " + d());
        }
        int i12 = this.f18689a;
        int i13 = i12 - 1;
        this.f18689a = i13;
        this.f18691c[i13] = null;
        int[] iArr = this.f18692d;
        int i14 = i12 - 2;
        iArr[i14] = iArr[i14] + 1;
        this.f18700h = 0;
    }

    @Override // N5.c
    public final boolean hasNext() throws IOException {
        int i11 = this.f18700h;
        if (i11 == 0) {
            i11 = t();
        }
        return (i11 == 2 || i11 == 4 || i11 == 18) ? false : true;
    }

    @Override // N5.c
    public final boolean j() throws IOException {
        int i11 = this.f18700h;
        if (i11 == 0) {
            i11 = t();
        }
        if (i11 == 5) {
            this.f18700h = 0;
            int[] iArr = this.f18692d;
            int i12 = this.f18689a - 1;
            iArr[i12] = iArr[i12] + 1;
            return true;
        }
        if (i11 == 6) {
            this.f18700h = 0;
            int[] iArr2 = this.f18692d;
            int i13 = this.f18689a - 1;
            iArr2[i13] = iArr2[i13] + 1;
            return false;
        }
        throw new a("Expected a boolean but was " + m() + " at path " + d());
    }

    @Override // N5.c
    public final c.b m() throws IOException {
        int i11 = this.f18700h;
        if (i11 == 0) {
            i11 = t();
        }
        switch (i11) {
            case 1:
                return c.b.BEGIN_OBJECT;
            case 2:
                return c.b.END_OBJECT;
            case 3:
                return c.b.BEGIN_ARRAY;
            case 4:
                return c.b.END_ARRAY;
            case 5:
            case 6:
                return c.b.BOOLEAN;
            case 7:
                return c.b.NULL;
            case 8:
            case 9:
            case 10:
            case 11:
                return c.b.STRING;
            case 12:
            case 13:
            case 14:
            case 15:
                return c.b.NAME;
            case 16:
            case 17:
                return c.b.NUMBER;
            case 18:
                return c.b.END_DOCUMENT;
            default:
                throw new AssertionError();
        }
    }

    @Override // N5.c
    public final double nextDouble() throws IOException {
        int i11 = this.f18700h;
        if (i11 == 0) {
            i11 = t();
        }
        if (i11 == 16) {
            this.f18700h = 0;
            int[] iArr = this.f18692d;
            int i12 = this.f18689a - 1;
            iArr[i12] = iArr[i12] + 1;
            return this.f18701i;
        }
        if (i11 == 17) {
            long j11 = this.f18702j;
            C9681g c9681g = this.f18699g;
            c9681g.getClass();
            this.f18703k = c9681g.I(j11, Charsets.UTF_8);
        } else if (i11 == 9) {
            this.f18703k = y(f18696m);
        } else if (i11 == 8) {
            this.f18703k = y(f18695l);
        } else if (i11 == 10) {
            this.f18703k = z();
        } else if (i11 != 11) {
            throw new a("Expected a double but was " + m() + " at path " + d());
        }
        this.f18700h = 11;
        try {
            double parseDouble = Double.parseDouble(this.f18703k);
            if (Double.isNaN(parseDouble) || Double.isInfinite(parseDouble)) {
                StringBuilder e11 = e.e(parseDouble, "JSON forbids NaN and infinities: ", " at path ");
                e11.append(d());
                throw new b(e11.toString());
            }
            this.f18703k = null;
            this.f18700h = 0;
            int[] iArr2 = this.f18692d;
            int i13 = this.f18689a - 1;
            iArr2[i13] = iArr2[i13] + 1;
            return parseDouble;
        } catch (NumberFormatException unused) {
            throw new a("Expected a double but was " + this.f18703k + " at path " + d());
        }
    }

    @Override // N5.c
    public final int nextInt() throws IOException {
        int i11 = this.f18700h;
        if (i11 == 0) {
            i11 = t();
        }
        if (i11 == 16) {
            long j11 = this.f18701i;
            int i12 = (int) j11;
            if (j11 == i12) {
                this.f18700h = 0;
                int[] iArr = this.f18692d;
                int i13 = this.f18689a - 1;
                iArr[i13] = iArr[i13] + 1;
                return i12;
            }
            throw new a("Expected an int but was " + this.f18701i + " at path " + d());
        }
        if (i11 == 17) {
            long j12 = this.f18702j;
            C9681g c9681g = this.f18699g;
            c9681g.getClass();
            this.f18703k = c9681g.I(j12, Charsets.UTF_8);
        } else if (i11 == 9 || i11 == 8) {
            String y11 = i11 == 9 ? y(f18696m) : y(f18695l);
            this.f18703k = y11;
            try {
                int parseInt = Integer.parseInt(y11);
                this.f18700h = 0;
                int[] iArr2 = this.f18692d;
                int i14 = this.f18689a - 1;
                iArr2[i14] = iArr2[i14] + 1;
                return parseInt;
            } catch (NumberFormatException unused) {
            }
        } else if (i11 != 11) {
            throw new a("Expected an int but was " + m() + " at path " + d());
        }
        this.f18700h = 11;
        try {
            double parseDouble = Double.parseDouble(this.f18703k);
            int i15 = (int) parseDouble;
            if (i15 != parseDouble) {
                throw new a("Expected an int but was " + this.f18703k + " at path " + d());
            }
            this.f18703k = null;
            this.f18700h = 0;
            int[] iArr3 = this.f18692d;
            int i16 = this.f18689a - 1;
            iArr3[i16] = iArr3[i16] + 1;
            return i15;
        } catch (NumberFormatException unused2) {
            throw new a("Expected an int but was " + this.f18703k + " at path " + d());
        }
    }

    @Override // N5.c
    public final String nextName() throws IOException {
        String str;
        int i11 = this.f18700h;
        if (i11 == 0) {
            i11 = t();
        }
        if (i11 == 14) {
            str = z();
        } else if (i11 == 13) {
            str = y(f18696m);
        } else if (i11 == 12) {
            str = y(f18695l);
        } else {
            if (i11 != 15) {
                throw new a("Expected a name but was " + m() + " at path " + d());
            }
            str = this.f18703k;
        }
        this.f18700h = 0;
        this.f18691c[this.f18689a - 1] = str;
        return str;
    }

    @Override // N5.c
    public final String nextString() throws IOException {
        String I11;
        int i11 = this.f18700h;
        if (i11 == 0) {
            i11 = t();
        }
        if (i11 == 10) {
            I11 = z();
        } else if (i11 == 9) {
            I11 = y(f18696m);
        } else if (i11 == 8) {
            I11 = y(f18695l);
        } else if (i11 == 11) {
            I11 = this.f18703k;
            this.f18703k = null;
        } else if (i11 == 16) {
            I11 = Long.toString(this.f18701i);
        } else {
            if (i11 != 17) {
                throw new a("Expected a string but was " + m() + " at path " + d());
            }
            long j11 = this.f18702j;
            C9681g c9681g = this.f18699g;
            c9681g.getClass();
            I11 = c9681g.I(j11, Charsets.UTF_8);
        }
        this.f18700h = 0;
        int[] iArr = this.f18692d;
        int i12 = this.f18689a - 1;
        iArr[i12] = iArr[i12] + 1;
        return I11;
    }

    @Override // N5.c
    public final int p(c.a aVar) throws IOException {
        int i11 = this.f18700h;
        if (i11 == 0) {
            i11 = t();
        }
        if (i11 < 12 || i11 > 15) {
            return -1;
        }
        if (i11 == 15) {
            return v(this.f18703k, aVar);
        }
        int R02 = this.f18698f.R0(aVar.f18694b);
        if (R02 != -1) {
            this.f18700h = 0;
            this.f18691c[this.f18689a - 1] = aVar.f18693a[R02];
            return R02;
        }
        String str = this.f18691c[this.f18689a - 1];
        String nextName = nextName();
        int v11 = v(nextName, aVar);
        if (v11 == -1) {
            this.f18700h = 15;
            this.f18703k = nextName;
            this.f18691c[this.f18689a - 1] = str;
        }
        return v11;
    }

    @Override // N5.c
    public final void q() throws IOException {
        int i11 = this.f18700h;
        if (i11 == 0) {
            i11 = t();
        }
        if (i11 == 14) {
            long F02 = this.f18698f.F0(f18697n);
            C9681g c9681g = this.f18699g;
            if (F02 == -1) {
                F02 = c9681g.size();
            }
            c9681g.skip(F02);
        } else if (i11 == 13) {
            I(f18696m);
        } else if (i11 == 12) {
            I(f18695l);
        } else if (i11 != 15) {
            throw new a("Expected a name but was " + m() + " at path " + d());
        }
        this.f18700h = 0;
        this.f18691c[this.f18689a - 1] = "null";
    }

    @Override // N5.c
    public final void skipValue() throws IOException {
        int i11 = 0;
        do {
            int i12 = this.f18700h;
            if (i12 == 0) {
                i12 = t();
            }
            if (i12 == 3) {
                o(1);
            } else if (i12 == 1) {
                o(3);
            } else {
                if (i12 == 4) {
                    i11--;
                    if (i11 < 0) {
                        throw new a("Expected a value but was " + m() + " at path " + d());
                    }
                    this.f18689a--;
                } else if (i12 == 2) {
                    i11--;
                    if (i11 < 0) {
                        throw new a("Expected a value but was " + m() + " at path " + d());
                    }
                    this.f18689a--;
                } else {
                    C9681g c9681g = this.f18699g;
                    if (i12 == 14 || i12 == 10) {
                        long F02 = this.f18698f.F0(f18697n);
                        if (F02 == -1) {
                            F02 = c9681g.size();
                        }
                        c9681g.skip(F02);
                    } else if (i12 == 9 || i12 == 13) {
                        I(f18696m);
                    } else if (i12 == 8 || i12 == 12) {
                        I(f18695l);
                    } else if (i12 == 17) {
                        c9681g.skip(this.f18702j);
                    } else if (i12 == 18) {
                        throw new a("Expected a value but was " + m() + " at path " + d());
                    }
                }
                this.f18700h = 0;
            }
            i11++;
            this.f18700h = 0;
        } while (i11 != 0);
        int[] iArr = this.f18692d;
        int i13 = this.f18689a - 1;
        iArr[i13] = iArr[i13] + 1;
        this.f18691c[i13] = "null";
    }

    public final String toString() {
        return "JsonReader(" + this.f18698f + ")";
    }
}
