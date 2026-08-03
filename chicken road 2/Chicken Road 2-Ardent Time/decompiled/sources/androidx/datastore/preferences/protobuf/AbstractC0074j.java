package androidx.datastore.preferences.protobuf;

/* renamed from: androidx.datastore.preferences.protobuf.j, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC0074j {

    /* renamed from: a, reason: collision with root package name */
    public int f2322a;

    /* renamed from: b, reason: collision with root package name */
    public androidx.datastore.preferences.protobuf.C0075k f2323b;

    public abstract void a(int i2);

    public abstract int b();

    public abstract boolean c();

    public abstract void d(int i2);

    public abstract int e(int i2);

    public abstract boolean f();

    public abstract androidx.datastore.preferences.protobuf.C0071g g();

    public abstract double h();

    public abstract int i();

    public abstract int j();

    public abstract long k();

    public abstract float l();

    public abstract int m();

    public abstract long n();

    public abstract int o();

    public abstract long p();

    public abstract int q();

    public abstract long r();

    public abstract java.lang.String s();

    public abstract java.lang.String t();

    public abstract int u();

    public abstract int v();

    public abstract long w();

    public abstract boolean x(int i2);

    public final void y() {
        int u2;
        do {
            u2 = u();
            if (u2 == 0) {
                return;
            }
            int i2 = this.f2322a;
            if (i2 >= 100) {
                throw new androidx.datastore.preferences.protobuf.A("Protocol message had too many levels of nesting.  May be malicious.  Use setRecursionLimit() to increase the recursion depth limit.");
            }
            this.f2322a = i2 + 1;
            this.f2322a--;
        } while (x(u2));
    }
}
