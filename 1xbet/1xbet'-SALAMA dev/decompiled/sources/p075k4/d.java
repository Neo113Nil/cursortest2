package p075k4;

import java.util.AbstractMap;
import java.util.ArrayDeque;
import java.util.Comparator;
import java.util.EmptyStackException;
import java.util.Iterator;
import java.util.NoSuchElementException;

/* JADX INFO: loaded from: classes2.dex */
public final class d implements Iterator {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ArrayDeque f14779a = new ArrayDeque();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f14780b;

    public d(h hVar, Object obj, Comparator comparator, boolean z4) {
        this.f14780b = z4;
        while (!hVar.isEmpty()) {
            int iCompare = obj != null ? z4 ? comparator.compare(obj, hVar.getKey()) : comparator.compare(hVar.getKey(), obj) : 1;
            if (iCompare < 0) {
                hVar = z4 ? hVar.a() : hVar.g();
            } else if (iCompare == 0) {
                this.f14779a.push((j) hVar);
                return;
            } else {
                this.f14779a.push((j) hVar);
                hVar = z4 ? hVar.g() : hVar.a();
            }
        }
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f14779a.size() > 0;
    }

    @Override // java.util.Iterator
    public final Object next() {
        ArrayDeque arrayDeque = this.f14779a;
        try {
            j jVar = (j) arrayDeque.pop();
            AbstractMap.SimpleEntry simpleEntry = new AbstractMap.SimpleEntry(jVar.f14784a, jVar.f14785b);
            if (this.f14780b) {
                for (h hVarG = jVar.f14786c; !hVarG.isEmpty(); hVarG = hVarG.g()) {
                    arrayDeque.push((j) hVarG);
                }
            } else {
                for (h hVarA = jVar.f14787d; !hVarA.isEmpty(); hVarA = hVarA.a()) {
                    arrayDeque.push((j) hVarA);
                }
            }
            return simpleEntry;
        } catch (EmptyStackException unused) {
            throw new NoSuchElementException();
        }
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException("remove called on immutable collection");
    }
}
