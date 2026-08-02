package p000;

import java.util.AbstractList;
import java.util.Arrays;
import java.util.Collection;
import java.util.RandomAccess;

/* JADX INFO: compiled from: r8-map-id-738170b7fb69b873ed7524d5270c8e05c6f5fb40ea1ade7a72c8ed7a70699269 */
/* JADX INFO: loaded from: classes.dex */
public final class ap1 extends eo1 implements RandomAccess, fp1, dq1 {

    /* JADX INFO: renamed from: m */
    public static final int[] f588m;

    /* JADX INFO: renamed from: n */
    public static final ap1 f589n;

    /* JADX INFO: renamed from: k */
    public int[] f590k;

    /* JADX INFO: renamed from: l */
    public int f591l;

    static {
        int[] iArr = new int[0];
        f588m = iArr;
        f589n = new ap1(iArr, 0, false);
    }

    public ap1(int[] iArr, int i, boolean z) {
        super(z);
        this.f590k = iArr;
        this.f591l = i;
    }

    @Override // java.util.AbstractList, java.util.List
    public final void add(int i, Object obj) {
        int i2;
        int iIntValue = ((Integer) obj).intValue();
        m1489b();
        if (i < 0 || i > (i2 = this.f591l)) {
            C0270h1.m2193i(go1.m2139a(this.f591l, i, (byte) 13, "Index:", ", Size:"));
            return;
        }
        int i3 = i + 1;
        int[] iArr = this.f590k;
        int length = iArr.length;
        if (i2 < length) {
            System.arraycopy(iArr, i, iArr, i3, i2 - i);
        } else {
            int[] iArr2 = new int[Math.max(((length * 3) / 2) + 1, 10)];
            System.arraycopy(this.f590k, 0, iArr2, 0, i);
            System.arraycopy(this.f590k, i, iArr2, i3, this.f591l - i);
            this.f590k = iArr2;
        }
        this.f590k[i] = iIntValue;
        this.f591l++;
        ((AbstractList) this).modCount++;
    }

    @Override // p000.eo1, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean addAll(Collection collection) {
        m1489b();
        collection.getClass();
        if (!(collection instanceof ap1)) {
            return super.addAll(collection);
        }
        ap1 ap1Var = (ap1) collection;
        int i = ap1Var.f591l;
        if (i == 0) {
            return false;
        }
        int i2 = this.f591l;
        if (Integer.MAX_VALUE - i2 < i) {
            throw new OutOfMemoryError();
        }
        int i3 = i2 + i;
        int[] iArr = this.f590k;
        if (i3 > iArr.length) {
            this.f590k = Arrays.copyOf(iArr, i3);
        }
        System.arraycopy(ap1Var.f590k, 0, this.f590k, this.f591l, ap1Var.f591l);
        this.f591l = i3;
        ((AbstractList) this).modCount++;
        return true;
    }

    @Override // p000.kp1
    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public final ap1 mo460m(int i) {
        if (i >= this.f591l) {
            return new ap1(i == 0 ? f588m : Arrays.copyOf(this.f590k, i), this.f591l, true);
        }
        throw new IllegalArgumentException();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean contains(Object obj) {
        return indexOf(obj) != -1;
    }

    /* JADX INFO: renamed from: d */
    public final int m457d(int i) {
        m459f(i);
        return this.f590k[i];
    }

    /* JADX INFO: renamed from: e */
    public final void m458e(int i) {
        m1489b();
        int i2 = this.f591l;
        int length = this.f590k.length;
        if (i2 == length) {
            int[] iArr = new int[Math.max(((length * 3) / 2) + 1, 10)];
            System.arraycopy(this.f590k, 0, iArr, 0, this.f591l);
            this.f590k = iArr;
        }
        int[] iArr2 = this.f590k;
        int i3 = this.f591l;
        this.f591l = i3 + 1;
        iArr2[i3] = i;
    }

    @Override // p000.eo1, java.util.AbstractList, java.util.Collection, java.util.List
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ap1)) {
            return super.equals(obj);
        }
        ap1 ap1Var = (ap1) obj;
        if (this.f591l != ap1Var.f591l) {
            return false;
        }
        int[] iArr = ap1Var.f590k;
        for (int i = 0; i < this.f591l; i++) {
            if (this.f590k[i] != iArr[i]) {
                return false;
            }
        }
        return true;
    }

    /* JADX INFO: renamed from: f */
    public final void m459f(int i) {
        if (i < 0 || i >= this.f591l) {
            C0270h1.m2193i(go1.m2139a(this.f591l, i, (byte) 13, "Index:", ", Size:"));
        }
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* synthetic */ Object get(int i) {
        m459f(i);
        return Integer.valueOf(this.f590k[i]);
    }

    @Override // java.util.AbstractList, java.util.Collection, java.util.List
    public final int hashCode() {
        int i = 1;
        for (int i2 = 0; i2 < this.f591l; i2++) {
            i = (i * 31) + this.f590k[i2];
        }
        return i;
    }

    @Override // java.util.AbstractList, java.util.List
    public final int indexOf(Object obj) {
        if (!(obj instanceof Integer)) {
            return -1;
        }
        int iIntValue = ((Integer) obj).intValue();
        int i = this.f591l;
        for (int i2 = 0; i2 < i; i2++) {
            if (this.f590k[i2] == iIntValue) {
                return i2;
            }
        }
        return -1;
    }

    @Override // p000.eo1, java.util.AbstractList, java.util.List
    public final /* bridge */ /* synthetic */ Object remove(int i) {
        m1489b();
        m459f(i);
        int[] iArr = this.f590k;
        int i2 = iArr[i];
        int i3 = this.f591l;
        if (i < i3 - 1) {
            System.arraycopy(iArr, i + 1, iArr, i, (i3 - i) - 1);
        }
        this.f591l--;
        ((AbstractList) this).modCount++;
        return Integer.valueOf(i2);
    }

    @Override // java.util.AbstractList
    public final void removeRange(int i, int i2) {
        m1489b();
        if (i2 < i) {
            C0270h1.m2193i("toIndex < fromIndex");
            return;
        }
        int[] iArr = this.f590k;
        System.arraycopy(iArr, i2, iArr, i, this.f591l - i2);
        this.f591l -= i2 - i;
        ((AbstractList) this).modCount++;
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* bridge */ /* synthetic */ Object set(int i, Object obj) {
        int iIntValue = ((Integer) obj).intValue();
        m1489b();
        m459f(i);
        int[] iArr = this.f590k;
        int i2 = iArr[i];
        iArr[i] = iIntValue;
        return Integer.valueOf(i2);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f591l;
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final /* bridge */ /* synthetic */ boolean add(Object obj) {
        m458e(((Integer) obj).intValue());
        return true;
    }
}
