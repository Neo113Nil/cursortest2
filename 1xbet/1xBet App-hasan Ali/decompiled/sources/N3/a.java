package N3;

import a3.AbstractC0467k;
import j3.i;
import java.io.Closeable;
import java.io.EOFException;
import java.util.Arrays;
import n.AbstractC2107A;
import y4.A;

/* loaded from: classes.dex */
public class a implements Closeable, AutoCloseable {

    /* renamed from: k, reason: collision with root package name */
    public final A f3763k;

    /* renamed from: r, reason: collision with root package name */
    public long f3770r;

    /* renamed from: s, reason: collision with root package name */
    public int f3771s;

    /* renamed from: t, reason: collision with root package name */
    public String f3772t;

    /* renamed from: u, reason: collision with root package name */
    public int[] f3773u;

    /* renamed from: w, reason: collision with root package name */
    public String[] f3775w;

    /* renamed from: x, reason: collision with root package name */
    public int[] f3776x;

    /* renamed from: y, reason: collision with root package name */
    public int f3777y = 2;

    /* renamed from: l, reason: collision with root package name */
    public final char[] f3764l = new char[1024];

    /* renamed from: m, reason: collision with root package name */
    public int f3765m = 0;

    /* renamed from: n, reason: collision with root package name */
    public int f3766n = 0;

    /* renamed from: o, reason: collision with root package name */
    public int f3767o = 0;

    /* renamed from: p, reason: collision with root package name */
    public int f3768p = 0;

    /* renamed from: q, reason: collision with root package name */
    public int f3769q = 0;

    /* renamed from: v, reason: collision with root package name */
    public int f3774v = 1;

    static {
        i.f17519m = new i(22);
    }

    public a(A a5) {
        int[] iArr = new int[32];
        this.f3773u = iArr;
        iArr[0] = 6;
        this.f3775w = new String[32];
        this.f3776x = new int[32];
        this.f3763k = a5;
    }

    public final long A() {
        int i = this.f3769q;
        if (i == 0) {
            i = h();
        }
        if (i == 15) {
            this.f3769q = 0;
            int[] iArr = this.f3776x;
            int i5 = this.f3774v - 1;
            iArr[i5] = iArr[i5] + 1;
            return this.f3770r;
        }
        if (i == 16) {
            this.f3772t = new String(this.f3764l, this.f3765m, this.f3771s);
            this.f3765m += this.f3771s;
        } else {
            if (i != 8 && i != 9 && i != 10) {
                throw S("a long");
            }
            if (i == 10) {
                this.f3772t = J();
            } else {
                this.f3772t = H(i == 8 ? '\'' : '\"');
            }
            try {
                long parseLong = Long.parseLong(this.f3772t);
                this.f3769q = 0;
                int[] iArr2 = this.f3776x;
                int i6 = this.f3774v - 1;
                iArr2[i6] = iArr2[i6] + 1;
                return parseLong;
            } catch (NumberFormatException unused) {
            }
        }
        this.f3769q = 11;
        double parseDouble = Double.parseDouble(this.f3772t);
        long j5 = (long) parseDouble;
        if (j5 != parseDouble) {
            throw new NumberFormatException("Expected a long but was " + this.f3772t + r());
        }
        this.f3772t = null;
        this.f3769q = 0;
        int[] iArr3 = this.f3776x;
        int i7 = this.f3774v - 1;
        iArr3[i7] = iArr3[i7] + 1;
        return j5;
    }

    public final String E() {
        String H5;
        int i = this.f3769q;
        if (i == 0) {
            i = h();
        }
        if (i == 14) {
            H5 = J();
        } else if (i == 12) {
            H5 = H('\'');
        } else {
            if (i != 13) {
                throw S("a name");
            }
            H5 = H('\"');
        }
        this.f3769q = 0;
        this.f3775w[this.f3774v - 1] = H5;
        return H5;
    }

