package com.google.android.gms.internal.mlkit_common;

/* loaded from: classes8.dex */
final class zzap extends com.google.android.gms.internal.mlkit_common.zzaf {
    private final transient java.lang.Object[] zza;
    private final transient int zzb;
    private final transient int zzc;

    zzap(java.lang.Object[] objArr, int i, int i2) {
        this.zza = objArr;
        this.zzb = i;
        this.zzc = i2;
    }

    @Override // java.util.List
    public final java.lang.Object get(int i) {
        com.google.android.gms.internal.mlkit_common.zzt.zza(i, this.zzc, "index");
        return java.util.Objects.requireNonNull(this.zza[i + i + this.zzb]);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.zzc;
    }
}
