package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads-api@@25.2.0 */
/* loaded from: classes4.dex */
final class zzicq extends com.google.android.gms.internal.ads.zzicm implements java.util.RandomAccess, com.google.android.gms.internal.ads.zzieg, com.google.android.gms.internal.ads.zzify {
    private static final boolean[] zza;
    private static final com.google.android.gms.internal.ads.zzicq zzb;
    private boolean[] zzc;
    private int zzd;

    static {
        boolean[] zArr = new boolean[0];
        zza = zArr;
        zzb = new com.google.android.gms.internal.ads.zzicq(zArr, 0, false);
    }

    zzicq() {
        this(zza, 0, true);
    }

    public static com.google.android.gms.internal.ads.zzicq zzd() {
        return zzb;
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
        int i2 = this.zzd;
        java.lang.StringBuilder sb = new java.lang.StringBuilder(java.lang.String.valueOf(i).length() + 13 + java.lang.String.valueOf(i2).length());
        sb.append("Index:");
        sb.append(i);
        sb.append(", Size:");
        sb.append(i2);
        return sb.toString();
    }

    @Override // com.google.android.gms.internal.ads.zzicm, java.util.AbstractList, java.util.List
    public final /* synthetic */ void add(int i, java.lang.Object obj) {
        int i2;
        boolean booleanValue = ((java.lang.Boolean) obj).booleanValue();
        zzdW();
        if (i < 0 || i > (i2 = this.zzd)) {
            throw new java.lang.IndexOutOfBoundsException(zzk(i));
        }
        int i3 = i + 1;
        boolean[] zArr = this.zzc;
        int length = zArr.length;
        if (i2 < length) {
            java.lang.System.arraycopy(zArr, i, zArr, i3, i2 - i);
        } else {
            boolean[] zArr2 = new boolean[zzi(length)];
            java.lang.System.arraycopy(this.zzc, 0, zArr2, 0, i);
            java.lang.System.arraycopy(this.zzc, i, zArr2, i3, this.zzd - i);
            this.zzc = zArr2;
        }
        this.zzc[i] = booleanValue;
        this.zzd++;
        this.modCount++;
    }

    @Override // com.google.android.gms.internal.ads.zzicm, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean addAll(java.util.Collection collection) {
        zzdW();
        collection.getClass();
        if (!(collection instanceof com.google.android.gms.internal.ads.zzicq)) {
            return super.addAll(collection);
        }
        com.google.android.gms.internal.ads.zzicq zzicqVar = (com.google.android.gms.internal.ads.zzicq) collection;
        int i = zzicqVar.zzd;
        if (i == 0) {
            return false;
        }
        int i2 = this.zzd;
        if (Integer.MAX_VALUE - i2 < i) {
            throw new java.lang.OutOfMemoryError();
        }
        int i3 = i2 + i;
        boolean[] zArr = this.zzc;
        if (i3 > zArr.length) {
            this.zzc = java.util.Arrays.copyOf(zArr, i3);
        }
        java.lang.System.arraycopy(zzicqVar.zzc, 0, this.zzc, this.zzd, zzicqVar.zzd);
        this.zzd = i3;
        this.modCount++;
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean contains(java.lang.Object obj) {
        return indexOf(obj) != -1;
    }

