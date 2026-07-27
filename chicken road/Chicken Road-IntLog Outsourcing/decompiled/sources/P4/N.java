package P4;

import g4.C0471p;
import java.util.List;
import n2.AbstractC1341c;

/* loaded from: classes.dex */
public final class N implements N4.e {

    /* renamed from: a, reason: collision with root package name */
    public final String f2336a;

    /* renamed from: b, reason: collision with root package name */
    public final N4.d f2337b;

    public N(String str, N4.d kind) {
        kotlin.jvm.internal.i.e(kind, "kind");
        this.f2336a = str;
        this.f2337b = kind;
    }

    @Override // N4.e
    public final int a(String name) {
        kotlin.jvm.internal.i.e(name, "name");
        throw new IllegalStateException("Primitive descriptor does not have elements");
    }

    @Override // N4.e
    public final String b() {
        return this.f2336a;
    }

    @Override // N4.e
    public final AbstractC1341c c() {
        return this.f2337b;
    }

    @Override // N4.e
    public final int d() {
        return 0;
    }

    @Override // N4.e
    public final String e(int i2) {
        throw new IllegalStateException("Primitive descriptor does not have elements");
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof N)) {
            return false;
        }
        N n6 = (N) obj;
        if (kotlin.jvm.internal.i.a(this.f2336a, n6.f2336a)) {
            if (kotlin.jvm.internal.i.a(this.f2337b, n6.f2337b)) {
                return true;
            }
        }
        return false;
    }

    @Override // N4.e
    public final List g(int i2) {
        throw new IllegalStateException("Primitive descriptor does not have elements");
    }

    @Override // N4.e
    public final List getAnnotations() {
        return C0471p.f5750a;
    }

    @Override // N4.e
    public final N4.e h(int i2) {
        throw new IllegalStateException("Primitive descriptor does not have elements");
    }

    public final int hashCode() {
        return (this.f2337b.hashCode() * 31) + this.f2336a.hashCode();
    }

    @Override // N4.e
    public final boolean i(int i2) {
        throw new IllegalStateException("Primitive descriptor does not have elements");
    }

    @Override // N4.e
    public final boolean isInline() {
        return false;
    }

    public final String toString() {
        return B0.o.l(new StringBuilder("PrimitiveDescriptor("), this.f2336a, ')');
    }

    @Override // N4.e
    public final void f() {
    }
}
