package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@25.2.0 */
@javax.annotation.ParametersAreNonnullByDefault
/* loaded from: classes4.dex */
public final class zzdrv implements com.google.android.gms.internal.ads.zzdqb, com.google.android.gms.internal.ads.zzdht {
    private final com.google.android.gms.internal.ads.zzbvr zza;
    private final com.google.android.gms.internal.ads.zzddj zzb;
    private final com.google.android.gms.internal.ads.zzdfk zzc;
    private final com.google.android.gms.internal.ads.zzdcp zzd;
    private final com.google.android.gms.internal.ads.zzdkw zze;
    private final android.content.Context zzf;
    private final com.google.android.gms.internal.ads.zzfkf zzg;
    private final com.google.android.gms.ads.internal.util.client.VersionInfoParcel zzh;
    private final com.google.android.gms.internal.ads.zzfky zzi;
    private boolean zzj = false;
    private boolean zzk = false;
    private boolean zzl = true;
    private final com.google.android.gms.internal.ads.zzbvn zzm;
    private final com.google.android.gms.internal.ads.zzbvo zzn;

    public zzdrv(com.google.android.gms.internal.ads.zzbvn zzbvnVar, com.google.android.gms.internal.ads.zzbvo zzbvoVar, com.google.android.gms.internal.ads.zzbvr zzbvrVar, com.google.android.gms.internal.ads.zzddj zzddjVar, com.google.android.gms.internal.ads.zzdfk zzdfkVar, com.google.android.gms.internal.ads.zzdcp zzdcpVar, com.google.android.gms.internal.ads.zzdkw zzdkwVar, android.content.Context context, com.google.android.gms.internal.ads.zzfkf zzfkfVar, com.google.android.gms.ads.internal.util.client.VersionInfoParcel versionInfoParcel, com.google.android.gms.internal.ads.zzfky zzfkyVar) {
        this.zzm = zzbvnVar;
        this.zzn = zzbvoVar;
        this.zza = zzbvrVar;
        this.zzb = zzddjVar;
        this.zzc = zzdfkVar;
        this.zzd = zzdcpVar;
        this.zze = zzdkwVar;
        this.zzf = context;
        this.zzg = zzfkfVar;
        this.zzh = versionInfoParcel;
        this.zzi = zzfkyVar;
    }

    private static final java.util.HashMap zzB(java.util.Map map) {
        java.util.HashMap hashMap = new java.util.HashMap();
        if (map != null) {
            synchronized (map) {
                for (java.util.Map.Entry entry : map.entrySet()) {
                    android.view.View view = (android.view.View) ((java.lang.ref.WeakReference) entry.getValue()).get();
                    if (view != null) {
                        hashMap.put((java.lang.String) entry.getKey(), view);
                    }
                }
            }
        }
        return hashMap;
    }

