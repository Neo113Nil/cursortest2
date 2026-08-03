package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@25.2.0 */
/* loaded from: classes4.dex */
public final class zzfws implements com.google.android.gms.internal.ads.zzfvt {
    private static final com.google.android.gms.internal.ads.zzfws zza = new com.google.android.gms.internal.ads.zzfws();
    private static final android.os.Handler zzb = new android.os.Handler(android.os.Looper.getMainLooper());
    private static android.os.Handler zzc = null;
    private static final java.lang.Runnable zzk = new com.google.android.gms.internal.ads.zzfwo();
    private static final java.lang.Runnable zzl = new com.google.android.gms.internal.ads.zzfwp();
    private int zze;
    private long zzj;
    private final java.util.List zzd = new java.util.ArrayList();
    private final java.util.List zzf = new java.util.ArrayList();
    private final com.google.android.gms.internal.ads.zzfwl zzh = new com.google.android.gms.internal.ads.zzfwl();
    private final com.google.android.gms.internal.ads.zzfvv zzg = new com.google.android.gms.internal.ads.zzfvv();
    private final com.google.android.gms.internal.ads.zzfwm zzi = new com.google.android.gms.internal.ads.zzfwm(new com.google.android.gms.internal.ads.zzfwv());

    zzfws() {
    }

    public static com.google.android.gms.internal.ads.zzfws zzb() {
        return zza;
    }

    private final void zzk(android.view.View view, com.google.android.gms.internal.ads.zzfvu zzfvuVar, org.json.JSONObject jSONObject, int i, boolean z) {
        zzfvuVar.zzb(view, jSONObject, this, i == 1, z);
    }

