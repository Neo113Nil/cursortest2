package L4;

import n.AbstractC2107A;

/* loaded from: classes.dex */
public final class A implements I, AutoCloseable {

    /* renamed from: k, reason: collision with root package name */
    public final InterfaceC0228k f3041k;

    /* renamed from: l, reason: collision with root package name */
    public final C0226i f3042l;

    /* renamed from: m, reason: collision with root package name */
    public D f3043m;

    /* renamed from: n, reason: collision with root package name */
    public int f3044n;

    /* renamed from: o, reason: collision with root package name */
    public boolean f3045o;

    /* renamed from: p, reason: collision with root package name */
    public long f3046p;

    public A(InterfaceC0228k interfaceC0228k) {
        this.f3041k = interfaceC0228k;
        C0226i a5 = interfaceC0228k.a();
        this.f3042l = a5;
        D d5 = a5.f3090k;
        this.f3043m = d5;
        this.f3044n = d5 != null ? d5.f3054b : -1;
    }

    @Override // L4.I
    public final K c() {
        return this.f3041k.c();
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        this.f3045o = true;
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0020, code lost:
    
        if (r3 == r5.f3054b) goto L15;
     */
    @Override // L4.I
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final long e(C0226i c0226i, long j5) {
        D d5;
        kotlin.jvm.internal.l.f("sink", c0226i);
        if (j5 < 0) {
            throw new IllegalArgumentException(AbstractC2107A.r("byteCount < 0: ", j5).toString());
        }
        if (this.f3045o) {
            throw new IllegalStateException("closed");
        }
        D d6 = this.f3043m;
        C0226i c0226i2 = this.f3042l;
        if (d6 != null) {
            D d7 = c0226i2.f3090k;
            if (d6 == d7) {
                int i = this.f3044n;
                kotlin.jvm.internal.l.c(d7);
            }
            throw new IllegalStateException("Peek source is invalid because upstream source was used");
        }
        if (j5 == 0) {
            return 0L;
        }
        if (!this.f3041k.j(this.f3046p + 1)) {
            return -1L;
        }
        if (this.f3043m == null && (d5 = c0226i2.f3090k) != null) {
            this.f3043m = d5;
            this.f3044n = d5.f3054b;
        }
        long min = Math.min(j5, c0226i2.f3091l - this.f3046p);
        this.f3042l.k(c0226i, this.f3046p, min);
        this.f3046p += min;
        return min;
    }
}
