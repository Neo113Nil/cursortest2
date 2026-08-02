package P;

/* loaded from: classes.dex */
public final class E implements g1 {

    /* renamed from: a, reason: collision with root package name */
    public final kotlin.jvm.internal.m f4272a;

    /* JADX WARN: Multi-variable type inference failed */
    public E(i4.c cVar) {
        this.f4272a = (kotlin.jvm.internal.m) cVar;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [i4.c, kotlin.jvm.internal.m] */
    @Override // P.g1
    public final Object a(InterfaceC0314r0 interfaceC0314r0) {
        return this.f4272a.c(interfaceC0314r0);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof E) && this.f4272a.equals(((E) obj).f4272a);
    }

    public final int hashCode() {
        return this.f4272a.hashCode();
    }

    public final String toString() {
        return "ComputedValueHolder(compute=" + this.f4272a + ')';
    }
}
