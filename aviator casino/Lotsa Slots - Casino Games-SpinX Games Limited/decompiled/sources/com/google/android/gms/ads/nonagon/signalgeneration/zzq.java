package com.google.android.gms.ads.nonagon.signalgeneration;

/* compiled from: com.google.android.gms:play-services-ads@@25.2.0 */
/* loaded from: classes3.dex */
public final class zzq {
    private final com.google.android.gms.internal.ads.zzdzq zzh;
    private java.util.Map zzi;
    private final java.util.ArrayDeque zzf = new java.util.ArrayDeque();
    private final java.util.ArrayDeque zzg = new java.util.ArrayDeque();
    private final int zza = ((java.lang.Integer) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(com.google.android.gms.internal.ads.zzbiq.zzhR)).intValue();
    private final long zzb = ((java.lang.Long) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(com.google.android.gms.internal.ads.zzbiq.zzhS)).longValue();
    private final boolean zzc = ((java.lang.Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(com.google.android.gms.internal.ads.zzbiq.zzhW)).booleanValue();
    private final boolean zzd = ((java.lang.Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(com.google.android.gms.internal.ads.zzbiq.zzhV)).booleanValue();
    private final java.util.Map zze = java.util.Collections.synchronizedMap(new com.google.android.gms.ads.nonagon.signalgeneration.zzn(this));

    public zzq(com.google.android.gms.internal.ads.zzdzq zzdzqVar) {
        this.zzh = zzdzqVar;
    }

    private final synchronized void zzi() {
        long currentTimeMillis = com.google.android.gms.ads.internal.zzt.zzk().currentTimeMillis();
        try {
            java.util.Iterator it = this.zze.entrySet().iterator();
            while (it.hasNext()) {
                java.util.Map.Entry entry = (java.util.Map.Entry) it.next();
                if (currentTimeMillis - ((com.google.android.gms.ads.nonagon.signalgeneration.zzo) entry.getValue()).zza.longValue() <= this.zzb) {
                    break;
                }
                this.zzg.add(new android.util.Pair((java.lang.String) entry.getKey(), ((com.google.android.gms.ads.nonagon.signalgeneration.zzo) entry.getValue()).zzb));
                it.remove();
            }
        } catch (java.util.ConcurrentModificationException e) {
            com.google.android.gms.ads.internal.zzt.zzh().zzg(e, "QueryJsonMap.removeExpiredEntries");
        }
    }

    private final synchronized void zzj(final com.google.android.gms.internal.ads.zzdzg zzdzgVar) {
        if (this.zzc) {
            java.util.ArrayDeque arrayDeque = this.zzg;
            final java.util.ArrayDeque clone = arrayDeque.clone();
            arrayDeque.clear();
            java.util.ArrayDeque arrayDeque2 = this.zzf;
            final java.util.ArrayDeque clone2 = arrayDeque2.clone();
            arrayDeque2.clear();
            com.google.android.gms.internal.ads.zzcfr.zza.execute(new java.lang.Runnable() { // from class: com.google.android.gms.ads.nonagon.signalgeneration.zzp
                @Override // java.lang.Runnable
                public final /* synthetic */ void run() {
                    com.google.android.gms.ads.nonagon.signalgeneration.zzq.this.zzf(zzdzgVar, clone, clone2);
                }
            });
        }
    }

    private final void zzk(com.google.android.gms.internal.ads.zzdzg zzdzgVar, java.util.ArrayDeque arrayDeque, java.lang.String str) {
        android.util.Pair pair;
        while (!arrayDeque.isEmpty()) {
            android.util.Pair pair2 = (android.util.Pair) arrayDeque.poll();
            java.util.concurrent.ConcurrentHashMap concurrentHashMap = new java.util.concurrent.ConcurrentHashMap(zzdzgVar.zzc());
            this.zzi = concurrentHashMap;
            concurrentHashMap.put("action", "ev");
            this.zzi.put("e_r", str);
            this.zzi.put("e_id", (java.lang.String) pair2.first);
            if (this.zzd) {
                try {
                    org.json.JSONObject jSONObject = new org.json.JSONObject((java.lang.String) pair2.second);
                    pair = new android.util.Pair(com.google.android.gms.ads.nonagon.signalgeneration.zzv.zzb(jSONObject.getJSONObject("extras").getString("query_info_type")), jSONObject.getString("request_agent"));
                } catch (org.json.JSONException unused) {
                    pair = new android.util.Pair("", "");
                }
                zzl(this.zzi, "e_type", (java.lang.String) pair.first);
                zzl(this.zzi, "e_agent", (java.lang.String) pair.second);
            }
            this.zzh.zzb(this.zzi);
        }
    }

    private static final void zzl(java.util.Map map, java.lang.String str, java.lang.String str2) {
        if (android.text.TextUtils.isEmpty(str2)) {
            return;
        }
        map.put(str, str2);
    }

    public final synchronized void zza(java.lang.String str, java.lang.String str2, com.google.android.gms.internal.ads.zzdzg zzdzgVar) {
        this.zze.put(str, new com.google.android.gms.ads.nonagon.signalgeneration.zzo(java.lang.Long.valueOf(com.google.android.gms.ads.internal.zzt.zzk().currentTimeMillis()), str2, new java.util.HashSet()));
        zzi();
        zzj(zzdzgVar);
    }

    public final synchronized java.lang.String zzb(java.lang.String str, com.google.android.gms.internal.ads.zzdzg zzdzgVar) {
        com.google.android.gms.ads.nonagon.signalgeneration.zzo zzoVar = (com.google.android.gms.ads.nonagon.signalgeneration.zzo) this.zze.get(str);
        zzdzgVar.zzc().put("request_id", str);
        if (zzoVar == null) {
            zzdzgVar.zzc().put("mhit", "false");
            return null;
        }
        zzdzgVar.zzc().put("mhit", "true");
        return zzoVar.zzb;
    }

    public final synchronized void zzc(java.lang.String str) {
        this.zze.remove(str);
    }

    public final synchronized boolean zzd(java.lang.String str, java.lang.String str2) {
        com.google.android.gms.ads.nonagon.signalgeneration.zzo zzoVar = (com.google.android.gms.ads.nonagon.signalgeneration.zzo) this.zze.get(str);
        if (zzoVar != null) {
            if (zzoVar.zzc.contains(str2)) {
                return true;
            }
        }
        return false;
    }

    public final synchronized boolean zze(java.lang.String str, java.lang.String str2, int i) {
        com.google.android.gms.ads.nonagon.signalgeneration.zzo zzoVar = (com.google.android.gms.ads.nonagon.signalgeneration.zzo) this.zze.get(str);
        if (zzoVar == null) {
            return false;
        }
        java.util.Set set = zzoVar.zzc;
        set.add(str2);
        return set.size() < i;
    }

    final /* synthetic */ void zzf(com.google.android.gms.internal.ads.zzdzg zzdzgVar, java.util.ArrayDeque arrayDeque, java.util.ArrayDeque arrayDeque2) {
        zzk(zzdzgVar, arrayDeque, "to");
        zzk(zzdzgVar, arrayDeque2, "of");
    }

    final /* synthetic */ int zzg() {
        return this.zza;
    }

    final /* synthetic */ java.util.ArrayDeque zzh() {
        return this.zzf;
    }
}
