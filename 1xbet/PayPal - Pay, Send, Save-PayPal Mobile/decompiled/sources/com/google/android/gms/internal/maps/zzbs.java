package com.google.android.gms.internal.maps;

/* loaded from: classes8.dex */
final class zzbs extends com.google.android.gms.internal.maps.zzbi {
    private final transient java.lang.Object[] zza;
    private final transient int zzb;
    private final transient int zzc;

    zzbs(java.lang.Object[] objArr, int i, int i2) {
        this.zza = objArr;
        this.zzb = i;
        this.zzc = i2;
    }

    @Override // java.util.List
    public final java.lang.Object get(int i) {
        com.google.android.gms.internal.maps.zzba.zza(i, this.zzc, "index");
        return java.util.Objects.requireNonNull(this.zza[i + i + this.zzb]);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.zzc;
    }
}
