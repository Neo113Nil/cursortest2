package k4;

import java.util.AbstractMap;
import java.util.Iterator;

/* renamed from: k4.a, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C1339a implements Iterator {

    /* renamed from: a, reason: collision with root package name */
    public int f14767a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ boolean f14768b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ C1340b f14769c;

    public C1339a(C1340b c1340b, int i7, boolean z4) {
        this.f14769c = c1340b;
        this.f14768b = z4;
        this.f14767a = i7;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        if (this.f14768b) {
            if (this.f14767a < 0) {
                return false;
            }
        } else if (this.f14767a >= this.f14769c.f14770a.length) {
            return false;
        }
        return true;
    }

    @Override // java.util.Iterator
    public final Object next() {
        C1340b c1340b = this.f14769c;
        Object[] objArr = c1340b.f14770a;
        int i7 = this.f14767a;
        Object obj = objArr[i7];
        Object obj2 = c1340b.f14771b[i7];
        this.f14767a = this.f14768b ? i7 - 1 : i7 + 1;
        return new AbstractMap.SimpleImmutableEntry(obj, obj2);
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException("Can't remove elements from ImmutableSortedMap");
    }
}
