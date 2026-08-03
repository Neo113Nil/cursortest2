package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@25.2.0 */
/* loaded from: classes4.dex */
public final class zzdro {
    private final com.google.android.gms.internal.ads.zzdwi zza;
    private final com.google.android.gms.internal.ads.zzdux zzb;
    private android.view.ViewTreeObserver.OnScrollChangedListener zzc = null;

    public zzdro(com.google.android.gms.internal.ads.zzdwi zzdwiVar, com.google.android.gms.internal.ads.zzdux zzduxVar) {
        this.zza = zzdwiVar;
        this.zzb = zzduxVar;
    }

    private static final int zzf(android.content.Context context, java.lang.String str, int i) {
        try {
            i = java.lang.Integer.parseInt(str);
        } catch (java.lang.NumberFormatException unused) {
        }
        com.google.android.gms.ads.internal.client.zzay.zza();
        return com.google.android.gms.ads.internal.util.client.zzf.zzE(context, i);
    }

    public final android.view.View zza(final android.view.View view, final android.view.WindowManager windowManager) throws com.google.android.gms.internal.ads.zzclj {
        com.google.android.gms.internal.ads.zzcku zza = this.zza.zza(com.google.android.gms.ads.internal.client.zzr.zzb(), null, null);
        zza.zzE().setVisibility(4);
        zza.zzE().setContentDescription("policy_validator");
        zza.zzab("/sendMessageToSdk", new com.google.android.gms.internal.ads.zzbpq() { // from class: com.google.android.gms.internal.ads.zzdrn
            @Override // com.google.android.gms.internal.ads.zzbpq
            public final /* synthetic */ void zza(java.lang.Object obj, java.util.Map map) {
                com.google.android.gms.internal.ads.zzdro.this.zzb((com.google.android.gms.internal.ads.zzcku) obj, map);
            }
        });
        zza.zzab("/hideValidatorOverlay", new com.google.android.gms.internal.ads.zzbpq() { // from class: com.google.android.gms.internal.ads.zzdri
            @Override // com.google.android.gms.internal.ads.zzbpq
            public final /* synthetic */ void zza(java.lang.Object obj, java.util.Map map) {
                com.google.android.gms.internal.ads.zzdro.this.zzc(windowManager, view, (com.google.android.gms.internal.ads.zzcku) obj, map);
            }
        });
        zza.zzab("/open", new com.google.android.gms.internal.ads.zzbqd(null, null, null, null, null, null));
        java.lang.ref.WeakReference weakReference = new java.lang.ref.WeakReference(zza);
        com.google.android.gms.internal.ads.zzbpq zzbpqVar = new com.google.android.gms.internal.ads.zzbpq() { // from class: com.google.android.gms.internal.ads.zzdrj
            @Override // com.google.android.gms.internal.ads.zzbpq
            public final /* synthetic */ void zza(java.lang.Object obj, java.util.Map map) {
                com.google.android.gms.internal.ads.zzdro.this.zzd(view, windowManager, (com.google.android.gms.internal.ads.zzcku) obj, map);
            }
        };
        com.google.android.gms.internal.ads.zzdux zzduxVar = this.zzb;
        zzduxVar.zzh(weakReference, "/loadNativeAdPolicyViolations", zzbpqVar);
        zzduxVar.zzh(new java.lang.ref.WeakReference(zza), "/showValidatorOverlay", com.google.android.gms.internal.ads.zzdrk.zza);
        return zza.zzE();
    }

    final /* synthetic */ void zzb(com.google.android.gms.internal.ads.zzcku zzckuVar, java.util.Map map) {
        this.zzb.zzf("sendMessageToNativeJs", map);
    }

    final /* synthetic */ void zzc(android.view.WindowManager windowManager, android.view.View view, com.google.android.gms.internal.ads.zzcku zzckuVar, java.util.Map map) {
        int i = com.google.android.gms.ads.internal.util.zze.zza;
        com.google.android.gms.ads.internal.util.client.zzo.zzd("Hide native ad policy validator overlay.");
        zzckuVar.zzE().setVisibility(8);
        if (zzckuVar.zzE().getWindowToken() != null) {
            windowManager.removeView(zzckuVar.zzE());
        }
        zzckuVar.destroy();
        android.view.ViewTreeObserver viewTreeObserver = view.getViewTreeObserver();
        if (this.zzc == null || viewTreeObserver == null || !viewTreeObserver.isAlive()) {
            return;
        }
        viewTreeObserver.removeOnScrollChangedListener(this.zzc);
    }