    public final int F(boolean z3) {
        char c5;
        int i = this.f3765m;
        int i5 = this.f3766n;
        while (true) {
            if (i == i5) {
                this.f3765m = i;
                if (!l(1)) {
                    if (!z3) {
                        return -1;
                    }
                    throw new EOFException("End of input" + r());
                }
                i = this.f3765m;
                i5 = this.f3766n;
            }
            int i6 = i + 1;
            char[] cArr = this.f3764l;
            c5 = cArr[i];
            if (c5 == '\n') {
                this.f3767o++;
                this.f3768p = i6;
            } else if (c5 != ' ' && c5 != '\r' && c5 != '\t') {
                if (c5 == '/') {
                    this.f3765m = i6;
                    if (i6 == i5) {
                        this.f3765m = i;
                        boolean l5 = l(2);
                        this.f3765m++;
                        if (!l5) {
                            break;
                        }
                    }
                    f();
                    int i7 = this.f3765m;
                    char c6 = cArr[i7];
                    if (c6 == '*') {
                        this.f3765m = i7 + 1;
                        while (true) {
                            if (this.f3765m + 2 > this.f3766n && !l(2)) {
                                R("Unterminated comment");
                                throw null;
                            }
                            int i8 = this.f3765m;
                            if (cArr[i8] != '\n') {
                                for (int i9 = 0; i9 < 2; i9++) {
                                    if (cArr[this.f3765m + i9] != "*/".charAt(i9)) {
                                        break;
                                    }
                                }
                                i = this.f3765m + 2;
                                i5 = this.f3766n;
                                break;
                            }
                            this.f3767o++;
                            this.f3768p = i8 + 1;
                            this.f3765m++;
                        }
                    } else {
                        if (c6 != '/') {
                            break;
                        }
                        this.f3765m = i7 + 1;
                        O();
                        i = this.f3765m;
                        i5 = this.f3766n;
                    }
                } else {
                    if (c5 != '#') {
                        this.f3765m = i6;
                        return c5;
                    }
                    this.f3765m = i6;
                    f();
                    O();
                    i = this.f3765m;
                    i5 = this.f3766n;
                }
            }
            i = i6;
        }
        return c5;
    }

    public final void G() {
        int i = this.f3769q;
        if (i == 0) {
            i = h();
        }
        if (i != 7) {
            throw S("null");
        }
        this.f3769q = 0;
        int[] iArr = this.f3776x;
        int i5 = this.f3774v - 1;
        iArr[i5] = iArr[i5] + 1;
    }

