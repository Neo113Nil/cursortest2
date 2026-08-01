package com.google.android.gms.internal.ads;

import android.os.Bundle;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: com.google.android.gms:play-services-ads@@25.4.0 */
/* loaded from: classes9.dex */
public final class zzemv {
    private final String zzc;
    private zzflg zzd = null;
    private zzfld zze = null;
    private com.google.android.gms.ads.internal.client.zzv zzf = null;
    private final Map zzb = Collections.synchronizedMap(new HashMap());
    private final List zza = Collections.synchronizedList(new ArrayList());

    public zzemv(String str) {
        this.zzc = str;
    }

    private final synchronized void zzj(zzfld zzfldVar, int i) {
        Map map = this.zzb;
        String zzl = zzl(zzfldVar);
        if (map.containsKey(zzl)) {
            return;
        }
        Bundle bundle = new Bundle();
        JSONObject jSONObject = zzfldVar.zzv;
        Iterator<String> keys = jSONObject.keys();
        while (keys.hasNext()) {
            String next = keys.next();
            try {
                bundle.putString(next, jSONObject.getString(next));
            } catch (JSONException unused) {
            }
        }
        com.google.android.gms.ads.internal.client.zzv zzvVar = new com.google.android.gms.ads.internal.client.zzv(zzfldVar.zzE, 0L, null, bundle, zzfldVar.zzF, zzfldVar.zzG, zzfldVar.zzH, zzfldVar.zzI);
        try {
            this.zza.add(i, zzvVar);
        } catch (IndexOutOfBoundsException e) {
            com.google.android.gms.ads.internal.zzt.zzh().zzh(e, "AdapterResponseInfoCollector.addAdapterResponseInfoEntryAtLocation");
        }
        this.zzb.put(zzl, zzvVar);
    }

    private final void zzk(zzfld zzfldVar, long j, com.google.android.gms.ads.internal.client.zze zzeVar, boolean z) {
        Map map = this.zzb;
        String zzl = zzl(zzfldVar);
        if (map.containsKey(zzl)) {
            if (this.zze == null) {
                this.zze = zzfldVar;
            }
            com.google.android.gms.ads.internal.client.zzv zzvVar = (com.google.android.gms.ads.internal.client.zzv) map.get(zzl);
            zzvVar.zzb = j;
            zzvVar.zzc = zzeVar;
            if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbjg.zzhP)).booleanValue() && z) {
                this.zzf = zzvVar;
            }
        }
    }

    private static String zzl(zzfld zzfldVar) {
        return ((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbjg.zzeE)).booleanValue() ? zzfldVar.zzap : zzfldVar.zzw;
    }

    public final void zza(zzflg zzflgVar) {
        this.zzd = zzflgVar;
    }

    public final void zzb(zzfld zzfldVar) {
        zzj(zzfldVar, this.zza.size());
    }

    public final synchronized void zzc(String str, List list) {
        Map map = this.zzb;
        if (map.containsKey(str)) {
            com.google.android.gms.ads.internal.client.zzv zzvVar = (com.google.android.gms.ads.internal.client.zzv) map.get(str);
            List list2 = this.zza;
            int indexOf = list2.indexOf(zzvVar);
            try {
                list2.remove(indexOf);
            } catch (IndexOutOfBoundsException e) {
                com.google.android.gms.ads.internal.zzt.zzh().zzh(e, "AdapterResponseInfoCollector.replaceAdapterResponseInfoEntry");
            }
            this.zzb.remove(str);
            Iterator it = list.iterator();
            while (it.hasNext()) {
                zzj((zzfld) it.next(), indexOf);
                indexOf++;
            }
        }
    }

    public final void zzd(zzfld zzfldVar, long j, com.google.android.gms.ads.internal.client.zze zzeVar) {
        zzk(zzfldVar, j, null, true);
    }

    public final void zze(zzfld zzfldVar, long j, com.google.android.gms.ads.internal.client.zze zzeVar) {
        zzk(zzfldVar, j, zzeVar, false);
    }

    public final zzddi zzf() {
        return new zzddi(this.zze, "", this, this.zzd, this.zzc);
    }

    public final com.google.android.gms.ads.internal.client.zzv zzg() {
        return this.zzf;
    }

    public final List zzh() {
        return this.zza;
    }

    public final void zzi(zzfld zzfldVar) {
        Map map = this.zzb;
        Object obj = map.get(zzl(zzfldVar));
        List list = this.zza;
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
