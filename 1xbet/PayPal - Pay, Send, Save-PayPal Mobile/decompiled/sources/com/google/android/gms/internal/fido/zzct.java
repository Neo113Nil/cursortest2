package com.google.android.gms.internal.fido;

/* loaded from: classes8.dex */
final class zzct extends com.google.android.gms.internal.fido.zzcc {
    static final com.google.android.gms.internal.fido.zzcc zza = new com.google.android.gms.internal.fido.zzct(new java.lang.Object[0], 0);
    final transient java.lang.Object[] zzb;
    private final transient int zzc;

    zzct(java.lang.Object[] objArr, int i) {
        this.zzb = objArr;
        this.zzc = i;
    }

    @Override // java.util.List
    public final java.lang.Object get(int i) {
        com.google.android.gms.internal.fido.zzbm.zza(i, this.zzc, "index");
        return java.util.Objects.requireNonNull(this.zzb[i]);
    }

    @Override // com.google.android.gms.internal.fido.zzcc, com.google.android.gms.internal.fido.zzby
    final int zza(java.lang.Object[] objArr, int i) {
        java.lang.System.arraycopy(this.zzb, 0, objArr, 0, this.zzc);
        return this.zzc;
    }

    @Override // com.google.android.gms.internal.fido.zzby
    final int zzc() {
        return 0;
    }

    @Override // com.google.android.gms.internal.fido.zzby
    final java.lang.Object[] zze() {
        return this.zzb;
    }

    @Override // com.google.android.gms.internal.fido.zzby
    final int zzb() {
        return this.zzc;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.zzc;
    }
}
