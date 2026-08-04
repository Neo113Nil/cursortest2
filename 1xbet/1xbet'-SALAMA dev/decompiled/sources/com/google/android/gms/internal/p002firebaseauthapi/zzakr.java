package com.google.android.gms.internal.p002firebaseauthapi;

import W5.AbstractC0486a1;
import com.google.android.gms.common.api.f;
import java.util.AbstractList;
import java.util.Arrays;
import java.util.Collection;
import java.util.RandomAccess;

/* JADX INFO: loaded from: classes.dex */
final class zzakr extends zzaij<Long> implements zzakc<Long>, RandomAccess {
    private static final long[] zza;
    private long[] zzb;
    private int zzc;

    static {
        long[] jArr = new long[0];
        zza = jArr;
        new zzakr(jArr, 0, false);
    }

    public zzakr() {
        this(zza, 0, true);
    }

    private static int zzd(int i7) {
        return Math.max(((i7 * 3) / 2) + 1, 10);
    }

    private final String zze(int i7) {
        return AbstractC0486a1.e(i7, this.zzc, "Index:", ", Size:");
    }

    private final void zzf(int i7) {
        if (i7 < 0 || i7 >= this.zzc) {
            throw new IndexOutOfBoundsException(zze(i7));
        }
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzaij, java.util.AbstractList, java.util.List
    public final /* synthetic */ void add(int i7, Object obj) {
        int i8;
        long jLongValue = ((Long) obj).longValue();
        zza();
        if (i7 < 0 || i7 > (i8 = this.zzc)) {
            throw new IndexOutOfBoundsException(zze(i7));
        }
        long[] jArr = this.zzb;
        if (i8 < jArr.length) {
            System.arraycopy(jArr, i7, jArr, i7 + 1, i8 - i7);
        } else {
            long[] jArr2 = new long[zzd(jArr.length)];
            System.arraycopy(this.zzb, 0, jArr2, 0, i7);
            System.arraycopy(this.zzb, i7, jArr2, i7 + 1, this.zzc - i7);
            this.zzb = jArr2;
        }
        this.zzb[i7] = jLongValue;
        this.zzc++;
        ((AbstractList) this).modCount++;
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzaij, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean addAll(Collection<? extends Long> collection) {
        zza();
        zzakb.zza(collection);
        if (!(collection instanceof zzakr)) {
            return super.addAll(collection);
        }
        zzakr zzakrVar = (zzakr) collection;
        int i7 = zzakrVar.zzc;
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
        System.arraycopy(zzakrVar.zzb, 0, this.zzb, this.zzc, zzakrVar.zzc);
        this.zzc = i9;
        ((AbstractList) this).modCount++;
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean contains(Object obj) {
        return indexOf(obj) != -1;
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzaij, java.util.AbstractList, java.util.Collection, java.util.List
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zzakr)) {
            return super.equals(obj);
        }
        zzakr zzakrVar = (zzakr) obj;
        if (this.zzc != zzakrVar.zzc) {
            return false;
        }
        long[] jArr = zzakrVar.zzb;
        for (int i7 = 0; i7 < this.zzc; i7++) {
            if (this.zzb[i7] != jArr[i7]) {
                return false;
            }
        }
        return true;
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* synthetic */ Object get(int i7) {
        return Long.valueOf(zzb(i7));
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzaij, java.util.AbstractList, java.util.Collection, java.util.List
    public final int hashCode() {
        int iZza = 1;
        for (int i7 = 0; i7 < this.zzc; i7++) {
            iZza = (iZza * 31) + zzakb.zza(this.zzb[i7]);
        }
        return iZza;
    }

    @Override // java.util.AbstractList, java.util.List
    public final int indexOf(Object obj) {
        if (!(obj instanceof Long)) {
            return -1;
        }
        long jLongValue = ((Long) obj).longValue();
        int size = size();
        for (int i7 = 0; i7 < size; i7++) {
            if (this.zzb[i7] == jLongValue) {
                return i7;
            }
        }
        return -1;
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzaij, java.util.AbstractList, java.util.List
    public final /* synthetic */ Object remove(int i7) {
        zza();
        zzf(i7);
        long[] jArr = this.zzb;
        long j = jArr[i7];
        int i8 = this.zzc;
        if (i7 < i8 - 1) {
            System.arraycopy(jArr, i7 + 1, jArr, i7, (i8 - i7) - 1);
        }
        this.zzc--;
        ((AbstractList) this).modCount++;
        return Long.valueOf(j);
    }

    @Override // java.util.AbstractList
    public final void removeRange(int i7, int i8) {
        zza();
        if (i8 < i7) {
            throw new IndexOutOfBoundsException("toIndex < fromIndex");
        }
        long[] jArr = this.zzb;
        System.arraycopy(jArr, i8, jArr, i7, this.zzc - i8);
        this.zzc -= i8 - i7;
        ((AbstractList) this).modCount++;
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzaij, java.util.AbstractList, java.util.List
    public final /* synthetic */ Object set(int i7, Object obj) {
        long jLongValue = ((Long) obj).longValue();
        zza();
        zzf(i7);
        long[] jArr = this.zzb;
        long j = jArr[i7];
        jArr[i7] = jLongValue;
        return Long.valueOf(j);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.zzc;
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzakc
    public final /* synthetic */ zzakc<Long> zza(int i7) {
        if (i7 >= this.zzc) {
            return new zzakr(i7 == 0 ? zza : Arrays.copyOf(this.zzb, i7), this.zzc, true);
        }
        throw new IllegalArgumentException();
    }

    public final long zzb(int i7) {
        zzf(i7);
        return this.zzb[i7];
    }

    public final void zzc(int i7) {
        long[] jArr = this.zzb;
        if (i7 <= jArr.length) {
            return;
        }
        if (jArr.length == 0) {
            this.zzb = new long[Math.max(i7, 10)];
            return;
        }
        int length = jArr.length;
        while (length < i7) {
            length = zzd(length);
        }
        this.zzb = Arrays.copyOf(this.zzb, length);
    }

    private zzakr(long[] jArr, int i7, boolean z4) {
        super(z4);
        this.zzb = jArr;
        this.zzc = i7;
    }

    public final void zza(long j) {
        zza();
        int i7 = this.zzc;
        long[] jArr = this.zzb;
        if (i7 == jArr.length) {
            long[] jArr2 = new long[zzd(jArr.length)];
            System.arraycopy(this.zzb, 0, jArr2, 0, this.zzc);
            this.zzb = jArr2;
        }
        long[] jArr3 = this.zzb;
        int i8 = this.zzc;
        this.zzc = i8 + 1;
        jArr3[i8] = j;
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzaij, java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final /* synthetic */ boolean add(Object obj) {
        zza(((Long) obj).longValue());
        return true;
    }
}