    private final void zzi(android.view.View view) {
        try {
            com.google.android.gms.internal.ads.zzbvr zzbvrVar = this.zza;
            if (zzbvrVar != null && !zzbvrVar.zzu()) {
                zzbvrVar.zzw(com.google.android.gms.dynamic.ObjectWrapper.wrap(view));
                this.zzd.onAdClicked();
                if (((java.lang.Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(com.google.android.gms.internal.ads.zzbiq.zzmh)).booleanValue()) {
                    this.zze.zzdu();
                    return;
                }
                return;
            }
            com.google.android.gms.internal.ads.zzbvn zzbvnVar = this.zzm;
            if (zzbvnVar != null && !zzbvnVar.zzq()) {
                zzbvnVar.zzn(com.google.android.gms.dynamic.ObjectWrapper.wrap(view));
                this.zzd.onAdClicked();
                if (((java.lang.Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(com.google.android.gms.internal.ads.zzbiq.zzmh)).booleanValue()) {
                    this.zze.zzdu();
                    return;
                }
                return;
            }
            com.google.android.gms.internal.ads.zzbvo zzbvoVar = this.zzn;
            if (zzbvoVar == null || zzbvoVar.zzo()) {
                return;
            }
            zzbvoVar.zzl(com.google.android.gms.dynamic.ObjectWrapper.wrap(view));
            this.zzd.onAdClicked();
            if (((java.lang.Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(com.google.android.gms.internal.ads.zzbiq.zzmh)).booleanValue()) {
                this.zze.zzdu();
            }
        } catch (android.os.RemoteException e) {
            int i = com.google.android.gms.ads.internal.util.zze.zza;
            com.google.android.gms.ads.internal.util.client.zzo.zzj("Failed to call handleClick", e);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzdqb
    public final void zzA() {
        try {
            com.google.android.gms.internal.ads.zzbvr zzbvrVar = this.zza;
            if (zzbvrVar != null) {
                zzbvrVar.zzC();
            }
        } catch (android.os.RemoteException e) {
            int i = com.google.android.gms.ads.internal.util.zze.zza;
            com.google.android.gms.ads.internal.util.client.zzo.zzj("Failed to call destroy", e);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzdqb
    public final void zza(android.view.View view, java.util.Map map, java.util.Map map2, android.view.View.OnTouchListener onTouchListener, android.view.View.OnClickListener onClickListener) {
        java.lang.Object obj;
        com.google.android.gms.dynamic.IObjectWrapper zzq;
        try {
            com.google.android.gms.dynamic.IObjectWrapper wrap = com.google.android.gms.dynamic.ObjectWrapper.wrap(view);
            org.json.JSONObject jSONObject = this.zzg.zzaj;
            boolean z = true;
            if (((java.lang.Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(com.google.android.gms.internal.ads.zzbiq.zzci)).booleanValue() && jSONObject.length() != 0) {
                java.util.Map hashMap = map == null ? new java.util.HashMap() : map;
                java.util.Map hashMap2 = map2 == null ? new java.util.HashMap() : map2;
                java.util.HashMap hashMap3 = new java.util.HashMap();
                hashMap3.putAll(hashMap);
                hashMap3.putAll(hashMap2);
                java.util.Iterator<java.lang.String> keys = jSONObject.keys();
                loop0: while (keys.hasNext()) {
                    java.lang.String next = keys.next();
                    org.json.JSONArray optJSONArray = jSONObject.optJSONArray(next);
                    if (optJSONArray != null) {
                        java.lang.ref.WeakReference weakReference = (java.lang.ref.WeakReference) hashMap3.get(next);
                        if (weakReference != null && (obj = weakReference.get()) != null) {
                            java.lang.Class<?> cls = obj.getClass();
                            if (((java.lang.Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(com.google.android.gms.internal.ads.zzbiq.zzcj)).booleanValue() && next.equals("3010")) {
                                com.google.android.gms.internal.ads.zzbvr zzbvrVar = this.zza;
                                java.lang.Object obj2 = null;
                                if (zzbvrVar != null) {
                                    try {
                                        zzq = zzbvrVar.zzq();
                                    } catch (android.os.RemoteException | java.lang.IllegalArgumentException unused) {
                                    }
                                } else {
                                    com.google.android.gms.internal.ads.zzbvn zzbvnVar = this.zzm;
                                    if (zzbvnVar != null) {
                                        zzq = zzbvnVar.zzw();
                                    } else {
                                        com.google.android.gms.internal.ads.zzbvo zzbvoVar = this.zzn;
                                        zzq = zzbvoVar != null ? zzbvoVar.zzu() : null;
                                    }
                                }
                                if (zzq != null) {
                                    obj2 = com.google.android.gms.dynamic.ObjectWrapper.unwrap(zzq);
                                }
                                if (obj2 != null) {
                                    cls = obj2.getClass();
                                }
                            }
                            try {
                                java.util.ArrayList arrayList = new java.util.ArrayList();
                                com.google.android.gms.ads.internal.util.zzbp.zza(optJSONArray, arrayList);
                                com.google.android.gms.ads.internal.zzt.zzc();
                                java.lang.ClassLoader classLoader = this.zzf.getClassLoader();
                                java.util.Iterator it = arrayList.iterator();
                                while (it.hasNext()) {
                                    if (java.lang.Class.forName((java.lang.String) it.next(), false, classLoader).isAssignableFrom(cls)) {
                                        break;
                                    }
                                }
                            } catch (org.json.JSONException unused2) {
                                continue;
                            }
                        }
                        z = false;
                        break;
                    }
                }
            }
            this.zzl = z;
            java.util.HashMap zzB = zzB(map);
            java.util.HashMap zzB2 = zzB(map2);
            com.google.android.gms.internal.ads.zzbvr zzbvrVar2 = this.zza;
            if (zzbvrVar2 != null) {
                zzbvrVar2.zzx(wrap, com.google.android.gms.dynamic.ObjectWrapper.wrap(zzB), com.google.android.gms.dynamic.ObjectWrapper.wrap(zzB2));
                return;
            }
            com.google.android.gms.internal.ads.zzbvn zzbvnVar2 = this.zzm;
            if (zzbvnVar2 != null) {
                zzbvnVar2.zzy(wrap, com.google.android.gms.dynamic.ObjectWrapper.wrap(zzB), com.google.android.gms.dynamic.ObjectWrapper.wrap(zzB2));
                zzbvnVar2.zzo(wrap);
                return;
            }
            com.google.android.gms.internal.ads.zzbvo zzbvoVar2 = this.zzn;
            if (zzbvoVar2 != null) {
                zzbvoVar2.zzw(wrap, com.google.android.gms.dynamic.ObjectWrapper.wrap(zzB), com.google.android.gms.dynamic.ObjectWrapper.wrap(zzB2));
                zzbvoVar2.zzm(wrap);
            }
        } catch (android.os.RemoteException e) {
            int i = com.google.android.gms.ads.internal.util.zze.zza;
            com.google.android.gms.ads.internal.util.client.zzo.zzj("Failed to call trackView", e);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzdqb
    public final void zzb(android.view.View view, java.util.Map map) {
        try {
            com.google.android.gms.dynamic.IObjectWrapper wrap = com.google.android.gms.dynamic.ObjectWrapper.wrap(view);
            com.google.android.gms.internal.ads.zzbvr zzbvrVar = this.zza;
            if (zzbvrVar != null) {
                zzbvrVar.zzy(wrap);
                return;
            }
            com.google.android.gms.internal.ads.zzbvn zzbvnVar = this.zzm;
            if (zzbvnVar != null) {
                zzbvnVar.zzs(wrap);
                return;
            }
            com.google.android.gms.internal.ads.zzbvo zzbvoVar = this.zzn;
            if (zzbvoVar != null) {
                zzbvoVar.zzq(wrap);
            }
        } catch (android.os.RemoteException e) {
            int i = com.google.android.gms.ads.internal.util.zze.zza;
            com.google.android.gms.ads.internal.util.client.zzo.zzj("Failed to call untrackView", e);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzdqb
    public final void zzc(android.view.View view, android.view.View view2, java.util.Map map, java.util.Map map2, boolean z, android.widget.ImageView.ScaleType scaleType) {
        if (this.zzk && this.zzg.zzL) {
            return;
        }
        zzi(view);
    }

    @Override // com.google.android.gms.internal.ads.zzdqb
    public final void zzd(java.lang.String str) {
    }

    @Override // com.google.android.gms.internal.ads.zzdht
    public final void zzdH() {
        try {
            com.google.android.gms.internal.ads.zzbvr zzbvrVar = this.zza;
            if (zzbvrVar == null || !zzbvrVar.zzt()) {
                return;
            }
            com.google.android.gms.internal.ads.zzfkf zzfkfVar = this.zzg;
            if (zzfkfVar.zze == 4 || zzfkfVar.zzaD) {
                zzbvrVar.zzv();
                this.zzb.zza();
            }
        } catch (android.os.RemoteException e) {
            int i = com.google.android.gms.ads.internal.util.zze.zza;
            com.google.android.gms.ads.internal.util.client.zzo.zzj("Failed to report impression from an adapter", e);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzdht
    public final void zzdI() {
    }

    @Override // com.google.android.gms.internal.ads.zzdqb
    public final void zze(android.os.Bundle bundle) {
    }

    @Override // com.google.android.gms.internal.ads.zzdqb
    public final void zzf(android.view.View view, android.view.View view2, java.util.Map map, java.util.Map map2, boolean z, android.widget.ImageView.ScaleType scaleType, int i) {
        if (!this.zzk) {
            int i2 = com.google.android.gms.ads.internal.util.zze.zza;
            com.google.android.gms.ads.internal.util.client.zzo.zzi("Custom click reporting for 3p ads failed. enableCustomClickGesture is not set.");
        } else if (this.zzg.zzL) {
            zzi(view2);
        } else {
            int i3 = com.google.android.gms.ads.internal.util.zze.zza;
            com.google.android.gms.ads.internal.util.client.zzo.zzi("Custom click reporting for 3p ads failed. Ad unit id not in allow list.");
        }
    }

    @Override // com.google.android.gms.internal.ads.zzdqb
    public final void zzg() {
        this.zzk = true;
    }

    @Override // com.google.android.gms.internal.ads.zzdqb
    public final boolean zzh() {
        return this.zzg.zzL;
    }

    @Override // com.google.android.gms.internal.ads.zzdqb
    public final void zzj(android.view.View view, android.view.MotionEvent motionEvent, android.view.View view2) {
    }

    @Override // com.google.android.gms.internal.ads.zzdqb
    public final void zzk(android.os.Bundle bundle) {
    }

    @Override // com.google.android.gms.internal.ads.zzdqb
    public final org.json.JSONObject zzl(android.view.View view, java.util.Map map, java.util.Map map2, android.widget.ImageView.ScaleType scaleType) {
        return null;
    }

    @Override // com.google.android.gms.internal.ads.zzdqb
    public final org.json.JSONObject zzm(android.view.View view, java.util.Map map, java.util.Map map2, android.widget.ImageView.ScaleType scaleType) {
        return null;
    }

    @Override // com.google.android.gms.internal.ads.zzdqb
    public final void zzn() {
    }

    @Override // com.google.android.gms.internal.ads.zzdqb
    public final void zzo(android.view.View view) {
    }

    @Override // com.google.android.gms.internal.ads.zzdqb
    public final void zzp(com.google.android.gms.internal.ads.zzbns zzbnsVar) {
    }

    @Override // com.google.android.gms.internal.ads.zzdqb
    public final void zzq() {
    }

    @Override // com.google.android.gms.internal.ads.zzdqb
    public final void zzr(com.google.android.gms.ads.internal.client.zzdg zzdgVar) {
        int i = com.google.android.gms.ads.internal.util.zze.zza;
        com.google.android.gms.ads.internal.util.client.zzo.zzi("Mute This Ad is not supported for 3rd party ads");
    }

    @Override // com.google.android.gms.internal.ads.zzdqb
    public final void zzs(com.google.android.gms.ads.internal.client.zzdc zzdcVar) {
        int i = com.google.android.gms.ads.internal.util.zze.zza;
        com.google.android.gms.ads.internal.util.client.zzo.zzi("Mute This Ad is not supported for 3rd party ads");
    }

    @Override // com.google.android.gms.internal.ads.zzdqb
    public final void zzt() {
        int i = com.google.android.gms.ads.internal.util.zze.zza;
        com.google.android.gms.ads.internal.util.client.zzo.zzi("Mute This Ad is not supported for 3rd party ads");
    }

    @Override // com.google.android.gms.internal.ads.zzdqb
    public final int zzu() {
        return 0;
    }

    @Override // com.google.android.gms.internal.ads.zzdqb
    public final boolean zzv() {
        return true;
    }

    @Override // com.google.android.gms.internal.ads.zzdqb
    public final void zzw(android.view.View view, java.util.Map map, java.util.Map map2, android.widget.ImageView.ScaleType scaleType) {
        try {
            if (!this.zzj) {
                this.zzj = com.google.android.gms.ads.internal.zzt.zzo().zzg(this.zzf, this.zzh.afmaVersion, this.zzg.zzC.toString(), this.zzi.zzg);
            }
            if (this.zzl) {
                com.google.android.gms.internal.ads.zzbvr zzbvrVar = this.zza;
                if (zzbvrVar == null) {
                    com.google.android.gms.internal.ads.zzbvn zzbvnVar = this.zzm;
                    if (zzbvnVar != null && !zzbvnVar.zzp()) {
                        zzbvnVar.zzm();
                        this.zzb.zza();
                        return;
                    }
                    com.google.android.gms.internal.ads.zzbvo zzbvoVar = this.zzn;
                    if (zzbvoVar == null || zzbvoVar.zzn()) {
                        return;
                    }
                    zzbvoVar.zzk();
                    this.zzb.zza();
                    return;
                }
                com.google.android.gms.internal.ads.zzfkf zzfkfVar = this.zzg;
                if (zzfkfVar.zzaD) {
                    if (zzbvrVar.zzt()) {
                        return;
                    }
                    zzbvrVar.zzv();
                    this.zzb.zza();
                    return;
                }
                if (zzbvrVar.zzt() && zzfkfVar.zze == 4) {
                    this.zzc.zza();
                } else {
                    zzbvrVar.zzv();
                    this.zzb.zza();
                }
            }
        } catch (android.os.RemoteException e) {
            int i = com.google.android.gms.ads.internal.util.zze.zza;
            com.google.android.gms.ads.internal.util.client.zzo.zzj("Failed to call recordImpression", e);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzdqb
    public final void zzx(android.view.View view, java.util.Map map, java.util.Map map2, android.widget.ImageView.ScaleType scaleType) {
    }

    @Override // com.google.android.gms.internal.ads.zzdqb
    public final void zzy() {
    }

    @Override // com.google.android.gms.internal.ads.zzdqb
    public final boolean zzz(android.os.Bundle bundle) {
        return false;
    }
}
