package E3;

import java.util.Map;

/* loaded from: classes2.dex */
public final class N extends B {

    /* renamed from: c, reason: collision with root package name */
    public final transient Q f2004c;

    /* renamed from: d, reason: collision with root package name */
    public final transient Object[] f2005d;

    /* renamed from: e, reason: collision with root package name */
    public final transient int f2006e;

    public N(Q q7, Object[] objArr, int i7) {
        this.f2004c = q7;
        this.f2005d = objArr;
        this.f2006e = i7;
    }

    @Override // E3.AbstractC0162u
    public final boolean A() {
        return true;
    }

    @Override // E3.B
    public final AbstractC0167z E() {
        return new M(this);
    }

    @Override // E3.B
    /* renamed from: F */
    public final a0 iterator() {
        return l().listIterator(0);
    }

    @Override // E3.AbstractC0162u, java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean contains(Object obj) {
        if (!(obj instanceof Map.Entry)) {
            return false;
        }
        Map.Entry entry = (Map.Entry) obj;
        Object key = entry.getKey();
        Object value = entry.getValue();
        return value != null && value.equals(this.f2004c.get(key));
    }

    @Override // E3.AbstractC0162u
    public final int m(int i7, Object[] objArr) {
        return l().m(i7, objArr);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        return this.f2006e;
    }
}
