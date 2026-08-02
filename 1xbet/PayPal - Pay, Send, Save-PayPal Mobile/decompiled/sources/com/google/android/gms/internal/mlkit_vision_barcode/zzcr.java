package com.google.android.gms.internal.mlkit_vision_barcode;

/* loaded from: classes8.dex */
final class zzcr extends com.google.android.gms.internal.mlkit_vision_barcode.zzcs {
    final transient int zza;
    final transient int zzb;
    final /* synthetic */ com.google.android.gms.internal.mlkit_vision_barcode.zzcs zzc;

    zzcr(com.google.android.gms.internal.mlkit_vision_barcode.zzcs zzcsVar, int i, int i2) {
        this.zzc = zzcsVar;
        this.zza = i;
        this.zzb = i2;
    }

    @Override // java.util.List
    public final java.lang.Object get(int i) {
        com.google.android.gms.internal.mlkit_vision_barcode.zzaz.zza(i, this.zzb, "index");
        return this.zzc.get(i + this.zza);
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode.zzcs, java.util.List
    public final /* synthetic */ java.util.List subList(int i, int i2) {
        return subList(i, i2);
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode.zzcn
    final int zzb() {
        return this.zzc.zzc() + this.zza + this.zzb;
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode.zzcn
    final int zzc() {
        return this.zzc.zzc() + this.zza;
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode.zzcs
    /* renamed from: zzf */
    public final com.google.android.gms.internal.mlkit_vision_barcode.zzcs subList(int i, int i2) {
        com.google.android.gms.internal.mlkit_vision_barcode.zzaz.zze(i, i2, this.zzb);
        int i3 = this.zza;
        return this.zzc.subList(i + i3, i2 + i3);
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode.zzcn
    @javax.annotation.CheckForNull
    final java.lang.Object[] zze() {
        return this.zzc.zze();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.zzb;
    }
}
