package A1;

import java.util.Arrays;
import n3.AbstractC1464a;

/* loaded from: classes.dex */
public final class A0 implements InterfaceC0027k {

    /* renamed from: a, reason: collision with root package name */
    public final Object f62a;

    /* renamed from: b, reason: collision with root package name */
    public final int f63b;

    /* renamed from: c, reason: collision with root package name */
    public final C0022h0 f64c;

    /* renamed from: d, reason: collision with root package name */
    public final Object f65d;

    /* renamed from: e, reason: collision with root package name */
    public final int f66e;

    /* renamed from: f, reason: collision with root package name */
    public final long f67f;

    /* renamed from: x, reason: collision with root package name */
    public final long f68x;

    /* renamed from: y, reason: collision with root package name */
    public final int f69y;

    /* renamed from: z, reason: collision with root package name */
    public final int f70z;

    public A0(Object obj, int i7, C0022h0 c0022h0, Object obj2, int i8, long j, long j3, int i9, int i10) {
        this.f62a = obj;
        this.f63b = i7;
        this.f64c = c0022h0;
        this.f65d = obj2;
        this.f66e = i8;
        this.f67f = j;
        this.f68x = j3;
        this.f69y = i9;
        this.f70z = i10;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || A0.class != obj.getClass()) {
            return false;
        }
        A0 a02 = (A0) obj;
        return this.f63b == a02.f63b && this.f66e == a02.f66e && this.f67f == a02.f67f && this.f68x == a02.f68x && this.f69y == a02.f69y && this.f70z == a02.f70z && AbstractC1464a.t(this.f62a, a02.f62a) && AbstractC1464a.t(this.f65d, a02.f65d) && AbstractC1464a.t(this.f64c, a02.f64c);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f62a, Integer.valueOf(this.f63b), this.f64c, this.f65d, Integer.valueOf(this.f66e), Long.valueOf(this.f67f), Long.valueOf(this.f68x), Integer.valueOf(this.f69y), Integer.valueOf(this.f70z)});
    }
}
