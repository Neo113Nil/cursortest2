package com.google.android.gms.internal.identity;

/* loaded from: classes8.dex */
final class zzey extends com.google.android.gms.internal.identity.zzex {
    static final com.google.android.gms.internal.identity.zzex zza = new com.google.android.gms.internal.identity.zzey(new java.lang.Object[0], 0);
    final transient java.lang.Object[] zzb;
    private final transient int zzc;

    zzey(java.lang.Object[] objArr, int i) {
        this.zzb = objArr;
        this.zzc = i;
    }

    @Override // java.util.List
    public final java.lang.Object get(int i) {
        com.google.android.gms.internal.identity.zzer.zzc(i, this.zzc, "index");
        return java.util.Objects.requireNonNull(this.zzb[i]);
    }

    @Override // com.google.android.gms.internal.identity.zzeu
    final int zzc() {
        return 0;
    }

    @Override // com.google.android.gms.internal.identity.zzeu
    final boolean zzf() {
        return false;
    }

    @Override // com.google.android.gms.internal.identity.zzex, com.google.android.gms.internal.identity.zzeu
    final int zzg(java.lang.Object[] objArr, int i) {
        java.lang.System.arraycopy(this.zzb, 0, objArr, 0, this.zzc);
        return this.zzc;
    }

    @Override // com.google.android.gms.internal.identity.zzeu
    final int zzd() {
        return this.zzc;
    }

    @Override // com.google.android.gms.internal.identity.zzeu
    final java.lang.Object[] zzb() {
        return this.zzb;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.zzc;
    }
}
