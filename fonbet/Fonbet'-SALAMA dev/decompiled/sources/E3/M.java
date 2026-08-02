package E3;

import java.util.AbstractMap;
import java.util.Objects;

/* loaded from: classes2.dex */
public final class M extends AbstractC0167z {

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ N f2003c;

    public M(N n2) {
        this.f2003c = n2;
    }

    @Override // E3.AbstractC0162u
    public final boolean A() {
        return true;
    }

    @Override // java.util.List
    public final Object get(int i7) {
        N n2 = this.f2003c;
        p3.f.i(i7, n2.f2006e);
        int i8 = i7 * 2;
        Object[] objArr = n2.f2005d;
        Object obj = objArr[i8];
        Objects.requireNonNull(obj);
        Object obj2 = objArr[i8 + 1];
        Objects.requireNonNull(obj2);
        return new AbstractMap.SimpleImmutableEntry(obj, obj2);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f2003c.f2006e;
    }
}
