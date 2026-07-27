package u2;

import java.util.Iterator;
import java.util.NoSuchElementException;

/* loaded from: classes.dex */
public final class b implements Iterator, p2.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f10378a;

    /* renamed from: b, reason: collision with root package name */
    public final Iterator f10379b;

    /* renamed from: c, reason: collision with root package name */
    public int f10380c;

    /* renamed from: d, reason: collision with root package name */
    public Object f10381d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ e f10382e;

    public b(c cVar) {
        this.f10378a = 0;
        this.f10382e = cVar;
        this.f10379b = cVar.f10383a.iterator();
        this.f10380c = -1;
    }

    public void a() {
        Object next;
        c cVar;
        do {
            Iterator it = this.f10379b;
            if (!it.hasNext()) {
                this.f10380c = 0;
                return;
            } else {
                next = it.next();
                cVar = (c) this.f10382e;
            }
        } while (((Boolean) cVar.f10385c.invoke(next)).booleanValue() != cVar.f10384b);
        this.f10381d = next;
        this.f10380c = 1;
    }

    public boolean b() {
        Iterator it;
        Iterator it2 = (Iterator) this.f10381d;
        if (it2 != null && it2.hasNext()) {
            this.f10380c = 1;
            return true;
        }
        do {
            Iterator it3 = this.f10379b;
            if (!it3.hasNext()) {
                this.f10380c = 2;
                this.f10381d = null;
                return false;
            }
            Object next = it3.next();
            d dVar = (d) this.f10382e;
            it = (Iterator) dVar.f10388c.invoke(dVar.f10387b.invoke(next));
        } while (!it.hasNext());
        this.f10381d = it;
        this.f10380c = 1;
        return true;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        switch (this.f10378a) {
            case 0:
                if (this.f10380c == -1) {
                    a();
                }
                return this.f10380c == 1;
            default:
                int i3 = this.f10380c;
                if (i3 == 1) {
                    return true;
                }
                if (i3 == 2) {
                    return false;
                }
                return b();
        }
    }

    @Override // java.util.Iterator
    public final Object next() {
        switch (this.f10378a) {
            case 0:
                if (this.f10380c == -1) {
                    a();
                }
                if (this.f10380c == 0) {
                    throw new NoSuchElementException();
                }
                Object obj = this.f10381d;
                this.f10381d = null;
                this.f10380c = -1;
                return obj;
            default:
                int i3 = this.f10380c;
                if (i3 == 2) {
                    throw new NoSuchElementException();
                }
                if (i3 == 0 && !b()) {
                    throw new NoSuchElementException();
                }
                this.f10380c = 0;
                Iterator it = (Iterator) this.f10381d;
                kotlin.jvm.internal.j.b(it);
                return it.next();
        }
    }

    @Override // java.util.Iterator
    public final void remove() {
        switch (this.f10378a) {
            case 0:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
            default:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    public b(d dVar) {
        this.f10378a = 1;
        this.f10382e = dVar;
        this.f10379b = dVar.f10386a.iterator();
    }
}
