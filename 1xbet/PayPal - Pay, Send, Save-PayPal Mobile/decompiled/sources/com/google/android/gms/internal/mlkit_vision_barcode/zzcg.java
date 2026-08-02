package com.google.android.gms.internal.mlkit_vision_barcode;

/* loaded from: classes8.dex */
final class zzcg extends com.google.android.gms.internal.mlkit_vision_barcode.zzbs {
    final /* synthetic */ com.google.android.gms.internal.mlkit_vision_barcode.zzci zza;
    private final java.lang.Object zzb;
    private int zzc;

    zzcg(com.google.android.gms.internal.mlkit_vision_barcode.zzci zzciVar, int i) {
        this.zza = zzciVar;
        this.zzb = com.google.android.gms.internal.mlkit_vision_barcode.zzci.zzg(zzciVar, i);
        this.zzc = i;
    }

    private final void zza() {
        int zzw;
        int i = this.zzc;
        if (i == -1 || i >= this.zza.size() || !com.google.android.gms.internal.mlkit_vision_barcode.zzax.zza(this.zzb, com.google.android.gms.internal.mlkit_vision_barcode.zzci.zzg(this.zza, this.zzc))) {
            zzw = this.zza.zzw(this.zzb);
            this.zzc = zzw;
        }
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode.zzbs, java.util.Map.Entry
    public final java.lang.Object getValue() {
        java.util.Map zzl = this.zza.zzl();
        if (zzl != null) {
            return zzl.get(this.zzb);
        }
        zza();
        int i = this.zzc;
        if (i == -1) {
            return null;
        }
        return com.google.android.gms.internal.mlkit_vision_barcode.zzci.zzj(this.zza, i);
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode.zzbs, java.util.Map.Entry
    public final java.lang.Object setValue(java.lang.Object obj) {
        java.util.Map zzl = this.zza.zzl();
        if (zzl != null) {
            return zzl.put(this.zzb, obj);
        }
        zza();
        int i = this.zzc;
        if (i == -1) {
            this.zza.put(this.zzb, obj);
            return null;
        }
        com.google.android.gms.internal.mlkit_vision_barcode.zzci zzciVar = this.zza;
        java.lang.Object zzj = com.google.android.gms.internal.mlkit_vision_barcode.zzci.zzj(zzciVar, i);
        com.google.android.gms.internal.mlkit_vision_barcode.zzci.zzn(zzciVar, this.zzc, obj);
        return zzj;
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode.zzbs, java.util.Map.Entry
    public final java.lang.Object getKey() {
        return this.zzb;
    }
}
