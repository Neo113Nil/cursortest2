package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@25.2.0 */
/* loaded from: classes4.dex */
public final class zzdwh {
    private final com.google.android.gms.internal.ads.zzdcp zza;
    private final com.google.android.gms.internal.ads.zzdkw zzb;
    private final com.google.android.gms.internal.ads.zzddy zzc;
    private final com.google.android.gms.internal.ads.zzdel zzd;
    private final com.google.android.gms.internal.ads.zzdfc zze;
    private final com.google.android.gms.internal.ads.zzdhv zzf;
    private final java.util.concurrent.Executor zzg;
    private final com.google.android.gms.internal.ads.zzdks zzh;
    private final com.google.android.gms.internal.ads.zzcug zzi;
    private final com.google.android.gms.ads.internal.zzb zzj;
    private final com.google.android.gms.internal.ads.zzcdn zzk;
    private final com.google.android.gms.internal.ads.zzbap zzl;
    private final com.google.android.gms.internal.ads.zzdhm zzm;
    private final com.google.android.gms.internal.ads.zzekg zzn;
    private final com.google.android.gms.internal.ads.zzfsc zzo;
    private final com.google.android.gms.internal.ads.zzdzl zzp;
    private final com.google.android.gms.internal.ads.zzctj zzq;
    private final com.google.android.gms.internal.ads.zzdwn zzr;
    private final com.google.android.gms.internal.ads.zzeao zzs;
    private final com.google.android.gms.internal.ads.zzdbs zzt;
    private final com.google.android.gms.internal.ads.zzdbn zzu;

    public zzdwh(com.google.android.gms.internal.ads.zzdcp zzdcpVar, com.google.android.gms.internal.ads.zzddy zzddyVar, com.google.android.gms.internal.ads.zzdel zzdelVar, com.google.android.gms.internal.ads.zzdfc zzdfcVar, com.google.android.gms.internal.ads.zzdhv zzdhvVar, java.util.concurrent.Executor executor, com.google.android.gms.internal.ads.zzdks zzdksVar, com.google.android.gms.internal.ads.zzcug zzcugVar, com.google.android.gms.ads.internal.zzb zzbVar, com.google.android.gms.internal.ads.zzcdn zzcdnVar, com.google.android.gms.internal.ads.zzbap zzbapVar, com.google.android.gms.internal.ads.zzdhm zzdhmVar, com.google.android.gms.internal.ads.zzekg zzekgVar, com.google.android.gms.internal.ads.zzfsc zzfscVar, com.google.android.gms.internal.ads.zzdzl zzdzlVar, com.google.android.gms.internal.ads.zzdkw zzdkwVar, com.google.android.gms.internal.ads.zzctj zzctjVar, com.google.android.gms.internal.ads.zzdwn zzdwnVar, com.google.android.gms.internal.ads.zzeao zzeaoVar, com.google.android.gms.internal.ads.zzdbs zzdbsVar, com.google.android.gms.internal.ads.zzdbn zzdbnVar) {
        this.zza = zzdcpVar;
        this.zzc = zzddyVar;
        this.zzd = zzdelVar;
        this.zze = zzdfcVar;
        this.zzf = zzdhvVar;
        this.zzg = executor;
        this.zzh = zzdksVar;
        this.zzi = zzcugVar;
        this.zzj = zzbVar;
        this.zzk = zzcdnVar;
        this.zzl = zzbapVar;
        this.zzm = zzdhmVar;
        this.zzn = zzekgVar;
        this.zzo = zzfscVar;
        this.zzp = zzdzlVar;
        this.zzb = zzdkwVar;
        this.zzq = zzctjVar;
        this.zzr = zzdwnVar;
        this.zzs = zzeaoVar;
        this.zzt = zzdbsVar;
        this.zzu = zzdbnVar;
    }

