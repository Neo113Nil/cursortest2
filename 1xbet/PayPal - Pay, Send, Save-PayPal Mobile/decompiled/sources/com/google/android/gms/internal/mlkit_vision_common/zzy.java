package com.google.android.gms.internal.mlkit_vision_common;

/* loaded from: classes8.dex */
final class zzy extends com.google.android.gms.internal.mlkit_vision_common.zzp {
    private final transient java.lang.Object[] zza;
    private final transient int zzb;
    private final transient int zzc;

    zzy(java.lang.Object[] objArr, int i, int i2) {
        this.zza = objArr;
        this.zzb = i;
        this.zzc = i2;
    }

    @Override // java.util.List
    public final java.lang.Object get(int i) {
        com.google.android.gms.internal.mlkit_vision_common.zzf.zza(i, this.zzc, "index");
        java.lang.Object obj = this.zza[i + i + this.zzb];
        obj.getClass();
        return obj;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.zzc;
    }
}