    /* JADX WARN: Code restructure failed: missing block: B:24:0x003d, code lost:
    
        r11.f3765m = r8;
        r8 = r8 - r3;
        r2 = r8 - 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x0042, code lost:
    
        if (r1 != null) goto L44;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x0044, code lost:
    
        r1 = new java.lang.StringBuilder(java.lang.Math.max(r8 * 2, 16));
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x006b, code lost:
    
        if (r1 != null) goto L33;
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x006d, code lost:
    
        r1 = new java.lang.StringBuilder(java.lang.Math.max((r2 - r3) * 2, 16));
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x007b, code lost:
    
        r1.append(r5, r3, r2 - r3);
        r11.f3765m = r2;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final String H(char c5) {
        char[] cArr;
        int i;
        StringBuilder sb = null;
        do {
            int i5 = this.f3765m;
            int i6 = this.f3766n;
            while (true) {
                int i7 = i6;
                int i8 = i5;
                while (true) {
                    cArr = this.f3764l;
                    if (i5 >= i7) {
                        break;
                    }
                    int i9 = i5 + 1;
                    char c6 = cArr[i5];
                    if (this.f3777y == 3 && c6 < ' ') {
                        R("Unescaped control characters (\\u0000-\\u001F) are not allowed in strict mode");
                        throw null;
                    }
                    if (c6 == c5) {
                        this.f3765m = i9;
                        int i10 = (i9 - i8) - 1;
                        if (sb == null) {
                            return new String(cArr, i8, i10);
                        }
                        sb.append(cArr, i8, i10);
                        return sb.toString();
                    }
                    if (c6 == '\\') {
                        break;
                    }
                    if (c6 == '\n') {
                        this.f3767o++;
                        this.f3768p = i9;
                    }
                    i5 = i9;
                }
                sb.append(cArr, i8, i);
                sb.append(M());
                i5 = this.f3765m;
                i6 = this.f3766n;
            }
        } while (l(1));
        R("Unterminated string");
        throw null;
    }

    public final String I() {
        String str;
        int i = this.f3769q;
        if (i == 0) {
            i = h();
        }
        if (i == 10) {
            str = J();
        } else if (i == 8) {
            str = H('\'');
        } else if (i == 9) {
            str = H('\"');
        } else if (i == 11) {
            str = this.f3772t;
            this.f3772t = null;
        } else if (i == 15) {
            str = Long.toString(this.f3770r);
        } else {
            if (i != 16) {
                throw S("a string");
            }
            str = new String(this.f3764l, this.f3765m, this.f3771s);
            this.f3765m += this.f3771s;
        }
        this.f3769q = 0;
        int[] iArr = this.f3776x;
        int i5 = this.f3774v - 1;
        iArr[i5] = iArr[i5] + 1;
        return str;
    }

    /* JADX WARN: Code restructure failed: missing block: B:58:0x004a, code lost:
    
        f();
     */
    /* JADX WARN: Failed to find 'out' block for switch in B:54:0x0044. Please report as an issue. */
    /* JADX WARN: Removed duplicated region for block: B:13:0x007c  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0084  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final String J() {
        char[] cArr;
        String sb;
        StringBuilder sb2 = null;
        int i = 0;
        do {
            int i5 = 0;
            while (true) {
                int i6 = this.f3765m;
                int i7 = i6 + i5;
                int i8 = this.f3766n;
                cArr = this.f3764l;
                if (i7 < i8) {
                    char c5 = cArr[i6 + i5];
                    if (c5 != '\t' && c5 != '\n' && c5 != '\f' && c5 != '\r' && c5 != ' ') {
                        if (c5 != '#') {
                            if (c5 != ',') {
                                if (c5 != '/' && c5 != '=') {
                                    if (c5 != '{' && c5 != '}' && c5 != ':') {
                                        if (c5 != ';') {
                                            switch (c5) {
                                                case '[':
                                                case ']':
                                                    break;
                                                case '\\':
                                                    break;
                                                default:
                                                    i5++;
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                } else if (i5 >= cArr.length) {
                    if (sb2 == null) {
                        sb2 = new StringBuilder(Math.max(i5, 16));
                    }
                    sb2.append(cArr, this.f3765m, i5);
                    this.f3765m += i5;
                } else if (l(i5 + 1)) {
                }
            }
            i = i5;
            if (sb2 != null) {
                sb = new String(cArr, this.f3765m, i);
            } else {
                sb2.append(cArr, this.f3765m, i);
                sb = sb2.toString();
            }
            this.f3765m += i;
            return sb;
        } while (l(1));
        if (sb2 != null) {
        }
        this.f3765m += i;
        return sb;
    }

    public final int K() {
        int i = this.f3769q;
        if (i == 0) {
            i = h();
        }
        switch (i) {
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

    public final void L(int i) {
        int i5 = this.f3774v;
        int[] iArr = this.f3773u;
        if (i5 == iArr.length) {
            int i6 = i5 * 2;
            this.f3773u = Arrays.copyOf(iArr, i6);
            this.f3776x = Arrays.copyOf(this.f3776x, i6);
            this.f3775w = (String[]) Arrays.copyOf(this.f3775w, i6);
        }
        int[] iArr2 = this.f3773u;
        int i7 = this.f3774v;
        this.f3774v = i7 + 1;
        iArr2[i7] = i;
    }

    public final char M() {
        int i;
        if (this.f3765m == this.f3766n && !l(1)) {
            R("Unterminated escape sequence");
            throw null;
        }
        int i5 = this.f3765m;
        int i6 = i5 + 1;
        this.f3765m = i6;
        char[] cArr = this.f3764l;
        char c5 = cArr[i5];
        if (c5 != '\n') {
            if (c5 != '\"') {
                if (c5 != '\'') {
                    if (c5 != '/' && c5 != '\\') {
                        if (c5 == 'b') {
                            return '\b';
                        }
                        if (c5 == 'f') {
                            return '\f';
                        }
                        if (c5 == 'n') {
                            return '\n';
                        }
                        if (c5 == 'r') {
                            return '\r';
                        }
                        if (c5 == 't') {
                            return '\t';
                        }
                        if (c5 != 'u') {
                            R("Invalid escape sequence");
                            throw null;
                        }
                        if (i5 + 5 > this.f3766n && !l(4)) {
                            R("Unterminated escape sequence");
                            throw null;
                        }
                        int i7 = this.f3765m;
                        int i8 = i7 + 4;
                        int i9 = 0;
                        while (i7 < i8) {
                            char c6 = cArr[i7];
                            int i10 = i9 << 4;
                            if (c6 >= '0' && c6 <= '9') {
                                i = c6 - '0';
                            } else if (c6 >= 'a' && c6 <= 'f') {
                                i = c6 - 'W';
                            } else {
                                if (c6 < 'A' || c6 > 'F') {
                                    R("Malformed Unicode escape \\u".concat(new String(cArr, this.f3765m, 4)));
                                    throw null;
                                }
                                i = c6 - '7';
                            }
                            i9 = i + i10;
                            i7++;
                        }
                        this.f3765m += 4;
                        return (char) i9;
                    }
                }
            }
            return c5;
        }
        if (this.f3777y == 3) {
            R("Cannot escape a newline character in strict mode");
            throw null;
        }
        this.f3767o++;
        this.f3768p = i6;
        if (this.f3777y == 3) {
            R("Invalid escaped character \"'\" in strict mode");
            throw null;
        }
        return c5;
    }

    public final void N(char c5) {
        do {
            int i = this.f3765m;
            int i5 = this.f3766n;
            while (i < i5) {
                int i6 = i + 1;
                char c6 = this.f3764l[i];
                if (c6 == c5) {
                    this.f3765m = i6;
                    return;
                }
                if (c6 == '\\') {
                    this.f3765m = i6;
                    M();
                    i = this.f3765m;
                    i5 = this.f3766n;
                } else {
                    if (c6 == '\n') {
                        this.f3767o++;
                        this.f3768p = i6;
                    }
                    i = i6;
                }
            }
            this.f3765m = i;
        } while (l(1));
        R("Unterminated string");
        throw null;
    }

    public final void O() {
        char c5;
        do {
            if (this.f3765m >= this.f3766n && !l(1)) {
                return;
            }
            int i = this.f3765m;
            int i5 = i + 1;
            this.f3765m = i5;
            c5 = this.f3764l[i];
            if (c5 == '\n') {
                this.f3767o++;
                this.f3768p = i5;
                return;
            }
        } while (c5 != '\r');
    }

    /* JADX WARN: Code restructure failed: missing block: B:33:0x0048, code lost:
    
        f();
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void P() {
        do {
            int i = 0;
            while (true) {
                int i5 = this.f3765m;
                if (i5 + i < this.f3766n) {
                    char c5 = this.f3764l[i5 + i];
                    if (c5 != '\t' && c5 != '\n' && c5 != '\f' && c5 != '\r' && c5 != ' ') {
                        if (c5 != '#') {
                            if (c5 != ',') {
                                if (c5 != '/' && c5 != '=') {
                                    if (c5 != '{' && c5 != '}' && c5 != ':') {
                                        if (c5 != ';') {
                                            switch (c5) {
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
                    this.f3765m = i5 + i;
                }
            }
            this.f3765m += i;
            return;
        } while (l(1));
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    public final void Q() {
        int i = 0;
        do {
            int i5 = this.f3769q;
            if (i5 == 0) {
                i5 = h();
            }
            switch (i5) {
                case 1:
                    L(3);
                    i++;
                    this.f3769q = 0;
                    break;
                case 2:
                    if (i == 0) {
                        this.f3775w[this.f3774v - 1] = null;
                    }
                    this.f3774v--;
                    i--;
                    this.f3769q = 0;
                    break;
                case 3:
                    L(1);
                    i++;
                    this.f3769q = 0;
                    break;
                case 4:
                    this.f3774v--;
                    i--;
                    this.f3769q = 0;
                    break;
                case 5:
                case 6:
                case 7:
                case 11:
                case 15:
                default:
                    this.f3769q = 0;
                    break;
                case 8:
                    N('\'');
                    this.f3769q = 0;
                    break;
                case 9:
                    N('\"');
                    this.f3769q = 0;
                    break;
                case 10:
                    P();
                    this.f3769q = 0;
                    break;
                case 12:
                    N('\'');
                    if (i == 0) {
                        this.f3775w[this.f3774v - 1] = "<skipped>";
                    }
                    this.f3769q = 0;
                    break;
                case 13:
                    N('\"');
                    if (i == 0) {
                        this.f3775w[this.f3774v - 1] = "<skipped>";
                    }
                    this.f3769q = 0;
                    break;
                case 14:
                    P();
                    if (i == 0) {
                        this.f3775w[this.f3774v - 1] = "<skipped>";
                    }
                    this.f3769q = 0;
                    break;
                case 16:
                    this.f3765m += this.f3771s;
                    this.f3769q = 0;
                    break;
                case 17:
                    break;
            }
            return;
        } while (i > 0);
        int[] iArr = this.f3776x;
        int i6 = this.f3774v - 1;
        iArr[i6] = iArr[i6] + 1;
    }

    public final void R(String str) {
        throw new c(str + r() + "\nSee " + "https://github.com/google/gson/blob/main/Troubleshooting.md#".concat("malformed-json"));
    }

    public final IllegalStateException S(String str) {
        String str2 = K() == 9 ? "adapter-not-null-safe" : "unexpected-json-structure";
        StringBuilder w5 = AbstractC0467k.w("Expected ", str, " but was ");
        w5.append(L1.a.u(K()));
        w5.append(r());
        w5.append("\nSee ");
        w5.append("https://github.com/google/gson/blob/main/Troubleshooting.md#".concat(str2));
        return new IllegalStateException(w5.toString());
    }

    public final void b() {
        int i = this.f3769q;
        if (i == 0) {
            i = h();
        }
        if (i != 3) {
            throw S("BEGIN_ARRAY");
        }
        L(1);
        this.f3776x[this.f3774v - 1] = 0;
        this.f3769q = 0;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        this.f3769q = 0;
        this.f3773u[0] = 8;
        this.f3774v = 1;
        this.f3763k.close();
    }

    public final void d() {
        int i = this.f3769q;
        if (i == 0) {
            i = h();
        }
        if (i != 1) {
            throw S("BEGIN_OBJECT");
        }
        L(3);
        this.f3769q = 0;
    }

    public final void f() {
        if (this.f3777y == 1) {
            return;
        }
        R("Use JsonReader.setStrictness(Strictness.LENIENT) to accept malformed JSON");
        throw null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:112:0x0218, code lost:
    
        if (p(r7) != false) goto L125;
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x01a9, code lost:
    
        r8 = 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x021b, code lost:
    
        if (r11 != 2) goto L185;
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x021d, code lost:
    
        if (r14 == false) goto L177;
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x0223, code lost:
    
        if (r1 != Long.MIN_VALUE) goto L178;
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x0225, code lost:
    
        if (r17 == 0) goto L177;
     */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x022c, code lost:
    