    @Override // com.google.android.gms.internal.ads.zzicm, java.util.AbstractList, java.util.Collection, java.util.List
    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof com.google.android.gms.internal.ads.zzicq)) {
            return super.equals(obj);
        }
        com.google.android.gms.internal.ads.zzicq zzicqVar = (com.google.android.gms.internal.ads.zzicq) obj;
        if (this.zzd != zzicqVar.zzd) {
            return false;
        }
        boolean[] zArr = zzicqVar.zzc;
        for (int i = 0; i < this.zzd; i++) {
            if (this.zzc[i] != zArr[i]) {
                return false;
            }
        }
        return true;
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* synthetic */ java.lang.Object get(int i) {
        zzj(i);
        return java.lang.Boolean.valueOf(this.zzc[i]);
    }

    @Override // com.google.android.gms.internal.ads.zzicm, java.util.AbstractList, java.util.Collection, java.util.List
    public final int hashCode() {
        int i = 1;
        for (int i2 = 0; i2 < this.zzd; i2++) {
            i = (i * 31) + com.google.android.gms.internal.ads.zzier.zza(this.zzc[i2]);
        }
        return i;
    }

    @Override // java.util.AbstractList, java.util.List
    public final int indexOf(java.lang.Object obj) {
        if (!(obj instanceof java.lang.Boolean)) {
            return -1;
        }
        boolean booleanValue = ((java.lang.Boolean) obj).booleanValue();
        int i = this.zzd;
        for (int i2 = 0; i2 < i; i2++) {
            if (this.zzc[i2] == booleanValue) {
                return i2;
            }
        }
        return -1;
    }

    @Override // com.google.android.gms.internal.ads.zzicm, java.util.AbstractList, java.util.List
    public final /* bridge */ /* synthetic */ java.lang.Object remove(int i) {
        zzdW();
        zzj(i);
        boolean[] zArr = this.zzc;
        boolean z = zArr[i];
        if (i < this.zzd - 1) {
            java.lang.System.arraycopy(zArr, i + 1, zArr, i, (r2 - i) - 1);
        }
        this.zzd--;
        this.modCount++;
        return java.lang.Boolean.valueOf(z);
    }

    @Override // java.util.AbstractList
    protected final void removeRange(int i, int i2) {
        zzdW();
        if (i2 < i) {
            throw new java.lang.IndexOutOfBoundsException("toIndex < fromIndex");
        }
        boolean[] zArr = this.zzc;
        java.lang.System.arraycopy(zArr, i2, zArr, i, this.zzd - i2);
        this.zzd -= i2 - i;
        this.modCount++;
    }

    @Override // com.google.android.gms.internal.ads.zzicm, java.util.AbstractList, java.util.List
    public final /* bridge */ /* synthetic */ java.lang.Object set(int i, java.lang.Object obj) {
        boolean booleanValue = ((java.lang.Boolean) obj).booleanValue();
        zzdW();
        zzj(i);
        boolean[] zArr = this.zzc;
        boolean z = zArr[i];
        zArr[i] = booleanValue;
        return java.lang.Boolean.valueOf(z);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.zzd;
    }

    @Override // com.google.android.gms.internal.ads.zzieq
    /* renamed from: zze, reason: merged with bridge method [inline-methods] */
    public final com.google.android.gms.internal.ads.zzieg zzh(int i) {
        if (i >= this.zzd) {
            return new com.google.android.gms.internal.ads.zzicq(i == 0 ? zza : java.util.Arrays.copyOf(this.zzc, i), this.zzd, true);
        }
        throw new java.lang.IllegalArgumentException();
    }

    public final boolean zzf(int i) {
        zzj(i);
        return this.zzc[i];
    }

    public final void zzg(boolean z) {
        zzdW();
        int i = this.zzd;
        int length = this.zzc.length;
        if (i == length) {
            boolean[] zArr = new boolean[zzi(length)];
            java.lang.System.arraycopy(this.zzc, 0, zArr, 0, this.zzd);
            this.zzc = zArr;
        }
        boolean[] zArr2 = this.zzc;
        int i2 = this.zzd;
        this.zzd = i2 + 1;
        zArr2[i2] = z;
    }

    private zzicq(boolean[] zArr, int i, boolean z) {
        super(z);
        this.zzc = zArr;
        this.zzd = i;
    }

    @Override // com.google.android.gms.internal.ads.zzicm, java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final /* bridge */ /* synthetic */ boolean add(java.lang.Object obj) {
        zzg(((java.lang.Boolean) obj).booleanValue());
        return true;
    }
}
