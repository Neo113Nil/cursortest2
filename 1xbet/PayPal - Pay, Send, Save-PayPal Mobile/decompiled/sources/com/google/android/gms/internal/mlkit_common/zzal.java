package com.google.android.gms.internal.mlkit_common;

/* loaded from: classes8.dex */
final class zzal extends com.google.android.gms.internal.mlkit_common.zzaf {
    static final com.google.android.gms.internal.mlkit_common.zzaf zza = new com.google.android.gms.internal.mlkit_common.zzal(new java.lang.Object[0], 0);
    final transient java.lang.Object[] zzb;
    private final transient int zzc;

    zzal(java.lang.Object[] objArr, int i) {
        this.zzb = objArr;
        this.zzc = i;
    }

    @Override // java.util.List
    public final java.lang.Object get(int i) {
        com.google.android.gms.internal.mlkit_common.zzt.zza(i, this.zzc, "index");
        return java.util.Objects.requireNonNull(this.zzb[i]);
    }

    @Override // com.google.android.gms.internal.mlkit_common.zzaf, com.google.android.gms.internal.mlkit_common.zzab
    final int zza(java.lang.Object[] objArr, int i) {
        java.lang.System.arraycopy(this.zzb, 0, objArr, 0, this.zzc);
        return this.zzc;
    }

    @Override // com.google.android.gms.internal.mlkit_common.zzab
    final int zzc() {
        return 0;
    }

    @Override // com.google.android.gms.internal.mlkit_common.zzab
    final java.lang.Object[] zze() {
        return this.zzb;
    }

    @Override // com.google.android.gms.internal.mlkit_common.zzab
    final int zzb() {
        return this.zzc;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.zzc;
    }
}