    final /* synthetic */ void zzd(final android.view.View view, final android.view.WindowManager windowManager, final com.google.android.gms.internal.ads.zzcku zzckuVar, final java.util.Map map) {
        zzckuVar.zzP().zzG(new com.google.android.gms.internal.ads.zzcmq() { // from class: com.google.android.gms.internal.ads.zzdrm
            @Override // com.google.android.gms.internal.ads.zzcmq
            public final /* synthetic */ void zza(boolean z, int i, java.lang.String str, java.lang.String str2) {
                com.google.android.gms.internal.ads.zzdro.this.zze(map, z, i, str, str2);
            }
        });
        if (map == null) {
            return;
        }
        android.content.Context context = view.getContext();
        int zzf = zzf(context, (java.lang.String) map.get("validator_width"), ((java.lang.Integer) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(com.google.android.gms.internal.ads.zzbiq.zzjq)).intValue());
        int zzf2 = zzf(context, (java.lang.String) map.get("validator_height"), ((java.lang.Integer) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(com.google.android.gms.internal.ads.zzbiq.zzjr)).intValue());
        int zzf3 = zzf(context, (java.lang.String) map.get("validator_x"), 0);
        int zzf4 = zzf(context, (java.lang.String) map.get("validator_y"), 0);
        zzckuVar.zzaf(com.google.android.gms.internal.ads.zzcne.zzc(zzf, zzf2));
        try {
            zzckuVar.zzD().getSettings().setUseWideViewPort(((java.lang.Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(com.google.android.gms.internal.ads.zzbiq.zzjs)).booleanValue());
            zzckuVar.zzD().getSettings().setLoadWithOverviewMode(((java.lang.Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(com.google.android.gms.internal.ads.zzbiq.zzjt)).booleanValue());
        } catch (java.lang.NullPointerException unused) {
        }
        final android.view.WindowManager.LayoutParams zzk = com.google.android.gms.ads.internal.util.zzbs.zzk();
        zzk.x = zzf3;
        zzk.y = zzf4;
        windowManager.updateViewLayout(zzckuVar.zzE(), zzk);
        final java.lang.String str = (java.lang.String) map.get("orientation");
        android.graphics.Rect rect = new android.graphics.Rect();
        if (view.getGlobalVisibleRect(rect)) {
            final int i = (("1".equals(str) || "2".equals(str)) ? rect.bottom : rect.top) - zzf4;
            this.zzc = new android.view.ViewTreeObserver.OnScrollChangedListener() { // from class: com.google.android.gms.internal.ads.zzdrl
                @Override // android.view.ViewTreeObserver.OnScrollChangedListener
                public final /* synthetic */ void onScrollChanged() {
                    android.graphics.Rect rect2 = new android.graphics.Rect();
                    if (view.getGlobalVisibleRect(rect2)) {
                        com.google.android.gms.internal.ads.zzcku zzckuVar2 = zzckuVar;
                        if (zzckuVar2.zzE().getWindowToken() == null) {
                            return;
                        }
                        int i2 = i;
                        android.view.WindowManager.LayoutParams layoutParams = zzk;
                        java.lang.String str2 = str;
                        if ("1".equals(str2) || "2".equals(str2)) {
                            layoutParams.y = rect2.bottom - i2;
                        } else {
                            layoutParams.y = rect2.top - i2;
                        }
                        windowManager.updateViewLayout(zzckuVar2.zzE(), layoutParams);
                    }
                }
            };
            android.view.ViewTreeObserver viewTreeObserver = view.getViewTreeObserver();
            if (viewTreeObserver != null && viewTreeObserver.isAlive()) {
                viewTreeObserver.addOnScrollChangedListener(this.zzc);
            }
        }
        java.lang.String str2 = (java.lang.String) map.get("overlay_url");
        if (android.text.TextUtils.isEmpty(str2)) {
            return;
        }
        zzckuVar.loadUrl(str2);
    }

    final /* synthetic */ void zze(java.util.Map map, boolean z, int i, java.lang.String str, java.lang.String str2) {
        java.util.HashMap hashMap = new java.util.HashMap();
        hashMap.put("messageType", "validatorHtmlLoaded");
        hashMap.put("id", (java.lang.String) map.get("id"));
        this.zzb.zzf("sendMessageToNativeJs", hashMap);
    }
}
