package com.google.android.gms.internal.ads;

import android.media.MediaPlayer;

/* loaded from: classes.dex */
final class zzbzs implements Runnable {
    final /* synthetic */ MediaPlayer zza;
    final /* synthetic */ zzcaa zzb;

    public zzbzs(zzcaa zzcaaVar, MediaPlayer mediaPlayer) {
        this.zza = mediaPlayer;
        this.zzb = zzcaaVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        zzcab zzcabVar;
        zzcab zzcabVar2;
        zzcaa.zzm(this.zzb, this.zza);
        zzcaa zzcaaVar = this.zzb;
        zzcabVar = zzcaaVar.zzr;
        if (zzcabVar != null) {
            zzcabVar2 = zzcaaVar.zzr;
            zzcabVar2.zzf();
        }
    }
}
