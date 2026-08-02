package P;

/* loaded from: classes.dex */
public final class L implements g1 {

    /* renamed from: a, reason: collision with root package name */
    public final C0305m0 f4330a;

    public L(C0305m0 c0305m0) {
        this.f4330a = c0305m0;
    }

    @Override // P.g1
    public final Object a(InterfaceC0314r0 interfaceC0314r0) {
        return this.f4330a.getValue();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof L) && this.f4330a.equals(((L) obj).f4330a);
    }

    public final int hashCode() {
        return this.f4330a.hashCode();
    }

    public final String toString() {
        return "DynamicValueHolder(state=" + this.f4330a + ')';
    }
}
