package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@25.2.0 */
/* loaded from: classes4.dex */
public final class zzqn {
    private final android.content.Context zza;
    private final com.google.android.gms.internal.ads.zzqm zzb;
    private final android.os.Handler zzc;
    private final com.google.android.gms.internal.ads.zzqj zzd;
    private final android.content.BroadcastReceiver zze;
    private final com.google.android.gms.internal.ads.zzqk zzf;
    private com.google.android.gms.internal.ads.zzacm zzg;
    private com.google.android.gms.internal.ads.zzqh zzh;
    private android.media.AudioDeviceInfo zzi;
    private com.google.android.gms.internal.ads.zzd zzj;
    private boolean zzk;

    /* JADX WARN: Multi-variable type inference failed */
    public zzqn(android.content.Context context, com.google.android.gms.internal.ads.zzqm zzqmVar, com.google.android.gms.internal.ads.zzd zzdVar, android.media.AudioDeviceInfo audioDeviceInfo) {
        android.content.Context applicationContext = context.getApplicationContext();
        this.zza = applicationContext;
        this.zzb = zzqmVar;
        this.zzj = zzdVar;
        this.zzi = audioDeviceInfo;
        android.os.Handler handler = new android.os.Handler(com.google.android.gms.internal.ads.zzfl.zzf(), null);
        this.zzc = handler;
        this.zzd = new com.google.android.gms.internal.ads.zzqj(this, null);
        this.zze = new com.google.android.gms.internal.ads.zzql(this, 0 == true ? 1 : 0);
        android.net.Uri zzc = com.google.android.gms.internal.ads.zzqh.zzc();
        this.zzf = zzc != null ? new com.google.android.gms.internal.ads.zzqk(this, handler, applicationContext.getContentResolver(), zzc) : null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: zzm, reason: merged with bridge method [inline-methods] */
    public final java.util.List zzg() {
        com.google.android.gms.internal.ads.zzacm zzacmVar;
        return (android.os.Build.VERSION.SDK_INT < 32 || (zzacmVar = this.zzg) == null) ? com.google.android.gms.internal.ads.zzgwm.zzi() : zzacmVar.zzf();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: zzn, reason: merged with bridge method [inline-methods] */
    public final void zzh(com.google.android.gms.internal.ads.zzqh zzqhVar) {
        if (!this.zzk || zzqhVar.equals(this.zzh)) {
            return;
        }
        this.zzh = zzqhVar;
        this.zzb.zza(zzqhVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: zzo, reason: merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public final void zzi() {
        zzh(com.google.android.gms.internal.ads.zzqh.zza(this.zza, this.zzj, this.zzi, zzg()));
    }

    public final void zza(com.google.android.gms.internal.ads.zzqh zzqhVar) {
        zzh(zzqhVar);
    }

    public final void zzb(com.google.android.gms.internal.ads.zzd zzdVar) {
        if (java.util.Objects.equals(zzdVar, this.zzj)) {
            return;
        }
        this.zzj = zzdVar;
        zzh(com.google.android.gms.internal.ads.zzqh.zza(this.zza, zzdVar, this.zzi, zzg()));
    }

    public final void zzc(android.media.AudioDeviceInfo audioDeviceInfo) {
        if (java.util.Objects.equals(audioDeviceInfo, this.zzi)) {
            return;
        }
        this.zzi = audioDeviceInfo;
        zzh(com.google.android.gms.internal.ads.zzqh.zza(this.zza, this.zzj, audioDeviceInfo, zzg()));
    }

    public final void zze() {
        com.google.android.gms.internal.ads.zzacm zzacmVar;
        if (this.zzk) {
            this.zzh = null;
            android.content.Context context = this.zza;
            com.google.android.gms.internal.ads.zzcj.zza(context).unregisterAudioDeviceCallback(this.zzd);
            if (android.os.Build.VERSION.SDK_INT >= 32 && (zzacmVar = this.zzg) != null) {
                zzacmVar.zzg();
                this.zzg = null;
            }
            context.unregisterReceiver(this.zze);
            com.google.android.gms.internal.ads.zzqk zzqkVar = this.zzf;
            if (zzqkVar != null) {
                zzqkVar.zzb();
            }
            this.zzk = false;
        }
    }

    final /* synthetic */ android.media.AudioDeviceInfo zzj() {
        return this.zzi;
    }

    final /* synthetic */ void zzk(android.media.AudioDeviceInfo audioDeviceInfo) {
        this.zzi = null;
    }

    final /* synthetic */ com.google.android.gms.internal.ads.zzd zzl() {
        return this.zzj;
    }

    public final com.google.android.gms.internal.ads.zzqh zzd() {
        if (this.zzk) {
            com.google.android.gms.internal.ads.zzqh zzqhVar = this.zzh;
            zzqhVar.getClass();
            return zzqhVar;
        }
        this.zzk = true;
        com.google.android.gms.internal.ads.zzqk zzqkVar = this.zzf;
        if (zzqkVar != null) {
            zzqkVar.zza();
        }
        android.content.Context context = this.zza;
        com.google.android.gms.internal.ads.zzqj zzqjVar = this.zzd;
        android.os.Handler handler = this.zzc;
        com.google.android.gms.internal.ads.zzcj.zza(context).registerAudioDeviceCallback(zzqjVar, handler);
        if (android.os.Build.VERSION.SDK_INT >= 32 && this.zzg == null) {
            this.zzg = new com.google.android.gms.internal.ads.zzacm(context, new java.lang.Runnable() { // from class: com.google.android.gms.internal.ads.zzqi
                @Override // java.lang.Runnable
                public final /* synthetic */ void run() {
                    com.google.android.gms.internal.ads.zzqn.this.zzf();
                }
            }, java.lang.Boolean.valueOf(com.google.android.gms.internal.ads.zzfl.zzP(context)));
        }
        com.google.android.gms.internal.ads.zzqh zzb = com.google.android.gms.internal.ads.zzqh.zzb(context, context.registerReceiver(this.zze, new android.content.IntentFilter("android.media.action.HDMI_AUDIO_PLUG"), null, handler), this.zzj, this.zzi, zzg());
        this.zzh = zzb;
        return zzb;
    }
}
