package com.google.android.gms.internal.ads;

import I2.J;
import java.util.AbstractMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import org.json.JSONObject;

/* loaded from: classes.dex */
public final class zzbne implements zzblw, zzbnd {
    private final zzbnd zza;
    private final HashSet zzb = new HashSet();

    public zzbne(zzbnd zzbndVar) {
        this.zza = zzbndVar;
    }

    @Override // com.google.android.gms.internal.ads.zzblw, com.google.android.gms.internal.ads.zzbmg
    public final void zza(String str) {
        this.zza.zza(str);
    }

    @Override // com.google.android.gms.internal.ads.zzblw, com.google.android.gms.internal.ads.zzbmg
    public final /* synthetic */ void zzb(String str, String str2) {
        zzblv.zzc(this, str, str2);
    }

    public final void zzc() {
        Iterator it = this.zzb.iterator();
        while (it.hasNext()) {
            AbstractMap.SimpleEntry simpleEntry = (AbstractMap.SimpleEntry) it.next();
            J.k("Unregistering eventhandler: ".concat(String.valueOf(((zzbiz) simpleEntry.getValue()).toString())));
            this.zza.zzr((String) simpleEntry.getKey(), (zzbiz) simpleEntry.getValue());
        }
        this.zzb.clear();
    }

    @Override // com.google.android.gms.internal.ads.zzblu
    public final /* synthetic */ void zzd(String str, Map map) {
        zzblv.zza(this, str, map);
    }

    @Override // com.google.android.gms.internal.ads.zzblw, com.google.android.gms.internal.ads.zzblu
    public final /* synthetic */ void zze(String str, JSONObject jSONObject) {
        zzblv.zzb(this, str, jSONObject);
    }

    @Override // com.google.android.gms.internal.ads.zzbmg
    public final /* synthetic */ void zzp(String str, JSONObject jSONObject) {
        zzblv.zzd(this, str, jSONObject);
    }

    @Override // com.google.android.gms.internal.ads.zzbnd
    public final void zzq(String str, zzbiz zzbizVar) {
        this.zza.zzq(str, zzbizVar);
        this.zzb.add(new AbstractMap.SimpleEntry(str, zzbizVar));
    }

    @Override // com.google.android.gms.internal.ads.zzbnd
    public final void zzr(String str, zzbiz zzbizVar) {
        this.zza.zzr(str, zzbizVar);
        this.zzb.remove(new AbstractMap.SimpleEntry(str, zzbizVar));
    }
}
