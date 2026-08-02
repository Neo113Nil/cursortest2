package p000;

import java.util.AbstractList;
import java.util.Arrays;
import java.util.Collection;
import java.util.RandomAccess;

/* JADX INFO: compiled from: r8-map-id-738170b7fb69b873ed7524d5270c8e05c6f5fb40ea1ade7a72c8ed7a70699269 */
/* JADX INFO: loaded from: classes.dex */
public final class pp1 extends eo1 implements RandomAccess, jp1, dq1 {

    /* JADX INFO: renamed from: m */
    public static final long[] f6229m;

    /* JADX INFO: renamed from: n */
    public static final pp1 f6230n;

    /* JADX INFO: renamed from: k */
    public long[] f6231k;

    /* JADX INFO: renamed from: l */
    public int f6232l;

    static {
        long[] jArr = new long[0];
        f6229m = jArr;
        f6230n = new pp1(jArr, 0, false);
    }

    public pp1(long[] jArr, int i, boolean z) {
        super(z);
        this.f6231k = jArr;
        this.f6232l = i;
    }

    @Override // java.util.AbstractList, java.util.List
    public final void add(int i, Object obj) {
        int i2;
        long jLongValue = ((Long) obj).longValue();
        m1489b();
        if (i < 0 || i > (i2 = this.f6232l)) {
            C0270h1.m2193i(go1.m2139a(this.f6232l, i, (byte) 13, "Index:", ", Size:"));
            return;
        }
        int i3 = i + 1;
        long[] jArr = this.f6231k;
        int length = jArr.length;
        if (i2 < length) {
            System.arraycopy(jArr, i, jArr, i3, i2 - i);
        } else {
            long[] jArr2 = new long[Math.max(((length * 3) / 2) + 1, 10)];
            System.arraycopy(this.f6231k, 0, jArr2, 0, i);
            System.arraycopy(this.f6231k, i, jArr2, i3, this.f6232l - i);
            this.f6231k = jArr2;
        }
        this.f6231k[i] = jLongValue;
        this.f6232l++;
        ((AbstractList) this).modCount++;
    }

    @Override // p000.eo1, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean addAll(Collection collection) {
        m1489b();
        collection.getClass();
        if (!(collection instanceof pp1)) {
            return super.addAll(collection);
        }
        pp1 pp1Var = (pp1) collection;
        int i = pp1Var.f6232l;
        if (i == 0) {
            return false;
        }
        int i2 = this.f6232l;
        if (Integer.MAX_VALUE - i2 < i) {
            throw new OutOfMemoryError();
        }
        int i3 = i2 + i;
        long[] jArr = this.f6231k;
        if (i3 > jArr.length) {
            this.f6231k = Arrays.copyOf(jArr, i3);
        }
        System.arraycopy(pp1Var.f6231k, 0, this.f6231k, this.f6232l, pp1Var.f6232l);
        this.f6232l = i3;
        ((AbstractList) this).modCount++;
        return true;
    }

    /* JADX INFO: renamed from: c */
    public final long m3972c(int i) {
        m3975f(i);
        return this.f6231k[i];
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean contains(Object obj) {
        return indexOf(obj) != -1;
    }

    @Override // p000.kp1
    /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
    public final pp1 mo460m(int i) {
        if (i >= this.f6232l) {
            return new pp1(i == 0 ? f6229m : Arrays.copyOf(this.f6231k, i), this.f6232l, true);
        }
        throw new IllegalArgumentException();
    }

    /* JADX INFO: renamed from: e */
    public final void m3974e(long j) {
        m1489b();
        int i = this.f6232l;
        int length = this.f6231k.length;
        if (i == length) {
            long[] jArr = new long[Math.max(((length * 3) / 2) + 1, 10)];
            System.arraycopy(this.f6231k, 0, jArr, 0, this.f6232l);
            this.f6231k = jArr;
        }
        long[] jArr2 = this.f6231k;
        int i2 = this.f6232l;
        this.f6232l = i2 + 1;
        jArr2[i2] = j;
    }

    @Override // p000.eo1, java.util.AbstractList, java.util.Collection, java.util.List
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof pp1)) {
            return super.equals(obj);
        }
        pp1 pp1Var = (pp1) obj;
        if (this.f6232l != pp1Var.f6232l) {
            return false;
        }
        long[] jArr = pp1Var.f6231k;
        for (int i = 0; i < this.f6232l; i++) {
            if (this.f6231k[i] != jArr[i]) {
                return false;
            }
        }
        return true;
    }

    /* JADX INFO: renamed from: f */
    public final void m3975f(int i) {
        if (i < 0 || i >= this.f6232l) {
            C0270h1.m2193i(go1.m2139a(this.f6232l, i, (byte) 13, "Index:", ", Size:"));
        }
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* synthetic */ Object get(int i) {
        m3975f(i);
        return Long.valueOf(this.f6231k[i]);
    }

    @Override // java.util.AbstractList, java.util.Collection, java.util.List
    public final int hashCode() {
        int i = 1;
        for (int i2 = 0; i2 < this.f6232l; i2++) {
            long j = this.f6231k[i2];
            byte[] bArr = ip1.f3634a;
            i = (i * 31) + ((int) (j ^ (j >>> 32)));
        }
        return i;
    }

    @Override // java.util.AbstractList, java.util.List
    public final int indexOf(Object obj) {
        if (!(obj instanceof Long)) {
            return -1;
        }
        long jLongValue = ((Long) obj).longValue();
        int i = this.f6232l;
        for (int i2 = 0; i2 < i; i2++) {
            if (this.f6231k[i2] == jLongValue) {
                return i2;
            }
        }
        return -1;
    }

    @Override // p000.eo1, java.util.AbstractList, java.util.List
    public final /* bridge */ /* synthetic */ Object remove(int i) {
        m1489b();
        m3975f(i);
        long[] jArr = this.f6231k;
        long j = jArr[i];
        int i2 = this.f6232l;
        if (i < i2 - 1) {
            System.arraycopy(jArr, i + 1, jArr, i, (i2 - i) - 1);
        }
        this.f6232l--;
        ((AbstractList) this).modCount++;
        return Long.valueOf(j);
    }

    @Override // java.util.AbstractList
    public final void removeRange(int i, int i2) {
        m1489b();
        if (i2 < i) {
            C0270h1.m2193i("toIndex < fromIndex");
            return;
        }
        long[] jArr = this.f6231k;
        System.arraycopy(jArr, i2, jArr, i, this.f6232l - i2);
        this.f6232l -= i2 - i;
        ((AbstractList) this).modCount++;
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* bridge */ /* synthetic */ Object set(int i, Object obj) {
        long jLongValue = ((Long) obj).longValue();
        m1489b();
        m3975f(i);
        long[] jArr = this.f6231k;
        long j = jArr[i];
        jArr[i] = jLongValue;
        return Long.valueOf(j);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f6232l;
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final /* bridge */ /* synthetic */ boolean add(Object obj) {
        m3974e(((Long) obj).longValue());
        return true;
    }
}
