package com.google.android.gms.internal.ads;

import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes.dex */
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
        } catch (Throwable th) {
            this.zzb.zzb();
            throw th;
        }
        this.zzb.zzb();
    }

    @Override // com.google.android.gms.internal.ads.zzbjo
    public final void zzb(JSONObject jSONObject) {
        zzbni zzbniVar;
        try {
            try {
                zzbzf zzbzfVar = this.zzc;
                zzbniVar = this.zza.zza;
                zzbzfVar.zzc(zzbniVar.zza(jSONObject));
            } catch (IllegalStateException unused) {
            } catch (JSONException e7) {
                this.zzc.zzd(e7);
            }
        } finally {
            this.zzb.zzb();
        }
    }
}
