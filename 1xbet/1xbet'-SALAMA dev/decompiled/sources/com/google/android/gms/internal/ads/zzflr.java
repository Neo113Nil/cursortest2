package com.google.android.gms.internal.ads;

import java.util.HashSet;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
public final class zzflr extends zzfln {
    public zzflr(zzflg zzflgVar, HashSet hashSet, JSONObject jSONObject, long j) {
        super(zzflgVar, hashSet, jSONObject, j);
    }

    private final void zzc(String str) {
        zzfkc zzfkcVarZza = zzfkc.zza();
        if (zzfkcVarZza != null) {
            for (zzfjl zzfjlVar : zzfkcVarZza.zzc()) {
                if (((zzfln) this).zza.contains(zzfjlVar.zzh())) {
                    zzfjlVar.zzg().zzd(str, this.zzc);
                }
            }
        }
    }

    @Override // android.os.AsyncTask
    public final /* synthetic */ Object doInBackground(Object[] objArr) {
        return this.zzb.toString();
    }

    @Override // com.google.android.gms.internal.ads.zzflo, android.os.AsyncTask
    public final /* synthetic */ void onPostExecute(Object obj) {
        String str = (String) obj;
        zzc(str);
        super.onPostExecute(str);
    }

    @Override // com.google.android.gms.internal.ads.zzflo
    /* JADX INFO: renamed from: zza */
    public final void onPostExecute(String str) {
        zzc(str);
        super.onPostExecute(str);
    }
}
