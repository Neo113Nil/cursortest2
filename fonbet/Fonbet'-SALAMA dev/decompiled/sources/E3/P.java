package E3;

import java.util.Objects;

/* loaded from: classes2.dex */
public final class P extends AbstractC0167z {

    /* renamed from: c, reason: collision with root package name */
    public final transient Object[] f2009c;

    /* renamed from: d, reason: collision with root package name */
    public final transient int f2010d;

    /* renamed from: e, reason: collision with root package name */
    public final transient int f2011e;

    public P(Object[] objArr, int i7, int i8) {
        this.f2009c = objArr;
        this.f2010d = i7;
        this.f2011e = i8;
    }

    @Override // E3.AbstractC0162u
    public final boolean A() {
        return true;
    }

    @Override // java.util.List
    public final Object get(int i7) {
        p3.f.i(i7, this.f2011e);
        Object obj = this.f2009c[(i7 * 2) + this.f2010d];
        Objects.requireNonNull(obj);
        return obj;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f2011e;
    }
}
