package h4;

import g4.AbstractC0460e;
import java.util.AbstractList;
import java.util.ConcurrentModificationException;
import java.util.ListIterator;
import java.util.NoSuchElementException;
import u4.InterfaceC1481a;

/* renamed from: h4.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0483a implements ListIterator, InterfaceC1481a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f5784a = 0;

    /* renamed from: b, reason: collision with root package name */
    public int f5785b;

    /* renamed from: c, reason: collision with root package name */
    public int f5786c;

    /* renamed from: d, reason: collision with root package name */
    public int f5787d;

    /* renamed from: e, reason: collision with root package name */
    public final AbstractC0460e f5788e;

    public C0483a(C0485c list, int i2) {
        int i3;
        kotlin.jvm.internal.i.e(list, "list");
        this.f5788e = list;
        this.f5785b = i2;
        this.f5786c = -1;
        i3 = ((AbstractList) list).modCount;
        this.f5787d = i3;
    }

    public void a() {
        int i2;
        i2 = ((AbstractList) ((C0484b) this.f5788e).f5793e).modCount;
        if (i2 != this.f5787d) {
            throw new ConcurrentModificationException();
        }
    }

    @Override // java.util.ListIterator
    public final void add(Object obj) {
        int i2;
        int i3;
        switch (this.f5784a) {
            case 0:
                a();
                int i6 = this.f5785b;
                this.f5785b = i6 + 1;
                C0484b c0484b = (C0484b) this.f5788e;
                c0484b.add(i6, obj);
                this.f5786c = -1;
                i2 = ((AbstractList) c0484b).modCount;
                this.f5787d = i2;
                break;
            default:
                c();
                int i7 = this.f5785b;
                this.f5785b = i7 + 1;
                C0485c c0485c = (C0485c) this.f5788e;
                c0485c.add(i7, obj);
                this.f5786c = -1;
                i3 = ((AbstractList) c0485c).modCount;
                this.f5787d = i3;
                break;
        }
    }

    public void c() {
        int i2;
        i2 = ((AbstractList) ((C0485c) this.f5788e)).modCount;
        if (i2 != this.f5787d) {
            throw new ConcurrentModificationException();
        }
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final boolean hasNext() {
        switch (this.f5784a) {
            case 0:
                if (this.f5785b < ((C0484b) this.f5788e).f5791c) {
                }
                break;
            default:
                if (this.f5785b < ((C0485c) this.f5788e).f5796b) {
                }
                break;
        }
        return false;
    }

    @Override // java.util.ListIterator
    public final boolean hasPrevious() {
        switch (this.f5784a) {
            case 0:
                if (this.f5785b > 0) {
                }
                break;
            default:
                if (this.f5785b > 0) {
                }
                break;
        }
        return false;
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final Object next() {
        switch (this.f5784a) {
            case 0:
                a();
                int i2 = this.f5785b;
                C0484b c0484b = (C0484b) this.f5788e;
                if (i2 >= c0484b.f5791c) {
                    throw new NoSuchElementException();
                }
                this.f5785b = i2 + 1;
                this.f5786c = i2;
                return c0484b.f5789a[c0484b.f5790b + i2];
            default:
                c();
                int i3 = this.f5785b;
                C0485c c0485c = (C0485c) this.f5788e;
                if (i3 >= c0485c.f5796b) {
                    throw new NoSuchElementException();
                }
                this.f5785b = i3 + 1;
                this.f5786c = i3;
                return c0485c.f5795a[i3];
        }
    }

    @Override // java.util.ListIterator
    public final int nextIndex() {
        switch (this.f5784a) {
        }
        return this.f5785b;
    }

    @Override // java.util.ListIterator
    public final Object previous() {
        switch (this.f5784a) {
            case 0:
                a();
                int i2 = this.f5785b;
                if (i2 <= 0) {
                    throw new NoSuchElementException();
                }
                int i3 = i2 - 1;
                this.f5785b = i3;
                this.f5786c = i3;
                C0484b c0484b = (C0484b) this.f5788e;
                return c0484b.f5789a[c0484b.f5790b + i3];
            default:
                c();
                int i6 = this.f5785b;
                if (i6 <= 0) {
                    throw new NoSuchElementException();
                }
                int i7 = i6 - 1;
                this.f5785b = i7;
                this.f5786c = i7;
                return ((C0485c) this.f5788e).f5795a[i7];
        }
    }

    @Override // java.util.ListIterator
    public final int previousIndex() {
        switch (this.f5784a) {
        }
        return this.f5785b - 1;
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final void remove() {
        int i2;
        int i3;
        switch (this.f5784a) {
            case 0:
                a();
                int i6 = this.f5786c;
                if (i6 == -1) {
                    throw new IllegalStateException("Call next() or previous() before removing element from the iterator.");
                }
                C0484b c0484b = (C0484b) this.f5788e;
                c0484b.d(i6);
                this.f5785b = this.f5786c;
                this.f5786c = -1;
                i2 = ((AbstractList) c0484b).modCount;
                this.f5787d = i2;
                return;
            default:
                c();
                int i7 = this.f5786c;
                if (i7 == -1) {
                    throw new IllegalStateException("Call next() or previous() before removing element from the iterator.");
                }
                C0485c c0485c = (C0485c) this.f5788e;
                c0485c.d(i7);
                this.f5785b = this.f5786c;
                this.f5786c = -1;
                i3 = ((AbstractList) c0485c).modCount;
                this.f5787d = i3;
                return;
        }
    }

    @Override // java.util.ListIterator
    public final void set(Object obj) {
        switch (this.f5784a) {
            case 0:
                a();
                int i2 = this.f5786c;
                if (i2 == -1) {
                    throw new IllegalStateException("Call next() or previous() before replacing element from the iterator.");
                }
                ((C0484b) this.f5788e).set(i2, obj);
                return;
            default:
                c();
                int i3 = this.f5786c;
                if (i3 == -1) {
                    throw new IllegalStateException("Call next() or previous() before replacing element from the iterator.");
                }
                ((C0485c) this.f5788e).set(i3, obj);
                return;
        }
    }

    public C0483a(C0484b list, int i2) {
        int i3;
        kotlin.jvm.internal.i.e(list, "list");
        this.f5788e = list;
        this.f5785b = i2;
        this.f5786c = -1;
        i3 = ((AbstractList) list).modCount;
        this.f5787d = i3;
    }
}
