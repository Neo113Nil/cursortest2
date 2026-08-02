package com.google.android.gms.internal.ads;

import W5.AbstractC0486a1;
import com.google.android.gms.common.api.f;
import java.util.AbstractList;
import java.util.Arrays;
import java.util.Collection;
import java.util.RandomAccess;

/* loaded from: classes.dex */
final class zzgwn extends zzgvk implements RandomAccess, zzgxj, zzgza {
    private static final double[] zza;
    private static final zzgwn zzb;
    private double[] zzc;
    private int zzd;

    static {
        double[] dArr = new double[0];
        zza = dArr;
        zzb = new zzgwn(dArr, 0, false);
    }

    public zzgwn() {
        this(zza, 0, true);
    }

    public static zzgwn zze() {
        return zzb;
    }

    private static int zzj(int i7) {
        return Math.max(((i7 * 3) / 2) + 1, 10);
    }

    private final String zzk(int i7) {
        return AbstractC0486a1.e(i7, this.zzd, "Index:", ", Size:");
    }

    private final void zzl(int i7) {
        if (i7 < 0 || i7 >= this.zzd) {
            throw new IndexOutOfBoundsException(zzk(i7));
        }
    }

    @Override // com.google.android.gms.internal.ads.zzgvk, java.util.AbstractList, java.util.List
    public final /* synthetic */ void add(int i7, Object obj) {
        int i8;
        double doubleValue = ((Double) obj).doubleValue();
        zzdG();
        if (i7 < 0 || i7 > (i8 = this.zzd)) {
            throw new IndexOutOfBoundsException(zzk(i7));
        }
        int i9 = i7 + 1;
        double[] dArr = this.zzc;
        int length = dArr.length;
        if (i8 < length) {
            System.arraycopy(dArr, i7, dArr, i9, i8 - i7);
        } else {
            double[] dArr2 = new double[zzj(length)];
            System.arraycopy(this.zzc, 0, dArr2, 0, i7);
            System.arraycopy(this.zzc, i7, dArr2, i9, this.zzd - i7);
            this.zzc = dArr2;
        }
        this.zzc[i7] = doubleValue;
        this.zzd++;
        ((AbstractList) this).modCount++;
    }

    @Override // com.google.android.gms.internal.ads.zzgvk, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean addAll(Collection collection) {
        zzdG();
        byte[] bArr = zzgxt.zzb;
        collection.getClass();
        if (!(collection instanceof zzgwn)) {
            return super.addAll(collection);
        }
        zzgwn zzgwnVar = (zzgwn) collection;
        int i7 = zzgwnVar.zzd;
        if (i7 == 0) {
            return false;
        }
        int i8 = this.zzd;
        if (f.API_PRIORITY_OTHER - i8 < i7) {
            throw new OutOfMemoryError();
        }
        int i9 = i8 + i7;
        double[] dArr = this.zzc;
        if (i9 > dArr.length) {
            this.zzc = Arrays.copyOf(dArr, i9);
        }
        System.arraycopy(zzgwnVar.zzc, 0, this.zzc, this.zzd, zzgwnVar.zzd);
        this.zzd = i9;
        ((AbstractList) this).modCount++;
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean contains(Object obj) {
        return indexOf(obj) != -1;
    }

