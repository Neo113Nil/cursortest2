package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@25.2.0 */
/* loaded from: classes4.dex */
public final class zzdqy implements android.view.View.OnClickListener {
    java.lang.String zza;
    java.lang.Long zzb;
    java.lang.ref.WeakReference zzc;
    private final com.google.android.gms.internal.ads.zzdux zzd;
    private final com.google.android.gms.common.util.Clock zze;
    private com.google.android.gms.internal.ads.zzbns zzf;
    private com.google.android.gms.internal.ads.zzbpq zzg;

    public zzdqy(com.google.android.gms.internal.ads.zzdux zzduxVar, com.google.android.gms.common.util.Clock clock) {
        this.zzd = zzduxVar;
        this.zze = clock;
    }

    private final void zzd() {
        android.view.View view;
        this.zza = null;
        this.zzb = null;
        java.lang.ref.WeakReference weakReference = this.zzc;
        if (weakReference == null || (view = (android.view.View) weakReference.get()) == null) {
            return;
        }
        view.setClickable(false);
        view.setOnClickListener(null);
        this.zzc = null;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.lang.ref.WeakReference weakReference = this.zzc;
        if (weakReference == null || weakReference.get() != view) {
            return;
        }
        if (this.zza != null && this.zzb != null) {
            java.util.HashMap hashMap = new java.util.HashMap();
            hashMap.put("id", this.zza);
            hashMap.put("time_interval", java.lang.String.valueOf(this.zze.currentTimeMillis() - this.zzb.longValue()));
            hashMap.put("messageType", "onePointFiveClick");
            this.zzd.zzf("sendMessageToNativeJs", hashMap);
        }
        zzd();
    }

    public final void zza(final com.google.android.gms.internal.ads.zzbns zzbnsVar) {
        this.zzf = zzbnsVar;
        com.google.android.gms.internal.ads.zzbpq zzbpqVar = this.zzg;
        if (zzbpqVar != null) {
            this.zzd.zze("/unconfirmedClick", zzbpqVar);
        }
        com.google.android.gms.internal.ads.zzbpq zzbpqVar2 = new com.google.android.gms.internal.ads.zzbpq() { // from class: com.google.android.gms.internal.ads.zzdqx
            @Override // com.google.android.gms.internal.ads.zzbpq
            public final /* synthetic */ void zza(java.lang.Object obj, java.util.Map map) {
                com.google.android.gms.internal.ads.zzdqy zzdqyVar = com.google.android.gms.internal.ads.zzdqy.this;
                try {
                    zzdqyVar.zzb = java.lang.Long.valueOf(java.lang.Long.parseLong((java.lang.String) map.get(com.ironsource.C4.a.d)));
                } catch (java.lang.NumberFormatException unused) {
                    int i = com.google.android.gms.ads.internal.util.zze.zza;
                    com.google.android.gms.ads.internal.util.client.zzo.zzf("Failed to call parse unconfirmedClickTimestamp.");
                }
                com.google.android.gms.internal.ads.zzbns zzbnsVar2 = zzbnsVar;
                zzdqyVar.zza = (java.lang.String) map.get("id");
                java.lang.String str = (java.lang.String) map.get("asset_id");
                if (zzbnsVar2 == null) {
                    int i2 = com.google.android.gms.ads.internal.util.zze.zza;
                    com.google.android.gms.ads.internal.util.client.zzo.zzd("Received unconfirmed click but UnconfirmedClickListener is null.");
                } else {
                    try {
                        zzbnsVar2.zze(str);
                    } catch (android.os.RemoteException e) {
                        com.google.android.gms.ads.internal.util.client.zzo.zzl("#007 Could not call remote method.", e);
                    }
                }
            }
        };
        this.zzg = zzbpqVar2;
        this.zzd.zzd("/unconfirmedClick", zzbpqVar2);
    }

    public final com.google.android.gms.internal.ads.zzbns zzb() {
        return this.zzf;
    }

    public final void zzc() {
        if (this.zzf == null || this.zzb == null) {
            return;
        }
        zzd();
        try {
            this.zzf.zzf();
        } catch (android.os.RemoteException e) {
            com.google.android.gms.ads.internal.util.client.zzo.zzl("#007 Could not call remote method.", e);
        }
    }
}
