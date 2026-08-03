package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@25.2.0 */
@javax.annotation.ParametersAreNonnullByDefault
/* loaded from: classes4.dex */
public final class zzdqm extends com.google.android.gms.internal.ads.zzbmm implements android.view.ViewTreeObserver.OnGlobalLayoutListener, android.view.ViewTreeObserver.OnScrollChangedListener, com.google.android.gms.internal.ads.zzdrq {
    private final java.lang.ref.WeakReference zza;
    private final java.util.Map zzb = new java.util.HashMap();
    private final java.util.Map zzc = new java.util.HashMap();
    private final java.util.Map zzd = new java.util.HashMap();
    private com.google.android.gms.internal.ads.zzdpo zze;
    private com.google.android.gms.internal.ads.zzbes zzf;

    public zzdqm(android.view.View view, java.util.HashMap hashMap, java.util.HashMap hashMap2) {
        view.setOnTouchListener(this);
        view.setOnClickListener(this);
        com.google.android.gms.ads.internal.zzt.zzC();
        com.google.android.gms.internal.ads.zzcge.zza(view, this);
        com.google.android.gms.ads.internal.zzt.zzC();
        com.google.android.gms.internal.ads.zzcge.zzb(view, this);
        this.zza = new java.lang.ref.WeakReference(view);
        for (java.util.Map.Entry entry : hashMap.entrySet()) {
            java.lang.String str = (java.lang.String) entry.getKey();
            android.view.View view2 = (android.view.View) entry.getValue();
            if (view2 != null) {
                this.zzb.put(str, new java.lang.ref.WeakReference(view2));
                if (!com.google.android.gms.ads.formats.NativeAd.ASSET_ADCHOICES_CONTAINER_VIEW.equals(str) && !"3011".equals(str)) {
                    view2.setOnTouchListener(this);
                    view2.setClickable(true);
                    view2.setOnClickListener(this);
                }
            }
        }
        this.zzd.putAll(this.zzb);
        for (java.util.Map.Entry entry2 : hashMap2.entrySet()) {
            android.view.View view3 = (android.view.View) entry2.getValue();
            if (view3 != null) {
                this.zzc.put((java.lang.String) entry2.getKey(), new java.lang.ref.WeakReference(view3));
                view3.setOnTouchListener(this);
                view3.setClickable(false);
            }
        }
        this.zzd.putAll(this.zzc);
        this.zzf = new com.google.android.gms.internal.ads.zzbes(view.getContext(), view);
    }

    @Override // android.view.View.OnClickListener
    public final synchronized void onClick(android.view.View view) {
        com.google.android.gms.internal.ads.zzdpo zzdpoVar = this.zze;
        if (zzdpoVar != null) {
            zzdpoVar.zzi(view, zzdF(), zzi(), zzj(), true);
        }
    }

    @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
    public final synchronized void onGlobalLayout() {
        com.google.android.gms.internal.ads.zzdpo zzdpoVar = this.zze;
        if (zzdpoVar != null) {
            zzdpoVar.zzu(zzdF(), zzi(), zzj(), com.google.android.gms.internal.ads.zzdpo.zzI(zzdF()));
        }
    }

    @Override // android.view.ViewTreeObserver.OnScrollChangedListener
    public final synchronized void onScrollChanged() {
        com.google.android.gms.internal.ads.zzdpo zzdpoVar = this.zze;
        if (zzdpoVar != null) {
            zzdpoVar.zzu(zzdF(), zzi(), zzj(), com.google.android.gms.internal.ads.zzdpo.zzI(zzdF()));
        }
    }

    @Override // android.view.View.OnTouchListener
    public final synchronized boolean onTouch(android.view.View view, android.view.MotionEvent motionEvent) {
        com.google.android.gms.internal.ads.zzdpo zzdpoVar = this.zze;
        if (zzdpoVar != null) {
            zzdpoVar.zzk(view, motionEvent, zzdF());
        }
        return false;
    }

