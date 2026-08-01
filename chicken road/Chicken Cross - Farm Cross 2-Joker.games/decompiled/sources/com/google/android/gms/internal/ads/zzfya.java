package com.google.android.gms.internal.ads;

import android.text.TextUtils;
import java.util.HashSet;
import org.json.JSONObject;

/* compiled from: com.google.android.gms:play-services-ads@@25.4.0 */
/* loaded from: classes9.dex */
public final class zzfya extends zzfxv {
    public zzfya(zzfxo zzfxoVar, HashSet hashSet, JSONObject jSONObject, long j) {
        super(zzfxoVar, hashSet, jSONObject, j);
    }

    @Override // android.os.AsyncTask
    protected final /* bridge */ /* synthetic */ Object doInBackground(Object[] objArr) {
        zzfxo zzfxoVar = this.zzd;
        JSONObject jSONObject = this.zzb;
        if (zzfxg.zzg(jSONObject, zzfxoVar.zzd())) {
            return null;
        }
        zzfxoVar.zze(jSONObject);
        return jSONObject.toString();
    }

    @Override // com.google.android.gms.internal.ads.zzfxw, android.os.AsyncTask
    protected final /* bridge */ /* synthetic */ void onPostExecute(Object obj) {
        onPostExecute((String) obj);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.android.gms.internal.ads.zzfxw
    /* renamed from: zza */
    public final void onPostExecute(String str) {
        zzfwk zza;
        if (!TextUtils.isEmpty(str) && (zza = zzfwk.zza()) != null) {
            for (zzfvq zzfvqVar : zza.zze()) {
                if (this.zza.contains(zzfvqVar.zzh())) {
                    zzfvqVar.zzg().zzh(str, this.zzc);
                }
            }
        }
        super.onPostExecute(str);
    }
}
