package com.google.android.gms.internal.auth;

import W5.AbstractC0486a1;
import java.util.AbstractList;
import java.util.Arrays;
import java.util.RandomAccess;

/* JADX INFO: loaded from: classes.dex */
final class zzgf extends zzdq implements RandomAccess {
    private static final zzgf zza;
    private Object[] zzb;
    private int zzc;

    static {
        zzgf zzgfVar = new zzgf(new Object[0], 0);
        zza = zzgfVar;
        zzgfVar.zzb();
    }

    public zzgf() {
        this(new Object[10], 0);
    }

    public static zzgf zze() {
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

    @Override // com.google.android.gms.internal.auth.zzdq, java.util.AbstractList, java.util.List
    public final void add(int i7, Object obj) {
        int i8;
        zza();
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

    @Override // com.google.android.gms.internal.auth.zzdq, java.util.AbstractList, java.util.List
    public final Object remove(int i7) {
        zza();
        zzg(i7);
        Object[] objArr = this.zzb;
        Object obj = objArr[i7];
        int i8 = this.zzc;
        if (i7 < i8 - 1) {
            System.arraycopy(objArr, i7 + 1, objArr, i7, (i8 - i7) - 1);
        }
        this.zzc--;
        ((AbstractList) this).modCount++;
        return obj;
    }

    @Override // com.google.android.gms.internal.auth.zzdq, java.util.AbstractList, java.util.List
    public final Object set(int i7, Object obj) {
        zza();
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

    @Override // com.google.android.gms.internal.auth.zzey
    public final /* bridge */ /* synthetic */ zzey zzd(int i7) {
        if (i7 >= this.zzc) {
            return new zzgf(Arrays.copyOf(this.zzb, i7), this.zzc);
        }
        throw new IllegalArgumentException();
    }

    private zzgf(Object[] objArr, int i7) {
        this.zzb = objArr;
        this.zzc = i7;
    }

    @Override // com.google.android.gms.internal.auth.zzdq, java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean add(Object obj) {
        zza();
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
