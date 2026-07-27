package f2;

import e2.AbstractC0286a;
import java.util.AbstractList;
import java.util.ConcurrentModificationException;
import java.util.ListIterator;
import java.util.NoSuchElementException;

/* renamed from: f2.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0299a implements ListIterator, p2.a {

    /* renamed from: b, reason: collision with root package name */
    public int f4887b;

    /* renamed from: d, reason: collision with root package name */
    public int f4889d;

    /* renamed from: e, reason: collision with root package name */
    public final AbstractC0286a f4890e;

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f4886a = 0;

    /* renamed from: c, reason: collision with root package name */
    public int f4888c = -1;

    public C0299a(c cVar, int i3) {
        int i4;
        this.f4890e = cVar;
        this.f4887b = i3;
        i4 = ((AbstractList) cVar).modCount;
        this.f4889d = i4;
    }

    public void a() {
        int i3;
        i3 = ((AbstractList) ((C0300b) this.f4890e).f4895e).modCount;
        if (i3 != this.f4889d) {
            throw new ConcurrentModificationException();
        }
    }

    @Override // java.util.ListIterator
    public final void add(Object obj) {
        int i3;
        int i4;
        switch (this.f4886a) {
            case 0:
                a();
                int i5 = this.f4887b;
                this.f4887b = i5 + 1;
                C0300b c0300b = (C0300b) this.f4890e;
                c0300b.add(i5, obj);
                this.f4888c = -1;
                i3 = ((AbstractList) c0300b).modCount;
                this.f4889d = i3;
                break;
            default:
                b();
                int i6 = this.f4887b;
                this.f4887b = i6 + 1;
                c cVar = (c) this.f4890e;
                cVar.add(i6, obj);
                this.f4888c = -1;
                i4 = ((AbstractList) cVar).modCount;
                this.f4889d = i4;
                break;
        }
    }

    public void b() {
        int i3;
        i3 = ((AbstractList) ((c) this.f4890e)).modCount;
        if (i3 != this.f4889d) {
            throw new ConcurrentModificationException();
        }
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final boolean hasNext() {
        switch (this.f4886a) {
            case 0:
                if (this.f4887b < ((C0300b) this.f4890e).f4893c) {
                }
                break;
            default:
                if (this.f4887b < ((c) this.f4890e).f4898b) {
                }
                break;
        }
        return false;
    }

    @Override // java.util.ListIterator
    public final boolean hasPrevious() {
        switch (this.f4886a) {
            case 0:
                if (this.f4887b > 0) {
                }
                break;
            default:
                if (this.f4887b > 0) {
                }
                break;
        }
        return false;
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final Object next() {
        switch (this.f4886a) {
            case 0:
                a();
                int i3 = this.f4887b;
                C0300b c0300b = (C0300b) this.f4890e;
                if (i3 >= c0300b.f4893c) {
                    throw new NoSuchElementException();
                }
                this.f4887b = i3 + 1;
                this.f4888c = i3;
                return c0300b.f4891a[c0300b.f4892b + i3];
            default:
                b();
                int i4 = this.f4887b;
                c cVar = (c) this.f4890e;
                if (i4 >= cVar.f4898b) {
                    throw new NoSuchElementException();
                }
                this.f4887b = i4 + 1;
                this.f4888c = i4;
                return cVar.f4897a[i4];
        }
    }

    @Override // java.util.ListIterator
    public final int nextIndex() {
        switch (this.f4886a) {
        }
        return this.f4887b;
    }

    @Override // java.util.ListIterator
    public final Object previous() {
        switch (this.f4886a) {
            case 0:
                a();
                int i3 = this.f4887b;
                if (i3 <= 0) {
                    throw new NoSuchElementException();
                }
                int i4 = i3 - 1;
                this.f4887b = i4;
                this.f4888c = i4;
                C0300b c0300b = (C0300b) this.f4890e;
                return c0300b.f4891a[c0300b.f4892b + i4];
            default:
                b();
                int i5 = this.f4887b;
                if (i5 <= 0) {
                    throw new NoSuchElementException();
                }
                int i6 = i5 - 1;
                this.f4887b = i6;
                this.f4888c = i6;
                return ((c) this.f4890e).f4897a[i6];
        }
    }

    @Override // java.util.ListIterator
    public final int previousIndex() {
        switch (this.f4886a) {
        }
        return this.f4887b - 1;
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final void remove() {
        int i3;
        int i4;
        switch (this.f4886a) {
            case 0:
                a();
                int i5 = this.f4888c;
                if (i5 == -1) {
                    throw new IllegalStateException("Call next() or previous() before removing element from the iterator.");
                }
                C0300b c0300b = (C0300b) this.f4890e;
                c0300b.c(i5);
                this.f4887b = this.f4888c;
                this.f4888c = -1;
                i3 = ((AbstractList) c0300b).modCount;
                this.f4889d = i3;
                return;
            default:
                b();
                int i6 = this.f4888c;
                if (i6 == -1) {
                    throw new IllegalStateException("Call next() or previous() before removing element from the iterator.");
                }
                c cVar = (c) this.f4890e;
                cVar.c(i6);
                this.f4887b = this.f4888c;
                this.f4888c = -1;
                i4 = ((AbstractList) cVar).modCount;
                this.f4889d = i4;
                return;
        }
    }

    @Override // java.util.ListIterator
    public final void set(Object obj) {
        switch (this.f4886a) {
            case 0:
                a();
                int i3 = this.f4888c;
                if (i3 == -1) {
                    throw new IllegalStateException("Call next() or previous() before replacing element from the iterator.");
                }
                ((C0300b) this.f4890e).set(i3, obj);
                return;
            default:
                b();
                int i4 = this.f4888c;
                if (i4 == -1) {
                    throw new IllegalStateException("Call next() or previous() before replacing element from the iterator.");
                }
                ((c) this.f4890e).set(i4, obj);
                return;
        }
    }

    public C0299a(C0300b c0300b, int i3) {
        int i4;
        this.f4890e = c0300b;
        this.f4887b = i3;
        i4 = ((AbstractList) c0300b).modCount;
        this.f4889d = i4;
    }
}
