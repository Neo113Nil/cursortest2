package com.google.android.gms.internal.mlkit_common;

/* loaded from: classes8.dex */
final class zzae extends com.google.android.gms.internal.mlkit_common.zzaf {
    final transient int zza;
    final transient int zzb;
    final /* synthetic */ com.google.android.gms.internal.mlkit_common.zzaf zzc;

    zzae(com.google.android.gms.internal.mlkit_common.zzaf zzafVar, int i, int i2) {
        this.zzc = zzafVar;
        this.zza = i;
        this.zzb = i2;
    }

    @Override // java.util.List
    public final java.lang.Object get(int i) {
        com.google.android.gms.internal.mlkit_common.zzt.zza(i, this.zzb, "index");
        return this.zzc.get(i + this.zza);
    }

    @Override // com.google.android.gms.internal.mlkit_common.zzaf, java.util.List
    public final /* synthetic */ java.util.List subList(int i, int i2) {
        return subList(i, i2);
    }

    @Override // com.google.android.gms.internal.mlkit_common.zzab
    final int zzb() {
        return this.zzc.zzc() + this.zza + this.zzb;
    }

    @Override // com.google.android.gms.internal.mlkit_common.zzab
    final int zzc() {
        return this.zzc.zzc() + this.zza;
    }

    @Override // com.google.android.gms.internal.mlkit_common.zzaf
    /* renamed from: zzf */
    public final com.google.android.gms.internal.mlkit_common.zzaf subList(int i, int i2) {
        com.google.android.gms.internal.mlkit_common.zzt.zzd(i, i2, this.zzb);
        int i3 = this.zza;
        return this.zzc.subList(i + i3, i2 + i3);
    }

    @Override // com.google.android.gms.internal.mlkit_common.zzab
    @javax.annotation.CheckForNull
    final java.lang.Object[] zze() {
        return this.zzc.zze();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.zzb;
    }
}
