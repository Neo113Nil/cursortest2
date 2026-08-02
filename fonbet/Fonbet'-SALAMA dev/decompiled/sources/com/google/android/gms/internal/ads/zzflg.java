package com.google.android.gms.internal.ads;

import java.util.HashSet;
import org.json.JSONObject;

/* loaded from: classes.dex */
public final class zzflg {
    private JSONObject zza;
    private final zzflp zzb;

    public zzflg(zzflp zzflpVar) {
        this.zzb = zzflpVar;
    }

    public final JSONObject zza() {
        return this.zza;
    }

    public final void zzb() {
        this.zzb.zzb(new zzflq(this));
    }

    public final void zzc(JSONObject jSONObject, HashSet hashSet, long j) {
        this.zzb.zzb(new zzflr(this, hashSet, jSONObject, j));
    }

    public final void zzd(JSONObject jSONObject, HashSet hashSet, long j) {
        this.zzb.zzb(new zzfls(this, hashSet, jSONObject, j));
    }

    public final void zze(JSONObject jSONObject) {
        this.zza = jSONObject;
    }
}
