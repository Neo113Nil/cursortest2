package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@25.2.0 */
/* loaded from: classes4.dex */
public final class zzelx {
    private final java.lang.String zzc;
    private com.google.android.gms.internal.ads.zzfki zzd = null;
    private com.google.android.gms.internal.ads.zzfkf zze = null;
    private com.google.android.gms.ads.internal.client.zzv zzf = null;
    private final java.util.Map zzb = java.util.Collections.synchronizedMap(new java.util.HashMap());
    private final java.util.List zza = java.util.Collections.synchronizedList(new java.util.ArrayList());

    public zzelx(java.lang.String str) {
        this.zzc = str;
    }

    private final synchronized void zzj(com.google.android.gms.internal.ads.zzfkf zzfkfVar, int i) {
        java.util.Map map = this.zzb;
        java.lang.String zzl = zzl(zzfkfVar);
        if (map.containsKey(zzl)) {
            return;
        }
        android.os.Bundle bundle = new android.os.Bundle();
        org.json.JSONObject jSONObject = zzfkfVar.zzv;
        java.util.Iterator<java.lang.String> keys = jSONObject.keys();
        while (keys.hasNext()) {
            java.lang.String next = keys.next();
            try {
                bundle.putString(next, jSONObject.getString(next));
            } catch (org.json.JSONException unused) {
            }
        }
        com.google.android.gms.ads.internal.client.zzv zzvVar = new com.google.android.gms.ads.internal.client.zzv(zzfkfVar.zzE, 0L, null, bundle, zzfkfVar.zzF, zzfkfVar.zzG, zzfkfVar.zzH, zzfkfVar.zzI);
        try {
            this.zza.add(i, zzvVar);
        } catch (java.lang.IndexOutOfBoundsException e) {
            com.google.android.gms.ads.internal.zzt.zzh().zzg(e, "AdapterResponseInfoCollector.addAdapterResponseInfoEntryAtLocation");
        }
        this.zzb.put(zzl, zzvVar);
    }

    private final void zzk(com.google.android.gms.internal.ads.zzfkf zzfkfVar, long j, com.google.android.gms.ads.internal.client.zze zzeVar, boolean z) {
        java.util.Map map = this.zzb;
        java.lang.String zzl = zzl(zzfkfVar);
        if (map.containsKey(zzl)) {
            if (this.zze == null) {
                this.zze = zzfkfVar;
            }
            com.google.android.gms.ads.internal.client.zzv zzvVar = (com.google.android.gms.ads.internal.client.zzv) map.get(zzl);
            zzvVar.zzb = j;
            zzvVar.zzc = zzeVar;
            if (((java.lang.Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(com.google.android.gms.internal.ads.zzbiq.zzhJ)).booleanValue() && z) {
                this.zzf = zzvVar;
            }
        }
    }

    private static java.lang.String zzl(com.google.android.gms.internal.ads.zzfkf zzfkfVar) {
        return ((java.lang.Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(com.google.android.gms.internal.ads.zzbiq.zzew)).booleanValue() ? zzfkfVar.zzap : zzfkfVar.zzw;
    }

    public final void zza(com.google.android.gms.internal.ads.zzfki zzfkiVar) {
        this.zzd = zzfkiVar;
    }

    public final void zzb(com.google.android.gms.internal.ads.zzfkf zzfkfVar) {
        zzj(zzfkfVar, this.zza.size());
    }

    public final synchronized void zzc(java.lang.String str, java.util.List list) {
        java.util.Map map = this.zzb;
        if (map.containsKey(str)) {
            com.google.android.gms.ads.internal.client.zzv zzvVar = (com.google.android.gms.ads.internal.client.zzv) map.get(str);
            java.util.List list2 = this.zza;
            int indexOf = list2.indexOf(zzvVar);
            try {
                list2.remove(indexOf);
            } catch (java.lang.IndexOutOfBoundsException e) {
                com.google.android.gms.ads.internal.zzt.zzh().zzg(e, "AdapterResponseInfoCollector.replaceAdapterResponseInfoEntry");
            }
            this.zzb.remove(str);
            java.util.Iterator it = list.iterator();
            while (it.hasNext()) {
                zzj((com.google.android.gms.internal.ads.zzfkf) it.next(), indexOf);
                indexOf++;
            }
        }
    }

    public final void zzd(com.google.android.gms.internal.ads.zzfkf zzfkfVar, long j, com.google.android.gms.ads.internal.client.zze zzeVar) {
        zzk(zzfkfVar, j, null, true);
    }

    public final void zze(com.google.android.gms.internal.ads.zzfkf zzfkfVar, long j, com.google.android.gms.ads.internal.client.zze zzeVar) {
        zzk(zzfkfVar, j, zzeVar, false);
    }

    public final com.google.android.gms.internal.ads.zzdck zzf() {
        return new com.google.android.gms.internal.ads.zzdck(this.zze, "", this, this.zzd, this.zzc);
    }

    public final com.google.android.gms.ads.internal.client.zzv zzg() {
        return this.zzf;
    }

    public final java.util.List zzh() {
        return this.zza;
    }

    public final void zzi(com.google.android.gms.internal.ads.zzfkf zzfkfVar) {
        java.util.Map map = this.zzb;
        java.lang.Object obj = map.get(zzl(zzfkfVar));
        java.util.List list = this.zza;
        int indexOf = list.indexOf(obj);
        if (indexOf < 0 || indexOf >= map.size()) {
            indexOf = list.indexOf(this.zzf);
        }
        if (indexOf < 0 || indexOf >= map.size()) {
            return;
        }
        this.zzf = (com.google.android.gms.ads.internal.client.zzv) list.get(indexOf);
        while (true) {
            indexOf++;
            if (indexOf >= list.size()) {
                return;
            }
            com.google.android.gms.ads.internal.client.zzv zzvVar = (com.google.android.gms.ads.internal.client.zzv) list.get(indexOf);
            zzvVar.zzb = 0L;
            zzvVar.zzc = null;
        }
    }
}
