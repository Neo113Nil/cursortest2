package com.google.android.recaptcha.internal;

import W5.AbstractC0486a1;
import com.google.android.gms.common.api.f;
import java.util.AbstractList;
import java.util.Arrays;
import java.util.Collection;
import java.util.RandomAccess;

/* JADX INFO: loaded from: classes.dex */
final class zzim extends zzii implements RandomAccess, zzkz, zzmf {
    private boolean[] zza;
    private int zzb;

    static {
        new zzim(new boolean[0], 0, false);
    }

    public zzim() {
        this(new boolean[10], 0, true);
    }

    private final String zzg(int i7) {
        return AbstractC0486a1.e(i7, this.zzb, "Index:", ", Size:");
    }

    private final void zzh(int i7) {
        if (i7 < 0 || i7 >= this.zzb) {
            throw new IndexOutOfBoundsException(zzg(i7));
        }
    }

    @Override // com.google.android.recaptcha.internal.zzii, java.util.AbstractList, java.util.List
    public final /* synthetic */ void add(int i7, Object obj) {
        int i8;
        boolean zBooleanValue = ((Boolean) obj).booleanValue();
        zza();
        if (i7 < 0 || i7 > (i8 = this.zzb)) {
            throw new IndexOutOfBoundsException(zzg(i7));
        }
        int i9 = i7 + 1;
        boolean[] zArr = this.zza;
        if (i8 < zArr.length) {
            System.arraycopy(zArr, i7, zArr, i9, i8 - i7);
        } else {
            boolean[] zArr2 = new boolean[AbstractC0486a1.q(i8, 3, 2, 1)];
            System.arraycopy(zArr, 0, zArr2, 0, i7);
            System.arraycopy(this.zza, i7, zArr2, i9, this.zzb - i7);
            this.zza = zArr2;
        }
        this.zza[i7] = zBooleanValue;
        this.zzb++;
        ((AbstractList) this).modCount++;
    }

    @Override // com.google.android.recaptcha.internal.zzii, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean addAll(Collection collection) {
        zza();
        byte[] bArr = zzla.zzb;
        collection.getClass();
        if (!(collection instanceof zzim)) {
            return super.addAll(collection);
        }
        zzim zzimVar = (zzim) collection;
        int i7 = zzimVar.zzb;
        if (i7 == 0) {
            return false;
        }
        int i8 = this.zzb;
        if (f.API_PRIORITY_OTHER - i8 < i7) {
            throw new OutOfMemoryError();
        }
        int i9 = i8 + i7;
        boolean[] zArr = this.zza;
        if (i9 > zArr.length) {
            this.zza = Arrays.copyOf(zArr, i9);
        }
        System.arraycopy(zzimVar.zza, 0, this.zza, this.zzb, zzimVar.zzb);
        this.zzb = i9;
        ((AbstractList) this).modCount++;
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean contains(Object obj) {
        return indexOf(obj) != -1;
    }

    @Override // com.google.android.recaptcha.internal.zzii, java.util.AbstractList, java.util.Collection, java.util.List
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zzim)) {
            return super.equals(obj);
        }
        zzim zzimVar = (zzim) obj;
        if (this.zzb != zzimVar.zzb) {
            return false;
        }
        boolean[] zArr = zzimVar.zza;
        for (int i7 = 0; i7 < this.zzb; i7++) {
            if (this.zza[i7] != zArr[i7]) {
                return false;
            }
        }
        return true;
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* synthetic */ Object get(int i7) {
        zzh(i7);
        return Boolean.valueOf(this.zza[i7]);
    }

    @Override // com.google.android.recaptcha.internal.zzii, java.util.AbstractList, java.util.Collection, java.util.List
    public final int hashCode() {
        int iZza = 1;
        for (int i7 = 0; i7 < this.zzb; i7++) {
            iZza = (iZza * 31) + zzla.zza(this.zza[i7]);
        }
        return iZza;
    }

    @Override // java.util.AbstractList, java.util.List
    public final int indexOf(Object obj) {
        if (!(obj instanceof Boolean)) {
            return -1;
        }
        boolean zBooleanValue = ((Boolean) obj).booleanValue();
        int i7 = this.zzb;
        for (int i8 = 0; i8 < i7; i8++) {
            if (this.zza[i8] == zBooleanValue) {
                return i8;
            }
        }
        return -1;
    }

    @Override // com.google.android.recaptcha.internal.zzii, java.util.AbstractList, java.util.List
    public final /* bridge */ /* synthetic */ Object remove(int i7) {
        zza();
        zzh(i7);
        boolean[] zArr = this.zza;
        boolean z4 = zArr[i7];
        int i8 = this.zzb;
        if (i7 < i8 - 1) {
            System.arraycopy(zArr, i7 + 1, zArr, i7, (i8 - i7) - 1);
        }
        this.zzb--;
        ((AbstractList) this).modCount++;
        return Boolean.valueOf(z4);
    }

    @Override // java.util.AbstractList
    public final void removeRange(int i7, int i8) {
        zza();
        if (i8 < i7) {
            throw new IndexOutOfBoundsException("toIndex < fromIndex");
        }
        boolean[] zArr = this.zza;
        System.arraycopy(zArr, i8, zArr, i7, this.zzb - i8);
        this.zzb -= i8 - i7;
        ((AbstractList) this).modCount++;
    }

    @Override // com.google.android.recaptcha.internal.zzii, java.util.AbstractList, java.util.List
    public final /* bridge */ /* synthetic */ Object set(int i7, Object obj) {
        boolean zBooleanValue = ((Boolean) obj).booleanValue();
        zza();
        zzh(i7);
        boolean[] zArr = this.zza;
        boolean z4 = zArr[i7];
        zArr[i7] = zBooleanValue;
        return Boolean.valueOf(z4);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.zzb;
    }

    @Override // com.google.android.recaptcha.internal.zzkz
    public final /* bridge */ /* synthetic */ zzkz zzd(int i7) {
        if (i7 >= this.zzb) {
            return new zzim(Arrays.copyOf(this.zza, i7), this.zzb, true);
        }
        throw new IllegalArgumentException();
    }

    public final void zze(boolean z4) {
        zza();
        int i7 = this.zzb;
        boolean[] zArr = this.zza;
        if (i7 == zArr.length) {
            boolean[] zArr2 = new boolean[AbstractC0486a1.q(i7, 3, 2, 1)];
            System.arraycopy(zArr, 0, zArr2, 0, i7);
            this.zza = zArr2;
        }
        boolean[] zArr3 = this.zza;
        int i8 = this.zzb;
        this.zzb = i8 + 1;
        zArr3[i8] = z4;
    }

    public final boolean zzf(int i7) {
        zzh(i7);
        return this.zza[i7];
    }

    private zzim(boolean[] zArr, int i7, boolean z4) {
        super(z4);
        this.zza = zArr;
        this.zzb = i7;
    }

    @Override // com.google.android.recaptcha.internal.zzii, java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final /* bridge */ /* synthetic */ boolean add(Object obj) {
        zze(((Boolean) obj).booleanValue());
        return true;
    }
}
