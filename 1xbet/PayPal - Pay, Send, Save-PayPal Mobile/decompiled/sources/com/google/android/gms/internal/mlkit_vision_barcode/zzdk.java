package com.google.android.gms.internal.mlkit_vision_barcode;

/* loaded from: classes8.dex */
final class zzdk extends com.google.android.gms.internal.mlkit_vision_barcode.zzcs {
    static final com.google.android.gms.internal.mlkit_vision_barcode.zzcs zza = new com.google.android.gms.internal.mlkit_vision_barcode.zzdk(new java.lang.Object[0], 0);
    final transient java.lang.Object[] zzb;
    private final transient int zzc;

    zzdk(java.lang.Object[] objArr, int i) {
        this.zzb = objArr;
        this.zzc = i;
    }

    @Override // java.util.List
    public final java.lang.Object get(int i) {
        com.google.android.gms.internal.mlkit_vision_barcode.zzaz.zza(i, this.zzc, "index");
        return java.util.Objects.requireNonNull(this.zzb[i]);
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode.zzcs, com.google.android.gms.internal.mlkit_vision_barcode.zzcn
    final int zza(java.lang.Object[] objArr, int i) {
        java.lang.System.arraycopy(this.zzb, 0, objArr, i, this.zzc);
        return i + this.zzc;
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode.zzcn
    final int zzc() {
        return 0;
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode.zzcn
    final java.lang.Object[] zze() {
        return this.zzb;
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode.zzcn
    final int zzb() {
        return this.zzc;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.zzc;
    }
}
