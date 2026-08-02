package com.google.android.gms.internal.mlkit_vision_common;

/* loaded from: classes8.dex */
final class zzw extends com.google.android.gms.internal.mlkit_vision_common.zzs {
    private final transient com.google.android.gms.internal.mlkit_vision_common.zzr zza;
    private final transient java.lang.Object[] zzb;
    private final transient int zzc;

    zzw(com.google.android.gms.internal.mlkit_vision_common.zzr zzrVar, java.lang.Object[] objArr, int i, int i2) {
        this.zza = zzrVar;
        this.zzb = objArr;
        this.zzc = i2;
    }

    @Override // com.google.android.gms.internal.mlkit_vision_common.zzl, java.util.AbstractCollection, java.util.Collection
    public final boolean contains(@javax.annotation.CheckForNull java.lang.Object obj) {
        if (!(obj instanceof java.util.Map.Entry)) {
            return false;
        }
        java.util.Map.Entry entry = (java.util.Map.Entry) obj;
        java.lang.Object key = entry.getKey();
        java.lang.Object value = entry.getValue();
        return value != null && value.equals(this.zza.get(key));
    }

    @Override // com.google.android.gms.internal.mlkit_vision_common.zzs, com.google.android.gms.internal.mlkit_vision_common.zzl, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
    public final /* synthetic */ java.util.Iterator iterator() {
        return zzf().listIterator(0);
    }

    @Override // com.google.android.gms.internal.mlkit_vision_common.zzl
    final int zza(java.lang.Object[] objArr, int i) {
        return zzf().zza(objArr, 0);
    }

    @Override // com.google.android.gms.internal.mlkit_vision_common.zzs, com.google.android.gms.internal.mlkit_vision_common.zzl
    /* renamed from: zzd */
    public final com.google.android.gms.internal.mlkit_vision_common.zzab iterator() {
        return zzf().listIterator(0);
    }

    @Override // com.google.android.gms.internal.mlkit_vision_common.zzs
    final com.google.android.gms.internal.mlkit_vision_common.zzp zzg() {
        return new com.google.android.gms.internal.mlkit_vision_common.zzv(this);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        return this.zzc;
    }
}
