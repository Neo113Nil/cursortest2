package com.google.android.gms.internal.mlkit_vision_barcode;

/* loaded from: classes8.dex */
final class zzdo extends com.google.android.gms.internal.mlkit_vision_barcode.zzcs {
    private final transient java.lang.Object[] zza;
    private final transient int zzb;
    private final transient int zzc = 1;

    zzdo(java.lang.Object[] objArr, int i, int i2) {
        this.zza = objArr;
        this.zzb = i;
    }

    @Override // java.util.List
    public final java.lang.Object get(int i) {
        com.google.android.gms.internal.mlkit_vision_barcode.zzaz.zza(i, this.zzc, "index");
        return java.util.Objects.requireNonNull(this.zza[i + i + this.zzb]);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.zzc;
    }
}
