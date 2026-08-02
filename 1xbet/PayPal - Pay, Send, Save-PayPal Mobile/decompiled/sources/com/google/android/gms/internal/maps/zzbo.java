package com.google.android.gms.internal.maps;

/* loaded from: classes8.dex */
final class zzbo extends com.google.android.gms.internal.maps.zzbi {
    static final com.google.android.gms.internal.maps.zzbi zza = new com.google.android.gms.internal.maps.zzbo(new java.lang.Object[0], 0);
    final transient java.lang.Object[] zzb;
    private final transient int zzc;

    zzbo(java.lang.Object[] objArr, int i) {
        this.zzb = objArr;
        this.zzc = i;
    }

    @Override // java.util.List
    public final java.lang.Object get(int i) {
        com.google.android.gms.internal.maps.zzba.zza(i, this.zzc, "index");
        return java.util.Objects.requireNonNull(this.zzb[i]);
    }

    @Override // com.google.android.gms.internal.maps.zzbi, com.google.android.gms.internal.maps.zzbf
    final int zza(java.lang.Object[] objArr, int i) {
        java.lang.Object[] objArr2 = this.zzb;
        int i2 = this.zzc;
        java.lang.System.arraycopy(objArr2, 0, objArr, 0, i2);
        return i2;
    }

    @Override // com.google.android.gms.internal.maps.zzbf
    final int zzc() {
        return 0;
    }

    @Override // com.google.android.gms.internal.maps.zzbf
    final java.lang.Object[] zze() {
        return this.zzb;
    }

    @Override // com.google.android.gms.internal.maps.zzbf
    final int zzb() {
        return this.zzc;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.zzc;
    }
}
