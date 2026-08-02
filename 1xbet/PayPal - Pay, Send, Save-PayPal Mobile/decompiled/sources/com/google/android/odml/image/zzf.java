package com.google.android.odml.image;

/* loaded from: classes9.dex */
final class zzf implements com.google.android.odml.image.zzg {
    private final java.nio.ByteBuffer zza;
    private final com.google.android.odml.image.ImageProperties zzb;

    public zzf(java.nio.ByteBuffer byteBuffer, int i) {
        this.zza = byteBuffer;
        com.google.android.odml.image.zzb zzbVar = new com.google.android.odml.image.zzb();
        zzbVar.zzb(2);
        zzbVar.zza(i);
        this.zzb = zzbVar.zzc();
    }

    @Override // com.google.android.odml.image.zzg
    public final void zzc() {
    }

    @Override // com.google.android.odml.image.zzg
    public final com.google.android.odml.image.ImageProperties zzb() {
        return this.zzb;
    }

    public final java.nio.ByteBuffer zza() {
        return this.zza;
    }
}
