package p075k4;

import java.util.AbstractMap;
import java.util.Iterator;

/* JADX INFO: loaded from: classes2.dex */
public final class a implements Iterator {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f14773a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ boolean f14774b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ b f14775c;

    public a(b bVar, int i7, boolean z4) {
        this.f14775c = bVar;
        this.f14774b = z4;
        this.f14773a = i7;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        if (this.f14774b) {
            if (this.f14773a < 0) {
                return false;
            }
        } else if (this.f14773a >= this.f14775c.f14776a.length) {
            return false;
        }
        return true;
    }

    @Override // java.util.Iterator
    public final Object next() {
        b bVar = this.f14775c;
        Object[] objArr = bVar.f14776a;
        int i7 = this.f14773a;
        Object obj = objArr[i7];
        Object obj2 = bVar.f14777b[i7];
        this.f14773a = this.f14774b ? i7 - 1 : i7 + 1;
        return new AbstractMap.SimpleImmutableEntry(obj, obj2);
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException("Can't remove elements from ImmutableSortedMap");
    }
}
