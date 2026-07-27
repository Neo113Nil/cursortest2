package U;

/* renamed from: U.b, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0062b {

    /* renamed from: a, reason: collision with root package name */
    public long f1521a = 0;

    /* renamed from: b, reason: collision with root package name */
    public C0062b f1522b;

    public final int a(int i3) {
        C0062b c0062b = this.f1522b;
        if (c0062b == null) {
            return i3 >= 64 ? Long.bitCount(this.f1521a) : Long.bitCount(this.f1521a & ((1 << i3) - 1));
        }
        if (i3 < 64) {
            return Long.bitCount(this.f1521a & ((1 << i3) - 1));
        }
        return Long.bitCount(this.f1521a) + c0062b.a(i3 - 64);
    }

    public final boolean b(int i3) {
        if (i3 < 64) {
            return (this.f1521a & (1 << i3)) != 0;
        }
        if (this.f1522b == null) {
            this.f1522b = new C0062b();
        }
        return this.f1522b.b(i3 - 64);
    }

    public final void c() {
        this.f1521a = 0L;
        C0062b c0062b = this.f1522b;
        if (c0062b != null) {
            c0062b.c();
        }
    }

    public final String toString() {
        if (this.f1522b == null) {
            return Long.toBinaryString(this.f1521a);
        }
        return this.f1522b.toString() + "xx" + Long.toBinaryString(this.f1521a);
    }
}
