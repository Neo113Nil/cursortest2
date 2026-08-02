package com.google.android.libraries.places.internal;

/* loaded from: classes4.dex */
final class zzbdr extends com.google.android.libraries.places.internal.zzbcb implements java.util.RandomAccess, com.google.android.libraries.places.internal.zzbdy, com.google.android.libraries.places.internal.zzbfg {
    private static final int[] zza;
    private static final com.google.android.libraries.places.internal.zzbdr zzb;
    private int[] zzc;
    private int zzd;

    static {
        int[] iArr = new int[0];
        zza = iArr;
        zzb = new com.google.android.libraries.places.internal.zzbdr(iArr, 0, false);
    }

    zzbdr() {
        this(zza, 0, true);
    }

    private static int zzi(int i) {
        return java.lang.Math.max(((i * 3) / 2) + 1, 10);
    }

    private final void zzj(int i) {
        if (i < 0 || i >= this.zzd) {
            throw new java.lang.IndexOutOfBoundsException(zzk(i));
        }
    }

    private final java.lang.String zzk(int i) {
        return com.google.android.libraries.places.internal.zzbce.zzb(this.zzd, i, (byte) 13, "Index:", ", Size:");
    }

    @Override // com.google.android.libraries.places.internal.zzbcb, java.util.AbstractList, java.util.List
    public final /* synthetic */ void add(int i, java.lang.Object obj) {
        int i2;
        int intValue = ((java.lang.Integer) obj).intValue();
        zzbO();
        if (i < 0 || i > (i2 = this.zzd)) {
            throw new java.lang.IndexOutOfBoundsException(zzk(i));
        }
        int i3 = i + 1;
        int[] iArr = this.zzc;
        int length = iArr.length;
        if (i2 < length) {
            java.lang.System.arraycopy(iArr, i, iArr, i3, i2 - i);
        } else {
            int[] iArr2 = new int[zzi(length)];
            java.lang.System.arraycopy(this.zzc, 0, iArr2, 0, i);
            java.lang.System.arraycopy(this.zzc, i, iArr2, i3, this.zzd - i);
            this.zzc = iArr2;
        }
        this.zzc[i] = intValue;
        this.zzd++;
        this.modCount++;
    }

    @Override // com.google.android.libraries.places.internal.zzbcb, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean addAll(java.util.Collection collection) {
        zzbO();
        if (!(collection instanceof com.google.android.libraries.places.internal.zzbdr)) {
            return super.addAll(collection);
        }
        com.google.android.libraries.places.internal.zzbdr zzbdrVar = (com.google.android.libraries.places.internal.zzbdr) collection;
        int i = zzbdrVar.zzd;
        if (i == 0) {
            return false;
        }
        int i2 = this.zzd;
        if (Integer.MAX_VALUE - i2 < i) {
            throw new java.lang.OutOfMemoryError();
        }
        int i3 = i2 + i;
        int[] iArr = this.zzc;
        if (i3 > iArr.length) {
            this.zzc = java.util.Arrays.copyOf(iArr, i3);
        }
        java.lang.System.arraycopy(zzbdrVar.zzc, 0, this.zzc, this.zzd, zzbdrVar.zzd);
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
        if (!(obj instanceof com.google.android.libraries.places.internal.zzbdr)) {
            return super.equals(obj);
        }
        com.google.android.libraries.places.internal.zzbdr zzbdrVar = (com.google.android.libraries.places.internal.zzbdr) obj;
        if (this.zzd != zzbdrVar.zzd) {
            return false;
        }
        int[] iArr = zzbdrVar.zzc;
        for (int i = 0; i < this.zzd; i++) {
            if (this.zzc[i] != iArr[i]) {
                return false;
            }
        }
        return true;
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* synthetic */ java.lang.Object get(int i) {
        zzj(i);
        return java.lang.Integer.valueOf(this.zzc[i]);
    }

    @Override // com.google.android.libraries.places.internal.zzbcb, java.util.AbstractList, java.util.Collection, java.util.List
    public final int hashCode() {
        int i = 1;
        for (int i2 = 0; i2 < this.zzd; i2++) {
            i = (i * 31) + this.zzc[i2];
        }
        return i;
    }

    @Override // java.util.AbstractList, java.util.List
    public final int indexOf(java.lang.Object obj) {
        if (!(obj instanceof java.lang.Integer)) {
            return -1;
        }
        int intValue = ((java.lang.Integer) obj).intValue();
        int i = this.zzd;
        for (int i2 = 0; i2 < i; i2++) {
            if (this.zzc[i2] == intValue) {
                return i2;
            }
        }
        return -1;
    }

    @Override // com.google.android.libraries.places.internal.zzbcb, java.util.AbstractList, java.util.List
    public final /* synthetic */ java.lang.Object remove(int i) {
        zzbO();
        zzj(i);
        int[] iArr = this.zzc;
        int i2 = iArr[i];
        if (i < this.zzd - 1) {
            java.lang.System.arraycopy(iArr, i + 1, iArr, i, (r2 - i) - 1);
        }
        this.zzd--;
        this.modCount++;
        return java.lang.Integer.valueOf(i2);
    }

    @Override // java.util.AbstractList
    protected final void removeRange(int i, int i2) {
        zzbO();
        if (i2 < i) {
            throw new java.lang.IndexOutOfBoundsException("toIndex < fromIndex");
        }
        int[] iArr = this.zzc;
        java.lang.System.arraycopy(iArr, i2, iArr, i, this.zzd - i2);
        this.zzd -= i2 - i;
        this.modCount++;
    }

    @Override // com.google.android.libraries.places.internal.zzbcb, java.util.AbstractList, java.util.List
    public final /* synthetic */ java.lang.Object set(int i, java.lang.Object obj) {
        int intValue = ((java.lang.Integer) obj).intValue();
        zzbO();
        zzj(i);
        int[] iArr = this.zzc;
        int i2 = iArr[i];
        iArr[i] = intValue;
        return java.lang.Integer.valueOf(i2);
    }

    @Override // com.google.android.libraries.places.internal.zzbea, com.google.android.libraries.places.internal.zzbds
    /* renamed from: zze */
    public final com.google.android.libraries.places.internal.zzbdy zzg(int i) {
        if (i >= this.zzd) {
            return new com.google.android.libraries.places.internal.zzbdr(i == 0 ? zza : java.util.Arrays.copyOf(this.zzc, i), this.zzd, true);
        }
        throw new java.lang.IllegalArgumentException();
    }

    public final int zzf(int i) {
        zzj(i);
        return this.zzc[i];
    }

    @Override // com.google.android.libraries.places.internal.zzbdy
    public final void zzh(int i) {
        zzbO();
        int i2 = this.zzd;
        int length = this.zzc.length;
        if (i2 == length) {
            int[] iArr = new int[zzi(length)];
            java.lang.System.arraycopy(this.zzc, 0, iArr, 0, this.zzd);
            this.zzc = iArr;
        }
        int[] iArr2 = this.zzc;
        int i3 = this.zzd;
        this.zzd = i3 + 1;
        iArr2[i3] = i;
    }

    private zzbdr(int[] iArr, int i, boolean z) {
        super(z);
        this.zzc = iArr;
        this.zzd = i;
    }

    @Override // com.google.android.libraries.places.internal.zzbcb, java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final /* synthetic */ boolean add(java.lang.Object obj) {
        zzh(((java.lang.Integer) obj).intValue());
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.zzd;
    }

    public static com.google.android.libraries.places.internal.zzbdr zzd() {
        return zzb;
    }
}
