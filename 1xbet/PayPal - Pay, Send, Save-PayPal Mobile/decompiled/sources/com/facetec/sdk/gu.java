package com.facetec.sdk;

/* loaded from: classes8.dex */
public class gu implements java.io.Closeable, java.io.Flushable {

    /* renamed from: a, reason: collision with root package name */
    private static final java.lang.String[] f3619a;
    private final java.io.Writer b;
    private boolean f;
    private java.lang.String g;
    private java.lang.String h;
    private boolean i;
    private boolean k;
    private java.lang.String l;
    private static final java.util.regex.Pattern d = java.util.regex.Pattern.compile("-?(?:0|[1-9][0-9]*)(?:\\.[0-9]+)?(?:[eE][-+]?[0-9]+)?");
    private static final java.lang.String[] c = new java.lang.String[128];
    private int[] e = new int[32];
    private int j = 0;

    static {
        for (int i = 0; i <= 31; i++) {
            c[i] = java.lang.String.format("\\u%04x", java.lang.Integer.valueOf(i));
        }
        java.lang.String[] strArr = c;
        strArr[34] = "\\\"";
        strArr[92] = "\\\\";
        strArr[9] = "\\t";
        strArr[8] = "\\b";
        strArr[10] = "\\n";
        strArr[13] = "\\r";
        strArr[12] = "\\f";
        java.lang.String[] strArr2 = (java.lang.String[]) strArr.clone();
        f3619a = strArr2;
        strArr2[60] = "\\u003c";
        strArr2[62] = "\\u003e";
        strArr2[38] = "\\u0026";
        strArr2[61] = "\\u003d";
        strArr2[39] = "\\u0027";
    }

    public gu(java.io.Writer writer) {
        c(6);
        this.g = io.ktor.sse.ServerSentEventKt.COLON;
        this.k = true;
        this.b = (java.io.Writer) java.util.Objects.requireNonNull(writer, "out == null");
    }

    public final void e(java.lang.String str) {
        if (str.length() == 0) {
            this.h = null;
            this.g = io.ktor.sse.ServerSentEventKt.COLON;
        } else {
            this.h = str;
            this.g = ": ";
        }
    }

    public final void e(boolean z) {
        this.i = z;
    }

    public final boolean f() {
        return this.i;
    }

    public final void c(boolean z) {
        this.f = z;
    }

    public final boolean h() {
        return this.f;
    }

    public final void d(boolean z) {
        this.k = z;
    }

    public final boolean j() {
        return this.k;
    }

    public com.facetec.sdk.gu a() throws java.io.IOException {
        i();
        return b(1, kotlinx.serialization.json.internal.AbstractJsonLexerKt.BEGIN_LIST);
    }

    public com.facetec.sdk.gu b() throws java.io.IOException {
        return c(1, 2, kotlinx.serialization.json.internal.AbstractJsonLexerKt.END_LIST);
    }

    public com.facetec.sdk.gu e() throws java.io.IOException {
        i();
        return b(3, kotlinx.serialization.json.internal.AbstractJsonLexerKt.BEGIN_OBJ);
    }

    public com.facetec.sdk.gu d() throws java.io.IOException {
        return c(3, 5, kotlinx.serialization.json.internal.AbstractJsonLexerKt.END_OBJ);
    }

    private com.facetec.sdk.gu b(int i, char c2) throws java.io.IOException {
        n();
        c(i);
        this.b.write(c2);
        return this;
    }

    private com.facetec.sdk.gu c(int i, int i2, char c2) throws java.io.IOException {
        int c3 = c();
        if (c3 != i2 && c3 != i) {
            throw new java.lang.IllegalStateException("Nesting problem.");
        }
        if (this.l != null) {
            java.lang.StringBuilder sb = new java.lang.StringBuilder("Dangling name: ");
            sb.append(this.l);
            throw new java.lang.IllegalStateException(sb.toString());
        }
        this.j--;
        if (c3 == i2) {
            m();
        }
        this.b.write(c2);
        return this;
    }

    private void c(int i) {
        int i2 = this.j;
        int[] iArr = this.e;
        if (i2 == iArr.length) {
            this.e = java.util.Arrays.copyOf(iArr, i2 << 1);
        }
        int[] iArr2 = this.e;
        int i3 = this.j;
        this.j = i3 + 1;
        iArr2[i3] = i;
    }

    private int c() {
        int i = this.j;
        if (i == 0) {
            throw new java.lang.IllegalStateException("JsonWriter is closed.");
        }
        return this.e[i - 1];
    }

    private void e(int i) {
        this.e[this.j - 1] = i;
    }

    public com.facetec.sdk.gu c(java.lang.String str) throws java.io.IOException {
        java.util.Objects.requireNonNull(str, "name == null");
        if (this.l != null) {
            throw new java.lang.IllegalStateException();
        }
        if (this.j == 0) {
            throw new java.lang.IllegalStateException("JsonWriter is closed.");
        }
        this.l = str;
        return this;
    }

    private void i() throws java.io.IOException {
        if (this.l != null) {
            k();
            a(this.l);
            this.l = null;
        }
    }

    public com.facetec.sdk.gu d(java.lang.String str) throws java.io.IOException {
        if (str == null) {
            return g();
        }
        i();
        n();
        a(str);
        return this;
    }

