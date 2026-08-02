package k4;

import java.util.AbstractMap;
import java.util.ArrayDeque;
import java.util.Comparator;
import java.util.EmptyStackException;
import java.util.Iterator;
import java.util.NoSuchElementException;

/* renamed from: k4.d, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C1342d implements Iterator {

    /* renamed from: a, reason: collision with root package name */
    public final ArrayDeque f14773a = new ArrayDeque();

    /* renamed from: b, reason: collision with root package name */
    public final boolean f14774b;

    public C1342d(InterfaceC1346h interfaceC1346h, Object obj, Comparator comparator, boolean z4) {
        this.f14774b = z4;
        while (!interfaceC1346h.isEmpty()) {
            int compare = obj != null ? z4 ? comparator.compare(obj, interfaceC1346h.getKey()) : comparator.compare(interfaceC1346h.getKey(), obj) : 1;
            if (compare < 0) {
                interfaceC1346h = z4 ? interfaceC1346h.a() : interfaceC1346h.g();
            } else if (compare == 0) {
                this.f14773a.push((AbstractC1348j) interfaceC1346h);
                return;
            } else {
                this.f14773a.push((AbstractC1348j) interfaceC1346h);
                interfaceC1346h = z4 ? interfaceC1346h.g() : interfaceC1346h.a();
            }
        }
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f14773a.size() > 0;
    }

    @Override // java.util.Iterator
    public final Object next() {
        ArrayDeque arrayDeque = this.f14773a;
        try {
            AbstractC1348j abstractC1348j = (AbstractC1348j) arrayDeque.pop();
            AbstractMap.SimpleEntry simpleEntry = new AbstractMap.SimpleEntry(abstractC1348j.f14778a, abstractC1348j.f14779b);
            if (this.f14774b) {
                for (InterfaceC1346h interfaceC1346h = abstractC1348j.f14780c; !interfaceC1346h.isEmpty(); interfaceC1346h = interfaceC1346h.g()) {
                    arrayDeque.push((AbstractC1348j) interfaceC1346h);
                }
            } else {
                for (InterfaceC1346h interfaceC1346h2 = abstractC1348j.f14781d; !interfaceC1346h2.isEmpty(); interfaceC1346h2 = interfaceC1346h2.a()) {
                    arrayDeque.push((AbstractC1348j) interfaceC1346h2);
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
