package com.google.android.gms.internal.ads;

import W5.AbstractC0486a1;
import java.util.AbstractList;
import java.util.Arrays;
import java.util.RandomAccess;

/* loaded from: classes.dex */
final class zzgzc extends zzgvk implements RandomAccess {
    private static final Object[] zza;
    private static final zzgzc zzb;
    private Object[] zzc;
    private int zzd;

    static {
        Object[] objArr = new Object[0];
        zza = objArr;
        zzb = new zzgzc(objArr, 0, false);
    }

    public zzgzc() {
        this(zza, 0, true);
    }

    public static zzgzc zzd() {
        return zzb;
    }

    private static int zzg(int i7) {
        return Math.max(((i7 * 3) / 2) + 1, 10);
    }

    private final String zzh(int i7) {
        return AbstractC0486a1.e(i7, this.zzd, "Index:", ", Size:");
    }

    private final void zzi(int i7) {
        if (i7 < 0 || i7 >= this.zzd) {
            throw new IndexOutOfBoundsException(zzh(i7));
        }
    }

    @Override // com.google.android.gms.internal.ads.zzgvk, java.util.AbstractList, java.util.List
    public final void add(int i7, Object obj) {
        int i8;
        zzdG();
        if (i7 < 0 || i7 > (i8 = this.zzd)) {
            throw new IndexOutOfBoundsException(zzh(i7));
        }
        int i9 = i7 + 1;
        Object[] objArr = this.zzc;
        int length = objArr.length;
        if (i8 < length) {
            System.arraycopy(objArr, i7, objArr, i9, i8 - i7);
        } else {
            Object[] objArr2 = new Object[zzg(length)];
            System.arraycopy(this.zzc, 0, objArr2, 0, i7);
            System.arraycopy(this.zzc, i7, objArr2, i9, this.zzd - i7);
            this.zzc = objArr2;
        }
        this.zzc[i7] = obj;
        this.zzd++;
        ((AbstractList) this).modCount++;
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object get(int i7) {
        zzi(i7);
        return this.zzc[i7];
    }

    @Override // com.google.android.gms.internal.ads.zzgvk, java.util.AbstractList, java.util.List
    public final Object remove(int i7) {
        zzdG();
        zzi(i7);
        Object[] objArr = this.zzc;
        Object obj = objArr[i7];
        if (i7 < this.zzd - 1) {
            System.arraycopy(objArr, i7 + 1, objArr, i7, (r2 - i7) - 1);
        }
        this.zzd--;
        ((AbstractList) this).modCount++;
        return obj;
    }

    @Override // com.google.android.gms.internal.ads.zzgvk, java.util.AbstractList, java.util.List
    public final Object set(int i7, Object obj) {
        zzdG();
        zzi(i7);
        Object[] objArr = this.zzc;
        Object obj2 = objArr[i7];
        objArr[i7] = obj;
        ((AbstractList) this).modCount++;
        return obj2;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.zzd;
    }

    public final void zze(int i7) {
        int length = this.zzc.length;
        if (i7 <= length) {
            return;
        }
        if (length == 0) {
            this.zzc = new Object[Math.max(i7, 10)];
            return;
        }
        while (length < i7) {
            length = zzg(length);
        }
        this.zzc = Arrays.copyOf(this.zzc, length);
    }

    @Override // com.google.android.gms.internal.ads.zzgxs
    public final /* bridge */ /* synthetic */ zzgxs zzf(int i7) {
        if (i7 >= this.zzd) {
            return new zzgzc(i7 == 0 ? zza : Arrays.copyOf(this.zzc, i7), this.zzd, true);
        }
        throw new IllegalArgumentException();
    }

    private zzgzc(Object[] objArr, int i7, boolean z4) {
        super(z4);
        this.zzc = objArr;
        this.zzd = i7;
    }

    @Override // com.google.android.gms.internal.ads.zzgvk, java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean add(Object obj) {
        zzdG();
        int i7 = this.zzd;
        int length = this.zzc.length;
        if (i7 == length) {
            this.zzc = Arrays.copyOf(this.zzc, zzg(length));
        }
        Object[] objArr = this.zzc;
        int i8 = this.zzd;
        this.zzd = i8 + 1;
        objArr[i8] = obj;
        ((AbstractList) this).modCount++;
        return true;
    }
}
