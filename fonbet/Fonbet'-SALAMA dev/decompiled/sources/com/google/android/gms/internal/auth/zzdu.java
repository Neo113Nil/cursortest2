package com.google.android.gms.internal.auth;

import W5.AbstractC0486a1;
import com.google.android.gms.common.api.f;
import java.util.AbstractList;
import java.util.Arrays;
import java.util.Collection;
import java.util.RandomAccess;

/* loaded from: classes.dex */
final class zzdu extends zzdq implements RandomAccess, zzey, zzgd {
    private static final zzdu zza;
    private boolean[] zzb;
    private int zzc;

    static {
        zzdu zzduVar = new zzdu(new boolean[0], 0);
        zza = zzduVar;
        zzduVar.zzb();
    }

    public zzdu() {
        this(new boolean[10], 0);
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
    public final /* synthetic */ void add(int i7, Object obj) {
        int i8;
        boolean booleanValue = ((Boolean) obj).booleanValue();
        zza();
        if (i7 < 0 || i7 > (i8 = this.zzc)) {
            throw new IndexOutOfBoundsException(zzf(i7));
        }
        boolean[] zArr = this.zzb;
        if (i8 < zArr.length) {
            System.arraycopy(zArr, i7, zArr, i7 + 1, i8 - i7);
        } else {
            boolean[] zArr2 = new boolean[AbstractC0486a1.q(i8, 3, 2, 1)];
            System.arraycopy(zArr, 0, zArr2, 0, i7);
            System.arraycopy(this.zzb, i7, zArr2, i7 + 1, this.zzc - i7);
            this.zzb = zArr2;
        }
        this.zzb[i7] = booleanValue;
        this.zzc++;
        ((AbstractList) this).modCount++;
    }

    @Override // com.google.android.gms.internal.auth.zzdq, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean addAll(Collection collection) {
        zza();
        zzez.zze(collection);
        if (!(collection instanceof zzdu)) {
            return super.addAll(collection);
        }
        zzdu zzduVar = (zzdu) collection;
        int i7 = zzduVar.zzc;
        if (i7 == 0) {
            return false;
        }
        int i8 = this.zzc;
        if (f.API_PRIORITY_OTHER - i8 < i7) {
            throw new OutOfMemoryError();
        }
        int i9 = i8 + i7;
        boolean[] zArr = this.zzb;
        if (i9 > zArr.length) {
            this.zzb = Arrays.copyOf(zArr, i9);
        }
        System.arraycopy(zzduVar.zzb, 0, this.zzb, this.zzc, zzduVar.zzc);
        this.zzc = i9;
        ((AbstractList) this).modCount++;
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean contains(Object obj) {
        return indexOf(obj) != -1;
    }

    @Override // com.google.android.gms.internal.auth.zzdq, java.util.AbstractList, java.util.Collection, java.util.List
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zzdu)) {
            return super.equals(obj);
        }
        zzdu zzduVar = (zzdu) obj;
        if (this.zzc != zzduVar.zzc) {
            return false;
        }
        boolean[] zArr = zzduVar.zzb;
        for (int i7 = 0; i7 < this.zzc; i7++) {
            if (this.zzb[i7] != zArr[i7]) {
                return false;
            }
        }
        return true;
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* synthetic */ Object get(int i7) {
        zzg(i7);
        return Boolean.valueOf(this.zzb[i7]);
    }

    @Override // com.google.android.gms.internal.auth.zzdq, java.util.AbstractList, java.util.Collection, java.util.List
    public final int hashCode() {
        int i7 = 1;
        for (int i8 = 0; i8 < this.zzc; i8++) {
            i7 = (i7 * 31) + zzez.zza(this.zzb[i8]);
        }
        return i7;
    }

    @Override // java.util.AbstractList, java.util.List
    public final int indexOf(Object obj) {
        if (!(obj instanceof Boolean)) {
            return -1;
        }
        boolean booleanValue = ((Boolean) obj).booleanValue();
        int i7 = this.zzc;
        for (int i8 = 0; i8 < i7; i8++) {
            if (this.zzb[i8] == booleanValue) {
                return i8;
            }
        }
        return -1;
    }

    @Override // com.google.android.gms.internal.auth.zzdq, java.util.AbstractList, java.util.List
    public final /* bridge */ /* synthetic */ Object remove(int i7) {
        zza();
        zzg(i7);
        boolean[] zArr = this.zzb;
        boolean z4 = zArr[i7];
        if (i7 < this.zzc - 1) {
            System.arraycopy(zArr, i7 + 1, zArr, i7, (r2 - i7) - 1);
        }
        this.zzc--;
        ((AbstractList) this).modCount++;
        return Boolean.valueOf(z4);
    }

    @Override // java.util.AbstractList
    public final void removeRange(int i7, int i8) {
        zza();
        if (i8 < i7) {
            throw new IndexOutOfBoundsException("toIndex < fromIndex");
        }
        boolean[] zArr = this.zzb;
        System.arraycopy(zArr, i8, zArr, i7, this.zzc - i8);
        this.zzc -= i8 - i7;
        ((AbstractList) this).modCount++;
    }

    @Override // com.google.android.gms.internal.auth.zzdq, java.util.AbstractList, java.util.List
    public final /* bridge */ /* synthetic */ Object set(int i7, Object obj) {
        boolean booleanValue = ((Boolean) obj).booleanValue();
        zza();
        zzg(i7);
        boolean[] zArr = this.zzb;
        boolean z4 = zArr[i7];
        zArr[i7] = booleanValue;
        return Boolean.valueOf(z4);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.zzc;
    }

    @Override // com.google.android.gms.internal.auth.zzey
    public final /* bridge */ /* synthetic */ zzey zzd(int i7) {
        if (i7 >= this.zzc) {
            return new zzdu(Arrays.copyOf(this.zzb, i7), this.zzc);
        }
        throw new IllegalArgumentException();
    }

    public final void zze(boolean z4) {
        zza();
        int i7 = this.zzc;
        boolean[] zArr = this.zzb;
        if (i7 == zArr.length) {
            boolean[] zArr2 = new boolean[AbstractC0486a1.q(i7, 3, 2, 1)];
            System.arraycopy(zArr, 0, zArr2, 0, i7);
            this.zzb = zArr2;
        }
        boolean[] zArr3 = this.zzb;
        int i8 = this.zzc;
        this.zzc = i8 + 1;
        zArr3[i8] = z4;
    }

    private zzdu(boolean[] zArr, int i7) {
        this.zzb = zArr;
        this.zzc = i7;
    }

    @Override // com.google.android.gms.internal.auth.zzdq, java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final /* bridge */ /* synthetic */ boolean add(Object obj) {
        zze(((Boolean) obj).booleanValue());
        return true;
    }
}
