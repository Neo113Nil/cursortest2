package com.google.common.collect;

import java.io.IOException;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.AbstractSet;
import java.util.Arrays;
import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.NoSuchElementException;
import java.util.Objects;
import java.util.Set;

/* renamed from: com.google.common.collect.s, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C0970s<E> extends AbstractSet<E> implements Serializable {
    public transient Object a;
    public transient int[] b;
    public transient Object[] c;
    public transient int d;
    public transient int e;

    /* renamed from: com.google.common.collect.s$a */
    public class a implements Iterator<E> {
        public int a;
        public int b;
        public int c;

        public a() {
            this.a = C0970s.this.d;
            this.b = C0970s.this.isEmpty() ? -1 : 0;
            this.c = -1;
        }

        @Override // java.util.Iterator
        public final boolean hasNext() {
            return this.b >= 0;
        }

        @Override // java.util.Iterator
        public final E next() {
            C0970s c0970s = C0970s.this;
            if (c0970s.d != this.a) {
                throw new ConcurrentModificationException();
            }
            if (!hasNext()) {
                throw new NoSuchElementException();
            }
            int i = this.b;
            this.c = i;
            E e = (E) c0970s.d()[i];
            int i2 = this.b + 1;
            if (i2 >= c0970s.e) {
                i2 = -1;
            }
            this.b = i2;
            return e;
        }

        @Override // java.util.Iterator
        public final void remove() {
            C0970s c0970s = C0970s.this;
            if (c0970s.d != this.a) {
                throw new ConcurrentModificationException();
            }
            com.google.common.base.k.i(this.c >= 0, "no calls to next() since the last call to remove()");
            this.a += 32;
            c0970s.remove(c0970s.d()[this.c]);
            this.b--;
            this.c = -1;
        }
    }

    public static <E> C0970s<E> a(int i) {
        C0970s<E> c0970s = new C0970s<>();
        com.google.common.base.k.d(i >= 0, "Expected size must be >= 0");
        c0970s.d = com.google.common.primitives.c.c(i, 1);
        return c0970s;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private void readObject(ObjectInputStream objectInputStream) throws IOException, ClassNotFoundException {
        objectInputStream.defaultReadObject();
        int readInt = objectInputStream.readInt();
        if (readInt < 0) {
            throw new InvalidObjectException(android.support.v4.media.a.a(readInt, "Invalid size: "));
        }
        com.google.common.base.k.d(readInt >= 0, "Expected size must be >= 0");
        this.d = com.google.common.primitives.c.c(readInt, 1);
        for (int i = 0; i < readInt; i++) {
            add(objectInputStream.readObject());
        }
    }

    private void writeObject(ObjectOutputStream objectOutputStream) throws IOException {
        objectOutputStream.defaultWriteObject();
        objectOutputStream.writeInt(size());
        Iterator<E> it = iterator();
        while (it.hasNext()) {
            objectOutputStream.writeObject(it.next());
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean add(E e) {
        int min;
        char c = 31;
        if (c()) {
            com.google.common.base.k.i(c(), "Arrays already allocated");
            int i = this.d;
            int h = C0971t.h(i);
            this.a = C0971t.b(h);
            this.d = C0971t.c(this.d, 32 - Integer.numberOfLeadingZeros(h - 1), 31);
            this.b = new int[i];
            this.c = new Object[i];
        }
        Set<E> b = b();
        if (b != null) {
            return b.add(e);
        }
        int[] e2 = e();
        Object[] d = d();
        int i2 = this.e;
        int i3 = i2 + 1;
        int b2 = C.b(e);
        int i4 = (1 << (this.d & 31)) - 1;
        int i5 = b2 & i4;
        Object obj = this.a;
        Objects.requireNonNull(obj);
        int f = C0971t.f(i5, obj);
        if (f != 0) {
            int i6 = ~i4;
            int i7 = b2 & i6;
            int i8 = 0;
            while (true) {
                int i9 = f - 1;
                int i10 = e2[i9];
                char c2 = c;
                if ((i10 & i6) == i7 && com.google.common.base.i.a(e, d[i9])) {
                    return false;
                }
                int i11 = i10 & i4;
                i8++;
                if (i11 != 0) {
                    f = i11;
                    c = c2;
                } else {
                    if (i8 >= 9) {
                        LinkedHashSet linkedHashSet = new LinkedHashSet(1 << (this.d & 31), 1.0f);
                        int i12 = isEmpty() ? -1 : 0;
                        while (i12 >= 0) {
                            linkedHashSet.add(d()[i12]);
                            i12++;
                            if (i12 >= this.e) {
                                i12 = -1;
                            }
                        }
                        this.a = linkedHashSet;
                        this.b = null;
                        this.c = null;
                        this.d += 32;
                        return linkedHashSet.add(e);
                    }
                    if (i3 > i4) {
                        i4 = f(i4, C0971t.d(i4), b2, i2);
                    } else {
                        e2[i9] = C0971t.c(i10, i3, i4);
                    }
                }
            }
        } else if (i3 > i4) {
            i4 = f(i4, C0971t.d(i4), b2, i2);
        } else {
            Object obj2 = this.a;
            Objects.requireNonNull(obj2);
            C0971t.g(obj2, i5, i3);
        }
        int length = e().length;
        if (i3 > length && (min = Math.min(1073741823, (Math.max(1, length >>> 1) + length) | 1)) != length) {
            this.b = Arrays.copyOf(e(), min);
            this.c = Arrays.copyOf(d(), min);
        }
        e()[i2] = C0971t.c(b2, 0, i4);
        d()[i2] = e;
        this.e = i3;
        this.d += 32;
        return true;
    }

    public final Set<E> b() {
        Object obj = this.a;
        if (obj instanceof Set) {
            return (Set) obj;
        }
        return null;
    }

    public final boolean c() {
        return this.a == null;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final void clear() {
        if (c()) {
            return;
        }
        this.d += 32;
        Set<E> b = b();
        if (b != null) {
            this.d = com.google.common.primitives.c.c(size(), 3);
            b.clear();
            this.a = null;
            this.e = 0;
            return;
        }
        Arrays.fill(d(), 0, this.e, (Object) null);
        Object obj = this.a;
        Objects.requireNonNull(obj);
        if (obj instanceof byte[]) {
            Arrays.fill((byte[]) obj, (byte) 0);
        } else if (obj instanceof short[]) {
            Arrays.fill((short[]) obj, (short) 0);
        } else {
            Arrays.fill((int[]) obj, 0);
        }
        Arrays.fill(e(), 0, this.e, 0);
        this.e = 0;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean contains(Object obj) {
        if (c()) {
            return false;
        }
        Set<E> b = b();
        if (b != null) {
            return b.contains(obj);
        }
        int b2 = C.b(obj);
        int i = (1 << (this.d & 31)) - 1;
        Object obj2 = this.a;
        Objects.requireNonNull(obj2);
        int f = C0971t.f(b2 & i, obj2);
        if (f == 0) {
            return false;
        }
        int i2 = ~i;
        int i3 = b2 & i2;
        do {
            int i4 = f - 1;
            int i5 = e()[i4];
            if ((i5 & i2) == i3 && com.google.common.base.i.a(obj, d()[i4])) {
                return true;
            }
            f = i5 & i;
        } while (f != 0);
        return false;
    }

    public final Object[] d() {
        Object[] objArr = this.c;
        Objects.requireNonNull(objArr);
        return objArr;
    }

    public final int[] e() {
        int[] iArr = this.b;
        Objects.requireNonNull(iArr);
        return iArr;
    }

    public final int f(int i, int i2, int i3, int i4) {
        Object b = C0971t.b(i2);
        int i5 = i2 - 1;
        if (i4 != 0) {
            C0971t.g(b, i3 & i5, i4 + 1);
        }
        Object obj = this.a;
        Objects.requireNonNull(obj);
        int[] e = e();
        for (int i6 = 0; i6 <= i; i6++) {
            int f = C0971t.f(i6, obj);
            while (f != 0) {
                int i7 = f - 1;
                int i8 = e[i7];
                int i9 = ((~i) & i8) | i6;
                int i10 = i9 & i5;
                int f2 = C0971t.f(i10, b);
                C0971t.g(b, i10, f);
                e[i7] = C0971t.c(i9, f2, i5);
                f = i8 & i;
            }
        }
        this.a = b;
        this.d = C0971t.c(this.d, 32 - Integer.numberOfLeadingZeros(i5), 31);
        return i5;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean isEmpty() {
        return size() == 0;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final Iterator<E> iterator() {
        Set<E> b = b();
        return b != null ? b.iterator() : new a();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean remove(Object obj) {
        int i;
        int i2;
        if (!c()) {
            Set<E> b = b();
            if (b != null) {
                return b.remove(obj);
            }
            int i3 = (1 << (this.d & 31)) - 1;
            Object obj2 = this.a;
            Objects.requireNonNull(obj2);
            int e = C0971t.e(obj, null, i3, obj2, e(), d(), null);
            if (e != -1) {
                Object obj3 = this.a;
                Objects.requireNonNull(obj3);
                int[] e2 = e();
                Object[] d = d();
                int size = size();
                int i4 = size - 1;
                if (e < i4) {
                    Object obj4 = d[i4];
                    d[e] = obj4;
                    d[i4] = null;
                    e2[e] = e2[i4];
                    e2[i4] = 0;
                    int b2 = C.b(obj4) & i3;
                    int f = C0971t.f(b2, obj3);
                    if (f == size) {
                        C0971t.g(obj3, b2, e + 1);
                    } else {
                        while (true) {
                            i = f - 1;
                            i2 = e2[i];
                            int i5 = i2 & i3;
                            if (i5 == size) {
                                break;
                            }
                            f = i5;
                        }
                        e2[i] = C0971t.c(i2, e + 1, i3);
                    }
                } else {
                    d[e] = null;
                    e2[e] = 0;
                }
                this.e--;
                this.d += 32;
                return true;
            }
        }
        return false;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        Set<E> b = b();
        return b != null ? b.size() : this.e;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final Object[] toArray() {
        if (c()) {
            return new Object[0];
        }
        Set<E> b = b();
        return b != null ? b.toArray() : Arrays.copyOf(d(), this.e);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final <T> T[] toArray(T[] tArr) {
        if (c()) {
            if (tArr.length > 0) {
                tArr[0] = null;
            }
            return tArr;
        }
        Set<E> b = b();
        if (b != null) {
            return (T[]) b.toArray(tArr);
        }
        Object[] d = d();
        int i = this.e;
        com.google.common.base.k.h(0, i, d.length);
        if (tArr.length < i) {
            if (tArr.length != 0) {
                tArr = (T[]) Arrays.copyOf(tArr, 0);
            }
            tArr = (T[]) Arrays.copyOf(tArr, i);
        } else if (tArr.length > i) {
            tArr[i] = null;
        }
        System.arraycopy(d, 0, tArr, 0, i);
        return tArr;
    }
}