    @Override // com.google.android.gms.internal.ads.zzbmn
    public final synchronized void zzb(com.google.android.gms.dynamic.IObjectWrapper iObjectWrapper) {
        java.lang.Object unwrap = com.google.android.gms.dynamic.ObjectWrapper.unwrap(iObjectWrapper);
        if (!(unwrap instanceof com.google.android.gms.internal.ads.zzdpo)) {
            int i = com.google.android.gms.ads.internal.util.zze.zza;
            com.google.android.gms.ads.internal.util.client.zzo.zzi("Not an instance of InternalNativeAd. This is most likely a transient error");
            return;
        }
        com.google.android.gms.internal.ads.zzdpo zzdpoVar = this.zze;
        if (zzdpoVar != null) {
            zzdpoVar.zzh(this);
        }
        com.google.android.gms.internal.ads.zzdpo zzdpoVar2 = (com.google.android.gms.internal.ads.zzdpo) unwrap;
        if (!zzdpoVar2.zzJ()) {
            int i2 = com.google.android.gms.ads.internal.util.zze.zza;
            com.google.android.gms.ads.internal.util.client.zzo.zzf("Your account must be enabled to use this feature. Talk to your account manager to request this feature for your account.");
        } else {
            this.zze = zzdpoVar2;
            zzdpoVar2.zzg(this);
            this.zze.zzN(zzdF());
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbmn
    public final synchronized void zzc() {
        com.google.android.gms.internal.ads.zzdpo zzdpoVar = this.zze;
        if (zzdpoVar != null) {
            zzdpoVar.zzh(this);
            this.zze = null;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbmn
    public final synchronized void zzd(com.google.android.gms.dynamic.IObjectWrapper iObjectWrapper) {
        if (this.zze != null) {
            java.lang.Object unwrap = com.google.android.gms.dynamic.ObjectWrapper.unwrap(iObjectWrapper);
            if (!(unwrap instanceof android.view.View)) {
                int i = com.google.android.gms.ads.internal.util.zze.zza;
                com.google.android.gms.ads.internal.util.client.zzo.zzi("Calling NativeAdViewHolderNonagonDelegate.setClickConfirmingView with wrong wrapped object");
            }
            this.zze.zzx((android.view.View) unwrap);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzdrq
    public final android.widget.FrameLayout zzdA() {
        return null;
    }

    @Override // com.google.android.gms.internal.ads.zzdrq
    public final android.view.View zzdF() {
        return (android.view.View) this.zza.get();
    }

    @Override // com.google.android.gms.internal.ads.zzdrq
    public final com.google.android.gms.internal.ads.zzbes zzg() {
        return this.zzf;
    }

    @Override // com.google.android.gms.internal.ads.zzdrq
    public final synchronized void zzh(java.lang.String str, android.view.View view, boolean z) {
        this.zzd.put(str, new java.lang.ref.WeakReference(view));
        if (!com.google.android.gms.ads.formats.NativeAd.ASSET_ADCHOICES_CONTAINER_VIEW.equals(str) && !"3011".equals(str)) {
            this.zzb.put(str, new java.lang.ref.WeakReference(view));
            view.setClickable(true);
            view.setOnClickListener(this);
            view.setOnTouchListener(this);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzdrq
    public final synchronized java.util.Map zzi() {
        return this.zzd;
    }

    @Override // com.google.android.gms.internal.ads.zzdrq
    public final synchronized java.util.Map zzj() {
        return this.zzb;
    }

    @Override // com.google.android.gms.internal.ads.zzdrq
    public final synchronized java.util.Map zzk() {
        return this.zzc;
    }

    @Override // com.google.android.gms.internal.ads.zzdrq
    public final synchronized android.view.View zzl(java.lang.String str) {
        java.lang.ref.WeakReference weakReference = (java.lang.ref.WeakReference) this.zzd.get(str);
        if (weakReference == null) {
            return null;
        }
        return (android.view.View) weakReference.get();
    }

    @Override // com.google.android.gms.internal.ads.zzdrq
    public final synchronized java.lang.String zzm() {
        return "1007";
    }

    @Override // com.google.android.gms.internal.ads.zzdrq
    public final synchronized com.google.android.gms.dynamic.IObjectWrapper zzn() {
        return null;
    }

    @Override // com.google.android.gms.internal.ads.zzdrq
    public final synchronized org.json.JSONObject zzo() {
        return null;
    }

    @Override // com.google.android.gms.internal.ads.zzdrq
    public final synchronized org.json.JSONObject zzp() {
        com.google.android.gms.internal.ads.zzdpo zzdpoVar = this.zze;
        if (zzdpoVar == null) {
            return null;
        }
        return zzdpoVar.zzw(zzdF(), zzi(), zzj());
    }
}
