package com.google.android.libraries.places.internal;

/* loaded from: classes4.dex */
final class zzbcd extends com.google.android.libraries.places.internal.zzbcb implements java.util.RandomAccess, com.google.android.libraries.places.internal.zzbds, com.google.android.libraries.places.internal.zzbfg {
    private static final boolean[] zza;
    private boolean[] zzb;
    private int zzc;

    static {
        boolean[] zArr = new boolean[0];
        zza = zArr;
        new com.google.android.libraries.places.internal.zzbcd(zArr, 0, false);
    }

    zzbcd() {
        this(zza, 0, true);
    }

    private static int zzh(int i) {
        return java.lang.Math.max(((i * 3) / 2) + 1, 10);
    }

    private final void zzi(int i) {
        if (i < 0 || i >= this.zzc) {
            throw new java.lang.IndexOutOfBoundsException(zzj(i));
        }
    }

    private final java.lang.String zzj(int i) {
        return com.google.android.libraries.places.internal.zzbce.zzb(this.zzc, i, (byte) 13, "Index:", ", Size:");
    }

    @Override // com.google.android.libraries.places.internal.zzbcb, java.util.AbstractList, java.util.List
    public final /* synthetic */ void add(int i, java.lang.Object obj) {
        int i2;
        boolean booleanValue = ((java.lang.Boolean) obj).booleanValue();
        zzbO();
        if (i < 0 || i > (i2 = this.zzc)) {
            throw new java.lang.IndexOutOfBoundsException(zzj(i));
        }
        int i3 = i + 1;
        boolean[] zArr = this.zzb;
        int length = zArr.length;
        if (i2 < length) {
            java.lang.System.arraycopy(zArr, i, zArr, i3, i2 - i);
        } else {
            boolean[] zArr2 = new boolean[zzh(length)];
            java.lang.System.arraycopy(this.zzb, 0, zArr2, 0, i);
            java.lang.System.arraycopy(this.zzb, i, zArr2, i3, this.zzc - i);
            this.zzb = zArr2;
        }
        this.zzb[i] = booleanValue;
        this.zzc++;
        this.modCount++;
    }

    @Override // com.google.android.libraries.places.internal.zzbcb, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean addAll(java.util.Collection collection) {
        zzbO();
        if (!(collection instanceof com.google.android.libraries.places.internal.zzbcd)) {
            return super.addAll(collection);
        }
        com.google.android.libraries.places.internal.zzbcd zzbcdVar = (com.google.android.libraries.places.internal.zzbcd) collection;
        int i = zzbcdVar.zzc;
        if (i == 0) {
            return false;
        }
        int i2 = this.zzc;
        if (Integer.MAX_VALUE - i2 < i) {
            throw new java.lang.OutOfMemoryError();
        }
        int i3 = i2 + i;
        boolean[] zArr = this.zzb;
        if (i3 > zArr.length) {
            this.zzb = java.util.Arrays.copyOf(zArr, i3);
        }
        java.lang.System.arraycopy(zzbcdVar.zzb, 0, this.zzb, this.zzc, zzbcdVar.zzc);
        this.zzc = i3;
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
        if (!(obj instanceof com.google.android.libraries.places.internal.zzbcd)) {
            return super.equals(obj);
        }
        com.google.android.libraries.places.internal.zzbcd zzbcdVar = (com.google.android.libraries.places.internal.zzbcd) obj;
        if (this.zzc != zzbcdVar.zzc) {
            return false;
        }
        boolean[] zArr = zzbcdVar.zzb;
        for (int i = 0; i < this.zzc; i++) {
            if (this.zzb[i] != zArr[i]) {
                return false;
            }
        }
        return true;
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* synthetic */ java.lang.Object get(int i) {
        zzi(i);
        return java.lang.Boolean.valueOf(this.zzb[i]);
    }

    @Override // com.google.android.libraries.places.internal.zzbcb, java.util.AbstractList, java.util.Collection, java.util.List
    public final int hashCode() {
        int i = 1;
        for (int i2 = 0; i2 < this.zzc; i2++) {
            i = (i * 31) + com.google.android.libraries.places.internal.zzbeb.zza(this.zzb[i2]);
        }
        return i;
    }

    @Override // java.util.AbstractList, java.util.List
    public final int indexOf(java.lang.Object obj) {
        if (!(obj instanceof java.lang.Boolean)) {
            return -1;
        }
        boolean booleanValue = ((java.lang.Boolean) obj).booleanValue();
        int i = this.zzc;
        for (int i2 = 0; i2 < i; i2++) {
            if (this.zzb[i2] == booleanValue) {
                return i2;
            }
        }
        return -1;
    }

    @Override // com.google.android.libraries.places.internal.zzbcb, java.util.AbstractList, java.util.List
    public final /* synthetic */ java.lang.Object remove(int i) {
        zzbO();
        zzi(i);
        boolean[] zArr = this.zzb;
        boolean z = zArr[i];
        if (i < this.zzc - 1) {
            java.lang.System.arraycopy(zArr, i + 1, zArr, i, (r2 - i) - 1);
        }
        this.zzc--;
        this.modCount++;
        return java.lang.Boolean.valueOf(z);
    }

    @Override // java.util.AbstractList
    protected final void removeRange(int i, int i2) {
        zzbO();
        if (i2 < i) {
            throw new java.lang.IndexOutOfBoundsException("toIndex < fromIndex");
        }
        boolean[] zArr = this.zzb;
        java.lang.System.arraycopy(zArr, i2, zArr, i, this.zzc - i2);
        this.zzc -= i2 - i;
        this.modCount++;
    }

    @Override // com.google.android.libraries.places.internal.zzbcb, java.util.AbstractList, java.util.List
    public final /* synthetic */ java.lang.Object set(int i, java.lang.Object obj) {
        boolean booleanValue = ((java.lang.Boolean) obj).booleanValue();
        zzbO();
        zzi(i);
        boolean[] zArr = this.zzb;
        boolean z = zArr[i];
        zArr[i] = booleanValue;
        return java.lang.Boolean.valueOf(z);
    }

    @Override // com.google.android.libraries.places.internal.zzbea, com.google.android.libraries.places.internal.zzbds
    /* renamed from: zzd */
    public final com.google.android.libraries.places.internal.zzbds zzg(int i) {
        if (i >= this.zzc) {
            return new com.google.android.libraries.places.internal.zzbcd(i == 0 ? zza : java.util.Arrays.copyOf(this.zzb, i), this.zzc, true);
        }
        throw new java.lang.IllegalArgumentException();
    }

    public final boolean zze(int i) {
        zzi(i);
        return this.zzb[i];
    }

    public final void zzf(boolean z) {
        zzbO();
        int i = this.zzc;
        int length = this.zzb.length;
        if (i == length) {
            boolean[] zArr = new boolean[zzh(length)];
            java.lang.System.arraycopy(this.zzb, 0, zArr, 0, this.zzc);
            this.zzb = zArr;
        }
        boolean[] zArr2 = this.zzb;
        int i2 = this.zzc;
        this.zzc = i2 + 1;
        zArr2[i2] = z;
    }

    private zzbcd(boolean[] zArr, int i, boolean z) {
        super(z);
        this.zzb = zArr;
        this.zzc = i;
    }

    @Override // com.google.android.libraries.places.internal.zzbcb, java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final /* synthetic */ boolean add(java.lang.Object obj) {
        zzf(((java.lang.Boolean) obj).booleanValue());
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.zzc;
    }
}
