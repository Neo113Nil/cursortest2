package E3;

import java.util.Objects;

/* loaded from: classes2.dex */
public final class L extends AbstractC0167z {

    /* renamed from: e, reason: collision with root package name */
    public static final L f2000e = new L(new Object[0], 0);

    /* renamed from: c, reason: collision with root package name */
    public final transient Object[] f2001c;

    /* renamed from: d, reason: collision with root package name */
    public final transient int f2002d;

    public L(Object[] objArr, int i7) {
        this.f2001c = objArr;
        this.f2002d = i7;
    }

    @Override // E3.AbstractC0162u
    public final boolean A() {
        return false;
    }

    @Override // java.util.List
    public final Object get(int i7) {
        p3.f.i(i7, this.f2002d);
        Object obj = this.f2001c[i7];
        Objects.requireNonNull(obj);
        return obj;
    }

    @Override // E3.AbstractC0167z, E3.AbstractC0162u
    public final int m(int i7, Object[] objArr) {
        Object[] objArr2 = this.f2001c;
        int i8 = this.f2002d;
        System.arraycopy(objArr2, 0, objArr, i7, i8);
        return i7 + i8;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f2002d;
    }

    @Override // E3.AbstractC0162u
    public final Object[] t() {
        return this.f2001c;
    }

    @Override // E3.AbstractC0162u
    public final int y() {
        return this.f2002d;
    }

    @Override // E3.AbstractC0162u
    public final int z() {
        return 0;
    }
}
