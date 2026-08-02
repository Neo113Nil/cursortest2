package p000;

import java.util.AbstractList;
import java.util.Arrays;
import java.util.List;
import java.util.RandomAccess;

/* JADX INFO: compiled from: r8-map-id-738170b7fb69b873ed7524d5270c8e05c6f5fb40ea1ade7a72c8ed7a70699269 */
/* JADX INFO: loaded from: classes.dex */
public final class fq1 extends eo1 implements RandomAccess {

    /* JADX INFO: renamed from: m */
    public static final Object[] f2475m;

    /* JADX INFO: renamed from: n */
    public static final fq1 f2476n;

    /* JADX INFO: renamed from: k */
    public Object[] f2477k;

    /* JADX INFO: renamed from: l */
    public int f2478l;

    static {
        Object[] objArr = new Object[0];
        f2475m = objArr;
        f2476n = new fq1(objArr, 0, false);
    }

    public fq1(Object[] objArr, int i, boolean z) {
        super(z);
        this.f2477k = objArr;
        this.f2478l = i;
    }

    @Override // java.util.AbstractList, java.util.List
    public final void add(int i, Object obj) {
        int i2;
        m1489b();
        if (i < 0 || i > (i2 = this.f2478l)) {
            C0270h1.m2193i(go1.m2139a(this.f2478l, i, (byte) 13, "Index:", ", Size:"));
            return;
        }
        int i3 = i + 1;
        Object[] objArr = this.f2477k;
        int length = objArr.length;
        if (i2 < length) {
            System.arraycopy(objArr, i, objArr, i3, i2 - i);
        } else {
            Object[] objArr2 = new Object[Math.max(((length * 3) / 2) + 1, 10)];
            System.arraycopy(this.f2477k, 0, objArr2, 0, i);
            System.arraycopy(this.f2477k, i, objArr2, i3, this.f2478l - i);
            this.f2477k = objArr2;
        }
        this.f2477k[i] = obj;
        this.f2478l++;
        ((AbstractList) this).modCount++;
    }

    /* JADX INFO: renamed from: c */
    public final void m1885c(int i) {
        if (i < 0 || i >= this.f2478l) {
            C0270h1.m2193i(go1.m2139a(this.f2478l, i, (byte) 13, "Index:", ", Size:"));
        }
    }

    @Override // p000.eo1, java.util.AbstractList, java.util.Collection, java.util.List
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof List)) {
            return false;
        }
        if (!(obj instanceof RandomAccess)) {
            return super.equals(obj);
        }
        List list = (List) obj;
        int i = this.f2478l;
        if (i != list.size()) {
            return false;
        }
        if (!(obj instanceof fq1)) {
            for (int i2 = 0; i2 < i; i2++) {
                if (!this.f2477k[i2].equals(list.get(i2))) {
                    return false;
                }
            }
            return true;
        }
        fq1 fq1Var = (fq1) obj;
        for (int i3 = 0; i3 < i; i3++) {
            if (!this.f2477k[i3].equals(fq1Var.f2477k[i3])) {
                return false;
            }
        }
        return true;
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object get(int i) {
        m1885c(i);
        return this.f2477k[i];
    }

    @Override // java.util.AbstractList, java.util.Collection, java.util.List
    public final int hashCode() {
        int i = this.f2478l;
        int iHashCode = 1;
        for (int i2 = 0; i2 < i; i2++) {
            iHashCode = (iHashCode * 31) + this.f2477k[i2].hashCode();
        }
        return iHashCode;
    }

    @Override // p000.kp1
    /* JADX INFO: renamed from: m */
    public final /* bridge */ /* synthetic */ kp1 mo460m(int i) {
        if (i >= this.f2478l) {
            return new fq1(i == 0 ? f2475m : Arrays.copyOf(this.f2477k, i), this.f2478l, true);
        }
        throw new IllegalArgumentException();
    }

    @Override // p000.eo1, java.util.AbstractList, java.util.List
    public final Object remove(int i) {
        m1489b();
        m1885c(i);
        Object[] objArr = this.f2477k;
        Object obj = objArr[i];
        int i2 = this.f2478l;
        if (i < i2 - 1) {
            System.arraycopy(objArr, i + 1, objArr, i, (i2 - i) - 1);
        }
        this.f2478l--;
        ((AbstractList) this).modCount++;
        return obj;
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object set(int i, Object obj) {
        m1489b();
        m1885c(i);
        Object[] objArr = this.f2477k;
        Object obj2 = objArr[i];
        objArr[i] = obj;
        ((AbstractList) this).modCount++;
        return obj2;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f2478l;
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean add(Object obj) {
        m1489b();
        int i = this.f2478l;
        int length = this.f2477k.length;
        if (i == length) {
            this.f2477k = Arrays.copyOf(this.f2477k, Math.max(((length * 3) / 2) + 1, 10));
        }
        Object[] objArr = this.f2477k;
        int i2 = this.f2478l;
        this.f2478l = i2 + 1;
        objArr[i2] = obj;
        ((AbstractList) this).modCount++;
        return true;
    }
}
