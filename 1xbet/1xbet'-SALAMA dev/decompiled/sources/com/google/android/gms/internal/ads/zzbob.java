package com.google.android.gms.internal.ads;

import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
final class zzbob implements zzbjo {
    private final zzbzf zza;

    public zzbob(zzboc zzbocVar, zzbzf zzbzfVar) {
        this.zza = zzbzfVar;
    }

    @Override // com.google.android.gms.internal.ads.zzbjo
    public final void zza(String str) {
        try {
            if (str == null) {
                this.zza.zzd(new zzbnf());
            } else {
                this.zza.zzd(new zzbnf(str));
            }
        } catch (IllegalStateException unused) {
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbjo
    public final void zzb(JSONObject jSONObject) {
        try {
            this.zza.zzc(jSONObject);
        } catch (IllegalStateException unused) {
        } catch (JSONException e7) {
            this.zza.zzd(e7);
        }
    }
}
