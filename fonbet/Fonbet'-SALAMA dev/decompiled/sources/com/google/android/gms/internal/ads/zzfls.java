package com.google.android.gms.internal.ads;

import android.text.TextUtils;
import java.util.HashSet;
import org.json.JSONObject;

/* loaded from: classes.dex */
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
    /* renamed from: zza */
    public final void onPostExecute(String str) {
        zzfkc zza;
        if (!TextUtils.isEmpty(str) && (zza = zzfkc.zza()) != null) {
            for (zzfjl zzfjlVar : zza.zzc()) {
                if (((zzfln) this).zza.contains(zzfjlVar.zzh())) {
                    zzfjlVar.zzg().zzh(str, this.zzc);
                }
            }
        }
        super.onPostExecute(str);
    }
}
