package com.google.android.gms.internal.identity_googleid;

/* loaded from: classes8.dex */
final class zzk extends com.google.android.gms.internal.identity_googleid.zzj {
    static final com.google.android.gms.internal.identity_googleid.zzj zza = new com.google.android.gms.internal.identity_googleid.zzk(new java.lang.Object[0], 0);
    final transient java.lang.Object[] zzb;
    private final transient int zzc;

    zzk(java.lang.Object[] objArr, int i) {
        this.zzb = objArr;
        this.zzc = i;
    }

    @Override // java.util.List
    public final java.lang.Object get(int i) {
        com.google.android.gms.internal.identity_googleid.zza.zza(i, this.zzc, "index");
        return java.util.Objects.requireNonNull(this.zzb[i]);
    }

    @Override // com.google.android.gms.internal.identity_googleid.zzj, com.google.android.gms.internal.identity_googleid.zzf
    final int zza(java.lang.Object[] objArr, int i) {
        java.lang.Object[] objArr2 = this.zzb;
        int i2 = this.zzc;
        java.lang.System.arraycopy(objArr2, 0, objArr, 0, i2);
        return i2;
    }

    @Override // com.google.android.gms.internal.identity_googleid.zzf
    final int zzc() {
        return 0;
    }

    @Override // com.google.android.gms.internal.identity_googleid.zzf
    final java.lang.Object[] zze() {
        return this.zzb;
    }

    @Override // com.google.android.gms.internal.identity_googleid.zzf
    final int zzb() {
        return this.zzc;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.zzc;
    }
}
