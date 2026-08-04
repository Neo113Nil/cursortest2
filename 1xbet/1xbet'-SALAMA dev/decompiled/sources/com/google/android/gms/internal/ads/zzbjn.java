package com.google.android.gms.internal.ads;

import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
final class zzbjn implements zzbjo {
    final /* synthetic */ zzbzf zza;

    public zzbjn(zzbjp zzbjpVar, zzbzf zzbzfVar) {
        this.zza = zzbzfVar;
    }

    @Override // com.google.android.gms.internal.ads.zzbjo
    public final void zza(String str) {
        this.zza.zzd(new zzbnf(str));
    }

    @Override // com.google.android.gms.internal.ads.zzbjo
    public final void zzb(JSONObject jSONObject) {
        this.zza.zzc(jSONObject);
    }
}
