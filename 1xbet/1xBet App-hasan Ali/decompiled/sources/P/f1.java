package P;

/* loaded from: classes.dex */
public final class f1 implements g1 {

    /* renamed from: a, reason: collision with root package name */
    public final Object f4468a;

    public f1(Object obj) {
        this.f4468a = obj;
    }

    @Override // P.g1
    public final Object a(InterfaceC0314r0 interfaceC0314r0) {
        return this.f4468a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof f1) && kotlin.jvm.internal.l.a(this.f4468a, ((f1) obj).f4468a);
    }

    public final int hashCode() {
        Object obj = this.f4468a;
        if (obj == null) {
            return 0;
        }
        return obj.hashCode();
    }

    public final String toString() {
        return "StaticValueHolder(value=" + this.f4468a + ')';
    }
}
