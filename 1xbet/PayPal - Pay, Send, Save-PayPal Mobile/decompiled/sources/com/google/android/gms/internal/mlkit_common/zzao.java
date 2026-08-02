package com.google.android.gms.internal.mlkit_common;

/* loaded from: classes8.dex */
final class zzao extends com.google.android.gms.internal.mlkit_common.zzaj {
    private final transient com.google.android.gms.internal.mlkit_common.zzai zza;
    private final transient com.google.android.gms.internal.mlkit_common.zzaf zzb;

    zzao(com.google.android.gms.internal.mlkit_common.zzai zzaiVar, com.google.android.gms.internal.mlkit_common.zzaf zzafVar) {
        this.zza = zzaiVar;
        this.zzb = zzafVar;
    }

    @Override // com.google.android.gms.internal.mlkit_common.zzab, java.util.AbstractCollection, java.util.Collection
    public final boolean contains(@javax.annotation.CheckForNull java.lang.Object obj) {
        return this.zza.get(obj) != null;
    }

    @Override // com.google.android.gms.internal.mlkit_common.zzaj, com.google.android.gms.internal.mlkit_common.zzab, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
    public final /* synthetic */ java.util.Iterator iterator() {
        return this.zzb.listIterator(0);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        return this.zza.size();
    }

    @Override // com.google.android.gms.internal.mlkit_common.zzab
    final int zza(java.lang.Object[] objArr, int i) {
        return this.zzb.zza(objArr, 0);
    }

    @Override // com.google.android.gms.internal.mlkit_common.zzaj, com.google.android.gms.internal.mlkit_common.zzab
    /* renamed from: zzd */
    public final com.google.android.gms.internal.mlkit_common.zzas iterator() {
        return this.zzb.listIterator(0);
    }
}
