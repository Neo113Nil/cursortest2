package com.google.android.gms.internal.ads;

import android.media.MediaPlayer;

/* JADX INFO: loaded from: classes.dex */
final class zzbzs implements Runnable {
    final /* synthetic */ MediaPlayer zza;
    final /* synthetic */ zzcaa zzb;

    public zzbzs(zzcaa zzcaaVar, MediaPlayer mediaPlayer) {
        this.zza = mediaPlayer;
        this.zzb = zzcaaVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        zzcaa.zzm(this.zzb, this.zza);
        zzcaa zzcaaVar = this.zzb;
        if (zzcaaVar.zzr != null) {
            zzcaaVar.zzr.zzf();
        }
    }
}
