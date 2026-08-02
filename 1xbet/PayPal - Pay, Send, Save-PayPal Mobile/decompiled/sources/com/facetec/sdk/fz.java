package com.facetec.sdk;

/* loaded from: classes8.dex */
public final class fz extends com.facetec.sdk.gt {
    private static final byte[] $$a = null;
    private static final int $$b = 0;
    private static final java.lang.Object d;

    /* renamed from: a, reason: collision with root package name */
    private int f3585a;
    private java.lang.String[] c;
    private java.lang.Object[] e;
    private int[] i;

    private static void C(int i, short s, byte b, java.lang.Object[] objArr) {
        int i2 = s * 2;
        int i3 = (b * 3) + 99;
        byte[] bArr = $$a;
        int i4 = 4 - (i * 3);
        byte[] bArr2 = new byte[i2 + 18];
        int i5 = -1;
        if (bArr == null) {
            i4++;
            i3 = i4 + (-i3) + 3;
        }
        while (true) {
            i5++;
            bArr2[i5] = (byte) i3;
            if (i5 == i2 + 17) {
                objArr[0] = new java.lang.String(bArr2, 0);
                return;
            } else {
                i4++;
                i3 = i3 + (-bArr[i4]) + 3;
            }
        }
    }

    static void init$0() {
        $$a = new byte[]{98, -6, -121, 125, -9, 5, 66, -53, 8, 1, 1, -12, 18, 5, 56, -66, 18, -4, 64, -52, com.visa.cbp.getEncExpo.onUnminimized};
        $$b = com.plaid.internal.EnumC0527g.SDK_ASSET_ICON_PRODUCT_MONITOR_VALUE;
    }

    static {
        init$0();
        new java.io.Reader() { // from class: com.facetec.sdk.fz.2
            @Override // java.io.Reader
            public final int read(char[] cArr, int i, int i2) throws java.io.IOException {
                throw new java.lang.AssertionError();
            }

            @Override // java.io.Reader, java.io.Closeable, java.lang.AutoCloseable
            public final void close() throws java.io.IOException {
                throw new java.lang.AssertionError();
            }
        };
        d = new java.lang.Object();
    }

    @Override // com.facetec.sdk.gt
    public final void a() throws java.io.IOException {
        e(com.facetec.sdk.gs.BEGIN_ARRAY);
        e(((com.facetec.sdk.en) h()).iterator());
        this.i[this.f3585a - 1] = 0;
    }

    @Override // com.facetec.sdk.gt
    public final void e() throws java.io.IOException {
        e(com.facetec.sdk.gs.END_ARRAY);
        y();
        y();
        int i = this.f3585a;
        if (i > 0) {
            int[] iArr = this.i;
            int i2 = i - 1;
            iArr[i2] = iArr[i2] + 1;
        }
    }

    @Override // com.facetec.sdk.gt
    public final void b() throws java.io.IOException {
        e(com.facetec.sdk.gs.BEGIN_OBJECT);
        e(((com.facetec.sdk.ep) h()).m().iterator());
    }

    @Override // com.facetec.sdk.gt
    public final void c() throws java.io.IOException {
        e(com.facetec.sdk.gs.END_OBJECT);
        this.c[this.f3585a - 1] = null;
        y();
        y();
        int i = this.f3585a;
        if (i > 0) {
            int[] iArr = this.i;
            int i2 = i - 1;
            iArr[i2] = iArr[i2] + 1;
        }
    }

    @Override // com.facetec.sdk.gt
    public final boolean d() throws java.io.IOException {
        com.facetec.sdk.gs f = f();
        return (f == com.facetec.sdk.gs.END_OBJECT || f == com.facetec.sdk.gs.END_ARRAY || f == com.facetec.sdk.gs.END_DOCUMENT) ? false : true;
    }

