package com.google.android.gms.internal.measurement;

import W5.AbstractC0486a1;
import com.google.android.gms.common.api.f;
import java.util.AbstractList;
import java.util.Arrays;
import java.util.Collection;
import java.util.RandomAccess;

/* loaded from: classes.dex */
final class zzjl extends zzim implements RandomAccess, zzkj, zzlq {
    private static final zzjl zza;
    private double[] zzb;
    private int zzc;

    static {
        zzjl zzjlVar = new zzjl(new double[0], 0);
        zza = zzjlVar;
        zzjlVar.zzb();
    }

    public zzjl() {
        this(new double[10], 0);
    }

    private final String zzf(int i7) {
        return AbstractC0486a1.e(i7, this.zzc, "Index:", ", Size:");
    }

    private final void zzg(int i7) {
        if (i7 < 0 || i7 >= this.zzc) {
            throw new IndexOutOfBoundsException(zzf(i7));
        }
    }

    @Override // com.google.android.gms.internal.measurement.zzim, java.util.AbstractList, java.util.List
    public final /* synthetic */ void add(int i7, Object obj) {
        int i8;
        double doubleValue = ((Double) obj).doubleValue();
        zzbS();
        if (i7 < 0 || i7 > (i8 = this.zzc)) {
            throw new IndexOutOfBoundsException(zzf(i7));
        }
        double[] dArr = this.zzb;
        if (i8 < dArr.length) {
            System.arraycopy(dArr, i7, dArr, i7 + 1, i8 - i7);
        } else {
            double[] dArr2 = new double[AbstractC0486a1.q(i8, 3, 2, 1)];
            System.arraycopy(dArr, 0, dArr2, 0, i7);
            System.arraycopy(this.zzb, i7, dArr2, i7 + 1, this.zzc - i7);
            this.zzb = dArr2;
        }
        this.zzb[i7] = doubleValue;
        this.zzc++;
        ((AbstractList) this).modCount++;
    }

    @Override // com.google.android.gms.internal.measurement.zzim, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean addAll(Collection collection) {
        zzbS();
        zzkk.zze(collection);
        if (!(collection instanceof zzjl)) {
            return super.addAll(collection);
        }
        zzjl zzjlVar = (zzjl) collection;
        int i7 = zzjlVar.zzc;
        if (i7 == 0) {
            return false;
        }
        int i8 = this.zzc;
        if (f.API_PRIORITY_OTHER - i8 < i7) {
            throw new OutOfMemoryError();
        }
        int i9 = i8 + i7;
        double[] dArr = this.zzb;
        if (i9 > dArr.length) {
            this.zzb = Arrays.copyOf(dArr, i9);
        }
        System.arraycopy(zzjlVar.zzb, 0, this.zzb, this.zzc, zzjlVar.zzc);
        this.zzc = i9;
        ((AbstractList) this).modCount++;
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean contains(Object obj) {
        return indexOf(obj) != -1;
    }

    @Override // com.google.android.gms.internal.measurement.zzim, java.util.AbstractList, java.util.Collection, java.util.List
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zzjl)) {
            return super.equals(obj);
        }
        zzjl zzjlVar = (zzjl) obj;
        if (this.zzc != zzjlVar.zzc) {
            return false;
        }
        double[] dArr = zzjlVar.zzb;
        for (int i7 = 0; i7 < this.zzc; i7++) {
            if (Double.doubleToLongBits(this.zzb[i7]) != Double.doubleToLongBits(dArr[i7])) {
                return false;
            }
        }
        return true;
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* synthetic */ Object get(int i7) {
        zzg(i7);
        return Double.valueOf(this.zzb[i7]);
    }

    @Override // com.google.android.gms.internal.measurement.zzim, java.util.AbstractList, java.util.Collection, java.util.List
    public final int hashCode() {
        int i7 = 1;
        for (int i8 = 0; i8 < this.zzc; i8++) {
            i7 = (i7 * 31) + zzkk.zzc(Double.doubleToLongBits(this.zzb[i8]));
        }
        return i7;
    }

    @Override // java.util.AbstractList, java.util.List
    public final int indexOf(Object obj) {
        if (!(obj instanceof Double)) {
            return -1;
        }
        double doubleValue = ((Double) obj).doubleValue();
        int i7 = this.zzc;
        for (int i8 = 0; i8 < i7; i8++) {
            if (this.zzb[i8] == doubleValue) {
                return i8;
            }
        }
        return -1;
    }

    @Override // com.google.android.gms.internal.measurement.zzim, java.util.AbstractList, java.util.List
    public final /* bridge */ /* synthetic */ Object remove(int i7) {
        zzbS();
        zzg(i7);
        double[] dArr = this.zzb;
        double d7 = dArr[i7];
        if (i7 < this.zzc - 1) {
            System.arraycopy(dArr, i7 + 1, dArr, i7, (r3 - i7) - 1);
        }
        this.zzc--;
        ((AbstractList) this).modCount++;
        return Double.valueOf(d7);
    }

    @Override // java.util.AbstractList
    public final void removeRange(int i7, int i8) {
        zzbS();
        if (i8 < i7) {
            throw new IndexOutOfBoundsException("toIndex < fromIndex");
        }
        double[] dArr = this.zzb;
        System.arraycopy(dArr, i8, dArr, i7, this.zzc - i8);
        this.zzc -= i8 - i7;
        ((AbstractList) this).modCount++;
    }

    @Override // com.google.android.gms.internal.measurement.zzim, java.util.AbstractList, java.util.List
    public final /* bridge */ /* synthetic */ Object set(int i7, Object obj) {
        double doubleValue = ((Double) obj).doubleValue();
        zzbS();
        zzg(i7);
        double[] dArr = this.zzb;
        double d7 = dArr[i7];
        dArr[i7] = doubleValue;
        return Double.valueOf(d7);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.zzc;
    }

    @Override // com.google.android.gms.internal.measurement.zzkj
    public final /* bridge */ /* synthetic */ zzkj zzd(int i7) {
        if (i7 >= this.zzc) {
            return new zzjl(Arrays.copyOf(this.zzb, i7), this.zzc);
        }
        throw new IllegalArgumentException();
    }

    public final void zze(double d7) {
        zzbS();
        int i7 = this.zzc;
        double[] dArr = this.zzb;
        if (i7 == dArr.length) {
            double[] dArr2 = new double[AbstractC0486a1.q(i7, 3, 2, 1)];
            System.arraycopy(dArr, 0, dArr2, 0, i7);
            this.zzb = dArr2;
        }
        double[] dArr3 = this.zzb;
        int i8 = this.zzc;
        this.zzc = i8 + 1;
        dArr3[i8] = d7;
    }

    private zzjl(double[] dArr, int i7) {
        this.zzb = dArr;
        this.zzc = i7;
    }

    @Override // com.google.android.gms.internal.measurement.zzim, java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final /* bridge */ /* synthetic */ boolean add(Object obj) {
        zze(((Double) obj).doubleValue());
        return true;
    }
}
