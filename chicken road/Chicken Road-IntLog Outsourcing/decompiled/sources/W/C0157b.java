package W;

/* renamed from: W.b, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0157b {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f3297a;

    /* renamed from: b, reason: collision with root package name */
    public long f3298b;

    /* renamed from: c, reason: collision with root package name */
    public Object f3299c;

    public C0157b(j5.q source) {
        this.f3297a = 1;
        kotlin.jvm.internal.i.e(source, "source");
        this.f3299c = source;
        this.f3298b = 262144L;
    }

    public int a(int i2) {
        C0157b c0157b = (C0157b) this.f3299c;
        if (c0157b == null) {
            return i2 >= 64 ? Long.bitCount(this.f3298b) : Long.bitCount(this.f3298b & ((1 << i2) - 1));
        }
        if (i2 < 64) {
            return Long.bitCount(this.f3298b & ((1 << i2) - 1));
        }
        return Long.bitCount(this.f3298b) + c0157b.a(i2 - 64);
    }

    public boolean b(int i2) {
        if (i2 < 64) {
            return (this.f3298b & (1 << i2)) != 0;
        }
        if (((C0157b) this.f3299c) == null) {
            this.f3299c = new C0157b();
        }
        return ((C0157b) this.f3299c).b(i2 - 64);
    }

    public T4.o c() {
        L3.j jVar = new L3.j(3);
        while (true) {
            String q5 = ((j5.q) this.f3299c).q(this.f3298b);
            this.f3298b -= q5.length();
            if (q5.length() == 0) {
                return jVar.d();
            }
            int W5 = B4.k.W(q5, ':', 1, false, 4);
            if (W5 != -1) {
                String substring = q5.substring(0, W5);
                kotlin.jvm.internal.i.d(substring, "substring(...)");
                String substring2 = q5.substring(W5 + 1);
                kotlin.jvm.internal.i.d(substring2, "substring(...)");
                B0.f.i(jVar, substring, substring2);
            } else if (q5.charAt(0) == ':') {
                String substring3 = q5.substring(1);
                kotlin.jvm.internal.i.d(substring3, "substring(...)");
                B0.f.i(jVar, "", substring3);
            } else {
                B0.f.i(jVar, "", q5);
            }
        }
    }

    public void d() {
        this.f3298b = 0L;
        C0157b c0157b = (C0157b) this.f3299c;
        if (c0157b != null) {
            c0157b.d();
        }
    }

    public String toString() {
        switch (this.f3297a) {
            case 0:
                if (((C0157b) this.f3299c) == null) {
                    return Long.toBinaryString(this.f3298b);
                }
                return ((C0157b) this.f3299c).toString() + "xx" + Long.toBinaryString(this.f3298b);
            default:
                return super.toString();
        }
    }

    public C0157b() {
        this.f3297a = 0;
        this.f3298b = 0L;
    }
}
