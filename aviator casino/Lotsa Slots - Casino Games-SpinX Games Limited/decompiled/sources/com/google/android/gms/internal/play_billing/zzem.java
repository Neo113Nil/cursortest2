package com.google.android.gms.internal.play_billing;

/* compiled from: com.android.billingclient:billing@@7.0.0 */
/* loaded from: classes4.dex */
final class zzem extends com.google.android.gms.internal.play_billing.zzba implements java.util.RandomAccess {
    private static final com.google.android.gms.internal.play_billing.zzem zza = new com.google.android.gms.internal.play_billing.zzem(new java.lang.Object[0], 0, false);
    private java.lang.Object[] zzb;
    private int zzc;

    zzem() {
        this(new java.lang.Object[10], 0, true);
    }

    public static com.google.android.gms.internal.play_billing.zzem zze() {
        return zza;
    }

    private final java.lang.String zzf(int i) {
        return "Index:" + i + ", Size:" + this.zzc;
    }

    private final void zzg(int i) {
        if (i < 0 || i >= this.zzc) {
            throw new java.lang.IndexOutOfBoundsException(zzf(i));
        }
    }

    @Override // com.google.android.gms.internal.play_billing.zzba, java.util.AbstractList, java.util.List
    public final void add(int i, java.lang.Object obj) {
        int i2;
        zza();
        if (i < 0 || i > (i2 = this.zzc)) {
            throw new java.lang.IndexOutOfBoundsException(zzf(i));
        }
        int i3 = i + 1;
        java.lang.Object[] objArr = this.zzb;
        if (i2 < objArr.length) {
            java.lang.System.arraycopy(objArr, i, objArr, i3, i2 - i);
        } else {
            java.lang.Object[] objArr2 = new java.lang.Object[((i2 * 3) / 2) + 1];
            java.lang.System.arraycopy(objArr, 0, objArr2, 0, i);
            java.lang.System.arraycopy(this.zzb, i, objArr2, i3, this.zzc - i);
            this.zzb = objArr2;
        }
        this.zzb[i] = obj;
        this.zzc++;
        this.modCount++;
    }

    @Override // java.util.AbstractList, java.util.List
    public final java.lang.Object get(int i) {
        zzg(i);
        return this.zzb[i];
    }

    @Override // com.google.android.gms.internal.play_billing.zzba, java.util.AbstractList, java.util.List
    public final java.lang.Object remove(int i) {
        zza();
        zzg(i);
        java.lang.Object[] objArr = this.zzb;
        java.lang.Object obj = objArr[i];
        if (i < this.zzc - 1) {
            java.lang.System.arraycopy(objArr, i + 1, objArr, i, (r2 - i) - 1);
        }
        this.zzc--;
        this.modCount++;
        return obj;
    }

    @Override // com.google.android.gms.internal.play_billing.zzba, java.util.AbstractList, java.util.List
    public final java.lang.Object set(int i, java.lang.Object obj) {
        zza();
        zzg(i);
        java.lang.Object[] objArr = this.zzb;
        java.lang.Object obj2 = objArr[i];
        objArr[i] = obj;
        this.modCount++;
        return obj2;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.zzc;
    }

    @Override // com.google.android.gms.internal.play_billing.zzcz
    public final /* bridge */ /* synthetic */ com.google.android.gms.internal.play_billing.zzcz zzd(int i) {
        if (i >= this.zzc) {
            return new com.google.android.gms.internal.play_billing.zzem(java.util.Arrays.copyOf(this.zzb, i), this.zzc, true);
        }
        throw new java.lang.IllegalArgumentException();
    }

    private zzem(java.lang.Object[] objArr, int i, boolean z) {
        super(z);
        this.zzb = objArr;
        this.zzc = i;
    }

    @Override // com.google.android.gms.internal.play_billing.zzba, java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean add(java.lang.Object obj) {
        zza();
        int i = this.zzc;
        java.lang.Object[] objArr = this.zzb;
        if (i == objArr.length) {
            this.zzb = java.util.Arrays.copyOf(objArr, ((i * 3) / 2) + 1);
        }
        java.lang.Object[] objArr2 = this.zzb;
        int i2 = this.zzc;
        this.zzc = i2 + 1;
        objArr2[i2] = obj;
        this.modCount++;
        return true;
    }
}
