package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@25.2.0 */
/* loaded from: classes4.dex */
public final class zzcd {
    private final com.google.android.gms.internal.ads.zzgub zza;
    private final android.os.Handler zzb;
    private com.google.android.gms.internal.ads.zzcc zzc;
    private com.google.android.gms.internal.ads.zzd zzd;
    private int zzf;
    private com.google.android.gms.internal.ads.zzch zzh;
    private float zzg = 1.0f;
    private int zze = 0;

    public zzcd(final android.content.Context context, android.os.Looper looper, com.google.android.gms.internal.ads.zzcc zzccVar) {
        this.zza = com.google.android.gms.internal.ads.zzguf.zza(new com.google.android.gms.internal.ads.zzgub() { // from class: com.google.android.gms.internal.ads.zzcb
            @Override // com.google.android.gms.internal.ads.zzgub
            public final /* synthetic */ java.lang.Object zza() {
                return com.google.android.gms.internal.ads.zzcj.zza(context);
            }
        });
        this.zzc = zzccVar;
        this.zzb = new android.os.Handler(looper);
    }

    private final void zzf() {
        int i = this.zze;
        if (i == 1 || i == 0 || this.zzh == null) {
            return;
        }
        android.media.AudioManager audioManager = (android.media.AudioManager) this.zza.zza();
        com.google.android.gms.internal.ads.zzch zzchVar = this.zzh;
        if (android.os.Build.VERSION.SDK_INT >= 26) {
            audioManager.abandonAudioFocusRequest(zzchVar.zzc());
        } else {
            audioManager.abandonAudioFocus(zzchVar.zzb());
        }
    }

    private final void zzg(int i) {
        if (this.zze == i) {
            return;
        }
        this.zze = i;
        float f = i == 4 ? 0.2f : 1.0f;
        if (this.zzg != f) {
            this.zzg = f;
            com.google.android.gms.internal.ads.zzcc zzccVar = this.zzc;
            if (zzccVar != null) {
                zzccVar.zza(f);
            }
        }
    }

    private final void zzh(int i) {
        com.google.android.gms.internal.ads.zzcc zzccVar = this.zzc;
        if (zzccVar != null) {
            zzccVar.zzb(i);
        }
    }

    public final float zza() {
        return this.zzg;
    }

    public final void zzb(com.google.android.gms.internal.ads.zzd zzdVar) {
        if (java.util.Objects.equals(this.zzd, zzdVar)) {
            return;
        }
        this.zzd = zzdVar;
        this.zzf = zzdVar == null ? 0 : 1;
    }

    public final void zzd() {
        this.zzc = null;
        zzf();
        zzg(0);
    }

    public final int zzc(boolean z, int i) {
        int requestAudioFocus;
        if (i == 1 || this.zzf != 1) {
            zzf();
            zzg(0);
            return 1;
        }
        int i2 = 3;
        if (!z) {
            int i3 = this.zze;
            if (i3 != 1) {
                return i3 != 3 ? 1 : 0;
            }
            return -1;
        }
        if (this.zze == 2) {
            return 1;
        }
        if (this.zzh == null) {
            com.google.android.gms.internal.ads.zzce zzceVar = new com.google.android.gms.internal.ads.zzce(1);
            com.google.android.gms.internal.ads.zzd zzdVar = this.zzd;
            zzdVar.getClass();
            zzceVar.zzb(zzdVar);
            zzceVar.zzc(true);
            zzceVar.zza(new android.media.AudioManager.OnAudioFocusChangeListener() { // from class: com.google.android.gms.internal.ads.zzca
                @Override // android.media.AudioManager.OnAudioFocusChangeListener
                public final /* synthetic */ void onAudioFocusChange(int i4) {
                    com.google.android.gms.internal.ads.zzcd.this.zze(i4);
                }
            }, this.zzb);
            this.zzh = zzceVar.zzd();
        }
        android.media.AudioManager audioManager = (android.media.AudioManager) this.zza.zza();
        com.google.android.gms.internal.ads.zzch zzchVar = this.zzh;
        if (android.os.Build.VERSION.SDK_INT >= 26) {
            requestAudioFocus = audioManager.requestAudioFocus(zzchVar.zzc());
        } else {
            android.media.AudioManager.OnAudioFocusChangeListener zzb = zzchVar.zzb();
            com.google.android.gms.internal.ads.zzd zza = zzchVar.zza();
            if (android.os.Build.VERSION.SDK_INT >= 26) {
                try {
                    int volumeControlStream = zza.zza().getVolumeControlStream();
                    if (volumeControlStream != Integer.MIN_VALUE) {
                        i2 = volumeControlStream;
                    }
                } catch (java.lang.RuntimeException unused) {
                }
            }
            requestAudioFocus = audioManager.requestAudioFocus(zzb, i2, 1);
        }
        if (requestAudioFocus == 1 || requestAudioFocus == 2) {
            zzg(2);
            return 1;
        }
        zzg(1);
        return -1;
    }

    final /* synthetic */ void zze(int i) {
        if (i == -3 || i == -2) {
            if (i != -2) {
                zzg(4);
                return;
            } else {
                zzh(0);
                zzg(3);
                return;
            }
        }
        if (i == -1) {
            zzh(-1);
            zzf();
            zzg(1);
        } else if (i == 1) {
            zzg(2);
            zzh(1);
        } else {
            java.lang.StringBuilder sb = new java.lang.StringBuilder(java.lang.String.valueOf(i).length() + 27);
            sb.append("Unknown focus change type: ");
            sb.append(i);
            com.google.android.gms.internal.ads.zzeg.zzc("AudioFocusManager", sb.toString());
        }
    }
}
