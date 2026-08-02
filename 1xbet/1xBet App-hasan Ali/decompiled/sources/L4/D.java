package L4;

/* loaded from: classes.dex */
public final class D {

    /* renamed from: a, reason: collision with root package name */
    public final byte[] f3053a;

    /* renamed from: b, reason: collision with root package name */
    public int f3054b;

    /* renamed from: c, reason: collision with root package name */
    public int f3055c;

    /* renamed from: d, reason: collision with root package name */
    public boolean f3056d;

    /* renamed from: e, reason: collision with root package name */
    public final boolean f3057e;
    public D f;

    /* renamed from: g, reason: collision with root package name */
    public D f3058g;

    public D() {
        this.f3053a = new byte[8192];
        this.f3057e = true;
        this.f3056d = false;
    }

    public final D a() {
        D d5 = this.f;
        if (d5 == this) {
            d5 = null;
        }
        D d6 = this.f3058g;
        kotlin.jvm.internal.l.c(d6);
        d6.f = this.f;
        D d7 = this.f;
        kotlin.jvm.internal.l.c(d7);
        d7.f3058g = this.f3058g;
        this.f = null;
        this.f3058g = null;
        return d5;
    }

    public final void b(D d5) {
        kotlin.jvm.internal.l.f("segment", d5);
        d5.f3058g = this;
        d5.f = this.f;
        D d6 = this.f;
        kotlin.jvm.internal.l.c(d6);
        d6.f3058g = d5;
        this.f = d5;
    }

    public final D c() {
        this.f3056d = true;
        return new D(this.f3053a, this.f3054b, this.f3055c, true);
    }

    public final void d(D d5, int i) {
        kotlin.jvm.internal.l.f("sink", d5);
        if (!d5.f3057e) {
            throw new IllegalStateException("only owner can write");
        }
        int i5 = d5.f3055c;
        int i6 = i5 + i;
        byte[] bArr = d5.f3053a;
        if (i6 > 8192) {
            if (d5.f3056d) {
                throw new IllegalArgumentException();
            }
            int i7 = d5.f3054b;
            if (i6 - i7 > 8192) {
                throw new IllegalArgumentException();
            }
            X3.l.w0(i7, i5, 2, bArr, bArr);
            d5.f3055c -= d5.f3054b;
            d5.f3054b = 0;
        }
        int i8 = d5.f3055c;
        int i9 = this.f3054b;
        X3.l.r0(i8, i9, i9 + i, this.f3053a, bArr);
        d5.f3055c += i;
        this.f3054b += i;
    }

    public D(byte[] bArr, int i, int i5, boolean z3) {
        kotlin.jvm.internal.l.f("data", bArr);
        this.f3053a = bArr;
        this.f3054b = i;
        this.f3055c = i5;
        this.f3056d = z3;
        this.f3057e = false;
    }
}
