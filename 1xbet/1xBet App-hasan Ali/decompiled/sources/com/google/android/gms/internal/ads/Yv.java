package com.google.android.gms.internal.ads;

import java.io.Serializable;
import java.util.AbstractList;
import java.util.Collections;
import java.util.List;
import java.util.RandomAccess;

/* loaded from: classes.dex */
public final class Yv extends AbstractList implements RandomAccess, Serializable {

    /* renamed from: k, reason: collision with root package name */
    public final int[] f12376k;

    /* renamed from: l, reason: collision with root package name */
    public final int f12377l;

    /* renamed from: m, reason: collision with root package name */
    public final int f12378m;

    public Yv(int i, int i5, int[] iArr) {
        this.f12376k = iArr;
        this.f12377l = i;
        this.f12378m = i5;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean contains(Object obj) {
        if (!(obj instanceof Integer)) {
            return false;
        }
        int intValue = ((Integer) obj).intValue();
        int i = this.f12377l;
        while (true) {
            if (i >= this.f12378m) {
                i = -1;
                break;
            }
            if (this.f12376k[i] == intValue) {
                break;
            }
            i++;
        }
        return i != -1;
    }

    @Override // java.util.AbstractList, java.util.Collection, java.util.List
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof Yv)) {
            return super.equals(obj);
        }
        Yv yv = (Yv) obj;
        int i = yv.f12378m;
        int i5 = yv.f12377l;
        int i6 = i - i5;
        int i7 = this.f12378m;
        int i8 = this.f12377l;
        int i9 = i7 - i8;
        if (i6 != i9) {
            return false;
        }
        for (int i10 = 0; i10 < i9; i10++) {
            if (this.f12376k[i8 + i10] != yv.f12376k[i5 + i10]) {
                return false;
            }
        }
        return true;
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* bridge */ /* synthetic */ Object get(int i) {
        int i5 = this.f12378m;
        int i6 = this.f12377l;
        AbstractC1400ot.i(i, i5 - i6);
        return Integer.valueOf(this.f12376k[i6 + i]);
    }

    @Override // java.util.AbstractList, java.util.Collection, java.util.List
    public final int hashCode() {
        int i = 1;
        for (int i5 = this.f12377l; i5 < this.f12378m; i5++) {
            i = (i * 31) + this.f12376k[i5];
        }
        return i;
    }

    @Override // java.util.AbstractList, java.util.List
    public final int indexOf(Object obj) {
        if (obj instanceof Integer) {
            int intValue = ((Integer) obj).intValue();
            int i = this.f12377l;
            int i5 = i;
            while (true) {
                if (i5 >= this.f12378m) {
                    i5 = -1;
                    break;
                }
                if (this.f12376k[i5] == intValue) {
                    break;
                }
                i5++;
            }
            if (i5 >= 0) {
                return i5 - i;
            }
        }
        return -1;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean isEmpty() {
        return false;
    }

    @Override // java.util.AbstractList, java.util.List
    public final int lastIndexOf(Object obj) {
        int i;
        if (obj instanceof Integer) {
            int intValue = ((Integer) obj).intValue();
            int i5 = this.f12378m - 1;
            while (true) {
                i = this.f12377l;
                if (i5 < i) {
                    i5 = -1;
                    break;
                }
                if (this.f12376k[i5] == intValue) {
                    break;
                }
                i5--;
            }
            if (i5 >= 0) {
                return i5 - i;
            }
        }
        return -1;
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* bridge */ /* synthetic */ Object set(int i, Object obj) {
        int i5 = this.f12378m;
        int i6 = this.f12377l;
        Integer num = (Integer) obj;
        AbstractC1400ot.i(i, i5 - i6);
        int i7 = i6 + i;
        int[] iArr = this.f12376k;
        int i8 = iArr[i7];
        num.getClass();
        iArr[i7] = num.intValue();
        return Integer.valueOf(i8);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f12378m - this.f12377l;
    }

    @Override // java.util.AbstractList, java.util.List
    public final List subList(int i, int i5) {
        int i6 = this.f12378m;
        int i7 = this.f12377l;
        AbstractC1400ot.g0(i, i5, i6 - i7);
        if (i == i5) {
            return Collections.EMPTY_LIST;
        }
        return new Yv(i7 + i, i5 + i7, this.f12376k);
    }

    @Override // java.util.AbstractCollection
    public final String toString() {
        int i = this.f12378m;
        int i5 = this.f12377l;
        StringBuilder sb = new StringBuilder((i - i5) * 5);
        sb.append('[');
        int[] iArr = this.f12376k;
        sb.append(iArr[i5]);
        while (true) {
            i5++;
            if (i5 >= i) {
                sb.append(']');
                return sb.toString();
            }
            sb.append(", ");
            sb.append(iArr[i5]);
        }
    }
}
