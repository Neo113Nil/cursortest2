package com.google.android.gms.internal.mlkit_vision_common;

/* loaded from: classes8.dex */
final class zzx extends com.google.android.gms.internal.mlkit_vision_common.zzs {
    private final transient com.google.android.gms.internal.mlkit_vision_common.zzr zza;
    private final transient com.google.android.gms.internal.mlkit_vision_common.zzp zzb;

    zzx(com.google.android.gms.internal.mlkit_vision_common.zzr zzrVar, com.google.android.gms.internal.mlkit_vision_common.zzp zzpVar) {
        this.zza = zzrVar;
        this.zzb = zzpVar;
    }

    @Override // com.google.android.gms.internal.mlkit_vision_common.zzl, java.util.AbstractCollection, java.util.Collection
    public final boolean contains(@javax.annotation.CheckForNull java.lang.Object obj) {
        return this.zza.get(obj) != null;
    }

    @Override // com.google.android.gms.internal.mlkit_vision_common.zzs, com.google.android.gms.internal.mlkit_vision_common.zzl, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
    public final /* synthetic */ java.util.Iterator iterator() {
        return this.zzb.listIterator(0);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        return this.zza.size();
    }

    @Override // com.google.android.gms.internal.mlkit_vision_common.zzl
    final int zza(java.lang.Object[] objArr, int i) {
        return this.zzb.zza(objArr, 0);
    }

    @Override // com.google.android.gms.internal.mlkit_vision_common.zzs, com.google.android.gms.internal.mlkit_vision_common.zzl
    /* renamed from: zzd */
    public final com.google.android.gms.internal.mlkit_vision_common.zzab iterator() {
        return this.zzb.listIterator(0);
    }
}
