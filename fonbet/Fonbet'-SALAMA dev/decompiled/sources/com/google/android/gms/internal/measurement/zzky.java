package com.google.android.gms.internal.measurement;

import W5.AbstractC0486a1;
import com.google.android.gms.common.api.f;
import java.util.AbstractList;
import java.util.Arrays;
import java.util.Collection;
import java.util.RandomAccess;

/* loaded from: classes.dex */
final class zzky extends zzim implements RandomAccess, zzki, zzlq {
    private static final zzky zza;
    private long[] zzb;
    private int zzc;

    static {
        zzky zzkyVar = new zzky(new long[0], 0);
        zza = zzkyVar;
        zzkyVar.zzb();
    }

    public zzky() {
        this(new long[10], 0);
    }

    public static zzky zzf() {
        return zza;
    }

    private final String zzh(int i7) {
        return AbstractC0486a1.e(i7, this.zzc, "Index:", ", Size:");
    }

    private final void zzi(int i7) {
        if (i7 < 0 || i7 >= this.zzc) {
            throw new IndexOutOfBoundsException(zzh(i7));
        }
    }

    @Override // com.google.android.gms.internal.measurement.zzim, java.util.AbstractList, java.util.List
    public final /* synthetic */ void add(int i7, Object obj) {
        int i8;
        long longValue = ((Long) obj).longValue();
        zzbS();
        if (i7 < 0 || i7 > (i8 = this.zzc)) {
            throw new IndexOutOfBoundsException(zzh(i7));
        }
        long[] jArr = this.zzb;
        if (i8 < jArr.length) {
            System.arraycopy(jArr, i7, jArr, i7 + 1, i8 - i7);
        } else {
            long[] jArr2 = new long[AbstractC0486a1.q(i8, 3, 2, 1)];
            System.arraycopy(jArr, 0, jArr2, 0, i7);
            System.arraycopy(this.zzb, i7, jArr2, i7 + 1, this.zzc - i7);
            this.zzb = jArr2;
        }
        this.zzb[i7] = longValue;
        this.zzc++;
        ((AbstractList) this).modCount++;
    }

    @Override // com.google.android.gms.internal.measurement.zzim, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean addAll(Collection collection) {
        zzbS();
        zzkk.zze(collection);
        if (!(collection instanceof zzky)) {
            return super.addAll(collection);
        }
        zzky zzkyVar = (zzky) collection;
        int i7 = zzkyVar.zzc;
        if (i7 == 0) {
            return false;
        }
        int i8 = this.zzc;
        if (f.API_PRIORITY_OTHER - i8 < i7) {
            throw new OutOfMemoryError();
        }
        int i9 = i8 + i7;
        long[] jArr = this.zzb;
        if (i9 > jArr.length) {
            this.zzb = Arrays.copyOf(jArr, i9);
        }
        System.arraycopy(zzkyVar.zzb, 0, this.zzb, this.zzc, zzkyVar.zzc);
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
        if (!(obj instanceof zzky)) {
            return super.equals(obj);
        }
        zzky zzkyVar = (zzky) obj;
        if (this.zzc != zzkyVar.zzc) {
            return false;
        }
        long[] jArr = zzkyVar.zzb;
        for (int i7 = 0; i7 < this.zzc; i7++) {
            if (this.zzb[i7] != jArr[i7]) {
                return false;
            }
        }
        return true;
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* synthetic */ Object get(int i7) {
        zzi(i7);
        return Long.valueOf(this.zzb[i7]);
    }

    @Override // com.google.android.gms.internal.measurement.zzim, java.util.AbstractList, java.util.Collection, java.util.List
    public final int hashCode() {
        int i7 = 1;
        for (int i8 = 0; i8 < this.zzc; i8++) {
            i7 = (i7 * 31) + zzkk.zzc(this.zzb[i8]);
        }
        return i7;
    }

    @Override // java.util.AbstractList, java.util.List
    public final int indexOf(Object obj) {
        if (!(obj instanceof Long)) {
            return -1;
        }
        long longValue = ((Long) obj).longValue();
        int i7 = this.zzc;
        for (int i8 = 0; i8 < i7; i8++) {
            if (this.zzb[i8] == longValue) {
                return i8;
            }
        }
        return -1;
    }

    @Override // com.google.android.gms.internal.measurement.zzim, java.util.AbstractList, java.util.List
    public final /* bridge */ /* synthetic */ Object remove(int i7) {
        zzbS();
        zzi(i7);
        long[] jArr = this.zzb;
        long j = jArr[i7];
        if (i7 < this.zzc - 1) {
            System.arraycopy(jArr, i7 + 1, jArr, i7, (r3 - i7) - 1);
        }
        this.zzc--;
        ((AbstractList) this).modCount++;
        return Long.valueOf(j);
    }

    @Override // java.util.AbstractList
    public final void removeRange(int i7, int i8) {
        zzbS();
        if (i8 < i7) {
            throw new IndexOutOfBoundsException("toIndex < fromIndex");
        }
        long[] jArr = this.zzb;
        System.arraycopy(jArr, i8, jArr, i7, this.zzc - i8);
        this.zzc -= i8 - i7;
        ((AbstractList) this).modCount++;
    }

    @Override // com.google.android.gms.internal.measurement.zzim, java.util.AbstractList, java.util.List
    public final /* bridge */ /* synthetic */ Object set(int i7, Object obj) {
        long longValue = ((Long) obj).longValue();
        zzbS();
        zzi(i7);
        long[] jArr = this.zzb;
        long j = jArr[i7];
        jArr[i7] = longValue;
        return Long.valueOf(j);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.zzc;
    }

    @Override // com.google.android.gms.internal.measurement.zzki
    public final long zza(int i7) {
        zzi(i7);
        return this.zzb[i7];
    }

    @Override // com.google.android.gms.internal.measurement.zzkj
    /* renamed from: zze, reason: merged with bridge method [inline-methods] */
    public final zzki zzd(int i7) {
        if (i7 >= this.zzc) {
            return new zzky(Arrays.copyOf(this.zzb, i7), this.zzc);
        }
        throw new IllegalArgumentException();
    }

    public final void zzg(long j) {
        zzbS();
        int i7 = this.zzc;
        long[] jArr = this.zzb;
        if (i7 == jArr.length) {
            long[] jArr2 = new long[AbstractC0486a1.q(i7, 3, 2, 1)];
            System.arraycopy(jArr, 0, jArr2, 0, i7);
            this.zzb = jArr2;
        }
        long[] jArr3 = this.zzb;
        int i8 = this.zzc;
        this.zzc = i8 + 1;
        jArr3[i8] = j;
    }

    private zzky(long[] jArr, int i7) {
        this.zzb = jArr;
        this.zzc = i7;
    }

    @Override // com.google.android.gms.internal.measurement.zzim, java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final /* bridge */ /* synthetic */ boolean add(Object obj) {
        zzg(((Long) obj).longValue());
        return true;
    }
}