    private static final void zzl() {
        android.os.Handler handler = zzc;
        if (handler != null) {
            handler.removeCallbacks(zzl);
            zzc = null;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzfvt
    public final void zza(android.view.View view, com.google.android.gms.internal.ads.zzfvu zzfvuVar, org.json.JSONObject jSONObject, boolean z) {
        com.google.android.gms.internal.ads.zzfwl zzfwlVar;
        int zzl2;
        boolean z2;
        if (com.google.android.gms.internal.ads.zzfwj.zza(view) != null || (zzl2 = (zzfwlVar = this.zzh).zzl(view)) == 3) {
            return;
        }
        org.json.JSONObject zza2 = zzfvuVar.zza(view);
        com.google.android.gms.internal.ads.zzfwe.zze(jSONObject, zza2);
        java.lang.String zzg = zzfwlVar.zzg(view);
        if (zzg != null) {
            com.google.android.gms.internal.ads.zzfwe.zzd(zza2, zzg);
            try {
                zza2.put("hasWindowFocus", java.lang.Boolean.valueOf(this.zzh.zzj(view)));
            } catch (org.json.JSONException e) {
                com.google.android.gms.internal.ads.zzfwf.zza("Error with setting has window focus", e);
            }
            boolean zzk2 = this.zzh.zzk(zzg);
            java.lang.Object valueOf = java.lang.Boolean.valueOf(zzk2);
            valueOf.getClass();
            if (zzk2) {
                try {
                    zza2.put("isPipActive", valueOf);
                } catch (org.json.JSONException e2) {
                    com.google.android.gms.internal.ads.zzfwf.zza("Error with setting is picture-in-picture active", e2);
                }
            }
            this.zzh.zzf();
        } else {
            com.google.android.gms.internal.ads.zzfwk zzi = zzfwlVar.zzi(view);
            if (zzi != null) {
                com.google.android.gms.internal.ads.zzfvl zzb2 = zzi.zzb();
                org.json.JSONArray jSONArray = new org.json.JSONArray();
                java.util.ArrayList zzc2 = zzi.zzc();
                int size = zzc2.size();
                for (int i = 0; i < size; i++) {
                    jSONArray.put((java.lang.String) zzc2.get(i));
                }
                try {
                    zza2.put("isFriendlyObstructionFor", jSONArray);
                    zza2.put("friendlyObstructionClass", zzb2.zzb());
                    zza2.put("friendlyObstructionPurpose", zzb2.zzc());
                    zza2.put("friendlyObstructionReason", zzb2.zzd());
                } catch (org.json.JSONException e3) {
                    com.google.android.gms.internal.ads.zzfwf.zza("Error with setting friendly obstruction", e3);
                }
                z2 = true;
            } else {
                z2 = false;
            }
            zzk(view, zzfvuVar, zza2, zzl2, z || z2);
        }
        this.zze++;
    }

    public final void zzc() {
        if (zzc == null) {
            android.os.Handler handler = new android.os.Handler(android.os.Looper.getMainLooper());
            zzc = handler;
            handler.post(zzk);
            zzc.postDelayed(zzl, 200L);
        }
    }

    public final void zzd() {
        zzl();
        this.zzd.clear();
        zzb.post(new com.google.android.gms.internal.ads.zzfwn(this));
    }

    public final void zze() {
        zzl();
    }

    final /* synthetic */ void zzf() {
        this.zze = 0;
        this.zzf.clear();
        for (com.google.android.gms.internal.ads.zzfuo zzfuoVar : com.google.android.gms.internal.ads.zzfvi.zza().zzf()) {
        }
        this.zzj = java.lang.System.nanoTime();
        com.google.android.gms.internal.ads.zzfwl zzfwlVar = this.zzh;
        zzfwlVar.zzd();
        com.google.android.gms.internal.ads.zzfvv zzfvvVar = this.zzg;
        long nanoTime = java.lang.System.nanoTime();
        com.google.android.gms.internal.ads.zzfvu zza2 = zzfvvVar.zza();
        if (zzfwlVar.zzb().size() > 0) {
            java.util.Iterator it = zzfwlVar.zzb().iterator();
            while (it.hasNext()) {
                java.lang.String str = (java.lang.String) it.next();
                org.json.JSONObject zza3 = zza2.zza(null);
                android.view.View zzh = zzfwlVar.zzh(str);
                com.google.android.gms.internal.ads.zzfvu zzb2 = zzfvvVar.zzb();
                java.lang.String zzc2 = zzfwlVar.zzc(str);
                if (zzc2 != null) {
                    org.json.JSONObject zza4 = zzb2.zza(zzh);
                    com.google.android.gms.internal.ads.zzfwe.zzd(zza4, str);
                    try {
                        zza4.put("notVisibleReason", zzc2);
                    } catch (org.json.JSONException e) {
                        com.google.android.gms.internal.ads.zzfwf.zza("Error with setting not visible reason", e);
                    }
                    com.google.android.gms.internal.ads.zzfwe.zze(zza3, zza4);
                }
                com.google.android.gms.internal.ads.zzfwe.zzf(zza3);
                java.util.HashSet hashSet = new java.util.HashSet();
                hashSet.add(str);
                this.zzi.zzb(zza3, hashSet, nanoTime);
            }
        }
        com.google.android.gms.internal.ads.zzfwl zzfwlVar2 = this.zzh;
        if (zzfwlVar2.zza().size() > 0) {
            org.json.JSONObject zza5 = zza2.zza(null);
            zzk(null, zza2, zza5, 1, false);
            com.google.android.gms.internal.ads.zzfwe.zzf(zza5);
            this.zzi.zza(zza5, zzfwlVar2.zza(), nanoTime);
        } else {
            this.zzi.zzc();
        }
        zzfwlVar2.zze();
        long nanoTime2 = java.lang.System.nanoTime() - this.zzj;
        java.util.List<com.google.android.gms.internal.ads.zzfwr> list = this.zzd;
        if (list.size() > 0) {
            for (com.google.android.gms.internal.ads.zzfwr zzfwrVar : list) {
                java.util.concurrent.TimeUnit.NANOSECONDS.toMillis(nanoTime2);
                zzfwrVar.zzb();
                if (zzfwrVar instanceof com.google.android.gms.internal.ads.zzfwq) {
                    ((com.google.android.gms.internal.ads.zzfwq) zzfwrVar).zza();
                }
            }
        }
        com.google.android.gms.internal.ads.zzfvs.zza().zzc();
    }

    final /* synthetic */ com.google.android.gms.internal.ads.zzfwm zzh() {
        return this.zzi;
    }
}
