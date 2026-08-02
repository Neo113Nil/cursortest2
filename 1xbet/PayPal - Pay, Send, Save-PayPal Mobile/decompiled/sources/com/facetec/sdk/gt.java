package com.facetec.sdk;

/* loaded from: classes8.dex */
public class gt implements java.io.Closeable {
    private static final byte[] $$c = null;
    private static final int $$d = 0;
    private static char[] p;

    /* renamed from: a, reason: collision with root package name */
    private final java.io.Reader f3617a;
    private long g;
    private int i;
    private java.lang.String k;
    private java.lang.String[] l;
    private int[] n;

    /* renamed from: o, reason: collision with root package name */
    private int[] f3618o;
    private boolean c = false;
    private final char[] e = new char[1024];
    private int d = 0;
    private int h = 0;
    private int j = 0;
    private int f = 0;
    int b = 0;
    private int m = 1;

    /* JADX WARN: Removed duplicated region for block: B:10:0x0025  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x001f  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0025 -> B:4:0x002a). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static java.lang.String $$e(byte b, byte b2, short s) {
        int i;
        int i2;
        byte[] bArr = $$c;
        int i3 = (s * 3) + 4;
        int i4 = b * 3;
        int i5 = b2 + 98;
        byte[] bArr2 = new byte[i4 + 1];
        if (bArr == null) {
            int i6 = i3;
            int i7 = 0;
            i3 += i5;
            i2 = i6 + 1;
            i = i7;
            bArr2[i] = (byte) i3;
            i7 = i + 1;
            if (i == i4) {
                return new java.lang.String(bArr2, 0);
            }
            i6 = i2;
            i5 = bArr[i2];
            i3 += i5;
            i2 = i6 + 1;
            i = i7;
            bArr2[i] = (byte) i3;
            i7 = i + 1;
            if (i == i4) {
            }
        } else {
            i = 0;
            i3 = i5;
            i2 = i3;
            bArr2[i] = (byte) i3;
            i7 = i + 1;
            if (i == i4) {
            }
        }
    }

    static void init$0() {
        $$c = new byte[]{com.google.common.base.Ascii.SI, -47, 74, -93};
        $$d = 146;
    }

    private static void D(java.lang.String str, int[] iArr, boolean z, java.lang.Object[] objArr) {
        java.lang.String str2 = str;
        byte[] bArr = str2;
        if (str2 != null) {
            bArr = str2.getBytes("ISO-8859-1");
        }
        byte[] bArr2 = bArr;
        com.facetec.sdk.hj hjVar = new com.facetec.sdk.hj();
        int i = iArr[0];
        byte b = 1;
        int i2 = iArr[1];
        int i3 = iArr[2];
        int i4 = iArr[3];
        char[] cArr = p;
        if (cArr != null) {
            int length = cArr.length;
            char[] cArr2 = new char[length];
            for (int i5 = 0; i5 < length; i5++) {
                try {
                    java.lang.Object[] objArr2 = {java.lang.Integer.valueOf(cArr[i5])};
                    java.lang.Object d = com.facetec.sdk.al.d(-1287922392);
                    if (d == null) {
                        d = com.facetec.sdk.al.c((char) android.view.View.MeasureSpec.makeMeasureSpec(0, 0), (android.view.ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (android.view.ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)) + 2459, (android.os.Process.myTid() >> 22) + 24, 349480912, false, "c", new java.lang.Class[]{java.lang.Integer.TYPE});
                    }
                    cArr2[i5] = ((java.lang.Character) ((java.lang.reflect.Method) d).invoke(null, objArr2)).charValue();
                } catch (java.lang.Throwable th) {
                    java.lang.Throwable cause = th.getCause();
                    if (cause == null) {
                        throw th;
                    }
                    throw cause;
                }
            }
            cArr = cArr2;
        }
        char[] cArr3 = new char[i2];
        java.lang.System.arraycopy(cArr, i, cArr3, 0, i2);
        if (bArr2 != null) {
            char[] cArr4 = new char[i2];
            hjVar.c = 0;
            char c = 0;
            while (hjVar.c < i2) {
                if (bArr2[hjVar.c] == b) {
                    int i6 = hjVar.c;
                    char c2 = cArr3[hjVar.c];
                    java.lang.Object[] objArr3 = new java.lang.Object[2];
                    objArr3[b] = java.lang.Integer.valueOf(c);
                    objArr3[0] = java.lang.Integer.valueOf(c2);
                    java.lang.Object d2 = com.facetec.sdk.al.d(966199657);
                    if (d2 == null) {
                        char mirror = (char) ('0' - android.text.AndroidCharacter.getMirror(com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask));
                        int fadingEdgeLength = android.view.ViewConfiguration.getFadingEdgeLength();
                        int argb = android.graphics.Color.argb(0, 0, 0, 0);
                        byte b2 = (byte) 0;
                        java.lang.String $$e = $$e(b2, b2, b2);
                        java.lang.Class[] clsArr = new java.lang.Class[2];
                        clsArr[0] = java.lang.Integer.TYPE;
                        clsArr[b] = java.lang.Integer.TYPE;
                        d2 = com.facetec.sdk.al.c(mirror, 2054 - (fadingEdgeLength >> 16), 24 - argb, -1636273263, false, $$e, clsArr);
                    }
                    cArr4[i6] = ((java.lang.Character) ((java.lang.reflect.Method) d2).invoke(null, objArr3)).charValue();
                } else {
                    int i7 = hjVar.c;
                    char c3 = cArr3[hjVar.c];
                    java.lang.Object[] objArr4 = new java.lang.Object[2];
                    objArr4[b] = java.lang.Integer.valueOf(c);
                    objArr4[0] = java.lang.Integer.valueOf(c3);
                    java.lang.Object d3 = com.facetec.sdk.al.d(-1755423365);
                    if (d3 == null) {
                        char resolveSizeAndState = (char) android.view.View.resolveSizeAndState(0, 0, 0);
                        int edgeSlop = android.view.ViewConfiguration.getEdgeSlop();
                        char mirror2 = android.text.AndroidCharacter.getMirror(com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask);
                        byte b3 = (byte) 0;
                        java.lang.String $$e2 = $$e(b3, (byte) (b3 | 6), b3);
                        java.lang.Class[] clsArr2 = new java.lang.Class[2];
                        clsArr2[0] = java.lang.Integer.TYPE;
                        clsArr2[b] = java.lang.Integer.TYPE;
                        d3 = com.facetec.sdk.al.c(resolveSizeAndState, 964 - (edgeSlop >> 16), mirror2 - 24, 816916355, false, $$e2, clsArr2);
                    }
                    cArr4[i7] = ((java.lang.Character) ((java.lang.reflect.Method) d3).invoke(null, objArr4)).charValue();
                }
                c = cArr4[hjVar.c];
                java.lang.Object[] objArr5 = {hjVar, hjVar};
                java.lang.Object d4 = com.facetec.sdk.al.d(-1890346561);
                if (d4 == null) {
                    byte b4 = (byte) 0;
                    byte b5 = (byte) (b4 + 5);
                    d4 = com.facetec.sdk.al.c((char) (58394 - (android.widget.ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (android.widget.ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1))), 1763 - android.view.View.getDefaultSize(0, 0), android.view.View.resolveSizeAndState(0, 0, 0) + 24, 683467591, false, $$e(b4, b5, (byte) (b5 - 5)), new java.lang.Class[]{java.lang.Object.class, java.lang.Object.class});
                }
                ((java.lang.reflect.Method) d4).invoke(null, objArr5);
                b = 1;
            }
            cArr3 = cArr4;
        }
        if (i4 > 0) {
            char[] cArr5 = new char[i2];
            java.lang.System.arraycopy(cArr3, 0, cArr5, 0, i2);
            int i8 = i2 - i4;
            java.lang.System.arraycopy(cArr5, 0, cArr3, i8, i4);
            java.lang.System.arraycopy(cArr5, i4, cArr3, 0, i8);
        }
        if (z) {
            char[] cArr6 = new char[i2];
            hjVar.c = 0;
            while (hjVar.c < i2) {
                cArr6[hjVar.c] = cArr3[(i2 - hjVar.c) - 1];
                hjVar.c++;
            }
            cArr3 = cArr6;
        }
        if (i3 > 0) {
            hjVar.c = 0;
            while (hjVar.c < i2) {
                cArr3[hjVar.c] = (char) (cArr3[hjVar.c] - iArr[2]);
                hjVar.c++;
            }
        }
        objArr[0] = new java.lang.String(cArr3);
    }

    public gt(java.io.Reader reader) {
        int[] iArr = new int[32];
        this.n = iArr;
        iArr[0] = 6;
        this.l = new java.lang.String[32];
        this.f3618o = new int[32];
        this.f3617a = (java.io.Reader) java.util.Objects.requireNonNull(reader, "in == null");
    }

    public final void e(boolean z) {
        this.c = z;
    }

    public final boolean q() {
        return this.c;
    }

    public void a() throws java.io.IOException {
        int i = this.b;
        if (i == 0) {
            i = r();
        }
        if (i == 3) {
            c(1);
            this.f3618o[this.m - 1] = 0;
            this.b = 0;
        } else {
            java.lang.StringBuilder sb = new java.lang.StringBuilder("Expected BEGIN_ARRAY but was ");
            sb.append(f());
            sb.append(p());
            throw new java.lang.IllegalStateException(sb.toString());
        }
    }

    public void e() throws java.io.IOException {
        int i = this.b;
        if (i == 0) {
            i = r();
        }
        if (i == 4) {
            int i2 = this.m;
            this.m = i2 - 1;
            int[] iArr = this.f3618o;
            int i3 = i2 - 2;
            iArr[i3] = iArr[i3] + 1;
            this.b = 0;
            return;
        }
        java.lang.StringBuilder sb = new java.lang.StringBuilder("Expected END_ARRAY but was ");
        sb.append(f());
        sb.append(p());
        throw new java.lang.IllegalStateException(sb.toString());
    }

    public void b() throws java.io.IOException {
        int i = this.b;
        if (i == 0) {
            i = r();
        }
        if (i == 1) {
            c(3);
            this.b = 0;
        } else {
            java.lang.StringBuilder sb = new java.lang.StringBuilder("Expected BEGIN_OBJECT but was ");
            sb.append(f());
            sb.append(p());
            throw new java.lang.IllegalStateException(sb.toString());
        }
    }

    public void c() throws java.io.IOException {
        int i = this.b;
        if (i == 0) {
            i = r();
        }
        if (i == 2) {
            int i2 = this.m;
            int i3 = i2 - 1;
            this.m = i3;
            this.l[i3] = null;
            int[] iArr = this.f3618o;
            int i4 = i2 - 2;
            iArr[i4] = iArr[i4] + 1;
            this.b = 0;
            return;
        }
        java.lang.StringBuilder sb = new java.lang.StringBuilder("Expected END_OBJECT but was ");
        sb.append(f());
        sb.append(p());
        throw new java.lang.IllegalStateException(sb.toString());
    }

    public boolean d() throws java.io.IOException {
        int i = this.b;
        if (i == 0) {
            i = r();
        }
        return (i == 2 || i == 4 || i == 17) ? false : true;
    }

    public com.facetec.sdk.gs f() throws java.io.IOException {
        int i = this.b;
        if (i == 0) {
            i = r();
        }
        switch (i) {
            case 1:
                return com.facetec.sdk.gs.BEGIN_OBJECT;
            case 2:
                return com.facetec.sdk.gs.END_OBJECT;
            case 3:
                return com.facetec.sdk.gs.BEGIN_ARRAY;
            case 4:
                return com.facetec.sdk.gs.END_ARRAY;
            case 5:
            case 6:
                return com.facetec.sdk.gs.BOOLEAN;
            case 7:
                return com.facetec.sdk.gs.NULL;
            case 8:
            case 9:
            case 10:
            case 11:
                return com.facetec.sdk.gs.STRING;
            case 12:
            case 13:
            case 14:
                return com.facetec.sdk.gs.NAME;
            case 15:
            case 16:
                return com.facetec.sdk.gs.NUMBER;
            case 17:
                return com.facetec.sdk.gs.END_DOCUMENT;
            default:
                throw new java.lang.AssertionError();
        }
    }

    final int r() throws java.io.IOException {
        int a2;
        int[] iArr = this.n;
        int i = this.m - 1;
        int i2 = iArr[i];
        if (i2 == 1) {
            iArr[i] = 2;
        } else if (i2 == 2) {
            int a3 = a(true);
            if (a3 != 44) {
                if (a3 != 59) {
                    if (a3 == 93) {
                        this.b = 4;
                        return 4;
                    }
                    throw e("Unterminated array");
                }
                y();
            }
        } else {
            if (i2 == 3 || i2 == 5) {
                iArr[i] = 4;
                if (i2 == 5 && (a2 = a(true)) != 44) {
                    if (a2 != 59) {
                        if (a2 == 125) {
                            this.b = 2;
                            return 2;
                        }
                        throw e("Unterminated object");
                    }
                    y();
                }
                int a4 = a(true);
                if (a4 == 34) {
                    this.b = 13;
                    return 13;
                }
                if (a4 == 39) {
                    y();
                    this.b = 12;
                    return 12;
                }
                if (a4 == 125) {
                    if (i2 != 5) {
                        this.b = 2;
                        return 2;
                    }
                    throw e("Expected name");
                }
                y();
                this.d--;
                if (c((char) a4)) {
                    this.b = 14;
                    return 14;
                }
                throw e("Expected name");
            }
            if (i2 == 4) {
                iArr[i] = 5;
                int a5 = a(true);
                if (a5 != 58) {
                    if (a5 == 61) {
                        y();
                        if (this.d < this.h || b(1)) {
                            char[] cArr = this.e;
                            int i3 = this.d;
                            if (cArr[i3] == '>') {
                                this.d = i3 + 1;
                            }
                        }
                    } else {
                        throw e("Expected ':'");
                    }
                }
            } else if (i2 == 6) {
                if (this.c) {
                    z();
                }
                this.n[this.m - 1] = 7;
            } else if (i2 == 7) {
                if (a(false) == -1) {
                    this.b = 17;
                    return 17;
                }
                y();
                this.d--;
            } else if (i2 == 8) {
                throw new java.lang.IllegalStateException("JsonReader is closed");
            }
        }
        int a6 = a(true);
        if (a6 == 34) {
            this.b = 9;
            return 9;
        }
        if (a6 == 39) {
            y();
            this.b = 8;
            return 8;
        }
        if (a6 != 44 && a6 != 59) {
            if (a6 == 91) {
                this.b = 3;
                return 3;
            }
            if (a6 != 93) {
                if (a6 == 123) {
                    this.b = 1;
                    return 1;
                }
                this.d--;
                int h = h();
                if (h != 0) {
                    return h;
                }
                int u = u();
                if (u != 0) {
                    return u;
                }
                if (!c(this.e[this.d])) {
                    throw e("Expected value");
                }
                y();
                this.b = 10;
                return 10;
            }
            if (i2 == 1) {
                this.b = 4;
                return 4;
            }
        }
        if (i2 == 1 || i2 == 2) {
            y();
            this.d--;
            this.b = 7;
            return 7;
        }
        throw e("Unexpected value");
    }

    private int h() throws java.io.IOException {
        java.lang.String str;
        java.lang.String str2;
        int i;
        char c = this.e[this.d];
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
        int length = str.length();
        for (int i2 = 1; i2 < length; i2++) {
            if (this.d + i2 >= this.h && !b(i2 + 1)) {
                return 0;
            }
            char c2 = this.e[this.d + i2];
            if (c2 != str.charAt(i2) && c2 != str2.charAt(i2)) {
                return 0;
            }
        }
        if ((this.d + length < this.h || b(length + 1)) && c(this.e[this.d + length])) {
            return 0;
        }
        this.d += length;
        this.b = i;
        return i;
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0091, code lost:
    
        if (r9 != 2) goto L68;
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x0093, code lost:
    
        if (r10 == false) goto L68;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x0099, code lost:
    
        if (r12 != Long.MIN_VALUE) goto L60;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x009b, code lost:
    
        if (r11 == false) goto L68;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x00a1, code lost:
    
        if (r12 != 0) goto L63;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x00a3, code lost:
    
        if (r11 != false) goto L68;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x00a5, code lost:
    
        if (r11 == false) goto L65;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x00a8, code lost:
    
        r12 = -r12;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x00a9, code lost:
    
        r18.g = r12;
        r18.d += r8;
        r18.b = 15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x00b4, code lost:
    
        return 15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x00b5, code lost:
    
        if (r9 == 2) goto L76;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x00b8, code lost:
    
        if (r9 == 4) goto L76;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x00bb, code lost:
    
        if (r9 != 7) goto L74;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x00be, code lost:
    
        return 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x00c0, code lost:
    
        r18.i = r8;
        r18.b = 16;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x00c6, code lost:
    
        return 16;
     */
    /* JADX WARN: Code restructure failed: missing block: B:74:0x008d, code lost:
    
        if (c(r14) == false) goto L55;
     */
    /* JADX WARN: Code restructure failed: missing block: B:75:0x008f, code lost:
    
        return 0;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private int u() throws java.io.IOException {
        char c;
        int i;
        char[] cArr = this.e;
        int i2 = this.d;
        int i3 = this.h;
        int i4 = 0;
        int i5 = 0;
        char c2 = 0;
        boolean z = false;
        boolean z2 = true;
        long j = 0;
        while (true) {
            if (i2 + i5 == i3) {
                if (i5 != cArr.length) {
                    if (!b(i5 + 1)) {
                        break;
                    }
                    i2 = this.d;
                    i3 = this.h;
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

    private boolean c(char c) throws java.io.IOException {
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
        y();
        return false;
    }

    public java.lang.String i() throws java.io.IOException {
        java.lang.String d;
        int i = this.b;
        if (i == 0) {
            i = r();
        }
        if (i == 14) {
            d = v();
        } else if (i == 12) {
            d = d('\'');
        } else if (i == 13) {
            d = d('\"');
        } else {
            java.lang.StringBuilder sb = new java.lang.StringBuilder("Expected a name but was ");
            sb.append(f());
            sb.append(p());
            throw new java.lang.IllegalStateException(sb.toString());
        }
        this.b = 0;
        this.l[this.m - 1] = d;
        return d;
    }

    public java.lang.String g() throws java.io.IOException {
        java.lang.String str;
        int i = this.b;
        if (i == 0) {
            i = r();
        }
        if (i == 10) {
            str = v();
        } else if (i == 8) {
            str = d('\'');
        } else if (i == 9) {
            str = d('\"');
        } else if (i == 11) {
            str = this.k;
            this.k = null;
        } else if (i == 15) {
            str = java.lang.Long.toString(this.g);
        } else if (i == 16) {
            str = new java.lang.String(this.e, this.d, this.i);
            this.d += this.i;
        } else {
            java.lang.StringBuilder sb = new java.lang.StringBuilder("Expected a string but was ");
            sb.append(f());
            sb.append(p());
            throw new java.lang.IllegalStateException(sb.toString());
        }
        this.b = 0;
        int[] iArr = this.f3618o;
        int i2 = this.m - 1;
        iArr[i2] = iArr[i2] + 1;
        return str;
    }

    public boolean j() throws java.io.IOException {
        int i = this.b;
        if (i == 0) {
            i = r();
        }
        if (i == 5) {
            this.b = 0;
            int[] iArr = this.f3618o;
            int i2 = this.m - 1;
            iArr[i2] = iArr[i2] + 1;
            return true;
        }
        if (i == 6) {
            this.b = 0;
            int[] iArr2 = this.f3618o;
            int i3 = this.m - 1;
            iArr2[i3] = iArr2[i3] + 1;
            return false;
        }
        java.lang.StringBuilder sb = new java.lang.StringBuilder("Expected a boolean but was ");
        sb.append(f());
        sb.append(p());
        throw new java.lang.IllegalStateException(sb.toString());
    }

    public void k() throws java.io.IOException {
        int i = this.b;
        if (i == 0) {
            i = r();
        }
        if (i == 7) {
            this.b = 0;
            int[] iArr = this.f3618o;
            int i2 = this.m - 1;
            iArr[i2] = iArr[i2] + 1;
            return;
        }
        java.lang.StringBuilder sb = new java.lang.StringBuilder("Expected null but was ");
        sb.append(f());
        sb.append(p());
        throw new java.lang.IllegalStateException(sb.toString());
    }

    public double m() throws java.io.IOException {
        int i = this.b;
        if (i == 0) {
            i = r();
        }
        if (i == 15) {
            this.b = 0;
            int[] iArr = this.f3618o;
            int i2 = this.m - 1;
            iArr[i2] = iArr[i2] + 1;
            return this.g;
        }
        if (i == 16) {
            this.k = new java.lang.String(this.e, this.d, this.i);
            this.d += this.i;
        } else if (i == 8 || i == 9) {
            this.k = d(i == 8 ? '\'' : '\"');
        } else if (i == 10) {
            this.k = v();
        } else if (i != 11) {
            java.lang.StringBuilder sb = new java.lang.StringBuilder("Expected a double but was ");
            sb.append(f());
            sb.append(p());
            throw new java.lang.IllegalStateException(sb.toString());
        }
        this.b = 11;
        double parseDouble = java.lang.Double.parseDouble(this.k);
        if (!this.c && (java.lang.Double.isNaN(parseDouble) || java.lang.Double.isInfinite(parseDouble))) {
            java.lang.StringBuilder sb2 = new java.lang.StringBuilder("JSON forbids NaN and infinities: ");
            sb2.append(parseDouble);
            sb2.append(p());
            throw new com.facetec.sdk.gv(sb2.toString());
        }
        this.k = null;
        this.b = 0;
        int[] iArr2 = this.f3618o;
        int i3 = this.m - 1;
        iArr2[i3] = iArr2[i3] + 1;
        return parseDouble;
    }

    public long l() throws java.io.IOException {
        int i = this.b;
        if (i == 0) {
            i = r();
        }
        if (i == 15) {
            this.b = 0;
            int[] iArr = this.f3618o;
            int i2 = this.m - 1;
            iArr[i2] = iArr[i2] + 1;
            return this.g;
        }
        if (i == 16) {
            this.k = new java.lang.String(this.e, this.d, this.i);
            this.d += this.i;
        } else {
            if (i != 8 && i != 9 && i != 10) {
                java.lang.StringBuilder sb = new java.lang.StringBuilder("Expected a long but was ");
                sb.append(f());
                sb.append(p());
                throw new java.lang.IllegalStateException(sb.toString());
            }
            if (i == 10) {
                this.k = v();
            } else {
                this.k = d(i == 8 ? '\'' : '\"');
            }
            try {
                long parseLong = java.lang.Long.parseLong(this.k);
                this.b = 0;
                int[] iArr2 = this.f3618o;
                int i3 = this.m - 1;
                iArr2[i3] = iArr2[i3] + 1;
                return parseLong;
            } catch (java.lang.NumberFormatException unused) {
            }
        }
        this.b = 11;
        double parseDouble = java.lang.Double.parseDouble(this.k);
        long j = (long) parseDouble;
        if (j != parseDouble) {
            java.lang.StringBuilder sb2 = new java.lang.StringBuilder("Expected a long but was ");
            sb2.append(this.k);
            sb2.append(p());
            throw new java.lang.NumberFormatException(sb2.toString());
        }
        this.k = null;
        this.b = 0;
        int[] iArr3 = this.f3618o;
        int i4 = this.m - 1;
        iArr3[i4] = iArr3[i4] + 1;
        return j;
    }

    private java.lang.String d(char c) throws java.io.IOException {
        char[] cArr = this.e;
        java.lang.StringBuilder sb = null;
        while (true) {
            int i = this.d;
            int i2 = this.h;
            int i3 = i;
            while (true) {
                if (i3 < i2) {
                    int i4 = i3 + 1;
                    char c2 = cArr[i3];
                    if (c2 == c) {
                        this.d = i4;
                        int i5 = (i4 - i) - 1;
                        if (sb == null) {
                            return new java.lang.String(cArr, i, i5);
                        }
                        sb.append(cArr, i, i5);
                        return sb.toString();
                    }
                    if (c2 == '\\') {
                        this.d = i4;
                        int i6 = i4 - i;
                        if (sb == null) {
                            sb = new java.lang.StringBuilder(java.lang.Math.max(i6 << 1, 16));
                        }
                        sb.append(cArr, i, i6 - 1);
                        sb.append(A());
                    } else {
                        if (c2 == '\n') {
                            this.j++;
                            this.f = i4;
                        }
                        i3 = i4;
                    }
                } else {
                    if (sb == null) {
                        sb = new java.lang.StringBuilder(java.lang.Math.max((i3 - i) << 1, 16));
                    }
                    sb.append(cArr, i, i3 - i);
                    this.d = i3;
                    if (!b(1)) {
                        throw e("Unterminated string");
                    }
                }
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:58:0x0048, code lost:
    
        y();
     */
    /* JADX WARN: Failed to find 'out' block for switch in B:54:0x0042. Please report as an issue. */
    /* JADX WARN: Removed duplicated region for block: B:13:0x007e  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0088  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private java.lang.String v() throws java.io.IOException {
        java.lang.String obj;
        java.lang.StringBuilder sb = null;
        do {
            int i = 0;
            int i2 = 0;
            while (true) {
                int i3 = this.d + i2;
                if (i3 < this.h) {
                    char c = this.e[i3];
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
                } else if (i2 < this.e.length) {
                    if (b(i2 + 1)) {
                    }
                } else {
                    if (sb == null) {
                        sb = new java.lang.StringBuilder(java.lang.Math.max(i2, 16));
                    }
                    sb.append(this.e, this.d, i2);
                    this.d += i2;
                }
            }
            i = i2;
            if (sb != null) {
                obj = new java.lang.String(this.e, this.d, i);
            } else {
                sb.append(this.e, this.d, i);
                obj = sb.toString();
            }
            this.d += i;
            return obj;
        } while (b(1));
        if (sb != null) {
        }
        this.d += i;
        return obj;
    }

    private void a(char c) throws java.io.IOException {
        char[] cArr = this.e;
        while (true) {
            int i = this.d;
            int i2 = this.h;
            while (true) {
                if (i < i2) {
                    int i3 = i + 1;
                    char c2 = cArr[i];
                    if (c2 == c) {
                        this.d = i3;
                        return;
                    }
                    if (c2 == '\\') {
                        this.d = i3;
                        A();
                        break;
                    } else {
                        if (c2 == '\n') {
                            this.j++;
                            this.f = i3;
                        }
                        i = i3;
                    }
                } else {
                    this.d = i;
                    if (!b(1)) {
                        throw e("Unterminated string");
                    }
                }
            }
        }
    }

    private void x() throws java.io.IOException {
        do {
            int i = 0;
            while (true) {
                int i2 = this.d + i;
                if (i2 < this.h) {
                    char c = this.e[i2];
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
                    this.d = i2;
                }
            }
            y();
            this.d += i;
            return;
        } while (b(1));
    }

    public int o() throws java.io.IOException {
        int i = this.b;
        if (i == 0) {
            i = r();
        }
        if (i == 15) {
            long j = this.g;
            int i2 = (int) j;
            if (j != i2) {
                java.lang.StringBuilder sb = new java.lang.StringBuilder("Expected an int but was ");
                sb.append(this.g);
                sb.append(p());
                throw new java.lang.NumberFormatException(sb.toString());
            }
            this.b = 0;
            int[] iArr = this.f3618o;
            int i3 = this.m - 1;
            iArr[i3] = iArr[i3] + 1;
            return i2;
        }
        if (i == 16) {
            this.k = new java.lang.String(this.e, this.d, this.i);
            this.d += this.i;
        } else {
            if (i != 8 && i != 9 && i != 10) {
                java.lang.StringBuilder sb2 = new java.lang.StringBuilder("Expected an int but was ");
                sb2.append(f());
                sb2.append(p());
                throw new java.lang.IllegalStateException(sb2.toString());
            }
            if (i == 10) {
                this.k = v();
            } else {
                this.k = d(i == 8 ? '\'' : '\"');
            }
            try {
                int parseInt = java.lang.Integer.parseInt(this.k);
                this.b = 0;
                int[] iArr2 = this.f3618o;
                int i4 = this.m - 1;
                iArr2[i4] = iArr2[i4] + 1;
                return parseInt;
            } catch (java.lang.NumberFormatException unused) {
            }
        }
        this.b = 11;
        double parseDouble = java.lang.Double.parseDouble(this.k);
        int i5 = (int) parseDouble;
        if (i5 != parseDouble) {
            java.lang.StringBuilder sb3 = new java.lang.StringBuilder("Expected an int but was ");
            sb3.append(this.k);
            sb3.append(p());
            throw new java.lang.NumberFormatException(sb3.toString());
        }
        this.k = null;
        this.b = 0;
        int[] iArr3 = this.f3618o;
        int i6 = this.m - 1;
        iArr3[i6] = iArr3[i6] + 1;
        return i5;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() throws java.io.IOException {
        this.b = 0;
        this.n[0] = 8;
        this.m = 1;
        this.f3617a.close();
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    public void n() throws java.io.IOException {
        int i = 0;
        do {
            int i2 = this.b;
            if (i2 == 0) {
                i2 = r();
            }
            switch (i2) {
                case 1:
                    c(3);
                    i++;
                    this.b = 0;
                    break;
                case 2:
                    if (i == 0) {
                        this.l[this.m - 1] = null;
                    }
                    this.m--;
                    i--;
                    this.b = 0;
                    break;
                case 3:
                    c(1);
                    i++;
                    this.b = 0;
                    break;
                case 4:
                    this.m--;
                    i--;
                    this.b = 0;
                    break;
                case 5:
                case 6:
                case 7:
                case 11:
                case 15:
                default:
                    this.b = 0;
                    break;
                case 8:
                    a('\'');
                    this.b = 0;
                    break;
                case 9:
                    a('\"');
                    this.b = 0;
                    break;
                case 10:
                    x();
                    this.b = 0;
                    break;
                case 12:
                    a('\'');
                    if (i == 0) {
                        this.l[this.m - 1] = "<skipped>";
                    }
                    this.b = 0;
                    break;
                case 13:
                    a('\"');
                    if (i == 0) {
                        this.l[this.m - 1] = "<skipped>";
                    }
                    this.b = 0;
                    break;
                case 14:
                    x();
                    if (i == 0) {
                        this.l[this.m - 1] = "<skipped>";
                    }
                    this.b = 0;
                    break;
                case 16:
                    this.d += this.i;
                    this.b = 0;
                    break;
                case 17:
                    break;
            }
            return;
        } while (i > 0);
        int[] iArr = this.f3618o;
        int i3 = this.m - 1;
        iArr[i3] = iArr[i3] + 1;
    }

    private void c(int i) {
        int i2 = this.m;
        int[] iArr = this.n;
        if (i2 == iArr.length) {
            int i3 = i2 << 1;
            this.n = java.util.Arrays.copyOf(iArr, i3);
            this.f3618o = java.util.Arrays.copyOf(this.f3618o, i3);
            this.l = (java.lang.String[]) java.util.Arrays.copyOf(this.l, i3);
        }
        int[] iArr2 = this.n;
        int i4 = this.m;
        this.m = i4 + 1;
        iArr2[i4] = i;
    }

    private boolean b(int i) throws java.io.IOException {
        int i2;
        int i3;
        char[] cArr = this.e;
        int i4 = this.f;
        int i5 = this.d;
        this.f = i4 - i5;
        int i6 = this.h;
        if (i6 != i5) {
            int i7 = i6 - i5;
            this.h = i7;
            try {
                java.lang.Object[] objArr = {cArr, java.lang.Integer.valueOf(i5), cArr, 0, java.lang.Integer.valueOf(i7)};
                java.lang.Object[] objArr2 = new java.lang.Object[1];
                D("\u0000\u0000\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0001\u0001\u0000\u0001\u0001\u0001\u0001", new int[]{0, 16, 13, 0}, true, objArr2);
                java.lang.Class<?> cls = java.lang.Class.forName((java.lang.String) objArr2[0]);
                java.lang.Object[] objArr3 = new java.lang.Object[1];
                D("\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u0000\u0000", new int[]{16, 9, 0, 3}, false, objArr3);
                cls.getMethod((java.lang.String) objArr3[0], java.lang.Object.class, java.lang.Integer.TYPE, java.lang.Object.class, java.lang.Integer.TYPE, java.lang.Integer.TYPE).invoke(null, objArr);
            } catch (java.lang.Throwable th) {
                java.lang.Throwable cause = th.getCause();
                if (cause != null) {
                    throw cause;
                }
                throw th;
            }
        } else {
            this.h = 0;
        }
        this.d = 0;
        do {
            java.io.Reader reader = this.f3617a;
            int i8 = this.h;
            int read = reader.read(cArr, i8, cArr.length - i8);
            if (read == -1) {
                return false;
            }
            i2 = this.h + read;
            this.h = i2;
            if (this.j == 0 && (i3 = this.f) == 0 && i2 > 0 && cArr[0] == 65279) {
                this.d++;
                this.f = i3 + 1;
                i++;
            }
        } while (i2 < i);
        return true;
    }

    private int a(boolean z) throws java.io.IOException {
        char c;
        char[] cArr = this.e;
        int i = this.d;
        int i2 = this.h;
        while (true) {
            if (i == i2) {
                this.d = i;
                if (!b(1)) {
                    if (!z) {
                        return -1;
                    }
                    java.lang.StringBuilder sb = new java.lang.StringBuilder("End of input");
                    sb.append(p());
                    throw new java.io.EOFException(sb.toString());
                }
                i = this.d;
                i2 = this.h;
            }
            int i3 = i + 1;
            c = cArr[i];
            if (c == '\n') {
                this.j++;
                this.f = i3;
            } else if (c != ' ' && c != '\r' && c != '\t') {
                if (c == '/') {
                    this.d = i3;
                    if (i3 == i2) {
                        this.d = i;
                        boolean b = b(2);
                        this.d++;
                        if (!b) {
                            break;
                        }
                    }
                    y();
                    int i4 = this.d;
                    char c2 = cArr[i4];
                    if (c2 == '*') {
                        this.d = i4 + 1;
                        if (!d("*/")) {
                            throw e("Unterminated comment");
                        }
                        i = this.d + 2;
                        i2 = this.h;
                    } else {
                        if (c2 != '/') {
                            break;
                        }
                        this.d = i4 + 1;
                        B();
                        i = this.d;
                        i2 = this.h;
                    }
                } else if (c == '#') {
                    this.d = i3;
                    y();
                    B();
                    i = this.d;
                    i2 = this.h;
                } else {
                    this.d = i3;
                    return c;
                }
            }
            i = i3;
        }
        return c;
    }

    private void y() throws java.io.IOException {
        if (!this.c) {
            throw e("Use JsonReader.setLenient(true) to accept malformed JSON");
        }
    }

    private void B() throws java.io.IOException {
        char c;
        do {
            if (this.d >= this.h && !b(1)) {
                return;
            }
            char[] cArr = this.e;
            int i = this.d;
            int i2 = i + 1;
            this.d = i2;
            c = cArr[i];
            if (c == '\n') {
                this.j++;
                this.f = i2;
                return;
            }
        } while (c != '\r');
    }

    private boolean d(java.lang.String str) throws java.io.IOException {
        int i;
        int length = str.length();
        while (true) {
            if (this.d + length > this.h && !b(length)) {
                return false;
            }
            char[] cArr = this.e;
            int i2 = this.d;
            if (cArr[i2] != '\n') {
                while (i < length) {
                    i = this.e[this.d + i] == str.charAt(i) ? i + 1 : 0;
                }
                return true;
            }
            this.j++;
            this.f = i2 + 1;
            this.d++;
        }
    }

    public java.lang.String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(p());
        return sb.toString();
    }

    final java.lang.String p() {
        int i = this.j;
        int i2 = this.d;
        int i3 = this.f;
        java.lang.StringBuilder sb = new java.lang.StringBuilder(" at line ");
        sb.append(i + 1);
        sb.append(" column ");
        sb.append((i2 - i3) + 1);
        sb.append(" path ");
        sb.append(t());
        return sb.toString();
    }

    private java.lang.String c(boolean z) {
        java.lang.StringBuilder sb = new java.lang.StringBuilder(com.paypal.oslo.feature.savings.constants.SavingsConstants.Currency.SYMBOL_USD);
        int i = 0;
        while (true) {
            int i2 = this.m;
            if (i < i2) {
                int i3 = this.n[i];
                if (i3 == 1 || i3 == 2) {
                    int i4 = this.f3618o[i];
                    if (z && i4 > 0 && i == i2 - 1) {
                        i4--;
                    }
                    sb.append(kotlinx.serialization.json.internal.AbstractJsonLexerKt.BEGIN_LIST);
                    sb.append(i4);
                    sb.append(kotlinx.serialization.json.internal.AbstractJsonLexerKt.END_LIST);
                } else if (i3 == 3 || i3 == 4 || i3 == 5) {
                    sb.append(com.paypal.oslo.core.money.MoneyKt.DECIMALSEPARATOR);
                    java.lang.String str = this.l[i];
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

    public java.lang.String s() {
        return c(true);
    }

    public java.lang.String t() {
        return c(false);
    }

    private char A() throws java.io.IOException {
        int i;
        if (this.d == this.h && !b(1)) {
            throw e("Unterminated escape sequence");
        }
        char[] cArr = this.e;
        int i2 = this.d;
        int i3 = i2 + 1;
        this.d = i3;
        char c = cArr[i2];
        if (c == '\n') {
            this.j++;
            this.f = i3;
            return c;
        }
        if (c == '\"' || c == '\'' || c == '/' || c == '\\') {
            return c;
        }
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
            if (i2 + 5 > this.h && !b(4)) {
                throw e("Unterminated escape sequence");
            }
            int i4 = this.d;
            char c2 = 0;
            for (int i5 = i4; i5 < i4 + 4; i5++) {
                char c3 = this.e[i5];
                char c4 = (char) (c2 << 4);
                if (c3 >= '0' && c3 <= '9') {
                    i = c3 - '0';
                } else if (c3 >= 'a' && c3 <= 'f') {
                    i = c3 - 'W';
                } else {
                    if (c3 < 'A' || c3 > 'F') {
                        throw new java.lang.NumberFormatException("\\u".concat(new java.lang.String(this.e, this.d, 4)));
                    }
                    i = c3 - '7';
                }
                c2 = (char) (c4 + i);
            }
            this.d += 4;
            return c2;
        }
        throw e("Invalid escape sequence");
    }

    private java.io.IOException e(java.lang.String str) throws java.io.IOException {
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append(str);
        sb.append(p());
        throw new com.facetec.sdk.gv(sb.toString());
    }

    private void z() throws java.io.IOException {
        a(true);
        int i = this.d;
        this.d = i - 1;
        if (i + 4 <= this.h || b(5)) {
            int i2 = this.d;
            char[] cArr = this.e;
            if (cArr[i2] == ')' && cArr[i2 + 1] == ']' && cArr[i2 + 2] == '}' && cArr[i2 + 3] == '\'' && cArr[i2 + 4] == '\n') {
                this.d = i2 + 5;
            }
        }
    }

    static {
        init$0();
        w();
        com.facetec.sdk.fr.d = new com.facetec.sdk.fr() { // from class: com.facetec.sdk.gt.5
            @Override // com.facetec.sdk.fr
            public final void a(com.facetec.sdk.gt gtVar) throws java.io.IOException {
                if (gtVar instanceof com.facetec.sdk.fz) {
                    com.facetec.sdk.fz fzVar = (com.facetec.sdk.fz) gtVar;
                    fzVar.e(com.facetec.sdk.gs.NAME);
                    java.util.Map.Entry entry = (java.util.Map.Entry) ((java.util.Iterator) fzVar.h()).next();
                    fzVar.e(entry.getValue());
                    fzVar.e(new com.facetec.sdk.ex((java.lang.String) entry.getKey()));
                    return;
                }
                int i = gtVar.b;
                if (i == 0) {
                    i = gtVar.r();
                }
                if (i == 13) {
                    gtVar.b = 9;
                    return;
                }
                if (i == 12) {
                    gtVar.b = 8;
                } else {
                    if (i == 14) {
                        gtVar.b = 10;
                        return;
                    }
                    java.lang.StringBuilder sb = new java.lang.StringBuilder("Expected a name but was ");
                    sb.append(gtVar.f());
                    sb.append(gtVar.p());
                    throw new java.lang.IllegalStateException(sb.toString());
                }
            }
        };
    }

    static void w() {
        p = new char[]{47289, 47346, 47357, 47108, 47111, 47351, 47305, 47315, 47347, 47344, 47351, 47326, 47312, 47356, 47356, 47350, 47283, 47339, 47344, 47337, 47341, 47350, 47341, 47337, 47338};
    }
}