    public com.facetec.sdk.gu g() throws java.io.IOException {
        if (this.l != null) {
            if (this.k) {
                i();
            } else {
                this.l = null;
                return this;
            }
        }
        n();
        this.b.write("null");
        return this;
    }

    public com.facetec.sdk.gu b(boolean z) throws java.io.IOException {
        i();
        n();
        this.b.write(z ? "true" : "false");
        return this;
    }

    public com.facetec.sdk.gu d(java.lang.Boolean bool) throws java.io.IOException {
        if (bool == null) {
            return g();
        }
        i();
        n();
        this.b.write(bool.booleanValue() ? "true" : "false");
        return this;
    }

    public com.facetec.sdk.gu d(double d2) throws java.io.IOException {
        i();
        if (!this.i && (java.lang.Double.isNaN(d2) || java.lang.Double.isInfinite(d2))) {
            throw new java.lang.IllegalArgumentException("Numeric values must be finite, but was ".concat(java.lang.String.valueOf(d2)));
        }
        n();
        this.b.append((java.lang.CharSequence) java.lang.Double.toString(d2));
        return this;
    }

    public com.facetec.sdk.gu e(long j) throws java.io.IOException {
        i();
        n();
        this.b.write(java.lang.Long.toString(j));
        return this;
    }

    public com.facetec.sdk.gu e(java.lang.Number number) throws java.io.IOException {
        if (number == null) {
            return g();
        }
        i();
        java.lang.String obj = number.toString();
        if (obj.equals("-Infinity") || obj.equals("Infinity") || obj.equals("NaN")) {
            if (!this.i) {
                throw new java.lang.IllegalArgumentException("Numeric values must be finite, but was ".concat(java.lang.String.valueOf(obj)));
            }
        } else {
            java.lang.Class<?> cls = number.getClass();
            if (cls != java.lang.Integer.class && cls != java.lang.Long.class && cls != java.lang.Double.class && cls != java.lang.Float.class && cls != java.lang.Byte.class && cls != java.lang.Short.class && cls != java.math.BigDecimal.class && cls != java.math.BigInteger.class && cls != java.util.concurrent.atomic.AtomicInteger.class && cls != java.util.concurrent.atomic.AtomicLong.class && !d.matcher(obj).matches()) {
                java.lang.StringBuilder sb = new java.lang.StringBuilder("String created by ");
                sb.append(cls);
                sb.append(" is not a valid JSON number: ");
                sb.append(obj);
                throw new java.lang.IllegalArgumentException(sb.toString());
            }
        }
        n();
        this.b.append((java.lang.CharSequence) obj);
        return this;
    }

    public void flush() throws java.io.IOException {
        if (this.j == 0) {
            throw new java.lang.IllegalStateException("JsonWriter is closed.");
        }
        this.b.flush();
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() throws java.io.IOException {
        this.b.close();
        int i = this.j;
        if (i > 1 || (i == 1 && this.e[i - 1] != 7)) {
            throw new java.io.IOException("Incomplete document");
        }
        this.j = 0;
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0034  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private void a(java.lang.String str) throws java.io.IOException {
        int i;
        java.lang.String str2;
        java.lang.String[] strArr = this.f ? f3619a : c;
        this.b.write(34);
        int length = str.length();
        int i2 = 0;
        while (i < length) {
            char charAt = str.charAt(i);
            if (charAt < 128) {
                str2 = strArr[charAt];
                i = str2 == null ? i + 1 : 0;
                if (i2 < i) {
                    this.b.write(str, i2, i - i2);
                }
                this.b.write(str2);
                i2 = i + 1;
            } else {
                if (charAt == 8232) {
                    str2 = "\\u2028";
                } else if (charAt == 8233) {
                    str2 = "\\u2029";
                }
                if (i2 < i) {
                }
                this.b.write(str2);
                i2 = i + 1;
            }
        }
        if (i2 < length) {
            this.b.write(str, i2, length - i2);
        }
        this.b.write(34);
    }

    private void m() throws java.io.IOException {
        if (this.h == null) {
            return;
        }
        this.b.write(10);
        int i = this.j;
        for (int i2 = 1; i2 < i; i2++) {
            this.b.write(this.h);
        }
    }

    private void k() throws java.io.IOException {
        int c2 = c();
        if (c2 == 5) {
            this.b.write(44);
        } else if (c2 != 3) {
            throw new java.lang.IllegalStateException("Nesting problem.");
        }
        m();
        e(4);
    }

    private void n() throws java.io.IOException {
        int c2 = c();
        if (c2 == 1) {
            e(2);
            m();
            return;
        }
        if (c2 == 2) {
            this.b.append(kotlinx.serialization.json.internal.AbstractJsonLexerKt.COMMA);
            m();
        } else {
            if (c2 != 4) {
                if (c2 != 6) {
                    if (c2 == 7) {
                        if (!this.i) {
                            throw new java.lang.IllegalStateException("JSON must have only one top-level value.");
                        }
                    } else {
                        throw new java.lang.IllegalStateException("Nesting problem.");
                    }
                }
                e(7);
                return;
            }
            this.b.append((java.lang.CharSequence) this.g);
            e(5);
        }
    }
}
