package E3;

/* loaded from: classes2.dex */
public final class O extends B {

    /* renamed from: c, reason: collision with root package name */
    public final transient Q f2007c;

    /* renamed from: d, reason: collision with root package name */
    public final transient P f2008d;

    public O(Q q7, P p5) {
        this.f2007c = q7;
        this.f2008d = p5;
    }

    @Override // E3.AbstractC0162u
    public final boolean A() {
        return true;
    }

    @Override // E3.B
    /* renamed from: F */
    public final a0 iterator() {
        return this.f2008d.listIterator(0);
    }

    @Override // E3.AbstractC0162u, java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean contains(Object obj) {
        return this.f2007c.get(obj) != null;
    }

    @Override // E3.B, E3.AbstractC0162u
    public final AbstractC0167z l() {
        return this.f2008d;
    }

    @Override // E3.AbstractC0162u
    public final int m(int i7, Object[] objArr) {
        return this.f2008d.m(i7, objArr);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        return this.f2007c.f2018f;
    }
}
