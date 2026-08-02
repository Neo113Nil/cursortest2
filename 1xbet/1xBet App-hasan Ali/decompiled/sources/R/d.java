package R;

import java.util.List;
import java.util.ListIterator;

/* loaded from: classes.dex */
public final class d implements ListIterator, j4.a {

    /* renamed from: k, reason: collision with root package name */
    public final Object f5104k;

    /* renamed from: l, reason: collision with root package name */
    public int f5105l;

    public d(int i, List list) {
        this.f5104k = list;
        this.f5105l = i;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, java.util.List] */
    @Override // java.util.ListIterator
    public final void add(Object obj) {
        this.f5104k.add(this.f5105l, obj);
        this.f5105l++;
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [java.lang.Object, java.util.List] */
    @Override // java.util.ListIterator, java.util.Iterator
    public final boolean hasNext() {
        return this.f5105l < this.f5104k.size();
    }

    @Override // java.util.ListIterator
    public final boolean hasPrevious() {
        return this.f5105l > 0;
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Object, java.util.List] */
    @Override // java.util.ListIterator, java.util.Iterator
    public final Object next() {
        int i = this.f5105l;
        this.f5105l = i + 1;
        return this.f5104k.get(i);
    }

    @Override // java.util.ListIterator
    public final int nextIndex() {
        return this.f5105l;
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [java.lang.Object, java.util.List] */
    @Override // java.util.ListIterator
    public final Object previous() {
        int i = this.f5105l - 1;
        this.f5105l = i;
        return this.f5104k.get(i);
    }

    @Override // java.util.ListIterator
    public final int previousIndex() {
        return this.f5105l - 1;
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [java.lang.Object, java.util.List] */
    @Override // java.util.ListIterator, java.util.Iterator
    public final void remove() {
        int i = this.f5105l - 1;
        this.f5105l = i;
        this.f5104k.remove(i);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, java.util.List] */
    @Override // java.util.ListIterator
    public final void set(Object obj) {
        this.f5104k.set(this.f5105l, obj);
    }
}
