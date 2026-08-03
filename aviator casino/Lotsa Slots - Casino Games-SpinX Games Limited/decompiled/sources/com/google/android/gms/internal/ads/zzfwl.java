package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@25.2.0 */
/* loaded from: classes4.dex */
public final class zzfwl {
    private final java.util.HashMap zza = new java.util.HashMap();
    private final java.util.HashMap zzb = new java.util.HashMap();
    private final java.util.HashMap zzc = new java.util.HashMap();
    private final java.util.HashSet zzd = new java.util.HashSet();
    private final java.util.HashSet zze = new java.util.HashSet();
    private final java.util.HashSet zzf = new java.util.HashSet();
    private final java.util.HashMap zzg = new java.util.HashMap();
    private final java.util.HashSet zzh = new java.util.HashSet();
    private final java.util.Map zzi = new java.util.WeakHashMap();
    private boolean zzj;

    public final java.util.HashSet zza() {
        return this.zze;
    }

    public final java.util.HashSet zzb() {
        return this.zzf;
    }

    public final java.lang.String zzc(java.lang.String str) {
        return (java.lang.String) this.zzg.get(str);
    }

    /* JADX WARN: Removed duplicated region for block: B:29:0x0053  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0060  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0104 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00bb A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:58:0x0063  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void zzd() {
        boolean z;
        java.lang.Boolean bool;
        android.app.Activity activity;
        com.google.android.gms.internal.ads.zzfvi zza = com.google.android.gms.internal.ads.zzfvi.zza();
        if (zza != null) {
            for (com.google.android.gms.internal.ads.zzfuo zzfuoVar : zza.zzf()) {
                android.view.View zzi = zzfuoVar.zzi();
                if (zzfuoVar.zzj()) {
                    java.lang.String zzh = zzfuoVar.zzh();
                    if (zzi != null) {
                        java.lang.String str = null;
                        if (android.os.Build.VERSION.SDK_INT >= 24) {
                            android.content.Context context = zzi.getContext();
                            while (true) {
                                if (!(context instanceof android.content.ContextWrapper)) {
                                    activity = null;
                                    break;
                                } else {
                                    if (context instanceof android.app.Activity) {
                                        activity = (android.app.Activity) context;
                                        break;
                                    }
                                    context = ((android.content.ContextWrapper) context).getBaseContext();
                                }
                            }
                            if (activity != null) {
                                z = activity.isInPictureInPictureMode();
                                if (z) {
                                    this.zzh.add(zzh);
                                }
                                if (zzi.isAttachedToWindow()) {
                                    str = "notAttached";
                                } else {
                                    if (zzi.hasWindowFocus()) {
                                        this.zzi.remove(zzi);
                                        bool = false;
                                    } else {
                                        java.util.Map map = this.zzi;
                                        if (map.containsKey(zzi)) {
                                            bool = (java.lang.Boolean) map.get(zzi);
                                        } else {
                                            map.put(zzi, false);
                                            bool = false;
                                        }
                                    }
                                    if (!bool.booleanValue() || z) {
                                        java.util.HashSet hashSet = new java.util.HashSet();
                                        android.view.View view = zzi;
                                        while (true) {
                                            if (view == null) {
                                                this.zzd.addAll(hashSet);
                                                break;
                                            }
                                            java.lang.String zza2 = com.google.android.gms.internal.ads.zzfwj.zza(view);
                                            if (zza2 != null) {
                                                str = zza2;
                                                break;
                                            } else {
                                                hashSet.add(view);
                                                java.lang.Object parent = view.getParent();
                                                view = parent instanceof android.view.View ? (android.view.View) parent : null;
                                            }
                                        }
                                    } else {
                                        str = "noWindowFocus";
                                    }
                                }
                                if (str != null) {
                                    this.zze.add(zzh);
                                    this.zza.put(zzi, zzh);
                                    for (com.google.android.gms.internal.ads.zzfvl zzfvlVar : zzfuoVar.zzf()) {
                                        android.view.View view2 = (android.view.View) zzfvlVar.zza().get();
                                        if (view2 != null) {
                                            java.util.HashMap hashMap = this.zzb;
                                            com.google.android.gms.internal.ads.zzfwk zzfwkVar = (com.google.android.gms.internal.ads.zzfwk) hashMap.get(view2);
                                            if (zzfwkVar != null) {
                                                zzfwkVar.zza(zzfuoVar.zzh());
                                            } else {
                                                hashMap.put(view2, new com.google.android.gms.internal.ads.zzfwk(zzfvlVar, zzfuoVar.zzh()));
                                            }
                                        }
                                    }
                                } else if (str != "noWindowFocus") {
                                    this.zzf.add(zzh);
                                    this.zzc.put(zzh, zzi);
                                    this.zzg.put(zzh, str);
                                }
                            }
                        }
                        z = false;
                        if (z) {
                        }
                        if (zzi.isAttachedToWindow()) {
                        }
                        if (str != null) {
                        }
                    } else {
                        this.zzf.add(zzh);
                        this.zzg.put(zzh, "noAdView");
                    }
                }
            }
        }
    }

    public final void zze() {
        this.zza.clear();
        this.zzb.clear();
        this.zzc.clear();
        this.zzd.clear();
        this.zze.clear();
        this.zzf.clear();
        this.zzg.clear();
        this.zzj = false;
        this.zzh.clear();
    }

    public final void zzf() {
        this.zzj = true;
    }

    public final java.lang.String zzg(android.view.View view) {
        java.util.HashMap hashMap = this.zza;
        if (hashMap.size() == 0) {
            return null;
        }
        java.lang.String str = (java.lang.String) hashMap.get(view);
        if (str != null) {
            hashMap.remove(view);
        }
        return str;
    }

    public final android.view.View zzh(java.lang.String str) {
        return (android.view.View) this.zzc.get(str);
    }

    public final com.google.android.gms.internal.ads.zzfwk zzi(android.view.View view) {
        java.util.HashMap hashMap = this.zzb;
        com.google.android.gms.internal.ads.zzfwk zzfwkVar = (com.google.android.gms.internal.ads.zzfwk) hashMap.get(view);
        if (zzfwkVar != null) {
            hashMap.remove(view);
        }
        return zzfwkVar;
    }

    public final boolean zzj(android.view.View view) {
        java.util.Map map = this.zzi;
        if (!map.containsKey(view)) {
            return true;
        }
        map.put(view, true);
        return false;
    }

    public final boolean zzk(java.lang.String str) {
        return this.zzh.contains(str);
    }

    public final int zzl(android.view.View view) {
        if (this.zzd.contains(view)) {
            return 1;
        }
        return this.zzj ? 2 : 3;
    }
}
