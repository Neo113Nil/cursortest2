package com.google.android.gms.internal.ads;

import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
final class zzbnt implements zzbjo {
    final /* synthetic */ zzbnu zza;
    private final zzbmw zzb;
    private final zzbzf zzc;

    public zzbnt(zzbnu zzbnuVar, zzbmw zzbmwVar, zzbzf zzbzfVar) {
        this.zza = zzbnuVar;
        this.zzb = zzbmwVar;
        this.zzc = zzbzfVar;
    }

    @Override // com.google.android.gms.internal.ads.zzbjo
    public final void zza(String str) {
        try {
            if (str == null) {
                this.zzc.zzd(new zzbnf());
            } else {
                this.zzc.zzd(new zzbnf(str));
            }
        } catch (IllegalStateException unused) {
        } finally {
            this.zzb.zzb();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbjo
    public final void zzb(JSONObject jSONObject) {
        try {
            try {
                this.zzc.zzc(this.zza.zza.zza(jSONObject));
            } catch (IllegalStateException unused) {
            } catch (JSONException e7) {
                this.zzc.zzd(e7);
            }
        } finally {
            this.zzb.zzb();
        }
    }
}
