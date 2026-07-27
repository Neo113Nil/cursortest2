package com.google.android.gms.internal.ads;

import java.util.HashSet;
import org.json.JSONObject;

/* compiled from: com.google.android.gms:play-services-ads@@25.4.0 */
/* loaded from: classes9.dex */
public final class zzfxz extends zzfxv {
    public zzfxz(zzfxo zzfxoVar, HashSet hashSet, JSONObject jSONObject, long j) {
        super(zzfxoVar, hashSet, jSONObject, j);
    }

    private final void zzc(String str) {
        zzfwk zza = zzfwk.zza();
        if (zza != null) {
            for (zzfvq zzfvqVar : zza.zze()) {
                if (this.zza.contains(zzfvqVar.zzh())) {
                    zzfvqVar.zzg().zzi(str, this.zzc);
                }
            }
        }
    }

    @Override // android.os.AsyncTask
    protected final /* synthetic */ Object doInBackground(Object[] objArr) {
        return this.zzb.toString();
    }

    @Override // com.google.android.gms.internal.ads.zzfxw, android.os.AsyncTask
    protected final /* synthetic */ void onPostExecute(Object obj) {
        String str = (String) obj;
        zzc(str);
        super.onPostExecute(str);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.android.gms.internal.ads.zzfxw
    /* renamed from: zza */
    public final void onPostExecute(String str) {
        zzc(str);
        super.onPostExecute(str);
    }
}
