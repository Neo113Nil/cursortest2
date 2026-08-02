package com.google.android.gms.internal.firebase_auth;

import java.util.Arrays;
import java.util.Collection;
import java.util.RandomAccess;

/* loaded from: classes.dex */
final class zzdv extends zzbq<Long> implements zzdg<Long>, RandomAccess {
    private static final zzdv zzsw;
    private int size;
    private long[] zzsx;

    static {
        zzdv zzdvVar = new zzdv();
        zzsw = zzdvVar;
        zzdvVar.zzbs();
    }

    zzdv() {
        this(new long[10], 0);
    }

    private zzdv(long[] jArr, int i) {
        this.zzsx = jArr;
        this.size = i;
    }

    private final void zzh(int i) {
        if (i < 0 || i >= this.size) {
            throw new IndexOutOfBoundsException(zzi(i));
        }
    }

    private final String zzi(int i) {
        int i2 = this.size;
        StringBuilder sb = new StringBuilder(35);
        sb.append("Index:");
        sb.append(i);
        sb.append(", Size:");
        sb.append(i2);
        return sb.toString();
    }

    private final void zzk(int i, long j) {
        int i2;
        zzbt();
        if (i < 0 || i > (i2 = this.size)) {
            throw new IndexOutOfBoundsException(zzi(i));
        }
        long[] jArr = this.zzsx;
        if (i2 < jArr.length) {
            System.arraycopy(jArr, i, jArr, i + 1, i2 - i);
        } else {
            long[] jArr2 = new long[((i2 * 3) / 2) + 1];
            System.arraycopy(jArr, 0, jArr2, 0, i);
            System.arraycopy(this.zzsx, i, jArr2, i + 1, this.size - i);
            this.zzsx = jArr2;
        }
        this.zzsx[i] = j;
        this.size++;
        this.modCount++;
    }

    @Override // com.google.android.gms.internal.firebase_auth.zzbq, java.util.AbstractList, java.util.List
    public final /* synthetic */ void add(int i, Object obj) {
        zzk(i, ((Long) obj).longValue());
    }

    @Override // com.google.android.gms.internal.firebase_auth.zzbq, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean addAll(Collection<? extends Long> collection) {
        zzbt();
        zzdd.checkNotNull(collection);
        if (!(collection instanceof zzdv)) {
            return super.addAll(collection);
        }
        zzdv zzdvVar = (zzdv) collection;
        int i = zzdvVar.size;
        if (i == 0) {
            return false;
        }
        int i2 = this.size;
        if (Integer.MAX_VALUE - i2 < i) {
            throw new OutOfMemoryError();
        }
        int i3 = i2 + i;
        long[] jArr = this.zzsx;
        if (i3 > jArr.length) {
            this.zzsx = Arrays.copyOf(jArr, i3);
        }
        System.arraycopy(zzdvVar.zzsx, 0, this.zzsx, this.size, zzdvVar.size);
        this.size = i3;
        this.modCount++;
        return true;
    }

    @Override // com.google.android.gms.internal.firebase_auth.zzbq, java.util.AbstractList, java.util.Collection, java.util.List
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zzdv)) {
            return super.equals(obj);
        }
        zzdv zzdvVar = (zzdv) obj;
        if (this.size != zzdvVar.size) {
            return false;
        }
        long[] jArr = zzdvVar.zzsx;
        for (int i = 0; i < this.size; i++) {
            if (this.zzsx[i] != jArr[i]) {
                return false;
            }
        }
        return true;
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* synthetic */ Object get(int i) {
        return Long.valueOf(getLong(i));
    }

    public final long getLong(int i) {
        zzh(i);
        return this.zzsx[i];
    }

    @Override // com.google.android.gms.internal.firebase_auth.zzbq, java.util.AbstractList, java.util.Collection, java.util.List
    public final int hashCode() {
        int i = 1;
        for (int i2 = 0; i2 < this.size; i2++) {
            i = (i * 31) + zzdd.zzk(this.zzsx[i2]);
        }
        return i;
    }

    @Override // com.google.android.gms.internal.firebase_auth.zzbq, java.util.AbstractList, java.util.List
    public final /* synthetic */ Object remove(int i) {
        zzbt();
        zzh(i);
        long[] jArr = this.zzsx;
        long j = jArr[i];
        int i2 = this.size;
        if (i < i2 - 1) {
            System.arraycopy(jArr, i + 1, jArr, i, i2 - i);
        }
        this.size--;
        this.modCount++;
        return Long.valueOf(j);
    }

    @Override // com.google.android.gms.internal.firebase_auth.zzbq, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean remove(Object obj) {
        zzbt();
        for (int i = 0; i < this.size; i++) {
            if (obj.equals(Long.valueOf(this.zzsx[i]))) {
                long[] jArr = this.zzsx;
                System.arraycopy(jArr, i + 1, jArr, i, this.size - i);
                this.size--;
                this.modCount++;
                return true;
            }
        }
        return false;
    }

    @Override // java.util.AbstractList
    protected final void removeRange(int i, int i2) {
        zzbt();
        if (i2 < i) {
            throw new IndexOutOfBoundsException("toIndex < fromIndex");
        }
        long[] jArr = this.zzsx;
        System.arraycopy(jArr, i2, jArr, i, this.size - i2);
        this.size -= i2 - i;
        this.modCount++;
    }

    @Override // com.google.android.gms.internal.firebase_auth.zzbq, java.util.AbstractList, java.util.List
    public final /* synthetic */ Object set(int i, Object obj) {
        long longValue = ((Long) obj).longValue();
        zzbt();
        zzh(i);
        long[] jArr = this.zzsx;
        long j = jArr[i];
        jArr[i] = longValue;
        return Long.valueOf(j);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.size;
    }

    @Override // com.google.android.gms.internal.firebase_auth.zzdg
    public final /* synthetic */ zzdg<Long> zzj(int i) {
        if (i >= this.size) {
            return new zzdv(Arrays.copyOf(this.zzsx, i), this.size);
        }
        throw new IllegalArgumentException();
    }

    public final void zzl(long j) {
        zzk(this.size, j);
    }
}
