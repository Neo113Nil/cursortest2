package androidx.datastore.preferences.protobuf;

import androidx.datastore.preferences.protobuf.C5378y;
import java.util.AbstractList;
import java.util.Arrays;
import java.util.Collection;
import java.util.RandomAccess;

/* loaded from: classes8.dex */
final class H extends AbstractC5357c<Long> implements RandomAccess, a0 {

    /* renamed from: b, reason: collision with root package name */
    private long[] f42462b;

    /* renamed from: c, reason: collision with root package name */
    private int f42463c;

    static {
        new H(new long[0], 0, false);
    }

    H() {
        this(new long[10], 0, true);
    }

    private void b(int i11) {
        if (i11 < 0 || i11 >= this.f42463c) {
            StringBuilder f7 = P4.f.f(i11, "Index:", ", Size:");
            f7.append(this.f42463c);
            throw new IndexOutOfBoundsException(f7.toString());
        }
    }

    @Override // java.util.AbstractList, java.util.List
    public final void add(int i11, Object obj) {
        int i12;
        long longValue = ((Long) obj).longValue();
        a();
        if (i11 < 0 || i11 > (i12 = this.f42463c)) {
            StringBuilder f7 = P4.f.f(i11, "Index:", ", Size:");
            f7.append(this.f42463c);
            throw new IndexOutOfBoundsException(f7.toString());
        }
        long[] jArr = this.f42462b;
        if (i12 < jArr.length) {
            System.arraycopy(jArr, i11, jArr, i11 + 1, i12 - i11);
        } else {
            long[] jArr2 = new long[U7.i.a(i12, 3, 2, 1)];
            System.arraycopy(jArr, 0, jArr2, 0, i11);
            System.arraycopy(this.f42462b, i11, jArr2, i11 + 1, this.f42463c - i11);
            this.f42462b = jArr2;
        }
        this.f42462b[i11] = longValue;
        this.f42463c++;
        ((AbstractList) this).modCount++;
    }

    @Override // androidx.datastore.preferences.protobuf.AbstractC5357c, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean addAll(Collection<? extends Long> collection) {
        a();
        byte[] bArr = C5378y.f42629b;
        collection.getClass();
        if (!(collection instanceof H)) {
            return super.addAll(collection);
        }
        H h11 = (H) collection;
        int i11 = h11.f42463c;
        if (i11 == 0) {
            return false;
        }
        int i12 = this.f42463c;
        if (Integer.MAX_VALUE - i12 < i11) {
            throw new OutOfMemoryError();
        }
        int i13 = i12 + i11;
        long[] jArr = this.f42462b;
        if (i13 > jArr.length) {
            this.f42462b = Arrays.copyOf(jArr, i13);
        }
        System.arraycopy(h11.f42462b, 0, this.f42462b, this.f42463c, h11.f42463c);
        this.f42463c = i13;
        ((AbstractList) this).modCount++;
        return true;
    }

    public final void addLong(long j11) {
        a();
        int i11 = this.f42463c;
        long[] jArr = this.f42462b;
        if (i11 == jArr.length) {
            long[] jArr2 = new long[U7.i.a(i11, 3, 2, 1)];
            System.arraycopy(jArr, 0, jArr2, 0, i11);
            this.f42462b = jArr2;
        }
        long[] jArr3 = this.f42462b;
        int i12 = this.f42463c;
        this.f42463c = i12 + 1;
        jArr3[i12] = j11;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean contains(Object obj) {
        return indexOf(obj) != -1;
    }

    @Override // androidx.datastore.preferences.protobuf.AbstractC5357c, java.util.AbstractList, java.util.Collection, java.util.List
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof H)) {
            return super.equals(obj);
        }
        H h11 = (H) obj;
        if (this.f42463c != h11.f42463c) {
            return false;
        }
        long[] jArr = h11.f42462b;
        for (int i11 = 0; i11 < this.f42463c; i11++) {
            if (this.f42462b[i11] != jArr[i11]) {
                return false;
            }
        }
        return true;
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object get(int i11) {
        return Long.valueOf(getLong(i11));
    }

    public final long getLong(int i11) {
        b(i11);
        return this.f42462b[i11];
    }

    @Override // androidx.datastore.preferences.protobuf.AbstractC5357c, java.util.AbstractList, java.util.Collection, java.util.List
    public final int hashCode() {
        int i11 = 1;
        for (int i12 = 0; i12 < this.f42463c; i12++) {
            i11 = (i11 * 31) + C5378y.b(this.f42462b[i12]);
        }
        return i11;
    }

    @Override // java.util.AbstractList, java.util.List
    public final int indexOf(Object obj) {
        if (!(obj instanceof Long)) {
            return -1;
        }
        long longValue = ((Long) obj).longValue();
        int i11 = this.f42463c;
        for (int i12 = 0; i12 < i11; i12++) {
            if (this.f42462b[i12] == longValue) {
                return i12;
            }
        }
        return -1;
    }

    @Override // androidx.datastore.preferences.protobuf.C5378y.c
    public final C5378y.c mutableCopyWithCapacity(int i11) {
        if (i11 >= this.f42463c) {
            return new H(Arrays.copyOf(this.f42462b, i11), this.f42463c, true);
        }
        throw new IllegalArgumentException();
    }

    @Override // androidx.datastore.preferences.protobuf.AbstractC5357c, java.util.AbstractList, java.util.List
    public final Object remove(int i11) {
        a();
        b(i11);
        long[] jArr = this.f42462b;
        long j11 = jArr[i11];
        if (i11 < this.f42463c - 1) {
            System.arraycopy(jArr, i11 + 1, jArr, i11, (r3 - i11) - 1);
        }
        this.f42463c--;
        ((AbstractList) this).modCount++;
        return Long.valueOf(j11);
    }

    @Override // java.util.AbstractList
    protected final void removeRange(int i11, int i12) {
        a();
        if (i12 < i11) {
            throw new IndexOutOfBoundsException("toIndex < fromIndex");
        }
        long[] jArr = this.f42462b;
        System.arraycopy(jArr, i12, jArr, i11, this.f42463c - i12);
        this.f42463c -= i12 - i11;
        ((AbstractList) this).modCount++;
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object set(int i11, Object obj) {
        long longValue = ((Long) obj).longValue();
        a();
        b(i11);
        long[] jArr = this.f42462b;
        long j11 = jArr[i11];
        jArr[i11] = longValue;
        return Long.valueOf(j11);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f42463c;
    }

    private H(long[] jArr, int i11, boolean z11) {
        super(z11);
        this.f42462b = jArr;
        this.f42463c = i11;
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean add(Object obj) {
        addLong(((Long) obj).longValue());
        return true;
    }
}
