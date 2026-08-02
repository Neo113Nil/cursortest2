package com.google.android.gms.internal.mlkit_common;

/* loaded from: classes8.dex */
final class zzan extends com.google.android.gms.internal.mlkit_common.zzaj {
    private final transient com.google.android.gms.internal.mlkit_common.zzai zza;
    private final transient java.lang.Object[] zzb;
    private final transient int zzc;

    zzan(com.google.android.gms.internal.mlkit_common.zzai zzaiVar, java.lang.Object[] objArr, int i, int i2) {
        this.zza = zzaiVar;
        this.zzb = objArr;
        this.zzc = i2;
    }

    @Override // com.google.android.gms.internal.mlkit_common.zzab, java.util.AbstractCollection, java.util.Collection
    public final boolean contains(@javax.annotation.CheckForNull java.lang.Object obj) {
        if (!(obj instanceof java.util.Map.Entry)) {
            return false;
        }
        java.util.Map.Entry entry = (java.util.Map.Entry) obj;
        java.lang.Object key = entry.getKey();
        java.lang.Object value = entry.getValue();
        return value != null && value.equals(this.zza.get(key));
    }

    @Override // com.google.android.gms.internal.mlkit_common.zzaj, com.google.android.gms.internal.mlkit_common.zzab, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
    public final /* synthetic */ java.util.Iterator iterator() {
        return zzf().listIterator(0);
    }

    @Override // com.google.android.gms.internal.mlkit_common.zzab
    final int zza(java.lang.Object[] objArr, int i) {
        return zzf().zza(objArr, 0);
    }

    @Override // com.google.android.gms.internal.mlkit_common.zzaj, com.google.android.gms.internal.mlkit_common.zzab
    /* renamed from: zzd */
    public final com.google.android.gms.internal.mlkit_common.zzas iterator() {
        return zzf().listIterator(0);
    }

    @Override // com.google.android.gms.internal.mlkit_common.zzaj
    final com.google.android.gms.internal.mlkit_common.zzaf zzg() {
        return new com.google.android.gms.internal.mlkit_common.zzam(this);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        return this.zzc;
    }
}
