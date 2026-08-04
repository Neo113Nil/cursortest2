package E3;

import java.util.Collection;
import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.Map;

/* JADX INFO: renamed from: E3.c, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public class C0145c implements Iterator {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f2039a = 0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Iterator f2040b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Object f2041c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Object f2042d;

    public C0145c(C0154l c0154l) {
        this.f2042d = c0154l;
        Collection collection = c0154l.f2056b;
        this.f2041c = collection;
        this.f2040b = collection instanceof List ? ((List) collection).listIterator() : collection.iterator();
    }

    public void a() {
        C0154l c0154l = (C0154l) this.f2042d;
        c0154l.m();
        if (c0154l.f2056b != ((Collection) this.f2041c)) {
            throw new ConcurrentModificationException();
        }
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        switch (this.f2039a) {
            case 0:
                break;
            case 1:
                break;
            default:
                a();
                break;
        }
        return this.f2040b.hasNext();
    }

    @Override // java.util.Iterator
    public final Object next() {
        switch (this.f2039a) {
            case 0:
                Map.Entry entry = (Map.Entry) this.f2040b.next();
                this.f2041c = (Collection) entry.getValue();
                return ((C0146d) this.f2042d).a(entry);
            case 1:
                Map.Entry entry2 = (Map.Entry) this.f2040b.next();
                this.f2041c = entry2;
                return entry2.getKey();
            default:
                a();
                return this.f2040b.next();
        }
    }

    @Override // java.util.Iterator
    public final void remove() {
        switch (this.f2039a) {
            case 0:
                p113p3.f.q("no calls to next() since the last call to remove()", ((Collection) this.f2041c) != null);
                this.f2040b.remove();
                ((C0146d) this.f2042d).f2046d.f1997e -= ((Collection) this.f2041c).size();
                ((Collection) this.f2041c).clear();
                this.f2041c = null;
                break;
            case 1:
                p113p3.f.q("no calls to next() since the last call to remove()", ((Map.Entry) this.f2041c) != null);
                Collection collection = (Collection) ((Map.Entry) this.f2041c).getValue();
                this.f2040b.remove();
                ((C0147e) this.f2042d).f2048b.f1997e -= collection.size();
                collection.clear();
                this.f2041c = null;
                break;
            default:
                this.f2040b.remove();
                C0154l c0154l = (C0154l) this.f2042d;
                c0154l.f2059e.f1997e--;
                c0154l.t();
                break;
        }
    }

    public C0145c(C0154l c0154l, ListIterator listIterator) {
        this.f2042d = c0154l;
        this.f2041c = c0154l.f2056b;
        this.f2040b = listIterator;
    }

    public C0145c(C0147e c0147e, Iterator it) {
        this.f2042d = c0147e;
        this.f2040b = it;
    }

    public C0145c(C0146d c0146d) {
        this.f2042d = c0146d;
        this.f2040b = c0146d.f2045c.entrySet().iterator();
    }
}
