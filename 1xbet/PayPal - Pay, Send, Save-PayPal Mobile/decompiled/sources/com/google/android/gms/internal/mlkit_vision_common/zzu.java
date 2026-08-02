package com.google.android.gms.internal.mlkit_vision_common;

/* loaded from: classes8.dex */
final class zzu extends com.google.android.gms.internal.mlkit_vision_common.zzp {
    static final com.google.android.gms.internal.mlkit_vision_common.zzp zza = new com.google.android.gms.internal.mlkit_vision_common.zzu(new java.lang.Object[0], 0);
    final transient java.lang.Object[] zzb;
    private final transient int zzc;

    zzu(java.lang.Object[] objArr, int i) {
        this.zzb = objArr;
        this.zzc = i;
    }

    @Override // java.util.List
    public final java.lang.Object get(int i) {
        com.google.android.gms.internal.mlkit_vision_common.zzf.zza(i, this.zzc, "index");
        java.lang.Object obj = this.zzb[i];
        obj.getClass();
        return obj;
    }

    @Override // com.google.android.gms.internal.mlkit_vision_common.zzp, com.google.android.gms.internal.mlkit_vision_common.zzl
    final int zza(java.lang.Object[] objArr, int i) {
        java.lang.System.arraycopy(this.zzb, 0, objArr, 0, this.zzc);
        return this.zzc;
    }

    @Override // com.google.android.gms.internal.mlkit_vision_common.zzl
    final int zzc() {
        return 0;
    }

    @Override // com.google.android.gms.internal.mlkit_vision_common.zzl
    final java.lang.Object[] zze() {
        return this.zzb;
    }

    @Override // com.google.android.gms.internal.mlkit_vision_common.zzl
    final int zzb() {
        return this.zzc;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.zzc;
    }
}
