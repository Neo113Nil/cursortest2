package com.google.android.gms.internal.ads;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.IntentFilter;
import android.media.AudioDeviceInfo;
import android.media.AudioManager;
import android.net.Uri;
import android.os.Handler;
import java.util.Objects;

/* loaded from: classes.dex */
public final class zzoy {
    private final Context zza;
    private final Handler zzb;
    private final zzou zzc;
    private final BroadcastReceiver zzd;
    private final zzov zze;
    private zzot zzf;
    private zzoz zzg;
    private zze zzh;
    private boolean zzi;
    private final zzqh zzj;

    /* JADX WARN: Multi-variable type inference failed */
    public zzoy(Context context, zzqh zzqhVar, zze zzeVar, zzoz zzozVar) {
        Context applicationContext = context.getApplicationContext();
        this.zza = applicationContext;
        this.zzj = zzqhVar;
        this.zzh = zzeVar;
        this.zzg = zzozVar;
        Handler handler = new Handler(zzen.zzz(), null);
        this.zzb = handler;
        this.zzc = new zzou(this, 0 == true ? 1 : 0);
        this.zzd = new zzow(this, 0 == true ? 1 : 0);
        Uri zza = zzot.zza();
        this.zze = zza != null ? new zzov(this, handler, applicationContext.getContentResolver(), zza) : null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void zzj(zzot zzotVar) {
        if (!this.zzi || zzotVar.equals(this.zzf)) {
            return;
        }
        this.zzf = zzotVar;
        this.zzj.zza.zzJ(zzotVar);
    }

    public final zzot zzc() {
        if (this.zzi) {
            zzot zzotVar = this.zzf;
            zzotVar.getClass();
            return zzotVar;
        }
        this.zzi = true;
        zzov zzovVar = this.zze;
        if (zzovVar != null) {
            zzovVar.zza();
        }
        int i7 = zzen.zza;
        zzou zzouVar = this.zzc;
        if (zzouVar != null) {
            Context context = this.zza;
            Handler handler = this.zzb;
            AudioManager audioManager = (AudioManager) context.getSystemService("audio");
            audioManager.getClass();
            audioManager.registerAudioDeviceCallback(zzouVar, handler);
        }
        zzot zzd = zzot.zzd(this.zza, this.zza.registerReceiver(this.zzd, new IntentFilter("android.media.action.HDMI_AUDIO_PLUG"), null, this.zzb), this.zzh, this.zzg);
        this.zzf = zzd;
        return zzd;
    }

    public final void zzg(zze zzeVar) {
        this.zzh = zzeVar;
        zzj(zzot.zzc(this.zza, zzeVar, this.zzg));
    }

    public final void zzh(AudioDeviceInfo audioDeviceInfo) {
        zzoz zzozVar = this.zzg;
        AudioDeviceInfo audioDeviceInfo2 = zzozVar == null ? null : zzozVar.zza;
        int i7 = zzen.zza;
        if (Objects.equals(audioDeviceInfo, audioDeviceInfo2)) {
            return;
        }
        zzoz zzozVar2 = audioDeviceInfo != null ? new zzoz(audioDeviceInfo) : null;
        this.zzg = zzozVar2;
        zzj(zzot.zzc(this.zza, this.zzh, zzozVar2));
    }

    public final void zzi() {
        if (this.zzi) {
            this.zzf = null;
            int i7 = zzen.zza;
            zzou zzouVar = this.zzc;
            if (zzouVar != null) {
                AudioManager audioManager = (AudioManager) this.zza.getSystemService("audio");
                audioManager.getClass();
                audioManager.unregisterAudioDeviceCallback(zzouVar);
            }
            this.zza.unregisterReceiver(this.zzd);
            zzov zzovVar = this.zze;
            if (zzovVar != null) {
                zzovVar.zzb();
            }
            this.zzi = false;
        }
    }
}
