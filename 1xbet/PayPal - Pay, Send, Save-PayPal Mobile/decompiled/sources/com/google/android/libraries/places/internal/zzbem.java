package com.google.android.libraries.places.internal;

/* loaded from: classes4.dex */
final class zzbem extends com.google.android.libraries.places.internal.zzbcb implements java.util.RandomAccess, com.google.android.libraries.places.internal.zzbdz, com.google.android.libraries.places.internal.zzbfg {
    private static final long[] zza;
    private static final com.google.android.libraries.places.internal.zzbem zzb;
    private long[] zzc;
    private int zzd;

    static {
        long[] jArr = new long[0];
        zza = jArr;
        zzb = new com.google.android.libraries.places.internal.zzbem(jArr, 0, false);
    }

    zzbem() {
        this(zza, 0, true);
    }

    private static int zzh(int i) {
        return java.lang.Math.max(((i * 3) / 2) + 1, 10);
    }

    private final void zzi(int i) {
        if (i < 0 || i >= this.zzd) {
            throw new java.lang.IndexOutOfBoundsException(zzj(i));
        }
    }

    private final java.lang.String zzj(int i) {
        return com.google.android.libraries.places.internal.zzbce.zzb(this.zzd, i, (byte) 13, "Index:", ", Size:");
    }

    @Override // com.google.android.libraries.places.internal.zzbcb, java.util.AbstractList, java.util.List
    public final /* synthetic */ void add(int i, java.lang.Object obj) {
        int i2;
        long longValue = ((java.lang.Long) obj).longValue();
        zzbO();
        if (i < 0 || i > (i2 = this.zzd)) {
            throw new java.lang.IndexOutOfBoundsException(zzj(i));
        }
        int i3 = i + 1;
        long[] jArr = this.zzc;
        int length = jArr.length;
        if (i2 < length) {
            java.lang.System.arraycopy(jArr, i, jArr, i3, i2 - i);
        } else {
            long[] jArr2 = new long[zzh(length)];
            java.lang.System.arraycopy(this.zzc, 0, jArr2, 0, i);
            java.lang.System.arraycopy(this.zzc, i, jArr2, i3, this.zzd - i);
            this.zzc = jArr2;
        }
        this.zzc[i] = longValue;
        this.zzd++;
        this.modCount++;
    }

    @Override // com.google.android.libraries.places.internal.zzbcb, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean addAll(java.util.Collection collection) {
        zzbO();
        if (!(collection instanceof com.google.android.libraries.places.internal.zzbem)) {
            return super.addAll(collection);
        }
        com.google.android.libraries.places.internal.zzbem zzbemVar = (com.google.android.libraries.places.internal.zzbem) collection;
        int i = zzbemVar.zzd;
        if (i == 0) {
            return false;
        }
        int i2 = this.zzd;
        if (Integer.MAX_VALUE - i2 < i) {
            throw new java.lang.OutOfMemoryError();
        }
        int i3 = i2 + i;
        long[] jArr = this.zzc;
        if (i3 > jArr.length) {
            this.zzc = java.util.Arrays.copyOf(jArr, i3);
        }
        java.lang.System.arraycopy(zzbemVar.zzc, 0, this.zzc, this.zzd, zzbemVar.zzd);
        this.zzd = i3;
        this.modCount++;
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean contains(java.lang.Object obj) {
        return indexOf(obj) != -1;
    }

