package E3;

/* loaded from: classes2.dex */
public final class Z extends B {

    /* renamed from: c, reason: collision with root package name */
    public final transient Object f2032c;

    public Z(Object obj) {
        obj.getClass();
        this.f2032c = obj;
    }

    @Override // E3.AbstractC0162u
    public final boolean A() {
        return false;
    }

    @Override // E3.B
    /* renamed from: F */
    public final a0 iterator() {
        return new D(this.f2032c);
    }

    @Override // E3.AbstractC0162u, java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean contains(Object obj) {
        return this.f2032c.equals(obj);
    }

    @Override // E3.B, java.util.Collection, java.util.Set
    public final int hashCode() {
        return this.f2032c.hashCode();
    }

    @Override // E3.B, E3.AbstractC0162u
    public final AbstractC0167z l() {
        return AbstractC0167z.I(this.f2032c);
    }

    @Override // E3.AbstractC0162u
    public final int m(int i7, Object[] objArr) {
        objArr[i7] = this.f2032c;
        return i7 + 1;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        return 1;
    }

    @Override // java.util.AbstractCollection
    public final String toString() {
        return "[" + this.f2032c.toString() + ']';
    }
}
