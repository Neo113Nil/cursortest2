package R4;

import androidx.datastore.preferences.protobuf.C0212g;
import androidx.datastore.preferences.protobuf.C0230z;

/* loaded from: classes.dex */
public abstract class c {

    /* renamed from: a, reason: collision with root package name */
    public int f2676a;

    /* renamed from: b, reason: collision with root package name */
    public Object f2677b;

    public abstract void a(int i2);

    public abstract int b();

    public abstract boolean c();

    public abstract void d(int i2);

    public abstract int e(int i2);

    public abstract boolean f();

    public abstract C0212g g();

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

    public abstract String s();

    public abstract String t();

    public abstract int u();

    public abstract int v();

    public abstract long w();

    public abstract boolean x(int i2);

    public void y() {
        int u5;
        do {
            u5 = u();
            if (u5 == 0) {
                return;
            }
            int i2 = this.f2676a;
            if (i2 >= 100) {
                throw new C0230z("Protocol message had too many levels of nesting.  May be malicious.  Use setRecursionLimit() to increase the recursion depth limit.");
            }
            this.f2676a = i2 + 1;
            this.f2676a--;
        } while (x(u5));
    }
}
