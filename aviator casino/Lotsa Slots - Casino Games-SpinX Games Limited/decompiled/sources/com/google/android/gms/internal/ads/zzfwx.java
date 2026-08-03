package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@25.2.0 */
/* loaded from: classes4.dex */
public final class zzfwx extends com.google.android.gms.internal.ads.zzfwt {
    public zzfwx(com.google.android.gms.internal.ads.zzfwm zzfwmVar, java.util.HashSet hashSet, org.json.JSONObject jSONObject, long j) {
        super(zzfwmVar, hashSet, jSONObject, j);
    }

    private final void zzc(java.lang.String str) {
        com.google.android.gms.internal.ads.zzfvi zza = com.google.android.gms.internal.ads.zzfvi.zza();
        if (zza != null) {
            for (com.google.android.gms.internal.ads.zzfuo zzfuoVar : zza.zze()) {
                if (this.zza.contains(zzfuoVar.zzh())) {
                    zzfuoVar.zzg().zzi(str, this.zzc);
                }
            }
        }
    }

    @Override // android.os.AsyncTask
    protected final /* synthetic */ java.lang.Object doInBackground(java.lang.Object[] objArr) {
        return this.zzb.toString();
    }

    @Override // com.google.android.gms.internal.ads.zzfwu, android.os.AsyncTask
    protected final /* synthetic */ void onPostExecute(java.lang.Object obj) {
        java.lang.String str = (java.lang.String) obj;
        zzc(str);
        super.onPostExecute(str);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.android.gms.internal.ads.zzfwu
    /* renamed from: zza */
    public final void onPostExecute(java.lang.String str) {
        zzc(str);
        super.onPostExecute(str);
    }
}
