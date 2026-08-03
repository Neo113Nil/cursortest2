package com.google.android.gms.ads.internal.overlay;

/* compiled from: com.google.android.gms:play-services-ads@@25.2.0 */
/* loaded from: classes3.dex */
public final class zzz {
    private com.google.android.gms.internal.ads.zzgrw zzf;
    private com.google.android.gms.internal.ads.zzcku zzc = null;
    private boolean zze = false;
    private java.lang.String zza = null;
    private com.google.android.gms.internal.ads.zzgqz zzd = null;
    private java.lang.String zzb = null;

    private final void zzl() {
        if (this.zzf == null) {
            this.zzf = new com.google.android.gms.ads.internal.overlay.zzx(this);
        }
    }

    private final com.google.android.gms.internal.ads.zzgry zzm() {
        com.google.android.gms.internal.ads.zzgrx zzc = com.google.android.gms.internal.ads.zzgry.zzc();
        if (!((java.lang.Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(com.google.android.gms.internal.ads.zzbiq.zzmW)).booleanValue() || android.text.TextUtils.isEmpty(this.zzb)) {
            java.lang.String str = this.zza;
            if (str != null) {
                zzc.zza(str);
            } else {
                zzg("Missing session token and/or appId", "onLMDupdate");
            }
        } else {
            zzc.zzb(this.zzb);
        }
        return zzc.zzc();
    }

    public final synchronized void zza(com.google.android.gms.internal.ads.zzcku zzckuVar, android.content.Context context) {
        this.zzc = zzckuVar;
        if (!zzb(context)) {
            zzg("Unable to bind", "on_play_store_bind");
            return;
        }
        java.util.HashMap hashMap = new java.util.HashMap();
        hashMap.put("action", "fetch_completed");
        zzi("on_play_store_bind", hashMap);
    }

    public final synchronized boolean zzb(android.content.Context context) {
        if (!com.google.android.gms.internal.ads.zzgsl.zza(context)) {
            return false;
        }
        try {
            this.zzd = com.google.android.gms.internal.ads.zzgra.zza(context);
        } catch (java.lang.NullPointerException e) {
            com.google.android.gms.ads.internal.util.zze.zza("Error connecting LMD Overlay service");
            com.google.android.gms.ads.internal.zzt.zzh().zzg(e, "LastMileDeliveryOverlay.bindLastMileDeliveryService");
        }
        if (this.zzd == null) {
            this.zze = false;
            return false;
        }
        zzl();
        this.zze = true;
        return true;
    }

    public final void zzc(com.google.android.gms.internal.ads.zzcku zzckuVar, com.google.android.gms.internal.ads.zzgrt zzgrtVar) {
        if (zzckuVar == null) {
            zzg("adWebview missing", "onLMDShow");
            return;
        }
        this.zzc = zzckuVar;
        if (!this.zze && !zzb(zzckuVar.getContext())) {
            zzg("LMDOverlay not bound", "on_play_store_bind");
            return;
        }
        if (((java.lang.Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(com.google.android.gms.internal.ads.zzbiq.zzmW)).booleanValue()) {
            this.zzb = zzgrtVar.zzb();
        }
        zzl();
        com.google.android.gms.internal.ads.zzgqz zzgqzVar = this.zzd;
        if (zzgqzVar != null) {
            zzgqzVar.zza(zzgrtVar, this.zzf);
        }
    }

    final void zzg(java.lang.String str, java.lang.String str2) {
        com.google.android.gms.ads.internal.util.zze.zza(str);
        if (this.zzc != null) {
            java.util.HashMap hashMap = new java.util.HashMap();
            hashMap.put("message", str);
            hashMap.put("action", str2);
            zzi("onError", hashMap);
        }
    }

    final void zzh(java.lang.String str) {
        zzi(str, new java.util.HashMap());
    }

    final void zzi(final java.lang.String str, final java.util.Map map) {
        com.google.android.gms.internal.ads.zzcfr.zzf.execute(new java.lang.Runnable() { // from class: com.google.android.gms.ads.internal.overlay.zzy
            @Override // java.lang.Runnable
            public final /* synthetic */ void run() {
                com.google.android.gms.ads.internal.overlay.zzz.this.zzk(str, map);
            }
        });
    }

    final void zzj(com.google.android.gms.internal.ads.zzgrv zzgrvVar) {
        if (!android.text.TextUtils.isEmpty(zzgrvVar.zzb())) {
            if (!((java.lang.Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(com.google.android.gms.internal.ads.zzbiq.zzmW)).booleanValue()) {
                this.zza = zzgrvVar.zzb();
            }
        }
        switch (zzgrvVar.zza()) {
            case 8152:
                zzh("onLMDOverlayOpened");
                break;
            case 8153:
                zzh("onLMDOverlayClicked");
                break;
            case 8155:
                zzh("onLMDOverlayClose");
                break;
            case 8157:
                this.zza = null;
                this.zzb = null;
                this.zze = false;
                break;
            case 8160:
            case 8161:
            case 8162:
                java.util.HashMap hashMap = new java.util.HashMap();
                hashMap.put("error", java.lang.String.valueOf(zzgrvVar.zza()));
                zzi("onLMDOverlayFailedToOpen", hashMap);
                break;
        }
    }

    final /* synthetic */ void zzk(java.lang.String str, java.util.Map map) {
        com.google.android.gms.internal.ads.zzcku zzckuVar = this.zzc;
        if (zzckuVar != null) {
            zzckuVar.zze(str, map);
        }
    }

    public final void zzd() {
        com.google.android.gms.internal.ads.zzgqz zzgqzVar;
        if (!this.zze || (zzgqzVar = this.zzd) == null) {
            com.google.android.gms.ads.internal.util.zze.zza("LastMileDelivery not connected");
        } else {
            zzgqzVar.zzd(zzm(), this.zzf);
            zzh("onLMDOverlayExpand");
        }
    }

    public final void zze() {
        com.google.android.gms.internal.ads.zzgqz zzgqzVar;
        if (!this.zze || (zzgqzVar = this.zzd) == null) {
            com.google.android.gms.ads.internal.util.zze.zza("LastMileDelivery not connected");
        } else {
            zzgqzVar.zzc(zzm(), this.zzf);
            zzh("onLMDOverlayCollapse");
        }
    }

    public final void zzf() {
        com.google.android.gms.internal.ads.zzgqz zzgqzVar;
        if (!this.zze || (zzgqzVar = this.zzd) == null) {
            com.google.android.gms.ads.internal.util.zze.zza("LastMileDelivery not connected");
            return;
        }
        com.google.android.gms.internal.ads.zzgqx zzc = com.google.android.gms.internal.ads.zzgqy.zzc();
        if (!((java.lang.Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(com.google.android.gms.internal.ads.zzbiq.zzmW)).booleanValue() || android.text.TextUtils.isEmpty(this.zzb)) {
            java.lang.String str = this.zza;
            if (str != null) {
                zzc.zza(str);
            } else {
                zzg("Missing session token and/or appId", "onLMDupdate");
            }
        } else {
            zzc.zzb(this.zzb);
        }
        zzgqzVar.zzb(zzc.zzc(), this.zzf);
    }
}
