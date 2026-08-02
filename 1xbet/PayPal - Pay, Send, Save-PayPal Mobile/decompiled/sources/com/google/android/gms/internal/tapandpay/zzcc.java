package com.google.android.gms.internal.tapandpay;

/* loaded from: classes8.dex */
final class zzcc extends com.google.android.gms.internal.tapandpay.zzby {
    static final com.google.android.gms.internal.tapandpay.zzby zza = new com.google.android.gms.internal.tapandpay.zzcc(new java.lang.Object[0], 0);
    final transient java.lang.Object[] zzb;
    private final transient int zzc;

    zzcc(java.lang.Object[] objArr, int i) {
        this.zzb = objArr;
        this.zzc = i;
    }

    @Override // java.util.List
    public final java.lang.Object get(int i) {
        com.google.android.gms.internal.tapandpay.zzbr.zza(i, this.zzc, "index");
        return java.util.Objects.requireNonNull(this.zzb[i]);
    }

    @Override // com.google.android.gms.internal.tapandpay.zzbv
    final int zzc() {
        return 0;
    }

    @Override // com.google.android.gms.internal.tapandpay.zzby, com.google.android.gms.internal.tapandpay.zzbv
    final int zze(java.lang.Object[] objArr, int i) {
        java.lang.Object[] objArr2 = this.zzb;
        int i2 = this.zzc;
        java.lang.System.arraycopy(objArr2, 0, objArr, 0, i2);
        return i2;
    }

    @Override // com.google.android.gms.internal.tapandpay.zzbv
    final int zzd() {
        return this.zzc;
    }

    @Override // com.google.android.gms.internal.tapandpay.zzbv
    final java.lang.Object[] zzb() {
        return this.zzb;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.zzc;
    }
}
