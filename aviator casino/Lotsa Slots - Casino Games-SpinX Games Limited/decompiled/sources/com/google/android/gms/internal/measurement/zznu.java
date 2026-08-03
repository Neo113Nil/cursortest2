package com.google.android.gms.internal.measurement;

/* compiled from: com.google.android.gms:play-services-measurement-base@@22.5.0 */
/* loaded from: classes4.dex */
final class zznu extends com.google.android.gms.internal.measurement.zzkt implements java.util.RandomAccess {
    private static final java.lang.Object[] zza;
    private static final com.google.android.gms.internal.measurement.zznu zzb;
    private java.lang.Object[] zzc;
    private int zzd;

    static {
        java.lang.Object[] objArr = new java.lang.Object[0];
        zza = objArr;
        zzb = new com.google.android.gms.internal.measurement.zznu(objArr, 0, false);
    }

    zznu() {
        this(zza, 0, true);
    }

    public static com.google.android.gms.internal.measurement.zznu zzd() {
        return zzb;
    }

    private static int zzf(int i) {
        return java.lang.Math.max(((i * 3) / 2) + 1, 10);
    }

    private final void zzh(int i) {
        if (i < 0 || i >= this.zzd) {
            throw new java.lang.IndexOutOfBoundsException(zzi(i));
        }
    }

    private final java.lang.String zzi(int i) {
        return com.google.android.gms.internal.measurement.zzkv.zza(this.zzd, i, com.google.common.base.Ascii.CR, "Index:", ", Size:");
    }

    @Override // com.google.android.gms.internal.measurement.zzkt, java.util.AbstractList, java.util.List
    public final void add(int i, java.lang.Object obj) {
        int i2;
        zzcF();
        if (i < 0 || i > (i2 = this.zzd)) {
            throw new java.lang.IndexOutOfBoundsException(zzi(i));
        }
        int i3 = i + 1;
        java.lang.Object[] objArr = this.zzc;
        int length = objArr.length;
        if (i2 < length) {
            java.lang.System.arraycopy(objArr, i, objArr, i3, i2 - i);
        } else {
            java.lang.Object[] objArr2 = new java.lang.Object[zzf(length)];
            java.lang.System.arraycopy(this.zzc, 0, objArr2, 0, i);
            java.lang.System.arraycopy(this.zzc, i, objArr2, i3, this.zzd - i);
            this.zzc = objArr2;
        }
        this.zzc[i] = obj;
        this.zzd++;
        this.modCount++;
    }

    @Override // java.util.AbstractList, java.util.List
    public final java.lang.Object get(int i) {
        zzh(i);
        return this.zzc[i];
    }

    @Override // com.google.android.gms.internal.measurement.zzkt, java.util.AbstractList, java.util.List
    public final java.lang.Object remove(int i) {
        zzcF();
        zzh(i);
        java.lang.Object[] objArr = this.zzc;
        java.lang.Object obj = objArr[i];
        if (i < this.zzd - 1) {
            java.lang.System.arraycopy(objArr, i + 1, objArr, i, (r2 - i) - 1);
        }
        this.zzd--;
        this.modCount++;
        return obj;
    }

    @Override // com.google.android.gms.internal.measurement.zzkt, java.util.AbstractList, java.util.List
    public final java.lang.Object set(int i, java.lang.Object obj) {
        zzcF();
        zzh(i);
        java.lang.Object[] objArr = this.zzc;
        java.lang.Object obj2 = objArr[i];
        objArr[i] = obj;
        this.modCount++;
        return obj2;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.zzd;
    }

    final void zze(int i) {
        int length = this.zzc.length;
        if (i <= length) {
            return;
        }
        if (length == 0) {
            this.zzc = new java.lang.Object[java.lang.Math.max(i, 10)];
            return;
        }
        while (length < i) {
            length = zzf(length);
        }
        this.zzc = java.util.Arrays.copyOf(this.zzc, length);
    }

    @Override // com.google.android.gms.internal.measurement.zzmn
    public final /* bridge */ /* synthetic */ com.google.android.gms.internal.measurement.zzmn zzg(int i) {
        if (i >= this.zzd) {
            return new com.google.android.gms.internal.measurement.zznu(i == 0 ? zza : java.util.Arrays.copyOf(this.zzc, i), this.zzd, true);
        }
        throw new java.lang.IllegalArgumentException();
    }

    private zznu(java.lang.Object[] objArr, int i, boolean z) {
        super(z);
        this.zzc = objArr;
        this.zzd = i;
    }

    @Override // com.google.android.gms.internal.measurement.zzkt, java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean add(java.lang.Object obj) {
        zzcF();
        int i = this.zzd;
        int length = this.zzc.length;
        if (i == length) {
            this.zzc = java.util.Arrays.copyOf(this.zzc, zzf(length));
        }
        java.lang.Object[] objArr = this.zzc;
        int i2 = this.zzd;
        this.zzd = i2 + 1;
        objArr[i2] = obj;
        this.modCount++;
        return true;
    }
}
