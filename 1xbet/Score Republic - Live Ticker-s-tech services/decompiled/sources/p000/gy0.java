package p000;

import java.util.AbstractList;
import java.util.Arrays;
import java.util.RandomAccess;

/* JADX INFO: compiled from: r8-map-id-738170b7fb69b873ed7524d5270c8e05c6f5fb40ea1ade7a72c8ed7a70699269 */
/* JADX INFO: loaded from: classes.dex */
public final class gy0 extends AbstractC0490n0 implements RandomAccess {

    /* JADX INFO: renamed from: m */
    public static final gy0 f2961m = new gy0(new Object[0], 0, false);

    /* JADX INFO: renamed from: k */
    public Object[] f2962k;

    /* JADX INFO: renamed from: l */
    public int f2963l;

    public gy0(Object[] objArr, int i, boolean z) {
        super(z);
        this.f2962k = objArr;
        this.f2963l = i;
    }

    @Override // java.util.AbstractList, java.util.List
    public final void add(int i, Object obj) {
        int i2;
        m3456b();
        if (i < 0 || i > (i2 = this.f2963l)) {
            dd0.m1159d(i, this.f2963l);
            return;
        }
        Object[] objArr = this.f2962k;
        if (i2 < objArr.length) {
            System.arraycopy(objArr, i, objArr, i + 1, i2 - i);
        } else {
            Object[] objArr2 = new Object[((i2 * 3) / 2) + 1];
            System.arraycopy(objArr, 0, objArr2, 0, i);
            System.arraycopy(this.f2962k, i, objArr2, i + 1, this.f2963l - i);
            this.f2962k = objArr2;
        }
        this.f2962k[i] = obj;
        this.f2963l++;
        ((AbstractList) this).modCount++;
    }

    /* JADX INFO: renamed from: c */
    public final void m2167c(int i) {
        if (i < 0 || i >= this.f2963l) {
            dd0.m1159d(i, this.f2963l);
        }
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object get(int i) {
        m2167c(i);
        return this.f2962k[i];
    }

    @Override // p000.de0
    /* JADX INFO: renamed from: i */
    public final de0 mo1171i(int i) {
        if (i >= this.f2963l) {
            return new gy0(Arrays.copyOf(this.f2962k, i), this.f2963l, true);
        }
        throw new IllegalArgumentException();
    }

    @Override // p000.AbstractC0490n0, java.util.AbstractList, java.util.List
    public final Object remove(int i) {
        m3456b();
        m2167c(i);
        Object[] objArr = this.f2962k;
        Object obj = objArr[i];
        int i2 = this.f2963l;
        if (i < i2 - 1) {
            System.arraycopy(objArr, i + 1, objArr, i, (i2 - i) - 1);
        }
        this.f2963l--;
        ((AbstractList) this).modCount++;
        return obj;
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object set(int i, Object obj) {
        m3456b();
        m2167c(i);
        Object[] objArr = this.f2962k;
        Object obj2 = objArr[i];
        objArr[i] = obj;
        ((AbstractList) this).modCount++;
        return obj2;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f2963l;
    }

    @Override // p000.AbstractC0490n0, java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean add(Object obj) {
        m3456b();
        int i = this.f2963l;
        Object[] objArr = this.f2962k;
        if (i == objArr.length) {
            this.f2962k = Arrays.copyOf(objArr, ((i * 3) / 2) + 1);
        }
        Object[] objArr2 = this.f2962k;
        int i2 = this.f2963l;
        this.f2963l = i2 + 1;
        objArr2[i2] = obj;
        ((AbstractList) this).modCount++;
        return true;
    }
}