    @Override // com.facetec.sdk.gt
    public final com.facetec.sdk.gs f() throws java.io.IOException {
        while (this.f3585a != 0) {
            java.lang.Object h = h();
            if (h instanceof java.util.Iterator) {
                boolean z = this.e[this.f3585a - 2] instanceof com.facetec.sdk.ep;
                java.util.Iterator it = (java.util.Iterator) h;
                if (!it.hasNext()) {
                    return z ? com.facetec.sdk.gs.END_OBJECT : com.facetec.sdk.gs.END_ARRAY;
                }
                if (z) {
                    return com.facetec.sdk.gs.NAME;
                }
                e(it.next());
            } else {
                if (h instanceof com.facetec.sdk.ep) {
                    return com.facetec.sdk.gs.BEGIN_OBJECT;
                }
                if (h instanceof com.facetec.sdk.en) {
                    return com.facetec.sdk.gs.BEGIN_ARRAY;
                }
                byte b = (byte) ($$a[9] - 1);
                byte b2 = b;
                java.lang.Object[] objArr = new java.lang.Object[1];
                C(b, b2, b2, objArr);
                if (java.lang.Class.forName((java.lang.String) objArr[0]).isInstance(h)) {
                    com.facetec.sdk.ex exVar = (com.facetec.sdk.ex) h;
                    if (((java.lang.Boolean) com.facetec.sdk.ex.b(132102006, new java.lang.Object[]{exVar}, -132102006, com.facetec.sdk.gr.b.c(), com.facetec.sdk.gr.b.c(), com.facetec.sdk.gr.b.c(), com.facetec.sdk.gr.b.c())).booleanValue()) {
                        return com.facetec.sdk.gs.STRING;
                    }
                    if (exVar.m()) {
                        return com.facetec.sdk.gs.BOOLEAN;
                    }
                    if (exVar.o()) {
                        return com.facetec.sdk.gs.NUMBER;
                    }
                    throw new java.lang.AssertionError();
                }
                if (h instanceof com.facetec.sdk.eq) {
                    return com.facetec.sdk.gs.NULL;
                }
                if (h == d) {
                    throw new java.lang.IllegalStateException("JsonReader is closed");
                }
                java.lang.StringBuilder sb = new java.lang.StringBuilder("Custom JsonElement subclass ");
                sb.append(h.getClass().getName());
                sb.append(" is not supported");
                throw new com.facetec.sdk.gv(sb.toString());
            }
        }
        return com.facetec.sdk.gs.END_DOCUMENT;
    }

    public final java.lang.Object h() {
        return this.e[this.f3585a - 1];
    }

    private java.lang.Object y() {
        java.lang.Object[] objArr = this.e;
        int i = this.f3585a - 1;
        this.f3585a = i;
        java.lang.Object obj = objArr[i];
        objArr[i] = null;
        return obj;
    }

    public final void e(com.facetec.sdk.gs gsVar) throws java.io.IOException {
        if (f() == gsVar) {
            return;
        }
        java.lang.StringBuilder sb = new java.lang.StringBuilder("Expected ");
        sb.append(gsVar);
        sb.append(" but was ");
        sb.append(f());
        sb.append(u());
        throw new java.lang.IllegalStateException(sb.toString());
    }

    private java.lang.String c(boolean z) throws java.io.IOException {
        e(com.facetec.sdk.gs.NAME);
        java.util.Map.Entry entry = (java.util.Map.Entry) ((java.util.Iterator) h()).next();
        java.lang.String str = (java.lang.String) entry.getKey();
        this.c[this.f3585a - 1] = z ? "<skipped>" : str;
        e(entry.getValue());
        return str;
    }

    @Override // com.facetec.sdk.gt
    public final java.lang.String i() throws java.io.IOException {
        return c(false);
    }

