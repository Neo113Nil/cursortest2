package com.google.android.gms.internal.measurement;

import W5.AbstractC0486a1;
import java.util.AbstractList;
import java.util.Arrays;
import java.util.RandomAccess;

/* loaded from: classes.dex */
final class zzls extends zzim implements RandomAccess {
    private static final zzls zza;
    private Object[] zzb;
    private int zzc;

    static {
        zzls zzlsVar = new zzls(new Object[0], 0);
        zza = zzlsVar;
        zzlsVar.zzb();
    }

    public zzls() {
        this(new Object[10], 0);
    }

    public static zzls zze() {
        return zza;
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
    public final void add(int i7, Object obj) {
        int i8;
        zzbS();
        if (i7 < 0 || i7 > (i8 = this.zzc)) {
            throw new IndexOutOfBoundsException(zzf(i7));
        }
        Object[] objArr = this.zzb;
        if (i8 < objArr.length) {
            System.arraycopy(objArr, i7, objArr, i7 + 1, i8 - i7);
        } else {
            Object[] objArr2 = new Object[AbstractC0486a1.q(i8, 3, 2, 1)];
            System.arraycopy(objArr, 0, objArr2, 0, i7);
            System.arraycopy(this.zzb, i7, objArr2, i7 + 1, this.zzc - i7);
            this.zzb = objArr2;
        }
        this.zzb[i7] = obj;
        this.zzc++;
        ((AbstractList) this).modCount++;
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object get(int i7) {
        zzg(i7);
        return this.zzb[i7];
    }

    @Override // com.google.android.gms.internal.measurement.zzim, java.util.AbstractList, java.util.List
    public final Object remove(int i7) {
        zzbS();
        zzg(i7);
        Object[] objArr = this.zzb;
        Object obj = objArr[i7];
        if (i7 < this.zzc - 1) {
            System.arraycopy(objArr, i7 + 1, objArr, i7, (r2 - i7) - 1);
        }
        this.zzc--;
        ((AbstractList) this).modCount++;
        return obj;
    }

    @Override // com.google.android.gms.internal.measurement.zzim, java.util.AbstractList, java.util.List
    public final Object set(int i7, Object obj) {
        zzbS();
        zzg(i7);
        Object[] objArr = this.zzb;
        Object obj2 = objArr[i7];
        objArr[i7] = obj;
        ((AbstractList) this).modCount++;
        return obj2;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.zzc;
    }

    @Override // com.google.android.gms.internal.measurement.zzkj
    public final /* bridge */ /* synthetic */ zzkj zzd(int i7) {
        if (i7 >= this.zzc) {
            return new zzls(Arrays.copyOf(this.zzb, i7), this.zzc);
        }
        throw new IllegalArgumentException();
    }

    private zzls(Object[] objArr, int i7) {
        this.zzb = objArr;
        this.zzc = i7;
    }

    @Override // com.google.android.gms.internal.measurement.zzim, java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean add(Object obj) {
        zzbS();
        int i7 = this.zzc;
        Object[] objArr = this.zzb;
        if (i7 == objArr.length) {
            this.zzb = Arrays.copyOf(objArr, ((i7 * 3) / 2) + 1);
        }
        Object[] objArr2 = this.zzb;
        int i8 = this.zzc;
        this.zzc = i8 + 1;
        objArr2[i8] = obj;
        ((AbstractList) this).modCount++;
        return true;
    }
}
