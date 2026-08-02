package com.google.android.odml.image;

/* loaded from: classes9.dex */
final class zze implements com.google.android.odml.image.zzg {
    private final android.graphics.Bitmap zza;
    private final com.google.android.odml.image.ImageProperties zzb;

    public zze(android.graphics.Bitmap bitmap) {
        this.zza = bitmap;
        com.google.android.odml.image.zzb zzbVar = new com.google.android.odml.image.zzb();
        int i = com.google.android.odml.image.zzd.zza[bitmap.getConfig().ordinal()];
        zzbVar.zza(i != 1 ? i != 2 ? 0 : 1 : 8);
        zzbVar.zzb(1);
        this.zzb = zzbVar.zzc();
    }

    @Override // com.google.android.odml.image.zzg
    public final void zzc() {
        this.zza.recycle();
    }

    @Override // com.google.android.odml.image.zzg
    public final com.google.android.odml.image.ImageProperties zzb() {
        return this.zzb;
    }

    public final android.graphics.Bitmap zza() {
        return this.zza;
    }
}