    @Override // com.facetec.sdk.gt
    public final java.lang.String g() throws java.io.IOException {
        com.facetec.sdk.gs f = f();
        if (f != com.facetec.sdk.gs.STRING && f != com.facetec.sdk.gs.NUMBER) {
            java.lang.StringBuilder sb = new java.lang.StringBuilder("Expected ");
            sb.append(com.facetec.sdk.gs.STRING);
            sb.append(" but was ");
            sb.append(f);
            sb.append(u());
            throw new java.lang.IllegalStateException(sb.toString());
        }
        java.lang.String c = ((com.facetec.sdk.es) y()).c();
        int i = this.f3585a;
        if (i > 0) {
            int[] iArr = this.i;
            int i2 = i - 1;
            iArr[i2] = iArr[i2] + 1;
        }
        return c;
    }

    @Override // com.facetec.sdk.gt
    public final boolean j() throws java.io.IOException {
        e(com.facetec.sdk.gs.BOOLEAN);
        boolean h = ((com.facetec.sdk.es) y()).h();
        int i = this.f3585a;
        if (i > 0) {
            int[] iArr = this.i;
            int i2 = i - 1;
            iArr[i2] = iArr[i2] + 1;
        }
        return h;
    }

    @Override // com.facetec.sdk.gt
    public final void k() throws java.io.IOException {
        e(com.facetec.sdk.gs.NULL);
        y();
        int i = this.f3585a;
        if (i > 0) {
            int[] iArr = this.i;
            int i2 = i - 1;
            iArr[i2] = iArr[i2] + 1;
        }
    }

    @Override // com.facetec.sdk.gt
    public final double m() throws java.io.IOException {
        com.facetec.sdk.gs f = f();
        if (f != com.facetec.sdk.gs.NUMBER && f != com.facetec.sdk.gs.STRING) {
            java.lang.StringBuilder sb = new java.lang.StringBuilder("Expected ");
            sb.append(com.facetec.sdk.gs.NUMBER);
            sb.append(" but was ");
            sb.append(f);
            sb.append(u());
            throw new java.lang.IllegalStateException(sb.toString());
        }
        double d2 = ((com.facetec.sdk.es) h()).d();
        if (!q() && (java.lang.Double.isNaN(d2) || java.lang.Double.isInfinite(d2))) {
            throw new com.facetec.sdk.gv("JSON forbids NaN and infinities: ".concat(java.lang.String.valueOf(d2)));
        }
        y();
        int i = this.f3585a;
        if (i > 0) {
            int[] iArr = this.i;
            int i2 = i - 1;
            iArr[i2] = iArr[i2] + 1;
        }
        return d2;
    }

    @Override // com.facetec.sdk.gt
    public final long l() throws java.io.IOException {
        com.facetec.sdk.gs f = f();
        if (f != com.facetec.sdk.gs.NUMBER && f != com.facetec.sdk.gs.STRING) {
            java.lang.StringBuilder sb = new java.lang.StringBuilder("Expected ");
            sb.append(com.facetec.sdk.gs.NUMBER);
            sb.append(" but was ");
            sb.append(f);
            sb.append(u());
            throw new java.lang.IllegalStateException(sb.toString());
        }
        long a2 = ((com.facetec.sdk.es) h()).a();
        y();
        int i = this.f3585a;
        if (i > 0) {
            int[] iArr = this.i;
            int i2 = i - 1;
            iArr[i2] = iArr[i2] + 1;
        }
        return a2;
    }

    @Override // com.facetec.sdk.gt
    public final int o() throws java.io.IOException {
        com.facetec.sdk.gs f = f();
        if (f != com.facetec.sdk.gs.NUMBER && f != com.facetec.sdk.gs.STRING) {
            java.lang.StringBuilder sb = new java.lang.StringBuilder("Expected ");
            sb.append(com.facetec.sdk.gs.NUMBER);
            sb.append(" but was ");
            sb.append(f);
            sb.append(u());
            throw new java.lang.IllegalStateException(sb.toString());
        }
        int e = ((com.facetec.sdk.es) h()).e();
        y();
        int i = this.f3585a;
        if (i > 0) {
            int[] iArr = this.i;
            int i2 = i - 1;
            iArr[i2] = iArr[i2] + 1;
        }
        return e;
    }