    public static final com.google.common.util.concurrent.ListenableFuture zzj(com.google.android.gms.internal.ads.zzcku zzckuVar, java.lang.String str, java.lang.String str2, final com.google.android.gms.internal.ads.zzdzg zzdzgVar, com.google.android.gms.internal.ads.zzfqg zzfqgVar) {
        if (((java.lang.Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(com.google.android.gms.internal.ads.zzbiq.zzcQ)).booleanValue()) {
            zzdzgVar.zzf(com.google.android.gms.internal.ads.zzdyu.RENDERING_WEBVIEW_LOAD_HTML_START.zza(), com.google.android.gms.ads.internal.zzt.zzk().currentTimeMillis());
        }
        final com.google.android.gms.internal.ads.zzcfw zzcfwVar = new com.google.android.gms.internal.ads.zzcfw();
        if (((java.lang.Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(com.google.android.gms.internal.ads.zzbiq.zzkk)).booleanValue()) {
            com.google.android.gms.internal.ads.zzfpw zzn = com.google.android.gms.internal.ads.zzfpw.CC.zzn(zzckuVar.getContext(), 112);
            zzn.zza();
            com.google.android.gms.internal.ads.zzfqf.zzd(zzcfwVar, zzfqgVar, zzn);
        }
        zzckuVar.zzP().zzG(new com.google.android.gms.internal.ads.zzcmq() { // from class: com.google.android.gms.internal.ads.zzdwf
            @Override // com.google.android.gms.internal.ads.zzcmq
            public final /* synthetic */ void zza(boolean z, int i, java.lang.String str3, java.lang.String str4) {
                com.google.android.gms.internal.ads.zzcfw zzcfwVar2 = zzcfwVar;
                if (z) {
                    if (((java.lang.Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(com.google.android.gms.internal.ads.zzbiq.zzcQ)).booleanValue()) {
                        com.google.android.gms.internal.ads.zzdzg.this.zzf(com.google.android.gms.internal.ads.zzdyu.RENDERING_WEBVIEW_LOAD_HTML_END.zza(), com.google.android.gms.ads.internal.zzt.zzk().currentTimeMillis());
                    }
                    zzcfwVar2.zzc(null);
                    return;
                }
                int length = java.lang.String.valueOf(i).length();
                java.lang.StringBuilder sb = new java.lang.StringBuilder(length + 55 + java.lang.String.valueOf(str3).length() + 15 + java.lang.String.valueOf(str4).length());
                sb.append("Ad Web View failed to load. Error code: ");
                sb.append(i);
                sb.append(", Description: ");
                sb.append(str3);
                sb.append(", Failing URL: ");
                sb.append(str4);
                zzcfwVar2.zzd(new java.lang.Exception(sb.toString()));
            }
        });
        zzckuVar.zzau(str, str2, null);
        return zzcfwVar;
    }

    final /* synthetic */ void zza() {
        this.zza.onAdClicked();
    }

    final /* synthetic */ void zzb(java.lang.String str, java.lang.String str2) {
        this.zzf.zzb(str, str2);
    }

    final /* synthetic */ void zzc() {
        this.zzc.zzb();
    }

    final /* synthetic */ boolean zzd(android.view.View view, android.view.MotionEvent motionEvent) {
        if (((java.lang.Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(com.google.android.gms.internal.ads.zzbiq.zzlw)).booleanValue() && motionEvent != null && motionEvent.getAction() == 0) {
            this.zzr.zza(motionEvent);
        }
        this.zzj.zza();
        if (view == null) {
            return false;
        }
        view.performClick();
        return false;
    }

    final /* synthetic */ void zze(android.view.View view) {
        this.zzj.zza();
    }

    final /* synthetic */ void zzf(com.google.android.gms.internal.ads.zzcku zzckuVar, com.google.android.gms.internal.ads.zzcku zzckuVar2, java.util.Map map) {
        this.zzi.zzn(zzckuVar);
    }

    final /* synthetic */ com.google.android.gms.internal.ads.zzddy zzg() {
        return this.zzc;
    }

    final /* synthetic */ com.google.android.gms.internal.ads.zzdhm zzh() {
        return this.zzm;
    }

    public final void zzi(final com.google.android.gms.internal.ads.zzcku zzckuVar, boolean z, com.google.android.gms.internal.ads.zzbpt zzbptVar, com.google.android.gms.internal.ads.zzdzg zzdzgVar) {
        com.google.android.gms.internal.ads.zzbak zzb;
        com.google.android.gms.internal.ads.zzbih zzbihVar = com.google.android.gms.internal.ads.zzbiq.zzcQ;
        if (((java.lang.Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbihVar)).booleanValue()) {
            zzdzgVar.zzf(com.google.android.gms.internal.ads.zzdyu.RENDERING_CONFIGURE_WEBVIEW_START.zza(), com.google.android.gms.ads.internal.zzt.zzk().currentTimeMillis());
        }
        zzckuVar.zzP().zzab(new com.google.android.gms.ads.internal.client.zza() { // from class: com.google.android.gms.internal.ads.zzdwg
            @Override // com.google.android.gms.ads.internal.client.zza
            public final /* synthetic */ void onAdClicked() {
                com.google.android.gms.internal.ads.zzdwh.this.zza();
            }
        }, this.zzd, this.zze, new com.google.android.gms.internal.ads.zzboi() { // from class: com.google.android.gms.internal.ads.zzdvz
            @Override // com.google.android.gms.internal.ads.zzboi
            public final /* synthetic */ void zzb(java.lang.String str, java.lang.String str2) {
                com.google.android.gms.internal.ads.zzdwh.this.zzb(str, str2);
            }
        }, new com.google.android.gms.ads.internal.overlay.zzad() { // from class: com.google.android.gms.internal.ads.zzdwa
            @Override // com.google.android.gms.ads.internal.overlay.zzad
            public final /* synthetic */ void zzl() {
                com.google.android.gms.internal.ads.zzdwh.this.zzc();
            }
        }, z, zzbptVar, this.zzj, new com.google.android.gms.internal.ads.zzdvy(this), this.zzk, this.zzn, this.zzo, this.zzp, null, this.zzb, null, null, null, this.zzq, this.zzs, this.zzt, this.zzu);
        zzckuVar.setOnTouchListener(new android.view.View.OnTouchListener() { // from class: com.google.android.gms.internal.ads.zzdwb
            @Override // android.view.View.OnTouchListener
            public final /* synthetic */ boolean onTouch(android.view.View view, android.view.MotionEvent motionEvent) {
                com.google.android.gms.internal.ads.zzdwh.this.zzd(view, motionEvent);
                return false;
            }
        });
        zzckuVar.setOnClickListener(new android.view.View.OnClickListener() { // from class: com.google.android.gms.internal.ads.zzdwc
            @Override // android.view.View.OnClickListener
            public final /* synthetic */ void onClick(android.view.View view) {
                com.google.android.gms.internal.ads.zzdwh.this.zze(view);
            }
        });
        if (((java.lang.Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(com.google.android.gms.internal.ads.zzbiq.zzdz)).booleanValue() && (zzb = this.zzl.zzb()) != null) {
            zzb.zzh(zzckuVar.zzE());
        }
        com.google.android.gms.internal.ads.zzdks zzdksVar = this.zzh;
        java.util.concurrent.Executor executor = this.zzg;
        zzdksVar.zzq(zzckuVar, executor);
        zzdksVar.zzq(new com.google.android.gms.internal.ads.zzbeq() { // from class: com.google.android.gms.internal.ads.zzdwd
            @Override // com.google.android.gms.internal.ads.zzbeq
            public final /* synthetic */ void zzdj(com.google.android.gms.internal.ads.zzbep zzbepVar) {
                android.graphics.Rect rect = zzbepVar.zzd;
                com.google.android.gms.internal.ads.zzcku.this.zzP().zza(rect.left, rect.top, false);
            }
        }, executor);
        zzdksVar.zza(zzckuVar.zzE());
        zzckuVar.zzab("/trackActiveViewUnit", new com.google.android.gms.internal.ads.zzbpq() { // from class: com.google.android.gms.internal.ads.zzdwe
            @Override // com.google.android.gms.internal.ads.zzbpq
            public final /* synthetic */ void zza(java.lang.Object obj, java.util.Map map) {
                com.google.android.gms.internal.ads.zzdwh.this.zzf(zzckuVar, (com.google.android.gms.internal.ads.zzcku) obj, map);
            }
        });
        this.zzi.zzo(zzckuVar);
        if (((java.lang.Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbihVar)).booleanValue()) {
            zzdzgVar.zzf(com.google.android.gms.internal.ads.zzdyu.RENDERING_CONFIGURE_WEBVIEW_END.zza(), com.google.android.gms.ads.internal.zzt.zzk().currentTimeMillis());
        }
    }
}
