package com.google.android.gms.internal.ads;

import android.text.TextUtils;
import java.util.HashSet;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
public final class zzfls extends zzfln {
    public zzfls(zzflg zzflgVar, HashSet hashSet, JSONObject jSONObject, long j) {
        super(zzflgVar, hashSet, jSONObject, j);
    }

    @Override // android.os.AsyncTask
    public final /* bridge */ /* synthetic */ Object doInBackground(Object[] objArr) {
        if (zzfky.zzg(this.zzb, this.zzd.zza())) {
            return null;
        }
        this.zzd.zze(this.zzb);
        return this.zzb.toString();
    }

    @Override // com.google.android.gms.internal.ads.zzflo, android.os.AsyncTask
    /* JADX INFO: renamed from: zza */
    public final void onPostExecute(String str) {
        zzfkc zzfkcVarZza;
        if (!TextUtils.isEmpty(str) && (zzfkcVarZza = zzfkc.zza()) != null) {
            for (zzfjl zzfjlVar : zzfkcVarZza.zzc()) {
                if (((zzfln) this).zza.contains(zzfjlVar.zzh())) {
                    zzfjlVar.zzg().zzh(str, this.zzc);
                }
            }
        }
        super.onPostExecute(str);
    }
}