    @Override // com.google.android.libraries.places.internal.zzbcb, java.util.AbstractList, java.util.Collection, java.util.List
    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof com.google.android.libraries.places.internal.zzbem)) {
            return super.equals(obj);
        }
        com.google.android.libraries.places.internal.zzbem zzbemVar = (com.google.android.libraries.places.internal.zzbem) obj;
        if (this.zzd != zzbemVar.zzd) {
            return false;
        }
        long[] jArr = zzbemVar.zzc;
        for (int i = 0; i < this.zzd; i++) {
            if (this.zzc[i] != jArr[i]) {
                return false;
            }
        }
        return true;
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* synthetic */ java.lang.Object get(int i) {
        zzi(i);
        return java.lang.Long.valueOf(this.zzc[i]);
    }

    @Override // com.google.android.libraries.places.internal.zzbcb, java.util.AbstractList, java.util.Collection, java.util.List
    public final int hashCode() {
        int i = 1;
        for (int i2 = 0; i2 < this.zzd; i2++) {
            long j = this.zzc[i2];
            i = (i * 31) + ((int) (j ^ (j >>> 32)));
        }
        return i;
    }

    @Override // java.util.AbstractList, java.util.List
    public final int indexOf(java.lang.Object obj) {
        if (!(obj instanceof java.lang.Long)) {
            return -1;
        }
        long longValue = ((java.lang.Long) obj).longValue();
        int i = this.zzd;
        for (int i2 = 0; i2 < i; i2++) {
            if (this.zzc[i2] == longValue) {
                return i2;
            }
        }
        return -1;
    }

    @Override // com.google.android.libraries.places.internal.zzbcb, java.util.AbstractList, java.util.List
    public final /* synthetic */ java.lang.Object remove(int i) {
        zzbO();
        zzi(i);
        long[] jArr = this.zzc;
        long j = jArr[i];
        if (i < this.zzd - 1) {
            java.lang.System.arraycopy(jArr, i + 1, jArr, i, (r3 - i) - 1);
        }
        this.zzd--;
        this.modCount++;
        return java.lang.Long.valueOf(j);
    }

    @Override // java.util.AbstractList
    protected final void removeRange(int i, int i2) {
        zzbO();
        if (i2 < i) {
            throw new java.lang.IndexOutOfBoundsException("toIndex < fromIndex");
        }
        long[] jArr = this.zzc;
        java.lang.System.arraycopy(jArr, i2, jArr, i, this.zzd - i2);
        this.zzd -= i2 - i;
        this.modCount++;
    }

    @Override // com.google.android.libraries.places.internal.zzbcb, java.util.AbstractList, java.util.List
    public final /* synthetic */ java.lang.Object set(int i, java.lang.Object obj) {
        long longValue = ((java.lang.Long) obj).longValue();
        zzbO();
        zzi(i);
        long[] jArr = this.zzc;
        long j = jArr[i];
        jArr[i] = longValue;
        return java.lang.Long.valueOf(j);
    }

    @Override // com.google.android.libraries.places.internal.zzbea, com.google.android.libraries.places.internal.zzbds
    /* renamed from: zzc */
    public final com.google.android.libraries.places.internal.zzbdz zzg(int i) {
        if (i >= this.zzd) {
            return new com.google.android.libraries.places.internal.zzbem(i == 0 ? zza : java.util.Arrays.copyOf(this.zzc, i), this.zzd, true);
        }
        throw new java.lang.IllegalArgumentException();
    }

    public final long zze(int i) {
        zzi(i);
        return this.zzc[i];
    }

    public final void zzf(long j) {
        zzbO();
        int i = this.zzd;
        int length = this.zzc.length;
        if (i == length) {
            long[] jArr = new long[zzh(length)];
            java.lang.System.arraycopy(this.zzc, 0, jArr, 0, this.zzd);
            this.zzc = jArr;
        }
        long[] jArr2 = this.zzc;
        int i2 = this.zzd;
        this.zzd = i2 + 1;
        jArr2[i2] = j;
    }

    private zzbem(long[] jArr, int i, boolean z) {
        super(z);
        this.zzc = jArr;
        this.zzd = i;
    }

    @Override // com.google.android.libraries.places.internal.zzbcb, java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final /* synthetic */ boolean add(java.lang.Object obj) {
        zzf(((java.lang.Long) obj).longValue());
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.zzd;
    }

    public static com.google.android.libraries.places.internal.zzbem zzd() {
        return zzb;
    }
}
