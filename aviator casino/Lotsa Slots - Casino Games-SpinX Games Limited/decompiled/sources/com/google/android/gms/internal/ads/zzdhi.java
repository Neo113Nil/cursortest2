package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@25.2.0 */
/* loaded from: classes4.dex */
public final class zzdhi implements com.google.android.gms.ads.admanager.AppEventListener, com.google.android.gms.ads.rewarded.OnAdMetadataChangedListener, com.google.android.gms.internal.ads.zzdcr, com.google.android.gms.ads.internal.client.zza, com.google.android.gms.internal.ads.zzdfi, com.google.android.gms.internal.ads.zzddl, com.google.android.gms.internal.ads.zzdeq, com.google.android.gms.ads.internal.overlay.zzr, com.google.android.gms.internal.ads.zzddh, com.google.android.gms.internal.ads.zzdky {
    private final com.google.android.gms.internal.ads.zzdgh zza = new com.google.android.gms.internal.ads.zzdgh(this, null);

    @javax.annotation.Nullable
    private com.google.android.gms.internal.ads.zzetc zzb;

    @javax.annotation.Nullable
    private com.google.android.gms.internal.ads.zzetg zzc;

    @javax.annotation.Nullable
    private com.google.android.gms.internal.ads.zzfge zzd;

    @javax.annotation.Nullable
    private com.google.android.gms.internal.ads.zzfjj zze;

    private static void zzs(java.lang.Object obj, com.google.android.gms.internal.ads.zzdhh zzdhhVar) {
        if (obj != null) {
            zzdhhVar.zza(obj);
        }
    }

    @Override // com.google.android.gms.ads.internal.client.zza
    public final void onAdClicked() {
        zzs(this.zzb, com.google.android.gms.internal.ads.zzdgm.zza);
        zzs(this.zzc, com.google.android.gms.internal.ads.zzdgz.zza);
    }

    @Override // com.google.android.gms.ads.rewarded.OnAdMetadataChangedListener
    public final void onAdMetadataChanged() {
        zzs(this.zze, com.google.android.gms.internal.ads.zzdhf.zza);
    }

