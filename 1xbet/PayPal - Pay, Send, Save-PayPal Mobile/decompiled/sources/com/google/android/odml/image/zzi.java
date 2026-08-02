package com.google.android.odml.image;

/* loaded from: classes9.dex */
final class zzi implements com.google.android.odml.image.zzg {
    private final android.media.Image zza;
    private final com.google.android.odml.image.ImageProperties zzb;

    public zzi(android.media.Image image) {
        this.zza = image;
        com.google.android.odml.image.zzb zzbVar = new com.google.android.odml.image.zzb();
        zzbVar.zzb(3);
        int format = image.getFormat();
        zzbVar.zza(format == 42 ? 1 : format == 41 ? 2 : format != 35 ? format != 256 ? 0 : 9 : 7);
        this.zzb = zzbVar.zzc();
    }

    @Override // com.google.android.odml.image.zzg
    public final void zzc() {
        this.zza.close();
    }

    @Override // com.google.android.odml.image.zzg
    public final com.google.android.odml.image.ImageProperties zzb() {
        return this.zzb;
    }

    public final android.media.Image zza() {
        return this.zza;
    }
}
