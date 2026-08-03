package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@25.2.0 */
/* loaded from: classes4.dex */
public final class zzfwy extends com.google.android.gms.internal.ads.zzfwt {
    public zzfwy(com.google.android.gms.internal.ads.zzfwm zzfwmVar, java.util.HashSet hashSet, org.json.JSONObject jSONObject, long j) {
        super(zzfwmVar, hashSet, jSONObject, j);
    }

    @Override // android.os.AsyncTask
    protected final /* bridge */ /* synthetic */ java.lang.Object doInBackground(java.lang.Object[] objArr) {
        com.google.android.gms.internal.ads.zzfwm zzfwmVar = this.zzd;
        org.json.JSONObject jSONObject = this.zzb;
        if (com.google.android.gms.internal.ads.zzfwe.zzg(jSONObject, zzfwmVar.zzd())) {
            return null;
        }
        zzfwmVar.zze(jSONObject);
        return jSONObject.toString();
    }

    @Override // com.google.android.gms.internal.ads.zzfwu, android.os.AsyncTask
    protected final /* bridge */ /* synthetic */ void onPostExecute(java.lang.Object obj) {
        onPostExecute((java.lang.String) obj);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.android.gms.internal.ads.zzfwu
    /* renamed from: zza */
    public final void onPostExecute(java.lang.String str) {
        com.google.android.gms.internal.ads.zzfvi zza;
        if (!android.text.TextUtils.isEmpty(str) && (zza = com.google.android.gms.internal.ads.zzfvi.zza()) != null) {
            for (com.google.android.gms.internal.ads.zzfuo zzfuoVar : zza.zze()) {
                if (this.zza.contains(zzfuoVar.zzh())) {
                    zzfuoVar.zzg().zzh(str, this.zzc);
                }
            }
        }
        super.onPostExecute(str);
    }
}