    @Override // com.google.android.gms.internal.ads.zzgvk, java.util.AbstractList, java.util.Collection, java.util.List
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zzgwn)) {
            return super.equals(obj);
        }
        zzgwn zzgwnVar = (zzgwn) obj;
        if (this.zzd != zzgwnVar.zzd) {
            return false;
        }
        double[] dArr = zzgwnVar.zzc;
        for (int i7 = 0; i7 < this.zzd; i7++) {
            if (Double.doubleToLongBits(this.zzc[i7]) != Double.doubleToLongBits(dArr[i7])) {
                return false;
            }
        }
        return true;
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* synthetic */ Object get(int i7) {
        zzl(i7);
        return Double.valueOf(this.zzc[i7]);
    }

    @Override // com.google.android.gms.internal.ads.zzgvk, java.util.AbstractList, java.util.Collection, java.util.List
    public final int hashCode() {
        int i7 = 1;
        for (int i8 = 0; i8 < this.zzd; i8++) {
            long doubleToLongBits = Double.doubleToLongBits(this.zzc[i8]);
            byte[] bArr = zzgxt.zzb;
            i7 = (i7 * 31) + ((int) (doubleToLongBits ^ (doubleToLongBits >>> 32)));
        }
        return i7;
    }

    @Override // java.util.AbstractList, java.util.List
    public final int indexOf(Object obj) {
        if (!(obj instanceof Double)) {
            return -1;
        }
        double doubleValue = ((Double) obj).doubleValue();
        int i7 = this.zzd;
        for (int i8 = 0; i8 < i7; i8++) {
            if (this.zzc[i8] == doubleValue) {
                return i8;
            }
        }
        return -1;
    }

    @Override // com.google.android.gms.internal.ads.zzgvk, java.util.AbstractList, java.util.List
    public final /* bridge */ /* synthetic */ Object remove(int i7) {
        zzdG();
        zzl(i7);
        double[] dArr = this.zzc;
        double d7 = dArr[i7];
        if (i7 < this.zzd - 1) {
            System.arraycopy(dArr, i7 + 1, dArr, i7, (r3 - i7) - 1);
        }
        this.zzd--;
        ((AbstractList) this).modCount++;
        return Double.valueOf(d7);
    }

    @Override // java.util.AbstractList
    public final void removeRange(int i7, int i8) {
        zzdG();
        if (i8 < i7) {
            throw new IndexOutOfBoundsException("toIndex < fromIndex");
        }
        double[] dArr = this.zzc;
        System.arraycopy(dArr, i8, dArr, i7, this.zzd - i8);
        this.zzd -= i8 - i7;
        ((AbstractList) this).modCount++;
    }

    @Override // com.google.android.gms.internal.ads.zzgvk, java.util.AbstractList, java.util.List
    public final /* bridge */ /* synthetic */ Object set(int i7, Object obj) {
        double doubleValue = ((Double) obj).doubleValue();
        zzdG();
        zzl(i7);
        double[] dArr = this.zzc;
        double d7 = dArr[i7];
        dArr[i7] = doubleValue;
        return Double.valueOf(d7);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.zzd;
    }

    public final double zzd(int i7) {
        zzl(i7);
        return this.zzc[i7];
    }

    @Override // com.google.android.gms.internal.ads.zzgxs
    /* renamed from: zzg, reason: merged with bridge method [inline-methods] */
    public final zzgxj zzf(int i7) {
        if (i7 >= this.zzd) {
            return new zzgwn(i7 == 0 ? zza : Arrays.copyOf(this.zzc, i7), this.zzd, true);
        }
        throw new IllegalArgumentException();
    }

    public final void zzh(double d7) {
        zzdG();
        int i7 = this.zzd;
        int length = this.zzc.length;
        if (i7 == length) {
            double[] dArr = new double[zzj(length)];
            System.arraycopy(this.zzc, 0, dArr, 0, this.zzd);
            this.zzc = dArr;
        }
        double[] dArr2 = this.zzc;
        int i8 = this.zzd;
        this.zzd = i8 + 1;
        dArr2[i8] = d7;
    }

    public final void zzi(int i7) {
        int length = this.zzc.length;
        if (i7 <= length) {
            return;
        }
        if (length == 0) {
            this.zzc = new double[Math.max(i7, 10)];
            return;
        }
        while (length < i7) {
            length = zzj(length);
        }
        this.zzc = Arrays.copyOf(this.zzc, length);
    }

    private zzgwn(double[] dArr, int i7, boolean z4) {
        super(z4);
        this.zzc = dArr;
        this.zzd = i7;
    }

    @Override // com.google.android.gms.internal.ads.zzgvk, java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final /* bridge */ /* synthetic */ boolean add(Object obj) {
        zzh(((Double) obj).doubleValue());
        return true;
    }
}
