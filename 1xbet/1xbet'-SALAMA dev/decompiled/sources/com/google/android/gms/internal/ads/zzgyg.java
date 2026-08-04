package com.google.android.gms.internal.ads;

import W5.AbstractC0486a1;
import com.google.android.gms.common.api.f;
import java.util.AbstractList;
import java.util.Arrays;
import java.util.Collection;
import java.util.RandomAccess;

/* JADX INFO: loaded from: classes.dex */
final class zzgyg extends zzgvk implements RandomAccess, zzgxr, zzgza {
    private static final long[] zza;
    private static final zzgyg zzb;
    private long[] zzc;
    private int zzd;

    static {
        long[] jArr = new long[0];
        zza = jArr;
        zzb = new zzgyg(jArr, 0, false);
    }

    public zzgyg() {
        this(zza, 0, true);
    }

    public static zzgyg zzh() {
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
        long jLongValue = ((Long) obj).longValue();
        zzdG();
        if (i7 < 0 || i7 > (i8 = this.zzd)) {
            throw new IndexOutOfBoundsException(zzk(i7));
        }
        int i9 = i7 + 1;
        long[] jArr = this.zzc;
        int length = jArr.length;
        if (i8 < length) {
            System.arraycopy(jArr, i7, jArr, i9, i8 - i7);
        } else {
            long[] jArr2 = new long[zzj(length)];
            System.arraycopy(this.zzc, 0, jArr2, 0, i7);
            System.arraycopy(this.zzc, i7, jArr2, i9, this.zzd - i7);
            this.zzc = jArr2;
        }
        this.zzc[i7] = jLongValue;
        this.zzd++;
        ((AbstractList) this).modCount++;
    }

    @Override // com.google.android.gms.internal.ads.zzgvk, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean addAll(Collection collection) {
        zzdG();
        byte[] bArr = zzgxt.zzb;
        collection.getClass();
        if (!(collection instanceof zzgyg)) {
            return super.addAll(collection);
        }
        zzgyg zzgygVar = (zzgyg) collection;
        int i7 = zzgygVar.zzd;
        if (i7 == 0) {
            return false;
        }
        int i8 = this.zzd;
        if (f.API_PRIORITY_OTHER - i8 < i7) {
            throw new OutOfMemoryError();
        }
        int i9 = i8 + i7;
        long[] jArr = this.zzc;
        if (i9 > jArr.length) {
            this.zzc = Arrays.copyOf(jArr, i9);
        }
        System.arraycopy(zzgygVar.zzc, 0, this.zzc, this.zzd, zzgygVar.zzd);
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
        if (!(obj instanceof zzgyg)) {
            return super.equals(obj);
        }
        zzgyg zzgygVar = (zzgyg) obj;
        if (this.zzd != zzgygVar.zzd) {
            return false;
        }
        long[] jArr = zzgygVar.zzc;
        for (int i7 = 0; i7 < this.zzd; i7++) {
            if (this.zzc[i7] != jArr[i7]) {
                return false;
            }
        }
        return true;
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* synthetic */ Object get(int i7) {
        zzl(i7);
        return Long.valueOf(this.zzc[i7]);
    }

    @Override // com.google.android.gms.internal.ads.zzgvk, java.util.AbstractList, java.util.Collection, java.util.List
    public final int hashCode() {
        int i7 = 1;
        for (int i8 = 0; i8 < this.zzd; i8++) {
            long j = this.zzc[i8];
            byte[] bArr = zzgxt.zzb;
            i7 = (i7 * 31) + ((int) (j ^ (j >>> 32)));
        }
        return i7;
    }

    @Override // java.util.AbstractList, java.util.List
    public final int indexOf(Object obj) {
        if (!(obj instanceof Long)) {
            return -1;
        }
        long jLongValue = ((Long) obj).longValue();
        int i7 = this.zzd;
        for (int i8 = 0; i8 < i7; i8++) {
            if (this.zzc[i8] == jLongValue) {
                return i8;
            }
        }
        return -1;
    }

    @Override // com.google.android.gms.internal.ads.zzgvk, java.util.AbstractList, java.util.List
    public final /* bridge */ /* synthetic */ Object remove(int i7) {
        zzdG();
        zzl(i7);
        long[] jArr = this.zzc;
        long j = jArr[i7];
        int i8 = this.zzd;
        if (i7 < i8 - 1) {
            System.arraycopy(jArr, i7 + 1, jArr, i7, (i8 - i7) - 1);
        }
        this.zzd--;
        ((AbstractList) this).modCount++;
        return Long.valueOf(j);
    }

    @Override // java.util.AbstractList
    public final void removeRange(int i7, int i8) {
        zzdG();
        if (i8 < i7) {
            throw new IndexOutOfBoundsException("toIndex < fromIndex");
        }
        long[] jArr = this.zzc;
        System.arraycopy(jArr, i8, jArr, i7, this.zzd - i8);
        this.zzd -= i8 - i7;
        ((AbstractList) this).modCount++;
    }

    @Override // com.google.android.gms.internal.ads.zzgvk, java.util.AbstractList, java.util.List
    public final /* bridge */ /* synthetic */ Object set(int i7, Object obj) {
        return Long.valueOf(zzd(i7, ((Long) obj).longValue()));
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.zzd;
    }

    @Override // com.google.android.gms.internal.ads.zzgxr
    public final long zza(int i7) {
        zzl(i7);
        return this.zzc[i7];
    }

    @Override // com.google.android.gms.internal.ads.zzgxr
    public final long zzd(int i7, long j) {
        zzdG();
        zzl(i7);
        long[] jArr = this.zzc;
        long j3 = jArr[i7];
        jArr[i7] = j;
        return j3;
    }

    @Override // com.google.android.gms.internal.ads.zzgxs
    /* JADX INFO: renamed from: zze, reason: merged with bridge method [inline-methods] */
    public final zzgxr zzf(int i7) {
        if (i7 >= this.zzd) {
            return new zzgyg(i7 == 0 ? zza : Arrays.copyOf(this.zzc, i7), this.zzd, true);
        }
        throw new IllegalArgumentException();
    }

    @Override // com.google.android.gms.internal.ads.zzgxr
    public final void zzg(long j) {
        zzdG();
        int i7 = this.zzd;
        int length = this.zzc.length;
        if (i7 == length) {
            long[] jArr = new long[zzj(length)];
            System.arraycopy(this.zzc, 0, jArr, 0, this.zzd);
            this.zzc = jArr;
        }
        long[] jArr2 = this.zzc;
        int i8 = this.zzd;
        this.zzd = i8 + 1;
        jArr2[i8] = j;
    }

    public final void zzi(int i7) {
        int length = this.zzc.length;
        if (i7 <= length) {
            return;
        }
        if (length == 0) {
            this.zzc = new long[Math.max(i7, 10)];
            return;
        }
        while (length < i7) {
            length = zzj(length);
        }
        this.zzc = Arrays.copyOf(this.zzc, length);
    }

    private zzgyg(long[] jArr, int i7, boolean z4) {
        super(z4);
        this.zzc = jArr;
        this.zzd = i7;
    }

    @Override // com.google.android.gms.internal.ads.zzgvk, java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final /* bridge */ /* synthetic */ boolean add(Object obj) {
        zzg(((Long) obj).longValue());
        return true;
    }
}
