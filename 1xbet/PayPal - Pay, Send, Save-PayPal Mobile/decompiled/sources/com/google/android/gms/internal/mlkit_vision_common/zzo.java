package com.google.android.gms.internal.mlkit_vision_common;

/* loaded from: classes8.dex */
final class zzo extends com.google.android.gms.internal.mlkit_vision_common.zzp {
    final transient int zza;
    final transient int zzb;
    final /* synthetic */ com.google.android.gms.internal.mlkit_vision_common.zzp zzc;

    zzo(com.google.android.gms.internal.mlkit_vision_common.zzp zzpVar, int i, int i2) {
        this.zzc = zzpVar;
        this.zza = i;
        this.zzb = i2;
    }

    @Override // java.util.List
    public final java.lang.Object get(int i) {
        com.google.android.gms.internal.mlkit_vision_common.zzf.zza(i, this.zzb, "index");
        return this.zzc.get(i + this.zza);
    }

    @Override // com.google.android.gms.internal.mlkit_vision_common.zzp, java.util.List
    public final /* synthetic */ java.util.List subList(int i, int i2) {
        return subList(i, i2);
    }

    @Override // com.google.android.gms.internal.mlkit_vision_common.zzl
    final int zzb() {
        return this.zzc.zzc() + this.zza + this.zzb;
    }

    @Override // com.google.android.gms.internal.mlkit_vision_common.zzl
    final int zzc() {
        return this.zzc.zzc() + this.zza;
    }

    @Override // com.google.android.gms.internal.mlkit_vision_common.zzp
    /* renamed from: zzf */
    public final com.google.android.gms.internal.mlkit_vision_common.zzp subList(int i, int i2) {
        com.google.android.gms.internal.mlkit_vision_common.zzf.zzc(i, i2, this.zzb);
        com.google.android.gms.internal.mlkit_vision_common.zzp zzpVar = this.zzc;
        int i3 = this.zza;
        return zzpVar.subList(i + i3, i2 + i3);
    }

    @Override // com.google.android.gms.internal.mlkit_vision_common.zzl
    @javax.annotation.CheckForNull
    final java.lang.Object[] zze() {
        return this.zzc.zze();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.zzb;
    }
}
