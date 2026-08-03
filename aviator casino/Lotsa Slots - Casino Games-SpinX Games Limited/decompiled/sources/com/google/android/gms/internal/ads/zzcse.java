package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@25.2.0 */
/* loaded from: classes4.dex */
public final class zzcse implements com.google.android.gms.internal.ads.zzcru {
    private final com.google.android.gms.internal.ads.zzecr zza;

    zzcse(com.google.android.gms.internal.ads.zzecr zzecrVar) {
        this.zza = zzecrVar;
    }

    @Override // com.google.android.gms.internal.ads.zzcru
    public final void zza(org.json.JSONObject jSONObject) {
        if (((java.lang.Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(com.google.android.gms.internal.ads.zzbiq.zzkE)).booleanValue()) {
            this.zza.zzp(jSONObject);
        }
    }
}
