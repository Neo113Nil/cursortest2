package com.google.android.gms.internal.ads;

import E2.o;
import F2.C0254t;
import android.os.Bundle;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import org.json.JSONException;

/* loaded from: classes.dex */
public final class zzebw {
    private final String zzc;
    private zzfai zzd = null;
    private zzfaf zze = null;
    private com.google.android.gms.ads.internal.client.zzv zzf = null;
    private final Map zzb = Collections.synchronizedMap(new HashMap());
    private final List zza = Collections.synchronizedList(new ArrayList());

    public zzebw(String str) {
        this.zzc = str;
    }

    private static String zzj(zzfaf zzfafVar) {
        return ((Boolean) C0254t.f2723d.f2726c.zzb(zzbby.zzdM)).booleanValue() ? zzfafVar.zzap : zzfafVar.zzw;
    }

    private final synchronized void zzk(zzfaf zzfafVar, int i7) {
        Map map = this.zzb;
        String zzj = zzj(zzfafVar);
        if (map.containsKey(zzj)) {
            return;
        }
        Bundle bundle = new Bundle();
        Iterator<String> keys = zzfafVar.zzv.keys();
        while (keys.hasNext()) {
            String next = keys.next();
            try {
                bundle.putString(next, zzfafVar.zzv.getString(next));
            } catch (JSONException unused) {
            }
        }
        com.google.android.gms.ads.internal.client.zzv zzvVar = new com.google.android.gms.ads.internal.client.zzv(zzfafVar.zzE, 0L, null, bundle, zzfafVar.zzF, zzfafVar.zzG, zzfafVar.zzH, zzfafVar.zzI);
        try {
            this.zza.add(i7, zzvVar);
        } catch (IndexOutOfBoundsException e7) {
            o.f1952C.f1961g.zzw(e7, "AdapterResponseInfoCollector.addAdapterResponseInfoEntryAtLocation");
        }
        this.zzb.put(zzj, zzvVar);
    }

    private final void zzl(zzfaf zzfafVar, long j, com.google.android.gms.ads.internal.client.zze zzeVar, boolean z4) {
        Map map = this.zzb;
        String zzj = zzj(zzfafVar);
        if (map.containsKey(zzj)) {
            if (this.zze == null) {
                this.zze = zzfafVar;
            }
            com.google.android.gms.ads.internal.client.zzv zzvVar = (com.google.android.gms.ads.internal.client.zzv) this.zzb.get(zzj);
            zzvVar.f10785b = j;
            zzvVar.f10786c = zzeVar;
            if (((Boolean) C0254t.f2723d.f2726c.zzb(zzbby.zzgI)).booleanValue() && z4) {
                this.zzf = zzvVar;
            }
        }
    }

    public final com.google.android.gms.ads.internal.client.zzv zza() {
        return this.zzf;
    }

    public final zzcuj zzb() {
        return new zzcuj(this.zze, "", this, this.zzd, this.zzc);
    }

    public final List zzc() {
        return this.zza;
    }

    public final void zzd(zzfaf zzfafVar) {
        zzk(zzfafVar, this.zza.size());
    }

    public final void zze(zzfaf zzfafVar) {
        int indexOf = this.zza.indexOf(this.zzb.get(zzj(zzfafVar)));
        if (indexOf < 0 || indexOf >= this.zzb.size()) {
            indexOf = this.zza.indexOf(this.zzf);
        }
        if (indexOf < 0 || indexOf >= this.zzb.size()) {
            return;
        }
        this.zzf = (com.google.android.gms.ads.internal.client.zzv) this.zza.get(indexOf);
        while (true) {
            indexOf++;
            if (indexOf >= this.zza.size()) {
                return;
            }
            com.google.android.gms.ads.internal.client.zzv zzvVar = (com.google.android.gms.ads.internal.client.zzv) this.zza.get(indexOf);
            zzvVar.f10785b = 0L;
            zzvVar.f10786c = null;
        }
    }

    public final void zzf(zzfaf zzfafVar, long j, com.google.android.gms.ads.internal.client.zze zzeVar) {
        zzl(zzfafVar, j, zzeVar, false);
    }

    public final void zzg(zzfaf zzfafVar, long j, com.google.android.gms.ads.internal.client.zze zzeVar) {
        zzl(zzfafVar, j, null, true);
    }

    public final synchronized void zzh(String str, List list) {
        if (this.zzb.containsKey(str)) {
            int indexOf = this.zza.indexOf((com.google.android.gms.ads.internal.client.zzv) this.zzb.get(str));
            try {
                this.zza.remove(indexOf);
            } catch (IndexOutOfBoundsException e7) {
                o.f1952C.f1961g.zzw(e7, "AdapterResponseInfoCollector.replaceAdapterResponseInfoEntry");
            }
            this.zzb.remove(str);
            Iterator it = list.iterator();
            while (it.hasNext()) {
                zzk((zzfaf) it.next(), indexOf);
                indexOf++;
            }
        }
    }

    public final void zzi(zzfai zzfaiVar) {
        this.zzd = zzfaiVar;
    }
}
