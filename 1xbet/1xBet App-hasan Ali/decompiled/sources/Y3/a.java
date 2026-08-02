package Y3;

import Z.p;
import Z.q;
import b0.o;
import java.util.AbstractList;
import java.util.ConcurrentModificationException;
import java.util.ListIterator;
import java.util.NoSuchElementException;
import kotlin.jvm.internal.l;
import r.C2316B;
import z0.C2760q;

/* loaded from: classes.dex */
public final class a implements ListIterator, j4.a {

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ int f6137k;

    /* renamed from: l, reason: collision with root package name */
    public int f6138l;

    /* renamed from: m, reason: collision with root package name */
    public int f6139m;

    /* renamed from: n, reason: collision with root package name */
    public int f6140n;

    /* renamed from: o, reason: collision with root package name */
    public final Object f6141o;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public a(C2760q c2760q, int i, int i5) {
        this(c2760q, (i5 & 1) != 0 ? 0 : i, 0, c2760q.f21850k.f18905b);
        this.f6137k = 3;
    }

    public void a() {
        int i;
        i = ((AbstractList) ((b) this.f6141o).f6146o).modCount;
        if (i != this.f6140n) {
            throw new ConcurrentModificationException();
        }
    }

    @Override // java.util.ListIterator
    public final void add(Object obj) {
        int i;
        int i5;
        switch (this.f6137k) {
            case 0:
                a();
                int i6 = this.f6138l;
                this.f6138l = i6 + 1;
                b bVar = (b) this.f6141o;
                bVar.add(i6, obj);
                this.f6139m = -1;
                i = ((AbstractList) bVar).modCount;
                this.f6140n = i;
                return;
            case 1:
                b();
                int i7 = this.f6138l;
                this.f6138l = i7 + 1;
                c cVar = (c) this.f6141o;
                cVar.add(i7, obj);
                this.f6139m = -1;
                i5 = ((AbstractList) cVar).modCount;
                this.f6140n = i5;
                return;
            case 2:
                c();
                int i8 = this.f6138l + 1;
                p pVar = (p) this.f6141o;
                pVar.add(i8, obj);
                this.f6139m = -1;
                this.f6138l++;
                this.f6140n = q.f(pVar);
                return;
            default:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    public void b() {
        int i;
        i = ((AbstractList) ((c) this.f6141o)).modCount;
        if (i != this.f6140n) {
            throw new ConcurrentModificationException();
        }
    }

    public void c() {
        if (q.f((p) this.f6141o) != this.f6140n) {
            throw new ConcurrentModificationException();
        }
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final boolean hasNext() {
        switch (this.f6137k) {
            case 0:
                return this.f6138l < ((b) this.f6141o).f6144m;
            case 1:
                return this.f6138l < ((c) this.f6141o).f6149l;
            case 2:
                return this.f6138l < ((p) this.f6141o).size() - 1;
            default:
                return this.f6138l < this.f6140n;
        }
    }

    @Override // java.util.ListIterator
    public final boolean hasPrevious() {
        switch (this.f6137k) {
            case 0:
                if (this.f6138l > 0) {
                }
                break;
            case 1:
                if (this.f6138l > 0) {
                }
                break;
            case 2:
                if (this.f6138l >= 0) {
                }
                break;
            default:
                if (this.f6138l > this.f6139m) {
                }
                break;
        }
        return false;
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final Object next() {
        switch (this.f6137k) {
            case 0:
                a();
                int i = this.f6138l;
                b bVar = (b) this.f6141o;
                if (i >= bVar.f6144m) {
                    throw new NoSuchElementException();
                }
                this.f6138l = i + 1;
                this.f6139m = i;
                return bVar.f6142k[bVar.f6143l + i];
            case 1:
                b();
                int i5 = this.f6138l;
                c cVar = (c) this.f6141o;
                if (i5 >= cVar.f6149l) {
                    throw new NoSuchElementException();
                }
                this.f6138l = i5 + 1;
                this.f6139m = i5;
                return cVar.f6148k[i5];
            case 2:
                c();
                int i6 = this.f6138l + 1;
                this.f6139m = i6;
                p pVar = (p) this.f6141o;
                q.a(i6, pVar.size());
                Object obj = pVar.get(i6);
                this.f6138l = i6;
                return obj;
            default:
                C2316B c2316b = ((C2760q) this.f6141o).f21850k;
                int i7 = this.f6138l;
                this.f6138l = i7 + 1;
                Object e3 = c2316b.e(i7);
                l.d("null cannot be cast to non-null type androidx.compose.ui.Modifier.Node", e3);
                return (o) e3;
        }
    }

    @Override // java.util.ListIterator
    public final int nextIndex() {
        switch (this.f6137k) {
            case 0:
                return this.f6138l;
            case 1:
                return this.f6138l;
            case 2:
                return this.f6138l + 1;
            default:
                return this.f6138l - this.f6139m;
        }
    }

    @Override // java.util.ListIterator
    public final Object previous() {
        switch (this.f6137k) {
            case 0:
                a();
                int i = this.f6138l;
                if (i <= 0) {
                    throw new NoSuchElementException();
                }
                int i5 = i - 1;
                this.f6138l = i5;
                this.f6139m = i5;
                b bVar = (b) this.f6141o;
                return bVar.f6142k[bVar.f6143l + i5];
            case 1:
                b();
                int i6 = this.f6138l;
                if (i6 <= 0) {
                    throw new NoSuchElementException();
                }
                int i7 = i6 - 1;
                this.f6138l = i7;
                this.f6139m = i7;
                return ((c) this.f6141o).f6148k[i7];
            case 2:
                c();
                int i8 = this.f6138l;
                p pVar = (p) this.f6141o;
                q.a(i8, pVar.size());
                int i9 = this.f6138l;
                this.f6139m = i9;
                this.f6138l--;
                return pVar.get(i9);
            default:
                C2316B c2316b = ((C2760q) this.f6141o).f21850k;
                int i10 = this.f6138l - 1;
                this.f6138l = i10;
                Object e3 = c2316b.e(i10);
                l.d("null cannot be cast to non-null type androidx.compose.ui.Modifier.Node", e3);
                return (o) e3;
        }
    }

    @Override // java.util.ListIterator
    public final int previousIndex() {
        switch (this.f6137k) {
            case 0:
                return this.f6138l - 1;
            case 1:
                return this.f6138l - 1;
            case 2:
                return this.f6138l;
            default:
                return (this.f6138l - this.f6139m) - 1;
        }
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final void remove() {
        int i;
        int i5;
        switch (this.f6137k) {
            case 0:
                a();
                int i6 = this.f6139m;
                if (i6 == -1) {
                    throw new IllegalStateException("Call next() or previous() before removing element from the iterator.");
                }
                b bVar = (b) this.f6141o;
                bVar.d(i6);
                this.f6138l = this.f6139m;
                this.f6139m = -1;
                i = ((AbstractList) bVar).modCount;
                this.f6140n = i;
                return;
            case 1:
                b();
                int i7 = this.f6139m;
                if (i7 == -1) {
                    throw new IllegalStateException("Call next() or previous() before removing element from the iterator.");
                }
                c cVar = (c) this.f6141o;
                cVar.d(i7);
                this.f6138l = this.f6139m;
                this.f6139m = -1;
                i5 = ((AbstractList) cVar).modCount;
                this.f6140n = i5;
                return;
            case 2:
                c();
                int i8 = this.f6139m;
                p pVar = (p) this.f6141o;
                pVar.remove(i8);
                this.f6138l--;
                this.f6139m = -1;
                this.f6140n = q.f(pVar);
                return;
            default:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    @Override // java.util.ListIterator
    public final void set(Object obj) {
        switch (this.f6137k) {
            case 0:
                a();
                int i = this.f6139m;
                if (i == -1) {
                    throw new IllegalStateException("Call next() or previous() before replacing element from the iterator.");
                }
                ((b) this.f6141o).set(i, obj);
                return;
            case 1:
                b();
                int i5 = this.f6139m;
                if (i5 == -1) {
                    throw new IllegalStateException("Call next() or previous() before replacing element from the iterator.");
                }
                ((c) this.f6141o).set(i5, obj);
                return;
            case 2:
                c();
                int i6 = this.f6139m;
                if (i6 < 0) {
                    throw new IllegalStateException("Cannot call set before the first call to next() or previous() or immediately after a call to add() or remove()");
                }
                p pVar = (p) this.f6141o;
                pVar.set(i6, obj);
                this.f6140n = q.f(pVar);
                return;
            default:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    public a(c cVar, int i) {
        int i5;
        this.f6137k = 1;
        this.f6141o = cVar;
        this.f6138l = i;
        this.f6139m = -1;
        i5 = ((AbstractList) cVar).modCount;
        this.f6140n = i5;
    }

    public a(p pVar, int i) {
        this.f6137k = 2;
        this.f6141o = pVar;
        this.f6138l = i - 1;
        this.f6139m = -1;
        this.f6140n = q.f(pVar);
    }

    public a(C2760q c2760q, int i, int i5, int i6) {
        this.f6137k = 3;
        this.f6141o = c2760q;
        this.f6138l = i;
        this.f6139m = i5;
        this.f6140n = i6;
    }

    public a(b bVar, int i) {
        int i5;
        this.f6137k = 0;
        this.f6141o = bVar;
        this.f6138l = i;
        this.f6139m = -1;
        i5 = ((AbstractList) bVar).modCount;
        this.f6140n = i5;
    }
}
