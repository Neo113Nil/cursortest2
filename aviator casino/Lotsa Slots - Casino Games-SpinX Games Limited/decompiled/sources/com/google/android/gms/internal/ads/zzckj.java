package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@25.2.0 */
/* loaded from: classes4.dex */
public final class zzckj extends com.google.android.gms.internal.ads.zzcgt {
    private final com.google.android.gms.internal.ads.zzcho zzc;
    private com.google.android.gms.internal.ads.zzckk zzd;
    private android.net.Uri zze;
    private com.google.android.gms.internal.ads.zzcgs zzf;
    private boolean zzg;
    private int zzh;

    public zzckj(android.content.Context context, com.google.android.gms.internal.ads.zzcho zzchoVar) {
        super(context);
        this.zzh = 1;
        this.zzg = false;
        this.zzc = zzchoVar;
        zzchoVar.zza(this);
    }

    @org.checkerframework.checker.nullness.qual.EnsuresNonNullIf(expression = {"immersiveAdPlayer"}, result = true)
    private final boolean zzu() {
        int i = this.zzh;
        return (i == 1 || i == 2 || this.zzd == null) ? false : true;
    }

    private final void zzv(int i) {
        if (i == 4) {
            this.zzc.zze();
            this.zzb.zzd();
        } else if (this.zzh == 4) {
            this.zzc.zzf();
            this.zzb.zze();
        }
        this.zzh = i;
    }

    @Override // android.view.View
    public final java.lang.String toString() {
        java.lang.String name = getClass().getName();
        java.lang.String hexString = java.lang.Integer.toHexString(hashCode());
        java.lang.StringBuilder sb = new java.lang.StringBuilder(java.lang.String.valueOf(name).length() + 1 + java.lang.String.valueOf(hexString).length());
        sb.append(name);
        sb.append("@");
        sb.append(hexString);
        return sb.toString();
    }

    @Override // com.google.android.gms.internal.ads.zzcgt
    public final java.lang.String zza() {
        return "ImmersivePlayer";
    }

    @Override // com.google.android.gms.internal.ads.zzcgt
    public final void zzb(com.google.android.gms.internal.ads.zzcgs zzcgsVar) {
        this.zzf = zzcgsVar;
    }

    @Override // com.google.android.gms.internal.ads.zzcgt
    public final void zzc(java.lang.String str) {
        if (str != null) {
            android.net.Uri parse = android.net.Uri.parse(str);
            this.zze = parse;
            this.zzd = new com.google.android.gms.internal.ads.zzckk(parse.toString());
            zzv(3);
            com.google.android.gms.ads.internal.util.zzs.zza.post(new java.lang.Runnable() { // from class: com.google.android.gms.internal.ads.zzcki
                @Override // java.lang.Runnable
                public final /* synthetic */ void run() {
                    com.google.android.gms.internal.ads.zzckj.this.zzr();
                }
            });
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcgt
    public final void zzd() {
        com.google.android.gms.ads.internal.util.zze.zza("AdImmersivePlayerView stop");
        com.google.android.gms.internal.ads.zzckk zzckkVar = this.zzd;
        if (zzckkVar != null) {
            zzckkVar.zzd();
            this.zzd = null;
            zzv(1);
        }
        this.zzc.zzc();
    }

    @Override // com.google.android.gms.internal.ads.zzcgt
    public final void zze() {
        com.google.android.gms.ads.internal.util.zze.zza("AdImmersivePlayerView play");
        if (zzu()) {
            this.zzd.zzb();
            zzv(4);
            this.zza.zza();
            com.google.android.gms.ads.internal.util.zzs.zza.post(new java.lang.Runnable() { // from class: com.google.android.gms.internal.ads.zzckg
                @Override // java.lang.Runnable
                public final /* synthetic */ void run() {
                    com.google.android.gms.internal.ads.zzckj.this.zzs();
                }
            });
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcgt
    public final void zzf() {
        com.google.android.gms.ads.internal.util.zze.zza("AdImmersivePlayerView pause");
        if (zzu() && this.zzd.zza()) {
            this.zzd.zzc();
            zzv(5);
            com.google.android.gms.ads.internal.util.zzs.zza.post(new java.lang.Runnable() { // from class: com.google.android.gms.internal.ads.zzckh
                @Override // java.lang.Runnable
                public final /* synthetic */ void run() {
                    com.google.android.gms.internal.ads.zzckj.this.zzt();
                }
            });
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcgt
    public final int zzg() {
        return zzu() ? 0 : -1;
    }

    @Override // com.google.android.gms.internal.ads.zzcgt
    public final int zzh() {
        return 0;
    }

    @Override // com.google.android.gms.internal.ads.zzcgt
    public final void zzi(int i) {
        java.lang.StringBuilder sb = new java.lang.StringBuilder(java.lang.String.valueOf(i).length() + 27);
        sb.append("AdImmersivePlayerView seek ");
        sb.append(i);
        com.google.android.gms.ads.internal.util.zze.zza(sb.toString());
    }

    @Override // com.google.android.gms.internal.ads.zzcgt
    public final void zzj(float f, float f2) {
    }

    @Override // com.google.android.gms.internal.ads.zzcgt
    public final int zzk() {
        return 0;
    }

    @Override // com.google.android.gms.internal.ads.zzcgt
    public final int zzl() {
        return 0;
    }

    @Override // com.google.android.gms.internal.ads.zzcgt
    public final long zzm() {
        return 0L;
    }

    @Override // com.google.android.gms.internal.ads.zzcgt
    public final long zzn() {
        return 0L;
    }

    @Override // com.google.android.gms.internal.ads.zzcgt
    public final long zzo() {
        return 0L;
    }

    @Override // com.google.android.gms.internal.ads.zzcgt
    public final int zzp() {
        return zzu() ? 0 : -1;
    }

    @Override // com.google.android.gms.internal.ads.zzcgt, com.google.android.gms.internal.ads.zzchq
    public final void zzq() {
        if (this.zzd != null) {
            this.zzb.zzc();
        }
    }

    final /* synthetic */ void zzr() {
        com.google.android.gms.internal.ads.zzcgs zzcgsVar = this.zzf;
        if (zzcgsVar != null) {
            zzcgsVar.zzb();
        }
    }

    final /* synthetic */ void zzs() {
        com.google.android.gms.internal.ads.zzcgs zzcgsVar = this.zzf;
        if (zzcgsVar != null) {
            if (!this.zzg) {
                zzcgsVar.zzk();
                this.zzg = true;
            }
            this.zzf.zzc();
        }
    }

    final /* synthetic */ void zzt() {
        com.google.android.gms.internal.ads.zzcgs zzcgsVar = this.zzf;
        if (zzcgsVar != null) {
            zzcgsVar.zzd();
        }
    }
}
