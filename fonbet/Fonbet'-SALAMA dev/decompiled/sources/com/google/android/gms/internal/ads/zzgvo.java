package com.google.android.gms.internal.ads;

import W5.AbstractC0486a1;
import com.google.android.gms.common.api.f;
import java.util.AbstractList;
import java.util.Arrays;
import java.util.Collection;
import java.util.RandomAccess;

/* loaded from: classes.dex */
final class zzgvo extends zzgvk implements RandomAccess, zzgxi, zzgza {
    private static final boolean[] zza;
    private static final zzgvo zzb;
    private boolean[] zzc;
    private int zzd;

    static {
        boolean[] zArr = new boolean[0];
        zza = zArr;
        zzb = new zzgvo(zArr, 0, false);
    }

    public zzgvo() {
        this(zza, 0, true);
    }

    public static zzgvo zzd() {
        return zzb;
    }

    private static int zzi(int i7) {
        return Math.max(((i7 * 3) / 2) + 1, 10);
    }

    private final String zzj(int i7) {
        return AbstractC0486a1.e(i7, this.zzd, "Index:", ", Size:");
    }

    private final void zzk(int i7) {
        if (i7 < 0 || i7 >= this.zzd) {
            throw new IndexOutOfBoundsException(zzj(i7));
        }
    }

    @Override // com.google.android.gms.internal.ads.zzgvk, java.util.AbstractList, java.util.List
    public final /* synthetic */ void add(int i7, Object obj) {
        int i8;
        boolean booleanValue = ((Boolean) obj).booleanValue();
        zzdG();
        if (i7 < 0 || i7 > (i8 = this.zzd)) {
            throw new IndexOutOfBoundsException(zzj(i7));
        }
        int i9 = i7 + 1;
        boolean[] zArr = this.zzc;
        int length = zArr.length;
        if (i8 < length) {
            System.arraycopy(zArr, i7, zArr, i9, i8 - i7);
        } else {
            boolean[] zArr2 = new boolean[zzi(length)];
            System.arraycopy(this.zzc, 0, zArr2, 0, i7);
            System.arraycopy(this.zzc, i7, zArr2, i9, this.zzd - i7);
            this.zzc = zArr2;
        }
        this.zzc[i7] = booleanValue;
        this.zzd++;
        ((AbstractList) this).modCount++;
    }

    @Override // com.google.android.gms.internal.ads.zzgvk, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean addAll(Collection collection) {
        zzdG();
        byte[] bArr = zzgxt.zzb;
        collection.getClass();
        if (!(collection instanceof zzgvo)) {
            return super.addAll(collection);
        }
        zzgvo zzgvoVar = (zzgvo) collection;
        int i7 = zzgvoVar.zzd;
        if (i7 == 0) {
            return false;
        }
        int i8 = this.zzd;
        if (f.API_PRIORITY_OTHER - i8 < i7) {
            throw new OutOfMemoryError();
        }
        int i9 = i8 + i7;
        boolean[] zArr = this.zzc;
        if (i9 > zArr.length) {
            this.zzc = Arrays.copyOf(zArr, i9);
        }
        System.arraycopy(zzgvoVar.zzc, 0, this.zzc, this.zzd, zzgvoVar.zzd);
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
        if (!(obj instanceof zzgvo)) {
            return super.equals(obj);
        }
        zzgvo zzgvoVar = (zzgvo) obj;
        if (this.zzd != zzgvoVar.zzd) {
            return false;
        }
        boolean[] zArr = zzgvoVar.zzc;
        for (int i7 = 0; i7 < this.zzd; i7++) {
            if (this.zzc[i7] != zArr[i7]) {
                return false;
            }
        }
        return true;
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* synthetic */ Object get(int i7) {
        zzk(i7);
        return Boolean.valueOf(this.zzc[i7]);
    }

    @Override // com.google.android.gms.internal.ads.zzgvk, java.util.AbstractList, java.util.Collection, java.util.List
    public final int hashCode() {
        int i7 = 1;
        for (int i8 = 0; i8 < this.zzd; i8++) {
            i7 = (i7 * 31) + zzgxt.zza(this.zzc[i8]);
        }
        return i7;
    }

    @Override // java.util.AbstractList, java.util.List
    public final int indexOf(Object obj) {
        if (!(obj instanceof Boolean)) {
            return -1;
        }
        boolean booleanValue = ((Boolean) obj).booleanValue();
        int i7 = this.zzd;
        for (int i8 = 0; i8 < i7; i8++) {
            if (this.zzc[i8] == booleanValue) {
                return i8;
            }
        }
        return -1;
    }

    @Override // com.google.android.gms.internal.ads.zzgvk, java.util.AbstractList, java.util.List
    public final /* bridge */ /* synthetic */ Object remove(int i7) {
        zzdG();
        zzk(i7);
        boolean[] zArr = this.zzc;
        boolean z4 = zArr[i7];
        if (i7 < this.zzd - 1) {
            System.arraycopy(zArr, i7 + 1, zArr, i7, (r2 - i7) - 1);
        }
        this.zzd--;
        ((AbstractList) this).modCount++;
        return Boolean.valueOf(z4);
    }

    @Override // java.util.AbstractList
    public final void removeRange(int i7, int i8) {
        zzdG();
        if (i8 < i7) {
            throw new IndexOutOfBoundsException("toIndex < fromIndex");
        }
        boolean[] zArr = this.zzc;
        System.arraycopy(zArr, i8, zArr, i7, this.zzd - i8);
        this.zzd -= i8 - i7;
        ((AbstractList) this).modCount++;
    }

    @Override // com.google.android.gms.internal.ads.zzgvk, java.util.AbstractList, java.util.List
    public final /* bridge */ /* synthetic */ Object set(int i7, Object obj) {
        boolean booleanValue = ((Boolean) obj).booleanValue();
        zzdG();
        zzk(i7);
        boolean[] zArr = this.zzc;
        boolean z4 = zArr[i7];
        zArr[i7] = booleanValue;
        return Boolean.valueOf(z4);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.zzd;
    }

    @Override // com.google.android.gms.internal.ads.zzgxs
    /* renamed from: zze, reason: merged with bridge method [inline-methods] */
    public final zzgxi zzf(int i7) {
        if (i7 >= this.zzd) {
            return new zzgvo(i7 == 0 ? zza : Arrays.copyOf(this.zzc, i7), this.zzd, true);
        }
        throw new IllegalArgumentException();
    }

    public final void zzg(boolean z4) {
        zzdG();
        int i7 = this.zzd;
        int length = this.zzc.length;
        if (i7 == length) {
            boolean[] zArr = new boolean[zzi(length)];
            System.arraycopy(this.zzc, 0, zArr, 0, this.zzd);
            this.zzc = zArr;
        }
        boolean[] zArr2 = this.zzc;
        int i8 = this.zzd;
        this.zzd = i8 + 1;
        zArr2[i8] = z4;
    }

    public final boolean zzh(int i7) {
        zzk(i7);
        return this.zzc[i7];
    }

    private zzgvo(boolean[] zArr, int i7, boolean z4) {
        super(z4);
        this.zzc = zArr;
        this.zzd = i7;
    }

    @Override // com.google.android.gms.internal.ads.zzgvk, java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final /* bridge */ /* synthetic */ boolean add(Object obj) {
        zzg(((Boolean) obj).booleanValue());
        return true;
    }
}
