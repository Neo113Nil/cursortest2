package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@25.2.0 */
@javax.annotation.ParametersAreNonnullByDefault
/* loaded from: classes4.dex */
public final class zzbsx implements com.google.android.gms.internal.ads.zzbsp, com.google.android.gms.internal.ads.zzbsn {
    private com.google.android.gms.internal.ads.zzcku zza;

    public zzbsx(android.content.Context context, com.google.android.gms.ads.internal.util.client.VersionInfoParcel versionInfoParcel, com.google.android.gms.internal.ads.zzbap zzbapVar, com.google.android.gms.ads.internal.zza zzaVar) throws com.google.android.gms.internal.ads.zzclj {
        com.google.android.gms.ads.internal.zzt.zzd();
        com.google.android.gms.internal.ads.zzcku zza = com.google.android.gms.internal.ads.zzclk.zza(context, com.google.android.gms.internal.ads.zzcne.zzb(), "", false, false, null, null, versionInfoParcel, null, null, null, com.google.android.gms.internal.ads.zzbhp.zza(), null, null, null, null, null);
        this.zza = zza;
        zza.zzE().setWillNotDraw(true);
    }

    private static final void zzs(java.lang.Runnable runnable) {
        com.google.android.gms.ads.internal.client.zzay.zza();
        if (com.google.android.gms.ads.internal.util.client.zzf.zzB()) {
            com.google.android.gms.ads.internal.util.zze.zza("runOnUiThread > the UI thread is the main thread, the runnable will be run now");
            runnable.run();
        } else {
            com.google.android.gms.ads.internal.util.zze.zza("runOnUiThread > the UI thread is not the main thread, the runnable will be added to the message queue");
            if (com.google.android.gms.ads.internal.util.zzs.zza.post(runnable)) {
                return;
            }
            com.google.android.gms.ads.internal.util.client.zzo.zzi("runOnUiThread > the runnable could not be placed to the message queue");
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbsy
    public final void zza(final java.lang.String str) {
        com.google.android.gms.ads.internal.util.zze.zza("invokeJavascript on adWebView from js");
        zzs(new java.lang.Runnable() { // from class: com.google.android.gms.internal.ads.zzbsw
            @Override // java.lang.Runnable
            public final /* synthetic */ void run() {
                com.google.android.gms.internal.ads.zzbsx.this.zzo(str);
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzbsy
    public /* synthetic */ void zzb(java.lang.String str, org.json.JSONObject jSONObject) {
        zzc(str, jSONObject.toString());
    }

    @Override // com.google.android.gms.internal.ads.zzbsy
    public /* synthetic */ void zzc(java.lang.String str, java.lang.String str2) {
        com.google.android.gms.internal.ads.zzbsn.CC.$default$zzc(this, str, str2);
    }

    @Override // com.google.android.gms.internal.ads.zzbsm
    public /* synthetic */ void zzd(java.lang.String str, org.json.JSONObject jSONObject) {
        com.google.android.gms.internal.ads.zzbsn.CC.$default$zzd(this, str, jSONObject);
    }

    @Override // com.google.android.gms.internal.ads.zzbsm
    public /* synthetic */ void zze(java.lang.String str, java.util.Map map) {
        com.google.android.gms.internal.ads.zzbsn.CC.$default$zze(this, str, map);
    }

    @Override // com.google.android.gms.internal.ads.zzbsp
    public final void zzf(java.lang.String str) {
        java.lang.String.valueOf(str);
        com.google.android.gms.ads.internal.util.zze.zza("loadJavascript on adWebView from path: ".concat(java.lang.String.valueOf(str)));
        final java.lang.String format = java.lang.String.format("<!DOCTYPE html><html><head><script src=\"%s\"></script></head><body></body></html>", str);
        zzs(new java.lang.Runnable() { // from class: com.google.android.gms.internal.ads.zzbss
            @Override // java.lang.Runnable
            public final /* synthetic */ void run() {
                com.google.android.gms.internal.ads.zzbsx.this.zzp(format);
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzbsp
    public final void zzg(final java.lang.String str) {
        java.lang.String.valueOf(str);
        com.google.android.gms.ads.internal.util.zze.zza("loadHtmlWrapper on adWebView from path: ".concat(java.lang.String.valueOf(str)));
        zzs(new java.lang.Runnable() { // from class: com.google.android.gms.internal.ads.zzbsu
            @Override // java.lang.Runnable
            public final /* synthetic */ void run() {
                com.google.android.gms.internal.ads.zzbsx.this.zzr(str);
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzbsp
    public final void zzh(final java.lang.String str) {
        com.google.android.gms.ads.internal.util.zze.zza("loadHtml on adWebView from html");
        zzs(new java.lang.Runnable() { // from class: com.google.android.gms.internal.ads.zzbst
            @Override // java.lang.Runnable
            public final /* synthetic */ void run() {
                com.google.android.gms.internal.ads.zzbsx.this.zzq(str);
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzbsp
    public final void zzi(final com.google.android.gms.internal.ads.zzbso zzbsoVar) {
        com.google.android.gms.internal.ads.zzcku zzckuVar = this.zza;
        if (zzckuVar != null) {
            com.google.android.gms.internal.ads.zzcms zzP = zzckuVar.zzP();
            java.util.Objects.requireNonNull(zzbsoVar);
            zzP.zzH(new com.google.android.gms.internal.ads.zzcmr() { // from class: com.google.android.gms.internal.ads.zzbsr
                @Override // com.google.android.gms.internal.ads.zzcmr
                public final /* synthetic */ void zza() {
                    com.google.android.gms.internal.ads.zzbso.this.zza();
                }
            });
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbsp
    public final void zzj() {
        com.google.android.gms.internal.ads.zzcku zzckuVar = this.zza;
        if (zzckuVar != null) {
            zzckuVar.destroy();
            this.zza = null;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbsp
    public final boolean zzk() {
        com.google.android.gms.internal.ads.zzcku zzckuVar = this.zza;
        return zzckuVar == null || zzckuVar.zzX();
    }

    @Override // com.google.android.gms.internal.ads.zzbsp
    public final com.google.android.gms.internal.ads.zzbtw zzl() {
        return new com.google.android.gms.internal.ads.zzbtw(this);
    }

    @Override // com.google.android.gms.internal.ads.zzbtv
    public final void zzm(java.lang.String str, com.google.android.gms.internal.ads.zzbpq zzbpqVar) {
        com.google.android.gms.internal.ads.zzcku zzckuVar = this.zza;
        if (zzckuVar != null) {
            zzckuVar.zzab(str, new com.google.android.gms.internal.ads.zzbsq(this, zzbpqVar));
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbtv
    public final void zzn(java.lang.String str, final com.google.android.gms.internal.ads.zzbpq zzbpqVar) {
        com.google.android.gms.internal.ads.zzcku zzckuVar = this.zza;
        if (zzckuVar != null) {
            zzckuVar.zzad(str, new com.google.android.gms.common.util.Predicate() { // from class: com.google.android.gms.internal.ads.zzbsv
                @Override // com.google.android.gms.common.util.Predicate
                public final /* synthetic */ boolean apply(java.lang.Object obj) {
                    com.google.android.gms.internal.ads.zzbpq zzbpqVar2 = (com.google.android.gms.internal.ads.zzbpq) obj;
                    if (zzbpqVar2 instanceof com.google.android.gms.internal.ads.zzbsq) {
                        return ((com.google.android.gms.internal.ads.zzbsq) zzbpqVar2).zzb().equals(com.google.android.gms.internal.ads.zzbpq.this);
                    }
                    return false;
                }
            });
        }
    }

    final /* synthetic */ void zzo(java.lang.String str) {
        com.google.android.gms.internal.ads.zzcku zzckuVar = this.zza;
        if (zzckuVar != null) {
            zzckuVar.zza(str);
        }
    }

    final /* synthetic */ void zzp(java.lang.String str) {
        com.google.android.gms.internal.ads.zzcku zzckuVar = this.zza;
        if (zzckuVar != null) {
            zzckuVar.loadData(str, "text/html", "UTF-8");
        }
    }

    final /* synthetic */ void zzq(java.lang.String str) {
        com.google.android.gms.internal.ads.zzcku zzckuVar = this.zza;
        if (zzckuVar != null) {
            zzckuVar.loadData(str, "text/html", "UTF-8");
        }
    }

    final /* synthetic */ void zzr(java.lang.String str) {
        com.google.android.gms.internal.ads.zzcku zzckuVar = this.zza;
        if (zzckuVar != null) {
            zzckuVar.loadUrl(str);
        }
    }
}
