package Y0;

import C.C2702w;
import gd.InterfaceC6712a;
import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.Map;
import java.util.NoSuchElementException;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes8.dex */
public final class c<E> implements Iterator<E>, InterfaceC6712a {

    /* renamed from: a, reason: collision with root package name */
    private Object f34522a;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private final Map<E, a> f34523b;

    /* renamed from: c, reason: collision with root package name */
    private int f34524c;

    public c(@NotNull Map map, Object obj) {
        this.f34522a = obj;
        this.f34523b = map;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f34524c < this.f34523b.size();
    }

    @Override // java.util.Iterator
    public final E next() {
        if (!hasNext()) {
            throw new NoSuchElementException();
        }
        E e11 = (E) this.f34522a;
        this.f34524c++;
        a aVar = this.f34523b.get(e11);
        if (aVar == null) {
            throw new ConcurrentModificationException(C2702w.c(e11, "Hash code of an element (", ") has changed after it was added to the persistent set."));
        }
        this.f34522a = aVar.c();
        return e11;
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