        if (r1 != 0) goto L181;
     */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x022e, code lost:
    
        if (r17 != 0) goto L177;
     */
    /* JADX WARN: Code restructure failed: missing block: B:49:0x0230, code lost:
    
        if (r17 == 0) goto L183;
     */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x0233, code lost:
    
        r1 = -r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x0234, code lost:
    
        r24.f3770r = r1;
        r24.f3765m += r13;
        r10 = 15;
        r24.f3769q = 15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:60:0x0228, code lost:
    
        r8 = 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:61:0x0240, code lost:
    
        if (r11 == r8) goto L190;
     */
    /* JADX WARN: Code restructure failed: missing block: B:63:0x0243, code lost:
    
        if (r11 == 4) goto L190;
     */
    /* JADX WARN: Code restructure failed: missing block: B:65:0x0246, code lost:
    
        if (r11 != 7) goto L125;
     */
    /* JADX WARN: Code restructure failed: missing block: B:67:0x0248, code lost:
    
        r24.f3771s = r13;
        r10 = 16;
        r24.f3769q = 16;
     */
    /* JADX WARN: Removed duplicated region for block: B:184:0x02b3  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0188 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0189  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x0270 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:54:0x0271  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x00ea  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final int h() {
        int F5;
        int i;
        int F6;
        String str;
        String str2;
        int i5;
        char c5;
        int i6;
        int[] iArr = this.f3773u;
        int i7 = this.f3774v - 1;
        int i8 = iArr[i7];
        char[] cArr = this.f3764l;
        if (i8 == 1) {
            iArr[i7] = 2;
        } else if (i8 == 2) {
            int F7 = F(true);
            if (F7 != 44) {
                if (F7 != 59) {
                    if (F7 == 93) {
                        this.f3769q = 4;
                        return 4;
                    }
                    R("Unterminated array");
                    throw null;
                }
                f();
            }
        } else {
            if (i8 == 3 || i8 == 5) {
                iArr[i7] = 4;
                if (i8 == 5 && (F5 = F(true)) != 44) {
                    if (F5 != 59) {
                        if (F5 == 125) {
                            this.f3769q = 2;
                            return 2;
                        }
                        R("Unterminated object");
                        throw null;
                    }
                    f();
                }
                int F8 = F(true);
                if (F8 == 34) {
                    this.f3769q = 13;
                    return 13;
                }
                if (F8 == 39) {
                    f();
                    this.f3769q = 12;
                    return 12;
                }
                if (F8 == 125) {
                    if (i8 != 5) {
                        this.f3769q = 2;
                        return 2;
                    }
                    R("Expected name");
                    throw null;
                }
                f();
                this.f3765m--;
                if (p((char) F8)) {
                    this.f3769q = 14;
                    return 14;
                }
                R("Expected name");
                throw null;
            }
            if (i8 == 4) {
                iArr[i7] = 5;
                int F9 = F(true);
                if (F9 != 58) {
                    if (F9 != 61) {
                        R("Expected ':'");
                        throw null;
                    }
                    f();
                    if (this.f3765m < this.f3766n || l(1)) {
                        int i9 = this.f3765m;
                        if (cArr[i9] == '>') {
                            this.f3765m = i9 + 1;
                        }
                    }
                }
            } else {
                if (i8 != 6) {
                    if (i8 == 7) {
                        i = 0;
                        if (F(false) == -1) {
                            this.f3769q = 17;
                            return 17;
                        }
                        f();
                        this.f3765m--;
                    } else {
                        i = 0;
                        if (i8 == 8) {
                            throw new IllegalStateException("JsonReader is closed");
                        }
                    }
                    F6 = F(true);
                    if (F6 != 34) {
                        this.f3769q = 9;
                        return 9;
                    }
                    if (F6 == 39) {
                        f();
                        this.f3769q = 8;
                        return 8;
                    }
                    if (F6 != 44 && F6 != 59) {
                        if (F6 == 91) {
                            this.f3769q = 3;
                            return 3;
                        }
                        if (F6 != 93) {
                            if (F6 == 123) {
                                this.f3769q = 1;
                                return 1;
                            }
                            int i10 = this.f3765m - 1;
                            this.f3765m = i10;
                            char c6 = cArr[i10];
                            if (c6 == 't' || c6 == 'T') {
                                str = "true";
                                str2 = "TRUE";
                                i5 = 5;
                            } else if (c6 == 'f' || c6 == 'F') {
                                str = "false";
                                str2 = "FALSE";
                                i5 = 6;
                            } else {
                                if (c6 == 'n' || c6 == 'N') {
                                    str = "null";
                                    str2 = "NULL";
                                    i5 = 7;
                                }
                                i5 = i;
                                if (i5 == 0) {
                                    return i5;
                                }
                                int i11 = this.f3765m;
                                int i12 = this.f3766n;
                                int i13 = i;
                                int i14 = i13;
                                int i15 = i14;
                                int i16 = i11;
                                boolean z3 = true;
                                long j5 = 0;
                                while (true) {
                                    if (i16 + i14 == i12) {
                                        if (i14 == cArr.length) {
                                            break;
                                        }
                                        if (!l(i14 + 1)) {
                                            break;
                                        }
                                        i16 = this.f3765m;
                                        i12 = this.f3766n;
                                    }
                                    char c7 = cArr[i16 + i14];
                                    if (c7 != '+') {
                                        if (c7 == 'E' || c7 == 'e') {
                                            if (i13 != 2 && i13 != 4) {
                                                break;
                                            }
                                            i13 = 5;
                                            i14++;
                                        } else if (c7 != '-') {
                                            if (c7 == '.') {
                                                if (i13 != 2) {
                                                    break;
                                                }
                                                i13 = 3;
                                                i14++;
                                            } else {
                                                if (c7 < '0' || c7 > '9') {
                                                    break;
                                                }
                                                if (i13 == 1 || i13 == 0) {
                                                    j5 = -(c7 - '0');
                                                    i13 = 2;
                                                } else if (i13 == 2) {
                                                    if (j5 == 0) {
                                                        break;
                                                    }
                                                    long j6 = (10 * j5) - (c7 - '0');
                                                    z3 &= j5 > -922337203685477580L || (j5 == -922337203685477580L && j6 < j5);
                                                    j5 = j6;
                                                } else if (i13 == 3) {
                                                    i13 = 4;
                                                } else if (i13 == 5 || i13 == 6) {
                                                    i13 = 7;
                                                }
                                                i14++;
                                            }
                                        } else if (i13 == 0) {
                                            i13 = 1;
                                            i15 = 1;
                                            i14++;
                                        } else {
                                            if (i13 != 5) {
                                                break;
                                            }
                                            i13 = 6;
                                            i14++;
                                        }
                                        if (i6 == 0) {
                                            return i6;
                                        }
                                        if (!p(cArr[this.f3765m])) {
                                            R("Expected value");
                                            throw null;
                                        }
                                        f();
                                        this.f3769q = 10;
                                        return 10;
                                    }
                                    if (i13 != 5) {
                                        break;
                                    }
                                    i13 = 6;
                                    i14++;
                                }
                                i6 = 0;
                                if (i6 == 0) {
                                }
                            }
                            int i17 = this.f3777y != 3 ? 1 : i;
                            int length = str.length();
                            int i18 = i;
                            while (true) {
                                if (i18 < length) {
                                    if ((this.f3765m + i18 >= this.f3766n && !l(i18 + 1)) || ((c5 = cArr[this.f3765m + i18]) != str.charAt(i18) && (i17 == 0 || c5 != str2.charAt(i18)))) {
                                        break;
                                    }
                                    i18++;
                                } else if ((this.f3765m + length >= this.f3766n && !l(length + 1)) || !p(cArr[this.f3765m + length])) {
                                    this.f3765m += length;
                                    this.f3769q = i5;
                                }
                            }
                            i5 = i;
                            if (i5 == 0) {
                            }
                        } else if (i8 == 1) {
                            this.f3769q = 4;
                            return 4;
                        }
                    }
                    if (i8 != 1 && i8 != 2) {
                        R("Unexpected value");
                        throw null;
                    }
                    f();
                    this.f3765m--;
                    this.f3769q = 7;
                    return 7;
                }
                if (this.f3777y == 1) {
                    F(true);
                    int i19 = this.f3765m;
                    this.f3765m = i19 - 1;
                    if (i19 + 4 <= this.f3766n || l(5)) {
                        int i20 = this.f3765m;
                        if (cArr[i20] == ')' && cArr[i20 + 1] == ']' && cArr[i20 + 2] == '}' && cArr[i20 + 3] == '\'' && cArr[i20 + 4] == '\n') {
                            this.f3765m = i20 + 5;
                        }
                    }
                }
                this.f3773u[this.f3774v - 1] = 7;
            }
        }
        i = 0;
        F6 = F(true);
        if (F6 != 34) {
        }
    }

    public final void i() {
        int i = this.f3769q;
        if (i == 0) {
            i = h();
        }
        if (i != 4) {
            throw S("END_ARRAY");
        }
        int i5 = this.f3774v;
        this.f3774v = i5 - 1;
        int[] iArr = this.f3776x;
        int i6 = i5 - 2;
        iArr[i6] = iArr[i6] + 1;
        this.f3769q = 0;
    }

    public final void k() {
        int i = this.f3769q;
        if (i == 0) {
            i = h();
        }
        if (i != 2) {
            throw S("END_OBJECT");
        }
        int i5 = this.f3774v;
        int i6 = i5 - 1;
        this.f3774v = i6;
        this.f3775w[i6] = null;
        int[] iArr = this.f3776x;
        int i7 = i5 - 2;
        iArr[i7] = iArr[i7] + 1;
        this.f3769q = 0;
    }

    public final boolean l(int i) {
        int i5;
        int i6;
        int i7 = this.f3768p;
        int i8 = this.f3765m;
        this.f3768p = i7 - i8;
        int i9 = this.f3766n;
        char[] cArr = this.f3764l;
        if (i9 != i8) {
            int i10 = i9 - i8;
            this.f3766n = i10;
            System.arraycopy(cArr, i8, cArr, 0, i10);
        } else {
            this.f3766n = 0;
        }
        this.f3765m = 0;
        do {
            int i11 = this.f3766n;
            int read = this.f3763k.read(cArr, i11, cArr.length - i11);
            if (read == -1) {
                return false;
            }
            i5 = this.f3766n + read;
            this.f3766n = i5;
            if (this.f3767o == 0 && (i6 = this.f3768p) == 0 && i5 > 0 && cArr[0] == 65279) {
                this.f3765m++;
                this.f3768p = i6 + 1;
                i++;
            }
        } while (i5 < i);
        return true;
    }

    public final String m(boolean z3) {
        StringBuilder sb = new StringBuilder("$");
        int i = 0;
        while (true) {
            int i5 = this.f3774v;
            if (i >= i5) {
                return sb.toString();
            }
            int i6 = this.f3773u[i];
            switch (i6) {
                case 1:
                case 2:
                    int i7 = this.f3776x[i];
                    if (z3 && i7 > 0 && i == i5 - 1) {
                        i7--;
                    }
                    sb.append('[');
                    sb.append(i7);
                    sb.append(']');
                    break;
                case 3:
                case 4:
                case 5:
                    sb.append('.');
                    String str = this.f3775w[i];
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
                    throw new AssertionError(AbstractC2107A.q("Unknown scope value: ", i6));
            }
            i++;
        }
    }

    public final boolean n() {
        int i = this.f3769q;
        if (i == 0) {
            i = h();
        }
        return (i == 2 || i == 4 || i == 17) ? false : true;
    }

    public final boolean p(char c5) {
        if (c5 == '\t' || c5 == '\n' || c5 == '\f' || c5 == '\r' || c5 == ' ') {
            return false;
        }
        if (c5 != '#') {
            if (c5 == ',') {
                return false;
            }
            if (c5 != '/' && c5 != '=') {
                if (c5 == '{' || c5 == '}' || c5 == ':') {
                    return false;
                }
                if (c5 != ';') {
                    switch (c5) {
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
        f();
        return false;
    }

    public final String r() {
        StringBuilder w5 = AbstractC2107A.w(" at line ", this.f3767o + 1, " column ", (this.f3765m - this.f3768p) + 1, " path ");
        w5.append(m(false));
        return w5.toString();
    }

    public final boolean s() {
        int i = this.f3769q;
        if (i == 0) {
            i = h();
        }
        if (i == 5) {
            this.f3769q = 0;
            int[] iArr = this.f3776x;
            int i5 = this.f3774v - 1;
            iArr[i5] = iArr[i5] + 1;
            return true;
        }
        if (i != 6) {
            throw S("a boolean");
        }
        this.f3769q = 0;
        int[] iArr2 = this.f3776x;
        int i6 = this.f3774v - 1;
        iArr2[i6] = iArr2[i6] + 1;
        return false;
    }

    public final double t() {
        int i = this.f3769q;
        if (i == 0) {
            i = h();
        }
        if (i == 15) {
            this.f3769q = 0;
            int[] iArr = this.f3776x;
            int i5 = this.f3774v - 1;
            iArr[i5] = iArr[i5] + 1;
            return this.f3770r;
        }
        if (i == 16) {
            this.f3772t = new String(this.f3764l, this.f3765m, this.f3771s);
            this.f3765m += this.f3771s;
        } else if (i == 8 || i == 9) {
            this.f3772t = H(i == 8 ? '\'' : '\"');
        } else if (i == 10) {
            this.f3772t = J();
        } else if (i != 11) {
            throw S("a double");
        }
        this.f3769q = 11;
        double parseDouble = Double.parseDouble(this.f3772t);
        if (this.f3777y != 1 && (Double.isNaN(parseDouble) || Double.isInfinite(parseDouble))) {
            R("JSON forbids NaN and infinities: " + parseDouble);
            throw null;
        }
        this.f3772t = null;
        this.f3769q = 0;
        int[] iArr2 = this.f3776x;
        int i6 = this.f3774v - 1;
        iArr2[i6] = iArr2[i6] + 1;
        return parseDouble;
    }

    public final String toString() {
        return a.class.getSimpleName() + r();
    }

    public final int v() {
        int i = this.f3769q;
        if (i == 0) {
            i = h();
        }
        if (i == 15) {
            long j5 = this.f3770r;
            int i5 = (int) j5;
            if (j5 != i5) {
                throw new NumberFormatException("Expected an int but was " + this.f3770r + r());
            }
            this.f3769q = 0;
            int[] iArr = this.f3776x;
            int i6 = this.f3774v - 1;
            iArr[i6] = iArr[i6] + 1;
            return i5;
        }
        if (i == 16) {
            this.f3772t = new String(this.f3764l, this.f3765m, this.f3771s);
            this.f3765m += this.f3771s;
        } else {
            if (i != 8 && i != 9 && i != 10) {
                throw S("an int");
            }
            if (i == 10) {
                this.f3772t = J();
            } else {
                this.f3772t = H(i == 8 ? '\'' : '\"');
            }
            try {
                int parseInt = Integer.parseInt(this.f3772t);
                this.f3769q = 0;
                int[] iArr2 = this.f3776x;
                int i7 = this.f3774v - 1;
                iArr2[i7] = iArr2[i7] + 1;
                return parseInt;
            } catch (NumberFormatException unused) {
            }
        }
        this.f3769q = 11;
        double parseDouble = Double.parseDouble(this.f3772t);
        int i8 = (int) parseDouble;
        if (i8 != parseDouble) {
            throw new NumberFormatException("Expected an int but was " + this.f3772t + r());
        }
        this.f3772t = null;
        this.f3769q = 0;
        int[] iArr3 = this.f3776x;
        int i9 = this.f3774v - 1;
        iArr3[i9] = iArr3[i9] + 1;
        return i8;
    }
}
