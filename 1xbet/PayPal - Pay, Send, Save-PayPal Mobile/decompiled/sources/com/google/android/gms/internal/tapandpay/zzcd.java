package com.google.android.gms.internal.tapandpay;

/* loaded from: classes8.dex */
final class zzcd extends com.google.android.gms.internal.tapandpay.zzbz {
    static final com.google.android.gms.internal.tapandpay.zzcd zza;
    private static final java.lang.Object[] zzd;
    final transient java.lang.Object[] zzb;
    final transient java.lang.Object[] zzc;
    private final transient int zze;
    private final transient int zzf;
    private final transient int zzg;

    static {
        java.lang.Object[] objArr = new java.lang.Object[0];
        zzd = objArr;
        zza = new com.google.android.gms.internal.tapandpay.zzcd(objArr, 0, objArr, 0, 0);
    }

    zzcd(java.lang.Object[] objArr, int i, java.lang.Object[] objArr2, int i2, int i3) {
        this.zzb = objArr;
        this.zze = i;
        this.zzc = objArr2;
        this.zzf = i2;
        this.zzg = i3;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean contains(java.lang.Object obj) {
        if (obj != null) {
            java.lang.Object[] objArr = this.zzc;
            if (objArr.length != 0) {
                int zza2 = com.google.android.gms.internal.tapandpay.zzbu.zza(obj.hashCode());
                while (true) {
                    int i = zza2 & this.zzf;
                    java.lang.Object obj2 = objArr[i];
                    if (obj2 == null) {
                        return false;
                    }
                    if (obj2.equals(obj)) {
                        return true;
                    }
                    zza2 = i + 1;
                }
            }
        }
        return false;
    }

    @Override // com.google.android.gms.internal.tapandpay.zzbz, com.google.android.gms.internal.tapandpay.zzbv, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
    public final /* synthetic */ java.util.Iterator iterator() {
        return zzi().listIterator(0);
    }

    @Override // com.google.android.gms.internal.tapandpay.zzbz, com.google.android.gms.internal.tapandpay.zzbv
    /* renamed from: zza */
    public final com.google.android.gms.internal.tapandpay.zzcf iterator() {
        return zzi().listIterator(0);
    }

    @Override // com.google.android.gms.internal.tapandpay.zzbv
    final int zzc() {
        return 0;
    }

    @Override // com.google.android.gms.internal.tapandpay.zzbv
    final int zze(java.lang.Object[] objArr, int i) {
        java.lang.Object[] objArr2 = this.zzb;
        int i2 = this.zzg;
        java.lang.System.arraycopy(objArr2, 0, objArr, 0, i2);
        return i2;
    }

    @Override // com.google.android.gms.internal.tapandpay.zzbz
    final boolean zzh() {
        return true;
    }

    @Override // com.google.android.gms.internal.tapandpay.zzbz
    final com.google.android.gms.internal.tapandpay.zzby zzj() {
        return com.google.android.gms.internal.tapandpay.zzby.zzh(this.zzb, this.zzg);
    }

    @Override // com.google.android.gms.internal.tapandpay.zzbv
    final int zzd() {
        return this.zzg;
    }

    @Override // com.google.android.gms.internal.tapandpay.zzbv
    final java.lang.Object[] zzb() {
        return this.zzb;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        return this.zzg;
    }

    @Override // com.google.android.gms.internal.tapandpay.zzbz, java.util.Collection, java.util.Set
    public final int hashCode() {
        return this.zze;
    }
}