    @Override // com.facetec.sdk.gt, java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws java.io.IOException {
        this.e = new java.lang.Object[]{d};
        this.f3585a = 1;
    }

    /* renamed from: com.facetec.sdk.fz$4, reason: invalid class name */
    static final /* synthetic */ class AnonymousClass4 {
        static final /* synthetic */ int[] d;

        static {
            int[] iArr = new int[com.facetec.sdk.gs.values().length];
            d = iArr;
            try {
                iArr[com.facetec.sdk.gs.NAME.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused) {
            }
            try {
                d[com.facetec.sdk.gs.END_ARRAY.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused2) {
            }
            try {
                d[com.facetec.sdk.gs.END_OBJECT.ordinal()] = 3;
            } catch (java.lang.NoSuchFieldError unused3) {
            }
            try {
                d[com.facetec.sdk.gs.END_DOCUMENT.ordinal()] = 4;
            } catch (java.lang.NoSuchFieldError unused4) {
            }
        }
    }

    @Override // com.facetec.sdk.gt
    public final void n() throws java.io.IOException {
        int i = com.facetec.sdk.fz.AnonymousClass4.d[f().ordinal()];
        if (i == 1) {
            c(true);
            return;
        }
        if (i == 2) {
            e();
            return;
        }
        if (i == 3) {
            c();
            return;
        }
        if (i != 4) {
            y();
            int i2 = this.f3585a;
            if (i2 > 0) {
                int[] iArr = this.i;
                int i3 = i2 - 1;
                iArr[i3] = iArr[i3] + 1;
            }
        }
    }

    @Override // com.facetec.sdk.gt
    public final java.lang.String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(u());
        return sb.toString();
    }

    public final void e(java.lang.Object obj) {
        int i = this.f3585a;
        java.lang.Object[] objArr = this.e;
        if (i == objArr.length) {
            int i2 = i << 1;
            this.e = java.util.Arrays.copyOf(objArr, i2);
            this.i = java.util.Arrays.copyOf(this.i, i2);
            this.c = (java.lang.String[]) java.util.Arrays.copyOf(this.c, i2);
        }
        java.lang.Object[] objArr2 = this.e;
        int i3 = this.f3585a;
        this.f3585a = i3 + 1;
        objArr2[i3] = obj;
    }

    private java.lang.String b(boolean z) {
        java.lang.StringBuilder sb = new java.lang.StringBuilder(com.paypal.oslo.feature.savings.constants.SavingsConstants.Currency.SYMBOL_USD);
        int i = 0;
        while (true) {
            int i2 = this.f3585a;
            if (i < i2) {
                java.lang.Object[] objArr = this.e;
                java.lang.Object obj = objArr[i];
                if (obj instanceof com.facetec.sdk.en) {
                    i++;
                    if (i < i2 && (objArr[i] instanceof java.util.Iterator)) {
                        int i3 = this.i[i];
                        if (z && i3 > 0 && (i == i2 - 1 || i == i2 - 2)) {
                            i3--;
                        }
                        sb.append(kotlinx.serialization.json.internal.AbstractJsonLexerKt.BEGIN_LIST);
                        sb.append(i3);
                        sb.append(kotlinx.serialization.json.internal.AbstractJsonLexerKt.END_LIST);
                    }
                } else if ((obj instanceof com.facetec.sdk.ep) && (i = i + 1) < i2 && (objArr[i] instanceof java.util.Iterator)) {
                    sb.append(com.paypal.oslo.core.money.MoneyKt.DECIMALSEPARATOR);
                    java.lang.String str = this.c[i];
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

    @Override // com.facetec.sdk.gt
    public final java.lang.String s() {
        return b(true);
    }

    @Override // com.facetec.sdk.gt
    public final java.lang.String t() {
        return b(false);
    }

    private java.lang.String u() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder(" at path ");
        sb.append(t());
        return sb.toString();
    }
}
