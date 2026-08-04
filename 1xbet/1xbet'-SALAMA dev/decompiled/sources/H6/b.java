package H6;

import com.google.protobuf.C0865j;
import com.google.protobuf.C0869l;
import com.google.protobuf.M;

/* JADX INFO: loaded from: classes2.dex */
public abstract class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f3424a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f3425b = 100;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Object f3426c;

    public static int b(int i7) {
        return (-(i7 & 1)) ^ (i7 >>> 1);
    }

    public static long d(long j) {
        return (-(j & 1)) ^ (j >>> 1);
    }

    public static C0869l g(byte[] bArr, int i7, int i8, boolean z4) {
        C0869l c0869l = new C0869l(bArr, i7, i8, z4);
        try {
            c0869l.i(i8);
            return c0869l;
        } catch (M e7) {
            throw new IllegalArgumentException(e7);
        }
    }

    public abstract int A();

    public abstract int B();

    public abstract long C();

    public abstract boolean D(int i7);

    public abstract void a(int i7);

    public abstract int e();

    public abstract boolean f();

    public abstract void h(int i7);

    public abstract int i(int i7);

    public abstract boolean j();

    public abstract C0865j k();

    public abstract double l();

    public abstract int m();

    public abstract int n();

    public abstract long o();

    public abstract float p();

    public abstract int q();

    public abstract long s();

    public abstract int u();

    public abstract long v();

    public abstract int w();

    public abstract long x();

    public abstract String y();

    public abstract String z();
}