    @Override // com.google.android.gms.ads.admanager.AppEventListener
    public final void onAppEvent(final java.lang.String str, final java.lang.String str2) {
        zzs(this.zzb, new com.google.android.gms.internal.ads.zzdhh() { // from class: com.google.android.gms.internal.ads.zzdfz
            @Override // com.google.android.gms.internal.ads.zzdhh
            public final /* synthetic */ void zza(java.lang.Object obj) {
                ((com.google.android.gms.internal.ads.zzetc) obj).onAppEvent(str, str2);
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzdcr
    public final void zzd(final com.google.android.gms.internal.ads.zzcbp zzcbpVar, final java.lang.String str, final java.lang.String str2) {
        zzs(this.zzb, new com.google.android.gms.internal.ads.zzdhh(zzcbpVar, str, str2) { // from class: com.google.android.gms.internal.ads.zzdgg
            @Override // com.google.android.gms.internal.ads.zzdhh
            public final /* synthetic */ void zza(java.lang.Object obj) {
            }
        });
        zzs(this.zze, new com.google.android.gms.internal.ads.zzdhh() { // from class: com.google.android.gms.internal.ads.zzdfy
            @Override // com.google.android.gms.internal.ads.zzdhh
            public final /* synthetic */ void zza(java.lang.Object obj) {
                ((com.google.android.gms.internal.ads.zzfjj) obj).zzd(com.google.android.gms.internal.ads.zzcbp.this, str, str2);
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzdcr
    public final void zzdK() {
        zzs(this.zzb, com.google.android.gms.internal.ads.zzdgj.zza);
        zzs(this.zze, com.google.android.gms.internal.ads.zzdhb.zza);
    }

    @Override // com.google.android.gms.internal.ads.zzdky
    public final void zzdR() {
        zzs(this.zzb, com.google.android.gms.internal.ads.zzdgn.zza);
    }

    @Override // com.google.android.gms.ads.internal.overlay.zzr
    public final void zzdT() {
        zzs(this.zzd, com.google.android.gms.internal.ads.zzdgt.zza);
    }

    @Override // com.google.android.gms.ads.internal.overlay.zzr
    public final void zzdU(final int i) {
        zzs(this.zzd, new com.google.android.gms.internal.ads.zzdhh() { // from class: com.google.android.gms.internal.ads.zzdgf
            @Override // com.google.android.gms.internal.ads.zzdhh
            public final /* synthetic */ void zza(java.lang.Object obj) {
                ((com.google.android.gms.internal.ads.zzfge) obj).zzdU(i);
            }
        });
    }

    @Override // com.google.android.gms.ads.internal.overlay.zzr
    public final void zzdo() {
    }

    @Override // com.google.android.gms.ads.internal.overlay.zzr
    public final void zzdp() {
    }

    @Override // com.google.android.gms.ads.internal.overlay.zzr
    public final void zzdq() {
    }

    @Override // com.google.android.gms.internal.ads.zzddl
    public final void zzdr() {
        zzs(this.zzb, com.google.android.gms.internal.ads.zzdgp.zza);
    }

    @Override // com.google.android.gms.internal.ads.zzdcr
    public final void zzds() {
        zzs(this.zzb, com.google.android.gms.internal.ads.zzdgi.zza);
        zzs(this.zze, com.google.android.gms.internal.ads.zzdha.zza);
    }

    @Override // com.google.android.gms.internal.ads.zzdcr
    public final void zzdt() {
        zzs(this.zzb, com.google.android.gms.internal.ads.zzdgq.zza);
        zzs(this.zze, com.google.android.gms.internal.ads.zzdhg.zza);
    }

    @Override // com.google.android.gms.internal.ads.zzdky
    public final void zzdu() {
        zzs(this.zzb, com.google.android.gms.internal.ads.zzdgo.zza);
        zzs(this.zzc, com.google.android.gms.internal.ads.zzdgy.zza);
        zzs(this.zze, com.google.android.gms.internal.ads.zzdhe.zza);
        zzs(this.zzd, com.google.android.gms.internal.ads.zzdgx.zza);
    }

    @Override // com.google.android.gms.ads.internal.overlay.zzr
    public final void zzdv() {
        zzs(this.zzd, com.google.android.gms.internal.ads.zzdgu.zza);
    }

    @Override // com.google.android.gms.ads.internal.overlay.zzr
    public final void zzdw() {
        zzs(this.zzd, com.google.android.gms.internal.ads.zzdgv.zza);
    }

    @Override // com.google.android.gms.ads.internal.overlay.zzr
    public final void zzdx() {
        zzs(this.zzd, com.google.android.gms.internal.ads.zzdgw.zza);
    }

    @Override // com.google.android.gms.ads.internal.overlay.zzr
    public final void zzdy() {
    }

    @Override // com.google.android.gms.ads.internal.overlay.zzr
    public final void zzdz() {
    }

    @Override // com.google.android.gms.internal.ads.zzdcr
    public final void zze() {
        zzs(this.zzb, com.google.android.gms.internal.ads.zzdgk.zza);
        zzs(this.zze, com.google.android.gms.internal.ads.zzdhc.zza);
    }

    @Override // com.google.android.gms.internal.ads.zzdcr
    public final void zzf() {
        zzs(this.zzb, com.google.android.gms.internal.ads.zzdgl.zza);
        zzs(this.zze, com.google.android.gms.internal.ads.zzdhd.zza);
    }

    @Override // com.google.android.gms.ads.internal.overlay.zzr
    public final void zzh() {
        zzs(this.zzd, com.google.android.gms.internal.ads.zzdgs.zza);
    }

    @Override // com.google.android.gms.internal.ads.zzddh
    public final void zzj(final com.google.android.gms.ads.internal.client.zze zzeVar) {
        zzs(this.zze, new com.google.android.gms.internal.ads.zzdhh() { // from class: com.google.android.gms.internal.ads.zzdgd
            @Override // com.google.android.gms.internal.ads.zzdhh
            public final /* synthetic */ void zza(java.lang.Object obj) {
                ((com.google.android.gms.internal.ads.zzfjj) obj).zzj(com.google.android.gms.ads.internal.client.zze.this);
            }
        });
        zzs(this.zzb, new com.google.android.gms.internal.ads.zzdhh() { // from class: com.google.android.gms.internal.ads.zzdge
            @Override // com.google.android.gms.internal.ads.zzdhh
            public final /* synthetic */ void zza(java.lang.Object obj) {
                ((com.google.android.gms.internal.ads.zzetc) obj).zzj(com.google.android.gms.ads.internal.client.zze.this);
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzdeq
    public final void zzl() {
        zzs(this.zzd, com.google.android.gms.internal.ads.zzdgr.zza);
    }

    @Override // com.google.android.gms.internal.ads.zzdfi
    public final void zzm(final com.google.android.gms.ads.internal.client.zzt zztVar) {
        zzs(this.zzb, new com.google.android.gms.internal.ads.zzdhh() { // from class: com.google.android.gms.internal.ads.zzdga
            @Override // com.google.android.gms.internal.ads.zzdhh
            public final /* synthetic */ void zza(java.lang.Object obj) {
                ((com.google.android.gms.internal.ads.zzetc) obj).zzm(com.google.android.gms.ads.internal.client.zzt.this);
            }
        });
        zzs(this.zze, new com.google.android.gms.internal.ads.zzdhh() { // from class: com.google.android.gms.internal.ads.zzdgb
            @Override // com.google.android.gms.internal.ads.zzdhh
            public final /* synthetic */ void zza(java.lang.Object obj) {
                ((com.google.android.gms.internal.ads.zzfjj) obj).zzm(com.google.android.gms.ads.internal.client.zzt.this);
            }
        });
        zzs(this.zzd, new com.google.android.gms.internal.ads.zzdhh() { // from class: com.google.android.gms.internal.ads.zzdgc
            @Override // com.google.android.gms.internal.ads.zzdhh
            public final /* synthetic */ void zza(java.lang.Object obj) {
                ((com.google.android.gms.internal.ads.zzfge) obj).zzm(com.google.android.gms.ads.internal.client.zzt.this);
            }
        });
    }

    public final com.google.android.gms.internal.ads.zzdgh zzn() {
        return this.zza;
    }

    final /* synthetic */ void zzo(com.google.android.gms.internal.ads.zzetc zzetcVar) {
        this.zzb = zzetcVar;
    }

    final /* synthetic */ void zzp(com.google.android.gms.internal.ads.zzetg zzetgVar) {
        this.zzc = zzetgVar;
    }

    final /* synthetic */ void zzq(com.google.android.gms.internal.ads.zzfge zzfgeVar) {
        this.zzd = zzfgeVar;
    }

    final /* synthetic */ void zzr(com.google.android.gms.internal.ads.zzfjj zzfjjVar) {
        this.zze = zzfjjVar;
    }
}
